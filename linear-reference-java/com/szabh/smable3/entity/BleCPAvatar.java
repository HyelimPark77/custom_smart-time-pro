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
        Object[] r0 = 0 == true ? 1 : 0;
        this(null, r0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleCPAvatar copy$default(BleCPAvatar r0, byte[] r1, byte[] r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.mMeImageData;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.mCPImageData;
    L9:
        return r0.copy(r1, r2);
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
    public final BleCPAvatar copy(@aa1 byte[] r2, @aa1 byte[] r3) {
        Intrinsics.X0O(r2, "mMeImageData");
        Intrinsics.X0O(r3, "mCPImageData");
        return new BleCPAvatar(r2, r3);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        int r0 = this.mMeImageData.length;
        ByteOrder r1 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt32(r0, r1);
        int r2 = this.mCPImageData.length;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt32(r2, r1);
        BleWritable.writeBytes$default(this, this.mMeImageData, null, 2, null);
        BleWritable.writeBytes$default(this, this.mCPImageData, null, 2, null);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleCPAvatar) == true) goto L8;
        return false;
    L8:
        BleCPAvatar r6 = (BleCPAvatar) r5;
        if (Intrinsics.XOO0ii0(this.mMeImageData, r6.mMeImageData) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.mCPImageData, r6.mCPImageData) == true) goto L14;
        return false;
    L14:
        return true;
    }

    @aa1
    public final byte[] getMCPImageData() {
        return this.mCPImageData;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return (this.mMeImageData.length + 8) + this.mCPImageData.length;
    }

    @aa1
    public final byte[] getMMeImageData() {
        return this.mMeImageData;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.mMeImageData) * 31) + Arrays.hashCode(this.mCPImageData);
    }

    public final void setMCPImageData(@aa1 byte[] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mCPImageData = r2;
    }

    public final void setMMeImageData(@aa1 byte[] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mMeImageData = r2;
    }

    @aa1
    public String toString() {
        return "BleCPAvatar(mMeImageData=" + this.mMeImageData.length + ", mCPImageData=" + this.mCPImageData.length + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleCPAvatar(@aa1 byte[] r2, @aa1 byte[] r3) {
        Intrinsics.X0O(r2, "mMeImageData");
        Intrinsics.X0O(r3, "mCPImageData");
        this.mMeImageData = r2;
        this.mCPImageData = r3;
    }

    public /* synthetic */ BleCPAvatar(byte[] r2, byte[] r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = new byte[0];
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = new byte[0];
    L8:
        this(r2, r3);
    }
}
