.class public final Lcom/szabh/smable3/entity/BleWorkout4;
.super Lcom/bestmafen/baseble/data/BleReadable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleWorkout4$Companion;,
        Lcom/szabh/smable3/entity/BleWorkout4$WorkoutFlag;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBleWorkout4.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleWorkout4.kt\ncom/szabh/smable3/entity/BleWorkout4\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1405:1\n1#2:1406\n13840#3,2:1407\n1563#4:1409\n1634#4,3:1410\n*S KotlinDebug\n*F\n+ 1 BleWorkout4.kt\ncom/szabh/smable3/entity/BleWorkout4\n*L\n1019#1:1407,2\n1166#1:1409\n1166#1:1410,3\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBleWorkout4.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleWorkout4.kt\ncom/szabh/smable3/entity/BleWorkout4\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1405:1\n1#2:1406\n13840#3,2:1407\n1563#4:1409\n1634#4,3:1410\n*S KotlinDebug\n*F\n+ 1 BleWorkout4.kt\ncom/szabh/smable3/entity/BleWorkout4\n*L\n1019#1:1407,2\n1166#1:1409\n1166#1:1410,3\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleWorkout4$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final WORKOUT_MAX_POINT:I = 0x80

.field private static mByteOrder:Ljava/nio/ByteOrder;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# instance fields
.field private mAICoachSportID:I

.field private mAerobic:F

.field private mAirPressure:I

.field private mAltitude:I

.field private mAltitudePathCount:I

.field private mAltitudePathPoints:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
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

.field private mAnaerobic:F

.field private mAscendAltitude:I

.field private mAvgBpm:I

.field private mAvgSpeed:F

.field private mAvgStress:I

.field private mBackSwingTime:I

.field private mBackstrokePerc:I

.field private mBestRunTime:[I
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mBpmZoneCount:[I
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mBreaststrokePerc:I

.field private mButterflyPerc:I

.field private mCadence:F

.field private mCadencePathCount:I

.field private mCadencePathPoints:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
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

.field private mCalorie:I

.field private mCalorieTotal:F

.field private mCarboTotal:F

.field private mChildCyclingDistance:I

.field private mChildCyclingDuration:I

.field private mChildCyclingMode:I

.field private mChildCyclingStartTime:I

.field private mChildNumber:I

.field private mChildRunDistance:I

.field private mChildRunDuration:I

.field private mChildRunMode:I

.field private mChildRunStartTime:I

.field private mChildSwimDistance:I

.field private mChildSwimDuration:I

.field private mChildSwimMode:I

.field private mChildSwimStartTime:I

.field private mCnt:I

.field private mCntBack:I

.field private mCntFore:I

.field private mCntLap:I

.field private mCountAltitude:I

.field private mCountBpm:I

.field private mCountSatellite:I

.field private mCountStress:I

.field private mCurBpm:I

.field private mCurStress:I

.field private final mCyclingIndex:[F
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mCyclingLactateAvg:F

.field private mDescendAltitude:I

.field private mDistance:I

.field private mDownSwingTime:I

.field private mDribbleTime:I

.field private mDuration:I

.field private mEllipticalSteps:I

.field private mEnd:I

.field private mFatTotal:F

.field private mFitnessAge:I

.field private mFitnessLevel:[F
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mFrontCrawlPerc:I

.field private mHrPathCount:I

.field private mHrPathPoints:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
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

.field private mLactateThresholdHr:I

.field private mLactateThresholdPace:I

.field private mMaxAltitude:I

.field private mMaxBpm:I

.field private mMaxCadence:I

.field private mMaxOxygenPower:F

.field private mMaxPace:I

.field private mMaxSpeed:F

.field private mMaxSpm:I

.field private mMaxStress:I

.field private mMaxVO2:I

.field private mMetTotal:F

.field private mMinAltitude:I

.field private mMinBpm:I

.field private mMinPace:I

.field private mMinSpeed:F

.field private mMinSpm:I

.field private mMinStress:I

.field private mMode:I

.field private mNavigatorActualDistance:I

.field private mNavigatorActualPace:I

.field private mNavigatorActualSpeed:F

.field private mNavigatorActualTime:I

.field private mNavigatorDifferenceDistance:I

.field private mNavigatorDifferencePace:I

.field private mNavigatorDifferenceSpeed:I

.field private mNavigatorDifferenceTime:I

.field private mNavigatorStatusDistance:I

.field private mNavigatorStatusPace:I

.field private mNavigatorStatusSpeed:I

.field private mNavigatorStatusTime:I

.field private mNavigatorTargetDistance:I

.field private mNavigatorTargetPace:I

.field private mNavigatorTargetSpeed:F

.field private mNavigatorTargetTime:I

.field private mPace:I

.field private mPacePathCount:I

.field private mPacePathPoints:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
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

.field private mPathCount:I

.field private mPathPoints:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "[F>;"
        }
    .end annotation
.end field

.field private mPathSampleInterval:I

.field private mPausedDuration:I

.field private mPersonalZone:[I
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mPowerCount:I

.field private mPowerInterval:I

.field private mPowerPoints:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private mRecoveryHrCount:I

.field private mRecoveryHrPoints:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private mRecoveryHrSampleInterval:I

.field private mRecoveryTime:I

.field private mRunLactateAvg:F

.field private mRunPowerWatt:I

.field private mSessionCount:I

.field private mSize:I

.field private mSpeed:F

.field private mSpeedPathCount:I

.field private mSpeedPathPoints:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
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

.field private mSpm:I

.field private mSpmPathPointsCount:I

.field private mSpmPathPointsPoints:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
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

.field private mStamina:F

.field private mStart:I

.field private mStep:I

.field private mStepLen:F

.field private mStepLenCount:I

.field private mStepLenPoints:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
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

.field private mSwimSwolf:I

.field private mSwimType:I

.field private mTlTrend:F

.field private mTotalAltitude:I

.field private mTotalBpm:I

.field private mTotalStress:I

.field private mTrainingLoad:I

.field private mTrainingStatus:I

.field private final mTrendWeek:[F
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mTripCount:I

.field private mVerticalOscillation:F

.field private mWorkoutFlag:I

.field private realTimeAerobic:F

.field private realTimeAnaerobic:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleWorkout4$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleWorkout4$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleWorkout4;->Companion:Lcom/szabh/smable3/entity/BleWorkout4$Companion;

    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v1, "LITTLE_ENDIAN"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    return-void
.end method

.method public constructor <init>()V
    .locals 155

    .line 1
    const v153, 0xfffff

    const/16 v154, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

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

    const/16 v141, 0x0

    const/16 v142, 0x0

    const/16 v143, 0x0

    const/16 v144, 0x0

    const/16 v145, 0x0

    const/16 v146, 0x0

    const/16 v147, 0x0

    const/16 v148, 0x0

    const/16 v149, -0x1

    const/16 v150, -0x1

    const/16 v151, -0x1

    const/16 v152, -0x1

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v154}, Lcom/szabh/smable3/entity/BleWorkout4;-><init>(IIIIIIIIIIIIIIIIIIIIIIIIFIIIIIIIIIIIIIFFFFFFFIIIIFIIIIIIIIIIFFI[IIIII[F[IFIILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IFFFFFIILjava/util/List;ILjava/util/List;ILjava/util/List;IIIIIIIIIIIIFFIIF[F[FIIIIIIIIIIIIIIIIIIIIFF[IIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIIIIIIIIIIIIIIIIIIIIIIIFIIIIIIIIIIIIIFFFFFFFIIIIFIIIIIIIIIIFFI[IIIII[F[IFIILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IFFFFFIILjava/util/List;ILjava/util/List;ILjava/util/List;IIIIIIIIIIIIFFIIF[F[FIIIIIIIIIIIIIIIIIIIIFF[II)V
    .locals 16
    .param p64    # [I
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p69    # [F
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p70    # [I
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p74    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p77    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p80    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p83    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p86    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p89    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p92    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p101    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p103    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p105    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p123    # [F
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p124    # [F
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p147    # [I
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIIIIIIIIIIIIIIIIIIIIIIIFIIIIIIIIIIIIIFFFFFFFIIIIFIIIIIIIIIIFFI[IIIII[F[IFII",
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
            ">;II",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;IFFFFFII",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;I",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;IIIIIIIIIIIIFFIIF[F[FIIIIIIIIIIIIIIIIIIIIFF[II)V"
        }
    .end annotation

    move-object/from16 v1, p64

    move-object/from16 v2, p69

    move-object/from16 v3, p70

    move-object/from16 v4, p74

    move-object/from16 v5, p77

    move-object/from16 v6, p80

    move-object/from16 v7, p83

    move-object/from16 v8, p86

    move-object/from16 v9, p89

    move-object/from16 v10, p92

    move-object/from16 v11, p101

    move-object/from16 v12, p103

    move-object/from16 v13, p105

    move-object/from16 v14, p123

    move-object/from16 v15, p124

    const-string v0, "mBpmZoneCount"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mFitnessLevel"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mBestRunTime"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mPathPoints"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mHrPathPoints"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mPacePathPoints"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mSpeedPathPoints"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mCadencePathPoints"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mAltitudePathPoints"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mRecoveryHrPoints"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mPowerPoints"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mSpmPathPointsPoints"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mStepLenPoints"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mTrendWeek"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mCyclingIndex"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mPersonalZone"

    move-object/from16 v15, p147

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct/range {p0 .. p0}, Lcom/bestmafen/baseble/data/BleReadable;-><init>()V

    move-object/from16 v0, p0

    move/from16 v15, p1

    .line 3
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mStart:I

    move/from16 v15, p2

    .line 4
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mEnd:I

    move/from16 v15, p3

    .line 5
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mSize:I

    move/from16 v15, p4

    .line 6
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildNumber:I

    move/from16 v15, p5

    .line 7
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mMode:I

    move/from16 v15, p6

    .line 8
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mDuration:I

    move/from16 v15, p7

    .line 9
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mPausedDuration:I

    move/from16 v15, p8

    .line 10
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mCurBpm:I

    move/from16 v15, p9

    .line 11
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mAvgBpm:I

    move/from16 v15, p10

    .line 12
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxBpm:I

    move/from16 v15, p11

    .line 13
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mMinBpm:I

    move/from16 v15, p12

    .line 14
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mCountBpm:I

    move/from16 v15, p13

    .line 15
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mTotalBpm:I

    move/from16 v15, p14

    .line 16
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mStep:I

    move/from16 v15, p15

    .line 17
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mDistance:I

    move/from16 v15, p16

    .line 18
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mCalorie:I

    move/from16 v15, p17

    .line 19
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mAltitude:I

    move/from16 v15, p18

    .line 20
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxAltitude:I

    move/from16 v15, p19

    .line 21
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mMinAltitude:I

    move/from16 v15, p20

    .line 22
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mAscendAltitude:I

    move/from16 v15, p21

    .line 23
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mDescendAltitude:I

    move/from16 v15, p22

    .line 24
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mCountAltitude:I

    move/from16 v15, p23

    .line 25
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mTotalAltitude:I

    move/from16 v15, p24

    .line 26
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mAirPressure:I

    move/from16 v15, p25

    .line 27
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpeed:F

    move/from16 v15, p26

    .line 28
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mCountSatellite:I

    move/from16 v15, p27

    .line 29
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpm:I

    move/from16 v15, p28

    .line 30
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxSpm:I

    move/from16 v15, p29

    .line 31
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mMinSpm:I

    move/from16 v15, p30

    .line 32
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mPace:I

    move/from16 v15, p31

    .line 33
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxPace:I

    move/from16 v15, p32

    .line 34
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mMinPace:I

    move/from16 v15, p33

    .line 35
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mCurStress:I

    move/from16 v15, p34

    .line 36
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mAvgStress:I

    move/from16 v15, p35

    .line 37
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mMinStress:I

    move/from16 v15, p36

    .line 38
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxStress:I

    move/from16 v15, p37

    .line 39
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mCountStress:I

    move/from16 v15, p38

    .line 40
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mTotalStress:I

    move/from16 v15, p39

    .line 41
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxSpeed:F

    move/from16 v15, p40

    .line 42
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mMinSpeed:F

    move/from16 v15, p41

    .line 43
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mAvgSpeed:F

    move/from16 v15, p42

    .line 44
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mStamina:F

    move/from16 v15, p43

    .line 45
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mAerobic:F

    move/from16 v15, p44

    .line 46
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mAnaerobic:F

    move/from16 v15, p45

    .line 47
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mMetTotal:F

    move/from16 v15, p46

    .line 48
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mRecoveryTime:I

    move/from16 v15, p47

    .line 49
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mTrainingLoad:I

    move/from16 v15, p48

    .line 50
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxVO2:I

    move/from16 v15, p49

    .line 51
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mCnt:I

    move/from16 v15, p50

    .line 52
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mCadence:F

    move/from16 v15, p51

    .line 53
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxCadence:I

    move/from16 v15, p52

    .line 54
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mSwimType:I

    move/from16 v15, p53

    .line 55
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mCntFore:I

    move/from16 v15, p54

    .line 56
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mCntBack:I

    move/from16 v15, p55

    .line 57
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mBackSwingTime:I

    move/from16 v15, p56

    .line 58
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mDownSwingTime:I

    move/from16 v15, p57

    .line 59
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mDribbleTime:I

    move/from16 v15, p58

    .line 60
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mTripCount:I

    move/from16 v15, p59

    .line 61
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mSessionCount:I

    move/from16 v15, p60

    .line 62
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mStaBalance:I

    move/from16 v15, p61

    .line 63
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mStepLen:F

    move/from16 v15, p62

    .line 64
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mVerticalOscillation:F

    move/from16 v15, p63

    .line 65
    iput v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mRunPowerWatt:I

    .line 66
    iput-object v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mBpmZoneCount:[I

    move/from16 v1, p65

    .line 67
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mLactateThresholdHr:I

    move/from16 v1, p66

    .line 68
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mLactateThresholdPace:I

    move/from16 v1, p67

    .line 69
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mTrainingStatus:I

    move/from16 v1, p68

    .line 70
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mFitnessAge:I

    .line 71
    iput-object v2, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mFitnessLevel:[F

    .line 72
    iput-object v3, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mBestRunTime:[I

    move/from16 v1, p71

    .line 73
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mTlTrend:F

    move/from16 v1, p72

    .line 74
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mPathCount:I

    move/from16 v1, p73

    .line 75
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mPathSampleInterval:I

    .line 76
    iput-object v4, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mPathPoints:Ljava/util/List;

    move/from16 v1, p75

    .line 77
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mHrPathCount:I

    move/from16 v1, p76

    .line 78
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mHrPathSampleInterval:I

    .line 79
    iput-object v5, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mHrPathPoints:Ljava/util/List;

    move/from16 v1, p78

    .line 80
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mPacePathCount:I

    move/from16 v1, p79

    .line 81
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mPacePathSampleInterval:I

    .line 82
    iput-object v6, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mPacePathPoints:Ljava/util/List;

    move/from16 v1, p81

    .line 83
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpeedPathCount:I

    move/from16 v1, p82

    .line 84
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpeedPathSampleInterval:I

    .line 85
    iput-object v7, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpeedPathPoints:Ljava/util/List;

    move/from16 v1, p84

    .line 86
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mCadencePathCount:I

    move/from16 v1, p85

    .line 87
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mCadencePathSampleInterval:I

    .line 88
    iput-object v8, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mCadencePathPoints:Ljava/util/List;

    move/from16 v1, p87

    .line 89
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mAltitudePathCount:I

    move/from16 v1, p88

    .line 90
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mAltitudePathSampleInterval:I

    .line 91
    iput-object v9, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mAltitudePathPoints:Ljava/util/List;

    move/from16 v1, p90

    .line 92
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mRecoveryHrCount:I

    move/from16 v1, p91

    .line 93
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mRecoveryHrSampleInterval:I

    .line 94
    iput-object v10, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mRecoveryHrPoints:Ljava/util/List;

    move/from16 v1, p93

    .line 95
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mSwimPoolLength:I

    move/from16 v1, p94

    .line 96
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->realTimeAerobic:F

    move/from16 v1, p95

    .line 97
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->realTimeAnaerobic:F

    move/from16 v1, p96

    .line 98
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mCalorieTotal:F

    move/from16 v1, p97

    .line 99
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mFatTotal:F

    move/from16 v1, p98

    .line 100
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mCarboTotal:F

    move/from16 v1, p99

    .line 101
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mPowerCount:I

    move/from16 v1, p100

    .line 102
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mPowerInterval:I

    .line 103
    iput-object v11, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mPowerPoints:Ljava/util/List;

    move/from16 v1, p102

    .line 104
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpmPathPointsCount:I

    .line 105
    iput-object v12, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpmPathPointsPoints:Ljava/util/List;

    move/from16 v1, p104

    .line 106
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mStepLenCount:I

    .line 107
    iput-object v13, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mStepLenPoints:Ljava/util/List;

    move/from16 v1, p106

    .line 108
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorTargetTime:I

    move/from16 v1, p107

    .line 109
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorActualTime:I

    move/from16 v1, p108

    .line 110
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorDifferenceTime:I

    move/from16 v1, p109

    .line 111
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorStatusTime:I

    move/from16 v1, p110

    .line 112
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorTargetDistance:I

    move/from16 v1, p111

    .line 113
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorActualDistance:I

    move/from16 v1, p112

    .line 114
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorDifferenceDistance:I

    move/from16 v1, p113

    .line 115
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorStatusDistance:I

    move/from16 v1, p114

    .line 116
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorTargetPace:I

    move/from16 v1, p115

    .line 117
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorActualPace:I

    move/from16 v1, p116

    .line 118
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorDifferencePace:I

    move/from16 v1, p117

    .line 119
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorStatusPace:I

    move/from16 v1, p118

    .line 120
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorTargetSpeed:F

    move/from16 v1, p119

    .line 121
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorActualSpeed:F

    move/from16 v1, p120

    .line 122
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorDifferenceSpeed:I

    move/from16 v1, p121

    .line 123
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorStatusSpeed:I

    move/from16 v1, p122

    .line 124
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxOxygenPower:F

    .line 125
    iput-object v14, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mTrendWeek:[F

    move-object/from16 v15, p124

    .line 126
    iput-object v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mCyclingIndex:[F

    move/from16 v1, p125

    .line 127
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mSwimSwolf:I

    move/from16 v1, p126

    .line 128
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mCntLap:I

    move/from16 v1, p127

    .line 129
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mFrontCrawlPerc:I

    move/from16 v1, p128

    .line 130
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mBreaststrokePerc:I

    move/from16 v1, p129

    .line 131
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mBackstrokePerc:I

    move/from16 v1, p130

    .line 132
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mButterflyPerc:I

    move/from16 v1, p131

    .line 133
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mEllipticalSteps:I

    move/from16 v1, p132

    .line 134
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mWorkoutFlag:I

    move/from16 v1, p133

    .line 135
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildSwimStartTime:I

    move/from16 v1, p134

    .line 136
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildSwimDuration:I

    move/from16 v1, p135

    .line 137
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildSwimDistance:I

    move/from16 v1, p136

    .line 138
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildCyclingStartTime:I

    move/from16 v1, p137

    .line 139
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildCyclingDuration:I

    move/from16 v1, p138

    .line 140
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildCyclingDistance:I

    move/from16 v1, p139

    .line 141
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildRunStartTime:I

    move/from16 v1, p140

    .line 142
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildRunDuration:I

    move/from16 v1, p141

    .line 143
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildRunDistance:I

    move/from16 v1, p142

    .line 144
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildSwimMode:I

    move/from16 v1, p143

    .line 145
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildCyclingMode:I

    move/from16 v1, p144

    .line 146
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildRunMode:I

    move/from16 v1, p145

    .line 147
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mRunLactateAvg:F

    move/from16 v1, p146

    .line 148
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mCyclingLactateAvg:F

    move-object/from16 v15, p147

    .line 149
    iput-object v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mPersonalZone:[I

    move/from16 v1, p148

    .line 150
    iput v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mAICoachSportID:I

    return-void
.end method

.method public synthetic constructor <init>(IIIIIIIIIIIIIIIIIIIIIIIIFIIIIIIIIIIIIIFFFFFFFIIIIFIIIIIIIIIIFFI[IIIII[F[IFIILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IFFFFFIILjava/util/List;ILjava/util/List;ILjava/util/List;IIIIIIIIIIIIFFIIF[F[FIIIIIIIIIIIIIIIIIIIIFF[IIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 110

    move/from16 v0, p149

    move/from16 v1, p150

    move/from16 v2, p151

    move/from16 v3, p152

    move/from16 v4, p153

    and-int/lit8 v5, v0, 0x1

    if-eqz v5, :cond_0

    const/4 v5, 0x0

    goto :goto_0

    :cond_0
    move/from16 v5, p1

    :goto_0
    and-int/lit8 v7, v0, 0x2

    if-eqz v7, :cond_1

    const/4 v7, 0x0

    goto :goto_1

    :cond_1
    move/from16 v7, p2

    :goto_1
    and-int/lit8 v8, v0, 0x4

    if-eqz v8, :cond_2

    const/4 v8, 0x0

    goto :goto_2

    :cond_2
    move/from16 v8, p3

    :goto_2
    and-int/lit8 v9, v0, 0x8

    if-eqz v9, :cond_3

    const/4 v9, 0x0

    goto :goto_3

    :cond_3
    move/from16 v9, p4

    :goto_3
    and-int/lit8 v10, v0, 0x10

    if-eqz v10, :cond_4

    const/4 v10, 0x0

    goto :goto_4

    :cond_4
    move/from16 v10, p5

    :goto_4
    and-int/lit8 v11, v0, 0x20

    if-eqz v11, :cond_5

    const/4 v11, 0x0

    goto :goto_5

    :cond_5
    move/from16 v11, p6

    :goto_5
    and-int/lit8 v12, v0, 0x40

    if-eqz v12, :cond_6

    const/4 v12, 0x0

    goto :goto_6

    :cond_6
    move/from16 v12, p7

    :goto_6
    and-int/lit16 v13, v0, 0x80

    if-eqz v13, :cond_7

    const/4 v13, 0x0

    goto :goto_7

    :cond_7
    move/from16 v13, p8

    :goto_7
    and-int/lit16 v14, v0, 0x100

    if-eqz v14, :cond_8

    const/4 v14, 0x0

    goto :goto_8

    :cond_8
    move/from16 v14, p9

    :goto_8
    and-int/lit16 v15, v0, 0x200

    if-eqz v15, :cond_9

    const/4 v15, 0x0

    goto :goto_9

    :cond_9
    move/from16 v15, p10

    :goto_9
    and-int/lit16 v6, v0, 0x400

    if-eqz v6, :cond_a

    const/4 v6, 0x0

    goto :goto_a

    :cond_a
    move/from16 v6, p11

    :goto_a
    move/from16 p1, v5

    and-int/lit16 v5, v0, 0x800

    if-eqz v5, :cond_b

    const/4 v5, 0x0

    goto :goto_b

    :cond_b
    move/from16 v5, p12

    :goto_b
    move/from16 p2, v5

    and-int/lit16 v5, v0, 0x1000

    if-eqz v5, :cond_c

    const/4 v5, 0x0

    goto :goto_c

    :cond_c
    move/from16 v5, p13

    :goto_c
    move/from16 p3, v5

    and-int/lit16 v5, v0, 0x2000

    if-eqz v5, :cond_d

    const/4 v5, 0x0

    goto :goto_d

    :cond_d
    move/from16 v5, p14

    :goto_d
    move/from16 p4, v5

    and-int/lit16 v5, v0, 0x4000

    if-eqz v5, :cond_e

    const/4 v5, 0x0

    goto :goto_e

    :cond_e
    move/from16 v5, p15

    :goto_e
    const v16, 0x8000

    and-int v17, v0, v16

    if-eqz v17, :cond_f

    const/16 v17, 0x0

    goto :goto_f

    :cond_f
    move/from16 v17, p16

    :goto_f
    const/high16 v18, 0x10000

    and-int v19, v0, v18

    if-eqz v19, :cond_10

    const/16 v19, 0x0

    goto :goto_10

    :cond_10
    move/from16 v19, p17

    :goto_10
    const/high16 v20, 0x20000

    and-int v21, v0, v20

    if-eqz v21, :cond_11

    const/16 v21, 0x0

    goto :goto_11

    :cond_11
    move/from16 v21, p18

    :goto_11
    const/high16 v22, 0x40000

    and-int v23, v0, v22

    if-eqz v23, :cond_12

    const/16 v23, 0x0

    goto :goto_12

    :cond_12
    move/from16 v23, p19

    :goto_12
    const/high16 v24, 0x80000

    and-int v25, v0, v24

    if-eqz v25, :cond_13

    const/16 v25, 0x0

    goto :goto_13

    :cond_13
    move/from16 v25, p20

    :goto_13
    const/high16 v26, 0x100000

    and-int v26, v0, v26

    if-eqz v26, :cond_14

    const/16 v26, 0x0

    goto :goto_14

    :cond_14
    move/from16 v26, p21

    :goto_14
    const/high16 v27, 0x200000

    and-int v27, v0, v27

    if-eqz v27, :cond_15

    const/16 v27, 0x0

    goto :goto_15

    :cond_15
    move/from16 v27, p22

    :goto_15
    const/high16 v28, 0x400000

    and-int v28, v0, v28

    if-eqz v28, :cond_16

    const/16 v28, 0x0

    goto :goto_16

    :cond_16
    move/from16 v28, p23

    :goto_16
    const/high16 v29, 0x800000

    and-int v29, v0, v29

    if-eqz v29, :cond_17

    const/16 v29, 0x0

    goto :goto_17

    :cond_17
    move/from16 v29, p24

    :goto_17
    const/high16 v30, 0x1000000

    and-int v30, v0, v30

    const/16 v31, 0x0

    if-eqz v30, :cond_18

    move/from16 v30, v31

    goto :goto_18

    :cond_18
    move/from16 v30, p25

    :goto_18
    const/high16 v32, 0x2000000

    and-int v32, v0, v32

    if-eqz v32, :cond_19

    const/16 v32, 0x0

    goto :goto_19

    :cond_19
    move/from16 v32, p26

    :goto_19
    const/high16 v33, 0x4000000

    and-int v33, v0, v33

    if-eqz v33, :cond_1a

    const/16 v33, 0x0

    goto :goto_1a

    :cond_1a
    move/from16 v33, p27

    :goto_1a
    const/high16 v34, 0x8000000

    and-int v34, v0, v34

    if-eqz v34, :cond_1b

    const/16 v34, 0x0

    goto :goto_1b

    :cond_1b
    move/from16 v34, p28

    :goto_1b
    const/high16 v35, 0x10000000

    and-int v35, v0, v35

    if-eqz v35, :cond_1c

    const/16 v35, 0x0

    goto :goto_1c

    :cond_1c
    move/from16 v35, p29

    :goto_1c
    const/high16 v36, 0x20000000

    and-int v36, v0, v36

    if-eqz v36, :cond_1d

    const/16 v36, 0x0

    goto :goto_1d

    :cond_1d
    move/from16 v36, p30

    :goto_1d
    const/high16 v37, 0x40000000    # 2.0f

    and-int v37, v0, v37

    if-eqz v37, :cond_1e

    const/16 v37, 0x0

    goto :goto_1e

    :cond_1e
    move/from16 v37, p31

    :goto_1e
    const/high16 v38, -0x80000000

    and-int v0, v0, v38

    if-eqz v0, :cond_1f

    const/4 v0, 0x0

    goto :goto_1f

    :cond_1f
    move/from16 v0, p32

    :goto_1f
    and-int/lit8 v38, v1, 0x1

    if-eqz v38, :cond_20

    const/16 v38, 0x0

    goto :goto_20

    :cond_20
    move/from16 v38, p33

    :goto_20
    and-int/lit8 v39, v1, 0x2

    if-eqz v39, :cond_21

    const/16 v39, 0x0

    goto :goto_21

    :cond_21
    move/from16 v39, p34

    :goto_21
    and-int/lit8 v40, v1, 0x4

    if-eqz v40, :cond_22

    const/16 v40, 0x0

    goto :goto_22

    :cond_22
    move/from16 v40, p35

    :goto_22
    and-int/lit8 v41, v1, 0x8

    if-eqz v41, :cond_23

    const/16 v41, 0x0

    goto :goto_23

    :cond_23
    move/from16 v41, p36

    :goto_23
    and-int/lit8 v42, v1, 0x10

    if-eqz v42, :cond_24

    const/16 v42, 0x0

    goto :goto_24

    :cond_24
    move/from16 v42, p37

    :goto_24
    and-int/lit8 v43, v1, 0x20

    if-eqz v43, :cond_25

    const/16 v43, 0x0

    goto :goto_25

    :cond_25
    move/from16 v43, p38

    :goto_25
    and-int/lit8 v44, v1, 0x40

    if-eqz v44, :cond_26

    move/from16 v44, v31

    goto :goto_26

    :cond_26
    move/from16 v44, p39

    :goto_26
    move/from16 p5, v0

    and-int/lit16 v0, v1, 0x80

    if-eqz v0, :cond_27

    move/from16 v0, v31

    goto :goto_27

    :cond_27
    move/from16 v0, p40

    :goto_27
    move/from16 p6, v0

    and-int/lit16 v0, v1, 0x100

    if-eqz v0, :cond_28

    move/from16 v0, v31

    goto :goto_28

    :cond_28
    move/from16 v0, p41

    :goto_28
    move/from16 p7, v0

    and-int/lit16 v0, v1, 0x200

    if-eqz v0, :cond_29

    move/from16 v0, v31

    goto :goto_29

    :cond_29
    move/from16 v0, p42

    :goto_29
    move/from16 p8, v0

    and-int/lit16 v0, v1, 0x400

    if-eqz v0, :cond_2a

    move/from16 v0, v31

    goto :goto_2a

    :cond_2a
    move/from16 v0, p43

    :goto_2a
    move/from16 p9, v0

    and-int/lit16 v0, v1, 0x800

    if-eqz v0, :cond_2b

    move/from16 v0, v31

    goto :goto_2b

    :cond_2b
    move/from16 v0, p44

    :goto_2b
    move/from16 p10, v0

    and-int/lit16 v0, v1, 0x1000

    if-eqz v0, :cond_2c

    move/from16 v0, v31

    goto :goto_2c

    :cond_2c
    move/from16 v0, p45

    :goto_2c
    move/from16 p11, v0

    and-int/lit16 v0, v1, 0x2000

    if-eqz v0, :cond_2d

    const/4 v0, 0x0

    goto :goto_2d

    :cond_2d
    move/from16 v0, p46

    :goto_2d
    move/from16 p12, v0

    and-int/lit16 v0, v1, 0x4000

    if-eqz v0, :cond_2e

    const/4 v0, 0x0

    goto :goto_2e

    :cond_2e
    move/from16 v0, p47

    :goto_2e
    and-int v45, v1, v16

    if-eqz v45, :cond_2f

    const/16 v45, 0x0

    goto :goto_2f

    :cond_2f
    move/from16 v45, p48

    :goto_2f
    and-int v46, v1, v18

    if-eqz v46, :cond_30

    const/16 v46, 0x0

    goto :goto_30

    :cond_30
    move/from16 v46, p49

    :goto_30
    and-int v47, v1, v20

    if-eqz v47, :cond_31

    move/from16 v47, v31

    goto :goto_31

    :cond_31
    move/from16 v47, p50

    :goto_31
    and-int v48, v1, v22

    if-eqz v48, :cond_32

    const/16 v48, 0x0

    goto :goto_32

    :cond_32
    move/from16 v48, p51

    :goto_32
    and-int v49, v1, v24

    if-eqz v49, :cond_33

    const/16 v49, 0x0

    goto :goto_33

    :cond_33
    move/from16 v49, p52

    :goto_33
    const/high16 v50, 0x100000

    and-int v50, v1, v50

    if-eqz v50, :cond_34

    const/16 v50, 0x0

    goto :goto_34

    :cond_34
    move/from16 v50, p53

    :goto_34
    const/high16 v51, 0x200000

    and-int v51, v1, v51

    if-eqz v51, :cond_35

    const/16 v51, 0x0

    goto :goto_35

    :cond_35
    move/from16 v51, p54

    :goto_35
    const/high16 v52, 0x400000

    and-int v52, v1, v52

    if-eqz v52, :cond_36

    const/16 v52, 0x0

    goto :goto_36

    :cond_36
    move/from16 v52, p55

    :goto_36
    const/high16 v53, 0x800000

    and-int v53, v1, v53

    if-eqz v53, :cond_37

    const/16 v53, 0x0

    goto :goto_37

    :cond_37
    move/from16 v53, p56

    :goto_37
    const/high16 v54, 0x1000000

    and-int v54, v1, v54

    if-eqz v54, :cond_38

    const/16 v54, 0x0

    goto :goto_38

    :cond_38
    move/from16 v54, p57

    :goto_38
    const/high16 v55, 0x2000000

    and-int v55, v1, v55

    if-eqz v55, :cond_39

    const/16 v55, 0x0

    goto :goto_39

    :cond_39
    move/from16 v55, p58

    :goto_39
    const/high16 v56, 0x4000000

    and-int v56, v1, v56

    if-eqz v56, :cond_3a

    const/16 v56, 0x0

    goto :goto_3a

    :cond_3a
    move/from16 v56, p59

    :goto_3a
    const/high16 v57, 0x8000000

    and-int v57, v1, v57

    if-eqz v57, :cond_3b

    const/16 v57, 0x0

    goto :goto_3b

    :cond_3b
    move/from16 v57, p60

    :goto_3b
    const/high16 v58, 0x10000000

    and-int v58, v1, v58

    if-eqz v58, :cond_3c

    move/from16 v58, v31

    goto :goto_3c

    :cond_3c
    move/from16 v58, p61

    :goto_3c
    const/high16 v59, 0x20000000

    and-int v59, v1, v59

    if-eqz v59, :cond_3d

    move/from16 v59, v31

    goto :goto_3d

    :cond_3d
    move/from16 v59, p62

    :goto_3d
    const/high16 v60, 0x40000000    # 2.0f

    and-int v60, v1, v60

    if-eqz v60, :cond_3e

    const/16 v60, 0x0

    goto :goto_3e

    :cond_3e
    move/from16 v60, p63

    :goto_3e
    const/high16 v61, -0x80000000

    and-int v1, v1, v61

    if-eqz v1, :cond_3f

    const/4 v1, 0x5

    .line 151
    new-array v1, v1, [I

    goto :goto_3f

    :cond_3f
    move-object/from16 v1, p64

    :goto_3f
    and-int/lit8 v61, v2, 0x1

    if-eqz v61, :cond_40

    const/16 v61, 0x0

    goto :goto_40

    :cond_40
    move/from16 v61, p65

    :goto_40
    and-int/lit8 v62, v2, 0x2

    if-eqz v62, :cond_41

    const/16 v62, 0x0

    goto :goto_41

    :cond_41
    move/from16 v62, p66

    :goto_41
    and-int/lit8 v63, v2, 0x4

    if-eqz v63, :cond_42

    const/16 v63, 0x0

    goto :goto_42

    :cond_42
    move/from16 v63, p67

    :goto_42
    and-int/lit8 v64, v2, 0x8

    if-eqz v64, :cond_43

    const/16 v64, 0x0

    goto :goto_43

    :cond_43
    move/from16 v64, p68

    :goto_43
    and-int/lit8 v65, v2, 0x10

    move/from16 p13, v0

    if-eqz v65, :cond_44

    const/16 v0, 0x9

    .line 152
    new-array v0, v0, [F

    goto :goto_44

    :cond_44
    move-object/from16 v0, p69

    :goto_44
    and-int/lit8 v65, v2, 0x20

    move-object/from16 p14, v0

    if-eqz v65, :cond_45

    const/4 v0, 0x5

    .line 153
    new-array v0, v0, [I

    goto :goto_45

    :cond_45
    move-object/from16 v0, p70

    :goto_45
    and-int/lit8 v65, v2, 0x40

    if-eqz v65, :cond_46

    move/from16 v65, v31

    goto :goto_46

    :cond_46
    move/from16 v65, p71

    :goto_46
    move-object/from16 p15, v0

    and-int/lit16 v0, v2, 0x80

    if-eqz v0, :cond_47

    const/4 v0, 0x0

    goto :goto_47

    :cond_47
    move/from16 v0, p72

    :goto_47
    move/from16 p16, v0

    and-int/lit16 v0, v2, 0x100

    if-eqz v0, :cond_48

    const/4 v0, 0x0

    goto :goto_48

    :cond_48
    move/from16 v0, p73

    :goto_48
    move/from16 p17, v0

    and-int/lit16 v0, v2, 0x200

    if-eqz v0, :cond_49

    .line 154
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    goto :goto_49

    :cond_49
    move-object/from16 v0, p74

    :goto_49
    move-object/from16 p18, v0

    and-int/lit16 v0, v2, 0x400

    if-eqz v0, :cond_4a

    const/4 v0, 0x0

    goto :goto_4a

    :cond_4a
    move/from16 v0, p75

    :goto_4a
    move/from16 p19, v0

    and-int/lit16 v0, v2, 0x800

    if-eqz v0, :cond_4b

    const/4 v0, 0x0

    goto :goto_4b

    :cond_4b
    move/from16 v0, p76

    :goto_4b
    move/from16 p20, v0

    and-int/lit16 v0, v2, 0x1000

    if-eqz v0, :cond_4c

    .line 155
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    goto :goto_4c

    :cond_4c
    move-object/from16 v0, p77

    :goto_4c
    move-object/from16 p21, v0

    and-int/lit16 v0, v2, 0x2000

    if-eqz v0, :cond_4d

    const/4 v0, 0x0

    goto :goto_4d

    :cond_4d
    move/from16 v0, p78

    :goto_4d
    move/from16 p22, v0

    and-int/lit16 v0, v2, 0x4000

    if-eqz v0, :cond_4e

    const/4 v0, 0x0

    goto :goto_4e

    :cond_4e
    move/from16 v0, p79

    :goto_4e
    and-int v66, v2, v16

    if-eqz v66, :cond_4f

    .line 156
    new-instance v66, Ljava/util/ArrayList;

    invoke-direct/range {v66 .. v66}, Ljava/util/ArrayList;-><init>()V

    goto :goto_4f

    :cond_4f
    move-object/from16 v66, p80

    :goto_4f
    and-int v67, v2, v18

    if-eqz v67, :cond_50

    const/16 v67, 0x0

    goto :goto_50

    :cond_50
    move/from16 v67, p81

    :goto_50
    and-int v68, v2, v20

    if-eqz v68, :cond_51

    const/16 v68, 0x0

    goto :goto_51

    :cond_51
    move/from16 v68, p82

    :goto_51
    and-int v69, v2, v22

    if-eqz v69, :cond_52

    .line 157
    new-instance v69, Ljava/util/ArrayList;

    invoke-direct/range {v69 .. v69}, Ljava/util/ArrayList;-><init>()V

    goto :goto_52

    :cond_52
    move-object/from16 v69, p83

    :goto_52
    and-int v70, v2, v24

    if-eqz v70, :cond_53

    const/16 v70, 0x0

    goto :goto_53

    :cond_53
    move/from16 v70, p84

    :goto_53
    const/high16 v71, 0x100000

    and-int v71, v2, v71

    if-eqz v71, :cond_54

    const/16 v71, 0x0

    goto :goto_54

    :cond_54
    move/from16 v71, p85

    :goto_54
    const/high16 v72, 0x200000

    and-int v72, v2, v72

    if-eqz v72, :cond_55

    .line 158
    new-instance v72, Ljava/util/ArrayList;

    invoke-direct/range {v72 .. v72}, Ljava/util/ArrayList;-><init>()V

    goto :goto_55

    :cond_55
    move-object/from16 v72, p86

    :goto_55
    const/high16 v73, 0x400000

    and-int v73, v2, v73

    if-eqz v73, :cond_56

    const/16 v73, 0x0

    goto :goto_56

    :cond_56
    move/from16 v73, p87

    :goto_56
    const/high16 v74, 0x800000

    and-int v74, v2, v74

    if-eqz v74, :cond_57

    const/16 v74, 0x0

    goto :goto_57

    :cond_57
    move/from16 v74, p88

    :goto_57
    const/high16 v75, 0x1000000

    and-int v75, v2, v75

    if-eqz v75, :cond_58

    .line 159
    new-instance v75, Ljava/util/ArrayList;

    invoke-direct/range {v75 .. v75}, Ljava/util/ArrayList;-><init>()V

    goto :goto_58

    :cond_58
    move-object/from16 v75, p89

    :goto_58
    const/high16 v76, 0x2000000

    and-int v76, v2, v76

    if-eqz v76, :cond_59

    const/16 v76, 0x0

    goto :goto_59

    :cond_59
    move/from16 v76, p90

    :goto_59
    const/high16 v77, 0x4000000

    and-int v77, v2, v77

    if-eqz v77, :cond_5a

    const/16 v77, 0x0

    goto :goto_5a

    :cond_5a
    move/from16 v77, p91

    :goto_5a
    const/high16 v78, 0x8000000

    and-int v78, v2, v78

    if-eqz v78, :cond_5b

    .line 160
    new-instance v78, Ljava/util/ArrayList;

    invoke-direct/range {v78 .. v78}, Ljava/util/ArrayList;-><init>()V

    goto :goto_5b

    :cond_5b
    move-object/from16 v78, p92

    :goto_5b
    const/high16 v79, 0x10000000

    and-int v79, v2, v79

    if-eqz v79, :cond_5c

    const/16 v79, 0x0

    goto :goto_5c

    :cond_5c
    move/from16 v79, p93

    :goto_5c
    const/high16 v80, 0x20000000

    and-int v80, v2, v80

    if-eqz v80, :cond_5d

    move/from16 v80, v31

    goto :goto_5d

    :cond_5d
    move/from16 v80, p94

    :goto_5d
    const/high16 v81, 0x40000000    # 2.0f

    and-int v81, v2, v81

    if-eqz v81, :cond_5e

    move/from16 v81, v31

    goto :goto_5e

    :cond_5e
    move/from16 v81, p95

    :goto_5e
    const/high16 v82, -0x80000000

    and-int v2, v2, v82

    if-eqz v2, :cond_5f

    move/from16 v2, v31

    goto :goto_5f

    :cond_5f
    move/from16 v2, p96

    :goto_5f
    and-int/lit8 v82, v3, 0x1

    if-eqz v82, :cond_60

    move/from16 v82, v31

    goto :goto_60

    :cond_60
    move/from16 v82, p97

    :goto_60
    and-int/lit8 v83, v3, 0x2

    if-eqz v83, :cond_61

    move/from16 v83, v31

    goto :goto_61

    :cond_61
    move/from16 v83, p98

    :goto_61
    and-int/lit8 v84, v3, 0x4

    if-eqz v84, :cond_62

    const/16 v84, 0x0

    goto :goto_62

    :cond_62
    move/from16 v84, p99

    :goto_62
    and-int/lit8 v85, v3, 0x8

    if-eqz v85, :cond_63

    const/16 v85, 0x0

    goto :goto_63

    :cond_63
    move/from16 v85, p100

    :goto_63
    and-int/lit8 v86, v3, 0x10

    if-eqz v86, :cond_64

    .line 161
    new-instance v86, Ljava/util/ArrayList;

    invoke-direct/range {v86 .. v86}, Ljava/util/ArrayList;-><init>()V

    goto :goto_64

    :cond_64
    move-object/from16 v86, p101

    :goto_64
    and-int/lit8 v87, v3, 0x20

    if-eqz v87, :cond_65

    const/16 v87, 0x0

    goto :goto_65

    :cond_65
    move/from16 v87, p102

    :goto_65
    and-int/lit8 v88, v3, 0x40

    if-eqz v88, :cond_66

    .line 162
    new-instance v88, Ljava/util/ArrayList;

    invoke-direct/range {v88 .. v88}, Ljava/util/ArrayList;-><init>()V

    goto :goto_66

    :cond_66
    move-object/from16 v88, p103

    :goto_66
    move/from16 p23, v0

    and-int/lit16 v0, v3, 0x80

    if-eqz v0, :cond_67

    const/4 v0, 0x0

    goto :goto_67

    :cond_67
    move/from16 v0, p104

    :goto_67
    move/from16 p24, v0

    and-int/lit16 v0, v3, 0x100

    if-eqz v0, :cond_68

    .line 163
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    goto :goto_68

    :cond_68
    move-object/from16 v0, p105

    :goto_68
    move-object/from16 p25, v0

    and-int/lit16 v0, v3, 0x200

    if-eqz v0, :cond_69

    const/4 v0, 0x0

    goto :goto_69

    :cond_69
    move/from16 v0, p106

    :goto_69
    move/from16 p26, v0

    and-int/lit16 v0, v3, 0x400

    if-eqz v0, :cond_6a

    const/4 v0, 0x0

    goto :goto_6a

    :cond_6a
    move/from16 v0, p107

    :goto_6a
    move/from16 p27, v0

    and-int/lit16 v0, v3, 0x800

    if-eqz v0, :cond_6b

    const/4 v0, 0x0

    goto :goto_6b

    :cond_6b
    move/from16 v0, p108

    :goto_6b
    move/from16 p28, v0

    and-int/lit16 v0, v3, 0x1000

    if-eqz v0, :cond_6c

    const/4 v0, -0x1

    goto :goto_6c

    :cond_6c
    move/from16 v0, p109

    :goto_6c
    move/from16 p29, v0

    and-int/lit16 v0, v3, 0x2000

    if-eqz v0, :cond_6d

    const/4 v0, 0x0

    goto :goto_6d

    :cond_6d
    move/from16 v0, p110

    :goto_6d
    move/from16 p30, v0

    and-int/lit16 v0, v3, 0x4000

    if-eqz v0, :cond_6e

    const/4 v0, 0x0

    goto :goto_6e

    :cond_6e
    move/from16 v0, p111

    :goto_6e
    and-int v89, v3, v16

    if-eqz v89, :cond_6f

    const/16 v89, 0x0

    goto :goto_6f

    :cond_6f
    move/from16 v89, p112

    :goto_6f
    and-int v90, v3, v18

    if-eqz v90, :cond_70

    const/16 v90, -0x1

    goto :goto_70

    :cond_70
    move/from16 v90, p113

    :goto_70
    and-int v91, v3, v20

    if-eqz v91, :cond_71

    const/16 v91, 0x0

    goto :goto_71

    :cond_71
    move/from16 v91, p114

    :goto_71
    and-int v92, v3, v22

    if-eqz v92, :cond_72

    const/16 v92, 0x0

    goto :goto_72

    :cond_72
    move/from16 v92, p115

    :goto_72
    and-int v93, v3, v24

    if-eqz v93, :cond_73

    const/16 v93, 0x0

    goto :goto_73

    :cond_73
    move/from16 v93, p116

    :goto_73
    const/high16 v94, 0x100000

    and-int v94, v3, v94

    if-eqz v94, :cond_74

    const/16 v94, -0x1

    goto :goto_74

    :cond_74
    move/from16 v94, p117

    :goto_74
    const/high16 v95, 0x200000

    and-int v95, v3, v95

    if-eqz v95, :cond_75

    move/from16 v95, v31

    goto :goto_75

    :cond_75
    move/from16 v95, p118

    :goto_75
    const/high16 v96, 0x400000

    and-int v96, v3, v96

    if-eqz v96, :cond_76

    move/from16 v96, v31

    goto :goto_76

    :cond_76
    move/from16 v96, p119

    :goto_76
    const/high16 v97, 0x800000

    and-int v97, v3, v97

    if-eqz v97, :cond_77

    const/16 v97, 0x0

    goto :goto_77

    :cond_77
    move/from16 v97, p120

    :goto_77
    const/high16 v98, 0x1000000

    and-int v98, v3, v98

    if-eqz v98, :cond_78

    const/16 v98, -0x1

    goto :goto_78

    :cond_78
    move/from16 v98, p121

    :goto_78
    const/high16 v99, 0x2000000

    and-int v99, v3, v99

    if-eqz v99, :cond_79

    move/from16 v99, v31

    goto :goto_79

    :cond_79
    move/from16 v99, p122

    :goto_79
    const/high16 v100, 0x4000000

    and-int v100, v3, v100

    move/from16 p31, v0

    if-eqz v100, :cond_7a

    const/4 v0, 0x7

    .line 164
    new-array v0, v0, [F

    goto :goto_7a

    :cond_7a
    move-object/from16 v0, p123

    :goto_7a
    const/high16 v100, 0x8000000

    and-int v100, v3, v100

    move-object/from16 p32, v0

    if-eqz v100, :cond_7b

    const/4 v0, 0x2

    .line 165
    new-array v0, v0, [F

    goto :goto_7b

    :cond_7b
    move-object/from16 v0, p124

    :goto_7b
    const/high16 v100, 0x10000000

    and-int v100, v3, v100

    if-eqz v100, :cond_7c

    const/16 v100, 0x0

    goto :goto_7c

    :cond_7c
    move/from16 v100, p125

    :goto_7c
    const/high16 v101, 0x20000000

    and-int v101, v3, v101

    if-eqz v101, :cond_7d

    const/16 v101, 0x0

    goto :goto_7d

    :cond_7d
    move/from16 v101, p126

    :goto_7d
    const/high16 v102, 0x40000000    # 2.0f

    and-int v102, v3, v102

    if-eqz v102, :cond_7e

    const/16 v102, 0x0

    goto :goto_7e

    :cond_7e
    move/from16 v102, p127

    :goto_7e
    const/high16 v103, -0x80000000

    and-int v3, v3, v103

    if-eqz v3, :cond_7f

    const/4 v3, 0x0

    goto :goto_7f

    :cond_7f
    move/from16 v3, p128

    :goto_7f
    and-int/lit8 v103, v4, 0x1

    if-eqz v103, :cond_80

    const/16 v103, 0x0

    goto :goto_80

    :cond_80
    move/from16 v103, p129

    :goto_80
    and-int/lit8 v104, v4, 0x2

    if-eqz v104, :cond_81

    const/16 v104, 0x0

    goto :goto_81

    :cond_81
    move/from16 v104, p130

    :goto_81
    and-int/lit8 v105, v4, 0x4

    if-eqz v105, :cond_82

    const/16 v105, 0x0

    goto :goto_82

    :cond_82
    move/from16 v105, p131

    :goto_82
    and-int/lit8 v106, v4, 0x8

    if-eqz v106, :cond_83

    const/16 v106, 0x0

    goto :goto_83

    :cond_83
    move/from16 v106, p132

    :goto_83
    and-int/lit8 v107, v4, 0x10

    if-eqz v107, :cond_84

    const/16 v107, 0x0

    goto :goto_84

    :cond_84
    move/from16 v107, p133

    :goto_84
    and-int/lit8 v108, v4, 0x20

    if-eqz v108, :cond_85

    const/16 v108, 0x0

    goto :goto_85

    :cond_85
    move/from16 v108, p134

    :goto_85
    and-int/lit8 v109, v4, 0x40

    if-eqz v109, :cond_86

    const/16 v109, 0x0

    goto :goto_86

    :cond_86
    move/from16 v109, p135

    :goto_86
    move-object/from16 p33, v0

    and-int/lit16 v0, v4, 0x80

    if-eqz v0, :cond_87

    const/4 v0, 0x0

    goto :goto_87

    :cond_87
    move/from16 v0, p136

    :goto_87
    move/from16 p34, v0

    and-int/lit16 v0, v4, 0x100

    if-eqz v0, :cond_88

    const/4 v0, 0x0

    goto :goto_88

    :cond_88
    move/from16 v0, p137

    :goto_88
    move/from16 p35, v0

    and-int/lit16 v0, v4, 0x200

    if-eqz v0, :cond_89

    const/4 v0, 0x0

    goto :goto_89

    :cond_89
    move/from16 v0, p138

    :goto_89
    move/from16 p36, v0

    and-int/lit16 v0, v4, 0x400

    if-eqz v0, :cond_8a

    const/4 v0, 0x0

    goto :goto_8a

    :cond_8a
    move/from16 v0, p139

    :goto_8a
    move/from16 p37, v0

    and-int/lit16 v0, v4, 0x800

    if-eqz v0, :cond_8b

    const/4 v0, 0x0

    goto :goto_8b

    :cond_8b
    move/from16 v0, p140

    :goto_8b
    move/from16 p38, v0

    and-int/lit16 v0, v4, 0x1000

    if-eqz v0, :cond_8c

    const/4 v0, 0x0

    goto :goto_8c

    :cond_8c
    move/from16 v0, p141

    :goto_8c
    move/from16 p39, v0

    and-int/lit16 v0, v4, 0x2000

    if-eqz v0, :cond_8d

    const/4 v0, 0x0

    goto :goto_8d

    :cond_8d
    move/from16 v0, p142

    :goto_8d
    move/from16 p40, v0

    and-int/lit16 v0, v4, 0x4000

    if-eqz v0, :cond_8e

    const/4 v0, 0x0

    goto :goto_8e

    :cond_8e
    move/from16 v0, p143

    :goto_8e
    and-int v16, v4, v16

    if-eqz v16, :cond_8f

    const/16 v16, 0x0

    goto :goto_8f

    :cond_8f
    move/from16 v16, p144

    :goto_8f
    and-int v18, v4, v18

    if-eqz v18, :cond_90

    move/from16 v18, v31

    goto :goto_90

    :cond_90
    move/from16 v18, p145

    :goto_90
    and-int v20, v4, v20

    if-eqz v20, :cond_91

    goto :goto_91

    :cond_91
    move/from16 v31, p146

    :goto_91
    and-int v20, v4, v22

    move/from16 p41, v0

    if-eqz v20, :cond_92

    const/4 v0, 0x7

    .line 166
    new-array v0, v0, [I

    goto :goto_92

    :cond_92
    move-object/from16 v0, p147

    :goto_92
    and-int v4, v4, v24

    if-eqz v4, :cond_93

    const/4 v4, -0x1

    move/16 p149, v4

    :goto_93
    move/from16 p42, p7

    move/from16 p43, p8

    move/from16 p44, p9

    move/from16 p45, p10

    move/from16 p46, p11

    move/from16 p47, p12

    move/from16 p48, p13

    move-object/from16 p70, p14

    move-object/from16 p71, p15

    move/from16 p73, p16

    move/from16 p74, p17

    move-object/from16 p75, p18

    move/from16 p76, p19

    move/from16 p77, p20

    move-object/from16 p78, p21

    move/from16 p79, p22

    move/from16 p80, p23

    move/from16 p105, p24

    move-object/from16 p106, p25

    move/from16 p107, p26

    move/from16 p108, p27

    move/from16 p109, p28

    move/from16 p110, p29

    move/from16 p111, p30

    move/from16 p112, p31

    move-object/from16 p124, p32

    move-object/from16 p125, p33

    move/from16 p137, p34

    move/from16 p138, p35

    move/from16 p139, p36

    move/from16 p140, p37

    move/from16 p141, p38

    move/from16 p142, p39

    move/from16 p143, p40

    move/from16 p144, p41

    move-object/16 p148, v0

    move-object/from16 p65, v1

    move/from16 p97, v2

    move/from16 p129, v3

    move/from16 p16, v5

    move/from16 p12, v6

    move/from16 p7, v11

    move/from16 p8, v12

    move/from16 p9, v13

    move/from16 p10, v14

    move/from16 p11, v15

    move/from16 p145, v16

    move/from16 p17, v17

    move/16 p146, v18

    move/from16 p18, v19

    move/from16 p19, v21

    move/from16 p20, v23

    move/from16 p21, v25

    move/from16 p22, v26

    move/from16 p23, v27

    move/from16 p24, v28

    move/from16 p25, v29

    move/from16 p26, v30

    move/16 p147, v31

    move/from16 p27, v32

    move/from16 p28, v33

    move/from16 p29, v34

    move/from16 p30, v35

    move/from16 p31, v36

    move/from16 p32, v37

    move/from16 p34, v38

    move/from16 p35, v39

    move/from16 p36, v40

    move/from16 p37, v41

    move/from16 p38, v42

    move/from16 p39, v43

    move/from16 p40, v44

    move/from16 p49, v45

    move/from16 p50, v46

    move/from16 p51, v47

    move/from16 p52, v48

    move/from16 p53, v49

    move/from16 p54, v50

    move/from16 p55, v51

    move/from16 p56, v52

    move/from16 p57, v53

    move/from16 p58, v54

    move/from16 p59, v55

    move/from16 p60, v56

    move/from16 p61, v57

    move/from16 p62, v58

    move/from16 p63, v59

    move/from16 p64, v60

    move/from16 p66, v61

    move/from16 p67, v62

    move/from16 p68, v63

    move/from16 p69, v64

    move/from16 p72, v65

    move-object/from16 p81, v66

    move/from16 p82, v67

    move/from16 p83, v68

    move-object/from16 p84, v69

    move/from16 p85, v70

    move/from16 p86, v71

    move-object/from16 p87, v72

    move/from16 p88, v73

    move/from16 p89, v74

    move-object/from16 p90, v75

    move/from16 p91, v76

    move/from16 p92, v77

    move-object/from16 p93, v78

    move/from16 p94, v79

    move/from16 p95, v80

    move/from16 p96, v81

    move/from16 p98, v82

    move/from16 p99, v83

    move/from16 p100, v84

    move/from16 p101, v85

    move-object/from16 p102, v86

    move/from16 p103, v87

    move-object/from16 p104, v88

    move/from16 p113, v89

    move/from16 p114, v90

    move/from16 p115, v91

    move/from16 p116, v92

    move/from16 p117, v93

    move/from16 p118, v94

    move/from16 p119, v95

    move/from16 p120, v96

    move/from16 p121, v97

    move/from16 p122, v98

    move/from16 p123, v99

    move/from16 p126, v100

    move/from16 p127, v101

    move/from16 p128, v102

    move/from16 p130, v103

    move/from16 p131, v104

    move/from16 p132, v105

    move/from16 p133, v106

    move/from16 p134, v107

    move/from16 p135, v108

    move/from16 p136, v109

    move/from16 p13, p2

    move/from16 p14, p3

    move/from16 p15, p4

    move/from16 p33, p5

    move/from16 p41, p6

    move/from16 p3, v7

    move/from16 p4, v8

    move/from16 p5, v9

    move/from16 p6, v10

    move/from16 p2, p1

    move-object/from16 p1, p0

    goto :goto_94

    :cond_93
    move/16 p149, p148

    goto/16 :goto_93

    .line 167
    :goto_94
    invoke-direct/range {p1 .. p149}, Lcom/szabh/smable3/entity/BleWorkout4;-><init>(IIIIIIIIIIIIIIIIIIIIIIIIFIIIIIIIIIIIIIFFFFFFFIIIIFIIIIIIIIIIFFI[IIIII[F[IFIILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IFFFFFIILjava/util/List;ILjava/util/List;ILjava/util/List;IIIIIIIIIIIIFFIIF[F[FIIIIIIIIIIIIIIIIIIIIFF[II)V

    return-void
.end method

.method public static final synthetic access$getMByteOrder$cp()Ljava/nio/ByteOrder;
    .locals 1

    sget-object v0, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    return-object v0
.end method

.method public static final synthetic access$setMByteOrder$cp(Ljava/nio/ByteOrder;)V
    .locals 0

    sput-object p0, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleWorkout4;IIIIIIIIIIIIIIIIIIIIIIIIFIIIIIIIIIIIIIFFFFFFFIIIIFIIIIIIIIIIFFI[IIIII[F[IFIILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IFFFFFIILjava/util/List;ILjava/util/List;ILjava/util/List;IIIIIIIIIIIIFFIIF[F[FIIIIIIIIIIIIIIIIIIIIFF[IIIIIIILjava/lang/Object;)Lcom/szabh/smable3/entity/BleWorkout4;
    .locals 24

    move-object/from16 v0, p0

    move/from16 v1, p149

    move/from16 v2, p150

    move/from16 v3, p151

    move/from16 v4, p152

    move/from16 v5, p153

    and-int/lit8 v6, v1, 0x1

    if-eqz v6, :cond_0

    iget v6, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mStart:I

    goto :goto_0

    :cond_0
    move/from16 v6, p1

    :goto_0
    and-int/lit8 v7, v1, 0x2

    if-eqz v7, :cond_1

    iget v7, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mEnd:I

    goto :goto_1

    :cond_1
    move/from16 v7, p2

    :goto_1
    and-int/lit8 v8, v1, 0x4

    if-eqz v8, :cond_2

    iget v8, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mSize:I

    goto :goto_2

    :cond_2
    move/from16 v8, p3

    :goto_2
    and-int/lit8 v9, v1, 0x8

    if-eqz v9, :cond_3

    iget v9, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildNumber:I

    goto :goto_3

    :cond_3
    move/from16 v9, p4

    :goto_3
    and-int/lit8 v10, v1, 0x10

    if-eqz v10, :cond_4

    iget v10, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mMode:I

    goto :goto_4

    :cond_4
    move/from16 v10, p5

    :goto_4
    and-int/lit8 v11, v1, 0x20

    if-eqz v11, :cond_5

    iget v11, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mDuration:I

    goto :goto_5

    :cond_5
    move/from16 v11, p6

    :goto_5
    and-int/lit8 v12, v1, 0x40

    if-eqz v12, :cond_6

    iget v12, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mPausedDuration:I

    goto :goto_6

    :cond_6
    move/from16 v12, p7

    :goto_6
    and-int/lit16 v13, v1, 0x80

    if-eqz v13, :cond_7

    iget v13, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mCurBpm:I

    goto :goto_7

    :cond_7
    move/from16 v13, p8

    :goto_7
    and-int/lit16 v14, v1, 0x100

    if-eqz v14, :cond_8

    iget v14, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mAvgBpm:I

    goto :goto_8

    :cond_8
    move/from16 v14, p9

    :goto_8
    and-int/lit16 v15, v1, 0x200

    if-eqz v15, :cond_9

    iget v15, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxBpm:I

    goto :goto_9

    :cond_9
    move/from16 v15, p10

    :goto_9
    move/from16 p1, v6

    and-int/lit16 v6, v1, 0x400

    if-eqz v6, :cond_a

    iget v6, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mMinBpm:I

    goto :goto_a

    :cond_a
    move/from16 v6, p11

    :goto_a
    move/from16 p2, v6

    and-int/lit16 v6, v1, 0x800

    if-eqz v6, :cond_b

    iget v6, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mCountBpm:I

    goto :goto_b

    :cond_b
    move/from16 v6, p12

    :goto_b
    move/from16 p3, v6

    and-int/lit16 v6, v1, 0x1000

    if-eqz v6, :cond_c

    iget v6, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mTotalBpm:I

    goto :goto_c

    :cond_c
    move/from16 v6, p13

    :goto_c
    move/from16 p4, v6

    and-int/lit16 v6, v1, 0x2000

    if-eqz v6, :cond_d

    iget v6, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mStep:I

    goto :goto_d

    :cond_d
    move/from16 v6, p14

    :goto_d
    move/from16 p5, v6

    and-int/lit16 v6, v1, 0x4000

    if-eqz v6, :cond_e

    iget v6, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mDistance:I

    goto :goto_e

    :cond_e
    move/from16 v6, p15

    :goto_e
    const v16, 0x8000

    and-int v17, v1, v16

    if-eqz v17, :cond_f

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mCalorie:I

    goto :goto_f

    :cond_f
    move/from16 v1, p16

    :goto_f
    const/high16 v17, 0x10000

    and-int v18, p149, v17

    move/from16 p6, v1

    if-eqz v18, :cond_10

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mAltitude:I

    goto :goto_10

    :cond_10
    move/from16 v1, p17

    :goto_10
    const/high16 v18, 0x20000

    and-int v19, p149, v18

    move/from16 p7, v1

    if-eqz v19, :cond_11

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxAltitude:I

    goto :goto_11

    :cond_11
    move/from16 v1, p18

    :goto_11
    const/high16 v19, 0x40000

    and-int v20, p149, v19

    move/from16 p8, v1

    if-eqz v20, :cond_12

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mMinAltitude:I

    goto :goto_12

    :cond_12
    move/from16 v1, p19

    :goto_12
    const/high16 v20, 0x80000

    and-int v21, p149, v20

    move/from16 p9, v1

    if-eqz v21, :cond_13

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mAscendAltitude:I

    goto :goto_13

    :cond_13
    move/from16 v1, p20

    :goto_13
    const/high16 v21, 0x100000

    and-int v22, p149, v21

    move/from16 p10, v1

    if-eqz v22, :cond_14

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mDescendAltitude:I

    goto :goto_14

    :cond_14
    move/from16 v1, p21

    :goto_14
    const/high16 v22, 0x200000

    and-int v23, p149, v22

    move/from16 p11, v1

    if-eqz v23, :cond_15

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mCountAltitude:I

    goto :goto_15

    :cond_15
    move/from16 v1, p22

    :goto_15
    const/high16 v23, 0x400000

    and-int v23, p149, v23

    move/from16 p12, v1

    if-eqz v23, :cond_16

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mTotalAltitude:I

    goto :goto_16

    :cond_16
    move/from16 v1, p23

    :goto_16
    const/high16 v23, 0x800000

    and-int v23, p149, v23

    move/from16 p13, v1

    if-eqz v23, :cond_17

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mAirPressure:I

    goto :goto_17

    :cond_17
    move/from16 v1, p24

    :goto_17
    const/high16 v23, 0x1000000

    and-int v23, p149, v23

    move/from16 p14, v1

    if-eqz v23, :cond_18

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpeed:F

    goto :goto_18

    :cond_18
    move/from16 v1, p25

    :goto_18
    const/high16 v23, 0x2000000

    and-int v23, p149, v23

    move/from16 p15, v1

    if-eqz v23, :cond_19

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mCountSatellite:I

    goto :goto_19

    :cond_19
    move/from16 v1, p26

    :goto_19
    const/high16 v23, 0x4000000

    and-int v23, p149, v23

    move/from16 p16, v1

    if-eqz v23, :cond_1a

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpm:I

    goto :goto_1a

    :cond_1a
    move/from16 v1, p27

    :goto_1a
    const/high16 v23, 0x8000000

    and-int v23, p149, v23

    move/from16 p17, v1

    if-eqz v23, :cond_1b

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxSpm:I

    goto :goto_1b

    :cond_1b
    move/from16 v1, p28

    :goto_1b
    const/high16 v23, 0x10000000

    and-int v23, p149, v23

    move/from16 p18, v1

    if-eqz v23, :cond_1c

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mMinSpm:I

    goto :goto_1c

    :cond_1c
    move/from16 v1, p29

    :goto_1c
    const/high16 v23, 0x20000000

    and-int v23, p149, v23

    move/from16 p19, v1

    if-eqz v23, :cond_1d

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mPace:I

    goto :goto_1d

    :cond_1d
    move/from16 v1, p30

    :goto_1d
    const/high16 v23, 0x40000000    # 2.0f

    and-int v23, p149, v23

    move/from16 p20, v1

    if-eqz v23, :cond_1e

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxPace:I

    goto :goto_1e

    :cond_1e
    move/from16 v1, p31

    :goto_1e
    const/high16 v23, -0x80000000

    and-int v23, p149, v23

    move/from16 p21, v1

    if-eqz v23, :cond_1f

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mMinPace:I

    goto :goto_1f

    :cond_1f
    move/from16 v1, p32

    :goto_1f
    and-int/lit8 v23, v2, 0x1

    move/from16 p22, v1

    if-eqz v23, :cond_20

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mCurStress:I

    goto :goto_20

    :cond_20
    move/from16 v1, p33

    :goto_20
    and-int/lit8 v23, v2, 0x2

    move/from16 p23, v1

    if-eqz v23, :cond_21

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mAvgStress:I

    goto :goto_21

    :cond_21
    move/from16 v1, p34

    :goto_21
    and-int/lit8 v23, v2, 0x4

    move/from16 p24, v1

    if-eqz v23, :cond_22

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mMinStress:I

    goto :goto_22

    :cond_22
    move/from16 v1, p35

    :goto_22
    and-int/lit8 v23, v2, 0x8

    move/from16 p25, v1

    if-eqz v23, :cond_23

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxStress:I

    goto :goto_23

    :cond_23
    move/from16 v1, p36

    :goto_23
    and-int/lit8 v23, v2, 0x10

    move/from16 p26, v1

    if-eqz v23, :cond_24

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mCountStress:I

    goto :goto_24

    :cond_24
    move/from16 v1, p37

    :goto_24
    and-int/lit8 v23, v2, 0x20

    move/from16 p27, v1

    if-eqz v23, :cond_25

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mTotalStress:I

    goto :goto_25

    :cond_25
    move/from16 v1, p38

    :goto_25
    and-int/lit8 v23, v2, 0x40

    move/from16 p28, v1

    if-eqz v23, :cond_26

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxSpeed:F

    goto :goto_26

    :cond_26
    move/from16 v1, p39

    :goto_26
    move/from16 p29, v1

    and-int/lit16 v1, v2, 0x80

    if-eqz v1, :cond_27

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mMinSpeed:F

    goto :goto_27

    :cond_27
    move/from16 v1, p40

    :goto_27
    move/from16 p30, v1

    and-int/lit16 v1, v2, 0x100

    if-eqz v1, :cond_28

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mAvgSpeed:F

    goto :goto_28

    :cond_28
    move/from16 v1, p41

    :goto_28
    move/from16 p31, v1

    and-int/lit16 v1, v2, 0x200

    if-eqz v1, :cond_29

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mStamina:F

    goto :goto_29

    :cond_29
    move/from16 v1, p42

    :goto_29
    move/from16 p32, v1

    and-int/lit16 v1, v2, 0x400

    if-eqz v1, :cond_2a

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mAerobic:F

    goto :goto_2a

    :cond_2a
    move/from16 v1, p43

    :goto_2a
    move/from16 p33, v1

    and-int/lit16 v1, v2, 0x800

    if-eqz v1, :cond_2b

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mAnaerobic:F

    goto :goto_2b

    :cond_2b
    move/from16 v1, p44

    :goto_2b
    move/from16 p34, v1

    and-int/lit16 v1, v2, 0x1000

    if-eqz v1, :cond_2c

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mMetTotal:F

    goto :goto_2c

    :cond_2c
    move/from16 v1, p45

    :goto_2c
    move/from16 p35, v1

    and-int/lit16 v1, v2, 0x2000

    if-eqz v1, :cond_2d

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mRecoveryTime:I

    goto :goto_2d

    :cond_2d
    move/from16 v1, p46

    :goto_2d
    move/from16 p36, v1

    and-int/lit16 v1, v2, 0x4000

    if-eqz v1, :cond_2e

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mTrainingLoad:I

    goto :goto_2e

    :cond_2e
    move/from16 v1, p47

    :goto_2e
    and-int v23, v2, v16

    move/from16 p37, v1

    if-eqz v23, :cond_2f

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxVO2:I

    goto :goto_2f

    :cond_2f
    move/from16 v1, p48

    :goto_2f
    and-int v23, v2, v17

    move/from16 p38, v1

    if-eqz v23, :cond_30

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mCnt:I

    goto :goto_30

    :cond_30
    move/from16 v1, p49

    :goto_30
    and-int v23, v2, v18

    move/from16 p39, v1

    if-eqz v23, :cond_31

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mCadence:F

    goto :goto_31

    :cond_31
    move/from16 v1, p50

    :goto_31
    and-int v23, v2, v19

    move/from16 p40, v1

    if-eqz v23, :cond_32

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxCadence:I

    goto :goto_32

    :cond_32
    move/from16 v1, p51

    :goto_32
    and-int v23, v2, v20

    move/from16 p41, v1

    if-eqz v23, :cond_33

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mSwimType:I

    goto :goto_33

    :cond_33
    move/from16 v1, p52

    :goto_33
    and-int v23, v2, v21

    move/from16 p42, v1

    if-eqz v23, :cond_34

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mCntFore:I

    goto :goto_34

    :cond_34
    move/from16 v1, p53

    :goto_34
    and-int v23, v2, v22

    move/from16 p43, v1

    if-eqz v23, :cond_35

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mCntBack:I

    goto :goto_35

    :cond_35
    move/from16 v1, p54

    :goto_35
    const/high16 v23, 0x400000

    and-int v23, v2, v23

    move/from16 p44, v1

    if-eqz v23, :cond_36

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mBackSwingTime:I

    goto :goto_36

    :cond_36
    move/from16 v1, p55

    :goto_36
    const/high16 v23, 0x800000

    and-int v23, v2, v23

    move/from16 p45, v1

    if-eqz v23, :cond_37

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mDownSwingTime:I

    goto :goto_37

    :cond_37
    move/from16 v1, p56

    :goto_37
    const/high16 v23, 0x1000000

    and-int v23, v2, v23

    move/from16 p46, v1

    if-eqz v23, :cond_38

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mDribbleTime:I

    goto :goto_38

    :cond_38
    move/from16 v1, p57

    :goto_38
    const/high16 v23, 0x2000000

    and-int v23, v2, v23

    move/from16 p47, v1

    if-eqz v23, :cond_39

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mTripCount:I

    goto :goto_39

    :cond_39
    move/from16 v1, p58

    :goto_39
    const/high16 v23, 0x4000000

    and-int v23, v2, v23

    move/from16 p48, v1

    if-eqz v23, :cond_3a

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mSessionCount:I

    goto :goto_3a

    :cond_3a
    move/from16 v1, p59

    :goto_3a
    const/high16 v23, 0x8000000

    and-int v23, v2, v23

    move/from16 p49, v1

    if-eqz v23, :cond_3b

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mStaBalance:I

    goto :goto_3b

    :cond_3b
    move/from16 v1, p60

    :goto_3b
    const/high16 v23, 0x10000000

    and-int v23, v2, v23

    move/from16 p50, v1

    if-eqz v23, :cond_3c

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mStepLen:F

    goto :goto_3c

    :cond_3c
    move/from16 v1, p61

    :goto_3c
    const/high16 v23, 0x20000000

    and-int v23, v2, v23

    move/from16 p51, v1

    if-eqz v23, :cond_3d

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mVerticalOscillation:F

    goto :goto_3d

    :cond_3d
    move/from16 v1, p62

    :goto_3d
    const/high16 v23, 0x40000000    # 2.0f

    and-int v23, v2, v23

    move/from16 p52, v1

    if-eqz v23, :cond_3e

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mRunPowerWatt:I

    goto :goto_3e

    :cond_3e
    move/from16 v1, p63

    :goto_3e
    const/high16 v23, -0x80000000

    and-int v2, v2, v23

    if-eqz v2, :cond_3f

    iget-object v2, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mBpmZoneCount:[I

    goto :goto_3f

    :cond_3f
    move-object/from16 v2, p64

    :goto_3f
    and-int/lit8 v23, v3, 0x1

    move/from16 p53, v1

    if-eqz v23, :cond_40

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mLactateThresholdHr:I

    goto :goto_40

    :cond_40
    move/from16 v1, p65

    :goto_40
    and-int/lit8 v23, v3, 0x2

    move/from16 p54, v1

    if-eqz v23, :cond_41

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mLactateThresholdPace:I

    goto :goto_41

    :cond_41
    move/from16 v1, p66

    :goto_41
    and-int/lit8 v23, v3, 0x4

    move/from16 p55, v1

    if-eqz v23, :cond_42

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mTrainingStatus:I

    goto :goto_42

    :cond_42
    move/from16 v1, p67

    :goto_42
    and-int/lit8 v23, v3, 0x8

    move/from16 p56, v1

    if-eqz v23, :cond_43

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mFitnessAge:I

    goto :goto_43

    :cond_43
    move/from16 v1, p68

    :goto_43
    and-int/lit8 v23, v3, 0x10

    move/from16 p57, v1

    if-eqz v23, :cond_44

    iget-object v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mFitnessLevel:[F

    goto :goto_44

    :cond_44
    move-object/from16 v1, p69

    :goto_44
    and-int/lit8 v23, v3, 0x20

    move-object/from16 p58, v1

    if-eqz v23, :cond_45

    iget-object v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mBestRunTime:[I

    goto :goto_45

    :cond_45
    move-object/from16 v1, p70

    :goto_45
    and-int/lit8 v23, v3, 0x40

    move-object/from16 p59, v1

    if-eqz v23, :cond_46

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mTlTrend:F

    goto :goto_46

    :cond_46
    move/from16 v1, p71

    :goto_46
    move/from16 p60, v1

    and-int/lit16 v1, v3, 0x80

    if-eqz v1, :cond_47

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mPathCount:I

    goto :goto_47

    :cond_47
    move/from16 v1, p72

    :goto_47
    move/from16 p61, v1

    and-int/lit16 v1, v3, 0x100

    if-eqz v1, :cond_48

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mPathSampleInterval:I

    goto :goto_48

    :cond_48
    move/from16 v1, p73

    :goto_48
    move/from16 p62, v1

    and-int/lit16 v1, v3, 0x200

    if-eqz v1, :cond_49

    iget-object v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mPathPoints:Ljava/util/List;

    goto :goto_49

    :cond_49
    move-object/from16 v1, p74

    :goto_49
    move-object/from16 p63, v1

    and-int/lit16 v1, v3, 0x400

    if-eqz v1, :cond_4a

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mHrPathCount:I

    goto :goto_4a

    :cond_4a
    move/from16 v1, p75

    :goto_4a
    move/from16 p64, v1

    and-int/lit16 v1, v3, 0x800

    if-eqz v1, :cond_4b

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mHrPathSampleInterval:I

    goto :goto_4b

    :cond_4b
    move/from16 v1, p76

    :goto_4b
    move/from16 p65, v1

    and-int/lit16 v1, v3, 0x1000

    if-eqz v1, :cond_4c

    iget-object v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mHrPathPoints:Ljava/util/List;

    goto :goto_4c

    :cond_4c
    move-object/from16 v1, p77

    :goto_4c
    move-object/from16 p66, v1

    and-int/lit16 v1, v3, 0x2000

    if-eqz v1, :cond_4d

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mPacePathCount:I

    goto :goto_4d

    :cond_4d
    move/from16 v1, p78

    :goto_4d
    move/from16 p67, v1

    and-int/lit16 v1, v3, 0x4000

    if-eqz v1, :cond_4e

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mPacePathSampleInterval:I

    goto :goto_4e

    :cond_4e
    move/from16 v1, p79

    :goto_4e
    and-int v23, v3, v16

    move/from16 p68, v1

    if-eqz v23, :cond_4f

    iget-object v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mPacePathPoints:Ljava/util/List;

    goto :goto_4f

    :cond_4f
    move-object/from16 v1, p80

    :goto_4f
    and-int v23, v3, v17

    move-object/from16 p69, v1

    if-eqz v23, :cond_50

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpeedPathCount:I

    goto :goto_50

    :cond_50
    move/from16 v1, p81

    :goto_50
    and-int v23, v3, v18

    move/from16 p70, v1

    if-eqz v23, :cond_51

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpeedPathSampleInterval:I

    goto :goto_51

    :cond_51
    move/from16 v1, p82

    :goto_51
    and-int v23, v3, v19

    move/from16 p71, v1

    if-eqz v23, :cond_52

    iget-object v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpeedPathPoints:Ljava/util/List;

    goto :goto_52

    :cond_52
    move-object/from16 v1, p83

    :goto_52
    and-int v23, v3, v20

    move-object/from16 p72, v1

    if-eqz v23, :cond_53

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mCadencePathCount:I

    goto :goto_53

    :cond_53
    move/from16 v1, p84

    :goto_53
    and-int v23, v3, v21

    move/from16 p73, v1

    if-eqz v23, :cond_54

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mCadencePathSampleInterval:I

    goto :goto_54

    :cond_54
    move/from16 v1, p85

    :goto_54
    and-int v23, v3, v22

    move/from16 p74, v1

    if-eqz v23, :cond_55

    iget-object v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mCadencePathPoints:Ljava/util/List;

    goto :goto_55

    :cond_55
    move-object/from16 v1, p86

    :goto_55
    const/high16 v23, 0x400000

    and-int v23, v3, v23

    move-object/from16 p75, v1

    if-eqz v23, :cond_56

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mAltitudePathCount:I

    goto :goto_56

    :cond_56
    move/from16 v1, p87

    :goto_56
    const/high16 v23, 0x800000

    and-int v23, v3, v23

    move/from16 p76, v1

    if-eqz v23, :cond_57

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mAltitudePathSampleInterval:I

    goto :goto_57

    :cond_57
    move/from16 v1, p88

    :goto_57
    const/high16 v23, 0x1000000

    and-int v23, v3, v23

    move/from16 p77, v1

    if-eqz v23, :cond_58

    iget-object v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mAltitudePathPoints:Ljava/util/List;

    goto :goto_58

    :cond_58
    move-object/from16 v1, p89

    :goto_58
    const/high16 v23, 0x2000000

    and-int v23, v3, v23

    move-object/from16 p78, v1

    if-eqz v23, :cond_59

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mRecoveryHrCount:I

    goto :goto_59

    :cond_59
    move/from16 v1, p90

    :goto_59
    const/high16 v23, 0x4000000

    and-int v23, v3, v23

    move/from16 p79, v1

    if-eqz v23, :cond_5a

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mRecoveryHrSampleInterval:I

    goto :goto_5a

    :cond_5a
    move/from16 v1, p91

    :goto_5a
    const/high16 v23, 0x8000000

    and-int v23, v3, v23

    move/from16 p80, v1

    if-eqz v23, :cond_5b

    iget-object v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mRecoveryHrPoints:Ljava/util/List;

    goto :goto_5b

    :cond_5b
    move-object/from16 v1, p92

    :goto_5b
    const/high16 v23, 0x10000000

    and-int v23, v3, v23

    move-object/from16 p81, v1

    if-eqz v23, :cond_5c

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mSwimPoolLength:I

    goto :goto_5c

    :cond_5c
    move/from16 v1, p93

    :goto_5c
    const/high16 v23, 0x20000000

    and-int v23, v3, v23

    move/from16 p82, v1

    if-eqz v23, :cond_5d

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->realTimeAerobic:F

    goto :goto_5d

    :cond_5d
    move/from16 v1, p94

    :goto_5d
    const/high16 v23, 0x40000000    # 2.0f

    and-int v23, v3, v23

    move/from16 p83, v1

    if-eqz v23, :cond_5e

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->realTimeAnaerobic:F

    goto :goto_5e

    :cond_5e
    move/from16 v1, p95

    :goto_5e
    const/high16 v23, -0x80000000

    and-int v3, v3, v23

    if-eqz v3, :cond_5f

    iget v3, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mCalorieTotal:F

    goto :goto_5f

    :cond_5f
    move/from16 v3, p96

    :goto_5f
    and-int/lit8 v23, v4, 0x1

    move/from16 p84, v1

    if-eqz v23, :cond_60

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mFatTotal:F

    goto :goto_60

    :cond_60
    move/from16 v1, p97

    :goto_60
    and-int/lit8 v23, v4, 0x2

    move/from16 p85, v1

    if-eqz v23, :cond_61

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mCarboTotal:F

    goto :goto_61

    :cond_61
    move/from16 v1, p98

    :goto_61
    and-int/lit8 v23, v4, 0x4

    move/from16 p86, v1

    if-eqz v23, :cond_62

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mPowerCount:I

    goto :goto_62

    :cond_62
    move/from16 v1, p99

    :goto_62
    and-int/lit8 v23, v4, 0x8

    move/from16 p87, v1

    if-eqz v23, :cond_63

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mPowerInterval:I

    goto :goto_63

    :cond_63
    move/from16 v1, p100

    :goto_63
    and-int/lit8 v23, v4, 0x10

    move/from16 p88, v1

    if-eqz v23, :cond_64

    iget-object v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mPowerPoints:Ljava/util/List;

    goto :goto_64

    :cond_64
    move-object/from16 v1, p101

    :goto_64
    and-int/lit8 v23, v4, 0x20

    move-object/from16 p89, v1

    if-eqz v23, :cond_65

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpmPathPointsCount:I

    goto :goto_65

    :cond_65
    move/from16 v1, p102

    :goto_65
    and-int/lit8 v23, v4, 0x40

    move/from16 p90, v1

    if-eqz v23, :cond_66

    iget-object v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpmPathPointsPoints:Ljava/util/List;

    goto :goto_66

    :cond_66
    move-object/from16 v1, p103

    :goto_66
    move-object/from16 p91, v1

    and-int/lit16 v1, v4, 0x80

    if-eqz v1, :cond_67

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mStepLenCount:I

    goto :goto_67

    :cond_67
    move/from16 v1, p104

    :goto_67
    move/from16 p92, v1

    and-int/lit16 v1, v4, 0x100

    if-eqz v1, :cond_68

    iget-object v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mStepLenPoints:Ljava/util/List;

    goto :goto_68

    :cond_68
    move-object/from16 v1, p105

    :goto_68
    move-object/from16 p93, v1

    and-int/lit16 v1, v4, 0x200

    if-eqz v1, :cond_69

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorTargetTime:I

    goto :goto_69

    :cond_69
    move/from16 v1, p106

    :goto_69
    move/from16 p94, v1

    and-int/lit16 v1, v4, 0x400

    if-eqz v1, :cond_6a

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorActualTime:I

    goto :goto_6a

    :cond_6a
    move/from16 v1, p107

    :goto_6a
    move/from16 p95, v1

    and-int/lit16 v1, v4, 0x800

    if-eqz v1, :cond_6b

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorDifferenceTime:I

    goto :goto_6b

    :cond_6b
    move/from16 v1, p108

    :goto_6b
    move/from16 p96, v1

    and-int/lit16 v1, v4, 0x1000

    if-eqz v1, :cond_6c

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorStatusTime:I

    goto :goto_6c

    :cond_6c
    move/from16 v1, p109

    :goto_6c
    move/from16 p97, v1

    and-int/lit16 v1, v4, 0x2000

    if-eqz v1, :cond_6d

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorTargetDistance:I

    goto :goto_6d

    :cond_6d
    move/from16 v1, p110

    :goto_6d
    move/from16 p98, v1

    and-int/lit16 v1, v4, 0x4000

    if-eqz v1, :cond_6e

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorActualDistance:I

    goto :goto_6e

    :cond_6e
    move/from16 v1, p111

    :goto_6e
    and-int v23, v4, v16

    move/from16 p99, v1

    if-eqz v23, :cond_6f

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorDifferenceDistance:I

    goto :goto_6f

    :cond_6f
    move/from16 v1, p112

    :goto_6f
    and-int v23, v4, v17

    move/from16 p100, v1

    if-eqz v23, :cond_70

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorStatusDistance:I

    goto :goto_70

    :cond_70
    move/from16 v1, p113

    :goto_70
    and-int v23, v4, v18

    move/from16 p101, v1

    if-eqz v23, :cond_71

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorTargetPace:I

    goto :goto_71

    :cond_71
    move/from16 v1, p114

    :goto_71
    and-int v23, v4, v19

    move/from16 p102, v1

    if-eqz v23, :cond_72

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorActualPace:I

    goto :goto_72

    :cond_72
    move/from16 v1, p115

    :goto_72
    and-int v23, v4, v20

    move/from16 p103, v1

    if-eqz v23, :cond_73

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorDifferencePace:I

    goto :goto_73

    :cond_73
    move/from16 v1, p116

    :goto_73
    and-int v21, v4, v21

    move/from16 p104, v1

    if-eqz v21, :cond_74

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorStatusPace:I

    goto :goto_74

    :cond_74
    move/from16 v1, p117

    :goto_74
    and-int v21, v4, v22

    move/from16 p105, v1

    if-eqz v21, :cond_75

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorTargetSpeed:F

    goto :goto_75

    :cond_75
    move/from16 v1, p118

    :goto_75
    const/high16 v21, 0x400000

    and-int v21, v4, v21

    move/from16 p106, v1

    if-eqz v21, :cond_76

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorActualSpeed:F

    goto :goto_76

    :cond_76
    move/from16 v1, p119

    :goto_76
    const/high16 v21, 0x800000

    and-int v21, v4, v21

    move/from16 p107, v1

    if-eqz v21, :cond_77

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorDifferenceSpeed:I

    goto :goto_77

    :cond_77
    move/from16 v1, p120

    :goto_77
    const/high16 v21, 0x1000000

    and-int v21, v4, v21

    move/from16 p108, v1

    if-eqz v21, :cond_78

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorStatusSpeed:I

    goto :goto_78

    :cond_78
    move/from16 v1, p121

    :goto_78
    const/high16 v21, 0x2000000

    and-int v21, v4, v21

    move/from16 p109, v1

    if-eqz v21, :cond_79

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxOxygenPower:F

    goto :goto_79

    :cond_79
    move/from16 v1, p122

    :goto_79
    const/high16 v21, 0x4000000

    and-int v21, v4, v21

    move/from16 p110, v1

    if-eqz v21, :cond_7a

    iget-object v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mTrendWeek:[F

    goto :goto_7a

    :cond_7a
    move-object/from16 v1, p123

    :goto_7a
    const/high16 v21, 0x8000000

    and-int v21, v4, v21

    move-object/from16 p111, v1

    if-eqz v21, :cond_7b

    iget-object v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mCyclingIndex:[F

    goto :goto_7b

    :cond_7b
    move-object/from16 v1, p124

    :goto_7b
    const/high16 v21, 0x10000000

    and-int v21, v4, v21

    move-object/from16 p112, v1

    if-eqz v21, :cond_7c

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mSwimSwolf:I

    goto :goto_7c

    :cond_7c
    move/from16 v1, p125

    :goto_7c
    const/high16 v21, 0x20000000

    and-int v21, v4, v21

    move/from16 p113, v1

    if-eqz v21, :cond_7d

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mCntLap:I

    goto :goto_7d

    :cond_7d
    move/from16 v1, p126

    :goto_7d
    const/high16 v21, 0x40000000    # 2.0f

    and-int v21, v4, v21

    move/from16 p114, v1

    if-eqz v21, :cond_7e

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mFrontCrawlPerc:I

    goto :goto_7e

    :cond_7e
    move/from16 v1, p127

    :goto_7e
    const/high16 v21, -0x80000000

    and-int v4, v4, v21

    if-eqz v4, :cond_7f

    iget v4, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mBreaststrokePerc:I

    goto :goto_7f

    :cond_7f
    move/from16 v4, p128

    :goto_7f
    and-int/lit8 v21, v5, 0x1

    move/from16 p115, v1

    if-eqz v21, :cond_80

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mBackstrokePerc:I

    goto :goto_80

    :cond_80
    move/from16 v1, p129

    :goto_80
    and-int/lit8 v21, v5, 0x2

    move/from16 p116, v1

    if-eqz v21, :cond_81

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mButterflyPerc:I

    goto :goto_81

    :cond_81
    move/from16 v1, p130

    :goto_81
    and-int/lit8 v21, v5, 0x4

    move/from16 p117, v1

    if-eqz v21, :cond_82

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mEllipticalSteps:I

    goto :goto_82

    :cond_82
    move/from16 v1, p131

    :goto_82
    and-int/lit8 v21, v5, 0x8

    move/from16 p118, v1

    if-eqz v21, :cond_83

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mWorkoutFlag:I

    goto :goto_83

    :cond_83
    move/from16 v1, p132

    :goto_83
    and-int/lit8 v21, v5, 0x10

    move/from16 p119, v1

    if-eqz v21, :cond_84

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildSwimStartTime:I

    goto :goto_84

    :cond_84
    move/from16 v1, p133

    :goto_84
    and-int/lit8 v21, v5, 0x20

    move/from16 p120, v1

    if-eqz v21, :cond_85

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildSwimDuration:I

    goto :goto_85

    :cond_85
    move/from16 v1, p134

    :goto_85
    and-int/lit8 v21, v5, 0x40

    move/from16 p121, v1

    if-eqz v21, :cond_86

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildSwimDistance:I

    goto :goto_86

    :cond_86
    move/from16 v1, p135

    :goto_86
    move/from16 p122, v1

    and-int/lit16 v1, v5, 0x80

    if-eqz v1, :cond_87

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildCyclingStartTime:I

    goto :goto_87

    :cond_87
    move/from16 v1, p136

    :goto_87
    move/from16 p123, v1

    and-int/lit16 v1, v5, 0x100

    if-eqz v1, :cond_88

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildCyclingDuration:I

    goto :goto_88

    :cond_88
    move/from16 v1, p137

    :goto_88
    move/from16 p124, v1

    and-int/lit16 v1, v5, 0x200

    if-eqz v1, :cond_89

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildCyclingDistance:I

    goto :goto_89

    :cond_89
    move/from16 v1, p138

    :goto_89
    move/from16 p125, v1

    and-int/lit16 v1, v5, 0x400

    if-eqz v1, :cond_8a

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildRunStartTime:I

    goto :goto_8a

    :cond_8a
    move/from16 v1, p139

    :goto_8a
    move/from16 p126, v1

    and-int/lit16 v1, v5, 0x800

    if-eqz v1, :cond_8b

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildRunDuration:I

    goto :goto_8b

    :cond_8b
    move/from16 v1, p140

    :goto_8b
    move/from16 p127, v1

    and-int/lit16 v1, v5, 0x1000

    if-eqz v1, :cond_8c

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildRunDistance:I

    goto :goto_8c

    :cond_8c
    move/from16 v1, p141

    :goto_8c
    move/from16 p128, v1

    and-int/lit16 v1, v5, 0x2000

    if-eqz v1, :cond_8d

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildSwimMode:I

    goto :goto_8d

    :cond_8d
    move/from16 v1, p142

    :goto_8d
    move/from16 p129, v1

    and-int/lit16 v1, v5, 0x4000

    if-eqz v1, :cond_8e

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildCyclingMode:I

    goto :goto_8e

    :cond_8e
    move/from16 v1, p143

    :goto_8e
    and-int v16, v5, v16

    move/from16 p130, v1

    if-eqz v16, :cond_8f

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildRunMode:I

    goto :goto_8f

    :cond_8f
    move/from16 v1, p144

    :goto_8f
    and-int v16, v5, v17

    move/from16 p131, v1

    if-eqz v16, :cond_90

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mRunLactateAvg:F

    goto :goto_90

    :cond_90
    move/from16 v1, p145

    :goto_90
    and-int v16, v5, v18

    move/from16 p132, v1

    if-eqz v16, :cond_91

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mCyclingLactateAvg:F

    goto :goto_91

    :cond_91
    move/from16 v1, p146

    :goto_91
    and-int v16, v5, v19

    move/from16 p133, v1

    if-eqz v16, :cond_92

    iget-object v1, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mPersonalZone:[I

    goto :goto_92

    :cond_92
    move-object/from16 v1, p147

    :goto_92
    and-int v5, v5, v20

    if-eqz v5, :cond_93

    iget v5, v0, Lcom/szabh/smable3/entity/BleWorkout4;->mAICoachSportID:I

    move/from16 p149, v5

    :goto_93
    move/from16 p134, p120

    move/from16 p135, p121

    move/from16 p136, p122

    move/from16 p137, p123

    move/from16 p138, p124

    move/from16 p139, p125

    move/from16 p140, p126

    move/from16 p141, p127

    move/from16 p142, p128

    move/from16 p143, p129

    move/from16 p144, p130

    move/from16 p145, p131

    move/from16 p146, p132

    move/from16 p147, p133

    move-object/from16 p148, v1

    move/from16 p129, v4

    move/from16 p120, p107

    move/from16 p121, p108

    move/from16 p122, p109

    move/from16 p123, p110

    move-object/from16 p124, p111

    move-object/from16 p125, p112

    move/from16 p126, p113

    move/from16 p127, p114

    move/from16 p128, p115

    move/from16 p130, p116

    move/from16 p131, p117

    move/from16 p132, p118

    move/from16 p133, p119

    move/from16 p107, p94

    move/from16 p108, p95

    move/from16 p109, p96

    move/from16 p110, p97

    move/from16 p111, p98

    move/from16 p112, p99

    move/from16 p113, p100

    move/from16 p114, p101

    move/from16 p115, p102

    move/from16 p116, p103

    move/from16 p117, p104

    move/from16 p118, p105

    move/from16 p119, p106

    move/from16 p97, v3

    move/from16 p94, p82

    move/from16 p95, p83

    move/from16 p96, p84

    move/from16 p98, p85

    move/from16 p99, p86

    move/from16 p100, p87

    move/from16 p101, p88

    move-object/from16 p102, p89

    move/from16 p103, p90

    move-object/from16 p104, p91

    move/from16 p105, p92

    move-object/from16 p106, p93

    move/from16 p82, p70

    move/from16 p83, p71

    move-object/from16 p84, p72

    move/from16 p85, p73

    move/from16 p86, p74

    move-object/from16 p87, p75

    move/from16 p88, p76

    move/from16 p89, p77

    move-object/from16 p90, p78

    move/from16 p91, p79

    move/from16 p92, p80

    move-object/from16 p93, p81

    move-object/from16 p70, p58

    move-object/from16 p71, p59

    move/from16 p72, p60

    move/from16 p73, p61

    move/from16 p74, p62

    move-object/from16 p75, p63

    move/from16 p76, p64

    move/from16 p77, p65

    move-object/from16 p78, p66

    move/from16 p79, p67

    move/from16 p80, p68

    move-object/from16 p81, p69

    move-object/from16 p65, v2

    move/from16 p58, p47

    move/from16 p59, p48

    move/from16 p60, p49

    move/from16 p61, p50

    move/from16 p62, p51

    move/from16 p63, p52

    move/from16 p64, p53

    move/from16 p66, p54

    move/from16 p67, p55

    move/from16 p68, p56

    move/from16 p69, p57

    move/from16 p47, p36

    move/from16 p48, p37

    move/from16 p49, p38

    move/from16 p50, p39

    move/from16 p51, p40

    move/from16 p52, p41

    move/from16 p53, p42

    move/from16 p54, p43

    move/from16 p55, p44

    move/from16 p56, p45

    move/from16 p57, p46

    move/from16 p36, p25

    move/from16 p37, p26

    move/from16 p38, p27

    move/from16 p39, p28

    move/from16 p40, p29

    move/from16 p41, p30

    move/from16 p42, p31

    move/from16 p43, p32

    move/from16 p44, p33

    move/from16 p45, p34

    move/from16 p46, p35

    move/from16 p25, p14

    move/from16 p26, p15

    move/from16 p27, p16

    move/from16 p28, p17

    move/from16 p29, p18

    move/from16 p30, p19

    move/from16 p31, p20

    move/from16 p32, p21

    move/from16 p33, p22

    move/from16 p34, p23

    move/from16 p35, p24

    move/from16 p16, v6

    move/from16 p14, p4

    move/from16 p15, p5

    move/from16 p17, p6

    move/from16 p18, p7

    move/from16 p19, p8

    move/from16 p20, p9

    move/from16 p21, p10

    move/from16 p22, p11

    move/from16 p23, p12

    move/from16 p24, p13

    move/from16 p4, v8

    move/from16 p5, v9

    move/from16 p6, v10

    move/from16 p7, v11

    move/from16 p8, v12

    move/from16 p9, v13

    move/from16 p10, v14

    move/from16 p11, v15

    move/from16 p12, p2

    move/from16 p13, p3

    move/from16 p3, v7

    move/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_94

    :cond_93
    move/from16 p149, p148

    goto/16 :goto_93

    :goto_94
    invoke-virtual/range {p1 .. p149}, Lcom/szabh/smable3/entity/BleWorkout4;->copy(IIIIIIIIIIIIIIIIIIIIIIIIFIIIIIIIIIIIIIFFFFFFFIIIIFIIIIIIIIIIFFI[IIIII[F[IFIILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IFFFFFIILjava/util/List;ILjava/util/List;ILjava/util/List;IIIIIIIIIIIIFFIIF[F[FIIIIIIIIIIIIIIIIIIIIFF[II)Lcom/szabh/smable3/entity/BleWorkout4;

    move-result-object v0

    return-object v0
.end method

.method private final readDynamicIntData(IZ)I
    .locals 1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 p2, 0x4

    if-eq p1, p2, :cond_0

    invoke-virtual {p0, p1}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    const/4 p1, 0x0

    return p1

    :cond_0
    sget-object p1, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, p1}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result p1

    return p1

    :cond_1
    if-eqz p2, :cond_2

    sget-object p1, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, p1}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt16(Ljava/nio/ByteOrder;)C

    move-result p1

    return p1

    :cond_2
    sget-object p1, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, p1}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16(Ljava/nio/ByteOrder;)S

    move-result p1

    return p1

    :cond_3
    if-eqz p2, :cond_4

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result p1

    return p1

    :cond_4
    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result p1

    return p1
.end method

.method public static synthetic readDynamicIntData$default(Lcom/szabh/smable3/entity/BleWorkout4;IZILjava/lang/Object;)I
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x1

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/szabh/smable3/entity/BleWorkout4;->readDynamicIntData(IZ)I

    move-result p0

    return p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mStart:I

    return v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxBpm:I

    return v0
.end method

.method public final component100()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPowerInterval:I

    return v0
.end method

.method public final component101()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPowerPoints:Ljava/util/List;

    return-object v0
.end method

.method public final component102()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpmPathPointsCount:I

    return v0
.end method

.method public final component103()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpmPathPointsPoints:Ljava/util/List;

    return-object v0
.end method

.method public final component104()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mStepLenCount:I

    return v0
.end method

.method public final component105()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mStepLenPoints:Ljava/util/List;

    return-object v0
.end method

.method public final component106()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorTargetTime:I

    return v0
.end method

.method public final component107()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorActualTime:I

    return v0
.end method

.method public final component108()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorDifferenceTime:I

    return v0
.end method

.method public final component109()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorStatusTime:I

    return v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMinBpm:I

    return v0
.end method

.method public final component110()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorTargetDistance:I

    return v0
.end method

.method public final component111()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorActualDistance:I

    return v0
.end method

.method public final component112()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorDifferenceDistance:I

    return v0
.end method

.method public final component113()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorStatusDistance:I

    return v0
.end method

.method public final component114()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorTargetPace:I

    return v0
.end method

.method public final component115()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorActualPace:I

    return v0
.end method

.method public final component116()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorDifferencePace:I

    return v0
.end method

.method public final component117()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorStatusPace:I

    return v0
.end method

.method public final component118()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorTargetSpeed:F

    return v0
.end method

.method public final component119()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorActualSpeed:F

    return v0
.end method

.method public final component12()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCountBpm:I

    return v0
.end method

.method public final component120()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorDifferenceSpeed:I

    return v0
.end method

.method public final component121()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorStatusSpeed:I

    return v0
.end method

.method public final component122()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxOxygenPower:F

    return v0
.end method

.method public final component123()[F
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mTrendWeek:[F

    return-object v0
.end method

.method public final component124()[F
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCyclingIndex:[F

    return-object v0
.end method

.method public final component125()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSwimSwolf:I

    return v0
.end method

.method public final component126()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCntLap:I

    return v0
.end method

.method public final component127()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mFrontCrawlPerc:I

    return v0
.end method

.method public final component128()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mBreaststrokePerc:I

    return v0
.end method

.method public final component129()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mBackstrokePerc:I

    return v0
.end method

.method public final component13()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mTotalBpm:I

    return v0
.end method

.method public final component130()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mButterflyPerc:I

    return v0
.end method

.method public final component131()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mEllipticalSteps:I

    return v0
.end method

.method public final component132()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mWorkoutFlag:I

    return v0
.end method

.method public final component133()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildSwimStartTime:I

    return v0
.end method

.method public final component134()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildSwimDuration:I

    return v0
.end method

.method public final component135()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildSwimDistance:I

    return v0
.end method

.method public final component136()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildCyclingStartTime:I

    return v0
.end method

.method public final component137()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildCyclingDuration:I

    return v0
.end method

.method public final component138()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildCyclingDistance:I

    return v0
.end method

.method public final component139()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildRunStartTime:I

    return v0
.end method

.method public final component14()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mStep:I

    return v0
.end method

.method public final component140()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildRunDuration:I

    return v0
.end method

.method public final component141()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildRunDistance:I

    return v0
.end method

.method public final component142()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildSwimMode:I

    return v0
.end method

.method public final component143()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildCyclingMode:I

    return v0
.end method

.method public final component144()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildRunMode:I

    return v0
.end method

.method public final component145()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mRunLactateAvg:F

    return v0
.end method

.method public final component146()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCyclingLactateAvg:F

    return v0
.end method

.method public final component147()[I
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPersonalZone:[I

    return-object v0
.end method

.method public final component148()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAICoachSportID:I

    return v0
.end method

.method public final component15()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mDistance:I

    return v0
.end method

.method public final component16()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCalorie:I

    return v0
.end method

.method public final component17()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAltitude:I

    return v0
.end method

.method public final component18()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxAltitude:I

    return v0
.end method

.method public final component19()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMinAltitude:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mEnd:I

    return v0
.end method

.method public final component20()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAscendAltitude:I

    return v0
.end method

.method public final component21()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mDescendAltitude:I

    return v0
.end method

.method public final component22()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCountAltitude:I

    return v0
.end method

.method public final component23()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mTotalAltitude:I

    return v0
.end method

.method public final component24()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAirPressure:I

    return v0
.end method

.method public final component25()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpeed:F

    return v0
.end method

.method public final component26()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCountSatellite:I

    return v0
.end method

.method public final component27()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpm:I

    return v0
.end method

.method public final component28()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxSpm:I

    return v0
.end method

.method public final component29()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMinSpm:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSize:I

    return v0
.end method

.method public final component30()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPace:I

    return v0
.end method

.method public final component31()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxPace:I

    return v0
.end method

.method public final component32()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMinPace:I

    return v0
.end method

.method public final component33()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCurStress:I

    return v0
.end method

.method public final component34()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAvgStress:I

    return v0
.end method

.method public final component35()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMinStress:I

    return v0
.end method

.method public final component36()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxStress:I

    return v0
.end method

.method public final component37()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCountStress:I

    return v0
.end method

.method public final component38()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mTotalStress:I

    return v0
.end method

.method public final component39()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxSpeed:F

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildNumber:I

    return v0
.end method

.method public final component40()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMinSpeed:F

    return v0
.end method

.method public final component41()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAvgSpeed:F

    return v0
.end method

.method public final component42()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mStamina:F

    return v0
.end method

.method public final component43()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAerobic:F

    return v0
.end method

.method public final component44()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAnaerobic:F

    return v0
.end method

.method public final component45()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMetTotal:F

    return v0
.end method

.method public final component46()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mRecoveryTime:I

    return v0
.end method

.method public final component47()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mTrainingLoad:I

    return v0
.end method

.method public final component48()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxVO2:I

    return v0
.end method

.method public final component49()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCnt:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMode:I

    return v0
.end method

.method public final component50()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCadence:F

    return v0
.end method

.method public final component51()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxCadence:I

    return v0
.end method

.method public final component52()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSwimType:I

    return v0
.end method

.method public final component53()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCntFore:I

    return v0
.end method

.method public final component54()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCntBack:I

    return v0
.end method

.method public final component55()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mBackSwingTime:I

    return v0
.end method

.method public final component56()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mDownSwingTime:I

    return v0
.end method

.method public final component57()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mDribbleTime:I

    return v0
.end method

.method public final component58()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mTripCount:I

    return v0
.end method

.method public final component59()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSessionCount:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mDuration:I

    return v0
.end method

.method public final component60()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mStaBalance:I

    return v0
.end method

.method public final component61()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mStepLen:F

    return v0
.end method

.method public final component62()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mVerticalOscillation:F

    return v0
.end method

.method public final component63()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mRunPowerWatt:I

    return v0
.end method

.method public final component64()[I
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mBpmZoneCount:[I

    return-object v0
.end method

.method public final component65()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mLactateThresholdHr:I

    return v0
.end method

.method public final component66()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mLactateThresholdPace:I

    return v0
.end method

.method public final component67()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mTrainingStatus:I

    return v0
.end method

.method public final component68()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mFitnessAge:I

    return v0
.end method

.method public final component69()[F
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mFitnessLevel:[F

    return-object v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPausedDuration:I

    return v0
.end method

.method public final component70()[I
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mBestRunTime:[I

    return-object v0
.end method

.method public final component71()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mTlTrend:F

    return v0
.end method

.method public final component72()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPathCount:I

    return v0
.end method

.method public final component73()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPathSampleInterval:I

    return v0
.end method

.method public final component74()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "[F>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPathPoints:Ljava/util/List;

    return-object v0
.end method

.method public final component75()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mHrPathCount:I

    return v0
.end method

.method public final component76()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mHrPathSampleInterval:I

    return v0
.end method

.method public final component77()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mHrPathPoints:Ljava/util/List;

    return-object v0
.end method

.method public final component78()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPacePathCount:I

    return v0
.end method

.method public final component79()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPacePathSampleInterval:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCurBpm:I

    return v0
.end method

.method public final component80()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPacePathPoints:Ljava/util/List;

    return-object v0
.end method

.method public final component81()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpeedPathCount:I

    return v0
.end method

.method public final component82()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpeedPathSampleInterval:I

    return v0
.end method

.method public final component83()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpeedPathPoints:Ljava/util/List;

    return-object v0
.end method

.method public final component84()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCadencePathCount:I

    return v0
.end method

.method public final component85()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCadencePathSampleInterval:I

    return v0
.end method

.method public final component86()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCadencePathPoints:Ljava/util/List;

    return-object v0
.end method

.method public final component87()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAltitudePathCount:I

    return v0
.end method

.method public final component88()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAltitudePathSampleInterval:I

    return v0
.end method

.method public final component89()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAltitudePathPoints:Ljava/util/List;

    return-object v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAvgBpm:I

    return v0
.end method

.method public final component90()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mRecoveryHrCount:I

    return v0
.end method

.method public final component91()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mRecoveryHrSampleInterval:I

    return v0
.end method

.method public final component92()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mRecoveryHrPoints:Ljava/util/List;

    return-object v0
.end method

.method public final component93()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSwimPoolLength:I

    return v0
.end method

.method public final component94()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->realTimeAerobic:F

    return v0
.end method

.method public final component95()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->realTimeAnaerobic:F

    return v0
.end method

.method public final component96()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCalorieTotal:F

    return v0
.end method

.method public final component97()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mFatTotal:F

    return v0
.end method

.method public final component98()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCarboTotal:F

    return v0
.end method

.method public final component99()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPowerCount:I

    return v0
.end method

.method public final copy(IIIIIIIIIIIIIIIIIIIIIIIIFIIIIIIIIIIIIIFFFFFFFIIIIFIIIIIIIIIIFFI[IIIII[F[IFIILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IFFFFFIILjava/util/List;ILjava/util/List;ILjava/util/List;IIIIIIIIIIIIFFIIF[F[FIIIIIIIIIIIIIIIIIIIIFF[II)Lcom/szabh/smable3/entity/BleWorkout4;
    .locals 150
    .param p64    # [I
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p69    # [F
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p70    # [I
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p74    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p77    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p80    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p83    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p86    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p89    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p92    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p101    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p103    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p105    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p123    # [F
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p124    # [F
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p147    # [I
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIIIIIIIIIIIIIIIIIIIIIIIFIIIIIIIIIIIIIFFFFFFFIIIIFIIIIIIIIIIFFI[IIIII[F[IFII",
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
            ">;II",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;IFFFFFII",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;I",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;IIIIIIIIIIIIFFIIF[F[FIIIIIIIIIIIIIIIIIIIIFF[II)",
            "Lcom/szabh/smable3/entity/BleWorkout4;"
        }
    .end annotation

    const-string v0, "mBpmZoneCount"

    move-object/from16 v1, p64

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mFitnessLevel"

    move-object/from16 v2, p69

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mBestRunTime"

    move-object/from16 v3, p70

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mPathPoints"

    move-object/from16 v4, p74

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mHrPathPoints"

    move-object/from16 v5, p77

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mPacePathPoints"

    move-object/from16 v6, p80

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mSpeedPathPoints"

    move-object/from16 v7, p83

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mCadencePathPoints"

    move-object/from16 v8, p86

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mAltitudePathPoints"

    move-object/from16 v9, p89

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mRecoveryHrPoints"

    move-object/from16 v10, p92

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mPowerPoints"

    move-object/from16 v11, p101

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mSpmPathPointsPoints"

    move-object/from16 v12, p103

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mStepLenPoints"

    move-object/from16 v13, p105

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mTrendWeek"

    move-object/from16 v14, p123

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mCyclingIndex"

    move-object/from16 v15, p124

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mPersonalZone"

    move-object/from16 v1, p147

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/szabh/smable3/entity/BleWorkout4;

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

    move/from16 v34, p33

    move/from16 v35, p34

    move/from16 v36, p35

    move/from16 v37, p36

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

    move/from16 v51, p50

    move/from16 v52, p51

    move/from16 v53, p52

    move/from16 v54, p53

    move/from16 v55, p54

    move/from16 v56, p55

    move/from16 v57, p56

    move/from16 v58, p57

    move/from16 v59, p58

    move/from16 v60, p59

    move/from16 v61, p60

    move/from16 v62, p61

    move/from16 v63, p62

    move/from16 v64, p63

    move-object/from16 v65, p64

    move/from16 v66, p65

    move/from16 v67, p66

    move/from16 v68, p67

    move/from16 v69, p68

    move/from16 v72, p71

    move/from16 v73, p72

    move/from16 v74, p73

    move/from16 v76, p75

    move/from16 v77, p76

    move/from16 v79, p78

    move/from16 v80, p79

    move/from16 v82, p81

    move/from16 v83, p82

    move/from16 v85, p84

    move/from16 v86, p85

    move/from16 v88, p87

    move/from16 v89, p88

    move/from16 v91, p90

    move/from16 v92, p91

    move/from16 v94, p93

    move/from16 v95, p94

    move/from16 v96, p95

    move/from16 v97, p96

    move/from16 v98, p97

    move/from16 v99, p98

    move/from16 v100, p99

    move/from16 v101, p100

    move/from16 v103, p102

    move/from16 v105, p104

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

    move/from16 v126, p125

    move/from16 v127, p126

    move/from16 v128, p127

    move/from16 v129, p128

    move/from16 v130, p129

    move/from16 v131, p130

    move/from16 v132, p131

    move/from16 v133, p132

    move/from16 v134, p133

    move/from16 v135, p134

    move/from16 v136, p135

    move/from16 v137, p136

    move/from16 v138, p137

    move/from16 v139, p138

    move/from16 v140, p139

    move/from16 v141, p140

    move/from16 v142, p141

    move/from16 v143, p142

    move/from16 v144, p143

    move/from16 v145, p144

    move/from16 v146, p145

    move/from16 v147, p146

    move-object/from16 v148, p147

    move/from16 v149, p148

    move-object/from16 v70, v2

    move-object/from16 v71, v3

    move-object/from16 v75, v4

    move-object/from16 v78, v5

    move-object/from16 v81, v6

    move-object/from16 v84, v7

    move-object/from16 v87, v8

    move-object/from16 v90, v9

    move-object/from16 v93, v10

    move-object/from16 v102, v11

    move-object/from16 v104, v12

    move-object/from16 v106, v13

    move-object/from16 v124, v14

    move-object/from16 v125, v15

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move/from16 v12, p11

    move/from16 v13, p12

    move/from16 v14, p13

    move/from16 v15, p14

    invoke-direct/range {v1 .. v149}, Lcom/szabh/smable3/entity/BleWorkout4;-><init>(IIIIIIIIIIIIIIIIIIIIIIIIFIIIIIIIIIIIIIFFFFFFFIIIIFIIIIIIIIIIFFI[IIIII[F[IFIILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IFFFFFIILjava/util/List;ILjava/util/List;ILjava/util/List;IIIIIIIIIIIIFFIIF[F[FIIIIIIIIIIIIIIIIIIIIFF[II)V

    return-object v1
.end method

.method public decode()V
    .locals 14

    const/4 v0, 0x0

    const/4 v1, 0x4

    const/4 v2, 0x2

    const/4 v3, 0x1

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mStart:I

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v4

    const/16 v5, 0x3e8

    div-int/2addr v4, v5

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mDuration:I

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt16(Ljava/nio/ByteOrder;)C

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSize:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildNumber:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMode:I

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt16(Ljava/nio/ByteOrder;)C

    move-result v4

    sget-object v6, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "workout4 type = "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    :cond_0
    sget-object v6, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v6}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt16(Ljava/nio/ByteOrder;)C

    move-result v6

    sget-object v7, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "workout4 len = "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v9}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    if-eqz v6, :cond_aa

    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_PAUSED_DURATION:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_1

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPausedDuration:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_1
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_BPM_CURRENT:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_2

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCurBpm:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_2
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_BPM_MIN:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_3

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMinBpm:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_3
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_BPM_MAX:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_4

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxBpm:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_4
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_BPM_COUNT:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_6

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCountBpm:I

    iget v6, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mTotalBpm:I

    if-eqz v6, :cond_5

    div-int/2addr v6, v4

    iput v6, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAvgBpm:I

    :cond_5
    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_6
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_BPM_TOTAL:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_8

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mTotalBpm:I

    iget v6, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCountBpm:I

    if-eqz v6, :cond_7

    div-int/2addr v4, v6

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAvgBpm:I

    :cond_7
    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_8
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_STEPS:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_9

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mStep:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_9
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_DISTANCE:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_a

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mDistance:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_a
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_CALORIE:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_b

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCalorie:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_b
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_ALTITUDE_CURRENT:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_c

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16(Ljava/nio/ByteOrder;)S

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAltitude:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_c
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_ALTITUDE_MIN:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_d

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16(Ljava/nio/ByteOrder;)S

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMinAltitude:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_d
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_ALTITUDE_MAX:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_e

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16(Ljava/nio/ByteOrder;)S

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxAltitude:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_e
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_ALTITUDE_ASCEND:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_f

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16(Ljava/nio/ByteOrder;)S

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAscendAltitude:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_f
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_ALTITUDE_DESCEND:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_10

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16(Ljava/nio/ByteOrder;)S

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mDescendAltitude:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_10
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_ALTITUDE_COUNT:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_11

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCountAltitude:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_11
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_ALTITUDE_TOTAL:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_12

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mTotalAltitude:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_12
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_AIR_PRESSURE:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_13

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16(Ljava/nio/ByteOrder;)S

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAirPressure:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_13
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_SPEED:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_14

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpeed:F

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_14
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_SATELLITE_COUNT:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_15

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCountSatellite:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_15
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_SPM_AVG:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_16

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt16(Ljava/nio/ByteOrder;)C

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpm:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_16
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_SPM_MAX:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_17

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt16(Ljava/nio/ByteOrder;)C

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxSpm:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_17
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_SPM_MIN:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_18

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt16(Ljava/nio/ByteOrder;)C

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMinSpm:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_18
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_PACE_AVG:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_19

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPace:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_19
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_PACE_FASTEST:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_1a

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMinPace:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_1a
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_PACE_SLOWEST:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_1b

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxPace:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_1b
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_STRESS_CURRENT:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_1c

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCurStress:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_1c
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_STRESS_MIN:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_1d

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMinStress:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_1d
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_STRESS_MAX:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_1e

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxStress:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_1e
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_STRESS_COUNT:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_20

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCountStress:I

    iget v6, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mTotalStress:I

    if-eqz v6, :cond_1f

    div-int/2addr v6, v4

    iput v6, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAvgStress:I

    :cond_1f
    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_20
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_STRESS_TOTAL:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_22

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mTotalStress:I

    iget v6, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCountStress:I

    if-eqz v6, :cond_21

    div-int/2addr v4, v6

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAvgStress:I

    :cond_21
    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_22
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_SPEED_MAX:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_23

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxSpeed:F

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_23
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_SPEED_MIN:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_24

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMinSpeed:F

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_24
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_SPEED_AVG:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_25

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAvgSpeed:F

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_25
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_STAMINA:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_26

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mStamina:F

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_26
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_TE_AEROBIC:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_27

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAerobic:F

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_27
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_TE_ANAEROBIC:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_28

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAnaerobic:F

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_28
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_TRAINING_LOAD:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_29

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt16(Ljava/nio/ByteOrder;)C

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mTrainingLoad:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_29
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_VO2MAX:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_2a

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16(Ljava/nio/ByteOrder;)S

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxVO2:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_2a
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_RECOVERY_TIME:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_2d

    if-eq v6, v2, :cond_2c

    if-eq v6, v1, :cond_2b

    invoke-virtual {p0, v6}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move v4, v0

    goto :goto_0

    :cond_2b
    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt32(Ljava/nio/ByteOrder;)J

    move-result-wide v6

    long-to-int v4, v6

    goto :goto_0

    :cond_2c
    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt16(Ljava/nio/ByteOrder;)C

    move-result v4

    :goto_0
    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mRecoveryTime:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_2d
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_GOMORE_SWIM_COUNT:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    const/4 v9, 0x0

    if-eq v4, v7, :cond_a9

    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_GOMORE_BADMINTON_COUNT:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-eq v4, v7, :cond_a9

    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_GOMORE_ROWING_COUNT:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-eq v4, v7, :cond_a9

    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_GOMORE_TENNIS_COUNT:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-eq v4, v7, :cond_a9

    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_GOMORE_TABLETENNIS_COUNT:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-eq v4, v7, :cond_a9

    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_GOMORE_BASEBALL_COUNT:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-eq v4, v7, :cond_a9

    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_GOMORE_CRICKET_COUNT:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-eq v4, v7, :cond_a9

    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_GOMORE_FOOTBALL_COUNT:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-eq v4, v7, :cond_a9

    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_GOMORE_JUMP_COUNT:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-eq v4, v7, :cond_a9

    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_GOMORE_BASKETBALL_SHOT_COUNTS:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-eq v4, v7, :cond_a9

    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_GOMORE_GOLF_COUNT:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-eq v4, v7, :cond_a9

    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->CD_WORKOUT_DATA_KEY_GOMORE_KICKBOXING_COUNT:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_2e

    goto/16 :goto_1a

    :cond_2e
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->CD_WORKOUT_DATA_KEY_GOMORE_SWIM_MAIN_STROKE:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_2f

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSwimType:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_2f
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_GOMORE_BADMINTON_CNT_FORE:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_30

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt16(Ljava/nio/ByteOrder;)C

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCntFore:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_30
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_GOMORE_BADMINTON_CNT_BACK:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_31

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt16(Ljava/nio/ByteOrder;)C

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCntBack:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_31
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_GOMORE_GOLF_BACKSWING:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_32

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt32(Ljava/nio/ByteOrder;)J

    move-result-wide v6

    long-to-int v4, v6

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mBackSwingTime:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_32
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_GOMORE_GOLF_DOWNSWING:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_33

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt32(Ljava/nio/ByteOrder;)J

    move-result-wide v6

    long-to-int v4, v6

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mDownSwingTime:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_33
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_GOMORE_GOLF_CADENCE:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-eq v4, v7, :cond_a8

    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_GOMORE_ELLIPTICAL_CADENCE:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-eq v4, v7, :cond_a8

    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_GOMORE_ROWING_CADENCE:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_34

    goto/16 :goto_19

    :cond_34
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_GOMORE_ROWING_CADENCE_MAX:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-eq v4, v7, :cond_a7

    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_GOMORE_ELLIPTICAL_CADENCE_MAX:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_35

    goto/16 :goto_18

    :cond_35
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_GOMORE_BASKETBALL_DRIBBLE_TIME:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_36

    invoke-static {p0, v6, v0, v2, v9}, Lcom/szabh/smable3/entity/BleWorkout4;->readDynamicIntData$default(Lcom/szabh/smable3/entity/BleWorkout4;IZILjava/lang/Object;)I

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mDribbleTime:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_36
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_GOMORE_JUMP_TRIP_COUNT:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-eq v4, v7, :cond_a6

    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_STROKE_CNT:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_37

    goto/16 :goto_17

    :cond_37
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_GOMORE_JUMP_SESSION_COUNT:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_38

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt16(Ljava/nio/ByteOrder;)C

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSessionCount:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_38
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_GOMORE_RUN_STA_BALANCE:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_39

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt16(Ljava/nio/ByteOrder;)C

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mStaBalance:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_39
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->CD_WORKOUT_DATA_KEY_GO_MORE_RUN_AVG_STEP_LEN:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_3a

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mStepLen:F

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_3a
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_GOMORE_RUN_VERTICAL_OSCILLATION:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_3b

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mVerticalOscillation:F

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_3b
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_GOMORE_RUN_RUN_POWER_WATT:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_3c

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt16(Ljava/nio/ByteOrder;)C

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mRunPowerWatt:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_3c
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->CD_WORKOUT_DATA_KEY_BPM_ZONE_COUNT:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    const/4 v10, 0x5

    if-ne v4, v7, :cond_3e

    move v4, v0

    :goto_1
    if-ge v4, v10, :cond_3d

    iget-object v6, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mBpmZoneCount:[I

    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v7}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt16(Ljava/nio/ByteOrder;)C

    move-result v7

    aput v7, v6, v4

    add-int/2addr v4, v3

    goto :goto_1

    :cond_3d
    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_3e
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_LACTATE_THRESHOLD_HR:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_3f

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mLactateThresholdHr:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_3f
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_LACTATE_PACE:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_40

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mLactateThresholdPace:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_40
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_TRAINING_STATUS:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_41

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mTrainingStatus:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_41
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_FITNESS_AGE:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_42

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mFitnessAge:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_42
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_LEVEL_OUT:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    const/16 v11, 0x9

    if-ne v4, v7, :cond_44

    move v4, v0

    :goto_2
    if-ge v4, v11, :cond_43

    iget-object v6, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mFitnessLevel:[F

    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v7}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v7

    aput v7, v6, v4

    add-int/2addr v4, v3

    goto :goto_2

    :cond_43
    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_44
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_PATH_POINTS:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_47

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    div-int/lit8 v6, v6, 0x8

    move v7, v0

    :goto_3
    if-ge v7, v6, :cond_45

    sget-object v9, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v9}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v9

    sget-object v10, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v10}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v10

    new-array v11, v2, [F

    aput v9, v11, v0

    aput v10, v11, v3

    invoke-interface {v4, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/2addr v7, v3

    goto :goto_3

    :cond_45
    iget v6, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPathCount:I

    if-eqz v6, :cond_46

    invoke-static {v4, v6}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IO0OOi(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v4

    :cond_46
    iput-object v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPathPoints:Ljava/util/List;

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_47
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_PATH_POINTS_INFO:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_49

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPathCount:I

    iget-object v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPathPoints:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    iget v6, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPathCount:I

    if-le v4, v6, :cond_48

    iget-object v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPathPoints:Ljava/util/List;

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v4, v6}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IO0OOi(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v4

    iput-object v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPathPoints:Ljava/util/List;

    :cond_48
    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPathSampleInterval:I

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    goto/16 :goto_1b

    :cond_49
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_HR_PATH_POINTS:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_4c

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    move v7, v0

    :goto_4
    if-ge v7, v6, :cond_4a

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v4, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/2addr v7, v3

    goto :goto_4

    :cond_4a
    iget v6, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mHrPathCount:I

    if-eqz v6, :cond_4b

    invoke-static {v4, v6}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IO0OOi(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v4

    :cond_4b
    iput-object v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mHrPathPoints:Ljava/util/List;

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_4c
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_HR_PATH_POINTS_INFO:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_4e

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mHrPathCount:I

    iget-object v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mHrPathPoints:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    iget v6, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mHrPathCount:I

    if-le v4, v6, :cond_4d

    iget-object v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mHrPathPoints:Ljava/util/List;

    check-cast v4, Ljava/lang/Iterable;

    iget v6, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPathCount:I

    invoke-static {v4, v6}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IO0OOi(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v4

    iput-object v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mHrPathPoints:Ljava/util/List;

    :cond_4d
    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mHrPathSampleInterval:I

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    goto/16 :goto_1b

    :cond_4e
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_PACE_PATH_POINTS:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_51

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    div-int/2addr v6, v1

    move v7, v0

    :goto_5
    if-ge v7, v6, :cond_4f

    sget-object v9, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v9}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v4, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/2addr v7, v3

    goto :goto_5

    :cond_4f
    iget v6, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPacePathCount:I

    if-eqz v6, :cond_50

    invoke-static {v4, v6}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IO0OOi(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v4

    :cond_50
    iput-object v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPacePathPoints:Ljava/util/List;

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_51
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_PACE_PATH_POINTS_INFO:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_53

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPacePathCount:I

    iget-object v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPacePathPoints:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    iget v6, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPacePathCount:I

    if-le v4, v6, :cond_52

    iget-object v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPacePathPoints:Ljava/util/List;

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v4, v6}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IO0OOi(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v4

    iput-object v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPacePathPoints:Ljava/util/List;

    :cond_52
    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPacePathSampleInterval:I

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    goto/16 :goto_1b

    :cond_53
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_SPEED_PATH_POINTS:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_56

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    div-int/2addr v6, v1

    move v7, v0

    :goto_6
    if-ge v7, v6, :cond_54

    sget-object v9, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v9}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v9

    float-to-int v9, v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v4, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/2addr v7, v3

    goto :goto_6

    :cond_54
    iget v6, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpeedPathCount:I

    if-eqz v6, :cond_55

    invoke-static {v4, v6}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IO0OOi(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v4

    :cond_55
    iput-object v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpeedPathPoints:Ljava/util/List;

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_56
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_SPEED_PATH_POINTS_INFO:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_58

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpeedPathCount:I

    iget-object v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpeedPathPoints:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    iget v6, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpeedPathCount:I

    if-le v4, v6, :cond_57

    iget-object v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpeedPathPoints:Ljava/util/List;

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v4, v6}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IO0OOi(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v4

    iput-object v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpeedPathPoints:Ljava/util/List;

    :cond_57
    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpeedPathSampleInterval:I

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    goto/16 :goto_1b

    :cond_58
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_POWER_PATH_POINTS:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_5e

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    div-int/2addr v6, v2

    move v7, v0

    :goto_7
    if-ge v7, v6, :cond_59

    sget-object v9, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v9}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16(Ljava/nio/ByteOrder;)S

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v4, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/2addr v7, v3

    goto :goto_7

    :cond_59
    iget v6, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPowerCount:I

    if-eqz v6, :cond_5a

    invoke-static {v4, v6}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IO0OOi(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v4

    :cond_5a
    iput-object v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPowerPoints:Ljava/util/List;

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_5d

    iget-object v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPowerPoints:Ljava/util/List;

    check-cast v4, Ljava/util/Collection;

    invoke-static {v4}, Lkotlin/collections/CollectionsKt___CollectionsKt;->OO0Oi10(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v6, v0

    :goto_8
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_5c

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    const/4 v9, -0x1

    if-eq v7, v9, :cond_5b

    goto :goto_9

    :cond_5b
    move v7, v0

    :goto_9
    add-int/2addr v6, v7

    goto :goto_8

    :cond_5c
    iget-object v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPowerPoints:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    div-int/2addr v6, v4

    int-to-float v4, v6

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mRunLactateAvg:F

    :cond_5d
    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_5e
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_POWER_PATH_POINTS_INFO:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_60

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPowerCount:I

    iget-object v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPowerPoints:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    iget v6, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPowerCount:I

    if-le v4, v6, :cond_5f

    iget-object v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPowerPoints:Ljava/util/List;

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v4, v6}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IO0OOi(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v4

    iput-object v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPowerPoints:Ljava/util/List;

    :cond_5f
    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPowerInterval:I

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    goto/16 :goto_1b

    :cond_60
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->CD_WORKOUT_DATA_KEY_SPM_PATH_POINTS:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_63

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    div-int/2addr v6, v2

    move v7, v0

    :goto_a
    if-ge v7, v6, :cond_61

    sget-object v9, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v9}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16(Ljava/nio/ByteOrder;)S

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v4, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/2addr v7, v3

    goto :goto_a

    :cond_61
    iget v6, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpmPathPointsCount:I

    if-eqz v6, :cond_62

    invoke-static {v4, v6}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IO0OOi(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v4

    :cond_62
    iput-object v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpmPathPointsPoints:Ljava/util/List;

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_63
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->CD_WORKOUT_DATA_KEY_SPM_PATH_POINTS_INFO:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_65

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpmPathPointsCount:I

    iget-object v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpmPathPointsPoints:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    iget v6, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpmPathPointsCount:I

    if-le v4, v6, :cond_64

    iget-object v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpmPathPointsPoints:Ljava/util/List;

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v4, v6}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IO0OOi(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v4

    iput-object v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpmPathPointsPoints:Ljava/util/List;

    :cond_64
    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    goto/16 :goto_1b

    :cond_65
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->CD_WORKOUT_DATA_KEY_STEP_LEN_PATH_POINTS:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_68

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    div-int/2addr v6, v1

    move v7, v0

    :goto_b
    if-ge v7, v6, :cond_66

    sget-object v9, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v9}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v9

    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    invoke-interface {v4, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/2addr v7, v3

    goto :goto_b

    :cond_66
    iget v6, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mStepLenCount:I

    if-eqz v6, :cond_67

    invoke-static {v4, v6}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IO0OOi(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v4

    :cond_67
    iput-object v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mStepLenPoints:Ljava/util/List;

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_68
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->CD_WORKOUT_DATA_KEY_STEP_LEN_POINTS_INFO:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_6a

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mStepLenCount:I

    iget-object v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mStepLenPoints:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    iget v6, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mStepLenCount:I

    if-le v4, v6, :cond_69

    iget-object v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mStepLenPoints:Ljava/util/List;

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v4, v6}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IO0OOi(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v4

    iput-object v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mStepLenPoints:Ljava/util/List;

    :cond_69
    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    goto/16 :goto_1b

    :cond_6a
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_ALTITUDE_PATH_POINTS:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_6d

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    div-int/2addr v6, v2

    move v7, v0

    :goto_c
    if-ge v7, v6, :cond_6b

    sget-object v9, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v9}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16(Ljava/nio/ByteOrder;)S

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v4, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/2addr v7, v3

    goto :goto_c

    :cond_6b
    iget v6, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAltitudePathCount:I

    if-eqz v6, :cond_6c

    invoke-static {v4, v6}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IO0OOi(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v4

    :cond_6c
    iput-object v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAltitudePathPoints:Ljava/util/List;

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_6d
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_ALTITUDE_PATH_POINTS_INFO:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_6f

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAltitudePathCount:I

    iget-object v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAltitudePathPoints:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    iget v6, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAltitudePathCount:I

    if-le v4, v6, :cond_6e

    iget-object v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAltitudePathPoints:Ljava/util/List;

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v4, v6}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IO0OOi(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v4

    iput-object v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAltitudePathPoints:Ljava/util/List;

    :cond_6e
    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAltitudePathSampleInterval:I

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    goto/16 :goto_1b

    :cond_6f
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->CD_WORKOUT_DATA_KEY_RECOVERY_HR_POINTS:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_71

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    move v7, v0

    :goto_d
    if-ge v7, v6, :cond_70

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v4, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/2addr v7, v3

    goto :goto_d

    :cond_70
    iput-object v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mRecoveryHrPoints:Ljava/util/List;

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_71
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->CD_WORKOUT_DATA_KEY_RECOVERY_HR_POINTS_INFO:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_72

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mRecoveryHrCount:I

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mRecoveryHrSampleInterval:I

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    goto/16 :goto_1b

    :cond_72
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->CD_WORKOUT_DATA_KEY_POOL_LENGTH:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_73

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSwimPoolLength:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_73
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->CD_WORKOUT_DATA_KEY_PERSONAL_ZONE_1:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    const/4 v12, 0x7

    if-ne v4, v7, :cond_75

    move v4, v0

    :goto_e
    if-ge v4, v12, :cond_74

    invoke-static {p0, v2, v0, v2, v9}, Lcom/szabh/smable3/entity/BleWorkout4;->readDynamicIntData$default(Lcom/szabh/smable3/entity/BleWorkout4;IZILjava/lang/Object;)I

    move-result v6

    iget-object v7, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPersonalZone:[I

    aput v6, v7, v4

    add-int/2addr v4, v3

    goto :goto_e

    :cond_74
    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_75
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_BEST_RUN_TIME:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_78

    move v4, v0

    :goto_f
    if-ge v4, v10, :cond_77

    sget-object v6, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v6}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt16(Ljava/nio/ByteOrder;)C

    move-result v6

    const v7, 0xffff

    if-ne v6, v7, :cond_76

    move v6, v0

    :cond_76
    iget-object v7, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mBestRunTime:[I

    aput v6, v7, v4

    add-int/2addr v4, v3

    goto :goto_f

    :cond_77
    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_78
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_TL_TREND:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_79

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mTlTrend:F

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_79
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_AEROBIC:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_7a

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->realTimeAerobic:F

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_7a
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_ANAEROBIC:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_7b

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->realTimeAnaerobic:F

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_7b
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_KCAL_OUT:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_7c

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCalorieTotal:F

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_7c
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_FAT_OUT:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_7d

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mFatTotal:F

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_7d
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_CARBO_OUT:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_7e

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCarboTotal:F

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_7e
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->CD_WORKOUT_DATA_KEY_TOTAL_TARGET_TIME:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_7f

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorTargetTime:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_7f
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->CD_WORKOUT_DATA_KEY_TOTAL_ACTUAL_TIME:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_80

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorActualTime:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_80
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->CD_WORKOUT_DATA_KEY_TIME_DIFFERENCE:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_81

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorDifferenceTime:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_81
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->CD_WORKOUT_DATA_KEY_TIME_STATUS:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_82

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorStatusTime:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_82
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->CD_WORKOUT_DATA_KEY_TARGET_DISTANCE:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_83

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorTargetDistance:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_83
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->CD_WORKOUT_DATA_KEY_ACTUAL_DISTANCE:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_84

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorActualDistance:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_84
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->CD_WORKOUT_DATA_KEY_DISTANCE_DIFFERENCE:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_85

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorDifferenceDistance:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_85
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->CD_WORKOUT_DATA_KEY_DISTANCE_STATUS:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_86

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorStatusDistance:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_86
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->CD_WORKOUT_DATA_KEY_TARGET_PACE:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_87

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorTargetPace:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_87
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->CD_WORKOUT_DATA_KEY_ACTUAL_PACE:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_88

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorActualPace:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_88
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->CD_WORKOUT_DATA_KEY_PACE_DIFFERENCE:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_89

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorDifferencePace:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_89
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->CD_WORKOUT_DATA_KEY_PACE_STATUS:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_8a

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorStatusPace:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_8a
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->CD_WORKOUT_DATA_KEY_TARGET_SPEED:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_8b

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorTargetSpeed:F

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_8b
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->CD_WORKOUT_DATA_KEY_ACTUAL_SPEED:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_8c

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorActualSpeed:F

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_8c
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->CD_WORKOUT_DATA_KEY_SPEED_DIFFERENCE:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_8d

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorDifferenceSpeed:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_8d
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->CD_WORKOUT_DATA_KEY_SPEED_STATUS:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_8e

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorStatusSpeed:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_8e
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->CD_WORKOUT_DATA_KEY_WEEK_TREND:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_90

    move v4, v0

    :goto_10
    if-ge v4, v12, :cond_8f

    iget-object v6, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mTrendWeek:[F

    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v7}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v7

    aput v7, v6, v4

    add-int/2addr v4, v3

    goto :goto_10

    :cond_8f
    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_90
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_CYCLING_INDEX_FTP:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_95

    move v4, v0

    :goto_11
    if-ge v4, v2, :cond_91

    iget-object v6, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCyclingIndex:[F

    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v7}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v7

    aput v7, v6, v4

    add-int/2addr v4, v3

    goto :goto_11

    :cond_91
    iget-object v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCyclingIndex:[F

    array-length v6, v4

    if-nez v6, :cond_92

    move v6, v3

    goto :goto_12

    :cond_92
    move v6, v0

    :goto_12
    if-nez v6, :cond_94

    aget v4, v4, v0

    const/high16 v6, -0x40800000    # -1.0f

    cmpg-float v6, v4, v6

    if-nez v6, :cond_93

    goto :goto_13

    :cond_93
    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCyclingLactateAvg:F

    :cond_94
    :goto_13
    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_95
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_CNT_LAP:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_96

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCntLap:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_96
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_FRONTCRAWL_PERC:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_97

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mFrontCrawlPerc:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_97
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_BREASTSTROKE_PERC:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_98

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mBreaststrokePerc:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_98
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_BACKSTROKE_PERC:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_99

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mBackstrokePerc:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_99
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_BUTTERFLY_PERC:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_9a

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mButterflyPerc:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_9a
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_METS_OUT_STATIC:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_9d

    new-array v4, v10, [F

    move v6, v0

    :goto_14
    if-ge v6, v10, :cond_9b

    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v7}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v7

    aput v7, v4, v6

    add-int/2addr v6, v3

    goto :goto_14

    :cond_9b
    const/4 v6, 0x0

    iput v6, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMetTotal:F

    move v6, v0

    :goto_15
    if-ge v6, v10, :cond_9c

    aget v7, v4, v6

    iget v9, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMetTotal:F

    add-float/2addr v9, v7

    iput v9, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMetTotal:F

    add-int/2addr v6, v3

    goto :goto_15

    :cond_9c
    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_9d
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_SWOLF:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_9e

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16(Ljava/nio/ByteOrder;)S

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSwimSwolf:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_9e
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->CD_WORKOUT_DATA_KEY_GOMORE_ELLIPTICAL_STEPS:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_9f

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mEllipticalSteps:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto/16 :goto_1b

    :cond_9f
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_SUB_WORKOUT_HEADER:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_a3

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v4

    sget-object v6, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v6}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v6

    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v7}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v7}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v7

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v9

    sget-object v10, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "workout4 \u5b50\u9879\u76ee mode = "

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v13, " , startTime = "

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v13, " , duration = "

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v13, ", distance = "

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v10, v12}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    if-eq v9, v11, :cond_a2

    const/16 v10, 0xa

    if-eq v9, v10, :cond_a1

    const/16 v10, 0xa3

    if-eq v9, v10, :cond_a0

    goto :goto_16

    :cond_a0
    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildSwimStartTime:I

    iput v6, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildSwimDuration:I

    iput v7, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildSwimDistance:I

    iput v9, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildSwimMode:I

    goto :goto_16

    :cond_a1
    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildCyclingStartTime:I

    iput v6, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildCyclingDuration:I

    iput v7, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildCyclingDistance:I

    iput v9, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildCyclingMode:I

    goto :goto_16

    :cond_a2
    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildRunStartTime:I

    iput v6, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildRunDuration:I

    iput v7, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildRunDistance:I

    iput v9, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildRunMode:I

    :goto_16
    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16(Ljava/nio/ByteOrder;)S

    goto/16 :goto_1b

    :cond_a3
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->WORKOUT_DATA_KEY_FLAG:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_a4

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mWorkoutFlag:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto :goto_1b

    :cond_a4
    sget-object v7, Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;->CD_WORKOUT_DATA_KEY_AI_COACH_SPORT_ID:Lcom/szabh/smable3/entity/BleWorkout4$Companion$DataType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-ne v4, v7, :cond_a5

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAICoachSportID:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto :goto_1b

    :cond_a5
    invoke-virtual {p0, v6}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto :goto_1b

    :cond_a6
    :goto_17
    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt16(Ljava/nio/ByteOrder;)C

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mTripCount:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto :goto_1b

    :cond_a7
    :goto_18
    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v4

    int-to-float v6, v5

    mul-float/2addr v4, v6

    float-to-int v4, v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxCadence:I

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto :goto_1b

    :cond_a8
    :goto_19
    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCadence:F

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto :goto_1b

    :cond_a9
    :goto_1a
    invoke-static {p0, v6, v0, v2, v9}, Lcom/szabh/smable3/entity/BleWorkout4;->readDynamicIntData$default(Lcom/szabh/smable3/entity/BleWorkout4;IZILjava/lang/Object;)I

    move-result v6

    iput v6, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCnt:I

    sget-object v6, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "workout4  type = "

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " , mCnt = "

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCnt:I

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6, v4}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    :cond_aa
    :goto_1b
    sget-object v4, Lcom/szabh/smable3/entity/BleWorkout4;->mByteOrder:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt16(Ljava/nio/ByteOrder;)C

    move-result v4

    sget-object v6, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    if-gtz v4, :cond_0

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mStart:I

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mDuration:I

    add-int/2addr v0, v1

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPausedDuration:I

    div-int/2addr v1, v5

    add-int/2addr v0, v1

    iput v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mEnd:I

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleWorkout4;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleWorkout4;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mStart:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mStart:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mEnd:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mEnd:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSize:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mSize:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildNumber:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mChildNumber:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMode:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mMode:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mDuration:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mDuration:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPausedDuration:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mPausedDuration:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCurBpm:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mCurBpm:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAvgBpm:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mAvgBpm:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxBpm:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxBpm:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMinBpm:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mMinBpm:I

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCountBpm:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mCountBpm:I

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mTotalBpm:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mTotalBpm:I

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mStep:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mStep:I

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mDistance:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mDistance:I

    if-eq v1, v3, :cond_10

    return v2

    :cond_10
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCalorie:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mCalorie:I

    if-eq v1, v3, :cond_11

    return v2

    :cond_11
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAltitude:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mAltitude:I

    if-eq v1, v3, :cond_12

    return v2

    :cond_12
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxAltitude:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxAltitude:I

    if-eq v1, v3, :cond_13

    return v2

    :cond_13
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMinAltitude:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mMinAltitude:I

    if-eq v1, v3, :cond_14

    return v2

    :cond_14
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAscendAltitude:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mAscendAltitude:I

    if-eq v1, v3, :cond_15

    return v2

    :cond_15
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mDescendAltitude:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mDescendAltitude:I

    if-eq v1, v3, :cond_16

    return v2

    :cond_16
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCountAltitude:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mCountAltitude:I

    if-eq v1, v3, :cond_17

    return v2

    :cond_17
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mTotalAltitude:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mTotalAltitude:I

    if-eq v1, v3, :cond_18

    return v2

    :cond_18
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAirPressure:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mAirPressure:I

    if-eq v1, v3, :cond_19

    return v2

    :cond_19
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpeed:F

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mSpeed:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_1a

    return v2

    :cond_1a
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCountSatellite:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mCountSatellite:I

    if-eq v1, v3, :cond_1b

    return v2

    :cond_1b
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpm:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mSpm:I

    if-eq v1, v3, :cond_1c

    return v2

    :cond_1c
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxSpm:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxSpm:I

    if-eq v1, v3, :cond_1d

    return v2

    :cond_1d
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMinSpm:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mMinSpm:I

    if-eq v1, v3, :cond_1e

    return v2

    :cond_1e
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPace:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mPace:I

    if-eq v1, v3, :cond_1f

    return v2

    :cond_1f
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxPace:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxPace:I

    if-eq v1, v3, :cond_20

    return v2

    :cond_20
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMinPace:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mMinPace:I

    if-eq v1, v3, :cond_21

    return v2

    :cond_21
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCurStress:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mCurStress:I

    if-eq v1, v3, :cond_22

    return v2

    :cond_22
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAvgStress:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mAvgStress:I

    if-eq v1, v3, :cond_23

    return v2

    :cond_23
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMinStress:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mMinStress:I

    if-eq v1, v3, :cond_24

    return v2

    :cond_24
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxStress:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxStress:I

    if-eq v1, v3, :cond_25

    return v2

    :cond_25
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCountStress:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mCountStress:I

    if-eq v1, v3, :cond_26

    return v2

    :cond_26
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mTotalStress:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mTotalStress:I

    if-eq v1, v3, :cond_27

    return v2

    :cond_27
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxSpeed:F

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxSpeed:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_28

    return v2

    :cond_28
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMinSpeed:F

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mMinSpeed:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_29

    return v2

    :cond_29
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAvgSpeed:F

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mAvgSpeed:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_2a

    return v2

    :cond_2a
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mStamina:F

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mStamina:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_2b

    return v2

    :cond_2b
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAerobic:F

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mAerobic:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_2c

    return v2

    :cond_2c
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAnaerobic:F

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mAnaerobic:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_2d

    return v2

    :cond_2d
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMetTotal:F

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mMetTotal:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_2e

    return v2

    :cond_2e
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mRecoveryTime:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mRecoveryTime:I

    if-eq v1, v3, :cond_2f

    return v2

    :cond_2f
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mTrainingLoad:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mTrainingLoad:I

    if-eq v1, v3, :cond_30

    return v2

    :cond_30
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxVO2:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxVO2:I

    if-eq v1, v3, :cond_31

    return v2

    :cond_31
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCnt:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mCnt:I

    if-eq v1, v3, :cond_32

    return v2

    :cond_32
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCadence:F

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mCadence:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_33

    return v2

    :cond_33
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxCadence:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxCadence:I

    if-eq v1, v3, :cond_34

    return v2

    :cond_34
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSwimType:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mSwimType:I

    if-eq v1, v3, :cond_35

    return v2

    :cond_35
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCntFore:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mCntFore:I

    if-eq v1, v3, :cond_36

    return v2

    :cond_36
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCntBack:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mCntBack:I

    if-eq v1, v3, :cond_37

    return v2

    :cond_37
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mBackSwingTime:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mBackSwingTime:I

    if-eq v1, v3, :cond_38

    return v2

    :cond_38
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mDownSwingTime:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mDownSwingTime:I

    if-eq v1, v3, :cond_39

    return v2

    :cond_39
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mDribbleTime:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mDribbleTime:I

    if-eq v1, v3, :cond_3a

    return v2

    :cond_3a
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mTripCount:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mTripCount:I

    if-eq v1, v3, :cond_3b

    return v2

    :cond_3b
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSessionCount:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mSessionCount:I

    if-eq v1, v3, :cond_3c

    return v2

    :cond_3c
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mStaBalance:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mStaBalance:I

    if-eq v1, v3, :cond_3d

    return v2

    :cond_3d
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mStepLen:F

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mStepLen:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3e

    return v2

    :cond_3e
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mVerticalOscillation:F

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mVerticalOscillation:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3f

    return v2

    :cond_3f
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mRunPowerWatt:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mRunPowerWatt:I

    if-eq v1, v3, :cond_40

    return v2

    :cond_40
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mBpmZoneCount:[I

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mBpmZoneCount:[I

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_41

    return v2

    :cond_41
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mLactateThresholdHr:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mLactateThresholdHr:I

    if-eq v1, v3, :cond_42

    return v2

    :cond_42
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mLactateThresholdPace:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mLactateThresholdPace:I

    if-eq v1, v3, :cond_43

    return v2

    :cond_43
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mTrainingStatus:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mTrainingStatus:I

    if-eq v1, v3, :cond_44

    return v2

    :cond_44
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mFitnessAge:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mFitnessAge:I

    if-eq v1, v3, :cond_45

    return v2

    :cond_45
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mFitnessLevel:[F

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mFitnessLevel:[F

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_46

    return v2

    :cond_46
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mBestRunTime:[I

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mBestRunTime:[I

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_47

    return v2

    :cond_47
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mTlTrend:F

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mTlTrend:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_48

    return v2

    :cond_48
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPathCount:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mPathCount:I

    if-eq v1, v3, :cond_49

    return v2

    :cond_49
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPathSampleInterval:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mPathSampleInterval:I

    if-eq v1, v3, :cond_4a

    return v2

    :cond_4a
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPathPoints:Ljava/util/List;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mPathPoints:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4b

    return v2

    :cond_4b
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mHrPathCount:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mHrPathCount:I

    if-eq v1, v3, :cond_4c

    return v2

    :cond_4c
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mHrPathSampleInterval:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mHrPathSampleInterval:I

    if-eq v1, v3, :cond_4d

    return v2

    :cond_4d
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mHrPathPoints:Ljava/util/List;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mHrPathPoints:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4e

    return v2

    :cond_4e
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPacePathCount:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mPacePathCount:I

    if-eq v1, v3, :cond_4f

    return v2

    :cond_4f
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPacePathSampleInterval:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mPacePathSampleInterval:I

    if-eq v1, v3, :cond_50

    return v2

    :cond_50
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPacePathPoints:Ljava/util/List;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mPacePathPoints:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_51

    return v2

    :cond_51
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpeedPathCount:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mSpeedPathCount:I

    if-eq v1, v3, :cond_52

    return v2

    :cond_52
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpeedPathSampleInterval:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mSpeedPathSampleInterval:I

    if-eq v1, v3, :cond_53

    return v2

    :cond_53
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpeedPathPoints:Ljava/util/List;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mSpeedPathPoints:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_54

    return v2

    :cond_54
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCadencePathCount:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mCadencePathCount:I

    if-eq v1, v3, :cond_55

    return v2

    :cond_55
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCadencePathSampleInterval:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mCadencePathSampleInterval:I

    if-eq v1, v3, :cond_56

    return v2

    :cond_56
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCadencePathPoints:Ljava/util/List;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mCadencePathPoints:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_57

    return v2

    :cond_57
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAltitudePathCount:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mAltitudePathCount:I

    if-eq v1, v3, :cond_58

    return v2

    :cond_58
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAltitudePathSampleInterval:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mAltitudePathSampleInterval:I

    if-eq v1, v3, :cond_59

    return v2

    :cond_59
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAltitudePathPoints:Ljava/util/List;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mAltitudePathPoints:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5a

    return v2

    :cond_5a
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mRecoveryHrCount:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mRecoveryHrCount:I

    if-eq v1, v3, :cond_5b

    return v2

    :cond_5b
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mRecoveryHrSampleInterval:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mRecoveryHrSampleInterval:I

    if-eq v1, v3, :cond_5c

    return v2

    :cond_5c
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mRecoveryHrPoints:Ljava/util/List;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mRecoveryHrPoints:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5d

    return v2

    :cond_5d
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSwimPoolLength:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mSwimPoolLength:I

    if-eq v1, v3, :cond_5e

    return v2

    :cond_5e
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->realTimeAerobic:F

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->realTimeAerobic:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_5f

    return v2

    :cond_5f
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->realTimeAnaerobic:F

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->realTimeAnaerobic:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_60

    return v2

    :cond_60
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCalorieTotal:F

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mCalorieTotal:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_61

    return v2

    :cond_61
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mFatTotal:F

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mFatTotal:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_62

    return v2

    :cond_62
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCarboTotal:F

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mCarboTotal:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_63

    return v2

    :cond_63
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPowerCount:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mPowerCount:I

    if-eq v1, v3, :cond_64

    return v2

    :cond_64
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPowerInterval:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mPowerInterval:I

    if-eq v1, v3, :cond_65

    return v2

    :cond_65
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPowerPoints:Ljava/util/List;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mPowerPoints:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_66

    return v2

    :cond_66
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpmPathPointsCount:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mSpmPathPointsCount:I

    if-eq v1, v3, :cond_67

    return v2

    :cond_67
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpmPathPointsPoints:Ljava/util/List;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mSpmPathPointsPoints:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_68

    return v2

    :cond_68
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mStepLenCount:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mStepLenCount:I

    if-eq v1, v3, :cond_69

    return v2

    :cond_69
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mStepLenPoints:Ljava/util/List;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mStepLenPoints:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6a

    return v2

    :cond_6a
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorTargetTime:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorTargetTime:I

    if-eq v1, v3, :cond_6b

    return v2

    :cond_6b
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorActualTime:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorActualTime:I

    if-eq v1, v3, :cond_6c

    return v2

    :cond_6c
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorDifferenceTime:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorDifferenceTime:I

    if-eq v1, v3, :cond_6d

    return v2

    :cond_6d
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorStatusTime:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorStatusTime:I

    if-eq v1, v3, :cond_6e

    return v2

    :cond_6e
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorTargetDistance:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorTargetDistance:I

    if-eq v1, v3, :cond_6f

    return v2

    :cond_6f
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorActualDistance:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorActualDistance:I

    if-eq v1, v3, :cond_70

    return v2

    :cond_70
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorDifferenceDistance:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorDifferenceDistance:I

    if-eq v1, v3, :cond_71

    return v2

    :cond_71
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorStatusDistance:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorStatusDistance:I

    if-eq v1, v3, :cond_72

    return v2

    :cond_72
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorTargetPace:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorTargetPace:I

    if-eq v1, v3, :cond_73

    return v2

    :cond_73
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorActualPace:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorActualPace:I

    if-eq v1, v3, :cond_74

    return v2

    :cond_74
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorDifferencePace:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorDifferencePace:I

    if-eq v1, v3, :cond_75

    return v2

    :cond_75
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorStatusPace:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorStatusPace:I

    if-eq v1, v3, :cond_76

    return v2

    :cond_76
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorTargetSpeed:F

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorTargetSpeed:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_77

    return v2

    :cond_77
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorActualSpeed:F

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorActualSpeed:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_78

    return v2

    :cond_78
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorDifferenceSpeed:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorDifferenceSpeed:I

    if-eq v1, v3, :cond_79

    return v2

    :cond_79
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorStatusSpeed:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorStatusSpeed:I

    if-eq v1, v3, :cond_7a

    return v2

    :cond_7a
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxOxygenPower:F

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxOxygenPower:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_7b

    return v2

    :cond_7b
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mTrendWeek:[F

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mTrendWeek:[F

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7c

    return v2

    :cond_7c
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCyclingIndex:[F

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mCyclingIndex:[F

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7d

    return v2

    :cond_7d
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSwimSwolf:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mSwimSwolf:I

    if-eq v1, v3, :cond_7e

    return v2

    :cond_7e
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCntLap:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mCntLap:I

    if-eq v1, v3, :cond_7f

    return v2

    :cond_7f
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mFrontCrawlPerc:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mFrontCrawlPerc:I

    if-eq v1, v3, :cond_80

    return v2

    :cond_80
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mBreaststrokePerc:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mBreaststrokePerc:I

    if-eq v1, v3, :cond_81

    return v2

    :cond_81
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mBackstrokePerc:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mBackstrokePerc:I

    if-eq v1, v3, :cond_82

    return v2

    :cond_82
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mButterflyPerc:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mButterflyPerc:I

    if-eq v1, v3, :cond_83

    return v2

    :cond_83
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mEllipticalSteps:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mEllipticalSteps:I

    if-eq v1, v3, :cond_84

    return v2

    :cond_84
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mWorkoutFlag:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mWorkoutFlag:I

    if-eq v1, v3, :cond_85

    return v2

    :cond_85
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildSwimStartTime:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mChildSwimStartTime:I

    if-eq v1, v3, :cond_86

    return v2

    :cond_86
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildSwimDuration:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mChildSwimDuration:I

    if-eq v1, v3, :cond_87

    return v2

    :cond_87
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildSwimDistance:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mChildSwimDistance:I

    if-eq v1, v3, :cond_88

    return v2

    :cond_88
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildCyclingStartTime:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mChildCyclingStartTime:I

    if-eq v1, v3, :cond_89

    return v2

    :cond_89
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildCyclingDuration:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mChildCyclingDuration:I

    if-eq v1, v3, :cond_8a

    return v2

    :cond_8a
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildCyclingDistance:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mChildCyclingDistance:I

    if-eq v1, v3, :cond_8b

    return v2

    :cond_8b
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildRunStartTime:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mChildRunStartTime:I

    if-eq v1, v3, :cond_8c

    return v2

    :cond_8c
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildRunDuration:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mChildRunDuration:I

    if-eq v1, v3, :cond_8d

    return v2

    :cond_8d
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildRunDistance:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mChildRunDistance:I

    if-eq v1, v3, :cond_8e

    return v2

    :cond_8e
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildSwimMode:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mChildSwimMode:I

    if-eq v1, v3, :cond_8f

    return v2

    :cond_8f
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildCyclingMode:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mChildCyclingMode:I

    if-eq v1, v3, :cond_90

    return v2

    :cond_90
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildRunMode:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mChildRunMode:I

    if-eq v1, v3, :cond_91

    return v2

    :cond_91
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mRunLactateAvg:F

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mRunLactateAvg:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_92

    return v2

    :cond_92
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCyclingLactateAvg:F

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mCyclingLactateAvg:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_93

    return v2

    :cond_93
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPersonalZone:[I

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mPersonalZone:[I

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_94

    return v2

    :cond_94
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAICoachSportID:I

    iget p1, p1, Lcom/szabh/smable3/entity/BleWorkout4;->mAICoachSportID:I

    if-eq v1, p1, :cond_95

    return v2

    :cond_95
    return v0
.end method

.method public final floatArrayListToString(Ljava/util/List;)Ljava/lang/String;
    .locals 4
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "[F>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "list"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const-string v1, ""

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [F

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/util/Arrays;->toString([F)Ljava/lang/String;

    move-result-object v1

    const-string v2, "toString(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public final getMAICoachSportID()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAICoachSportID:I

    return v0
.end method

.method public final getMAerobic()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAerobic:F

    return v0
.end method

.method public final getMAirPressure()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAirPressure:I

    return v0
.end method

.method public final getMAltitude()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAltitude:I

    return v0
.end method

.method public final getMAltitudePathCount()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAltitudePathCount:I

    return v0
.end method

.method public final getMAltitudePathPoints()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAltitudePathPoints:Ljava/util/List;

    return-object v0
.end method

.method public final getMAltitudePathSampleInterval()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAltitudePathSampleInterval:I

    return v0
.end method

.method public final getMAnaerobic()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAnaerobic:F

    return v0
.end method

.method public final getMAscendAltitude()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAscendAltitude:I

    return v0
.end method

.method public final getMAvgBpm()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAvgBpm:I

    return v0
.end method

.method public final getMAvgSpeed()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAvgSpeed:F

    return v0
.end method

.method public final getMAvgStress()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAvgStress:I

    return v0
.end method

.method public final getMBackSwingTime()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mBackSwingTime:I

    return v0
.end method

.method public final getMBackstrokePerc()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mBackstrokePerc:I

    return v0
.end method

.method public final getMBestRunTime()[I
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mBestRunTime:[I

    return-object v0
.end method

.method public final getMBpmZoneCount()[I
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mBpmZoneCount:[I

    return-object v0
.end method

.method public final getMBreaststrokePerc()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mBreaststrokePerc:I

    return v0
.end method

.method public final getMButterflyPerc()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mButterflyPerc:I

    return v0
.end method

.method public final getMCadence()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCadence:F

    return v0
.end method

.method public final getMCadencePathCount()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCadencePathCount:I

    return v0
.end method

.method public final getMCadencePathPoints()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCadencePathPoints:Ljava/util/List;

    return-object v0
.end method

.method public final getMCadencePathSampleInterval()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCadencePathSampleInterval:I

    return v0
.end method

.method public final getMCalorie()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCalorie:I

    return v0
.end method

.method public final getMCalorieTotal()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCalorieTotal:F

    return v0
.end method

.method public final getMCarboTotal()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCarboTotal:F

    return v0
.end method

.method public final getMChildCyclingDistance()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildCyclingDistance:I

    return v0
.end method

.method public final getMChildCyclingDuration()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildCyclingDuration:I

    return v0
.end method

.method public final getMChildCyclingMode()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildCyclingMode:I

    return v0
.end method

.method public final getMChildCyclingStartTime()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildCyclingStartTime:I

    return v0
.end method

.method public final getMChildNumber()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildNumber:I

    return v0
.end method

.method public final getMChildRunDistance()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildRunDistance:I

    return v0
.end method

.method public final getMChildRunDuration()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildRunDuration:I

    return v0
.end method

.method public final getMChildRunMode()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildRunMode:I

    return v0
.end method

.method public final getMChildRunStartTime()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildRunStartTime:I

    return v0
.end method

.method public final getMChildSwimDistance()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildSwimDistance:I

    return v0
.end method

.method public final getMChildSwimDuration()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildSwimDuration:I

    return v0
.end method

.method public final getMChildSwimMode()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildSwimMode:I

    return v0
.end method

.method public final getMChildSwimStartTime()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildSwimStartTime:I

    return v0
.end method

.method public final getMCnt()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCnt:I

    return v0
.end method

.method public final getMCntBack()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCntBack:I

    return v0
.end method

.method public final getMCntFore()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCntFore:I

    return v0
.end method

.method public final getMCntLap()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCntLap:I

    return v0
.end method

.method public final getMCountAltitude()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCountAltitude:I

    return v0
.end method

.method public final getMCountBpm()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCountBpm:I

    return v0
.end method

.method public final getMCountSatellite()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCountSatellite:I

    return v0
.end method

.method public final getMCountStress()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCountStress:I

    return v0
.end method

.method public final getMCurBpm()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCurBpm:I

    return v0
.end method

.method public final getMCurStress()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCurStress:I

    return v0
.end method

.method public final getMCyclingIndex()[F
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCyclingIndex:[F

    return-object v0
.end method

.method public final getMCyclingLactateAvg()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCyclingLactateAvg:F

    return v0
.end method

.method public final getMDescendAltitude()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mDescendAltitude:I

    return v0
.end method

.method public final getMDistance()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mDistance:I

    return v0
.end method

.method public final getMDownSwingTime()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mDownSwingTime:I

    return v0
.end method

.method public final getMDribbleTime()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mDribbleTime:I

    return v0
.end method

.method public final getMDuration()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mDuration:I

    return v0
.end method

.method public final getMEllipticalSteps()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mEllipticalSteps:I

    return v0
.end method

.method public final getMEnd()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mEnd:I

    return v0
.end method

.method public final getMFatTotal()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mFatTotal:F

    return v0
.end method

.method public final getMFitnessAge()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mFitnessAge:I

    return v0
.end method

.method public final getMFitnessLevel()[F
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mFitnessLevel:[F

    return-object v0
.end method

.method public final getMFrontCrawlPerc()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mFrontCrawlPerc:I

    return v0
.end method

.method public final getMHrPathCount()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mHrPathCount:I

    return v0
.end method

.method public final getMHrPathPoints()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mHrPathPoints:Ljava/util/List;

    return-object v0
.end method

.method public final getMHrPathSampleInterval()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mHrPathSampleInterval:I

    return v0
.end method

.method public final getMLactateThresholdHr()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mLactateThresholdHr:I

    return v0
.end method

.method public final getMLactateThresholdPace()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mLactateThresholdPace:I

    return v0
.end method

.method public final getMMaxAltitude()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxAltitude:I

    return v0
.end method

.method public final getMMaxBpm()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxBpm:I

    return v0
.end method

.method public final getMMaxCadence()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxCadence:I

    return v0
.end method

.method public final getMMaxOxygenPower()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxOxygenPower:F

    return v0
.end method

.method public final getMMaxPace()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxPace:I

    return v0
.end method

.method public final getMMaxSpeed()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxSpeed:F

    return v0
.end method

.method public final getMMaxSpm()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxSpm:I

    return v0
.end method

.method public final getMMaxStress()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxStress:I

    return v0
.end method

.method public final getMMaxVO2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxVO2:I

    return v0
.end method

.method public final getMMetTotal()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMetTotal:F

    return v0
.end method

.method public final getMMinAltitude()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMinAltitude:I

    return v0
.end method

.method public final getMMinBpm()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMinBpm:I

    return v0
.end method

.method public final getMMinPace()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMinPace:I

    return v0
.end method

.method public final getMMinSpeed()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMinSpeed:F

    return v0
.end method

.method public final getMMinSpm()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMinSpm:I

    return v0
.end method

.method public final getMMinStress()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMinStress:I

    return v0
.end method

.method public final getMMode()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMode:I

    return v0
.end method

.method public final getMNavigatorActualDistance()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorActualDistance:I

    return v0
.end method

.method public final getMNavigatorActualPace()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorActualPace:I

    return v0
.end method

.method public final getMNavigatorActualSpeed()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorActualSpeed:F

    return v0
.end method

.method public final getMNavigatorActualTime()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorActualTime:I

    return v0
.end method

.method public final getMNavigatorDifferenceDistance()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorDifferenceDistance:I

    return v0
.end method

.method public final getMNavigatorDifferencePace()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorDifferencePace:I

    return v0
.end method

.method public final getMNavigatorDifferenceSpeed()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorDifferenceSpeed:I

    return v0
.end method

.method public final getMNavigatorDifferenceTime()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorDifferenceTime:I

    return v0
.end method

.method public final getMNavigatorStatusDistance()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorStatusDistance:I

    return v0
.end method

.method public final getMNavigatorStatusPace()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorStatusPace:I

    return v0
.end method

.method public final getMNavigatorStatusSpeed()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorStatusSpeed:I

    return v0
.end method

.method public final getMNavigatorStatusTime()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorStatusTime:I

    return v0
.end method

.method public final getMNavigatorTargetDistance()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorTargetDistance:I

    return v0
.end method

.method public final getMNavigatorTargetPace()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorTargetPace:I

    return v0
.end method

.method public final getMNavigatorTargetSpeed()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorTargetSpeed:F

    return v0
.end method

.method public final getMNavigatorTargetTime()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorTargetTime:I

    return v0
.end method

.method public final getMPace()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPace:I

    return v0
.end method

.method public final getMPacePathCount()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPacePathCount:I

    return v0
.end method

.method public final getMPacePathPoints()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPacePathPoints:Ljava/util/List;

    return-object v0
.end method

.method public final getMPacePathSampleInterval()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPacePathSampleInterval:I

    return v0
.end method

.method public final getMPathCount()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPathCount:I

    return v0
.end method

.method public final getMPathPoints()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "[F>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPathPoints:Ljava/util/List;

    return-object v0
.end method

.method public final getMPathSampleInterval()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPathSampleInterval:I

    return v0
.end method

.method public final getMPausedDuration()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPausedDuration:I

    return v0
.end method

.method public final getMPersonalZone()[I
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPersonalZone:[I

    return-object v0
.end method

.method public final getMPowerCount()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPowerCount:I

    return v0
.end method

.method public final getMPowerInterval()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPowerInterval:I

    return v0
.end method

.method public final getMPowerPoints()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPowerPoints:Ljava/util/List;

    return-object v0
.end method

.method public final getMRecoveryHrCount()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mRecoveryHrCount:I

    return v0
.end method

.method public final getMRecoveryHrPoints()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mRecoveryHrPoints:Ljava/util/List;

    return-object v0
.end method

.method public final getMRecoveryHrSampleInterval()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mRecoveryHrSampleInterval:I

    return v0
.end method

.method public final getMRecoveryTime()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mRecoveryTime:I

    return v0
.end method

.method public final getMRunLactateAvg()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mRunLactateAvg:F

    return v0
.end method

.method public final getMRunPowerWatt()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mRunPowerWatt:I

    return v0
.end method

.method public final getMSessionCount()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSessionCount:I

    return v0
.end method

.method public final getMSize()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSize:I

    return v0
.end method

.method public final getMSpeed()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpeed:F

    return v0
.end method

.method public final getMSpeedPathCount()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpeedPathCount:I

    return v0
.end method

.method public final getMSpeedPathPoints()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpeedPathPoints:Ljava/util/List;

    return-object v0
.end method

.method public final getMSpeedPathSampleInterval()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpeedPathSampleInterval:I

    return v0
.end method

.method public final getMSpm()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpm:I

    return v0
.end method

.method public final getMSpmPathPointsCount()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpmPathPointsCount:I

    return v0
.end method

.method public final getMSpmPathPointsPoints()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpmPathPointsPoints:Ljava/util/List;

    return-object v0
.end method

.method public final getMStaBalance()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mStaBalance:I

    return v0
.end method

.method public final getMStamina()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mStamina:F

    return v0
.end method

.method public final getMStart()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mStart:I

    return v0
.end method

.method public final getMStep()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mStep:I

    return v0
.end method

.method public final getMStepLen()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mStepLen:F

    return v0
.end method

.method public final getMStepLenCount()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mStepLenCount:I

    return v0
.end method

.method public final getMStepLenPoints()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mStepLenPoints:Ljava/util/List;

    return-object v0
.end method

.method public final getMSwimPoolLength()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSwimPoolLength:I

    return v0
.end method

.method public final getMSwimSwolf()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSwimSwolf:I

    return v0
.end method

.method public final getMSwimType()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSwimType:I

    return v0
.end method

.method public final getMTlTrend()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mTlTrend:F

    return v0
.end method

.method public final getMTotalAltitude()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mTotalAltitude:I

    return v0
.end method

.method public final getMTotalBpm()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mTotalBpm:I

    return v0
.end method

.method public final getMTotalStress()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mTotalStress:I

    return v0
.end method

.method public final getMTrainingLoad()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mTrainingLoad:I

    return v0
.end method

.method public final getMTrainingStatus()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mTrainingStatus:I

    return v0
.end method

.method public final getMTrendWeek()[F
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mTrendWeek:[F

    return-object v0
.end method

.method public final getMTripCount()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mTripCount:I

    return v0
.end method

.method public final getMVerticalOscillation()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mVerticalOscillation:F

    return v0
.end method

.method public final getMWorkoutFlag()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mWorkoutFlag:I

    return v0
.end method

.method public final getRealTimeAerobic()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->realTimeAerobic:F

    return v0
.end method

.method public final getRealTimeAnaerobic()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->realTimeAnaerobic:F

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mStart:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mEnd:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSize:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildNumber:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMode:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mDuration:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPausedDuration:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCurBpm:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAvgBpm:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxBpm:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMinBpm:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCountBpm:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mTotalBpm:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mStep:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mDistance:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCalorie:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAltitude:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxAltitude:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMinAltitude:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAscendAltitude:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mDescendAltitude:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCountAltitude:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mTotalAltitude:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAirPressure:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpeed:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCountSatellite:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpm:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxSpm:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMinSpm:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPace:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxPace:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMinPace:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCurStress:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAvgStress:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMinStress:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxStress:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCountStress:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mTotalStress:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxSpeed:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMinSpeed:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAvgSpeed:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mStamina:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAerobic:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAnaerobic:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMetTotal:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mRecoveryTime:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mTrainingLoad:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxVO2:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCnt:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCadence:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxCadence:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSwimType:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCntFore:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCntBack:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mBackSwingTime:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mDownSwingTime:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mDribbleTime:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mTripCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSessionCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mStaBalance:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mStepLen:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mVerticalOscillation:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mRunPowerWatt:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mBpmZoneCount:[I

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mLactateThresholdHr:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mLactateThresholdPace:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mTrainingStatus:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mFitnessAge:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mFitnessLevel:[F

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mBestRunTime:[I

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mTlTrend:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPathCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPathSampleInterval:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPathPoints:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mHrPathCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mHrPathSampleInterval:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mHrPathPoints:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPacePathCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPacePathSampleInterval:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPacePathPoints:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpeedPathCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpeedPathSampleInterval:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpeedPathPoints:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCadencePathCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCadencePathSampleInterval:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCadencePathPoints:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAltitudePathCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAltitudePathSampleInterval:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAltitudePathPoints:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mRecoveryHrCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mRecoveryHrSampleInterval:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mRecoveryHrPoints:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSwimPoolLength:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->realTimeAerobic:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->realTimeAnaerobic:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCalorieTotal:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mFatTotal:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCarboTotal:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPowerCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPowerInterval:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPowerPoints:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpmPathPointsCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpmPathPointsPoints:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mStepLenCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mStepLenPoints:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorTargetTime:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorActualTime:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorDifferenceTime:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorStatusTime:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorTargetDistance:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorActualDistance:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorDifferenceDistance:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorStatusDistance:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorTargetPace:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorActualPace:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorDifferencePace:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorStatusPace:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorTargetSpeed:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorActualSpeed:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorDifferenceSpeed:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorStatusSpeed:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxOxygenPower:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mTrendWeek:[F

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCyclingIndex:[F

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSwimSwolf:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCntLap:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mFrontCrawlPerc:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mBreaststrokePerc:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mBackstrokePerc:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mButterflyPerc:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mEllipticalSteps:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mWorkoutFlag:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildSwimStartTime:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildSwimDuration:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildSwimDistance:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildCyclingStartTime:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildCyclingDuration:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildCyclingDistance:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildRunStartTime:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildRunDuration:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildRunDistance:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildSwimMode:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildCyclingMode:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildRunMode:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mRunLactateAvg:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCyclingLactateAvg:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPersonalZone:[I

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAICoachSportID:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMAICoachSportID(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAICoachSportID:I

    return-void
.end method

.method public final setMAerobic(F)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAerobic:F

    return-void
.end method

.method public final setMAirPressure(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAirPressure:I

    return-void
.end method

.method public final setMAltitude(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAltitude:I

    return-void
.end method

.method public final setMAltitudePathCount(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAltitudePathCount:I

    return-void
.end method

.method public final setMAltitudePathPoints(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
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

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAltitudePathPoints:Ljava/util/List;

    return-void
.end method

.method public final setMAltitudePathSampleInterval(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAltitudePathSampleInterval:I

    return-void
.end method

.method public final setMAnaerobic(F)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAnaerobic:F

    return-void
.end method

.method public final setMAscendAltitude(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAscendAltitude:I

    return-void
.end method

.method public final setMAvgBpm(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAvgBpm:I

    return-void
.end method

.method public final setMAvgSpeed(F)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAvgSpeed:F

    return-void
.end method

.method public final setMAvgStress(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAvgStress:I

    return-void
.end method

.method public final setMBackSwingTime(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mBackSwingTime:I

    return-void
.end method

.method public final setMBackstrokePerc(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mBackstrokePerc:I

    return-void
.end method

.method public final setMBestRunTime([I)V
    .locals 1
    .param p1    # [I
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mBestRunTime:[I

    return-void
.end method

.method public final setMBpmZoneCount([I)V
    .locals 1
    .param p1    # [I
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mBpmZoneCount:[I

    return-void
.end method

.method public final setMBreaststrokePerc(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mBreaststrokePerc:I

    return-void
.end method

.method public final setMButterflyPerc(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mButterflyPerc:I

    return-void
.end method

.method public final setMCadence(F)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCadence:F

    return-void
.end method

.method public final setMCadencePathCount(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCadencePathCount:I

    return-void
.end method

.method public final setMCadencePathPoints(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
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

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCadencePathPoints:Ljava/util/List;

    return-void
.end method

.method public final setMCadencePathSampleInterval(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCadencePathSampleInterval:I

    return-void
.end method

.method public final setMCalorie(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCalorie:I

    return-void
.end method

.method public final setMCalorieTotal(F)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCalorieTotal:F

    return-void
.end method

.method public final setMCarboTotal(F)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCarboTotal:F

    return-void
.end method

.method public final setMChildCyclingDistance(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildCyclingDistance:I

    return-void
.end method

.method public final setMChildCyclingDuration(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildCyclingDuration:I

    return-void
.end method

.method public final setMChildCyclingMode(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildCyclingMode:I

    return-void
.end method

.method public final setMChildCyclingStartTime(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildCyclingStartTime:I

    return-void
.end method

.method public final setMChildNumber(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildNumber:I

    return-void
.end method

.method public final setMChildRunDistance(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildRunDistance:I

    return-void
.end method

.method public final setMChildRunDuration(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildRunDuration:I

    return-void
.end method

.method public final setMChildRunMode(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildRunMode:I

    return-void
.end method

.method public final setMChildRunStartTime(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildRunStartTime:I

    return-void
.end method

.method public final setMChildSwimDistance(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildSwimDistance:I

    return-void
.end method

.method public final setMChildSwimDuration(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildSwimDuration:I

    return-void
.end method

.method public final setMChildSwimMode(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildSwimMode:I

    return-void
.end method

.method public final setMChildSwimStartTime(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildSwimStartTime:I

    return-void
.end method

.method public final setMCnt(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCnt:I

    return-void
.end method

.method public final setMCntBack(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCntBack:I

    return-void
.end method

.method public final setMCntFore(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCntFore:I

    return-void
.end method

.method public final setMCntLap(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCntLap:I

    return-void
.end method

.method public final setMCountAltitude(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCountAltitude:I

    return-void
.end method

.method public final setMCountBpm(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCountBpm:I

    return-void
.end method

.method public final setMCountSatellite(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCountSatellite:I

    return-void
.end method

.method public final setMCountStress(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCountStress:I

    return-void
.end method

.method public final setMCurBpm(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCurBpm:I

    return-void
.end method

.method public final setMCurStress(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCurStress:I

    return-void
.end method

.method public final setMCyclingLactateAvg(F)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCyclingLactateAvg:F

    return-void
.end method

.method public final setMDescendAltitude(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mDescendAltitude:I

    return-void
.end method

.method public final setMDistance(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mDistance:I

    return-void
.end method

.method public final setMDownSwingTime(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mDownSwingTime:I

    return-void
.end method

.method public final setMDribbleTime(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mDribbleTime:I

    return-void
.end method

.method public final setMDuration(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mDuration:I

    return-void
.end method

.method public final setMEllipticalSteps(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mEllipticalSteps:I

    return-void
.end method

.method public final setMEnd(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mEnd:I

    return-void
.end method

.method public final setMFatTotal(F)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mFatTotal:F

    return-void
.end method

.method public final setMFitnessAge(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mFitnessAge:I

    return-void
.end method

.method public final setMFitnessLevel([F)V
    .locals 1
    .param p1    # [F
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mFitnessLevel:[F

    return-void
.end method

.method public final setMFrontCrawlPerc(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mFrontCrawlPerc:I

    return-void
.end method

.method public final setMHrPathCount(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mHrPathCount:I

    return-void
.end method

.method public final setMHrPathPoints(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
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

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mHrPathPoints:Ljava/util/List;

    return-void
.end method

.method public final setMHrPathSampleInterval(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mHrPathSampleInterval:I

    return-void
.end method

.method public final setMLactateThresholdHr(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mLactateThresholdHr:I

    return-void
.end method

.method public final setMLactateThresholdPace(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mLactateThresholdPace:I

    return-void
.end method

.method public final setMMaxAltitude(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxAltitude:I

    return-void
.end method

.method public final setMMaxBpm(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxBpm:I

    return-void
.end method

.method public final setMMaxCadence(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxCadence:I

    return-void
.end method

.method public final setMMaxOxygenPower(F)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxOxygenPower:F

    return-void
.end method

.method public final setMMaxPace(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxPace:I

    return-void
.end method

.method public final setMMaxSpeed(F)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxSpeed:F

    return-void
.end method

.method public final setMMaxSpm(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxSpm:I

    return-void
.end method

.method public final setMMaxStress(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxStress:I

    return-void
.end method

.method public final setMMaxVO2(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxVO2:I

    return-void
.end method

.method public final setMMetTotal(F)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMetTotal:F

    return-void
.end method

.method public final setMMinAltitude(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMinAltitude:I

    return-void
.end method

.method public final setMMinBpm(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMinBpm:I

    return-void
.end method

.method public final setMMinPace(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMinPace:I

    return-void
.end method

.method public final setMMinSpeed(F)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMinSpeed:F

    return-void
.end method

.method public final setMMinSpm(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMinSpm:I

    return-void
.end method

.method public final setMMinStress(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMinStress:I

    return-void
.end method

.method public final setMMode(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMode:I

    return-void
.end method

.method public final setMNavigatorActualDistance(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorActualDistance:I

    return-void
.end method

.method public final setMNavigatorActualPace(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorActualPace:I

    return-void
.end method

.method public final setMNavigatorActualSpeed(F)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorActualSpeed:F

    return-void
.end method

.method public final setMNavigatorActualTime(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorActualTime:I

    return-void
.end method

.method public final setMNavigatorDifferenceDistance(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorDifferenceDistance:I

    return-void
.end method

.method public final setMNavigatorDifferencePace(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorDifferencePace:I

    return-void
.end method

.method public final setMNavigatorDifferenceSpeed(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorDifferenceSpeed:I

    return-void
.end method

.method public final setMNavigatorDifferenceTime(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorDifferenceTime:I

    return-void
.end method

.method public final setMNavigatorStatusDistance(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorStatusDistance:I

    return-void
.end method

.method public final setMNavigatorStatusPace(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorStatusPace:I

    return-void
.end method

.method public final setMNavigatorStatusSpeed(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorStatusSpeed:I

    return-void
.end method

.method public final setMNavigatorStatusTime(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorStatusTime:I

    return-void
.end method

.method public final setMNavigatorTargetDistance(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorTargetDistance:I

    return-void
.end method

.method public final setMNavigatorTargetPace(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorTargetPace:I

    return-void
.end method

.method public final setMNavigatorTargetSpeed(F)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorTargetSpeed:F

    return-void
.end method

.method public final setMNavigatorTargetTime(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorTargetTime:I

    return-void
.end method

.method public final setMPace(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPace:I

    return-void
.end method

.method public final setMPacePathCount(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPacePathCount:I

    return-void
.end method

.method public final setMPacePathPoints(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
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

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPacePathPoints:Ljava/util/List;

    return-void
.end method

.method public final setMPacePathSampleInterval(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPacePathSampleInterval:I

    return-void
.end method

.method public final setMPathCount(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPathCount:I

    return-void
.end method

.method public final setMPathPoints(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "[F>;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPathPoints:Ljava/util/List;

    return-void
.end method

.method public final setMPathSampleInterval(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPathSampleInterval:I

    return-void
.end method

.method public final setMPausedDuration(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPausedDuration:I

    return-void
.end method

.method public final setMPersonalZone([I)V
    .locals 1
    .param p1    # [I
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPersonalZone:[I

    return-void
.end method

.method public final setMPowerCount(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPowerCount:I

    return-void
.end method

.method public final setMPowerInterval(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPowerInterval:I

    return-void
.end method

.method public final setMPowerPoints(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
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

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPowerPoints:Ljava/util/List;

    return-void
.end method

.method public final setMRecoveryHrCount(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mRecoveryHrCount:I

    return-void
.end method

.method public final setMRecoveryHrPoints(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
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

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mRecoveryHrPoints:Ljava/util/List;

    return-void
.end method

.method public final setMRecoveryHrSampleInterval(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mRecoveryHrSampleInterval:I

    return-void
.end method

.method public final setMRecoveryTime(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mRecoveryTime:I

    return-void
.end method

.method public final setMRunLactateAvg(F)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mRunLactateAvg:F

    return-void
.end method

.method public final setMRunPowerWatt(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mRunPowerWatt:I

    return-void
.end method

.method public final setMSessionCount(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSessionCount:I

    return-void
.end method

.method public final setMSize(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSize:I

    return-void
.end method

.method public final setMSpeed(F)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpeed:F

    return-void
.end method

.method public final setMSpeedPathCount(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpeedPathCount:I

    return-void
.end method

.method public final setMSpeedPathPoints(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
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

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpeedPathPoints:Ljava/util/List;

    return-void
.end method

.method public final setMSpeedPathSampleInterval(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpeedPathSampleInterval:I

    return-void
.end method

.method public final setMSpm(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpm:I

    return-void
.end method

.method public final setMSpmPathPointsCount(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpmPathPointsCount:I

    return-void
.end method

.method public final setMSpmPathPointsPoints(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
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

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpmPathPointsPoints:Ljava/util/List;

    return-void
.end method

.method public final setMStaBalance(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mStaBalance:I

    return-void
.end method

.method public final setMStamina(F)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mStamina:F

    return-void
.end method

.method public final setMStart(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mStart:I

    return-void
.end method

.method public final setMStep(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mStep:I

    return-void
.end method

.method public final setMStepLen(F)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mStepLen:F

    return-void
.end method

.method public final setMStepLenCount(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mStepLenCount:I

    return-void
.end method

.method public final setMStepLenPoints(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
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

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mStepLenPoints:Ljava/util/List;

    return-void
.end method

.method public final setMSwimPoolLength(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSwimPoolLength:I

    return-void
.end method

.method public final setMSwimSwolf(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSwimSwolf:I

    return-void
.end method

.method public final setMSwimType(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSwimType:I

    return-void
.end method

.method public final setMTlTrend(F)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mTlTrend:F

    return-void
.end method

.method public final setMTotalAltitude(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mTotalAltitude:I

    return-void
.end method

.method public final setMTotalBpm(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mTotalBpm:I

    return-void
.end method

.method public final setMTotalStress(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mTotalStress:I

    return-void
.end method

.method public final setMTrainingLoad(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mTrainingLoad:I

    return-void
.end method

.method public final setMTrainingStatus(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mTrainingStatus:I

    return-void
.end method

.method public final setMTripCount(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mTripCount:I

    return-void
.end method

.method public final setMVerticalOscillation(F)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mVerticalOscillation:F

    return-void
.end method

.method public final setMWorkoutFlag(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mWorkoutFlag:I

    return-void
.end method

.method public final setRealTimeAerobic(F)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->realTimeAerobic:F

    return-void
.end method

.method public final setRealTimeAnaerobic(F)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->realTimeAnaerobic:F

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleWorkout4(mStart="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mStart:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",  mEnd="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mEnd:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mDuration:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mAltitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAltitude:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mAirPressure="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAirPressure:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSpm="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpm:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mStep="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mStep:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",mDistance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mDistance:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCalorie="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCalorie:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSpeed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpeed:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mPace="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPace:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mAvgBpm="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAvgBpm:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMaxBpm="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxBpm:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMinBpm="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMinBpm:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMaxSpm="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxSpm:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMinSpm="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMinSpm:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMaxPace="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxPace:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "  mMinPace="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMinPace:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMaxAltitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxAltitude:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMinAltitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMinAltitude:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMinStress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMinStress:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMaxStress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxStress:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mAvgStress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAvgStress:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMaxSpeed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxSpeed:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mMinSpeed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMinSpeed:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, " , mMetTotal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMetTotal:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mAerobic="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAerobic:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mAnaerobic="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAnaerobic:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mStamina="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mStamina:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mAvgSpeed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAvgSpeed:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mCadence="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCadence:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mMaxCadence="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxCadence:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCnt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCnt:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " mBpmZoneCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mBpmZoneCount:[I

    invoke-static {v1}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "toString(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mPersonalZone="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPersonalZone:[I

    invoke-static {v1}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mLactateThresholdPace="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mLactateThresholdPace:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mRecoveryTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mRecoveryTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mTrainingLoad="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mTrainingLoad:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMaxVO2="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxVO2:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mLactateThresholdHr="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mLactateThresholdHr:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mWorkoutFlag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mWorkoutFlag:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",mPathCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPathCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPathSampleInterval="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPathSampleInterval:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPathPoints="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPathPoints:Ljava/util/List;

    invoke-virtual {p0, v1}, Lcom/szabh/smable3/entity/BleWorkout4;->floatArrayListToString(Ljava/util/List;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mHrPathCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mHrPathCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mHrPathSampleInterval="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mHrPathSampleInterval:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mHrPathPoints="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mHrPathPoints:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " mPacePathCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPacePathCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPacePathSampleInterval="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPacePathSampleInterval:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPacePathPoints="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPacePathPoints:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " mSpeedPathCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpeedPathCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSpeedPathSampleInterval="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpeedPathSampleInterval:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSpeedPathPoints="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSpeedPathPoints:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "  mCadencePathCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCadencePathCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCadencePathSampleInterval="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCadencePathSampleInterval:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",mCadencePathPoints="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCadencePathPoints:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mAltitudePathCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAltitudePathCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mAltitudePathSampleInterval="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAltitudePathSampleInterval:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",mAltitudePathPoints="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mAltitudePathPoints:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\uff0c realTimeAerobic="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->realTimeAerobic:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", realTimeAnaerobic="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->realTimeAnaerobic:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mCalorieTotal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCalorieTotal:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, "mFatTotal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mFatTotal:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ",mCarboTotal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCarboTotal:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ",mPowerCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPowerCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",mPowerInterval="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPowerInterval:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",mPowerPoints="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mPowerPoints:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "mNavigatorTargetTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorTargetTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mNavigatorActualTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorActualTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mNavigatorDifferenceTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorDifferenceTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "mNavigatorStatusTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorStatusTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mNavigatorTargetDistance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorTargetDistance:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mNavigatorActualDistance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorActualDistance:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "mNavigatorDifferenceDistance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorDifferenceDistance:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mNavigatorStatusDistance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorStatusDistance:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mNavigatorTargetPace="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorTargetPace:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "mNavigatorActualPace="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorActualPace:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mNavigatorDifferencePace="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorDifferencePace:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mNavigatorStatusPace="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorStatusPace:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "mNavigatorTargetSpeed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorTargetSpeed:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mNavigatorActualSpeed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorActualSpeed:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mNavigatorDifferenceSpeed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorDifferenceSpeed:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "mNavigatorStatusSpeed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mNavigatorStatusSpeed:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMaxOxygenPower="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mMaxOxygenPower:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mCyclingIndex = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCyclingIndex:[F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",mTrendWeek = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mTrendWeek:[F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mSwimSwolf ="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mSwimSwolf:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCntLap = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mCntLap:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mFrontCrawlPerc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mFrontCrawlPerc:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",mBreaststrokePerc = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mBreaststrokePerc:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mButterflyPerc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mButterflyPerc:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mEllipticalSteps="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mEllipticalSteps:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",mChildSwimStartTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildSwimStartTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",mChildSwimDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildSwimDuration:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",mChildSwimDistance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildSwimDistance:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",mChildCyclingStartTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildCyclingStartTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",mChildCyclingDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildCyclingDuration:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",mChildCyclingDistance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildCyclingDistance:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",mChildRunStartTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildRunStartTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",mChildRunDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildRunDuration:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",mChildRunDistance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildRunDistance:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",mChildSwimMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildSwimMode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",mChildCyclingMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildCyclingMode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",mChildRunMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout4;->mChildRunMode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
