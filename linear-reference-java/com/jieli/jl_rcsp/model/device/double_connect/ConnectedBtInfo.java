package com.jieli.jl_rcsp.model.device.double_connect;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.util.CHexConver;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class ConnectedBtInfo implements Parcelable {
    public static final Parcelable.Creator<ConnectedBtInfo> CREATOR = null;
    private int connectionNum;
    private List<DeviceBtInfo> mDeviceBtInfoList;

    static {
        CREATOR = new AnonymousClass1();
    }

    public ConnectedBtInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getConnectionNum() {
        return this.connectionNum;
    }

    public List<DeviceBtInfo> getDeviceBtInfoList() {
        return this.mDeviceBtInfoList;
    }

    public int parseConnectedDeviceBtData(byte[] r7) {
        if (r7 != null) goto L5;
    L19:
        return 0;
    L5:
        if (r7.length == 0) goto L19;
        this.connectionNum = CHexConver.byteToInt(r7[0]);
        if (r7.length >= 2) goto L11;
        this.connectionNum = 0;
        return 0;
    L11:
        int r1 = r7.length - 1;
        byte[] r3 = new byte[r1];
        System.arraycopy(r7, 1, r3, 0, r1);
        this.mDeviceBtInfoList = new ArrayList();
        int r8 = 0;
    L12:
        if (r8 >= r1) goto L17;
        int r2 = r1 - r8;
        byte[] r4 = new byte[r2];
        System.arraycopy(r3, r8, r4, 0, r2);
        DeviceBtInfo r5 = new DeviceBtInfo();
        int r6 = r5.parseData(r4);
        if (r6 == 0) goto L17;
        this.mDeviceBtInfoList.add(r5);
        r8 = r8 + r6;
    L17:
        this.connectionNum = this.mDeviceBtInfoList.size();
        return r8;
    }

    public byte[] toData() {
        ByteArrayOutputStream r0 = new ByteArrayOutputStream();
        r0.write(this.connectionNum);
        List<DeviceBtInfo> r1 = this.mDeviceBtInfoList;
        if (r1 == null) goto L14;
        if (r1.size() <= 0) goto L14;
        Iterator<DeviceBtInfo> r2 = this.mDeviceBtInfoList.iterator();     // Catch: Exception -> L11
    L8:
        if (r2.hasNext() == false) goto L14;
        r0.write(r2.next().toData());     // Catch: Exception -> L11
    L11:
        e = move-exception;
        e.printStackTrace();
    L14:
        return r0.toByteArray();
    }

    public String toString() {
        return "ConnectedBtInfo{connectionNum=" + this.connectionNum + ", mDeviceBtInfoList=" + this.mDeviceBtInfoList + i0XO1.IO;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r1, int r2) {
        r1.writeInt(this.connectionNum);
        r1.writeTypedList(this.mDeviceBtInfoList);
    }

    public ConnectedBtInfo(Parcel r2) {
        this.connectionNum = r2.readInt();
        this.mDeviceBtInfoList = r2.createTypedArrayList(DeviceBtInfo.CREATOR);
    }
}
