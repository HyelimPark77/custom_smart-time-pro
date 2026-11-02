package com.sma.smartv3.biz.voice.p244ai;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.NonNull;
import com.blankj.utilcode.util.Utils;
import com.sma.smartv3.biz.voice.p244ai.PcmPlayer;

/* JADX INFO: loaded from: classes18.dex */
public class PcmPlayer {
    private static final int CMD_WRITE = 1;
    private static final int CMD_WRITE32 = 2;
    private static final String TAG = "PcmPlayer";
    private AudioTrack mAudioTrack;
    private AudioFocusRequest mFocusRequest;
    private MyHandler mHandler;
    private OnListener mOnListener;
    private HandlerThread mThread;
    private int mBufferSize = 0;
    private boolean mAudioFocusGranted = false;
    private boolean isPlayingFromWrite = false;
    private Handler mTimeoutHandler = new Handler(Looper.getMainLooper());
    private Runnable mWriteTimeoutRunnable = new Runnable() { // from class: com.android.mltcode.paycertificationapi.dq1
        @Override // java.lang.Runnable
        public final void run() {
            this.f6246IO.handleWriteTimeout();
        }
    };
    private int mPlayPosition = 0;
    private final AudioManager.OnAudioFocusChangeListener mAudioFocusListener = new AudioManager.OnAudioFocusChangeListener() { // from class: com.android.mltcode.paycertificationapi.eq1
        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(int i) {
            PcmPlayer.OXO1(this.f6465IO, i);
        }
    };
    private AudioManager mAudioManager = (AudioManager) Utils.getApp().getSystemService("audio");

    public class MyHandler extends Handler {
        public MyHandler(Looper looper) {
            super(looper);
        }

        private void handleWrite32Command(float[] data) {
            if (PcmPlayer.this.mAudioTrack == null || PcmPlayer.this.mAudioTrack.getPlayState() != 3) {
                return;
            }
            int i = 0;
            while (i < data.length) {
                int iMin = Math.min(PcmPlayer.this.mBufferSize / 4, data.length - i);
                PcmPlayer.this.mAudioTrack.write(data, i, iMin, 0);
                i += iMin;
            }
        }

        private void handleWriteCommand(byte[] data) {
            if (PcmPlayer.this.mAudioTrack == null || PcmPlayer.this.mAudioTrack.getPlayState() != 3) {
                return;
            }
            int i = 0;
            while (i < data.length) {
                int iMin = Math.min(PcmPlayer.this.mBufferSize, data.length - i);
                PcmPlayer.this.mAudioTrack.write(data, i, iMin);
                i += iMin;
            }
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message msg) {
            try {
                int i = msg.what;
                if (i == 1) {
                    handleWriteCommand((byte[]) msg.obj);
                    return;
                }
                if (i == 2) {
                    handleWrite32Command((float[]) msg.obj);
                    return;
                }
                Log.e(PcmPlayer.TAG, "Unsupported command: " + msg.what);
            } catch (Exception e) {
                Log.e(PcmPlayer.TAG, "Error handling message", e);
            }
        }
    }

    public interface OnListener {
        void onPlayStateChanged(PlayState state);
    }

    public enum PlayState {
        stopped,
        playing,
        paused
    }

    public PcmPlayer(OnListener listener) {
        this.mOnListener = listener;
        HandlerThread handlerThread = new HandlerThread("pcmplayer");
        this.mThread = handlerThread;
        handlerThread.start();
        this.mHandler = new MyHandler(this.mThread.getLooper());
    }

    public static /* synthetic */ void OXO1(PcmPlayer pcmPlayer, int i) {
        pcmPlayer.getClass();
        if (i == -3) {
            Log.d(TAG, "Audio focus lost - should duck");
            AudioTrack audioTrack = pcmPlayer.mAudioTrack;
            if (audioTrack != null) {
                audioTrack.setVolume(0.2f);
                return;
            }
            return;
        }
        if (i == -2) {
            Log.d(TAG, "Audio focus lost temporarily");
            pcmPlayer.pause();
            return;
        }
        if (i == -1) {
            Log.d(TAG, "Audio focus lost permanently");
            pcmPlayer.stop();
            pcmPlayer.abandonAudioFocus();
        } else {
            if (i != 1) {
                return;
            }
            Log.d(TAG, "Audio focus gained");
            AudioTrack audioTrack2 = pcmPlayer.mAudioTrack;
            if (audioTrack2 != null) {
                audioTrack2.setVolume(1.0f);
                pcmPlayer.play();
            }
        }
    }

    private void abandonAudioFocus() {
        if (this.mAudioFocusGranted) {
            AudioFocusRequest audioFocusRequest = this.mFocusRequest;
            if (audioFocusRequest != null) {
                this.mAudioManager.abandonAudioFocusRequest(audioFocusRequest);
            } else {
                this.mAudioManager.abandonAudioFocus(this.mAudioFocusListener);
            }
            this.mAudioFocusGranted = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleWriteTimeout() {
        if (this.isPlayingFromWrite && isPlayingFinished().booleanValue()) {
            stop();
            this.isPlayingFromWrite = false;
        }
    }

    private Boolean isPlayingFinished() {
        boolean z;
        int playbackHeadPosition = this.mAudioTrack.getPlaybackHeadPosition();
        if (this.mPlayPosition != playbackHeadPosition) {
            this.mPlayPosition = playbackHeadPosition;
            this.mTimeoutHandler.removeCallbacks(this.mWriteTimeoutRunnable);
            this.mTimeoutHandler.postDelayed(this.mWriteTimeoutRunnable, 1000L);
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    private void maybeStartPlayAndResetTimeout() {
        if (!this.isPlayingFromWrite) {
            play();
            this.isPlayingFromWrite = true;
        }
        this.mTimeoutHandler.removeCallbacks(this.mWriteTimeoutRunnable);
        this.mTimeoutHandler.postDelayed(this.mWriteTimeoutRunnable, 1500L);
    }

    private boolean requestAudioFocus() {
        if (this.mAudioFocusGranted) {
            return true;
        }
        AudioFocusRequest audioFocusRequestBuild = new AudioFocusRequest.Builder(1).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build()).setAcceptsDelayedFocusGain(true).setOnAudioFocusChangeListener(this.mAudioFocusListener).build();
        this.mFocusRequest = audioFocusRequestBuild;
        boolean z = this.mAudioManager.requestAudioFocus(audioFocusRequestBuild) == 1;
        this.mAudioFocusGranted = z;
        return z;
    }

    public int getBufferSize() {
        return this.mBufferSize;
    }

    public int getFormat() {
        AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack != null) {
            return audioTrack.getAudioFormat();
        }
        return 0;
    }

    public int getPlayState() {
        AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack == null) {
            return PlayState.stopped.ordinal();
        }
        int playState = audioTrack.getPlayState();
        if (playState != 2) {
            return playState != 3 ? PlayState.stopped.ordinal() : PlayState.playing.ordinal();
        }
        return PlayState.paused.ordinal();
    }

    public void init(final int channelConfig, final int sampleRate, final int format) {
        this.mBufferSize = AudioTrack.getMinBufferSize(sampleRate, channelConfig, format);
        this.mAudioTrack = new AudioTrack(new AudioAttributes.Builder().setUsage(1).setContentType(2).build(), new AudioFormat.Builder().setChannelMask(channelConfig).setEncoding(format).setSampleRate(sampleRate).build(), this.mBufferSize, 1, 0);
        Log.d(TAG, "init() channel:" + channelConfig + ", sampleRate:" + sampleRate + ", format:" + format);
    }

    public void pause() {
        AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack != null) {
            audioTrack.pause();
            this.mOnListener.onPlayStateChanged(PlayState.paused);
        }
    }

    public void play() {
        AudioTrack audioTrack;
        if (!requestAudioFocus() || (audioTrack = this.mAudioTrack) == null) {
            return;
        }
        audioTrack.play();
        this.mOnListener.onPlayStateChanged(PlayState.playing);
    }

    public void release() {
        this.mTimeoutHandler.removeCallbacks(this.mWriteTimeoutRunnable);
        stop();
        AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack != null) {
            audioTrack.release();
            this.mAudioTrack = null;
        }
        this.mThread.quitSafely();
    }

    public void setVolume(double gain) {
        AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack != null) {
            audioTrack.setVolume((float) gain);
        }
    }

    public void stop() {
        AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack != null) {
            audioTrack.stop();
            this.mOnListener.onPlayStateChanged(PlayState.stopped);
        }
        abandonAudioFocus();
        this.mPlayPosition = 0;
    }

    public void write(byte[] data) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        messageObtain.obj = data;
        this.mHandler.sendMessage(messageObtain);
        maybeStartPlayAndResetTimeout();
    }

    public void write(float[] data) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 2;
        messageObtain.obj = data;
        this.mHandler.sendMessage(messageObtain);
        maybeStartPlayAndResetTimeout();
    }
}
