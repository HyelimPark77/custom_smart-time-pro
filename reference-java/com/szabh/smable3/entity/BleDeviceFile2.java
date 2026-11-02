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
        this(0, 0, 0, null, 15, null);
    }

    public static /* synthetic */ BleDeviceFile2 copy$default(BleDeviceFile2 bleDeviceFile2, int i, int i2, int i3, byte[] bArr, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = bleDeviceFile2.mCRC;
        }
        if ((i4 & 2) != 0) {
            i2 = bleDeviceFile2.mFileSize;
        }
        if ((i4 & 4) != 0) {
            i3 = bleDeviceFile2.mOffsetValue;
        }
        if ((i4 & 8) != 0) {
            bArr = bleDeviceFile2.mFileContent;
        }
        return bleDeviceFile2.copy(i, i2, i3, bArr);
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
    public final BleDeviceFile2 copy(int i, int i2, int i3, @aa1 byte[] mFileContent) {
        Intrinsics.X0O(mFileContent, "mFileContent");
        return new BleDeviceFile2(i, i2, i3, mFileContent);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mCRC = readUInt8();
        this.mFileSize = BleReadable.readInt32$default(this, null, 1, null);
        this.mOffsetValue = BleReadable.readInt32$default(this, null, 1, null);
        byte[] mBytes = getMBytes();
        Intrinsics.XXI(mBytes);
        if (mBytes.length > 9) {
            byte[] mBytes2 = getMBytes();
            Intrinsics.XXI(mBytes2);
            this.mFileContent = readBytes(mBytes2.length - 9);
        }
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleDeviceFile2)) {
            return false;
        }
        BleDeviceFile2 bleDeviceFile2 = (BleDeviceFile2) obj;
        return this.mCRC == bleDeviceFile2.mCRC && this.mFileSize == bleDeviceFile2.mFileSize && this.mOffsetValue == bleDeviceFile2.mOffsetValue && Intrinsics.XOO0ii0(this.mFileContent, bleDeviceFile2.mFileContent);
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

    public final void setMCRC(int i) {
        this.mCRC = i;
    }

    public final void setMFileContent(@aa1 byte[] bArr) {
        Intrinsics.X0O(bArr, "<set-?>");
        this.mFileContent = bArr;
    }

    public final void setMFileSize(int i) {
        this.mFileSize = i;
    }

    public final void setMOffsetValue(int i) {
        this.mOffsetValue = i;
    }

    @aa1
    public String toString() {
        return "BleDeviceFile2(mCRC=" + this.mCRC + ", mFileSize=" + this.mFileSize + ", mOffsetValue=" + this.mOffsetValue + ", mFileContent=" + Arrays.toString(this.mFileContent) + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleDeviceFile2(int i, int i2, int i3, @aa1 byte[] mFileContent) {
        Intrinsics.X0O(mFileContent, "mFileContent");
        this.mCRC = i;
        this.mFileSize = i2;
        this.mOffsetValue = i3;
        this.mFileContent = mFileContent;
    }

    public /* synthetic */ BleDeviceFile2(int i, int i2, int i3, byte[] bArr, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? new byte[0] : bArr);
    }
}
