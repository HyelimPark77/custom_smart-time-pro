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
        this(0.0f, 0.0f, 0.0f, 7, null);
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

    public final void setAvg(float f) {
        this.avg = f;
    }

    public final void setMax(float f) {
        this.max = f;
    }

    public final void setMin(float f) {
        this.min = f;
    }

    @aa1
    public String toString() {
        return "TemperatureDayData(max=" + this.max + ", min=" + this.min + ", avg=" + this.avg + I000IiI1O.C2156iO.f1007iO;
    }

    public TemperatureDayData(float f, float f2, float f3) {
        this.max = f;
        this.min = f2;
        this.avg = f3;
    }

    public /* synthetic */ TemperatureDayData(float f, float f2, float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3);
    }
}
