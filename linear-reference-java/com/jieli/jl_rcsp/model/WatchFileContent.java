package com.jieli.jl_rcsp.model;

import com.android.mltcode.paycertificationapi.i0XO1;

/* JADX INFO: loaded from: classes17.dex */
public class WatchFileContent {
    private final short crc;
    private final long fileSize;

    public WatchFileContent(long r1, short r3) {
        this.fileSize = r1;
        this.crc = r3;
    }

    public short getCrc() {
        return this.crc;
    }

    public long getFileSize() {
        return this.fileSize;
    }

    public String toString() {
        return "WatchFileContent{fileSize=" + this.fileSize + ", crc=" + this.crc + i0XO1.IO;
    }
}
