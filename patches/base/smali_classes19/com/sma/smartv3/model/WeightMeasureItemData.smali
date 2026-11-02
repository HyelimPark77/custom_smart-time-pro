.class public final Lcom/sma/smartv3/model/WeightMeasureItemData;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nWeightMeasureData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeightMeasureData.kt\ncom/sma/smartv3/model/WeightMeasureItemData\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,572:1\n1869#2,2:573\n*S KotlinDebug\n*F\n+ 1 WeightMeasureData.kt\ncom/sma/smartv3/model/WeightMeasureItemData\n*L\n226#1:573,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nWeightMeasureData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeightMeasureData.kt\ncom/sma/smartv3/model/WeightMeasureItemData\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,572:1\n1869#2,2:573\n*S KotlinDebug\n*F\n+ 1 WeightMeasureData.kt\ncom/sma/smartv3/model/WeightMeasureItemData\n*L\n226#1:573,2\n*E\n"
    }
.end annotation


# instance fields
.field private gridViewImgs:[I
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private icon:I

.field private isMore:Z

.field private isShowBarView:Z

.field private isShowGridView:Z

.field private isShowLevel:Z

.field private isShowTips:Z

.field private isShowValue:Z

.field private level:I

.field private levelColor:[I
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private levelRange:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field

.field private levelRangeText:[Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private levelType:Lcom/sma/smartv3/model/LevelType;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private name:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private standerLevel:I

.field private tipText:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private unit:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private value:D


# direct methods
.method public constructor <init>(ILjava/lang/String;ZDLjava/lang/String;ZIILjava/util/List;[Ljava/lang/String;[ILcom/sma/smartv3/model/LevelType;ZZZ[IZLjava/lang/String;)V
    .locals 7
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p10    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p11    # [Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p12    # [I
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p13    # Lcom/sma/smartv3/model/LevelType;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p17    # [I
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p19    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "ZD",
            "Ljava/lang/String;",
            "ZII",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;[",
            "Ljava/lang/String;",
            "[I",
            "Lcom/sma/smartv3/model/LevelType;",
            "ZZZ[IZ",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p10

    move-object/from16 v1, p11

    move-object/from16 v2, p12

    move-object/from16 v3, p13

    move-object/from16 v4, p17

    move-object/from16 v5, p19

    const-string v6, "name"

    invoke-static {p2, v6}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "unit"

    invoke-static {p6, v6}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "levelRange"

    invoke-static {v0, v6}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "levelRangeText"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "levelColor"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "levelType"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "gridViewImgs"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "tipText"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->icon:I

    .line 3
    iput-object p2, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->name:Ljava/lang/String;

    .line 4
    iput-boolean p3, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->isShowValue:Z

    .line 5
    iput-wide p4, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->value:D

    .line 6
    iput-object p6, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->unit:Ljava/lang/String;

    .line 7
    iput-boolean p7, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->isShowLevel:Z

    move p1, p8

    .line 8
    iput p1, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->standerLevel:I

    move/from16 p1, p9

    .line 9
    iput p1, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->level:I

    .line 10
    iput-object v0, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->levelRange:Ljava/util/List;

    .line 11
    iput-object v1, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->levelRangeText:[Ljava/lang/String;

    .line 12
    iput-object v2, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->levelColor:[I

    .line 13
    iput-object v3, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->levelType:Lcom/sma/smartv3/model/LevelType;

    move/from16 p1, p14

    .line 14
    iput-boolean p1, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->isMore:Z

    move/from16 p1, p15

    .line 15
    iput-boolean p1, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->isShowBarView:Z

    move/from16 p1, p16

    .line 16
    iput-boolean p1, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->isShowGridView:Z

    .line 17
    iput-object v4, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->gridViewImgs:[I

    move/from16 p1, p18

    .line 18
    iput-boolean p1, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->isShowTips:Z

    .line 19
    iput-object v5, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->tipText:Ljava/lang/String;

    .line 20
    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object p1

    const p2, 0x7f140dff

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p6, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 21
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 22
    iget-object p2, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->levelRange:Ljava/util/List;

    check-cast p2, Ljava/lang/Iterable;

    .line 23
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->doubleValue()D

    move-result-wide p3

    .line 24
    invoke-static {p3, p4}, Lcom/sma/smartv3/model/WeightMeasureDataKt;->kg2Lbs(D)D

    move-result-wide p3

    invoke-static {p3, p4}, Lcom/sma/smartv3/model/WeightMeasureDataKt;->centigradeFilter(D)D

    move-result-wide p3

    invoke-static {p3, p4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p3

    invoke-interface {p1, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 25
    :cond_0
    iput-object p1, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->levelRange:Ljava/util/List;

    .line 26
    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->levelRangeText:[Ljava/lang/String;

    array-length p1, p1

    if-nez p1, :cond_2

    const/4 p1, 0x1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    if-nez p1, :cond_3

    .line 27
    iget-wide p1, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->value:D

    iget-object p3, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->levelRange:Ljava/util/List;

    invoke-static {p1, p2, p3}, Lcom/sma/smartv3/model/WeightMeasureDataKt;->getLevel(DLjava/util/List;)I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->level:I

    .line 28
    :cond_3
    iget p1, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->level:I

    if-eqz p1, :cond_4

    iget-object p2, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->levelRangeText:[Ljava/lang/String;

    array-length p2, p2

    if-gt p1, p2, :cond_4

    iget-object p1, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->levelRange:Ljava/util/List;

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_4

    .line 29
    iget p1, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->standerLevel:I

    iget p2, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->level:I

    invoke-static {p1, p2}, Lcom/sma/smartv3/model/WeightMeasureDataKt;->getLevelType(II)Lcom/sma/smartv3/model/LevelType;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->levelType:Lcom/sma/smartv3/model/LevelType;

    :cond_4
    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;ZDLjava/lang/String;ZIILjava/util/List;[Ljava/lang/String;[ILcom/sma/smartv3/model/LevelType;ZZZ[IZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 23

    move/from16 v0, p20

    and-int/lit8 v1, v0, 0x4

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move v6, v2

    goto :goto_0

    :cond_0
    move/from16 v6, p3

    :goto_0
    and-int/lit8 v1, v0, 0x10

    .line 30
    const-string v3, ""

    if-eqz v1, :cond_1

    move-object v9, v3

    goto :goto_1

    :cond_1
    move-object/from16 v9, p6

    :goto_1
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_2

    move v10, v2

    goto :goto_2

    :cond_2
    move/from16 v10, p7

    :goto_2
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_3

    move v11, v2

    goto :goto_3

    :cond_3
    move/from16 v11, p8

    :goto_3
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_4

    move v12, v2

    goto :goto_4

    :cond_4
    move/from16 v12, p9

    :goto_4
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_5

    .line 31
    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object v1

    move-object v13, v1

    goto :goto_5

    :cond_5
    move-object/from16 v13, p10

    :goto_5
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_6

    .line 32
    new-array v1, v2, [Ljava/lang/String;

    move-object v14, v1

    goto :goto_6

    :cond_6
    move-object/from16 v14, p11

    :goto_6
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_7

    new-array v1, v2, [I

    move-object v15, v1

    goto :goto_7

    :cond_7
    move-object/from16 v15, p12

    :goto_7
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_8

    .line 33
    sget-object v1, Lcom/sma/smartv3/model/LevelType;->ALL:Lcom/sma/smartv3/model/LevelType;

    move-object/from16 v16, v1

    goto :goto_8

    :cond_8
    move-object/from16 v16, p13

    :goto_8
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_9

    const/4 v1, 0x1

    move/from16 v17, v1

    goto :goto_9

    :cond_9
    move/from16 v17, p14

    :goto_9
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_a

    move/from16 v18, v2

    goto :goto_a

    :cond_a
    move/from16 v18, p15

    :goto_a
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_b

    move/from16 v19, v2

    goto :goto_b

    :cond_b
    move/from16 v19, p16

    :goto_b
    const v1, 0x8000

    and-int/2addr v1, v0

    if-eqz v1, :cond_c

    .line 34
    new-array v1, v2, [I

    move-object/from16 v20, v1

    goto :goto_c

    :cond_c
    move-object/from16 v20, p17

    :goto_c
    const/high16 v1, 0x10000

    and-int/2addr v1, v0

    if-eqz v1, :cond_d

    move/from16 v21, v2

    goto :goto_d

    :cond_d
    move/from16 v21, p18

    :goto_d
    const/high16 v1, 0x20000

    and-int/2addr v0, v1

    if-eqz v0, :cond_e

    move-object/from16 v22, v3

    move/from16 v4, p1

    move-object/from16 v5, p2

    move-wide/from16 v7, p4

    move-object/from16 v3, p0

    goto :goto_e

    :cond_e
    move-object/from16 v22, p19

    move-object/from16 v3, p0

    move/from16 v4, p1

    move-object/from16 v5, p2

    move-wide/from16 v7, p4

    :goto_e
    invoke-direct/range {v3 .. v22}, Lcom/sma/smartv3/model/WeightMeasureItemData;-><init>(ILjava/lang/String;ZDLjava/lang/String;ZIILjava/util/List;[Ljava/lang/String;[ILcom/sma/smartv3/model/LevelType;ZZZ[IZLjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final getGridViewImgs()[I
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->gridViewImgs:[I

    return-object v0
.end method

.method public final getIcon()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->icon:I

    return v0
.end method

.method public final getLevel()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->level:I

    return v0
.end method

.method public final getLevelColor()[I
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->levelColor:[I

    return-object v0
.end method

.method public final getLevelRange()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->levelRange:Ljava/util/List;

    return-object v0
.end method

.method public final getLevelRangeText()[Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->levelRangeText:[Ljava/lang/String;

    return-object v0
.end method

.method public final getLevelType()Lcom/sma/smartv3/model/LevelType;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->levelType:Lcom/sma/smartv3/model/LevelType;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getStanderLevel()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->standerLevel:I

    return v0
.end method

.method public final getTipText()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->tipText:Ljava/lang/String;

    return-object v0
.end method

.method public final getUnit()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->unit:Ljava/lang/String;

    return-object v0
.end method

.method public final getValue()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->value:D

    return-wide v0
.end method

.method public final isMore()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->isMore:Z

    return v0
.end method

.method public final isShowBarView()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->isShowBarView:Z

    return v0
.end method

.method public final isShowGridView()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->isShowGridView:Z

    return v0
.end method

.method public final isShowLevel()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->isShowLevel:Z

    return v0
.end method

.method public final isShowTips()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->isShowTips:Z

    return v0
.end method

.method public final isShowValue()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->isShowValue:Z

    return v0
.end method

.method public final setGridViewImgs([I)V
    .locals 1
    .param p1    # [I
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->gridViewImgs:[I

    return-void
.end method

.method public final setIcon(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->icon:I

    return-void
.end method

.method public final setLevel(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->level:I

    return-void
.end method

.method public final setLevelColor([I)V
    .locals 1
    .param p1    # [I
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->levelColor:[I

    return-void
.end method

.method public final setLevelRange(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->levelRange:Ljava/util/List;

    return-void
.end method

.method public final setLevelRangeText([Ljava/lang/String;)V
    .locals 1
    .param p1    # [Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->levelRangeText:[Ljava/lang/String;

    return-void
.end method

.method public final setLevelType(Lcom/sma/smartv3/model/LevelType;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/model/LevelType;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->levelType:Lcom/sma/smartv3/model/LevelType;

    return-void
.end method

.method public final setMore(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->isMore:Z

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

    iput-object p1, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->name:Ljava/lang/String;

    return-void
.end method

.method public final setShowBarView(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->isShowBarView:Z

    return-void
.end method

.method public final setShowGridView(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->isShowGridView:Z

    return-void
.end method

.method public final setShowLevel(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->isShowLevel:Z

    return-void
.end method

.method public final setShowTips(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->isShowTips:Z

    return-void
.end method

.method public final setShowValue(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->isShowValue:Z

    return-void
.end method

.method public final setStanderLevel(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->standerLevel:I

    return-void
.end method

.method public final setTipText(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->tipText:Ljava/lang/String;

    return-void
.end method

.method public final setUnit(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->unit:Ljava/lang/String;

    return-void
.end method

.method public final setValue(D)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/model/WeightMeasureItemData;->value:D

    return-void
.end method
