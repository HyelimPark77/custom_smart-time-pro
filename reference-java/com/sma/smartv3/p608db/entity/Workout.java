package com.sma.smartv3.p608db.entity;

import androidx.media3.exoplayer.RendererCapabilities;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;
import androidx.work.WorkInfo;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.jieli.jl_audio_decode.constant.ErrorCode;
import com.szabh.smable3.component.BleConstsKt;
import com.szabh.smable3.entity.BleWorkout;
import com.szabh.smable3.entity.BleWorkout2;
import com.szabh.smable3.entity.BleWorkout3;
import com.szabh.smable3.entity.BleWorkout4;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@TypeConverters({WorkoutConverter.class})
@Entity
public final class Workout implements Serializable {

    @ColumnInfo
    private int mAGpsType;

    @ColumnInfo
    private int mAICoachSportID;

    @ColumnInfo
    private float mAerobic;

    @ColumnInfo
    private int mAirPressure;

    @ColumnInfo
    private int mAlgorithmMarking;

    @ColumnInfo
    private int mAltitude;

    @ColumnInfo
    private int mAltitudePathCount;

    @tb1
    @ColumnInfo(defaultValue = "")
    private List<Integer> mAltitudePathPoints;

    @ColumnInfo
    private int mAltitudePathSampleInterval;

    @ColumnInfo
    private float mAnaerobic;

    @ColumnInfo
    private int mAscendAltitude;

    @ColumnInfo
    private int mAvgBpm;

    @ColumnInfo
    private float mAvgSpeed;

    @ColumnInfo
    private int mAvgStress;

    @ColumnInfo
    private int mBackSwingTime;

    @ColumnInfo
    private int mBackstrokePerc;

    @tb1
    @ColumnInfo(defaultValue = "")
    private int[] mBestRunTime;

    @aa1
    @ColumnInfo
    private String mBleName;

    @tb1
    @ColumnInfo(defaultValue = "")
    private int[] mBpmZoneCount;

    @ColumnInfo
    private int mBreaststrokePerc;

    @ColumnInfo
    private int mButterflyPerc;

    @ColumnInfo
    private int mCadence;

    @ColumnInfo
    private int mCadencePathCount;

    @tb1
    @ColumnInfo(defaultValue = "")
    private List<Integer> mCadencePathPoints;

    @ColumnInfo
    private int mCadencePathSampleInterval;

    @ColumnInfo
    private int mCalorie;

    @ColumnInfo
    private int mCalorieTotal;

    @ColumnInfo
    private float mCarboTotal;

    @ColumnInfo
    private int mChildCyclingDistance;

    @ColumnInfo
    private int mChildCyclingDuration;

    @ColumnInfo
    private int mChildCyclingMode;

    @ColumnInfo
    private long mChildCyclingStartTime;

    @ColumnInfo
    private int mChildNumber;

    @ColumnInfo
    private int mChildRunDistance;

    @ColumnInfo
    private int mChildRunDuration;

    @ColumnInfo
    private int mChildRunMode;

    @ColumnInfo
    private long mChildRunStartTime;

    @ColumnInfo
    private int mChildSwimDistance;

    @ColumnInfo
    private int mChildSwimDuration;

    @ColumnInfo
    private int mChildSwimMode;

    @ColumnInfo
    private long mChildSwimStartTime;

    @ColumnInfo
    private int mCnt;

    @ColumnInfo
    private int mCntBack;

    @ColumnInfo
    private int mCntFore;

    @ColumnInfo
    private int mCntLap;

    @ColumnInfo
    private int mCurBpm;

    @ColumnInfo
    private int mCurStress;

    @tb1
    @ColumnInfo(defaultValue = "")
    private float[] mCyclingIndex;

    @ColumnInfo
    private float mCyclingLactateAvg;

    @ColumnInfo
    private int mDescendAltitude;

    @tb1
    @ColumnInfo(defaultValue = "")
    private String mDeviceId;

    @ColumnInfo
    private int mDistance;

    @ColumnInfo
    private int mDownSwingTime;

    @ColumnInfo
    private int mDribbleTime;

    @ColumnInfo
    private int mDuration;

    @ColumnInfo
    private int mEllipticalSteps;

    @ColumnInfo
    private long mEnd;

    @ColumnInfo
    private float mFatTotal;

    @ColumnInfo
    private int mFeel;

    @aa1
    @ColumnInfo
    private String mFirmwareFlag;

    @ColumnInfo
    private int mFitnessAge;

    @tb1
    @ColumnInfo(defaultValue = "")
    private float[] mFitnessLevel;

    @ColumnInfo
    private int mFlag;

    @ColumnInfo
    private int mFrontCrawlPerc;

    @ColumnInfo
    private int mGoalCalorie;

    @ColumnInfo
    private int mGoalDistance;

    @ColumnInfo
    private int mGoalTime;

    @ColumnInfo
    private int mHrPathCount;

    @tb1
    @ColumnInfo(defaultValue = "")
    private List<Integer> mHrPathPoints;

    @ColumnInfo
    private int mHrPathSampleInterval;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo
    private final int mId;

    @ColumnInfo
    private int mIsDelete;

    @ColumnInfo
    private int mIsSync;

    @ColumnInfo
    private int mLactateThresholdHr;

    @ColumnInfo
    private int mLactateThresholdPace;

    @aa1
    @ColumnInfo
    private String mLocalTime;

    @ColumnInfo
    private int mMaxAltitude;

    @ColumnInfo
    private int mMaxBpm;

    @ColumnInfo
    private int mMaxCadence;

    @ColumnInfo
    private float mMaxOxygenPower;

    @ColumnInfo
    private int mMaxPace;

    @ColumnInfo
    private int mMaxSpeed;

    @ColumnInfo
    private int mMaxSpm;

    @ColumnInfo
    private int mMaxStress;

    @ColumnInfo
    private int mMaxVO2;

    @ColumnInfo
    private int mMetTotal;

    @ColumnInfo
    private int mMinAltitude;

    @ColumnInfo
    private int mMinBpm;

    @ColumnInfo
    private int mMinPace;

    @ColumnInfo
    private int mMinSpeed;

    @ColumnInfo
    private int mMinSpm;

    @ColumnInfo
    private int mMinStress;

    @ColumnInfo
    private int mMode;

    @ColumnInfo
    private int mNavigatorActualDistance;

    @ColumnInfo
    private int mNavigatorActualPace;

    @ColumnInfo
    private int mNavigatorActualSpeed;

    @ColumnInfo
    private float mNavigatorActualSpeedV2;

    @ColumnInfo
    private int mNavigatorActualTime;

    @ColumnInfo
    private int mNavigatorDifferenceDistance;

    @ColumnInfo
    private int mNavigatorDifferencePace;

    @ColumnInfo
    private int mNavigatorDifferenceSpeed;

    @ColumnInfo
    private int mNavigatorDifferenceTime;

    @ColumnInfo
    private int mNavigatorStatusDistance;

    @ColumnInfo
    private int mNavigatorStatusPace;

    @ColumnInfo
    private int mNavigatorStatusSpeed;

    @ColumnInfo
    private int mNavigatorStatusTime;

    @ColumnInfo
    private int mNavigatorTargetDistance;

    @ColumnInfo
    private int mNavigatorTargetPace;

    @ColumnInfo
    private int mNavigatorTargetSpeed;

    @ColumnInfo
    private float mNavigatorTargetSpeedV2;

    @ColumnInfo
    private int mNavigatorTargetTime;

    @ColumnInfo
    private int mPace;

    @ColumnInfo
    private int mPacePathCount;

    @tb1
    @ColumnInfo(defaultValue = "")
    private List<Integer> mPacePathPoints;

    @ColumnInfo
    private int mPacePathSampleInterval;

    @ColumnInfo
    private int mPathCount;

    @tb1
    @ColumnInfo(defaultValue = "")
    private List<float[]> mPathPoints;

    @ColumnInfo
    private int mPathSampleInterval;

    @ColumnInfo
    private int mPausedDuration;

    @tb1
    @ColumnInfo(defaultValue = "")
    private int[] mPersonalZone;

    @aa1
    @ColumnInfo
    private String mPlatform;

    @ColumnInfo
    private int mPowerCount;

    @ColumnInfo
    private int mPowerInterval;

    @tb1
    @ColumnInfo(defaultValue = "")
    private List<Integer> mPowerPoints;

    @aa1
    @ColumnInfo
    private String mPrototype;

    @ColumnInfo
    private int mRecoveryHrCount;

    @tb1
    @ColumnInfo(defaultValue = "")
    private List<Integer> mRecoveryHrPoints;

    @ColumnInfo
    private int mRecoveryTime;

    @ColumnInfo
    private int mRestDuration;

    @ColumnInfo
    private float mRunLactateAvg;

    @ColumnInfo
    private int mRunPowerWatt;

    @ColumnInfo
    private int mSessionCount;

    @ColumnInfo
    private int mSource;

    @ColumnInfo
    private int mSpeed;

    @ColumnInfo
    private int mSpeedPathCount;

    @tb1
    @ColumnInfo(defaultValue = "")
    private List<Integer> mSpeedPathPoints;

    @ColumnInfo
    private int mSpeedPathSampleInterval;

    @ColumnInfo
    private int mSpm;

    @ColumnInfo
    private int mSpmPathPointsCount;

    @tb1
    @ColumnInfo(defaultValue = "")
    private List<Integer> mSpmPathPointsPoints;

    @ColumnInfo
    private int mStaBalance;

    @ColumnInfo
    private int mStamina;

    @ColumnInfo
    private long mStart;

    @ColumnInfo
    private int mStep;

    @ColumnInfo
    private float mStepLen;

    @ColumnInfo
    private int mStepLenCount;

    @tb1
    @ColumnInfo(defaultValue = "")
    private List<Float> mStepLenPoints;

    @ColumnInfo
    private int mSwimPoolLength;

    @ColumnInfo
    private int mSwimSwolf;

    @ColumnInfo
    private int mSwimType;

    @ColumnInfo
    private float mTlTrend;

    @ColumnInfo
    private int mTrainingLoad;

    @ColumnInfo
    private int mTrainingStatus;

    @tb1
    @ColumnInfo(defaultValue = "")
    private float[] mTrendWeek;

    @ColumnInfo
    private int mTripCount;

    @ColumnInfo
    private int mType;

    @ColumnInfo
    private int mVerticalOscillation;

    @ColumnInfo
    private float realTimeAerobic;

    @ColumnInfo
    private float realTimeAnaerobic;

    public Workout() {
        this(0, 0L, 0L, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, null, null, 0, 0, 0, 0, 0, 0, 0.0f, 0.0f, 0, 0.0f, 0, 0, 0, null, null, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, null, 0, 0, null, 0, 0, null, 0, 0, null, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, 0, 0.0f, null, null, 0, 0, 0, null, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, null, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, 0, 0L, 0, 0, 0L, 0, 0, 0L, 0, 0, 0, 0, 0, 0, 0.0f, 0.0f, 0, 0, null, 0, null, 0, -1, -1, -1, -1, Integer.MAX_VALUE, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Workout copy$default(Workout workout, int i, long j, long j2, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, String str2, String str3, String str4, String str5, int i28, int i29, int i30, int i31, int i32, int i33, float f, float f2, int i34, float f3, int i35, int i36, int i37, int[] iArr, int[] iArr2, int i38, int i39, int i40, int i41, int i42, int i43, int i44, int i45, List list, int i46, int i47, List list2, int i48, int i49, List list3, int i50, int i51, List list4, int i52, int i53, List list5, int i54, int i55, List list6, int i56, int i57, int i58, int i59, int i60, int i61, int i62, int i63, int i64, int i65, int i66, int i67, int i68, int i69, int i70, int i71, int i72, int i73, float f4, int i74, int i75, float f5, int[] iArr3, float[] fArr, int i76, int i77, int i78, List list7, float f6, float f7, float f8, float f9, int i79, int i80, int i81, int i82, int i83, int i84, int i85, int i86, int i87, int i88, int i89, int i90, float f10, float f11, int i91, int i92, int i93, int i94, float f12, float[] fArr2, float[] fArr3, int i95, int i96, int i97, int i98, int i99, int i100, int i101, int i102, List list8, int i103, List list9, int i104, long j3, int i105, int i106, long j4, int i107, int i108, long j5, int i109, int i110, int i111, int i112, int i113, int i114, float f13, float f14, int i115, int i116, List list10, int i117, String str6, int i118, int i119, int i120, int i121, int i122, int i123, Object obj) {
        int i124 = (i119 & 1) != 0 ? workout.mId : i;
        long j6 = (i119 & 2) != 0 ? workout.mStart : j;
        long j7 = (i119 & 4) != 0 ? workout.mEnd : j2;
        String str7 = (i119 & 8) != 0 ? workout.mLocalTime : str;
        int i125 = (i119 & 16) != 0 ? workout.mDuration : i2;
        int i126 = (i119 & 32) != 0 ? workout.mAltitude : i3;
        int i127 = (i119 & 64) != 0 ? workout.mAirPressure : i4;
        int i128 = (i119 & 128) != 0 ? workout.mSpm : i5;
        int i129 = i124;
        int i130 = (i119 & 256) != 0 ? workout.mMode : i6;
        int i131 = (i119 & 512) != 0 ? workout.mStep : i7;
        int i132 = (i119 & 1024) != 0 ? workout.mDistance : i8;
        int i133 = (i119 & 2048) != 0 ? workout.mCalorie : i9;
        int i134 = (i119 & 4096) != 0 ? workout.mSpeed : i10;
        int i135 = (i119 & 8192) != 0 ? workout.mPace : i11;
        int i136 = (i119 & 16384) != 0 ? workout.mAvgBpm : i12;
        int i137 = (i119 & 32768) != 0 ? workout.mMaxBpm : i13;
        int i138 = (i119 & 65536) != 0 ? workout.mMinBpm : i14;
        int i139 = (i119 & 131072) != 0 ? workout.mMaxSpm : i15;
        int i140 = (i119 & 262144) != 0 ? workout.mMinSpm : i16;
        int i141 = (i119 & 524288) != 0 ? workout.mMaxPace : i17;
        int i142 = (i119 & 1048576) != 0 ? workout.mMinPace : i18;
        int i143 = (i119 & 2097152) != 0 ? workout.mMaxAltitude : i19;
        int i144 = (i119 & 4194304) != 0 ? workout.mMinAltitude : i20;
        int i145 = (i119 & 8388608) != 0 ? workout.mMinStress : i21;
        int i146 = (i119 & 16777216) != 0 ? workout.mMaxStress : i22;
        int i147 = (i119 & 33554432) != 0 ? workout.mAvgStress : i23;
        int i148 = (i119 & 67108864) != 0 ? workout.mSource : i24;
        int i149 = (i119 & 134217728) != 0 ? workout.mIsSync : i25;
        int i150 = (i119 & 268435456) != 0 ? workout.mIsDelete : i26;
        int i151 = (i119 & 536870912) != 0 ? workout.mFeel : i27;
        String str8 = (i119 & 1073741824) != 0 ? workout.mPrototype : str2;
        String str9 = (i119 & Integer.MIN_VALUE) != 0 ? workout.mFirmwareFlag : str3;
        String str10 = (i120 & 1) != 0 ? workout.mBleName : str4;
        String str11 = (i120 & 2) != 0 ? workout.mPlatform : str5;
        int i152 = (i120 & 4) != 0 ? workout.mMaxSpeed : i28;
        int i153 = (i120 & 8) != 0 ? workout.mMinSpeed : i29;
        int i154 = (i120 & 16) != 0 ? workout.mRestDuration : i30;
        int i155 = (i120 & 32) != 0 ? workout.mAGpsType : i31;
        int i156 = (i120 & 64) != 0 ? workout.mType : i32;
        int i157 = (i120 & 128) != 0 ? workout.mMetTotal : i33;
        float f15 = (i120 & 256) != 0 ? workout.mAerobic : f;
        float f16 = (i120 & 512) != 0 ? workout.mAnaerobic : f2;
        int i158 = (i120 & 1024) != 0 ? workout.mStamina : i34;
        float f17 = (i120 & 2048) != 0 ? workout.mAvgSpeed : f3;
        int i159 = (i120 & 4096) != 0 ? workout.mCadence : i35;
        int i160 = (i120 & 8192) != 0 ? workout.mMaxCadence : i36;
        int i161 = (i120 & 16384) != 0 ? workout.mCnt : i37;
        int[] iArr4 = (i120 & 32768) != 0 ? workout.mBpmZoneCount : iArr;
        int[] iArr5 = (i120 & 65536) != 0 ? workout.mPersonalZone : iArr2;
        int i162 = (i120 & 131072) != 0 ? workout.mLactateThresholdPace : i38;
        int i163 = (i120 & 262144) != 0 ? workout.mRecoveryTime : i39;
        int i164 = (i120 & 524288) != 0 ? workout.mTrainingLoad : i40;
        int i165 = (i120 & 1048576) != 0 ? workout.mMaxVO2 : i41;
        int i166 = (i120 & 2097152) != 0 ? workout.mLactateThresholdHr : i42;
        int i167 = (i120 & 4194304) != 0 ? workout.mAlgorithmMarking : i43;
        int i168 = (i120 & 8388608) != 0 ? workout.mPathCount : i44;
        int i169 = (i120 & 16777216) != 0 ? workout.mPathSampleInterval : i45;
        List list11 = (i120 & 33554432) != 0 ? workout.mPathPoints : list;
        int i170 = (i120 & 67108864) != 0 ? workout.mHrPathCount : i46;
        int i171 = (i120 & 134217728) != 0 ? workout.mHrPathSampleInterval : i47;
        List list12 = (i120 & 268435456) != 0 ? workout.mHrPathPoints : list2;
        int i172 = (i120 & 536870912) != 0 ? workout.mPacePathCount : i48;
        int i173 = (i120 & 1073741824) != 0 ? workout.mPacePathSampleInterval : i49;
        List list13 = (i120 & Integer.MIN_VALUE) != 0 ? workout.mPacePathPoints : list3;
        int i174 = i173;
        int i175 = (i121 & 1) != 0 ? workout.mSpeedPathCount : i50;
        int i176 = (i121 & 2) != 0 ? workout.mSpeedPathSampleInterval : i51;
        List list14 = (i121 & 4) != 0 ? workout.mSpeedPathPoints : list4;
        int i177 = (i121 & 8) != 0 ? workout.mCadencePathCount : i52;
        int i178 = (i121 & 16) != 0 ? workout.mCadencePathSampleInterval : i53;
        List list15 = (i121 & 32) != 0 ? workout.mCadencePathPoints : list5;
        int i179 = (i121 & 64) != 0 ? workout.mAltitudePathCount : i54;
        int i180 = (i121 & 128) != 0 ? workout.mAltitudePathSampleInterval : i55;
        List list16 = (i121 & 256) != 0 ? workout.mAltitudePathPoints : list6;
        int i181 = (i121 & 512) != 0 ? workout.mGoalDistance : i56;
        int i182 = (i121 & 1024) != 0 ? workout.mGoalTime : i57;
        int i183 = (i121 & 2048) != 0 ? workout.mGoalCalorie : i58;
        int i184 = (i121 & 4096) != 0 ? workout.mPausedDuration : i59;
        int i185 = (i121 & 8192) != 0 ? workout.mCurBpm : i60;
        int i186 = (i121 & 16384) != 0 ? workout.mAscendAltitude : i61;
        int i187 = (i121 & 32768) != 0 ? workout.mDescendAltitude : i62;
        int i188 = (i121 & 65536) != 0 ? workout.mCurStress : i63;
        int i189 = (i121 & 131072) != 0 ? workout.mSwimType : i64;
        int i190 = (i121 & 262144) != 0 ? workout.mCntFore : i65;
        int i191 = (i121 & 524288) != 0 ? workout.mCntBack : i66;
        int i192 = (i121 & 1048576) != 0 ? workout.mBackSwingTime : i67;
        int i193 = (i121 & 2097152) != 0 ? workout.mDownSwingTime : i68;
        int i194 = (i121 & 4194304) != 0 ? workout.mDribbleTime : i69;
        int i195 = (i121 & 8388608) != 0 ? workout.mTripCount : i70;
        int i196 = (i121 & 16777216) != 0 ? workout.mSessionCount : i71;
        int i197 = (i121 & 33554432) != 0 ? workout.mVerticalOscillation : i72;
        int i198 = (i121 & 67108864) != 0 ? workout.mRunPowerWatt : i73;
        float f18 = (i121 & 134217728) != 0 ? workout.mStepLen : f4;
        int i199 = (i121 & 268435456) != 0 ? workout.mTrainingStatus : i74;
        int i200 = (i121 & 536870912) != 0 ? workout.mFitnessAge : i75;
        float f19 = (i121 & 1073741824) != 0 ? workout.mTlTrend : f5;
        int[] iArr6 = (i121 & Integer.MIN_VALUE) != 0 ? workout.mBestRunTime : iArr3;
        float f20 = f19;
        float[] fArr4 = (i122 & 1) != 0 ? workout.mFitnessLevel : fArr;
        int i201 = (i122 & 2) != 0 ? workout.mCalorieTotal : i76;
        int i202 = (i122 & 4) != 0 ? workout.mPowerCount : i77;
        int i203 = (i122 & 8) != 0 ? workout.mPowerInterval : i78;
        List list17 = (i122 & 16) != 0 ? workout.mPowerPoints : list7;
        float f21 = (i122 & 32) != 0 ? workout.realTimeAerobic : f6;
        float f22 = (i122 & 64) != 0 ? workout.realTimeAnaerobic : f7;
        float f23 = (i122 & 128) != 0 ? workout.mFatTotal : f8;
        float f24 = (i122 & 256) != 0 ? workout.mCarboTotal : f9;
        int i204 = (i122 & 512) != 0 ? workout.mNavigatorTargetTime : i79;
        int i205 = (i122 & 1024) != 0 ? workout.mNavigatorActualTime : i80;
        int i206 = (i122 & 2048) != 0 ? workout.mNavigatorDifferenceTime : i81;
        int i207 = (i122 & 4096) != 0 ? workout.mNavigatorStatusTime : i82;
        int i208 = (i122 & 8192) != 0 ? workout.mNavigatorTargetDistance : i83;
        int i209 = (i122 & 16384) != 0 ? workout.mNavigatorActualDistance : i84;
        int i210 = (i122 & 32768) != 0 ? workout.mNavigatorDifferenceDistance : i85;
        int i211 = (i122 & 65536) != 0 ? workout.mNavigatorStatusDistance : i86;
        int i212 = (i122 & 131072) != 0 ? workout.mNavigatorTargetPace : i87;
        int i213 = (i122 & 262144) != 0 ? workout.mNavigatorActualPace : i88;
        int i214 = (i122 & 524288) != 0 ? workout.mNavigatorDifferencePace : i89;
        int i215 = (i122 & 1048576) != 0 ? workout.mNavigatorStatusPace : i90;
        float f25 = (i122 & 2097152) != 0 ? workout.mNavigatorTargetSpeedV2 : f10;
        float f26 = (i122 & 4194304) != 0 ? workout.mNavigatorActualSpeedV2 : f11;
        int i216 = (i122 & 8388608) != 0 ? workout.mNavigatorTargetSpeed : i91;
        int i217 = (i122 & 16777216) != 0 ? workout.mNavigatorActualSpeed : i92;
        int i218 = (i122 & 33554432) != 0 ? workout.mNavigatorDifferenceSpeed : i93;
        int i219 = (i122 & 67108864) != 0 ? workout.mNavigatorStatusSpeed : i94;
        float f27 = (i122 & 134217728) != 0 ? workout.mMaxOxygenPower : f12;
        float[] fArr5 = (i122 & 268435456) != 0 ? workout.mTrendWeek : fArr2;
        float[] fArr6 = (i122 & 536870912) != 0 ? workout.mCyclingIndex : fArr3;
        int i220 = (i122 & 1073741824) != 0 ? workout.mStaBalance : i95;
        return workout.copy(i129, j6, j7, str7, i125, i126, i127, i128, i130, i131, i132, i133, i134, i135, i136, i137, i138, i139, i140, i141, i142, i143, i144, i145, i146, i147, i148, i149, i150, i151, str8, str9, str10, str11, i152, i153, i154, i155, i156, i157, f15, f16, i158, f17, i159, i160, i161, iArr4, iArr5, i162, i163, i164, i165, i166, i167, i168, i169, list11, i170, i171, list12, i172, i174, list13, i175, i176, list14, i177, i178, list15, i179, i180, list16, i181, i182, i183, i184, i185, i186, i187, i188, i189, i190, i191, i192, i193, i194, i195, i196, i197, i198, f18, i199, i200, f20, iArr6, fArr4, i201, i202, i203, list17, f21, f22, f23, f24, i204, i205, i206, i207, i208, i209, i210, i211, i212, i213, i214, i215, f25, f26, i216, i217, i218, i219, f27, fArr5, fArr6, i220, (i122 & Integer.MIN_VALUE) != 0 ? workout.mSwimSwolf : i96, (i123 & 1) != 0 ? workout.mCntLap : i97, (i123 & 2) != 0 ? workout.mFrontCrawlPerc : i98, (i123 & 4) != 0 ? workout.mBreaststrokePerc : i99, (i123 & 8) != 0 ? workout.mBackstrokePerc : i100, (i123 & 16) != 0 ? workout.mButterflyPerc : i101, (i123 & 32) != 0 ? workout.mSpmPathPointsCount : i102, (i123 & 64) != 0 ? workout.mSpmPathPointsPoints : list8, (i123 & 128) != 0 ? workout.mStepLenCount : i103, (i123 & 256) != 0 ? workout.mStepLenPoints : list9, (i123 & 512) != 0 ? workout.mEllipticalSteps : i104, (i123 & 1024) != 0 ? workout.mChildSwimStartTime : j3, (i123 & 2048) != 0 ? workout.mChildSwimDuration : i105, (i123 & 4096) != 0 ? workout.mChildSwimDistance : i106, (i123 & 8192) != 0 ? workout.mChildCyclingStartTime : j4, (i123 & 16384) != 0 ? workout.mChildCyclingDuration : i107, (i123 & 32768) != 0 ? workout.mChildCyclingDistance : i108, (i123 & 65536) != 0 ? workout.mChildRunStartTime : j5, (i123 & 131072) != 0 ? workout.mChildRunDuration : i109, (i123 & 262144) != 0 ? workout.mChildRunDistance : i110, (i123 & 524288) != 0 ? workout.mChildSwimMode : i111, (i123 & 1048576) != 0 ? workout.mChildCyclingMode : i112, (i123 & 2097152) != 0 ? workout.mChildRunMode : i113, (i123 & 4194304) != 0 ? workout.mChildNumber : i114, (i123 & 8388608) != 0 ? workout.mRunLactateAvg : f13, (i123 & 16777216) != 0 ? workout.mCyclingLactateAvg : f14, (i123 & 33554432) != 0 ? workout.mFlag : i115, (i123 & 67108864) != 0 ? workout.mRecoveryHrCount : i116, (i123 & 134217728) != 0 ? workout.mRecoveryHrPoints : list10, (i123 & 268435456) != 0 ? workout.mSwimPoolLength : i117, (i123 & 536870912) != 0 ? workout.mDeviceId : str6, (i123 & 1073741824) != 0 ? workout.mAICoachSportID : i118);
    }

    public final int component1() {
        return this.mId;
    }

    public final int component10() {
        return this.mStep;
    }

    public final int component100() {
        return this.mPowerInterval;
    }

    @tb1
    public final List<Integer> component101() {
        return this.mPowerPoints;
    }

    public final float component102() {
        return this.realTimeAerobic;
    }

    public final float component103() {
        return this.realTimeAnaerobic;
    }

    public final float component104() {
        return this.mFatTotal;
    }

    public final float component105() {
        return this.mCarboTotal;
    }

    public final int component106() {
        return this.mNavigatorTargetTime;
    }

    public final int component107() {
        return this.mNavigatorActualTime;
    }

    public final int component108() {
        return this.mNavigatorDifferenceTime;
    }

    public final int component109() {
        return this.mNavigatorStatusTime;
    }

    public final int component11() {
        return this.mDistance;
    }

    public final int component110() {
        return this.mNavigatorTargetDistance;
    }

    public final int component111() {
        return this.mNavigatorActualDistance;
    }

    public final int component112() {
        return this.mNavigatorDifferenceDistance;
    }

    public final int component113() {
        return this.mNavigatorStatusDistance;
    }

    public final int component114() {
        return this.mNavigatorTargetPace;
    }

    public final int component115() {
        return this.mNavigatorActualPace;
    }

    public final int component116() {
        return this.mNavigatorDifferencePace;
    }

    public final int component117() {
        return this.mNavigatorStatusPace;
    }

    public final float component118() {
        return this.mNavigatorTargetSpeedV2;
    }

    public final float component119() {
        return this.mNavigatorActualSpeedV2;
    }

    public final int component12() {
        return this.mCalorie;
    }

    public final int component120() {
        return this.mNavigatorTargetSpeed;
    }

    public final int component121() {
        return this.mNavigatorActualSpeed;
    }

    public final int component122() {
        return this.mNavigatorDifferenceSpeed;
    }

    public final int component123() {
        return this.mNavigatorStatusSpeed;
    }

    public final float component124() {
        return this.mMaxOxygenPower;
    }

    @tb1
    public final float[] component125() {
        return this.mTrendWeek;
    }

    @tb1
    public final float[] component126() {
        return this.mCyclingIndex;
    }

    public final int component127() {
        return this.mStaBalance;
    }

    public final int component128() {
        return this.mSwimSwolf;
    }

    public final int component129() {
        return this.mCntLap;
    }

    public final int component13() {
        return this.mSpeed;
    }

    public final int component130() {
        return this.mFrontCrawlPerc;
    }

    public final int component131() {
        return this.mBreaststrokePerc;
    }

    public final int component132() {
        return this.mBackstrokePerc;
    }

    public final int component133() {
        return this.mButterflyPerc;
    }

    public final int component134() {
        return this.mSpmPathPointsCount;
    }

    @tb1
    public final List<Integer> component135() {
        return this.mSpmPathPointsPoints;
    }

    public final int component136() {
        return this.mStepLenCount;
    }

    @tb1
    public final List<Float> component137() {
        return this.mStepLenPoints;
    }

    public final int component138() {
        return this.mEllipticalSteps;
    }

    public final long component139() {
        return this.mChildSwimStartTime;
    }

    public final int component14() {
        return this.mPace;
    }

    public final int component140() {
        return this.mChildSwimDuration;
    }

    public final int component141() {
        return this.mChildSwimDistance;
    }

    public final long component142() {
        return this.mChildCyclingStartTime;
    }

    public final int component143() {
        return this.mChildCyclingDuration;
    }

    public final int component144() {
        return this.mChildCyclingDistance;
    }

    public final long component145() {
        return this.mChildRunStartTime;
    }

    public final int component146() {
        return this.mChildRunDuration;
    }

    public final int component147() {
        return this.mChildRunDistance;
    }

    public final int component148() {
        return this.mChildSwimMode;
    }

    public final int component149() {
        return this.mChildCyclingMode;
    }

    public final int component15() {
        return this.mAvgBpm;
    }

    public final int component150() {
        return this.mChildRunMode;
    }

    public final int component151() {
        return this.mChildNumber;
    }

    public final float component152() {
        return this.mRunLactateAvg;
    }

    public final float component153() {
        return this.mCyclingLactateAvg;
    }

    public final int component154() {
        return this.mFlag;
    }

    public final int component155() {
        return this.mRecoveryHrCount;
    }

    @tb1
    public final List<Integer> component156() {
        return this.mRecoveryHrPoints;
    }

    public final int component157() {
        return this.mSwimPoolLength;
    }

    @tb1
    public final String component158() {
        return this.mDeviceId;
    }

    public final int component159() {
        return this.mAICoachSportID;
    }

    public final int component16() {
        return this.mMaxBpm;
    }

    public final int component17() {
        return this.mMinBpm;
    }

    public final int component18() {
        return this.mMaxSpm;
    }

    public final int component19() {
        return this.mMinSpm;
    }

    public final long component2() {
        return this.mStart;
    }

    public final int component20() {
        return this.mMaxPace;
    }

    public final int component21() {
        return this.mMinPace;
    }

    public final int component22() {
        return this.mMaxAltitude;
    }

    public final int component23() {
        return this.mMinAltitude;
    }

    public final int component24() {
        return this.mMinStress;
    }

    public final int component25() {
        return this.mMaxStress;
    }

    public final int component26() {
        return this.mAvgStress;
    }

    public final int component27() {
        return this.mSource;
    }

    public final int component28() {
        return this.mIsSync;
    }

    public final int component29() {
        return this.mIsDelete;
    }

    public final long component3() {
        return this.mEnd;
    }

    public final int component30() {
        return this.mFeel;
    }

    @aa1
    public final String component31() {
        return this.mPrototype;
    }

    @aa1
    public final String component32() {
        return this.mFirmwareFlag;
    }

    @aa1
    public final String component33() {
        return this.mBleName;
    }

    @aa1
    public final String component34() {
        return this.mPlatform;
    }

    public final int component35() {
        return this.mMaxSpeed;
    }

    public final int component36() {
        return this.mMinSpeed;
    }

    public final int component37() {
        return this.mRestDuration;
    }

    public final int component38() {
        return this.mAGpsType;
    }

    public final int component39() {
        return this.mType;
    }

    @aa1
    public final String component4() {
        return this.mLocalTime;
    }

    public final int component40() {
        return this.mMetTotal;
    }

    public final float component41() {
        return this.mAerobic;
    }

    public final float component42() {
        return this.mAnaerobic;
    }

    public final int component43() {
        return this.mStamina;
    }

    public final float component44() {
        return this.mAvgSpeed;
    }

    public final int component45() {
        return this.mCadence;
    }

    public final int component46() {
        return this.mMaxCadence;
    }

    public final int component47() {
        return this.mCnt;
    }

    @tb1
    public final int[] component48() {
        return this.mBpmZoneCount;
    }

    @tb1
    public final int[] component49() {
        return this.mPersonalZone;
    }

    public final int component5() {
        return this.mDuration;
    }

    public final int component50() {
        return this.mLactateThresholdPace;
    }

    public final int component51() {
        return this.mRecoveryTime;
    }

    public final int component52() {
        return this.mTrainingLoad;
    }

    public final int component53() {
        return this.mMaxVO2;
    }

    public final int component54() {
        return this.mLactateThresholdHr;
    }

    public final int component55() {
        return this.mAlgorithmMarking;
    }

    public final int component56() {
        return this.mPathCount;
    }

    public final int component57() {
        return this.mPathSampleInterval;
    }

    @tb1
    public final List<float[]> component58() {
        return this.mPathPoints;
    }

    public final int component59() {
        return this.mHrPathCount;
    }

    public final int component6() {
        return this.mAltitude;
    }

    public final int component60() {
        return this.mHrPathSampleInterval;
    }

    @tb1
    public final List<Integer> component61() {
        return this.mHrPathPoints;
    }

    public final int component62() {
        return this.mPacePathCount;
    }

    public final int component63() {
        return this.mPacePathSampleInterval;
    }

    @tb1
    public final List<Integer> component64() {
        return this.mPacePathPoints;
    }

    public final int component65() {
        return this.mSpeedPathCount;
    }

    public final int component66() {
        return this.mSpeedPathSampleInterval;
    }

    @tb1
    public final List<Integer> component67() {
        return this.mSpeedPathPoints;
    }

    public final int component68() {
        return this.mCadencePathCount;
    }

    public final int component69() {
        return this.mCadencePathSampleInterval;
    }

    public final int component7() {
        return this.mAirPressure;
    }

    @tb1
    public final List<Integer> component70() {
        return this.mCadencePathPoints;
    }

    public final int component71() {
        return this.mAltitudePathCount;
    }

    public final int component72() {
        return this.mAltitudePathSampleInterval;
    }

    @tb1
    public final List<Integer> component73() {
        return this.mAltitudePathPoints;
    }

    public final int component74() {
        return this.mGoalDistance;
    }

    public final int component75() {
        return this.mGoalTime;
    }

    public final int component76() {
        return this.mGoalCalorie;
    }

    public final int component77() {
        return this.mPausedDuration;
    }

    public final int component78() {
        return this.mCurBpm;
    }

    public final int component79() {
        return this.mAscendAltitude;
    }

    public final int component8() {
        return this.mSpm;
    }

    public final int component80() {
        return this.mDescendAltitude;
    }

    public final int component81() {
        return this.mCurStress;
    }

    public final int component82() {
        return this.mSwimType;
    }

    public final int component83() {
        return this.mCntFore;
    }

    public final int component84() {
        return this.mCntBack;
    }

    public final int component85() {
        return this.mBackSwingTime;
    }

    public final int component86() {
        return this.mDownSwingTime;
    }

    public final int component87() {
        return this.mDribbleTime;
    }

    public final int component88() {
        return this.mTripCount;
    }

    public final int component89() {
        return this.mSessionCount;
    }

    public final int component9() {
        return this.mMode;
    }

    public final int component90() {
        return this.mVerticalOscillation;
    }

    public final int component91() {
        return this.mRunPowerWatt;
    }

    public final float component92() {
        return this.mStepLen;
    }

    public final int component93() {
        return this.mTrainingStatus;
    }

    public final int component94() {
        return this.mFitnessAge;
    }

    public final float component95() {
        return this.mTlTrend;
    }

    @tb1
    public final int[] component96() {
        return this.mBestRunTime;
    }

    @tb1
    public final float[] component97() {
        return this.mFitnessLevel;
    }

    public final int component98() {
        return this.mCalorieTotal;
    }

    public final int component99() {
        return this.mPowerCount;
    }

    @aa1
    public final Workout copy(int i, long j, long j2, @aa1 String mLocalTime, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, @aa1 String mPrototype, @aa1 String mFirmwareFlag, @aa1 String mBleName, @aa1 String mPlatform, int i28, int i29, int i30, int i31, int i32, int i33, float f, float f2, int i34, float f3, int i35, int i36, int i37, @tb1 int[] iArr, @tb1 int[] iArr2, int i38, int i39, int i40, int i41, int i42, int i43, int i44, int i45, @tb1 List<float[]> list, int i46, int i47, @tb1 List<Integer> list2, int i48, int i49, @tb1 List<Integer> list3, int i50, int i51, @tb1 List<Integer> list4, int i52, int i53, @tb1 List<Integer> list5, int i54, int i55, @tb1 List<Integer> list6, int i56, int i57, int i58, int i59, int i60, int i61, int i62, int i63, int i64, int i65, int i66, int i67, int i68, int i69, int i70, int i71, int i72, int i73, float f4, int i74, int i75, float f5, @tb1 int[] iArr3, @tb1 float[] fArr, int i76, int i77, int i78, @tb1 List<Integer> list7, float f6, float f7, float f8, float f9, int i79, int i80, int i81, int i82, int i83, int i84, int i85, int i86, int i87, int i88, int i89, int i90, float f10, float f11, int i91, int i92, int i93, int i94, float f12, @tb1 float[] fArr2, @tb1 float[] fArr3, int i95, int i96, int i97, int i98, int i99, int i100, int i101, int i102, @tb1 List<Integer> list8, int i103, @tb1 List<Float> list9, int i104, long j3, int i105, int i106, long j4, int i107, int i108, long j5, int i109, int i110, int i111, int i112, int i113, int i114, float f13, float f14, int i115, int i116, @tb1 List<Integer> list10, int i117, @tb1 String str, int i118) {
        Intrinsics.X0O(mLocalTime, "mLocalTime");
        Intrinsics.X0O(mPrototype, "mPrototype");
        Intrinsics.X0O(mFirmwareFlag, "mFirmwareFlag");
        Intrinsics.X0O(mBleName, "mBleName");
        Intrinsics.X0O(mPlatform, "mPlatform");
        return new Workout(i, j, j2, mLocalTime, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, mPrototype, mFirmwareFlag, mBleName, mPlatform, i28, i29, i30, i31, i32, i33, f, f2, i34, f3, i35, i36, i37, iArr, iArr2, i38, i39, i40, i41, i42, i43, i44, i45, list, i46, i47, list2, i48, i49, list3, i50, i51, list4, i52, i53, list5, i54, i55, list6, i56, i57, i58, i59, i60, i61, i62, i63, i64, i65, i66, i67, i68, i69, i70, i71, i72, i73, f4, i74, i75, f5, iArr3, fArr, i76, i77, i78, list7, f6, f7, f8, f9, i79, i80, i81, i82, i83, i84, i85, i86, i87, i88, i89, i90, f10, f11, i91, i92, i93, i94, f12, fArr2, fArr3, i95, i96, i97, i98, i99, i100, i101, i102, list8, i103, list9, i104, j3, i105, i106, j4, i107, i108, j5, i109, i110, i111, i112, i113, i114, f13, f14, i115, i116, list10, i117, str, i118);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Workout)) {
            return false;
        }
        Workout workout = (Workout) obj;
        return this.mId == workout.mId && this.mStart == workout.mStart && this.mEnd == workout.mEnd && Intrinsics.XOO0ii0(this.mLocalTime, workout.mLocalTime) && this.mDuration == workout.mDuration && this.mAltitude == workout.mAltitude && this.mAirPressure == workout.mAirPressure && this.mSpm == workout.mSpm && this.mMode == workout.mMode && this.mStep == workout.mStep && this.mDistance == workout.mDistance && this.mCalorie == workout.mCalorie && this.mSpeed == workout.mSpeed && this.mPace == workout.mPace && this.mAvgBpm == workout.mAvgBpm && this.mMaxBpm == workout.mMaxBpm && this.mMinBpm == workout.mMinBpm && this.mMaxSpm == workout.mMaxSpm && this.mMinSpm == workout.mMinSpm && this.mMaxPace == workout.mMaxPace && this.mMinPace == workout.mMinPace && this.mMaxAltitude == workout.mMaxAltitude && this.mMinAltitude == workout.mMinAltitude && this.mMinStress == workout.mMinStress && this.mMaxStress == workout.mMaxStress && this.mAvgStress == workout.mAvgStress && this.mSource == workout.mSource && this.mIsSync == workout.mIsSync && this.mIsDelete == workout.mIsDelete && this.mFeel == workout.mFeel && Intrinsics.XOO0ii0(this.mPrototype, workout.mPrototype) && Intrinsics.XOO0ii0(this.mFirmwareFlag, workout.mFirmwareFlag) && Intrinsics.XOO0ii0(this.mBleName, workout.mBleName) && Intrinsics.XOO0ii0(this.mPlatform, workout.mPlatform) && this.mMaxSpeed == workout.mMaxSpeed && this.mMinSpeed == workout.mMinSpeed && this.mRestDuration == workout.mRestDuration && this.mAGpsType == workout.mAGpsType && this.mType == workout.mType && this.mMetTotal == workout.mMetTotal && Float.compare(this.mAerobic, workout.mAerobic) == 0 && Float.compare(this.mAnaerobic, workout.mAnaerobic) == 0 && this.mStamina == workout.mStamina && Float.compare(this.mAvgSpeed, workout.mAvgSpeed) == 0 && this.mCadence == workout.mCadence && this.mMaxCadence == workout.mMaxCadence && this.mCnt == workout.mCnt && Intrinsics.XOO0ii0(this.mBpmZoneCount, workout.mBpmZoneCount) && Intrinsics.XOO0ii0(this.mPersonalZone, workout.mPersonalZone) && this.mLactateThresholdPace == workout.mLactateThresholdPace && this.mRecoveryTime == workout.mRecoveryTime && this.mTrainingLoad == workout.mTrainingLoad && this.mMaxVO2 == workout.mMaxVO2 && this.mLactateThresholdHr == workout.mLactateThresholdHr && this.mAlgorithmMarking == workout.mAlgorithmMarking && this.mPathCount == workout.mPathCount && this.mPathSampleInterval == workout.mPathSampleInterval && Intrinsics.XOO0ii0(this.mPathPoints, workout.mPathPoints) && this.mHrPathCount == workout.mHrPathCount && this.mHrPathSampleInterval == workout.mHrPathSampleInterval && Intrinsics.XOO0ii0(this.mHrPathPoints, workout.mHrPathPoints) && this.mPacePathCount == workout.mPacePathCount && this.mPacePathSampleInterval == workout.mPacePathSampleInterval && Intrinsics.XOO0ii0(this.mPacePathPoints, workout.mPacePathPoints) && this.mSpeedPathCount == workout.mSpeedPathCount && this.mSpeedPathSampleInterval == workout.mSpeedPathSampleInterval && Intrinsics.XOO0ii0(this.mSpeedPathPoints, workout.mSpeedPathPoints) && this.mCadencePathCount == workout.mCadencePathCount && this.mCadencePathSampleInterval == workout.mCadencePathSampleInterval && Intrinsics.XOO0ii0(this.mCadencePathPoints, workout.mCadencePathPoints) && this.mAltitudePathCount == workout.mAltitudePathCount && this.mAltitudePathSampleInterval == workout.mAltitudePathSampleInterval && Intrinsics.XOO0ii0(this.mAltitudePathPoints, workout.mAltitudePathPoints) && this.mGoalDistance == workout.mGoalDistance && this.mGoalTime == workout.mGoalTime && this.mGoalCalorie == workout.mGoalCalorie && this.mPausedDuration == workout.mPausedDuration && this.mCurBpm == workout.mCurBpm && this.mAscendAltitude == workout.mAscendAltitude && this.mDescendAltitude == workout.mDescendAltitude && this.mCurStress == workout.mCurStress && this.mSwimType == workout.mSwimType && this.mCntFore == workout.mCntFore && this.mCntBack == workout.mCntBack && this.mBackSwingTime == workout.mBackSwingTime && this.mDownSwingTime == workout.mDownSwingTime && this.mDribbleTime == workout.mDribbleTime && this.mTripCount == workout.mTripCount && this.mSessionCount == workout.mSessionCount && this.mVerticalOscillation == workout.mVerticalOscillation && this.mRunPowerWatt == workout.mRunPowerWatt && Float.compare(this.mStepLen, workout.mStepLen) == 0 && this.mTrainingStatus == workout.mTrainingStatus && this.mFitnessAge == workout.mFitnessAge && Float.compare(this.mTlTrend, workout.mTlTrend) == 0 && Intrinsics.XOO0ii0(this.mBestRunTime, workout.mBestRunTime) && Intrinsics.XOO0ii0(this.mFitnessLevel, workout.mFitnessLevel) && this.mCalorieTotal == workout.mCalorieTotal && this.mPowerCount == workout.mPowerCount && this.mPowerInterval == workout.mPowerInterval && Intrinsics.XOO0ii0(this.mPowerPoints, workout.mPowerPoints) && Float.compare(this.realTimeAerobic, workout.realTimeAerobic) == 0 && Float.compare(this.realTimeAnaerobic, workout.realTimeAnaerobic) == 0 && Float.compare(this.mFatTotal, workout.mFatTotal) == 0 && Float.compare(this.mCarboTotal, workout.mCarboTotal) == 0 && this.mNavigatorTargetTime == workout.mNavigatorTargetTime && this.mNavigatorActualTime == workout.mNavigatorActualTime && this.mNavigatorDifferenceTime == workout.mNavigatorDifferenceTime && this.mNavigatorStatusTime == workout.mNavigatorStatusTime && this.mNavigatorTargetDistance == workout.mNavigatorTargetDistance && this.mNavigatorActualDistance == workout.mNavigatorActualDistance && this.mNavigatorDifferenceDistance == workout.mNavigatorDifferenceDistance && this.mNavigatorStatusDistance == workout.mNavigatorStatusDistance && this.mNavigatorTargetPace == workout.mNavigatorTargetPace && this.mNavigatorActualPace == workout.mNavigatorActualPace && this.mNavigatorDifferencePace == workout.mNavigatorDifferencePace && this.mNavigatorStatusPace == workout.mNavigatorStatusPace && Float.compare(this.mNavigatorTargetSpeedV2, workout.mNavigatorTargetSpeedV2) == 0 && Float.compare(this.mNavigatorActualSpeedV2, workout.mNavigatorActualSpeedV2) == 0 && this.mNavigatorTargetSpeed == workout.mNavigatorTargetSpeed && this.mNavigatorActualSpeed == workout.mNavigatorActualSpeed && this.mNavigatorDifferenceSpeed == workout.mNavigatorDifferenceSpeed && this.mNavigatorStatusSpeed == workout.mNavigatorStatusSpeed && Float.compare(this.mMaxOxygenPower, workout.mMaxOxygenPower) == 0 && Intrinsics.XOO0ii0(this.mTrendWeek, workout.mTrendWeek) && Intrinsics.XOO0ii0(this.mCyclingIndex, workout.mCyclingIndex) && this.mStaBalance == workout.mStaBalance && this.mSwimSwolf == workout.mSwimSwolf && this.mCntLap == workout.mCntLap && this.mFrontCrawlPerc == workout.mFrontCrawlPerc && this.mBreaststrokePerc == workout.mBreaststrokePerc && this.mBackstrokePerc == workout.mBackstrokePerc && this.mButterflyPerc == workout.mButterflyPerc && this.mSpmPathPointsCount == workout.mSpmPathPointsCount && Intrinsics.XOO0ii0(this.mSpmPathPointsPoints, workout.mSpmPathPointsPoints) && this.mStepLenCount == workout.mStepLenCount && Intrinsics.XOO0ii0(this.mStepLenPoints, workout.mStepLenPoints) && this.mEllipticalSteps == workout.mEllipticalSteps && this.mChildSwimStartTime == workout.mChildSwimStartTime && this.mChildSwimDuration == workout.mChildSwimDuration && this.mChildSwimDistance == workout.mChildSwimDistance && this.mChildCyclingStartTime == workout.mChildCyclingStartTime && this.mChildCyclingDuration == workout.mChildCyclingDuration && this.mChildCyclingDistance == workout.mChildCyclingDistance && this.mChildRunStartTime == workout.mChildRunStartTime && this.mChildRunDuration == workout.mChildRunDuration && this.mChildRunDistance == workout.mChildRunDistance && this.mChildSwimMode == workout.mChildSwimMode && this.mChildCyclingMode == workout.mChildCyclingMode && this.mChildRunMode == workout.mChildRunMode && this.mChildNumber == workout.mChildNumber && Float.compare(this.mRunLactateAvg, workout.mRunLactateAvg) == 0 && Float.compare(this.mCyclingLactateAvg, workout.mCyclingLactateAvg) == 0 && this.mFlag == workout.mFlag && this.mRecoveryHrCount == workout.mRecoveryHrCount && Intrinsics.XOO0ii0(this.mRecoveryHrPoints, workout.mRecoveryHrPoints) && this.mSwimPoolLength == workout.mSwimPoolLength && Intrinsics.XOO0ii0(this.mDeviceId, workout.mDeviceId) && this.mAICoachSportID == workout.mAICoachSportID;
    }

    public final int getMAGpsType() {
        return this.mAGpsType;
    }

    public final int getMAICoachSportID() {
        return this.mAICoachSportID;
    }

    public final float getMAerobic() {
        return this.mAerobic;
    }

    public final int getMAirPressure() {
        return this.mAirPressure;
    }

    public final int getMAlgorithmMarking() {
        return this.mAlgorithmMarking;
    }

    public final int getMAltitude() {
        return this.mAltitude;
    }

    public final int getMAltitudePathCount() {
        return this.mAltitudePathCount;
    }

    @tb1
    public final List<Integer> getMAltitudePathPoints() {
        return this.mAltitudePathPoints;
    }

    public final int getMAltitudePathSampleInterval() {
        return this.mAltitudePathSampleInterval;
    }

    public final float getMAnaerobic() {
        return this.mAnaerobic;
    }

    public final int getMAscendAltitude() {
        return this.mAscendAltitude;
    }

    public final int getMAvgBpm() {
        return this.mAvgBpm;
    }

    public final float getMAvgSpeed() {
        return this.mAvgSpeed;
    }

    public final int getMAvgStress() {
        return this.mAvgStress;
    }

    public final int getMBackSwingTime() {
        return this.mBackSwingTime;
    }

    public final int getMBackstrokePerc() {
        return this.mBackstrokePerc;
    }

    @tb1
    public final int[] getMBestRunTime() {
        return this.mBestRunTime;
    }

    @aa1
    public final String getMBleName() {
        return this.mBleName;
    }

    @tb1
    public final int[] getMBpmZoneCount() {
        return this.mBpmZoneCount;
    }

    public final int getMBreaststrokePerc() {
        return this.mBreaststrokePerc;
    }

    public final int getMButterflyPerc() {
        return this.mButterflyPerc;
    }

    public final int getMCadence() {
        return this.mCadence;
    }

    public final int getMCadencePathCount() {
        return this.mCadencePathCount;
    }

    @tb1
    public final List<Integer> getMCadencePathPoints() {
        return this.mCadencePathPoints;
    }

    public final int getMCadencePathSampleInterval() {
        return this.mCadencePathSampleInterval;
    }

    public final int getMCalorie() {
        return this.mCalorie;
    }

    public final int getMCalorieTotal() {
        return this.mCalorieTotal;
    }

    public final float getMCarboTotal() {
        return this.mCarboTotal;
    }

    public final int getMChildCyclingDistance() {
        return this.mChildCyclingDistance;
    }

    public final int getMChildCyclingDuration() {
        return this.mChildCyclingDuration;
    }

    public final int getMChildCyclingMode() {
        return this.mChildCyclingMode;
    }

    public final long getMChildCyclingStartTime() {
        return this.mChildCyclingStartTime;
    }

    public final int getMChildNumber() {
        return this.mChildNumber;
    }

    public final int getMChildRunDistance() {
        return this.mChildRunDistance;
    }

    public final int getMChildRunDuration() {
        return this.mChildRunDuration;
    }

    public final int getMChildRunMode() {
        return this.mChildRunMode;
    }

    public final long getMChildRunStartTime() {
        return this.mChildRunStartTime;
    }

    public final int getMChildSwimDistance() {
        return this.mChildSwimDistance;
    }

    public final int getMChildSwimDuration() {
        return this.mChildSwimDuration;
    }

    public final int getMChildSwimMode() {
        return this.mChildSwimMode;
    }

    public final long getMChildSwimStartTime() {
        return this.mChildSwimStartTime;
    }

    public final int getMCnt() {
        return this.mCnt;
    }

    public final int getMCntBack() {
        return this.mCntBack;
    }

    public final int getMCntFore() {
        return this.mCntFore;
    }

    public final int getMCntLap() {
        return this.mCntLap;
    }

    public final int getMCurBpm() {
        return this.mCurBpm;
    }

    public final int getMCurStress() {
        return this.mCurStress;
    }

    @tb1
    public final float[] getMCyclingIndex() {
        return this.mCyclingIndex;
    }

    public final float getMCyclingLactateAvg() {
        return this.mCyclingLactateAvg;
    }

    public final int getMDescendAltitude() {
        return this.mDescendAltitude;
    }

    @tb1
    public final String getMDeviceId() {
        return this.mDeviceId;
    }

    public final int getMDistance() {
        return this.mDistance;
    }

    public final int getMDownSwingTime() {
        return this.mDownSwingTime;
    }

    public final int getMDribbleTime() {
        return this.mDribbleTime;
    }

    public final int getMDuration() {
        return this.mDuration;
    }

    public final int getMEllipticalSteps() {
        return this.mEllipticalSteps;
    }

    public final long getMEnd() {
        return this.mEnd;
    }

    public final float getMFatTotal() {
        return this.mFatTotal;
    }

    public final int getMFeel() {
        return this.mFeel;
    }

    @aa1
    public final String getMFirmwareFlag() {
        return this.mFirmwareFlag;
    }

    public final int getMFitnessAge() {
        return this.mFitnessAge;
    }

    @tb1
    public final float[] getMFitnessLevel() {
        return this.mFitnessLevel;
    }

    public final int getMFlag() {
        return this.mFlag;
    }

    public final int getMFrontCrawlPerc() {
        return this.mFrontCrawlPerc;
    }

    public final int getMGoalCalorie() {
        return this.mGoalCalorie;
    }

    public final int getMGoalDistance() {
        return this.mGoalDistance;
    }

    public final int getMGoalTime() {
        return this.mGoalTime;
    }

    public final int getMHrPathCount() {
        return this.mHrPathCount;
    }

    @tb1
    public final List<Integer> getMHrPathPoints() {
        return this.mHrPathPoints;
    }

    public final int getMHrPathSampleInterval() {
        return this.mHrPathSampleInterval;
    }

    public final int getMId() {
        return this.mId;
    }

    public final int getMIsDelete() {
        return this.mIsDelete;
    }

    public final int getMIsSync() {
        return this.mIsSync;
    }

    public final int getMLactateThresholdHr() {
        return this.mLactateThresholdHr;
    }

    public final int getMLactateThresholdPace() {
        return this.mLactateThresholdPace;
    }

    @aa1
    public final String getMLocalTime() {
        return this.mLocalTime;
    }

    public final int getMMaxAltitude() {
        return this.mMaxAltitude;
    }

    public final int getMMaxBpm() {
        return this.mMaxBpm;
    }

    public final int getMMaxCadence() {
        return this.mMaxCadence;
    }

    public final float getMMaxOxygenPower() {
        return this.mMaxOxygenPower;
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

    public final int getMMaxVO2() {
        return this.mMaxVO2;
    }

    public final int getMMetTotal() {
        return this.mMetTotal;
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

    public final int getMNavigatorActualDistance() {
        return this.mNavigatorActualDistance;
    }

    public final int getMNavigatorActualPace() {
        return this.mNavigatorActualPace;
    }

    public final int getMNavigatorActualSpeed() {
        return this.mNavigatorActualSpeed;
    }

    public final float getMNavigatorActualSpeedV2() {
        return this.mNavigatorActualSpeedV2;
    }

    public final int getMNavigatorActualTime() {
        return this.mNavigatorActualTime;
    }

    public final int getMNavigatorDifferenceDistance() {
        return this.mNavigatorDifferenceDistance;
    }

    public final int getMNavigatorDifferencePace() {
        return this.mNavigatorDifferencePace;
    }

    public final int getMNavigatorDifferenceSpeed() {
        return this.mNavigatorDifferenceSpeed;
    }

    public final int getMNavigatorDifferenceTime() {
        return this.mNavigatorDifferenceTime;
    }

    public final int getMNavigatorStatusDistance() {
        return this.mNavigatorStatusDistance;
    }

    public final int getMNavigatorStatusPace() {
        return this.mNavigatorStatusPace;
    }

    public final int getMNavigatorStatusSpeed() {
        return this.mNavigatorStatusSpeed;
    }

    public final int getMNavigatorStatusTime() {
        return this.mNavigatorStatusTime;
    }

    public final int getMNavigatorTargetDistance() {
        return this.mNavigatorTargetDistance;
    }

    public final int getMNavigatorTargetPace() {
        return this.mNavigatorTargetPace;
    }

    public final int getMNavigatorTargetSpeed() {
        return this.mNavigatorTargetSpeed;
    }

    public final float getMNavigatorTargetSpeedV2() {
        return this.mNavigatorTargetSpeedV2;
    }

    public final int getMNavigatorTargetTime() {
        return this.mNavigatorTargetTime;
    }

    public final int getMPace() {
        return this.mPace;
    }

    public final int getMPacePathCount() {
        return this.mPacePathCount;
    }

    @tb1
    public final List<Integer> getMPacePathPoints() {
        return this.mPacePathPoints;
    }

    public final int getMPacePathSampleInterval() {
        return this.mPacePathSampleInterval;
    }

    public final int getMPathCount() {
        return this.mPathCount;
    }

    @tb1
    public final List<float[]> getMPathPoints() {
        return this.mPathPoints;
    }

    public final int getMPathSampleInterval() {
        return this.mPathSampleInterval;
    }

    public final int getMPausedDuration() {
        return this.mPausedDuration;
    }

    @tb1
    public final int[] getMPersonalZone() {
        return this.mPersonalZone;
    }

    @aa1
    public final String getMPlatform() {
        return this.mPlatform;
    }

    public final int getMPowerCount() {
        return this.mPowerCount;
    }

    public final int getMPowerInterval() {
        return this.mPowerInterval;
    }

    @tb1
    public final List<Integer> getMPowerPoints() {
        return this.mPowerPoints;
    }

    @aa1
    public final String getMPrototype() {
        return this.mPrototype;
    }

    public final int getMRecoveryHrCount() {
        return this.mRecoveryHrCount;
    }

    @tb1
    public final List<Integer> getMRecoveryHrPoints() {
        return this.mRecoveryHrPoints;
    }

    public final int getMRecoveryTime() {
        return this.mRecoveryTime;
    }

    public final int getMRestDuration() {
        return this.mRestDuration;
    }

    public final float getMRunLactateAvg() {
        return this.mRunLactateAvg;
    }

    public final int getMRunPowerWatt() {
        return this.mRunPowerWatt;
    }

    public final int getMSessionCount() {
        return this.mSessionCount;
    }

    public final int getMSource() {
        return this.mSource;
    }

    public final int getMSpeed() {
        return this.mSpeed;
    }

    public final int getMSpeedPathCount() {
        return this.mSpeedPathCount;
    }

    @tb1
    public final List<Integer> getMSpeedPathPoints() {
        return this.mSpeedPathPoints;
    }

    public final int getMSpeedPathSampleInterval() {
        return this.mSpeedPathSampleInterval;
    }

    public final int getMSpm() {
        return this.mSpm;
    }

    public final int getMSpmPathPointsCount() {
        return this.mSpmPathPointsCount;
    }

    @tb1
    public final List<Integer> getMSpmPathPointsPoints() {
        return this.mSpmPathPointsPoints;
    }

    public final int getMStaBalance() {
        return this.mStaBalance;
    }

    public final int getMStamina() {
        return this.mStamina;
    }

    public final long getMStart() {
        return this.mStart;
    }

    public final int getMStep() {
        return this.mStep;
    }

    public final float getMStepLen() {
        return this.mStepLen;
    }

    public final int getMStepLenCount() {
        return this.mStepLenCount;
    }

    @tb1
    public final List<Float> getMStepLenPoints() {
        return this.mStepLenPoints;
    }

    public final int getMSwimPoolLength() {
        return this.mSwimPoolLength;
    }

    public final int getMSwimSwolf() {
        return this.mSwimSwolf;
    }

    public final int getMSwimType() {
        return this.mSwimType;
    }

    public final float getMTlTrend() {
        return this.mTlTrend;
    }

    public final int getMTrainingLoad() {
        return this.mTrainingLoad;
    }

    public final int getMTrainingStatus() {
        return this.mTrainingStatus;
    }

    @tb1
    public final float[] getMTrendWeek() {
        return this.mTrendWeek;
    }

    public final int getMTripCount() {
        return this.mTripCount;
    }

    public final int getMType() {
        return this.mType;
    }

    public final int getMVerticalOscillation() {
        return this.mVerticalOscillation;
    }

    public final float getRealTimeAerobic() {
        return this.realTimeAerobic;
    }

    public final float getRealTimeAnaerobic() {
        return this.realTimeAnaerobic;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((Integer.hashCode(this.mId) * 31) + Long.hashCode(this.mStart)) * 31) + Long.hashCode(this.mEnd)) * 31) + this.mLocalTime.hashCode()) * 31) + Integer.hashCode(this.mDuration)) * 31) + Integer.hashCode(this.mAltitude)) * 31) + Integer.hashCode(this.mAirPressure)) * 31) + Integer.hashCode(this.mSpm)) * 31) + Integer.hashCode(this.mMode)) * 31) + Integer.hashCode(this.mStep)) * 31) + Integer.hashCode(this.mDistance)) * 31) + Integer.hashCode(this.mCalorie)) * 31) + Integer.hashCode(this.mSpeed)) * 31) + Integer.hashCode(this.mPace)) * 31) + Integer.hashCode(this.mAvgBpm)) * 31) + Integer.hashCode(this.mMaxBpm)) * 31) + Integer.hashCode(this.mMinBpm)) * 31) + Integer.hashCode(this.mMaxSpm)) * 31) + Integer.hashCode(this.mMinSpm)) * 31) + Integer.hashCode(this.mMaxPace)) * 31) + Integer.hashCode(this.mMinPace)) * 31) + Integer.hashCode(this.mMaxAltitude)) * 31) + Integer.hashCode(this.mMinAltitude)) * 31) + Integer.hashCode(this.mMinStress)) * 31) + Integer.hashCode(this.mMaxStress)) * 31) + Integer.hashCode(this.mAvgStress)) * 31) + Integer.hashCode(this.mSource)) * 31) + Integer.hashCode(this.mIsSync)) * 31) + Integer.hashCode(this.mIsDelete)) * 31) + Integer.hashCode(this.mFeel)) * 31) + this.mPrototype.hashCode()) * 31) + this.mFirmwareFlag.hashCode()) * 31) + this.mBleName.hashCode()) * 31) + this.mPlatform.hashCode()) * 31) + Integer.hashCode(this.mMaxSpeed)) * 31) + Integer.hashCode(this.mMinSpeed)) * 31) + Integer.hashCode(this.mRestDuration)) * 31) + Integer.hashCode(this.mAGpsType)) * 31) + Integer.hashCode(this.mType)) * 31) + Integer.hashCode(this.mMetTotal)) * 31) + Float.hashCode(this.mAerobic)) * 31) + Float.hashCode(this.mAnaerobic)) * 31) + Integer.hashCode(this.mStamina)) * 31) + Float.hashCode(this.mAvgSpeed)) * 31) + Integer.hashCode(this.mCadence)) * 31) + Integer.hashCode(this.mMaxCadence)) * 31) + Integer.hashCode(this.mCnt)) * 31;
        int[] iArr = this.mBpmZoneCount;
        int iHashCode2 = (iHashCode + (iArr == null ? 0 : Arrays.hashCode(iArr))) * 31;
        int[] iArr2 = this.mPersonalZone;
        int iHashCode3 = (((((((((((((((((iHashCode2 + (iArr2 == null ? 0 : Arrays.hashCode(iArr2))) * 31) + Integer.hashCode(this.mLactateThresholdPace)) * 31) + Integer.hashCode(this.mRecoveryTime)) * 31) + Integer.hashCode(this.mTrainingLoad)) * 31) + Integer.hashCode(this.mMaxVO2)) * 31) + Integer.hashCode(this.mLactateThresholdHr)) * 31) + Integer.hashCode(this.mAlgorithmMarking)) * 31) + Integer.hashCode(this.mPathCount)) * 31) + Integer.hashCode(this.mPathSampleInterval)) * 31;
        List<float[]> list = this.mPathPoints;
        int iHashCode4 = (((((iHashCode3 + (list == null ? 0 : list.hashCode())) * 31) + Integer.hashCode(this.mHrPathCount)) * 31) + Integer.hashCode(this.mHrPathSampleInterval)) * 31;
        List<Integer> list2 = this.mHrPathPoints;
        int iHashCode5 = (((((iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31) + Integer.hashCode(this.mPacePathCount)) * 31) + Integer.hashCode(this.mPacePathSampleInterval)) * 31;
        List<Integer> list3 = this.mPacePathPoints;
        int iHashCode6 = (((((iHashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31) + Integer.hashCode(this.mSpeedPathCount)) * 31) + Integer.hashCode(this.mSpeedPathSampleInterval)) * 31;
        List<Integer> list4 = this.mSpeedPathPoints;
        int iHashCode7 = (((((iHashCode6 + (list4 == null ? 0 : list4.hashCode())) * 31) + Integer.hashCode(this.mCadencePathCount)) * 31) + Integer.hashCode(this.mCadencePathSampleInterval)) * 31;
        List<Integer> list5 = this.mCadencePathPoints;
        int iHashCode8 = (((((iHashCode7 + (list5 == null ? 0 : list5.hashCode())) * 31) + Integer.hashCode(this.mAltitudePathCount)) * 31) + Integer.hashCode(this.mAltitudePathSampleInterval)) * 31;
        List<Integer> list6 = this.mAltitudePathPoints;
        int iHashCode9 = (((((((((((((((((((((((((((((((((((((((((((((iHashCode8 + (list6 == null ? 0 : list6.hashCode())) * 31) + Integer.hashCode(this.mGoalDistance)) * 31) + Integer.hashCode(this.mGoalTime)) * 31) + Integer.hashCode(this.mGoalCalorie)) * 31) + Integer.hashCode(this.mPausedDuration)) * 31) + Integer.hashCode(this.mCurBpm)) * 31) + Integer.hashCode(this.mAscendAltitude)) * 31) + Integer.hashCode(this.mDescendAltitude)) * 31) + Integer.hashCode(this.mCurStress)) * 31) + Integer.hashCode(this.mSwimType)) * 31) + Integer.hashCode(this.mCntFore)) * 31) + Integer.hashCode(this.mCntBack)) * 31) + Integer.hashCode(this.mBackSwingTime)) * 31) + Integer.hashCode(this.mDownSwingTime)) * 31) + Integer.hashCode(this.mDribbleTime)) * 31) + Integer.hashCode(this.mTripCount)) * 31) + Integer.hashCode(this.mSessionCount)) * 31) + Integer.hashCode(this.mVerticalOscillation)) * 31) + Integer.hashCode(this.mRunPowerWatt)) * 31) + Float.hashCode(this.mStepLen)) * 31) + Integer.hashCode(this.mTrainingStatus)) * 31) + Integer.hashCode(this.mFitnessAge)) * 31) + Float.hashCode(this.mTlTrend)) * 31;
        int[] iArr3 = this.mBestRunTime;
        int iHashCode10 = (iHashCode9 + (iArr3 == null ? 0 : Arrays.hashCode(iArr3))) * 31;
        float[] fArr = this.mFitnessLevel;
        int iHashCode11 = (((((((iHashCode10 + (fArr == null ? 0 : Arrays.hashCode(fArr))) * 31) + Integer.hashCode(this.mCalorieTotal)) * 31) + Integer.hashCode(this.mPowerCount)) * 31) + Integer.hashCode(this.mPowerInterval)) * 31;
        List<Integer> list7 = this.mPowerPoints;
        int iHashCode12 = (((((((((((((((((((((((((((((((((((((((((((((((iHashCode11 + (list7 == null ? 0 : list7.hashCode())) * 31) + Float.hashCode(this.realTimeAerobic)) * 31) + Float.hashCode(this.realTimeAnaerobic)) * 31) + Float.hashCode(this.mFatTotal)) * 31) + Float.hashCode(this.mCarboTotal)) * 31) + Integer.hashCode(this.mNavigatorTargetTime)) * 31) + Integer.hashCode(this.mNavigatorActualTime)) * 31) + Integer.hashCode(this.mNavigatorDifferenceTime)) * 31) + Integer.hashCode(this.mNavigatorStatusTime)) * 31) + Integer.hashCode(this.mNavigatorTargetDistance)) * 31) + Integer.hashCode(this.mNavigatorActualDistance)) * 31) + Integer.hashCode(this.mNavigatorDifferenceDistance)) * 31) + Integer.hashCode(this.mNavigatorStatusDistance)) * 31) + Integer.hashCode(this.mNavigatorTargetPace)) * 31) + Integer.hashCode(this.mNavigatorActualPace)) * 31) + Integer.hashCode(this.mNavigatorDifferencePace)) * 31) + Integer.hashCode(this.mNavigatorStatusPace)) * 31) + Float.hashCode(this.mNavigatorTargetSpeedV2)) * 31) + Float.hashCode(this.mNavigatorActualSpeedV2)) * 31) + Integer.hashCode(this.mNavigatorTargetSpeed)) * 31) + Integer.hashCode(this.mNavigatorActualSpeed)) * 31) + Integer.hashCode(this.mNavigatorDifferenceSpeed)) * 31) + Integer.hashCode(this.mNavigatorStatusSpeed)) * 31) + Float.hashCode(this.mMaxOxygenPower)) * 31;
        float[] fArr2 = this.mTrendWeek;
        int iHashCode13 = (iHashCode12 + (fArr2 == null ? 0 : Arrays.hashCode(fArr2))) * 31;
        float[] fArr3 = this.mCyclingIndex;
        int iHashCode14 = (((((((((((((((((iHashCode13 + (fArr3 == null ? 0 : Arrays.hashCode(fArr3))) * 31) + Integer.hashCode(this.mStaBalance)) * 31) + Integer.hashCode(this.mSwimSwolf)) * 31) + Integer.hashCode(this.mCntLap)) * 31) + Integer.hashCode(this.mFrontCrawlPerc)) * 31) + Integer.hashCode(this.mBreaststrokePerc)) * 31) + Integer.hashCode(this.mBackstrokePerc)) * 31) + Integer.hashCode(this.mButterflyPerc)) * 31) + Integer.hashCode(this.mSpmPathPointsCount)) * 31;
        List<Integer> list8 = this.mSpmPathPointsPoints;
        int iHashCode15 = (((iHashCode14 + (list8 == null ? 0 : list8.hashCode())) * 31) + Integer.hashCode(this.mStepLenCount)) * 31;
        List<Float> list9 = this.mStepLenPoints;
        int iHashCode16 = (((((((((((((((((((((((((((((((((((((iHashCode15 + (list9 == null ? 0 : list9.hashCode())) * 31) + Integer.hashCode(this.mEllipticalSteps)) * 31) + Long.hashCode(this.mChildSwimStartTime)) * 31) + Integer.hashCode(this.mChildSwimDuration)) * 31) + Integer.hashCode(this.mChildSwimDistance)) * 31) + Long.hashCode(this.mChildCyclingStartTime)) * 31) + Integer.hashCode(this.mChildCyclingDuration)) * 31) + Integer.hashCode(this.mChildCyclingDistance)) * 31) + Long.hashCode(this.mChildRunStartTime)) * 31) + Integer.hashCode(this.mChildRunDuration)) * 31) + Integer.hashCode(this.mChildRunDistance)) * 31) + Integer.hashCode(this.mChildSwimMode)) * 31) + Integer.hashCode(this.mChildCyclingMode)) * 31) + Integer.hashCode(this.mChildRunMode)) * 31) + Integer.hashCode(this.mChildNumber)) * 31) + Float.hashCode(this.mRunLactateAvg)) * 31) + Float.hashCode(this.mCyclingLactateAvg)) * 31) + Integer.hashCode(this.mFlag)) * 31) + Integer.hashCode(this.mRecoveryHrCount)) * 31;
        List<Integer> list10 = this.mRecoveryHrPoints;
        int iHashCode17 = (((iHashCode16 + (list10 == null ? 0 : list10.hashCode())) * 31) + Integer.hashCode(this.mSwimPoolLength)) * 31;
        String str = this.mDeviceId;
        return ((iHashCode17 + (str != null ? str.hashCode() : 0)) * 31) + Integer.hashCode(this.mAICoachSportID);
    }

    public final void setMAGpsType(int i) {
        this.mAGpsType = i;
    }

    public final void setMAICoachSportID(int i) {
        this.mAICoachSportID = i;
    }

    public final void setMAerobic(float f) {
        this.mAerobic = f;
    }

    public final void setMAirPressure(int i) {
        this.mAirPressure = i;
    }

    public final void setMAlgorithmMarking(int i) {
        this.mAlgorithmMarking = i;
    }

    public final void setMAltitude(int i) {
        this.mAltitude = i;
    }

    public final void setMAltitudePathCount(int i) {
        this.mAltitudePathCount = i;
    }

    public final void setMAltitudePathPoints(@tb1 List<Integer> list) {
        this.mAltitudePathPoints = list;
    }

    public final void setMAltitudePathSampleInterval(int i) {
        this.mAltitudePathSampleInterval = i;
    }

    public final void setMAnaerobic(float f) {
        this.mAnaerobic = f;
    }

    public final void setMAscendAltitude(int i) {
        this.mAscendAltitude = i;
    }

    public final void setMAvgBpm(int i) {
        this.mAvgBpm = i;
    }

    public final void setMAvgSpeed(float f) {
        this.mAvgSpeed = f;
    }

    public final void setMAvgStress(int i) {
        this.mAvgStress = i;
    }

    public final void setMBackSwingTime(int i) {
        this.mBackSwingTime = i;
    }

    public final void setMBackstrokePerc(int i) {
        this.mBackstrokePerc = i;
    }

    public final void setMBestRunTime(@tb1 int[] iArr) {
        this.mBestRunTime = iArr;
    }

    public final void setMBleName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mBleName = str;
    }

    public final void setMBpmZoneCount(@tb1 int[] iArr) {
        this.mBpmZoneCount = iArr;
    }

    public final void setMBreaststrokePerc(int i) {
        this.mBreaststrokePerc = i;
    }

    public final void setMButterflyPerc(int i) {
        this.mButterflyPerc = i;
    }

    public final void setMCadence(int i) {
        this.mCadence = i;
    }

    public final void setMCadencePathCount(int i) {
        this.mCadencePathCount = i;
    }

    public final void setMCadencePathPoints(@tb1 List<Integer> list) {
        this.mCadencePathPoints = list;
    }

    public final void setMCadencePathSampleInterval(int i) {
        this.mCadencePathSampleInterval = i;
    }

    public final void setMCalorie(int i) {
        this.mCalorie = i;
    }

    public final void setMCalorieTotal(int i) {
        this.mCalorieTotal = i;
    }

    public final void setMCarboTotal(float f) {
        this.mCarboTotal = f;
    }

    public final void setMChildCyclingDistance(int i) {
        this.mChildCyclingDistance = i;
    }

    public final void setMChildCyclingDuration(int i) {
        this.mChildCyclingDuration = i;
    }

    public final void setMChildCyclingMode(int i) {
        this.mChildCyclingMode = i;
    }

    public final void setMChildCyclingStartTime(long j) {
        this.mChildCyclingStartTime = j;
    }

    public final void setMChildNumber(int i) {
        this.mChildNumber = i;
    }

    public final void setMChildRunDistance(int i) {
        this.mChildRunDistance = i;
    }

    public final void setMChildRunDuration(int i) {
        this.mChildRunDuration = i;
    }

    public final void setMChildRunMode(int i) {
        this.mChildRunMode = i;
    }

    public final void setMChildRunStartTime(long j) {
        this.mChildRunStartTime = j;
    }

    public final void setMChildSwimDistance(int i) {
        this.mChildSwimDistance = i;
    }

    public final void setMChildSwimDuration(int i) {
        this.mChildSwimDuration = i;
    }

    public final void setMChildSwimMode(int i) {
        this.mChildSwimMode = i;
    }

    public final void setMChildSwimStartTime(long j) {
        this.mChildSwimStartTime = j;
    }

    public final void setMCnt(int i) {
        this.mCnt = i;
    }

    public final void setMCntBack(int i) {
        this.mCntBack = i;
    }

    public final void setMCntFore(int i) {
        this.mCntFore = i;
    }

    public final void setMCntLap(int i) {
        this.mCntLap = i;
    }

    public final void setMCurBpm(int i) {
        this.mCurBpm = i;
    }

    public final void setMCurStress(int i) {
        this.mCurStress = i;
    }

    public final void setMCyclingIndex(@tb1 float[] fArr) {
        this.mCyclingIndex = fArr;
    }

    public final void setMCyclingLactateAvg(float f) {
        this.mCyclingLactateAvg = f;
    }

    public final void setMDescendAltitude(int i) {
        this.mDescendAltitude = i;
    }

    public final void setMDeviceId(@tb1 String str) {
        this.mDeviceId = str;
    }

    public final void setMDistance(int i) {
        this.mDistance = i;
    }

    public final void setMDownSwingTime(int i) {
        this.mDownSwingTime = i;
    }

    public final void setMDribbleTime(int i) {
        this.mDribbleTime = i;
    }

    public final void setMDuration(int i) {
        this.mDuration = i;
    }

    public final void setMEllipticalSteps(int i) {
        this.mEllipticalSteps = i;
    }

    public final void setMEnd(long j) {
        this.mEnd = j;
    }

    public final void setMFatTotal(float f) {
        this.mFatTotal = f;
    }

    public final void setMFeel(int i) {
        this.mFeel = i;
    }

    public final void setMFirmwareFlag(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mFirmwareFlag = str;
    }

    public final void setMFitnessAge(int i) {
        this.mFitnessAge = i;
    }

    public final void setMFitnessLevel(@tb1 float[] fArr) {
        this.mFitnessLevel = fArr;
    }

    public final void setMFlag(int i) {
        this.mFlag = i;
    }

    public final void setMFrontCrawlPerc(int i) {
        this.mFrontCrawlPerc = i;
    }

    public final void setMGoalCalorie(int i) {
        this.mGoalCalorie = i;
    }

    public final void setMGoalDistance(int i) {
        this.mGoalDistance = i;
    }

    public final void setMGoalTime(int i) {
        this.mGoalTime = i;
    }

    public final void setMHrPathCount(int i) {
        this.mHrPathCount = i;
    }

    public final void setMHrPathPoints(@tb1 List<Integer> list) {
        this.mHrPathPoints = list;
    }

    public final void setMHrPathSampleInterval(int i) {
        this.mHrPathSampleInterval = i;
    }

    public final void setMIsDelete(int i) {
        this.mIsDelete = i;
    }

    public final void setMIsSync(int i) {
        this.mIsSync = i;
    }

    public final void setMLactateThresholdHr(int i) {
        this.mLactateThresholdHr = i;
    }

    public final void setMLactateThresholdPace(int i) {
        this.mLactateThresholdPace = i;
    }

    public final void setMLocalTime(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mLocalTime = str;
    }

    public final void setMMaxAltitude(int i) {
        this.mMaxAltitude = i;
    }

    public final void setMMaxBpm(int i) {
        this.mMaxBpm = i;
    }

    public final void setMMaxCadence(int i) {
        this.mMaxCadence = i;
    }

    public final void setMMaxOxygenPower(float f) {
        this.mMaxOxygenPower = f;
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

    public final void setMMaxVO2(int i) {
        this.mMaxVO2 = i;
    }

    public final void setMMetTotal(int i) {
        this.mMetTotal = i;
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

    public final void setMNavigatorActualDistance(int i) {
        this.mNavigatorActualDistance = i;
    }

    public final void setMNavigatorActualPace(int i) {
        this.mNavigatorActualPace = i;
    }

    public final void setMNavigatorActualSpeed(int i) {
        this.mNavigatorActualSpeed = i;
    }

    public final void setMNavigatorActualSpeedV2(float f) {
        this.mNavigatorActualSpeedV2 = f;
    }

    public final void setMNavigatorActualTime(int i) {
        this.mNavigatorActualTime = i;
    }

    public final void setMNavigatorDifferenceDistance(int i) {
        this.mNavigatorDifferenceDistance = i;
    }

    public final void setMNavigatorDifferencePace(int i) {
        this.mNavigatorDifferencePace = i;
    }

    public final void setMNavigatorDifferenceSpeed(int i) {
        this.mNavigatorDifferenceSpeed = i;
    }

    public final void setMNavigatorDifferenceTime(int i) {
        this.mNavigatorDifferenceTime = i;
    }

    public final void setMNavigatorStatusDistance(int i) {
        this.mNavigatorStatusDistance = i;
    }

    public final void setMNavigatorStatusPace(int i) {
        this.mNavigatorStatusPace = i;
    }

    public final void setMNavigatorStatusSpeed(int i) {
        this.mNavigatorStatusSpeed = i;
    }

    public final void setMNavigatorStatusTime(int i) {
        this.mNavigatorStatusTime = i;
    }

    public final void setMNavigatorTargetDistance(int i) {
        this.mNavigatorTargetDistance = i;
    }

    public final void setMNavigatorTargetPace(int i) {
        this.mNavigatorTargetPace = i;
    }

    public final void setMNavigatorTargetSpeed(int i) {
        this.mNavigatorTargetSpeed = i;
    }

    public final void setMNavigatorTargetSpeedV2(float f) {
        this.mNavigatorTargetSpeedV2 = f;
    }

    public final void setMNavigatorTargetTime(int i) {
        this.mNavigatorTargetTime = i;
    }

    public final void setMPace(int i) {
        this.mPace = i;
    }

    public final void setMPacePathCount(int i) {
        this.mPacePathCount = i;
    }

    public final void setMPacePathPoints(@tb1 List<Integer> list) {
        this.mPacePathPoints = list;
    }

    public final void setMPacePathSampleInterval(int i) {
        this.mPacePathSampleInterval = i;
    }

    public final void setMPathCount(int i) {
        this.mPathCount = i;
    }

    public final void setMPathPoints(@tb1 List<float[]> list) {
        this.mPathPoints = list;
    }

    public final void setMPathSampleInterval(int i) {
        this.mPathSampleInterval = i;
    }

    public final void setMPausedDuration(int i) {
        this.mPausedDuration = i;
    }

    public final void setMPersonalZone(@tb1 int[] iArr) {
        this.mPersonalZone = iArr;
    }

    public final void setMPlatform(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mPlatform = str;
    }

    public final void setMPowerCount(int i) {
        this.mPowerCount = i;
    }

    public final void setMPowerInterval(int i) {
        this.mPowerInterval = i;
    }

    public final void setMPowerPoints(@tb1 List<Integer> list) {
        this.mPowerPoints = list;
    }

    public final void setMPrototype(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mPrototype = str;
    }

    public final void setMRecoveryHrCount(int i) {
        this.mRecoveryHrCount = i;
    }

    public final void setMRecoveryHrPoints(@tb1 List<Integer> list) {
        this.mRecoveryHrPoints = list;
    }

    public final void setMRecoveryTime(int i) {
        this.mRecoveryTime = i;
    }

    public final void setMRestDuration(int i) {
        this.mRestDuration = i;
    }

    public final void setMRunLactateAvg(float f) {
        this.mRunLactateAvg = f;
    }

    public final void setMRunPowerWatt(int i) {
        this.mRunPowerWatt = i;
    }

    public final void setMSessionCount(int i) {
        this.mSessionCount = i;
    }

    public final void setMSource(int i) {
        this.mSource = i;
    }

    public final void setMSpeed(int i) {
        this.mSpeed = i;
    }

    public final void setMSpeedPathCount(int i) {
        this.mSpeedPathCount = i;
    }

    public final void setMSpeedPathPoints(@tb1 List<Integer> list) {
        this.mSpeedPathPoints = list;
    }

    public final void setMSpeedPathSampleInterval(int i) {
        this.mSpeedPathSampleInterval = i;
    }

    public final void setMSpm(int i) {
        this.mSpm = i;
    }

    public final void setMSpmPathPointsCount(int i) {
        this.mSpmPathPointsCount = i;
    }

    public final void setMSpmPathPointsPoints(@tb1 List<Integer> list) {
        this.mSpmPathPointsPoints = list;
    }

    public final void setMStaBalance(int i) {
        this.mStaBalance = i;
    }

    public final void setMStamina(int i) {
        this.mStamina = i;
    }

    public final void setMStart(long j) {
        this.mStart = j;
    }

    public final void setMStep(int i) {
        this.mStep = i;
    }

    public final void setMStepLen(float f) {
        this.mStepLen = f;
    }

    public final void setMStepLenCount(int i) {
        this.mStepLenCount = i;
    }

    public final void setMStepLenPoints(@tb1 List<Float> list) {
        this.mStepLenPoints = list;
    }

    public final void setMSwimPoolLength(int i) {
        this.mSwimPoolLength = i;
    }

    public final void setMSwimSwolf(int i) {
        this.mSwimSwolf = i;
    }

    public final void setMSwimType(int i) {
        this.mSwimType = i;
    }

    public final void setMTlTrend(float f) {
        this.mTlTrend = f;
    }

    public final void setMTrainingLoad(int i) {
        this.mTrainingLoad = i;
    }

    public final void setMTrainingStatus(int i) {
        this.mTrainingStatus = i;
    }

    public final void setMTrendWeek(@tb1 float[] fArr) {
        this.mTrendWeek = fArr;
    }

    public final void setMTripCount(int i) {
        this.mTripCount = i;
    }

    public final void setMType(int i) {
        this.mType = i;
    }

    public final void setMVerticalOscillation(int i) {
        this.mVerticalOscillation = i;
    }

    public final void setRealTimeAerobic(float f) {
        this.realTimeAerobic = f;
    }

    public final void setRealTimeAnaerobic(float f) {
        this.realTimeAnaerobic = f;
    }

    @aa1
    public String toString() {
        return "Workout(mId=" + this.mId + ", mStart=" + this.mStart + ", mEnd=" + this.mEnd + ", mLocalTime=" + this.mLocalTime + ", mDuration=" + this.mDuration + ", mAltitude=" + this.mAltitude + ", mAirPressure=" + this.mAirPressure + ", mSpm=" + this.mSpm + ", mMode=" + this.mMode + ", mStep=" + this.mStep + ", mDistance=" + this.mDistance + ", mCalorie=" + this.mCalorie + ", mSpeed=" + this.mSpeed + ", mPace=" + this.mPace + ", mAvgBpm=" + this.mAvgBpm + ", mMaxBpm=" + this.mMaxBpm + ", mMinBpm=" + this.mMinBpm + ", mMaxSpm=" + this.mMaxSpm + ", mMinSpm=" + this.mMinSpm + ", mMaxPace=" + this.mMaxPace + ", mMinPace=" + this.mMinPace + ", mMaxAltitude=" + this.mMaxAltitude + ", mMinAltitude=" + this.mMinAltitude + ", mMinStress=" + this.mMinStress + ", mMaxStress=" + this.mMaxStress + ", mAvgStress=" + this.mAvgStress + ", mSource=" + this.mSource + ", mIsSync=" + this.mIsSync + ", mIsDelete=" + this.mIsDelete + ", mFeel=" + this.mFeel + ", mPrototype=" + this.mPrototype + ", mFirmwareFlag=" + this.mFirmwareFlag + ", mBleName=" + this.mBleName + ", mPlatform=" + this.mPlatform + ", mMaxSpeed=" + this.mMaxSpeed + ", mMinSpeed=" + this.mMinSpeed + ", mRestDuration=" + this.mRestDuration + ", mAGpsType=" + this.mAGpsType + ", mType=" + this.mType + ", mMetTotal=" + this.mMetTotal + ", mAerobic=" + this.mAerobic + ", mAnaerobic=" + this.mAnaerobic + ", mStamina=" + this.mStamina + ", mAvgSpeed=" + this.mAvgSpeed + ", mCadence=" + this.mCadence + ", mMaxCadence=" + this.mMaxCadence + ", mCnt=" + this.mCnt + ", mBpmZoneCount=" + Arrays.toString(this.mBpmZoneCount) + ", mPersonalZone=" + Arrays.toString(this.mPersonalZone) + ", mLactateThresholdPace=" + this.mLactateThresholdPace + ", mRecoveryTime=" + this.mRecoveryTime + ", mTrainingLoad=" + this.mTrainingLoad + ", mMaxVO2=" + this.mMaxVO2 + ", mLactateThresholdHr=" + this.mLactateThresholdHr + ", mAlgorithmMarking=" + this.mAlgorithmMarking + ", mPathCount=" + this.mPathCount + ", mPathSampleInterval=" + this.mPathSampleInterval + ", mPathPoints=" + this.mPathPoints + ", mHrPathCount=" + this.mHrPathCount + ", mHrPathSampleInterval=" + this.mHrPathSampleInterval + ", mHrPathPoints=" + this.mHrPathPoints + ", mPacePathCount=" + this.mPacePathCount + ", mPacePathSampleInterval=" + this.mPacePathSampleInterval + ", mPacePathPoints=" + this.mPacePathPoints + ", mSpeedPathCount=" + this.mSpeedPathCount + ", mSpeedPathSampleInterval=" + this.mSpeedPathSampleInterval + ", mSpeedPathPoints=" + this.mSpeedPathPoints + ", mCadencePathCount=" + this.mCadencePathCount + ", mCadencePathSampleInterval=" + this.mCadencePathSampleInterval + ", mCadencePathPoints=" + this.mCadencePathPoints + ", mAltitudePathCount=" + this.mAltitudePathCount + ", mAltitudePathSampleInterval=" + this.mAltitudePathSampleInterval + ", mAltitudePathPoints=" + this.mAltitudePathPoints + ", mGoalDistance=" + this.mGoalDistance + ", mGoalTime=" + this.mGoalTime + ", mGoalCalorie=" + this.mGoalCalorie + ", mPausedDuration=" + this.mPausedDuration + ", mCurBpm=" + this.mCurBpm + ", mAscendAltitude=" + this.mAscendAltitude + ", mDescendAltitude=" + this.mDescendAltitude + ", mCurStress=" + this.mCurStress + ", mSwimType=" + this.mSwimType + ", mCntFore=" + this.mCntFore + ", mCntBack=" + this.mCntBack + ", mBackSwingTime=" + this.mBackSwingTime + ", mDownSwingTime=" + this.mDownSwingTime + ", mDribbleTime=" + this.mDribbleTime + ", mTripCount=" + this.mTripCount + ", mSessionCount=" + this.mSessionCount + ", mVerticalOscillation=" + this.mVerticalOscillation + ", mRunPowerWatt=" + this.mRunPowerWatt + ", mStepLen=" + this.mStepLen + ", mTrainingStatus=" + this.mTrainingStatus + ", mFitnessAge=" + this.mFitnessAge + ", mTlTrend=" + this.mTlTrend + ", mBestRunTime=" + Arrays.toString(this.mBestRunTime) + ", mFitnessLevel=" + Arrays.toString(this.mFitnessLevel) + ", mCalorieTotal=" + this.mCalorieTotal + ", mPowerCount=" + this.mPowerCount + ", mPowerInterval=" + this.mPowerInterval + ", mPowerPoints=" + this.mPowerPoints + ", realTimeAerobic=" + this.realTimeAerobic + ", realTimeAnaerobic=" + this.realTimeAnaerobic + ", mFatTotal=" + this.mFatTotal + ", mCarboTotal=" + this.mCarboTotal + ", mNavigatorTargetTime=" + this.mNavigatorTargetTime + ", mNavigatorActualTime=" + this.mNavigatorActualTime + ", mNavigatorDifferenceTime=" + this.mNavigatorDifferenceTime + ", mNavigatorStatusTime=" + this.mNavigatorStatusTime + ", mNavigatorTargetDistance=" + this.mNavigatorTargetDistance + ", mNavigatorActualDistance=" + this.mNavigatorActualDistance + ", mNavigatorDifferenceDistance=" + this.mNavigatorDifferenceDistance + ", mNavigatorStatusDistance=" + this.mNavigatorStatusDistance + ", mNavigatorTargetPace=" + this.mNavigatorTargetPace + ", mNavigatorActualPace=" + this.mNavigatorActualPace + ", mNavigatorDifferencePace=" + this.mNavigatorDifferencePace + ", mNavigatorStatusPace=" + this.mNavigatorStatusPace + ", mNavigatorTargetSpeedV2=" + this.mNavigatorTargetSpeedV2 + ", mNavigatorActualSpeedV2=" + this.mNavigatorActualSpeedV2 + ", mNavigatorTargetSpeed=" + this.mNavigatorTargetSpeed + ", mNavigatorActualSpeed=" + this.mNavigatorActualSpeed + ", mNavigatorDifferenceSpeed=" + this.mNavigatorDifferenceSpeed + ", mNavigatorStatusSpeed=" + this.mNavigatorStatusSpeed + ", mMaxOxygenPower=" + this.mMaxOxygenPower + ", mTrendWeek=" + Arrays.toString(this.mTrendWeek) + ", mCyclingIndex=" + Arrays.toString(this.mCyclingIndex) + ", mStaBalance=" + this.mStaBalance + ", mSwimSwolf=" + this.mSwimSwolf + ", mCntLap=" + this.mCntLap + ", mFrontCrawlPerc=" + this.mFrontCrawlPerc + ", mBreaststrokePerc=" + this.mBreaststrokePerc + ", mBackstrokePerc=" + this.mBackstrokePerc + ", mButterflyPerc=" + this.mButterflyPerc + ", mSpmPathPointsCount=" + this.mSpmPathPointsCount + ", mSpmPathPointsPoints=" + this.mSpmPathPointsPoints + ", mStepLenCount=" + this.mStepLenCount + ", mStepLenPoints=" + this.mStepLenPoints + ", mEllipticalSteps=" + this.mEllipticalSteps + ", mChildSwimStartTime=" + this.mChildSwimStartTime + ", mChildSwimDuration=" + this.mChildSwimDuration + ", mChildSwimDistance=" + this.mChildSwimDistance + ", mChildCyclingStartTime=" + this.mChildCyclingStartTime + ", mChildCyclingDuration=" + this.mChildCyclingDuration + ", mChildCyclingDistance=" + this.mChildCyclingDistance + ", mChildRunStartTime=" + this.mChildRunStartTime + ", mChildRunDuration=" + this.mChildRunDuration + ", mChildRunDistance=" + this.mChildRunDistance + ", mChildSwimMode=" + this.mChildSwimMode + ", mChildCyclingMode=" + this.mChildCyclingMode + ", mChildRunMode=" + this.mChildRunMode + ", mChildNumber=" + this.mChildNumber + ", mRunLactateAvg=" + this.mRunLactateAvg + ", mCyclingLactateAvg=" + this.mCyclingLactateAvg + ", mFlag=" + this.mFlag + ", mRecoveryHrCount=" + this.mRecoveryHrCount + ", mRecoveryHrPoints=" + this.mRecoveryHrPoints + ", mSwimPoolLength=" + this.mSwimPoolLength + ", mDeviceId=" + this.mDeviceId + ", mAICoachSportID=" + this.mAICoachSportID + I000IiI1O.C2156iO.f1007iO;
    }

    public Workout(int i, long j, long j2, @aa1 String mLocalTime, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, @aa1 String mPrototype, @aa1 String mFirmwareFlag, @aa1 String mBleName, @aa1 String mPlatform, int i28, int i29, int i30, int i31, int i32, int i33, float f, float f2, int i34, float f3, int i35, int i36, int i37, @tb1 int[] iArr, @tb1 int[] iArr2, int i38, int i39, int i40, int i41, int i42, int i43, int i44, int i45, @tb1 List<float[]> list, int i46, int i47, @tb1 List<Integer> list2, int i48, int i49, @tb1 List<Integer> list3, int i50, int i51, @tb1 List<Integer> list4, int i52, int i53, @tb1 List<Integer> list5, int i54, int i55, @tb1 List<Integer> list6, int i56, int i57, int i58, int i59, int i60, int i61, int i62, int i63, int i64, int i65, int i66, int i67, int i68, int i69, int i70, int i71, int i72, int i73, float f4, int i74, int i75, float f5, @tb1 int[] iArr3, @tb1 float[] fArr, int i76, int i77, int i78, @tb1 List<Integer> list7, float f6, float f7, float f8, float f9, int i79, int i80, int i81, int i82, int i83, int i84, int i85, int i86, int i87, int i88, int i89, int i90, float f10, float f11, int i91, int i92, int i93, int i94, float f12, @tb1 float[] fArr2, @tb1 float[] fArr3, int i95, int i96, int i97, int i98, int i99, int i100, int i101, int i102, @tb1 List<Integer> list8, int i103, @tb1 List<Float> list9, int i104, long j3, int i105, int i106, long j4, int i107, int i108, long j5, int i109, int i110, int i111, int i112, int i113, int i114, float f13, float f14, int i115, int i116, @tb1 List<Integer> list10, int i117, @tb1 String str, int i118) {
        Intrinsics.X0O(mLocalTime, "mLocalTime");
        Intrinsics.X0O(mPrototype, "mPrototype");
        Intrinsics.X0O(mFirmwareFlag, "mFirmwareFlag");
        Intrinsics.X0O(mBleName, "mBleName");
        Intrinsics.X0O(mPlatform, "mPlatform");
        this.mId = i;
        this.mStart = j;
        this.mEnd = j2;
        this.mLocalTime = mLocalTime;
        this.mDuration = i2;
        this.mAltitude = i3;
        this.mAirPressure = i4;
        this.mSpm = i5;
        this.mMode = i6;
        this.mStep = i7;
        this.mDistance = i8;
        this.mCalorie = i9;
        this.mSpeed = i10;
        this.mPace = i11;
        this.mAvgBpm = i12;
        this.mMaxBpm = i13;
        this.mMinBpm = i14;
        this.mMaxSpm = i15;
        this.mMinSpm = i16;
        this.mMaxPace = i17;
        this.mMinPace = i18;
        this.mMaxAltitude = i19;
        this.mMinAltitude = i20;
        this.mMinStress = i21;
        this.mMaxStress = i22;
        this.mAvgStress = i23;
        this.mSource = i24;
        this.mIsSync = i25;
        this.mIsDelete = i26;
        this.mFeel = i27;
        this.mPrototype = mPrototype;
        this.mFirmwareFlag = mFirmwareFlag;
        this.mBleName = mBleName;
        this.mPlatform = mPlatform;
        this.mMaxSpeed = i28;
        this.mMinSpeed = i29;
        this.mRestDuration = i30;
        this.mAGpsType = i31;
        this.mType = i32;
        this.mMetTotal = i33;
        this.mAerobic = f;
        this.mAnaerobic = f2;
        this.mStamina = i34;
        this.mAvgSpeed = f3;
        this.mCadence = i35;
        this.mMaxCadence = i36;
        this.mCnt = i37;
        this.mBpmZoneCount = iArr;
        this.mPersonalZone = iArr2;
        this.mLactateThresholdPace = i38;
        this.mRecoveryTime = i39;
        this.mTrainingLoad = i40;
        this.mMaxVO2 = i41;
        this.mLactateThresholdHr = i42;
        this.mAlgorithmMarking = i43;
        this.mPathCount = i44;
        this.mPathSampleInterval = i45;
        this.mPathPoints = list;
        this.mHrPathCount = i46;
        this.mHrPathSampleInterval = i47;
        this.mHrPathPoints = list2;
        this.mPacePathCount = i48;
        this.mPacePathSampleInterval = i49;
        this.mPacePathPoints = list3;
        this.mSpeedPathCount = i50;
        this.mSpeedPathSampleInterval = i51;
        this.mSpeedPathPoints = list4;
        this.mCadencePathCount = i52;
        this.mCadencePathSampleInterval = i53;
        this.mCadencePathPoints = list5;
        this.mAltitudePathCount = i54;
        this.mAltitudePathSampleInterval = i55;
        this.mAltitudePathPoints = list6;
        this.mGoalDistance = i56;
        this.mGoalTime = i57;
        this.mGoalCalorie = i58;
        this.mPausedDuration = i59;
        this.mCurBpm = i60;
        this.mAscendAltitude = i61;
        this.mDescendAltitude = i62;
        this.mCurStress = i63;
        this.mSwimType = i64;
        this.mCntFore = i65;
        this.mCntBack = i66;
        this.mBackSwingTime = i67;
        this.mDownSwingTime = i68;
        this.mDribbleTime = i69;
        this.mTripCount = i70;
        this.mSessionCount = i71;
        this.mVerticalOscillation = i72;
        this.mRunPowerWatt = i73;
        this.mStepLen = f4;
        this.mTrainingStatus = i74;
        this.mFitnessAge = i75;
        this.mTlTrend = f5;
        this.mBestRunTime = iArr3;
        this.mFitnessLevel = fArr;
        this.mCalorieTotal = i76;
        this.mPowerCount = i77;
        this.mPowerInterval = i78;
        this.mPowerPoints = list7;
        this.realTimeAerobic = f6;
        this.realTimeAnaerobic = f7;
        this.mFatTotal = f8;
        this.mCarboTotal = f9;
        this.mNavigatorTargetTime = i79;
        this.mNavigatorActualTime = i80;
        this.mNavigatorDifferenceTime = i81;
        this.mNavigatorStatusTime = i82;
        this.mNavigatorTargetDistance = i83;
        this.mNavigatorActualDistance = i84;
        this.mNavigatorDifferenceDistance = i85;
        this.mNavigatorStatusDistance = i86;
        this.mNavigatorTargetPace = i87;
        this.mNavigatorActualPace = i88;
        this.mNavigatorDifferencePace = i89;
        this.mNavigatorStatusPace = i90;
        this.mNavigatorTargetSpeedV2 = f10;
        this.mNavigatorActualSpeedV2 = f11;
        this.mNavigatorTargetSpeed = i91;
        this.mNavigatorActualSpeed = i92;
        this.mNavigatorDifferenceSpeed = i93;
        this.mNavigatorStatusSpeed = i94;
        this.mMaxOxygenPower = f12;
        this.mTrendWeek = fArr2;
        this.mCyclingIndex = fArr3;
        this.mStaBalance = i95;
        this.mSwimSwolf = i96;
        this.mCntLap = i97;
        this.mFrontCrawlPerc = i98;
        this.mBreaststrokePerc = i99;
        this.mBackstrokePerc = i100;
        this.mButterflyPerc = i101;
        this.mSpmPathPointsCount = i102;
        this.mSpmPathPointsPoints = list8;
        this.mStepLenCount = i103;
        this.mStepLenPoints = list9;
        this.mEllipticalSteps = i104;
        this.mChildSwimStartTime = j3;
        this.mChildSwimDuration = i105;
        this.mChildSwimDistance = i106;
        this.mChildCyclingStartTime = j4;
        this.mChildCyclingDuration = i107;
        this.mChildCyclingDistance = i108;
        this.mChildRunStartTime = j5;
        this.mChildRunDuration = i109;
        this.mChildRunDistance = i110;
        this.mChildSwimMode = i111;
        this.mChildCyclingMode = i112;
        this.mChildRunMode = i113;
        this.mChildNumber = i114;
        this.mRunLactateAvg = f13;
        this.mCyclingLactateAvg = f14;
        this.mFlag = i115;
        this.mRecoveryHrCount = i116;
        this.mRecoveryHrPoints = list10;
        this.mSwimPoolLength = i117;
        this.mDeviceId = str;
        this.mAICoachSportID = i118;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Workout(int i, long j, long j2, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, String str2, String str3, String str4, String str5, int i28, int i29, int i30, int i31, int i32, int i33, float f, float f2, int i34, float f3, int i35, int i36, int i37, int[] iArr, int[] iArr2, int i38, int i39, int i40, int i41, int i42, int i43, int i44, int i45, List list, int i46, int i47, List list2, int i48, int i49, List list3, int i50, int i51, List list4, int i52, int i53, List list5, int i54, int i55, List list6, int i56, int i57, int i58, int i59, int i60, int i61, int i62, int i63, int i64, int i65, int i66, int i67, int i68, int i69, int i70, int i71, int i72, int i73, float f4, int i74, int i75, float f5, int[] iArr3, float[] fArr, int i76, int i77, int i78, List list7, float f6, float f7, float f8, float f9, int i79, int i80, int i81, int i82, int i83, int i84, int i85, int i86, int i87, int i88, int i89, int i90, float f10, float f11, int i91, int i92, int i93, int i94, float f12, float[] fArr2, float[] fArr3, int i95, int i96, int i97, int i98, int i99, int i100, int i101, int i102, List list8, int i103, List list9, int i104, long j3, int i105, int i106, long j4, int i107, int i108, long j5, int i109, int i110, int i111, int i112, int i113, int i114, float f13, float f14, int i115, int i116, List list10, int i117, String str6, int i118, int i119, int i120, int i121, int i122, int i123, DefaultConstructorMarker defaultConstructorMarker) {
        int i124 = (i119 & 1) != 0 ? 0 : i;
        long j6 = (i119 & 2) != 0 ? 0L : j;
        long j7 = (i119 & 4) != 0 ? 0L : j2;
        String str7 = (i119 & 8) != 0 ? "" : str;
        int i125 = (i119 & 16) != 0 ? 0 : i2;
        int i126 = (i119 & 32) != 0 ? 0 : i3;
        int i127 = (i119 & 64) != 0 ? 0 : i4;
        int i128 = (i119 & 128) != 0 ? 0 : i5;
        int i129 = (i119 & 256) != 0 ? 0 : i6;
        int i130 = (i119 & 512) != 0 ? 0 : i7;
        int i131 = i124;
        int i132 = (i119 & 1024) != 0 ? 0 : i8;
        int i133 = (i119 & 2048) != 0 ? 0 : i9;
        int i134 = (i119 & 4096) != 0 ? 0 : i10;
        int i135 = (i119 & 8192) != 0 ? 0 : i11;
        int i136 = (i119 & 16384) != 0 ? 0 : i12;
        int i137 = (i119 & 32768) != 0 ? 0 : i13;
        int i138 = (i119 & 65536) != 0 ? 0 : i14;
        int i139 = (i119 & 131072) != 0 ? 0 : i15;
        int i140 = (i119 & 262144) != 0 ? 0 : i16;
        int i141 = (i119 & 524288) != 0 ? 0 : i17;
        int i142 = (i119 & 1048576) != 0 ? 0 : i18;
        int i143 = (i119 & 2097152) != 0 ? 0 : i19;
        int i144 = (i119 & 4194304) != 0 ? 0 : i20;
        int i145 = (i119 & 8388608) != 0 ? 0 : i21;
        int i146 = (i119 & 16777216) != 0 ? 0 : i22;
        int i147 = (i119 & 33554432) != 0 ? 0 : i23;
        int i148 = (i119 & 67108864) != 0 ? 0 : i24;
        int i149 = (i119 & 134217728) != 0 ? 0 : i25;
        int i150 = (i119 & 268435456) != 0 ? 0 : i26;
        int i151 = (i119 & 536870912) != 0 ? 0 : i27;
        String str8 = (i119 & 1073741824) != 0 ? "" : str2;
        String str9 = (i119 & Integer.MIN_VALUE) != 0 ? "" : str3;
        String str10 = (i120 & 1) != 0 ? "" : str4;
        String str11 = (i120 & 2) != 0 ? "" : str5;
        int i152 = (i120 & 4) != 0 ? 0 : i28;
        int i153 = (i120 & 8) != 0 ? 0 : i29;
        int i154 = (i120 & 16) != 0 ? 0 : i30;
        int i155 = (i120 & 32) != 0 ? 99 : i31;
        int i156 = (i120 & 64) != 0 ? 0 : i32;
        String str12 = str9;
        int i157 = (i120 & 128) != 0 ? 0 : i33;
        float f15 = (i120 & 256) != 0 ? 0.0f : f;
        float f16 = (i120 & 512) != 0 ? 0.0f : f2;
        int i158 = (i120 & 1024) != 0 ? 0 : i34;
        float f17 = (i120 & 2048) != 0 ? 0.0f : f3;
        int i159 = (i120 & 4096) != 0 ? 0 : i35;
        int i160 = (i120 & 8192) != 0 ? 0 : i36;
        int i161 = (i120 & 16384) != 0 ? 0 : i37;
        int[] iArr4 = (i120 & 32768) != 0 ? null : iArr;
        int[] iArr5 = (i120 & 65536) != 0 ? null : iArr2;
        int i162 = (i120 & 131072) != 0 ? 0 : i38;
        int i163 = (i120 & 262144) != 0 ? 0 : i39;
        int i164 = (i120 & 524288) != 0 ? 0 : i40;
        int i165 = (i120 & 1048576) != 0 ? 0 : i41;
        int i166 = (i120 & 2097152) != 0 ? 0 : i42;
        int i167 = (i120 & 4194304) != 0 ? 0 : i43;
        int i168 = (i120 & 8388608) != 0 ? 0 : i44;
        int i169 = (i120 & 16777216) != 0 ? 0 : i45;
        List list11 = (i120 & 33554432) != 0 ? null : list;
        int i170 = (i120 & 67108864) != 0 ? 0 : i46;
        int i171 = (i120 & 134217728) != 0 ? 0 : i47;
        List list12 = (i120 & 268435456) != 0 ? null : list2;
        int i172 = (i120 & 536870912) != 0 ? 0 : i48;
        int i173 = (i120 & 1073741824) != 0 ? 0 : i49;
        List list13 = (i120 & Integer.MIN_VALUE) != 0 ? null : list3;
        int i174 = (i121 & 1) != 0 ? 0 : i50;
        int i175 = (i121 & 2) != 0 ? 0 : i51;
        List list14 = (i121 & 4) != 0 ? null : list4;
        int i176 = (i121 & 8) != 0 ? 0 : i52;
        int i177 = (i121 & 16) != 0 ? 0 : i53;
        List list15 = (i121 & 32) != 0 ? null : list5;
        int i178 = (i121 & 64) != 0 ? 0 : i54;
        int i179 = i161;
        int i180 = (i121 & 128) != 0 ? 0 : i55;
        List list16 = (i121 & 256) != 0 ? null : list6;
        int i181 = (i121 & 512) != 0 ? 0 : i56;
        int i182 = (i121 & 1024) != 0 ? 0 : i57;
        int i183 = (i121 & 2048) != 0 ? 0 : i58;
        int i184 = (i121 & 4096) != 0 ? 0 : i59;
        int i185 = (i121 & 8192) != 0 ? 0 : i60;
        int i186 = (i121 & 16384) != 0 ? 0 : i61;
        this(i131, j6, j7, str7, i125, i126, i127, i128, i129, i130, i132, i133, i134, i135, i136, i137, i138, i139, i140, i141, i142, i143, i144, i145, i146, i147, i148, i149, i150, i151, str8, str12, str10, str11, i152, i153, i154, i155, i156, i157, f15, f16, i158, f17, i159, i160, i179, iArr4, iArr5, i162, i163, i164, i165, i166, i167, i168, i169, list11, i170, i171, list12, i172, i173, list13, i174, i175, list14, i176, i177, list15, i178, i180, list16, i181, i182, i183, i184, i185, i186, (i121 & 32768) != 0 ? 0 : i62, (i121 & 65536) != 0 ? 0 : i63, (i121 & 131072) != 0 ? 0 : i64, (i121 & 262144) != 0 ? 0 : i65, (i121 & 524288) != 0 ? 0 : i66, (i121 & 1048576) != 0 ? 0 : i67, (i121 & 2097152) != 0 ? 0 : i68, (i121 & 4194304) != 0 ? 0 : i69, (i121 & 8388608) != 0 ? 0 : i70, (i121 & 16777216) != 0 ? 0 : i71, (i121 & 33554432) != 0 ? 0 : i72, (i121 & 67108864) != 0 ? 0 : i73, (i121 & 134217728) != 0 ? 0.0f : f4, (i121 & 268435456) != 0 ? 0 : i74, (i121 & 536870912) != 0 ? 0 : i75, (i121 & 1073741824) != 0 ? 0.0f : f5, (i121 & Integer.MIN_VALUE) != 0 ? null : iArr3, (i122 & 1) != 0 ? null : fArr, (i122 & 2) != 0 ? 0 : i76, (i122 & 4) != 0 ? 0 : i77, (i122 & 8) != 0 ? 0 : i78, (i122 & 16) != 0 ? null : list7, (i122 & 32) != 0 ? 0.0f : f6, (i122 & 64) != 0 ? 0.0f : f7, (i122 & 128) != 0 ? 0.0f : f8, (i122 & 256) != 0 ? 0.0f : f9, (i122 & 512) != 0 ? 0 : i79, (i122 & 1024) != 0 ? 0 : i80, (i122 & 2048) != 0 ? 0 : i81, (i122 & 4096) != 0 ? -1 : i82, (i122 & 8192) != 0 ? 0 : i83, (i122 & 16384) != 0 ? 0 : i84, (i122 & 32768) != 0 ? 0 : i85, (i122 & 65536) != 0 ? -1 : i86, (i122 & 131072) != 0 ? 0 : i87, (i122 & 262144) != 0 ? 0 : i88, (i122 & 524288) != 0 ? 0 : i89, (i122 & 1048576) != 0 ? -1 : i90, (i122 & 2097152) != 0 ? 0.0f : f10, (i122 & 4194304) != 0 ? 0.0f : f11, (i122 & 8388608) != 0 ? 0 : i91, (i122 & 16777216) != 0 ? 0 : i92, (i122 & 33554432) != 0 ? 0 : i93, (i122 & 67108864) != 0 ? -1 : i94, (i122 & 134217728) != 0 ? 0.0f : f12, (i122 & 268435456) != 0 ? null : fArr2, (i122 & 536870912) != 0 ? null : fArr3, (i122 & 1073741824) != 0 ? 0 : i95, (i122 & Integer.MIN_VALUE) != 0 ? 0 : i96, (i123 & 1) != 0 ? 0 : i97, (i123 & 2) != 0 ? 0 : i98, (i123 & 4) != 0 ? 0 : i99, (i123 & 8) != 0 ? 0 : i100, (i123 & 16) != 0 ? 0 : i101, (i123 & 32) != 0 ? 0 : i102, (i123 & 64) != 0 ? null : list8, (i123 & 128) != 0 ? 0 : i103, (i123 & 256) != 0 ? null : list9, (i123 & 512) != 0 ? 0 : i104, (i123 & 1024) != 0 ? 0L : j3, (i123 & 2048) != 0 ? 0 : i105, (i123 & 4096) != 0 ? 0 : i106, (i123 & 8192) != 0 ? 0L : j4, (i123 & 16384) != 0 ? 0 : i107, (i123 & 32768) != 0 ? 0 : i108, (i123 & 65536) != 0 ? 0L : j5, (i123 & 131072) != 0 ? 0 : i109, (i123 & 262144) != 0 ? 0 : i110, (i123 & 524288) != 0 ? 0 : i111, (i123 & 1048576) != 0 ? 0 : i112, (i123 & 2097152) != 0 ? 0 : i113, (i123 & 4194304) != 0 ? 0 : i114, (i123 & 8388608) != 0 ? 0.0f : f13, (i123 & 16777216) == 0 ? f14 : 0.0f, (i123 & 33554432) != 0 ? 0 : i115, (i123 & 67108864) != 0 ? 0 : i116, (i123 & 134217728) == 0 ? list10 : null, (i123 & 268435456) != 0 ? 0 : i117, (i123 & 536870912) == 0 ? str6 : "", (i123 & 1073741824) != 0 ? -1 : i118);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Workout(@aa1 BleWorkout bleWorkout, long j) {
        this(0, (((long) (bleWorkout.getMStart() + BleConstsKt.DATA_EPOCH)) * 1000) - j, (((long) (bleWorkout.getMEnd() + BleConstsKt.DATA_EPOCH)) * 1000) - j, null, bleWorkout.getMDuration(), bleWorkout.getMAltitude(), bleWorkout.getMAirPressure(), bleWorkout.getMSpm(), bleWorkout.getMMode(), bleWorkout.getMStep(), bleWorkout.getMDistance(), bleWorkout.getMCalorie(), bleWorkout.getMSpeed(), bleWorkout.getMPace(), bleWorkout.getMAvgBpm(), bleWorkout.getMMaxBpm(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, null, null, 0, 0, 0, 0, 0, 0, 0.0f, 0.0f, 0, 0.0f, 0, 0, 0, null, null, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, null, 0, 0, null, 0, 0, null, 0, 0, null, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, 0, 0.0f, null, null, 0, 0, 0, null, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, null, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, 0, 0L, 0, 0, 0L, 0, 0, 0L, 0, 0, 0, 0, 0, 0, 0.0f, 0.0f, 0, 0, null, 0, null, 0, -65527, -1, -1, -1, Integer.MAX_VALUE, null);
        Intrinsics.X0O(bleWorkout, "bleWorkout");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Workout(@aa1 BleWorkout2 bleWorkout, long j) {
        this(0, (((long) (bleWorkout.getMStart() + BleConstsKt.DATA_EPOCH)) * 1000) - j, (((long) (bleWorkout.getMEnd() + BleConstsKt.DATA_EPOCH)) * 1000) - j, null, bleWorkout.getMDuration(), bleWorkout.getMAltitude(), bleWorkout.getMAirPressure(), bleWorkout.getMSpm(), bleWorkout.getMMode(), bleWorkout.getMStep(), bleWorkout.getMDistance(), bleWorkout.getMCalorie(), bleWorkout.getMSpeed(), bleWorkout.getMPace(), bleWorkout.getMAvgBpm(), bleWorkout.getMMaxBpm(), bleWorkout.getMMinBpm(), bleWorkout.getMMaxSpm(), bleWorkout.getMMinSpm(), bleWorkout.getMMaxPace(), bleWorkout.getMMinPace(), bleWorkout.getMMaxAltitude(), bleWorkout.getMMinAltitude(), bleWorkout.getMMinStress(), bleWorkout.getMMaxStress(), bleWorkout.getMAvgStress(), 0, 0, 0, 0, null, null, null, null, bleWorkout.getMMaxSpeed(), bleWorkout.getMMinSpeed(), bleWorkout.getMRestDuration(), 0, 0, 0, 0.0f, 0.0f, 0, 0.0f, 0, 0, 0, null, null, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, null, 0, 0, null, 0, 0, null, 0, 0, null, 0, bleWorkout.getMAltitudeclimb(), null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, 0, 0.0f, null, null, 0, 0, 0, null, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, null, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, 0, 0L, 0, 0, 0L, 0, 0, 0L, 0, 0, 0, 0, 0, 0, 0.0f, 0.0f, 0, 0, null, 0, null, 0, -67108855, -29, ErrorCode.ERR_ENC_FAILURE, -1, Integer.MAX_VALUE, null);
        Intrinsics.X0O(bleWorkout, "bleWorkout");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Workout(@aa1 BleWorkout3 bleWorkout, long j) {
        this(0, (((long) (bleWorkout.getMStart() + BleConstsKt.DATA_EPOCH)) * 1000) - j, (((long) (bleWorkout.getMEnd() + BleConstsKt.DATA_EPOCH)) * 1000) - j, null, bleWorkout.getMDuration(), bleWorkout.getMAltitude(), bleWorkout.getMAirPressure(), bleWorkout.getMSpm(), bleWorkout.getMMode(), bleWorkout.getMStep(), bleWorkout.getMDistance(), bleWorkout.getMCalorie(), bleWorkout.getMSpeed(), bleWorkout.getMPace(), bleWorkout.getMAvgBpm(), bleWorkout.getMMaxBpm(), bleWorkout.getMMinBpm(), bleWorkout.getMMaxSpm(), bleWorkout.getMMinSpm(), bleWorkout.getMMaxPace(), bleWorkout.getMMinPace(), bleWorkout.getMMaxAltitude(), bleWorkout.getMMinAltitude(), bleWorkout.getMMinStress(), bleWorkout.getMMaxStress(), bleWorkout.getMAvgStress(), 0, 0, 0, 0, null, null, null, null, bleWorkout.getMMaxSpeed(), bleWorkout.getMMinSpeed(), 0, 0, 1, bleWorkout.getMMetTotal(), bleWorkout.getMAerobic(), bleWorkout.getMAnaerobic(), bleWorkout.getMStamina(), bleWorkout.getMAvgSpeed(), bleWorkout.getMCadence(), bleWorkout.getMMaxCadence(), bleWorkout.getMCnt(), bleWorkout.getMBpmZoneCount(), bleWorkout.getMPersonalZone(), bleWorkout.getMLactateThresholdPace(), bleWorkout.getMRecoveryTime(), bleWorkout.getMTrainingLoad(), bleWorkout.getMMaxVO2(), bleWorkout.getMLactateThresholdHr(), bleWorkout.getMAlgorithmMarking(), bleWorkout.getMPathCount(), bleWorkout.getMPathSampleInterval(), bleWorkout.getMPathPoints(), bleWorkout.getMHrPathCount(), bleWorkout.getMHrPathSampleInterval(), bleWorkout.getMHrPathPoints(), bleWorkout.getMPacePathCount(), bleWorkout.getMPacePathSampleInterval(), bleWorkout.getMPacePathPoints(), bleWorkout.getMSpeedPathCount(), bleWorkout.getMSpeedPathSampleInterval(), bleWorkout.getMSpeedPathPoints(), bleWorkout.getMCadencePathCount(), bleWorkout.getMCadencePathSampleInterval(), bleWorkout.getMCadencePathPoints(), bleWorkout.getMAltitudePathCount(), bleWorkout.getMAltitudePathSampleInterval(), bleWorkout.getMAltitudePathPoints(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, 0, 0.0f, null, null, 0, 0, 0, null, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, null, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, 0, 0L, 0, 0, 0L, 0, 0, 0L, 0, 0, 0, 0, 0, 0, 0.0f, 0.0f, 0, 0, null, 0, null, 0, -67108855, 51, WorkInfo.STOP_REASON_UNKNOWN, -1, Integer.MAX_VALUE, null);
        Intrinsics.X0O(bleWorkout, "bleWorkout");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Workout(@aa1 BleWorkout4 bleWorkout, long j) {
        Intrinsics.X0O(bleWorkout, "bleWorkout");
        long mStart = (((long) (bleWorkout.getMStart() + BleConstsKt.DATA_EPOCH)) * 1000) - j;
        long mEnd = (((long) (bleWorkout.getMEnd() + BleConstsKt.DATA_EPOCH)) * 1000) - j;
        int mDuration = bleWorkout.getMDuration();
        int mAltitude = bleWorkout.getMAltitude();
        int mAirPressure = bleWorkout.getMAirPressure();
        int mSpm = bleWorkout.getMSpm();
        int mMode = bleWorkout.getMMode();
        int mStep = bleWorkout.getMStep();
        int mDistance = bleWorkout.getMDistance();
        int mCalorie = bleWorkout.getMCalorie();
        float f = 1000;
        int mSpeed = (int) (bleWorkout.getMSpeed() * f);
        int mPace = bleWorkout.getMPace();
        int mAvgBpm = bleWorkout.getMAvgBpm();
        int mMaxBpm = bleWorkout.getMMaxBpm();
        int mMinBpm = bleWorkout.getMMinBpm();
        int mMaxSpm = bleWorkout.getMMaxSpm();
        int mMinSpm = bleWorkout.getMMinSpm();
        int mMaxPace = bleWorkout.getMMaxPace();
        int mMinPace = bleWorkout.getMMinPace();
        int mMaxAltitude = bleWorkout.getMMaxAltitude();
        int mMinAltitude = bleWorkout.getMMinAltitude();
        int mMinStress = bleWorkout.getMMinStress();
        int mMaxStress = bleWorkout.getMMaxStress();
        int mAvgStress = bleWorkout.getMAvgStress();
        int mMaxSpeed = (int) bleWorkout.getMMaxSpeed();
        int mMinSpeed = (int) (bleWorkout.getMMinSpeed() * f);
        float mAvgSpeed = bleWorkout.getMAvgSpeed() * f;
        int mMetTotal = (int) bleWorkout.getMMetTotal();
        float mAerobic = bleWorkout.getMAerobic();
        float mAnaerobic = bleWorkout.getMAnaerobic();
        int mStamina = (int) bleWorkout.getMStamina();
        int mCadence = (int) (bleWorkout.getMCadence() * f);
        int mMaxCadence = bleWorkout.getMMaxCadence();
        int mCnt = bleWorkout.getMCnt();
        int[] mBpmZoneCount = bleWorkout.getMBpmZoneCount();
        int[] mPersonalZone = bleWorkout.getMPersonalZone();
        int mLactateThresholdPace = bleWorkout.getMLactateThresholdPace();
        int mRecoveryTime = bleWorkout.getMRecoveryTime();
        int mTrainingLoad = bleWorkout.getMTrainingLoad();
        int mMaxVO2 = bleWorkout.getMMaxVO2();
        int mLactateThresholdHr = bleWorkout.getMLactateThresholdHr();
        int mPathCount = bleWorkout.getMPathCount();
        int mPathSampleInterval = bleWorkout.getMPathSampleInterval();
        List<float[]> mPathPoints = bleWorkout.getMPathPoints();
        int mHrPathCount = bleWorkout.getMHrPathCount();
        int mHrPathSampleInterval = bleWorkout.getMHrPathSampleInterval();
        List<Integer> mHrPathPoints = bleWorkout.getMHrPathPoints();
        int mPacePathCount = bleWorkout.getMPacePathCount();
        int mPacePathSampleInterval = bleWorkout.getMPacePathSampleInterval();
        List<Integer> mPacePathPoints = bleWorkout.getMPacePathPoints();
        int mSpeedPathCount = bleWorkout.getMSpeedPathCount();
        int mSpeedPathSampleInterval = bleWorkout.getMSpeedPathSampleInterval();
        List<Integer> mSpeedPathPoints = bleWorkout.getMSpeedPathPoints();
        int mCadencePathCount = bleWorkout.getMCadencePathCount();
        int mCadencePathSampleInterval = bleWorkout.getMCadencePathSampleInterval();
        List<Integer> mCadencePathPoints = bleWorkout.getMCadencePathPoints();
        int mAltitudePathCount = bleWorkout.getMAltitudePathCount();
        int mAltitudePathSampleInterval = bleWorkout.getMAltitudePathSampleInterval();
        List<Integer> mAltitudePathPoints = bleWorkout.getMAltitudePathPoints();
        int mPausedDuration = bleWorkout.getMPausedDuration();
        int mCurBpm = bleWorkout.getMCurBpm();
        int mAscendAltitude = bleWorkout.getMAscendAltitude();
        int mDescendAltitude = bleWorkout.getMDescendAltitude();
        int mCurStress = bleWorkout.getMCurStress();
        int mSwimType = bleWorkout.getMSwimType();
        int mCntFore = bleWorkout.getMCntFore();
        int mCntBack = bleWorkout.getMCntBack();
        int mBackSwingTime = bleWorkout.getMBackSwingTime();
        int mDownSwingTime = bleWorkout.getMDownSwingTime();
        int mDribbleTime = bleWorkout.getMDribbleTime();
        int mTripCount = bleWorkout.getMTripCount();
        int mSessionCount = bleWorkout.getMSessionCount();
        int mVerticalOscillation = (int) (100 * bleWorkout.getMVerticalOscillation());
        int mRunPowerWatt = bleWorkout.getMRunPowerWatt();
        float mStepLen = bleWorkout.getMStepLen();
        int mTrainingStatus = bleWorkout.getMTrainingStatus();
        int mFitnessAge = bleWorkout.getMFitnessAge();
        int[] mBestRunTime = bleWorkout.getMBestRunTime();
        float[] mFitnessLevel = bleWorkout.getMFitnessLevel();
        int i = 0;
        String str = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i6 = 0;
        int i7 = 0;
        int i8 = 4;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        this(i, mStart, mEnd, str, mDuration, mAltitude, mAirPressure, mSpm, mMode, mStep, mDistance, mCalorie, mSpeed, mPace, mAvgBpm, mMaxBpm, mMinBpm, mMaxSpm, mMinSpm, mMaxPace, mMinPace, mMaxAltitude, mMinAltitude, mMinStress, mMaxStress, mAvgStress, i2, i3, i4, i5, str2, str3, str4, str5, mMaxSpeed, mMinSpeed, i6, i7, i8, mMetTotal, mAerobic, mAnaerobic, mStamina, mAvgSpeed, mCadence, mMaxCadence, mCnt, mBpmZoneCount, mPersonalZone, mLactateThresholdPace, mRecoveryTime, mTrainingLoad, mMaxVO2, mLactateThresholdHr, i9, mPathCount, mPathSampleInterval, mPathPoints, mHrPathCount, mHrPathSampleInterval, mHrPathPoints, mPacePathCount, mPacePathSampleInterval, mPacePathPoints, mSpeedPathCount, mSpeedPathSampleInterval, mSpeedPathPoints, mCadencePathCount, mCadencePathSampleInterval, mCadencePathPoints, mAltitudePathCount, mAltitudePathSampleInterval, mAltitudePathPoints, i10, i11, i12, mPausedDuration, mCurBpm, mAscendAltitude, mDescendAltitude, mCurStress, mSwimType, mCntFore, mCntBack, mBackSwingTime, mDownSwingTime, mDribbleTime, mTripCount, mSessionCount, mVerticalOscillation, mRunPowerWatt, mStepLen, mTrainingStatus, mFitnessAge, bleWorkout.getMTlTrend(), mBestRunTime, mFitnessLevel, (int) (bleWorkout.getMCalorieTotal() * f), bleWorkout.getMPowerCount(), bleWorkout.getMPowerInterval(), bleWorkout.getMPowerPoints(), bleWorkout.getRealTimeAerobic(), bleWorkout.getRealTimeAnaerobic(), bleWorkout.getMFatTotal(), bleWorkout.getMCarboTotal(), bleWorkout.getMNavigatorTargetTime(), bleWorkout.getMNavigatorActualTime(), bleWorkout.getMNavigatorDifferenceTime(), bleWorkout.getMNavigatorStatusTime(), bleWorkout.getMNavigatorTargetDistance(), bleWorkout.getMNavigatorActualDistance(), bleWorkout.getMNavigatorDifferenceDistance(), bleWorkout.getMNavigatorStatusDistance(), bleWorkout.getMNavigatorTargetPace(), bleWorkout.getMNavigatorActualPace(), bleWorkout.getMNavigatorDifferencePace(), bleWorkout.getMNavigatorStatusPace(), bleWorkout.getMNavigatorTargetSpeed(), bleWorkout.getMNavigatorActualSpeed(), i13, i14, bleWorkout.getMNavigatorDifferenceSpeed(), bleWorkout.getMNavigatorStatusSpeed(), bleWorkout.getMMaxOxygenPower(), bleWorkout.getMTrendWeek(), bleWorkout.getMCyclingIndex(), bleWorkout.getMStaBalance(), bleWorkout.getMSwimSwolf(), bleWorkout.getMCntLap(), bleWorkout.getMFrontCrawlPerc(), bleWorkout.getMBreaststrokePerc(), bleWorkout.getMBackstrokePerc(), bleWorkout.getMButterflyPerc(), bleWorkout.getMSpmPathPointsCount(), bleWorkout.getMSpmPathPointsPoints(), bleWorkout.getMStepLenCount(), bleWorkout.getMStepLenPoints(), bleWorkout.getMEllipticalSteps(), (((long) (bleWorkout.getMChildSwimStartTime() + BleConstsKt.DATA_EPOCH)) * 1000) - j, bleWorkout.getMChildSwimDuration(), bleWorkout.getMChildSwimDistance(), (((long) (bleWorkout.getMChildCyclingStartTime() + BleConstsKt.DATA_EPOCH)) * 1000) - j, bleWorkout.getMChildCyclingDuration(), bleWorkout.getMChildCyclingDistance(), (((long) (bleWorkout.getMChildRunStartTime() + BleConstsKt.DATA_EPOCH)) * 1000) - j, bleWorkout.getMChildRunDuration(), bleWorkout.getMChildRunDistance(), bleWorkout.getMChildSwimMode(), bleWorkout.getMChildCyclingMode(), bleWorkout.getMChildRunMode(), bleWorkout.getMChildNumber(), bleWorkout.getMRunLactateAvg(), bleWorkout.getMCyclingLactateAvg(), bleWorkout.getMWorkoutFlag(), bleWorkout.getMRecoveryHrCount(), bleWorkout.getMRecoveryHrPoints(), bleWorkout.getMSwimPoolLength(), null, bleWorkout.getMAICoachSportID(), -67108855, 4194355, RendererCapabilities.AUDIO_OFFLOAD_SUPPORT_MASK, 25165824, 536870912, null);
    }
}
