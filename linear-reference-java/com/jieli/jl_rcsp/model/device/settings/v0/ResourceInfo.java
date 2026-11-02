package com.jieli.jl_rcsp.model.device.settings.v0;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.interfaces.cmd.IDataOp;
import com.jieli.jl_rcsp.util.CHexConver;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes17.dex */
public class ResourceInfo implements IDataOp, Parcelable {
    public static final Parcelable.Creator<ResourceInfo> CREATOR = null;
    private int cluster;
    private short crc;
    private int devHandle;
    private String filePath;

    static {
        CREATOR = new AnonymousClass1();
    }

    public ResourceInfo(byte[] r1) {
        parse(r1);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getCluster() {
        return this.cluster;
    }

    public short getCrc() {
        return this.crc;
    }

    public int getDevHandle() {
        return this.devHandle;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public String getFilename() {
        int r0 = this.filePath.lastIndexOf("/");
        if (r0 <= (-1)) goto L9;
        if (r0 >= this.filePath.length()) goto L9;
        return this.filePath.substring(r0 + 1);
    L9:
        return this.filePath;
    }

    @Override // com.jieli.jl_rcsp.interfaces.cmd.IDataOp
    public int parse(byte[] r5) {
        this.filePath = "";
        if (r5 != null) goto L5;
    L14:
        return 0;
    L5:
        if (r5.length < 12) goto L14;
        this.devHandle = CHexConver.bytesToInt(r5, 0, 4);
        this.cluster = CHexConver.bytesToInt(r5, 4, 4);
        this.crc = CHexConver.bytesToShort(r5, 8);
        int r0 = CHexConver.bytesToInt(r5, 10, 2);
        int r1 = r0 + 12;
        if (r1 <= r5.length) goto L15;
    L13:
        return 12;
    L15:
        this.filePath = new String(r5, 12, r0);     // Catch: Exception -> L11
        return r1;
    L11:
        e = move-exception;
        e.printStackTrace();
        goto L13
    }

    @Override // com.jieli.jl_rcsp.interfaces.cmd.IDataOp
    public byte[] toData() {
        ByteArrayOutputStream r0 = new ByteArrayOutputStream();
        r0.write(CHexConver.intToBigBytes(this.devHandle));     // Catch: IOException -> L6
        r0.write(CHexConver.intToBigBytes(this.cluster));     // Catch: IOException -> L6
        r0.write(CHexConver.shortToBigBytes(this.crc));     // Catch: IOException -> L6
        r0.write(CHexConver.int2byte2(this.filePath.getBytes().length));     // Catch: IOException -> L6
        r0.write(this.filePath.getBytes());     // Catch: IOException -> L6
        return r0.toByteArray();
    L6:
        e = move-exception;
        throw new RuntimeException(e);
    }

    public String toString() {
        return "ResourceInfo{devHandle=" + this.devHandle + ", cluster=" + this.cluster + ", crc=" + this.crc + ", filePath='" + this.filePath + '\'' + i0XO1.IO;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r1, int r2) {
        r1.writeInt(this.devHandle);
        r1.writeInt(this.cluster);
        r1.writeInt(this.crc);
        r1.writeString(this.filePath);
    }

    public ResourceInfo(int r2, String r3) {
        this(r2, 0, 0, r3);
    }

    public ResourceInfo(int r1, int r2, short r3, String r4) {
        if (r4 != null) goto L5;
        r4 = "";
    L5:
        this.devHandle = r1;
        this.cluster = r2;
        this.crc = r3;
        this.filePath = r4;
    }

    public ResourceInfo(Parcel r2) {
        this.devHandle = r2.readInt();
        this.cluster = r2.readInt();
        this.crc = (short) r2.readInt();
        this.filePath = r2.readString();
    }
}
