package com.sma.smartv3.p608db.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.X01O1XO0i;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.TimeUtils;
import java.io.Serializable;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@TypeConverters({ListDoubleConverter.class})
@Entity(indices = {@Index(unique = true, value = {"mTime"})})
public final class Weight implements Serializable {

    @ColumnInfo
    private double mAgeOfBody;

    @aa1
    @ColumnInfo
    private List<Double> mAgeOfBodyRange;

    @ColumnInfo
    private double mBmi;

    @aa1
    @ColumnInfo
    private List<Double> mBmiRange;

    @aa1
    @ColumnInfo
    private List<Double> mBmiWHORange;

    @ColumnInfo
    private double mBmr;

    @aa1
    @ColumnInfo
    private List<Double> mBmrRange;

    @ColumnInfo
    private double mBodyShape;

    @ColumnInfo
    private double mDesirableWeight;

    @ColumnInfo
    private double mFatFreeBodyWeight;

    @ColumnInfo
    private double mFatToControl;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo
    private final int mId;

    @ColumnInfo
    private double mIdealWeight;

    @ColumnInfo
    private int mIsDelete;

    @ColumnInfo
    private int mIsMeasure;

    @ColumnInfo
    private int mIsSync;

    @ColumnInfo
    private double mLevelOfVisceralFat;

    @aa1
    @ColumnInfo
    private List<Double> mLevelOfVisceralFatRange;

    @aa1
    @ColumnInfo
    private String mLocalTime;

    @ColumnInfo
    private double mMuscleToControl;

    @ColumnInfo
    private double mRatioOfFat;

    @aa1
    @ColumnInfo
    private List<Double> mRatioOfFatRange;

    @ColumnInfo
    private double mRatioOfMuscle;

    @aa1
    @ColumnInfo
    private List<Double> mRatioOfMuscleRange;

    @ColumnInfo
    private double mRatioOfProtein;

    @ColumnInfo
    private int mRatioOfProteinLevel;

    @aa1
    @ColumnInfo
    private List<Double> mRatioOfProteinRange;

    @ColumnInfo
    private double mRatioOfSkeletalMuscle;

    @aa1
    @ColumnInfo
    private List<Double> mRatioOfSkeletalMuscleRange;

    @ColumnInfo
    private double mRatioOfSubcutaneousFat;

    @aa1
    @ColumnInfo
    private List<Double> mRatioOfSubcutaneousFatRange;

    @ColumnInfo
    private double mRatioOfWater;

    @ColumnInfo
    private int mRatioOfWaterLevel;

    @aa1
    @ColumnInfo
    private List<Double> mRatioOfWaterRange;

    @ColumnInfo
    private double mScore;

    @ColumnInfo
    private double mStateOfNutrition;

    @ColumnInfo
    private long mTime;

    @ColumnInfo
    private float mWeight;

    @ColumnInfo
    private double mWeightOfBone;

    @aa1
    @ColumnInfo
    private List<Double> mWeightOfBoneRange;

    @ColumnInfo
    private double mWeightOfFat;

    @aa1
    @ColumnInfo
    private List<Double> mWeightOfFatRange;

    @ColumnInfo
    private double mWeightOfMuscle;

    @aa1
    @ColumnInfo
    private List<Double> mWeightOfMuscleRange;

    @ColumnInfo
    private double mWeightOfProtein;

    @aa1
    @ColumnInfo
    private List<Double> mWeightOfProteinRange;

    @ColumnInfo
    private double mWeightOfSkeletalMuscle;

    @aa1
    @ColumnInfo
    private List<Double> mWeightOfSkeletalMuscleRange;

    @ColumnInfo
    private double mWeightOfWater;

    @aa1
    @ColumnInfo
    private List<Double> mWeightOfWaterRange;

    @aa1
    @ColumnInfo
    private List<Double> mWeightRange;

    @ColumnInfo
    private double mWeightToControl;

    @aa1
    @ColumnInfo
    private List<Double> mWeightWHORange;

    public Weight() {
        this(0, 0L, null, 0.0f, 0, 0, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, null, null, 0.0d, null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, 0.0d, null, 0.0d, null, null, 0.0d, null, 0.0d, null, null, 0.0d, 0.0d, null, null, null, 0.0d, null, 0.0d, null, 0.0d, null, null, 0.0d, null, 0, 0, 0, -1, 2097151, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Weight copy$default(Weight weight, int i, long j, String str, float f, int i2, int i3, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, List list, List list2, List list3, double d10, List list4, double d11, double d12, double d13, double d14, double d15, List list5, double d16, List list6, double d17, List list7, List list8, double d18, List list9, double d19, List list10, List list11, double d20, double d21, List list12, List list13, List list14, double d22, List list15, double d23, List list16, double d24, List list17, List list18, double d25, List list19, int i4, int i5, int i6, int i7, int i8, Object obj) {
        int i9;
        int i10;
        int i11 = (i7 & 1) != 0 ? weight.mId : i;
        long j2 = (i7 & 2) != 0 ? weight.mTime : j;
        String str2 = (i7 & 4) != 0 ? weight.mLocalTime : str;
        float f2 = (i7 & 8) != 0 ? weight.mWeight : f;
        int i12 = (i7 & 16) != 0 ? weight.mIsSync : i2;
        int i13 = (i7 & 32) != 0 ? weight.mIsMeasure : i3;
        double d26 = (i7 & 64) != 0 ? weight.mBmi : d;
        double d27 = (i7 & 128) != 0 ? weight.mRatioOfFat : d2;
        double d28 = (i7 & 256) != 0 ? weight.mWeightOfMuscle : d3;
        int i14 = i11;
        long j3 = j2;
        double d29 = (i7 & 512) != 0 ? weight.mWeightOfFat : d4;
        double d30 = (i7 & 1024) != 0 ? weight.mRatioOfProtein : d5;
        double d31 = (i7 & 2048) != 0 ? weight.mRatioOfWater : d6;
        double d32 = (i7 & 4096) != 0 ? weight.mStateOfNutrition : d7;
        double d33 = (i7 & 8192) != 0 ? weight.mIdealWeight : d8;
        double d34 = (i7 & 16384) != 0 ? weight.mAgeOfBody : d9;
        List list20 = (i7 & 32768) != 0 ? weight.mAgeOfBodyRange : list;
        List list21 = (i7 & 65536) != 0 ? weight.mBmiRange : list2;
        List list22 = (i7 & 131072) != 0 ? weight.mBmiWHORange : list3;
        double d35 = d34;
        double d36 = (i7 & 262144) != 0 ? weight.mBmr : d10;
        List list23 = list22;
        List list24 = (i7 & 524288) != 0 ? weight.mBmrRange : list4;
        double d37 = d36;
        double d38 = (i7 & 1048576) != 0 ? weight.mBodyShape : d11;
        double d39 = (i7 & 2097152) != 0 ? weight.mDesirableWeight : d12;
        double d40 = (i7 & 4194304) != 0 ? weight.mFatFreeBodyWeight : d13;
        double d41 = (i7 & 8388608) != 0 ? weight.mFatToControl : d14;
        double d42 = (i7 & 16777216) != 0 ? weight.mLevelOfVisceralFat : d15;
        List list25 = list24;
        List list26 = (i7 & 33554432) != 0 ? weight.mLevelOfVisceralFatRange : list5;
        double d43 = d42;
        double d44 = (i7 & 67108864) != 0 ? weight.mMuscleToControl : d16;
        List list27 = list26;
        List list28 = (i7 & 134217728) != 0 ? weight.mRatioOfFatRange : list6;
        double d45 = d44;
        double d46 = (i7 & 268435456) != 0 ? weight.mRatioOfMuscle : d17;
        List list29 = list28;
        List list30 = (i7 & 536870912) != 0 ? weight.mRatioOfMuscleRange : list7;
        List list31 = (i7 & 1073741824) != 0 ? weight.mRatioOfProteinRange : list8;
        double d47 = d46;
        double d48 = (i7 & Integer.MIN_VALUE) != 0 ? weight.mRatioOfSkeletalMuscle : d18;
        List list32 = list31;
        List list33 = (i8 & 1) != 0 ? weight.mRatioOfSkeletalMuscleRange : list9;
        double d49 = d48;
        double d50 = (i8 & 2) != 0 ? weight.mRatioOfSubcutaneousFat : d19;
        List list34 = list33;
        List list35 = (i8 & 4) != 0 ? weight.mRatioOfSubcutaneousFatRange : list10;
        List list36 = (i8 & 8) != 0 ? weight.mRatioOfWaterRange : list11;
        double d51 = d50;
        double d52 = (i8 & 16) != 0 ? weight.mScore : d20;
        double d53 = (i8 & 32) != 0 ? weight.mWeightOfBone : d21;
        List list37 = list36;
        List list38 = (i8 & 64) != 0 ? weight.mWeightOfBoneRange : list12;
        List list39 = (i8 & 128) != 0 ? weight.mWeightOfFatRange : list13;
        List list40 = (i8 & 256) != 0 ? weight.mWeightOfMuscleRange : list14;
        double d54 = d53;
        double d55 = (i8 & 512) != 0 ? weight.mWeightOfProtein : d22;
        List list41 = (i8 & 1024) != 0 ? weight.mWeightOfProteinRange : list15;
        double d56 = d55;
        double d57 = (i8 & 2048) != 0 ? weight.mWeightOfSkeletalMuscle : d23;
        List list42 = (i8 & 4096) != 0 ? weight.mWeightOfSkeletalMuscleRange : list16;
        double d58 = d57;
        double d59 = (i8 & 8192) != 0 ? weight.mWeightOfWater : d24;
        List list43 = (i8 & 16384) != 0 ? weight.mWeightOfWaterRange : list17;
        List list44 = (i8 & 32768) != 0 ? weight.mWeightRange : list18;
        double d60 = (i8 & 65536) != 0 ? weight.mWeightToControl : d25;
        List list45 = (i8 & 131072) != 0 ? weight.mWeightWHORange : list19;
        int i15 = (i8 & 262144) != 0 ? weight.mIsDelete : i4;
        List list46 = list45;
        int i16 = (i8 & 524288) != 0 ? weight.mRatioOfProteinLevel : i5;
        if ((i8 & 1048576) != 0) {
            i10 = i16;
            i9 = weight.mRatioOfWaterLevel;
        } else {
            i9 = i6;
            i10 = i16;
        }
        return weight.copy(i14, j3, str2, f2, i12, i13, d26, d27, d28, d29, d30, d31, d32, d33, d35, list20, list21, list23, d37, list25, d38, d39, d40, d41, d43, list27, d45, list29, d47, list30, list32, d49, list34, d51, list35, list37, d52, d54, list38, list39, list40, d56, list41, d58, list42, d59, list43, list44, d60, list46, i15, i10, i9);
    }

    public final int component1() {
        return this.mId;
    }

    public final double component10() {
        return this.mWeightOfFat;
    }

    public final double component11() {
        return this.mRatioOfProtein;
    }

    public final double component12() {
        return this.mRatioOfWater;
    }

    public final double component13() {
        return this.mStateOfNutrition;
    }

    public final double component14() {
        return this.mIdealWeight;
    }

    public final double component15() {
        return this.mAgeOfBody;
    }

    @aa1
    public final List<Double> component16() {
        return this.mAgeOfBodyRange;
    }

    @aa1
    public final List<Double> component17() {
        return this.mBmiRange;
    }

    @aa1
    public final List<Double> component18() {
        return this.mBmiWHORange;
    }

    public final double component19() {
        return this.mBmr;
    }

    public final long component2() {
        return this.mTime;
    }

    @aa1
    public final List<Double> component20() {
        return this.mBmrRange;
    }

    public final double component21() {
        return this.mBodyShape;
    }

    public final double component22() {
        return this.mDesirableWeight;
    }

    public final double component23() {
        return this.mFatFreeBodyWeight;
    }

    public final double component24() {
        return this.mFatToControl;
    }

    public final double component25() {
        return this.mLevelOfVisceralFat;
    }

    @aa1
    public final List<Double> component26() {
        return this.mLevelOfVisceralFatRange;
    }

    public final double component27() {
        return this.mMuscleToControl;
    }

    @aa1
    public final List<Double> component28() {
        return this.mRatioOfFatRange;
    }

    public final double component29() {
        return this.mRatioOfMuscle;
    }

    @aa1
    public final String component3() {
        return this.mLocalTime;
    }

    @aa1
    public final List<Double> component30() {
        return this.mRatioOfMuscleRange;
    }

    @aa1
    public final List<Double> component31() {
        return this.mRatioOfProteinRange;
    }

    public final double component32() {
        return this.mRatioOfSkeletalMuscle;
    }

    @aa1
    public final List<Double> component33() {
        return this.mRatioOfSkeletalMuscleRange;
    }

    public final double component34() {
        return this.mRatioOfSubcutaneousFat;
    }

    @aa1
    public final List<Double> component35() {
        return this.mRatioOfSubcutaneousFatRange;
    }

    @aa1
    public final List<Double> component36() {
        return this.mRatioOfWaterRange;
    }

    public final double component37() {
        return this.mScore;
    }

    public final double component38() {
        return this.mWeightOfBone;
    }

    @aa1
    public final List<Double> component39() {
        return this.mWeightOfBoneRange;
    }

    public final float component4() {
        return this.mWeight;
    }

    @aa1
    public final List<Double> component40() {
        return this.mWeightOfFatRange;
    }

    @aa1
    public final List<Double> component41() {
        return this.mWeightOfMuscleRange;
    }

    public final double component42() {
        return this.mWeightOfProtein;
    }

    @aa1
    public final List<Double> component43() {
        return this.mWeightOfProteinRange;
    }

    public final double component44() {
        return this.mWeightOfSkeletalMuscle;
    }

    @aa1
    public final List<Double> component45() {
        return this.mWeightOfSkeletalMuscleRange;
    }

    public final double component46() {
        return this.mWeightOfWater;
    }

    @aa1
    public final List<Double> component47() {
        return this.mWeightOfWaterRange;
    }

    @aa1
    public final List<Double> component48() {
        return this.mWeightRange;
    }

    public final double component49() {
        return this.mWeightToControl;
    }

    public final int component5() {
        return this.mIsSync;
    }

    @aa1
    public final List<Double> component50() {
        return this.mWeightWHORange;
    }

    public final int component51() {
        return this.mIsDelete;
    }

    public final int component52() {
        return this.mRatioOfProteinLevel;
    }

    public final int component53() {
        return this.mRatioOfWaterLevel;
    }

    public final int component6() {
        return this.mIsMeasure;
    }

    public final double component7() {
        return this.mBmi;
    }

    public final double component8() {
        return this.mRatioOfFat;
    }

    public final double component9() {
        return this.mWeightOfMuscle;
    }

    @aa1
    public final Weight copy(int i, long j, @aa1 String mLocalTime, float f, int i2, int i3, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, @aa1 List<Double> mAgeOfBodyRange, @aa1 List<Double> mBmiRange, @aa1 List<Double> mBmiWHORange, double d10, @aa1 List<Double> mBmrRange, double d11, double d12, double d13, double d14, double d15, @aa1 List<Double> mLevelOfVisceralFatRange, double d16, @aa1 List<Double> mRatioOfFatRange, double d17, @aa1 List<Double> mRatioOfMuscleRange, @aa1 List<Double> mRatioOfProteinRange, double d18, @aa1 List<Double> mRatioOfSkeletalMuscleRange, double d19, @aa1 List<Double> mRatioOfSubcutaneousFatRange, @aa1 List<Double> mRatioOfWaterRange, double d20, double d21, @aa1 List<Double> mWeightOfBoneRange, @aa1 List<Double> mWeightOfFatRange, @aa1 List<Double> mWeightOfMuscleRange, double d22, @aa1 List<Double> mWeightOfProteinRange, double d23, @aa1 List<Double> mWeightOfSkeletalMuscleRange, double d24, @aa1 List<Double> mWeightOfWaterRange, @aa1 List<Double> mWeightRange, double d25, @aa1 List<Double> mWeightWHORange, int i4, int i5, int i6) {
        Intrinsics.X0O(mLocalTime, "mLocalTime");
        Intrinsics.X0O(mAgeOfBodyRange, "mAgeOfBodyRange");
        Intrinsics.X0O(mBmiRange, "mBmiRange");
        Intrinsics.X0O(mBmiWHORange, "mBmiWHORange");
        Intrinsics.X0O(mBmrRange, "mBmrRange");
        Intrinsics.X0O(mLevelOfVisceralFatRange, "mLevelOfVisceralFatRange");
        Intrinsics.X0O(mRatioOfFatRange, "mRatioOfFatRange");
        Intrinsics.X0O(mRatioOfMuscleRange, "mRatioOfMuscleRange");
        Intrinsics.X0O(mRatioOfProteinRange, "mRatioOfProteinRange");
        Intrinsics.X0O(mRatioOfSkeletalMuscleRange, "mRatioOfSkeletalMuscleRange");
        Intrinsics.X0O(mRatioOfSubcutaneousFatRange, "mRatioOfSubcutaneousFatRange");
        Intrinsics.X0O(mRatioOfWaterRange, "mRatioOfWaterRange");
        Intrinsics.X0O(mWeightOfBoneRange, "mWeightOfBoneRange");
        Intrinsics.X0O(mWeightOfFatRange, "mWeightOfFatRange");
        Intrinsics.X0O(mWeightOfMuscleRange, "mWeightOfMuscleRange");
        Intrinsics.X0O(mWeightOfProteinRange, "mWeightOfProteinRange");
        Intrinsics.X0O(mWeightOfSkeletalMuscleRange, "mWeightOfSkeletalMuscleRange");
        Intrinsics.X0O(mWeightOfWaterRange, "mWeightOfWaterRange");
        Intrinsics.X0O(mWeightRange, "mWeightRange");
        Intrinsics.X0O(mWeightWHORange, "mWeightWHORange");
        return new Weight(i, j, mLocalTime, f, i2, i3, d, d2, d3, d4, d5, d6, d7, d8, d9, mAgeOfBodyRange, mBmiRange, mBmiWHORange, d10, mBmrRange, d11, d12, d13, d14, d15, mLevelOfVisceralFatRange, d16, mRatioOfFatRange, d17, mRatioOfMuscleRange, mRatioOfProteinRange, d18, mRatioOfSkeletalMuscleRange, d19, mRatioOfSubcutaneousFatRange, mRatioOfWaterRange, d20, d21, mWeightOfBoneRange, mWeightOfFatRange, mWeightOfMuscleRange, d22, mWeightOfProteinRange, d23, mWeightOfSkeletalMuscleRange, d24, mWeightOfWaterRange, mWeightRange, d25, mWeightWHORange, i4, i5, i6);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Weight)) {
            return false;
        }
        Weight weight = (Weight) obj;
        return this.mId == weight.mId && this.mTime == weight.mTime && Intrinsics.XOO0ii0(this.mLocalTime, weight.mLocalTime) && Float.compare(this.mWeight, weight.mWeight) == 0 && this.mIsSync == weight.mIsSync && this.mIsMeasure == weight.mIsMeasure && Double.compare(this.mBmi, weight.mBmi) == 0 && Double.compare(this.mRatioOfFat, weight.mRatioOfFat) == 0 && Double.compare(this.mWeightOfMuscle, weight.mWeightOfMuscle) == 0 && Double.compare(this.mWeightOfFat, weight.mWeightOfFat) == 0 && Double.compare(this.mRatioOfProtein, weight.mRatioOfProtein) == 0 && Double.compare(this.mRatioOfWater, weight.mRatioOfWater) == 0 && Double.compare(this.mStateOfNutrition, weight.mStateOfNutrition) == 0 && Double.compare(this.mIdealWeight, weight.mIdealWeight) == 0 && Double.compare(this.mAgeOfBody, weight.mAgeOfBody) == 0 && Intrinsics.XOO0ii0(this.mAgeOfBodyRange, weight.mAgeOfBodyRange) && Intrinsics.XOO0ii0(this.mBmiRange, weight.mBmiRange) && Intrinsics.XOO0ii0(this.mBmiWHORange, weight.mBmiWHORange) && Double.compare(this.mBmr, weight.mBmr) == 0 && Intrinsics.XOO0ii0(this.mBmrRange, weight.mBmrRange) && Double.compare(this.mBodyShape, weight.mBodyShape) == 0 && Double.compare(this.mDesirableWeight, weight.mDesirableWeight) == 0 && Double.compare(this.mFatFreeBodyWeight, weight.mFatFreeBodyWeight) == 0 && Double.compare(this.mFatToControl, weight.mFatToControl) == 0 && Double.compare(this.mLevelOfVisceralFat, weight.mLevelOfVisceralFat) == 0 && Intrinsics.XOO0ii0(this.mLevelOfVisceralFatRange, weight.mLevelOfVisceralFatRange) && Double.compare(this.mMuscleToControl, weight.mMuscleToControl) == 0 && Intrinsics.XOO0ii0(this.mRatioOfFatRange, weight.mRatioOfFatRange) && Double.compare(this.mRatioOfMuscle, weight.mRatioOfMuscle) == 0 && Intrinsics.XOO0ii0(this.mRatioOfMuscleRange, weight.mRatioOfMuscleRange) && Intrinsics.XOO0ii0(this.mRatioOfProteinRange, weight.mRatioOfProteinRange) && Double.compare(this.mRatioOfSkeletalMuscle, weight.mRatioOfSkeletalMuscle) == 0 && Intrinsics.XOO0ii0(this.mRatioOfSkeletalMuscleRange, weight.mRatioOfSkeletalMuscleRange) && Double.compare(this.mRatioOfSubcutaneousFat, weight.mRatioOfSubcutaneousFat) == 0 && Intrinsics.XOO0ii0(this.mRatioOfSubcutaneousFatRange, weight.mRatioOfSubcutaneousFatRange) && Intrinsics.XOO0ii0(this.mRatioOfWaterRange, weight.mRatioOfWaterRange) && Double.compare(this.mScore, weight.mScore) == 0 && Double.compare(this.mWeightOfBone, weight.mWeightOfBone) == 0 && Intrinsics.XOO0ii0(this.mWeightOfBoneRange, weight.mWeightOfBoneRange) && Intrinsics.XOO0ii0(this.mWeightOfFatRange, weight.mWeightOfFatRange) && Intrinsics.XOO0ii0(this.mWeightOfMuscleRange, weight.mWeightOfMuscleRange) && Double.compare(this.mWeightOfProtein, weight.mWeightOfProtein) == 0 && Intrinsics.XOO0ii0(this.mWeightOfProteinRange, weight.mWeightOfProteinRange) && Double.compare(this.mWeightOfSkeletalMuscle, weight.mWeightOfSkeletalMuscle) == 0 && Intrinsics.XOO0ii0(this.mWeightOfSkeletalMuscleRange, weight.mWeightOfSkeletalMuscleRange) && Double.compare(this.mWeightOfWater, weight.mWeightOfWater) == 0 && Intrinsics.XOO0ii0(this.mWeightOfWaterRange, weight.mWeightOfWaterRange) && Intrinsics.XOO0ii0(this.mWeightRange, weight.mWeightRange) && Double.compare(this.mWeightToControl, weight.mWeightToControl) == 0 && Intrinsics.XOO0ii0(this.mWeightWHORange, weight.mWeightWHORange) && this.mIsDelete == weight.mIsDelete && this.mRatioOfProteinLevel == weight.mRatioOfProteinLevel && this.mRatioOfWaterLevel == weight.mRatioOfWaterLevel;
    }

    public final double getMAgeOfBody() {
        return this.mAgeOfBody;
    }

    @aa1
    public final List<Double> getMAgeOfBodyRange() {
        return this.mAgeOfBodyRange;
    }

    public final double getMBmi() {
        return this.mBmi;
    }

    @aa1
    public final List<Double> getMBmiRange() {
        return this.mBmiRange;
    }

    @aa1
    public final List<Double> getMBmiWHORange() {
        return this.mBmiWHORange;
    }

    public final double getMBmr() {
        return this.mBmr;
    }

    @aa1
    public final List<Double> getMBmrRange() {
        return this.mBmrRange;
    }

    public final double getMBodyShape() {
        return this.mBodyShape;
    }

    public final double getMDesirableWeight() {
        return this.mDesirableWeight;
    }

    public final double getMFatFreeBodyWeight() {
        return this.mFatFreeBodyWeight;
    }

    public final double getMFatToControl() {
        return this.mFatToControl;
    }

    public final int getMId() {
        return this.mId;
    }

    public final double getMIdealWeight() {
        return this.mIdealWeight;
    }

    public final int getMIsDelete() {
        return this.mIsDelete;
    }

    public final int getMIsMeasure() {
        return this.mIsMeasure;
    }

    public final int getMIsSync() {
        return this.mIsSync;
    }

    public final double getMLevelOfVisceralFat() {
        return this.mLevelOfVisceralFat;
    }

    @aa1
    public final List<Double> getMLevelOfVisceralFatRange() {
        return this.mLevelOfVisceralFatRange;
    }

    @aa1
    public final String getMLocalTime() {
        return this.mLocalTime;
    }

    public final double getMMuscleToControl() {
        return this.mMuscleToControl;
    }

    public final double getMRatioOfFat() {
        return this.mRatioOfFat;
    }

    @aa1
    public final List<Double> getMRatioOfFatRange() {
        return this.mRatioOfFatRange;
    }

    public final double getMRatioOfMuscle() {
        return this.mRatioOfMuscle;
    }

    @aa1
    public final List<Double> getMRatioOfMuscleRange() {
        return this.mRatioOfMuscleRange;
    }

    public final double getMRatioOfProtein() {
        return this.mRatioOfProtein;
    }

    public final int getMRatioOfProteinLevel() {
        return this.mRatioOfProteinLevel;
    }

    @aa1
    public final List<Double> getMRatioOfProteinRange() {
        return this.mRatioOfProteinRange;
    }

    public final double getMRatioOfSkeletalMuscle() {
        return this.mRatioOfSkeletalMuscle;
    }

    @aa1
    public final List<Double> getMRatioOfSkeletalMuscleRange() {
        return this.mRatioOfSkeletalMuscleRange;
    }

    public final double getMRatioOfSubcutaneousFat() {
        return this.mRatioOfSubcutaneousFat;
    }

    @aa1
    public final List<Double> getMRatioOfSubcutaneousFatRange() {
        return this.mRatioOfSubcutaneousFatRange;
    }

    public final double getMRatioOfWater() {
        return this.mRatioOfWater;
    }

    public final int getMRatioOfWaterLevel() {
        return this.mRatioOfWaterLevel;
    }

    @aa1
    public final List<Double> getMRatioOfWaterRange() {
        return this.mRatioOfWaterRange;
    }

    public final double getMScore() {
        return this.mScore;
    }

    public final double getMStateOfNutrition() {
        return this.mStateOfNutrition;
    }

    public final long getMTime() {
        return this.mTime;
    }

    public final float getMWeight() {
        return this.mWeight;
    }

    public final double getMWeightOfBone() {
        return this.mWeightOfBone;
    }

    @aa1
    public final List<Double> getMWeightOfBoneRange() {
        return this.mWeightOfBoneRange;
    }

    public final double getMWeightOfFat() {
        return this.mWeightOfFat;
    }

    @aa1
    public final List<Double> getMWeightOfFatRange() {
        return this.mWeightOfFatRange;
    }

    public final double getMWeightOfMuscle() {
        return this.mWeightOfMuscle;
    }

    @aa1
    public final List<Double> getMWeightOfMuscleRange() {
        return this.mWeightOfMuscleRange;
    }

    public final double getMWeightOfProtein() {
        return this.mWeightOfProtein;
    }

    @aa1
    public final List<Double> getMWeightOfProteinRange() {
        return this.mWeightOfProteinRange;
    }

    public final double getMWeightOfSkeletalMuscle() {
        return this.mWeightOfSkeletalMuscle;
    }

    @aa1
    public final List<Double> getMWeightOfSkeletalMuscleRange() {
        return this.mWeightOfSkeletalMuscleRange;
    }

    public final double getMWeightOfWater() {
        return this.mWeightOfWater;
    }

    @aa1
    public final List<Double> getMWeightOfWaterRange() {
        return this.mWeightOfWaterRange;
    }

    @aa1
    public final List<Double> getMWeightRange() {
        return this.mWeightRange;
    }

    public final double getMWeightToControl() {
        return this.mWeightToControl;
    }

    @aa1
    public final List<Double> getMWeightWHORange() {
        return this.mWeightWHORange;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((Integer.hashCode(this.mId) * 31) + Long.hashCode(this.mTime)) * 31) + this.mLocalTime.hashCode()) * 31) + Float.hashCode(this.mWeight)) * 31) + Integer.hashCode(this.mIsSync)) * 31) + Integer.hashCode(this.mIsMeasure)) * 31) + Double.hashCode(this.mBmi)) * 31) + Double.hashCode(this.mRatioOfFat)) * 31) + Double.hashCode(this.mWeightOfMuscle)) * 31) + Double.hashCode(this.mWeightOfFat)) * 31) + Double.hashCode(this.mRatioOfProtein)) * 31) + Double.hashCode(this.mRatioOfWater)) * 31) + Double.hashCode(this.mStateOfNutrition)) * 31) + Double.hashCode(this.mIdealWeight)) * 31) + Double.hashCode(this.mAgeOfBody)) * 31) + this.mAgeOfBodyRange.hashCode()) * 31) + this.mBmiRange.hashCode()) * 31) + this.mBmiWHORange.hashCode()) * 31) + Double.hashCode(this.mBmr)) * 31) + this.mBmrRange.hashCode()) * 31) + Double.hashCode(this.mBodyShape)) * 31) + Double.hashCode(this.mDesirableWeight)) * 31) + Double.hashCode(this.mFatFreeBodyWeight)) * 31) + Double.hashCode(this.mFatToControl)) * 31) + Double.hashCode(this.mLevelOfVisceralFat)) * 31) + this.mLevelOfVisceralFatRange.hashCode()) * 31) + Double.hashCode(this.mMuscleToControl)) * 31) + this.mRatioOfFatRange.hashCode()) * 31) + Double.hashCode(this.mRatioOfMuscle)) * 31) + this.mRatioOfMuscleRange.hashCode()) * 31) + this.mRatioOfProteinRange.hashCode()) * 31) + Double.hashCode(this.mRatioOfSkeletalMuscle)) * 31) + this.mRatioOfSkeletalMuscleRange.hashCode()) * 31) + Double.hashCode(this.mRatioOfSubcutaneousFat)) * 31) + this.mRatioOfSubcutaneousFatRange.hashCode()) * 31) + this.mRatioOfWaterRange.hashCode()) * 31) + Double.hashCode(this.mScore)) * 31) + Double.hashCode(this.mWeightOfBone)) * 31) + this.mWeightOfBoneRange.hashCode()) * 31) + this.mWeightOfFatRange.hashCode()) * 31) + this.mWeightOfMuscleRange.hashCode()) * 31) + Double.hashCode(this.mWeightOfProtein)) * 31) + this.mWeightOfProteinRange.hashCode()) * 31) + Double.hashCode(this.mWeightOfSkeletalMuscle)) * 31) + this.mWeightOfSkeletalMuscleRange.hashCode()) * 31) + Double.hashCode(this.mWeightOfWater)) * 31) + this.mWeightOfWaterRange.hashCode()) * 31) + this.mWeightRange.hashCode()) * 31) + Double.hashCode(this.mWeightToControl)) * 31) + this.mWeightWHORange.hashCode()) * 31) + Integer.hashCode(this.mIsDelete)) * 31) + Integer.hashCode(this.mRatioOfProteinLevel)) * 31) + Integer.hashCode(this.mRatioOfWaterLevel);
    }

    public final void setBodyFatScale(@aa1 X01O1XO0i bodyFatScale) {
        Intrinsics.X0O(bodyFatScale, "bodyFatScale");
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.mTime = jCurrentTimeMillis;
        String strMillis2String = TimeUtils.millis2String(jCurrentTimeMillis, O0X11OiO.XO0O10());
        Intrinsics.O10IXXX0X(strMillis2String, "millis2String(...)");
        this.mLocalTime = strMillis2String;
        this.mWeight = (float) bodyFatScale.XOO0ii0().iiII();
        this.mIsMeasure = 1;
        this.mBmi = bodyFatScale.XOO0ii0().XO0X10iO();
        this.mRatioOfFat = bodyFatScale.XOO0ii0().IX1XiI();
        this.mWeightOfMuscle = bodyFatScale.XOO0ii0().iOX();
        this.mWeightOfFat = bodyFatScale.XOO0ii0().O101();
        this.mRatioOfProtein = bodyFatScale.XOO0ii0().Xi1i0XOX0();
        this.mRatioOfWater = bodyFatScale.XOO0ii0().iIi1();
        this.mStateOfNutrition = bodyFatScale.XOO0ii0().X1OI();
        this.mIdealWeight = bodyFatScale.XOO0ii0().XOXiX0();
        this.mAgeOfBody = bodyFatScale.XOO0ii0().i0X000X0O();
        this.mAgeOfBodyRange = bodyFatScale.XOO0ii0().i11I();
        this.mBmiRange = bodyFatScale.XOO0ii0().Ii0X0X();
        this.mBmiWHORange = bodyFatScale.XOO0ii0().XXiIiX10();
        this.mBmr = bodyFatScale.XOO0ii0().X00Xi1X();
        this.mBmrRange = bodyFatScale.XOO0ii0().m1376X1();
        this.mBodyShape = bodyFatScale.XOO0ii0().IXOIIIO();
        this.mDesirableWeight = bodyFatScale.XOO0ii0().IO0II0i();
        this.mFatFreeBodyWeight = bodyFatScale.XOO0ii0().IXI();
        this.mFatToControl = bodyFatScale.XOO0ii0().IiiXiI0I();
        this.mLevelOfVisceralFat = bodyFatScale.XOO0ii0().XOO0XOOii();
        this.mLevelOfVisceralFatRange = bodyFatScale.XOO0ii0().iiIOiX();
        this.mMuscleToControl = bodyFatScale.XOO0ii0().m1375Oi();
        this.mRatioOfFatRange = bodyFatScale.XOO0ii0().XXiO0i();
        this.mRatioOfMuscle = bodyFatScale.XOO0ii0().iXi();
        this.mRatioOfMuscleRange = bodyFatScale.XOO0ii0().O0O();
        this.mRatioOfProteinRange = bodyFatScale.XOO0ii0().iii0();
        this.mRatioOfSkeletalMuscle = bodyFatScale.XOO0ii0().Xii11I();
        this.mRatioOfSkeletalMuscleRange = bodyFatScale.XOO0ii0().X0iO();
        this.mRatioOfSubcutaneousFat = bodyFatScale.XOO0ii0().X00O0();
        this.mRatioOfSubcutaneousFatRange = bodyFatScale.XOO0ii0().X111IO();
        this.mRatioOfWaterRange = bodyFatScale.XOO0ii0().i100IXOX();
        this.mScore = bodyFatScale.XOO0ii0().iI0I();
        this.mWeightOfBone = bodyFatScale.XOO0ii0().m1369I0();
        this.mWeightOfBoneRange = bodyFatScale.XOO0ii0().iIi0();
        this.mWeightOfFatRange = bodyFatScale.XOO0ii0().IXiOXO();
        this.mWeightOfMuscleRange = bodyFatScale.XOO0ii0().XXI0XOIX();
        this.mWeightOfProtein = bodyFatScale.XOO0ii0().XIIO11I();
        this.mWeightOfProteinRange = bodyFatScale.XOO0ii0().XXOXi();
        this.mWeightOfSkeletalMuscle = bodyFatScale.XOO0ii0().I0XXi0X();
        this.mWeightOfSkeletalMuscleRange = bodyFatScale.XOO0ii0().IOi1O0();
        this.mWeightOfWater = bodyFatScale.XOO0ii0().m1372O1();
        this.mWeightOfWaterRange = bodyFatScale.XOO0ii0().O1iXiI();
        this.mWeightRange = bodyFatScale.XOO0ii0().IX0iIX();
        this.mWeightToControl = bodyFatScale.XOO0ii0().OXi001();
        this.mWeightWHORange = bodyFatScale.XOO0ii0().I0IIOI();
    }

    public final void setMAgeOfBody(double d) {
        this.mAgeOfBody = d;
    }

    public final void setMAgeOfBodyRange(@aa1 List<Double> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mAgeOfBodyRange = list;
    }

    public final void setMBmi(double d) {
        this.mBmi = d;
    }

    public final void setMBmiRange(@aa1 List<Double> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mBmiRange = list;
    }

    public final void setMBmiWHORange(@aa1 List<Double> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mBmiWHORange = list;
    }

    public final void setMBmr(double d) {
        this.mBmr = d;
    }

    public final void setMBmrRange(@aa1 List<Double> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mBmrRange = list;
    }

    public final void setMBodyShape(double d) {
        this.mBodyShape = d;
    }

    public final void setMDesirableWeight(double d) {
        this.mDesirableWeight = d;
    }

    public final void setMFatFreeBodyWeight(double d) {
        this.mFatFreeBodyWeight = d;
    }

    public final void setMFatToControl(double d) {
        this.mFatToControl = d;
    }

    public final void setMIdealWeight(double d) {
        this.mIdealWeight = d;
    }

    public final void setMIsDelete(int i) {
        this.mIsDelete = i;
    }

    public final void setMIsMeasure(int i) {
        this.mIsMeasure = i;
    }

    public final void setMIsSync(int i) {
        this.mIsSync = i;
    }

    public final void setMLevelOfVisceralFat(double d) {
        this.mLevelOfVisceralFat = d;
    }

    public final void setMLevelOfVisceralFatRange(@aa1 List<Double> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mLevelOfVisceralFatRange = list;
    }

    public final void setMLocalTime(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mLocalTime = str;
    }

    public final void setMMuscleToControl(double d) {
        this.mMuscleToControl = d;
    }

    public final void setMRatioOfFat(double d) {
        this.mRatioOfFat = d;
    }

    public final void setMRatioOfFatRange(@aa1 List<Double> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mRatioOfFatRange = list;
    }

    public final void setMRatioOfMuscle(double d) {
        this.mRatioOfMuscle = d;
    }

    public final void setMRatioOfMuscleRange(@aa1 List<Double> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mRatioOfMuscleRange = list;
    }

    public final void setMRatioOfProtein(double d) {
        this.mRatioOfProtein = d;
    }

    public final void setMRatioOfProteinLevel(int i) {
        this.mRatioOfProteinLevel = i;
    }

    public final void setMRatioOfProteinRange(@aa1 List<Double> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mRatioOfProteinRange = list;
    }

    public final void setMRatioOfSkeletalMuscle(double d) {
        this.mRatioOfSkeletalMuscle = d;
    }

    public final void setMRatioOfSkeletalMuscleRange(@aa1 List<Double> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mRatioOfSkeletalMuscleRange = list;
    }

    public final void setMRatioOfSubcutaneousFat(double d) {
        this.mRatioOfSubcutaneousFat = d;
    }

    public final void setMRatioOfSubcutaneousFatRange(@aa1 List<Double> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mRatioOfSubcutaneousFatRange = list;
    }

    public final void setMRatioOfWater(double d) {
        this.mRatioOfWater = d;
    }

    public final void setMRatioOfWaterLevel(int i) {
        this.mRatioOfWaterLevel = i;
    }

    public final void setMRatioOfWaterRange(@aa1 List<Double> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mRatioOfWaterRange = list;
    }

    public final void setMScore(double d) {
        this.mScore = d;
    }

    public final void setMStateOfNutrition(double d) {
        this.mStateOfNutrition = d;
    }

    public final void setMTime(long j) {
        this.mTime = j;
    }

    public final void setMWeight(float f) {
        this.mWeight = f;
    }

    public final void setMWeightOfBone(double d) {
        this.mWeightOfBone = d;
    }

    public final void setMWeightOfBoneRange(@aa1 List<Double> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mWeightOfBoneRange = list;
    }

    public final void setMWeightOfFat(double d) {
        this.mWeightOfFat = d;
    }

    public final void setMWeightOfFatRange(@aa1 List<Double> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mWeightOfFatRange = list;
    }

    public final void setMWeightOfMuscle(double d) {
        this.mWeightOfMuscle = d;
    }

    public final void setMWeightOfMuscleRange(@aa1 List<Double> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mWeightOfMuscleRange = list;
    }

    public final void setMWeightOfProtein(double d) {
        this.mWeightOfProtein = d;
    }

    public final void setMWeightOfProteinRange(@aa1 List<Double> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mWeightOfProteinRange = list;
    }

    public final void setMWeightOfSkeletalMuscle(double d) {
        this.mWeightOfSkeletalMuscle = d;
    }

    public final void setMWeightOfSkeletalMuscleRange(@aa1 List<Double> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mWeightOfSkeletalMuscleRange = list;
    }

    public final void setMWeightOfWater(double d) {
        this.mWeightOfWater = d;
    }

    public final void setMWeightOfWaterRange(@aa1 List<Double> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mWeightOfWaterRange = list;
    }

    public final void setMWeightRange(@aa1 List<Double> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mWeightRange = list;
    }

    public final void setMWeightToControl(double d) {
        this.mWeightToControl = d;
    }

    public final void setMWeightWHORange(@aa1 List<Double> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mWeightWHORange = list;
    }

    @aa1
    public String toString() {
        return "Weight(mId=" + this.mId + ", mTime=" + this.mTime + ", mLocalTime=" + this.mLocalTime + ", mWeight=" + this.mWeight + ", mIsSync=" + this.mIsSync + ", mIsMeasure=" + this.mIsMeasure + ", mBmi=" + this.mBmi + ", mRatioOfFat=" + this.mRatioOfFat + ", mWeightOfMuscle=" + this.mWeightOfMuscle + ", mWeightOfFat=" + this.mWeightOfFat + ", mRatioOfProtein=" + this.mRatioOfProtein + ", mRatioOfWater=" + this.mRatioOfWater + ", mStateOfNutrition=" + this.mStateOfNutrition + ", mIdealWeight=" + this.mIdealWeight + ", mAgeOfBody=" + this.mAgeOfBody + ", mAgeOfBodyRange=" + this.mAgeOfBodyRange + ", mBmiRange=" + this.mBmiRange + ", mBmiWHORange=" + this.mBmiWHORange + ", mBmr=" + this.mBmr + ", mBmrRange=" + this.mBmrRange + ", mBodyShape=" + this.mBodyShape + ", mDesirableWeight=" + this.mDesirableWeight + ", mFatFreeBodyWeight=" + this.mFatFreeBodyWeight + ", mFatToControl=" + this.mFatToControl + ", mLevelOfVisceralFat=" + this.mLevelOfVisceralFat + ", mLevelOfVisceralFatRange=" + this.mLevelOfVisceralFatRange + ", mMuscleToControl=" + this.mMuscleToControl + ", mRatioOfFatRange=" + this.mRatioOfFatRange + ", mRatioOfMuscle=" + this.mRatioOfMuscle + ", mRatioOfMuscleRange=" + this.mRatioOfMuscleRange + ", mRatioOfProteinRange=" + this.mRatioOfProteinRange + ", mRatioOfSkeletalMuscle=" + this.mRatioOfSkeletalMuscle + ", mRatioOfSkeletalMuscleRange=" + this.mRatioOfSkeletalMuscleRange + ", mRatioOfSubcutaneousFat=" + this.mRatioOfSubcutaneousFat + ", mRatioOfSubcutaneousFatRange=" + this.mRatioOfSubcutaneousFatRange + ", mRatioOfWaterRange=" + this.mRatioOfWaterRange + ", mScore=" + this.mScore + ", mWeightOfBone=" + this.mWeightOfBone + ", mWeightOfBoneRange=" + this.mWeightOfBoneRange + ", mWeightOfFatRange=" + this.mWeightOfFatRange + ", mWeightOfMuscleRange=" + this.mWeightOfMuscleRange + ", mWeightOfProtein=" + this.mWeightOfProtein + ", mWeightOfProteinRange=" + this.mWeightOfProteinRange + ", mWeightOfSkeletalMuscle=" + this.mWeightOfSkeletalMuscle + ", mWeightOfSkeletalMuscleRange=" + this.mWeightOfSkeletalMuscleRange + ", mWeightOfWater=" + this.mWeightOfWater + ", mWeightOfWaterRange=" + this.mWeightOfWaterRange + ", mWeightRange=" + this.mWeightRange + ", mWeightToControl=" + this.mWeightToControl + ", mWeightWHORange=" + this.mWeightWHORange + ", mIsDelete=" + this.mIsDelete + ", mRatioOfProteinLevel=" + this.mRatioOfProteinLevel + ", mRatioOfWaterLevel=" + this.mRatioOfWaterLevel + I000IiI1O.C2156iO.f1007iO;
    }

    public Weight(int i, long j, @aa1 String mLocalTime, float f, int i2, int i3, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, @aa1 List<Double> mAgeOfBodyRange, @aa1 List<Double> mBmiRange, @aa1 List<Double> mBmiWHORange, double d10, @aa1 List<Double> mBmrRange, double d11, double d12, double d13, double d14, double d15, @aa1 List<Double> mLevelOfVisceralFatRange, double d16, @aa1 List<Double> mRatioOfFatRange, double d17, @aa1 List<Double> mRatioOfMuscleRange, @aa1 List<Double> mRatioOfProteinRange, double d18, @aa1 List<Double> mRatioOfSkeletalMuscleRange, double d19, @aa1 List<Double> mRatioOfSubcutaneousFatRange, @aa1 List<Double> mRatioOfWaterRange, double d20, double d21, @aa1 List<Double> mWeightOfBoneRange, @aa1 List<Double> mWeightOfFatRange, @aa1 List<Double> mWeightOfMuscleRange, double d22, @aa1 List<Double> mWeightOfProteinRange, double d23, @aa1 List<Double> mWeightOfSkeletalMuscleRange, double d24, @aa1 List<Double> mWeightOfWaterRange, @aa1 List<Double> mWeightRange, double d25, @aa1 List<Double> mWeightWHORange, int i4, int i5, int i6) {
        Intrinsics.X0O(mLocalTime, "mLocalTime");
        Intrinsics.X0O(mAgeOfBodyRange, "mAgeOfBodyRange");
        Intrinsics.X0O(mBmiRange, "mBmiRange");
        Intrinsics.X0O(mBmiWHORange, "mBmiWHORange");
        Intrinsics.X0O(mBmrRange, "mBmrRange");
        Intrinsics.X0O(mLevelOfVisceralFatRange, "mLevelOfVisceralFatRange");
        Intrinsics.X0O(mRatioOfFatRange, "mRatioOfFatRange");
        Intrinsics.X0O(mRatioOfMuscleRange, "mRatioOfMuscleRange");
        Intrinsics.X0O(mRatioOfProteinRange, "mRatioOfProteinRange");
        Intrinsics.X0O(mRatioOfSkeletalMuscleRange, "mRatioOfSkeletalMuscleRange");
        Intrinsics.X0O(mRatioOfSubcutaneousFatRange, "mRatioOfSubcutaneousFatRange");
        Intrinsics.X0O(mRatioOfWaterRange, "mRatioOfWaterRange");
        Intrinsics.X0O(mWeightOfBoneRange, "mWeightOfBoneRange");
        Intrinsics.X0O(mWeightOfFatRange, "mWeightOfFatRange");
        Intrinsics.X0O(mWeightOfMuscleRange, "mWeightOfMuscleRange");
        Intrinsics.X0O(mWeightOfProteinRange, "mWeightOfProteinRange");
        Intrinsics.X0O(mWeightOfSkeletalMuscleRange, "mWeightOfSkeletalMuscleRange");
        Intrinsics.X0O(mWeightOfWaterRange, "mWeightOfWaterRange");
        Intrinsics.X0O(mWeightRange, "mWeightRange");
        Intrinsics.X0O(mWeightWHORange, "mWeightWHORange");
        this.mId = i;
        this.mTime = j;
        this.mLocalTime = mLocalTime;
        this.mWeight = f;
        this.mIsSync = i2;
        this.mIsMeasure = i3;
        this.mBmi = d;
        this.mRatioOfFat = d2;
        this.mWeightOfMuscle = d3;
        this.mWeightOfFat = d4;
        this.mRatioOfProtein = d5;
        this.mRatioOfWater = d6;
        this.mStateOfNutrition = d7;
        this.mIdealWeight = d8;
        this.mAgeOfBody = d9;
        this.mAgeOfBodyRange = mAgeOfBodyRange;
        this.mBmiRange = mBmiRange;
        this.mBmiWHORange = mBmiWHORange;
        this.mBmr = d10;
        this.mBmrRange = mBmrRange;
        this.mBodyShape = d11;
        this.mDesirableWeight = d12;
        this.mFatFreeBodyWeight = d13;
        this.mFatToControl = d14;
        this.mLevelOfVisceralFat = d15;
        this.mLevelOfVisceralFatRange = mLevelOfVisceralFatRange;
        this.mMuscleToControl = d16;
        this.mRatioOfFatRange = mRatioOfFatRange;
        this.mRatioOfMuscle = d17;
        this.mRatioOfMuscleRange = mRatioOfMuscleRange;
        this.mRatioOfProteinRange = mRatioOfProteinRange;
        this.mRatioOfSkeletalMuscle = d18;
        this.mRatioOfSkeletalMuscleRange = mRatioOfSkeletalMuscleRange;
        this.mRatioOfSubcutaneousFat = d19;
        this.mRatioOfSubcutaneousFatRange = mRatioOfSubcutaneousFatRange;
        this.mRatioOfWaterRange = mRatioOfWaterRange;
        this.mScore = d20;
        this.mWeightOfBone = d21;
        this.mWeightOfBoneRange = mWeightOfBoneRange;
        this.mWeightOfFatRange = mWeightOfFatRange;
        this.mWeightOfMuscleRange = mWeightOfMuscleRange;
        this.mWeightOfProtein = d22;
        this.mWeightOfProteinRange = mWeightOfProteinRange;
        this.mWeightOfSkeletalMuscle = d23;
        this.mWeightOfSkeletalMuscleRange = mWeightOfSkeletalMuscleRange;
        this.mWeightOfWater = d24;
        this.mWeightOfWaterRange = mWeightOfWaterRange;
        this.mWeightRange = mWeightRange;
        this.mWeightToControl = d25;
        this.mWeightWHORange = mWeightWHORange;
        this.mIsDelete = i4;
        this.mRatioOfProteinLevel = i5;
        this.mRatioOfWaterLevel = i6;
    }

    public /* synthetic */ Weight(int i, long j, String str, float f, int i2, int i3, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, List list, List list2, List list3, double d10, List list4, double d11, double d12, double d13, double d14, double d15, List list5, double d16, List list6, double d17, List list7, List list8, double d18, List list9, double d19, List list10, List list11, double d20, double d21, List list12, List list13, List list14, double d22, List list15, double d23, List list16, double d24, List list17, List list18, double d25, List list19, int i4, int i5, int i6, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0 : i, (i7 & 2) != 0 ? 0L : j, (i7 & 4) != 0 ? "" : str, (i7 & 8) != 0 ? 0.0f : f, (i7 & 16) != 0 ? 0 : i2, (i7 & 32) != 0 ? 0 : i3, (i7 & 64) != 0 ? 0.0d : d, (i7 & 128) != 0 ? 0.0d : d2, (i7 & 256) != 0 ? 0.0d : d3, (i7 & 512) != 0 ? 0.0d : d4, (i7 & 1024) != 0 ? 0.0d : d5, (i7 & 2048) != 0 ? 0.0d : d6, (i7 & 4096) != 0 ? 0.0d : d7, (i7 & 8192) != 0 ? 0.0d : d8, (i7 & 16384) != 0 ? 0.0d : d9, (i7 & 32768) != 0 ? CollectionsKt__CollectionsKt.m39402iI() : list, (i7 & 65536) != 0 ? CollectionsKt__CollectionsKt.m39402iI() : list2, (i7 & 131072) != 0 ? CollectionsKt__CollectionsKt.m39402iI() : list3, (i7 & 262144) != 0 ? 0.0d : d10, (i7 & 524288) != 0 ? CollectionsKt__CollectionsKt.m39402iI() : list4, (i7 & 1048576) != 0 ? 0.0d : d11, (i7 & 2097152) != 0 ? 0.0d : d12, (i7 & 4194304) != 0 ? 0.0d : d13, (i7 & 8388608) != 0 ? 0.0d : d14, (i7 & 16777216) != 0 ? 0.0d : d15, (i7 & 33554432) != 0 ? CollectionsKt__CollectionsKt.m39402iI() : list5, (i7 & 67108864) != 0 ? 0.0d : d16, (i7 & 134217728) != 0 ? CollectionsKt__CollectionsKt.m39402iI() : list6, (i7 & 268435456) != 0 ? 0.0d : d17, (i7 & 536870912) != 0 ? CollectionsKt__CollectionsKt.m39402iI() : list7, (i7 & 1073741824) != 0 ? CollectionsKt__CollectionsKt.m39402iI() : list8, (i7 & Integer.MIN_VALUE) != 0 ? 0.0d : d18, (i8 & 1) != 0 ? CollectionsKt__CollectionsKt.m39402iI() : list9, (i8 & 2) != 0 ? 0.0d : d19, (i8 & 4) != 0 ? CollectionsKt__CollectionsKt.m39402iI() : list10, (i8 & 8) != 0 ? CollectionsKt__CollectionsKt.m39402iI() : list11, (i8 & 16) != 0 ? 0.0d : d20, (i8 & 32) != 0 ? 0.0d : d21, (i8 & 64) != 0 ? CollectionsKt__CollectionsKt.m39402iI() : list12, (i8 & 128) != 0 ? CollectionsKt__CollectionsKt.m39402iI() : list13, (i8 & 256) != 0 ? CollectionsKt__CollectionsKt.m39402iI() : list14, (i8 & 512) != 0 ? 0.0d : d22, (i8 & 1024) != 0 ? CollectionsKt__CollectionsKt.m39402iI() : list15, (i8 & 2048) != 0 ? 0.0d : d23, (i8 & 4096) != 0 ? CollectionsKt__CollectionsKt.m39402iI() : list16, (i8 & 8192) != 0 ? 0.0d : d24, (i8 & 16384) != 0 ? CollectionsKt__CollectionsKt.m39402iI() : list17, (i8 & 32768) != 0 ? CollectionsKt__CollectionsKt.m39402iI() : list18, (i8 & 65536) != 0 ? 0.0d : d25, (i8 & 131072) != 0 ? CollectionsKt__CollectionsKt.m39402iI() : list19, (i8 & 262144) != 0 ? 0 : i4, (i8 & 524288) != 0 ? 0 : i5, (i8 & 1048576) != 0 ? 0 : i6);
    }
}
