package com.jieli.jl_rcsp.model.device.health;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.model.device.AttrBean;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class BloodOxygenMeasurementAlert implements IHealthSettingToAttr {
    public static final int MODE_SMART = 0;
    public static final int MODE_TIMING = 1;
    public static final int STATE_CLOSE = 0;
    public static final int STATE_OPEN = 1;
    private int limitingValue;
    private int mode;
    private int state;

    public BloodOxygenMeasurementAlert(byte[] r1) {
        parseData(r1);
    }

    private void parseData(byte[] r4) {
        if (r4 != null) goto L4;
        return;
    L4:
        if (r4.length == 0) goto L15;
        this.state = CHexConver.byteToInt(r4[0]);
        char r2 = 1;
        if (r4.length <= 1) goto L10;
        this.mode = CHexConver.byteToInt(r4[1]);
        r2 = 2;
    L10:
        if (r4.length <= 2) goto L14;
        this.limitingValue = CHexConver.byteToInt(r4[r2]);
        return;
    L14:
        return;
    }

    private byte[] toData() {
        return new byte[]{CHexConver.intToByte(this.state), CHexConver.intToByte(this.mode), CHexConver.intToByte(this.limitingValue)};
    }

    public int getLimitingValue() {
        return this.limitingValue;
    }

    public int getMode() {
        return this.mode;
    }

    public int getState() {
        return this.state;
    }

    @Override // com.jieli.jl_rcsp.model.device.health.IHealthSettingToAttr
    public int getType() {
        return 11;
    }

    public BloodOxygenMeasurementAlert setLimitingValue(int r1) {
        this.limitingValue = r1;
        return this;
    }

    public BloodOxygenMeasurementAlert setMode(int r1) {
        this.mode = r1;
        return this;
    }

    public BloodOxygenMeasurementAlert setState(int r1) {
        this.state = r1;
        return this;
    }

    @Override // com.jieli.jl_rcsp.model.device.health.IHealthSettingToAttr
    public AttrBean toAttr() {
        AttrBean r0 = new AttrBean();
        r0.setType((byte) getType());
        r0.setAttrData(toData());
        return r0;
    }

    public String toString() {
        return "BloodOxygenMeasurementAlert{state=" + this.state + ", mode=" + this.mode + ", limitingValue=" + this.limitingValue + i0XO1.IO;
    }
}
