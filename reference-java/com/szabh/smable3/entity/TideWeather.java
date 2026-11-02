package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class TideWeather extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int TIDE_ITEM_LENGTH = 7;

    @aa1
    private String mTideCode;
    private int mTideHour;
    private int mTideMinute;
    private float mTideValue;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public TideWeather() {
        this(0, 0, null, 0.0f, 15, null);
    }

    public static /* synthetic */ TideWeather copy$default(TideWeather tideWeather, int i, int i2, String str, float f, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = tideWeather.mTideHour;
        }
        if ((i3 & 2) != 0) {
            i2 = tideWeather.mTideMinute;
        }
        if ((i3 & 4) != 0) {
            str = tideWeather.mTideCode;
        }
        if ((i3 & 8) != 0) {
            f = tideWeather.mTideValue;
        }
        return tideWeather.copy(i, i2, str, f);
    }

    public final int component1() {
        return this.mTideHour;
    }

    public final int component2() {
        return this.mTideMinute;
    }

    @aa1
    public final String component3() {
        return this.mTideCode;
    }

    public final float component4() {
        return this.mTideValue;
    }

    @aa1
    public final TideWeather copy(int i, int i2, @aa1 String mTideCode, float f) {
        Intrinsics.X0O(mTideCode, "mTideCode");
        return new TideWeather(i, i2, mTideCode, f);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mTideHour);
        writeInt8(this.mTideMinute);
        BleWritable.writeStringWithFix$default(this, this.mTideCode, 1, null, 4, null);
        float f = this.mTideValue;
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeFloat(f, LITTLE_ENDIAN);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TideWeather)) {
            return false;
        }
        TideWeather tideWeather = (TideWeather) obj;
        return this.mTideHour == tideWeather.mTideHour && this.mTideMinute == tideWeather.mTideMinute && Intrinsics.XOO0ii0(this.mTideCode, tideWeather.mTideCode) && Float.compare(this.mTideValue, tideWeather.mTideValue) == 0;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 7;
    }

    @aa1
    public final String getMTideCode() {
        return this.mTideCode;
    }

    public final int getMTideHour() {
        return this.mTideHour;
    }

    public final int getMTideMinute() {
        return this.mTideMinute;
    }

    public final float getMTideValue() {
        return this.mTideValue;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.mTideHour) * 31) + Integer.hashCode(this.mTideMinute)) * 31) + this.mTideCode.hashCode()) * 31) + Float.hashCode(this.mTideValue);
    }

    public final void setMTideCode(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mTideCode = str;
    }

    public final void setMTideHour(int i) {
        this.mTideHour = i;
    }

    public final void setMTideMinute(int i) {
        this.mTideMinute = i;
    }

    public final void setMTideValue(float f) {
        this.mTideValue = f;
    }

    @aa1
    public String toString() {
        return "TideWeather(mTideHour=" + this.mTideHour + ", mTideMinute=" + this.mTideMinute + ", mTideCode=" + this.mTideCode + ", mTideValue=" + this.mTideValue + HexStringBuilder.COMMENT_END_CHAR;
    }

    public TideWeather(int i, int i2, @aa1 String mTideCode, float f) {
        Intrinsics.X0O(mTideCode, "mTideCode");
        this.mTideHour = i;
        this.mTideMinute = i2;
        this.mTideCode = mTideCode;
        this.mTideValue = f;
    }

    public /* synthetic */ TideWeather(int i, int i2, String str, float f, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? 0.0f : f);
    }
}
