.class public final Lcom/sma/smartv3/view/SportEndProgress;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/view/SportEndProgress$OXO1;,
        Lcom/sma/smartv3/view/SportEndProgress$XIi00iiXO;
    }
.end annotation


# instance fields
.field public I1:F

.field public IO:I

.field public Ii1iii0:I

.field public final O001I:F

.field public final OO:F

.field public OX110i:J

.field public X00XIX1:Lcom/sma/smartv3/view/SportEndProgress$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public final X0i1O:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public X100O:Landroid/animation/ValueAnimator;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public X11I:Z

.field public X11iII1O1:F

.field public final X1IX:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public XOX0O0:F

.field public XX1Oi:F

.field public XXO:F

.field public final XXX11i:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public i0X000X0O:Z

.field public final iIXi1iiXI:Landroid/graphics/RectF;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public iOiXi11II:Lcom/sma/smartv3/view/SportEndProgress$XIi00iiXO;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public iX1O1:F

.field public final iXiX011:F

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

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/view/SportEndProgress;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/view/SportEndProgress;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 5
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

    const/16 p3, 0x3c

    .line 4
    invoke-virtual {p0, p3}, Lcom/sma/smartv3/view/SportEndProgress;->XIi00iiXO(I)F

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/SportEndProgress;->iX1O1:F

    .line 5
    invoke-virtual {p0, p3}, Lcom/sma/smartv3/view/SportEndProgress;->XIi00iiXO(I)F

    move-result p3

    iput p3, p0, Lcom/sma/smartv3/view/SportEndProgress;->X11iII1O1:F

    .line 6
    new-instance p3, Landroid/graphics/Paint;

    invoke-direct {p3}, Landroid/graphics/Paint;-><init>()V

    iput-object p3, p0, Lcom/sma/smartv3/view/SportEndProgress;->XXX11i:Landroid/graphics/Paint;

    .line 7
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/view/SportEndProgress;->X1IX:Landroid/graphics/Paint;

    .line 8
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    iput-object v1, p0, Lcom/sma/smartv3/view/SportEndProgress;->X0i1O:Landroid/graphics/Paint;

    .line 9
    new-instance v2, Landroid/graphics/RectF;

    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    iput-object v2, p0, Lcom/sma/smartv3/view/SportEndProgress;->iIXi1iiXI:Landroid/graphics/RectF;

    const/4 v2, 0x4

    .line 10
    invoke-virtual {p0, v2}, Lcom/sma/smartv3/view/SportEndProgress;->XIi00iiXO(I)F

    move-result v2

    iput v2, p0, Lcom/sma/smartv3/view/SportEndProgress;->iXiX011:F

    const/4 v3, 0x6

    .line 11
    invoke-virtual {p0, v3}, Lcom/sma/smartv3/view/SportEndProgress;->XIi00iiXO(I)F

    move-result v3

    iput v3, p0, Lcom/sma/smartv3/view/SportEndProgress;->O001I:F

    const/4 v3, 0x1

    .line 12
    iput-boolean v3, p0, Lcom/sma/smartv3/view/SportEndProgress;->X11I:Z

    .line 13
    new-instance v3, Landroid/animation/ValueAnimator;

    invoke-direct {v3}, Landroid/animation/ValueAnimator;-><init>()V

    iput-object v3, p0, Lcom/sma/smartv3/view/SportEndProgress;->X100O:Landroid/animation/ValueAnimator;

    const-wide/16 v3, 0x7d0

    .line 14
    iput-wide v3, p0, Lcom/sma/smartv3/view/SportEndProgress;->OX110i:J

    const/high16 v3, 0x40a00000    # 5.0f

    .line 15
    iput v3, p0, Lcom/sma/smartv3/view/SportEndProgress;->OO:F

    .line 16
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/view/SportEndProgress;->XO0O10(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 17
    iget-boolean p1, p0, Lcom/sma/smartv3/view/SportEndProgress;->X11I:Z

    invoke-virtual {p3, p1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 18
    iget p1, p0, Lcom/sma/smartv3/view/SportEndProgress;->iXiiiO:I

    invoke-virtual {p3, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 19
    iget-boolean p1, p0, Lcom/sma/smartv3/view/SportEndProgress;->X11I:Z

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 20
    iget p1, p0, Lcom/sma/smartv3/view/SportEndProgress;->Ii1iii0:I

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 21
    iget-boolean p1, p0, Lcom/sma/smartv3/view/SportEndProgress;->X11I:Z

    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 22
    iget p1, p0, Lcom/sma/smartv3/view/SportEndProgress;->iiiO:I

    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 23
    sget-object p1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 24
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

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

    .line 25
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/view/SportEndProgress;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static final O00(Lcom/sma/smartv3/view/SportEndProgress;Landroid/animation/ValueAnimator;)V
    .locals 1

    const-string v0, "animation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type kotlin.Float"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/view/SportEndProgress;->XX1Oi:F

    iget v0, p0, Lcom/sma/smartv3/view/SportEndProgress;->OO:F

    mul-float/2addr p1, v0

    iput p1, p0, Lcom/sma/smartv3/view/SportEndProgress;->XOX0O0:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    iget p1, p0, Lcom/sma/smartv3/view/SportEndProgress;->XOX0O0:F

    iget v0, p0, Lcom/sma/smartv3/view/SportEndProgress;->OO:F

    cmpg-float p1, p1, v0

    if-nez p1, :cond_0

    iget-boolean p1, p0, Lcom/sma/smartv3/view/SportEndProgress;->i0X000X0O:Z

    if-eqz p1, :cond_0

    iget-object p0, p0, Lcom/sma/smartv3/view/SportEndProgress;->X00XIX1:Lcom/sma/smartv3/view/SportEndProgress$OXO1;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lcom/sma/smartv3/view/SportEndProgress$OXO1;->end()V

    :cond_0
    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/view/SportEndProgress;Landroid/animation/ValueAnimator;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/view/SportEndProgress;->O00(Lcom/sma/smartv3/view/SportEndProgress;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method private final setProgress(F)V
    .locals 3

    iget v0, p0, Lcom/sma/smartv3/view/SportEndProgress;->OO:F

    cmpl-float v1, p1, v0

    if-lez v1, :cond_0

    move p1, v0

    :cond_0
    iget v1, p0, Lcom/sma/smartv3/view/SportEndProgress;->XX1Oi:F

    div-float/2addr p1, v0

    const/4 v0, 0x2

    new-array v0, v0, [F

    const/4 v2, 0x0

    aput v1, v0, v2

    const/4 v1, 0x1

    aput p1, v0, v1

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object p1

    const-string v0, "ofFloat(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/view/SportEndProgress;->X100O:Landroid/animation/ValueAnimator;

    iget-wide v0, p0, Lcom/sma/smartv3/view/SportEndProgress;->OX110i:J

    invoke-virtual {p1, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    iget-object p1, p0, Lcom/sma/smartv3/view/SportEndProgress;->X100O:Landroid/animation/ValueAnimator;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/sz4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/sz4;-><init>(Lcom/sma/smartv3/view/SportEndProgress;)V

    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    iget-object p1, p0, Lcom/sma/smartv3/view/SportEndProgress;->X100O:Landroid/animation/ValueAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method


# virtual methods
.method public final IiI10X(Lcom/sma/smartv3/view/SportEndProgress$XIi00iiXO;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/view/SportEndProgress$XIi00iiXO;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/view/SportEndProgress;->iOiXi11II:Lcom/sma/smartv3/view/SportEndProgress$XIi00iiXO;

    return-void
.end method

.method public final XIi00iiXO(I)F
    .locals 0

    int-to-float p1, p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result p1

    int-to-float p1, p1

    return p1
.end method

.method public final XO0O10(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    sget-object v0, Lcom/sma/smartv3/R$styleable;->SportEndProgress:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const-string p2, "obtainStyledAttributes(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x0

    const/4 v0, 0x1

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/sma/smartv3/view/SportEndProgress;->X11I:Z

    const/4 p2, 0x4

    const/4 v0, -0x1

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/SportEndProgress;->iXiiiO:I

    const/4 p2, 0x2

    const/high16 v1, -0x10000

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/SportEndProgress;->Ii1iii0:I

    const/4 p2, 0x3

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/SportEndProgress;->iiiO:I

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public final iO(Lcom/sma/smartv3/view/SportEndProgress$OXO1;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/view/SportEndProgress$OXO1;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/view/SportEndProgress;->X00XIX1:Lcom/sma/smartv3/view/SportEndProgress$OXO1;

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

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    iget v0, p0, Lcom/sma/smartv3/view/SportEndProgress;->I1:F

    iget v1, p0, Lcom/sma/smartv3/view/SportEndProgress;->iX1O1:F

    iget-object v2, p0, Lcom/sma/smartv3/view/SportEndProgress;->X1IX:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v0, v1, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget v0, p0, Lcom/sma/smartv3/view/SportEndProgress;->I1:F

    iget v1, p0, Lcom/sma/smartv3/view/SportEndProgress;->X11iII1O1:F

    sub-float v3, v0, v1

    sub-float v4, v0, v1

    iget v0, p0, Lcom/sma/smartv3/view/SportEndProgress;->iX1O1:F

    add-float v5, v0, v1

    add-float v6, v0, v1

    iget-object v7, p0, Lcom/sma/smartv3/view/SportEndProgress;->XXX11i:Landroid/graphics/Paint;

    move-object v2, p1

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    iget p1, p0, Lcom/sma/smartv3/view/SportEndProgress;->XOX0O0:F

    iget v0, p0, Lcom/sma/smartv3/view/SportEndProgress;->OO:F

    div-float/2addr p1, v0

    const/high16 v0, 0x43b40000    # 360.0f

    mul-float v11, p1, v0

    iput v11, p0, Lcom/sma/smartv3/view/SportEndProgress;->XXO:F

    iget-object v9, p0, Lcom/sma/smartv3/view/SportEndProgress;->iIXi1iiXI:Landroid/graphics/RectF;

    const/4 v12, 0x0

    iget-object v13, p0, Lcom/sma/smartv3/view/SportEndProgress;->X0i1O:Landroid/graphics/Paint;

    const/high16 v10, 0x43870000    # 270.0f

    move-object v8, v2

    invoke-virtual/range {v8 .. v13}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    return-void
.end method

.method public onMeasure(II)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/view/SportEndProgress;->IO:I

    invoke-virtual {p0, p1, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public onSizeChanged(IIII)V
    .locals 1

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    iget p1, p0, Lcom/sma/smartv3/view/SportEndProgress;->IO:I

    int-to-float p2, p1

    const/high16 p3, 0x40000000    # 2.0f

    div-float/2addr p2, p3

    iput p2, p0, Lcom/sma/smartv3/view/SportEndProgress;->I1:F

    iput p2, p0, Lcom/sma/smartv3/view/SportEndProgress;->iX1O1:F

    int-to-float p1, p1

    const/high16 p2, 0x40400000    # 3.0f

    div-float/2addr p1, p2

    div-float/2addr p1, p3

    iput p1, p0, Lcom/sma/smartv3/view/SportEndProgress;->X11iII1O1:F

    iget-object p1, p0, Lcom/sma/smartv3/view/SportEndProgress;->iIXi1iiXI:Landroid/graphics/RectF;

    iget p2, p0, Lcom/sma/smartv3/view/SportEndProgress;->O001I:F

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p3

    int-to-float p3, p3

    iget p4, p0, Lcom/sma/smartv3/view/SportEndProgress;->O001I:F

    sub-float/2addr p3, p4

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p4

    int-to-float p4, p4

    iget v0, p0, Lcom/sma/smartv3/view/SportEndProgress;->O001I:F

    sub-float/2addr p4, v0

    invoke-virtual {p1, p2, p2, p3, p4}, Landroid/graphics/RectF;->set(FFFF)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    if-eq v0, v1, :cond_0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/sma/smartv3/view/SportEndProgress;->i0X000X0O:Z

    const-string v1, "ACTION_UP"

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/sma/smartv3/view/SportEndProgress;->X100O:Landroid/animation/ValueAnimator;

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->cancel()V

    const-wide/16 v1, 0x1

    iput-wide v1, p0, Lcom/sma/smartv3/view/SportEndProgress;->OX110i:J

    const/4 v1, 0x0

    invoke-direct {p0, v1}, Lcom/sma/smartv3/view/SportEndProgress;->setProgress(F)V

    iget-object v1, p0, Lcom/sma/smartv3/view/SportEndProgress;->iOiXi11II:Lcom/sma/smartv3/view/SportEndProgress$XIi00iiXO;

    if-eqz v1, :cond_2

    invoke-interface {v1, v0}, Lcom/sma/smartv3/view/SportEndProgress$XIi00iiXO;->start(Z)V

    goto :goto_0

    :cond_1
    iput-boolean v1, p0, Lcom/sma/smartv3/view/SportEndProgress;->i0X000X0O:Z

    const-string v0, "ACTION_DOWN"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    const-wide/16 v2, 0x7d0

    iput-wide v2, p0, Lcom/sma/smartv3/view/SportEndProgress;->OX110i:J

    const/high16 v0, 0x40a00000    # 5.0f

    invoke-direct {p0, v0}, Lcom/sma/smartv3/view/SportEndProgress;->setProgress(F)V

    iget-object v0, p0, Lcom/sma/smartv3/view/SportEndProgress;->iOiXi11II:Lcom/sma/smartv3/view/SportEndProgress$XIi00iiXO;

    if-eqz v0, :cond_2

    invoke-interface {v0, v1}, Lcom/sma/smartv3/view/SportEndProgress$XIi00iiXO;->start(Z)V

    :cond_2
    :goto_0
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method
