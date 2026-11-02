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
    public static final Companion Companion = new Companion(null);
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
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleStock() {
        this(0, null, 0.0f, 0.0f, 0.0f, 0.0f, 63, null);
    }

    public static /* synthetic */ BleStock copy$default(BleStock bleStock, int i, String str, float f, float f2, float f3, float f4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bleStock.mColorType;
        }
        if ((i2 & 2) != 0) {
            str = bleStock.mStockCode;
        }
        if ((i2 & 4) != 0) {
            f = bleStock.mSharePrice;
        }
        if ((i2 & 8) != 0) {
            f2 = bleStock.mNetChangePoint;
        }
        if ((i2 & 16) != 0) {
            f3 = bleStock.mNetChangePercent;
        }
        if ((i2 & 32) != 0) {
            f4 = bleStock.mMarketCapitalization;
        }
        float f5 = f3;
        float f6 = f4;
        return bleStock.copy(i, str, f, f2, f5, f6);
    }

    private final int getNumberOfDecimalPlaces(float f) {
        int iIiO1X1OI = StringsKt__StringsKt.IiO1X1OI(String.valueOf(f), '.', 0, false, 6, null);
        if (iIiO1X1OI < 0) {
            return 0;
        }
        return (String.valueOf(f).length() - 1) - iIiO1X1OI;
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
    public final BleStock copy(int i, @aa1 String mStockCode, float f, float f2, float f3, float f4) {
        Intrinsics.X0O(mStockCode, "mStockCode");
        return new BleStock(i, mStockCode, f, f2, f3, f4);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        setMId(readUInt8());
        this.mColorType = readUInt8();
        BleReadable.readInt16$default(this, null, 1, null);
        this.mStockCode = readString(62, Charsets.O00);
        BleReadable.readInt16$default(this, null, 1, null);
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mSharePrice = readFloat(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mNetChangePoint = readFloat(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mNetChangePercent = readFloat(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mMarketCapitalization = readFloat(LITTLE_ENDIAN);
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
        float f = this.mSharePrice;
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeFloat(f, LITTLE_ENDIAN);
        float f2 = this.mNetChangePoint;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeFloat(f2, LITTLE_ENDIAN);
        float f3 = this.mNetChangePercent;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeFloat(f3, LITTLE_ENDIAN);
        float f4 = this.mMarketCapitalization;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeFloat(f4, LITTLE_ENDIAN);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleStock)) {
            return false;
        }
        BleStock bleStock = (BleStock) obj;
        return this.mColorType == bleStock.mColorType && Intrinsics.XOO0ii0(this.mStockCode, bleStock.mStockCode) && Float.compare(this.mSharePrice, bleStock.mSharePrice) == 0 && Float.compare(this.mNetChangePoint, bleStock.mNetChangePoint) == 0 && Float.compare(this.mNetChangePercent, bleStock.mNetChangePercent) == 0 && Float.compare(this.mMarketCapitalization, bleStock.mMarketCapitalization) == 0;
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

    public final void setMColorType(int i) {
        this.mColorType = i;
    }

    public final void setMMarketCapitalization(float f) {
        this.mMarketCapitalization = f;
    }

    public final void setMNetChangePercent(float f) {
        this.mNetChangePercent = f;
    }

    public final void setMNetChangePoint(float f) {
        this.mNetChangePoint = f;
    }

    public final void setMSharePrice(float f) {
        this.mSharePrice = f;
    }

    public final void setMStockCode(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mStockCode = str;
    }

    @aa1
    public String toString() {
        return "BleStock(mId=" + getMId() + ", [" + getNumberOfDecimalPlaces(this.mSharePrice) + ", " + getNumberOfDecimalPlaces(this.mNetChangePoint) + ", " + getNumberOfDecimalPlaces(this.mNetChangePercent) + "], colorType=" + this.mColorType + ", mStockCode=" + this.mStockCode + ", mSharePrice=" + this.mSharePrice + ", mNetChangePoint=" + this.mNetChangePoint + ", mNetChangePercent=" + this.mNetChangePercent + ", mMarketCapitalization=" + this.mMarketCapitalization + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleStock(int i, @aa1 String mStockCode, float f, float f2, float f3, float f4) {
        Intrinsics.X0O(mStockCode, "mStockCode");
        this.mColorType = i;
        this.mStockCode = mStockCode;
        this.mSharePrice = f;
        this.mNetChangePoint = f2;
        this.mNetChangePercent = f3;
        this.mMarketCapitalization = f4;
    }

    public /* synthetic */ BleStock(int i, String str, float f, float f2, float f3, float f4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? 0.0f : f, (i2 & 8) != 0 ? 0.0f : f2, (i2 & 16) != 0 ? 0.0f : f3, (i2 & 32) != 0 ? 0.0f : f4);
    }
}
