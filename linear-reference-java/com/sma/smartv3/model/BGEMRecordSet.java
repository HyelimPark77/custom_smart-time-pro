package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes19.dex */
public final class BGEMRecordSet {
    private int calendar;
    private long endDate;
    private long startDate;

    public BGEMRecordSet() {
        int r1 = 0;
        long r2 = 0;
        long r4 = 0;
        this(r1, r2, r4, 7, null);
    }

    public static /* synthetic */ BGEMRecordSet copy$default(BGEMRecordSet r0, int r1, long r2, long r4, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r0.calendar;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r0.startDate;
    L9:
        if ((r6 & 4) == 0) goto L11;
        r4 = r0.endDate;
    L11:
        long r8 = r4;
        int r3 = r1;
        return r0.copy(r3, r2, r8);
    }

    public final int component1() {
        return this.calendar;
    }

    public final long component2() {
        return this.startDate;
    }

    public final long component3() {
        return this.endDate;
    }

    @aa1
    public final BGEMRecordSet copy(int r7, long r8, long r10) {
        return new BGEMRecordSet(r7, r8, r10);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof BGEMRecordSet) == true) goto L8;
        return false;
    L8:
        BGEMRecordSet r9 = (BGEMRecordSet) r8;
        if (this.calendar == r9.calendar) goto L12;
        return false;
    L12:
        if (this.startDate == r9.startDate) goto L15;
        return false;
    L15:
        if (this.endDate == r9.endDate) goto L17;
        return false;
    L17:
        return true;
    }

    public final int getCalendar() {
        return this.calendar;
    }

    public final long getEndDate() {
        return this.endDate;
    }

    public final long getStartDate() {
        return this.startDate;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.calendar) * 31) + Long.hashCode(this.startDate)) * 31) + Long.hashCode(this.endDate);
    }

    public final void setCalendar(int r1) {
        this.calendar = r1;
    }

    public final void setEndDate(long r1) {
        this.endDate = r1;
    }

    public final void setStartDate(long r1) {
        this.startDate = r1;
    }

    @aa1
    public String toString() {
        return "BGEMRecordSet(calendar=" + this.calendar + ", startDate=" + this.startDate + ", endDate=" + this.endDate + I000IiI1O.iO.iO;
    }

    public BGEMRecordSet(int r1, long r2, long r4) {
        this.calendar = r1;
        this.startDate = r2;
        this.endDate = r4;
    }

    public /* synthetic */ BGEMRecordSet(int r3, long r4, long r6, int r8, DefaultConstructorMarker r9) {
        if ((r8 & 1) == 0) goto L6;
        r3 = 0;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r4 = 0;
    L9:
        if ((r8 & 4) == 0) goto L12;
        long r10 = 0;
    L13:
        this(r3, r4, r10);
        return;
    L12:
        r10 = r6;
        goto L13
    }
}
