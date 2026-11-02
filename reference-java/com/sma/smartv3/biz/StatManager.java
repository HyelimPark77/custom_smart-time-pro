package com.sma.smartv3.biz;

import android.app.Activity;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.X0iO1XX;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.yn0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.facebook.internal.security.CertificateUtil;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.UploadBaiduServiceCallLogData;
import com.sma.smartv3.model.UploadData;
import com.sma.smartv3.model.UploadDownloadInfo;
import com.sma.smartv3.model.UploadDownloadInfoData;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.RequestBodyKt;
import com.szabh.smable3.component.BleCache;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nStatManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatManager.kt\ncom/sma/smartv3/biz/StatManager\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,95:1\n19#2:96\n15#2:97\n258#3,11:98\n279#3:126\n258#3,11:127\n279#3:155\n359#4,17:109\n359#4,17:138\n*S KotlinDebug\n*F\n+ 1 StatManager.kt\ncom/sma/smartv3/biz/StatManager\n*L\n30#1:96\n30#1:97\n48#1:98,11\n48#1:126\n78#1:127,11\n78#1:155\n48#1:109,17\n78#1:138,17\n*E\n"})
public final class StatManager {

    @aa1
    public static final StatManager OXO1 = new StatManager();

    @aa1
    public static final String XIi00iiXO = "StatManager";

    public static /* synthetic */ void O00(StatManager statManager, String str, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        statManager.XO0O10(str, j, i, i2);
    }

    /* JADX INFO: renamed from: iO */
    public static /* synthetic */ void m38112iO(StatManager statManager, int i, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = "";
        }
        statManager.XIi00iiXO(i, str);
    }

    public final String OXO1(long j) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
        String str = String.format("%dkb", Arrays.copyOf(new Object[]{Long.valueOf(j / ((long) 1024))}, 1));
        Intrinsics.O10IXXX0X(str, "format(...)");
        return str;
    }

    public final void XIi00iiXO(int i, @aa1 String curTypeRemark) {
        Intrinsics.X0O(curTypeRemark, "curTypeRemark");
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        if (objFromJson != null) {
            appUser = objFromJson;
        }
        UploadData uploadData = new UploadData();
        uploadData.setIdentity(((AppUser) appUser).getIdentity());
        UploadBaiduServiceCallLogData uploadBaiduServiceCallLogData = new UploadBaiduServiceCallLogData();
        BleCache bleCache = BleCache.INSTANCE;
        uploadBaiduServiceCallLogData.setBleName(bleCache.getMBleName());
        uploadBaiduServiceCallLogData.setFirmwareFlag(bleCache.getMFirmwareFlag());
        uploadBaiduServiceCallLogData.setProjectId(58);
        uploadBaiduServiceCallLogData.setPlatform(2);
        String appVersionName = AppUtils.getAppVersionName();
        Intrinsics.O10IXXX0X(appVersionName, "getAppVersionName(...)");
        uploadBaiduServiceCallLogData.setAppVersion(appVersionName);
        uploadBaiduServiceCallLogData.setCallType(i);
        uploadBaiduServiceCallLogData.setCallTime(System.currentTimeMillis());
        uploadBaiduServiceCallLogData.setMacAddress(oe5.IXO0OOi(bleCache.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null));
        uploadBaiduServiceCallLogData.setRemark(curTypeRemark);
        uploadData.setData(X0iO1XX.I0iXXO(uploadBaiduServiceCallLogData));
        LogUtils.m11128d("StatManager uploadBaiduServiceCallLog -> " + new Gson().toJson(uploadData));
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        final O1XIiIO<Object> o1XIiIO = new O1XIiIO<Object>() { // from class: com.sma.smartv3.biz.StatManager$uploadBaiduServiceCallLog$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                LogUtils.m11128d("StatManager handleError -> " + error);
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleResponse(Object obj) {
                LogUtils.m11128d("StatManager handleResponse -> " + obj);
            }
        };
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        Api api = Api.INSTANCE;
        i1o0oxo1o.OXO1("JSON Api.BASE_URL -> " + api.getBASE_URL() + " , url = /baiduApi/uploadServiceCallLog");
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(api.getBASE_URL(), "/baiduApi/uploadServiceCallLog");
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + "/baiduApi/uploadServiceCallLog";
        final O1XIiIO<Response<Object>> o1XIiIO2 = new O1XIiIO<Response<Object>>() { // from class: com.sma.smartv3.biz.StatManager$uploadBaiduServiceCallLog$$inlined$postJson$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<Object> response) {
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
        AndroidNetworking.post(str).addApplicationJsonBody(uploadData).setTag((Object) str).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, Object.class), new ParsedRequestListener<Response<Object>>() { // from class: com.sma.smartv3.biz.StatManager$uploadBaiduServiceCallLog$$inlined$postJson$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<Object> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                o1XIiIO2.handleError(String.valueOf(aNError));
            }
        });
    }

    public final void XO0O10(@aa1 String filePath, long j, int i, int i2) {
        Intrinsics.X0O(filePath, "filePath");
        UploadDownloadInfoData uploadDownloadInfoData = new UploadDownloadInfoData();
        uploadDownloadInfoData.setFilePath(filePath);
        uploadDownloadInfoData.setFileSize(OXO1.OXO1(j));
        uploadDownloadInfoData.setFileCategory(String.valueOf(i));
        BleCache bleCache = BleCache.INSTANCE;
        uploadDownloadInfoData.setBleName(bleCache.getMBleName());
        uploadDownloadInfoData.setFirmwareFlag(bleCache.getMFirmwareFlag());
        uploadDownloadInfoData.setProjectId(RequestBodyKt.PROJECT_ID);
        if (i2 != -1) {
            uploadDownloadInfoData.setEleId(String.valueOf(i2));
        }
        LogUtils.m11128d("StatManager uploadDownloadInfo -> " + new Gson().toJson(uploadDownloadInfoData));
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        final O1XIiIO<Object> o1XIiIO = new O1XIiIO<Object>() { // from class: com.sma.smartv3.biz.StatManager$uploadDownloadInfo$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                LogUtils.m11128d("StatManager handleError -> " + error);
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleResponse(Object obj) {
                LogUtils.m11128d("StatManager handleResponse -> " + obj);
            }
        };
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        Api api = Api.INSTANCE;
        i1o0oxo1o.OXO1("JSON Api.BASE_URL -> " + api.getBASE_URL() + " , url = " + UploadDownloadInfo.URL);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(api.getBASE_URL(), UploadDownloadInfo.URL);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + UploadDownloadInfo.URL;
        final O1XIiIO<Response<Object>> o1XIiIO2 = new O1XIiIO<Response<Object>>() { // from class: com.sma.smartv3.biz.StatManager$uploadDownloadInfo$$inlined$postJson$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<Object> response) {
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
        AndroidNetworking.post(str).addApplicationJsonBody(uploadDownloadInfoData).setTag((Object) str).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, Object.class), new ParsedRequestListener<Response<Object>>() { // from class: com.sma.smartv3.biz.StatManager$uploadDownloadInfo$$inlined$postJson$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<Object> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                o1XIiIO2.handleError(String.valueOf(aNError));
            }
        });
    }
}
