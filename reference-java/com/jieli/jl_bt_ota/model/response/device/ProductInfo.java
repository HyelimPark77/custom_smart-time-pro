package com.jieli.jl_bt_ota.model.response.device;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_bt_ota.interfaces.command.IDataOp;
import com.jieli.jl_bt_ota.util.CHexConver;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public class ProductInfo implements IDataOp {
    private int pid;
    private int uid;
    private int vid;

    public int getPid() {
        return this.pid;
    }

    public int getUid() {
        return this.uid;
    }

    public int getVid() {
        return this.vid;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.IDataOp
    public int parse(byte[] bArr) {
        if (bArr == null || bArr.length < 4) {
            return 0;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        if (bArr.length == 4) {
            setVid(1494).setUid(byteBufferWrap.getShort()).setPid(byteBufferWrap.getShort());
        } else {
            setVid(byteBufferWrap.getShort()).setPid(byteBufferWrap.getShort()).setUid(byteBufferWrap.getShort());
        }
        return byteBufferWrap.position();
    }

    public ProductInfo setPid(int i) {
        this.pid = i;
        return this;
    }

    public ProductInfo setUid(int i) {
        this.uid = i;
        return this;
    }

    public ProductInfo setVid(int i) {
        this.vid = i;
        return this;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.IDataOp
    public byte[] toData() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(CHexConver.int2byte2(this.vid));
            byteArrayOutputStream.write(CHexConver.int2byte2(this.pid));
            byteArrayOutputStream.write(CHexConver.int2byte2(this.uid));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }

    public String toString() {
        return "ProductInfo{vid=" + this.vid + ", pid=" + this.pid + ", uid=" + this.uid + i0XO1.f7442IO;
    }
}
