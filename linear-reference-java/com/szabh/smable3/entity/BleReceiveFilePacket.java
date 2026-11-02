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
    public static final Companion Companion = null;
    public static final int TYPE_IMAGE = 1;
    private int mCRC;

    @aa1
    private byte[] mFileContent;
    private int mFileSize;
    private int mFileType;
    private int mOffsetValue;
    private int mTime;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public BleReceiveFilePacket() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        byte[] r6 = null;
        this(r1, r2, r3, r4, r5, r6, 63, null);
    }

    public static /* synthetic */ BleReceiveFilePacket copy$default(BleReceiveFilePacket r0, int r1, int r2, int r3, int r4, int r5, byte[] r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r0.mFileType;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r0.mTime;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = r0.mFileSize;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r4 = r0.mCRC;
    L15:
        if ((r7 & 16) == 0) goto L18;
        r5 = r0.mOffsetValue;
    L18:
        if ((r7 & 32) == 0) goto L20;
        r6 = r0.mFileContent;
    L20:
        int r9 = r5;
        byte[] r10 = r6;
        int r11 = r3;
        int r12 = r4;
        return r0.copy(r1, r2, r11, r12, r9, r10);
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
    public final BleReceiveFilePacket copy(int r9, int r10, int r11, int r12, int r13, @aa1 byte[] r14) {
        Intrinsics.X0O(r14, "mFileContent");
        return new BleReceiveFilePacket(r9, r10, r11, r12, r13, r14);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mFileType = readInt8();
        BleReadable.readInt24$default(this, null, 1, null);
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mTime = readInt32(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mFileSize = readInt32(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mCRC = readUInt16(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mOffsetValue = readInt32(r0);
        byte[] r1 = getMBytes();
        Intrinsics.XXI(r1);
        if (r1.length <= 18) goto L6;
        byte[] r2 = getMBytes();
        Intrinsics.XXI(r2);
        this.mFileContent = readBytes(r2.length - 18);
        return;
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleReceiveFilePacket) == true) goto L8;
        return false;
    L8:
        BleReceiveFilePacket r6 = (BleReceiveFilePacket) r5;
        if (this.mFileType == r6.mFileType) goto L12;
        return false;
    L12:
        if (this.mTime == r6.mTime) goto L15;
        return false;
    L15:
        if (this.mFileSize == r6.mFileSize) goto L18;
        return false;
    L18:
        if (this.mCRC == r6.mCRC) goto L21;
        return false;
    L21:
        if (this.mOffsetValue == r6.mOffsetValue) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.mFileContent, r6.mFileContent) == true) goto L26;
        return false;
    L26:
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

    public final void setMFileType(int r1) {
        this.mFileType = r1;
    }

    public final void setMOffsetValue(int r1) {
        this.mOffsetValue = r1;
    }

    public final void setMTime(int r1) {
        this.mTime = r1;
    }

    @aa1
    public String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append("BleReceiveFilePacket(mFileType=");
        r0.append(this.mFileType);
        r0.append(", mTime=");
        r0.append(this.mTime);
        r0.append(", mFileSize=");
        r0.append(this.mFileSize);
        r0.append(", mCRC=");
        StringCompanionObject r1 = StringCompanionObject.OXO1;
        String r2 = String.format("0x%02X", Arrays.copyOf(new Object[]{Integer.valueOf(this.mCRC)}, 1));
        Intrinsics.O10IXXX0X(r2, "format(...)");
        r0.append(r2);
        r0.append(", mOffsetValue=");
        r0.append(this.mOffsetValue);
        r0.append(", mFileContent=");
        r0.append(this.mFileContent.length);
        r0.append(HexStringBuilder.COMMENT_END_CHAR);
        return r0.toString();
    }

    public BleReceiveFilePacket(int r2, int r3, int r4, int r5, int r6, @aa1 byte[] r7) {
        Intrinsics.X0O(r7, "mFileContent");
        this.mFileType = r2;
        this.mTime = r3;
        this.mFileSize = r4;
        this.mCRC = r5;
        this.mOffsetValue = r6;
        this.mFileContent = r7;
    }

    public /* synthetic */ BleReceiveFilePacket(int r2, int r3, int r4, int r5, int r6, byte[] r7, int r8, DefaultConstructorMarker r9) {
        if ((r8 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r5 = 0;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r6 = 0;
    L18:
        if ((r8 & 32) == 0) goto L20;
        r7 = new byte[0];
    L20:
        byte[] r10 = r7;
        int r11 = r6;
        int r12 = r5;
        int r13 = r4;
        this(r2, r3, r13, r12, r11, r10);
    }
}
