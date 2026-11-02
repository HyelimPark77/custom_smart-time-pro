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

    public FileConfiguration() {
    }

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
    public int parse(byte[] r4) {
        if (r4 != null) goto L5;
    L9:
        return 0;
    L5:
        if (r4.length < 4) goto L9;
        byte r5 = r4[0];
        setSupportPackageCrc16(CHexConver.checkBitValue(r5, 0)).setGetFileByNameWithDev(CHexConver.checkBitValue(r5, 1)).setSupportSmallFileTransfer(CHexConver.checkBitValue(r5, 2));
        return 4;
    }

    public FileConfiguration setGetFileByNameWithDev(boolean r1) {
        this.getFileByNameWithDev = r1;
        return this;
    }

    public FileConfiguration setSupportPackageCrc16(boolean r1) {
        this.supportPackageCrc16 = r1;
        return this;
    }

    public FileConfiguration setSupportSmallFileTransfer(boolean r1) {
        this.isSupportSmallFileTransfer = r1;
        return this;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.IDataOp
    public byte[] toData() {
        ByteArrayOutputStream r0 = new ByteArrayOutputStream();
        byte[] r1 = new byte[4];     // Catch: IOException -> L5
        r1[0] = CHexConver.setBitValue(CHexConver.setBitValue(CHexConver.setBitValue((byte) 0, 0, this.supportPackageCrc16), 1, this.getFileByNameWithDev), 2, this.isSupportSmallFileTransfer);     // Catch: IOException -> L5
        r0.write(r1);     // Catch: IOException -> L5
    L8:
        return r0.toByteArray();
    L5:
        e = move-exception;
        e.printStackTrace();
        goto L8
    }

    public String toString() {
        return "FileConfiguration{supportPackageCrc16=" + this.supportPackageCrc16 + ", getFileByNameWithDev=" + this.getFileByNameWithDev + ", isSupportSmallFileTransfer=" + this.isSupportSmallFileTransfer + i0XO1.IO;
    }
}
