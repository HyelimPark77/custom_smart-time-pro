package com.sma.smartv3.util;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1000;
import com.android.mltcode.paycertificationapi.iIX01Oi;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.uz0;
import com.blankj.utilcode.util.FileIOUtils;
import java.io.File;
import java.io.InputStream;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p617io.ByteStreamsKt;
import kotlin.p617io.CloseableKt;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.util.NetUtil$text2Audio$2", m39466f = "NetUtil.kt", m39467i = {0}, m39468l = {138}, m39469m = "invokeSuspend", m39470n = {"file"}, m39472s = {"L$0"}, m39473v = 1)
@SourceDebugExtension({"SMAP\nNetUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetUtil.kt\ncom/sma/smartv3/util/NetUtil$text2Audio$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,164:1\n1#2:165\n*E\n"})
public final class NetUtil$text2Audio$2 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super String>, Object> {
    final /* synthetic */ String $model;
    final /* synthetic */ String $text;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetUtil$text2Audio$2(String str, String str2, Continuation<? super NetUtil$text2Audio$2> continuation) {
        super(2, continuation);
        this.$model = str;
        this.$text = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NetUtil$text2Audio$2(this.$model, this.$text, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super String> continuation) {
        return ((NetUtil$text2Audio$2) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        File file;
        Object objI0iXXO = C2798pb.I0iXXO();
        int i = this.label;
        if (i == 0) {
            ResultKt.X1ii(obj);
            File file2 = new File(uz0.I0iXXO(sz0.OXO1), "ai_tts_" + System.currentTimeMillis() + ".mp3");
            iIX01Oi iix01oiXOO0ii0 = i1000.OXO1.XOO0ii0();
            String str = this.$model;
            String str2 = this.$text;
            this.L$0 = file2;
            this.label = 1;
            Object objIiI10X = iix01oiXOO0ii0.IiI10X(str, str2, this);
            if (objIiI10X == objI0iXXO) {
                return objI0iXXO;
            }
            file = file2;
            obj = objIiI10X;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            file = (File) this.L$0;
            ResultKt.X1ii(obj);
        }
        InputStream inputStreamByteStream = ((ResponseBody) obj).byteStream();
        try {
            byte[] bArrX0O = ByteStreamsKt.X0O(inputStreamByteStream);
            CloseableKt.OXO1(inputStreamByteStream, null);
            FileIOUtils.writeFileFromBytesByStream(file, bArrX0O);
            return file.getPath();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.OXO1(inputStreamByteStream, th);
                throw th2;
            }
        }
    }
}
