package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleCPGallery extends BleWritable {

    @aa1
    private byte[] mImageData;

    @aa1
    private byte[] mThumbData;
    private long mTime;

    public BleCPGallery() {
        long r1 = 0;
        byte[] r3 = null;
        byte[] r4 = null;
        this(r1, r3, r4, 7, null);
    }

    public static /* synthetic */ BleCPGallery copy$default(BleCPGallery r0, long r1, byte[] r3, byte[] r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.mTime;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = r0.mThumbData;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r4 = r0.mImageData;
    L12:
        return r0.copy(r1, r3, r4);
    }

    public final long component1() {
        return this.mTime;
    }

    @aa1
    public final byte[] component2() {
        return this.mThumbData;
    }

    @aa1
    public final byte[] component3() {
        return this.mImageData;
    }

    @aa1
    public final BleCPGallery copy(long r2, @aa1 byte[] r4, @aa1 byte[] r5) {
        Intrinsics.X0O(r4, "mThumbData");
        Intrinsics.X0O(r5, "mImageData");
        return new BleCPGallery(r2, r4, r5);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        long r0 = this.mTime;
        ByteOrder r2 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r2, "LITTLE_ENDIAN");
        writeLong(r0, r2);
        int r1 = this.mThumbData.length;
        Intrinsics.O10IXXX0X(r2, "LITTLE_ENDIAN");
        writeInt32(r1, r2);
        int r3 = this.mImageData.length;
        Intrinsics.O10IXXX0X(r2, "LITTLE_ENDIAN");
        writeInt32(r3, r2);
        BleWritable.writeBytes$default(this, this.mThumbData, null, 2, null);
        BleWritable.writeBytes$default(this, this.mImageData, null, 2, null);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof BleCPGallery) == true) goto L8;
        return false;
    L8:
        BleCPGallery r9 = (BleCPGallery) r8;
        if (this.mTime == r9.mTime) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.mThumbData, r9.mThumbData) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.mImageData, r9.mImageData) == true) goto L17;
        return false;
    L17:
        return true;
    }

    @aa1
    public final byte[] getMImageData() {
        return this.mImageData;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return (this.mThumbData.length + 16) + this.mImageData.length;
    }

    @aa1
    public final byte[] getMThumbData() {
        return this.mThumbData;
    }

    public final long getMTime() {
        return this.mTime;
    }

    public int hashCode() {
        return (((Long.hashCode(this.mTime) * 31) + Arrays.hashCode(this.mThumbData)) * 31) + Arrays.hashCode(this.mImageData);
    }

    public final void setMImageData(@aa1 byte[] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mImageData = r2;
    }

    public final void setMThumbData(@aa1 byte[] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mThumbData = r2;
    }

    public final void setMTime(long r1) {
        this.mTime = r1;
    }

    @aa1
    public String toString() {
        return "BleCPGallery(mTime=" + this.mTime + ", mThumbData=" + this.mThumbData.length + ", mImageData=" + this.mImageData.length + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleCPGallery(long r2, @aa1 byte[] r4, @aa1 byte[] r5) {
        Intrinsics.X0O(r4, "mThumbData");
        Intrinsics.X0O(r5, "mImageData");
        this.mTime = r2;
        this.mThumbData = r4;
        this.mImageData = r5;
    }

    public /* synthetic */ BleCPGallery(long r2, byte[] r4, byte[] r5, int r6, DefaultConstructorMarker r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r4 = new byte[0];
    L9:
        if ((r6 & 4) == 0) goto L11;
        r5 = new byte[0];
    L11:
        this(r2, r4, r5);
    }
}
