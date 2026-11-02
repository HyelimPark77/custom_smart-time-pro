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
        this(0L, null, null, 7, null);
    }

    public static /* synthetic */ BleCPGallery copy$default(BleCPGallery bleCPGallery, long j, byte[] bArr, byte[] bArr2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = bleCPGallery.mTime;
        }
        if ((i & 2) != 0) {
            bArr = bleCPGallery.mThumbData;
        }
        if ((i & 4) != 0) {
            bArr2 = bleCPGallery.mImageData;
        }
        return bleCPGallery.copy(j, bArr, bArr2);
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
    public final BleCPGallery copy(long j, @aa1 byte[] mThumbData, @aa1 byte[] mImageData) {
        Intrinsics.X0O(mThumbData, "mThumbData");
        Intrinsics.X0O(mImageData, "mImageData");
        return new BleCPGallery(j, mThumbData, mImageData);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        long j = this.mTime;
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeLong(j, LITTLE_ENDIAN);
        int length = this.mThumbData.length;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt32(length, LITTLE_ENDIAN);
        int length2 = this.mImageData.length;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt32(length2, LITTLE_ENDIAN);
        BleWritable.writeBytes$default(this, this.mThumbData, null, 2, null);
        BleWritable.writeBytes$default(this, this.mImageData, null, 2, null);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleCPGallery)) {
            return false;
        }
        BleCPGallery bleCPGallery = (BleCPGallery) obj;
        return this.mTime == bleCPGallery.mTime && Intrinsics.XOO0ii0(this.mThumbData, bleCPGallery.mThumbData) && Intrinsics.XOO0ii0(this.mImageData, bleCPGallery.mImageData);
    }

    @aa1
    public final byte[] getMImageData() {
        return this.mImageData;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return this.mThumbData.length + 16 + this.mImageData.length;
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

    public final void setMImageData(@aa1 byte[] bArr) {
        Intrinsics.X0O(bArr, "<set-?>");
        this.mImageData = bArr;
    }

    public final void setMThumbData(@aa1 byte[] bArr) {
        Intrinsics.X0O(bArr, "<set-?>");
        this.mThumbData = bArr;
    }

    public final void setMTime(long j) {
        this.mTime = j;
    }

    @aa1
    public String toString() {
        return "BleCPGallery(mTime=" + this.mTime + ", mThumbData=" + this.mThumbData.length + ", mImageData=" + this.mImageData.length + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleCPGallery(long j, @aa1 byte[] mThumbData, @aa1 byte[] mImageData) {
        Intrinsics.X0O(mThumbData, "mThumbData");
        Intrinsics.X0O(mImageData, "mImageData");
        this.mTime = j;
        this.mThumbData = mThumbData;
        this.mImageData = mImageData;
    }

    public /* synthetic */ BleCPGallery(long j, byte[] bArr, byte[] bArr2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? new byte[0] : bArr, (i & 4) != 0 ? new byte[0] : bArr2);
    }
}
