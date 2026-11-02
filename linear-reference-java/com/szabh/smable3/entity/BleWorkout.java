package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.bm;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleWorkout extends BleReadable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 48;
    private int mAirPressure;
    private int mAltitude;
    private int mAvgBpm;
    private int mCalorie;
    private int mDistance;
    private int mDuration;
    private int mEnd;
    private int mMaxBpm;
    private int mMode;
    private int mPace;
    private int mSpeed;
    private int mSpm;
    private int mStart;
    private int mStep;

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

    public BleWorkout() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        int r9 = 0;
        int r10 = 0;
        int r11 = 0;
        int r12 = 0;
        int r13 = 0;
        int r14 = 0;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, bm.OXO1, null);
    }

    public static /* synthetic */ BleWorkout copy$default(BleWorkout r14, int r15, int r16, int r17, int r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26, int r27, int r28, int r29, Object r30) {
        if ((r29 & 1) == 0) goto L5;
        int r1 = r14.mStart;
    L7:
        if ((r29 & 2) == 0) goto L9;
        int r2 = r14.mEnd;
    L11:
        if ((r29 & 4) == 0) goto L13;
        int r3 = r14.mDuration;
    L15:
        if ((r29 & 8) == 0) goto L17;
        int r4 = r14.mAltitude;
    L19:
        if ((r29 & 16) == 0) goto L21;
        int r5 = r14.mAirPressure;
    L23:
        if ((r29 & 32) == 0) goto L25;
        int r6 = r14.mSpm;
    L27:
        if ((r29 & 64) == 0) goto L29;
        int r7 = r14.mMode;
    L31:
        if ((r29 & 128) == 0) goto L33;
        int r8 = r14.mStep;
    L35:
        if ((r29 & 256) == 0) goto L37;
        int r9 = r14.mDistance;
    L39:
        if ((r29 & 512) == 0) goto L41;
        int r10 = r14.mCalorie;
    L43:
        if ((r29 & 1024) == 0) goto L45;
        int r11 = r14.mSpeed;
    L47:
        if ((r29 & 2048) == 0) goto L49;
        int r12 = r14.mPace;
    L51:
        if ((r29 & 4096) == 0) goto L53;
        int r13 = r14.mAvgBpm;
    L55:
        if ((r29 & 8192) == 0) goto L58;
        int r210 = r14.mMaxBpm;
    L60:
        return r14.copy(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r210);
    L58:
        r210 = r28;
        goto L60
    L53:
        r13 = r27;
        goto L55
    L49:
        r12 = r26;
        goto L51
    L45:
        r11 = r25;
        goto L47
    L41:
        r10 = r24;
        goto L43
    L37:
        r9 = r23;
        goto L39
    L33:
        r8 = r22;
        goto L35
    L29:
        r7 = r21;
        goto L31
    L25:
        r6 = r20;
        goto L27
    L21:
        r5 = r19;
        goto L23
    L17:
        r4 = r18;
        goto L19
    L13:
        r3 = r17;
        goto L15
    L9:
        r2 = r16;
        goto L11
    L5:
        r1 = r15;
        goto L7
    }

    public final int component1() {
        return this.mStart;
    }

    public final int component10() {
        return this.mCalorie;
    }

    public final int component11() {
        return this.mSpeed;
    }

    public final int component12() {
        return this.mPace;
    }

    public final int component13() {
        return this.mAvgBpm;
    }

    public final int component14() {
        return this.mMaxBpm;
    }

    public final int component2() {
        return this.mEnd;
    }

    public final int component3() {
        return this.mDuration;
    }

    public final int component4() {
        return this.mAltitude;
    }

    public final int component5() {
        return this.mAirPressure;
    }

    public final int component6() {
        return this.mSpm;
    }

    public final int component7() {
        return this.mMode;
    }

    public final int component8() {
        return this.mStep;
    }

    public final int component9() {
        return this.mDistance;
    }

    @aa1
    public final BleWorkout copy(int r16, int r17, int r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26, int r27, int r28, int r29) {
        return new BleWorkout(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mStart = BleReadable.readInt32$default(this, null, 1, null);
        this.mEnd = BleReadable.readInt32$default(this, null, 1, null);
        this.mDuration = BleReadable.readUInt16$default(this, null, 1, null);
        this.mAltitude = BleReadable.readInt16$default(this, null, 1, null);
        this.mAirPressure = BleReadable.readUInt16$default(this, null, 1, null);
        this.mSpm = readUInt8();
        this.mMode = readUInt8();
        this.mStep = BleReadable.readInt32$default(this, null, 1, null);
        this.mDistance = BleReadable.readInt32$default(this, null, 1, null);
        this.mCalorie = BleReadable.readInt32$default(this, null, 1, null);
        this.mSpeed = BleReadable.readInt32$default(this, null, 1, null);
        this.mPace = BleReadable.readInt32$default(this, null, 1, null);
        this.mAvgBpm = readUInt8();
        this.mMaxBpm = readUInt8();
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleWorkout) == true) goto L8;
        return false;
    L8:
        BleWorkout r6 = (BleWorkout) r5;
        if (this.mStart == r6.mStart) goto L12;
        return false;
    L12:
        if (this.mEnd == r6.mEnd) goto L15;
        return false;
    L15:
        if (this.mDuration == r6.mDuration) goto L18;
        return false;
    L18:
        if (this.mAltitude == r6.mAltitude) goto L21;
        return false;
    L21:
        if (this.mAirPressure == r6.mAirPressure) goto L24;
        return false;
    L24:
        if (this.mSpm == r6.mSpm) goto L27;
        return false;
    L27:
        if (this.mMode == r6.mMode) goto L30;
        return false;
    L30:
        if (this.mStep == r6.mStep) goto L33;
        return false;
    L33:
        if (this.mDistance == r6.mDistance) goto L36;
        return false;
    L36:
        if (this.mCalorie == r6.mCalorie) goto L39;
        return false;
    L39:
        if (this.mSpeed == r6.mSpeed) goto L42;
        return false;
    L42:
        if (this.mPace == r6.mPace) goto L45;
        return false;
    L45:
        if (this.mAvgBpm == r6.mAvgBpm) goto L48;
        return false;
    L48:
        if (this.mMaxBpm == r6.mMaxBpm) goto L50;
        return false;
    L50:
        return true;
    }

    public final int getMAirPressure() {
        return this.mAirPressure;
    }

    public final int getMAltitude() {
        return this.mAltitude;
    }

    public final int getMAvgBpm() {
        return this.mAvgBpm;
    }

    public final int getMCalorie() {
        return this.mCalorie;
    }

    public final int getMDistance() {
        return this.mDistance;
    }

    public final int getMDuration() {
        return this.mDuration;
    }

    public final int getMEnd() {
        return this.mEnd;
    }

    public final int getMMaxBpm() {
        return this.mMaxBpm;
    }

    public final int getMMode() {
        return this.mMode;
    }

    public final int getMPace() {
        return this.mPace;
    }

    public final int getMSpeed() {
        return this.mSpeed;
    }

    public final int getMSpm() {
        return this.mSpm;
    }

    public final int getMStart() {
        return this.mStart;
    }

    public final int getMStep() {
        return this.mStep;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((Integer.hashCode(this.mStart) * 31) + Integer.hashCode(this.mEnd)) * 31) + Integer.hashCode(this.mDuration)) * 31) + Integer.hashCode(this.mAltitude)) * 31) + Integer.hashCode(this.mAirPressure)) * 31) + Integer.hashCode(this.mSpm)) * 31) + Integer.hashCode(this.mMode)) * 31) + Integer.hashCode(this.mStep)) * 31) + Integer.hashCode(this.mDistance)) * 31) + Integer.hashCode(this.mCalorie)) * 31) + Integer.hashCode(this.mSpeed)) * 31) + Integer.hashCode(this.mPace)) * 31) + Integer.hashCode(this.mAvgBpm)) * 31) + Integer.hashCode(this.mMaxBpm);
    }

    public final void setMAirPressure(int r1) {
        this.mAirPressure = r1;
    }

    public final void setMAltitude(int r1) {
        this.mAltitude = r1;
    }

    public final void setMAvgBpm(int r1) {
        this.mAvgBpm = r1;
    }

    public final void setMCalorie(int r1) {
        this.mCalorie = r1;
    }

    public final void setMDistance(int r1) {
        this.mDistance = r1;
    }

    public final void setMDuration(int r1) {
        this.mDuration = r1;
    }

    public final void setMEnd(int r1) {
        this.mEnd = r1;
    }

    public final void setMMaxBpm(int r1) {
        this.mMaxBpm = r1;
    }

    public final void setMMode(int r1) {
        this.mMode = r1;
    }

    public final void setMPace(int r1) {
        this.mPace = r1;
    }

    public final void setMSpeed(int r1) {
        this.mSpeed = r1;
    }

    public final void setMSpm(int r1) {
        this.mSpm = r1;
    }

    public final void setMStart(int r1) {
        this.mStart = r1;
    }

    public final void setMStep(int r1) {
        this.mStep = r1;
    }

    @aa1
    public String toString() {
        return "BleWorkout(mStart=" + this.mStart + ", mEnd=" + this.mEnd + ", mDuration=" + this.mDuration + ", mAltitude=" + this.mAltitude + ", mAirPressure=" + this.mAirPressure + ", mSpm=" + this.mSpm + ", mMode=" + this.mMode + ", mStep=" + this.mStep + ", mDistance=" + this.mDistance + ", mCalorie=" + this.mCalorie + ", mSpeed=" + this.mSpeed + ", mPace=" + this.mPace + ", mAvgBpm=" + this.mAvgBpm + ", mMaxBpm=" + this.mMaxBpm + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleWorkout(int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14) {
        this.mStart = r1;
        this.mEnd = r2;
        this.mDuration = r3;
        this.mAltitude = r4;
        this.mAirPressure = r5;
        this.mSpm = r6;
        this.mMode = r7;
        this.mStep = r8;
        this.mDistance = r9;
        this.mCalorie = r10;
        this.mSpeed = r11;
        this.mPace = r12;
        this.mAvgBpm = r13;
        this.mMaxBpm = r14;
    }

    public /* synthetic */ BleWorkout(int r16, int r17, int r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26, int r27, int r28, int r29, int r30, DefaultConstructorMarker r31) {
        if ((r30 & 1) == 0) goto L5;
        int r1 = 0;
    L7:
        if ((r30 & 2) == 0) goto L9;
        int r3 = 0;
    L11:
        if ((r30 & 4) == 0) goto L13;
        int r4 = 0;
    L15:
        if ((r30 & 8) == 0) goto L17;
        int r5 = 0;
    L19:
        if ((r30 & 16) == 0) goto L21;
        int r6 = 0;
    L23:
        if ((r30 & 32) == 0) goto L25;
        int r7 = 0;
    L27:
        if ((r30 & 64) == 0) goto L29;
        int r8 = 0;
    L31:
        if ((r30 & 128) == 0) goto L33;
        int r9 = 0;
    L35:
        if ((r30 & 256) == 0) goto L37;
        int r10 = 0;
    L39:
        if ((r30 & 512) == 0) goto L41;
        int r11 = 0;
    L43:
        if ((r30 & 1024) == 0) goto L45;
        int r12 = 0;
    L47:
        if ((r30 & 2048) == 0) goto L49;
        int r13 = 0;
    L51:
        if ((r30 & 4096) == 0) goto L53;
        int r14 = 0;
    L55:
        if ((r30 & 8192) == 0) goto L58;
        int r32 = 0;
    L59:
        this(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r32);
        return;
    L58:
        r32 = r29;
        goto L59
    L53:
        r14 = r28;
        goto L55
    L49:
        r13 = r27;
        goto L51
    L45:
        r12 = r26;
        goto L47
    L41:
        r11 = r25;
        goto L43
    L37:
        r10 = r24;
        goto L39
    L33:
        r9 = r23;
        goto L35
    L29:
        r8 = r22;
        goto L31
    L25:
        r7 = r21;
        goto L27
    L21:
        r6 = r20;
        goto L23
    L17:
        r5 = r19;
        goto L19
    L13:
        r4 = r18;
        goto L15
    L9:
        r3 = r17;
        goto L11
    L5:
        r1 = r16;
        goto L7
    }
}
