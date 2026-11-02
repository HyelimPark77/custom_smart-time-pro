package com.sma.smartv3.ui.translate.sparkchain;

import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.pb;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.sma.smartv3.ui.translate.sparkchain.LocalSparkChainTranslateUseCase$recordingAndTranslating$1", f = "LocalSparkChainTranslateUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
public final class LocalSparkChainTranslateUseCase$recordingAndTranslating$1 extends SuspendLambda implements Function3<O00, Boolean, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ LocalSparkChainTranslateUseCase this$0;

    public LocalSparkChainTranslateUseCase$recordingAndTranslating$1(LocalSparkChainTranslateUseCase r1, Continuation<? super LocalSparkChainTranslateUseCase$recordingAndTranslating$1> r2) {
        this.this$0 = r1;
        super(3, r2);
    }

    public final Object invoke(O00 r3, boolean r4, Continuation<? super Boolean> r5) {
        LocalSparkChainTranslateUseCase$recordingAndTranslating$1 r0 = new LocalSparkChainTranslateUseCase$recordingAndTranslating$1(this.this$0, r5);
        r0.L$0 = r3;
        r0.Z$0 = r4;
        return r0.invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r5) {
        O00 r0 = (O00) this.L$0;
        boolean r1 = this.Z$0;
        pb.I0iXXO();
        if (this.label != 0) goto L13;
        ResultKt.X1ii(r5);
        i1O0OXO1O.OXO1.OXO1(LocalSparkChainTranslateUseCase.IiI10X(this.this$0) + " combine " + r0 + " " + r1);
        if (r1 == true) goto L7;
    L9:
        boolean r6 = false;
    L11:
        return Boxing.OXO1(r6);
    L7:
        if ((r0 instanceof O00.iO) == false) goto L9;
        r6 = true;
        goto L11
    L13:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(O00 r1, Boolean r2, Continuation<? super Boolean> r3) {
        return invoke(r1, r2.booleanValue(), r3);
    }
}
