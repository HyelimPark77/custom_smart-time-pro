package com.jieli.jl_bt_ota.model.response.device;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_bt_ota.interfaces.command.IDataOp;
import com.jieli.jl_bt_ota.util.CHexConver;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public class OTASettings implements IDataOp {
    private boolean isNeedBootLoader;
    private boolean isSupportDoubleBackup;
    private boolean isSupportReuseSpaceOTA;
    private int singleBackupOtaWay;

    public int getSingleBackupOtaWay() {
        return this.singleBackupOtaWay;
    }

    public boolean isNeedBootLoader() {
        return this.isNeedBootLoader;
    }

    public boolean isSupportDoubleBackup() {
        return this.isSupportDoubleBackup;
    }

    public boolean isSupportReuseSpaceOTA() {
        return this.isSupportReuseSpaceOTA;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.IDataOp
    public int parse(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length >= 1) {
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                setSupportDoubleBackup(byteBufferWrap.get() == 1);
                if (byteBufferWrap.hasRemaining()) {
                    setNeedBootLoader(byteBufferWrap.get() == 1);
                }
                if (byteBufferWrap.hasRemaining()) {
                    setSingleBackupOtaWay(CHexConver.byteToInt(byteBufferWrap.get()));
                }
                if (byteBufferWrap.hasRemaining()) {
                    setSupportReuseSpaceOTA(CHexConver.checkBitValue(byteBufferWrap.get(), 0));
                }
                return byteBufferWrap.position();
            }
        }
        return 0;
    }

    public void setNeedBootLoader(boolean z) {
        this.isNeedBootLoader = z;
    }

    public void setSingleBackupOtaWay(int i) {
        this.singleBackupOtaWay = i;
    }

    public void setSupportDoubleBackup(boolean z) {
        this.isSupportDoubleBackup = z;
    }

    public void setSupportReuseSpaceOTA(boolean z) {
        this.isSupportReuseSpaceOTA = z;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.IDataOp
    public byte[] toData() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(this.isSupportDoubleBackup ? 1 : 0);
        byteArrayOutputStream.write(this.isNeedBootLoader ? 1 : 0);
        byteArrayOutputStream.write(this.singleBackupOtaWay);
        byteArrayOutputStream.write(CHexConver.setBitValue((byte) 0, 0, this.isSupportReuseSpaceOTA));
        return byteArrayOutputStream.toByteArray();
    }

    public String toString() {
        return "OTASettings{isSupportDoubleBackup=" + this.isSupportDoubleBackup + ", isNeedBootLoader=" + this.isNeedBootLoader + ", singleBackupOtaWay=" + this.singleBackupOtaWay + ", isSupportReuseSpaceOTA=" + this.isSupportReuseSpaceOTA + i0XO1.f7442IO;
    }
}
