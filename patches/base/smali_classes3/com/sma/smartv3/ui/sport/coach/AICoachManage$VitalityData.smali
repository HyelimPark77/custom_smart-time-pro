.class public final Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;
.super Lcom/sma/smartv3/model/JsonFieldContainer;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/ui/sport/coach/AICoachManage;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "VitalityData"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAICoachManage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AICoachManage.kt\ncom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,710:1\n1#2:711\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAICoachManage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AICoachManage.kt\ncom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,710:1\n1#2:711\n*E\n"
    }
.end annotation


# instance fields
.field private dailyParameter:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private dailySchedule:Ljava/util/List;
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

.field private dailyTargets:[I
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private generateParameter:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private level:I

.field private mAllCalorie:I

.field private mAllExerciseTime:I

.field private mAll_METS:F

.field private mBeforePlanInfo:Lcom/szabh/smable3/entity/BleAICoachBeforePlan;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

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

.field private mProgress:I

.field private mVitalityDayLesson:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLesson;",
            ">;"
        }
    .end annotation
.end field

.field private planTarget:F

.field private startTime:J

.field private userAge:I

.field private weeklyTargetNumber:I


# direct methods
.method public constructor <init>()V
    .locals 20

    .line 1
    const v18, 0xffff

    const/16 v19, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v19}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;-><init>(FILjava/lang/String;Ljava/lang/String;Ljava/util/List;IJ[ILjava/util/List;Ljava/util/List;IIFILcom/szabh/smable3/entity/BleAICoachBeforePlan;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(FILjava/lang/String;Ljava/lang/String;Ljava/util/List;IJ[ILjava/util/List;Ljava/util/List;IIFILcom/szabh/smable3/entity/BleAICoachBeforePlan;I)V
    .locals 1
    .param p3    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p5    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p9    # [I
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p10    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p11    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p16    # Lcom/szabh/smable3/entity/BleAICoachBeforePlan;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FI",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLesson;",
            ">;IJ[I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;IIFI",
            "Lcom/szabh/smable3/entity/BleAICoachBeforePlan;",
            "I)V"
        }
    .end annotation

    const-string v0, "generateParameter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dailyParameter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dailyTargets"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dailySchedule"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mCompletionMark"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/sma/smartv3/model/JsonFieldContainer;-><init>()V

    .line 3
    iput p1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->planTarget:F

    .line 4
    iput p2, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->level:I

    .line 5
    iput-object p3, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->generateParameter:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->dailyParameter:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mVitalityDayLesson:Ljava/util/List;

    .line 8
    iput p6, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->weeklyTargetNumber:I

    .line 9
    iput-wide p7, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->startTime:J

    .line 10
    iput-object p9, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->dailyTargets:[I

    .line 11
    iput-object p10, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->dailySchedule:Ljava/util/List;

    .line 12
    iput-object p11, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mCompletionMark:Ljava/util/List;

    .line 13
    iput p12, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mProgress:I

    .line 14
    iput p13, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mAllExerciseTime:I

    move p1, p14

    .line 15
    iput p1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mAll_METS:F

    move/from16 p1, p15

    .line 16
    iput p1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mAllCalorie:I

    move-object/from16 p1, p16

    .line 17
    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mBeforePlanInfo:Lcom/szabh/smable3/entity/BleAICoachBeforePlan;

    move/from16 p1, p17

    .line 18
    iput p1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->userAge:I

    return-void
.end method

.method public synthetic constructor <init>(FILjava/lang/String;Ljava/lang/String;Ljava/util/List;IJ[ILjava/util/List;Ljava/util/List;IIFILcom/szabh/smable3/entity/BleAICoachBeforePlan;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 21

    move/from16 v0, p18

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    move/from16 v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    move v3, v4

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v5, v0, 0x4

    .line 19
    const-string v6, ""

    if-eqz v5, :cond_2

    move-object v5, v6

    goto :goto_2

    :cond_2
    move-object/from16 v5, p3

    :goto_2
    and-int/lit8 v7, v0, 0x8

    if-eqz v7, :cond_3

    goto :goto_3

    :cond_3
    move-object/from16 v6, p4

    :goto_3
    and-int/lit8 v7, v0, 0x10

    if-eqz v7, :cond_4

    const/4 v7, 0x0

    goto :goto_4

    :cond_4
    move-object/from16 v7, p5

    :goto_4
    and-int/lit8 v9, v0, 0x20

    const/4 v10, 0x0

    if-eqz v9, :cond_5

    move v9, v10

    goto :goto_5

    :cond_5
    move/from16 v9, p6

    :goto_5
    and-int/lit8 v11, v0, 0x40

    if-eqz v11, :cond_6

    const-wide/16 v11, 0x0

    goto :goto_6

    :cond_6
    move-wide/from16 v11, p7

    :goto_6
    and-int/lit16 v13, v0, 0x80

    if-eqz v13, :cond_7

    const/4 v13, 0x7

    .line 20
    new-array v13, v13, [I

    aput v10, v13, v10

    aput v10, v13, v4

    const/16 v14, 0x25

    const/4 v15, 0x2

    aput v14, v13, v15

    const/4 v14, 0x3

    aput v10, v13, v14

    const/4 v14, 0x4

    const/16 v15, 0x2c

    aput v15, v13, v14

    const/4 v14, 0x5

    aput v15, v13, v14

    const/4 v14, 0x6

    aput v10, v13, v14

    goto :goto_7

    :cond_7
    move-object/from16 v13, p9

    :goto_7
    and-int/lit16 v14, v0, 0x100

    if-eqz v14, :cond_8

    .line 21
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v16

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v17

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v18

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v19

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v20

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    move-object/from16 p8, v4

    move-object/from16 p1, v14

    move-object/from16 p2, v15

    move-object/from16 p3, v16

    move-object/from16 p4, v17

    move-object/from16 p5, v18

    move-object/from16 p6, v19

    move-object/from16 p7, v20

    filled-new-array/range {p1 .. p8}, [Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v4}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    goto :goto_8

    :cond_8
    move-object/from16 v4, p10

    :goto_8
    and-int/lit16 v14, v0, 0x200

    if-eqz v14, :cond_9

    .line 22
    new-instance v14, Ljava/util/ArrayList;

    const/16 v15, 0x20

    invoke-direct {v14, v15}, Ljava/util/ArrayList;-><init>(I)V

    move v2, v10

    :goto_9
    if-ge v2, v15, :cond_a

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v14, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_9

    :cond_9
    move-object/from16 v14, p11

    :cond_a
    and-int/lit16 v2, v0, 0x400

    if-eqz v2, :cond_b

    move v2, v10

    goto :goto_a

    :cond_b
    move/from16 v2, p12

    :goto_a
    and-int/lit16 v8, v0, 0x800

    if-eqz v8, :cond_c

    move v8, v10

    goto :goto_b

    :cond_c
    move/from16 v8, p13

    :goto_b
    and-int/lit16 v15, v0, 0x1000

    if-eqz v15, :cond_d

    const/4 v15, 0x0

    goto :goto_c

    :cond_d
    move/from16 v15, p14

    :goto_c
    and-int/lit16 v10, v0, 0x2000

    if-eqz v10, :cond_e

    const/4 v10, 0x0

    goto :goto_d

    :cond_e
    move/from16 v10, p15

    :goto_d
    move/from16 p19, v1

    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_f

    const/4 v1, 0x0

    goto :goto_e

    :cond_f
    move-object/from16 v1, p16

    :goto_e
    const v16, 0x8000

    and-int v0, v0, v16

    if-eqz v0, :cond_10

    const/16 v0, 0x14

    move/from16 p18, v0

    :goto_f
    move-object/from16 p1, p0

    move/from16 p2, p19

    move-object/from16 p17, v1

    move/from16 p13, v2

    move/from16 p3, v3

    move-object/from16 p11, v4

    move-object/from16 p4, v5

    move-object/from16 p5, v6

    move-object/from16 p6, v7

    move/from16 p14, v8

    move/from16 p7, v9

    move/from16 p16, v10

    move-wide/from16 p8, v11

    move-object/from16 p10, v13

    move-object/from16 p12, v14

    move/from16 p15, v15

    goto :goto_10

    :cond_10
    move/from16 p18, p17

    goto :goto_f

    .line 23
    :goto_10
    invoke-direct/range {p1 .. p18}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;-><init>(FILjava/lang/String;Ljava/lang/String;Ljava/util/List;IJ[ILjava/util/List;Ljava/util/List;IIFILcom/szabh/smable3/entity/BleAICoachBeforePlan;I)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;FILjava/lang/String;Ljava/lang/String;Ljava/util/List;IJ[ILjava/util/List;Ljava/util/List;IIFILcom/szabh/smable3/entity/BleAICoachBeforePlan;IILjava/lang/Object;)Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p18

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget v2, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->planTarget:F

    goto :goto_0

    :cond_0
    move/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget v3, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->level:I

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->generateParameter:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->dailyParameter:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mVitalityDayLesson:Ljava/util/List;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget v7, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->weeklyTargetNumber:I

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-wide v8, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->startTime:J

    goto :goto_6

    :cond_6
    move-wide/from16 v8, p7

    :goto_6
    and-int/lit16 v10, v1, 0x80

    if-eqz v10, :cond_7

    iget-object v10, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->dailyTargets:[I

    goto :goto_7

    :cond_7
    move-object/from16 v10, p9

    :goto_7
    and-int/lit16 v11, v1, 0x100

    if-eqz v11, :cond_8

    iget-object v11, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->dailySchedule:Ljava/util/List;

    goto :goto_8

    :cond_8
    move-object/from16 v11, p10

    :goto_8
    and-int/lit16 v12, v1, 0x200

    if-eqz v12, :cond_9

    iget-object v12, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mCompletionMark:Ljava/util/List;

    goto :goto_9

    :cond_9
    move-object/from16 v12, p11

    :goto_9
    and-int/lit16 v13, v1, 0x400

    if-eqz v13, :cond_a

    iget v13, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mProgress:I

    goto :goto_a

    :cond_a
    move/from16 v13, p12

    :goto_a
    and-int/lit16 v14, v1, 0x800

    if-eqz v14, :cond_b

    iget v14, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mAllExerciseTime:I

    goto :goto_b

    :cond_b
    move/from16 v14, p13

    :goto_b
    and-int/lit16 v15, v1, 0x1000

    if-eqz v15, :cond_c

    iget v15, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mAll_METS:F

    goto :goto_c

    :cond_c
    move/from16 v15, p14

    :goto_c
    move/from16 p1, v2

    and-int/lit16 v2, v1, 0x2000

    if-eqz v2, :cond_d

    iget v2, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mAllCalorie:I

    goto :goto_d

    :cond_d
    move/from16 v2, p15

    :goto_d
    move/from16 p2, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mBeforePlanInfo:Lcom/szabh/smable3/entity/BleAICoachBeforePlan;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p16

    :goto_e
    const v16, 0x8000

    and-int v1, v1, v16

    if-eqz v1, :cond_f

    iget v1, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->userAge:I

    move/from16 p18, v1

    :goto_f
    move/from16 p16, p2

    move-object/from16 p17, v2

    move/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move/from16 p7, v7

    move-wide/from16 p8, v8

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move/from16 p13, v13

    move/from16 p14, v14

    move/from16 p15, v15

    move/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_10

    :cond_f
    move/from16 p18, p17

    goto :goto_f

    :goto_10
    invoke-virtual/range {p1 .. p18}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->copy(FILjava/lang/String;Ljava/lang/String;Ljava/util/List;IJ[ILjava/util/List;Ljava/util/List;IIFILcom/szabh/smable3/entity/BleAICoachBeforePlan;I)Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->planTarget:F

    return v0
.end method

.method public final component10()Ljava/util/List;
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

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mCompletionMark:Ljava/util/List;

    return-object v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mProgress:I

    return v0
.end method

.method public final component12()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mAllExerciseTime:I

    return v0
.end method

.method public final component13()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mAll_METS:F

    return v0
.end method

.method public final component14()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mAllCalorie:I

    return v0
.end method

.method public final component15()Lcom/szabh/smable3/entity/BleAICoachBeforePlan;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mBeforePlanInfo:Lcom/szabh/smable3/entity/BleAICoachBeforePlan;

    return-object v0
.end method

.method public final component16()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->userAge:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->level:I

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->generateParameter:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->dailyParameter:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLesson;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mVitalityDayLesson:Ljava/util/List;

    return-object v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->weeklyTargetNumber:I

    return v0
.end method

.method public final component7()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->startTime:J

    return-wide v0
.end method

.method public final component8()[I
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->dailyTargets:[I

    return-object v0
.end method

.method public final component9()Ljava/util/List;
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

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->dailySchedule:Ljava/util/List;

    return-object v0
.end method

.method public final copy(FILjava/lang/String;Ljava/lang/String;Ljava/util/List;IJ[ILjava/util/List;Ljava/util/List;IIFILcom/szabh/smable3/entity/BleAICoachBeforePlan;I)Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;
    .locals 19
    .param p3    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p5    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p9    # [I
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p10    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p11    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p16    # Lcom/szabh/smable3/entity/BleAICoachBeforePlan;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FI",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLesson;",
            ">;IJ[I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;IIFI",
            "Lcom/szabh/smable3/entity/BleAICoachBeforePlan;",
            "I)",
            "Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;"
        }
    .end annotation

    const-string v0, "generateParameter"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dailyParameter"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dailyTargets"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dailySchedule"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mCompletionMark"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    move/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v6, p5

    move/from16 v7, p6

    move-wide/from16 v8, p7

    move/from16 v13, p12

    move/from16 v14, p13

    move/from16 v15, p14

    move/from16 v16, p15

    move-object/from16 v17, p16

    move/from16 v18, p17

    invoke-direct/range {v1 .. v18}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;-><init>(FILjava/lang/String;Ljava/lang/String;Ljava/util/List;IJ[ILjava/util/List;Ljava/util/List;IIFILcom/szabh/smable3/entity/BleAICoachBeforePlan;I)V

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
    instance-of v1, p1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    iget v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->planTarget:F

    iget v3, p1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->planTarget:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->level:I

    iget v3, p1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->level:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->generateParameter:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->generateParameter:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->dailyParameter:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->dailyParameter:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mVitalityDayLesson:Ljava/util/List;

    iget-object v3, p1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mVitalityDayLesson:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->weeklyTargetNumber:I

    iget v3, p1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->weeklyTargetNumber:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-wide v3, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->startTime:J

    iget-wide v5, p1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->startTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->dailyTargets:[I

    iget-object v3, p1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->dailyTargets:[I

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->dailySchedule:Ljava/util/List;

    iget-object v3, p1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->dailySchedule:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mCompletionMark:Ljava/util/List;

    iget-object v3, p1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mCompletionMark:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mProgress:I

    iget v3, p1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mProgress:I

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mAllExerciseTime:I

    iget v3, p1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mAllExerciseTime:I

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mAll_METS:F

    iget v3, p1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mAll_METS:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_e

    return v2

    :cond_e
    iget v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mAllCalorie:I

    iget v3, p1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mAllCalorie:I

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mBeforePlanInfo:Lcom/szabh/smable3/entity/BleAICoachBeforePlan;

    iget-object v3, p1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mBeforePlanInfo:Lcom/szabh/smable3/entity/BleAICoachBeforePlan;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->userAge:I

    iget p1, p1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->userAge:I

    if-eq v1, p1, :cond_11

    return v2

    :cond_11
    return v0
.end method

.method public final getDailyParameter()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->dailyParameter:Ljava/lang/String;

    return-object v0
.end method

.method public final getDailySchedule()Ljava/util/List;
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

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->dailySchedule:Ljava/util/List;

    return-object v0
.end method

.method public final getDailyTargets()[I
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->dailyTargets:[I

    return-object v0
.end method

.method public final getGenerateParameter()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->generateParameter:Ljava/lang/String;

    return-object v0
.end method

.method public final getLevel()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->level:I

    return v0
.end method

.method public final getMAllCalorie()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mAllCalorie:I

    return v0
.end method

.method public final getMAllExerciseTime()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mAllExerciseTime:I

    return v0
.end method

.method public final getMAll_METS()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mAll_METS:F

    return v0
.end method

.method public final getMBeforePlanInfo()Lcom/szabh/smable3/entity/BleAICoachBeforePlan;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mBeforePlanInfo:Lcom/szabh/smable3/entity/BleAICoachBeforePlan;

    return-object v0
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

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mCompletionMark:Ljava/util/List;

    return-object v0
.end method

.method public final getMProgress()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mProgress:I

    return v0
.end method

.method public final getMVitalityDayLesson()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLesson;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mVitalityDayLesson:Ljava/util/List;

    return-object v0
.end method

.method public final getPlanTarget()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->planTarget:F

    return v0
.end method

.method public final getStartTime()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->startTime:J

    return-wide v0
.end method

.method public final getUserAge()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->userAge:I

    return v0
.end method

.method public final getWeeklyTargetNumber()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->weeklyTargetNumber:I

    return v0
.end method

.method public hashCode()I
    .locals 5

    iget v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->planTarget:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->level:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->generateParameter:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->dailyParameter:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mVitalityDayLesson:Ljava/util/List;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->weeklyTargetNumber:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v3, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->startTime:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->dailyTargets:[I

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->dailySchedule:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mCompletionMark:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mProgress:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mAllExerciseTime:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mAll_METS:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mAllCalorie:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mBeforePlanInfo:Lcom/szabh/smable3/entity/BleAICoachBeforePlan;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->userAge:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setDailyParameter(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->dailyParameter:Ljava/lang/String;

    return-void
.end method

.method public final setDailySchedule(Ljava/util/List;)V
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

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->dailySchedule:Ljava/util/List;

    return-void
.end method

.method public final setDailyTargets([I)V
    .locals 1
    .param p1    # [I
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->dailyTargets:[I

    return-void
.end method

.method public final setGenerateParameter(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->generateParameter:Ljava/lang/String;

    return-void
.end method

.method public final setLevel(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->level:I

    return-void
.end method

.method public final setMAllCalorie(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mAllCalorie:I

    return-void
.end method

.method public final setMAllExerciseTime(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mAllExerciseTime:I

    return-void
.end method

.method public final setMAll_METS(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mAll_METS:F

    return-void
.end method

.method public final setMBeforePlanInfo(Lcom/szabh/smable3/entity/BleAICoachBeforePlan;)V
    .locals 0
    .param p1    # Lcom/szabh/smable3/entity/BleAICoachBeforePlan;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mBeforePlanInfo:Lcom/szabh/smable3/entity/BleAICoachBeforePlan;

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

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mCompletionMark:Ljava/util/List;

    return-void
.end method

.method public final setMProgress(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mProgress:I

    return-void
.end method

.method public final setMVitalityDayLesson(Ljava/util/List;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLesson;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mVitalityDayLesson:Ljava/util/List;

    return-void
.end method

.method public final setPlanTarget(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->planTarget:F

    return-void
.end method

.method public final setStartTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->startTime:J

    return-void
.end method

.method public final setUserAge(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->userAge:I

    return-void
.end method

.method public final setWeeklyTargetNumber(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->weeklyTargetNumber:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 19
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    move-object/from16 v0, p0

    iget v1, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->planTarget:F

    iget v2, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->level:I

    iget-object v3, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->generateParameter:Ljava/lang/String;

    iget-object v4, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->dailyParameter:Ljava/lang/String;

    iget-object v5, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mVitalityDayLesson:Ljava/util/List;

    iget v6, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->weeklyTargetNumber:I

    iget-wide v7, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->startTime:J

    iget-object v9, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->dailyTargets:[I

    invoke-static {v9}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object v9

    iget-object v10, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->dailySchedule:Ljava/util/List;

    iget-object v11, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mCompletionMark:Ljava/util/List;

    iget v12, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mProgress:I

    iget v13, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mAllExerciseTime:I

    iget v14, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mAll_METS:F

    iget v15, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mAllCalorie:I

    move/from16 v16, v15

    iget-object v15, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->mBeforePlanInfo:Lcom/szabh/smable3/entity/BleAICoachBeforePlan;

    move-object/from16 v17, v15

    iget v15, v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->userAge:I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v18, v15

    const-string v15, "VitalityData(planTarget="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", level="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", generateParameter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", dailyParameter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mVitalityDayLesson="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", weeklyTargetNumber="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", startTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", dailyTargets="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", dailySchedule="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mCompletionMark="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mProgress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mAllExerciseTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mAll_METS="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mAllCalorie="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mBeforePlanInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", userAge="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
