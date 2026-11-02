package com.jieli.jl_bt_ota.model;

import com.android.mltcode.paycertificationapi.i0XO1;

/* JADX INFO: loaded from: classes17.dex */
public class FileOffset {
    private final int len;
    private final int offset;

    public FileOffset(int i, int i2) {
        this.offset = i;
        this.len = i2;
    }

    public int getLen() {
        return this.len;
    }

    public int getOffset() {
        return this.offset;
    }

    public String toString() {
        return "FileOffset{offset=" + this.offset + ", len=" + this.len + i0XO1.f7442IO;
    }
}
