package com.sma.smartv3.ui.translate.sparkchain;

import com.android.mltcode.paycertificationapi.IXiXI;
import com.android.mltcode.paycertificationapi.i1iII1i1;
import com.android.mltcode.paycertificationapi.iOIXXXII0;
import com.android.mltcode.paycertificationapi.pb;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.sma.smartv3.ui.translate.sparkchain.SparkChainMultiDeviceViewModel$aiMessageFlow$2", f = "SparkChainMultiDeviceViewModel.kt", i = {0, 0, 0}, l = {66}, m = "invokeSuspend", n = {"$this$combineTransform", "asr", "translate"}, s = {"L$0", "L$1", "L$2"}, v = 1)
public final class SparkChainMultiDeviceViewModel$aiMessageFlow$2 extends SuspendLambda implements Function4<IXiXI<? super iOIXXXII0>, i1iII1i1, String, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ SparkChainMultiDeviceViewModel this$0;

    public SparkChainMultiDeviceViewModel$aiMessageFlow$2(SparkChainMultiDeviceViewModel r1, Continuation<? super SparkChainMultiDeviceViewModel$aiMessageFlow$2> r2) {
        this.this$0 = r1;
        super(4, r2);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(IXiXI<? super iOIXXXII0> r3, i1iII1i1 r4, String r5, Continuation<? super Unit> r6) {
        SparkChainMultiDeviceViewModel$aiMessageFlow$2 r0 = new SparkChainMultiDeviceViewModel$aiMessageFlow$2(this.this$0, r6);
        r0.L$0 = r3;
        r0.L$1 = r4;
        r0.L$2 = r5;
        return r0.invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r22) {
        IXiXI r1 = (IXiXI) this.L$0;
        i1iII1i1 r2 = (i1iII1i1) this.L$1;
        String r9 = (String) this.L$2;
        Object r3 = pb.I0iXXO();
        int r4 = this.label;
        if (r4 == 0) goto L8;
        if (r4 != 1) goto L7;
        ResultKt.X1ii(r22);
    L21:
        return Unit.OXO1;
    L7:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L8:
        ResultKt.X1ii(r22);
        String r5 = r2.O00();
        if (r5 == null) goto L21;
        if (StringsKt__StringsKt.i0XI0(r5) == true) goto L21;
        if (r9 == null) goto L21;
        if (StringsKt__StringsKt.i0XI0(r9) == true) goto L21;
        String r10 = r2.O00();
        String r6 = null;
        String r7 = null;
        Float r8 = null;
        String r11 = null;
        String r12 = null;
        String r13 = null;
        String r14 = null;
        Integer r15 = null;
        boolean r16 = false;
        iOIXXXII0 r17 = new iOIXXXII0(r6, Boxing.IiI10X(SparkChainMultiDeviceViewModel.access$getDeviceType$p(this.this$0)), r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, 4045, null);
        this.L$0 = SpillingKt.OXO1(r1);
        this.L$1 = SpillingKt.OXO1(r2);
        this.L$2 = SpillingKt.OXO1(r9);
        this.label = 1;
        if (r1.emit(r17, this) != r3) goto L21;
        return r3;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Object invoke(IXiXI<? super iOIXXXII0> r1, i1iII1i1 r2, String r3, Continuation<? super Unit> r4) {
        return invoke2(r1, r2, r3, r4);
    }
}
