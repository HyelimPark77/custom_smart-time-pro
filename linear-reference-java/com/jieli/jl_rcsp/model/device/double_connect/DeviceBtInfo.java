package com.jieli.jl_rcsp.model.device.double_connect;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.util.CHexConver;
import com.jieli.jl_rcsp.util.RcspUtil;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes17.dex */
public class DeviceBtInfo implements Parcelable {
    public static final Parcelable.Creator<DeviceBtInfo> CREATOR = null;
    private String address;
    private String btName;
    private boolean isBind;

    static {
        CREATOR = new AnonymousClass1();
    }

    public DeviceBtInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAddress() {
        return this.address;
    }

    public String getBtName() {
        return this.btName;
    }

    public boolean isBind() {
        return this.isBind;
    }

    public int parseData(byte[] r7) {
        if (r7 != null) goto L5;
    L28:
        return 0;
    L5:
        if (r7.length == 0) goto L28;
        if (CHexConver.byteToInt(r7[0]) != 1) goto L10;
        boolean r1 = true;
    L11:
        this.isBind = r1;
        int r3 = 7;
        if (7 > r7.length) goto L14;
        byte[] r4 = new byte[6];
        System.arraycopy(r7, 1, r4, 0, 6);
        this.address = CHexConver.hexDataCovetToAddress(r4);
    L15:
        int r2 = r3 + 1;
        if (r2 > r7.length) goto L27;
        int r5 = CHexConver.byteToInt(r7[r3]);
        if (r5 <= 0) goto L27;
        if (r5 > (r7.length - 1)) goto L27;
        byte[] r6 = new byte[r5];
        System.arraycopy(r7, r2, r6, 0, r5);
        int r8 = r2 + r5;
        this.btName = new String(r6);     // Catch: Exception -> L24
    L26:
        return r8;
    L24:
        e = move-exception;
        e.printStackTrace();
    L27:
        return r3;
    L14:
        r3 = 1;
        goto L15
    L10:
        r1 = false;
        goto L11
    }

    public DeviceBtInfo setAddress(String r1) {
        this.address = r1;
        return this;
    }

    public DeviceBtInfo setBind(boolean r1) {
        this.isBind = r1;
        return this;
    }

    public DeviceBtInfo setBtName(String r5) {
        if (r5 != null) goto L11;
    L9:
        this.btName = r5;
        return this;
    L11:
        byte[] r0 = r5.getBytes();     // Catch: Exception -> L7
        if (r0.length <= 60) goto L9;
        r5 = new String(r0, 0, 60);     // Catch: Exception -> L7
    L7:
        e = move-exception;
        e.printStackTrace();
        goto L9
    }

    public byte[] toData() {
        ByteArrayOutputStream r0 = new ByteArrayOutputStream();
        r0.write(this.isBind ? 1 : 0);     // Catch: Exception -> L10
        byte[] r2 = new byte[6];     // Catch: Exception -> L10
        String r3 = this.address;     // Catch: Exception -> L10
        if (r3 == null) goto L12;
        byte[] r4 = RcspUtil.addressCovertToByteArray(r3);     // Catch: Exception -> L10
        if (r4 == null) goto L12;
        if (r4.length != 6) goto L12;
        r2 = r4;
    L12:
        r0.write(r2);     // Catch: Exception -> L10
        String r1 = this.btName;     // Catch: Exception -> L10
        if (r1 == null) goto L18;
        r0.write(r1.getBytes().length);     // Catch: Exception -> L10
        r0.write(this.btName.getBytes());     // Catch: Exception -> L10
    L18:
        return r0.toByteArray();
    L10:
        e = move-exception;
        e.printStackTrace();
        goto L18
    }

    public String toString() {
        return "DeviceBtInfo{isBind=" + this.isBind + ", address='" + this.address + "', btName='" + this.btName + '\'' + i0XO1.IO;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r1, int r2) {
        r1.writeByte(this.isBind ? 1 : 0);
        r1.writeString(this.address);
        r1.writeString(this.btName);
    }

    public DeviceBtInfo(Parcel r2) {
        if (r2.readByte() == 0) goto L5;
        boolean r0 = true;
    L6:
        this.isBind = r0;
        this.address = r2.readString();
        this.btName = r2.readString();
        return;
    L5:
        r0 = false;
        goto L6
    }
}
