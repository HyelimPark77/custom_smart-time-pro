.class public final Lcom/sma/smartv3/view/Goal3ProgressBar;
.super Lskin/support/widget/SkinCompatView;
.source "SourceFile"


# instance fields
.field public I1:F

.field public Ii0X0X:F

.field public final Ii1iii0:Landroid/graphics/RectF;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final O001I:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public OO:I

.field public OX110i:I

.field public X00XIX1:F

.field public X00Xi1X:F

.field public final X0i1O:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public X100O:I

.field public X11I:I

.field public X11iII1O1:F

.field public final X1IX:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final XO0X10iO:F

.field public XOX0O0:I

.field public XX1Oi:I

.field public final XXO:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public XXX11i:F

.field public XXiIiX10:F

.field public final i0X000X0O:F

.field public i11I:F

.field public final iIXi1iiXI:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final iOiXi11II:F

.field public iX1O1:Z

.field public final iXiX011:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final iXiiiO:Landroid/graphics/RectF;
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

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/view/Goal3ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/view/Goal3ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    const/high16 p3, 0x42480000    # 50.0f

    .line 4
    iput p3, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->I1:F

    const/4 p3, 0x1

    .line 5
    iput-boolean p3, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->iX1O1:Z

    const/16 p3, 0xa

    .line 6
    invoke-direct {p0, p3}, Lcom/sma/smartv3/view/Goal3ProgressBar;->OXO1(I)F

    move-result p3

    iput p3, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->X11iII1O1:F

    const/4 p3, 0x4

    .line 7
    invoke-direct {p0, p3}, Lcom/sma/smartv3/view/Goal3ProgressBar;->OXO1(I)F

    move-result p3

    iput p3, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->XXX11i:F

    .line 8
    new-instance p3, Landroid/graphics/Paint;

    invoke-direct {p3}, Landroid/graphics/Paint;-><init>()V

    iput-object p3, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->X1IX:Landroid/graphics/Paint;

    .line 9
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->X0i1O:Landroid/graphics/Paint;

    .line 10
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    iput-object v1, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->iIXi1iiXI:Landroid/graphics/Paint;

    .line 11
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    iput-object v2, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->iXiX011:Landroid/graphics/Paint;

    .line 12
    new-instance v3, Landroid/graphics/Paint;

    invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V

    iput-object v3, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->O001I:Landroid/graphics/Paint;

    .line 13
    new-instance v4, Landroid/graphics/Paint;

    invoke-direct {v4}, Landroid/graphics/Paint;-><init>()V

    iput-object v4, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->XXO:Landroid/graphics/Paint;

    .line 14
    new-instance v5, Landroid/graphics/RectF;

    invoke-direct {v5}, Landroid/graphics/RectF;-><init>()V

    iput-object v5, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->iXiiiO:Landroid/graphics/RectF;

    .line 15
    new-instance v5, Landroid/graphics/RectF;

    invoke-direct {v5}, Landroid/graphics/RectF;-><init>()V

    iput-object v5, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->Ii1iii0:Landroid/graphics/RectF;

    .line 16
    new-instance v5, Landroid/graphics/RectF;

    invoke-direct {v5}, Landroid/graphics/RectF;-><init>()V

    iput-object v5, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->iiiO:Landroid/graphics/RectF;

    const/high16 v5, 0x42c80000    # 100.0f

    .line 17
    iput v5, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->iOiXi11II:F

    const/high16 v6, 0x42080000    # 34.0f

    .line 18
    iput v6, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->X00XIX1:F

    .line 19
    iput v5, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->i0X000X0O:F

    .line 20
    iput v6, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->i11I:F

    .line 21
    iput v5, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->XO0X10iO:F

    .line 22
    iput v6, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->Ii0X0X:F

    const/high16 v5, 0x43b40000    # 360.0f

    .line 23
    iput v5, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->X00Xi1X:F

    .line 24
    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/view/Goal3ProgressBar;->XIi00iiXO(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 25
    iget-boolean p1, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->iX1O1:Z

    invoke-virtual {p3, p1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 26
    sget-object p1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p3, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 27
    sget-object p2, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {p3, p2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 28
    iget v5, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->X11iII1O1:F

    invoke-virtual {p3, v5}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 29
    iget v5, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->X11I:I

    invoke-virtual {p3, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 30
    iget-boolean p3, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->iX1O1:Z

    invoke-virtual {v0, p3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 31
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 32
    invoke-virtual {v0, p2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 33
    iget p3, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->X11iII1O1:F

    invoke-virtual {v0, p3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 34
    iget p3, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->X100O:I

    invoke-virtual {v0, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 35
    iget-boolean p3, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->iX1O1:Z

    invoke-virtual {v1, p3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 36
    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 37
    invoke-virtual {v1, p2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 38
    iget p3, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->X11iII1O1:F

    invoke-virtual {v1, p3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 39
    iget p3, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->XX1Oi:I

    invoke-virtual {v1, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 40
    iget-boolean p3, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->iX1O1:Z

    invoke-virtual {v2, p3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 41
    invoke-virtual {v2, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 42
    invoke-virtual {v2, p2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 43
    iget p3, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->X11iII1O1:F

    invoke-virtual {v2, p3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 44
    iget p3, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->OX110i:I

    invoke-virtual {v2, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 45
    iget-boolean p3, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->iX1O1:Z

    invoke-virtual {v3, p3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 46
    invoke-virtual {v3, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 47
    invoke-virtual {v3, p2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 48
    iget p3, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->X11iII1O1:F

    invoke-virtual {v3, p3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 49
    iget p3, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->OO:I

    invoke-virtual {v3, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 50
    iget-boolean p3, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->iX1O1:Z

    invoke-virtual {v4, p3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 51
    invoke-virtual {v4, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 52
    invoke-virtual {v4, p2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 53
    iget p1, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->X11iII1O1:F

    invoke-virtual {v4, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 54
    iget p1, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->XOX0O0:I

    invoke-virtual {v4, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 55
    invoke-virtual {p0}, Lcom/sma/smartv3/view/Goal3ProgressBar;->applySkin()V

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

    .line 56
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/view/Goal3ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private final OXO1(I)F
    .locals 0

    int-to-float p1, p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result p1

    int-to-float p1, p1

    return p1
.end method

.method private final XIi00iiXO(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    sget-object v0, Lcom/sma/smartv3/R$styleable;->GoalProgressBar:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const-string p2, "obtainStyledAttributes(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x0

    const/4 v0, 0x1

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->iX1O1:Z

    const/16 v1, 0xa

    invoke-virtual {p1, v1, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->X11I:I

    const/16 v1, 0x9

    invoke-virtual {p1, v1, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->X100O:I

    const/4 v1, 0x2

    invoke-virtual {p1, v1, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->XX1Oi:I

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->OX110i:I

    const/4 v0, 0x5

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->OO:I

    const/4 v0, 0x4

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->XOX0O0:I

    const/16 p2, 0x8

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->XXiIiX10:F

    const/16 p2, 0xc

    const/high16 v0, 0x43b40000    # 360.0f

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->X00Xi1X:F

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method


# virtual methods
.method public final O00(II)V
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

    iget p2, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->iOiXi11II:F

    cmpl-float v0, p1, p2

    if-lez v0, :cond_1

    move p1, p2

    :cond_1
    iput p1, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->X00XIX1:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final XO0O10(II)V
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

    iget p2, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->XO0X10iO:F

    cmpl-float v0, p1, p2

    if-lez v0, :cond_1

    move p1, p2

    :cond_1
    iput p1, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->Ii0X0X:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public applySkin()V
    .locals 0

    invoke-super {p0}, Lskin/support/widget/SkinCompatView;->applySkin()V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final iO(II)V
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

    iget p2, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->i0X000X0O:F

    cmpl-float v0, p1, p2

    if-lez v0, :cond_1

    move p1, p2

    :cond_1
    iput p1, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->i11I:F

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

    iget-object v2, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->iXiiiO:Landroid/graphics/RectF;

    iget v3, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->XXiIiX10:F

    iget v4, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->X00Xi1X:F

    const/4 v5, 0x0

    iget-object v6, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->X0i1O:Landroid/graphics/Paint;

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    move-object v7, v1

    iget p1, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->X00XIX1:F

    iget v0, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->iOiXi11II:F

    div-float/2addr p1, v0

    iget v0, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->X00Xi1X:F

    mul-float v10, p1, v0

    iput v10, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->I1:F

    iget-object v8, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->iXiiiO:Landroid/graphics/RectF;

    iget v9, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->XXiIiX10:F

    const/4 v11, 0x0

    iget-object v12, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->X1IX:Landroid/graphics/Paint;

    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    iget-object v8, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->Ii1iii0:Landroid/graphics/RectF;

    iget v9, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->XXiIiX10:F

    iget v10, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->X00Xi1X:F

    iget-object v12, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->iXiX011:Landroid/graphics/Paint;

    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    iget p1, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->i11I:F

    iget v0, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->i0X000X0O:F

    div-float/2addr p1, v0

    iget v0, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->X00Xi1X:F

    mul-float v10, p1, v0

    iput v10, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->I1:F

    iget-object v8, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->Ii1iii0:Landroid/graphics/RectF;

    iget v9, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->XXiIiX10:F

    iget-object v12, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->iIXi1iiXI:Landroid/graphics/Paint;

    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    iget-object v8, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->iiiO:Landroid/graphics/RectF;

    iget v9, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->XXiIiX10:F

    iget v10, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->X00Xi1X:F

    iget-object v12, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->XXO:Landroid/graphics/Paint;

    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    iget p1, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->Ii0X0X:F

    iget v0, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->XO0X10iO:F

    div-float/2addr p1, v0

    iget v0, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->X00Xi1X:F

    mul-float v10, p1, v0

    iput v10, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->I1:F

    iget-object v8, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->iiiO:Landroid/graphics/RectF;

    iget v9, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->XXiIiX10:F

    iget-object v12, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->O001I:Landroid/graphics/Paint;

    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    return-void
.end method

.method public onSizeChanged(IIII)V
    .locals 3

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    int-to-float p1, p2

    iget p2, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->XXX11i:F

    const/4 p3, 0x4

    int-to-float p3, p3

    mul-float/2addr p2, p3

    sub-float p2, p1, p2

    const/4 p3, 0x7

    int-to-float p3, p3

    div-float/2addr p2, p3

    iput p2, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->X11iII1O1:F

    const/4 p3, 0x2

    int-to-float p3, p3

    div-float p3, p2, p3

    iget-object p4, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->X1IX:Landroid/graphics/Paint;

    invoke-virtual {p4, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object p2, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->X0i1O:Landroid/graphics/Paint;

    iget p4, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->X11iII1O1:F

    invoke-virtual {p2, p4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object p2, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->iIXi1iiXI:Landroid/graphics/Paint;

    iget p4, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->X11iII1O1:F

    invoke-virtual {p2, p4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object p2, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->iXiX011:Landroid/graphics/Paint;

    iget p4, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->X11iII1O1:F

    invoke-virtual {p2, p4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object p2, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->O001I:Landroid/graphics/Paint;

    iget p4, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->X11iII1O1:F

    invoke-virtual {p2, p4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object p2, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->XXO:Landroid/graphics/Paint;

    iget p4, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->X11iII1O1:F

    invoke-virtual {p2, p4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object p2, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->iXiiiO:Landroid/graphics/RectF;

    sub-float/2addr p1, p3

    invoke-virtual {p2, p3, p3, p1, p1}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object p1, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->Ii1iii0:Landroid/graphics/RectF;

    iget-object p2, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->iXiiiO:Landroid/graphics/RectF;

    iget p3, p2, Landroid/graphics/RectF;->left:F

    iget p4, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->X11iII1O1:F

    add-float/2addr p3, p4

    iget v0, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->XXX11i:F

    add-float/2addr p3, v0

    iget v1, p2, Landroid/graphics/RectF;->top:F

    add-float/2addr v1, p4

    add-float/2addr v1, v0

    iget v2, p2, Landroid/graphics/RectF;->right:F

    sub-float/2addr v2, p4

    sub-float/2addr v2, v0

    iget p2, p2, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr p2, p4

    sub-float/2addr p2, v0

    invoke-virtual {p1, p3, v1, v2, p2}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object p1, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->iiiO:Landroid/graphics/RectF;

    iget-object p2, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->Ii1iii0:Landroid/graphics/RectF;

    iget p3, p2, Landroid/graphics/RectF;->left:F

    iget p4, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->X11iII1O1:F

    add-float/2addr p3, p4

    iget v0, p0, Lcom/sma/smartv3/view/Goal3ProgressBar;->XXX11i:F

    add-float/2addr p3, v0

    iget v1, p2, Landroid/graphics/RectF;->top:F

    add-float/2addr v1, p4

    add-float/2addr v1, v0

    iget v2, p2, Landroid/graphics/RectF;->right:F

    sub-float/2addr v2, p4

    sub-float/2addr v2, v0

    iget p2, p2, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr p2, p4

    sub-float/2addr p2, v0

    invoke-virtual {p1, p3, v1, v2, p2}, Landroid/graphics/RectF;->set(FFFF)V

    invoke-virtual {p0}, Lcom/sma/smartv3/view/Goal3ProgressBar;->applySkin()V

    return-void
.end method
