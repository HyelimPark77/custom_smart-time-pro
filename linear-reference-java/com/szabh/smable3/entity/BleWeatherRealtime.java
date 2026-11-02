package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleWeatherRealtime extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 16;
    private int mTime;

    @tb1
    private BleWeather mWeather;

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

    /* JADX WARN: Multi-variable type inference failed */
    public BleWeatherRealtime() {
        int r2 = 0;
        this(r2, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleWeatherRealtime copy$default(BleWeatherRealtime r0, int r1, BleWeather r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.mTime;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.mWeather;
    L9:
        return r0.copy(r1, r2);
    }

    public final int component1() {
        return this.mTime;
    }

    @tb1
    public final BleWeather component2() {
        return this.mWeather;
    }

    @aa1
    public final BleWeatherRealtime copy(int r2, @tb1 BleWeather r3) {
        return new BleWeatherRealtime(r2, r3);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeObject(BleTime.Companion.ofLocal(((long) this.mTime) * 1000));
        writeObject(this.mWeather);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleWeatherRealtime) == true) goto L8;
        return false;
    L8:
        BleWeatherRealtime r6 = (BleWeatherRealtime) r5;
        if (this.mTime == r6.mTime) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.mWeather, r6.mWeather) == true) goto L14;
        return false;
    L14:
        return true;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 16;
    }

    public final int getMTime() {
        return this.mTime;
    }

    @tb1
    public final BleWeather getMWeather() {
        return this.mWeather;
    }

    public int hashCode() {
        int r0 = Integer.hashCode(this.mTime) * 31;
        BleWeather r1 = this.mWeather;
        if (r1 != null) goto L5;
        int r2 = 0;
    L7:
        return r0 + r2;
    L5:
        r2 = r1.hashCode();
        goto L7
    }

    public final void setMTime(int r1) {
        this.mTime = r1;
    }

    public final void setMWeather(@tb1 BleWeather r1) {
        this.mWeather = r1;
    }

    @aa1
    public String toString() {
        return "BleWeatherRealtime(mTime=" + BleTime.Companion.ofLocal(((long) this.mTime) * 1000) + ", mWeather=" + this.mWeather + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleWeatherRealtime(int r1, @tb1 BleWeather r2) {
        this.mTime = r1;
        this.mWeather = r2;
    }

    public /* synthetic */ BleWeatherRealtime(int r1, BleWeather r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = null;
    L8:
        this(r1, r2);
    }
}
