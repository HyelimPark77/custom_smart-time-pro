package com.sma.smartv3.model;

import android.util.SparseIntArray;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import com.szabh.smable3.entity.BleSleep;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class SleepAllDayData {

    @aa1
    private List<BleSleep> analyseSleep;
    private int endTime;

    @aa1
    private String evaluation;
    private int startTime;

    @aa1
    private SparseIntArray status;
    private int total;

    public SleepAllDayData() {
        this(0, 0, 0, null, null, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SleepAllDayData copy$default(SleepAllDayData sleepAllDayData, int i, int i2, int i3, SparseIntArray sparseIntArray, String str, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = sleepAllDayData.total;
        }
        if ((i4 & 2) != 0) {
            i2 = sleepAllDayData.startTime;
        }
        if ((i4 & 4) != 0) {
            i3 = sleepAllDayData.endTime;
        }
        if ((i4 & 8) != 0) {
            sparseIntArray = sleepAllDayData.status;
        }
        if ((i4 & 16) != 0) {
            str = sleepAllDayData.evaluation;
        }
        if ((i4 & 32) != 0) {
            list = sleepAllDayData.analyseSleep;
        }
        String str2 = str;
        List list2 = list;
        return sleepAllDayData.copy(i, i2, i3, sparseIntArray, str2, list2);
    }

    public final int component1() {
        return this.total;
    }

    public final int component2() {
        return this.startTime;
    }

    public final int component3() {
        return this.endTime;
    }

    @aa1
    public final SparseIntArray component4() {
        return this.status;
    }

    @aa1
    public final String component5() {
        return this.evaluation;
    }

    @aa1
    public final List<BleSleep> component6() {
        return this.analyseSleep;
    }

    @aa1
    public final SleepAllDayData copy(int i, int i2, int i3, @aa1 SparseIntArray status, @aa1 String evaluation, @aa1 List<BleSleep> analyseSleep) {
        Intrinsics.X0O(status, "status");
        Intrinsics.X0O(evaluation, "evaluation");
        Intrinsics.X0O(analyseSleep, "analyseSleep");
        return new SleepAllDayData(i, i2, i3, status, evaluation, analyseSleep);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SleepAllDayData)) {
            return false;
        }
        SleepAllDayData sleepAllDayData = (SleepAllDayData) obj;
        return this.total == sleepAllDayData.total && this.startTime == sleepAllDayData.startTime && this.endTime == sleepAllDayData.endTime && Intrinsics.XOO0ii0(this.status, sleepAllDayData.status) && Intrinsics.XOO0ii0(this.evaluation, sleepAllDayData.evaluation) && Intrinsics.XOO0ii0(this.analyseSleep, sleepAllDayData.analyseSleep);
    }

    @aa1
    public final List<BleSleep> getAnalyseSleep() {
        return this.analyseSleep;
    }

    public final int getEndTime() {
        return this.endTime;
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
        return (((((((((Integer.hashCode(this.total) * 31) + Integer.hashCode(this.startTime)) * 31) + Integer.hashCode(this.endTime)) * 31) + this.status.hashCode()) * 31) + this.evaluation.hashCode()) * 31) + this.analyseSleep.hashCode();
    }

    public final void setAnalyseSleep(@aa1 List<BleSleep> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.analyseSleep = list;
    }

    public final void setEndTime(int i) {
        this.endTime = i;
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
        return "SleepAllDayData(total=" + this.total + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", status=" + this.status + ", evaluation=" + this.evaluation + ", analyseSleep=" + this.analyseSleep + I000IiI1O.C2156iO.f1007iO;
    }

    public SleepAllDayData(int i, int i2, int i3, @aa1 SparseIntArray status, @aa1 String evaluation, @aa1 List<BleSleep> analyseSleep) {
        Intrinsics.X0O(status, "status");
        Intrinsics.X0O(evaluation, "evaluation");
        Intrinsics.X0O(analyseSleep, "analyseSleep");
        this.total = i;
        this.startTime = i2;
        this.endTime = i3;
        this.status = status;
        this.evaluation = evaluation;
        this.analyseSleep = analyseSleep;
    }

    public /* synthetic */ SleepAllDayData(int i, int i2, int i3, SparseIntArray sparseIntArray, String str, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? new SparseIntArray() : sparseIntArray, (i4 & 16) != 0 ? HelpFormatter.DEFAULT_LONG_OPT_PREFIX : str, (i4 & 32) != 0 ? CollectionsKt__CollectionsKt.m39402iI() : list);
    }
}
