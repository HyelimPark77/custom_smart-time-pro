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
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 20;
    private int mCurrentSize;
    private int mFreeSize;
    private int mMaxSize;
    private int mOneWatchSize;
    private int mTotalSize;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleWatchFaceMaxSize() {
        this(0, 0, 0, 0, 0, 31, null);
    }

    public static /* synthetic */ BleWatchFaceMaxSize copy$default(BleWatchFaceMaxSize bleWatchFaceMaxSize, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = bleWatchFaceMaxSize.mCurrentSize;
        }
        if ((i6 & 2) != 0) {
            i2 = bleWatchFaceMaxSize.mMaxSize;
        }
        if ((i6 & 4) != 0) {
            i3 = bleWatchFaceMaxSize.mOneWatchSize;
        }
        if ((i6 & 8) != 0) {
            i4 = bleWatchFaceMaxSize.mFreeSize;
        }
        if ((i6 & 16) != 0) {
            i5 = bleWatchFaceMaxSize.mTotalSize;
        }
        int i7 = i5;
        int i8 = i3;
        return bleWatchFaceMaxSize.copy(i, i2, i8, i4, i7);
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
    public final BleWatchFaceMaxSize copy(int i, int i2, int i3, int i4, int i5) {
        return new BleWatchFaceMaxSize(i, i2, i3, i4, i5);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mCurrentSize = readInt32(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mMaxSize = readInt32(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mOneWatchSize = readInt32(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mFreeSize = readInt32(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mTotalSize = readInt32(LITTLE_ENDIAN);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleWatchFaceMaxSize)) {
            return false;
        }
        BleWatchFaceMaxSize bleWatchFaceMaxSize = (BleWatchFaceMaxSize) obj;
        return this.mCurrentSize == bleWatchFaceMaxSize.mCurrentSize && this.mMaxSize == bleWatchFaceMaxSize.mMaxSize && this.mOneWatchSize == bleWatchFaceMaxSize.mOneWatchSize && this.mFreeSize == bleWatchFaceMaxSize.mFreeSize && this.mTotalSize == bleWatchFaceMaxSize.mTotalSize;
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

    public final void setMCurrentSize(int i) {
        this.mCurrentSize = i;
    }

    public final void setMFreeSize(int i) {
        this.mFreeSize = i;
    }

    public final void setMMaxSize(int i) {
        this.mMaxSize = i;
    }

    public final void setMOneWatchSize(int i) {
        this.mOneWatchSize = i;
    }

    public final void setMTotalSize(int i) {
        this.mTotalSize = i;
    }

    @aa1
    public String toString() {
        return "BleWatchFaceMaxSize(mCurrentSize=" + this.mCurrentSize + ", mMaxSize=" + this.mMaxSize + ", mOneWatchSize=" + this.mOneWatchSize + ", mFreeSize=" + this.mFreeSize + ", mTotalSize=" + this.mTotalSize + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleWatchFaceMaxSize(int i, int i2, int i3, int i4, int i5) {
        this.mCurrentSize = i;
        this.mMaxSize = i2;
        this.mOneWatchSize = i3;
        this.mFreeSize = i4;
        this.mTotalSize = i5;
    }

    public /* synthetic */ BleWatchFaceMaxSize(int i, int i2, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? 0 : i3, (i6 & 8) != 0 ? 0 : i4, (i6 & 16) != 0 ? 0 : i5);
    }
}
