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
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 92;
    public static final int NAME_LENGTH = 66;

    @aa1
    private String mCityName;
    private int mTime;

    @tb1
    private BleWeather2 mWeather;

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

    public BleWeatherRealtime2() {
        int r1 = 0;
        String r2 = null;
        BleWeather2 r3 = null;
        this(r1, r2, r3, 7, null);
    }

    public static /* synthetic */ BleWeatherRealtime2 copy$default(BleWeatherRealtime2 r0, int r1, String r2, BleWeather2 r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.mTime;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.mCityName;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.mWeather;
    L12:
        return r0.copy(r1, r2, r3);
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
    public final BleWeatherRealtime2 copy(int r2, @aa1 String r3, @tb1 BleWeather2 r4) {
        Intrinsics.X0O(r3, "mCityName");
        return new BleWeatherRealtime2(r2, r3, r4);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeObject(BleTime.Companion.ofLocal(((long) this.mTime) * 1000));
        BleWritable.writeStringWithFix$default(this, this.mCityName, 66, null, 4, null);
        writeObject(this.mWeather);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleWeatherRealtime2) == true) goto L8;
        return false;
    L8:
        BleWeatherRealtime2 r6 = (BleWeatherRealtime2) r5;
        if (this.mTime == r6.mTime) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.mCityName, r6.mCityName) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.mWeather, r6.mWeather) == true) goto L17;
        return false;
    L17:
        return true;
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
        int r0 = ((Integer.hashCode(this.mTime) * 31) + this.mCityName.hashCode()) * 31;
        BleWeather2 r1 = this.mWeather;
        if (r1 != null) goto L5;
        int r2 = 0;
    L7:
        return r0 + r2;
    L5:
        r2 = r1.hashCode();
        goto L7
    }

    public final void setMCityName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mCityName = r2;
    }

    public final void setMTime(int r1) {
        this.mTime = r1;
    }

    public final void setMWeather(@tb1 BleWeather2 r1) {
        this.mWeather = r1;
    }

    @aa1
    public String toString() {
        return "BleWeatherRealtime2(mTime=" + BleTime.Companion.ofLocal(((long) this.mTime) * 1000) + ", mCityName=" + this.mCityName + ", mWeather=" + this.mWeather + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleWeatherRealtime2(int r2, @aa1 String r3, @tb1 BleWeather2 r4) {
        Intrinsics.X0O(r3, "mCityName");
        this.mTime = r2;
        this.mCityName = r3;
        this.mWeather = r4;
    }

    public /* synthetic */ BleWeatherRealtime2(int r1, String r2, BleWeather2 r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = "";
    L9:
        if ((r4 & 4) == 0) goto L11;
        r3 = null;
    L11:
        this(r1, r2, r3);
    }
}
