package com.jieli.jl_rcsp.model.device.health;

import com.jieli.jl_rcsp.util.CHexConver;
import com.jieli.jl_rcsp.util.JL_Log;

/* JADX INFO: loaded from: classes17.dex */
public class AirPressure extends HealthData {
    private static final int DATA_INTERVAL = 2;
    private int maxValue;
    private int minValue;
    private int realTimeValue;

    public AirPressure(int r2, byte r3, byte[] r4) {
        super(1, r3, r4, r2);
        parseAirPressureData(r2, r3, r4);
    }

    private int getValueFromData(int r3, byte[] r4) {
        if (r4 != null) goto L4;
        return 0;
    L4:
        if ((r3 + 2) <= r4.length) goto L7;
        return 0;
    L7:
        return CHexConver.bytesToInt(r4, r3, 2);
    }

    private void parseAirPressureData(int r4, byte r5, byte[] r6) {
        if (r4 != 0) goto L19;
        byte[] r7 = CHexConver.getBooleanArrayBig(r5);
        int r8 = 0;
        int r0 = 0;
    L5:
        if (r8 >= r7.length) goto L18;
        if (r7[r8] != 1) goto L17;
        if (r8 == 0) goto L16;
        if (r8 != 1) goto L11;
        this.minValue = getValueFromData(r0, r6);
    L14:
        r0 = r0 + 2;
        goto L17
    L11:
        if (r8 != 2) goto L17;
        this.maxValue = getValueFromData(r0, r6);
        goto L14
    L16:
        this.realTimeValue = getValueFromData(r0, r6);
    L17:
        r8 = r8 + 1;
        goto L5
    L18:
        return;
    L19:
        JL_Log.e("AirPressure", "parseAirPressureData", "no support version : " + r4);
    }

    public int getMaxValue() {
        return this.maxValue;
    }

    public int getMinValue() {
        return this.minValue;
    }

    public int getRealTimeValue() {
        return this.realTimeValue;
    }

    @Override // com.jieli.jl_rcsp.model.device.health.HealthData
    public String toString() {
        return "AirPressure{realTimeValue=" + this.realTimeValue + ", minValue=" + this.minValue + ", maxValue=" + this.maxValue + "} " + super.toString();
    }
}
