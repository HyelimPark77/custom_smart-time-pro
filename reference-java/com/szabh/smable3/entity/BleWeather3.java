package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.bo0;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleWeather3 extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 120;
    private int mAQI;
    private int mCurrentTemperature;

    @tb1
    private final List<HourWeatherCode> mHourWeatherCodes;

    @tb1
    private final List<HourWeatherValue> mHourWeatherValues;
    private int mMaxTemperature;
    private int mMinTemperature;
    private int mSunriseHour;
    private int mSunriseMinute;
    private int mSunsetHour;
    private int mSunsetMinute;

    @tb1
    private final List<TideWeather> mTides;
    private int mWeatherCode;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleWeather3() {
        this(0, 0, 0, 0, null, null, 0, 0, 0, 0, 0, null, bo0.f5772iO, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleWeather3 copy$default(BleWeather3 bleWeather3, int i, int i2, int i3, int i4, List list, List list2, int i5, int i6, int i7, int i8, int i9, List list3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = bleWeather3.mCurrentTemperature;
        }
        if ((i10 & 2) != 0) {
            i2 = bleWeather3.mMaxTemperature;
        }
        if ((i10 & 4) != 0) {
            i3 = bleWeather3.mMinTemperature;
        }
        if ((i10 & 8) != 0) {
            i4 = bleWeather3.mWeatherCode;
        }
        if ((i10 & 16) != 0) {
            list = bleWeather3.mHourWeatherCodes;
        }
        if ((i10 & 32) != 0) {
            list2 = bleWeather3.mHourWeatherValues;
        }
        if ((i10 & 64) != 0) {
            i5 = bleWeather3.mSunriseHour;
        }
        if ((i10 & 128) != 0) {
            i6 = bleWeather3.mSunriseMinute;
        }
        if ((i10 & 256) != 0) {
            i7 = bleWeather3.mSunsetHour;
        }
        if ((i10 & 512) != 0) {
            i8 = bleWeather3.mSunsetMinute;
        }
        if ((i10 & 1024) != 0) {
            i9 = bleWeather3.mAQI;
        }
        if ((i10 & 2048) != 0) {
            list3 = bleWeather3.mTides;
        }
        int i11 = i9;
        List list4 = list3;
        int i12 = i7;
        int i13 = i8;
        int i14 = i5;
        int i15 = i6;
        List list5 = list;
        List list6 = list2;
        return bleWeather3.copy(i, i2, i3, i4, list5, list6, i14, i15, i12, i13, i11, list4);
    }

    public final int component1() {
        return this.mCurrentTemperature;
    }

    public final int component10() {
        return this.mSunsetMinute;
    }

    public final int component11() {
        return this.mAQI;
    }

    @tb1
    public final List<TideWeather> component12() {
        return this.mTides;
    }

    public final int component2() {
        return this.mMaxTemperature;
    }

    public final int component3() {
        return this.mMinTemperature;
    }

    public final int component4() {
        return this.mWeatherCode;
    }

    @tb1
    public final List<HourWeatherCode> component5() {
        return this.mHourWeatherCodes;
    }

    @tb1
    public final List<HourWeatherValue> component6() {
        return this.mHourWeatherValues;
    }

    public final int component7() {
        return this.mSunriseHour;
    }

    public final int component8() {
        return this.mSunriseMinute;
    }

    public final int component9() {
        return this.mSunsetHour;
    }

    @aa1
    public final BleWeather3 copy(int i, int i2, int i3, int i4, @tb1 List<HourWeatherCode> list, @tb1 List<HourWeatherValue> list2, int i5, int i6, int i7, int i8, int i9, @tb1 List<TideWeather> list3) {
        return new BleWeather3(i, i2, i3, i4, list, list2, i5, i6, i7, i8, i9, list3);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mCurrentTemperature);
        writeInt8(this.mMaxTemperature);
        writeInt8(this.mMinTemperature);
        int i = this.mWeatherCode;
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt16(i, LITTLE_ENDIAN);
        writeList(this.mHourWeatherCodes);
        writeList(this.mHourWeatherValues);
        writeInt8(this.mSunriseHour);
        writeInt8(this.mSunriseMinute);
        writeInt8(this.mSunsetHour);
        writeInt8(this.mSunsetMinute);
        int i2 = this.mAQI;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt16(i2, LITTLE_ENDIAN);
        writeList(this.mTides);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleWeather3)) {
            return false;
        }
        BleWeather3 bleWeather3 = (BleWeather3) obj;
        return this.mCurrentTemperature == bleWeather3.mCurrentTemperature && this.mMaxTemperature == bleWeather3.mMaxTemperature && this.mMinTemperature == bleWeather3.mMinTemperature && this.mWeatherCode == bleWeather3.mWeatherCode && Intrinsics.XOO0ii0(this.mHourWeatherCodes, bleWeather3.mHourWeatherCodes) && Intrinsics.XOO0ii0(this.mHourWeatherValues, bleWeather3.mHourWeatherValues) && this.mSunriseHour == bleWeather3.mSunriseHour && this.mSunriseMinute == bleWeather3.mSunriseMinute && this.mSunsetHour == bleWeather3.mSunsetHour && this.mSunsetMinute == bleWeather3.mSunsetMinute && this.mAQI == bleWeather3.mAQI && Intrinsics.XOO0ii0(this.mTides, bleWeather3.mTides);
    }

    public final int getMAQI() {
        return this.mAQI;
    }

    public final int getMCurrentTemperature() {
        return this.mCurrentTemperature;
    }

    @tb1
    public final List<HourWeatherCode> getMHourWeatherCodes() {
        return this.mHourWeatherCodes;
    }

    @tb1
    public final List<HourWeatherValue> getMHourWeatherValues() {
        return this.mHourWeatherValues;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 120;
    }

    public final int getMMaxTemperature() {
        return this.mMaxTemperature;
    }

    public final int getMMinTemperature() {
        return this.mMinTemperature;
    }

    public final int getMSunriseHour() {
        return this.mSunriseHour;
    }

    public final int getMSunriseMinute() {
        return this.mSunriseMinute;
    }

    public final int getMSunsetHour() {
        return this.mSunsetHour;
    }

    public final int getMSunsetMinute() {
        return this.mSunsetMinute;
    }

    @tb1
    public final List<TideWeather> getMTides() {
        return this.mTides;
    }

    public final int getMWeatherCode() {
        return this.mWeatherCode;
    }

    public int hashCode() {
        int iHashCode = ((((((Integer.hashCode(this.mCurrentTemperature) * 31) + Integer.hashCode(this.mMaxTemperature)) * 31) + Integer.hashCode(this.mMinTemperature)) * 31) + Integer.hashCode(this.mWeatherCode)) * 31;
        List<HourWeatherCode> list = this.mHourWeatherCodes;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<HourWeatherValue> list2 = this.mHourWeatherValues;
        int iHashCode3 = (((((((((((iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31) + Integer.hashCode(this.mSunriseHour)) * 31) + Integer.hashCode(this.mSunriseMinute)) * 31) + Integer.hashCode(this.mSunsetHour)) * 31) + Integer.hashCode(this.mSunsetMinute)) * 31) + Integer.hashCode(this.mAQI)) * 31;
        List<TideWeather> list3 = this.mTides;
        return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    public final void setMAQI(int i) {
        this.mAQI = i;
    }

    public final void setMCurrentTemperature(int i) {
        this.mCurrentTemperature = i;
    }

    public final void setMMaxTemperature(int i) {
        this.mMaxTemperature = i;
    }

    public final void setMMinTemperature(int i) {
        this.mMinTemperature = i;
    }

    public final void setMSunriseHour(int i) {
        this.mSunriseHour = i;
    }

    public final void setMSunriseMinute(int i) {
        this.mSunriseMinute = i;
    }

    public final void setMSunsetHour(int i) {
        this.mSunsetHour = i;
    }

    public final void setMSunsetMinute(int i) {
        this.mSunsetMinute = i;
    }

    public final void setMWeatherCode(int i) {
        this.mWeatherCode = i;
    }

    @aa1
    public String toString() {
        return "BleWeather3(mCurrentTemperature = " + this.mCurrentTemperature + ", mMaxTemperature = " + this.mMaxTemperature + ", mMinTemperature =" + this.mMinTemperature + " ,mWeatherCode = " + this.mWeatherCode + ", mHourWeatherCodes = " + this.mHourWeatherCodes + ", mHourWeatherValues = " + this.mHourWeatherValues + ", mSunriseHour = " + this.mSunriseHour + ", mSunriseMinute = " + this.mSunriseMinute + " ,mSunsetHour =" + this.mSunsetHour + " mSunsetMinute = " + this.mSunsetMinute + ",mAQI = " + this.mAQI + " . mTides = " + this.mTides + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleWeather3(int i, int i2, int i3, int i4, @tb1 List<HourWeatherCode> list, @tb1 List<HourWeatherValue> list2, int i5, int i6, int i7, int i8, int i9, @tb1 List<TideWeather> list3) {
        this.mCurrentTemperature = i;
        this.mMaxTemperature = i2;
        this.mMinTemperature = i3;
        this.mWeatherCode = i4;
        this.mHourWeatherCodes = list;
        this.mHourWeatherValues = list2;
        this.mSunriseHour = i5;
        this.mSunriseMinute = i6;
        this.mSunsetHour = i7;
        this.mSunsetMinute = i8;
        this.mAQI = i9;
        this.mTides = list3;
    }

    public /* synthetic */ BleWeather3(int i, int i2, int i3, int i4, List list, List list2, int i5, int i6, int i7, int i8, int i9, List list3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0 : i, (i10 & 2) != 0 ? 0 : i2, (i10 & 4) != 0 ? 0 : i3, (i10 & 8) != 0 ? 0 : i4, (i10 & 16) != 0 ? null : list, (i10 & 32) != 0 ? null : list2, (i10 & 64) != 0 ? 0 : i5, (i10 & 128) != 0 ? 0 : i6, (i10 & 256) != 0 ? 0 : i7, (i10 & 512) != 0 ? 0 : i8, (i10 & 1024) == 0 ? i9 : 0, (i10 & 2048) != 0 ? null : list3);
    }
}
