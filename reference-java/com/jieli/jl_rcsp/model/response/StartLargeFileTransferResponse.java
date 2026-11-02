package com.jieli.jl_rcsp.model.response;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.model.base.CommonResponse;

/* JADX INFO: loaded from: classes17.dex */
public class StartLargeFileTransferResponse extends CommonResponse {
    private short transferMtu;

    public StartLargeFileTransferResponse(short s) {
        this.transferMtu = s;
    }

    public short getTransferMtu() {
        return this.transferMtu;
    }

    public void setTransferMtu(short s) {
        this.transferMtu = s;
    }

    @Override // com.jieli.jl_rcsp.model.base.CommonResponse
    public String toString() {
        return "StartLargeFileTransferResponse{transferMtu=" + ((int) this.transferMtu) + i0XO1.f7442IO;
    }

    public StartLargeFileTransferResponse() {
        this.transferMtu = (short) 265;
    }
}
