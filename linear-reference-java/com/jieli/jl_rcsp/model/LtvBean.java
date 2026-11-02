package com.jieli.jl_rcsp.model;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class LtvBean {
    private final byte[] data;
    private final int len;
    private final int type;

    public LtvBean(int r1, int r2, byte[] r3) {
        this.len = r1;
        this.type = r2;
        this.data = r3;
    }

    public byte[] getData() {
        return this.data;
    }

    public int getLen() {
        return this.len;
    }

    public int getType() {
        return this.type;
    }

    public String toString() {
        return "LtvBean{len=" + this.len + ", type=" + this.type + ", data=" + CHexConver.byte2HexStr(this.data) + i0XO1.IO;
    }
}
