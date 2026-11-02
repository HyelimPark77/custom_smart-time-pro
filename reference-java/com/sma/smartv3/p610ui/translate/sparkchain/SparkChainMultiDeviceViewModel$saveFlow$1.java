package com.sma.smartv3.p610ui.translate.sparkchain;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.iOIXXXII0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.sparkchain.SparkChainMultiDeviceViewModel$saveFlow$1", m39466f = "SparkChainMultiDeviceViewModel.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
public final class SparkChainMultiDeviceViewModel$saveFlow$1 extends SuspendLambda implements Function3<iOIXXXII0, String, Continuation<? super iOIXXXII0>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public SparkChainMultiDeviceViewModel$saveFlow$1(Continuation<? super SparkChainMultiDeviceViewModel$saveFlow$1> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(iOIXXXII0 ioixxxii0, String str, Continuation<? super iOIXXXII0> continuation) {
        SparkChainMultiDeviceViewModel$saveFlow$1 sparkChainMultiDeviceViewModel$saveFlow$1 = new SparkChainMultiDeviceViewModel$saveFlow$1(continuation);
        sparkChainMultiDeviceViewModel$saveFlow$1.L$0 = ioixxxii0;
        sparkChainMultiDeviceViewModel$saveFlow$1.L$1 = str;
        return sparkChainMultiDeviceViewModel$saveFlow$1.invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        iOIXXXII0 ioixxxii0 = (iOIXXXII0) this.L$0;
        String str = (String) this.L$1;
        C2798pb.I0iXXO();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.X1ii(obj);
        return iOIXXXII0.X1ii(ioixxxii0, str, null, null, null, null, null, null, null, null, null, null, false, 4094, null);
    }
}
