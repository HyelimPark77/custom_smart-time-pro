package com.sma.smartv3.biz;

import android.app.Application;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.app.ServiceCompat;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i1i1IOiO;
import com.android.mltcode.paycertificationapi.i72;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.C20141iO;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes18.dex */
public final class OXO1 {
    public NotificationManagerCompat IiI10X;

    @tb1
    public RemoteViews O00;
    public Application OXO1;

    @aa1
    public String XO0O10;

    @aa1
    public static final C22035OXO1 XOO0ii0 = new C22035OXO1(null);

    @aa1
    public static final Lazy<OXO1> I0IIOi = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.en4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return com.sma.smartv3.biz.OXO1.OIi0();
        }
    });
    public int XIi00iiXO = C20141iO.IOIi00(new IntRange(100, Integer.MAX_VALUE), Random.Default);

    /* JADX INFO: renamed from: iO */
    @aa1
    public String f50888iO = i1i1IOiO.XIi00iiXO;

    /* JADX INFO: renamed from: com.sma.smartv3.biz.OXO1$OXO1 */
    public static final class C22035OXO1 {
        public /* synthetic */ C22035OXO1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void XIi00iiXO() {
        }

        @aa1
        public final OXO1 OXO1() {
            return (OXO1) OXO1.I0IIOi.getValue();
        }

        public C22035OXO1() {
        }
    }

    public OXO1() {
        String appName = AppUtils.getAppName();
        Intrinsics.O10IXXX0X(appName, "getAppName(...)");
        this.XO0O10 = appName;
    }

    public static /* synthetic */ void I1XOi1(OXO1 oxo1, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            str = "";
        }
        oxo1.X0O(i, i2, str);
    }

    public static /* synthetic */ Notification O00(OXO1 oxo1, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return oxo1.XO0O10(str);
    }

    public static final OXO1 OIi0() {
        return new OXO1();
    }

    @aa1
    /* JADX INFO: renamed from: iO */
    public static final OXO1 m38101iO() {
        return XOO0ii0.OXO1();
    }

    public final void I0IIOi(@aa1 Application app) {
        Intrinsics.X0O(app, "app");
        this.OXO1 = app;
        if (app == null) {
            Intrinsics.XXO("mApp");
            app = null;
        }
        NotificationManagerCompat notificationManagerCompatFrom = NotificationManagerCompat.from(app);
        Intrinsics.O10IXXX0X(notificationManagerCompatFrom, "from(...)");
        this.IiI10X = notificationManagerCompatFrom;
    }

    public final void I0iXXO() {
        Class cls = i72.OXO1.Oii1X1iO() ? LocalServiceV2.class : LocalService.class;
        if (ServiceUtils.isServiceRunning((Class<?>) cls)) {
            i1O0OXO1O.OXO1.OXO1("SmaNotification startService isServiceRunning");
            return;
        }
        Application application = this.OXO1;
        Application application2 = null;
        if (application == null) {
            Intrinsics.XXO("mApp");
            application = null;
        }
        Intent intent = new Intent(application, (Class<?>) cls);
        Application application3 = this.OXO1;
        if (application3 == null) {
            Intrinsics.XXO("mApp");
        } else {
            application2 = application3;
        }
        application2.startForegroundService(intent);
    }

    /* JADX INFO: renamed from: IO */
    public final void m38102IO(@aa1 Service service) {
        Intrinsics.X0O(service, "service");
        i1O0OXO1O.OXO1.OXO1("showNotification");
        NotificationManagerCompat notificationManagerCompat = null;
        try {
            Notification notificationO00 = O00(this, null, 1, null);
            NotificationManagerCompat notificationManagerCompat2 = this.IiI10X;
            if (notificationManagerCompat2 == null) {
                Intrinsics.XXO("mManagerCompat");
            } else {
                notificationManagerCompat = notificationManagerCompat2;
            }
            notificationManagerCompat.notify(this.XIi00iiXO, notificationO00);
            if (Build.VERSION.SDK_INT >= 34) {
                ServiceCompat.startForeground(service, this.XIi00iiXO, notificationO00, 8);
            } else {
                service.startForeground(this.XIi00iiXO, notificationO00);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void IiI10X(@aa1 Service service) {
        Intrinsics.X0O(service, "service");
        i1O0OXO1O.OXO1.OXO1("hideNotification");
        NotificationManagerCompat notificationManagerCompat = null;
        try {
            Notification notificationO00 = O00(this, null, 1, null);
            NotificationManagerCompat notificationManagerCompat2 = this.IiI10X;
            if (notificationManagerCompat2 == null) {
                Intrinsics.XXO("mManagerCompat");
            } else {
                notificationManagerCompat = notificationManagerCompat2;
            }
            notificationManagerCompat.cancel(this.XIi00iiXO);
            if (Build.VERSION.SDK_INT >= 34) {
                ServiceCompat.startForeground(service, this.XIi00iiXO, notificationO00, 8);
            } else {
                service.startForeground(this.XIi00iiXO, notificationO00);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void O10IXXX0X(@aa1 String text) {
        Intrinsics.X0O(text, "text");
        if (ServiceUtils.isServiceRunning((Class<?>) LocalService.class)) {
            NotificationManagerCompat notificationManagerCompat = this.IiI10X;
            if (notificationManagerCompat == null) {
                Intrinsics.XXO("mManagerCompat");
                notificationManagerCompat = null;
            }
            notificationManagerCompat.notify(this.XIi00iiXO, XO0O10(text));
        }
    }

    public final void OIX0iXi(@aa1 Service service) {
        Intrinsics.X0O(service, "service");
        i1O0OXO1O.OXO1.OXO1("showNotificationV2");
        NotificationManagerCompat notificationManagerCompat = null;
        try {
            Notification notificationO00 = O00(this, null, 1, null);
            NotificationManagerCompat notificationManagerCompat2 = this.IiI10X;
            if (notificationManagerCompat2 == null) {
                Intrinsics.XXO("mManagerCompat");
            } else {
                notificationManagerCompat = notificationManagerCompat2;
            }
            notificationManagerCompat.notify(this.XIi00iiXO, notificationO00);
            if (Build.VERSION.SDK_INT >= 34) {
                ServiceCompat.startForeground(service, this.XIi00iiXO, notificationO00, 24);
            } else {
                service.startForeground(this.XIi00iiXO, notificationO00);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void X0O(int i, int i2, @aa1 String distance) {
        String str;
        Intrinsics.X0O(distance, "distance");
        LogUtils.m11128d("updateSportData -> " + ServiceUtils.isServiceRunning((Class<?>) LocalService.class));
        Application application = null;
        if (distance.length() > 0) {
            Application application2 = this.OXO1;
            if (application2 == null) {
                Intrinsics.XXO("mApp");
            } else {
                application = application2;
            }
            str = distance + " " + i2 + " " + application.getString(R.string.calories);
        } else {
            Application application3 = this.OXO1;
            if (application3 == null) {
                Intrinsics.XXO("mApp");
                application3 = null;
            }
            String string = application3.getString(R.string.steps);
            Application application4 = this.OXO1;
            if (application4 == null) {
                Intrinsics.XXO("mApp");
            } else {
                application = application4;
            }
            str = i + " " + string + "  " + i2 + " " + application.getString(R.string.calories);
        }
        O10IXXX0X(str);
    }

    public final void X1ii(@aa1 RemoteViews remoteViews) {
        Intrinsics.X0O(remoteViews, "remoteViews");
        if (ServiceUtils.isServiceRunning((Class<?>) LocalService.class)) {
            this.O00 = remoteViews;
            NotificationManagerCompat notificationManagerCompat = this.IiI10X;
            if (notificationManagerCompat == null) {
                Intrinsics.XXO("mManagerCompat");
                notificationManagerCompat = null;
            }
            notificationManagerCompat.notify(this.XIi00iiXO, O00(this, null, 1, null));
        }
    }

    public final Notification XO0O10(String str) {
        Application application = this.OXO1;
        NotificationManagerCompat notificationManagerCompat = null;
        if (application == null) {
            Intrinsics.XXO("mApp");
            application = null;
        }
        NotificationCompat.Builder smallIcon = new NotificationCompat.Builder(application, this.f50888iO).setSmallIcon(R.mipmap.ic_launcher);
        Application application2 = this.OXO1;
        if (application2 == null) {
            Intrinsics.XXO("mApp");
            application2 = null;
        }
        Application application3 = this.OXO1;
        if (application3 == null) {
            Intrinsics.XXO("mApp");
            application3 = null;
        }
        NotificationCompat.Builder priority = smallIcon.setContentIntent(PendingIntent.getActivity(application2, 0, IntentUtils.getLaunchAppIntent(application3.getPackageName()), 67108864)).setAutoCancel(false).setOngoing(true).setSound(null).setVibrate(null).setLights(0, 0, 0).setVisibility(-1).setPriority(-2);
        RemoteViews remoteViews = this.O00;
        if (remoteViews != null) {
            priority.setContent(remoteViews);
        }
        if (str != null) {
            Application application4 = this.OXO1;
            if (application4 == null) {
                Intrinsics.XXO("mApp");
                application4 = null;
            }
            priority.setContentTitle(application4.getString(R.string.app_name));
            priority.setContentText(str);
        }
        priority.setLargeIcon((Bitmap) null);
        Notification notificationBuild = priority.build();
        Intrinsics.O10IXXX0X(notificationBuild, "build(...)");
        NotificationChannel notificationChannel = new NotificationChannel(this.f50888iO, this.XO0O10, 2);
        if (q62.OXO1.Oii1X1iO()) {
            NotificationManagerCompat notificationManagerCompat2 = this.IiI10X;
            if (notificationManagerCompat2 == null) {
                Intrinsics.XXO("mManagerCompat");
            } else {
                notificationManagerCompat = notificationManagerCompat2;
            }
            notificationManagerCompat.createNotificationChannel(notificationChannel);
        }
        return notificationBuild;
    }

    public final void XOO0ii0(@aa1 Service service) {
        Intrinsics.X0O(service, "service");
        i1O0OXO1O.OXO1.OXO1("hideNotificationV2");
        NotificationManagerCompat notificationManagerCompat = null;
        try {
            Notification notificationO00 = O00(this, null, 1, null);
            NotificationManagerCompat notificationManagerCompat2 = this.IiI10X;
            if (notificationManagerCompat2 == null) {
                Intrinsics.XXO("mManagerCompat");
            } else {
                notificationManagerCompat = notificationManagerCompat2;
            }
            notificationManagerCompat.cancel(this.XIi00iiXO);
            if (Build.VERSION.SDK_INT >= 34) {
                ServiceCompat.startForeground(service, this.XIi00iiXO, notificationO00, 24);
            } else {
                service.startForeground(this.XIi00iiXO, notificationO00);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void XXI() {
        i1O0OXO1O.OXO1.OXO1("stopService LocalService");
        Application application = null;
        if (i72.OXO1.Oii1X1iO()) {
            Application application2 = this.OXO1;
            if (application2 == null) {
                Intrinsics.XXO("mApp");
                application2 = null;
            }
            Application application3 = this.OXO1;
            if (application3 == null) {
                Intrinsics.XXO("mApp");
            } else {
                application = application3;
            }
            application2.stopService(new Intent(application, (Class<?>) LocalServiceV2.class));
            return;
        }
        Application application4 = this.OXO1;
        if (application4 == null) {
            Intrinsics.XXO("mApp");
            application4 = null;
        }
        Application application5 = this.OXO1;
        if (application5 == null) {
            Intrinsics.XXO("mApp");
        } else {
            application = application5;
        }
        application4.stopService(new Intent(application, (Class<?>) LocalService.class));
    }
}
