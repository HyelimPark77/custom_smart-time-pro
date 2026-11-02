package com.sma.smartv3.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.android.mltcode.paycertificationapi.OO10O000I;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class DataWorker extends Worker {

    @aa1
    private Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataWorker(@aa1 Context appContext, @aa1 WorkerParameters workerParams) {
        super(appContext, workerParams);
        Intrinsics.X0O(appContext, "appContext");
        Intrinsics.X0O(workerParams, "workerParams");
        this.context = appContext;
    }

    private final boolean filterWorker() {
        if (System.currentTimeMillis() - OO10O000I.OXO1() <= 10000) {
            return true;
        }
        OO10O000I.XIi00iiXO(System.currentTimeMillis());
        return false;
    }

    @Override // androidx.work.Worker
    @aa1
    public ListenableWorker.Result doWork() throws InterruptedException {
        i1O0OXO1O.OXO1.OXO1("DataWorker doWork()");
        if (!filterWorker()) {
            Upload.OXO1.XOO0ii0(this.context);
        }
        ListenableWorker.Result resultSuccess = ListenableWorker.Result.success();
        Intrinsics.O10IXXX0X(resultSuccess, "success(...)");
        return resultSuccess;
    }

    @aa1
    public final Context getContext() {
        return this.context;
    }

    public final void setContext(@aa1 Context context) {
        Intrinsics.X0O(context, "<set-?>");
        this.context = context;
    }
}
