package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
final class BleBrandInfo extends BleWritable {

    @aa1
    private BleBrandInfoHeader mHeader;

    @aa1
    private BleBrandInfoItem0 mItem0;

    @aa1
    private BleBrandInfoItem1 mItem1;

    public BleBrandInfo() {
        BleBrandInfoHeader r1 = null;
        BleBrandInfoItem0 r2 = null;
        BleBrandInfoItem1 r3 = null;
        this(r1, r2, r3, 7, null);
    }

    public static /* synthetic */ BleBrandInfo copy$default(BleBrandInfo r0, BleBrandInfoHeader r1, BleBrandInfoItem0 r2, BleBrandInfoItem1 r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.mHeader;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.mItem0;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.mItem1;
    L12:
        return r0.copy(r1, r2, r3);
    }

    @aa1
    public final BleBrandInfoHeader component1() {
        return this.mHeader;
    }

    @aa1
    public final BleBrandInfoItem0 component2() {
        return this.mItem0;
    }

    @aa1
    public final BleBrandInfoItem1 component3() {
        return this.mItem1;
    }

    @aa1
    public final BleBrandInfo copy(@aa1 BleBrandInfoHeader r2, @aa1 BleBrandInfoItem0 r3, @aa1 BleBrandInfoItem1 r4) {
        Intrinsics.X0O(r2, "mHeader");
        Intrinsics.X0O(r3, "mItem0");
        Intrinsics.X0O(r4, "mItem1");
        return new BleBrandInfo(r2, r3, r4);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeObject(this.mHeader);
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        writeUInt32(40, r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        writeUInt32(168, r0);
        writeObject(this.mItem0);
        writeObject(this.mItem1);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleBrandInfo) == true) goto L8;
        return false;
    L8:
        BleBrandInfo r6 = (BleBrandInfo) r5;
        if (Intrinsics.XOO0ii0(this.mHeader, r6.mHeader) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.mItem0, r6.mItem0) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.mItem1, r6.mItem1) == true) goto L17;
        return false;
    L17:
        return true;
    }

    @aa1
    public final BleBrandInfoHeader getMHeader() {
        return this.mHeader;
    }

    @aa1
    public final BleBrandInfoItem0 getMItem0() {
        return this.mItem0;
    }

    @aa1
    public final BleBrandInfoItem1 getMItem1() {
        return this.mItem1;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return this.mItem1.getMLengthToWrite() + 168;
    }

    public int hashCode() {
        return (((this.mHeader.hashCode() * 31) + this.mItem0.hashCode()) * 31) + this.mItem1.hashCode();
    }

    public final void setMHeader(@aa1 BleBrandInfoHeader r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mHeader = r2;
    }

    public final void setMItem0(@aa1 BleBrandInfoItem0 r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mItem0 = r2;
    }

    public final void setMItem1(@aa1 BleBrandInfoItem1 r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mItem1 = r2;
    }

    @aa1
    public String toString() {
        return "BleBrandInfo(mHeader=" + this.mHeader + ", mItem0=" + this.mItem0 + ", mItem1=" + this.mItem1 + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleBrandInfo(@aa1 BleBrandInfoHeader r2, @aa1 BleBrandInfoItem0 r3, @aa1 BleBrandInfoItem1 r4) {
        Intrinsics.X0O(r2, "mHeader");
        Intrinsics.X0O(r3, "mItem0");
        Intrinsics.X0O(r4, "mItem1");
        this.mHeader = r2;
        this.mItem0 = r3;
        this.mItem1 = r4;
    }

    public /* synthetic */ BleBrandInfo(BleBrandInfoHeader r11, BleBrandInfoItem0 r12, BleBrandInfoItem1 r13, int r14, DefaultConstructorMarker r15) {
        if ((r14 & 1) == 0) goto L6;
        r11 = new BleBrandInfoHeader(null, 0, 0, 0, 15, null);
    L6:
        if ((r14 & 2) == 0) goto L9;
        r12 = new BleBrandInfoItem0(null, 1, null);
    L9:
        if ((r14 & 4) == 0) goto L11;
        r13 = new BleBrandInfoItem1(0, 0, 0, 0, 0, null, null, 127, null);
    L11:
        this(r11, r12, r13);
    }
}
