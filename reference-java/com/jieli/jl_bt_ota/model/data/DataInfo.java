package com.jieli.jl_bt_ota.model.data;

import com.android.mltcode.paycertificationapi.i0XO1;

/* JADX INFO: loaded from: classes17.dex */
public abstract class DataInfo {
    public static final int DATA_TYPE_RECEIVE = 1;
    public static final int DATA_TYPE_SEND = 0;
    private final int type;

    public DataInfo(int i) {
        this.type = i;
    }

    public int getType() {
        return this.type;
    }

    public String toString() {
        return "DataInfo{type=" + this.type + i0XO1.f7442IO;
    }
}
