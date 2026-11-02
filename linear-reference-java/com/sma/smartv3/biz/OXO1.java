package com.sma.smartv3.biz;

import android.app.Application;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.app.ServiceCompat;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.en4;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i1i1IOiO;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.os0;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.IntentUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ServiceUtils;
import com.sma.smartv3.pro.R;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.iO;

/* JADX INFO: loaded from: classes18.dex */
public final class OXO1 {

    @aa1
    public static final Lazy<OXO1> I0IIOi = null;

    @aa1
    public static final C0553OXO1 XOO0ii0 = null;
    public NotificationManagerCompat IiI10X;

    @tb1
    public RemoteViews O00;
    public Application OXO1;
    public int XIi00iiXO;

    @aa1
    public String XO0O10;

    @aa1
    public String iO;

    /* JADX INFO: renamed from: com.sma.smartv3.biz.OXO1$OXO1, reason: collision with other inner class name */
    public static final class C0553OXO1 {
        public /* synthetic */ C0553OXO1(DefaultConstructorMarker r1) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void XIi00iiXO() {
        }

        @aa1
        public final OXO1 OXO1() {
            return (OXO1) OXO1.XIi00iiXO().getValue();
        }

        public C0553OXO1() {
        }
    }

    static {
        XOO0ii0 = new C0553OXO1(null);
        I0IIOi = LazyKt__LazyJVMKt.iO(new en4());
    }

    public OXO1() {
        this.XIi00iiXO = iO.IOIi00(new IntRange(100, Integer.MAX_VALUE), Random.Default);
        this.iO = i1i1IOiO.XIi00iiXO;
        String r0 = AppUtils.getAppName();
        Intrinsics.O10IXXX0X(r0, "getAppName(...)");
        this.XO0O10 = r0;
    }

    public static /* synthetic */ void I1XOi1(OXO1 r0, int r1, int r2, String r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L5;
        r3 = "";
    L5:
        r0.X0O(r1, r2, r3);
    }

    public static /* synthetic */ Notification O00(OXO1 r0, String r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = null;
    L6:
        return r0.XO0O10(r1);
    }

    public static final OXO1 OIi0() {
        return new OXO1();
    }

    public static /* synthetic */ OXO1 OXO1() {
        return OIi0();
    }

    public static final /* synthetic */ Lazy XIi00iiXO() {
        return I0IIOi;
    }

    @aa1
    public static final OXO1 iO() {
        return XOO0ii0.OXO1();
    }

    public final void I0IIOi(@aa1 Application r2) {
        Intrinsics.X0O(r2, "app");
        this.OXO1 = r2;
        if (r2 != null) goto L5;
        Intrinsics.XXO("mApp");
        r2 = null;
    L5:
        NotificationManagerCompat r3 = NotificationManagerCompat.from(r2);
        Intrinsics.O10IXXX0X(r3, "from(...)");
        this.IiI10X = r3;
    }

    public final void I0iXXO() {
        if (i72.OXO1.Oii1X1iO() == false) goto L5;
        Class r0 = LocalServiceV2.class;
    L7:
        if (ServiceUtils.isServiceRunning(r0) == false) goto L10;
        i1O0OXO1O.OXO1.OXO1("SmaNotification startService isServiceRunning");
        return;
    L10:
        Application r2 = this.OXO1;
        Application r3 = null;
        if (r2 != null) goto L13;
        Intrinsics.XXO("mApp");
        r2 = null;
    L13:
        Intent r1 = new Intent(r2, r0);
        Application r4 = this.OXO1;
        if (r4 != null) goto L16;
        Intrinsics.XXO("mApp");
    L17:
        r3.startForegroundService(r1);
        return;
    L16:
        r3 = r4;
        goto L17
    L5:
        r0 = LocalService.class;
        goto L7
    }

    public final void IO(@aa1 Service r4) {
        Intrinsics.X0O(r4, NotificationCompat.CATEGORY_SERVICE);
        i1O0OXO1O.OXO1.OXO1("showNotification");
        NotificationManagerCompat r1 = null;
        Notification r0 = O00(this, null, 1, null);     // Catch: Exception -> L6
        NotificationManagerCompat r2 = this.IiI10X;     // Catch: Exception -> L6
        if (r2 != null) goto L8;
        Intrinsics.XXO("mManagerCompat");     // Catch: Exception -> L6
    L9:
        r1.notify(this.XIi00iiXO, r0);     // Catch: Exception -> L6
        if (Build.VERSION.SDK_INT < 34) goto L13;
        ServiceCompat.startForeground(r4, this.XIi00iiXO, r0, 8);     // Catch: Exception -> L6
        return;
    L13:
        r4.startForeground(this.XIi00iiXO, r0);     // Catch: Exception -> L6
        return;
    L8:
        r1 = r2;
    L6:
        e = move-exception;
        e.printStackTrace();
    }

    public final void IiI10X(@aa1 Service r4) {
        Intrinsics.X0O(r4, NotificationCompat.CATEGORY_SERVICE);
        i1O0OXO1O.OXO1.OXO1("hideNotification");
        NotificationManagerCompat r1 = null;
        Notification r0 = O00(this, null, 1, null);     // Catch: Exception -> L6
        NotificationManagerCompat r2 = this.IiI10X;     // Catch: Exception -> L6
        if (r2 != null) goto L8;
        Intrinsics.XXO("mManagerCompat");     // Catch: Exception -> L6
    L9:
        r1.cancel(this.XIi00iiXO);     // Catch: Exception -> L6
        if (Build.VERSION.SDK_INT < 34) goto L13;
        ServiceCompat.startForeground(r4, this.XIi00iiXO, r0, 8);     // Catch: Exception -> L6
        return;
    L13:
        r4.startForeground(this.XIi00iiXO, r0);     // Catch: Exception -> L6
        return;
    L8:
        r1 = r2;
    L6:
        e = move-exception;
        e.printStackTrace();
    }

    public final void O10IXXX0X(@aa1 String r3) {
        Intrinsics.X0O(r3, "text");
        if (ServiceUtils.isServiceRunning(LocalService.class) == true) goto L5;
        return;
    L5:
        NotificationManagerCompat r0 = this.IiI10X;
        if (r0 != null) goto L8;
        Intrinsics.XXO("mManagerCompat");
        r0 = null;
    L8:
        r0.notify(this.XIi00iiXO, XO0O10(r3));
    }

    public final void OIX0iXi(@aa1 Service r4) {
        Intrinsics.X0O(r4, NotificationCompat.CATEGORY_SERVICE);
        i1O0OXO1O.OXO1.OXO1("showNotificationV2");
        NotificationManagerCompat r1 = null;
        Notification r0 = O00(this, null, 1, null);     // Catch: Exception -> L6
        NotificationManagerCompat r2 = this.IiI10X;     // Catch: Exception -> L6
        if (r2 != null) goto L8;
        Intrinsics.XXO("mManagerCompat");     // Catch: Exception -> L6
    L9:
        r1.notify(this.XIi00iiXO, r0);     // Catch: Exception -> L6
        if (Build.VERSION.SDK_INT < 34) goto L13;
        ServiceCompat.startForeground(r4, this.XIi00iiXO, r0, 24);     // Catch: Exception -> L6
        return;
    L13:
        r4.startForeground(this.XIi00iiXO, r0);     // Catch: Exception -> L6
        return;
    L8:
        r1 = r2;
    L6:
        e = move-exception;
        e.printStackTrace();
    }

    public final void X0O(int r6, int r7, @aa1 String r8) {
        Intrinsics.X0O(r8, os0.OII);
        LogUtils.d(new Object[]{"updateSportData -> " + ServiceUtils.isServiceRunning(LocalService.class)});
        Application r2 = null;
        if (r8.length() <= 0) goto L9;
        Application r9 = this.OXO1;
        if (r9 != null) goto L7;
        Intrinsics.XXO("mApp");
    L8:
        String r10 = r8 + " " + r7 + " " + r2.getString(R.string.calories);
    L17:
        O10IXXX0X(r10);
        return;
    L7:
        r2 = r9;
        goto L8
    L9:
        Application r11 = this.OXO1;
        if (r11 != null) goto L12;
        Intrinsics.XXO("mApp");
        r11 = null;
    L12:
        String r12 = r11.getString(R.string.steps);
        Application r0 = this.OXO1;
        if (r0 != null) goto L15;
        Intrinsics.XXO("mApp");
    L16:
        r10 = r6 + " " + r12 + "  " + r7 + " " + r2.getString(R.string.calories);
        goto L17
    L15:
        r2 = r0;
        goto L16
    }

    public final void X1ii(@aa1 RemoteViews r4) {
        Intrinsics.X0O(r4, "remoteViews");
        if (ServiceUtils.isServiceRunning(LocalService.class) == true) goto L5;
        return;
    L5:
        this.O00 = r4;
        NotificationManagerCompat r5 = this.IiI10X;
        if (r5 != null) goto L8;
        Intrinsics.XXO("mManagerCompat");
        r5 = null;
    L8:
        r5.notify(this.XIi00iiXO, O00(this, null, 1, null));
    }

    public final Notification XO0O10(String r8) {
        Application r1 = this.OXO1;
        NotificationManagerCompat r3 = null;
        if (r1 != null) goto L5;
        Intrinsics.XXO("mApp");
        r1 = null;
    L5:
        NotificationCompat.Builder r0 = new NotificationCompat.Builder(r1, this.iO).setSmallIcon(R.mipmap.ic_launcher);
        Application r2 = this.OXO1;
        if (r2 != null) goto L8;
        Intrinsics.XXO("mApp");
        r2 = null;
    L8:
        Application r4 = this.OXO1;
        if (r4 != null) goto L11;
        Intrinsics.XXO("mApp");
        r4 = null;
    L11:
        NotificationCompat.Builder r5 = r0.setContentIntent(PendingIntent.getActivity(r2, 0, IntentUtils.getLaunchAppIntent(r4.getPackageName()), 67108864)).setAutoCancel(false).setOngoing(true).setSound(null).setVibrate(null).setLights(0, 0, 0).setVisibility(-1).setPriority(-2);
        RemoteViews r6 = this.O00;
        if (r6 == null) goto L14;
        r5.setContent(r6);
    L14:
        if (r8 == null) goto L19;
        Application r7 = this.OXO1;
        if (r7 != null) goto L18;
        Intrinsics.XXO("mApp");
        r7 = null;
    L18:
        r5.setContentTitle(r7.getString(R.string.app_name));
        r5.setContentText(r8);
    L19:
        r5.setLargeIcon(null);
        Notification r9 = r5.build();
        Intrinsics.O10IXXX0X(r9, "build(...)");
        NotificationChannel r10 = new NotificationChannel(this.iO, this.XO0O10, 2);
        if (q62.OXO1.Oii1X1iO() == false) goto L26;
        NotificationManagerCompat r11 = this.IiI10X;
        if (r11 != null) goto L24;
        Intrinsics.XXO("mManagerCompat");
    L25:
        r3.createNotificationChannel(r10);
        goto L26
    L24:
        r3 = r11;
    L26:
        return r9;
    }

    public final void XOO0ii0(@aa1 Service r4) {
        Intrinsics.X0O(r4, NotificationCompat.CATEGORY_SERVICE);
        i1O0OXO1O.OXO1.OXO1("hideNotificationV2");
        NotificationManagerCompat r1 = null;
        Notification r0 = O00(this, null, 1, null);     // Catch: Exception -> L6
        NotificationManagerCompat r2 = this.IiI10X;     // Catch: Exception -> L6
        if (r2 != null) goto L8;
        Intrinsics.XXO("mManagerCompat");     // Catch: Exception -> L6
    L9:
        r1.cancel(this.XIi00iiXO);     // Catch: Exception -> L6
        if (Build.VERSION.SDK_INT < 34) goto L13;
        ServiceCompat.startForeground(r4, this.XIi00iiXO, r0, 24);     // Catch: Exception -> L6
        return;
    L13:
        r4.startForeground(this.XIi00iiXO, r0);     // Catch: Exception -> L6
        return;
    L8:
        r1 = r2;
    L6:
        e = move-exception;
        e.printStackTrace();
    }

    public final void XXI() {
        i1O0OXO1O.OXO1.OXO1("stopService LocalService");
        Application r1 = null;
        if (i72.OXO1.Oii1X1iO() == false) goto L13;
        Application r0 = this.OXO1;
        if (r0 != null) goto L7;
        Intrinsics.XXO("mApp");
        r0 = null;
    L7:
        Application r4 = this.OXO1;
        if (r4 != null) goto L10;
        Intrinsics.XXO("mApp");
    L11:
        r0.stopService(new Intent(r1, LocalServiceV2.class));
        return;
    L10:
        r1 = r4;
        goto L11
    L13:
        Application r2 = this.OXO1;
        if (r2 != null) goto L16;
        Intrinsics.XXO("mApp");
        r2 = null;
    L16:
        Application r5 = this.OXO1;
        if (r5 != null) goto L19;
        Intrinsics.XXO("mApp");
    L20:
        r2.stopService(new Intent(r1, LocalService.class));
        return;
    L19:
        r1 = r5;
        goto L20
    }
}
