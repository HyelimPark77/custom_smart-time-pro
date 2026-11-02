package com.sma.smartv3.network;

import android.app.Activity;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.e44;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.yn0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.ANRequest;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interceptors.HttpLoggingInterceptor;
import com.androidnetworking.interfaces.JSONObjectRequestListener;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.GsonUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.blankj.utilcode.util.Utils;
import com.facebook.internal.security.CertificateUtil;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ironsource.C11921G5;
import com.ironsource.C12616d4;
import com.sma.androidnetworklib.method.HttpProgressCallback;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.biz.UploadInfoManager;
import com.sma.smartv3.biz.fitness_site.hyky.HykyAPI;
import com.sma.smartv3.biz.fitness_site.hyky.HykyManager;
import com.sma.smartv3.biz.fitness_site.hyky.HykyResponse;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.UploadDownloadInfo;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BleCache;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.OXO1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.Typography;
import kotlinx.coroutines.CoroutineDispatcher;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.sse.EventSource;
import okhttp3.sse.EventSourceListener;
import okhttp3.sse.EventSources;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nNetWorkUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 2 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,925:1\n116#2,23:926\n200#2,7:949\n218#2:956\n200#2,7:957\n218#2:964\n226#2,8:966\n245#2:974\n226#2,8:975\n245#2:983\n252#2,7:984\n270#2:991\n252#2,7:992\n270#2:999\n278#2,8:1000\n298#2:1008\n278#2,8:1009\n298#2:1017\n359#2,17:1018\n278#2,8:1035\n298#2:1043\n278#2,8:1044\n298#2:1052\n383#2,18:1053\n383#2,18:1071\n383#2,18:1089\n432#2,13:1107\n226#2,8:1124\n245#2:1132\n252#2,7:1133\n270#2:1140\n226#2,8:1141\n245#2:1149\n252#2,7:1150\n270#2:1157\n1#3:965\n19#4:1120\n15#4:1121\n19#4:1122\n15#4:1123\n*S KotlinDebug\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n*L\n109#1:926,23\n136#1:949,7\n136#1:956\n136#1:957,7\n136#1:964\n164#1:966,8\n164#1:974\n164#1:975,8\n164#1:983\n186#1:984,7\n186#1:991\n186#1:992,7\n186#1:999\n246#1:1000,8\n246#1:1008\n246#1:1009,8\n246#1:1017\n268#1:1018,17\n292#1:1035,8\n292#1:1043\n292#1:1044,8\n292#1:1052\n314#1:1053,18\n336#1:1071,18\n360#1:1089,18\n505#1:1107,13\n880#1:1124,8\n880#1:1132\n894#1:1133,7\n894#1:1140\n880#1:1141,8\n880#1:1149\n894#1:1150,7\n894#1:1157\n731#1:1120\n731#1:1121\n744#1:1122\n744#1:1123\n*E\n"})
public final class NetWorkUtils {

    @aa1
    public static final NetWorkUtils INSTANCE = new NetWorkUtils();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.sma.smartv3.network.NetWorkUtils$get$1, reason: case insensitive filesystem */
    @SourceDebugExtension({"SMAP\nNetWorkUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$get$1\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,925:1\n552#2,8:926\n561#2,5:935\n1#3:934\n*S KotlinDebug\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$get$1\n*L\n139#1:926,8\n139#1:935,5\n139#1:934\n*E\n"})
    public static final class C289541<T> implements O1XIiIO<Response<T>> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ O1XIiIO<T> $callback;
        final /* synthetic */ C3006uq $progressPopup;

        public C289541(Activity activity, O1XIiIO<T> o1XIiIO, C3006uq c3006uq) {
            this.$activity = activity;
            this.$callback = o1XIiIO;
            this.$progressPopup = c3006uq;
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public void handleError(String error) {
            Intrinsics.X0O(error, "error");
            NetWorkUtils.INSTANCE.errorData(error, this.$callback, this.$progressPopup);
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public void handleResponse(Response<T> response) {
            NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
            Activity activity = this.$activity;
            O1XIiIO<T> o1XIiIO = this.$callback;
            C3006uq c3006uq = this.$progressPopup;
            LogUtils.m11128d(yn0.I0IIOi + response);
            if (response == null) {
                response = new Response<>();
                response.setCode(-1000);
            }
            netWorkUtils.responseWhenCheck(activity, response, o1XIiIO);
            if (c3006uq != null) {
                c3006uq.dismiss();
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.sma.smartv3.network.NetWorkUtils$getNewApiWeather$2 */
    @SourceDebugExtension({"SMAP\nNetWorkUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$getNewApiWeather$2\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,925:1\n552#2,8:926\n561#2,5:935\n1#3:934\n*S KotlinDebug\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$getNewApiWeather$2\n*L\n883#1:926,8\n883#1:935,5\n883#1:934\n*E\n"})
    public static final class C186192<T> implements O1XIiIO<Response<T>> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ O1XIiIO<T> $callback;
        final /* synthetic */ C3006uq $progressPopup;

        public C186192(Activity activity, O1XIiIO<T> o1XIiIO, C3006uq c3006uq) {
            this.$activity = activity;
            this.$callback = o1XIiIO;
            this.$progressPopup = c3006uq;
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public void handleError(String error) {
            Intrinsics.X0O(error, "error");
            NetWorkUtils.INSTANCE.errorData(error, this.$callback, this.$progressPopup);
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public void handleResponse(Response<T> response) {
            NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
            Activity activity = this.$activity;
            O1XIiIO<T> o1XIiIO = this.$callback;
            C3006uq c3006uq = this.$progressPopup;
            LogUtils.m11128d(yn0.I0IIOi + response);
            if (response == null) {
                response = new Response<>();
                response.setCode(-1000);
            }
            netWorkUtils.responseWhenCheck(activity, response, o1XIiIO);
            if (c3006uq != null) {
                c3006uq.dismiss();
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.sma.smartv3.network.NetWorkUtils$getNewApiWeather$3 */
    @SourceDebugExtension({"SMAP\nNetWorkUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$getNewApiWeather$3\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,925:1\n552#2,8:926\n561#2,5:935\n1#3:934\n*S KotlinDebug\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$getNewApiWeather$3\n*L\n897#1:926,8\n897#1:935,5\n897#1:934\n*E\n"})
    public static final class C186153<T> implements O1XIiIO<Response<T>> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ O1XIiIO<T> $callback;
        final /* synthetic */ C3006uq $progressPopup;

        public C186153(Activity activity, O1XIiIO<T> o1XIiIO, C3006uq c3006uq) {
            this.$activity = activity;
            this.$callback = o1XIiIO;
            this.$progressPopup = c3006uq;
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public void handleError(String error) {
            Intrinsics.X0O(error, "error");
            NetWorkUtils.INSTANCE.errorData(error, this.$callback, this.$progressPopup);
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public void handleResponse(Response<T> response) {
            NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
            Activity activity = this.$activity;
            O1XIiIO<T> o1XIiIO = this.$callback;
            C3006uq c3006uq = this.$progressPopup;
            LogUtils.m11128d(yn0.I0IIOi + response);
            if (response == null) {
                response = new Response<>();
                response.setCode(-1000);
            }
            netWorkUtils.responseWhenCheck(activity, response, o1XIiIO);
            if (c3006uq != null) {
                c3006uq.dismiss();
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.sma.smartv3.network.NetWorkUtils$getV2$2, reason: case insensitive filesystem */
    @SourceDebugExtension({"SMAP\nNetWorkUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$getV2$2\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,925:1\n552#2,8:926\n561#2,5:935\n1#3:934\n*S KotlinDebug\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$getV2$2\n*L\n167#1:926,8\n167#1:935,5\n167#1:934\n*E\n"})
    public static final class C289552<T> implements O1XIiIO<Response<T>> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ O1XIiIO<T> $callback;
        final /* synthetic */ C3006uq $progressPopup;

        public C289552(Activity activity, O1XIiIO<T> o1XIiIO, C3006uq c3006uq) {
            this.$activity = activity;
            this.$callback = o1XIiIO;
            this.$progressPopup = c3006uq;
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public void handleError(String error) {
            Intrinsics.X0O(error, "error");
            NetWorkUtils.INSTANCE.errorData(error, this.$callback, this.$progressPopup);
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public void handleResponse(Response<T> response) {
            NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
            Activity activity = this.$activity;
            O1XIiIO<T> o1XIiIO = this.$callback;
            C3006uq c3006uq = this.$progressPopup;
            LogUtils.m11128d(yn0.I0IIOi + response);
            if (response == null) {
                response = new Response<>();
                response.setCode(-1000);
            }
            netWorkUtils.responseWhenCheck(activity, response, o1XIiIO);
            if (c3006uq != null) {
                c3006uq.dismiss();
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.sma.smartv3.network.NetWorkUtils$post$1, reason: case insensitive filesystem */
    @SourceDebugExtension({"SMAP\nNetWorkUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$post$1\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,925:1\n552#2,8:926\n561#2,5:935\n1#3:934\n*S KotlinDebug\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$post$1\n*L\n189#1:926,8\n189#1:935,5\n189#1:934\n*E\n"})
    public static final class C289561<T> implements O1XIiIO<Response<T>> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ O1XIiIO<T> $callback;
        final /* synthetic */ C3006uq $progressPopup;

        public C289561(Activity activity, O1XIiIO<T> o1XIiIO, C3006uq c3006uq) {
            this.$activity = activity;
            this.$callback = o1XIiIO;
            this.$progressPopup = c3006uq;
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public void handleError(String error) {
            Intrinsics.X0O(error, "error");
            NetWorkUtils.INSTANCE.errorData(error, this.$callback, this.$progressPopup);
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public void handleResponse(Response<T> response) {
            NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
            Activity activity = this.$activity;
            O1XIiIO<T> o1XIiIO = this.$callback;
            C3006uq c3006uq = this.$progressPopup;
            LogUtils.m11128d(yn0.I0IIOi + response);
            if (response == null) {
                response = new Response<>();
                response.setCode(-1000);
            }
            netWorkUtils.responseWhenCheck(activity, response, o1XIiIO);
            if (c3006uq != null) {
                c3006uq.dismiss();
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.sma.smartv3.network.NetWorkUtils$postHyky$1, reason: case insensitive filesystem */
    @SourceDebugExtension({"SMAP\nNetWorkUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$postHyky$1\n*L\n1#1,925:1\n*E\n"})
    public static final class C289571<T> implements ParsedRequestListener<HykyResponse<T>> {
        final /* synthetic */ O1XIiIO<T> $callback;

        public C289571(O1XIiIO<T> o1XIiIO) {
            this.$callback = o1XIiIO;
        }

        @Override // com.androidnetworking.interfaces.ParsedRequestListener
        public void onError(ANError aNError) {
            Response response;
            Integer numValueOf = null;
            LogUtils.m11128d("errorCode:" + (aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null) + ", errorBody:" + (aNError != null ? aNError.getErrorBody() : null) + ", " + (aNError != null ? aNError.getErrorDetail() : null));
            if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                numValueOf = Integer.valueOf(response.getCode());
            } else if (aNError != null) {
                numValueOf = Integer.valueOf(aNError.getErrorCode());
            }
            O1XIiIO<T> o1XIiIO = this.$callback;
            if (o1XIiIO != null) {
                o1XIiIO.handleError(String.valueOf(numValueOf));
            }
        }

        @Override // com.androidnetworking.interfaces.ParsedRequestListener
        public void onResponse(HykyResponse<T> response) {
            Intrinsics.X0O(response, "response");
            if (response.getCode() == 200) {
                O1XIiIO<T> o1XIiIO = this.$callback;
                if (o1XIiIO != null) {
                    o1XIiIO.handleResponse(response.getData());
                    return;
                }
                return;
            }
            O1XIiIO<T> o1XIiIO2 = this.$callback;
            if (o1XIiIO2 != null) {
                o1XIiIO2.handleError(response.getCode() + " " + response.getMessage());
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.sma.smartv3.network.NetWorkUtils$postJson$1, reason: case insensitive filesystem */
    @SourceDebugExtension({"SMAP\nNetWorkUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$postJson$1\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,925:1\n552#2,8:926\n561#2,5:935\n1#3:934\n*S KotlinDebug\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$postJson$1\n*L\n271#1:926,8\n271#1:935,5\n271#1:934\n*E\n"})
    public static final class C289581<T> implements O1XIiIO<Response<T>> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ O1XIiIO<T> $callback;
        final /* synthetic */ C3006uq $progressPopup;

        public C289581(Activity activity, O1XIiIO<T> o1XIiIO, C3006uq c3006uq) {
            this.$activity = activity;
            this.$callback = o1XIiIO;
            this.$progressPopup = c3006uq;
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public void handleError(String error) {
            Intrinsics.X0O(error, "error");
            NetWorkUtils.INSTANCE.errorData(error, this.$callback, this.$progressPopup);
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public void handleResponse(Response<T> response) {
            NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
            Activity activity = this.$activity;
            O1XIiIO<T> o1XIiIO = this.$callback;
            C3006uq c3006uq = this.$progressPopup;
            LogUtils.m11128d(yn0.I0IIOi + response);
            if (response == null) {
                response = new Response<>();
                response.setCode(-1000);
            }
            netWorkUtils.responseWhenCheck(activity, response, o1XIiIO);
            if (c3006uq != null) {
                c3006uq.dismiss();
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.sma.smartv3.network.NetWorkUtils$postJsonThirdParty$1, reason: case insensitive filesystem */
    @SourceDebugExtension({"SMAP\nNetWorkUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$postJsonThirdParty$1\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,925:1\n552#2,8:926\n561#2,5:935\n1#3:934\n*S KotlinDebug\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$postJsonThirdParty$1\n*L\n316#1:926,8\n316#1:935,5\n316#1:934\n*E\n"})
    public static final class C289591<T> implements O1XIiIO<Response<T>> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ O1XIiIO<T> $callback;
        final /* synthetic */ C3006uq $progressPopup;

        public C289591(Activity activity, O1XIiIO<T> o1XIiIO, C3006uq c3006uq) {
            this.$activity = activity;
            this.$callback = o1XIiIO;
            this.$progressPopup = c3006uq;
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public void handleError(String error) {
            Intrinsics.X0O(error, "error");
            NetWorkUtils.INSTANCE.errorData(error, this.$callback, this.$progressPopup);
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public void handleResponse(Response<T> response) {
            NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
            Activity activity = this.$activity;
            O1XIiIO<T> o1XIiIO = this.$callback;
            C3006uq c3006uq = this.$progressPopup;
            LogUtils.m11128d(yn0.I0IIOi + response);
            if (response == null) {
                response = new Response<>();
                response.setCode(-1000);
            }
            netWorkUtils.responseWhenCheck(activity, response, o1XIiIO);
            if (c3006uq != null) {
                c3006uq.dismiss();
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.sma.smartv3.network.NetWorkUtils$postJsonV2$2, reason: case insensitive filesystem */
    @SourceDebugExtension({"SMAP\nNetWorkUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$postJsonV2$2\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,925:1\n552#2,8:926\n561#2,5:935\n1#3:934\n*S KotlinDebug\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$postJsonV2$2\n*L\n339#1:926,8\n339#1:935,5\n339#1:934\n*E\n"})
    public static final class C289602<T> implements O1XIiIO<Response<T>> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ O1XIiIO<T> $callback;
        final /* synthetic */ C3006uq $progressPopup;

        public C289602(Activity activity, O1XIiIO<T> o1XIiIO, C3006uq c3006uq) {
            this.$activity = activity;
            this.$callback = o1XIiIO;
            this.$progressPopup = c3006uq;
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public void handleError(String error) {
            Intrinsics.X0O(error, "error");
            NetWorkUtils.INSTANCE.errorData(error, this.$callback, this.$progressPopup);
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public void handleResponse(Response<T> response) {
            NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
            Activity activity = this.$activity;
            O1XIiIO<T> o1XIiIO = this.$callback;
            C3006uq c3006uq = this.$progressPopup;
            LogUtils.m11128d(yn0.I0IIOi + response);
            if (response == null) {
                response = new Response<>();
                response.setCode(-1000);
            }
            netWorkUtils.responseWhenCheck(activity, response, o1XIiIO);
            if (c3006uq != null) {
                c3006uq.dismiss();
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.sma.smartv3.network.NetWorkUtils$postJsonV2$3, reason: case insensitive filesystem */
    @SourceDebugExtension({"SMAP\nNetWorkUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$postJsonV2$3\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,925:1\n552#2,8:926\n561#2,5:935\n1#3:934\n*S KotlinDebug\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$postJsonV2$3\n*L\n363#1:926,8\n363#1:935,5\n363#1:934\n*E\n"})
    public static final class C289613<T> implements O1XIiIO<Response<T>> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ O1XIiIO<T> $callback;
        final /* synthetic */ C3006uq $progressPopup;

        public C289613(Activity activity, O1XIiIO<T> o1XIiIO, C3006uq c3006uq) {
            this.$activity = activity;
            this.$callback = o1XIiIO;
            this.$progressPopup = c3006uq;
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public void handleError(String error) {
            Intrinsics.X0O(error, "error");
            NetWorkUtils.INSTANCE.errorData(error, this.$callback, this.$progressPopup);
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public void handleResponse(Response<T> response) {
            NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
            Activity activity = this.$activity;
            O1XIiIO<T> o1XIiIO = this.$callback;
            C3006uq c3006uq = this.$progressPopup;
            LogUtils.m11128d(yn0.I0IIOi + response);
            if (response == null) {
                response = new Response<>();
                response.setCode(-1000);
            }
            netWorkUtils.responseWhenCheck(activity, response, o1XIiIO);
            if (c3006uq != null) {
                c3006uq.dismiss();
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.sma.smartv3.network.NetWorkUtils$postParameterThirdParty$1, reason: case insensitive filesystem */
    @SourceDebugExtension({"SMAP\nNetWorkUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$postParameterThirdParty$1\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,925:1\n552#2,8:926\n561#2,5:935\n1#3:934\n*S KotlinDebug\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$postParameterThirdParty$1\n*L\n294#1:926,8\n294#1:935,5\n294#1:934\n*E\n"})
    public static final class C289621<T> implements O1XIiIO<Response<T>> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ O1XIiIO<T> $callback;
        final /* synthetic */ C3006uq $progressPopup;

        public C289621(Activity activity, O1XIiIO<T> o1XIiIO, C3006uq c3006uq) {
            this.$activity = activity;
            this.$callback = o1XIiIO;
            this.$progressPopup = c3006uq;
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public void handleError(String error) {
            Intrinsics.X0O(error, "error");
            NetWorkUtils.INSTANCE.errorData(error, this.$callback, this.$progressPopup);
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public void handleResponse(Response<T> response) {
            NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
            Activity activity = this.$activity;
            O1XIiIO<T> o1XIiIO = this.$callback;
            C3006uq c3006uq = this.$progressPopup;
            LogUtils.m11128d(yn0.I0IIOi + response);
            if (response == null) {
                response = new Response<>();
                response.setCode(-1000);
            }
            netWorkUtils.responseWhenCheck(activity, response, o1XIiIO);
            if (c3006uq != null) {
                c3006uq.dismiss();
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.sma.smartv3.network.NetWorkUtils$postV2$2, reason: case insensitive filesystem */
    @SourceDebugExtension({"SMAP\nNetWorkUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$postV2$2\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,925:1\n552#2,8:926\n561#2,5:935\n1#3:934\n*S KotlinDebug\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$postV2$2\n*L\n249#1:926,8\n249#1:935,5\n249#1:934\n*E\n"})
    public static final class C289652<T> implements O1XIiIO<Response<T>> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ O1XIiIO<T> $callback;
        final /* synthetic */ C3006uq $progressPopup;

        public C289652(Activity activity, O1XIiIO<T> o1XIiIO, C3006uq c3006uq) {
            this.$activity = activity;
            this.$callback = o1XIiIO;
            this.$progressPopup = c3006uq;
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public void handleError(String error) {
            Intrinsics.X0O(error, "error");
            NetWorkUtils.INSTANCE.errorData(error, this.$callback, this.$progressPopup);
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public void handleResponse(Response<T> response) {
            NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
            Activity activity = this.$activity;
            O1XIiIO<T> o1XIiIO = this.$callback;
            C3006uq c3006uq = this.$progressPopup;
            LogUtils.m11128d(yn0.I0IIOi + response);
            if (response == null) {
                response = new Response<>();
                response.setCode(-1000);
            }
            netWorkUtils.responseWhenCheck(activity, response, o1XIiIO);
            if (c3006uq != null) {
                c3006uq.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.network.NetWorkUtils$postV3$1, reason: case insensitive filesystem */
    @DebugMetadata(m39465c = "com.sma.smartv3.network.NetWorkUtils$postV3$1", m39466f = "NetWorkUtils.kt", m39467i = {}, m39468l = {207}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    @SourceDebugExtension({"SMAP\nNetWorkUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$postV3$1\n*L\n1#1,925:1\n*E\n"})
    public static final class C289661 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        final /* synthetic */ Map<String, Object> $body;
        final /* synthetic */ O1XIiIO<T> $callback;
        final /* synthetic */ Map<String, String> $headers;
        final /* synthetic */ C3006uq $progressRef;
        final /* synthetic */ String $url;
        final /* synthetic */ WeakReference<AppCompatActivity> $weakActivity;
        int label;

        /* JADX INFO: renamed from: com.sma.smartv3.network.NetWorkUtils$postV3$1$1 */
        @DebugMetadata(m39465c = "com.sma.smartv3.network.NetWorkUtils$postV3$1$1", m39466f = "NetWorkUtils.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
        @SourceDebugExtension({"SMAP\nNetWorkUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$postV3$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,925:1\n1#2:926\n315#3,2:927\n317#3,8:930\n325#3,13:939\n352#3:952\n216#4:929\n217#4:938\n*S KotlinDebug\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$postV3$1$1\n*L\n210#1:927,2\n210#1:930,8\n210#1:939,13\n210#1:952\n210#1:929\n210#1:938\n*E\n"})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
            final /* synthetic */ Map<String, Object> $body;
            final /* synthetic */ O1XIiIO<T> $callback;
            final /* synthetic */ Map<String, String> $headers;
            final /* synthetic */ String $url;
            final /* synthetic */ WeakReference<AppCompatActivity> $weakActivity;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(String str, Map<String, ? extends Object> map, Map<String, String> map2, WeakReference<AppCompatActivity> weakReference, O1XIiIO<T> o1XIiIO, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$url = str;
                this.$body = map;
                this.$headers = map2;
                this.$weakActivity = weakReference;
                this.$callback = o1XIiIO;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$url, this.$body, this.$headers, this.$weakActivity, this.$callback, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                String string;
                C2798pb.I0iXXO();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.X1ii(obj);
                NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
                String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), this.$url);
                String str = strConvertBaseUrl + this.$url;
                Map<String, ? extends Object> mapX111IO = OXO1.X111IO(this.$body);
                mapX111IO.putAll(this.$headers);
                Unit unit = Unit.OXO1;
                netWorkUtils.printParam(str, mapX111IO);
                NetWork netWork = NetWork.OXO1;
                String str2 = strConvertBaseUrl + this.$url;
                Map<String, String> map = this.$headers;
                Map<String, Object> map2 = this.$body;
                Intrinsics.XiOIii1();
                final WeakReference<AppCompatActivity> weakReference = this.$weakActivity;
                final O1XIiIO<T> o1XIiIO = this.$callback;
                final O1XIiIO<Response<T>> o1XIiIO2 = new O1XIiIO<Response<T>>() { // from class: com.sma.smartv3.network.NetWorkUtils.postV3.1.1.2
                    @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                    public void handleError(final String error) {
                        Intrinsics.X0O(error, "error");
                        final AppCompatActivity appCompatActivity = weakReference.get();
                        if (appCompatActivity != null) {
                            final O1XIiIO<T> o1XIiIO3 = o1XIiIO;
                            appCompatActivity.runOnUiThread(new Runnable() { // from class: com.sma.smartv3.network.NetWorkUtils$postV3$1$1$2$handleError$1$1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    if (appCompatActivity.isFinishing() || appCompatActivity.isDestroyed()) {
                                        return;
                                    }
                                    NetWorkUtils.INSTANCE.errorData(error, o1XIiIO3, null);
                                }
                            });
                        }
                    }

                    @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                    public void handleResponse(final Response<T> response) {
                        final AppCompatActivity appCompatActivity = weakReference.get();
                        if (appCompatActivity != null) {
                            final O1XIiIO<T> o1XIiIO3 = o1XIiIO;
                            appCompatActivity.runOnUiThread(new Runnable() { // from class: com.sma.smartv3.network.NetWorkUtils$postV3$1$1$2$handleResponse$1$1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    Response response2;
                                    if (appCompatActivity.isFinishing() || appCompatActivity.isDestroyed()) {
                                        return;
                                    }
                                    NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                                    Response response3 = response;
                                    AppCompatActivity appCompatActivity2 = appCompatActivity;
                                    Object obj2 = o1XIiIO3;
                                    LogUtils.m11128d(yn0.I0IIOi + response3);
                                    if (response3 == null) {
                                        response2 = response3;
                                        Response response4 = new Response();
                                        response4.setCode(-1000);
                                        response2 = response4;
                                    }
                                    response2 = response3;
                                    netWorkUtils2.responseWhenCheck(appCompatActivity2, response2, obj2);
                                }
                            });
                        }
                    }
                };
                FormBody.Builder builder = new FormBody.Builder(null, 1, 0 == true ? 1 : 0);
                for (Map.Entry<String, Object> entry : map2.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (value instanceof String) {
                        string = (String) value;
                    } else if (value instanceof Boolean) {
                        string = String.valueOf(((Boolean) value).booleanValue()).toLowerCase(Locale.ROOT);
                        Intrinsics.O10IXXX0X(string, "toLowerCase(...)");
                    } else {
                        string = value instanceof Number ? value.toString() : value.toString();
                    }
                    builder.add(key, string);
                }
                Request.Builder builderPost = new Request.Builder().url(str2).post(builder.build());
                for (Map.Entry<String, String> entry2 : map.entrySet()) {
                    builderPost.addHeader(entry2.getKey(), entry2.getValue());
                }
                Call callNewCall = com.sma.androidnetworklib.OXO1.OXO1.OXO1().newCall(builderPost.build());
                Intrinsics.XiOIii1();
                callNewCall.enqueue(new Callback() { // from class: com.sma.smartv3.network.NetWorkUtils$postV3$1$1$invokeSuspend$$inlined$postV3$1
                    @Override // okhttp3.Callback
                    public void onFailure(Call call, IOException e) {
                        Intrinsics.X0O(call, "call");
                        Intrinsics.X0O(e, "e");
                        e.printStackTrace();
                        o1XIiIO2.handleError(String.valueOf(e.getMessage()));
                    }

                    @Override // okhttp3.Callback
                    public void onResponse(Call call, okhttp3.Response response) {
                        Intrinsics.X0O(call, "call");
                        Intrinsics.X0O(response, "response");
                        try {
                            ResponseBody responseBodyBody = response.body();
                            String strString = responseBodyBody != null ? responseBodyBody.string() : null;
                            Intrinsics.XiOIii1();
                            o1XIiIO2.handleResponse((Response) GsonUtils.fromJson(strString, new TypeToken<Response<T>>() { // from class: com.sma.smartv3.network.NetWorkUtils$postV3$1$1$invokeSuspend$$inlined$postV3$1.1
                            }.getType()));
                        } catch (Exception e) {
                            o1XIiIO2.handleError(String.valueOf(e.getMessage()));
                        }
                    }
                });
                return Unit.OXO1;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C289661(C3006uq c3006uq, String str, Map<String, ? extends Object> map, Map<String, String> map2, WeakReference<AppCompatActivity> weakReference, O1XIiIO<T> o1XIiIO, Continuation<? super C289661> continuation) {
            super(2, continuation);
            this.$progressRef = c3006uq;
            this.$url = str;
            this.$body = map;
            this.$headers = map2;
            this.$weakActivity = weakReference;
            this.$callback = o1XIiIO;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C289661(this.$progressRef, this.$url, this.$body, this.$headers, this.$weakActivity, this.$callback, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C289661) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objI0iXXO = C2798pb.I0iXXO();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.X1ii(obj);
                    CoroutineDispatcher coroutineDispatcherM712iO = IXOX0Xiii.m712iO();
                    Intrinsics.XiOIii1();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$url, this.$body, this.$headers, this.$weakActivity, this.$callback, null);
                    this.label = 1;
                    if (I100X1.I0IIOi(coroutineDispatcherM712iO, anonymousClass1, this) == objI0iXXO) {
                        return objI0iXXO;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.X1ii(obj);
                }
                C3006uq c3006uq = this.$progressRef;
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
                return Unit.OXO1;
            } catch (Throwable th) {
                C3006uq c3006uq2 = this.$progressRef;
                if (c3006uq2 == null) {
                    throw th;
                }
                c3006uq2.dismiss();
                throw th;
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.sma.smartv3.network.NetWorkUtils$upload$1, reason: case insensitive filesystem */
    @SourceDebugExtension({"SMAP\nNetWorkUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$upload$1\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,925:1\n552#2,8:926\n561#2,5:935\n1#3:934\n*S KotlinDebug\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$upload$1\n*L\n116#1:926,8\n116#1:935,5\n116#1:934\n*E\n"})
    public static final class C289671<T> implements O1XIiIO<Response<T>> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ O1XIiIO<T> $callback;
        final /* synthetic */ C3006uq $progressPopup;

        public C289671(Activity activity, O1XIiIO<T> o1XIiIO, C3006uq c3006uq) {
            this.$activity = activity;
            this.$callback = o1XIiIO;
            this.$progressPopup = c3006uq;
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public void handleError(String error) {
            Intrinsics.X0O(error, "error");
            NetWorkUtils.INSTANCE.errorData(error, this.$callback, this.$progressPopup);
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public void handleResponse(Response<T> response) {
            NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
            Activity activity = this.$activity;
            O1XIiIO<T> o1XIiIO = this.$callback;
            C3006uq c3006uq = this.$progressPopup;
            LogUtils.m11128d(yn0.I0IIOi + response);
            if (response == null) {
                response = new Response<>();
                response.setCode(-1000);
            }
            netWorkUtils.responseWhenCheck(activity, response, o1XIiIO);
            if (c3006uq != null) {
                c3006uq.dismiss();
            }
        }
    }

    private NetWorkUtils() {
    }

    public static /* synthetic */ void get$default(NetWorkUtils netWorkUtils, String str, O1XIiIO o1XIiIO, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        netWorkUtils.get(str, o1XIiIO, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getNewApiWeather$default(NetWorkUtils netWorkUtils, String url, Map body, O1XIiIO callback, Activity activity, View view, Map map, int i, Object obj) {
        String str;
        Type type;
        Type type2;
        Activity activity2 = (i & 8) != 0 ? null : activity;
        View view2 = (i & 16) == 0 ? view : null;
        Map headers = (i & 32) != 0 ? netWorkUtils.getHeadersMap() : map;
        Intrinsics.X0O(url, "url");
        Intrinsics.X0O(body, "body");
        Intrinsics.X0O(callback, "callback");
        Intrinsics.X0O(headers, "headers");
        C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(activity2, view2);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), url);
        i72 i72Var = i72.OXO1;
        if (!i72Var.II1Xi0()) {
            netWorkUtils.printParam(strConvertBaseUrl + url, OXO1.Ii0i(body, headers));
            i1O0OXO1O.OXO1.OXO1(UploadInfoManager.OXO1.XO0O10() + " getNewApiWeather : enableNewWeatherApi = " + i72Var.II1Xi0());
            NetWork netWork = NetWork.OXO1;
            String str2 = strConvertBaseUrl + url;
            Intrinsics.XiOIii1();
            C186153 c186153 = new C186153(activity2, callback, c3006uqLoadPopup);
            ANRequest aNRequestBuild = AndroidNetworking.post(str2).addBodyParameter((Map<String, String>) body).setTag((Object) str2).setPriority(Priority.HIGH).build();
            Intrinsics.m39537OX(4, "T");
            TypeToken<?> parameterized = TypeToken.getParameterized(Response.class, Object.class);
            Intrinsics.XiOIii1();
            aNRequestBuild.getAsParsed(parameterized, new NetWorkUtils$getNewApiWeather$$inlined$post$1(c186153));
            return;
        }
        if (oe5.XIIIO(url, GetWeatherRealtime.URL, true)) {
            str = GetWeatherRealtime.URL_V2;
        } else {
            str = oe5.XIIIO(url, GetWeatherForecast.URL, true) ? GetWeatherForecast.URL_V2 : url;
        }
        Map<String, String> mapX111IO = OXO1.X111IO(body);
        try {
            if (mapX111IO.containsKey("lat")) {
                type2 = Object.class;
                try {
                    String str3 = mapX111IO.get("lat");
                    Intrinsics.XXI(str3);
                    type = Response.class;
                    try {
                        mapX111IO.put("lat", new BigDecimal(str3).setScale(1, RoundingMode.DOWN).toString());
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    type = Response.class;
                }
            } else {
                type = Response.class;
                type2 = Object.class;
            }
            if (mapX111IO.containsKey("lon")) {
                String str4 = mapX111IO.get("lon");
                Intrinsics.XXI(str4);
                mapX111IO.put("lon", new BigDecimal(str4).setScale(1, RoundingMode.DOWN).toString());
            }
        } catch (Exception unused3) {
            type = Response.class;
            type2 = Object.class;
        }
        Map mapX111IO2 = OXO1.X111IO(body);
        mapX111IO2.putAll(headers);
        Unit unit = Unit.OXO1;
        netWorkUtils.printParam(strConvertBaseUrl + url, mapX111IO2);
        i1O0OXO1O.OXO1.OXO1(UploadInfoManager.OXO1.XO0O10() + " getNewApiWeather : enableNewWeatherApi = " + i72.OXO1.II1Xi0());
        NetWork netWork2 = NetWork.OXO1;
        String str5 = strConvertBaseUrl + str;
        Intrinsics.XiOIii1();
        C186192 c186192 = new C186192(activity2, callback, c3006uqLoadPopup);
        ANRequest aNRequestBuild2 = AndroidNetworking.get(str5).addQueryParameter(mapX111IO).setTag((Object) str5).addHeaders((Map<String, String>) headers).setPriority(Priority.HIGH).build();
        Intrinsics.m39537OX(4, "T");
        TypeToken<?> parameterized2 = TypeToken.getParameterized(type, type2);
        Intrinsics.XiOIii1();
        aNRequestBuild2.getAsParsed(parameterized2, new NetWorkUtils$getNewApiWeather$$inlined$getV2$1(c186192));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getV2$default(NetWorkUtils netWorkUtils, String url, Map body, O1XIiIO callback, Activity activity, View view, Map headers, int i, Object obj) {
        if ((i & 8) != 0) {
            activity = null;
        }
        if ((i & 16) != 0) {
            view = null;
        }
        if ((i & 32) != 0) {
            headers = netWorkUtils.getHeadersMap();
        }
        Intrinsics.X0O(url, "url");
        Intrinsics.X0O(body, "body");
        Intrinsics.X0O(callback, "callback");
        Intrinsics.X0O(headers, "headers");
        C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(activity, view);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), url);
        Map mapX111IO = OXO1.X111IO(body);
        mapX111IO.putAll(headers);
        Unit unit = Unit.OXO1;
        netWorkUtils.printParam(strConvertBaseUrl + url, mapX111IO);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + url;
        Intrinsics.XiOIii1();
        C289552 c289552 = new C289552(activity, callback, c3006uqLoadPopup);
        ANRequest aNRequestBuild = AndroidNetworking.get(str).addQueryParameter((Map<String, String>) body).setTag((Object) str).addHeaders((Map<String, String>) headers).setPriority(Priority.HIGH).build();
        Intrinsics.m39537OX(4, "T");
        TypeToken<?> parameterized = TypeToken.getParameterized(Response.class, Object.class);
        Intrinsics.XiOIii1();
        aNRequestBuild.getAsParsed(parameterized, new NetWorkUtils$getV2$$inlined$getV2$1(c289552));
    }

    public static /* synthetic */ void post$default(NetWorkUtils netWorkUtils, String url, Map body, O1XIiIO callback, Activity activity, View view, int i, Object obj) {
        if ((i & 8) != 0) {
            activity = null;
        }
        if ((i & 16) != 0) {
            view = null;
        }
        Intrinsics.X0O(url, "url");
        Intrinsics.X0O(body, "body");
        Intrinsics.X0O(callback, "callback");
        C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(activity, view);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), url);
        netWorkUtils.printParam(strConvertBaseUrl + url, body);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + url;
        Intrinsics.XiOIii1();
        C289561 c289561 = new C289561(activity, callback, c3006uqLoadPopup);
        ANRequest aNRequestBuild = AndroidNetworking.post(str).addBodyParameter((Map<String, String>) body).setTag((Object) str).setPriority(Priority.HIGH).build();
        Intrinsics.m39537OX(4, "T");
        TypeToken<?> parameterized = TypeToken.getParameterized(Response.class, Object.class);
        Intrinsics.XiOIii1();
        aNRequestBuild.getAsParsed(parameterized, new NetWorkUtils$post$$inlined$post$1(c289561));
    }

    public static /* synthetic */ void postHyky$default(NetWorkUtils netWorkUtils, String url, Object jsonBody, O1XIiIO o1XIiIO, int i, Object obj) {
        if ((i & 4) != 0) {
            o1XIiIO = null;
        }
        Intrinsics.X0O(url, "url");
        Intrinsics.X0O(jsonBody, "jsonBody");
        String str = HykyAPI.INSTANCE.getBASE_URL_HYKY() + url;
        HykyManager.Companion companion = HykyManager.Companion;
        ANRequest aNRequestBuild = AndroidNetworking.post(str).addHeaders("Authorization", companion.getInstance().getToken().getTokenType() + " " + companion.getInstance().getToken().getAccessToken()).addApplicationJsonBody(jsonBody).setTag((Object) str).setPriority(Priority.HIGH).build();
        Intrinsics.m39537OX(4, "T");
        TypeToken<?> parameterized = TypeToken.getParameterized(HykyResponse.class, Object.class);
        Intrinsics.XiOIii1();
        aNRequestBuild.getAsParsed(parameterized, new C289571(o1XIiIO));
    }

    public static /* synthetic */ void postJson$default(NetWorkUtils netWorkUtils, String url, Object body, O1XIiIO callback, Activity activity, View view, int i, Object obj) {
        if ((i & 8) != 0) {
            activity = null;
        }
        if ((i & 16) != 0) {
            view = null;
        }
        Intrinsics.X0O(url, "url");
        Intrinsics.X0O(body, "body");
        Intrinsics.X0O(callback, "callback");
        C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(activity, view);
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        Api api = Api.INSTANCE;
        i1o0oxo1o.OXO1("JSON Api.BASE_URL -> " + api.getBASE_URL() + " , url = " + url);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(api.getBASE_URL(), url);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + url;
        Intrinsics.XiOIii1();
        C289581 c289581 = new C289581(activity, callback, c3006uqLoadPopup);
        ANRequest aNRequestBuild = AndroidNetworking.post(str).addApplicationJsonBody(body).setTag((Object) str).setPriority(Priority.HIGH).build();
        Intrinsics.m39537OX(4, "T");
        TypeToken<?> parameterized = TypeToken.getParameterized(Response.class, Object.class);
        Intrinsics.XiOIii1();
        aNRequestBuild.getAsParsed(parameterized, new NetWorkUtils$postJson$$inlined$postJson$1(c289581));
    }

    public static /* synthetic */ void postJsonThirdParty$default(NetWorkUtils netWorkUtils, String url, Object body, O1XIiIO callback, Activity activity, View view, Map headers, int i, Object obj) {
        if ((i & 8) != 0) {
            activity = null;
        }
        if ((i & 16) != 0) {
            view = null;
        }
        Intrinsics.X0O(url, "url");
        Intrinsics.X0O(body, "body");
        Intrinsics.X0O(callback, "callback");
        Intrinsics.X0O(headers, "headers");
        C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(activity, view);
        netWorkUtils.printParam(url, OXO1.Ii0i(OXO1.Ii0i(OXO1.m39417I1(), headers), (Map) body));
        NetWork netWork = NetWork.OXO1;
        Intrinsics.XiOIii1();
        C289591 c289591 = new C289591(activity, callback, c3006uqLoadPopup);
        ANRequest aNRequestBuild = AndroidNetworking.post(url).addHeaders((Map<String, String>) headers).addApplicationJsonBody(body).setTag((Object) url).setPriority(Priority.HIGH).build();
        Intrinsics.m39537OX(4, "T");
        TypeToken<?> parameterized = TypeToken.getParameterized(Response.class, Object.class);
        Intrinsics.XiOIii1();
        aNRequestBuild.getAsParsed(parameterized, new NetWorkUtils$postJsonThirdParty$$inlined$postJsonV2$1(c289591));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void postJsonV2$default(NetWorkUtils netWorkUtils, String url, Map body, O1XIiIO callback, Activity activity, View view, Map headers, int i, Object obj) {
        if ((i & 8) != 0) {
            activity = null;
        }
        if ((i & 16) != 0) {
            view = null;
        }
        if ((i & 32) != 0) {
            headers = netWorkUtils.getHeadersMap();
        }
        Intrinsics.X0O(url, "url");
        Intrinsics.X0O(body, "body");
        Intrinsics.X0O(callback, "callback");
        Intrinsics.X0O(headers, "headers");
        C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(activity, view);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), url);
        Map mapX111IO = OXO1.X111IO(body);
        mapX111IO.putAll(headers);
        Unit unit = Unit.OXO1;
        netWorkUtils.printParam(strConvertBaseUrl + url, mapX111IO);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + url;
        Intrinsics.XiOIii1();
        C289602 c289602 = new C289602(activity, callback, c3006uqLoadPopup);
        ANRequest aNRequestBuild = AndroidNetworking.post(str).addHeaders((Map<String, String>) headers).addApplicationJsonBody(body).setTag((Object) str).setPriority(Priority.HIGH).build();
        Intrinsics.m39537OX(4, "T");
        TypeToken<?> parameterized = TypeToken.getParameterized(Response.class, Object.class);
        Intrinsics.XiOIii1();
        aNRequestBuild.getAsParsed(parameterized, new NetWorkUtils$postJsonV2$$inlined$postJsonV2$1(c289602));
    }

    public static /* synthetic */ void postParameterThirdParty$default(NetWorkUtils netWorkUtils, String url, Object body, O1XIiIO callback, Activity activity, View view, Map headers, int i, Object obj) {
        if ((i & 8) != 0) {
            activity = null;
        }
        if ((i & 16) != 0) {
            view = null;
        }
        Intrinsics.X0O(url, "url");
        Intrinsics.X0O(body, "body");
        Intrinsics.X0O(callback, "callback");
        Intrinsics.X0O(headers, "headers");
        C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(activity, view);
        Map<String, String> map = (Map) body;
        netWorkUtils.printParam(url, OXO1.Ii0i(OXO1.Ii0i(OXO1.m39417I1(), headers), map));
        NetWork netWork = NetWork.OXO1;
        Intrinsics.XiOIii1();
        C289621 c289621 = new C289621(activity, callback, c3006uqLoadPopup);
        ANRequest aNRequestBuild = AndroidNetworking.post(url).addHeaders((Map<String, String>) headers).addBodyParameter(map).setTag((Object) url).setPriority(Priority.HIGH).build();
        Intrinsics.m39537OX(4, "T");
        TypeToken<?> parameterized = TypeToken.getParameterized(Response.class, Object.class);
        Intrinsics.XiOIii1();
        aNRequestBuild.getAsParsed(parameterized, new NetWorkUtils$postParameterThirdParty$$inlined$postV2$1(c289621));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void postRequest$default(NetWorkUtils netWorkUtils, String str, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        netWorkUtils.postRequest(str, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EventSource postStreamRequest$default(NetWorkUtils netWorkUtils, String str, Map map, Object obj, O1XIiIO o1XIiIO, int i, Object obj2) {
        if ((i & 2) != 0) {
            map = netWorkUtils.getHeadersMap();
        }
        return netWorkUtils.postStreamRequest(str, map, obj, o1XIiIO);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void postV2$default(NetWorkUtils netWorkUtils, String url, Map body, O1XIiIO callback, Activity activity, View view, Map headers, int i, Object obj) {
        if ((i & 8) != 0) {
            activity = null;
        }
        if ((i & 16) != 0) {
            view = null;
        }
        if ((i & 32) != 0) {
            headers = netWorkUtils.getHeadersMap();
        }
        Intrinsics.X0O(url, "url");
        Intrinsics.X0O(body, "body");
        Intrinsics.X0O(callback, "callback");
        Intrinsics.X0O(headers, "headers");
        C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(activity, view);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), url);
        Map mapX111IO = OXO1.X111IO(body);
        mapX111IO.putAll(headers);
        Unit unit = Unit.OXO1;
        netWorkUtils.printParam(strConvertBaseUrl + url, mapX111IO);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + url;
        Intrinsics.XiOIii1();
        C289652 c289652 = new C289652(activity, callback, c3006uqLoadPopup);
        ANRequest aNRequestBuild = AndroidNetworking.post(str).addHeaders((Map<String, String>) headers).addBodyParameter((Map<String, String>) body).setTag((Object) str).setPriority(Priority.HIGH).build();
        Intrinsics.m39537OX(4, "T");
        TypeToken<?> parameterized = TypeToken.getParameterized(Response.class, Object.class);
        Intrinsics.XiOIii1();
        aNRequestBuild.getAsParsed(parameterized, new NetWorkUtils$postV2$$inlined$postV2$1(c289652));
    }

    public static /* synthetic */ void postV3$default(NetWorkUtils netWorkUtils, String url, Map body, O1XIiIO callback, AppCompatActivity activity, View view, Map map, int i, Object obj) {
        View view2 = (i & 16) != 0 ? null : view;
        Map headers = (i & 32) != 0 ? netWorkUtils.getHeadersMap() : map;
        Intrinsics.X0O(url, "url");
        Intrinsics.X0O(body, "body");
        Intrinsics.X0O(callback, "callback");
        Intrinsics.X0O(activity, "activity");
        Intrinsics.X0O(headers, "headers");
        WeakReference weakReference = new WeakReference(activity);
        C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(activity, view2);
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(activity);
        Intrinsics.XiOIii1();
        XX01Oi.IiI10X(lifecycleScope, null, null, new C289661(c3006uqLoadPopup, url, body, headers, weakReference, callback, null), 3, null);
    }

    public static /* synthetic */ void upload$default(NetWorkUtils netWorkUtils, String url, String fileParameter, File file, Object body, O1XIiIO callback, Activity activity, View view, int i, Object obj) {
        if ((i & 32) != 0) {
            activity = null;
        }
        if ((i & 64) != 0) {
            view = null;
        }
        Intrinsics.X0O(url, "url");
        Intrinsics.X0O(fileParameter, "fileParameter");
        Intrinsics.X0O(file, "file");
        Intrinsics.X0O(body, "body");
        Intrinsics.X0O(callback, "callback");
        C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(activity, view);
        NetWork netWork = NetWork.OXO1;
        String str = Api.INSTANCE.getBASE_URL() + url;
        Intrinsics.XiOIii1();
        C289671 c289671 = new C289671(activity, callback, c3006uqLoadPopup);
        ANRequest.MultiPartBuilder multiPartBuilderUpload = AndroidNetworking.upload(str);
        if (file.exists()) {
            multiPartBuilderUpload.addMultipartFile(fileParameter, file);
        }
        ANRequest uploadProgressListener = multiPartBuilderUpload.addMultipartParameter(body).setTag((Object) str).setPriority(Priority.HIGH).build().setUploadProgressListener(NetWorkUtils$upload$$inlined$upload$1.INSTANCE);
        Intrinsics.m39537OX(4, "T");
        TypeToken<?> parameterized = TypeToken.getParameterized(Response.class, Object.class);
        Intrinsics.XiOIii1();
        uploadProgressListener.getAsParsed(parameterized, new NetWorkUtils$upload$$inlined$upload$2(c289671));
    }

    public final void clearAllBitmap() {
        NetWork.OXO1.m38062iO();
    }

    @aa1
    public final String convertBaseUrl(@aa1 String baseUrl, @aa1 String url) {
        Intrinsics.X0O(baseUrl, "baseUrl");
        Intrinsics.X0O(url, "url");
        String str = e44.OXO1;
        if (!StringsKt__StringsKt.iOiXX(baseUrl, e44.OXO1, true) && !StringsKt__StringsKt.iOiXX(baseUrl, e44.XIi00iiXO, true) && !StringsKt__StringsKt.iOiXX(baseUrl, e44.f6332iO, true) && !StringsKt__StringsKt.iOiXX(baseUrl, e44.XO0O10, true) && !StringsKt__StringsKt.iOiXX(baseUrl, e44.O00, true)) {
            return baseUrl;
        }
        String str2 = (oe5.XIIIO(url, BleFirmwareList.URL, true) || oe5.XIIIO(url, BleFirmwareVersionList.URL, true) || oe5.XIIIO(url, FirmwareVersionLatest.URL, true) || oe5.XIIIO(url, BleExtraPackVersionList.URL, true) || oe5.XIIIO(url, ExtraPackVersionLatest.URL, true) || oe5.XIIIO(url, BleExtraPackVersionLanguage.URL, true) || oe5.XIIIO(url, BleExtraPackVersionUi.URL, true) || oe5.XIIIO(url, BleExtraPackVersionFont.URL, true) || oe5.XIIIO(url, GetPayMacAddress.URL, true) || oe5.XIIIO(url, ChangeDeviceState.URL, true) || oe5.XIIIO(url, GetDeviceState.URL, true) || oe5.XIIIO(url, GetDeviceList.URL, true) || oe5.XIIIO(url, GetDeviceListObject.URL, true) || oe5.XIIIO(url, AigcCreateJob.URL, true) || oe5.XIIIO(url, AigcFindJob.URL, true) || oe5.XIIIO(url, GetDcsToken.INSTANCE.getURL(), true) || oe5.XIIIO(url, UploadDownloadInfo.URL, true) || oe5.XIIIO(url, GetGomoreAuthKey.URL, true) || oe5.XIIIO(url, AppVersionLatest.URL, true) || oe5.XIIIO(url, BleExtraPackVersionGPSFirmware.URL, true) || oe5.XIIIO(url, GetTeraBoxToken.URL, true) || oe5.XIIIO(url, GetInternalTeraBoxToken.URL, true) || oe5.XIIIO(url, GetTeraBoxTokenInfo.URL, true) || oe5.XIIIO(url, GetTeraBoxRefreshToken.URL, true) || oe5.XIIIO(url, GetInternalTeraBoxRefreshToken.URL, true) || oe5.XIIIO(url, AppStoreFileListSearch.URL, true)) ? e44.OXO1 : baseUrl;
        if (StringsKt__StringsKt.iOiXX(baseUrl, e44.f6332iO, true) || (!oe5.XIIIO(url, GetWeatherRealtime.URL, true) && !oe5.XIIIO(url, GetWeatherForecast.URL, true) && !oe5.XIIIO(url, GetNewDeviceListObject.URL, true))) {
            str = str2;
        }
        return (i72.OXO1.II1Xi0() && (oe5.XIIIO(url, GetWeatherRealtime.URL, true) || oe5.XIIIO(url, GetWeatherForecast.URL, true))) ? e44.IiI10X : str;
    }

    public final void download(@aa1 String url, @aa1 String path, @aa1 String fileName, @aa1 HttpProgressCallback<String> callback) {
        Intrinsics.X0O(url, "url");
        Intrinsics.X0O(path, "path");
        Intrinsics.X0O(fileName, "fileName");
        Intrinsics.X0O(callback, "callback");
        NetWork.OXO1.XO0O10(url, path, fileName, callback);
    }

    public final void downloadV2(@aa1 String url, @aa1 Map<String, String> headers, @aa1 String path, @aa1 String fileName, @aa1 HttpProgressCallback<String> callback) {
        Intrinsics.X0O(url, "url");
        Intrinsics.X0O(headers, "headers");
        Intrinsics.X0O(path, "path");
        Intrinsics.X0O(fileName, "fileName");
        Intrinsics.X0O(callback, "callback");
        NetWork.OXO1.IiI10X(url, headers, path, fileName, callback);
    }

    public final <T> void errorData(@tb1 String str, @aa1 O1XIiIO<T> callback, @tb1 C3006uq c3006uq) {
        Intrinsics.X0O(callback, "callback");
        callback.handleError(String.valueOf(str));
        if (c3006uq != null) {
            c3006uq.dismiss();
        }
    }

    public final void findAltitudeByLocation(final float f, final float f2, @aa1 final O1XIiIO<Integer> callback) {
        Intrinsics.X0O(callback, "callback");
        AndroidNetworking.get("https://api.open-elevation.com/api/v1/lookup").addQueryParameter((Map<String, String>) OXO1.XXX11i(TuplesKt.OXO1("locations", f2 + I000IiI1O.C2156iO.XO0O10 + f))).setTag((Object) "findAltitudeByLocation").setPriority(Priority.HIGH).build().getAsJSONObject(new JSONObjectRequestListener() { // from class: com.sma.smartv3.network.NetWorkUtils.findAltitudeByLocation.1
            @Override // com.androidnetworking.interfaces.JSONObjectRequestListener
            public void onError(ANError aNError) {
                callback.handleError(String.valueOf(aNError));
            }

            /* JADX WARN: Code duplicated, block: B:9:0x001e  */
            @Override // com.androidnetworking.interfaces.JSONObjectRequestListener
            public void onResponse(JSONObject jSONObject) {
                JSONObject jSONObject2;
                int i;
                if (jSONObject != null) {
                    try {
                        JSONArray jSONArray = jSONObject.getJSONArray("results");
                        if (jSONArray == null || (jSONObject2 = jSONArray.getJSONObject(0)) == null) {
                            i = -10000;
                        } else {
                            i = jSONObject2.getInt("elevation");
                        }
                    } catch (Exception unused) {
                        callback.handleError("error");
                        i1O0OXO1O.OXO1.OXO1("findAltitudeByLocation error locations = [" + f2 + I000IiI1O.C2156iO.XO0O10 + f + C12616d4.j.f34442e);
                        return;
                    }
                } else {
                    i = -10000;
                }
                if (i == -10000) {
                    callback.handleError("error");
                    return;
                }
                callback.handleResponse(Integer.valueOf(i));
                i1O0OXO1O.OXO1.OXO1("findAltitudeByLocation success locations = [" + f2 + I000IiI1O.C2156iO.XO0O10 + f + "] elevation = " + i);
            }
        });
    }

    public final void get(@aa1 String url, @aa1 O1XIiIO<JSONObject> callback, int i) {
        Intrinsics.X0O(url, "url");
        Intrinsics.X0O(callback, "callback");
        NetWork.OXO1.I0IIOi(url, callback, i);
    }

    @aa1
    public final String getBaseUrl(@aa1 String url) {
        Intrinsics.X0O(url, "url");
        return convertBaseUrl(Api.INSTANCE.getBASE_URL(), url) + url;
    }

    @aa1
    public final Map<String, String> getHeadersMap() {
        Gson gson = new Gson();
        BleCache bleCache = BleCache.INSTANCE;
        String mBleName = bleCache.getMBleName();
        String mFirmwareFlag = bleCache.getMFirmwareFlag();
        String string$default = BaseBleCache.getString$default(bleCache, BleKey.FIRMWARE_VERSION, null, null, 6, null);
        String appVersionName = AppUtils.getAppVersionName();
        Intrinsics.O10IXXX0X(appVersionName, "getAppVersionName(...)");
        a01 a01Var = a01.OXO1;
        SPUtils sPUtilsIiI10X = a01Var.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        if (objFromJson != null) {
            appUser = objFromJson;
        }
        String json = gson.toJson(new BleInfo(((AppUser) appUser).getIdentity(), mBleName, mFirmwareFlag, RequestBodyKt.PROJECT_ID, string$default, appVersionName, oe5.IXO0OOi(bleCache.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null), 0));
        HashMap map = new HashMap();
        map.put("accept-language", Utils.getApp().getResources().getConfiguration().locale.getLanguage());
        SPUtils sPUtilsIiI10X2 = a01Var.IiI10X();
        Object appUser2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson2 = new Gson().fromJson(sPUtilsIiI10X2.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        if (objFromJson2 != null) {
            appUser2 = objFromJson2;
        }
        map.put("APP-UID", ((AppUser) appUser2).getIdentity());
        map.put("BleInfo", json);
        return map;
    }

    public final <T> void getImage(@aa1 String url, @aa1 File file, @aa1 O1XIiIO<T> callback) {
        Intrinsics.X0O(url, "url");
        Intrinsics.X0O(file, "file");
        Intrinsics.X0O(callback, "callback");
        NetWork.OXO1.OIX0iXi(url, file, callback);
    }

    public final /* synthetic */ <T> void getNewApiWeather(String url, Map<String, String> body, O1XIiIO<T> callback, Activity activity, View view, Map<String, String> headers) {
        String str;
        Type type;
        Type type2;
        Intrinsics.X0O(url, "url");
        Intrinsics.X0O(body, "body");
        Intrinsics.X0O(callback, "callback");
        Intrinsics.X0O(headers, "headers");
        C3006uq c3006uqLoadPopup = loadPopup(activity, view);
        String strConvertBaseUrl = convertBaseUrl(Api.INSTANCE.getBASE_URL(), url);
        i72 i72Var = i72.OXO1;
        if (!i72Var.II1Xi0()) {
            printParam(strConvertBaseUrl + url, OXO1.Ii0i(body, headers));
            i1O0OXO1O.OXO1.OXO1(UploadInfoManager.OXO1.XO0O10() + " getNewApiWeather : enableNewWeatherApi = " + i72Var.II1Xi0());
            NetWork netWork = NetWork.OXO1;
            String str2 = strConvertBaseUrl + url;
            Intrinsics.XiOIii1();
            C186153 c186153 = new C186153(activity, callback, c3006uqLoadPopup);
            ANRequest aNRequestBuild = AndroidNetworking.post(str2).addBodyParameter(body).setTag((Object) str2).setPriority(Priority.HIGH).build();
            Intrinsics.m39537OX(4, "T");
            TypeToken<?> parameterized = TypeToken.getParameterized(Response.class, Object.class);
            Intrinsics.XiOIii1();
            aNRequestBuild.getAsParsed(parameterized, new NetWorkUtils$getNewApiWeather$$inlined$post$1(c186153));
            return;
        }
        if (oe5.XIIIO(url, GetWeatherRealtime.URL, true)) {
            str = GetWeatherRealtime.URL_V2;
        } else {
            str = oe5.XIIIO(url, GetWeatherForecast.URL, true) ? GetWeatherForecast.URL_V2 : url;
        }
        Map<String, String> mapX111IO = OXO1.X111IO(body);
        try {
            if (mapX111IO.containsKey("lat")) {
                type2 = Object.class;
                try {
                    String str3 = mapX111IO.get("lat");
                    Intrinsics.XXI(str3);
                    BigDecimal bigDecimal = new BigDecimal(str3);
                    type = Response.class;
                    try {
                        mapX111IO.put("lat", bigDecimal.setScale(1, RoundingMode.DOWN).toString());
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    type = Response.class;
                }
            } else {
                type = Response.class;
                type2 = Object.class;
            }
            if (mapX111IO.containsKey("lon")) {
                String str4 = mapX111IO.get("lon");
                Intrinsics.XXI(str4);
                mapX111IO.put("lon", new BigDecimal(str4).setScale(1, RoundingMode.DOWN).toString());
            }
        } catch (Exception unused3) {
            type = Response.class;
            type2 = Object.class;
        }
        Map<String, ? extends Object> mapX111IO2 = OXO1.X111IO(body);
        mapX111IO2.putAll(headers);
        Unit unit = Unit.OXO1;
        printParam(strConvertBaseUrl + url, mapX111IO2);
        i1O0OXO1O.OXO1.OXO1(UploadInfoManager.OXO1.XO0O10() + " getNewApiWeather : enableNewWeatherApi = " + i72.OXO1.II1Xi0());
        NetWork netWork2 = NetWork.OXO1;
        String str5 = strConvertBaseUrl + str;
        Intrinsics.XiOIii1();
        C186192 c186192 = new C186192(activity, callback, c3006uqLoadPopup);
        ANRequest aNRequestBuild2 = AndroidNetworking.get(str5).addQueryParameter(mapX111IO).setTag((Object) str5).addHeaders(headers).setPriority(Priority.HIGH).build();
        Intrinsics.m39537OX(4, "T");
        TypeToken<?> parameterized2 = TypeToken.getParameterized(type, type2);
        Intrinsics.XiOIii1();
        aNRequestBuild2.getAsParsed(parameterized2, new NetWorkUtils$getNewApiWeather$$inlined$getV2$1(c186192));
    }

    public final /* synthetic */ <T> void getV2(String url, Map<String, String> body, O1XIiIO<T> callback, Activity activity, View view, Map<String, String> headers) {
        Intrinsics.X0O(url, "url");
        Intrinsics.X0O(body, "body");
        Intrinsics.X0O(callback, "callback");
        Intrinsics.X0O(headers, "headers");
        C3006uq c3006uqLoadPopup = loadPopup(activity, view);
        String strConvertBaseUrl = convertBaseUrl(Api.INSTANCE.getBASE_URL(), url);
        Map<String, ? extends Object> mapX111IO = OXO1.X111IO(body);
        mapX111IO.putAll(headers);
        Unit unit = Unit.OXO1;
        printParam(strConvertBaseUrl + url, mapX111IO);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + url;
        Intrinsics.XiOIii1();
        C289552 c289552 = new C289552(activity, callback, c3006uqLoadPopup);
        ANRequest aNRequestBuild = AndroidNetworking.get(str).addQueryParameter(body).setTag((Object) str).addHeaders(headers).setPriority(Priority.HIGH).build();
        Intrinsics.m39537OX(4, "T");
        TypeToken<?> parameterized = TypeToken.getParameterized(Response.class, Object.class);
        Intrinsics.XiOIii1();
        aNRequestBuild.getAsParsed(parameterized, new NetWorkUtils$getV2$$inlined$getV2$1(c289552));
    }

    @tb1
    public final C3006uq loadPopup(@tb1 Activity activity, @tb1 View view) {
        if (view == null || activity == null) {
            return null;
        }
        C3006uq c3006uq = new C3006uq(activity);
        c3006uq.I1XOi1(view);
        return c3006uq;
    }

    public final /* synthetic */ <T> void post(String url, Map<String, String> body, O1XIiIO<T> callback, Activity activity, View view) {
        Intrinsics.X0O(url, "url");
        Intrinsics.X0O(body, "body");
        Intrinsics.X0O(callback, "callback");
        C3006uq c3006uqLoadPopup = loadPopup(activity, view);
        String strConvertBaseUrl = convertBaseUrl(Api.INSTANCE.getBASE_URL(), url);
        printParam(strConvertBaseUrl + url, body);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + url;
        Intrinsics.XiOIii1();
        C289561 c289561 = new C289561(activity, callback, c3006uqLoadPopup);
        ANRequest aNRequestBuild = AndroidNetworking.post(str).addBodyParameter(body).setTag((Object) str).setPriority(Priority.HIGH).build();
        Intrinsics.m39537OX(4, "T");
        TypeToken<?> parameterized = TypeToken.getParameterized(Response.class, Object.class);
        Intrinsics.XiOIii1();
        aNRequestBuild.getAsParsed(parameterized, new NetWorkUtils$post$$inlined$post$1(c289561));
    }

    public final /* synthetic */ <T> void postHyky(String url, Object jsonBody, O1XIiIO<T> o1XIiIO) {
        Intrinsics.X0O(url, "url");
        Intrinsics.X0O(jsonBody, "jsonBody");
        String str = HykyAPI.INSTANCE.getBASE_URL_HYKY() + url;
        HykyManager.Companion companion = HykyManager.Companion;
        ANRequest aNRequestBuild = AndroidNetworking.post(str).addHeaders("Authorization", companion.getInstance().getToken().getTokenType() + " " + companion.getInstance().getToken().getAccessToken()).addApplicationJsonBody(jsonBody).setTag((Object) str).setPriority(Priority.HIGH).build();
        Intrinsics.m39537OX(4, "T");
        TypeToken<?> parameterized = TypeToken.getParameterized(HykyResponse.class, Object.class);
        Intrinsics.XiOIii1();
        aNRequestBuild.getAsParsed(parameterized, new C289571(o1XIiIO));
    }

    public final /* synthetic */ <T> void postJson(String url, Object body, O1XIiIO<T> callback, Activity activity, View view) {
        Intrinsics.X0O(url, "url");
        Intrinsics.X0O(body, "body");
        Intrinsics.X0O(callback, "callback");
        C3006uq c3006uqLoadPopup = loadPopup(activity, view);
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        Api api = Api.INSTANCE;
        i1o0oxo1o.OXO1("JSON Api.BASE_URL -> " + api.getBASE_URL() + " , url = " + url);
        String strConvertBaseUrl = convertBaseUrl(api.getBASE_URL(), url);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + url;
        Intrinsics.XiOIii1();
        C289581 c289581 = new C289581(activity, callback, c3006uqLoadPopup);
        ANRequest aNRequestBuild = AndroidNetworking.post(str).addApplicationJsonBody(body).setTag((Object) str).setPriority(Priority.HIGH).build();
        Intrinsics.m39537OX(4, "T");
        TypeToken<?> parameterized = TypeToken.getParameterized(Response.class, Object.class);
        Intrinsics.XiOIii1();
        aNRequestBuild.getAsParsed(parameterized, new NetWorkUtils$postJson$$inlined$postJson$1(c289581));
    }

    public final <T> void postJsonExecute(@aa1 String url, @aa1 Object body, @aa1 O1XIiIO<T> callback) {
        Response<T> response;
        Intrinsics.X0O(url, "url");
        Intrinsics.X0O(body, "body");
        Intrinsics.X0O(callback, "callback");
        NetWork netWork = NetWork.OXO1;
        String str = Api.INSTANCE.getBASE_URL() + url;
        try {
            Object result = AndroidNetworking.post(str).addApplicationJsonBody(body).setTag((Object) str).setPriority(Priority.HIGH).build().executeForObject(Response.class).getResult();
            if (result == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.sma.androidnetworklib.model.Response<T>");
            }
            response = (Response) result;
            if (response == null) {
                response = new Response<>();
                response.setCode(-1000);
            }
            responseWhenCheck(null, response, callback);
        } catch (Exception e) {
            e.printStackTrace();
            LogUtils.m11128d(Unit.OXO1);
            response = null;
        }
    }

    public final /* synthetic */ <T> void postJsonThirdParty(String url, Object body, O1XIiIO<T> callback, Activity activity, View view, Map<String, String> headers) {
        Intrinsics.X0O(url, "url");
        Intrinsics.X0O(body, "body");
        Intrinsics.X0O(callback, "callback");
        Intrinsics.X0O(headers, "headers");
        C3006uq c3006uqLoadPopup = loadPopup(activity, view);
        printParam(url, OXO1.Ii0i(OXO1.Ii0i(OXO1.m39417I1(), headers), (Map) body));
        NetWork netWork = NetWork.OXO1;
        Intrinsics.XiOIii1();
        C289591 c289591 = new C289591(activity, callback, c3006uqLoadPopup);
        ANRequest aNRequestBuild = AndroidNetworking.post(url).addHeaders(headers).addApplicationJsonBody(body).setTag((Object) url).setPriority(Priority.HIGH).build();
        Intrinsics.m39537OX(4, "T");
        TypeToken<?> parameterized = TypeToken.getParameterized(Response.class, Object.class);
        Intrinsics.XiOIii1();
        aNRequestBuild.getAsParsed(parameterized, new NetWorkUtils$postJsonThirdParty$$inlined$postJsonV2$1(c289591));
    }

    public final /* synthetic */ <T> void postJsonV2(String url, Map<String, ? extends Object> body, O1XIiIO<T> callback, Activity activity, View view, Map<String, String> headers) {
        Intrinsics.X0O(url, "url");
        Intrinsics.X0O(body, "body");
        Intrinsics.X0O(callback, "callback");
        Intrinsics.X0O(headers, "headers");
        C3006uq c3006uqLoadPopup = loadPopup(activity, view);
        String strConvertBaseUrl = convertBaseUrl(Api.INSTANCE.getBASE_URL(), url);
        Map<String, ? extends Object> mapX111IO = OXO1.X111IO(body);
        mapX111IO.putAll(headers);
        Unit unit = Unit.OXO1;
        printParam(strConvertBaseUrl + url, mapX111IO);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + url;
        Intrinsics.XiOIii1();
        C289602 c289602 = new C289602(activity, callback, c3006uqLoadPopup);
        ANRequest aNRequestBuild = AndroidNetworking.post(str).addHeaders(headers).addApplicationJsonBody(body).setTag((Object) str).setPriority(Priority.HIGH).build();
        Intrinsics.m39537OX(4, "T");
        TypeToken<?> parameterized = TypeToken.getParameterized(Response.class, Object.class);
        Intrinsics.XiOIii1();
        aNRequestBuild.getAsParsed(parameterized, new NetWorkUtils$postJsonV2$$inlined$postJsonV2$1(c289602));
    }

    public final /* synthetic */ <T> void postParameterThirdParty(String url, Object body, O1XIiIO<T> callback, Activity activity, View view, Map<String, String> headers) {
        Intrinsics.X0O(url, "url");
        Intrinsics.X0O(body, "body");
        Intrinsics.X0O(callback, "callback");
        Intrinsics.X0O(headers, "headers");
        C3006uq c3006uqLoadPopup = loadPopup(activity, view);
        Map<String, String> map = (Map) body;
        printParam(url, OXO1.Ii0i(OXO1.Ii0i(OXO1.m39417I1(), headers), map));
        NetWork netWork = NetWork.OXO1;
        Intrinsics.XiOIii1();
        C289621 c289621 = new C289621(activity, callback, c3006uqLoadPopup);
        ANRequest aNRequestBuild = AndroidNetworking.post(url).addHeaders(headers).addBodyParameter(map).setTag((Object) url).setPriority(Priority.HIGH).build();
        Intrinsics.m39537OX(4, "T");
        TypeToken<?> parameterized = TypeToken.getParameterized(Response.class, Object.class);
        Intrinsics.XiOIii1();
        aNRequestBuild.getAsParsed(parameterized, new NetWorkUtils$postParameterThirdParty$$inlined$postV2$1(c289621));
    }

    public final void postRequest(@aa1 String jsonString, @tb1 final Function1<? super Boolean, Unit> function1) {
        Intrinsics.X0O(jsonString, "jsonString");
        LogUtils.m11130i("postStreamRequest jsonString -> " + jsonString);
        String strConvertBaseUrl = convertBaseUrl(Api.INSTANCE.getBASE_URL(), "/baiduApi/uploadServiceCallLog");
        new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder builderNewBuilder = new OkHttpClient().newBuilder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        builderNewBuilder.connectTimeout(60L, timeUnit).readTimeout(60L, timeUnit).writeTimeout(60L, timeUnit).build().newCall(new Request.Builder().url(strConvertBaseUrl + "/baiduApi/uploadServiceCallLog").post(RequestBody.Companion.create(MediaType.Companion.parse(C11921G5.f28906L), jsonString)).build()).enqueue(new Callback() { // from class: com.sma.smartv3.network.NetWorkUtils.postRequest.1
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException e) {
                Intrinsics.X0O(call, "call");
                Intrinsics.X0O(e, "e");
                LogUtils.m11129e("postStreamRequest error -> " + e.getMessage());
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, okhttp3.Response response) {
                Intrinsics.X0O(call, "call");
                Intrinsics.X0O(response, "response");
                if (response.code() == 200) {
                    ResponseBody responseBodyBody = response.body();
                    String strString = responseBodyBody != null ? responseBodyBody.string() : null;
                    Function1<Boolean, Unit> function2 = function1;
                    if (function2 != null) {
                        function2.invoke2(Boolean.TRUE);
                    }
                    LogUtils.m11130i("postStreamRequest responseData -> " + strString);
                }
            }
        });
    }

    @aa1
    public final EventSource postStreamRequest(@aa1 String url, @aa1 Map<String, String> headers, @aa1 Object body, @aa1 final O1XIiIO<String> callback) {
        Intrinsics.X0O(url, "url");
        Intrinsics.X0O(headers, "headers");
        Intrinsics.X0O(body, "body");
        Intrinsics.X0O(callback, "callback");
        if (!oe5.m2764O0(url, "http", false, 2, null)) {
            String strConvertBaseUrl = convertBaseUrl(Api.INSTANCE.getBASE_URL(), url);
            printParam(strConvertBaseUrl + url, OXO1.Ii0i(OXO1.m39417I1(), headers));
            url = strConvertBaseUrl + url;
        }
        OkHttpClient.Builder builderNewBuilder = new OkHttpClient().newBuilder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        EventSource.Factory factoryCreateFactory = EventSources.createFactory(builderNewBuilder.connectTimeout(60L, timeUnit).readTimeout(60L, timeUnit).writeTimeout(60L, timeUnit).build());
        Request.Builder builderPost = new Request.Builder().url(url).post(RequestBody.Companion.create(MediaType.Companion.parse(C11921G5.f28906L), body.toString()));
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            builderPost.addHeader(entry.getKey(), entry.getValue());
        }
        builderPost.addHeader("Accept", "*/*");
        return factoryCreateFactory.newEventSource(builderPost.build(), new EventSourceListener() { // from class: com.sma.smartv3.network.NetWorkUtils.postStreamRequest.1
            @Override // okhttp3.sse.EventSourceListener
            public void onClosed(EventSource eventSource) {
                Intrinsics.X0O(eventSource, "eventSource");
                super.onClosed(eventSource);
                i1O0OXO1O.OXO1.OXO1("SSE onClosed");
            }

            @Override // okhttp3.sse.EventSourceListener
            public void onEvent(EventSource eventSource, String str, String str2, String data) {
                Intrinsics.X0O(eventSource, "eventSource");
                Intrinsics.X0O(data, "data");
                super.onEvent(eventSource, str, str2, data);
                callback.handleResponse(data);
            }

            @Override // okhttp3.sse.EventSourceListener
            public void onFailure(EventSource eventSource, Throwable th, okhttp3.Response response) {
                String strString;
                ResponseBody responseBodyBody;
                Intrinsics.X0O(eventSource, "eventSource");
                super.onFailure(eventSource, th, response);
                int iCode = response != null ? response.code() : 0;
                if (response == null || (responseBodyBody = response.body()) == null || (strString = responseBodyBody.string()) == null) {
                    strString = "";
                }
                i1O0OXO1O.OXO1.OXO1("SSE onFailure -> t= " + th + ",  code=" + iCode + ",  msg=" + strString);
                if (iCode == 200) {
                    if (strString.length() > 0) {
                        callback.handleResponse(strString);
                        return;
                    } else {
                        callback.handleError(String.valueOf(iCode));
                        return;
                    }
                }
                if (th != null) {
                    callback.handleError(th.toString());
                } else {
                    callback.handleError(String.valueOf(iCode));
                }
            }

            @Override // okhttp3.sse.EventSourceListener
            public void onOpen(EventSource eventSource, okhttp3.Response response) {
                Intrinsics.X0O(eventSource, "eventSource");
                Intrinsics.X0O(response, "response");
                super.onOpen(eventSource, response);
                i1O0OXO1O.OXO1.OXO1("SSE onOpen");
            }
        });
    }

    public final /* synthetic */ <T> void postV2(String url, Map<String, ? extends Object> body, O1XIiIO<T> callback, Activity activity, View view, Map<String, String> headers) {
        Intrinsics.X0O(url, "url");
        Intrinsics.X0O(body, "body");
        Intrinsics.X0O(callback, "callback");
        Intrinsics.X0O(headers, "headers");
        C3006uq c3006uqLoadPopup = loadPopup(activity, view);
        String strConvertBaseUrl = convertBaseUrl(Api.INSTANCE.getBASE_URL(), url);
        Map<String, ? extends Object> mapX111IO = OXO1.X111IO(body);
        mapX111IO.putAll(headers);
        Unit unit = Unit.OXO1;
        printParam(strConvertBaseUrl + url, mapX111IO);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + url;
        Intrinsics.XiOIii1();
        C289652 c289652 = new C289652(activity, callback, c3006uqLoadPopup);
        ANRequest aNRequestBuild = AndroidNetworking.post(str).addHeaders(headers).addBodyParameter((Map<String, String>) body).setTag((Object) str).setPriority(Priority.HIGH).build();
        Intrinsics.m39537OX(4, "T");
        TypeToken<?> parameterized = TypeToken.getParameterized(Response.class, Object.class);
        Intrinsics.XiOIii1();
        aNRequestBuild.getAsParsed(parameterized, new NetWorkUtils$postV2$$inlined$postV2$1(c289652));
    }

    public final /* synthetic */ <T> void postV3(String url, Map<String, ? extends Object> body, O1XIiIO<T> callback, AppCompatActivity activity, View view, Map<String, String> headers) {
        Intrinsics.X0O(url, "url");
        Intrinsics.X0O(body, "body");
        Intrinsics.X0O(callback, "callback");
        Intrinsics.X0O(activity, "activity");
        Intrinsics.X0O(headers, "headers");
        WeakReference weakReference = new WeakReference(activity);
        C3006uq c3006uqLoadPopup = loadPopup(activity, view);
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(activity);
        Intrinsics.XiOIii1();
        XX01Oi.IiI10X(lifecycleScope, null, null, new C289661(c3006uqLoadPopup, url, body, headers, weakReference, callback, null), 3, null);
    }

    public final void printParam(@aa1 String url, @aa1 Map<String, ? extends Object> body) {
        Intrinsics.X0O(url, "url");
        Intrinsics.X0O(body, "body");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(UtilsKt.X0i1O() + ": ");
        int size = body.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                stringBuffer.append(Typography.XO0O10);
            }
            stringBuffer.append((String) CollectionsKt___CollectionsKt.i0I0O111I(body.keySet()).get(i));
            stringBuffer.append('=');
            stringBuffer.append(CollectionsKt___CollectionsKt.i0I0O111I(body.values()).get(i));
        }
        i1O0OXO1O.OXO1.OXO1("p -> " + ((Object) stringBuffer));
    }

    public final /* synthetic */ <T> void responseData(Response<T> response, Activity activity, O1XIiIO<T> callback, C3006uq c3006uq) {
        Intrinsics.X0O(callback, "callback");
        LogUtils.m11128d(yn0.I0IIOi + response);
        if (response == null) {
            response = new Response<>();
            response.setCode(-1000);
        }
        responseWhenCheck(activity, response, callback);
        if (c3006uq != null) {
            c3006uq.dismiss();
        }
    }

    public final <T> void responseWhenCheck(@tb1 Activity activity, @aa1 Response<T> response, @aa1 O1XIiIO<T> callback) {
        Intrinsics.X0O(response, "response");
        Intrinsics.X0O(callback, "callback");
        if (activity == null) {
            int code = response.getCode();
            if (code == 0) {
                callback.handleResponse(response.getData());
                return;
            } else if (code == 1 || code == 2) {
                callback.handleError(response.getData() != null ? String.valueOf(response.getData()) : response.getMesg());
                return;
            } else {
                callback.handleError(response.toString());
                return;
            }
        }
        int code2 = response.getCode();
        if (code2 == 0) {
            callback.handleResponse(response.getData());
            return;
        }
        if (code2 == 1 || code2 == 2) {
            callback.handleError(response.getData() != null ? String.valueOf(response.getData()) : response.getMesg());
            return;
        }
        if (code2 == 1001) {
            ToastUtils.showLong(R.string.parameter_check_failed);
            return;
        }
        if (code2 != 2010) {
            if (code2 == 2012) {
                ToastUtils.showLong(R.string.wrong_password);
                return;
            }
            if (code2 == 4002) {
                ToastUtils.showLong(R.string.project_does_not_exist);
                return;
            }
            if (code2 == 4007) {
                ToastUtils.showLong(response.getMesg(), new Object[0]);
                return;
            }
            switch (code2) {
                case 2001:
                    ToastUtils.showLong(R.string.code_limit);
                    break;
                case 2002:
                    ToastUtils.showLong(R.string.verification_code_error);
                    callback.handleError(response.toString());
                    break;
                case 2003:
                    ToastUtils.showLong(R.string.user_already_exists);
                    callback.handleError(response.toString());
                    break;
                case 2004:
                    ToastUtils.showLong(R.string.user_does_not_exist);
                    break;
                case 2005:
                    break;
                default:
                    ToastUtils.showLong(response.getCode() + ", " + ((Object) activity.getText(R.string.request_error)), new Object[0]);
                    callback.handleError(response.toString());
                    break;
            }
            return;
        }
        ToastUtils.showLong(R.string.account_or_password_error);
    }

    public final /* synthetic */ <T> void upload(String url, String fileParameter, File file, Object body, O1XIiIO<T> callback, Activity activity, View view) {
        Intrinsics.X0O(url, "url");
        Intrinsics.X0O(fileParameter, "fileParameter");
        Intrinsics.X0O(file, "file");
        Intrinsics.X0O(body, "body");
        Intrinsics.X0O(callback, "callback");
        C3006uq c3006uqLoadPopup = loadPopup(activity, view);
        NetWork netWork = NetWork.OXO1;
        String str = Api.INSTANCE.getBASE_URL() + url;
        Intrinsics.XiOIii1();
        C289671 c289671 = new C289671(activity, callback, c3006uqLoadPopup);
        ANRequest.MultiPartBuilder multiPartBuilderUpload = AndroidNetworking.upload(str);
        if (file.exists()) {
            multiPartBuilderUpload.addMultipartFile(fileParameter, file);
        }
        ANRequest uploadProgressListener = multiPartBuilderUpload.addMultipartParameter(body).setTag((Object) str).setPriority(Priority.HIGH).build().setUploadProgressListener(NetWorkUtils$upload$$inlined$upload$1.INSTANCE);
        Intrinsics.m39537OX(4, "T");
        TypeToken<?> parameterized = TypeToken.getParameterized(Response.class, Object.class);
        Intrinsics.XiOIii1();
        uploadProgressListener.getAsParsed(parameterized, new NetWorkUtils$upload$$inlined$upload$2(c289671));
    }

    public static /* synthetic */ void get$default(NetWorkUtils netWorkUtils, String url, Map body, O1XIiIO callback, Activity activity, View view, int i, Object obj) {
        if ((i & 8) != 0) {
            activity = null;
        }
        if ((i & 16) != 0) {
            view = null;
        }
        Intrinsics.X0O(url, "url");
        Intrinsics.X0O(body, "body");
        Intrinsics.X0O(callback, "callback");
        C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(activity, view);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), url);
        netWorkUtils.printParam(strConvertBaseUrl + url, body);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + url;
        Intrinsics.XiOIii1();
        C289541 c289541 = new C289541(activity, callback, c3006uqLoadPopup);
        ANRequest aNRequestBuild = AndroidNetworking.get(str).addQueryParameter((Map<String, String>) body).setTag((Object) str).setPriority(Priority.HIGH).build();
        Intrinsics.m39537OX(4, "T");
        TypeToken<?> parameterized = TypeToken.getParameterized(Response.class, Object.class);
        Intrinsics.XiOIii1();
        aNRequestBuild.getAsParsed(parameterized, new NetWorkUtils$get$$inlined$get$1(c289541));
    }

    public final /* synthetic */ <T> void get(String url, Map<String, String> body, O1XIiIO<T> callback, Activity activity, View view) {
        Intrinsics.X0O(url, "url");
        Intrinsics.X0O(body, "body");
        Intrinsics.X0O(callback, "callback");
        C3006uq c3006uqLoadPopup = loadPopup(activity, view);
        String strConvertBaseUrl = convertBaseUrl(Api.INSTANCE.getBASE_URL(), url);
        printParam(strConvertBaseUrl + url, body);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + url;
        Intrinsics.XiOIii1();
        C289541 c289541 = new C289541(activity, callback, c3006uqLoadPopup);
        ANRequest aNRequestBuild = AndroidNetworking.get(str).addQueryParameter(body).setTag((Object) str).setPriority(Priority.HIGH).build();
        Intrinsics.m39537OX(4, "T");
        TypeToken<?> parameterized = TypeToken.getParameterized(Response.class, Object.class);
        Intrinsics.XiOIii1();
        aNRequestBuild.getAsParsed(parameterized, new NetWorkUtils$get$$inlined$get$1(c289541));
    }

    public final /* synthetic */ <T> void postJsonV2(String url, Object body, O1XIiIO<T> callback, Activity activity, View view, Map<String, String> headers) {
        Intrinsics.X0O(url, "url");
        Intrinsics.X0O(body, "body");
        Intrinsics.X0O(callback, "callback");
        Intrinsics.X0O(headers, "headers");
        C3006uq c3006uqLoadPopup = loadPopup(activity, view);
        String strConvertBaseUrl = convertBaseUrl(Api.INSTANCE.getBASE_URL(), url);
        printParam(strConvertBaseUrl + url, headers);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + url;
        Intrinsics.XiOIii1();
        C289613 c289613 = new C289613(activity, callback, c3006uqLoadPopup);
        ANRequest aNRequestBuild = AndroidNetworking.post(str).addHeaders(headers).addApplicationJsonBody(body).setTag((Object) str).setPriority(Priority.HIGH).build();
        Intrinsics.m39537OX(4, "T");
        TypeToken<?> parameterized = TypeToken.getParameterized(Response.class, Object.class);
        Intrinsics.XiOIii1();
        aNRequestBuild.getAsParsed(parameterized, new NetWorkUtils$postJsonV2$$inlined$postJsonV2$2(c289613));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void postJsonV2$default(NetWorkUtils netWorkUtils, String url, Object body, O1XIiIO callback, Activity activity, View view, Map headers, int i, Object obj) {
        if ((i & 8) != 0) {
            activity = null;
        }
        if ((i & 16) != 0) {
            view = null;
        }
        if ((i & 32) != 0) {
            headers = netWorkUtils.getHeadersMap();
        }
        Intrinsics.X0O(url, "url");
        Intrinsics.X0O(body, "body");
        Intrinsics.X0O(callback, "callback");
        Intrinsics.X0O(headers, "headers");
        C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(activity, view);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), url);
        netWorkUtils.printParam(strConvertBaseUrl + url, headers);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + url;
        Intrinsics.XiOIii1();
        C289613 c289613 = new C289613(activity, callback, c3006uqLoadPopup);
        ANRequest aNRequestBuild = AndroidNetworking.post(str).addHeaders((Map<String, String>) headers).addApplicationJsonBody(body).setTag((Object) str).setPriority(Priority.HIGH).build();
        Intrinsics.m39537OX(4, "T");
        TypeToken<?> parameterized = TypeToken.getParameterized(Response.class, Object.class);
        Intrinsics.XiOIii1();
        aNRequestBuild.getAsParsed(parameterized, new NetWorkUtils$postJsonV2$$inlined$postJsonV2$2(c289613));
    }
}
