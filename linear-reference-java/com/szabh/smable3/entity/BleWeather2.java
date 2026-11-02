package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.Deprecated;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleWeather2 extends BleWritable {
    public static final int CLOUDY = 2;

    @aa1
    public static final Companion Companion = null;
    public static final int DRIZZLE = 13;
    public static final int FOGGY = 9;
    public static final int HAZE = 11;
    public static final int HEAVY_RAIN = 14;
    public static final int HEAVY_SNOW = 17;
    public static final int HIGH_WINDY = 7;
    public static final int ITEM_LENGTH = 20;
    public static final int LIGHTNING = 15;
    public static final int LIGHT_SNOW = 16;
    public static final int OTHER = 0;
    public static final int OVERCAST = 3;
    public static final int RAINY = 4;
    public static final int SAND_STORM = 10;
    public static final int SLEET = 18;
    public static final int SNOWSTORM = 20;
    public static final int SNOWY = 8;
    public static final int SUNNY = 1;
    public static final int THUNDER = 5;
    public static final int THUNDERSHOWER = 6;
    public static final int TORNADO = 19;
    public static final int WIND = 12;
    private int mAQI;
    private int mAltitude;
    private int mCurrentTemperature;
    private int mHumidity;
    private int mMaxTemperature;
    private int mMinTemperature;
    private int mPrecipitation;
    private int mSunrisMinute;
    private int mSunrisSecond;
    private int mSunriseHour;
    private int mSunsetHour;
    private int mSunsetMinute;
    private int mSunsetSecond;
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

    public BleWeather2() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        int r9 = 0;
        int r10 = 0;
        int r11 = 0;
        int r12 = 0;
        int r13 = 0;
        int r14 = 0;
        int r15 = 0;
        int r16 = 0;
        int r17 = 0;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, 131071, null);
    }

    public static /* synthetic */ BleWeather2 copy$default(BleWeather2 r17, int r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26, int r27, int r28, int r29, int r30, int r31, int r32, int r33, int r34, int r35, Object r36) {
        if ((r35 & 1) == 0) goto L5;
        int r2 = r17.mCurrentTemperature;
    L7:
        if ((r35 & 2) == 0) goto L9;
        int r3 = r17.mMaxTemperature;
    L11:
        if ((r35 & 4) == 0) goto L13;
        int r4 = r17.mMinTemperature;
    L15:
        if ((r35 & 8) == 0) goto L17;
        int r5 = r17.mWeatherCode;
    L19:
        if ((r35 & 16) == 0) goto L21;
        int r6 = r17.mWindSpeed;
    L23:
        if ((r35 & 32) == 0) goto L25;
        int r7 = r17.mHumidity;
    L27:
        if ((r35 & 64) == 0) goto L29;
        int r8 = r17.mVisibility;
    L31:
        if ((r35 & 128) == 0) goto L33;
        int r9 = r17.mUltraVioletIntensity;
    L35:
        if ((r35 & 256) == 0) goto L37;
        int r10 = r17.mPrecipitation;
    L39:
        if ((r35 & 512) == 0) goto L41;
        int r11 = r17.mSunriseHour;
    L43:
        if ((r35 & 1024) == 0) goto L45;
        int r12 = r17.mSunrisMinute;
    L47:
        if ((r35 & 2048) == 0) goto L49;
        int r13 = r17.mSunrisSecond;
    L51:
        if ((r35 & 4096) == 0) goto L53;
        int r14 = r17.mSunsetHour;
    L55:
        if ((r35 & 8192) == 0) goto L57;
        int r15 = r17.mSunsetMinute;
    L58:
        int r110 = r2;
        if ((r35 & 16384) == 0) goto L61;
        int r16 = r17.mSunsetSecond;
    L63:
        if ((r35 & 32768) == 0) goto L65;
        int r1 = r17.mAltitude;
    L67:
        if ((r35 & 65536) == 0) goto L69;
        int r111 = r1;
        int r37 = r111;
        int r38 = r17.mAQI;
    L71:
        return r17.copy(r110, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r37, r38);
    L69:
        r38 = r34;
        r37 = r1;
        goto L71
    L65:
        r1 = r33;
        goto L67
    L61:
        r16 = r32;
        goto L63
    L57:
        r15 = r31;
        goto L58
    L53:
        r14 = r30;
        goto L55
    L49:
        r13 = r29;
        goto L51
    L45:
        r12 = r28;
        goto L47
    L41:
        r11 = r27;
        goto L43
    L37:
        r10 = r26;
        goto L39
    L33:
        r9 = r25;
        goto L35
    L29:
        r8 = r24;
        goto L31
    L25:
        r7 = r23;
        goto L27
    L21:
        r6 = r22;
        goto L23
    L17:
        r5 = r21;
        goto L19
    L13:
        r4 = r20;
        goto L15
    L9:
        r3 = r19;
        goto L11
    L5:
        r2 = r18;
        goto L7
    }

    @Deprecated(message = "海拔已废弃")
    public static /* synthetic */ void getMAltitude$annotations() {
    }

    public final int component1() {
        return this.mCurrentTemperature;
    }

    public final int component10() {
        return this.mSunriseHour;
    }

    public final int component11() {
        return this.mSunrisMinute;
    }

    public final int component12() {
        return this.mSunrisSecond;
    }

    public final int component13() {
        return this.mSunsetHour;
    }

    public final int component14() {
        return this.mSunsetMinute;
    }

    public final int component15() {
        return this.mSunsetSecond;
    }

    public final int component16() {
        return this.mAltitude;
    }

    public final int component17() {
        return this.mAQI;
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
    public final BleWeather2 copy(int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26, int r27, int r28, int r29, int r30, int r31, int r32, int r33, int r34, int r35) {
        return new BleWeather2(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mCurrentTemperature = readInt8();
        this.mMaxTemperature = readInt8();
        this.mMinTemperature = readInt8();
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mWeatherCode = readInt16(r0);
        this.mWindSpeed = readInt8();
        this.mHumidity = readInt8();
        this.mVisibility = readInt8();
        this.mUltraVioletIntensity = readInt8();
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mPrecipitation = readInt16(r0);
        this.mSunriseHour = readInt8();
        this.mSunrisMinute = readInt8();
        this.mSunrisSecond = readInt8();
        this.mSunsetHour = readInt8();
        this.mSunsetMinute = readInt8();
        this.mSunsetSecond = readInt8();
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mAQI = readInt16(r0);
        readInt8();
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
        writeInt8(this.mWindSpeed);
        writeInt8(this.mHumidity);
        writeInt8(this.mVisibility);
        writeInt8(this.mUltraVioletIntensity);
        int r2 = this.mPrecipitation;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt16(r2, r1);
        writeInt8(this.mSunriseHour);
        writeInt8(this.mSunrisMinute);
        writeInt8(this.mSunrisSecond);
        writeInt8(this.mSunsetHour);
        writeInt8(this.mSunsetMinute);
        writeInt8(this.mSunsetSecond);
        int r3 = this.mAQI;
        if (r3 == 0) goto L5;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt16(r3, r1);
    L6:
        writeInt8(0);
        return;
    L5:
        int r4 = this.mAltitude;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt16(r4, r1);
        goto L6
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleWeather2) == true) goto L8;
        return false;
    L8:
        BleWeather2 r6 = (BleWeather2) r5;
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
        if (this.mPrecipitation == r6.mPrecipitation) goto L36;
        return false;
    L36:
        if (this.mSunriseHour == r6.mSunriseHour) goto L39;
        return false;
    L39:
        if (this.mSunrisMinute == r6.mSunrisMinute) goto L42;
        return false;
    L42:
        if (this.mSunrisSecond == r6.mSunrisSecond) goto L45;
        return false;
    L45:
        if (this.mSunsetHour == r6.mSunsetHour) goto L48;
        return false;
    L48:
        if (this.mSunsetMinute == r6.mSunsetMinute) goto L51;
        return false;
    L51:
        if (this.mSunsetSecond == r6.mSunsetSecond) goto L54;
        return false;
    L54:
        if (this.mAltitude == r6.mAltitude) goto L57;
        return false;
    L57:
        if (this.mAQI == r6.mAQI) goto L59;
        return false;
    L59:
        return true;
    }

    public final int getMAQI() {
        return this.mAQI;
    }

    public final int getMAltitude() {
        return this.mAltitude;
    }

    public final int getMCurrentTemperature() {
        return this.mCurrentTemperature;
    }

    public final int getMHumidity() {
        return this.mHumidity;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 20;
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

    public final int getMSunrisMinute() {
        return this.mSunrisMinute;
    }

    public final int getMSunrisSecond() {
        return this.mSunrisSecond;
    }

    public final int getMSunriseHour() {
        return this.mSunriseHour;
    }

    public final int getMSunsetHour() {
        return this.mSunsetHour;
    }

    public final int getMSunsetMinute() {
        return this.mSunsetMinute;
    }

    public final int getMSunsetSecond() {
        return this.mSunsetSecond;
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
        return (((((((((((((((((((((((((((((((Integer.hashCode(this.mCurrentTemperature) * 31) + Integer.hashCode(this.mMaxTemperature)) * 31) + Integer.hashCode(this.mMinTemperature)) * 31) + Integer.hashCode(this.mWeatherCode)) * 31) + Integer.hashCode(this.mWindSpeed)) * 31) + Integer.hashCode(this.mHumidity)) * 31) + Integer.hashCode(this.mVisibility)) * 31) + Integer.hashCode(this.mUltraVioletIntensity)) * 31) + Integer.hashCode(this.mPrecipitation)) * 31) + Integer.hashCode(this.mSunriseHour)) * 31) + Integer.hashCode(this.mSunrisMinute)) * 31) + Integer.hashCode(this.mSunrisSecond)) * 31) + Integer.hashCode(this.mSunsetHour)) * 31) + Integer.hashCode(this.mSunsetMinute)) * 31) + Integer.hashCode(this.mSunsetSecond)) * 31) + Integer.hashCode(this.mAltitude)) * 31) + Integer.hashCode(this.mAQI);
    }

    public final void setMAQI(int r1) {
        this.mAQI = r1;
    }

    public final void setMAltitude(int r1) {
        this.mAltitude = r1;
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

    public final void setMSunrisMinute(int r1) {
        this.mSunrisMinute = r1;
    }

    public final void setMSunrisSecond(int r1) {
        this.mSunrisSecond = r1;
    }

    public final void setMSunriseHour(int r1) {
        this.mSunriseHour = r1;
    }

    public final void setMSunsetHour(int r1) {
        this.mSunsetHour = r1;
    }

    public final void setMSunsetMinute(int r1) {
        this.mSunsetMinute = r1;
    }

    public final void setMSunsetSecond(int r1) {
        this.mSunsetSecond = r1;
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
        return "BleWeather(mCurrentTemperature=" + this.mCurrentTemperature + ", mMaxTemperature=" + this.mMaxTemperature + ", mMinTemperature=" + this.mMinTemperature + ", mWeatherCode=" + this.mWeatherCode + ", mWindSpeed=" + this.mWindSpeed + ", mHumidity=" + this.mHumidity + ", mVisibility=" + this.mVisibility + ", mUltraVioletIntensity=" + this.mUltraVioletIntensity + ", mPrecipitation=" + this.mPrecipitation + ", mSunriseHour=" + this.mSunriseHour + ", mSunrisMinute=" + this.mSunrisMinute + ", mSunrisSecond=" + this.mSunrisSecond + ", mSunsetHour=" + this.mSunsetHour + ", mSunsetMinute=" + this.mSunsetMinute + ", mSunsetSecond=" + this.mSunsetSecond + ", mAQI=" + this.mAQI + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleWeather2(int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15, int r16, int r17) {
        this.mCurrentTemperature = r1;
        this.mMaxTemperature = r2;
        this.mMinTemperature = r3;
        this.mWeatherCode = r4;
        this.mWindSpeed = r5;
        this.mHumidity = r6;
        this.mVisibility = r7;
        this.mUltraVioletIntensity = r8;
        this.mPrecipitation = r9;
        this.mSunriseHour = r10;
        this.mSunrisMinute = r11;
        this.mSunrisSecond = r12;
        this.mSunsetHour = r13;
        this.mSunsetMinute = r14;
        this.mSunsetSecond = r15;
        this.mAltitude = r16;
        this.mAQI = r17;
    }

    public /* synthetic */ BleWeather2(int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26, int r27, int r28, int r29, int r30, int r31, int r32, int r33, int r34, int r35, int r36, DefaultConstructorMarker r37) {
        if ((r36 & 1) == 0) goto L5;
        int r1 = 0;
    L7:
        if ((r36 & 2) == 0) goto L9;
        int r3 = 0;
    L11:
        if ((r36 & 4) == 0) goto L13;
        int r4 = 0;
    L15:
        if ((r36 & 8) == 0) goto L17;
        int r5 = 0;
    L19:
        if ((r36 & 16) == 0) goto L21;
        int r6 = 0;
    L23:
        if ((r36 & 32) == 0) goto L25;
        int r7 = 0;
    L27:
        if ((r36 & 64) == 0) goto L29;
        int r8 = 0;
    L31:
        if ((r36 & 128) == 0) goto L33;
        int r9 = 0;
    L35:
        if ((r36 & 256) == 0) goto L37;
        int r10 = 0;
    L39:
        if ((r36 & 512) == 0) goto L41;
        int r11 = 0;
    L43:
        if ((r36 & 1024) == 0) goto L45;
        int r12 = 0;
    L47:
        if ((r36 & 2048) == 0) goto L49;
        int r13 = 0;
    L51:
        if ((r36 & 4096) == 0) goto L53;
        int r14 = 0;
    L55:
        if ((r36 & 8192) == 0) goto L57;
        int r15 = 0;
    L59:
        if ((r36 & 16384) == 0) goto L61;
        int r2 = 0;
    L63:
        if ((r36 & 32768) == 0) goto L65;
        int r16 = 0;
    L67:
        if ((r36 & 65536) == 0) goto L70;
        int r38 = 0;
    L71:
        this(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r2, r16, r38);
        return;
    L70:
        r38 = r35;
        goto L71
    L65:
        r16 = r34;
        goto L67
    L61:
        r2 = r33;
        goto L63
    L57:
        r15 = r32;
        goto L59
    L53:
        r14 = r31;
        goto L55
    L49:
        r13 = r30;
        goto L51
    L45:
        r12 = r29;
        goto L47
    L41:
        r11 = r28;
        goto L43
    L37:
        r10 = r27;
        goto L39
    L33:
        r9 = r26;
        goto L35
    L29:
        r8 = r25;
        goto L31
    L25:
        r7 = r24;
        goto L27
    L21:
        r6 = r23;
        goto L23
    L17:
        r5 = r22;
        goto L19
    L13:
        r4 = r21;
        goto L15
    L9:
        r3 = r20;
        goto L11
    L5:
        r1 = r19;
        goto L7
    }
}
