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
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 32;
    private int mCRC;
    private long mFileSize;

    @aa1
    private String mFileTypeFlag;
    private int mItemCount;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleBrandInfoHeader() {
        this(null, 0, 0L, 0, 15, null);
    }

    public static /* synthetic */ BleBrandInfoHeader copy$default(BleBrandInfoHeader bleBrandInfoHeader, String str, int i, long j, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = bleBrandInfoHeader.mFileTypeFlag;
        }
        if ((i3 & 2) != 0) {
            i = bleBrandInfoHeader.mItemCount;
        }
        if ((i3 & 4) != 0) {
            j = bleBrandInfoHeader.mFileSize;
        }
        if ((i3 & 8) != 0) {
            i2 = bleBrandInfoHeader.mCRC;
        }
        int i4 = i2;
        return bleBrandInfoHeader.copy(str, i, j, i4);
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
    public final BleBrandInfoHeader copy(@aa1 String mFileTypeFlag, int i, long j, int i2) {
        Intrinsics.X0O(mFileTypeFlag, "mFileTypeFlag");
        return new BleBrandInfoHeader(mFileTypeFlag, i, j, i2);
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

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleBrandInfoHeader)) {
            return false;
        }
        BleBrandInfoHeader bleBrandInfoHeader = (BleBrandInfoHeader) obj;
        return Intrinsics.XOO0ii0(this.mFileTypeFlag, bleBrandInfoHeader.mFileTypeFlag) && this.mItemCount == bleBrandInfoHeader.mItemCount && this.mFileSize == bleBrandInfoHeader.mFileSize && this.mCRC == bleBrandInfoHeader.mCRC;
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

    public final void setMCRC(int i) {
        this.mCRC = i;
    }

    public final void setMFileSize(long j) {
        this.mFileSize = j;
    }

    public final void setMFileTypeFlag(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mFileTypeFlag = str;
    }

    public final void setMItemCount(int i) {
        this.mItemCount = i;
    }

    @aa1
    public String toString() {
        return "BleBrandInfoHeader(mFileTypeFlag=" + this.mFileTypeFlag + ", mItemCount=" + this.mItemCount + ", mFileSize=" + this.mFileSize + ", mCRC=" + this.mCRC + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleBrandInfoHeader(@aa1 String mFileTypeFlag, int i, long j, int i2) {
        Intrinsics.X0O(mFileTypeFlag, "mFileTypeFlag");
        this.mFileTypeFlag = mFileTypeFlag;
        this.mItemCount = i;
        this.mFileSize = j;
        this.mCRC = i2;
    }

    public /* synthetic */ BleBrandInfoHeader(String str, int i, long j, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "BR" : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0L : j, (i3 & 8) != 0 ? 0 : i2);
    }
}
