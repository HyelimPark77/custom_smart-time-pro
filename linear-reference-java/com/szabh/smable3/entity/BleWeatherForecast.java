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
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 36;
    private int mTime;

    @tb1
    private BleWeather mWeather1;

    @tb1
    private BleWeather mWeather2;

    @tb1
    private BleWeather mWeather3;

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

    public BleWeatherForecast() {
        int r1 = 0;
        BleWeather r2 = null;
        BleWeather r3 = null;
        BleWeather r4 = null;
        this(r1, r2, r3, r4, 15, null);
    }

    public static /* synthetic */ BleWeatherForecast copy$default(BleWeatherForecast r0, int r1, BleWeather r2, BleWeather r3, BleWeather r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.mTime;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.mWeather1;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.mWeather2;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r0.mWeather3;
    L15:
        return r0.copy(r1, r2, r3, r4);
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
    public final BleWeatherForecast copy(int r2, @tb1 BleWeather r3, @tb1 BleWeather r4, @tb1 BleWeather r5) {
        return new BleWeatherForecast(r2, r3, r4, r5);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeObject(BleTime.Companion.ofLocal(((long) this.mTime) * 1000));
        writeObject(this.mWeather1);
        writeObject(this.mWeather2);
        writeObject(this.mWeather3);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleWeatherForecast) == true) goto L8;
        return false;
    L8:
        BleWeatherForecast r6 = (BleWeatherForecast) r5;
        if (this.mTime == r6.mTime) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.mWeather1, r6.mWeather1) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.mWeather2, r6.mWeather2) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.mWeather3, r6.mWeather3) == true) goto L20;
        return false;
    L20:
        return true;
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
        int r0 = Integer.hashCode(this.mTime) * 31;
        BleWeather r1 = this.mWeather1;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r3 = 0;
    L6:
        int r4 = (r0 + r3) * 31;
        BleWeather r5 = this.mWeather2;
        if (r5 != null) goto L9;
        int r6 = 0;
    L10:
        int r7 = (r4 + r6) * 31;
        BleWeather r8 = this.mWeather3;
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

    public final void setMTime(int r1) {
        this.mTime = r1;
    }

    public final void setMWeather1(@tb1 BleWeather r1) {
        this.mWeather1 = r1;
    }

    public final void setMWeather2(@tb1 BleWeather r1) {
        this.mWeather2 = r1;
    }

    public final void setMWeather3(@tb1 BleWeather r1) {
        this.mWeather3 = r1;
    }

    @aa1
    public String toString() {
        return "BleWeatherForecast(mTime=" + BleTime.Companion.ofLocal(((long) this.mTime) * 1000) + ", mWeather1=" + this.mWeather1 + ", mWeather2=" + this.mWeather2 + ", mWeather3=" + this.mWeather3 + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleWeatherForecast(int r1, @tb1 BleWeather r2, @tb1 BleWeather r3, @tb1 BleWeather r4) {
        this.mTime = r1;
        this.mWeather1 = r2;
        this.mWeather2 = r3;
        this.mWeather3 = r4;
    }

    public /* synthetic */ BleWeatherForecast(int r2, BleWeather r3, BleWeather r4, BleWeather r5, int r6, DefaultConstructorMarker r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = null;
    L14:
        this(r2, r3, r4, r5);
    }
}
