package com.sma.smartv3.network;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.autofill.HintConstants;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.nx1;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.Utils;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.facebook.internal.security.CertificateUtil;
import com.google.gson.Gson;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.BGEMUser;
import com.sma.smartv3.model.ExternalKeyManager;
import com.sma.smartv3.model.FirmwareVersion;
import com.sma.smartv3.model.JobV2Extra;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.entity.BleLanguagePackVersion;
import java.util.HashMap;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nRequestBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestBody.kt\ncom/sma/smartv3/network/RequestBodyKt\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,1078:1\n15#2:1079\n*S KotlinDebug\n*F\n+ 1 RequestBody.kt\ncom/sma/smartv3/network/RequestBodyKt\n*L\n212#1:1079\n*E\n"})
public final class RequestBodyKt {

    @aa1
    public static final String PROJECT_ID = "58";

    @aa1
    public static final HashMap<String, String> aigcCreateJobBody(@aa1 String r5, @aa1 String r6, int r7) {
        Intrinsics.X0O(r5, "query");
        Intrinsics.X0O(r6, "style");
        HashMap<String, String> r2 = new HashMap();
        r2.put("projectId", PROJECT_ID);
        r2.put("query", r5);
        r2.put("bleName", BleCache.INSTANCE.getMBleName());
        r2.put("style", r6);
        r2.put("imageCount", String.valueOf(r7));
        return r2;
    }

    @aa1
    public static final HashMap<String, Object> aigcCreateJobBodyV2(@aa1 String r5, @aa1 String r6, @aa1 JobV2Extra r7) {
        Intrinsics.X0O(r5, "query");
        Intrinsics.X0O(r6, "model");
        Intrinsics.X0O(r7, AICreateJobV2.AI_EXTRA);
        HashMap<String, Object> r2 = new HashMap();
        r2.put("projectId", PROJECT_ID);
        r2.put("text", r5);
        r2.put(AICreateJobV2.AI_EXTRA, r7);
        r2.put("model", r6);
        r2.put(AICreateJobV2.AI_Stream, Boolean.TRUE);
        return r2;
    }

    @aa1
    public static final HashMap<String, String> aigcFindJobBody(@aa1 String r4) {
        Intrinsics.X0O(r4, "jobId");
        HashMap<String, String> r1 = new HashMap();
        r1.put("projectId", PROJECT_ID);
        r1.put("jobId", r4);
        r1.put("bleName", BleCache.INSTANCE.getMBleName());
        return r1;
    }

    @aa1
    public static final HashMap<String, String> deleteAccountOrderBody(@aa1 String r3, @aa1 String r4) {
        Intrinsics.X0O(r3, "identity");
        Intrinsics.X0O(r4, "orderNum");
        HashMap<String, String> r2 = new HashMap();
        r2.put("identity", r3);
        r2.put("orderNum", r4);
        return r2;
    }

    @aa1
    public static final HashMap<String, String> getAccountDetails(@aa1 String r2, int r3) {
        Intrinsics.X0O(r2, "identity");
        HashMap<String, String> r1 = new HashMap();
        r1.put("identity", r2);
        r1.put("pageNum", String.valueOf(r3));
        r1.put("pageSize", StatisticData.ERROR_CODE_NOT_FOUND);
        return r1;
    }

    @aa1
    public static final HashMap<String, String> getAccountOrderSelectList(@aa1 String r3, @aa1 String r4, int r5) {
        Intrinsics.X0O(r3, "identity");
        Intrinsics.X0O(r4, "orderType");
        HashMap<String, String> r2 = new HashMap();
        r2.put("identity", r3);
        r2.put("orderType", r4);
        r2.put("pageNum", String.valueOf(r5));
        r2.put("pageSize", StatisticData.ERROR_CODE_NOT_FOUND);
        return r2;
    }

    @aa1
    public static final HashMap<String, String> getAddUserWatchDownloadRecordBody(@aa1 String r3, @aa1 String r4) {
        Intrinsics.X0O(r3, "identity");
        Intrinsics.X0O(r4, "wid");
        HashMap<String, String> r2 = new HashMap();
        r2.put("identity", r3);
        r2.put("wid", r4);
        return r2;
    }

    @aa1
    public static final HashMap<String, String> getAppConfigInfoBody() {
        HashMap<String, String> r0 = new HashMap();
        r0.put("projectId", PROJECT_ID);
        return r0;
    }

    @aa1
    public static final HashMap<String, String> getAppDeductionConfigBody() {
        HashMap<String, String> r0 = new HashMap();
        r0.put("projectId", PROJECT_ID);
        return r0;
    }

    @aa1
    public static final HashMap<String, String> getAppStoreFileListBody(@aa1 String r5) {
        Intrinsics.X0O(r5, AppStoreFileListSearch.APP_MODULE_ID);
        HashMap<String, String> r1 = new HashMap();
        BleCache r2 = BleCache.INSTANCE;
        r1.put("bleName", r2.getMBleName());
        r1.put("flag", r2.getMFirmwareFlag());
        r1.put(AppStoreFileListSearch.APP_MODULE_ID, r5);
        return r1;
    }

    @aa1
    public static final HashMap<String, String> getBGEMUserBody(@aa1 BGEMUser r3) {
        Intrinsics.X0O(r3, "user");
        HashMap<String, String> r0 = new HashMap();
        r0.put("age", String.valueOf(r3.getAge()));
        r0.put("gender", r3.getGender().toString());
        r0.put("weight", String.valueOf(r3.getWeight()));
        r0.put("height", String.valueOf(r3.getHeight()));
        r0.put("family_history", String.valueOf(r3.getFamily_history()));
        r0.put("high_cholesterol", String.valueOf(r3.getHigh_cholesterol()));
        return r0;
    }

    @aa1
    public static final HashMap<String, String> getBleFirmwareAllListBody(@aa1 String r2) {
        Intrinsics.X0O(r2, "filter");
        HashMap<String, String> r1 = new HashMap();
        r1.put("filter", r2);
        r1.put("page", "1");
        r1.put("limit", "200");
        return r1;
    }

    @aa1
    public static final HashMap<String, String> getBleFirmwareVersionListBody(@aa1 String r2) {
        Intrinsics.X0O(r2, "firmwareId");
        HashMap<String, String> r1 = new HashMap();
        r1.put("firmwareId", r2);
        r1.put("page", "1");
        r1.put("limit", "200");
        return r1;
    }

    @aa1
    public static final HashMap<String, String> getCallTranslationUrlBody(@aa1 String r5, @aa1 String r6, @aa1 String r7, @aa1 String r8) {
        Intrinsics.X0O(r5, "userId");
        Intrinsics.X0O(r6, "language");
        Intrinsics.X0O(r7, GetCallTranslationUrl.TARGET_LANGUAGE);
        Intrinsics.X0O(r8, "type");
        HashMap<String, String> r3 = new HashMap();
        r3.put("uid", r5);
        r3.put("language", r6);
        r3.put(GetCallTranslationUrl.TARGET_LANGUAGE, r7);
        r3.put("type", r8);
        return r3;
    }

    @aa1
    public static final HashMap<String, String> getCallTranslationUrlBodyWithBleInfo(@aa1 String r5, @aa1 String r6, @aa1 String r7, @aa1 String r8, @aa1 String r9) {
        Intrinsics.X0O(r5, "userId");
        Intrinsics.X0O(r6, "language");
        Intrinsics.X0O(r7, GetCallTranslationUrl.TARGET_LANGUAGE);
        Intrinsics.X0O(r8, "type");
        Intrinsics.X0O(r9, "bleInfo");
        HashMap<String, String> r3 = new HashMap();
        r3.put("uid", r5);
        r3.put("language", r6);
        r3.put(GetCallTranslationUrl.TARGET_LANGUAGE, r7);
        r3.put("type", r8);
        r3.put("BleInfo", r9);
        return r3;
    }

    @aa1
    public static final HashMap<String, String> getChangeDeviceStateBody(int r10) {
        HashMap<String, String> r0 = new HashMap();
        BleCache r1 = BleCache.INSTANCE;
        r0.put("bleName", r1.getMBleName());
        r0.put("flag", r1.getMFirmwareFlag());
        r0.put("macAddress", oe5.IXO0OOi(r1.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null));
        r0.put("state", String.valueOf(r10));
        return r0;
    }

    @aa1
    public static final HashMap<String, String> getCheckAppFirmwareBody() {
        HashMap<String, String> r0 = new HashMap();
        BleCache r1 = BleCache.INSTANCE;
        r0.put("bleName", r1.getMBleName());
        r0.put("flag", r1.getMFirmwareFlag());
        r0.put("projectId", PROJECT_ID);
        r0.put("platform", "Android");
        r0.put("version", AppUtils.getAppVersionName());
        return r0;
    }

    @aa1
    public static final HashMap<String, String> getCheckAppVersionBody() {
        HashMap<String, String> r0 = new HashMap();
        r0.put("appName", AppUtils.getAppName());
        r0.put("platform", "Android");
        r0.put("version", AppUtils.getAppVersionName());
        r0.put("projectId", PROJECT_ID);
        return r0;
    }

    @aa1
    public static final HashMap<String, String> getCheckExtraPackVersionBody() {
        FirmwareVersion r0 = (FirmwareVersion) new Gson().fromJson(a01.OXO1.XIi00iiXO().getString(FirmwareVersion.class.getName()), FirmwareVersion.class);
        String r1 = null;
        if (r0 == null) goto L5;
        String r2 = r0.getVersion2();
    L7:
        if (TextUtils.isEmpty(r2) == false) goto L10;
        if (r0 == null) goto L12;
        r1 = r0.getVersion();
    L12:
        HashMap<String, String> r3 = new HashMap();
        BleCache r4 = BleCache.INSTANCE;
        r3.put("bleName", r4.getMBleName());
        r3.put("flag", r4.getMFirmwareFlag());
        if (r1 != null) goto L15;
        r1 = BaseBleCache.getString$default(r4, BleKey.FIRMWARE_VERSION, null, null, 6, null);
    L15:
        r3.put("firmwareVersion", r1);
        r3.put("uiPackVersion", BaseBleCache.getString$default(r4, BleKey.UI_PACK_VERSION, "0.0.0", null, 4, null));
        BleLanguagePackVersion r5 = (BleLanguagePackVersion) BaseBleCache.getObjectNotNull$default(r4, BleKey.LANGUAGE_PACK_VERSION, BleLanguagePackVersion.class, null, null, 12, null);
        r3.put("languagePackVersion", r5.getMVersion());
        r3.put("languageCode", String.valueOf(r5.getMLanguageCode()));
        r3.put("gpsPackVersion", BaseBleCache.getString$default(r4, BleKey.GPS_FIRMWARE_VERSION, "0.0.0", null, 4, null));
        r3.put("networkPackVersion", BaseBleCache.getString$default(r4, BleKey.NETWORK_FIRMWARE_VERSION, "0.0.0", null, 4, null));
        return r3;
    L10:
        if (r0 == null) goto L12;
        r1 = r0.getVersion2();
        goto L12
    L5:
        r2 = null;
        goto L7
    }

    @aa1
    public static final HashMap<String, String> getCheckFirmwareVersionBody(@tb1 String r11, @aa1 String r12, @aa1 String r13, @aa1 String r14) {
        Intrinsics.X0O(r12, "valid");
        Intrinsics.X0O(r13, "bleName");
        Intrinsics.X0O(r14, "flag");
        HashMap<String, String> r3 = new HashMap();
        r3.put("bleName", r13);
        r3.put("flag", r14);
        if (r11 != null) goto L5;
        r11 = BaseBleCache.getString$default(BleCache.INSTANCE, BleKey.FIRMWARE_VERSION, null, null, 6, null);
    L5:
        r3.put("version", r11);
        r3.put("androidVersion", AppUtils.getAppVersionName());
        r3.put("appPlatform", "0");
        BleCache r4 = BleCache.INSTANCE;
        r3.put("macAddress", oe5.IXO0OOi(r4.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null));
        r3.put("projectId", PROJECT_ID);
        r3.put("uiPackVersion", BaseBleCache.getString$default(r4, BleKey.UI_PACK_VERSION, "0.0.0", null, 4, null));
        r3.put("valid", r12);
        return r3;
    }

    public static /* synthetic */ HashMap getCheckFirmwareVersionBody$default(String r0, String r1, String r2, String r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r1 = Api.Y;
    L6:
        if ((r4 & 4) == 0) goto L9;
        r2 = BleCache.INSTANCE.getMBleName();
    L9:
        if ((r4 & 8) == 0) goto L12;
        r3 = BleCache.INSTANCE.getMFirmwareFlag();
    L12:
        return getCheckFirmwareVersionBody(r0, r1, r2, r3);
    }

    @aa1
    public static final HashMap<String, String> getCheckNoteFirmwareVersionBody(@tb1 String r5, @aa1 String r6, @aa1 String r7, @aa1 String r8, @aa1 String r9, @aa1 String r10) {
        Intrinsics.X0O(r6, "valid");
        Intrinsics.X0O(r7, "bleName");
        Intrinsics.X0O(r8, "flag");
        Intrinsics.X0O(r9, "curVersion");
        Intrinsics.X0O(r10, "mac");
        LogUtils.i(new Object[]{"get= version:" + r5 + " bleName" + r7 + " flag" + r8 + " curVersion" + r9 + " mac" + r10 + "  "});
        HashMap<String, String> r3 = new HashMap();
        r3.put("bleName", getName(r7));
        r3.put("flag", r8);
        if (r5 != null) goto L5;
        r5 = r9;
    L5:
        r3.put("version", r5);
        r3.put("androidVersion", AppUtils.getAppVersionName());
        r3.put("appPlatform", "0");
        r3.put("macAddress", r10);
        r3.put("projectId", PROJECT_ID);
        r3.put("valid", r6);
        return r3;
    }

    public static /* synthetic */ HashMap getCheckNoteFirmwareVersionBody$default(String r1, String r2, String r3, String r4, String r5, String r6, int r7, Object r8) {
        if ((r7 & 2) == 0) goto L6;
        r2 = Api.Y;
    L6:
        if ((r7 & 4) == 0) goto L9;
        r3 = "";
    L9:
        if ((r7 & 8) == 0) goto L12;
        r4 = "0";
    L12:
        if ((r7 & 16) == 0) goto L15;
        r5 = "";
    L15:
        if ((r7 & 32) == 0) goto L17;
        String r9 = "";
    L19:
        return getCheckNoteFirmwareVersionBody(r1, r2, r3, r4, r5, r9);
    L17:
        r9 = r6;
        goto L19
    }

    @aa1
    public static final HashMap<String, String> getCheckOrderBody(@aa1 String r6, @aa1 String r7, @aa1 String r8, @aa1 String r9, @aa1 String r10) {
        Intrinsics.X0O(r6, "packageName");
        Intrinsics.X0O(r7, GetGooglePayCheckOrder.APPLICATION_NAME);
        Intrinsics.X0O(r8, "productId");
        Intrinsics.X0O(r9, "purchaseToken");
        Intrinsics.X0O(r10, "orderNum");
        HashMap<String, String> r5 = new HashMap();
        r5.put("packageName", r6);
        r5.put(GetGooglePayCheckOrder.APPLICATION_NAME, r7);
        r5.put("productId", r8);
        r5.put("purchaseToken", r9);
        r5.put("orderNum", r10);
        return r5;
    }

    @aa1
    public static final HashMap<String, String> getChoicenessSearchListBody(@aa1 String r2) {
        Intrinsics.X0O(r2, "type");
        HashMap<String, String> r0 = new HashMap();
        r0.put("recommendType", r2);
        return r0;
    }

    @aa1
    public static final HashMap<String, String> getCourSelectByTypeBody(@aa1 String r2) {
        Intrinsics.X0O(r2, "type");
        HashMap<String, String> r1 = new HashMap();
        r1.put("type", r2);
        return r1;
    }

    public static /* synthetic */ HashMap getCourSelectByTypeBody$default(String r0, int r1, Object r2) {
        if ((r1 & 1) == 0) goto L6;
        r0 = GetCourSelectByType.COURSE_DIFF;
    L6:
        return getCourSelectByTypeBody(r0);
    }

    @aa1
    public static final HashMap<String, String> getCourseBody(@tb1 String r1, @tb1 String r2, @tb1 String r3, @tb1 String r4) {
        HashMap<String, String> r5 = new HashMap();
        if (r1 != null) goto L5;
    L8:
        if (r2 != null) goto L10;
    L13:
        if (r3 != null) goto L15;
    L18:
        return r5;
    L15:
        if (r3.length() == 0) goto L18;
        r5.put(GetCourseList.COURSE_PART, r3);
        goto L18
    L10:
        if (r2.length() == 0) goto L13;
        r5.put(GetCourseList.COURSE_DIFF, r2);
        goto L13
    L5:
        if (r1.length() == 0) goto L8;
        r5.put(GetCourseList.COURSE_TYPE, r1);
        goto L8
    }

    public static /* synthetic */ HashMap getCourseBody$default(String r1, String r2, String r3, String r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = null;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = null;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = null;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = null;
    L15:
        return getCourseBody(r1, r2, r3, r4);
    }

    @aa1
    public static final HashMap<String, String> getCourseCollectBody(@aa1 String r4, @aa1 String r5, @aa1 String r6) {
        Intrinsics.X0O(r4, "cid");
        Intrinsics.X0O(r5, "uid");
        Intrinsics.X0O(r6, CourseCollect.COLLECT_FLAG);
        HashMap<String, String> r3 = new HashMap();
        r3.put("cid", r4);
        r3.put("uid", r5);
        r3.put(CourseCollect.COLLECT_FLAG, r6);
        return r3;
    }

    @aa1
    public static final HashMap<String, String> getCourseCollectList(@aa1 String r2) {
        Intrinsics.X0O(r2, "uid");
        HashMap<String, String> r1 = new HashMap();
        r1.put("uid", r2);
        return r1;
    }

    @aa1
    public static final HashMap<String, String> getCourseDetailsBody(@aa1 String r3, @aa1 String r4) {
        Intrinsics.X0O(r3, "id");
        Intrinsics.X0O(r4, "uid");
        HashMap<String, String> r2 = new HashMap();
        r2.put("id", r3);
        r2.put("uid", r4);
        return r2;
    }

    public static /* synthetic */ HashMap getCourseDetailsBody$default(String r0, String r1, int r2, Object r3) {
        if ((r2 & 2) == 0) goto L6;
        r1 = "";
    L6:
        return getCourseDetailsBody(r0, r1);
    }

    @aa1
    public static final HashMap<String, String> getCourseTypeListBody(@aa1 String r1) {
        Intrinsics.X0O(r1, "type");
        return new HashMap();
    }

    public static /* synthetic */ HashMap getCourseTypeListBody$default(String r0, int r1, Object r2) {
        if ((r1 & 1) == 0) goto L6;
        r0 = "course_type";
    L6:
        return getCourseTypeListBody(r0);
    }

    @aa1
    public static final HashMap<String, String> getCreateOrder(@aa1 String r5, @aa1 String r6, @aa1 String r7, @aa1 String r8) {
        Intrinsics.X0O(r5, "identity");
        Intrinsics.X0O(r6, "orderType");
        Intrinsics.X0O(r7, "eleId");
        Intrinsics.X0O(r8, "internalFlag");
        HashMap<String, String> r4 = new HashMap();
        r4.put("identity", r5);
        r4.put("orderType", r6);
        r4.put("eleId", r7);
        r4.put("projectId", PROJECT_ID);
        r4.put("internalFlag", r8);
        return r4;
    }

    public static /* synthetic */ HashMap getCreateOrder$default(String r0, String r1, String r2, String r3, int r4, Object r5) {
        if ((r4 & 8) == 0) goto L9;
        if (i72.OXO1.OX() == false) goto L7;
        r3 = "1";
        goto L9
    L7:
        r3 = "0";
    L9:
        return getCreateOrder(r0, r1, r2, r3);
    }

    @aa1
    public static final HashMap<String, String> getDcsTokenBody() {
        HashMap<String, String> r0 = new HashMap();
        r0.put("appVersion", AppUtils.getAppVersionName());
        BleCache r3 = BleCache.INSTANCE;
        r0.put(GetDcsToken.FIRMWARE_VERSION, BaseBleCache.getString$default(r3, BleKey.FIRMWARE_VERSION, null, null, 6, null));
        r0.put("projectId", PROJECT_ID);
        r0.put("bleName", r3.getMBleName());
        r0.put("flag", r3.getMFirmwareFlag());
        r0.put("macAddress", oe5.IXO0OOi(r3.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null));
        return r0;
    }

    @aa1
    public static final HashMap<String, String> getDeleteAppUserBody(@aa1 String r2) {
        Intrinsics.X0O(r2, "id");
        HashMap<String, String> r0 = new HashMap();
        r0.put("identity", r2);
        return r0;
    }

    @aa1
    public static final HashMap<String, String> getDeviceInfoBody(@aa1 String r2, @aa1 String r3, @aa1 String r4) {
        Intrinsics.X0O(r2, "projectId");
        Intrinsics.X0O(r3, "mBleName");
        Intrinsics.X0O(r4, "mFirmwareFlag");
        HashMap<String, String> r1 = new HashMap();
        r1.put("projectId", r2);
        r1.put("bleName", r3);
        r1.put("flag", r4);
        return r1;
    }

    public static /* synthetic */ HashMap getDeviceInfoBody$default(String r0, String r1, String r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r0 = String.valueOf(i72.OXO1.XX0());
    L6:
        if ((r3 & 2) == 0) goto L9;
        r1 = BleCache.INSTANCE.getMBleName();
    L9:
        if ((r3 & 4) == 0) goto L12;
        r2 = BleCache.INSTANCE.getMFirmwareFlag();
    L12:
        return getDeviceInfoBody(r0, r1, r2);
    }

    @aa1
    public static final HashMap<String, String> getDeviceListBody(@aa1 String r2) {
        Intrinsics.X0O(r2, "projectId");
        HashMap<String, String> r1 = new HashMap();
        r1.put("projectId", r2);
        return r1;
    }

    public static /* synthetic */ HashMap getDeviceListBody$default(String r0, int r1, Object r2) {
        if ((r1 & 1) == 0) goto L6;
        r0 = String.valueOf(i72.OXO1.XX0());
    L6:
        return getDeviceListBody(r0);
    }

    @aa1
    public static final HashMap<String, String> getDeviceListObjectBody(@aa1 String r2) {
        Intrinsics.X0O(r2, "projectId");
        HashMap<String, String> r1 = new HashMap();
        r1.put("projectId", r2);
        return r1;
    }

    public static /* synthetic */ HashMap getDeviceListObjectBody$default(String r0, int r1, Object r2) {
        if ((r1 & 1) == 0) goto L6;
        r0 = String.valueOf(i72.OXO1.XX0());
    L6:
        return getDeviceListObjectBody(r0);
    }

    @aa1
    public static final HashMap<String, String> getDeviceStateBody() {
        HashMap<String, String> r0 = new HashMap();
        BleCache r1 = BleCache.INSTANCE;
        r0.put("bleName", r1.getMBleName());
        r0.put("flag", r1.getMFirmwareFlag());
        r0.put("macAddress", oe5.IXO0OOi(r1.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null));
        r0.put("version", BaseBleCache.getString$default(r1, BleKey.FIRMWARE_VERSION, null, null, 6, null));
        r0.put("androidVersion", AppUtils.getAppVersionName());
        return r0;
    }

    @aa1
    public static final HashMap<String, String> getExternalKeyBody(@aa1 String r2) {
        Intrinsics.X0O(r2, "key");
        HashMap<String, String> r1 = new HashMap();
        r1.put("key", r2);
        return r1;
    }

    public static /* synthetic */ HashMap getExternalKeyBody$default(String r0, int r1, Object r2) {
        if ((r1 & 1) == 0) goto L6;
        r0 = ExternalKeyManager.SPEECH_KEY;
    L6:
        return getExternalKeyBody(r0);
    }

    @aa1
    public static final HashMap<String, String> getExtraPackVersionFontBody(@aa1 String r8) {
        Intrinsics.X0O(r8, "valid");
        HashMap<String, String> r1 = new HashMap();
        BleCache r2 = BleCache.INSTANCE;
        r1.put("bleName", r2.getMBleName());
        r1.put("flag", r2.getMFirmwareFlag());
        r1.put("firmwareVersion", BaseBleCache.getString$default(r2, BleKey.FIRMWARE_VERSION, null, null, 6, null));
        r1.put("valid", r8);
        return r1;
    }

    @aa1
    public static final HashMap<String, String> getExtraPackVersionGPSFirmwareBody(@tb1 String r11, @aa1 String r12) {
        Intrinsics.X0O(r12, "valid");
        HashMap<String, String> r1 = new HashMap();
        BleCache r2 = BleCache.INSTANCE;
        r1.put("bleName", r2.getMBleName());
        r1.put("flag", r2.getMFirmwareFlag());
        r1.put("firmwareVersion", BaseBleCache.getString$default(r2, BleKey.FIRMWARE_VERSION, null, null, 6, null));
        r1.put("appVersion", AppUtils.getAppVersionName());
        r1.put("appPlatform", "0");
        r1.put("mac", oe5.IXO0OOi(r2.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null));
        r1.put("pid", PROJECT_ID);
        if (r11 != null) goto L5;
        r11 = BaseBleCache.getString$default(r2, BleKey.GPS_FIRMWARE_VERSION, "0.0.0", null, 4, null);
    L5:
        r1.put(BleExtraPackVersionGPSFirmware.GPS_PACK_VERSION, r11);
        r1.put("valid", r12);
        return r1;
    }

    public static /* synthetic */ HashMap getExtraPackVersionGPSFirmwareBody$default(String r0, String r1, int r2, Object r3) {
        if ((r2 & 2) == 0) goto L6;
        r1 = Api.Y;
    L6:
        return getExtraPackVersionGPSFirmwareBody(r0, r1);
    }

    @aa1
    public static final HashMap<String, String> getExtraPackVersionLanguageBody(@aa1 String r8) {
        Intrinsics.X0O(r8, "valid");
        HashMap<String, String> r1 = new HashMap();
        BleCache r2 = BleCache.INSTANCE;
        r1.put("bleName", r2.getMBleName());
        r1.put("flag", r2.getMFirmwareFlag());
        r1.put("firmwareVersion", BaseBleCache.getString$default(r2, BleKey.FIRMWARE_VERSION, null, null, 6, null));
        r1.put("valid", r8);
        return r1;
    }

    @aa1
    public static final HashMap<String, String> getExtraPackVersionUIBody(@aa1 String r8) {
        Intrinsics.X0O(r8, "valid");
        HashMap<String, String> r1 = new HashMap();
        BleCache r2 = BleCache.INSTANCE;
        r1.put("bleName", r2.getMBleName());
        r1.put("flag", r2.getMFirmwareFlag());
        r1.put("firmwareVersion", BaseBleCache.getString$default(r2, BleKey.FIRMWARE_VERSION, null, null, 6, null));
        r1.put("valid", r8);
        return r1;
    }

    @aa1
    public static final HashMap<String, String> getFeedbackBody(@aa1 Context r9, @aa1 String r10, @aa1 String r11) {
        Intrinsics.X0O(r9, "context");
        Intrinsics.X0O(r10, "contactWay");
        Intrinsics.X0O(r11, "content");
        HashMap<String, String> r2 = new HashMap();
        r2.put("projectId", PROJECT_ID);
        r2.put("contactWay", r10);
        r2.put("content", r11);
        String r12 = r9.getString(R.string.app_name);
        String r13 = AppUtils.getAppVersionName();
        BleCache r3 = BleCache.INSTANCE;
        r2.put("extraInfo", r12 + I000IiI1O.iO.XO0O10 + r13 + I000IiI1O.iO.XO0O10 + r3.getMBleName() + I000IiI1O.iO.XO0O10 + r3.getMFirmwareFlag() + I000IiI1O.iO.XO0O10 + BaseBleCache.getString$default(r3, BleKey.FIRMWARE_VERSION, null, null, 6, null) + I000IiI1O.iO.XO0O10 + Locale.getDefault().getCountry() + I000IiI1O.iO.XO0O10 + Build.MANUFACTURER + I000IiI1O.iO.XO0O10 + Build.MODEL + I000IiI1O.iO.XO0O10 + Build.VERSION.RELEASE + I000IiI1O.iO.XO0O10 + Build.VERSION.SDK_INT);
        return r2;
    }

    @aa1
    public static final HashMap<String, String> getFreePointsBody(@aa1 String r2) {
        Intrinsics.X0O(r2, "identity");
        HashMap<String, String> r1 = new HashMap();
        r1.put("identity", r2);
        return r1;
    }

    @aa1
    public static final HashMap<String, String> getGomoreAuthKeyBody(@aa1 String r11, int r12, @aa1 String r13) {
        Intrinsics.X0O(r11, "uuid");
        Intrinsics.X0O(r13, GetGomoreAuthKey.CLIENT_ID);
        HashMap<String, String> r1 = new HashMap();
        BleCache r2 = BleCache.INSTANCE;
        r1.put("bleName", r2.getMBleName());
        r1.put("flag", r2.getMFirmwareFlag());
        r1.put("mac", oe5.IXO0OOi(r2.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null));
        r1.put(GetGomoreAuthKey.DEVICE_ID, r11);
        r1.put(GetGomoreAuthKey.TYPE, String.valueOf(r12));
        r1.put("platform", String.valueOf(UtilsKt.X1IX()));
        r1.put(GetGomoreAuthKey.CLIENT_ID, r13);
        return r1;
    }

    @aa1
    public static final HashMap<String, String> getInternalTeraBoxRefreshTokenBody(@aa1 String r2) {
        Intrinsics.X0O(r2, "token");
        HashMap<String, String> r1 = new HashMap();
        r1.put("token", r2);
        r1.put("projectId", PROJECT_ID);
        return r1;
    }

    @aa1
    public static final HashMap<String, String> getInternalTeraBoxTokenBody(@aa1 String r12, @aa1 String r13) {
        Intrinsics.X0O(r12, "code");
        Intrinsics.X0O(r13, "redirect_uri");
        HashMap<String, String> r2 = new HashMap();
        BleCache r3 = BleCache.INSTANCE;
        r2.put("bleName", r3.getMBleName());
        r2.put("flag", r3.getMFirmwareFlag());
        r2.put("mac", oe5.IXO0OOi(r3.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null));
        r2.put("projectId", PROJECT_ID);
        r2.put("code", r12);
        r2.put("redirect_uri", r13);
        return r2;
    }

    @aa1
    public static final HashMap<String, String> getLoginByCodeBody(@aa1 String r4, @aa1 String r5) {
        Intrinsics.X0O(r4, "email");
        Intrinsics.X0O(r5, "verificationCode");
        HashMap<String, String> r1 = new HashMap();
        r1.put("projectId", PROJECT_ID);
        r1.put("userName", r4);
        r1.put("verificationCode", r5);
        r1.put("country", Utils.getApp().getResources().getConfiguration().locale.getCountry());
        return r1;
    }

    @aa1
    public static final HashMap<String, String> getLoginByPasswordBody(@aa1 String r4, @aa1 String r5) {
        Intrinsics.X0O(r4, "email");
        Intrinsics.X0O(r5, "password");
        HashMap<String, String> r1 = new HashMap();
        r1.put("projectId", PROJECT_ID);
        r1.put("userName", r4);
        r1.put("password", r5);
        r1.put("country", Utils.getApp().getResources().getConfiguration().locale.getCountry());
        return r1;
    }

    private static final String getName(String r4) {
        if (StringsKt__StringsKt.iIi011O(r4, q62.O01OIO1i, false, 2, null) == false) goto L5;
        return q62.O01OIO1i;
    L5:
        return q62.O10O;
    }

    @aa1
    public static final HashMap<String, String> getNewDeviceListObjectBody(@aa1 String r2) {
        Intrinsics.X0O(r2, "projectId");
        HashMap<String, String> r1 = new HashMap();
        r1.put("projectId", r2);
        return r1;
    }

    public static /* synthetic */ HashMap getNewDeviceListObjectBody$default(String r0, int r1, Object r2) {
        if ((r1 & 1) == 0) goto L6;
        r0 = String.valueOf(i72.OXO1.OiIIX101O());
    L6:
        return getNewDeviceListObjectBody(r0);
    }

    @aa1
    public static final HashMap<String, Object> getOnLinWatchFace(@aa1 String r3, boolean r4) {
        Intrinsics.X0O(r3, "id");
        HashMap<String, Object> r0 = new HashMap();
        r0.put("identity", r3);
        BleCache r5 = BleCache.INSTANCE;
        r0.put("bleName", r5.getMBleName());
        r0.put("flag", r5.getMFirmwareFlag());
        r0.put("typeGroupFlag", Boolean.valueOf(r4));
        return r0;
    }

    public static /* synthetic */ HashMap getOnLinWatchFace$default(String r0, boolean r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r0 = i72.OXO1.O001I();
    L6:
        return getOnLinWatchFace(r0, r1);
    }

    @aa1
    public static final HashMap<String, Object> getOnLinWatchFaceMoveV2(@aa1 String r4, @aa1 String r5, int r6, int r7) {
        Intrinsics.X0O(r4, "id");
        Intrinsics.X0O(r5, "dialType");
        HashMap<String, Object> r1 = new HashMap();
        r1.put("identity", r4);
        BleCache r8 = BleCache.INSTANCE;
        r1.put("bleName", r8.getMBleName());
        r1.put("flag", r8.getMFirmwareFlag());
        r1.put("typeGroupFlag", Boolean.FALSE);
        r1.put("dialType", r5);
        r1.put("pageNum", Integer.valueOf(r6));
        r1.put("pageSize", Integer.valueOf(r7));
        return r1;
    }

    public static /* synthetic */ HashMap getOnLinWatchFaceMoveV2$default(String r0, String r1, int r2, int r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r0 = i72.OXO1.O001I();
    L6:
        if ((r4 & 4) == 0) goto L9;
        r2 = 1;
    L9:
        if ((r4 & 8) == 0) goto L12;
        r3 = 200;
    L12:
        return getOnLinWatchFaceMoveV2(r0, r1, r2, r3);
    }

    @aa1
    public static final HashMap<String, Object> getOnLinWatchFaceV2(@aa1 String r3, boolean r4) {
        Intrinsics.X0O(r3, "id");
        HashMap<String, Object> r0 = new HashMap();
        r0.put("identity", r3);
        BleCache r5 = BleCache.INSTANCE;
        r0.put("bleName", r5.getMBleName());
        r0.put("flag", r5.getMFirmwareFlag());
        r0.put("typeGroupFlag", Boolean.valueOf(r4));
        return r0;
    }

    public static /* synthetic */ HashMap getOnLinWatchFaceV2$default(String r0, boolean r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r0 = i72.OXO1.O001I();
    L6:
        return getOnLinWatchFaceV2(r0, r1);
    }

    @aa1
    public static final HashMap<String, String> getOrderStatusBody(@aa1 String r4, @aa1 String r5, @aa1 String r6) {
        Intrinsics.X0O(r4, "identity");
        Intrinsics.X0O(r5, "orderNum");
        Intrinsics.X0O(r6, "orderType");
        HashMap<String, String> r3 = new HashMap();
        r3.put("identity", r4);
        r3.put("orderNum", r5);
        r3.put("orderType", r6);
        return r3;
    }

    @aa1
    public static final HashMap<String, String> getPayMacAddressBody() {
        HashMap<String, String> r0 = new HashMap();
        BleCache r1 = BleCache.INSTANCE;
        r0.put("bleName", r1.getMBleName());
        r0.put("flag", r1.getMFirmwareFlag());
        r0.put("version", BaseBleCache.getString$default(r1, BleKey.FIRMWARE_VERSION, null, null, 6, null));
        r0.put("oldMacAddress", oe5.IXO0OOi(r1.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null));
        r0.put("androidVersion", AppUtils.getAppVersionName());
        return r0;
    }

    @aa1
    public static final HashMap<String, String> getPointsPackBody() {
        HashMap<String, String> r0 = new HashMap();
        r0.put("projectId", PROJECT_ID);
        return r0;
    }

    @aa1
    public static final HashMap<String, String> getPurchaseHistoryWatchFace(@aa1 String r2) {
        Intrinsics.X0O(r2, "id");
        HashMap<String, String> r0 = new HashMap();
        r0.put("identity", r2);
        return r0;
    }

    public static /* synthetic */ HashMap getPurchaseHistoryWatchFace$default(String r0, int r1, Object r2) {
        if ((r1 & 1) == 0) goto L6;
        r0 = i72.OXO1.O001I();
    L6:
        return getPurchaseHistoryWatchFace(r0);
    }

    @aa1
    public static final HashMap<String, String> getRegisterVerificationCodeBody(@aa1 String r7, @aa1 String r8, @aa1 String r9, @aa1 String r10, @aa1 String r11) {
        Intrinsics.X0O(r7, "userName");
        Intrinsics.X0O(r8, "password");
        Intrinsics.X0O(r9, "verificationCode");
        Intrinsics.X0O(r10, "verifyPassword");
        Intrinsics.X0O(r11, "nickname");
        HashMap<String, String> r4 = new HashMap();
        r4.put("projectId", PROJECT_ID);
        r4.put("userName", r7);
        r4.put("password", r8);
        r4.put("verificationCode", r9);
        r4.put("verifyPassword", r10);
        if (r11.length() <= 0) goto L5;
        r4.put("nickName", r11);
    L5:
        return r4;
    }

    public static /* synthetic */ HashMap getRegisterVerificationCodeBody$default(String r0, String r1, String r2, String r3, String r4, int r5, Object r6) {
        if ((r5 & 16) == 0) goto L6;
        r4 = "";
    L6:
        return getRegisterVerificationCodeBody(r0, r1, r2, r3, r4);
    }

    @aa1
    public static final HashMap<String, String> getResetPasswordBody(@aa1 String r4, @aa1 String r5, @aa1 String r6) {
        Intrinsics.X0O(r4, "email");
        Intrinsics.X0O(r5, HintConstants.AUTOFILL_HINT_NEW_PASSWORD);
        Intrinsics.X0O(r6, "verificationCode");
        HashMap<String, String> r1 = new HashMap();
        r1.put("projectId", PROJECT_ID);
        r1.put("userName", r4);
        r1.put("password", r5);
        r1.put("verificationCode", r6);
        return r1;
    }

    @aa1
    public static final HashMap<String, String> getSelectByKey(@aa1 String r2) {
        Intrinsics.X0O(r2, "key");
        HashMap<String, String> r1 = new HashMap();
        r1.put("key", r2);
        return r1;
    }

    public static /* synthetic */ HashMap getSelectByKey$default(String r0, int r1, Object r2) {
        if ((r1 & 1) == 0) goto L6;
        r0 = "UseNewKey_COFIT";
    L6:
        return getSelectByKey(r0);
    }

    @aa1
    public static final HashMap<String, String> getSetEmailBody(@aa1 String r4, @aa1 String r5, @aa1 String r6) {
        Intrinsics.X0O(r4, "identity");
        Intrinsics.X0O(r5, "email");
        Intrinsics.X0O(r6, "verificationCode");
        HashMap<String, String> r3 = new HashMap();
        r3.put("identity", r4);
        r3.put("email", r5);
        r3.put("verificationCode", r6);
        r3.put("country", Utils.getApp().getResources().getConfiguration().locale.getCountry());
        return r3;
    }

    @aa1
    public static final HashMap<String, String> getSetReceivePhoneBody(@aa1 String r3, @aa1 String r4) {
        Intrinsics.X0O(r3, "identity");
        Intrinsics.X0O(r4, SetReceivePhone.RECEIVE_PHONE);
        HashMap<String, String> r2 = new HashMap();
        r2.put("identity", r3);
        r2.put(SetReceivePhone.RECEIVE_PHONE, r4);
        return r2;
    }

    @aa1
    public static final HashMap<String, String> getSparkAuthorizeBody() {
        HashMap<String, String> r0 = new HashMap();
        BleCache r1 = BleCache.INSTANCE;
        r0.put("bleName", r1.getMBleName());
        r0.put("flag", r1.getMFirmwareFlag());
        r0.put("mac", oe5.IXO0OOi(r1.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null));
        return r0;
    }

    @aa1
    public static final HashMap<String, String> getStockAddBody(@aa1 String r2, int r3) {
        Intrinsics.X0O(r2, "identity");
        HashMap<String, String> r1 = new HashMap();
        r1.put("identity", r2);
        r1.put("projectId", PROJECT_ID);
        r1.put("stockId", String.valueOf(r3));
        return r1;
    }

    @aa1
    public static final HashMap<String, String> getStockListBody(@aa1 String r2) {
        Intrinsics.X0O(r2, "identity");
        HashMap<String, String> r1 = new HashMap();
        r1.put("identity", r2);
        r1.put("projectId", PROJECT_ID);
        return r1;
    }

    @aa1
    public static final HashMap<String, String> getStockRemoveBody(@aa1 String r2, int r3) {
        Intrinsics.X0O(r2, "identity");
        HashMap<String, String> r1 = new HashMap();
        r1.put("identity", r2);
        r1.put("stockId", String.valueOf(r3));
        return r1;
    }

    @aa1
    public static final HashMap<String, String> getStockSearchBody(@aa1 String r3, @aa1 String r4) {
        Intrinsics.X0O(r3, "identity");
        Intrinsics.X0O(r4, "queryKey");
        HashMap<String, String> r2 = new HashMap();
        r2.put("identity", r3);
        r2.put("projectId", PROJECT_ID);
        r2.put("queryKey", r4);
        return r2;
    }

    @aa1
    public static final HashMap<String, String> getTempSignedPutUrlBody(@aa1 String r3, @aa1 String r4) {
        Intrinsics.X0O(r3, "identity");
        Intrinsics.X0O(r4, GetTempSignedPutUrl.UPLOAD_OSSFILEPATH);
        HashMap<String, String> r2 = new HashMap();
        r2.put("identity", r3);
        r2.put(GetTempSignedPutUrl.UPLOAD_OSSFILEPATH, r4);
        return r2;
    }

    @aa1
    public static final HashMap<String, String> getTeraBoxRefreshTokenBody(@aa1 String r2) {
        Intrinsics.X0O(r2, "token");
        HashMap<String, String> r1 = new HashMap();
        r1.put("token", r2);
        r1.put("projectId", PROJECT_ID);
        return r1;
    }

    @aa1
    public static final HashMap<String, String> getTeraBoxTokenBody(@aa1 String r11) {
        Intrinsics.X0O(r11, "code");
        HashMap<String, String> r1 = new HashMap();
        BleCache r2 = BleCache.INSTANCE;
        r1.put("bleName", r2.getMBleName());
        r1.put("flag", r2.getMFirmwareFlag());
        r1.put("mac", oe5.IXO0OOi(r2.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null));
        r1.put("projectId", PROJECT_ID);
        r1.put("code", r11);
        return r1;
    }

    @aa1
    public static final HashMap<String, String> getTeraBoxTokenInfoBody(@aa1 String r2) {
        Intrinsics.X0O(r2, "token");
        HashMap<String, String> r1 = new HashMap();
        r1.put("token", r2);
        r1.put("projectId", PROJECT_ID);
        return r1;
    }

    @aa1
    public static final HashMap<String, String> getThirdPartyBody(@aa1 String r8, @aa1 String r9, @aa1 String r10, @aa1 String r11, @aa1 String r12, @aa1 String r13) {
        Intrinsics.X0O(r8, "platform");
        Intrinsics.X0O(r9, "openId");
        Intrinsics.X0O(r10, "accessToken");
        Intrinsics.X0O(r11, "extInfo");
        Intrinsics.X0O(r12, "email");
        Intrinsics.X0O(r13, "displayName");
        HashMap<String, String> r5 = new HashMap();
        r5.put("projectId", PROJECT_ID);
        r5.put("platform", r8);
        r5.put("openId", r9);
        r5.put("accessToken", r10);
        r5.put("email", r12);
        r5.put("nickName", r13);
        if (i72.OXO1.IXO0OOi() == true) goto L5;
    L7:
        r5.put("country", Utils.getApp().getResources().getConfiguration().locale.getCountry());
        return r5;
    L5:
        if (Intrinsics.XOO0ii0(StringsKt__StringsKt.iX1X1(r8).toString(), StringsKt__StringsKt.iX1X1(nx1.XIi00iiXO).toString()) == false) goto L7;
        r5.put("extInfo", r11);
        String r14 = a01.OXO1.OXO1().getString(b01.OX0X1O10X, "");
        r5.put("phoneIdentity", UtilsKt.XX1Oi());
        r5.put("oldOpenId", r14);
        goto L7
    }

    public static /* synthetic */ HashMap getThirdPartyBody$default(String r1, String r2, String r3, String r4, String r5, String r6, int r7, Object r8) {
        if ((r7 & 8) == 0) goto L6;
        r4 = "";
    L6:
        if ((r7 & 16) == 0) goto L9;
        r5 = "";
    L9:
        if ((r7 & 32) == 0) goto L12;
        r6 = "";
    L12:
        return getThirdPartyBody(r1, r2, r3, r4, r5, r6);
    }

    @aa1
    public static final HashMap<String, String> getTranslatorTextBody(@aa1 String r3, @aa1 String r4) {
        Intrinsics.X0O(r3, "text");
        Intrinsics.X0O(r4, ToTranslatorText.FLAG_TRANSLATION_LANGUAGE);
        HashMap<String, String> r1 = new HashMap();
        r1.put(ToTranslatorText.FLAG_TEXT_FORM, r3);
        r1.put(ToTranslatorText.FLAG_TRANSLATION_LANGUAGE, r4);
        r1.put("source", "microsoft");
        r1.put(ToTranslatorText.FLAG_ORIGINAL_LANGUAGE, "auto");
        return r1;
    }

    @aa1
    public static final HashMap<String, String> getUpdateDeviceInfoBody(@aa1 AppUser r9) {
        Intrinsics.X0O(r9, "appUser");
        HashMap<String, String> r0 = new HashMap();
        r0.put("identity", r9.getIdentity());
        r0.put("projectId", String.valueOf(r9.getProjectId()));
        BleCache r2 = BleCache.INSTANCE;
        r0.put("name", r2.getMBleName());
        r0.put("address", oe5.IXO0OOi(r2.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null));
        r0.put("platform", r2.getMPlatform());
        r0.put("prototype", r2.getMPrototype());
        r0.put("firmwareFlag", r2.getMFirmwareFlag());
        r0.put("agpsType", String.valueOf(r2.getMAGpsType()));
        r0.put("version", BaseBleCache.getString$default(r2, BleKey.FIRMWARE_VERSION, null, null, 6, null));
        return r0;
    }

    @aa1
    public static final HashMap<String, String> getUploadNoLoginUserInfo(@aa1 AppUser r3) {
        Intrinsics.X0O(r3, "mAppUser");
        HashMap<String, String> r0 = new HashMap();
        r0.put("projectId", PROJECT_ID);
        r0.put("nickname", r3.getNickname());
        r0.put("birthday", r3.getBirthday());
        r0.put("gender", String.valueOf(r3.getGender()));
        r0.put("unit", String.valueOf(r3.getUnit()));
        r0.put("height", String.valueOf(r3.getHeight()));
        r0.put("weight", String.valueOf(r3.getWeight()));
        r0.put("extraInfo", r3.getExtraInfo());
        r0.put("country", r3.getCountry());
        r0.put("city", r3.getCity());
        r0.put("longitude", String.valueOf(r3.getLongitude()));
        r0.put("latitude", String.valueOf(r3.getLatitude()));
        r0.put("server", String.valueOf(r3.getServer()));
        r0.put("phoneOs", String.valueOf(r3.getPhoneOs()));
        r0.put("osVersion", r3.getOsVersion());
        r0.put("phoneModel", r3.getPhoneModel());
        r0.put("phoneIdentity", r3.getPhoneIdentity());
        r0.put("settings", r3.getSettings());
        return r0;
    }

    @aa1
    public static final HashMap<String, String> getUserGameDetailBody(@aa1 String r2) {
        Intrinsics.X0O(r2, GetGameDetail.GAME_ID);
        HashMap<String, String> r1 = new HashMap();
        r1.put(GetGameDetail.GAME_ID, r2);
        return r1;
    }

    @aa1
    public static final HashMap<String, String> getUserIdBody(@aa1 String r2) {
        Intrinsics.X0O(r2, "identity");
        HashMap<String, String> r0 = new HashMap();
        r0.put("userId", r2);
        return r0;
    }

    @aa1
    public static final HashMap<String, String> getUserIdentityBody(@aa1 AppUser r2) {
        Intrinsics.X0O(r2, "mAppUser");
        HashMap<String, String> r0 = new HashMap();
        r0.put("identity", r2.getIdentity());
        return r0;
    }

    @aa1
    public static final HashMap<String, String> getUserInfoBody(@aa1 AppUser r3) {
        Intrinsics.X0O(r3, "mAppUser");
        HashMap<String, String> r0 = new HashMap();
        r0.put("identity", r3.getIdentity());
        r0.put("nickname", r3.getNickname());
        r0.put("birthday", r3.getBirthday());
        r0.put("gender", String.valueOf(r3.getGender()));
        r0.put("height", String.valueOf(r3.getHeight()));
        r0.put("weight", String.valueOf(r3.getWeight()));
        r0.put("extraInfo", r3.getExtraInfo());
        return r0;
    }

    @aa1
    public static final HashMap<String, String> getUserPointsMemberBody(@aa1 String r2) {
        Intrinsics.X0O(r2, "identity");
        HashMap<String, String> r1 = new HashMap();
        r1.put("identity", r2);
        return r1;
    }

    @aa1
    public static final HashMap<String, String> getVerificationCodeBody(@aa1 String r3, int r4) {
        Intrinsics.X0O(r3, "email");
        HashMap<String, String> r0 = new HashMap();
        r0.put("projectId", PROJECT_ID);
        r0.put("userName", r3);
        r0.put("language", Utils.getApp().getResources().getConfiguration().locale.getLanguage());
        r0.put("verificationType", String.valueOf(r4));
        return r0;
    }

    @aa1
    public static final HashMap<String, String> getVerificationCodeCheckBody(@aa1 String r4, @aa1 String r5) {
        Intrinsics.X0O(r4, "email");
        Intrinsics.X0O(r5, "verificationCode");
        HashMap<String, String> r1 = new HashMap();
        r1.put("projectId", PROJECT_ID);
        r1.put("userName", r4);
        r1.put("verificationCode", r5);
        return r1;
    }

    @aa1
    public static final HashMap<String, String> getWatchFaceBannerBody() {
        HashMap<String, String> r0 = new HashMap();
        BleCache r1 = BleCache.INSTANCE;
        r0.put("bleName", r1.getMBleName());
        r0.put("flag", r1.getMFirmwareFlag());
        return r0;
    }

    @aa1
    public static final HashMap<String, String> getWatchFaceDetails(@aa1 String r3, @aa1 String r4) {
        Intrinsics.X0O(r3, "identity");
        Intrinsics.X0O(r4, "id");
        HashMap<String, String> r2 = new HashMap();
        r2.put("identity", r3);
        r2.put("id", r4);
        return r2;
    }

    @aa1
    public static final HashMap<String, String> getWatchFaceDetailsClick(@aa1 String r2) {
        Intrinsics.X0O(r2, "id");
        HashMap<String, String> r0 = new HashMap();
        r0.put("wid", r2);
        return r0;
    }

    @aa1
    public static final HashMap<String, String> getWatchFaceDetailsList(@aa1 String r2, @aa1 String r3) {
        Intrinsics.X0O(r2, "identity");
        Intrinsics.X0O(r3, "id");
        HashMap<String, String> r1 = new HashMap();
        r1.put("identity", r2);
        r1.put("wid", r3);
        BleCache r4 = BleCache.INSTANCE;
        r1.put("bleName", r4.getMBleName());
        r1.put("flag", r4.getMFirmwareFlag());
        return r1;
    }

    @aa1
    public static final HashMap<String, String> getWeatherForecastBody(double r3, double r5) {
        HashMap<String, String> r0 = new HashMap();
        r0.put("projectId", PROJECT_ID);
        r0.put("lon", String.valueOf(r3));
        r0.put("lat", String.valueOf(r5));
        BleCache r4 = BleCache.INSTANCE;
        r0.put("bleName", r4.getMBleName());
        r0.put("flag", r4.getMFirmwareFlag());
        return r0;
    }

    @aa1
    public static final HashMap<String, String> getWeatherRealtimeBody(double r3, double r5) {
        HashMap<String, String> r0 = new HashMap();
        r0.put("projectId", PROJECT_ID);
        r0.put("lon", String.valueOf(r3));
        r0.put("lat", String.valueOf(r5));
        BleCache r4 = BleCache.INSTANCE;
        r0.put("bleName", r4.getMBleName());
        r0.put("flag", r4.getMFirmwareFlag());
        return r0;
    }

    @aa1
    public static final HashMap<String, String> userMigrateBody(@aa1 String r2, @aa1 String r3) {
        Intrinsics.X0O(r2, "identity");
        Intrinsics.X0O(r3, "goalService");
        HashMap<String, String> r1 = new HashMap();
        r1.put("identity", r2);
        r1.put("goalServer", r3);
        return r1;
    }
}
