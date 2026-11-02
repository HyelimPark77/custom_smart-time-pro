package com.jieli.jl_rcsp.model.device.health;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.model.device.AttrBean;

/* JADX INFO: loaded from: classes17.dex */
public class DisconnectReminder implements IHealthSettingToAttr {
    public static final int MODE_BRIGHT_SCREEN = 0;
    public static final int MODE_SHOCK = 1;
    private boolean enable;
    private byte mode;

    public DisconnectReminder(byte[] r1) {
        parseData(r1);
    }

    private void parseData(byte[] r4) {
        if (r4 != null) goto L4;
        return;
    L4:
        if (r4.length == 0) goto L15;
        boolean r0 = false;
        if (r4[0] != 1) goto L9;
        r0 = true;
    L9:
        this.enable = r0;
        if (r4.length < 2) goto L14;
        this.mode = r4[1];
        return;
    L14:
        return;
    }

    private byte[] toData() {
        return new byte[]{this.enable ? 1 : 0, this.mode};
    }

    public byte getMode() {
        return this.mode;
    }

    @Override // com.jieli.jl_rcsp.model.device.health.IHealthSettingToAttr
    public int getType() {
        return 10;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public DisconnectReminder setEnable(boolean r1) {
        this.enable = r1;
        return this;
    }

    public DisconnectReminder setMode(byte r1) {
        this.mode = r1;
        return this;
    }

    @Override // com.jieli.jl_rcsp.model.device.health.IHealthSettingToAttr
    public AttrBean toAttr() {
        return new AttrBean().setType((byte) getType()).setAttrData(toData());
    }

    public String toString() {
        return "DisconnectReminder{enable=" + this.enable + ", mode=" + this.mode + i0XO1.IO;
    }
}
