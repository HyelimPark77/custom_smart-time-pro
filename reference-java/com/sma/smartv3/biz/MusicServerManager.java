package com.sma.smartv3.biz;

import android.app.Activity;
import android.content.Context;
import com.alibaba.sdk.android.oss.OSSClient;
import com.alibaba.sdk.android.oss.common.auth.OSSStsTokenCredentialProvider;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.XiX0OOXI0;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.e44;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.android.mltcode.paycertificationapi.yn0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.JSONObjectRequestListener;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.blankj.utilcode.util.Utils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.HttpProgressCallback;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.model.TeraBoxItemDLink;
import com.sma.smartv3.model.TeraBoxListItem;
import com.sma.smartv3.model.TeraBoxShareLink;
import com.sma.smartv3.model.TeraBoxToken;
import com.sma.smartv3.model.TeraBoxTokenInfo;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.GetInternalTeraBoxRefreshToken;
import com.sma.smartv3.network.GetInternalTeraBoxToken;
import com.sma.smartv3.network.GetShareUrl;
import com.sma.smartv3.network.GetTeraBoxRefreshToken;
import com.sma.smartv3.network.GetTeraBoxToken;
import com.sma.smartv3.network.GetTeraBoxTokenInfo;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.RequestBodyKt;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.work.UploadOSSWorker;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nMusicServerManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicServerManager.kt\ncom/sma/smartv3/biz/MusicServerManager\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 5 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,529:1\n235#2,11:530\n246#2:542\n256#2:552\n235#2,11:553\n246#2:565\n256#2:575\n235#2,11:576\n246#2:588\n256#2:598\n235#2,11:599\n246#2:611\n256#2:621\n126#2,11:625\n146#2:644\n1#3:541\n1#3:564\n1#3:587\n1#3:610\n278#4,8:543\n298#4:551\n278#4,8:566\n298#4:574\n278#4,8:589\n298#4:597\n278#4,8:612\n298#4:620\n200#4,7:636\n218#4:643\n93#5,2:622\n90#5:624\n*S KotlinDebug\n*F\n+ 1 MusicServerManager.kt\ncom/sma/smartv3/biz/MusicServerManager\n*L\n312#1:530,11\n312#1:542\n312#1:552\n342#1:553,11\n342#1:565\n342#1:575\n387#1:576,11\n387#1:588\n387#1:598\n439#1:599,11\n439#1:611\n439#1:621\n492#1:625,11\n492#1:644\n312#1:541\n342#1:564\n387#1:587\n439#1:610\n312#1:543,8\n312#1:551\n342#1:566,8\n342#1:574\n387#1:589,8\n387#1:597\n439#1:612,8\n439#1:620\n492#1:636,7\n492#1:643\n479#1:622,2\n479#1:624\n*E\n"})
public final class MusicServerManager {

    @tb1
    public static OSSClient IiI10X = null;

    @aa1
    public static final String XIi00iiXO = "TeraBoxManager";
    public static final int XO0O10 = 200;

    /* JADX INFO: renamed from: iO */
    public static final int f50882iO = -1;

    @aa1
    public static final MusicServerManager OXO1 = new MusicServerManager();

    @aa1
    public static String O00 = "";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: IO */
    public static /* synthetic */ void m38099IO(MusicServerManager musicServerManager, String str, List list, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        musicServerManager.OIi0(str, list, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void O00(MusicServerManager musicServerManager, String str, String str2, String str3, Function1 function1, int i, Object obj) {
        if ((i & 8) != 0) {
            function1 = null;
        }
        musicServerManager.XO0O10(str, str2, str3, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void X0O(MusicServerManager musicServerManager, String str, String str2, int i, int i2, Function1 function1, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            str2 = "/";
        }
        String str3 = str2;
        if ((i3 & 4) != 0) {
            i = 1;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = 100;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            function1 = null;
        }
        musicServerManager.O10IXXX0X(str, str3, i4, i5, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void X1ii(MusicServerManager musicServerManager, String str, String str2, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        musicServerManager.XXI(str, str2, function1);
    }

    @tb1
    public final OSSClient I0IIOi() {
        return IiI10X;
    }

    public final void I0iXXO(final Function1<? super Pair<UploadOSSWorker.StsRamData, Integer>, Unit> function1) {
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap map = new HashMap();
        final O1XIiIO<UploadOSSWorker.StsRamData> o1XIiIO = new O1XIiIO<UploadOSSWorker.StsRamData>() { // from class: com.sma.smartv3.biz.MusicServerManager$getNetWorkUtilsSts$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(UploadOSSWorker.StsRamData stsRamData) {
                i1O0OXO1O.OXO1.OXO1("TeraBoxManager handleResponse : " + stsRamData);
                MusicServerManager.OXO1.XIi00iiXO(stsRamData);
                a01.OXO1.m1440iO().put(UploadOSSWorker.OXO1.O10IXXX0X() + '_' + UploadOSSWorker.StsRamData.class.getName(), new Gson().toJson(stsRamData), false);
                function1.invoke2(new Pair<>(stsRamData, 1));
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                function1.invoke2(new Pair<>(null, 2));
                ToastUtils.showLong(R.string.request_error);
                i1O0OXO1O.OXO1.XIi00iiXO("TeraBoxManager getStsError : " + error);
            }
        };
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), "/ali/getStsRam");
        netWorkUtils.printParam(strConvertBaseUrl + "/ali/getStsRam", map);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + "/ali/getStsRam";
        final O1XIiIO<Response<UploadOSSWorker.StsRamData>> o1XIiIO2 = new O1XIiIO<Response<UploadOSSWorker.StsRamData>>() { // from class: com.sma.smartv3.biz.MusicServerManager$getNetWorkUtilsSts$$inlined$get$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<UploadOSSWorker.StsRamData> response) {
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
        AndroidNetworking.get(str).addQueryParameter((Map<String, String>) map).setTag((Object) str).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, UploadOSSWorker.StsRamData.class), new ParsedRequestListener<Response<UploadOSSWorker.StsRamData>>() { // from class: com.sma.smartv3.biz.MusicServerManager$getNetWorkUtilsSts$$inlined$get$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<UploadOSSWorker.StsRamData> response) {
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

    public final void I1XOi1(@aa1 String token, @aa1 final Function1<? super Boolean, Unit> callback) {
        HashMap<String, String> internalTeraBoxRefreshTokenBody;
        String str;
        Intrinsics.X0O(token, "token");
        Intrinsics.X0O(callback, "callback");
        if (i72.OXO1.I0i1OXiI()) {
            internalTeraBoxRefreshTokenBody = RequestBodyKt.getTeraBoxRefreshTokenBody(token);
            str = GetTeraBoxRefreshToken.URL;
        } else {
            internalTeraBoxRefreshTokenBody = RequestBodyKt.getInternalTeraBoxRefreshTokenBody(token);
            str = GetInternalTeraBoxRefreshToken.URL;
        }
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        final O1XIiIO<TeraBoxToken> o1XIiIO = new O1XIiIO<TeraBoxToken>() { // from class: com.sma.smartv3.biz.MusicServerManager$getTeraBoxRefreshToken$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(TeraBoxToken teraBoxToken) {
                LogUtils.m11128d("getTeraBoxRefreshToken -> " + teraBoxToken);
                try {
                    if (teraBoxToken == null) {
                        MusicServerManager.OXO1.OiIIX101O();
                        callback.invoke2(Boolean.FALSE);
                        return;
                    }
                    a01 a01Var = a01.OXO1;
                    a01Var.IiI10X().put(b01.f5628O1, teraBoxToken.getAccess_token());
                    a01Var.IiI10X().put(b01.O1iXiI, teraBoxToken.getRefresh_token());
                    a01Var.IiI10X().put(b01.IX0iIX, System.currentTimeMillis());
                    callback.invoke2(Boolean.TRUE);
                } catch (Exception e) {
                    e.printStackTrace();
                    MusicServerManager.OXO1.OiIIX101O();
                    callback.invoke2(Boolean.FALSE);
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                LogUtils.m11128d("getTeraBoxRefreshToken -> " + error);
                MusicServerManager.OXO1.OiIIX101O();
                callback.invoke2(Boolean.FALSE);
            }
        };
        Map<String, String> headersMap = netWorkUtils.getHeadersMap();
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), str);
        Map<String, ? extends Object> mapX111IO = kotlin.collections.OXO1.X111IO(internalTeraBoxRefreshTokenBody);
        mapX111IO.putAll(headersMap);
        Unit unit = Unit.OXO1;
        netWorkUtils.printParam(strConvertBaseUrl + str, mapX111IO);
        NetWork netWork = NetWork.OXO1;
        String str2 = strConvertBaseUrl + str;
        final O1XIiIO<Response<TeraBoxToken>> o1XIiIO2 = new O1XIiIO<Response<TeraBoxToken>>() { // from class: com.sma.smartv3.biz.MusicServerManager$getTeraBoxRefreshToken$$inlined$postV2$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<TeraBoxToken> response) {
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
        AndroidNetworking.post(str2).addHeaders(headersMap).addBodyParameter((Map<String, String>) internalTeraBoxRefreshTokenBody).setTag((Object) str2).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, TeraBoxToken.class), new ParsedRequestListener<Response<TeraBoxToken>>() { // from class: com.sma.smartv3.biz.MusicServerManager$getTeraBoxRefreshToken$$inlined$postV2$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<TeraBoxToken> response) {
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

    public final void IIX1OXO(@aa1 String code, @aa1 final Function1<? super String, Unit> callback) {
        HashMap<String, String> internalTeraBoxTokenBody;
        String str;
        Intrinsics.X0O(code, "code");
        Intrinsics.X0O(callback, "callback");
        if (i72.OXO1.I0i1OXiI()) {
            internalTeraBoxTokenBody = RequestBodyKt.getTeraBoxTokenBody(code);
            str = GetTeraBoxToken.URL;
        } else {
            internalTeraBoxTokenBody = RequestBodyKt.getInternalTeraBoxTokenBody(code, UtilsKt.XXO(R.string.tera_box_domestic_url_scheme));
            str = GetInternalTeraBoxToken.URL;
        }
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        final O1XIiIO<TeraBoxToken> o1XIiIO = new O1XIiIO<TeraBoxToken>() { // from class: com.sma.smartv3.biz.MusicServerManager$getTeraBoxToken$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(TeraBoxToken teraBoxToken) {
                LogUtils.m11128d("getTeraBoxToken -> " + teraBoxToken);
                try {
                    if (teraBoxToken == null) {
                        callback.invoke2("");
                        return;
                    }
                    a01 a01Var = a01.OXO1;
                    a01Var.IiI10X().put(b01.f5628O1, teraBoxToken.getAccess_token());
                    a01Var.IiI10X().put(b01.O1iXiI, teraBoxToken.getRefresh_token());
                    a01Var.IiI10X().put(b01.IX0iIX, System.currentTimeMillis());
                    callback.invoke2(teraBoxToken.getAccess_token());
                } catch (Exception e) {
                    e.printStackTrace();
                    callback.invoke2("");
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                LogUtils.m11128d("getOnLinWatchFaceList -> " + error);
                callback.invoke2("");
            }
        };
        Map<String, String> headersMap = netWorkUtils.getHeadersMap();
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), str);
        Map<String, ? extends Object> mapX111IO = kotlin.collections.OXO1.X111IO(internalTeraBoxTokenBody);
        mapX111IO.putAll(headersMap);
        Unit unit = Unit.OXO1;
        netWorkUtils.printParam(strConvertBaseUrl + str, mapX111IO);
        NetWork netWork = NetWork.OXO1;
        String str2 = strConvertBaseUrl + str;
        final O1XIiIO<Response<TeraBoxToken>> o1XIiIO2 = new O1XIiIO<Response<TeraBoxToken>>() { // from class: com.sma.smartv3.biz.MusicServerManager$getTeraBoxToken$$inlined$postV2$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<TeraBoxToken> response) {
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
        AndroidNetworking.post(str2).addHeaders(headersMap).addBodyParameter((Map<String, String>) internalTeraBoxTokenBody).setTag((Object) str2).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, TeraBoxToken.class), new ParsedRequestListener<Response<TeraBoxToken>>() { // from class: com.sma.smartv3.biz.MusicServerManager$getTeraBoxToken$$inlined$postV2$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<TeraBoxToken> response) {
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

    @aa1
    public final String IiI10X(@aa1 Context context) {
        Intrinsics.X0O(context, "context");
        if (i72.OXO1.I0i1OXiI() && !Intrinsics.XOO0ii0(Api.INSTANCE.getBASE_URL(), e44.f6332iO)) {
            return "https://www.terabox.com/wap/outside/login?clientId=" + context.getString(R.string.tera_box_client) + "&isFromApp=1";
        }
        return "http://openapi.baidu.com/oauth/2.0/authorize?response_type=code&display=mobile&device_id=" + context.getString(R.string.tera_box_domestic_client_id) + "&client_id=" + context.getString(R.string.tera_box_domestic_client_key) + "&redirect_uri=" + UtilsKt.XXO(R.string.tera_box_domestic_url_scheme) + "&scope=basic,netdisk";
    }

    public final void O10IXXX0X(@aa1 String access_tokens, @aa1 String dir, int i, int i2, @tb1 final Function1<? super List<TeraBoxListItem>, Unit> function1) {
        String str;
        Intrinsics.X0O(access_tokens, "access_tokens");
        Intrinsics.X0O(dir, "dir");
        if (i72.OXO1.I0i1OXiI()) {
            str = "https://www.terabox.com/openapi/api/list?access_tokens=" + access_tokens + "&page=" + i + "&dir=" + dir + "&num=" + i2;
        } else {
            str = "https://pan.baidu.com/rest/2.0/xpan/file?method=list&access_token=" + access_tokens + "&dir=" + dir;
        }
        AndroidNetworking.get(str).setPriority(Priority.LOW).build().getAsJSONObject(new JSONObjectRequestListener() { // from class: com.sma.smartv3.biz.MusicServerManager$getTeraBoxList$1

            @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 MusicServerManager.kt\ncom/sma/smartv3/biz/MusicServerManager$getTeraBoxList$1\n*L\n1#1,328:1\n116#2:329\n*E\n"})
            public static final class OXO1<T> implements Comparator {
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.I0iXXO(Boolean.valueOf(((TeraBoxListItem) t).getIsdir() < 1), Boolean.valueOf(((TeraBoxListItem) t2).getIsdir() < 1));
                }
            }

            @Override // com.androidnetworking.interfaces.JSONObjectRequestListener
            public void onError(ANError aNError) {
                LogUtils.m11128d("onError -> error = " + (aNError != null ? aNError.getErrorBody() : null));
                if ((aNError != null ? aNError.getErrorBody() : null) == null) {
                    ToastUtils.showLong("TeraBox is not available in current area", new Object[0]);
                } else {
                    ToastUtils.showLong(aNError != null ? aNError.getErrorBody() : null, new Object[0]);
                }
                Function1<List<TeraBoxListItem>, Unit> function2 = function1;
                if (function2 != null) {
                    function2.invoke2(null);
                }
            }

            /* JADX WARN: Code duplicated, block: B:12:0x00d6  */
            /* JADX WARN: Code duplicated, block: B:16:0x00dc A[Catch: Exception -> 0x00d8, TryCatch #0 {Exception -> 0x00d8, blocks: (B:4:0x0024, B:6:0x002c, B:8:0x003a, B:10:0x00cb, B:16:0x00dc, B:17:0x00df, B:18:0x00e7, B:20:0x00ed, B:22:0x00f4, B:24:0x00fe), top: B:30:0x0024 }] */
            /* JADX WARN: Code duplicated, block: B:34:0x00df A[SYNTHETIC] */
            @Override // com.androidnetworking.interfaces.JSONObjectRequestListener
            public void onResponse(JSONObject jSONObject) {
                String str2 = "server_filename";
                LogUtils.m11128d("onResponse -> " + jSONObject);
                if (jSONObject != null) {
                    try {
                        JSONArray jSONArray = jSONObject.getJSONArray("list");
                        if (jSONArray != null) {
                            Function1<List<TeraBoxListItem>, Unit> function2 = function1;
                            ArrayList arrayList = new ArrayList();
                            int length = jSONArray.length();
                            int i3 = 0;
                            while (i3 < length) {
                                int i4 = jSONArray.getJSONObject(i3).getInt("isdir");
                                String string = jSONArray.getJSONObject(i3).getString(str2);
                                long j = jSONArray.getJSONObject(i3).getLong("fs_id");
                                String string2 = jSONArray.getJSONObject(i3).getString("category");
                                Intrinsics.O10IXXX0X(string2, "getString(...)");
                                int i5 = length;
                                long j2 = jSONArray.getJSONObject(i3).getLong("local_mtime");
                                long j3 = jSONArray.getJSONObject(i3).getLong("server_ctime");
                                String string3 = jSONArray.getJSONObject(i3).getString(str2);
                                Intrinsics.O10IXXX0X(string3, "getString(...)");
                                String str3 = str2;
                                int i6 = jSONArray.getJSONObject(i3).getInt(MapBundleKey.OfflineMapKey.OFFLINE_TOTAL_SIZE);
                                int i7 = jSONArray.getJSONObject(i3).getInt("isdir");
                                String string4 = jSONArray.getJSONObject(i3).getString("path");
                                Intrinsics.O10IXXX0X(string4, "getString(...)");
                                TeraBoxListItem teraBoxListItem = new TeraBoxListItem(j, string2, j2, j3, string3, i6, i7, string4);
                                LogUtils.m11128d("terabox list item teraBox = " + teraBoxListItem + " ");
                                if (i4 == 0) {
                                    MusicServerManager musicServerManager = MusicServerManager.OXO1;
                                    Intrinsics.XXI(string);
                                    if (musicServerManager.iIiiO(string)) {
                                        arrayList.add(teraBoxListItem);
                                    } else if (i4 == 1) {
                                        arrayList.add(teraBoxListItem);
                                    }
                                } else if (i4 == 1) {
                                    arrayList.add(teraBoxListItem);
                                }
                                i3++;
                                length = i5;
                                str2 = str3;
                            }
                            if (arrayList.size() > 0 && arrayList.size() > 1) {
                                XiX0OOXI0.XOXiX0(arrayList, new OXO1());
                            }
                            if (function2 != null) {
                                function2.invoke2(arrayList);
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        Function1<List<TeraBoxListItem>, Unit> function3 = function1;
                        if (function3 != null) {
                            function3.invoke2(null);
                        }
                    }
                }
            }
        });
    }

    public final void OII(@tb1 OSSClient oSSClient) {
        IiI10X = oSSClient;
    }

    public final void OIX0iXi(@aa1 final Function1<? super String, Unit> callback) {
        Intrinsics.X0O(callback, "callback");
        boolean zI0i1OXiI = i72.OXO1.I0i1OXiI();
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap map = new HashMap();
        map.put("internalFlag", String.valueOf(zI0i1OXiI ? 1 : 0));
        final O1XIiIO<TeraBoxShareLink> o1XIiIO = new O1XIiIO<TeraBoxShareLink>() { // from class: com.sma.smartv3.biz.MusicServerManager$getNetDiskShareUrl$2
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(TeraBoxShareLink teraBoxShareLink) {
                LogUtils.m11128d("getNetDiskShareUrl -> " + teraBoxShareLink);
                try {
                    if (teraBoxShareLink == null) {
                        callback.invoke2("");
                    } else {
                        a01.OXO1.IiI10X().put(b01.OXi001, teraBoxShareLink.getShareUrl());
                        callback.invoke2(teraBoxShareLink.getShareUrl());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    callback.invoke2("");
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                LogUtils.m11128d("getNetDiskShareUrl -> " + error);
                callback.invoke2("");
            }
        };
        Map<String, String> headersMap = netWorkUtils.getHeadersMap();
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetShareUrl.URL);
        String str = strConvertBaseUrl + GetShareUrl.URL;
        Map<String, ? extends Object> mapX111IO = kotlin.collections.OXO1.X111IO(map);
        mapX111IO.putAll(headersMap);
        Unit unit = Unit.OXO1;
        netWorkUtils.printParam(str, mapX111IO);
        NetWork netWork = NetWork.OXO1;
        String str2 = strConvertBaseUrl + GetShareUrl.URL;
        final O1XIiIO<Response<TeraBoxShareLink>> o1XIiIO2 = new O1XIiIO<Response<TeraBoxShareLink>>() { // from class: com.sma.smartv3.biz.MusicServerManager$getNetDiskShareUrl$$inlined$postV2$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<TeraBoxShareLink> response) {
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
        AndroidNetworking.post(str2).addHeaders(headersMap).addBodyParameter((Map<String, String>) map).setTag((Object) str2).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, TeraBoxShareLink.class), new ParsedRequestListener<Response<TeraBoxShareLink>>() { // from class: com.sma.smartv3.biz.MusicServerManager$getNetDiskShareUrl$$inlined$postV2$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<TeraBoxShareLink> response) {
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

    public final void OIi0(@aa1 String access_tokens, @aa1 List<Long> fidlist, @tb1 final Function1<? super List<TeraBoxItemDLink>, Unit> function1) {
        String str;
        Intrinsics.X0O(access_tokens, "access_tokens");
        Intrinsics.X0O(fidlist, "fidlist");
        if (i72.OXO1.I0i1OXiI()) {
            str = "https://www.terabox.com/openapi/api/download?access_tokens=" + access_tokens + "&fidlist=" + fidlist + "&type=dlink";
        } else {
            str = "http://pan.baidu.com/rest/2.0/xpan/multimedia?method=filemetas&access_token=" + access_tokens + "&fsids=" + fidlist + "&dlink=1";
        }
        AndroidNetworking.get(str).setPriority(Priority.LOW).build().getAsJSONObject(new JSONObjectRequestListener() { // from class: com.sma.smartv3.biz.MusicServerManager$getMusicDownLoaLink$1
            @Override // com.androidnetworking.interfaces.JSONObjectRequestListener
            public void onError(ANError aNError) {
                LogUtils.m11128d("getMusicDownLoaLink onError -> error = " + (aNError != null ? aNError.getErrorBody() : null));
                ToastUtils.showLong(aNError != null ? aNError.getErrorBody() : null, new Object[0]);
                Function1<List<TeraBoxItemDLink>, Unit> function2 = function1;
                if (function2 != null) {
                    function2.invoke2(null);
                }
            }

            @Override // com.androidnetworking.interfaces.JSONObjectRequestListener
            public void onResponse(JSONObject jSONObject) {
                JSONArray jSONArray;
                LogUtils.m11128d("getMusicDownLoaLink onResponse -> " + jSONObject);
                try {
                    String str2 = i72.OXO1.I0i1OXiI() ? "dlink" : "list";
                    if (jSONObject == null || (jSONArray = jSONObject.getJSONArray(str2)) == null) {
                        return;
                    }
                    Function1<List<TeraBoxItemDLink>, Unit> function2 = function1;
                    ArrayList arrayList = new ArrayList();
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        long j = jSONArray.getJSONObject(i).getLong("fs_id");
                        String string = jSONArray.getJSONObject(i).getString("dlink");
                        Intrinsics.O10IXXX0X(string, "getString(...)");
                        arrayList.add(new TeraBoxItemDLink(j, string));
                    }
                    LogUtils.m11128d("terabox list item teraBox = " + arrayList.size() + " ");
                    if (function2 != null) {
                        function2.invoke2(arrayList);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    Function1<List<TeraBoxItemDLink>, Unit> function3 = function1;
                    if (function3 != null) {
                        function3.invoke2(null);
                    }
                }
            }
        });
    }

    public final void OXO1() {
        if (O00.length() > 0) {
            AndroidNetworking.cancel(O00);
        }
    }

    public final void OiIIX101O() {
        a01 a01Var = a01.OXO1;
        a01Var.IiI10X().remove(b01.f5628O1);
        a01Var.IiI10X().remove(b01.O1iXiI);
    }

    @tb1
    public final OSSClient XIi00iiXO(@tb1 UploadOSSWorker.StsRamData stsRamData) {
        String accessKeySecret;
        String accessKeyId;
        String securityToken;
        String bucket;
        String endPoint;
        UploadOSSWorker.ResponseData response;
        UploadOSSWorker.Credentials credentials;
        UploadOSSWorker.ResponseData response2;
        UploadOSSWorker.Credentials credentials2;
        UploadOSSWorker.ResponseData response3;
        UploadOSSWorker.Credentials credentials3;
        String str = "";
        if (stsRamData == null || (response3 = stsRamData.getResponse()) == null || (credentials3 = response3.getCredentials()) == null || (accessKeySecret = credentials3.getAccessKeySecret()) == null) {
            accessKeySecret = "";
        }
        if (stsRamData == null || (response2 = stsRamData.getResponse()) == null || (credentials2 = response2.getCredentials()) == null || (accessKeyId = credentials2.getAccessKeyId()) == null) {
            accessKeyId = "";
        }
        if (stsRamData == null || (response = stsRamData.getResponse()) == null || (credentials = response.getCredentials()) == null || (securityToken = credentials.getSecurityToken()) == null) {
            securityToken = "";
        }
        if (stsRamData == null || (bucket = stsRamData.getBucket()) == null) {
            bucket = "";
        }
        if (stsRamData != null && (endPoint = stsRamData.getEndPoint()) != null) {
            str = endPoint;
        }
        if (securityToken.length() > 0 && accessKeySecret.length() > 0 && accessKeyId.length() > 0 && bucket.length() > 0) {
            IiI10X = new OSSClient(Utils.getApp(), str, new OSSStsTokenCredentialProvider(accessKeyId, accessKeySecret, securityToken));
            i1O0OXO1O.OXO1.OXO1("TeraBoxManager  createOSSClient   bucket = " + bucket);
        }
        return IiI10X;
    }

    public final void XO0O10(@aa1 String url, @aa1 String access_tokens, @aa1 String fileName, @tb1 final Function1<? super Integer, Unit> function1) {
        Intrinsics.X0O(url, "url");
        Intrinsics.X0O(access_tokens, "access_tokens");
        Intrinsics.X0O(fileName, "fileName");
        LogUtils.m11128d("terabox list item downLoaLink = " + fileName + " ");
        if (i72.OXO1.I0i1OXiI()) {
            O00 = url + "&access_tokens=" + access_tokens;
            NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
            String str = url + "&access_tokens=" + access_tokens;
            String absolutePath = uz0.O001I(sz0.OXO1).getAbsolutePath();
            Intrinsics.O10IXXX0X(absolutePath, "getAbsolutePath(...)");
            netWorkUtils.download(str, absolutePath, fileName, new HttpProgressCallback<String>() { // from class: com.sma.smartv3.biz.MusicServerManager$downLoadLink$1
                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                public void handleResponse(String str2) {
                    Function1<Integer, Unit> function2 = function1;
                    if (function2 != null) {
                        function2.invoke2(200);
                    }
                }

                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                public void handleError(String error) {
                    Intrinsics.X0O(error, "error");
                    Function1<Integer, Unit> function2 = function1;
                    if (function2 != null) {
                        function2.invoke2(-1);
                    }
                }

                @Override // com.sma.androidnetworklib.method.HttpProgressCallback
                public void handleProgress(int i) {
                    Function1<Integer, Unit> function2 = function1;
                    if (function2 != null) {
                        function2.invoke2(Integer.valueOf(i));
                    }
                }
            });
            return;
        }
        HashMap map = new HashMap();
        map.put("User-Agent", "pan.baidu.com");
        O00 = url + "&access_token=" + access_tokens;
        String absolutePath2 = uz0.O001I(sz0.OXO1).getAbsolutePath();
        Intrinsics.O10IXXX0X(absolutePath2, "getAbsolutePath(...)");
        NetWorkUtils.INSTANCE.downloadV2(url + "&access_token=" + access_tokens, map, absolutePath2, fileName, new HttpProgressCallback<String>() { // from class: com.sma.smartv3.biz.MusicServerManager$downLoadLink$2
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(String str2) {
                Function1<Integer, Unit> function2 = function1;
                if (function2 != null) {
                    function2.invoke2(200);
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                Function1<Integer, Unit> function2 = function1;
                if (function2 != null) {
                    function2.invoke2(-1);
                }
            }

            @Override // com.sma.androidnetworklib.method.HttpProgressCallback
            public void handleProgress(int i) {
                Function1<Integer, Unit> function2 = function1;
                if (function2 != null) {
                    function2.invoke2(Integer.valueOf(i));
                }
            }
        });
    }

    @aa1
    public final String XOO0ii0() {
        return O00;
    }

    public final void XX0(@aa1 Function1<? super Pair<UploadOSSWorker.StsRamData, Integer>, Unit> callback) throws IllegalAccessException, InstantiationException {
        UploadOSSWorker.Credentials credentials;
        String expiration;
        Intrinsics.X0O(callback, "callback");
        SPUtils sPUtilsM1440iO = a01.OXO1.m1440iO();
        UploadOSSWorker uploadOSSWorker = UploadOSSWorker.OXO1;
        String strO10IXXX0X = uploadOSSWorker.O10IXXX0X();
        Object objFromJson = new Gson().fromJson(sPUtilsM1440iO.getString(strO10IXXX0X + '_' + UploadOSSWorker.StsRamData.class.getName()), (Class<Object>) UploadOSSWorker.StsRamData.class);
        if (objFromJson == null) {
            objFromJson = UploadOSSWorker.StsRamData.class.newInstance();
        }
        UploadOSSWorker.StsRamData stsRamData = (UploadOSSWorker.StsRamData) objFromJson;
        UploadOSSWorker.ResponseData response = stsRamData.getResponse();
        if (response == null || (credentials = response.getCredentials()) == null || (expiration = credentials.getExpiration()) == null || expiration.length() <= 0) {
            I0iXXO(callback);
        } else if (uploadOSSWorker.m38959IO(stsRamData.getResponse().getCredentials().getExpiration())) {
            I0iXXO(callback);
        } else {
            callback.invoke2(new Pair(stsRamData, 0));
        }
    }

    public final void XXI(@aa1 String access_tokens, @aa1 String key, @tb1 final Function1<? super List<TeraBoxListItem>, Unit> function1) {
        String str;
        Intrinsics.X0O(access_tokens, "access_tokens");
        Intrinsics.X0O(key, "key");
        if (i72.OXO1.I0i1OXiI()) {
            str = "https://www.terabox.com/openapi/api/search?access_tokens=" + access_tokens + "&key=" + key;
        } else {
            str = "http://pan.baidu.com/rest/2.0/xpan/file?access_token=" + access_tokens + "&key=" + key + "&method=search&recursion=1";
        }
        LogUtils.m11128d("getMusicSearch url -> " + str);
        AndroidNetworking.get(str).setPriority(Priority.LOW).build().getAsJSONObject(new JSONObjectRequestListener() { // from class: com.sma.smartv3.biz.MusicServerManager$getTeraBoxFileSearch$1

            @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 MusicServerManager.kt\ncom/sma/smartv3/biz/MusicServerManager$getTeraBoxFileSearch$1\n*L\n1#1,328:1\n283#2:329\n*E\n"})
            public static final class OXO1<T> implements Comparator {
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.I0iXXO(Boolean.valueOf(((TeraBoxListItem) t).getIsdir() < 1), Boolean.valueOf(((TeraBoxListItem) t2).getIsdir() < 1));
                }
            }

            @Override // com.androidnetworking.interfaces.JSONObjectRequestListener
            public void onError(ANError aNError) {
                LogUtils.m11128d("getMusicSearch onError -> error = " + (aNError != null ? aNError.getErrorBody() : null));
                ToastUtils.showLong(aNError != null ? aNError.getErrorBody() : null, new Object[0]);
                Function1<List<TeraBoxListItem>, Unit> function2 = function1;
                if (function2 != null) {
                    function2.invoke2(null);
                }
            }

            /* JADX WARN: Code duplicated, block: B:12:0x00d6  */
            /* JADX WARN: Code duplicated, block: B:16:0x00dc A[Catch: Exception -> 0x00d8, TryCatch #0 {Exception -> 0x00d8, blocks: (B:4:0x0024, B:6:0x002c, B:8:0x003a, B:10:0x00cb, B:16:0x00dc, B:17:0x00df, B:18:0x00e7, B:20:0x00ed, B:22:0x00f4, B:24:0x00fe), top: B:30:0x0024 }] */
            /* JADX WARN: Code duplicated, block: B:34:0x00df A[SYNTHETIC] */
            @Override // com.androidnetworking.interfaces.JSONObjectRequestListener
            public void onResponse(JSONObject jSONObject) {
                String str2 = "server_filename";
                LogUtils.m11128d("getMusicSearch onResponse -> " + jSONObject);
                if (jSONObject != null) {
                    try {
                        JSONArray jSONArray = jSONObject.getJSONArray("list");
                        if (jSONArray != null) {
                            Function1<List<TeraBoxListItem>, Unit> function2 = function1;
                            ArrayList arrayList = new ArrayList();
                            int length = jSONArray.length();
                            int i = 0;
                            while (i < length) {
                                int i2 = jSONArray.getJSONObject(i).getInt("isdir");
                                String string = jSONArray.getJSONObject(i).getString(str2);
                                long j = jSONArray.getJSONObject(i).getLong("fs_id");
                                String string2 = jSONArray.getJSONObject(i).getString("category");
                                Intrinsics.O10IXXX0X(string2, "getString(...)");
                                int i3 = length;
                                long j2 = jSONArray.getJSONObject(i).getLong("local_mtime");
                                long j3 = jSONArray.getJSONObject(i).getLong("server_ctime");
                                String string3 = jSONArray.getJSONObject(i).getString(str2);
                                Intrinsics.O10IXXX0X(string3, "getString(...)");
                                String str3 = str2;
                                int i4 = jSONArray.getJSONObject(i).getInt(MapBundleKey.OfflineMapKey.OFFLINE_TOTAL_SIZE);
                                int i5 = jSONArray.getJSONObject(i).getInt("isdir");
                                String string4 = jSONArray.getJSONObject(i).getString("path");
                                Intrinsics.O10IXXX0X(string4, "getString(...)");
                                TeraBoxListItem teraBoxListItem = new TeraBoxListItem(j, string2, j2, j3, string3, i4, i5, string4);
                                LogUtils.m11128d("getMusicSearch terabox list item teraBox = " + teraBoxListItem + " ");
                                if (i2 == 0) {
                                    MusicServerManager musicServerManager = MusicServerManager.OXO1;
                                    Intrinsics.XXI(string);
                                    if (musicServerManager.iIiiO(string)) {
                                        arrayList.add(teraBoxListItem);
                                    } else if (i2 == 1) {
                                        arrayList.add(teraBoxListItem);
                                    }
                                } else if (i2 == 1) {
                                    arrayList.add(teraBoxListItem);
                                }
                                i++;
                                length = i3;
                                str2 = str3;
                            }
                            if (arrayList.size() > 0 && arrayList.size() > 1) {
                                XiX0OOXI0.XOXiX0(arrayList, new OXO1());
                            }
                            if (function2 != null) {
                                function2.invoke2(arrayList);
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        Function1<List<TeraBoxListItem>, Unit> function3 = function1;
                        if (function3 != null) {
                            function3.invoke2(null);
                        }
                    }
                }
            }
        });
    }

    public final void XiOIO(@aa1 String token, @aa1 final Function1<? super Boolean, Unit> callback) {
        Intrinsics.X0O(token, "token");
        Intrinsics.X0O(callback, "callback");
        if (!i72.OXO1.I0i1OXiI()) {
            callback.invoke2(Boolean.valueOf(m38100iO(a01.OXO1.IiI10X().getLong(b01.IX0iIX, 0L))));
            return;
        }
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> teraBoxTokenInfoBody = RequestBodyKt.getTeraBoxTokenInfoBody(token);
        final O1XIiIO<TeraBoxTokenInfo> o1XIiIO = new O1XIiIO<TeraBoxTokenInfo>() { // from class: com.sma.smartv3.biz.MusicServerManager$getTeraBoxTokenInfo$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(TeraBoxTokenInfo teraBoxTokenInfo) {
                LogUtils.m11128d("getTeraBoxTokenInfo -> " + teraBoxTokenInfo);
                if (teraBoxTokenInfo != null) {
                    try {
                        String user_id = teraBoxTokenInfo.getUser_id();
                        if (user_id != null && user_id.length() > 0) {
                            callback.invoke2(Boolean.TRUE);
                            return;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        callback.invoke2(Boolean.FALSE);
                        return;
                    }
                }
                callback.invoke2(Boolean.FALSE);
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                LogUtils.m11128d("getTeraBoxTokenInfo -> " + error);
                callback.invoke2(Boolean.FALSE);
            }
        };
        Map<String, String> headersMap = netWorkUtils.getHeadersMap();
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetTeraBoxTokenInfo.URL);
        String str = strConvertBaseUrl + GetTeraBoxTokenInfo.URL;
        Map<String, ? extends Object> mapX111IO = kotlin.collections.OXO1.X111IO(teraBoxTokenInfoBody);
        mapX111IO.putAll(headersMap);
        Unit unit = Unit.OXO1;
        netWorkUtils.printParam(str, mapX111IO);
        NetWork netWork = NetWork.OXO1;
        String str2 = strConvertBaseUrl + GetTeraBoxTokenInfo.URL;
        final O1XIiIO<Response<TeraBoxTokenInfo>> o1XIiIO2 = new O1XIiIO<Response<TeraBoxTokenInfo>>() { // from class: com.sma.smartv3.biz.MusicServerManager$getTeraBoxTokenInfo$$inlined$postV2$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<TeraBoxTokenInfo> response) {
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
        AndroidNetworking.post(str2).addHeaders(headersMap).addBodyParameter((Map<String, String>) teraBoxTokenInfoBody).setTag((Object) str2).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, TeraBoxTokenInfo.class), new ParsedRequestListener<Response<TeraBoxTokenInfo>>() { // from class: com.sma.smartv3.biz.MusicServerManager$getTeraBoxTokenInfo$$inlined$postV2$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<TeraBoxTokenInfo> response) {
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

    public final void XiOIii1(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        O00 = str;
    }

    public final boolean iIiiO(@aa1 String name) {
        Intrinsics.X0O(name, "name");
        return oe5.O0Ii(name, ".mp3", false, 2, null) || oe5.O0Ii(name, ".MP3", false, 2, null);
    }

    /* JADX INFO: renamed from: iO */
    public final boolean m38100iO(long j) {
        return System.currentTimeMillis() - j > 864000;
    }
}
