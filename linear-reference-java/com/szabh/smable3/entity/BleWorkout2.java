package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleWorkout2 extends BleReadable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 128;
    private int mAirPressure;
    private int mAltitude;
    private int mAltitudeclimb;
    private int mAvgBpm;
    private int mAvgStress;
    private int mCalorie;
    private int mDistance;
    private int mDuration;
    private int mEnd;
    private int mMaxAltitude;
    private int mMaxBpm;
    private int mMaxPace;
    private int mMaxSpeed;
    private int mMaxSpm;
    private int mMaxStress;
    private int mMinAltitude;
    private int mMinBpm;
    private int mMinPace;
    private int mMinSpeed;
    private int mMinSpm;
    private int mMinStress;
    private int mMode;
    private int mPace;
    private int mRestDuration;
    private int mSpeed;
    private int mSpm;
    private int mStart;
    private int mStep;
    private int mUndefined;

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

    public BleWorkout2() {
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
        int r15 = 0;
        int r16 = 0;
        int r17 = 0;
        int r18 = 0;
        int r19 = 0;
        int r20 = 0;
        int r21 = 0;
        int r22 = 0;
        int r23 = 0;
        int r24 = 0;
        int r25 = 0;
        int r26 = 0;
        int r27 = 0;
        int r28 = 0;
        int r29 = 0;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, 536870911, null);
    }

    public static /* synthetic */ BleWorkout2 copy$default(BleWorkout2 r17, int r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26, int r27, int r28, int r29, int r30, int r31, int r32, int r33, int r34, int r35, int r36, int r37, int r38, int r39, int r40, int r41, int r42, int r43, int r44, int r45, int r46, int r47, Object r48) {
        if ((r47 & 1) == 0) goto L5;
        int r2 = r17.mStart;
    L7:
        if ((r47 & 2) == 0) goto L9;
        int r3 = r17.mEnd;
    L11:
        if ((r47 & 4) == 0) goto L13;
        int r4 = r17.mDuration;
    L15:
        if ((r47 & 8) == 0) goto L17;
        int r5 = r17.mAltitude;
    L19:
        if ((r47 & 16) == 0) goto L21;
        int r6 = r17.mAirPressure;
    L23:
        if ((r47 & 32) == 0) goto L25;
        int r7 = r17.mSpm;
    L27:
        if ((r47 & 64) == 0) goto L29;
        int r8 = r17.mMode;
    L31:
        if ((r47 & 128) == 0) goto L33;
        int r9 = r17.mStep;
    L35:
        if ((r47 & 256) == 0) goto L37;
        int r10 = r17.mDistance;
    L39:
        if ((r47 & 512) == 0) goto L41;
        int r11 = r17.mCalorie;
    L43:
        if ((r47 & 1024) == 0) goto L45;
        int r12 = r17.mSpeed;
    L47:
        if ((r47 & 2048) == 0) goto L49;
        int r13 = r17.mPace;
    L51:
        if ((r47 & 4096) == 0) goto L53;
        int r14 = r17.mAvgBpm;
    L55:
        if ((r47 & 8192) == 0) goto L57;
        int r15 = r17.mMaxBpm;
    L58:
        int r110 = r2;
        if ((r47 & 16384) == 0) goto L61;
        int r16 = r17.mMinBpm;
    L63:
        if ((r47 & 32768) == 0) goto L65;
        int r1 = r17.mUndefined;
    L66:
        int r111 = r1;
        if ((r47 & 65536) == 0) goto L69;
        int r49 = r17.mMaxSpm;
    L70:
        int r210 = r49;
        if ((r47 & 131072) == 0) goto L73;
        int r50 = r17.mMinSpm;
    L74:
        int r211 = r50;
        if ((r47 & 262144) == 0) goto L77;
        int r51 = r17.mMaxPace;
    L78:
        int r212 = r51;
        if ((r47 & 524288) == 0) goto L81;
        int r52 = r17.mMinPace;
    L82:
        int r213 = r52;
        if ((r47 & 1048576) == 0) goto L85;
        int r53 = r17.mMaxAltitude;
    L86:
        int r214 = r53;
        if ((r47 & 2097152) == 0) goto L89;
        int r54 = r17.mMinAltitude;
    L90:
        int r215 = r54;
        if ((r47 & 4194304) == 0) goto L93;
        int r55 = r17.mMinStress;
    L94:
        int r216 = r55;
        if ((r47 & 8388608) == 0) goto L97;
        int r56 = r17.mMaxStress;
    L98:
        int r217 = r56;
        if ((r47 & 16777216) == 0) goto L101;
        int r57 = r17.mAvgStress;
    L102:
        int r218 = r57;
        if ((r47 & 33554432) == 0) goto L105;
        int r58 = r17.mMaxSpeed;
    L106:
        int r219 = r58;
        if ((r47 & 67108864) == 0) goto L109;
        int r59 = r17.mMinSpeed;
    L110:
        int r310 = r59;
        if ((r47 & 134217728) == 0) goto L113;
        int r60 = r17.mRestDuration;
    L115:
        if ((r47 & 268435456) == 0) goto L118;
        int r311 = r60;
        int r410 = r311;
        int r411 = r17.mAltitudeclimb;
    L120:
        return r17.copy(r110, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r111, r210, r211, r212, r213, r214, r215, r216, r217, r218, r219, r310, r410, r411);
    L118:
        r411 = r46;
        r410 = r60;
        goto L120
    L113:
        r60 = r45;
        goto L115
    L109:
        r59 = r44;
        goto L110
    L105:
        r58 = r43;
        goto L106
    L101:
        r57 = r42;
        goto L102
    L97:
        r56 = r41;
        goto L98
    L93:
        r55 = r40;
        goto L94
    L89:
        r54 = r39;
        goto L90
    L85:
        r53 = r38;
        goto L86
    L81:
        r52 = r37;
        goto L82
    L77:
        r51 = r36;
        goto L78
    L73:
        r50 = r35;
        goto L74
    L69:
        r49 = r34;
        goto L70
    L65:
        r1 = r33;
        goto L66
    L61:
        r16 = r32;
        goto L63
    L57:
        r15 = r31;
        goto L58
    L53:
        r14 = r30;
        goto L55
    L49:
        r13 = r29;
        goto L51
    L45:
        r12 = r28;
        goto L47
    L41:
        r11 = r27;
        goto L43
    L37:
        r10 = r26;
        goto L39
    L33:
        r9 = r25;
        goto L35
    L29:
        r8 = r24;
        goto L31
    L25:
        r7 = r23;
        goto L27
    L21:
        r6 = r22;
        goto L23
    L17:
        r5 = r21;
        goto L19
    L13:
        r4 = r20;
        goto L15
    L9:
        r3 = r19;
        goto L11
    L5:
        r2 = r18;
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

    public final int component15() {
        return this.mMinBpm;
    }

    public final int component16() {
        return this.mUndefined;
    }

    public final int component17() {
        return this.mMaxSpm;
    }

    public final int component18() {
        return this.mMinSpm;
    }

    public final int component19() {
        return this.mMaxPace;
    }

    public final int component2() {
        return this.mEnd;
    }

    public final int component20() {
        return this.mMinPace;
    }

    public final int component21() {
        return this.mMaxAltitude;
    }

    public final int component22() {
        return this.mMinAltitude;
    }

    public final int component23() {
        return this.mMinStress;
    }

    public final int component24() {
        return this.mMaxStress;
    }

    public final int component25() {
        return this.mAvgStress;
    }

    public final int component26() {
        return this.mMaxSpeed;
    }

    public final int component27() {
        return this.mMinSpeed;
    }

    public final int component28() {
        return this.mRestDuration;
    }

    public final int component29() {
        return this.mAltitudeclimb;
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
    public final BleWorkout2 copy(int r31, int r32, int r33, int r34, int r35, int r36, int r37, int r38, int r39, int r40, int r41, int r42, int r43, int r44, int r45, int r46, int r47, int r48, int r49, int r50, int r51, int r52, int r53, int r54, int r55, int r56, int r57, int r58, int r59) {
        return new BleWorkout2(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59);
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
        this.mMinBpm = readUInt8();
        this.mUndefined = readInt8();
        this.mMaxSpm = BleReadable.readInt16$default(this, null, 1, null);
        this.mMinSpm = BleReadable.readInt16$default(this, null, 1, null);
        this.mMaxPace = BleReadable.readInt32$default(this, null, 1, null);
        this.mMinPace = BleReadable.readInt32$default(this, null, 1, null);
        this.mMaxAltitude = BleReadable.readInt16$default(this, null, 1, null);
        this.mMinAltitude = BleReadable.readInt16$default(this, null, 1, null);
        this.mMinStress = readUInt8();
        this.mMaxStress = readUInt8();
        this.mAvgStress = readUInt8();
        this.mMaxSpeed = BleReadable.readInt32$default(this, null, 1, null);
        this.mMinSpeed = BleReadable.readInt32$default(this, null, 1, null);
        this.mRestDuration = BleReadable.readInt32$default(this, null, 1, null);
        this.mAltitudeclimb = BleReadable.readInt32$default(this, null, 1, null);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleWorkout2) == true) goto L8;
        return false;
    L8:
        BleWorkout2 r6 = (BleWorkout2) r5;
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
        if (this.mMaxBpm == r6.mMaxBpm) goto L51;
        return false;
    L51:
        if (this.mMinBpm == r6.mMinBpm) goto L54;
        return false;
    L54:
        if (this.mUndefined == r6.mUndefined) goto L57;
        return false;
    L57:
        if (this.mMaxSpm == r6.mMaxSpm) goto L60;
        return false;
    L60:
        if (this.mMinSpm == r6.mMinSpm) goto L63;
        return false;
    L63:
        if (this.mMaxPace == r6.mMaxPace) goto L66;
        return false;
    L66:
        if (this.mMinPace == r6.mMinPace) goto L69;
        return false;
    L69:
        if (this.mMaxAltitude == r6.mMaxAltitude) goto L72;
        return false;
    L72:
        if (this.mMinAltitude == r6.mMinAltitude) goto L75;
        return false;
    L75:
        if (this.mMinStress == r6.mMinStress) goto L78;
        return false;
    L78:
        if (this.mMaxStress == r6.mMaxStress) goto L81;
        return false;
    L81:
        if (this.mAvgStress == r6.mAvgStress) goto L84;
        return false;
    L84:
        if (this.mMaxSpeed == r6.mMaxSpeed) goto L87;
        return false;
    L87:
        if (this.mMinSpeed == r6.mMinSpeed) goto L90;
        return false;
    L90:
        if (this.mRestDuration == r6.mRestDuration) goto L93;
        return false;
    L93:
        if (this.mAltitudeclimb == r6.mAltitudeclimb) goto L95;
        return false;
    L95:
        return true;
    }

    public final int getMAirPressure() {
        return this.mAirPressure;
    }

    public final int getMAltitude() {
        return this.mAltitude;
    }

    public final int getMAltitudeclimb() {
        return this.mAltitudeclimb;
    }

    public final int getMAvgBpm() {
        return this.mAvgBpm;
    }

    public final int getMAvgStress() {
        return this.mAvgStress;
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

    public final int getMMaxAltitude() {
        return this.mMaxAltitude;
    }

    public final int getMMaxBpm() {
        return this.mMaxBpm;
    }

    public final int getMMaxPace() {
        return this.mMaxPace;
    }

    public final int getMMaxSpeed() {
        return this.mMaxSpeed;
    }

    public final int getMMaxSpm() {
        return this.mMaxSpm;
    }

    public final int getMMaxStress() {
        return this.mMaxStress;
    }

    public final int getMMinAltitude() {
        return this.mMinAltitude;
    }

    public final int getMMinBpm() {
        return this.mMinBpm;
    }

    public final int getMMinPace() {
        return this.mMinPace;
    }

    public final int getMMinSpeed() {
        return this.mMinSpeed;
    }

    public final int getMMinSpm() {
        return this.mMinSpm;
    }

    public final int getMMinStress() {
        return this.mMinStress;
    }

    public final int getMMode() {
        return this.mMode;
    }

    public final int getMPace() {
        return this.mPace;
    }

    public final int getMRestDuration() {
        return this.mRestDuration;
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

    public final int getMUndefined() {
        return this.mUndefined;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((Integer.hashCode(this.mStart) * 31) + Integer.hashCode(this.mEnd)) * 31) + Integer.hashCode(this.mDuration)) * 31) + Integer.hashCode(this.mAltitude)) * 31) + Integer.hashCode(this.mAirPressure)) * 31) + Integer.hashCode(this.mSpm)) * 31) + Integer.hashCode(this.mMode)) * 31) + Integer.hashCode(this.mStep)) * 31) + Integer.hashCode(this.mDistance)) * 31) + Integer.hashCode(this.mCalorie)) * 31) + Integer.hashCode(this.mSpeed)) * 31) + Integer.hashCode(this.mPace)) * 31) + Integer.hashCode(this.mAvgBpm)) * 31) + Integer.hashCode(this.mMaxBpm)) * 31) + Integer.hashCode(this.mMinBpm)) * 31) + Integer.hashCode(this.mUndefined)) * 31) + Integer.hashCode(this.mMaxSpm)) * 31) + Integer.hashCode(this.mMinSpm)) * 31) + Integer.hashCode(this.mMaxPace)) * 31) + Integer.hashCode(this.mMinPace)) * 31) + Integer.hashCode(this.mMaxAltitude)) * 31) + Integer.hashCode(this.mMinAltitude)) * 31) + Integer.hashCode(this.mMinStress)) * 31) + Integer.hashCode(this.mMaxStress)) * 31) + Integer.hashCode(this.mAvgStress)) * 31) + Integer.hashCode(this.mMaxSpeed)) * 31) + Integer.hashCode(this.mMinSpeed)) * 31) + Integer.hashCode(this.mRestDuration)) * 31) + Integer.hashCode(this.mAltitudeclimb);
    }

    public final void setMAirPressure(int r1) {
        this.mAirPressure = r1;
    }

    public final void setMAltitude(int r1) {
        this.mAltitude = r1;
    }

    public final void setMAltitudeclimb(int r1) {
        this.mAltitudeclimb = r1;
    }

    public final void setMAvgBpm(int r1) {
        this.mAvgBpm = r1;
    }

    public final void setMAvgStress(int r1) {
        this.mAvgStress = r1;
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

    public final void setMMaxAltitude(int r1) {
        this.mMaxAltitude = r1;
    }

    public final void setMMaxBpm(int r1) {
        this.mMaxBpm = r1;
    }

    public final void setMMaxPace(int r1) {
        this.mMaxPace = r1;
    }

    public final void setMMaxSpeed(int r1) {
        this.mMaxSpeed = r1;
    }

    public final void setMMaxSpm(int r1) {
        this.mMaxSpm = r1;
    }

    public final void setMMaxStress(int r1) {
        this.mMaxStress = r1;
    }

    public final void setMMinAltitude(int r1) {
        this.mMinAltitude = r1;
    }

    public final void setMMinBpm(int r1) {
        this.mMinBpm = r1;
    }

    public final void setMMinPace(int r1) {
        this.mMinPace = r1;
    }

    public final void setMMinSpeed(int r1) {
        this.mMinSpeed = r1;
    }

    public final void setMMinSpm(int r1) {
        this.mMinSpm = r1;
    }

    public final void setMMinStress(int r1) {
        this.mMinStress = r1;
    }

    public final void setMMode(int r1) {
        this.mMode = r1;
    }

    public final void setMPace(int r1) {
        this.mPace = r1;
    }

    public final void setMRestDuration(int r1) {
        this.mRestDuration = r1;
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

    public final void setMUndefined(int r1) {
        this.mUndefined = r1;
    }

    @aa1
    public String toString() {
        return "BleWorkout2(mStart=" + this.mStart + ", mEnd=" + this.mEnd + ", mDuration=" + this.mDuration + ", mAltitude=" + this.mAltitude + ", mAirPressure=" + this.mAirPressure + ", mSpm=" + this.mSpm + ", mMode=" + this.mMode + ", mStep=" + this.mStep + ", mDistance=" + this.mDistance + ", mCalorie=" + this.mCalorie + ", mSpeed=" + this.mSpeed + ", mPace=" + this.mPace + ", mAvgBpm=" + this.mAvgBpm + ", mMaxBpm=" + this.mMaxBpm + ", mMinBpm=" + this.mMinBpm + ", mUndefined=" + this.mUndefined + ", mMaxSpm=" + this.mMaxSpm + ", mMinSpm=" + this.mMinSpm + ", mMaxPace=" + this.mMaxPace + ", mMinPace=" + this.mMinPace + ", mMaxAltitude=" + this.mMaxAltitude + ", mMinAltitude=" + this.mMinAltitude + ", mMinStress=" + this.mMinStress + ", mMaxStress=" + this.mMaxStress + ", mAvgStress=" + this.mAvgStress + ", mMaxSpeed=" + this.mMaxSpeed + ", mMinSpeed=" + this.mMinSpeed + ", mRestDuration=" + this.mRestDuration + ", mAltitudeclimb=" + this.mAltitudeclimb + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleWorkout2(int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26, int r27, int r28, int r29) {
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
        this.mMinBpm = r15;
        this.mUndefined = r16;
        this.mMaxSpm = r17;
        this.mMinSpm = r18;
        this.mMaxPace = r19;
        this.mMinPace = r20;
        this.mMaxAltitude = r21;
        this.mMinAltitude = r22;
        this.mMinStress = r23;
        this.mMaxStress = r24;
        this.mAvgStress = r25;
        this.mMaxSpeed = r26;
        this.mMinSpeed = r27;
        this.mRestDuration = r28;
        this.mAltitudeclimb = r29;
    }

    public /* synthetic */ BleWorkout2(int r31, int r32, int r33, int r34, int r35, int r36, int r37, int r38, int r39, int r40, int r41, int r42, int r43, int r44, int r45, int r46, int r47, int r48, int r49, int r50, int r51, int r52, int r53, int r54, int r55, int r56, int r57, int r58, int r59, int r60, DefaultConstructorMarker r61) {
        if ((r60 & 1) == 0) goto L5;
        int r1 = 0;
    L7:
        if ((r60 & 2) == 0) goto L9;
        int r3 = 0;
    L11:
        if ((r60 & 4) == 0) goto L13;
        int r4 = 0;
    L15:
        if ((r60 & 8) == 0) goto L17;
        int r5 = 0;
    L19:
        if ((r60 & 16) == 0) goto L21;
        int r6 = 0;
    L23:
        if ((r60 & 32) == 0) goto L25;
        int r7 = 0;
    L27:
        if ((r60 & 64) == 0) goto L29;
        int r8 = 0;
    L31:
        if ((r60 & 128) == 0) goto L33;
        int r9 = 0;
    L35:
        if ((r60 & 256) == 0) goto L37;
        int r10 = 0;
    L39:
        if ((r60 & 512) == 0) goto L41;
        int r11 = 0;
    L43:
        if ((r60 & 1024) == 0) goto L45;
        int r12 = 0;
    L47:
        if ((r60 & 2048) == 0) goto L49;
        int r13 = 0;
    L51:
        if ((r60 & 4096) == 0) goto L53;
        int r14 = 0;
    L55:
        if ((r60 & 8192) == 0) goto L57;
        int r15 = 0;
    L59:
        if ((r60 & 16384) == 0) goto L61;
        int r2 = 0;
    L63:
        if ((r60 & 32768) == 0) goto L65;
        int r16 = 0;
    L67:
        if ((r60 & 65536) == 0) goto L69;
        int r17 = 0;
    L71:
        if ((r60 & 131072) == 0) goto L73;
        int r18 = 0;
    L75:
        if ((r60 & 262144) == 0) goto L77;
        int r19 = 0;
    L79:
        if ((r60 & 524288) == 0) goto L81;
        int r20 = 0;
    L83:
        if ((r60 & 1048576) == 0) goto L85;
        int r21 = 0;
    L87:
        if ((r60 & 2097152) == 0) goto L89;
        int r22 = 0;
    L91:
        if ((r60 & 4194304) == 0) goto L93;
        int r23 = 0;
    L95:
        if ((r60 & 8388608) == 0) goto L97;
        int r24 = 0;
    L99:
        if ((r60 & 16777216) == 0) goto L101;
        int r25 = 0;
    L103:
        if ((r60 & 33554432) == 0) goto L105;
        int r26 = 0;
    L107:
        if ((r60 & 67108864) == 0) goto L109;
        int r27 = 0;
    L111:
        if ((r60 & 134217728) == 0) goto L113;
        int r28 = 0;
    L115:
        if ((r60 & 268435456) == 0) goto L118;
        int r62 = 0;
    L119:
        this(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r2, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r62);
        return;
    L118:
        r62 = r59;
        goto L119
    L113:
        r28 = r58;
        goto L115
    L109:
        r27 = r57;
        goto L111
    L105:
        r26 = r56;
        goto L107
    L101:
        r25 = r55;
        goto L103
    L97:
        r24 = r54;
        goto L99
    L93:
        r23 = r53;
        goto L95
    L89:
        r22 = r52;
        goto L91
    L85:
        r21 = r51;
        goto L87
    L81:
        r20 = r50;
        goto L83
    L77:
        r19 = r49;
        goto L79
    L73:
        r18 = r48;
        goto L75
    L69:
        r17 = r47;
        goto L71
    L65:
        r16 = r46;
        goto L67
    L61:
        r2 = r45;
        goto L63
    L57:
        r15 = r44;
        goto L59
    L53:
        r14 = r43;
        goto L55
    L49:
        r13 = r42;
        goto L51
    L45:
        r12 = r41;
        goto L47
    L41:
        r11 = r40;
        goto L43
    L37:
        r10 = r39;
        goto L39
    L33:
        r9 = r38;
        goto L35
    L29:
        r8 = r37;
        goto L31
    L25:
        r7 = r36;
        goto L27
    L21:
        r6 = r35;
        goto L23
    L17:
        r5 = r34;
        goto L19
    L13:
        r4 = r33;
        goto L15
    L9:
        r3 = r32;
        goto L11
    L5:
        r1 = r31;
        goto L7
    }
}
