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
    public static final Companion Companion = null;
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
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public BleWeather3() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        List r5 = null;
        List r6 = null;
        int r7 = 0;
        int r8 = 0;
        int r9 = 0;
        int r10 = 0;
        int r11 = 0;
        List r12 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, bo0.iO, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleWeather3 copy$default(BleWeather3 r0, int r1, int r2, int r3, int r4, List r5, List r6, int r7, int r8, int r9, int r10, int r11, List r12, int r13, Object r14) {
        if ((r13 & 1) == 0) goto L6;
        r1 = r0.mCurrentTemperature;
    L6:
        if ((r13 & 2) == 0) goto L9;
        r2 = r0.mMaxTemperature;
    L9:
        if ((r13 & 4) == 0) goto L12;
        r3 = r0.mMinTemperature;
    L12:
        if ((r13 & 8) == 0) goto L15;
        r4 = r0.mWeatherCode;
    L15:
        if ((r13 & 16) == 0) goto L18;
        r5 = r0.mHourWeatherCodes;
    L18:
        if ((r13 & 32) == 0) goto L21;
        r6 = r0.mHourWeatherValues;
    L21:
        if ((r13 & 64) == 0) goto L24;
        r7 = r0.mSunriseHour;
    L24:
        if ((r13 & 128) == 0) goto L27;
        r8 = r0.mSunriseMinute;
    L27:
        if ((r13 & 256) == 0) goto L30;
        r9 = r0.mSunsetHour;
    L30:
        if ((r13 & 512) == 0) goto L33;
        r10 = r0.mSunsetMinute;
    L33:
        if ((r13 & 1024) == 0) goto L36;
        r11 = r0.mAQI;
    L36:
        if ((r13 & 2048) == 0) goto L38;
        r12 = r0.mTides;
    L38:
        int r15 = r11;
        List r16 = r12;
        int r17 = r9;
        int r18 = r10;
        int r19 = r7;
        int r110 = r8;
        List r20 = r5;
        List r21 = r6;
        int r22 = r3;
        int r23 = r4;
        return r0.copy(r1, r2, r22, r23, r20, r21, r19, r110, r17, r18, r15, r16);
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
    public final BleWeather3 copy(int r14, int r15, int r16, int r17, @tb1 List<HourWeatherCode> r18, @tb1 List<HourWeatherValue> r19, int r20, int r21, int r22, int r23, int r24, @tb1 List<TideWeather> r25) {
        return new BleWeather3(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mCurrentTemperature);
        writeInt8(this.mMaxTemperature);
        writeInt8(this.mMinTemperature);
        int r0 = this.mWeatherCode;
        ByteOrder r1 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt16(r0, r1);
        writeList(this.mHourWeatherCodes);
        writeList(this.mHourWeatherValues);
        writeInt8(this.mSunriseHour);
        writeInt8(this.mSunriseMinute);
        writeInt8(this.mSunsetHour);
        writeInt8(this.mSunsetMinute);
        int r2 = this.mAQI;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt16(r2, r1);
        writeList(this.mTides);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleWeather3) == true) goto L8;
        return false;
    L8:
        BleWeather3 r6 = (BleWeather3) r5;
        if (this.mCurrentTemperature == r6.mCurrentTemperature) goto L12;
        return false;
    L12:
        if (this.mMaxTemperature == r6.mMaxTemperature) goto L15;
        return false;
    L15:
        if (this.mMinTemperature == r6.mMinTemperature) goto L18;
        return false;
    L18:
        if (this.mWeatherCode == r6.mWeatherCode) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.mHourWeatherCodes, r6.mHourWeatherCodes) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.mHourWeatherValues, r6.mHourWeatherValues) == true) goto L27;
        return false;
    L27:
        if (this.mSunriseHour == r6.mSunriseHour) goto L30;
        return false;
    L30:
        if (this.mSunriseMinute == r6.mSunriseMinute) goto L33;
        return false;
    L33:
        if (this.mSunsetHour == r6.mSunsetHour) goto L36;
        return false;
    L36:
        if (this.mSunsetMinute == r6.mSunsetMinute) goto L39;
        return false;
    L39:
        if (this.mAQI == r6.mAQI) goto L42;
        return false;
    L42:
        if (Intrinsics.XOO0ii0(this.mTides, r6.mTides) == true) goto L44;
        return false;
    L44:
        return true;
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
        int r0 = ((((((Integer.hashCode(this.mCurrentTemperature) * 31) + Integer.hashCode(this.mMaxTemperature)) * 31) + Integer.hashCode(this.mMinTemperature)) * 31) + Integer.hashCode(this.mWeatherCode)) * 31;
        List<HourWeatherCode> r1 = this.mHourWeatherCodes;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r3 = 0;
    L6:
        int r4 = (r0 + r3) * 31;
        List<HourWeatherValue> r5 = this.mHourWeatherValues;
        if (r5 != null) goto L9;
        int r6 = 0;
    L10:
        int r7 = (((((((((((r4 + r6) * 31) + Integer.hashCode(this.mSunriseHour)) * 31) + Integer.hashCode(this.mSunriseMinute)) * 31) + Integer.hashCode(this.mSunsetHour)) * 31) + Integer.hashCode(this.mSunsetMinute)) * 31) + Integer.hashCode(this.mAQI)) * 31;
        List<TideWeather> r8 = this.mTides;
        if (r8 == null) goto L15;
        r2 = r8.hashCode();
    L15:
        return r7 + r2;
    L9:
        r6 = r5.hashCode();
        goto L10
    L5:
        r3 = r1.hashCode();
        goto L6
    }

    public final void setMAQI(int r1) {
        this.mAQI = r1;
    }

    public final void setMCurrentTemperature(int r1) {
        this.mCurrentTemperature = r1;
    }

    public final void setMMaxTemperature(int r1) {
        this.mMaxTemperature = r1;
    }

    public final void setMMinTemperature(int r1) {
        this.mMinTemperature = r1;
    }

    public final void setMSunriseHour(int r1) {
        this.mSunriseHour = r1;
    }

    public final void setMSunriseMinute(int r1) {
        this.mSunriseMinute = r1;
    }

    public final void setMSunsetHour(int r1) {
        this.mSunsetHour = r1;
    }

    public final void setMSunsetMinute(int r1) {
        this.mSunsetMinute = r1;
    }

    public final void setMWeatherCode(int r1) {
        this.mWeatherCode = r1;
    }

    @aa1
    public String toString() {
        return "BleWeather3(mCurrentTemperature = " + this.mCurrentTemperature + ", mMaxTemperature = " + this.mMaxTemperature + ", mMinTemperature =" + this.mMinTemperature + " ,mWeatherCode = " + this.mWeatherCode + ", mHourWeatherCodes = " + this.mHourWeatherCodes + ", mHourWeatherValues = " + this.mHourWeatherValues + ", mSunriseHour = " + this.mSunriseHour + ", mSunriseMinute = " + this.mSunriseMinute + " ,mSunsetHour =" + this.mSunsetHour + " mSunsetMinute = " + this.mSunsetMinute + ",mAQI = " + this.mAQI + " . mTides = " + this.mTides + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleWeather3(int r1, int r2, int r3, int r4, @tb1 List<HourWeatherCode> r5, @tb1 List<HourWeatherValue> r6, int r7, int r8, int r9, int r10, int r11, @tb1 List<TideWeather> r12) {
        this.mCurrentTemperature = r1;
        this.mMaxTemperature = r2;
        this.mMinTemperature = r3;
        this.mWeatherCode = r4;
        this.mHourWeatherCodes = r5;
        this.mHourWeatherValues = r6;
        this.mSunriseHour = r7;
        this.mSunriseMinute = r8;
        this.mSunsetHour = r9;
        this.mSunsetMinute = r10;
        this.mAQI = r11;
        this.mTides = r12;
    }

    public /* synthetic */ BleWeather3(int r14, int r15, int r16, int r17, List r18, List r19, int r20, int r21, int r22, int r23, int r24, List r25, int r26, DefaultConstructorMarker r27) {
        int r2 = 0;
        if ((r26 & 1) == 0) goto L6;
        r14 = 0;
    L6:
        if ((r26 & 2) == 0) goto L8;
        int r1 = 0;
    L10:
        if ((r26 & 4) == 0) goto L12;
        int r3 = 0;
    L14:
        if ((r26 & 8) == 0) goto L16;
        int r4 = 0;
    L18:
        if ((r26 & 16) == 0) goto L20;
        List r5 = null;
    L22:
        if ((r26 & 32) == 0) goto L24;
        List r7 = null;
    L26:
        if ((r26 & 64) == 0) goto L28;
        int r8 = 0;
    L30:
        if ((r26 & 128) == 0) goto L32;
        int r9 = 0;
    L34:
        if ((r26 & 256) == 0) goto L36;
        int r10 = 0;
    L38:
        if ((r26 & 512) == 0) goto L40;
        int r11 = 0;
    L42:
        if ((r26 & 1024) != 0) goto L46;
        r2 = r24;
    L46:
        if ((r26 & 2048) == 0) goto L49;
        List r28 = null;
    L50:
        this(r14, r1, r3, r4, r5, r7, r8, r9, r10, r11, r2, r28);
        return;
    L49:
        r28 = r25;
        goto L50
    L40:
        r11 = r23;
        goto L42
    L36:
        r10 = r22;
        goto L38
    L32:
        r9 = r21;
        goto L34
    L28:
        r8 = r20;
        goto L30
    L24:
        r7 = r19;
        goto L26
    L20:
        r5 = r18;
        goto L22
    L16:
        r4 = r17;
        goto L18
    L12:
        r3 = r16;
        goto L14
    L8:
        r1 = r15;
        goto L10
    }
}
