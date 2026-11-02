package com.szabh.smable3.music;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Build;
import androidx.annotation.CallSuper;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.hw0;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class MusicControllerCompat {

    @aa1
    public static final Companion Companion = null;

    @aa1
    private static final String EXTRA_VOLUME_STREAM_TYPE = "android.media.EXTRA_VOLUME_STREAM_TYPE";

    @aa1
    private static final String VOLUME_CHANGED_ACTION = "android.media.VOLUME_CHANGED_ACTION";

    @tb1
    private AudioManager mAudioManager;

    @tb1
    private Context mContext;

    @aa1
    private final Lazy mReceiver$delegate;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        @aa1
        public final MusicControllerCompat newInstance() {
            return new MusicController();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public MusicControllerCompat() {
        this.mReceiver$delegate = LazyKt__LazyJVMKt.iO(new hw0(this));
    }

    public static /* synthetic */ MusicControllerCompat$mReceiver$2$1 OXO1(MusicControllerCompat r0) {
        return mReceiver_delegate$lambda$0(r0);
    }

    private final BroadcastReceiver getMReceiver() {
        return (BroadcastReceiver) getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.szabh.smable3.music.MusicControllerCompat$mReceiver$2$1] */
    private static final MusicControllerCompat$mReceiver$2$1 mReceiver_delegate$lambda$0(final MusicControllerCompat r1) {
        return new MusicControllerCompat$mReceiver$2$1(r1);
    }

    @CallSuper
    public void exit() {
        Context r0 = this.mContext;
        if (r0 == null) goto L5;
        r0.unregisterReceiver(getMReceiver());
    L5:
        this.mContext = null;
    }

    @tb1
    public final AudioManager getMAudioManager() {
        return this.mAudioManager;
    }

    @tb1
    public final Context getMContext() {
        return this.mContext;
    }

    public final int getStreamMaxVolume(int r2) {
        AudioManager r0 = this.mAudioManager;
        if (r0 != null) goto L5;
        return 15;
    L5:
        return r0.getStreamMaxVolume(r2);
    }

    public final int getStreamVolume(int r2) {
        AudioManager r0 = this.mAudioManager;
        if (r0 != null) goto L5;
        return -1;
    L5:
        return r0.getStreamVolume(r2);
    }

    @SuppressLint({"WrongConstant"})
    @CallSuper
    public void launch(@aa1 Context r4) {
        Intrinsics.X0O(r4, "context");
        this.mContext = r4;
        if (Build.VERSION.SDK_INT < 34) goto L5;
        ContextCompat.registerReceiver(r4, getMReceiver(), new IntentFilter(VOLUME_CHANGED_ACTION), 2);
    L6:
        Object r5 = r4.getSystemService("audio");
        Intrinsics.X1ii(r5, "null cannot be cast to non-null type android.media.AudioManager");
        this.mAudioManager = (AudioManager) r5;
        return;
    L5:
        r4.registerReceiver(getMReceiver(), new IntentFilter(VOLUME_CHANGED_ACTION));
        goto L6
    }

    public final void setMAudioManager(@tb1 AudioManager r1) {
        this.mAudioManager = r1;
    }

    public final void setMContext(@tb1 Context r1) {
        this.mContext = r1;
    }

    public void updateVolume() {
    }
}
