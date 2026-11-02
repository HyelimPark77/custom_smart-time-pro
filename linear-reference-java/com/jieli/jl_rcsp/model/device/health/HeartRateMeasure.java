package com.jieli.jl_rcsp.model.device.health;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.model.device.AttrBean;
import com.jieli.jl_rcsp.util.CHexConver;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes17.dex */
public class HeartRateMeasure implements IHealthSettingToAttr {
    public static final byte MODE_BRIGHT = 0;
    public static final byte MODE_SHAKE = 1;
    private boolean enable;
    private int maxHeartRate;
    private int minHeartRate;
    private byte mode;

    public HeartRateMeasure(byte[] r2) {
        this.maxHeartRate = -1;
        this.minHeartRate = -1;
        parseData(r2);
    }

    private void parseData(byte[] r4) {
        if (r4 != null) goto L4;
        return;
    L4:
        if (r4.length == 0) goto L21;
        boolean r0 = false;
        int r2 = 1;
        if (CHexConver.byteToInt(r4[0]) != 1) goto L9;
        r0 = true;
    L9:
        this.enable = r0;
        if (r4.length <= 1) goto L13;
        this.mode = r4[1];
        r2 = 2;
    L13:
        if (r4.length <= 2) goto L16;
        this.maxHeartRate = CHexConver.byteToInt(r4[r2]);
        r2 = r2 + 1;
    L16:
        if (r4.length <= 3) goto L20;
        this.minHeartRate = CHexConver.byteToInt(r4[r2]);
        return;
    L20:
        return;
    }

    private byte[] toData() {
        ByteArrayOutputStream r0 = new ByteArrayOutputStream();
        r0.write(new byte[]{this.enable ? 1 : 0, this.mode});     // Catch: IOException -> L5
    L7:
        int r2 = this.maxHeartRate;
        if (r2 == (-1)) goto L10;
    L13:
        if (r2 != (-1)) goto L16;
        this.maxHeartRate = 0;
    L16:
        if (this.minHeartRate != (-1)) goto L18;
        this.minHeartRate = 0;
    L18:
        byte[] r1 = {CHexConver.intToByte(this.maxHeartRate), CHexConver.intToByte(this.minHeartRate)};
    L19:
        if (r1 == null) goto L25;
        r0.write(r1);     // Catch: IOException -> L22
    L22:
        e = move-exception;
        e.printStackTrace();
    L25:
        return r0.toByteArray();
    L10:
        if (this.minHeartRate != (-1)) goto L13;
        r1 = null;
    L5:
        e = move-exception;
        e.printStackTrace();
        goto L7
    }

    public int getMaxHeartRate() {
        return this.maxHeartRate;
    }

    public int getMinHeartRate() {
        return this.minHeartRate;
    }

    public byte getMode() {
        return this.mode;
    }

    @Override // com.jieli.jl_rcsp.model.device.health.IHealthSettingToAttr
    public int getType() {
        return 3;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public HeartRateMeasure setEnable(boolean r1) {
        this.enable = r1;
        return this;
    }

    public HeartRateMeasure setMaxHeartRate(int r1) {
        this.maxHeartRate = r1;
        return this;
    }

    public HeartRateMeasure setMinHeartRate(int r1) {
        this.minHeartRate = r1;
        return this;
    }

    public HeartRateMeasure setMode(byte r1) {
        this.mode = r1;
        return this;
    }

    @Override // com.jieli.jl_rcsp.model.device.health.IHealthSettingToAttr
    public AttrBean toAttr() {
        return new AttrBean().setType((byte) getType()).setAttrData(toData());
    }

    public String toString() {
        return "HeartRateMeasure{enable=" + this.enable + ", mode=" + this.mode + ", maxHeartRate=" + this.maxHeartRate + ", minHeartRate=" + this.minHeartRate + i0XO1.IO;
    }
}
