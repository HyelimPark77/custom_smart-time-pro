package com.jieli.jl_bt_ota.model.response.device;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_bt_ota.interfaces.command.IDataOp;
import com.jieli.jl_bt_ota.util.CHexConver;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public class ProtocolMTU implements IDataOp {
    private int sendMtu = 530;
    private int receiveMtu = 530;

    public int getReceiveMtu() {
        return this.receiveMtu;
    }

    public int getSendMtu() {
        return this.sendMtu;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.IDataOp
    public int parse(byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            return 0;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        if (bArr.length == 2) {
            short s = byteBufferWrap.getShort();
            setSendMtu(s).setReceiveMtu(s);
        } else {
            setSendMtu(byteBufferWrap.getShort()).setReceiveMtu(byteBufferWrap.getShort());
        }
        return byteBufferWrap.position();
    }

    public ProtocolMTU setReceiveMtu(int i) {
        this.receiveMtu = i;
        return this;
    }

    public ProtocolMTU setSendMtu(int i) {
        this.sendMtu = i;
        return this;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.IDataOp
    public byte[] toData() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(CHexConver.int2byte2(this.sendMtu));
            byteArrayOutputStream.write(CHexConver.int2byte2(this.receiveMtu));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }

    public String toString() {
        return "ProtocolMTU{sendMtu=" + this.sendMtu + ", receiveMtu=" + this.receiveMtu + i0XO1.f7442IO;
    }
}
