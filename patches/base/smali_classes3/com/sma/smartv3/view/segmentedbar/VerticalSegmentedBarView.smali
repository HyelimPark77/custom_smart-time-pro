.class public final Lcom/sma/smartv3/view/segmentedbar/VerticalSegmentedBarView;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nVerticalSegmentedBarView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VerticalSegmentedBarView.kt\ncom/sma/smartv3/view/segmentedbar/VerticalSegmentedBarView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,73:1\n1878#2,3:74\n1878#2,3:77\n*S KotlinDebug\n*F\n+ 1 VerticalSegmentedBarView.kt\ncom/sma/smartv3/view/segmentedbar/VerticalSegmentedBarView\n*L\n40#1:74,3\n47#1:77,3\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nVerticalSegmentedBarView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VerticalSegmentedBarView.kt\ncom/sma/smartv3/view/segmentedbar/VerticalSegmentedBarView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,73:1\n1878#2,3:74\n1878#2,3:77\n*S KotlinDebug\n*F\n+ 1 VerticalSegmentedBarView.kt\ncom/sma/smartv3/view/segmentedbar/VerticalSegmentedBarView\n*L\n40#1:74,3\n47#1:77,3\n*E\n"
    }
.end annotation


# instance fields
.field public final I1:Ljava/util/Set;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lkotlin/Pair<",
            "Ljava/lang/Integer;",
            "Landroid/graphics/RectF;",
            ">;>;"
        }
    .end annotation
.end field

.field public IO:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lcom/android/mltcode/paycertificationapi/iz3;",
            ">;"
        }
    .end annotation
.end field

.field public final X11iII1O1:Landroid/graphics/RectF;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public X1IX:F

.field public XXX11i:I

.field public final iX1O1:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/view/segmentedbar/VerticalSegmentedBarView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 2
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/view/segmentedbar/VerticalSegmentedBarView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/VerticalSegmentedBarView;->IO:Ljava/util/List;

    .line 5
    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/VerticalSegmentedBarView;->I1:Ljava/util/Set;

    .line 6
    new-instance p1, Landroid/graphics/Paint;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/VerticalSegmentedBarView;->iX1O1:Landroid/graphics/Paint;

    .line 7
    new-instance p2, Landroid/graphics/RectF;

    invoke-direct {p2}, Landroid/graphics/RectF;-><init>()V

    iput-object p2, p0, Lcom/sma/smartv3/view/segmentedbar/VerticalSegmentedBarView;->X11iII1O1:Landroid/graphics/RectF;

    const p2, -0xffff01

    .line 8
    iput p2, p0, Lcom/sma/smartv3/view/segmentedbar/VerticalSegmentedBarView;->XXX11i:I

    const/high16 p2, 0x41a00000    # 20.0f

    .line 9
    iput p2, p0, Lcom/sma/smartv3/view/segmentedbar/VerticalSegmentedBarView;->X1IX:F

    .line 10
    sget-object p2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 11
    iget p2, p0, Lcom/sma/smartv3/view/segmentedbar/VerticalSegmentedBarView;->XXX11i:I

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 12
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/view/segmentedbar/VerticalSegmentedBarView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 12
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v1, "canvas"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super/range {p0 .. p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    iget-object v1, p0, Lcom/sma/smartv3/view/segmentedbar/VerticalSegmentedBarView;->IO:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_4

    :cond_0
    iget-object v1, p0, Lcom/sma/smartv3/view/segmentedbar/VerticalSegmentedBarView;->I1:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->clear()V

    iget-object v1, p0, Lcom/sma/smartv3/view/segmentedbar/VerticalSegmentedBarView;->X11iII1O1:Landroid/graphics/RectF;

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    int-to-float v3, v3

    const/4 v4, 0x0

    invoke-virtual {v1, v4, v4, v2, v3}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v1, p0, Lcom/sma/smartv3/view/segmentedbar/VerticalSegmentedBarView;->IO:Ljava/util/List;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/android/mltcode/paycertificationapi/iz3;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/iz3;->XO0O10()F

    move-result v1

    iget-object v2, p0, Lcom/sma/smartv3/view/segmentedbar/VerticalSegmentedBarView;->IO:Ljava/util/List;

    invoke-static {v2}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/android/mltcode/paycertificationapi/iz3;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/iz3;->O00()F

    move-result v2

    iget-object v3, p0, Lcom/sma/smartv3/view/segmentedbar/VerticalSegmentedBarView;->X11iII1O1:Landroid/graphics/RectF;

    iget v4, v3, Landroid/graphics/RectF;->bottom:F

    iget v3, v3, Landroid/graphics/RectF;->top:F

    sub-float/2addr v4, v3

    sub-float/2addr v1, v2

    div-float/2addr v4, v1

    iget-object v1, p0, Lcom/sma/smartv3/view/segmentedbar/VerticalSegmentedBarView;->IO:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v3, 0x0

    move v5, v3

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    add-int/lit8 v7, v5, 0x1

    if-gez v5, :cond_1

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->XOX0O0()V

    :cond_1
    check-cast v6, Lcom/android/mltcode/paycertificationapi/iz3;

    iget-object v5, p0, Lcom/sma/smartv3/view/segmentedbar/VerticalSegmentedBarView;->X11iII1O1:Landroid/graphics/RectF;

    iget v5, v5, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {v6}, Lcom/android/mltcode/paycertificationapi/iz3;->XO0O10()F

    move-result v8

    sub-float/2addr v8, v2

    mul-float/2addr v8, v4

    sub-float/2addr v5, v8

    iget-object v8, p0, Lcom/sma/smartv3/view/segmentedbar/VerticalSegmentedBarView;->X11iII1O1:Landroid/graphics/RectF;

    iget v8, v8, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {v6}, Lcom/android/mltcode/paycertificationapi/iz3;->O00()F

    move-result v9

    sub-float/2addr v9, v2

    mul-float/2addr v9, v4

    sub-float/2addr v8, v9

    new-instance v9, Landroid/graphics/RectF;

    iget-object v10, p0, Lcom/sma/smartv3/view/segmentedbar/VerticalSegmentedBarView;->X11iII1O1:Landroid/graphics/RectF;

    iget v11, v10, Landroid/graphics/RectF;->left:F

    iget v10, v10, Landroid/graphics/RectF;->right:F

    invoke-direct {v9, v11, v5, v10, v8}, Landroid/graphics/RectF;-><init>(FFFF)V

    iget-object v5, p0, Lcom/sma/smartv3/view/segmentedbar/VerticalSegmentedBarView;->I1:Ljava/util/Set;

    invoke-virtual {v6}, Lcom/android/mltcode/paycertificationapi/iz3;->OXO1()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v6, v9}, Lkotlin/TuplesKt;->OXO1(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move v5, v7

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lcom/sma/smartv3/view/segmentedbar/VerticalSegmentedBarView;->I1:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v6

    iget-object v1, p0, Lcom/sma/smartv3/view/segmentedbar/VerticalSegmentedBarView;->I1:Ljava/util/Set;

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    add-int/lit8 v8, v3, 0x1

    if-gez v3, :cond_3

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->XOX0O0()V

    :cond_3
    check-cast v1, Lkotlin/Pair;

    iget-object v2, p0, Lcom/sma/smartv3/view/segmentedbar/VerticalSegmentedBarView;->iX1O1:Landroid/graphics/Paint;

    invoke-virtual {v1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setColor(I)V

    new-instance v2, Landroid/graphics/RectF;

    invoke-virtual {v1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/RectF;

    invoke-direct {v2, v1}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    if-eqz v3, :cond_5

    add-int/lit8 v1, v6, -0x1

    if-ne v3, v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/sma/smartv3/view/segmentedbar/VerticalSegmentedBarView;->iX1O1:Landroid/graphics/Paint;

    invoke-virtual {p1, v2, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    goto :goto_3

    :cond_5
    :goto_2
    iget v1, p0, Lcom/sma/smartv3/view/segmentedbar/VerticalSegmentedBarView;->X1IX:F

    iget-object v4, p0, Lcom/sma/smartv3/view/segmentedbar/VerticalSegmentedBarView;->iX1O1:Landroid/graphics/Paint;

    invoke-virtual {p1, v2, v1, v1, v4}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    const/4 v1, 0x1

    if-le v6, v1, :cond_7

    if-nez v3, :cond_6

    iget v1, v2, Landroid/graphics/RectF;->left:F

    iget v3, v2, Landroid/graphics/RectF;->top:F

    move v4, v3

    iget v3, v2, Landroid/graphics/RectF;->right:F

    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    iget v5, p0, Lcom/sma/smartv3/view/segmentedbar/VerticalSegmentedBarView;->X1IX:F

    sub-float/2addr v2, v5

    iget-object v5, p0, Lcom/sma/smartv3/view/segmentedbar/VerticalSegmentedBarView;->iX1O1:Landroid/graphics/Paint;

    move v0, v4

    move v4, v2

    move v2, v0

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto :goto_3

    :cond_6
    add-int/lit8 v0, v6, -0x1

    if-ne v3, v0, :cond_7

    iget v1, v2, Landroid/graphics/RectF;->left:F

    iget v0, v2, Landroid/graphics/RectF;->top:F

    iget v3, p0, Lcom/sma/smartv3/view/segmentedbar/VerticalSegmentedBarView;->X1IX:F

    add-float/2addr v0, v3

    iget v3, v2, Landroid/graphics/RectF;->right:F

    iget v4, v2, Landroid/graphics/RectF;->bottom:F

    iget-object v5, p0, Lcom/sma/smartv3/view/segmentedbar/VerticalSegmentedBarView;->iX1O1:Landroid/graphics/Paint;

    move v2, v0

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :cond_7
    :goto_3
    move v3, v8

    goto :goto_1

    :cond_8
    :goto_4
    return-void
.end method

.method public final setSegments(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/android/mltcode/paycertificationapi/iz3;",
            ">;)V"
        }
    .end annotation

    const-string v0, "segments"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/VerticalSegmentedBarView;->IO:Ljava/util/List;

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method
