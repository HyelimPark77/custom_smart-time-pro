package com.jieli.jl_rcsp.model;

import com.android.mltcode.paycertificationapi.i0XO1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes17.dex */
public class HealthDataQuery {
    private final int mask;
    private final byte[] param;
    private final int version;

    public HealthDataQuery(int r1, int r2, byte[] r3) {
        this.version = r1;
        this.mask = r2;
        this.param = r3;
    }

    public int getMask() {
        return this.mask;
    }

    public byte[] getParam() {
        return this.param;
    }

    public int getVersion() {
        return this.version;
    }

    public String toString() {
        return "HealthDataQuery{version=" + this.version + ", mask=" + this.mask + ", param=" + Arrays.toString(this.param) + i0XO1.IO;
    }
}
