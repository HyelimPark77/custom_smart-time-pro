package com.sma.smartv3.ui.device;

import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.pb;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.pro.R;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes18.dex */
@DebugMetadata(c = "com.sma.smartv3.ui.device.TouchRepairActivity$mBleHandleCallback$2$1$onFactoryTestUpdate$2", f = "TouchRepairActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
public final class TouchRepairActivity$mBleHandleCallback$2$1$onFactoryTestUpdate$2 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ TouchRepairActivity this$0;

    public TouchRepairActivity$mBleHandleCallback$2$1$onFactoryTestUpdate$2(TouchRepairActivity r1, Continuation<? super TouchRepairActivity$mBleHandleCallback$2$1$onFactoryTestUpdate$2> r2) {
        this.this$0 = r1;
        super(2, r2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
        return new TouchRepairActivity$mBleHandleCallback$2$1$onFactoryTestUpdate$2(this.this$0, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((TouchRepairActivity$mBleHandleCallback$2$1$onFactoryTestUpdate$2) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r2) {
        pb.I0iXXO();
        if (this.label != 0) goto L7;
        ResultKt.X1ii(r2);
        TouchRepairActivity.access$setFinishActivityType$p(this.this$0, true);
        TouchRepairActivity.access$getMLoadPopup(this.this$0).dismiss();
        TouchRepairActivity.access$getMBtnBottom(this.this$0).setText(R.string.successful_confirm);
        ToastUtils.showShort(R.string.touch_repair__repair_success);
        return Unit.OXO1;
    L7:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
