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
        this(0, 0L, 0L, 7, null);
    }

    public static /* synthetic */ BGEMRecordSet copy$default(BGEMRecordSet bGEMRecordSet, int i, long j, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bGEMRecordSet.calendar;
        }
        if ((i2 & 2) != 0) {
            j = bGEMRecordSet.startDate;
        }
        if ((i2 & 4) != 0) {
            j2 = bGEMRecordSet.endDate;
        }
        return bGEMRecordSet.copy(i, j, j2);
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
    public final BGEMRecordSet copy(int i, long j, long j2) {
        return new BGEMRecordSet(i, j, j2);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BGEMRecordSet)) {
            return false;
        }
        BGEMRecordSet bGEMRecordSet = (BGEMRecordSet) obj;
        return this.calendar == bGEMRecordSet.calendar && this.startDate == bGEMRecordSet.startDate && this.endDate == bGEMRecordSet.endDate;
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

    public final void setCalendar(int i) {
        this.calendar = i;
    }

    public final void setEndDate(long j) {
        this.endDate = j;
    }

    public final void setStartDate(long j) {
        this.startDate = j;
    }

    @aa1
    public String toString() {
        return "BGEMRecordSet(calendar=" + this.calendar + ", startDate=" + this.startDate + ", endDate=" + this.endDate + I000IiI1O.C2156iO.f1007iO;
    }

    public BGEMRecordSet(int i, long j, long j2) {
        this.calendar = i;
        this.startDate = j;
        this.endDate = j2;
    }

    public /* synthetic */ BGEMRecordSet(int i, long j, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0L : j, (i2 & 4) != 0 ? 0L : j2);
    }
}
