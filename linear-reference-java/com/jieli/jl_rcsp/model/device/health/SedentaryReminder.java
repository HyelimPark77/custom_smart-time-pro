package com.jieli.jl_rcsp.model.device.health;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.model.device.AttrBean;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public class SedentaryReminder implements IHealthSettingToAttr {
    public static final byte MODE_BRIGHT = 0;
    public static final byte MODE_SHAKE = 1;
    public static final byte STATUS_CLOSE = 0;
    public static final byte STATUS_OPEN = 1;
    private byte endHour;
    private byte endMin;
    private boolean freeLunchBreak;
    private byte mode;
    private byte startHour;
    private byte startMin;
    private byte status;

    public SedentaryReminder(byte[] r1) {
        parseData(r1);
    }

    private void parseData(byte[] r6) {
        if (r6 != null) goto L4;
        return;
    L4:
        if (r6.length == 0) goto L25;
        boolean r0 = false;
        this.status = r6[0];
        int r2 = 2;
        if (r6.length < 2) goto L9;
        this.mode = r6[1];
    L10:
        int r4 = r2 + 1;
        if (r6.length >= r4) goto L13;
    L16:
        int r1 = r2 + 2;
        if (r6.length < r1) goto L20;
        this.startHour = r6[r2];
        this.startMin = r6[r2 + 1];
        r2 = r1;
    L20:
        if (r6.length < (r2 + 2)) goto L24;
        this.endHour = r6[r2];
        this.endMin = r6[r2 + 1];
        return;
    L24:
        return;
    L13:
        if (r6[r2] != 1) goto L15;
        r0 = true;
    L15:
        this.freeLunchBreak = r0;
        r2 = r4;
        goto L16
    L9:
        r2 = 1;
        goto L10
    }

    private byte[] toData() {
        ByteBuffer r0 = ByteBuffer.allocate(7);
        r0.put(this.status).put(this.mode).put(this.freeLunchBreak ? 1 : 0).put(this.startHour).put(this.startMin).put(this.endHour).put(this.endMin);
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
        return 2;
    }

    public boolean isFreeLunchBreak() {
        return this.freeLunchBreak;
    }

    public SedentaryReminder setEndHour(byte r1) {
        this.endHour = r1;
        return this;
    }

    public SedentaryReminder setEndMin(byte r1) {
        this.endMin = r1;
        return this;
    }

    public SedentaryReminder setFreeLunchBreak(boolean r1) {
        this.freeLunchBreak = r1;
        return this;
    }

    public SedentaryReminder setMode(byte r1) {
        this.mode = r1;
        return this;
    }

    public SedentaryReminder setStartHour(byte r1) {
        this.startHour = r1;
        return this;
    }

    public SedentaryReminder setStartMin(byte r1) {
        this.startMin = r1;
        return this;
    }

    public SedentaryReminder setStatus(byte r1) {
        this.status = r1;
        return this;
    }

    @Override // com.jieli.jl_rcsp.model.device.health.IHealthSettingToAttr
    public AttrBean toAttr() {
        return new AttrBean().setType((byte) getType()).setAttrData(toData());
    }

    public String toString() {
        return "SedentaryReminder{status=" + this.status + ", freeLunchBreak=" + this.freeLunchBreak + ", mode=" + this.mode + ", startHour=" + this.startHour + ", startMin=" + this.startMin + ", endHour=" + this.endHour + ", endMin=" + this.endMin + i0XO1.IO;
    }
}
