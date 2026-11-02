package com.jieli.jl_bt_ota.model.response.device;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_bt_ota.interfaces.command.IDataOp;
import com.jieli.jl_bt_ota.util.CHexConver;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public class SystemInfo implements IDataOp {
    private int maxVol;
    private int quantity;
    private int volume;
    private boolean supportVolumeSync = false;
    private int lowPowerLimit = 30;

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
    public int parse(byte[] bArr) {
        if (bArr == null || bArr.length < 3) {
            return 0;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        this.quantity = CHexConver.byteToInt(byteBufferWrap.get());
        this.volume = CHexConver.byteToInt(byteBufferWrap.get());
        this.maxVol = CHexConver.byteToInt(byteBufferWrap.get());
        if (byteBufferWrap.remaining() > 0) {
            this.supportVolumeSync = CHexConver.checkBitValue(byteBufferWrap.get(), 0);
        }
        if (byteBufferWrap.remaining() > 0) {
            this.lowPowerLimit = CHexConver.byteToInt(byteBufferWrap.get());
        }
        return byteBufferWrap.position();
    }

    public SystemInfo setLowPowerLimit(int i) {
        this.lowPowerLimit = i;
        return this;
    }

    public SystemInfo setMaxVol(int i) {
        this.maxVol = i;
        return this;
    }

    public SystemInfo setQuantity(int i) {
        this.quantity = i;
        return this;
    }

    public SystemInfo setSupportVolumeSync(boolean z) {
        this.supportVolumeSync = z;
        return this;
    }

    public SystemInfo setVolume(int i) {
        this.volume = i;
        return this;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.IDataOp
    public byte[] toData() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(this.quantity);
        byteArrayOutputStream.write(this.volume);
        byteArrayOutputStream.write(this.maxVol);
        byteArrayOutputStream.write(CHexConver.setBitValue((byte) 0, 0, this.supportVolumeSync));
        byteArrayOutputStream.write(this.lowPowerLimit);
        return byteArrayOutputStream.toByteArray();
    }

    public String toString() {
        return "SystemInfo{quantity=" + this.quantity + ", volume=" + this.volume + ", maxVol=" + this.maxVol + ", supportVolumeSync=" + this.supportVolumeSync + ", lowPowerLimit=" + this.lowPowerLimit + i0XO1.f7442IO;
    }
}
