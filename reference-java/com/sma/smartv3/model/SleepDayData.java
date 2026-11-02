package com.sma.smartv3.model;

import android.util.SparseIntArray;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class SleepDayData {

    @aa1
    private String evaluation;
    private int startTime;

    @aa1
    private SparseIntArray status;
    private int total;

    public SleepDayData() {
        this(0, 0, null, null, 15, null);
    }

    public static /* synthetic */ SleepDayData copy$default(SleepDayData sleepDayData, int i, int i2, SparseIntArray sparseIntArray, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = sleepDayData.total;
        }
        if ((i3 & 2) != 0) {
            i2 = sleepDayData.startTime;
        }
        if ((i3 & 4) != 0) {
            sparseIntArray = sleepDayData.status;
        }
        if ((i3 & 8) != 0) {
            str = sleepDayData.evaluation;
        }
        return sleepDayData.copy(i, i2, sparseIntArray, str);
    }

    public final int component1() {
        return this.total;
    }

    public final int component2() {
        return this.startTime;
    }

    @aa1
    public final SparseIntArray component3() {
        return this.status;
    }

    @aa1
    public final String component4() {
        return this.evaluation;
    }

    @aa1
    public final SleepDayData copy(int i, int i2, @aa1 SparseIntArray status, @aa1 String evaluation) {
        Intrinsics.X0O(status, "status");
        Intrinsics.X0O(evaluation, "evaluation");
        return new SleepDayData(i, i2, status, evaluation);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SleepDayData)) {
            return false;
        }
        SleepDayData sleepDayData = (SleepDayData) obj;
        return this.total == sleepDayData.total && this.startTime == sleepDayData.startTime && Intrinsics.XOO0ii0(this.status, sleepDayData.status) && Intrinsics.XOO0ii0(this.evaluation, sleepDayData.evaluation);
    }

    @aa1
    public final String getEvaluation() {
        return this.evaluation;
    }

    public final int getStartTime() {
        return this.startTime;
    }

    @aa1
    public final SparseIntArray getStatus() {
        return this.status;
    }

    public final int getTotal() {
        return this.total;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.total) * 31) + Integer.hashCode(this.startTime)) * 31) + this.status.hashCode()) * 31) + this.evaluation.hashCode();
    }

    public final void setEvaluation(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.evaluation = str;
    }

    public final void setStartTime(int i) {
        this.startTime = i;
    }

    public final void setStatus(@aa1 SparseIntArray sparseIntArray) {
        Intrinsics.X0O(sparseIntArray, "<set-?>");
        this.status = sparseIntArray;
    }

    public final void setTotal(int i) {
        this.total = i;
    }

    @aa1
    public String toString() {
        return "SleepDayData(total=" + this.total + ", startTime=" + this.startTime + ", status=" + this.status + ", evaluation=" + this.evaluation + I000IiI1O.C2156iO.f1007iO;
    }

    public SleepDayData(int i, int i2, @aa1 SparseIntArray status, @aa1 String evaluation) {
        Intrinsics.X0O(status, "status");
        Intrinsics.X0O(evaluation, "evaluation");
        this.total = i;
        this.startTime = i2;
        this.status = status;
        this.evaluation = evaluation;
    }

    public /* synthetic */ SleepDayData(int i, int i2, SparseIntArray sparseIntArray, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? new SparseIntArray() : sparseIntArray, (i3 & 8) != 0 ? HelpFormatter.DEFAULT_LONG_OPT_PREFIX : str);
    }
}
