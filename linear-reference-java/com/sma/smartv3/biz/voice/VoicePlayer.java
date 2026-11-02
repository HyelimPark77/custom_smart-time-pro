package com.sma.smartv3.biz.voice;

import android.media.MediaPlayer;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.vj6;
import com.android.mltcode.paycertificationapi.wj6;
import com.blankj.utilcode.util.LogUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class VoicePlayer {

    @aa1
    public static final VoicePlayer INSTANCE = null;

    @aa1
    private static final String TAG = null;

    @tb1
    private static MediaPlayer mMediaPlayer;

    static {
        INSTANCE = new VoicePlayer();
        TAG = "VoicePlayer";
    }

    private VoicePlayer() {
    }

    public static /* synthetic */ void OXO1(Function1 r0, MediaPlayer r1) {
        play$lambda$0(r0, r1);
    }

    public static /* synthetic */ boolean XIi00iiXO(Function1 r0, MediaPlayer r1, int r2, int r3) {
        return play$lambda$1(r0, r1, r2, r3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void play$default(VoicePlayer r0, String r1, Function1 r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = null;
    L5:
        r0.play(r1, r2);
    }

    private static final void play$lambda$0(Function1 r0, MediaPlayer r1) {
        if (r0 == null) goto L5;
        Unit r2 = (Unit) r0.invoke(Boolean.TRUE);
        return;
    }

    private static final boolean play$lambda$1(Function1 r0, MediaPlayer r1, int r2, int r3) {
        LogUtils.d(new Object[]{"播放失败 " + r2});
        if (r0 == null) goto L7;
        Unit r4 = (Unit) r0.invoke(Boolean.FALSE);
        return true;
    L7:
        return true;
    }

    public final boolean isPlay() {
        MediaPlayer r0 = mMediaPlayer;
        if (r0 != null) goto L5;
    L7:
        return false;
    L5:
        if (r0.isPlaying() != true) goto L7;
        return true;
    }

    public final void play(@aa1 String r3, @tb1 final Function1<? super Boolean, Unit> r4) {
        Intrinsics.X0O(r3, "url");
        LogUtils.d(new Object[]{TAG + " play -> " + r3});
        if (mMediaPlayer != null) goto L5;
        mMediaPlayer = new MediaPlayer();
    L5:
        stop();
        MediaPlayer r0 = mMediaPlayer;
        if (r0 == null) goto L8;
        r0.reset();
    L8:
        MediaPlayer r1 = mMediaPlayer;
        if (r1 == null) goto L11;
        r1.setDataSource(r3);
    L11:
        MediaPlayer r5 = mMediaPlayer;
        if (r5 == null) goto L14;
        r5.setOnCompletionListener(new vj6(r4));
    L14:
        MediaPlayer r6 = mMediaPlayer;
        if (r6 == null) goto L17;
        r6.setOnErrorListener(new wj6(r4));
    L17:
        MediaPlayer r7 = mMediaPlayer;
        if (r7 == null) goto L20;
        r7.prepare();
    L20:
        MediaPlayer r8 = mMediaPlayer;
        if (r8 == null) goto L24;
        r8.start();
        return;
    }

    public final void release() {
        if (mMediaPlayer == null) goto L9;
        stop();
        MediaPlayer r0 = mMediaPlayer;
        if (r0 == null) goto L7;
        r0.release();
    L7:
        mMediaPlayer = null;
        return;
    }

    public final void stop() {
        MediaPlayer r0 = mMediaPlayer;     // Catch: Exception -> L5
        if (r0 == null) goto L7;
        r0.stop();     // Catch: Exception -> L5
    L7:
        MediaPlayer r1 = mMediaPlayer;     // Catch: Exception -> L5
        if (r1 == null) goto L15;
        r1.reset();     // Catch: Exception -> L5
        return;
    L15:
        return;
    L5:
        e = move-exception;
        e.printStackTrace();
    }
}
