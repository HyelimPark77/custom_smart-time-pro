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
        int r1 = 0;
        int r2 = 0;
        byte[] r3 = null;
        this(r1, r2, r3, 7, null);
    }

    public static /* synthetic */ BleQrcode copy$default(BleQrcode r0, int r1, int r2, byte[] r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.mWidth;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.mType;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.mData;
    L12:
        return r0.copy(r1, r2, r3);
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
    public final BleQrcode copy(int r2, int r3, @aa1 byte[] r4) {
        Intrinsics.X0O(r4, "mData");
        return new BleQrcode(r2, r3, r4);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mWidth);
        writeInt8(this.mType);
        BleWritable.writeBytes$default(this, this.mData, null, 2, null);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleQrcode) == true) goto L8;
        return false;
    L8:
        BleQrcode r6 = (BleQrcode) r5;
        if (this.mWidth == r6.mWidth) goto L12;
        return false;
    L12:
        if (this.mType == r6.mType) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.mData, r6.mData) == true) goto L17;
        return false;
    L17:
        return true;
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

    public final void setMData(@aa1 byte[] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mData = r2;
    }

    public final void setMType(int r1) {
        this.mType = r1;
    }

    public final void setMWidth(int r1) {
        this.mWidth = r1;
    }

    @aa1
    public String toString() {
        return "BleQrcode(mWidth=" + this.mWidth + ", mType=" + this.mType + ", mData=" + this.mData.length + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleQrcode(int r2, int r3, @aa1 byte[] r4) {
        Intrinsics.X0O(r4, "mData");
        this.mWidth = r2;
        this.mType = r3;
        this.mData = r4;
    }

    public /* synthetic */ BleQrcode(int r2, int r3, byte[] r4, int r5, DefaultConstructorMarker r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = new byte[0];
    L11:
        this(r2, r3, r4);
    }
}
