package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleAerobicExerciseSettings extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 9;
    private int mExerciseHour;
    private int mExerciseMinute;
    private int mHighHrMaxMinute;
    private int mHighHrMaxVibration;
    private int mHrMax;
    private int mHrMin;
    private int mLowHrMinMinute;
    private int mLowHrMinVibration;
    private int mLowOrHighHrDuration;

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

    public BleAerobicExerciseSettings() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        int r9 = 0;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, 511, null);
    }

    public static /* synthetic */ BleAerobicExerciseSettings copy$default(BleAerobicExerciseSettings r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, Object r11) {
        if ((r10 & 1) == 0) goto L6;
        r1 = r0.mExerciseHour;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r2 = r0.mExerciseMinute;
    L9:
        if ((r10 & 4) == 0) goto L12;
        r3 = r0.mHrMin;
    L12:
        if ((r10 & 8) == 0) goto L15;
        r4 = r0.mHrMax;
    L15:
        if ((r10 & 16) == 0) goto L18;
        r5 = r0.mLowHrMinMinute;
    L18:
        if ((r10 & 32) == 0) goto L21;
        r6 = r0.mLowHrMinVibration;
    L21:
        if ((r10 & 64) == 0) goto L24;
        r7 = r0.mHighHrMaxMinute;
    L24:
        if ((r10 & 128) == 0) goto L27;
        r8 = r0.mHighHrMaxVibration;
    L27:
        if ((r10 & 256) == 0) goto L29;
        r9 = r0.mLowOrHighHrDuration;
    L29:
        int r12 = r8;
        int r13 = r9;
        int r14 = r6;
        int r15 = r7;
        int r16 = r4;
        int r17 = r5;
        int r18 = r3;
        int r19 = r1;
        return r0.copy(r19, r2, r18, r16, r17, r14, r15, r12, r13);
    }

    public final int component1() {
        return this.mExerciseHour;
    }

    public final int component2() {
        return this.mExerciseMinute;
    }

    public final int component3() {
        return this.mHrMin;
    }

    public final int component4() {
        return this.mHrMax;
    }

    public final int component5() {
        return this.mLowHrMinMinute;
    }

    public final int component6() {
        return this.mLowHrMinVibration;
    }

    public final int component7() {
        return this.mHighHrMaxMinute;
    }

    public final int component8() {
        return this.mHighHrMaxVibration;
    }

    public final int component9() {
        return this.mLowOrHighHrDuration;
    }

    @aa1
    public final BleAerobicExerciseSettings copy(int r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, int r19) {
        return new BleAerobicExerciseSettings(r11, r12, r13, r14, r15, r16, r17, r18, r19);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mExerciseHour = readUInt8();
        this.mExerciseMinute = readUInt8();
        this.mHrMin = readUInt8();
        this.mHrMax = readUInt8();
        this.mLowHrMinMinute = readUInt8();
        this.mLowHrMinVibration = readUInt8();
        this.mHighHrMaxMinute = readUInt8();
        this.mHighHrMaxVibration = readUInt8();
        this.mLowOrHighHrDuration = readUInt8();
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mExerciseHour);
        writeInt8(this.mExerciseMinute);
        writeInt8(this.mHrMin);
        writeInt8(this.mHrMax);
        writeInt8(this.mLowHrMinMinute);
        writeInt8(this.mLowHrMinVibration);
        writeInt8(this.mHighHrMaxMinute);
        writeInt8(this.mHighHrMaxVibration);
        writeInt8(this.mLowOrHighHrDuration);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleAerobicExerciseSettings) == true) goto L8;
        return false;
    L8:
        BleAerobicExerciseSettings r6 = (BleAerobicExerciseSettings) r5;
        if (this.mExerciseHour == r6.mExerciseHour) goto L12;
        return false;
    L12:
        if (this.mExerciseMinute == r6.mExerciseMinute) goto L15;
        return false;
    L15:
        if (this.mHrMin == r6.mHrMin) goto L18;
        return false;
    L18:
        if (this.mHrMax == r6.mHrMax) goto L21;
        return false;
    L21:
        if (this.mLowHrMinMinute == r6.mLowHrMinMinute) goto L24;
        return false;
    L24:
        if (this.mLowHrMinVibration == r6.mLowHrMinVibration) goto L27;
        return false;
    L27:
        if (this.mHighHrMaxMinute == r6.mHighHrMaxMinute) goto L30;
        return false;
    L30:
        if (this.mHighHrMaxVibration == r6.mHighHrMaxVibration) goto L33;
        return false;
    L33:
        if (this.mLowOrHighHrDuration == r6.mLowOrHighHrDuration) goto L35;
        return false;
    L35:
        return true;
    }

    public final int getMExerciseHour() {
        return this.mExerciseHour;
    }

    public final int getMExerciseMinute() {
        return this.mExerciseMinute;
    }

    public final int getMHighHrMaxMinute() {
        return this.mHighHrMaxMinute;
    }

    public final int getMHighHrMaxVibration() {
        return this.mHighHrMaxVibration;
    }

    public final int getMHrMax() {
        return this.mHrMax;
    }

    public final int getMHrMin() {
        return this.mHrMin;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 9;
    }

    public final int getMLowHrMinMinute() {
        return this.mLowHrMinMinute;
    }

    public final int getMLowHrMinVibration() {
        return this.mLowHrMinVibration;
    }

    public final int getMLowOrHighHrDuration() {
        return this.mLowOrHighHrDuration;
    }

    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.mExerciseHour) * 31) + Integer.hashCode(this.mExerciseMinute)) * 31) + Integer.hashCode(this.mHrMin)) * 31) + Integer.hashCode(this.mHrMax)) * 31) + Integer.hashCode(this.mLowHrMinMinute)) * 31) + Integer.hashCode(this.mLowHrMinVibration)) * 31) + Integer.hashCode(this.mHighHrMaxMinute)) * 31) + Integer.hashCode(this.mHighHrMaxVibration)) * 31) + Integer.hashCode(this.mLowOrHighHrDuration);
    }

    public final void setMExerciseHour(int r1) {
        this.mExerciseHour = r1;
    }

    public final void setMExerciseMinute(int r1) {
        this.mExerciseMinute = r1;
    }

    public final void setMHighHrMaxMinute(int r1) {
        this.mHighHrMaxMinute = r1;
    }

    public final void setMHighHrMaxVibration(int r1) {
        this.mHighHrMaxVibration = r1;
    }

    public final void setMHrMax(int r1) {
        this.mHrMax = r1;
    }

    public final void setMHrMin(int r1) {
        this.mHrMin = r1;
    }

    public final void setMLowHrMinMinute(int r1) {
        this.mLowHrMinMinute = r1;
    }

    public final void setMLowHrMinVibration(int r1) {
        this.mLowHrMinVibration = r1;
    }

    public final void setMLowOrHighHrDuration(int r1) {
        this.mLowOrHighHrDuration = r1;
    }

    @aa1
    public String toString() {
        return "BleAerobicExerciseSettings(mExerciseHour=" + this.mExerciseHour + ", mExerciseMinute=" + this.mExerciseMinute + ", mHrMin=" + this.mHrMin + ", mHrMax=" + this.mHrMax + ", mLowHrMinMinute=" + this.mLowHrMinMinute + ", mLowHrMinVibration=" + this.mLowHrMinVibration + ", mHighHrMaxMinute=" + this.mHighHrMaxMinute + ", mHighHrMaxVibration=" + this.mHighHrMaxVibration + ", mLowOrHighHrDuration=" + this.mLowOrHighHrDuration + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleAerobicExerciseSettings(int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
        this.mExerciseHour = r1;
        this.mExerciseMinute = r2;
        this.mHrMin = r3;
        this.mHrMax = r4;
        this.mLowHrMinMinute = r5;
        this.mLowHrMinVibration = r6;
        this.mHighHrMaxMinute = r7;
        this.mHighHrMaxVibration = r8;
        this.mLowOrHighHrDuration = r9;
    }

    public /* synthetic */ BleAerobicExerciseSettings(int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, DefaultConstructorMarker r12) {
        if ((r11 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r11 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r11 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r11 & 8) == 0) goto L15;
        r5 = 0;
    L15:
        if ((r11 & 16) == 0) goto L18;
        r6 = 0;
    L18:
        if ((r11 & 32) == 0) goto L21;
        r7 = 0;
    L21:
        if ((r11 & 64) == 0) goto L24;
        r8 = 0;
    L24:
        if ((r11 & 128) == 0) goto L27;
        r9 = 0;
    L27:
        if ((r11 & 256) == 0) goto L30;
        int r13 = 0;
    L29:
        int r14 = r9;
        int r15 = r8;
        int r16 = r7;
        int r17 = r6;
        int r18 = r5;
        int r19 = r4;
        this(r2, r3, r19, r18, r17, r16, r15, r14, r13);
        return;
    L30:
        r13 = r10;
        goto L29
    }
}
