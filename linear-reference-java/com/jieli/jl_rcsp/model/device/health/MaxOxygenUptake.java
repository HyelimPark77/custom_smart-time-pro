package com.jieli.jl_rcsp.model.device.health;

import com.jieli.jl_rcsp.util.CHexConver;
import com.jieli.jl_rcsp.util.JL_Log;

/* JADX INFO: loaded from: classes17.dex */
public class MaxOxygenUptake extends HealthData {
    private int value;

    public MaxOxygenUptake(int r2, byte r3, byte[] r4) {
        super(7, r3, r4, r2);
        parseMaxOxygenUptakeData(r2, r3, r4);
    }

    private void parseMaxOxygenUptakeData(int r4, byte r5, byte[] r6) {
        if (r4 != 0) goto L13;
        byte[] r7 = CHexConver.getBooleanArrayBig(r5);
        int r8 = 0;
        int r0 = 0;
    L5:
        if (r8 >= r7.length) goto L12;
        if (r7[r8] != 1) goto L11;
        if (r8 != 0) goto L11;
        this.value = CHexConver.byteToInt(r6[r0]);
        r0 = r0 + 1;
    L11:
        r8 = r8 + 1;
        goto L5
    L12:
        return;
    L13:
        JL_Log.e("MaxOxygenUptake", "parseMaxOxygenUptakeData", "no support version : " + r4);
    }

    public int getValue() {
        return this.value;
    }

    @Override // com.jieli.jl_rcsp.model.device.health.HealthData
    public String toString() {
        return "MaxOxygenUptake{value=" + this.value + "} " + super.toString();
    }
}
