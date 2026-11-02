package com.sma.smartv3.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import androidx.core.net.MailTo;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.IXiXi0011;
import com.android.mltcode.paycertificationapi.IiXI1X1OO;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.e44;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.hd6;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iX1IIO10;
import com.android.mltcode.paycertificationapi.id6;
import com.android.mltcode.paycertificationapi.iii1ii;
import com.android.mltcode.paycertificationapi.jd6;
import com.android.mltcode.paycertificationapi.kd6;
import com.android.mltcode.paycertificationapi.ld6;
import com.android.mltcode.paycertificationapi.md6;
import com.android.mltcode.paycertificationapi.nd6;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.ro3;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.androidnetworking.utils.ParseUtil;
import com.bestmafen.baseble.scanner.BleDevice;
import com.blankj.utilcode.constant.RegexConstants;
import com.blankj.utilcode.util.ActivityUtils;
import com.blankj.utilcode.util.DeviceUtils;
import com.blankj.utilcode.util.EncryptUtils;
import com.blankj.utilcode.util.FileIOUtils;
import com.blankj.utilcode.util.KeyboardUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.NotificationUtils;
import com.blankj.utilcode.util.RegexUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.blankj.utilcode.util.UriUtils;
import com.blankj.utilcode.util.Utils;
import com.facebook.internal.security.CertificateUtil;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import com.google.gson.Gson;
import com.ironsource.C2991da;
import com.jieli.bluetooth_connect.constant.BluetoothConstant;
import com.sifli.siflidfu.DFUImagePath;
import com.sma.smartv3.biz.voice.VoiceManager;
import com.sma.smartv3.location.CustomLocation;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.ExternalKeyManager;
import com.sma.smartv3.model.ThirdPlatform;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.pop.AiKeyEditPopup;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.me.WebViewActivity;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.component.BleConstsKt;
import com.szabh.smable3.entity.BleDeviceFile;
import com.szabh.smable3.entity.BleDeviceInfo;
import com.szabh.smable3.entity.BleNotification;
import com.szabh.smable3.entity.Languages;
import com.tenmeter.smlibrary.utils.FileUtils;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\ncom/sma/smartv3/util/UtilsKt\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,1096:1\n216#2,2:1097\n90#3:1099\n19#3:1103\n15#3:1104\n11#3,2:1105\n1#4:1100\n29#5:1101\n29#5:1102\n*S KotlinDebug\n*F\n+ 1 Utils.kt\ncom/sma/smartv3/util/UtilsKt\n*L\n453#1:1097,2\n820#1:1099\n1082#1:1103\n1082#1:1104\n1083#1:1105,2\n886#1:1101\n918#1:1102\n*E\n"})
public final class UtilsKt {
    public static int OXO1;

    public static final class OXO1 extends ViewOutlineProvider {
        public final /* synthetic */ float OXO1;

        public OXO1(float r1) {
            this.OXO1 = r1;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View r8, Outline r9) {
            Intrinsics.X0O(r8, "view");
            Intrinsics.X0O(r9, "outline");
            r9.setRoundRect(0, 0, r8.getWidth(), r8.getHeight(), this.OXO1);
        }
    }

    static {
    }

    public static final byte[] I0IIOi(String r3, byte[] r4) {
        Cipher r0 = Cipher.getInstance("AES");
        r0.init(2, new SecretKeySpec(r4, "AES/ECB/PKCS5Padding"));
        byte[] r5 = r0.doFinal(Base64.decode(r3, 0));
        Intrinsics.O10IXXX0X(r5, "doFinal(...)");
        return r5;
    }

    public static final void I0iXXO(@aa1 Context r5, @aa1 String r6, @aa1 String r7, @aa1 String r8) {
        Intrinsics.X0O(r5, "context");
        Intrinsics.X0O(r6, "recipient");
        Intrinsics.X0O(r7, "subject");
        Intrinsics.X0O(r8, "body");
        Intent r1 = new Intent("android.intent.action.SENDTO", Uri.parse(MailTo.MAILTO_SCHEME).buildUpon().appendQueryParameter("to", r6).appendQueryParameter("subject", r7).appendQueryParameter("body", r8).build());
        r1.setData(Uri.parse(MailTo.MAILTO_SCHEME + r6));
        r1.putExtra("android.intent.extra.SUBJECT", r7);
        r1.putExtra("android.intent.extra.TEXT", r8);
        r5.startActivity(r1);     // Catch: Exception -> L5
        return;
    L5:
        Toast.makeText(r5, "No email application available", 0).show();
    }

    @aa1
    public static final String I1(@aa1 String r9) {
        Intrinsics.X0O(r9, "address");
        long r0 = Long.parseLong(oe5.IXO0OOi(r9, CertificateUtil.DELIMITER, "", false, 4, null), kotlin.text.OXO1.OXO1(16)) + 1;
        StringCompanionObject r10 = StringCompanionObject.OXO1;
        String r11 = String.format("%012X", Arrays.copyOf(new Object[]{Long.valueOf(r0)}, 1));
        Intrinsics.O10IXXX0X(r11, "format(...)");
        return CollectionsKt___CollectionsKt.XOiXXOO(StringsKt___StringsKt.OXO(r11, 2), CertificateUtil.DELIMITER, null, null, 0, null, null, 62, null);
    }

    public static final boolean I1XOi1() {
        return true;
    }

    @aa1
    @SuppressLint({"DefaultLocale"})
    public static final String II1Xi0(float r4, float r5) {
        if (r4 == 0.0f) goto L8;
        if (r5 == 0.0f) goto L8;
        StringCompanionObject r0 = StringCompanionObject.OXO1;
        String r6 = String.format("%.1f - %.1f", Arrays.copyOf(new Object[]{Float.valueOf(r4), Float.valueOf(r5)}, 2));
        Intrinsics.O10IXXX0X(r6, "format(...)");
        return r6;
    L8:
        if (i72.OXO1.OXI0Xi() == false) goto L11;
        StringCompanionObject r7 = StringCompanionObject.OXO1;
        String r8 = String.format(HelpFormatter.DEFAULT_LONG_OPT_PREFIX, Arrays.copyOf(new Object[0], 0));
        Intrinsics.O10IXXX0X(r8, "format(...)");
        return r8;
    L11:
        StringCompanionObject r9 = StringCompanionObject.OXO1;
        String r10 = String.format("%s - %s", Arrays.copyOf(new Object[]{"0.0", "0.0"}, 2));
        Intrinsics.O10IXXX0X(r10, "format(...)");
        return r10;
    }

    public static final boolean IIX1OXO(Activity r32) {
        a01 r0 = a01.OXO1;
        SPUtils r1 = r0.IiI10X();
        int r3 = 0;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        String r7 = null;
        String r8 = null;
        String r9 = null;
        int r10 = 0;
        int r11 = 0;
        float r12 = 0.0f;
        float r13 = 0.0f;
        String r14 = null;
        String r15 = null;
        String r16 = null;
        String r17 = null;
        String r18 = null;
        String r19 = null;
        float r20 = 0.0f;
        float r21 = 0.0f;
        int r22 = 0;
        int r23 = 0;
        String r24 = null;
        String r25 = null;
        String r26 = null;
        String r27 = null;
        ThirdPlatform r28 = null;
        boolean r29 = false;
        Object r2 = new AppUser(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, 134217727, null);
        Object r30 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r30 == null) goto L6;
        r2 = r30;
    L6:
        SPUtils r31 = r0.XO0O10();
        String r33 = AppUser.class.getName();
        Gson r34 = new Gson();
        r31.put(r33, r34.toJson((AppUser) r2));
        i72.OXO1.Oi1I(r32);
        return true;
    }

    public static final int IO(@aa1 byte[] r2) {
        Intrinsics.X0O(r2, "<this>");
        short[] r0 = new short[r2.length / 2];
        ByteBuffer.wrap(r2).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer().get(r0);
        Short r3 = ArraysKt___ArraysKt.IOIIO01I(r0);
        if (r3 != null) goto L5;
        return 0;
    L5:
        return r3.shortValue();
    }

    public static final boolean IO0II0i(@aa1 Context r1) {
        Intrinsics.X0O(r1, "context");
        return Intrinsics.XOO0ii0(r1.getResources().getConfiguration().locale.getLanguage(), "pt");
    }

    public static final void IO0iXO0O(int r2, String r3, NotificationCompat.Builder r4) {
        r4.setSmallIcon(R.mipmap.ic_launcher);
        r4.setContentText(XXO(r2));
        Application r5 = Utils.getApp();
        Intent r0 = new Intent("android.intent.action.VIEW", Uri.parse(r3));
        r0.addCategory("android.intent.category.BROWSABLE");
        Unit r6 = Unit.OXO1;
        r4.setContentIntent(PendingIntent.getActivity(r5, 0, r0, 67108864));
        r4.setAutoCancel(true);
        r4.setPriority(-2);
    }

    public static final boolean IX0IXOi(Activity r3, final AiKeyEditPopup r4, String r5) {
        Intrinsics.X0O(r5, "text");
        KeyboardUtils.hideSoftInput(r3);
        final String r0 = StringsKt__StringsKt.iX1X1(r5).toString();
        if (TextUtils.isEmpty(r0) == false) goto L5;
        ToastUtils.showLong(R.string.ai_key_input_tip);
        return false;
    L5:
        VoiceManager.INSTANCE.openAiCheck(StringsKt__StringsKt.iX1X1(r5).toString(), new UtilsKt$showAiKeyPopup$1$1$1(r0, r4), r3, r4.getMLayout());
        return false;
    }

    public static final void IX1XiI(@aa1 View r1, float r2) {
        Intrinsics.X0O(r1, "<this>");
        r1.setOutlineProvider(new OXO1(r2));
        r1.setClipToOutline(true);
    }

    public static final boolean IXI(@aa1 Context r2) {
        Intrinsics.X0O(r2, "context");
        Locale r3 = r2.getResources().getConfiguration().locale;
        String r0 = r3.getCountry();
        if (Intrinsics.XOO0ii0(r3.getLanguage(), Languages.DEFAULT_LANGUAGE_ZH) == true) goto L5;
        return false;
    L5:
        if (Intrinsics.XOO0ii0(r0, "CN") == false) goto L10;
        return true;
    L10:
        return false;
    }

    public static final boolean IXOIIIO(@aa1 String r1) {
        Intrinsics.X0O(r1, "text");
        return RegexUtils.isMatch(RegexConstants.REGEX_MOBILE_SIMPLE, r1);
    }

    @aa1
    public static final String IXXOO(@aa1 BleDevice r9) {
        Intrinsics.X0O(r9, "device");
        if (X00Xi1X(r9) == false) goto L9;
        byte[] r10 = r9.getMScanRecord();
        if (r10 != null) goto L8;
        r10 = new byte[20];
    L8:
        return CollectionsKt___CollectionsKt.XOiXXOO(ArraysKt___ArraysKt.iiXX(ArraysKt___ArraysJvmKt.I0IIOI(r10, 10, 16)), CertificateUtil.DELIMITER, null, null, 0, null, new kd6(), 30, null);
    L9:
        String r11 = r9.getMBluetoothDevice().getAddress();
        Intrinsics.O10IXXX0X(r11, "getAddress(...)");
        return r11;
    }

    public static final boolean Ii0X0X(@aa1 Context r1) {
        Intrinsics.X0O(r1, "context");
        return Intrinsics.XOO0ii0(r1.getResources().getConfiguration().locale.getLanguage(), "it");
    }

    public static final boolean Ii0i(@aa1 Context r1) {
        Intrinsics.X0O(r1, "context");
        return Intrinsics.XOO0ii0(r1.getResources().getConfiguration().locale.getCountry(), "US");
    }

    @aa1
    public static final String Ii1iii0(@aa1 String r4) {
        Intrinsics.X0O(r4, TypedValues.Custom.S_STRING);
        int r0 = r4.hashCode();
        if (r0 == 48) goto L16;
        if (r0 == 1440) goto L13;
        if (r0 == 47602) goto L10;
    L17:
        return r4;
    L10:
        if (r4.equals("0.0") == false) goto L17;
    L19:
        if (i72.OXO1.OXI0Xi() == false) goto L21;
        return HelpFormatter.DEFAULT_LONG_OPT_PREFIX;
    L21:
        return "0";
    L13:
        if (r4.equals(HelpFormatter.DEFAULT_LONG_OPT_PREFIX) == true) goto L19;
    L16:
        if (r4.equals("0") == true) goto L19;
        goto L17
    }

    public static /* synthetic */ boolean IiI10X(Activity r0, AiKeyEditPopup r1, String r2) {
        return IX0IXOi(r0, r1, r2);
    }

    public static final boolean IiiXiI0I(@aa1 Context r1) {
        Intrinsics.X0O(r1, "context");
        return Intrinsics.XOO0ii0(r1.getResources().getConfiguration().locale.getLanguage(), Languages.DEFAULT_LANGUAGE_ZH);
    }

    public static /* synthetic */ boolean O00() {
        return I1XOi1();
    }

    public static /* synthetic */ Intent O001I(File r0, String r1, int r2, Object r3) {
        if ((r2 & 2) == 0) goto L6;
        r1 = r0.getName();
        Intrinsics.O10IXXX0X(r1, "getName(...)");
    L6:
        return iXiX011(r0, r1);
    }

    public static final boolean O0O(int r1, Function0 r2, String r3) {
        Intrinsics.X0O(r3, "text");
        if (Intrinsics.XOO0ii0(r3, String.valueOf(r1)) == false) goto L6;
        r2.invoke();
        return true;
    L6:
        ToastUtils.showLong(R.string.verification_code_error);
        return false;
    }

    public static final void O0O0X0iOi(int r3, String r4, NotificationCompat.Builder r5) {
        r5.setSmallIcon(R.mipmap.ic_launcher);
        r5.setContentText(XXO(r3));
        Application r6 = Utils.getApp();
        Intent r0 = new Intent(Utils.getApp(), WebViewActivity.class);
        Bundle r1 = new Bundle();
        r1.putString("mArg0", r4);
        r1.putInt("mArg1", WebViewActivity.Companion.XOO0ii0());
        r0.putExtras(r1);
        Unit r7 = Unit.OXO1;
        r5.setContentIntent(PendingIntent.getActivity(r6, 0, r0, 67108864));
        r5.setAutoCancel(true);
        r5.setPriority(-2);
    }

    public static final void O10IXXX0X(@aa1 Context r5, @aa1 String r6) {
        Intrinsics.X0O(r5, "activity");
        Intrinsics.X0O(r6, "insID");
        Intent r1 = new Intent("android.intent.action.VIEW", Uri.parse("https://instagram.com/_u/" + r6));
        r1.setPackage(BleNotification.INSTAGRAM);
        r5.startActivity(r1);     // Catch: Exception -> L5
        return;
    L5:
        r5.startActivity(new Intent(new Intent("android.intent.action.VIEW", Uri.parse("https://www.instagram.com/" + r6))));
    }

    @aa1
    public static final String O1O(@aa1 ExternalKeyManager r4) {
        Intrinsics.X0O(r4, "key");
        byte[] r0 = Base64.decode(i72.XIi00iiXO, 0);
        PrivateKey r1 = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(r0));
        String r2 = r4.getSecond();
        Intrinsics.XXI(r1);
        byte[] r3 = Base64.decode(XOO0XOOii(r2, r1), 0);
        Intrinsics.O10IXXX0X(r3, "decode(...)");
        return new String(I0IIOi(r4.getFirst(), r3), Charsets.XIi00iiXO);
    }

    @aa1
    public static final ArrayList<DFUImagePath> OII(@aa1 List<? extends File> r8) {
        Intrinsics.X0O(r8, "fileList");
        ArrayList<DFUImagePath> r0 = new ArrayList();
        Iterator<? extends File> r9 = r8.iterator();
    L4:
        if (r9.hasNext() == false) goto L33;
        File r1 = r9.next();
        Uri r2 = Uri.fromFile(r1);
        i1O0OXO1O.OXO1.OXO1("getDFUImagePath  path=" + r2.getPath() + ",scheme=" + r2.getScheme());
        String r3 = r1.getName();
        if (r3 != null) goto L8;
        int r4 = -333;
    L31:
        if (r4 == (-333)) goto L4;
        r0.add(new DFUImagePath(null, r2, r4));
        goto L4
    L8:
        switch(r3.hashCode()) {
            case -2014123484: goto L27;
            case -1426007810: goto L23;
            case -676093707: goto L19;
            case 464502781: goto L15;
            case 1683716375: goto L11;
            default: goto L39;
        };
    L39:
        r4 = -333;
        goto L31
    L11:
        if (r3.equals("otaroot.bin") == false) goto L40;
        r4 = 5;
        goto L31
    L40:
        r4 = -333;
        goto L31
    L15:
        if (r3.equals("otaRes.bin") == false) goto L41;
        r4 = 3;
        goto L31
    L41:
        r4 = -333;
        goto L31
    L19:
        if (r3.equals("ctrl_packet.bin") == false) goto L42;
        r4 = -1;
        goto L31
    L42:
        r4 = -333;
        goto L31
    L23:
        if (r3.equals("otaApp.bin") == false) goto L43;
        r4 = 0;
        goto L31
    L43:
        r4 = -333;
        goto L31
    L27:
        if (r3.equals("otaFont.bin") == false) goto L44;
        r4 = 4;
        goto L31
    L44:
        r4 = -333;
        goto L31
    L33:
        return r0;
    }

    @aa1
    public static final String OIX0iXi(@tb1 String r3) {
        if (r3 != null) goto L4;
        return "";
    L4:
        if (r3.length() <= 0) goto L10;
        StringBuilder r0 = new StringBuilder();
        char r1 = r3.charAt(0);
        if (Character.isLowerCase(r1) == false) goto L8;
        String r2 = IXiXi0011.X1IX(r1);
    L9:
        r0.append(r2);
        String r4 = r3.substring(1);
        Intrinsics.O10IXXX0X(r4, "substring(...)");
        r0.append(r4);
        r3 = r0.toString();
        goto L10
    L8:
        r2 = String.valueOf(r1);
    L10:
        if (r3 == null) goto L15;
        return r3;
    L15:
        return "";
    }

    public static final double OIi0(double r6) {
        return ((double) 44330) * (((double) 1) - Math.pow(r6 / 1013.25d, 0.190284d));
    }

    public static final int OO(@aa1 Context r4, int r5) {
        Intrinsics.X0O(r4, "mContext");
        int r6 = r4.getResources().getIdentifier("pic_weather_bg" + XOX0O0(r5), "drawable", r4.getPackageName());     // Catch: Exception -> L7
        if (r6 != 0) goto L6;
        return R.drawable.pic_weather_bg1;
    L6:
        return r6;
    L7:
        e = move-exception;
        e.printStackTrace();
        return R.drawable.pic_weather_bg1;
    }

    @aa1
    public static final String OX() {
        BleCache r0 = BleCache.INSTANCE;
        return "name: " + r0.getMBleName() + "\nplatform: " + r0.getMPlatform() + "\nprototype: " + r0.getMPrototype() + "\nfw flag: " + r0.getMFirmwareFlag() + "\nfw ver: " + BaseBleCache.getString$default(r0, BleKey.FIRMWARE_VERSION, null, null, 6, null) + "\nui ver: " + BaseBleCache.getString$default(r0, BleKey.UI_PACK_VERSION, null, null, 6, null) + "\ngps fw ver: " + BaseBleCache.getString$default(r0, BleKey.GPS_FIRMWARE_VERSION, null, null, 6, null) + "\n4g fw ver: " + BaseBleCache.getString$default(r0, BleKey.NETWORK_FIRMWARE_VERSION, null, null, 6, null);
    }

    @tb1
    public static final String OX110i(@aa1 Context r8, @tb1 Uri r9) {
        Intrinsics.X0O(r8, "context");
        String r0 = null;
        if (r9 != null) goto L5;
        return null;
    L5:
        String r1 = r9.getScheme();
        if (r1 != null) goto L10;
        return r9.getPath();
    L10:
        if (Intrinsics.XOO0ii0("file", r1) == false) goto L14;
        return r9.getPath();
    L14:
        if (Intrinsics.XOO0ii0("content", r1) == false) goto L23;
        Cursor r10 = r8.getContentResolver().query(r9, new String[]{"_data"}, null, null, null);
        if (r10 == null) goto L23;
        if (r10.moveToFirst() == false) goto L22;
        int r11 = r10.getColumnIndex("_data");
        if (r11 <= (-1)) goto L22;
        r0 = r10.getString(r11);
    L22:
        r10.close();
    L23:
        return r0;
    }

    public static /* synthetic */ CharSequence OXO1(byte r0) {
        return iOO1ii1(r0);
    }

    public static final void Oi(@aa1 final String r3, final int r4) {
        Intrinsics.X0O(r3, "url");
        NotificationUtils.notify(r4, new NotificationUtils.ChannelConfig("open_browser", "open_browser", 2), new nd6(r4, r3));
    }

    @aa1
    public static final Map<String, String> OiIIX101O(@aa1 Context r3, int r4) {
        Intrinsics.X0O(r3, "context");
        HashMap r0 = new HashMap();
        Map<String, String> r5 = XX0(r3, r4);
        Locale r6 = Locale.ENGLISH;
        String r1 = r5.get(r6.toString());
        if (r1 != null) goto L5;
        r1 = "";
    L5:
        r0.put(r6.toString(), r1);
        Iterator<Map.Entry<String, String>> r7 = r5.entrySet().iterator();
    L7:
        if (r7.hasNext() == false) goto L11;
        Map.Entry<String, String> r8 = r7.next();
        if (Intrinsics.XOO0ii0(r8.getValue(), r1) == true) goto L7;
        r0.put(r8.getKey(), r8.getValue());
        goto L7
    L11:
        return r0;
    }

    public static final int X00XIX1(@aa1 Context r4, int r5) {
        Intrinsics.X0O(r4, "mContext");
        int r6 = r4.getResources().getIdentifier("ic_weather_larger" + XOX0O0(r5), "drawable", r4.getPackageName());     // Catch: Exception -> L7
        if (r6 != 0) goto L6;
        return R.drawable.ic_weather_larger1;
    L6:
        return r6;
    L7:
        e = move-exception;
        e.printStackTrace();
        return R.drawable.ic_weather_larger1;
    }

    public static final boolean X00Xi1X(@aa1 BleDevice r3) {
        Intrinsics.X0O(r3, "device");
        byte[] r4 = r3.getMScanRecord();
        if (r4 != null) goto L6;
        r4 = new byte[20];
    L6:
        if (r4.length > 20) goto L8;
        return false;
    L8:
        return Intrinsics.XOO0ii0(new String(CollectionsKt___CollectionsKt.XX0X0(ArraysKt___ArraysKt.iiXX(ArraysKt___ArraysJvmKt.I0IIOI(r4, 4, 9))), Charsets.XIi00iiXO), BluetoothConstant.OTA_FILTER_FLAG);
    }

    @aa1
    @SuppressLint({"DefaultLocale"})
    public static final String X01IiOiIi(float r1) {
        if (r1 == 0.0f) goto L5;
        StringCompanionObject r0 = StringCompanionObject.OXO1;
        String r2 = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(r1 / 10.0f)}, 1));
        Intrinsics.O10IXXX0X(r2, "format(...)");
        return r2;
    L5:
        if (i72.OXO1.OXI0Xi() == false) goto L8;
        return HelpFormatter.DEFAULT_LONG_OPT_PREFIX;
    L8:
        return "0.0";
    }

    public static final boolean X0O(@aa1 Function0<Unit> r5) {
        Intrinsics.X0O(r5, "action");
        if (i72.OXO1.iOIi00Ii() == false) goto L6;
        r5.invoke();
        return true;
    L6:
        final Activity r6 = ActivityUtils.getTopActivity();
        int r1 = 0;
        if (r6 == null) goto L9;
        go0 r2 = new go0(r6, r1, 2, null);
        r2.O1O(R.string.prompt);
        r2.iX(Integer.valueOf(R.string.not_logged_pop_tip));
        r2.i010I().setBackgroundTintList(ColorStateList.valueOf(r6.getColor(R.color.blue_color)));
        r2.iX1O1(Integer.valueOf(R.string.not_logged_in_yet), new id6());
        r2.X1IX(R.string.to_login, new jd6(r6));
        r2.IIX1OXO();
    L10:
        return false;
    L9:
        ToastUtils.showLong(R.string.not_logged_in_yet);
        goto L10
    }

    @aa1
    public static final String X0i1O() {
        String r0 = Api.INSTANCE.getBASE_URL();
        switch(r0.hashCode()) {
            case -2019210183: goto L36;
            case -1644804843: goto L31;
            case -1633488716: goto L26;
            case -167076722: goto L21;
            case 1433701912: goto L16;
            case 1582655416: goto L11;
            case 1816079795: goto L6;
            default: goto L41;
        };
    L41:
        return "Test Server";
    L6:
        if (r0.equals(iX1IIO10.OXO1) == false) goto L42;
        return "Dev Server";
    L42:
        return "Test Server";
    L11:
        if (r0.equals(e44.iO) == false) goto L43;
        String r1 = Utils.getApp().getString(R.string.china_mainland);
        Intrinsics.O10IXXX0X(r1, "getString(...)");
        return r1;
    L43:
        return "Test Server";
    L16:
        if (r0.equals(e44.O00) == false) goto L44;
        String r2 = Utils.getApp().getString(R.string.silicon_valley_of_america_name);
        Intrinsics.O10IXXX0X(r2, "getString(...)");
        return r2;
    L44:
        return "Test Server";
    L21:
        if (r0.equals(e44.OXO1) == false) goto L45;
        String r3 = Utils.getApp().getString(R.string.asia_pacific);
        Intrinsics.O10IXXX0X(r3, "getString(...)");
        return r3;
    L45:
        return "Test Server";
    L26:
        if (r0.equals("https://api.eg.iot-solution.net/kotlinweb") == false) goto L46;
        String r4 = Utils.getApp().getString(R.string.europe_and_america);
        Intrinsics.O10IXXX0X(r4, "getString(...)");
        return r4;
    L46:
        return "Test Server";
    L31:
        if (r0.equals(e44.XIi00iiXO) == false) goto L47;
        String r5 = Utils.getApp().getString(R.string.europe_and_america);
        Intrinsics.O10IXXX0X(r5, "getString(...)");
        return r5;
    L47:
        return "Test Server";
    L36:
        if (r0.equals("https://api.c.iot-solution.net/kotlinweb") == true) goto L39;
        return "Test Server";
    L39:
        String r6 = Utils.getApp().getString(R.string.china_mainland);
        Intrinsics.O10IXXX0X(r6, "getString(...)");
        return r6;
    }

    public static final boolean X1() {
        Object r0 = Utils.getApp().getSystemService("location");
        Intrinsics.X1ii(r0, "null cannot be cast to non-null type android.location.LocationManager");
        LocationManager r1 = (LocationManager) r0;
        if (r1.isProviderEnabled("gps") == false) goto L5;
        return true;
    L5:
        if (r1.isProviderEnabled("network") == true) goto L11;
        return false;
    L11:
        return true;
    }

    @aa1
    public static final String X100O(int r1) {
        if (r1 > 2) goto L7;
        String r2 = Utils.getApp().getString(R.string.low);
        Intrinsics.XXI(r2);
        return r2;
    L7:
        if (r1 > 5) goto L10;
        String r3 = Utils.getApp().getString(R.string.hr_zone3);
        Intrinsics.XXI(r3);
        return r3;
    L10:
        String r4 = Utils.getApp().getString(R.string.high);
        Intrinsics.XXI(r4);
        return r4;
    }

    @aa1
    public static final String X11I(int r0) {
        if (r0 != 0) goto L10;
        if (i72.OXO1.OXI0Xi() == false) goto L7;
        return IiXI1X1OO.O00;
    L7:
        return "0";
    L10:
        return String.valueOf(r0);
    }

    @aa1
    public static final String X11iII1O1() {
        return ro3.XO0O10().O00() + "-Android " + Build.VERSION.RELEASE;
    }

    public static final int X1IX() {
        String r0 = BleCache.INSTANCE.getMPlatform();
        switch(r0.hashCode()) {
            case -1955887059: goto L21;
            case -1549651556: goto L16;
            case 78896685: goto L11;
            case 1697379018: goto L6;
            default: goto L26;
        };
    L26:
        return 0;
    L6:
        if (r0.equals(BleDeviceInfo.PLATFORM_JL707LITE) == false) goto L27;
        return 4;
    L27:
        return 0;
    L11:
        if (r0.equals(BleDeviceInfo.PLATFORM_SIFLI) == false) goto L28;
        return 3;
    L28:
        return 0;
    L16:
        if (r0.equals(BleDeviceInfo.PLATFORM_REALTEK) == false) goto L29;
        return 1;
    L29:
        return 0;
    L21:
        if (r0.equals(BleDeviceInfo.PLATFORM_NORDIC) == true) goto L24;
        return 0;
    L24:
        return 2;
    }

    public static final void X1ii(@aa1 Context r3, @aa1 String r4) {
        Intrinsics.X0O(r3, "activity");
        Intrinsics.X0O(r4, "facebookUrl");
        Intent r1 = new Intent("android.intent.action.VIEW", Uri.parse("fb://facewebmodal/f?href=" + r4));
        r1.setPackage("com.facebook.katana");
        r3.startActivity(r1);     // Catch: Exception -> L5
        return;
    L5:
        r3.startActivity(new Intent(new Intent("android.intent.action.VIEW", Uri.parse(r4))));
    }

    public static /* synthetic */ void XIi00iiXO(int r0, String r1, NotificationCompat.Builder r2) {
        O0O0X0iOi(r0, r1, r2);
    }

    public static /* synthetic */ void XO0O10(int r0, String r1, NotificationCompat.Builder r2) {
        IO0iXO0O(r0, r1, r2);
    }

    public static final boolean XO0X10iO(@aa1 Context r1) {
        Intrinsics.X0O(r1, "context");
        return Intrinsics.XOO0ii0(r1.getResources().getConfiguration().locale.getCountry(), "IN");
    }

    public static final void XOIX(@aa1 String r2, @aa1 Context r3) {
        Intrinsics.X0O(r2, "url");
        Intrinsics.X0O(r3, "context");
        Intent r0 = new Intent("android.intent.action.VIEW", Uri.parse(r2));
        r0.addCategory("android.intent.category.BROWSABLE");
        if (r0.resolveActivity(r3.getPackageManager()) == null) goto L6;
        r3.startActivity(r0);
        return;
    L6:
        i1O0OXO1O.OXO1.OXO1("No browser found to open the URL.");
    }

    public static final byte[] XOO0XOOii(String r2, PrivateKey r3) {
        Cipher r0 = Cipher.getInstance(C2991da.b);
        r0.init(2, r3);
        byte[] r4 = r0.doFinal(Base64.decode(r2, 0));
        Intrinsics.O10IXXX0X(r4, "doFinal(...)");
        return r4;
    }

    public static /* synthetic */ boolean XOO0ii0(int r0, Function0 r1, String r2) {
        return O0O(r0, r1, r2);
    }

    public static final int XOX0O0(int r2) {
        if (q62.OXO1.OXOO0X0i() == true) goto L5;
    L10:
        return r2;
    L5:
        if (r2 == 2) goto L9;
        if (r2 != 3) goto L10;
        return 2;
    L9:
        return 3;
    }

    @aa1
    public static final String XOXiX0(@tb1 String r1) {
        if (Intrinsics.XOO0ii0(r1, "0") == false) goto L5;
        return HelpFormatter.DEFAULT_LONG_OPT_PREFIX;
    L5:
        if (Intrinsics.XOO0ii0(r1, "0.0") == true) goto L11;
        if (r1 == null) goto L12;
        return r1;
    L12:
        return HelpFormatter.DEFAULT_LONG_OPT_PREFIX;
    L11:
        return HelpFormatter.DEFAULT_LONG_OPT_PREFIX;
    }

    @aa1
    public static final Map<String, String> XX0(@aa1 Context r8, int r9) {
        Intrinsics.X0O(r8, "context");
        HashMap r0 = new HashMap();
        Resources r10 = r8.getResources();
        Configuration r1 = r10.getConfiguration();
        Intrinsics.O10IXXX0X(r1, "getConfiguration(...)");
        Locale[] r2 = Locale.getAvailableLocales();
        Intrinsics.XXI(r2);
        int r3 = r2.length;
        int r4 = 0;
    L3:
        if (r4 >= r3) goto L8;
        Locale r5 = r2[r4];
        r1.setLocale(r5);
        r10.updateConfiguration(r1, r10.getDisplayMetrics());
        String r6 = r10.getString(r9);
        Intrinsics.O10IXXX0X(r6, "getString(...)");
        if (r6.length() <= 0) goto L7;
        r0.put(r5.toString(), r6);
    L7:
        r4 = r4 + 1;
        goto L3
    L8:
        return r0;
    }

    public static final void XX00i10X(@aa1 final String r3, final int r4) {
        Intrinsics.X0O(r3, "url");
        NotificationUtils.notify(r4, new NotificationUtils.ChannelConfig("open_webView", "open_webView", 2), new hd6(r4, r3));
    }

    @aa1
    public static final String XX1Oi() {
        return "58_" + DeviceUtils.getUniqueDeviceId();
    }

    public static /* synthetic */ void XXI(Context r1, String r2, String r3, String r4, int r5, Object r6) {
        if ((r5 & 4) == 0) goto L6;
        r3 = "";
    L6:
        if ((r5 & 8) == 0) goto L8;
        r4 = "";
    L8:
        I0iXXO(r1, r2, r3, r4);
    }

    @aa1
    public static final CustomLocation XXIIO1i11() {
        CustomLocation r1 = new CustomLocation(0.0d, 0.0d, 0.0d, 0.0f, 0, 0, null, 0.0f, 0.0f, 0.0f, 1023, null);
        String r3 = a01.OXO1.IiI10X().getString(b01.XX1Oi);
    L7:
        e = move-exception;
        e.printStackTrace();
        i1O0OXO1O.OXO1.OXO1("getLocationFromCache error: " + r3 + ", " + e.getMessage());
    L9:
        return r1;
    L4:
        if (TextUtils.isEmpty(r3) == true) goto L9;
        Intrinsics.XXI(r3);     // Catch: Exception -> L7
        List r0 = StringsKt__StringsKt.i1I(r3, new String[]{I000IiI1O.iO.XO0O10}, false, 0, 6, null);     // Catch: Exception -> L7
        r1.X0O(Double.parseDouble((String) r0.get(0)));     // Catch: Exception -> L7
        r1.X1ii(Double.parseDouble((String) r0.get(1)));     // Catch: Exception -> L7
        r1.OIX0iXi(Double.parseDouble((String) r0.get(2)));     // Catch: Exception -> L7
        return r1;
    }

    @aa1
    public static final String XXO(int r1) {
        String r2 = Utils.getApp().getResources().getString(r1);
        Intrinsics.O10IXXX0X(r2, "getString(...)");
        return r2;
    }

    @aa1
    public static final String XXX11i() {
        return ro3.XIi00iiXO() + " " + ro3.iO();
    }

    public static final boolean XXiIiX10(@aa1 BleDevice r2) {
        Intrinsics.X0O(r2, "device");
        byte[] r3 = r2.getMScanRecord();
        if (r3 != null) goto L6;
        r3 = new byte[20];
    L6:
        if (r3.length > 20) goto L8;
        return false;
    L8:
        if (r3[2] == (-42)) goto L10;
        return false;
    L10:
        if (r3[3] != 5) goto L16;
        return true;
    L16:
        return false;
    }

    public static final void XXiO0i(@aa1 final Activity r2) {
        Intrinsics.X0O(r2, "activity");
        LogUtils.d(new Object[]{"showAiKeyPopup"});
        final AiKeyEditPopup r0 = new AiKeyEditPopup();
        r0.setMListener(new ld6(r2, r0));
        r0.show((AppCompatActivity) r2);
    }

    @aa1
    public static final String Xi1i0XOX0(@aa1 String r7) {
        Intrinsics.X0O(r7, "bleAddress");
        return StringsKt___StringsKt.iii100(oe5.IXO0OOi(r7, CertificateUtil.DELIMITER, "", false, 4, null), 4);
    }

    @aa1
    public static final String XiOIO(@aa1 String r7) {
        Intrinsics.X0O(r7, "name");
        String r1 = r7;
        List r8 = StringsKt__StringsKt.i1I(r1, new String[]{HelpFormatter.DEFAULT_OPT_PREFIX}, false, 0, 6, null);     // Catch: Exception -> L11
        if (r8.size() >= 3) goto L8;
    L16:
        return r1;
    L8:
        if (oe5.O0Ii((String) r8.get(2), "Neural", false, 2, null) == false) goto L16;
        return StringsKt___StringsKt.I0O1OX0i((String) r8.get(2), 6);
    L11:
        e = e;
    L15:
        e.printStackTrace();
    L13:
        e = e;
        r1 = r7;
        goto L15
    }

    @aa1
    public static final String XiOIii1(@aa1 String r4) {
        Intrinsics.X0O(r4, "key");
        SPUtils r0 = a01.OXO1.XIi00iiXO();
        ExternalKeyManager r5 = (ExternalKeyManager) new Gson().fromJson(r0.getString(r4 + '_' + ExternalKeyManager.class.getName()), ExternalKeyManager.class);
        if (r5 == null) goto L8;
        String r6 = O1O(r5);
        if (r6 == null) goto L10;
        return r6;
    L10:
        return "";
    L8:
        return "";
    }

    public static final void Xii11I(@aa1 View r3, boolean r4) {
        Intrinsics.X0O(r3, "view");
        Paint r0 = new Paint();
        ColorMatrix r1 = new ColorMatrix();
        r1.setSaturation(0.0f);
        r0.setColorFilter(new ColorMatrixColorFilter(r1));
        if (r4 == false) goto L6;
        r3.setLayerType(2, r0);
        return;
    L6:
        r3.setLayerType(2, null);
    }

    @aa1
    @SuppressLint({"DefaultLocale"})
    public static final String i010I(int r1) {
        if (r1 == 0) goto L4;
        StringCompanionObject r0 = StringCompanionObject.OXO1;
        String r2 = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(r1 / 10.0f)}, 1));
        Intrinsics.O10IXXX0X(r2, "format(...)");
        return r2;
    L4:
        if (i72.OXO1.OXI0Xi() == false) goto L7;
        return HelpFormatter.DEFAULT_LONG_OPT_PREFIX;
    L7:
        return "0";
    }

    public static final int i0X000X0O(@aa1 Context r4, int r5) {
        Intrinsics.X0O(r4, "mContext");
        int r6 = r4.getResources().getIdentifier("weather_name" + r5, TypedValues.Custom.S_STRING, r4.getPackageName());     // Catch: Exception -> L7
        if (r6 != 0) goto L6;
        return R.string.weather_name1;
    L6:
        return r6;
    L7:
        e = move-exception;
        e.printStackTrace();
        return R.string.weather_name1;
    }

    public static final boolean i11I(@aa1 Context r1) {
        Intrinsics.X0O(r1, "context");
        return Intrinsics.XOO0ii0(r1.getResources().getConfiguration().locale.getLanguage(), "es");
    }

    public static final int iI() {
        return OXO1;
    }

    public static final int iIXi1iiXI() {
        String r0 = Api.INSTANCE.getBASE_URL();
        int r1 = r0.hashCode();
        if (r1 == (-1644804843)) goto L16;
        if (r1 != (-167076722)) goto L7;
        r0.equals(e44.OXO1);
        return 0;
    L7:
        if (r1 == 1582655416) goto L10;
        return 0;
    L10:
        if (r0.equals(e44.iO) == false) goto L23;
        return 1;
    L23:
        return 0;
    L16:
        if (r0.equals(e44.XIi00iiXO) == false) goto L21;
        return 2;
    L21:
        return 0;
    }

    @aa1
    public static final String iIiiO(long r8) {
        Calendar r0 = Calendar.getInstance();
        r0.setTimeInMillis(System.currentTimeMillis());
        Calendar r1 = Calendar.getInstance();
        r1.setTime(new Date(r8));
        boolean r2 = true;
        if (r1.get(1) == r0.get(1)) goto L5;
    L7:
        boolean r3 = false;
    L9:
        if (r1.get(1) == r0.get(1)) goto L11;
    L13:
        r2 = false;
    L14:
        if (r3 == true) goto L16;
        if (r2 == true) goto L19;
        String r9 = O0X11OiO.iiIOiX().format(Long.valueOf(r8));
        Intrinsics.XXI(r9);
        return r9;
    L19:
        return XXO(R.string.date_yesterday);
    L16:
        return XXO(R.string.date_today);
    L11:
        if (r1.get(6) != (r0.get(6) - 1)) goto L13;
    L5:
        if (r1.get(6) != r0.get(6)) goto L7;
        r3 = true;
        goto L9
    }

    public static /* synthetic */ boolean iO(Activity r0) {
        return IIX1OXO(r0);
    }

    public static final void iOI(int r0) {
        OXO1 = r0;
    }

    public static final CharSequence iOO1ii1(byte r1) {
        StringCompanionObject r0 = StringCompanionObject.OXO1;
        String r2 = String.format("%02X", Arrays.copyOf(new Object[]{Byte.valueOf(r1)}, 1));
        Intrinsics.O10IXXX0X(r2, "format(...)");
        return r2;
    }

    @tb1
    public static final <T> T iOOX010X(@aa1 String r1, @tb1 Class<T> r2) {
        Intrinsics.X0O(r1, "errorBody");
        return (T) ParseUtil.getParserFactory().getObject(r1, r2);
    L5:
        e = move-exception;
        e.printStackTrace();
        return null;
    }

    public static final int iOiXi11II(@aa1 Context r4, int r5) {
        Intrinsics.X0O(r4, "mContext");
        int r6 = r4.getResources().getIdentifier("ic_weather" + XOX0O0(r5), "drawable", r4.getPackageName());     // Catch: Exception -> L7
        if (r6 != 0) goto L6;
        return R.drawable.ic_weather0;
    L6:
        return r6;
    L7:
        e = move-exception;
        e.printStackTrace();
        return R.drawable.ic_weather0;
    }

    @aa1
    @SuppressLint({"DefaultLocale"})
    public static final String iX(int r4, int r5) {
        if (r4 != 0) goto L11;
        if (r5 != 0) goto L11;
        if (i72.OXO1.OXI0Xi() == false) goto L9;
        return HelpFormatter.DEFAULT_LONG_OPT_PREFIX;
    L9:
        StringCompanionObject r3 = StringCompanionObject.OXO1;
        String r6 = String.format("%d - %d", Arrays.copyOf(new Object[]{Integer.valueOf(r4), Integer.valueOf(r5)}, 2));
        Intrinsics.O10IXXX0X(r6, "format(...)");
        return r6;
    L11:
        StringCompanionObject r7 = StringCompanionObject.OXO1;
        String r8 = String.format("%d - %d", Arrays.copyOf(new Object[]{Integer.valueOf(r4), Integer.valueOf(r5)}, 2));
        Intrinsics.O10IXXX0X(r8, "format(...)");
        return r8;
    }

    @aa1
    public static final String iX1O1(@aa1 String r1) {
        Intrinsics.X0O(r1, "url");
        String r0 = Uri.parse(r1).getPath();
        if (r0 == null) goto L6;
        String r2 = new File(r0).getName();
        Intrinsics.O10IXXX0X(r2, "getName(...)");
        return r2;
    L6:
        String r3 = EncryptUtils.encryptMD5ToString(r1);
        Intrinsics.O10IXXX0X(r3, "encryptMD5ToString(...)");
        return r3;
    }

    public static final void iXi(@aa1 Activity r2, @aa1 final Function0<Unit> r3) {
        Intrinsics.X0O(r2, "activity");
        Intrinsics.X0O(r3, "action");
        iii1ii r0 = new iii1ii(r2, R.layout.pop_edit_security_code);
        final int r1 = 837765;
        r0.X11iII1O1(new md6(r1, r3));
        r0.IIX1OXO();
    }

    @aa1
    public static final Intent iXiX011(@aa1 File r2, @aa1 String r3) {
        Intrinsics.X0O(r2, "file");
        Intrinsics.X0O(r3, "title");
        Intent r0 = new Intent("android.intent.action.SEND");
        r0.putExtra("android.intent.extra.TEXT", r3);
        r0.putExtra("android.intent.extra.STREAM", UriUtils.file2Uri(r2));
        r0.setType("*/*");
        Intent r4 = Intent.createChooser(r0, "");
        Intrinsics.O10IXXX0X(r4, "createChooser(...)");
        r4.addFlags(268435456);
        return r4;
    }

    @aa1
    public static final String iXiiiO(int r0) {
        if (r0 != 0) goto L10;
        if (i72.OXO1.OXI0Xi() == false) goto L7;
        return HelpFormatter.DEFAULT_LONG_OPT_PREFIX;
    L7:
        return "0";
    L10:
        return String.valueOf(r0);
    }

    public static final boolean iiIOiX(@aa1 BleDeviceFile r17) {
        Intrinsics.X0O(r17, "deviceFile");
        i1O0OXO1O r1 = i1O0OXO1O.OXO1;
        r1.OXO1("saveDeviceLog -> " + OXO1 + ", " + r17);
        Date r2 = new Date();
        long r3 = (long) TimeZone.getDefault().getOffset(System.currentTimeMillis());
        if (r17.getMFileSize() == 0) goto L22;
        r2.setTime((((long) (r17.getMTime() + BleConstsKt.DATA_EPOCH)) * 1000) - r3);
        File r4 = uz0.XiOIO(sz0.OXO1);
        int r5 = OXO1;
        String r6 = O0X11OiO.IO0iXO0O().format(r2);
        int r9 = r17.getMIndex();
        int r10 = r17.getMFileFormat();
        if (r10 != 1) goto L7;
        Object r7 = "wav";
    L13:
        File r8 = new File(r4, r5 + IiXI1X1OO.O00 + r6 + IiXI1X1OO.O00 + r9 + FileUtils.FILE_EXTENSION_SEPARATOR + r7);
        if (r17.getMOffsetValue() != 0) goto L16;
        r8.delete();
    L16:
        FileIOUtils.writeFileFromBytesByStream(r8, r17.getMFileContent(), true);
        if ((r17.getMOffsetValue() + r17.getMFileContent().length) != r17.getMFileSize()) goto L19;
        r1.OXO1("saveDeviceLog -> start new " + OXO1);
        BaseBleConnector.sendInt8$default(BleConnector.INSTANCE, BleKey.DEVICE_FILE, BleKeyFlag.READ, OXO1, false, false, 24, null);
    L20:
        return false;
    L19:
        r1.OXO1("saveDeviceLog -> continue");
        BaseBleConnector.sendData$default(BleConnector.INSTANCE, BleKey.DEVICE_FILE, BleKeyFlag.READ_CONTINUE, null, false, false, 28, null);
        goto L20
    L7:
        if (r10 == 2) goto L11;
        if (r10 == 3) goto L10;
        r7 = Integer.valueOf(r17.getMFileFormat());
        goto L13
    L10:
        r7 = "bmp";
        goto L13
    L11:
        r7 = "bin";
        goto L13
    L22:
        if (OXO1 != 3) goto L25;
        OXO1 = 0;
        return true;
    L25:
        OXO1 = 3;
        BaseBleConnector.sendInt8$default(BleConnector.INSTANCE, BleKey.DEVICE_FILE, BleKeyFlag.READ, OXO1, false, false, 24, null);
        return false;
    }

    public static final int iii0(boolean r0) {
        if (r0 == false) goto L5;
        return 0;
    L5:
        return 8;
    }

    @aa1
    public static final String iiiO(@aa1 Context r1) {
        Intrinsics.X0O(r1, "context");
        String r2 = r1.getResources().getConfiguration().locale.getCountry();
        Intrinsics.O10IXXX0X(r2, "getCountry(...)");
        return r2;
    }
}
