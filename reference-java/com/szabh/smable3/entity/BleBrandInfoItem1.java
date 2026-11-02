package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBleBrandInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleBrandInfo.kt\ncom/szabh/smable3/entity/BleBrandInfoItem1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,251:1\n13805#2,2:252\n13805#2,2:254\n13805#2,2:256\n*S KotlinDebug\n*F\n+ 1 BleBrandInfo.kt\ncom/szabh/smable3/entity/BleBrandInfoItem1\n*L\n77#1:252,2\n91#1:254,2\n94#1:256,2\n*E\n"})
final class BleBrandInfoItem1 extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_HEADER_LENGTH = 32;
    private int mAnchor;
    private int mCount;

    @aa1
    private byte[][] mImageBuffers;

    @aa1
    private BleBrandInfoImage[] mImageInfos;
    private int mPlayInterval;

    /* JADX INFO: renamed from: mX */
    private int f55324mX;

    /* JADX INFO: renamed from: mY */
    private int f55325mY;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleBrandInfoItem1() {
        this(0, 0, 0, 0, 0, null, null, 127, null);
    }

    public static /* synthetic */ BleBrandInfoItem1 copy$default(BleBrandInfoItem1 bleBrandInfoItem1, int i, int i2, int i3, int i4, int i5, BleBrandInfoImage[] bleBrandInfoImageArr, byte[][] bArr, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = bleBrandInfoItem1.f55324mX;
        }
        if ((i6 & 2) != 0) {
            i2 = bleBrandInfoItem1.f55325mY;
        }
        if ((i6 & 4) != 0) {
            i3 = bleBrandInfoItem1.mAnchor;
        }
        if ((i6 & 8) != 0) {
            i4 = bleBrandInfoItem1.mCount;
        }
        if ((i6 & 16) != 0) {
            i5 = bleBrandInfoItem1.mPlayInterval;
        }
        if ((i6 & 32) != 0) {
            bleBrandInfoImageArr = bleBrandInfoItem1.mImageInfos;
        }
        if ((i6 & 64) != 0) {
            bArr = bleBrandInfoItem1.mImageBuffers;
        }
        BleBrandInfoImage[] bleBrandInfoImageArr2 = bleBrandInfoImageArr;
        byte[][] bArr2 = bArr;
        int i7 = i5;
        int i8 = i3;
        return bleBrandInfoItem1.copy(i, i2, i8, i4, i7, bleBrandInfoImageArr2, bArr2);
    }

    private final int getImageBufferSize() {
        int length = 0;
        for (byte[] bArr : this.mImageBuffers) {
            length += bArr.length;
        }
        return length;
    }

    public final int component1() {
        return this.f55324mX;
    }

    public final int component2() {
        return this.f55325mY;
    }

    public final int component3() {
        return this.mAnchor;
    }

    public final int component4() {
        return this.mCount;
    }

    public final int component5() {
        return this.mPlayInterval;
    }

    @aa1
    public final BleBrandInfoImage[] component6() {
        return this.mImageInfos;
    }

    @aa1
    public final byte[][] component7() {
        return this.mImageBuffers;
    }

    @aa1
    public final BleBrandInfoItem1 copy(int i, int i2, int i3, int i4, int i5, @aa1 BleBrandInfoImage[] mImageInfos, @aa1 byte[][] mImageBuffers) {
        Intrinsics.X0O(mImageInfos, "mImageInfos");
        Intrinsics.X0O(mImageBuffers, "mImageBuffers");
        return new BleBrandInfoItem1(i, i2, i3, i4, i5, mImageInfos, mImageBuffers);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        int i = this.f55324mX;
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt32(i, LITTLE_ENDIAN);
        int i2 = this.f55325mY;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt32(i2, LITTLE_ENDIAN);
        writeInt8(this.mAnchor);
        writeInt8(this.mCount);
        int i3 = this.mPlayInterval;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt16(i3, LITTLE_ENDIAN);
        BleWritable.writeBytes$default(this, new byte[20], null, 2, null);
        for (BleBrandInfoImage bleBrandInfoImage : this.mImageInfos) {
            writeObject(bleBrandInfoImage);
        }
        for (byte[] bArr : this.mImageBuffers) {
            BleWritable.writeBytes$default(this, bArr, null, 2, null);
        }
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleBrandInfoItem1)) {
            return false;
        }
        BleBrandInfoItem1 bleBrandInfoItem1 = (BleBrandInfoItem1) obj;
        return this.f55324mX == bleBrandInfoItem1.f55324mX && this.f55325mY == bleBrandInfoItem1.f55325mY && this.mAnchor == bleBrandInfoItem1.mAnchor && this.mCount == bleBrandInfoItem1.mCount && this.mPlayInterval == bleBrandInfoItem1.mPlayInterval && Intrinsics.XOO0ii0(this.mImageInfos, bleBrandInfoItem1.mImageInfos) && Intrinsics.XOO0ii0(this.mImageBuffers, bleBrandInfoItem1.mImageBuffers);
    }

    public final int getMAnchor() {
        return this.mAnchor;
    }

    public final int getMCount() {
        return this.mCount;
    }

    @aa1
    public final byte[][] getMImageBuffers() {
        return this.mImageBuffers;
    }

    @aa1
    public final BleBrandInfoImage[] getMImageInfos() {
        return this.mImageInfos;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return (this.mImageInfos.length * 16) + 32 + getImageBufferSize();
    }

    public final int getMPlayInterval() {
        return this.mPlayInterval;
    }

    public final int getMX() {
        return this.f55324mX;
    }

    public final int getMY() {
        return this.f55325mY;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.f55324mX) * 31) + Integer.hashCode(this.f55325mY)) * 31) + Integer.hashCode(this.mAnchor)) * 31) + Integer.hashCode(this.mCount)) * 31) + Integer.hashCode(this.mPlayInterval)) * 31) + Arrays.hashCode(this.mImageInfos)) * 31) + Arrays.hashCode(this.mImageBuffers);
    }

    public final void setMAnchor(int i) {
        this.mAnchor = i;
    }

    public final void setMCount(int i) {
        this.mCount = i;
    }

    public final void setMImageBuffers(@aa1 byte[][] bArr) {
        Intrinsics.X0O(bArr, "<set-?>");
        this.mImageBuffers = bArr;
    }

    public final void setMImageInfos(@aa1 BleBrandInfoImage[] bleBrandInfoImageArr) {
        Intrinsics.X0O(bleBrandInfoImageArr, "<set-?>");
        this.mImageInfos = bleBrandInfoImageArr;
    }

    public final void setMPlayInterval(int i) {
        this.mPlayInterval = i;
    }

    public final void setMX(int i) {
        this.f55324mX = i;
    }

    public final void setMY(int i) {
        this.f55325mY = i;
    }

    @aa1
    public String toString() {
        return "BleBrandInfoItem1(mX=" + this.f55324mX + ", mY=" + this.f55325mY + ", mAnchor=" + this.mAnchor + ", mCount=" + this.mCount + ", mPlayInterval=" + this.mPlayInterval + ", mImageInfos=" + Arrays.toString(this.mImageInfos) + ", mImageBuffers=" + Arrays.toString(this.mImageBuffers) + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleBrandInfoItem1(int i, int i2, int i3, int i4, int i5, @aa1 BleBrandInfoImage[] mImageInfos, @aa1 byte[][] mImageBuffers) {
        Intrinsics.X0O(mImageInfos, "mImageInfos");
        Intrinsics.X0O(mImageBuffers, "mImageBuffers");
        this.f55324mX = i;
        this.f55325mY = i2;
        this.mAnchor = i3;
        this.mCount = i4;
        this.mPlayInterval = i5;
        this.mImageInfos = mImageInfos;
        this.mImageBuffers = mImageBuffers;
    }

    public /* synthetic */ BleBrandInfoItem1(int i, int i2, int i3, int i4, int i5, BleBrandInfoImage[] bleBrandInfoImageArr, byte[][] bArr, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? 0 : i3, (i6 & 8) != 0 ? 0 : i4, (i6 & 16) != 0 ? 0 : i5, (i6 & 32) != 0 ? new BleBrandInfoImage[0] : bleBrandInfoImageArr, (i6 & 64) != 0 ? new byte[0][] : bArr);
    }
}
