package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleWeatherForecast3 extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 912;
    public static final int NAME_LENGTH = 66;

    @aa1
    private String mCityName;
    private int mTime;

    @tb1
    private BleWeather3 mWeather1;

    @tb1
    private BleWeather3 mWeather2;

    @tb1
    private BleWeather3 mWeather3;

    @tb1
    private BleWeather3 mWeather4;

    @tb1
    private BleWeather3 mWeather5;

    @tb1
    private BleWeather3 mWeather6;

    @tb1
    private BleWeather3 mWeather7;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleWeatherForecast3() {
        this(0, null, null, null, null, null, null, null, null, 511, null);
    }

    public static /* synthetic */ BleWeatherForecast3 copy$default(BleWeatherForecast3 bleWeatherForecast3, int i, String str, BleWeather3 bleWeather3, BleWeather3 bleWeather4, BleWeather3 bleWeather5, BleWeather3 bleWeather6, BleWeather3 bleWeather7, BleWeather3 bleWeather8, BleWeather3 bleWeather9, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bleWeatherForecast3.mTime;
        }
        if ((i2 & 2) != 0) {
            str = bleWeatherForecast3.mCityName;
        }
        if ((i2 & 4) != 0) {
            bleWeather3 = bleWeatherForecast3.mWeather1;
        }
        if ((i2 & 8) != 0) {
            bleWeather4 = bleWeatherForecast3.mWeather2;
        }
        if ((i2 & 16) != 0) {
            bleWeather5 = bleWeatherForecast3.mWeather3;
        }
        if ((i2 & 32) != 0) {
            bleWeather6 = bleWeatherForecast3.mWeather4;
        }
        if ((i2 & 64) != 0) {
            bleWeather7 = bleWeatherForecast3.mWeather5;
        }
        if ((i2 & 128) != 0) {
            bleWeather8 = bleWeatherForecast3.mWeather6;
        }
        if ((i2 & 256) != 0) {
            bleWeather9 = bleWeatherForecast3.mWeather7;
        }
        BleWeather3 bleWeather10 = bleWeather8;
        BleWeather3 bleWeather11 = bleWeather9;
        BleWeather3 bleWeather12 = bleWeather6;
        BleWeather3 bleWeather13 = bleWeather7;
        BleWeather3 bleWeather14 = bleWeather5;
        BleWeather3 bleWeather15 = bleWeather3;
        return bleWeatherForecast3.copy(i, str, bleWeather15, bleWeather4, bleWeather14, bleWeather12, bleWeather13, bleWeather10, bleWeather11);
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
        return this.mWeather1;
    }

    @tb1
    public final BleWeather3 component4() {
        return this.mWeather2;
    }

    @tb1
    public final BleWeather3 component5() {
        return this.mWeather3;
    }

    @tb1
    public final BleWeather3 component6() {
        return this.mWeather4;
    }

    @tb1
    public final BleWeather3 component7() {
        return this.mWeather5;
    }

    @tb1
    public final BleWeather3 component8() {
        return this.mWeather6;
    }

    @tb1
    public final BleWeather3 component9() {
        return this.mWeather7;
    }

    @aa1
    public final BleWeatherForecast3 copy(int i, @aa1 String mCityName, @tb1 BleWeather3 bleWeather3, @tb1 BleWeather3 bleWeather4, @tb1 BleWeather3 bleWeather5, @tb1 BleWeather3 bleWeather6, @tb1 BleWeather3 bleWeather7, @tb1 BleWeather3 bleWeather8, @tb1 BleWeather3 bleWeather9) {
        Intrinsics.X0O(mCityName, "mCityName");
        return new BleWeatherForecast3(i, mCityName, bleWeather3, bleWeather4, bleWeather5, bleWeather6, bleWeather7, bleWeather8, bleWeather9);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeObject(BleTime.Companion.ofLocal(((long) this.mTime) * 1000));
        BleWritable.writeStringWithFix$default(this, this.mCityName, 66, null, 4, null);
        writeObject(this.mWeather1);
        writeObject(this.mWeather2);
        writeObject(this.mWeather3);
        writeObject(this.mWeather4);
        writeObject(this.mWeather5);
        writeObject(this.mWeather6);
        writeObject(this.mWeather7);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleWeatherForecast3)) {
            return false;
        }
        BleWeatherForecast3 bleWeatherForecast3 = (BleWeatherForecast3) obj;
        return this.mTime == bleWeatherForecast3.mTime && Intrinsics.XOO0ii0(this.mCityName, bleWeatherForecast3.mCityName) && Intrinsics.XOO0ii0(this.mWeather1, bleWeatherForecast3.mWeather1) && Intrinsics.XOO0ii0(this.mWeather2, bleWeatherForecast3.mWeather2) && Intrinsics.XOO0ii0(this.mWeather3, bleWeatherForecast3.mWeather3) && Intrinsics.XOO0ii0(this.mWeather4, bleWeatherForecast3.mWeather4) && Intrinsics.XOO0ii0(this.mWeather5, bleWeatherForecast3.mWeather5) && Intrinsics.XOO0ii0(this.mWeather6, bleWeatherForecast3.mWeather6) && Intrinsics.XOO0ii0(this.mWeather7, bleWeatherForecast3.mWeather7);
    }

    @aa1
    public final String getMCityName() {
        return this.mCityName;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return ITEM_LENGTH;
    }

    public final int getMTime() {
        return this.mTime;
    }

    @tb1
    public final BleWeather3 getMWeather1() {
        return this.mWeather1;
    }

    @tb1
    public final BleWeather3 getMWeather2() {
        return this.mWeather2;
    }

    @tb1
    public final BleWeather3 getMWeather3() {
        return this.mWeather3;
    }

    @tb1
    public final BleWeather3 getMWeather4() {
        return this.mWeather4;
    }

    @tb1
    public final BleWeather3 getMWeather5() {
        return this.mWeather5;
    }

    @tb1
    public final BleWeather3 getMWeather6() {
        return this.mWeather6;
    }

    @tb1
    public final BleWeather3 getMWeather7() {
        return this.mWeather7;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.mTime) * 31) + this.mCityName.hashCode()) * 31;
        BleWeather3 bleWeather3 = this.mWeather1;
        int iHashCode2 = (iHashCode + (bleWeather3 == null ? 0 : bleWeather3.hashCode())) * 31;
        BleWeather3 bleWeather4 = this.mWeather2;
        int iHashCode3 = (iHashCode2 + (bleWeather4 == null ? 0 : bleWeather4.hashCode())) * 31;
        BleWeather3 bleWeather5 = this.mWeather3;
        int iHashCode4 = (iHashCode3 + (bleWeather5 == null ? 0 : bleWeather5.hashCode())) * 31;
        BleWeather3 bleWeather6 = this.mWeather4;
        int iHashCode5 = (iHashCode4 + (bleWeather6 == null ? 0 : bleWeather6.hashCode())) * 31;
        BleWeather3 bleWeather7 = this.mWeather5;
        int iHashCode6 = (iHashCode5 + (bleWeather7 == null ? 0 : bleWeather7.hashCode())) * 31;
        BleWeather3 bleWeather8 = this.mWeather6;
        int iHashCode7 = (iHashCode6 + (bleWeather8 == null ? 0 : bleWeather8.hashCode())) * 31;
        BleWeather3 bleWeather9 = this.mWeather7;
        return iHashCode7 + (bleWeather9 != null ? bleWeather9.hashCode() : 0);
    }

    public final void setMCityName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mCityName = str;
    }

    public final void setMTime(int i) {
        this.mTime = i;
    }

    public final void setMWeather1(@tb1 BleWeather3 bleWeather3) {
        this.mWeather1 = bleWeather3;
    }

    public final void setMWeather2(@tb1 BleWeather3 bleWeather3) {
        this.mWeather2 = bleWeather3;
    }

    public final void setMWeather3(@tb1 BleWeather3 bleWeather3) {
        this.mWeather3 = bleWeather3;
    }

    public final void setMWeather4(@tb1 BleWeather3 bleWeather3) {
        this.mWeather4 = bleWeather3;
    }

    public final void setMWeather5(@tb1 BleWeather3 bleWeather3) {
        this.mWeather5 = bleWeather3;
    }

    public final void setMWeather6(@tb1 BleWeather3 bleWeather3) {
        this.mWeather6 = bleWeather3;
    }

    public final void setMWeather7(@tb1 BleWeather3 bleWeather3) {
        this.mWeather7 = bleWeather3;
    }

    @aa1
    public String toString() {
        return "BleWeatherForecast3()";
    }

    public BleWeatherForecast3(int i, @aa1 String mCityName, @tb1 BleWeather3 bleWeather3, @tb1 BleWeather3 bleWeather4, @tb1 BleWeather3 bleWeather5, @tb1 BleWeather3 bleWeather6, @tb1 BleWeather3 bleWeather7, @tb1 BleWeather3 bleWeather8, @tb1 BleWeather3 bleWeather9) {
        Intrinsics.X0O(mCityName, "mCityName");
        this.mTime = i;
        this.mCityName = mCityName;
        this.mWeather1 = bleWeather3;
        this.mWeather2 = bleWeather4;
        this.mWeather3 = bleWeather5;
        this.mWeather4 = bleWeather6;
        this.mWeather5 = bleWeather7;
        this.mWeather6 = bleWeather8;
        this.mWeather7 = bleWeather9;
    }

    public /* synthetic */ BleWeatherForecast3(int i, String str, BleWeather3 bleWeather3, BleWeather3 bleWeather4, BleWeather3 bleWeather5, BleWeather3 bleWeather6, BleWeather3 bleWeather7, BleWeather3 bleWeather8, BleWeather3 bleWeather9, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : bleWeather3, (i2 & 8) != 0 ? null : bleWeather4, (i2 & 16) != 0 ? null : bleWeather5, (i2 & 32) != 0 ? null : bleWeather6, (i2 & 64) != 0 ? null : bleWeather7, (i2 & 128) != 0 ? null : bleWeather8, (i2 & 256) != 0 ? null : bleWeather9);
    }
}
