package com.sma.smartv3.ui.sport;

import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.pb;
import com.google.android.material.tabs.TabLayout;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.sma.smartv3.ui.sport.SportFragmentHaveSwitch$initSportSelect$1$1$1", f = "SportFragmentHaveSwitch.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {}, v = 1)
public final class SportFragmentHaveSwitch$initSportSelect$1$1$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SportFragmentHaveSwitch this$0;

    public SportFragmentHaveSwitch$initSportSelect$1$1$1(SportFragmentHaveSwitch r1, Continuation<? super SportFragmentHaveSwitch$initSportSelect$1$1$1> r2) {
        this.this$0 = r1;
        super(2, r2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
        return new SportFragmentHaveSwitch$initSportSelect$1$1$1(this.this$0, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((SportFragmentHaveSwitch$initSportSelect$1$1$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r6) {
        Object r0 = pb.I0iXXO();
        int r1 = this.label;
        if (r1 == 0) goto L8;
        if (r1 != 1) goto L7;
        ResultKt.X1ii(r6);
    L11:
        TabLayout r7 = this.this$0.getTable();
        if (r7 == null) goto L17;
        TabLayout.Tab r8 = r7.getTabAt(r7.getTabCount() - 1);
        if (r8 == null) goto L17;
        r8.select();
    L17:
        return Unit.OXO1;
    L7:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L8:
        ResultKt.X1ii(r6);
        this.label = 1;
        if (DelayKt.XIi00iiXO(200, this) != r0) goto L11;
        return r0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
