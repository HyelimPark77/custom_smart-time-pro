package com.sma.smartv3.biz;

import androidx.appcompat.app.AppCompatActivity;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.yn0;
import com.blankj.utilcode.util.GsonUtils;
import com.blankj.utilcode.util.LogUtils;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.model.OnlineWatchFaceV2;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.NetWorkUtils;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.Request;
import okhttp3.ResponseBody;

/* JADX INFO: renamed from: com.sma.smartv3.biz.WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1 */
/* JADX INFO: loaded from: classes18.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.network.NetWorkUtils$postV3$1", m39466f = "NetWorkUtils.kt", m39467i = {}, m39468l = {207}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
@SourceDebugExtension({"SMAP\nNetWorkUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$postV3$1\n*L\n1#1,925:1\n*E\n"})
public final class C15447x22973144 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ Map $body;
    final /* synthetic */ O1XIiIO $callback;
    final /* synthetic */ Map $headers;
    final /* synthetic */ C3006uq $progressRef;
    final /* synthetic */ String $url;
    final /* synthetic */ WeakReference $weakActivity;
    int label;

    /* JADX INFO: renamed from: com.sma.smartv3.biz.WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1$1 */
    @DebugMetadata(m39465c = "com.sma.smartv3.network.NetWorkUtils$postV3$1$1", m39466f = "NetWorkUtils.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    @SourceDebugExtension({"SMAP\nNetWorkUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$postV3$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,925:1\n1#2:926\n315#3,2:927\n317#3,8:930\n325#3,13:939\n352#3:952\n216#4:929\n217#4:938\n*S KotlinDebug\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$postV3$1$1\n*L\n210#1:927,2\n210#1:930,8\n210#1:939,13\n210#1:952\n210#1:929\n210#1:938\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        final /* synthetic */ Map $body;
        final /* synthetic */ O1XIiIO $callback;
        final /* synthetic */ Map $headers;
        final /* synthetic */ String $url;
        final /* synthetic */ WeakReference $weakActivity;
        int label;

        /* JADX INFO: renamed from: com.sma.smartv3.biz.WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1$1$OXO1 */
        @SourceDebugExtension({"SMAP\nNetWork.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork$postV3$3\n*L\n1#1,511:1\n*E\n"})
        public static final class OXO1 implements Callback {
            public final /* synthetic */ O1XIiIO OXO1;

            /* JADX INFO: renamed from: com.sma.smartv3.biz.WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1$1$OXO1$OXO1 */
            @SourceDebugExtension({"SMAP\nNetWork.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork$postV3$3$onResponse$result$1\n*L\n1#1,345:1\n*E\n"})
            public static final class C22037OXO1 extends TypeToken<Response<OnlineWatchFaceV2[]>> {
            }

            public OXO1(O1XIiIO o1XIiIO) {
                this.OXO1 = o1XIiIO;
            }

            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException e) {
                Intrinsics.X0O(call, "call");
                Intrinsics.X0O(e, "e");
                e.printStackTrace();
                this.OXO1.handleError(String.valueOf(e.getMessage()));
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, okhttp3.Response response) {
                Intrinsics.X0O(call, "call");
                Intrinsics.X0O(response, "response");
                try {
                    ResponseBody responseBodyBody = response.body();
                    this.OXO1.handleResponse((Response) GsonUtils.fromJson(responseBodyBody != null ? responseBodyBody.string() : null, new C22037OXO1().getType()));
                } catch (Exception e) {
                    this.OXO1.handleError(String.valueOf(e.getMessage()));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Map map, Map map2, WeakReference weakReference, O1XIiIO o1XIiIO, Continuation continuation) {
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
            Map<String, ? extends Object> mapX111IO = kotlin.collections.OXO1.X111IO(this.$body);
            mapX111IO.putAll(this.$headers);
            netWorkUtils.printParam(str, mapX111IO);
            NetWork netWork = NetWork.OXO1;
            String str2 = strConvertBaseUrl + this.$url;
            Map map = this.$headers;
            Map map2 = this.$body;
            final WeakReference weakReference = this.$weakActivity;
            final O1XIiIO o1XIiIO = this.$callback;
            O1XIiIO<Response<OnlineWatchFaceV2[]>> o1XIiIO2 = new O1XIiIO<Response<OnlineWatchFaceV2[]>>() { // from class: com.sma.smartv3.biz.WatchFaceManager$getOnLineWatchFaceList$.inlined.postV3.default.1.1.1

                /* JADX INFO: renamed from: com.sma.smartv3.biz.WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1$1$1$OXO1 */
                @SourceDebugExtension({"SMAP\nNetWorkUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$postV3$1$1$2$handleResponse$1$1\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,925:1\n552#2,8:926\n561#2,5:935\n1#3:934\n*S KotlinDebug\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$postV3$1$1$2$handleResponse$1$1\n*L\n215#1:926,8\n215#1:935,5\n215#1:934\n*E\n"})
                public static final class OXO1 implements Runnable {

                    /* JADX INFO: renamed from: I1 */
                    public final /* synthetic */ Response f50918I1;

                    /* JADX INFO: renamed from: IO */
                    public final /* synthetic */ AppCompatActivity f50919IO;
                    public final /* synthetic */ O1XIiIO iX1O1;

                    public OXO1(AppCompatActivity appCompatActivity, Response response, O1XIiIO o1XIiIO) {
                        this.f50919IO = appCompatActivity;
                        this.f50918I1 = response;
                        this.iX1O1 = o1XIiIO;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        if (this.f50919IO.isFinishing() || this.f50919IO.isDestroyed()) {
                            return;
                        }
                        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
                        Response response = this.f50918I1;
                        AppCompatActivity appCompatActivity = this.f50919IO;
                        O1XIiIO o1XIiIO = this.iX1O1;
                        LogUtils.m11128d(yn0.I0IIOi + response);
                        if (response == null) {
                            response = new Response();
                            response.setCode(-1000);
                        }
                        netWorkUtils.responseWhenCheck(appCompatActivity, response, o1XIiIO);
                    }
                }

                /* JADX INFO: renamed from: com.sma.smartv3.biz.WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1$1$1$XIi00iiXO */
                @SourceDebugExtension({"SMAP\nNetWorkUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$postV3$1$1$2$handleError$1$1\n*L\n1#1,224:1\n*E\n"})
                public static final class XIi00iiXO implements Runnable {

                    /* JADX INFO: renamed from: I1 */
                    public final /* synthetic */ String f50920I1;

                    /* JADX INFO: renamed from: IO */
                    public final /* synthetic */ AppCompatActivity f50921IO;
                    public final /* synthetic */ O1XIiIO iX1O1;

                    public XIi00iiXO(AppCompatActivity appCompatActivity, String str, O1XIiIO o1XIiIO) {
                        this.f50921IO = appCompatActivity;
                        this.f50920I1 = str;
                        this.iX1O1 = o1XIiIO;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        if (this.f50921IO.isFinishing() || this.f50921IO.isDestroyed()) {
                            return;
                        }
                        NetWorkUtils.INSTANCE.errorData(this.f50920I1, this.iX1O1, null);
                    }
                }

                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                public void handleResponse(Response<OnlineWatchFaceV2[]> response) {
                    AppCompatActivity appCompatActivity = (AppCompatActivity) weakReference.get();
                    if (appCompatActivity != null) {
                        appCompatActivity.runOnUiThread(new OXO1(appCompatActivity, response, o1XIiIO));
                    }
                }

                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                public void handleError(String error) {
                    Intrinsics.X0O(error, "error");
                    AppCompatActivity appCompatActivity = (AppCompatActivity) weakReference.get();
                    if (appCompatActivity != null) {
                        appCompatActivity.runOnUiThread(new XIi00iiXO(appCompatActivity, error, o1XIiIO));
                    }
                }
            };
            FormBody.Builder builder = new FormBody.Builder(null, 1, null);
            for (Map.Entry entry : map2.entrySet()) {
                String str3 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    string = (String) value;
                } else if (value instanceof Boolean) {
                    string = String.valueOf(((Boolean) value).booleanValue()).toLowerCase(Locale.ROOT);
                    Intrinsics.O10IXXX0X(string, "toLowerCase(...)");
                } else {
                    string = value instanceof Number ? value.toString() : value.toString();
                }
                builder.add(str3, string);
            }
            Request.Builder builderPost = new Request.Builder().url(str2).post(builder.build());
            for (Map.Entry entry2 : map.entrySet()) {
                builderPost.addHeader((String) entry2.getKey(), (String) entry2.getValue());
            }
            com.sma.androidnetworklib.OXO1.OXO1.OXO1().newCall(builderPost.build()).enqueue(new OXO1(o1XIiIO2));
            return Unit.OXO1;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15447x22973144(C3006uq c3006uq, String str, Map map, Map map2, WeakReference weakReference, O1XIiIO o1XIiIO, Continuation continuation) {
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
        return new C15447x22973144(this.$progressRef, this.$url, this.$body, this.$headers, this.$weakActivity, this.$callback, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((C15447x22973144) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objI0iXXO = C2798pb.I0iXXO();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.X1ii(obj);
                CoroutineDispatcher coroutineDispatcherM712iO = IXOX0Xiii.m712iO();
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
