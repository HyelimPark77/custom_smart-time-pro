package com.sma.smartv3.network;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
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
import com.bykv.p563vk.openvk.preload.falconx.statistic.StatisticData;
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
    public static final HashMap<String, String> aigcCreateJobBody(@aa1 String query, @aa1 String style, int i) {
        Intrinsics.X0O(query, "query");
        Intrinsics.X0O(style, "style");
        HashMap<String, String> map = new HashMap<>();
        map.put("projectId", PROJECT_ID);
        map.put("query", query);
        map.put("bleName", BleCache.INSTANCE.getMBleName());
        map.put("style", style);
        map.put("imageCount", String.valueOf(i));
        return map;
    }

    @aa1
    public static final HashMap<String, Object> aigcCreateJobBodyV2(@aa1 String query, @aa1 String model, @aa1 JobV2Extra extra) {
        Intrinsics.X0O(query, "query");
        Intrinsics.X0O(model, "model");
        Intrinsics.X0O(extra, "extra");
        HashMap<String, Object> map = new HashMap<>();
        map.put("projectId", PROJECT_ID);
        map.put("text", query);
        map.put(AICreateJobV2.AI_EXTRA, extra);
        map.put("model", model);
        map.put(AICreateJobV2.AI_Stream, Boolean.TRUE);
        return map;
    }

    @aa1
    public static final HashMap<String, String> aigcFindJobBody(@aa1 String jobId) {
        Intrinsics.X0O(jobId, "jobId");
        HashMap<String, String> map = new HashMap<>();
        map.put("projectId", PROJECT_ID);
        map.put("jobId", jobId);
        map.put("bleName", BleCache.INSTANCE.getMBleName());
        return map;
    }

    @aa1
    public static final HashMap<String, String> deleteAccountOrderBody(@aa1 String identity, @aa1 String orderNum) {
        Intrinsics.X0O(identity, "identity");
        Intrinsics.X0O(orderNum, "orderNum");
        HashMap<String, String> map = new HashMap<>();
        map.put("identity", identity);
        map.put("orderNum", orderNum);
        return map;
    }

    @aa1
    public static final HashMap<String, String> getAccountDetails(@aa1 String identity, int i) {
        Intrinsics.X0O(identity, "identity");
        HashMap<String, String> map = new HashMap<>();
        map.put("identity", identity);
        map.put("pageNum", String.valueOf(i));
        map.put("pageSize", StatisticData.ERROR_CODE_NOT_FOUND);
        return map;
    }

    @aa1
    public static final HashMap<String, String> getAccountOrderSelectList(@aa1 String identity, @aa1 String orderType, int i) {
        Intrinsics.X0O(identity, "identity");
        Intrinsics.X0O(orderType, "orderType");
        HashMap<String, String> map = new HashMap<>();
        map.put("identity", identity);
        map.put("orderType", orderType);
        map.put("pageNum", String.valueOf(i));
        map.put("pageSize", StatisticData.ERROR_CODE_NOT_FOUND);
        return map;
    }

    @aa1
    public static final HashMap<String, String> getAddUserWatchDownloadRecordBody(@aa1 String identity, @aa1 String wid) {
        Intrinsics.X0O(identity, "identity");
        Intrinsics.X0O(wid, "wid");
        HashMap<String, String> map = new HashMap<>();
        map.put("identity", identity);
        map.put("wid", wid);
        return map;
    }

    @aa1
    public static final HashMap<String, String> getAppConfigInfoBody() {
        HashMap<String, String> map = new HashMap<>();
        map.put("projectId", PROJECT_ID);
        return map;
    }

    @aa1
    public static final HashMap<String, String> getAppDeductionConfigBody() {
        HashMap<String, String> map = new HashMap<>();
        map.put("projectId", PROJECT_ID);
        return map;
    }

    @aa1
    public static final HashMap<String, String> getAppStoreFileListBody(@aa1 String appModuleId) {
        Intrinsics.X0O(appModuleId, "appModuleId");
        HashMap<String, String> map = new HashMap<>();
        BleCache bleCache = BleCache.INSTANCE;
        map.put("bleName", bleCache.getMBleName());
        map.put("flag", bleCache.getMFirmwareFlag());
        map.put(AppStoreFileListSearch.APP_MODULE_ID, appModuleId);
        return map;
    }

    @aa1
    public static final HashMap<String, String> getBGEMUserBody(@aa1 BGEMUser user) {
        Intrinsics.X0O(user, "user");
        HashMap<String, String> map = new HashMap<>();
        map.put("age", String.valueOf(user.getAge()));
        map.put("gender", user.getGender().toString());
        map.put("weight", String.valueOf(user.getWeight()));
        map.put("height", String.valueOf(user.getHeight()));
        map.put("family_history", String.valueOf(user.getFamily_history()));
        map.put("high_cholesterol", String.valueOf(user.getHigh_cholesterol()));
        return map;
    }

    @aa1
    public static final HashMap<String, String> getBleFirmwareAllListBody(@aa1 String filter) {
        Intrinsics.X0O(filter, "filter");
        HashMap<String, String> map = new HashMap<>();
        map.put("filter", filter);
        map.put("page", "1");
        map.put("limit", "200");
        return map;
    }

    @aa1
    public static final HashMap<String, String> getBleFirmwareVersionListBody(@aa1 String firmwareId) {
        Intrinsics.X0O(firmwareId, "firmwareId");
        HashMap<String, String> map = new HashMap<>();
        map.put("firmwareId", firmwareId);
        map.put("page", "1");
        map.put("limit", "200");
        return map;
    }

    @aa1
    public static final HashMap<String, String> getCallTranslationUrlBody(@aa1 String userId, @aa1 String language, @aa1 String targetLanguage, @aa1 String type) {
        Intrinsics.X0O(userId, "userId");
        Intrinsics.X0O(language, "language");
        Intrinsics.X0O(targetLanguage, "targetLanguage");
        Intrinsics.X0O(type, "type");
        HashMap<String, String> map = new HashMap<>();
        map.put("uid", userId);
        map.put("language", language);
        map.put(GetCallTranslationUrl.TARGET_LANGUAGE, targetLanguage);
        map.put("type", type);
        return map;
    }

    @aa1
    public static final HashMap<String, String> getCallTranslationUrlBodyWithBleInfo(@aa1 String userId, @aa1 String language, @aa1 String targetLanguage, @aa1 String type, @aa1 String bleInfo) {
        Intrinsics.X0O(userId, "userId");
        Intrinsics.X0O(language, "language");
        Intrinsics.X0O(targetLanguage, "targetLanguage");
        Intrinsics.X0O(type, "type");
        Intrinsics.X0O(bleInfo, "bleInfo");
        HashMap<String, String> map = new HashMap<>();
        map.put("uid", userId);
        map.put("language", language);
        map.put(GetCallTranslationUrl.TARGET_LANGUAGE, targetLanguage);
        map.put("type", type);
        map.put("BleInfo", bleInfo);
        return map;
    }

    @aa1
    public static final HashMap<String, String> getChangeDeviceStateBody(int i) {
        HashMap<String, String> map = new HashMap<>();
        BleCache bleCache = BleCache.INSTANCE;
        map.put("bleName", bleCache.getMBleName());
        map.put("flag", bleCache.getMFirmwareFlag());
        map.put("macAddress", oe5.IXO0OOi(bleCache.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null));
        map.put("state", String.valueOf(i));
        return map;
    }

    @aa1
    public static final HashMap<String, String> getCheckAppFirmwareBody() {
        HashMap<String, String> map = new HashMap<>();
        BleCache bleCache = BleCache.INSTANCE;
        map.put("bleName", bleCache.getMBleName());
        map.put("flag", bleCache.getMFirmwareFlag());
        map.put("projectId", PROJECT_ID);
        map.put("platform", "Android");
        map.put("version", AppUtils.getAppVersionName());
        return map;
    }

    @aa1
    public static final HashMap<String, String> getCheckAppVersionBody() {
        HashMap<String, String> map = new HashMap<>();
        map.put("appName", AppUtils.getAppName());
        map.put("platform", "Android");
        map.put("version", AppUtils.getAppVersionName());
        map.put("projectId", PROJECT_ID);
        return map;
    }

    @aa1
    public static final HashMap<String, String> getCheckExtraPackVersionBody() {
        FirmwareVersion firmwareVersion = (FirmwareVersion) new Gson().fromJson(a01.OXO1.XIi00iiXO().getString(FirmwareVersion.class.getName()), FirmwareVersion.class);
        String version2 = null;
        if (TextUtils.isEmpty(firmwareVersion != null ? firmwareVersion.getVersion2() : null)) {
            if (firmwareVersion != null) {
                version2 = firmwareVersion.getVersion();
            }
        } else if (firmwareVersion != null) {
            version2 = firmwareVersion.getVersion2();
        }
        HashMap<String, String> map = new HashMap<>();
        BleCache bleCache = BleCache.INSTANCE;
        map.put("bleName", bleCache.getMBleName());
        map.put("flag", bleCache.getMFirmwareFlag());
        if (version2 == null) {
            version2 = BaseBleCache.getString$default(bleCache, BleKey.FIRMWARE_VERSION, null, null, 6, null);
        }
        map.put("firmwareVersion", version2);
        map.put("uiPackVersion", BaseBleCache.getString$default(bleCache, BleKey.UI_PACK_VERSION, "0.0.0", null, 4, null));
        BleLanguagePackVersion bleLanguagePackVersion = (BleLanguagePackVersion) BaseBleCache.getObjectNotNull$default(bleCache, BleKey.LANGUAGE_PACK_VERSION, BleLanguagePackVersion.class, null, null, 12, null);
        map.put("languagePackVersion", bleLanguagePackVersion.getMVersion());
        map.put("languageCode", String.valueOf(bleLanguagePackVersion.getMLanguageCode()));
        map.put("gpsPackVersion", BaseBleCache.getString$default(bleCache, BleKey.GPS_FIRMWARE_VERSION, "0.0.0", null, 4, null));
        map.put("networkPackVersion", BaseBleCache.getString$default(bleCache, BleKey.NETWORK_FIRMWARE_VERSION, "0.0.0", null, 4, null));
        return map;
    }

    @aa1
    public static final HashMap<String, String> getCheckFirmwareVersionBody(@tb1 String str, @aa1 String valid, @aa1 String bleName, @aa1 String flag) {
        Intrinsics.X0O(valid, "valid");
        Intrinsics.X0O(bleName, "bleName");
        Intrinsics.X0O(flag, "flag");
        HashMap<String, String> map = new HashMap<>();
        map.put("bleName", bleName);
        map.put("flag", flag);
        if (str == null) {
            str = BaseBleCache.getString$default(BleCache.INSTANCE, BleKey.FIRMWARE_VERSION, null, null, 6, null);
        }
        map.put("version", str);
        map.put("androidVersion", AppUtils.getAppVersionName());
        map.put("appPlatform", "0");
        BleCache bleCache = BleCache.INSTANCE;
        map.put("macAddress", oe5.IXO0OOi(bleCache.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null));
        map.put("projectId", PROJECT_ID);
        map.put("uiPackVersion", BaseBleCache.getString$default(bleCache, BleKey.UI_PACK_VERSION, "0.0.0", null, 4, null));
        map.put("valid", valid);
        return map;
    }

    public static /* synthetic */ HashMap getCheckFirmwareVersionBody$default(String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = Api.f51338Y;
        }
        if ((i & 4) != 0) {
            str3 = BleCache.INSTANCE.getMBleName();
        }
        if ((i & 8) != 0) {
            str4 = BleCache.INSTANCE.getMFirmwareFlag();
        }
        return getCheckFirmwareVersionBody(str, str2, str3, str4);
    }

    @aa1
    public static final HashMap<String, String> getCheckNoteFirmwareVersionBody(@tb1 String str, @aa1 String valid, @aa1 String bleName, @aa1 String flag, @aa1 String curVersion, @aa1 String mac) {
        Intrinsics.X0O(valid, "valid");
        Intrinsics.X0O(bleName, "bleName");
        Intrinsics.X0O(flag, "flag");
        Intrinsics.X0O(curVersion, "curVersion");
        Intrinsics.X0O(mac, "mac");
        LogUtils.m11130i("get= version:" + str + " bleName" + bleName + " flag" + flag + " curVersion" + curVersion + " mac" + mac + "  ");
        HashMap<String, String> map = new HashMap<>();
        map.put("bleName", getName(bleName));
        map.put("flag", flag);
        if (str == null) {
            str = curVersion;
        }
        map.put("version", str);
        map.put("androidVersion", AppUtils.getAppVersionName());
        map.put("appPlatform", "0");
        map.put("macAddress", mac);
        map.put("projectId", PROJECT_ID);
        map.put("valid", valid);
        return map;
    }

    public static /* synthetic */ HashMap getCheckNoteFirmwareVersionBody$default(String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = Api.f51338Y;
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        if ((i & 8) != 0) {
            str4 = "0";
        }
        if ((i & 16) != 0) {
            str5 = "";
        }
        return getCheckNoteFirmwareVersionBody(str, str2, str3, str4, str5, (i & 32) != 0 ? "" : str6);
    }

    @aa1
    public static final HashMap<String, String> getCheckOrderBody(@aa1 String packageName, @aa1 String applicationName, @aa1 String productId, @aa1 String purchaseToken, @aa1 String orderNum) {
        Intrinsics.X0O(packageName, "packageName");
        Intrinsics.X0O(applicationName, "applicationName");
        Intrinsics.X0O(productId, "productId");
        Intrinsics.X0O(purchaseToken, "purchaseToken");
        Intrinsics.X0O(orderNum, "orderNum");
        HashMap<String, String> map = new HashMap<>();
        map.put("packageName", packageName);
        map.put(GetGooglePayCheckOrder.APPLICATION_NAME, applicationName);
        map.put("productId", productId);
        map.put("purchaseToken", purchaseToken);
        map.put("orderNum", orderNum);
        return map;
    }

    @aa1
    public static final HashMap<String, String> getChoicenessSearchListBody(@aa1 String type) {
        Intrinsics.X0O(type, "type");
        HashMap<String, String> map = new HashMap<>();
        map.put("recommendType", type);
        return map;
    }

    @aa1
    public static final HashMap<String, String> getCourSelectByTypeBody(@aa1 String type) {
        Intrinsics.X0O(type, "type");
        HashMap<String, String> map = new HashMap<>();
        map.put("type", type);
        return map;
    }

    public static /* synthetic */ HashMap getCourSelectByTypeBody$default(String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = GetCourSelectByType.COURSE_DIFF;
        }
        return getCourSelectByTypeBody(str);
    }

    @aa1
    public static final HashMap<String, String> getCourseBody(@tb1 String str, @tb1 String str2, @tb1 String str3, @tb1 String str4) {
        HashMap<String, String> map = new HashMap<>();
        if (str != null && str.length() != 0) {
            map.put(GetCourseList.COURSE_TYPE, str);
        }
        if (str2 != null && str2.length() != 0) {
            map.put(GetCourseList.COURSE_DIFF, str2);
        }
        if (str3 != null && str3.length() != 0) {
            map.put(GetCourseList.COURSE_PART, str3);
        }
        return map;
    }

    public static /* synthetic */ HashMap getCourseBody$default(String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        return getCourseBody(str, str2, str3, str4);
    }

    @aa1
    public static final HashMap<String, String> getCourseCollectBody(@aa1 String cid, @aa1 String uid, @aa1 String collectFlag) {
        Intrinsics.X0O(cid, "cid");
        Intrinsics.X0O(uid, "uid");
        Intrinsics.X0O(collectFlag, "collectFlag");
        HashMap<String, String> map = new HashMap<>();
        map.put("cid", cid);
        map.put("uid", uid);
        map.put(CourseCollect.COLLECT_FLAG, collectFlag);
        return map;
    }

    @aa1
    public static final HashMap<String, String> getCourseCollectList(@aa1 String uid) {
        Intrinsics.X0O(uid, "uid");
        HashMap<String, String> map = new HashMap<>();
        map.put("uid", uid);
        return map;
    }

    @aa1
    public static final HashMap<String, String> getCourseDetailsBody(@aa1 String id, @aa1 String uid) {
        Intrinsics.X0O(id, "id");
        Intrinsics.X0O(uid, "uid");
        HashMap<String, String> map = new HashMap<>();
        map.put("id", id);
        map.put("uid", uid);
        return map;
    }

    public static /* synthetic */ HashMap getCourseDetailsBody$default(String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        return getCourseDetailsBody(str, str2);
    }

    @aa1
    public static final HashMap<String, String> getCourseTypeListBody(@aa1 String type) {
        Intrinsics.X0O(type, "type");
        return new HashMap<>();
    }

    public static /* synthetic */ HashMap getCourseTypeListBody$default(String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "course_type";
        }
        return getCourseTypeListBody(str);
    }

    @aa1
    public static final HashMap<String, String> getCreateOrder(@aa1 String identity, @aa1 String orderType, @aa1 String eleId, @aa1 String internalFlag) {
        Intrinsics.X0O(identity, "identity");
        Intrinsics.X0O(orderType, "orderType");
        Intrinsics.X0O(eleId, "eleId");
        Intrinsics.X0O(internalFlag, "internalFlag");
        HashMap<String, String> map = new HashMap<>();
        map.put("identity", identity);
        map.put("orderType", orderType);
        map.put("eleId", eleId);
        map.put("projectId", PROJECT_ID);
        map.put("internalFlag", internalFlag);
        return map;
    }

    public static /* synthetic */ HashMap getCreateOrder$default(String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 8) != 0) {
            str4 = i72.OXO1.m2049OX() ? "1" : "0";
        }
        return getCreateOrder(str, str2, str3, str4);
    }

    @aa1
    public static final HashMap<String, String> getDcsTokenBody() {
        HashMap<String, String> map = new HashMap<>();
        map.put("appVersion", AppUtils.getAppVersionName());
        BleCache bleCache = BleCache.INSTANCE;
        map.put(GetDcsToken.FIRMWARE_VERSION, BaseBleCache.getString$default(bleCache, BleKey.FIRMWARE_VERSION, null, null, 6, null));
        map.put("projectId", PROJECT_ID);
        map.put("bleName", bleCache.getMBleName());
        map.put("flag", bleCache.getMFirmwareFlag());
        map.put("macAddress", oe5.IXO0OOi(bleCache.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null));
        return map;
    }

    @aa1
    public static final HashMap<String, String> getDeleteAppUserBody(@aa1 String id) {
        Intrinsics.X0O(id, "id");
        HashMap<String, String> map = new HashMap<>();
        map.put("identity", id);
        return map;
    }

    @aa1
    public static final HashMap<String, String> getDeviceInfoBody(@aa1 String projectId, @aa1 String mBleName, @aa1 String mFirmwareFlag) {
        Intrinsics.X0O(projectId, "projectId");
        Intrinsics.X0O(mBleName, "mBleName");
        Intrinsics.X0O(mFirmwareFlag, "mFirmwareFlag");
        HashMap<String, String> map = new HashMap<>();
        map.put("projectId", projectId);
        map.put("bleName", mBleName);
        map.put("flag", mFirmwareFlag);
        return map;
    }

    public static /* synthetic */ HashMap getDeviceInfoBody$default(String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = String.valueOf(i72.OXO1.XX0());
        }
        if ((i & 2) != 0) {
            str2 = BleCache.INSTANCE.getMBleName();
        }
        if ((i & 4) != 0) {
            str3 = BleCache.INSTANCE.getMFirmwareFlag();
        }
        return getDeviceInfoBody(str, str2, str3);
    }

    @aa1
    public static final HashMap<String, String> getDeviceListBody(@aa1 String projectId) {
        Intrinsics.X0O(projectId, "projectId");
        HashMap<String, String> map = new HashMap<>();
        map.put("projectId", projectId);
        return map;
    }

    public static /* synthetic */ HashMap getDeviceListBody$default(String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = String.valueOf(i72.OXO1.XX0());
        }
        return getDeviceListBody(str);
    }

    @aa1
    public static final HashMap<String, String> getDeviceListObjectBody(@aa1 String projectId) {
        Intrinsics.X0O(projectId, "projectId");
        HashMap<String, String> map = new HashMap<>();
        map.put("projectId", projectId);
        return map;
    }

    public static /* synthetic */ HashMap getDeviceListObjectBody$default(String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = String.valueOf(i72.OXO1.XX0());
        }
        return getDeviceListObjectBody(str);
    }

    @aa1
    public static final HashMap<String, String> getDeviceStateBody() {
        HashMap<String, String> map = new HashMap<>();
        BleCache bleCache = BleCache.INSTANCE;
        map.put("bleName", bleCache.getMBleName());
        map.put("flag", bleCache.getMFirmwareFlag());
        map.put("macAddress", oe5.IXO0OOi(bleCache.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null));
        map.put("version", BaseBleCache.getString$default(bleCache, BleKey.FIRMWARE_VERSION, null, null, 6, null));
        map.put("androidVersion", AppUtils.getAppVersionName());
        return map;
    }

    @aa1
    public static final HashMap<String, String> getExternalKeyBody(@aa1 String key) {
        Intrinsics.X0O(key, "key");
        HashMap<String, String> map = new HashMap<>();
        map.put("key", key);
        return map;
    }

    public static /* synthetic */ HashMap getExternalKeyBody$default(String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ExternalKeyManager.SPEECH_KEY;
        }
        return getExternalKeyBody(str);
    }

    @aa1
    public static final HashMap<String, String> getExtraPackVersionFontBody(@aa1 String valid) {
        Intrinsics.X0O(valid, "valid");
        HashMap<String, String> map = new HashMap<>();
        BleCache bleCache = BleCache.INSTANCE;
        map.put("bleName", bleCache.getMBleName());
        map.put("flag", bleCache.getMFirmwareFlag());
        map.put("firmwareVersion", BaseBleCache.getString$default(bleCache, BleKey.FIRMWARE_VERSION, null, null, 6, null));
        map.put("valid", valid);
        return map;
    }

    @aa1
    public static final HashMap<String, String> getExtraPackVersionGPSFirmwareBody(@tb1 String str, @aa1 String valid) {
        Intrinsics.X0O(valid, "valid");
        HashMap<String, String> map = new HashMap<>();
        BleCache bleCache = BleCache.INSTANCE;
        map.put("bleName", bleCache.getMBleName());
        map.put("flag", bleCache.getMFirmwareFlag());
        map.put("firmwareVersion", BaseBleCache.getString$default(bleCache, BleKey.FIRMWARE_VERSION, null, null, 6, null));
        map.put("appVersion", AppUtils.getAppVersionName());
        map.put("appPlatform", "0");
        map.put("mac", oe5.IXO0OOi(bleCache.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null));
        map.put("pid", PROJECT_ID);
        if (str == null) {
            str = BaseBleCache.getString$default(bleCache, BleKey.GPS_FIRMWARE_VERSION, "0.0.0", null, 4, null);
        }
        map.put(BleExtraPackVersionGPSFirmware.GPS_PACK_VERSION, str);
        map.put("valid", valid);
        return map;
    }

    public static /* synthetic */ HashMap getExtraPackVersionGPSFirmwareBody$default(String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = Api.f51338Y;
        }
        return getExtraPackVersionGPSFirmwareBody(str, str2);
    }

    @aa1
    public static final HashMap<String, String> getExtraPackVersionLanguageBody(@aa1 String valid) {
        Intrinsics.X0O(valid, "valid");
        HashMap<String, String> map = new HashMap<>();
        BleCache bleCache = BleCache.INSTANCE;
        map.put("bleName", bleCache.getMBleName());
        map.put("flag", bleCache.getMFirmwareFlag());
        map.put("firmwareVersion", BaseBleCache.getString$default(bleCache, BleKey.FIRMWARE_VERSION, null, null, 6, null));
        map.put("valid", valid);
        return map;
    }

    @aa1
    public static final HashMap<String, String> getExtraPackVersionUIBody(@aa1 String valid) {
        Intrinsics.X0O(valid, "valid");
        HashMap<String, String> map = new HashMap<>();
        BleCache bleCache = BleCache.INSTANCE;
        map.put("bleName", bleCache.getMBleName());
        map.put("flag", bleCache.getMFirmwareFlag());
        map.put("firmwareVersion", BaseBleCache.getString$default(bleCache, BleKey.FIRMWARE_VERSION, null, null, 6, null));
        map.put("valid", valid);
        return map;
    }

    @aa1
    public static final HashMap<String, String> getFeedbackBody(@aa1 Context context, @aa1 String contactWay, @aa1 String content) {
        Intrinsics.X0O(context, "context");
        Intrinsics.X0O(contactWay, "contactWay");
        Intrinsics.X0O(content, "content");
        HashMap<String, String> map = new HashMap<>();
        map.put("projectId", PROJECT_ID);
        map.put("contactWay", contactWay);
        map.put("content", content);
        String string = context.getString(R.string.app_name);
        String appVersionName = AppUtils.getAppVersionName();
        BleCache bleCache = BleCache.INSTANCE;
        map.put("extraInfo", string + I000IiI1O.C2156iO.XO0O10 + appVersionName + I000IiI1O.C2156iO.XO0O10 + bleCache.getMBleName() + I000IiI1O.C2156iO.XO0O10 + bleCache.getMFirmwareFlag() + I000IiI1O.C2156iO.XO0O10 + BaseBleCache.getString$default(bleCache, BleKey.FIRMWARE_VERSION, null, null, 6, null) + I000IiI1O.C2156iO.XO0O10 + Locale.getDefault().getCountry() + I000IiI1O.C2156iO.XO0O10 + Build.MANUFACTURER + I000IiI1O.C2156iO.XO0O10 + Build.MODEL + I000IiI1O.C2156iO.XO0O10 + Build.VERSION.RELEASE + I000IiI1O.C2156iO.XO0O10 + Build.VERSION.SDK_INT);
        return map;
    }

    @aa1
    public static final HashMap<String, String> getFreePointsBody(@aa1 String identity) {
        Intrinsics.X0O(identity, "identity");
        HashMap<String, String> map = new HashMap<>();
        map.put("identity", identity);
        return map;
    }

    @aa1
    public static final HashMap<String, String> getGomoreAuthKeyBody(@aa1 String uuid, int i, @aa1 String clientId) {
        Intrinsics.X0O(uuid, "uuid");
        Intrinsics.X0O(clientId, "clientId");
        HashMap<String, String> map = new HashMap<>();
        BleCache bleCache = BleCache.INSTANCE;
        map.put("bleName", bleCache.getMBleName());
        map.put("flag", bleCache.getMFirmwareFlag());
        map.put("mac", oe5.IXO0OOi(bleCache.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null));
        map.put(GetGomoreAuthKey.DEVICE_ID, uuid);
        map.put(GetGomoreAuthKey.TYPE, String.valueOf(i));
        map.put("platform", String.valueOf(UtilsKt.X1IX()));
        map.put(GetGomoreAuthKey.CLIENT_ID, clientId);
        return map;
    }

    @aa1
    public static final HashMap<String, String> getInternalTeraBoxRefreshTokenBody(@aa1 String token) {
        Intrinsics.X0O(token, "token");
        HashMap<String, String> map = new HashMap<>();
        map.put("token", token);
        map.put("projectId", PROJECT_ID);
        return map;
    }

    @aa1
    public static final HashMap<String, String> getInternalTeraBoxTokenBody(@aa1 String code, @aa1 String redirect_uri) {
        Intrinsics.X0O(code, "code");
        Intrinsics.X0O(redirect_uri, "redirect_uri");
        HashMap<String, String> map = new HashMap<>();
        BleCache bleCache = BleCache.INSTANCE;
        map.put("bleName", bleCache.getMBleName());
        map.put("flag", bleCache.getMFirmwareFlag());
        map.put("mac", oe5.IXO0OOi(bleCache.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null));
        map.put("projectId", PROJECT_ID);
        map.put("code", code);
        map.put("redirect_uri", redirect_uri);
        return map;
    }

    @aa1
    public static final HashMap<String, String> getLoginByCodeBody(@aa1 String email, @aa1 String verificationCode) {
        Intrinsics.X0O(email, "email");
        Intrinsics.X0O(verificationCode, "verificationCode");
        HashMap<String, String> map = new HashMap<>();
        map.put("projectId", PROJECT_ID);
        map.put("userName", email);
        map.put("verificationCode", verificationCode);
        map.put("country", Utils.getApp().getResources().getConfiguration().locale.getCountry());
        return map;
    }

    @aa1
    public static final HashMap<String, String> getLoginByPasswordBody(@aa1 String email, @aa1 String password) {
        Intrinsics.X0O(email, "email");
        Intrinsics.X0O(password, "password");
        HashMap<String, String> map = new HashMap<>();
        map.put("projectId", PROJECT_ID);
        map.put("userName", email);
        map.put("password", password);
        map.put("country", Utils.getApp().getResources().getConfiguration().locale.getCountry());
        return map;
    }

    private static final String getName(String str) {
        return StringsKt__StringsKt.iIi011O(str, q62.O01OIO1i, false, 2, null) ? q62.O01OIO1i : q62.O10O;
    }

    @aa1
    public static final HashMap<String, String> getNewDeviceListObjectBody(@aa1 String projectId) {
        Intrinsics.X0O(projectId, "projectId");
        HashMap<String, String> map = new HashMap<>();
        map.put("projectId", projectId);
        return map;
    }

    public static /* synthetic */ HashMap getNewDeviceListObjectBody$default(String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = String.valueOf(i72.OXO1.OiIIX101O());
        }
        return getNewDeviceListObjectBody(str);
    }

    @aa1
    public static final HashMap<String, Object> getOnLinWatchFace(@aa1 String id, boolean z) {
        Intrinsics.X0O(id, "id");
        HashMap<String, Object> map = new HashMap<>();
        map.put("identity", id);
        BleCache bleCache = BleCache.INSTANCE;
        map.put("bleName", bleCache.getMBleName());
        map.put("flag", bleCache.getMFirmwareFlag());
        map.put("typeGroupFlag", Boolean.valueOf(z));
        return map;
    }

    public static /* synthetic */ HashMap getOnLinWatchFace$default(String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = i72.OXO1.O001I();
        }
        return getOnLinWatchFace(str, z);
    }

    @aa1
    public static final HashMap<String, Object> getOnLinWatchFaceMoveV2(@aa1 String id, @aa1 String dialType, int i, int i2) {
        Intrinsics.X0O(id, "id");
        Intrinsics.X0O(dialType, "dialType");
        HashMap<String, Object> map = new HashMap<>();
        map.put("identity", id);
        BleCache bleCache = BleCache.INSTANCE;
        map.put("bleName", bleCache.getMBleName());
        map.put("flag", bleCache.getMFirmwareFlag());
        map.put("typeGroupFlag", Boolean.FALSE);
        map.put("dialType", dialType);
        map.put("pageNum", Integer.valueOf(i));
        map.put("pageSize", Integer.valueOf(i2));
        return map;
    }

    public static /* synthetic */ HashMap getOnLinWatchFaceMoveV2$default(String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = i72.OXO1.O001I();
        }
        if ((i3 & 4) != 0) {
            i = 1;
        }
        if ((i3 & 8) != 0) {
            i2 = 200;
        }
        return getOnLinWatchFaceMoveV2(str, str2, i, i2);
    }

    @aa1
    public static final HashMap<String, Object> getOnLinWatchFaceV2(@aa1 String id, boolean z) {
        Intrinsics.X0O(id, "id");
        HashMap<String, Object> map = new HashMap<>();
        map.put("identity", id);
        BleCache bleCache = BleCache.INSTANCE;
        map.put("bleName", bleCache.getMBleName());
        map.put("flag", bleCache.getMFirmwareFlag());
        map.put("typeGroupFlag", Boolean.valueOf(z));
        return map;
    }

    public static /* synthetic */ HashMap getOnLinWatchFaceV2$default(String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = i72.OXO1.O001I();
        }
        return getOnLinWatchFaceV2(str, z);
    }

    @aa1
    public static final HashMap<String, String> getOrderStatusBody(@aa1 String identity, @aa1 String orderNum, @aa1 String orderType) {
        Intrinsics.X0O(identity, "identity");
        Intrinsics.X0O(orderNum, "orderNum");
        Intrinsics.X0O(orderType, "orderType");
        HashMap<String, String> map = new HashMap<>();
        map.put("identity", identity);
        map.put("orderNum", orderNum);
        map.put("orderType", orderType);
        return map;
    }

    @aa1
    public static final HashMap<String, String> getPayMacAddressBody() {
        HashMap<String, String> map = new HashMap<>();
        BleCache bleCache = BleCache.INSTANCE;
        map.put("bleName", bleCache.getMBleName());
        map.put("flag", bleCache.getMFirmwareFlag());
        map.put("version", BaseBleCache.getString$default(bleCache, BleKey.FIRMWARE_VERSION, null, null, 6, null));
        map.put("oldMacAddress", oe5.IXO0OOi(bleCache.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null));
        map.put("androidVersion", AppUtils.getAppVersionName());
        return map;
    }

    @aa1
    public static final HashMap<String, String> getPointsPackBody() {
        HashMap<String, String> map = new HashMap<>();
        map.put("projectId", PROJECT_ID);
        return map;
    }

    @aa1
    public static final HashMap<String, String> getPurchaseHistoryWatchFace(@aa1 String id) {
        Intrinsics.X0O(id, "id");
        HashMap<String, String> map = new HashMap<>();
        map.put("identity", id);
        return map;
    }

    public static /* synthetic */ HashMap getPurchaseHistoryWatchFace$default(String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = i72.OXO1.O001I();
        }
        return getPurchaseHistoryWatchFace(str);
    }

    @aa1
    public static final HashMap<String, String> getRegisterVerificationCodeBody(@aa1 String userName, @aa1 String password, @aa1 String verificationCode, @aa1 String verifyPassword, @aa1 String nickname) {
        Intrinsics.X0O(userName, "userName");
        Intrinsics.X0O(password, "password");
        Intrinsics.X0O(verificationCode, "verificationCode");
        Intrinsics.X0O(verifyPassword, "verifyPassword");
        Intrinsics.X0O(nickname, "nickname");
        HashMap<String, String> map = new HashMap<>();
        map.put("projectId", PROJECT_ID);
        map.put("userName", userName);
        map.put("password", password);
        map.put("verificationCode", verificationCode);
        map.put("verifyPassword", verifyPassword);
        if (nickname.length() > 0) {
            map.put("nickName", nickname);
        }
        return map;
    }

    public static /* synthetic */ HashMap getRegisterVerificationCodeBody$default(String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 16) != 0) {
            str5 = "";
        }
        return getRegisterVerificationCodeBody(str, str2, str3, str4, str5);
    }

    @aa1
    public static final HashMap<String, String> getResetPasswordBody(@aa1 String email, @aa1 String newPassword, @aa1 String verificationCode) {
        Intrinsics.X0O(email, "email");
        Intrinsics.X0O(newPassword, "newPassword");
        Intrinsics.X0O(verificationCode, "verificationCode");
        HashMap<String, String> map = new HashMap<>();
        map.put("projectId", PROJECT_ID);
        map.put("userName", email);
        map.put("password", newPassword);
        map.put("verificationCode", verificationCode);
        return map;
    }

    @aa1
    public static final HashMap<String, String> getSelectByKey(@aa1 String key) {
        Intrinsics.X0O(key, "key");
        HashMap<String, String> map = new HashMap<>();
        map.put("key", key);
        return map;
    }

    public static /* synthetic */ HashMap getSelectByKey$default(String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "UseNewKey_COFIT";
        }
        return getSelectByKey(str);
    }

    @aa1
    public static final HashMap<String, String> getSetEmailBody(@aa1 String identity, @aa1 String email, @aa1 String verificationCode) {
        Intrinsics.X0O(identity, "identity");
        Intrinsics.X0O(email, "email");
        Intrinsics.X0O(verificationCode, "verificationCode");
        HashMap<String, String> map = new HashMap<>();
        map.put("identity", identity);
        map.put("email", email);
        map.put("verificationCode", verificationCode);
        map.put("country", Utils.getApp().getResources().getConfiguration().locale.getCountry());
        return map;
    }

    @aa1
    public static final HashMap<String, String> getSetReceivePhoneBody(@aa1 String identity, @aa1 String receivePhone) {
        Intrinsics.X0O(identity, "identity");
        Intrinsics.X0O(receivePhone, "receivePhone");
        HashMap<String, String> map = new HashMap<>();
        map.put("identity", identity);
        map.put(SetReceivePhone.RECEIVE_PHONE, receivePhone);
        return map;
    }

    @aa1
    public static final HashMap<String, String> getSparkAuthorizeBody() {
        HashMap<String, String> map = new HashMap<>();
        BleCache bleCache = BleCache.INSTANCE;
        map.put("bleName", bleCache.getMBleName());
        map.put("flag", bleCache.getMFirmwareFlag());
        map.put("mac", oe5.IXO0OOi(bleCache.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null));
        return map;
    }

    @aa1
    public static final HashMap<String, String> getStockAddBody(@aa1 String identity, int i) {
        Intrinsics.X0O(identity, "identity");
        HashMap<String, String> map = new HashMap<>();
        map.put("identity", identity);
        map.put("projectId", PROJECT_ID);
        map.put("stockId", String.valueOf(i));
        return map;
    }

    @aa1
    public static final HashMap<String, String> getStockListBody(@aa1 String identity) {
        Intrinsics.X0O(identity, "identity");
        HashMap<String, String> map = new HashMap<>();
        map.put("identity", identity);
        map.put("projectId", PROJECT_ID);
        return map;
    }

    @aa1
    public static final HashMap<String, String> getStockRemoveBody(@aa1 String identity, int i) {
        Intrinsics.X0O(identity, "identity");
        HashMap<String, String> map = new HashMap<>();
        map.put("identity", identity);
        map.put("stockId", String.valueOf(i));
        return map;
    }

    @aa1
    public static final HashMap<String, String> getStockSearchBody(@aa1 String identity, @aa1 String queryKey) {
        Intrinsics.X0O(identity, "identity");
        Intrinsics.X0O(queryKey, "queryKey");
        HashMap<String, String> map = new HashMap<>();
        map.put("identity", identity);
        map.put("projectId", PROJECT_ID);
        map.put("queryKey", queryKey);
        return map;
    }

    @aa1
    public static final HashMap<String, String> getTempSignedPutUrlBody(@aa1 String identity, @aa1 String uploadOSSFilePath) {
        Intrinsics.X0O(identity, "identity");
        Intrinsics.X0O(uploadOSSFilePath, "uploadOSSFilePath");
        HashMap<String, String> map = new HashMap<>();
        map.put("identity", identity);
        map.put(GetTempSignedPutUrl.UPLOAD_OSSFILEPATH, uploadOSSFilePath);
        return map;
    }

    @aa1
    public static final HashMap<String, String> getTeraBoxRefreshTokenBody(@aa1 String token) {
        Intrinsics.X0O(token, "token");
        HashMap<String, String> map = new HashMap<>();
        map.put("token", token);
        map.put("projectId", PROJECT_ID);
        return map;
    }

    @aa1
    public static final HashMap<String, String> getTeraBoxTokenBody(@aa1 String code) {
        Intrinsics.X0O(code, "code");
        HashMap<String, String> map = new HashMap<>();
        BleCache bleCache = BleCache.INSTANCE;
        map.put("bleName", bleCache.getMBleName());
        map.put("flag", bleCache.getMFirmwareFlag());
        map.put("mac", oe5.IXO0OOi(bleCache.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null));
        map.put("projectId", PROJECT_ID);
        map.put("code", code);
        return map;
    }

    @aa1
    public static final HashMap<String, String> getTeraBoxTokenInfoBody(@aa1 String token) {
        Intrinsics.X0O(token, "token");
        HashMap<String, String> map = new HashMap<>();
        map.put("token", token);
        map.put("projectId", PROJECT_ID);
        return map;
    }

    @aa1
    public static final HashMap<String, String> getThirdPartyBody(@aa1 String platform, @aa1 String openId, @aa1 String accessToken, @aa1 String extInfo, @aa1 String email, @aa1 String displayName) {
        Intrinsics.X0O(platform, "platform");
        Intrinsics.X0O(openId, "openId");
        Intrinsics.X0O(accessToken, "accessToken");
        Intrinsics.X0O(extInfo, "extInfo");
        Intrinsics.X0O(email, "email");
        Intrinsics.X0O(displayName, "displayName");
        HashMap<String, String> map = new HashMap<>();
        map.put("projectId", PROJECT_ID);
        map.put("platform", platform);
        map.put("openId", openId);
        map.put("accessToken", accessToken);
        map.put("email", email);
        map.put("nickName", displayName);
        if (i72.OXO1.IXO0OOi() && Intrinsics.XOO0ii0(StringsKt__StringsKt.iX1X1(platform).toString(), StringsKt__StringsKt.iX1X1(nx1.XIi00iiXO).toString())) {
            map.put("extInfo", extInfo);
            String string = a01.OXO1.OXO1().getString(b01.OX0X1O10X, "");
            map.put("phoneIdentity", UtilsKt.XX1Oi());
            map.put("oldOpenId", string);
        }
        map.put("country", Utils.getApp().getResources().getConfiguration().locale.getCountry());
        return map;
    }

    public static /* synthetic */ HashMap getThirdPartyBody$default(String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 8) != 0) {
            str4 = "";
        }
        if ((i & 16) != 0) {
            str5 = "";
        }
        if ((i & 32) != 0) {
            str6 = "";
        }
        return getThirdPartyBody(str, str2, str3, str4, str5, str6);
    }

    @aa1
    public static final HashMap<String, String> getTranslatorTextBody(@aa1 String text, @aa1 String translationLanguage) {
        Intrinsics.X0O(text, "text");
        Intrinsics.X0O(translationLanguage, "translationLanguage");
        HashMap<String, String> map = new HashMap<>();
        map.put(ToTranslatorText.FLAG_TEXT_FORM, text);
        map.put(ToTranslatorText.FLAG_TRANSLATION_LANGUAGE, translationLanguage);
        map.put("source", "microsoft");
        map.put(ToTranslatorText.FLAG_ORIGINAL_LANGUAGE, "auto");
        return map;
    }

    @aa1
    public static final HashMap<String, String> getUpdateDeviceInfoBody(@aa1 AppUser appUser) {
        Intrinsics.X0O(appUser, "appUser");
        HashMap<String, String> map = new HashMap<>();
        map.put("identity", appUser.getIdentity());
        map.put("projectId", String.valueOf(appUser.getProjectId()));
        BleCache bleCache = BleCache.INSTANCE;
        map.put("name", bleCache.getMBleName());
        map.put("address", oe5.IXO0OOi(bleCache.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null));
        map.put("platform", bleCache.getMPlatform());
        map.put("prototype", bleCache.getMPrototype());
        map.put("firmwareFlag", bleCache.getMFirmwareFlag());
        map.put("agpsType", String.valueOf(bleCache.getMAGpsType()));
        map.put("version", BaseBleCache.getString$default(bleCache, BleKey.FIRMWARE_VERSION, null, null, 6, null));
        return map;
    }

    @aa1
    public static final HashMap<String, String> getUploadNoLoginUserInfo(@aa1 AppUser mAppUser) {
        Intrinsics.X0O(mAppUser, "mAppUser");
        HashMap<String, String> map = new HashMap<>();
        map.put("projectId", PROJECT_ID);
        map.put("nickname", mAppUser.getNickname());
        map.put("birthday", mAppUser.getBirthday());
        map.put("gender", String.valueOf(mAppUser.getGender()));
        map.put("unit", String.valueOf(mAppUser.getUnit()));
        map.put("height", String.valueOf(mAppUser.getHeight()));
        map.put("weight", String.valueOf(mAppUser.getWeight()));
        map.put("extraInfo", mAppUser.getExtraInfo());
        map.put("country", mAppUser.getCountry());
        map.put("city", mAppUser.getCity());
        map.put("longitude", String.valueOf(mAppUser.getLongitude()));
        map.put("latitude", String.valueOf(mAppUser.getLatitude()));
        map.put("server", String.valueOf(mAppUser.getServer()));
        map.put("phoneOs", String.valueOf(mAppUser.getPhoneOs()));
        map.put("osVersion", mAppUser.getOsVersion());
        map.put("phoneModel", mAppUser.getPhoneModel());
        map.put("phoneIdentity", mAppUser.getPhoneIdentity());
        map.put("settings", mAppUser.getSettings());
        return map;
    }

    @aa1
    public static final HashMap<String, String> getUserGameDetailBody(@aa1 String gid) {
        Intrinsics.X0O(gid, "gid");
        HashMap<String, String> map = new HashMap<>();
        map.put(GetGameDetail.GAME_ID, gid);
        return map;
    }

    @aa1
    public static final HashMap<String, String> getUserIdBody(@aa1 String identity) {
        Intrinsics.X0O(identity, "identity");
        HashMap<String, String> map = new HashMap<>();
        map.put("userId", identity);
        return map;
    }

    @aa1
    public static final HashMap<String, String> getUserIdentityBody(@aa1 AppUser mAppUser) {
        Intrinsics.X0O(mAppUser, "mAppUser");
        HashMap<String, String> map = new HashMap<>();
        map.put("identity", mAppUser.getIdentity());
        return map;
    }

    @aa1
    public static final HashMap<String, String> getUserInfoBody(@aa1 AppUser mAppUser) {
        Intrinsics.X0O(mAppUser, "mAppUser");
        HashMap<String, String> map = new HashMap<>();
        map.put("identity", mAppUser.getIdentity());
        map.put("nickname", mAppUser.getNickname());
        map.put("birthday", mAppUser.getBirthday());
        map.put("gender", String.valueOf(mAppUser.getGender()));
        map.put("height", String.valueOf(mAppUser.getHeight()));
        map.put("weight", String.valueOf(mAppUser.getWeight()));
        map.put("extraInfo", mAppUser.getExtraInfo());
        return map;
    }

    @aa1
    public static final HashMap<String, String> getUserPointsMemberBody(@aa1 String identity) {
        Intrinsics.X0O(identity, "identity");
        HashMap<String, String> map = new HashMap<>();
        map.put("identity", identity);
        return map;
    }

    @aa1
    public static final HashMap<String, String> getVerificationCodeBody(@aa1 String email, int i) {
        Intrinsics.X0O(email, "email");
        HashMap<String, String> map = new HashMap<>();
        map.put("projectId", PROJECT_ID);
        map.put("userName", email);
        map.put("language", Utils.getApp().getResources().getConfiguration().locale.getLanguage());
        map.put("verificationType", String.valueOf(i));
        return map;
    }

    @aa1
    public static final HashMap<String, String> getVerificationCodeCheckBody(@aa1 String email, @aa1 String verificationCode) {
        Intrinsics.X0O(email, "email");
        Intrinsics.X0O(verificationCode, "verificationCode");
        HashMap<String, String> map = new HashMap<>();
        map.put("projectId", PROJECT_ID);
        map.put("userName", email);
        map.put("verificationCode", verificationCode);
        return map;
    }

    @aa1
    public static final HashMap<String, String> getWatchFaceBannerBody() {
        HashMap<String, String> map = new HashMap<>();
        BleCache bleCache = BleCache.INSTANCE;
        map.put("bleName", bleCache.getMBleName());
        map.put("flag", bleCache.getMFirmwareFlag());
        return map;
    }

    @aa1
    public static final HashMap<String, String> getWatchFaceDetails(@aa1 String identity, @aa1 String id) {
        Intrinsics.X0O(identity, "identity");
        Intrinsics.X0O(id, "id");
        HashMap<String, String> map = new HashMap<>();
        map.put("identity", identity);
        map.put("id", id);
        return map;
    }

    @aa1
    public static final HashMap<String, String> getWatchFaceDetailsClick(@aa1 String id) {
        Intrinsics.X0O(id, "id");
        HashMap<String, String> map = new HashMap<>();
        map.put("wid", id);
        return map;
    }

    @aa1
    public static final HashMap<String, String> getWatchFaceDetailsList(@aa1 String identity, @aa1 String id) {
        Intrinsics.X0O(identity, "identity");
        Intrinsics.X0O(id, "id");
        HashMap<String, String> map = new HashMap<>();
        map.put("identity", identity);
        map.put("wid", id);
        BleCache bleCache = BleCache.INSTANCE;
        map.put("bleName", bleCache.getMBleName());
        map.put("flag", bleCache.getMFirmwareFlag());
        return map;
    }

    @aa1
    public static final HashMap<String, String> getWeatherForecastBody(double d, double d2) {
        HashMap<String, String> map = new HashMap<>();
        map.put("projectId", PROJECT_ID);
        map.put("lon", String.valueOf(d));
        map.put("lat", String.valueOf(d2));
        BleCache bleCache = BleCache.INSTANCE;
        map.put("bleName", bleCache.getMBleName());
        map.put("flag", bleCache.getMFirmwareFlag());
        return map;
    }

    @aa1
    public static final HashMap<String, String> getWeatherRealtimeBody(double d, double d2) {
        HashMap<String, String> map = new HashMap<>();
        map.put("projectId", PROJECT_ID);
        map.put("lon", String.valueOf(d));
        map.put("lat", String.valueOf(d2));
        BleCache bleCache = BleCache.INSTANCE;
        map.put("bleName", bleCache.getMBleName());
        map.put("flag", bleCache.getMFirmwareFlag());
        return map;
    }

    @aa1
    public static final HashMap<String, String> userMigrateBody(@aa1 String identity, @aa1 String goalService) {
        Intrinsics.X0O(identity, "identity");
        Intrinsics.X0O(goalService, "goalService");
        HashMap<String, String> map = new HashMap<>();
        map.put("identity", identity);
        map.put("goalServer", goalService);
        return map;
    }
}
