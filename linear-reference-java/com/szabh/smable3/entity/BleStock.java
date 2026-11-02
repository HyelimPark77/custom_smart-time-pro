package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class BleStock extends BleIdObject {
    public static final int COLOR_TYPE_0 = 0;
    public static final int COLOR_TYPE_1 = 1;

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 84;
    private static final int NAME_LENGTH = 62;
    private int mColorType;
    private float mMarketCapitalization;
    private float mNetChangePercent;
    private float mNetChangePoint;
    private float mSharePrice;

    @aa1
    private String mStockCode;

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

    public BleStock() {
        int r1 = 0;
        String r2 = null;
        float r3 = 0.0f;
        float r4 = 0.0f;
        float r5 = 0.0f;
        float r6 = 0.0f;
        this(r1, r2, r3, r4, r5, r6, 63, null);
    }

    public static /* synthetic */ BleStock copy$default(BleStock r0, int r1, String r2, float r3, float r4, float r5, float r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r0.mColorType;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r0.mStockCode;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = r0.mSharePrice;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r4 = r0.mNetChangePoint;
    L15:
        if ((r7 & 16) == 0) goto L18;
        r5 = r0.mNetChangePercent;
    L18:
        if ((r7 & 32) == 0) goto L20;
        r6 = r0.mMarketCapitalization;
    L20:
        float r9 = r5;
        float r10 = r6;
        float r11 = r3;
        float r12 = r4;
        return r0.copy(r1, r2, r11, r12, r9, r10);
    }

    private final int getNumberOfDecimalPlaces(float r7) {
        int r0 = StringsKt__StringsKt.IiO1X1OI(String.valueOf(r7), '.', 0, false, 6, null);
        if (r0 >= 0) goto L7;
        return 0;
    L7:
        return (String.valueOf(r7).length() - 1) - r0;
    }

    public final int component1() {
        return this.mColorType;
    }

    @aa1
    public final String component2() {
        return this.mStockCode;
    }

    public final float component3() {
        return this.mSharePrice;
    }

    public final float component4() {
        return this.mNetChangePoint;
    }

    public final float component5() {
        return this.mNetChangePercent;
    }

    public final float component6() {
        return this.mMarketCapitalization;
    }

    @aa1
    public final BleStock copy(int r9, @aa1 String r10, float r11, float r12, float r13, float r14) {
        Intrinsics.X0O(r10, "mStockCode");
        return new BleStock(r9, r10, r11, r12, r13, r14);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        setMId(readUInt8());
        this.mColorType = readUInt8();
        BleReadable.readInt16$default(this, null, 1, null);
        this.mStockCode = readString(62, Charsets.O00);
        BleReadable.readInt16$default(this, null, 1, null);
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mSharePrice = readFloat(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mNetChangePoint = readFloat(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mNetChangePercent = readFloat(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mMarketCapitalization = readFloat(r0);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(getMId());
        writeInt8(this.mColorType);
        writeIntN(getNumberOfDecimalPlaces(this.mNetChangePoint), 4);
        writeIntN(getNumberOfDecimalPlaces(this.mSharePrice), 4);
        writeIntN(0, 4);
        writeIntN(getNumberOfDecimalPlaces(this.mNetChangePercent), 4);
        writeStringWithFix(this.mStockCode, 62, Charsets.O00);
        BleWritable.writeInt16$default(this, 0, null, 2, null);
        float r0 = this.mSharePrice;
        ByteOrder r1 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeFloat(r0, r1);
        float r2 = this.mNetChangePoint;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeFloat(r2, r1);
        float r3 = this.mNetChangePercent;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeFloat(r3, r1);
        float r4 = this.mMarketCapitalization;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeFloat(r4, r1);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleStock) == true) goto L8;
        return false;
    L8:
        BleStock r6 = (BleStock) r5;
        if (this.mColorType == r6.mColorType) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.mStockCode, r6.mStockCode) == true) goto L15;
        return false;
    L15:
        if (Float.compare(this.mSharePrice, r6.mSharePrice) == 0) goto L18;
        return false;
    L18:
        if (Float.compare(this.mNetChangePoint, r6.mNetChangePoint) == 0) goto L21;
        return false;
    L21:
        if (Float.compare(this.mNetChangePercent, r6.mNetChangePercent) == 0) goto L24;
        return false;
    L24:
        if (Float.compare(this.mMarketCapitalization, r6.mMarketCapitalization) == 0) goto L26;
        return false;
    L26:
        return true;
    }

    public final int getMColorType() {
        return this.mColorType;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 84;
    }

    public final float getMMarketCapitalization() {
        return this.mMarketCapitalization;
    }

    public final float getMNetChangePercent() {
        return this.mNetChangePercent;
    }

    public final float getMNetChangePoint() {
        return this.mNetChangePoint;
    }

    public final float getMSharePrice() {
        return this.mSharePrice;
    }

    @aa1
    public final String getMStockCode() {
        return this.mStockCode;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.mColorType) * 31) + this.mStockCode.hashCode()) * 31) + Float.hashCode(this.mSharePrice)) * 31) + Float.hashCode(this.mNetChangePoint)) * 31) + Float.hashCode(this.mNetChangePercent)) * 31) + Float.hashCode(this.mMarketCapitalization);
    }

    public final void setMColorType(int r1) {
        this.mColorType = r1;
    }

    public final void setMMarketCapitalization(float r1) {
        this.mMarketCapitalization = r1;
    }

    public final void setMNetChangePercent(float r1) {
        this.mNetChangePercent = r1;
    }

    public final void setMNetChangePoint(float r1) {
        this.mNetChangePoint = r1;
    }

    public final void setMSharePrice(float r1) {
        this.mSharePrice = r1;
    }

    public final void setMStockCode(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mStockCode = r2;
    }

    @aa1
    public String toString() {
        return "BleStock(mId=" + getMId() + ", [" + getNumberOfDecimalPlaces(this.mSharePrice) + ", " + getNumberOfDecimalPlaces(this.mNetChangePoint) + ", " + getNumberOfDecimalPlaces(this.mNetChangePercent) + "], colorType=" + this.mColorType + ", mStockCode=" + this.mStockCode + ", mSharePrice=" + this.mSharePrice + ", mNetChangePoint=" + this.mNetChangePoint + ", mNetChangePercent=" + this.mNetChangePercent + ", mMarketCapitalization=" + this.mMarketCapitalization + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleStock(int r2, @aa1 String r3, float r4, float r5, float r6, float r7) {
        Intrinsics.X0O(r3, "mStockCode");
        this.mColorType = r2;
        this.mStockCode = r3;
        this.mSharePrice = r4;
        this.mNetChangePoint = r5;
        this.mNetChangePercent = r6;
        this.mMarketCapitalization = r7;
    }

    public /* synthetic */ BleStock(int r2, String r3, float r4, float r5, float r6, float r7, int r8, DefaultConstructorMarker r9) {
        if ((r8 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r8 & 4) == 0) goto L12;
        r4 = 0.0f;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r5 = 0.0f;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r6 = 0.0f;
    L18:
        if ((r8 & 32) == 0) goto L20;
        float r10 = 0.0f;
    L21:
        this(r2, r3, r4, r5, r6, r10);
        return;
    L20:
        r10 = r7;
        goto L21
    }
}
