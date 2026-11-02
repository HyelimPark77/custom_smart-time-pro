.class public Lcom/sma/smartv3/view/GifImageView;
.super Landroidx/appcompat/widget/AppCompatImageView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/view/GifImageView$OXO1;
    }
.end annotation


# static fields
.field private static final DEFAULT_DURATION:I = 0x3e8


# instance fields
.field private counts:I

.field private endLastFrame:Z

.field private volatile hasStart:Z

.field private mMoviePauseTime:J

.field private mMovieStart:J

.field private mOnPlayListener:Lcom/sma/smartv3/view/GifImageView$OXO1;

.field private volatile mPaused:Z

.field private mScale:F

.field private mScaleH:F

.field private mScaleW:F

.field private mVisible:Z

.field private movie:Landroid/graphics/Movie;

.field private movieDuration:I

.field private offsetTime:J

.field percent:F
    .annotation build Landroidx/annotation/FloatRange;
        from = 0.0
        to = 1.0
    .end annotation
.end field

.field private volatile reverse:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "context"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/sma/smartv3/view/GifImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "context",
            "attrs"
        }
    .end annotation

    const/4 v0, -0x1

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/sma/smartv3/view/GifImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "context",
            "attrs",
            "defStyle"
        }
    .end annotation

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/high16 v0, 0x3f800000    # 1.0f

    .line 4
    iput v0, p0, Lcom/sma/smartv3/view/GifImageView;->mScaleW:F

    .line 5
    iput v0, p0, Lcom/sma/smartv3/view/GifImageView;->mScaleH:F

    .line 6
    iput v0, p0, Lcom/sma/smartv3/view/GifImageView;->mScale:F

    const/4 v0, -0x1

    .line 7
    iput v0, p0, Lcom/sma/smartv3/view/GifImageView;->counts:I

    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lcom/sma/smartv3/view/GifImageView;->reverse:Z

    const/4 v1, 0x1

    .line 9
    iput-boolean v1, p0, Lcom/sma/smartv3/view/GifImageView;->mVisible:Z

    .line 10
    iput-boolean v0, p0, Lcom/sma/smartv3/view/GifImageView;->endLastFrame:Z

    .line 11
    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/view/GifImageView;->setViewAttributes(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private drawMovieFrame(Landroid/graphics/Canvas;)V
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "canvas"
        }
    .end annotation

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    iget v0, p0, Lcom/sma/smartv3/view/GifImageView;->mScaleW:F

    const/high16 v1, 0x3f800000    # 1.0f

    div-float v0, v1, v0

    iget v2, p0, Lcom/sma/smartv3/view/GifImageView;->mScaleH:F

    div-float/2addr v1, v2

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->scale(FF)V

    iget-object v0, p0, Lcom/sma/smartv3/view/GifImageView;->movie:Landroid/graphics/Movie;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1, v1}, Landroid/graphics/Movie;->draw(Landroid/graphics/Canvas;FF)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method private getCurrentFrameTime()I
    .locals 10

    iget v0, p0, Lcom/sma/smartv3/view/GifImageView;->movieDuration:I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/sma/smartv3/view/GifImageView;->offsetTime:J

    sub-long/2addr v2, v4

    iget-wide v4, p0, Lcom/sma/smartv3/view/GifImageView;->mMovieStart:J

    sub-long v6, v2, v4

    iget v0, p0, Lcom/sma/smartv3/view/GifImageView;->movieDuration:I

    int-to-long v8, v0

    div-long/2addr v6, v8

    long-to-int v6, v6

    iget v7, p0, Lcom/sma/smartv3/view/GifImageView;->counts:I

    const/4 v8, -0x1

    if-eq v7, v8, :cond_3

    if-lt v6, v7, :cond_3

    iput-boolean v1, p0, Lcom/sma/smartv3/view/GifImageView;->hasStart:Z

    iget-object v0, p0, Lcom/sma/smartv3/view/GifImageView;->mOnPlayListener:Lcom/sma/smartv3/view/GifImageView$OXO1;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/sma/smartv3/view/GifImageView$OXO1;->OXO1()V

    :cond_1
    iget-boolean v0, p0, Lcom/sma/smartv3/view/GifImageView;->endLastFrame:Z

    if-eqz v0, :cond_2

    iget v0, p0, Lcom/sma/smartv3/view/GifImageView;->movieDuration:I

    return v0

    :cond_2
    return v1

    :cond_3
    sub-long/2addr v2, v4

    int-to-long v4, v0

    rem-long/2addr v2, v4

    long-to-float v1, v2

    int-to-float v0, v0

    div-float v0, v1, v0

    iput v0, p0, Lcom/sma/smartv3/view/GifImageView;->percent:F

    iget-object v0, p0, Lcom/sma/smartv3/view/GifImageView;->mOnPlayListener:Lcom/sma/smartv3/view/GifImageView$OXO1;

    if-eqz v0, :cond_5

    iget-boolean v0, p0, Lcom/sma/smartv3/view/GifImageView;->hasStart:Z

    if-eqz v0, :cond_5

    new-instance v0, Ljava/math/BigDecimal;

    iget v2, p0, Lcom/sma/smartv3/view/GifImageView;->percent:F

    float-to-double v2, v2

    invoke-direct {v0, v2, v3}, Ljava/math/BigDecimal;-><init>(D)V

    const/4 v2, 0x2

    const/4 v3, 0x4

    invoke-virtual {v0, v2, v3}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->doubleValue()D

    move-result-wide v2

    const-wide v4, 0x3fefae147ae147aeL    # 0.99

    cmpl-double v0, v2, v4

    if-nez v0, :cond_4

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    :cond_4
    iget-object v0, p0, Lcom/sma/smartv3/view/GifImageView;->mOnPlayListener:Lcom/sma/smartv3/view/GifImageView$OXO1;

    double-to-float v2, v2

    invoke-interface {v0, v2}, Lcom/sma/smartv3/view/GifImageView$OXO1;->O00(F)V

    :cond_5
    float-to-int v0, v1

    return v0
.end method

.method private invalidateView()V
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/view/GifImageView;->mVisible:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    :cond_0
    return-void
.end method

.method private reset()V
    .locals 3

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/sma/smartv3/view/GifImageView;->reverse:Z

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    iput-wide v1, p0, Lcom/sma/smartv3/view/GifImageView;->mMovieStart:J

    iput-boolean v0, p0, Lcom/sma/smartv3/view/GifImageView;->mPaused:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/view/GifImageView;->hasStart:Z

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/sma/smartv3/view/GifImageView;->mMoviePauseTime:J

    iput-wide v0, p0, Lcom/sma/smartv3/view/GifImageView;->offsetTime:J

    return-void
.end method

.method private setViewAttributes(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "context",
            "attrs",
            "defStyle"
        }
    .end annotation

    sget-object v0, Lcom/sma/smartv3/R$styleable;->GifImageView:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 p2, 0x2

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    const/4 p3, 0x1

    invoke-virtual {p1, v1, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    const/4 v2, 0x3

    const/4 v3, -0x1

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    iput v2, p0, Lcom/sma/smartv3/view/GifImageView;->counts:I

    invoke-virtual {p1, p3, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lcom/sma/smartv3/view/GifImageView;->endLastFrame:Z

    const/4 v1, 0x0

    if-lez p2, :cond_0

    invoke-virtual {p0, p2, v1}, Lcom/sma/smartv3/view/GifImageView;->setGifResource(ILcom/sma/smartv3/view/GifImageView$OXO1;)V

    if-eqz v0, :cond_0

    iget p2, p0, Lcom/sma/smartv3/view/GifImageView;->counts:I

    invoke-virtual {p0, p2}, Lcom/sma/smartv3/view/GifImageView;->play(I)V

    :cond_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    invoke-virtual {p0, p3, v1}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    return-void
.end method


# virtual methods
.method public getDuration()I
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/view/GifImageView;->movie:Landroid/graphics/Movie;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/Movie;->duration()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isPaused()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/view/GifImageView;->mPaused:Z

    return v0
.end method

.method public isPlaying()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/view/GifImageView;->mPaused:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/sma/smartv3/view/GifImageView;->hasStart:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "canvas"
        }
    .end annotation

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    iget-object v0, p0, Lcom/sma/smartv3/view/GifImageView;->movie:Landroid/graphics/Movie;

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/sma/smartv3/view/GifImageView;->mPaused:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/sma/smartv3/view/GifImageView;->hasStart:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/sma/smartv3/view/GifImageView;->reverse:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/view/GifImageView;->movie:Landroid/graphics/Movie;

    iget v1, p0, Lcom/sma/smartv3/view/GifImageView;->movieDuration:I

    invoke-direct {p0}, Lcom/sma/smartv3/view/GifImageView;->getCurrentFrameTime()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {v0, v1}, Landroid/graphics/Movie;->setTime(I)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/view/GifImageView;->movie:Landroid/graphics/Movie;

    invoke-direct {p0}, Lcom/sma/smartv3/view/GifImageView;->getCurrentFrameTime()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Movie;->setTime(I)Z

    :goto_0
    invoke-direct {p0, p1}, Lcom/sma/smartv3/view/GifImageView;->drawMovieFrame(Landroid/graphics/Canvas;)V

    invoke-direct {p0}, Lcom/sma/smartv3/view/GifImageView;->invalidateView()V

    return-void

    :cond_1
    invoke-direct {p0, p1}, Lcom/sma/smartv3/view/GifImageView;->drawMovieFrame(Landroid/graphics/Canvas;)V

    return-void

    :cond_2
    iget-object p1, p0, Lcom/sma/smartv3/view/GifImageView;->mOnPlayListener:Lcom/sma/smartv3/view/GifImageView$OXO1;

    if-eqz p1, :cond_3

    iget-boolean p1, p0, Lcom/sma/smartv3/view/GifImageView;->hasStart:Z

    if-eqz p1, :cond_3

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/sma/smartv3/view/GifImageView;->hasStart:Z

    iget-object p1, p0, Lcom/sma/smartv3/view/GifImageView;->mOnPlayListener:Lcom/sma/smartv3/view/GifImageView$OXO1;

    invoke-interface {p1}, Lcom/sma/smartv3/view/GifImageView$OXO1;->OXO1()V

    :cond_3
    return-void
.end method

.method public onMeasure(II)V
    .locals 7
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "widthMeasureSpec",
            "heightMeasureSpec"
        }
    .end annotation

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v2

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v3

    iget-object v4, p0, Lcom/sma/smartv3/view/GifImageView;->movie:Landroid/graphics/Movie;

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Landroid/graphics/Movie;->width()I

    move-result p1

    iget-object p2, p0, Lcom/sma/smartv3/view/GifImageView;->movie:Landroid/graphics/Movie;

    invoke-virtual {p2}, Landroid/graphics/Movie;->height()I

    move-result p2

    const/high16 v4, 0x40000000    # 2.0f

    if-ne v0, v4, :cond_0

    int-to-float v5, p1

    int-to-float v6, v2

    div-float/2addr v5, v6

    iput v5, p0, Lcom/sma/smartv3/view/GifImageView;->mScaleW:F

    :cond_0
    if-ne v1, v4, :cond_1

    int-to-float v5, p2

    int-to-float v6, v3

    div-float/2addr v5, v6

    iput v5, p0, Lcom/sma/smartv3/view/GifImageView;->mScaleH:F

    :cond_1
    iget v5, p0, Lcom/sma/smartv3/view/GifImageView;->mScaleW:F

    iget v6, p0, Lcom/sma/smartv3/view/GifImageView;->mScaleH:F

    invoke-static {v5, v6}, Ljava/lang/Math;->max(FF)F

    move-result v5

    iput v5, p0, Lcom/sma/smartv3/view/GifImageView;->mScale:F

    if-ne v0, v4, :cond_2

    goto :goto_0

    :cond_2
    move v2, p1

    :goto_0
    if-ne v1, v4, :cond_3

    goto :goto_1

    :cond_3
    move v3, p2

    :goto_1
    invoke-virtual {p0, v2, v3}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void

    :cond_4
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    return-void
.end method

.method public onScreenStateChanged(I)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "screenState"
        }
    .end annotation

    invoke-super {p0, p1}, Landroid/view/View;->onScreenStateChanged(I)V

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/sma/smartv3/view/GifImageView;->mVisible:Z

    invoke-direct {p0}, Lcom/sma/smartv3/view/GifImageView;->invalidateView()V

    return-void
.end method

.method public onVisibilityChanged(Landroid/view/View;I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "changedView",
            "visibility"
        }
    .end annotation

    invoke-super {p0, p1, p2}, Landroid/view/View;->onVisibilityChanged(Landroid/view/View;I)V

    if-nez p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lcom/sma/smartv3/view/GifImageView;->mVisible:Z

    invoke-direct {p0}, Lcom/sma/smartv3/view/GifImageView;->invalidateView()V

    return-void
.end method

.method public onWindowVisibilityChanged(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "visibility"
        }
    .end annotation

    invoke-super {p0, p1}, Landroid/view/View;->onWindowVisibilityChanged(I)V

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lcom/sma/smartv3/view/GifImageView;->mVisible:Z

    invoke-direct {p0}, Lcom/sma/smartv3/view/GifImageView;->invalidateView()V

    return-void
.end method

.method public pause()V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/view/GifImageView;->movie:Landroid/graphics/Movie;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/sma/smartv3/view/GifImageView;->mPaused:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/sma/smartv3/view/GifImageView;->hasStart:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/view/GifImageView;->mPaused:Z

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    iput-wide v1, p0, Lcom/sma/smartv3/view/GifImageView;->mMoviePauseTime:J

    iget-object v1, p0, Lcom/sma/smartv3/view/GifImageView;->mOnPlayListener:Lcom/sma/smartv3/view/GifImageView$OXO1;

    if-eqz v1, :cond_1

    invoke-interface {v1, v0}, Lcom/sma/smartv3/view/GifImageView$OXO1;->iO(Z)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/view/GifImageView;->mOnPlayListener:Lcom/sma/smartv3/view/GifImageView$OXO1;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/sma/smartv3/view/GifImageView$OXO1;->iO(Z)V

    :cond_1
    return-void
.end method

.method public play()V
    .locals 4

    .line 6
    iget-object v0, p0, Lcom/sma/smartv3/view/GifImageView;->movie:Landroid/graphics/Movie;

    if-nez v0, :cond_0

    goto :goto_0

    .line 7
    :cond_0
    iget-boolean v0, p0, Lcom/sma/smartv3/view/GifImageView;->hasStart:Z

    if-eqz v0, :cond_2

    .line 8
    iget-boolean v0, p0, Lcom/sma/smartv3/view/GifImageView;->mPaused:Z

    if-eqz v0, :cond_1

    iget-wide v0, p0, Lcom/sma/smartv3/view/GifImageView;->mMoviePauseTime:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lcom/sma/smartv3/view/GifImageView;->mPaused:Z

    .line 10
    iget-wide v0, p0, Lcom/sma/smartv3/view/GifImageView;->offsetTime:J

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    add-long/2addr v0, v2

    iget-wide v2, p0, Lcom/sma/smartv3/view/GifImageView;->mMoviePauseTime:J

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lcom/sma/smartv3/view/GifImageView;->offsetTime:J

    .line 11
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 12
    iget-object v0, p0, Lcom/sma/smartv3/view/GifImageView;->mOnPlayListener:Lcom/sma/smartv3/view/GifImageView$OXO1;

    if-eqz v0, :cond_1

    .line 13
    invoke-interface {v0}, Lcom/sma/smartv3/view/GifImageView$OXO1;->XIi00iiXO()V

    :cond_1
    :goto_0
    return-void

    :cond_2
    const/4 v0, -0x1

    .line 14
    invoke-virtual {p0, v0}, Lcom/sma/smartv3/view/GifImageView;->play(I)V

    return-void
.end method

.method public play(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "counts"
        }
    .end annotation

    .line 1
    iput p1, p0, Lcom/sma/smartv3/view/GifImageView;->counts:I

    .line 2
    invoke-direct {p0}, Lcom/sma/smartv3/view/GifImageView;->reset()V

    .line 3
    iget-object p1, p0, Lcom/sma/smartv3/view/GifImageView;->mOnPlayListener:Lcom/sma/smartv3/view/GifImageView$OXO1;

    if-eqz p1, :cond_0

    .line 4
    invoke-interface {p1}, Lcom/sma/smartv3/view/GifImageView$OXO1;->XO0O10()V

    .line 5
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public playOver()V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/view/GifImageView;->movie:Landroid/graphics/Movie;

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/view/GifImageView;->play(I)V

    :cond_0
    return-void
.end method

.method public playReverse()V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/view/GifImageView;->movie:Landroid/graphics/Movie;

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/view/GifImageView;->reset()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/view/GifImageView;->reverse:Z

    iget-object v0, p0, Lcom/sma/smartv3/view/GifImageView;->mOnPlayListener:Lcom/sma/smartv3/view/GifImageView$OXO1;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/sma/smartv3/view/GifImageView$OXO1;->XO0O10()V

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_1
    return-void
.end method

.method public setGifResource(I)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "movieResourceId"
        }
    .end annotation

    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, p1, v0}, Lcom/sma/smartv3/view/GifImageView;->setGifResource(ILcom/sma/smartv3/view/GifImageView$OXO1;)V

    return-void
.end method

.method public setGifResource(ILcom/sma/smartv3/view/GifImageView$OXO1;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "movieResourceId",
            "onPlayListener"
        }
    .end annotation

    if-eqz p2, :cond_0

    .line 1
    iput-object p2, p0, Lcom/sma/smartv3/view/GifImageView;->mOnPlayListener:Lcom/sma/smartv3/view/GifImageView$OXO1;

    .line 2
    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/view/GifImageView;->reset()V

    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object p2

    invoke-static {p2}, Landroid/graphics/Movie;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Movie;

    move-result-object p2

    iput-object p2, p0, Lcom/sma/smartv3/view/GifImageView;->movie:Landroid/graphics/Movie;

    if-nez p2, :cond_1

    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-static {p2, p1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 5
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    return-void

    .line 6
    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/view/GifImageView;->movie:Landroid/graphics/Movie;

    invoke-virtual {p1}, Landroid/graphics/Movie;->duration()I

    move-result p1

    if-nez p1, :cond_2

    const/16 p1, 0x3e8

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lcom/sma/smartv3/view/GifImageView;->movie:Landroid/graphics/Movie;

    invoke-virtual {p1}, Landroid/graphics/Movie;->duration()I

    move-result p1

    :goto_0
    iput p1, p0, Lcom/sma/smartv3/view/GifImageView;->movieDuration:I

    .line 7
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setGifResource(Ljava/lang/String;Lcom/sma/smartv3/view/GifImageView$OXO1;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10,
            0x0
        }
        names = {
            "path",
            "onPlayListener"
        }
    .end annotation

    .line 9
    invoke-static {p1}, Landroid/graphics/Movie;->decodeFile(Ljava/lang/String;)Landroid/graphics/Movie;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/view/GifImageView;->movie:Landroid/graphics/Movie;

    .line 10
    iput-object p2, p0, Lcom/sma/smartv3/view/GifImageView;->mOnPlayListener:Lcom/sma/smartv3/view/GifImageView$OXO1;

    .line 11
    invoke-direct {p0}, Lcom/sma/smartv3/view/GifImageView;->reset()V

    .line 12
    iget-object p2, p0, Lcom/sma/smartv3/view/GifImageView;->movie:Landroid/graphics/Movie;

    if-nez p2, :cond_0

    .line 13
    invoke-static {p1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 14
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    return-void

    .line 15
    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/view/GifImageView;->movie:Landroid/graphics/Movie;

    invoke-virtual {p1}, Landroid/graphics/Movie;->duration()I

    move-result p1

    if-nez p1, :cond_1

    const/16 p1, 0x3e8

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/view/GifImageView;->movie:Landroid/graphics/Movie;

    invoke-virtual {p1}, Landroid/graphics/Movie;->duration()I

    move-result p1

    :goto_0
    iput p1, p0, Lcom/sma/smartv3/view/GifImageView;->movieDuration:I

    .line 16
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 17
    iget-object p1, p0, Lcom/sma/smartv3/view/GifImageView;->mOnPlayListener:Lcom/sma/smartv3/view/GifImageView$OXO1;

    if-eqz p1, :cond_2

    .line 18
    invoke-interface {p1}, Lcom/sma/smartv3/view/GifImageView$OXO1;->XO0O10()V

    :cond_2
    return-void
.end method

.method public setOnPlayListener(Lcom/sma/smartv3/view/GifImageView$OXO1;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "onPlayListener"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/view/GifImageView;->mOnPlayListener:Lcom/sma/smartv3/view/GifImageView$OXO1;

    return-void
.end method

.method public setPercent(F)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "percent"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/view/GifImageView;->movie:Landroid/graphics/Movie;

    if-eqz v0, :cond_0

    iget v1, p0, Lcom/sma/smartv3/view/GifImageView;->movieDuration:I

    if-lez v1, :cond_0

    iput p1, p0, Lcom/sma/smartv3/view/GifImageView;->percent:F

    int-to-float v1, v1

    mul-float/2addr v1, p1

    float-to-int v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Movie;->setTime(I)Z

    invoke-direct {p0}, Lcom/sma/smartv3/view/GifImageView;->invalidateView()V

    iget-object v0, p0, Lcom/sma/smartv3/view/GifImageView;->mOnPlayListener:Lcom/sma/smartv3/view/GifImageView$OXO1;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/sma/smartv3/view/GifImageView$OXO1;->O00(F)V

    :cond_0
    return-void
.end method
