package com.jieli.jl_rcsp.model.device.settings;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.interfaces.cmd.IDataOp;
import com.jieli.jl_rcsp.util.CHexConver;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes17.dex */
public class SettingData implements IDataOp, Parcelable {
    public static final Parcelable.Creator<SettingData> CREATOR = null;
    private byte[] data;
    private int version;

    static {
        CREATOR = new AnonymousClass1();
    }

    public SettingData(byte[] r2) {
        this.data = new byte[0];
        parse(r2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public byte[] getData() {
        return this.data;
    }

    public int getVersion() {
        return this.version;
    }

    @Override // com.jieli.jl_rcsp.interfaces.cmd.IDataOp
    public int parse(byte[] r5) {
        if (r5 != null) goto L5;
    L12:
        return 0;
    L5:
        if (r5.length == 0) goto L12;
        this.version = CHexConver.byteToInt(r5[0]);
        if (r5.length <= 1) goto L11;
        int r1 = r5.length - 1;
        byte[] r3 = new byte[r1];
        this.data = r3;
        System.arraycopy(r5, 1, r3, 0, r1);
    L11:
        return r5.length;
    }

    @Override // com.jieli.jl_rcsp.interfaces.cmd.IDataOp
    public byte[] toData() {
        ByteArrayOutputStream r0 = new ByteArrayOutputStream();
        r0.write(this.version);     // Catch: IOException -> L6
        r0.write(this.data);     // Catch: IOException -> L6
        return r0.toByteArray();
    L6:
        e = move-exception;
        throw new RuntimeException(e);
    }

    public String toString() {
        return "SettingData{version=" + this.version + ", data=" + CHexConver.byte2HexStr(this.data) + i0XO1.IO;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r1, int r2) {
        r1.writeInt(this.version);
        r1.writeByteArray(this.data);
    }

    public SettingData(int r1, byte[] r2) {
        this.version = r1;
        this.data = r2;
    }

    public SettingData(Parcel r2) {
        this.version = r2.readInt();
        this.data = r2.createByteArray();
    }
}
