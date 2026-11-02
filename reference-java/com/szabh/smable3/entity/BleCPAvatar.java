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
public final class BleCPAvatar extends BleWritable {

    @aa1
    private byte[] mCPImageData;

    @aa1
    private byte[] mMeImageData;

    /* JADX WARN: Multi-variable type inference failed */
    public BleCPAvatar() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleCPAvatar copy$default(BleCPAvatar bleCPAvatar, byte[] bArr, byte[] bArr2, int i, Object obj) {
        if ((i & 1) != 0) {
            bArr = bleCPAvatar.mMeImageData;
        }
        if ((i & 2) != 0) {
            bArr2 = bleCPAvatar.mCPImageData;
        }
        return bleCPAvatar.copy(bArr, bArr2);
    }

    @aa1
    public final byte[] component1() {
        return this.mMeImageData;
    }

    @aa1
    public final byte[] component2() {
        return this.mCPImageData;
    }

    @aa1
    public final BleCPAvatar copy(@aa1 byte[] mMeImageData, @aa1 byte[] mCPImageData) {
        Intrinsics.X0O(mMeImageData, "mMeImageData");
        Intrinsics.X0O(mCPImageData, "mCPImageData");
        return new BleCPAvatar(mMeImageData, mCPImageData);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        int length = this.mMeImageData.length;
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt32(length, LITTLE_ENDIAN);
        int length2 = this.mCPImageData.length;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt32(length2, LITTLE_ENDIAN);
        BleWritable.writeBytes$default(this, this.mMeImageData, null, 2, null);
        BleWritable.writeBytes$default(this, this.mCPImageData, null, 2, null);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleCPAvatar)) {
            return false;
        }
        BleCPAvatar bleCPAvatar = (BleCPAvatar) obj;
        return Intrinsics.XOO0ii0(this.mMeImageData, bleCPAvatar.mMeImageData) && Intrinsics.XOO0ii0(this.mCPImageData, bleCPAvatar.mCPImageData);
    }

    @aa1
    public final byte[] getMCPImageData() {
        return this.mCPImageData;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return this.mMeImageData.length + 8 + this.mCPImageData.length;
    }

    @aa1
    public final byte[] getMMeImageData() {
        return this.mMeImageData;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.mMeImageData) * 31) + Arrays.hashCode(this.mCPImageData);
    }

    public final void setMCPImageData(@aa1 byte[] bArr) {
        Intrinsics.X0O(bArr, "<set-?>");
        this.mCPImageData = bArr;
    }

    public final void setMMeImageData(@aa1 byte[] bArr) {
        Intrinsics.X0O(bArr, "<set-?>");
        this.mMeImageData = bArr;
    }

    @aa1
    public String toString() {
        return "BleCPAvatar(mMeImageData=" + this.mMeImageData.length + ", mCPImageData=" + this.mCPImageData.length + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleCPAvatar(@aa1 byte[] mMeImageData, @aa1 byte[] mCPImageData) {
        Intrinsics.X0O(mMeImageData, "mMeImageData");
        Intrinsics.X0O(mCPImageData, "mCPImageData");
        this.mMeImageData = mMeImageData;
        this.mCPImageData = mCPImageData;
    }

    public /* synthetic */ BleCPAvatar(byte[] bArr, byte[] bArr2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new byte[0] : bArr, (i & 2) != 0 ? new byte[0] : bArr2);
    }
}
