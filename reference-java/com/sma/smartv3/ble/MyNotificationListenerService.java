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
import com.sma.smartv3.biz.p606wa.WAManager;
import com.sma.smartv3.biz.p607wx.WxManager;
import com.sma.smartv3.initializer.BleInitializer;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleNotification;
import com.szabh.smable3.music.MusicControllerCompat;
import java.util.Date;
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
    public static final OXO1 O001I = new OXO1(null);

    @aa1
    public static final String XXO = "MyNotificationListenerService";

    /* JADX INFO: renamed from: I1 */
    @tb1
    public MusicControllerCompat f50964I1;

    /* JADX INFO: renamed from: IO */
    public long f50965IO;
    public long iX1O1;

    @aa1
    public String X11iII1O1 = "";

    @aa1
    public String XXX11i = "";

    @aa1
    public String X1IX = "";

    @aa1
    public final Map<String, String> X0i1O = new LinkedHashMap();

    @aa1
    public final Map<String, Long> iIXi1iiXI = new LinkedHashMap();

    @aa1
    public final Map<String, String> iXiX011 = new LinkedHashMap();

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void I0IIOi(@aa1 Context context) {
            Intrinsics.X0O(context, "context");
            context.startActivity(new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS"));
        }

        public final boolean IiI10X() {
            return ServiceUtils.isServiceRunning((Class<?>) MyNotificationListenerService.class);
        }

        public final boolean O00(@aa1 Context context) {
            Intrinsics.X0O(context, "context");
            boolean zContains = NotificationManagerCompat.getEnabledListenerPackages(context).contains(context.getPackageName());
            i1O0OXO1O.OXO1.IiI10X("MyNotificationListenerService isEnabled=" + zContains);
            return zContains;
        }

        public final void OXO1(@aa1 Context context) {
            Intrinsics.X0O(context, "context");
            if (!O00(context) || IiI10X()) {
                return;
            }
            XOO0ii0(context);
        }

        public final void XIi00iiXO(@aa1 Context context) {
            Intrinsics.X0O(context, "context");
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) MyNotificationListenerService.class), 2, 1);
        }

        public final boolean XO0O10(@aa1 String packageName, @aa1 String[] filter) {
            Intrinsics.X0O(packageName, "packageName");
            Intrinsics.X0O(filter, "filter");
            for (String str : filter) {
                if (Intrinsics.XOO0ii0(str, packageName)) {
                    return true;
                }
            }
            return false;
        }

        public final void XOO0ii0(@aa1 Context context) {
            Intrinsics.X0O(context, "context");
            i1O0OXO1O.OXO1.IiI10X("MyNotificationListenerService reEnable");
            XIi00iiXO(context);
            m38159iO(context);
        }

        /* JADX INFO: renamed from: iO */
        public final void m38159iO(@aa1 Context context) {
            Intrinsics.X0O(context, "context");
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) MyNotificationListenerService.class), 1, 1);
        }

        public OXO1() {
        }
    }

    public final void I0IIOi(StatusBarNotification statusBarNotification) {
        String string;
        Bundle bundle;
        String channelId = statusBarNotification.getNotification().getChannelId();
        Intrinsics.O10IXXX0X(channelId, "getChannelId(...)");
        if (!StringsKt__StringsKt.iOiXX(channelId, "voip_notification", true)) {
            i1O0OXO1O.OXO1.OXO1("MyNotificationListenerService sendNickNameToDevice -> voip_notification = false");
            return;
        }
        Notification notification = statusBarNotification.getNotification();
        if (notification == null || (bundle = notification.extras) == null || (string = bundle.getString(NotificationCompat.EXTRA_TITLE)) == null) {
            string = "";
        }
        String str = string;
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        i1o0oxo1o.OXO1("MyNotificationListenerService sendNickNameToDevice -> nickName = " + str);
        if (str.length() == 0) {
            return;
        }
        BleNotification bleNotification = new BleNotification(12, new Date().getTime(), null, "", str, 4, null);
        i1o0oxo1o.OXO1("MyNotificationListenerService handleIncomingCall -> Send Notification = " + bleNotification);
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.NOTIFICATION, BleKeyFlag.UPDATE, bleNotification, false, false, 24, null);
    }

    public final Pair<String, String> IiI10X(String str, String str2) {
        if (StringsKt__StringsKt.iIi011O(str2, CertificateUtil.DELIMITER, false, 2, null)) {
            str = (String) StringsKt__StringsKt.i1I(str2, new String[]{CertificateUtil.DELIMITER}, false, 0, 6, null).get(0);
            String strSubstring = str2.substring(StringsKt__StringsKt.OO1101010(str2, CertificateUtil.DELIMITER, 0, false, 6, null));
            Intrinsics.O10IXXX0X(strSubstring, "substring(...)");
            if (StringsKt__StringsKt.iIi011O(str, " @ ", false, 2, null)) {
                str = (String) StringsKt__StringsKt.i1I(str, new String[]{" @ "}, false, 0, 6, null).get(1);
                str2 = StringsKt__StringsKt.i1I(str, new String[]{" @ "}, false, 0, 6, null).get(0) + strSubstring;
            } else {
                str2 = strSubstring.substring(1);
                Intrinsics.O10IXXX0X(str2, "substring(...)");
            }
        }
        return new Pair<>(StringsKt__StringsKt.iX1X1(str).toString(), StringsKt__StringsKt.iX1X1(str2).toString());
    }

    public final boolean O00() {
        return q62.OXO1.XiX0I0();
    }

    public final String OXO1(CharSequence[] charSequenceArr) {
        StringBuffer stringBuffer = new StringBuffer();
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                stringBuffer.append(charSequence);
            }
        }
        String string = stringBuffer.toString();
        Intrinsics.O10IXXX0X(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    public final String XIi00iiXO(Notification notification, String str) {
        String strM1621OO;
        CharSequence[] charSequenceArray;
        Bundle bundle = notification.extras;
        if (bundle == null || (charSequenceArray = bundle.getCharSequenceArray(NotificationCompat.EXTRA_TEXT_LINES)) == null) {
            strM1621OO = null;
        } else {
            if (charSequenceArray.length == 0) {
                strM1621OO = null;
            } else {
                int iHashCode = str.hashCode();
                if (iHashCode == -1901151293 ? !str.equals(BleNotification.ZALO) : iHashCode == -1547699361 ? !str.equals(BleNotification.WHATS_APP) : !(iHashCode == 10619783 && str.equals(BleNotification.TWITTER))) {
                    Object objIO0 = ArraysKt___ArraysKt.IO0(charSequenceArray);
                    Intrinsics.O10IXXX0X(objIO0, "first(...)");
                    strM1621OO = cp5.m1621OO((CharSequence) objIO0);
                } else {
                    Object objIXXX10 = ArraysKt___ArraysKt.iXXX10(charSequenceArray);
                    Intrinsics.O10IXXX0X(objIXXX10, "last(...)");
                    strM1621OO = cp5.m1621OO((CharSequence) objIXXX10);
                }
            }
        }
        i1O0OXO1O.OXO1.OXO1("getTextlines -> " + strM1621OO);
        return strM1621OO;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final boolean XO0O10(String str, String str2) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1547699361:
                    if (str.equals(BleNotification.WHATS_APP)) {
                        return false;
                    }
                    break;
                case 714499313:
                    if (str.equals("com.facebook.katana")) {
                        return false;
                    }
                    break;
                case 1659293491:
                    if (str.equals(BleNotification.GIF_MAKER)) {
                        return false;
                    }
                    break;
                case 2094270320:
                    if (str.equals(BleNotification.SNAPCHAT)) {
                        return false;
                    }
                    break;
            }
        }
        return Intrinsics.XOO0ii0(this.X0i1O.get(str), str2);
    }

    public final Pair<String, String> XOO0ii0(String str, String str2, String str3, String str4) {
        String str5;
        String strSubstring;
        if (Intrinsics.XOO0ii0(str3, BleNotification.GMAIL)) {
            if (StringsKt__StringsKt.iIi011O(str2, " ", false, 2, null)) {
                str = (String) StringsKt__StringsKt.i1I(str2, new String[]{" "}, false, 0, 6, null).get(0);
                strSubstring = str2.substring(StringsKt__StringsKt.OO1101010(str2, " ", 0, false, 6, null));
                Intrinsics.O10IXXX0X(strSubstring, "substring(...)");
            } else {
                str5 = str2;
                if (StringsKt__StringsKt.iIi011O(str5, "  ", false, 2, null)) {
                    str = (String) StringsKt__StringsKt.i1I(str5, new String[]{"  "}, false, 0, 6, null).get(0);
                    strSubstring = str5.substring(StringsKt__StringsKt.OO1101010(str5, "  ", 0, false, 6, null));
                    Intrinsics.O10IXXX0X(strSubstring, "substring(...)");
                }
            }
            return new Pair<>(StringsKt__StringsKt.iX1X1(str).toString(), StringsKt__StringsKt.iX1X1(strSubstring).toString());
        }
        str5 = str2;
        if (Intrinsics.XOO0ii0(str3, BleNotification.WHATS_APP)) {
            return IiI10X(str, str5);
        }
        if (Intrinsics.XOO0ii0(str, str4)) {
            return IiI10X(str, str5);
        }
        strSubstring = str5;
        return new Pair<>(StringsKt__StringsKt.iX1X1(str).toString(), StringsKt__StringsKt.iX1X1(strSubstring).toString());
    }

    /* JADX INFO: renamed from: iO */
    public final boolean m38158iO(String str) {
        Long l = this.iIXi1iiXI.get(str);
        i1O0OXO1O.OXO1.OXO1("Last push time: " + l + " ,packageName = " + str);
        return l != null && System.currentTimeMillis() - l.longValue() < 600;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        i1O0OXO1O.OXO1.IiI10X("MyNotificationListenerService onCreate");
        try {
            MusicControllerCompat musicControllerCompatNewInstance = MusicControllerCompat.Companion.newInstance();
            musicControllerCompatNewInstance.launch(this);
            this.f50964I1 = musicControllerCompatNewInstance;
        } catch (Exception e) {
            i1O0OXO1O.OXO1.IiI10X("MyNotificationListenerService MusicController launch error:" + e.getMessage());
        }
    }

    @Override // android.service.notification.NotificationListenerService, android.app.Service
    public void onDestroy() {
        i1O0OXO1O.OXO1.IiI10X("MyNotificationListenerService onDestroy");
        MusicControllerCompat musicControllerCompat = this.f50964I1;
        if (musicControllerCompat != null) {
            musicControllerCompat.exit();
        }
        super.onDestroy();
    }

    @Override // android.service.notification.NotificationListenerService
    @RequiresApi(api = 24)
    public void onListenerDisconnected() {
        i1O0OXO1O.OXO1.IiI10X("MyNotificationListenerService onListenerDisconnected");
        NotificationListenerService.requestRebind(new ComponentName(this, (Class<?>) MyNotificationListenerService.class));
    }

    /* JADX WARN: Code duplicated, block: B:90:0x02a2  */
    @Override // android.service.notification.NotificationListenerService
    public void onNotificationPosted(@aa1 StatusBarNotification sbn) {
        String strXIi00iiXO;
        CharSequence charSequence;
        boolean z;
        CharSequence charSequence2;
        Intrinsics.X0O(sbn, "sbn");
        super.onNotificationPosted(sbn);
        try {
            if (BleConnector.INSTANCE.isBound() && q62.OXO1.I0IIOI()) {
                String appName = AppUtils.getAppName(sbn.getPackageName());
                i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
                i1o0oxo1o.IiI10X("MyNotificationListenerService onNotificationPosted -> " + O00() + " " + getPackageName() + ", " + sbn.getPackageName() + ", " + appName);
                String packageName = sbn.getPackageName();
                if (packageName != null && !StringsKt__StringsKt.iIi011O(packageName, "shadowsocks", false, 2, null)) {
                    if (ArraysKt___ArraysKt.XOOOI0X(i72.OXO1.m2040I1(), packageName)) {
                        if (!a01.OXO1.m1440iO().getBoolean(b01.OXO1 + ((Object) packageName))) {
                            return;
                        }
                    } else {
                        a01 a01Var = a01.OXO1;
                        if (!a01Var.m1440iO().getBoolean(b01.XO0O10, false)) {
                            if (!a01Var.m1440iO().getBoolean(b01.OXO1 + ((Object) packageName))) {
                                return;
                            }
                        }
                    }
                    long postTime = sbn.getPostTime();
                    long j = sbn.getNotification().when;
                    i1o0oxo1o.IiI10X("MyNotificationListenerService onNotificationPosted -> postTime:" + O0X11OiO.iX1O1().format(Long.valueOf(postTime)) + " when:" + O0X11OiO.iX1O1().format(Long.valueOf(j)) + " sbn: " + sbn + ", notification.extras: " + sbn.getNotification().extras);
                    if (sbn.getNotification().extras != null) {
                        StringBuffer stringBuffer = new StringBuffer();
                        for (String str : sbn.getNotification().extras.keySet()) {
                            stringBuffer.append("Key = " + str + ", Value = " + sbn.getNotification().extras.get(str) + "\n");
                        }
                        i1O0OXO1O.OXO1.IiI10X("MyNotificationListenerService onNotificationPosted notification.extras -> " + ((Object) stringBuffer));
                    }
                    if (!O00() && Intrinsics.XOO0ii0(packageName, BleNotification.GMAIL)) {
                        if (sbn.getId() != 0 && postTime > this.f50965IO) {
                            this.f50965IO = postTime;
                        }
                        return;
                    }
                    if (!Intrinsics.XOO0ii0(packageName, BleNotification.OUT_LOOK) || sbn.getId() == 1) {
                        if (Intrinsics.XOO0ii0(packageName, BleNotification.YAHOO_MAIL)) {
                            if (sbn.getTag() == null) {
                                return;
                            }
                            String tag = sbn.getTag();
                            Intrinsics.O10IXXX0X(tag, "getTag(...)");
                            if (!StringsKt__StringsKt.iIi011O(tag, "summary", false, 2, null)) {
                                return;
                            }
                        }
                        if (Intrinsics.XOO0ii0(packageName, BleNotification.WHATS_APP) && TextUtils.isEmpty(sbn.getTag())) {
                            I0IIOi(sbn);
                            String channelId = sbn.getNotification().getChannelId();
                            Intrinsics.O10IXXX0X(channelId, "getChannelId(...)");
                            if (!StringsKt__StringsKt.iIi011O(channelId, "voip_notification", false, 2, null)) {
                                return;
                            }
                        }
                        if (Intrinsics.XOO0ii0(packageName, "com.facebook.orca")) {
                            try {
                                String category = sbn.getNotification().category;
                                Intrinsics.O10IXXX0X(category, "category");
                                Locale locale = Locale.getDefault();
                                Intrinsics.O10IXXX0X(locale, "getDefault(...)");
                                String lowerCase = category.toLowerCase(locale);
                                Intrinsics.O10IXXX0X(lowerCase, "toLowerCase(...)");
                                if (StringsKt__StringsKt.iIi011O(lowerCase, NotificationCompat.CATEGORY_SERVICE, false, 2, null)) {
                                    return;
                                }
                            } catch (Exception unused) {
                            }
                        }
                        a01 a01Var2 = a01.OXO1;
                        if (a01Var2.m1440iO().getBoolean(b01.XO0O10, false) && Intrinsics.XOO0ii0(packageName, BleNotification.HUAWEI_SYSTEM_MANAGER)) {
                            return;
                        }
                        Bundle bundle = sbn.getNotification().extras;
                        CharSequence charSequence3 = bundle.getCharSequence(NotificationCompat.EXTRA_TITLE);
                        if (Intrinsics.XOO0ii0(packageName, BleNotification.ANDROID_EMAIL) && charSequence3 == null) {
                            return;
                        }
                        if (charSequence3 == null) {
                            charSequence3 = "";
                        }
                        if (O00()) {
                            Notification notification = sbn.getNotification();
                            Intrinsics.O10IXXX0X(notification, "getNotification(...)");
                            strXIi00iiXO = XIi00iiXO(notification, packageName);
                            if (strXIi00iiXO == null) {
                                strXIi00iiXO = "";
                            }
                        } else {
                            strXIi00iiXO = "";
                        }
                        if (strXIi00iiXO.length() == 0) {
                            if (BleNotification.Companion.isEmail(packageName)) {
                                charSequence2 = bundle.getCharSequence(NotificationCompat.EXTRA_BIG_TEXT, "");
                                Intrinsics.XXI(charSequence2);
                                if (charSequence2.length() == 0) {
                                    charSequence2 = bundle.getCharSequence(NotificationCompat.EXTRA_TEXT, "");
                                }
                                Intrinsics.XXI(charSequence2);
                                if (charSequence2.length() == 0) {
                                    charSequence2 = bundle.getCharSequence(NotificationCompat.EXTRA_SUB_TEXT, "");
                                }
                            } else {
                                charSequence2 = bundle.getCharSequence(NotificationCompat.EXTRA_TEXT, "");
                            }
                            Intrinsics.XXI(charSequence2);
                            charSequence = charSequence2;
                            z = false;
                        } else {
                            charSequence = strXIi00iiXO;
                            z = true;
                        }
                        if (charSequence3.length() == 0 && charSequence.length() == 0) {
                            return;
                        }
                        if (oe5.OX0X1O10X(charSequence3.toString(), "null", true) && charSequence.length() == 0) {
                            return;
                        }
                        boolean z2 = z;
                        if ((!StringsKt__StringsKt.iIi011O(charSequence3, "正在运行", false, 2, null) || (!StringsKt__StringsKt.iIi011O(charSequence3, "短信", false, 2, null) && !StringsKt__StringsKt.iIi011O(charSequence3, "酷狗音乐", false, 2, null))) && !StringsKt__StringsKt.iIi011O(charSequence, "QQ正在后台运行", false, 2, null)) {
                            if (!Intrinsics.XOO0ii0(packageName, BleNotification.VIBER) || (!StringsKt__StringsKt.iIi011O(charSequence, "Выполняется вызов", false, 2, null) && !StringsKt__StringsKt.iIi011O(charSequence, "Call in progress", false, 2, null) && !StringsKt__StringsKt.iIi011O(charSequence, "正在通话中", false, 2, null) && !StringsKt__StringsKt.iIi011O(charSequence, "Probíhá hovor", false, 2, null) && !StringsKt__StringsKt.iIi011O(charSequence, "A hívás folyamatban", false, 2, null) && !StringsKt__StringsKt.iIi011O(charSequence, "Prebieha hovor", false, 2, null) && !StringsKt__StringsKt.iIi011O(charSequence, "Laufendes Gespräch", false, 2, null) && !StringsKt__StringsKt.iIi011O(charSequence, "Oproep gaande", false, 2, null) && !StringsKt__StringsKt.iIi011O(charSequence, "Puhelu käynnissä", false, 2, null) && !StringsKt__StringsKt.iIi011O(charSequence, "Samtal pågår", false, 2, null) && !StringsKt__StringsKt.iIi011O(charSequence, "Opkald i gang", false, 2, null) && !StringsKt__StringsKt.iIi011O(charSequence, "Appel en cours", false, 2, null) && !StringsKt__StringsKt.iIi011O(charSequence, "Samtale pågår", false, 2, null) && !StringsKt__StringsKt.iIi011O(charSequence, "Arama sürüyor", false, 2, null) && !StringsKt__StringsKt.iIi011O(charSequence, "通話中", false, 2, null) && !StringsKt__StringsKt.iIi011O(charSequence, "Chamada em curso", false, 2, null) && !StringsKt__StringsKt.iIi011O(charSequence, "Llamada en curso", false, 2, null) && !StringsKt__StringsKt.iIi011O(charSequence, "Chiamata in corso", false, 2, null) && !StringsKt__StringsKt.iIi011O(charSequence, "통화 진행 중", false, 2, null) && !StringsKt__StringsKt.iIi011O(charSequence, "Persediaan sedang dijalankan", false, 2, null))) {
                                if (!Intrinsics.XOO0ii0(packageName, "com.tencent.mm") || (!StringsKt__StringsKt.iIi011O(charSequence, "語音通話中，輕觸以繼續", false, 2, null) && !StringsKt__StringsKt.iIi011O(charSequence, "语音通话中, 轻击以继续", false, 2, null) && !StringsKt__StringsKt.iIi011O(charSequence, "Tap to continue as voice call in progress", false, 2, null) && !StringsKt__StringsKt.iIi011O(charSequence, "Ketuk untuk lanjut selama panggilan suara berlangsung", false, 2, null) && !StringsKt__StringsKt.iIi011O(charSequence, "Ketik untuk teruskan sebagai panggilan suara dalam perkembangan", false, 2, null) && !StringsKt__StringsKt.iIi011O(charSequence, "Toque para continuar mientras la llamada de voz está en curso", false, 2, null) && !StringsKt__StringsKt.iIi011O(charSequence, "진행 중인 음성 통화를 계속하려면 누르십시오", false, 2, null) && !StringsKt__StringsKt.iIi011O(charSequence, "Tocca per continuare quando è in corso una chiamata voce", false, 2, null) && !StringsKt__StringsKt.iIi011O(charSequence, "音声呼び出し中にタップして続行", false, 2, null) && !StringsKt__StringsKt.iIi011O(charSequence, "Toque para continuar enquanto a chamada de voz está em progresso", false, 2, null) && !StringsKt__StringsKt.iIi011O(charSequence, "Нажмите, чтобы продолжить, пока идет голосовой вызов", false, 2, null) && !StringsKt__StringsKt.iIi011O(charSequence, "แตะเพื่อทำต่อไป ขณะที่โทรสายเสียงยังใช้งานอยู่", false, 2, null) && !StringsKt__StringsKt.iIi011O(charSequence, "Nhấp để tiếp tục vì cuộc gọi thoại đang diễn ra", false, 2, null) && !StringsKt__StringsKt.iIi011O(charSequence, "المس للمتابعة حيث إن المكالمة الصوتية جارية", false, 2, null) && !StringsKt__StringsKt.iIi011O(charSequence, "Sesli arama sürdüğünden devam etmek için dokunun", false, 2, null) && !StringsKt__StringsKt.iIi011O(charSequence, "Tippen, um während einem Sprachanruf fortzufahren", false, 2, null) && !StringsKt__StringsKt.iIi011O(charSequence, "Touchez pour continuer pendant l'appel vocal", false, 2, null) && !StringsKt__StringsKt.iIi011O(charSequence, "လုပ္ေဆာင္ေနစဥ္ အသံေခၚဆိုမႈကဲ့သို႔ဆက္လုပ္ရန္ႏွိပ္ပါ", false, 2, null) && !StringsKt__StringsKt.iIi011O(charSequence, "ແຕະ\u200bເພື່ອ\u200bສືບ\u200bຕໍ່ເປັນ\u200bການ\u200bໂທ\u200bດ້ວຍ\u200bສຽງ\u200bພວມ\u200bດຳ\u200bເນີນ\u200bຢູ່", false, 2, null))) {
                                    if (Intrinsics.XOO0ii0(packageName, BleNotification.GMAIL) && StringsKt__StringsKt.iIi011O(charSequence, "メールの同期中", false, 2, null)) {
                                        return;
                                    }
                                    if (!Intrinsics.XOO0ii0(packageName, BleNotification.ANDROID_EMAIL) || (!StringsKt__StringsKt.iIi011O(charSequence3, "正在发送邮件...", false, 2, null) && !StringsKt__StringsKt.iIi011O(charSequence3, "Sending email…", false, 2, null) && !StringsKt__StringsKt.iIi011O(charSequence3, "メールを送信中...", false, 2, null))) {
                                        if ((!Intrinsics.XOO0ii0(packageName, BleNotification.WHATS_APP) || (!StringsKt__StringsKt.iIi011O(charSequence, "正在将视频发送给", false, 2, null) && !StringsKt__StringsKt.iIi011O(charSequence, "正在发送文件给", false, 2, null) && !StringsKt__StringsKt.iIi011O(charSequence, "正在发送音频文件给", false, 2, null) && !StringsKt__StringsKt.iIi011O(charSequence, "Sending video to", false, 2, null) && !StringsKt__StringsKt.iIi011O(charSequence, "Sending file to", false, 2, null) && !StringsKt__StringsKt.iIi011O(charSequence, "Sending audio to", false, 2, null) && !StringsKt__StringsKt.iIi011O(charSequence, "正在傳送音訊檔給", false, 2, null) && !StringsKt__StringsKt.iIi011O(charSequence, "正在傳送文件給", false, 2, null) && !StringsKt__StringsKt.iIi011O(charSequence, "正在傳送影片給", false, 2, null) && !StringsKt__StringsKt.iIi011O(charSequence, "にファイルを送信中", false, 2, null) && !StringsKt__StringsKt.iIi011O(charSequence, "ビデオを送信中", false, 2, null) && !StringsKt__StringsKt.iIi011O(charSequence, "に音声を送信中", false, 2, null) && !StringsKt__StringsKt.iIi011O(charSequence, "Envoi du fichier à", false, 2, null) && !StringsKt__StringsKt.iIi011O(charSequence, "Envoi du fichier audio à", false, 2, null) && !StringsKt__StringsKt.iIi011O(charSequence, "Envoi de la vidéo à", false, 2, null))) && !Intrinsics.XOO0ii0(sbn.getNotification().getChannelId(), "com.miui.player:remote-notification")) {
                                            if (!O00() && q62.OXO1.ii0111XI()) {
                                                if (Intrinsics.XOO0ii0(this.X11iII1O1, packageName) && this.iX1O1 != 0 && System.currentTimeMillis() - this.iX1O1 <= 500) {
                                                    return;
                                                }
                                                this.X11iII1O1 = packageName;
                                                this.iX1O1 = System.currentTimeMillis();
                                            }
                                            if (a01Var2.m1440iO().getBoolean(b01.f5636iI, false)) {
                                                if (Intrinsics.XOO0ii0(packageName, BleNotification.GOOGLE_DUO) && a01Var2.m1440iO().getBoolean(b01.XIi00iiXO)) {
                                                    long time = new Date().getTime();
                                                    String string = charSequence3.toString();
                                                    String string2 = Utils.getApp().getString(R.string.incoming_call);
                                                    Intrinsics.O10IXXX0X(string2, "getString(...)");
                                                    BleNotification bleNotification = new BleNotification(1, time, null, string, string2, 4, null);
                                                    i1O0OXO1O.OXO1.IiI10X("onNotificationPosted handleIncomingCall -> Send Notification = " + bleNotification);
                                                    BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.NOTIFICATION, BleKeyFlag.UPDATE, bleNotification, false, false, 24, null);
                                                    BleInitializer.f51208IO.OiXI1OiX0(BleNotification.copy$default(bleNotification, 0, 0L, packageName, null, null, 27, null));
                                                    Unit unit = Unit.OXO1;
                                                    return;
                                                }
                                                return;
                                            }
                                            if (Intrinsics.XOO0ii0(packageName, BleNotification.GOOGLE_DUO)) {
                                                String channelId2 = sbn.getNotification().getChannelId();
                                                Intrinsics.O10IXXX0X(channelId2, "getChannelId(...)");
                                                if (StringsKt__StringsKt.iIi011O(channelId2, "call_notifications", false, 2, null)) {
                                                    BleInitializer bleInitializer = BleInitializer.f51208IO;
                                                    if (bleInitializer.I0XXi0X() == null) {
                                                        bleInitializer.OiXI1OiX0(new BleNotification(127, new Date().getTime(), packageName, charSequence3.toString(), charSequence.toString()));
                                                        return;
                                                    }
                                                    return;
                                                }
                                                String channelId3 = sbn.getNotification().getChannelId();
                                                Intrinsics.O10IXXX0X(channelId3, "getChannelId(...)");
                                                if (StringsKt__StringsKt.iIi011O(channelId3, "missed_calls", false, 2, null)) {
                                                    return;
                                                }
                                            }
                                            i1O0OXO1O i1o0oxo1o2 = i1O0OXO1O.OXO1;
                                            BleInitializer bleInitializer2 = BleInitializer.f51208IO;
                                            i1o0oxo1o2.OXO1("MyNotificationListenerService onNotificationPosted ->packageName = " + ((Object) packageName) + " , isSendMissedCall = " + bleInitializer2.XOXOIX0Oi() + " , isSmsNotificationReceive = " + bleInitializer2.iIIIiIO0() + " , title = " + ((Object) charSequence3) + " , content = " + ((Object) charSequence));
                                            if ((charSequence.length() != 0 || Intrinsics.XOO0ii0(packageName, BleNotification.TELEGRAM)) && !Intrinsics.XOO0ii0(packageName, "android") && !Intrinsics.XOO0ii0(packageName, "com.android.systemui") && !Intrinsics.XOO0ii0(packageName, "com.xiaomi.simactivate.service") && !Intrinsics.XOO0ii0(packageName, "com.miui.smsextra") && !Intrinsics.XOO0ii0(packageName, "Com.android.deskclock")) {
                                                long jCurrentTimeMillis = System.currentTimeMillis() - bleInitializer2.IOi1O0();
                                                if (Intrinsics.XOO0ii0(packageName, "com.android.mms") || Intrinsics.XOO0ii0(packageName, BleNotification.ANDROID_MMS_SERVICE) || Intrinsics.XOO0ii0(packageName, BleNotification.GOOGLE_MMS) || Intrinsics.XOO0ii0(packageName, BleNotification.ONE_PLUS_MMS) || Intrinsics.XOO0ii0(packageName, BleNotification.SAMSUNG_MMS)) {
                                                    if (StringsKt__StringsKt.iIi011O(charSequence, "Tap for more information or to stop the app", false, 2, null)) {
                                                        return;
                                                    }
                                                    if (bleInitializer2.iIIIiIO0() && jCurrentTimeMillis < 10000) {
                                                        return;
                                                    }
                                                    bleInitializer2.IIO11(false);
                                                    bleInitializer2.I11iXOO(System.currentTimeMillis());
                                                }
                                                if (Intrinsics.XOO0ii0(packageName, BleNotification.ANDROID_INCALLUI) || Intrinsics.XOO0ii0(packageName, BleNotification.ANDROID_TELECOM) || Intrinsics.XOO0ii0(packageName, BleNotification.GOOGLE_TELECOM) || Intrinsics.XOO0ii0(packageName, BleNotification.SAMSUNG_INCALLUI) || Intrinsics.XOO0ii0(packageName, BleNotification.SAMSUNG_TELECOM) || Intrinsics.XOO0ii0(packageName, BleNotification.ONE_PLUS_TELECOM)) {
                                                    if (bleInitializer2.XOXOIX0Oi()) {
                                                        this.XXX11i = charSequence3.toString();
                                                        this.X1IX = charSequence.toString();
                                                        bleInitializer2.XX00XX(false);
                                                        return;
                                                    }
                                                    String channelId4 = sbn.getNotification().getChannelId();
                                                    Intrinsics.O10IXXX0X(channelId4, "getChannelId(...)");
                                                    if (StringsKt__StringsKt.iIi011O(channelId4, "MiuiTelecomMissedCalls", false, 2, null) && Intrinsics.XOO0ii0(charSequence3.toString(), this.XXX11i) && Intrinsics.XOO0ii0(charSequence.toString(), this.X1IX)) {
                                                        return;
                                                    }
                                                    String channelId5 = sbn.getNotification().getChannelId();
                                                    Intrinsics.O10IXXX0X(channelId5, "getChannelId(...)");
                                                    if (StringsKt__StringsKt.iIi011O(channelId5, "phone_ongoing_call", false, 2, null)) {
                                                        return;
                                                    }
                                                    this.XXX11i = charSequence3.toString();
                                                    this.X1IX = charSequence.toString().toString();
                                                }
                                                String str2 = Intrinsics.XOO0ii0(packageName, BleNotification.SAMSUNG_MMS) ? "com.android.mms" : packageName;
                                                if (Intrinsics.XOO0ii0(str2, "com.android.mms") && !a01Var2.m1440iO().getBoolean(b01.f5637iO, false)) {
                                                    i1o0oxo1o2.OXO1("MyNotificationListenerService  NOTIFICATION_SMS = " + a01Var2.m1440iO().getBoolean(b01.f5637iO, false));
                                                    return;
                                                }
                                                Object obj = (Intrinsics.XOO0ii0(str2, BleNotification.GOOGLE_MMS) && (charSequence3.toString().length() == 0 || Intrinsics.XOO0ii0(charSequence3.toString(), "null"))) ? "Messages" : charSequence3;
                                                if (WxManager.OXO1.O0O0X0iOi() && "com.tencent.mm".equals(str2)) {
                                                    i1o0oxo1o2.OXO1("MyNotificationListenerService WxNotificationServerEnable");
                                                    return;
                                                }
                                                if (WAManager.OXO1.X100O() && BleNotification.WHATS_APP.equals(str2)) {
                                                    i1o0oxo1o2.OXO1("MyNotificationListenerService WANotificationServerEnable");
                                                    return;
                                                }
                                                BleNotification bleNotification2 = new BleNotification(127, postTime, str2, obj.toString(), charSequence.toString());
                                                String str3 = str2;
                                                if (!O00()) {
                                                    i1o0oxo1o2.OXO1("MyNotificationListenerService onNotificationPosted -> " + z2 + " Send Notification = " + bleNotification2);
                                                    BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.NOTIFICATION, BleKeyFlag.UPDATE, bleNotification2, false, false, 24, null);
                                                    return;
                                                }
                                                if (m38158iO(str3)) {
                                                    i1o0oxo1o2.OXO1("MyNotificationListenerService onNotificationPosted -> in interval time");
                                                } else {
                                                    if (z2) {
                                                        String strOXO1 = OXO1(bundle.getCharSequenceArray(NotificationCompat.EXTRA_TEXT_LINES));
                                                        if (Intrinsics.XOO0ii0(this.iXiX011.get(str3), strOXO1)) {
                                                            i1o0oxo1o2.OXO1("MyNotificationListenerService onNotificationPosted -> repeat textline");
                                                            this.iIXi1iiXI.put(str3, Long.valueOf(System.currentTimeMillis()));
                                                            return;
                                                        }
                                                        this.iXiX011.put(str3, strOXO1);
                                                        String mTitle = bleNotification2.getMTitle();
                                                        String mContent = bleNotification2.getMContent();
                                                        Intrinsics.XXI(appName);
                                                        Pair<String, String> pairXOO0ii0 = XOO0ii0(mTitle, mContent, str3, appName);
                                                        bleNotification2.setMTitle(pairXOO0ii0.getFirst());
                                                        bleNotification2.setMContent(pairXOO0ii0.getSecond());
                                                        i1o0oxo1o2.OXO1("MyNotificationListenerService onNotificationPosted -> new content " + pairXOO0ii0);
                                                    }
                                                    String str4 = bleNotification2.getMTitle() + Pattern.compile("[\\s]").matcher(bleNotification2.getMContent()).replaceAll("");
                                                    if (XO0O10(str3, str4)) {
                                                        i1o0oxo1o2.OXO1("MyNotificationListenerService onNotificationPosted -> isRepeated");
                                                    } else {
                                                        i1o0oxo1o2.OXO1("MyNotificationListenerService onNotificationPosted -> " + z2 + " Send Notification = " + bleNotification2);
                                                        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.NOTIFICATION, BleKeyFlag.UPDATE, bleNotification2, false, false, 24, null);
                                                        this.X0i1O.put(str3, str4);
                                                        this.iIXi1iiXI.put(str3, Long.valueOf(System.currentTimeMillis()));
                                                    }
                                                }
                                                Unit unit2 = Unit.OXO1;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.service.notification.NotificationListenerService
    public void onNotificationRemoved(@tb1 StatusBarNotification statusBarNotification) {
    }
}
