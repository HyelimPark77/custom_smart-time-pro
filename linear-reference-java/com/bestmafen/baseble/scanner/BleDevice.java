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

    public BleDevice(@aa1 BluetoothDevice r2, int r3, @tb1 byte[] r4, @aa1 String r5, int r6, @aa1 String r7) {
        Intrinsics.X0O(r2, "mBluetoothDevice");
        Intrinsics.X0O(r5, "mName");
        Intrinsics.X0O(r7, "mAddress");
        this.mBluetoothDevice = r2;
        this.mRssi = r3;
        this.mScanRecord = r4;
        this.mName = r5;
        this.mType = r6;
        this.mAddress = r7;
    }

    public static /* synthetic */ BleDevice copy$default(BleDevice r0, BluetoothDevice r1, int r2, byte[] r3, String r4, int r5, String r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r0.mBluetoothDevice;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r0.mRssi;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = r0.mScanRecord;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r4 = r0.mName;
    L15:
        if ((r7 & 16) == 0) goto L18;
        r5 = r0.mType;
    L18:
        if ((r7 & 32) == 0) goto L20;
        r6 = r0.mAddress;
    L20:
        int r9 = r5;
        String r10 = r6;
        byte[] r11 = r3;
        String r12 = r4;
        return r0.copy(r1, r2, r11, r12, r9, r10);
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
    public final BleDevice copy(@aa1 BluetoothDevice r9, int r10, @tb1 byte[] r11, @aa1 String r12, int r13, @aa1 String r14) {
        Intrinsics.X0O(r9, "mBluetoothDevice");
        Intrinsics.X0O(r12, "mName");
        Intrinsics.X0O(r14, "mAddress");
        return new BleDevice(r9, r10, r11, r12, r13, r14);
    }

    public boolean equals(@tb1 Object r2) {
        if ((r2 instanceof BleDevice) == true) goto L5;
        return false;
    L5:
        return Intrinsics.XOO0ii0(this.mBluetoothDevice, ((BleDevice) r2).mBluetoothDevice);
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

    public final void setMAddress(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mAddress = r2;
    }

    public final void setMBluetoothDevice(@aa1 BluetoothDevice r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mBluetoothDevice = r2;
    }

    public final void setMName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mName = r2;
    }

    public final void setMRssi(int r1) {
        this.mRssi = r1;
    }

    public final void setMScanRecord(@tb1 byte[] r1) {
        this.mScanRecord = r1;
    }

    public final void setMType(int r1) {
        this.mType = r1;
    }

    @aa1
    public String toString() {
        return "BleDevice(type=" + this.mType + ", name=" + this.mName + ", address=" + this.mAddress + ", mRssi=" + this.mRssi + ", mScanRecord=" + ByteArrayExtKt.getMHexString(this.mScanRecord) + HexStringBuilder.COMMENT_END_CHAR;
    }
}
