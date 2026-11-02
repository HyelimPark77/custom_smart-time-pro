.class public final Lcom/sma/smartv3/view/Goal4ProgressBar;
.super Lskin/support/widget/SkinCompatView;
.source "SourceFile"


# instance fields
.field public I1:F

.field public final IO0II0i:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public IXOIIIO:Landroid/graphics/Bitmap;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public Ii0X0X:F

.field public Ii0i:I

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

.field public X00Xi1X:Landroid/graphics/Bitmap;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public final X0i1O:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public X1:Landroid/graphics/Bitmap;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
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

.field public XXiIiX10:I

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

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/view/Goal4ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/view/Goal4ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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
    iput p3, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->I1:F

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->iX1O1:Z

    const/16 v0, 0xa

    .line 6
    invoke-direct {p0, v0}, Lcom/sma/smartv3/view/Goal4ProgressBar;->OXO1(I)F

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->X11iII1O1:F

    const/4 v0, 0x4

    .line 7
    invoke-direct {p0, v0}, Lcom/sma/smartv3/view/Goal4ProgressBar;->OXO1(I)F

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->XXX11i:F

    .line 8
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->X1IX:Landroid/graphics/Paint;

    .line 9
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    iput-object v1, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->X0i1O:Landroid/graphics/Paint;

    .line 10
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    iput-object v2, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->iIXi1iiXI:Landroid/graphics/Paint;

    .line 11
    new-instance v3, Landroid/graphics/Paint;

    invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V

    iput-object v3, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->iXiX011:Landroid/graphics/Paint;

    .line 12
    new-instance v4, Landroid/graphics/Paint;

    invoke-direct {v4}, Landroid/graphics/Paint;-><init>()V

    iput-object v4, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->O001I:Landroid/graphics/Paint;

    .line 13
    new-instance v5, Landroid/graphics/Paint;

    invoke-direct {v5}, Landroid/graphics/Paint;-><init>()V

    iput-object v5, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->XXO:Landroid/graphics/Paint;

    .line 14
    new-instance v6, Landroid/graphics/RectF;

    invoke-direct {v6}, Landroid/graphics/RectF;-><init>()V

    iput-object v6, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->iXiiiO:Landroid/graphics/RectF;

    .line 15
    new-instance v6, Landroid/graphics/RectF;

    invoke-direct {v6}, Landroid/graphics/RectF;-><init>()V

    iput-object v6, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->Ii1iii0:Landroid/graphics/RectF;

    .line 16
    new-instance v6, Landroid/graphics/RectF;

    invoke-direct {v6}, Landroid/graphics/RectF;-><init>()V

    iput-object v6, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->iiiO:Landroid/graphics/RectF;

    const/high16 v6, 0x42c80000    # 100.0f

    .line 17
    iput v6, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->iOiXi11II:F

    .line 18
    iput v6, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->i0X000X0O:F

    .line 19
    iput v6, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->XO0X10iO:F

    .line 20
    invoke-static {p3}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result p3

    iput p3, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->XXiIiX10:I

    .line 21
    new-instance p3, Landroid/graphics/Paint;

    invoke-direct {p3}, Landroid/graphics/Paint;-><init>()V

    iput-object p3, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->IO0II0i:Landroid/graphics/Paint;

    .line 22
    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/view/Goal4ProgressBar;->XIi00iiXO(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 23
    iget-boolean p1, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->iX1O1:Z

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 24
    sget-object p1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 25
    sget-object p2, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, p2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 26
    iget p3, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->X11iII1O1:F

    invoke-virtual {v0, p3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 27
    iget p3, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->X11I:I

    invoke-virtual {v0, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 28
    iget-boolean p3, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->iX1O1:Z

    invoke-virtual {v1, p3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 29
    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 30
    invoke-virtual {v1, p2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 31
    iget p3, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->X11iII1O1:F

    invoke-virtual {v1, p3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 32
    iget p3, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->X100O:I

    invoke-virtual {v1, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 33
    iget-boolean p3, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->iX1O1:Z

    invoke-virtual {v2, p3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 34
    invoke-virtual {v2, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 35
    invoke-virtual {v2, p2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 36
    iget p3, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->X11iII1O1:F

    invoke-virtual {v2, p3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 37
    iget p3, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->XX1Oi:I

    invoke-virtual {v2, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 38
    iget-boolean p3, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->iX1O1:Z

    invoke-virtual {v3, p3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 39
    invoke-virtual {v3, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 40
    invoke-virtual {v3, p2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 41
    iget p3, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->X11iII1O1:F

    invoke-virtual {v3, p3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 42
    iget p3, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->OX110i:I

    invoke-virtual {v3, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 43
    iget-boolean p3, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->iX1O1:Z

    invoke-virtual {v4, p3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 44
    invoke-virtual {v4, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 45
    invoke-virtual {v4, p2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 46
    iget p3, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->X11iII1O1:F

    invoke-virtual {v4, p3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 47
    iget p3, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->OO:I

    invoke-virtual {v4, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 48
    iget-boolean p3, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->iX1O1:Z

    invoke-virtual {v5, p3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 49
    invoke-virtual {v5, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 50
    invoke-virtual {v5, p2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 51
    iget p1, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->X11iII1O1:F

    invoke-virtual {v5, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 52
    iget p1, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->XOX0O0:I

    invoke-virtual {v5, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 53
    invoke-virtual {p0}, Lcom/sma/smartv3/view/Goal4ProgressBar;->applySkin()V

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

    .line 54
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/view/Goal4ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

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

    iput-boolean v1, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->iX1O1:Z

    const/16 v1, 0xa

    invoke-virtual {p1, v1, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->X11I:I

    const/16 v1, 0x9

    invoke-virtual {p1, v1, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->X100O:I

    const/4 v1, 0x2

    invoke-virtual {p1, v1, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->XX1Oi:I

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->OX110i:I

    const/4 v0, 0x5

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->OO:I

    const/4 v0, 0x4

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->XOX0O0:I

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

    iget p2, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->iOiXi11II:F

    cmpl-float v0, p1, p2

    if-lez v0, :cond_1

    move p1, p2

    :cond_1
    const/4 p2, 0x0

    cmpg-float p2, p1, p2

    if-nez p2, :cond_2

    goto :goto_0

    :cond_2
    iput p1, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->X00XIX1:F

    :goto_0
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

    iget p2, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->XO0X10iO:F

    cmpl-float v0, p1, p2

    if-lez v0, :cond_1

    move p1, p2

    :cond_1
    const/4 p2, 0x0

    cmpg-float p2, p1, p2

    if-nez p2, :cond_2

    goto :goto_0

    :cond_2
    iput p1, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->Ii0X0X:F

    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public applySkin()V
    .locals 3

    invoke-super {p0}, Lskin/support/widget/SkinCompatView;->applySkin()V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    iget v0, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->XXiIiX10:I

    if-lez v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f081018

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iget v1, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->XXiIiX10:I

    const/4 v2, 0x1

    invoke-static {v0, v1, v1, v2}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->X00Xi1X:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f081016

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iget v1, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->XXiIiX10:I

    invoke-static {v0, v1, v1, v2}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->X1:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f081017

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iget v1, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->XXiIiX10:I

    invoke-static {v0, v1, v1, v2}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->IXOIIIO:Landroid/graphics/Bitmap;

    :cond_0
    return-void
.end method

.method public final getViewWidth()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->Ii0i:I

    return v0
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

    iget p2, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->i0X000X0O:F

    cmpl-float v0, p1, p2

    if-lez v0, :cond_1

    move p1, p2

    :cond_1
    const/4 p2, 0x0

    cmpg-float p2, p1, p2

    if-nez p2, :cond_2

    goto :goto_0

    :cond_2
    iput p1, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->i11I:F

    :goto_0
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

    iget-object v2, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->iXiiiO:Landroid/graphics/RectF;

    const/4 v5, 0x0

    iget-object v6, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->X0i1O:Landroid/graphics/Paint;

    const/high16 v3, 0x43870000    # 270.0f

    const/high16 v4, 0x43b40000    # 360.0f

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    move-object v7, v1

    iget p1, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->X00XIX1:F

    iget v0, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->iOiXi11II:F

    div-float/2addr p1, v0

    const/high16 v0, 0x43b40000    # 360.0f

    mul-float v10, p1, v0

    iput v10, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->I1:F

    iget-object v8, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->iXiiiO:Landroid/graphics/RectF;

    const/4 v11, 0x0

    iget-object v12, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->X1IX:Landroid/graphics/Paint;

    const/high16 v9, 0x43870000    # 270.0f

    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    iget-object v8, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->Ii1iii0:Landroid/graphics/RectF;

    iget-object v12, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->iXiX011:Landroid/graphics/Paint;

    const/high16 v10, 0x43b40000    # 360.0f

    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    iget p1, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->i11I:F

    iget v1, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->i0X000X0O:F

    div-float/2addr p1, v1

    mul-float v10, p1, v0

    iput v10, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->I1:F

    iget-object v8, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->Ii1iii0:Landroid/graphics/RectF;

    iget-object v12, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->iIXi1iiXI:Landroid/graphics/Paint;

    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    iget-object v8, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->iiiO:Landroid/graphics/RectF;

    iget-object v12, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->XXO:Landroid/graphics/Paint;

    const/high16 v10, 0x43b40000    # 360.0f

    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    iget p1, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->Ii0X0X:F

    iget v1, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->XO0X10iO:F

    div-float/2addr p1, v1

    mul-float v10, p1, v0

    iput v10, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->I1:F

    iget-object v8, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->iiiO:Landroid/graphics/RectF;

    iget-object v12, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->O001I:Landroid/graphics/Paint;

    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    iget-object p1, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->X00Xi1X:Landroid/graphics/Bitmap;

    const/high16 v0, 0x40000000    # 2.0f

    if-eqz p1, :cond_0

    iget-object v1, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->iXiiiO:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->top:F

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    sub-float/2addr v1, v2

    iget v2, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->Ii0i:I

    int-to-float v2, v2

    div-float/2addr v2, v0

    iget-object v3, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->IO0II0i:Landroid/graphics/Paint;

    invoke-virtual {v7, p1, v2, v1, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->IXOIIIO:Landroid/graphics/Bitmap;

    if-eqz p1, :cond_1

    iget-object v1, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->Ii1iii0:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->top:F

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    sub-float/2addr v1, v2

    iget v2, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->Ii0i:I

    int-to-float v2, v2

    div-float/2addr v2, v0

    iget-object v3, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->IO0II0i:Landroid/graphics/Paint;

    invoke-virtual {v7, p1, v2, v1, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->X1:Landroid/graphics/Bitmap;

    if-eqz p1, :cond_2

    iget-object v1, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->iiiO:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->top:F

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    sub-float/2addr v1, v2

    iget v2, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->Ii0i:I

    int-to-float v2, v2

    div-float/2addr v2, v0

    iget-object v0, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->IO0II0i:Landroid/graphics/Paint;

    invoke-virtual {v7, p1, v2, v1, v0}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    :cond_2
    return-void
.end method

.method public onMeasure(II)V
    .locals 2

    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    int-to-float p2, p1

    iget v0, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->XXX11i:F

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float/2addr v0, v1

    sub-float v0, p2, v0

    const/16 v1, 0x8

    int-to-float v1, v1

    div-float/2addr v0, v1

    iput v0, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->X11iII1O1:F

    add-float/2addr p2, v0

    float-to-int p2, p2

    invoke-virtual {p0, p2, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public onSizeChanged(IIII)V
    .locals 3

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    iput p1, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->Ii0i:I

    iget p3, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->X11iII1O1:F

    const/4 p4, 0x2

    int-to-float p4, p4

    div-float p4, p3, p4

    iget-object v0, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->X1IX:Landroid/graphics/Paint;

    invoke-virtual {v0, p3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object p3, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->X0i1O:Landroid/graphics/Paint;

    iget v0, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->X11iII1O1:F

    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object p3, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->iIXi1iiXI:Landroid/graphics/Paint;

    iget v0, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->X11iII1O1:F

    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object p3, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->iXiX011:Landroid/graphics/Paint;

    iget v0, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->X11iII1O1:F

    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object p3, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->O001I:Landroid/graphics/Paint;

    iget v0, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->X11iII1O1:F

    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object p3, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->XXO:Landroid/graphics/Paint;

    iget v0, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->X11iII1O1:F

    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object p3, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->iXiiiO:Landroid/graphics/RectF;

    sub-int v0, p1, p2

    int-to-float v0, v0

    add-float/2addr v0, p4

    int-to-float p1, p1

    sub-float/2addr p1, p4

    int-to-float p2, p2

    sub-float/2addr p2, p4

    invoke-virtual {p3, v0, p4, p1, p2}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object p1, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->Ii1iii0:Landroid/graphics/RectF;

    iget-object p2, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->iXiiiO:Landroid/graphics/RectF;

    iget p3, p2, Landroid/graphics/RectF;->left:F

    iget p4, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->X11iII1O1:F

    add-float/2addr p3, p4

    iget v0, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->XXX11i:F

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

    iget-object p1, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->iiiO:Landroid/graphics/RectF;

    iget-object p2, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->Ii1iii0:Landroid/graphics/RectF;

    iget p3, p2, Landroid/graphics/RectF;->left:F

    iget p4, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->X11iII1O1:F

    add-float/2addr p3, p4

    iget v0, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->XXX11i:F

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

    iget p1, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->X11iII1O1:F

    float-to-double p1, p1

    const-wide p3, 0x3feccccccccccccdL    # 0.9

    mul-double/2addr p1, p3

    double-to-int p1, p1

    iput p1, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->XXiIiX10:I

    invoke-virtual {p0}, Lcom/sma/smartv3/view/Goal4ProgressBar;->applySkin()V

    return-void
.end method

.method public final setViewWidth(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/view/Goal4ProgressBar;->Ii0i:I

    return-void
.end method
