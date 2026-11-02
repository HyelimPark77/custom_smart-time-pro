package com.sma.smartv3.biz;

import androidx.core.app.NotificationCompat;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.uq;
import com.blankj.utilcode.util.GsonUtils;
import com.google.gson.reflect.TypeToken;
import com.ironsource.Ne;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.model.OnlineWatchFaceV2;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.NetWorkUtils;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Iterator;
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

/* JADX INFO: loaded from: classes18.dex */
@DebugMetadata(c = "com.sma.smartv3.network.NetWorkUtils$postV3$1", f = "NetWorkUtils.kt", i = {}, l = {207}, m = "invokeSuspend", n = {}, s = {}, v = 1)
@SourceDebugExtension({"SMAP\nNetWorkUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$postV3$1\n*L\n1#1,925:1\n*E\n"})
public final class WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ Map $body;
    final /* synthetic */ O1XIiIO $callback;
    final /* synthetic */ Map $headers;
    final /* synthetic */ uq $progressRef;
    final /* synthetic */ String $url;
    final /* synthetic */ WeakReference $weakActivity;
    int label;

    /* JADX INFO: renamed from: com.sma.smartv3.biz.WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1$1, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.network.NetWorkUtils$postV3$1$1", f = "NetWorkUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
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

            /* JADX INFO: renamed from: com.sma.smartv3.biz.WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1$1$OXO1$OXO1, reason: collision with other inner class name */
            @SourceDebugExtension({"SMAP\nNetWork.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork$postV3$3$onResponse$result$1\n*L\n1#1,345:1\n*E\n"})
            public static final class C0555OXO1 extends TypeToken<Response<OnlineWatchFaceV2[]>> {
                public C0555OXO1() {
                }
            }

            public OXO1(O1XIiIO r1) {
                this.OXO1 = r1;
            }

            @Override // okhttp3.Callback
            public void onFailure(Call r2, IOException r3) {
                Intrinsics.X0O(r2, NotificationCompat.CATEGORY_CALL);
                Intrinsics.X0O(r3, "e");
                r3.printStackTrace();
                handleError(String.valueOf(r3.getMessage()));
            }

            @Override // okhttp3.Callback
            public void onResponse(Call r2, okhttp3.Response r3) {
                Intrinsics.X0O(r2, NotificationCompat.CATEGORY_CALL);
                Intrinsics.X0O(r3, Ne.n);
                ResponseBody r4 = r3.body();     // Catch: Exception -> L6
                if (r4 == null) goto L8;
                String r5 = r4.string();     // Catch: Exception -> L6
            L9:
                Response r6 = (Response) GsonUtils.fromJson(r5, new C0555OXO1().getType());     // Catch: Exception -> L6
                handleResponse(r6);     // Catch: Exception -> L6
                return;
            L8:
                r5 = null;
            L6:
                e = move-exception;
                handleError(String.valueOf(e.getMessage()));
            }
        }

        public AnonymousClass1(String r1, Map r2, Map r3, WeakReference r4, O1XIiIO r5, Continuation r6) {
            this.$url = r1;
            this.$body = r2;
            this.$headers = r3;
            this.$weakActivity = r4;
            this.$callback = r5;
            super(2, r6);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r8, Continuation<?> r9) {
            return new AnonymousClass1(this.$url, this.$body, this.$headers, this.$weakActivity, this.$callback, r9);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((AnonymousClass1) create(r1, r2)).invokeSuspend(Unit.OXO1);
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
            Map<String, ? extends Object> r2 = kotlin.collections.OXO1.X111IO(this.$body);
            r2.putAll(this.$headers);
            r9.printParam(r1, r2);
            NetWork r10 = NetWork.OXO1;
            String r11 = r0 + this.$url;
            Map r3 = this.$headers;
            Map r4 = this.$body;
            final WeakReference r5 = this.$weakActivity;
            final O1XIiIO r6 = this.$callback;
            O1XIiIO<Response<OnlineWatchFaceV2[]>> r7 = new C05541(r5, r6);
            FormBody.Builder r12 = new FormBody.Builder(null, 1, 0 == true ? 1 : 0);
            Iterator r13 = r4.entrySet().iterator();
        L6:
            if (r13.hasNext() == false) goto L18;
            Map.Entry r14 = (Map.Entry) r13.next();
            String r15 = (String) r14.getKey();
            Object r16 = r14.getValue();
            if ((r16 instanceof String) == false) goto L11;
            String r17 = (String) r16;
        L17:
            r12.add(r15, r17);
            goto L6
        L11:
            if ((r16 instanceof Boolean) == false) goto L14;
            r17 = String.valueOf(((Boolean) r16).booleanValue()).toLowerCase(Locale.ROOT);
            Intrinsics.O10IXXX0X(r17, "toLowerCase(...)");
            goto L17
        L14:
            if ((r16 instanceof Number) == false) goto L16;
            r17 = r16.toString();
            goto L17
        L16:
            r17 = r16.toString();
            goto L17
        L18:
            Request.Builder r18 = new Request.Builder().url(r11).post(r12.build());
            Iterator r19 = r3.entrySet().iterator();
        L20:
            if (r19.hasNext() == false) goto L22;
            Map.Entry r20 = (Map.Entry) r19.next();
            r18.addHeader((String) r20.getKey(), (String) r20.getValue());
            goto L20
        L22:
            com.sma.androidnetworklib.OXO1.OXO1.OXO1().newCall(r18.build()).enqueue(new OXO1(r7));
            return Unit.OXO1;
        L25:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    public WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1(uq r1, String r2, Map r3, Map r4, WeakReference r5, O1XIiIO r6, Continuation r7) {
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
        return new WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1(this.$progressRef, this.$url, this.$body, this.$headers, this.$weakActivity, this.$callback, r10);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((WatchFaceManager$getOnLineWatchFaceList$$inlined$postV3$default$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
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
        AnonymousClass1 r3 = new AnonymousClass1(this.$url, this.$body, this.$headers, this.$weakActivity, this.$callback, null);     // Catch: Throwable -> L7
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
