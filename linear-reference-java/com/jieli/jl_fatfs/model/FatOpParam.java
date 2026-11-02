package com.jieli.jl_fatfs.model;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_fatfs.interfaces.OnFatFileProgressListener;

/* JADX INFO: loaded from: classes17.dex */
public class FatOpParam {
    public static final int FAT_OP_CREATE_FILE = 2;
    public static final int FAT_OP_DELETE_FILE = 3;
    public static final int FAT_OP_RECOVERY_SYS = 255;
    public static final int FAT_OP_REPLACE_FILE = 4;
    private String filePath;
    private OnFatFileProgressListener mProgressListener;
    private int op;
    private int sumFileDataLen;
    private long totalSize;

    public FatOpParam() {
        this.sumFileDataLen = 0;
        this.totalSize = 0;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public int getOp() {
        return this.op;
    }

    public OnFatFileProgressListener getProgressListener() {
        return this.mProgressListener;
    }

    public int getSumFileDataLen() {
        return this.sumFileDataLen;
    }

    public long getTotalSize() {
        return this.totalSize;
    }

    public FatOpParam setFilePath(String r1) {
        this.filePath = r1;
        return this;
    }

    public FatOpParam setOp(int r1) {
        this.op = r1;
        return this;
    }

    public FatOpParam setProgressListener(OnFatFileProgressListener r1) {
        this.mProgressListener = r1;
        return this;
    }

    public FatOpParam setSumFileDataLen(int r1) {
        this.sumFileDataLen = r1;
        return this;
    }

    public FatOpParam setTotalSize(long r1) {
        this.totalSize = r1;
        return this;
    }

    public String toString() {
        return "FatOpParam{op=" + this.op + ", filePath='" + this.filePath + "', sumFileDataLen=" + this.sumFileDataLen + ", totalSize=" + this.totalSize + ", mProgressListener=" + this.mProgressListener + i0XO1.IO;
    }
}
