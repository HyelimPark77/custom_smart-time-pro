package com.jieli.jl_bt_ota.model.response.device;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_bt_ota.interfaces.command.IDataOp;
import com.jieli.jl_bt_ota.util.CHexConver;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes17.dex */
public class FileConfiguration implements IDataOp {
    private boolean getFileByNameWithDev;
    private boolean isSupportSmallFileTransfer;
    private boolean supportPackageCrc16;

    public boolean isGetFileByNameWithDev() {
        return this.getFileByNameWithDev;
    }

    public boolean isSupportPackageCrc16() {
        return this.supportPackageCrc16;
    }

    public boolean isSupportSmallFileTransfer() {
        return this.isSupportSmallFileTransfer;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.IDataOp
    public int parse(byte[] bArr) {
        if (bArr == null || bArr.length < 4) {
            return 0;
        }
        byte b = bArr[0];
        setSupportPackageCrc16(CHexConver.checkBitValue(b, 0)).setGetFileByNameWithDev(CHexConver.checkBitValue(b, 1)).setSupportSmallFileTransfer(CHexConver.checkBitValue(b, 2));
        return 4;
    }

    public FileConfiguration setGetFileByNameWithDev(boolean z) {
        this.getFileByNameWithDev = z;
        return this;
    }

    public FileConfiguration setSupportPackageCrc16(boolean z) {
        this.supportPackageCrc16 = z;
        return this;
    }

    public FileConfiguration setSupportSmallFileTransfer(boolean z) {
        this.isSupportSmallFileTransfer = z;
        return this;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.IDataOp
    public byte[] toData() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[4];
            bArr[0] = CHexConver.setBitValue(CHexConver.setBitValue(CHexConver.setBitValue((byte) 0, 0, this.supportPackageCrc16), 1, this.getFileByNameWithDev), 2, this.isSupportSmallFileTransfer);
            byteArrayOutputStream.write(bArr);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }

    public String toString() {
        return "FileConfiguration{supportPackageCrc16=" + this.supportPackageCrc16 + ", getFileByNameWithDev=" + this.getFileByNameWithDev + ", isSupportSmallFileTransfer=" + this.isSupportSmallFileTransfer + i0XO1.f7442IO;
    }
}
