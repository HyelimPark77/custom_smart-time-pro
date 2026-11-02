package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleWeatherForecast2 extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 212;
    public static final int NAME_LENGTH = 66;

    @aa1
    private String mCityName;
    private int mTime;

    @tb1
    private BleWeather2 mWeather1;

    @tb1
    private BleWeather2 mWeather2;

    @tb1
    private BleWeather2 mWeather3;

    @tb1
    private BleWeather2 mWeather4;

    @tb1
    private BleWeather2 mWeather5;

    @tb1
    private BleWeather2 mWeather6;

    @tb1
    private BleWeather2 mWeather7;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleWeatherForecast2() {
        this(0, null, null, null, null, null, null, null, null, 511, null);
    }

    public static /* synthetic */ BleWeatherForecast2 copy$default(BleWeatherForecast2 bleWeatherForecast2, int i, String str, BleWeather2 bleWeather2, BleWeather2 bleWeather3, BleWeather2 bleWeather4, BleWeather2 bleWeather5, BleWeather2 bleWeather6, BleWeather2 bleWeather7, BleWeather2 bleWeather8, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bleWeatherForecast2.mTime;
        }
        if ((i2 & 2) != 0) {
            str = bleWeatherForecast2.mCityName;
        }
        if ((i2 & 4) != 0) {
            bleWeather2 = bleWeatherForecast2.mWeather1;
        }
        if ((i2 & 8) != 0) {
            bleWeather3 = bleWeatherForecast2.mWeather2;
        }
        if ((i2 & 16) != 0) {
            bleWeather4 = bleWeatherForecast2.mWeather3;
        }
        if ((i2 & 32) != 0) {
            bleWeather5 = bleWeatherForecast2.mWeather4;
        }
        if ((i2 & 64) != 0) {
            bleWeather6 = bleWeatherForecast2.mWeather5;
        }
        if ((i2 & 128) != 0) {
            bleWeather7 = bleWeatherForecast2.mWeather6;
        }
        if ((i2 & 256) != 0) {
            bleWeather8 = bleWeatherForecast2.mWeather7;
        }
        BleWeather2 bleWeather9 = bleWeather7;
        BleWeather2 bleWeather10 = bleWeather8;
        BleWeather2 bleWeather11 = bleWeather5;
        BleWeather2 bleWeather12 = bleWeather6;
        BleWeather2 bleWeather13 = bleWeather4;
        BleWeather2 bleWeather14 = bleWeather2;
        return bleWeatherForecast2.copy(i, str, bleWeather14, bleWeather3, bleWeather13, bleWeather11, bleWeather12, bleWeather9, bleWeather10);
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
        return this.mWeather1;
    }

    @tb1
    public final BleWeather2 component4() {
        return this.mWeather2;
    }

    @tb1
    public final BleWeather2 component5() {
        return this.mWeather3;
    }

    @tb1
    public final BleWeather2 component6() {
        return this.mWeather4;
    }

    @tb1
    public final BleWeather2 component7() {
        return this.mWeather5;
    }

    @tb1
    public final BleWeather2 component8() {
        return this.mWeather6;
    }

    @tb1
    public final BleWeather2 component9() {
        return this.mWeather7;
    }

    @aa1
    public final BleWeatherForecast2 copy(int i, @aa1 String mCityName, @tb1 BleWeather2 bleWeather2, @tb1 BleWeather2 bleWeather3, @tb1 BleWeather2 bleWeather4, @tb1 BleWeather2 bleWeather5, @tb1 BleWeather2 bleWeather6, @tb1 BleWeather2 bleWeather7, @tb1 BleWeather2 bleWeather8) {
        Intrinsics.X0O(mCityName, "mCityName");
        return new BleWeatherForecast2(i, mCityName, bleWeather2, bleWeather3, bleWeather4, bleWeather5, bleWeather6, bleWeather7, bleWeather8);
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
        if (!(obj instanceof BleWeatherForecast2)) {
            return false;
        }
        BleWeatherForecast2 bleWeatherForecast2 = (BleWeatherForecast2) obj;
        return this.mTime == bleWeatherForecast2.mTime && Intrinsics.XOO0ii0(this.mCityName, bleWeatherForecast2.mCityName) && Intrinsics.XOO0ii0(this.mWeather1, bleWeatherForecast2.mWeather1) && Intrinsics.XOO0ii0(this.mWeather2, bleWeatherForecast2.mWeather2) && Intrinsics.XOO0ii0(this.mWeather3, bleWeatherForecast2.mWeather3) && Intrinsics.XOO0ii0(this.mWeather4, bleWeatherForecast2.mWeather4) && Intrinsics.XOO0ii0(this.mWeather5, bleWeatherForecast2.mWeather5) && Intrinsics.XOO0ii0(this.mWeather6, bleWeatherForecast2.mWeather6) && Intrinsics.XOO0ii0(this.mWeather7, bleWeatherForecast2.mWeather7);
    }

    @aa1
    public final String getMCityName() {
        return this.mCityName;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 212;
    }

    public final int getMTime() {
        return this.mTime;
    }

    @tb1
    public final BleWeather2 getMWeather1() {
        return this.mWeather1;
    }

    @tb1
    public final BleWeather2 getMWeather2() {
        return this.mWeather2;
    }

    @tb1
    public final BleWeather2 getMWeather3() {
        return this.mWeather3;
    }

    @tb1
    public final BleWeather2 getMWeather4() {
        return this.mWeather4;
    }

    @tb1
    public final BleWeather2 getMWeather5() {
        return this.mWeather5;
    }

    @tb1
    public final BleWeather2 getMWeather6() {
        return this.mWeather6;
    }

    @tb1
    public final BleWeather2 getMWeather7() {
        return this.mWeather7;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.mTime) * 31) + this.mCityName.hashCode()) * 31;
        BleWeather2 bleWeather2 = this.mWeather1;
        int iHashCode2 = (iHashCode + (bleWeather2 == null ? 0 : bleWeather2.hashCode())) * 31;
        BleWeather2 bleWeather3 = this.mWeather2;
        int iHashCode3 = (iHashCode2 + (bleWeather3 == null ? 0 : bleWeather3.hashCode())) * 31;
        BleWeather2 bleWeather4 = this.mWeather3;
        int iHashCode4 = (iHashCode3 + (bleWeather4 == null ? 0 : bleWeather4.hashCode())) * 31;
        BleWeather2 bleWeather5 = this.mWeather4;
        int iHashCode5 = (iHashCode4 + (bleWeather5 == null ? 0 : bleWeather5.hashCode())) * 31;
        BleWeather2 bleWeather6 = this.mWeather5;
        int iHashCode6 = (iHashCode5 + (bleWeather6 == null ? 0 : bleWeather6.hashCode())) * 31;
        BleWeather2 bleWeather7 = this.mWeather6;
        int iHashCode7 = (iHashCode6 + (bleWeather7 == null ? 0 : bleWeather7.hashCode())) * 31;
        BleWeather2 bleWeather8 = this.mWeather7;
        return iHashCode7 + (bleWeather8 != null ? bleWeather8.hashCode() : 0);
    }

    public final void setMCityName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mCityName = str;
    }

    public final void setMTime(int i) {
        this.mTime = i;
    }

    public final void setMWeather1(@tb1 BleWeather2 bleWeather2) {
        this.mWeather1 = bleWeather2;
    }

    public final void setMWeather2(@tb1 BleWeather2 bleWeather2) {
        this.mWeather2 = bleWeather2;
    }

    public final void setMWeather3(@tb1 BleWeather2 bleWeather2) {
        this.mWeather3 = bleWeather2;
    }

    public final void setMWeather4(@tb1 BleWeather2 bleWeather2) {
        this.mWeather4 = bleWeather2;
    }

    public final void setMWeather5(@tb1 BleWeather2 bleWeather2) {
        this.mWeather5 = bleWeather2;
    }

    public final void setMWeather6(@tb1 BleWeather2 bleWeather2) {
        this.mWeather6 = bleWeather2;
    }

    public final void setMWeather7(@tb1 BleWeather2 bleWeather2) {
        this.mWeather7 = bleWeather2;
    }

    @aa1
    public String toString() {
        return "BleWeatherForecast2(mTime=" + BleTime.Companion.ofLocal(((long) this.mTime) * 1000) + ", mCityName=" + this.mCityName + ", mWeather1=" + this.mWeather1 + ", mWeather2=" + this.mWeather2 + ", mWeather3=" + this.mWeather3 + ", mWeather4=" + this.mWeather4 + ", mWeather5=" + this.mWeather5 + ", mWeather6=" + this.mWeather6 + ", mWeather7=" + this.mWeather7 + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleWeatherForecast2(int i, @aa1 String mCityName, @tb1 BleWeather2 bleWeather2, @tb1 BleWeather2 bleWeather3, @tb1 BleWeather2 bleWeather4, @tb1 BleWeather2 bleWeather5, @tb1 BleWeather2 bleWeather6, @tb1 BleWeather2 bleWeather7, @tb1 BleWeather2 bleWeather8) {
        Intrinsics.X0O(mCityName, "mCityName");
        this.mTime = i;
        this.mCityName = mCityName;
        this.mWeather1 = bleWeather2;
        this.mWeather2 = bleWeather3;
        this.mWeather3 = bleWeather4;
        this.mWeather4 = bleWeather5;
        this.mWeather5 = bleWeather6;
        this.mWeather6 = bleWeather7;
        this.mWeather7 = bleWeather8;
    }

    public /* synthetic */ BleWeatherForecast2(int i, String str, BleWeather2 bleWeather2, BleWeather2 bleWeather3, BleWeather2 bleWeather4, BleWeather2 bleWeather5, BleWeather2 bleWeather6, BleWeather2 bleWeather7, BleWeather2 bleWeather8, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : bleWeather2, (i2 & 8) != 0 ? null : bleWeather3, (i2 & 16) != 0 ? null : bleWeather4, (i2 & 32) != 0 ? null : bleWeather5, (i2 & 64) != 0 ? null : bleWeather6, (i2 & 128) != 0 ? null : bleWeather7, (i2 & 256) != 0 ? null : bleWeather8);
    }
}
