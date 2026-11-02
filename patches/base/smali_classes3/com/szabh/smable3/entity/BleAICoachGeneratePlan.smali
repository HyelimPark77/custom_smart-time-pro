.class public final Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBleAICoachPlan.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleAICoachPlan.kt\ncom/szabh/smable3/entity/BleAICoachGeneratePlan\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,337:1\n1563#2:338\n1634#2,3:339\n222#3,4:342\n222#3,4:346\n222#3,4:350\n232#3,3:354\n222#3,15:357\n*S KotlinDebug\n*F\n+ 1 BleAICoachPlan.kt\ncom/szabh/smable3/entity/BleAICoachGeneratePlan\n*L\n157#1:338\n157#1:339,3\n177#1:342,4\n180#1:346,4\n183#1:350,4\n201#1:354,3\n201#1:357,15\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBleAICoachPlan.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleAICoachPlan.kt\ncom/szabh/smable3/entity/BleAICoachGeneratePlan\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,337:1\n1563#2:338\n1634#2,3:339\n222#3,4:342\n222#3,4:346\n222#3,4:350\n232#3,3:354\n222#3,15:357\n*S KotlinDebug\n*F\n+ 1 BleAICoachPlan.kt\ncom/szabh/smable3/entity/BleAICoachGeneratePlan\n*L\n157#1:338\n157#1:339,3\n177#1:342,4\n180#1:346,4\n183#1:350,4\n201#1:354,3\n201#1:357,15\n*E\n"
    }
.end annotation


# instance fields
.field private mAllCalorie:I

.field private mAllExerciseTime:I

.field private mAll_METS:F

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
            "Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;",
            ">;"
        }
    .end annotation
.end field

.field private mPlanLevel:I

.field private mPlanStartTime:J

.field private mPlanTarget:F

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

.field private mProgress:I


# direct methods
.method public constructor <init>()V
    .locals 14

    .line 1
    const/16 v12, 0x3ff

    const/4 v13, 0x0

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

    move-object v0, p0

    invoke-direct/range {v0 .. v13}, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;-><init>(Ljava/util/List;Ljava/util/List;JFILjava/util/List;IIFIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/util/List;JFILjava/util/List;IIFI)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p7    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;JFI",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;",
            ">;IIFI)V"
        }
    .end annotation

    const-string v0, "mPlanTime"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mCompletionMark"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mCourses"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mPlanTime:Ljava/util/List;

    .line 4
    iput-object p2, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mCompletionMark:Ljava/util/List;

    .line 5
    iput-wide p3, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mPlanStartTime:J

    .line 6
    iput p5, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mPlanTarget:F

    .line 7
    iput p6, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mPlanLevel:I

    .line 8
    iput-object p7, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mCourses:Ljava/util/List;

    .line 9
    iput p8, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mProgress:I

    .line 10
    iput p9, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mAllExerciseTime:I

    .line 11
    iput p10, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mAll_METS:F

    .line 12
    iput p11, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mAllCalorie:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Ljava/util/List;JFILjava/util/List;IIFIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    .line 13
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    .line 14
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    const-wide/16 p3, 0x0

    :cond_2
    and-int/lit8 p13, p12, 0x8

    const/4 v0, 0x0

    if-eqz p13, :cond_3

    move p5, v0

    :cond_3
    and-int/lit8 p13, p12, 0x10

    const/4 v1, 0x0

    if-eqz p13, :cond_4

    move p6, v1

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    .line 15
    new-instance p7, Ljava/util/ArrayList;

    invoke-direct {p7}, Ljava/util/ArrayList;-><init>()V

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    move p8, v1

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    move p9, v1

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    move p10, v0

    :cond_8
    and-int/lit16 p12, p12, 0x200

    if-eqz p12, :cond_9

    move p13, v1

    move p11, p9

    move p12, p10

    move-object p9, p7

    move p10, p8

    move p7, p5

    move p8, p6

    :goto_0
    move-wide p5, p3

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    goto :goto_1

    :cond_9
    move p13, p11

    move p12, p10

    move p10, p8

    move p11, p9

    move p8, p6

    move-object p9, p7

    move p7, p5

    goto :goto_0

    .line 16
    :goto_1
    invoke-direct/range {p2 .. p13}, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;-><init>(Ljava/util/List;Ljava/util/List;JFILjava/util/List;IIFI)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;Ljava/util/List;Ljava/util/List;JFILjava/util/List;IIFIILjava/lang/Object;)Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;
    .locals 0

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    iget-object p1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mPlanTime:Ljava/util/List;

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    iget-object p2, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mCompletionMark:Ljava/util/List;

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    iget-wide p3, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mPlanStartTime:J

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    iget p5, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mPlanTarget:F

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    iget p6, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mPlanLevel:I

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    iget-object p7, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mCourses:Ljava/util/List;

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    iget p8, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mProgress:I

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    iget p9, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mAllExerciseTime:I

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    iget p10, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mAll_METS:F

    :cond_8
    and-int/lit16 p12, p12, 0x200

    if-eqz p12, :cond_9

    iget p11, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mAllCalorie:I

    :cond_9
    move p12, p10

    move p13, p11

    move p10, p8

    move p11, p9

    move p8, p6

    move-object p9, p7

    move p7, p5

    move-wide p5, p3

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p13}, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->copy(Ljava/util/List;Ljava/util/List;JFILjava/util/List;IIFI)Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/util/List;
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

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mPlanTime:Ljava/util/List;

    return-object v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mAllCalorie:I

    return v0
.end method

.method public final component2()Ljava/util/List;
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

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mCompletionMark:Ljava/util/List;

    return-object v0
.end method

.method public final component3()J
    .locals 2

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mPlanStartTime:J

    return-wide v0
.end method

.method public final component4()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mPlanTarget:F

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mPlanLevel:I

    return v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mCourses:Ljava/util/List;

    return-object v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mProgress:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mAllExerciseTime:I

    return v0
.end method

.method public final component9()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mAll_METS:F

    return v0
.end method

.method public final copy(Ljava/util/List;Ljava/util/List;JFILjava/util/List;IIFI)Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;
    .locals 13
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p7    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;JFI",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;",
            ">;IIFI)",
            "Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;"
        }
    .end annotation

    const-string v0, "mPlanTime"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mCompletionMark"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mCourses"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;

    move-object v2, p1

    move-object v3, p2

    move-wide/from16 v4, p3

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move/from16 v12, p11

    invoke-direct/range {v1 .. v12}, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;-><init>(Ljava/util/List;Ljava/util/List;JFILjava/util/List;IIFI)V

    return-object v1
.end method

.method public decode()V
    .locals 11

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    const-class v0, Lcom/szabh/smable3/entity/BleWeekPlanTime;

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bestmafen/baseble/data/BleReadable;

    const/4 v2, 0x4

    invoke-virtual {p0, v2}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    invoke-virtual {v1}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v1, Lcom/szabh/smable3/entity/BleWeekPlanTime;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWeekPlanTime;->getMList()[Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/ArraysKt___ArraysKt;->OXI0X0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mPlanTime:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bestmafen/baseble/data/BleReadable;

    invoke-virtual {p0, v2}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    invoke-virtual {v0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Lcom/szabh/smable3/entity/BleWeekPlanTime;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleWeekPlanTime;->getMList()[Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/ArraysKt___ArraysKt;->OXI0X0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mCompletionMark:Ljava/util/List;

    const-class v0, Lcom/szabh/smable3/entity/BleAICoachTime;

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bestmafen/baseble/data/BleReadable;

    const/16 v1, 0x8

    invoke-virtual {p0, v1}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    invoke-virtual {v0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Lcom/szabh/smable3/entity/BleAICoachTime;

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    const-string v2, "getInstance(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleAICoachTime;->getMYear()I

    move-result v2

    const/4 v3, 0x1

    invoke-virtual {v1, v3, v2}, Ljava/util/Calendar;->set(II)V

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleAICoachTime;->getMMonth()I

    move-result v2

    sub-int/2addr v2, v3

    const/4 v3, 0x2

    invoke-virtual {v1, v3, v2}, Ljava/util/Calendar;->set(II)V

    const/4 v2, 0x5

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleAICoachTime;->getMDay()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Ljava/util/Calendar;->set(II)V

    const/16 v2, 0xb

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleAICoachTime;->getMHour()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Ljava/util/Calendar;->set(II)V

    const/16 v2, 0xc

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleAICoachTime;->getMMinute()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Ljava/util/Calendar;->set(II)V

    const/16 v2, 0xd

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleAICoachTime;->getMSecond()I

    move-result v0

    invoke-virtual {v1, v2, v0}, Ljava/util/Calendar;->set(II)V

    const/16 v0, 0xe

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Ljava/util/Calendar;->set(II)V

    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mPlanStartTime:J

    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v1, "LITTLE_ENDIAN"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v3

    iput v3, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mPlanTarget:F

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mPlanLevel:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mCourses:Ljava/util/List;

    move v0, v2

    :goto_0
    const/4 v3, 0x7

    if-ge v0, v3, :cond_1

    new-instance v4, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;

    const/16 v9, 0xf

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v4 .. v10}, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;-><init>(ILjava/util/List;IFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v3}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v3

    invoke-virtual {v4, v3}, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;->setMCourseNumber(I)V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    move v5, v2

    :goto_1
    const/4 v6, 0x6

    if-ge v5, v6, :cond_0

    const-class v6, Lcom/szabh/smable3/entity/BleAICoachCourse;

    invoke-virtual {v6}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/bestmafen/baseble/data/BleReadable;

    const/16 v7, 0x10

    invoke-virtual {p0, v7}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    invoke-virtual {v6}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_0
    invoke-virtual {v4, v3}, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;->setMCoursesItem(Ljava/util/List;)V

    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v3}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v5

    invoke-virtual {v4, v5}, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;->setMCourseIndex(I)V

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v3}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v3

    invoke-virtual {v4, v3}, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;->setMCourseGoal(F)V

    iget-object v3, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mCourses:Ljava/util/List;

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mProgress:I

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mAllExerciseTime:I

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mAll_METS:F

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mAllCalorie:I

    return-void
.end method

.method public encode()V
    .locals 6

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    sget-object v0, Lcom/szabh/smable3/entity/BleWeekPlanTime;->Companion:Lcom/szabh/smable3/entity/BleWeekPlanTime$Companion;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mPlanTime:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/entity/BleWeekPlanTime$Companion;->ofPlanTime(Ljava/util/List;)Lcom/szabh/smable3/entity/BleWeekPlanTime;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeObject(Lcom/bestmafen/baseble/data/BleBuffer;)V

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mCompletionMark:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/entity/BleWeekPlanTime$Companion;->ofPlanTime(Ljava/util/List;)Lcom/szabh/smable3/entity/BleWeekPlanTime;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeObject(Lcom/bestmafen/baseble/data/BleBuffer;)V

    sget-object v0, Lcom/szabh/smable3/entity/BleAICoachTime;->Companion:Lcom/szabh/smable3/entity/BleAICoachTime$Companion;

    iget-wide v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mPlanStartTime:J

    invoke-virtual {v0, v1, v2}, Lcom/szabh/smable3/entity/BleAICoachTime$Companion;->ofLocal(J)Lcom/szabh/smable3/entity/BleAICoachTime;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeObject(Lcom/bestmafen/baseble/data/BleBuffer;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mPlanTarget:F

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v2, "LITTLE_ENDIAN"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeFloat(FLjava/nio/ByteOrder;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mPlanLevel:I

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt32(ILjava/nio/ByteOrder;)V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mCourses:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;->getMCourseNumber()I

    move-result v4

    const/4 v5, 0x6

    if-ne v4, v5, :cond_0

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;->getMCourseNumber()I

    move-result v4

    sget-object v5, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v4, v5}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt32(ILjava/nio/ByteOrder;)V

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;->getMCoursesItem()Ljava/util/List;

    move-result-object v4

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleWritable;->writeList(Ljava/util/List;)V

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;->getMCourseIndex()I

    move-result v4

    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v4, v5}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt32(ILjava/nio/ByteOrder;)V

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;->getMCourseGoal()F

    move-result v3

    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v3, v5}, Lcom/bestmafen/baseble/data/BleWritable;->writeFloat(FLjava/nio/ByteOrder;)V

    sget-object v3, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto :goto_1

    :cond_0
    const/16 v3, 0x6c

    invoke-virtual {p0, v3}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v3

    :goto_1
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mProgress:I

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt32(ILjava/nio/ByteOrder;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mAllExerciseTime:I

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt32(ILjava/nio/ByteOrder;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mAll_METS:F

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeFloat(FLjava/nio/ByteOrder;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mAllCalorie:I

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt32(ILjava/nio/ByteOrder;)V

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mPlanTime:Ljava/util/List;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mPlanTime:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mCompletionMark:Ljava/util/List;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mCompletionMark:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mPlanStartTime:J

    iget-wide v5, p1, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mPlanStartTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mPlanTarget:F

    iget v3, p1, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mPlanTarget:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mPlanLevel:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mPlanLevel:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mCourses:Ljava/util/List;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mCourses:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mProgress:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mProgress:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mAllExerciseTime:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mAllExerciseTime:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mAll_METS:F

    iget v3, p1, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mAll_METS:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mAllCalorie:I

    iget p1, p1, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mAllCalorie:I

    if-eq v1, p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getMAllCalorie()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mAllCalorie:I

    return v0
.end method

.method public final getMAllExerciseTime()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mAllExerciseTime:I

    return v0
.end method

.method public final getMAll_METS()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mAll_METS:F

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

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mCompletionMark:Ljava/util/List;

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
            "Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mCourses:Ljava/util/List;

    return-object v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    const/16 v0, 0x31c

    return v0
.end method

.method public final getMPlanLevel()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mPlanLevel:I

    return v0
.end method

.method public final getMPlanStartTime()J
    .locals 2

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mPlanStartTime:J

    return-wide v0
.end method

.method public final getMPlanTarget()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mPlanTarget:F

    return v0
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

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mPlanTime:Ljava/util/List;

    return-object v0
.end method

.method public final getMProgress()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mProgress:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mPlanTime:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mCompletionMark:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mPlanStartTime:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mPlanTarget:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mPlanLevel:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mCourses:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mProgress:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mAllExerciseTime:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mAll_METS:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mAllCalorie:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMAllCalorie(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mAllCalorie:I

    return-void
.end method

.method public final setMAllExerciseTime(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mAllExerciseTime:I

    return-void
.end method

.method public final setMAll_METS(F)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mAll_METS:F

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

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mCompletionMark:Ljava/util/List;

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
            "Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mCourses:Ljava/util/List;

    return-void
.end method

.method public final setMPlanLevel(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mPlanLevel:I

    return-void
.end method

.method public final setMPlanStartTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mPlanStartTime:J

    return-void
.end method

.method public final setMPlanTarget(F)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mPlanTarget:F

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

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mPlanTime:Ljava/util/List;

    return-void
.end method

.method public final setMProgress(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mProgress:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleAICoachGeneratePlan(mPlanTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mPlanTime:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mCompletionMark="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mCompletionMark:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mPlanStartTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mPlanStartTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ",mPlanTarget="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mPlanTarget:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ",mPlanLevel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mPlanLevel:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",mProgress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mProgress:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",mAllExerciseTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mAllExerciseTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",mAll_METS="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mAll_METS:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ",mAllCalorie="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mAllCalorie:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",mCourses="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;->mCourses:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
