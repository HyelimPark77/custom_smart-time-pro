.class public final Lcom/sma/smartv3/view/AloneProgressBar;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field public I1:Z

.field public IO:F

.field public Ii1iii0:I

.field public final O001I:Landroid/graphics/RectF;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public OO:F

.field public OX110i:F

.field public X00XIX1:I

.field public final X0i1O:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public X100O:I

.field public X11I:I

.field public final X11iII1O1:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final X1IX:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public XOX0O0:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public XX1Oi:I

.field public XXO:I

.field public final XXX11i:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final iIXi1iiXI:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public iOiXi11II:I

.field public iX1O1:F

.field public final iXiX011:Landroid/graphics/RectF;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

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

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/view/AloneProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/view/AloneProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 6
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

    const/high16 p3, 0x42480000    # 50.0f

    .line 4
    iput p3, p0, Lcom/sma/smartv3/view/AloneProgressBar;->IO:F

    const/4 p3, 0x1

    .line 5
    iput-boolean p3, p0, Lcom/sma/smartv3/view/AloneProgressBar;->I1:Z

    const/4 p3, 0x4

    .line 6
    invoke-virtual {p0, p3}, Lcom/sma/smartv3/view/AloneProgressBar;->OXO1(I)F

    move-result p3

    iput p3, p0, Lcom/sma/smartv3/view/AloneProgressBar;->iX1O1:F

    .line 7
    new-instance p3, Landroid/graphics/Paint;

    invoke-direct {p3}, Landroid/graphics/Paint;-><init>()V

    iput-object p3, p0, Lcom/sma/smartv3/view/AloneProgressBar;->X11iII1O1:Landroid/graphics/Paint;

    .line 8
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/view/AloneProgressBar;->XXX11i:Landroid/graphics/Paint;

    .line 9
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    iput-object v1, p0, Lcom/sma/smartv3/view/AloneProgressBar;->X1IX:Landroid/graphics/Paint;

    .line 10
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    iput-object v2, p0, Lcom/sma/smartv3/view/AloneProgressBar;->X0i1O:Landroid/graphics/Paint;

    .line 11
    new-instance v3, Landroid/graphics/Paint;

    invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V

    iput-object v3, p0, Lcom/sma/smartv3/view/AloneProgressBar;->iIXi1iiXI:Landroid/graphics/Paint;

    .line 12
    new-instance v4, Landroid/graphics/RectF;

    invoke-direct {v4}, Landroid/graphics/RectF;-><init>()V

    iput-object v4, p0, Lcom/sma/smartv3/view/AloneProgressBar;->iXiX011:Landroid/graphics/RectF;

    .line 13
    new-instance v4, Landroid/graphics/RectF;

    invoke-direct {v4}, Landroid/graphics/RectF;-><init>()V

    iput-object v4, p0, Lcom/sma/smartv3/view/AloneProgressBar;->O001I:Landroid/graphics/RectF;

    const v4, -0xffff01

    .line 14
    iput v4, p0, Lcom/sma/smartv3/view/AloneProgressBar;->XX1Oi:I

    const/high16 v4, 0x42c80000    # 100.0f

    .line 15
    iput v4, p0, Lcom/sma/smartv3/view/AloneProgressBar;->OX110i:F

    .line 16
    iput v4, p0, Lcom/sma/smartv3/view/AloneProgressBar;->OO:F

    .line 17
    const-string v4, "--"

    iput-object v4, p0, Lcom/sma/smartv3/view/AloneProgressBar;->XOX0O0:Ljava/lang/String;

    .line 18
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/view/AloneProgressBar;->XIi00iiXO(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 19
    iget-boolean p2, p0, Lcom/sma/smartv3/view/AloneProgressBar;->I1:Z

    invoke-virtual {p3, p2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 20
    sget-object p2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p3, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 21
    sget-object v4, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {p3, v4}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 22
    iget v5, p0, Lcom/sma/smartv3/view/AloneProgressBar;->iX1O1:F

    invoke-virtual {p3, v5}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 23
    iget v5, p0, Lcom/sma/smartv3/view/AloneProgressBar;->Ii1iii0:I

    invoke-virtual {p3, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 24
    iget-boolean p3, p0, Lcom/sma/smartv3/view/AloneProgressBar;->I1:Z

    invoke-virtual {v0, p3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 25
    invoke-virtual {v0, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 26
    invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 27
    iget p2, p0, Lcom/sma/smartv3/view/AloneProgressBar;->iX1O1:F

    invoke-virtual {v0, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 28
    iget p2, p0, Lcom/sma/smartv3/view/AloneProgressBar;->iiiO:I

    invoke-virtual {v0, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 29
    iget-boolean p2, p0, Lcom/sma/smartv3/view/AloneProgressBar;->I1:Z

    invoke-virtual {v2, p2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 30
    sget-object p2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 31
    iget p2, p0, Lcom/sma/smartv3/view/AloneProgressBar;->iX1O1:F

    invoke-virtual {v2, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 32
    iget p2, p0, Lcom/sma/smartv3/view/AloneProgressBar;->XX1Oi:I

    invoke-virtual {v2, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 33
    iget-boolean p2, p0, Lcom/sma/smartv3/view/AloneProgressBar;->I1:Z

    invoke-virtual {v1, p2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    const p2, 0x7f06074b

    .line 34
    invoke-static {p1, p2}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result p3

    invoke-virtual {v1, p3}, Landroid/graphics/Paint;->setColor(I)V

    const/high16 p3, 0x42080000    # 34.0f

    .line 35
    invoke-static {p3}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result p3

    int-to-float p3, p3

    invoke-virtual {v1, p3}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 36
    sget-object p3, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v1, p3}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 37
    iget-boolean v0, p0, Lcom/sma/smartv3/view/AloneProgressBar;->I1:Z

    invoke-virtual {v3, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 38
    invoke-static {p1, p2}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v3, p1}, Landroid/graphics/Paint;->setColor(I)V

    const/high16 p1, 0x41600000    # 14.0f

    .line 39
    invoke-static {p1}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {v3, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 40
    invoke-virtual {v3, p3}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

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

    .line 41
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/view/AloneProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic XO0O10(Lcom/sma/smartv3/view/AloneProgressBar;IIILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/view/AloneProgressBar;->iO(II)V

    return-void
.end method


# virtual methods
.method public final OXO1(I)F
    .locals 0

    int-to-float p1, p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result p1

    int-to-float p1, p1

    return p1
.end method

.method public final XIi00iiXO(Landroid/content/Context;Landroid/util/AttributeSet;)V
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

    iput-boolean v1, p0, Lcom/sma/smartv3/view/AloneProgressBar;->I1:Z

    const/16 v1, 0xa

    invoke-virtual {p1, v1, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lcom/sma/smartv3/view/AloneProgressBar;->XXO:I

    const/16 v1, 0x9

    invoke-virtual {p1, v1, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lcom/sma/smartv3/view/AloneProgressBar;->iXiiiO:I

    const/4 v1, 0x2

    invoke-virtual {p1, v1, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lcom/sma/smartv3/view/AloneProgressBar;->Ii1iii0:I

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/AloneProgressBar;->iiiO:I

    const/4 v0, 0x5

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/AloneProgressBar;->X11I:I

    const/4 v0, 0x4

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/AloneProgressBar;->X100O:I

    const/4 p2, 0x7

    const/high16 v0, 0x40800000    # 4.0f

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/AloneProgressBar;->iX1O1:F

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public final iO(II)V
    .locals 0

    if-eqz p2, :cond_0

    invoke-virtual {p0, p2}, Lcom/sma/smartv3/view/AloneProgressBar;->setRingWidth(I)V

    :cond_0
    int-to-float p2, p1

    iput p2, p0, Lcom/sma/smartv3/view/AloneProgressBar;->OO:F

    const/high16 p2, 0x42c80000    # 100.0f

    iput p2, p0, Lcom/sma/smartv3/view/AloneProgressBar;->OX110i:F

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/view/AloneProgressBar;->XOX0O0:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/sma/smartv3/view/AloneProgressBar;->iXiX011:Landroid/graphics/RectF;

    const/4 v5, 0x0

    iget-object v6, p0, Lcom/sma/smartv3/view/AloneProgressBar;->XXX11i:Landroid/graphics/Paint;

    const/high16 v3, 0x43870000    # 270.0f

    const/high16 v4, 0x43b40000    # 360.0f

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    iget p1, p0, Lcom/sma/smartv3/view/AloneProgressBar;->OO:F

    iget v0, p0, Lcom/sma/smartv3/view/AloneProgressBar;->OX110i:F

    div-float/2addr p1, v0

    const/high16 v0, 0x43b40000    # 360.0f

    mul-float v10, p1, v0

    iput v10, p0, Lcom/sma/smartv3/view/AloneProgressBar;->IO:F

    iget-object v8, p0, Lcom/sma/smartv3/view/AloneProgressBar;->iXiX011:Landroid/graphics/RectF;

    const/4 v11, 0x0

    iget-object v12, p0, Lcom/sma/smartv3/view/AloneProgressBar;->X11iII1O1:Landroid/graphics/Paint;

    const/high16 v9, 0x43870000    # 270.0f

    move-object v7, v1

    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    iget p1, p0, Lcom/sma/smartv3/view/AloneProgressBar;->iOiXi11II:I

    int-to-float p1, p1

    const/high16 v0, 0x40000000    # 2.0f

    div-float/2addr p1, v0

    iget v2, p0, Lcom/sma/smartv3/view/AloneProgressBar;->X00XIX1:I

    int-to-float v2, v2

    div-float/2addr v2, v0

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iget-object v3, p0, Lcom/sma/smartv3/view/AloneProgressBar;->X1IX:Landroid/graphics/Paint;

    iget-object v4, p0, Lcom/sma/smartv3/view/AloneProgressBar;->XOX0O0:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v6

    invoke-virtual {v3, v4, v5, v6, v0}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    invoke-virtual {v0}, Landroid/graphics/Rect;->exactCenterY()F

    move-result v0

    sub-float/2addr v2, v0

    iget-object v0, p0, Lcom/sma/smartv3/view/AloneProgressBar;->XOX0O0:Ljava/lang/String;

    iget-object v3, p0, Lcom/sma/smartv3/view/AloneProgressBar;->X1IX:Landroid/graphics/Paint;

    invoke-virtual {v1, v0, p1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    return-void
.end method

.method public onMeasure(II)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public onSizeChanged(IIII)V
    .locals 2

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    iput p1, p0, Lcom/sma/smartv3/view/AloneProgressBar;->iOiXi11II:I

    iput p2, p0, Lcom/sma/smartv3/view/AloneProgressBar;->X00XIX1:I

    iget-object p1, p0, Lcom/sma/smartv3/view/AloneProgressBar;->X11iII1O1:Landroid/graphics/Paint;

    iget p2, p0, Lcom/sma/smartv3/view/AloneProgressBar;->iX1O1:F

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object p1, p0, Lcom/sma/smartv3/view/AloneProgressBar;->XXX11i:Landroid/graphics/Paint;

    iget p2, p0, Lcom/sma/smartv3/view/AloneProgressBar;->iX1O1:F

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget p1, p0, Lcom/sma/smartv3/view/AloneProgressBar;->iOiXi11II:I

    iget p2, p0, Lcom/sma/smartv3/view/AloneProgressBar;->X00XIX1:I

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    int-to-float p1, p1

    iget p2, p0, Lcom/sma/smartv3/view/AloneProgressBar;->iX1O1:F

    sub-float/2addr p1, p2

    iget p2, p0, Lcom/sma/smartv3/view/AloneProgressBar;->iOiXi11II:I

    int-to-float p2, p2

    sub-float/2addr p2, p1

    const/high16 p3, 0x40000000    # 2.0f

    div-float/2addr p2, p3

    iget p4, p0, Lcom/sma/smartv3/view/AloneProgressBar;->X00XIX1:I

    int-to-float p4, p4

    sub-float/2addr p4, p1

    div-float/2addr p4, p3

    add-float v0, p2, p1

    add-float/2addr p1, p4

    iget-object v1, p0, Lcom/sma/smartv3/view/AloneProgressBar;->O001I:Landroid/graphics/RectF;

    invoke-virtual {v1, p2, p4, v0, p1}, Landroid/graphics/RectF;->set(FFFF)V

    iget v1, p0, Lcom/sma/smartv3/view/AloneProgressBar;->iX1O1:F

    div-float/2addr v1, p3

    iget-object p3, p0, Lcom/sma/smartv3/view/AloneProgressBar;->iXiX011:Landroid/graphics/RectF;

    add-float/2addr p2, v1

    add-float/2addr p4, v1

    sub-float/2addr v0, v1

    sub-float/2addr p1, v1

    invoke-virtual {p3, p2, p4, v0, p1}, Landroid/graphics/RectF;->set(FFFF)V

    return-void
.end method

.method public final setProgressSelectedBgColor(I)V
    .locals 1

    iput p1, p0, Lcom/sma/smartv3/view/AloneProgressBar;->Ii1iii0:I

    iget-object v0, p0, Lcom/sma/smartv3/view/AloneProgressBar;->X11iII1O1:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method public final setRingWidth(I)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/view/AloneProgressBar;->OXO1(I)F

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/view/AloneProgressBar;->iX1O1:F

    return-void
.end method

.method public final setValue(I)V
    .locals 1

    int-to-float v0, p1

    iput v0, p0, Lcom/sma/smartv3/view/AloneProgressBar;->OO:F

    const/high16 v0, 0x42c80000    # 100.0f

    iput v0, p0, Lcom/sma/smartv3/view/AloneProgressBar;->OX110i:F

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "%"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/view/AloneProgressBar;->XOX0O0:Ljava/lang/String;

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method
