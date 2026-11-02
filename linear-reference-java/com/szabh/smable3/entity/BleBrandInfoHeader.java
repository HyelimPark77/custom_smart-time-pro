package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
final class BleBrandInfoHeader extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 32;
    private int mCRC;
    private long mFileSize;

    @aa1
    private String mFileTypeFlag;
    private int mItemCount;

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

    public BleBrandInfoHeader() {
        String r1 = null;
        int r2 = 0;
        long r3 = 0;
        int r5 = 0;
        this(r1, r2, r3, r5, 15, null);
    }

    public static /* synthetic */ BleBrandInfoHeader copy$default(BleBrandInfoHeader r0, String r1, int r2, long r3, int r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r0.mFileTypeFlag;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r0.mItemCount;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = r0.mFileSize;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = r0.mCRC;
    L14:
        int r8 = r5;
        long r9 = r3;
        return r0.copy(r1, r2, r9, r8);
    }

    @aa1
    public final String component1() {
        return this.mFileTypeFlag;
    }

    public final int component2() {
        return this.mItemCount;
    }

    public final long component3() {
        return this.mFileSize;
    }

    public final int component4() {
        return this.mCRC;
    }

    @aa1
    public final BleBrandInfoHeader copy(@aa1 String r8, int r9, long r10, int r12) {
        Intrinsics.X0O(r8, "mFileTypeFlag");
        return new BleBrandInfoHeader(r8, r9, r10, r12);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeStringWithFix(this.mFileTypeFlag, 2, Charsets.IiI10X);
        writeInt8(this.mItemCount);
        writeInt8(0);
        BleWritable.writeUInt32$default(this, this.mFileSize, null, 2, null);
        BleWritable.writeInt16$default(this, this.mCRC, null, 2, null);
        BleWritable.writeBytes$default(this, new byte[22], null, 2, null);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof BleBrandInfoHeader) == true) goto L8;
        return false;
    L8:
        BleBrandInfoHeader r9 = (BleBrandInfoHeader) r8;
        if (Intrinsics.XOO0ii0(this.mFileTypeFlag, r9.mFileTypeFlag) == true) goto L12;
        return false;
    L12:
        if (this.mItemCount == r9.mItemCount) goto L15;
        return false;
    L15:
        if (this.mFileSize == r9.mFileSize) goto L18;
        return false;
    L18:
        if (this.mCRC == r9.mCRC) goto L20;
        return false;
    L20:
        return true;
    }

    public final int getMCRC() {
        return this.mCRC;
    }

    public final long getMFileSize() {
        return this.mFileSize;
    }

    @aa1
    public final String getMFileTypeFlag() {
        return this.mFileTypeFlag;
    }

    public final int getMItemCount() {
        return this.mItemCount;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 32;
    }

    public int hashCode() {
        return (((((this.mFileTypeFlag.hashCode() * 31) + Integer.hashCode(this.mItemCount)) * 31) + Long.hashCode(this.mFileSize)) * 31) + Integer.hashCode(this.mCRC);
    }

    public final void setMCRC(int r1) {
        this.mCRC = r1;
    }

    public final void setMFileSize(long r1) {
        this.mFileSize = r1;
    }

    public final void setMFileTypeFlag(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mFileTypeFlag = r2;
    }

    public final void setMItemCount(int r1) {
        this.mItemCount = r1;
    }

    @aa1
    public String toString() {
        return "BleBrandInfoHeader(mFileTypeFlag=" + this.mFileTypeFlag + ", mItemCount=" + this.mItemCount + ", mFileSize=" + this.mFileSize + ", mCRC=" + this.mCRC + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleBrandInfoHeader(@aa1 String r2, int r3, long r4, int r6) {
        Intrinsics.X0O(r2, "mFileTypeFlag");
        this.mFileTypeFlag = r2;
        this.mItemCount = r3;
        this.mFileSize = r4;
        this.mCRC = r6;
    }

    public /* synthetic */ BleBrandInfoHeader(String r2, int r3, long r4, int r6, int r7, DefaultConstructorMarker r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = "BR";
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r7 & 8) == 0) goto L15;
        int r9 = 0;
    L16:
        this(r2, r3, r4, r9);
        return;
    L15:
        r9 = r6;
        goto L16
    }
}
