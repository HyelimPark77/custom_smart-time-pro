.class public final Lcom/sma/smartv3/view/ProgressButton2;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field public I1:I

.field public IO:I

.field public Ii1iii0:F

.field public O001I:I

.field public final X0i1O:Landroid/graphics/Xfermode;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public X100O:Landroid/animation/ValueAnimator;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public X11I:Z

.field public final X11iII1O1:Landroid/graphics/RectF;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public X1IX:I

.field public XXO:I

.field public XXX11i:I

.field public final iIXi1iiXI:F

.field public final iX1O1:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final iXiX011:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public iXiiiO:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public iiiO:F


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

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/view/ProgressButton2;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/view/ProgressButton2;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3
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
    new-instance p3, Landroid/graphics/Paint;

    invoke-direct {p3}, Landroid/graphics/Paint;-><init>()V

    iput-object p3, p0, Lcom/sma/smartv3/view/ProgressButton2;->iX1O1:Landroid/graphics/Paint;

    .line 5
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/view/ProgressButton2;->X11iII1O1:Landroid/graphics/RectF;

    const v0, 0x7f0600b4

    .line 6
    invoke-static {p1, v0}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    iput v1, p0, Lcom/sma/smartv3/view/ProgressButton2;->XXX11i:I

    const v1, 0x7f06078f

    .line 7
    invoke-static {p1, v1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    iput v1, p0, Lcom/sma/smartv3/view/ProgressButton2;->X1IX:I

    .line 8
    new-instance v1, Landroid/graphics/PorterDuffXfermode;

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v1, v2}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    iput-object v1, p0, Lcom/sma/smartv3/view/ProgressButton2;->X0i1O:Landroid/graphics/Xfermode;

    const/4 v1, 0x0

    .line 9
    invoke-static {v1}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result v1

    int-to-float v1, v1

    iput v1, p0, Lcom/sma/smartv3/view/ProgressButton2;->iIXi1iiXI:F

    .line 10
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    iput-object v1, p0, Lcom/sma/smartv3/view/ProgressButton2;->iXiX011:Landroid/graphics/Paint;

    .line 11
    invoke-static {p1, v0}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/ProgressButton2;->O001I:I

    const v0, 0x7f06024d

    .line 12
    invoke-static {p1, v0}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/ProgressButton2;->XXO:I

    .line 13
    const-string v0, ""

    iput-object v0, p0, Lcom/sma/smartv3/view/ProgressButton2;->iXiiiO:Ljava/lang/String;

    .line 14
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/view/ProgressButton2;->XIi00iiXO(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x1

    .line 15
    invoke-virtual {p3, p1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 16
    invoke-virtual {p3, p1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 17
    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 18
    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->setDither(Z)V

    const/high16 p1, 0x41700000    # 15.0f

    .line 19
    invoke-static {p1}, Lcom/blankj/utilcode/util/ConvertUtils;->dp2px(F)I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 20
    sget-object p1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

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

    .line 21
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/view/ProgressButton2;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic IiI10X(Lcom/sma/smartv3/view/ProgressButton2;IZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/view/ProgressButton2;->XO0O10(IZ)V

    return-void
.end method

.method public static final OIi0(Lcom/sma/smartv3/view/ProgressButton2;Landroid/animation/ValueAnimator;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type kotlin.Float"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/view/ProgressButton2;->iiiO:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/view/ProgressButton2;Landroid/animation/ValueAnimator;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/view/ProgressButton2;->OIi0(Lcom/sma/smartv3/view/ProgressButton2;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static synthetic XOO0ii0(Lcom/sma/smartv3/view/ProgressButton2;Ljava/lang/String;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/view/ProgressButton2;->O00(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public final I0IIOi()V
    .locals 3

    invoke-virtual {p0}, Lcom/sma/smartv3/view/ProgressButton2;->IO()V

    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    const-wide/16 v1, 0x3e8

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    new-instance v1, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/b72;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/b72;-><init>(Lcom/sma/smartv3/view/ProgressButton2;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    iput-object v0, p0, Lcom/sma/smartv3/view/ProgressButton2;->X100O:Landroid/animation/ValueAnimator;

    return-void

    :array_0
    .array-data 4
        0x0
        0x43b40000    # 360.0f
    .end array-data
.end method

.method public final IO()V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/view/ProgressButton2;->X100O:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/sma/smartv3/view/ProgressButton2;->X100O:Landroid/animation/ValueAnimator;

    return-void
.end method

.method public final O00(Ljava/lang/String;Z)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "string"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/sma/smartv3/view/ProgressButton2;->iXiX011:Landroid/graphics/Paint;

    iget v0, p0, Lcom/sma/smartv3/view/ProgressButton2;->XXO:I

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setColor(I)V

    const/high16 p2, 0x3f800000    # 1.0f

    iput p2, p0, Lcom/sma/smartv3/view/ProgressButton2;->Ii1iii0:F

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    iput p2, p0, Lcom/sma/smartv3/view/ProgressButton2;->Ii1iii0:F

    iget-object p2, p0, Lcom/sma/smartv3/view/ProgressButton2;->iXiX011:Landroid/graphics/Paint;

    iget v0, p0, Lcom/sma/smartv3/view/ProgressButton2;->O001I:I

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setColor(I)V

    :goto_0
    iput-object p1, p0, Lcom/sma/smartv3/view/ProgressButton2;->iXiiiO:Ljava/lang/String;

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final XIi00iiXO(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    sget-object v0, Lcom/sma/smartv3/R$styleable;->ProgressButton:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const-string p2, "obtainStyledAttributes(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/sma/smartv3/view/ProgressButton2;->XXX11i:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/ProgressButton2;->XXX11i:I

    :cond_0
    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/sma/smartv3/view/ProgressButton2;->X1IX:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/ProgressButton2;->X1IX:I

    :cond_1
    const/4 p2, 0x3

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_2

    iget v0, p0, Lcom/sma/smartv3/view/ProgressButton2;->O001I:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/ProgressButton2;->O001I:I

    :cond_2
    const/4 p2, 0x2

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_3

    iget v0, p0, Lcom/sma/smartv3/view/ProgressButton2;->XXO:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/view/ProgressButton2;->XXO:I

    :cond_3
    return-void
.end method

.method public final XO0O10(IZ)V
    .locals 1

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/sma/smartv3/view/ProgressButton2;->iXiX011:Landroid/graphics/Paint;

    iget v0, p0, Lcom/sma/smartv3/view/ProgressButton2;->XXO:I

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setColor(I)V

    const/high16 p2, 0x3f800000    # 1.0f

    iput p2, p0, Lcom/sma/smartv3/view/ProgressButton2;->Ii1iii0:F

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    iput p2, p0, Lcom/sma/smartv3/view/ProgressButton2;->Ii1iii0:F

    iget-object p2, p0, Lcom/sma/smartv3/view/ProgressButton2;->iXiX011:Landroid/graphics/Paint;

    iget v0, p0, Lcom/sma/smartv3/view/ProgressButton2;->O001I:I

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setColor(I)V

    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string p2, "getString(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/view/ProgressButton2;->iXiiiO:Ljava/lang/String;

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final iO(Ljava/lang/String;F)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput p2, p0, Lcom/sma/smartv3/view/ProgressButton2;->Ii1iii0:F

    iput-object p1, p0, Lcom/sma/smartv3/view/ProgressButton2;->iXiiiO:Ljava/lang/String;

    iget-object p1, p0, Lcom/sma/smartv3/view/ProgressButton2;->iXiX011:Landroid/graphics/Paint;

    iget p2, p0, Lcom/sma/smartv3/view/ProgressButton2;->XXO:I

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 14
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x1f

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v1, v0}, Landroid/graphics/Canvas;->saveLayer(Landroid/graphics/RectF;Landroid/graphics/Paint;I)I

    move-result v0

    iget-object v2, p0, Lcom/sma/smartv3/view/ProgressButton2;->iX1O1:Landroid/graphics/Paint;

    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    iget v1, p0, Lcom/sma/smartv3/view/ProgressButton2;->X1IX:I

    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v1, p0, Lcom/sma/smartv3/view/ProgressButton2;->X11iII1O1:Landroid/graphics/RectF;

    iget v2, p0, Lcom/sma/smartv3/view/ProgressButton2;->iIXi1iiXI:F

    iget v3, p0, Lcom/sma/smartv3/view/ProgressButton2;->IO:I

    int-to-float v3, v3

    sub-float/2addr v3, v2

    iget v4, p0, Lcom/sma/smartv3/view/ProgressButton2;->I1:I

    int-to-float v4, v4

    sub-float/2addr v4, v2

    invoke-virtual {v1, v2, v2, v3, v4}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v1, p0, Lcom/sma/smartv3/view/ProgressButton2;->X11iII1O1:Landroid/graphics/RectF;

    iget v2, p0, Lcom/sma/smartv3/view/ProgressButton2;->I1:I

    int-to-float v3, v2

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    int-to-float v2, v2

    div-float/2addr v2, v4

    iget-object v5, p0, Lcom/sma/smartv3/view/ProgressButton2;->iX1O1:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v3, v2, v5}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    iget-object v1, p0, Lcom/sma/smartv3/view/ProgressButton2;->iX1O1:Landroid/graphics/Paint;

    iget-object v2, p0, Lcom/sma/smartv3/view/ProgressButton2;->X0i1O:Landroid/graphics/Xfermode;

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    iget v2, p0, Lcom/sma/smartv3/view/ProgressButton2;->XXX11i:I

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v1, p0, Lcom/sma/smartv3/view/ProgressButton2;->X11iII1O1:Landroid/graphics/RectF;

    iget v2, p0, Lcom/sma/smartv3/view/ProgressButton2;->IO:I

    int-to-float v2, v2

    iget v3, p0, Lcom/sma/smartv3/view/ProgressButton2;->Ii1iii0:F

    mul-float/2addr v2, v3

    iget v3, p0, Lcom/sma/smartv3/view/ProgressButton2;->I1:I

    int-to-float v3, v3

    const/4 v5, 0x0

    invoke-virtual {v1, v5, v5, v2, v3}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v1, p0, Lcom/sma/smartv3/view/ProgressButton2;->X11iII1O1:Landroid/graphics/RectF;

    iget-object v2, p0, Lcom/sma/smartv3/view/ProgressButton2;->iX1O1:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v2}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    iget v0, p0, Lcom/sma/smartv3/view/ProgressButton2;->I1:I

    int-to-float v0, v0

    div-float/2addr v0, v4

    iget-object v1, p0, Lcom/sma/smartv3/view/ProgressButton2;->iXiX011:Landroid/graphics/Paint;

    invoke-virtual {v1}, Landroid/graphics/Paint;->getTextSize()F

    move-result v1

    const/high16 v2, 0x40200000    # 2.5f

    div-float/2addr v1, v2

    add-float/2addr v1, v0

    iget-boolean v2, p0, Lcom/sma/smartv3/view/ProgressButton2;->X11I:Z

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/sma/smartv3/view/ProgressButton2;->iXiX011:Landroid/graphics/Paint;

    invoke-virtual {v2}, Landroid/graphics/Paint;->getTextSize()F

    move-result v2

    const/high16 v3, 0x41200000    # 10.0f

    invoke-static {v3}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result v3

    int-to-float v3, v3

    iget-object v5, p0, Lcom/sma/smartv3/view/ProgressButton2;->iXiX011:Landroid/graphics/Paint;

    iget-object v6, p0, Lcom/sma/smartv3/view/ProgressButton2;->iXiiiO:Ljava/lang/String;

    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v5

    add-float v6, v2, v3

    add-float/2addr v6, v5

    iget v5, p0, Lcom/sma/smartv3/view/ProgressButton2;->IO:I

    int-to-float v5, v5

    sub-float/2addr v5, v6

    div-float/2addr v5, v4

    iget-object v6, p0, Lcom/sma/smartv3/view/ProgressButton2;->iX1O1:Landroid/graphics/Paint;

    iget-object v7, p0, Lcom/sma/smartv3/view/ProgressButton2;->iXiX011:Landroid/graphics/Paint;

    invoke-virtual {v7}, Landroid/graphics/Paint;->getColor()I

    move-result v7

    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setColor(I)V

    invoke-static {v4}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {v6, v4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    sget-object v4, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v6, v4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    sget-object v4, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v6, v4}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    iget-object v4, p0, Lcom/sma/smartv3/view/ProgressButton2;->X11iII1O1:Landroid/graphics/RectF;

    const/4 v6, 0x2

    int-to-float v6, v6

    div-float v6, v2, v6

    sub-float v7, v0, v6

    add-float/2addr v2, v5

    add-float/2addr v0, v6

    invoke-virtual {v4, v5, v7, v2, v0}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v9, p0, Lcom/sma/smartv3/view/ProgressButton2;->X11iII1O1:Landroid/graphics/RectF;

    iget v10, p0, Lcom/sma/smartv3/view/ProgressButton2;->iiiO:F

    const/4 v12, 0x0

    iget-object v13, p0, Lcom/sma/smartv3/view/ProgressButton2;->iX1O1:Landroid/graphics/Paint;

    const/high16 v11, 0x43a50000    # 330.0f

    move-object v8, p1

    invoke-virtual/range {v8 .. v13}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    iget-object p1, p0, Lcom/sma/smartv3/view/ProgressButton2;->iX1O1:Landroid/graphics/Paint;

    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object p1, p0, Lcom/sma/smartv3/view/ProgressButton2;->iXiX011:Landroid/graphics/Paint;

    invoke-virtual {p1}, Landroid/graphics/Paint;->getTextAlign()Landroid/graphics/Paint$Align;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/view/ProgressButton2;->iXiX011:Landroid/graphics/Paint;

    sget-object v4, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    iget-object v0, p0, Lcom/sma/smartv3/view/ProgressButton2;->iXiiiO:Ljava/lang/String;

    add-float/2addr v2, v3

    iget-object v3, p0, Lcom/sma/smartv3/view/ProgressButton2;->iXiX011:Landroid/graphics/Paint;

    invoke-virtual {v8, v0, v2, v1, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    iget-object v0, p0, Lcom/sma/smartv3/view/ProgressButton2;->iXiX011:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    return-void

    :cond_0
    move-object v8, p1

    iget-object p1, p0, Lcom/sma/smartv3/view/ProgressButton2;->iXiiiO:Ljava/lang/String;

    iget v0, p0, Lcom/sma/smartv3/view/ProgressButton2;->IO:I

    int-to-float v0, v0

    div-float/2addr v0, v4

    iget-object v2, p0, Lcom/sma/smartv3/view/ProgressButton2;->iXiX011:Landroid/graphics/Paint;

    invoke-virtual {v8, p1, v0, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    return-void
.end method

.method public onSizeChanged(IIII)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    iput p1, p0, Lcom/sma/smartv3/view/ProgressButton2;->IO:I

    iput p2, p0, Lcom/sma/smartv3/view/ProgressButton2;->I1:I

    return-void
.end method

.method public final setProgress(F)V
    .locals 1

    iput p1, p0, Lcom/sma/smartv3/view/ProgressButton2;->Ii1iii0:F

    sget-object v0, Lkotlin/jvm/internal/StringCompanionObject;->OXO1:Lkotlin/jvm/internal/StringCompanionObject;

    const/16 v0, 0x64

    int-to-float v0, v0

    mul-float/2addr p1, v0

    float-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const/4 v0, 0x1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    const-string v0, "%d%%"

    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "format(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/view/ProgressButton2;->iXiiiO:Ljava/lang/String;

    iget-object p1, p0, Lcom/sma/smartv3/view/ProgressButton2;->iXiX011:Landroid/graphics/Paint;

    iget v0, p0, Lcom/sma/smartv3/view/ProgressButton2;->XXO:I

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setProgressDecimalPlaces(F)V
    .locals 1

    iput p1, p0, Lcom/sma/smartv3/view/ProgressButton2;->Ii1iii0:F

    const/16 v0, 0x64

    int-to-float v0, v0

    mul-float/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const/4 v0, 0x1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    const-string v0, "%.2f"

    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "format(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "%"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/view/ProgressButton2;->iXiiiO:Ljava/lang/String;

    iget-object p1, p0, Lcom/sma/smartv3/view/ProgressButton2;->iXiX011:Landroid/graphics/Paint;

    iget v0, p0, Lcom/sma/smartv3/view/ProgressButton2;->XXO:I

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setShowProgressBar(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/view/ProgressButton2;->X11I:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/view/ProgressButton2;->I0IIOi()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/view/ProgressButton2;->IO()V

    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method
