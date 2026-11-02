package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;

/* JADX INFO: loaded from: classes19.dex */
public final class BloodOxyGenMinuteData {
    private int num;
    private int total;

    public BloodOxyGenMinuteData(int r1, int r2) {
        this.total = r1;
        this.num = r2;
    }

    public static /* synthetic */ BloodOxyGenMinuteData copy$default(BloodOxyGenMinuteData r0, int r1, int r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.total;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.num;
    L9:
        return r0.copy(r1, r2);
    }

    public final int component1() {
        return this.total;
    }

    public final int component2() {
        return this.num;
    }

    @aa1
    public final BloodOxyGenMinuteData copy(int r2, int r3) {
        return new BloodOxyGenMinuteData(r2, r3);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BloodOxyGenMinuteData) == true) goto L8;
        return false;
    L8:
        BloodOxyGenMinuteData r6 = (BloodOxyGenMinuteData) r5;
        if (this.total == r6.total) goto L12;
        return false;
    L12:
        if (this.num == r6.num) goto L14;
        return false;
    L14:
        return true;
    }

    public final int getNum() {
        return this.num;
    }

    public final int getTotal() {
        return this.total;
    }

    public int hashCode() {
        return (Integer.hashCode(this.total) * 31) + Integer.hashCode(this.num);
    }

    public final void setNum(int r1) {
        this.num = r1;
    }

    public final void setTotal(int r1) {
        this.total = r1;
    }

    @aa1
    public String toString() {
        return "BloodOxyGenMinuteData(total=" + this.total + ", num=" + this.num + I000IiI1O.iO.iO;
    }
}
