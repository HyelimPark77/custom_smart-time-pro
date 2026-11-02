package com.jieli.jl_bt_ota.model.response.device;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_bt_ota.interfaces.command.IDataOp;
import com.jieli.jl_bt_ota.util.CHexConver;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public class ProtocolMTU implements IDataOp {
    private int receiveMtu;
    private int sendMtu;

    public ProtocolMTU() {
        this.sendMtu = 530;
        this.receiveMtu = 530;
    }

    public int getReceiveMtu() {
        return this.receiveMtu;
    }

    public int getSendMtu() {
        return this.sendMtu;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.IDataOp
    public int parse(byte[] r3) {
        if (r3 != null) goto L4;
        return 0;
    L4:
        if (r3.length < 2) goto L14;
        ByteBuffer r0 = ByteBuffer.wrap(r3);
        if (r3.length != 2) goto L9;
        short r4 = r0.getShort();
        setSendMtu(r4).setReceiveMtu(r4);
    L11:
        return r0.position();
    L9:
        setSendMtu(r0.getShort()).setReceiveMtu(r0.getShort());
        goto L11
    L14:
        return 0;
    }

    public ProtocolMTU setReceiveMtu(int r1) {
        this.receiveMtu = r1;
        return this;
    }

    public ProtocolMTU setSendMtu(int r1) {
        this.sendMtu = r1;
        return this;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.IDataOp
    public byte[] toData() {
        ByteArrayOutputStream r0 = new ByteArrayOutputStream();
        r0.write(CHexConver.int2byte2(this.sendMtu));     // Catch: IOException -> L5
        r0.write(CHexConver.int2byte2(this.receiveMtu));     // Catch: IOException -> L5
    L8:
        return r0.toByteArray();
    L5:
        e = move-exception;
        e.printStackTrace();
        goto L8
    }

    public String toString() {
        return "ProtocolMTU{sendMtu=" + this.sendMtu + ", receiveMtu=" + this.receiveMtu + i0XO1.IO;
    }
}
