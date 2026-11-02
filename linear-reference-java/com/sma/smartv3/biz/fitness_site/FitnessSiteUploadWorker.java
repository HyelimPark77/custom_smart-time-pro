package com.sma.smartv3.biz.fitness_site;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.android.mltcode.paycertificationapi.XXI0Xi;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.entity.WorkoutIndex;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class FitnessSiteUploadWorker extends Worker {

    @aa1
    public static final OXO1 Companion = null;

    @aa1
    public static final String TAG = "FitnessSiteUploadWorker";

    @aa1
    private final Context context;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker r1) {
            this();
        }

        public OXO1() {
        }
    }

    static {
        Companion = new OXO1(null);
    }

    public FitnessSiteUploadWorker(@aa1 Context r2, @aa1 WorkerParameters r3) {
        Intrinsics.X0O(r2, "context");
        Intrinsics.X0O(r3, "params");
        super(r2, r3);
        this.context = r2;
    }

    @Override // androidx.work.Worker
    @aa1
    public ListenableWorker.Result doWork() {
        WorkoutIndex r0 = MyDb.INSTANCE.getMDatabase().workoutIndexDao().getNotSynced();
        i1O0OXO1O.OXO1.OXO1("FitnessSiteUploadWorker doWork -> " + r0);
        if (r0 != null) goto L6;
        ListenableWorker.Result r1 = ListenableWorker.Result.success();
        Intrinsics.O10IXXX0X(r1, "success(...)");
        return r1;
    L6:
        XXI0Xi.I0IIOi(this.context, r0, null, 4, null);
        ListenableWorker.Result r2 = ListenableWorker.Result.success();
        Intrinsics.O10IXXX0X(r2, "success(...)");
        return r2;
    }

    @aa1
    public final Context getContext() {
        return this.context;
    }
}
