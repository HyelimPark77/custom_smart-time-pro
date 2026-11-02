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
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        SparseIntArray r4 = null;
        String r5 = null;
        List r6 = null;
        this(r1, r2, r3, r4, r5, r6, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SleepAllDayData copy$default(SleepAllDayData r0, int r1, int r2, int r3, SparseIntArray r4, String r5, List r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r0.total;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r0.startTime;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = r0.endTime;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r4 = r0.status;
    L15:
        if ((r7 & 16) == 0) goto L18;
        r5 = r0.evaluation;
    L18:
        if ((r7 & 32) == 0) goto L20;
        r6 = r0.analyseSleep;
    L20:
        String r9 = r5;
        List r10 = r6;
        int r11 = r3;
        SparseIntArray r12 = r4;
        return r0.copy(r1, r2, r11, r12, r9, r10);
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
    public final SleepAllDayData copy(int r9, int r10, int r11, @aa1 SparseIntArray r12, @aa1 String r13, @aa1 List<BleSleep> r14) {
        Intrinsics.X0O(r12, "status");
        Intrinsics.X0O(r13, "evaluation");
        Intrinsics.X0O(r14, "analyseSleep");
        return new SleepAllDayData(r9, r10, r11, r12, r13, r14);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof SleepAllDayData) == true) goto L8;
        return false;
    L8:
        SleepAllDayData r6 = (SleepAllDayData) r5;
        if (this.total == r6.total) goto L12;
        return false;
    L12:
        if (this.startTime == r6.startTime) goto L15;
        return false;
    L15:
        if (this.endTime == r6.endTime) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.status, r6.status) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.evaluation, r6.evaluation) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.analyseSleep, r6.analyseSleep) == true) goto L26;
        return false;
    L26:
        return true;
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

    public final void setAnalyseSleep(@aa1 List<BleSleep> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.analyseSleep = r2;
    }

    public final void setEndTime(int r1) {
        this.endTime = r1;
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
        return "SleepAllDayData(total=" + this.total + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", status=" + this.status + ", evaluation=" + this.evaluation + ", analyseSleep=" + this.analyseSleep + I000IiI1O.iO.iO;
    }

    public SleepAllDayData(int r2, int r3, int r4, @aa1 SparseIntArray r5, @aa1 String r6, @aa1 List<BleSleep> r7) {
        Intrinsics.X0O(r5, "status");
        Intrinsics.X0O(r6, "evaluation");
        Intrinsics.X0O(r7, "analyseSleep");
        this.total = r2;
        this.startTime = r3;
        this.endTime = r4;
        this.status = r5;
        this.evaluation = r6;
        this.analyseSleep = r7;
    }

    public /* synthetic */ SleepAllDayData(int r2, int r3, int r4, SparseIntArray r5, String r6, List r7, int r8, DefaultConstructorMarker r9) {
        if ((r8 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r5 = new SparseIntArray();
    L15:
        if ((r8 & 16) == 0) goto L18;
        r6 = HelpFormatter.DEFAULT_LONG_OPT_PREFIX;
    L18:
        if ((r8 & 32) == 0) goto L20;
        r7 = CollectionsKt__CollectionsKt.iI();
    L20:
        List r10 = r7;
        String r11 = r6;
        SparseIntArray r12 = r5;
        int r13 = r4;
        this(r2, r3, r13, r12, r11, r10);
    }
}
