package com.bestmafen.baseble.scanner;

import android.bluetooth.BluetoothDevice;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.ByteArrayExtKt;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class BleDevice implements Serializable {

    @aa1
    private String mAddress;

    @aa1
    private transient BluetoothDevice mBluetoothDevice;

    @aa1
    private String mName;
    private int mRssi;

    @tb1
    private byte[] mScanRecord;
    private int mType;

    public BleDevice(@aa1 BluetoothDevice mBluetoothDevice, int i, @tb1 byte[] bArr, @aa1 String mName, int i2, @aa1 String mAddress) {
        Intrinsics.X0O(mBluetoothDevice, "mBluetoothDevice");
        Intrinsics.X0O(mName, "mName");
        Intrinsics.X0O(mAddress, "mAddress");
        this.mBluetoothDevice = mBluetoothDevice;
        this.mRssi = i;
        this.mScanRecord = bArr;
        this.mName = mName;
        this.mType = i2;
        this.mAddress = mAddress;
    }

    public static /* synthetic */ BleDevice copy$default(BleDevice bleDevice, BluetoothDevice bluetoothDevice, int i, byte[] bArr, String str, int i2, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            bluetoothDevice = bleDevice.mBluetoothDevice;
        }
        if ((i3 & 2) != 0) {
            i = bleDevice.mRssi;
        }
        if ((i3 & 4) != 0) {
            bArr = bleDevice.mScanRecord;
        }
        if ((i3 & 8) != 0) {
            str = bleDevice.mName;
        }
        if ((i3 & 16) != 0) {
            i2 = bleDevice.mType;
        }
        if ((i3 & 32) != 0) {
            str2 = bleDevice.mAddress;
        }
        int i4 = i2;
        String str3 = str2;
        return bleDevice.copy(bluetoothDevice, i, bArr, str, i4, str3);
    }

    @aa1
    public final BluetoothDevice component1() {
        return this.mBluetoothDevice;
    }

    public final int component2() {
        return this.mRssi;
    }

    @tb1
    public final byte[] component3() {
        return this.mScanRecord;
    }

    @aa1
    public final String component4() {
        return this.mName;
    }

    public final int component5() {
        return this.mType;
    }

    @aa1
    public final String component6() {
        return this.mAddress;
    }

    @aa1
    public final BleDevice copy(@aa1 BluetoothDevice mBluetoothDevice, int i, @tb1 byte[] bArr, @aa1 String mName, int i2, @aa1 String mAddress) {
        Intrinsics.X0O(mBluetoothDevice, "mBluetoothDevice");
        Intrinsics.X0O(mName, "mName");
        Intrinsics.X0O(mAddress, "mAddress");
        return new BleDevice(mBluetoothDevice, i, bArr, mName, i2, mAddress);
    }

    public boolean equals(@tb1 Object obj) {
        if (obj instanceof BleDevice) {
            return Intrinsics.XOO0ii0(this.mBluetoothDevice, ((BleDevice) obj).mBluetoothDevice);
        }
        return false;
    }

    @aa1
    public final String getMAddress() {
        return this.mAddress;
    }

    @aa1
    public final BluetoothDevice getMBluetoothDevice() {
        return this.mBluetoothDevice;
    }

    @aa1
    public final String getMName() {
        return this.mName;
    }

    public final int getMRssi() {
        return this.mRssi;
    }

    @tb1
    public final byte[] getMScanRecord() {
        return this.mScanRecord;
    }

    public final int getMType() {
        return this.mType;
    }

    public int hashCode() {
        return this.mBluetoothDevice.hashCode();
    }

    public final void setMAddress(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mAddress = str;
    }

    public final void setMBluetoothDevice(@aa1 BluetoothDevice bluetoothDevice) {
        Intrinsics.X0O(bluetoothDevice, "<set-?>");
        this.mBluetoothDevice = bluetoothDevice;
    }

    public final void setMName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mName = str;
    }

    public final void setMRssi(int i) {
        this.mRssi = i;
    }

    public final void setMScanRecord(@tb1 byte[] bArr) {
        this.mScanRecord = bArr;
    }

    public final void setMType(int i) {
        this.mType = i;
    }

    @aa1
    public String toString() {
        return "BleDevice(type=" + this.mType + ", name=" + this.mName + ", address=" + this.mAddress + ", mRssi=" + this.mRssi + ", mScanRecord=" + ByteArrayExtKt.getMHexString(this.mScanRecord) + HexStringBuilder.COMMENT_END_CHAR;
    }
}
