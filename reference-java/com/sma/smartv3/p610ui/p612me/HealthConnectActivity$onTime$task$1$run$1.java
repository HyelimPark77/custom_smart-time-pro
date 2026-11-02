package com.sma.smartv3.p610ui.p612me;

import androidx.appcompat.widget.AppCompatCheckBox;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.i00OIXiO;
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
@DebugMetadata(m39465c = "com.sma.smartv3.ui.me.HealthConnectActivity$onTime$task$1$run$1", m39466f = "HealthConnectActivity.kt", m39467i = {0, 0}, m39468l = {197}, m39469m = "invokeSuspend", m39470n = {"it", "$i$a$-let-HealthConnectActivity$onTime$task$1$run$1$1"}, m39472s = {"L$0", "I$0"}, m39473v = 1)
public final class HealthConnectActivity$onTime$task$1$run$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ HealthConnectActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HealthConnectActivity$onTime$task$1$run$1(HealthConnectActivity healthConnectActivity, Continuation<? super HealthConnectActivity$onTime$task$1$run$1> continuation) {
        super(2, continuation);
        this.this$0 = healthConnectActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HealthConnectActivity$onTime$task$1$run$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((HealthConnectActivity$onTime$task$1$run$1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AppCompatCheckBox appCompatCheckBox;
        Object objI0iXXO = C2798pb.I0iXXO();
        int i = this.label;
        if (i == 0) {
            ResultKt.X1ii(obj);
            ExerciseSessionViewModel exerciseSessionViewModel = this.this$0.viewModel;
            if (exerciseSessionViewModel != null) {
                HealthConnectActivity healthConnectActivity = this.this$0;
                AppCompatCheckBox check_health_connect = healthConnectActivity.getCheck_health_connect();
                HealthConnectManager healthConnectManager = healthConnectActivity.healthConnectManager;
                Intrinsics.XXI(healthConnectManager);
                Set<String> permissions = exerciseSessionViewModel.getPermissions(0);
                this.L$0 = SpillingKt.OXO1(exerciseSessionViewModel);
                this.L$1 = check_health_connect;
                this.I$0 = 0;
                this.label = 1;
                obj = healthConnectManager.iIiiO(permissions, this);
                if (obj == objI0iXXO) {
                    return objI0iXXO;
                }
                appCompatCheckBox = check_health_connect;
            }
            return Unit.OXO1;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        appCompatCheckBox = (AppCompatCheckBox) this.L$1;
        ResultKt.X1ii(obj);
        appCompatCheckBox.setChecked(((Boolean) obj).booleanValue());
        return Unit.OXO1;
    }
}
