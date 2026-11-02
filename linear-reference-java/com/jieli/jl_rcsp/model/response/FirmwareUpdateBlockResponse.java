package com.jieli.jl_rcsp.model.response;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.model.base.CommonResponse;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class FirmwareUpdateBlockResponse extends CommonResponse {
    private byte[] firmwareUpdateBlockData;

    public FirmwareUpdateBlockResponse() {
    }

    public byte[] getFirmwareUpdateBlockData() {
        return this.firmwareUpdateBlockData;
    }

    public FirmwareUpdateBlockResponse setFirmwareUpdateBlockData(byte[] r1) {
        this.firmwareUpdateBlockData = r1;
        return this;
    }

    @Override // com.jieli.jl_rcsp.model.base.CommonResponse
    public String toString() {
        return "FirmwareUpdateBlockResponse{firmwareUpdateBlockData=" + CHexConver.byte2HexStr(this.firmwareUpdateBlockData) + i0XO1.IO;
    }
}
