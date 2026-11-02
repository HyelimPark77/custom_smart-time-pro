.class public final Lcom/sma/smartv3/view/SimpleStepProgressBar;
.super Lskin/support/widget/SkinCompatView;
.source "SourceFile"


# instance fields
.field public I1:F

.field public final IO0II0i:J

.field public IXI:F

.field public IXOIIIO:F

.field public Ii0X0X:F

.field public final Ii0i:F

.field public Ii1iii0:I

.field public IiiXiI0I:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final O001I:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final OO:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public OX110i:I

.field public X00XIX1:I

.field public X00Xi1X:I

.field public X0i1O:F

.field public X1:Landroid/animation/ValueAnimator;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public X100O:I

.field public X11I:I

.field public X11iII1O1:F

.field public X1IX:I

.field public XO0X10iO:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public XOX0O0:I

.field public XX1Oi:I

.field public final XXO:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public XXX11i:Z

.field public XXiIiX10:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public i0X000X0O:Landroid/graphics/Bitmap;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public i11I:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final iIXi1iiXI:F

.field public iOiXi11II:I

.field public iX1O1:F

.field public iXiX011:F

.field public final iXiiiO:Landroid/graphics/RectF;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

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

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/view/SimpleStepProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/view/SimpleStepProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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
    invoke-direct {p0, p1, p2, p3}, Lskin/support/widget/SkinCompatView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p3, 0x1

    .line 4
    iput-boolean p3, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->XXX11i:Z

    const/16 p3, 0xa

    .line 5
    invoke-direct {p0, p3}, Lcom/sma/smartv3/view/SimpleStepProgressBar;->XIi00iiXO(I)F

    move-result p3

    iput p3, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->X0i1O:F

    const/4 v0, 0x2

    int-to-float v0, v0

    mul-float/2addr p3, v0

    const/16 v1, 0x8

    .line 6
    invoke-direct {p0, v1}, Lcom/sma/smartv3/view/SimpleStepProgressBar;->XIi00iiXO(I)F

    move-result v1

    add-float/2addr p3, v1

    iput p3, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->iIXi1iiXI:F

    const/4 v1, 0x6

    .line 7
    invoke-direct {p0, v1}, Lcom/sma/smartv3/view/SimpleStepProgressBar;->XIi00iiXO(I)F

    move-result v1

    iput v1, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->iXiX011:F

    .line 8
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    iput-object v1, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->O001I:Landroid/graphics/Paint;

    .line 9
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    iput-object v2, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->XXO:Landroid/graphics/Paint;

    .line 10
    new-instance v3, Landroid/graphics/RectF;

    invoke-direct {v3}, Landroid/graphics/RectF;-><init>()V

    iput-object v3, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->iXiiiO:Landroid/graphics/RectF;

    .line 11
    new-instance v3, Landroid/graphics/Paint;

    invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V

    iput-object v3, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->OO:Landroid/graphics/Paint;

    .line 12
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f080fa2

    invoke-static {v4, v5}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v4

    const-string v5, "decodeResource(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v4, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->i0X000X0O:Landroid/graphics/Bitmap;

    .line 13
    new-instance v4, Landroid/graphics/Paint;

    invoke-direct {v4}, Landroid/graphics/Paint;-><init>()V

    iput-object v4, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->i11I:Landroid/graphics/Paint;

    .line 14
    new-instance v4, Landroid/graphics/Paint;

    invoke-direct {v4}, Landroid/graphics/Paint;-><init>()V

    iput-object v4, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->XO0X10iO:Landroid/graphics/Paint;

    .line 15
    const-string v4, "Steps"

    iput-object v4, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->XXiIiX10:Ljava/lang/String;

    .line 16
    new-instance v4, Landroid/animation/ValueAnimator;

    invoke-direct {v4}, Landroid/animation/ValueAnimator;-><init>()V

    iput-object v4, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->X1:Landroid/animation/ValueAnimator;

    const-wide/16 v4, 0x3e8

    .line 17
    iput-wide v4, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->IO0II0i:J

    const/high16 v4, 0x42c80000    # 100.0f

    .line 18
    iput v4, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->Ii0i:F

    const/high16 v4, 0x42b40000    # 90.0f

    .line 19
    iput v4, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->IXI:F

    .line 20
    const-string v4, "10000"

    iput-object v4, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->IiiXiI0I:Ljava/lang/String;

    .line 21
    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/view/SimpleStepProgressBar;->iO(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 22
    iget-boolean p2, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->XXX11i:Z

    invoke-virtual {v1, p2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 23
    sget-object p2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 24
    sget-object v4, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v1, v4}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 25
    iget v5, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->X0i1O:F

    invoke-virtual {v1, v5}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 26
    iget-boolean v1, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->XXX11i:Z

    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 27
    invoke-virtual {v2, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 28
    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 29
    iget p2, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->X0i1O:F

    invoke-virtual {v2, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 30
    iget p2, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->X00XIX1:I

    invoke-virtual {v2, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 31
    iget-boolean p2, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->XXX11i:Z

    invoke-virtual {v3, p2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 32
    sget-object p2, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v3, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const/4 p2, -0x1

    .line 33
    invoke-virtual {v3, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 34
    invoke-virtual {v3, p3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 35
    iget-object p2, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->i11I:Landroid/graphics/Paint;

    iget-boolean p3, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->XXX11i:Z

    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 36
    iget-object p2, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->i11I:Landroid/graphics/Paint;

    iget p3, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->iOiXi11II:I

    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 37
    iget-object p2, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->i11I:Landroid/graphics/Paint;

    const/16 p3, 0x24

    invoke-direct {p0, p3}, Lcom/sma/smartv3/view/SimpleStepProgressBar;->O00(I)F

    move-result p3

    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 38
    iget-object p2, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->i11I:Landroid/graphics/Paint;

    sget-object p3, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 39
    iget-object p2, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->i11I:Landroid/graphics/Paint;

    sget-object p3, Lcom/android/mltcode/paycertificationapi/iiOI111I;->OXO1:Lcom/android/mltcode/paycertificationapi/iiOI111I;

    sget-object v1, Lcom/sma/smartv3/view/text/MyTypeface;->DIN_COND_BOLD:Lcom/sma/smartv3/view/text/MyTypeface;

    invoke-virtual {p3, v1, p1}, Lcom/android/mltcode/paycertificationapi/iiOI111I;->OXO1(Lcom/sma/smartv3/view/text/MyTypeface;Landroid/content/Context;)Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 40
    iget-object p2, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->XO0X10iO:Landroid/graphics/Paint;

    iget-boolean v1, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->XXX11i:Z

    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 41
    iget-object p2, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->XO0X10iO:Landroid/graphics/Paint;

    iget v1, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->iOiXi11II:I

    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 42
    iget-object p2, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->XO0X10iO:Landroid/graphics/Paint;

    const/16 v1, 0xe

    invoke-direct {p0, v1}, Lcom/sma/smartv3/view/SimpleStepProgressBar;->O00(I)F

    move-result v1

    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 43
    iget-object p2, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->XO0X10iO:Landroid/graphics/Paint;

    sget-object v1, Lcom/sma/smartv3/view/text/MyTypeface;->PF_REGULAR:Lcom/sma/smartv3/view/text/MyTypeface;

    invoke-virtual {p3, v1, p1}, Lcom/android/mltcode/paycertificationapi/iiOI111I;->OXO1(Lcom/sma/smartv3/view/text/MyTypeface;Landroid/content/Context;)Landroid/graphics/Typeface;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 44
    iget-object p1, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->XO0X10iO:Landroid/graphics/Paint;

    iget-object p2, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->XXiIiX10:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result p1

    div-float/2addr p1, v0

    iput p1, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->Ii0X0X:F

    .line 45
    invoke-virtual {p0}, Lcom/sma/smartv3/view/SimpleStepProgressBar;->applySkin()V

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

    .line 46
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/view/SimpleStepProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private final IiI10X(FFJ)V
    .locals 2

    const/4 v0, 0x2

    new-array v0, v0, [F

    const/4 v1, 0x0

    aput p1, v0, v1

    const/4 p1, 0x1

    aput p2, v0, p1

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object p1

    const-string p2, "ofFloat(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->X1:Landroid/animation/ValueAnimator;

    invoke-virtual {p1, p3, p4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    iget-object p1, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->X1:Landroid/animation/ValueAnimator;

    new-instance p2, Lcom/android/mltcode/paycertificationapi/ji4;

    invoke-direct {p2, p0}, Lcom/android/mltcode/paycertificationapi/ji4;-><init>(Lcom/sma/smartv3/view/SimpleStepProgressBar;)V

    invoke-virtual {p1, p2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    iget-object p1, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->X1:Landroid/animation/ValueAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method

.method private final O00(I)F
    .locals 0

    int-to-float p1, p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/SizeUtils;->sp2px(F)I

    move-result p1

    int-to-float p1, p1

    return p1
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/view/SimpleStepProgressBar;Landroid/animation/ValueAnimator;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/view/SimpleStepProgressBar;->XOO0ii0(Lcom/sma/smartv3/view/SimpleStepProgressBar;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method private final XIi00iiXO(I)F
    .locals 0

    int-to-float p1, p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result p1

    int-to-float p1, p1

    return p1
.end method

.method public static final XOO0ii0(Lcom/sma/smartv3/view/SimpleStepProgressBar;Landroid/animation/ValueAnimator;)V
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

    iput p1, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->IXOIIIO:F

    iget v0, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->Ii0i:F

    mul-float/2addr p1, v0

    iput p1, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->IXI:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method private final iO(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    sget-object v0, Lcom/sma/smartv3/R$styleable;->SimpleStepProgressBar:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const-string p2, "obtainStyledAttributes(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x0

    const/4 v0, 0x1

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->XXX11i:Z

    const/4 v1, 0x4

    invoke-virtual {p1, v1, p2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    iput v1, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->Ii1iii0:I

    const/4 v1, 0x2

    invoke-virtual {p1, v1, p2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    iput v1, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->XX1Oi:I

    const/4 v1, 0x3

    invoke-virtual {p1, v1, p2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    iput v1, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->X11I:I

    const/4 v1, 0x6

    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->XXiIiX10:Ljava/lang/String;

    const/4 v1, 0x5

    invoke-virtual {p1, v1, p2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    iput v1, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->iOiXi11II:I

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->X00XIX1:I

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method


# virtual methods
.method public final XO0O10(II)V
    .locals 3

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->IiiXiI0I:Ljava/lang/String;

    if-nez p2, :cond_0

    const/16 p2, 0x2710

    :cond_0
    int-to-float p1, p1

    int-to-float p2, p2

    div-float/2addr p1, p2

    const/16 p2, 0x64

    int-to-float p2, p2

    mul-float/2addr p1, p2

    iget p2, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->Ii0i:F

    cmpl-float v0, p1, p2

    if-lez v0, :cond_1

    move p1, p2

    :cond_1
    iget v0, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->IXOIIIO:F

    div-float/2addr p1, p2

    iget-wide v1, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->IO0II0i:J

    invoke-direct {p0, v0, p1, v1, v2}, Lcom/sma/smartv3/view/SimpleStepProgressBar;->IiI10X(FFJ)V

    return-void
.end method

.method public applySkin()V
    .locals 6

    invoke-super {p0}, Lskin/support/widget/SkinCompatView;->applySkin()V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->OO:Landroid/graphics/Paint;

    iget v3, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->XOX0O0:I

    invoke-static {v0, v2, v3}, Lcom/android/mltcode/paycertificationapi/hl4;->OXO1(Landroid/content/Context;Landroid/graphics/Paint;I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->XO0X10iO:Landroid/graphics/Paint;

    iget v3, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->iOiXi11II:I

    invoke-static {v0, v2, v3}, Lcom/android/mltcode/paycertificationapi/hl4;->OXO1(Landroid/content/Context;Landroid/graphics/Paint;I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->i11I:Landroid/graphics/Paint;

    iget v3, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->iOiXi11II:I

    invoke-static {v0, v2, v3}, Lcom/android/mltcode/paycertificationapi/hl4;->OXO1(Landroid/content/Context;Landroid/graphics/Paint;I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget v2, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->Ii1iii0:I

    invoke-static {v0, v2}, Lcom/android/mltcode/paycertificationapi/hl4;->XIi00iiXO(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->iiiO:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget v2, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->XX1Oi:I

    invoke-static {v0, v2}, Lcom/android/mltcode/paycertificationapi/hl4;->XIi00iiXO(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->OX110i:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget v1, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->X11I:I

    invoke-static {v0, v1}, Lcom/android/mltcode/paycertificationapi/hl4;->XIi00iiXO(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->X100O:I

    iget-object v0, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->O001I:Landroid/graphics/Paint;

    new-instance v1, Landroid/graphics/SweepGradient;

    iget v2, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->X1IX:I

    int-to-float v2, v2

    const/4 v3, 0x2

    int-to-float v3, v3

    div-float/2addr v2, v3

    iget v3, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->iiiO:I

    iget v4, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->X100O:I

    iget v5, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->OX110i:I

    filled-new-array {v3, v4, v5, v5}, [I

    move-result-object v3

    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v5, 0x4

    new-array v5, v5, [F

    fill-array-data v5, :array_0

    invoke-direct {v1, v2, v4, v3, v5}, Landroid/graphics/SweepGradient;-><init>(FF[I[F)V

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void

    :array_0
    .array-data 4
        0x0
        0x3e99999a    # 0.3f
        0x3f000000    # 0.5f
        0x3f800000    # 1.0f
    .end array-data
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

    iget-object v2, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->iXiiiO:Landroid/graphics/RectF;

    const/4 v5, 0x0

    iget-object v6, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->XXO:Landroid/graphics/Paint;

    const/high16 v3, 0x43870000    # 270.0f

    const/high16 v4, 0x43b40000    # 360.0f

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    iget p1, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->IXI:F

    iget v0, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->Ii0i:F

    div-float/2addr p1, v0

    const/high16 v0, 0x43b40000    # 360.0f

    mul-float v10, p1, v0

    iput v10, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->X11iII1O1:F

    iget-object v8, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->iXiiiO:Landroid/graphics/RectF;

    const/4 v11, 0x0

    iget-object v12, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->O001I:Landroid/graphics/Paint;

    const/high16 v9, 0x43870000    # 270.0f

    move-object v7, v1

    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    iget-object p1, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->i0X000X0O:Landroid/graphics/Bitmap;

    iget v0, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->I1:F

    const/16 v2, 0xe

    invoke-direct {p0, v2}, Lcom/sma/smartv3/view/SimpleStepProgressBar;->XIi00iiXO(I)F

    move-result v2

    sub-float/2addr v0, v2

    iget v2, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->I1:F

    const/4 v3, 0x3

    int-to-float v3, v3

    div-float/2addr v2, v3

    iget-object v3, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->OO:Landroid/graphics/Paint;

    invoke-virtual {v1, p1, v0, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    iget-object p1, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->IiiXiI0I:Ljava/lang/String;

    iget v0, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->I1:F

    const/16 v2, 0xa

    invoke-direct {p0, v2}, Lcom/sma/smartv3/view/SimpleStepProgressBar;->XIi00iiXO(I)F

    move-result v2

    add-float/2addr v2, v0

    iget-object v3, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->i11I:Landroid/graphics/Paint;

    invoke-virtual {v1, p1, v0, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    iget-object p1, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->XXiIiX10:Ljava/lang/String;

    iget v0, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->I1:F

    iget v2, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->Ii0X0X:F

    sub-float v2, v0, v2

    const/4 v3, 0x2

    int-to-float v3, v3

    div-float v3, v0, v3

    add-float/2addr v0, v3

    iget-object v3, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->XO0X10iO:Landroid/graphics/Paint;

    invoke-virtual {v1, p1, v2, v0, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

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

    iput p1, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->X00Xi1X:I

    invoke-virtual {p0, p1, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public onSizeChanged(IIII)V
    .locals 1

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    iput p1, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->X1IX:I

    iget p1, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->X00Xi1X:I

    int-to-float p1, p1

    const/high16 p2, 0x40000000    # 2.0f

    div-float/2addr p1, p2

    iput p1, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->I1:F

    iget p2, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->X0i1O:F

    const/4 p3, 0x2

    int-to-float p3, p3

    div-float/2addr p2, p3

    sub-float/2addr p1, p2

    iput p1, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->iX1O1:F

    iget-object p1, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->iXiiiO:Landroid/graphics/RectF;

    iget p2, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->iXiX011:F

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p3

    int-to-float p3, p3

    iget p4, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->iXiX011:F

    sub-float/2addr p3, p4

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p4

    int-to-float p4, p4

    iget v0, p0, Lcom/sma/smartv3/view/SimpleStepProgressBar;->iXiX011:F

    sub-float/2addr p4, v0

    invoke-virtual {p1, p2, p2, p3, p4}, Landroid/graphics/RectF;->set(FFFF)V

    invoke-virtual {p0}, Lcom/sma/smartv3/view/SimpleStepProgressBar;->applySkin()V

    return-void
.end method
