package com.jieli.jl_rcsp.model.device.health;

import com.jieli.jl_rcsp.util.CHexConver;
import com.jieli.jl_rcsp.util.JL_Log;

/* JADX INFO: loaded from: classes17.dex */
public class SportsSteps extends HealthData {
    private int calorie;
    private int distance;
    private int stepNum;

    public SportsSteps(int r2, byte r3, byte[] r4) {
        super(3, r3, r4, r2);
        parseSportsStepsData(r2, r3, r4);
    }

    private int getValueFromData(int r3, int r4, byte[] r5) {
        if (r5 != null) goto L4;
        return 0;
    L4:
        if ((r3 + r4) <= r5.length) goto L7;
        return 0;
    L7:
        return CHexConver.bytesToInt(r5, r3, r4);
    }

    private void parseSportsStepsData(int r4, byte r5, byte[] r6) {
        if (r4 != 0) goto L19;
        byte[] r7 = CHexConver.getBooleanArrayBig(r5);
        int r8 = 0;
        int r0 = 0;
    L5:
        if (r8 >= r7.length) goto L18;
        if (r7[r8] != 1) goto L17;
        if (r8 != 0) goto L10;
        this.stepNum = getValueFromData(r0, 4, r6);
        r0 = r0 + 4;
        goto L17
    L10:
        if (r8 == 1) goto L15;
        if (r8 != 2) goto L17;
        this.calorie = getValueFromData(r0, 2, r6);
    L14:
        r0 = r0 + 2;
        goto L17
    L15:
        this.distance = getValueFromData(r0, 2, r6);
    L17:
        r8 = r8 + 1;
        goto L5
    L18:
        return;
    L19:
        JL_Log.e("SportsSteps", "parseSportsStepsData", "no support version : " + r4);
    }

    public int getCalorie() {
        return this.calorie;
    }

    public int getDistance() {
        return this.distance;
    }

    public int getStepNum() {
        return this.stepNum;
    }

    @Override // com.jieli.jl_rcsp.model.device.health.HealthData
    public String toString() {
        return "SportsSteps{stepNum=" + this.stepNum + ", distance=" + this.distance + ", calorie=" + this.calorie + "} " + super.toString();
    }
}
