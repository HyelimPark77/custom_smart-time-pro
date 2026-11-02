.class public final Lcom/sma/smartv3/db/entity/Workout;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation build Landroidx/room/Entity;
.end annotation

.annotation build Landroidx/room/TypeConverters;
    value = {
        Lcom/sma/smartv3/db/entity/WorkoutConverter;
    }
.end annotation


# instance fields
.field private mAGpsType:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mAICoachSportID:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mAerobic:F
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mAirPressure:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mAlgorithmMarking:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mAltitude:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mAltitudePathCount:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mAltitudePathPoints:Ljava/util/List;
    .annotation build Landroidx/room/ColumnInfo;
        defaultValue = ""
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private mAltitudePathSampleInterval:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mAnaerobic:F
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mAscendAltitude:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mAvgBpm:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mAvgSpeed:F
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mAvgStress:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mBackSwingTime:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mBackstrokePerc:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mBestRunTime:[I
    .annotation build Landroidx/room/ColumnInfo;
        defaultValue = ""
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mBleName:Ljava/lang/String;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mBpmZoneCount:[I
    .annotation build Landroidx/room/ColumnInfo;
        defaultValue = ""
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mBreaststrokePerc:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mButterflyPerc:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mCadence:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mCadencePathCount:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mCadencePathPoints:Ljava/util/List;
    .annotation build Landroidx/room/ColumnInfo;
        defaultValue = ""
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private mCadencePathSampleInterval:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mCalorie:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mCalorieTotal:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mCarboTotal:F
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mChildCyclingDistance:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mChildCyclingDuration:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mChildCyclingMode:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mChildCyclingStartTime:J
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mChildNumber:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mChildRunDistance:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mChildRunDuration:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mChildRunMode:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mChildRunStartTime:J
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mChildSwimDistance:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mChildSwimDuration:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mChildSwimMode:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mChildSwimStartTime:J
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mCnt:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mCntBack:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mCntFore:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mCntLap:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mCurBpm:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mCurStress:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mCyclingIndex:[F
    .annotation build Landroidx/room/ColumnInfo;
        defaultValue = ""
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mCyclingLactateAvg:F
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mDescendAltitude:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mDeviceId:Ljava/lang/String;
    .annotation build Landroidx/room/ColumnInfo;
        defaultValue = ""
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mDistance:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mDownSwingTime:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mDribbleTime:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mDuration:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mEllipticalSteps:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mEnd:J
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mFatTotal:F
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mFeel:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mFirmwareFlag:Ljava/lang/String;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mFitnessAge:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mFitnessLevel:[F
    .annotation build Landroidx/room/ColumnInfo;
        defaultValue = ""
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mFlag:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mFrontCrawlPerc:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mGoalCalorie:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mGoalDistance:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mGoalTime:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mHrPathCount:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mHrPathPoints:Ljava/util/List;
    .annotation build Landroidx/room/ColumnInfo;
        defaultValue = ""
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private mHrPathSampleInterval:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private final mId:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Landroidx/room/PrimaryKey;
        autoGenerate = true
    .end annotation
.end field

.field private mIsDelete:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mIsSync:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mLactateThresholdHr:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mLactateThresholdPace:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mLocalTime:Ljava/lang/String;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mMaxAltitude:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mMaxBpm:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mMaxCadence:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mMaxOxygenPower:F
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mMaxPace:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mMaxSpeed:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mMaxSpm:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mMaxStress:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mMaxVO2:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mMetTotal:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mMinAltitude:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mMinBpm:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mMinPace:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mMinSpeed:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mMinSpm:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mMinStress:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mMode:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mNavigatorActualDistance:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mNavigatorActualPace:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mNavigatorActualSpeed:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mNavigatorActualSpeedV2:F
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mNavigatorActualTime:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mNavigatorDifferenceDistance:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mNavigatorDifferencePace:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mNavigatorDifferenceSpeed:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mNavigatorDifferenceTime:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mNavigatorStatusDistance:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mNavigatorStatusPace:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mNavigatorStatusSpeed:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mNavigatorStatusTime:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mNavigatorTargetDistance:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mNavigatorTargetPace:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mNavigatorTargetSpeed:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mNavigatorTargetSpeedV2:F
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mNavigatorTargetTime:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mPace:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mPacePathCount:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mPacePathPoints:Ljava/util/List;
    .annotation build Landroidx/room/ColumnInfo;
        defaultValue = ""
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private mPacePathSampleInterval:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mPathCount:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mPathPoints:Ljava/util/List;
    .annotation build Landroidx/room/ColumnInfo;
        defaultValue = ""
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "[F>;"
        }
    .end annotation
.end field

.field private mPathSampleInterval:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mPausedDuration:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mPersonalZone:[I
    .annotation build Landroidx/room/ColumnInfo;
        defaultValue = ""
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mPlatform:Ljava/lang/String;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mPowerCount:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mPowerInterval:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mPowerPoints:Ljava/util/List;
    .annotation build Landroidx/room/ColumnInfo;
        defaultValue = ""
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private mPrototype:Ljava/lang/String;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mRecoveryHrCount:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mRecoveryHrPoints:Ljava/util/List;
    .annotation build Landroidx/room/ColumnInfo;
        defaultValue = ""
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private mRecoveryTime:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mRestDuration:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mRunLactateAvg:F
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mRunPowerWatt:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mSessionCount:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mSource:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mSpeed:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mSpeedPathCount:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mSpeedPathPoints:Ljava/util/List;
    .annotation build Landroidx/room/ColumnInfo;
        defaultValue = ""
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private mSpeedPathSampleInterval:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mSpm:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mSpmPathPointsCount:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mSpmPathPointsPoints:Ljava/util/List;
    .annotation build Landroidx/room/ColumnInfo;
        defaultValue = ""
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private mStaBalance:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mStamina:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mStart:J
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mStep:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mStepLen:F
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mStepLenCount:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mStepLenPoints:Ljava/util/List;
    .annotation build Landroidx/room/ColumnInfo;
        defaultValue = ""
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private mSwimPoolLength:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mSwimSwolf:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mSwimType:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mTlTrend:F
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mTrainingLoad:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mTrainingStatus:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mTrendWeek:[F
    .annotation build Landroidx/room/ColumnInfo;
        defaultValue = ""
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mTripCount:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mType:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mVerticalOscillation:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private realTimeAerobic:F
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private realTimeAnaerobic:F
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 171

    .line 1
    const v169, 0x7fffffff

    const/16 v170, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    const/16 v63, 0x0

    const/16 v64, 0x0

    const/16 v65, 0x0

    const/16 v66, 0x0

    const/16 v67, 0x0

    const/16 v68, 0x0

    const/16 v69, 0x0

    const/16 v70, 0x0

    const/16 v71, 0x0

    const/16 v72, 0x0

    const/16 v73, 0x0

    const/16 v74, 0x0

    const/16 v75, 0x0

    const/16 v76, 0x0

    const/16 v77, 0x0

    const/16 v78, 0x0

    const/16 v79, 0x0

    const/16 v80, 0x0

    const/16 v81, 0x0

    const/16 v82, 0x0

    const/16 v83, 0x0

    const/16 v84, 0x0

    const/16 v85, 0x0

    const/16 v86, 0x0

    const/16 v87, 0x0

    const/16 v88, 0x0

    const/16 v89, 0x0

    const/16 v90, 0x0

    const/16 v91, 0x0

    const/16 v92, 0x0

    const/16 v93, 0x0

    const/16 v94, 0x0

    const/16 v95, 0x0

    const/16 v96, 0x0

    const/16 v97, 0x0

    const/16 v98, 0x0

    const/16 v99, 0x0

    const/16 v100, 0x0

    const/16 v101, 0x0

    const/16 v102, 0x0

    const/16 v103, 0x0

    const/16 v104, 0x0

    const/16 v105, 0x0

    const/16 v106, 0x0

    const/16 v107, 0x0

    const/16 v108, 0x0

    const/16 v109, 0x0

    const/16 v110, 0x0

    const/16 v111, 0x0

    const/16 v112, 0x0

    const/16 v113, 0x0

    const/16 v114, 0x0

    const/16 v115, 0x0

    const/16 v116, 0x0

    const/16 v117, 0x0

    const/16 v118, 0x0

    const/16 v119, 0x0

    const/16 v120, 0x0

    const/16 v121, 0x0

    const/16 v122, 0x0

    const/16 v123, 0x0

    const/16 v124, 0x0

    const/16 v125, 0x0

    const/16 v126, 0x0

    const/16 v127, 0x0

    const/16 v128, 0x0

    const/16 v129, 0x0

    const/16 v130, 0x0

    const/16 v131, 0x0

    const/16 v132, 0x0

    const/16 v133, 0x0

    const/16 v134, 0x0

    const/16 v135, 0x0

    const/16 v136, 0x0

    const/16 v137, 0x0

    const/16 v138, 0x0

    const/16 v139, 0x0

    const/16 v140, 0x0

    const-wide/16 v141, 0x0

    const/16 v143, 0x0

    const/16 v144, 0x0

    const-wide/16 v145, 0x0

    const/16 v147, 0x0

    const/16 v148, 0x0

    const-wide/16 v149, 0x0

    const/16 v151, 0x0

    const/16 v152, 0x0

    const/16 v153, 0x0

    const/16 v154, 0x0

    const/16 v155, 0x0

    const/16 v156, 0x0

    const/16 v157, 0x0

    const/16 v158, 0x0

    const/16 v159, 0x0

    const/16 v160, 0x0

    const/16 v161, 0x0

    const/16 v162, 0x0

    const/16 v163, 0x0

    const/16 v164, 0x0

    const/16 v165, -0x1

    const/16 v166, -0x1

    const/16 v167, -0x1

    const/16 v168, -0x1

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v170}, Lcom/sma/smartv3/db/entity/Workout;-><init>(IJJLjava/lang/String;IIIIIIIIIIIIIIIIIIIIIIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIIFFIFIII[I[IIIIIIIIILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IIIIIIIIIIIIIIIIIIFIIF[I[FIIILjava/util/List;FFFFIIIIIIIIIIIIFFIIIIF[F[FIIIIIIIILjava/util/List;ILjava/util/List;IJIIJIIJIIIIIIFFIILjava/util/List;ILjava/lang/String;IIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IJJLjava/lang/String;IIIIIIIIIIIIIIIIIIIIIIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIIFFIFIII[I[IIIIIIIIILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IIIIIIIIIIIIIIIIIIFIIF[I[FIIILjava/util/List;FFFFIIIIIIIIIIIIFFIIIIF[F[FIIIIIIIILjava/util/List;ILjava/util/List;IJIIJIIJIIIIIIFFIILjava/util/List;ILjava/lang/String;I)V
    .locals 5
    .param p6    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p33    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p34    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p35    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p36    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p50    # [I
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p51    # [I
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p60    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p63    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p66    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p69    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p72    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p75    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p98    # [I
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p99    # [F
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p103    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p127    # [F
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p128    # [F
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p137    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p139    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p161    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p163    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IJJ",
            "Ljava/lang/String;",
            "IIIIIIIIIIIIIIIIIIIIIIIIII",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "IIIIIIFFIFIII[I[IIIIIIIII",
            "Ljava/util/List<",
            "[F>;II",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;II",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;II",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;II",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;II",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;IIIIIIIIIIIIIIIIIIFIIF[I[FIII",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;FFFFIIIIIIIIIIIIFFIIIIF[F[FIIIIIIII",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;I",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;IJIIJIIJIIIIIIFFII",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;I",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p33

    move-object/from16 v1, p34

    move-object/from16 v2, p35

    move-object/from16 v3, p36

    const-string v4, "mLocalTime"

    invoke-static {p6, v4}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "mPrototype"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "mFirmwareFlag"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "mBleName"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "mPlatform"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mId:I

    .line 4
    iput-wide p2, p0, Lcom/sma/smartv3/db/entity/Workout;->mStart:J

    .line 5
    iput-wide p4, p0, Lcom/sma/smartv3/db/entity/Workout;->mEnd:J

    .line 6
    iput-object p6, p0, Lcom/sma/smartv3/db/entity/Workout;->mLocalTime:Ljava/lang/String;

    .line 7
    iput p7, p0, Lcom/sma/smartv3/db/entity/Workout;->mDuration:I

    .line 8
    iput p8, p0, Lcom/sma/smartv3/db/entity/Workout;->mAltitude:I

    .line 9
    iput p9, p0, Lcom/sma/smartv3/db/entity/Workout;->mAirPressure:I

    .line 10
    iput p10, p0, Lcom/sma/smartv3/db/entity/Workout;->mSpm:I

    move/from16 p1, p11

    .line 11
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMode:I

    move/from16 p1, p12

    .line 12
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mStep:I

    move/from16 p1, p13

    .line 13
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mDistance:I

    move/from16 p1, p14

    .line 14
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCalorie:I

    move/from16 p1, p15

    .line 15
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mSpeed:I

    move/from16 p1, p16

    .line 16
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mPace:I

    move/from16 p1, p17

    .line 17
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mAvgBpm:I

    move/from16 p1, p18

    .line 18
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMaxBpm:I

    move/from16 p1, p19

    .line 19
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMinBpm:I

    move/from16 p1, p20

    .line 20
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMaxSpm:I

    move/from16 p1, p21

    .line 21
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMinSpm:I

    move/from16 p1, p22

    .line 22
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMaxPace:I

    move/from16 p1, p23

    .line 23
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMinPace:I

    move/from16 p1, p24

    .line 24
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMaxAltitude:I

    move/from16 p1, p25

    .line 25
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMinAltitude:I

    move/from16 p1, p26

    .line 26
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMinStress:I

    move/from16 p1, p27

    .line 27
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMaxStress:I

    move/from16 p1, p28

    .line 28
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mAvgStress:I

    move/from16 p1, p29

    .line 29
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mSource:I

    move/from16 p1, p30

    .line 30
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mIsSync:I

    move/from16 p1, p31

    .line 31
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mIsDelete:I

    move/from16 p1, p32

    .line 32
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mFeel:I

    .line 33
    iput-object v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mPrototype:Ljava/lang/String;

    .line 34
    iput-object v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mFirmwareFlag:Ljava/lang/String;

    .line 35
    iput-object v2, p0, Lcom/sma/smartv3/db/entity/Workout;->mBleName:Ljava/lang/String;

    .line 36
    iput-object v3, p0, Lcom/sma/smartv3/db/entity/Workout;->mPlatform:Ljava/lang/String;

    move/from16 p1, p37

    .line 37
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMaxSpeed:I

    move/from16 p1, p38

    .line 38
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMinSpeed:I

    move/from16 p1, p39

    .line 39
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mRestDuration:I

    move/from16 p1, p40

    .line 40
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mAGpsType:I

    move/from16 p1, p41

    .line 41
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mType:I

    move/from16 p1, p42

    .line 42
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMetTotal:I

    move/from16 p1, p43

    .line 43
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mAerobic:F

    move/from16 p1, p44

    .line 44
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mAnaerobic:F

    move/from16 p1, p45

    .line 45
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mStamina:I

    move/from16 p1, p46

    .line 46
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mAvgSpeed:F

    move/from16 p1, p47

    .line 47
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCadence:I

    move/from16 p1, p48

    .line 48
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMaxCadence:I

    move/from16 p1, p49

    .line 49
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCnt:I

    move-object/from16 p1, p50

    .line 50
    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mBpmZoneCount:[I

    move-object/from16 p1, p51

    .line 51
    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mPersonalZone:[I

    move/from16 p1, p52

    .line 52
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mLactateThresholdPace:I

    move/from16 p1, p53

    .line 53
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mRecoveryTime:I

    move/from16 p1, p54

    .line 54
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mTrainingLoad:I

    move/from16 p1, p55

    .line 55
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMaxVO2:I

    move/from16 p1, p56

    .line 56
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mLactateThresholdHr:I

    move/from16 p1, p57

    .line 57
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mAlgorithmMarking:I

    move/from16 p1, p58

    .line 58
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mPathCount:I

    move/from16 p1, p59

    .line 59
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mPathSampleInterval:I

    move-object/from16 p1, p60

    .line 60
    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mPathPoints:Ljava/util/List;

    move/from16 p1, p61

    .line 61
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mHrPathCount:I

    move/from16 p1, p62

    .line 62
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mHrPathSampleInterval:I

    move-object/from16 p1, p63

    .line 63
    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mHrPathPoints:Ljava/util/List;

    move/from16 p1, p64

    .line 64
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mPacePathCount:I

    move/from16 p1, p65

    .line 65
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mPacePathSampleInterval:I

    move-object/from16 p1, p66

    .line 66
    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mPacePathPoints:Ljava/util/List;

    move/from16 p1, p67

    .line 67
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mSpeedPathCount:I

    move/from16 p1, p68

    .line 68
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mSpeedPathSampleInterval:I

    move-object/from16 p1, p69

    .line 69
    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mSpeedPathPoints:Ljava/util/List;

    move/from16 p1, p70

    .line 70
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCadencePathCount:I

    move/from16 p1, p71

    .line 71
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCadencePathSampleInterval:I

    move-object/from16 p1, p72

    .line 72
    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCadencePathPoints:Ljava/util/List;

    move/from16 p1, p73

    .line 73
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mAltitudePathCount:I

    move/from16 p1, p74

    .line 74
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mAltitudePathSampleInterval:I

    move-object/from16 p1, p75

    .line 75
    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mAltitudePathPoints:Ljava/util/List;

    move/from16 p1, p76

    .line 76
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mGoalDistance:I

    move/from16 p1, p77

    .line 77
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mGoalTime:I

    move/from16 p1, p78

    .line 78
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mGoalCalorie:I

    move/from16 p1, p79

    .line 79
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mPausedDuration:I

    move/from16 p1, p80

    .line 80
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCurBpm:I

    move/from16 p1, p81

    .line 81
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mAscendAltitude:I

    move/from16 p1, p82

    .line 82
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mDescendAltitude:I

    move/from16 p1, p83

    .line 83
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCurStress:I

    move/from16 p1, p84

    .line 84
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mSwimType:I

    move/from16 p1, p85

    .line 85
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCntFore:I

    move/from16 p1, p86

    .line 86
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCntBack:I

    move/from16 p1, p87

    .line 87
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mBackSwingTime:I

    move/from16 p1, p88

    .line 88
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mDownSwingTime:I

    move/from16 p1, p89

    .line 89
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mDribbleTime:I

    move/from16 p1, p90

    .line 90
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mTripCount:I

    move/from16 p1, p91

    .line 91
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mSessionCount:I

    move/from16 p1, p92

    .line 92
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mVerticalOscillation:I

    move/from16 p1, p93

    .line 93
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mRunPowerWatt:I

    move/from16 p1, p94

    .line 94
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mStepLen:F

    move/from16 p1, p95

    .line 95
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mTrainingStatus:I

    move/from16 p1, p96

    .line 96
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mFitnessAge:I

    move/from16 p1, p97

    .line 97
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mTlTrend:F

    move-object/from16 p1, p98

    .line 98
    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mBestRunTime:[I

    move-object/from16 p1, p99

    .line 99
    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mFitnessLevel:[F

    move/from16 p1, p100

    .line 100
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCalorieTotal:I

    move/from16 p1, p101

    .line 101
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mPowerCount:I

    move/from16 p1, p102

    .line 102
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mPowerInterval:I

    move-object/from16 p1, p103

    .line 103
    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mPowerPoints:Ljava/util/List;

    move/from16 p1, p104

    .line 104
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->realTimeAerobic:F

    move/from16 p1, p105

    .line 105
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->realTimeAnaerobic:F

    move/from16 p1, p106

    .line 106
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mFatTotal:F

    move/from16 p1, p107

    .line 107
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCarboTotal:F

    move/from16 p1, p108

    .line 108
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorTargetTime:I

    move/from16 p1, p109

    .line 109
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorActualTime:I

    move/from16 p1, p110

    .line 110
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorDifferenceTime:I

    move/from16 p1, p111

    .line 111
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorStatusTime:I

    move/from16 p1, p112

    .line 112
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorTargetDistance:I

    move/from16 p1, p113

    .line 113
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorActualDistance:I

    move/from16 p1, p114

    .line 114
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorDifferenceDistance:I

    move/from16 p1, p115

    .line 115
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorStatusDistance:I

    move/from16 p1, p116

    .line 116
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorTargetPace:I

    move/from16 p1, p117

    .line 117
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorActualPace:I

    move/from16 p1, p118

    .line 118
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorDifferencePace:I

    move/from16 p1, p119

    .line 119
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorStatusPace:I

    move/from16 p1, p120

    .line 120
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorTargetSpeedV2:F

    move/from16 p1, p121

    .line 121
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorActualSpeedV2:F

    move/from16 p1, p122

    .line 122
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorTargetSpeed:I

    move/from16 p1, p123

    .line 123
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorActualSpeed:I

    move/from16 p1, p124

    .line 124
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorDifferenceSpeed:I

    move/from16 p1, p125

    .line 125
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorStatusSpeed:I

    move/from16 p1, p126

    .line 126
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMaxOxygenPower:F

    move-object/from16 p1, p127

    .line 127
    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mTrendWeek:[F

    move-object/from16 p1, p128

    .line 128
    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCyclingIndex:[F

    move/from16 p1, p129

    .line 129
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mStaBalance:I

    move/from16 p1, p130

    .line 130
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mSwimSwolf:I

    move/from16 p1, p131

    .line 131
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCntLap:I

    move/from16 p1, p132

    .line 132
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mFrontCrawlPerc:I

    move/from16 p1, p133

    .line 133
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mBreaststrokePerc:I

    move/from16 p1, p134

    .line 134
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mBackstrokePerc:I

    move/from16 p1, p135

    .line 135
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mButterflyPerc:I

    move/from16 p1, p136

    .line 136
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mSpmPathPointsCount:I

    move-object/from16 p1, p137

    .line 137
    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mSpmPathPointsPoints:Ljava/util/List;

    move/from16 p1, p138

    .line 138
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mStepLenCount:I

    move-object/from16 p1, p139

    .line 139
    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mStepLenPoints:Ljava/util/List;

    move/from16 p1, p140

    .line 140
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mEllipticalSteps:I

    move-wide/from16 p1, p141

    .line 141
    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildSwimStartTime:J

    move/from16 p1, p143

    .line 142
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildSwimDuration:I

    move/from16 p1, p144

    .line 143
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildSwimDistance:I

    move-wide/from16 p1, p145

    .line 144
    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildCyclingStartTime:J

    move/from16 p1, p147

    .line 145
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildCyclingDuration:I

    move/from16 p1, p148

    .line 146
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildCyclingDistance:I

    move-wide/from16 p1, p149

    .line 147
    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildRunStartTime:J

    move/from16 p1, p151

    .line 148
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildRunDuration:I

    move/from16 p1, p152

    .line 149
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildRunDistance:I

    move/from16 p1, p153

    .line 150
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildSwimMode:I

    move/from16 p1, p154

    .line 151
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildCyclingMode:I

    move/from16 p1, p155

    .line 152
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildRunMode:I

    move/from16 p1, p156

    .line 153
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildNumber:I

    move/from16 p1, p157

    .line 154
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mRunLactateAvg:F

    move/from16 p1, p158

    .line 155
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCyclingLactateAvg:F

    move/from16 p1, p159

    .line 156
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mFlag:I

    move/from16 p1, p160

    .line 157
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mRecoveryHrCount:I

    move-object/from16 p1, p161

    .line 158
    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mRecoveryHrPoints:Ljava/util/List;

    move/from16 p1, p162

    .line 159
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mSwimPoolLength:I

    move-object/from16 p1, p163

    .line 160
    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mDeviceId:Ljava/lang/String;

    move/from16 p1, p164

    .line 161
    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mAICoachSportID:I

    return-void
.end method

.method public synthetic constructor <init>(IJJLjava/lang/String;IIIIIIIIIIIIIIIIIIIIIIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIIFFIFIII[I[IIIIIIIIILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IIIIIIIIIIIIIIIIIIFIIF[I[FIIILjava/util/List;FFFFIIIIIIIIIIIIFFIIIIF[F[FIIIIIIIILjava/util/List;ILjava/util/List;IJIIJIIJIIIIIIFFIILjava/util/List;ILjava/lang/String;IIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 130

    move/from16 v0, p165

    move/from16 v1, p166

    move/from16 v2, p167

    move/from16 v3, p168

    move/from16 v4, p169

    and-int/lit8 v5, v0, 0x1

    if-eqz v5, :cond_0

    const/4 v5, 0x0

    goto :goto_0

    :cond_0
    move/from16 v5, p1

    :goto_0
    and-int/lit8 v7, v0, 0x2

    if-eqz v7, :cond_1

    const-wide/16 v10, 0x0

    goto :goto_1

    :cond_1
    move-wide/from16 v10, p2

    :goto_1
    and-int/lit8 v7, v0, 0x4

    if-eqz v7, :cond_2

    const-wide/16 v12, 0x0

    goto :goto_2

    :cond_2
    move-wide/from16 v12, p4

    :goto_2
    and-int/lit8 v7, v0, 0x8

    .line 162
    const-string v14, ""

    if-eqz v7, :cond_3

    move-object v7, v14

    goto :goto_3

    :cond_3
    move-object/from16 v7, p6

    :goto_3
    and-int/lit8 v15, v0, 0x10

    if-eqz v15, :cond_4

    const/4 v15, 0x0

    goto :goto_4

    :cond_4
    move/from16 v15, p7

    :goto_4
    and-int/lit8 v16, v0, 0x20

    if-eqz v16, :cond_5

    const/16 v16, 0x0

    goto :goto_5

    :cond_5
    move/from16 v16, p8

    :goto_5
    and-int/lit8 v17, v0, 0x40

    if-eqz v17, :cond_6

    const/16 v17, 0x0

    goto :goto_6

    :cond_6
    move/from16 v17, p9

    :goto_6
    and-int/lit16 v6, v0, 0x80

    if-eqz v6, :cond_7

    const/4 v6, 0x0

    goto :goto_7

    :cond_7
    move/from16 v6, p10

    :goto_7
    and-int/lit16 v8, v0, 0x100

    if-eqz v8, :cond_8

    const/4 v8, 0x0

    goto :goto_8

    :cond_8
    move/from16 v8, p11

    :goto_8
    and-int/lit16 v9, v0, 0x200

    if-eqz v9, :cond_9

    const/4 v9, 0x0

    goto :goto_9

    :cond_9
    move/from16 v9, p12

    :goto_9
    move/from16 p1, v5

    and-int/lit16 v5, v0, 0x400

    if-eqz v5, :cond_a

    const/4 v5, 0x0

    goto :goto_a

    :cond_a
    move/from16 v5, p13

    :goto_a
    move/from16 p2, v5

    and-int/lit16 v5, v0, 0x800

    if-eqz v5, :cond_b

    const/4 v5, 0x0

    goto :goto_b

    :cond_b
    move/from16 v5, p14

    :goto_b
    move/from16 p3, v5

    and-int/lit16 v5, v0, 0x1000

    if-eqz v5, :cond_c

    const/4 v5, 0x0

    goto :goto_c

    :cond_c
    move/from16 v5, p15

    :goto_c
    move/from16 p4, v5

    and-int/lit16 v5, v0, 0x2000

    if-eqz v5, :cond_d

    const/4 v5, 0x0

    goto :goto_d

    :cond_d
    move/from16 v5, p16

    :goto_d
    move/from16 p5, v5

    and-int/lit16 v5, v0, 0x4000

    if-eqz v5, :cond_e

    const/4 v5, 0x0

    goto :goto_e

    :cond_e
    move/from16 v5, p17

    :goto_e
    const v20, 0x8000

    and-int v21, v0, v20

    if-eqz v21, :cond_f

    const/16 v21, 0x0

    goto :goto_f

    :cond_f
    move/from16 v21, p18

    :goto_f
    const/high16 v22, 0x10000

    and-int v23, v0, v22

    if-eqz v23, :cond_10

    const/16 v23, 0x0

    goto :goto_10

    :cond_10
    move/from16 v23, p19

    :goto_10
    const/high16 v24, 0x20000

    and-int v24, v0, v24

    if-eqz v24, :cond_11

    const/16 v24, 0x0

    goto :goto_11

    :cond_11
    move/from16 v24, p20

    :goto_11
    const/high16 v25, 0x40000

    and-int v25, v0, v25

    if-eqz v25, :cond_12

    const/16 v25, 0x0

    goto :goto_12

    :cond_12
    move/from16 v25, p21

    :goto_12
    const/high16 v26, 0x80000

    and-int v26, v0, v26

    if-eqz v26, :cond_13

    const/16 v26, 0x0

    goto :goto_13

    :cond_13
    move/from16 v26, p22

    :goto_13
    const/high16 v27, 0x100000

    and-int v27, v0, v27

    if-eqz v27, :cond_14

    const/16 v27, 0x0

    goto :goto_14

    :cond_14
    move/from16 v27, p23

    :goto_14
    const/high16 v28, 0x200000

    and-int v28, v0, v28

    if-eqz v28, :cond_15

    const/16 v28, 0x0

    goto :goto_15

    :cond_15
    move/from16 v28, p24

    :goto_15
    const/high16 v29, 0x400000

    and-int v29, v0, v29

    if-eqz v29, :cond_16

    const/16 v29, 0x0

    goto :goto_16

    :cond_16
    move/from16 v29, p25

    :goto_16
    const/high16 v30, 0x800000

    and-int v30, v0, v30

    if-eqz v30, :cond_17

    const/16 v30, 0x0

    goto :goto_17

    :cond_17
    move/from16 v30, p26

    :goto_17
    const/high16 v31, 0x1000000

    and-int v31, v0, v31

    if-eqz v31, :cond_18

    const/16 v31, 0x0

    goto :goto_18

    :cond_18
    move/from16 v31, p27

    :goto_18
    const/high16 v32, 0x2000000

    and-int v32, v0, v32

    if-eqz v32, :cond_19

    const/16 v32, 0x0

    goto :goto_19

    :cond_19
    move/from16 v32, p28

    :goto_19
    const/high16 v33, 0x4000000

    and-int v33, v0, v33

    if-eqz v33, :cond_1a

    const/16 v33, 0x0

    goto :goto_1a

    :cond_1a
    move/from16 v33, p29

    :goto_1a
    const/high16 v34, 0x8000000

    and-int v34, v0, v34

    if-eqz v34, :cond_1b

    const/16 v34, 0x0

    goto :goto_1b

    :cond_1b
    move/from16 v34, p30

    :goto_1b
    const/high16 v35, 0x10000000

    and-int v35, v0, v35

    if-eqz v35, :cond_1c

    const/16 v35, 0x0

    goto :goto_1c

    :cond_1c
    move/from16 v35, p31

    :goto_1c
    const/high16 v36, 0x20000000

    and-int v36, v0, v36

    if-eqz v36, :cond_1d

    const/16 v36, 0x0

    goto :goto_1d

    :cond_1d
    move/from16 v36, p32

    :goto_1d
    const/high16 v37, 0x40000000    # 2.0f

    and-int v37, v0, v37

    if-eqz v37, :cond_1e

    move-object/from16 v37, v14

    goto :goto_1e

    :cond_1e
    move-object/from16 v37, p33

    :goto_1e
    const/high16 v38, -0x80000000

    and-int v0, v0, v38

    if-eqz v0, :cond_1f

    move-object v0, v14

    goto :goto_1f

    :cond_1f
    move-object/from16 v0, p34

    :goto_1f
    and-int/lit8 v38, v1, 0x1

    if-eqz v38, :cond_20

    move-object/from16 v38, v14

    goto :goto_20

    :cond_20
    move-object/from16 v38, p35

    :goto_20
    and-int/lit8 v39, v1, 0x2

    if-eqz v39, :cond_21

    move-object/from16 v39, v14

    goto :goto_21

    :cond_21
    move-object/from16 v39, p36

    :goto_21
    and-int/lit8 v40, v1, 0x4

    if-eqz v40, :cond_22

    const/16 v40, 0x0

    goto :goto_22

    :cond_22
    move/from16 v40, p37

    :goto_22
    and-int/lit8 v41, v1, 0x8

    if-eqz v41, :cond_23

    const/16 v41, 0x0

    goto :goto_23

    :cond_23
    move/from16 v41, p38

    :goto_23
    and-int/lit8 v42, v1, 0x10

    if-eqz v42, :cond_24

    const/16 v42, 0x0

    goto :goto_24

    :cond_24
    move/from16 v42, p39

    :goto_24
    and-int/lit8 v43, v1, 0x20

    if-eqz v43, :cond_25

    const/16 v43, 0x63

    goto :goto_25

    :cond_25
    move/from16 v43, p40

    :goto_25
    and-int/lit8 v44, v1, 0x40

    if-eqz v44, :cond_26

    const/16 v44, 0x0

    goto :goto_26

    :cond_26
    move/from16 v44, p41

    :goto_26
    move-object/from16 p6, v0

    and-int/lit16 v0, v1, 0x80

    if-eqz v0, :cond_27

    const/4 v0, 0x0

    goto :goto_27

    :cond_27
    move/from16 v0, p42

    :goto_27
    move/from16 p7, v0

    and-int/lit16 v0, v1, 0x100

    const/16 v45, 0x0

    if-eqz v0, :cond_28

    move/from16 v0, v45

    goto :goto_28

    :cond_28
    move/from16 v0, p43

    :goto_28
    move/from16 p8, v0

    and-int/lit16 v0, v1, 0x200

    if-eqz v0, :cond_29

    move/from16 v0, v45

    goto :goto_29

    :cond_29
    move/from16 v0, p44

    :goto_29
    move/from16 p9, v0

    and-int/lit16 v0, v1, 0x400

    if-eqz v0, :cond_2a

    const/4 v0, 0x0

    goto :goto_2a

    :cond_2a
    move/from16 v0, p45

    :goto_2a
    move/from16 p10, v0

    and-int/lit16 v0, v1, 0x800

    if-eqz v0, :cond_2b

    move/from16 v0, v45

    goto :goto_2b

    :cond_2b
    move/from16 v0, p46

    :goto_2b
    move/from16 p11, v0

    and-int/lit16 v0, v1, 0x1000

    if-eqz v0, :cond_2c

    const/4 v0, 0x0

    goto :goto_2c

    :cond_2c
    move/from16 v0, p47

    :goto_2c
    move/from16 p12, v0

    and-int/lit16 v0, v1, 0x2000

    if-eqz v0, :cond_2d

    const/4 v0, 0x0

    goto :goto_2d

    :cond_2d
    move/from16 v0, p48

    :goto_2d
    move/from16 p13, v0

    and-int/lit16 v0, v1, 0x4000

    if-eqz v0, :cond_2e

    const/4 v0, 0x0

    goto :goto_2e

    :cond_2e
    move/from16 v0, p49

    :goto_2e
    and-int v46, v1, v20

    const/16 v47, 0x0

    if-eqz v46, :cond_2f

    move-object/from16 v46, v47

    goto :goto_2f

    :cond_2f
    move-object/from16 v46, p50

    :goto_2f
    and-int v48, v1, v22

    if-eqz v48, :cond_30

    move-object/from16 v48, v47

    goto :goto_30

    :cond_30
    move-object/from16 v48, p51

    :goto_30
    const/high16 v49, 0x20000

    and-int v49, v1, v49

    if-eqz v49, :cond_31

    const/16 v49, 0x0

    goto :goto_31

    :cond_31
    move/from16 v49, p52

    :goto_31
    const/high16 v50, 0x40000

    and-int v50, v1, v50

    if-eqz v50, :cond_32

    const/16 v50, 0x0

    goto :goto_32

    :cond_32
    move/from16 v50, p53

    :goto_32
    const/high16 v51, 0x80000

    and-int v51, v1, v51

    if-eqz v51, :cond_33

    const/16 v51, 0x0

    goto :goto_33

    :cond_33
    move/from16 v51, p54

    :goto_33
    const/high16 v52, 0x100000

    and-int v52, v1, v52

    if-eqz v52, :cond_34

    const/16 v52, 0x0

    goto :goto_34

    :cond_34
    move/from16 v52, p55

    :goto_34
    const/high16 v53, 0x200000

    and-int v53, v1, v53

    if-eqz v53, :cond_35

    const/16 v53, 0x0

    goto :goto_35

    :cond_35
    move/from16 v53, p56

    :goto_35
    const/high16 v54, 0x400000

    and-int v54, v1, v54

    if-eqz v54, :cond_36

    const/16 v54, 0x0

    goto :goto_36

    :cond_36
    move/from16 v54, p57

    :goto_36
    const/high16 v55, 0x800000

    and-int v55, v1, v55

    if-eqz v55, :cond_37

    const/16 v55, 0x0

    goto :goto_37

    :cond_37
    move/from16 v55, p58

    :goto_37
    const/high16 v56, 0x1000000

    and-int v56, v1, v56

    if-eqz v56, :cond_38

    const/16 v56, 0x0

    goto :goto_38

    :cond_38
    move/from16 v56, p59

    :goto_38
    const/high16 v57, 0x2000000

    and-int v57, v1, v57

    if-eqz v57, :cond_39

    move-object/from16 v57, v47

    goto :goto_39

    :cond_39
    move-object/from16 v57, p60

    :goto_39
    const/high16 v58, 0x4000000

    and-int v58, v1, v58

    if-eqz v58, :cond_3a

    const/16 v58, 0x0

    goto :goto_3a

    :cond_3a
    move/from16 v58, p61

    :goto_3a
    const/high16 v59, 0x8000000

    and-int v59, v1, v59

    if-eqz v59, :cond_3b

    const/16 v59, 0x0

    goto :goto_3b

    :cond_3b
    move/from16 v59, p62

    :goto_3b
    const/high16 v60, 0x10000000

    and-int v60, v1, v60

    if-eqz v60, :cond_3c

    move-object/from16 v60, v47

    goto :goto_3c

    :cond_3c
    move-object/from16 v60, p63

    :goto_3c
    const/high16 v61, 0x20000000

    and-int v61, v1, v61

    if-eqz v61, :cond_3d

    const/16 v61, 0x0

    goto :goto_3d

    :cond_3d
    move/from16 v61, p64

    :goto_3d
    const/high16 v62, 0x40000000    # 2.0f

    and-int v62, v1, v62

    if-eqz v62, :cond_3e

    const/16 v62, 0x0

    goto :goto_3e

    :cond_3e
    move/from16 v62, p65

    :goto_3e
    const/high16 v63, -0x80000000

    and-int v1, v1, v63

    if-eqz v1, :cond_3f

    move-object/from16 v1, v47

    goto :goto_3f

    :cond_3f
    move-object/from16 v1, p66

    :goto_3f
    and-int/lit8 v63, v2, 0x1

    if-eqz v63, :cond_40

    const/16 v63, 0x0

    goto :goto_40

    :cond_40
    move/from16 v63, p67

    :goto_40
    and-int/lit8 v64, v2, 0x2

    if-eqz v64, :cond_41

    const/16 v64, 0x0

    goto :goto_41

    :cond_41
    move/from16 v64, p68

    :goto_41
    and-int/lit8 v65, v2, 0x4

    if-eqz v65, :cond_42

    move-object/from16 v65, v47

    goto :goto_42

    :cond_42
    move-object/from16 v65, p69

    :goto_42
    and-int/lit8 v66, v2, 0x8

    if-eqz v66, :cond_43

    const/16 v66, 0x0

    goto :goto_43

    :cond_43
    move/from16 v66, p70

    :goto_43
    and-int/lit8 v67, v2, 0x10

    if-eqz v67, :cond_44

    const/16 v67, 0x0

    goto :goto_44

    :cond_44
    move/from16 v67, p71

    :goto_44
    and-int/lit8 v68, v2, 0x20

    if-eqz v68, :cond_45

    move-object/from16 v68, v47

    goto :goto_45

    :cond_45
    move-object/from16 v68, p72

    :goto_45
    and-int/lit8 v69, v2, 0x40

    if-eqz v69, :cond_46

    const/16 v69, 0x0

    goto :goto_46

    :cond_46
    move/from16 v69, p73

    :goto_46
    move/from16 p14, v0

    and-int/lit16 v0, v2, 0x80

    if-eqz v0, :cond_47

    const/4 v0, 0x0

    goto :goto_47

    :cond_47
    move/from16 v0, p74

    :goto_47
    move/from16 p15, v0

    and-int/lit16 v0, v2, 0x100

    if-eqz v0, :cond_48

    move-object/from16 v0, v47

    goto :goto_48

    :cond_48
    move-object/from16 v0, p75

    :goto_48
    move-object/from16 p16, v0

    and-int/lit16 v0, v2, 0x200

    if-eqz v0, :cond_49

    const/4 v0, 0x0

    goto :goto_49

    :cond_49
    move/from16 v0, p76

    :goto_49
    move/from16 p17, v0

    and-int/lit16 v0, v2, 0x400

    if-eqz v0, :cond_4a

    const/4 v0, 0x0

    goto :goto_4a

    :cond_4a
    move/from16 v0, p77

    :goto_4a
    move/from16 p18, v0

    and-int/lit16 v0, v2, 0x800

    if-eqz v0, :cond_4b

    const/4 v0, 0x0

    goto :goto_4b

    :cond_4b
    move/from16 v0, p78

    :goto_4b
    move/from16 p19, v0

    and-int/lit16 v0, v2, 0x1000

    if-eqz v0, :cond_4c

    const/4 v0, 0x0

    goto :goto_4c

    :cond_4c
    move/from16 v0, p79

    :goto_4c
    move/from16 p20, v0

    and-int/lit16 v0, v2, 0x2000

    if-eqz v0, :cond_4d

    const/4 v0, 0x0

    goto :goto_4d

    :cond_4d
    move/from16 v0, p80

    :goto_4d
    move/from16 p21, v0

    and-int/lit16 v0, v2, 0x4000

    if-eqz v0, :cond_4e

    const/4 v0, 0x0

    goto :goto_4e

    :cond_4e
    move/from16 v0, p81

    :goto_4e
    and-int v70, v2, v20

    if-eqz v70, :cond_4f

    const/16 v70, 0x0

    goto :goto_4f

    :cond_4f
    move/from16 v70, p82

    :goto_4f
    and-int v71, v2, v22

    if-eqz v71, :cond_50

    const/16 v71, 0x0

    goto :goto_50

    :cond_50
    move/from16 v71, p83

    :goto_50
    const/high16 v72, 0x20000

    and-int v72, v2, v72

    if-eqz v72, :cond_51

    const/16 v72, 0x0

    goto :goto_51

    :cond_51
    move/from16 v72, p84

    :goto_51
    const/high16 v73, 0x40000

    and-int v73, v2, v73

    if-eqz v73, :cond_52

    const/16 v73, 0x0

    goto :goto_52

    :cond_52
    move/from16 v73, p85

    :goto_52
    const/high16 v74, 0x80000

    and-int v74, v2, v74

    if-eqz v74, :cond_53

    const/16 v74, 0x0

    goto :goto_53

    :cond_53
    move/from16 v74, p86

    :goto_53
    const/high16 v75, 0x100000

    and-int v75, v2, v75

    if-eqz v75, :cond_54

    const/16 v75, 0x0

    goto :goto_54

    :cond_54
    move/from16 v75, p87

    :goto_54
    const/high16 v76, 0x200000

    and-int v76, v2, v76

    if-eqz v76, :cond_55

    const/16 v76, 0x0

    goto :goto_55

    :cond_55
    move/from16 v76, p88

    :goto_55
    const/high16 v77, 0x400000

    and-int v77, v2, v77

    if-eqz v77, :cond_56

    const/16 v77, 0x0

    goto :goto_56

    :cond_56
    move/from16 v77, p89

    :goto_56
    const/high16 v78, 0x800000

    and-int v78, v2, v78

    if-eqz v78, :cond_57

    const/16 v78, 0x0

    goto :goto_57

    :cond_57
    move/from16 v78, p90

    :goto_57
    const/high16 v79, 0x1000000

    and-int v79, v2, v79

    if-eqz v79, :cond_58

    const/16 v79, 0x0

    goto :goto_58

    :cond_58
    move/from16 v79, p91

    :goto_58
    const/high16 v80, 0x2000000

    and-int v80, v2, v80

    if-eqz v80, :cond_59

    const/16 v80, 0x0

    goto :goto_59

    :cond_59
    move/from16 v80, p92

    :goto_59
    const/high16 v81, 0x4000000

    and-int v81, v2, v81

    if-eqz v81, :cond_5a

    const/16 v81, 0x0

    goto :goto_5a

    :cond_5a
    move/from16 v81, p93

    :goto_5a
    const/high16 v82, 0x8000000

    and-int v82, v2, v82

    if-eqz v82, :cond_5b

    move/from16 v82, v45

    goto :goto_5b

    :cond_5b
    move/from16 v82, p94

    :goto_5b
    const/high16 v83, 0x10000000

    and-int v83, v2, v83

    if-eqz v83, :cond_5c

    const/16 v83, 0x0

    goto :goto_5c

    :cond_5c
    move/from16 v83, p95

    :goto_5c
    const/high16 v84, 0x20000000

    and-int v84, v2, v84

    if-eqz v84, :cond_5d

    const/16 v84, 0x0

    goto :goto_5d

    :cond_5d
    move/from16 v84, p96

    :goto_5d
    const/high16 v85, 0x40000000    # 2.0f

    and-int v85, v2, v85

    if-eqz v85, :cond_5e

    move/from16 v85, v45

    goto :goto_5e

    :cond_5e
    move/from16 v85, p97

    :goto_5e
    const/high16 v86, -0x80000000

    and-int v2, v2, v86

    if-eqz v2, :cond_5f

    move-object/from16 v2, v47

    goto :goto_5f

    :cond_5f
    move-object/from16 v2, p98

    :goto_5f
    and-int/lit8 v86, v3, 0x1

    if-eqz v86, :cond_60

    move-object/from16 v86, v47

    goto :goto_60

    :cond_60
    move-object/from16 v86, p99

    :goto_60
    and-int/lit8 v87, v3, 0x2

    if-eqz v87, :cond_61

    const/16 v87, 0x0

    goto :goto_61

    :cond_61
    move/from16 v87, p100

    :goto_61
    and-int/lit8 v88, v3, 0x4

    if-eqz v88, :cond_62

    const/16 v88, 0x0

    goto :goto_62

    :cond_62
    move/from16 v88, p101

    :goto_62
    and-int/lit8 v89, v3, 0x8

    if-eqz v89, :cond_63

    const/16 v89, 0x0

    goto :goto_63

    :cond_63
    move/from16 v89, p102

    :goto_63
    and-int/lit8 v90, v3, 0x10

    if-eqz v90, :cond_64

    move-object/from16 v90, v47

    goto :goto_64

    :cond_64
    move-object/from16 v90, p103

    :goto_64
    and-int/lit8 v91, v3, 0x20

    if-eqz v91, :cond_65

    move/from16 v91, v45

    goto :goto_65

    :cond_65
    move/from16 v91, p104

    :goto_65
    and-int/lit8 v92, v3, 0x40

    if-eqz v92, :cond_66

    move/from16 v92, v45

    goto :goto_66

    :cond_66
    move/from16 v92, p105

    :goto_66
    move/from16 p22, v0

    and-int/lit16 v0, v3, 0x80

    if-eqz v0, :cond_67

    move/from16 v0, v45

    goto :goto_67

    :cond_67
    move/from16 v0, p106

    :goto_67
    move/from16 p23, v0

    and-int/lit16 v0, v3, 0x100

    if-eqz v0, :cond_68

    move/from16 v0, v45

    goto :goto_68

    :cond_68
    move/from16 v0, p107

    :goto_68
    move/from16 p24, v0

    and-int/lit16 v0, v3, 0x200

    if-eqz v0, :cond_69

    const/4 v0, 0x0

    goto :goto_69

    :cond_69
    move/from16 v0, p108

    :goto_69
    move/from16 p25, v0

    and-int/lit16 v0, v3, 0x400

    if-eqz v0, :cond_6a

    const/4 v0, 0x0

    goto :goto_6a

    :cond_6a
    move/from16 v0, p109

    :goto_6a
    move/from16 p26, v0

    and-int/lit16 v0, v3, 0x800

    if-eqz v0, :cond_6b

    const/4 v0, 0x0

    goto :goto_6b

    :cond_6b
    move/from16 v0, p110

    :goto_6b
    move/from16 p27, v0

    and-int/lit16 v0, v3, 0x1000

    if-eqz v0, :cond_6c

    const/4 v0, -0x1

    goto :goto_6c

    :cond_6c
    move/from16 v0, p111

    :goto_6c
    move/from16 p28, v0

    and-int/lit16 v0, v3, 0x2000

    if-eqz v0, :cond_6d

    const/4 v0, 0x0

    goto :goto_6d

    :cond_6d
    move/from16 v0, p112

    :goto_6d
    move/from16 p29, v0

    and-int/lit16 v0, v3, 0x4000

    if-eqz v0, :cond_6e

    const/4 v0, 0x0

    goto :goto_6e

    :cond_6e
    move/from16 v0, p113

    :goto_6e
    and-int v93, v3, v20

    if-eqz v93, :cond_6f

    const/16 v93, 0x0

    goto :goto_6f

    :cond_6f
    move/from16 v93, p114

    :goto_6f
    and-int v94, v3, v22

    if-eqz v94, :cond_70

    const/16 v94, -0x1

    goto :goto_70

    :cond_70
    move/from16 v94, p115

    :goto_70
    const/high16 v95, 0x20000

    and-int v95, v3, v95

    if-eqz v95, :cond_71

    const/16 v95, 0x0

    goto :goto_71

    :cond_71
    move/from16 v95, p116

    :goto_71
    const/high16 v96, 0x40000

    and-int v96, v3, v96

    if-eqz v96, :cond_72

    const/16 v96, 0x0

    goto :goto_72

    :cond_72
    move/from16 v96, p117

    :goto_72
    const/high16 v97, 0x80000

    and-int v97, v3, v97

    if-eqz v97, :cond_73

    const/16 v97, 0x0

    goto :goto_73

    :cond_73
    move/from16 v97, p118

    :goto_73
    const/high16 v98, 0x100000

    and-int v98, v3, v98

    if-eqz v98, :cond_74

    const/16 v98, -0x1

    goto :goto_74

    :cond_74
    move/from16 v98, p119

    :goto_74
    const/high16 v99, 0x200000

    and-int v99, v3, v99

    if-eqz v99, :cond_75

    move/from16 v99, v45

    goto :goto_75

    :cond_75
    move/from16 v99, p120

    :goto_75
    const/high16 v100, 0x400000

    and-int v100, v3, v100

    if-eqz v100, :cond_76

    move/from16 v100, v45

    goto :goto_76

    :cond_76
    move/from16 v100, p121

    :goto_76
    const/high16 v101, 0x800000

    and-int v101, v3, v101

    if-eqz v101, :cond_77

    const/16 v101, 0x0

    goto :goto_77

    :cond_77
    move/from16 v101, p122

    :goto_77
    const/high16 v102, 0x1000000

    and-int v102, v3, v102

    if-eqz v102, :cond_78

    const/16 v102, 0x0

    goto :goto_78

    :cond_78
    move/from16 v102, p123

    :goto_78
    const/high16 v103, 0x2000000

    and-int v103, v3, v103

    if-eqz v103, :cond_79

    const/16 v103, 0x0

    goto :goto_79

    :cond_79
    move/from16 v103, p124

    :goto_79
    const/high16 v104, 0x4000000

    and-int v104, v3, v104

    if-eqz v104, :cond_7a

    const/16 v104, -0x1

    goto :goto_7a

    :cond_7a
    move/from16 v104, p125

    :goto_7a
    const/high16 v105, 0x8000000

    and-int v105, v3, v105

    if-eqz v105, :cond_7b

    move/from16 v105, v45

    goto :goto_7b

    :cond_7b
    move/from16 v105, p126

    :goto_7b
    const/high16 v106, 0x10000000

    and-int v106, v3, v106

    if-eqz v106, :cond_7c

    move-object/from16 v106, v47

    goto :goto_7c

    :cond_7c
    move-object/from16 v106, p127

    :goto_7c
    const/high16 v107, 0x20000000

    and-int v107, v3, v107

    if-eqz v107, :cond_7d

    move-object/from16 v107, v47

    goto :goto_7d

    :cond_7d
    move-object/from16 v107, p128

    :goto_7d
    const/high16 v108, 0x40000000    # 2.0f

    and-int v108, v3, v108

    if-eqz v108, :cond_7e

    const/16 v108, 0x0

    goto :goto_7e

    :cond_7e
    move/from16 v108, p129

    :goto_7e
    const/high16 v109, -0x80000000

    and-int v3, v3, v109

    if-eqz v3, :cond_7f

    const/4 v3, 0x0

    goto :goto_7f

    :cond_7f
    move/from16 v3, p130

    :goto_7f
    and-int/lit8 v109, v4, 0x1

    if-eqz v109, :cond_80

    const/16 v109, 0x0

    goto :goto_80

    :cond_80
    move/from16 v109, p131

    :goto_80
    and-int/lit8 v110, v4, 0x2

    if-eqz v110, :cond_81

    const/16 v110, 0x0

    goto :goto_81

    :cond_81
    move/from16 v110, p132

    :goto_81
    and-int/lit8 v111, v4, 0x4

    if-eqz v111, :cond_82

    const/16 v111, 0x0

    goto :goto_82

    :cond_82
    move/from16 v111, p133

    :goto_82
    and-int/lit8 v112, v4, 0x8

    if-eqz v112, :cond_83

    const/16 v112, 0x0

    goto :goto_83

    :cond_83
    move/from16 v112, p134

    :goto_83
    and-int/lit8 v113, v4, 0x10

    if-eqz v113, :cond_84

    const/16 v113, 0x0

    goto :goto_84

    :cond_84
    move/from16 v113, p135

    :goto_84
    and-int/lit8 v114, v4, 0x20

    if-eqz v114, :cond_85

    const/16 v114, 0x0

    goto :goto_85

    :cond_85
    move/from16 v114, p136

    :goto_85
    and-int/lit8 v115, v4, 0x40

    if-eqz v115, :cond_86

    move-object/from16 v115, v47

    goto :goto_86

    :cond_86
    move-object/from16 v115, p137

    :goto_86
    move/from16 p30, v0

    and-int/lit16 v0, v4, 0x80

    if-eqz v0, :cond_87

    const/4 v0, 0x0

    goto :goto_87

    :cond_87
    move/from16 v0, p138

    :goto_87
    move/from16 p31, v0

    and-int/lit16 v0, v4, 0x100

    if-eqz v0, :cond_88

    move-object/from16 v0, v47

    goto :goto_88

    :cond_88
    move-object/from16 v0, p139

    :goto_88
    move-object/from16 p32, v0

    and-int/lit16 v0, v4, 0x200

    if-eqz v0, :cond_89

    const/4 v0, 0x0

    goto :goto_89

    :cond_89
    move/from16 v0, p140

    :goto_89
    move/from16 p33, v0

    and-int/lit16 v0, v4, 0x400

    if-eqz v0, :cond_8a

    const-wide/16 v116, 0x0

    goto :goto_8a

    :cond_8a
    move-wide/from16 v116, p141

    :goto_8a
    and-int/lit16 v0, v4, 0x800

    if-eqz v0, :cond_8b

    const/4 v0, 0x0

    goto :goto_8b

    :cond_8b
    move/from16 v0, p143

    :goto_8b
    move/from16 p34, v0

    and-int/lit16 v0, v4, 0x1000

    if-eqz v0, :cond_8c

    const/4 v0, 0x0

    goto :goto_8c

    :cond_8c
    move/from16 v0, p144

    :goto_8c
    move/from16 p35, v0

    and-int/lit16 v0, v4, 0x2000

    if-eqz v0, :cond_8d

    const-wide/16 v118, 0x0

    goto :goto_8d

    :cond_8d
    move-wide/from16 v118, p145

    :goto_8d
    and-int/lit16 v0, v4, 0x4000

    if-eqz v0, :cond_8e

    const/4 v0, 0x0

    goto :goto_8e

    :cond_8e
    move/from16 v0, p147

    :goto_8e
    and-int v20, v4, v20

    if-eqz v20, :cond_8f

    const/16 v20, 0x0

    goto :goto_8f

    :cond_8f
    move/from16 v20, p148

    :goto_8f
    and-int v22, v4, v22

    if-eqz v22, :cond_90

    const-wide/16 v18, 0x0

    goto :goto_90

    :cond_90
    move-wide/from16 v18, p149

    :goto_90
    const/high16 v22, 0x20000

    and-int v22, v4, v22

    if-eqz v22, :cond_91

    const/16 v22, 0x0

    goto :goto_91

    :cond_91
    move/from16 v22, p151

    :goto_91
    const/high16 v120, 0x40000

    and-int v120, v4, v120

    if-eqz v120, :cond_92

    const/16 v120, 0x0

    goto :goto_92

    :cond_92
    move/from16 v120, p152

    :goto_92
    const/high16 v121, 0x80000

    and-int v121, v4, v121

    if-eqz v121, :cond_93

    const/16 v121, 0x0

    goto :goto_93

    :cond_93
    move/from16 v121, p153

    :goto_93
    const/high16 v122, 0x100000

    and-int v122, v4, v122

    if-eqz v122, :cond_94

    const/16 v122, 0x0

    goto :goto_94

    :cond_94
    move/from16 v122, p154

    :goto_94
    const/high16 v123, 0x200000

    and-int v123, v4, v123

    if-eqz v123, :cond_95

    const/16 v123, 0x0

    goto :goto_95

    :cond_95
    move/from16 v123, p155

    :goto_95
    const/high16 v124, 0x400000

    and-int v124, v4, v124

    if-eqz v124, :cond_96

    const/16 v124, 0x0

    goto :goto_96

    :cond_96
    move/from16 v124, p156

    :goto_96
    const/high16 v125, 0x800000

    and-int v125, v4, v125

    if-eqz v125, :cond_97

    move/from16 v125, v45

    goto :goto_97

    :cond_97
    move/from16 v125, p157

    :goto_97
    const/high16 v126, 0x1000000

    and-int v126, v4, v126

    if-eqz v126, :cond_98

    goto :goto_98

    :cond_98
    move/from16 v45, p158

    :goto_98
    const/high16 v126, 0x2000000

    and-int v126, v4, v126

    if-eqz v126, :cond_99

    const/16 v126, 0x0

    goto :goto_99

    :cond_99
    move/from16 v126, p159

    :goto_99
    const/high16 v127, 0x4000000

    and-int v127, v4, v127

    if-eqz v127, :cond_9a

    const/16 v127, 0x0

    goto :goto_9a

    :cond_9a
    move/from16 v127, p160

    :goto_9a
    const/high16 v128, 0x8000000

    and-int v128, v4, v128

    if-eqz v128, :cond_9b

    goto :goto_9b

    :cond_9b
    move-object/from16 v47, p161

    :goto_9b
    const/high16 v128, 0x10000000

    and-int v128, v4, v128

    if-eqz v128, :cond_9c

    const/16 v128, 0x0

    goto :goto_9c

    :cond_9c
    move/from16 v128, p162

    :goto_9c
    const/high16 v129, 0x20000000

    and-int v129, v4, v129

    if-eqz v129, :cond_9d

    goto :goto_9d

    :cond_9d
    move-object/from16 v14, p163

    :goto_9d
    const/high16 v129, 0x40000000    # 2.0f

    and-int v4, v4, v129

    if-eqz v4, :cond_9e

    const/4 v4, -0x1

    move/16 p165, v4

    :goto_9e
    move/from16 p43, p7

    move/from16 p44, p8

    move/from16 p45, p9

    move/from16 p46, p10

    move/from16 p47, p11

    move/from16 p48, p12

    move/from16 p49, p13

    move/from16 p50, p14

    move/from16 p75, p15

    move-object/from16 p76, p16

    move/from16 p77, p17

    move/from16 p78, p18

    move/from16 p79, p19

    move/from16 p80, p20

    move/from16 p81, p21

    move/from16 p82, p22

    move/from16 p107, p23

    move/from16 p108, p24

    move/from16 p109, p25

    move/from16 p110, p26

    move/from16 p111, p27

    move/from16 p112, p28

    move/from16 p113, p29

    move/from16 p114, p30

    move/16 p139, p31

    move-object/16 p140, p32

    move/16 p141, p33

    move/16 p144, p34

    move/16 p145, p35

    move/16 p148, v0

    move-object/from16 p67, v1

    move-object/from16 p99, v2

    move/16 p131, v3

    move/from16 p18, v5

    move/from16 p11, v6

    move-object/from16 p7, v7

    move/from16 p12, v8

    move/from16 p13, v9

    move-object/16 p164, v14

    move/from16 p8, v15

    move/from16 p9, v16

    move/from16 p10, v17

    move-wide/16 p150, v18

    move/16 p149, v20

    move/from16 p19, v21

    move/16 p152, v22

    move/from16 p20, v23

    move/from16 p21, v24

    move/from16 p22, v25

    move/from16 p23, v26

    move/from16 p24, v27

    move/from16 p25, v28

    move/from16 p26, v29

    move/from16 p27, v30

    move/from16 p28, v31

    move/from16 p29, v32

    move/from16 p30, v33

    move/from16 p31, v34

    move/from16 p32, v35

    move/from16 p33, v36

    move-object/from16 p34, v37

    move-object/from16 p36, v38

    move-object/from16 p37, v39

    move/from16 p38, v40

    move/from16 p39, v41

    move/from16 p40, v42

    move/from16 p41, v43

    move/from16 p42, v44

    move/16 p159, v45

    move-object/from16 p51, v46

    move-object/16 p162, v47

    move-object/from16 p52, v48

    move/from16 p53, v49

    move/from16 p54, v50

    move/from16 p55, v51

    move/from16 p56, v52

    move/from16 p57, v53

    move/from16 p58, v54

    move/from16 p59, v55

    move/from16 p60, v56

    move-object/from16 p61, v57

    move/from16 p62, v58

    move/from16 p63, v59

    move-object/from16 p64, v60

    move/from16 p65, v61

    move/from16 p66, v62

    move/from16 p68, v63

    move/from16 p69, v64

    move-object/from16 p70, v65

    move/from16 p71, v66

    move/from16 p72, v67

    move-object/from16 p73, v68

    move/from16 p74, v69

    move/from16 p83, v70

    move/from16 p84, v71

    move/from16 p85, v72

    move/from16 p86, v73

    move/from16 p87, v74

    move/from16 p88, v75

    move/from16 p89, v76

    move/from16 p90, v77

    move/from16 p91, v78

    move/from16 p92, v79

    move/from16 p93, v80

    move/from16 p94, v81

    move/from16 p95, v82

    move/from16 p96, v83

    move/from16 p97, v84

    move/from16 p98, v85

    move-object/from16 p100, v86

    move/from16 p101, v87

    move/from16 p102, v88

    move/from16 p103, v89

    move-object/from16 p104, v90

    move/from16 p105, v91

    move/from16 p106, v92

    move/from16 p115, v93

    move/from16 p116, v94

    move/from16 p117, v95

    move/from16 p118, v96

    move/from16 p119, v97

    move/from16 p120, v98

    move/from16 p121, v99

    move/from16 p122, v100

    move/from16 p123, v101

    move/from16 p124, v102

    move/from16 p125, v103

    move/16 p126, v104

    move/16 p127, v105

    move-object/16 p128, v106

    move-object/16 p129, v107

    move/16 p130, v108

    move/16 p132, v109

    move/16 p133, v110

    move/16 p134, v111

    move/16 p135, v112

    move/16 p136, v113

    move/16 p137, v114

    move-object/16 p138, v115

    move-wide/16 p142, v116

    move-wide/16 p146, v118

    move/16 p153, v120

    move/16 p154, v121

    move/16 p155, v122

    move/16 p156, v123

    move/16 p157, v124

    move/16 p158, v125

    move/16 p160, v126

    move/16 p161, v127

    move/16 p163, v128

    move/from16 p14, p2

    move/from16 p15, p3

    move/from16 p16, p4

    move/from16 p17, p5

    move-object/from16 p35, p6

    move-wide/from16 p3, v10

    move-wide/from16 p5, v12

    move/from16 p2, p1

    move-object/from16 p1, p0

    goto :goto_9f

    :cond_9e
    move/16 p165, p164

    goto/16 :goto_9e

    :goto_9f
    invoke-direct/range {p1 .. p165}, Lcom/sma/smartv3/db/entity/Workout;-><init>(IJJLjava/lang/String;IIIIIIIIIIIIIIIIIIIIIIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIIFFIFIII[I[IIIIIIIIILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IIIIIIIIIIIIIIIIIIFIIF[I[FIIILjava/util/List;FFFFIIIIIIIIIIIIFFIIIIF[F[FIIIIIIIILjava/util/List;ILjava/util/List;IJIIJIIJIIIIIIFFIILjava/util/List;ILjava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Lcom/szabh/smable3/entity/BleWorkout2;J)V
    .locals 178
    .param p1    # Lcom/szabh/smable3/entity/BleWorkout2;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "bleWorkout"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 178
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout2;->getMStart()I

    move-result v0

    const v2, 0x386d4380

    add-int/2addr v0, v2

    int-to-long v3, v0

    const-wide/16 v5, 0x3e8

    mul-long/2addr v3, v5

    sub-long v9, v3, p2

    .line 179
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout2;->getMEnd()I

    move-result v0

    add-int/2addr v0, v2

    int-to-long v2, v0

    mul-long/2addr v2, v5

    sub-long v11, v2, p2

    .line 180
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout2;->getMDuration()I

    move-result v14

    .line 181
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout2;->getMAltitude()I

    move-result v15

    .line 182
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout2;->getMAirPressure()I

    move-result v16

    .line 183
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout2;->getMSpm()I

    move-result v17

    .line 184
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout2;->getMMode()I

    move-result v18

    .line 185
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout2;->getMStep()I

    move-result v19

    .line 186
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout2;->getMDistance()I

    move-result v20

    .line 187
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout2;->getMCalorie()I

    move-result v21

    .line 188
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout2;->getMSpeed()I

    move-result v22

    .line 189
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout2;->getMPace()I

    move-result v23

    .line 190
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout2;->getMAvgBpm()I

    move-result v24

    .line 191
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout2;->getMMaxBpm()I

    move-result v25

    .line 192
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout2;->getMMinBpm()I

    move-result v26

    .line 193
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout2;->getMMaxSpm()I

    move-result v27

    .line 194
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout2;->getMMinSpm()I

    move-result v28

    .line 195
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout2;->getMMaxPace()I

    move-result v29

    .line 196
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout2;->getMMinPace()I

    move-result v30

    .line 197
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout2;->getMMaxAltitude()I

    move-result v31

    .line 198
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout2;->getMMinAltitude()I

    move-result v32

    .line 199
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout2;->getMMinStress()I

    move-result v33

    .line 200
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout2;->getMMaxStress()I

    move-result v34

    .line 201
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout2;->getMAvgStress()I

    move-result v35

    .line 202
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout2;->getMMaxSpeed()I

    move-result v44

    .line 203
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout2;->getMMinSpeed()I

    move-result v45

    .line 204
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout2;->getMRestDuration()I

    move-result v46

    .line 205
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout2;->getMAltitudeclimb()I

    move-result v81

    const v176, 0x7fffffff

    const/16 v177, 0x0

    const/4 v8, 0x0

    const/4 v13, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    const/16 v63, 0x0

    const/16 v64, 0x0

    const/16 v65, 0x0

    const/16 v66, 0x0

    const/16 v67, 0x0

    const/16 v68, 0x0

    const/16 v69, 0x0

    const/16 v70, 0x0

    const/16 v71, 0x0

    const/16 v72, 0x0

    const/16 v73, 0x0

    const/16 v74, 0x0

    const/16 v75, 0x0

    const/16 v76, 0x0

    const/16 v77, 0x0

    const/16 v78, 0x0

    const/16 v79, 0x0

    const/16 v80, 0x0

    const/16 v82, 0x0

    const/16 v83, 0x0

    const/16 v84, 0x0

    const/16 v85, 0x0

    const/16 v86, 0x0

    const/16 v87, 0x0

    const/16 v88, 0x0

    const/16 v89, 0x0

    const/16 v90, 0x0

    const/16 v91, 0x0

    const/16 v92, 0x0

    const/16 v93, 0x0

    const/16 v94, 0x0

    const/16 v95, 0x0

    const/16 v96, 0x0

    const/16 v97, 0x0

    const/16 v98, 0x0

    const/16 v99, 0x0

    const/16 v100, 0x0

    const/16 v101, 0x0

    const/16 v102, 0x0

    const/16 v103, 0x0

    const/16 v104, 0x0

    const/16 v105, 0x0

    const/16 v106, 0x0

    const/16 v107, 0x0

    const/16 v108, 0x0

    const/16 v109, 0x0

    const/16 v110, 0x0

    const/16 v111, 0x0

    const/16 v112, 0x0

    const/16 v113, 0x0

    const/16 v114, 0x0

    const/16 v115, 0x0

    const/16 v116, 0x0

    const/16 v117, 0x0

    const/16 v118, 0x0

    const/16 v119, 0x0

    const/16 v120, 0x0

    const/16 v121, 0x0

    const/16 v122, 0x0

    const/16 v123, 0x0

    const/16 v124, 0x0

    const/16 v125, 0x0

    const/16 v126, 0x0

    const/16 v127, 0x0

    const/16 v128, 0x0

    const/16 v129, 0x0

    const/16 v130, 0x0

    const/16 v131, 0x0

    const/16 v132, 0x0

    const/16 v133, 0x0

    const/16 v134, 0x0

    const/16 v135, 0x0

    const/16 v136, 0x0

    const/16 v137, 0x0

    const/16 v138, 0x0

    const/16 v139, 0x0

    const/16 v140, 0x0

    const/16 v141, 0x0

    const/16 v142, 0x0

    const/16 v143, 0x0

    const/16 v144, 0x0

    const/16 v145, 0x0

    const/16 v146, 0x0

    const/16 v147, 0x0

    const-wide/16 v148, 0x0

    const/16 v150, 0x0

    const/16 v151, 0x0

    const-wide/16 v152, 0x0

    const/16 v154, 0x0

    const/16 v155, 0x0

    const-wide/16 v156, 0x0

    const/16 v158, 0x0

    const/16 v159, 0x0

    const/16 v160, 0x0

    const/16 v161, 0x0

    const/16 v162, 0x0

    const/16 v163, 0x0

    const/16 v164, 0x0

    const/16 v165, 0x0

    const/16 v166, 0x0

    const/16 v167, 0x0

    const/16 v168, 0x0

    const/16 v169, 0x0

    const/16 v170, 0x0

    const/16 v171, 0x0

    const v172, -0x3fffff7

    const/16 v173, -0x1d

    const/16 v174, -0x81

    const/16 v175, -0x1

    move-object/from16 v7, p0

    .line 206
    invoke-direct/range {v7 .. v177}, Lcom/sma/smartv3/db/entity/Workout;-><init>(IJJLjava/lang/String;IIIIIIIIIIIIIIIIIIIIIIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIIFFIFIII[I[IIIIIIIIILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IIIIIIIIIIIIIIIIIIFIIF[I[FIIILjava/util/List;FFFFIIIIIIIIIIIIFFIIIIF[F[FIIIIIIIILjava/util/List;ILjava/util/List;IJIIJIIJIIIIIIFFIILjava/util/List;ILjava/lang/String;IIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/szabh/smable3/entity/BleWorkout3;J)V
    .locals 178
    .param p1    # Lcom/szabh/smable3/entity/BleWorkout3;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "bleWorkout"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 207
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMStart()I

    move-result v0

    const v2, 0x386d4380

    add-int/2addr v0, v2

    int-to-long v3, v0

    const-wide/16 v5, 0x3e8

    mul-long/2addr v3, v5

    sub-long v9, v3, p2

    .line 208
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMEnd()I

    move-result v0

    add-int/2addr v0, v2

    int-to-long v2, v0

    mul-long/2addr v2, v5

    sub-long v11, v2, p2

    .line 209
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMDuration()I

    move-result v14

    .line 210
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMAltitude()I

    move-result v15

    .line 211
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMAirPressure()I

    move-result v16

    .line 212
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMSpm()I

    move-result v17

    .line 213
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMMode()I

    move-result v18

    .line 214
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMStep()I

    move-result v19

    .line 215
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMDistance()I

    move-result v20

    .line 216
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMCalorie()I

    move-result v21

    .line 217
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMSpeed()I

    move-result v22

    .line 218
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMPace()I

    move-result v23

    .line 219
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMAvgBpm()I

    move-result v24

    .line 220
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMMaxBpm()I

    move-result v25

    .line 221
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMMinBpm()I

    move-result v26

    .line 222
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMMaxSpm()I

    move-result v27

    .line 223
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMMinSpm()I

    move-result v28

    .line 224
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMMaxPace()I

    move-result v29

    .line 225
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMMinPace()I

    move-result v30

    .line 226
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMMaxAltitude()I

    move-result v31

    .line 227
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMMinAltitude()I

    move-result v32

    .line 228
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMMinStress()I

    move-result v33

    .line 229
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMMaxStress()I

    move-result v34

    .line 230
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMAvgStress()I

    move-result v35

    .line 231
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMMaxSpeed()I

    move-result v44

    .line 232
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMMinSpeed()I

    move-result v45

    .line 233
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMMetTotal()I

    move-result v49

    .line 234
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMAerobic()F

    move-result v50

    .line 235
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMAnaerobic()F

    move-result v51

    .line 236
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMStamina()I

    move-result v52

    .line 237
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMAvgSpeed()F

    move-result v53

    .line 238
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMCadence()I

    move-result v54

    .line 239
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMMaxCadence()I

    move-result v55

    .line 240
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMCnt()I

    move-result v56

    .line 241
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMBpmZoneCount()[I

    move-result-object v57

    .line 242
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMPersonalZone()[I

    move-result-object v58

    .line 243
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMLactateThresholdPace()I

    move-result v59

    .line 244
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMRecoveryTime()I

    move-result v60

    .line 245
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMTrainingLoad()I

    move-result v61

    .line 246
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMMaxVO2()I

    move-result v62

    .line 247
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMLactateThresholdHr()I

    move-result v63

    .line 248
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMAlgorithmMarking()I

    move-result v64

    .line 249
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMPathCount()I

    move-result v65

    .line 250
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMPathSampleInterval()I

    move-result v66

    .line 251
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMPathPoints()Ljava/util/List;

    move-result-object v67

    .line 252
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMHrPathCount()I

    move-result v68

    .line 253
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMHrPathSampleInterval()I

    move-result v69

    .line 254
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMHrPathPoints()Ljava/util/List;

    move-result-object v70

    .line 255
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMPacePathCount()I

    move-result v71

    .line 256
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMPacePathSampleInterval()I

    move-result v72

    .line 257
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMPacePathPoints()Ljava/util/List;

    move-result-object v73

    .line 258
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMSpeedPathCount()I

    move-result v74

    .line 259
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMSpeedPathSampleInterval()I

    move-result v75

    .line 260
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMSpeedPathPoints()Ljava/util/List;

    move-result-object v76

    .line 261
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMCadencePathCount()I

    move-result v77

    .line 262
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMCadencePathSampleInterval()I

    move-result v78

    .line 263
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMCadencePathPoints()Ljava/util/List;

    move-result-object v79

    .line 264
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMAltitudePathCount()I

    move-result v80

    .line 265
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMAltitudePathSampleInterval()I

    move-result v81

    .line 266
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout3;->getMAltitudePathPoints()Ljava/util/List;

    move-result-object v82

    const v176, 0x7fffffff

    const/16 v177, 0x0

    const/4 v8, 0x0

    const/4 v13, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x1

    const/16 v83, 0x0

    const/16 v84, 0x0

    const/16 v85, 0x0

    const/16 v86, 0x0

    const/16 v87, 0x0

    const/16 v88, 0x0

    const/16 v89, 0x0

    const/16 v90, 0x0

    const/16 v91, 0x0

    const/16 v92, 0x0

    const/16 v93, 0x0

    const/16 v94, 0x0

    const/16 v95, 0x0

    const/16 v96, 0x0

    const/16 v97, 0x0

    const/16 v98, 0x0

    const/16 v99, 0x0

    const/16 v100, 0x0

    const/16 v101, 0x0

    const/16 v102, 0x0

    const/16 v103, 0x0

    const/16 v104, 0x0

    const/16 v105, 0x0

    const/16 v106, 0x0

    const/16 v107, 0x0

    const/16 v108, 0x0

    const/16 v109, 0x0

    const/16 v110, 0x0

    const/16 v111, 0x0

    const/16 v112, 0x0

    const/16 v113, 0x0

    const/16 v114, 0x0

    const/16 v115, 0x0

    const/16 v116, 0x0

    const/16 v117, 0x0

    const/16 v118, 0x0

    const/16 v119, 0x0

    const/16 v120, 0x0

    const/16 v121, 0x0

    const/16 v122, 0x0

    const/16 v123, 0x0

    const/16 v124, 0x0

    const/16 v125, 0x0

    const/16 v126, 0x0

    const/16 v127, 0x0

    const/16 v128, 0x0

    const/16 v129, 0x0

    const/16 v130, 0x0

    const/16 v131, 0x0

    const/16 v132, 0x0

    const/16 v133, 0x0

    const/16 v134, 0x0

    const/16 v135, 0x0

    const/16 v136, 0x0

    const/16 v137, 0x0

    const/16 v138, 0x0

    const/16 v139, 0x0

    const/16 v140, 0x0

    const/16 v141, 0x0

    const/16 v142, 0x0

    const/16 v143, 0x0

    const/16 v144, 0x0

    const/16 v145, 0x0

    const/16 v146, 0x0

    const/16 v147, 0x0

    const-wide/16 v148, 0x0

    const/16 v150, 0x0

    const/16 v151, 0x0

    const-wide/16 v152, 0x0

    const/16 v154, 0x0

    const/16 v155, 0x0

    const-wide/16 v156, 0x0

    const/16 v158, 0x0

    const/16 v159, 0x0

    const/16 v160, 0x0

    const/16 v161, 0x0

    const/16 v162, 0x0

    const/16 v163, 0x0

    const/16 v164, 0x0

    const/16 v165, 0x0

    const/16 v166, 0x0

    const/16 v167, 0x0

    const/16 v168, 0x0

    const/16 v169, 0x0

    const/16 v170, 0x0

    const/16 v171, 0x0

    const v172, -0x3fffff7

    const/16 v173, 0x33

    const/16 v174, -0x200

    const/16 v175, -0x1

    move-object/from16 v7, p0

    .line 267
    invoke-direct/range {v7 .. v177}, Lcom/sma/smartv3/db/entity/Workout;-><init>(IJJLjava/lang/String;IIIIIIIIIIIIIIIIIIIIIIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIIFFIFIII[I[IIIIIIIIILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IIIIIIIIIIIIIIIIIIFIIF[I[FIIILjava/util/List;FFFFIIIIIIIIIIIIFFIIIIF[F[FIIIIIIIILjava/util/List;ILjava/util/List;IJIIJIIJIIIIIIFFIILjava/util/List;ILjava/lang/String;IIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/szabh/smable3/entity/BleWorkout4;J)V
    .locals 178
    .param p1    # Lcom/szabh/smable3/entity/BleWorkout4;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "bleWorkout"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 268
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMStart()I

    move-result v0

    const v2, 0x386d4380

    add-int/2addr v0, v2

    int-to-long v3, v0

    const-wide/16 v5, 0x3e8

    mul-long/2addr v3, v5

    sub-long v9, v3, p2

    .line 269
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMEnd()I

    move-result v0

    add-int/2addr v0, v2

    int-to-long v3, v0

    mul-long/2addr v3, v5

    sub-long v11, v3, p2

    .line 270
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMDuration()I

    move-result v14

    .line 271
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMAltitude()I

    move-result v15

    .line 272
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMAirPressure()I

    move-result v16

    .line 273
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMSpm()I

    move-result v17

    .line 274
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMMode()I

    move-result v18

    .line 275
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMStep()I

    move-result v19

    .line 276
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMDistance()I

    move-result v20

    .line 277
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMCalorie()I

    move-result v21

    .line 278
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMSpeed()F

    move-result v0

    const/16 v3, 0x3e8

    int-to-float v3, v3

    mul-float/2addr v0, v3

    float-to-int v0, v0

    .line 279
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMPace()I

    move-result v23

    .line 280
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMAvgBpm()I

    move-result v24

    .line 281
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMMaxBpm()I

    move-result v25

    .line 282
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMMinBpm()I

    move-result v26

    .line 283
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMMaxSpm()I

    move-result v27

    .line 284
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMMinSpm()I

    move-result v28

    .line 285
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMMaxPace()I

    move-result v29

    .line 286
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMMinPace()I

    move-result v30

    .line 287
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMMaxAltitude()I

    move-result v31

    .line 288
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMMinAltitude()I

    move-result v32

    .line 289
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMMinStress()I

    move-result v33

    .line 290
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMMaxStress()I

    move-result v34

    .line 291
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMAvgStress()I

    move-result v35

    .line 292
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMMaxSpeed()F

    move-result v4

    float-to-int v4, v4

    .line 293
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMMinSpeed()F

    move-result v7

    mul-float/2addr v7, v3

    float-to-int v7, v7

    .line 294
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMAvgSpeed()F

    move-result v8

    mul-float v53, v8, v3

    .line 295
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMMetTotal()F

    move-result v8

    float-to-int v8, v8

    .line 296
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMAerobic()F

    move-result v50

    .line 297
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMAnaerobic()F

    move-result v51

    .line 298
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMStamina()F

    move-result v13

    float-to-int v13, v13

    .line 299
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMCadence()F

    move-result v22

    move/from16 v36, v2

    mul-float v2, v22, v3

    float-to-int v2, v2

    .line 300
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMMaxCadence()I

    move-result v55

    .line 301
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMCnt()I

    move-result v56

    .line 302
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMBpmZoneCount()[I

    move-result-object v57

    .line 303
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMPersonalZone()[I

    move-result-object v58

    .line 304
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMLactateThresholdPace()I

    move-result v59

    .line 305
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMRecoveryTime()I

    move-result v60

    .line 306
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMTrainingLoad()I

    move-result v61

    .line 307
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMMaxVO2()I

    move-result v62

    .line 308
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMLactateThresholdHr()I

    move-result v63

    .line 309
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMPathCount()I

    move-result v65

    .line 310
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMPathSampleInterval()I

    move-result v66

    .line 311
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMPathPoints()Ljava/util/List;

    move-result-object v67

    .line 312
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMHrPathCount()I

    move-result v68

    .line 313
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMHrPathSampleInterval()I

    move-result v69

    .line 314
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMHrPathPoints()Ljava/util/List;

    move-result-object v70

    .line 315
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMPacePathCount()I

    move-result v71

    .line 316
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMPacePathSampleInterval()I

    move-result v72

    .line 317
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMPacePathPoints()Ljava/util/List;

    move-result-object v73

    .line 318
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMSpeedPathCount()I

    move-result v74

    .line 319
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMSpeedPathSampleInterval()I

    move-result v75

    .line 320
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMSpeedPathPoints()Ljava/util/List;

    move-result-object v76

    .line 321
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMCadencePathCount()I

    move-result v77

    .line 322
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMCadencePathSampleInterval()I

    move-result v78

    .line 323
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMCadencePathPoints()Ljava/util/List;

    move-result-object v79

    .line 324
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMAltitudePathCount()I

    move-result v80

    .line 325
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMAltitudePathSampleInterval()I

    move-result v81

    .line 326
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMAltitudePathPoints()Ljava/util/List;

    move-result-object v82

    .line 327
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMPausedDuration()I

    move-result v86

    .line 328
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMCurBpm()I

    move-result v87

    .line 329
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMAscendAltitude()I

    move-result v88

    .line 330
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMDescendAltitude()I

    move-result v89

    .line 331
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMCurStress()I

    move-result v90

    .line 332
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMSwimType()I

    move-result v91

    .line 333
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMCntFore()I

    move-result v92

    .line 334
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMCntBack()I

    move-result v93

    .line 335
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMBackSwingTime()I

    move-result v94

    .line 336
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMDownSwingTime()I

    move-result v95

    .line 337
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMDribbleTime()I

    move-result v96

    .line 338
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMTripCount()I

    move-result v97

    .line 339
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMSessionCount()I

    move-result v98

    .line 340
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMVerticalOscillation()F

    move-result v22

    move-wide/from16 v37, v5

    const/16 v5, 0x64

    int-to-float v5, v5

    mul-float v5, v5, v22

    float-to-int v5, v5

    .line 341
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMRunPowerWatt()I

    move-result v100

    .line 342
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMStepLen()F

    move-result v101

    .line 343
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMTrainingStatus()I

    move-result v102

    .line 344
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMFitnessAge()I

    move-result v103

    .line 345
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMBestRunTime()[I

    move-result-object v105

    .line 346
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMFitnessLevel()[F

    move-result-object v106

    .line 347
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMTlTrend()F

    move-result v104

    .line 348
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMCalorieTotal()F

    move-result v6

    mul-float/2addr v6, v3

    float-to-int v3, v6

    .line 349
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMPowerCount()I

    move-result v108

    .line 350
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMPowerInterval()I

    move-result v109

    .line 351
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMPowerPoints()Ljava/util/List;

    move-result-object v110

    .line 352
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getRealTimeAerobic()F

    move-result v111

    .line 353
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getRealTimeAnaerobic()F

    move-result v112

    .line 354
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMFatTotal()F

    move-result v113

    .line 355
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMCarboTotal()F

    move-result v114

    .line 356
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMNavigatorTargetTime()I

    move-result v115

    .line 357
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMNavigatorActualTime()I

    move-result v116

    .line 358
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMNavigatorDifferenceTime()I

    move-result v117

    .line 359
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMNavigatorStatusTime()I

    move-result v118

    .line 360
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMNavigatorTargetDistance()I

    move-result v119

    .line 361
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMNavigatorActualDistance()I

    move-result v120

    .line 362
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMNavigatorDifferenceDistance()I

    move-result v121

    .line 363
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMNavigatorStatusDistance()I

    move-result v122

    .line 364
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMNavigatorTargetPace()I

    move-result v123

    .line 365
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMNavigatorActualPace()I

    move-result v124

    .line 366
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMNavigatorDifferencePace()I

    move-result v125

    .line 367
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMNavigatorStatusPace()I

    move-result v126

    .line 368
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMNavigatorTargetSpeed()F

    move-result v127

    .line 369
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMNavigatorActualSpeed()F

    move-result v128

    .line 370
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMNavigatorDifferenceSpeed()I

    move-result v131

    .line 371
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMNavigatorStatusSpeed()I

    move-result v132

    .line 372
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMMaxOxygenPower()F

    move-result v133

    .line 373
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMTrendWeek()[F

    move-result-object v134

    .line 374
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMCyclingIndex()[F

    move-result-object v135

    .line 375
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMStaBalance()I

    move-result v136

    .line 376
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMSpmPathPointsCount()I

    move-result v143

    .line 377
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMSpmPathPointsPoints()Ljava/util/List;

    move-result-object v144

    .line 378
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMStepLenCount()I

    move-result v145

    .line 379
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMStepLenPoints()Ljava/util/List;

    move-result-object v146

    .line 380
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMCntLap()I

    move-result v138

    .line 381
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMFrontCrawlPerc()I

    move-result v139

    .line 382
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMBreaststrokePerc()I

    move-result v140

    .line 383
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMBackstrokePerc()I

    move-result v141

    .line 384
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMButterflyPerc()I

    move-result v142

    .line 385
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMEllipticalSteps()I

    move-result v147

    .line 386
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMChildSwimStartTime()I

    move-result v6

    add-int v6, v6, v36

    move/from16 v22, v0

    int-to-long v0, v6

    mul-long v0, v0, v37

    sub-long v148, v0, p2

    .line 387
    invoke-virtual/range {p1 .. p1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMChildSwimDuration()I

    move-result v150

    .line 388
    invoke-virtual/range {p1 .. p1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMChildSwimDistance()I

    move-result v151

    .line 389
    invoke-virtual/range {p1 .. p1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMChildCyclingStartTime()I

    move-result v0

    add-int v0, v0, v36

    int-to-long v0, v0

    mul-long v0, v0, v37

    sub-long v152, v0, p2

    .line 390
    invoke-virtual/range {p1 .. p1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMChildCyclingDuration()I

    move-result v154

    .line 391
    invoke-virtual/range {p1 .. p1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMChildCyclingDistance()I

    move-result v155

    .line 392
    invoke-virtual/range {p1 .. p1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMChildRunStartTime()I

    move-result v0

    add-int v0, v0, v36

    int-to-long v0, v0

    mul-long v0, v0, v37

    sub-long v156, v0, p2

    .line 393
    invoke-virtual/range {p1 .. p1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMChildRunDuration()I

    move-result v158

    .line 394
    invoke-virtual/range {p1 .. p1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMChildRunDistance()I

    move-result v159

    .line 395
    invoke-virtual/range {p1 .. p1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMChildNumber()I

    move-result v163

    .line 396
    invoke-virtual/range {p1 .. p1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMSwimSwolf()I

    move-result v137

    .line 397
    invoke-virtual/range {p1 .. p1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMChildSwimMode()I

    move-result v160

    .line 398
    invoke-virtual/range {p1 .. p1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMChildCyclingMode()I

    move-result v161

    .line 399
    invoke-virtual/range {p1 .. p1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMChildRunMode()I

    move-result v162

    .line 400
    invoke-virtual/range {p1 .. p1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMRunLactateAvg()F

    move-result v164

    .line 401
    invoke-virtual/range {p1 .. p1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMCyclingLactateAvg()F

    move-result v165

    .line 402
    invoke-virtual/range {p1 .. p1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMWorkoutFlag()I

    move-result v166

    .line 403
    invoke-virtual/range {p1 .. p1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMRecoveryHrCount()I

    move-result v167

    .line 404
    invoke-virtual/range {p1 .. p1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMRecoveryHrPoints()Ljava/util/List;

    move-result-object v168

    .line 405
    invoke-virtual/range {p1 .. p1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMSwimPoolLength()I

    move-result v169

    .line 406
    invoke-virtual/range {p1 .. p1}, Lcom/szabh/smable3/entity/BleWorkout4;->getMAICoachSportID()I

    move-result v171

    const/high16 v176, 0x20000000

    const/16 v177, 0x0

    move/from16 v49, v8

    const/4 v8, 0x0

    move/from16 v52, v13

    const/4 v13, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x4

    const/16 v64, 0x0

    const/16 v83, 0x0

    const/16 v84, 0x0

    const/16 v85, 0x0

    const/16 v129, 0x0

    const/16 v130, 0x0

    const/16 v170, 0x0

    const v172, -0x3fffff7

    const v173, 0x400033

    const/16 v174, 0xe00

    const/high16 v175, 0x1800000

    move/from16 v54, v2

    move/from16 v107, v3

    move/from16 v44, v4

    move/from16 v99, v5

    move/from16 v45, v7

    move-object/from16 v7, p0

    .line 407
    invoke-direct/range {v7 .. v177}, Lcom/sma/smartv3/db/entity/Workout;-><init>(IJJLjava/lang/String;IIIIIIIIIIIIIIIIIIIIIIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIIFFIFIII[I[IIIIIIIIILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IIIIIIIIIIIIIIIIIIFIIF[I[FIIILjava/util/List;FFFFIIIIIIIIIIIIFFIIIIF[F[FIIIIIIIILjava/util/List;ILjava/util/List;IJIIJIIJIIIIIIFFIILjava/util/List;ILjava/lang/String;IIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/szabh/smable3/entity/BleWorkout;J)V
    .locals 178
    .param p1    # Lcom/szabh/smable3/entity/BleWorkout;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "bleWorkout"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 163
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout;->getMStart()I

    move-result v0

    const v2, 0x386d4380

    add-int/2addr v0, v2

    int-to-long v3, v0

    const-wide/16 v5, 0x3e8

    mul-long/2addr v3, v5

    sub-long v9, v3, p2

    .line 164
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout;->getMEnd()I

    move-result v0

    add-int/2addr v0, v2

    int-to-long v2, v0

    mul-long/2addr v2, v5

    sub-long v11, v2, p2

    .line 165
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout;->getMDuration()I

    move-result v14

    .line 166
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout;->getMAltitude()I

    move-result v15

    .line 167
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout;->getMAirPressure()I

    move-result v16

    .line 168
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout;->getMSpm()I

    move-result v17

    .line 169
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout;->getMMode()I

    move-result v18

    .line 170
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout;->getMStep()I

    move-result v19

    .line 171
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout;->getMDistance()I

    move-result v20

    .line 172
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout;->getMCalorie()I

    move-result v21

    .line 173
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout;->getMSpeed()I

    move-result v22

    .line 174
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout;->getMPace()I

    move-result v23

    .line 175
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout;->getMAvgBpm()I

    move-result v24

    .line 176
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWorkout;->getMMaxBpm()I

    move-result v25

    const v176, 0x7fffffff

    const/16 v177, 0x0

    const/4 v8, 0x0

    const/4 v13, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    const/16 v63, 0x0

    const/16 v64, 0x0

    const/16 v65, 0x0

    const/16 v66, 0x0

    const/16 v67, 0x0

    const/16 v68, 0x0

    const/16 v69, 0x0

    const/16 v70, 0x0

    const/16 v71, 0x0

    const/16 v72, 0x0

    const/16 v73, 0x0

    const/16 v74, 0x0

    const/16 v75, 0x0

    const/16 v76, 0x0

    const/16 v77, 0x0

    const/16 v78, 0x0

    const/16 v79, 0x0

    const/16 v80, 0x0

    const/16 v81, 0x0

    const/16 v82, 0x0

    const/16 v83, 0x0

    const/16 v84, 0x0

    const/16 v85, 0x0

    const/16 v86, 0x0

    const/16 v87, 0x0

    const/16 v88, 0x0

    const/16 v89, 0x0

    const/16 v90, 0x0

    const/16 v91, 0x0

    const/16 v92, 0x0

    const/16 v93, 0x0

    const/16 v94, 0x0

    const/16 v95, 0x0

    const/16 v96, 0x0

    const/16 v97, 0x0

    const/16 v98, 0x0

    const/16 v99, 0x0

    const/16 v100, 0x0

    const/16 v101, 0x0

    const/16 v102, 0x0

    const/16 v103, 0x0

    const/16 v104, 0x0

    const/16 v105, 0x0

    const/16 v106, 0x0

    const/16 v107, 0x0

    const/16 v108, 0x0

    const/16 v109, 0x0

    const/16 v110, 0x0

    const/16 v111, 0x0

    const/16 v112, 0x0

    const/16 v113, 0x0

    const/16 v114, 0x0

    const/16 v115, 0x0

    const/16 v116, 0x0

    const/16 v117, 0x0

    const/16 v118, 0x0

    const/16 v119, 0x0

    const/16 v120, 0x0

    const/16 v121, 0x0

    const/16 v122, 0x0

    const/16 v123, 0x0

    const/16 v124, 0x0

    const/16 v125, 0x0

    const/16 v126, 0x0

    const/16 v127, 0x0

    const/16 v128, 0x0

    const/16 v129, 0x0

    const/16 v130, 0x0

    const/16 v131, 0x0

    const/16 v132, 0x0

    const/16 v133, 0x0

    const/16 v134, 0x0

    const/16 v135, 0x0

    const/16 v136, 0x0

    const/16 v137, 0x0

    const/16 v138, 0x0

    const/16 v139, 0x0

    const/16 v140, 0x0

    const/16 v141, 0x0

    const/16 v142, 0x0

    const/16 v143, 0x0

    const/16 v144, 0x0

    const/16 v145, 0x0

    const/16 v146, 0x0

    const/16 v147, 0x0

    const-wide/16 v148, 0x0

    const/16 v150, 0x0

    const/16 v151, 0x0

    const-wide/16 v152, 0x0

    const/16 v154, 0x0

    const/16 v155, 0x0

    const-wide/16 v156, 0x0

    const/16 v158, 0x0

    const/16 v159, 0x0

    const/16 v160, 0x0

    const/16 v161, 0x0

    const/16 v162, 0x0

    const/16 v163, 0x0

    const/16 v164, 0x0

    const/16 v165, 0x0

    const/16 v166, 0x0

    const/16 v167, 0x0

    const/16 v168, 0x0

    const/16 v169, 0x0

    const/16 v170, 0x0

    const/16 v171, 0x0

    const v172, -0xfff7

    const/16 v173, -0x1

    const/16 v174, -0x1

    const/16 v175, -0x1

    move-object/from16 v7, p0

    .line 177
    invoke-direct/range {v7 .. v177}, Lcom/sma/smartv3/db/entity/Workout;-><init>(IJJLjava/lang/String;IIIIIIIIIIIIIIIIIIIIIIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIIFFIFIII[I[IIIIIIIIILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IIIIIIIIIIIIIIIIIIFIIF[I[FIIILjava/util/List;FFFFIIIIIIIIIIIIFFIIIIF[F[FIIIIIIIILjava/util/List;ILjava/util/List;IJIIJIIJIIIIIIFFIILjava/util/List;ILjava/lang/String;IIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/db/entity/Workout;IJJLjava/lang/String;IIIIIIIIIIIIIIIIIIIIIIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIIFFIFIII[I[IIIIIIIIILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IIIIIIIIIIIIIIIIIIFIIF[I[FIIILjava/util/List;FFFFIIIIIIIIIIIIFFIIIIF[F[FIIIIIIIILjava/util/List;ILjava/util/List;IJIIJIIJIIIIIIFFIILjava/util/List;ILjava/lang/String;IIIIIILjava/lang/Object;)Lcom/sma/smartv3/db/entity/Workout;
    .locals 24

    move-object/from16 v0, p0

    move/from16 v1, p165

    move/from16 v2, p166

    move/from16 v3, p167

    move/from16 v4, p168

    move/from16 v5, p169

    and-int/lit8 v6, v1, 0x1

    if-eqz v6, :cond_0

    iget v6, v0, Lcom/sma/smartv3/db/entity/Workout;->mId:I

    goto :goto_0

    :cond_0
    move/from16 v6, p1

    :goto_0
    and-int/lit8 v7, v1, 0x2

    if-eqz v7, :cond_1

    iget-wide v7, v0, Lcom/sma/smartv3/db/entity/Workout;->mStart:J

    goto :goto_1

    :cond_1
    move-wide/from16 v7, p2

    :goto_1
    and-int/lit8 v9, v1, 0x4

    if-eqz v9, :cond_2

    iget-wide v9, v0, Lcom/sma/smartv3/db/entity/Workout;->mEnd:J

    goto :goto_2

    :cond_2
    move-wide/from16 v9, p4

    :goto_2
    and-int/lit8 v11, v1, 0x8

    if-eqz v11, :cond_3

    iget-object v11, v0, Lcom/sma/smartv3/db/entity/Workout;->mLocalTime:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v11, p6

    :goto_3
    and-int/lit8 v12, v1, 0x10

    if-eqz v12, :cond_4

    iget v12, v0, Lcom/sma/smartv3/db/entity/Workout;->mDuration:I

    goto :goto_4

    :cond_4
    move/from16 v12, p7

    :goto_4
    and-int/lit8 v13, v1, 0x20

    if-eqz v13, :cond_5

    iget v13, v0, Lcom/sma/smartv3/db/entity/Workout;->mAltitude:I

    goto :goto_5

    :cond_5
    move/from16 v13, p8

    :goto_5
    and-int/lit8 v14, v1, 0x40

    if-eqz v14, :cond_6

    iget v14, v0, Lcom/sma/smartv3/db/entity/Workout;->mAirPressure:I

    goto :goto_6

    :cond_6
    move/from16 v14, p9

    :goto_6
    and-int/lit16 v15, v1, 0x80

    if-eqz v15, :cond_7

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mSpm:I

    goto :goto_7

    :cond_7
    move/from16 v15, p10

    :goto_7
    move/from16 p1, v6

    and-int/lit16 v6, v1, 0x100

    if-eqz v6, :cond_8

    iget v6, v0, Lcom/sma/smartv3/db/entity/Workout;->mMode:I

    goto :goto_8

    :cond_8
    move/from16 v6, p11

    :goto_8
    move/from16 p2, v6

    and-int/lit16 v6, v1, 0x200

    if-eqz v6, :cond_9

    iget v6, v0, Lcom/sma/smartv3/db/entity/Workout;->mStep:I

    goto :goto_9

    :cond_9
    move/from16 v6, p12

    :goto_9
    move/from16 p3, v6

    and-int/lit16 v6, v1, 0x400

    if-eqz v6, :cond_a

    iget v6, v0, Lcom/sma/smartv3/db/entity/Workout;->mDistance:I

    goto :goto_a

    :cond_a
    move/from16 v6, p13

    :goto_a
    move/from16 p4, v6

    and-int/lit16 v6, v1, 0x800

    if-eqz v6, :cond_b

    iget v6, v0, Lcom/sma/smartv3/db/entity/Workout;->mCalorie:I

    goto :goto_b

    :cond_b
    move/from16 v6, p14

    :goto_b
    move/from16 p5, v6

    and-int/lit16 v6, v1, 0x1000

    if-eqz v6, :cond_c

    iget v6, v0, Lcom/sma/smartv3/db/entity/Workout;->mSpeed:I

    goto :goto_c

    :cond_c
    move/from16 v6, p15

    :goto_c
    move/from16 p6, v6

    and-int/lit16 v6, v1, 0x2000

    if-eqz v6, :cond_d

    iget v6, v0, Lcom/sma/smartv3/db/entity/Workout;->mPace:I

    goto :goto_d

    :cond_d
    move/from16 v6, p16

    :goto_d
    move/from16 p7, v6

    and-int/lit16 v6, v1, 0x4000

    if-eqz v6, :cond_e

    iget v6, v0, Lcom/sma/smartv3/db/entity/Workout;->mAvgBpm:I

    goto :goto_e

    :cond_e
    move/from16 v6, p17

    :goto_e
    const v16, 0x8000

    and-int v17, v1, v16

    if-eqz v17, :cond_f

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mMaxBpm:I

    goto :goto_f

    :cond_f
    move/from16 v1, p18

    :goto_f
    const/high16 v17, 0x10000

    and-int v18, p165, v17

    move/from16 p8, v1

    if-eqz v18, :cond_10

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mMinBpm:I

    goto :goto_10

    :cond_10
    move/from16 v1, p19

    :goto_10
    const/high16 v18, 0x20000

    and-int v19, p165, v18

    move/from16 p9, v1

    if-eqz v19, :cond_11

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mMaxSpm:I

    goto :goto_11

    :cond_11
    move/from16 v1, p20

    :goto_11
    const/high16 v19, 0x40000

    and-int v20, p165, v19

    move/from16 p10, v1

    if-eqz v20, :cond_12

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mMinSpm:I

    goto :goto_12

    :cond_12
    move/from16 v1, p21

    :goto_12
    const/high16 v20, 0x80000

    and-int v21, p165, v20

    move/from16 p11, v1

    if-eqz v21, :cond_13

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mMaxPace:I

    goto :goto_13

    :cond_13
    move/from16 v1, p22

    :goto_13
    const/high16 v21, 0x100000

    and-int v22, p165, v21

    move/from16 p12, v1

    if-eqz v22, :cond_14

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mMinPace:I

    goto :goto_14

    :cond_14
    move/from16 v1, p23

    :goto_14
    const/high16 v22, 0x200000

    and-int v23, p165, v22

    move/from16 p13, v1

    if-eqz v23, :cond_15

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mMaxAltitude:I

    goto :goto_15

    :cond_15
    move/from16 v1, p24

    :goto_15
    const/high16 v23, 0x400000

    and-int v23, p165, v23

    move/from16 p14, v1

    if-eqz v23, :cond_16

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mMinAltitude:I

    goto :goto_16

    :cond_16
    move/from16 v1, p25

    :goto_16
    const/high16 v23, 0x800000

    and-int v23, p165, v23

    move/from16 p15, v1

    if-eqz v23, :cond_17

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mMinStress:I

    goto :goto_17

    :cond_17
    move/from16 v1, p26

    :goto_17
    const/high16 v23, 0x1000000

    and-int v23, p165, v23

    move/from16 p16, v1

    if-eqz v23, :cond_18

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mMaxStress:I

    goto :goto_18

    :cond_18
    move/from16 v1, p27

    :goto_18
    const/high16 v23, 0x2000000

    and-int v23, p165, v23

    move/from16 p17, v1

    if-eqz v23, :cond_19

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mAvgStress:I

    goto :goto_19

    :cond_19
    move/from16 v1, p28

    :goto_19
    const/high16 v23, 0x4000000

    and-int v23, p165, v23

    move/from16 p18, v1

    if-eqz v23, :cond_1a

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mSource:I

    goto :goto_1a

    :cond_1a
    move/from16 v1, p29

    :goto_1a
    const/high16 v23, 0x8000000

    and-int v23, p165, v23

    move/from16 p19, v1

    if-eqz v23, :cond_1b

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mIsSync:I

    goto :goto_1b

    :cond_1b
    move/from16 v1, p30

    :goto_1b
    const/high16 v23, 0x10000000

    and-int v23, p165, v23

    move/from16 p20, v1

    if-eqz v23, :cond_1c

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mIsDelete:I

    goto :goto_1c

    :cond_1c
    move/from16 v1, p31

    :goto_1c
    const/high16 v23, 0x20000000

    and-int v23, p165, v23

    move/from16 p21, v1

    if-eqz v23, :cond_1d

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mFeel:I

    goto :goto_1d

    :cond_1d
    move/from16 v1, p32

    :goto_1d
    const/high16 v23, 0x40000000    # 2.0f

    and-int v23, p165, v23

    move/from16 p22, v1

    if-eqz v23, :cond_1e

    iget-object v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mPrototype:Ljava/lang/String;

    goto :goto_1e

    :cond_1e
    move-object/from16 v1, p33

    :goto_1e
    const/high16 v23, -0x80000000

    and-int v23, p165, v23

    move-object/from16 p23, v1

    if-eqz v23, :cond_1f

    iget-object v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mFirmwareFlag:Ljava/lang/String;

    goto :goto_1f

    :cond_1f
    move-object/from16 v1, p34

    :goto_1f
    and-int/lit8 v23, v2, 0x1

    move-object/from16 p24, v1

    if-eqz v23, :cond_20

    iget-object v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mBleName:Ljava/lang/String;

    goto :goto_20

    :cond_20
    move-object/from16 v1, p35

    :goto_20
    and-int/lit8 v23, v2, 0x2

    move-object/from16 p25, v1

    if-eqz v23, :cond_21

    iget-object v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mPlatform:Ljava/lang/String;

    goto :goto_21

    :cond_21
    move-object/from16 v1, p36

    :goto_21
    and-int/lit8 v23, v2, 0x4

    move-object/from16 p26, v1

    if-eqz v23, :cond_22

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mMaxSpeed:I

    goto :goto_22

    :cond_22
    move/from16 v1, p37

    :goto_22
    and-int/lit8 v23, v2, 0x8

    move/from16 p27, v1

    if-eqz v23, :cond_23

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mMinSpeed:I

    goto :goto_23

    :cond_23
    move/from16 v1, p38

    :goto_23
    and-int/lit8 v23, v2, 0x10

    move/from16 p28, v1

    if-eqz v23, :cond_24

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mRestDuration:I

    goto :goto_24

    :cond_24
    move/from16 v1, p39

    :goto_24
    and-int/lit8 v23, v2, 0x20

    move/from16 p29, v1

    if-eqz v23, :cond_25

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mAGpsType:I

    goto :goto_25

    :cond_25
    move/from16 v1, p40

    :goto_25
    and-int/lit8 v23, v2, 0x40

    move/from16 p30, v1

    if-eqz v23, :cond_26

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mType:I

    goto :goto_26

    :cond_26
    move/from16 v1, p41

    :goto_26
    move/from16 p31, v1

    and-int/lit16 v1, v2, 0x80

    if-eqz v1, :cond_27

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mMetTotal:I

    goto :goto_27

    :cond_27
    move/from16 v1, p42

    :goto_27
    move/from16 p32, v1

    and-int/lit16 v1, v2, 0x100

    if-eqz v1, :cond_28

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mAerobic:F

    goto :goto_28

    :cond_28
    move/from16 v1, p43

    :goto_28
    move/from16 p33, v1

    and-int/lit16 v1, v2, 0x200

    if-eqz v1, :cond_29

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mAnaerobic:F

    goto :goto_29

    :cond_29
    move/from16 v1, p44

    :goto_29
    move/from16 p34, v1

    and-int/lit16 v1, v2, 0x400

    if-eqz v1, :cond_2a

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mStamina:I

    goto :goto_2a

    :cond_2a
    move/from16 v1, p45

    :goto_2a
    move/from16 p35, v1

    and-int/lit16 v1, v2, 0x800

    if-eqz v1, :cond_2b

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mAvgSpeed:F

    goto :goto_2b

    :cond_2b
    move/from16 v1, p46

    :goto_2b
    move/from16 p36, v1

    and-int/lit16 v1, v2, 0x1000

    if-eqz v1, :cond_2c

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mCadence:I

    goto :goto_2c

    :cond_2c
    move/from16 v1, p47

    :goto_2c
    move/from16 p37, v1

    and-int/lit16 v1, v2, 0x2000

    if-eqz v1, :cond_2d

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mMaxCadence:I

    goto :goto_2d

    :cond_2d
    move/from16 v1, p48

    :goto_2d
    move/from16 p38, v1

    and-int/lit16 v1, v2, 0x4000

    if-eqz v1, :cond_2e

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mCnt:I

    goto :goto_2e

    :cond_2e
    move/from16 v1, p49

    :goto_2e
    and-int v23, v2, v16

    move/from16 p39, v1

    if-eqz v23, :cond_2f

    iget-object v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mBpmZoneCount:[I

    goto :goto_2f

    :cond_2f
    move-object/from16 v1, p50

    :goto_2f
    and-int v23, v2, v17

    move-object/from16 p40, v1

    if-eqz v23, :cond_30

    iget-object v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mPersonalZone:[I

    goto :goto_30

    :cond_30
    move-object/from16 v1, p51

    :goto_30
    and-int v23, v2, v18

    move-object/from16 p41, v1

    if-eqz v23, :cond_31

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mLactateThresholdPace:I

    goto :goto_31

    :cond_31
    move/from16 v1, p52

    :goto_31
    and-int v23, v2, v19

    move/from16 p42, v1

    if-eqz v23, :cond_32

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mRecoveryTime:I

    goto :goto_32

    :cond_32
    move/from16 v1, p53

    :goto_32
    and-int v23, v2, v20

    move/from16 p43, v1

    if-eqz v23, :cond_33

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mTrainingLoad:I

    goto :goto_33

    :cond_33
    move/from16 v1, p54

    :goto_33
    and-int v23, v2, v21

    move/from16 p44, v1

    if-eqz v23, :cond_34

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mMaxVO2:I

    goto :goto_34

    :cond_34
    move/from16 v1, p55

    :goto_34
    and-int v23, v2, v22

    move/from16 p45, v1

    if-eqz v23, :cond_35

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mLactateThresholdHr:I

    goto :goto_35

    :cond_35
    move/from16 v1, p56

    :goto_35
    const/high16 v23, 0x400000

    and-int v23, v2, v23

    move/from16 p46, v1

    if-eqz v23, :cond_36

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mAlgorithmMarking:I

    goto :goto_36

    :cond_36
    move/from16 v1, p57

    :goto_36
    const/high16 v23, 0x800000

    and-int v23, v2, v23

    move/from16 p47, v1

    if-eqz v23, :cond_37

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mPathCount:I

    goto :goto_37

    :cond_37
    move/from16 v1, p58

    :goto_37
    const/high16 v23, 0x1000000

    and-int v23, v2, v23

    move/from16 p48, v1

    if-eqz v23, :cond_38

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mPathSampleInterval:I

    goto :goto_38

    :cond_38
    move/from16 v1, p59

    :goto_38
    const/high16 v23, 0x2000000

    and-int v23, v2, v23

    move/from16 p49, v1

    if-eqz v23, :cond_39

    iget-object v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mPathPoints:Ljava/util/List;

    goto :goto_39

    :cond_39
    move-object/from16 v1, p60

    :goto_39
    const/high16 v23, 0x4000000

    and-int v23, v2, v23

    move-object/from16 p50, v1

    if-eqz v23, :cond_3a

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mHrPathCount:I

    goto :goto_3a

    :cond_3a
    move/from16 v1, p61

    :goto_3a
    const/high16 v23, 0x8000000

    and-int v23, v2, v23

    move/from16 p51, v1

    if-eqz v23, :cond_3b

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mHrPathSampleInterval:I

    goto :goto_3b

    :cond_3b
    move/from16 v1, p62

    :goto_3b
    const/high16 v23, 0x10000000

    and-int v23, v2, v23

    move/from16 p52, v1

    if-eqz v23, :cond_3c

    iget-object v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mHrPathPoints:Ljava/util/List;

    goto :goto_3c

    :cond_3c
    move-object/from16 v1, p63

    :goto_3c
    const/high16 v23, 0x20000000

    and-int v23, v2, v23

    move-object/from16 p53, v1

    if-eqz v23, :cond_3d

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mPacePathCount:I

    goto :goto_3d

    :cond_3d
    move/from16 v1, p64

    :goto_3d
    const/high16 v23, 0x40000000    # 2.0f

    and-int v23, v2, v23

    move/from16 p54, v1

    if-eqz v23, :cond_3e

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mPacePathSampleInterval:I

    goto :goto_3e

    :cond_3e
    move/from16 v1, p65

    :goto_3e
    const/high16 v23, -0x80000000

    and-int v2, v2, v23

    if-eqz v2, :cond_3f

    iget-object v2, v0, Lcom/sma/smartv3/db/entity/Workout;->mPacePathPoints:Ljava/util/List;

    goto :goto_3f

    :cond_3f
    move-object/from16 v2, p66

    :goto_3f
    and-int/lit8 v23, v3, 0x1

    move/from16 p55, v1

    if-eqz v23, :cond_40

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mSpeedPathCount:I

    goto :goto_40

    :cond_40
    move/from16 v1, p67

    :goto_40
    and-int/lit8 v23, v3, 0x2

    move/from16 p56, v1

    if-eqz v23, :cond_41

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mSpeedPathSampleInterval:I

    goto :goto_41

    :cond_41
    move/from16 v1, p68

    :goto_41
    and-int/lit8 v23, v3, 0x4

    move/from16 p57, v1

    if-eqz v23, :cond_42

    iget-object v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mSpeedPathPoints:Ljava/util/List;

    goto :goto_42

    :cond_42
    move-object/from16 v1, p69

    :goto_42
    and-int/lit8 v23, v3, 0x8

    move-object/from16 p58, v1

    if-eqz v23, :cond_43

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mCadencePathCount:I

    goto :goto_43

    :cond_43
    move/from16 v1, p70

    :goto_43
    and-int/lit8 v23, v3, 0x10

    move/from16 p59, v1

    if-eqz v23, :cond_44

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mCadencePathSampleInterval:I

    goto :goto_44

    :cond_44
    move/from16 v1, p71

    :goto_44
    and-int/lit8 v23, v3, 0x20

    move/from16 p60, v1

    if-eqz v23, :cond_45

    iget-object v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mCadencePathPoints:Ljava/util/List;

    goto :goto_45

    :cond_45
    move-object/from16 v1, p72

    :goto_45
    and-int/lit8 v23, v3, 0x40

    move-object/from16 p61, v1

    if-eqz v23, :cond_46

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mAltitudePathCount:I

    goto :goto_46

    :cond_46
    move/from16 v1, p73

    :goto_46
    move/from16 p62, v1

    and-int/lit16 v1, v3, 0x80

    if-eqz v1, :cond_47

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mAltitudePathSampleInterval:I

    goto :goto_47

    :cond_47
    move/from16 v1, p74

    :goto_47
    move/from16 p63, v1

    and-int/lit16 v1, v3, 0x100

    if-eqz v1, :cond_48

    iget-object v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mAltitudePathPoints:Ljava/util/List;

    goto :goto_48

    :cond_48
    move-object/from16 v1, p75

    :goto_48
    move-object/from16 p64, v1

    and-int/lit16 v1, v3, 0x200

    if-eqz v1, :cond_49

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mGoalDistance:I

    goto :goto_49

    :cond_49
    move/from16 v1, p76

    :goto_49
    move/from16 p65, v1

    and-int/lit16 v1, v3, 0x400

    if-eqz v1, :cond_4a

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mGoalTime:I

    goto :goto_4a

    :cond_4a
    move/from16 v1, p77

    :goto_4a
    move/from16 p66, v1

    and-int/lit16 v1, v3, 0x800

    if-eqz v1, :cond_4b

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mGoalCalorie:I

    goto :goto_4b

    :cond_4b
    move/from16 v1, p78

    :goto_4b
    move/from16 p67, v1

    and-int/lit16 v1, v3, 0x1000

    if-eqz v1, :cond_4c

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mPausedDuration:I

    goto :goto_4c

    :cond_4c
    move/from16 v1, p79

    :goto_4c
    move/from16 p68, v1

    and-int/lit16 v1, v3, 0x2000

    if-eqz v1, :cond_4d

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mCurBpm:I

    goto :goto_4d

    :cond_4d
    move/from16 v1, p80

    :goto_4d
    move/from16 p69, v1

    and-int/lit16 v1, v3, 0x4000

    if-eqz v1, :cond_4e

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mAscendAltitude:I

    goto :goto_4e

    :cond_4e
    move/from16 v1, p81

    :goto_4e
    and-int v23, v3, v16

    move/from16 p70, v1

    if-eqz v23, :cond_4f

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mDescendAltitude:I

    goto :goto_4f

    :cond_4f
    move/from16 v1, p82

    :goto_4f
    and-int v23, v3, v17

    move/from16 p71, v1

    if-eqz v23, :cond_50

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mCurStress:I

    goto :goto_50

    :cond_50
    move/from16 v1, p83

    :goto_50
    and-int v23, v3, v18

    move/from16 p72, v1

    if-eqz v23, :cond_51

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mSwimType:I

    goto :goto_51

    :cond_51
    move/from16 v1, p84

    :goto_51
    and-int v23, v3, v19

    move/from16 p73, v1

    if-eqz v23, :cond_52

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mCntFore:I

    goto :goto_52

    :cond_52
    move/from16 v1, p85

    :goto_52
    and-int v23, v3, v20

    move/from16 p74, v1

    if-eqz v23, :cond_53

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mCntBack:I

    goto :goto_53

    :cond_53
    move/from16 v1, p86

    :goto_53
    and-int v23, v3, v21

    move/from16 p75, v1

    if-eqz v23, :cond_54

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mBackSwingTime:I

    goto :goto_54

    :cond_54
    move/from16 v1, p87

    :goto_54
    and-int v23, v3, v22

    move/from16 p76, v1

    if-eqz v23, :cond_55

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mDownSwingTime:I

    goto :goto_55

    :cond_55
    move/from16 v1, p88

    :goto_55
    const/high16 v23, 0x400000

    and-int v23, v3, v23

    move/from16 p77, v1

    if-eqz v23, :cond_56

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mDribbleTime:I

    goto :goto_56

    :cond_56
    move/from16 v1, p89

    :goto_56
    const/high16 v23, 0x800000

    and-int v23, v3, v23

    move/from16 p78, v1

    if-eqz v23, :cond_57

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mTripCount:I

    goto :goto_57

    :cond_57
    move/from16 v1, p90

    :goto_57
    const/high16 v23, 0x1000000

    and-int v23, v3, v23

    move/from16 p79, v1

    if-eqz v23, :cond_58

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mSessionCount:I

    goto :goto_58

    :cond_58
    move/from16 v1, p91

    :goto_58
    const/high16 v23, 0x2000000

    and-int v23, v3, v23

    move/from16 p80, v1

    if-eqz v23, :cond_59

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mVerticalOscillation:I

    goto :goto_59

    :cond_59
    move/from16 v1, p92

    :goto_59
    const/high16 v23, 0x4000000

    and-int v23, v3, v23

    move/from16 p81, v1

    if-eqz v23, :cond_5a

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mRunPowerWatt:I

    goto :goto_5a

    :cond_5a
    move/from16 v1, p93

    :goto_5a
    const/high16 v23, 0x8000000

    and-int v23, v3, v23

    move/from16 p82, v1

    if-eqz v23, :cond_5b

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mStepLen:F

    goto :goto_5b

    :cond_5b
    move/from16 v1, p94

    :goto_5b
    const/high16 v23, 0x10000000

    and-int v23, v3, v23

    move/from16 p83, v1

    if-eqz v23, :cond_5c

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mTrainingStatus:I

    goto :goto_5c

    :cond_5c
    move/from16 v1, p95

    :goto_5c
    const/high16 v23, 0x20000000

    and-int v23, v3, v23

    move/from16 p84, v1

    if-eqz v23, :cond_5d

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mFitnessAge:I

    goto :goto_5d

    :cond_5d
    move/from16 v1, p96

    :goto_5d
    const/high16 v23, 0x40000000    # 2.0f

    and-int v23, v3, v23

    move/from16 p85, v1

    if-eqz v23, :cond_5e

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mTlTrend:F

    goto :goto_5e

    :cond_5e
    move/from16 v1, p97

    :goto_5e
    const/high16 v23, -0x80000000

    and-int v3, v3, v23

    if-eqz v3, :cond_5f

    iget-object v3, v0, Lcom/sma/smartv3/db/entity/Workout;->mBestRunTime:[I

    goto :goto_5f

    :cond_5f
    move-object/from16 v3, p98

    :goto_5f
    and-int/lit8 v23, v4, 0x1

    move/from16 p86, v1

    if-eqz v23, :cond_60

    iget-object v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mFitnessLevel:[F

    goto :goto_60

    :cond_60
    move-object/from16 v1, p99

    :goto_60
    and-int/lit8 v23, v4, 0x2

    move-object/from16 p87, v1

    if-eqz v23, :cond_61

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mCalorieTotal:I

    goto :goto_61

    :cond_61
    move/from16 v1, p100

    :goto_61
    and-int/lit8 v23, v4, 0x4

    move/from16 p88, v1

    if-eqz v23, :cond_62

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mPowerCount:I

    goto :goto_62

    :cond_62
    move/from16 v1, p101

    :goto_62
    and-int/lit8 v23, v4, 0x8

    move/from16 p89, v1

    if-eqz v23, :cond_63

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mPowerInterval:I

    goto :goto_63

    :cond_63
    move/from16 v1, p102

    :goto_63
    and-int/lit8 v23, v4, 0x10

    move/from16 p90, v1

    if-eqz v23, :cond_64

    iget-object v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mPowerPoints:Ljava/util/List;

    goto :goto_64

    :cond_64
    move-object/from16 v1, p103

    :goto_64
    and-int/lit8 v23, v4, 0x20

    move-object/from16 p91, v1

    if-eqz v23, :cond_65

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->realTimeAerobic:F

    goto :goto_65

    :cond_65
    move/from16 v1, p104

    :goto_65
    and-int/lit8 v23, v4, 0x40

    move/from16 p92, v1

    if-eqz v23, :cond_66

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->realTimeAnaerobic:F

    goto :goto_66

    :cond_66
    move/from16 v1, p105

    :goto_66
    move/from16 p93, v1

    and-int/lit16 v1, v4, 0x80

    if-eqz v1, :cond_67

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mFatTotal:F

    goto :goto_67

    :cond_67
    move/from16 v1, p106

    :goto_67
    move/from16 p94, v1

    and-int/lit16 v1, v4, 0x100

    if-eqz v1, :cond_68

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mCarboTotal:F

    goto :goto_68

    :cond_68
    move/from16 v1, p107

    :goto_68
    move/from16 p95, v1

    and-int/lit16 v1, v4, 0x200

    if-eqz v1, :cond_69

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorTargetTime:I

    goto :goto_69

    :cond_69
    move/from16 v1, p108

    :goto_69
    move/from16 p96, v1

    and-int/lit16 v1, v4, 0x400

    if-eqz v1, :cond_6a

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorActualTime:I

    goto :goto_6a

    :cond_6a
    move/from16 v1, p109

    :goto_6a
    move/from16 p97, v1

    and-int/lit16 v1, v4, 0x800

    if-eqz v1, :cond_6b

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorDifferenceTime:I

    goto :goto_6b

    :cond_6b
    move/from16 v1, p110

    :goto_6b
    move/from16 p98, v1

    and-int/lit16 v1, v4, 0x1000

    if-eqz v1, :cond_6c

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorStatusTime:I

    goto :goto_6c

    :cond_6c
    move/from16 v1, p111

    :goto_6c
    move/from16 p99, v1

    and-int/lit16 v1, v4, 0x2000

    if-eqz v1, :cond_6d

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorTargetDistance:I

    goto :goto_6d

    :cond_6d
    move/from16 v1, p112

    :goto_6d
    move/from16 p100, v1

    and-int/lit16 v1, v4, 0x4000

    if-eqz v1, :cond_6e

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorActualDistance:I

    goto :goto_6e

    :cond_6e
    move/from16 v1, p113

    :goto_6e
    and-int v23, v4, v16

    move/from16 p101, v1

    if-eqz v23, :cond_6f

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorDifferenceDistance:I

    goto :goto_6f

    :cond_6f
    move/from16 v1, p114

    :goto_6f
    and-int v23, v4, v17

    move/from16 p102, v1

    if-eqz v23, :cond_70

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorStatusDistance:I

    goto :goto_70

    :cond_70
    move/from16 v1, p115

    :goto_70
    and-int v23, v4, v18

    move/from16 p103, v1

    if-eqz v23, :cond_71

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorTargetPace:I

    goto :goto_71

    :cond_71
    move/from16 v1, p116

    :goto_71
    and-int v23, v4, v19

    move/from16 p104, v1

    if-eqz v23, :cond_72

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorActualPace:I

    goto :goto_72

    :cond_72
    move/from16 v1, p117

    :goto_72
    and-int v23, v4, v20

    move/from16 p105, v1

    if-eqz v23, :cond_73

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorDifferencePace:I

    goto :goto_73

    :cond_73
    move/from16 v1, p118

    :goto_73
    and-int v23, v4, v21

    move/from16 p106, v1

    if-eqz v23, :cond_74

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorStatusPace:I

    goto :goto_74

    :cond_74
    move/from16 v1, p119

    :goto_74
    and-int v23, v4, v22

    move/from16 p107, v1

    if-eqz v23, :cond_75

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorTargetSpeedV2:F

    goto :goto_75

    :cond_75
    move/from16 v1, p120

    :goto_75
    const/high16 v23, 0x400000

    and-int v23, v4, v23

    move/from16 p108, v1

    if-eqz v23, :cond_76

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorActualSpeedV2:F

    goto :goto_76

    :cond_76
    move/from16 v1, p121

    :goto_76
    const/high16 v23, 0x800000

    and-int v23, v4, v23

    move/from16 p109, v1

    if-eqz v23, :cond_77

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorTargetSpeed:I

    goto :goto_77

    :cond_77
    move/from16 v1, p122

    :goto_77
    const/high16 v23, 0x1000000

    and-int v23, v4, v23

    move/from16 p110, v1

    if-eqz v23, :cond_78

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorActualSpeed:I

    goto :goto_78

    :cond_78
    move/from16 v1, p123

    :goto_78
    const/high16 v23, 0x2000000

    and-int v23, v4, v23

    move/from16 p111, v1

    if-eqz v23, :cond_79

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorDifferenceSpeed:I

    goto :goto_79

    :cond_79
    move/from16 v1, p124

    :goto_79
    const/high16 v23, 0x4000000

    and-int v23, v4, v23

    move/from16 p112, v1

    if-eqz v23, :cond_7a

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorStatusSpeed:I

    goto :goto_7a

    :cond_7a
    move/from16 v1, p125

    :goto_7a
    const/high16 v23, 0x8000000

    and-int v23, v4, v23

    move/from16 p113, v1

    if-eqz v23, :cond_7b

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mMaxOxygenPower:F

    goto :goto_7b

    :cond_7b
    move/from16 v1, p126

    :goto_7b
    const/high16 v23, 0x10000000

    and-int v23, v4, v23

    move/from16 p114, v1

    if-eqz v23, :cond_7c

    iget-object v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mTrendWeek:[F

    goto :goto_7c

    :cond_7c
    move-object/from16 v1, p127

    :goto_7c
    const/high16 v23, 0x20000000

    and-int v23, v4, v23

    move-object/from16 p115, v1

    if-eqz v23, :cond_7d

    iget-object v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mCyclingIndex:[F

    goto :goto_7d

    :cond_7d
    move-object/from16 v1, p128

    :goto_7d
    const/high16 v23, 0x40000000    # 2.0f

    and-int v23, v4, v23

    move-object/from16 p116, v1

    if-eqz v23, :cond_7e

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mStaBalance:I

    goto :goto_7e

    :cond_7e
    move/from16 v1, p129

    :goto_7e
    const/high16 v23, -0x80000000

    and-int v4, v4, v23

    if-eqz v4, :cond_7f

    iget v4, v0, Lcom/sma/smartv3/db/entity/Workout;->mSwimSwolf:I

    goto :goto_7f

    :cond_7f
    move/from16 v4, p130

    :goto_7f
    and-int/lit8 v23, v5, 0x1

    move/from16 p117, v1

    if-eqz v23, :cond_80

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mCntLap:I

    goto :goto_80

    :cond_80
    move/from16 v1, p131

    :goto_80
    and-int/lit8 v23, v5, 0x2

    move/from16 p118, v1

    if-eqz v23, :cond_81

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mFrontCrawlPerc:I

    goto :goto_81

    :cond_81
    move/from16 v1, p132

    :goto_81
    and-int/lit8 v23, v5, 0x4

    move/from16 p119, v1

    if-eqz v23, :cond_82

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mBreaststrokePerc:I

    goto :goto_82

    :cond_82
    move/from16 v1, p133

    :goto_82
    and-int/lit8 v23, v5, 0x8

    move/from16 p120, v1

    if-eqz v23, :cond_83

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mBackstrokePerc:I

    goto :goto_83

    :cond_83
    move/from16 v1, p134

    :goto_83
    and-int/lit8 v23, v5, 0x10

    move/from16 p121, v1

    if-eqz v23, :cond_84

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mButterflyPerc:I

    goto :goto_84

    :cond_84
    move/from16 v1, p135

    :goto_84
    and-int/lit8 v23, v5, 0x20

    move/from16 p122, v1

    if-eqz v23, :cond_85

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mSpmPathPointsCount:I

    goto :goto_85

    :cond_85
    move/from16 v1, p136

    :goto_85
    and-int/lit8 v23, v5, 0x40

    move/from16 p123, v1

    if-eqz v23, :cond_86

    iget-object v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mSpmPathPointsPoints:Ljava/util/List;

    goto :goto_86

    :cond_86
    move-object/from16 v1, p137

    :goto_86
    move-object/from16 p124, v1

    and-int/lit16 v1, v5, 0x80

    if-eqz v1, :cond_87

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mStepLenCount:I

    goto :goto_87

    :cond_87
    move/from16 v1, p138

    :goto_87
    move/from16 p125, v1

    and-int/lit16 v1, v5, 0x100

    if-eqz v1, :cond_88

    iget-object v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mStepLenPoints:Ljava/util/List;

    goto :goto_88

    :cond_88
    move-object/from16 v1, p139

    :goto_88
    move-object/from16 p126, v1

    and-int/lit16 v1, v5, 0x200

    if-eqz v1, :cond_89

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mEllipticalSteps:I

    goto :goto_89

    :cond_89
    move/from16 v1, p140

    :goto_89
    move/from16 p127, v1

    and-int/lit16 v1, v5, 0x400

    move-object/from16 p165, v2

    if-eqz v1, :cond_8a

    iget-wide v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mChildSwimStartTime:J

    goto :goto_8a

    :cond_8a
    move-wide/from16 v1, p141

    :goto_8a
    move-wide/from16 p128, v1

    and-int/lit16 v1, v5, 0x800

    if-eqz v1, :cond_8b

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mChildSwimDuration:I

    goto :goto_8b

    :cond_8b
    move/from16 v1, p143

    :goto_8b
    and-int/lit16 v2, v5, 0x1000

    if-eqz v2, :cond_8c

    iget v2, v0, Lcom/sma/smartv3/db/entity/Workout;->mChildSwimDistance:I

    goto :goto_8c

    :cond_8c
    move/from16 v2, p144

    :goto_8c
    move/from16 p130, v1

    and-int/lit16 v1, v5, 0x2000

    move/from16 p131, v2

    if-eqz v1, :cond_8d

    iget-wide v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mChildCyclingStartTime:J

    goto :goto_8d

    :cond_8d
    move-wide/from16 v1, p145

    :goto_8d
    move-wide/from16 p132, v1

    and-int/lit16 v1, v5, 0x4000

    if-eqz v1, :cond_8e

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mChildCyclingDuration:I

    goto :goto_8e

    :cond_8e
    move/from16 v1, p147

    :goto_8e
    and-int v2, v5, v16

    if-eqz v2, :cond_8f

    iget v2, v0, Lcom/sma/smartv3/db/entity/Workout;->mChildCyclingDistance:I

    goto :goto_8f

    :cond_8f
    move/from16 v2, p148

    :goto_8f
    and-int v16, v5, v17

    move/from16 p134, v1

    move/from16 p135, v2

    if-eqz v16, :cond_90

    iget-wide v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mChildRunStartTime:J

    goto :goto_90

    :cond_90
    move-wide/from16 v1, p149

    :goto_90
    and-int v16, v5, v18

    move-wide/from16 p136, v1

    if-eqz v16, :cond_91

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mChildRunDuration:I

    goto :goto_91

    :cond_91
    move/from16 v1, p151

    :goto_91
    and-int v2, v5, v19

    if-eqz v2, :cond_92

    iget v2, v0, Lcom/sma/smartv3/db/entity/Workout;->mChildRunDistance:I

    goto :goto_92

    :cond_92
    move/from16 v2, p152

    :goto_92
    and-int v16, v5, v20

    move/from16 p138, v1

    if-eqz v16, :cond_93

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mChildSwimMode:I

    goto :goto_93

    :cond_93
    move/from16 v1, p153

    :goto_93
    and-int v16, v5, v21

    move/from16 p139, v1

    if-eqz v16, :cond_94

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mChildCyclingMode:I

    goto :goto_94

    :cond_94
    move/from16 v1, p154

    :goto_94
    and-int v16, v5, v22

    move/from16 p140, v1

    if-eqz v16, :cond_95

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mChildRunMode:I

    goto :goto_95

    :cond_95
    move/from16 v1, p155

    :goto_95
    const/high16 v16, 0x400000

    and-int v16, v5, v16

    move/from16 p141, v1

    if-eqz v16, :cond_96

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mChildNumber:I

    goto :goto_96

    :cond_96
    move/from16 v1, p156

    :goto_96
    const/high16 v16, 0x800000

    and-int v16, v5, v16

    move/from16 p142, v1

    if-eqz v16, :cond_97

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mRunLactateAvg:F

    goto :goto_97

    :cond_97
    move/from16 v1, p157

    :goto_97
    const/high16 v16, 0x1000000

    and-int v16, v5, v16

    move/from16 p143, v1

    if-eqz v16, :cond_98

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mCyclingLactateAvg:F

    goto :goto_98

    :cond_98
    move/from16 v1, p158

    :goto_98
    const/high16 v16, 0x2000000

    and-int v16, v5, v16

    move/from16 p144, v1

    if-eqz v16, :cond_99

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mFlag:I

    goto :goto_99

    :cond_99
    move/from16 v1, p159

    :goto_99
    const/high16 v16, 0x4000000

    and-int v16, v5, v16

    move/from16 p145, v1

    if-eqz v16, :cond_9a

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mRecoveryHrCount:I

    goto :goto_9a

    :cond_9a
    move/from16 v1, p160

    :goto_9a
    const/high16 v16, 0x8000000

    and-int v16, v5, v16

    move/from16 p146, v1

    if-eqz v16, :cond_9b

    iget-object v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mRecoveryHrPoints:Ljava/util/List;

    goto :goto_9b

    :cond_9b
    move-object/from16 v1, p161

    :goto_9b
    const/high16 v16, 0x10000000

    and-int v16, v5, v16

    move-object/from16 p147, v1

    if-eqz v16, :cond_9c

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mSwimPoolLength:I

    goto :goto_9c

    :cond_9c
    move/from16 v1, p162

    :goto_9c
    const/high16 v16, 0x20000000

    and-int v16, v5, v16

    move/from16 p148, v1

    if-eqz v16, :cond_9d

    iget-object v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mDeviceId:Ljava/lang/String;

    goto :goto_9d

    :cond_9d
    move-object/from16 v1, p163

    :goto_9d
    const/high16 v16, 0x40000000    # 2.0f

    and-int v5, v5, v16

    if-eqz v5, :cond_9e

    iget v5, v0, Lcom/sma/smartv3/db/entity/Workout;->mAICoachSportID:I

    move/from16 p159, p144

    move/from16 p144, p130

    move/from16 p130, p117

    move/from16 p117, p104

    move-object/from16 p104, p91

    move/from16 p91, p79

    move/from16 p79, p67

    move-object/from16 p67, p165

    move/from16 p165, v5

    move/from16 p149, p135

    move-wide/from16 p150, p136

    move/from16 p152, p138

    move/from16 p154, p139

    move/from16 p155, p140

    move/from16 p156, p141

    move/from16 p157, p142

    move/from16 p158, p143

    move/from16 p160, p145

    move/from16 p161, p146

    move-object/from16 p162, p147

    move/from16 p163, p148

    move-object/from16 p164, v1

    move/from16 p153, v2

    move/from16 p135, p121

    move/from16 p136, p122

    move/from16 p137, p123

    move-object/from16 p138, p124

    move/from16 p139, p125

    move-object/from16 p140, p126

    move/from16 p141, p127

    move-wide/from16 p142, p128

    move/from16 p145, p131

    move-wide/from16 p146, p132

    move/from16 p148, p134

    move/from16 p131, v4

    move/from16 p121, p108

    move/from16 p122, p109

    move/from16 p123, p110

    move/from16 p124, p111

    move/from16 p125, p112

    move/from16 p126, p113

    move/from16 p127, p114

    move-object/from16 p128, p115

    move-object/from16 p129, p116

    move/from16 p132, p118

    move/from16 p133, p119

    move/from16 p134, p120

    move/from16 p108, p95

    move/from16 p109, p96

    move/from16 p110, p97

    move/from16 p111, p98

    move/from16 p112, p99

    move/from16 p113, p100

    move/from16 p114, p101

    move/from16 p115, p102

    move/from16 p116, p103

    move/from16 p118, p105

    move/from16 p119, p106

    move/from16 p120, p107

    move-object/from16 p99, v3

    move/from16 p95, p83

    move/from16 p96, p84

    move/from16 p97, p85

    move/from16 p98, p86

    move-object/from16 p100, p87

    move/from16 p101, p88

    move/from16 p102, p89

    move/from16 p103, p90

    move/from16 p105, p92

    move/from16 p106, p93

    move/from16 p107, p94

    move/from16 p83, p71

    move/from16 p84, p72

    move/from16 p85, p73

    move/from16 p86, p74

    move/from16 p87, p75

    move/from16 p88, p76

    move/from16 p89, p77

    move/from16 p90, p78

    move/from16 p92, p80

    move/from16 p93, p81

    move/from16 p94, p82

    move/from16 p71, p59

    move/from16 p72, p60

    move-object/from16 p73, p61

    move/from16 p74, p62

    move/from16 p75, p63

    move-object/from16 p76, p64

    move/from16 p77, p65

    move/from16 p78, p66

    move/from16 p80, p68

    move/from16 p81, p69

    move/from16 p82, p70

    move/from16 p59, p48

    move/from16 p60, p49

    move-object/from16 p61, p50

    move/from16 p62, p51

    move/from16 p63, p52

    move-object/from16 p64, p53

    move/from16 p65, p54

    move/from16 p66, p55

    move/from16 p68, p56

    move/from16 p69, p57

    move-object/from16 p70, p58

    :goto_9e
    move/from16 p48, p37

    move/from16 p49, p38

    move/from16 p50, p39

    move-object/from16 p51, p40

    move-object/from16 p52, p41

    move/from16 p53, p42

    move/from16 p54, p43

    move/from16 p55, p44

    move/from16 p56, p45

    move/from16 p57, p46

    move/from16 p58, p47

    move-object/from16 p37, p26

    move/from16 p38, p27

    move/from16 p39, p28

    move/from16 p40, p29

    move/from16 p41, p30

    move/from16 p42, p31

    move/from16 p43, p32

    move/from16 p44, p33

    move/from16 p45, p34

    move/from16 p46, p35

    move/from16 p47, p36

    move/from16 p26, p15

    move/from16 p27, p16

    move/from16 p28, p17

    move/from16 p29, p18

    move/from16 p30, p19

    move/from16 p31, p20

    move/from16 p32, p21

    move/from16 p33, p22

    move-object/from16 p34, p23

    move-object/from16 p35, p24

    move-object/from16 p36, p25

    move/from16 p18, v6

    move/from16 p15, p5

    move/from16 p16, p6

    move/from16 p17, p7

    move/from16 p19, p8

    move/from16 p20, p9

    move/from16 p21, p10

    move/from16 p22, p11

    move/from16 p23, p12

    move/from16 p24, p13

    move/from16 p25, p14

    move-wide/from16 p5, v9

    move-object/from16 p7, v11

    move/from16 p8, v12

    move/from16 p9, v13

    move/from16 p10, v14

    move/from16 p11, v15

    move/from16 p12, p2

    move/from16 p13, p3

    move/from16 p14, p4

    move-wide/from16 p3, v7

    move/from16 p2, p1

    move-object/from16 p1, v0

    goto/16 :goto_9f

    :cond_9e
    move/from16 p159, p144

    move/from16 p144, p130

    move/from16 p130, p117

    move/from16 p117, p104

    move-object/from16 p104, p91

    move/from16 p91, p79

    move/from16 p79, p67

    move-object/from16 p67, p165

    move/from16 p165, p164

    move/from16 p149, p135

    move-wide/from16 p150, p136

    move/from16 p152, p138

    move/from16 p154, p139

    move/from16 p155, p140

    move/from16 p156, p141

    move/from16 p157, p142

    move/from16 p158, p143

    move/from16 p160, p145

    move/from16 p161, p146

    move-object/from16 p162, p147

    move/from16 p163, p148

    move/from16 p153, v2

    move/from16 p135, p121

    move/from16 p136, p122

    move/from16 p137, p123

    move-object/from16 p138, p124

    move/from16 p139, p125

    move-object/from16 p140, p126

    move/from16 p141, p127

    move-wide/from16 p142, p128

    move/from16 p145, p131

    move-wide/from16 p146, p132

    move/from16 p148, p134

    move/from16 p131, v4

    move/from16 p121, p108

    move/from16 p122, p109

    move/from16 p123, p110

    move/from16 p124, p111

    move/from16 p125, p112

    move/from16 p126, p113

    move/from16 p127, p114

    move-object/from16 p128, p115

    move-object/from16 p129, p116

    move/from16 p132, p118

    move/from16 p133, p119

    move/from16 p134, p120

    move/from16 p108, p95

    move/from16 p109, p96

    move/from16 p110, p97

    move/from16 p111, p98

    move/from16 p112, p99

    move/from16 p113, p100

    move/from16 p114, p101

    move/from16 p115, p102

    move/from16 p116, p103

    move/from16 p118, p105

    move/from16 p119, p106

    move/from16 p120, p107

    move-object/from16 p99, v3

    move/from16 p95, p83

    move/from16 p96, p84

    move/from16 p97, p85

    move/from16 p98, p86

    move-object/from16 p100, p87

    move/from16 p101, p88

    move/from16 p102, p89

    move/from16 p103, p90

    move/from16 p105, p92

    move/from16 p106, p93

    move/from16 p107, p94

    move/from16 p83, p71

    move/from16 p84, p72

    move/from16 p85, p73

    move/from16 p86, p74

    move/from16 p87, p75

    move/from16 p88, p76

    move/from16 p89, p77

    move/from16 p90, p78

    move/from16 p92, p80

    move/from16 p93, p81

    move/from16 p94, p82

    move/from16 p71, p59

    move/from16 p72, p60

    move-object/from16 p73, p61

    move/from16 p74, p62

    move/from16 p75, p63

    move-object/from16 p76, p64

    move/from16 p77, p65

    move/from16 p78, p66

    move/from16 p80, p68

    move/from16 p81, p69

    move/from16 p82, p70

    move/from16 p59, p48

    move/from16 p60, p49

    move-object/from16 p61, p50

    move/from16 p62, p51

    move/from16 p63, p52

    move-object/from16 p64, p53

    move/from16 p65, p54

    move/from16 p66, p55

    move/from16 p68, p56

    move/from16 p69, p57

    move-object/from16 p70, p58

    move-object/from16 p164, v1

    goto/16 :goto_9e

    :goto_9f
    invoke-virtual/range {p1 .. p165}, Lcom/sma/smartv3/db/entity/Workout;->copy(IJJLjava/lang/String;IIIIIIIIIIIIIIIIIIIIIIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIIFFIFIII[I[IIIIIIIIILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IIIIIIIIIIIIIIIIIIFIIF[I[FIIILjava/util/List;FFFFIIIIIIIIIIIIFFIIIIF[F[FIIIIIIIILjava/util/List;ILjava/util/List;IJIIJIIJIIIIIIFFIILjava/util/List;ILjava/lang/String;I)Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mId:I

    return v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mStep:I

    return v0
.end method

.method public final component100()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mPowerInterval:I

    return v0
.end method

.method public final component101()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mPowerPoints:Ljava/util/List;

    return-object v0
.end method

.method public final component102()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->realTimeAerobic:F

    return v0
.end method

.method public final component103()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->realTimeAnaerobic:F

    return v0
.end method

.method public final component104()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mFatTotal:F

    return v0
.end method

.method public final component105()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mCarboTotal:F

    return v0
.end method

.method public final component106()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorTargetTime:I

    return v0
.end method

.method public final component107()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorActualTime:I

    return v0
.end method

.method public final component108()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorDifferenceTime:I

    return v0
.end method

.method public final component109()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorStatusTime:I

    return v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mDistance:I

    return v0
.end method

.method public final component110()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorTargetDistance:I

    return v0
.end method

.method public final component111()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorActualDistance:I

    return v0
.end method

.method public final component112()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorDifferenceDistance:I

    return v0
.end method

.method public final component113()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorStatusDistance:I

    return v0
.end method

.method public final component114()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorTargetPace:I

    return v0
.end method

.method public final component115()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorActualPace:I

    return v0
.end method

.method public final component116()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorDifferencePace:I

    return v0
.end method

.method public final component117()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorStatusPace:I

    return v0
.end method

.method public final component118()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorTargetSpeedV2:F

    return v0
.end method

.method public final component119()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorActualSpeedV2:F

    return v0
.end method

.method public final component12()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mCalorie:I

    return v0
.end method

.method public final component120()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorTargetSpeed:I

    return v0
.end method

.method public final component121()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorActualSpeed:I

    return v0
.end method

.method public final component122()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorDifferenceSpeed:I

    return v0
.end method

.method public final component123()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorStatusSpeed:I

    return v0
.end method

.method public final component124()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mMaxOxygenPower:F

    return v0
.end method

.method public final component125()[F
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mTrendWeek:[F

    return-object v0
.end method

.method public final component126()[F
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mCyclingIndex:[F

    return-object v0
.end method

.method public final component127()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mStaBalance:I

    return v0
.end method

.method public final component128()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mSwimSwolf:I

    return v0
.end method

.method public final component129()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mCntLap:I

    return v0
.end method

.method public final component13()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mSpeed:I

    return v0
.end method

.method public final component130()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mFrontCrawlPerc:I

    return v0
.end method

.method public final component131()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mBreaststrokePerc:I

    return v0
.end method

.method public final component132()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mBackstrokePerc:I

    return v0
.end method

.method public final component133()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mButterflyPerc:I

    return v0
.end method

.method public final component134()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mSpmPathPointsCount:I

    return v0
.end method

.method public final component135()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mSpmPathPointsPoints:Ljava/util/List;

    return-object v0
.end method

.method public final component136()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mStepLenCount:I

    return v0
.end method

.method public final component137()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mStepLenPoints:Ljava/util/List;

    return-object v0
.end method

.method public final component138()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mEllipticalSteps:I

    return v0
.end method

.method public final component139()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildSwimStartTime:J

    return-wide v0
.end method

.method public final component14()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mPace:I

    return v0
.end method

.method public final component140()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildSwimDuration:I

    return v0
.end method

.method public final component141()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildSwimDistance:I

    return v0
.end method

.method public final component142()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildCyclingStartTime:J

    return-wide v0
.end method

.method public final component143()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildCyclingDuration:I

    return v0
.end method

.method public final component144()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildCyclingDistance:I

    return v0
.end method

.method public final component145()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildRunStartTime:J

    return-wide v0
.end method

.method public final component146()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildRunDuration:I

    return v0
.end method

.method public final component147()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildRunDistance:I

    return v0
.end method

.method public final component148()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildSwimMode:I

    return v0
.end method

.method public final component149()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildCyclingMode:I

    return v0
.end method

.method public final component15()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mAvgBpm:I

    return v0
.end method

.method public final component150()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildRunMode:I

    return v0
.end method

.method public final component151()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildNumber:I

    return v0
.end method

.method public final component152()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mRunLactateAvg:F

    return v0
.end method

.method public final component153()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mCyclingLactateAvg:F

    return v0
.end method

.method public final component154()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mFlag:I

    return v0
.end method

.method public final component155()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mRecoveryHrCount:I

    return v0
.end method

.method public final component156()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mRecoveryHrPoints:Ljava/util/List;

    return-object v0
.end method

.method public final component157()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mSwimPoolLength:I

    return v0
.end method

.method public final component158()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mDeviceId:Ljava/lang/String;

    return-object v0
.end method

.method public final component159()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mAICoachSportID:I

    return v0
.end method

.method public final component16()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mMaxBpm:I

    return v0
.end method

.method public final component17()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mMinBpm:I

    return v0
.end method

.method public final component18()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mMaxSpm:I

    return v0
.end method

.method public final component19()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mMinSpm:I

    return v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mStart:J

    return-wide v0
.end method

.method public final component20()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mMaxPace:I

    return v0
.end method

.method public final component21()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mMinPace:I

    return v0
.end method

.method public final component22()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mMaxAltitude:I

    return v0
.end method

.method public final component23()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mMinAltitude:I

    return v0
.end method

.method public final component24()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mMinStress:I

    return v0
.end method

.method public final component25()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mMaxStress:I

    return v0
.end method

.method public final component26()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mAvgStress:I

    return v0
.end method

.method public final component27()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mSource:I

    return v0
.end method

.method public final component28()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mIsSync:I

    return v0
.end method

.method public final component29()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mIsDelete:I

    return v0
.end method

.method public final component3()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mEnd:J

    return-wide v0
.end method

.method public final component30()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mFeel:I

    return v0
.end method

.method public final component31()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mPrototype:Ljava/lang/String;

    return-object v0
.end method

.method public final component32()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mFirmwareFlag:Ljava/lang/String;

    return-object v0
.end method

.method public final component33()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mBleName:Ljava/lang/String;

    return-object v0
.end method

.method public final component34()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mPlatform:Ljava/lang/String;

    return-object v0
.end method

.method public final component35()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mMaxSpeed:I

    return v0
.end method

.method public final component36()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mMinSpeed:I

    return v0
.end method

.method public final component37()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mRestDuration:I

    return v0
.end method

.method public final component38()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mAGpsType:I

    return v0
.end method

.method public final component39()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mType:I

    return v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mLocalTime:Ljava/lang/String;

    return-object v0
.end method

.method public final component40()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mMetTotal:I

    return v0
.end method

.method public final component41()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mAerobic:F

    return v0
.end method

.method public final component42()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mAnaerobic:F

    return v0
.end method

.method public final component43()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mStamina:I

    return v0
.end method

.method public final component44()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mAvgSpeed:F

    return v0
.end method

.method public final component45()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mCadence:I

    return v0
.end method

.method public final component46()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mMaxCadence:I

    return v0
.end method

.method public final component47()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mCnt:I

    return v0
.end method

.method public final component48()[I
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mBpmZoneCount:[I

    return-object v0
.end method

.method public final component49()[I
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mPersonalZone:[I

    return-object v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mDuration:I

    return v0
.end method

.method public final component50()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mLactateThresholdPace:I

    return v0
.end method

.method public final component51()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mRecoveryTime:I

    return v0
.end method

.method public final component52()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mTrainingLoad:I

    return v0
.end method

.method public final component53()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mMaxVO2:I

    return v0
.end method

.method public final component54()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mLactateThresholdHr:I

    return v0
.end method

.method public final component55()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mAlgorithmMarking:I

    return v0
.end method

.method public final component56()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mPathCount:I

    return v0
.end method

.method public final component57()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mPathSampleInterval:I

    return v0
.end method

.method public final component58()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "[F>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mPathPoints:Ljava/util/List;

    return-object v0
.end method

.method public final component59()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mHrPathCount:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mAltitude:I

    return v0
.end method

.method public final component60()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mHrPathSampleInterval:I

    return v0
.end method

.method public final component61()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mHrPathPoints:Ljava/util/List;

    return-object v0
.end method

.method public final component62()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mPacePathCount:I

    return v0
.end method

.method public final component63()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mPacePathSampleInterval:I

    return v0
.end method

.method public final component64()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mPacePathPoints:Ljava/util/List;

    return-object v0
.end method

.method public final component65()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mSpeedPathCount:I

    return v0
.end method

.method public final component66()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mSpeedPathSampleInterval:I

    return v0
.end method

.method public final component67()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mSpeedPathPoints:Ljava/util/List;

    return-object v0
.end method

.method public final component68()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mCadencePathCount:I

    return v0
.end method

.method public final component69()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mCadencePathSampleInterval:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mAirPressure:I

    return v0
.end method

.method public final component70()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mCadencePathPoints:Ljava/util/List;

    return-object v0
.end method

.method public final component71()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mAltitudePathCount:I

    return v0
.end method

.method public final component72()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mAltitudePathSampleInterval:I

    return v0
.end method

.method public final component73()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mAltitudePathPoints:Ljava/util/List;

    return-object v0
.end method

.method public final component74()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mGoalDistance:I

    return v0
.end method

.method public final component75()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mGoalTime:I

    return v0
.end method

.method public final component76()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mGoalCalorie:I

    return v0
.end method

.method public final component77()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mPausedDuration:I

    return v0
.end method

.method public final component78()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mCurBpm:I

    return v0
.end method

.method public final component79()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mAscendAltitude:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mSpm:I

    return v0
.end method

.method public final component80()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mDescendAltitude:I

    return v0
.end method

.method public final component81()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mCurStress:I

    return v0
.end method

.method public final component82()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mSwimType:I

    return v0
.end method

.method public final component83()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mCntFore:I

    return v0
.end method

.method public final component84()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mCntBack:I

    return v0
.end method

.method public final component85()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mBackSwingTime:I

    return v0
.end method

.method public final component86()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mDownSwingTime:I

    return v0
.end method

.method public final component87()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mDribbleTime:I

    return v0
.end method

.method public final component88()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mTripCount:I

    return v0
.end method

.method public final component89()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mSessionCount:I

    return v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mMode:I

    return v0
.end method

.method public final component90()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mVerticalOscillation:I

    return v0
.end method

.method public final component91()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mRunPowerWatt:I

    return v0
.end method

.method public final component92()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mStepLen:F

    return v0
.end method

.method public final component93()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mTrainingStatus:I

    return v0
.end method

.method public final component94()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mFitnessAge:I

    return v0
.end method

.method public final component95()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mTlTrend:F

    return v0
.end method

.method public final component96()[I
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mBestRunTime:[I

    return-object v0
.end method

.method public final component97()[F
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mFitnessLevel:[F

    return-object v0
.end method

.method public final component98()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mCalorieTotal:I

    return v0
.end method

.method public final component99()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mPowerCount:I

    return v0
.end method

.method public final copy(IJJLjava/lang/String;IIIIIIIIIIIIIIIIIIIIIIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIIFFIFIII[I[IIIIIIIIILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IIIIIIIIIIIIIIIIIIFIIF[I[FIIILjava/util/List;FFFFIIIIIIIIIIIIFFIIIIF[F[FIIIIIIIILjava/util/List;ILjava/util/List;IJIIJIIJIIIIIIFFIILjava/util/List;ILjava/lang/String;I)Lcom/sma/smartv3/db/entity/Workout;
    .locals 166
    .param p6    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p33    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p34    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p35    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p36    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p50    # [I
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p51    # [I
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p60    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p63    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p66    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p69    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p72    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p75    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p98    # [I
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p99    # [F
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p103    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p127    # [F
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p128    # [F
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p137    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p139    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p161    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p163    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IJJ",
            "Ljava/lang/String;",
            "IIIIIIIIIIIIIIIIIIIIIIIIII",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "IIIIIIFFIFIII[I[IIIIIIIII",
            "Ljava/util/List<",
            "[F>;II",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;II",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;II",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;II",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;II",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;IIIIIIIIIIIIIIIIIIFIIF[I[FIII",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;FFFFIIIIIIIIIIIIFFIIIIF[F[FIIIIIIII",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;I",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;IJIIJIIJIIIIIIFFII",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;I",
            "Ljava/lang/String;",
            "I)",
            "Lcom/sma/smartv3/db/entity/Workout;"
        }
    .end annotation

    const-string v0, "mLocalTime"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mPrototype"

    move-object/from16 v1, p33

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mFirmwareFlag"

    move-object/from16 v2, p34

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mBleName"

    move-object/from16 v3, p35

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mPlatform"

    move-object/from16 v4, p36

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/db/entity/Workout;

    move-wide/from16 v5, p4

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move/from16 v12, p11

    move/from16 v13, p12

    move/from16 v14, p13

    move/from16 v15, p14

    move/from16 v16, p15

    move/from16 v17, p16

    move/from16 v18, p17

    move/from16 v19, p18

    move/from16 v20, p19

    move/from16 v21, p20

    move/from16 v22, p21

    move/from16 v23, p22

    move/from16 v24, p23

    move/from16 v25, p24

    move/from16 v26, p25

    move/from16 v27, p26

    move/from16 v28, p27

    move/from16 v29, p28

    move/from16 v30, p29

    move/from16 v31, p30

    move/from16 v32, p31

    move/from16 v33, p32

    move-object/from16 v34, p33

    move/from16 v38, p37

    move/from16 v39, p38

    move/from16 v40, p39

    move/from16 v41, p40

    move/from16 v42, p41

    move/from16 v43, p42

    move/from16 v44, p43

    move/from16 v45, p44

    move/from16 v46, p45

    move/from16 v47, p46

    move/from16 v48, p47

    move/from16 v49, p48

    move/from16 v50, p49

    move-object/from16 v51, p50

    move-object/from16 v52, p51

    move/from16 v53, p52

    move/from16 v54, p53

    move/from16 v55, p54

    move/from16 v56, p55

    move/from16 v57, p56

    move/from16 v58, p57

    move/from16 v59, p58

    move/from16 v60, p59

    move-object/from16 v61, p60

    move/from16 v62, p61

    move/from16 v63, p62

    move-object/from16 v64, p63

    move/from16 v65, p64

    move/from16 v66, p65

    move-object/from16 v67, p66

    move/from16 v68, p67

    move/from16 v69, p68

    move-object/from16 v70, p69

    move/from16 v71, p70

    move/from16 v72, p71

    move-object/from16 v73, p72

    move/from16 v74, p73

    move/from16 v75, p74

    move-object/from16 v76, p75

    move/from16 v77, p76

    move/from16 v78, p77

    move/from16 v79, p78

    move/from16 v80, p79

    move/from16 v81, p80

    move/from16 v82, p81

    move/from16 v83, p82

    move/from16 v84, p83

    move/from16 v85, p84

    move/from16 v86, p85

    move/from16 v87, p86

    move/from16 v88, p87

    move/from16 v89, p88

    move/from16 v90, p89

    move/from16 v91, p90

    move/from16 v92, p91

    move/from16 v93, p92

    move/from16 v94, p93

    move/from16 v95, p94

    move/from16 v96, p95

    move/from16 v97, p96

    move/from16 v98, p97

    move-object/from16 v99, p98

    move-object/from16 v100, p99

    move/from16 v101, p100

    move/from16 v102, p101

    move/from16 v103, p102

    move-object/from16 v104, p103

    move/from16 v105, p104

    move/from16 v106, p105

    move/from16 v107, p106

    move/from16 v108, p107

    move/from16 v109, p108

    move/from16 v110, p109

    move/from16 v111, p110

    move/from16 v112, p111

    move/from16 v113, p112

    move/from16 v114, p113

    move/from16 v115, p114

    move/from16 v116, p115

    move/from16 v117, p116

    move/from16 v118, p117

    move/from16 v119, p118

    move/from16 v120, p119

    move/from16 v121, p120

    move/from16 v122, p121

    move/from16 v123, p122

    move/from16 v124, p123

    move/from16 v125, p124

    move/from16 v126, p125

    move/from16 v127, p126

    move-object/from16 v128, p127

    move-object/from16 v129, p128

    move/from16 v130, p129

    move/from16 v131, p130

    move/from16 v132, p131

    move/from16 v133, p132

    move/from16 v134, p133

    move/from16 v135, p134

    move/from16 v136, p135

    move/from16 v137, p136

    move-object/from16 v138, p137

    move/from16 v139, p138

    move-object/from16 v140, p139

    move/from16 v141, p140

    move-wide/from16 v142, p141

    move/from16 v144, p143

    move/from16 v145, p144

    move-wide/from16 v146, p145

    move/from16 v148, p147

    move/from16 v149, p148

    move-wide/from16 v150, p149

    move/from16 v152, p151

    move/from16 v153, p152

    move/from16 v154, p153

    move/from16 v155, p154

    move/from16 v156, p155

    move/from16 v157, p156

    move/from16 v158, p157

    move/from16 v159, p158

    move/from16 v160, p159

    move/from16 v161, p160

    move-object/from16 v162, p161

    move/from16 v163, p162

    move-object/from16 v164, p163

    move/from16 v165, p164

    move-object/from16 v35, v2

    move-object/from16 v36, v3

    move-object/from16 v37, v4

    move/from16 v2, p1

    move-wide/from16 v3, p2

    invoke-direct/range {v1 .. v165}, Lcom/sma/smartv3/db/entity/Workout;-><init>(IJJLjava/lang/String;IIIIIIIIIIIIIIIIIIIIIIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIIFFIFIII[I[IIIIIIIIILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IIIIIIIIIIIIIIIIIIFIIF[I[FIIILjava/util/List;FFFFIIIIIIIIIIIIFFIIIIF[F[FIIIIIIIILjava/util/List;ILjava/util/List;IJIIJIIJIIIIIIFFIILjava/util/List;ILjava/lang/String;I)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/sma/smartv3/db/entity/Workout;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/db/entity/Workout;

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mId:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mId:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/Workout;->mStart:J

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/Workout;->mStart:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/Workout;->mEnd:J

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/Workout;->mEnd:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mLocalTime:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mLocalTime:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mDuration:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mDuration:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mAltitude:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mAltitude:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mAirPressure:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mAirPressure:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mSpm:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mSpm:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMode:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mMode:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mStep:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mStep:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mDistance:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mDistance:I

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCalorie:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mCalorie:I

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mSpeed:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mSpeed:I

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mPace:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mPace:I

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mAvgBpm:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mAvgBpm:I

    if-eq v1, v3, :cond_10

    return v2

    :cond_10
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMaxBpm:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mMaxBpm:I

    if-eq v1, v3, :cond_11

    return v2

    :cond_11
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMinBpm:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mMinBpm:I

    if-eq v1, v3, :cond_12

    return v2

    :cond_12
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMaxSpm:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mMaxSpm:I

    if-eq v1, v3, :cond_13

    return v2

    :cond_13
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMinSpm:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mMinSpm:I

    if-eq v1, v3, :cond_14

    return v2

    :cond_14
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMaxPace:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mMaxPace:I

    if-eq v1, v3, :cond_15

    return v2

    :cond_15
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMinPace:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mMinPace:I

    if-eq v1, v3, :cond_16

    return v2

    :cond_16
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMaxAltitude:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mMaxAltitude:I

    if-eq v1, v3, :cond_17

    return v2

    :cond_17
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMinAltitude:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mMinAltitude:I

    if-eq v1, v3, :cond_18

    return v2

    :cond_18
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMinStress:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mMinStress:I

    if-eq v1, v3, :cond_19

    return v2

    :cond_19
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMaxStress:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mMaxStress:I

    if-eq v1, v3, :cond_1a

    return v2

    :cond_1a
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mAvgStress:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mAvgStress:I

    if-eq v1, v3, :cond_1b

    return v2

    :cond_1b
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mSource:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mSource:I

    if-eq v1, v3, :cond_1c

    return v2

    :cond_1c
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mIsSync:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mIsSync:I

    if-eq v1, v3, :cond_1d

    return v2

    :cond_1d
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mIsDelete:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mIsDelete:I

    if-eq v1, v3, :cond_1e

    return v2

    :cond_1e
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mFeel:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mFeel:I

    if-eq v1, v3, :cond_1f

    return v2

    :cond_1f
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mPrototype:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mPrototype:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_20

    return v2

    :cond_20
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mFirmwareFlag:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mFirmwareFlag:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_21

    return v2

    :cond_21
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mBleName:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mBleName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_22

    return v2

    :cond_22
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mPlatform:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mPlatform:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_23

    return v2

    :cond_23
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMaxSpeed:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mMaxSpeed:I

    if-eq v1, v3, :cond_24

    return v2

    :cond_24
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMinSpeed:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mMinSpeed:I

    if-eq v1, v3, :cond_25

    return v2

    :cond_25
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mRestDuration:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mRestDuration:I

    if-eq v1, v3, :cond_26

    return v2

    :cond_26
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mAGpsType:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mAGpsType:I

    if-eq v1, v3, :cond_27

    return v2

    :cond_27
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mType:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mType:I

    if-eq v1, v3, :cond_28

    return v2

    :cond_28
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMetTotal:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mMetTotal:I

    if-eq v1, v3, :cond_29

    return v2

    :cond_29
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mAerobic:F

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mAerobic:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_2a

    return v2

    :cond_2a
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mAnaerobic:F

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mAnaerobic:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_2b

    return v2

    :cond_2b
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mStamina:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mStamina:I

    if-eq v1, v3, :cond_2c

    return v2

    :cond_2c
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mAvgSpeed:F

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mAvgSpeed:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_2d

    return v2

    :cond_2d
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCadence:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mCadence:I

    if-eq v1, v3, :cond_2e

    return v2

    :cond_2e
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMaxCadence:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mMaxCadence:I

    if-eq v1, v3, :cond_2f

    return v2

    :cond_2f
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCnt:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mCnt:I

    if-eq v1, v3, :cond_30

    return v2

    :cond_30
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mBpmZoneCount:[I

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mBpmZoneCount:[I

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_31

    return v2

    :cond_31
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mPersonalZone:[I

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mPersonalZone:[I

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_32

    return v2

    :cond_32
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mLactateThresholdPace:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mLactateThresholdPace:I

    if-eq v1, v3, :cond_33

    return v2

    :cond_33
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mRecoveryTime:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mRecoveryTime:I

    if-eq v1, v3, :cond_34

    return v2

    :cond_34
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mTrainingLoad:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mTrainingLoad:I

    if-eq v1, v3, :cond_35

    return v2

    :cond_35
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMaxVO2:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mMaxVO2:I

    if-eq v1, v3, :cond_36

    return v2

    :cond_36
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mLactateThresholdHr:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mLactateThresholdHr:I

    if-eq v1, v3, :cond_37

    return v2

    :cond_37
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mAlgorithmMarking:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mAlgorithmMarking:I

    if-eq v1, v3, :cond_38

    return v2

    :cond_38
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mPathCount:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mPathCount:I

    if-eq v1, v3, :cond_39

    return v2

    :cond_39
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mPathSampleInterval:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mPathSampleInterval:I

    if-eq v1, v3, :cond_3a

    return v2

    :cond_3a
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mPathPoints:Ljava/util/List;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mPathPoints:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3b

    return v2

    :cond_3b
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mHrPathCount:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mHrPathCount:I

    if-eq v1, v3, :cond_3c

    return v2

    :cond_3c
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mHrPathSampleInterval:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mHrPathSampleInterval:I

    if-eq v1, v3, :cond_3d

    return v2

    :cond_3d
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mHrPathPoints:Ljava/util/List;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mHrPathPoints:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3e

    return v2

    :cond_3e
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mPacePathCount:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mPacePathCount:I

    if-eq v1, v3, :cond_3f

    return v2

    :cond_3f
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mPacePathSampleInterval:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mPacePathSampleInterval:I

    if-eq v1, v3, :cond_40

    return v2

    :cond_40
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mPacePathPoints:Ljava/util/List;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mPacePathPoints:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_41

    return v2

    :cond_41
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mSpeedPathCount:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mSpeedPathCount:I

    if-eq v1, v3, :cond_42

    return v2

    :cond_42
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mSpeedPathSampleInterval:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mSpeedPathSampleInterval:I

    if-eq v1, v3, :cond_43

    return v2

    :cond_43
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mSpeedPathPoints:Ljava/util/List;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mSpeedPathPoints:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_44

    return v2

    :cond_44
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCadencePathCount:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mCadencePathCount:I

    if-eq v1, v3, :cond_45

    return v2

    :cond_45
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCadencePathSampleInterval:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mCadencePathSampleInterval:I

    if-eq v1, v3, :cond_46

    return v2

    :cond_46
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCadencePathPoints:Ljava/util/List;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mCadencePathPoints:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_47

    return v2

    :cond_47
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mAltitudePathCount:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mAltitudePathCount:I

    if-eq v1, v3, :cond_48

    return v2

    :cond_48
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mAltitudePathSampleInterval:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mAltitudePathSampleInterval:I

    if-eq v1, v3, :cond_49

    return v2

    :cond_49
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mAltitudePathPoints:Ljava/util/List;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mAltitudePathPoints:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4a

    return v2

    :cond_4a
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mGoalDistance:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mGoalDistance:I

    if-eq v1, v3, :cond_4b

    return v2

    :cond_4b
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mGoalTime:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mGoalTime:I

    if-eq v1, v3, :cond_4c

    return v2

    :cond_4c
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mGoalCalorie:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mGoalCalorie:I

    if-eq v1, v3, :cond_4d

    return v2

    :cond_4d
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mPausedDuration:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mPausedDuration:I

    if-eq v1, v3, :cond_4e

    return v2

    :cond_4e
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCurBpm:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mCurBpm:I

    if-eq v1, v3, :cond_4f

    return v2

    :cond_4f
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mAscendAltitude:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mAscendAltitude:I

    if-eq v1, v3, :cond_50

    return v2

    :cond_50
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mDescendAltitude:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mDescendAltitude:I

    if-eq v1, v3, :cond_51

    return v2

    :cond_51
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCurStress:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mCurStress:I

    if-eq v1, v3, :cond_52

    return v2

    :cond_52
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mSwimType:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mSwimType:I

    if-eq v1, v3, :cond_53

    return v2

    :cond_53
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCntFore:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mCntFore:I

    if-eq v1, v3, :cond_54

    return v2

    :cond_54
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCntBack:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mCntBack:I

    if-eq v1, v3, :cond_55

    return v2

    :cond_55
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mBackSwingTime:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mBackSwingTime:I

    if-eq v1, v3, :cond_56

    return v2

    :cond_56
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mDownSwingTime:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mDownSwingTime:I

    if-eq v1, v3, :cond_57

    return v2

    :cond_57
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mDribbleTime:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mDribbleTime:I

    if-eq v1, v3, :cond_58

    return v2

    :cond_58
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mTripCount:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mTripCount:I

    if-eq v1, v3, :cond_59

    return v2

    :cond_59
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mSessionCount:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mSessionCount:I

    if-eq v1, v3, :cond_5a

    return v2

    :cond_5a
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mVerticalOscillation:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mVerticalOscillation:I

    if-eq v1, v3, :cond_5b

    return v2

    :cond_5b
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mRunPowerWatt:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mRunPowerWatt:I

    if-eq v1, v3, :cond_5c

    return v2

    :cond_5c
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mStepLen:F

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mStepLen:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_5d

    return v2

    :cond_5d
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mTrainingStatus:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mTrainingStatus:I

    if-eq v1, v3, :cond_5e

    return v2

    :cond_5e
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mFitnessAge:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mFitnessAge:I

    if-eq v1, v3, :cond_5f

    return v2

    :cond_5f
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mTlTrend:F

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mTlTrend:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_60

    return v2

    :cond_60
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mBestRunTime:[I

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mBestRunTime:[I

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_61

    return v2

    :cond_61
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mFitnessLevel:[F

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mFitnessLevel:[F

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_62

    return v2

    :cond_62
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCalorieTotal:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mCalorieTotal:I

    if-eq v1, v3, :cond_63

    return v2

    :cond_63
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mPowerCount:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mPowerCount:I

    if-eq v1, v3, :cond_64

    return v2

    :cond_64
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mPowerInterval:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mPowerInterval:I

    if-eq v1, v3, :cond_65

    return v2

    :cond_65
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mPowerPoints:Ljava/util/List;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mPowerPoints:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_66

    return v2

    :cond_66
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->realTimeAerobic:F

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->realTimeAerobic:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_67

    return v2

    :cond_67
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->realTimeAnaerobic:F

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->realTimeAnaerobic:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_68

    return v2

    :cond_68
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mFatTotal:F

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mFatTotal:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_69

    return v2

    :cond_69
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCarboTotal:F

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mCarboTotal:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_6a

    return v2

    :cond_6a
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorTargetTime:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorTargetTime:I

    if-eq v1, v3, :cond_6b

    return v2

    :cond_6b
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorActualTime:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorActualTime:I

    if-eq v1, v3, :cond_6c

    return v2

    :cond_6c
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorDifferenceTime:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorDifferenceTime:I

    if-eq v1, v3, :cond_6d

    return v2

    :cond_6d
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorStatusTime:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorStatusTime:I

    if-eq v1, v3, :cond_6e

    return v2

    :cond_6e
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorTargetDistance:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorTargetDistance:I

    if-eq v1, v3, :cond_6f

    return v2

    :cond_6f
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorActualDistance:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorActualDistance:I

    if-eq v1, v3, :cond_70

    return v2

    :cond_70
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorDifferenceDistance:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorDifferenceDistance:I

    if-eq v1, v3, :cond_71

    return v2

    :cond_71
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorStatusDistance:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorStatusDistance:I

    if-eq v1, v3, :cond_72

    return v2

    :cond_72
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorTargetPace:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorTargetPace:I

    if-eq v1, v3, :cond_73

    return v2

    :cond_73
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorActualPace:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorActualPace:I

    if-eq v1, v3, :cond_74

    return v2

    :cond_74
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorDifferencePace:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorDifferencePace:I

    if-eq v1, v3, :cond_75

    return v2

    :cond_75
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorStatusPace:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorStatusPace:I

    if-eq v1, v3, :cond_76

    return v2

    :cond_76
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorTargetSpeedV2:F

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorTargetSpeedV2:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_77

    return v2

    :cond_77
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorActualSpeedV2:F

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorActualSpeedV2:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_78

    return v2

    :cond_78
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorTargetSpeed:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorTargetSpeed:I

    if-eq v1, v3, :cond_79

    return v2

    :cond_79
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorActualSpeed:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorActualSpeed:I

    if-eq v1, v3, :cond_7a

    return v2

    :cond_7a
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorDifferenceSpeed:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorDifferenceSpeed:I

    if-eq v1, v3, :cond_7b

    return v2

    :cond_7b
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorStatusSpeed:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorStatusSpeed:I

    if-eq v1, v3, :cond_7c

    return v2

    :cond_7c
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMaxOxygenPower:F

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mMaxOxygenPower:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_7d

    return v2

    :cond_7d
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mTrendWeek:[F

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mTrendWeek:[F

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7e

    return v2

    :cond_7e
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCyclingIndex:[F

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mCyclingIndex:[F

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7f

    return v2

    :cond_7f
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mStaBalance:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mStaBalance:I

    if-eq v1, v3, :cond_80

    return v2

    :cond_80
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mSwimSwolf:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mSwimSwolf:I

    if-eq v1, v3, :cond_81

    return v2

    :cond_81
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCntLap:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mCntLap:I

    if-eq v1, v3, :cond_82

    return v2

    :cond_82
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mFrontCrawlPerc:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mFrontCrawlPerc:I

    if-eq v1, v3, :cond_83

    return v2

    :cond_83
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mBreaststrokePerc:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mBreaststrokePerc:I

    if-eq v1, v3, :cond_84

    return v2

    :cond_84
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mBackstrokePerc:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mBackstrokePerc:I

    if-eq v1, v3, :cond_85

    return v2

    :cond_85
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mButterflyPerc:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mButterflyPerc:I

    if-eq v1, v3, :cond_86

    return v2

    :cond_86
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mSpmPathPointsCount:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mSpmPathPointsCount:I

    if-eq v1, v3, :cond_87

    return v2

    :cond_87
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mSpmPathPointsPoints:Ljava/util/List;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mSpmPathPointsPoints:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_88

    return v2

    :cond_88
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mStepLenCount:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mStepLenCount:I

    if-eq v1, v3, :cond_89

    return v2

    :cond_89
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mStepLenPoints:Ljava/util/List;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mStepLenPoints:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8a

    return v2

    :cond_8a
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mEllipticalSteps:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mEllipticalSteps:I

    if-eq v1, v3, :cond_8b

    return v2

    :cond_8b
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildSwimStartTime:J

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/Workout;->mChildSwimStartTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_8c

    return v2

    :cond_8c
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildSwimDuration:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mChildSwimDuration:I

    if-eq v1, v3, :cond_8d

    return v2

    :cond_8d
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildSwimDistance:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mChildSwimDistance:I

    if-eq v1, v3, :cond_8e

    return v2

    :cond_8e
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildCyclingStartTime:J

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/Workout;->mChildCyclingStartTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_8f

    return v2

    :cond_8f
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildCyclingDuration:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mChildCyclingDuration:I

    if-eq v1, v3, :cond_90

    return v2

    :cond_90
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildCyclingDistance:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mChildCyclingDistance:I

    if-eq v1, v3, :cond_91

    return v2

    :cond_91
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildRunStartTime:J

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/Workout;->mChildRunStartTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_92

    return v2

    :cond_92
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildRunDuration:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mChildRunDuration:I

    if-eq v1, v3, :cond_93

    return v2

    :cond_93
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildRunDistance:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mChildRunDistance:I

    if-eq v1, v3, :cond_94

    return v2

    :cond_94
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildSwimMode:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mChildSwimMode:I

    if-eq v1, v3, :cond_95

    return v2

    :cond_95
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildCyclingMode:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mChildCyclingMode:I

    if-eq v1, v3, :cond_96

    return v2

    :cond_96
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildRunMode:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mChildRunMode:I

    if-eq v1, v3, :cond_97

    return v2

    :cond_97
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildNumber:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mChildNumber:I

    if-eq v1, v3, :cond_98

    return v2

    :cond_98
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mRunLactateAvg:F

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mRunLactateAvg:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_99

    return v2

    :cond_99
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCyclingLactateAvg:F

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mCyclingLactateAvg:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_9a

    return v2

    :cond_9a
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mFlag:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mFlag:I

    if-eq v1, v3, :cond_9b

    return v2

    :cond_9b
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mRecoveryHrCount:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mRecoveryHrCount:I

    if-eq v1, v3, :cond_9c

    return v2

    :cond_9c
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mRecoveryHrPoints:Ljava/util/List;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mRecoveryHrPoints:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9d

    return v2

    :cond_9d
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mSwimPoolLength:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mSwimPoolLength:I

    if-eq v1, v3, :cond_9e

    return v2

    :cond_9e
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mDeviceId:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/Workout;->mDeviceId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9f

    return v2

    :cond_9f
    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mAICoachSportID:I

    iget p1, p1, Lcom/sma/smartv3/db/entity/Workout;->mAICoachSportID:I

    if-eq v1, p1, :cond_a0

    return v2

    :cond_a0
    return v0
.end method

.method public final getMAGpsType()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mAGpsType:I

    return v0
.end method

.method public final getMAICoachSportID()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mAICoachSportID:I

    return v0
.end method

.method public final getMAerobic()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mAerobic:F

    return v0
.end method

.method public final getMAirPressure()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mAirPressure:I

    return v0
.end method

.method public final getMAlgorithmMarking()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mAlgorithmMarking:I

    return v0
.end method

.method public final getMAltitude()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mAltitude:I

    return v0
.end method

.method public final getMAltitudePathCount()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mAltitudePathCount:I

    return v0
.end method

.method public final getMAltitudePathPoints()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mAltitudePathPoints:Ljava/util/List;

    return-object v0
.end method

.method public final getMAltitudePathSampleInterval()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mAltitudePathSampleInterval:I

    return v0
.end method

.method public final getMAnaerobic()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mAnaerobic:F

    return v0
.end method

.method public final getMAscendAltitude()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mAscendAltitude:I

    return v0
.end method

.method public final getMAvgBpm()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mAvgBpm:I

    return v0
.end method

.method public final getMAvgSpeed()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mAvgSpeed:F

    return v0
.end method

.method public final getMAvgStress()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mAvgStress:I

    return v0
.end method

.method public final getMBackSwingTime()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mBackSwingTime:I

    return v0
.end method

.method public final getMBackstrokePerc()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mBackstrokePerc:I

    return v0
.end method

.method public final getMBestRunTime()[I
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mBestRunTime:[I

    return-object v0
.end method

.method public final getMBleName()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mBleName:Ljava/lang/String;

    return-object v0
.end method

.method public final getMBpmZoneCount()[I
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mBpmZoneCount:[I

    return-object v0
.end method

.method public final getMBreaststrokePerc()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mBreaststrokePerc:I

    return v0
.end method

.method public final getMButterflyPerc()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mButterflyPerc:I

    return v0
.end method

.method public final getMCadence()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mCadence:I

    return v0
.end method

.method public final getMCadencePathCount()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mCadencePathCount:I

    return v0
.end method

.method public final getMCadencePathPoints()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mCadencePathPoints:Ljava/util/List;

    return-object v0
.end method

.method public final getMCadencePathSampleInterval()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mCadencePathSampleInterval:I

    return v0
.end method

.method public final getMCalorie()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mCalorie:I

    return v0
.end method

.method public final getMCalorieTotal()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mCalorieTotal:I

    return v0
.end method

.method public final getMCarboTotal()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mCarboTotal:F

    return v0
.end method

.method public final getMChildCyclingDistance()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildCyclingDistance:I

    return v0
.end method

.method public final getMChildCyclingDuration()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildCyclingDuration:I

    return v0
.end method

.method public final getMChildCyclingMode()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildCyclingMode:I

    return v0
.end method

.method public final getMChildCyclingStartTime()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildCyclingStartTime:J

    return-wide v0
.end method

.method public final getMChildNumber()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildNumber:I

    return v0
.end method

.method public final getMChildRunDistance()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildRunDistance:I

    return v0
.end method

.method public final getMChildRunDuration()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildRunDuration:I

    return v0
.end method

.method public final getMChildRunMode()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildRunMode:I

    return v0
.end method

.method public final getMChildRunStartTime()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildRunStartTime:J

    return-wide v0
.end method

.method public final getMChildSwimDistance()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildSwimDistance:I

    return v0
.end method

.method public final getMChildSwimDuration()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildSwimDuration:I

    return v0
.end method

.method public final getMChildSwimMode()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildSwimMode:I

    return v0
.end method

.method public final getMChildSwimStartTime()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildSwimStartTime:J

    return-wide v0
.end method

.method public final getMCnt()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mCnt:I

    return v0
.end method

.method public final getMCntBack()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mCntBack:I

    return v0
.end method

.method public final getMCntFore()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mCntFore:I

    return v0
.end method

.method public final getMCntLap()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mCntLap:I

    return v0
.end method

.method public final getMCurBpm()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mCurBpm:I

    return v0
.end method

.method public final getMCurStress()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mCurStress:I

    return v0
.end method

.method public final getMCyclingIndex()[F
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mCyclingIndex:[F

    return-object v0
.end method

.method public final getMCyclingLactateAvg()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mCyclingLactateAvg:F

    return v0
.end method

.method public final getMDescendAltitude()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mDescendAltitude:I

    return v0
.end method

.method public final getMDeviceId()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mDeviceId:Ljava/lang/String;

    return-object v0
.end method

.method public final getMDistance()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mDistance:I

    return v0
.end method

.method public final getMDownSwingTime()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mDownSwingTime:I

    return v0
.end method

.method public final getMDribbleTime()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mDribbleTime:I

    return v0
.end method

.method public final getMDuration()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mDuration:I

    return v0
.end method

.method public final getMEllipticalSteps()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mEllipticalSteps:I

    return v0
.end method

.method public final getMEnd()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mEnd:J

    return-wide v0
.end method

.method public final getMFatTotal()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mFatTotal:F

    return v0
.end method

.method public final getMFeel()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mFeel:I

    return v0
.end method

.method public final getMFirmwareFlag()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mFirmwareFlag:Ljava/lang/String;

    return-object v0
.end method

.method public final getMFitnessAge()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mFitnessAge:I

    return v0
.end method

.method public final getMFitnessLevel()[F
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mFitnessLevel:[F

    return-object v0
.end method

.method public final getMFlag()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mFlag:I

    return v0
.end method

.method public final getMFrontCrawlPerc()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mFrontCrawlPerc:I

    return v0
.end method

.method public final getMGoalCalorie()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mGoalCalorie:I

    return v0
.end method

.method public final getMGoalDistance()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mGoalDistance:I

    return v0
.end method

.method public final getMGoalTime()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mGoalTime:I

    return v0
.end method

.method public final getMHrPathCount()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mHrPathCount:I

    return v0
.end method

.method public final getMHrPathPoints()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mHrPathPoints:Ljava/util/List;

    return-object v0
.end method

.method public final getMHrPathSampleInterval()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mHrPathSampleInterval:I

    return v0
.end method

.method public final getMId()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mId:I

    return v0
.end method

.method public final getMIsDelete()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mIsDelete:I

    return v0
.end method

.method public final getMIsSync()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mIsSync:I

    return v0
.end method

.method public final getMLactateThresholdHr()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mLactateThresholdHr:I

    return v0
.end method

.method public final getMLactateThresholdPace()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mLactateThresholdPace:I

    return v0
.end method

.method public final getMLocalTime()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mLocalTime:Ljava/lang/String;

    return-object v0
.end method

.method public final getMMaxAltitude()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mMaxAltitude:I

    return v0
.end method

.method public final getMMaxBpm()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mMaxBpm:I

    return v0
.end method

.method public final getMMaxCadence()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mMaxCadence:I

    return v0
.end method

.method public final getMMaxOxygenPower()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mMaxOxygenPower:F

    return v0
.end method

.method public final getMMaxPace()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mMaxPace:I

    return v0
.end method

.method public final getMMaxSpeed()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mMaxSpeed:I

    return v0
.end method

.method public final getMMaxSpm()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mMaxSpm:I

    return v0
.end method

.method public final getMMaxStress()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mMaxStress:I

    return v0
.end method

.method public final getMMaxVO2()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mMaxVO2:I

    return v0
.end method

.method public final getMMetTotal()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mMetTotal:I

    return v0
.end method

.method public final getMMinAltitude()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mMinAltitude:I

    return v0
.end method

.method public final getMMinBpm()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mMinBpm:I

    return v0
.end method

.method public final getMMinPace()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mMinPace:I

    return v0
.end method

.method public final getMMinSpeed()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mMinSpeed:I

    return v0
.end method

.method public final getMMinSpm()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mMinSpm:I

    return v0
.end method

.method public final getMMinStress()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mMinStress:I

    return v0
.end method

.method public final getMMode()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mMode:I

    return v0
.end method

.method public final getMNavigatorActualDistance()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorActualDistance:I

    return v0
.end method

.method public final getMNavigatorActualPace()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorActualPace:I

    return v0
.end method

.method public final getMNavigatorActualSpeed()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorActualSpeed:I

    return v0
.end method

.method public final getMNavigatorActualSpeedV2()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorActualSpeedV2:F

    return v0
.end method

.method public final getMNavigatorActualTime()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorActualTime:I

    return v0
.end method

.method public final getMNavigatorDifferenceDistance()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorDifferenceDistance:I

    return v0
.end method

.method public final getMNavigatorDifferencePace()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorDifferencePace:I

    return v0
.end method

.method public final getMNavigatorDifferenceSpeed()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorDifferenceSpeed:I

    return v0
.end method

.method public final getMNavigatorDifferenceTime()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorDifferenceTime:I

    return v0
.end method

.method public final getMNavigatorStatusDistance()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorStatusDistance:I

    return v0
.end method

.method public final getMNavigatorStatusPace()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorStatusPace:I

    return v0
.end method

.method public final getMNavigatorStatusSpeed()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorStatusSpeed:I

    return v0
.end method

.method public final getMNavigatorStatusTime()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorStatusTime:I

    return v0
.end method

.method public final getMNavigatorTargetDistance()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorTargetDistance:I

    return v0
.end method

.method public final getMNavigatorTargetPace()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorTargetPace:I

    return v0
.end method

.method public final getMNavigatorTargetSpeed()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorTargetSpeed:I

    return v0
.end method

.method public final getMNavigatorTargetSpeedV2()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorTargetSpeedV2:F

    return v0
.end method

.method public final getMNavigatorTargetTime()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorTargetTime:I

    return v0
.end method

.method public final getMPace()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mPace:I

    return v0
.end method

.method public final getMPacePathCount()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mPacePathCount:I

    return v0
.end method

.method public final getMPacePathPoints()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mPacePathPoints:Ljava/util/List;

    return-object v0
.end method

.method public final getMPacePathSampleInterval()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mPacePathSampleInterval:I

    return v0
.end method

.method public final getMPathCount()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mPathCount:I

    return v0
.end method

.method public final getMPathPoints()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "[F>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mPathPoints:Ljava/util/List;

    return-object v0
.end method

.method public final getMPathSampleInterval()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mPathSampleInterval:I

    return v0
.end method

.method public final getMPausedDuration()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mPausedDuration:I

    return v0
.end method

.method public final getMPersonalZone()[I
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mPersonalZone:[I

    return-object v0
.end method

.method public final getMPlatform()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mPlatform:Ljava/lang/String;

    return-object v0
.end method

.method public final getMPowerCount()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mPowerCount:I

    return v0
.end method

.method public final getMPowerInterval()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mPowerInterval:I

    return v0
.end method

.method public final getMPowerPoints()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mPowerPoints:Ljava/util/List;

    return-object v0
.end method

.method public final getMPrototype()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mPrototype:Ljava/lang/String;

    return-object v0
.end method

.method public final getMRecoveryHrCount()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mRecoveryHrCount:I

    return v0
.end method

.method public final getMRecoveryHrPoints()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mRecoveryHrPoints:Ljava/util/List;

    return-object v0
.end method

.method public final getMRecoveryTime()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mRecoveryTime:I

    return v0
.end method

.method public final getMRestDuration()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mRestDuration:I

    return v0
.end method

.method public final getMRunLactateAvg()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mRunLactateAvg:F

    return v0
.end method

.method public final getMRunPowerWatt()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mRunPowerWatt:I

    return v0
.end method

.method public final getMSessionCount()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mSessionCount:I

    return v0
.end method

.method public final getMSource()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mSource:I

    return v0
.end method

.method public final getMSpeed()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mSpeed:I

    return v0
.end method

.method public final getMSpeedPathCount()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mSpeedPathCount:I

    return v0
.end method

.method public final getMSpeedPathPoints()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mSpeedPathPoints:Ljava/util/List;

    return-object v0
.end method

.method public final getMSpeedPathSampleInterval()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mSpeedPathSampleInterval:I

    return v0
.end method

.method public final getMSpm()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mSpm:I

    return v0
.end method

.method public final getMSpmPathPointsCount()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mSpmPathPointsCount:I

    return v0
.end method

.method public final getMSpmPathPointsPoints()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mSpmPathPointsPoints:Ljava/util/List;

    return-object v0
.end method

.method public final getMStaBalance()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mStaBalance:I

    return v0
.end method

.method public final getMStamina()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mStamina:I

    return v0
.end method

.method public final getMStart()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mStart:J

    return-wide v0
.end method

.method public final getMStep()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mStep:I

    return v0
.end method

.method public final getMStepLen()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mStepLen:F

    return v0
.end method

.method public final getMStepLenCount()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mStepLenCount:I

    return v0
.end method

.method public final getMStepLenPoints()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mStepLenPoints:Ljava/util/List;

    return-object v0
.end method

.method public final getMSwimPoolLength()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mSwimPoolLength:I

    return v0
.end method

.method public final getMSwimSwolf()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mSwimSwolf:I

    return v0
.end method

.method public final getMSwimType()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mSwimType:I

    return v0
.end method

.method public final getMTlTrend()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mTlTrend:F

    return v0
.end method

.method public final getMTrainingLoad()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mTrainingLoad:I

    return v0
.end method

.method public final getMTrainingStatus()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mTrainingStatus:I

    return v0
.end method

.method public final getMTrendWeek()[F
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mTrendWeek:[F

    return-object v0
.end method

.method public final getMTripCount()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mTripCount:I

    return v0
.end method

.method public final getMType()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mType:I

    return v0
.end method

.method public final getMVerticalOscillation()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mVerticalOscillation:I

    return v0
.end method

.method public final getRealTimeAerobic()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->realTimeAerobic:F

    return v0
.end method

.method public final getRealTimeAnaerobic()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->realTimeAnaerobic:F

    return v0
.end method

.method public hashCode()I
    .locals 5

    iget v0, p0, Lcom/sma/smartv3/db/entity/Workout;->mId:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mStart:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mEnd:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mLocalTime:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mDuration:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mAltitude:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mAirPressure:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mSpm:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMode:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mStep:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mDistance:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCalorie:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mSpeed:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mPace:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mAvgBpm:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMaxBpm:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMinBpm:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMaxSpm:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMinSpm:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMaxPace:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMinPace:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMaxAltitude:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMinAltitude:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMinStress:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMaxStress:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mAvgStress:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mSource:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mIsSync:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mIsDelete:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mFeel:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mPrototype:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mFirmwareFlag:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mBleName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mPlatform:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMaxSpeed:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMinSpeed:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mRestDuration:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mAGpsType:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mType:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMetTotal:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mAerobic:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mAnaerobic:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mStamina:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mAvgSpeed:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCadence:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMaxCadence:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCnt:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mBpmZoneCount:[I

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([I)I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mPersonalZone:[I

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([I)I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mLactateThresholdPace:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mRecoveryTime:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mTrainingLoad:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMaxVO2:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mLactateThresholdHr:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mAlgorithmMarking:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mPathCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mPathSampleInterval:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mPathPoints:Ljava/util/List;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mHrPathCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mHrPathSampleInterval:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mHrPathPoints:Ljava/util/List;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mPacePathCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mPacePathSampleInterval:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mPacePathPoints:Ljava/util/List;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mSpeedPathCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mSpeedPathSampleInterval:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mSpeedPathPoints:Ljava/util/List;

    if-nez v1, :cond_5

    move v1, v2

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCadencePathCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCadencePathSampleInterval:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCadencePathPoints:Ljava/util/List;

    if-nez v1, :cond_6

    move v1, v2

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mAltitudePathCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mAltitudePathSampleInterval:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mAltitudePathPoints:Ljava/util/List;

    if-nez v1, :cond_7

    move v1, v2

    goto :goto_7

    :cond_7
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_7
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mGoalDistance:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mGoalTime:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mGoalCalorie:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mPausedDuration:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCurBpm:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mAscendAltitude:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mDescendAltitude:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCurStress:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mSwimType:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCntFore:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCntBack:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mBackSwingTime:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mDownSwingTime:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mDribbleTime:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mTripCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mSessionCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mVerticalOscillation:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mRunPowerWatt:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mStepLen:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mTrainingStatus:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mFitnessAge:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mTlTrend:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mBestRunTime:[I

    if-nez v1, :cond_8

    move v1, v2

    goto :goto_8

    :cond_8
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([I)I

    move-result v1

    :goto_8
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mFitnessLevel:[F

    if-nez v1, :cond_9

    move v1, v2

    goto :goto_9

    :cond_9
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([F)I

    move-result v1

    :goto_9
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCalorieTotal:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mPowerCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mPowerInterval:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mPowerPoints:Ljava/util/List;

    if-nez v1, :cond_a

    move v1, v2

    goto :goto_a

    :cond_a
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_a
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->realTimeAerobic:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->realTimeAnaerobic:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mFatTotal:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCarboTotal:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorTargetTime:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorActualTime:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorDifferenceTime:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorStatusTime:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorTargetDistance:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorActualDistance:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorDifferenceDistance:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorStatusDistance:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorTargetPace:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorActualPace:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorDifferencePace:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorStatusPace:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorTargetSpeedV2:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorActualSpeedV2:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorTargetSpeed:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorActualSpeed:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorDifferenceSpeed:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorStatusSpeed:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMaxOxygenPower:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mTrendWeek:[F

    if-nez v1, :cond_b

    move v1, v2

    goto :goto_b

    :cond_b
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([F)I

    move-result v1

    :goto_b
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCyclingIndex:[F

    if-nez v1, :cond_c

    move v1, v2

    goto :goto_c

    :cond_c
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([F)I

    move-result v1

    :goto_c
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mStaBalance:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mSwimSwolf:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCntLap:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mFrontCrawlPerc:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mBreaststrokePerc:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mBackstrokePerc:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mButterflyPerc:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mSpmPathPointsCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mSpmPathPointsPoints:Ljava/util/List;

    if-nez v1, :cond_d

    move v1, v2

    goto :goto_d

    :cond_d
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_d
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mStepLenCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mStepLenPoints:Ljava/util/List;

    if-nez v1, :cond_e

    move v1, v2

    goto :goto_e

    :cond_e
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_e
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mEllipticalSteps:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildSwimStartTime:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildSwimDuration:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildSwimDistance:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildCyclingStartTime:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildCyclingDuration:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildCyclingDistance:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildRunStartTime:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildRunDuration:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildRunDistance:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildSwimMode:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildCyclingMode:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildRunMode:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildNumber:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mRunLactateAvg:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCyclingLactateAvg:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mFlag:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mRecoveryHrCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mRecoveryHrPoints:Ljava/util/List;

    if-nez v1, :cond_f

    move v1, v2

    goto :goto_f

    :cond_f
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_f
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mSwimPoolLength:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mDeviceId:Ljava/lang/String;

    if-nez v1, :cond_10

    goto :goto_10

    :cond_10
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_10
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/Workout;->mAICoachSportID:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMAGpsType(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mAGpsType:I

    return-void
.end method

.method public final setMAICoachSportID(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mAICoachSportID:I

    return-void
.end method

.method public final setMAerobic(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mAerobic:F

    return-void
.end method

.method public final setMAirPressure(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mAirPressure:I

    return-void
.end method

.method public final setMAlgorithmMarking(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mAlgorithmMarking:I

    return-void
.end method

.method public final setMAltitude(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mAltitude:I

    return-void
.end method

.method public final setMAltitudePathCount(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mAltitudePathCount:I

    return-void
.end method

.method public final setMAltitudePathPoints(Ljava/util/List;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mAltitudePathPoints:Ljava/util/List;

    return-void
.end method

.method public final setMAltitudePathSampleInterval(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mAltitudePathSampleInterval:I

    return-void
.end method

.method public final setMAnaerobic(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mAnaerobic:F

    return-void
.end method

.method public final setMAscendAltitude(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mAscendAltitude:I

    return-void
.end method

.method public final setMAvgBpm(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mAvgBpm:I

    return-void
.end method

.method public final setMAvgSpeed(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mAvgSpeed:F

    return-void
.end method

.method public final setMAvgStress(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mAvgStress:I

    return-void
.end method

.method public final setMBackSwingTime(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mBackSwingTime:I

    return-void
.end method

.method public final setMBackstrokePerc(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mBackstrokePerc:I

    return-void
.end method

.method public final setMBestRunTime([I)V
    .locals 0
    .param p1    # [I
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mBestRunTime:[I

    return-void
.end method

.method public final setMBleName(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mBleName:Ljava/lang/String;

    return-void
.end method

.method public final setMBpmZoneCount([I)V
    .locals 0
    .param p1    # [I
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mBpmZoneCount:[I

    return-void
.end method

.method public final setMBreaststrokePerc(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mBreaststrokePerc:I

    return-void
.end method

.method public final setMButterflyPerc(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mButterflyPerc:I

    return-void
.end method

.method public final setMCadence(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCadence:I

    return-void
.end method

.method public final setMCadencePathCount(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCadencePathCount:I

    return-void
.end method

.method public final setMCadencePathPoints(Ljava/util/List;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCadencePathPoints:Ljava/util/List;

    return-void
.end method

.method public final setMCadencePathSampleInterval(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCadencePathSampleInterval:I

    return-void
.end method

.method public final setMCalorie(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCalorie:I

    return-void
.end method

.method public final setMCalorieTotal(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCalorieTotal:I

    return-void
.end method

.method public final setMCarboTotal(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCarboTotal:F

    return-void
.end method

.method public final setMChildCyclingDistance(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildCyclingDistance:I

    return-void
.end method

.method public final setMChildCyclingDuration(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildCyclingDuration:I

    return-void
.end method

.method public final setMChildCyclingMode(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildCyclingMode:I

    return-void
.end method

.method public final setMChildCyclingStartTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildCyclingStartTime:J

    return-void
.end method

.method public final setMChildNumber(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildNumber:I

    return-void
.end method

.method public final setMChildRunDistance(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildRunDistance:I

    return-void
.end method

.method public final setMChildRunDuration(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildRunDuration:I

    return-void
.end method

.method public final setMChildRunMode(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildRunMode:I

    return-void
.end method

.method public final setMChildRunStartTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildRunStartTime:J

    return-void
.end method

.method public final setMChildSwimDistance(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildSwimDistance:I

    return-void
.end method

.method public final setMChildSwimDuration(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildSwimDuration:I

    return-void
.end method

.method public final setMChildSwimMode(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildSwimMode:I

    return-void
.end method

.method public final setMChildSwimStartTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mChildSwimStartTime:J

    return-void
.end method

.method public final setMCnt(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCnt:I

    return-void
.end method

.method public final setMCntBack(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCntBack:I

    return-void
.end method

.method public final setMCntFore(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCntFore:I

    return-void
.end method

.method public final setMCntLap(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCntLap:I

    return-void
.end method

.method public final setMCurBpm(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCurBpm:I

    return-void
.end method

.method public final setMCurStress(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCurStress:I

    return-void
.end method

.method public final setMCyclingIndex([F)V
    .locals 0
    .param p1    # [F
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCyclingIndex:[F

    return-void
.end method

.method public final setMCyclingLactateAvg(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mCyclingLactateAvg:F

    return-void
.end method

.method public final setMDescendAltitude(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mDescendAltitude:I

    return-void
.end method

.method public final setMDeviceId(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mDeviceId:Ljava/lang/String;

    return-void
.end method

.method public final setMDistance(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mDistance:I

    return-void
.end method

.method public final setMDownSwingTime(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mDownSwingTime:I

    return-void
.end method

.method public final setMDribbleTime(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mDribbleTime:I

    return-void
.end method

.method public final setMDuration(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mDuration:I

    return-void
.end method

.method public final setMEllipticalSteps(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mEllipticalSteps:I

    return-void
.end method

.method public final setMEnd(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mEnd:J

    return-void
.end method

.method public final setMFatTotal(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mFatTotal:F

    return-void
.end method

.method public final setMFeel(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mFeel:I

    return-void
.end method

.method public final setMFirmwareFlag(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mFirmwareFlag:Ljava/lang/String;

    return-void
.end method

.method public final setMFitnessAge(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mFitnessAge:I

    return-void
.end method

.method public final setMFitnessLevel([F)V
    .locals 0
    .param p1    # [F
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mFitnessLevel:[F

    return-void
.end method

.method public final setMFlag(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mFlag:I

    return-void
.end method

.method public final setMFrontCrawlPerc(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mFrontCrawlPerc:I

    return-void
.end method

.method public final setMGoalCalorie(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mGoalCalorie:I

    return-void
.end method

.method public final setMGoalDistance(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mGoalDistance:I

    return-void
.end method

.method public final setMGoalTime(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mGoalTime:I

    return-void
.end method

.method public final setMHrPathCount(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mHrPathCount:I

    return-void
.end method

.method public final setMHrPathPoints(Ljava/util/List;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mHrPathPoints:Ljava/util/List;

    return-void
.end method

.method public final setMHrPathSampleInterval(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mHrPathSampleInterval:I

    return-void
.end method

.method public final setMIsDelete(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mIsDelete:I

    return-void
.end method

.method public final setMIsSync(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mIsSync:I

    return-void
.end method

.method public final setMLactateThresholdHr(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mLactateThresholdHr:I

    return-void
.end method

.method public final setMLactateThresholdPace(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mLactateThresholdPace:I

    return-void
.end method

.method public final setMLocalTime(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mLocalTime:Ljava/lang/String;

    return-void
.end method

.method public final setMMaxAltitude(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMaxAltitude:I

    return-void
.end method

.method public final setMMaxBpm(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMaxBpm:I

    return-void
.end method

.method public final setMMaxCadence(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMaxCadence:I

    return-void
.end method

.method public final setMMaxOxygenPower(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMaxOxygenPower:F

    return-void
.end method

.method public final setMMaxPace(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMaxPace:I

    return-void
.end method

.method public final setMMaxSpeed(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMaxSpeed:I

    return-void
.end method

.method public final setMMaxSpm(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMaxSpm:I

    return-void
.end method

.method public final setMMaxStress(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMaxStress:I

    return-void
.end method

.method public final setMMaxVO2(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMaxVO2:I

    return-void
.end method

.method public final setMMetTotal(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMetTotal:I

    return-void
.end method

.method public final setMMinAltitude(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMinAltitude:I

    return-void
.end method

.method public final setMMinBpm(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMinBpm:I

    return-void
.end method

.method public final setMMinPace(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMinPace:I

    return-void
.end method

.method public final setMMinSpeed(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMinSpeed:I

    return-void
.end method

.method public final setMMinSpm(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMinSpm:I

    return-void
.end method

.method public final setMMinStress(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMinStress:I

    return-void
.end method

.method public final setMMode(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mMode:I

    return-void
.end method

.method public final setMNavigatorActualDistance(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorActualDistance:I

    return-void
.end method

.method public final setMNavigatorActualPace(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorActualPace:I

    return-void
.end method

.method public final setMNavigatorActualSpeed(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorActualSpeed:I

    return-void
.end method

.method public final setMNavigatorActualSpeedV2(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorActualSpeedV2:F

    return-void
.end method

.method public final setMNavigatorActualTime(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorActualTime:I

    return-void
.end method

.method public final setMNavigatorDifferenceDistance(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorDifferenceDistance:I

    return-void
.end method

.method public final setMNavigatorDifferencePace(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorDifferencePace:I

    return-void
.end method

.method public final setMNavigatorDifferenceSpeed(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorDifferenceSpeed:I

    return-void
.end method

.method public final setMNavigatorDifferenceTime(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorDifferenceTime:I

    return-void
.end method

.method public final setMNavigatorStatusDistance(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorStatusDistance:I

    return-void
.end method

.method public final setMNavigatorStatusPace(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorStatusPace:I

    return-void
.end method

.method public final setMNavigatorStatusSpeed(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorStatusSpeed:I

    return-void
.end method

.method public final setMNavigatorStatusTime(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorStatusTime:I

    return-void
.end method

.method public final setMNavigatorTargetDistance(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorTargetDistance:I

    return-void
.end method

.method public final setMNavigatorTargetPace(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorTargetPace:I

    return-void
.end method

.method public final setMNavigatorTargetSpeed(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorTargetSpeed:I

    return-void
.end method

.method public final setMNavigatorTargetSpeedV2(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorTargetSpeedV2:F

    return-void
.end method

.method public final setMNavigatorTargetTime(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorTargetTime:I

    return-void
.end method

.method public final setMPace(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mPace:I

    return-void
.end method

.method public final setMPacePathCount(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mPacePathCount:I

    return-void
.end method

.method public final setMPacePathPoints(Ljava/util/List;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mPacePathPoints:Ljava/util/List;

    return-void
.end method

.method public final setMPacePathSampleInterval(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mPacePathSampleInterval:I

    return-void
.end method

.method public final setMPathCount(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mPathCount:I

    return-void
.end method

.method public final setMPathPoints(Ljava/util/List;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "[F>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mPathPoints:Ljava/util/List;

    return-void
.end method

.method public final setMPathSampleInterval(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mPathSampleInterval:I

    return-void
.end method

.method public final setMPausedDuration(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mPausedDuration:I

    return-void
.end method

.method public final setMPersonalZone([I)V
    .locals 0
    .param p1    # [I
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mPersonalZone:[I

    return-void
.end method

.method public final setMPlatform(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mPlatform:Ljava/lang/String;

    return-void
.end method

.method public final setMPowerCount(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mPowerCount:I

    return-void
.end method

.method public final setMPowerInterval(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mPowerInterval:I

    return-void
.end method

.method public final setMPowerPoints(Ljava/util/List;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mPowerPoints:Ljava/util/List;

    return-void
.end method

.method public final setMPrototype(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mPrototype:Ljava/lang/String;

    return-void
.end method

.method public final setMRecoveryHrCount(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mRecoveryHrCount:I

    return-void
.end method

.method public final setMRecoveryHrPoints(Ljava/util/List;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mRecoveryHrPoints:Ljava/util/List;

    return-void
.end method

.method public final setMRecoveryTime(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mRecoveryTime:I

    return-void
.end method

.method public final setMRestDuration(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mRestDuration:I

    return-void
.end method

.method public final setMRunLactateAvg(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mRunLactateAvg:F

    return-void
.end method

.method public final setMRunPowerWatt(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mRunPowerWatt:I

    return-void
.end method

.method public final setMSessionCount(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mSessionCount:I

    return-void
.end method

.method public final setMSource(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mSource:I

    return-void
.end method

.method public final setMSpeed(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mSpeed:I

    return-void
.end method

.method public final setMSpeedPathCount(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mSpeedPathCount:I

    return-void
.end method

.method public final setMSpeedPathPoints(Ljava/util/List;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mSpeedPathPoints:Ljava/util/List;

    return-void
.end method

.method public final setMSpeedPathSampleInterval(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mSpeedPathSampleInterval:I

    return-void
.end method

.method public final setMSpm(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mSpm:I

    return-void
.end method

.method public final setMSpmPathPointsCount(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mSpmPathPointsCount:I

    return-void
.end method

.method public final setMSpmPathPointsPoints(Ljava/util/List;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mSpmPathPointsPoints:Ljava/util/List;

    return-void
.end method

.method public final setMStaBalance(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mStaBalance:I

    return-void
.end method

.method public final setMStamina(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mStamina:I

    return-void
.end method

.method public final setMStart(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mStart:J

    return-void
.end method

.method public final setMStep(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mStep:I

    return-void
.end method

.method public final setMStepLen(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mStepLen:F

    return-void
.end method

.method public final setMStepLenCount(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mStepLenCount:I

    return-void
.end method

.method public final setMStepLenPoints(Ljava/util/List;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mStepLenPoints:Ljava/util/List;

    return-void
.end method

.method public final setMSwimPoolLength(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mSwimPoolLength:I

    return-void
.end method

.method public final setMSwimSwolf(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mSwimSwolf:I

    return-void
.end method

.method public final setMSwimType(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mSwimType:I

    return-void
.end method

.method public final setMTlTrend(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mTlTrend:F

    return-void
.end method

.method public final setMTrainingLoad(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mTrainingLoad:I

    return-void
.end method

.method public final setMTrainingStatus(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mTrainingStatus:I

    return-void
.end method

.method public final setMTrendWeek([F)V
    .locals 0
    .param p1    # [F
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mTrendWeek:[F

    return-void
.end method

.method public final setMTripCount(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mTripCount:I

    return-void
.end method

.method public final setMType(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mType:I

    return-void
.end method

.method public final setMVerticalOscillation(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->mVerticalOscillation:I

    return-void
.end method

.method public final setRealTimeAerobic(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->realTimeAerobic:F

    return-void
.end method

.method public final setRealTimeAnaerobic(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/Workout;->realTimeAnaerobic:F

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 166
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    move-object/from16 v0, p0

    iget v1, v0, Lcom/sma/smartv3/db/entity/Workout;->mId:I

    iget-wide v2, v0, Lcom/sma/smartv3/db/entity/Workout;->mStart:J

    iget-wide v4, v0, Lcom/sma/smartv3/db/entity/Workout;->mEnd:J

    iget-object v6, v0, Lcom/sma/smartv3/db/entity/Workout;->mLocalTime:Ljava/lang/String;

    iget v7, v0, Lcom/sma/smartv3/db/entity/Workout;->mDuration:I

    iget v8, v0, Lcom/sma/smartv3/db/entity/Workout;->mAltitude:I

    iget v9, v0, Lcom/sma/smartv3/db/entity/Workout;->mAirPressure:I

    iget v10, v0, Lcom/sma/smartv3/db/entity/Workout;->mSpm:I

    iget v11, v0, Lcom/sma/smartv3/db/entity/Workout;->mMode:I

    iget v12, v0, Lcom/sma/smartv3/db/entity/Workout;->mStep:I

    iget v13, v0, Lcom/sma/smartv3/db/entity/Workout;->mDistance:I

    iget v14, v0, Lcom/sma/smartv3/db/entity/Workout;->mCalorie:I

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mSpeed:I

    move/from16 v16, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mPace:I

    move/from16 v17, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mAvgBpm:I

    move/from16 v18, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mMaxBpm:I

    move/from16 v19, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mMinBpm:I

    move/from16 v20, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mMaxSpm:I

    move/from16 v21, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mMinSpm:I

    move/from16 v22, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mMaxPace:I

    move/from16 v23, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mMinPace:I

    move/from16 v24, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mMaxAltitude:I

    move/from16 v25, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mMinAltitude:I

    move/from16 v26, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mMinStress:I

    move/from16 v27, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mMaxStress:I

    move/from16 v28, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mAvgStress:I

    move/from16 v29, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mSource:I

    move/from16 v30, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mIsSync:I

    move/from16 v31, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mIsDelete:I

    move/from16 v32, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mFeel:I

    move/from16 v33, v15

    iget-object v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mPrototype:Ljava/lang/String;

    move-object/from16 v34, v15

    iget-object v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mFirmwareFlag:Ljava/lang/String;

    move-object/from16 v35, v15

    iget-object v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mBleName:Ljava/lang/String;

    move-object/from16 v36, v15

    iget-object v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mPlatform:Ljava/lang/String;

    move-object/from16 v37, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mMaxSpeed:I

    move/from16 v38, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mMinSpeed:I

    move/from16 v39, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mRestDuration:I

    move/from16 v40, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mAGpsType:I

    move/from16 v41, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mType:I

    move/from16 v42, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mMetTotal:I

    move/from16 v43, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mAerobic:F

    move/from16 v44, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mAnaerobic:F

    move/from16 v45, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mStamina:I

    move/from16 v46, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mAvgSpeed:F

    move/from16 v47, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mCadence:I

    move/from16 v48, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mMaxCadence:I

    move/from16 v49, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mCnt:I

    move/from16 v50, v15

    iget-object v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mBpmZoneCount:[I

    invoke-static {v15}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v51, v15

    iget-object v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mPersonalZone:[I

    invoke-static {v15}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v52, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mLactateThresholdPace:I

    move/from16 v53, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mRecoveryTime:I

    move/from16 v54, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mTrainingLoad:I

    move/from16 v55, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mMaxVO2:I

    move/from16 v56, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mLactateThresholdHr:I

    move/from16 v57, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mAlgorithmMarking:I

    move/from16 v58, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mPathCount:I

    move/from16 v59, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mPathSampleInterval:I

    move/from16 v60, v15

    iget-object v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mPathPoints:Ljava/util/List;

    move-object/from16 v61, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mHrPathCount:I

    move/from16 v62, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mHrPathSampleInterval:I

    move/from16 v63, v15

    iget-object v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mHrPathPoints:Ljava/util/List;

    move-object/from16 v64, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mPacePathCount:I

    move/from16 v65, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mPacePathSampleInterval:I

    move/from16 v66, v15

    iget-object v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mPacePathPoints:Ljava/util/List;

    move-object/from16 v67, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mSpeedPathCount:I

    move/from16 v68, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mSpeedPathSampleInterval:I

    move/from16 v69, v15

    iget-object v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mSpeedPathPoints:Ljava/util/List;

    move-object/from16 v70, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mCadencePathCount:I

    move/from16 v71, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mCadencePathSampleInterval:I

    move/from16 v72, v15

    iget-object v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mCadencePathPoints:Ljava/util/List;

    move-object/from16 v73, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mAltitudePathCount:I

    move/from16 v74, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mAltitudePathSampleInterval:I

    move/from16 v75, v15

    iget-object v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mAltitudePathPoints:Ljava/util/List;

    move-object/from16 v76, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mGoalDistance:I

    move/from16 v77, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mGoalTime:I

    move/from16 v78, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mGoalCalorie:I

    move/from16 v79, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mPausedDuration:I

    move/from16 v80, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mCurBpm:I

    move/from16 v81, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mAscendAltitude:I

    move/from16 v82, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mDescendAltitude:I

    move/from16 v83, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mCurStress:I

    move/from16 v84, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mSwimType:I

    move/from16 v85, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mCntFore:I

    move/from16 v86, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mCntBack:I

    move/from16 v87, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mBackSwingTime:I

    move/from16 v88, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mDownSwingTime:I

    move/from16 v89, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mDribbleTime:I

    move/from16 v90, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mTripCount:I

    move/from16 v91, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mSessionCount:I

    move/from16 v92, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mVerticalOscillation:I

    move/from16 v93, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mRunPowerWatt:I

    move/from16 v94, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mStepLen:F

    move/from16 v95, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mTrainingStatus:I

    move/from16 v96, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mFitnessAge:I

    move/from16 v97, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mTlTrend:F

    move/from16 v98, v15

    iget-object v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mBestRunTime:[I

    invoke-static {v15}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v99, v15

    iget-object v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mFitnessLevel:[F

    invoke-static {v15}, Ljava/util/Arrays;->toString([F)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v100, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mCalorieTotal:I

    move/from16 v101, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mPowerCount:I

    move/from16 v102, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mPowerInterval:I

    move/from16 v103, v15

    iget-object v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mPowerPoints:Ljava/util/List;

    move-object/from16 v104, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->realTimeAerobic:F

    move/from16 v105, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->realTimeAnaerobic:F

    move/from16 v106, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mFatTotal:F

    move/from16 v107, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mCarboTotal:F

    move/from16 v108, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorTargetTime:I

    move/from16 v109, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorActualTime:I

    move/from16 v110, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorDifferenceTime:I

    move/from16 v111, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorStatusTime:I

    move/from16 v112, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorTargetDistance:I

    move/from16 v113, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorActualDistance:I

    move/from16 v114, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorDifferenceDistance:I

    move/from16 v115, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorStatusDistance:I

    move/from16 v116, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorTargetPace:I

    move/from16 v117, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorActualPace:I

    move/from16 v118, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorDifferencePace:I

    move/from16 v119, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorStatusPace:I

    move/from16 v120, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorTargetSpeedV2:F

    move/from16 v121, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorActualSpeedV2:F

    move/from16 v122, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorTargetSpeed:I

    move/from16 v123, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorActualSpeed:I

    move/from16 v124, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorDifferenceSpeed:I

    move/from16 v125, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mNavigatorStatusSpeed:I

    move/from16 v126, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mMaxOxygenPower:F

    move/from16 v127, v15

    iget-object v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mTrendWeek:[F

    invoke-static {v15}, Ljava/util/Arrays;->toString([F)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v128, v15

    iget-object v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mCyclingIndex:[F

    invoke-static {v15}, Ljava/util/Arrays;->toString([F)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v129, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mStaBalance:I

    move/from16 v130, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mSwimSwolf:I

    move/from16 v131, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mCntLap:I

    move/from16 v132, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mFrontCrawlPerc:I

    move/from16 v133, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mBreaststrokePerc:I

    move/from16 v134, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mBackstrokePerc:I

    move/from16 v135, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mButterflyPerc:I

    move/from16 v136, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mSpmPathPointsCount:I

    move/from16 v137, v15

    iget-object v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mSpmPathPointsPoints:Ljava/util/List;

    move-object/from16 v138, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mStepLenCount:I

    move/from16 v139, v15

    iget-object v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mStepLenPoints:Ljava/util/List;

    move-object/from16 v140, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mEllipticalSteps:I

    move/from16 v141, v14

    move/from16 v142, v15

    iget-wide v14, v0, Lcom/sma/smartv3/db/entity/Workout;->mChildSwimStartTime:J

    move-wide/from16 v143, v14

    iget v14, v0, Lcom/sma/smartv3/db/entity/Workout;->mChildSwimDuration:I

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mChildSwimDistance:I

    move/from16 v145, v14

    move/from16 v146, v15

    iget-wide v14, v0, Lcom/sma/smartv3/db/entity/Workout;->mChildCyclingStartTime:J

    move-wide/from16 v147, v14

    iget v14, v0, Lcom/sma/smartv3/db/entity/Workout;->mChildCyclingDuration:I

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mChildCyclingDistance:I

    move/from16 v149, v14

    move/from16 v150, v15

    iget-wide v14, v0, Lcom/sma/smartv3/db/entity/Workout;->mChildRunStartTime:J

    move-wide/from16 v151, v14

    iget v14, v0, Lcom/sma/smartv3/db/entity/Workout;->mChildRunDuration:I

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mChildRunDistance:I

    move/from16 v153, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mChildSwimMode:I

    move/from16 v154, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mChildCyclingMode:I

    move/from16 v155, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mChildRunMode:I

    move/from16 v156, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mChildNumber:I

    move/from16 v157, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mRunLactateAvg:F

    move/from16 v158, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mCyclingLactateAvg:F

    move/from16 v159, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mFlag:I

    move/from16 v160, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mRecoveryHrCount:I

    move/from16 v161, v15

    iget-object v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mRecoveryHrPoints:Ljava/util/List;

    move-object/from16 v162, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mSwimPoolLength:I

    move/from16 v163, v15

    iget-object v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mDeviceId:Ljava/lang/String;

    move-object/from16 v164, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/Workout;->mAICoachSportID:I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v165, v15

    const-string v15, "Workout(mId="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mStart="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", mEnd="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", mLocalTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mAltitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mAirPressure="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSpm="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mStep="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mDistance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCalorie="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v141

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSpeed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPace="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mAvgBpm="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMaxBpm="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMinBpm="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMaxSpm="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMinSpm="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMaxPace="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMinPace="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMaxAltitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v25

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMinAltitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v26

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMinStress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMaxStress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mAvgStress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSource="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v30

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mIsSync="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v31

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mIsDelete="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v32

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mFeel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v33

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPrototype="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v34

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mFirmwareFlag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v35

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mBleName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v36

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mPlatform="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v37

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mMaxSpeed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v38

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMinSpeed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v39

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mRestDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mAGpsType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v41

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v42

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMetTotal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v43

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mAerobic="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v44

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mAnaerobic="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v45

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mStamina="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v46

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mAvgSpeed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v47

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mCadence="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v48

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMaxCadence="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v49

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCnt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v50

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mBpmZoneCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v51

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mPersonalZone="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v52

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mLactateThresholdPace="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v53

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mRecoveryTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v54

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mTrainingLoad="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v55

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMaxVO2="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v56

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mLactateThresholdHr="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v57

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mAlgorithmMarking="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v58

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPathCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v59

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPathSampleInterval="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v60

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPathPoints="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v61

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mHrPathCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v62

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mHrPathSampleInterval="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v63

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mHrPathPoints="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v64

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mPacePathCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v65

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPacePathSampleInterval="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v66

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPacePathPoints="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v67

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mSpeedPathCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v68

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSpeedPathSampleInterval="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v69

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSpeedPathPoints="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v70

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mCadencePathCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v71

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCadencePathSampleInterval="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v72

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCadencePathPoints="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v73

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mAltitudePathCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v74

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mAltitudePathSampleInterval="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v75

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mAltitudePathPoints="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v76

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mGoalDistance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v77

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mGoalTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v78

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mGoalCalorie="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v79

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPausedDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v80

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCurBpm="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v81

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mAscendAltitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v82

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mDescendAltitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v83

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCurStress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v84

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSwimType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v85

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCntFore="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v86

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCntBack="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v87

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mBackSwingTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v88

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mDownSwingTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v89

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mDribbleTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v90

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mTripCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v91

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSessionCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v92

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mVerticalOscillation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v93

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mRunPowerWatt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v94

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mStepLen="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v95

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mTrainingStatus="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v96

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mFitnessAge="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v97

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mTlTrend="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v98

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mBestRunTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v99

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mFitnessLevel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v100

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mCalorieTotal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v101

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPowerCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v102

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPowerInterval="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v103

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPowerPoints="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v104

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", realTimeAerobic="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v105

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", realTimeAnaerobic="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v106

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mFatTotal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v107

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mCarboTotal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v108

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mNavigatorTargetTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v109

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mNavigatorActualTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v110

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mNavigatorDifferenceTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v111

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mNavigatorStatusTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v112

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mNavigatorTargetDistance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v113

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mNavigatorActualDistance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v114

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mNavigatorDifferenceDistance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v115

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mNavigatorStatusDistance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v116

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mNavigatorTargetPace="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v117

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mNavigatorActualPace="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v118

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mNavigatorDifferencePace="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v119

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mNavigatorStatusPace="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v120

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mNavigatorTargetSpeedV2="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v121

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mNavigatorActualSpeedV2="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v122

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mNavigatorTargetSpeed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v123

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mNavigatorActualSpeed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v124

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mNavigatorDifferenceSpeed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v125

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mNavigatorStatusSpeed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v126

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMaxOxygenPower="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v127

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mTrendWeek="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v128

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mCyclingIndex="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v129

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mStaBalance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v130

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSwimSwolf="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v131

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCntLap="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v132

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mFrontCrawlPerc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v133

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mBreaststrokePerc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v134

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mBackstrokePerc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v135

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mButterflyPerc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v136

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSpmPathPointsCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v137

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSpmPathPointsPoints="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v138

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mStepLenCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v139

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mStepLenPoints="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v140

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mEllipticalSteps="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v142

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mChildSwimStartTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v143

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", mChildSwimDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v145

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mChildSwimDistance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v146

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mChildCyclingStartTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v147

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", mChildCyclingDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v149

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mChildCyclingDistance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v150

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mChildRunStartTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v151

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", mChildRunDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mChildRunDistance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v153

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mChildSwimMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v154

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mChildCyclingMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v155

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mChildRunMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v156

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mChildNumber="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v157

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mRunLactateAvg="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v158

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mCyclingLactateAvg="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v159

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mFlag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v160

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mRecoveryHrCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v161

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mRecoveryHrPoints="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v162

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mSwimPoolLength="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v163

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mDeviceId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v164

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mAICoachSportID="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v165

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
