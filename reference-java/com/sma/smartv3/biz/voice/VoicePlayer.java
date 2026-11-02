package com.sma.smartv3.biz.voice;

import android.media.MediaPlayer;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.LogUtils;
import com.sma.smartv3.biz.voice.VoicePlayer;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class VoicePlayer {

    @aa1
    public static final VoicePlayer INSTANCE = new VoicePlayer();

    @aa1
    private static final String TAG = "VoicePlayer";

    @tb1
    private static MediaPlayer mMediaPlayer;

    private VoicePlayer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void play$default(VoicePlayer voicePlayer, String str, Function1 function1, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            function1 = null;
        }
        voicePlayer.play(str, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void play$lambda$0(Function1 function1, MediaPlayer mediaPlayer) {
        if (function1 != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean play$lambda$1(Function1 function1, MediaPlayer mediaPlayer, int i, int i2) {
        LogUtils.m11128d("播放失败 " + i);
        if (function1 == null) {
            return true;
        }
        return true;
    }

    public final boolean isPlay() {
        MediaPlayer mediaPlayer = mMediaPlayer;
        return mediaPlayer != null && mediaPlayer.isPlaying();
    }

    public final void play(@aa1 String url, @tb1 final Function1<? super Boolean, Unit> function1) throws IOException {
        Intrinsics.X0O(url, "url");
        LogUtils.m11128d(TAG + " play -> " + url);
        if (mMediaPlayer == null) {
            mMediaPlayer = new MediaPlayer();
        }
        stop();
        MediaPlayer mediaPlayer = mMediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
        }
        MediaPlayer mediaPlayer2 = mMediaPlayer;
        if (mediaPlayer2 != null) {
            mediaPlayer2.setDataSource(url);
        }
        MediaPlayer mediaPlayer3 = mMediaPlayer;
        if (mediaPlayer3 != null) {
            mediaPlayer3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.android.mltcode.paycertificationapi.vj6
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer4) {
                    VoicePlayer.play$lambda$0(function1, mediaPlayer4);
                }
            });
        }
        MediaPlayer mediaPlayer4 = mMediaPlayer;
        if (mediaPlayer4 != null) {
            mediaPlayer4.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.android.mltcode.paycertificationapi.wj6
                @Override // android.media.MediaPlayer.OnErrorListener
                public final boolean onError(MediaPlayer mediaPlayer5, int i, int i2) {
                    return VoicePlayer.play$lambda$1(function1, mediaPlayer5, i, i2);
                }
            });
        }
        MediaPlayer mediaPlayer5 = mMediaPlayer;
        if (mediaPlayer5 != null) {
            mediaPlayer5.prepare();
        }
        MediaPlayer mediaPlayer6 = mMediaPlayer;
        if (mediaPlayer6 != null) {
            mediaPlayer6.start();
        }
    }

    public final void release() {
        if (mMediaPlayer != null) {
            stop();
            MediaPlayer mediaPlayer = mMediaPlayer;
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
            mMediaPlayer = null;
        }
    }

    public final void stop() {
        try {
            MediaPlayer mediaPlayer = mMediaPlayer;
            if (mediaPlayer != null) {
                mediaPlayer.stop();
            }
            MediaPlayer mediaPlayer2 = mMediaPlayer;
            if (mediaPlayer2 != null) {
                mediaPlayer2.reset();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
