package com.sma.smartv3.p610ui.device;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.pro.R;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes18.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.ui.device.TouchRepairActivity$mBleHandleCallback$2$1$onFactoryTestUpdate$2", m39466f = "TouchRepairActivity.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
public final class TouchRepairActivity$mBleHandleCallback$2$1$onFactoryTestUpdate$2 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ TouchRepairActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouchRepairActivity$mBleHandleCallback$2$1$onFactoryTestUpdate$2(TouchRepairActivity touchRepairActivity, Continuation<? super TouchRepairActivity$mBleHandleCallback$2$1$onFactoryTestUpdate$2> continuation) {
        super(2, continuation);
        this.this$0 = touchRepairActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TouchRepairActivity$mBleHandleCallback$2$1$onFactoryTestUpdate$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((TouchRepairActivity$mBleHandleCallback$2$1$onFactoryTestUpdate$2) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C2798pb.I0iXXO();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.X1ii(obj);
        this.this$0.isFinishActivityType = true;
        this.this$0.getMLoadPopup().dismiss();
        this.this$0.getMBtnBottom().setText(R.string.successful_confirm);
        ToastUtils.showShort(R.string.touch_repair__repair_success);
        return Unit.OXO1;
    }
}
