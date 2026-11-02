.class public final Lcom/sma/smartv3/view/Goal5ProgressBar;
.super Lskin/support/widget/SkinCompatView;
.source "SourceFile"


# instance fields
.field public final I1:F

.field public Ii0X0X:F

.field public final Ii1iii0:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final O001I:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public OO:I

.field public OX110i:I

.field public X00XIX1:I

.field public X00Xi1X:F

.field public X0i1O:F

.field public final X100O:Landroid/graphics/RectF;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final X11I:Landroid/graphics/RectF;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public X11iII1O1:F

.field public X1IX:F

.field public final XO0X10iO:F

.field public XOX0O0:I

.field public XX1Oi:I

.field public final XXO:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public XXX11i:Z

.field public final XXiIiX10:F

.field public final i0X000X0O:F

.field public i11I:F

.field public final iIXi1iiXI:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public iOiXi11II:I

.field public final iX1O1:F

.field public final iXiX011:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final iXiiiO:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final iiiO:Landroid/graphics/RectF;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


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

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/view/Goal5ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/view/Goal5ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
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

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2, p3}, Lskin/support/widget/SkinCompatView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/high16 p3, 0x43700000    # 240.0f

    .line 4
    iput p3, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->I1:F

    const/16 v0, 0x168

    int-to-float v0, v0

    sub-float/2addr v0, p3

    const/4 p3, 0x2

    int-to-float p3, p3

    div-float/2addr v0, p3

    const/high16 p3, 0x42b40000    # 90.0f

    add-float/2addr v0, p3

    .line 5
    iput v0, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->iX1O1:F

    const/high16 p3, 0x42480000    # 50.0f

    .line 6
    iput p3, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->X11iII1O1:F

    const/4 p3, 0x1

    .line 7
    iput-boolean p3, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->XXX11i:Z

    const/16 p3, 0xa

    .line 8
    invoke-direct {p0, p3}, Lcom/sma/smartv3/view/Goal5ProgressBar;->XO0O10(I)F

    move-result p3

    iput p3, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->X1IX:F

    const/4 p3, 0x4

    .line 9
    invoke-direct {p0, p3}, Lcom/sma/smartv3/view/Goal5ProgressBar;->XO0O10(I)F

    move-result p3

    iput p3, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->X0i1O:F

    .line 10
    new-instance p3, Landroid/graphics/Paint;

    invoke-direct {p3}, Landroid/graphics/Paint;-><init>()V

    iput-object p3, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->iIXi1iiXI:Landroid/graphics/Paint;

    .line 11
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->iXiX011:Landroid/graphics/Paint;

    .line 12
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    iput-object v1, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->O001I:Landroid/graphics/Paint;

    .line 13
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    iput-object v2, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->XXO:Landroid/graphics/Paint;

    .line 14
    new-instance v3, Landroid/graphics/Paint;

    invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V

    iput-object v3, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->iXiiiO:Landroid/graphics/Paint;

    .line 15
    new-instance v4, Landroid/graphics/Paint;

    invoke-direct {v4}, Landroid/graphics/Paint;-><init>()V

    iput-object v4, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->Ii1iii0:Landroid/graphics/Paint;

    .line 16
    new-instance v5, Landroid/graphics/RectF;

    invoke-direct {v5}, Landroid/graphics/RectF;-><init>()V

    iput-object v5, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->iiiO:Landroid/graphics/RectF;

    .line 17
    new-instance v5, Landroid/graphics/RectF;

    invoke-direct {v5}, Landroid/graphics/RectF;-><init>()V

    iput-object v5, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->X11I:Landroid/graphics/RectF;

    .line 18
    new-instance v5, Landroid/graphics/RectF;

    invoke-direct {v5}, Landroid/graphics/RectF;-><init>()V

    iput-object v5, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->X100O:Landroid/graphics/RectF;

    const/high16 v5, 0x42c80000    # 100.0f

    .line 19
    iput v5, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->i0X000X0O:F

    const/high16 v6, 0x42080000    # 34.0f

    .line 20
    iput v6, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->i11I:F

    .line 21
    iput v5, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->XO0X10iO:F

    .line 22
    iput v6, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->Ii0X0X:F

    .line 23
    iput v5, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->XXiIiX10:F

    .line 24
    iput v6, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->X00Xi1X:F

    .line 25
    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/view/Goal5ProgressBar;->O00(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 26
    iget-boolean p1, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->XXX11i:Z

    invoke-virtual {p3, p1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 27
    sget-object p1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p3, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 28
    sget-object p2, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {p3, p2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 29
    iget v5, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->X1IX:F

    invoke-virtual {p3, v5}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 30
    iget-boolean p3, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->XXX11i:Z

    invoke-virtual {v0, p3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 31
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 32
    invoke-virtual {v0, p2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 33
    iget p3, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->X1IX:F

    invoke-virtual {v0, p3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 34
    iget-boolean p3, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->XXX11i:Z

    invoke-virtual {v1, p3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 35
    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 36
    invoke-virtual {v1, p2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 37
    iget p3, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->X1IX:F

    invoke-virtual {v1, p3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 38
    iget-boolean p3, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->XXX11i:Z

    invoke-virtual {v2, p3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 39
    invoke-virtual {v2, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 40
    invoke-virtual {v2, p2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 41
    iget p3, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->X1IX:F

    invoke-virtual {v2, p3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 42
    iget-boolean p3, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->XXX11i:Z

    invoke-virtual {v3, p3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 43
    invoke-virtual {v3, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 44
    invoke-virtual {v3, p2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 45
    iget p3, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->X1IX:F

    invoke-virtual {v3, p3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 46
    iget-boolean p3, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->XXX11i:Z

    invoke-virtual {v4, p3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 47
    invoke-virtual {v4, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 48
    invoke-virtual {v4, p2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 49
    iget p1, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->X1IX:F

    invoke-virtual {v4, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 50
    invoke-virtual {p0}, Lcom/sma/smartv3/view/Goal5ProgressBar;->applySkin()V

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

    .line 51
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/view/Goal5ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private final O00(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    sget-object v0, Lcom/sma/smartv3/R$styleable;->GoalProgressBar:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const-string p2, "obtainStyledAttributes(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x1

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->XXX11i:Z

    const/16 p2, 0xa

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->XX1Oi:I

    const/16 p2, 0xb

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->OX110i:I

    const/4 p2, 0x2

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->OO:I

    const/4 p2, 0x3

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->XOX0O0:I

    const/4 p2, 0x5

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->iOiXi11II:I

    const/4 p2, 0x6

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->X00XIX1:I

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/view/Goal5ProgressBar;FFFLandroid/animation/ValueAnimator;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/view/Goal5ProgressBar;->XOO0ii0(Lcom/sma/smartv3/view/Goal5ProgressBar;FFFLandroid/animation/ValueAnimator;)V

    return-void
.end method

.method private final XO0O10(I)F
    .locals 0

    int-to-float p1, p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result p1

    int-to-float p1, p1

    return p1
.end method

.method public static final XOO0ii0(Lcom/sma/smartv3/view/Goal5ProgressBar;FFFLandroid/animation/ValueAnimator;)V
    .locals 1

    const-string v0, "animation"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p4}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p4

    const-string v0, "null cannot be cast to non-null type kotlin.Float"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p4, Ljava/lang/Float;

    invoke-virtual {p4}, Ljava/lang/Float;->floatValue()F

    move-result p4

    mul-float/2addr p1, p4

    iput p1, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->i11I:F

    mul-float/2addr p2, p4

    iput p2, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->Ii0X0X:F

    mul-float/2addr p4, p3

    iput p4, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->X00Xi1X:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public static synthetic iO(Lcom/sma/smartv3/view/Goal5ProgressBar;IFILjava/lang/Object;)I
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const p2, 0x3e99999a    # 0.3f

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/view/Goal5ProgressBar;->XIi00iiXO(IF)I

    move-result p0

    return p0
.end method

.method private final setProgressColor(F)V
    .locals 8

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    const/high16 v1, 0x42b40000    # 90.0f

    invoke-virtual {v0, v1, p1, p1}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    iget-object v1, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->iIXi1iiXI:Landroid/graphics/Paint;

    new-instance v2, Landroid/graphics/SweepGradient;

    iget v3, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->XX1Oi:I

    iget v4, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->OX110i:I

    filled-new-array {v3, v4}, [I

    move-result-object v3

    const/4 v4, 0x2

    new-array v5, v4, [F

    fill-array-data v5, :array_0

    invoke-direct {v2, p1, p1, v3, v5}, Landroid/graphics/SweepGradient;-><init>(FF[I[F)V

    invoke-virtual {v2, v0}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    iget-object v1, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->iXiX011:Landroid/graphics/Paint;

    new-instance v2, Landroid/graphics/SweepGradient;

    iget v3, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->XX1Oi:I

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static {p0, v3, v5, v4, v6}, Lcom/sma/smartv3/view/Goal5ProgressBar;->iO(Lcom/sma/smartv3/view/Goal5ProgressBar;IFILjava/lang/Object;)I

    move-result v3

    iget v7, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->OX110i:I

    invoke-static {p0, v7, v5, v4, v6}, Lcom/sma/smartv3/view/Goal5ProgressBar;->iO(Lcom/sma/smartv3/view/Goal5ProgressBar;IFILjava/lang/Object;)I

    move-result v7

    filled-new-array {v3, v7}, [I

    move-result-object v3

    new-array v7, v4, [F

    fill-array-data v7, :array_1

    invoke-direct {v2, p1, p1, v3, v7}, Landroid/graphics/SweepGradient;-><init>(FF[I[F)V

    invoke-virtual {v2, v0}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    iget-object v1, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->O001I:Landroid/graphics/Paint;

    new-instance v2, Landroid/graphics/SweepGradient;

    iget v3, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->OO:I

    iget v7, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->XOX0O0:I

    filled-new-array {v3, v7}, [I

    move-result-object v3

    new-array v7, v4, [F

    fill-array-data v7, :array_2

    invoke-direct {v2, p1, p1, v3, v7}, Landroid/graphics/SweepGradient;-><init>(FF[I[F)V

    invoke-virtual {v2, v0}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    iget-object v1, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->XXO:Landroid/graphics/Paint;

    new-instance v2, Landroid/graphics/SweepGradient;

    iget v3, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->OO:I

    invoke-static {p0, v3, v5, v4, v6}, Lcom/sma/smartv3/view/Goal5ProgressBar;->iO(Lcom/sma/smartv3/view/Goal5ProgressBar;IFILjava/lang/Object;)I

    move-result v3

    iget v7, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->XOX0O0:I

    invoke-static {p0, v7, v5, v4, v6}, Lcom/sma/smartv3/view/Goal5ProgressBar;->iO(Lcom/sma/smartv3/view/Goal5ProgressBar;IFILjava/lang/Object;)I

    move-result v7

    filled-new-array {v3, v7}, [I

    move-result-object v3

    new-array v7, v4, [F

    fill-array-data v7, :array_3

    invoke-direct {v2, p1, p1, v3, v7}, Landroid/graphics/SweepGradient;-><init>(FF[I[F)V

    invoke-virtual {v2, v0}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    iget-object v1, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->iXiiiO:Landroid/graphics/Paint;

    new-instance v2, Landroid/graphics/SweepGradient;

    iget v3, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->iOiXi11II:I

    iget v7, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->X00XIX1:I

    filled-new-array {v3, v7}, [I

    move-result-object v3

    new-array v7, v4, [F

    fill-array-data v7, :array_4

    invoke-direct {v2, p1, p1, v3, v7}, Landroid/graphics/SweepGradient;-><init>(FF[I[F)V

    invoke-virtual {v2, v0}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    iget-object v1, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->Ii1iii0:Landroid/graphics/Paint;

    new-instance v2, Landroid/graphics/SweepGradient;

    iget v3, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->iOiXi11II:I

    invoke-static {p0, v3, v5, v4, v6}, Lcom/sma/smartv3/view/Goal5ProgressBar;->iO(Lcom/sma/smartv3/view/Goal5ProgressBar;IFILjava/lang/Object;)I

    move-result v3

    iget v7, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->X00XIX1:I

    invoke-static {p0, v7, v5, v4, v6}, Lcom/sma/smartv3/view/Goal5ProgressBar;->iO(Lcom/sma/smartv3/view/Goal5ProgressBar;IFILjava/lang/Object;)I

    move-result v5

    filled-new-array {v3, v5}, [I

    move-result-object v3

    new-array v4, v4, [F

    fill-array-data v4, :array_5

    invoke-direct {v2, p1, p1, v3, v4}, Landroid/graphics/SweepGradient;-><init>(FF[I[F)V

    invoke-virtual {v2, v0}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    return-void

    :array_0
    .array-data 4
        0x3e29fbe7    # 0.166f
        0x3f553f7d    # 0.833f
    .end array-data

    :array_1
    .array-data 4
        0x3e29fbe7    # 0.166f
        0x3f553f7d    # 0.833f
    .end array-data

    :array_2
    .array-data 4
        0x3e29fbe7    # 0.166f
        0x3f553f7d    # 0.833f
    .end array-data

    :array_3
    .array-data 4
        0x3e29fbe7    # 0.166f
        0x3f553f7d    # 0.833f
    .end array-data

    :array_4
    .array-data 4
        0x3e29fbe7    # 0.166f
        0x3f553f7d    # 0.833f
    .end array-data

    :array_5
    .array-data 4
        0x3e29fbe7    # 0.166f
        0x3f553f7d    # 0.833f
    .end array-data
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

    iget p2, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->i0X000X0O:F

    cmpl-float v0, p1, p2

    if-lez v0, :cond_1

    move p1, p2

    :cond_1
    iput p1, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->i11I:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final IO(II)V
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

    iget p2, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->XXiIiX10:F

    cmpl-float v0, p1, p2

    if-lez v0, :cond_1

    move p1, p2

    :cond_1
    iput p1, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->X00Xi1X:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final IiI10X()V
    .locals 6

    iget v0, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->i11I:F

    iget v1, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->Ii0X0X:F

    iget v2, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->X00Xi1X:F

    const/4 v3, 0x2

    new-array v3, v3, [F

    fill-array-data v3, :array_0

    invoke-static {v3}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v3

    const-wide/16 v4, 0x3e8

    invoke-virtual {v3, v4, v5}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    new-instance v4, Lcom/android/mltcode/paycertificationapi/Oi0111I;

    invoke-direct {v4, p0, v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/Oi0111I;-><init>(Lcom/sma/smartv3/view/Goal5ProgressBar;FFF)V

    invoke-virtual {v3, v4}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    invoke-virtual {v3}, Landroid/animation/ValueAnimator;->start()V

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public final OIi0(II)V
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

    iget p2, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->XO0X10iO:F

    cmpl-float v0, p1, p2

    if-lez v0, :cond_1

    move p1, p2

    :cond_1
    iput p1, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->Ii0X0X:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final XIi00iiXO(IF)I
    .locals 2

    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, p2

    float-to-int p2, v0

    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    move-result v0

    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    move-result v1

    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    move-result p1

    invoke-static {p2, v0, v1, p1}, Landroid/graphics/Color;->argb(IIII)I

    move-result p1

    return p1
.end method

.method public applySkin()V
    .locals 0

    invoke-super {p0}, Lskin/support/widget/SkinCompatView;->applySkin()V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

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

    iget-object v2, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->iiiO:Landroid/graphics/RectF;

    iget v3, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->iX1O1:F

    iget v4, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->I1:F

    const/4 v5, 0x0

    iget-object v6, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->iXiX011:Landroid/graphics/Paint;

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    move-object v7, v1

    iget p1, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->i11I:F

    iget v0, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->i0X000X0O:F

    div-float/2addr p1, v0

    iget v0, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->I1:F

    mul-float v10, p1, v0

    iput v10, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->X11iII1O1:F

    iget-object v8, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->iiiO:Landroid/graphics/RectF;

    iget v9, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->iX1O1:F

    const/4 v11, 0x0

    iget-object v12, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->iIXi1iiXI:Landroid/graphics/Paint;

    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    iget-object v8, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->X11I:Landroid/graphics/RectF;

    iget v9, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->iX1O1:F

    iget v10, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->I1:F

    iget-object v12, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->XXO:Landroid/graphics/Paint;

    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    iget p1, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->Ii0X0X:F

    iget v0, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->XO0X10iO:F

    div-float/2addr p1, v0

    iget v0, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->I1:F

    mul-float v10, p1, v0

    iput v10, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->X11iII1O1:F

    iget-object v8, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->X11I:Landroid/graphics/RectF;

    iget v9, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->iX1O1:F

    iget-object v12, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->O001I:Landroid/graphics/Paint;

    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    iget-object v8, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->X100O:Landroid/graphics/RectF;

    iget v9, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->iX1O1:F

    iget v10, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->I1:F

    iget-object v12, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->Ii1iii0:Landroid/graphics/Paint;

    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    iget p1, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->X00Xi1X:F

    iget v0, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->XXiIiX10:F

    div-float/2addr p1, v0

    iget v0, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->I1:F

    mul-float v10, p1, v0

    iput v10, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->X11iII1O1:F

    iget-object v8, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->X100O:Landroid/graphics/RectF;

    iget v9, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->iX1O1:F

    iget-object v12, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->iXiiiO:Landroid/graphics/Paint;

    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    return-void
.end method

.method public onMeasure(II)V
    .locals 2

    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    int-to-float p2, p1

    const v0, 0x4119999a    # 9.6f

    div-float v0, p2, v0

    iput v0, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->X1IX:F

    iget v1, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->I1:F

    mul-float/2addr p2, v1

    const/16 v1, 0x168

    int-to-float v1, v1

    div-float/2addr p2, v1

    add-float/2addr p2, v0

    const/16 v0, 0xf

    int-to-float v0, v0

    add-float/2addr p2, v0

    float-to-int p2, p2

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    iget p1, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->X1IX:F

    const p2, 0x3ecccccd    # 0.4f

    mul-float/2addr p1, p2

    iput p1, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->X0i1O:F

    return-void
.end method

.method public onSizeChanged(IIII)V
    .locals 4

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    iget p2, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->X1IX:F

    const/4 p3, 0x2

    int-to-float p3, p3

    div-float p3, p2, p3

    iget-object p4, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->iIXi1iiXI:Landroid/graphics/Paint;

    invoke-virtual {p4, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object p2, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->iXiX011:Landroid/graphics/Paint;

    iget p4, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->X1IX:F

    invoke-virtual {p2, p4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object p2, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->O001I:Landroid/graphics/Paint;

    iget p4, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->X1IX:F

    invoke-virtual {p2, p4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object p2, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->XXO:Landroid/graphics/Paint;

    iget p4, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->X1IX:F

    invoke-virtual {p2, p4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object p2, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->iXiiiO:Landroid/graphics/Paint;

    iget p4, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->X1IX:F

    invoke-virtual {p2, p4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object p2, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->Ii1iii0:Landroid/graphics/Paint;

    iget p4, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->X1IX:F

    invoke-virtual {p2, p4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object p2, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->iiiO:Landroid/graphics/RectF;

    int-to-float p1, p1

    sub-float p4, p1, p3

    invoke-virtual {p2, p3, p3, p4, p4}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object p2, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->X11I:Landroid/graphics/RectF;

    iget-object p3, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->iiiO:Landroid/graphics/RectF;

    iget p4, p3, Landroid/graphics/RectF;->left:F

    iget v0, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->X1IX:F

    add-float/2addr p4, v0

    iget v1, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->X0i1O:F

    add-float/2addr p4, v1

    iget v2, p3, Landroid/graphics/RectF;->top:F

    add-float/2addr v2, v0

    add-float/2addr v2, v1

    iget v3, p3, Landroid/graphics/RectF;->right:F

    sub-float/2addr v3, v0

    sub-float/2addr v3, v1

    iget p3, p3, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr p3, v0

    sub-float/2addr p3, v1

    invoke-virtual {p2, p4, v2, v3, p3}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object p2, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->X100O:Landroid/graphics/RectF;

    iget-object p3, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->X11I:Landroid/graphics/RectF;

    iget p4, p3, Landroid/graphics/RectF;->left:F

    iget v0, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->X1IX:F

    add-float/2addr p4, v0

    iget v1, p0, Lcom/sma/smartv3/view/Goal5ProgressBar;->X0i1O:F

    add-float/2addr p4, v1

    iget v2, p3, Landroid/graphics/RectF;->top:F

    add-float/2addr v2, v0

    add-float/2addr v2, v1

    iget v3, p3, Landroid/graphics/RectF;->right:F

    sub-float/2addr v3, v0

    sub-float/2addr v3, v1

    iget p3, p3, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr p3, v0

    sub-float/2addr p3, v1

    invoke-virtual {p2, p4, v2, v3, p3}, Landroid/graphics/RectF;->set(FFFF)V

    const/high16 p2, 0x40000000    # 2.0f

    div-float/2addr p1, p2

    invoke-direct {p0, p1}, Lcom/sma/smartv3/view/Goal5ProgressBar;->setProgressColor(F)V

    invoke-virtual {p0}, Lcom/sma/smartv3/view/Goal5ProgressBar;->applySkin()V

    return-void
.end method
