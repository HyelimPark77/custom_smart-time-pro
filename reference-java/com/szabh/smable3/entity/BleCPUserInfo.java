package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleCPUserInfo extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int FEMALE = 0;
    public static final int ITEM_LENGTH = 51;
    public static final int MALE = 1;
    private int isCP;
    private int mAge;
    private int mBloodOxygen;
    private int mBloodOxygenSwitch;
    private int mCalorie;
    private int mDateTogether;
    private int mDistance;
    private int mDistanceSwitch;
    private int mGender;
    private int mHeartRate;
    private int mHeartRateSwitch;
    private int mPressure;
    private int mPressureSwitch;
    private int mStep;
    private int mStepGoal;
    private int mStepSwitch;
    private int mTemperature;
    private int mTemperatureSwitch;

    @aa1
    private String mUserName;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleCPUserInfo() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 524287, null);
    }

    public static /* synthetic */ BleCPUserInfo copy$default(BleCPUserInfo bleCPUserInfo, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, String str, int i19, Object obj) {
        String str2;
        int i20;
        int i21 = (i19 & 1) != 0 ? bleCPUserInfo.isCP : i;
        int i22 = (i19 & 2) != 0 ? bleCPUserInfo.mGender : i2;
        int i23 = (i19 & 4) != 0 ? bleCPUserInfo.mAge : i3;
        int i24 = (i19 & 8) != 0 ? bleCPUserInfo.mStepSwitch : i4;
        int i25 = (i19 & 16) != 0 ? bleCPUserInfo.mHeartRateSwitch : i5;
        int i26 = (i19 & 32) != 0 ? bleCPUserInfo.mTemperatureSwitch : i6;
        int i27 = (i19 & 64) != 0 ? bleCPUserInfo.mBloodOxygenSwitch : i7;
        int i28 = (i19 & 128) != 0 ? bleCPUserInfo.mPressureSwitch : i8;
        int i29 = (i19 & 256) != 0 ? bleCPUserInfo.mDistanceSwitch : i9;
        int i30 = (i19 & 512) != 0 ? bleCPUserInfo.mHeartRate : i10;
        int i31 = (i19 & 1024) != 0 ? bleCPUserInfo.mBloodOxygen : i11;
        int i32 = (i19 & 2048) != 0 ? bleCPUserInfo.mPressure : i12;
        int i33 = (i19 & 4096) != 0 ? bleCPUserInfo.mTemperature : i13;
        int i34 = (i19 & 8192) != 0 ? bleCPUserInfo.mStep : i14;
        int i35 = i21;
        int i36 = (i19 & 16384) != 0 ? bleCPUserInfo.mStepGoal : i15;
        int i37 = (i19 & 32768) != 0 ? bleCPUserInfo.mCalorie : i16;
        int i38 = (i19 & 65536) != 0 ? bleCPUserInfo.mDistance : i17;
        int i39 = (i19 & 131072) != 0 ? bleCPUserInfo.mDateTogether : i18;
        if ((i19 & 262144) != 0) {
            i20 = i39;
            str2 = bleCPUserInfo.mUserName;
        } else {
            str2 = str;
            i20 = i39;
        }
        return bleCPUserInfo.copy(i35, i22, i23, i24, i25, i26, i27, i28, i29, i30, i31, i32, i33, i34, i36, i37, i38, i20, str2);
    }

    public final int component1() {
        return this.isCP;
    }

    public final int component10() {
        return this.mHeartRate;
    }

    public final int component11() {
        return this.mBloodOxygen;
    }

    public final int component12() {
        return this.mPressure;
    }

    public final int component13() {
        return this.mTemperature;
    }

    public final int component14() {
        return this.mStep;
    }

    public final int component15() {
        return this.mStepGoal;
    }

    public final int component16() {
        return this.mCalorie;
    }

    public final int component17() {
        return this.mDistance;
    }

    public final int component18() {
        return this.mDateTogether;
    }

    @aa1
    public final String component19() {
        return this.mUserName;
    }

    public final int component2() {
        return this.mGender;
    }

    public final int component3() {
        return this.mAge;
    }

    public final int component4() {
        return this.mStepSwitch;
    }

    public final int component5() {
        return this.mHeartRateSwitch;
    }

    public final int component6() {
        return this.mTemperatureSwitch;
    }

    public final int component7() {
        return this.mBloodOxygenSwitch;
    }

    public final int component8() {
        return this.mPressureSwitch;
    }

    public final int component9() {
        return this.mDistanceSwitch;
    }

    @aa1
    public final BleCPUserInfo copy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, @aa1 String mUserName) {
        Intrinsics.X0O(mUserName, "mUserName");
        return new BleCPUserInfo(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, mUserName);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.isCP = readUInt8();
        this.mGender = readUInt8();
        this.mAge = readUInt8();
        this.mStepSwitch = readIntN(1);
        this.mHeartRateSwitch = readIntN(1);
        this.mTemperatureSwitch = readIntN(1);
        this.mBloodOxygenSwitch = readIntN(1);
        this.mPressureSwitch = readIntN(1);
        this.mDistanceSwitch = readIntN(1);
        readIntN(2);
        this.mHeartRate = readUInt8();
        this.mBloodOxygen = readUInt8();
        this.mPressure = readUInt8();
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mTemperature = readInt16(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mStep = readInt32(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mStepGoal = readInt32(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mCalorie = readInt32(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mDistance = readInt32(LITTLE_ENDIAN);
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mDateTogether = readInt32(LITTLE_ENDIAN);
        this.mUserName = BleReadable.readString$default(this, 32, null, 2, null);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.isCP);
        writeInt8(this.mGender);
        writeInt8(this.mAge);
        writeIntN(this.mStepSwitch, 1);
        writeIntN(this.mHeartRateSwitch, 1);
        writeIntN(this.mTemperatureSwitch, 1);
        writeIntN(this.mBloodOxygenSwitch, 1);
        writeIntN(this.mPressureSwitch, 1);
        writeIntN(this.mDistanceSwitch, 1);
        writeIntN(0, 2);
        writeInt8(this.mHeartRate);
        writeInt8(this.mBloodOxygen);
        writeInt8(this.mPressure);
        int i = this.mTemperature;
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt16(i, LITTLE_ENDIAN);
        int i2 = this.mStep;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt32(i2, LITTLE_ENDIAN);
        int i3 = this.mStepGoal;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt32(i3, LITTLE_ENDIAN);
        int i4 = this.mCalorie;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt32(i4, LITTLE_ENDIAN);
        int i5 = this.mDistance;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt32(i5, LITTLE_ENDIAN);
        int i6 = this.mDateTogether;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt32(i6, LITTLE_ENDIAN);
        BleWritable.writeStringWithMax$default(this, this.mUserName, 32, null, 4, null);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleCPUserInfo)) {
            return false;
        }
        BleCPUserInfo bleCPUserInfo = (BleCPUserInfo) obj;
        return this.isCP == bleCPUserInfo.isCP && this.mGender == bleCPUserInfo.mGender && this.mAge == bleCPUserInfo.mAge && this.mStepSwitch == bleCPUserInfo.mStepSwitch && this.mHeartRateSwitch == bleCPUserInfo.mHeartRateSwitch && this.mTemperatureSwitch == bleCPUserInfo.mTemperatureSwitch && this.mBloodOxygenSwitch == bleCPUserInfo.mBloodOxygenSwitch && this.mPressureSwitch == bleCPUserInfo.mPressureSwitch && this.mDistanceSwitch == bleCPUserInfo.mDistanceSwitch && this.mHeartRate == bleCPUserInfo.mHeartRate && this.mBloodOxygen == bleCPUserInfo.mBloodOxygen && this.mPressure == bleCPUserInfo.mPressure && this.mTemperature == bleCPUserInfo.mTemperature && this.mStep == bleCPUserInfo.mStep && this.mStepGoal == bleCPUserInfo.mStepGoal && this.mCalorie == bleCPUserInfo.mCalorie && this.mDistance == bleCPUserInfo.mDistance && this.mDateTogether == bleCPUserInfo.mDateTogether && Intrinsics.XOO0ii0(this.mUserName, bleCPUserInfo.mUserName);
    }

    public final int getMAge() {
        return this.mAge;
    }

    public final int getMBloodOxygen() {
        return this.mBloodOxygen;
    }

    public final int getMBloodOxygenSwitch() {
        return this.mBloodOxygenSwitch;
    }

    public final int getMCalorie() {
        return this.mCalorie;
    }

    public final int getMDateTogether() {
        return this.mDateTogether;
    }

    public final int getMDistance() {
        return this.mDistance;
    }

    public final int getMDistanceSwitch() {
        return this.mDistanceSwitch;
    }

    public final int getMGender() {
        return this.mGender;
    }

    public final int getMHeartRate() {
        return this.mHeartRate;
    }

    public final int getMHeartRateSwitch() {
        return this.mHeartRateSwitch;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 51;
    }

    public final int getMPressure() {
        return this.mPressure;
    }

    public final int getMPressureSwitch() {
        return this.mPressureSwitch;
    }

    public final int getMStep() {
        return this.mStep;
    }

    public final int getMStepGoal() {
        return this.mStepGoal;
    }

    public final int getMStepSwitch() {
        return this.mStepSwitch;
    }

    public final int getMTemperature() {
        return this.mTemperature;
    }

    public final int getMTemperatureSwitch() {
        return this.mTemperatureSwitch;
    }

    @aa1
    public final String getMUserName() {
        return this.mUserName;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((Integer.hashCode(this.isCP) * 31) + Integer.hashCode(this.mGender)) * 31) + Integer.hashCode(this.mAge)) * 31) + Integer.hashCode(this.mStepSwitch)) * 31) + Integer.hashCode(this.mHeartRateSwitch)) * 31) + Integer.hashCode(this.mTemperatureSwitch)) * 31) + Integer.hashCode(this.mBloodOxygenSwitch)) * 31) + Integer.hashCode(this.mPressureSwitch)) * 31) + Integer.hashCode(this.mDistanceSwitch)) * 31) + Integer.hashCode(this.mHeartRate)) * 31) + Integer.hashCode(this.mBloodOxygen)) * 31) + Integer.hashCode(this.mPressure)) * 31) + Integer.hashCode(this.mTemperature)) * 31) + Integer.hashCode(this.mStep)) * 31) + Integer.hashCode(this.mStepGoal)) * 31) + Integer.hashCode(this.mCalorie)) * 31) + Integer.hashCode(this.mDistance)) * 31) + Integer.hashCode(this.mDateTogether)) * 31) + this.mUserName.hashCode();
    }

    public final int isCP() {
        return this.isCP;
    }

    public final void setCP(int i) {
        this.isCP = i;
    }

    public final void setMAge(int i) {
        this.mAge = i;
    }

    public final void setMBloodOxygen(int i) {
        this.mBloodOxygen = i;
    }

    public final void setMBloodOxygenSwitch(int i) {
        this.mBloodOxygenSwitch = i;
    }

    public final void setMCalorie(int i) {
        this.mCalorie = i;
    }

    public final void setMDateTogether(int i) {
        this.mDateTogether = i;
    }

    public final void setMDistance(int i) {
        this.mDistance = i;
    }

    public final void setMDistanceSwitch(int i) {
        this.mDistanceSwitch = i;
    }

    public final void setMGender(int i) {
        this.mGender = i;
    }

    public final void setMHeartRate(int i) {
        this.mHeartRate = i;
    }

    public final void setMHeartRateSwitch(int i) {
        this.mHeartRateSwitch = i;
    }

    public final void setMPressure(int i) {
        this.mPressure = i;
    }

    public final void setMPressureSwitch(int i) {
        this.mPressureSwitch = i;
    }

    public final void setMStep(int i) {
        this.mStep = i;
    }

    public final void setMStepGoal(int i) {
        this.mStepGoal = i;
    }

    public final void setMStepSwitch(int i) {
        this.mStepSwitch = i;
    }

    public final void setMTemperature(int i) {
        this.mTemperature = i;
    }

    public final void setMTemperatureSwitch(int i) {
        this.mTemperatureSwitch = i;
    }

    public final void setMUserName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mUserName = str;
    }

    @aa1
    public String toString() {
        return "BleCPUserInfo(isCP=" + this.isCP + ", mGender=" + this.mGender + ", mAge=" + this.mAge + ", mStepSwitch=" + this.mStepSwitch + ", mHeartRateSwitch=" + this.mHeartRateSwitch + ", mTemperatureSwitch=" + this.mTemperatureSwitch + ", mBloodOxygenSwitch=" + this.mBloodOxygenSwitch + ", mPressureSwitch=" + this.mPressureSwitch + ", mDistanceSwitch=" + this.mDistanceSwitch + ", mHeartRate=" + this.mHeartRate + ", mBloodOxygen=" + this.mBloodOxygen + ", mPressure=" + this.mPressure + ", mTemperature=" + this.mTemperature + ", mStep=" + this.mStep + ", mStepGoal=" + this.mStepGoal + ", mCalorie=" + this.mCalorie + ", mDistance=" + this.mDistance + ", mDateTogether=" + this.mDateTogether + ", mUserName=" + this.mUserName + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleCPUserInfo(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, @aa1 String mUserName) {
        Intrinsics.X0O(mUserName, "mUserName");
        this.isCP = i;
        this.mGender = i2;
        this.mAge = i3;
        this.mStepSwitch = i4;
        this.mHeartRateSwitch = i5;
        this.mTemperatureSwitch = i6;
        this.mBloodOxygenSwitch = i7;
        this.mPressureSwitch = i8;
        this.mDistanceSwitch = i9;
        this.mHeartRate = i10;
        this.mBloodOxygen = i11;
        this.mPressure = i12;
        this.mTemperature = i13;
        this.mStep = i14;
        this.mStepGoal = i15;
        this.mCalorie = i16;
        this.mDistance = i17;
        this.mDateTogether = i18;
        this.mUserName = mUserName;
    }

    public /* synthetic */ BleCPUserInfo(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, String str, int i19, DefaultConstructorMarker defaultConstructorMarker) {
        this((i19 & 1) != 0 ? 0 : i, (i19 & 2) != 0 ? 0 : i2, (i19 & 4) != 0 ? 0 : i3, (i19 & 8) != 0 ? 0 : i4, (i19 & 16) != 0 ? 0 : i5, (i19 & 32) != 0 ? 0 : i6, (i19 & 64) != 0 ? 0 : i7, (i19 & 128) != 0 ? 0 : i8, (i19 & 256) != 0 ? 0 : i9, (i19 & 512) != 0 ? 0 : i10, (i19 & 1024) != 0 ? 0 : i11, (i19 & 2048) != 0 ? 0 : i12, (i19 & 4096) != 0 ? 0 : i13, (i19 & 8192) != 0 ? 0 : i14, (i19 & 16384) != 0 ? 0 : i15, (i19 & 32768) != 0 ? 0 : i16, (i19 & 65536) != 0 ? 0 : i17, (i19 & 131072) != 0 ? 0 : i18, (i19 & 262144) != 0 ? "" : str);
    }
}
