package com.sma.smartv3.p610ui.translate.sparkchain;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.iflytek.sparkchain.core.tts.OnlineTTS;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.sparkchain.SparkChainTTS$start$2", m39466f = "SparkChainTTS.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
public final class SparkChainTTS$start$2 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $contentText;
    int label;
    final /* synthetic */ SparkChainTTS this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SparkChainTTS$start$2(SparkChainTTS sparkChainTTS, String str, Continuation<? super SparkChainTTS$start$2> continuation) {
        super(2, continuation);
        this.this$0 = sparkChainTTS;
        this.$contentText = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SparkChainTTS$start$2(this.this$0, this.$contentText, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((SparkChainTTS$start$2) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C2798pb.I0iXXO();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.X1ii(obj);
        OnlineTTS onlineTTS = this.this$0.f54858iO;
        if (onlineTTS != null) {
            Boxing.IiI10X(onlineTTS.aRun(this.$contentText, this.this$0.XO0O10.getName()));
        }
        return Unit.OXO1;
    }
}
