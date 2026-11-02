package com.sma.smartv3.util;

import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1000;
import com.android.mltcode.paycertificationapi.iIX01Oi;
import com.android.mltcode.paycertificationapi.pb;
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
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.sma.smartv3.util.NetUtil$text2Audio$2", f = "NetUtil.kt", i = {0}, l = {138}, m = "invokeSuspend", n = {"file"}, s = {"L$0"}, v = 1)
@SourceDebugExtension({"SMAP\nNetUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetUtil.kt\ncom/sma/smartv3/util/NetUtil$text2Audio$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,164:1\n1#2:165\n*E\n"})
public final class NetUtil$text2Audio$2 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super String>, Object> {
    final /* synthetic */ String $model;
    final /* synthetic */ String $text;
    Object L$0;
    int label;

    public NetUtil$text2Audio$2(String r1, String r2, Continuation<? super NetUtil$text2Audio$2> r3) {
        this.$model = r1;
        this.$text = r2;
        super(2, r3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
        return new NetUtil$text2Audio$2(this.$model, this.$text, r4);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super String> r2) {
        return ((NetUtil$text2Audio$2) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r8) {
        Object r0 = pb.I0iXXO();
        int r1 = this.label;
        if (r1 == 0) goto L8;
        if (r1 != 1) goto L7;
        File r2 = (File) this.L$0;
        ResultKt.X1ii(r8);
    L12:
        InputStream r9 = ((ResponseBody) r8).byteStream();
        byte[] r3 = ByteStreamsKt.X0O(r9);     // Catch: Throwable -> L16
        CloseableKt.OXO1(r9, null);
        FileIOUtils.writeFileFromBytesByStream(r2, r3);
        return r2.getPath();
    L16:
        th = move-exception;
        throw th;     // Catch: Throwable -> L18
    L18:
        th = move-exception;
        CloseableKt.OXO1(r9, th);
        throw th;
    L7:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L8:
        ResultKt.X1ii(r8);
        File r10 = new File(uz0.I0iXXO(sz0.OXO1), "ai_tts_" + System.currentTimeMillis() + ".mp3");
        iIX01Oi r4 = i1000.OXO1.XOO0ii0();
        String r5 = this.$model;
        String r6 = this.$text;
        this.L$0 = r10;
        this.label = 1;
        Object r7 = r4.IiI10X(r5, r6, this);
        if (r7 != r0) goto L11;
        return r0;
    L11:
        r2 = r10;
        r8 = r7;
        goto L12
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super String> r2) {
        return invoke2(r1, r2);
    }
}
