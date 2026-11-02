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
@Entity(indices = {@Index(unique = true, value = {"mMeasurementId"})})
public final class BloodGlucose2 {

    @ColumnInfo
    private int mCompletedProgress;

    @ColumnInfo
    private final int mCurrentLevel;

    @aa1
    @ColumnInfo
    private String mEndTime;

    @ColumnInfo
    private int mFasting;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo
    private final int mId;

    @aa1
    @ColumnInfo
    private final String mInsights;

    @ColumnInfo
    private int mIsDelete;

    @ColumnInfo
    private int mIsSync;

    @aa1
    @ColumnInfo
    private final String mLocaleInsights;

    @aa1
    @ColumnInfo
    private final String mLocaleTips;

    @ColumnInfo
    private double mLowerBound;

    @aa1
    @ColumnInfo
    private String mMeasurementId;

    @aa1
    @ColumnInfo
    private String mModelNo;

    @aa1
    @ColumnInfo
    private final String mRiskCode;

    @aa1
    @ColumnInfo
    private String mStartTime;

    @ColumnInfo
    private long mTime;

    @aa1
    @ColumnInfo
    private final String mTips;

    @ColumnInfo
    private double mUpperBound;

    @aa1
    @ColumnInfo
    private String mUserId;

    @ColumnInfo
    private int mWithin2hrsMeal;

    public BloodGlucose2() {
        this(0, 0L, null, null, null, null, null, 0.0d, 0.0d, 0, 0, 0, 0, null, null, null, null, null, 0, 0, 1048575, null);
    }

    public static /* synthetic */ BloodGlucose2 copy$default(BloodGlucose2 bloodGlucose2, int i, long j, String str, String str2, String str3, String str4, String str5, double d, double d2, int i2, int i3, int i4, int i5, String str6, String str7, String str8, String str9, String str10, int i6, int i7, int i8, Object obj) {
        int i9;
        int i10;
        int i11 = (i8 & 1) != 0 ? bloodGlucose2.mId : i;
        long j2 = (i8 & 2) != 0 ? bloodGlucose2.mTime : j;
        String str11 = (i8 & 4) != 0 ? bloodGlucose2.mMeasurementId : str;
        String str12 = (i8 & 8) != 0 ? bloodGlucose2.mUserId : str2;
        String str13 = (i8 & 16) != 0 ? bloodGlucose2.mStartTime : str3;
        String str14 = (i8 & 32) != 0 ? bloodGlucose2.mEndTime : str4;
        String str15 = (i8 & 64) != 0 ? bloodGlucose2.mModelNo : str5;
        double d3 = (i8 & 128) != 0 ? bloodGlucose2.mLowerBound : d;
        double d4 = (i8 & 256) != 0 ? bloodGlucose2.mUpperBound : d2;
        int i12 = (i8 & 512) != 0 ? bloodGlucose2.mFasting : i2;
        int i13 = (i8 & 1024) != 0 ? bloodGlucose2.mWithin2hrsMeal : i3;
        int i14 = i11;
        int i15 = (i8 & 2048) != 0 ? bloodGlucose2.mCompletedProgress : i4;
        int i16 = (i8 & 4096) != 0 ? bloodGlucose2.mCurrentLevel : i5;
        String str16 = (i8 & 8192) != 0 ? bloodGlucose2.mRiskCode : str6;
        String str17 = (i8 & 16384) != 0 ? bloodGlucose2.mInsights : str7;
        String str18 = (i8 & 32768) != 0 ? bloodGlucose2.mTips : str8;
        String str19 = (i8 & 65536) != 0 ? bloodGlucose2.mLocaleInsights : str9;
        String str20 = (i8 & 131072) != 0 ? bloodGlucose2.mLocaleTips : str10;
        int i17 = (i8 & 262144) != 0 ? bloodGlucose2.mIsSync : i6;
        if ((i8 & 524288) != 0) {
            i10 = i17;
            i9 = bloodGlucose2.mIsDelete;
        } else {
            i9 = i7;
            i10 = i17;
        }
        return bloodGlucose2.copy(i14, j2, str11, str12, str13, str14, str15, d3, d4, i12, i13, i15, i16, str16, str17, str18, str19, str20, i10, i9);
    }

    public final int component1() {
        return this.mId;
    }

    public final int component10() {
        return this.mFasting;
    }

    public final int component11() {
        return this.mWithin2hrsMeal;
    }

    public final int component12() {
        return this.mCompletedProgress;
    }

    public final int component13() {
        return this.mCurrentLevel;
    }

    @aa1
    public final String component14() {
        return this.mRiskCode;
    }

    @aa1
    public final String component15() {
        return this.mInsights;
    }

    @aa1
    public final String component16() {
        return this.mTips;
    }

    @aa1
    public final String component17() {
        return this.mLocaleInsights;
    }

    @aa1
    public final String component18() {
        return this.mLocaleTips;
    }

    public final int component19() {
        return this.mIsSync;
    }

    public final long component2() {
        return this.mTime;
    }

    public final int component20() {
        return this.mIsDelete;
    }

    @aa1
    public final String component3() {
        return this.mMeasurementId;
    }

    @aa1
    public final String component4() {
        return this.mUserId;
    }

    @aa1
    public final String component5() {
        return this.mStartTime;
    }

    @aa1
    public final String component6() {
        return this.mEndTime;
    }

    @aa1
    public final String component7() {
        return this.mModelNo;
    }

    public final double component8() {
        return this.mLowerBound;
    }

    public final double component9() {
        return this.mUpperBound;
    }

    @aa1
    public final BloodGlucose2 copy(int i, long j, @aa1 String mMeasurementId, @aa1 String mUserId, @aa1 String mStartTime, @aa1 String mEndTime, @aa1 String mModelNo, double d, double d2, int i2, int i3, int i4, int i5, @aa1 String mRiskCode, @aa1 String mInsights, @aa1 String mTips, @aa1 String mLocaleInsights, @aa1 String mLocaleTips, int i6, int i7) {
        Intrinsics.X0O(mMeasurementId, "mMeasurementId");
        Intrinsics.X0O(mUserId, "mUserId");
        Intrinsics.X0O(mStartTime, "mStartTime");
        Intrinsics.X0O(mEndTime, "mEndTime");
        Intrinsics.X0O(mModelNo, "mModelNo");
        Intrinsics.X0O(mRiskCode, "mRiskCode");
        Intrinsics.X0O(mInsights, "mInsights");
        Intrinsics.X0O(mTips, "mTips");
        Intrinsics.X0O(mLocaleInsights, "mLocaleInsights");
        Intrinsics.X0O(mLocaleTips, "mLocaleTips");
        return new BloodGlucose2(i, j, mMeasurementId, mUserId, mStartTime, mEndTime, mModelNo, d, d2, i2, i3, i4, i5, mRiskCode, mInsights, mTips, mLocaleInsights, mLocaleTips, i6, i7);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BloodGlucose2)) {
            return false;
        }
        BloodGlucose2 bloodGlucose2 = (BloodGlucose2) obj;
        return this.mId == bloodGlucose2.mId && this.mTime == bloodGlucose2.mTime && Intrinsics.XOO0ii0(this.mMeasurementId, bloodGlucose2.mMeasurementId) && Intrinsics.XOO0ii0(this.mUserId, bloodGlucose2.mUserId) && Intrinsics.XOO0ii0(this.mStartTime, bloodGlucose2.mStartTime) && Intrinsics.XOO0ii0(this.mEndTime, bloodGlucose2.mEndTime) && Intrinsics.XOO0ii0(this.mModelNo, bloodGlucose2.mModelNo) && Double.compare(this.mLowerBound, bloodGlucose2.mLowerBound) == 0 && Double.compare(this.mUpperBound, bloodGlucose2.mUpperBound) == 0 && this.mFasting == bloodGlucose2.mFasting && this.mWithin2hrsMeal == bloodGlucose2.mWithin2hrsMeal && this.mCompletedProgress == bloodGlucose2.mCompletedProgress && this.mCurrentLevel == bloodGlucose2.mCurrentLevel && Intrinsics.XOO0ii0(this.mRiskCode, bloodGlucose2.mRiskCode) && Intrinsics.XOO0ii0(this.mInsights, bloodGlucose2.mInsights) && Intrinsics.XOO0ii0(this.mTips, bloodGlucose2.mTips) && Intrinsics.XOO0ii0(this.mLocaleInsights, bloodGlucose2.mLocaleInsights) && Intrinsics.XOO0ii0(this.mLocaleTips, bloodGlucose2.mLocaleTips) && this.mIsSync == bloodGlucose2.mIsSync && this.mIsDelete == bloodGlucose2.mIsDelete;
    }

    public final int getMCompletedProgress() {
        return this.mCompletedProgress;
    }

    public final int getMCurrentLevel() {
        return this.mCurrentLevel;
    }

    @aa1
    public final String getMEndTime() {
        return this.mEndTime;
    }

    public final int getMFasting() {
        return this.mFasting;
    }

    public final int getMId() {
        return this.mId;
    }

    @aa1
    public final String getMInsights() {
        return this.mInsights;
    }

    public final int getMIsDelete() {
        return this.mIsDelete;
    }

    public final int getMIsSync() {
        return this.mIsSync;
    }

    @aa1
    public final String getMLocaleInsights() {
        return this.mLocaleInsights;
    }

    @aa1
    public final String getMLocaleTips() {
        return this.mLocaleTips;
    }

    public final double getMLowerBound() {
        return this.mLowerBound;
    }

    @aa1
    public final String getMMeasurementId() {
        return this.mMeasurementId;
    }

    @aa1
    public final String getMModelNo() {
        return this.mModelNo;
    }

    @aa1
    public final String getMRiskCode() {
        return this.mRiskCode;
    }

    @aa1
    public final String getMStartTime() {
        return this.mStartTime;
    }

    public final long getMTime() {
        return this.mTime;
    }

    @aa1
    public final String getMTips() {
        return this.mTips;
    }

    public final double getMUpperBound() {
        return this.mUpperBound;
    }

    @aa1
    public final String getMUserId() {
        return this.mUserId;
    }

    public final int getMWithin2hrsMeal() {
        return this.mWithin2hrsMeal;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((Integer.hashCode(this.mId) * 31) + Long.hashCode(this.mTime)) * 31) + this.mMeasurementId.hashCode()) * 31) + this.mUserId.hashCode()) * 31) + this.mStartTime.hashCode()) * 31) + this.mEndTime.hashCode()) * 31) + this.mModelNo.hashCode()) * 31) + Double.hashCode(this.mLowerBound)) * 31) + Double.hashCode(this.mUpperBound)) * 31) + Integer.hashCode(this.mFasting)) * 31) + Integer.hashCode(this.mWithin2hrsMeal)) * 31) + Integer.hashCode(this.mCompletedProgress)) * 31) + Integer.hashCode(this.mCurrentLevel)) * 31) + this.mRiskCode.hashCode()) * 31) + this.mInsights.hashCode()) * 31) + this.mTips.hashCode()) * 31) + this.mLocaleInsights.hashCode()) * 31) + this.mLocaleTips.hashCode()) * 31) + Integer.hashCode(this.mIsSync)) * 31) + Integer.hashCode(this.mIsDelete);
    }

    public final void setMCompletedProgress(int i) {
        this.mCompletedProgress = i;
    }

    public final void setMEndTime(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mEndTime = str;
    }

    public final void setMFasting(int i) {
        this.mFasting = i;
    }

    public final void setMIsDelete(int i) {
        this.mIsDelete = i;
    }

    public final void setMIsSync(int i) {
        this.mIsSync = i;
    }

    public final void setMLowerBound(double d) {
        this.mLowerBound = d;
    }

    public final void setMMeasurementId(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mMeasurementId = str;
    }

    public final void setMModelNo(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mModelNo = str;
    }

    public final void setMStartTime(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mStartTime = str;
    }

    public final void setMTime(long j) {
        this.mTime = j;
    }

    public final void setMUpperBound(double d) {
        this.mUpperBound = d;
    }

    public final void setMUserId(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mUserId = str;
    }

    public final void setMWithin2hrsMeal(int i) {
        this.mWithin2hrsMeal = i;
    }

    @aa1
    public String toString() {
        return "BloodGlucose2(mId=" + this.mId + ", mTime=" + this.mTime + ", mMeasurementId=" + this.mMeasurementId + ", mUserId=" + this.mUserId + ", mStartTime=" + this.mStartTime + ", mEndTime=" + this.mEndTime + ", mModelNo=" + this.mModelNo + ", mLowerBound=" + this.mLowerBound + ", mUpperBound=" + this.mUpperBound + ", mFasting=" + this.mFasting + ", mWithin2hrsMeal=" + this.mWithin2hrsMeal + ", mCompletedProgress=" + this.mCompletedProgress + ", mCurrentLevel=" + this.mCurrentLevel + ", mRiskCode=" + this.mRiskCode + ", mInsights=" + this.mInsights + ", mTips=" + this.mTips + ", mLocaleInsights=" + this.mLocaleInsights + ", mLocaleTips=" + this.mLocaleTips + ", mIsSync=" + this.mIsSync + ", mIsDelete=" + this.mIsDelete + I000IiI1O.C2156iO.f1007iO;
    }

    public BloodGlucose2(int i, long j, @aa1 String mMeasurementId, @aa1 String mUserId, @aa1 String mStartTime, @aa1 String mEndTime, @aa1 String mModelNo, double d, double d2, int i2, int i3, int i4, int i5, @aa1 String mRiskCode, @aa1 String mInsights, @aa1 String mTips, @aa1 String mLocaleInsights, @aa1 String mLocaleTips, int i6, int i7) {
        Intrinsics.X0O(mMeasurementId, "mMeasurementId");
        Intrinsics.X0O(mUserId, "mUserId");
        Intrinsics.X0O(mStartTime, "mStartTime");
        Intrinsics.X0O(mEndTime, "mEndTime");
        Intrinsics.X0O(mModelNo, "mModelNo");
        Intrinsics.X0O(mRiskCode, "mRiskCode");
        Intrinsics.X0O(mInsights, "mInsights");
        Intrinsics.X0O(mTips, "mTips");
        Intrinsics.X0O(mLocaleInsights, "mLocaleInsights");
        Intrinsics.X0O(mLocaleTips, "mLocaleTips");
        this.mId = i;
        this.mTime = j;
        this.mMeasurementId = mMeasurementId;
        this.mUserId = mUserId;
        this.mStartTime = mStartTime;
        this.mEndTime = mEndTime;
        this.mModelNo = mModelNo;
        this.mLowerBound = d;
        this.mUpperBound = d2;
        this.mFasting = i2;
        this.mWithin2hrsMeal = i3;
        this.mCompletedProgress = i4;
        this.mCurrentLevel = i5;
        this.mRiskCode = mRiskCode;
        this.mInsights = mInsights;
        this.mTips = mTips;
        this.mLocaleInsights = mLocaleInsights;
        this.mLocaleTips = mLocaleTips;
        this.mIsSync = i6;
        this.mIsDelete = i7;
    }

    public /* synthetic */ BloodGlucose2(int i, long j, String str, String str2, String str3, String str4, String str5, double d, double d2, int i2, int i3, int i4, int i5, String str6, String str7, String str8, String str9, String str10, int i6, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 0 : i, (i8 & 2) != 0 ? 0L : j, (i8 & 4) != 0 ? "" : str, (i8 & 8) != 0 ? "" : str2, (i8 & 16) != 0 ? "" : str3, (i8 & 32) != 0 ? "" : str4, (i8 & 64) != 0 ? "" : str5, (i8 & 128) != 0 ? 0.0d : d, (i8 & 256) == 0 ? d2 : 0.0d, (i8 & 512) != 0 ? 0 : i2, (i8 & 1024) != 0 ? 0 : i3, (i8 & 2048) != 0 ? 0 : i4, (i8 & 4096) != 0 ? 0 : i5, (i8 & 8192) != 0 ? "" : str6, (i8 & 16384) != 0 ? "" : str7, (i8 & 32768) != 0 ? "" : str8, (i8 & 65536) != 0 ? "" : str9, (i8 & 131072) == 0 ? str10 : "", (i8 & 262144) != 0 ? 0 : i6, (i8 & 524288) != 0 ? 0 : i7);
    }
}
