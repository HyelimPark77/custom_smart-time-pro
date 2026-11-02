package com.jieli.jl_rcsp.model.device.settings.v0;

import android.bluetooth.BluetoothAdapter;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.interfaces.cmd.IDataOp;
import com.jieli.jl_rcsp.util.CHexConver;
import com.jieli.jl_rcsp.util.RcspUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes17.dex */
public class DeviceState implements IDataOp, Parcelable {
    public static final Parcelable.Creator<DeviceState> CREATOR = null;
    public static final String INVALID_ADDRESS = "00:00:00:00:00:00";
    private String bleAddress;
    private String classAddress;
    private int connectWay;
    private int state;
    private int type;

    static {
        CREATOR = new AnonymousClass1();
    }

    public DeviceState(byte[] r1) {
        parse(r1);
    }

    public static boolean isValidAddress(String r1) {
        if (BluetoothAdapter.checkBluetoothAddress(r1) == true) goto L7;
        return false;
    L7:
        return !INVALID_ADDRESS.equals(r1);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getBleAddress() {
        return this.bleAddress;
    }

    public String getClassAddress() {
        return this.classAddress;
    }

    public int getConnectWay() {
        return this.connectWay;
    }

    public int getState() {
        return this.state;
    }

    public int getType() {
        return this.type;
    }

    public boolean isOnlyBle() {
        if (isValidAddress(this.bleAddress) == true) goto L5;
        return false;
    L5:
        if (isValidAddress(this.classAddress) == true) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // com.jieli.jl_rcsp.interfaces.cmd.IDataOp
    public int parse(byte[] r6) {
        if (r6 != null) goto L5;
    L9:
        return 0;
    L5:
        if (r6.length < 15) goto L9;
        this.type = CHexConver.byteToInt(r6[0]);
        byte[] r3 = new byte[6];
        System.arraycopy(r6, 1, r3, 0, 6);
        this.classAddress = CHexConver.hexDataCovetToAddress(r3);
        byte[] r4 = new byte[6];
        System.arraycopy(r6, 7, r4, 0, 6);
        this.bleAddress = CHexConver.hexDataCovetToAddress(r4);
        this.state = CHexConver.byteToInt(r6[13]);
        this.connectWay = CHexConver.checkBitValue(r6[14], 0) ? 1 : 0;
        return 15;
    }

    @Override // com.jieli.jl_rcsp.interfaces.cmd.IDataOp
    public byte[] toData() {
        ByteArrayOutputStream r0 = new ByteArrayOutputStream();
        r0.write(this.type);     // Catch: IOException -> L6
        byte[] r1 = RcspUtil.addressCovertToByteArray(this.classAddress);     // Catch: IOException -> L6
        if (r1 != null) goto L8;
        r1 = new byte[6];     // Catch: IOException -> L6
    L8:
        r0.write(r1);     // Catch: IOException -> L6
        byte[] r2 = RcspUtil.addressCovertToByteArray(this.bleAddress);     // Catch: IOException -> L6
        if (r2 != null) goto L11;
        r2 = new byte[6];     // Catch: IOException -> L6
    L11:
        r0.write(r2);     // Catch: IOException -> L6
        r0.write(this.state);     // Catch: IOException -> L6
        boolean r3 = true;
        if (this.connectWay == 1) goto L15;
        r3 = false;
    L15:
        r0.write(CHexConver.setBitValue((byte) 0, 0, r3));     // Catch: IOException -> L6
        return r0.toByteArray();
    L6:
        e = move-exception;
        throw new RuntimeException(e);
    }

    public String toString() {
        return "DeviceState{type=" + this.type + ", classAddress='" + this.classAddress + "', bleAddress='" + this.bleAddress + "', state=" + this.state + ", connectWay=" + this.connectWay + i0XO1.IO;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r1, int r2) {
        r1.writeInt(this.type);
        r1.writeString(this.classAddress);
        r1.writeString(this.bleAddress);
        r1.writeInt(this.state);
        r1.writeInt(this.connectWay);
    }

    public DeviceState(int r1, String r2, String r3, int r4, int r5) {
        this.type = r1;
        if (r2 != null) goto L5;
        r2 = INVALID_ADDRESS;
    L5:
        this.classAddress = r2;
        if (r3 != null) goto L8;
        r3 = INVALID_ADDRESS;
    L8:
        this.bleAddress = r3;
        this.state = r4;
        this.connectWay = r5;
    }

    public DeviceState(Parcel r2) {
        this.type = r2.readInt();
        this.classAddress = r2.readString();
        this.bleAddress = r2.readString();
        this.state = r2.readInt();
        this.connectWay = r2.readInt();
    }
}
