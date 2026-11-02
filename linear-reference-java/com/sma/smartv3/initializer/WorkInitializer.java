package com.sma.smartv3.initializer;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.Observer;
import androidx.work.Constraints;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.NetworkType;
import androidx.work.Operation;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.O11XO1X;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i47;
import com.android.mltcode.paycertificationapi.s5;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.AppUtils;
import com.sma.smartv3.biz.fitness_site.FitnessSiteUploadWorker;
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
public final class WorkInitializer implements s5 {

    @aa1
    public static final String I1 = "uploadData";

    @aa1
    public static final WorkInitializer IO = null;

    @aa1
    public static final String X11iII1O1 = "zewafit_upload";
    public static Application XXX11i = null;

    @aa1
    public static final String iX1O1 = "fitness_site_upload";

    public static final class OXO1 implements Observer, FunctionAdapter {
        public final /* synthetic */ Function1 IO;

        public OXO1(Function1 r2) {
            Intrinsics.X0O(r2, "function");
            this.IO = r2;
        }

        public final boolean equals(@tb1 Object r3) {
            if ((r3 instanceof Observer) == true) goto L5;
        L8:
            return false;
        L5:
            if ((r3 instanceof FunctionAdapter) == false) goto L8;
            return Intrinsics.XOO0ii0(getFunctionDelegate(), ((FunctionAdapter) r3).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @aa1
        public final Function<?> getFunctionDelegate() {
            return this.IO;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object r2) {
            invoke(r2);
        }
    }

    static {
        IO = new WorkInitializer();
    }

    public WorkInitializer() {
    }

    public static final Unit I0IIOi(Operation.State r1) {
        if ((r1 instanceof Operation.State.SUCCESS) == false) goto L6;
        i1O0OXO1O.OXO1.OXO1("WorkInitializer initialize : 任务已成功进入系统队列");
    L9:
        return Unit.OXO1;
    L6:
        if ((r1 instanceof Operation.State.FAILURE) == false) goto L9;
        i1O0OXO1O.OXO1.OXO1("WorkInitializer initialize : 入队失败");
        goto L9
    }

    public static final /* synthetic */ Application O00() {
        return XXX11i;
    }

    public static /* synthetic */ Unit XIi00iiXO(Operation.State r0) {
        return I0IIOi(r0);
    }

    public static final /* synthetic */ void XO0O10(WorkInitializer r0, Application r1) {
        r0.XOO0ii0(r1);
    }

    public static final /* synthetic */ void iO(WorkInitializer r0, Application r1) {
        r0.IiI10X(r1);
    }

    @sf5(tag = b01.OIX0iXi)
    public final void IO(@aa1 Object r7) {
        Intrinsics.X0O(r7, "data");
        i1O0OXO1O.OXO1.OXO1("WorkInitializer initialize : onPrivacyAgree");
        I100X1.O00(I0IIOi.OXO1(IXOX0Xiii.iO()), null, null, new WorkInitializer$onPrivacyAgree$1(null), 3, null);
    }

    public final void IiI10X(Application r7) {
        Constraints r0 = new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build();
        PeriodicWorkRequest r1 = new PeriodicWorkRequest.Builder(FitnessSiteUploadWorker.class, PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS, TimeUnit.MILLISECONDS).setConstraints(r0).setInitialDelay(1, TimeUnit.MINUTES).addTag(iX1O1).build();
        WorkManager.Companion.getInstance(r7).enqueueUniquePeriodicWork(iX1O1, ExistingPeriodicWorkPolicy.KEEP, r1);
    }

    public final void OIi0(@aa1 Context r2, @aa1 String r3) {
        Intrinsics.X0O(r2, "mContext");
        Intrinsics.X0O(r3, "tag");
        WorkManager.Companion.getInstance(r2).cancelAllWorkByTag(r3);
    }

    @Override // com.android.mltcode.paycertificationapi.s5
    public void OXO1(@aa1 Application r3) {
        Intrinsics.X0O(r3, "app");
        O11XO1X.XO0O10().X1ii(this);
        XXX11i = r3;
        if (a01.OXO1.OXO1().getBoolean(b01.OIX0iXi, false) == false) goto L6;
        i1O0OXO1O.OXO1.OXO1("WorkInitializer initialize");
        IO(new Object());
        return;
    }

    public final void XOO0ii0(Application r8) {
        Constraints r0 = new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build();
        TimeUnit r1 = TimeUnit.MINUTES;
        PeriodicWorkRequest r2 = new PeriodicWorkRequest.Builder(DataWorker.class, 30, r1).setConstraints(r0).setInitialDelay(5, r1).addTag(I1).build();
        Operation r9 = WorkManager.Companion.getInstance(r8).enqueueUniquePeriodicWork(AppUtils.getAppPackageName() + " sync sport data ", ExistingPeriodicWorkPolicy.KEEP, r2);
        r9.getState().observeForever(new OXO1(new i47()));
        I100X1.O00(I0IIOi.OXO1(IXOX0Xiii.iO()), null, null, new WorkInitializer$addUploadDataRequest$2(r9, null), 3, null);
    }
}
