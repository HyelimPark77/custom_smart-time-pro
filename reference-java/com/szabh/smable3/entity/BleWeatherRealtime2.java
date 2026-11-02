package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleWeatherRealtime2 extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 92;
    public static final int NAME_LENGTH = 66;

    @aa1
    private String mCityName;
    private int mTime;

    @tb1
    private BleWeather2 mWeather;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleWeatherRealtime2() {
        this(0, null, null, 7, null);
    }

    public static /* synthetic */ BleWeatherRealtime2 copy$default(BleWeatherRealtime2 bleWeatherRealtime2, int i, String str, BleWeather2 bleWeather2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bleWeatherRealtime2.mTime;
        }
        if ((i2 & 2) != 0) {
            str = bleWeatherRealtime2.mCityName;
        }
        if ((i2 & 4) != 0) {
            bleWeather2 = bleWeatherRealtime2.mWeather;
        }
        return bleWeatherRealtime2.copy(i, str, bleWeather2);
    }

    public final int component1() {
        return this.mTime;
    }

    @aa1
    public final String component2() {
        return this.mCityName;
    }

    @tb1
    public final BleWeather2 component3() {
        return this.mWeather;
    }

    @aa1
    public final BleWeatherRealtime2 copy(int i, @aa1 String mCityName, @tb1 BleWeather2 bleWeather2) {
        Intrinsics.X0O(mCityName, "mCityName");
        return new BleWeatherRealtime2(i, mCityName, bleWeather2);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeObject(BleTime.Companion.ofLocal(((long) this.mTime) * 1000));
        BleWritable.writeStringWithFix$default(this, this.mCityName, 66, null, 4, null);
        writeObject(this.mWeather);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleWeatherRealtime2)) {
            return false;
        }
        BleWeatherRealtime2 bleWeatherRealtime2 = (BleWeatherRealtime2) obj;
        return this.mTime == bleWeatherRealtime2.mTime && Intrinsics.XOO0ii0(this.mCityName, bleWeatherRealtime2.mCityName) && Intrinsics.XOO0ii0(this.mWeather, bleWeatherRealtime2.mWeather);
    }

    @aa1
    public final String getMCityName() {
        return this.mCityName;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 92;
    }

    public final int getMTime() {
        return this.mTime;
    }

    @tb1
    public final BleWeather2 getMWeather() {
        return this.mWeather;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.mTime) * 31) + this.mCityName.hashCode()) * 31;
        BleWeather2 bleWeather2 = this.mWeather;
        return iHashCode + (bleWeather2 == null ? 0 : bleWeather2.hashCode());
    }

    public final void setMCityName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mCityName = str;
    }

    public final void setMTime(int i) {
        this.mTime = i;
    }

    public final void setMWeather(@tb1 BleWeather2 bleWeather2) {
        this.mWeather = bleWeather2;
    }

    @aa1
    public String toString() {
        return "BleWeatherRealtime2(mTime=" + BleTime.Companion.ofLocal(((long) this.mTime) * 1000) + ", mCityName=" + this.mCityName + ", mWeather=" + this.mWeather + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleWeatherRealtime2(int i, @aa1 String mCityName, @tb1 BleWeather2 bleWeather2) {
        Intrinsics.X0O(mCityName, "mCityName");
        this.mTime = i;
        this.mCityName = mCityName;
        this.mWeather = bleWeather2;
    }

    public /* synthetic */ BleWeatherRealtime2(int i, String str, BleWeather2 bleWeather2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : bleWeather2);
    }
}
