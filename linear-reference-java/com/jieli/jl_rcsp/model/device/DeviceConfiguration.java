package com.jieli.jl_rcsp.model.device;

import android.os.Parcel;
import android.os.Parcelable;
import com.jieli.jl_rcsp.interfaces.cmd.IDataOp;
import com.jieli.jl_rcsp.util.CHexConver;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes17.dex */
public class DeviceConfiguration implements IDataOp, Parcelable {
    public static final Parcelable.Creator<DeviceConfiguration> CREATOR = null;
    public static final int FLAG_TWS_HEADSET = 1;
    public static final int FLAG_WATCH = 0;
    private byte[] data;
    private int type;
    private int version;

    static {
        CREATOR = new AnonymousClass1();
    }

    public DeviceConfiguration() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public byte[] getData() {
        return this.data;
    }

    public int getType() {
        return this.type;
    }

    public int getVersion() {
        return this.version;
    }

    @Override // com.jieli.jl_rcsp.interfaces.cmd.IDataOp
    public int parse(byte[] r5) {
        this.data = new byte[0];
        if (r5 != null) goto L5;
    L12:
        return 0;
    L5:
        if (r5.length < 2) goto L12;
        this.type = CHexConver.byteToInt(r5[0]);
        this.version = CHexConver.byteToInt(r5[1]);
        if (2 >= r5.length) goto L11;
        int r1 = r5.length - 2;
        byte[] r3 = new byte[r1];
        this.data = r3;
        System.arraycopy(r5, 2, r3, 0, r1);
        return parsePayload(this.data) + 2;
    L11:
        return 2;
    }

    public int parsePayload(byte[] r1) {
        return 0;
    }

    @Override // com.jieli.jl_rcsp.interfaces.cmd.IDataOp
    public byte[] toData() {
        ByteArrayOutputStream r0 = new ByteArrayOutputStream();
        r0.write(this.type);     // Catch: IOException -> L7
        r0.write(this.version);     // Catch: IOException -> L7
        byte[] r1 = this.data;     // Catch: IOException -> L7
        if (r1 == null) goto L10;
        r0.write(r1);     // Catch: IOException -> L7
    L10:
        return r0.toByteArray();
    L7:
        e = move-exception;
        e.printStackTrace();
        goto L10
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r1, int r2) {
        r1.writeInt(this.type);
        r1.writeInt(this.version);
        r1.writeByteArray(this.data);
    }

    public DeviceConfiguration(int r1, int r2, byte[] r3) {
        this.type = r1;
        this.version = r2;
        this.data = r3;
    }

    public DeviceConfiguration(Parcel r2) {
        this.type = r2.readInt();
        this.version = r2.readInt();
        this.data = r2.createByteArray();
    }
}
