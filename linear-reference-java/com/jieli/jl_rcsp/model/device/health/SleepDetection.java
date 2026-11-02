package com.jieli.jl_rcsp.model.device.health;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.model.device.AttrBean;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public class SleepDetection implements IHealthSettingToAttr {
    public static final byte STATUS_ALL_DAY = 1;
    public static final byte STATUS_CLOSE = 0;
    public static final byte STATUS_CUSTOM_TIME = 2;
    byte endHour;
    byte endMin;
    byte startHour;
    byte startMin;
    private byte status;

    public SleepDetection(byte[] r1) {
        parseData(r1);
    }

    private void parseData(byte[] r8) {
        if (r8 != null) goto L4;
        return;
    L4:
        if (r8.length == 0) goto L16;
        this.status = r8[0];
        int r4 = 3;
        if (r8.length < 3) goto L9;
        this.startHour = (byte) Math.max(Math.min(r8[1], 23), 0);
        this.startMin = (byte) Math.max(Math.min(r8[2], 59), 0);
    L11:
        if (r8.length < (r4 + 2)) goto L15;
        this.endHour = (byte) Math.max(Math.min(r8[r4], 23), 0);
        this.endMin = (byte) Math.max(Math.min(r8[r4 + 1], 59), 0);
        return;
    L15:
        return;
    L9:
        r4 = 1;
        goto L11
    }

    private byte[] toData() {
        ByteBuffer r0 = ByteBuffer.allocate(5);
        r0.put(this.status).put(this.startHour).put(this.startMin).put(this.endHour).put(this.endMin);
        return r0.array();
    }

    public byte getEndHour() {
        return this.endHour;
    }

    public byte getEndMin() {
        return this.endMin;
    }

    public byte getStartHour() {
        return this.startHour;
    }

    public byte getStartMin() {
        return this.startMin;
    }

    public byte getStatus() {
        return this.status;
    }

    @Override // com.jieli.jl_rcsp.model.device.health.IHealthSettingToAttr
    public int getType() {
        return 6;
    }

    public SleepDetection setEndHour(byte r1) {
        this.endHour = r1;
        return this;
    }

    public SleepDetection setEndMin(byte r1) {
        this.endMin = r1;
        return this;
    }

    public SleepDetection setStartHour(byte r1) {
        this.startHour = r1;
        return this;
    }

    public SleepDetection setStartMin(byte r1) {
        this.startMin = r1;
        return this;
    }

    public SleepDetection setStatus(byte r1) {
        this.status = r1;
        return this;
    }

    @Override // com.jieli.jl_rcsp.model.device.health.IHealthSettingToAttr
    public AttrBean toAttr() {
        return new AttrBean().setType((byte) getType()).setAttrData(toData());
    }

    public String toString() {
        return "SleepDetection{status=" + this.status + ", startHour=" + this.startHour + ", startMin=" + this.startMin + ", endHour=" + this.endHour + ", endMin=" + this.endMin + i0XO1.IO;
    }
}
