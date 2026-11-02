package com.jieli.jl_fatfs.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_filebrowse.bean.FileStruct;

/* JADX INFO: loaded from: classes17.dex */
public class FatFile implements Parcelable {
    public static final Parcelable.Creator<FatFile> CREATOR = null;
    private int cluster;
    private byte devIndex;
    private boolean file;
    private short fileNum;
    private boolean isDir;
    private String modifyTime;
    private String name;
    private String path;
    private long size;
    private boolean unicode;

    static {
        CREATOR = new AnonymousClass1();
    }

    public FatFile() {
    }

    public static FatFile create(FileStruct r3) {
        if (r3 != null) goto L5;
        return null;
    L5:
        FatFile r0 = new FatFile();
        r0.setName(r3.getName());
        r0.setCluster(r3.getCluster());
        r0.setDevIndex(r3.getDevIndex());
        r0.setFileNum(r3.getFileNum());
        r0.setFile(r3.isFile());
        r0.setUnicode(r3.isUnicode());
        r0.setPath("/" + r3.getName());
        return r0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getCluster() {
        return this.cluster;
    }

    public byte getDevIndex() {
        return this.devIndex;
    }

    public short getFileNum() {
        return this.fileNum;
    }

    public String getModifyTime() {
        return this.modifyTime;
    }

    public String getName() {
        return this.name;
    }

    public String getPath() {
        return this.path;
    }

    public long getSize() {
        return this.size;
    }

    public boolean isDir() {
        return this.isDir;
    }

    public boolean isFile() {
        return this.file;
    }

    public boolean isUnicode() {
        return this.unicode;
    }

    public void setCluster(int r1) {
        this.cluster = r1;
    }

    public void setDevIndex(byte r1) {
        this.devIndex = r1;
    }

    public void setDir(boolean r1) {
        this.isDir = r1;
    }

    public void setFile(boolean r1) {
        this.file = r1;
    }

    public void setFileNum(short r1) {
        this.fileNum = r1;
    }

    public void setModifyTime(String r1) {
        this.modifyTime = r1;
    }

    public void setName(String r1) {
        this.name = r1;
    }

    public void setPath(String r1) {
        this.path = r1;
    }

    public void setSize(long r1) {
        this.size = r1;
    }

    public void setUnicode(boolean r1) {
        this.unicode = r1;
    }

    public String toString() {
        return "FatFile{size=" + this.size + ", name='" + this.name + "', isDir=" + this.isDir + ", modifyTime='" + this.modifyTime + "', path='" + this.path + "', file=" + this.file + ", unicode=" + this.unicode + ", cluster=" + this.cluster + ", fileNum=" + this.fileNum + ", devIndex=" + this.devIndex + i0XO1.IO;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r3, int r4) {
        r3.writeLong(this.size);
        r3.writeString(this.name);
        r3.writeByte(this.isDir ? 1 : 0);
        r3.writeString(this.modifyTime);
        r3.writeString(this.path);
        r3.writeInt(this.cluster);
        r3.writeInt(this.file ? 1 : 0);
        r3.writeInt(this.unicode ? 1 : 0);
        r3.writeInt(this.fileNum);
        r3.writeByte(this.devIndex);
    }

    public FatFile(Parcel r4) {
        this.size = r4.readLong();
        this.name = r4.readString();
        boolean r1 = false;
        if (r4.readByte() == 0) goto L5;
        boolean r0 = true;
    L6:
        this.isDir = r0;
        this.modifyTime = r4.readString();
        this.path = r4.readString();
        this.cluster = r4.readInt();
        if (r4.readInt() != 1) goto L9;
        boolean r2 = true;
    L10:
        this.file = r2;
        if (r4.readInt() != 1) goto L13;
        r1 = true;
    L13:
        this.unicode = r1;
        this.fileNum = (short) r4.readInt();
        this.devIndex = r4.readByte();
        return;
    L9:
        r2 = false;
        goto L10
    L5:
        r0 = false;
        goto L6
    }
}
