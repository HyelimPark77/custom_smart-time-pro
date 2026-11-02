package com.jieli.jl_rcsp.model.response;

import com.jieli.jl_rcsp.model.base.CommonResponse;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class ExternalFlashIOCtrlResponse extends CommonResponse {
    private short crc16;
    private byte[] data;
    private String filePath;
    private int result;
    private int size;
    private String version;

    public ExternalFlashIOCtrlResponse(int r1) {
        setResult(r1);
    }

    public short getCrc16() {
        return this.crc16;
    }

    public byte[] getData() {
        return this.data;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public int getResult() {
        return this.result;
    }

    public int getSize() {
        return this.size;
    }

    public String getVersion() {
        return this.version;
    }

    public ExternalFlashIOCtrlResponse setCrc16(short r1) {
        this.crc16 = r1;
        return this;
    }

    public ExternalFlashIOCtrlResponse setData(byte[] r1) {
        this.data = r1;
        return this;
    }

    public ExternalFlashIOCtrlResponse setFilePath(String r1) {
        this.filePath = r1;
        return this;
    }

    public ExternalFlashIOCtrlResponse setResult(int r1) {
        this.result = r1;
        return this;
    }

    public ExternalFlashIOCtrlResponse setSize(int r1) {
        this.size = r1;
        return this;
    }

    public ExternalFlashIOCtrlResponse setVersion(String r1) {
        this.version = r1;
        return this;
    }

    @Override // com.jieli.jl_rcsp.model.base.CommonResponse
    public String toString() {
        return "ExternalFlashIOCtrlResponse{result=" + this.result + ", size=" + this.size + ", filePath='" + this.filePath + "', version='" + this.version + "', crc16=" + CHexConver.byte2HexStr(CHexConver.shortToBigBytes(this.crc16)) + "} " + super.toString();
    }
}
