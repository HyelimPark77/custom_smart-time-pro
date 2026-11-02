package com.jieli.jl_rcsp.model.response;

import com.jieli.jl_rcsp.model.base.CommonResponse;

/* JADX INFO: loaded from: classes17.dex */
public class BaseNFCResponse extends CommonResponse {
    private final byte[] data;
    private final byte result;

    public BaseNFCResponse(byte r1, byte[] r2) {
        this.result = r1;
        this.data = r2;
    }

    public byte[] getData() {
        return this.data;
    }

    public byte getResult() {
        return this.result;
    }
}
