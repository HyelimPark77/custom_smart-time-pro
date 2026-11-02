.class public final Lcom/sma/smartv3/view/CircularProgressBar;
.super Lskin/support/widget/SkinCompatView;
.source "SourceFile"


# instance fields
.field public final I1:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public Ii1iii0:I

.field public final O001I:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public X0i1O:F

.field public X100O:Z

.field public X11I:F

.field public X11iII1O1:F

.field public X1IX:Z

.field public final XXO:Landroid/graphics/RectF;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public XXX11i:F

.field public final iIXi1iiXI:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public iX1O1:F

.field public final iXiX011:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public iXiiiO:I

.field public final iiiO:F


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

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/view/CircularProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/view/CircularProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4
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
    invoke-direct {p0, p1, p2, p3}, Lskin/support/widget/SkinCompatView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    const-string p3, "CircularProgressBar"

    iput-object p3, p0, Lcom/sma/smartv3/view/CircularProgressBar;->I1:Ljava/lang/String;

    const/high16 p3, 0x43b40000    # 360.0f

    .line 5
    iput p3, p0, Lcom/sma/smartv3/view/CircularProgressBar;->iX1O1:F

    const/high16 p3, 0x43870000    # 270.0f

    .line 6
    iput p3, p0, Lcom/sma/smartv3/view/CircularProgressBar;->X11iII1O1:F

    const/high16 p3, 0x42480000    # 50.0f

    .line 7
    iput p3, p0, Lcom/sma/smartv3/view/CircularProgressBar;->XXX11i:F

    const/4 p3, 0x1

    .line 8
    iput-boolean p3, p0, Lcom/sma/smartv3/view/CircularProgressBar;->X1IX:Z

    .line 9
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/view/CircularProgressBar;->iIXi1iiXI:Landroid/graphics/Paint;

    .line 10
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    iput-object v1, p0, Lcom/sma/smartv3/view/CircularProgressBar;->iXiX011:Landroid/graphics/Paint;

    .line 11
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    iput-object v2, p0, Lcom/sma/smartv3/view/CircularProgressBar;->O001I:Landroid/graphics/Paint;

    .line 12
    new-instance v3, Landroid/graphics/RectF;

    invoke-direct {v3}, Landroid/graphics/RectF;-><init>()V

    iput-object v3, p0, Lcom/sma/smartv3/view/CircularProgressBar;->XXO:Landroid/graphics/RectF;

    const/high16 v3, -0x10000

    .line 13
    iput v3, p0, Lcom/sma/smartv3/view/CircularProgressBar;->iXiiiO:I

    const v3, -0xffff01

    .line 14
    iput v3, p0, Lcom/sma/smartv3/view/CircularProgressBar;->Ii1iii0:I

    const/high16 v3, 0x42c80000    # 100.0f

    .line 15
    iput v3, p0, Lcom/sma/smartv3/view/CircularProgressBar;->iiiO:F

    const/high16 v3, 0x42080000    # 34.0f

    .line 16
    iput v3, p0, Lcom/sma/smartv3/view/CircularProgressBar;->X11I:F

    .line 17
    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/view/CircularProgressBar;->O00(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 18
    iget-boolean p1, p0, Lcom/sma/smartv3/view/CircularProgressBar;->X1IX:Z

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 19
    sget-object p1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 20
    sget-object p2, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, p2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 21
    iget v3, p0, Lcom/sma/smartv3/view/CircularProgressBar;->X0i1O:F

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 22
    iget v3, p0, Lcom/sma/smartv3/view/CircularProgressBar;->iXiiiO:I

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 23
    iget-boolean v0, p0, Lcom/sma/smartv3/view/CircularProgressBar;->X1IX:Z

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 24
    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 25
    invoke-virtual {v1, p2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 26
    iget p1, p0, Lcom/sma/smartv3/view/CircularProgressBar;->X0i1O:F

    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 27
    iget p1, p0, Lcom/sma/smartv3/view/CircularProgressBar;->Ii1iii0:I

    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->setColor(I)V

    const/4 p1, -0x1

    .line 28
    invoke-virtual {v2, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 29
    sget-object p1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 30
    invoke-virtual {v2, p3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 31
    invoke-virtual {p0}, Lcom/sma/smartv3/view/CircularProgressBar;->applySkin()V

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

    .line 32
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/view/CircularProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private final O00(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    sget-object v0, Lcom/sma/smartv3/R$styleable;->CircularProgressBar:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const-string p2, "obtainStyledAttributes(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x1

    const/high16 v0, -0x10000

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/CircularProgressBar;->iXiiiO:I

    const/4 p2, 0x0

    const v0, -0xffff01

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/CircularProgressBar;->Ii1iii0:I

    const/4 p2, 0x0

    const/4 v0, 0x2

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/CircularProgressBar;->X0i1O:F

    const/4 p2, 0x3

    const/high16 v1, 0x43870000    # 270.0f

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/CircularProgressBar;->X11iII1O1:F

    const/4 p2, 0x4

    const/high16 v2, 0x43b40000    # 360.0f

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/CircularProgressBar;->iX1O1:F

    cmpg-float v2, p2, v2

    if-gez v2, :cond_0

    iget v2, p0, Lcom/sma/smartv3/view/CircularProgressBar;->X11iII1O1:F

    cmpg-float v1, v2, v1

    if-nez v1, :cond_0

    const/16 v1, 0x168

    int-to-float v1, v1

    sub-float/2addr v1, p2

    int-to-float p2, v0

    div-float/2addr v1, p2

    const/high16 p2, 0x42b40000    # 90.0f

    add-float/2addr v1, p2

    iput v1, p0, Lcom/sma/smartv3/view/CircularProgressBar;->X11iII1O1:F

    :cond_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/view/CircularProgressBar;FLandroid/animation/ValueAnimator;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/view/CircularProgressBar;->XOO0ii0(Lcom/sma/smartv3/view/CircularProgressBar;FLandroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static final XOO0ii0(Lcom/sma/smartv3/view/CircularProgressBar;FLandroid/animation/ValueAnimator;)V
    .locals 1

    const-string v0, "animation"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p2

    const-string v0, "null cannot be cast to non-null type kotlin.Float"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    mul-float/2addr p2, p1

    iput p2, p0, Lcom/sma/smartv3/view/CircularProgressBar;->X11I:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method


# virtual methods
.method public final I0IIOi(II)V
    .locals 1

    if-nez p2, :cond_0

    const/16 p2, 0x2710

    :cond_0
    int-to-float p1, p1

    int-to-float p2, p2

    div-float/2addr p1, p2

    const/16 p2, 0x64

    int-to-float p2, p2

    mul-float/2addr p1, p2

    iget p2, p0, Lcom/sma/smartv3/view/CircularProgressBar;->iiiO:F

    cmpl-float v0, p1, p2

    if-lez v0, :cond_1

    move p1, p2

    :cond_1
    iput p1, p0, Lcom/sma/smartv3/view/CircularProgressBar;->X11I:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final IiI10X()V
    .locals 4

    iget v0, p0, Lcom/sma/smartv3/view/CircularProgressBar;->X11I:F

    const/4 v1, 0x2

    new-array v1, v1, [F

    fill-array-data v1, :array_0

    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v1

    const-wide/16 v2, 0x3e8

    invoke-virtual {v1, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    new-instance v2, Lcom/android/mltcode/paycertificationapi/I0111i;

    invoke-direct {v2, p0, v0}, Lcom/android/mltcode/paycertificationapi/I0111i;-><init>(Lcom/sma/smartv3/view/CircularProgressBar;F)V

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->start()V

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public final XIi00iiXO(F)F
    .locals 0

    invoke-static {p1}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result p1

    int-to-float p1, p1

    return p1
.end method

.method public final XO0O10(FFFF)Lkotlin/Pair;
    .locals 4
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FFFF)",
            "Lkotlin/Pair<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    float-to-double v0, p4

    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    double-to-float p4, v2

    mul-float/2addr p4, p3

    add-float/2addr p1, p4

    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    move-result-wide v0

    double-to-float p4, v0

    mul-float/2addr p3, p4

    add-float/2addr p2, p3

    new-instance p3, Lkotlin/Pair;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-direct {p3, p1, p2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p3
.end method

.method public applySkin()V
    .locals 0

    invoke-super {p0}, Lskin/support/widget/SkinCompatView;->applySkin()V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final getEnableDot()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/view/CircularProgressBar;->X100O:Z

    return v0
.end method

.method public final iO(Landroid/graphics/Canvas;)V
    .locals 7

    iget-object v0, p0, Lcom/sma/smartv3/view/CircularProgressBar;->XXO:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v0

    const/4 v1, 0x2

    int-to-float v1, v1

    div-float/2addr v0, v1

    iget-object v2, p0, Lcom/sma/smartv3/view/CircularProgressBar;->XXO:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    move-result v2

    div-float/2addr v2, v1

    iget-object v3, p0, Lcom/sma/smartv3/view/CircularProgressBar;->XXO:Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    move-result v3

    div-float/2addr v3, v1

    iget v4, p0, Lcom/sma/smartv3/view/CircularProgressBar;->X11iII1O1:F

    invoke-virtual {p0, v0, v2, v3, v4}, Lcom/sma/smartv3/view/CircularProgressBar;->XO0O10(FFFF)Lkotlin/Pair;

    move-result-object v0

    iget-object v2, p0, Lcom/sma/smartv3/view/CircularProgressBar;->XXO:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    move-result v2

    div-float/2addr v2, v1

    iget-object v3, p0, Lcom/sma/smartv3/view/CircularProgressBar;->XXO:Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    move-result v3

    div-float/2addr v3, v1

    iget-object v4, p0, Lcom/sma/smartv3/view/CircularProgressBar;->XXO:Landroid/graphics/RectF;

    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    move-result v4

    div-float/2addr v4, v1

    iget v5, p0, Lcom/sma/smartv3/view/CircularProgressBar;->X11iII1O1:F

    iget v6, p0, Lcom/sma/smartv3/view/CircularProgressBar;->XXX11i:F

    add-float/2addr v5, v6

    invoke-virtual {p0, v2, v3, v4, v5}, Lcom/sma/smartv3/view/CircularProgressBar;->XO0O10(FFFF)Lkotlin/Pair;

    move-result-object v2

    iget v3, p0, Lcom/sma/smartv3/view/CircularProgressBar;->X0i1O:F

    const/4 v4, 0x4

    int-to-float v4, v4

    div-float/2addr v3, v4

    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    iget v5, p0, Lcom/sma/smartv3/view/CircularProgressBar;->X0i1O:F

    div-float/2addr v5, v1

    add-float/2addr v4, v5

    invoke-virtual {v0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iget v5, p0, Lcom/sma/smartv3/view/CircularProgressBar;->X0i1O:F

    div-float/2addr v5, v1

    add-float/2addr v0, v5

    iget-object v5, p0, Lcom/sma/smartv3/view/CircularProgressBar;->O001I:Landroid/graphics/Paint;

    invoke-virtual {p1, v4, v0, v3, v5}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    invoke-virtual {v2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iget v4, p0, Lcom/sma/smartv3/view/CircularProgressBar;->X0i1O:F

    div-float/2addr v4, v1

    add-float/2addr v0, v4

    invoke-virtual {v2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    iget v4, p0, Lcom/sma/smartv3/view/CircularProgressBar;->X0i1O:F

    div-float/2addr v4, v1

    add-float/2addr v2, v4

    iget-object v1, p0, Lcom/sma/smartv3/view/CircularProgressBar;->O001I:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v2, v3, v1}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 13
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    iget-object v2, p0, Lcom/sma/smartv3/view/CircularProgressBar;->XXO:Landroid/graphics/RectF;

    iget v3, p0, Lcom/sma/smartv3/view/CircularProgressBar;->X11iII1O1:F

    iget v4, p0, Lcom/sma/smartv3/view/CircularProgressBar;->iX1O1:F

    const/4 v5, 0x0

    iget-object v6, p0, Lcom/sma/smartv3/view/CircularProgressBar;->iXiX011:Landroid/graphics/Paint;

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    iget p1, p0, Lcom/sma/smartv3/view/CircularProgressBar;->X11I:F

    iget v0, p0, Lcom/sma/smartv3/view/CircularProgressBar;->iiiO:F

    div-float/2addr p1, v0

    iget v0, p0, Lcom/sma/smartv3/view/CircularProgressBar;->iX1O1:F

    mul-float v10, p1, v0

    iput v10, p0, Lcom/sma/smartv3/view/CircularProgressBar;->XXX11i:F

    iget-object v8, p0, Lcom/sma/smartv3/view/CircularProgressBar;->XXO:Landroid/graphics/RectF;

    iget v9, p0, Lcom/sma/smartv3/view/CircularProgressBar;->X11iII1O1:F

    const/4 v11, 0x0

    iget-object v12, p0, Lcom/sma/smartv3/view/CircularProgressBar;->iIXi1iiXI:Landroid/graphics/Paint;

    move-object v7, v1

    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    iget-boolean p1, p0, Lcom/sma/smartv3/view/CircularProgressBar;->X100O:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0, v1}, Lcom/sma/smartv3/view/CircularProgressBar;->iO(Landroid/graphics/Canvas;)V

    :cond_0
    return-void
.end method

.method public onMeasure(II)V
    .locals 1

    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    invoke-virtual {p0, p1, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    iget p2, p0, Lcom/sma/smartv3/view/CircularProgressBar;->X0i1O:F

    const/4 v0, 0x0

    cmpg-float p2, p2, v0

    if-nez p2, :cond_0

    int-to-float p1, p1

    const/high16 p2, 0x41200000    # 10.0f

    div-float/2addr p1, p2

    iput p1, p0, Lcom/sma/smartv3/view/CircularProgressBar;->X0i1O:F

    :cond_0
    return-void
.end method

.method public onSizeChanged(IIII)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    iget p2, p0, Lcom/sma/smartv3/view/CircularProgressBar;->X0i1O:F

    const/4 p3, 0x2

    int-to-float p3, p3

    div-float p3, p2, p3

    iget-object p4, p0, Lcom/sma/smartv3/view/CircularProgressBar;->iIXi1iiXI:Landroid/graphics/Paint;

    invoke-virtual {p4, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object p2, p0, Lcom/sma/smartv3/view/CircularProgressBar;->iXiX011:Landroid/graphics/Paint;

    iget p4, p0, Lcom/sma/smartv3/view/CircularProgressBar;->X0i1O:F

    invoke-virtual {p2, p4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object p2, p0, Lcom/sma/smartv3/view/CircularProgressBar;->XXO:Landroid/graphics/RectF;

    int-to-float p1, p1

    sub-float/2addr p1, p3

    invoke-virtual {p2, p3, p3, p1, p1}, Landroid/graphics/RectF;->set(FFFF)V

    invoke-virtual {p0}, Lcom/sma/smartv3/view/CircularProgressBar;->applySkin()V

    return-void
.end method

.method public final setEnableDot(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/view/CircularProgressBar;->X100O:Z

    return-void
.end method
