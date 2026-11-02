package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleSDCardInfo extends BleReadable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 12;
    private int mClustSize;
    private int mFreeSize;
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

    public BleSDCardInfo() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        this(r1, r2, r3, 7, null);
    }

    public static /* synthetic */ BleSDCardInfo copy$default(BleSDCardInfo r0, int r1, int r2, int r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.mTotalSize;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.mFreeSize;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.mClustSize;
    L12:
        return r0.copy(r1, r2, r3);
    }

    public final int component1() {
        return this.mTotalSize;
    }

    public final int component2() {
        return this.mFreeSize;
    }

    public final int component3() {
        return this.mClustSize;
    }

    @aa1
    public final BleSDCardInfo copy(int r2, int r3, int r4) {
        return new BleSDCardInfo(r2, r3, r4);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mTotalSize = (int) BleReadable.readUInt32$default(this, null, 1, null);
        this.mFreeSize = (int) BleReadable.readUInt32$default(this, null, 1, null);
        this.mClustSize = readUInt8();
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleSDCardInfo) == true) goto L8;
        return false;
    L8:
        BleSDCardInfo r6 = (BleSDCardInfo) r5;
        if (this.mTotalSize == r6.mTotalSize) goto L12;
        return false;
    L12:
        if (this.mFreeSize == r6.mFreeSize) goto L15;
        return false;
    L15:
        if (this.mClustSize == r6.mClustSize) goto L17;
        return false;
    L17:
        return true;
    }

    public final int getMClustSize() {
        return this.mClustSize;
    }

    public final int getMFreeSize() {
        return this.mFreeSize;
    }

    public final int getMTotalSize() {
        return this.mTotalSize;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.mTotalSize) * 31) + Integer.hashCode(this.mFreeSize)) * 31) + Integer.hashCode(this.mClustSize);
    }

    public final void setMClustSize(int r1) {
        this.mClustSize = r1;
    }

    public final void setMFreeSize(int r1) {
        this.mFreeSize = r1;
    }

    public final void setMTotalSize(int r1) {
        this.mTotalSize = r1;
    }

    @aa1
    public String toString() {
        return "BleSDCardInfo(mTotalSize=" + this.mTotalSize + ", mFreeSize=" + this.mFreeSize + ", mClustSize=" + this.mClustSize + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleSDCardInfo(int r1, int r2, int r3) {
        this.mTotalSize = r1;
        this.mFreeSize = r2;
        this.mClustSize = r3;
    }

    public /* synthetic */ BleSDCardInfo(int r2, int r3, int r4, int r5, DefaultConstructorMarker r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = 0;
    L11:
        this(r2, r3, r4);
    }
}
