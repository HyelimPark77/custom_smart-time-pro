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

    public ProductInfo() {
    }

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
    public int parse(byte[] r3) {
        if (r3 != null) goto L4;
        return 0;
    L4:
        if (r3.length < 4) goto L14;
        ByteBuffer r0 = ByteBuffer.wrap(r3);
        if (r3.length != 4) goto L9;
        setVid(1494).setUid(r0.getShort()).setPid(r0.getShort());
    L11:
        return r0.position();
    L9:
        setVid(r0.getShort()).setPid(r0.getShort()).setUid(r0.getShort());
        goto L11
    L14:
        return 0;
    }

    public ProductInfo setPid(int r1) {
        this.pid = r1;
        return this;
    }

    public ProductInfo setUid(int r1) {
        this.uid = r1;
        return this;
    }

    public ProductInfo setVid(int r1) {
        this.vid = r1;
        return this;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.IDataOp
    public byte[] toData() {
        ByteArrayOutputStream r0 = new ByteArrayOutputStream();
        r0.write(CHexConver.int2byte2(this.vid));     // Catch: IOException -> L5
        r0.write(CHexConver.int2byte2(this.pid));     // Catch: IOException -> L5
        r0.write(CHexConver.int2byte2(this.uid));     // Catch: IOException -> L5
    L8:
        return r0.toByteArray();
    L5:
        e = move-exception;
        e.printStackTrace();
        goto L8
    }

    public String toString() {
        return "ProductInfo{vid=" + this.vid + ", pid=" + this.pid + ", uid=" + this.uid + i0XO1.IO;
    }
}
