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
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.e44;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iX1IIO10;
import com.android.mltcode.paycertificationapi.iii1ii;
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
import com.ironsource.C12622da;
import com.jieli.bluetooth_connect.constant.BluetoothConstant;
import com.sifli.siflidfu.DFUImagePath;
import com.sma.smartv3.biz.voice.VoiceManager;
import com.sma.smartv3.location.CustomLocation;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.ExternalKeyManager;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.p610ui.p612me.WebViewActivity;
import com.sma.smartv3.pop.AiKeyEditPopup;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
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
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
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

        public OXO1(float f) {
            this.OXO1 = f;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            Intrinsics.X0O(view, "view");
            Intrinsics.X0O(outline, "outline");
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.OXO1);
        }
    }

    public static final byte[] I0IIOi(String str, byte[] bArr) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(2, new SecretKeySpec(bArr, "AES/ECB/PKCS5Padding"));
        byte[] bArrDoFinal = cipher.doFinal(Base64.decode(str, 0));
        Intrinsics.O10IXXX0X(bArrDoFinal, "doFinal(...)");
        return bArrDoFinal;
    }

    public static final void I0iXXO(@aa1 Context context, @aa1 String recipient, @aa1 String subject, @aa1 String body) {
        Intrinsics.X0O(context, "context");
        Intrinsics.X0O(recipient, "recipient");
        Intrinsics.X0O(subject, "subject");
        Intrinsics.X0O(body, "body");
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse(MailTo.MAILTO_SCHEME).buildUpon().appendQueryParameter("to", recipient).appendQueryParameter("subject", subject).appendQueryParameter("body", body).build());
        intent.setData(Uri.parse(MailTo.MAILTO_SCHEME + recipient));
        intent.putExtra("android.intent.extra.SUBJECT", subject);
        intent.putExtra("android.intent.extra.TEXT", body);
        try {
            context.startActivity(intent);
        } catch (Exception unused) {
            Toast.makeText(context, "No email application available", 0).show();
        }
    }

    @aa1
    /* JADX INFO: renamed from: I1 */
    public static final String m38841I1(@aa1 String address) {
        Intrinsics.X0O(address, "address");
        long j = Long.parseLong(oe5.IXO0OOi(address, CertificateUtil.DELIMITER, "", false, 4, null), kotlin.text.OXO1.OXO1(16)) + 1;
        StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
        String str = String.format("%012X", Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1));
        Intrinsics.O10IXXX0X(str, "format(...)");
        return CollectionsKt___CollectionsKt.XOiXXOO(StringsKt___StringsKt.OXO(str, 2), CertificateUtil.DELIMITER, null, null, 0, null, null, 62, null);
    }

    public static final boolean I1XOi1() {
        return true;
    }

    @aa1
    @SuppressLint({"DefaultLocale"})
    public static final String II1Xi0(float f, float f2) {
        if (f != 0.0f && f2 != 0.0f) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
            String str = String.format("%.1f - %.1f", Arrays.copyOf(new Object[]{Float.valueOf(f), Float.valueOf(f2)}, 2));
            Intrinsics.O10IXXX0X(str, "format(...)");
            return str;
        }
        if (i72.OXO1.OXI0Xi()) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.OXO1;
            String str2 = String.format(HelpFormatter.DEFAULT_LONG_OPT_PREFIX, Arrays.copyOf(new Object[0], 0));
            Intrinsics.O10IXXX0X(str2, "format(...)");
            return str2;
        }
        StringCompanionObject stringCompanionObject3 = StringCompanionObject.OXO1;
        String str3 = String.format("%s - %s", Arrays.copyOf(new Object[]{"0.0", "0.0"}, 2));
        Intrinsics.O10IXXX0X(str3, "format(...)");
        return str3;
    }

    public static final boolean IIX1OXO(Activity activity) {
        a01 a01Var = a01.OXO1;
        SPUtils sPUtilsIiI10X = a01Var.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        if (objFromJson != null) {
            appUser = objFromJson;
        }
        a01Var.XO0O10().put(AppUser.class.getName(), new Gson().toJson((AppUser) appUser));
        i72.OXO1.Oi1I(activity);
        return true;
    }

    /* JADX INFO: renamed from: IO */
    public static final int m38842IO(@aa1 byte[] bArr) {
        Intrinsics.X0O(bArr, "<this>");
        short[] sArr = new short[bArr.length / 2];
        ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer().get(sArr);
        Short shIOIIO01I = ArraysKt___ArraysKt.IOIIO01I(sArr);
        if (shIOIIO01I != null) {
            return shIOIIO01I.shortValue();
        }
        return 0;
    }

    public static final boolean IO0II0i(@aa1 Context context) {
        Intrinsics.X0O(context, "context");
        return Intrinsics.XOO0ii0(context.getResources().getConfiguration().locale.getLanguage(), "pt");
    }

    public static final void IO0iXO0O(int i, String str, NotificationCompat.Builder builder) {
        builder.setSmallIcon(R.mipmap.ic_launcher);
        builder.setContentText(XXO(i));
        Application app = Utils.getApp();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.addCategory("android.intent.category.BROWSABLE");
        Unit unit = Unit.OXO1;
        builder.setContentIntent(PendingIntent.getActivity(app, 0, intent, 67108864));
        builder.setAutoCancel(true);
        builder.setPriority(-2);
    }

    public static final boolean IX0IXOi(Activity activity, final AiKeyEditPopup aiKeyEditPopup, String text) {
        Intrinsics.X0O(text, "text");
        KeyboardUtils.hideSoftInput(activity);
        final String string = StringsKt__StringsKt.iX1X1(text).toString();
        if (TextUtils.isEmpty(string)) {
            ToastUtils.showLong(R.string.ai_key_input_tip);
            return false;
        }
        VoiceManager.INSTANCE.openAiCheck(StringsKt__StringsKt.iX1X1(text).toString(), new O1XIiIO<String>() { // from class: com.sma.smartv3.util.UtilsKt$showAiKeyPopup$1$1$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(String str) {
                a01.OXO1.IiI10X().put(b01.iI0I, string);
                aiKeyEditPopup.dismiss();
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
            }
        }, activity, aiKeyEditPopup.getMLayout());
        return false;
    }

    public static final void IX1XiI(@aa1 View view, float f) {
        Intrinsics.X0O(view, "<this>");
        view.setOutlineProvider(new OXO1(f));
        view.setClipToOutline(true);
    }

    public static final boolean IXI(@aa1 Context context) {
        Intrinsics.X0O(context, "context");
        Locale locale = context.getResources().getConfiguration().locale;
        return Intrinsics.XOO0ii0(locale.getLanguage(), Languages.DEFAULT_LANGUAGE_ZH) && Intrinsics.XOO0ii0(locale.getCountry(), "CN");
    }

    public static final boolean IXOIIIO(@aa1 String text) {
        Intrinsics.X0O(text, "text");
        return RegexUtils.isMatch(RegexConstants.REGEX_MOBILE_SIMPLE, text);
    }

    @aa1
    public static final String IXXOO(@aa1 BleDevice device) {
        Intrinsics.X0O(device, "device");
        if (!X00Xi1X(device)) {
            String address = device.getMBluetoothDevice().getAddress();
            Intrinsics.O10IXXX0X(address, "getAddress(...)");
            return address;
        }
        byte[] mScanRecord = device.getMScanRecord();
        if (mScanRecord == null) {
            mScanRecord = new byte[20];
        }
        return CollectionsKt___CollectionsKt.XOiXXOO(ArraysKt___ArraysKt.iiXX(ArraysKt___ArraysJvmKt.I0IIOI(mScanRecord, 10, 16)), CertificateUtil.DELIMITER, null, null, 0, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.kd6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return UtilsKt.iOO1ii1(((Byte) obj).byteValue());
            }
        }, 30, null);
    }

    public static final boolean Ii0X0X(@aa1 Context context) {
        Intrinsics.X0O(context, "context");
        return Intrinsics.XOO0ii0(context.getResources().getConfiguration().locale.getLanguage(), "it");
    }

    public static final boolean Ii0i(@aa1 Context context) {
        Intrinsics.X0O(context, "context");
        return Intrinsics.XOO0ii0(context.getResources().getConfiguration().locale.getCountry(), "US");
    }

    @aa1
    public static final String Ii1iii0(@aa1 String string) {
        Intrinsics.X0O(string, "string");
        int iHashCode = string.hashCode();
        if (iHashCode == 48 ? string.equals("0") : iHashCode == 1440 ? string.equals(HelpFormatter.DEFAULT_LONG_OPT_PREFIX) : iHashCode == 47602 && string.equals("0.0")) {
            return i72.OXO1.OXI0Xi() ? HelpFormatter.DEFAULT_LONG_OPT_PREFIX : "0";
        }
        return string;
    }

    public static final boolean IiiXiI0I(@aa1 Context context) {
        Intrinsics.X0O(context, "context");
        return Intrinsics.XOO0ii0(context.getResources().getConfiguration().locale.getLanguage(), Languages.DEFAULT_LANGUAGE_ZH);
    }

    public static /* synthetic */ Intent O001I(File file, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = file.getName();
            Intrinsics.O10IXXX0X(str, "getName(...)");
        }
        return iXiX011(file, str);
    }

    public static final boolean O0O(int i, Function0 function0, String text) {
        Intrinsics.X0O(text, "text");
        if (Intrinsics.XOO0ii0(text, String.valueOf(i))) {
            function0.invoke2();
            return true;
        }
        ToastUtils.showLong(R.string.verification_code_error);
        return false;
    }

    public static final void O0O0X0iOi(int i, String str, NotificationCompat.Builder builder) {
        builder.setSmallIcon(R.mipmap.ic_launcher);
        builder.setContentText(XXO(i));
        Application app = Utils.getApp();
        Intent intent = new Intent(Utils.getApp(), (Class<?>) WebViewActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", str);
        bundle.putInt("mArg1", WebViewActivity.Companion.XOO0ii0());
        intent.putExtras(bundle);
        Unit unit = Unit.OXO1;
        builder.setContentIntent(PendingIntent.getActivity(app, 0, intent, 67108864));
        builder.setAutoCancel(true);
        builder.setPriority(-2);
    }

    public static final void O10IXXX0X(@aa1 Context activity, @aa1 String insID) {
        Intrinsics.X0O(activity, "activity");
        Intrinsics.X0O(insID, "insID");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://instagram.com/_u/" + insID));
        intent.setPackage(BleNotification.INSTAGRAM);
        try {
            activity.startActivity(intent);
        } catch (Exception unused) {
            activity.startActivity(new Intent(new Intent("android.intent.action.VIEW", Uri.parse("https://www.instagram.com/" + insID))));
        }
    }

    @aa1
    public static final String O1O(@aa1 ExternalKeyManager key) throws InvalidKeySpecException {
        Intrinsics.X0O(key, "key");
        PrivateKey privateKeyGeneratePrivate = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(i72.XIi00iiXO, 0)));
        String second = key.getSecond();
        Intrinsics.XXI(privateKeyGeneratePrivate);
        byte[] bArrDecode = Base64.decode(XOO0XOOii(second, privateKeyGeneratePrivate), 0);
        Intrinsics.O10IXXX0X(bArrDecode, "decode(...)");
        return new String(I0IIOi(key.getFirst(), bArrDecode), Charsets.XIi00iiXO);
    }

    @aa1
    public static final ArrayList<DFUImagePath> OII(@aa1 List<? extends File> fileList) {
        int i;
        Intrinsics.X0O(fileList, "fileList");
        ArrayList<DFUImagePath> arrayList = new ArrayList<>();
        for (File file : fileList) {
            Uri uriFromFile = Uri.fromFile(file);
            i1O0OXO1O.OXO1.OXO1("getDFUImagePath  path=" + uriFromFile.getPath() + ",scheme=" + uriFromFile.getScheme());
            String name = file.getName();
            if (name != null) {
                switch (name) {
                    case "otaFont.bin":
                        i = 4;
                        break;
                    case "otaApp.bin":
                        i = 0;
                        break;
                    case "ctrl_packet.bin":
                        i = -1;
                        break;
                    case "otaRes.bin":
                        i = 3;
                        break;
                    case "otaroot.bin":
                        i = 5;
                        break;
                    default:
                        i = -333;
                        break;
                }
            } else {
                i = -333;
            }
            if (i != -333) {
                arrayList.add(new DFUImagePath(null, uriFromFile, i));
            }
        }
        return arrayList;
    }

    @aa1
    public static final String OIX0iXi(@tb1 String str) {
        if (str == null) {
            return "";
        }
        if (str.length() > 0) {
            StringBuilder sb = new StringBuilder();
            char cCharAt = str.charAt(0);
            sb.append((Object) (Character.isLowerCase(cCharAt) ? IXiXi0011.X1IX(cCharAt) : String.valueOf(cCharAt)));
            String strSubstring = str.substring(1);
            Intrinsics.O10IXXX0X(strSubstring, "substring(...)");
            sb.append(strSubstring);
            str = sb.toString();
        }
        return str == null ? "" : str;
    }

    public static final double OIi0(double d) {
        return ((double) 44330) * (((double) 1) - Math.pow(d / 1013.25d, 0.190284d));
    }

    /* JADX INFO: renamed from: OO */
    public static final int m38843OO(@aa1 Context mContext, int i) {
        Intrinsics.X0O(mContext, "mContext");
        try {
            int identifier = mContext.getResources().getIdentifier("pic_weather_bg" + XOX0O0(i), "drawable", mContext.getPackageName());
            return identifier == 0 ? R.drawable.pic_weather_bg1 : identifier;
        } catch (Exception e) {
            e.printStackTrace();
            return R.drawable.pic_weather_bg1;
        }
    }

    @aa1
    /* JADX INFO: renamed from: OX */
    public static final String m38844OX() {
        BleCache bleCache = BleCache.INSTANCE;
        return "name: " + bleCache.getMBleName() + "\nplatform: " + bleCache.getMPlatform() + "\nprototype: " + bleCache.getMPrototype() + "\nfw flag: " + bleCache.getMFirmwareFlag() + "\nfw ver: " + BaseBleCache.getString$default(bleCache, BleKey.FIRMWARE_VERSION, null, null, 6, null) + "\nui ver: " + BaseBleCache.getString$default(bleCache, BleKey.UI_PACK_VERSION, null, null, 6, null) + "\ngps fw ver: " + BaseBleCache.getString$default(bleCache, BleKey.GPS_FIRMWARE_VERSION, null, null, 6, null) + "\n4g fw ver: " + BaseBleCache.getString$default(bleCache, BleKey.NETWORK_FIRMWARE_VERSION, null, null, 6, null);
    }

    @tb1
    public static final String OX110i(@aa1 Context context, @tb1 Uri uri) {
        Cursor cursorQuery;
        int columnIndex;
        Intrinsics.X0O(context, "context");
        String string = null;
        if (uri == null) {
            return null;
        }
        String scheme = uri.getScheme();
        if (scheme != null && !Intrinsics.XOO0ii0("file", scheme)) {
            if (Intrinsics.XOO0ii0("content", scheme) && (cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, null, null, null)) != null) {
                if (cursorQuery.moveToFirst() && (columnIndex = cursorQuery.getColumnIndex("_data")) > -1) {
                    string = cursorQuery.getString(columnIndex);
                }
                cursorQuery.close();
            }
            return string;
        }
        return uri.getPath();
    }

    /* JADX INFO: renamed from: Oi */
    public static final void m38845Oi(@aa1 final String url, final int i) {
        Intrinsics.X0O(url, "url");
        NotificationUtils.notify(i, new NotificationUtils.ChannelConfig("open_browser", "open_browser", 2), (Utils.Consumer<NotificationCompat.Builder>) new Utils.Consumer() { // from class: com.android.mltcode.paycertificationapi.nd6
            @Override // com.blankj.utilcode.util.Utils.Consumer
            public final void accept(Object obj) {
                UtilsKt.IO0iXO0O(i, url, (NotificationCompat.Builder) obj);
            }
        });
    }

    @aa1
    public static final Map<String, String> OiIIX101O(@aa1 Context context, int i) {
        Intrinsics.X0O(context, "context");
        HashMap map = new HashMap();
        Map<String, String> mapXX0 = XX0(context, i);
        Locale locale = Locale.ENGLISH;
        String str = mapXX0.get(locale.toString());
        if (str == null) {
            str = "";
        }
        map.put(locale.toString(), str);
        for (Map.Entry<String, String> entry : mapXX0.entrySet()) {
            if (!Intrinsics.XOO0ii0(entry.getValue(), str)) {
                map.put(entry.getKey(), entry.getValue());
            }
        }
        return map;
    }

    public static final int X00XIX1(@aa1 Context mContext, int i) {
        Intrinsics.X0O(mContext, "mContext");
        try {
            int identifier = mContext.getResources().getIdentifier("ic_weather_larger" + XOX0O0(i), "drawable", mContext.getPackageName());
            return identifier == 0 ? R.drawable.ic_weather_larger1 : identifier;
        } catch (Exception e) {
            e.printStackTrace();
            return R.drawable.ic_weather_larger1;
        }
    }

    public static final boolean X00Xi1X(@aa1 BleDevice device) {
        Intrinsics.X0O(device, "device");
        byte[] mScanRecord = device.getMScanRecord();
        if (mScanRecord == null) {
            mScanRecord = new byte[20];
        }
        if (mScanRecord.length > 20) {
            return Intrinsics.XOO0ii0(new String(CollectionsKt___CollectionsKt.XX0X0(ArraysKt___ArraysKt.iiXX(ArraysKt___ArraysJvmKt.I0IIOI(mScanRecord, 4, 9))), Charsets.XIi00iiXO), BluetoothConstant.OTA_FILTER_FLAG);
        }
        return false;
    }

    @aa1
    @SuppressLint({"DefaultLocale"})
    public static final String X01IiOiIi(float f) {
        if (f == 0.0f) {
            return i72.OXO1.OXI0Xi() ? HelpFormatter.DEFAULT_LONG_OPT_PREFIX : "0.0";
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
        String str = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f / 10.0f)}, 1));
        Intrinsics.O10IXXX0X(str, "format(...)");
        return str;
    }

    public static final boolean X0O(@aa1 Function0<Unit> action) {
        Intrinsics.X0O(action, "action");
        if (i72.OXO1.iOIi00Ii()) {
            action.invoke2();
            return true;
        }
        final Activity topActivity = ActivityUtils.getTopActivity();
        int i = 0;
        if (topActivity != null) {
            go0 go0Var = new go0(topActivity, i, 2, null);
            go0Var.O1O(R.string.prompt);
            go0Var.m1865iX(Integer.valueOf(R.string.not_logged_pop_tip));
            go0Var.i010I().setBackgroundTintList(ColorStateList.valueOf(topActivity.getColor(R.color.blue_color)));
            go0Var.iX1O1(Integer.valueOf(R.string.not_logged_in_yet), new Function0() { // from class: com.android.mltcode.paycertificationapi.id6
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(UtilsKt.I1XOi1());
                }
            });
            go0Var.X1IX(R.string.to_login, new Function0() { // from class: com.android.mltcode.paycertificationapi.jd6
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(UtilsKt.IIX1OXO(topActivity));
                }
            });
            go0Var.IIX1OXO();
        } else {
            ToastUtils.showLong(R.string.not_logged_in_yet);
        }
        return false;
    }

    @aa1
    public static final String X0i1O() {
        String base_url = Api.INSTANCE.getBASE_URL();
        switch (base_url.hashCode()) {
            case -2019210183:
                if (!base_url.equals("https://api.c.iot-solution.net/kotlinweb")) {
                    return "Test Server";
                }
                String string = Utils.getApp().getString(R.string.china_mainland);
                Intrinsics.O10IXXX0X(string, "getString(...)");
                return string;
            case -1644804843:
                if (!base_url.equals(e44.XIi00iiXO)) {
                    return "Test Server";
                }
                String string2 = Utils.getApp().getString(R.string.europe_and_america);
                Intrinsics.O10IXXX0X(string2, "getString(...)");
                return string2;
            case -1633488716:
                if (!base_url.equals("https://api.eg.iot-solution.net/kotlinweb")) {
                    return "Test Server";
                }
                String string3 = Utils.getApp().getString(R.string.europe_and_america);
                Intrinsics.O10IXXX0X(string3, "getString(...)");
                return string3;
            case -167076722:
                if (!base_url.equals(e44.OXO1)) {
                    return "Test Server";
                }
                String string4 = Utils.getApp().getString(R.string.asia_pacific);
                Intrinsics.O10IXXX0X(string4, "getString(...)");
                return string4;
            case 1433701912:
                if (!base_url.equals(e44.O00)) {
                    return "Test Server";
                }
                String string5 = Utils.getApp().getString(R.string.silicon_valley_of_america_name);
                Intrinsics.O10IXXX0X(string5, "getString(...)");
                return string5;
            case 1582655416:
                if (!base_url.equals(e44.f6332iO)) {
                    return "Test Server";
                }
                String string6 = Utils.getApp().getString(R.string.china_mainland);
                Intrinsics.O10IXXX0X(string6, "getString(...)");
                return string6;
            case 1816079795:
                return !base_url.equals(iX1IIO10.OXO1) ? "Test Server" : "Dev Server";
            default:
                return "Test Server";
        }
    }

    /* JADX INFO: renamed from: X1 */
    public static final boolean m38846X1() {
        Object systemService = Utils.getApp().getSystemService("location");
        Intrinsics.X1ii(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        LocationManager locationManager = (LocationManager) systemService;
        return locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network");
    }

    @aa1
    public static final String X100O(int i) {
        if (i <= 2) {
            String string = Utils.getApp().getString(R.string.low);
            Intrinsics.XXI(string);
            return string;
        }
        if (i <= 5) {
            String string2 = Utils.getApp().getString(R.string.hr_zone3);
            Intrinsics.XXI(string2);
            return string2;
        }
        String string3 = Utils.getApp().getString(R.string.high);
        Intrinsics.XXI(string3);
        return string3;
    }

    @aa1
    public static final String X11I(int i) {
        if (i == 0) {
            return i72.OXO1.OXI0Xi() ? IiXI1X1OO.O00 : "0";
        }
        return String.valueOf(i);
    }

    @aa1
    public static final String X11iII1O1() {
        return ro3.XO0O10().O00() + "-Android " + Build.VERSION.RELEASE;
    }

    public static final int X1IX() {
        String mPlatform = BleCache.INSTANCE.getMPlatform();
        switch (mPlatform.hashCode()) {
            case -1955887059:
                return !mPlatform.equals(BleDeviceInfo.PLATFORM_NORDIC) ? 0 : 2;
            case -1549651556:
                return !mPlatform.equals(BleDeviceInfo.PLATFORM_REALTEK) ? 0 : 1;
            case 78896685:
                return !mPlatform.equals(BleDeviceInfo.PLATFORM_SIFLI) ? 0 : 3;
            case 1697379018:
                return !mPlatform.equals(BleDeviceInfo.PLATFORM_JL707LITE) ? 0 : 4;
            default:
                return 0;
        }
    }

    public static final void X1ii(@aa1 Context activity, @aa1 String facebookUrl) {
        Intrinsics.X0O(activity, "activity");
        Intrinsics.X0O(facebookUrl, "facebookUrl");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("fb://facewebmodal/f?href=" + facebookUrl));
        intent.setPackage("com.facebook.katana");
        try {
            activity.startActivity(intent);
        } catch (Exception unused) {
            activity.startActivity(new Intent(new Intent("android.intent.action.VIEW", Uri.parse(facebookUrl))));
        }
    }

    public static final boolean XO0X10iO(@aa1 Context context) {
        Intrinsics.X0O(context, "context");
        return Intrinsics.XOO0ii0(context.getResources().getConfiguration().locale.getCountry(), "IN");
    }

    public static final void XOIX(@aa1 String url, @aa1 Context context) {
        Intrinsics.X0O(url, "url");
        Intrinsics.X0O(context, "context");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(url));
        intent.addCategory("android.intent.category.BROWSABLE");
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(intent);
        } else {
            i1O0OXO1O.OXO1.OXO1("No browser found to open the URL.");
        }
    }

    public static final byte[] XOO0XOOii(String str, PrivateKey privateKey) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance(C12622da.f34545b);
        cipher.init(2, privateKey);
        byte[] bArrDoFinal = cipher.doFinal(Base64.decode(str, 0));
        Intrinsics.O10IXXX0X(bArrDoFinal, "doFinal(...)");
        return bArrDoFinal;
    }

    public static final int XOX0O0(int i) {
        if (q62.OXO1.OXOO0X0i()) {
            if (i == 2) {
                return 3;
            }
            if (i == 3) {
                return 2;
            }
        }
        return i;
    }

    @aa1
    public static final String XOXiX0(@tb1 String str) {
        return (Intrinsics.XOO0ii0(str, "0") || Intrinsics.XOO0ii0(str, "0.0") || str == null) ? HelpFormatter.DEFAULT_LONG_OPT_PREFIX : str;
    }

    @aa1
    public static final Map<String, String> XX0(@aa1 Context context, int i) {
        Intrinsics.X0O(context, "context");
        HashMap map = new HashMap();
        Resources resources = context.getResources();
        Configuration configuration = resources.getConfiguration();
        Intrinsics.O10IXXX0X(configuration, "getConfiguration(...)");
        Locale[] availableLocales = Locale.getAvailableLocales();
        Intrinsics.XXI(availableLocales);
        for (Locale locale : availableLocales) {
            configuration.setLocale(locale);
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
            String string = resources.getString(i);
            Intrinsics.O10IXXX0X(string, "getString(...)");
            if (string.length() > 0) {
                map.put(locale.toString(), string);
            }
        }
        return map;
    }

    public static final void XX00i10X(@aa1 final String url, final int i) {
        Intrinsics.X0O(url, "url");
        NotificationUtils.notify(i, new NotificationUtils.ChannelConfig("open_webView", "open_webView", 2), (Utils.Consumer<NotificationCompat.Builder>) new Utils.Consumer() { // from class: com.android.mltcode.paycertificationapi.hd6
            @Override // com.blankj.utilcode.util.Utils.Consumer
            public final void accept(Object obj) {
                UtilsKt.O0O0X0iOi(i, url, (NotificationCompat.Builder) obj);
            }
        });
    }

    @aa1
    public static final String XX1Oi() {
        return "58_" + DeviceUtils.getUniqueDeviceId();
    }

    public static /* synthetic */ void XXI(Context context, String str, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = "";
        }
        if ((i & 8) != 0) {
            str3 = "";
        }
        I0iXXO(context, str, str2, str3);
    }

    @aa1
    public static final CustomLocation XXIIO1i11() {
        CustomLocation customLocation = new CustomLocation(0.0d, 0.0d, 0.0d, 0.0f, 0, 0L, null, 0.0f, 0.0f, 0.0f, 1023, null);
        String string = a01.OXO1.IiI10X().getString(b01.XX1Oi);
        try {
            if (!TextUtils.isEmpty(string)) {
                Intrinsics.XXI(string);
                List listI1I = StringsKt__StringsKt.i1I(string, new String[]{I000IiI1O.C2156iO.XO0O10}, false, 0, 6, null);
                customLocation.X0O(Double.parseDouble((String) listI1I.get(0)));
                customLocation.X1ii(Double.parseDouble((String) listI1I.get(1)));
                customLocation.OIX0iXi(Double.parseDouble((String) listI1I.get(2)));
                return customLocation;
            }
        } catch (Exception e) {
            e.printStackTrace();
            i1O0OXO1O.OXO1.OXO1("getLocationFromCache error: " + string + ", " + e.getMessage());
        }
        return customLocation;
    }

    @aa1
    public static final String XXO(int i) {
        String string = Utils.getApp().getResources().getString(i);
        Intrinsics.O10IXXX0X(string, "getString(...)");
        return string;
    }

    @aa1
    public static final String XXX11i() {
        return ro3.XIi00iiXO() + " " + ro3.m2987iO();
    }

    public static final boolean XXiIiX10(@aa1 BleDevice device) {
        Intrinsics.X0O(device, "device");
        byte[] mScanRecord = device.getMScanRecord();
        if (mScanRecord == null) {
            mScanRecord = new byte[20];
        }
        return mScanRecord.length > 20 && mScanRecord[2] == -42 && mScanRecord[3] == 5;
    }

    public static final void XXiO0i(@aa1 final Activity activity) {
        Intrinsics.X0O(activity, "activity");
        LogUtils.m11128d("showAiKeyPopup");
        final AiKeyEditPopup aiKeyEditPopup = new AiKeyEditPopup();
        aiKeyEditPopup.setMListener(new Function1() { // from class: com.android.mltcode.paycertificationapi.ld6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(UtilsKt.IX0IXOi(activity, aiKeyEditPopup, (String) obj));
            }
        });
        aiKeyEditPopup.show((AppCompatActivity) activity);
    }

    @aa1
    public static final String Xi1i0XOX0(@aa1 String bleAddress) {
        Intrinsics.X0O(bleAddress, "bleAddress");
        return StringsKt___StringsKt.iii100(oe5.IXO0OOi(bleAddress, CertificateUtil.DELIMITER, "", false, 4, null), 4);
    }

    @aa1
    public static final String XiOIO(@aa1 String name) {
        String str;
        Intrinsics.X0O(name, "name");
        try {
            str = name;
            try {
                List listI1I = StringsKt__StringsKt.i1I(str, new String[]{HelpFormatter.DEFAULT_OPT_PREFIX}, false, 0, 6, null);
                if (listI1I.size() >= 3 && oe5.O0Ii((String) listI1I.get(2), "Neural", false, 2, null)) {
                    return StringsKt___StringsKt.I0O1OX0i((String) listI1I.get(2), 6);
                }
            } catch (Exception e) {
                e = e;
                e.printStackTrace();
            }
        } catch (Exception e2) {
            e = e2;
            str = name;
        }
        return str;
    }

    @aa1
    public static final String XiOIii1(@aa1 String key) {
        String strO1O;
        Intrinsics.X0O(key, "key");
        SPUtils sPUtilsXIi00iiXO = a01.OXO1.XIi00iiXO();
        ExternalKeyManager externalKeyManager = (ExternalKeyManager) new Gson().fromJson(sPUtilsXIi00iiXO.getString(key + '_' + ExternalKeyManager.class.getName()), ExternalKeyManager.class);
        return (externalKeyManager == null || (strO1O = O1O(externalKeyManager)) == null) ? "" : strO1O;
    }

    public static final void Xii11I(@aa1 View view, boolean z) {
        Intrinsics.X0O(view, "view");
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        if (z) {
            view.setLayerType(2, paint);
        } else {
            view.setLayerType(2, null);
        }
    }

    @aa1
    @SuppressLint({"DefaultLocale"})
    public static final String i010I(int i) {
        if (i == 0) {
            return i72.OXO1.OXI0Xi() ? HelpFormatter.DEFAULT_LONG_OPT_PREFIX : "0";
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
        String str = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(i / 10.0f)}, 1));
        Intrinsics.O10IXXX0X(str, "format(...)");
        return str;
    }

    public static final int i0X000X0O(@aa1 Context mContext, int i) {
        Intrinsics.X0O(mContext, "mContext");
        try {
            int identifier = mContext.getResources().getIdentifier("weather_name" + i, TypedValues.Custom.S_STRING, mContext.getPackageName());
            return identifier == 0 ? R.string.weather_name1 : identifier;
        } catch (Exception e) {
            e.printStackTrace();
            return R.string.weather_name1;
        }
    }

    public static final boolean i11I(@aa1 Context context) {
        Intrinsics.X0O(context, "context");
        return Intrinsics.XOO0ii0(context.getResources().getConfiguration().locale.getLanguage(), "es");
    }

    /* JADX INFO: renamed from: iI */
    public static final int m38847iI() {
        return OXO1;
    }

    public static final int iIXi1iiXI() {
        String base_url = Api.INSTANCE.getBASE_URL();
        int iHashCode = base_url.hashCode();
        if (iHashCode == -1644804843) {
            return !base_url.equals(e44.XIi00iiXO) ? 0 : 2;
        }
        if (iHashCode != -167076722) {
            return (iHashCode == 1582655416 && base_url.equals(e44.f6332iO)) ? 1 : 0;
        }
        base_url.equals(e44.OXO1);
        return 0;
    }

    @aa1
    public static final String iIiiO(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(new Date(j));
        boolean z = calendar2.get(1) == calendar.get(1) && calendar2.get(6) == calendar.get(6);
        boolean z2 = calendar2.get(1) == calendar.get(1) && calendar2.get(6) == calendar.get(6) - 1;
        if (z) {
            return XXO(R.string.date_today);
        }
        if (z2) {
            return XXO(R.string.date_yesterday);
        }
        String str = O0X11OiO.iiIOiX().format(Long.valueOf(j));
        Intrinsics.XXI(str);
        return str;
    }

    public static final void iOI(int i) {
        OXO1 = i;
    }

    public static final CharSequence iOO1ii1(byte b) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
        String str = String.format("%02X", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
        Intrinsics.O10IXXX0X(str, "format(...)");
        return str;
    }

    @tb1
    public static final <T> T iOOX010X(@aa1 String errorBody, @tb1 Class<T> cls) {
        Intrinsics.X0O(errorBody, "errorBody");
        try {
            return (T) ParseUtil.getParserFactory().getObject(errorBody, cls);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static final int iOiXi11II(@aa1 Context mContext, int i) {
        Intrinsics.X0O(mContext, "mContext");
        try {
            int identifier = mContext.getResources().getIdentifier("ic_weather" + XOX0O0(i), "drawable", mContext.getPackageName());
            return identifier == 0 ? R.drawable.ic_weather0 : identifier;
        } catch (Exception e) {
            e.printStackTrace();
            return R.drawable.ic_weather0;
        }
    }

    @aa1
    @SuppressLint({"DefaultLocale"})
    /* JADX INFO: renamed from: iX */
    public static final String m38849iX(int i, int i2) {
        if (i != 0 || i2 != 0) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
            String str = String.format("%d - %d", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, 2));
            Intrinsics.O10IXXX0X(str, "format(...)");
            return str;
        }
        if (i72.OXO1.OXI0Xi()) {
            return HelpFormatter.DEFAULT_LONG_OPT_PREFIX;
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.OXO1;
        String str2 = String.format("%d - %d", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, 2));
        Intrinsics.O10IXXX0X(str2, "format(...)");
        return str2;
    }

    @aa1
    public static final String iX1O1(@aa1 String url) {
        Intrinsics.X0O(url, "url");
        String path = Uri.parse(url).getPath();
        if (path != null) {
            String name = new File(path).getName();
            Intrinsics.O10IXXX0X(name, "getName(...)");
            return name;
        }
        String strEncryptMD5ToString = EncryptUtils.encryptMD5ToString(url);
        Intrinsics.O10IXXX0X(strEncryptMD5ToString, "encryptMD5ToString(...)");
        return strEncryptMD5ToString;
    }

    public static final void iXi(@aa1 Activity activity, @aa1 final Function0<Unit> action) {
        Intrinsics.X0O(activity, "activity");
        Intrinsics.X0O(action, "action");
        iii1ii iii1iiVar = new iii1ii(activity, R.layout.pop_edit_security_code);
        final int i = 837765;
        iii1iiVar.X11iII1O1(new Function1() { // from class: com.android.mltcode.paycertificationapi.md6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(UtilsKt.O0O(i, action, (String) obj));
            }
        });
        iii1iiVar.IIX1OXO();
    }

    @aa1
    public static final Intent iXiX011(@aa1 File file, @aa1 String title) {
        Intrinsics.X0O(file, "file");
        Intrinsics.X0O(title, "title");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", title);
        intent.putExtra("android.intent.extra.STREAM", UriUtils.file2Uri(file));
        intent.setType("*/*");
        Intent intentCreateChooser = Intent.createChooser(intent, "");
        Intrinsics.O10IXXX0X(intentCreateChooser, "createChooser(...)");
        intentCreateChooser.addFlags(268435456);
        return intentCreateChooser;
    }

    @aa1
    public static final String iXiiiO(int i) {
        if (i == 0) {
            return i72.OXO1.OXI0Xi() ? HelpFormatter.DEFAULT_LONG_OPT_PREFIX : "0";
        }
        return String.valueOf(i);
    }

    public static final boolean iiIOiX(@aa1 BleDeviceFile deviceFile) {
        Object objValueOf;
        Intrinsics.X0O(deviceFile, "deviceFile");
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        i1o0oxo1o.OXO1("saveDeviceLog -> " + OXO1 + ", " + deviceFile);
        Date date = new Date();
        long offset = (long) TimeZone.getDefault().getOffset(System.currentTimeMillis());
        if (deviceFile.getMFileSize() == 0) {
            if (OXO1 == 3) {
                OXO1 = 0;
                return true;
            }
            OXO1 = 3;
            BaseBleConnector.sendInt8$default(BleConnector.INSTANCE, BleKey.DEVICE_FILE, BleKeyFlag.READ, OXO1, false, false, 24, null);
            return false;
        }
        date.setTime((((long) (deviceFile.getMTime() + BleConstsKt.DATA_EPOCH)) * 1000) - offset);
        File fileXiOIO = uz0.XiOIO(sz0.OXO1);
        int i = OXO1;
        String str = O0X11OiO.IO0iXO0O().format(date);
        int mIndex = deviceFile.getMIndex();
        int mFileFormat = deviceFile.getMFileFormat();
        if (mFileFormat == 1) {
            objValueOf = "wav";
        } else if (mFileFormat != 2) {
            objValueOf = mFileFormat != 3 ? Integer.valueOf(deviceFile.getMFileFormat()) : "bmp";
        } else {
            objValueOf = "bin";
        }
        File file = new File(fileXiOIO, i + IiXI1X1OO.O00 + str + IiXI1X1OO.O00 + mIndex + FileUtils.FILE_EXTENSION_SEPARATOR + objValueOf);
        if (deviceFile.getMOffsetValue() == 0) {
            file.delete();
        }
        FileIOUtils.writeFileFromBytesByStream(file, deviceFile.getMFileContent(), true);
        if (deviceFile.getMOffsetValue() + deviceFile.getMFileContent().length == deviceFile.getMFileSize()) {
            i1o0oxo1o.OXO1("saveDeviceLog -> start new " + OXO1);
            BaseBleConnector.sendInt8$default(BleConnector.INSTANCE, BleKey.DEVICE_FILE, BleKeyFlag.READ, OXO1, false, false, 24, null);
        } else {
            i1o0oxo1o.OXO1("saveDeviceLog -> continue");
            BaseBleConnector.sendData$default(BleConnector.INSTANCE, BleKey.DEVICE_FILE, BleKeyFlag.READ_CONTINUE, null, false, false, 28, null);
        }
        return false;
    }

    public static final int iii0(boolean z) {
        return z ? 0 : 8;
    }

    @aa1
    public static final String iiiO(@aa1 Context context) {
        Intrinsics.X0O(context, "context");
        String country = context.getResources().getConfiguration().locale.getCountry();
        Intrinsics.O10IXXX0X(country, "getCountry(...)");
        return country;
    }
}
