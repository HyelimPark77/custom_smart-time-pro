package com.sma.smartv3.p610ui.sport;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.google.android.material.tabs.TabLayout;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.ui.sport.SportFragmentHaveSwitch$initSportSelect$1$1$1", m39466f = "SportFragmentHaveSwitch.kt", m39467i = {}, m39468l = {102}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
public final class SportFragmentHaveSwitch$initSportSelect$1$1$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SportFragmentHaveSwitch this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportFragmentHaveSwitch$initSportSelect$1$1$1(SportFragmentHaveSwitch sportFragmentHaveSwitch, Continuation<? super SportFragmentHaveSwitch$initSportSelect$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = sportFragmentHaveSwitch;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SportFragmentHaveSwitch$initSportSelect$1$1$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((SportFragmentHaveSwitch$initSportSelect$1$1$1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TabLayout.Tab tabAt;
        Object objI0iXXO = C2798pb.I0iXXO();
        int i = this.label;
        if (i == 0) {
            ResultKt.X1ii(obj);
            this.label = 1;
            if (DelayKt.XIi00iiXO(200L, this) == objI0iXXO) {
                return objI0iXXO;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
        }
        TabLayout table = this.this$0.getTable();
        if (table != null && (tabAt = table.getTabAt(table.getTabCount() - 1)) != null) {
            tabAt.select();
        }
        return Unit.OXO1;
    }
}
