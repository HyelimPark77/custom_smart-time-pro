.class public final Lcom/sma/smartv3/model/TodayData;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final dataType:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mExtraInfo:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final onClickID:I

.field private final state:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final stateColor:I

.field private final time:J

.field private final title:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final value:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final value1:F

.field private final value2:F


# direct methods
.method public constructor <init>()V
    .locals 14

    .line 1
    const/16 v12, 0x3ff

    const/4 v13, 0x0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v13}, Lcom/sma/smartv3/model/TodayData;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;FF)V
    .locals 1
    .param p3    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p9    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "title"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataType"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mExtraInfo"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Lcom/sma/smartv3/model/TodayData;->time:J

    .line 4
    iput-object p3, p0, Lcom/sma/smartv3/model/TodayData;->title:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lcom/sma/smartv3/model/TodayData;->value:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lcom/sma/smartv3/model/TodayData;->state:Ljava/lang/String;

    .line 7
    iput p6, p0, Lcom/sma/smartv3/model/TodayData;->stateColor:I

    .line 8
    iput-object p7, p0, Lcom/sma/smartv3/model/TodayData;->dataType:Ljava/lang/String;

    .line 9
    iput p8, p0, Lcom/sma/smartv3/model/TodayData;->onClickID:I

    .line 10
    iput-object p9, p0, Lcom/sma/smartv3/model/TodayData;->mExtraInfo:Ljava/lang/String;

    .line 11
    iput p10, p0, Lcom/sma/smartv3/model/TodayData;->value1:F

    .line 12
    iput p11, p0, Lcom/sma/smartv3/model/TodayData;->value2:F

    return-void
.end method

.method public synthetic constructor <init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 12

    move/from16 v0, p12

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    const-wide/16 p1, 0x0

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, v0, 0x2

    .line 13
    const-string p2, ""

    if-eqz p1, :cond_1

    move-object v3, p2

    goto :goto_0

    :cond_1
    move-object v3, p3

    :goto_0
    and-int/lit8 p1, v0, 0x4

    if-eqz p1, :cond_2

    move-object v4, p2

    goto :goto_1

    :cond_2
    move-object/from16 v4, p4

    :goto_1
    and-int/lit8 p1, v0, 0x8

    if-eqz p1, :cond_3

    move-object v5, p2

    goto :goto_2

    :cond_3
    move-object/from16 v5, p5

    :goto_2
    and-int/lit8 p1, v0, 0x10

    const/4 p3, 0x0

    if-eqz p1, :cond_4

    move v6, p3

    goto :goto_3

    :cond_4
    move/from16 v6, p6

    :goto_3
    and-int/lit8 p1, v0, 0x20

    if-eqz p1, :cond_5

    move-object v7, p2

    goto :goto_4

    :cond_5
    move-object/from16 v7, p7

    :goto_4
    and-int/lit8 p1, v0, 0x40

    if-eqz p1, :cond_6

    move v8, p3

    goto :goto_5

    :cond_6
    move/from16 v8, p8

    :goto_5
    and-int/lit16 p1, v0, 0x80

    if-eqz p1, :cond_7

    move-object v9, p2

    goto :goto_6

    :cond_7
    move-object/from16 v9, p9

    :goto_6
    and-int/lit16 p1, v0, 0x100

    const/4 p2, 0x0

    if-eqz p1, :cond_8

    move v10, p2

    goto :goto_7

    :cond_8
    move/from16 v10, p10

    :goto_7
    and-int/lit16 p1, v0, 0x200

    if-eqz p1, :cond_9

    move v11, p2

    :goto_8
    move-object v0, p0

    goto :goto_9

    :cond_9
    move/from16 v11, p11

    goto :goto_8

    :goto_9
    invoke-direct/range {v0 .. v11}, Lcom/sma/smartv3/model/TodayData;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;FF)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/model/TodayData;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;FFILjava/lang/Object;)Lcom/sma/smartv3/model/TodayData;
    .locals 12

    move/from16 v0, p12

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-wide p1, p0, Lcom/sma/smartv3/model/TodayData;->time:J

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, v0, 0x2

    if-eqz p1, :cond_1

    iget-object p3, p0, Lcom/sma/smartv3/model/TodayData;->title:Ljava/lang/String;

    :cond_1
    move-object v3, p3

    and-int/lit8 p1, v0, 0x4

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/sma/smartv3/model/TodayData;->value:Ljava/lang/String;

    move-object v4, p1

    goto :goto_0

    :cond_2
    move-object/from16 v4, p4

    :goto_0
    and-int/lit8 p1, v0, 0x8

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/sma/smartv3/model/TodayData;->state:Ljava/lang/String;

    move-object v5, p1

    goto :goto_1

    :cond_3
    move-object/from16 v5, p5

    :goto_1
    and-int/lit8 p1, v0, 0x10

    if-eqz p1, :cond_4

    iget p1, p0, Lcom/sma/smartv3/model/TodayData;->stateColor:I

    move v6, p1

    goto :goto_2

    :cond_4
    move/from16 v6, p6

    :goto_2
    and-int/lit8 p1, v0, 0x20

    if-eqz p1, :cond_5

    iget-object p1, p0, Lcom/sma/smartv3/model/TodayData;->dataType:Ljava/lang/String;

    move-object v7, p1

    goto :goto_3

    :cond_5
    move-object/from16 v7, p7

    :goto_3
    and-int/lit8 p1, v0, 0x40

    if-eqz p1, :cond_6

    iget p1, p0, Lcom/sma/smartv3/model/TodayData;->onClickID:I

    move v8, p1

    goto :goto_4

    :cond_6
    move/from16 v8, p8

    :goto_4
    and-int/lit16 p1, v0, 0x80

    if-eqz p1, :cond_7

    iget-object p1, p0, Lcom/sma/smartv3/model/TodayData;->mExtraInfo:Ljava/lang/String;

    move-object v9, p1

    goto :goto_5

    :cond_7
    move-object/from16 v9, p9

    :goto_5
    and-int/lit16 p1, v0, 0x100

    if-eqz p1, :cond_8

    iget p1, p0, Lcom/sma/smartv3/model/TodayData;->value1:F

    move v10, p1

    goto :goto_6

    :cond_8
    move/from16 v10, p10

    :goto_6
    and-int/lit16 p1, v0, 0x200

    if-eqz p1, :cond_9

    iget p1, p0, Lcom/sma/smartv3/model/TodayData;->value2:F

    move v11, p1

    :goto_7
    move-object v0, p0

    goto :goto_8

    :cond_9
    move/from16 v11, p11

    goto :goto_7

    :goto_8
    invoke-virtual/range {v0 .. v11}, Lcom/sma/smartv3/model/TodayData;->copy(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;FF)Lcom/sma/smartv3/model/TodayData;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/TodayData;->time:J

    return-wide v0
.end method

.method public final component10()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/TodayData;->value2:F

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/TodayData;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/TodayData;->value:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/TodayData;->state:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/TodayData;->stateColor:I

    return v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/TodayData;->dataType:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/TodayData;->onClickID:I

    return v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/TodayData;->mExtraInfo:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/TodayData;->value1:F

    return v0
.end method

.method public final copy(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;FF)Lcom/sma/smartv3/model/TodayData;
    .locals 13
    .param p3    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p9    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "title"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataType"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mExtraInfo"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/model/TodayData;

    move-wide v2, p1

    move/from16 v7, p6

    move/from16 v9, p8

    move/from16 v11, p10

    move/from16 v12, p11

    invoke-direct/range {v1 .. v12}, Lcom/sma/smartv3/model/TodayData;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;FF)V

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
    instance-of v1, p1, Lcom/sma/smartv3/model/TodayData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/model/TodayData;

    iget-wide v3, p0, Lcom/sma/smartv3/model/TodayData;->time:J

    iget-wide v5, p1, Lcom/sma/smartv3/model/TodayData;->time:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/sma/smartv3/model/TodayData;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/TodayData;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/sma/smartv3/model/TodayData;->value:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/TodayData;->value:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/sma/smartv3/model/TodayData;->state:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/TodayData;->state:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/sma/smartv3/model/TodayData;->stateColor:I

    iget v3, p1, Lcom/sma/smartv3/model/TodayData;->stateColor:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/sma/smartv3/model/TodayData;->dataType:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/TodayData;->dataType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/sma/smartv3/model/TodayData;->onClickID:I

    iget v3, p1, Lcom/sma/smartv3/model/TodayData;->onClickID:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/sma/smartv3/model/TodayData;->mExtraInfo:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/TodayData;->mExtraInfo:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lcom/sma/smartv3/model/TodayData;->value1:F

    iget v3, p1, Lcom/sma/smartv3/model/TodayData;->value1:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lcom/sma/smartv3/model/TodayData;->value2:F

    iget p1, p1, Lcom/sma/smartv3/model/TodayData;->value2:F

    invoke-static {v1, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    if-eqz p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getDataType()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/TodayData;->dataType:Ljava/lang/String;

    return-object v0
.end method

.method public final getMExtraInfo()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/TodayData;->mExtraInfo:Ljava/lang/String;

    return-object v0
.end method

.method public final getOnClickID()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/TodayData;->onClickID:I

    return v0
.end method

.method public final getState()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/TodayData;->state:Ljava/lang/String;

    return-object v0
.end method

.method public final getStateColor()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/TodayData;->stateColor:I

    return v0
.end method

.method public final getTime()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/TodayData;->time:J

    return-wide v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/TodayData;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getValue()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/TodayData;->value:Ljava/lang/String;

    return-object v0
.end method

.method public final getValue1()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/TodayData;->value1:F

    return v0
.end method

.method public final getValue2()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/TodayData;->value2:F

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/TodayData;->time:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/TodayData;->title:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/TodayData;->value:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/TodayData;->state:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/TodayData;->stateColor:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/TodayData;->dataType:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/TodayData;->onClickID:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/TodayData;->mExtraInfo:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/TodayData;->value1:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/TodayData;->value2:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMExtraInfo(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/TodayData;->mExtraInfo:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 13
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-wide v0, p0, Lcom/sma/smartv3/model/TodayData;->time:J

    iget-object v2, p0, Lcom/sma/smartv3/model/TodayData;->title:Ljava/lang/String;

    iget-object v3, p0, Lcom/sma/smartv3/model/TodayData;->value:Ljava/lang/String;

    iget-object v4, p0, Lcom/sma/smartv3/model/TodayData;->state:Ljava/lang/String;

    iget v5, p0, Lcom/sma/smartv3/model/TodayData;->stateColor:I

    iget-object v6, p0, Lcom/sma/smartv3/model/TodayData;->dataType:Ljava/lang/String;

    iget v7, p0, Lcom/sma/smartv3/model/TodayData;->onClickID:I

    iget-object v8, p0, Lcom/sma/smartv3/model/TodayData;->mExtraInfo:Ljava/lang/String;

    iget v9, p0, Lcom/sma/smartv3/model/TodayData;->value1:F

    iget v10, p0, Lcom/sma/smartv3/model/TodayData;->value2:F

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "TodayData(time="

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", title="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", value="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", state="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", stateColor="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", dataType="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", onClickID="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", mExtraInfo="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", value1="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", value2="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
