package com.jieli.jl_bt_ota.model.response.device;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_bt_ota.interfaces.command.IDataOp;
import com.jieli.jl_bt_ota.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class TransmitterInfo implements IDataOp {
    private int emitterStatus;
    private boolean emitterSupport;

    public int getEmitterStatus() {
        return this.emitterStatus;
    }

    public boolean isEmitterSupport() {
        return this.emitterSupport;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.IDataOp
    public int parse(byte[] bArr) {
        if (bArr == null || bArr.length < 1) {
            return 0;
        }
        byte b = bArr[0];
        setEmitterSupport((b & 15) == 1).setEmitterStatus((b >> 4) & 15);
        return 1;
    }

    public TransmitterInfo setEmitterStatus(int i) {
        this.emitterStatus = i;
        return this;
    }

    public TransmitterInfo setEmitterSupport(boolean z) {
        this.emitterSupport = z;
        return this;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.IDataOp
    public byte[] toData() {
        return new byte[]{CHexConver.intToByte(((this.emitterStatus << 4) | (this.emitterSupport ? 1 : 0)) == true ? 1 : 0)};
    }

    public String toString() {
        return "TransmitterInfo{emitterSupport=" + this.emitterSupport + ", emitterStatus=" + this.emitterStatus + i0XO1.f7442IO;
    }
}
