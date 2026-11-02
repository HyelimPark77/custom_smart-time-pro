package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleQrcode extends BleWritable {

    @aa1
    private byte[] mData;
    private int mType;
    private int mWidth;

    public BleQrcode() {
        this(0, 0, null, 7, null);
    }

    public static /* synthetic */ BleQrcode copy$default(BleQrcode bleQrcode, int i, int i2, byte[] bArr, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = bleQrcode.mWidth;
        }
        if ((i3 & 2) != 0) {
            i2 = bleQrcode.mType;
        }
        if ((i3 & 4) != 0) {
            bArr = bleQrcode.mData;
        }
        return bleQrcode.copy(i, i2, bArr);
    }

    public final int component1() {
        return this.mWidth;
    }

    public final int component2() {
        return this.mType;
    }

    @aa1
    public final byte[] component3() {
        return this.mData;
    }

    @aa1
    public final BleQrcode copy(int i, int i2, @aa1 byte[] mData) {
        Intrinsics.X0O(mData, "mData");
        return new BleQrcode(i, i2, mData);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mWidth);
        writeInt8(this.mType);
        BleWritable.writeBytes$default(this, this.mData, null, 2, null);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleQrcode)) {
            return false;
        }
        BleQrcode bleQrcode = (BleQrcode) obj;
        return this.mWidth == bleQrcode.mWidth && this.mType == bleQrcode.mType && Intrinsics.XOO0ii0(this.mData, bleQrcode.mData);
    }

    @aa1
    public final byte[] getMData() {
        return this.mData;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return this.mData.length + 2;
    }

    public final int getMType() {
        return this.mType;
    }

    public final int getMWidth() {
        return this.mWidth;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.mWidth) * 31) + Integer.hashCode(this.mType)) * 31) + Arrays.hashCode(this.mData);
    }

    public final void setMData(@aa1 byte[] bArr) {
        Intrinsics.X0O(bArr, "<set-?>");
        this.mData = bArr;
    }

    public final void setMType(int i) {
        this.mType = i;
    }

    public final void setMWidth(int i) {
        this.mWidth = i;
    }

    @aa1
    public String toString() {
        return "BleQrcode(mWidth=" + this.mWidth + ", mType=" + this.mType + ", mData=" + this.mData.length + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleQrcode(int i, int i2, @aa1 byte[] mData) {
        Intrinsics.X0O(mData, "mData");
        this.mWidth = i;
        this.mType = i2;
        this.mData = mData;
    }

    public /* synthetic */ BleQrcode(int i, int i2, byte[] bArr, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? new byte[0] : bArr);
    }
}
