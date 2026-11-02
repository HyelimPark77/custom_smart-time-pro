package com.jieli.jl_rcsp.model.data;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.interfaces.data.OnDataEventCallback;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes17.dex */
public class ReadDataCache extends ReadParams {
    private OnDataEventCallback mCallback;
    private final ByteArrayOutputStream mOutputStream;
    private int offset;
    private int seq;

    public ReadDataCache(ReadParams r8) {
        super(r8.getDataType(), r8.getVersion(), r8.getSendLimit(), r8.getReceiveLimit(), r8.getDataLen(), r8.getCrc());
        this.mOutputStream = new ByteArrayOutputStream();
        this.seq = -1;
    }

    public OnDataEventCallback getCallback() {
        return this.mCallback;
    }

    public int getOffset() {
        return this.offset;
    }

    public byte[] getOutputData() {
        return this.mOutputStream.toByteArray();
    }

    public int getSeq() {
        return this.seq;
    }

    public boolean putData(byte[] r2) {
        if (r2 != null) goto L4;
        return false;
    L4:
        if (r2.length <= 0) goto L15;
        this.mOutputStream.write(r2);     // Catch: IOException -> L8
        return true;
    L8:
        e = move-exception;
        e.printStackTrace();
        return false;
    L15:
        return false;
    }

    public void release() {
        this.mOutputStream.reset();
        this.offset = 0;
        this.seq = -1;
    }

    public void setCallback(OnDataEventCallback r1) {
        this.mCallback = r1;
    }

    public void setOffset(int r1) {
        this.offset = r1;
    }

    public void setSeq(int r1) {
        this.seq = r1;
    }

    @Override // com.jieli.jl_rcsp.model.data.ReadParams, com.jieli.jl_rcsp.model.data.DataParams
    public String toString() {
        return "ReadDataCache{mOutputStream=" + this.mOutputStream + ", mCallback=" + this.mCallback + ", offset=" + this.offset + ", seq=" + this.seq + i0XO1.IO;
    }
}
