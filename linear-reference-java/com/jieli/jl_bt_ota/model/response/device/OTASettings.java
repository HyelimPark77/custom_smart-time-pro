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

    public OTASettings() {
    }

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
    public int parse(byte[] r4) {
        if (r4 == null) goto L26;
        boolean r2 = true;
        if (r4.length < 1) goto L26;
        ByteBuffer r5 = ByteBuffer.wrap(r4);
        if (r5.get() != 1) goto L10;
        boolean r1 = true;
    L11:
        setSupportDoubleBackup(r1);
        if (r5.hasRemaining() == false) goto L19;
        if (r5.get() == 1) goto L17;
        r2 = false;
    L17:
        setNeedBootLoader(r2);
    L19:
        if (r5.hasRemaining() == false) goto L22;
        setSingleBackupOtaWay(CHexConver.byteToInt(r5.get()));
    L22:
        if (r5.hasRemaining() == false) goto L25;
        setSupportReuseSpaceOTA(CHexConver.checkBitValue(r5.get(), 0));
    L25:
        return r5.position();
    L10:
        r1 = false;
    L26:
        return 0;
    }

    public void setNeedBootLoader(boolean r1) {
        this.isNeedBootLoader = r1;
    }

    public void setSingleBackupOtaWay(int r1) {
        this.singleBackupOtaWay = r1;
    }

    public void setSupportDoubleBackup(boolean r1) {
        this.isSupportDoubleBackup = r1;
    }

    public void setSupportReuseSpaceOTA(boolean r1) {
        this.isSupportReuseSpaceOTA = r1;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.IDataOp
    public byte[] toData() {
        ByteArrayOutputStream r0 = new ByteArrayOutputStream();
        r0.write(this.isSupportDoubleBackup ? 1 : 0);
        r0.write(this.isNeedBootLoader ? 1 : 0);
        r0.write(this.singleBackupOtaWay);
        r0.write(CHexConver.setBitValue((byte) 0, 0, this.isSupportReuseSpaceOTA));
        return r0.toByteArray();
    }

    public String toString() {
        return "OTASettings{isSupportDoubleBackup=" + this.isSupportDoubleBackup + ", isNeedBootLoader=" + this.isNeedBootLoader + ", singleBackupOtaWay=" + this.singleBackupOtaWay + ", isSupportReuseSpaceOTA=" + this.isSupportReuseSpaceOTA + i0XO1.IO;
    }
}
