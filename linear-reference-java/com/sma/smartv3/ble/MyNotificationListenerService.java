package com.sma.smartv3.ble;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.ServiceUtils;
import com.blankj.utilcode.util.Utils;
import com.facebook.internal.security.CertificateUtil;
import com.sma.smartv3.biz.wa.WAManager;
import com.sma.smartv3.biz.wx.WxManager;
import com.sma.smartv3.initializer.BleInitializer;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleNotification;
import com.szabh.smable3.music.MusicControllerCompat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nMyNotificationListenerService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyNotificationListenerService.kt\ncom/sma/smartv3/ble/MyNotificationListenerService\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,699:1\n13805#2,2:700\n1#3:702\n*S KotlinDebug\n*F\n+ 1 MyNotificationListenerService.kt\ncom/sma/smartv3/ble/MyNotificationListenerService\n*L\n134#1:700,2\n*E\n"})
public final class MyNotificationListenerService extends NotificationListenerService {

    @aa1
    public static final OXO1 O001I = null;

    @aa1
    public static final String XXO = "MyNotificationListenerService";

    @tb1
    public MusicControllerCompat I1;
    public long IO;

    @aa1
    public final Map<String, String> X0i1O;

    @aa1
    public String X11iII1O1;

    @aa1
    public String X1IX;

    @aa1
    public String XXX11i;

    @aa1
    public final Map<String, Long> iIXi1iiXI;
    public long iX1O1;

    @aa1
    public final Map<String, String> iXiX011;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker r1) {
            this();
        }

        public final void I0IIOi(@aa1 Context r3) {
            Intrinsics.X0O(r3, "context");
            r3.startActivity(new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS"));
        }

        public final boolean IiI10X() {
            return ServiceUtils.isServiceRunning(MyNotificationListenerService.class);
        }

        public final boolean O00(@aa1 Context r4) {
            Intrinsics.X0O(r4, "context");
            boolean r5 = NotificationManagerCompat.getEnabledListenerPackages(r4).contains(r4.getPackageName());
            i1O0OXO1O.OXO1.IiI10X("MyNotificationListenerService isEnabled=" + r5);
            return r5;
        }

        public final void OXO1(@aa1 Context r2) {
            Intrinsics.X0O(r2, "context");
            if (O00(r2) == true) goto L5;
            return;
        L5:
            if (IiI10X() == true) goto L9;
            XOO0ii0(r2);
            return;
        }

        public final void XIi00iiXO(@aa1 Context r4) {
            Intrinsics.X0O(r4, "context");
            ComponentName r0 = new ComponentName(r4, MyNotificationListenerService.class);
            r4.getPackageManager().setComponentEnabledSetting(r0, 2, 1);
        }

        public final boolean XO0O10(@aa1 String r5, @aa1 String[] r6) {
            Intrinsics.X0O(r5, "packageName");
            Intrinsics.X0O(r6, "filter");
            int r0 = r6.length;
            int r2 = 0;
        L3:
            if (r2 >= r0) goto L9;
            if (Intrinsics.XOO0ii0(r6[r2], r5) == true) goto L6;
            r2 = r2 + 1;
            goto L3
        L6:
            return true;
        L9:
            return false;
        }

        public final void XOO0ii0(@aa1 Context r3) {
            Intrinsics.X0O(r3, "context");
            i1O0OXO1O.OXO1.IiI10X("MyNotificationListenerService reEnable");
            XIi00iiXO(r3);
            iO(r3);
        }

        public final void iO(@aa1 Context r3) {
            Intrinsics.X0O(r3, "context");
            ComponentName r0 = new ComponentName(r3, MyNotificationListenerService.class);
            r3.getPackageManager().setComponentEnabledSetting(r0, 1, 1);
        }

        public OXO1() {
        }
    }

    static {
        O001I = new OXO1(null);
    }

    public MyNotificationListenerService() {
        this.X11iII1O1 = "";
        this.XXX11i = "";
        this.X1IX = "";
        this.X0i1O = new LinkedHashMap();
        this.iIXi1iiXI = new LinkedHashMap();
        this.iXiX011 = new LinkedHashMap();
    }

    public final void I0IIOi(StatusBarNotification r17) {
        String r0 = r17.getNotification().getChannelId();
        Intrinsics.O10IXXX0X(r0, "getChannelId(...)");
        if (StringsKt__StringsKt.iOiXX(r0, "voip_notification", true) == true) goto L6;
        i1O0OXO1O.OXO1.OXO1("MyNotificationListenerService sendNickNameToDevice -> voip_notification = false");
        return;
    L6:
        Notification r1 = r17.getNotification();
        if (r1 == null) goto L14;
        Bundle r2 = r1.extras;
        if (r2 == null) goto L14;
        String r3 = r2.getString(NotificationCompat.EXTRA_TITLE);
        if (r3 == null) goto L14;
    L13:
        String r7 = r3;
        i1O0OXO1O r4 = i1O0OXO1O.OXO1;
        r4.OXO1("MyNotificationListenerService sendNickNameToDevice -> nickName = " + r7);
        if (r7.length() != 0) goto L18;
        return;
    L18:
        BleNotification r5 = new BleNotification(12, new Date().getTime(), null, "", r7, 4, null);
        r4.OXO1("MyNotificationListenerService handleIncomingCall -> Send Notification = " + r5);
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.NOTIFICATION, BleKeyFlag.UPDATE, r5, false, false, 24, null);
        return;
    L14:
        r3 = "";
        goto L13
    }

    public final Pair<String, String> IiI10X(String r12, String r13) {
        if (StringsKt__StringsKt.iIi011O(r13, CertificateUtil.DELIMITER, false, 2, null) == false) goto L10;
        r12 = (String) StringsKt__StringsKt.i1I(r13, new String[]{CertificateUtil.DELIMITER}, false, 0, 6, null).get(0);
        String r14 = r13.substring(StringsKt__StringsKt.OO1101010(r13, CertificateUtil.DELIMITER, 0, false, 6, null));
        Intrinsics.O10IXXX0X(r14, "substring(...)");
        if (StringsKt__StringsKt.iIi011O(r12, " @ ", false, 2, null) == false) goto L7;
        r12 = (String) StringsKt__StringsKt.i1I(r12, new String[]{" @ "}, false, 0, 6, null).get(1);
        r13 = StringsKt__StringsKt.i1I(r12, new String[]{" @ "}, false, 0, 6, null).get(0) + r14;
        goto L10
    L7:
        r13 = r14.substring(1);
        Intrinsics.O10IXXX0X(r13, "substring(...)");
    L10:
        return new Pair(StringsKt__StringsKt.iX1X1(r12).toString(), StringsKt__StringsKt.iX1X1(r13).toString());
    }

    public final boolean O00() {
        return q62.OXO1.XiX0I0();
    }

    public final String OXO1(CharSequence[] r5) {
        StringBuffer r0 = new StringBuffer();
        if (r5 == null) goto L7;
        int r1 = r5.length;
        int r2 = 0;
    L5:
        if (r2 >= r1) goto L7;
        r0.append(r5[r2]);
        r2 = r2 + 1;
    L7:
        String r6 = r0.toString();
        Intrinsics.O10IXXX0X(r6, "toString(...)");
        return r6;
    }

    public final String XIi00iiXO(Notification r3, String r4) {
        Bundle r5 = r3.extras;
        if (r5 == null) goto L28;
        CharSequence[] r6 = r5.getCharSequenceArray(NotificationCompat.EXTRA_TEXT_LINES);
        if (r6 == null) goto L28;
        if (r6.length != 0) goto L9;
        boolean r0 = true;
    L10:
        if (r0 == true) goto L28;
        int r1 = r4.hashCode();
        if (r1 == (-1901151293)) goto L25;
        if (r1 == (-1547699361)) goto L22;
        if (r1 == 10619783) goto L19;
    L27:
        Object r7 = ArraysKt___ArraysKt.IO0(r6);
        Intrinsics.O10IXXX0X(r7, "first(...)");
        String r8 = cp5.OO((CharSequence) r7);
    L29:
        i1O0OXO1O.OXO1.OXO1("getTextlines -> " + r8);
        return r8;
    L19:
        if (r4.equals(BleNotification.TWITTER) == false) goto L27;
    L26:
        Object r9 = ArraysKt___ArraysKt.iXXX10(r6);
        Intrinsics.O10IXXX0X(r9, "last(...)");
        r8 = cp5.OO((CharSequence) r9);
        goto L29
    L22:
        if (r4.equals(BleNotification.WHATS_APP) == true) goto L26;
    L25:
        if (r4.equals(BleNotification.ZALO) == false) goto L27;
    L9:
        r0 = false;
    L28:
        r8 = null;
        goto L29
    }

    public final boolean XO0O10(String r2, String r3) {
        if (r2 == null) goto L21;
        switch(r2.hashCode()) {
            case -1547699361: goto L16;
            case 714499313: goto L13;
            case 1659293491: goto L10;
            case 2094270320: goto L7;
            default: goto L21;
        };
    L7:
        if (r2.equals(BleNotification.SNAPCHAT) == false) goto L21;
        return false;
    L10:
        if (r2.equals(BleNotification.GIF_MAKER) == false) goto L21;
        return false;
    L13:
        if (r2.equals("com.facebook.katana") == false) goto L21;
        return false;
    L16:
        if (r2.equals(BleNotification.WHATS_APP) == false) goto L21;
        return false;
    L21:
        return Intrinsics.XOO0ii0(this.X0i1O.get(r2), r3);
    }

    public final Pair<String, String> XOO0ii0(String r11, String r12, String r13, String r14) {
        if (Intrinsics.XOO0ii0(r13, BleNotification.GMAIL) == true) goto L5;
        String r4 = r12;
        if (Intrinsics.XOO0ii0(r13, BleNotification.WHATS_APP) == false) goto L15;
        return IiI10X(r11, r4);
    L15:
        if (Intrinsics.XOO0ii0(r11, r14) == true) goto L17;
    L18:
        String r15 = r4;
    L20:
        return new Pair(StringsKt__StringsKt.iX1X1(r11).toString(), StringsKt__StringsKt.iX1X1(r15).toString());
    L17:
        return IiI10X(r11, r4);
    L5:
        if (StringsKt__StringsKt.iIi011O(r12, " ", false, 2, null) == false) goto L7;
        r11 = (String) StringsKt__StringsKt.i1I(r12, new String[]{" "}, false, 0, 6, null).get(0);
        r15 = r12.substring(StringsKt__StringsKt.OO1101010(r12, " ", 0, false, 6, null));
        Intrinsics.O10IXXX0X(r15, "substring(...)");
        goto L20
    L7:
        r4 = r12;
        if (StringsKt__StringsKt.iIi011O(r4, "  ", false, 2, null) == false) goto L18;
        r11 = (String) StringsKt__StringsKt.i1I(r4, new String[]{"  "}, false, 0, 6, null).get(0);
        r15 = r4.substring(StringsKt__StringsKt.OO1101010(r4, "  ", 0, false, 6, null));
        Intrinsics.O10IXXX0X(r15, "substring(...)");
        goto L20
    }

    public final boolean iO(String r6) {
        Long r0 = this.iIXi1iiXI.get(r6);
        i1O0OXO1O.OXO1.OXO1("Last push time: " + r0 + " ,packageName = " + r6);
        if (r0 != null) goto L5;
        return false;
    L5:
        if ((System.currentTimeMillis() - r0.longValue()) >= 600) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        i1O0OXO1O.OXO1.IiI10X("MyNotificationListenerService onCreate");
        MusicControllerCompat r0 = MusicControllerCompat.Companion.newInstance();     // Catch: Exception -> L5
        r0.launch(this);     // Catch: Exception -> L5
        this.I1 = r0;     // Catch: Exception -> L5
        return;
    L5:
        e = move-exception;
        i1O0OXO1O.OXO1.IiI10X("MyNotificationListenerService MusicController launch error:" + e.getMessage());
    }

    @Override // android.service.notification.NotificationListenerService, android.app.Service
    public void onDestroy() {
        i1O0OXO1O.OXO1.IiI10X("MyNotificationListenerService onDestroy");
        MusicControllerCompat r0 = this.I1;
        if (r0 == null) goto L5;
        r0.exit();
    L5:
        super.onDestroy();
    }

    @Override // android.service.notification.NotificationListenerService
    @RequiresApi(api = 24)
    public void onListenerDisconnected() {
        i1O0OXO1O.OXO1.IiI10X("MyNotificationListenerService onListenerDisconnected");
        NotificationListenerService.requestRebind(new ComponentName(this, MyNotificationListenerService.class));
    }

    @Override // android.service.notification.NotificationListenerService
    public void onNotificationPosted(@aa1 StatusBarNotification r33) {
        Intrinsics.X0O(r33, "sbn");
        super.onNotificationPosted(r33);
    L21:
        e = move-exception;
        e.printStackTrace();
        return;
    L4:
        if (BleConnector.INSTANCE.isBound() == true) goto L7;
        return;
    L7:
        if (q62.OXO1.I0IIOI() == false) goto L407;
        String r10 = AppUtils.getAppName(r33.getPackageName());     // Catch: Exception -> L21
        i1O0OXO1O r11 = i1O0OXO1O.OXO1;     // Catch: Exception -> L21
        r11.IiI10X("MyNotificationListenerService onNotificationPosted -> " + O00() + " " + getPackageName() + ", " + r33.getPackageName() + ", " + r10);     // Catch: Exception -> L21
        String r6 = r33.getPackageName();     // Catch: Exception -> L21
        if (r6 != null) goto L13;
        return;
    L13:
        if (StringsKt__StringsKt.iIi011O(r6, "shadowsocks", false, 2, null) == false) goto L17;
        return;
    L17:
        if (ArraysKt___ArraysKt.XOOOI0X(i72.OXO1.I1(), r6) == true) goto L19;
        a01 r12 = a01.OXO1;     // Catch: Exception -> L21
        if (r12.iO().getBoolean(b01.XO0O10, false) == false) goto L26;
    L28:
        long r14 = r33.getPostTime();     // Catch: Exception -> L21
        long r9 = r33.getNotification().when;     // Catch: Exception -> L21
        r11.IiI10X("MyNotificationListenerService onNotificationPosted -> postTime:" + O0X11OiO.iX1O1().format(Long.valueOf(r14)) + " when:" + O0X11OiO.iX1O1().format(Long.valueOf(r9)) + " sbn: " + r33 + ", notification.extras: " + r33.getNotification().extras);     // Catch: Exception -> L21
        if (r33.getNotification().extras == null) goto L37;
        StringBuffer r2 = new StringBuffer();     // Catch: Exception -> L21
        Iterator<String> r7 = r33.getNotification().extras.keySet().iterator();     // Catch: Exception -> L21
    L32:
        if (r7.hasNext() == false) goto L34;
        String r13 = r7.next();     // Catch: Exception -> L21
        r2.append("Key = " + r13 + ", Value = " + r33.getNotification().extras.get(r13) + "\n");     // Catch: Exception -> L21
        goto L32
    L34:
        i1O0OXO1O.OXO1.IiI10X("MyNotificationListenerService onNotificationPosted notification.extras -> " + r2);     // Catch: Exception -> L21
    L37:
        if (O00() == true) goto L48;
        if (Intrinsics.XOO0ii0(r6, BleNotification.GMAIL) == false) goto L48;
        if (r33.getId() != 0) goto L44;
        return;
    L44:
        if (r14 <= this.IO) goto L413;
        this.IO = r14;     // Catch: Exception -> L21
        goto L48
    L413:
        return;
    L48:
        if (Intrinsics.XOO0ii0(r6, BleNotification.OUT_LOOK) == false) goto L53;
        if (r33.getId() == 1) goto L53;
        return;
    L53:
        if (Intrinsics.XOO0ii0(r6, BleNotification.YAHOO_MAIL) == false) goto L61;
        if (r33.getTag() == null) goto L415;
        String r3 = r33.getTag();     // Catch: Exception -> L21
        Intrinsics.O10IXXX0X(r3, "getTag(...)");     // Catch: Exception -> L21
        if (StringsKt__StringsKt.iIi011O(r3, "summary", false, 2, null) == true) goto L61;
        return;
    L415:
        return;
    L61:
        if (Intrinsics.XOO0ii0(r6, BleNotification.WHATS_APP) == false) goto L69;
        if (TextUtils.isEmpty(r33.getTag()) == false) goto L69;
        I0IIOi(r33);     // Catch: Exception -> L21
        String r4 = r33.getNotification().getChannelId();     // Catch: Exception -> L21
        Intrinsics.O10IXXX0X(r4, "getChannelId(...)");     // Catch: Exception -> L21
        if (StringsKt__StringsKt.iIi011O(r4, "voip_notification", false, 2, null) == true) goto L69;
        return;
    L69:
        if (Intrinsics.XOO0ii0(r6, "com.facebook.orca") == true) goto L403;
    L73:
        a01 r5 = a01.OXO1;     // Catch: Exception -> L21
        if (r5.iO().getBoolean(b01.XO0O10, false) == true) goto L76;
    L78:
        Bundle r15 = r33.getNotification().extras;     // Catch: Exception -> L21
        CharSequence r16 = r15.getCharSequence(NotificationCompat.EXTRA_TITLE);     // Catch: Exception -> L21
        if (Intrinsics.XOO0ii0(r6, BleNotification.ANDROID_EMAIL) == false) goto L83;
        if (r16 != null) goto L83;
        return;
    L83:
        if (r16 != null) goto L86;
        r16 = "";
    L86:
        if (O00() == false) goto L90;
        Notification r17 = r33.getNotification();     // Catch: Exception -> L21
        Intrinsics.O10IXXX0X(r17, "getNotification(...)");     // Catch: Exception -> L21
        String r18 = XIi00iiXO(r17, r6);     // Catch: Exception -> L21
        if (r18 == null) goto L90;
    L92:
        if (r18.length() == 0) goto L95;
        CharSequence r19 = r18;
        boolean r110 = true;
    L106:
        if (r16.length() != 0) goto L111;
        if (r19.length() != 0) goto L111;
        return;
    L111:
        if (oe5.OX0X1O10X(r16.toString(), "null", true) == true) goto L113;
    L115:
        boolean r23 = r110;
        if (StringsKt__StringsKt.iIi011O(r16, "正在运行", false, 2, null) == false) goto L123;
        if (StringsKt__StringsKt.iIi011O(r16, "短信", false, 2, null) == false) goto L120;
        return;
    L120:
        if (StringsKt__StringsKt.iIi011O(r16, "酷狗音乐", false, 2, null) == false) goto L123;
        return;
    L123:
        if (StringsKt__StringsKt.iIi011O(r19, "QQ正在后台运行", false, 2, null) == false) goto L126;
        return;
    L126:
        if (Intrinsics.XOO0ii0(r6, BleNotification.VIBER) == false) goto L169;
        if (StringsKt__StringsKt.iIi011O(r19, "Выполняется вызов", false, 2, null) == false) goto L130;
        return;
    L130:
        if (StringsKt__StringsKt.iIi011O(r19, "Call in progress", false, 2, null) == false) goto L132;
        return;
    L132:
        if (StringsKt__StringsKt.iIi011O(r19, "正在通话中", false, 2, null) == false) goto L134;
        return;
    L134:
        if (StringsKt__StringsKt.iIi011O(r19, "Probíhá hovor", false, 2, null) == false) goto L136;
        return;
    L136:
        if (StringsKt__StringsKt.iIi011O(r19, "A hívás folyamatban", false, 2, null) == false) goto L138;
        return;
    L138:
        if (StringsKt__StringsKt.iIi011O(r19, "Prebieha hovor", false, 2, null) == false) goto L140;
        return;
    L140:
        if (StringsKt__StringsKt.iIi011O(r19, "Laufendes Gespräch", false, 2, null) == false) goto L142;
        return;
    L142:
        if (StringsKt__StringsKt.iIi011O(r19, "Oproep gaande", false, 2, null) == false) goto L144;
        return;
    L144:
        if (StringsKt__StringsKt.iIi011O(r19, "Puhelu käynnissä", false, 2, null) == false) goto L146;
        return;
    L146:
        if (StringsKt__StringsKt.iIi011O(r19, "Samtal pågår", false, 2, null) == false) goto L148;
        return;
    L148:
        if (StringsKt__StringsKt.iIi011O(r19, "Opkald i gang", false, 2, null) == false) goto L150;
        return;
    L150:
        if (StringsKt__StringsKt.iIi011O(r19, "Appel en cours", false, 2, null) == false) goto L152;
        return;
    L152:
        if (StringsKt__StringsKt.iIi011O(r19, "Samtale pågår", false, 2, null) == false) goto L154;
        return;
    L154:
        if (StringsKt__StringsKt.iIi011O(r19, "Arama sürüyor", false, 2, null) == false) goto L156;
        return;
    L156:
        if (StringsKt__StringsKt.iIi011O(r19, "通話中", false, 2, null) == false) goto L158;
        return;
    L158:
        if (StringsKt__StringsKt.iIi011O(r19, "Chamada em curso", false, 2, null) == false) goto L160;
        return;
    L160:
        if (StringsKt__StringsKt.iIi011O(r19, "Llamada en curso", false, 2, null) == false) goto L162;
        return;
    L162:
        if (StringsKt__StringsKt.iIi011O(r19, "Chiamata in corso", false, 2, null) == false) goto L164;
        return;
    L164:
        if (StringsKt__StringsKt.iIi011O(r19, "통화 진행 중", false, 2, null) == false) goto L166;
        return;
    L166:
        if (StringsKt__StringsKt.iIi011O(r19, "Persediaan sedang dijalankan", false, 2, null) == false) goto L169;
        return;
    L169:
        if (Intrinsics.XOO0ii0(r6, "com.tencent.mm") == false) goto L210;
        if (StringsKt__StringsKt.iIi011O(r19, "語音通話中，輕觸以繼續", false, 2, null) == false) goto L173;
        return;
    L173:
        if (StringsKt__StringsKt.iIi011O(r19, "语音通话中, 轻击以继续", false, 2, null) == false) goto L175;
        return;
    L175:
        if (StringsKt__StringsKt.iIi011O(r19, "Tap to continue as voice call in progress", false, 2, null) == false) goto L177;
        return;
    L177:
        if (StringsKt__StringsKt.iIi011O(r19, "Ketuk untuk lanjut selama panggilan suara berlangsung", false, 2, null) == false) goto L179;
        return;
    L179:
        if (StringsKt__StringsKt.iIi011O(r19, "Ketik untuk teruskan sebagai panggilan suara dalam perkembangan", false, 2, null) == false) goto L181;
        return;
    L181:
        if (StringsKt__StringsKt.iIi011O(r19, "Toque para continuar mientras la llamada de voz está en curso", false, 2, null) == false) goto L183;
        return;
    L183:
        if (StringsKt__StringsKt.iIi011O(r19, "진행 중인 음성 통화를 계속하려면 누르십시오", false, 2, null) == false) goto L185;
        return;
    L185:
        if (StringsKt__StringsKt.iIi011O(r19, "Tocca per continuare quando è in corso una chiamata voce", false, 2, null) == false) goto L187;
        return;
    L187:
        if (StringsKt__StringsKt.iIi011O(r19, "音声呼び出し中にタップして続行", false, 2, null) == false) goto L189;
        return;
    L189:
        if (StringsKt__StringsKt.iIi011O(r19, "Toque para continuar enquanto a chamada de voz está em progresso", false, 2, null) == false) goto L191;
        return;
    L191:
        if (StringsKt__StringsKt.iIi011O(r19, "Нажмите, чтобы продолжить, пока идет голосовой вызов", false, 2, null) == false) goto L193;
        return;
    L193:
        if (StringsKt__StringsKt.iIi011O(r19, "แตะเพื่อทำต่อไป ขณะที่โทรสายเสียงยังใช้งานอยู่", false, 2, null) == false) goto L195;
        return;
    L195:
        if (StringsKt__StringsKt.iIi011O(r19, "Nhấp để tiếp tục vì cuộc gọi thoại đang diễn ra", false, 2, null) == false) goto L197;
        return;
    L197:
        if (StringsKt__StringsKt.iIi011O(r19, "المس للمتابعة حيث إن المكالمة الصوتية جارية", false, 2, null) == false) goto L199;
        return;
    L199:
        if (StringsKt__StringsKt.iIi011O(r19, "Sesli arama sürdüğünden devam etmek için dokunun", false, 2, null) == false) goto L201;
        return;
    L201:
        if (StringsKt__StringsKt.iIi011O(r19, "Tippen, um während einem Sprachanruf fortzufahren", false, 2, null) == false) goto L203;
        return;
    L203:
        if (StringsKt__StringsKt.iIi011O(r19, "Touchez pour continuer pendant l'appel vocal", false, 2, null) == false) goto L205;
        return;
    L205:
        if (StringsKt__StringsKt.iIi011O(r19, "လုပ္ေဆာင္ေနစဥ္ အသံေခၚဆိုမႈကဲ့သို႔ဆက္လုပ္ရန္ႏွိပ္ပါ", false, 2, null) == false) goto L207;
        return;
    L207:
        if (StringsKt__StringsKt.iIi011O(r19, "ແຕະ\u200bເພື່ອ\u200bສືບ\u200bຕໍ່ເປັນ\u200bການ\u200bໂທ\u200bດ້ວຍ\u200bສຽງ\u200bພວມ\u200bດຳ\u200bເນີນ\u200bຢູ່", false, 2, null) == false) goto L210;
        return;
    L210:
        if (Intrinsics.XOO0ii0(r6, BleNotification.GMAIL) == false) goto L215;
        if (StringsKt__StringsKt.iIi011O(r19, "メールの同期中", false, 2, null) == false) goto L215;
        return;
    L215:
        if (Intrinsics.XOO0ii0(r6, BleNotification.ANDROID_EMAIL) == false) goto L224;
        if (StringsKt__StringsKt.iIi011O(r16, "正在发送邮件...", false, 2, null) == false) goto L219;
        return;
    L219:
        if (StringsKt__StringsKt.iIi011O(r16, "Sending email…", false, 2, null) == false) goto L221;
        return;
    L221:
        if (StringsKt__StringsKt.iIi011O(r16, "メールを送信中...", false, 2, null) == false) goto L224;
        return;
    L224:
        if (Intrinsics.XOO0ii0(r6, BleNotification.WHATS_APP) == false) goto L257;
        if (StringsKt__StringsKt.iIi011O(r19, "正在将视频发送给", false, 2, null) == false) goto L228;
        return;
    L228:
        if (StringsKt__StringsKt.iIi011O(r19, "正在发送文件给", false, 2, null) == false) goto L230;
        return;
    L230:
        if (StringsKt__StringsKt.iIi011O(r19, "正在发送音频文件给", false, 2, null) == false) goto L232;
        return;
    L232:
        if (StringsKt__StringsKt.iIi011O(r19, "Sending video to", false, 2, null) == false) goto L234;
        return;
    L234:
        if (StringsKt__StringsKt.iIi011O(r19, "Sending file to", false, 2, null) == false) goto L236;
        return;
    L236:
        if (StringsKt__StringsKt.iIi011O(r19, "Sending audio to", false, 2, null) == false) goto L238;
        return;
    L238:
        if (StringsKt__StringsKt.iIi011O(r19, "正在傳送音訊檔給", false, 2, null) == false) goto L240;
        return;
    L240:
        if (StringsKt__StringsKt.iIi011O(r19, "正在傳送文件給", false, 2, null) == false) goto L242;
        return;
    L242:
        if (StringsKt__StringsKt.iIi011O(r19, "正在傳送影片給", false, 2, null) == false) goto L244;
        return;
    L244:
        if (StringsKt__StringsKt.iIi011O(r19, "にファイルを送信中", false, 2, null) == false) goto L246;
        return;
    L246:
        if (StringsKt__StringsKt.iIi011O(r19, "ビデオを送信中", false, 2, null) == false) goto L248;
        return;
    L248:
        if (StringsKt__StringsKt.iIi011O(r19, "に音声を送信中", false, 2, null) == false) goto L250;
        return;
    L250:
        if (StringsKt__StringsKt.iIi011O(r19, "Envoi du fichier à", false, 2, null) == false) goto L252;
        return;
    L252:
        if (StringsKt__StringsKt.iIi011O(r19, "Envoi du fichier audio à", false, 2, null) == false) goto L254;
        return;
    L254:
        if (StringsKt__StringsKt.iIi011O(r19, "Envoi de la vidéo à", false, 2, null) == false) goto L257;
        return;
    L257:
        if (Intrinsics.XOO0ii0(r33.getNotification().getChannelId(), "com.miui.player:remote-notification") == false) goto L260;
        return;
    L260:
        if (O00() == true) goto L273;
        if (q62.OXO1.ii0111XI() == false) goto L273;
        if (Intrinsics.XOO0ii0(this.X11iII1O1, r6) == true) goto L266;
    L270:
        this.X11iII1O1 = r6;     // Catch: Exception -> L21
        this.iX1O1 = System.currentTimeMillis();     // Catch: Exception -> L21
        goto L273
    L266:
        if (this.iX1O1 == 0) goto L270;
        if ((System.currentTimeMillis() - this.iX1O1) > 500) goto L270;
        return;
    L273:
        if (r5.iO().getBoolean(b01.iI, false) == false) goto L280;
        if (Intrinsics.XOO0ii0(r6, BleNotification.GOOGLE_DUO) == true) goto L277;
        return;
    L277:
        if (r5.iO().getBoolean(b01.XIi00iiXO) == false) goto L485;
        long r111 = new Date().getTime();     // Catch: Exception -> L21
        String r112 = r16.toString();     // Catch: Exception -> L21
        String r0 = Utils.getApp().getString(R.string.incoming_call);     // Catch: Exception -> L21
        Intrinsics.O10IXXX0X(r0, "getString(...)");     // Catch: Exception -> L21
        BleNotification r113 = new BleNotification(1, r111, null, r112, r0, 4, null);     // Catch: Exception -> L21
        i1O0OXO1O.OXO1.IiI10X("onNotificationPosted handleIncomingCall -> Send Notification = " + r113);     // Catch: Exception -> L21
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.NOTIFICATION, BleKeyFlag.UPDATE, r113, false, false, 24, null);     // Catch: Exception -> L21
        BleInitializer.IO.OiXI1OiX0(BleNotification.copy$default(r113, 0, 0, r6, null, null, 27, null));     // Catch: Exception -> L21
        Unit r1 = Unit.OXO1;     // Catch: Exception -> L21
        return;
    L485:
        return;
    L280:
        if (Intrinsics.XOO0ii0(r6, BleNotification.GOOGLE_DUO) == false) goto L289;
        String r8 = r33.getNotification().getChannelId();     // Catch: Exception -> L21
        Intrinsics.O10IXXX0X(r8, "getChannelId(...)");     // Catch: Exception -> L21
        if (StringsKt__StringsKt.iIi011O(r8, "call_notifications", false, 2, null) == false) goto L286;
        BleInitializer r20 = BleInitializer.IO;     // Catch: Exception -> L21
        if (r20.I0XXi0X() != null) goto L487;
        r20.OiXI1OiX0(new BleNotification(127, new Date().getTime(), r6, r16.toString(), r19.toString()));     // Catch: Exception -> L21
        return;
    L487:
        return;
    L286:
        String r21 = r33.getNotification().getChannelId();     // Catch: Exception -> L21
        Intrinsics.O10IXXX0X(r21, "getChannelId(...)");     // Catch: Exception -> L21
        if (StringsKt__StringsKt.iIi011O(r21, "missed_calls", false, 2, null) == false) goto L289;
        return;
    L289:
        i1O0OXO1O r114 = i1O0OXO1O.OXO1;     // Catch: Exception -> L21
        BleInitializer r22 = BleInitializer.IO;     // Catch: Exception -> L21
        r114.OXO1("MyNotificationListenerService onNotificationPosted ->packageName = " + r6 + " , isSendMissedCall = " + r22.XOXOIX0Oi() + " , isSmsNotificationReceive = " + r22.iIIIiIO0() + " , title = " + r16 + " , content = " + r19);     // Catch: Exception -> L21
        if (r19.length() != 0) goto L295;
        if (Intrinsics.XOO0ii0(r6, BleNotification.TELEGRAM) == true) goto L295;
        return;
    L295:
        if (Intrinsics.XOO0ii0(r6, "android") == false) goto L297;
        return;
    L297:
        if (Intrinsics.XOO0ii0(r6, "com.android.systemui") == false) goto L299;
        return;
    L299:
        if (Intrinsics.XOO0ii0(r6, "com.xiaomi.simactivate.service") == false) goto L301;
        return;
    L301:
        if (Intrinsics.XOO0ii0(r6, "com.miui.smsextra") == false) goto L303;
        return;
    L303:
        if (Intrinsics.XOO0ii0(r6, "Com.android.deskclock") == true) goto L495;
        long r24 = System.currentTimeMillis() - r22.IOi1O0();     // Catch: Exception -> L21
        if (Intrinsics.XOO0ii0(r6, "com.android.mms") == true) goto L319;
        if (Intrinsics.XOO0ii0(r6, BleNotification.ANDROID_MMS_SERVICE) == true) goto L319;
        if (Intrinsics.XOO0ii0(r6, BleNotification.GOOGLE_MMS) == true) goto L319;
        if (Intrinsics.XOO0ii0(r6, BleNotification.ONE_PLUS_MMS) == true) goto L319;
        if (Intrinsics.XOO0ii0(r6, BleNotification.SAMSUNG_MMS) == true) goto L319;
    L328:
        if (Intrinsics.XOO0ii0(r6, BleNotification.ANDROID_INCALLUI) == true) goto L340;
        if (Intrinsics.XOO0ii0(r6, BleNotification.ANDROID_TELECOM) == true) goto L340;
        if (Intrinsics.XOO0ii0(r6, BleNotification.GOOGLE_TELECOM) == true) goto L340;
        if (Intrinsics.XOO0ii0(r6, BleNotification.SAMSUNG_INCALLUI) == true) goto L340;
        if (Intrinsics.XOO0ii0(r6, BleNotification.SAMSUNG_TELECOM) == true) goto L340;
        if (Intrinsics.XOO0ii0(r6, BleNotification.ONE_PLUS_TELECOM) == true) goto L340;
    L354:
        if (Intrinsics.XOO0ii0(r6, BleNotification.SAMSUNG_MMS) == false) goto L356;
        String r25 = "com.android.mms";
    L358:
        if (Intrinsics.XOO0ii0(r25, "com.android.mms") == false) goto L363;
        if (r5.iO().getBoolean(b01.iO, false) == true) goto L363;
        r114.OXO1("MyNotificationListenerService  NOTIFICATION_SMS = " + r5.iO().getBoolean(b01.iO, false));     // Catch: Exception -> L21
        return;
    L363:
        if (Intrinsics.XOO0ii0(r25, BleNotification.GOOGLE_MMS) == true) goto L365;
    L370:
        Object r115 = r16;
    L372:
        if (WxManager.OXO1.O0O0X0iOi() == false) goto L377;
        if ("com.tencent.mm".equals(r25) == false) goto L377;
        r114.OXO1("MyNotificationListenerService WxNotificationServerEnable");     // Catch: Exception -> L21
        return;
    L377:
        if (WAManager.OXO1.X100O() == true) goto L379;
    L381:
        BleNotification r26 = new BleNotification(127, r14, r25, r115.toString(), r19.toString());     // Catch: Exception -> L21
        String r116 = r25;
        if (O00() == true) goto L385;
        r114.OXO1("MyNotificationListenerService onNotificationPosted -> " + r23 + " Send Notification = " + r26);     // Catch: Exception -> L21
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.NOTIFICATION, BleKeyFlag.UPDATE, r26, false, false, 24, null);     // Catch: Exception -> L21
        return;
    L385:
        if (iO(r116) == true) goto L395;
        if (r23 == false) goto L391;
        String r27 = OXO1(r15.getCharSequenceArray(NotificationCompat.EXTRA_TEXT_LINES));     // Catch: Exception -> L21
        if (Intrinsics.XOO0ii0(this.iXiX011.get(r116), r27) == false) goto L390;
        r114.OXO1("MyNotificationListenerService onNotificationPosted -> repeat textline");     // Catch: Exception -> L21
        this.iIXi1iiXI.put(r116, Long.valueOf(System.currentTimeMillis()));     // Catch: Exception -> L21
        return;
    L390:
        this.iXiX011.put(r116, r27);     // Catch: Exception -> L21
        String r28 = r26.getMTitle();     // Catch: Exception -> L21
        String r29 = r26.getMContent();     // Catch: Exception -> L21
        Intrinsics.XXI(r10);     // Catch: Exception -> L21
        Pair<String, String> r30 = XOO0ii0(r28, r29, r116, r10);     // Catch: Exception -> L21
        r26.setMTitle(r30.getFirst());     // Catch: Exception -> L21
        r26.setMContent(r30.getSecond());     // Catch: Exception -> L21
        r114.OXO1("MyNotificationListenerService onNotificationPosted -> new content " + r30);     // Catch: Exception -> L21
    L391:
        String r31 = r26.getMTitle() + Pattern.compile("[\\s]").matcher(r26.getMContent()).replaceAll("");     // Catch: Exception -> L21
        if (XO0O10(r116, r31) == true) goto L394;
        r114.OXO1("MyNotificationListenerService onNotificationPosted -> " + r23 + " Send Notification = " + r26);     // Catch: Exception -> L21
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.NOTIFICATION, BleKeyFlag.UPDATE, r26, false, false, 24, null);     // Catch: Exception -> L21
        this.X0i1O.put(r116, r31);     // Catch: Exception -> L21
        this.iIXi1iiXI.put(r116, Long.valueOf(System.currentTimeMillis()));     // Catch: Exception -> L21
    L396:
        Unit r32 = Unit.OXO1;     // Catch: Exception -> L21
        return;
    L394:
        r114.OXO1("MyNotificationListenerService onNotificationPosted -> isRepeated");     // Catch: Exception -> L21
        goto L396
    L395:
        r114.OXO1("MyNotificationListenerService onNotificationPosted -> in interval time");     // Catch: Exception -> L21
        goto L396
    L379:
        if (BleNotification.WHATS_APP.equals(r25) == false) goto L381;
        r114.OXO1("MyNotificationListenerService WANotificationServerEnable");     // Catch: Exception -> L21
        return;
    L365:
        if (r16.toString().length() != 0) goto L368;
    L369:
        r115 = "Messages";
        goto L372
    L368:
        if (Intrinsics.XOO0ii0(r16.toString(), "null") == false) goto L370;
    L356:
        r25 = r6;
    L340:
        if (r22.XOXOIX0Oi() == false) goto L342;
        this.XXX11i = r16.toString();     // Catch: Exception -> L21
        this.X1IX = r19.toString();     // Catch: Exception -> L21
        r22.XX00XX(false);     // Catch: Exception -> L21
        return;
    L342:
        String r34 = r33.getNotification().getChannelId();     // Catch: Exception -> L21
        Intrinsics.O10IXXX0X(r34, "getChannelId(...)");     // Catch: Exception -> L21
        if (StringsKt__StringsKt.iIi011O(r34, "MiuiTelecomMissedCalls", false, 2, null) == true) goto L345;
    L349:
        String r35 = r33.getNotification().getChannelId();     // Catch: Exception -> L21
        Intrinsics.O10IXXX0X(r35, "getChannelId(...)");     // Catch: Exception -> L21
        if (StringsKt__StringsKt.iIi011O(r35, "phone_ongoing_call", false, 2, null) == true) goto L500;
        this.XXX11i = r16.toString();     // Catch: Exception -> L21
        this.X1IX = r19.toString().toString();     // Catch: Exception -> L21
        goto L354
    L500:
        return;
    L345:
        if (Intrinsics.XOO0ii0(r16.toString(), this.XXX11i) == false) goto L349;
        if (Intrinsics.XOO0ii0(r19.toString(), this.X1IX) == false) goto L349;
        return;
    L319:
        if (StringsKt__StringsKt.iIi011O(r19, "Tap for more information or to stop the app", false, 2, null) == false) goto L322;
        return;
    L322:
        if (r22.iIIIiIO0() == true) goto L324;
    L326:
        r22.IIO11(false);     // Catch: Exception -> L21
        r22.I11iXOO(System.currentTimeMillis());     // Catch: Exception -> L21
        goto L328
    L324:
        if (r24 >= 10000) goto L326;
        return;
    L495:
        return;
    L113:
        if (r19.length() != 0) goto L115;
        return;
    L95:
        if (BleNotification.Companion.isEmail(r6) == false) goto L102;
        CharSequence r117 = r15.getCharSequence(NotificationCompat.EXTRA_BIG_TEXT, "");     // Catch: Exception -> L21
        Intrinsics.XXI(r117);     // Catch: Exception -> L21
        if (r117.length() != 0) goto L99;
        r117 = r15.getCharSequence(NotificationCompat.EXTRA_TEXT, "");     // Catch: Exception -> L21
    L99:
        Intrinsics.XXI(r117);     // Catch: Exception -> L21
        if (r117.length() != 0) goto L103;
        r117 = r15.getCharSequence(NotificationCompat.EXTRA_SUB_TEXT, "");     // Catch: Exception -> L21
    L103:
        Intrinsics.XXI(r117);     // Catch: Exception -> L21
        r19 = r117;
        r110 = false;
        goto L106
    L102:
        r117 = r15.getCharSequence(NotificationCompat.EXTRA_TEXT, "");     // Catch: Exception -> L21
    L90:
        r18 = "";
        goto L92
    L76:
        if (Intrinsics.XOO0ii0(r6, BleNotification.HUAWEI_SYSTEM_MANAGER) == false) goto L78;
        return;
    L403:
        String r36 = r33.getNotification().category;     // Catch: Exception -> L401
        Intrinsics.O10IXXX0X(r36, "category");     // Catch: Exception -> L401
        Locale r118 = Locale.getDefault();     // Catch: Exception -> L401
        Intrinsics.O10IXXX0X(r118, "getDefault(...)");     // Catch: Exception -> L401
        String r37 = r36.toLowerCase(r118);     // Catch: Exception -> L401
        Intrinsics.O10IXXX0X(r37, "toLowerCase(...)");     // Catch: Exception -> L401
        if (StringsKt__StringsKt.iIi011O(r37, NotificationCompat.CATEGORY_SERVICE, false, 2, null) == false) goto L73;
        return;
    L26:
        if (r12.iO().getBoolean(b01.OXO1 + r6) == true) goto L28;
        return;
    L19:
        if (a01.OXO1.iO().getBoolean(b01.OXO1 + r6) == true) goto L28;
        return;
    }

    @Override // android.service.notification.NotificationListenerService
    public void onNotificationRemoved(@tb1 StatusBarNotification r1) {
    }
}
