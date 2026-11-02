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
    public static final Companion Companion = null;
    public static final int TIDE_ITEM_LENGTH = 7;

    @aa1
    private String mTideCode;
    private int mTideHour;
    private int mTideMinute;
    private float mTideValue;

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

    public TideWeather() {
        int r1 = 0;
        int r2 = 0;
        String r3 = null;
        float r4 = 0.0f;
        this(r1, r2, r3, r4, 15, null);
    }

    public static /* synthetic */ TideWeather copy$default(TideWeather r0, int r1, int r2, String r3, float r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.mTideHour;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.mTideMinute;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.mTideCode;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r0.mTideValue;
    L15:
        return r0.copy(r1, r2, r3, r4);
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
    public final TideWeather copy(int r2, int r3, @aa1 String r4, float r5) {
        Intrinsics.X0O(r4, "mTideCode");
        return new TideWeather(r2, r3, r4, r5);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mTideHour);
        writeInt8(this.mTideMinute);
        BleWritable.writeStringWithFix$default(this, this.mTideCode, 1, null, 4, null);
        float r0 = this.mTideValue;
        ByteOrder r2 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r2, "LITTLE_ENDIAN");
        writeFloat(r0, r2);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof TideWeather) == true) goto L8;
        return false;
    L8:
        TideWeather r6 = (TideWeather) r5;
        if (this.mTideHour == r6.mTideHour) goto L12;
        return false;
    L12:
        if (this.mTideMinute == r6.mTideMinute) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.mTideCode, r6.mTideCode) == true) goto L18;
        return false;
    L18:
        if (Float.compare(this.mTideValue, r6.mTideValue) == 0) goto L20;
        return false;
    L20:
        return true;
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

    public final void setMTideCode(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mTideCode = r2;
    }

    public final void setMTideHour(int r1) {
        this.mTideHour = r1;
    }

    public final void setMTideMinute(int r1) {
        this.mTideMinute = r1;
    }

    public final void setMTideValue(float r1) {
        this.mTideValue = r1;
    }

    @aa1
    public String toString() {
        return "TideWeather(mTideHour=" + this.mTideHour + ", mTideMinute=" + this.mTideMinute + ", mTideCode=" + this.mTideCode + ", mTideValue=" + this.mTideValue + HexStringBuilder.COMMENT_END_CHAR;
    }

    public TideWeather(int r2, int r3, @aa1 String r4, float r5) {
        Intrinsics.X0O(r4, "mTideCode");
        this.mTideHour = r2;
        this.mTideMinute = r3;
        this.mTideCode = r4;
        this.mTideValue = r5;
    }

    public /* synthetic */ TideWeather(int r2, int r3, String r4, float r5, int r6, DefaultConstructorMarker r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = 0.0f;
    L14:
        this(r2, r3, r4, r5);
    }
}
