package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleWeatherForecast extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 36;
    private int mTime;

    @tb1
    private BleWeather mWeather1;

    @tb1
    private BleWeather mWeather2;

    @tb1
    private BleWeather mWeather3;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleWeatherForecast() {
        this(0, null, null, null, 15, null);
    }

    public static /* synthetic */ BleWeatherForecast copy$default(BleWeatherForecast bleWeatherForecast, int i, BleWeather bleWeather, BleWeather bleWeather2, BleWeather bleWeather3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bleWeatherForecast.mTime;
        }
        if ((i2 & 2) != 0) {
            bleWeather = bleWeatherForecast.mWeather1;
        }
        if ((i2 & 4) != 0) {
            bleWeather2 = bleWeatherForecast.mWeather2;
        }
        if ((i2 & 8) != 0) {
            bleWeather3 = bleWeatherForecast.mWeather3;
        }
        return bleWeatherForecast.copy(i, bleWeather, bleWeather2, bleWeather3);
    }

    public final int component1() {
        return this.mTime;
    }

    @tb1
    public final BleWeather component2() {
        return this.mWeather1;
    }

    @tb1
    public final BleWeather component3() {
        return this.mWeather2;
    }

    @tb1
    public final BleWeather component4() {
        return this.mWeather3;
    }

    @aa1
    public final BleWeatherForecast copy(int i, @tb1 BleWeather bleWeather, @tb1 BleWeather bleWeather2, @tb1 BleWeather bleWeather3) {
        return new BleWeatherForecast(i, bleWeather, bleWeather2, bleWeather3);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeObject(BleTime.Companion.ofLocal(((long) this.mTime) * 1000));
        writeObject(this.mWeather1);
        writeObject(this.mWeather2);
        writeObject(this.mWeather3);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleWeatherForecast)) {
            return false;
        }
        BleWeatherForecast bleWeatherForecast = (BleWeatherForecast) obj;
        return this.mTime == bleWeatherForecast.mTime && Intrinsics.XOO0ii0(this.mWeather1, bleWeatherForecast.mWeather1) && Intrinsics.XOO0ii0(this.mWeather2, bleWeatherForecast.mWeather2) && Intrinsics.XOO0ii0(this.mWeather3, bleWeatherForecast.mWeather3);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 36;
    }

    public final int getMTime() {
        return this.mTime;
    }

    @tb1
    public final BleWeather getMWeather1() {
        return this.mWeather1;
    }

    @tb1
    public final BleWeather getMWeather2() {
        return this.mWeather2;
    }

    @tb1
    public final BleWeather getMWeather3() {
        return this.mWeather3;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.mTime) * 31;
        BleWeather bleWeather = this.mWeather1;
        int iHashCode2 = (iHashCode + (bleWeather == null ? 0 : bleWeather.hashCode())) * 31;
        BleWeather bleWeather2 = this.mWeather2;
        int iHashCode3 = (iHashCode2 + (bleWeather2 == null ? 0 : bleWeather2.hashCode())) * 31;
        BleWeather bleWeather3 = this.mWeather3;
        return iHashCode3 + (bleWeather3 != null ? bleWeather3.hashCode() : 0);
    }

    public final void setMTime(int i) {
        this.mTime = i;
    }

    public final void setMWeather1(@tb1 BleWeather bleWeather) {
        this.mWeather1 = bleWeather;
    }

    public final void setMWeather2(@tb1 BleWeather bleWeather) {
        this.mWeather2 = bleWeather;
    }

    public final void setMWeather3(@tb1 BleWeather bleWeather) {
        this.mWeather3 = bleWeather;
    }

    @aa1
    public String toString() {
        return "BleWeatherForecast(mTime=" + BleTime.Companion.ofLocal(((long) this.mTime) * 1000) + ", mWeather1=" + this.mWeather1 + ", mWeather2=" + this.mWeather2 + ", mWeather3=" + this.mWeather3 + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleWeatherForecast(int i, @tb1 BleWeather bleWeather, @tb1 BleWeather bleWeather2, @tb1 BleWeather bleWeather3) {
        this.mTime = i;
        this.mWeather1 = bleWeather;
        this.mWeather2 = bleWeather2;
        this.mWeather3 = bleWeather3;
    }

    public /* synthetic */ BleWeatherForecast(int i, BleWeather bleWeather, BleWeather bleWeather2, BleWeather bleWeather3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : bleWeather, (i2 & 4) != 0 ? null : bleWeather2, (i2 & 8) != 0 ? null : bleWeather3);
    }
}
