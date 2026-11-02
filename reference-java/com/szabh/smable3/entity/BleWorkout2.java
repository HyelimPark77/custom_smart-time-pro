package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleWorkout2 extends BleReadable {

    @aa1
    public static final Companion Companion = new Companion(null);
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
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleWorkout2() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 536870911, null);
    }

    public static /* synthetic */ BleWorkout2 copy$default(BleWorkout2 bleWorkout2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, Object obj) {
        int i31;
        int i32;
        int i33 = (i30 & 1) != 0 ? bleWorkout2.mStart : i;
        int i34 = (i30 & 2) != 0 ? bleWorkout2.mEnd : i2;
        int i35 = (i30 & 4) != 0 ? bleWorkout2.mDuration : i3;
        int i36 = (i30 & 8) != 0 ? bleWorkout2.mAltitude : i4;
        int i37 = (i30 & 16) != 0 ? bleWorkout2.mAirPressure : i5;
        int i38 = (i30 & 32) != 0 ? bleWorkout2.mSpm : i6;
        int i39 = (i30 & 64) != 0 ? bleWorkout2.mMode : i7;
        int i40 = (i30 & 128) != 0 ? bleWorkout2.mStep : i8;
        int i41 = (i30 & 256) != 0 ? bleWorkout2.mDistance : i9;
        int i42 = (i30 & 512) != 0 ? bleWorkout2.mCalorie : i10;
        int i43 = (i30 & 1024) != 0 ? bleWorkout2.mSpeed : i11;
        int i44 = (i30 & 2048) != 0 ? bleWorkout2.mPace : i12;
        int i45 = (i30 & 4096) != 0 ? bleWorkout2.mAvgBpm : i13;
        int i46 = (i30 & 8192) != 0 ? bleWorkout2.mMaxBpm : i14;
        int i47 = i33;
        int i48 = (i30 & 16384) != 0 ? bleWorkout2.mMinBpm : i15;
        int i49 = (i30 & 32768) != 0 ? bleWorkout2.mUndefined : i16;
        int i50 = (i30 & 65536) != 0 ? bleWorkout2.mMaxSpm : i17;
        int i51 = (i30 & 131072) != 0 ? bleWorkout2.mMinSpm : i18;
        int i52 = (i30 & 262144) != 0 ? bleWorkout2.mMaxPace : i19;
        int i53 = (i30 & 524288) != 0 ? bleWorkout2.mMinPace : i20;
        int i54 = (i30 & 1048576) != 0 ? bleWorkout2.mMaxAltitude : i21;
        int i55 = (i30 & 2097152) != 0 ? bleWorkout2.mMinAltitude : i22;
        int i56 = (i30 & 4194304) != 0 ? bleWorkout2.mMinStress : i23;
        int i57 = (i30 & 8388608) != 0 ? bleWorkout2.mMaxStress : i24;
        int i58 = (i30 & 16777216) != 0 ? bleWorkout2.mAvgStress : i25;
        int i59 = (i30 & 33554432) != 0 ? bleWorkout2.mMaxSpeed : i26;
        int i60 = (i30 & 67108864) != 0 ? bleWorkout2.mMinSpeed : i27;
        int i61 = (i30 & 134217728) != 0 ? bleWorkout2.mRestDuration : i28;
        if ((i30 & 268435456) != 0) {
            i32 = i61;
            i31 = bleWorkout2.mAltitudeclimb;
        } else {
            i31 = i29;
            i32 = i61;
        }
        return bleWorkout2.copy(i47, i34, i35, i36, i37, i38, i39, i40, i41, i42, i43, i44, i45, i46, i48, i49, i50, i51, i52, i53, i54, i55, i56, i57, i58, i59, i60, i32, i31);
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
    public final BleWorkout2 copy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29) {
        return new BleWorkout2(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, i28, i29);
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

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleWorkout2)) {
            return false;
        }
        BleWorkout2 bleWorkout2 = (BleWorkout2) obj;
        return this.mStart == bleWorkout2.mStart && this.mEnd == bleWorkout2.mEnd && this.mDuration == bleWorkout2.mDuration && this.mAltitude == bleWorkout2.mAltitude && this.mAirPressure == bleWorkout2.mAirPressure && this.mSpm == bleWorkout2.mSpm && this.mMode == bleWorkout2.mMode && this.mStep == bleWorkout2.mStep && this.mDistance == bleWorkout2.mDistance && this.mCalorie == bleWorkout2.mCalorie && this.mSpeed == bleWorkout2.mSpeed && this.mPace == bleWorkout2.mPace && this.mAvgBpm == bleWorkout2.mAvgBpm && this.mMaxBpm == bleWorkout2.mMaxBpm && this.mMinBpm == bleWorkout2.mMinBpm && this.mUndefined == bleWorkout2.mUndefined && this.mMaxSpm == bleWorkout2.mMaxSpm && this.mMinSpm == bleWorkout2.mMinSpm && this.mMaxPace == bleWorkout2.mMaxPace && this.mMinPace == bleWorkout2.mMinPace && this.mMaxAltitude == bleWorkout2.mMaxAltitude && this.mMinAltitude == bleWorkout2.mMinAltitude && this.mMinStress == bleWorkout2.mMinStress && this.mMaxStress == bleWorkout2.mMaxStress && this.mAvgStress == bleWorkout2.mAvgStress && this.mMaxSpeed == bleWorkout2.mMaxSpeed && this.mMinSpeed == bleWorkout2.mMinSpeed && this.mRestDuration == bleWorkout2.mRestDuration && this.mAltitudeclimb == bleWorkout2.mAltitudeclimb;
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

    public final void setMAirPressure(int i) {
        this.mAirPressure = i;
    }

    public final void setMAltitude(int i) {
        this.mAltitude = i;
    }

    public final void setMAltitudeclimb(int i) {
        this.mAltitudeclimb = i;
    }

    public final void setMAvgBpm(int i) {
        this.mAvgBpm = i;
    }

    public final void setMAvgStress(int i) {
        this.mAvgStress = i;
    }

    public final void setMCalorie(int i) {
        this.mCalorie = i;
    }

    public final void setMDistance(int i) {
        this.mDistance = i;
    }

    public final void setMDuration(int i) {
        this.mDuration = i;
    }

    public final void setMEnd(int i) {
        this.mEnd = i;
    }

    public final void setMMaxAltitude(int i) {
        this.mMaxAltitude = i;
    }

    public final void setMMaxBpm(int i) {
        this.mMaxBpm = i;
    }

    public final void setMMaxPace(int i) {
        this.mMaxPace = i;
    }

    public final void setMMaxSpeed(int i) {
        this.mMaxSpeed = i;
    }

    public final void setMMaxSpm(int i) {
        this.mMaxSpm = i;
    }

    public final void setMMaxStress(int i) {
        this.mMaxStress = i;
    }

    public final void setMMinAltitude(int i) {
        this.mMinAltitude = i;
    }

    public final void setMMinBpm(int i) {
        this.mMinBpm = i;
    }

    public final void setMMinPace(int i) {
        this.mMinPace = i;
    }

    public final void setMMinSpeed(int i) {
        this.mMinSpeed = i;
    }

    public final void setMMinSpm(int i) {
        this.mMinSpm = i;
    }

    public final void setMMinStress(int i) {
        this.mMinStress = i;
    }

    public final void setMMode(int i) {
        this.mMode = i;
    }

    public final void setMPace(int i) {
        this.mPace = i;
    }

    public final void setMRestDuration(int i) {
        this.mRestDuration = i;
    }

    public final void setMSpeed(int i) {
        this.mSpeed = i;
    }

    public final void setMSpm(int i) {
        this.mSpm = i;
    }

    public final void setMStart(int i) {
        this.mStart = i;
    }

    public final void setMStep(int i) {
        this.mStep = i;
    }

    public final void setMUndefined(int i) {
        this.mUndefined = i;
    }

    @aa1
    public String toString() {
        return "BleWorkout2(mStart=" + this.mStart + ", mEnd=" + this.mEnd + ", mDuration=" + this.mDuration + ", mAltitude=" + this.mAltitude + ", mAirPressure=" + this.mAirPressure + ", mSpm=" + this.mSpm + ", mMode=" + this.mMode + ", mStep=" + this.mStep + ", mDistance=" + this.mDistance + ", mCalorie=" + this.mCalorie + ", mSpeed=" + this.mSpeed + ", mPace=" + this.mPace + ", mAvgBpm=" + this.mAvgBpm + ", mMaxBpm=" + this.mMaxBpm + ", mMinBpm=" + this.mMinBpm + ", mUndefined=" + this.mUndefined + ", mMaxSpm=" + this.mMaxSpm + ", mMinSpm=" + this.mMinSpm + ", mMaxPace=" + this.mMaxPace + ", mMinPace=" + this.mMinPace + ", mMaxAltitude=" + this.mMaxAltitude + ", mMinAltitude=" + this.mMinAltitude + ", mMinStress=" + this.mMinStress + ", mMaxStress=" + this.mMaxStress + ", mAvgStress=" + this.mAvgStress + ", mMaxSpeed=" + this.mMaxSpeed + ", mMinSpeed=" + this.mMinSpeed + ", mRestDuration=" + this.mRestDuration + ", mAltitudeclimb=" + this.mAltitudeclimb + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleWorkout2(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29) {
        this.mStart = i;
        this.mEnd = i2;
        this.mDuration = i3;
        this.mAltitude = i4;
        this.mAirPressure = i5;
        this.mSpm = i6;
        this.mMode = i7;
        this.mStep = i8;
        this.mDistance = i9;
        this.mCalorie = i10;
        this.mSpeed = i11;
        this.mPace = i12;
        this.mAvgBpm = i13;
        this.mMaxBpm = i14;
        this.mMinBpm = i15;
        this.mUndefined = i16;
        this.mMaxSpm = i17;
        this.mMinSpm = i18;
        this.mMaxPace = i19;
        this.mMinPace = i20;
        this.mMaxAltitude = i21;
        this.mMinAltitude = i22;
        this.mMinStress = i23;
        this.mMaxStress = i24;
        this.mAvgStress = i25;
        this.mMaxSpeed = i26;
        this.mMinSpeed = i27;
        this.mRestDuration = i28;
        this.mAltitudeclimb = i29;
    }

    public /* synthetic */ BleWorkout2(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, DefaultConstructorMarker defaultConstructorMarker) {
        this((i30 & 1) != 0 ? 0 : i, (i30 & 2) != 0 ? 0 : i2, (i30 & 4) != 0 ? 0 : i3, (i30 & 8) != 0 ? 0 : i4, (i30 & 16) != 0 ? 0 : i5, (i30 & 32) != 0 ? 0 : i6, (i30 & 64) != 0 ? 0 : i7, (i30 & 128) != 0 ? 0 : i8, (i30 & 256) != 0 ? 0 : i9, (i30 & 512) != 0 ? 0 : i10, (i30 & 1024) != 0 ? 0 : i11, (i30 & 2048) != 0 ? 0 : i12, (i30 & 4096) != 0 ? 0 : i13, (i30 & 8192) != 0 ? 0 : i14, (i30 & 16384) != 0 ? 0 : i15, (i30 & 32768) != 0 ? 0 : i16, (i30 & 65536) != 0 ? 0 : i17, (i30 & 131072) != 0 ? 0 : i18, (i30 & 262144) != 0 ? 0 : i19, (i30 & 524288) != 0 ? 0 : i20, (i30 & 1048576) != 0 ? 0 : i21, (i30 & 2097152) != 0 ? 0 : i22, (i30 & 4194304) != 0 ? 0 : i23, (i30 & 8388608) != 0 ? 0 : i24, (i30 & 16777216) != 0 ? 0 : i25, (i30 & 33554432) != 0 ? 0 : i26, (i30 & 67108864) != 0 ? 0 : i27, (i30 & 134217728) != 0 ? 0 : i28, (i30 & 268435456) != 0 ? 0 : i29);
    }
}
