package com.szabh.smable3.music;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Build;
import androidx.annotation.CallSuper;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.szabh.smable3.music.MusicControllerCompat;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class MusicControllerCompat {

    @aa1
    public static final Companion Companion = new Companion(null);

    @aa1
    private static final String EXTRA_VOLUME_STREAM_TYPE = "android.media.EXTRA_VOLUME_STREAM_TYPE";

    @aa1
    private static final String VOLUME_CHANGED_ACTION = "android.media.VOLUME_CHANGED_ACTION";

    @tb1
    private AudioManager mAudioManager;

    @tb1
    private Context mContext;

    @aa1
    private final Lazy mReceiver$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.hw0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return MusicControllerCompat.mReceiver_delegate$lambda$0(this.f7220IO);
        }
    });

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @aa1
        public final MusicControllerCompat newInstance() {
            return new MusicController();
        }

        private Companion() {
        }
    }

    private final BroadcastReceiver getMReceiver() {
        return (BroadcastReceiver) this.mReceiver$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.szabh.smable3.music.MusicControllerCompat$mReceiver$2$1] */
    public static final MusicControllerCompat$mReceiver$2$1 mReceiver_delegate$lambda$0(final MusicControllerCompat musicControllerCompat) {
        return new BroadcastReceiver() { // from class: com.szabh.smable3.music.MusicControllerCompat$mReceiver$2$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                Intrinsics.X0O(context, "context");
                Intrinsics.X0O(intent, "intent");
                String action = intent.getAction();
                if (action != null && action.hashCode() == -1940635523 && action.equals("android.media.VOLUME_CHANGED_ACTION") && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) {
                    this.this$0.updateVolume();
                }
            }
        };
    }

    @CallSuper
    public void exit() {
        Context context = this.mContext;
        if (context != null) {
            context.unregisterReceiver(getMReceiver());
        }
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

    public final int getStreamMaxVolume(int i) {
        AudioManager audioManager = this.mAudioManager;
        if (audioManager != null) {
            return audioManager.getStreamMaxVolume(i);
        }
        return 15;
    }

    public final int getStreamVolume(int i) {
        AudioManager audioManager = this.mAudioManager;
        if (audioManager != null) {
            return audioManager.getStreamVolume(i);
        }
        return -1;
    }

    @SuppressLint({"WrongConstant"})
    @CallSuper
    public void launch(@aa1 Context context) {
        Intrinsics.X0O(context, "context");
        this.mContext = context;
        if (Build.VERSION.SDK_INT >= 34) {
            ContextCompat.registerReceiver(context, getMReceiver(), new IntentFilter(VOLUME_CHANGED_ACTION), 2);
        } else {
            context.registerReceiver(getMReceiver(), new IntentFilter(VOLUME_CHANGED_ACTION));
        }
        Object systemService = context.getSystemService("audio");
        Intrinsics.X1ii(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        this.mAudioManager = (AudioManager) systemService;
    }

    public final void setMAudioManager(@tb1 AudioManager audioManager) {
        this.mAudioManager = audioManager;
    }

    public final void setMContext(@tb1 Context context) {
        this.mContext = context;
    }

    public void updateVolume() {
    }
}
