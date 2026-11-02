.class public Lcom/sma/smartv3/view/MarqueeTextView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/ik4;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/view/MarqueeTextView$iO;
    }
.end annotation


# instance fields
.field public I1:Landroid/widget/TextView;

.field public IO:Landroid/content/Context;

.field public O001I:Lcom/android/mltcode/paycertificationapi/xj4;

.field public X0i1O:J

.field public X11iII1O1:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public X1IX:J

.field public XXO:Lcom/sma/smartv3/view/MarqueeTextView$iO;

.field public XXX11i:I

.field public iIXi1iiXI:Landroid/os/Handler;

.field public iX1O1:Landroid/widget/TextView;

.field public iXiX011:Z

.field public final iXiiiO:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
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

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/sma/smartv3/view/MarqueeTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
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

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/sma/smartv3/view/MarqueeTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3
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

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/view/MarqueeTextView;->X11iII1O1:Ljava/util/List;

    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/sma/smartv3/view/MarqueeTextView;->XXX11i:I

    const-wide/16 v1, 0xbb8

    .line 6
    iput-wide v1, p0, Lcom/sma/smartv3/view/MarqueeTextView;->X1IX:J

    const-wide/16 v1, 0x1f4

    .line 7
    iput-wide v1, p0, Lcom/sma/smartv3/view/MarqueeTextView;->X0i1O:J

    .line 8
    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    iput-object v1, p0, Lcom/sma/smartv3/view/MarqueeTextView;->iIXi1iiXI:Landroid/os/Handler;

    .line 9
    iput-boolean v0, p0, Lcom/sma/smartv3/view/MarqueeTextView;->iXiX011:Z

    .line 10
    new-instance v1, Lcom/sma/smartv3/view/MarqueeTextView$OXO1;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/view/MarqueeTextView$OXO1;-><init>(Lcom/sma/smartv3/view/MarqueeTextView;)V

    iput-object v1, p0, Lcom/sma/smartv3/view/MarqueeTextView;->iXiiiO:Ljava/lang/Runnable;

    .line 11
    new-instance v1, Lcom/android/mltcode/paycertificationapi/xj4;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/xj4;-><init>(Landroid/view/View;)V

    iput-object v1, p0, Lcom/sma/smartv3/view/MarqueeTextView;->O001I:Lcom/android/mltcode/paycertificationapi/xj4;

    .line 12
    invoke-virtual {v1, p2, p3}, Lcom/android/mltcode/paycertificationapi/xj4;->iO(Landroid/util/AttributeSet;I)V

    .line 13
    iput-object p1, p0, Lcom/sma/smartv3/view/MarqueeTextView;->IO:Landroid/content/Context;

    .line 14
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    sget-object p3, Lcom/sma/smartv3/R$styleable;->MarqueTextView:[I

    invoke-virtual {p1, p2, p3, v0, v0}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 15
    iget-wide p2, p0, Lcom/sma/smartv3/view/MarqueeTextView;->X1IX:J

    long-to-int p2, p2

    const/4 p3, 0x1

    invoke-virtual {p1, p3, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    int-to-long p2, p2

    iput-wide p2, p0, Lcom/sma/smartv3/view/MarqueeTextView;->X1IX:J

    .line 16
    iget-wide p2, p0, Lcom/sma/smartv3/view/MarqueeTextView;->X0i1O:J

    long-to-int p2, p2

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    int-to-long p2, p2

    iput-wide p2, p0, Lcom/sma/smartv3/view/MarqueeTextView;->X0i1O:J

    const/4 p2, 0x3

    const/high16 p3, 0x41800000    # 16.0f

    .line 17
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    const/4 p3, 0x2

    const v0, -0xcccccd

    .line 18
    invoke-virtual {p1, p3, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p3

    .line 19
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 20
    invoke-virtual {p0, p2, p3}, Lcom/sma/smartv3/view/MarqueeTextView;->IO(FI)Landroid/widget/TextView;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/view/MarqueeTextView;->I1:Landroid/widget/TextView;

    .line 21
    invoke-virtual {p0, p2, p3}, Lcom/sma/smartv3/view/MarqueeTextView;->IO(FI)Landroid/widget/TextView;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/view/MarqueeTextView;->iX1O1:Landroid/widget/TextView;

    .line 22
    iget-object p1, p0, Lcom/sma/smartv3/view/MarqueeTextView;->I1:Landroid/widget/TextView;

    new-instance p2, Landroid/widget/FrameLayout$LayoutParams;

    const/4 p3, -0x1

    const/4 v0, -0x2

    invoke-direct {p2, p3, v0}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 23
    iget-object p1, p0, Lcom/sma/smartv3/view/MarqueeTextView;->iX1O1:Landroid/widget/TextView;

    new-instance p2, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {p2, p3, v0}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 24
    iget-object p1, p0, Lcom/sma/smartv3/view/MarqueeTextView;->iX1O1:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p2

    int-to-float p2, p2

    invoke-virtual {p1, p2}, Landroid/view/View;->setTranslationY(F)V

    return-void
.end method

.method public static bridge synthetic I0IIOi(Lcom/sma/smartv3/view/MarqueeTextView;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/view/MarqueeTextView;->OIi0()V

    return-void
.end method

.method public static bridge synthetic IiI10X(Lcom/sma/smartv3/view/MarqueeTextView;Landroid/widget/TextView;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/view/MarqueeTextView;->I1:Landroid/widget/TextView;

    return-void
.end method

.method public static bridge synthetic O00(Lcom/sma/smartv3/view/MarqueeTextView;)Landroid/widget/TextView;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/view/MarqueeTextView;->iX1O1:Landroid/widget/TextView;

    return-object p0
.end method

.method public static bridge synthetic OXO1(Lcom/sma/smartv3/view/MarqueeTextView;)Landroid/widget/TextView;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/view/MarqueeTextView;->I1:Landroid/widget/TextView;

    return-object p0
.end method

.method public static bridge synthetic XIi00iiXO(Lcom/sma/smartv3/view/MarqueeTextView;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/view/MarqueeTextView;->iIXi1iiXI:Landroid/os/Handler;

    return-object p0
.end method

.method public static bridge synthetic XO0O10(Lcom/sma/smartv3/view/MarqueeTextView;)Lcom/sma/smartv3/view/MarqueeTextView$iO;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/view/MarqueeTextView;->XXO:Lcom/sma/smartv3/view/MarqueeTextView$iO;

    return-object p0
.end method

.method public static bridge synthetic XOO0ii0(Lcom/sma/smartv3/view/MarqueeTextView;Landroid/widget/TextView;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/view/MarqueeTextView;->iX1O1:Landroid/widget/TextView;

    return-void
.end method

.method public static bridge synthetic iO(Lcom/sma/smartv3/view/MarqueeTextView;)J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/view/MarqueeTextView;->X1IX:J

    return-wide v0
.end method


# virtual methods
.method public I0iXXO()V
    .locals 4

    iget-boolean v0, p0, Lcom/sma/smartv3/view/MarqueeTextView;->iXiX011:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/sma/smartv3/view/MarqueeTextView;->X11iII1O1:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iput-boolean v1, p0, Lcom/sma/smartv3/view/MarqueeTextView;->iXiX011:Z

    iget-object v0, p0, Lcom/sma/smartv3/view/MarqueeTextView;->iIXi1iiXI:Landroid/os/Handler;

    iget-object v1, p0, Lcom/sma/smartv3/view/MarqueeTextView;->iXiiiO:Ljava/lang/Runnable;

    iget-wide v2, p0, Lcom/sma/smartv3/view/MarqueeTextView;->X1IX:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_1
    :goto_0
    return-void
.end method

.method public final IO(FI)Landroid/widget/TextView;
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "textSize",
            "textColor"
        }
    .end annotation

    new-instance v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/sma/smartv3/view/MarqueeTextView;->IO:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/view/MarqueeTextView;->OIX0iXi(F)F

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextSize(F)V

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 p1, 0x1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setSingleLine(Z)V

    iget-object p1, p0, Lcom/sma/smartv3/view/MarqueeTextView;->IO:Landroid/content/Context;

    const p2, 0x7f06074b

    invoke-static {p1, p2}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    sget-object p1, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    return-object v0
.end method

.method public final OIX0iXi(F)F
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "px"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/view/MarqueeTextView;->IO:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->scaledDensity:F

    div-float/2addr p1, v0

    return p1
.end method

.method public final OIi0()V
    .locals 10

    iget v0, p0, Lcom/sma/smartv3/view/MarqueeTextView;->XXX11i:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iget-object v2, p0, Lcom/sma/smartv3/view/MarqueeTextView;->X11iII1O1:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    rem-int/2addr v0, v2

    iget-object v2, p0, Lcom/sma/smartv3/view/MarqueeTextView;->iX1O1:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/sma/smartv3/view/MarqueeTextView;->X11iII1O1:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, p0, Lcom/sma/smartv3/view/MarqueeTextView;->iX1O1:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v2, v3}, Landroid/view/View;->setTranslationY(F)V

    iget-object v2, p0, Lcom/sma/smartv3/view/MarqueeTextView;->I1:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    neg-int v3, v3

    int-to-float v3, v3

    const/4 v4, 0x0

    const/4 v5, 0x2

    new-array v6, v5, [F

    const/4 v7, 0x0

    aput v4, v6, v7

    aput v3, v6, v1

    const-string v3, "translationY"

    invoke-static {v2, v3, v6}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v2

    iget-wide v8, p0, Lcom/sma/smartv3/view/MarqueeTextView;->X0i1O:J

    invoke-virtual {v2, v8, v9}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    iget-object v6, p0, Lcom/sma/smartv3/view/MarqueeTextView;->iX1O1:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v8

    int-to-float v8, v8

    new-array v5, v5, [F

    aput v8, v5, v7

    aput v4, v5, v1

    invoke-static {v6, v3, v5}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v1

    iget-wide v3, p0, Lcom/sma/smartv3/view/MarqueeTextView;->X0i1O:J

    invoke-virtual {v1, v3, v4}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    invoke-virtual {v2}, Landroid/animation/ObjectAnimator;->start()V

    invoke-virtual {v1}, Landroid/animation/ObjectAnimator;->start()V

    new-instance v2, Lcom/sma/smartv3/view/MarqueeTextView$XIi00iiXO;

    invoke-direct {v2, p0, v0}, Lcom/sma/smartv3/view/MarqueeTextView$XIi00iiXO;-><init>(Lcom/sma/smartv3/view/MarqueeTextView;I)V

    invoke-virtual {v1, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    return-void
.end method

.method public XXI()V
    .locals 2

    iget-boolean v0, p0, Lcom/sma/smartv3/view/MarqueeTextView;->iXiX011:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/sma/smartv3/view/MarqueeTextView;->iXiX011:Z

    iget-object v0, p0, Lcom/sma/smartv3/view/MarqueeTextView;->iIXi1iiXI:Landroid/os/Handler;

    iget-object v1, p0, Lcom/sma/smartv3/view/MarqueeTextView;->iXiiiO:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method

.method public applySkin()V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/view/MarqueeTextView;->O001I:Lcom/android/mltcode/paycertificationapi/xj4;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/xj4;->OXO1()V

    :cond_0
    return-void
.end method

.method public getCurrentView()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/view/MarqueeTextView;->I1:Landroid/widget/TextView;

    return-object v0
.end method

.method public getNextView()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/view/MarqueeTextView;->iX1O1:Landroid/widget/TextView;

    return-object v0
.end method

.method public onAttachedToWindow()V
    .locals 1

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    iget-boolean v0, p0, Lcom/sma/smartv3/view/MarqueeTextView;->iXiX011:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/view/MarqueeTextView;->I0iXXO()V

    :cond_0
    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 0

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    invoke-virtual {p0}, Lcom/sma/smartv3/view/MarqueeTextView;->XXI()V

    return-void
.end method

.method public setBackgroundResource(I)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "resId"
        }
    .end annotation

    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundResource(I)V

    iget-object v0, p0, Lcom/sma/smartv3/view/MarqueeTextView;->O001I:Lcom/android/mltcode/paycertificationapi/xj4;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/xj4;->XO0O10(I)V

    :cond_0
    return-void
.end method

.method public setCurrentView(Landroid/widget/TextView;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "currentView"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/view/MarqueeTextView;->I1:Landroid/widget/TextView;

    return-void
.end method

.method public setMarqueeListener(Lcom/sma/smartv3/view/MarqueeTextView$iO;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "listener"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/view/MarqueeTextView;->XXO:Lcom/sma/smartv3/view/MarqueeTextView$iO;

    return-void
.end method

.method public setNextView(Landroid/widget/TextView;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "nextView"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/view/MarqueeTextView;->iX1O1:Landroid/widget/TextView;

    return-void
.end method

.method public setTextList(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "list"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/view/MarqueeTextView;->X11iII1O1:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/sma/smartv3/view/MarqueeTextView;->X11iII1O1:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    const/4 p1, 0x0

    iput p1, p0, Lcom/sma/smartv3/view/MarqueeTextView;->XXX11i:I

    iget-object v0, p0, Lcom/sma/smartv3/view/MarqueeTextView;->I1:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/sma/smartv3/view/MarqueeTextView;->X11iII1O1:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/sma/smartv3/view/MarqueeTextView;->XXO:Lcom/sma/smartv3/view/MarqueeTextView$iO;

    if-eqz p1, :cond_1

    iget v0, p0, Lcom/sma/smartv3/view/MarqueeTextView;->XXX11i:I

    invoke-interface {p1, v0}, Lcom/sma/smartv3/view/MarqueeTextView$iO;->OXO1(I)V

    :cond_1
    :goto_0
    return-void
.end method
