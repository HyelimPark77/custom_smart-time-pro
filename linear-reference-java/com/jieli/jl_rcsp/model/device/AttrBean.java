package com.jieli.jl_rcsp.model.device;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class AttrBean {
    private byte[] attrData;
    private byte type;

    public AttrBean() {
    }

    public byte[] getAttrData() {
        return this.attrData;
    }

    public byte[] getData() {
        byte[] r2 = this.attrData;
        if (r2 == null) goto L10;
        if (r2.length == 0) goto L10;
        int r4 = r2.length;
        byte[] r5 = new byte[r4 + 2];
        r5[0] = (byte) (r4 + 1);
        r5[1] = this.type;
        System.arraycopy(r2, 0, r5, 2, r2.length);
        return r5;
    L10:
        return new byte[]{1, this.type};
    }

    public byte getType() {
        return this.type;
    }

    public AttrBean setAttrData(byte[] r1) {
        this.attrData = r1;
        return this;
    }

    public AttrBean setType(byte r1) {
        this.type = r1;
        return this;
    }

    public String toString() {
        return "AttrBean{type=" + this.type + ", attrData=" + CHexConver.byte2HexStr(this.attrData) + i0XO1.IO;
    }
}
