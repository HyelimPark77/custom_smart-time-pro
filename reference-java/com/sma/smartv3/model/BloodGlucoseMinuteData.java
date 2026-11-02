package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;

/* JADX INFO: loaded from: classes19.dex */
public final class BloodGlucoseMinuteData {
    private int num;
    private int total;

    public BloodGlucoseMinuteData(int i, int i2) {
        this.total = i;
        this.num = i2;
    }

    public static /* synthetic */ BloodGlucoseMinuteData copy$default(BloodGlucoseMinuteData bloodGlucoseMinuteData, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = bloodGlucoseMinuteData.total;
        }
        if ((i3 & 2) != 0) {
            i2 = bloodGlucoseMinuteData.num;
        }
        return bloodGlucoseMinuteData.copy(i, i2);
    }

    public final int component1() {
        return this.total;
    }

    public final int component2() {
        return this.num;
    }

    @aa1
    public final BloodGlucoseMinuteData copy(int i, int i2) {
        return new BloodGlucoseMinuteData(i, i2);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BloodGlucoseMinuteData)) {
            return false;
        }
        BloodGlucoseMinuteData bloodGlucoseMinuteData = (BloodGlucoseMinuteData) obj;
        return this.total == bloodGlucoseMinuteData.total && this.num == bloodGlucoseMinuteData.num;
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

    public final void setNum(int i) {
        this.num = i;
    }

    public final void setTotal(int i) {
        this.total = i;
    }

    @aa1
    public String toString() {
        return "BloodGlucoseMinuteData(total=" + this.total + ", num=" + this.num + I000IiI1O.C2156iO.f1007iO;
    }
}
