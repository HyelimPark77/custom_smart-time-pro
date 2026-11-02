package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleWeatherForecast3 extends BleWritable {

    @aa1
    public static final Companion Companion = null;
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
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public BleWeatherForecast3() {
        int r1 = 0;
        String r2 = null;
        BleWeather3 r3 = null;
        BleWeather3 r4 = null;
        BleWeather3 r5 = null;
        BleWeather3 r6 = null;
        BleWeather3 r7 = null;
        BleWeather3 r8 = null;
        BleWeather3 r9 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, 511, null);
    }

    public static /* synthetic */ BleWeatherForecast3 copy$default(BleWeatherForecast3 r0, int r1, String r2, BleWeather3 r3, BleWeather3 r4, BleWeather3 r5, BleWeather3 r6, BleWeather3 r7, BleWeather3 r8, BleWeather3 r9, int r10, Object r11) {
        if ((r10 & 1) == 0) goto L6;
        r1 = r0.mTime;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r2 = r0.mCityName;
    L9:
        if ((r10 & 4) == 0) goto L12;
        r3 = r0.mWeather1;
    L12:
        if ((r10 & 8) == 0) goto L15;
        r4 = r0.mWeather2;
    L15:
        if ((r10 & 16) == 0) goto L18;
        r5 = r0.mWeather3;
    L18:
        if ((r10 & 32) == 0) goto L21;
        r6 = r0.mWeather4;
    L21:
        if ((r10 & 64) == 0) goto L24;
        r7 = r0.mWeather5;
    L24:
        if ((r10 & 128) == 0) goto L27;
        r8 = r0.mWeather6;
    L27:
        if ((r10 & 256) == 0) goto L29;
        r9 = r0.mWeather7;
    L29:
        BleWeather3 r12 = r8;
        BleWeather3 r13 = r9;
        BleWeather3 r14 = r6;
        BleWeather3 r15 = r7;
        BleWeather3 r16 = r4;
        BleWeather3 r17 = r5;
        BleWeather3 r18 = r3;
        int r19 = r1;
        return r0.copy(r19, r2, r18, r16, r17, r14, r15, r12, r13);
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
    public final BleWeatherForecast3 copy(int r12, @aa1 String r13, @tb1 BleWeather3 r14, @tb1 BleWeather3 r15, @tb1 BleWeather3 r16, @tb1 BleWeather3 r17, @tb1 BleWeather3 r18, @tb1 BleWeather3 r19, @tb1 BleWeather3 r20) {
        Intrinsics.X0O(r13, "mCityName");
        return new BleWeatherForecast3(r12, r13, r14, r15, r16, r17, r18, r19, r20);
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

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleWeatherForecast3) == true) goto L8;
        return false;
    L8:
        BleWeatherForecast3 r6 = (BleWeatherForecast3) r5;
        if (this.mTime == r6.mTime) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.mCityName, r6.mCityName) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.mWeather1, r6.mWeather1) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.mWeather2, r6.mWeather2) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.mWeather3, r6.mWeather3) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.mWeather4, r6.mWeather4) == true) goto L27;
        return false;
    L27:
        if (Intrinsics.XOO0ii0(this.mWeather5, r6.mWeather5) == true) goto L30;
        return false;
    L30:
        if (Intrinsics.XOO0ii0(this.mWeather6, r6.mWeather6) == true) goto L33;
        return false;
    L33:
        if (Intrinsics.XOO0ii0(this.mWeather7, r6.mWeather7) == true) goto L35;
        return false;
    L35:
        return true;
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
        int r0 = ((Integer.hashCode(this.mTime) * 31) + this.mCityName.hashCode()) * 31;
        BleWeather3 r1 = this.mWeather1;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r3 = 0;
    L6:
        int r4 = (r0 + r3) * 31;
        BleWeather3 r5 = this.mWeather2;
        if (r5 != null) goto L9;
        int r6 = 0;
    L10:
        int r7 = (r4 + r6) * 31;
        BleWeather3 r8 = this.mWeather3;
        if (r8 != null) goto L13;
        int r9 = 0;
    L14:
        int r10 = (r7 + r9) * 31;
        BleWeather3 r11 = this.mWeather4;
        if (r11 != null) goto L17;
        int r12 = 0;
    L18:
        int r13 = (r10 + r12) * 31;
        BleWeather3 r14 = this.mWeather5;
        if (r14 != null) goto L21;
        int r15 = 0;
    L22:
        int r16 = (r13 + r15) * 31;
        BleWeather3 r17 = this.mWeather6;
        if (r17 != null) goto L25;
        int r18 = 0;
    L26:
        int r19 = (r16 + r18) * 31;
        BleWeather3 r20 = this.mWeather7;
        if (r20 == null) goto L31;
        r2 = r20.hashCode();
    L31:
        return r19 + r2;
    L25:
        r18 = r17.hashCode();
        goto L26
    L21:
        r15 = r14.hashCode();
        goto L22
    L17:
        r12 = r11.hashCode();
        goto L18
    L13:
        r9 = r8.hashCode();
        goto L14
    L9:
        r6 = r5.hashCode();
        goto L10
    L5:
        r3 = r1.hashCode();
        goto L6
    }

    public final void setMCityName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mCityName = r2;
    }

    public final void setMTime(int r1) {
        this.mTime = r1;
    }

    public final void setMWeather1(@tb1 BleWeather3 r1) {
        this.mWeather1 = r1;
    }

    public final void setMWeather2(@tb1 BleWeather3 r1) {
        this.mWeather2 = r1;
    }

    public final void setMWeather3(@tb1 BleWeather3 r1) {
        this.mWeather3 = r1;
    }

    public final void setMWeather4(@tb1 BleWeather3 r1) {
        this.mWeather4 = r1;
    }

    public final void setMWeather5(@tb1 BleWeather3 r1) {
        this.mWeather5 = r1;
    }

    public final void setMWeather6(@tb1 BleWeather3 r1) {
        this.mWeather6 = r1;
    }

    public final void setMWeather7(@tb1 BleWeather3 r1) {
        this.mWeather7 = r1;
    }

    @aa1
    public String toString() {
        return "BleWeatherForecast3()";
    }

    public BleWeatherForecast3(int r2, @aa1 String r3, @tb1 BleWeather3 r4, @tb1 BleWeather3 r5, @tb1 BleWeather3 r6, @tb1 BleWeather3 r7, @tb1 BleWeather3 r8, @tb1 BleWeather3 r9, @tb1 BleWeather3 r10) {
        Intrinsics.X0O(r3, "mCityName");
        this.mTime = r2;
        this.mCityName = r3;
        this.mWeather1 = r4;
        this.mWeather2 = r5;
        this.mWeather3 = r6;
        this.mWeather4 = r7;
        this.mWeather5 = r8;
        this.mWeather6 = r9;
        this.mWeather7 = r10;
    }

    public /* synthetic */ BleWeatherForecast3(int r2, String r3, BleWeather3 r4, BleWeather3 r5, BleWeather3 r6, BleWeather3 r7, BleWeather3 r8, BleWeather3 r9, BleWeather3 r10, int r11, DefaultConstructorMarker r12) {
        if ((r11 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r11 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r11 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r11 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r11 & 16) == 0) goto L18;
        r6 = null;
    L18:
        if ((r11 & 32) == 0) goto L21;
        r7 = null;
    L21:
        if ((r11 & 64) == 0) goto L24;
        r8 = null;
    L24:
        if ((r11 & 128) == 0) goto L27;
        r9 = null;
    L27:
        if ((r11 & 256) == 0) goto L29;
        BleWeather3 r13 = null;
    L30:
        this(r2, r3, r4, r5, r6, r7, r8, r9, r13);
        return;
    L29:
        r13 = r10;
        goto L30
    }
}
