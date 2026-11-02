package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.util.Calendar;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleVitality extends BleReadable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 16;
    private int mAllVitality;
    private int mHighIntensityTime;
    private int mHighIntensityValue;
    private int mLowIntensityTime;
    private int mLowIntensityValue;
    private int mMediumIntensityTime;
    private int mMediumIntensityValue;
    private long mTime;

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

    public BleVitality() {
        long r1 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        int r9 = 0;
        this(r1, r3, r4, r5, r6, r7, r8, r9, 255, null);
    }

    public static /* synthetic */ BleVitality copy$default(BleVitality r10, long r11, int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, Object r21) {
        if ((r20 & 1) == 0) goto L5;
        r11 = r10.mTime;
    L5:
        long r1 = r11;
        if ((r20 & 2) == 0) goto L8;
        r13 = r10.mAllVitality;
    L8:
        int r3 = r13;
        if ((r20 & 4) == 0) goto L11;
        r14 = r10.mLowIntensityTime;
    L11:
        int r4 = r14;
        if ((r20 & 8) == 0) goto L14;
        r15 = r10.mLowIntensityValue;
    L14:
        int r5 = r15;
        if ((r20 & 16) == 0) goto L17;
        int r6 = r10.mMediumIntensityTime;
    L19:
        if ((r20 & 32) == 0) goto L21;
        int r7 = r10.mMediumIntensityValue;
    L23:
        if ((r20 & 64) == 0) goto L25;
        int r8 = r10.mHighIntensityTime;
    L27:
        if ((r20 & 128) == 0) goto L30;
        int r9 = r10.mHighIntensityValue;
    L32:
        return r10.copy(r1, r3, r4, r5, r6, r7, r8, r9);
    L30:
        r9 = r19;
        goto L32
    L25:
        r8 = r18;
        goto L27
    L21:
        r7 = r17;
        goto L23
    L17:
        r6 = r16;
        goto L19
    }

    public final long component1() {
        return this.mTime;
    }

    public final int component2() {
        return this.mAllVitality;
    }

    public final int component3() {
        return this.mLowIntensityTime;
    }

    public final int component4() {
        return this.mLowIntensityValue;
    }

    public final int component5() {
        return this.mMediumIntensityTime;
    }

    public final int component6() {
        return this.mMediumIntensityValue;
    }

    public final int component7() {
        return this.mHighIntensityTime;
    }

    public final int component8() {
        return this.mHighIntensityValue;
    }

    @aa1
    public final BleVitality copy(long r11, int r13, int r14, int r15, int r16, int r17, int r18, int r19) {
        return new BleVitality(r11, r13, r14, r15, r16, r17, r18, r19);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        int r2 = BleReadable.readInt32$default(this, null, 1, null);
        this.mTime = getStartOfDayCalendar(BleReadable.Companion.timeToMillis(r2)).getTimeInMillis();
        this.mLowIntensityTime = BleReadable.readInt16$default(this, null, 1, null);
        this.mLowIntensityValue = BleReadable.readInt16$default(this, null, 1, null);
        this.mMediumIntensityTime = BleReadable.readInt16$default(this, null, 1, null);
        this.mMediumIntensityValue = BleReadable.readInt16$default(this, null, 1, null);
        this.mHighIntensityTime = BleReadable.readInt16$default(this, null, 1, null);
        short r0 = BleReadable.readInt16$default(this, null, 1, null);
        this.mHighIntensityValue = r0;
        this.mAllVitality = (this.mLowIntensityValue + this.mMediumIntensityValue) + r0;
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof BleVitality) == true) goto L8;
        return false;
    L8:
        BleVitality r9 = (BleVitality) r8;
        if (this.mTime == r9.mTime) goto L12;
        return false;
    L12:
        if (this.mAllVitality == r9.mAllVitality) goto L15;
        return false;
    L15:
        if (this.mLowIntensityTime == r9.mLowIntensityTime) goto L18;
        return false;
    L18:
        if (this.mLowIntensityValue == r9.mLowIntensityValue) goto L21;
        return false;
    L21:
        if (this.mMediumIntensityTime == r9.mMediumIntensityTime) goto L24;
        return false;
    L24:
        if (this.mMediumIntensityValue == r9.mMediumIntensityValue) goto L27;
        return false;
    L27:
        if (this.mHighIntensityTime == r9.mHighIntensityTime) goto L30;
        return false;
    L30:
        if (this.mHighIntensityValue == r9.mHighIntensityValue) goto L32;
        return false;
    L32:
        return true;
    }

    public final int getMAllVitality() {
        return this.mAllVitality;
    }

    public final int getMHighIntensityTime() {
        return this.mHighIntensityTime;
    }

    public final int getMHighIntensityValue() {
        return this.mHighIntensityValue;
    }

    public final int getMLowIntensityTime() {
        return this.mLowIntensityTime;
    }

    public final int getMLowIntensityValue() {
        return this.mLowIntensityValue;
    }

    public final int getMMediumIntensityTime() {
        return this.mMediumIntensityTime;
    }

    public final int getMMediumIntensityValue() {
        return this.mMediumIntensityValue;
    }

    public final long getMTime() {
        return this.mTime;
    }

    @aa1
    public final Calendar getStartOfDayCalendar(long r2) {
        Calendar r0 = Calendar.getInstance();
        r0.setTimeInMillis(r2);
        r0.set(11, 12);
        r0.set(12, 0);
        r0.set(13, 0);
        r0.set(14, 0);
        Intrinsics.XXI(r0);
        return r0;
    }

    public int hashCode() {
        return (((((((((((((Long.hashCode(this.mTime) * 31) + Integer.hashCode(this.mAllVitality)) * 31) + Integer.hashCode(this.mLowIntensityTime)) * 31) + Integer.hashCode(this.mLowIntensityValue)) * 31) + Integer.hashCode(this.mMediumIntensityTime)) * 31) + Integer.hashCode(this.mMediumIntensityValue)) * 31) + Integer.hashCode(this.mHighIntensityTime)) * 31) + Integer.hashCode(this.mHighIntensityValue);
    }

    public final void setMAllVitality(int r1) {
        this.mAllVitality = r1;
    }

    public final void setMHighIntensityTime(int r1) {
        this.mHighIntensityTime = r1;
    }

    public final void setMHighIntensityValue(int r1) {
        this.mHighIntensityValue = r1;
    }

    public final void setMLowIntensityTime(int r1) {
        this.mLowIntensityTime = r1;
    }

    public final void setMLowIntensityValue(int r1) {
        this.mLowIntensityValue = r1;
    }

    public final void setMMediumIntensityTime(int r1) {
        this.mMediumIntensityTime = r1;
    }

    public final void setMMediumIntensityValue(int r1) {
        this.mMediumIntensityValue = r1;
    }

    public final void setMTime(long r1) {
        this.mTime = r1;
    }

    @aa1
    public String toString() {
        return "BleVitality(mTime=" + this.mTime + ", mAllVitality=" + this.mAllVitality + ", mLowIntensityTime=" + this.mLowIntensityTime + ", mLowIntensityValue=" + this.mLowIntensityValue + ", mMediumIntensityTime=" + this.mMediumIntensityTime + ", mMediumIntensityValue=" + this.mMediumIntensityValue + ", mHighIntensityTime=" + this.mHighIntensityTime + ", mHighIntensityValue=" + this.mHighIntensityValue + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleVitality(long r1, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
        this.mTime = r1;
        this.mAllVitality = r3;
        this.mLowIntensityTime = r4;
        this.mLowIntensityValue = r5;
        this.mMediumIntensityTime = r6;
        this.mMediumIntensityValue = r7;
        this.mHighIntensityTime = r8;
        this.mHighIntensityValue = r9;
    }

    public /* synthetic */ BleVitality(long r11, int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, DefaultConstructorMarker r21) {
        if ((r20 & 1) == 0) goto L5;
        r11 = 0;
    L5:
        long r1 = r11;
        if ((r20 & 2) == 0) goto L8;
        int r3 = 0;
    L10:
        if ((r20 & 4) == 0) goto L12;
        int r4 = 0;
    L14:
        if ((r20 & 8) == 0) goto L16;
        int r5 = 0;
    L18:
        if ((r20 & 16) == 0) goto L20;
        int r6 = 0;
    L22:
        if ((r20 & 32) == 0) goto L24;
        int r7 = 0;
    L26:
        if ((r20 & 64) == 0) goto L28;
        int r8 = 0;
    L30:
        if ((r20 & 128) == 0) goto L33;
        int r9 = 0;
    L34:
        this(r1, r3, r4, r5, r6, r7, r8, r9);
        return;
    L33:
        r9 = r19;
        goto L34
    L28:
        r8 = r18;
        goto L30
    L24:
        r7 = r17;
        goto L26
    L20:
        r6 = r16;
        goto L22
    L16:
        r5 = r15;
        goto L18
    L12:
        r4 = r14;
        goto L14
    L8:
        r3 = r13;
        goto L10
    }
}
