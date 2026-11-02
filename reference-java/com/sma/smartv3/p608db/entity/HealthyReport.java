package com.sma.smartv3.p608db.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Entity(indices = {@Index(unique = true, value = {"mTime"})})
public final class HealthyReport {

    @ColumnInfo
    private int mAbnormalNumber;

    @aa1
    @ColumnInfo
    private String mBloodGlucose2AIRecords;

    @ColumnInfo
    private long mBloodGlucose2Time;

    @ColumnInfo
    private float mBloodGlucose2Value;

    @aa1
    @ColumnInfo
    private String mBloodOxygenAIRecords;

    @ColumnInfo
    private long mBloodOxygenTime;

    @ColumnInfo
    private int mBloodOxygenValue;

    @aa1
    @ColumnInfo
    private String mBloodPressureAIRecords;

    @ColumnInfo
    private long mBloodPressureTime;

    @ColumnInfo
    private int mDiastolicValue;

    @aa1
    @ColumnInfo
    private String mHeartRateAIRecords;

    @ColumnInfo
    private long mHeartRateTime;

    @ColumnInfo
    private int mHeartRateValue;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo
    private final int mId;

    @ColumnInfo
    private int mIsSync;

    @aa1
    @ColumnInfo
    private String mLocalTime;

    @aa1
    @ColumnInfo
    private String mPressureAIRecords;

    @ColumnInfo
    private long mPressureTime;

    @ColumnInfo
    private int mPressureValue;

    @aa1
    @ColumnInfo
    private String mSleepAIRecords;

    @ColumnInfo
    private float mSleepDeepLengthTime;

    @ColumnInfo
    private float mSleepPiecemealTime;

    @ColumnInfo
    private long mSleepTime;

    @ColumnInfo
    private int mSystolicValue;

    @ColumnInfo
    private long mTime;

    @ColumnInfo
    private int mUserGender;

    @ColumnInfo
    private float mUserHeight;

    @ColumnInfo
    private float mUserWeight;

    @aa1
    @ColumnInfo
    private String mWeekSportsAIRecords;

    @ColumnInfo
    private int mWeekSportsAllTime;

    @ColumnInfo
    private int mWeekSportsNumber;

    @ColumnInfo
    private long mWeekSportsTime;

    @aa1
    @ColumnInfo
    private String mWeightAIRecords;

    @ColumnInfo
    private long mWeightTime;

    @ColumnInfo
    private float mWeightValue;

    public HealthyReport() {
        this(0, 0, 0.0f, 0.0f, 0L, null, 0, 0L, 0, null, 0L, 0, 0, null, 0L, 0, null, 0L, 0.0f, 0.0f, null, 0L, 0, null, 0L, 0.0f, null, 0L, 0.0f, null, 0L, 0, 0, null, 0, -1, 7, null);
    }

    public static /* synthetic */ HealthyReport copy$default(HealthyReport healthyReport, int i, int i2, float f, float f2, long j, String str, int i3, long j2, int i4, String str2, long j3, int i5, int i6, String str3, long j4, int i7, String str4, long j5, float f3, float f4, String str5, long j6, int i8, String str6, long j7, float f5, String str7, long j8, float f6, String str8, long j9, int i9, int i10, String str9, int i11, int i12, int i13, Object obj) {
        int i14;
        String str10;
        int i15 = (i12 & 1) != 0 ? healthyReport.mId : i;
        int i16 = (i12 & 2) != 0 ? healthyReport.mUserGender : i2;
        float f7 = (i12 & 4) != 0 ? healthyReport.mUserWeight : f;
        float f8 = (i12 & 8) != 0 ? healthyReport.mUserHeight : f2;
        long j10 = (i12 & 16) != 0 ? healthyReport.mTime : j;
        String str11 = (i12 & 32) != 0 ? healthyReport.mLocalTime : str;
        int i17 = (i12 & 64) != 0 ? healthyReport.mAbnormalNumber : i3;
        long j11 = (i12 & 128) != 0 ? healthyReport.mHeartRateTime : j2;
        int i18 = (i12 & 256) != 0 ? healthyReport.mHeartRateValue : i4;
        String str12 = (i12 & 512) != 0 ? healthyReport.mHeartRateAIRecords : str2;
        long j12 = (i12 & 1024) != 0 ? healthyReport.mBloodPressureTime : j3;
        int i19 = i15;
        int i20 = (i12 & 2048) != 0 ? healthyReport.mSystolicValue : i5;
        int i21 = (i12 & 4096) != 0 ? healthyReport.mDiastolicValue : i6;
        String str13 = (i12 & 8192) != 0 ? healthyReport.mBloodPressureAIRecords : str3;
        long j13 = (i12 & 16384) != 0 ? healthyReport.mBloodOxygenTime : j4;
        int i22 = (i12 & 32768) != 0 ? healthyReport.mBloodOxygenValue : i7;
        String str14 = (i12 & 65536) != 0 ? healthyReport.mBloodOxygenAIRecords : str4;
        long j14 = (i12 & 131072) != 0 ? healthyReport.mSleepTime : j5;
        float f9 = (i12 & 262144) != 0 ? healthyReport.mSleepDeepLengthTime : f3;
        float f10 = (i12 & 524288) != 0 ? healthyReport.mSleepPiecemealTime : f4;
        float f11 = f9;
        String str15 = (i12 & 1048576) != 0 ? healthyReport.mSleepAIRecords : str5;
        float f12 = f10;
        long j15 = (i12 & 2097152) != 0 ? healthyReport.mPressureTime : j6;
        int i23 = (i12 & 4194304) != 0 ? healthyReport.mPressureValue : i8;
        String str16 = (i12 & 8388608) != 0 ? healthyReport.mPressureAIRecords : str6;
        long j16 = (i12 & 16777216) != 0 ? healthyReport.mBloodGlucose2Time : j7;
        float f13 = (i12 & 33554432) != 0 ? healthyReport.mBloodGlucose2Value : f5;
        String str17 = (i12 & 67108864) != 0 ? healthyReport.mBloodGlucose2AIRecords : str7;
        long j17 = (i12 & 134217728) != 0 ? healthyReport.mWeightTime : j8;
        float f14 = (i12 & 268435456) != 0 ? healthyReport.mWeightValue : f6;
        String str18 = (i12 & 536870912) != 0 ? healthyReport.mWeightAIRecords : str8;
        long j18 = (i12 & 1073741824) != 0 ? healthyReport.mWeekSportsTime : j9;
        int i24 = (i12 & Integer.MIN_VALUE) != 0 ? healthyReport.mWeekSportsNumber : i9;
        int i25 = (i13 & 1) != 0 ? healthyReport.mWeekSportsAllTime : i10;
        int i26 = i24;
        String str19 = (i13 & 2) != 0 ? healthyReport.mWeekSportsAIRecords : str9;
        if ((i13 & 4) != 0) {
            str10 = str19;
            i14 = healthyReport.mIsSync;
        } else {
            i14 = i11;
            str10 = str19;
        }
        return healthyReport.copy(i19, i16, f7, f8, j10, str11, i17, j11, i18, str12, j12, i20, i21, str13, j13, i22, str14, j14, f11, f12, str15, j15, i23, str16, j16, f13, str17, j17, f14, str18, j18, i26, i25, str10, i14);
    }

    public final int component1() {
        return this.mId;
    }

    @aa1
    public final String component10() {
        return this.mHeartRateAIRecords;
    }

    public final long component11() {
        return this.mBloodPressureTime;
    }

    public final int component12() {
        return this.mSystolicValue;
    }

    public final int component13() {
        return this.mDiastolicValue;
    }

    @aa1
    public final String component14() {
        return this.mBloodPressureAIRecords;
    }

    public final long component15() {
        return this.mBloodOxygenTime;
    }

    public final int component16() {
        return this.mBloodOxygenValue;
    }

    @aa1
    public final String component17() {
        return this.mBloodOxygenAIRecords;
    }

    public final long component18() {
        return this.mSleepTime;
    }

    public final float component19() {
        return this.mSleepDeepLengthTime;
    }

    public final int component2() {
        return this.mUserGender;
    }

    public final float component20() {
        return this.mSleepPiecemealTime;
    }

    @aa1
    public final String component21() {
        return this.mSleepAIRecords;
    }

    public final long component22() {
        return this.mPressureTime;
    }

    public final int component23() {
        return this.mPressureValue;
    }

    @aa1
    public final String component24() {
        return this.mPressureAIRecords;
    }

    public final long component25() {
        return this.mBloodGlucose2Time;
    }

    public final float component26() {
        return this.mBloodGlucose2Value;
    }

    @aa1
    public final String component27() {
        return this.mBloodGlucose2AIRecords;
    }

    public final long component28() {
        return this.mWeightTime;
    }

    public final float component29() {
        return this.mWeightValue;
    }

    public final float component3() {
        return this.mUserWeight;
    }

    @aa1
    public final String component30() {
        return this.mWeightAIRecords;
    }

    public final long component31() {
        return this.mWeekSportsTime;
    }

    public final int component32() {
        return this.mWeekSportsNumber;
    }

    public final int component33() {
        return this.mWeekSportsAllTime;
    }

    @aa1
    public final String component34() {
        return this.mWeekSportsAIRecords;
    }

    public final int component35() {
        return this.mIsSync;
    }

    public final float component4() {
        return this.mUserHeight;
    }

    public final long component5() {
        return this.mTime;
    }

    @aa1
    public final String component6() {
        return this.mLocalTime;
    }

    public final int component7() {
        return this.mAbnormalNumber;
    }

    public final long component8() {
        return this.mHeartRateTime;
    }

    public final int component9() {
        return this.mHeartRateValue;
    }

    @aa1
    public final HealthyReport copy(int i, int i2, float f, float f2, long j, @aa1 String mLocalTime, int i3, long j2, int i4, @aa1 String mHeartRateAIRecords, long j3, int i5, int i6, @aa1 String mBloodPressureAIRecords, long j4, int i7, @aa1 String mBloodOxygenAIRecords, long j5, float f3, float f4, @aa1 String mSleepAIRecords, long j6, int i8, @aa1 String mPressureAIRecords, long j7, float f5, @aa1 String mBloodGlucose2AIRecords, long j8, float f6, @aa1 String mWeightAIRecords, long j9, int i9, int i10, @aa1 String mWeekSportsAIRecords, int i11) {
        Intrinsics.X0O(mLocalTime, "mLocalTime");
        Intrinsics.X0O(mHeartRateAIRecords, "mHeartRateAIRecords");
        Intrinsics.X0O(mBloodPressureAIRecords, "mBloodPressureAIRecords");
        Intrinsics.X0O(mBloodOxygenAIRecords, "mBloodOxygenAIRecords");
        Intrinsics.X0O(mSleepAIRecords, "mSleepAIRecords");
        Intrinsics.X0O(mPressureAIRecords, "mPressureAIRecords");
        Intrinsics.X0O(mBloodGlucose2AIRecords, "mBloodGlucose2AIRecords");
        Intrinsics.X0O(mWeightAIRecords, "mWeightAIRecords");
        Intrinsics.X0O(mWeekSportsAIRecords, "mWeekSportsAIRecords");
        return new HealthyReport(i, i2, f, f2, j, mLocalTime, i3, j2, i4, mHeartRateAIRecords, j3, i5, i6, mBloodPressureAIRecords, j4, i7, mBloodOxygenAIRecords, j5, f3, f4, mSleepAIRecords, j6, i8, mPressureAIRecords, j7, f5, mBloodGlucose2AIRecords, j8, f6, mWeightAIRecords, j9, i9, i10, mWeekSportsAIRecords, i11);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HealthyReport)) {
            return false;
        }
        HealthyReport healthyReport = (HealthyReport) obj;
        return this.mId == healthyReport.mId && this.mUserGender == healthyReport.mUserGender && Float.compare(this.mUserWeight, healthyReport.mUserWeight) == 0 && Float.compare(this.mUserHeight, healthyReport.mUserHeight) == 0 && this.mTime == healthyReport.mTime && Intrinsics.XOO0ii0(this.mLocalTime, healthyReport.mLocalTime) && this.mAbnormalNumber == healthyReport.mAbnormalNumber && this.mHeartRateTime == healthyReport.mHeartRateTime && this.mHeartRateValue == healthyReport.mHeartRateValue && Intrinsics.XOO0ii0(this.mHeartRateAIRecords, healthyReport.mHeartRateAIRecords) && this.mBloodPressureTime == healthyReport.mBloodPressureTime && this.mSystolicValue == healthyReport.mSystolicValue && this.mDiastolicValue == healthyReport.mDiastolicValue && Intrinsics.XOO0ii0(this.mBloodPressureAIRecords, healthyReport.mBloodPressureAIRecords) && this.mBloodOxygenTime == healthyReport.mBloodOxygenTime && this.mBloodOxygenValue == healthyReport.mBloodOxygenValue && Intrinsics.XOO0ii0(this.mBloodOxygenAIRecords, healthyReport.mBloodOxygenAIRecords) && this.mSleepTime == healthyReport.mSleepTime && Float.compare(this.mSleepDeepLengthTime, healthyReport.mSleepDeepLengthTime) == 0 && Float.compare(this.mSleepPiecemealTime, healthyReport.mSleepPiecemealTime) == 0 && Intrinsics.XOO0ii0(this.mSleepAIRecords, healthyReport.mSleepAIRecords) && this.mPressureTime == healthyReport.mPressureTime && this.mPressureValue == healthyReport.mPressureValue && Intrinsics.XOO0ii0(this.mPressureAIRecords, healthyReport.mPressureAIRecords) && this.mBloodGlucose2Time == healthyReport.mBloodGlucose2Time && Float.compare(this.mBloodGlucose2Value, healthyReport.mBloodGlucose2Value) == 0 && Intrinsics.XOO0ii0(this.mBloodGlucose2AIRecords, healthyReport.mBloodGlucose2AIRecords) && this.mWeightTime == healthyReport.mWeightTime && Float.compare(this.mWeightValue, healthyReport.mWeightValue) == 0 && Intrinsics.XOO0ii0(this.mWeightAIRecords, healthyReport.mWeightAIRecords) && this.mWeekSportsTime == healthyReport.mWeekSportsTime && this.mWeekSportsNumber == healthyReport.mWeekSportsNumber && this.mWeekSportsAllTime == healthyReport.mWeekSportsAllTime && Intrinsics.XOO0ii0(this.mWeekSportsAIRecords, healthyReport.mWeekSportsAIRecords) && this.mIsSync == healthyReport.mIsSync;
    }

    public final int getMAbnormalNumber() {
        return this.mAbnormalNumber;
    }

    @aa1
    public final String getMBloodGlucose2AIRecords() {
        return this.mBloodGlucose2AIRecords;
    }

    public final long getMBloodGlucose2Time() {
        return this.mBloodGlucose2Time;
    }

    public final float getMBloodGlucose2Value() {
        return this.mBloodGlucose2Value;
    }

    @aa1
    public final String getMBloodOxygenAIRecords() {
        return this.mBloodOxygenAIRecords;
    }

    public final long getMBloodOxygenTime() {
        return this.mBloodOxygenTime;
    }

    public final int getMBloodOxygenValue() {
        return this.mBloodOxygenValue;
    }

    @aa1
    public final String getMBloodPressureAIRecords() {
        return this.mBloodPressureAIRecords;
    }

    public final long getMBloodPressureTime() {
        return this.mBloodPressureTime;
    }

    public final int getMDiastolicValue() {
        return this.mDiastolicValue;
    }

    @aa1
    public final String getMHeartRateAIRecords() {
        return this.mHeartRateAIRecords;
    }

    public final long getMHeartRateTime() {
        return this.mHeartRateTime;
    }

    public final int getMHeartRateValue() {
        return this.mHeartRateValue;
    }

    public final int getMId() {
        return this.mId;
    }

    public final int getMIsSync() {
        return this.mIsSync;
    }

    @aa1
    public final String getMLocalTime() {
        return this.mLocalTime;
    }

    @aa1
    public final String getMPressureAIRecords() {
        return this.mPressureAIRecords;
    }

    public final long getMPressureTime() {
        return this.mPressureTime;
    }

    public final int getMPressureValue() {
        return this.mPressureValue;
    }

    @aa1
    public final String getMSleepAIRecords() {
        return this.mSleepAIRecords;
    }

    public final float getMSleepDeepLengthTime() {
        return this.mSleepDeepLengthTime;
    }

    public final float getMSleepPiecemealTime() {
        return this.mSleepPiecemealTime;
    }

    public final long getMSleepTime() {
        return this.mSleepTime;
    }

    public final int getMSystolicValue() {
        return this.mSystolicValue;
    }

    public final long getMTime() {
        return this.mTime;
    }

    public final int getMUserGender() {
        return this.mUserGender;
    }

    public final float getMUserHeight() {
        return this.mUserHeight;
    }

    public final float getMUserWeight() {
        return this.mUserWeight;
    }

    @aa1
    public final String getMWeekSportsAIRecords() {
        return this.mWeekSportsAIRecords;
    }

    public final int getMWeekSportsAllTime() {
        return this.mWeekSportsAllTime;
    }

    public final int getMWeekSportsNumber() {
        return this.mWeekSportsNumber;
    }

    public final long getMWeekSportsTime() {
        return this.mWeekSportsTime;
    }

    @aa1
    public final String getMWeightAIRecords() {
        return this.mWeightAIRecords;
    }

    public final long getMWeightTime() {
        return this.mWeightTime;
    }

    public final float getMWeightValue() {
        return this.mWeightValue;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((Integer.hashCode(this.mId) * 31) + Integer.hashCode(this.mUserGender)) * 31) + Float.hashCode(this.mUserWeight)) * 31) + Float.hashCode(this.mUserHeight)) * 31) + Long.hashCode(this.mTime)) * 31) + this.mLocalTime.hashCode()) * 31) + Integer.hashCode(this.mAbnormalNumber)) * 31) + Long.hashCode(this.mHeartRateTime)) * 31) + Integer.hashCode(this.mHeartRateValue)) * 31) + this.mHeartRateAIRecords.hashCode()) * 31) + Long.hashCode(this.mBloodPressureTime)) * 31) + Integer.hashCode(this.mSystolicValue)) * 31) + Integer.hashCode(this.mDiastolicValue)) * 31) + this.mBloodPressureAIRecords.hashCode()) * 31) + Long.hashCode(this.mBloodOxygenTime)) * 31) + Integer.hashCode(this.mBloodOxygenValue)) * 31) + this.mBloodOxygenAIRecords.hashCode()) * 31) + Long.hashCode(this.mSleepTime)) * 31) + Float.hashCode(this.mSleepDeepLengthTime)) * 31) + Float.hashCode(this.mSleepPiecemealTime)) * 31) + this.mSleepAIRecords.hashCode()) * 31) + Long.hashCode(this.mPressureTime)) * 31) + Integer.hashCode(this.mPressureValue)) * 31) + this.mPressureAIRecords.hashCode()) * 31) + Long.hashCode(this.mBloodGlucose2Time)) * 31) + Float.hashCode(this.mBloodGlucose2Value)) * 31) + this.mBloodGlucose2AIRecords.hashCode()) * 31) + Long.hashCode(this.mWeightTime)) * 31) + Float.hashCode(this.mWeightValue)) * 31) + this.mWeightAIRecords.hashCode()) * 31) + Long.hashCode(this.mWeekSportsTime)) * 31) + Integer.hashCode(this.mWeekSportsNumber)) * 31) + Integer.hashCode(this.mWeekSportsAllTime)) * 31) + this.mWeekSportsAIRecords.hashCode()) * 31) + Integer.hashCode(this.mIsSync);
    }

    public final void setMAbnormalNumber(int i) {
        this.mAbnormalNumber = i;
    }

    public final void setMBloodGlucose2AIRecords(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mBloodGlucose2AIRecords = str;
    }

    public final void setMBloodGlucose2Time(long j) {
        this.mBloodGlucose2Time = j;
    }

    public final void setMBloodGlucose2Value(float f) {
        this.mBloodGlucose2Value = f;
    }

    public final void setMBloodOxygenAIRecords(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mBloodOxygenAIRecords = str;
    }

    public final void setMBloodOxygenTime(long j) {
        this.mBloodOxygenTime = j;
    }

    public final void setMBloodOxygenValue(int i) {
        this.mBloodOxygenValue = i;
    }

    public final void setMBloodPressureAIRecords(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mBloodPressureAIRecords = str;
    }

    public final void setMBloodPressureTime(long j) {
        this.mBloodPressureTime = j;
    }

    public final void setMDiastolicValue(int i) {
        this.mDiastolicValue = i;
    }

    public final void setMHeartRateAIRecords(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mHeartRateAIRecords = str;
    }

    public final void setMHeartRateTime(long j) {
        this.mHeartRateTime = j;
    }

    public final void setMHeartRateValue(int i) {
        this.mHeartRateValue = i;
    }

    public final void setMIsSync(int i) {
        this.mIsSync = i;
    }

    public final void setMLocalTime(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mLocalTime = str;
    }

    public final void setMPressureAIRecords(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mPressureAIRecords = str;
    }

    public final void setMPressureTime(long j) {
        this.mPressureTime = j;
    }

    public final void setMPressureValue(int i) {
        this.mPressureValue = i;
    }

    public final void setMSleepAIRecords(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mSleepAIRecords = str;
    }

    public final void setMSleepDeepLengthTime(float f) {
        this.mSleepDeepLengthTime = f;
    }

    public final void setMSleepPiecemealTime(float f) {
        this.mSleepPiecemealTime = f;
    }

    public final void setMSleepTime(long j) {
        this.mSleepTime = j;
    }

    public final void setMSystolicValue(int i) {
        this.mSystolicValue = i;
    }

    public final void setMTime(long j) {
        this.mTime = j;
    }

    public final void setMUserGender(int i) {
        this.mUserGender = i;
    }

    public final void setMUserHeight(float f) {
        this.mUserHeight = f;
    }

    public final void setMUserWeight(float f) {
        this.mUserWeight = f;
    }

    public final void setMWeekSportsAIRecords(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mWeekSportsAIRecords = str;
    }

    public final void setMWeekSportsAllTime(int i) {
        this.mWeekSportsAllTime = i;
    }

    public final void setMWeekSportsNumber(int i) {
        this.mWeekSportsNumber = i;
    }

    public final void setMWeekSportsTime(long j) {
        this.mWeekSportsTime = j;
    }

    public final void setMWeightAIRecords(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mWeightAIRecords = str;
    }

    public final void setMWeightTime(long j) {
        this.mWeightTime = j;
    }

    public final void setMWeightValue(float f) {
        this.mWeightValue = f;
    }

    @aa1
    public String toString() {
        return "HealthyReport(mId=" + this.mId + ", mUserGender=" + this.mUserGender + ", mUserWeight=" + this.mUserWeight + ", mUserHeight=" + this.mUserHeight + ", mTime=" + this.mTime + ", mLocalTime=" + this.mLocalTime + ", mAbnormalNumber=" + this.mAbnormalNumber + ", mHeartRateTime=" + this.mHeartRateTime + ", mHeartRateValue=" + this.mHeartRateValue + ", mHeartRateAIRecords=" + this.mHeartRateAIRecords + ", mBloodPressureTime=" + this.mBloodPressureTime + ", mSystolicValue=" + this.mSystolicValue + ", mDiastolicValue=" + this.mDiastolicValue + ", mBloodPressureAIRecords=" + this.mBloodPressureAIRecords + ", mBloodOxygenTime=" + this.mBloodOxygenTime + ", mBloodOxygenValue=" + this.mBloodOxygenValue + ", mBloodOxygenAIRecords=" + this.mBloodOxygenAIRecords + ", mSleepTime=" + this.mSleepTime + ", mSleepDeepLengthTime=" + this.mSleepDeepLengthTime + ", mSleepPiecemealTime=" + this.mSleepPiecemealTime + ", mSleepAIRecords=" + this.mSleepAIRecords + ", mPressureTime=" + this.mPressureTime + ", mPressureValue=" + this.mPressureValue + ", mPressureAIRecords=" + this.mPressureAIRecords + ", mBloodGlucose2Time=" + this.mBloodGlucose2Time + ", mBloodGlucose2Value=" + this.mBloodGlucose2Value + ", mBloodGlucose2AIRecords=" + this.mBloodGlucose2AIRecords + ", mWeightTime=" + this.mWeightTime + ", mWeightValue=" + this.mWeightValue + ", mWeightAIRecords=" + this.mWeightAIRecords + ", mWeekSportsTime=" + this.mWeekSportsTime + ", mWeekSportsNumber=" + this.mWeekSportsNumber + ", mWeekSportsAllTime=" + this.mWeekSportsAllTime + ", mWeekSportsAIRecords=" + this.mWeekSportsAIRecords + ", mIsSync=" + this.mIsSync + I000IiI1O.C2156iO.f1007iO;
    }

    public HealthyReport(int i, int i2, float f, float f2, long j, @aa1 String mLocalTime, int i3, long j2, int i4, @aa1 String mHeartRateAIRecords, long j3, int i5, int i6, @aa1 String mBloodPressureAIRecords, long j4, int i7, @aa1 String mBloodOxygenAIRecords, long j5, float f3, float f4, @aa1 String mSleepAIRecords, long j6, int i8, @aa1 String mPressureAIRecords, long j7, float f5, @aa1 String mBloodGlucose2AIRecords, long j8, float f6, @aa1 String mWeightAIRecords, long j9, int i9, int i10, @aa1 String mWeekSportsAIRecords, int i11) {
        Intrinsics.X0O(mLocalTime, "mLocalTime");
        Intrinsics.X0O(mHeartRateAIRecords, "mHeartRateAIRecords");
        Intrinsics.X0O(mBloodPressureAIRecords, "mBloodPressureAIRecords");
        Intrinsics.X0O(mBloodOxygenAIRecords, "mBloodOxygenAIRecords");
        Intrinsics.X0O(mSleepAIRecords, "mSleepAIRecords");
        Intrinsics.X0O(mPressureAIRecords, "mPressureAIRecords");
        Intrinsics.X0O(mBloodGlucose2AIRecords, "mBloodGlucose2AIRecords");
        Intrinsics.X0O(mWeightAIRecords, "mWeightAIRecords");
        Intrinsics.X0O(mWeekSportsAIRecords, "mWeekSportsAIRecords");
        this.mId = i;
        this.mUserGender = i2;
        this.mUserWeight = f;
        this.mUserHeight = f2;
        this.mTime = j;
        this.mLocalTime = mLocalTime;
        this.mAbnormalNumber = i3;
        this.mHeartRateTime = j2;
        this.mHeartRateValue = i4;
        this.mHeartRateAIRecords = mHeartRateAIRecords;
        this.mBloodPressureTime = j3;
        this.mSystolicValue = i5;
        this.mDiastolicValue = i6;
        this.mBloodPressureAIRecords = mBloodPressureAIRecords;
        this.mBloodOxygenTime = j4;
        this.mBloodOxygenValue = i7;
        this.mBloodOxygenAIRecords = mBloodOxygenAIRecords;
        this.mSleepTime = j5;
        this.mSleepDeepLengthTime = f3;
        this.mSleepPiecemealTime = f4;
        this.mSleepAIRecords = mSleepAIRecords;
        this.mPressureTime = j6;
        this.mPressureValue = i8;
        this.mPressureAIRecords = mPressureAIRecords;
        this.mBloodGlucose2Time = j7;
        this.mBloodGlucose2Value = f5;
        this.mBloodGlucose2AIRecords = mBloodGlucose2AIRecords;
        this.mWeightTime = j8;
        this.mWeightValue = f6;
        this.mWeightAIRecords = mWeightAIRecords;
        this.mWeekSportsTime = j9;
        this.mWeekSportsNumber = i9;
        this.mWeekSportsAllTime = i10;
        this.mWeekSportsAIRecords = mWeekSportsAIRecords;
        this.mIsSync = i11;
    }

    public /* synthetic */ HealthyReport(int i, int i2, float f, float f2, long j, String str, int i3, long j2, int i4, String str2, long j3, int i5, int i6, String str3, long j4, int i7, String str4, long j5, float f3, float f4, String str5, long j6, int i8, String str6, long j7, float f5, String str7, long j8, float f6, String str8, long j9, int i9, int i10, String str9, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i, (i12 & 2) != 0 ? 0 : i2, (i12 & 4) != 0 ? 170.0f : f, (i12 & 8) != 0 ? 60.0f : f2, (i12 & 16) != 0 ? 0L : j, (i12 & 32) != 0 ? "" : str, (i12 & 64) != 0 ? 0 : i3, (i12 & 128) != 0 ? 0L : j2, (i12 & 256) != 0 ? 0 : i4, (i12 & 512) != 0 ? "" : str2, (i12 & 1024) != 0 ? 0L : j3, (i12 & 2048) != 0 ? 0 : i5, (i12 & 4096) != 0 ? 0 : i6, (i12 & 8192) != 0 ? "" : str3, (i12 & 16384) != 0 ? 0L : j4, (32768 & i12) != 0 ? 0 : i7, (i12 & 65536) != 0 ? "" : str4, (i12 & 131072) != 0 ? 0L : j5, (i12 & 262144) != 0 ? 0.0f : f3, (i12 & 524288) != 0 ? 0.0f : f4, (i12 & 1048576) != 0 ? "" : str5, (i12 & 2097152) != 0 ? 0L : j6, (i12 & 4194304) != 0 ? 0 : i8, (i12 & 8388608) != 0 ? "" : str6, (i12 & 16777216) != 0 ? 0L : j7, (i12 & 33554432) != 0 ? 0.0f : f5, (i12 & 67108864) != 0 ? "" : str7, (i12 & 134217728) != 0 ? 0L : j8, (i12 & 268435456) == 0 ? f6 : 0.0f, (i12 & 536870912) != 0 ? "" : str8, (i12 & 1073741824) != 0 ? 0L : j9, (i12 & Integer.MIN_VALUE) != 0 ? 0 : i9, (i13 & 1) != 0 ? 0 : i10, (i13 & 2) == 0 ? str9 : "", (i13 & 4) != 0 ? 0 : i11);
    }
}
