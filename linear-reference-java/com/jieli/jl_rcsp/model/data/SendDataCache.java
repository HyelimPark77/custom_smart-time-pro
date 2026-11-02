package com.jieli.jl_rcsp.model.data;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.interfaces.data.OnDataEventCallback;

/* JADX INFO: loaded from: classes17.dex */
public class SendDataCache extends SendParams {
    private final OnDataEventCallback callback;
    private int offset;
    private int seq;

    public SendDataCache(SendParams r7, OnDataEventCallback r8) {
        super(r7.getDataType(), r7.getVersion(), r7.getSendLimit(), r7.getReceiveLimit(), r7.getData());
        this.seq = -1;
        this.callback = r8;
        this.offset = 0;
    }

    public OnDataEventCallback getCallback() {
        return this.callback;
    }

    public int getOffset() {
        return this.offset;
    }

    public int getSeq() {
        return this.seq;
    }

    public void release() {
        this.seq = -1;
        this.offset = 0;
    }

    public void setOffset(int r1) {
        this.offset = r1;
    }

    public void setSeq(int r1) {
        this.seq = r1;
    }

    @Override // com.jieli.jl_rcsp.model.data.SendParams, com.jieli.jl_rcsp.model.data.DataParams
    public String toString() {
        return "SendDataCache{callback=" + this.callback + ", seq=" + this.seq + ", offset=" + this.offset + i0XO1.IO;
    }
}
