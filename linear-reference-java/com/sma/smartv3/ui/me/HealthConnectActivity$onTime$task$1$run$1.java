package com.sma.smartv3.ui.me;

import androidx.appcompat.widget.AppCompatCheckBox;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.pb;
import com.example.health.data.HealthConnectManager;
import com.example.health.presentation.screen.exercisesession.ExerciseSessionViewModel;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@DebugMetadata(c = "com.sma.smartv3.ui.me.HealthConnectActivity$onTime$task$1$run$1", f = "HealthConnectActivity.kt", i = {0, 0}, l = {197}, m = "invokeSuspend", n = {"it", "$i$a$-let-HealthConnectActivity$onTime$task$1$run$1$1"}, s = {"L$0", "I$0"}, v = 1)
public final class HealthConnectActivity$onTime$task$1$run$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ HealthConnectActivity this$0;

    public HealthConnectActivity$onTime$task$1$run$1(HealthConnectActivity r1, Continuation<? super HealthConnectActivity$onTime$task$1$run$1> r2) {
        this.this$0 = r1;
        super(2, r2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
        return new HealthConnectActivity$onTime$task$1$run$1(this.this$0, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((HealthConnectActivity$onTime$task$1$run$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r7) {
        Object r0 = pb.I0iXXO();
        int r1 = this.label;
        if (r1 == 0) goto L8;
        if (r1 != 1) goto L7;
        AppCompatCheckBox r2 = (AppCompatCheckBox) this.L$1;
        ExerciseSessionViewModel r3 = (ExerciseSessionViewModel) this.L$0;
        ResultKt.X1ii(r7);
    L14:
        r2.setChecked(((Boolean) r7).booleanValue());
    L16:
        return Unit.OXO1;
    L7:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L8:
        ResultKt.X1ii(r7);
        ExerciseSessionViewModel r8 = HealthConnectActivity.access$getViewModel$p(this.this$0);
        if (r8 == null) goto L16;
        HealthConnectActivity r4 = this.this$0;
        AppCompatCheckBox r5 = HealthConnectActivity.access$getCheck_health_connect(r4);
        HealthConnectManager r6 = HealthConnectActivity.access$getHealthConnectManager$p(r4);
        Intrinsics.XXI(r6);
        Set<String> r9 = r8.getPermissions(0);
        this.L$0 = SpillingKt.OXO1(r8);
        this.L$1 = r5;
        this.I$0 = 0;
        this.label = 1;
        r7 = r6.iIiiO(r9, this);
        if (r7 != r0) goto L13;
        return r0;
    L13:
        r2 = r5;
        goto L14
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
