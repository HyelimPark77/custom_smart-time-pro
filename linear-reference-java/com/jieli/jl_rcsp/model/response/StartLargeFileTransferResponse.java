package com.jieli.jl_rcsp.model.response;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.model.base.CommonResponse;

/* JADX INFO: loaded from: classes17.dex */
public class StartLargeFileTransferResponse extends CommonResponse {
    private short transferMtu;

    public StartLargeFileTransferResponse(short r1) {
        this.transferMtu = r1;
    }

    public short getTransferMtu() {
        return this.transferMtu;
    }

    public void setTransferMtu(short r1) {
        this.transferMtu = r1;
    }

    @Override // com.jieli.jl_rcsp.model.base.CommonResponse
    public String toString() {
        return "StartLargeFileTransferResponse{transferMtu=" + this.transferMtu + i0XO1.IO;
    }

    public StartLargeFileTransferResponse() {
        this.transferMtu = 265;
    }
}
