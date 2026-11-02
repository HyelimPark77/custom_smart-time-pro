package com.jieli.jl_rcsp.model.device.health;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.model.device.AttrBean;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class ExerciseHeartRateReminder implements IHealthSettingToAttr {
    public static final byte SPACE_MODE_MAX_PERCENT = 0;
    public static final byte SPACE_MODE_SAVE_PERCENT = 1;
    private boolean enable;
    private int max;
    private byte spaceMode;

    public ExerciseHeartRateReminder(byte[] r1) {
        parseData(r1);
    }

    private void parseData(byte[] r4) {
        if (r4 != null) goto L4;
        return;
    L4:
        if (r4.length == 0) goto L18;
        boolean r0 = false;
        char r2 = 1;
        if (CHexConver.byteToInt(r4[0]) != 1) goto L9;
        r0 = true;
    L9:
        this.enable = r0;
        if (r4.length <= 1) goto L13;
        this.max = CHexConver.byteToInt(r4[1]);
        r2 = 2;
    L13:
        if (r4.length <= 2) goto L17;
        this.spaceMode = r4[r2];
        return;
    L17:
        return;
    }

    private byte[] toData() {
        return new byte[]{this.enable ? 1 : 0, (byte) this.max, this.spaceMode};
    }

    public int getMax() {
        return this.max;
    }

    public byte getSpaceMode() {
        return this.spaceMode;
    }

    @Override // com.jieli.jl_rcsp.model.device.health.IHealthSettingToAttr
    public int getType() {
        return 4;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public ExerciseHeartRateReminder setEnable(boolean r1) {
        this.enable = r1;
        return this;
    }

    public ExerciseHeartRateReminder setMax(int r1) {
        this.max = r1;
        return this;
    }

    public ExerciseHeartRateReminder setSpaceMode(byte r1) {
        this.spaceMode = r1;
        return this;
    }

    @Override // com.jieli.jl_rcsp.model.device.health.IHealthSettingToAttr
    public AttrBean toAttr() {
        return new AttrBean().setType((byte) getType()).setAttrData(toData());
    }

    public String toString() {
        return "ExerciseHeartRateReminder{max=" + this.max + "spaceMode=" + this.spaceMode + ", enable=" + this.enable + i0XO1.IO;
    }
}
