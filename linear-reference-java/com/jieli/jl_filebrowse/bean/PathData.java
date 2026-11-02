package com.jieli.jl_filebrowse.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.interfaces.cmd.IDataOp;
import com.jieli.jl_rcsp.util.CHexConver;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class PathData implements IDataOp, Parcelable {
    public static final Parcelable.Creator<PathData> CREATOR = null;
    public static final byte PATH_TYPE_FILE = 1;
    public static final byte PATH_TYPE_FlODER = 0;
    private int devHandler;
    private final List<Integer> path;
    private byte readNum;
    private int repeatTimes;
    private short startIndex;
    private byte type;

    static {
        CREATOR = new AnonymousClass1();
    }

    public PathData() {
        this.type = 0;
        this.readNum = 10;
        this.startIndex = 1;
        this.devHandler = 0;
        this.repeatTimes = 3;
        ArrayList r1 = new ArrayList();
        this.path = r1;
        r1.add(0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getDevHandler() {
        return this.devHandler;
    }

    public List<Integer> getPath() {
        return this.path;
    }

    public byte getReadNum() {
        return this.readNum;
    }

    public int getRepeatTimes() {
        return this.repeatTimes;
    }

    public short getStartIndex() {
        return this.startIndex;
    }

    public byte getType() {
        return this.type;
    }

    @Override // com.jieli.jl_rcsp.interfaces.cmd.IDataOp
    public int parse(byte[] r7) {
        int r0 = 0;
        if (r7 != null) goto L5;
    L17:
        return 0;
    L5:
        if (r7.length < 10) goto L17;
        this.type = r7[0];
        this.readNum = r7[1];
        this.startIndex = (short) CHexConver.bytesToInt(r7, 2, 2);
        this.devHandler = CHexConver.bytesToInt(r7, 4, 4);
        int r1 = CHexConver.bytesToInt(r7, 8, 2);
        this.path.clear();
        if (r1 <= 0) goto L16;
        int r4 = r1 + 10;
        if (r4 > r7.length) goto L16;
        byte[] r5 = new byte[r1];
        System.arraycopy(r7, 10, r5, 0, r1);
    L12:
        int r8 = r0 + 4;
        if (r8 > r1) goto L15;
        this.path.add(Integer.valueOf(CHexConver.bytesToInt(r5, r0, 4)));
        r0 = r8;
        goto L12
    L15:
        return r4;
    L16:
        return 10;
    }

    public void setRepeatTimes(int r1) {
        this.repeatTimes = r1;
    }

    @Override // com.jieli.jl_rcsp.interfaces.cmd.IDataOp
    public byte[] toData() {
        ByteArrayOutputStream r0 = new ByteArrayOutputStream();
        r0.write(this.type);     // Catch: IOException -> L10
        r0.write(this.readNum);     // Catch: IOException -> L10
        r0.write(CHexConver.shortToBigBytes(this.startIndex));     // Catch: IOException -> L10
        r0.write(CHexConver.intToBigBytes(this.devHandler));     // Catch: IOException -> L10
        ByteArrayOutputStream r1 = new ByteArrayOutputStream();     // Catch: IOException -> L10
        Iterator<Integer> r2 = this.path.iterator();     // Catch: IOException -> L10
    L5:
        if (r2.hasNext() == false) goto L12;
        Integer r3 = r2.next();     // Catch: IOException -> L10
        if (r3 == null) goto L5;
        r1.write(CHexConver.intToBigBytes(r3.intValue()));     // Catch: IOException -> L10
        goto L5
    L12:
        byte[] r4 = r1.toByteArray();     // Catch: IOException -> L10
        r0.write(CHexConver.int2byte2(r4.length));     // Catch: IOException -> L10
        r0.write(r4);     // Catch: IOException -> L10
    L16:
        return r0.toByteArray();
    L10:
        e = move-exception;
        e.printStackTrace();
        goto L16
    }

    public String toString() {
        return "PathData{type=" + this.type + ", readNum=" + this.readNum + ", startIndex=" + this.startIndex + ", devHandler=" + this.devHandler + ", path=" + this.path + ", repeatTimes=" + this.repeatTimes + i0XO1.IO;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r3, int r4) {
        r3.writeByte(this.type);
        r3.writeByte(this.readNum);
        r3.writeInt(this.startIndex);
        r3.writeInt(this.devHandler);
        r3.writeInt(this.repeatTimes);
        int[] r5 = new int[this.path.size()];
        int r0 = 0;
    L4:
        if (r0 >= this.path.size()) goto L6;
        r5[r0] = this.path.get(r0).intValue();
        r0 = r0 + 1;
        goto L4
    L6:
        r3.writeIntArray(r5);
    }

    public PathData(byte r2, byte r3, short r4, int r5, List<Integer> r6) {
        this.repeatTimes = 3;
        this.type = r2;
        this.readNum = r3;
        this.startIndex = r4;
        this.devHandler = r5;
        this.path = r6;
    }

    public PathData(Parcel r5) {
        int r0 = 0;
        this.type = 0;
        this.readNum = 10;
        this.startIndex = 1;
        this.devHandler = 0;
        this.repeatTimes = 3;
        this.type = r5.readByte();
        this.readNum = r5.readByte();
        this.startIndex = (short) r5.readInt();
        this.devHandler = r5.readInt();
        this.repeatTimes = r5.readInt();
        int[] r6 = r5.createIntArray();
        if (r6 != null) goto L5;
        r6 = new int[0];
    L5:
        this.path = new ArrayList();
        int r1 = r6.length;
    L6:
        if (r0 >= r1) goto L8;
        int r2 = r6[r0];
        this.path.add(Integer.valueOf(r2));
        r0 = r0 + 1;
        goto L6
    }
}
