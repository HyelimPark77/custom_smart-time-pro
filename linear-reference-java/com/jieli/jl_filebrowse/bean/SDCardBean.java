package com.jieli.jl_filebrowse.bean;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.mltcode.paycertificationapi.i0XO1;
import java.util.Objects;

/* JADX INFO: loaded from: classes17.dex */
public class SDCardBean implements Parcelable {
    public static final Parcelable.Creator<SDCardBean> CREATOR = null;
    public static final int FLASH = 2;
    public static final int FLASH_2 = 4;
    public static final int INDEX_FLASH = 3;
    public static final int INDEX_FLASH2 = 5;
    public static final int INDEX_FLASH3 = 6;
    public static final int INDEX_LINE_IN = 4;
    public static final int INDEX_SD0 = 1;
    public static final int INDEX_SD1 = 2;
    public static final int INDEX_USB = 0;
    public static final int LINEIN = 3;
    public static final int SD = 0;
    public static final int USB = 1;
    private int devHandler;
    private BluetoothDevice device;
    private int index;
    private String name;
    private boolean online;
    private int type;

    static {
        CREATOR = new AnonymousClass1();
    }

    public SDCardBean() {
        this.devHandler = -1;
    }

    public static int getStorageType(int r0) {
        switch(r0) {
            case 0: goto L13;
            case 1: goto L11;
            case 2: goto L11;
            case 3: goto L9;
            case 4: goto L7;
            case 5: goto L5;
            case 6: goto L5;
            default: goto L3;
        };
    L3:
        return -1;
    L5:
        return 4;
    L7:
        return 3;
    L9:
        return 2;
    L11:
        return 0;
    L13:
        return 1;
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
        SDCardBean r6 = (SDCardBean) r5;
        if (this.index != r6.index) goto L17;
        if (this.devHandler != r6.devHandler) goto L17;
        if (Objects.equals(this.device, r6.device) == false) goto L17;
        return true;
    }

    public int getDevHandler() {
        return this.devHandler;
    }

    public BluetoothDevice getDevice() {
        return this.device;
    }

    public int getIndex() {
        return this.index;
    }

    public String getName() {
        return this.name;
    }

    public int getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.index), Integer.valueOf(this.devHandler), this.device});
    }

    public boolean isOnline() {
        return this.online;
    }

    public SDCardBean setDevHandler(int r1) {
        this.devHandler = r1;
        return this;
    }

    public SDCardBean setDevice(BluetoothDevice r1) {
        this.device = r1;
        return this;
    }

    public SDCardBean setIndex(int r1) {
        this.index = r1;
        return this;
    }

    public SDCardBean setName(String r1) {
        this.name = r1;
        return this;
    }

    public SDCardBean setOnline(boolean r1) {
        this.online = r1;
        return this;
    }

    public SDCardBean setType(int r1) {
        this.type = r1;
        return this;
    }

    public String toString() {
        return "SDCardBean{index=" + this.index + ", type=" + this.type + ", name='" + this.name + "', devHandler=" + this.devHandler + ", online=" + this.online + ", device='" + this.device + '\'' + i0XO1.IO;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r2, int r3) {
        r2.writeInt(this.index);
        r2.writeInt(this.type);
        r2.writeString(this.name);
        r2.writeInt(this.devHandler);
        r2.writeByte(this.online ? 1 : 0);
        r2.writeParcelable(this.device, r3);
    }

    public SDCardBean(Parcel r2) {
        this.devHandler = -1;
        this.index = r2.readInt();
        this.type = r2.readInt();
        this.name = r2.readString();
        this.devHandler = r2.readInt();
        if (r2.readByte() == 0) goto L5;
        boolean r0 = true;
    L6:
        this.online = r0;
        this.device = (BluetoothDevice) r2.readParcelable(BluetoothDevice.class.getClassLoader());
        return;
    L5:
        r0 = false;
        goto L6
    }
}
