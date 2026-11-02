package com.jieli.jl_filebrowse.bean;

import com.android.mltcode.paycertificationapi.i0XO1;

/* JADX INFO: loaded from: classes17.dex */
public class FileChangeInfo {
    private final int cluster;
    private final int devHandle;
    private final String filePath;
    private final int op;

    public FileChangeInfo(int r1, int r2, int r3, String r4) {
        this.devHandle = r1;
        this.op = r2;
        this.cluster = r3;
        this.filePath = r4;
    }

    public int getCluster() {
        return this.cluster;
    }

    public final int getDevHandle() {
        return this.devHandle;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public int getOp() {
        return this.op;
    }

    public String toString() {
        return "FileChangeInfo{devHandle=" + this.devHandle + ", op=" + this.op + ", cluster=" + this.cluster + ", filePath='" + this.filePath + '\'' + i0XO1.IO;
    }
}
