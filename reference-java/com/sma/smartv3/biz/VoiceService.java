package com.sma.smartv3.biz;

import android.app.ActivityManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.Utils;
import com.sma.smartv3.biz.VoiceService;
import com.sma.smartv3.biz.voice.RecordingManager;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class VoiceService extends Service {

    /* JADX INFO: renamed from: I1 */
    @aa1
    public static final OXO1 f50915I1 = new OXO1(null);

    @aa1
    public static final String X11iII1O1 = "ACTION_START";

    @aa1
    public static final String X1IX = "ACTION_STOP_RECORDING";

    @aa1
    public static final String XXX11i = "ACTION_START_RECORDING";
    public static final int iX1O1 = 1;

    /* JADX INFO: renamed from: IO */
    @aa1
    public final Lazy f50916IO = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.yj6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return VoiceService.XO0O10(this.f12381IO);
        }
    });

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean OXO1(Context context, Class<?> cls) {
            Object systemService = context.getSystemService("activity");
            Intrinsics.X1ii(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            Iterator<ActivityManager.RunningServiceInfo> it = ((ActivityManager) systemService).getRunningServices(Integer.MAX_VALUE).iterator();
            while (it.hasNext()) {
                if (Intrinsics.XOO0ii0(cls.getName(), it.next().service.getClassName())) {
                    return true;
                }
            }
            return false;
        }

        public final void XIi00iiXO() {
            Intent intent = new Intent(Utils.getApp(), (Class<?>) VoiceService.class);
            intent.setAction(VoiceService.XXX11i);
            ContextCompat.startForegroundService(Utils.getApp(), intent);
        }

        public final void XO0O10() {
            Intent intent = new Intent(Utils.getApp(), (Class<?>) VoiceService.class);
            intent.setAction(VoiceService.X1IX);
            Utils.getApp().startService(intent);
        }

        /* JADX INFO: renamed from: iO */
        public final void m38117iO() {
            Intent intent = new Intent(Utils.getApp(), (Class<?>) VoiceService.class);
            intent.setAction(VoiceService.X11iII1O1);
            ContextCompat.startForegroundService(Utils.getApp(), intent);
        }

        public OXO1() {
        }
    }

    public static final NotificationManager XO0O10(VoiceService voiceService) {
        Object systemService = voiceService.getSystemService("notification");
        Intrinsics.X1ii(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        return (NotificationManager) systemService;
    }

    public final void O00() {
        try {
            int i = Build.VERSION.SDK_INT;
            m38116iO().createNotificationChannel(new NotificationChannel("voice_channel", "Voice Channel", 2));
            if (i >= 30) {
                startForeground(1, XIi00iiXO(), 128);
            } else {
                startForeground(1, XIi00iiXO());
            }
        } catch (Exception e) {
            i1O0OXO1O.OXO1.OXO1(" startNotification  intent?.action = " + e);
            e.printStackTrace();
        }
    }

    public final Notification XIi00iiXO() {
        Notification.Builder builder = new Notification.Builder(this);
        builder.setChannelId("voice_channel");
        Notification notificationBuild = builder.build();
        Intrinsics.O10IXXX0X(notificationBuild, "build(...)");
        return notificationBuild;
    }

    /* JADX INFO: renamed from: iO */
    public final NotificationManager m38116iO() {
        return (NotificationManager) this.f50916IO.getValue();
    }

    @Override // android.app.Service
    @tb1
    public IBinder onBind(@tb1 Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service
    public int onStartCommand(@tb1 Intent intent, int i, int i2) {
        i1O0OXO1O.OXO1.OXO1(" onStartCommand  intent?.action  = " + (intent != null ? intent.getAction() : null));
        if (Intrinsics.XOO0ii0(intent != null ? intent.getAction() : null, X11iII1O1)) {
            O00();
            return 1;
        }
        if (Intrinsics.XOO0ii0(intent != null ? intent.getAction() : null, XXX11i)) {
            O00();
            RecordingManager.Companion.getInstance().startRecord();
            return 1;
        }
        if (!Intrinsics.XOO0ii0(intent != null ? intent.getAction() : null, X1IX)) {
            return 1;
        }
        RecordingManager.Companion.getInstance().stopRecording();
        return 1;
    }
}
