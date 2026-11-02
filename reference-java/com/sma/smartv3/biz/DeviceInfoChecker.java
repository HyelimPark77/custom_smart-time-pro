package com.sma.smartv3.biz;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.O0Oiii;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.OOiOOO1OI;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.e44;
import com.android.mltcode.paycertificationapi.gj0;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iX1IIO10;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.android.mltcode.paycertificationapi.yn0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.blankj.utilcode.util.ImageUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.blankj.utilcode.util.Utils;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;
import com.facebook.internal.security.CertificateUtil;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.biz.DeviceInfoChecker;
import com.sma.smartv3.model.AppConfigInfo;
import com.sma.smartv3.model.AppVersion;
import com.sma.smartv3.model.DeviceConfigInfo;
import com.sma.smartv3.model.DeviceOnlineInfo;
import com.sma.smartv3.model.ExternalKeyManager;
import com.sma.smartv3.model.ExtraPackVersions;
import com.sma.smartv3.model.ExtraPackageData;
import com.sma.smartv3.model.FirmwareVersion;
import com.sma.smartv3.model.LanguageTranslationData;
import com.sma.smartv3.model.OnlineWatchFace;
import com.sma.smartv3.model.WatchFaceCategory;
import com.sma.smartv3.model.WatchFaceInfo;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.AppVersionLatest;
import com.sma.smartv3.network.BleExtraPackVersionFont;
import com.sma.smartv3.network.BleExtraPackVersionGPSFirmware;
import com.sma.smartv3.network.BleExtraPackVersionLanguage;
import com.sma.smartv3.network.BleExtraPackVersionUi;
import com.sma.smartv3.network.BleFirmwareCheck;
import com.sma.smartv3.network.ExtraPackVersionLatest;
import com.sma.smartv3.network.FirmwareVersionLatest;
import com.sma.smartv3.network.GetAppConfigInfo;
import com.sma.smartv3.network.GetDeviceInfo;
import com.sma.smartv3.network.GetDeviceListObject;
import com.sma.smartv3.network.GetExternalKey;
import com.sma.smartv3.network.GetGomoreAuthKey;
import com.sma.smartv3.network.GetSparkAuthorize;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.RequestBodyKt;
import com.sma.smartv3.p610ui.device.FirmwareUpgradeATSActivity;
import com.sma.smartv3.p610ui.device.FirmwareUpgradeGQActivity;
import com.sma.smartv3.p610ui.device.FirmwareUpgradeJSma2Activity;
import com.sma.smartv3.p610ui.device.FirmwareUpgradeJSmaActivity;
import com.sma.smartv3.p610ui.device.FirmwareUpgradeNSmaActivity;
import com.sma.smartv3.p610ui.device.FirmwareUpgradeRActivity;
import com.sma.smartv3.p610ui.device.FirmwareUpgradeRSmaActivity;
import com.sma.smartv3.p610ui.device.FontRepairRActivity;
import com.sma.smartv3.p610ui.device.FontRepairSmaActivity;
import com.sma.smartv3.p610ui.device.GPSFirmwareRepairSmaActivity;
import com.sma.smartv3.p610ui.device.UiRepairRActivity;
import com.sma.smartv3.p610ui.device.UiRepairSmaActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.MicrosoftSDKManage;
import com.sma.smartv3.util.UtilsKt;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleDeviceInfo;
import com.szabh.smable3.entity.BleGoMoreSettings;
import com.tenmeter.smlibrary.utils.FileUtils;
import java.security.spec.InvalidKeySpecException;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.I0IIOi;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nDeviceInfoChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceInfoChecker.kt\ncom/sma/smartv3/biz/DeviceInfoChecker\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,920:1\n176#2,11:921\n196#2:940\n176#2,11:941\n196#2:960\n176#2,11:961\n196#2:980\n176#2,11:981\n196#2:1000\n176#2,11:1001\n196#2:1020\n176#2,11:1021\n196#2:1040\n176#2,11:1104\n196#2:1123\n176#2,11:1124\n196#2:1143\n176#2,11:1144\n196#2:1163\n176#2,11:1164\n196#2:1183\n235#2,11:1184\n246#2:1196\n256#2:1206\n235#2,11:1207\n246#2:1219\n256#2:1229\n176#2,11:1230\n196#2:1249\n235#2,11:1250\n246#2:1262\n256#2:1272\n183#2,4:1273\n196#2:1285\n176#2,11:1286\n196#2:1305\n235#2,11:1306\n246#2:1318\n256#2:1328\n252#3,7:932\n270#3:939\n252#3,7:952\n270#3:959\n252#3,7:972\n270#3:979\n252#3,7:992\n270#3:999\n252#3,7:1012\n270#3:1019\n252#3,7:1032\n270#3:1039\n252#3,7:1115\n270#3:1122\n252#3,7:1135\n270#3:1142\n252#3,7:1155\n270#3:1162\n252#3,7:1175\n270#3:1182\n278#3,8:1197\n298#3:1205\n278#3,8:1220\n298#3:1228\n252#3,7:1241\n270#3:1248\n278#3,8:1263\n298#3:1271\n252#3,7:1277\n270#3:1284\n252#3,7:1297\n270#3:1304\n278#3,8:1319\n298#3:1327\n69#4,3:1041\n72#4,5:1045\n69#4,3:1050\n72#4,5:1054\n69#4,3:1059\n72#4,5:1063\n69#4,3:1068\n72#4,5:1072\n69#4,3:1077\n72#4,5:1081\n69#4,3:1086\n72#4,5:1090\n69#4,3:1095\n72#4,5:1099\n1#5:1044\n1#5:1053\n1#5:1062\n1#5:1071\n1#5:1080\n1#5:1089\n1#5:1098\n1#5:1195\n1#5:1218\n1#5:1261\n1#5:1317\n*S KotlinDebug\n*F\n+ 1 DeviceInfoChecker.kt\ncom/sma/smartv3/biz/DeviceInfoChecker\n*L\n72#1:921,11\n72#1:940\n92#1:941,11\n92#1:960\n118#1:961,11\n118#1:980\n153#1:981,11\n153#1:1000\n179#1:1001,11\n179#1:1020\n216#1:1021,11\n216#1:1040\n319#1:1104,11\n319#1:1123\n336#1:1124,11\n336#1:1143\n438#1:1144,11\n438#1:1163\n518#1:1164,11\n518#1:1183\n570#1:1184,11\n570#1:1196\n570#1:1206\n638#1:1207,11\n638#1:1219\n638#1:1229\n733#1:1230,11\n733#1:1249\n772#1:1250,11\n772#1:1262\n772#1:1272\n798#1:1273,4\n798#1:1285\n845#1:1286,11\n845#1:1305\n879#1:1306,11\n879#1:1318\n879#1:1328\n72#1:932,7\n72#1:939\n92#1:952,7\n92#1:959\n118#1:972,7\n118#1:979\n153#1:992,7\n153#1:999\n179#1:1012,7\n179#1:1019\n216#1:1032,7\n216#1:1039\n319#1:1115,7\n319#1:1122\n336#1:1135,7\n336#1:1142\n438#1:1155,7\n438#1:1162\n518#1:1175,7\n518#1:1182\n570#1:1197,8\n570#1:1205\n638#1:1220,8\n638#1:1228\n733#1:1241,7\n733#1:1248\n772#1:1263,8\n772#1:1271\n798#1:1277,7\n798#1:1284\n845#1:1297,7\n845#1:1304\n879#1:1319,8\n879#1:1327\n283#1:1041,3\n283#1:1045,5\n285#1:1050,3\n285#1:1054,5\n290#1:1059,3\n290#1:1063,5\n294#1:1068,3\n294#1:1072,5\n299#1:1077,3\n299#1:1081,5\n302#1:1086,3\n302#1:1090,5\n307#1:1095,3\n307#1:1099,5\n283#1:1044\n285#1:1053\n290#1:1062\n294#1:1071\n299#1:1080\n302#1:1089\n307#1:1098\n570#1:1195\n638#1:1218\n772#1:1261\n879#1:1317\n*E\n"})
public final class DeviceInfoChecker {

    @aa1
    public static final DeviceInfoChecker OXO1 = new DeviceInfoChecker();

    @SourceDebugExtension({"SMAP\nDeviceInfoChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceInfoChecker.kt\ncom/sma/smartv3/biz/DeviceInfoChecker$toFontRepair$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,920:1\n11#2,2:921\n27#2,2:941\n27#2,2:943\n69#3,3:923\n72#3,5:927\n69#3,3:932\n72#3,5:936\n69#3,3:945\n72#3,5:949\n69#3,3:954\n72#3,5:958\n1#4:926\n1#4:935\n1#4:948\n1#4:957\n*S KotlinDebug\n*F\n+ 1 DeviceInfoChecker.kt\ncom/sma/smartv3/biz/DeviceInfoChecker$toFontRepair$1\n*L\n489#1:921,2\n495#1:941,2\n501#1:943,2\n491#1:923,3\n491#1:927,5\n492#1:932,3\n492#1:936,5\n506#1:945,3\n506#1:949,5\n507#1:954,3\n507#1:958,5\n491#1:926\n492#1:935\n506#1:948\n507#1:957\n*E\n"})
    public static final class OXO1 implements O0Oiii<ExtraPackageData[]> {
        public final /* synthetic */ Activity OXO1;

        public OXO1(Activity activity) {
            this.OXO1 = activity;
        }

        @Override // com.android.mltcode.paycertificationapi.O0Oiii
        /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
        public void onSuccess(ExtraPackageData[] extraPackageDataArr) {
            if (extraPackageDataArr == null || extraPackageDataArr.length == 0) {
                a01.OXO1.XO0O10().remove(ExtraPackageData.class.getName());
                ToastUtils.showLong(R.string.not_found_repair_version);
                return;
            }
            LogUtils.m11128d(extraPackageDataArr[0]);
            a01.OXO1.XO0O10().put(ExtraPackageData.class.getName(), new Gson().toJson(extraPackageDataArr[0]));
            int iXX00i10X = q62.OXO1.XX00i10X();
            if (iXX00i10X == 0) {
                Activity activity = this.OXO1;
                activity.startActivity(new Intent(activity, (Class<?>) FontRepairRActivity.class));
            } else {
                if (iXX00i10X != 1) {
                    return;
                }
                Activity activity2 = this.OXO1;
                activity2.startActivity(new Intent(activity2, (Class<?>) FontRepairSmaActivity.class));
            }
        }

        @Override // com.android.mltcode.paycertificationapi.O0Oiii
        public void onFailure(String error) {
            Intrinsics.X0O(error, "error");
            a01.OXO1.XO0O10().remove(ExtraPackageData.class.getName());
            if (Intrinsics.XOO0ii0(BleCache.INSTANCE.getMPlatform(), BleDeviceInfo.PLATFORM_JL)) {
                ToastUtils.showLong(R.string.not_found_repair_version);
                return;
            }
            int iXX00i10X = q62.OXO1.XX00i10X();
            if (iXX00i10X == 0) {
                Activity activity = this.OXO1;
                activity.startActivity(new Intent(activity, (Class<?>) FontRepairRActivity.class));
            } else {
                if (iXX00i10X != 1) {
                    return;
                }
                Activity activity2 = this.OXO1;
                activity2.startActivity(new Intent(activity2, (Class<?>) FontRepairSmaActivity.class));
            }
        }
    }

    @SourceDebugExtension({"SMAP\nDeviceInfoChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceInfoChecker.kt\ncom/sma/smartv3/biz/DeviceInfoChecker$toUIRepair$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,920:1\n11#2,2:921\n69#3,3:923\n72#3,5:927\n69#3,3:932\n72#3,5:936\n1#4:926\n1#4:935\n*S KotlinDebug\n*F\n+ 1 DeviceInfoChecker.kt\ncom/sma/smartv3/biz/DeviceInfoChecker$toUIRepair$1\n*L\n462#1:921,2\n464#1:923,3\n464#1:927,5\n465#1:932,3\n465#1:936,5\n464#1:926\n465#1:935\n*E\n"})
    public static final class XIi00iiXO implements O0Oiii<ExtraPackageData[]> {
        public final /* synthetic */ Activity OXO1;

        public XIi00iiXO(Activity activity) {
            this.OXO1 = activity;
        }

        /* JADX INFO: renamed from: iO */
        public static final Unit m38097iO(Activity activity, BleConnector it) {
            Intrinsics.X0O(it, "it");
            activity.startActivity(new Intent(activity, (Class<?>) UiRepairSmaActivity.class));
            return Unit.OXO1;
        }

        @Override // com.android.mltcode.paycertificationapi.O0Oiii
        /* JADX INFO: renamed from: XIi00iiXO, reason: merged with bridge method [inline-methods] */
        public void onSuccess(ExtraPackageData[] extraPackageDataArr) {
            if (extraPackageDataArr == null || extraPackageDataArr.length == 0) {
                ToastUtils.showLong(R.string.not_found_repair_version);
                return;
            }
            LogUtils.m11128d(extraPackageDataArr[0]);
            a01.OXO1.XO0O10().put(ExtraPackageData.class.getName(), new Gson().toJson(extraPackageDataArr[0]));
            int iXi1i0XOX0 = q62.OXO1.Xi1i0XOX0();
            if (iXi1i0XOX0 == 0) {
                Activity activity = this.OXO1;
                activity.startActivity(new Intent(activity, (Class<?>) UiRepairRActivity.class));
            } else if (iXi1i0XOX0 != 1) {
                ToastUtils.showLong(R.string.stay_tuned);
            } else {
                final Activity activity2 = this.OXO1;
                X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.X0XIOI
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return DeviceInfoChecker.XIi00iiXO.m38097iO(activity2, (BleConnector) obj);
                    }
                }, 1, null);
            }
        }

        @Override // com.android.mltcode.paycertificationapi.O0Oiii
        public void onFailure(String error) {
            Intrinsics.X0O(error, "error");
            ToastUtils.showLong(R.string.not_found_repair_version);
        }
    }

    public static /* synthetic */ void I0IIOi(DeviceInfoChecker deviceInfoChecker, O0Oiii o0Oiii, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = Api.f51338Y;
        }
        deviceInfoChecker.XOO0ii0(o0Oiii, str);
    }

    public static /* synthetic */ void I0iXXO(DeviceInfoChecker deviceInfoChecker, O0Oiii o0Oiii, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 2) != 0) {
            str = Api.f51338Y;
        }
        String str6 = str;
        String str7 = (i & 4) != 0 ? "" : str2;
        if ((i & 8) != 0) {
            str3 = "0";
        }
        deviceInfoChecker.OIX0iXi(o0Oiii, str6, str7, str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void IIX1OXO(DeviceInfoChecker deviceInfoChecker, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        deviceInfoChecker.I1XOi1(function1);
    }

    /* JADX INFO: renamed from: IO */
    public static /* synthetic */ void m38091IO(DeviceInfoChecker deviceInfoChecker, O0Oiii o0Oiii, Activity activity, View view, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            activity = null;
        }
        if ((i & 4) != 0) {
            view = null;
        }
        if ((i & 8) != 0) {
            str = Api.f51338Y;
        }
        deviceInfoChecker.OIi0(o0Oiii, activity, view, str);
    }

    public static /* synthetic */ void O00(DeviceInfoChecker deviceInfoChecker, Activity activity, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        deviceInfoChecker.XO0O10(activity, z);
    }

    public static /* synthetic */ void O10IXXX0X(DeviceInfoChecker deviceInfoChecker, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = BleCache.INSTANCE.getMBleName();
        }
        if ((i & 2) != 0) {
            str2 = BleCache.INSTANCE.getMFirmwareFlag();
        }
        deviceInfoChecker.X1ii(str, str2);
    }

    public static final Unit X01IiOiIi(boolean z) {
        if (z) {
            String strXiOIii1 = UtilsKt.XiOIii1(ExternalKeyManager.SPEECH_KEY);
            i1O0OXO1O.OXO1.OXO1("initMicrosoftSDK handle -> ");
            MicrosoftSDKManage.O1O.OXO1().iI0I(strXiOIii1);
        } else {
            i1O0OXO1O.OXO1.OXO1("initMicrosoftSDK error ->");
        }
        return Unit.OXO1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void XX0(DeviceInfoChecker deviceInfoChecker, String str, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        deviceInfoChecker.iIiiO(str, function1);
    }

    public static /* synthetic */ void XXIIO1i11(DeviceInfoChecker deviceInfoChecker, Activity activity, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = Api.f51338Y;
        }
        deviceInfoChecker.O1O(activity, str);
    }

    public static /* synthetic */ void XiOIii1(DeviceInfoChecker deviceInfoChecker, O0Oiii o0Oiii, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = Api.f51338Y;
        }
        deviceInfoChecker.OiIIX101O(o0Oiii, str);
    }

    public static /* synthetic */ void iOO1ii1(DeviceInfoChecker deviceInfoChecker, Activity activity, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = Api.f51338Y;
        }
        deviceInfoChecker.IXXOO(activity, str);
    }

    /* JADX INFO: renamed from: iX */
    public static /* synthetic */ void m38092iX(DeviceInfoChecker deviceInfoChecker, Activity activity, FirmwareVersion firmwareVersion, int i, Object obj) {
        if ((i & 2) != 0) {
            firmwareVersion = null;
        }
        deviceInfoChecker.i010I(activity, firmwareVersion);
    }

    public static /* synthetic */ void iX1O1(DeviceInfoChecker deviceInfoChecker, Activity activity, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = Api.f51338Y;
        }
        deviceInfoChecker.m38095iI(activity, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, java.lang.String] */
    /* JADX INFO: renamed from: I1 */
    public final void m38093I1() {
        T t;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Api api = Api.INSTANCE;
        if (Intrinsics.XOO0ii0(api.getBASE_URL(), iX1IIO10.XIi00iiXO) || Intrinsics.XOO0ii0(api.getBASE_URL(), iX1IIO10.OXO1)) {
            t = iX1IIO10.f8279iO;
        } else {
            t = Intrinsics.XOO0ii0(api.getBASE_URL(), e44.O00) ? iX1IIO10.O00 : iX1IIO10.XO0O10;
        }
        objectRef.element = t;
        BleCache bleCache = BleCache.INSTANCE;
        String mPlatform = bleCache.getMPlatform();
        String mPrototype = bleCache.getMPrototype();
        q62 q62Var = q62.OXO1;
        objectRef.element = t + "/watchFace/" + mPlatform + "/" + mPrototype + "/" + q62Var.XOO0XOOii();
        a01.OXO1.m1440iO().put(b01.OX110i, (String) objectRef.element);
        Object obj = objectRef.element;
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append("/info.txt");
        String string = sb.toString();
        i1O0OXO1O.OXO1.OXO1("watchFaceInfoUrl = " + string);
        NetWorkUtils.INSTANCE.get(string, new O1XIiIO<JSONObject>() { // from class: com.sma.smartv3.biz.DeviceInfoChecker$getWatchFaceInfo$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(JSONObject jSONObject) {
                OnlineWatchFace onlineWatchFace;
                Class<WatchFaceCategory[]> cls;
                int i;
                OnlineWatchFace onlineWatchFace2;
                int i2;
                int i3;
                DeviceInfoChecker$getWatchFaceInfo$1 deviceInfoChecker$getWatchFaceInfo$1 = this;
                LogUtils.m11128d(jSONObject);
                Class<WatchFaceCategory[]> cls2 = WatchFaceCategory[].class;
                int i4 = 0;
                try {
                    if (jSONObject == null) {
                        a01 a01Var = a01.OXO1;
                        a01Var.m1440iO().remove(b01.f5630OO);
                        a01Var.m1440iO().remove(b01.iOiXi11II + '_' + cls2.getName(), false);
                        return;
                    }
                    OnlineWatchFace onlineWatchFace3 = (OnlineWatchFace) new Gson().fromJson(jSONObject.toString(), OnlineWatchFace.class);
                    WatchFaceCategory[] categorys = onlineWatchFace3.getCategorys();
                    int i5 = 1;
                    if (categorys == null) {
                        LogUtils.m11128d("getWatchFace -> list=" + onlineWatchFace3.getTotal());
                        a01 a01Var2 = a01.OXO1;
                        a01Var2.m1440iO().put(b01.f5630OO, onlineWatchFace3.getTotal());
                        a01Var2.m1440iO().remove(b01.iOiXi11II + '_' + cls2.getName(), false);
                        ArrayList arrayList = new ArrayList();
                        int total = onlineWatchFace3.getTotal();
                        if (1 <= total) {
                            while (true) {
                                arrayList.add(new WatchFaceInfo(i5 + 100, ((Object) objectRef.element) + "/preview/" + i5 + ".png", ((Object) objectRef.element) + "/bin/" + i5 + ".bin"));
                                if (i5 == total) {
                                    break;
                                } else {
                                    i5++;
                                }
                            }
                        }
                        a01.OXO1.m1440iO().put(b01.X00XIX1 + '_' + WatchFaceInfo[].class.getName(), new Gson().toJson(arrayList.toArray(new WatchFaceInfo[0])), false);
                        onlineWatchFace = onlineWatchFace3;
                    } else {
                        LogUtils.m11128d("getWatchFace -> category");
                        a01.OXO1.m1440iO().remove(b01.f5630OO);
                        int length = categorys.length;
                        int i6 = 0;
                        while (i6 < length) {
                            WatchFaceCategory watchFaceCategory = categorys[i6];
                            ArrayList arrayList2 = new ArrayList();
                            int total2 = watchFaceCategory.getTotal();
                            if (i5 <= total2) {
                                int i7 = i5;
                                while (true) {
                                    int type = (watchFaceCategory.getType() * 10000) + i7;
                                    cls = cls2;
                                    String str = objectRef.element;
                                    i = length;
                                    onlineWatchFace2 = onlineWatchFace3;
                                    i2 = i6;
                                    String str2 = ((Object) str) + "/category/" + watchFaceCategory.getDir() + "/" + type + FileUtils.FILE_EXTENSION_SEPARATOR + (watchFaceCategory.getType() == 1 ? "gif" : "png");
                                    String str3 = objectRef.element;
                                    arrayList2.add(new WatchFaceInfo(type, str2, ((Object) str3) + "/category/" + watchFaceCategory.getDir() + "/" + type + FileUtils.FILE_EXTENSION_SEPARATOR + WatchFaceInfo.Companion.getWatchFaceExt()));
                                    if (i7 == total2) {
                                        break;
                                    }
                                    i7++;
                                    deviceInfoChecker$getWatchFaceInfo$1 = this;
                                    cls2 = cls;
                                    length = i;
                                    onlineWatchFace3 = onlineWatchFace2;
                                    i6 = i2;
                                }
                                i3 = 0;
                            } else {
                                cls = cls2;
                                i = length;
                                onlineWatchFace2 = onlineWatchFace3;
                                i2 = i6;
                                i3 = i4;
                            }
                            watchFaceCategory.setList((WatchFaceInfo[]) arrayList2.toArray(new WatchFaceInfo[i3]));
                            i6 = i2 + 1;
                            deviceInfoChecker$getWatchFaceInfo$1 = this;
                            cls2 = cls;
                            length = i;
                            onlineWatchFace3 = onlineWatchFace2;
                            i4 = 0;
                            i5 = 1;
                        }
                        onlineWatchFace = onlineWatchFace3;
                        a01.OXO1.m1440iO().put(b01.iOiXi11II + '_' + cls2.getName(), new Gson().toJson(categorys), false);
                    }
                    Date date = O0X11OiO.XO0O10().parse(onlineWatchFace.getTime());
                    Intrinsics.XXI(date);
                    long time = date.getTime();
                    a01 a01Var3 = a01.OXO1;
                    if (a01Var3.m1440iO().getLong(b01.XOX0O0, 0L) < time) {
                        LogUtils.m11128d("The watch face has been updated and is cleaning the cache...");
                        a01Var3.m1440iO().put(b01.XOX0O0, time);
                        com.blankj.utilcode.util.FileUtils.delete(uz0.I0iXXO(sz0.OXO1));
                        com.blankj.utilcode.util.FileUtils.delete(Utils.getApp().getCacheDir());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                LogUtils.m11128d("test " + error);
                a01 a01Var = a01.OXO1;
                a01Var.m1440iO().remove(b01.f5630OO);
                a01Var.m1440iO().remove(b01.iOiXi11II + '_' + WatchFaceCategory[].class.getName(), false);
                a01Var.m1440iO().remove(b01.X00XIX1 + '_' + WatchFaceInfo[].class.getName(), false);
            }
        }, q62Var.XXiO0i());
    }

    public final void I1XOi1(@tb1 final Function1<? super Boolean, Unit> function1) {
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        final Activity activity = null;
        HashMap deviceListObjectBody$default = RequestBodyKt.getDeviceListObjectBody$default(null, 1, null);
        final O1XIiIO<DeviceOnlineInfo[]> o1XIiIO = new O1XIiIO<DeviceOnlineInfo[]>() { // from class: com.sma.smartv3.biz.DeviceInfoChecker$getDeviceListObject$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(DeviceOnlineInfo[] deviceOnlineInfoArr) {
                LogUtils.m11128d("getDeviceListObject -> " + (deviceOnlineInfoArr != null ? ArraysKt___ArraysKt.OXI0X0(deviceOnlineInfoArr) : null));
                if (deviceOnlineInfoArr == null) {
                    Function1<Boolean, Unit> function2 = function1;
                    if (function2 != null) {
                        function2.invoke2(Boolean.FALSE);
                        return;
                    }
                    return;
                }
                a01.OXO1.IiI10X().put(b01.iii0, new Gson().toJson(ArraysKt___ArraysKt.OXI0X0(deviceOnlineInfoArr)));
                Function1<Boolean, Unit> function3 = function1;
                if (function3 != null) {
                    function3.invoke2(Boolean.TRUE);
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                LogUtils.m11128d("getDeviceListObject -> error = " + error);
                Function1<Boolean, Unit> function2 = function1;
                if (function2 != null) {
                    function2.invoke2(Boolean.FALSE);
                }
            }
        };
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetDeviceListObject.URL);
        netWorkUtils.printParam(strConvertBaseUrl + GetDeviceListObject.URL, deviceListObjectBody$default);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + GetDeviceListObject.URL;
        final O1XIiIO<Response<DeviceOnlineInfo[]>> o1XIiIO2 = new O1XIiIO<Response<DeviceOnlineInfo[]>>() { // from class: com.sma.smartv3.biz.DeviceInfoChecker$getDeviceListObject$$inlined$post$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<DeviceOnlineInfo[]> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity2 = activity;
                O1XIiIO o1XIiIO3 = o1XIiIO;
                C3006uq c3006uq = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO3);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
            }
        };
        AndroidNetworking.post(str).addBodyParameter((Map<String, String>) deviceListObjectBody$default).setTag((Object) str).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, DeviceOnlineInfo[].class), new ParsedRequestListener<Response<DeviceOnlineInfo[]>>() { // from class: com.sma.smartv3.biz.DeviceInfoChecker$getDeviceListObject$$inlined$post$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<DeviceOnlineInfo[]> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                Response response;
                StringBuilder sb = new StringBuilder();
                sb.append("errorCode:");
                Integer numValueOf = null;
                sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                sb.append(", errorBody:");
                sb.append(aNError != null ? aNError.getErrorBody() : null);
                sb.append(", ");
                sb.append(aNError != null ? aNError.getErrorDetail() : null);
                LogUtils.m11128d(sb.toString());
                if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                    numValueOf = Integer.valueOf(response.getCode());
                } else if (aNError != null) {
                    numValueOf = Integer.valueOf(aNError.getErrorCode());
                }
                o1XIiIO2.handleError(String.valueOf(numValueOf));
            }
        });
    }

    public final boolean II1Xi0() {
        a01 a01Var = a01.OXO1;
        if (Duration.between(Instant.ofEpochMilli(a01Var.m1440iO().getLong(b01.ii00OXXO, 0L)), Instant.now()).toDays() < 1) {
            return false;
        }
        a01Var.m1440iO().put(b01.ii00OXXO, System.currentTimeMillis());
        return true;
    }

    public final void IXXOO(@aa1 Activity activity, @aa1 String valid) {
        Intrinsics.X0O(activity, "activity");
        Intrinsics.X0O(valid, "valid");
        OII(new OXO1(activity), valid);
    }

    public final void IiI10X(@aa1 final Activity activity) {
        Intrinsics.X0O(activity, "activity");
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> checkExtraPackVersionBody = RequestBodyKt.getCheckExtraPackVersionBody();
        final O1XIiIO<ExtraPackVersions> o1XIiIO = new O1XIiIO<ExtraPackVersions>() { // from class: com.sma.smartv3.biz.DeviceInfoChecker$checkExtraPackVersion$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(ExtraPackVersions extraPackVersions) {
                i1O0OXO1O.OXO1.OXO1("checkExtraPackVersion handleResponse: " + extraPackVersions);
                a01 a01Var = a01.OXO1;
                a01Var.XIi00iiXO().put(ExtraPackVersions.class.getName(), new Gson().toJson(extraPackVersions));
                FirmwareVersion firmwareVersion = (FirmwareVersion) new Gson().fromJson(a01Var.XIi00iiXO().getString(FirmwareVersion.class.getName()), FirmwareVersion.class);
                if (firmwareVersion == null) {
                    if ((extraPackVersions != null ? extraPackVersions.getUiPackVersion() : null) == null) {
                        if ((extraPackVersions != null ? extraPackVersions.getLanguagePackVersion() : null) == null) {
                            if ((extraPackVersions != null ? extraPackVersions.getFontPackVersion() : null) == null) {
                                if ((extraPackVersions != null ? extraPackVersions.getGpsFirmwareVersion() : null) == null) {
                                    if ((extraPackVersions != null ? extraPackVersions.getNetworkFirmwareVersion() : null) == null) {
                                        ToastUtils.showLong(R.string.already_the_latest_version);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
                DeviceInfoChecker.OXO1.i010I(activity, firmwareVersion);
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                i1O0OXO1O.OXO1.OXO1("checkExtraPackVersion handleError: " + error);
                a01.OXO1.XIi00iiXO().remove(ExtraPackVersions.class.getName());
                ToastUtils.showLong(R.string.already_the_latest_version);
            }
        };
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(activity, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), ExtraPackVersionLatest.URL);
        netWorkUtils.printParam(strConvertBaseUrl + ExtraPackVersionLatest.URL, checkExtraPackVersionBody);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + ExtraPackVersionLatest.URL;
        final O1XIiIO<Response<ExtraPackVersions>> o1XIiIO2 = new O1XIiIO<Response<ExtraPackVersions>>() { // from class: com.sma.smartv3.biz.DeviceInfoChecker$checkExtraPackVersion$$inlined$post$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<ExtraPackVersions> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity2 = activity;
                O1XIiIO o1XIiIO3 = o1XIiIO;
                C3006uq c3006uq = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO3);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
            }
        };
        AndroidNetworking.post(str).addBodyParameter((Map<String, String>) checkExtraPackVersionBody).setTag((Object) str).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, ExtraPackVersions.class), new ParsedRequestListener<Response<ExtraPackVersions>>() { // from class: com.sma.smartv3.biz.DeviceInfoChecker$checkExtraPackVersion$$inlined$post$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<ExtraPackVersions> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                Response response;
                StringBuilder sb = new StringBuilder();
                sb.append("errorCode:");
                Integer numValueOf = null;
                sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                sb.append(", errorBody:");
                sb.append(aNError != null ? aNError.getErrorBody() : null);
                sb.append(", ");
                sb.append(aNError != null ? aNError.getErrorDetail() : null);
                LogUtils.m11128d(sb.toString());
                if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                    numValueOf = Integer.valueOf(response.getCode());
                } else if (aNError != null) {
                    numValueOf = Integer.valueOf(aNError.getErrorCode());
                }
                o1XIiIO2.handleError(String.valueOf(numValueOf));
            }
        });
    }

    public final void O1O(@aa1 final Activity activity, @aa1 String valid) {
        Intrinsics.X0O(activity, "activity");
        Intrinsics.X0O(valid, "valid");
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> extraPackVersionGPSFirmwareBody = RequestBodyKt.getExtraPackVersionGPSFirmwareBody("0", valid);
        final O1XIiIO<ExtraPackageData[]> o1XIiIO = new O1XIiIO<ExtraPackageData[]>() { // from class: com.sma.smartv3.biz.DeviceInfoChecker$toGPSFirmwareRepair$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(ExtraPackageData[] extraPackageDataArr) {
                if (extraPackageDataArr != null) {
                    if (!(extraPackageDataArr.length == 0)) {
                        SPUtils sPUtilsXIi00iiXO = a01.OXO1.XIi00iiXO();
                        ExtraPackVersions extraPackVersions = new ExtraPackVersions(null, null, null, null, null, null, null, 127, null);
                        extraPackVersions.setGpsFirmwareVersion(new FirmwareVersion(extraPackageDataArr[0].getFileName(), extraPackageDataArr[0].getFileSize(), extraPackageDataArr[0].getFileUrl(), extraPackageDataArr[0].getVersion(), extraPackageDataArr[0].getInfo(), extraPackageDataArr[0].getFileSize(), null, null, null, null, gj0.OIi0, null));
                        sPUtilsXIi00iiXO.put(ExtraPackVersions.class.getName(), new Gson().toJson(extraPackVersions));
                        Activity activity2 = activity;
                        activity2.startActivity(new Intent(activity2, (Class<?>) GPSFirmwareRepairSmaActivity.class));
                        return;
                    }
                }
                ToastUtils.showLong(R.string.not_found_repair_version);
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                ToastUtils.showLong(R.string.not_found_repair_version);
            }
        };
        final Activity activity2 = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), BleExtraPackVersionGPSFirmware.URL);
        netWorkUtils.printParam(strConvertBaseUrl + BleExtraPackVersionGPSFirmware.URL, extraPackVersionGPSFirmwareBody);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + BleExtraPackVersionGPSFirmware.URL;
        final O1XIiIO<Response<ExtraPackageData[]>> o1XIiIO2 = new O1XIiIO<Response<ExtraPackageData[]>>() { // from class: com.sma.smartv3.biz.DeviceInfoChecker$toGPSFirmwareRepair$$inlined$post$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<ExtraPackageData[]> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity3 = activity2;
                O1XIiIO o1XIiIO3 = o1XIiIO;
                C3006uq c3006uq = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity3, response, o1XIiIO3);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
            }
        };
        AndroidNetworking.post(str).addBodyParameter((Map<String, String>) extraPackVersionGPSFirmwareBody).setTag((Object) str).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, ExtraPackageData[].class), new ParsedRequestListener<Response<ExtraPackageData[]>>() { // from class: com.sma.smartv3.biz.DeviceInfoChecker$toGPSFirmwareRepair$$inlined$post$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<ExtraPackageData[]> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                Response response;
                StringBuilder sb = new StringBuilder();
                sb.append("errorCode:");
                Integer numValueOf = null;
                sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                sb.append(", errorBody:");
                sb.append(aNError != null ? aNError.getErrorBody() : null);
                sb.append(", ");
                sb.append(aNError != null ? aNError.getErrorDetail() : null);
                LogUtils.m11128d(sb.toString());
                if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                    numValueOf = Integer.valueOf(response.getCode());
                } else if (aNError != null) {
                    numValueOf = Integer.valueOf(aNError.getErrorCode());
                }
                o1XIiIO2.handleError(String.valueOf(numValueOf));
            }
        });
    }

    public final void OII(@aa1 final O0Oiii<ExtraPackageData[]> callback, @aa1 String valid) {
        Intrinsics.X0O(callback, "callback");
        Intrinsics.X0O(valid, "valid");
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> extraPackVersionFontBody = RequestBodyKt.getExtraPackVersionFontBody(valid);
        final O1XIiIO<ExtraPackageData[]> o1XIiIO = new O1XIiIO<ExtraPackageData[]>() { // from class: com.sma.smartv3.biz.DeviceInfoChecker$getLatestFont$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(ExtraPackageData[] extraPackageDataArr) {
                callback.onSuccess(extraPackageDataArr);
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                callback.onFailure(error);
            }
        };
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), BleExtraPackVersionFont.URL);
        netWorkUtils.printParam(strConvertBaseUrl + BleExtraPackVersionFont.URL, extraPackVersionFontBody);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + BleExtraPackVersionFont.URL;
        final O1XIiIO<Response<ExtraPackageData[]>> o1XIiIO2 = new O1XIiIO<Response<ExtraPackageData[]>>() { // from class: com.sma.smartv3.biz.DeviceInfoChecker$getLatestFont$$inlined$post$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<ExtraPackageData[]> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity2 = activity;
                O1XIiIO o1XIiIO3 = o1XIiIO;
                C3006uq c3006uq = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO3);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
            }
        };
        AndroidNetworking.post(str).addBodyParameter((Map<String, String>) extraPackVersionFontBody).setTag((Object) str).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, ExtraPackageData[].class), new ParsedRequestListener<Response<ExtraPackageData[]>>() { // from class: com.sma.smartv3.biz.DeviceInfoChecker$getLatestFont$$inlined$post$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<ExtraPackageData[]> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                Response response;
                StringBuilder sb = new StringBuilder();
                sb.append("errorCode:");
                Integer numValueOf = null;
                sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                sb.append(", errorBody:");
                sb.append(aNError != null ? aNError.getErrorBody() : null);
                sb.append(", ");
                sb.append(aNError != null ? aNError.getErrorDetail() : null);
                LogUtils.m11128d(sb.toString());
                if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                    numValueOf = Integer.valueOf(response.getCode());
                } else if (aNError != null) {
                    numValueOf = Integer.valueOf(aNError.getErrorCode());
                }
                o1XIiIO2.handleError(String.valueOf(numValueOf));
            }
        });
    }

    public final void OIX0iXi(@aa1 final O0Oiii<FirmwareVersion> callback, @aa1 String valid, @aa1 String bleName, @aa1 String flag, @aa1 String curVersion, @aa1 String mac) {
        Intrinsics.X0O(callback, "callback");
        Intrinsics.X0O(valid, "valid");
        Intrinsics.X0O(bleName, "bleName");
        Intrinsics.X0O(flag, "flag");
        Intrinsics.X0O(curVersion, "curVersion");
        Intrinsics.X0O(mac, "mac");
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> checkNoteFirmwareVersionBody = RequestBodyKt.getCheckNoteFirmwareVersionBody(null, valid, bleName, flag, curVersion, mac);
        final O1XIiIO<FirmwareVersion> o1XIiIO = new O1XIiIO<FirmwareVersion>() { // from class: com.sma.smartv3.biz.DeviceInfoChecker$checkNoteFirmwareVersion$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(FirmwareVersion firmwareVersion) {
                i1O0OXO1O.OXO1.OXO1("checkFirmwareVersion handleResponse: " + firmwareVersion);
                a01.OXO1.XIi00iiXO().put(FirmwareVersion.class.getName(), new Gson().toJson(firmwareVersion));
                callback.onSuccess(firmwareVersion);
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                i1O0OXO1O.OXO1.OXO1("checkFirmwareVersion handleError: " + error);
                a01.OXO1.XIi00iiXO().remove(FirmwareVersion.class.getName());
                callback.onFailure(error);
            }
        };
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), FirmwareVersionLatest.URL);
        netWorkUtils.printParam(strConvertBaseUrl + FirmwareVersionLatest.URL, checkNoteFirmwareVersionBody);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + FirmwareVersionLatest.URL;
        final O1XIiIO<Response<FirmwareVersion>> o1XIiIO2 = new O1XIiIO<Response<FirmwareVersion>>() { // from class: com.sma.smartv3.biz.DeviceInfoChecker$checkNoteFirmwareVersion$$inlined$post$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<FirmwareVersion> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity2 = activity;
                O1XIiIO o1XIiIO3 = o1XIiIO;
                C3006uq c3006uq = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO3);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
            }
        };
        AndroidNetworking.post(str).addBodyParameter((Map<String, String>) checkNoteFirmwareVersionBody).setTag((Object) str).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, FirmwareVersion.class), new ParsedRequestListener<Response<FirmwareVersion>>() { // from class: com.sma.smartv3.biz.DeviceInfoChecker$checkNoteFirmwareVersion$$inlined$post$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<FirmwareVersion> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                Response response;
                StringBuilder sb = new StringBuilder();
                sb.append("errorCode:");
                Integer numValueOf = null;
                sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                sb.append(", errorBody:");
                sb.append(aNError != null ? aNError.getErrorBody() : null);
                sb.append(", ");
                sb.append(aNError != null ? aNError.getErrorDetail() : null);
                LogUtils.m11128d(sb.toString());
                if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                    numValueOf = Integer.valueOf(response.getCode());
                } else if (aNError != null) {
                    numValueOf = Integer.valueOf(aNError.getErrorCode());
                }
                o1XIiIO2.handleError(String.valueOf(numValueOf));
            }
        });
    }

    public final void OIi0(@aa1 final O0Oiii<ExtraPackageData> callback, @tb1 final Activity activity, @tb1 View view, @aa1 String valid) {
        Intrinsics.X0O(callback, "callback");
        Intrinsics.X0O(valid, "valid");
        i1O0OXO1O.OXO1.OXO1("checkGPSFirmwareVersion");
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> extraPackVersionGPSFirmwareBody = RequestBodyKt.getExtraPackVersionGPSFirmwareBody(null, valid);
        final O1XIiIO<ExtraPackageData[]> o1XIiIO = new O1XIiIO<ExtraPackageData[]>() { // from class: com.sma.smartv3.biz.DeviceInfoChecker$checkGPSFirmwareVersion$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(ExtraPackageData[] extraPackageDataArr) {
                if (extraPackageDataArr != null) {
                    if (!(extraPackageDataArr.length == 0)) {
                        if (Intrinsics.XOO0ii0(extraPackageDataArr[0].getVersion(), BaseBleCache.getString$default(BleCache.INSTANCE, BleKey.GPS_FIRMWARE_VERSION, "0.0.0", null, 4, null))) {
                            i1O0OXO1O.OXO1.OXO1("checkGPSFirmwareVersion -> same version");
                            callback.onFailure("null");
                            return;
                        }
                        i1O0OXO1O.OXO1.OXO1("checkGPSFirmwareVersion -> new version: " + extraPackageDataArr);
                        SPUtils sPUtilsXIi00iiXO = a01.OXO1.XIi00iiXO();
                        ExtraPackVersions extraPackVersions = new ExtraPackVersions(null, null, null, null, null, null, null, 127, null);
                        O0Oiii<ExtraPackageData> o0Oiii = callback;
                        extraPackVersions.setGpsFirmwareVersion(new FirmwareVersion(extraPackageDataArr[0].getFileName(), extraPackageDataArr[0].getFileSize(), extraPackageDataArr[0].getFileUrl(), extraPackageDataArr[0].getVersion(), extraPackageDataArr[0].getInfo(), extraPackageDataArr[0].getFileSize(), null, null, null, null, gj0.OIi0, null));
                        o0Oiii.onSuccess(extraPackageDataArr[0]);
                        sPUtilsXIi00iiXO.put(ExtraPackVersions.class.getName(), new Gson().toJson(extraPackVersions));
                        return;
                    }
                }
                callback.onFailure("null");
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                callback.onFailure(error);
            }
        };
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(activity, view);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), BleExtraPackVersionGPSFirmware.URL);
        netWorkUtils.printParam(strConvertBaseUrl + BleExtraPackVersionGPSFirmware.URL, extraPackVersionGPSFirmwareBody);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + BleExtraPackVersionGPSFirmware.URL;
        final O1XIiIO<Response<ExtraPackageData[]>> o1XIiIO2 = new O1XIiIO<Response<ExtraPackageData[]>>() { // from class: com.sma.smartv3.biz.DeviceInfoChecker$checkGPSFirmwareVersion$$inlined$post$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<ExtraPackageData[]> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity2 = activity;
                O1XIiIO o1XIiIO3 = o1XIiIO;
                C3006uq c3006uq = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO3);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
            }
        };
        AndroidNetworking.post(str).addBodyParameter((Map<String, String>) extraPackVersionGPSFirmwareBody).setTag((Object) str).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, ExtraPackageData[].class), new ParsedRequestListener<Response<ExtraPackageData[]>>() { // from class: com.sma.smartv3.biz.DeviceInfoChecker$checkGPSFirmwareVersion$$inlined$post$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<ExtraPackageData[]> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                Response response;
                StringBuilder sb = new StringBuilder();
                sb.append("errorCode:");
                Integer numValueOf = null;
                sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                sb.append(", errorBody:");
                sb.append(aNError != null ? aNError.getErrorBody() : null);
                sb.append(", ");
                sb.append(aNError != null ? aNError.getErrorDetail() : null);
                LogUtils.m11128d(sb.toString());
                if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                    numValueOf = Integer.valueOf(response.getCode());
                } else if (aNError != null) {
                    numValueOf = Integer.valueOf(aNError.getErrorCode());
                }
                o1XIiIO2.handleError(String.valueOf(numValueOf));
            }
        });
    }

    /* JADX INFO: renamed from: OX */
    public final void m38094OX(@aa1 final O0Oiii<ExtraPackageData[]> callback, @aa1 String valid) {
        Intrinsics.X0O(callback, "callback");
        Intrinsics.X0O(valid, "valid");
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> extraPackVersionUIBody = RequestBodyKt.getExtraPackVersionUIBody(valid);
        final O1XIiIO<ExtraPackageData[]> o1XIiIO = new O1XIiIO<ExtraPackageData[]>() { // from class: com.sma.smartv3.biz.DeviceInfoChecker$getLatestUi$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(ExtraPackageData[] extraPackageDataArr) {
                callback.onSuccess(extraPackageDataArr);
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                callback.onFailure(error);
            }
        };
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), BleExtraPackVersionUi.URL);
        netWorkUtils.printParam(strConvertBaseUrl + BleExtraPackVersionUi.URL, extraPackVersionUIBody);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + BleExtraPackVersionUi.URL;
        final O1XIiIO<Response<ExtraPackageData[]>> o1XIiIO2 = new O1XIiIO<Response<ExtraPackageData[]>>() { // from class: com.sma.smartv3.biz.DeviceInfoChecker$getLatestUi$$inlined$post$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<ExtraPackageData[]> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity2 = activity;
                O1XIiIO o1XIiIO3 = o1XIiIO;
                C3006uq c3006uq = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO3);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
            }
        };
        AndroidNetworking.post(str).addBodyParameter((Map<String, String>) extraPackVersionUIBody).setTag((Object) str).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, ExtraPackageData[].class), new ParsedRequestListener<Response<ExtraPackageData[]>>() { // from class: com.sma.smartv3.biz.DeviceInfoChecker$getLatestUi$$inlined$post$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<ExtraPackageData[]> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                Response response;
                StringBuilder sb = new StringBuilder();
                sb.append("errorCode:");
                Integer numValueOf = null;
                sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                sb.append(", errorBody:");
                sb.append(aNError != null ? aNError.getErrorBody() : null);
                sb.append(", ");
                sb.append(aNError != null ? aNError.getErrorDetail() : null);
                LogUtils.m11128d(sb.toString());
                if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                    numValueOf = Integer.valueOf(response.getCode());
                } else if (aNError != null) {
                    numValueOf = Integer.valueOf(aNError.getErrorCode());
                }
                o1XIiIO2.handleError(String.valueOf(numValueOf));
            }
        });
    }

    public final void OiIIX101O(@aa1 final O0Oiii<ExtraPackageData[]> callback, @aa1 String valid) {
        Intrinsics.X0O(callback, "callback");
        Intrinsics.X0O(valid, "valid");
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> extraPackVersionLanguageBody = RequestBodyKt.getExtraPackVersionLanguageBody(valid);
        final O1XIiIO<ExtraPackageData[]> o1XIiIO = new O1XIiIO<ExtraPackageData[]>() { // from class: com.sma.smartv3.biz.DeviceInfoChecker$getLanguageList$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(ExtraPackageData[] extraPackageDataArr) {
                callback.onSuccess(extraPackageDataArr);
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                callback.onFailure(error);
            }
        };
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), BleExtraPackVersionLanguage.URL);
        netWorkUtils.printParam(strConvertBaseUrl + BleExtraPackVersionLanguage.URL, extraPackVersionLanguageBody);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + BleExtraPackVersionLanguage.URL;
        final O1XIiIO<Response<ExtraPackageData[]>> o1XIiIO2 = new O1XIiIO<Response<ExtraPackageData[]>>() { // from class: com.sma.smartv3.biz.DeviceInfoChecker$getLanguageList$$inlined$post$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<ExtraPackageData[]> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity2 = activity;
                O1XIiIO o1XIiIO3 = o1XIiIO;
                C3006uq c3006uq = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO3);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
            }
        };
        AndroidNetworking.post(str).addBodyParameter((Map<String, String>) extraPackVersionLanguageBody).setTag((Object) str).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, ExtraPackageData[].class), new ParsedRequestListener<Response<ExtraPackageData[]>>() { // from class: com.sma.smartv3.biz.DeviceInfoChecker$getLanguageList$$inlined$post$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<ExtraPackageData[]> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                Response response;
                StringBuilder sb = new StringBuilder();
                sb.append("errorCode:");
                Integer numValueOf = null;
                sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                sb.append(", errorBody:");
                sb.append(aNError != null ? aNError.getErrorBody() : null);
                sb.append(", ");
                sb.append(aNError != null ? aNError.getErrorDetail() : null);
                LogUtils.m11128d(sb.toString());
                if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                    numValueOf = Integer.valueOf(response.getCode());
                } else if (aNError != null) {
                    numValueOf = Integer.valueOf(aNError.getErrorCode());
                }
                o1XIiIO2.handleError(String.valueOf(numValueOf));
            }
        });
    }

    public final void X0O() {
        BleCache bleCache = BleCache.INSTANCE;
        if (bleCache.getMBleAddress().length() == 0) {
            i1O0OXO1O.OXO1.OXO1("getSparkAuthorize spark/exist BleCache.mBleAddress.isEmpty() return false");
            AISparkChainManager.OXO1.X00XIX1(false);
            return;
        }
        a01 a01Var = a01.OXO1;
        if (Intrinsics.XOO0ii0(a01Var.XIi00iiXO().getString(b01.i0X1iIO + oe5.IXO0OOi(bleCache.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null), ""), oe5.IXO0OOi(bleCache.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null))) {
            i1O0OXO1O.OXO1.OXO1("getSparkAuthorize spark/exist mBleAddress = " + a01Var.XIi00iiXO().getString(b01.i0X1iIO + oe5.IXO0OOi(bleCache.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null), "") + " return true");
            AISparkChainManager.OXO1.X00XIX1(true);
            return;
        }
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> sparkAuthorizeBody = RequestBodyKt.getSparkAuthorizeBody();
        final O1XIiIO<Boolean> o1XIiIO = new O1XIiIO<Boolean>() { // from class: com.sma.smartv3.biz.DeviceInfoChecker$getDeviceIsSparkAuthorize$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Boolean bool) {
                i1O0OXO1O.OXO1.OXO1("getSparkAuthorize result -> " + bool);
                if (bool == null || !bool.booleanValue()) {
                    a01.OXO1.XIi00iiXO().put(b01.i0X1iIO + oe5.IXO0OOi(BleCache.INSTANCE.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null), "");
                    AISparkChainManager.OXO1.X00XIX1(false);
                    return;
                }
                SPUtils sPUtilsXIi00iiXO = a01.OXO1.XIi00iiXO();
                BleCache bleCache2 = BleCache.INSTANCE;
                sPUtilsXIi00iiXO.put(b01.i0X1iIO + oe5.IXO0OOi(bleCache2.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null), oe5.IXO0OOi(bleCache2.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null));
                AISparkChainManager.OXO1.X00XIX1(bool.booleanValue());
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                a01.OXO1.XIi00iiXO().put(b01.i0X1iIO + oe5.IXO0OOi(BleCache.INSTANCE.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null), "");
                i1O0OXO1O.OXO1.OXO1("getSparkAuthorize error -> " + error);
                AISparkChainManager.OXO1.X00XIX1(false);
            }
        };
        Map<String, String> headersMap = netWorkUtils.getHeadersMap();
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetSparkAuthorize.URL);
        String str = strConvertBaseUrl + GetSparkAuthorize.URL;
        Map<String, ? extends Object> mapX111IO = kotlin.collections.OXO1.X111IO(sparkAuthorizeBody);
        mapX111IO.putAll(headersMap);
        Unit unit = Unit.OXO1;
        netWorkUtils.printParam(str, mapX111IO);
        NetWork netWork = NetWork.OXO1;
        String str2 = strConvertBaseUrl + GetSparkAuthorize.URL;
        final O1XIiIO<Response<Boolean>> o1XIiIO2 = new O1XIiIO<Response<Boolean>>() { // from class: com.sma.smartv3.biz.DeviceInfoChecker$getDeviceIsSparkAuthorize$$inlined$postV2$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<Boolean> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity2 = activity;
                O1XIiIO o1XIiIO3 = o1XIiIO;
                C3006uq c3006uq = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO3);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
            }
        };
        AndroidNetworking.post(str2).addHeaders(headersMap).addBodyParameter((Map<String, String>) sparkAuthorizeBody).setTag((Object) str2).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, Boolean.class), new ParsedRequestListener<Response<Boolean>>() { // from class: com.sma.smartv3.biz.DeviceInfoChecker$getDeviceIsSparkAuthorize$$inlined$postV2$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<Boolean> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                Response response;
                if (aNError != null) {
                    aNError.printStackTrace();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("errorCode:");
                Integer numValueOf = null;
                sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                sb.append(", errorBody:");
                sb.append(aNError != null ? aNError.getErrorBody() : null);
                sb.append(", errorDetail:");
                sb.append(aNError != null ? aNError.getErrorDetail() : null);
                sb.append(", exception:");
                sb.append(aNError != null ? aNError.getLocalizedMessage() : null);
                LogUtils.m11128d(sb.toString());
                if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                    numValueOf = Integer.valueOf(response.getCode());
                } else if (aNError != null) {
                    numValueOf = Integer.valueOf(aNError.getErrorCode());
                }
                o1XIiIO2.handleError(String.valueOf(numValueOf));
            }
        });
    }

    public final void X1ii(@aa1 final String bleName, @aa1 final String firmwareFlag) {
        Intrinsics.X0O(bleName, "bleName");
        Intrinsics.X0O(firmwareFlag, "firmwareFlag");
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        final Activity activity = null;
        HashMap deviceInfoBody$default = RequestBodyKt.getDeviceInfoBody$default(null, bleName, firmwareFlag, 1, null);
        final O1XIiIO<DeviceConfigInfo> o1XIiIO = new O1XIiIO<DeviceConfigInfo>() { // from class: com.sma.smartv3.biz.DeviceInfoChecker$getDeviceInfo$1

            public static final class OXO1 extends SimpleTarget<Bitmap> {

                /* JADX INFO: renamed from: I1 */
                public final /* synthetic */ String f50867I1;

                /* JADX INFO: renamed from: IO */
                public final /* synthetic */ String f50868IO;

                public OXO1(String str, String str2) {
                    this.f50868IO = str;
                    this.f50867I1 = str2;
                }

                @Override // com.bumptech.glide.request.target.Target
                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                public void onResourceReady(Bitmap resource, Transition<? super Bitmap> transition) {
                    Intrinsics.X0O(resource, "resource");
                    ImageUtils.save(resource, uz0.Ii0i(sz0.OXO1, this.f50868IO, this.f50867I1), Bitmap.CompressFormat.PNG);
                    I01XX0.XIi00iiXO(I01XX0.X1IX, null, 2, null);
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(DeviceConfigInfo deviceConfigInfo) {
                i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
                i1o0oxo1o.OXO1("getDeviceInfo -> " + deviceConfigInfo);
                if (deviceConfigInfo != null) {
                    a01 a01Var = a01.OXO1;
                    a01Var.XIi00iiXO().put(DeviceConfigInfo.class.getName(), new Gson().toJson(deviceConfigInfo));
                    q62 q62Var = q62.OXO1;
                    if (q62Var.i0101i()) {
                        DeviceInfoChecker.OXO1.X0O();
                    }
                    if (q62Var.ii00OXXO()) {
                        AISparkChainManager.OXO1.X00XIX1(true);
                    }
                    if (q62Var.X11I()) {
                        DeviceInfoChecker.OXO1.iOOX010X();
                    }
                    i1o0oxo1o.OXO1("getDeviceInfo -> download image from net, " + deviceConfigInfo.getDeviceImage());
                    RequestBuilder requestBuilderSkipMemoryCache = Glide.with(Utils.getApp()).asBitmap().skipMemoryCache(true);
                    DiskCacheStrategy diskCacheStrategy = DiskCacheStrategy.NONE;
                    RequestBuilder requestBuilderLoad = requestBuilderSkipMemoryCache.diskCacheStrategy(diskCacheStrategy).load(deviceConfigInfo.getDeviceImage());
                    final String str = bleName;
                    final String str2 = firmwareFlag;
                    requestBuilderLoad.into(new SimpleTarget<Bitmap>() { // from class: com.sma.smartv3.biz.DeviceInfoChecker$getDeviceInfo$1$handleResponse$1
                        @Override // com.bumptech.glide.request.target.Target
                        /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                        public void onResourceReady(Bitmap resource, Transition<? super Bitmap> transition) {
                            Intrinsics.X0O(resource, "resource");
                            XX01Oi.IiI10X(I0IIOi.OXO1(IXOX0Xiii.m712iO()), null, null, new C15438x57bc11a5(resource, str, str2, null), 3, null);
                        }
                    });
                    if (deviceConfigInfo.getDeviceImage2().length() > 0) {
                        Glide.with(Utils.getApp()).asBitmap().skipMemoryCache(true).diskCacheStrategy(diskCacheStrategy).load(deviceConfigInfo.getDeviceImage2()).into(new OXO1(bleName, firmwareFlag));
                    }
                    if (q62Var.i1iII1i1()) {
                        OOiOOO1OI.OXO1.IXXOO();
                    }
                    a01Var.m1440iO().remove(b01.OXii10I + '_' + LanguageTranslationData.class.getName(), false);
                    a01Var.m1440iO().remove(b01.I011X + '_' + LanguageTranslationData.class.getName(), false);
                }
                I01XX0.OXO1(I01XX0.iXiX011, Boolean.FALSE);
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                i1O0OXO1O.OXO1.OXO1("getDeviceInfo -> error = " + error);
                I01XX0.OXO1(I01XX0.iXiX011, Boolean.FALSE);
            }
        };
        Map<String, String> headersMap = netWorkUtils.getHeadersMap();
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetDeviceInfo.URL);
        String str = strConvertBaseUrl + GetDeviceInfo.URL;
        Map<String, ? extends Object> mapX111IO = kotlin.collections.OXO1.X111IO(deviceInfoBody$default);
        mapX111IO.putAll(headersMap);
        Unit unit = Unit.OXO1;
        netWorkUtils.printParam(str, mapX111IO);
        NetWork netWork = NetWork.OXO1;
        String str2 = strConvertBaseUrl + GetDeviceInfo.URL;
        final O1XIiIO<Response<DeviceConfigInfo>> o1XIiIO2 = new O1XIiIO<Response<DeviceConfigInfo>>() { // from class: com.sma.smartv3.biz.DeviceInfoChecker$getDeviceInfo$$inlined$postV2$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<DeviceConfigInfo> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity2 = activity;
                O1XIiIO o1XIiIO3 = o1XIiIO;
                C3006uq c3006uq = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO3);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
            }
        };
        AndroidNetworking.post(str2).addHeaders(headersMap).addBodyParameter((Map<String, String>) deviceInfoBody$default).setTag((Object) str2).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, DeviceConfigInfo.class), new ParsedRequestListener<Response<DeviceConfigInfo>>() { // from class: com.sma.smartv3.biz.DeviceInfoChecker$getDeviceInfo$$inlined$postV2$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<DeviceConfigInfo> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                Response response;
                if (aNError != null) {
                    aNError.printStackTrace();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("errorCode:");
                Integer numValueOf = null;
                sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                sb.append(", errorBody:");
                sb.append(aNError != null ? aNError.getErrorBody() : null);
                sb.append(", errorDetail:");
                sb.append(aNError != null ? aNError.getErrorDetail() : null);
                sb.append(", exception:");
                sb.append(aNError != null ? aNError.getLocalizedMessage() : null);
                LogUtils.m11128d(sb.toString());
                if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                    numValueOf = Integer.valueOf(response.getCode());
                } else if (aNError != null) {
                    numValueOf = Integer.valueOf(aNError.getErrorCode());
                }
                o1XIiIO2.handleError(String.valueOf(numValueOf));
            }
        });
    }

    public final void XIi00iiXO(@aa1 final Function1<? super String, Unit> action) {
        Intrinsics.X0O(action, "action");
        if (i72.OXO1.O10IXXX0X() && BleConnector.INSTANCE.isBound()) {
            NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
            HashMap<String, String> checkAppFirmwareBody = RequestBodyKt.getCheckAppFirmwareBody();
            final O1XIiIO<String> o1XIiIO = new O1XIiIO<String>() { // from class: com.sma.smartv3.biz.DeviceInfoChecker$checkApp$1
                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                public void handleResponse(String str) {
                }

                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                public void handleError(String error) {
                    Intrinsics.X0O(error, "error");
                    if (StringsKt__StringsKt.OO1101010(error, "code", 0, false, 6, null) != -1 || error.length() <= 5) {
                        return;
                    }
                    action.invoke2(error);
                }
            };
            final Activity activity = null;
            final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
            String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), BleFirmwareCheck.URL);
            netWorkUtils.printParam(strConvertBaseUrl + BleFirmwareCheck.URL, checkAppFirmwareBody);
            NetWork netWork = NetWork.OXO1;
            String str = strConvertBaseUrl + BleFirmwareCheck.URL;
            final O1XIiIO<Response<String>> o1XIiIO2 = new O1XIiIO<Response<String>>() { // from class: com.sma.smartv3.biz.DeviceInfoChecker$checkApp$$inlined$post$default$1
                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                public void handleResponse(Response<String> response) {
                    NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                    Activity activity2 = activity;
                    O1XIiIO o1XIiIO3 = o1XIiIO;
                    C3006uq c3006uq = c3006uqLoadPopup;
                    LogUtils.m11128d(yn0.I0IIOi + response);
                    if (response == null) {
                        response = new Response<>();
                        response.setCode(-1000);
                    }
                    netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO3);
                    if (c3006uq != null) {
                        c3006uq.dismiss();
                    }
                }

                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                public void handleError(String error) {
                    Intrinsics.X0O(error, "error");
                    NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
                }
            };
            AndroidNetworking.post(str).addBodyParameter((Map<String, String>) checkAppFirmwareBody).setTag((Object) str).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, String.class), new ParsedRequestListener<Response<String>>() { // from class: com.sma.smartv3.biz.DeviceInfoChecker$checkApp$$inlined$post$default$2
                @Override // com.androidnetworking.interfaces.ParsedRequestListener
                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                public void onResponse(Response<String> response) {
                    Intrinsics.X0O(response, "response");
                    o1XIiIO2.handleResponse(response);
                }

                @Override // com.androidnetworking.interfaces.ParsedRequestListener
                public void onError(ANError aNError) {
                    Response response;
                    StringBuilder sb = new StringBuilder();
                    sb.append("errorCode:");
                    Integer numValueOf = null;
                    sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                    sb.append(", errorBody:");
                    sb.append(aNError != null ? aNError.getErrorBody() : null);
                    sb.append(", ");
                    sb.append(aNError != null ? aNError.getErrorDetail() : null);
                    LogUtils.m11128d(sb.toString());
                    if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                        numValueOf = Integer.valueOf(response.getCode());
                    } else if (aNError != null) {
                        numValueOf = Integer.valueOf(aNError.getErrorCode());
                    }
                    o1XIiIO2.handleError(String.valueOf(numValueOf));
                }
            });
        }
    }

    public final void XO0O10(@aa1 final Activity activity, boolean z) {
        Intrinsics.X0O(activity, "activity");
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> checkExtraPackVersionBody = RequestBodyKt.getCheckExtraPackVersionBody();
        final DeviceInfoChecker$checkExtraPack$1 deviceInfoChecker$checkExtraPack$1 = new DeviceInfoChecker$checkExtraPack$1(z, activity);
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(activity, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), ExtraPackVersionLatest.URL);
        netWorkUtils.printParam(strConvertBaseUrl + ExtraPackVersionLatest.URL, checkExtraPackVersionBody);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + ExtraPackVersionLatest.URL;
        final O1XIiIO<Response<ExtraPackVersions>> o1XIiIO = new O1XIiIO<Response<ExtraPackVersions>>() { // from class: com.sma.smartv3.biz.DeviceInfoChecker$checkExtraPack$$inlined$post$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<ExtraPackVersions> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity2 = activity;
                O1XIiIO o1XIiIO2 = deviceInfoChecker$checkExtraPack$1;
                C3006uq c3006uq = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO2);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, deviceInfoChecker$checkExtraPack$1, c3006uqLoadPopup);
            }
        };
        AndroidNetworking.post(str).addBodyParameter((Map<String, String>) checkExtraPackVersionBody).setTag((Object) str).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, ExtraPackVersions.class), new ParsedRequestListener<Response<ExtraPackVersions>>() { // from class: com.sma.smartv3.biz.DeviceInfoChecker$checkExtraPack$$inlined$post$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<ExtraPackVersions> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                Response response;
                StringBuilder sb = new StringBuilder();
                sb.append("errorCode:");
                Integer numValueOf = null;
                sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                sb.append(", errorBody:");
                sb.append(aNError != null ? aNError.getErrorBody() : null);
                sb.append(", ");
                sb.append(aNError != null ? aNError.getErrorDetail() : null);
                LogUtils.m11128d(sb.toString());
                if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                    numValueOf = Integer.valueOf(response.getCode());
                } else if (aNError != null) {
                    numValueOf = Integer.valueOf(aNError.getErrorCode());
                }
                o1XIiIO.handleError(String.valueOf(numValueOf));
            }
        });
    }

    public final void XOO0ii0(@aa1 final O0Oiii<FirmwareVersion> callback, @aa1 String valid) {
        Intrinsics.X0O(callback, "callback");
        Intrinsics.X0O(valid, "valid");
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap checkFirmwareVersionBody$default = RequestBodyKt.getCheckFirmwareVersionBody$default(null, valid, null, null, 12, null);
        final O1XIiIO<FirmwareVersion> o1XIiIO = new O1XIiIO<FirmwareVersion>() { // from class: com.sma.smartv3.biz.DeviceInfoChecker$checkFirmwareVersion$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(FirmwareVersion firmwareVersion) {
                i1O0OXO1O.OXO1.OXO1("checkFirmwareVersion handleResponse: " + firmwareVersion);
                a01.OXO1.XIi00iiXO().put(FirmwareVersion.class.getName(), new Gson().toJson(firmwareVersion));
                callback.onSuccess(firmwareVersion);
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                i1O0OXO1O.OXO1.OXO1("checkFirmwareVersion handleError: " + error);
                a01.OXO1.XIi00iiXO().remove(FirmwareVersion.class.getName());
                callback.onFailure(error);
            }
        };
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), FirmwareVersionLatest.URL);
        netWorkUtils.printParam(strConvertBaseUrl + FirmwareVersionLatest.URL, checkFirmwareVersionBody$default);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + FirmwareVersionLatest.URL;
        final O1XIiIO<Response<FirmwareVersion>> o1XIiIO2 = new O1XIiIO<Response<FirmwareVersion>>() { // from class: com.sma.smartv3.biz.DeviceInfoChecker$checkFirmwareVersion$$inlined$post$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<FirmwareVersion> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity2 = activity;
                O1XIiIO o1XIiIO3 = o1XIiIO;
                C3006uq c3006uq = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO3);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
            }
        };
        AndroidNetworking.post(str).addBodyParameter((Map<String, String>) checkFirmwareVersionBody$default).setTag((Object) str).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, FirmwareVersion.class), new ParsedRequestListener<Response<FirmwareVersion>>() { // from class: com.sma.smartv3.biz.DeviceInfoChecker$checkFirmwareVersion$$inlined$post$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<FirmwareVersion> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                Response response;
                StringBuilder sb = new StringBuilder();
                sb.append("errorCode:");
                Integer numValueOf = null;
                sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                sb.append(", errorBody:");
                sb.append(aNError != null ? aNError.getErrorBody() : null);
                sb.append(", ");
                sb.append(aNError != null ? aNError.getErrorDetail() : null);
                LogUtils.m11128d(sb.toString());
                if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                    numValueOf = Integer.valueOf(response.getCode());
                } else if (aNError != null) {
                    numValueOf = Integer.valueOf(aNError.getErrorCode());
                }
                o1XIiIO2.handleError(String.valueOf(numValueOf));
            }
        });
    }

    public final void XXI() {
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> appConfigInfoBody = RequestBodyKt.getAppConfigInfoBody();
        final O1XIiIO<AppConfigInfo> o1XIiIO = new O1XIiIO<AppConfigInfo>() { // from class: com.sma.smartv3.biz.DeviceInfoChecker$getAppConfigInfo$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(AppConfigInfo appConfigInfo) {
                if (appConfigInfo != null) {
                    a01.OXO1.OXO1().put(AppConfigInfo.class.getName(), new Gson().toJson(appConfigInfo));
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
            }
        };
        Map<String, String> headersMap = netWorkUtils.getHeadersMap();
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetAppConfigInfo.URL);
        String str = strConvertBaseUrl + GetAppConfigInfo.URL;
        Map<String, ? extends Object> mapX111IO = kotlin.collections.OXO1.X111IO(appConfigInfoBody);
        mapX111IO.putAll(headersMap);
        Unit unit = Unit.OXO1;
        netWorkUtils.printParam(str, mapX111IO);
        NetWork netWork = NetWork.OXO1;
        String str2 = strConvertBaseUrl + GetAppConfigInfo.URL;
        final O1XIiIO<Response<AppConfigInfo>> o1XIiIO2 = new O1XIiIO<Response<AppConfigInfo>>() { // from class: com.sma.smartv3.biz.DeviceInfoChecker$getAppConfigInfo$$inlined$postV2$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<AppConfigInfo> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity2 = activity;
                O1XIiIO o1XIiIO3 = o1XIiIO;
                C3006uq c3006uq = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO3);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
            }
        };
        AndroidNetworking.post(str2).addHeaders(headersMap).addBodyParameter((Map<String, String>) appConfigInfoBody).setTag((Object) str2).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, AppConfigInfo.class), new ParsedRequestListener<Response<AppConfigInfo>>() { // from class: com.sma.smartv3.biz.DeviceInfoChecker$getAppConfigInfo$$inlined$postV2$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<AppConfigInfo> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                Response response;
                if (aNError != null) {
                    aNError.printStackTrace();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("errorCode:");
                Integer numValueOf = null;
                sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                sb.append(", errorBody:");
                sb.append(aNError != null ? aNError.getErrorBody() : null);
                sb.append(", errorDetail:");
                sb.append(aNError != null ? aNError.getErrorDetail() : null);
                sb.append(", exception:");
                sb.append(aNError != null ? aNError.getLocalizedMessage() : null);
                LogUtils.m11128d(sb.toString());
                if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                    numValueOf = Integer.valueOf(response.getCode());
                } else if (aNError != null) {
                    numValueOf = Integer.valueOf(aNError.getErrorCode());
                }
                o1XIiIO2.handleError(String.valueOf(numValueOf));
            }
        });
    }

    public final void XiOIO(@aa1 final String uuid, final int i, @aa1 final String clientId) {
        Intrinsics.X0O(uuid, "uuid");
        Intrinsics.X0O(clientId, "clientId");
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> gomoreAuthKeyBody = RequestBodyKt.getGomoreAuthKeyBody(uuid, i, clientId);
        final O1XIiIO<JsonObject> o1XIiIO = new O1XIiIO<JsonObject>() { // from class: com.sma.smartv3.biz.DeviceInfoChecker$getGoMoreAuthKey$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(JsonObject jsonObject) {
                String asString;
                i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
                i1o0oxo1o.OXO1("getGoMoreAuthKey -> " + jsonObject);
                if (jsonObject != null) {
                    try {
                        JsonElement jsonElement = jsonObject.get("key");
                        if (jsonElement == null || (asString = jsonElement.getAsString()) == null) {
                            return;
                        }
                        String str = uuid;
                        int i2 = i;
                        BleGoMoreSettings bleGoMoreSettings = new BleGoMoreSettings(str, asString, i2, clientId);
                        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.GOMORE_SET, BleKeyFlag.UPDATE, bleGoMoreSettings, false, false, 24, null);
                        a01.OXO1.m1440iO().put(BleGoMoreSettings.class.getName(), new Gson().toJson(bleGoMoreSettings));
                        i1o0oxo1o.OXO1("getGoMoreAuthKey -> " + i2 + " - GoMore activated!");
                    } catch (Exception e) {
                        e.printStackTrace();
                        i1O0OXO1O.OXO1.OXO1("getGoMoreAuthKey -> GoMore activate error! " + e.getMessage());
                    }
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                i1O0OXO1O.OXO1.OXO1("getGoMoreAuthKey -> GoMore activate error! " + error);
            }
        };
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetGomoreAuthKey.URL);
        netWorkUtils.printParam(strConvertBaseUrl + GetGomoreAuthKey.URL, gomoreAuthKeyBody);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + GetGomoreAuthKey.URL;
        final O1XIiIO<Response<JsonObject>> o1XIiIO2 = new O1XIiIO<Response<JsonObject>>() { // from class: com.sma.smartv3.biz.DeviceInfoChecker$getGoMoreAuthKey$$inlined$post$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<JsonObject> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity2 = activity;
                O1XIiIO o1XIiIO3 = o1XIiIO;
                C3006uq c3006uq = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO3);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
            }
        };
        AndroidNetworking.post(str).addBodyParameter((Map<String, String>) gomoreAuthKeyBody).setTag((Object) str).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, JsonObject.class), new ParsedRequestListener<Response<JsonObject>>() { // from class: com.sma.smartv3.biz.DeviceInfoChecker$getGoMoreAuthKey$$inlined$post$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<JsonObject> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                Response response;
                StringBuilder sb = new StringBuilder();
                sb.append("errorCode:");
                Integer numValueOf = null;
                sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                sb.append(", errorBody:");
                sb.append(aNError != null ? aNError.getErrorBody() : null);
                sb.append(", ");
                sb.append(aNError != null ? aNError.getErrorDetail() : null);
                LogUtils.m11128d(sb.toString());
                if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                    numValueOf = Integer.valueOf(response.getCode());
                } else if (aNError != null) {
                    numValueOf = Integer.valueOf(aNError.getErrorCode());
                }
                o1XIiIO2.handleError(String.valueOf(numValueOf));
            }
        });
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void i010I(@aa1 Activity activity, @tb1 FirmwareVersion firmwareVersion) {
        Intrinsics.X0O(activity, "activity");
        String mPlatform = BleCache.INSTANCE.getMPlatform();
        switch (mPlatform.hashCode()) {
            case -1955887059:
                if (mPlatform.equals(BleDeviceInfo.PLATFORM_NORDIC)) {
                    activity.startActivity(new Intent(activity, (Class<?>) FirmwareUpgradeNSmaActivity.class));
                    return;
                }
                return;
            case -1549651556:
                if (mPlatform.equals(BleDeviceInfo.PLATFORM_REALTEK)) {
                    if (q62.OXO1.iXi()) {
                        activity.startActivity(new Intent(activity, (Class<?>) FirmwareUpgradeRSmaActivity.class));
                        return;
                    } else {
                        activity.startActivity(new Intent(activity, (Class<?>) FirmwareUpgradeRActivity.class));
                        return;
                    }
                }
                return;
            case 2370:
                if (!mPlatform.equals(BleDeviceInfo.PLATFORM_JL)) {
                    return;
                }
                break;
            case 65152:
                if (mPlatform.equals(BleDeviceInfo.PLATFORM_ATS)) {
                    activity.startActivity(new Intent(activity, (Class<?>) FirmwareUpgradeATSActivity.class));
                    return;
                }
                return;
            case 70659068:
                if (!mPlatform.equals(BleDeviceInfo.PLATFORM_JL707)) {
                    return;
                }
                break;
            case 1697379018:
                if (!mPlatform.equals(BleDeviceInfo.PLATFORM_JL707LITE)) {
                    return;
                }
                break;
            case 2138586828:
                if (mPlatform.equals(BleDeviceInfo.PLATFORM_GOODIX)) {
                    activity.startActivity(new Intent(activity, (Class<?>) FirmwareUpgradeGQActivity.class));
                    return;
                }
                return;
            default:
                return;
        }
        if (TextUtils.isEmpty(firmwareVersion != null ? firmwareVersion.getFileUrl2() : null)) {
            activity.startActivity(new Intent(activity, (Class<?>) FirmwareUpgradeJSmaActivity.class));
        } else {
            activity.startActivity(new Intent(activity, (Class<?>) FirmwareUpgradeJSma2Activity.class));
        }
    }

    /* JADX INFO: renamed from: iI */
    public final void m38095iI(@aa1 Activity activity, @aa1 String valid) {
        Intrinsics.X0O(activity, "activity");
        Intrinsics.X0O(valid, "valid");
        m38094OX(new XIi00iiXO(activity), valid);
    }

    public final void iIiiO(@aa1 final String key, @tb1 final Function1<? super Boolean, Unit> function1) {
        Intrinsics.X0O(key, "key");
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> externalKeyBody = RequestBodyKt.getExternalKeyBody(key);
        final O1XIiIO<ExternalKeyManager> o1XIiIO = new O1XIiIO<ExternalKeyManager>() { // from class: com.sma.smartv3.biz.DeviceInfoChecker$getKeyVault$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(ExternalKeyManager externalKeyManager) throws InvalidKeySpecException {
                i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
                i1o0oxo1o.OXO1("getKeyVault -> " + externalKeyManager);
                if (externalKeyManager != null) {
                    externalKeyManager.setTimestamp(System.currentTimeMillis());
                    a01.OXO1.XIi00iiXO().put(key + '_' + ExternalKeyManager.class.getName(), new Gson().toJson(externalKeyManager), false);
                    i1o0oxo1o.OXO1("kv:" + UtilsKt.O1O(externalKeyManager));
                }
                Function1<Boolean, Unit> function2 = function1;
                if (function2 != null) {
                    function2.invoke2(Boolean.TRUE);
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                i1O0OXO1O.OXO1.OXO1("getKeyValue error -> " + error);
                Function1<Boolean, Unit> function2 = function1;
                if (function2 != null) {
                    function2.invoke2(Boolean.FALSE);
                }
            }
        };
        Map<String, String> headersMap = netWorkUtils.getHeadersMap();
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetExternalKey.URL);
        String str = strConvertBaseUrl + GetExternalKey.URL;
        Map<String, ? extends Object> mapX111IO = kotlin.collections.OXO1.X111IO(externalKeyBody);
        mapX111IO.putAll(headersMap);
        Unit unit = Unit.OXO1;
        netWorkUtils.printParam(str, mapX111IO);
        NetWork netWork = NetWork.OXO1;
        String str2 = strConvertBaseUrl + GetExternalKey.URL;
        final O1XIiIO<Response<ExternalKeyManager>> o1XIiIO2 = new O1XIiIO<Response<ExternalKeyManager>>() { // from class: com.sma.smartv3.biz.DeviceInfoChecker$getKeyVault$$inlined$postV2$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<ExternalKeyManager> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity2 = activity;
                O1XIiIO o1XIiIO3 = o1XIiIO;
                C3006uq c3006uq = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO3);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
            }
        };
        AndroidNetworking.post(str2).addHeaders(headersMap).addBodyParameter((Map<String, String>) externalKeyBody).setTag((Object) str2).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, ExternalKeyManager.class), new ParsedRequestListener<Response<ExternalKeyManager>>() { // from class: com.sma.smartv3.biz.DeviceInfoChecker$getKeyVault$$inlined$postV2$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<ExternalKeyManager> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                Response response;
                if (aNError != null) {
                    aNError.printStackTrace();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("errorCode:");
                Integer numValueOf = null;
                sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                sb.append(", errorBody:");
                sb.append(aNError != null ? aNError.getErrorBody() : null);
                sb.append(", errorDetail:");
                sb.append(aNError != null ? aNError.getErrorDetail() : null);
                sb.append(", exception:");
                sb.append(aNError != null ? aNError.getLocalizedMessage() : null);
                LogUtils.m11128d(sb.toString());
                if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                    numValueOf = Integer.valueOf(response.getCode());
                } else if (aNError != null) {
                    numValueOf = Integer.valueOf(aNError.getErrorCode());
                }
                o1XIiIO2.handleError(String.valueOf(numValueOf));
            }
        });
    }

    /* JADX INFO: renamed from: iO */
    public final void m38096iO(@aa1 final Function1<? super AppVersion, Unit> action) {
        Intrinsics.X0O(action, "action");
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> checkAppVersionBody = RequestBodyKt.getCheckAppVersionBody();
        final O1XIiIO<AppVersion> o1XIiIO = new O1XIiIO<AppVersion>() { // from class: com.sma.smartv3.biz.DeviceInfoChecker$checkAppVersion$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(AppVersion appVersion) {
                if (appVersion != null) {
                    action.invoke2(appVersion);
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
            }
        };
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), AppVersionLatest.URL);
        netWorkUtils.printParam(strConvertBaseUrl + AppVersionLatest.URL, checkAppVersionBody);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + AppVersionLatest.URL;
        final O1XIiIO<Response<AppVersion>> o1XIiIO2 = new O1XIiIO<Response<AppVersion>>() { // from class: com.sma.smartv3.biz.DeviceInfoChecker$checkAppVersion$$inlined$post$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<AppVersion> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity2 = activity;
                O1XIiIO o1XIiIO3 = o1XIiIO;
                C3006uq c3006uq = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO3);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
            }
        };
        AndroidNetworking.post(str).addBodyParameter((Map<String, String>) checkAppVersionBody).setTag((Object) str).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, AppVersion.class), new ParsedRequestListener<Response<AppVersion>>() { // from class: com.sma.smartv3.biz.DeviceInfoChecker$checkAppVersion$$inlined$post$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<AppVersion> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                Response response;
                StringBuilder sb = new StringBuilder();
                sb.append("errorCode:");
                Integer numValueOf = null;
                sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                sb.append(", errorBody:");
                sb.append(aNError != null ? aNError.getErrorBody() : null);
                sb.append(", ");
                sb.append(aNError != null ? aNError.getErrorDetail() : null);
                LogUtils.m11128d(sb.toString());
                if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                    numValueOf = Integer.valueOf(response.getCode());
                } else if (aNError != null) {
                    numValueOf = Integer.valueOf(aNError.getErrorCode());
                }
                o1XIiIO2.handleError(String.valueOf(numValueOf));
            }
        });
    }

    public final void iOOX010X() {
        String strXiOIii1 = UtilsKt.XiOIii1(ExternalKeyManager.SPEECH_KEY);
        if (strXiOIii1.length() > 0) {
            i1O0OXO1O.OXO1.OXO1("initMicrosoftSDK cache");
            MicrosoftSDKManage.O1O.OXO1().iI0I(strXiOIii1);
        } else {
            i1O0OXO1O.OXO1.OXO1("initMicrosoftSDK NetWork");
            iIiiO(ExternalKeyManager.SPEECH_KEY, new Function1() { // from class: com.android.mltcode.paycertificationapi.X10iI1OX
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return DeviceInfoChecker.X01IiOiIi(((Boolean) obj).booleanValue());
                }
            });
        }
    }
}
