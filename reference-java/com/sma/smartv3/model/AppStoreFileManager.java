package com.sma.smartv3.model;

import android.app.Activity;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iI0OiO;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.android.mltcode.paycertificationapi.yn0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.HttpProgressCallback;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.AppStoreFileListSearch;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.RequestBodyKt;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleAppFile;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.OXO1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nFileTransmission.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileTransmission.kt\ncom/sma/smartv3/model/AppStoreFileManager\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,243:1\n235#2,11:244\n246#2:256\n256#2:266\n235#2,11:267\n246#2:279\n256#2:289\n1#3:255\n1#3:278\n278#4,8:257\n298#4:265\n278#4,8:280\n298#4:288\n*S KotlinDebug\n*F\n+ 1 FileTransmission.kt\ncom/sma/smartv3/model/AppStoreFileManager\n*L\n170#1:244,11\n170#1:256\n170#1:266\n189#1:267,11\n189#1:279\n189#1:289\n170#1:255\n189#1:278\n170#1:257,8\n170#1:265\n189#1:280,8\n189#1:288\n*E\n"})
public final class AppStoreFileManager {

    @aa1
    public static final AppStoreFileManager INSTANCE = new AppStoreFileManager();

    private AppStoreFileManager() {
    }

    public static /* synthetic */ void downloadAppFile$default(AppStoreFileManager appStoreFileManager, String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        appStoreFileManager.downloadAppFile(str, str2, i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getAppStoreFileList$default(AppStoreFileManager appStoreFileManager, String str, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "1";
        }
        if ((i & 2) != 0) {
            function1 = null;
        }
        appStoreFileManager.getAppStoreFileList(str, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getAudioBookFileList$default(AppStoreFileManager appStoreFileManager, String str, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "2";
        }
        if ((i & 2) != 0) {
            function1 = null;
        }
        appStoreFileManager.getAudioBookFileList(str, function1);
    }

    public final void downloadAppFile(@aa1 String path, @aa1 final String fileName, final int i, final int i2) {
        Intrinsics.X0O(path, "path");
        Intrinsics.X0O(fileName, "fileName");
        i1O0OXO1O.OXO1.OXO1("appStore downloadAppFile path = " + path + "  , fileName = " + fileName + " , mBleAppFile -> " + i + "  , mOpType = " + i2);
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        String absolutePath = uz0.I0iXXO(sz0.OXO1).getAbsolutePath();
        Intrinsics.O10IXXX0X(absolutePath, "getAbsolutePath(...)");
        netWorkUtils.download(path, absolutePath, fileName, new HttpProgressCallback<String>() { // from class: com.sma.smartv3.model.AppStoreFileManager.downloadAppFile.1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                ToastUtils.showLong("Download error  \n  " + error, new Object[0]);
            }

            @Override // com.sma.androidnetworklib.method.HttpProgressCallback
            public void handleProgress(int i3) {
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleResponse(String str) {
                BleConnector.INSTANCE.sendStream(BleKey.APP_FILE, new BleAppFile(fileName, i2, iI0OiO.m2063OX(new File(uz0.I0iXXO(sz0.OXO1).getAbsolutePath(), fileName))).toByteArray(), i);
            }
        });
    }

    public final void getAppStoreFileList(@aa1 String appModuleId, @tb1 final Function1<? super List<AppStoreFileList>, Unit> function1) {
        Intrinsics.X0O(appModuleId, "appModuleId");
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> appStoreFileListBody = RequestBodyKt.getAppStoreFileListBody(appModuleId);
        final O1XIiIO<AppStoreFileList[]> o1XIiIO = new O1XIiIO<AppStoreFileList[]>() { // from class: com.sma.smartv3.model.AppStoreFileManager.getAppStoreFileList.1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                LogUtils.m11128d("getAppStoreFileList error -> " + error);
                ToastUtils.showLong(error, new Object[0]);
                Function1<List<AppStoreFileList>, Unit> function2 = function1;
                if (function2 != null) {
                    function2.invoke2(null);
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleResponse(AppStoreFileList[] appStoreFileListArr) {
                LogUtils.m11128d("getAppStoreFileList -> " + (appStoreFileListArr != null ? Integer.valueOf(appStoreFileListArr.length) : null));
                Function1<List<AppStoreFileList>, Unit> function2 = function1;
                if (function2 != null) {
                    function2.invoke2(appStoreFileListArr != null ? ArraysKt___ArraysKt.OXI0X0(appStoreFileListArr) : null);
                }
            }
        };
        Map<String, String> headersMap = netWorkUtils.getHeadersMap();
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), AppStoreFileListSearch.URL);
        String str = strConvertBaseUrl + AppStoreFileListSearch.URL;
        Map<String, ? extends Object> mapX111IO = OXO1.X111IO(appStoreFileListBody);
        mapX111IO.putAll(headersMap);
        Unit unit = Unit.OXO1;
        netWorkUtils.printParam(str, mapX111IO);
        NetWork netWork = NetWork.OXO1;
        String str2 = strConvertBaseUrl + AppStoreFileListSearch.URL;
        final O1XIiIO<Response<AppStoreFileList[]>> o1XIiIO2 = new O1XIiIO<Response<AppStoreFileList[]>>() { // from class: com.sma.smartv3.model.AppStoreFileManager$getAppStoreFileList$$inlined$postV2$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleResponse(Response<AppStoreFileList[]> response) {
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
        };
        AndroidNetworking.post(str2).addHeaders(headersMap).addBodyParameter((Map<String, String>) appStoreFileListBody).setTag((Object) str2).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, AppStoreFileList[].class), new ParsedRequestListener<Response<AppStoreFileList[]>>() { // from class: com.sma.smartv3.model.AppStoreFileManager$getAppStoreFileList$$inlined$postV2$default$2
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

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onResponse(Response<AppStoreFileList[]> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }
        });
    }

    public final void getAudioBookFileList(@aa1 String appModuleId, @tb1 final Function1<? super List<AppFileDetail>, Unit> function1) {
        Intrinsics.X0O(appModuleId, "appModuleId");
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> appStoreFileListBody = RequestBodyKt.getAppStoreFileListBody(appModuleId);
        final O1XIiIO<AppFileDetail[]> o1XIiIO = new O1XIiIO<AppFileDetail[]>() { // from class: com.sma.smartv3.model.AppStoreFileManager.getAudioBookFileList.1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                LogUtils.m11128d("getAppStoreFileList error -> " + error);
                ToastUtils.showLong(error, new Object[0]);
                Function1<List<AppFileDetail>, Unit> function2 = function1;
                if (function2 != null) {
                    function2.invoke2(null);
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleResponse(AppFileDetail[] appFileDetailArr) {
                LogUtils.m11128d("getAppStoreFileList -> " + (appFileDetailArr != null ? Integer.valueOf(appFileDetailArr.length) : null));
                if (appFileDetailArr != null) {
                    if (!(appFileDetailArr.length == 0)) {
                        Function1<List<AppFileDetail>, Unit> function2 = function1;
                        if (function2 != null) {
                            function2.invoke2(ArraysKt___ArraysKt.OXI0X0(appFileDetailArr));
                            return;
                        }
                        return;
                    }
                }
                Function1<List<AppFileDetail>, Unit> function3 = function1;
                if (function3 != null) {
                    function3.invoke2(null);
                }
            }
        };
        Map<String, String> headersMap = netWorkUtils.getHeadersMap();
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), AppStoreFileListSearch.URL);
        String str = strConvertBaseUrl + AppStoreFileListSearch.URL;
        Map<String, ? extends Object> mapX111IO = OXO1.X111IO(appStoreFileListBody);
        mapX111IO.putAll(headersMap);
        Unit unit = Unit.OXO1;
        netWorkUtils.printParam(str, mapX111IO);
        NetWork netWork = NetWork.OXO1;
        String str2 = strConvertBaseUrl + AppStoreFileListSearch.URL;
        final O1XIiIO<Response<AppFileDetail[]>> o1XIiIO2 = new O1XIiIO<Response<AppFileDetail[]>>() { // from class: com.sma.smartv3.model.AppStoreFileManager$getAudioBookFileList$$inlined$postV2$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleResponse(Response<AppFileDetail[]> response) {
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
        };
        AndroidNetworking.post(str2).addHeaders(headersMap).addBodyParameter((Map<String, String>) appStoreFileListBody).setTag((Object) str2).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, AppFileDetail[].class), new ParsedRequestListener<Response<AppFileDetail[]>>() { // from class: com.sma.smartv3.model.AppStoreFileManager$getAudioBookFileList$$inlined$postV2$default$2
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

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onResponse(Response<AppFileDetail[]> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }
        });
    }
}
