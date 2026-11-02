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

    public DataWorker(@aa1 Context r2, @aa1 WorkerParameters r3) {
        Intrinsics.X0O(r2, "appContext");
        Intrinsics.X0O(r3, "workerParams");
        super(r2, r3);
        this.context = r2;
    }

    private final boolean filterWorker() {
        if ((System.currentTimeMillis() - OO10O000I.OXO1()) <= 10000) goto L6;
        OO10O000I.XIi00iiXO(System.currentTimeMillis());
        return false;
    L6:
        return true;
    }

    @Override // androidx.work.Worker
    @aa1
    public ListenableWorker.Result doWork() {
        i1O0OXO1O.OXO1.OXO1("DataWorker doWork()");
        if (filterWorker() == true) goto L5;
        Upload.OXO1.XOO0ii0(this.context);
    L5:
        ListenableWorker.Result r0 = ListenableWorker.Result.success();
        Intrinsics.O10IXXX0X(r0, "success(...)");
        return r0;
    }

    @aa1
    public final Context getContext() {
        return this.context;
    }

    public final void setContext(@aa1 Context r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.context = r2;
    }
}
