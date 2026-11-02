package com.jieli.bmp_convert;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.mltcode.paycertificationapi.i0XO1;

/* JADX INFO: loaded from: classes17.dex */
public class ConvertResult implements Parcelable {
    public static final Parcelable.Creator<ConvertResult> CREATOR = null;
    private int algorithm;
    private int bufSize;
    private int compressMode;
    private int pixelFormat;
    private int result;

    static {
        CREATOR = new AnonymousClass1();
    }

    public ConvertResult() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getAlgorithm() {
        return this.algorithm;
    }

    public int getBufSize() {
        return this.bufSize;
    }

    public int getCompressMode() {
        return this.compressMode;
    }

    public int getPixelFormat() {
        return this.pixelFormat;
    }

    public int getResult() {
        return this.result;
    }

    public boolean isConvertSuccess() {
        if (this.result <= 0) goto L6;
        return true;
    L6:
        return false;
    }

    public ConvertResult setAlgorithm(int r1) {
        this.algorithm = r1;
        return this;
    }

    public ConvertResult setBufSize(int r1) {
        this.bufSize = r1;
        return this;
    }

    public ConvertResult setCompressMode(int r1) {
        this.compressMode = r1;
        return this;
    }

    public ConvertResult setPixelFormat(int r1) {
        this.pixelFormat = r1;
        return this;
    }

    public ConvertResult setResult(int r1) {
        this.result = r1;
        return this;
    }

    public String toString() {
        return "ConvertResult{result=" + this.result + ", algorithm=" + this.algorithm + ", bufSize=" + this.bufSize + ", pixelFormat=" + this.pixelFormat + ", compressMode=" + this.compressMode + i0XO1.IO;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r1, int r2) {
        r1.writeInt(this.result);
        r1.writeInt(this.algorithm);
        r1.writeInt(this.bufSize);
        r1.writeInt(this.pixelFormat);
        r1.writeInt(this.compressMode);
    }

    public ConvertResult(Parcel r2) {
        this.result = r2.readInt();
        this.algorithm = r2.readInt();
        this.bufSize = r2.readInt();
        this.pixelFormat = r2.readInt();
        this.compressMode = r2.readInt();
    }
}
