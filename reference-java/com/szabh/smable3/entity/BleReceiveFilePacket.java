package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class BleReceiveFilePacket extends BleReadable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int TYPE_IMAGE = 1;
    private int mCRC;

    @aa1
    private byte[] mFileContent;
    private int mFileSize;
    private int mFileType;
    private int mOffsetValue;
    private int mTime;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleReceiveFilePacket() {
        this(0, 0, 0, 0, 0, null, 63, null);
    }

    public static /* synthetic */ BleReceiveFilePacket copy$default(BleReceiveFilePacket bleReceiveFilePacket, int i, int i2, int i3, int i4, int i5, byte[] bArr, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = bleReceiveFilePacket.mFileType;
        }
        if ((i6 & 2) != 0) {
            i2 = bleReceiveFilePacket.mTime;
        }
        if ((i6 & 4) != 0) {
            i3 = bleReceiveFilePacket.mFileSize;
        }
        if ((i6 & 8) != 0) {
            i4 = bleReceiveFilePacket.mCRC;
        }
        if ((i6 & 16) != 0) {
            i5 = bleReceiveFilePacket.mOffsetValue;
        }
        if ((i6 & 32) != 0) {
            bArr = bleReceiveFilePacket.mFileContent;
        }
        int i7 = i5;
        byte[] bArr2 = bArr;
        return bleReceiveFilePacket.copy(i, i2, i3, i4, i7, bArr2);
    }

    public final int component1() {
        return this.mFileType;
    }

    public final int component2() {
        return this.mTime;
    }

    public final int component3() {
        return this.mFileSize;
    }

    public final int component4() {
        return this.mCRC;
    }

    public final int component5() {
        return this.mOffsetValue;
    }

    @aa1
    public final byte[] component6() {
        return this.mFileContent;
    }

    @aa1
    public final BleReceiveFilePacket copy(int i, int i2, int i3, int i4, int i5, @aa1 byte[] mFileContent) {
        Intrinsics.X0O(mFileContent, "mFileContent");
        return new BleReceiveFilePacket(i, i2, i3, i4, i5, mFileContent);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mFileType = readInt8();
        BleReadable.readInt24$default(this, null, 1, null);
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mTime = readInt32(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mFileSize = readInt32(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mCRC = readUInt16(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mOffsetValue = readInt32(LITTLE_ENDIAN);
        byte[] mBytes = getMBytes();
        Intrinsics.XXI(mBytes);
        if (mBytes.length > 18) {
            byte[] mBytes2 = getMBytes();
            Intrinsics.XXI(mBytes2);
            this.mFileContent = readBytes(mBytes2.length - 18);
        }
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleReceiveFilePacket)) {
            return false;
        }
        BleReceiveFilePacket bleReceiveFilePacket = (BleReceiveFilePacket) obj;
        return this.mFileType == bleReceiveFilePacket.mFileType && this.mTime == bleReceiveFilePacket.mTime && this.mFileSize == bleReceiveFilePacket.mFileSize && this.mCRC == bleReceiveFilePacket.mCRC && this.mOffsetValue == bleReceiveFilePacket.mOffsetValue && Intrinsics.XOO0ii0(this.mFileContent, bleReceiveFilePacket.mFileContent);
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

    public final int getMFileType() {
        return this.mFileType;
    }

    public final int getMOffsetValue() {
        return this.mOffsetValue;
    }

    public final int getMTime() {
        return this.mTime;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.mFileType) * 31) + Integer.hashCode(this.mTime)) * 31) + Integer.hashCode(this.mFileSize)) * 31) + Integer.hashCode(this.mCRC)) * 31) + Integer.hashCode(this.mOffsetValue)) * 31) + Arrays.hashCode(this.mFileContent);
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

    public final void setMFileType(int i) {
        this.mFileType = i;
    }

    public final void setMOffsetValue(int i) {
        this.mOffsetValue = i;
    }

    public final void setMTime(int i) {
        this.mTime = i;
    }

    @aa1
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BleReceiveFilePacket(mFileType=");
        sb.append(this.mFileType);
        sb.append(", mTime=");
        sb.append(this.mTime);
        sb.append(", mFileSize=");
        sb.append(this.mFileSize);
        sb.append(", mCRC=");
        StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
        String str = String.format("0x%02X", Arrays.copyOf(new Object[]{Integer.valueOf(this.mCRC)}, 1));
        Intrinsics.O10IXXX0X(str, "format(...)");
        sb.append(str);
        sb.append(", mOffsetValue=");
        sb.append(this.mOffsetValue);
        sb.append(", mFileContent=");
        sb.append(this.mFileContent.length);
        sb.append(HexStringBuilder.COMMENT_END_CHAR);
        return sb.toString();
    }

    public BleReceiveFilePacket(int i, int i2, int i3, int i4, int i5, @aa1 byte[] mFileContent) {
        Intrinsics.X0O(mFileContent, "mFileContent");
        this.mFileType = i;
        this.mTime = i2;
        this.mFileSize = i3;
        this.mCRC = i4;
        this.mOffsetValue = i5;
        this.mFileContent = mFileContent;
    }

    public /* synthetic */ BleReceiveFilePacket(int i, int i2, int i3, int i4, int i5, byte[] bArr, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? 0 : i3, (i6 & 8) != 0 ? 0 : i4, (i6 & 16) != 0 ? 0 : i5, (i6 & 32) != 0 ? new byte[0] : bArr);
    }
}
