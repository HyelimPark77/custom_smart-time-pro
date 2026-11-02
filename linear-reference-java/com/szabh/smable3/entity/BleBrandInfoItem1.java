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
    public static final Companion Companion = null;
    public static final int ITEM_HEADER_LENGTH = 32;
    private int mAnchor;
    private int mCount;

    @aa1
    private byte[][] mImageBuffers;

    @aa1
    private BleBrandInfoImage[] mImageInfos;
    private int mPlayInterval;
    private int mX;
    private int mY;

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

    public BleBrandInfoItem1() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        BleBrandInfoImage[] r6 = null;
        byte[][] r7 = null;
        this(r1, r2, r3, r4, r5, r6, r7, 127, null);
    }

    public static /* synthetic */ BleBrandInfoItem1 copy$default(BleBrandInfoItem1 r0, int r1, int r2, int r3, int r4, int r5, BleBrandInfoImage[] r6, byte[][] r7, int r8, Object r9) {
        if ((r8 & 1) == 0) goto L6;
        r1 = r0.mX;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r2 = r0.mY;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r3 = r0.mAnchor;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r4 = r0.mCount;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r5 = r0.mPlayInterval;
    L18:
        if ((r8 & 32) == 0) goto L21;
        r6 = r0.mImageInfos;
    L21:
        if ((r8 & 64) == 0) goto L23;
        r7 = r0.mImageBuffers;
    L23:
        BleBrandInfoImage[] r10 = r6;
        byte[][] r11 = r7;
        int r12 = r4;
        int r13 = r5;
        int r14 = r3;
        int r15 = r1;
        return r0.copy(r15, r2, r14, r12, r13, r10, r11);
    }

    private final int getImageBufferSize() {
        byte[][] r0 = this.mImageBuffers;
        int r1 = r0.length;
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r2 >= r1) goto L5;
        r3 = r3 + r0[r2].length;
        r2 = r2 + 1;
        goto L3
    L5:
        return r3;
    }

    public final int component1() {
        return this.mX;
    }

    public final int component2() {
        return this.mY;
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
    public final BleBrandInfoItem1 copy(int r10, int r11, int r12, int r13, int r14, @aa1 BleBrandInfoImage[] r15, @aa1 byte[][] r16) {
        Intrinsics.X0O(r15, "mImageInfos");
        Intrinsics.X0O(r16, "mImageBuffers");
        return new BleBrandInfoItem1(r10, r11, r12, r13, r14, r15, r16);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        int r0 = this.mX;
        ByteOrder r1 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt32(r0, r1);
        int r2 = this.mY;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt32(r2, r1);
        writeInt8(this.mAnchor);
        writeInt8(this.mCount);
        int r3 = this.mPlayInterval;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt16(r3, r1);
        BleWritable.writeBytes$default(this, new byte[20], null, 2, null);
        BleBrandInfoImage[] r4 = this.mImageInfos;
        int r5 = r4.length;
        int r6 = 0;
        int r7 = 0;
    L3:
        if (r7 >= r5) goto L5;
        writeObject(r4[r7]);
        r7 = r7 + 1;
        goto L3
    L5:
        byte[][] r8 = this.mImageBuffers;
        int r9 = r8.length;
    L6:
        if (r6 >= r9) goto L8;
        BleWritable.writeBytes$default(this, r8[r6], null, 2, null);
        r6 = r6 + 1;
        goto L6
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleBrandInfoItem1) == true) goto L8;
        return false;
    L8:
        BleBrandInfoItem1 r6 = (BleBrandInfoItem1) r5;
        if (this.mX == r6.mX) goto L12;
        return false;
    L12:
        if (this.mY == r6.mY) goto L15;
        return false;
    L15:
        if (this.mAnchor == r6.mAnchor) goto L18;
        return false;
    L18:
        if (this.mCount == r6.mCount) goto L21;
        return false;
    L21:
        if (this.mPlayInterval == r6.mPlayInterval) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.mImageInfos, r6.mImageInfos) == true) goto L27;
        return false;
    L27:
        if (Intrinsics.XOO0ii0(this.mImageBuffers, r6.mImageBuffers) == true) goto L29;
        return false;
    L29:
        return true;
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
        return ((this.mImageInfos.length * 16) + 32) + getImageBufferSize();
    }

    public final int getMPlayInterval() {
        return this.mPlayInterval;
    }

    public final int getMX() {
        return this.mX;
    }

    public final int getMY() {
        return this.mY;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.mX) * 31) + Integer.hashCode(this.mY)) * 31) + Integer.hashCode(this.mAnchor)) * 31) + Integer.hashCode(this.mCount)) * 31) + Integer.hashCode(this.mPlayInterval)) * 31) + Arrays.hashCode(this.mImageInfos)) * 31) + Arrays.hashCode(this.mImageBuffers);
    }

    public final void setMAnchor(int r1) {
        this.mAnchor = r1;
    }

    public final void setMCount(int r1) {
        this.mCount = r1;
    }

    public final void setMImageBuffers(@aa1 byte[][] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mImageBuffers = r2;
    }

    public final void setMImageInfos(@aa1 BleBrandInfoImage[] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mImageInfos = r2;
    }

    public final void setMPlayInterval(int r1) {
        this.mPlayInterval = r1;
    }

    public final void setMX(int r1) {
        this.mX = r1;
    }

    public final void setMY(int r1) {
        this.mY = r1;
    }

    @aa1
    public String toString() {
        return "BleBrandInfoItem1(mX=" + this.mX + ", mY=" + this.mY + ", mAnchor=" + this.mAnchor + ", mCount=" + this.mCount + ", mPlayInterval=" + this.mPlayInterval + ", mImageInfos=" + Arrays.toString(this.mImageInfos) + ", mImageBuffers=" + Arrays.toString(this.mImageBuffers) + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleBrandInfoItem1(int r2, int r3, int r4, int r5, int r6, @aa1 BleBrandInfoImage[] r7, @aa1 byte[][] r8) {
        Intrinsics.X0O(r7, "mImageInfos");
        Intrinsics.X0O(r8, "mImageBuffers");
        this.mX = r2;
        this.mY = r3;
        this.mAnchor = r4;
        this.mCount = r5;
        this.mPlayInterval = r6;
        this.mImageInfos = r7;
        this.mImageBuffers = r8;
    }

    public /* synthetic */ BleBrandInfoItem1(int r2, int r3, int r4, int r5, int r6, BleBrandInfoImage[] r7, byte[][] r8, int r9, DefaultConstructorMarker r10) {
        if ((r9 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r5 = 0;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r6 = 0;
    L18:
        if ((r9 & 32) == 0) goto L21;
        r7 = new BleBrandInfoImage[0];
    L21:
        if ((r9 & 64) == 0) goto L23;
        r8 = new byte[0][];
    L23:
        byte[][] r11 = r8;
        BleBrandInfoImage[] r12 = r7;
        int r13 = r6;
        int r14 = r5;
        int r15 = r4;
        this(r2, r3, r15, r14, r13, r12, r11);
    }
}
