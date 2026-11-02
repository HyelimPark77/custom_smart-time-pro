package com.jieli.jl_bt_ota.model.response.device;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_bt_ota.interfaces.command.IDataOp;
import com.jieli.jl_bt_ota.util.CHexConver;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public class SystemInfo implements IDataOp {
    private int lowPowerLimit;
    private int maxVol;
    private int quantity;
    private boolean supportVolumeSync;
    private int volume;

    public SystemInfo() {
        this.supportVolumeSync = false;
        this.lowPowerLimit = 30;
    }

    public int getLowPowerLimit() {
        return this.lowPowerLimit;
    }

    public int getMaxVol() {
        return this.maxVol;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public int getVolume() {
        return this.volume;
    }

    public boolean isSupportVolumeSync() {
        return this.supportVolumeSync;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.IDataOp
    public int parse(byte[] r4) {
        if (r4 != null) goto L5;
    L15:
        return 0;
    L5:
        if (r4.length < 3) goto L15;
        ByteBuffer r5 = ByteBuffer.wrap(r4);
        this.quantity = CHexConver.byteToInt(r5.get());
        this.volume = CHexConver.byteToInt(r5.get());
        this.maxVol = CHexConver.byteToInt(r5.get());
        if (r5.remaining() <= 0) goto L11;
        this.supportVolumeSync = CHexConver.checkBitValue(r5.get(), 0);
    L11:
        if (r5.remaining() <= 0) goto L14;
        this.lowPowerLimit = CHexConver.byteToInt(r5.get());
    L14:
        return r5.position();
    }

    public SystemInfo setLowPowerLimit(int r1) {
        this.lowPowerLimit = r1;
        return this;
    }

    public SystemInfo setMaxVol(int r1) {
        this.maxVol = r1;
        return this;
    }

    public SystemInfo setQuantity(int r1) {
        this.quantity = r1;
        return this;
    }

    public SystemInfo setSupportVolumeSync(boolean r1) {
        this.supportVolumeSync = r1;
        return this;
    }

    public SystemInfo setVolume(int r1) {
        this.volume = r1;
        return this;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.IDataOp
    public byte[] toData() {
        ByteArrayOutputStream r0 = new ByteArrayOutputStream();
        r0.write(this.quantity);
        r0.write(this.volume);
        r0.write(this.maxVol);
        r0.write(CHexConver.setBitValue((byte) 0, 0, this.supportVolumeSync));
        r0.write(this.lowPowerLimit);
        return r0.toByteArray();
    }

    public String toString() {
        return "SystemInfo{quantity=" + this.quantity + ", volume=" + this.volume + ", maxVol=" + this.maxVol + ", supportVolumeSync=" + this.supportVolumeSync + ", lowPowerLimit=" + this.lowPowerLimit + i0XO1.IO;
    }
}
