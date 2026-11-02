.class public final Lcom/sma/smartv3/view/ScaleSeekBar;
.super Landroidx/appcompat/widget/AppCompatSeekBar;
.source "SourceFile"


# instance fields
.field private isShowTopOfThumb:Z

.field private mScaleColor:I

.field private mScaleCount:I

.field private mScalePaint:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mScaleWidth:I


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

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/view/ScaleSeekBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/view/ScaleSeekBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatSeekBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x1

    .line 4
    iput p1, p0, Lcom/sma/smartv3/view/ScaleSeekBar;->mScaleCount:I

    .line 5
    iput p1, p0, Lcom/sma/smartv3/view/ScaleSeekBar;->mScaleWidth:I

    const/high16 p2, -0x1000000

    .line 6
    iput p2, p0, Lcom/sma/smartv3/view/ScaleSeekBar;->mScaleColor:I

    .line 7
    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    iput-object p2, p0, Lcom/sma/smartv3/view/ScaleSeekBar;->mScalePaint:Landroid/graphics/Paint;

    .line 8
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iget p3, p0, Lcom/sma/smartv3/view/ScaleSeekBar;->mScaleColor:I

    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 9
    iget-object p2, p0, Lcom/sma/smartv3/view/ScaleSeekBar;->mScalePaint:Landroid/graphics/Paint;

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    const/4 p1, 0x0

    .line 10
    invoke-virtual {p0, p1}, Landroid/widget/AbsSeekBar;->setSplitTrack(Z)V

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
    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/view/ScaleSeekBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public declared-synchronized onDraw(Landroid/graphics/Canvas;)V
    .locals 12
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    monitor-enter p0

    :try_start_0
    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatSeekBar;->onDraw(Landroid/graphics/Canvas;)V

    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getMax()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/sma/smartv3/view/ScaleSeekBar;->mScaleCount:I

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    if-lez v0, :cond_4

    iget v0, p0, Lcom/sma/smartv3/view/ScaleSeekBar;->mScaleCount:I

    if-gtz v0, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    sub-int/2addr v0, v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    sub-int/2addr v0, v2

    iget v2, p0, Lcom/sma/smartv3/view/ScaleSeekBar;->mScaleCount:I

    iget v3, p0, Lcom/sma/smartv3/view/ScaleSeekBar;->mScaleWidth:I

    mul-int/2addr v3, v2

    sub-int/2addr v0, v3

    add-int/2addr v2, v1

    div-int/2addr v0, v2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    invoke-virtual {p0}, Landroid/view/View;->getMinimumHeight()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    sub-int/2addr v2, v3

    invoke-virtual {p0}, Landroid/view/View;->getMinimumHeight()I

    move-result v3

    mul-int/lit8 v3, v3, 0x2

    div-int/lit8 v3, v3, 0x5

    add-int/2addr v2, v3

    invoke-virtual {p0}, Landroid/view/View;->getMinimumHeight()I

    move-result v3

    div-int/lit8 v3, v3, 0x5

    add-int/2addr v3, v2

    invoke-virtual {p0}, Landroid/widget/AbsSeekBar;->getThumb()Landroid/graphics/drawable/Drawable;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {p0}, Landroid/widget/AbsSeekBar;->getThumb()Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v4

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_4

    :cond_1
    const/4 v4, 0x0

    :goto_0
    iget v5, p0, Lcom/sma/smartv3/view/ScaleSeekBar;->mScaleCount:I

    if-gt v1, v5, :cond_3

    :goto_1
    mul-int v6, v1, v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v7

    add-int/2addr v6, v7

    iget v7, p0, Lcom/sma/smartv3/view/ScaleSeekBar;->mScaleWidth:I

    add-int/2addr v6, v7

    mul-int/lit8 v7, v7, 0x2

    add-int/2addr v7, v6

    iget-boolean v8, p0, Lcom/sma/smartv3/view/ScaleSeekBar;->isShowTopOfThumb:Z

    if-nez v8, :cond_2

    if-eqz v4, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v8

    sub-int v8, v6, v8

    iget v9, v4, Landroid/graphics/Rect;->left:I

    if-le v8, v9, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v8

    sub-int v8, v7, v8

    iget v9, v4, Landroid/graphics/Rect;->right:I

    if-ge v8, v9, :cond_2

    move-object v6, p1

    goto :goto_2

    :cond_2
    int-to-float v6, v6

    int-to-float v8, v2

    int-to-float v9, v7

    int-to-float v10, v3

    iget-object v11, p0, Lcom/sma/smartv3/view/ScaleSeekBar;->mScalePaint:Landroid/graphics/Paint;

    invoke-static {v11}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    move v7, v6

    move-object v6, p1

    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_2
    if-eq v1, v5, :cond_3

    add-int/lit8 v1, v1, 0x1

    move-object p1, v6

    goto :goto_1

    :cond_3
    monitor-exit p0

    return-void

    :cond_4
    :goto_3
    monitor-exit p0

    return-void

    :goto_4
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final setRulerColor(I)V
    .locals 1

    iput p1, p0, Lcom/sma/smartv3/view/ScaleSeekBar;->mScaleColor:I

    iget-object v0, p0, Lcom/sma/smartv3/view/ScaleSeekBar;->mScalePaint:Landroid/graphics/Paint;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_0
    return-void
.end method

.method public final setRulerCount(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/view/ScaleSeekBar;->mScaleCount:I

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public final setRulerWidth(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/view/ScaleSeekBar;->mScaleWidth:I

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public final setShowTopOfThumb(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/view/ScaleSeekBar;->isShowTopOfThumb:Z

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method
