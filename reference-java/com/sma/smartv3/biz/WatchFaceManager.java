package com.sma.smartv3.biz;

import android.app.Activity;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.yn0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.blankj.utilcode.util.LogUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.model.OnlineWatchFaceV2;
import com.sma.smartv3.model.WatchFaceBanner;
import com.sma.smartv3.model.WatchFaceCategoryV2;
import com.sma.smartv3.model.WatchFaceDetail;
import com.sma.smartv3.model.WatchFaceInstallRecord;
import com.sma.smartv3.network.AddUserWatchDownloadRecord;
import com.sma.smartv3.network.AddWatchFaceClick;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.GetOnLinWatchFaceListV2;
import com.sma.smartv3.network.GetPurchaseHistoryList;
import com.sma.smartv3.network.GetUserWatchDownloadRecord;
import com.sma.smartv3.network.GetWatchFaceBanner;
import com.sma.smartv3.network.GetWatchFaceDetail;
import com.sma.smartv3.network.GetWatchFaceDetailList;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.RequestBodyKt;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nWatchFaceManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WatchFaceManager.kt\ncom/sma/smartv3/biz/WatchFaceManager\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,312:1\n198#2,8:313\n233#2:321\n198#2,8:322\n233#2:330\n235#2,11:331\n246#2:343\n256#2:353\n235#2,11:354\n246#2:366\n256#2:376\n235#2,11:377\n246#2:389\n256#2:399\n235#2,11:400\n246#2:412\n256#2:422\n235#2,11:423\n246#2:435\n256#2:445\n235#2,11:446\n246#2:458\n256#2:468\n235#2,11:469\n246#2:481\n256#2:491\n1#3:342\n1#3:365\n1#3:388\n1#3:411\n1#3:434\n1#3:457\n1#3:480\n278#4,8:344\n298#4:352\n278#4,8:367\n298#4:375\n278#4,8:390\n298#4:398\n278#4,8:413\n298#4:421\n278#4,8:436\n298#4:444\n278#4,8:459\n298#4:467\n278#4,8:482\n298#4:490\n*S KotlinDebug\n*F\n+ 1 WatchFaceManager.kt\ncom/sma/smartv3/biz/WatchFaceManager\n*L\n53#1:313,8\n53#1:321\n82#1:322,8\n82#1:330\n109#1:331,11\n109#1:343\n109#1:353\n132#1:354,11\n132#1:366\n132#1:376\n167#1:377,11\n167#1:389\n167#1:399\n198#1:400,11\n198#1:412\n198#1:422\n229#1:423,11\n229#1:435\n229#1:445\n262#1:446,11\n262#1:458\n262#1:468\n285#1:469,11\n285#1:481\n285#1:491\n109#1:342\n132#1:365\n167#1:388\n198#1:411\n229#1:434\n262#1:457\n285#1:480\n109#1:344,8\n109#1:352\n132#1:367,8\n132#1:375\n167#1:390,8\n167#1:398\n198#1:413,8\n198#1:421\n229#1:436,8\n229#1:444\n262#1:459,8\n262#1:467\n285#1:482,8\n285#1:490\n*E\n"})
public final class WatchFaceManager {

    @aa1
    public static final WatchFaceManager OXO1 = new WatchFaceManager();

    @aa1
    public static final String XIi00iiXO = "WatchFaceManager";

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void O00(WatchFaceManager watchFaceManager, String str, AppCompatActivity appCompatActivity, View view, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            view = null;
        }
        if ((i & 8) != 0) {
            function1 = null;
        }
        watchFaceManager.XO0O10(str, appCompatActivity, view, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void OIX0iXi(WatchFaceManager watchFaceManager, String str, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        watchFaceManager.m38119IO(str, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void OIi0(WatchFaceManager watchFaceManager, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        watchFaceManager.I0IIOi(function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void X0O(WatchFaceManager watchFaceManager, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        watchFaceManager.O10IXXX0X(function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void X1ii(WatchFaceManager watchFaceManager, String str, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        watchFaceManager.XXI(str, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void XOO0ii0(WatchFaceManager watchFaceManager, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        watchFaceManager.IiI10X(function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: iO */
    public static /* synthetic */ void m38118iO(WatchFaceManager watchFaceManager, boolean z, AppCompatActivity appCompatActivity, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            function1 = null;
        }
        watchFaceManager.XIi00iiXO(z, appCompatActivity, function1);
    }

    public final void I0IIOi(@tb1 final Function1<? super Boolean, Unit> function1) {
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> watchFaceBannerBody = RequestBodyKt.getWatchFaceBannerBody();
        final O1XIiIO<List<? extends WatchFaceBanner>> o1XIiIO = new O1XIiIO<List<? extends WatchFaceBanner>>() { // from class: com.sma.smartv3.biz.WatchFaceManager$getWatchFaceBanner$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(List<WatchFaceBanner> list) {
                LogUtils.m11128d("getWatchFaceBanner -> " + list);
                try {
                    if (list == null) {
                        Function1<Boolean, Unit> function2 = function1;
                        if (function2 != null) {
                            function2.invoke2(Boolean.FALSE);
                            return;
                        }
                        return;
                    }
                    a01.OXO1.IiI10X().put(b01.i11I, new Gson().toJson(CollectionsKt___CollectionsKt.OO0Oi10(list)));
                    Function1<Boolean, Unit> function3 = function1;
                    if (function3 != null) {
                        function3.invoke2(Boolean.TRUE);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    Function1<Boolean, Unit> function4 = function1;
                    if (function4 != null) {
                        function4.invoke2(Boolean.FALSE);
                    }
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                LogUtils.m11128d("getWatchFaceBanner -> " + error);
                Function1<Boolean, Unit> function2 = function1;
                if (function2 != null) {
                    function2.invoke2(Boolean.FALSE);
                }
            }
        };
        Map<String, String> headersMap = netWorkUtils.getHeadersMap();
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetWatchFaceBanner.URL);
        String str = strConvertBaseUrl + GetWatchFaceBanner.URL;
        Map<String, ? extends Object> mapX111IO = kotlin.collections.OXO1.X111IO(watchFaceBannerBody);
        mapX111IO.putAll(headersMap);
        Unit unit = Unit.OXO1;
        netWorkUtils.printParam(str, mapX111IO);
        NetWork netWork = NetWork.OXO1;
        String str2 = strConvertBaseUrl + GetWatchFaceBanner.URL;
        final O1XIiIO<Response<List<? extends WatchFaceBanner>>> o1XIiIO2 = new O1XIiIO<Response<List<? extends WatchFaceBanner>>>() { // from class: com.sma.smartv3.biz.WatchFaceManager$getWatchFaceBanner$$inlined$postV2$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<List<? extends WatchFaceBanner>> response) {
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
        AndroidNetworking.post(str2).addHeaders(headersMap).addBodyParameter((Map<String, String>) watchFaceBannerBody).setTag((Object) str2).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, List.class), new ParsedRequestListener<Response<List<? extends WatchFaceBanner>>>() { // from class: com.sma.smartv3.biz.WatchFaceManager$getWatchFaceBanner$$inlined$postV2$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<List<? extends WatchFaceBanner>> response) {
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

    public final void I0iXXO(@aa1 String watchFaceId) {
        Intrinsics.X0O(watchFaceId, "watchFaceId");
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> watchFaceDetailsClick = RequestBodyKt.getWatchFaceDetailsClick(watchFaceId);
        final O1XIiIO<WatchFaceDetail> o1XIiIO = new O1XIiIO<WatchFaceDetail>() { // from class: com.sma.smartv3.biz.WatchFaceManager$getWatchFaceDetailClick$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(WatchFaceDetail watchFaceDetail) {
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
            }
        };
        Map<String, String> headersMap = netWorkUtils.getHeadersMap();
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), AddWatchFaceClick.URL);
        String str = strConvertBaseUrl + AddWatchFaceClick.URL;
        Map<String, ? extends Object> mapX111IO = kotlin.collections.OXO1.X111IO(watchFaceDetailsClick);
        mapX111IO.putAll(headersMap);
        Unit unit = Unit.OXO1;
        netWorkUtils.printParam(str, mapX111IO);
        NetWork netWork = NetWork.OXO1;
        String str2 = strConvertBaseUrl + AddWatchFaceClick.URL;
        final O1XIiIO<Response<WatchFaceDetail>> o1XIiIO2 = new O1XIiIO<Response<WatchFaceDetail>>() { // from class: com.sma.smartv3.biz.WatchFaceManager$getWatchFaceDetailClick$$inlined$postV2$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<WatchFaceDetail> response) {
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
        AndroidNetworking.post(str2).addHeaders(headersMap).addBodyParameter((Map<String, String>) watchFaceDetailsClick).setTag((Object) str2).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, WatchFaceDetail.class), new ParsedRequestListener<Response<WatchFaceDetail>>() { // from class: com.sma.smartv3.biz.WatchFaceManager$getWatchFaceDetailClick$$inlined$postV2$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<WatchFaceDetail> response) {
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

    /* JADX INFO: renamed from: IO */
    public final void m38119IO(@aa1 String watchFaceId, @tb1 final Function1<? super WatchFaceDetail, Unit> function1) {
        Intrinsics.X0O(watchFaceId, "watchFaceId");
        String strO001I = i72.OXO1.O001I();
        i1O0OXO1O.OXO1.OXO1("OrderManager getWatchFaceDetail -> " + strO001I);
        if (strO001I.length() == 0) {
            return;
        }
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> watchFaceDetails = RequestBodyKt.getWatchFaceDetails(strO001I, watchFaceId);
        final O1XIiIO<WatchFaceDetail> o1XIiIO = new O1XIiIO<WatchFaceDetail>() { // from class: com.sma.smartv3.biz.WatchFaceManager$getWatchFaceDetail$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(WatchFaceDetail watchFaceDetail) {
                LogUtils.m11128d("getWatchFaceDetail -> " + watchFaceDetail);
                try {
                    if (watchFaceDetail != null) {
                        Function1<WatchFaceDetail, Unit> function2 = function1;
                        if (function2 != null) {
                            function2.invoke2(watchFaceDetail);
                            return;
                        }
                        return;
                    }
                    Function1<WatchFaceDetail, Unit> function3 = function1;
                    if (function3 != null) {
                        function3.invoke2(null);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    Function1<WatchFaceDetail, Unit> function4 = function1;
                    if (function4 != null) {
                        function4.invoke2(null);
                    }
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                LogUtils.m11128d("getWatchFaceDetail -> " + error);
                Function1<WatchFaceDetail, Unit> function2 = function1;
                if (function2 != null) {
                    function2.invoke2(null);
                }
            }
        };
        Map<String, String> headersMap = netWorkUtils.getHeadersMap();
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetWatchFaceDetail.URL);
        String str = strConvertBaseUrl + GetWatchFaceDetail.URL;
        Map<String, ? extends Object> mapX111IO = kotlin.collections.OXO1.X111IO(watchFaceDetails);
        mapX111IO.putAll(headersMap);
        Unit unit = Unit.OXO1;
        netWorkUtils.printParam(str, mapX111IO);
        NetWork netWork = NetWork.OXO1;
        String str2 = strConvertBaseUrl + GetWatchFaceDetail.URL;
        final O1XIiIO<Response<WatchFaceDetail>> o1XIiIO2 = new O1XIiIO<Response<WatchFaceDetail>>() { // from class: com.sma.smartv3.biz.WatchFaceManager$getWatchFaceDetail$$inlined$postV2$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<WatchFaceDetail> response) {
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
        AndroidNetworking.post(str2).addHeaders(headersMap).addBodyParameter((Map<String, String>) watchFaceDetails).setTag((Object) str2).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, WatchFaceDetail.class), new ParsedRequestListener<Response<WatchFaceDetail>>() { // from class: com.sma.smartv3.biz.WatchFaceManager$getWatchFaceDetail$$inlined$postV2$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<WatchFaceDetail> response) {
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

    public final void IiI10X(@tb1 final Function1<? super Boolean, Unit> function1) {
        String strO001I = i72.OXO1.O001I();
        if (strO001I.length() == 0) {
            return;
        }
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> userPointsMemberBody = RequestBodyKt.getUserPointsMemberBody(strO001I);
        final O1XIiIO<WatchFaceCategoryV2[]> o1XIiIO = new O1XIiIO<WatchFaceCategoryV2[]>() { // from class: com.sma.smartv3.biz.WatchFaceManager$getUserWatchFaceInstallRecord$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(WatchFaceCategoryV2[] watchFaceCategoryV2Arr) {
                LogUtils.m11128d("getUserWatchFaceInstallRecord -> " + (watchFaceCategoryV2Arr != null ? Integer.valueOf(watchFaceCategoryV2Arr.length) : null));
                if (watchFaceCategoryV2Arr != null) {
                    try {
                        a01.OXO1.IiI10X().put(b01.X00O0, new Gson().toJson(ArraysKt___ArraysKt.OXI0X0(watchFaceCategoryV2Arr)));
                    } catch (Exception e) {
                        e.printStackTrace();
                        Function1<Boolean, Unit> function2 = function1;
                        if (function2 != null) {
                            function2.invoke2(Boolean.FALSE);
                            return;
                        }
                        return;
                    }
                }
                Function1<Boolean, Unit> function3 = function1;
                if (function3 != null) {
                    function3.invoke2(Boolean.TRUE);
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                LogUtils.m11128d("getUserWatchFaceInstallRecord -> " + error);
                Function1<Boolean, Unit> function2 = function1;
                if (function2 != null) {
                    function2.invoke2(Boolean.FALSE);
                }
            }
        };
        Map<String, String> headersMap = netWorkUtils.getHeadersMap();
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetUserWatchDownloadRecord.URL);
        String str = strConvertBaseUrl + GetUserWatchDownloadRecord.URL;
        Map<String, ? extends Object> mapX111IO = kotlin.collections.OXO1.X111IO(userPointsMemberBody);
        mapX111IO.putAll(headersMap);
        Unit unit = Unit.OXO1;
        netWorkUtils.printParam(str, mapX111IO);
        NetWork netWork = NetWork.OXO1;
        String str2 = strConvertBaseUrl + GetUserWatchDownloadRecord.URL;
        final O1XIiIO<Response<WatchFaceCategoryV2[]>> o1XIiIO2 = new O1XIiIO<Response<WatchFaceCategoryV2[]>>() { // from class: com.sma.smartv3.biz.WatchFaceManager$getUserWatchFaceInstallRecord$$inlined$postV2$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<WatchFaceCategoryV2[]> response) {
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
        AndroidNetworking.post(str2).addHeaders(headersMap).addBodyParameter((Map<String, String>) userPointsMemberBody).setTag((Object) str2).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, WatchFaceCategoryV2[].class), new ParsedRequestListener<Response<WatchFaceCategoryV2[]>>() { // from class: com.sma.smartv3.biz.WatchFaceManager$getUserWatchFaceInstallRecord$$inlined$postV2$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<WatchFaceCategoryV2[]> response) {
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

    public final void O10IXXX0X(@tb1 final Function1<? super Boolean, Unit> function1) {
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        final Activity activity = null;
        HashMap purchaseHistoryWatchFace$default = RequestBodyKt.getPurchaseHistoryWatchFace$default(null, 1, null);
        final O1XIiIO<WatchFaceCategoryV2[]> o1XIiIO = new O1XIiIO<WatchFaceCategoryV2[]>() { // from class: com.sma.smartv3.biz.WatchFaceManager$getWatchFacePayedSearchList$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(WatchFaceCategoryV2[] watchFaceCategoryV2Arr) {
                LogUtils.m11128d("getWatchFacePayedSearchList -> " + (watchFaceCategoryV2Arr != null ? Integer.valueOf(watchFaceCategoryV2Arr.length) : null));
                if (watchFaceCategoryV2Arr != null) {
                    try {
                        a01.OXO1.IiI10X().put(b01.X0iO, new Gson().toJson(ArraysKt___ArraysKt.OXI0X0(watchFaceCategoryV2Arr)));
                    } catch (Exception e) {
                        e.printStackTrace();
                        Function1<Boolean, Unit> function2 = function1;
                        if (function2 != null) {
                            function2.invoke2(Boolean.FALSE);
                            return;
                        }
                        return;
                    }
                }
                Function1<Boolean, Unit> function3 = function1;
                if (function3 != null) {
                    function3.invoke2(Boolean.TRUE);
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                LogUtils.m11128d("getWatchFacePayedSearchList -> " + error);
                Function1<Boolean, Unit> function2 = function1;
                if (function2 != null) {
                    function2.invoke2(Boolean.FALSE);
                }
            }
        };
        Map<String, String> headersMap = netWorkUtils.getHeadersMap();
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetPurchaseHistoryList.URL);
        String str = strConvertBaseUrl + GetPurchaseHistoryList.URL;
        Map<String, ? extends Object> mapX111IO = kotlin.collections.OXO1.X111IO(purchaseHistoryWatchFace$default);
        mapX111IO.putAll(headersMap);
        Unit unit = Unit.OXO1;
        netWorkUtils.printParam(str, mapX111IO);
        NetWork netWork = NetWork.OXO1;
        String str2 = strConvertBaseUrl + GetPurchaseHistoryList.URL;
        final O1XIiIO<Response<WatchFaceCategoryV2[]>> o1XIiIO2 = new O1XIiIO<Response<WatchFaceCategoryV2[]>>() { // from class: com.sma.smartv3.biz.WatchFaceManager$getWatchFacePayedSearchList$$inlined$postV2$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<WatchFaceCategoryV2[]> response) {
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
        AndroidNetworking.post(str2).addHeaders(headersMap).addBodyParameter((Map<String, String>) purchaseHistoryWatchFace$default).setTag((Object) str2).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, WatchFaceCategoryV2[].class), new ParsedRequestListener<Response<WatchFaceCategoryV2[]>>() { // from class: com.sma.smartv3.biz.WatchFaceManager$getWatchFacePayedSearchList$$inlined$postV2$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<WatchFaceCategoryV2[]> response) {
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

    public final void OXO1(@aa1 String watchFaceId) {
        Intrinsics.X0O(watchFaceId, "watchFaceId");
        String strO001I = i72.OXO1.O001I();
        if (strO001I.length() == 0) {
            return;
        }
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> addUserWatchDownloadRecordBody = RequestBodyKt.getAddUserWatchDownloadRecordBody(strO001I, watchFaceId);
        final O1XIiIO<WatchFaceInstallRecord> o1XIiIO = new O1XIiIO<WatchFaceInstallRecord>() { // from class: com.sma.smartv3.biz.WatchFaceManager$addWatchDownloadRecord$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(WatchFaceInstallRecord watchFaceInstallRecord) {
                LogUtils.m11128d("addWatchDownloadRecord handleResponse");
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                LogUtils.m11128d("addWatchDownloadRecord handleError -> " + error);
            }
        };
        Map<String, String> headersMap = netWorkUtils.getHeadersMap();
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), AddUserWatchDownloadRecord.URL);
        String str = strConvertBaseUrl + AddUserWatchDownloadRecord.URL;
        Map<String, ? extends Object> mapX111IO = kotlin.collections.OXO1.X111IO(addUserWatchDownloadRecordBody);
        mapX111IO.putAll(headersMap);
        Unit unit = Unit.OXO1;
        netWorkUtils.printParam(str, mapX111IO);
        NetWork netWork = NetWork.OXO1;
        String str2 = strConvertBaseUrl + AddUserWatchDownloadRecord.URL;
        final O1XIiIO<Response<WatchFaceInstallRecord>> o1XIiIO2 = new O1XIiIO<Response<WatchFaceInstallRecord>>() { // from class: com.sma.smartv3.biz.WatchFaceManager$addWatchDownloadRecord$$inlined$postV2$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<WatchFaceInstallRecord> response) {
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
        AndroidNetworking.post(str2).addHeaders(headersMap).addBodyParameter((Map<String, String>) addUserWatchDownloadRecordBody).setTag((Object) str2).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, WatchFaceInstallRecord.class), new ParsedRequestListener<Response<WatchFaceInstallRecord>>() { // from class: com.sma.smartv3.biz.WatchFaceManager$addWatchDownloadRecord$$inlined$postV2$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<WatchFaceInstallRecord> response) {
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

    public final void XIi00iiXO(boolean z, @aa1 AppCompatActivity activity, @tb1 final Function1<? super Boolean, Unit> function1) {
        Intrinsics.X0O(activity, "activity");
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap onLinWatchFaceV2$default = RequestBodyKt.getOnLinWatchFaceV2$default(null, z, 1, null);
        O1XIiIO<OnlineWatchFaceV2[]> o1XIiIO = new O1XIiIO<OnlineWatchFaceV2[]>() { // from class: com.sma.smartv3.biz.WatchFaceManager$getOnLineWatchFaceList$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(OnlineWatchFaceV2[] onlineWatchFaceV2Arr) {
                i1O0OXO1O.OXO1.OXO1("getOnLinWatchFaceList -> " + (onlineWatchFaceV2Arr != null ? Integer.valueOf(onlineWatchFaceV2Arr.length) : null));
                try {
                    if (onlineWatchFaceV2Arr != null) {
                        a01.OXO1.IiI10X().put(b01.Xii11I, new Gson().toJson(ArraysKt___ArraysKt.OXI0X0(onlineWatchFaceV2Arr)));
                        Function1<Boolean, Unit> function2 = function1;
                        if (function2 != null) {
                            function2.invoke2(Boolean.TRUE);
                            return;
                        }
                        return;
                    }
                    a01.OXO1.IiI10X().remove(b01.Xii11I);
                    Function1<Boolean, Unit> function3 = function1;
                    if (function3 != null) {
                        function3.invoke2(Boolean.FALSE);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    Function1<Boolean, Unit> function4 = function1;
                    if (function4 != null) {
                        function4.invoke2(Boolean.FALSE);
                    }
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                LogUtils.m11128d("getOnLinWatchFaceList -> " + error);
                Function1<Boolean, Unit> function2 = function1;
                if (function2 != null) {
                    function2.invoke2(Boolean.FALSE);
                }
            }
        };
        Map<String, String> headersMap = netWorkUtils.getHeadersMap();
        WeakReference weakReference = new WeakReference(activity);
        XX01Oi.IiI10X(LifecycleOwnerKt.getLifecycleScope(activity), null, null, new C15447x22973144(netWorkUtils.loadPopup(activity, null), GetOnLinWatchFaceListV2.URL, onLinWatchFaceV2$default, headersMap, weakReference, o1XIiIO, null), 3, null);
    }

    public final void XO0O10(@aa1 String dialType, @aa1 AppCompatActivity activity, @tb1 View view, @tb1 final Function1<? super WatchFaceCategoryV2[], Unit> function1) {
        Intrinsics.X0O(dialType, "dialType");
        Intrinsics.X0O(activity, "activity");
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap onLinWatchFaceMoveV2$default = RequestBodyKt.getOnLinWatchFaceMoveV2$default(null, dialType, 0, 0, 13, null);
        O1XIiIO<OnlineWatchFaceV2[]> o1XIiIO = new O1XIiIO<OnlineWatchFaceV2[]>() { // from class: com.sma.smartv3.biz.WatchFaceManager$getOnLineWatchFaceMoveList$1
            /* JADX WARN: Code duplicated, block: B:22:0x0052 A[Catch: Exception -> 0x0050, TryCatch #0 {Exception -> 0x0050, blocks: (B:15:0x0041, B:17:0x0049, B:23:0x0055, B:25:0x0059, B:22:0x0052), top: B:31:0x0041 }] */
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(OnlineWatchFaceV2[] onlineWatchFaceV2Arr) {
                WatchFaceCategoryV2[] watchFaceList;
                OnlineWatchFaceV2 onlineWatchFaceV2;
                WatchFaceCategoryV2[] watchFaceList2;
                i1O0OXO1O.OXO1.OXO1("getOnLinWatchFaceList -> " + (onlineWatchFaceV2Arr != null ? Integer.valueOf(onlineWatchFaceV2Arr.length) : null) + " , size : " + ((onlineWatchFaceV2Arr == null || (onlineWatchFaceV2 = (OnlineWatchFaceV2) ArraysKt___ArraysKt.IO0(onlineWatchFaceV2Arr)) == null || (watchFaceList2 = onlineWatchFaceV2.getWatchFaceList()) == null) ? null : Integer.valueOf(watchFaceList2.length)));
                if (onlineWatchFaceV2Arr != null) {
                    try {
                        OnlineWatchFaceV2 onlineWatchFaceV3 = (OnlineWatchFaceV2) ArraysKt___ArraysKt.IO0(onlineWatchFaceV2Arr);
                        if (onlineWatchFaceV3 == null || (watchFaceList = onlineWatchFaceV3.getWatchFaceList()) == null) {
                            watchFaceList = new WatchFaceCategoryV2[0];
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        Function1<WatchFaceCategoryV2[], Unit> function2 = function1;
                        if (function2 != null) {
                            function2.invoke2(null);
                            return;
                        }
                        return;
                    }
                } else {
                    watchFaceList = new WatchFaceCategoryV2[0];
                }
                Function1<WatchFaceCategoryV2[], Unit> function3 = function1;
                if (function3 != null) {
                    function3.invoke2(watchFaceList);
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                LogUtils.m11128d("getOnLinWatchFaceList -> " + error);
                Function1<WatchFaceCategoryV2[], Unit> function2 = function1;
                if (function2 != null) {
                    function2.invoke2(null);
                }
            }
        };
        Map<String, String> headersMap = netWorkUtils.getHeadersMap();
        WeakReference weakReference = new WeakReference(activity);
        XX01Oi.IiI10X(LifecycleOwnerKt.getLifecycleScope(activity), null, null, new C15448xec963275(netWorkUtils.loadPopup(activity, view), GetOnLinWatchFaceListV2.URL, onLinWatchFaceMoveV2$default, headersMap, weakReference, o1XIiIO, null), 3, null);
    }

    public final void XXI(@aa1 String watchFaceId, @tb1 final Function1<? super WatchFaceCategoryV2[], Unit> function1) {
        Intrinsics.X0O(watchFaceId, "watchFaceId");
        String strO001I = i72.OXO1.O001I();
        i1O0OXO1O.OXO1.OXO1("OrderManager createOrder -> " + strO001I);
        if (strO001I.length() == 0) {
            return;
        }
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> watchFaceDetailsList = RequestBodyKt.getWatchFaceDetailsList(strO001I, watchFaceId);
        final O1XIiIO<WatchFaceCategoryV2[]> o1XIiIO = new O1XIiIO<WatchFaceCategoryV2[]>() { // from class: com.sma.smartv3.biz.WatchFaceManager$getWatchFaceDetailList$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(WatchFaceCategoryV2[] watchFaceCategoryV2Arr) {
                LogUtils.m11128d("getWatchFaceDetail -> " + (watchFaceCategoryV2Arr != null ? Integer.valueOf(watchFaceCategoryV2Arr.length) : null));
                try {
                    if (watchFaceCategoryV2Arr != null) {
                        Function1<WatchFaceCategoryV2[], Unit> function2 = function1;
                        if (function2 != null) {
                            function2.invoke2(watchFaceCategoryV2Arr);
                            return;
                        }
                        return;
                    }
                    Function1<WatchFaceCategoryV2[], Unit> function3 = function1;
                    if (function3 != null) {
                        function3.invoke2(null);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    Function1<WatchFaceCategoryV2[], Unit> function4 = function1;
                    if (function4 != null) {
                        function4.invoke2(null);
                    }
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                LogUtils.m11128d("getWatchFaceDetail -> " + error);
                Function1<WatchFaceCategoryV2[], Unit> function2 = function1;
                if (function2 != null) {
                    function2.invoke2(null);
                }
            }
        };
        Map<String, String> headersMap = netWorkUtils.getHeadersMap();
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetWatchFaceDetailList.URL);
        String str = strConvertBaseUrl + GetWatchFaceDetailList.URL;
        Map<String, ? extends Object> mapX111IO = kotlin.collections.OXO1.X111IO(watchFaceDetailsList);
        mapX111IO.putAll(headersMap);
        Unit unit = Unit.OXO1;
        netWorkUtils.printParam(str, mapX111IO);
        NetWork netWork = NetWork.OXO1;
        String str2 = strConvertBaseUrl + GetWatchFaceDetailList.URL;
        final O1XIiIO<Response<WatchFaceCategoryV2[]>> o1XIiIO2 = new O1XIiIO<Response<WatchFaceCategoryV2[]>>() { // from class: com.sma.smartv3.biz.WatchFaceManager$getWatchFaceDetailList$$inlined$postV2$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<WatchFaceCategoryV2[]> response) {
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
        AndroidNetworking.post(str2).addHeaders(headersMap).addBodyParameter((Map<String, String>) watchFaceDetailsList).setTag((Object) str2).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, WatchFaceCategoryV2[].class), new ParsedRequestListener<Response<WatchFaceCategoryV2[]>>() { // from class: com.sma.smartv3.biz.WatchFaceManager$getWatchFaceDetailList$$inlined$postV2$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<WatchFaceCategoryV2[]> response) {
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
}
