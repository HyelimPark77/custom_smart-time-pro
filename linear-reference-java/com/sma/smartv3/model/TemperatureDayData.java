package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes19.dex */
public final class TemperatureDayData {
    private float avg;
    private float max;
    private float min;

    public TemperatureDayData() {
        float r1 = 0.0f;
        float r2 = 0.0f;
        float r3 = 0.0f;
        this(r1, r2, r3, 7, null);
    }

    public final float getAvg() {
        return this.avg;
    }

    public final float getMax() {
        return this.max;
    }

    public final float getMin() {
        return this.min;
    }

    public final void setAvg(float r1) {
        this.avg = r1;
    }

    public final void setMax(float r1) {
        this.max = r1;
    }

    public final void setMin(float r1) {
        this.min = r1;
    }

    @aa1
    public String toString() {
        return "TemperatureDayData(max=" + this.max + ", min=" + this.min + ", avg=" + this.avg + I000IiI1O.iO.iO;
    }

    public TemperatureDayData(float r1, float r2, float r3) {
        this.max = r1;
        this.min = r2;
        this.avg = r3;
    }

    public /* synthetic */ TemperatureDayData(float r2, float r3, float r4, int r5, DefaultConstructorMarker r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = 0.0f;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = 0.0f;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = 0.0f;
    L11:
        this(r2, r3, r4);
    }
}
