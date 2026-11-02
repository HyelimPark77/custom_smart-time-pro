package com.sma.smartv3.network;

import android.app.Activity;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.e44;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uq;
import com.android.mltcode.paycertificationapi.yn0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.ANRequest;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interceptors.HttpLoggingInterceptor;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.blankj.utilcode.util.Utils;
import com.facebook.internal.security.CertificateUtil;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ironsource.G5;
import com.ironsource.Ne;
import com.ironsource.Y5;
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
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
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
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.sse.EventSource;
import okhttp3.sse.EventSources;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nNetWorkUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 2 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,925:1\n116#2,23:926\n200#2,7:949\n218#2:956\n200#2,7:957\n218#2:964\n226#2,8:966\n245#2:974\n226#2,8:975\n245#2:983\n252#2,7:984\n270#2:991\n252#2,7:992\n270#2:999\n278#2,8:1000\n298#2:1008\n278#2,8:1009\n298#2:1017\n359#2,17:1018\n278#2,8:1035\n298#2:1043\n278#2,8:1044\n298#2:1052\n383#2,18:1053\n383#2,18:1071\n383#2,18:1089\n432#2,13:1107\n226#2,8:1124\n245#2:1132\n252#2,7:1133\n270#2:1140\n226#2,8:1141\n245#2:1149\n252#2,7:1150\n270#2:1157\n1#3:965\n19#4:1120\n15#4:1121\n19#4:1122\n15#4:1123\n*S KotlinDebug\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n*L\n109#1:926,23\n136#1:949,7\n136#1:956\n136#1:957,7\n136#1:964\n164#1:966,8\n164#1:974\n164#1:975,8\n164#1:983\n186#1:984,7\n186#1:991\n186#1:992,7\n186#1:999\n246#1:1000,8\n246#1:1008\n246#1:1009,8\n246#1:1017\n268#1:1018,17\n292#1:1035,8\n292#1:1043\n292#1:1044,8\n292#1:1052\n314#1:1053,18\n336#1:1071,18\n360#1:1089,18\n505#1:1107,13\n880#1:1124,8\n880#1:1132\n894#1:1133,7\n894#1:1140\n880#1:1141,8\n880#1:1149\n894#1:1150,7\n894#1:1157\n731#1:1120\n731#1:1121\n744#1:1122\n744#1:1123\n*E\n"})
public final class NetWorkUtils {

    @aa1
    public static final NetWorkUtils INSTANCE = null;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.sma.smartv3.network.NetWorkUtils$get$1, reason: invalid class name and case insensitive filesystem */
    @SourceDebugExtension({"SMAP\nNetWorkUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$get$1\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,925:1\n552#2,8:926\n561#2,5:935\n1#3:934\n*S KotlinDebug\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$get$1\n*L\n139#1:926,8\n139#1:935,5\n139#1:934\n*E\n"})
    public static final class C34211<T> implements O1XIiIO<Response<T>> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ O1XIiIO<T> $callback;
        final /* synthetic */ uq $progressPopup;

        public C34211(Activity r1, O1XIiIO<T> r2, uq r3) {
            this.$activity = r1;
            this.$callback = r2;
            this.$progressPopup = r3;
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public void handleError(String r4) {
            Intrinsics.X0O(r4, "error");
            NetWorkUtils.INSTANCE.errorData(r4, this.$callback, this.$progressPopup);
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public /* bridge */ /* synthetic */ void handleResponse(Object r1) {
            handleResponse((Response) r1);
        }

        public void handleResponse(Response<T> r7) {
            NetWorkUtils r0 = NetWorkUtils.INSTANCE;
            Activity r1 = this.$activity;
            O1XIiIO<T> r2 = this.$callback;
            uq r3 = this.$progressPopup;
            LogUtils.d(new Object[]{yn0.I0IIOi + r7});
            if (r7 != null) goto L5;
            r7 = new Response();
            r7.setCode(-1000);
        L5:
            r0.responseWhenCheck(r1, r7, r2);
            if (r3 == null) goto L9;
            r3.dismiss();
            return;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.sma.smartv3.network.NetWorkUtils$getNewApiWeather$2, reason: invalid class name */
    @SourceDebugExtension({"SMAP\nNetWorkUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$getNewApiWeather$2\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,925:1\n552#2,8:926\n561#2,5:935\n1#3:934\n*S KotlinDebug\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$getNewApiWeather$2\n*L\n883#1:926,8\n883#1:935,5\n883#1:934\n*E\n"})
    public static final class AnonymousClass2<T> implements O1XIiIO<Response<T>> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ O1XIiIO<T> $callback;
        final /* synthetic */ uq $progressPopup;

        public AnonymousClass2(Activity r1, O1XIiIO<T> r2, uq r3) {
            this.$activity = r1;
            this.$callback = r2;
            this.$progressPopup = r3;
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public void handleError(String r4) {
            Intrinsics.X0O(r4, "error");
            NetWorkUtils.INSTANCE.errorData(r4, this.$callback, this.$progressPopup);
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public /* bridge */ /* synthetic */ void handleResponse(Object r1) {
            handleResponse((Response) r1);
        }

        public void handleResponse(Response<T> r7) {
            NetWorkUtils r0 = NetWorkUtils.INSTANCE;
            Activity r1 = this.$activity;
            O1XIiIO<T> r2 = this.$callback;
            uq r3 = this.$progressPopup;
            LogUtils.d(new Object[]{yn0.I0IIOi + r7});
            if (r7 != null) goto L5;
            r7 = new Response();
            r7.setCode(-1000);
        L5:
            r0.responseWhenCheck(r1, r7, r2);
            if (r3 == null) goto L9;
            r3.dismiss();
            return;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.sma.smartv3.network.NetWorkUtils$getNewApiWeather$3, reason: invalid class name */
    @SourceDebugExtension({"SMAP\nNetWorkUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$getNewApiWeather$3\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,925:1\n552#2,8:926\n561#2,5:935\n1#3:934\n*S KotlinDebug\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$getNewApiWeather$3\n*L\n897#1:926,8\n897#1:935,5\n897#1:934\n*E\n"})
    public static final class AnonymousClass3<T> implements O1XIiIO<Response<T>> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ O1XIiIO<T> $callback;
        final /* synthetic */ uq $progressPopup;

        public AnonymousClass3(Activity r1, O1XIiIO<T> r2, uq r3) {
            this.$activity = r1;
            this.$callback = r2;
            this.$progressPopup = r3;
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public void handleError(String r4) {
            Intrinsics.X0O(r4, "error");
            NetWorkUtils.INSTANCE.errorData(r4, this.$callback, this.$progressPopup);
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public /* bridge */ /* synthetic */ void handleResponse(Object r1) {
            handleResponse((Response) r1);
        }

        public void handleResponse(Response<T> r7) {
            NetWorkUtils r0 = NetWorkUtils.INSTANCE;
            Activity r1 = this.$activity;
            O1XIiIO<T> r2 = this.$callback;
            uq r3 = this.$progressPopup;
            LogUtils.d(new Object[]{yn0.I0IIOi + r7});
            if (r7 != null) goto L5;
            r7 = new Response();
            r7.setCode(-1000);
        L5:
            r0.responseWhenCheck(r1, r7, r2);
            if (r3 == null) goto L9;
            r3.dismiss();
            return;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.sma.smartv3.network.NetWorkUtils$getV2$2, reason: invalid class name and case insensitive filesystem */
    @SourceDebugExtension({"SMAP\nNetWorkUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$getV2$2\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,925:1\n552#2,8:926\n561#2,5:935\n1#3:934\n*S KotlinDebug\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$getV2$2\n*L\n167#1:926,8\n167#1:935,5\n167#1:934\n*E\n"})
    public static final class C34222<T> implements O1XIiIO<Response<T>> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ O1XIiIO<T> $callback;
        final /* synthetic */ uq $progressPopup;

        public C34222(Activity r1, O1XIiIO<T> r2, uq r3) {
            this.$activity = r1;
            this.$callback = r2;
            this.$progressPopup = r3;
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public void handleError(String r4) {
            Intrinsics.X0O(r4, "error");
            NetWorkUtils.INSTANCE.errorData(r4, this.$callback, this.$progressPopup);
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public /* bridge */ /* synthetic */ void handleResponse(Object r1) {
            handleResponse((Response) r1);
        }

        public void handleResponse(Response<T> r7) {
            NetWorkUtils r0 = NetWorkUtils.INSTANCE;
            Activity r1 = this.$activity;
            O1XIiIO<T> r2 = this.$callback;
            uq r3 = this.$progressPopup;
            LogUtils.d(new Object[]{yn0.I0IIOi + r7});
            if (r7 != null) goto L5;
            r7 = new Response();
            r7.setCode(-1000);
        L5:
            r0.responseWhenCheck(r1, r7, r2);
            if (r3 == null) goto L9;
            r3.dismiss();
            return;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.sma.smartv3.network.NetWorkUtils$post$1, reason: invalid class name and case insensitive filesystem */
    @SourceDebugExtension({"SMAP\nNetWorkUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$post$1\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,925:1\n552#2,8:926\n561#2,5:935\n1#3:934\n*S KotlinDebug\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$post$1\n*L\n189#1:926,8\n189#1:935,5\n189#1:934\n*E\n"})
    public static final class C34231<T> implements O1XIiIO<Response<T>> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ O1XIiIO<T> $callback;
        final /* synthetic */ uq $progressPopup;

        public C34231(Activity r1, O1XIiIO<T> r2, uq r3) {
            this.$activity = r1;
            this.$callback = r2;
            this.$progressPopup = r3;
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public void handleError(String r4) {
            Intrinsics.X0O(r4, "error");
            NetWorkUtils.INSTANCE.errorData(r4, this.$callback, this.$progressPopup);
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public /* bridge */ /* synthetic */ void handleResponse(Object r1) {
            handleResponse((Response) r1);
        }

        public void handleResponse(Response<T> r7) {
            NetWorkUtils r0 = NetWorkUtils.INSTANCE;
            Activity r1 = this.$activity;
            O1XIiIO<T> r2 = this.$callback;
            uq r3 = this.$progressPopup;
            LogUtils.d(new Object[]{yn0.I0IIOi + r7});
            if (r7 != null) goto L5;
            r7 = new Response();
            r7.setCode(-1000);
        L5:
            r0.responseWhenCheck(r1, r7, r2);
            if (r3 == null) goto L9;
            r3.dismiss();
            return;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.sma.smartv3.network.NetWorkUtils$postHyky$1, reason: invalid class name and case insensitive filesystem */
    @SourceDebugExtension({"SMAP\nNetWorkUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$postHyky$1\n*L\n1#1,925:1\n*E\n"})
    public static final class C34241<T> implements ParsedRequestListener<HykyResponse<T>> {
        final /* synthetic */ O1XIiIO<T> $callback;

        public C34241(O1XIiIO<T> r1) {
            this.$callback = r1;
        }

        @Override // com.androidnetworking.interfaces.ParsedRequestListener
        public void onError(ANError r7) {
            Integer r0 = null;
            if (r7 == null) goto L5;
            Integer r1 = Integer.valueOf(r7.getErrorCode());
        L6:
            if (r7 == null) goto L8;
            String r2 = r7.getErrorBody();
        L9:
            if (r7 == null) goto L11;
            String r3 = r7.getErrorDetail();
        L12:
            LogUtils.d(new Object[]{"errorCode:" + r1 + ", errorBody:" + r2 + ", " + r3});
            if (r7 == null) goto L17;
            Response r4 = (Response) r7.getErrorAsObject(Response.class);
            if (r4 == null) goto L17;
            r0 = Integer.valueOf(r4.getCode());
        L19:
            O1XIiIO<T> r8 = this.$callback;
            if (r8 == null) goto L23;
            r8.handleError(String.valueOf(r0));
            return;
        L23:
            return;
        L17:
            if (r7 == null) goto L19;
            r0 = Integer.valueOf(r7.getErrorCode());
            goto L19
        L11:
            r3 = null;
            goto L12
        L8:
            r2 = null;
            goto L9
        L5:
            r1 = null;
            goto L6
        }

        @Override // com.androidnetworking.interfaces.ParsedRequestListener
        public /* bridge */ /* synthetic */ void onResponse(Object r1) {
            onResponse((HykyResponse) r1);
        }

        public void onResponse(HykyResponse<T> r4) {
            Intrinsics.X0O(r4, Ne.n);
            if (r4.getCode() != 200) goto L8;
            O1XIiIO<T> r0 = this.$callback;
            if (r0 == null) goto L12;
            r0.handleResponse(r4.getData());
            return;
        L12:
            return;
        L8:
            O1XIiIO<T> r1 = this.$callback;
            if (r1 == null) goto L13;
            r1.handleError(r4.getCode() + " " + r4.getMessage());
            return;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.sma.smartv3.network.NetWorkUtils$postJson$1, reason: invalid class name and case insensitive filesystem */
    @SourceDebugExtension({"SMAP\nNetWorkUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$postJson$1\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,925:1\n552#2,8:926\n561#2,5:935\n1#3:934\n*S KotlinDebug\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$postJson$1\n*L\n271#1:926,8\n271#1:935,5\n271#1:934\n*E\n"})
    public static final class C34251<T> implements O1XIiIO<Response<T>> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ O1XIiIO<T> $callback;
        final /* synthetic */ uq $progressPopup;

        public C34251(Activity r1, O1XIiIO<T> r2, uq r3) {
            this.$activity = r1;
            this.$callback = r2;
            this.$progressPopup = r3;
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public void handleError(String r4) {
            Intrinsics.X0O(r4, "error");
            NetWorkUtils.INSTANCE.errorData(r4, this.$callback, this.$progressPopup);
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public /* bridge */ /* synthetic */ void handleResponse(Object r1) {
            handleResponse((Response) r1);
        }

        public void handleResponse(Response<T> r7) {
            NetWorkUtils r0 = NetWorkUtils.INSTANCE;
            Activity r1 = this.$activity;
            O1XIiIO<T> r2 = this.$callback;
            uq r3 = this.$progressPopup;
            LogUtils.d(new Object[]{yn0.I0IIOi + r7});
            if (r7 != null) goto L5;
            r7 = new Response();
            r7.setCode(-1000);
        L5:
            r0.responseWhenCheck(r1, r7, r2);
            if (r3 == null) goto L9;
            r3.dismiss();
            return;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.sma.smartv3.network.NetWorkUtils$postJsonThirdParty$1, reason: invalid class name and case insensitive filesystem */
    @SourceDebugExtension({"SMAP\nNetWorkUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$postJsonThirdParty$1\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,925:1\n552#2,8:926\n561#2,5:935\n1#3:934\n*S KotlinDebug\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$postJsonThirdParty$1\n*L\n316#1:926,8\n316#1:935,5\n316#1:934\n*E\n"})
    public static final class C34261<T> implements O1XIiIO<Response<T>> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ O1XIiIO<T> $callback;
        final /* synthetic */ uq $progressPopup;

        public C34261(Activity r1, O1XIiIO<T> r2, uq r3) {
            this.$activity = r1;
            this.$callback = r2;
            this.$progressPopup = r3;
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public void handleError(String r4) {
            Intrinsics.X0O(r4, "error");
            NetWorkUtils.INSTANCE.errorData(r4, this.$callback, this.$progressPopup);
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public /* bridge */ /* synthetic */ void handleResponse(Object r1) {
            handleResponse((Response) r1);
        }

        public void handleResponse(Response<T> r7) {
            NetWorkUtils r0 = NetWorkUtils.INSTANCE;
            Activity r1 = this.$activity;
            O1XIiIO<T> r2 = this.$callback;
            uq r3 = this.$progressPopup;
            LogUtils.d(new Object[]{yn0.I0IIOi + r7});
            if (r7 != null) goto L5;
            r7 = new Response();
            r7.setCode(-1000);
        L5:
            r0.responseWhenCheck(r1, r7, r2);
            if (r3 == null) goto L9;
            r3.dismiss();
            return;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.sma.smartv3.network.NetWorkUtils$postJsonV2$2, reason: invalid class name and case insensitive filesystem */
    @SourceDebugExtension({"SMAP\nNetWorkUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$postJsonV2$2\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,925:1\n552#2,8:926\n561#2,5:935\n1#3:934\n*S KotlinDebug\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$postJsonV2$2\n*L\n339#1:926,8\n339#1:935,5\n339#1:934\n*E\n"})
    public static final class C34272<T> implements O1XIiIO<Response<T>> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ O1XIiIO<T> $callback;
        final /* synthetic */ uq $progressPopup;

        public C34272(Activity r1, O1XIiIO<T> r2, uq r3) {
            this.$activity = r1;
            this.$callback = r2;
            this.$progressPopup = r3;
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public void handleError(String r4) {
            Intrinsics.X0O(r4, "error");
            NetWorkUtils.INSTANCE.errorData(r4, this.$callback, this.$progressPopup);
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public /* bridge */ /* synthetic */ void handleResponse(Object r1) {
            handleResponse((Response) r1);
        }

        public void handleResponse(Response<T> r7) {
            NetWorkUtils r0 = NetWorkUtils.INSTANCE;
            Activity r1 = this.$activity;
            O1XIiIO<T> r2 = this.$callback;
            uq r3 = this.$progressPopup;
            LogUtils.d(new Object[]{yn0.I0IIOi + r7});
            if (r7 != null) goto L5;
            r7 = new Response();
            r7.setCode(-1000);
        L5:
            r0.responseWhenCheck(r1, r7, r2);
            if (r3 == null) goto L9;
            r3.dismiss();
            return;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.sma.smartv3.network.NetWorkUtils$postJsonV2$3, reason: invalid class name and case insensitive filesystem */
    @SourceDebugExtension({"SMAP\nNetWorkUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$postJsonV2$3\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,925:1\n552#2,8:926\n561#2,5:935\n1#3:934\n*S KotlinDebug\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$postJsonV2$3\n*L\n363#1:926,8\n363#1:935,5\n363#1:934\n*E\n"})
    public static final class C34283<T> implements O1XIiIO<Response<T>> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ O1XIiIO<T> $callback;
        final /* synthetic */ uq $progressPopup;

        public C34283(Activity r1, O1XIiIO<T> r2, uq r3) {
            this.$activity = r1;
            this.$callback = r2;
            this.$progressPopup = r3;
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public void handleError(String r4) {
            Intrinsics.X0O(r4, "error");
            NetWorkUtils.INSTANCE.errorData(r4, this.$callback, this.$progressPopup);
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public /* bridge */ /* synthetic */ void handleResponse(Object r1) {
            handleResponse((Response) r1);
        }

        public void handleResponse(Response<T> r7) {
            NetWorkUtils r0 = NetWorkUtils.INSTANCE;
            Activity r1 = this.$activity;
            O1XIiIO<T> r2 = this.$callback;
            uq r3 = this.$progressPopup;
            LogUtils.d(new Object[]{yn0.I0IIOi + r7});
            if (r7 != null) goto L5;
            r7 = new Response();
            r7.setCode(-1000);
        L5:
            r0.responseWhenCheck(r1, r7, r2);
            if (r3 == null) goto L9;
            r3.dismiss();
            return;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.sma.smartv3.network.NetWorkUtils$postParameterThirdParty$1, reason: invalid class name and case insensitive filesystem */
    @SourceDebugExtension({"SMAP\nNetWorkUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$postParameterThirdParty$1\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,925:1\n552#2,8:926\n561#2,5:935\n1#3:934\n*S KotlinDebug\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$postParameterThirdParty$1\n*L\n294#1:926,8\n294#1:935,5\n294#1:934\n*E\n"})
    public static final class C34291<T> implements O1XIiIO<Response<T>> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ O1XIiIO<T> $callback;
        final /* synthetic */ uq $progressPopup;

        public C34291(Activity r1, O1XIiIO<T> r2, uq r3) {
            this.$activity = r1;
            this.$callback = r2;
            this.$progressPopup = r3;
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public void handleError(String r4) {
            Intrinsics.X0O(r4, "error");
            NetWorkUtils.INSTANCE.errorData(r4, this.$callback, this.$progressPopup);
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public /* bridge */ /* synthetic */ void handleResponse(Object r1) {
            handleResponse((Response) r1);
        }

        public void handleResponse(Response<T> r7) {
            NetWorkUtils r0 = NetWorkUtils.INSTANCE;
            Activity r1 = this.$activity;
            O1XIiIO<T> r2 = this.$callback;
            uq r3 = this.$progressPopup;
            LogUtils.d(new Object[]{yn0.I0IIOi + r7});
            if (r7 != null) goto L5;
            r7 = new Response();
            r7.setCode(-1000);
        L5:
            r0.responseWhenCheck(r1, r7, r2);
            if (r3 == null) goto L9;
            r3.dismiss();
            return;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.sma.smartv3.network.NetWorkUtils$postV2$2, reason: invalid class name and case insensitive filesystem */
    @SourceDebugExtension({"SMAP\nNetWorkUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$postV2$2\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,925:1\n552#2,8:926\n561#2,5:935\n1#3:934\n*S KotlinDebug\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$postV2$2\n*L\n249#1:926,8\n249#1:935,5\n249#1:934\n*E\n"})
    public static final class C34322<T> implements O1XIiIO<Response<T>> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ O1XIiIO<T> $callback;
        final /* synthetic */ uq $progressPopup;

        public C34322(Activity r1, O1XIiIO<T> r2, uq r3) {
            this.$activity = r1;
            this.$callback = r2;
            this.$progressPopup = r3;
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public void handleError(String r4) {
            Intrinsics.X0O(r4, "error");
            NetWorkUtils.INSTANCE.errorData(r4, this.$callback, this.$progressPopup);
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public /* bridge */ /* synthetic */ void handleResponse(Object r1) {
            handleResponse((Response) r1);
        }

        public void handleResponse(Response<T> r7) {
            NetWorkUtils r0 = NetWorkUtils.INSTANCE;
            Activity r1 = this.$activity;
            O1XIiIO<T> r2 = this.$callback;
            uq r3 = this.$progressPopup;
            LogUtils.d(new Object[]{yn0.I0IIOi + r7});
            if (r7 != null) goto L5;
            r7 = new Response();
            r7.setCode(-1000);
        L5:
            r0.responseWhenCheck(r1, r7, r2);
            if (r3 == null) goto L9;
            r3.dismiss();
            return;
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.network.NetWorkUtils$postV3$1, reason: invalid class name and case insensitive filesystem */
    @DebugMetadata(c = "com.sma.smartv3.network.NetWorkUtils$postV3$1", f = "NetWorkUtils.kt", i = {}, l = {207}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    @SourceDebugExtension({"SMAP\nNetWorkUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$postV3$1\n*L\n1#1,925:1\n*E\n"})
    public static final class C34331 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        final /* synthetic */ Map<String, Object> $body;
        final /* synthetic */ O1XIiIO<T> $callback;
        final /* synthetic */ Map<String, String> $headers;
        final /* synthetic */ uq $progressRef;
        final /* synthetic */ String $url;
        final /* synthetic */ WeakReference<AppCompatActivity> $weakActivity;
        int label;

        /* JADX INFO: renamed from: com.sma.smartv3.network.NetWorkUtils$postV3$1$1, reason: invalid class name and collision with other inner class name */
        @DebugMetadata(c = "com.sma.smartv3.network.NetWorkUtils$postV3$1$1", f = "NetWorkUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        @SourceDebugExtension({"SMAP\nNetWorkUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$postV3$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,925:1\n1#2:926\n315#3,2:927\n317#3,8:930\n325#3,13:939\n352#3:952\n216#4:929\n217#4:938\n*S KotlinDebug\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$postV3$1$1\n*L\n210#1:927,2\n210#1:930,8\n210#1:939,13\n210#1:952\n210#1:929\n210#1:938\n*E\n"})
        public static final class C05591 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
            final /* synthetic */ Map<String, Object> $body;
            final /* synthetic */ O1XIiIO<T> $callback;
            final /* synthetic */ Map<String, String> $headers;
            final /* synthetic */ String $url;
            final /* synthetic */ WeakReference<AppCompatActivity> $weakActivity;
            int label;

            public C05591(String r1, Map<String, ? extends Object> r2, Map<String, String> r3, WeakReference<AppCompatActivity> r4, O1XIiIO<T> r5, Continuation<? super C05591> r6) {
                this.$url = r1;
                this.$body = r2;
                this.$headers = r3;
                this.$weakActivity = r4;
                this.$callback = r5;
                super(2, r6);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object r8, Continuation<?> r9) {
                return new C05591(this.$url, this.$body, this.$headers, this.$weakActivity, this.$callback, r9);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
                return ((C05591) create(r1, r2)).invokeSuspend(Unit.OXO1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object r8) {
                pb.I0iXXO();
                if (this.label != 0) goto L25;
                ResultKt.X1ii(r8);
                NetWorkUtils r9 = NetWorkUtils.INSTANCE;
                String r0 = r9.convertBaseUrl(Api.INSTANCE.getBASE_URL(), this.$url);
                String r1 = r0 + this.$url;
                Map<String, ? extends Object> r2 = OXO1.X111IO(this.$body);
                r2.putAll(this.$headers);
                Unit r3 = Unit.OXO1;
                r9.printParam(r1, r2);
                NetWork r10 = NetWork.OXO1;
                String r11 = r0 + this.$url;
                Map<String, String> r4 = this.$headers;
                Map<String, Object> r5 = this.$body;
                Intrinsics.XiOIii1();
                final WeakReference<AppCompatActivity> r6 = this.$weakActivity;
                final O1XIiIO<T> r7 = this.$callback;
                final O1XIiIO<Response<T>> r12 = new AnonymousClass2(r6, r7);
                FormBody.Builder r13 = new FormBody.Builder(null, 1, 0 == true ? 1 : 0);
                Iterator<Map.Entry<String, Object>> r14 = r5.entrySet().iterator();
            L6:
                if (r14.hasNext() == false) goto L18;
                Map.Entry<String, Object> r15 = r14.next();
                String r16 = r15.getKey();
                Object r17 = r15.getValue();
                if ((r17 instanceof String) == false) goto L11;
                String r18 = (String) r17;
            L17:
                r13.add(r16, r18);
                goto L6
            L11:
                if ((r17 instanceof Boolean) == false) goto L14;
                r18 = String.valueOf(((Boolean) r17).booleanValue()).toLowerCase(Locale.ROOT);
                Intrinsics.O10IXXX0X(r18, "toLowerCase(...)");
                goto L17
            L14:
                if ((r17 instanceof Number) == false) goto L16;
                r18 = r17.toString();
                goto L17
            L16:
                r18 = r17.toString();
                goto L17
            L18:
                Request.Builder r19 = new Request.Builder().url(r11).post(r13.build());
                Iterator<Map.Entry<String, String>> r20 = r4.entrySet().iterator();
            L20:
                if (r20.hasNext() == false) goto L22;
                Map.Entry<String, String> r21 = r20.next();
                r19.addHeader(r21.getKey(), r21.getValue());
                goto L20
            L22:
                Call r22 = com.sma.androidnetworklib.OXO1.OXO1.OXO1().newCall(r19.build());
                Intrinsics.XiOIii1();
                r22.enqueue(new NetWorkUtils$postV3$1$1$invokeSuspend$$inlined$postV3$1(r12));
                return Unit.OXO1;
            L25:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
                return invoke2(r1, r2);
            }
        }

        public C34331(uq r1, String r2, Map<String, ? extends Object> r3, Map<String, String> r4, WeakReference<AppCompatActivity> r5, O1XIiIO<T> r6, Continuation<? super C34331> r7) {
            this.$progressRef = r1;
            this.$url = r2;
            this.$body = r3;
            this.$headers = r4;
            this.$weakActivity = r5;
            this.$callback = r6;
            super(2, r7);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r9, Continuation<?> r10) {
            return new C34331(this.$progressRef, this.$url, this.$body, this.$headers, this.$weakActivity, this.$callback, r10);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((C34331) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r11) {
            Object r0 = pb.I0iXXO();
            int r1 = this.label;
            if (r1 == 0) goto L11;
            if (r1 != 1) goto L10;
            ResultKt.X1ii(r11);     // Catch: Throwable -> L7
        L15:
            uq r12 = this.$progressRef;
            if (r12 == null) goto L19;
            r12.dismiss();
        L19:
            return Unit.OXO1;
        L10:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L11:
            ResultKt.X1ii(r11);
            CoroutineDispatcher r13 = IXOX0Xiii.iO();     // Catch: Throwable -> L7
            Intrinsics.XiOIii1();     // Catch: Throwable -> L7
            C05591 r3 = new C05591(this.$url, this.$body, this.$headers, this.$weakActivity, this.$callback, null);     // Catch: Throwable -> L7
            this.label = 1;     // Catch: Throwable -> L7
            if (I100X1.I0IIOi(r13, r3, this) != r0) goto L15;
            return r0;
        L7:
            th = move-exception;
            uq r2 = this.$progressRef;
            if (r2 == null) goto L26;
            r2.dismiss();
            throw th;
        L26:
            throw th;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.sma.smartv3.network.NetWorkUtils$upload$1, reason: invalid class name and case insensitive filesystem */
    @SourceDebugExtension({"SMAP\nNetWorkUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$upload$1\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,925:1\n552#2,8:926\n561#2,5:935\n1#3:934\n*S KotlinDebug\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$upload$1\n*L\n116#1:926,8\n116#1:935,5\n116#1:934\n*E\n"})
    public static final class C34341<T> implements O1XIiIO<Response<T>> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ O1XIiIO<T> $callback;
        final /* synthetic */ uq $progressPopup;

        public C34341(Activity r1, O1XIiIO<T> r2, uq r3) {
            this.$activity = r1;
            this.$callback = r2;
            this.$progressPopup = r3;
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public void handleError(String r4) {
            Intrinsics.X0O(r4, "error");
            NetWorkUtils.INSTANCE.errorData(r4, this.$callback, this.$progressPopup);
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public /* bridge */ /* synthetic */ void handleResponse(Object r1) {
            handleResponse((Response) r1);
        }

        public void handleResponse(Response<T> r7) {
            NetWorkUtils r0 = NetWorkUtils.INSTANCE;
            Activity r1 = this.$activity;
            O1XIiIO<T> r2 = this.$callback;
            uq r3 = this.$progressPopup;
            LogUtils.d(new Object[]{yn0.I0IIOi + r7});
            if (r7 != null) goto L5;
            r7 = new Response();
            r7.setCode(-1000);
        L5:
            r0.responseWhenCheck(r1, r7, r2);
            if (r3 == null) goto L9;
            r3.dismiss();
            return;
        }
    }

    static {
        INSTANCE = new NetWorkUtils();
    }

    private NetWorkUtils() {
    }

    public static /* synthetic */ void get$default(NetWorkUtils r0, String r1, O1XIiIO r2, int r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L5;
        r3 = 0;
    L5:
        r0.get(r1, r2, r3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getNewApiWeather$default(NetWorkUtils r17, String r18, Map r19, O1XIiIO r20, Activity r21, View r22, Map r23, int r24, Object r25) {
        View r9 = null;
        if ((r24 & 8) == 0) goto L5;
        Activity r8 = null;
    L7:
        if ((r24 & 16) != 0) goto L11;
        r9 = r22;
    L11:
        if ((r24 & 32) == 0) goto L13;
        Map r10 = r17.getHeadersMap();
    L14:
        Intrinsics.X0O(r18, "url");
        Intrinsics.X0O(r19, "body");
        Intrinsics.X0O(r20, "callback");
        Intrinsics.X0O(r10, "headers");
        uq r11 = r17.loadPopup(r8, r9);
        String r12 = r17.convertBaseUrl(Api.INSTANCE.getBASE_URL(), r18);
        i72 r13 = i72.OXO1;
        if (r13.II1Xi0() == true) goto L17;
        r17.printParam(r12 + r18, OXO1.Ii0i(r19, r10));
        i1O0OXO1O.OXO1.OXO1(UploadInfoManager.OXO1.XO0O10() + " getNewApiWeather : enableNewWeatherApi = " + r13.II1Xi0());
        NetWork r0 = NetWork.OXO1;
        String r1 = r12 + r18;
        Intrinsics.XiOIii1();
        AnonymousClass3 r2 = new AnonymousClass3(r8, r20, r11);
        ANRequest r3 = AndroidNetworking.post(r1).addBodyParameter(r19).setTag(r1).setPriority(Priority.HIGH).build();
        Intrinsics.OX(4, "T");
        TypeToken<?> r4 = TypeToken.getParameterized(Response.class, new Type[]{Object.class});
        Intrinsics.XiOIii1();
        r3.getAsParsed(r4, new NetWorkUtils$getNewApiWeather$$inlined$post$1(r2));
        return;
    L17:
        if (oe5.XIIIO(r18, GetWeatherRealtime.URL, true) == false) goto L20;
        String r14 = GetWeatherRealtime.URL_V2;
    L23:
        Map<String, String> r15 = OXO1.X111IO(r19);
        if (r15.containsKey("lat") == false) goto L31;
        Type r26 = Object.class;
        String r16 = r15.get("lat");     // Catch: Exception -> L30
        Intrinsics.XXI(r16);     // Catch: Exception -> L30
        Type r27 = Response.class;
        r15.put("lat", new BigDecimal(r16).setScale(1, RoundingMode.DOWN).toString());     // Catch: Exception -> L41
    L33:
        if (r15.containsKey("lon") == false) goto L37;
        String r5 = r15.get("lon");     // Catch: Exception -> L41
        Intrinsics.XXI(r5);     // Catch: Exception -> L41
        r15.put("lon", new BigDecimal(r5).setScale(1, RoundingMode.DOWN).toString());     // Catch: Exception -> L41
    L37:
        Map r6 = OXO1.X111IO(r19);
        r6.putAll(r10);
        Unit r7 = Unit.OXO1;
        r17.printParam(r12 + r18, r6);
        i1O0OXO1O.OXO1.OXO1(UploadInfoManager.OXO1.XO0O10() + " getNewApiWeather : enableNewWeatherApi = " + i72.OXO1.II1Xi0());
        NetWork r28 = NetWork.OXO1;
        String r29 = r12 + r14;
        Intrinsics.XiOIii1();
        AnonymousClass2 r30 = new AnonymousClass2(r8, r20, r11);
        ANRequest r31 = AndroidNetworking.get(r29).addQueryParameter(r15).setTag(r29).addHeaders(r10).setPriority(Priority.HIGH).build();
        Intrinsics.OX(4, "T");
        TypeToken<?> r32 = TypeToken.getParameterized(r27, new Type[]{r26});
        Intrinsics.XiOIii1();
        r31.getAsParsed(r32, new NetWorkUtils$getNewApiWeather$$inlined$getV2$1(r30));
        return;
    L30:
        r27 = Response.class;
        goto L37
    L31:
        r27 = Response.class;
        r26 = Object.class;
    L36:
        r27 = Response.class;
        r26 = Object.class;
        goto L37
    L20:
        if (oe5.XIIIO(r18, GetWeatherForecast.URL, true) == false) goto L22;
        r14 = GetWeatherForecast.URL_V2;
        goto L23
    L22:
        r14 = r18;
        goto L23
    L13:
        r10 = r23;
        goto L14
    L5:
        r8 = r21;
        goto L7
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getV2$default(NetWorkUtils r2, String r3, Map r4, O1XIiIO r5, Activity r6, View r7, Map r8, int r9, Object r10) {
        if ((r9 & 8) == 0) goto L6;
        r6 = null;
    L6:
        if ((r9 & 16) == 0) goto L9;
        r7 = null;
    L9:
        if ((r9 & 32) == 0) goto L11;
        r8 = r2.getHeadersMap();
    L11:
        Intrinsics.X0O(r3, "url");
        Intrinsics.X0O(r4, "body");
        Intrinsics.X0O(r5, "callback");
        Intrinsics.X0O(r8, "headers");
        uq r11 = r2.loadPopup(r6, r7);
        String r12 = r2.convertBaseUrl(Api.INSTANCE.getBASE_URL(), r3);
        Map r0 = OXO1.X111IO(r4);
        r0.putAll(r8);
        Unit r1 = Unit.OXO1;
        r2.printParam(r12 + r3, r0);
        NetWork r13 = NetWork.OXO1;
        String r14 = r12 + r3;
        Intrinsics.XiOIii1();
        C34222 r15 = new C34222(r6, r5, r11);
        ANRequest r16 = AndroidNetworking.get(r14).addQueryParameter(r4).setTag(r14).addHeaders(r8).setPriority(Priority.HIGH).build();
        Intrinsics.OX(4, "T");
        TypeToken<?> r17 = TypeToken.getParameterized(Response.class, new Type[]{Object.class});
        Intrinsics.XiOIii1();
        r16.getAsParsed(r17, new NetWorkUtils$getV2$$inlined$getV2$1(r15));
    }

    public static /* synthetic */ void post$default(NetWorkUtils r1, String r2, Map r3, O1XIiIO r4, Activity r5, View r6, int r7, Object r8) {
        if ((r7 & 8) == 0) goto L6;
        r5 = null;
    L6:
        if ((r7 & 16) == 0) goto L8;
        r6 = null;
    L8:
        Intrinsics.X0O(r2, "url");
        Intrinsics.X0O(r3, "body");
        Intrinsics.X0O(r4, "callback");
        uq r9 = r1.loadPopup(r5, r6);
        String r10 = r1.convertBaseUrl(Api.INSTANCE.getBASE_URL(), r2);
        r1.printParam(r10 + r2, r3);
        NetWork r11 = NetWork.OXO1;
        String r12 = r10 + r2;
        Intrinsics.XiOIii1();
        C34231 r13 = new C34231(r5, r4, r9);
        ANRequest r14 = AndroidNetworking.post(r12).addBodyParameter(r3).setTag(r12).setPriority(Priority.HIGH).build();
        Intrinsics.OX(4, "T");
        TypeToken<?> r15 = TypeToken.getParameterized(Response.class, new Type[]{Object.class});
        Intrinsics.XiOIii1();
        r14.getAsParsed(r15, new NetWorkUtils$post$$inlined$post$1(r13));
    }

    public static /* synthetic */ void postHyky$default(NetWorkUtils r1, String r2, Object r3, O1XIiIO r4, int r5, Object r6) {
        if ((r5 & 4) == 0) goto L5;
        r4 = null;
    L5:
        Intrinsics.X0O(r2, "url");
        Intrinsics.X0O(r3, "jsonBody");
        String r7 = HykyAPI.INSTANCE.getBASE_URL_HYKY() + r2;
        HykyManager.Companion r8 = HykyManager.Companion;
        ANRequest r9 = AndroidNetworking.post(r7).addHeaders("Authorization", r8.getInstance().getToken().getTokenType() + " " + r8.getInstance().getToken().getAccessToken()).addApplicationJsonBody(r3).setTag(r7).setPriority(Priority.HIGH).build();
        Intrinsics.OX(4, "T");
        TypeToken<?> r10 = TypeToken.getParameterized(HykyResponse.class, new Type[]{Object.class});
        Intrinsics.XiOIii1();
        r9.getAsParsed(r10, new C34241(r4));
    }

    public static /* synthetic */ void postJson$default(NetWorkUtils r3, String r4, Object r5, O1XIiIO r6, Activity r7, View r8, int r9, Object r10) {
        if ((r9 & 8) == 0) goto L6;
        r7 = null;
    L6:
        if ((r9 & 16) == 0) goto L8;
        r8 = null;
    L8:
        Intrinsics.X0O(r4, "url");
        Intrinsics.X0O(r5, "body");
        Intrinsics.X0O(r6, "callback");
        uq r11 = r3.loadPopup(r7, r8);
        i1O0OXO1O r12 = i1O0OXO1O.OXO1;
        Api r13 = Api.INSTANCE;
        r12.OXO1("JSON Api.BASE_URL -> " + r13.getBASE_URL() + " , url = " + r4);
        String r14 = r3.convertBaseUrl(r13.getBASE_URL(), r4);
        NetWork r15 = NetWork.OXO1;
        String r16 = r14 + r4;
        Intrinsics.XiOIii1();
        C34251 r17 = new C34251(r7, r6, r11);
        ANRequest r18 = AndroidNetworking.post(r16).addApplicationJsonBody(r5).setTag(r16).setPriority(Priority.HIGH).build();
        Intrinsics.OX(4, "T");
        TypeToken<?> r19 = TypeToken.getParameterized(Response.class, new Type[]{Object.class});
        Intrinsics.XiOIii1();
        r18.getAsParsed(r19, new NetWorkUtils$postJson$$inlined$postJson$1(r17));
    }

    public static /* synthetic */ void postJsonThirdParty$default(NetWorkUtils r1, String r2, Object r3, O1XIiIO r4, Activity r5, View r6, Map r7, int r8, Object r9) {
        if ((r8 & 8) == 0) goto L6;
        r5 = null;
    L6:
        if ((r8 & 16) == 0) goto L8;
        r6 = null;
    L8:
        Intrinsics.X0O(r2, "url");
        Intrinsics.X0O(r3, "body");
        Intrinsics.X0O(r4, "callback");
        Intrinsics.X0O(r7, "headers");
        uq r10 = r1.loadPopup(r5, r6);
        r1.printParam(r2, OXO1.Ii0i(OXO1.Ii0i(OXO1.I1(), r7), (Map) r3));
        NetWork r11 = NetWork.OXO1;
        Intrinsics.XiOIii1();
        C34261 r12 = new C34261(r5, r4, r10);
        ANRequest r13 = AndroidNetworking.post(r2).addHeaders(r7).addApplicationJsonBody(r3).setTag(r2).setPriority(Priority.HIGH).build();
        Intrinsics.OX(4, "T");
        TypeToken<?> r14 = TypeToken.getParameterized(Response.class, new Type[]{Object.class});
        Intrinsics.XiOIii1();
        r13.getAsParsed(r14, new NetWorkUtils$postJsonThirdParty$$inlined$postJsonV2$1(r12));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void postJsonV2$default(NetWorkUtils r2, String r3, Map r4, O1XIiIO r5, Activity r6, View r7, Map r8, int r9, Object r10) {
        if ((r9 & 8) == 0) goto L6;
        r6 = null;
    L6:
        if ((r9 & 16) == 0) goto L9;
        r7 = null;
    L9:
        if ((r9 & 32) == 0) goto L11;
        r8 = r2.getHeadersMap();
    L11:
        Intrinsics.X0O(r3, "url");
        Intrinsics.X0O(r4, "body");
        Intrinsics.X0O(r5, "callback");
        Intrinsics.X0O(r8, "headers");
        uq r11 = r2.loadPopup(r6, r7);
        String r12 = r2.convertBaseUrl(Api.INSTANCE.getBASE_URL(), r3);
        Map r0 = OXO1.X111IO(r4);
        r0.putAll(r8);
        Unit r1 = Unit.OXO1;
        r2.printParam(r12 + r3, r0);
        NetWork r13 = NetWork.OXO1;
        String r14 = r12 + r3;
        Intrinsics.XiOIii1();
        C34272 r15 = new C34272(r6, r5, r11);
        ANRequest r16 = AndroidNetworking.post(r14).addHeaders(r8).addApplicationJsonBody(r4).setTag(r14).setPriority(Priority.HIGH).build();
        Intrinsics.OX(4, "T");
        TypeToken<?> r17 = TypeToken.getParameterized(Response.class, new Type[]{Object.class});
        Intrinsics.XiOIii1();
        r16.getAsParsed(r17, new NetWorkUtils$postJsonV2$$inlined$postJsonV2$1(r15));
    }

    public static /* synthetic */ void postParameterThirdParty$default(NetWorkUtils r1, String r2, Object r3, O1XIiIO r4, Activity r5, View r6, Map r7, int r8, Object r9) {
        if ((r8 & 8) == 0) goto L6;
        r5 = null;
    L6:
        if ((r8 & 16) == 0) goto L8;
        r6 = null;
    L8:
        Intrinsics.X0O(r2, "url");
        Intrinsics.X0O(r3, "body");
        Intrinsics.X0O(r4, "callback");
        Intrinsics.X0O(r7, "headers");
        uq r10 = r1.loadPopup(r5, r6);
        Map<String, String> r11 = (Map) r3;
        r1.printParam(r2, OXO1.Ii0i(OXO1.Ii0i(OXO1.I1(), r7), r11));
        NetWork r12 = NetWork.OXO1;
        Intrinsics.XiOIii1();
        C34291 r13 = new C34291(r5, r4, r10);
        ANRequest r14 = AndroidNetworking.post(r2).addHeaders(r7).addBodyParameter(r11).setTag(r2).setPriority(Priority.HIGH).build();
        Intrinsics.OX(4, "T");
        TypeToken<?> r15 = TypeToken.getParameterized(Response.class, new Type[]{Object.class});
        Intrinsics.XiOIii1();
        r14.getAsParsed(r15, new NetWorkUtils$postParameterThirdParty$$inlined$postV2$1(r13));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void postRequest$default(NetWorkUtils r0, String r1, Function1 r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = null;
    L5:
        r0.postRequest(r1, r2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EventSource postStreamRequest$default(NetWorkUtils r0, String r1, Map r2, Object r3, O1XIiIO r4, int r5, Object r6) {
        if ((r5 & 2) == 0) goto L6;
        r2 = r0.getHeadersMap();
    L6:
        return r0.postStreamRequest(r1, r2, r3, r4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void postV2$default(NetWorkUtils r2, String r3, Map r4, O1XIiIO r5, Activity r6, View r7, Map r8, int r9, Object r10) {
        if ((r9 & 8) == 0) goto L6;
        r6 = null;
    L6:
        if ((r9 & 16) == 0) goto L9;
        r7 = null;
    L9:
        if ((r9 & 32) == 0) goto L11;
        r8 = r2.getHeadersMap();
    L11:
        Intrinsics.X0O(r3, "url");
        Intrinsics.X0O(r4, "body");
        Intrinsics.X0O(r5, "callback");
        Intrinsics.X0O(r8, "headers");
        uq r11 = r2.loadPopup(r6, r7);
        String r12 = r2.convertBaseUrl(Api.INSTANCE.getBASE_URL(), r3);
        Map r0 = OXO1.X111IO(r4);
        r0.putAll(r8);
        Unit r1 = Unit.OXO1;
        r2.printParam(r12 + r3, r0);
        NetWork r13 = NetWork.OXO1;
        String r14 = r12 + r3;
        Intrinsics.XiOIii1();
        C34322 r15 = new C34322(r6, r5, r11);
        ANRequest r16 = AndroidNetworking.post(r14).addHeaders(r8).addBodyParameter(r4).setTag(r14).setPriority(Priority.HIGH).build();
        Intrinsics.OX(4, "T");
        TypeToken<?> r17 = TypeToken.getParameterized(Response.class, new Type[]{Object.class});
        Intrinsics.XiOIii1();
        r16.getAsParsed(r17, new NetWorkUtils$postV2$$inlined$postV2$1(r15));
    }

    public static /* synthetic */ void postV3$default(NetWorkUtils r10, String r11, Map r12, O1XIiIO r13, AppCompatActivity r14, View r15, Map r16, int r17, Object r18) {
        if ((r17 & 16) == 0) goto L5;
        View r0 = null;
    L7:
        if ((r17 & 32) == 0) goto L9;
        Map r6 = r10.getHeadersMap();
    L10:
        Intrinsics.X0O(r11, "url");
        Intrinsics.X0O(r12, "body");
        Intrinsics.X0O(r13, "callback");
        Intrinsics.X0O(r14, "activity");
        Intrinsics.X0O(r6, "headers");
        WeakReference r7 = new WeakReference(r14);
        uq r3 = r10.loadPopup(r14, r0);
        LifecycleCoroutineScope r19 = LifecycleOwnerKt.getLifecycleScope(r14);
        Intrinsics.XiOIii1();
        I100X1.O00(r19, null, null, new C34331(r3, r11, r12, r6, r7, r13, null), 3, null);
        return;
    L9:
        r6 = r16;
        goto L10
    L5:
        r0 = r15;
        goto L7
    }

    public static /* synthetic */ void upload$default(NetWorkUtils r1, String r2, String r3, File r4, Object r5, O1XIiIO r6, Activity r7, View r8, int r9, Object r10) {
        if ((r9 & 32) == 0) goto L6;
        r7 = null;
    L6:
        if ((r9 & 64) == 0) goto L8;
        r8 = null;
    L8:
        Intrinsics.X0O(r2, "url");
        Intrinsics.X0O(r3, "fileParameter");
        Intrinsics.X0O(r4, "file");
        Intrinsics.X0O(r5, "body");
        Intrinsics.X0O(r6, "callback");
        uq r11 = r1.loadPopup(r7, r8);
        NetWork r12 = NetWork.OXO1;
        String r13 = Api.INSTANCE.getBASE_URL() + r2;
        Intrinsics.XiOIii1();
        C34341 r14 = new C34341(r7, r6, r11);
        ANRequest.MultiPartBuilder r15 = AndroidNetworking.upload(r13);
        if (r4.exists() == false) goto L11;
        r15.addMultipartFile(r3, r4);
    L11:
        ANRequest r16 = r15.addMultipartParameter(r5).setTag(r13).setPriority(Priority.HIGH).build().setUploadProgressListener(NetWorkUtils$upload$$inlined$upload$1.INSTANCE);
        Intrinsics.OX(4, "T");
        TypeToken<?> r17 = TypeToken.getParameterized(Response.class, new Type[]{Object.class});
        Intrinsics.XiOIii1();
        r16.getAsParsed(r17, new NetWorkUtils$upload$$inlined$upload$2(r14));
    }

    public final void clearAllBitmap() {
        NetWork.OXO1.iO();
    }

    @aa1
    public final String convertBaseUrl(@aa1 String r6, @aa1 String r7) {
        Intrinsics.X0O(r6, "baseUrl");
        Intrinsics.X0O(r7, "url");
        String r0 = e44.OXO1;
        if (StringsKt__StringsKt.iOiXX(r6, e44.OXO1, true) == true) goto L15;
        if (StringsKt__StringsKt.iOiXX(r6, e44.XIi00iiXO, true) == true) goto L15;
        if (StringsKt__StringsKt.iOiXX(r6, e44.iO, true) == true) goto L15;
        if (StringsKt__StringsKt.iOiXX(r6, e44.XO0O10, true) == true) goto L15;
        if (StringsKt__StringsKt.iOiXX(r6, e44.O00, true) == true) goto L15;
        return r6;
    L15:
        if (oe5.XIIIO(r7, BleFirmwareList.URL, true) == false) goto L17;
    L68:
        String r2 = e44.OXO1;
    L70:
        if (StringsKt__StringsKt.iOiXX(r6, e44.iO, true) == false) goto L72;
    L78:
        r0 = r2;
    L80:
        if (i72.OXO1.II1Xi0() == true) goto L82;
    L87:
        return r0;
    L82:
        if (oe5.XIIIO(r7, GetWeatherRealtime.URL, true) == false) goto L84;
        return e44.IiI10X;
    L84:
        if (oe5.XIIIO(r7, GetWeatherForecast.URL, true) == false) goto L87;
        return e44.IiI10X;
    L72:
        if (oe5.XIIIO(r7, GetWeatherRealtime.URL, true) == true) goto L80;
        if (oe5.XIIIO(r7, GetWeatherForecast.URL, true) == true) goto L80;
        if (oe5.XIIIO(r7, GetNewDeviceListObject.URL, true) == false) goto L78;
    L17:
        if (oe5.XIIIO(r7, BleFirmwareVersionList.URL, true) == true) goto L68;
        if (oe5.XIIIO(r7, FirmwareVersionLatest.URL, true) == true) goto L68;
        if (oe5.XIIIO(r7, BleExtraPackVersionList.URL, true) == true) goto L68;
        if (oe5.XIIIO(r7, ExtraPackVersionLatest.URL, true) == true) goto L68;
        if (oe5.XIIIO(r7, BleExtraPackVersionLanguage.URL, true) == true) goto L68;
        if (oe5.XIIIO(r7, BleExtraPackVersionUi.URL, true) == true) goto L68;
        if (oe5.XIIIO(r7, BleExtraPackVersionFont.URL, true) == true) goto L68;
        if (oe5.XIIIO(r7, GetPayMacAddress.URL, true) == true) goto L68;
        if (oe5.XIIIO(r7, ChangeDeviceState.URL, true) == true) goto L68;
        if (oe5.XIIIO(r7, GetDeviceState.URL, true) == true) goto L68;
        if (oe5.XIIIO(r7, GetDeviceList.URL, true) == true) goto L68;
        if (oe5.XIIIO(r7, GetDeviceListObject.URL, true) == true) goto L68;
        if (oe5.XIIIO(r7, AigcCreateJob.URL, true) == true) goto L68;
        if (oe5.XIIIO(r7, AigcFindJob.URL, true) == true) goto L68;
        if (oe5.XIIIO(r7, GetDcsToken.INSTANCE.getURL(), true) == true) goto L68;
        if (oe5.XIIIO(r7, UploadDownloadInfo.URL, true) == true) goto L68;
        if (oe5.XIIIO(r7, GetGomoreAuthKey.URL, true) == true) goto L68;
        if (oe5.XIIIO(r7, AppVersionLatest.URL, true) == true) goto L68;
        if (oe5.XIIIO(r7, BleExtraPackVersionGPSFirmware.URL, true) == true) goto L68;
        if (oe5.XIIIO(r7, GetTeraBoxToken.URL, true) == true) goto L68;
        if (oe5.XIIIO(r7, GetInternalTeraBoxToken.URL, true) == true) goto L68;
        if (oe5.XIIIO(r7, GetTeraBoxTokenInfo.URL, true) == true) goto L68;
        if (oe5.XIIIO(r7, GetTeraBoxRefreshToken.URL, true) == true) goto L68;
        if (oe5.XIIIO(r7, GetInternalTeraBoxRefreshToken.URL, true) == true) goto L68;
        if (oe5.XIIIO(r7, AppStoreFileListSearch.URL, true) == true) goto L68;
        r2 = r6;
        goto L70
    }

    public final void download(@aa1 String r2, @aa1 String r3, @aa1 String r4, @aa1 HttpProgressCallback<String> r5) {
        Intrinsics.X0O(r2, "url");
        Intrinsics.X0O(r3, "path");
        Intrinsics.X0O(r4, Y5.c.b);
        Intrinsics.X0O(r5, "callback");
        NetWork.OXO1.XO0O10(r2, r3, r4, r5);
    }

    public final void downloadV2(@aa1 String r8, @aa1 Map<String, String> r9, @aa1 String r10, @aa1 String r11, @aa1 HttpProgressCallback<String> r12) {
        Intrinsics.X0O(r8, "url");
        Intrinsics.X0O(r9, "headers");
        Intrinsics.X0O(r10, "path");
        Intrinsics.X0O(r11, Y5.c.b);
        Intrinsics.X0O(r12, "callback");
        NetWork.OXO1.IiI10X(r8, r9, r10, r11, r12);
    }

    public final <T> void errorData(@tb1 String r2, @aa1 O1XIiIO<T> r3, @tb1 uq r4) {
        Intrinsics.X0O(r3, "callback");
        r3.handleError(String.valueOf(r2));
        if (r4 == null) goto L6;
        r4.dismiss();
        return;
    }

    public final void findAltitudeByLocation(final float r4, final float r5, @aa1 final O1XIiIO<Integer> r6) {
        Intrinsics.X0O(r6, "callback");
        AndroidNetworking.get("https://api.open-elevation.com/api/v1/lookup").addQueryParameter(OXO1.XXX11i(new Pair[]{TuplesKt.OXO1("locations", r5 + I000IiI1O.iO.XO0O10 + r4)})).setTag("findAltitudeByLocation").setPriority(Priority.HIGH).build().getAsJSONObject(new AnonymousClass1(r6, r5, r4));
    }

    public final void get(@aa1 String r2, @aa1 O1XIiIO<JSONObject> r3, int r4) {
        Intrinsics.X0O(r2, "url");
        Intrinsics.X0O(r3, "callback");
        NetWork.OXO1.I0IIOi(r2, r3, r4);
    }

    @aa1
    public final String getBaseUrl(@aa1 String r3) {
        Intrinsics.X0O(r3, "url");
        return convertBaseUrl(Api.INSTANCE.getBASE_URL(), r3) + r3;
    }

    @aa1
    public final Map<String, String> getHeadersMap() {
        Gson r0 = new Gson();
        BleCache r1 = BleCache.INSTANCE;
        String r7 = r1.getMBleName();
        String r8 = r1.getMFirmwareFlag();
        String r2 = BaseBleCache.getString$default(r1, BleKey.FIRMWARE_VERSION, null, null, 6, null);
        String r9 = AppUtils.getAppVersionName();
        Intrinsics.O10IXXX0X(r9, "getAppVersionName(...)");
        a01 r11 = a01.OXO1;
        SPUtils r3 = r11.IiI10X();
        Object r12 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r4 = new Gson().fromJson(r3.getString(AppUser.class.getName()), AppUser.class);
        if (r4 == null) goto L6;
        r12 = r4;
    L6:
        String r5 = r0.toJson(new BleInfo(((AppUser) r12).getIdentity(), r7, r8, RequestBodyKt.PROJECT_ID, r2, r9, oe5.IXO0OOi(r1.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null), 0));
        HashMap r6 = new HashMap();
        r6.put("accept-language", Utils.getApp().getResources().getConfiguration().locale.getLanguage());
        SPUtils r10 = r11.IiI10X();
        Object r14 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r13 = new Gson().fromJson(r10.getString(AppUser.class.getName()), AppUser.class);
        if (r13 == null) goto L10;
        r14 = r13;
    L10:
        r6.put("APP-UID", ((AppUser) r14).getIdentity());
        r6.put("BleInfo", r5);
        return r6;
    }

    public final <T> void getImage(@aa1 String r2, @aa1 File r3, @aa1 O1XIiIO<T> r4) {
        Intrinsics.X0O(r2, "url");
        Intrinsics.X0O(r3, "file");
        Intrinsics.X0O(r4, "callback");
        NetWork.OXO1.OIX0iXi(r2, r3, r4);
    }

    public final /* synthetic */ <T> void getNewApiWeather(String r20, Map<String, String> r21, O1XIiIO<T> r22, Activity r23, View r24, Map<String, String> r25) {
        Intrinsics.X0O(r20, "url");
        Intrinsics.X0O(r21, "body");
        Intrinsics.X0O(r22, "callback");
        Intrinsics.X0O(r25, "headers");
        uq r10 = loadPopup(r23, r24);
        String r11 = convertBaseUrl(Api.INSTANCE.getBASE_URL(), r20);
        i72 r12 = i72.OXO1;
        if (r12.II1Xi0() == true) goto L5;
        printParam(r11 + r20, OXO1.Ii0i(r21, r25));
        i1O0OXO1O.OXO1.OXO1(UploadInfoManager.OXO1.XO0O10() + " getNewApiWeather : enableNewWeatherApi = " + r12.II1Xi0());
        NetWork r2 = NetWork.OXO1;
        String r1 = r11 + r20;
        Intrinsics.XiOIii1();
        AnonymousClass3 r3 = new AnonymousClass3(r23, r22, r10);
        ANRequest r4 = AndroidNetworking.post(r1).addBodyParameter(r21).setTag(r1).setPriority(Priority.HIGH).build();
        Intrinsics.OX(4, "T");
        TypeToken<?> r5 = TypeToken.getParameterized(Response.class, new Type[]{Object.class});
        Intrinsics.XiOIii1();
        r4.getAsParsed(r5, new NetWorkUtils$getNewApiWeather$$inlined$post$1(r3));
        return;
    L5:
        if (oe5.XIIIO(r20, GetWeatherRealtime.URL, true) == false) goto L8;
        String r13 = GetWeatherRealtime.URL_V2;
    L11:
        Map<String, String> r14 = OXO1.X111IO(r21);
        if (r14.containsKey("lat") == false) goto L19;
        Type r17 = Object.class;
        String r18 = r14.get("lat");     // Catch: Exception -> L18
        Intrinsics.XXI(r18);     // Catch: Exception -> L18
        BigDecimal r15 = new BigDecimal(r18);     // Catch: Exception -> L18
        Type r19 = Response.class;
        r14.put("lat", r15.setScale(1, RoundingMode.DOWN).toString());     // Catch: Exception -> L29
    L21:
        if (r14.containsKey("lon") == false) goto L25;
        String r6 = r14.get("lon");     // Catch: Exception -> L29
        Intrinsics.XXI(r6);     // Catch: Exception -> L29
        r14.put("lon", new BigDecimal(r6).setScale(1, RoundingMode.DOWN).toString());     // Catch: Exception -> L29
    L25:
        Map<String, ? extends Object> r7 = OXO1.X111IO(r21);
        r7.putAll(r25);
        Unit r8 = Unit.OXO1;
        printParam(r11 + r20, r7);
        i1O0OXO1O.OXO1.OXO1(UploadInfoManager.OXO1.XO0O10() + " getNewApiWeather : enableNewWeatherApi = " + i72.OXO1.II1Xi0());
        NetWork r9 = NetWork.OXO1;
        String r16 = r11 + r13;
        Intrinsics.XiOIii1();
        AnonymousClass2 r26 = new AnonymousClass2(r23, r22, r10);
        ANRequest r27 = AndroidNetworking.get(r16).addQueryParameter(r14).setTag(r16).addHeaders(r25).setPriority(Priority.HIGH).build();
        Intrinsics.OX(4, "T");
        TypeToken<?> r28 = TypeToken.getParameterized(r19, new Type[]{r17});
        Intrinsics.XiOIii1();
        r27.getAsParsed(r28, new NetWorkUtils$getNewApiWeather$$inlined$getV2$1(r26));
        return;
    L18:
        r19 = Response.class;
        goto L25
    L19:
        r19 = Response.class;
        r17 = Object.class;
    L24:
        r19 = Response.class;
        r17 = Object.class;
        goto L25
    L8:
        if (oe5.XIIIO(r20, GetWeatherForecast.URL, true) == false) goto L10;
        r13 = GetWeatherForecast.URL_V2;
        goto L11
    L10:
        r13 = r20;
        goto L11
    }

    public final /* synthetic */ <T> void getV2(String r5, Map<String, String> r6, O1XIiIO<T> r7, Activity r8, View r9, Map<String, String> r10) {
        Intrinsics.X0O(r5, "url");
        Intrinsics.X0O(r6, "body");
        Intrinsics.X0O(r7, "callback");
        Intrinsics.X0O(r10, "headers");
        uq r11 = loadPopup(r8, r9);
        String r0 = convertBaseUrl(Api.INSTANCE.getBASE_URL(), r5);
        Map<String, ? extends Object> r2 = OXO1.X111IO(r6);
        r2.putAll(r10);
        Unit r3 = Unit.OXO1;
        printParam(r0 + r5, r2);
        NetWork r1 = NetWork.OXO1;
        String r12 = r0 + r5;
        Intrinsics.XiOIii1();
        C34222 r4 = new C34222(r8, r7, r11);
        ANRequest r13 = AndroidNetworking.get(r12).addQueryParameter(r6).setTag(r12).addHeaders(r10).setPriority(Priority.HIGH).build();
        Intrinsics.OX(4, "T");
        TypeToken<?> r14 = TypeToken.getParameterized(Response.class, new Type[]{Object.class});
        Intrinsics.XiOIii1();
        r13.getAsParsed(r14, new NetWorkUtils$getV2$$inlined$getV2$1(r4));
    }

    @tb1
    public final uq loadPopup(@tb1 Activity r2, @tb1 View r3) {
        if (r3 == null) goto L7;
        if (r2 == null) goto L8;
        uq r0 = new uq(r2);
        r0.I1XOi1(r3);
        return r0;
    L8:
        return null;
    L7:
        return null;
    }

    public final /* synthetic */ <T> void post(String r3, Map<String, String> r4, O1XIiIO<T> r5, Activity r6, View r7) {
        Intrinsics.X0O(r3, "url");
        Intrinsics.X0O(r4, "body");
        Intrinsics.X0O(r5, "callback");
        uq r8 = loadPopup(r6, r7);
        String r0 = convertBaseUrl(Api.INSTANCE.getBASE_URL(), r3);
        printParam(r0 + r3, r4);
        NetWork r1 = NetWork.OXO1;
        String r9 = r0 + r3;
        Intrinsics.XiOIii1();
        C34231 r2 = new C34231(r6, r5, r8);
        ANRequest r10 = AndroidNetworking.post(r9).addBodyParameter(r4).setTag(r9).setPriority(Priority.HIGH).build();
        Intrinsics.OX(4, "T");
        TypeToken<?> r11 = TypeToken.getParameterized(Response.class, new Type[]{Object.class});
        Intrinsics.XiOIii1();
        r10.getAsParsed(r11, new NetWorkUtils$post$$inlined$post$1(r2));
    }

    public final /* synthetic */ <T> void postHyky(String r4, Object r5, O1XIiIO<T> r6) {
        Intrinsics.X0O(r4, "url");
        Intrinsics.X0O(r5, "jsonBody");
        String r7 = HykyAPI.INSTANCE.getBASE_URL_HYKY() + r4;
        HykyManager.Companion r0 = HykyManager.Companion;
        ANRequest r8 = AndroidNetworking.post(r7).addHeaders("Authorization", r0.getInstance().getToken().getTokenType() + " " + r0.getInstance().getToken().getAccessToken()).addApplicationJsonBody(r5).setTag(r7).setPriority(Priority.HIGH).build();
        Intrinsics.OX(4, "T");
        TypeToken<?> r9 = TypeToken.getParameterized(HykyResponse.class, new Type[]{Object.class});
        Intrinsics.XiOIii1();
        r8.getAsParsed(r9, new C34241(r6));
    }

    public final /* synthetic */ <T> void postJson(String r6, Object r7, O1XIiIO<T> r8, Activity r9, View r10) {
        Intrinsics.X0O(r6, "url");
        Intrinsics.X0O(r7, "body");
        Intrinsics.X0O(r8, "callback");
        uq r11 = loadPopup(r9, r10);
        i1O0OXO1O r0 = i1O0OXO1O.OXO1;
        Api r1 = Api.INSTANCE;
        r0.OXO1("JSON Api.BASE_URL -> " + r1.getBASE_URL() + " , url = " + r6);
        String r2 = convertBaseUrl(r1.getBASE_URL(), r6);
        NetWork r3 = NetWork.OXO1;
        String r12 = r2 + r6;
        Intrinsics.XiOIii1();
        C34251 r4 = new C34251(r9, r8, r11);
        ANRequest r13 = AndroidNetworking.post(r12).addApplicationJsonBody(r7).setTag(r12).setPriority(Priority.HIGH).build();
        Intrinsics.OX(4, "T");
        TypeToken<?> r14 = TypeToken.getParameterized(Response.class, new Type[]{Object.class});
        Intrinsics.XiOIii1();
        r13.getAsParsed(r14, new NetWorkUtils$postJson$$inlined$postJson$1(r4));
    }

    public final <T> void postJsonExecute(@aa1 String r3, @aa1 Object r4, @aa1 O1XIiIO<T> r5) {
        Intrinsics.X0O(r3, "url");
        Intrinsics.X0O(r4, "body");
        Intrinsics.X0O(r5, "callback");
        NetWork r0 = NetWork.OXO1;
        String r6 = Api.INSTANCE.getBASE_URL() + r3;
        Object r7 = AndroidNetworking.post(r6).addApplicationJsonBody(r4).setTag(r6).setPriority(Priority.HIGH).build().executeForObject(Response.class).getResult();     // Catch: Exception -> L6
        if (r7 == null) goto L9;
        Response<T> r8 = (Response) r7;     // Catch: Exception -> L6
    L11:
        if (r8 != null) goto L13;
        r8 = new Response();
        r8.setCode(-1000);
    L13:
        responseWhenCheck(null, r8, r5);
        return;
    L9:
        throw new NullPointerException("null cannot be cast to non-null type com.sma.androidnetworklib.model.Response<T>");     // Catch: Exception -> L6
    L6:
        e = move-exception;
        e.printStackTrace();
        LogUtils.d(new Object[]{Unit.OXO1});
        r8 = null;
        goto L11
    }

    public final /* synthetic */ <T> void postJsonThirdParty(String r3, Object r4, O1XIiIO<T> r5, Activity r6, View r7, Map<String, String> r8) {
        Intrinsics.X0O(r3, "url");
        Intrinsics.X0O(r4, "body");
        Intrinsics.X0O(r5, "callback");
        Intrinsics.X0O(r8, "headers");
        uq r9 = loadPopup(r6, r7);
        printParam(r3, OXO1.Ii0i(OXO1.Ii0i(OXO1.I1(), r8), (Map) r4));
        NetWork r0 = NetWork.OXO1;
        Intrinsics.XiOIii1();
        C34261 r1 = new C34261(r6, r5, r9);
        ANRequest r10 = AndroidNetworking.post(r3).addHeaders(r8).addApplicationJsonBody(r4).setTag(r3).setPriority(Priority.HIGH).build();
        Intrinsics.OX(4, "T");
        TypeToken<?> r11 = TypeToken.getParameterized(Response.class, new Type[]{Object.class});
        Intrinsics.XiOIii1();
        r10.getAsParsed(r11, new NetWorkUtils$postJsonThirdParty$$inlined$postJsonV2$1(r1));
    }

    public final /* synthetic */ <T> void postJsonV2(String r5, Map<String, ? extends Object> r6, O1XIiIO<T> r7, Activity r8, View r9, Map<String, String> r10) {
        Intrinsics.X0O(r5, "url");
        Intrinsics.X0O(r6, "body");
        Intrinsics.X0O(r7, "callback");
        Intrinsics.X0O(r10, "headers");
        uq r11 = loadPopup(r8, r9);
        String r0 = convertBaseUrl(Api.INSTANCE.getBASE_URL(), r5);
        Map<String, ? extends Object> r2 = OXO1.X111IO(r6);
        r2.putAll(r10);
        Unit r3 = Unit.OXO1;
        printParam(r0 + r5, r2);
        NetWork r1 = NetWork.OXO1;
        String r12 = r0 + r5;
        Intrinsics.XiOIii1();
        C34272 r4 = new C34272(r8, r7, r11);
        ANRequest r13 = AndroidNetworking.post(r12).addHeaders(r10).addApplicationJsonBody(r6).setTag(r12).setPriority(Priority.HIGH).build();
        Intrinsics.OX(4, "T");
        TypeToken<?> r14 = TypeToken.getParameterized(Response.class, new Type[]{Object.class});
        Intrinsics.XiOIii1();
        r13.getAsParsed(r14, new NetWorkUtils$postJsonV2$$inlined$postJsonV2$1(r4));
    }

    public final /* synthetic */ <T> void postParameterThirdParty(String r2, Object r3, O1XIiIO<T> r4, Activity r5, View r6, Map<String, String> r7) {
        Intrinsics.X0O(r2, "url");
        Intrinsics.X0O(r3, "body");
        Intrinsics.X0O(r4, "callback");
        Intrinsics.X0O(r7, "headers");
        uq r8 = loadPopup(r5, r6);
        Map<String, String> r9 = (Map) r3;
        printParam(r2, OXO1.Ii0i(OXO1.Ii0i(OXO1.I1(), r7), r9));
        NetWork r0 = NetWork.OXO1;
        Intrinsics.XiOIii1();
        C34291 r1 = new C34291(r5, r4, r8);
        ANRequest r10 = AndroidNetworking.post(r2).addHeaders(r7).addBodyParameter(r9).setTag(r2).setPriority(Priority.HIGH).build();
        Intrinsics.OX(4, "T");
        TypeToken<?> r11 = TypeToken.getParameterized(Response.class, new Type[]{Object.class});
        Intrinsics.XiOIii1();
        r10.getAsParsed(r11, new NetWorkUtils$postParameterThirdParty$$inlined$postV2$1(r1));
    }

    public final void postRequest(@aa1 String r7, @tb1 final Function1<? super Boolean, Unit> r8) {
        Intrinsics.X0O(r7, "jsonString");
        LogUtils.i(new Object[]{"postStreamRequest jsonString -> " + r7});
        String r0 = convertBaseUrl(Api.INSTANCE.getBASE_URL(), "/baiduApi/uploadServiceCallLog");
        new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder r2 = new OkHttpClient().newBuilder();
        TimeUnit r3 = TimeUnit.SECONDS;
        r2.connectTimeout(60, r3).readTimeout(60, r3).writeTimeout(60, r3).build().newCall(new Request.Builder().url(r0 + "/baiduApi/uploadServiceCallLog").post(RequestBody.Companion.create(MediaType.Companion.parse(G5.L), r7)).build()).enqueue(new C34301(r8));
    }

    @aa1
    public final EventSource postStreamRequest(@aa1 String r5, @aa1 Map<String, String> r6, @aa1 Object r7, @aa1 final O1XIiIO<String> r8) {
        Intrinsics.X0O(r5, "url");
        Intrinsics.X0O(r6, "headers");
        Intrinsics.X0O(r7, "body");
        Intrinsics.X0O(r8, "callback");
        if (oe5.O0(r5, "http", false, 2, null) == true) goto L6;
        String r0 = convertBaseUrl(Api.INSTANCE.getBASE_URL(), r5);
        printParam(r0 + r5, OXO1.Ii0i(OXO1.I1(), r6));
        r5 = r0 + r5;
    L6:
        OkHttpClient.Builder r1 = new OkHttpClient().newBuilder();
        TimeUnit r2 = TimeUnit.SECONDS;
        EventSource.Factory r3 = EventSources.createFactory(r1.connectTimeout(60, r2).readTimeout(60, r2).writeTimeout(60, r2).build());
        Request.Builder r9 = new Request.Builder().url(r5).post(RequestBody.Companion.create(MediaType.Companion.parse(G5.L), r7.toString()));
        Iterator<Map.Entry<String, String>> r10 = r6.entrySet().iterator();
    L8:
        if (r10.hasNext() == false) goto L10;
        Map.Entry<String, String> r11 = r10.next();
        r9.addHeader(r11.getKey(), r11.getValue());
        goto L8
    L10:
        r9.addHeader("Accept", "*/*");
        return r3.newEventSource(r9.build(), new C34311(r8));
    }

    public final /* synthetic */ <T> void postV2(String r5, Map<String, ? extends Object> r6, O1XIiIO<T> r7, Activity r8, View r9, Map<String, String> r10) {
        Intrinsics.X0O(r5, "url");
        Intrinsics.X0O(r6, "body");
        Intrinsics.X0O(r7, "callback");
        Intrinsics.X0O(r10, "headers");
        uq r11 = loadPopup(r8, r9);
        String r0 = convertBaseUrl(Api.INSTANCE.getBASE_URL(), r5);
        Map<String, ? extends Object> r2 = OXO1.X111IO(r6);
        r2.putAll(r10);
        Unit r3 = Unit.OXO1;
        printParam(r0 + r5, r2);
        NetWork r1 = NetWork.OXO1;
        String r12 = r0 + r5;
        Intrinsics.XiOIii1();
        C34322 r4 = new C34322(r8, r7, r11);
        ANRequest r13 = AndroidNetworking.post(r12).addHeaders(r10).addBodyParameter(r6).setTag(r12).setPriority(Priority.HIGH).build();
        Intrinsics.OX(4, "T");
        TypeToken<?> r14 = TypeToken.getParameterized(Response.class, new Type[]{Object.class});
        Intrinsics.XiOIii1();
        r13.getAsParsed(r14, new NetWorkUtils$postV2$$inlined$postV2$1(r4));
    }

    public final /* synthetic */ <T> void postV3(String r10, Map<String, ? extends Object> r11, O1XIiIO<T> r12, AppCompatActivity r13, View r14, Map<String, String> r15) {
        Intrinsics.X0O(r10, "url");
        Intrinsics.X0O(r11, "body");
        Intrinsics.X0O(r12, "callback");
        Intrinsics.X0O(r13, "activity");
        Intrinsics.X0O(r15, "headers");
        WeakReference r6 = new WeakReference(r13);
        uq r2 = loadPopup(r13, r14);
        LifecycleCoroutineScope r16 = LifecycleOwnerKt.getLifecycleScope(r13);
        Intrinsics.XiOIii1();
        I100X1.O00(r16, null, null, new C34331(r2, r10, r11, r15, r6, r12, null), 3, null);
    }

    public final void printParam(@aa1 String r4, @aa1 Map<String, ? extends Object> r5) {
        Intrinsics.X0O(r4, "url");
        Intrinsics.X0O(r5, "body");
        StringBuffer r6 = new StringBuffer();
        r6.append(UtilsKt.X0i1O() + ": ");
        int r0 = r5.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L7;
        if (r1 <= 0) goto L6;
        r6.append(Typography.XO0O10);
    L6:
        r6.append((String) CollectionsKt___CollectionsKt.i0I0O111I(r5.keySet()).get(r1));
        r6.append('=');
        r6.append(CollectionsKt___CollectionsKt.i0I0O111I(r5.values()).get(r1));
        r1 = r1 + 1;
        goto L3
    L7:
        i1O0OXO1O.OXO1.OXO1("p -> " + r6);
    }

    public final /* synthetic */ <T> void responseData(Response<T> r3, Activity r4, O1XIiIO<T> r5, uq r6) {
        Intrinsics.X0O(r5, "callback");
        LogUtils.d(new Object[]{yn0.I0IIOi + r3});
        if (r3 != null) goto L5;
        r3 = new Response();
        r3.setCode(-1000);
    L5:
        responseWhenCheck(r4, r3, r5);
        if (r6 == null) goto L9;
        r6.dismiss();
        return;
    }

    public final <T> void responseWhenCheck(@tb1 Activity r4, @aa1 Response<T> r5, @aa1 O1XIiIO<T> r6) {
        Intrinsics.X0O(r5, Ne.n);
        Intrinsics.X0O(r6, "callback");
        if (r4 != null) goto L18;
        int r7 = r5.getCode();
        if (r7 == 0) goto L16;
        if (r7 == 1) goto L11;
        if (r7 == 2) goto L11;
        r6.handleError(r5.toString());
        return;
    L11:
        if (r5.getData() == null) goto L13;
        String r8 = String.valueOf(r5.getData());
    L14:
        r6.handleError(r8);
        return;
    L13:
        r8 = r5.getMesg();
        goto L14
    L16:
        r6.handleResponse(r5.getData());
        return;
    L18:
        int r2 = r5.getCode();
        if (r2 == 0) goto L59;
        if (r2 == 1) goto L54;
        if (r2 == 2) goto L54;
        if (r2 != 1001) goto L25;
        ToastUtils.showLong(R.string.parameter_check_failed);
        return;
    L25:
        if (r2 != 2010) goto L27;
    L49:
        ToastUtils.showLong(R.string.account_or_password_error);
        return;
    L27:
        if (r2 != 2012) goto L29;
        ToastUtils.showLong(R.string.wrong_password);
        return;
    L29:
        if (r2 != 4002) goto L31;
        ToastUtils.showLong(R.string.project_does_not_exist);
        return;
    L31:
        if (r2 == 4007) goto L43;
        switch(r2) {
            case 2001: goto L41;
            case 2002: goto L39;
            case 2003: goto L37;
            case 2004: goto L35;
            case 2005: goto L49;
            default: goto L33;
        };
    L33:
        ToastUtils.showLong(r5.getCode() + ", " + r4.getText(R.string.request_error), new Object[0]);
        r6.handleError(r5.toString());
        return;
    L35:
        ToastUtils.showLong(R.string.user_does_not_exist);
        return;
    L37:
        ToastUtils.showLong(R.string.user_already_exists);
        r6.handleError(r5.toString());
        return;
    L39:
        ToastUtils.showLong(R.string.verification_code_error);
        r6.handleError(r5.toString());
        return;
    L41:
        ToastUtils.showLong(R.string.code_limit);
        return;
    L43:
        ToastUtils.showLong(r5.getMesg(), new Object[0]);
        return;
    L54:
        if (r5.getData() == null) goto L56;
        String r9 = String.valueOf(r5.getData());
    L57:
        r6.handleError(r9);
        return;
    L56:
        r9 = r5.getMesg();
        goto L57
    L59:
        r6.handleResponse(r5.getData());
    }

    public final /* synthetic */ <T> void upload(String r3, String r4, File r5, Object r6, O1XIiIO<T> r7, Activity r8, View r9) {
        Intrinsics.X0O(r3, "url");
        Intrinsics.X0O(r4, "fileParameter");
        Intrinsics.X0O(r5, "file");
        Intrinsics.X0O(r6, "body");
        Intrinsics.X0O(r7, "callback");
        uq r10 = loadPopup(r8, r9);
        NetWork r0 = NetWork.OXO1;
        String r11 = Api.INSTANCE.getBASE_URL() + r3;
        Intrinsics.XiOIii1();
        C34341 r1 = new C34341(r8, r7, r10);
        ANRequest.MultiPartBuilder r12 = AndroidNetworking.upload(r11);
        if (r5.exists() == false) goto L5;
        r12.addMultipartFile(r4, r5);
    L5:
        ANRequest r13 = r12.addMultipartParameter(r6).setTag(r11).setPriority(Priority.HIGH).build().setUploadProgressListener(NetWorkUtils$upload$$inlined$upload$1.INSTANCE);
        Intrinsics.OX(4, "T");
        TypeToken<?> r14 = TypeToken.getParameterized(Response.class, new Type[]{Object.class});
        Intrinsics.XiOIii1();
        r13.getAsParsed(r14, new NetWorkUtils$upload$$inlined$upload$2(r1));
    }

    public static /* synthetic */ void get$default(NetWorkUtils r1, String r2, Map r3, O1XIiIO r4, Activity r5, View r6, int r7, Object r8) {
        if ((r7 & 8) == 0) goto L6;
        r5 = null;
    L6:
        if ((r7 & 16) == 0) goto L8;
        r6 = null;
    L8:
        Intrinsics.X0O(r2, "url");
        Intrinsics.X0O(r3, "body");
        Intrinsics.X0O(r4, "callback");
        uq r9 = r1.loadPopup(r5, r6);
        String r10 = r1.convertBaseUrl(Api.INSTANCE.getBASE_URL(), r2);
        r1.printParam(r10 + r2, r3);
        NetWork r11 = NetWork.OXO1;
        String r12 = r10 + r2;
        Intrinsics.XiOIii1();
        C34211 r13 = new C34211(r5, r4, r9);
        ANRequest r14 = AndroidNetworking.get(r12).addQueryParameter(r3).setTag(r12).setPriority(Priority.HIGH).build();
        Intrinsics.OX(4, "T");
        TypeToken<?> r15 = TypeToken.getParameterized(Response.class, new Type[]{Object.class});
        Intrinsics.XiOIii1();
        r14.getAsParsed(r15, new NetWorkUtils$get$$inlined$get$1(r13));
    }

    public final /* synthetic */ <T> void get(String r3, Map<String, String> r4, O1XIiIO<T> r5, Activity r6, View r7) {
        Intrinsics.X0O(r3, "url");
        Intrinsics.X0O(r4, "body");
        Intrinsics.X0O(r5, "callback");
        uq r8 = loadPopup(r6, r7);
        String r0 = convertBaseUrl(Api.INSTANCE.getBASE_URL(), r3);
        printParam(r0 + r3, r4);
        NetWork r1 = NetWork.OXO1;
        String r9 = r0 + r3;
        Intrinsics.XiOIii1();
        C34211 r2 = new C34211(r6, r5, r8);
        ANRequest r10 = AndroidNetworking.get(r9).addQueryParameter(r4).setTag(r9).setPriority(Priority.HIGH).build();
        Intrinsics.OX(4, "T");
        TypeToken<?> r11 = TypeToken.getParameterized(Response.class, new Type[]{Object.class});
        Intrinsics.XiOIii1();
        r10.getAsParsed(r11, new NetWorkUtils$get$$inlined$get$1(r2));
    }

    public final /* synthetic */ <T> void postJsonV2(String r3, Object r4, O1XIiIO<T> r5, Activity r6, View r7, Map<String, String> r8) {
        Intrinsics.X0O(r3, "url");
        Intrinsics.X0O(r4, "body");
        Intrinsics.X0O(r5, "callback");
        Intrinsics.X0O(r8, "headers");
        uq r9 = loadPopup(r6, r7);
        String r0 = convertBaseUrl(Api.INSTANCE.getBASE_URL(), r3);
        printParam(r0 + r3, r8);
        NetWork r1 = NetWork.OXO1;
        String r10 = r0 + r3;
        Intrinsics.XiOIii1();
        C34283 r2 = new C34283(r6, r5, r9);
        ANRequest r11 = AndroidNetworking.post(r10).addHeaders(r8).addApplicationJsonBody(r4).setTag(r10).setPriority(Priority.HIGH).build();
        Intrinsics.OX(4, "T");
        TypeToken<?> r12 = TypeToken.getParameterized(Response.class, new Type[]{Object.class});
        Intrinsics.XiOIii1();
        r11.getAsParsed(r12, new NetWorkUtils$postJsonV2$$inlined$postJsonV2$2(r2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void postJsonV2$default(NetWorkUtils r1, String r2, Object r3, O1XIiIO r4, Activity r5, View r6, Map r7, int r8, Object r9) {
        if ((r8 & 8) == 0) goto L6;
        r5 = null;
    L6:
        if ((r8 & 16) == 0) goto L9;
        r6 = null;
    L9:
        if ((r8 & 32) == 0) goto L11;
        r7 = r1.getHeadersMap();
    L11:
        Intrinsics.X0O(r2, "url");
        Intrinsics.X0O(r3, "body");
        Intrinsics.X0O(r4, "callback");
        Intrinsics.X0O(r7, "headers");
        uq r10 = r1.loadPopup(r5, r6);
        String r11 = r1.convertBaseUrl(Api.INSTANCE.getBASE_URL(), r2);
        r1.printParam(r11 + r2, r7);
        NetWork r12 = NetWork.OXO1;
        String r13 = r11 + r2;
        Intrinsics.XiOIii1();
        C34283 r14 = new C34283(r5, r4, r10);
        ANRequest r15 = AndroidNetworking.post(r13).addHeaders(r7).addApplicationJsonBody(r3).setTag(r13).setPriority(Priority.HIGH).build();
        Intrinsics.OX(4, "T");
        TypeToken<?> r16 = TypeToken.getParameterized(Response.class, new Type[]{Object.class});
        Intrinsics.XiOIii1();
        r15.getAsParsed(r16, new NetWorkUtils$postJsonV2$$inlined$postJsonV2$2(r14));
    }
}
