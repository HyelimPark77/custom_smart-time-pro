.class public final Lcom/szabh/smable3/entity/BleWorkout3;
.super Lcom/bestmafen/baseble/data/BleReadable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleWorkout3$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBleWorkout3.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleWorkout3.kt\ncom/szabh/smable3/entity/BleWorkout3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,228:1\n1563#2:229\n1634#2,3:230\n*S KotlinDebug\n*F\n+ 1 BleWorkout3.kt\ncom/szabh/smable3/entity/BleWorkout3\n*L\n217#1:229\n217#1:230,3\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBleWorkout3.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleWorkout3.kt\ncom/szabh/smable3/entity/BleWorkout3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,228:1\n1563#2:229\n1634#2,3:230\n*S KotlinDebug\n*F\n+ 1 BleWorkout3.kt\ncom/szabh/smable3/entity/BleWorkout3\n*L\n217#1:229\n217#1:230,3\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleWorkout3$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_LENGTH:I = 0x800

.field public static final WORKOUT_MAX_POINT:I = 0x20


# instance fields
.field private mAerobic:F

.field private mAirPressure:I

.field private mAlgorithmMarking:I

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

.field private mAvgBpm:I

.field private mAvgSpeed:F

.field private mAvgStress:I

.field private mBpmZoneCount:[I
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mCadence:I

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

.field private mCnt:I

.field private mDistance:I

.field private mDuration:I

.field private mEnd:I

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

.field private mMaxPace:I

.field private mMaxSpeed:I

.field private mMaxSpm:I

.field private mMaxStress:I

.field private mMaxVO2:I

.field private mMetTotal:I

.field private mMinAltitude:I

.field private mMinBpm:I

.field private mMinPace:I

.field private mMinSpeed:I

.field private mMinSpm:I

.field private mMinStress:I

.field private mMode:I

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

.field private mPersonalZone:[I
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mRecoveryTime:I

.field private mSpeed:I

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

.field private mStamina:I

.field private mStart:I

.field private mStep:I

.field private mTrainingLoad:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleWorkout3$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleWorkout3$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleWorkout3;->Companion:Lcom/szabh/smable3/entity/BleWorkout3$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 64

    .line 1
    const v62, 0xfffffff

    const/16 v63, 0x0

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

    const/16 v61, -0x1

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v63}, Lcom/szabh/smable3/entity/BleWorkout3;-><init>(IIIIIIIIIIIIIIIIIIIIIIIIIIIFFIFIII[I[IIIIIIIIILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIIIIIIIIIIIIIIIIIIIIIIIIIIFFIFIII[I[IIIIIIIIILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;)V
    .locals 9
    .param p35    # [I
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p36    # [I
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p45    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p48    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p51    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p54    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p57    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p60    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIIIIIIIIIIIIIIIIIIIIIIIIIIFFIFIII[I[IIIIIIIII",
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
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p35

    move-object/from16 v1, p36

    move-object/from16 v2, p45

    move-object/from16 v3, p48

    move-object/from16 v4, p51

    move-object/from16 v5, p54

    move-object/from16 v6, p57

    move-object/from16 v7, p60

    const-string v8, "mBpmZoneCount"

    invoke-static {v0, v8}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "mPersonalZone"

    invoke-static {v1, v8}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "mPathPoints"

    invoke-static {v2, v8}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "mHrPathPoints"

    invoke-static {v3, v8}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "mPacePathPoints"

    invoke-static {v4, v8}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "mSpeedPathPoints"

    invoke-static {v5, v8}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "mCadencePathPoints"

    invoke-static {v6, v8}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "mAltitudePathPoints"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleReadable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mStart:I

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mEnd:I

    .line 5
    iput p3, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mDuration:I

    .line 6
    iput p4, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAltitude:I

    .line 7
    iput p5, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAirPressure:I

    .line 8
    iput p6, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mSpm:I

    move/from16 p1, p7

    .line 9
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMode:I

    move/from16 p1, p8

    .line 10
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mStep:I

    move/from16 p1, p9

    .line 11
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mDistance:I

    move/from16 p1, p10

    .line 12
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mCalorie:I

    move/from16 p1, p11

    .line 13
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mSpeed:I

    move/from16 p1, p12

    .line 14
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPace:I

    move/from16 p1, p13

    .line 15
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAvgBpm:I

    move/from16 p1, p14

    .line 16
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxBpm:I

    move/from16 p1, p15

    .line 17
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMinBpm:I

    move/from16 p1, p16

    .line 18
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxSpm:I

    move/from16 p1, p17

    .line 19
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMinSpm:I

    move/from16 p1, p18

    .line 20
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxPace:I

    move/from16 p1, p19

    .line 21
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMinPace:I

    move/from16 p1, p20

    .line 22
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxAltitude:I

    move/from16 p1, p21

    .line 23
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMinAltitude:I

    move/from16 p1, p22

    .line 24
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMinStress:I

    move/from16 p1, p23

    .line 25
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxStress:I

    move/from16 p1, p24

    .line 26
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAvgStress:I

    move/from16 p1, p25

    .line 27
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxSpeed:I

    move/from16 p1, p26

    .line 28
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMinSpeed:I

    move/from16 p1, p27

    .line 29
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMetTotal:I

    move/from16 p1, p28

    .line 30
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAerobic:F

    move/from16 p1, p29

    .line 31
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAnaerobic:F

    move/from16 p1, p30

    .line 32
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mStamina:I

    move/from16 p1, p31

    .line 33
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAvgSpeed:F

    move/from16 p1, p32

    .line 34
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mCadence:I

    move/from16 p1, p33

    .line 35
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxCadence:I

    move/from16 p1, p34

    .line 36
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mCnt:I

    .line 37
    iput-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mBpmZoneCount:[I

    .line 38
    iput-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPersonalZone:[I

    move/from16 p1, p37

    .line 39
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mLactateThresholdPace:I

    move/from16 p1, p38

    .line 40
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mRecoveryTime:I

    move/from16 p1, p39

    .line 41
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mTrainingLoad:I

    move/from16 p1, p40

    .line 42
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxVO2:I

    move/from16 p1, p41

    .line 43
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mLactateThresholdHr:I

    move/from16 p1, p42

    .line 44
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAlgorithmMarking:I

    move/from16 p1, p43

    .line 45
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPathCount:I

    move/from16 p1, p44

    .line 46
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPathSampleInterval:I

    .line 47
    iput-object v2, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPathPoints:Ljava/util/List;

    move/from16 p1, p46

    .line 48
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mHrPathCount:I

    move/from16 p1, p47

    .line 49
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mHrPathSampleInterval:I

    .line 50
    iput-object v3, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mHrPathPoints:Ljava/util/List;

    move/from16 p1, p49

    .line 51
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPacePathCount:I

    move/from16 p1, p50

    .line 52
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPacePathSampleInterval:I

    .line 53
    iput-object v4, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPacePathPoints:Ljava/util/List;

    move/from16 p1, p52

    .line 54
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mSpeedPathCount:I

    move/from16 p1, p53

    .line 55
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mSpeedPathSampleInterval:I

    .line 56
    iput-object v5, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mSpeedPathPoints:Ljava/util/List;

    move/from16 p1, p55

    .line 57
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mCadencePathCount:I

    move/from16 p1, p56

    .line 58
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mCadencePathSampleInterval:I

    .line 59
    iput-object v6, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mCadencePathPoints:Ljava/util/List;

    move/from16 p1, p58

    .line 60
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAltitudePathCount:I

    move/from16 p1, p59

    .line 61
    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAltitudePathSampleInterval:I

    .line 62
    iput-object v7, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAltitudePathPoints:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(IIIIIIIIIIIIIIIIIIIIIIIIIIIFFIFIII[I[IIIIIIIIILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 50

    move/from16 v0, p61

    move/from16 v1, p62

    and-int/lit8 v2, v0, 0x1

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    move/from16 v2, p1

    :goto_0
    and-int/lit8 v4, v0, 0x2

    if-eqz v4, :cond_1

    const/4 v4, 0x0

    goto :goto_1

    :cond_1
    move/from16 v4, p2

    :goto_1
    and-int/lit8 v5, v0, 0x4

    if-eqz v5, :cond_2

    const/4 v5, 0x0

    goto :goto_2

    :cond_2
    move/from16 v5, p3

    :goto_2
    and-int/lit8 v6, v0, 0x8

    if-eqz v6, :cond_3

    const/4 v6, 0x0

    goto :goto_3

    :cond_3
    move/from16 v6, p4

    :goto_3
    and-int/lit8 v7, v0, 0x10

    if-eqz v7, :cond_4

    const/4 v7, 0x0

    goto :goto_4

    :cond_4
    move/from16 v7, p5

    :goto_4
    and-int/lit8 v8, v0, 0x20

    if-eqz v8, :cond_5

    const/4 v8, 0x0

    goto :goto_5

    :cond_5
    move/from16 v8, p6

    :goto_5
    and-int/lit8 v9, v0, 0x40

    if-eqz v9, :cond_6

    const/4 v9, 0x0

    goto :goto_6

    :cond_6
    move/from16 v9, p7

    :goto_6
    and-int/lit16 v10, v0, 0x80

    if-eqz v10, :cond_7

    const/4 v10, 0x0

    goto :goto_7

    :cond_7
    move/from16 v10, p8

    :goto_7
    and-int/lit16 v11, v0, 0x100

    if-eqz v11, :cond_8

    const/4 v11, 0x0

    goto :goto_8

    :cond_8
    move/from16 v11, p9

    :goto_8
    and-int/lit16 v12, v0, 0x200

    if-eqz v12, :cond_9

    const/4 v12, 0x0

    goto :goto_9

    :cond_9
    move/from16 v12, p10

    :goto_9
    and-int/lit16 v13, v0, 0x400

    if-eqz v13, :cond_a

    const/4 v13, 0x0

    goto :goto_a

    :cond_a
    move/from16 v13, p11

    :goto_a
    and-int/lit16 v14, v0, 0x800

    if-eqz v14, :cond_b

    const/4 v14, 0x0

    goto :goto_b

    :cond_b
    move/from16 v14, p12

    :goto_b
    and-int/lit16 v15, v0, 0x1000

    if-eqz v15, :cond_c

    const/4 v15, 0x0

    goto :goto_c

    :cond_c
    move/from16 v15, p13

    :goto_c
    and-int/lit16 v3, v0, 0x2000

    if-eqz v3, :cond_d

    const/4 v3, 0x0

    goto :goto_d

    :cond_d
    move/from16 v3, p14

    :goto_d
    move/from16 p1, v2

    and-int/lit16 v2, v0, 0x4000

    if-eqz v2, :cond_e

    const/4 v2, 0x0

    goto :goto_e

    :cond_e
    move/from16 v2, p15

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

    if-eqz v30, :cond_18

    const/16 v30, 0x0

    goto :goto_18

    :cond_18
    move/from16 v30, p25

    :goto_18
    const/high16 v31, 0x2000000

    and-int v31, v0, v31

    if-eqz v31, :cond_19

    const/16 v31, 0x0

    goto :goto_19

    :cond_19
    move/from16 v31, p26

    :goto_19
    const/high16 v32, 0x4000000

    and-int v32, v0, v32

    if-eqz v32, :cond_1a

    const/16 v32, 0x0

    goto :goto_1a

    :cond_1a
    move/from16 v32, p27

    :goto_1a
    const/high16 v33, 0x8000000

    and-int v33, v0, v33

    const/16 v34, 0x0

    if-eqz v33, :cond_1b

    move/from16 v33, v34

    goto :goto_1b

    :cond_1b
    move/from16 v33, p28

    :goto_1b
    const/high16 v35, 0x10000000

    and-int v35, v0, v35

    if-eqz v35, :cond_1c

    move/from16 v35, v34

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

    goto :goto_1e

    :cond_1e
    move/from16 v34, p31

    :goto_1e
    const/high16 v37, -0x80000000

    and-int v0, v0, v37

    if-eqz v0, :cond_1f

    const/4 v0, 0x0

    goto :goto_1f

    :cond_1f
    move/from16 v0, p32

    :goto_1f
    and-int/lit8 v37, v1, 0x1

    if-eqz v37, :cond_20

    const/16 v37, 0x0

    goto :goto_20

    :cond_20
    move/from16 v37, p33

    :goto_20
    and-int/lit8 v38, v1, 0x2

    if-eqz v38, :cond_21

    const/16 v38, 0x0

    goto :goto_21

    :cond_21
    move/from16 v38, p34

    :goto_21
    and-int/lit8 v39, v1, 0x4

    move/from16 p2, v0

    if-eqz v39, :cond_22

    const/4 v0, 0x5

    .line 63
    new-array v0, v0, [I

    goto :goto_22

    :cond_22
    move-object/from16 v0, p35

    :goto_22
    and-int/lit8 v39, v1, 0x8

    move-object/from16 p3, v0

    if-eqz v39, :cond_23

    const/4 v0, 0x5

    .line 64
    new-array v0, v0, [I

    goto :goto_23

    :cond_23
    move-object/from16 v0, p36

    :goto_23
    and-int/lit8 v39, v1, 0x10

    if-eqz v39, :cond_24

    const/16 v39, 0x0

    goto :goto_24

    :cond_24
    move/from16 v39, p37

    :goto_24
    and-int/lit8 v40, v1, 0x20

    if-eqz v40, :cond_25

    const/16 v40, 0x0

    goto :goto_25

    :cond_25
    move/from16 v40, p38

    :goto_25
    and-int/lit8 v41, v1, 0x40

    if-eqz v41, :cond_26

    const/16 v41, 0x0

    goto :goto_26

    :cond_26
    move/from16 v41, p39

    :goto_26
    move-object/from16 p4, v0

    and-int/lit16 v0, v1, 0x80

    if-eqz v0, :cond_27

    const/4 v0, 0x0

    goto :goto_27

    :cond_27
    move/from16 v0, p40

    :goto_27
    move/from16 p5, v0

    and-int/lit16 v0, v1, 0x100

    if-eqz v0, :cond_28

    const/4 v0, 0x0

    goto :goto_28

    :cond_28
    move/from16 v0, p41

    :goto_28
    move/from16 p6, v0

    and-int/lit16 v0, v1, 0x200

    if-eqz v0, :cond_29

    const/4 v0, 0x0

    goto :goto_29

    :cond_29
    move/from16 v0, p42

    :goto_29
    move/from16 p7, v0

    and-int/lit16 v0, v1, 0x400

    if-eqz v0, :cond_2a

    const/4 v0, 0x0

    goto :goto_2a

    :cond_2a
    move/from16 v0, p43

    :goto_2a
    move/from16 p8, v0

    and-int/lit16 v0, v1, 0x800

    if-eqz v0, :cond_2b

    const/4 v0, 0x0

    goto :goto_2b

    :cond_2b
    move/from16 v0, p44

    :goto_2b
    move/from16 p9, v0

    and-int/lit16 v0, v1, 0x1000

    if-eqz v0, :cond_2c

    .line 65
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    goto :goto_2c

    :cond_2c
    move-object/from16 v0, p45

    :goto_2c
    move-object/from16 p10, v0

    and-int/lit16 v0, v1, 0x2000

    if-eqz v0, :cond_2d

    const/4 v0, 0x0

    goto :goto_2d

    :cond_2d
    move/from16 v0, p46

    :goto_2d
    move/from16 p11, v0

    and-int/lit16 v0, v1, 0x4000

    if-eqz v0, :cond_2e

    const/4 v0, 0x0

    goto :goto_2e

    :cond_2e
    move/from16 v0, p47

    :goto_2e
    and-int v16, v1, v16

    if-eqz v16, :cond_2f

    .line 66
    new-instance v16, Ljava/util/ArrayList;

    invoke-direct/range {v16 .. v16}, Ljava/util/ArrayList;-><init>()V

    goto :goto_2f

    :cond_2f
    move-object/from16 v16, p48

    :goto_2f
    and-int v18, v1, v18

    if-eqz v18, :cond_30

    const/16 v18, 0x0

    goto :goto_30

    :cond_30
    move/from16 v18, p49

    :goto_30
    and-int v20, v1, v20

    if-eqz v20, :cond_31

    const/16 v20, 0x0

    goto :goto_31

    :cond_31
    move/from16 v20, p50

    :goto_31
    and-int v22, v1, v22

    if-eqz v22, :cond_32

    .line 67
    new-instance v22, Ljava/util/ArrayList;

    invoke-direct/range {v22 .. v22}, Ljava/util/ArrayList;-><init>()V

    goto :goto_32

    :cond_32
    move-object/from16 v22, p51

    :goto_32
    and-int v24, v1, v24

    if-eqz v24, :cond_33

    const/16 v24, 0x0

    goto :goto_33

    :cond_33
    move/from16 v24, p52

    :goto_33
    const/high16 v42, 0x100000

    and-int v42, v1, v42

    if-eqz v42, :cond_34

    const/16 v42, 0x0

    goto :goto_34

    :cond_34
    move/from16 v42, p53

    :goto_34
    const/high16 v43, 0x200000

    and-int v43, v1, v43

    if-eqz v43, :cond_35

    .line 68
    new-instance v43, Ljava/util/ArrayList;

    invoke-direct/range {v43 .. v43}, Ljava/util/ArrayList;-><init>()V

    goto :goto_35

    :cond_35
    move-object/from16 v43, p54

    :goto_35
    const/high16 v44, 0x400000

    and-int v44, v1, v44

    if-eqz v44, :cond_36

    const/16 v44, 0x0

    goto :goto_36

    :cond_36
    move/from16 v44, p55

    :goto_36
    const/high16 v45, 0x800000

    and-int v45, v1, v45

    if-eqz v45, :cond_37

    const/16 v45, 0x0

    goto :goto_37

    :cond_37
    move/from16 v45, p56

    :goto_37
    const/high16 v46, 0x1000000

    and-int v46, v1, v46

    if-eqz v46, :cond_38

    .line 69
    new-instance v46, Ljava/util/ArrayList;

    invoke-direct/range {v46 .. v46}, Ljava/util/ArrayList;-><init>()V

    goto :goto_38

    :cond_38
    move-object/from16 v46, p57

    :goto_38
    const/high16 v47, 0x2000000

    and-int v47, v1, v47

    if-eqz v47, :cond_39

    const/16 v47, 0x0

    goto :goto_39

    :cond_39
    move/from16 v47, p58

    :goto_39
    const/high16 v48, 0x4000000

    and-int v48, v1, v48

    if-eqz v48, :cond_3a

    const/16 v48, 0x0

    goto :goto_3a

    :cond_3a
    move/from16 v48, p59

    :goto_3a
    const/high16 v49, 0x8000000

    and-int v1, v1, v49

    if-eqz v1, :cond_3b

    .line 70
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 p61, v1

    :goto_3b
    move/from16 p33, p2

    move-object/from16 p36, p3

    move-object/from16 p37, p4

    move/from16 p41, p5

    move/from16 p42, p6

    move/from16 p43, p7

    move/from16 p44, p8

    move/from16 p45, p9

    move-object/from16 p46, p10

    move/from16 p47, p11

    move/from16 p48, v0

    move/from16 p16, v2

    move/from16 p15, v3

    move/from16 p3, v4

    move/from16 p4, v5

    move/from16 p5, v6

    move/from16 p6, v7

    move/from16 p7, v8

    move/from16 p8, v9

    move/from16 p9, v10

    move/from16 p10, v11

    move/from16 p11, v12

    move/from16 p12, v13

    move/from16 p13, v14

    move/from16 p14, v15

    move-object/from16 p49, v16

    move/from16 p17, v17

    move/from16 p50, v18

    move/from16 p18, v19

    move/from16 p51, v20

    move/from16 p19, v21

    move-object/from16 p52, v22

    move/from16 p20, v23

    move/from16 p53, v24

    move/from16 p21, v25

    move/from16 p22, v26

    move/from16 p23, v27

    move/from16 p24, v28

    move/from16 p25, v29

    move/from16 p26, v30

    move/from16 p27, v31

    move/from16 p28, v32

    move/from16 p29, v33

    move/from16 p32, v34

    move/from16 p30, v35

    move/from16 p31, v36

    move/from16 p34, v37

    move/from16 p35, v38

    move/from16 p38, v39

    move/from16 p39, v40

    move/from16 p40, v41

    move/from16 p54, v42

    move-object/from16 p55, v43

    move/from16 p56, v44

    move/from16 p57, v45

    move-object/from16 p58, v46

    move/from16 p59, v47

    move/from16 p60, v48

    move/from16 p2, p1

    move-object/from16 p1, p0

    goto :goto_3c

    :cond_3b
    move-object/from16 p61, p60

    goto :goto_3b

    .line 71
    :goto_3c
    invoke-direct/range {p1 .. p61}, Lcom/szabh/smable3/entity/BleWorkout3;-><init>(IIIIIIIIIIIIIIIIIIIIIIIIIIIFFIFIII[I[IIIIIIIIILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleWorkout3;IIIIIIIIIIIIIIIIIIIIIIIIIIIFFIFIII[I[IIIIIIIIILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/lang/Object;)Lcom/szabh/smable3/entity/BleWorkout3;
    .locals 24

    move-object/from16 v0, p0

    move/from16 v1, p61

    move/from16 v2, p62

    and-int/lit8 v3, v1, 0x1

    if-eqz v3, :cond_0

    iget v3, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mStart:I

    goto :goto_0

    :cond_0
    move/from16 v3, p1

    :goto_0
    and-int/lit8 v4, v1, 0x2

    if-eqz v4, :cond_1

    iget v4, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mEnd:I

    goto :goto_1

    :cond_1
    move/from16 v4, p2

    :goto_1
    and-int/lit8 v5, v1, 0x4

    if-eqz v5, :cond_2

    iget v5, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mDuration:I

    goto :goto_2

    :cond_2
    move/from16 v5, p3

    :goto_2
    and-int/lit8 v6, v1, 0x8

    if-eqz v6, :cond_3

    iget v6, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mAltitude:I

    goto :goto_3

    :cond_3
    move/from16 v6, p4

    :goto_3
    and-int/lit8 v7, v1, 0x10

    if-eqz v7, :cond_4

    iget v7, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mAirPressure:I

    goto :goto_4

    :cond_4
    move/from16 v7, p5

    :goto_4
    and-int/lit8 v8, v1, 0x20

    if-eqz v8, :cond_5

    iget v8, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mSpm:I

    goto :goto_5

    :cond_5
    move/from16 v8, p6

    :goto_5
    and-int/lit8 v9, v1, 0x40

    if-eqz v9, :cond_6

    iget v9, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mMode:I

    goto :goto_6

    :cond_6
    move/from16 v9, p7

    :goto_6
    and-int/lit16 v10, v1, 0x80

    if-eqz v10, :cond_7

    iget v10, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mStep:I

    goto :goto_7

    :cond_7
    move/from16 v10, p8

    :goto_7
    and-int/lit16 v11, v1, 0x100

    if-eqz v11, :cond_8

    iget v11, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mDistance:I

    goto :goto_8

    :cond_8
    move/from16 v11, p9

    :goto_8
    and-int/lit16 v12, v1, 0x200

    if-eqz v12, :cond_9

    iget v12, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mCalorie:I

    goto :goto_9

    :cond_9
    move/from16 v12, p10

    :goto_9
    and-int/lit16 v13, v1, 0x400

    if-eqz v13, :cond_a

    iget v13, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mSpeed:I

    goto :goto_a

    :cond_a
    move/from16 v13, p11

    :goto_a
    and-int/lit16 v14, v1, 0x800

    if-eqz v14, :cond_b

    iget v14, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mPace:I

    goto :goto_b

    :cond_b
    move/from16 v14, p12

    :goto_b
    and-int/lit16 v15, v1, 0x1000

    if-eqz v15, :cond_c

    iget v15, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mAvgBpm:I

    goto :goto_c

    :cond_c
    move/from16 v15, p13

    :goto_c
    move/from16 p1, v3

    and-int/lit16 v3, v1, 0x2000

    if-eqz v3, :cond_d

    iget v3, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxBpm:I

    goto :goto_d

    :cond_d
    move/from16 v3, p14

    :goto_d
    move/from16 p2, v3

    and-int/lit16 v3, v1, 0x4000

    if-eqz v3, :cond_e

    iget v3, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mMinBpm:I

    goto :goto_e

    :cond_e
    move/from16 v3, p15

    :goto_e
    const v16, 0x8000

    and-int v17, v1, v16

    if-eqz v17, :cond_f

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxSpm:I

    goto :goto_f

    :cond_f
    move/from16 v1, p16

    :goto_f
    const/high16 v17, 0x10000

    and-int v18, p61, v17

    move/from16 p3, v1

    if-eqz v18, :cond_10

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mMinSpm:I

    goto :goto_10

    :cond_10
    move/from16 v1, p17

    :goto_10
    const/high16 v18, 0x20000

    and-int v19, p61, v18

    move/from16 p4, v1

    if-eqz v19, :cond_11

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxPace:I

    goto :goto_11

    :cond_11
    move/from16 v1, p18

    :goto_11
    const/high16 v19, 0x40000

    and-int v20, p61, v19

    move/from16 p5, v1

    if-eqz v20, :cond_12

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mMinPace:I

    goto :goto_12

    :cond_12
    move/from16 v1, p19

    :goto_12
    const/high16 v20, 0x80000

    and-int v21, p61, v20

    move/from16 p6, v1

    if-eqz v21, :cond_13

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxAltitude:I

    goto :goto_13

    :cond_13
    move/from16 v1, p20

    :goto_13
    const/high16 v21, 0x100000

    and-int v22, p61, v21

    move/from16 p7, v1

    if-eqz v22, :cond_14

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mMinAltitude:I

    goto :goto_14

    :cond_14
    move/from16 v1, p21

    :goto_14
    const/high16 v22, 0x200000

    and-int v23, p61, v22

    move/from16 p8, v1

    if-eqz v23, :cond_15

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mMinStress:I

    goto :goto_15

    :cond_15
    move/from16 v1, p22

    :goto_15
    const/high16 v23, 0x400000

    and-int v23, p61, v23

    move/from16 p9, v1

    if-eqz v23, :cond_16

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxStress:I

    goto :goto_16

    :cond_16
    move/from16 v1, p23

    :goto_16
    const/high16 v23, 0x800000

    and-int v23, p61, v23

    move/from16 p10, v1

    if-eqz v23, :cond_17

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mAvgStress:I

    goto :goto_17

    :cond_17
    move/from16 v1, p24

    :goto_17
    const/high16 v23, 0x1000000

    and-int v23, p61, v23

    move/from16 p11, v1

    if-eqz v23, :cond_18

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxSpeed:I

    goto :goto_18

    :cond_18
    move/from16 v1, p25

    :goto_18
    const/high16 v23, 0x2000000

    and-int v23, p61, v23

    move/from16 p12, v1

    if-eqz v23, :cond_19

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mMinSpeed:I

    goto :goto_19

    :cond_19
    move/from16 v1, p26

    :goto_19
    const/high16 v23, 0x4000000

    and-int v23, p61, v23

    move/from16 p13, v1

    if-eqz v23, :cond_1a

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mMetTotal:I

    goto :goto_1a

    :cond_1a
    move/from16 v1, p27

    :goto_1a
    const/high16 v23, 0x8000000

    and-int v23, p61, v23

    move/from16 p14, v1

    if-eqz v23, :cond_1b

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mAerobic:F

    goto :goto_1b

    :cond_1b
    move/from16 v1, p28

    :goto_1b
    const/high16 v23, 0x10000000

    and-int v23, p61, v23

    move/from16 p15, v1

    if-eqz v23, :cond_1c

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mAnaerobic:F

    goto :goto_1c

    :cond_1c
    move/from16 v1, p29

    :goto_1c
    const/high16 v23, 0x20000000

    and-int v23, p61, v23

    move/from16 p16, v1

    if-eqz v23, :cond_1d

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mStamina:I

    goto :goto_1d

    :cond_1d
    move/from16 v1, p30

    :goto_1d
    const/high16 v23, 0x40000000    # 2.0f

    and-int v23, p61, v23

    move/from16 p17, v1

    if-eqz v23, :cond_1e

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mAvgSpeed:F

    goto :goto_1e

    :cond_1e
    move/from16 v1, p31

    :goto_1e
    const/high16 v23, -0x80000000

    and-int v23, p61, v23

    move/from16 p18, v1

    if-eqz v23, :cond_1f

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mCadence:I

    goto :goto_1f

    :cond_1f
    move/from16 v1, p32

    :goto_1f
    and-int/lit8 v23, v2, 0x1

    move/from16 p19, v1

    if-eqz v23, :cond_20

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxCadence:I

    goto :goto_20

    :cond_20
    move/from16 v1, p33

    :goto_20
    and-int/lit8 v23, v2, 0x2

    move/from16 p20, v1

    if-eqz v23, :cond_21

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mCnt:I

    goto :goto_21

    :cond_21
    move/from16 v1, p34

    :goto_21
    and-int/lit8 v23, v2, 0x4

    move/from16 p21, v1

    if-eqz v23, :cond_22

    iget-object v1, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mBpmZoneCount:[I

    goto :goto_22

    :cond_22
    move-object/from16 v1, p35

    :goto_22
    and-int/lit8 v23, v2, 0x8

    move-object/from16 p22, v1

    if-eqz v23, :cond_23

    iget-object v1, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mPersonalZone:[I

    goto :goto_23

    :cond_23
    move-object/from16 v1, p36

    :goto_23
    and-int/lit8 v23, v2, 0x10

    move-object/from16 p23, v1

    if-eqz v23, :cond_24

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mLactateThresholdPace:I

    goto :goto_24

    :cond_24
    move/from16 v1, p37

    :goto_24
    and-int/lit8 v23, v2, 0x20

    move/from16 p24, v1

    if-eqz v23, :cond_25

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mRecoveryTime:I

    goto :goto_25

    :cond_25
    move/from16 v1, p38

    :goto_25
    and-int/lit8 v23, v2, 0x40

    move/from16 p25, v1

    if-eqz v23, :cond_26

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mTrainingLoad:I

    goto :goto_26

    :cond_26
    move/from16 v1, p39

    :goto_26
    move/from16 p26, v1

    and-int/lit16 v1, v2, 0x80

    if-eqz v1, :cond_27

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxVO2:I

    goto :goto_27

    :cond_27
    move/from16 v1, p40

    :goto_27
    move/from16 p27, v1

    and-int/lit16 v1, v2, 0x100

    if-eqz v1, :cond_28

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mLactateThresholdHr:I

    goto :goto_28

    :cond_28
    move/from16 v1, p41

    :goto_28
    move/from16 p28, v1

    and-int/lit16 v1, v2, 0x200

    if-eqz v1, :cond_29

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mAlgorithmMarking:I

    goto :goto_29

    :cond_29
    move/from16 v1, p42

    :goto_29
    move/from16 p29, v1

    and-int/lit16 v1, v2, 0x400

    if-eqz v1, :cond_2a

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mPathCount:I

    goto :goto_2a

    :cond_2a
    move/from16 v1, p43

    :goto_2a
    move/from16 p30, v1

    and-int/lit16 v1, v2, 0x800

    if-eqz v1, :cond_2b

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mPathSampleInterval:I

    goto :goto_2b

    :cond_2b
    move/from16 v1, p44

    :goto_2b
    move/from16 p31, v1

    and-int/lit16 v1, v2, 0x1000

    if-eqz v1, :cond_2c

    iget-object v1, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mPathPoints:Ljava/util/List;

    goto :goto_2c

    :cond_2c
    move-object/from16 v1, p45

    :goto_2c
    move-object/from16 p32, v1

    and-int/lit16 v1, v2, 0x2000

    if-eqz v1, :cond_2d

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mHrPathCount:I

    goto :goto_2d

    :cond_2d
    move/from16 v1, p46

    :goto_2d
    move/from16 p33, v1

    and-int/lit16 v1, v2, 0x4000

    if-eqz v1, :cond_2e

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mHrPathSampleInterval:I

    goto :goto_2e

    :cond_2e
    move/from16 v1, p47

    :goto_2e
    and-int v16, v2, v16

    move/from16 p34, v1

    if-eqz v16, :cond_2f

    iget-object v1, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mHrPathPoints:Ljava/util/List;

    goto :goto_2f

    :cond_2f
    move-object/from16 v1, p48

    :goto_2f
    and-int v16, v2, v17

    move-object/from16 p35, v1

    if-eqz v16, :cond_30

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mPacePathCount:I

    goto :goto_30

    :cond_30
    move/from16 v1, p49

    :goto_30
    and-int v16, v2, v18

    move/from16 p36, v1

    if-eqz v16, :cond_31

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mPacePathSampleInterval:I

    goto :goto_31

    :cond_31
    move/from16 v1, p50

    :goto_31
    and-int v16, v2, v19

    move/from16 p37, v1

    if-eqz v16, :cond_32

    iget-object v1, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mPacePathPoints:Ljava/util/List;

    goto :goto_32

    :cond_32
    move-object/from16 v1, p51

    :goto_32
    and-int v16, v2, v20

    move-object/from16 p38, v1

    if-eqz v16, :cond_33

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mSpeedPathCount:I

    goto :goto_33

    :cond_33
    move/from16 v1, p52

    :goto_33
    and-int v16, v2, v21

    move/from16 p39, v1

    if-eqz v16, :cond_34

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mSpeedPathSampleInterval:I

    goto :goto_34

    :cond_34
    move/from16 v1, p53

    :goto_34
    and-int v16, v2, v22

    move/from16 p40, v1

    if-eqz v16, :cond_35

    iget-object v1, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mSpeedPathPoints:Ljava/util/List;

    goto :goto_35

    :cond_35
    move-object/from16 v1, p54

    :goto_35
    const/high16 v16, 0x400000

    and-int v16, v2, v16

    move-object/from16 p41, v1

    if-eqz v16, :cond_36

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mCadencePathCount:I

    goto :goto_36

    :cond_36
    move/from16 v1, p55

    :goto_36
    const/high16 v16, 0x800000

    and-int v16, v2, v16

    move/from16 p42, v1

    if-eqz v16, :cond_37

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mCadencePathSampleInterval:I

    goto :goto_37

    :cond_37
    move/from16 v1, p56

    :goto_37
    const/high16 v16, 0x1000000

    and-int v16, v2, v16

    move/from16 p43, v1

    if-eqz v16, :cond_38

    iget-object v1, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mCadencePathPoints:Ljava/util/List;

    goto :goto_38

    :cond_38
    move-object/from16 v1, p57

    :goto_38
    const/high16 v16, 0x2000000

    and-int v16, v2, v16

    move-object/from16 p44, v1

    if-eqz v16, :cond_39

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mAltitudePathCount:I

    goto :goto_39

    :cond_39
    move/from16 v1, p58

    :goto_39
    const/high16 v16, 0x4000000

    and-int v16, v2, v16

    move/from16 p45, v1

    if-eqz v16, :cond_3a

    iget v1, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mAltitudePathSampleInterval:I

    goto :goto_3a

    :cond_3a
    move/from16 v1, p59

    :goto_3a
    const/high16 v16, 0x8000000

    and-int v2, v2, v16

    if-eqz v2, :cond_3b

    iget-object v2, v0, Lcom/szabh/smable3/entity/BleWorkout3;->mAltitudePathPoints:Ljava/util/List;

    move-object/from16 p61, v2

    :goto_3b
    move-object/from16 p46, p32

    move/from16 p47, p33

    move/from16 p48, p34

    move-object/from16 p49, p35

    move/from16 p50, p36

    move/from16 p51, p37

    move-object/from16 p52, p38

    move/from16 p53, p39

    move/from16 p54, p40

    move-object/from16 p55, p41

    move/from16 p56, p42

    move/from16 p57, p43

    move-object/from16 p58, p44

    move/from16 p59, p45

    move/from16 p60, v1

    move/from16 p32, p18

    move/from16 p33, p19

    move/from16 p34, p20

    move/from16 p35, p21

    move-object/from16 p36, p22

    move-object/from16 p37, p23

    move/from16 p38, p24

    move/from16 p39, p25

    move/from16 p40, p26

    move/from16 p41, p27

    move/from16 p42, p28

    move/from16 p43, p29

    move/from16 p44, p30

    move/from16 p45, p31

    move/from16 p18, p4

    move/from16 p19, p5

    move/from16 p20, p6

    move/from16 p21, p7

    move/from16 p22, p8

    move/from16 p23, p9

    move/from16 p24, p10

    move/from16 p25, p11

    move/from16 p26, p12

    move/from16 p27, p13

    move/from16 p28, p14

    move/from16 p29, p15

    move/from16 p30, p16

    move/from16 p31, p17

    move/from16 p16, v3

    move/from16 p4, v5

    move/from16 p5, v6

    move/from16 p6, v7

    move/from16 p7, v8

    move/from16 p8, v9

    move/from16 p9, v10

    move/from16 p10, v11

    move/from16 p11, v12

    move/from16 p12, v13

    move/from16 p13, v14

    move/from16 p14, v15

    move/from16 p15, p2

    move/from16 p17, p3

    move/from16 p3, v4

    move/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_3c

    :cond_3b
    move-object/from16 p61, p60

    goto :goto_3b

    :goto_3c
    invoke-virtual/range {p1 .. p61}, Lcom/szabh/smable3/entity/BleWorkout3;->copy(IIIIIIIIIIIIIIIIIIIIIIIIIIIFFIFIII[I[IIIIIIIIILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;)Lcom/szabh/smable3/entity/BleWorkout3;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mStart:I

    return v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mCalorie:I

    return v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mSpeed:I

    return v0
.end method

.method public final component12()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPace:I

    return v0
.end method

.method public final component13()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAvgBpm:I

    return v0
.end method

.method public final component14()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxBpm:I

    return v0
.end method

.method public final component15()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMinBpm:I

    return v0
.end method

.method public final component16()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxSpm:I

    return v0
.end method

.method public final component17()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMinSpm:I

    return v0
.end method

.method public final component18()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxPace:I

    return v0
.end method

.method public final component19()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMinPace:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mEnd:I

    return v0
.end method

.method public final component20()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxAltitude:I

    return v0
.end method

.method public final component21()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMinAltitude:I

    return v0
.end method

.method public final component22()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMinStress:I

    return v0
.end method

.method public final component23()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxStress:I

    return v0
.end method

.method public final component24()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAvgStress:I

    return v0
.end method

.method public final component25()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxSpeed:I

    return v0
.end method

.method public final component26()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMinSpeed:I

    return v0
.end method

.method public final component27()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMetTotal:I

    return v0
.end method

.method public final component28()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAerobic:F

    return v0
.end method

.method public final component29()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAnaerobic:F

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mDuration:I

    return v0
.end method

.method public final component30()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mStamina:I

    return v0
.end method

.method public final component31()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAvgSpeed:F

    return v0
.end method

.method public final component32()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mCadence:I

    return v0
.end method

.method public final component33()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxCadence:I

    return v0
.end method

.method public final component34()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mCnt:I

    return v0
.end method

.method public final component35()[I
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mBpmZoneCount:[I

    return-object v0
.end method

.method public final component36()[I
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPersonalZone:[I

    return-object v0
.end method

.method public final component37()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mLactateThresholdPace:I

    return v0
.end method

.method public final component38()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mRecoveryTime:I

    return v0
.end method

.method public final component39()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mTrainingLoad:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAltitude:I

    return v0
.end method

.method public final component40()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxVO2:I

    return v0
.end method

.method public final component41()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mLactateThresholdHr:I

    return v0
.end method

.method public final component42()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAlgorithmMarking:I

    return v0
.end method

.method public final component43()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPathCount:I

    return v0
.end method

.method public final component44()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPathSampleInterval:I

    return v0
.end method

.method public final component45()Ljava/util/List;
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

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPathPoints:Ljava/util/List;

    return-object v0
.end method

.method public final component46()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mHrPathCount:I

    return v0
.end method

.method public final component47()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mHrPathSampleInterval:I

    return v0
.end method

.method public final component48()Ljava/util/List;
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

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mHrPathPoints:Ljava/util/List;

    return-object v0
.end method

.method public final component49()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPacePathCount:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAirPressure:I

    return v0
.end method

.method public final component50()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPacePathSampleInterval:I

    return v0
.end method

.method public final component51()Ljava/util/List;
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

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPacePathPoints:Ljava/util/List;

    return-object v0
.end method

.method public final component52()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mSpeedPathCount:I

    return v0
.end method

.method public final component53()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mSpeedPathSampleInterval:I

    return v0
.end method

.method public final component54()Ljava/util/List;
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

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mSpeedPathPoints:Ljava/util/List;

    return-object v0
.end method

.method public final component55()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mCadencePathCount:I

    return v0
.end method

.method public final component56()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mCadencePathSampleInterval:I

    return v0
.end method

.method public final component57()Ljava/util/List;
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

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mCadencePathPoints:Ljava/util/List;

    return-object v0
.end method

.method public final component58()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAltitudePathCount:I

    return v0
.end method

.method public final component59()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAltitudePathSampleInterval:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mSpm:I

    return v0
.end method

.method public final component60()Ljava/util/List;
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

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAltitudePathPoints:Ljava/util/List;

    return-object v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMode:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mStep:I

    return v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mDistance:I

    return v0
.end method

.method public final copy(IIIIIIIIIIIIIIIIIIIIIIIIIIIFFIFIII[I[IIIIIIIIILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;)Lcom/szabh/smable3/entity/BleWorkout3;
    .locals 62
    .param p35    # [I
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p36    # [I
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p45    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p48    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p51    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p54    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p57    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p60    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIIIIIIIIIIIIIIIIIIIIIIIIIIFFIFIII[I[IIIIIIIII",
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
            ">;)",
            "Lcom/szabh/smable3/entity/BleWorkout3;"
        }
    .end annotation

    const-string v0, "mBpmZoneCount"

    move-object/from16 v1, p35

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mPersonalZone"

    move-object/from16 v2, p36

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mPathPoints"

    move-object/from16 v3, p45

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mHrPathPoints"

    move-object/from16 v4, p48

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mPacePathPoints"

    move-object/from16 v5, p51

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mSpeedPathPoints"

    move-object/from16 v6, p54

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mCadencePathPoints"

    move-object/from16 v7, p57

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mAltitudePathPoints"

    move-object/from16 v8, p60

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/szabh/smable3/entity/BleWorkout3;

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

    move/from16 v34, p33

    move/from16 v35, p34

    move-object/from16 v36, p35

    move/from16 v38, p37

    move/from16 v39, p38

    move/from16 v40, p39

    move/from16 v41, p40

    move/from16 v42, p41

    move/from16 v43, p42

    move/from16 v44, p43

    move/from16 v45, p44

    move/from16 v47, p46

    move/from16 v48, p47

    move/from16 v50, p49

    move/from16 v51, p50

    move/from16 v53, p52

    move/from16 v54, p53

    move/from16 v56, p55

    move/from16 v57, p56

    move/from16 v59, p58

    move/from16 v60, p59

    move-object/from16 v37, v2

    move-object/from16 v46, v3

    move-object/from16 v49, v4

    move-object/from16 v52, v5

    move-object/from16 v55, v6

    move-object/from16 v58, v7

    move-object/from16 v61, v8

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    invoke-direct/range {v1 .. v61}, Lcom/szabh/smable3/entity/BleWorkout3;-><init>(IIIIIIIIIIIIIIIIIIIIIIIIIIIFFIFIII[I[IIIIIIIIILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;IILjava/util/List;)V

    return-object v1
.end method

.method public decode()V
    .locals 8

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)I

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mStart:I

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)I

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mEnd:I

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt16$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)C

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mDuration:I

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)S

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAltitude:I

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt16$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)C

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAirPressure:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mSpm:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMode:I

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)I

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mStep:I

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)I

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mDistance:I

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)I

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mCalorie:I

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)I

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mSpeed:I

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)I

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPace:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAvgBpm:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxBpm:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMinBpm:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)S

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxSpm:I

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)S

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMinSpm:I

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)I

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxPace:I

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)I

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMinPace:I

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)S

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxAltitude:I

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)S

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMinAltitude:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMinStress:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxStress:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAvgStress:I

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)I

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxSpeed:I

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)I

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMinSpeed:I

    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v2, "LITTLE_ENDIAN"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v3

    iput v3, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMetTotal:I

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v3

    iput v3, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAerobic:F

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v3

    iput v3, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAnaerobic:F

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v3

    iput v3, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mStamina:I

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v3

    iput v3, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAvgSpeed:F

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt16(Ljava/nio/ByteOrder;)C

    move-result v3

    iput v3, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mCadence:I

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt16(Ljava/nio/ByteOrder;)C

    move-result v3

    iput v3, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxCadence:I

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mCnt:I

    const/4 v0, 0x0

    move v3, v0

    :goto_0
    const/4 v4, 0x5

    if-ge v3, v4, :cond_0

    iget-object v4, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mBpmZoneCount:[I

    sget-object v5, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v5}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt16(Ljava/nio/ByteOrder;)C

    move-result v5

    aput v5, v4, v3

    add-int/2addr v3, v1

    goto :goto_0

    :cond_0
    move v3, v0

    :goto_1
    if-ge v3, v4, :cond_1

    iget-object v5, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPersonalZone:[I

    sget-object v6, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v6}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt16(Ljava/nio/ByteOrder;)C

    move-result v6

    aput v6, v5, v3

    add-int/2addr v3, v1

    goto :goto_1

    :cond_1
    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v3}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mLactateThresholdPace:I

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v3}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mRecoveryTime:I

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v3}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt16(Ljava/nio/ByteOrder;)C

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mTrainingLoad:I

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v3}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt16(Ljava/nio/ByteOrder;)C

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxVO2:I

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v3}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mLactateThresholdHr:I

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v3}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt16(Ljava/nio/ByteOrder;)C

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAlgorithmMarking:I

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v3}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPathCount:I

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v3}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v3

    iput v3, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPathSampleInterval:I

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    move v4, v0

    :goto_2
    const/16 v5, 0x20

    if-ge v4, v5, :cond_2

    sget-object v5, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v5}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v6

    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v5}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v5

    const/4 v7, 0x2

    new-array v7, v7, [F

    aput v6, v7, v0

    aput v5, v7, v1

    invoke-interface {v3, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/2addr v4, v1

    goto :goto_2

    :cond_2
    iget v4, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPathCount:I

    invoke-static {v3, v4}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IO0OOi(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v3

    iput-object v3, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPathPoints:Ljava/util/List;

    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v3}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mHrPathCount:I

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v3}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v3

    iput v3, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mHrPathSampleInterval:I

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    move v4, v0

    :goto_3
    if-ge v4, v5, :cond_3

    sget-object v6, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v6}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/2addr v4, v1

    goto :goto_3

    :cond_3
    iget v4, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mHrPathCount:I

    invoke-static {v3, v4}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IO0OOi(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v3

    iput-object v3, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mHrPathPoints:Ljava/util/List;

    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v3}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPacePathCount:I

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v3}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v3

    iput v3, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPacePathSampleInterval:I

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    move v4, v0

    :goto_4
    if-ge v4, v5, :cond_4

    sget-object v6, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v6}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/2addr v4, v1

    goto :goto_4

    :cond_4
    iget v4, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPacePathCount:I

    invoke-static {v3, v4}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IO0OOi(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v3

    iput-object v3, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPacePathPoints:Ljava/util/List;

    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v3}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mSpeedPathCount:I

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v3}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v3

    iput v3, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mSpeedPathSampleInterval:I

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    move v4, v0

    :goto_5
    if-ge v4, v5, :cond_5

    sget-object v6, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v6}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/2addr v4, v1

    goto :goto_5

    :cond_5
    iget v4, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mSpeedPathCount:I

    invoke-static {v3, v4}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IO0OOi(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v3

    iput-object v3, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mSpeedPathPoints:Ljava/util/List;

    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v3}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mCadencePathCount:I

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v3}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v3

    iput v3, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mCadencePathSampleInterval:I

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    move v4, v0

    :goto_6
    if-ge v4, v5, :cond_6

    sget-object v6, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v6}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/2addr v4, v1

    goto :goto_6

    :cond_6
    iget v4, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mCadencePathCount:I

    invoke-static {v3, v4}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IO0OOi(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v3

    iput-object v3, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mCadencePathPoints:Ljava/util/List;

    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v3}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v4

    iput v4, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAltitudePathCount:I

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v3}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v3

    iput v3, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAltitudePathSampleInterval:I

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    :goto_7
    if-ge v0, v5, :cond_7

    sget-object v4, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/2addr v0, v1

    goto :goto_7

    :cond_7
    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAltitudePathCount:I

    invoke-static {v3, v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IO0OOi(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAltitudePathPoints:Ljava/util/List;

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleWorkout3;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleWorkout3;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mStart:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mStart:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mEnd:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mEnd:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mDuration:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mDuration:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAltitude:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mAltitude:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAirPressure:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mAirPressure:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mSpm:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mSpm:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMode:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mMode:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mStep:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mStep:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mDistance:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mDistance:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mCalorie:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mCalorie:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mSpeed:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mSpeed:I

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPace:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mPace:I

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAvgBpm:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mAvgBpm:I

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxBpm:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxBpm:I

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMinBpm:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mMinBpm:I

    if-eq v1, v3, :cond_10

    return v2

    :cond_10
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxSpm:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxSpm:I

    if-eq v1, v3, :cond_11

    return v2

    :cond_11
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMinSpm:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mMinSpm:I

    if-eq v1, v3, :cond_12

    return v2

    :cond_12
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxPace:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxPace:I

    if-eq v1, v3, :cond_13

    return v2

    :cond_13
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMinPace:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mMinPace:I

    if-eq v1, v3, :cond_14

    return v2

    :cond_14
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxAltitude:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxAltitude:I

    if-eq v1, v3, :cond_15

    return v2

    :cond_15
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMinAltitude:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mMinAltitude:I

    if-eq v1, v3, :cond_16

    return v2

    :cond_16
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMinStress:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mMinStress:I

    if-eq v1, v3, :cond_17

    return v2

    :cond_17
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxStress:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxStress:I

    if-eq v1, v3, :cond_18

    return v2

    :cond_18
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAvgStress:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mAvgStress:I

    if-eq v1, v3, :cond_19

    return v2

    :cond_19
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxSpeed:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxSpeed:I

    if-eq v1, v3, :cond_1a

    return v2

    :cond_1a
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMinSpeed:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mMinSpeed:I

    if-eq v1, v3, :cond_1b

    return v2

    :cond_1b
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMetTotal:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mMetTotal:I

    if-eq v1, v3, :cond_1c

    return v2

    :cond_1c
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAerobic:F

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mAerobic:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_1d

    return v2

    :cond_1d
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAnaerobic:F

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mAnaerobic:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_1e

    return v2

    :cond_1e
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mStamina:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mStamina:I

    if-eq v1, v3, :cond_1f

    return v2

    :cond_1f
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAvgSpeed:F

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mAvgSpeed:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_20

    return v2

    :cond_20
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mCadence:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mCadence:I

    if-eq v1, v3, :cond_21

    return v2

    :cond_21
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxCadence:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxCadence:I

    if-eq v1, v3, :cond_22

    return v2

    :cond_22
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mCnt:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mCnt:I

    if-eq v1, v3, :cond_23

    return v2

    :cond_23
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mBpmZoneCount:[I

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mBpmZoneCount:[I

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_24

    return v2

    :cond_24
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPersonalZone:[I

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mPersonalZone:[I

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_25

    return v2

    :cond_25
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mLactateThresholdPace:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mLactateThresholdPace:I

    if-eq v1, v3, :cond_26

    return v2

    :cond_26
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mRecoveryTime:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mRecoveryTime:I

    if-eq v1, v3, :cond_27

    return v2

    :cond_27
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mTrainingLoad:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mTrainingLoad:I

    if-eq v1, v3, :cond_28

    return v2

    :cond_28
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxVO2:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxVO2:I

    if-eq v1, v3, :cond_29

    return v2

    :cond_29
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mLactateThresholdHr:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mLactateThresholdHr:I

    if-eq v1, v3, :cond_2a

    return v2

    :cond_2a
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAlgorithmMarking:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mAlgorithmMarking:I

    if-eq v1, v3, :cond_2b

    return v2

    :cond_2b
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPathCount:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mPathCount:I

    if-eq v1, v3, :cond_2c

    return v2

    :cond_2c
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPathSampleInterval:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mPathSampleInterval:I

    if-eq v1, v3, :cond_2d

    return v2

    :cond_2d
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPathPoints:Ljava/util/List;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mPathPoints:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2e

    return v2

    :cond_2e
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mHrPathCount:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mHrPathCount:I

    if-eq v1, v3, :cond_2f

    return v2

    :cond_2f
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mHrPathSampleInterval:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mHrPathSampleInterval:I

    if-eq v1, v3, :cond_30

    return v2

    :cond_30
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mHrPathPoints:Ljava/util/List;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mHrPathPoints:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_31

    return v2

    :cond_31
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPacePathCount:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mPacePathCount:I

    if-eq v1, v3, :cond_32

    return v2

    :cond_32
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPacePathSampleInterval:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mPacePathSampleInterval:I

    if-eq v1, v3, :cond_33

    return v2

    :cond_33
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPacePathPoints:Ljava/util/List;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mPacePathPoints:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_34

    return v2

    :cond_34
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mSpeedPathCount:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mSpeedPathCount:I

    if-eq v1, v3, :cond_35

    return v2

    :cond_35
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mSpeedPathSampleInterval:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mSpeedPathSampleInterval:I

    if-eq v1, v3, :cond_36

    return v2

    :cond_36
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mSpeedPathPoints:Ljava/util/List;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mSpeedPathPoints:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_37

    return v2

    :cond_37
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mCadencePathCount:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mCadencePathCount:I

    if-eq v1, v3, :cond_38

    return v2

    :cond_38
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mCadencePathSampleInterval:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mCadencePathSampleInterval:I

    if-eq v1, v3, :cond_39

    return v2

    :cond_39
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mCadencePathPoints:Ljava/util/List;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mCadencePathPoints:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3a

    return v2

    :cond_3a
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAltitudePathCount:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mAltitudePathCount:I

    if-eq v1, v3, :cond_3b

    return v2

    :cond_3b
    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAltitudePathSampleInterval:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mAltitudePathSampleInterval:I

    if-eq v1, v3, :cond_3c

    return v2

    :cond_3c
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAltitudePathPoints:Ljava/util/List;

    iget-object p1, p1, Lcom/szabh/smable3/entity/BleWorkout3;->mAltitudePathPoints:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3d

    return v2

    :cond_3d
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

.method public final getMAerobic()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAerobic:F

    return v0
.end method

.method public final getMAirPressure()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAirPressure:I

    return v0
.end method

.method public final getMAlgorithmMarking()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAlgorithmMarking:I

    return v0
.end method

.method public final getMAltitude()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAltitude:I

    return v0
.end method

.method public final getMAltitudePathCount()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAltitudePathCount:I

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

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAltitudePathPoints:Ljava/util/List;

    return-object v0
.end method

.method public final getMAltitudePathSampleInterval()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAltitudePathSampleInterval:I

    return v0
.end method

.method public final getMAnaerobic()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAnaerobic:F

    return v0
.end method

.method public final getMAvgBpm()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAvgBpm:I

    return v0
.end method

.method public final getMAvgSpeed()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAvgSpeed:F

    return v0
.end method

.method public final getMAvgStress()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAvgStress:I

    return v0
.end method

.method public final getMBpmZoneCount()[I
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mBpmZoneCount:[I

    return-object v0
.end method

.method public final getMCadence()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mCadence:I

    return v0
.end method

.method public final getMCadencePathCount()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mCadencePathCount:I

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

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mCadencePathPoints:Ljava/util/List;

    return-object v0
.end method

.method public final getMCadencePathSampleInterval()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mCadencePathSampleInterval:I

    return v0
.end method

.method public final getMCalorie()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mCalorie:I

    return v0
.end method

.method public final getMCnt()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mCnt:I

    return v0
.end method

.method public final getMDistance()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mDistance:I

    return v0
.end method

.method public final getMDuration()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mDuration:I

    return v0
.end method

.method public final getMEnd()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mEnd:I

    return v0
.end method

.method public final getMHrPathCount()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mHrPathCount:I

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

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mHrPathPoints:Ljava/util/List;

    return-object v0
.end method

.method public final getMHrPathSampleInterval()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mHrPathSampleInterval:I

    return v0
.end method

.method public final getMLactateThresholdHr()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mLactateThresholdHr:I

    return v0
.end method

.method public final getMLactateThresholdPace()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mLactateThresholdPace:I

    return v0
.end method

.method public final getMMaxAltitude()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxAltitude:I

    return v0
.end method

.method public final getMMaxBpm()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxBpm:I

    return v0
.end method

.method public final getMMaxCadence()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxCadence:I

    return v0
.end method

.method public final getMMaxPace()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxPace:I

    return v0
.end method

.method public final getMMaxSpeed()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxSpeed:I

    return v0
.end method

.method public final getMMaxSpm()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxSpm:I

    return v0
.end method

.method public final getMMaxStress()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxStress:I

    return v0
.end method

.method public final getMMaxVO2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxVO2:I

    return v0
.end method

.method public final getMMetTotal()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMetTotal:I

    return v0
.end method

.method public final getMMinAltitude()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMinAltitude:I

    return v0
.end method

.method public final getMMinBpm()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMinBpm:I

    return v0
.end method

.method public final getMMinPace()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMinPace:I

    return v0
.end method

.method public final getMMinSpeed()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMinSpeed:I

    return v0
.end method

.method public final getMMinSpm()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMinSpm:I

    return v0
.end method

.method public final getMMinStress()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMinStress:I

    return v0
.end method

.method public final getMMode()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMode:I

    return v0
.end method

.method public final getMPace()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPace:I

    return v0
.end method

.method public final getMPacePathCount()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPacePathCount:I

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

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPacePathPoints:Ljava/util/List;

    return-object v0
.end method

.method public final getMPacePathSampleInterval()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPacePathSampleInterval:I

    return v0
.end method

.method public final getMPathCount()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPathCount:I

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

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPathPoints:Ljava/util/List;

    return-object v0
.end method

.method public final getMPathSampleInterval()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPathSampleInterval:I

    return v0
.end method

.method public final getMPersonalZone()[I
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPersonalZone:[I

    return-object v0
.end method

.method public final getMRecoveryTime()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mRecoveryTime:I

    return v0
.end method

.method public final getMSpeed()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mSpeed:I

    return v0
.end method

.method public final getMSpeedPathCount()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mSpeedPathCount:I

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

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mSpeedPathPoints:Ljava/util/List;

    return-object v0
.end method

.method public final getMSpeedPathSampleInterval()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mSpeedPathSampleInterval:I

    return v0
.end method

.method public final getMSpm()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mSpm:I

    return v0
.end method

.method public final getMStamina()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mStamina:I

    return v0
.end method

.method public final getMStart()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mStart:I

    return v0
.end method

.method public final getMStep()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mStep:I

    return v0
.end method

.method public final getMTrainingLoad()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mTrainingLoad:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mStart:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mEnd:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mDuration:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAltitude:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAirPressure:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mSpm:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMode:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mStep:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mDistance:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mCalorie:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mSpeed:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPace:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAvgBpm:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxBpm:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMinBpm:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxSpm:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMinSpm:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxPace:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMinPace:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxAltitude:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMinAltitude:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMinStress:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxStress:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAvgStress:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxSpeed:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMinSpeed:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMetTotal:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAerobic:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAnaerobic:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mStamina:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAvgSpeed:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mCadence:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxCadence:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mCnt:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mBpmZoneCount:[I

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPersonalZone:[I

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mLactateThresholdPace:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mRecoveryTime:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mTrainingLoad:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxVO2:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mLactateThresholdHr:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAlgorithmMarking:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPathCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPathSampleInterval:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPathPoints:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mHrPathCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mHrPathSampleInterval:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mHrPathPoints:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPacePathCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPacePathSampleInterval:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPacePathPoints:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mSpeedPathCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mSpeedPathSampleInterval:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mSpeedPathPoints:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mCadencePathCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mCadencePathSampleInterval:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mCadencePathPoints:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAltitudePathCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAltitudePathSampleInterval:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAltitudePathPoints:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMAerobic(F)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAerobic:F

    return-void
.end method

.method public final setMAirPressure(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAirPressure:I

    return-void
.end method

.method public final setMAlgorithmMarking(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAlgorithmMarking:I

    return-void
.end method

.method public final setMAltitude(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAltitude:I

    return-void
.end method

.method public final setMAltitudePathCount(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAltitudePathCount:I

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

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAltitudePathPoints:Ljava/util/List;

    return-void
.end method

.method public final setMAltitudePathSampleInterval(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAltitudePathSampleInterval:I

    return-void
.end method

.method public final setMAnaerobic(F)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAnaerobic:F

    return-void
.end method

.method public final setMAvgBpm(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAvgBpm:I

    return-void
.end method

.method public final setMAvgSpeed(F)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAvgSpeed:F

    return-void
.end method

.method public final setMAvgStress(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAvgStress:I

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

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mBpmZoneCount:[I

    return-void
.end method

.method public final setMCadence(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mCadence:I

    return-void
.end method

.method public final setMCadencePathCount(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mCadencePathCount:I

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

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mCadencePathPoints:Ljava/util/List;

    return-void
.end method

.method public final setMCadencePathSampleInterval(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mCadencePathSampleInterval:I

    return-void
.end method

.method public final setMCalorie(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mCalorie:I

    return-void
.end method

.method public final setMCnt(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mCnt:I

    return-void
.end method

.method public final setMDistance(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mDistance:I

    return-void
.end method

.method public final setMDuration(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mDuration:I

    return-void
.end method

.method public final setMEnd(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mEnd:I

    return-void
.end method

.method public final setMHrPathCount(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mHrPathCount:I

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

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mHrPathPoints:Ljava/util/List;

    return-void
.end method

.method public final setMHrPathSampleInterval(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mHrPathSampleInterval:I

    return-void
.end method

.method public final setMLactateThresholdHr(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mLactateThresholdHr:I

    return-void
.end method

.method public final setMLactateThresholdPace(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mLactateThresholdPace:I

    return-void
.end method

.method public final setMMaxAltitude(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxAltitude:I

    return-void
.end method

.method public final setMMaxBpm(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxBpm:I

    return-void
.end method

.method public final setMMaxCadence(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxCadence:I

    return-void
.end method

.method public final setMMaxPace(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxPace:I

    return-void
.end method

.method public final setMMaxSpeed(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxSpeed:I

    return-void
.end method

.method public final setMMaxSpm(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxSpm:I

    return-void
.end method

.method public final setMMaxStress(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxStress:I

    return-void
.end method

.method public final setMMaxVO2(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxVO2:I

    return-void
.end method

.method public final setMMetTotal(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMetTotal:I

    return-void
.end method

.method public final setMMinAltitude(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMinAltitude:I

    return-void
.end method

.method public final setMMinBpm(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMinBpm:I

    return-void
.end method

.method public final setMMinPace(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMinPace:I

    return-void
.end method

.method public final setMMinSpeed(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMinSpeed:I

    return-void
.end method

.method public final setMMinSpm(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMinSpm:I

    return-void
.end method

.method public final setMMinStress(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMinStress:I

    return-void
.end method

.method public final setMMode(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMode:I

    return-void
.end method

.method public final setMPace(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPace:I

    return-void
.end method

.method public final setMPacePathCount(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPacePathCount:I

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

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPacePathPoints:Ljava/util/List;

    return-void
.end method

.method public final setMPacePathSampleInterval(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPacePathSampleInterval:I

    return-void
.end method

.method public final setMPathCount(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPathCount:I

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

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPathPoints:Ljava/util/List;

    return-void
.end method

.method public final setMPathSampleInterval(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPathSampleInterval:I

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

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPersonalZone:[I

    return-void
.end method

.method public final setMRecoveryTime(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mRecoveryTime:I

    return-void
.end method

.method public final setMSpeed(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mSpeed:I

    return-void
.end method

.method public final setMSpeedPathCount(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mSpeedPathCount:I

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

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mSpeedPathPoints:Ljava/util/List;

    return-void
.end method

.method public final setMSpeedPathSampleInterval(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mSpeedPathSampleInterval:I

    return-void
.end method

.method public final setMSpm(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mSpm:I

    return-void
.end method

.method public final setMStamina(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mStamina:I

    return-void
.end method

.method public final setMStart(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mStart:I

    return-void
.end method

.method public final setMStep(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mStep:I

    return-void
.end method

.method public final setMTrainingLoad(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mTrainingLoad:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleWorkout3(mStart="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mStart:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mEnd="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mEnd:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mDuration:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mAltitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAltitude:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mAirPressure="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAirPressure:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSpm="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mSpm:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mStep="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mStep:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",mDistance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mDuration:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCalorie="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mCalorie:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSpeed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mSpeed:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPace="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPace:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mAvgBpm="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAvgBpm:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMaxBpm="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxBpm:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMinBpm="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMinBpm:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMaxSpm="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxSpm:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMinSpm="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMinSpm:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMaxPace="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxPace:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "  mMinPace="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMinPace:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMaxAltitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxAltitude:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMinAltitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMinAltitude:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMinStress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMinStress:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMaxStress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxStress:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mAvgStress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAvgStress:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMaxSpeed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxSpeed:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMinSpeed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMinSpeed:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " , mMetTotal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMetTotal:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mAerobic="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAerobic:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mAnaerobic="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAnaerobic:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mStamina="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mStamina:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mAvgSpeed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAvgSpeed:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mCadence="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mCadence:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMaxCadence="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxCadence:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCnt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mCnt:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " mBpmZoneCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mBpmZoneCount:[I

    invoke-static {v1}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "toString(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mPersonalZone="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPersonalZone:[I

    invoke-static {v1}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mLactateThresholdPace="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mLactateThresholdPace:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mRecoveryTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mRecoveryTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mTrainingLoad="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mTrainingLoad:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMaxVO2="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mMaxVO2:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mLactateThresholdHr="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mLactateThresholdHr:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mAlgorithmMarking="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAlgorithmMarking:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",mPathCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPathCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPathSampleInterval="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPathSampleInterval:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPathPoints="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPathPoints:Ljava/util/List;

    invoke-virtual {p0, v1}, Lcom/szabh/smable3/entity/BleWorkout3;->floatArrayListToString(Ljava/util/List;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mHrPathCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mHrPathCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mHrPathSampleInterval="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mHrPathSampleInterval:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mHrPathPoints="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mHrPathPoints:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " mPacePathCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPacePathCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPacePathSampleInterval="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPacePathSampleInterval:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPacePathPoints="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mPacePathPoints:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " mSpeedPathCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mSpeedPathCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSpeedPathSampleInterval="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mSpeedPathSampleInterval:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSpeedPathPoints="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mSpeedPathPoints:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "  mCadencePathCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mCadencePathCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCadencePathSampleInterval="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mCadencePathSampleInterval:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",mCadencePathPoints="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mCadencePathPoints:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mAltitudePathCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAltitudePathCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mAltitudePathSampleInterval="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAltitudePathSampleInterval:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",mAltitudePathPoints="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWorkout3;->mAltitudePathPoints:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
