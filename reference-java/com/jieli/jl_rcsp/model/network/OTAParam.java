package com.jieli.jl_rcsp.model.network;

import com.android.mltcode.paycertificationapi.i0XO1;

/* JADX INFO: loaded from: classes17.dex */
public class OTAParam {
    private byte[] otaData;
    private String otaFilePath;

    public OTAParam(byte[] bArr) {
        this(null, bArr);
    }

    public byte[] getOtaData() {
        return this.otaData;
    }

    public String getOtaFilePath() {
        return this.otaFilePath;
    }

    public OTAParam setOtaData(byte[] bArr) {
        this.otaData = bArr;
        return this;
    }

    public OTAParam setOtaFilePath(String str) {
        this.otaFilePath = str;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OTAParam{otaFilePath='");
        sb.append(this.otaFilePath);
        sb.append('\'');
        sb.append(", otaData=");
        byte[] bArr = this.otaData;
        sb.append(bArr == null ? 0 : bArr.length);
        sb.append(i0XO1.f7442IO);
        return sb.toString();
    }

    public OTAParam(String str) {
        this(str, null);
    }

    public OTAParam(String str, byte[] bArr) {
        this.otaFilePath = str;
        this.otaData = bArr;
    }
}
