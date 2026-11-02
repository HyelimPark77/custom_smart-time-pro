package com.sma.smartv3.ui.main;

import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.pb;
import com.goodix.ble.libcomx.task.ITask;
import com.sma.smartv3.location.CustomLocation;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes19.dex */
@DebugMetadata(c = "com.sma.smartv3.ui.main.NationServerSelectActivity$startLocationClient$1$onLocationChange$1", f = "NationServerSelectActivity.kt", i = {}, l = {ITask.EVT_START}, m = "invokeSuspend", n = {}, s = {}, v = 1)
public final class NationServerSelectActivity$startLocationClient$1$onLocationChange$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ CustomLocation $location;
    int label;
    final /* synthetic */ NationServerSelectActivity this$0;

    public NationServerSelectActivity$startLocationClient$1$onLocationChange$1(NationServerSelectActivity r1, CustomLocation r2, Continuation<? super NationServerSelectActivity$startLocationClient$1$onLocationChange$1> r3) {
        this.this$0 = r1;
        this.$location = r2;
        super(2, r3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
        return new NationServerSelectActivity$startLocationClient$1$onLocationChange$1(this.this$0, this.$location, r4);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((NationServerSelectActivity$startLocationClient$1$onLocationChange$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r7) {
        Object r0 = pb.I0iXXO();
        int r1 = this.label;
        if (r1 == 0) goto L8;
        if (r1 != 1) goto L7;
        ResultKt.X1ii(r7);
    L11:
        String r8 = (String) r7;
        i1O0OXO1O.OXO1.OXO1(NationServerSelectActivity.access$getTAG$p(this.this$0) + ", iso2 = " + r8);
        NationServerSelectActivity r2 = this.this$0;
        Intrinsics.XXI(r8);
        NationServerSelectActivity.access$setDataNationList(r2, r8);
        this.this$0.setGetLocationCode(false);
        NationServerSelectActivity.access$dismissLoading(this.this$0);
        return Unit.OXO1;
    L7:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L8:
        ResultKt.X1ii(r7);
        CoroutineDispatcher r9 = IXOX0Xiii.iO();
        NationServerSelectActivity$startLocationClient$1$onLocationChange$1$iso2$1 r3 = new NationServerSelectActivity$startLocationClient$1$onLocationChange$1$iso2$1(this.this$0, this.$location, null);
        this.label = 1;
        r7 = I100X1.I0IIOi(r9, r3, this);
        if (r7 != r0) goto L11;
        return r0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
