package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class MenstrualPeriodResults {

    @aa1
    private String mCalendar;
    private int mType;

    /* JADX WARN: Multi-variable type inference failed */
    public MenstrualPeriodResults() {
        String r2 = null;
        this(r2, 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ MenstrualPeriodResults copy$default(MenstrualPeriodResults r0, String r1, int r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.mCalendar;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.mType;
    L9:
        return r0.copy(r1, r2);
    }

    @aa1
    public final String component1() {
        return this.mCalendar;
    }

    public final int component2() {
        return this.mType;
    }

    @aa1
    public final MenstrualPeriodResults copy(@aa1 String r2, int r3) {
        Intrinsics.X0O(r2, "mCalendar");
        return new MenstrualPeriodResults(r2, r3);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof MenstrualPeriodResults) == true) goto L8;
        return false;
    L8:
        MenstrualPeriodResults r6 = (MenstrualPeriodResults) r5;
        if (Intrinsics.XOO0ii0(this.mCalendar, r6.mCalendar) == true) goto L12;
        return false;
    L12:
        if (this.mType == r6.mType) goto L14;
        return false;
    L14:
        return true;
    }

    @aa1
    public final String getMCalendar() {
        return this.mCalendar;
    }

    public final int getMType() {
        return this.mType;
    }

    public int hashCode() {
        return (this.mCalendar.hashCode() * 31) + Integer.hashCode(this.mType);
    }

    public final void setMCalendar(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mCalendar = r2;
    }

    public final void setMType(int r1) {
        this.mType = r1;
    }

    @aa1
    public String toString() {
        return "MenstrualPeriodResults(mCalendar=" + this.mCalendar + ", mType=" + this.mType + HexStringBuilder.COMMENT_END_CHAR;
    }

    public MenstrualPeriodResults(@aa1 String r2, int r3) {
        Intrinsics.X0O(r2, "mCalendar");
        this.mCalendar = r2;
        this.mType = r3;
    }

    public /* synthetic */ MenstrualPeriodResults(String r1, int r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = "";
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = 0;
    L8:
        this(r1, r2);
    }
}
