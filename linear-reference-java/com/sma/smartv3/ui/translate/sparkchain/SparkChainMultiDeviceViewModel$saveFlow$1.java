package com.sma.smartv3.ui.translate.sparkchain;

import com.android.mltcode.paycertificationapi.iOIXXXII0;
import com.android.mltcode.paycertificationapi.pb;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.sma.smartv3.ui.translate.sparkchain.SparkChainMultiDeviceViewModel$saveFlow$1", f = "SparkChainMultiDeviceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
public final class SparkChainMultiDeviceViewModel$saveFlow$1 extends SuspendLambda implements Function3<iOIXXXII0, String, Continuation<? super iOIXXXII0>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public SparkChainMultiDeviceViewModel$saveFlow$1(Continuation<? super SparkChainMultiDeviceViewModel$saveFlow$1> r2) {
        super(3, r2);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(iOIXXXII0 r2, String r3, Continuation<? super iOIXXXII0> r4) {
        SparkChainMultiDeviceViewModel$saveFlow$1 r0 = new SparkChainMultiDeviceViewModel$saveFlow$1(r4);
        r0.L$0 = r2;
        r0.L$1 = r3;
        return r0.invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r18) {
        iOIXXXII0 r2 = (iOIXXXII0) this.L$0;
        String r3 = (String) this.L$1;
        pb.I0iXXO();
        if (this.label != 0) goto L7;
        ResultKt.X1ii(r18);
        return iOIXXXII0.X1ii(r2, r3, null, null, null, null, null, null, null, null, null, null, false, 4094, null);
    L7:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(iOIXXXII0 r1, String r2, Continuation<? super iOIXXXII0> r3) {
        return invoke2(r1, r2, r3);
    }
}
