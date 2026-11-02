package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.io.Serializable;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleWeather extends BleWritable implements Serializable {
    public static final int CLOUDY = 2;

    @aa1
    public static final Companion Companion = null;
    public static final int FOGGY = 9;
    public static final int HAZE = 11;
    public static final int HIGH_WINDY = 7;
    public static final int ITEM_LENGTH = 10;
    public static final int OTHER = 0;
    public static final int OVERCAST = 3;
    public static final int RAINY = 4;
    public static final int SAND_STORM = 10;
    public static final int SNOWY = 8;
    public static final int SUNNY = 1;
    public static final int THUNDER = 5;
    public static final int THUNDERSHOWER = 6;
    private int mCurrentTemperature;
    private int mHumidity;
    private int mMaxTemperature;
    private int mMinTemperature;
    private int mPrecipitation;
    private int mUltraVioletIntensity;
    private int mVisibility;
    private int mWeatherCode;
    private int mWindSpeed;

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

    public BleWeather() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        int r9 = 0;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, 511, null);
    }

    public static /* synthetic */ BleWeather copy$default(BleWeather r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, Object r11) {
        if ((r10 & 1) == 0) goto L6;
        r1 = r0.mCurrentTemperature;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r2 = r0.mMaxTemperature;
    L9:
        if ((r10 & 4) == 0) goto L12;
        r3 = r0.mMinTemperature;
    L12:
        if ((r10 & 8) == 0) goto L15;
        r4 = r0.mWeatherCode;
    L15:
        if ((r10 & 16) == 0) goto L18;
        r5 = r0.mWindSpeed;
    L18:
        if ((r10 & 32) == 0) goto L21;
        r6 = r0.mHumidity;
    L21:
        if ((r10 & 64) == 0) goto L24;
        r7 = r0.mVisibility;
    L24:
        if ((r10 & 128) == 0) goto L27;
        r8 = r0.mUltraVioletIntensity;
    L27:
        if ((r10 & 256) == 0) goto L29;
        r9 = r0.mPrecipitation;
    L29:
        int r12 = r8;
        int r13 = r9;
        int r14 = r6;
        int r15 = r7;
        int r16 = r4;
        int r17 = r5;
        int r18 = r3;
        int r19 = r1;
        return r0.copy(r19, r2, r18, r16, r17, r14, r15, r12, r13);
    }

    public final int component1() {
        return this.mCurrentTemperature;
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

    public final int component5() {
        return this.mWindSpeed;
    }

    public final int component6() {
        return this.mHumidity;
    }

    public final int component7() {
        return this.mVisibility;
    }

    public final int component8() {
        return this.mUltraVioletIntensity;
    }

    public final int component9() {
        return this.mPrecipitation;
    }

    @aa1
    public final BleWeather copy(int r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, int r19) {
        return new BleWeather(r11, r12, r13, r14, r15, r16, r17, r18, r19);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mCurrentTemperature = readInt8();
        this.mMaxTemperature = readInt8();
        this.mMinTemperature = readInt8();
        this.mWeatherCode = readInt8();
        this.mWindSpeed = readInt8();
        this.mHumidity = readInt8();
        this.mVisibility = readInt8();
        this.mUltraVioletIntensity = readInt8();
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mPrecipitation = readInt16(r0);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mCurrentTemperature);
        writeInt8(this.mMaxTemperature);
        writeInt8(this.mMinTemperature);
        writeInt8(this.mWeatherCode);
        writeInt8(this.mWindSpeed);
        writeInt8(this.mHumidity);
        writeInt8(this.mVisibility);
        writeInt8(this.mUltraVioletIntensity);
        int r0 = this.mPrecipitation;
        ByteOrder r1 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt16(r0, r1);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleWeather) == true) goto L8;
        return false;
    L8:
        BleWeather r6 = (BleWeather) r5;
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
        if (this.mWindSpeed == r6.mWindSpeed) goto L24;
        return false;
    L24:
        if (this.mHumidity == r6.mHumidity) goto L27;
        return false;
    L27:
        if (this.mVisibility == r6.mVisibility) goto L30;
        return false;
    L30:
        if (this.mUltraVioletIntensity == r6.mUltraVioletIntensity) goto L33;
        return false;
    L33:
        if (this.mPrecipitation == r6.mPrecipitation) goto L35;
        return false;
    L35:
        return true;
    }

    public final int getMCurrentTemperature() {
        return this.mCurrentTemperature;
    }

    public final int getMHumidity() {
        return this.mHumidity;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 10;
    }

    public final int getMMaxTemperature() {
        return this.mMaxTemperature;
    }

    public final int getMMinTemperature() {
        return this.mMinTemperature;
    }

    public final int getMPrecipitation() {
        return this.mPrecipitation;
    }

    public final int getMUltraVioletIntensity() {
        return this.mUltraVioletIntensity;
    }

    public final int getMVisibility() {
        return this.mVisibility;
    }

    public final int getMWeatherCode() {
        return this.mWeatherCode;
    }

    public final int getMWindSpeed() {
        return this.mWindSpeed;
    }

    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.mCurrentTemperature) * 31) + Integer.hashCode(this.mMaxTemperature)) * 31) + Integer.hashCode(this.mMinTemperature)) * 31) + Integer.hashCode(this.mWeatherCode)) * 31) + Integer.hashCode(this.mWindSpeed)) * 31) + Integer.hashCode(this.mHumidity)) * 31) + Integer.hashCode(this.mVisibility)) * 31) + Integer.hashCode(this.mUltraVioletIntensity)) * 31) + Integer.hashCode(this.mPrecipitation);
    }

    public final void setMCurrentTemperature(int r1) {
        this.mCurrentTemperature = r1;
    }

    public final void setMHumidity(int r1) {
        this.mHumidity = r1;
    }

    public final void setMMaxTemperature(int r1) {
        this.mMaxTemperature = r1;
    }

    public final void setMMinTemperature(int r1) {
        this.mMinTemperature = r1;
    }

    public final void setMPrecipitation(int r1) {
        this.mPrecipitation = r1;
    }

    public final void setMUltraVioletIntensity(int r1) {
        this.mUltraVioletIntensity = r1;
    }

    public final void setMVisibility(int r1) {
        this.mVisibility = r1;
    }

    public final void setMWeatherCode(int r1) {
        this.mWeatherCode = r1;
    }

    public final void setMWindSpeed(int r1) {
        this.mWindSpeed = r1;
    }

    @aa1
    public String toString() {
        return "BleWeather(mCurrentTemperature=" + this.mCurrentTemperature + ", mMaxTemperature=" + this.mMaxTemperature + ", mMinTemperature=" + this.mMinTemperature + ", mWeatherCode=" + this.mWeatherCode + ", mWindSpeed=" + this.mWindSpeed + ", mHumidity=" + this.mHumidity + ", mVisibility=" + this.mVisibility + ", mUltraVioletIntensity=" + this.mUltraVioletIntensity + ", mPrecipitation=" + this.mPrecipitation + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleWeather(int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
        this.mCurrentTemperature = r1;
        this.mMaxTemperature = r2;
        this.mMinTemperature = r3;
        this.mWeatherCode = r4;
        this.mWindSpeed = r5;
        this.mHumidity = r6;
        this.mVisibility = r7;
        this.mUltraVioletIntensity = r8;
        this.mPrecipitation = r9;
    }

    public /* synthetic */ BleWeather(int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, DefaultConstructorMarker r12) {
        if ((r11 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r11 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r11 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r11 & 8) == 0) goto L15;
        r5 = 0;
    L15:
        if ((r11 & 16) == 0) goto L18;
        r6 = 0;
    L18:
        if ((r11 & 32) == 0) goto L21;
        r7 = 0;
    L21:
        if ((r11 & 64) == 0) goto L24;
        r8 = 0;
    L24:
        if ((r11 & 128) == 0) goto L27;
        r9 = 0;
    L27:
        if ((r11 & 256) == 0) goto L30;
        int r13 = 0;
    L29:
        int r14 = r9;
        int r15 = r8;
        int r16 = r7;
        int r17 = r6;
        int r18 = r5;
        int r19 = r4;
        this(r2, r3, r19, r18, r17, r16, r15, r14, r13);
        return;
    L30:
        r13 = r10;
        goto L29
    }
}
