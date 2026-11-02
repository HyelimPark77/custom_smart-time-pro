.class public final Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBleAICoachPlanV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleAICoachPlanV2.kt\ncom/szabh/smable3/entity/BleAICoachGeneratePlanV2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,327:1\n1563#2:328\n1634#2,3:329\n222#3,4:332\n222#3,4:336\n*S KotlinDebug\n*F\n+ 1 BleAICoachPlanV2.kt\ncom/szabh/smable3/entity/BleAICoachGeneratePlanV2\n*L\n142#1:328\n142#1:329,3\n164#1:332,4\n170#1:336,4\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBleAICoachPlanV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleAICoachPlanV2.kt\ncom/szabh/smable3/entity/BleAICoachGeneratePlanV2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,327:1\n1563#2:328\n1634#2,3:329\n222#3,4:332\n222#3,4:336\n*S KotlinDebug\n*F\n+ 1 BleAICoachPlanV2.kt\ncom/szabh/smable3/entity/BleAICoachGeneratePlanV2\n*L\n142#1:328\n142#1:329,3\n164#1:332,4\n170#1:336,4\n*E\n"
    }
.end annotation


# instance fields
.field private mAICoachType:I

.field private mCalorie:I

.field private mCompletionMark:Ljava/util/List;
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

.field private mCourses:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;",
            ">;"
        }
    .end annotation
.end field

.field private mDistance:F

.field private mHalfHorseEndScore:I

.field private mHalfHorseStartScore:I

.field private mLeaveDayV2:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private mPhysicalFitnessEndTime:F

.field private mPhysicalFitnessStartTime:F

.field private mPlanStartTime:J

.field private mPlanTime:Ljava/util/List;
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

.field private mPlanWeekNum:I

.field private mProgress:I

.field private mVo2MaxEndTime:F

.field private mVo2MaxStartTime:F

.field private mWholeHorseEndScore:I

.field private mWholeHorseStartScore:I


# direct methods
.method public constructor <init>()V
    .locals 22

    .line 1
    const v20, 0x3ffff

    const/16 v21, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

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

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v21}, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;-><init>(IIJLjava/util/List;Ljava/util/List;IIFFFFFIIIILjava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIJLjava/util/List;Ljava/util/List;IIFFFFFIIIILjava/util/List;Ljava/util/List;)V
    .locals 3
    .param p5    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p6    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p18    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p19    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIJ",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;IIFFFFFIIII",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p18

    move-object/from16 v1, p19

    const-string v2, "mPlanTime"

    invoke-static {p5, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "mCompletionMark"

    invoke-static {p6, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "mCourses"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "mLeaveDayV2"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mAICoachType:I

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mPlanWeekNum:I

    .line 5
    iput-wide p3, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mPlanStartTime:J

    .line 6
    iput-object p5, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mPlanTime:Ljava/util/List;

    .line 7
    iput-object p6, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mCompletionMark:Ljava/util/List;

    .line 8
    iput p7, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mProgress:I

    .line 9
    iput p8, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mCalorie:I

    .line 10
    iput p9, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mDistance:F

    .line 11
    iput p10, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mVo2MaxStartTime:F

    .line 12
    iput p11, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mVo2MaxEndTime:F

    .line 13
    iput p12, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mPhysicalFitnessStartTime:F

    move/from16 p1, p13

    .line 14
    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mPhysicalFitnessEndTime:F

    move/from16 p1, p14

    .line 15
    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mHalfHorseStartScore:I

    move/from16 p1, p15

    .line 16
    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mHalfHorseEndScore:I

    move/from16 p1, p16

    .line 17
    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mWholeHorseStartScore:I

    move/from16 p1, p17

    .line 18
    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mWholeHorseEndScore:I

    .line 19
    iput-object v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mCourses:Ljava/util/List;

    .line 20
    iput-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mLeaveDayV2:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(IIJLjava/util/List;Ljava/util/List;IIFFFFFIIIILjava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 19

    move/from16 v0, p20

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    move/from16 v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    const-wide/16 v4, 0x0

    goto :goto_2

    :cond_2
    move-wide/from16 v4, p3

    :goto_2
    and-int/lit8 v6, v0, 0x8

    if-eqz v6, :cond_3

    .line 21
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    goto :goto_3

    :cond_3
    move-object/from16 v6, p5

    :goto_3
    and-int/lit8 v7, v0, 0x10

    if-eqz v7, :cond_4

    .line 22
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    goto :goto_4

    :cond_4
    move-object/from16 v7, p6

    :goto_4
    and-int/lit8 v8, v0, 0x20

    if-eqz v8, :cond_5

    const/4 v8, 0x0

    goto :goto_5

    :cond_5
    move/from16 v8, p7

    :goto_5
    and-int/lit8 v9, v0, 0x40

    if-eqz v9, :cond_6

    const/4 v9, 0x0

    goto :goto_6

    :cond_6
    move/from16 v9, p8

    :goto_6
    and-int/lit16 v10, v0, 0x80

    const/4 v11, 0x0

    if-eqz v10, :cond_7

    move v10, v11

    goto :goto_7

    :cond_7
    move/from16 v10, p9

    :goto_7
    and-int/lit16 v12, v0, 0x100

    if-eqz v12, :cond_8

    move v12, v11

    goto :goto_8

    :cond_8
    move/from16 v12, p10

    :goto_8
    and-int/lit16 v13, v0, 0x200

    if-eqz v13, :cond_9

    move v13, v11

    goto :goto_9

    :cond_9
    move/from16 v13, p11

    :goto_9
    and-int/lit16 v14, v0, 0x400

    if-eqz v14, :cond_a

    move v14, v11

    goto :goto_a

    :cond_a
    move/from16 v14, p12

    :goto_a
    and-int/lit16 v15, v0, 0x800

    if-eqz v15, :cond_b

    goto :goto_b

    :cond_b
    move/from16 v11, p13

    :goto_b
    and-int/lit16 v15, v0, 0x1000

    if-eqz v15, :cond_c

    const/4 v15, 0x0

    goto :goto_c

    :cond_c
    move/from16 v15, p14

    :goto_c
    and-int/lit16 v2, v0, 0x2000

    if-eqz v2, :cond_d

    const/4 v2, 0x0

    goto :goto_d

    :cond_d
    move/from16 v2, p15

    :goto_d
    move/from16 p1, v1

    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_e

    const/4 v1, 0x0

    goto :goto_e

    :cond_e
    move/from16 v1, p16

    :goto_e
    const v16, 0x8000

    and-int v16, v0, v16

    if-eqz v16, :cond_f

    const/16 v16, 0x0

    goto :goto_f

    :cond_f
    move/from16 v16, p17

    :goto_f
    const/high16 v17, 0x10000

    and-int v17, v0, v17

    if-eqz v17, :cond_10

    .line 23
    new-instance v17, Ljava/util/ArrayList;

    invoke-direct/range {v17 .. v17}, Ljava/util/ArrayList;-><init>()V

    goto :goto_10

    :cond_10
    move-object/from16 v17, p18

    :goto_10
    const/high16 v18, 0x20000

    and-int v0, v0, v18

    if-eqz v0, :cond_11

    .line 24
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 p20, v0

    :goto_11
    move/from16 p2, p1

    move/from16 p17, v1

    move/from16 p16, v2

    move/from16 p3, v3

    move-wide/from16 p4, v4

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move/from16 p8, v8

    move/from16 p9, v9

    move/from16 p10, v10

    move/from16 p14, v11

    move/from16 p11, v12

    move/from16 p12, v13

    move/from16 p13, v14

    move/from16 p15, v15

    move/from16 p18, v16

    move-object/from16 p19, v17

    move-object/from16 p1, p0

    goto :goto_12

    :cond_11
    move-object/from16 p20, p19

    goto :goto_11

    .line 25
    :goto_12
    invoke-direct/range {p1 .. p20}, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;-><init>(IIJLjava/util/List;Ljava/util/List;IIFFFFFIIIILjava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;IIJLjava/util/List;Ljava/util/List;IIFFFFFIIIILjava/util/List;Ljava/util/List;ILjava/lang/Object;)Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p20

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget v2, v0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mAICoachType:I

    goto :goto_0

    :cond_0
    move/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget v3, v0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mPlanWeekNum:I

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-wide v4, v0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mPlanStartTime:J

    goto :goto_2

    :cond_2
    move-wide/from16 v4, p3

    :goto_2
    and-int/lit8 v6, v1, 0x8

    if-eqz v6, :cond_3

    iget-object v6, v0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mPlanTime:Ljava/util/List;

    goto :goto_3

    :cond_3
    move-object/from16 v6, p5

    :goto_3
    and-int/lit8 v7, v1, 0x10

    if-eqz v7, :cond_4

    iget-object v7, v0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mCompletionMark:Ljava/util/List;

    goto :goto_4

    :cond_4
    move-object/from16 v7, p6

    :goto_4
    and-int/lit8 v8, v1, 0x20

    if-eqz v8, :cond_5

    iget v8, v0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mProgress:I

    goto :goto_5

    :cond_5
    move/from16 v8, p7

    :goto_5
    and-int/lit8 v9, v1, 0x40

    if-eqz v9, :cond_6

    iget v9, v0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mCalorie:I

    goto :goto_6

    :cond_6
    move/from16 v9, p8

    :goto_6
    and-int/lit16 v10, v1, 0x80

    if-eqz v10, :cond_7

    iget v10, v0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mDistance:F

    goto :goto_7

    :cond_7
    move/from16 v10, p9

    :goto_7
    and-int/lit16 v11, v1, 0x100

    if-eqz v11, :cond_8

    iget v11, v0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mVo2MaxStartTime:F

    goto :goto_8

    :cond_8
    move/from16 v11, p10

    :goto_8
    and-int/lit16 v12, v1, 0x200

    if-eqz v12, :cond_9

    iget v12, v0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mVo2MaxEndTime:F

    goto :goto_9

    :cond_9
    move/from16 v12, p11

    :goto_9
    and-int/lit16 v13, v1, 0x400

    if-eqz v13, :cond_a

    iget v13, v0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mPhysicalFitnessStartTime:F

    goto :goto_a

    :cond_a
    move/from16 v13, p12

    :goto_a
    and-int/lit16 v14, v1, 0x800

    if-eqz v14, :cond_b

    iget v14, v0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mPhysicalFitnessEndTime:F

    goto :goto_b

    :cond_b
    move/from16 v14, p13

    :goto_b
    and-int/lit16 v15, v1, 0x1000

    if-eqz v15, :cond_c

    iget v15, v0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mHalfHorseStartScore:I

    goto :goto_c

    :cond_c
    move/from16 v15, p14

    :goto_c
    move/from16 p1, v2

    and-int/lit16 v2, v1, 0x2000

    if-eqz v2, :cond_d

    iget v2, v0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mHalfHorseEndScore:I

    goto :goto_d

    :cond_d
    move/from16 v2, p15

    :goto_d
    move/from16 p2, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget v2, v0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mWholeHorseStartScore:I

    goto :goto_e

    :cond_e
    move/from16 v2, p16

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget v1, v0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mWholeHorseEndScore:I

    goto :goto_f

    :cond_f
    move/from16 v1, p17

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p20, v16

    move/from16 p3, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mCourses:Ljava/util/List;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p18

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p20, v16

    if-eqz v16, :cond_11

    move-object/from16 p4, v1

    iget-object v1, v0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mLeaveDayV2:Ljava/util/List;

    move-object/from16 p19, p4

    move-object/from16 p20, v1

    :goto_11
    move/from16 p16, p2

    move/from16 p18, p3

    move/from16 p17, v2

    move/from16 p3, v3

    move-wide/from16 p4, v4

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move/from16 p8, v8

    move/from16 p9, v9

    move/from16 p10, v10

    move/from16 p11, v11

    move/from16 p12, v12

    move/from16 p13, v13

    move/from16 p14, v14

    move/from16 p15, v15

    move/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_12

    :cond_11
    move-object/from16 p20, p19

    move-object/from16 p19, v1

    goto :goto_11

    :goto_12
    invoke-virtual/range {p1 .. p20}, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->copy(IIJLjava/util/List;Ljava/util/List;IIFFFFFIIIILjava/util/List;Ljava/util/List;)Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mAICoachType:I

    return v0
.end method

.method public final component10()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mVo2MaxEndTime:F

    return v0
.end method

.method public final component11()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mPhysicalFitnessStartTime:F

    return v0
.end method

.method public final component12()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mPhysicalFitnessEndTime:F

    return v0
.end method

.method public final component13()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mHalfHorseStartScore:I

    return v0
.end method

.method public final component14()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mHalfHorseEndScore:I

    return v0
.end method

.method public final component15()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mWholeHorseStartScore:I

    return v0
.end method

.method public final component16()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mWholeHorseEndScore:I

    return v0
.end method

.method public final component17()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mCourses:Ljava/util/List;

    return-object v0
.end method

.method public final component18()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mLeaveDayV2:Ljava/util/List;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mPlanWeekNum:I

    return v0
.end method

.method public final component3()J
    .locals 2

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mPlanStartTime:J

    return-wide v0
.end method

.method public final component4()Ljava/util/List;
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

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mPlanTime:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Ljava/util/List;
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

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mCompletionMark:Ljava/util/List;

    return-object v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mProgress:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mCalorie:I

    return v0
.end method

.method public final component8()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mDistance:F

    return v0
.end method

.method public final component9()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mVo2MaxStartTime:F

    return v0
.end method

.method public final copy(IIJLjava/util/List;Ljava/util/List;IIFFFFFIIIILjava/util/List;Ljava/util/List;)Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;
    .locals 21
    .param p5    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p6    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p18    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p19    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIJ",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;IIFFFFFIIII",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)",
            "Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;"
        }
    .end annotation

    const-string v0, "mPlanTime"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mCompletionMark"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mCourses"

    move-object/from16 v1, p18

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mLeaveDayV2"

    move-object/from16 v2, p19

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;

    move/from16 v3, p2

    move-wide/from16 v4, p3

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

    move-object/from16 v19, p18

    move-object/from16 v20, v2

    move/from16 v2, p1

    invoke-direct/range {v1 .. v20}, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;-><init>(IIJLjava/util/List;Ljava/util/List;IIFFFFFIIIILjava/util/List;Ljava/util/List;)V

    return-object v1
.end method

.method public decode()V
    .locals 6

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mPlanTime:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    const/16 v2, 0x1c

    const-class v3, Lcom/szabh/smable3/entity/BleWeekPlanTime;

    const/4 v4, 0x4

    if-ge v1, v4, :cond_0

    invoke-virtual {v3}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/bestmafen/baseble/data/BleReadable;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    invoke-virtual {v3}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v3, Lcom/szabh/smable3/entity/BleWeekPlanTime;

    iget-object v4, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mPlanTime:Ljava/util/List;

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleWeekPlanTime;->getMList()[Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/collections/ArraysKt___ArraysKt;->XXiO0([Ljava/lang/Object;I)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v4, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mCompletionMark:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    :goto_1
    if-ge v0, v4, :cond_1

    invoke-virtual {v3}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bestmafen/baseble/data/BleReadable;

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    invoke-virtual {v1}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v1, Lcom/szabh/smable3/entity/BleWeekPlanTime;

    iget-object v5, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mCompletionMark:Ljava/util/List;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWeekPlanTime;->getMList()[Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/collections/ArraysKt___ArraysKt;->XXiO0([Ljava/lang/Object;I)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v5, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v1, "LITTLE_ENDIAN"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16(Ljava/nio/ByteOrder;)S

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mProgress:I

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16(Ljava/nio/ByteOrder;)S

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mCalorie:I

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mDistance:F

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mVo2MaxStartTime:F

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mVo2MaxEndTime:F

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mPhysicalFitnessStartTime:F

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mPhysicalFitnessEndTime:F

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mHalfHorseStartScore:I

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mHalfHorseEndScore:I

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mWholeHorseStartScore:I

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mWholeHorseEndScore:I

    return-void
.end method

.method public encode()V
    .locals 10

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mAICoachType:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mPlanWeekNum:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    sget-object v0, Lcom/szabh/smable3/entity/BleTime;->Companion:Lcom/szabh/smable3/entity/BleTime$Companion;

    iget-wide v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mPlanStartTime:J

    invoke-virtual {v0, v1, v2}, Lcom/szabh/smable3/entity/BleTime$Companion;->ofLocal(J)Lcom/szabh/smable3/entity/BleTime;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeObject(Lcom/bestmafen/baseble/data/BleBuffer;)V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mPlanTime:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    const/16 v1, 0x1c

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->X10i(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    const/4 v4, 0x4

    const/4 v5, 0x2

    const/4 v6, 0x0

    if-ge v3, v4, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    if-le v4, v3, :cond_0

    sget-object v4, Lcom/szabh/smable3/entity/BleWeekPlanTimeV2;->Companion:Lcom/szabh/smable3/entity/BleWeekPlanTimeV2$Companion;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Collection;

    invoke-static {v5}, Lkotlin/collections/CollectionsKt___CollectionsKt;->OO0Oi10(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/szabh/smable3/entity/BleWeekPlanTimeV2$Companion;->ofPlanTime(Ljava/util/List;)Lcom/szabh/smable3/entity/BleWeekPlanTimeV2;

    move-result-object v4

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleWritable;->writeObject(Lcom/bestmafen/baseble/data/BleBuffer;)V

    goto :goto_1

    :cond_0
    invoke-static {p0, v2, v6, v5, v6}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt32$default(Lcom/bestmafen/baseble/data/BleWritable;ILjava/nio/ByteOrder;ILjava/lang/Object;)V

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mCompletionMark:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->X10i(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v0

    move v1, v2

    :goto_2
    if-ge v1, v4, :cond_3

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-le v3, v1, :cond_2

    sget-object v3, Lcom/szabh/smable3/entity/BleWeekPlanTimeV2;->Companion:Lcom/szabh/smable3/entity/BleWeekPlanTimeV2$Companion;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Collection;

    invoke-static {v7}, Lkotlin/collections/CollectionsKt___CollectionsKt;->OO0Oi10(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v7

    invoke-virtual {v3, v7}, Lcom/szabh/smable3/entity/BleWeekPlanTimeV2$Companion;->ofPlanTime(Ljava/util/List;)Lcom/szabh/smable3/entity/BleWeekPlanTimeV2;

    move-result-object v3

    invoke-virtual {p0, v3}, Lcom/bestmafen/baseble/data/BleWritable;->writeObject(Lcom/bestmafen/baseble/data/BleBuffer;)V

    goto :goto_3

    :cond_2
    invoke-static {p0, v2, v6, v5, v6}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt32$default(Lcom/bestmafen/baseble/data/BleWritable;ILjava/nio/ByteOrder;ILjava/lang/Object;)V

    :goto_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_3
    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mProgress:I

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v3, "LITTLE_ENDIAN"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16(ILjava/nio/ByteOrder;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mCalorie:I

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16(ILjava/nio/ByteOrder;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mDistance:F

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeFloat(FLjava/nio/ByteOrder;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mVo2MaxStartTime:F

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeFloat(FLjava/nio/ByteOrder;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mVo2MaxEndTime:F

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeFloat(FLjava/nio/ByteOrder;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mPhysicalFitnessStartTime:F

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeFloat(FLjava/nio/ByteOrder;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mPhysicalFitnessEndTime:F

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeFloat(FLjava/nio/ByteOrder;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mHalfHorseStartScore:I

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt32(ILjava/nio/ByteOrder;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mHalfHorseEndScore:I

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt32(ILjava/nio/ByteOrder;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mWholeHorseStartScore:I

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt32(ILjava/nio/ByteOrder;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mWholeHorseEndScore:I

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt32(ILjava/nio/ByteOrder;)V

    move v0, v2

    :goto_4
    if-ge v0, v4, :cond_5

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mLeaveDayV2:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-le v1, v0, :cond_4

    sget-object v1, Lcom/szabh/smable3/entity/BleTime;->Companion:Lcom/szabh/smable3/entity/BleTime$Companion;

    iget-object v7, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mLeaveDayV2:Ljava/util/List;

    invoke-interface {v7, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->longValue()J

    move-result-wide v7

    invoke-virtual {v1, v7, v8}, Lcom/szabh/smable3/entity/BleTime$Companion;->ofLocal(J)Lcom/szabh/smable3/entity/BleTime;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeObject(Lcom/bestmafen/baseble/data/BleBuffer;)V

    goto :goto_5

    :cond_4
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v2, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16(ILjava/nio/ByteOrder;)V

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v2, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt32(ILjava/nio/ByteOrder;)V

    :goto_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_5
    iget-object v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mCourses:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v0, v4}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v1, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;

    invoke-virtual {v7}, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->getMCourseCode()I

    move-result v8

    invoke-virtual {p0, v8}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    invoke-virtual {v7}, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->getMCourseContentNumber()I

    move-result v8

    invoke-virtual {p0, v8}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    invoke-virtual {v7}, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->getMCourseTime()I

    move-result v8

    sget-object v9, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-static {v9, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v8, v9}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16(ILjava/nio/ByteOrder;)V

    invoke-virtual {v7}, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->getMCourseCalorie()I

    move-result v8

    invoke-static {v9, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v8, v9}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16(ILjava/nio/ByteOrder;)V

    invoke-virtual {v7}, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->getMRepeatNumber()I

    move-result v8

    invoke-virtual {p0, v8}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    invoke-virtual {p0, v2}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    invoke-virtual {v7}, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->getMCoursesContent()Ljava/util/List;

    move-result-object v8

    invoke-virtual {p0, v8}, Lcom/bestmafen/baseble/data/BleWritable;->writeList(Ljava/util/List;)V

    invoke-virtual {v7}, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->getMCourseContentNumber()I

    move-result v7

    rsub-int/lit8 v7, v7, 0xa

    move v8, v2

    :goto_7
    if-ge v8, v7, :cond_6

    invoke-static {p0, v2, v6, v5, v6}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt32$default(Lcom/bestmafen/baseble/data/BleWritable;ILjava/nio/ByteOrder;ILjava/lang/Object;)V

    invoke-static {p0, v2, v6, v5, v6}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt32$default(Lcom/bestmafen/baseble/data/BleWritable;ILjava/nio/ByteOrder;ILjava/lang/Object;)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_7

    :cond_6
    sget-object v7, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-interface {v1, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_7
    return-void
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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mAICoachType:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mAICoachType:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mPlanWeekNum:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mPlanWeekNum:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mPlanStartTime:J

    iget-wide v5, p1, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mPlanStartTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mPlanTime:Ljava/util/List;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mPlanTime:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mCompletionMark:Ljava/util/List;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mCompletionMark:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mProgress:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mProgress:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mCalorie:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mCalorie:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mDistance:F

    iget v3, p1, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mDistance:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mVo2MaxStartTime:F

    iget v3, p1, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mVo2MaxStartTime:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mVo2MaxEndTime:F

    iget v3, p1, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mVo2MaxEndTime:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mPhysicalFitnessStartTime:F

    iget v3, p1, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mPhysicalFitnessStartTime:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_c

    return v2

    :cond_c
    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mPhysicalFitnessEndTime:F

    iget v3, p1, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mPhysicalFitnessEndTime:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_d

    return v2

    :cond_d
    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mHalfHorseStartScore:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mHalfHorseStartScore:I

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mHalfHorseEndScore:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mHalfHorseEndScore:I

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mWholeHorseStartScore:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mWholeHorseStartScore:I

    if-eq v1, v3, :cond_10

    return v2

    :cond_10
    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mWholeHorseEndScore:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mWholeHorseEndScore:I

    if-eq v1, v3, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mCourses:Ljava/util/List;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mCourses:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mLeaveDayV2:Ljava/util/List;

    iget-object p1, p1, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mLeaveDayV2:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_13

    return v2

    :cond_13
    return v0
.end method

.method public final getMAICoachType()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mAICoachType:I

    return v0
.end method

.method public final getMCalorie()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mCalorie:I

    return v0
.end method

.method public final getMCompletionMark()Ljava/util/List;
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

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mCompletionMark:Ljava/util/List;

    return-object v0
.end method

.method public final getMCourses()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mCourses:Ljava/util/List;

    return-object v0
.end method

.method public final getMDistance()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mDistance:F

    return v0
.end method

.method public final getMHalfHorseEndScore()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mHalfHorseEndScore:I

    return v0
.end method

.method public final getMHalfHorseStartScore()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mHalfHorseStartScore:I

    return v0
.end method

.method public final getMLeaveDayV2()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mLeaveDayV2:Ljava/util/List;

    return-object v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    const/16 v0, 0x26e8

    return v0
.end method

.method public final getMPhysicalFitnessEndTime()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mPhysicalFitnessEndTime:F

    return v0
.end method

.method public final getMPhysicalFitnessStartTime()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mPhysicalFitnessStartTime:F

    return v0
.end method

.method public final getMPlanStartTime()J
    .locals 2

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mPlanStartTime:J

    return-wide v0
.end method

.method public final getMPlanTime()Ljava/util/List;
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

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mPlanTime:Ljava/util/List;

    return-object v0
.end method

.method public final getMPlanWeekNum()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mPlanWeekNum:I

    return v0
.end method

.method public final getMProgress()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mProgress:I

    return v0
.end method

.method public final getMVo2MaxEndTime()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mVo2MaxEndTime:F

    return v0
.end method

.method public final getMVo2MaxStartTime()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mVo2MaxStartTime:F

    return v0
.end method

.method public final getMWholeHorseEndScore()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mWholeHorseEndScore:I

    return v0
.end method

.method public final getMWholeHorseStartScore()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mWholeHorseStartScore:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mAICoachType:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mPlanWeekNum:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mPlanStartTime:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mPlanTime:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mCompletionMark:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mProgress:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mCalorie:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mDistance:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mVo2MaxStartTime:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mVo2MaxEndTime:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mPhysicalFitnessStartTime:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mPhysicalFitnessEndTime:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mHalfHorseStartScore:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mHalfHorseEndScore:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mWholeHorseStartScore:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mWholeHorseEndScore:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mCourses:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mLeaveDayV2:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMAICoachType(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mAICoachType:I

    return-void
.end method

.method public final setMCalorie(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mCalorie:I

    return-void
.end method

.method public final setMCompletionMark(Ljava/util/List;)V
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

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mCompletionMark:Ljava/util/List;

    return-void
.end method

.method public final setMCourses(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mCourses:Ljava/util/List;

    return-void
.end method

.method public final setMDistance(F)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mDistance:F

    return-void
.end method

.method public final setMHalfHorseEndScore(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mHalfHorseEndScore:I

    return-void
.end method

.method public final setMHalfHorseStartScore(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mHalfHorseStartScore:I

    return-void
.end method

.method public final setMLeaveDayV2(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mLeaveDayV2:Ljava/util/List;

    return-void
.end method

.method public final setMPhysicalFitnessEndTime(F)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mPhysicalFitnessEndTime:F

    return-void
.end method

.method public final setMPhysicalFitnessStartTime(F)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mPhysicalFitnessStartTime:F

    return-void
.end method

.method public final setMPlanStartTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mPlanStartTime:J

    return-void
.end method

.method public final setMPlanTime(Ljava/util/List;)V
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

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mPlanTime:Ljava/util/List;

    return-void
.end method

.method public final setMPlanWeekNum(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mPlanWeekNum:I

    return-void
.end method

.method public final setMProgress(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mProgress:I

    return-void
.end method

.method public final setMVo2MaxEndTime(F)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mVo2MaxEndTime:F

    return-void
.end method

.method public final setMVo2MaxStartTime(F)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mVo2MaxStartTime:F

    return-void
.end method

.method public final setMWholeHorseEndScore(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mWholeHorseEndScore:I

    return-void
.end method

.method public final setMWholeHorseStartScore(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mWholeHorseStartScore:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleAICoachGeneratePlanV2(mPlanTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mPlanTime:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mCompletionMark="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mCompletionMark:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mPlanWeekNum = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mPlanWeekNum:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",mPlanStartTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mPlanStartTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ",mProgress = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mProgress:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mDistance = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mDistance:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, " , mCalorie = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mCalorie:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " ,mVo2MaxStartTime = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mVo2MaxStartTime:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, " , mVo2MaxEndTime = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mVo2MaxEndTime:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, " , mPhysicalFitnessStartTime = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mPhysicalFitnessStartTime:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, "mPhysicalFitnessEndTime = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mPhysicalFitnessEndTime:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, " , mHalfHorseStartScore = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mHalfHorseStartScore:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",mHalfHorseEndScore = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mHalfHorseEndScore:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " , mWholeHorseStartScore = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mWholeHorseStartScore:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mWholeHorseEndScore = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mWholeHorseEndScore:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " , mCourses="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mCourses:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mLeaveDayV2 = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;->mLeaveDayV2:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
