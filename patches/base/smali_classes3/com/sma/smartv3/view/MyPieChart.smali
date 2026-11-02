.class public final Lcom/sma/smartv3/view/MyPieChart;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/view/MyPieChart$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMyPieChart.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyPieChart.kt\ncom/sma/smartv3/view/MyPieChart\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,101:1\n1869#2,2:102\n*S KotlinDebug\n*F\n+ 1 MyPieChart.kt\ncom/sma/smartv3/view/MyPieChart\n*L\n82#1:102,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMyPieChart.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyPieChart.kt\ncom/sma/smartv3/view/MyPieChart\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,101:1\n1869#2,2:102\n*S KotlinDebug\n*F\n+ 1 MyPieChart.kt\ncom/sma/smartv3/view/MyPieChart\n*L\n82#1:102,2\n*E\n"
    }
.end annotation


# instance fields
.field public final I1:Ljava/util/ArrayList;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/view/MyPieChart$OXO1;",
            ">;"
        }
    .end annotation
.end field

.field public IO:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public X11iII1O1:I

.field public XXX11i:Landroid/graphics/RectF;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public iX1O1:I


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

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/view/MyPieChart;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/view/MyPieChart;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 8
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
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/view/MyPieChart;->I1:Ljava/util/ArrayList;

    .line 5
    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    iput-object p2, p0, Lcom/sma/smartv3/view/MyPieChart;->IO:Landroid/graphics/Paint;

    const/4 p3, -0x1

    .line 6
    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 7
    iget-object p2, p0, Lcom/sma/smartv3/view/MyPieChart;->IO:Landroid/graphics/Paint;

    if-eqz p2, :cond_0

    sget-object p3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 8
    :cond_0
    iget-object p2, p0, Lcom/sma/smartv3/view/MyPieChart;->IO:Landroid/graphics/Paint;

    if-eqz p2, :cond_1

    const/high16 p3, 0x41f00000    # 30.0f

    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 9
    :cond_1
    new-instance p2, Landroid/graphics/RectF;

    invoke-direct {p2}, Landroid/graphics/RectF;-><init>()V

    iput-object p2, p0, Lcom/sma/smartv3/view/MyPieChart;->XXX11i:Landroid/graphics/RectF;

    .line 10
    new-instance v0, Lcom/sma/smartv3/view/MyPieChart$OXO1;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const p3, 0x7f06023a

    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    const/16 v6, 0xc

    const/4 v7, 0x0

    const-wide/16 v1, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v7}, Lcom/sma/smartv3/view/MyPieChart$OXO1;-><init>(JIFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

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

    .line 11
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/view/MyPieChart;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public final OXO1(Ljava/util/ArrayList;)V
    .locals 6
    .param p1    # Ljava/util/ArrayList;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/view/MyPieChart$OXO1;",
            ">;)V"
        }
    .end annotation

    const-string v0, "datas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void

    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move v3, v1

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    const-string v5, "get(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Lcom/sma/smartv3/view/MyPieChart$OXO1;

    invoke-virtual {v4}, Lcom/sma/smartv3/view/MyPieChart$OXO1;->IO()J

    move-result-wide v4

    long-to-float v4, v4

    add-float/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    cmpg-float v0, v3, v1

    if-nez v0, :cond_2

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/view/MyPieChart$OXO1;

    const-wide/16 v4, 0x1

    invoke-virtual {v1, v4, v5}, Lcom/sma/smartv3/view/MyPieChart$OXO1;->X1ii(J)V

    invoke-virtual {v1}, Lcom/sma/smartv3/view/MyPieChart$OXO1;->IO()J

    move-result-wide v1

    long-to-float v1, v1

    add-float/2addr v3, v1

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-string v1, "iterator(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "next(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lcom/sma/smartv3/view/MyPieChart$OXO1;

    invoke-virtual {v1}, Lcom/sma/smartv3/view/MyPieChart$OXO1;->IO()J

    move-result-wide v4

    long-to-float v2, v4

    div-float/2addr v2, v3

    const/16 v4, 0x168

    int-to-float v4, v4

    mul-float/2addr v4, v2

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/view/MyPieChart$OXO1;->XXI(F)V

    invoke-virtual {v1, v4}, Lcom/sma/smartv3/view/MyPieChart$OXO1;->OIX0iXi(F)V

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lcom/sma/smartv3/view/MyPieChart;->I1:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lcom/sma/smartv3/view/MyPieChart;->I1:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 13
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v1, "canvas"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super/range {p0 .. p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    iget v1, p0, Lcom/sma/smartv3/view/MyPieChart;->iX1O1:I

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    iget v3, p0, Lcom/sma/smartv3/view/MyPieChart;->X11iII1O1:I

    int-to-float v3, v3

    div-float/2addr v3, v2

    invoke-virtual {p1, v1, v3}, Landroid/graphics/Canvas;->translate(FF)V

    iget v1, p0, Lcom/sma/smartv3/view/MyPieChart;->iX1O1:I

    iget v2, p0, Lcom/sma/smartv3/view/MyPieChart;->X11iII1O1:I

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    div-int/lit8 v1, v1, 0x4

    int-to-float v6, v1

    iget-object v1, p0, Lcom/sma/smartv3/view/MyPieChart;->I1:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    int-to-float v1, v1

    div-float v1, v6, v1

    const/4 v2, 0x2

    int-to-float v7, v2

    div-float v8, v1, v7

    iget-object v1, p0, Lcom/sma/smartv3/view/MyPieChart;->I1:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v9

    const/high16 v1, 0x42c80000    # 100.0f

    const/4 v2, 0x0

    move v10, v1

    move v11, v2

    :goto_0
    if-ge v11, v9, :cond_2

    iget-object v1, p0, Lcom/sma/smartv3/view/MyPieChart;->I1:Ljava/util/ArrayList;

    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "get(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v12, v1

    check-cast v12, Lcom/sma/smartv3/view/MyPieChart$OXO1;

    iget-object v1, p0, Lcom/sma/smartv3/view/MyPieChart;->IO:Landroid/graphics/Paint;

    if-eqz v1, :cond_0

    invoke-virtual {v12}, Lcom/sma/smartv3/view/MyPieChart$OXO1;->I0IIOi()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    :cond_0
    iget-object v1, p0, Lcom/sma/smartv3/view/MyPieChart;->XXX11i:Landroid/graphics/RectF;

    if-eqz v1, :cond_1

    neg-float v2, v6

    mul-float/2addr v2, v7

    int-to-float v3, v11

    mul-float/2addr v3, v8

    add-float/2addr v2, v3

    mul-float v4, v6, v7

    sub-float/2addr v4, v3

    invoke-virtual {v1, v2, v2, v4, v4}, Landroid/graphics/RectF;->set(FFFF)V

    :cond_1
    iget-object v1, p0, Lcom/sma/smartv3/view/MyPieChart;->XXX11i:Landroid/graphics/RectF;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    const/16 v2, 0x168

    int-to-float v2, v2

    sub-float/2addr v2, v10

    invoke-virtual {v12}, Lcom/sma/smartv3/view/MyPieChart$OXO1;->XOO0ii0()F

    move-result v3

    neg-float v3, v3

    iget-object v5, p0, Lcom/sma/smartv3/view/MyPieChart;->IO:Landroid/graphics/Paint;

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    const/4 v4, 0x1

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    invoke-virtual {v12}, Lcom/sma/smartv3/view/MyPieChart$OXO1;->XOO0ii0()F

    move-result v0

    add-float/2addr v10, v0

    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/sma/smartv3/view/MyPieChart;->IO:Landroid/graphics/Paint;

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f06078f

    invoke-static {v1, v2}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    :cond_3
    iget-object v0, p0, Lcom/sma/smartv3/view/MyPieChart;->XXX11i:Landroid/graphics/RectF;

    if-eqz v0, :cond_4

    neg-float v1, v6

    const/high16 v2, -0x3e900000    # -15.0f

    add-float/2addr v1, v2

    sub-float/2addr v6, v2

    invoke-virtual {v0, v1, v1, v6, v6}, Landroid/graphics/RectF;->set(FFFF)V

    :cond_4
    iget-object v1, p0, Lcom/sma/smartv3/view/MyPieChart;->XXX11i:Landroid/graphics/RectF;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iget-object v5, p0, Lcom/sma/smartv3/view/MyPieChart;->IO:Landroid/graphics/Paint;

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    const/4 v2, 0x0

    const/high16 v3, 0x43b40000    # 360.0f

    const/4 v4, 0x1

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    return-void
.end method

.method public onSizeChanged(IIII)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    iput p1, p0, Lcom/sma/smartv3/view/MyPieChart;->iX1O1:I

    iput p2, p0, Lcom/sma/smartv3/view/MyPieChart;->X11iII1O1:I

    return-void
.end method
