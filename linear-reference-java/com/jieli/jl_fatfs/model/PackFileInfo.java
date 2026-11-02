package com.jieli.jl_fatfs.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.mltcode.paycertificationapi.i0XO1;

/* JADX INFO: loaded from: classes17.dex */
public class PackFileInfo implements Parcelable {
    public static final Parcelable.Creator<PackFileInfo> CREATOR = null;
    private String fileName;
    private int offset;
    private int size;

    static {
        CREATOR = new AnonymousClass1();
    }

    public PackFileInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getFileName() {
        return this.fileName;
    }

    public int getOffset() {
        return this.offset;
    }

    public int getSize() {
        return this.size;
    }

    public void setFileName(String r1) {
        this.fileName = r1;
    }

    public void setOffset(int r1) {
        this.offset = r1;
    }

    public void setSize(int r1) {
        this.size = r1;
    }

    public String toString() {
        return "PackFileInfo{fileName='" + this.fileName + "', offset=" + this.offset + ", size=" + this.size + i0XO1.IO;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r1, int r2) {
        r1.writeString(this.fileName);
        r1.writeInt(this.offset);
        r1.writeInt(this.size);
    }

    public PackFileInfo(Parcel r2) {
        this.fileName = r2.readString();
        this.offset = r2.readInt();
        this.size = r2.readInt();
    }
}
