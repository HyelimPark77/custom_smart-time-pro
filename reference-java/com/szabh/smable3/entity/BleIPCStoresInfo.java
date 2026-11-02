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
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 14;
    private int mAudioSize;
    private int mFreeSize;
    private int mPhotoSize;
    private int mTotalSize;
    private int mVideoSize;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleIPCStoresInfo() {
        this(0, 0, 0, 0, 0, 31, null);
    }

    public static /* synthetic */ BleIPCStoresInfo copy$default(BleIPCStoresInfo bleIPCStoresInfo, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = bleIPCStoresInfo.mPhotoSize;
        }
        if ((i6 & 2) != 0) {
            i2 = bleIPCStoresInfo.mVideoSize;
        }
        if ((i6 & 4) != 0) {
            i3 = bleIPCStoresInfo.mTotalSize;
        }
        if ((i6 & 8) != 0) {
            i4 = bleIPCStoresInfo.mFreeSize;
        }
        if ((i6 & 16) != 0) {
            i5 = bleIPCStoresInfo.mAudioSize;
        }
        int i7 = i5;
        int i8 = i3;
        return bleIPCStoresInfo.copy(i, i2, i8, i4, i7);
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
    public final BleIPCStoresInfo copy(int i, int i2, int i3, int i4, int i5) {
        return new BleIPCStoresInfo(i, i2, i3, i4, i5);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mPhotoSize = readUInt16(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mVideoSize = readUInt16(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mTotalSize = (int) readUInt32(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mFreeSize = (int) readUInt32(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mAudioSize = readUInt16(LITTLE_ENDIAN);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleIPCStoresInfo)) {
            return false;
        }
        BleIPCStoresInfo bleIPCStoresInfo = (BleIPCStoresInfo) obj;
        return this.mPhotoSize == bleIPCStoresInfo.mPhotoSize && this.mVideoSize == bleIPCStoresInfo.mVideoSize && this.mTotalSize == bleIPCStoresInfo.mTotalSize && this.mFreeSize == bleIPCStoresInfo.mFreeSize && this.mAudioSize == bleIPCStoresInfo.mAudioSize;
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

    public final void setMAudioSize(int i) {
        this.mAudioSize = i;
    }

    public final void setMFreeSize(int i) {
        this.mFreeSize = i;
    }

    public final void setMPhotoSize(int i) {
        this.mPhotoSize = i;
    }

    public final void setMTotalSize(int i) {
        this.mTotalSize = i;
    }

    public final void setMVideoSize(int i) {
        this.mVideoSize = i;
    }

    @aa1
    public String toString() {
        return "BleIPCStoresInfo(mPhotoSize=" + this.mPhotoSize + ", mVideoSize=" + this.mVideoSize + ", mTotalSize=" + this.mTotalSize + ", mFreeSize=" + this.mFreeSize + ", mAudioSize=" + this.mAudioSize + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleIPCStoresInfo(int i, int i2, int i3, int i4, int i5) {
        this.mPhotoSize = i;
        this.mVideoSize = i2;
        this.mTotalSize = i3;
        this.mFreeSize = i4;
        this.mAudioSize = i5;
    }

    public /* synthetic */ BleIPCStoresInfo(int i, int i2, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? 0 : i3, (i6 & 8) != 0 ? 0 : i4, (i6 & 16) != 0 ? 0 : i5);
    }
}
