package com.sma.smartv3.ui.translate.sparkchain;

import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.iOIXXXII0;
import com.android.mltcode.paycertificationapi.pb;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.sma.smartv3.ui.translate.sparkchain.LocalSparkChainAsrTranslateUseCase$saveItem$1", f = "LocalSparkChainAsrTranslateUseCase.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {}, v = 1)
public final class LocalSparkChainAsrTranslateUseCase$saveItem$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ iOIXXXII0 $aiMsg;
    int label;
    final /* synthetic */ LocalSparkChainAsrTranslateUseCase this$0;

    public LocalSparkChainAsrTranslateUseCase$saveItem$1(LocalSparkChainAsrTranslateUseCase r1, iOIXXXII0 r2, Continuation<? super LocalSparkChainAsrTranslateUseCase$saveItem$1> r3) {
        this.this$0 = r1;
        this.$aiMsg = r2;
        super(2, r3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
        return new LocalSparkChainAsrTranslateUseCase$saveItem$1(this.this$0, this.$aiMsg, r4);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((LocalSparkChainAsrTranslateUseCase$saveItem$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r20) {
        Object r1 = pb.I0iXXO();
        int r2 = this.label;
        if (r2 == 0) goto L8;
        if (r2 != 1) goto L7;
        ResultKt.X1ii(r20);
    L12:
        return Unit.OXO1;
    L7:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L8:
        ResultKt.X1ii(r20);
        SparkChainSessionRepository r3 = LocalSparkChainAsrTranslateUseCase.XOO0ii0(this.this$0);
        iOIXXXII0 r4 = iOIXXXII0.X1ii(this.$aiMsg, null, null, null, null, null, null, LocalSparkChainAsrTranslateUseCase.O00(this.this$0).X0O(), LocalSparkChainAsrTranslateUseCase.O00(this.this$0).iIiiO(), null, null, null, false, 3903, null);
        this.label = 1;
        if (r3.XIi00iiXO(r4, this) != r1) goto L12;
        return r1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
