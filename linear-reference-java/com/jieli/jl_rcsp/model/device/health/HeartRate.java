package com.jieli.jl_rcsp.model.device.health;

import com.jieli.jl_rcsp.util.CHexConver;
import com.jieli.jl_rcsp.util.JL_Log;

/* JADX INFO: loaded from: classes17.dex */
public class HeartRate extends HealthData {
    private static final int DATA_INTERVAL = 1;
    private int maxValue;
    private int realTimeValue;
    private int restingValue;
    private int singleTestValue;

    public HeartRate(int r2, byte r3, byte[] r4) {
        super(0, r3, r4, r2);
        parseHeartRateData(r2, r3, r4);
    }

    private int getValueFromData(int r3, byte[] r4) {
        if (r4 != null) goto L4;
        return 0;
    L4:
        if ((r3 + 1) <= r4.length) goto L7;
        return 0;
    L7:
        return CHexConver.byteToInt(r4[r3]);
    }

    private void parseHeartRateData(int r4, byte r5, byte[] r6) {
        if (r4 != 0) goto L22;
        byte[] r7 = CHexConver.getBooleanArrayBig(r5);
        int r8 = 0;
        int r0 = 0;
    L5:
        if (r8 >= r7.length) goto L21;
        if (r7[r8] != 1) goto L20;
        if (r8 == 0) goto L19;
        if (r8 != 1) goto L11;
        this.restingValue = getValueFromData(r0, r6);
    L16:
        r0 = r0 + 1;
        goto L20
    L11:
        if (r8 != 2) goto L13;
        this.maxValue = getValueFromData(r0, r6);
        goto L16
    L13:
        if (r8 != 3) goto L20;
        this.singleTestValue = getValueFromData(r0, r6);
        goto L16
    L19:
        this.realTimeValue = getValueFromData(r0, r6);
    L20:
        r8 = r8 + 1;
        goto L5
    L21:
        return;
    L22:
        JL_Log.e("HeartRate", "parseHeartRateData", "no support version : " + r4);
    }

    public int getMaxValue() {
        return this.maxValue;
    }

    public int getRealTimeValue() {
        return this.realTimeValue;
    }

    public int getRestingValue() {
        return this.restingValue;
    }

    public int getSingleTestValue() {
        return this.singleTestValue;
    }

    @Override // com.jieli.jl_rcsp.model.device.health.HealthData
    public String toString() {
        return "HeartRate{realTimeValue=" + this.realTimeValue + ", restingValue=" + this.restingValue + ", maxValue=" + this.maxValue + ", singleTestValue=" + this.singleTestValue + "} " + super.toString();
    }
}
