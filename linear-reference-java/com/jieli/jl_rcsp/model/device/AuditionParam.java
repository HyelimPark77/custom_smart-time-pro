package com.jieli.jl_rcsp.model.device;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class AuditionParam implements Parcelable {
    public static final Parcelable.Creator<AuditionParam> CREATOR = null;
    private int cluster;
    private byte dev;
    private String name;
    private byte op;
    private byte type;

    static {
        CREATOR = new AnonymousClass1();
    }

    public AuditionParam() {
        this.op = 1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getCluster() {
        return this.cluster;
    }

    public byte[] getData() {
        byte[] r0 = {this.op, this.type, this.dev, 0, 0, 0, 0};
        System.arraycopy(CHexConver.intToBigBytes(this.cluster), 0, r0, 3, 4);
        return r0;
    }

    public byte getDev() {
        return this.dev;
    }

    public String getName() {
        return this.name;
    }

    public byte getOp() {
        return this.op;
    }

    public byte getType() {
        return this.type;
    }

    public void setCluster(int r1) {
        this.cluster = r1;
    }

    public void setDev(byte r1) {
        this.dev = r1;
    }

    public void setName(String r1) {
        this.name = r1;
    }

    public void setType(byte r1) {
        this.type = r1;
    }

    public String toString() {
        return "AuditionParam{op=" + this.op + ", type=" + this.type + ", dev=" + this.dev + ", cluster=" + this.cluster + ", name='" + this.name + '\'' + i0XO1.IO;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r1, int r2) {
        r1.writeByte(this.op);
        r1.writeByte(this.type);
        r1.writeByte(this.dev);
        r1.writeInt(this.cluster);
        r1.writeString(this.name);
    }

    public AuditionParam(Parcel r2) {
        this.op = r2.readByte();
        this.type = r2.readByte();
        this.dev = r2.readByte();
        this.cluster = r2.readInt();
        this.name = r2.readString();
    }
}
