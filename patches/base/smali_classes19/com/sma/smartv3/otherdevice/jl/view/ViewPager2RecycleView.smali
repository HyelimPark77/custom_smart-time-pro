.class public Lcom/sma/smartv3/otherdevice/jl/view/ViewPager2RecycleView;
.super Landroidx/recyclerview/widget/RecyclerView;
.source "SourceFile"


# instance fields
.field private mDownEvent:Landroid/view/MotionEvent;

.field private mStartX:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "context"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/ViewPager2RecycleView;->mDownEvent:Landroid/view/MotionEvent;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
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

    .line 3
    invoke-direct {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/ViewPager2RecycleView;->mDownEvent:Landroid/view/MotionEvent;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "context",
            "attrs",
            "defStyleAttr"
        }
    .end annotation

    .line 5
    invoke-direct {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x0

    .line 6
    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/ViewPager2RecycleView;->mDownEvent:Landroid/view/MotionEvent;

    return-void
.end method

.method private getViewPager2()Landroidx/viewpager2/widget/ViewPager2;
    .locals 2

    move-object v0, p0

    :cond_0
    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_1

    instance-of v1, v0, Landroidx/viewpager2/widget/ViewPager2;

    if-eqz v1, :cond_0

    check-cast v0, Landroidx/viewpager2/widget/ViewPager2;

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method private setViewPager2InputEnable(Z)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "enable"
        }
    .end annotation

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/jl/view/ViewPager2RecycleView;->getViewPager2()Landroidx/viewpager2/widget/ViewPager2;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroidx/viewpager2/widget/ViewPager2;->setUserInputEnabled(Z)V

    :cond_0
    return-void
.end method


# virtual methods
.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "e"
        }
    .end annotation

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_0

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/ViewPager2RecycleView;->mDownEvent:Landroid/view/MotionEvent;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/ViewPager2RecycleView;->mStartX:F

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/sma/smartv3/otherdevice/jl/view/ViewPager2RecycleView;->setViewPager2InputEnable(Z)V

    goto :goto_2

    :cond_0
    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_3

    const/4 v3, 0x3

    if-ne v0, v3, :cond_1

    goto :goto_1

    :cond_1
    const/4 v3, 0x2

    if-ne v0, v3, :cond_4

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/ViewPager2RecycleView;->mDownEvent:Landroid/view/MotionEvent;

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget v3, p0, Lcom/sma/smartv3/otherdevice/jl/view/ViewPager2RecycleView;->mStartX:F

    sub-float/2addr v0, v3

    invoke-virtual {p0, v2}, Landroid/view/View;->canScrollHorizontally(I)Z

    move-result v3

    const/4 v4, -0x1

    invoke-virtual {p0, v4}, Landroid/view/View;->canScrollHorizontally(I)Z

    move-result v4

    const/4 v5, 0x0

    cmpg-float v0, v0, v5

    if-gez v0, :cond_2

    xor-int/lit8 v0, v3, 0x1

    invoke-direct {p0, v0}, Lcom/sma/smartv3/otherdevice/jl/view/ViewPager2RecycleView;->setViewPager2InputEnable(Z)V

    goto :goto_0

    :cond_2
    xor-int/lit8 v0, v4, 0x1

    invoke-direct {p0, v0}, Lcom/sma/smartv3/otherdevice/jl/view/ViewPager2RecycleView;->setViewPager2InputEnable(Z)V

    :goto_0
    iput-object v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/ViewPager2RecycleView;->mDownEvent:Landroid/view/MotionEvent;

    goto :goto_2

    :cond_3
    :goto_1
    invoke-direct {p0, v2}, Lcom/sma/smartv3/otherdevice/jl/view/ViewPager2RecycleView;->setViewPager2InputEnable(Z)V

    iput-object v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/ViewPager2RecycleView;->mDownEvent:Landroid/view/MotionEvent;

    :cond_4
    :goto_2
    invoke-super {p0, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method
