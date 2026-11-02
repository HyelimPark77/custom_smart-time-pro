package com.jieli.jl_rcsp.model;

import com.android.mltcode.paycertificationapi.i0XO1;

/* JADX INFO: loaded from: classes17.dex */
public class WatchFileContent {
    private final short crc;
    private final long fileSize;

    public WatchFileContent(long j, short s) {
        this.fileSize = j;
        this.crc = s;
    }

    public short getCrc() {
        return this.crc;
    }

    public long getFileSize() {
        return this.fileSize;
    }

    public String toString() {
        return "WatchFileContent{fileSize=" + this.fileSize + ", crc=" + ((int) this.crc) + i0XO1.f7442IO;
    }
}
