package com.sma.smartv3.util.tts;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.jl5;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p617io.ByteStreamsKt;
import kotlin.p617io.CloseableKt;
import kotlinx.coroutines.OIX0iXi;
import kotlinx.coroutines.XIi00iiXO;
import kotlinx.coroutines.XiOIO;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nServerTTSStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServerTTSStrategy.kt\ncom/sma/smartv3/util/tts/ServerTTSStrategy\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n310#2,9:91\n319#2,2:101\n1#3:100\n*S KotlinDebug\n*F\n+ 1 ServerTTSStrategy.kt\ncom/sma/smartv3/util/tts/ServerTTSStrategy\n*L\n56#1:91,9\n56#1:101,2\n*E\n"})
public final class ServerTTSStrategy implements jl5 {

    @aa1
    public final String OXO1 = "ServerTTSStrategy";

    @aa1
    public final String XIi00iiXO = "ServerTTSStrategy requestText2Audio";

    /* JADX INFO: renamed from: iO */
    @tb1
    public OIX0iXi<String> f54939iO;

    public static final class OXO1 implements Function1<Throwable, Unit> {
        public OXO1() {
        }

        public final void OXO1(Throwable th) {
            AndroidNetworking.cancel(ServerTTSStrategy.this.XIi00iiXO);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(Throwable th) {
            OXO1(th);
            return Unit.OXO1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object O00(TTSData tTSData, Continuation<? super Result<String>> continuation) {
        ServerTTSStrategy$requestTextToAudio$1 serverTTSStrategy$requestTextToAudio$1;
        if (continuation instanceof ServerTTSStrategy$requestTextToAudio$1) {
            serverTTSStrategy$requestTextToAudio$1 = (ServerTTSStrategy$requestTextToAudio$1) continuation;
            int i = serverTTSStrategy$requestTextToAudio$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                serverTTSStrategy$requestTextToAudio$1.label = i - Integer.MIN_VALUE;
            } else {
                serverTTSStrategy$requestTextToAudio$1 = new ServerTTSStrategy$requestTextToAudio$1(this, continuation);
            }
        } else {
            serverTTSStrategy$requestTextToAudio$1 = new ServerTTSStrategy$requestTextToAudio$1(this, continuation);
        }
        Object objOII = serverTTSStrategy$requestTextToAudio$1.result;
        Object objI0iXXO = C2798pb.I0iXXO();
        int i2 = serverTTSStrategy$requestTextToAudio$1.label;
        if (i2 == 0) {
            ResultKt.X1ii(objOII);
            serverTTSStrategy$requestTextToAudio$1.L$0 = tTSData;
            serverTTSStrategy$requestTextToAudio$1.I$0 = 0;
            serverTTSStrategy$requestTextToAudio$1.label = 1;
            XIi00iiXO xIi00iiXO = new XIi00iiXO(IntrinsicsKt__IntrinsicsJvmKt.O00(serverTTSStrategy$requestTextToAudio$1), 1);
            xIi00iiXO.XXX11i();
            File file = new File(uz0.I0iXXO(sz0.OXO1), "ai_tts_" + System.currentTimeMillis() + ".mp3");
            ANResponse aNResponseExecuteForOkHttpResponse = AndroidNetworking.get(NetWorkUtils.INSTANCE.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetAITextToAudio.URL) + GetAITextToAudio.URL).addQueryParameter("text", tTSData.XOO0ii0()).addQueryParameter("model", tTSData.IiI10X()).setPriority(Priority.LOW).setTag((Object) this.XIi00iiXO).build().executeForOkHttpResponse();
            try {
                Response okHttpResponse = aNResponseExecuteForOkHttpResponse.getOkHttpResponse();
                if (okHttpResponse != null) {
                    okHttpResponse.headers();
                }
                Response okHttpResponse2 = aNResponseExecuteForOkHttpResponse.getOkHttpResponse();
                Integer numIiI10X = okHttpResponse2 != null ? Boxing.IiI10X(okHttpResponse2.code()) : null;
                Response okHttpResponse3 = aNResponseExecuteForOkHttpResponse.getOkHttpResponse();
                ResponseBody responseBodyBody = okHttpResponse3 != null ? okHttpResponse3.body() : null;
                InputStream inputStreamByteStream = responseBodyBody != null ? responseBodyBody.byteStream() : null;
                if (numIiI10X == null || numIiI10X.intValue() != 200 || inputStreamByteStream == null) {
                    Result.Companion companion = Result.Companion;
                    xIi00iiXO.resumeWith(Result.m48333constructorimpl(Result.m48332boximpl(Result.m48333constructorimpl(ResultKt.OXO1(new IOException("Empty Response"))))));
                } else {
                    try {
                        byte[] bArrX0O = ByteStreamsKt.X0O(inputStreamByteStream);
                        CloseableKt.OXO1(inputStreamByteStream, null);
                        FileIOUtils.writeFileFromBytesByStream(file, bArrX0O);
                        Result.Companion companion2 = Result.Companion;
                        xIi00iiXO.resumeWith(Result.m48333constructorimpl(Result.m48332boximpl(Result.m48333constructorimpl(file.getPath()))));
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            CloseableKt.OXO1(inputStreamByteStream, th);
                            throw th2;
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                Result.Companion companion3 = Result.Companion;
                xIi00iiXO.resumeWith(Result.m48333constructorimpl(Result.m48332boximpl(Result.m48333constructorimpl(ResultKt.OXO1(e)))));
            }
            xIi00iiXO.mo634iX(new OXO1());
            objOII = xIi00iiXO.OII();
            if (objOII == C2798pb.I0iXXO()) {
                DebugProbesKt.m39475iO(serverTTSStrategy$requestTextToAudio$1);
            }
            if (objOII == objI0iXXO) {
                return objI0iXXO;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(objOII);
        }
        return ((Result) objOII).m48342unboximpl();
    }

    @Override // com.android.mltcode.paycertificationapi.jl5
    @tb1
    public Object OXO1(@aa1 TTSData tTSData, @aa1 i00OIXiO i00oixio, @aa1 Continuation<? super String> continuation) {
        return I100X1.I0IIOi(IXOX0Xiii.m712iO(), new ServerTTSStrategy$execute$2(this, tTSData, null), continuation);
    }

    @Override // com.android.mltcode.paycertificationapi.jl5
    public void cancel() {
        OIX0iXi<String> oIX0iXi = this.f54939iO;
        if (oIX0iXi != null) {
            XiOIO.OXO1.XIi00iiXO(oIX0iXi, null, 1, null);
        }
    }
}
