package com.jieli.jl_bt_ota.model.response.device;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_bt_ota.interfaces.command.IDataOp;
import com.jieli.jl_bt_ota.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class TransmitterInfo implements IDataOp {
    private int emitterStatus;
    private boolean emitterSupport;

    public TransmitterInfo() {
    }

    public int getEmitterStatus() {
        return this.emitterStatus;
    }

    public boolean isEmitterSupport() {
        return this.emitterSupport;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.IDataOp
    public int parse(byte[] r4) {
        boolean r0 = false;
        if (r4 != null) goto L5;
    L12:
        return 0;
    L5:
        if (r4.length < 1) goto L12;
        byte r5 = r4[0];
        if ((r5 & 15) != 1) goto L10;
        r0 = true;
    L10:
        setEmitterSupport(r0).setEmitterStatus((r5 >> 4) & 15);
        return 1;
    }

    public TransmitterInfo setEmitterStatus(int r1) {
        this.emitterStatus = r1;
        return this;
    }

    public TransmitterInfo setEmitterSupport(boolean r1) {
        this.emitterSupport = r1;
        return this;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.IDataOp
    public byte[] toData() {
        return new byte[]{CHexConver.intToByte(((this.emitterStatus << 4) | (this.emitterSupport ? 1 : 0)) == true ? 1 : 0)};
    }

    public String toString() {
        return "TransmitterInfo{emitterSupport=" + this.emitterSupport + ", emitterStatus=" + this.emitterStatus + i0XO1.IO;
    }
}
