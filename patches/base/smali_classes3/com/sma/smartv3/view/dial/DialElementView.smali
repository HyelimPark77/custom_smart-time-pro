.class public final Lcom/sma/smartv3/view/dial/DialElementView;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# instance fields
.field public I1:Z

.field public IO:Z

.field public Ii1iii0:I

.field public O001I:I

.field public OO:Landroidx/core/widget/NestedScrollView;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public OX110i:Landroid/widget/ImageView;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public X0i1O:I

.field public X100O:F

.field public X11I:F

.field public X11iII1O1:I

.field public X1IX:Z

.field public XOX0O0:Z

.field public XX1Oi:Landroid/widget/TextView;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public XXO:I

.field public XXX11i:I

.field public iIXi1iiXI:I

.field public iOiXi11II:F

.field public iX1O1:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public iXiX011:I

.field public iXiiiO:I

.field public iiiO:I


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

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/view/dial/DialElementView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/view/dial/DialElementView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p3, 0x1

    .line 4
    iput-boolean p3, p0, Lcom/sma/smartv3/view/dial/DialElementView;->IO:Z

    .line 5
    iput-boolean p3, p0, Lcom/sma/smartv3/view/dial/DialElementView;->I1:Z

    .line 6
    const-string v0, "80"

    iput-object v0, p0, Lcom/sma/smartv3/view/dial/DialElementView;->iX1O1:Ljava/lang/String;

    .line 7
    iput-boolean p3, p0, Lcom/sma/smartv3/view/dial/DialElementView;->XOX0O0:Z

    const/high16 p3, 0x3f800000    # 1.0f

    .line 8
    iput p3, p0, Lcom/sma/smartv3/view/dial/DialElementView;->iOiXi11II:F

    .line 9
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/view/dial/DialElementView;->XIi00iiXO(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 10
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/view/dial/DialElementView;->OXO1(Landroid/content/Context;)V

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
    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/view/dial/DialElementView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public final IiI10X(FF)Z
    .locals 6

    invoke-virtual {p0, p2}, Lcom/sma/smartv3/view/dial/DialElementView;->XO0O10(F)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget v0, p0, Lcom/sma/smartv3/view/dial/DialElementView;->iXiiiO:I

    int-to-float v0, v0

    iget v2, p0, Lcom/sma/smartv3/view/dial/DialElementView;->XXO:I

    int-to-float v2, v2

    add-float/2addr v2, p1

    sub-float/2addr v0, v2

    iget v2, p0, Lcom/sma/smartv3/view/dial/DialElementView;->Ii1iii0:I

    int-to-float v2, v2

    iget v3, p0, Lcom/sma/smartv3/view/dial/DialElementView;->O001I:I

    int-to-float v3, v3

    add-float/2addr v3, p2

    sub-float/2addr v2, v3

    invoke-virtual {p0, v0, v2}, Lcom/sma/smartv3/view/dial/DialElementView;->O00(FF)Z

    move-result v0

    iget v2, p0, Lcom/sma/smartv3/view/dial/DialElementView;->iXiiiO:I

    int-to-float v2, v2

    iget v3, p0, Lcom/sma/smartv3/view/dial/DialElementView;->XXO:I

    int-to-float v3, v3

    add-float/2addr v3, p1

    sub-float/2addr v2, v3

    iget v3, p0, Lcom/sma/smartv3/view/dial/DialElementView;->Ii1iii0:I

    int-to-float v3, v3

    iget v4, p0, Lcom/sma/smartv3/view/dial/DialElementView;->O001I:I

    int-to-float v4, v4

    add-float/2addr v4, p2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v5

    int-to-float v5, v5

    add-float/2addr v4, v5

    sub-float/2addr v3, v4

    invoke-virtual {p0, v2, v3}, Lcom/sma/smartv3/view/dial/DialElementView;->O00(FF)Z

    move-result v2

    iget v3, p0, Lcom/sma/smartv3/view/dial/DialElementView;->iXiiiO:I

    int-to-float v3, v3

    iget v4, p0, Lcom/sma/smartv3/view/dial/DialElementView;->XXO:I

    int-to-float v4, v4

    add-float/2addr v4, p1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v5

    int-to-float v5, v5

    add-float/2addr v4, v5

    sub-float/2addr v3, v4

    iget v4, p0, Lcom/sma/smartv3/view/dial/DialElementView;->Ii1iii0:I

    int-to-float v4, v4

    iget v5, p0, Lcom/sma/smartv3/view/dial/DialElementView;->O001I:I

    int-to-float v5, v5

    add-float/2addr v5, p2

    sub-float/2addr v4, v5

    invoke-virtual {p0, v3, v4}, Lcom/sma/smartv3/view/dial/DialElementView;->O00(FF)Z

    move-result v3

    iget v4, p0, Lcom/sma/smartv3/view/dial/DialElementView;->iXiiiO:I

    int-to-float v4, v4

    iget v5, p0, Lcom/sma/smartv3/view/dial/DialElementView;->XXO:I

    int-to-float v5, v5

    add-float/2addr p1, v5

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v5

    int-to-float v5, v5

    add-float/2addr p1, v5

    sub-float/2addr v4, p1

    iget p1, p0, Lcom/sma/smartv3/view/dial/DialElementView;->Ii1iii0:I

    int-to-float p1, p1

    iget v5, p0, Lcom/sma/smartv3/view/dial/DialElementView;->O001I:I

    int-to-float v5, v5

    add-float/2addr p2, v5

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v5

    int-to-float v5, v5

    add-float/2addr p2, v5

    sub-float/2addr p1, p2

    invoke-virtual {p0, v4, p1}, Lcom/sma/smartv3/view/dial/DialElementView;->O00(FF)Z

    move-result p1

    if-eqz v0, :cond_1

    if-eqz v2, :cond_1

    if-eqz v3, :cond_1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final O00(FF)Z
    .locals 2

    mul-float/2addr p1, p1

    mul-float/2addr p2, p2

    add-float/2addr p1, p2

    float-to-double p1, p1

    invoke-static {p1, p2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide p1

    iget v0, p0, Lcom/sma/smartv3/view/dial/DialElementView;->iiiO:I

    int-to-double v0, v0

    cmpg-double p1, p1, v0

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final OXO1(Landroid/content/Context;)V
    .locals 3

    iget v0, p0, Lcom/sma/smartv3/view/dial/DialElementView;->X0i1O:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iget v0, p0, Lcom/sma/smartv3/view/dial/DialElementView;->XXX11i:I

    invoke-virtual {p1, v0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    const v0, 0x7f0a05fc

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/sma/smartv3/view/dial/DialElementView;->OX110i:Landroid/widget/ImageView;

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void

    :cond_0
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iget v0, p0, Lcom/sma/smartv3/view/dial/DialElementView;->XXX11i:I

    invoke-virtual {p1, v0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    const v0, 0x7f0a0286

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iget v1, p0, Lcom/sma/smartv3/view/dial/DialElementView;->X11iII1O1:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    const v0, 0x7f0a0bf7

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/view/dial/DialElementView;->XX1Oi:Landroid/widget/TextView;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/sma/smartv3/view/dial/DialElementView;->iX1O1:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method public final XIi00iiXO(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    sget-object v0, Lcom/sma/smartv3/R$styleable;->DialElementView:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const-string p2, "obtainStyledAttributes(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x0

    iget-boolean v0, p0, Lcom/sma/smartv3/view/dial/DialElementView;->IO:Z

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/sma/smartv3/view/dial/DialElementView;->IO:Z

    iget-boolean p2, p0, Lcom/sma/smartv3/view/dial/DialElementView;->I1:Z

    const/4 v0, 0x1

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/sma/smartv3/view/dial/DialElementView;->I1:Z

    const/4 p2, 0x2

    iget v1, p0, Lcom/sma/smartv3/view/dial/DialElementView;->X0i1O:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/dial/DialElementView;->X0i1O:I

    if-ne p2, v0, :cond_0

    const p2, 0x7f0d02db

    goto :goto_0

    :cond_0
    const p2, 0x7f0d02d9

    :goto_0
    const/4 v0, 0x4

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/dial/DialElementView;->XXX11i:I

    const/4 p2, 0x3

    const v0, 0x7f0808af

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/dial/DialElementView;->X11iII1O1:I

    const/4 p2, 0x5

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/sma/smartv3/view/dial/DialElementView;->iX1O1:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public final XO0O10(F)Z
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    add-float/2addr p1, v0

    iget v0, p0, Lcom/sma/smartv3/view/dial/DialElementView;->iXiX011:I

    int-to-float v0, v0

    iget v1, p0, Lcom/sma/smartv3/view/dial/DialElementView;->iOiXi11II:F

    mul-float/2addr v0, v1

    sub-float/2addr v0, p1

    const/4 p1, 0x0

    cmpl-float p1, v0, p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final XOO0ii0()V
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getY()F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/view/dial/DialElementView;->XO0O10(F)Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Lcom/sma/smartv3/view/dial/DialElementView;->iXiX011:I

    int-to-float v0, v0

    iget v1, p0, Lcom/sma/smartv3/view/dial/DialElementView;->iOiXi11II:F

    mul-float/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr v0, v1

    invoke-virtual {p0, v0}, Landroid/view/View;->setY(F)V

    :cond_0
    return-void
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/view/dial/DialElementView;->OO:Landroidx/core/widget/NestedScrollView;

    if-eqz p1, :cond_1

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Landroidx/core/widget/NestedScrollView;->requestDisallowInterceptTouchEvent(Z)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/view/dial/DialElementView;->OO:Landroidx/core/widget/NestedScrollView;

    if-eqz p1, :cond_1

    invoke-virtual {p1, v0}, Landroidx/core/widget/NestedScrollView;->requestDisallowInterceptTouchEvent(Z)V

    :cond_1
    :goto_0
    return v0
.end method

.method public final iO()V
    .locals 4

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v0, v0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.view.ViewGroup"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/ViewGroup;

    const/4 v1, 0x2

    new-array v2, v1, [I

    invoke-virtual {v0, v2}, Landroid/view/View;->getLocationInWindow([I)V

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    iput v3, p0, Lcom/sma/smartv3/view/dial/DialElementView;->iXiX011:I

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/dial/DialElementView;->iIXi1iiXI:I

    iget-boolean v3, p0, Lcom/sma/smartv3/view/dial/DialElementView;->XOX0O0:Z

    if-eqz v3, :cond_1

    iget v3, p0, Lcom/sma/smartv3/view/dial/DialElementView;->iXiX011:I

    if-eq v3, v0, :cond_1

    if-ge v3, v0, :cond_0

    iput v3, p0, Lcom/sma/smartv3/view/dial/DialElementView;->iIXi1iiXI:I

    goto :goto_0

    :cond_0
    iput v0, p0, Lcom/sma/smartv3/view/dial/DialElementView;->iXiX011:I

    :cond_1
    :goto_0
    const/4 v0, 0x0

    aget v0, v2, v0

    iput v0, p0, Lcom/sma/smartv3/view/dial/DialElementView;->XXO:I

    const/4 v3, 0x1

    aget v2, v2, v3

    iput v2, p0, Lcom/sma/smartv3/view/dial/DialElementView;->O001I:I

    iget v3, p0, Lcom/sma/smartv3/view/dial/DialElementView;->iIXi1iiXI:I

    div-int/2addr v3, v1

    iput v3, p0, Lcom/sma/smartv3/view/dial/DialElementView;->iiiO:I

    add-int/2addr v0, v3

    iput v0, p0, Lcom/sma/smartv3/view/dial/DialElementView;->iXiiiO:I

    add-int/2addr v2, v3

    iput v2, p0, Lcom/sma/smartv3/view/dial/DialElementView;->Ii1iii0:I

    :cond_2
    return-void
.end method

.method public onSizeChanged(IIII)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    invoke-virtual {p0}, Lcom/sma/smartv3/view/dial/DialElementView;->iO()V

    invoke-virtual {p0}, Lcom/sma/smartv3/view/dial/DialElementView;->XOO0ii0()V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 11
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    if-eqz p1, :cond_c

    iget-boolean v0, p0, Lcom/sma/smartv3/view/dial/DialElementView;->I1:Z

    if-eqz v0, :cond_c

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_b

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eq v2, v5, :cond_9

    if-eq v2, v4, :cond_0

    goto/16 :goto_3

    :cond_0
    iget v2, p0, Lcom/sma/smartv3/view/dial/DialElementView;->XXO:I

    int-to-float v4, v2

    cmpl-float v4, v0, v4

    if-ltz v4, :cond_c

    iget v4, p0, Lcom/sma/smartv3/view/dial/DialElementView;->iIXi1iiXI:I

    add-int/2addr v4, v2

    int-to-float v2, v4

    cmpg-float v2, v0, v2

    if-gtz v2, :cond_c

    iget v2, p0, Lcom/sma/smartv3/view/dial/DialElementView;->O001I:I

    int-to-float v4, v2

    cmpl-float v4, v1, v4

    if-ltz v4, :cond_c

    iget v4, p0, Lcom/sma/smartv3/view/dial/DialElementView;->iXiX011:I

    add-int/2addr v4, v2

    int-to-float v2, v4

    cmpg-float v2, v1, v2

    if-gtz v2, :cond_c

    iget v2, p0, Lcom/sma/smartv3/view/dial/DialElementView;->X11I:F

    sub-float v2, v0, v2

    iget v4, p0, Lcom/sma/smartv3/view/dial/DialElementView;->X100O:F

    sub-float v4, v1, v4

    iget-boolean v7, p0, Lcom/sma/smartv3/view/dial/DialElementView;->X1IX:Z

    if-nez v7, :cond_2

    iget-boolean v7, p0, Lcom/sma/smartv3/view/dial/DialElementView;->IO:Z

    if-eqz v7, :cond_2

    mul-float v7, v2, v2

    mul-float v8, v4, v4

    add-float/2addr v7, v8

    float-to-double v7, v7

    invoke-static {v7, v8}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v7

    const-wide/high16 v9, 0x4000000000000000L    # 2.0

    cmpl-double v7, v7, v9

    if-ltz v7, :cond_1

    goto :goto_0

    :cond_1
    move v5, v3

    :goto_0
    iput-boolean v5, p0, Lcom/sma/smartv3/view/dial/DialElementView;->X1IX:Z

    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getX()F

    move-result v5

    invoke-virtual {p0}, Landroid/view/View;->getY()F

    move-result v7

    add-float/2addr v5, v2

    add-float/2addr v7, v4

    iget v2, p0, Lcom/sma/smartv3/view/dial/DialElementView;->iIXi1iiXI:I

    int-to-float v2, v2

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v4

    int-to-float v4, v4

    sub-float/2addr v2, v4

    iget v4, p0, Lcom/sma/smartv3/view/dial/DialElementView;->iXiX011:I

    int-to-float v4, v4

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v8

    int-to-float v8, v8

    sub-float/2addr v4, v8

    cmpg-float v8, v5, v6

    if-gez v8, :cond_3

    move v5, v6

    goto :goto_1

    :cond_3
    cmpl-float v8, v5, v2

    if-lez v8, :cond_4

    move v5, v2

    :cond_4
    :goto_1
    cmpg-float v2, v7, v6

    if-gez v2, :cond_5

    goto :goto_2

    :cond_5
    cmpl-float v2, v7, v4

    if-lez v2, :cond_6

    move v6, v4

    goto :goto_2

    :cond_6
    move v6, v7

    :goto_2
    iget-boolean v2, p0, Lcom/sma/smartv3/view/dial/DialElementView;->XOX0O0:Z

    if-eqz v2, :cond_8

    invoke-virtual {p0, v5, v6}, Lcom/sma/smartv3/view/dial/DialElementView;->IiI10X(FF)Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-virtual {p0, v5}, Landroid/view/View;->setX(F)V

    invoke-virtual {p0, v6}, Landroid/view/View;->setY(F)V

    iput v0, p0, Lcom/sma/smartv3/view/dial/DialElementView;->X11I:F

    iput v1, p0, Lcom/sma/smartv3/view/dial/DialElementView;->X100O:F

    invoke-static {}, Lcom/blankj/utilcode/util/ToastUtils;->cancel()V

    goto :goto_3

    :cond_7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f14145d

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-array v1, v3, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_3

    :cond_8
    invoke-virtual {p0, v5}, Landroid/view/View;->setX(F)V

    invoke-virtual {p0, v6}, Landroid/view/View;->setY(F)V

    iput v0, p0, Lcom/sma/smartv3/view/dial/DialElementView;->X11I:F

    iput v1, p0, Lcom/sma/smartv3/view/dial/DialElementView;->X100O:F

    goto :goto_3

    :cond_9
    iget-boolean v0, p0, Lcom/sma/smartv3/view/dial/DialElementView;->IO:Z

    if-eqz v0, :cond_c

    iget-boolean v0, p0, Lcom/sma/smartv3/view/dial/DialElementView;->X1IX:Z

    if-eqz v0, :cond_c

    iget v0, p0, Lcom/sma/smartv3/view/dial/DialElementView;->iIXi1iiXI:I

    div-int/2addr v0, v4

    iget v1, p0, Lcom/sma/smartv3/view/dial/DialElementView;->X11I:F

    int-to-float v0, v0

    cmpg-float v0, v1, v0

    const-wide/16 v1, 0x1f4

    if-gtz v0, :cond_a

    invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v3, Landroid/view/animation/BounceInterpolator;

    invoke-direct {v3}, Landroid/view/animation/BounceInterpolator;-><init>()V

    invoke-virtual {v0, v3}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/view/ViewPropertyAnimator;->x(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    goto :goto_3

    :cond_a
    invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v3, Landroid/view/animation/BounceInterpolator;

    invoke-direct {v3}, Landroid/view/animation/BounceInterpolator;-><init>()V

    invoke-virtual {v0, v3}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    iget v1, p0, Lcom/sma/smartv3/view/dial/DialElementView;->iIXi1iiXI:I

    int-to-float v1, v1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v1, v2

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->x(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    goto :goto_3

    :cond_b
    iput-boolean v3, p0, Lcom/sma/smartv3/view/dial/DialElementView;->X1IX:Z

    iput v0, p0, Lcom/sma/smartv3/view/dial/DialElementView;->X11I:F

    iput v1, p0, Lcom/sma/smartv3/view/dial/DialElementView;->X100O:F

    :cond_c
    :goto_3
    iget-boolean v0, p0, Lcom/sma/smartv3/view/dial/DialElementView;->X1IX:Z

    if-eqz v0, :cond_d

    return v0

    :cond_d
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public final setBottomRangeScale(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/view/dial/DialElementView;->iOiXi11II:F

    return-void
.end method

.method public final setImageRes(I)V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/view/dial/DialElementView;->OX110i:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_0
    return-void
.end method

.method public final setIsRangeCircle(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/view/dial/DialElementView;->XOX0O0:Z

    return-void
.end method

.method public final setScrollView(Landroidx/core/widget/NestedScrollView;)V
    .locals 1
    .param p1    # Landroidx/core/widget/NestedScrollView;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/view/dial/DialElementView;->OO:Landroidx/core/widget/NestedScrollView;

    return-void
.end method

.method public final setTextColor(I)V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/view/dial/DialElementView;->XX1Oi:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_0
    return-void
.end method
