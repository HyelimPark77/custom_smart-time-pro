package com.sma.smartv3.ui.device;

import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.pb;
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
@DebugMetadata(c = "com.sma.smartv3.ui.device.TouchRepairActivity$mBleHandleCallback$2$1$onFactoryTestUpdate$1", f = "TouchRepairActivity.kt", i = {}, l = {62}, m = "invokeSuspend", n = {}, s = {}, v = 1)
public final class TouchRepairActivity$mBleHandleCallback$2$1$onFactoryTestUpdate$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ TouchRepairActivity this$0;

    public TouchRepairActivity$mBleHandleCallback$2$1$onFactoryTestUpdate$1(TouchRepairActivity r1, Continuation<? super TouchRepairActivity$mBleHandleCallback$2$1$onFactoryTestUpdate$1> r2) {
        this.this$0 = r1;
        super(2, r2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
        return new TouchRepairActivity$mBleHandleCallback$2$1$onFactoryTestUpdate$1(this.this$0, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((TouchRepairActivity$mBleHandleCallback$2$1$onFactoryTestUpdate$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r10) {
        Object r0 = pb.I0iXXO();
        int r1 = this.label;
        if (r1 == 0) goto L8;
        if (r1 != 1) goto L7;
        ResultKt.X1ii(r10);
    L11:
        BaseBleConnector.sendInt8$default(BleConnector.INSTANCE, BleKey.FACTORY_TEST, BleKeyFlag.UPDATE, FactoryTestType.EXIT.getType(), false, false, 24, null);
        return Unit.OXO1;
    L7:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L8:
        ResultKt.X1ii(r10);
        i1O0OXO1O.OXO1.OXO1(TouchRepairActivity.access$getTAG$p(this.this$0) + " GlobalScope.launch FactoryTestType.EXIT");
        this.label = 1;
        if (DelayKt.XIi00iiXO(2000, this) != r0) goto L11;
        return r0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
