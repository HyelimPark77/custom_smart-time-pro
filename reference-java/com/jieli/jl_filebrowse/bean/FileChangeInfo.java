package com.jieli.jl_filebrowse.bean;

import com.android.mltcode.paycertificationapi.i0XO1;

/* JADX INFO: loaded from: classes17.dex */
public class FileChangeInfo {
    private final int cluster;
    private final int devHandle;
    private final String filePath;

    /* JADX INFO: renamed from: op */
    private final int f37832op;

    public FileChangeInfo(int i, int i2, int i3, String str) {
        this.devHandle = i;
        this.f37832op = i2;
        this.cluster = i3;
        this.filePath = str;
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
        return this.f37832op;
    }

    public String toString() {
        return "FileChangeInfo{devHandle=" + this.devHandle + ", op=" + this.f37832op + ", cluster=" + this.cluster + ", filePath='" + this.filePath + '\'' + i0XO1.f7442IO;
    }
}
