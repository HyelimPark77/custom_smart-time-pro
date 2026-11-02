package com.jieli.jl_rcsp.model.network;

import com.android.mltcode.paycertificationapi.i0XO1;

/* JADX INFO: loaded from: classes17.dex */
public class OTAParam {
    private byte[] otaData;
    private String otaFilePath;

    public OTAParam(byte[] r2) {
        this(null, r2);
    }

    public byte[] getOtaData() {
        return this.otaData;
    }

    public String getOtaFilePath() {
        return this.otaFilePath;
    }

    public OTAParam setOtaData(byte[] r1) {
        this.otaData = r1;
        return this;
    }

    public OTAParam setOtaFilePath(String r1) {
        this.otaFilePath = r1;
        return this;
    }

    public String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append("OTAParam{otaFilePath='");
        r0.append(this.otaFilePath);
        r0.append('\'');
        r0.append(", otaData=");
        byte[] r1 = this.otaData;
        if (r1 != null) goto L5;
        int r2 = 0;
    L6:
        r0.append(r2);
        r0.append(i0XO1.IO);
        return r0.toString();
    L5:
        r2 = r1.length;
        goto L6
    }

    public OTAParam(String r2) {
        this(r2, null);
    }

    public OTAParam(String r1, byte[] r2) {
        this.otaFilePath = r1;
        this.otaData = r2;
    }
}
