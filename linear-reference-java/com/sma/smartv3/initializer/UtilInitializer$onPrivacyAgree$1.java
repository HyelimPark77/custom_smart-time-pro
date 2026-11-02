package com.sma.smartv3.initializer;

import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.uz0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes19.dex */
@DebugMetadata(c = "com.sma.smartv3.initializer.UtilInitializer$onPrivacyAgree$1", f = "UtilInitializer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
public final class UtilInitializer$onPrivacyAgree$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    int label;

    public UtilInitializer$onPrivacyAgree$1(Continuation<? super UtilInitializer$onPrivacyAgree$1> r2) {
        super(2, r2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r1, Continuation<?> r2) {
        return new UtilInitializer$onPrivacyAgree$1(r2);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((UtilInitializer$onPrivacyAgree$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r6) {
        pb.I0iXXO();
        if (this.label != 0) goto L7;
        ResultKt.X1ii(r6);
        UtilInitializer r7 = UtilInitializer.IO;
        sz0 r0 = sz0.OXO1;
        UtilInitializer.IiI10X(r7, uz0.OIX0iXi(r0), 0, 2, null);
        UtilInitializer.IiI10X(r7, uz0.OX110i(r0), 0, 2, null);
        UtilInitializer.IiI10X(r7, uz0.X1IX(r0), 0, 2, null);
        UtilInitializer.IiI10X(r7, uz0.XiOIO(r0), 0, 2, null);
        UtilInitializer.IiI10X(r7, uz0.iIiiO(r0), 0, 2, null);
        UtilInitializer.IiI10X(r7, uz0.XX1Oi(r0), 0, 2, null);
        UtilInitializer.IiI10X(r7, uz0.XX0(r0), 0, 2, null);
        UtilInitializer.IiI10X(r7, uz0.OO(r0), 0, 2, null);
        return Unit.OXO1;
    L7:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
