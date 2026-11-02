package com.jieli.jl_rcsp.model.data;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.util.CHexConver;
import com.jieli.jl_rcsp.util.CryptoUtil;

/* JADX INFO: loaded from: classes17.dex */
public class SendParams extends DataParams {
    private final byte[] data;

    public SendParams(int r7, int r8, int r9, int r10, byte[] r11) {
        super(1, r7, r8, r9, r10);
        this.data = r11;
    }

    public byte[] getData() {
        return this.data;
    }

    public short getDataCrc() {
        byte[] r0 = this.data;
        if (r0 != null) goto L6;
        return 0;
    L6:
        return CryptoUtil.CRC16(r0, 0);
    }

    public int getDataLen() {
        byte[] r0 = this.data;
        if (r0 != null) goto L7;
        return 0;
    L7:
        return r0.length;
    }

    @Override // com.jieli.jl_rcsp.model.data.DataParams
    public String toString() {
        return "SendParams{data=" + CHexConver.bytesToStr(this.data) + ", dataType=" + getDataType() + ", version=" + getVersion() + ", sendLimit=" + getSendLimit() + ", receiveLimit=" + getReceiveLimit() + i0XO1.IO;
    }
}
