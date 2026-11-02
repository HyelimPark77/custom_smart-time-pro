package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
final class BleBrandInfoImage extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 16;
    private int hasAlpha;
    private long mAddress;
    private int mCompression;
    private int mHeight;
    private long mId;
    private int mPixelFormat;
    private int mWidth;

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

    public BleBrandInfoImage() {
        long r1 = 0;
        long r3 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        int r9 = 0;
        this(r1, r3, r5, r6, r7, r8, r9, 127, null);
    }

    public static /* synthetic */ BleBrandInfoImage copy$default(BleBrandInfoImage r10, long r11, long r13, int r15, int r16, int r17, int r18, int r19, int r20, Object r21) {
        if ((r20 & 1) == 0) goto L5;
        r11 = r10.mId;
    L5:
        long r1 = r11;
        if ((r20 & 2) == 0) goto L8;
        r13 = r10.mAddress;
    L8:
        long r3 = r13;
        if ((r20 & 4) == 0) goto L11;
        r15 = r10.mWidth;
    L11:
        int r5 = r15;
        if ((r20 & 8) == 0) goto L14;
        int r6 = r10.mHeight;
    L16:
        if ((r20 & 16) == 0) goto L18;
        int r7 = r10.hasAlpha;
    L20:
        if ((r20 & 32) == 0) goto L22;
        int r8 = r10.mCompression;
    L24:
        if ((r20 & 64) == 0) goto L27;
        int r9 = r10.mPixelFormat;
    L29:
        return r10.copy(r1, r3, r5, r6, r7, r8, r9);
    L27:
        r9 = r19;
        goto L29
    L22:
        r8 = r18;
        goto L24
    L18:
        r7 = r17;
        goto L20
    L14:
        r6 = r16;
        goto L16
    }

    public final long component1() {
        return this.mId;
    }

    public final long component2() {
        return this.mAddress;
    }

    public final int component3() {
        return this.mWidth;
    }

    public final int component4() {
        return this.mHeight;
    }

    public final int component5() {
        return this.hasAlpha;
    }

    public final int component6() {
        return this.mCompression;
    }

    public final int component7() {
        return this.mPixelFormat;
    }

    @aa1
    public final BleBrandInfoImage copy(long r11, long r13, int r15, int r16, int r17, int r18, int r19) {
        return new BleBrandInfoImage(r11, r13, r15, r16, r17, r18, r19);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        long r0 = this.mId;
        ByteOrder r2 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r2, "LITTLE_ENDIAN");
        writeUInt32(r0, r2);
        long r1 = this.mAddress;
        Intrinsics.O10IXXX0X(r2, "LITTLE_ENDIAN");
        writeUInt32(r1, r2);
        int r3 = this.mWidth;
        Intrinsics.O10IXXX0X(r2, "LITTLE_ENDIAN");
        writeInt16(r3, r2);
        int r4 = this.mHeight;
        Intrinsics.O10IXXX0X(r2, "LITTLE_ENDIAN");
        writeInt16(r4, r2);
        writeIntN(0, 2);
        writeIntN(this.hasAlpha, 1);
        writeIntN(this.mPixelFormat, 2);
        writeIntN(this.mCompression, 3);
        BleWritable.writeInt24$default(this, 0, null, 2, null);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof BleBrandInfoImage) == true) goto L8;
        return false;
    L8:
        BleBrandInfoImage r9 = (BleBrandInfoImage) r8;
        if (this.mId == r9.mId) goto L12;
        return false;
    L12:
        if (this.mAddress == r9.mAddress) goto L15;
        return false;
    L15:
        if (this.mWidth == r9.mWidth) goto L18;
        return false;
    L18:
        if (this.mHeight == r9.mHeight) goto L21;
        return false;
    L21:
        if (this.hasAlpha == r9.hasAlpha) goto L24;
        return false;
    L24:
        if (this.mCompression == r9.mCompression) goto L27;
        return false;
    L27:
        if (this.mPixelFormat == r9.mPixelFormat) goto L29;
        return false;
    L29:
        return true;
    }

    public final int getHasAlpha() {
        return this.hasAlpha;
    }

    public final long getMAddress() {
        return this.mAddress;
    }

    public final int getMCompression() {
        return this.mCompression;
    }

    public final int getMHeight() {
        return this.mHeight;
    }

    public final long getMId() {
        return this.mId;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 16;
    }

    public final int getMPixelFormat() {
        return this.mPixelFormat;
    }

    public final int getMWidth() {
        return this.mWidth;
    }

    public int hashCode() {
        return (((((((((((Long.hashCode(this.mId) * 31) + Long.hashCode(this.mAddress)) * 31) + Integer.hashCode(this.mWidth)) * 31) + Integer.hashCode(this.mHeight)) * 31) + Integer.hashCode(this.hasAlpha)) * 31) + Integer.hashCode(this.mCompression)) * 31) + Integer.hashCode(this.mPixelFormat);
    }

    public final void setHasAlpha(int r1) {
        this.hasAlpha = r1;
    }

    public final void setMAddress(long r1) {
        this.mAddress = r1;
    }

    public final void setMCompression(int r1) {
        this.mCompression = r1;
    }

    public final void setMHeight(int r1) {
        this.mHeight = r1;
    }

    public final void setMId(long r1) {
        this.mId = r1;
    }

    public final void setMPixelFormat(int r1) {
        this.mPixelFormat = r1;
    }

    public final void setMWidth(int r1) {
        this.mWidth = r1;
    }

    @aa1
    public String toString() {
        return "BleBrandInfoImage(mId=" + this.mId + ", mAddress=" + this.mAddress + ", mWidth=" + this.mWidth + ", mHeight=" + this.mHeight + ", hasAlpha=" + this.hasAlpha + ", mCompression=" + this.mCompression + ", mPixelFormat=" + this.mPixelFormat + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleBrandInfoImage(long r1, long r3, int r5, int r6, int r7, int r8, int r9) {
        this.mId = r1;
        this.mAddress = r3;
        this.mWidth = r5;
        this.mHeight = r6;
        this.hasAlpha = r7;
        this.mCompression = r8;
        this.mPixelFormat = r9;
    }

    public /* synthetic */ BleBrandInfoImage(long r3, long r5, int r7, int r8, int r9, int r10, int r11, int r12, DefaultConstructorMarker r13) {
        if ((r12 & 1) == 0) goto L6;
        r3 = 0;
    L6:
        if ((r12 & 2) == 0) goto L9;
        r5 = 0;
    L9:
        if ((r12 & 4) == 0) goto L12;
        r7 = 0;
    L12:
        if ((r12 & 8) == 0) goto L15;
        r8 = 0;
    L15:
        if ((r12 & 16) == 0) goto L18;
        r9 = 0;
    L18:
        if ((r12 & 32) == 0) goto L21;
        r10 = 0;
    L21:
        if ((r12 & 64) == 0) goto L24;
        int r14 = 0;
    L23:
        int r15 = r10;
        int r16 = r9;
        this(r3, r5, r7, r8, r16, r15, r14);
        return;
    L24:
        r14 = r11;
        goto L23
    }
}
