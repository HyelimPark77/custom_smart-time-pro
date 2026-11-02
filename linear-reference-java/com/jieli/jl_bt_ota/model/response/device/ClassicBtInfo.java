package com.jieli.jl_bt_ota.model.response.device;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_bt_ota.interfaces.command.IDataOp;
import com.jieli.jl_bt_ota.util.CHexConver;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public class ClassicBtInfo implements IDataOp {
    private String edrAddr;
    private int edrProfile;
    private int edrStatus;

    public ClassicBtInfo() {
        this.edrProfile = 0;
        this.edrStatus = 0;
    }

    public String getEdrAddr() {
        return this.edrAddr;
    }

    public int getEdrProfile() {
        return this.edrProfile;
    }

    public int getEdrStatus() {
        return this.edrStatus;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.IDataOp
    public int parse(byte[] r3) {
        if (r3 != null) goto L4;
        return 0;
    L4:
        if (r3.length < 8) goto L10;
        ByteBuffer r4 = ByteBuffer.wrap(r3);
        byte[] r0 = new byte[6];
        r4.get(r0);
        setEdrAddr(CHexConver.hexDataCovetToAddress(r0)).setEdrProfile(CHexConver.byteToInt(r4.get())).setEdrStatus(CHexConver.byteToInt(r4.get()));
        return r4.position();
    L10:
        return 0;
    }

    public ClassicBtInfo setEdrAddr(String r1) {
        this.edrAddr = r1;
        return this;
    }

    public ClassicBtInfo setEdrProfile(int r1) {
        this.edrProfile = r1;
        return this;
    }

    public ClassicBtInfo setEdrStatus(int r1) {
        this.edrStatus = r1;
        return this;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.IDataOp
    public byte[] toData() {
        ByteArrayOutputStream r0 = new ByteArrayOutputStream();
    L7:
        e = move-exception;
        e.printStackTrace();
    L10:
        return r0.toByteArray();
    L4:
        if (CHexConver.checkBluetoothAddress(this.edrAddr) == false) goto L10;
        r0.write(CHexConver.addressCovertToByteArray(this.edrAddr));     // Catch: IOException -> L7
        r0.write(this.edrProfile);     // Catch: IOException -> L7
        r0.write(this.edrStatus);     // Catch: IOException -> L7
        goto L10
    }

    public String toString() {
        return "ClassicBtInfo{edrAddr='" + this.edrAddr + "', edrProfile=" + this.edrProfile + ", edrStatus=" + this.edrStatus + i0XO1.IO;
    }
}
