package com.jieli.jl_rcsp.model.device.health;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.model.device.AttrBean;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public class LiftWristDetection implements IHealthSettingToAttr {
    public static final byte MODE_BRIGHT = 0;
    public static final byte MODE_SHAKE = 1;
    public static final byte STATUS_ALL_DAY = 1;
    public static final byte STATUS_CLOSE = 0;
    public static final byte STATUS_CUSTOM_TIME = 2;
    byte endHour;
    byte endMin;
    byte mode;
    byte startHour;
    byte startMin;
    byte status;

    public LiftWristDetection(byte[] r1) {
        parseData(r1);
    }

    private void parseData(byte[] r8) {
        if (r8 != null) goto L4;
        return;
    L4:
        if (r8.length == 0) goto L19;
        this.status = r8[0];
        int r2 = 2;
        if (r8.length < 2) goto L9;
        this.mode = r8[1];
    L10:
        int r4 = r2 + 2;
        if (r8.length < r4) goto L14;
        this.startHour = (byte) Math.max(Math.min(r8[r2], 23), 0);
        this.startMin = (byte) Math.max(Math.min(r8[r2 + 1], 59), 0);
        r2 = r4;
    L14:
        if (r8.length < (r2 + 2)) goto L18;
        this.endHour = (byte) Math.max(Math.min(r8[r2], 23), 0);
        this.endMin = (byte) Math.max(Math.min(r8[r2 + 1], 59), 0);
        return;
    L18:
        return;
    L9:
        r2 = 1;
        goto L10
    }

    private byte[] toData() {
        ByteBuffer r0 = ByteBuffer.allocate(6);
        r0.put(this.status).put(this.mode).put(this.startHour).put(this.startMin).put(this.endHour).put(this.endMin);
        return r0.array();
    }

    public byte getEndHour() {
        return this.endHour;
    }

    public byte getEndMin() {
        return this.endMin;
    }

    public byte getMode() {
        return this.mode;
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
        return 8;
    }

    public LiftWristDetection setEndHour(byte r1) {
        this.endHour = r1;
        return this;
    }

    public LiftWristDetection setEndMin(byte r1) {
        this.endMin = r1;
        return this;
    }

    public LiftWristDetection setMode(byte r1) {
        this.mode = r1;
        return this;
    }

    public LiftWristDetection setStartHour(byte r1) {
        this.startHour = r1;
        return this;
    }

    public LiftWristDetection setStartMin(byte r1) {
        this.startMin = r1;
        return this;
    }

    public LiftWristDetection setStatus(byte r1) {
        this.status = r1;
        return this;
    }

    @Override // com.jieli.jl_rcsp.model.device.health.IHealthSettingToAttr
    public AttrBean toAttr() {
        return new AttrBean().setType((byte) getType()).setAttrData(toData());
    }

    public String toString() {
        return "MultiStateWithModeSwitch{status=" + this.status + ", startHour=" + this.startHour + ", startMin=" + this.startMin + ", endHour=" + this.endHour + ", endMin=" + this.endMin + ", mode=" + this.mode + i0XO1.IO;
    }
}
