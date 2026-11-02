package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleDeviceFile2 extends BleReadable {
    private int mCRC;

    @aa1
    private byte[] mFileContent;
    private int mFileSize;
    private int mOffsetValue;

    public BleDeviceFile2() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        byte[] r4 = null;
        this(r1, r2, r3, r4, 15, null);
    }

    public static /* synthetic */ BleDeviceFile2 copy$default(BleDeviceFile2 r0, int r1, int r2, int r3, byte[] r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.mCRC;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.mFileSize;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.mOffsetValue;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r0.mFileContent;
    L15:
        return r0.copy(r1, r2, r3, r4);
    }

    public final int component1() {
        return this.mCRC;
    }

    public final int component2() {
        return this.mFileSize;
    }

    public final int component3() {
        return this.mOffsetValue;
    }

    @aa1
    public final byte[] component4() {
        return this.mFileContent;
    }

    @aa1
    public final BleDeviceFile2 copy(int r2, int r3, int r4, @aa1 byte[] r5) {
        Intrinsics.X0O(r5, "mFileContent");
        return new BleDeviceFile2(r2, r3, r4, r5);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mCRC = readUInt8();
        this.mFileSize = BleReadable.readInt32$default(this, null, 1, null);
        this.mOffsetValue = BleReadable.readInt32$default(this, null, 1, null);
        byte[] r0 = getMBytes();
        Intrinsics.XXI(r0);
        if (r0.length <= 9) goto L6;
        byte[] r1 = getMBytes();
        Intrinsics.XXI(r1);
        this.mFileContent = readBytes(r1.length - 9);
        return;
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleDeviceFile2) == true) goto L8;
        return false;
    L8:
        BleDeviceFile2 r6 = (BleDeviceFile2) r5;
        if (this.mCRC == r6.mCRC) goto L12;
        return false;
    L12:
        if (this.mFileSize == r6.mFileSize) goto L15;
        return false;
    L15:
        if (this.mOffsetValue == r6.mOffsetValue) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.mFileContent, r6.mFileContent) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public final int getMCRC() {
        return this.mCRC;
    }

    @aa1
    public final byte[] getMFileContent() {
        return this.mFileContent;
    }

    public final int getMFileSize() {
        return this.mFileSize;
    }

    public final int getMOffsetValue() {
        return this.mOffsetValue;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.mCRC) * 31) + Integer.hashCode(this.mFileSize)) * 31) + Integer.hashCode(this.mOffsetValue)) * 31) + Arrays.hashCode(this.mFileContent);
    }

    public final void setMCRC(int r1) {
        this.mCRC = r1;
    }

    public final void setMFileContent(@aa1 byte[] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mFileContent = r2;
    }

    public final void setMFileSize(int r1) {
        this.mFileSize = r1;
    }

    public final void setMOffsetValue(int r1) {
        this.mOffsetValue = r1;
    }

    @aa1
    public String toString() {
        return "BleDeviceFile2(mCRC=" + this.mCRC + ", mFileSize=" + this.mFileSize + ", mOffsetValue=" + this.mOffsetValue + ", mFileContent=" + Arrays.toString(this.mFileContent) + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleDeviceFile2(int r2, int r3, int r4, @aa1 byte[] r5) {
        Intrinsics.X0O(r5, "mFileContent");
        this.mCRC = r2;
        this.mFileSize = r3;
        this.mOffsetValue = r4;
        this.mFileContent = r5;
    }

    public /* synthetic */ BleDeviceFile2(int r2, int r3, int r4, byte[] r5, int r6, DefaultConstructorMarker r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = new byte[0];
    L14:
        this(r2, r3, r4, r5);
    }
}
