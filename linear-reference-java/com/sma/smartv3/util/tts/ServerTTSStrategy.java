package com.sma.smartv3.util.tts;

import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.jl5;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.ANResponse;
import com.androidnetworking.common.Priority;
import com.blankj.utilcode.util.FileIOUtils;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.GetAITextToAudio;
import com.sma.smartv3.network.NetWorkUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.OIX0iXi;
import kotlinx.coroutines.XIi00iiXO;
import kotlinx.coroutines.XiOIO;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nServerTTSStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServerTTSStrategy.kt\ncom/sma/smartv3/util/tts/ServerTTSStrategy\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n310#2,9:91\n319#2,2:101\n1#3:100\n*S KotlinDebug\n*F\n+ 1 ServerTTSStrategy.kt\ncom/sma/smartv3/util/tts/ServerTTSStrategy\n*L\n56#1:91,9\n56#1:101,2\n*E\n"})
public final class ServerTTSStrategy implements jl5 {

    @aa1
    public final String OXO1;

    @aa1
    public final String XIi00iiXO;

    @tb1
    public OIX0iXi<String> iO;

    public static final class OXO1 implements Function1<Throwable, Unit> {
        public final /* synthetic */ ServerTTSStrategy IO;

        public OXO1(ServerTTSStrategy r1) {
            this.IO = r1;
        }

        public final void OXO1(Throwable r1) {
            AndroidNetworking.cancel(ServerTTSStrategy.XIi00iiXO(this.IO));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable r1) {
            OXO1(r1);
            return Unit.OXO1;
        }
    }

    public ServerTTSStrategy() {
        this.OXO1 = "ServerTTSStrategy";
        this.XIi00iiXO = "ServerTTSStrategy requestText2Audio";
    }

    public static final /* synthetic */ String XIi00iiXO(ServerTTSStrategy r0) {
        return r0.XIi00iiXO;
    }

    public static final /* synthetic */ Object XO0O10(ServerTTSStrategy r0, TTSData r1, Continuation r2) {
        return r0.O00(r1, r2);
    }

    public static final /* synthetic */ String iO(ServerTTSStrategy r0) {
        return r0.OXO1;
    }

    public final Object O00(TTSData r9, Continuation<? super Result<String>> r10) {
        if ((r10 instanceof ServerTTSStrategy$requestTextToAudio$1) == false) goto L7;
        ServerTTSStrategy$requestTextToAudio$1 r0 = (ServerTTSStrategy$requestTextToAudio$1) r10;
        int r1 = r0.label;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.label = r1 - Integer.MIN_VALUE;
    L8:
        Object r11 = r0.result;
        Object r2 = pb.I0iXXO();
        int r3 = r0.label;
        if (r3 == 0) goto L14;
        if (r3 != 1) goto L13;
        TTSData r12 = (TTSData) r0.L$0;
        ResultKt.X1ii(r11);
    L54:
        return ((Result) r11).m6983unboximpl();
    L13:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L14:
        ResultKt.X1ii(r11);
        r0.L$0 = r9;
        r0.I$0 = 0;
        r0.label = 1;
        XIi00iiXO r13 = new XIi00iiXO(IntrinsicsKt__IntrinsicsJvmKt.O00(r0), 1);
        r13.XXX11i();
        File r4 = new File(uz0.I0iXXO(sz0.OXO1), "ai_tts_" + System.currentTimeMillis() + ".mp3");
        ANResponse r14 = AndroidNetworking.get(NetWorkUtils.INSTANCE.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetAITextToAudio.URL) + GetAITextToAudio.URL).addQueryParameter("text", r9.XOO0ii0()).addQueryParameter("model", r9.IiI10X()).setPriority(Priority.LOW).setTag(XIi00iiXO(this)).build().executeForOkHttpResponse();
        Response r5 = r14.getOkHttpResponse();     // Catch: Exception -> L18
        if (r5 == null) goto L20;
        r5.headers();     // Catch: Exception -> L18
    L20:
        Response r6 = r14.getOkHttpResponse();     // Catch: Exception -> L18
        if (r6 == null) goto L23;
        Integer r7 = Boxing.IiI10X(r6.code());     // Catch: Exception -> L18
    L24:
        Response r15 = r14.getOkHttpResponse();     // Catch: Exception -> L18
        if (r15 == null) goto L27;
        ResponseBody r16 = r15.body();     // Catch: Exception -> L18
    L28:
        if (r16 == null) goto L30;
        InputStream r17 = r16.byteStream();     // Catch: Exception -> L18
    L31:
        if (r7 != null) goto L35;
    L45:
        Result.Companion r18 = Result.Companion;     // Catch: Exception -> L18
        r13.resumeWith(Result.m6974constructorimpl(Result.m6973boximpl(Result.m6974constructorimpl(ResultKt.OXO1(new IOException("Empty Response"))))));     // Catch: Exception -> L18
    L48:
        r13.iX(new OXO1(this));
        r11 = r13.OII();
        if (r11 != pb.I0iXXO()) goto L51;
        DebugProbesKt.iO(r0);
    L51:
        if (r11 != r2) goto L54;
        return r2;
    L35:
        if (r7.intValue() != 200) goto L45;
        if (r17 == null) goto L45;
        byte[] r8 = ByteStreamsKt.X0O(r17);     // Catch: Throwable -> L40
        CloseableKt.OXO1(r17, null);     // Catch: Exception -> L18
        FileIOUtils.writeFileFromBytesByStream(r4, r8);     // Catch: Exception -> L18
        Result.Companion r19 = Result.Companion;     // Catch: Exception -> L18
        r13.resumeWith(Result.m6974constructorimpl(Result.m6973boximpl(Result.m6974constructorimpl(r4.getPath()))));     // Catch: Exception -> L18
        goto L48
    L40:
        th = move-exception;
        throw th;     // Catch: Throwable -> L42
    L42:
        th = move-exception;
        CloseableKt.OXO1(r17, th);     // Catch: Exception -> L18
        throw th;     // Catch: Exception -> L18
    L30:
        r17 = null;
        goto L31
    L27:
        r16 = null;
        goto L28
    L23:
        r7 = null;
    L18:
        e = move-exception;
        e.printStackTrace();
        Result.Companion r20 = Result.Companion;
        r13.resumeWith(Result.m6974constructorimpl(Result.m6973boximpl(Result.m6974constructorimpl(ResultKt.OXO1(e)))));
    L7:
        r0 = new ServerTTSStrategy$requestTextToAudio$1(this, r10);
        goto L8
    }

    @Override // com.android.mltcode.paycertificationapi.jl5
    @tb1
    public Object OXO1(@aa1 TTSData r3, @aa1 i00OIXiO r4, @aa1 Continuation<? super String> r5) {
        return I100X1.I0IIOi(IXOX0Xiii.iO(), new ServerTTSStrategy$execute$2(this, r3, null), r5);
    }

    @Override // com.android.mltcode.paycertificationapi.jl5
    public void cancel() {
        OIX0iXi<String> r0 = this.iO;
        if (r0 == null) goto L6;
        XiOIO.OXO1.XIi00iiXO(r0, null, 1, null);
        return;
    }
}
