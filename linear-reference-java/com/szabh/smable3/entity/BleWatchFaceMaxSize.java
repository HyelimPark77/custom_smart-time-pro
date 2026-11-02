package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleWatchFaceMaxSize extends BleReadable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 20;
    private int mCurrentSize;
    private int mFreeSize;
    private int mMaxSize;
    private int mOneWatchSize;
    private int mTotalSize;

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

    public BleWatchFaceMaxSize() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        this(r1, r2, r3, r4, r5, 31, null);
    }

    public static /* synthetic */ BleWatchFaceMaxSize copy$default(BleWatchFaceMaxSize r0, int r1, int r2, int r3, int r4, int r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r0.mCurrentSize;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r0.mMaxSize;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = r0.mOneWatchSize;
    L12:
        if ((r6 & 8) == 0) goto L15;
        r4 = r0.mFreeSize;
    L15:
        if ((r6 & 16) == 0) goto L17;
        r5 = r0.mTotalSize;
    L17:
        int r8 = r4;
        int r9 = r5;
        int r10 = r3;
        int r11 = r1;
        return r0.copy(r11, r2, r10, r8, r9);
    }

    public final int component1() {
        return this.mCurrentSize;
    }

    public final int component2() {
        return this.mMaxSize;
    }

    public final int component3() {
        return this.mOneWatchSize;
    }

    public final int component4() {
        return this.mFreeSize;
    }

    public final int component5() {
        return this.mTotalSize;
    }

    @aa1
    public final BleWatchFaceMaxSize copy(int r7, int r8, int r9, int r10, int r11) {
        return new BleWatchFaceMaxSize(r7, r8, r9, r10, r11);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mCurrentSize = readInt32(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mMaxSize = readInt32(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mOneWatchSize = readInt32(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mFreeSize = readInt32(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mTotalSize = readInt32(r0);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleWatchFaceMaxSize) == true) goto L8;
        return false;
    L8:
        BleWatchFaceMaxSize r6 = (BleWatchFaceMaxSize) r5;
        if (this.mCurrentSize == r6.mCurrentSize) goto L12;
        return false;
    L12:
        if (this.mMaxSize == r6.mMaxSize) goto L15;
        return false;
    L15:
        if (this.mOneWatchSize == r6.mOneWatchSize) goto L18;
        return false;
    L18:
        if (this.mFreeSize == r6.mFreeSize) goto L21;
        return false;
    L21:
        if (this.mTotalSize == r6.mTotalSize) goto L23;
        return false;
    L23:
        return true;
    }

    public final int getMCurrentSize() {
        return this.mCurrentSize;
    }

    public final int getMFreeSize() {
        return this.mFreeSize;
    }

    public final int getMMaxSize() {
        return this.mMaxSize;
    }

    public final int getMOneWatchSize() {
        return this.mOneWatchSize;
    }

    public final int getMTotalSize() {
        return this.mTotalSize;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.mCurrentSize) * 31) + Integer.hashCode(this.mMaxSize)) * 31) + Integer.hashCode(this.mOneWatchSize)) * 31) + Integer.hashCode(this.mFreeSize)) * 31) + Integer.hashCode(this.mTotalSize);
    }

    public final void setMCurrentSize(int r1) {
        this.mCurrentSize = r1;
    }

    public final void setMFreeSize(int r1) {
        this.mFreeSize = r1;
    }

    public final void setMMaxSize(int r1) {
        this.mMaxSize = r1;
    }

    public final void setMOneWatchSize(int r1) {
        this.mOneWatchSize = r1;
    }

    public final void setMTotalSize(int r1) {
        this.mTotalSize = r1;
    }

    @aa1
    public String toString() {
        return "BleWatchFaceMaxSize(mCurrentSize=" + this.mCurrentSize + ", mMaxSize=" + this.mMaxSize + ", mOneWatchSize=" + this.mOneWatchSize + ", mFreeSize=" + this.mFreeSize + ", mTotalSize=" + this.mTotalSize + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleWatchFaceMaxSize(int r1, int r2, int r3, int r4, int r5) {
        this.mCurrentSize = r1;
        this.mMaxSize = r2;
        this.mOneWatchSize = r3;
        this.mFreeSize = r4;
        this.mTotalSize = r5;
    }

    public /* synthetic */ BleWatchFaceMaxSize(int r2, int r3, int r4, int r5, int r6, int r7, DefaultConstructorMarker r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = 0;
    L15:
        if ((r7 & 16) == 0) goto L18;
        int r9 = 0;
    L17:
        int r10 = r5;
        int r11 = r4;
        this(r2, r3, r11, r10, r9);
        return;
    L18:
        r9 = r6;
        goto L17
    }
}
