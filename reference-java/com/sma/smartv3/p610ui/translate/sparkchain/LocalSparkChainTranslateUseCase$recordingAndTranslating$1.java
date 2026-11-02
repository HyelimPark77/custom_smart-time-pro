package com.sma.smartv3.p610ui.translate.sparkchain;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.sparkchain.LocalSparkChainTranslateUseCase$recordingAndTranslating$1", m39466f = "LocalSparkChainTranslateUseCase.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
public final class LocalSparkChainTranslateUseCase$recordingAndTranslating$1 extends SuspendLambda implements Function3<O00, Boolean, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ LocalSparkChainTranslateUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalSparkChainTranslateUseCase$recordingAndTranslating$1(LocalSparkChainTranslateUseCase localSparkChainTranslateUseCase, Continuation<? super LocalSparkChainTranslateUseCase$recordingAndTranslating$1> continuation) {
        super(3, continuation);
        this.this$0 = localSparkChainTranslateUseCase;
    }

    public final Object invoke(O00 o00, boolean z, Continuation<? super Boolean> continuation) {
        LocalSparkChainTranslateUseCase$recordingAndTranslating$1 localSparkChainTranslateUseCase$recordingAndTranslating$1 = new LocalSparkChainTranslateUseCase$recordingAndTranslating$1(this.this$0, continuation);
        localSparkChainTranslateUseCase$recordingAndTranslating$1.L$0 = o00;
        localSparkChainTranslateUseCase$recordingAndTranslating$1.Z$0 = z;
        return localSparkChainTranslateUseCase$recordingAndTranslating$1.invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        O00 o00 = (O00) this.L$0;
        boolean z = this.Z$0;
        C2798pb.I0iXXO();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.X1ii(obj);
        i1O0OXO1O.OXO1.OXO1(this.this$0.XOO0ii0 + " combine " + o00 + " " + z);
        return Boxing.OXO1(z && (o00 instanceof O00.C19012iO));
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(O00 o00, Boolean bool, Continuation<? super Boolean> continuation) {
        return invoke(o00, bool.booleanValue(), continuation);
    }
}
