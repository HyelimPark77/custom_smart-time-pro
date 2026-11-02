package com.jieli.jl_rcsp.model.device;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class DynamicLimiterParam {
    public static final int MASK = 2;
    private int value;

    public DynamicLimiterParam() {
    }

    public static DynamicLimiterParam parseData(byte[] r3) {
        if (r3 != null) goto L4;
        return null;
    L4:
        if (r3.length >= 2) goto L7;
        return null;
    L7:
        return new DynamicLimiterParam(CHexConver.bytesToInt(r3, 0, 2));
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int r1) {
        this.value = r1;
    }

    public byte[] toData() {
        return CHexConver.int2byte2(this.value);
    }

    public String toString() {
        return "DynamicLimiterParam{value=" + this.value + i0XO1.IO;
    }

    public DynamicLimiterParam(int r1) {
        setValue(r1);
    }
}
