package com.jieli.jl_fatfs.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class FatWriteOp implements Parcelable {
    public static final Parcelable.Creator<FatWriteOp> CREATOR = null;
    private byte[] data;
    private int offset;
    private int size;

    static {
        CREATOR = new AnonymousClass1();
    }

    public FatWriteOp() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public byte[] getData() {
        return this.data;
    }

    public int getOffset() {
        return this.offset;
    }

    public int getSize() {
        return this.size;
    }

    public void setData(byte[] r1) {
        this.data = r1;
    }

    public void setOffset(int r1) {
        this.offset = r1;
    }

    public void setSize(int r1) {
        this.size = r1;
    }

    public String toString() {
        return "FatWriteOp{offset=" + this.offset + ", size=" + this.size + ", data=" + CHexConver.byte2HexStr(this.data) + i0XO1.IO;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r1, int r2) {
        r1.writeInt(this.offset);
        r1.writeInt(this.size);
        r1.writeByteArray(this.data);
    }

    public FatWriteOp(Parcel r2) {
        this.offset = r2.readInt();
        this.size = r2.readInt();
        this.data = r2.createByteArray();
    }
}
