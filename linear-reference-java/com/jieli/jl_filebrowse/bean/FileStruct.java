package com.jieli.jl_filebrowse.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.interfaces.cmd.IDataOp;
import com.jieli.jl_rcsp.util.CHexConver;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes17.dex */
public class FileStruct implements IDataOp, Parcelable {
    public static final Parcelable.Creator<FileStruct> CREATOR = null;
    private int cluster;
    private byte devIndex;
    private boolean file;
    private short fileNum;
    private String name;
    private boolean unicode;

    static {
        CREATOR = new AnonymousClass1();
    }

    public FileStruct() {
        this.cluster = 0;
        this.fileNum = 1;
        this.name = "";
    }

    public static int parseFileStruct(byte[] r3, int r4, List<FileStruct> r5) {
        if (r3 != null) goto L5;
    L15:
        return 0;
    L5:
        if ((r3.length - r4) < 8) goto L15;
        if (r5 == null) goto L15;
    L9:
        if (r4 >= r3.length) goto L14;
        int r1 = r3.length - r4;
        byte[] r2 = new byte[r1];
        System.arraycopy(r3, r4, r2, 0, r1);
        FileStruct r6 = new FileStruct();
        int r7 = r6.parse(r2);
        if (r7 <= 0) goto L14;
        r5.add(r6);
        r4 = r4 + r7;
    L14:
        return r4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L17:
        return false;
    L8:
        if (getClass() != r5.getClass()) goto L17;
        FileStruct r6 = (FileStruct) r5;
        if (this.file != r6.file) goto L17;
        if (this.cluster != r6.cluster) goto L17;
        if (this.devIndex != r6.devIndex) goto L17;
        return true;
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

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Boolean.valueOf(this.file), Integer.valueOf(this.cluster), Byte.valueOf(this.devIndex)});
    }

    public boolean isFile() {
        return this.file;
    }

    public boolean isUnicode() {
        return this.unicode;
    }

    @Override // com.jieli.jl_rcsp.interfaces.cmd.IDataOp
    public int parse(byte[] r6) {
        if (r6 != null) goto L5;
    L19:
        return 0;
    L5:
        if (r6.length < 8) goto L19;
        byte r1 = r6[0];
        this.file = CHexConver.checkBitValue(r1, 0);
        this.unicode = !CHexConver.checkBitValue(r1, 1);
        this.devIndex = (byte) ((r1 & 124) >> 2);
        this.cluster = CHexConver.bytesToInt(r6, 1, 4);
        this.fileNum = (short) CHexConver.bytesToInt(r6, 5, 2);
        byte r0 = r6[7];
        int r2 = r0 + 8;
        if (r2 <= r6.length) goto L20;
    L18:
        return 8;
    L20:
    L12:
        e = move-exception;
        e.printStackTrace();
        goto L18
    L10:
        if (this.unicode == false) goto L14;
        String r4 = "utf-16le";
    L15:
        this.name = new String(r6, 8, r0, r4);     // Catch: Exception -> L12
        return r2;
    L14:
        r4 = "gbk";
        goto L15
    }

    @Override // com.jieli.jl_rcsp.interfaces.cmd.IDataOp
    public byte[] toData() {
        ByteArrayOutputStream r0 = new ByteArrayOutputStream();
        r0.write((byte) (CHexConver.setBitValue(CHexConver.setBitValue((byte) 0, 0, this.file), 1, !this.unicode) | (this.devIndex << 2)));     // Catch: IOException -> L6
        r0.write(CHexConver.intToBigBytes(this.cluster));     // Catch: IOException -> L6
        r0.write(CHexConver.int2byte2(this.fileNum));     // Catch: IOException -> L6
        String r1 = this.name;     // Catch: IOException -> L6
        if (this.unicode == false) goto L8;
        String r2 = "utf-16le";
    L9:
        byte[] r3 = r1.getBytes(r2);     // Catch: IOException -> L6
        r0.write(r3.length);     // Catch: IOException -> L6
        r0.write(r3);     // Catch: IOException -> L6
    L13:
        return r0.toByteArray();
    L8:
        r2 = "gbk";
    L6:
        e = move-exception;
        e.printStackTrace();
        goto L13
    }

    public String toString() {
        return "FileStruct{file=" + this.file + ", unicode=" + this.unicode + ", cluster=" + this.cluster + ", fileNum=" + this.fileNum + ", devIndex=" + this.devIndex + ", name='" + this.name + '\'' + i0XO1.IO;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r1, int r2) {
        r1.writeByte(this.file ? 1 : 0);
        r1.writeByte(this.unicode ? 1 : 0);
        r1.writeInt(this.cluster);
        r1.writeInt(this.fileNum);
        r1.writeString(this.name);
        r1.writeByte(this.devIndex);
    }

    public FileStruct(boolean r1, boolean r2, int r3, short r4, String r5, byte r6) {
        this.file = r1;
        this.unicode = r2;
        this.cluster = r3;
        this.fileNum = r4;
        this.name = r5;
        this.devIndex = r6;
    }

    public FileStruct(Parcel r4) {
        boolean r0 = false;
        this.cluster = 0;
        this.fileNum = 1;
        this.name = "";
        if (r4.readByte() == 0) goto L5;
        boolean r2 = true;
    L6:
        this.file = r2;
        if (r4.readByte() == 0) goto L9;
        r0 = true;
    L9:
        this.unicode = r0;
        this.cluster = r4.readInt();
        this.fileNum = (short) r4.readInt();
        this.name = r4.readString();
        this.devIndex = r4.readByte();
        return;
    L5:
        r2 = false;
        goto L6
    }
}
