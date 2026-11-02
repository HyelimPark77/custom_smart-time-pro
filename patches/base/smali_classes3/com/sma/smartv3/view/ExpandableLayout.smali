.class public Lcom/sma/smartv3/view/ExpandableLayout;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/view/ExpandableLayout$iO;
    }
.end annotation


# instance fields
.field public I1:I

.field public IO:Lcom/android/mltcode/paycertificationapi/o54;

.field public O001I:Lcom/sma/smartv3/view/ExpandableLayout$iO;

.field public X0i1O:Z

.field public X11iII1O1:Landroid/animation/ValueAnimator;

.field public X1IX:I

.field public XXO:Landroid/view/View;

.field public XXX11i:Landroid/animation/AnimatorSet;

.field public iIXi1iiXI:Z

.field public iX1O1:Landroid/animation/ValueAnimator;

.field public iXiX011:Lcom/android/mltcode/paycertificationapi/nw3;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "context"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lcom/sma/smartv3/view/ExpandableLayout;->X0i1O:Z

    .line 3
    iput-boolean p1, p0, Lcom/sma/smartv3/view/ExpandableLayout;->iIXi1iiXI:Z

    const/4 p1, 0x0

    .line 4
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/view/ExpandableLayout;->IiI10X(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
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

    .line 5
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x1

    .line 6
    iput-boolean p1, p0, Lcom/sma/smartv3/view/ExpandableLayout;->X0i1O:Z

    .line 7
    iput-boolean p1, p0, Lcom/sma/smartv3/view/ExpandableLayout;->iIXi1iiXI:Z

    .line 8
    invoke-virtual {p0, p2}, Lcom/sma/smartv3/view/ExpandableLayout;->IiI10X(Landroid/util/AttributeSet;)V

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
            "defStyleAttr"
        }
    .end annotation

    .line 9
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, Lcom/sma/smartv3/view/ExpandableLayout;->X0i1O:Z

    .line 11
    iput-boolean p1, p0, Lcom/sma/smartv3/view/ExpandableLayout;->iIXi1iiXI:Z

    return-void
.end method

.method public static bridge synthetic OXO1(Lcom/sma/smartv3/view/ExpandableLayout;)Lcom/sma/smartv3/view/ExpandableLayout$iO;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/view/ExpandableLayout;->O001I:Lcom/sma/smartv3/view/ExpandableLayout$iO;

    return-object p0
.end method

.method public static bridge synthetic XIi00iiXO(Lcom/sma/smartv3/view/ExpandableLayout;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/view/ExpandableLayout;->I1:I

    return-void
.end method

.method private getParentScrollDistance()I
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/view/ExpandableLayout;->iXiX011:Lcom/android/mltcode/paycertificationapi/nw3;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getY()F

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v0, v2

    iget v2, p0, Lcom/sma/smartv3/view/ExpandableLayout;->X1IX:I

    int-to-float v2, v2

    add-float/2addr v0, v2

    iget-object v2, p0, Lcom/sma/smartv3/view/ExpandableLayout;->iXiX011:Lcom/android/mltcode/paycertificationapi/nw3;

    iget-object v2, v2, Lcom/android/mltcode/paycertificationapi/nw3;->OXO1:Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v0, v2

    float-to-int v0, v0

    :goto_0
    iget-object v2, p0, Lcom/sma/smartv3/view/ExpandableLayout;->iXiX011:Lcom/android/mltcode/paycertificationapi/nw3;

    iget v2, v2, Lcom/android/mltcode/paycertificationapi/nw3;->XIi00iiXO:I

    if-ge v1, v2, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    int-to-float v0, v0

    invoke-virtual {v2}, Landroid/view/View;->getY()F

    move-result v2

    add-float/2addr v0, v2

    float-to-int v0, v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method


# virtual methods
.method public final I0IIOi()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/view/ExpandableLayout;->XXO:Landroid/view/View;

    if-nez v0, :cond_0

    const v0, 0x7f0a0b51

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/view/ExpandableLayout;->XXO:Landroid/view/View;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/view/ExpandableLayout;->XXO:Landroid/view/View;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/sma/smartv3/view/ExpandableLayout;->IO:Lcom/android/mltcode/paycertificationapi/o54;

    iget v1, v1, Lcom/android/mltcode/paycertificationapi/o54;->OXO1:I

    invoke-virtual {p0, v0, v1}, Lcom/sma/smartv3/view/ExpandableLayout;->XO0O10(Landroid/view/View;I)Landroid/view/animation/RotateAnimation;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/view/ExpandableLayout;->XXO:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    :cond_1
    return-void
.end method

.method public final IO(II)V
    .locals 6
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10,
            0x10
        }
        names = {
            "startHeight",
            "endHeight"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0}, Lcom/sma/smartv3/view/ExpandableLayout;->getParentScrollDistance()I

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    filled-new-array {p1, p2}, [I

    move-result-object v4

    invoke-static {v4}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object v4

    iput-object v4, p0, Lcom/sma/smartv3/view/ExpandableLayout;->iX1O1:Landroid/animation/ValueAnimator;

    new-instance v5, Lcom/sma/smartv3/view/ExpandableLayout$OXO1;

    invoke-direct {v5, p0, v3}, Lcom/sma/smartv3/view/ExpandableLayout$OXO1;-><init>(Lcom/sma/smartv3/view/ExpandableLayout;Landroid/view/View;)V

    invoke-virtual {v4, v5}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    iget-object v3, p0, Lcom/sma/smartv3/view/ExpandableLayout;->iX1O1:Landroid/animation/ValueAnimator;

    new-instance v4, Lcom/sma/smartv3/view/ExpandableLayout$XIi00iiXO;

    invoke-direct {v4, p0, p2, p1}, Lcom/sma/smartv3/view/ExpandableLayout$XIi00iiXO;-><init>(Lcom/sma/smartv3/view/ExpandableLayout;II)V

    invoke-virtual {v3, v4}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    iget p1, p0, Lcom/sma/smartv3/view/ExpandableLayout;->I1:I

    const/4 p2, 0x2

    if-ne p1, v2, :cond_0

    const/4 p1, 0x3

    goto :goto_0

    :cond_0
    move p1, p2

    :goto_0
    iput p1, p0, Lcom/sma/smartv3/view/ExpandableLayout;->I1:I

    iget-object p1, p0, Lcom/sma/smartv3/view/ExpandableLayout;->iX1O1:Landroid/animation/ValueAnimator;

    iget-object v3, p0, Lcom/sma/smartv3/view/ExpandableLayout;->IO:Lcom/android/mltcode/paycertificationapi/o54;

    iget v3, v3, Lcom/android/mltcode/paycertificationapi/o54;->OXO1:I

    int-to-long v3, v3

    invoke-virtual {p1, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    iget p1, p0, Lcom/sma/smartv3/view/ExpandableLayout;->I1:I

    if-ne p1, p2, :cond_2

    iget-object p1, p0, Lcom/sma/smartv3/view/ExpandableLayout;->IO:Lcom/android/mltcode/paycertificationapi/o54;

    iget-boolean v3, p1, Lcom/android/mltcode/paycertificationapi/o54;->XIi00iiXO:Z

    if-eqz v3, :cond_2

    if-lez v1, :cond_2

    iget-object v3, p0, Lcom/sma/smartv3/view/ExpandableLayout;->iXiX011:Lcom/android/mltcode/paycertificationapi/nw3;

    iget-object v3, v3, Lcom/android/mltcode/paycertificationapi/nw3;->OXO1:Landroid/view/ViewGroup;

    iget p1, p1, Lcom/android/mltcode/paycertificationapi/o54;->OXO1:I

    int-to-long v4, p1

    invoke-static {v3, v1, v4, v5}, Lcom/android/mltcode/paycertificationapi/bd6;->OXO1(Landroid/view/View;IJ)Landroid/animation/ValueAnimator;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/view/ExpandableLayout;->X11iII1O1:Landroid/animation/ValueAnimator;

    new-instance p1, Landroid/animation/AnimatorSet;

    invoke-direct {p1}, Landroid/animation/AnimatorSet;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/view/ExpandableLayout;->XXX11i:Landroid/animation/AnimatorSet;

    iget-object v1, p0, Lcom/sma/smartv3/view/ExpandableLayout;->IO:Lcom/android/mltcode/paycertificationapi/o54;

    iget-boolean v1, v1, Lcom/android/mltcode/paycertificationapi/o54;->iO:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/sma/smartv3/view/ExpandableLayout;->iX1O1:Landroid/animation/ValueAnimator;

    iget-object v3, p0, Lcom/sma/smartv3/view/ExpandableLayout;->X11iII1O1:Landroid/animation/ValueAnimator;

    new-array p2, p2, [Landroid/animation/Animator;

    aput-object v1, p2, v0

    aput-object v3, p2, v2

    invoke-virtual {p1, p2}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lcom/sma/smartv3/view/ExpandableLayout;->iX1O1:Landroid/animation/ValueAnimator;

    iget-object v3, p0, Lcom/sma/smartv3/view/ExpandableLayout;->X11iII1O1:Landroid/animation/ValueAnimator;

    new-array p2, p2, [Landroid/animation/Animator;

    aput-object v1, p2, v0

    aput-object v3, p2, v2

    invoke-virtual {p1, p2}, Landroid/animation/AnimatorSet;->playSequentially([Landroid/animation/Animator;)V

    :goto_1
    iget-object p1, p0, Lcom/sma/smartv3/view/ExpandableLayout;->XXX11i:Landroid/animation/AnimatorSet;

    invoke-virtual {p1}, Landroid/animation/AnimatorSet;->start()V

    return-void

    :cond_2
    iget-object p1, p0, Lcom/sma/smartv3/view/ExpandableLayout;->iX1O1:Landroid/animation/ValueAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method

.method public final IiI10X(Landroid/util/AttributeSet;)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "attrs"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/view/View;->setClickable(Z)V

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    const/4 v2, -0x1

    iput v2, p0, Lcom/sma/smartv3/view/ExpandableLayout;->I1:I

    new-instance v2, Lcom/android/mltcode/paycertificationapi/o54;

    invoke-direct {v2}, Lcom/android/mltcode/paycertificationapi/o54;-><init>()V

    iput-object v2, p0, Lcom/sma/smartv3/view/ExpandableLayout;->IO:Lcom/android/mltcode/paycertificationapi/o54;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    sget-object v3, Lcom/sma/smartv3/R$styleable;->ExpandableLayout:[I

    invoke-virtual {v2, p1, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    iget-object v2, p0, Lcom/sma/smartv3/view/ExpandableLayout;->IO:Lcom/android/mltcode/paycertificationapi/o54;

    const/16 v3, 0x12c

    invoke-virtual {p1, v1, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    iput v3, v2, Lcom/android/mltcode/paycertificationapi/o54;->OXO1:I

    iget-object v2, p0, Lcom/sma/smartv3/view/ExpandableLayout;->IO:Lcom/android/mltcode/paycertificationapi/o54;

    const/4 v3, 0x2

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, v2, Lcom/android/mltcode/paycertificationapi/o54;->XIi00iiXO:Z

    iget-object v1, p0, Lcom/sma/smartv3/view/ExpandableLayout;->IO:Lcom/android/mltcode/paycertificationapi/o54;

    invoke-virtual {p1, v0, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, v1, Lcom/android/mltcode/paycertificationapi/o54;->iO:Z

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    :cond_0
    return-void
.end method

.method public O00()V
    .locals 2

    const/4 v0, 0x0

    iget v1, p0, Lcom/sma/smartv3/view/ExpandableLayout;->X1IX:I

    invoke-virtual {p0, v0, v1}, Lcom/sma/smartv3/view/ExpandableLayout;->IO(II)V

    return-void
.end method

.method public OIi0()V
    .locals 2

    iget v0, p0, Lcom/sma/smartv3/view/ExpandableLayout;->I1:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/view/ExpandableLayout;->iO()V

    goto :goto_0

    :cond_0
    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/view/ExpandableLayout;->O00()V

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/sma/smartv3/view/ExpandableLayout;->I0IIOi()V

    return-void
.end method

.method public final XO0O10(Landroid/view/View;I)Landroid/view/animation/RotateAnimation;
    .locals 8
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10,
            0x0
        }
        names = {
            "view",
            "duration"
        }
    .end annotation

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    const/4 v1, 0x1

    shr-int/2addr v0, v1

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    shr-int/2addr p1, v1

    new-instance v2, Landroid/view/animation/RotateAnimation;

    iget v3, p0, Lcom/sma/smartv3/view/ExpandableLayout;->I1:I

    const/high16 v4, -0x3ccc0000    # -180.0f

    const/4 v5, 0x0

    const/4 v6, 0x2

    if-ne v3, v6, :cond_0

    move v7, v5

    goto :goto_0

    :cond_0
    move v7, v4

    :goto_0
    if-ne v3, v6, :cond_1

    goto :goto_1

    :cond_1
    move v4, v5

    :goto_1
    int-to-float v0, v0

    int-to-float p1, p1

    invoke-direct {v2, v7, v4, v0, p1}, Landroid/view/animation/RotateAnimation;-><init>(FFFF)V

    int-to-long p1, p2

    invoke-virtual {v2, p1, p2}, Landroid/view/animation/Animation;->setDuration(J)V

    invoke-virtual {v2, v1}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    return-object v2
.end method

.method public XOO0ii0()Z
    .locals 2

    iget v0, p0, Lcom/sma/smartv3/view/ExpandableLayout;->I1:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public iO()V
    .locals 2

    iget v0, p0, Lcom/sma/smartv3/view/ExpandableLayout;->X1IX:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/sma/smartv3/view/ExpandableLayout;->IO(II)V

    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 1

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    iget-object v0, p0, Lcom/sma/smartv3/view/ExpandableLayout;->iX1O1:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/view/ExpandableLayout;->iX1O1:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    iget-object v0, p0, Lcom/sma/smartv3/view/ExpandableLayout;->iX1O1:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->removeAllUpdateListeners()V

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/view/ExpandableLayout;->X11iII1O1:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/sma/smartv3/view/ExpandableLayout;->X11iII1O1:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    iget-object v0, p0, Lcom/sma/smartv3/view/ExpandableLayout;->X11iII1O1:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->removeAllUpdateListeners()V

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/view/ExpandableLayout;->XXX11i:Landroid/animation/AnimatorSet;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->cancel()V

    :cond_2
    return-void
.end method

.method public onMeasure(II)V
    .locals 3
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

    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, Lcom/sma/smartv3/view/ExpandableLayout;->X0i1O:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    iput v0, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup$MarginLayoutParams;

    iput v0, v2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iput v0, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iput v0, v2, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    iput v1, p0, Lcom/sma/smartv3/view/ExpandableLayout;->X1IX:I

    iput-boolean v0, p0, Lcom/sma/smartv3/view/ExpandableLayout;->X0i1O:Z

    iput v0, p0, Lcom/sma/smartv3/view/ExpandableLayout;->I1:I

    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V

    :cond_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "ExpandableLayout must has two child view !"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
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

    iget-object p1, p0, Lcom/sma/smartv3/view/ExpandableLayout;->IO:Lcom/android/mltcode/paycertificationapi/o54;

    iget-boolean p1, p1, Lcom/android/mltcode/paycertificationapi/o54;->XIi00iiXO:Z

    if-eqz p1, :cond_0

    invoke-static {p0}, Lcom/android/mltcode/paycertificationapi/bd6;->XIi00iiXO(Landroid/view/ViewGroup;)Lcom/android/mltcode/paycertificationapi/nw3;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/view/ExpandableLayout;->iXiX011:Lcom/android/mltcode/paycertificationapi/nw3;

    :cond_0
    return-void
.end method

.method public performClick()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/view/ExpandableLayout;->iIXi1iiXI:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/view/ExpandableLayout;->OIi0()V

    :cond_0
    invoke-super {p0}, Landroid/view/View;->performClick()Z

    move-result v0

    return v0
.end method

.method public setExpand(Z)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "expand"
        }
    .end annotation

    iget v0, p0, Lcom/sma/smartv3/view/ExpandableLayout;->I1:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-eqz p1, :cond_1

    iget v1, p0, Lcom/sma/smartv3/view/ExpandableLayout;->X1IX:I

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    iput p1, p0, Lcom/sma/smartv3/view/ExpandableLayout;->I1:I

    return-void
.end method

.method public setExpandDuration(I)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "expandDuration"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/view/ExpandableLayout;->IO:Lcom/android/mltcode/paycertificationapi/o54;

    iput p1, v0, Lcom/android/mltcode/paycertificationapi/o54;->OXO1:I

    return-void
.end method

.method public setExpandEnable(Z)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "isExpandEnable"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/sma/smartv3/view/ExpandableLayout;->iIXi1iiXI:Z

    return-void
.end method

.method public setExpandScrollTogether(Z)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "expandScrollTogether"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/view/ExpandableLayout;->IO:Lcom/android/mltcode/paycertificationapi/o54;

    iput-boolean p1, v0, Lcom/android/mltcode/paycertificationapi/o54;->iO:Z

    return-void
.end method

.method public setExpandWithParentScroll(Z)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "expandWithParentScroll"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/view/ExpandableLayout;->IO:Lcom/android/mltcode/paycertificationapi/o54;

    iput-boolean p1, v0, Lcom/android/mltcode/paycertificationapi/o54;->XIi00iiXO:Z

    return-void
.end method

.method public setOnExpandListener(Lcom/sma/smartv3/view/ExpandableLayout$iO;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "onExpandListener"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/view/ExpandableLayout;->O001I:Lcom/sma/smartv3/view/ExpandableLayout$iO;

    return-void
.end method

.method public setSwitcher(Landroid/view/View;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "switcher"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/view/ExpandableLayout;->XXO:Landroid/view/View;

    return-void
.end method
