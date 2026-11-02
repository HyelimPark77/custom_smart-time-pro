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
    public static final Companion Companion = new Companion(null);
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
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleWeatherRealtime3() {
        this(0, null, null, null, null, 31, null);
    }

    public static /* synthetic */ BleWeatherRealtime3 copy$default(BleWeatherRealtime3 bleWeatherRealtime3, int i, String str, BleWeather3 bleWeather3, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bleWeatherRealtime3.mTime;
        }
        if ((i2 & 2) != 0) {
            str = bleWeatherRealtime3.mCityName;
        }
        if ((i2 & 4) != 0) {
            bleWeather3 = bleWeatherRealtime3.mWeather;
        }
        if ((i2 & 8) != 0) {
            str2 = bleWeatherRealtime3.mTideName;
        }
        if ((i2 & 16) != 0) {
            str3 = bleWeatherRealtime3.mWeatherInfoName;
        }
        String str4 = str3;
        BleWeather3 bleWeather4 = bleWeather3;
        return bleWeatherRealtime3.copy(i, str, bleWeather4, str2, str4);
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
    public final BleWeatherRealtime3 copy(int i, @aa1 String mCityName, @tb1 BleWeather3 bleWeather3, @aa1 String mTideName, @aa1 String mWeatherInfoName) {
        Intrinsics.X0O(mCityName, "mCityName");
        Intrinsics.X0O(mTideName, "mTideName");
        Intrinsics.X0O(mWeatherInfoName, "mWeatherInfoName");
        return new BleWeatherRealtime3(i, mCityName, bleWeather3, mTideName, mWeatherInfoName);
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

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleWeatherRealtime3)) {
            return false;
        }
        BleWeatherRealtime3 bleWeatherRealtime3 = (BleWeatherRealtime3) obj;
        return this.mTime == bleWeatherRealtime3.mTime && Intrinsics.XOO0ii0(this.mCityName, bleWeatherRealtime3.mCityName) && Intrinsics.XOO0ii0(this.mWeather, bleWeatherRealtime3.mWeather) && Intrinsics.XOO0ii0(this.mTideName, bleWeatherRealtime3.mTideName) && Intrinsics.XOO0ii0(this.mWeatherInfoName, bleWeatherRealtime3.mWeatherInfoName);
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
        int iHashCode = ((Integer.hashCode(this.mTime) * 31) + this.mCityName.hashCode()) * 31;
        BleWeather3 bleWeather3 = this.mWeather;
        return ((((iHashCode + (bleWeather3 == null ? 0 : bleWeather3.hashCode())) * 31) + this.mTideName.hashCode()) * 31) + this.mWeatherInfoName.hashCode();
    }

    public final void setMCityName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mCityName = str;
    }

    public final void setMTideName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mTideName = str;
    }

    public final void setMTime(int i) {
        this.mTime = i;
    }

    public final void setMWeather(@tb1 BleWeather3 bleWeather3) {
        this.mWeather = bleWeather3;
    }

    public final void setMWeatherInfoName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mWeatherInfoName = str;
    }

    @aa1
    public String toString() {
        return "BleWeatherRealtime3(mTime =" + this.mTime + " , mCityName = " + this.mCityName + ", mTideName = " + this.mTideName + " , mWeather = " + this.mWeather + ", mWeatherInfoName = " + this.mWeatherInfoName + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleWeatherRealtime3(int i, @aa1 String mCityName, @tb1 BleWeather3 bleWeather3, @aa1 String mTideName, @aa1 String mWeatherInfoName) {
        Intrinsics.X0O(mCityName, "mCityName");
        Intrinsics.X0O(mTideName, "mTideName");
        Intrinsics.X0O(mWeatherInfoName, "mWeatherInfoName");
        this.mTime = i;
        this.mCityName = mCityName;
        this.mWeather = bleWeather3;
        this.mTideName = mTideName;
        this.mWeatherInfoName = mWeatherInfoName;
    }

    public /* synthetic */ BleWeatherRealtime3(int i, String str, BleWeather3 bleWeather3, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : bleWeather3, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? "" : str3);
    }
}
