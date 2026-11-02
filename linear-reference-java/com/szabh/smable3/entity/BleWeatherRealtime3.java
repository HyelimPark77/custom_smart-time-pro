package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleWeatherRealtime3 extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 390;
    public static final int NAME_LENGTH = 66;
    public static final int RESERVE_LENGTH = 66;
    public static final int TIDE_NAME_LENGTH = 66;
    public static final int WEATHER_NAME = 66;

    @aa1
    private String mCityName;

    @aa1
    private String mTideName;
    private int mTime;

    @tb1
    private BleWeather3 mWeather;

    @aa1
    private String mWeatherInfoName;

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

    public BleWeatherRealtime3() {
        int r1 = 0;
        String r2 = null;
        BleWeather3 r3 = null;
        String r4 = null;
        String r5 = null;
        this(r1, r2, r3, r4, r5, 31, null);
    }

    public static /* synthetic */ BleWeatherRealtime3 copy$default(BleWeatherRealtime3 r0, int r1, String r2, BleWeather3 r3, String r4, String r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r0.mTime;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r0.mCityName;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = r0.mWeather;
    L12:
        if ((r6 & 8) == 0) goto L15;
        r4 = r0.mTideName;
    L15:
        if ((r6 & 16) == 0) goto L17;
        r5 = r0.mWeatherInfoName;
    L17:
        String r8 = r4;
        String r9 = r5;
        BleWeather3 r10 = r3;
        int r11 = r1;
        return r0.copy(r11, r2, r10, r8, r9);
    }

    public final int component1() {
        return this.mTime;
    }

    @aa1
    public final String component2() {
        return this.mCityName;
    }

    @tb1
    public final BleWeather3 component3() {
        return this.mWeather;
    }

    @aa1
    public final String component4() {
        return this.mTideName;
    }

    @aa1
    public final String component5() {
        return this.mWeatherInfoName;
    }

    @aa1
    public final BleWeatherRealtime3 copy(int r8, @aa1 String r9, @tb1 BleWeather3 r10, @aa1 String r11, @aa1 String r12) {
        Intrinsics.X0O(r9, "mCityName");
        Intrinsics.X0O(r11, "mTideName");
        Intrinsics.X0O(r12, "mWeatherInfoName");
        return new BleWeatherRealtime3(r8, r9, r10, r11, r12);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeObject(BleTime.Companion.ofLocal(((long) this.mTime) * 1000));
        BleWritable.writeStringWithFix$default(this, this.mCityName, 66, null, 4, null);
        writeObject(this.mWeather);
        BleWritable.writeStringWithFix$default(this, this.mTideName, 66, null, 4, null);
        BleWritable.writeStringWithFix$default(this, this.mWeatherInfoName, 66, null, 4, null);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleWeatherRealtime3) == true) goto L8;
        return false;
    L8:
        BleWeatherRealtime3 r6 = (BleWeatherRealtime3) r5;
        if (this.mTime == r6.mTime) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.mCityName, r6.mCityName) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.mWeather, r6.mWeather) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.mTideName, r6.mTideName) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.mWeatherInfoName, r6.mWeatherInfoName) == true) goto L23;
        return false;
    L23:
        return true;
    }

    @aa1
    public final String getMCityName() {
        return this.mCityName;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return ITEM_LENGTH;
    }

    @aa1
    public final String getMTideName() {
        return this.mTideName;
    }

    public final int getMTime() {
        return this.mTime;
    }

    @tb1
    public final BleWeather3 getMWeather() {
        return this.mWeather;
    }

    @aa1
    public final String getMWeatherInfoName() {
        return this.mWeatherInfoName;
    }

    public int hashCode() {
        int r0 = ((Integer.hashCode(this.mTime) * 31) + this.mCityName.hashCode()) * 31;
        BleWeather3 r1 = this.mWeather;
        if (r1 != null) goto L5;
        int r2 = 0;
    L7:
        return ((((r0 + r2) * 31) + this.mTideName.hashCode()) * 31) + this.mWeatherInfoName.hashCode();
    L5:
        r2 = r1.hashCode();
        goto L7
    }

    public final void setMCityName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mCityName = r2;
    }

    public final void setMTideName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mTideName = r2;
    }

    public final void setMTime(int r1) {
        this.mTime = r1;
    }

    public final void setMWeather(@tb1 BleWeather3 r1) {
        this.mWeather = r1;
    }

    public final void setMWeatherInfoName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mWeatherInfoName = r2;
    }

    @aa1
    public String toString() {
        return "BleWeatherRealtime3(mTime =" + this.mTime + " , mCityName = " + this.mCityName + ", mTideName = " + this.mTideName + " , mWeather = " + this.mWeather + ", mWeatherInfoName = " + this.mWeatherInfoName + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleWeatherRealtime3(int r2, @aa1 String r3, @tb1 BleWeather3 r4, @aa1 String r5, @aa1 String r6) {
        Intrinsics.X0O(r3, "mCityName");
        Intrinsics.X0O(r5, "mTideName");
        Intrinsics.X0O(r6, "mWeatherInfoName");
        this.mTime = r2;
        this.mCityName = r3;
        this.mWeather = r4;
        this.mTideName = r5;
        this.mWeatherInfoName = r6;
    }

    public /* synthetic */ BleWeatherRealtime3(int r2, String r3, BleWeather3 r4, String r5, String r6, int r7, DefaultConstructorMarker r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r7 & 16) == 0) goto L17;
        String r9 = "";
    L18:
        this(r2, r3, r4, r5, r9);
        return;
    L17:
        r9 = r6;
        goto L18
    }
}
