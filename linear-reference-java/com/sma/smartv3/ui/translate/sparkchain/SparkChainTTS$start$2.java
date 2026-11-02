package com.sma.smartv3.ui.translate.sparkchain;

import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.pb;
import com.iflytek.sparkchain.core.tts.OnlineTTS;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.sma.smartv3.ui.translate.sparkchain.SparkChainTTS$start$2", f = "SparkChainTTS.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
public final class SparkChainTTS$start$2 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $contentText;
    int label;
    final /* synthetic */ SparkChainTTS this$0;

    public SparkChainTTS$start$2(SparkChainTTS r1, String r2, Continuation<? super SparkChainTTS$start$2> r3) {
        this.this$0 = r1;
        this.$contentText = r2;
        super(2, r3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
        return new SparkChainTTS$start$2(this.this$0, this.$contentText, r4);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((SparkChainTTS$start$2) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r3) {
        pb.I0iXXO();
        if (this.label != 0) goto L10;
        ResultKt.X1ii(r3);
        OnlineTTS r4 = SparkChainTTS.XIi00iiXO(this.this$0);
        if (r4 == null) goto L8;
        Boxing.IiI10X(r4.aRun(this.$contentText, SparkChainTTS.OXO1(this.this$0).getName()));
    L8:
        return Unit.OXO1;
    L10:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
