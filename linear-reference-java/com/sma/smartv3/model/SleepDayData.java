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
        int r1 = 0;
        int r2 = 0;
        SparseIntArray r3 = null;
        String r4 = null;
        this(r1, r2, r3, r4, 15, null);
    }

    public static /* synthetic */ SleepDayData copy$default(SleepDayData r0, int r1, int r2, SparseIntArray r3, String r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.total;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.startTime;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.status;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r0.evaluation;
    L15:
        return r0.copy(r1, r2, r3, r4);
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
    public final SleepDayData copy(int r2, int r3, @aa1 SparseIntArray r4, @aa1 String r5) {
        Intrinsics.X0O(r4, "status");
        Intrinsics.X0O(r5, "evaluation");
        return new SleepDayData(r2, r3, r4, r5);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof SleepDayData) == true) goto L8;
        return false;
    L8:
        SleepDayData r6 = (SleepDayData) r5;
        if (this.total == r6.total) goto L12;
        return false;
    L12:
        if (this.startTime == r6.startTime) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.status, r6.status) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.evaluation, r6.evaluation) == true) goto L20;
        return false;
    L20:
        return true;
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

    public final void setEvaluation(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.evaluation = r2;
    }

    public final void setStartTime(int r1) {
        this.startTime = r1;
    }

    public final void setStatus(@aa1 SparseIntArray r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.status = r2;
    }

    public final void setTotal(int r1) {
        this.total = r1;
    }

    @aa1
    public String toString() {
        return "SleepDayData(total=" + this.total + ", startTime=" + this.startTime + ", status=" + this.status + ", evaluation=" + this.evaluation + I000IiI1O.iO.iO;
    }

    public SleepDayData(int r2, int r3, @aa1 SparseIntArray r4, @aa1 String r5) {
        Intrinsics.X0O(r4, "status");
        Intrinsics.X0O(r5, "evaluation");
        this.total = r2;
        this.startTime = r3;
        this.status = r4;
        this.evaluation = r5;
    }

    public /* synthetic */ SleepDayData(int r2, int r3, SparseIntArray r4, String r5, int r6, DefaultConstructorMarker r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = new SparseIntArray();
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = HelpFormatter.DEFAULT_LONG_OPT_PREFIX;
    L14:
        this(r2, r3, r4, r5);
    }
}
