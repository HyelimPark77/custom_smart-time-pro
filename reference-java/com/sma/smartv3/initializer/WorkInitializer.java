package com.sma.smartv3.initializer;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.Observer;
import androidx.work.Constraints;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import androidx.work.Operation;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.InterfaceC2909s5;
import com.android.mltcode.paycertificationapi.O11XO1X;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.AppUtils;
import com.sma.smartv3.biz.fitness_site.FitnessSiteUploadWorker;
import com.sma.smartv3.initializer.WorkInitializer;
import com.sma.smartv3.work.DataWorker;
import java.util.concurrent.TimeUnit;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.I0IIOi;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nWorkInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkInitializer.kt\ncom/sma/smartv3/initializer/WorkInitializer\n+ 2 PeriodicWorkRequest.kt\nandroidx/work/PeriodicWorkRequestKt\n*L\n1#1,123:1\n368#2:124\n368#2:125\n*S KotlinDebug\n*F\n+ 1 WorkInitializer.kt\ncom/sma/smartv3/initializer/WorkInitializer\n*L\n69#1:124\n102#1:125\n*E\n"})
public final class WorkInitializer implements InterfaceC2909s5 {

    /* JADX INFO: renamed from: I1 */
    @aa1
    public static final String f51286I1 = "uploadData";

    /* JADX INFO: renamed from: IO */
    @aa1
    public static final WorkInitializer f51287IO = new WorkInitializer();

    @aa1
    public static final String X11iII1O1 = "zewafit_upload";
    public static Application XXX11i = null;

    @aa1
    public static final String iX1O1 = "fitness_site_upload";

    public static final class OXO1 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ Function1 f51288IO;

        public OXO1(Function1 function) {
            Intrinsics.X0O(function, "function");
            this.f51288IO = function;
        }

        public final boolean equals(@tb1 Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.XOO0ii0(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @aa1
        public final Function<?> getFunctionDelegate() {
            return this.f51288IO;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f51288IO.invoke2(obj);
        }
    }

    public static final Unit I0IIOi(Operation.State state) {
        if (state instanceof Operation.State.SUCCESS) {
            i1O0OXO1O.OXO1.OXO1("WorkInitializer initialize : 任务已成功进入系统队列");
        } else if (state instanceof Operation.State.FAILURE) {
            i1O0OXO1O.OXO1.OXO1("WorkInitializer initialize : 入队失败");
        }
        return Unit.OXO1;
    }

    @sf5(tag = b01.OIX0iXi)
    /* JADX INFO: renamed from: IO */
    public final void m38245IO(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        i1O0OXO1O.OXO1.OXO1("WorkInitializer initialize : onPrivacyAgree");
        XX01Oi.IiI10X(I0IIOi.OXO1(IXOX0Xiii.m712iO()), null, null, new WorkInitializer$onPrivacyAgree$1(null), 3, null);
    }

    public final void IiI10X(Application application) {
        WorkManager.Companion.getInstance(application).enqueueUniquePeriodicWork(iX1O1, ExistingPeriodicWorkPolicy.KEEP, new PeriodicWorkRequest.Builder((Class<? extends ListenableWorker>) FitnessSiteUploadWorker.class, PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS, TimeUnit.MILLISECONDS).setConstraints(new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build()).setInitialDelay(1L, TimeUnit.MINUTES).addTag(iX1O1).build());
    }

    public final void OIi0(@aa1 Context mContext, @aa1 String tag) {
        Intrinsics.X0O(mContext, "mContext");
        Intrinsics.X0O(tag, "tag");
        WorkManager.Companion.getInstance(mContext).cancelAllWorkByTag(tag);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2909s5
    public void OXO1(@aa1 Application app) {
        Intrinsics.X0O(app, "app");
        O11XO1X.XO0O10().X1ii(this);
        XXX11i = app;
        if (a01.OXO1.OXO1().getBoolean(b01.OIX0iXi, false)) {
            i1O0OXO1O.OXO1.OXO1("WorkInitializer initialize");
            m38245IO(new Object());
        }
    }

    public final void XOO0ii0(Application application) {
        Constraints constraintsBuild = new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build();
        TimeUnit timeUnit = TimeUnit.MINUTES;
        PeriodicWorkRequest periodicWorkRequestBuild = new PeriodicWorkRequest.Builder((Class<? extends ListenableWorker>) DataWorker.class, 30L, timeUnit).setConstraints(constraintsBuild).setInitialDelay(5L, timeUnit).addTag(f51286I1).build();
        Operation operationEnqueueUniquePeriodicWork = WorkManager.Companion.getInstance(application).enqueueUniquePeriodicWork(AppUtils.getAppPackageName() + " sync sport data ", ExistingPeriodicWorkPolicy.KEEP, periodicWorkRequestBuild);
        operationEnqueueUniquePeriodicWork.getState().observeForever(new OXO1(new Function1() { // from class: com.android.mltcode.paycertificationapi.i47
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WorkInitializer.I0IIOi((Operation.State) obj);
            }
        }));
        XX01Oi.IiI10X(I0IIOi.OXO1(IXOX0Xiii.m712iO()), null, null, new WorkInitializer$addUploadDataRequest$2(operationEnqueueUniquePeriodicWork, null), 3, null);
    }
}
