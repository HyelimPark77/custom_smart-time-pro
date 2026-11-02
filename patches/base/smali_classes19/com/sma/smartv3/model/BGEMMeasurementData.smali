.class public final Lcom/sma/smartv3/model/BGEMMeasurementData;
.super Lcom/sma/smartv3/model/JsonFieldContainer;
.source "SourceFile"


# instance fields
.field private completed_progress:Z

.field private created_at:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private end_time:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private fasting:Z

.field private lower_bound:D

.field private measurement_id:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private model_no:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private start_time:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private upper_bound:D

.field private user_id:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private within_2hrs_meal:Z


# direct methods
.method public constructor <init>()V
    .locals 16

    .line 1
    const/16 v14, 0x7ff

    const/4 v15, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v15}, Lcom/sma/smartv3/model/BGEMMeasurementData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDZZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDZZZLjava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
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
    .param p13    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "measurement_id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "user_id"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "start_time"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "end_time"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "model_no"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "created_at"

    invoke-static {p13, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/sma/smartv3/model/JsonFieldContainer;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->measurement_id:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->user_id:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->start_time:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->end_time:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->model_no:Ljava/lang/String;

    .line 8
    iput-wide p6, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->lower_bound:D

    .line 9
    iput-wide p8, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->upper_bound:D

    .line 10
    iput-boolean p10, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->fasting:Z

    .line 11
    iput-boolean p11, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->within_2hrs_meal:Z

    .line 12
    iput-boolean p12, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->completed_progress:Z

    .line 13
    iput-object p13, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->created_at:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDZZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 15

    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x1

    .line 14
    const-string v2, ""

    if-eqz v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    move-object/from16 v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    move-object v3, v2

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    move-object v4, v2

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v0, 0x8

    if-eqz v5, :cond_3

    move-object v5, v2

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v0, 0x10

    if-eqz v6, :cond_4

    move-object v6, v2

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v0, 0x20

    const-wide/16 v8, 0x0

    if-eqz v7, :cond_5

    move-wide v10, v8

    goto :goto_5

    :cond_5
    move-wide/from16 v10, p6

    :goto_5
    and-int/lit8 v7, v0, 0x40

    if-eqz v7, :cond_6

    goto :goto_6

    :cond_6
    move-wide/from16 v8, p8

    :goto_6
    and-int/lit16 v7, v0, 0x80

    const/4 v12, 0x0

    if-eqz v7, :cond_7

    move v7, v12

    goto :goto_7

    :cond_7
    move/from16 v7, p10

    :goto_7
    and-int/lit16 v13, v0, 0x100

    if-eqz v13, :cond_8

    move v13, v12

    goto :goto_8

    :cond_8
    move/from16 v13, p11

    :goto_8
    and-int/lit16 v14, v0, 0x200

    if-eqz v14, :cond_9

    goto :goto_9

    :cond_9
    move/from16 v12, p12

    :goto_9
    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_a

    move-object/from16 p14, v2

    :goto_a
    move-object/from16 p1, p0

    move-object/from16 p2, v1

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move/from16 p11, v7

    move-wide/from16 p9, v8

    move-wide/from16 p7, v10

    move/from16 p13, v12

    move/from16 p12, v13

    goto :goto_b

    :cond_a
    move-object/from16 p14, p13

    goto :goto_a

    :goto_b
    invoke-direct/range {p1 .. p14}, Lcom/sma/smartv3/model/BGEMMeasurementData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDZZZLjava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/model/BGEMMeasurementData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDZZZLjava/lang/String;ILjava/lang/Object;)Lcom/sma/smartv3/model/BGEMMeasurementData;
    .locals 12

    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->measurement_id:Ljava/lang/String;

    :cond_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->user_id:Ljava/lang/String;

    goto :goto_0

    :cond_1
    move-object v1, p2

    :goto_0
    and-int/lit8 v2, v0, 0x4

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->start_time:Ljava/lang/String;

    goto :goto_1

    :cond_2
    move-object v2, p3

    :goto_1
    and-int/lit8 v3, v0, 0x8

    if-eqz v3, :cond_3

    iget-object v3, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->end_time:Ljava/lang/String;

    goto :goto_2

    :cond_3
    move-object/from16 v3, p4

    :goto_2
    and-int/lit8 v4, v0, 0x10

    if-eqz v4, :cond_4

    iget-object v4, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->model_no:Ljava/lang/String;

    goto :goto_3

    :cond_4
    move-object/from16 v4, p5

    :goto_3
    and-int/lit8 v5, v0, 0x20

    if-eqz v5, :cond_5

    iget-wide v5, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->lower_bound:D

    goto :goto_4

    :cond_5
    move-wide/from16 v5, p6

    :goto_4
    and-int/lit8 v7, v0, 0x40

    if-eqz v7, :cond_6

    iget-wide v7, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->upper_bound:D

    goto :goto_5

    :cond_6
    move-wide/from16 v7, p8

    :goto_5
    and-int/lit16 v9, v0, 0x80

    if-eqz v9, :cond_7

    iget-boolean v9, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->fasting:Z

    goto :goto_6

    :cond_7
    move/from16 v9, p10

    :goto_6
    and-int/lit16 v10, v0, 0x100

    if-eqz v10, :cond_8

    iget-boolean v10, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->within_2hrs_meal:Z

    goto :goto_7

    :cond_8
    move/from16 v10, p11

    :goto_7
    and-int/lit16 v11, v0, 0x200

    if-eqz v11, :cond_9

    iget-boolean v11, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->completed_progress:Z

    goto :goto_8

    :cond_9
    move/from16 v11, p12

    :goto_8
    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_a

    iget-object v0, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->created_at:Ljava/lang/String;

    move-object/from16 p15, v0

    :goto_9
    move-object p2, p0

    move-object p3, p1

    move-object/from16 p4, v1

    move-object/from16 p5, v2

    move-object/from16 p6, v3

    move-object/from16 p7, v4

    move-wide/from16 p8, v5

    move-wide/from16 p10, v7

    move/from16 p12, v9

    move/from16 p13, v10

    move/from16 p14, v11

    goto :goto_a

    :cond_a
    move-object/from16 p15, p13

    goto :goto_9

    :goto_a
    invoke-virtual/range {p2 .. p15}, Lcom/sma/smartv3/model/BGEMMeasurementData;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDZZZLjava/lang/String;)Lcom/sma/smartv3/model/BGEMMeasurementData;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->measurement_id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->completed_progress:Z

    return v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->created_at:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->user_id:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->start_time:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->end_time:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->model_no:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->lower_bound:D

    return-wide v0
.end method

.method public final component7()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->upper_bound:D

    return-wide v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->fasting:Z

    return v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->within_2hrs_meal:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDZZZLjava/lang/String;)Lcom/sma/smartv3/model/BGEMMeasurementData;
    .locals 15
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
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
    .param p13    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "measurement_id"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "user_id"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "start_time"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "end_time"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "model_no"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "created_at"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/model/BGEMMeasurementData;

    move-wide/from16 v7, p6

    move-wide/from16 v9, p8

    move/from16 v11, p10

    move/from16 v12, p11

    move/from16 v13, p12

    invoke-direct/range {v1 .. v14}, Lcom/sma/smartv3/model/BGEMMeasurementData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDZZZLjava/lang/String;)V

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
    instance-of v1, p1, Lcom/sma/smartv3/model/BGEMMeasurementData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/model/BGEMMeasurementData;

    iget-object v1, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->measurement_id:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/BGEMMeasurementData;->measurement_id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->user_id:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/BGEMMeasurementData;->user_id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->start_time:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/BGEMMeasurementData;->start_time:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->end_time:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/BGEMMeasurementData;->end_time:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->model_no:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/BGEMMeasurementData;->model_no:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-wide v3, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->lower_bound:D

    iget-wide v5, p1, Lcom/sma/smartv3/model/BGEMMeasurementData;->lower_bound:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_7

    return v2

    :cond_7
    iget-wide v3, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->upper_bound:D

    iget-wide v5, p1, Lcom/sma/smartv3/model/BGEMMeasurementData;->upper_bound:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->fasting:Z

    iget-boolean v3, p1, Lcom/sma/smartv3/model/BGEMMeasurementData;->fasting:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->within_2hrs_meal:Z

    iget-boolean v3, p1, Lcom/sma/smartv3/model/BGEMMeasurementData;->within_2hrs_meal:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->completed_progress:Z

    iget-boolean v3, p1, Lcom/sma/smartv3/model/BGEMMeasurementData;->completed_progress:Z

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->created_at:Ljava/lang/String;

    iget-object p1, p1, Lcom/sma/smartv3/model/BGEMMeasurementData;->created_at:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getCompleted_progress()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->completed_progress:Z

    return v0
.end method

.method public final getCreated_at()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->created_at:Ljava/lang/String;

    return-object v0
.end method

.method public final getEnd_time()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->end_time:Ljava/lang/String;

    return-object v0
.end method

.method public final getFasting()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->fasting:Z

    return v0
.end method

.method public final getLower_bound()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->lower_bound:D

    return-wide v0
.end method

.method public final getMeasurement_id()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->measurement_id:Ljava/lang/String;

    return-object v0
.end method

.method public final getModel_no()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->model_no:Ljava/lang/String;

    return-object v0
.end method

.method public final getStart_time()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->start_time:Ljava/lang/String;

    return-object v0
.end method

.method public final getUpper_bound()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->upper_bound:D

    return-wide v0
.end method

.method public final getUser_id()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->user_id:Ljava/lang/String;

    return-object v0
.end method

.method public final getWithin_2hrs_meal()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->within_2hrs_meal:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->measurement_id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->user_id:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->start_time:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->end_time:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->model_no:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->lower_bound:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->upper_bound:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->fasting:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->within_2hrs_meal:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->completed_progress:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->created_at:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setCompleted_progress(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->completed_progress:Z

    return-void
.end method

.method public final setCreated_at(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->created_at:Ljava/lang/String;

    return-void
.end method

.method public final setEnd_time(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->end_time:Ljava/lang/String;

    return-void
.end method

.method public final setFasting(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->fasting:Z

    return-void
.end method

.method public final setLower_bound(D)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->lower_bound:D

    return-void
.end method

.method public final setMeasurement_id(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->measurement_id:Ljava/lang/String;

    return-void
.end method

.method public final setModel_no(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->model_no:Ljava/lang/String;

    return-void
.end method

.method public final setStart_time(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->start_time:Ljava/lang/String;

    return-void
.end method

.method public final setUpper_bound(D)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->upper_bound:D

    return-void
.end method

.method public final setUser_id(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->user_id:Ljava/lang/String;

    return-void
.end method

.method public final setWithin_2hrs_meal(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->within_2hrs_meal:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 15
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->measurement_id:Ljava/lang/String;

    iget-object v1, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->user_id:Ljava/lang/String;

    iget-object v2, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->start_time:Ljava/lang/String;

    iget-object v3, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->end_time:Ljava/lang/String;

    iget-object v4, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->model_no:Ljava/lang/String;

    iget-wide v5, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->lower_bound:D

    iget-wide v7, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->upper_bound:D

    iget-boolean v9, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->fasting:Z

    iget-boolean v10, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->within_2hrs_meal:Z

    iget-boolean v11, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->completed_progress:Z

    iget-object v12, p0, Lcom/sma/smartv3/model/BGEMMeasurementData;->created_at:Ljava/lang/String;

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "BGEMMeasurementData(measurement_id="

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", user_id="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", start_time="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", end_time="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", model_no="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", lower_bound="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v5, v6}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", upper_bound="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v7, v8}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", fasting="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", within_2hrs_meal="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", completed_progress="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", created_at="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
