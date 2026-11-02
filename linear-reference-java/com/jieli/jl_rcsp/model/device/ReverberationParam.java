package com.jieli.jl_rcsp.model.device;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.util.CHexConver;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes17.dex */
public class ReverberationParam {
    public static final int MASK = 1;
    private int depthValue;
    private boolean isOn;
    private int strengthValue;

    public ReverberationParam() {
    }

    public static ReverberationParam parseData(byte[] r4) {
        if (r4 != null) goto L4;
        return null;
    L4:
        if (r4.length < 5) goto L13;
        boolean r0 = false;
        if (r4[0] != 1) goto L10;
        r0 = true;
    L10:
        return new ReverberationParam(r0, CHexConver.bytesToInt(r4, 1, 2), CHexConver.bytesToInt(r4, 3, 2));
    L13:
        return null;
    }

    public int getDepthValue() {
        return this.depthValue;
    }

    public int getStrengthValue() {
        return this.strengthValue;
    }

    public boolean isOn() {
        return this.isOn;
    }

    public void setDepthValue(int r1) {
        this.depthValue = r1;
    }

    public void setOn(boolean r1) {
        this.isOn = r1;
    }

    public void setStrengthValue(int r1) {
        this.strengthValue = r1;
    }

    public byte[] toData() {
        ByteArrayOutputStream r0 = new ByteArrayOutputStream();
        r0.write(CHexConver.intToByte(this.isOn ? 1 : 0));
        r0.write(CHexConver.int2byte2(this.depthValue));     // Catch: IOException -> L5
        r0.write(CHexConver.int2byte2(this.strengthValue));     // Catch: IOException -> L5
    L8:
        return r0.toByteArray();
    L5:
        e = move-exception;
        e.printStackTrace();
        goto L8
    }

    public String toString() {
        return "ReverberationParam{isOn=" + this.isOn + ", depthValue=" + this.depthValue + ", strengthValue=" + this.strengthValue + i0XO1.IO;
    }

    public ReverberationParam(boolean r1, int r2, int r3) {
        setOn(r1);
        setDepthValue(r2);
        setStrengthValue(r3);
    }
}
