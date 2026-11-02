package com.sma.smartv3.initializer;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.uz0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes19.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.initializer.UtilInitializer$onPrivacyAgree$1", m39466f = "UtilInitializer.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
public final class UtilInitializer$onPrivacyAgree$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    int label;

    public UtilInitializer$onPrivacyAgree$1(Continuation<? super UtilInitializer$onPrivacyAgree$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UtilInitializer$onPrivacyAgree$1(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((UtilInitializer$onPrivacyAgree$1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C2798pb.I0iXXO();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.X1ii(obj);
        UtilInitializer utilInitializer = UtilInitializer.f51279IO;
        sz0 sz0Var = sz0.OXO1;
        UtilInitializer.IiI10X(utilInitializer, uz0.OIX0iXi(sz0Var), 0, 2, null);
        UtilInitializer.IiI10X(utilInitializer, uz0.OX110i(sz0Var), 0, 2, null);
        UtilInitializer.IiI10X(utilInitializer, uz0.X1IX(sz0Var), 0, 2, null);
        UtilInitializer.IiI10X(utilInitializer, uz0.XiOIO(sz0Var), 0, 2, null);
        UtilInitializer.IiI10X(utilInitializer, uz0.iIiiO(sz0Var), 0, 2, null);
        UtilInitializer.IiI10X(utilInitializer, uz0.XX1Oi(sz0Var), 0, 2, null);
        UtilInitializer.IiI10X(utilInitializer, uz0.XX0(sz0Var), 0, 2, null);
        UtilInitializer.IiI10X(utilInitializer, uz0.m3188OO(sz0Var), 0, 2, null);
        return Unit.OXO1;
    }
}
