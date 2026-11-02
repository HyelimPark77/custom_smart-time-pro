.class public final Lcom/sma/smartv3/model/Stock;
.super Lcom/sma/smartv3/model/JsonFieldContainer;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private code:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private country:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private currency:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private exchange:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private exchangeInfo:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private id:I

.field private isin:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private name:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private previousClose:F

.field private previousCloseDate:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private realTimeChange:F

.field private realTimeChangePercentage:F

.field private realTimeClose:F

.field private realTimeGmtOffset:I

.field private realTimeHigh:F

.field private realTimeLow:F

.field private realTimeOpen:F

.field private realTimePreviousClose:F

.field private realTimeStamp:J

.field private realTimeStampRead:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private realTimeVolume:J

.field private type:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private updateTime:J


# direct methods
.method public constructor <init>()V
    .locals 29

    .line 1
    const v27, 0x7fffff

    const/16 v28, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v28}, Lcom/sma/smartv3/model/Stock;-><init>(IFLjava/lang/String;JLjava/lang/String;IFFFFJFFFJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IFLjava/lang/String;JLjava/lang/String;IFFFFJFFFJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 10
    .param p3    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p19    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p20    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p21    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p22    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p23    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p24    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p25    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p26    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    move-object/from16 v0, p6

    move-object/from16 v1, p19

    move-object/from16 v2, p20

    move-object/from16 v3, p21

    move-object/from16 v4, p22

    move-object/from16 v5, p23

    move-object/from16 v6, p24

    move-object/from16 v7, p25

    move-object/from16 v8, p26

    const-string v9, "previousCloseDate"

    invoke-static {p3, v9}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "realTimeStampRead"

    invoke-static {v0, v9}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "country"

    invoke-static {v1, v9}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "currency"

    invoke-static {v2, v9}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "name"

    invoke-static {v3, v9}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "type"

    invoke-static {v4, v9}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "code"

    invoke-static {v5, v9}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "exchange"

    invoke-static {v6, v9}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "exchangeInfo"

    invoke-static {v7, v9}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "isin"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/sma/smartv3/model/JsonFieldContainer;-><init>()V

    .line 3
    iput p1, p0, Lcom/sma/smartv3/model/Stock;->id:I

    .line 4
    iput p2, p0, Lcom/sma/smartv3/model/Stock;->previousClose:F

    .line 5
    iput-object p3, p0, Lcom/sma/smartv3/model/Stock;->previousCloseDate:Ljava/lang/String;

    .line 6
    iput-wide p4, p0, Lcom/sma/smartv3/model/Stock;->realTimeStamp:J

    .line 7
    iput-object v0, p0, Lcom/sma/smartv3/model/Stock;->realTimeStampRead:Ljava/lang/String;

    move/from16 p1, p7

    .line 8
    iput p1, p0, Lcom/sma/smartv3/model/Stock;->realTimeGmtOffset:I

    move/from16 p1, p8

    .line 9
    iput p1, p0, Lcom/sma/smartv3/model/Stock;->realTimeOpen:F

    move/from16 p1, p9

    .line 10
    iput p1, p0, Lcom/sma/smartv3/model/Stock;->realTimeHigh:F

    move/from16 p1, p10

    .line 11
    iput p1, p0, Lcom/sma/smartv3/model/Stock;->realTimeLow:F

    move/from16 p1, p11

    .line 12
    iput p1, p0, Lcom/sma/smartv3/model/Stock;->realTimeClose:F

    move-wide/from16 p1, p12

    .line 13
    iput-wide p1, p0, Lcom/sma/smartv3/model/Stock;->realTimeVolume:J

    move/from16 p1, p14

    .line 14
    iput p1, p0, Lcom/sma/smartv3/model/Stock;->realTimeChange:F

    move/from16 p1, p15

    .line 15
    iput p1, p0, Lcom/sma/smartv3/model/Stock;->realTimeChangePercentage:F

    move/from16 p1, p16

    .line 16
    iput p1, p0, Lcom/sma/smartv3/model/Stock;->realTimePreviousClose:F

    move-wide/from16 p1, p17

    .line 17
    iput-wide p1, p0, Lcom/sma/smartv3/model/Stock;->updateTime:J

    .line 18
    iput-object v1, p0, Lcom/sma/smartv3/model/Stock;->country:Ljava/lang/String;

    .line 19
    iput-object v2, p0, Lcom/sma/smartv3/model/Stock;->currency:Ljava/lang/String;

    .line 20
    iput-object v3, p0, Lcom/sma/smartv3/model/Stock;->name:Ljava/lang/String;

    .line 21
    iput-object v4, p0, Lcom/sma/smartv3/model/Stock;->type:Ljava/lang/String;

    .line 22
    iput-object v5, p0, Lcom/sma/smartv3/model/Stock;->code:Ljava/lang/String;

    .line 23
    iput-object v6, p0, Lcom/sma/smartv3/model/Stock;->exchange:Ljava/lang/String;

    .line 24
    iput-object v7, p0, Lcom/sma/smartv3/model/Stock;->exchangeInfo:Ljava/lang/String;

    .line 25
    iput-object v8, p0, Lcom/sma/smartv3/model/Stock;->isin:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(IFLjava/lang/String;JLjava/lang/String;IFFFFJFFFJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 27

    move/from16 v0, p27

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move v1, v2

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
    and-int/lit8 v5, v0, 0x4

    .line 26
    const-string v6, ""

    if-eqz v5, :cond_2

    move-object v5, v6

    goto :goto_2

    :cond_2
    move-object/from16 v5, p3

    :goto_2
    and-int/lit8 v7, v0, 0x8

    if-eqz v7, :cond_3

    const-wide/16 v10, 0x0

    goto :goto_3

    :cond_3
    move-wide/from16 v10, p4

    :goto_3
    and-int/lit8 v7, v0, 0x10

    if-eqz v7, :cond_4

    move-object v7, v6

    goto :goto_4

    :cond_4
    move-object/from16 v7, p6

    :goto_4
    and-int/lit8 v12, v0, 0x20

    if-eqz v12, :cond_5

    goto :goto_5

    :cond_5
    move/from16 v2, p7

    :goto_5
    and-int/lit8 v12, v0, 0x40

    if-eqz v12, :cond_6

    const/4 v12, 0x0

    goto :goto_6

    :cond_6
    move/from16 v12, p8

    :goto_6
    and-int/lit16 v13, v0, 0x80

    if-eqz v13, :cond_7

    const/4 v13, 0x0

    goto :goto_7

    :cond_7
    move/from16 v13, p9

    :goto_7
    and-int/lit16 v14, v0, 0x100

    if-eqz v14, :cond_8

    const/4 v14, 0x0

    goto :goto_8

    :cond_8
    move/from16 v14, p10

    :goto_8
    and-int/lit16 v15, v0, 0x200

    if-eqz v15, :cond_9

    const/4 v15, 0x0

    goto :goto_9

    :cond_9
    move/from16 v15, p11

    :goto_9
    and-int/lit16 v4, v0, 0x400

    if-eqz v4, :cond_a

    const-wide/16 v16, 0x0

    goto :goto_a

    :cond_a
    move-wide/from16 v16, p12

    :goto_a
    and-int/lit16 v4, v0, 0x800

    if-eqz v4, :cond_b

    const/4 v4, 0x0

    goto :goto_b

    :cond_b
    move/from16 v4, p14

    :goto_b
    and-int/lit16 v8, v0, 0x1000

    if-eqz v8, :cond_c

    const/4 v8, 0x0

    goto :goto_c

    :cond_c
    move/from16 v8, p15

    :goto_c
    and-int/lit16 v9, v0, 0x2000

    if-eqz v9, :cond_d

    const/4 v9, 0x0

    goto :goto_d

    :cond_d
    move/from16 v9, p16

    :goto_d
    move/from16 p1, v1

    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_e

    const-wide/16 v18, 0x0

    goto :goto_e

    :cond_e
    move-wide/from16 v18, p17

    :goto_e
    const v1, 0x8000

    and-int/2addr v1, v0

    if-eqz v1, :cond_f

    move-object v1, v6

    goto :goto_f

    :cond_f
    move-object/from16 v1, p19

    :goto_f
    const/high16 v20, 0x10000

    and-int v20, v0, v20

    if-eqz v20, :cond_10

    move-object/from16 v20, v6

    goto :goto_10

    :cond_10
    move-object/from16 v20, p20

    :goto_10
    const/high16 v21, 0x20000

    and-int v21, v0, v21

    if-eqz v21, :cond_11

    move-object/from16 v21, v6

    goto :goto_11

    :cond_11
    move-object/from16 v21, p21

    :goto_11
    const/high16 v22, 0x40000

    and-int v22, v0, v22

    if-eqz v22, :cond_12

    move-object/from16 v22, v6

    goto :goto_12

    :cond_12
    move-object/from16 v22, p22

    :goto_12
    const/high16 v23, 0x80000

    and-int v23, v0, v23

    if-eqz v23, :cond_13

    move-object/from16 v23, v6

    goto :goto_13

    :cond_13
    move-object/from16 v23, p23

    :goto_13
    const/high16 v24, 0x100000

    and-int v24, v0, v24

    if-eqz v24, :cond_14

    move-object/from16 v24, v6

    goto :goto_14

    :cond_14
    move-object/from16 v24, p24

    :goto_14
    const/high16 v25, 0x200000

    and-int v25, v0, v25

    if-eqz v25, :cond_15

    move-object/from16 v25, v6

    goto :goto_15

    :cond_15
    move-object/from16 v25, p25

    :goto_15
    const/high16 v26, 0x400000

    and-int v0, v0, v26

    if-eqz v0, :cond_16

    move-object/from16 p27, v6

    :goto_16
    move/from16 p2, p1

    move-object/from16 p20, v1

    move/from16 p8, v2

    move/from16 p3, v3

    move/from16 p15, v4

    move-object/from16 p4, v5

    move-object/from16 p7, v7

    move/from16 p16, v8

    move/from16 p17, v9

    move-wide/from16 p5, v10

    move/from16 p9, v12

    move/from16 p10, v13

    move/from16 p11, v14

    move/from16 p12, v15

    move-wide/from16 p13, v16

    move-wide/from16 p18, v18

    move-object/from16 p21, v20

    move-object/from16 p22, v21

    move-object/from16 p23, v22

    move-object/from16 p24, v23

    move-object/from16 p25, v24

    move-object/from16 p26, v25

    move-object/from16 p1, p0

    goto :goto_17

    :cond_16
    move-object/from16 p27, p26

    goto :goto_16

    :goto_17
    invoke-direct/range {p1 .. p27}, Lcom/sma/smartv3/model/Stock;-><init>(IFLjava/lang/String;JLjava/lang/String;IFFFFJFFFJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/model/Stock;IFLjava/lang/String;JLjava/lang/String;IFFFFJFFFJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/sma/smartv3/model/Stock;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p27

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget v2, v0, Lcom/sma/smartv3/model/Stock;->id:I

    goto :goto_0

    :cond_0
    move/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget v3, v0, Lcom/sma/smartv3/model/Stock;->previousClose:F

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/sma/smartv3/model/Stock;->previousCloseDate:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-wide v5, v0, Lcom/sma/smartv3/model/Stock;->realTimeStamp:J

    goto :goto_3

    :cond_3
    move-wide/from16 v5, p4

    :goto_3
    and-int/lit8 v7, v1, 0x10

    if-eqz v7, :cond_4

    iget-object v7, v0, Lcom/sma/smartv3/model/Stock;->realTimeStampRead:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v7, p6

    :goto_4
    and-int/lit8 v8, v1, 0x20

    if-eqz v8, :cond_5

    iget v8, v0, Lcom/sma/smartv3/model/Stock;->realTimeGmtOffset:I

    goto :goto_5

    :cond_5
    move/from16 v8, p7

    :goto_5
    and-int/lit8 v9, v1, 0x40

    if-eqz v9, :cond_6

    iget v9, v0, Lcom/sma/smartv3/model/Stock;->realTimeOpen:F

    goto :goto_6

    :cond_6
    move/from16 v9, p8

    :goto_6
    and-int/lit16 v10, v1, 0x80

    if-eqz v10, :cond_7

    iget v10, v0, Lcom/sma/smartv3/model/Stock;->realTimeHigh:F

    goto :goto_7

    :cond_7
    move/from16 v10, p9

    :goto_7
    and-int/lit16 v11, v1, 0x100

    if-eqz v11, :cond_8

    iget v11, v0, Lcom/sma/smartv3/model/Stock;->realTimeLow:F

    goto :goto_8

    :cond_8
    move/from16 v11, p10

    :goto_8
    and-int/lit16 v12, v1, 0x200

    if-eqz v12, :cond_9

    iget v12, v0, Lcom/sma/smartv3/model/Stock;->realTimeClose:F

    goto :goto_9

    :cond_9
    move/from16 v12, p11

    :goto_9
    and-int/lit16 v13, v1, 0x400

    if-eqz v13, :cond_a

    iget-wide v13, v0, Lcom/sma/smartv3/model/Stock;->realTimeVolume:J

    goto :goto_a

    :cond_a
    move-wide/from16 v13, p12

    :goto_a
    and-int/lit16 v15, v1, 0x800

    if-eqz v15, :cond_b

    iget v15, v0, Lcom/sma/smartv3/model/Stock;->realTimeChange:F

    goto :goto_b

    :cond_b
    move/from16 v15, p14

    :goto_b
    move/from16 p1, v2

    and-int/lit16 v2, v1, 0x1000

    if-eqz v2, :cond_c

    iget v2, v0, Lcom/sma/smartv3/model/Stock;->realTimeChangePercentage:F

    goto :goto_c

    :cond_c
    move/from16 v2, p15

    :goto_c
    move/from16 p2, v2

    and-int/lit16 v2, v1, 0x2000

    if-eqz v2, :cond_d

    iget v2, v0, Lcom/sma/smartv3/model/Stock;->realTimePreviousClose:F

    goto :goto_d

    :cond_d
    move/from16 v2, p16

    :goto_d
    move/from16 p3, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-wide v1, v0, Lcom/sma/smartv3/model/Stock;->updateTime:J

    goto :goto_e

    :cond_e
    move-wide/from16 v1, p17

    :goto_e
    const v16, 0x8000

    and-int v16, p27, v16

    move-wide/from16 p4, v1

    if-eqz v16, :cond_f

    iget-object v1, v0, Lcom/sma/smartv3/model/Stock;->country:Ljava/lang/String;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p19

    :goto_f
    const/high16 v2, 0x10000

    and-int v2, p27, v2

    if-eqz v2, :cond_10

    iget-object v2, v0, Lcom/sma/smartv3/model/Stock;->currency:Ljava/lang/String;

    goto :goto_10

    :cond_10
    move-object/from16 v2, p20

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p27, v16

    move-object/from16 p6, v1

    if-eqz v16, :cond_11

    iget-object v1, v0, Lcom/sma/smartv3/model/Stock;->name:Ljava/lang/String;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p21

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p27, v16

    move-object/from16 p7, v1

    if-eqz v16, :cond_12

    iget-object v1, v0, Lcom/sma/smartv3/model/Stock;->type:Ljava/lang/String;

    goto :goto_12

    :cond_12
    move-object/from16 v1, p22

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, p27, v16

    move-object/from16 p8, v1

    if-eqz v16, :cond_13

    iget-object v1, v0, Lcom/sma/smartv3/model/Stock;->code:Ljava/lang/String;

    goto :goto_13

    :cond_13
    move-object/from16 v1, p23

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, p27, v16

    move-object/from16 p9, v1

    if-eqz v16, :cond_14

    iget-object v1, v0, Lcom/sma/smartv3/model/Stock;->exchange:Ljava/lang/String;

    goto :goto_14

    :cond_14
    move-object/from16 v1, p24

    :goto_14
    const/high16 v16, 0x200000

    and-int v16, p27, v16

    move-object/from16 p10, v1

    if-eqz v16, :cond_15

    iget-object v1, v0, Lcom/sma/smartv3/model/Stock;->exchangeInfo:Ljava/lang/String;

    goto :goto_15

    :cond_15
    move-object/from16 v1, p25

    :goto_15
    const/high16 v16, 0x400000

    and-int v16, p27, v16

    if-eqz v16, :cond_16

    move-object/from16 p11, v1

    iget-object v1, v0, Lcom/sma/smartv3/model/Stock;->isin:Ljava/lang/String;

    move-object/from16 p26, p11

    move-object/from16 p27, v1

    :goto_16
    move/from16 p16, p2

    move/from16 p17, p3

    move-wide/from16 p18, p4

    move-object/from16 p20, p6

    move-object/from16 p22, p7

    move-object/from16 p23, p8

    move-object/from16 p24, p9

    move-object/from16 p25, p10

    move-object/from16 p21, v2

    move/from16 p3, v3

    move-object/from16 p4, v4

    move-wide/from16 p5, v5

    move-object/from16 p7, v7

    move/from16 p8, v8

    move/from16 p9, v9

    move/from16 p10, v10

    move/from16 p11, v11

    move/from16 p12, v12

    move-wide/from16 p13, v13

    move/from16 p15, v15

    move/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_17

    :cond_16
    move-object/from16 p27, p26

    move-object/from16 p26, v1

    goto :goto_16

    :goto_17
    invoke-virtual/range {p1 .. p27}, Lcom/sma/smartv3/model/Stock;->copy(IFLjava/lang/String;JLjava/lang/String;IFFFFJFFFJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/sma/smartv3/model/Stock;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/Stock;->id:I

    return v0
.end method

.method public final component10()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/Stock;->realTimeClose:F

    return v0
.end method

.method public final component11()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/Stock;->realTimeVolume:J

    return-wide v0
.end method

.method public final component12()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/Stock;->realTimeChange:F

    return v0
.end method

.method public final component13()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/Stock;->realTimeChangePercentage:F

    return v0
.end method

.method public final component14()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/Stock;->realTimePreviousClose:F

    return v0
.end method

.method public final component15()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/Stock;->updateTime:J

    return-wide v0
.end method

.method public final component16()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/Stock;->country:Ljava/lang/String;

    return-object v0
.end method

.method public final component17()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/Stock;->currency:Ljava/lang/String;

    return-object v0
.end method

.method public final component18()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/Stock;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component19()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/Stock;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/Stock;->previousClose:F

    return v0
.end method

.method public final component20()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/Stock;->code:Ljava/lang/String;

    return-object v0
.end method

.method public final component21()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/Stock;->exchange:Ljava/lang/String;

    return-object v0
.end method

.method public final component22()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/Stock;->exchangeInfo:Ljava/lang/String;

    return-object v0
.end method

.method public final component23()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/Stock;->isin:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/Stock;->previousCloseDate:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/Stock;->realTimeStamp:J

    return-wide v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/Stock;->realTimeStampRead:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/Stock;->realTimeGmtOffset:I

    return v0
.end method

.method public final component7()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/Stock;->realTimeOpen:F

    return v0
.end method

.method public final component8()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/Stock;->realTimeHigh:F

    return v0
.end method

.method public final component9()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/Stock;->realTimeLow:F

    return v0
.end method

.method public final copy(IFLjava/lang/String;JLjava/lang/String;IFFFFJFFFJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/sma/smartv3/model/Stock;
    .locals 28
    .param p3    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p19    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p20    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p21    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p22    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p23    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p24    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p25    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p26    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "previousCloseDate"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "realTimeStampRead"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "country"

    move-object/from16 v1, p19

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currency"

    move-object/from16 v2, p20

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    move-object/from16 v3, p21

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    move-object/from16 v5, p22

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "code"

    move-object/from16 v6, p23

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "exchange"

    move-object/from16 v8, p24

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "exchangeInfo"

    move-object/from16 v9, p25

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isin"

    move-object/from16 v10, p26

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/model/Stock;

    move/from16 v11, p10

    move/from16 v12, p11

    move-wide/from16 v13, p12

    move/from16 v15, p14

    move/from16 v16, p15

    move/from16 v17, p16

    move-wide/from16 v18, p17

    move-object/from16 v20, p19

    move-object/from16 v21, v2

    move-object/from16 v22, v3

    move-object/from16 v23, v5

    move-object/from16 v24, v6

    move-object/from16 v25, v8

    move-object/from16 v26, v9

    move-object/from16 v27, v10

    move/from16 v2, p1

    move/from16 v3, p2

    move-wide/from16 v5, p4

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    invoke-direct/range {v1 .. v27}, Lcom/sma/smartv3/model/Stock;-><init>(IFLjava/lang/String;JLjava/lang/String;IFFFFJFFFJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

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
    instance-of v1, p1, Lcom/sma/smartv3/model/Stock;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/model/Stock;

    iget v1, p0, Lcom/sma/smartv3/model/Stock;->id:I

    iget v3, p1, Lcom/sma/smartv3/model/Stock;->id:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/sma/smartv3/model/Stock;->previousClose:F

    iget v3, p1, Lcom/sma/smartv3/model/Stock;->previousClose:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/sma/smartv3/model/Stock;->previousCloseDate:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/Stock;->previousCloseDate:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lcom/sma/smartv3/model/Stock;->realTimeStamp:J

    iget-wide v5, p1, Lcom/sma/smartv3/model/Stock;->realTimeStamp:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/sma/smartv3/model/Stock;->realTimeStampRead:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/Stock;->realTimeStampRead:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/sma/smartv3/model/Stock;->realTimeGmtOffset:I

    iget v3, p1, Lcom/sma/smartv3/model/Stock;->realTimeGmtOffset:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/sma/smartv3/model/Stock;->realTimeOpen:F

    iget v3, p1, Lcom/sma/smartv3/model/Stock;->realTimeOpen:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/sma/smartv3/model/Stock;->realTimeHigh:F

    iget v3, p1, Lcom/sma/smartv3/model/Stock;->realTimeHigh:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lcom/sma/smartv3/model/Stock;->realTimeLow:F

    iget v3, p1, Lcom/sma/smartv3/model/Stock;->realTimeLow:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lcom/sma/smartv3/model/Stock;->realTimeClose:F

    iget v3, p1, Lcom/sma/smartv3/model/Stock;->realTimeClose:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_b

    return v2

    :cond_b
    iget-wide v3, p0, Lcom/sma/smartv3/model/Stock;->realTimeVolume:J

    iget-wide v5, p1, Lcom/sma/smartv3/model/Stock;->realTimeVolume:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_c

    return v2

    :cond_c
    iget v1, p0, Lcom/sma/smartv3/model/Stock;->realTimeChange:F

    iget v3, p1, Lcom/sma/smartv3/model/Stock;->realTimeChange:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_d

    return v2

    :cond_d
    iget v1, p0, Lcom/sma/smartv3/model/Stock;->realTimeChangePercentage:F

    iget v3, p1, Lcom/sma/smartv3/model/Stock;->realTimeChangePercentage:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_e

    return v2

    :cond_e
    iget v1, p0, Lcom/sma/smartv3/model/Stock;->realTimePreviousClose:F

    iget v3, p1, Lcom/sma/smartv3/model/Stock;->realTimePreviousClose:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_f

    return v2

    :cond_f
    iget-wide v3, p0, Lcom/sma/smartv3/model/Stock;->updateTime:J

    iget-wide v5, p1, Lcom/sma/smartv3/model/Stock;->updateTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/sma/smartv3/model/Stock;->country:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/Stock;->country:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/sma/smartv3/model/Stock;->currency:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/Stock;->currency:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/sma/smartv3/model/Stock;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/Stock;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lcom/sma/smartv3/model/Stock;->type:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/Stock;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lcom/sma/smartv3/model/Stock;->code:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/Stock;->code:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lcom/sma/smartv3/model/Stock;->exchange:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/Stock;->exchange:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, Lcom/sma/smartv3/model/Stock;->exchangeInfo:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/Stock;->exchangeInfo:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, Lcom/sma/smartv3/model/Stock;->isin:Ljava/lang/String;

    iget-object p1, p1, Lcom/sma/smartv3/model/Stock;->isin:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_18

    return v2

    :cond_18
    return v0
.end method

.method public final getCode()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/Stock;->code:Ljava/lang/String;

    return-object v0
.end method

.method public final getCountry()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/Stock;->country:Ljava/lang/String;

    return-object v0
.end method

.method public final getCurrency()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/Stock;->currency:Ljava/lang/String;

    return-object v0
.end method

.method public final getExchange()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/Stock;->exchange:Ljava/lang/String;

    return-object v0
.end method

.method public final getExchangeInfo()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/Stock;->exchangeInfo:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/Stock;->id:I

    return v0
.end method

.method public final getIsin()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/Stock;->isin:Ljava/lang/String;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/Stock;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getPreviousClose()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/Stock;->previousClose:F

    return v0
.end method

.method public final getPreviousCloseDate()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/Stock;->previousCloseDate:Ljava/lang/String;

    return-object v0
.end method

.method public final getRealTimeChange()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/Stock;->realTimeChange:F

    return v0
.end method

.method public final getRealTimeChangePercentage()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/Stock;->realTimeChangePercentage:F

    return v0
.end method

.method public final getRealTimeClose()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/Stock;->realTimeClose:F

    return v0
.end method

.method public final getRealTimeGmtOffset()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/Stock;->realTimeGmtOffset:I

    return v0
.end method

.method public final getRealTimeHigh()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/Stock;->realTimeHigh:F

    return v0
.end method

.method public final getRealTimeLow()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/Stock;->realTimeLow:F

    return v0
.end method

.method public final getRealTimeOpen()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/Stock;->realTimeOpen:F

    return v0
.end method

.method public final getRealTimePreviousClose()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/Stock;->realTimePreviousClose:F

    return v0
.end method

.method public final getRealTimeStamp()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/Stock;->realTimeStamp:J

    return-wide v0
.end method

.method public final getRealTimeStampRead()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/Stock;->realTimeStampRead:Ljava/lang/String;

    return-object v0
.end method

.method public final getRealTimeVolume()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/Stock;->realTimeVolume:J

    return-wide v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/Stock;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final getUpdateTime()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/Stock;->updateTime:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/sma/smartv3/model/Stock;->id:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/Stock;->previousClose:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/Stock;->previousCloseDate:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/model/Stock;->realTimeStamp:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/Stock;->realTimeStampRead:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/Stock;->realTimeGmtOffset:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/Stock;->realTimeOpen:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/Stock;->realTimeHigh:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/Stock;->realTimeLow:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/Stock;->realTimeClose:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/model/Stock;->realTimeVolume:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/Stock;->realTimeChange:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/Stock;->realTimeChangePercentage:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/Stock;->realTimePreviousClose:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/model/Stock;->updateTime:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/Stock;->country:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/Stock;->currency:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/Stock;->name:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/Stock;->type:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/Stock;->code:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/Stock;->exchange:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/Stock;->exchangeInfo:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/Stock;->isin:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setCode(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/Stock;->code:Ljava/lang/String;

    return-void
.end method

.method public final setCountry(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/Stock;->country:Ljava/lang/String;

    return-void
.end method

.method public final setCurrency(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/Stock;->currency:Ljava/lang/String;

    return-void
.end method

.method public final setExchange(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/Stock;->exchange:Ljava/lang/String;

    return-void
.end method

.method public final setExchangeInfo(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/Stock;->exchangeInfo:Ljava/lang/String;

    return-void
.end method

.method public final setId(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/Stock;->id:I

    return-void
.end method

.method public final setIsin(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/Stock;->isin:Ljava/lang/String;

    return-void
.end method

.method public final setName(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/Stock;->name:Ljava/lang/String;

    return-void
.end method

.method public final setPreviousClose(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/Stock;->previousClose:F

    return-void
.end method

.method public final setPreviousCloseDate(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/Stock;->previousCloseDate:Ljava/lang/String;

    return-void
.end method

.method public final setRealTimeChange(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/Stock;->realTimeChange:F

    return-void
.end method

.method public final setRealTimeChangePercentage(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/Stock;->realTimeChangePercentage:F

    return-void
.end method

.method public final setRealTimeClose(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/Stock;->realTimeClose:F

    return-void
.end method

.method public final setRealTimeGmtOffset(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/Stock;->realTimeGmtOffset:I

    return-void
.end method

.method public final setRealTimeHigh(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/Stock;->realTimeHigh:F

    return-void
.end method

.method public final setRealTimeLow(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/Stock;->realTimeLow:F

    return-void
.end method

.method public final setRealTimeOpen(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/Stock;->realTimeOpen:F

    return-void
.end method

.method public final setRealTimePreviousClose(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/Stock;->realTimePreviousClose:F

    return-void
.end method

.method public final setRealTimeStamp(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/model/Stock;->realTimeStamp:J

    return-void
.end method

.method public final setRealTimeStampRead(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/Stock;->realTimeStampRead:Ljava/lang/String;

    return-void
.end method

.method public final setRealTimeVolume(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/model/Stock;->realTimeVolume:J

    return-void
.end method

.method public final setType(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/Stock;->type:Ljava/lang/String;

    return-void
.end method

.method public final setUpdateTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/model/Stock;->updateTime:J

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 28
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    move-object/from16 v0, p0

    iget v1, v0, Lcom/sma/smartv3/model/Stock;->id:I

    iget v2, v0, Lcom/sma/smartv3/model/Stock;->previousClose:F

    iget-object v3, v0, Lcom/sma/smartv3/model/Stock;->previousCloseDate:Ljava/lang/String;

    iget-wide v4, v0, Lcom/sma/smartv3/model/Stock;->realTimeStamp:J

    iget-object v6, v0, Lcom/sma/smartv3/model/Stock;->realTimeStampRead:Ljava/lang/String;

    iget v7, v0, Lcom/sma/smartv3/model/Stock;->realTimeGmtOffset:I

    iget v8, v0, Lcom/sma/smartv3/model/Stock;->realTimeOpen:F

    iget v9, v0, Lcom/sma/smartv3/model/Stock;->realTimeHigh:F

    iget v10, v0, Lcom/sma/smartv3/model/Stock;->realTimeLow:F

    iget v11, v0, Lcom/sma/smartv3/model/Stock;->realTimeClose:F

    iget-wide v12, v0, Lcom/sma/smartv3/model/Stock;->realTimeVolume:J

    iget v14, v0, Lcom/sma/smartv3/model/Stock;->realTimeChange:F

    iget v15, v0, Lcom/sma/smartv3/model/Stock;->realTimeChangePercentage:F

    move/from16 v16, v15

    iget v15, v0, Lcom/sma/smartv3/model/Stock;->realTimePreviousClose:F

    move/from16 v17, v14

    move/from16 v18, v15

    iget-wide v14, v0, Lcom/sma/smartv3/model/Stock;->updateTime:J

    move-wide/from16 v19, v14

    iget-object v14, v0, Lcom/sma/smartv3/model/Stock;->country:Ljava/lang/String;

    iget-object v15, v0, Lcom/sma/smartv3/model/Stock;->currency:Ljava/lang/String;

    move-object/from16 v21, v15

    iget-object v15, v0, Lcom/sma/smartv3/model/Stock;->name:Ljava/lang/String;

    move-object/from16 v22, v15

    iget-object v15, v0, Lcom/sma/smartv3/model/Stock;->type:Ljava/lang/String;

    move-object/from16 v23, v15

    iget-object v15, v0, Lcom/sma/smartv3/model/Stock;->code:Ljava/lang/String;

    move-object/from16 v24, v15

    iget-object v15, v0, Lcom/sma/smartv3/model/Stock;->exchange:Ljava/lang/String;

    move-object/from16 v25, v15

    iget-object v15, v0, Lcom/sma/smartv3/model/Stock;->exchangeInfo:Ljava/lang/String;

    move-object/from16 v26, v15

    iget-object v15, v0, Lcom/sma/smartv3/model/Stock;->isin:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v27, v15

    const-string v15, "Stock(id="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", previousClose="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", previousCloseDate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", realTimeStamp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", realTimeStampRead="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", realTimeGmtOffset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", realTimeOpen="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", realTimeHigh="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", realTimeLow="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", realTimeClose="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", realTimeVolume="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", realTimeChange="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", realTimeChangePercentage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", realTimePreviousClose="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", updateTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v19

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", country="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", currency="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", code="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", exchange="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", exchangeInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isin="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
