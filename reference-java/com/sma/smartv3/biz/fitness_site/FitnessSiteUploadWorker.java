package com.sma.smartv3.biz.fitness_site;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.android.mltcode.paycertificationapi.XXI0Xi;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.entity.WorkoutIndex;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class FitnessSiteUploadWorker extends Worker {

    @aa1
    public static final OXO1 Companion = new OXO1(null);

    @aa1
    public static final String TAG = "FitnessSiteUploadWorker";

    @aa1
    private final Context context;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public OXO1() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FitnessSiteUploadWorker(@aa1 Context context, @aa1 WorkerParameters params) {
        super(context, params);
        Intrinsics.X0O(context, "context");
        Intrinsics.X0O(params, "params");
        this.context = context;
    }

    @Override // androidx.work.Worker
    @aa1
    public ListenableWorker.Result doWork() {
        WorkoutIndex notSynced = MyDb.INSTANCE.getMDatabase().workoutIndexDao().getNotSynced();
        i1O0OXO1O.OXO1.OXO1("FitnessSiteUploadWorker doWork -> " + notSynced);
        if (notSynced == null) {
            ListenableWorker.Result resultSuccess = ListenableWorker.Result.success();
            Intrinsics.O10IXXX0X(resultSuccess, "success(...)");
            return resultSuccess;
        }
        XXI0Xi.I0IIOi(this.context, notSynced, null, 4, null);
        ListenableWorker.Result resultSuccess2 = ListenableWorker.Result.success();
        Intrinsics.O10IXXX0X(resultSuccess2, "success(...)");
        return resultSuccess2;
    }

    @aa1
    public final Context getContext() {
        return this.context;
    }
}
