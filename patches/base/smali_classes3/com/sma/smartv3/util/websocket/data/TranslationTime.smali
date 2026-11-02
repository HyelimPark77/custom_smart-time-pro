.class public final Lcom/sma/smartv3/util/websocket/data/TranslationTime;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# instance fields
.field private final buyMin:F

.field private final freeList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/util/websocket/data/TranslationFreeTimeEntity;",
            ">;"
        }
    .end annotation
.end field

.field private final freeMin:F

.field private final getPointFlag:Ljava/lang/Integer;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final macAdd:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final points:Ljava/lang/Integer;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final totalBuyMin:F

.field private final translatedFree:Ljava/lang/Integer;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final translatedMin:Ljava/lang/Double;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final userId:I


# direct methods
.method public constructor <init>()V
    .locals 13

    .line 1
    const/16 v11, 0x3ff

    const/4 v12, 0x0

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

    move-object v0, p0

    invoke-direct/range {v0 .. v12}, Lcom/sma/smartv3/util/websocket/data/TranslationTime;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;IFFFLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;IFFFLjava/util/List;)V
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Integer;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Double;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Integer;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p10    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Double;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "IFFF",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/util/websocket/data/TranslationFreeTimeEntity;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->getPointFlag:Ljava/lang/Integer;

    .line 4
    iput-object p2, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->points:Ljava/lang/Integer;

    .line 5
    iput-object p3, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->translatedMin:Ljava/lang/Double;

    .line 6
    iput-object p4, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->translatedFree:Ljava/lang/Integer;

    .line 7
    iput-object p5, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->macAdd:Ljava/lang/String;

    .line 8
    iput p6, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->userId:I

    .line 9
    iput p7, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->freeMin:F

    .line 10
    iput p8, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->totalBuyMin:F

    .line 11
    iput p9, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->buyMin:F

    .line 12
    iput-object p10, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->freeList:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;IFFFLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    move/from16 v0, p11

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x0

    .line 13
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    if-eqz v1, :cond_0

    move-object p1, v3

    :cond_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    move-object p2, v3

    :cond_1
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_2

    const-wide/16 v4, 0x0

    .line 14
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p3

    :cond_2
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_3

    goto :goto_0

    :cond_3
    move-object v3, p4

    :goto_0
    and-int/lit8 v1, v0, 0x10

    const/4 v4, 0x0

    if-eqz v1, :cond_4

    move-object v1, v4

    goto :goto_1

    :cond_4
    move-object v1, p5

    :goto_1
    and-int/lit8 v5, v0, 0x20

    if-eqz v5, :cond_5

    goto :goto_2

    :cond_5
    move v2, p6

    :goto_2
    and-int/lit8 v5, v0, 0x40

    const/4 v6, 0x0

    if-eqz v5, :cond_6

    move v5, v6

    goto :goto_3

    :cond_6
    move/from16 v5, p7

    :goto_3
    and-int/lit16 v7, v0, 0x80

    if-eqz v7, :cond_7

    move v7, v6

    goto :goto_4

    :cond_7
    move/from16 v7, p8

    :goto_4
    and-int/lit16 v8, v0, 0x100

    if-eqz v8, :cond_8

    goto :goto_5

    :cond_8
    move/from16 v6, p9

    :goto_5
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_9

    move-object/from16 p11, v4

    :goto_6
    move-object p4, p3

    move-object p6, v1

    move/from16 p7, v2

    move-object p5, v3

    move/from16 p8, v5

    move/from16 p10, v6

    move/from16 p9, v7

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_7

    :cond_9
    move-object/from16 p11, p10

    goto :goto_6

    .line 15
    :goto_7
    invoke-direct/range {p1 .. p11}, Lcom/sma/smartv3/util/websocket/data/TranslationTime;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;IFFFLjava/util/List;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/util/websocket/data/TranslationTime;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;IFFFLjava/util/List;ILjava/lang/Object;)Lcom/sma/smartv3/util/websocket/data/TranslationTime;
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->getPointFlag:Ljava/lang/Integer;

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    iget-object p2, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->points:Ljava/lang/Integer;

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    iget-object p3, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->translatedMin:Ljava/lang/Double;

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    iget-object p4, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->translatedFree:Ljava/lang/Integer;

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    iget-object p5, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->macAdd:Ljava/lang/String;

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    iget p6, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->userId:I

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    iget p7, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->freeMin:F

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    iget p8, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->totalBuyMin:F

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    iget p9, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->buyMin:F

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    iget-object p10, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->freeList:Ljava/util/List;

    :cond_9
    move p11, p9

    move-object p12, p10

    move p9, p7

    move p10, p8

    move-object p7, p5

    move p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p12}, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->copy(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;IFFFLjava/util/List;)Lcom/sma/smartv3/util/websocket/data/TranslationTime;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/Integer;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->getPointFlag:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component10()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/util/websocket/data/TranslationFreeTimeEntity;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->freeList:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Ljava/lang/Integer;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->points:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component3()Ljava/lang/Double;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->translatedMin:Ljava/lang/Double;

    return-object v0
.end method

.method public final component4()Ljava/lang/Integer;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->translatedFree:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->macAdd:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->userId:I

    return v0
.end method

.method public final component7()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->freeMin:F

    return v0
.end method

.method public final component8()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->totalBuyMin:F

    return v0
.end method

.method public final component9()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->buyMin:F

    return v0
.end method

.method public final copy(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;IFFFLjava/util/List;)Lcom/sma/smartv3/util/websocket/data/TranslationTime;
    .locals 11
    .param p1    # Ljava/lang/Integer;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Integer;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Double;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Integer;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p10    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Double;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "IFFF",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/util/websocket/data/TranslationFreeTimeEntity;",
            ">;)",
            "Lcom/sma/smartv3/util/websocket/data/TranslationTime;"
        }
    .end annotation

    new-instance v0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object/from16 v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    move-object/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lcom/sma/smartv3/util/websocket/data/TranslationTime;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;IFFFLjava/util/List;)V

    return-object v0
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
    instance-of v1, p1, Lcom/sma/smartv3/util/websocket/data/TranslationTime;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/util/websocket/data/TranslationTime;

    iget-object v1, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->getPointFlag:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->getPointFlag:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->points:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->points:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->translatedMin:Ljava/lang/Double;

    iget-object v3, p1, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->translatedMin:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->translatedFree:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->translatedFree:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->macAdd:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->macAdd:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->userId:I

    iget v3, p1, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->userId:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->freeMin:F

    iget v3, p1, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->freeMin:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->totalBuyMin:F

    iget v3, p1, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->totalBuyMin:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->buyMin:F

    iget v3, p1, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->buyMin:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->freeList:Ljava/util/List;

    iget-object p1, p1, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->freeList:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getBuyMin()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->buyMin:F

    return v0
.end method

.method public final getFreeList()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/util/websocket/data/TranslationFreeTimeEntity;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->freeList:Ljava/util/List;

    return-object v0
.end method

.method public final getFreeMin()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->freeMin:F

    return v0
.end method

.method public final getGetPointFlag()Ljava/lang/Integer;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->getPointFlag:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getMacAdd()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->macAdd:Ljava/lang/String;

    return-object v0
.end method

.method public final getPoints()Ljava/lang/Integer;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->points:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getTotalBuyMin()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->totalBuyMin:F

    return v0
.end method

.method public final getTranslatedFree()Ljava/lang/Integer;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->translatedFree:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getTranslatedMin()Ljava/lang/Double;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->translatedMin:Ljava/lang/Double;

    return-object v0
.end method

.method public final getUserId()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->userId:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->getPointFlag:Ljava/lang/Integer;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->points:Ljava/lang/Integer;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->translatedMin:Ljava/lang/Double;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->translatedFree:Ljava/lang/Integer;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->macAdd:Ljava/lang/String;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->userId:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->freeMin:F

    invoke-static {v2}, Ljava/lang/Float;->hashCode(F)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->totalBuyMin:F

    invoke-static {v2}, Ljava/lang/Float;->hashCode(F)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->buyMin:F

    invoke-static {v2}, Ljava/lang/Float;->hashCode(F)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->freeList:Ljava/util/List;

    if-nez v2, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 12
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->getPointFlag:Ljava/lang/Integer;

    iget-object v1, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->points:Ljava/lang/Integer;

    iget-object v2, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->translatedMin:Ljava/lang/Double;

    iget-object v3, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->translatedFree:Ljava/lang/Integer;

    iget-object v4, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->macAdd:Ljava/lang/String;

    iget v5, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->userId:I

    iget v6, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->freeMin:F

    iget v7, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->totalBuyMin:F

    iget v8, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->buyMin:F

    iget-object v9, p0, Lcom/sma/smartv3/util/websocket/data/TranslationTime;->freeList:Ljava/util/List;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "TranslationTime(getPointFlag="

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", points="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", translatedMin="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", translatedFree="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", macAdd="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", userId="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", freeMin="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", totalBuyMin="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", buyMin="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", freeList="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
