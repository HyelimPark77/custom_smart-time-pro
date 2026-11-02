package com.jieli.jl_rcsp.model.device;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.constant.RcspConstant;
import java.util.Arrays;

/* JADX INFO: loaded from: classes17.dex */
public class EqInfo {
    private int count;
    private boolean dynamic;
    private int[] freqs;
    private int mode;
    private byte[] value;

    public EqInfo() {
        this.value = new byte[10];
        this.freqs = RcspConstant.DEFAULT_EQ_FREQS;
        this.count = 10;
    }

    public EqInfo copy() {
        EqInfo r0 = new EqInfo(this.mode, this.value, getFreqs());
        r0.count = this.count;
        r0.setDynamic(this.dynamic);
        return r0;
    }

    public int getCount() {
        return this.count;
    }

    public int[] getFreqs() {
        return this.freqs;
    }

    public int getMode() {
        return this.mode;
    }

    public byte[] getValue() {
        return this.value;
    }

    public boolean isDynamic() {
        return this.dynamic;
    }

    public void setDynamic(boolean r1) {
        this.dynamic = r1;
    }

    public void setFreqs(int[] r1) {
        this.freqs = r1;
        this.count = r1.length;
    }

    public void setMode(int r1) {
        this.mode = r1;
    }

    public void setValue(byte[] r1) {
        this.value = r1;
    }

    public String toString() {
        return "EqInfo{mode=" + this.mode + ", isNew=" + this.dynamic + ", value=" + Arrays.toString(this.value) + ", freqs=" + Arrays.toString(this.freqs) + i0XO1.IO;
    }

    public EqInfo(int r3, byte[] r4) {
        this.value = new byte[10];
        this.freqs = RcspConstant.DEFAULT_EQ_FREQS;
        this.count = 10;
        setMode(r3);
        setValue(r4);
    }

    public EqInfo(int r3, byte[] r4, int[] r5) {
        this.value = new byte[10];
        this.freqs = RcspConstant.DEFAULT_EQ_FREQS;
        this.count = 10;
        setMode(r3);
        setValue(r4);
        setFreqs(r5);
    }
}
