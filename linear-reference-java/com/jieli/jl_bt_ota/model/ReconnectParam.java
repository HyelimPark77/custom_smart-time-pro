package com.jieli.jl_bt_ota.model;

import com.android.mltcode.paycertificationapi.i0XO1;

/* JADX INFO: loaded from: classes17.dex */
public class ReconnectParam {
    private int flag;
    private final String originalAddress;
    private final String reconnectAddress;
    private int state;
    private final int way;

    public ReconnectParam(String r1, int r2, String r3) {
        this.originalAddress = r1;
        this.way = r2;
        this.reconnectAddress = r3;
    }

    public int getFlag() {
        return this.flag;
    }

    public String getOriginalAddress() {
        return this.originalAddress;
    }

    public String getReconnectAddress() {
        return this.reconnectAddress;
    }

    public int getWay() {
        return this.way;
    }

    public ReconnectParam setFlag(int r1) {
        this.flag = r1;
        return this;
    }

    public String toString() {
        return "ReconnectParam{originalAddress='" + this.originalAddress + "', way=" + this.way + ", reconnectAddress='" + this.reconnectAddress + "', flag=" + this.flag + i0XO1.IO;
    }
}
