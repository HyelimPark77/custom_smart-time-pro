package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleIPCStoresInfo extends BleReadable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 14;
    private int mAudioSize;
    private int mFreeSize;
    private int mPhotoSize;
    private int mTotalSize;
    private int mVideoSize;

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

    public BleIPCStoresInfo() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        this(r1, r2, r3, r4, r5, 31, null);
    }

    public static /* synthetic */ BleIPCStoresInfo copy$default(BleIPCStoresInfo r0, int r1, int r2, int r3, int r4, int r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r0.mPhotoSize;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r0.mVideoSize;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = r0.mTotalSize;
    L12:
        if ((r6 & 8) == 0) goto L15;
        r4 = r0.mFreeSize;
    L15:
        if ((r6 & 16) == 0) goto L17;
        r5 = r0.mAudioSize;
    L17:
        int r8 = r4;
        int r9 = r5;
        int r10 = r3;
        int r11 = r1;
        return r0.copy(r11, r2, r10, r8, r9);
    }

    public final int component1() {
        return this.mPhotoSize;
    }

    public final int component2() {
        return this.mVideoSize;
    }

    public final int component3() {
        return this.mTotalSize;
    }

    public final int component4() {
        return this.mFreeSize;
    }

    public final int component5() {
        return this.mAudioSize;
    }

    @aa1
    public final BleIPCStoresInfo copy(int r7, int r8, int r9, int r10, int r11) {
        return new BleIPCStoresInfo(r7, r8, r9, r10, r11);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mPhotoSize = readUInt16(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mVideoSize = readUInt16(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mTotalSize = (int) readUInt32(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mFreeSize = (int) readUInt32(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mAudioSize = readUInt16(r0);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleIPCStoresInfo) == true) goto L8;
        return false;
    L8:
        BleIPCStoresInfo r6 = (BleIPCStoresInfo) r5;
        if (this.mPhotoSize == r6.mPhotoSize) goto L12;
        return false;
    L12:
        if (this.mVideoSize == r6.mVideoSize) goto L15;
        return false;
    L15:
        if (this.mTotalSize == r6.mTotalSize) goto L18;
        return false;
    L18:
        if (this.mFreeSize == r6.mFreeSize) goto L21;
        return false;
    L21:
        if (this.mAudioSize == r6.mAudioSize) goto L23;
        return false;
    L23:
        return true;
    }

    public final int getMAudioSize() {
        return this.mAudioSize;
    }

    public final int getMFreeSize() {
        return this.mFreeSize;
    }

    public final int getMPhotoSize() {
        return this.mPhotoSize;
    }

    public final int getMTotalSize() {
        return this.mTotalSize;
    }

    public final int getMVideoSize() {
        return this.mVideoSize;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.mPhotoSize) * 31) + Integer.hashCode(this.mVideoSize)) * 31) + Integer.hashCode(this.mTotalSize)) * 31) + Integer.hashCode(this.mFreeSize)) * 31) + Integer.hashCode(this.mAudioSize);
    }

    public final void setMAudioSize(int r1) {
        this.mAudioSize = r1;
    }

    public final void setMFreeSize(int r1) {
        this.mFreeSize = r1;
    }

    public final void setMPhotoSize(int r1) {
        this.mPhotoSize = r1;
    }

    public final void setMTotalSize(int r1) {
        this.mTotalSize = r1;
    }

    public final void setMVideoSize(int r1) {
        this.mVideoSize = r1;
    }

    @aa1
    public String toString() {
        return "BleIPCStoresInfo(mPhotoSize=" + this.mPhotoSize + ", mVideoSize=" + this.mVideoSize + ", mTotalSize=" + this.mTotalSize + ", mFreeSize=" + this.mFreeSize + ", mAudioSize=" + this.mAudioSize + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleIPCStoresInfo(int r1, int r2, int r3, int r4, int r5) {
        this.mPhotoSize = r1;
        this.mVideoSize = r2;
        this.mTotalSize = r3;
        this.mFreeSize = r4;
        this.mAudioSize = r5;
    }

    public /* synthetic */ BleIPCStoresInfo(int r2, int r3, int r4, int r5, int r6, int r7, DefaultConstructorMarker r8) {
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
