package com.sma.smartv3.biz;

import android.app.Activity;
import android.text.TextUtils;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.yn0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.ANRequest;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.androidnetworking.interfaces.StringRequestListener;
import com.blankj.utilcode.util.LogUtils;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.GetTempSignedPutUrl;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.RequestBodyKt;
import com.xmly.businesssdk.trace.config.TraceConfiguration;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nUploadFileManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UploadFileManager.kt\ncom/sma/smartv3/biz/UploadFileManager\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,106:1\n126#2,11:107\n146#2:126\n200#3,7:118\n218#3:125\n*S KotlinDebug\n*F\n+ 1 UploadFileManager.kt\ncom/sma/smartv3/biz/UploadFileManager\n*L\n40#1:107,11\n40#1:126\n40#1:118,7\n40#1:125\n*E\n"})
public final class UploadFileManager {

    @aa1
    public static final UploadFileManager OXO1 = new UploadFileManager();

    @aa1
    public static final String XIi00iiXO = "UploadFileManager";

    /* JADX INFO: renamed from: iO */
    @aa1
    public static final String f50908iO = "applog/Android";

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void XOO0ii0(UploadFileManager uploadFileManager, String str, File file, O1XIiIO o1XIiIO, int i, Object obj) {
        if ((i & 4) != 0) {
            o1XIiIO = null;
        }
        uploadFileManager.IiI10X(str, file, o1XIiIO);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: iO */
    public static /* synthetic */ void m38113iO(UploadFileManager uploadFileManager, String str, String str2, O1XIiIO o1XIiIO, int i, Object obj) {
        if ((i & 4) != 0) {
            o1XIiIO = null;
        }
        uploadFileManager.XIi00iiXO(str, str2, o1XIiIO);
    }

    public final void IiI10X(@aa1 String identity, @aa1 final File file, @tb1 final O1XIiIO<String> o1XIiIO) {
        Intrinsics.X0O(identity, "identity");
        Intrinsics.X0O(file, "file");
        LogUtils.m11128d(XIi00iiXO + " uploadLogFile -> " + identity + ", " + file);
        XIi00iiXO(identity, f50908iO + "/" + file.getName(), new O1XIiIO<String>() { // from class: com.sma.smartv3.biz.UploadFileManager$uploadLogFile$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(final String str) {
                if (!TextUtils.isEmpty(str)) {
                    ANRequest aNRequestBuild = AndroidNetworking.put(str).setTag((Object) str).addFileBody(file).setPriority(Priority.HIGH).build();
                    final O1XIiIO<String> o1XIiIO2 = o1XIiIO;
                    aNRequestBuild.getAsString(new StringRequestListener() { // from class: com.sma.smartv3.biz.UploadFileManager$uploadLogFile$1$handleResponse$1
                        @Override // com.androidnetworking.interfaces.StringRequestListener
                        public void onError(ANError aNError) {
                            String errorBody;
                            LogUtils.m11128d("uploadLogFile -> " + (aNError != null ? aNError.getErrorDetail() : null));
                            O1XIiIO<String> o1XIiIO3 = o1XIiIO2;
                            if (o1XIiIO3 != null) {
                                if (aNError == null || (errorBody = aNError.getErrorBody()) == null) {
                                    errorBody = "Error";
                                }
                                o1XIiIO3.handleError(errorBody);
                            }
                        }

                        @Override // com.androidnetworking.interfaces.StringRequestListener
                        public void onResponse(String str2) {
                            O1XIiIO<String> o1XIiIO3 = o1XIiIO2;
                            if (o1XIiIO3 != null) {
                                o1XIiIO3.handleResponse(str);
                            }
                        }
                    });
                } else {
                    O1XIiIO<String> o1XIiIO3 = o1XIiIO;
                    if (o1XIiIO3 != null) {
                        o1XIiIO3.handleError("Error");
                    }
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                O1XIiIO<String> o1XIiIO2 = o1XIiIO;
                if (o1XIiIO2 != null) {
                    o1XIiIO2.handleError(error);
                }
            }
        });
    }

    public final boolean O00() {
        return System.currentTimeMillis() - a01.OXO1.IiI10X().getLong(b01.f5623I0) > TraceConfiguration.DEFAULT_SESSION_TIMEOUT;
    }

    @aa1
    public final String OXO1() {
        return XIi00iiXO;
    }

    public final void XIi00iiXO(@aa1 String identity, @aa1 String uploadOSSFilePath, @tb1 final O1XIiIO<String> o1XIiIO) {
        Intrinsics.X0O(identity, "identity");
        Intrinsics.X0O(uploadOSSFilePath, "uploadOSSFilePath");
        LogUtils.m11128d(XIi00iiXO + " getTempSignedPutUrl -> " + identity + ", " + uploadOSSFilePath);
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> tempSignedPutUrlBody = RequestBodyKt.getTempSignedPutUrlBody(identity, uploadOSSFilePath);
        final O1XIiIO<String> o1XIiIO2 = new O1XIiIO<String>() { // from class: com.sma.smartv3.biz.UploadFileManager$getTempSignedPutUrl$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(String str) {
                LogUtils.m11128d(UploadFileManager.OXO1.OXO1() + " handleResponse -> " + str);
                if (TextUtils.isEmpty(str)) {
                    O1XIiIO<String> o1XIiIO3 = o1XIiIO;
                    if (o1XIiIO3 != null) {
                        o1XIiIO3.handleError("Error");
                        return;
                    }
                    return;
                }
                O1XIiIO<String> o1XIiIO4 = o1XIiIO;
                if (o1XIiIO4 != null) {
                    o1XIiIO4.handleResponse(str);
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                LogUtils.m11128d(UploadFileManager.OXO1.OXO1() + " handleError -> " + error);
                O1XIiIO<String> o1XIiIO3 = o1XIiIO;
                if (o1XIiIO3 != null) {
                    o1XIiIO3.handleError(error);
                }
            }
        };
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetTempSignedPutUrl.URL);
        netWorkUtils.printParam(strConvertBaseUrl + GetTempSignedPutUrl.URL, tempSignedPutUrlBody);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + GetTempSignedPutUrl.URL;
        final O1XIiIO<Response<String>> o1XIiIO3 = new O1XIiIO<Response<String>>() { // from class: com.sma.smartv3.biz.UploadFileManager$getTempSignedPutUrl$$inlined$get$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<String> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity2 = activity;
                O1XIiIO o1XIiIO4 = o1XIiIO2;
                C3006uq c3006uq = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO4);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO2, c3006uqLoadPopup);
            }
        };
        AndroidNetworking.get(str).addQueryParameter((Map<String, String>) tempSignedPutUrlBody).setTag((Object) str).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, String.class), new ParsedRequestListener<Response<String>>() { // from class: com.sma.smartv3.biz.UploadFileManager$getTempSignedPutUrl$$inlined$get$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<String> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO3.handleResponse(response);
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
                LogUtils.m11128d(sb.toString());
                if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                    numValueOf = Integer.valueOf(response.getCode());
                } else if (aNError != null) {
                    numValueOf = Integer.valueOf(aNError.getErrorCode());
                }
                o1XIiIO3.handleError(String.valueOf(numValueOf));
            }
        });
    }

    @aa1
    public final String XO0O10() {
        return f50908iO;
    }
}
