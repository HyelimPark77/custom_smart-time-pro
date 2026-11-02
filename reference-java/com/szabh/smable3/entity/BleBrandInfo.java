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
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ BleBrandInfo copy$default(BleBrandInfo bleBrandInfo, BleBrandInfoHeader bleBrandInfoHeader, BleBrandInfoItem0 bleBrandInfoItem0, BleBrandInfoItem1 bleBrandInfoItem1, int i, Object obj) {
        if ((i & 1) != 0) {
            bleBrandInfoHeader = bleBrandInfo.mHeader;
        }
        if ((i & 2) != 0) {
            bleBrandInfoItem0 = bleBrandInfo.mItem0;
        }
        if ((i & 4) != 0) {
            bleBrandInfoItem1 = bleBrandInfo.mItem1;
        }
        return bleBrandInfo.copy(bleBrandInfoHeader, bleBrandInfoItem0, bleBrandInfoItem1);
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
    public final BleBrandInfo copy(@aa1 BleBrandInfoHeader mHeader, @aa1 BleBrandInfoItem0 mItem0, @aa1 BleBrandInfoItem1 mItem1) {
        Intrinsics.X0O(mHeader, "mHeader");
        Intrinsics.X0O(mItem0, "mItem0");
        Intrinsics.X0O(mItem1, "mItem1");
        return new BleBrandInfo(mHeader, mItem0, mItem1);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeObject(this.mHeader);
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeUInt32(40L, LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeUInt32(168L, LITTLE_ENDIAN);
        writeObject(this.mItem0);
        writeObject(this.mItem1);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleBrandInfo)) {
            return false;
        }
        BleBrandInfo bleBrandInfo = (BleBrandInfo) obj;
        return Intrinsics.XOO0ii0(this.mHeader, bleBrandInfo.mHeader) && Intrinsics.XOO0ii0(this.mItem0, bleBrandInfo.mItem0) && Intrinsics.XOO0ii0(this.mItem1, bleBrandInfo.mItem1);
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

    public final void setMHeader(@aa1 BleBrandInfoHeader bleBrandInfoHeader) {
        Intrinsics.X0O(bleBrandInfoHeader, "<set-?>");
        this.mHeader = bleBrandInfoHeader;
    }

    public final void setMItem0(@aa1 BleBrandInfoItem0 bleBrandInfoItem0) {
        Intrinsics.X0O(bleBrandInfoItem0, "<set-?>");
        this.mItem0 = bleBrandInfoItem0;
    }

    public final void setMItem1(@aa1 BleBrandInfoItem1 bleBrandInfoItem1) {
        Intrinsics.X0O(bleBrandInfoItem1, "<set-?>");
        this.mItem1 = bleBrandInfoItem1;
    }

    @aa1
    public String toString() {
        return "BleBrandInfo(mHeader=" + this.mHeader + ", mItem0=" + this.mItem0 + ", mItem1=" + this.mItem1 + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleBrandInfo(@aa1 BleBrandInfoHeader mHeader, @aa1 BleBrandInfoItem0 mItem0, @aa1 BleBrandInfoItem1 mItem1) {
        Intrinsics.X0O(mHeader, "mHeader");
        Intrinsics.X0O(mItem0, "mItem0");
        Intrinsics.X0O(mItem1, "mItem1");
        this.mHeader = mHeader;
        this.mItem0 = mItem0;
        this.mItem1 = mItem1;
    }

    public /* synthetic */ BleBrandInfo(BleBrandInfoHeader bleBrandInfoHeader, BleBrandInfoItem0 bleBrandInfoItem0, BleBrandInfoItem1 bleBrandInfoItem1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new BleBrandInfoHeader(null, 0, 0L, 0, 15, null) : bleBrandInfoHeader, (i & 2) != 0 ? new BleBrandInfoItem0(null, 1, null) : bleBrandInfoItem0, (i & 4) != 0 ? new BleBrandInfoItem1(0, 0, 0, 0, 0, null, null, 127, null) : bleBrandInfoItem1);
    }
}
