.class public final Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# instance fields
.field private final content:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/util/websocket/data/TranslateOrderItemEntity;",
            ">;"
        }
    .end annotation
.end field

.field private final empty:Ljava/lang/Boolean;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final first:Ljava/lang/Boolean;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final last:Ljava/lang/Boolean;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final number:Ljava/lang/Integer;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final numberOfElements:Ljava/lang/Integer;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final pageable:Lcom/sma/smartv3/util/websocket/data/Pageable;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final size:Ljava/lang/Integer;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final sort:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/util/websocket/data/SortX;",
            ">;"
        }
    .end annotation
.end field

.field private final totalElements:Ljava/lang/Integer;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final totalPages:I


# direct methods
.method public constructor <init>()V
    .locals 14

    .line 1
    const/16 v12, 0x7ff

    const/4 v13, 0x0

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

    move-object v0, p0

    invoke-direct/range {v0 .. v13}, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;-><init>(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sma/smartv3/util/websocket/data/Pageable;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sma/smartv3/util/websocket/data/Pageable;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;I)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Boolean;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Boolean;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Boolean;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p5    # Ljava/lang/Integer;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p6    # Ljava/lang/Integer;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p7    # Lcom/sma/smartv3/util/websocket/data/Pageable;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p8    # Ljava/lang/Integer;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p9    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p10    # Ljava/lang/Integer;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/util/websocket/data/TranslateOrderItemEntity;",
            ">;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Lcom/sma/smartv3/util/websocket/data/Pageable;",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/util/websocket/data/SortX;",
            ">;",
            "Ljava/lang/Integer;",
            "I)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->content:Ljava/util/List;

    .line 4
    iput-object p2, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->empty:Ljava/lang/Boolean;

    .line 5
    iput-object p3, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->first:Ljava/lang/Boolean;

    .line 6
    iput-object p4, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->last:Ljava/lang/Boolean;

    .line 7
    iput-object p5, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->number:Ljava/lang/Integer;

    .line 8
    iput-object p6, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->numberOfElements:Ljava/lang/Integer;

    .line 9
    iput-object p7, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->pageable:Lcom/sma/smartv3/util/websocket/data/Pageable;

    .line 10
    iput-object p8, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->size:Ljava/lang/Integer;

    .line 11
    iput-object p9, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->sort:Ljava/util/List;

    .line 12
    iput-object p10, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->totalElements:Ljava/lang/Integer;

    .line 13
    iput p11, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->totalPages:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sma/smartv3/util/websocket/data/Pageable;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p13, p12, 0x1

    const/4 v0, 0x0

    if-eqz p13, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    move-object p4, v0

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    move-object p5, v0

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    move-object p6, v0

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    move-object p7, v0

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    move-object p8, v0

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    move-object p9, v0

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    move-object p10, v0

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    const/4 p11, 0x1

    :cond_a
    move p12, p11

    move-object p11, p10

    move-object p10, p9

    move-object p9, p8

    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 14
    invoke-direct/range {p1 .. p12}, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;-><init>(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sma/smartv3/util/websocket/data/Pageable;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;I)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sma/smartv3/util/websocket/data/Pageable;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;IILjava/lang/Object;)Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;
    .locals 0

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->content:Ljava/util/List;

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    iget-object p2, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->empty:Ljava/lang/Boolean;

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    iget-object p3, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->first:Ljava/lang/Boolean;

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    iget-object p4, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->last:Ljava/lang/Boolean;

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    iget-object p5, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->number:Ljava/lang/Integer;

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    iget-object p6, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->numberOfElements:Ljava/lang/Integer;

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    iget-object p7, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->pageable:Lcom/sma/smartv3/util/websocket/data/Pageable;

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    iget-object p8, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->size:Ljava/lang/Integer;

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    iget-object p9, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->sort:Ljava/util/List;

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    iget-object p10, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->totalElements:Ljava/lang/Integer;

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    iget p11, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->totalPages:I

    :cond_a
    move-object p12, p10

    move p13, p11

    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p13}, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->copy(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sma/smartv3/util/websocket/data/Pageable;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;I)Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/util/websocket/data/TranslateOrderItemEntity;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->content:Ljava/util/List;

    return-object v0
.end method

.method public final component10()Ljava/lang/Integer;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->totalElements:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->totalPages:I

    return v0
.end method

.method public final component2()Ljava/lang/Boolean;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->empty:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component3()Ljava/lang/Boolean;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->first:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component4()Ljava/lang/Boolean;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->last:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component5()Ljava/lang/Integer;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->number:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component6()Ljava/lang/Integer;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->numberOfElements:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component7()Lcom/sma/smartv3/util/websocket/data/Pageable;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->pageable:Lcom/sma/smartv3/util/websocket/data/Pageable;

    return-object v0
.end method

.method public final component8()Ljava/lang/Integer;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->size:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component9()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/util/websocket/data/SortX;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->sort:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sma/smartv3/util/websocket/data/Pageable;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;I)Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;
    .locals 12
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Boolean;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Boolean;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Boolean;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p5    # Ljava/lang/Integer;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p6    # Ljava/lang/Integer;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p7    # Lcom/sma/smartv3/util/websocket/data/Pageable;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p8    # Ljava/lang/Integer;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p9    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p10    # Ljava/lang/Integer;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/util/websocket/data/TranslateOrderItemEntity;",
            ">;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Lcom/sma/smartv3/util/websocket/data/Pageable;",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/util/websocket/data/SortX;",
            ">;",
            "Ljava/lang/Integer;",
            "I)",
            "Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;"
        }
    .end annotation

    new-instance v0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move/from16 v11, p11

    invoke-direct/range {v0 .. v11}, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;-><init>(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sma/smartv3/util/websocket/data/Pageable;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;I)V

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
    instance-of v1, p1, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;

    iget-object v1, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->content:Ljava/util/List;

    iget-object v3, p1, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->content:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->empty:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->empty:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->first:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->first:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->last:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->last:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->number:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->number:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->numberOfElements:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->numberOfElements:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->pageable:Lcom/sma/smartv3/util/websocket/data/Pageable;

    iget-object v3, p1, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->pageable:Lcom/sma/smartv3/util/websocket/data/Pageable;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->size:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->size:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->sort:Ljava/util/List;

    iget-object v3, p1, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->sort:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->totalElements:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->totalElements:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->totalPages:I

    iget p1, p1, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->totalPages:I

    if-eq v1, p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getContent()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/util/websocket/data/TranslateOrderItemEntity;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->content:Ljava/util/List;

    return-object v0
.end method

.method public final getEmpty()Ljava/lang/Boolean;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->empty:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getFirst()Ljava/lang/Boolean;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->first:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getLast()Ljava/lang/Boolean;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->last:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getNumber()Ljava/lang/Integer;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->number:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getNumberOfElements()Ljava/lang/Integer;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->numberOfElements:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getPageable()Lcom/sma/smartv3/util/websocket/data/Pageable;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->pageable:Lcom/sma/smartv3/util/websocket/data/Pageable;

    return-object v0
.end method

.method public final getSize()Ljava/lang/Integer;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->size:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getSort()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/util/websocket/data/SortX;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->sort:Ljava/util/List;

    return-object v0
.end method

.method public final getTotalElements()Ljava/lang/Integer;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->totalElements:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getTotalPages()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->totalPages:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->content:Ljava/util/List;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->empty:Ljava/lang/Boolean;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->first:Ljava/lang/Boolean;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->last:Ljava/lang/Boolean;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->number:Ljava/lang/Integer;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->numberOfElements:Ljava/lang/Integer;

    if-nez v2, :cond_5

    move v2, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->pageable:Lcom/sma/smartv3/util/websocket/data/Pageable;

    if-nez v2, :cond_6

    move v2, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Lcom/sma/smartv3/util/websocket/data/Pageable;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->size:Ljava/lang/Integer;

    if-nez v2, :cond_7

    move v2, v1

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->sort:Ljava/util/List;

    if-nez v2, :cond_8

    move v2, v1

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->totalElements:Ljava/lang/Integer;

    if-nez v2, :cond_9

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_9
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->totalPages:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 13
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->content:Ljava/util/List;

    iget-object v1, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->empty:Ljava/lang/Boolean;

    iget-object v2, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->first:Ljava/lang/Boolean;

    iget-object v3, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->last:Ljava/lang/Boolean;

    iget-object v4, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->number:Ljava/lang/Integer;

    iget-object v5, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->numberOfElements:Ljava/lang/Integer;

    iget-object v6, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->pageable:Lcom/sma/smartv3/util/websocket/data/Pageable;

    iget-object v7, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->size:Ljava/lang/Integer;

    iget-object v8, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->sort:Ljava/util/List;

    iget-object v9, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->totalElements:Ljava/lang/Integer;

    iget v10, p0, Lcom/sma/smartv3/util/websocket/data/TranslateOrderEntity;->totalPages:I

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "TranslateOrderEntity(content="

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", empty="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", first="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", last="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", number="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", numberOfElements="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", pageable="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", size="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", sort="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", totalElements="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", totalPages="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
