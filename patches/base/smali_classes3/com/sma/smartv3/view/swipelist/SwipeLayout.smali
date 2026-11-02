.class public Lcom/sma/smartv3/view/swipelist/SwipeLayout;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/view/swipelist/SwipeLayout$XIi00iiXO;
    }
.end annotation


# instance fields
.field public I1:Landroid/view/View;

.field public IO:Landroid/view/View;

.field public O001I:Lcom/sma/smartv3/view/swipelist/SwipeLayout$XIi00iiXO;

.field public X0i1O:I

.field public X11iII1O1:I

.field public X1IX:D

.field public XXO:Landroid/view/VelocityTracker;

.field public XXX11i:I

.field public iIXi1iiXI:I

.field public iX1O1:I

.field public iXiX011:Landroid/animation/ObjectAnimator;


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
    invoke-direct {p0, p1, v0}, Lcom/sma/smartv3/view/swipelist/SwipeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

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

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/sma/smartv3/view/swipelist/SwipeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
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
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->X0i1O:I

    .line 5
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->iIXi1iiXI:I

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/view/swipelist/SwipeLayout;Landroid/view/View;)V
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->O001I:Lcom/sma/smartv3/view/swipelist/SwipeLayout$XIi00iiXO;

    if-nez p0, :cond_0

    return-void

    :cond_0
    invoke-interface {p0}, Lcom/sma/smartv3/view/swipelist/SwipeLayout$XIi00iiXO;->onDelete()V

    return-void
.end method

.method public static bridge synthetic XIi00iiXO(Lcom/sma/smartv3/view/swipelist/SwipeLayout;)Landroid/view/View;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->IO:Landroid/view/View;

    return-object p0
.end method

.method public static bridge synthetic XO0O10(Lcom/sma/smartv3/view/swipelist/SwipeLayout;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->iX1O1:I

    return-void
.end method

.method public static bridge synthetic iO(Lcom/sma/smartv3/view/swipelist/SwipeLayout;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->iX1O1:I

    return p0
.end method


# virtual methods
.method public O00(Z)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "isClose"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->I1:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTranslationX()F

    move-result v1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget p1, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->X11iII1O1:I

    int-to-float p1, p1

    :goto_0
    const/4 v2, 0x2

    new-array v2, v2, [F

    const/4 v3, 0x0

    aput v1, v2, v3

    const/4 v1, 0x1

    aput p1, v2, v1

    const-string p1, "translationX"

    invoke-static {v0, p1, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object p1

    const-wide/16 v0, 0x64

    invoke-virtual {p1, v0, v1}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->iXiX011:Landroid/animation/ObjectAnimator;

    new-instance v0, Lcom/sma/smartv3/view/swipelist/SwipeLayout$OXO1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/view/swipelist/SwipeLayout$OXO1;-><init>(Lcom/sma/smartv3/view/swipelist/SwipeLayout;)V

    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    iget-object p1, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->iXiX011:Landroid/animation/ObjectAnimator;

    invoke-virtual {p1}, Landroid/animation/ObjectAnimator;->start()V

    return-void
.end method

.method public onAttachedToWindow()V
    .locals 1

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->XXO:Landroid/view/VelocityTracker;

    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->XXO:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    return-void
.end method

.method public onFinishInflate()V
    .locals 4

    invoke-super {p0}, Landroid/view/View;->onFinishInflate()V

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->IO:Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f0d0f62

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->I1:Landroid/view/View;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ei5;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/ei5;-><init>(Lcom/sma/smartv3/view/swipelist/SwipeLayout;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->I1:Landroid/view/View;

    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v2, 0x42900000    # 72.0f

    invoke-static {v2}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result v2

    const/4 v3, -0x1

    invoke-direct {v1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p0, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "SwipeDeleteLayout must host only one direct child"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public onSizeChanged(IIII)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "w",
            "h",
            "oldw",
            "oldh"
        }
    .end annotation

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    iget-object p1, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->I1:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    neg-int p1, p1

    iput p1, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->X11iII1O1:I

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 9
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "event"
        }
    .end annotation

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    iget-object v1, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->XXO:Landroid/view/VelocityTracker;

    invoke-virtual {v1, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz p1, :cond_b

    const/16 v3, 0x3e8

    const/4 v4, 0x2

    if-eq p1, v2, :cond_5

    if-eq p1, v4, :cond_1

    const/4 v1, 0x3

    if-eq p1, v1, :cond_0

    goto/16 :goto_2

    :cond_0
    iget p1, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->iX1O1:I

    if-eqz p1, :cond_d

    invoke-virtual {p0, v2}, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->O00(Z)V

    goto/16 :goto_2

    :cond_1
    iget-wide v4, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->X1IX:D

    iget p1, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->XXX11i:I

    sub-int p1, v0, p1

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    int-to-double v6, p1

    add-double/2addr v4, v6

    iput-wide v4, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->X1IX:D

    iget-object p1, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->XXO:Landroid/view/VelocityTracker;

    invoke-virtual {p1, v3}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V

    iget-object p1, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->XXO:Landroid/view/VelocityTracker;

    invoke-virtual {p1}, Landroid/view/VelocityTracker;->getXVelocity()F

    move-result p1

    iget-object v3, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->XXO:Landroid/view/VelocityTracker;

    invoke-virtual {v3}, Landroid/view/VelocityTracker;->getYVelocity()F

    move-result v3

    iget v4, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->iX1O1:I

    iget v5, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->XXX11i:I

    sub-int v5, v0, v5

    add-int/2addr v4, v5

    iput v4, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->iX1O1:I

    iget v5, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->X11iII1O1:I

    if-ge v4, v5, :cond_2

    iput v5, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->iX1O1:I

    :cond_2
    iget v4, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->iX1O1:I

    if-lez v4, :cond_3

    iput v1, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->iX1O1:I

    :cond_3
    iget-wide v4, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->X1IX:D

    iget v1, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->X0i1O:I

    int-to-double v6, v1

    cmpl-double v1, v4, v6

    if-gez v1, :cond_4

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    iget v4, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->iIXi1iiXI:I

    int-to-float v4, v4

    cmpl-float v1, v1, v4

    if-lez v1, :cond_d

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    mul-float/2addr v3, v1

    cmpl-float p1, p1, v3

    if-lez p1, :cond_d

    :cond_4
    iget-object p1, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->I1:Landroid/view/View;

    iget v1, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->iX1O1:I

    int-to-float v1, v1

    invoke-virtual {p1, v1}, Landroid/view/View;->setTranslationX(F)V

    iget-object p1, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->IO:Landroid/view/View;

    iget v1, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->iX1O1:I

    int-to-float v1, v1

    const/high16 v3, 0x40400000    # 3.0f

    mul-float/2addr v1, v3

    const/high16 v3, 0x40800000    # 4.0f

    div-float/2addr v1, v3

    invoke-virtual {p1, v1}, Landroid/view/View;->setTranslationX(F)V

    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    goto :goto_2

    :cond_5
    iget-wide v5, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->X1IX:D

    iget p1, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->X0i1O:I

    int-to-double v7, p1

    cmpg-double p1, v5, v7

    if-gez p1, :cond_7

    iget p1, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->iX1O1:I

    iget v1, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->X11iII1O1:I

    if-ne p1, v1, :cond_6

    invoke-virtual {p0, v2}, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->O00(Z)V

    goto :goto_2

    :cond_6
    iget-object p1, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->O001I:Lcom/sma/smartv3/view/swipelist/SwipeLayout$XIi00iiXO;

    if-eqz p1, :cond_d

    invoke-interface {p1}, Lcom/sma/smartv3/view/swipelist/SwipeLayout$XIi00iiXO;->OXO1()V

    invoke-virtual {p0, v2}, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->O00(Z)V

    goto :goto_2

    :cond_7
    iget p1, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->iX1O1:I

    iget v5, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->X11iII1O1:I

    if-eq p1, v5, :cond_d

    if-eqz p1, :cond_d

    iget-object p1, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->XXO:Landroid/view/VelocityTracker;

    invoke-virtual {p1, v3}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V

    iget-object p1, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->XXO:Landroid/view/VelocityTracker;

    invoke-virtual {p1}, Landroid/view/VelocityTracker;->getXVelocity()F

    move-result p1

    iget v3, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->iIXi1iiXI:I

    int-to-float v5, v3

    cmpl-float v5, p1, v5

    if-lez v5, :cond_8

    :goto_0
    move v1, v2

    goto :goto_1

    :cond_8
    neg-int v3, v3

    int-to-float v3, v3

    cmpg-float p1, p1, v3

    if-gez p1, :cond_9

    goto :goto_1

    :cond_9
    iget p1, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->iX1O1:I

    iget v3, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->X11iII1O1:I

    div-int/2addr v3, v4

    if-le p1, v3, :cond_a

    goto :goto_0

    :cond_a
    :goto_1
    invoke-virtual {p0, v1}, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->O00(Z)V

    goto :goto_2

    :cond_b
    const-wide/16 v3, 0x0

    iput-wide v3, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->X1IX:D

    iget-object p1, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->iXiX011:Landroid/animation/ObjectAnimator;

    if-eqz p1, :cond_c

    invoke-virtual {p1}, Landroid/animation/Animator;->cancel()V

    :cond_c
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    :cond_d
    :goto_2
    iput v0, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->XXX11i:I

    return v2
.end method

.method public setSwipeListener(Lcom/sma/smartv3/view/swipelist/SwipeLayout$XIi00iiXO;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "listener"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->O001I:Lcom/sma/smartv3/view/swipelist/SwipeLayout$XIi00iiXO;

    return-void
.end method
