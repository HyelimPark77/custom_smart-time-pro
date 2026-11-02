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
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ MenstrualPeriodResults copy$default(MenstrualPeriodResults menstrualPeriodResults, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = menstrualPeriodResults.mCalendar;
        }
        if ((i2 & 2) != 0) {
            i = menstrualPeriodResults.mType;
        }
        return menstrualPeriodResults.copy(str, i);
    }

    @aa1
    public final String component1() {
        return this.mCalendar;
    }

    public final int component2() {
        return this.mType;
    }

    @aa1
    public final MenstrualPeriodResults copy(@aa1 String mCalendar, int i) {
        Intrinsics.X0O(mCalendar, "mCalendar");
        return new MenstrualPeriodResults(mCalendar, i);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MenstrualPeriodResults)) {
            return false;
        }
        MenstrualPeriodResults menstrualPeriodResults = (MenstrualPeriodResults) obj;
        return Intrinsics.XOO0ii0(this.mCalendar, menstrualPeriodResults.mCalendar) && this.mType == menstrualPeriodResults.mType;
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

    public final void setMCalendar(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mCalendar = str;
    }

    public final void setMType(int i) {
        this.mType = i;
    }

    @aa1
    public String toString() {
        return "MenstrualPeriodResults(mCalendar=" + this.mCalendar + ", mType=" + this.mType + HexStringBuilder.COMMENT_END_CHAR;
    }

    public MenstrualPeriodResults(@aa1 String mCalendar, int i) {
        Intrinsics.X0O(mCalendar, "mCalendar");
        this.mCalendar = mCalendar;
        this.mType = i;
    }

    public /* synthetic */ MenstrualPeriodResults(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i);
    }
}
