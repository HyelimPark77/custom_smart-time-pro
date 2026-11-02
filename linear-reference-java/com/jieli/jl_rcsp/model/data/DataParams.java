package com.jieli.jl_rcsp.model.data;

import com.android.mltcode.paycertificationapi.i0XO1;

/* JADX INFO: loaded from: classes17.dex */
public class DataParams {
    private final int dataType;
    private int receiveLimit;
    private int sendLimit;
    private final int version;
    private final int way;

    public DataParams(int r1, int r2, int r3, int r4, int r5) {
        this.way = r1;
        this.dataType = r2;
        this.version = r3;
        setSendLimit(r4).setReceiveLimit(r5);
    }

    public int getDataType() {
        return this.dataType;
    }

    public int getReceiveLimit() {
        return this.receiveLimit;
    }

    public int getSendLimit() {
        return this.sendLimit;
    }

    public int getVersion() {
        return this.version;
    }

    public int getWay() {
        return this.way;
    }

    public DataParams setReceiveLimit(int r1) {
        this.receiveLimit = r1;
        return this;
    }

    public DataParams setSendLimit(int r1) {
        this.sendLimit = r1;
        return this;
    }

    public String toString() {
        return "DataParams{dataType=" + this.dataType + ", version=" + this.version + ", sendLimit=" + this.sendLimit + ", receiveLimit=" + this.receiveLimit + i0XO1.IO;
    }
}
