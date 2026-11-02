package com.sma.smartv3.p610ui.translate.sparkchain;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.IXiXI;
import com.android.mltcode.paycertificationapi.i1iII1i1;
import com.android.mltcode.paycertificationapi.iOIXXXII0;
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
@DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.sparkchain.SparkChainMultiDeviceViewModel$aiMessageFlow$2", m39466f = "SparkChainMultiDeviceViewModel.kt", m39467i = {0, 0, 0}, m39468l = {66}, m39469m = "invokeSuspend", m39470n = {"$this$combineTransform", "asr", "translate"}, m39472s = {"L$0", "L$1", "L$2"}, m39473v = 1)
public final class SparkChainMultiDeviceViewModel$aiMessageFlow$2 extends SuspendLambda implements Function4<IXiXI<? super iOIXXXII0>, i1iII1i1, String, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ SparkChainMultiDeviceViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SparkChainMultiDeviceViewModel$aiMessageFlow$2(SparkChainMultiDeviceViewModel sparkChainMultiDeviceViewModel, Continuation<? super SparkChainMultiDeviceViewModel$aiMessageFlow$2> continuation) {
        super(4, continuation);
        this.this$0 = sparkChainMultiDeviceViewModel;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(IXiXI<? super iOIXXXII0> iXiXI, i1iII1i1 i1iii1i1, String str, Continuation<? super Unit> continuation) {
        SparkChainMultiDeviceViewModel$aiMessageFlow$2 sparkChainMultiDeviceViewModel$aiMessageFlow$2 = new SparkChainMultiDeviceViewModel$aiMessageFlow$2(this.this$0, continuation);
        sparkChainMultiDeviceViewModel$aiMessageFlow$2.L$0 = iXiXI;
        sparkChainMultiDeviceViewModel$aiMessageFlow$2.L$1 = i1iii1i1;
        sparkChainMultiDeviceViewModel$aiMessageFlow$2.L$2 = str;
        return sparkChainMultiDeviceViewModel$aiMessageFlow$2.invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IXiXI iXiXI = (IXiXI) this.L$0;
        i1iII1i1 i1iii1i1 = (i1iII1i1) this.L$1;
        String str = (String) this.L$2;
        Object objI0iXXO = C2798pb.I0iXXO();
        int i = this.label;
        if (i == 0) {
            ResultKt.X1ii(obj);
            String strO00 = i1iii1i1.O00();
            if (strO00 != null && !StringsKt__StringsKt.i0XI0(strO00) && str != null && !StringsKt__StringsKt.i0XI0(str)) {
                iOIXXXII0 ioixxxii0 = new iOIXXXII0(null, Boxing.IiI10X(this.this$0.deviceType), null, null, str, i1iii1i1.O00(), null, null, null, null, null, false, 4045, null);
                this.L$0 = SpillingKt.OXO1(iXiXI);
                this.L$1 = SpillingKt.OXO1(i1iii1i1);
                this.L$2 = SpillingKt.OXO1(str);
                this.label = 1;
                if (iXiXI.emit(ioixxxii0, this) == objI0iXXO) {
                    return objI0iXXO;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
        }
        return Unit.OXO1;
    }
}
