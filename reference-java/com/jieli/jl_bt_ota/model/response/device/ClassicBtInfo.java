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
    private int edrProfile = 0;
    private int edrStatus = 0;

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
    public int parse(byte[] bArr) {
        if (bArr == null || bArr.length < 8) {
            return 0;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byte[] bArr2 = new byte[6];
        byteBufferWrap.get(bArr2);
        setEdrAddr(CHexConver.hexDataCovetToAddress(bArr2)).setEdrProfile(CHexConver.byteToInt(byteBufferWrap.get())).setEdrStatus(CHexConver.byteToInt(byteBufferWrap.get()));
        return byteBufferWrap.position();
    }

    public ClassicBtInfo setEdrAddr(String str) {
        this.edrAddr = str;
        return this;
    }

    public ClassicBtInfo setEdrProfile(int i) {
        this.edrProfile = i;
        return this;
    }

    public ClassicBtInfo setEdrStatus(int i) {
        this.edrStatus = i;
        return this;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.IDataOp
    public byte[] toData() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            if (CHexConver.checkBluetoothAddress(this.edrAddr)) {
                byteArrayOutputStream.write(CHexConver.addressCovertToByteArray(this.edrAddr));
                byteArrayOutputStream.write(this.edrProfile);
                byteArrayOutputStream.write(this.edrStatus);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }

    public String toString() {
        return "ClassicBtInfo{edrAddr='" + this.edrAddr + "', edrProfile=" + this.edrProfile + ", edrStatus=" + this.edrStatus + i0XO1.f7442IO;
    }
}
