package com.sma.smartv3.biz.voice.ai;

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
import com.android.mltcode.paycertificationapi.dq1;
import com.android.mltcode.paycertificationapi.eq1;
import com.blankj.utilcode.util.Utils;
import com.ironsource.C2985d4;

/* JADX INFO: loaded from: classes18.dex */
public class PcmPlayer {
    private static final int CMD_WRITE = 1;
    private static final int CMD_WRITE32 = 2;
    private static final String TAG = "PcmPlayer";
    private boolean isPlayingFromWrite;
    private boolean mAudioFocusGranted;
    private final AudioManager.OnAudioFocusChangeListener mAudioFocusListener;
    private AudioManager mAudioManager;
    private AudioTrack mAudioTrack;
    private int mBufferSize;
    private AudioFocusRequest mFocusRequest;
    private MyHandler mHandler;
    private OnListener mOnListener;
    private int mPlayPosition;
    private HandlerThread mThread;
    private Handler mTimeoutHandler;
    private Runnable mWriteTimeoutRunnable;

    public class MyHandler extends Handler {
        final /* synthetic */ PcmPlayer this$0;

        public MyHandler(final PcmPlayer this$0, Looper looper) {
            this.this$0 = this$0;
            super(looper);
        }

        private void handleWrite32Command(float[] data) {
            if (PcmPlayer.iO(this.this$0) != null) goto L5;
            return;
        L5:
            if (PcmPlayer.iO(this.this$0).getPlayState() != 3) goto L13;
            int r1 = 0;
        L9:
            if (r1 >= data.length) goto L14;
            int r2 = Math.min(PcmPlayer.XO0O10(this.this$0) / 4, data.length - r1);
            PcmPlayer.iO(this.this$0).write(data, r1, r2, 0);
            r1 = r1 + r2;
            goto L9
        L14:
            return;
        }

        private void handleWriteCommand(byte[] data) {
            if (PcmPlayer.iO(this.this$0) != null) goto L5;
            return;
        L5:
            if (PcmPlayer.iO(this.this$0).getPlayState() != 3) goto L13;
            int r0 = 0;
        L9:
            if (r0 >= data.length) goto L14;
            int r1 = Math.min(PcmPlayer.XO0O10(this.this$0), data.length - r0);
            PcmPlayer.iO(this.this$0).write(data, r0, r1);
            r0 = r0 + r1;
            goto L9
        L14:
            return;
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message msg) {
            int r1 = msg.what;     // Catch: Exception -> L9
            if (r1 != 1) goto L6;
            handleWriteCommand((byte[]) msg.obj);     // Catch: Exception -> L9
            return;
        L6:
            if (r1 == 2) goto L11;
            Log.e(PcmPlayer.TAG, "Unsupported command: " + msg.what);     // Catch: Exception -> L9
            return;
        L11:
            handleWrite32Command((float[]) msg.obj);     // Catch: Exception -> L9
            return;
        L9:
            e = move-exception;
            Log.e(PcmPlayer.TAG, "Error handling message", e);
        }
    }

    public interface OnListener {
        void onPlayStateChanged(PlayState state);
    }

    public static final enum PlayState extends Enum<PlayState> {
        private static final /* synthetic */ PlayState[] $VALUES = null;
        public static final PlayState paused = null;
        public static final PlayState playing = null;
        public static final PlayState stopped = null;

        private static /* synthetic */ PlayState[] $values() {
            return new PlayState[]{stopped, playing, paused};
        }

        static {
            stopped = new PlayState(C2985d4.i.h0, 0);
            playing = new PlayState(C2985d4.i.f0, 1);
            paused = new PlayState(C2985d4.i.e0, 2);
            $VALUES = $values();
        }

        private PlayState(String $enum$name, int $enum$ordinal) {
            super($enum$name, $enum$ordinal);
        }

        public static PlayState valueOf(String name) {
            return (PlayState) Enum.valueOf(PlayState.class, name);
        }

        public static PlayState[] values() {
            return (PlayState[]) $VALUES.clone();
        }
    }

    public PcmPlayer(OnListener listener) {
        this.mBufferSize = 0;
        this.mAudioFocusGranted = false;
        this.isPlayingFromWrite = false;
        this.mTimeoutHandler = new Handler(Looper.getMainLooper());
        this.mWriteTimeoutRunnable = new dq1(this);
        this.mPlayPosition = 0;
        this.mAudioFocusListener = new eq1(this);
        this.mOnListener = listener;
        this.mAudioManager = (AudioManager) Utils.getApp().getSystemService("audio");
        HandlerThread r4 = new HandlerThread("pcmplayer");
        this.mThread = r4;
        r4.start();
        this.mHandler = new MyHandler(this, this.mThread.getLooper());
    }

    public static /* synthetic */ void OXO1(PcmPlayer r2, int r3) {
        r2.getClass();
        if (r3 != (-3)) goto L5;
        Log.d(TAG, "Audio focus lost - should duck");
        AudioTrack r4 = r2.mAudioTrack;
        if (r4 == null) goto L24;
        r4.setVolume(0.2f);
        return;
    L24:
        return;
    L5:
        if (r3 != (-2)) goto L7;
        Log.d(TAG, "Audio focus lost temporarily");
        r2.pause();
        return;
    L7:
        if (r3 != (-1)) goto L9;
        Log.d(TAG, "Audio focus lost permanently");
        r2.stop();
        r2.abandonAudioFocus();
        return;
    L9:
        if (r3 != 1) goto L25;
        Log.d(TAG, "Audio focus gained");
        AudioTrack r5 = r2.mAudioTrack;
        if (r5 == null) goto L23;
        r5.setVolume(1.0f);
        r2.play();
        return;
    L23:
        return;
    }

    public static /* synthetic */ void XIi00iiXO(PcmPlayer r0) {
        r0.handleWriteTimeout();
    }

    public static /* bridge */ /* synthetic */ int XO0O10(PcmPlayer r0) {
        return r0.mBufferSize;
    }

    private void abandonAudioFocus() {
        if (this.mAudioFocusGranted == true) goto L5;
        return;
    L5:
        AudioFocusRequest r0 = this.mFocusRequest;
        if (r0 == null) goto L8;
        this.mAudioManager.abandonAudioFocusRequest(r0);
    L9:
        this.mAudioFocusGranted = false;
        return;
    L8:
        this.mAudioManager.abandonAudioFocus(this.mAudioFocusListener);
        goto L9
    }

    private void handleWriteTimeout() {
        if (this.isPlayingFromWrite == true) goto L5;
        return;
    L5:
        if (isPlayingFinished().booleanValue() == false) goto L9;
        stop();
        this.isPlayingFromWrite = false;
        return;
    }

    public static /* bridge */ /* synthetic */ AudioTrack iO(PcmPlayer r0) {
        return r0.mAudioTrack;
    }

    private Boolean isPlayingFinished() {
        int r0 = this.mAudioTrack.getPlaybackHeadPosition();
        if (this.mPlayPosition == r0) goto L5;
        this.mPlayPosition = r0;
        this.mTimeoutHandler.removeCallbacks(this.mWriteTimeoutRunnable);
        this.mTimeoutHandler.postDelayed(this.mWriteTimeoutRunnable, 1000);
        boolean r1 = false;
    L7:
        return Boolean.valueOf(r1);
    L5:
        r1 = true;
        goto L7
    }

    private void maybeStartPlayAndResetTimeout() {
        if (this.isPlayingFromWrite == true) goto L5;
        play();
        this.isPlayingFromWrite = true;
    L5:
        this.mTimeoutHandler.removeCallbacks(this.mWriteTimeoutRunnable);
        this.mTimeoutHandler.postDelayed(this.mWriteTimeoutRunnable, 1500);
    }

    private boolean requestAudioFocus() {
        boolean r1 = true;
        if (this.mAudioFocusGranted == false) goto L5;
        return true;
    L5:
        AudioFocusRequest r0 = new AudioFocusRequest.Builder(1).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build()).setAcceptsDelayedFocusGain(true).setOnAudioFocusChangeListener(this.mAudioFocusListener).build();
        this.mFocusRequest = r0;
        if (this.mAudioManager.requestAudioFocus(r0) == 1) goto L9;
        r1 = false;
    L9:
        this.mAudioFocusGranted = r1;
        return r1;
    }

    public int getBufferSize() {
        return this.mBufferSize;
    }

    public int getFormat() {
        AudioTrack r0 = this.mAudioTrack;
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getAudioFormat();
    }

    public int getPlayState() {
        AudioTrack r0 = this.mAudioTrack;
        if (r0 == null) goto L5;
        int r1 = r0.getPlayState();
        if (r1 == 2) goto L15;
        if (r1 == 3) goto L13;
        return PlayState.stopped.ordinal();
    L13:
        return PlayState.playing.ordinal();
    L15:
        return PlayState.paused.ordinal();
    L5:
        return PlayState.stopped.ordinal();
    }

    public void init(final int channelConfig, final int sampleRate, final int format) {
        this.mBufferSize = AudioTrack.getMinBufferSize(sampleRate, channelConfig, format);
        this.mAudioTrack = new AudioTrack(new AudioAttributes.Builder().setUsage(1).setContentType(2).build(), new AudioFormat.Builder().setChannelMask(channelConfig).setEncoding(format).setSampleRate(sampleRate).build(), this.mBufferSize, 1, 0);
        Log.d(TAG, "init() channel:" + channelConfig + ", sampleRate:" + sampleRate + ", format:" + format);
    }

    public void pause() {
        AudioTrack r0 = this.mAudioTrack;
        if (r0 == null) goto L6;
        r0.pause();
        this.mOnListener.onPlayStateChanged(PlayState.paused);
        return;
    }

    public void play() {
        if (requestAudioFocus() == false) goto L8;
        AudioTrack r0 = this.mAudioTrack;
        if (r0 == null) goto L9;
        r0.play();
        this.mOnListener.onPlayStateChanged(PlayState.playing);
        return;
    L9:
        return;
    }

    public void release() {
        this.mTimeoutHandler.removeCallbacks(this.mWriteTimeoutRunnable);
        stop();
        AudioTrack r0 = this.mAudioTrack;
        if (r0 == null) goto L5;
        r0.release();
        this.mAudioTrack = null;
    L5:
        this.mThread.quitSafely();
    }

    public void setVolume(double gain) {
        AudioTrack r0 = this.mAudioTrack;
        if (r0 == null) goto L6;
        r0.setVolume((float) gain);
        return;
    }

    public void stop() {
        AudioTrack r0 = this.mAudioTrack;
        if (r0 == null) goto L5;
        r0.stop();
        this.mOnListener.onPlayStateChanged(PlayState.stopped);
    L5:
        abandonAudioFocus();
        this.mPlayPosition = 0;
    }

    public void write(byte[] data) {
        Message r0 = Message.obtain();
        r0.what = 1;
        r0.obj = data;
        this.mHandler.sendMessage(r0);
        maybeStartPlayAndResetTimeout();
    }

    public void write(float[] data) {
        Message r0 = Message.obtain();
        r0.what = 2;
        r0.obj = data;
        this.mHandler.sendMessage(r0);
        maybeStartPlayAndResetTimeout();
    }
}
