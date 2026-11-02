package com.sma.smartv3.biz;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.android.mltcode.paycertificationapi.O0Oiii;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.X0XIOI;
import com.android.mltcode.paycertificationapi.X10iI1OX;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.e44;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iX1IIO10;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uq;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.facebook.internal.security.CertificateUtil;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.model.AppConfigInfo;
import com.sma.smartv3.model.AppVersion;
import com.sma.smartv3.model.DeviceConfigInfo;
import com.sma.smartv3.model.DeviceOnlineInfo;
import com.sma.smartv3.model.ExternalKeyManager;
import com.sma.smartv3.model.ExtraPackVersions;
import com.sma.smartv3.model.ExtraPackageData;
import com.sma.smartv3.model.FirmwareVersion;
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
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.device.FirmwareUpgradeATSActivity;
import com.sma.smartv3.ui.device.FirmwareUpgradeGQActivity;
import com.sma.smartv3.ui.device.FirmwareUpgradeJSma2Activity;
import com.sma.smartv3.ui.device.FirmwareUpgradeJSmaActivity;
import com.sma.smartv3.ui.device.FirmwareUpgradeNSmaActivity;
import com.sma.smartv3.ui.device.FirmwareUpgradeRActivity;
import com.sma.smartv3.ui.device.FirmwareUpgradeRSmaActivity;
import com.sma.smartv3.ui.device.FontRepairRActivity;
import com.sma.smartv3.ui.device.FontRepairSmaActivity;
import com.sma.smartv3.ui.device.UiRepairRActivity;
import com.sma.smartv3.ui.device.UiRepairSmaActivity;
import com.sma.smartv3.util.MicrosoftSDKManage;
import com.sma.smartv3.util.UtilsKt;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleDeviceInfo;
import java.lang.reflect.Type;
import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nDeviceInfoChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceInfoChecker.kt\ncom/sma/smartv3/biz/DeviceInfoChecker\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,920:1\n176#2,11:921\n196#2:940\n176#2,11:941\n196#2:960\n176#2,11:961\n196#2:980\n176#2,11:981\n196#2:1000\n176#2,11:1001\n196#2:1020\n176#2,11:1021\n196#2:1040\n176#2,11:1104\n196#2:1123\n176#2,11:1124\n196#2:1143\n176#2,11:1144\n196#2:1163\n176#2,11:1164\n196#2:1183\n235#2,11:1184\n246#2:1196\n256#2:1206\n235#2,11:1207\n246#2:1219\n256#2:1229\n176#2,11:1230\n196#2:1249\n235#2,11:1250\n246#2:1262\n256#2:1272\n183#2,4:1273\n196#2:1285\n176#2,11:1286\n196#2:1305\n235#2,11:1306\n246#2:1318\n256#2:1328\n252#3,7:932\n270#3:939\n252#3,7:952\n270#3:959\n252#3,7:972\n270#3:979\n252#3,7:992\n270#3:999\n252#3,7:1012\n270#3:1019\n252#3,7:1032\n270#3:1039\n252#3,7:1115\n270#3:1122\n252#3,7:1135\n270#3:1142\n252#3,7:1155\n270#3:1162\n252#3,7:1175\n270#3:1182\n278#3,8:1197\n298#3:1205\n278#3,8:1220\n298#3:1228\n252#3,7:1241\n270#3:1248\n278#3,8:1263\n298#3:1271\n252#3,7:1277\n270#3:1284\n252#3,7:1297\n270#3:1304\n278#3,8:1319\n298#3:1327\n69#4,3:1041\n72#4,5:1045\n69#4,3:1050\n72#4,5:1054\n69#4,3:1059\n72#4,5:1063\n69#4,3:1068\n72#4,5:1072\n69#4,3:1077\n72#4,5:1081\n69#4,3:1086\n72#4,5:1090\n69#4,3:1095\n72#4,5:1099\n1#5:1044\n1#5:1053\n1#5:1062\n1#5:1071\n1#5:1080\n1#5:1089\n1#5:1098\n1#5:1195\n1#5:1218\n1#5:1261\n1#5:1317\n*S KotlinDebug\n*F\n+ 1 DeviceInfoChecker.kt\ncom/sma/smartv3/biz/DeviceInfoChecker\n*L\n72#1:921,11\n72#1:940\n92#1:941,11\n92#1:960\n118#1:961,11\n118#1:980\n153#1:981,11\n153#1:1000\n179#1:1001,11\n179#1:1020\n216#1:1021,11\n216#1:1040\n319#1:1104,11\n319#1:1123\n336#1:1124,11\n336#1:1143\n438#1:1144,11\n438#1:1163\n518#1:1164,11\n518#1:1183\n570#1:1184,11\n570#1:1196\n570#1:1206\n638#1:1207,11\n638#1:1219\n638#1:1229\n733#1:1230,11\n733#1:1249\n772#1:1250,11\n772#1:1262\n772#1:1272\n798#1:1273,4\n798#1:1285\n845#1:1286,11\n845#1:1305\n879#1:1306,11\n879#1:1318\n879#1:1328\n72#1:932,7\n72#1:939\n92#1:952,7\n92#1:959\n118#1:972,7\n118#1:979\n153#1:992,7\n153#1:999\n179#1:1012,7\n179#1:1019\n216#1:1032,7\n216#1:1039\n319#1:1115,7\n319#1:1122\n336#1:1135,7\n336#1:1142\n438#1:1155,7\n438#1:1162\n518#1:1175,7\n518#1:1182\n570#1:1197,8\n570#1:1205\n638#1:1220,8\n638#1:1228\n733#1:1241,7\n733#1:1248\n772#1:1263,8\n772#1:1271\n798#1:1277,7\n798#1:1284\n845#1:1297,7\n845#1:1304\n879#1:1319,8\n879#1:1327\n283#1:1041,3\n283#1:1045,5\n285#1:1050,3\n285#1:1054,5\n290#1:1059,3\n290#1:1063,5\n294#1:1068,3\n294#1:1072,5\n299#1:1077,3\n299#1:1081,5\n302#1:1086,3\n302#1:1090,5\n307#1:1095,3\n307#1:1099,5\n283#1:1044\n285#1:1053\n290#1:1062\n294#1:1071\n299#1:1080\n302#1:1089\n307#1:1098\n570#1:1195\n638#1:1218\n772#1:1261\n879#1:1317\n*E\n"})
public final class DeviceInfoChecker {

    @aa1
    public static final DeviceInfoChecker OXO1 = null;

    @SourceDebugExtension({"SMAP\nDeviceInfoChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceInfoChecker.kt\ncom/sma/smartv3/biz/DeviceInfoChecker$toFontRepair$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,920:1\n11#2,2:921\n27#2,2:941\n27#2,2:943\n69#3,3:923\n72#3,5:927\n69#3,3:932\n72#3,5:936\n69#3,3:945\n72#3,5:949\n69#3,3:954\n72#3,5:958\n1#4:926\n1#4:935\n1#4:948\n1#4:957\n*S KotlinDebug\n*F\n+ 1 DeviceInfoChecker.kt\ncom/sma/smartv3/biz/DeviceInfoChecker$toFontRepair$1\n*L\n489#1:921,2\n495#1:941,2\n501#1:943,2\n491#1:923,3\n491#1:927,5\n492#1:932,3\n492#1:936,5\n506#1:945,3\n506#1:949,5\n507#1:954,3\n507#1:958,5\n491#1:926\n492#1:935\n506#1:948\n507#1:957\n*E\n"})
    public static final class OXO1 implements O0Oiii<ExtraPackageData[]> {
        public final /* synthetic */ Activity OXO1;

        public OXO1(Activity r1) {
            this.OXO1 = r1;
        }

        public void OXO1(ExtraPackageData[] r4) {
            if (r4 != null) goto L5;
        L16:
            a01.OXO1.XO0O10().remove(ExtraPackageData.class.getName());
            ToastUtils.showLong(R.string.not_found_repair_version);
            return;
        L5:
            if (r4.length == 0) goto L16;
            LogUtils.d(new Object[]{r4[0]});
            SPUtils r2 = a01.OXO1.XO0O10();
            ExtraPackageData r5 = r4[0];
            r2.put(ExtraPackageData.class.getName(), new Gson().toJson(r5));
            int r6 = q62.OXO1.XX00i10X();
            if (r6 != 0) goto L10;
            Activity r7 = this.OXO1;
            r7.startActivity(new Intent(r7, FontRepairRActivity.class));
            return;
        L10:
            if (r6 == 1) goto L12;
            return;
        L12:
            Activity r8 = this.OXO1;
            r8.startActivity(new Intent(r8, FontRepairSmaActivity.class));
        }

        @Override // com.android.mltcode.paycertificationapi.O0Oiii
        public void onFailure(String r3) {
            Intrinsics.X0O(r3, "error");
            a01.OXO1.XO0O10().remove(ExtraPackageData.class.getName());
            if (Intrinsics.XOO0ii0(BleCache.INSTANCE.getMPlatform(), BleDeviceInfo.PLATFORM_JL) == false) goto L6;
            ToastUtils.showLong(R.string.not_found_repair_version);
            return;
        L6:
            int r4 = q62.OXO1.XX00i10X();
            if (r4 != 0) goto L9;
            Activity r5 = this.OXO1;
            r5.startActivity(new Intent(r5, FontRepairRActivity.class));
            return;
        L9:
            if (r4 == 1) goto L11;
            return;
        L11:
            Activity r6 = this.OXO1;
            r6.startActivity(new Intent(r6, FontRepairSmaActivity.class));
        }

        @Override // com.android.mltcode.paycertificationapi.O0Oiii
        public /* bridge */ /* synthetic */ void onSuccess(ExtraPackageData[] r1) {
            OXO1(r1);
        }
    }

    @SourceDebugExtension({"SMAP\nDeviceInfoChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceInfoChecker.kt\ncom/sma/smartv3/biz/DeviceInfoChecker$toUIRepair$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,920:1\n11#2,2:921\n69#3,3:923\n72#3,5:927\n69#3,3:932\n72#3,5:936\n1#4:926\n1#4:935\n*S KotlinDebug\n*F\n+ 1 DeviceInfoChecker.kt\ncom/sma/smartv3/biz/DeviceInfoChecker$toUIRepair$1\n*L\n462#1:921,2\n464#1:923,3\n464#1:927,5\n465#1:932,3\n465#1:936,5\n464#1:926\n465#1:935\n*E\n"})
    public static final class XIi00iiXO implements O0Oiii<ExtraPackageData[]> {
        public final /* synthetic */ Activity OXO1;

        public XIi00iiXO(Activity r1) {
            this.OXO1 = r1;
        }

        public static /* synthetic */ Unit OXO1(Activity r0, BleConnector r1) {
            return iO(r0, r1);
        }

        public static final Unit iO(Activity r1, BleConnector r2) {
            Intrinsics.X0O(r2, "it");
            r1.startActivity(new Intent(r1, UiRepairSmaActivity.class));
            return Unit.OXO1;
        }

        public void XIi00iiXO(ExtraPackageData[] r5) {
            if (r5 != null) goto L4;
        L16:
            ToastUtils.showLong(R.string.not_found_repair_version);
            return;
        L4:
            if (r5.length == 0) goto L16;
            LogUtils.d(new Object[]{r5[0]});
            SPUtils r1 = a01.OXO1.XO0O10();
            ExtraPackageData r6 = r5[0];
            r1.put(ExtraPackageData.class.getName(), new Gson().toJson(r6));
            int r7 = q62.OXO1.Xi1i0XOX0();
            if (r7 != 0) goto L9;
            Activity r8 = this.OXO1;
            r8.startActivity(new Intent(r8, UiRepairRActivity.class));
            return;
        L9:
            if (r7 == 1) goto L12;
            ToastUtils.showLong(R.string.stay_tuned);
            return;
        L12:
            final Activity r9 = this.OXO1;
            X0IOiX1O.XIi00iiXO(false, new X0XIOI(r9), 1, null);
        }

        @Override // com.android.mltcode.paycertificationapi.O0Oiii
        public void onFailure(String r2) {
            Intrinsics.X0O(r2, "error");
            ToastUtils.showLong(R.string.not_found_repair_version);
        }

        @Override // com.android.mltcode.paycertificationapi.O0Oiii
        public /* bridge */ /* synthetic */ void onSuccess(ExtraPackageData[] r1) {
            XIi00iiXO(r1);
        }
    }

    static {
        OXO1 = new DeviceInfoChecker();
    }

    public DeviceInfoChecker() {
    }

    public static /* synthetic */ void I0IIOi(DeviceInfoChecker r0, O0Oiii r1, String r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = Api.Y;
    L5:
        r0.XOO0ii0(r1, r2);
    }

    public static /* synthetic */ void I0iXXO(DeviceInfoChecker r7, O0Oiii r8, String r9, String r10, String r11, String r12, String r13, int r14, Object r15) {
        if ((r14 & 2) == 0) goto L5;
        r9 = Api.Y;
    L5:
        String r2 = r9;
        if ((r14 & 4) == 0) goto L8;
        String r3 = "";
    L10:
        if ((r14 & 8) == 0) goto L12;
        r11 = "0";
    L12:
        String r4 = r11;
        if ((r14 & 16) == 0) goto L15;
        String r5 = "";
    L17:
        if ((r14 & 32) == 0) goto L20;
        String r6 = "";
    L21:
        r7.OIX0iXi(r8, r2, r3, r4, r5, r6);
        return;
    L20:
        r6 = r13;
        goto L21
    L15:
        r5 = r12;
        goto L17
    L8:
        r3 = r10;
        goto L10
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void IIX1OXO(DeviceInfoChecker r0, Function1 r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        r0.I1XOi1(r1);
    }

    public static /* synthetic */ void IO(DeviceInfoChecker r1, O0Oiii r2, Activity r3, View r4, String r5, int r6, Object r7) {
        if ((r6 & 2) == 0) goto L6;
        r3 = null;
    L6:
        if ((r6 & 4) == 0) goto L9;
        r4 = null;
    L9:
        if ((r6 & 8) == 0) goto L11;
        r5 = Api.Y;
    L11:
        r1.OIi0(r2, r3, r4, r5);
    }

    public static /* synthetic */ void O00(DeviceInfoChecker r0, Activity r1, boolean r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = false;
    L5:
        r0.XO0O10(r1, r2);
    }

    public static /* synthetic */ void O10IXXX0X(DeviceInfoChecker r0, String r1, String r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = BleCache.INSTANCE.getMBleName();
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = BleCache.INSTANCE.getMFirmwareFlag();
    L8:
        r0.X1ii(r1, r2);
    }

    public static /* synthetic */ Unit OXO1(boolean r0) {
        return X01IiOiIi(r0);
    }

    public static final Unit X01IiOiIi(boolean r2) {
        if (r2 == false) goto L4;
        String r3 = UtilsKt.XiOIii1(ExternalKeyManager.SPEECH_KEY);
        i1O0OXO1O.OXO1.OXO1("initMicrosoftSDK handle -> ");
        MicrosoftSDKManage.O1O.OXO1().iI0I(r3);
    L6:
        return Unit.OXO1;
    L4:
        i1O0OXO1O.OXO1.OXO1("initMicrosoftSDK error ->");
        goto L6
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void XX0(DeviceInfoChecker r0, String r1, Function1 r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = null;
    L5:
        r0.iIiiO(r1, r2);
    }

    public static /* synthetic */ void XXIIO1i11(DeviceInfoChecker r0, Activity r1, String r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = Api.Y;
    L5:
        r0.O1O(r1, r2);
    }

    public static /* synthetic */ void XiOIii1(DeviceInfoChecker r0, O0Oiii r1, String r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = Api.Y;
    L5:
        r0.OiIIX101O(r1, r2);
    }

    public static /* synthetic */ void iOO1ii1(DeviceInfoChecker r0, Activity r1, String r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = Api.Y;
    L5:
        r0.IXXOO(r1, r2);
    }

    public static /* synthetic */ void iX(DeviceInfoChecker r0, Activity r1, FirmwareVersion r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = null;
    L5:
        r0.i010I(r1, r2);
    }

    public static /* synthetic */ void iX1O1(DeviceInfoChecker r0, Activity r1, String r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = Api.Y;
    L5:
        r0.iI(r1, r2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, java.lang.String] */
    public final void I1() {
        final Ref.ObjectRef r0 = new Ref.ObjectRef();
        Api r1 = Api.INSTANCE;
        if (Intrinsics.XOO0ii0(r1.getBASE_URL(), iX1IIO10.XIi00iiXO) == false) goto L5;
    L11:
        T r2 = iX1IIO10.iO;
    L12:
        r0.element = r2;
        BleCache r3 = BleCache.INSTANCE;
        String r4 = r3.getMPlatform();
        String r5 = r3.getMPrototype();
        q62 r6 = q62.OXO1;
        r0.element = r2 + "/watchFace/" + r4 + "/" + r5 + "/" + r6.XOO0XOOii();
        a01.OXO1.iO().put(b01.OX110i, (String) r0.element);
        Object r7 = r0.element;
        StringBuilder r8 = new StringBuilder();
        r8.append(r7);
        r8.append("/info.txt");
        String r9 = r8.toString();
        i1O0OXO1O.OXO1.OXO1("watchFaceInfoUrl = " + r9);
        NetWorkUtils.INSTANCE.get(r9, new DeviceInfoChecker$getWatchFaceInfo$1(r0), r6.XXiO0i());
        return;
    L5:
        if (Intrinsics.XOO0ii0(r1.getBASE_URL(), iX1IIO10.OXO1) == true) goto L11;
        if (Intrinsics.XOO0ii0(r1.getBASE_URL(), e44.O00) == false) goto L10;
        r2 = iX1IIO10.O00;
        goto L12
    L10:
        r2 = iX1IIO10.XO0O10;
        goto L12
    }

    public final void I1XOi1(@tb1 final Function1<? super Boolean, Unit> r9) {
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        final Activity r2 = null;
        HashMap r3 = RequestBodyKt.getDeviceListObjectBody$default(null, 1, null);
        final O1XIiIO<DeviceOnlineInfo[]> r4 = new DeviceInfoChecker$getDeviceListObject$1(r9);
        final uq r10 = r0.loadPopup(null, null);
        String r5 = r0.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetDeviceListObject.URL);
        r0.printParam(r5 + GetDeviceListObject.URL, r3);
        NetWork r1 = NetWork.OXO1;
        String r6 = r5 + GetDeviceListObject.URL;
        final O1XIiIO<Response<DeviceOnlineInfo[]>> r7 = new DeviceInfoChecker$getDeviceListObject$$inlined$post$default$1(r2, r4, r10);
        AndroidNetworking.post(r6).addBodyParameter(r3).setTag(r6).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{DeviceOnlineInfo[].class}), new DeviceInfoChecker$getDeviceListObject$$inlined$post$default$2(r7));
    }

    public final boolean II1Xi0() {
        a01 r0 = a01.OXO1;
        if (Duration.between(Instant.ofEpochMilli(r0.iO().getLong(b01.ii00OXXO, 0)), Instant.now()).toDays() < 1) goto L6;
        r0.iO().put(b01.ii00OXXO, System.currentTimeMillis());
        return true;
    L6:
        return false;
    }

    public final void IXXOO(@aa1 Activity r2, @aa1 String r3) {
        Intrinsics.X0O(r2, "activity");
        Intrinsics.X0O(r3, "valid");
        OII(new OXO1(r2), r3);
    }

    public final void IiI10X(@aa1 final Activity r8) {
        Intrinsics.X0O(r8, "activity");
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r1 = RequestBodyKt.getCheckExtraPackVersionBody();
        final O1XIiIO<ExtraPackVersions> r2 = new DeviceInfoChecker$checkExtraPackVersion$1(r8);
        final uq r3 = r0.loadPopup(r8, null);
        String r4 = r0.convertBaseUrl(Api.INSTANCE.getBASE_URL(), ExtraPackVersionLatest.URL);
        r0.printParam(r4 + ExtraPackVersionLatest.URL, r1);
        NetWork r5 = NetWork.OXO1;
        String r6 = r4 + ExtraPackVersionLatest.URL;
        final O1XIiIO<Response<ExtraPackVersions>> r7 = new DeviceInfoChecker$checkExtraPackVersion$$inlined$post$default$1(r8, r2, r3);
        AndroidNetworking.post(r6).addBodyParameter(r1).setTag(r6).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{ExtraPackVersions.class}), new DeviceInfoChecker$checkExtraPackVersion$$inlined$post$default$2(r7));
    }

    public final void O1O(@aa1 final Activity r7, @aa1 String r8) {
        Intrinsics.X0O(r7, "activity");
        Intrinsics.X0O(r8, "valid");
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r9 = RequestBodyKt.getExtraPackVersionGPSFirmwareBody("0", r8);
        final O1XIiIO<ExtraPackageData[]> r1 = new DeviceInfoChecker$toGPSFirmwareRepair$1(r7);
        final Activity r10 = null;
        final uq r2 = r0.loadPopup(null, null);
        String r3 = r0.convertBaseUrl(Api.INSTANCE.getBASE_URL(), BleExtraPackVersionGPSFirmware.URL);
        r0.printParam(r3 + BleExtraPackVersionGPSFirmware.URL, r9);
        NetWork r4 = NetWork.OXO1;
        String r5 = r3 + BleExtraPackVersionGPSFirmware.URL;
        final O1XIiIO<Response<ExtraPackageData[]>> r6 = new DeviceInfoChecker$toGPSFirmwareRepair$$inlined$post$default$1(r10, r1, r2);
        AndroidNetworking.post(r5).addBodyParameter(r9).setTag(r5).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{ExtraPackageData[].class}), new DeviceInfoChecker$toGPSFirmwareRepair$$inlined$post$default$2(r6));
    }

    public final void OII(@aa1 final O0Oiii<ExtraPackageData[]> r7, @aa1 String r8) {
        Intrinsics.X0O(r7, "callback");
        Intrinsics.X0O(r8, "valid");
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r9 = RequestBodyKt.getExtraPackVersionFontBody(r8);
        final O1XIiIO<ExtraPackageData[]> r1 = new DeviceInfoChecker$getLatestFont$1(r7);
        final Activity r10 = null;
        final uq r2 = r0.loadPopup(null, null);
        String r3 = r0.convertBaseUrl(Api.INSTANCE.getBASE_URL(), BleExtraPackVersionFont.URL);
        r0.printParam(r3 + BleExtraPackVersionFont.URL, r9);
        NetWork r4 = NetWork.OXO1;
        String r5 = r3 + BleExtraPackVersionFont.URL;
        final O1XIiIO<Response<ExtraPackageData[]>> r6 = new DeviceInfoChecker$getLatestFont$$inlined$post$default$1(r10, r1, r2);
        AndroidNetworking.post(r5).addBodyParameter(r9).setTag(r5).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{ExtraPackageData[].class}), new DeviceInfoChecker$getLatestFont$$inlined$post$default$2(r6));
    }

    public final void OIX0iXi(@aa1 final O0Oiii<FirmwareVersion> r8, @aa1 String r9, @aa1 String r10, @aa1 String r11, @aa1 String r12, @aa1 String r13) {
        Intrinsics.X0O(r8, "callback");
        Intrinsics.X0O(r9, "valid");
        Intrinsics.X0O(r10, "bleName");
        Intrinsics.X0O(r11, "flag");
        Intrinsics.X0O(r12, "curVersion");
        Intrinsics.X0O(r13, "mac");
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r14 = RequestBodyKt.getCheckNoteFirmwareVersionBody(null, r9, r10, r11, r12, r13);
        final O1XIiIO<FirmwareVersion> r15 = new DeviceInfoChecker$checkNoteFirmwareVersion$1(r8);
        final Activity r16 = null;
        final uq r17 = r0.loadPopup(null, null);
        String r18 = r0.convertBaseUrl(Api.INSTANCE.getBASE_URL(), FirmwareVersionLatest.URL);
        r0.printParam(r18 + FirmwareVersionLatest.URL, r14);
        NetWork r1 = NetWork.OXO1;
        String r19 = r18 + FirmwareVersionLatest.URL;
        final O1XIiIO<Response<FirmwareVersion>> r110 = new DeviceInfoChecker$checkNoteFirmwareVersion$$inlined$post$default$1(r16, r15, r17);
        AndroidNetworking.post(r19).addBodyParameter(r14).setTag(r19).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{FirmwareVersion.class}), new DeviceInfoChecker$checkNoteFirmwareVersion$$inlined$post$default$2(r110));
    }

    public final void OIi0(@aa1 final O0Oiii<ExtraPackageData> r5, @tb1 final Activity r6, @tb1 View r7, @aa1 String r8) {
        Intrinsics.X0O(r5, "callback");
        Intrinsics.X0O(r8, "valid");
        i1O0OXO1O.OXO1.OXO1("checkGPSFirmwareVersion");
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r9 = RequestBodyKt.getExtraPackVersionGPSFirmwareBody(null, r8);
        final O1XIiIO<ExtraPackageData[]> r1 = new DeviceInfoChecker$checkGPSFirmwareVersion$1(r5);
        final uq r10 = r0.loadPopup(r6, r7);
        String r11 = r0.convertBaseUrl(Api.INSTANCE.getBASE_URL(), BleExtraPackVersionGPSFirmware.URL);
        r0.printParam(r11 + BleExtraPackVersionGPSFirmware.URL, r9);
        NetWork r2 = NetWork.OXO1;
        String r12 = r11 + BleExtraPackVersionGPSFirmware.URL;
        final O1XIiIO<Response<ExtraPackageData[]>> r3 = new DeviceInfoChecker$checkGPSFirmwareVersion$$inlined$post$1(r6, r1, r10);
        AndroidNetworking.post(r12).addBodyParameter(r9).setTag(r12).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{ExtraPackageData[].class}), new DeviceInfoChecker$checkGPSFirmwareVersion$$inlined$post$2(r3));
    }

    public final void OX(@aa1 final O0Oiii<ExtraPackageData[]> r7, @aa1 String r8) {
        Intrinsics.X0O(r7, "callback");
        Intrinsics.X0O(r8, "valid");
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r9 = RequestBodyKt.getExtraPackVersionUIBody(r8);
        final O1XIiIO<ExtraPackageData[]> r1 = new DeviceInfoChecker$getLatestUi$1(r7);
        final Activity r10 = null;
        final uq r2 = r0.loadPopup(null, null);
        String r3 = r0.convertBaseUrl(Api.INSTANCE.getBASE_URL(), BleExtraPackVersionUi.URL);
        r0.printParam(r3 + BleExtraPackVersionUi.URL, r9);
        NetWork r4 = NetWork.OXO1;
        String r5 = r3 + BleExtraPackVersionUi.URL;
        final O1XIiIO<Response<ExtraPackageData[]>> r6 = new DeviceInfoChecker$getLatestUi$$inlined$post$default$1(r10, r1, r2);
        AndroidNetworking.post(r5).addBodyParameter(r9).setTag(r5).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{ExtraPackageData[].class}), new DeviceInfoChecker$getLatestUi$$inlined$post$default$2(r6));
    }

    public final void OiIIX101O(@aa1 final O0Oiii<ExtraPackageData[]> r7, @aa1 String r8) {
        Intrinsics.X0O(r7, "callback");
        Intrinsics.X0O(r8, "valid");
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r9 = RequestBodyKt.getExtraPackVersionLanguageBody(r8);
        final O1XIiIO<ExtraPackageData[]> r1 = new DeviceInfoChecker$getLanguageList$1(r7);
        final Activity r10 = null;
        final uq r2 = r0.loadPopup(null, null);
        String r3 = r0.convertBaseUrl(Api.INSTANCE.getBASE_URL(), BleExtraPackVersionLanguage.URL);
        r0.printParam(r3 + BleExtraPackVersionLanguage.URL, r9);
        NetWork r4 = NetWork.OXO1;
        String r5 = r3 + BleExtraPackVersionLanguage.URL;
        final O1XIiIO<Response<ExtraPackageData[]>> r6 = new DeviceInfoChecker$getLanguageList$$inlined$post$default$1(r10, r1, r2);
        AndroidNetworking.post(r5).addBodyParameter(r9).setTag(r5).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{ExtraPackageData[].class}), new DeviceInfoChecker$getLanguageList$$inlined$post$default$2(r6));
    }

    public final void X0O() {
        BleCache r2 = BleCache.INSTANCE;
        if (r2.getMBleAddress().length() != 0) goto L6;
        i1O0OXO1O.OXO1.OXO1("getSparkAuthorize spark/exist BleCache.mBleAddress.isEmpty() return false");
        AISparkChainManager.OXO1.X00XIX1(false);
        return;
    L6:
        a01 r3 = a01.OXO1;
        if (Intrinsics.XOO0ii0(r3.XIi00iiXO().getString(b01.i0X1iIO + oe5.IXO0OOi(r2.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null), ""), oe5.IXO0OOi(r2.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null)) == false) goto L10;
        i1O0OXO1O.OXO1.OXO1("getSparkAuthorize spark/exist mBleAddress = " + r3.XIi00iiXO().getString(b01.i0X1iIO + oe5.IXO0OOi(r2.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null), "") + " return true");
        AISparkChainManager.OXO1.X00XIX1(true);
        return;
    L10:
        NetWorkUtils r4 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r5 = RequestBodyKt.getSparkAuthorizeBody();
        final O1XIiIO<Boolean> r6 = new DeviceInfoChecker$getDeviceIsSparkAuthorize$1();
        Map<String, String> r7 = r4.getHeadersMap();
        final Activity r8 = null;
        final uq r9 = r4.loadPopup(null, null);
        String r10 = r4.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetSparkAuthorize.URL);
        String r11 = r10 + GetSparkAuthorize.URL;
        Map<String, ? extends Object> r12 = kotlin.collections.OXO1.X111IO(r5);
        r12.putAll(r7);
        Unit r13 = Unit.OXO1;
        r4.printParam(r11, r12);
        NetWork r14 = NetWork.OXO1;
        String r15 = r10 + GetSparkAuthorize.URL;
        final O1XIiIO<Response<Boolean>> r16 = new DeviceInfoChecker$getDeviceIsSparkAuthorize$$inlined$postV2$default$1(r8, r6, r9);
        AndroidNetworking.post(r15).addHeaders(r7).addBodyParameter(r5).setTag(r15).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{Boolean.class}), new DeviceInfoChecker$getDeviceIsSparkAuthorize$$inlined$postV2$default$2(r16));
    }

    public final void X1ii(@aa1 final String r11, @aa1 final String r12) {
        Intrinsics.X0O(r11, "bleName");
        Intrinsics.X0O(r12, "firmwareFlag");
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        final Activity r2 = null;
        HashMap r3 = RequestBodyKt.getDeviceInfoBody$default(null, r11, r12, 1, null);
        final O1XIiIO<DeviceConfigInfo> r4 = new DeviceInfoChecker$getDeviceInfo$1(r11, r12);
        Map<String, String> r13 = r0.getHeadersMap();
        final uq r14 = r0.loadPopup(null, null);
        String r5 = r0.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetDeviceInfo.URL);
        String r7 = r5 + GetDeviceInfo.URL;
        Map<String, ? extends Object> r8 = kotlin.collections.OXO1.X111IO(r3);
        r8.putAll(r13);
        Unit r9 = Unit.OXO1;
        r0.printParam(r7, r8);
        NetWork r1 = NetWork.OXO1;
        String r6 = r5 + GetDeviceInfo.URL;
        final O1XIiIO<Response<DeviceConfigInfo>> r10 = new DeviceInfoChecker$getDeviceInfo$$inlined$postV2$default$1(r2, r4, r14);
        AndroidNetworking.post(r6).addHeaders(r13).addBodyParameter(r3).setTag(r6).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{DeviceConfigInfo.class}), new DeviceInfoChecker$getDeviceInfo$$inlined$postV2$default$2(r10));
    }

    public final void XIi00iiXO(@aa1 final Function1<? super String, Unit> r8) {
        Intrinsics.X0O(r8, "action");
        if (i72.OXO1.O10IXXX0X() == true) goto L5;
        return;
    L5:
        if (BleConnector.INSTANCE.isBound() == false) goto L9;
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r1 = RequestBodyKt.getCheckAppFirmwareBody();
        final O1XIiIO<String> r2 = new DeviceInfoChecker$checkApp$1(r8);
        final Activity r9 = null;
        final uq r3 = r0.loadPopup(null, null);
        String r4 = r0.convertBaseUrl(Api.INSTANCE.getBASE_URL(), BleFirmwareCheck.URL);
        r0.printParam(r4 + BleFirmwareCheck.URL, r1);
        NetWork r5 = NetWork.OXO1;
        String r6 = r4 + BleFirmwareCheck.URL;
        final O1XIiIO<Response<String>> r7 = new DeviceInfoChecker$checkApp$$inlined$post$default$1(r9, r2, r3);
        AndroidNetworking.post(r6).addBodyParameter(r1).setTag(r6).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{String.class}), new DeviceInfoChecker$checkApp$$inlined$post$default$2(r7));
        return;
    }

    public final void XO0O10(@aa1 final Activity r7, boolean r8) {
        Intrinsics.X0O(r7, "activity");
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r1 = RequestBodyKt.getCheckExtraPackVersionBody();
        final DeviceInfoChecker$checkExtraPack$1 r2 = new DeviceInfoChecker$checkExtraPack$1(r8, r7);
        final uq r9 = r0.loadPopup(r7, null);
        String r3 = r0.convertBaseUrl(Api.INSTANCE.getBASE_URL(), ExtraPackVersionLatest.URL);
        r0.printParam(r3 + ExtraPackVersionLatest.URL, r1);
        NetWork r4 = NetWork.OXO1;
        String r5 = r3 + ExtraPackVersionLatest.URL;
        final O1XIiIO<Response<ExtraPackVersions>> r6 = new DeviceInfoChecker$checkExtraPack$$inlined$post$default$1(r7, r2, r9);
        AndroidNetworking.post(r5).addBodyParameter(r1).setTag(r5).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{ExtraPackVersions.class}), new DeviceInfoChecker$checkExtraPack$$inlined$post$default$2(r6));
    }

    public final void XOO0ii0(@aa1 final O0Oiii<FirmwareVersion> r8, @aa1 String r9) {
        Intrinsics.X0O(r8, "callback");
        Intrinsics.X0O(r9, "valid");
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        HashMap r10 = RequestBodyKt.getCheckFirmwareVersionBody$default(null, r9, null, null, 12, null);
        final O1XIiIO<FirmwareVersion> r1 = new DeviceInfoChecker$checkFirmwareVersion$1(r8);
        final Activity r11 = null;
        final uq r2 = r0.loadPopup(null, null);
        String r3 = r0.convertBaseUrl(Api.INSTANCE.getBASE_URL(), FirmwareVersionLatest.URL);
        r0.printParam(r3 + FirmwareVersionLatest.URL, r10);
        NetWork r4 = NetWork.OXO1;
        String r5 = r3 + FirmwareVersionLatest.URL;
        final O1XIiIO<Response<FirmwareVersion>> r6 = new DeviceInfoChecker$checkFirmwareVersion$$inlined$post$default$1(r11, r1, r2);
        AndroidNetworking.post(r5).addBodyParameter(r10).setTag(r5).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{FirmwareVersion.class}), new DeviceInfoChecker$checkFirmwareVersion$$inlined$post$default$2(r6));
    }

    public final void XXI() {
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r1 = RequestBodyKt.getAppConfigInfoBody();
        final O1XIiIO<AppConfigInfo> r2 = new DeviceInfoChecker$getAppConfigInfo$1();
        Map<String, String> r3 = r0.getHeadersMap();
        final Activity r4 = null;
        final uq r5 = r0.loadPopup(null, null);
        String r6 = r0.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetAppConfigInfo.URL);
        String r8 = r6 + GetAppConfigInfo.URL;
        Map<String, ? extends Object> r9 = kotlin.collections.OXO1.X111IO(r1);
        r9.putAll(r3);
        Unit r10 = Unit.OXO1;
        r0.printParam(r8, r9);
        NetWork r7 = NetWork.OXO1;
        String r11 = r6 + GetAppConfigInfo.URL;
        final O1XIiIO<Response<AppConfigInfo>> r12 = new DeviceInfoChecker$getAppConfigInfo$$inlined$postV2$default$1(r4, r2, r5);
        AndroidNetworking.post(r11).addHeaders(r3).addBodyParameter(r1).setTag(r11).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{AppConfigInfo.class}), new DeviceInfoChecker$getAppConfigInfo$$inlined$postV2$default$2(r12));
    }

    public final void XiOIO(@aa1 final String r6, final int r7, @aa1 final String r8) {
        Intrinsics.X0O(r6, "uuid");
        Intrinsics.X0O(r8, GetGomoreAuthKey.CLIENT_ID);
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r1 = RequestBodyKt.getGomoreAuthKeyBody(r6, r7, r8);
        final O1XIiIO<JsonObject> r2 = new DeviceInfoChecker$getGoMoreAuthKey$1(r6, r7, r8);
        final Activity r9 = null;
        final uq r10 = r0.loadPopup(null, null);
        String r11 = r0.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetGomoreAuthKey.URL);
        r0.printParam(r11 + GetGomoreAuthKey.URL, r1);
        NetWork r3 = NetWork.OXO1;
        String r12 = r11 + GetGomoreAuthKey.URL;
        final O1XIiIO<Response<JsonObject>> r4 = new DeviceInfoChecker$getGoMoreAuthKey$$inlined$post$default$1(r9, r2, r10);
        AndroidNetworking.post(r12).addBodyParameter(r1).setTag(r12).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{JsonObject.class}), new DeviceInfoChecker$getGoMoreAuthKey$$inlined$post$default$2(r4));
    }

    public final void i010I(@aa1 Activity r3, @tb1 FirmwareVersion r4) {
        Intrinsics.X0O(r3, "activity");
        String r0 = BleCache.INSTANCE.getMPlatform();
        switch(r0.hashCode()) {
            case -1955887059: goto L42;
            case -1549651556: goto L34;
            case 2370: goto L22;
            case 65152: goto L17;
            case 70659068: goto L14;
            case 1697379018: goto L11;
            case 2138586828: goto L6;
            default: goto L47;
        };
    L47:
        return;
    L6:
        if (r0.equals(BleDeviceInfo.PLATFORM_GOODIX) == false) goto L48;
        r3.startActivity(new Intent(r3, FirmwareUpgradeGQActivity.class));
        return;
    L48:
        return;
    L11:
        if (r0.equals(BleDeviceInfo.PLATFORM_JL707LITE) == false) goto L49;
    L24:
        if (r4 == null) goto L26;
        String r5 = r4.getFileUrl2();
    L28:
        if (TextUtils.isEmpty(r5) == false) goto L31;
        r3.startActivity(new Intent(r3, FirmwareUpgradeJSmaActivity.class));
        return;
    L31:
        r3.startActivity(new Intent(r3, FirmwareUpgradeJSma2Activity.class));
        return;
    L26:
        r5 = null;
        goto L28
    L49:
        return;
    L14:
        if (r0.equals(BleDeviceInfo.PLATFORM_JL707) == true) goto L24;
        return;
    L17:
        if (r0.equals(BleDeviceInfo.PLATFORM_ATS) == false) goto L51;
        r3.startActivity(new Intent(r3, FirmwareUpgradeATSActivity.class));
        return;
    L51:
        return;
    L22:
        if (r0.equals(BleDeviceInfo.PLATFORM_JL) == true) goto L24;
        return;
    L34:
        if (r0.equals(BleDeviceInfo.PLATFORM_REALTEK) == true) goto L36;
        return;
    L36:
        if (q62.OXO1.iXi() == false) goto L39;
        r3.startActivity(new Intent(r3, FirmwareUpgradeRSmaActivity.class));
        return;
    L39:
        r3.startActivity(new Intent(r3, FirmwareUpgradeRActivity.class));
        return;
    L42:
        if (r0.equals(BleDeviceInfo.PLATFORM_NORDIC) == false) goto L46;
        r3.startActivity(new Intent(r3, FirmwareUpgradeNSmaActivity.class));
        return;
    }

    public final void iI(@aa1 Activity r2, @aa1 String r3) {
        Intrinsics.X0O(r2, "activity");
        Intrinsics.X0O(r3, "valid");
        OX(new XIi00iiXO(r2), r3);
    }

    public final void iIiiO(@aa1 final String r10, @tb1 final Function1<? super Boolean, Unit> r11) {
        Intrinsics.X0O(r10, "key");
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r1 = RequestBodyKt.getExternalKeyBody(r10);
        final O1XIiIO<ExternalKeyManager> r2 = new DeviceInfoChecker$getKeyVault$1(r10, r11);
        Map<String, String> r12 = r0.getHeadersMap();
        final Activity r13 = null;
        final uq r3 = r0.loadPopup(null, null);
        String r4 = r0.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetExternalKey.URL);
        String r6 = r4 + GetExternalKey.URL;
        Map<String, ? extends Object> r7 = kotlin.collections.OXO1.X111IO(r1);
        r7.putAll(r12);
        Unit r8 = Unit.OXO1;
        r0.printParam(r6, r7);
        NetWork r5 = NetWork.OXO1;
        String r9 = r4 + GetExternalKey.URL;
        final O1XIiIO<Response<ExternalKeyManager>> r14 = new DeviceInfoChecker$getKeyVault$$inlined$postV2$default$1(r13, r2, r3);
        AndroidNetworking.post(r9).addHeaders(r12).addBodyParameter(r1).setTag(r9).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{ExternalKeyManager.class}), new DeviceInfoChecker$getKeyVault$$inlined$postV2$default$2(r14));
    }

    public final void iO(@aa1 final Function1<? super AppVersion, Unit> r8) {
        Intrinsics.X0O(r8, "action");
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r1 = RequestBodyKt.getCheckAppVersionBody();
        final O1XIiIO<AppVersion> r2 = new DeviceInfoChecker$checkAppVersion$1(r8);
        final Activity r9 = null;
        final uq r3 = r0.loadPopup(null, null);
        String r4 = r0.convertBaseUrl(Api.INSTANCE.getBASE_URL(), AppVersionLatest.URL);
        r0.printParam(r4 + AppVersionLatest.URL, r1);
        NetWork r5 = NetWork.OXO1;
        String r6 = r4 + AppVersionLatest.URL;
        final O1XIiIO<Response<AppVersion>> r7 = new DeviceInfoChecker$checkAppVersion$$inlined$post$default$1(r9, r2, r3);
        AndroidNetworking.post(r6).addBodyParameter(r1).setTag(r6).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{AppVersion.class}), new DeviceInfoChecker$checkAppVersion$$inlined$post$default$2(r7));
    }

    public final void iOOX010X() {
        String r1 = UtilsKt.XiOIii1(ExternalKeyManager.SPEECH_KEY);
        if (r1.length() <= 0) goto L6;
        i1O0OXO1O.OXO1.OXO1("initMicrosoftSDK cache");
        MicrosoftSDKManage.O1O.OXO1().iI0I(r1);
        return;
    L6:
        i1O0OXO1O.OXO1.OXO1("initMicrosoftSDK NetWork");
        iIiiO(ExternalKeyManager.SPEECH_KEY, new X10iI1OX());
    }
}
