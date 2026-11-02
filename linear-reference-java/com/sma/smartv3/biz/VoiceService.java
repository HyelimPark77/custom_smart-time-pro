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
import com.android.mltcode.paycertificationapi.xj6;
import com.android.mltcode.paycertificationapi.yj6;
import com.blankj.utilcode.util.Utils;
import com.sma.smartv3.biz.voice.RecordingManager;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class VoiceService extends Service {

    @aa1
    public static final OXO1 I1 = null;

    @aa1
    public static final String X11iII1O1 = "ACTION_START";

    @aa1
    public static final String X1IX = "ACTION_STOP_RECORDING";

    @aa1
    public static final String XXX11i = "ACTION_START_RECORDING";
    public static final int iX1O1 = 1;

    @aa1
    public final Lazy IO;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker r1) {
            this();
        }

        public final boolean OXO1(Context r3, Class<?> r4) {
            Object r5 = r3.getSystemService("activity");
            Intrinsics.X1ii(r5, "null cannot be cast to non-null type android.app.ActivityManager");
            Iterator<ActivityManager.RunningServiceInfo> r6 = ((ActivityManager) r5).getRunningServices(Integer.MAX_VALUE).iterator();
        L4:
            if (r6.hasNext() == false) goto L9;
            ActivityManager.RunningServiceInfo r0 = r6.next();
            if (Intrinsics.XOO0ii0(r4.getName(), r0.service.getClassName()) == false) goto L4;
            return true;
        L9:
            return false;
        }

        public final void XIi00iiXO() {
            Intent r0 = new Intent(Utils.getApp(), VoiceService.class);
            r0.setAction(VoiceService.XXX11i);
            ContextCompat.startForegroundService(Utils.getApp(), r0);
        }

        public final void XO0O10() {
            Intent r0 = new Intent(Utils.getApp(), VoiceService.class);
            r0.setAction(VoiceService.X1IX);
            Utils.getApp().startService(r0);
        }

        public final void iO() {
            Intent r0 = new Intent(Utils.getApp(), VoiceService.class);
            r0.setAction(VoiceService.X11iII1O1);
            ContextCompat.startForegroundService(Utils.getApp(), r0);
        }

        public OXO1() {
        }
    }

    static {
        I1 = new OXO1(null);
    }

    public VoiceService() {
        this.IO = LazyKt__LazyJVMKt.iO(new yj6(this));
    }

    public static /* synthetic */ NotificationManager OXO1(VoiceService r0) {
        return XO0O10(r0);
    }

    public static final NotificationManager XO0O10(VoiceService r1) {
        Object r2 = r1.getSystemService("notification");
        Intrinsics.X1ii(r2, "null cannot be cast to non-null type android.app.NotificationManager");
        return (NotificationManager) r2;
    }

    public final void O00() {
        int r0 = Build.VERSION.SDK_INT;     // Catch: Exception -> L6
        iO().createNotificationChannel(new NotificationChannel("voice_channel", "Voice Channel", 2));     // Catch: Exception -> L6
        if (r0 < 30) goto L8;
        xj6.OXO1(this, 1, XIi00iiXO(), 128);     // Catch: Exception -> L6
        return;
    L8:
        startForeground(1, XIi00iiXO());     // Catch: Exception -> L6
        return;
    L6:
        e = move-exception;
        i1O0OXO1O.OXO1.OXO1(" startNotification  intent?.action = " + e);
        e.printStackTrace();
    }

    public final Notification XIi00iiXO() {
        Notification.Builder r0 = new Notification.Builder(this);
        r0.setChannelId("voice_channel");
        Notification r1 = r0.build();
        Intrinsics.O10IXXX0X(r1, "build(...)");
        return r1;
    }

    public final NotificationManager iO() {
        return (NotificationManager) getValue();
    }

    @Override // android.app.Service
    @tb1
    public IBinder onBind(@tb1 Intent r1) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service
    public int onStartCommand(@tb1 Intent r4, int r5, int r6) {
        i1O0OXO1O r7 = i1O0OXO1O.OXO1;
        String r8 = null;
        if (r4 == null) goto L5;
        String r0 = r4.getAction();
    L6:
        r7.OXO1(" onStartCommand  intent?.action  = " + r0);
        if (r4 == null) goto L9;
        String r9 = r4.getAction();
    L11:
        if (Intrinsics.XOO0ii0(r9, X11iII1O1) == false) goto L13;
        O00();
        return 1;
    L13:
        if (r4 == null) goto L15;
        String r10 = r4.getAction();
    L17:
        if (Intrinsics.XOO0ii0(r10, XXX11i) == false) goto L19;
        O00();
        RecordingManager.Companion.getInstance().startRecord();
        return 1;
    L19:
        if (r4 == null) goto L22;
        r8 = r4.getAction();
    L22:
        if (Intrinsics.XOO0ii0(r8, X1IX) == false) goto L28;
        RecordingManager.Companion.getInstance().stopRecording();
        return 1;
    L28:
        return 1;
    L15:
        r10 = null;
        goto L17
    L9:
        r9 = null;
        goto L11
    L5:
        r0 = null;
        goto L6
    }
}
