package com.jieli.jl_bt_ota.model.response;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_bt_ota.model.base.CommonResponse;
import com.jieli.jl_bt_ota.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class FirmwareUpdateBlockResponse extends CommonResponse {
    private byte[] firmwareUpdateBlockData;

    public byte[] getFirmwareUpdateBlockData() {
        return this.firmwareUpdateBlockData;
    }

    public FirmwareUpdateBlockResponse setFirmwareUpdateBlockData(byte[] bArr) {
        this.firmwareUpdateBlockData = bArr;
        return this;
    }

    @Override // com.jieli.jl_bt_ota.model.base.CommonResponse
    public String toString() {
        return "FirmwareUpdateBlockResponse{firmwareUpdateBlockData=" + CHexConver.byte2HexStr(this.firmwareUpdateBlockData) + i0XO1.f7442IO;
    }
}
