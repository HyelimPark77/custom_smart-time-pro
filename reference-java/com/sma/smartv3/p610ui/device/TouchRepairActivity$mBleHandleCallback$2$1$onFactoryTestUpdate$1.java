package com.sma.smartv3.p610ui.device;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.FactoryTestType;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes18.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.ui.device.TouchRepairActivity$mBleHandleCallback$2$1$onFactoryTestUpdate$1", m39466f = "TouchRepairActivity.kt", m39467i = {}, m39468l = {62}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
public final class TouchRepairActivity$mBleHandleCallback$2$1$onFactoryTestUpdate$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ TouchRepairActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouchRepairActivity$mBleHandleCallback$2$1$onFactoryTestUpdate$1(TouchRepairActivity touchRepairActivity, Continuation<? super TouchRepairActivity$mBleHandleCallback$2$1$onFactoryTestUpdate$1> continuation) {
        super(2, continuation);
        this.this$0 = touchRepairActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TouchRepairActivity$mBleHandleCallback$2$1$onFactoryTestUpdate$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((TouchRepairActivity$mBleHandleCallback$2$1$onFactoryTestUpdate$1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objI0iXXO = C2798pb.I0iXXO();
        int i = this.label;
        if (i == 0) {
            ResultKt.X1ii(obj);
            i1O0OXO1O.OXO1.OXO1(this.this$0.TAG + " GlobalScope.launch FactoryTestType.EXIT");
            this.label = 1;
            if (DelayKt.XIi00iiXO(2000L, this) == objI0iXXO) {
                return objI0iXXO;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
        }
        BaseBleConnector.sendInt8$default(BleConnector.INSTANCE, BleKey.FACTORY_TEST, BleKeyFlag.UPDATE, FactoryTestType.EXIT.getType(), false, false, 24, null);
        return Unit.OXO1;
    }
}
