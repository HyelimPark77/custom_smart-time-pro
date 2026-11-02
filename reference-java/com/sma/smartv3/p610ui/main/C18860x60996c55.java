package com.sma.smartv3.p610ui.main;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
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

/* JADX INFO: renamed from: com.sma.smartv3.ui.main.NationServerSelectActivity$startLocationClient$1$onLocationChange$1 */
/* JADX INFO: loaded from: classes19.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.ui.main.NationServerSelectActivity$startLocationClient$1$onLocationChange$1", m39466f = "NationServerSelectActivity.kt", m39467i = {}, m39468l = {ITask.EVT_START}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
public final class C18860x60996c55 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ CustomLocation $location;
    int label;
    final /* synthetic */ NationServerSelectActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18860x60996c55(NationServerSelectActivity nationServerSelectActivity, CustomLocation customLocation, Continuation<? super C18860x60996c55> continuation) {
        super(2, continuation);
        this.this$0 = nationServerSelectActivity;
        this.$location = customLocation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C18860x60996c55(this.this$0, this.$location, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((C18860x60996c55) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objI0iXXO = C2798pb.I0iXXO();
        int i = this.label;
        if (i == 0) {
            ResultKt.X1ii(obj);
            CoroutineDispatcher coroutineDispatcherM712iO = IXOX0Xiii.m712iO();
            C18861x180decc9 c18861x180decc9 = new C18861x180decc9(this.this$0, this.$location, null);
            this.label = 1;
            obj = I100X1.I0IIOi(coroutineDispatcherM712iO, c18861x180decc9, this);
            if (obj == objI0iXXO) {
                return objI0iXXO;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
        }
        String str = (String) obj;
        i1O0OXO1O.OXO1.OXO1(this.this$0.TAG + ", iso2 = " + str);
        NationServerSelectActivity nationServerSelectActivity = this.this$0;
        Intrinsics.XXI(str);
        nationServerSelectActivity.setDataNationList(str);
        this.this$0.setGetLocationCode(false);
        this.this$0.dismissLoading();
        return Unit.OXO1;
    }
}
