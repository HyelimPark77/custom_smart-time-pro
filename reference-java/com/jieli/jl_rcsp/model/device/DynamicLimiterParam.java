package com.jieli.jl_rcsp.model.device;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class DynamicLimiterParam {
    public static final int MASK = 2;
    private int value;

    public DynamicLimiterParam() {
    }

    public static DynamicLimiterParam parseData(byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            return null;
        }
        return new DynamicLimiterParam(CHexConver.bytesToInt(bArr, 0, 2));
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int i) {
        this.value = i;
    }

    public byte[] toData() {
        return CHexConver.int2byte2(this.value);
    }

    public String toString() {
        return "DynamicLimiterParam{value=" + this.value + i0XO1.f7442IO;
    }

    public DynamicLimiterParam(int i) {
        setValue(i);
    }
}
