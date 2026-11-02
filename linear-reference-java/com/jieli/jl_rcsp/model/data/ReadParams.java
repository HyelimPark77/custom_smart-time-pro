package com.jieli.jl_rcsp.model.data;

/* JADX INFO: loaded from: classes17.dex */
public class ReadParams extends DataParams {
    private final short crc;
    private final int dataLen;

    public ReadParams(int r7, int r8, int r9, int r10, int r11, short r12) {
        super(0, r7, r8, r9, r10);
        this.dataLen = r11;
        this.crc = r12;
    }

    public short getCrc() {
        return this.crc;
    }

    public int getDataLen() {
        return this.dataLen;
    }

    @Override // com.jieli.jl_rcsp.model.data.DataParams
    public String toString() {
        return "ReadParams{dataLen=" + this.dataLen + ", crc=" + this.crc + ", dataType=" + getDataType() + ", version=" + getVersion() + ", sendLimit=" + getSendLimit() + ", receiveLimit=" + getReceiveLimit() + "} ";
    }
}
