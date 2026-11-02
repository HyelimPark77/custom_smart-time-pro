.class public final Lcom/sma/smartv3/view/StepProgressBar;
.super Lskin/support/widget/SkinCompatView;
.source "SourceFile"


# instance fields
.field public I1:F

.field public IO0II0i:I

.field public IO0iXO0O:F

.field public final IX0IXOi:F

.field public IX1XiI:F

.field public IXI:I

.field public IXOIIIO:I

.field public Ii0X0X:I

.field public final Ii0i:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final Ii1iii0:Landroid/graphics/DashPathEffect;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final IiiXiI0I:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public O001I:F

.field public O0O:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public O0O0X0iOi:I

.field public OO:I

.field public OX110i:I

.field public Oi:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public X00XIX1:I

.field public X00Xi1X:F

.field public final X0i1O:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public X1:F

.field public X100O:F

.field public final X11I:Landroid/graphics/RectF;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public X11iII1O1:F

.field public X1IX:I

.field public final XO0X10iO:F

.field public XOIX:I

.field public XOO0XOOii:Landroid/graphics/Bitmap;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public XOX0O0:I

.field public XOXiX0:I

.field public XX00i10X:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public XX1Oi:I

.field public XXO:I

.field public XXX11i:Z

.field public final XXiIiX10:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final XXiO0i:J

.field public final i0X000X0O:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final i11I:F

.field public iIXi1iiXI:F

.field public iOI:Landroid/animation/ValueAnimator;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public iOiXi11II:I

.field public iX1O1:F

.field public iXi:F

.field public iXiX011:F

.field public iXiiiO:F

.field public iiIOiX:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final iiiO:Landroid/graphics/Paint;
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

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/view/StepProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/view/StepProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 12
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
    iput-boolean p3, p0, Lcom/sma/smartv3/view/StepProgressBar;->XXX11i:Z

    .line 5
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/view/StepProgressBar;->X0i1O:Landroid/graphics/Paint;

    const/16 v1, 0xa

    .line 6
    invoke-direct {p0, v1}, Lcom/sma/smartv3/view/StepProgressBar;->XIi00iiXO(I)F

    move-result v1

    iput v1, p0, Lcom/sma/smartv3/view/StepProgressBar;->iIXi1iiXI:F

    .line 7
    invoke-direct {p0, p3}, Lcom/sma/smartv3/view/StepProgressBar;->XIi00iiXO(I)F

    move-result v1

    iput v1, p0, Lcom/sma/smartv3/view/StepProgressBar;->iXiX011:F

    const/4 v1, 0x4

    .line 8
    invoke-direct {p0, v1}, Lcom/sma/smartv3/view/StepProgressBar;->XIi00iiXO(I)F

    move-result v2

    iput v2, p0, Lcom/sma/smartv3/view/StepProgressBar;->O001I:F

    .line 9
    iget v3, p0, Lcom/sma/smartv3/view/StepProgressBar;->iXiX011:F

    add-float/2addr v3, v2

    int-to-float v2, p3

    add-float/2addr v3, v2

    iput v3, p0, Lcom/sma/smartv3/view/StepProgressBar;->iXiiiO:F

    .line 10
    new-instance v2, Landroid/graphics/DashPathEffect;

    iget v3, p0, Lcom/sma/smartv3/view/StepProgressBar;->iXiX011:F

    iget v4, p0, Lcom/sma/smartv3/view/StepProgressBar;->O001I:F

    const/4 v5, 0x2

    new-array v6, v5, [F

    const/4 v7, 0x0

    aput v3, v6, v7

    aput v4, v6, p3

    iget p3, p0, Lcom/sma/smartv3/view/StepProgressBar;->iXiiiO:F

    invoke-direct {v2, v6, p3}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    iput-object v2, p0, Lcom/sma/smartv3/view/StepProgressBar;->Ii1iii0:Landroid/graphics/DashPathEffect;

    .line 11
    new-instance p3, Landroid/graphics/Paint;

    invoke-direct {p3}, Landroid/graphics/Paint;-><init>()V

    iput-object p3, p0, Lcom/sma/smartv3/view/StepProgressBar;->iiiO:Landroid/graphics/Paint;

    .line 12
    new-instance v3, Landroid/graphics/RectF;

    invoke-direct {v3}, Landroid/graphics/RectF;-><init>()V

    iput-object v3, p0, Lcom/sma/smartv3/view/StepProgressBar;->X11I:Landroid/graphics/RectF;

    .line 13
    iget v3, p0, Lcom/sma/smartv3/view/StepProgressBar;->iIXi1iiXI:F

    int-to-float v4, v5

    mul-float/2addr v3, v4

    invoke-direct {p0, v1}, Lcom/sma/smartv3/view/StepProgressBar;->XIi00iiXO(I)F

    move-result v1

    add-float/2addr v3, v1

    iput v3, p0, Lcom/sma/smartv3/view/StepProgressBar;->X100O:F

    .line 14
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    iput-object v1, p0, Lcom/sma/smartv3/view/StepProgressBar;->i0X000X0O:Landroid/graphics/Paint;

    .line 15
    iget v3, p0, Lcom/sma/smartv3/view/StepProgressBar;->X100O:F

    iget v6, p0, Lcom/sma/smartv3/view/StepProgressBar;->iIXi1iiXI:F

    add-float/2addr v3, v6

    const/16 v6, 0xc

    invoke-direct {p0, v6}, Lcom/sma/smartv3/view/StepProgressBar;->XIi00iiXO(I)F

    move-result v7

    add-float/2addr v3, v7

    iput v3, p0, Lcom/sma/smartv3/view/StepProgressBar;->i11I:F

    .line 16
    iget v7, p0, Lcom/sma/smartv3/view/StepProgressBar;->iIXi1iiXI:F

    mul-float/2addr v7, v4

    const/16 v8, 0x8

    invoke-direct {p0, v8}, Lcom/sma/smartv3/view/StepProgressBar;->XIi00iiXO(I)F

    move-result v8

    add-float/2addr v7, v8

    iput v7, p0, Lcom/sma/smartv3/view/StepProgressBar;->XO0X10iO:F

    .line 17
    new-instance v8, Landroid/graphics/Paint;

    invoke-direct {v8}, Landroid/graphics/Paint;-><init>()V

    iput-object v8, p0, Lcom/sma/smartv3/view/StepProgressBar;->XXiIiX10:Landroid/graphics/Paint;

    div-float v9, v7, v4

    add-float/2addr v3, v9

    .line 18
    invoke-direct {p0, v5}, Lcom/sma/smartv3/view/StepProgressBar;->XIi00iiXO(I)F

    move-result v5

    sub-float/2addr v3, v5

    iput v3, p0, Lcom/sma/smartv3/view/StepProgressBar;->X00Xi1X:F

    const/16 v5, 0xe

    .line 19
    invoke-direct {p0, v5}, Lcom/sma/smartv3/view/StepProgressBar;->XIi00iiXO(I)F

    move-result v9

    add-float/2addr v3, v9

    iput v3, p0, Lcom/sma/smartv3/view/StepProgressBar;->X1:F

    .line 20
    new-instance v3, Landroid/graphics/Paint;

    invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V

    iput-object v3, p0, Lcom/sma/smartv3/view/StepProgressBar;->Ii0i:Landroid/graphics/Paint;

    .line 21
    new-instance v9, Landroid/graphics/Paint;

    invoke-direct {v9}, Landroid/graphics/Paint;-><init>()V

    iput-object v9, p0, Lcom/sma/smartv3/view/StepProgressBar;->IiiXiI0I:Landroid/graphics/Paint;

    .line 22
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    const v11, 0x7f081391

    invoke-static {v10, v11}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v10

    const-string v11, "decodeResource(...)"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v10, p0, Lcom/sma/smartv3/view/StepProgressBar;->XOO0XOOii:Landroid/graphics/Bitmap;

    .line 23
    new-instance v10, Landroid/graphics/Paint;

    invoke-direct {v10}, Landroid/graphics/Paint;-><init>()V

    iput-object v10, p0, Lcom/sma/smartv3/view/StepProgressBar;->iiIOiX:Landroid/graphics/Paint;

    .line 24
    new-instance v10, Landroid/graphics/Paint;

    invoke-direct {v10}, Landroid/graphics/Paint;-><init>()V

    iput-object v10, p0, Lcom/sma/smartv3/view/StepProgressBar;->Oi:Landroid/graphics/Paint;

    .line 25
    const-string v10, "Steps"

    iput-object v10, p0, Lcom/sma/smartv3/view/StepProgressBar;->XX00i10X:Ljava/lang/String;

    .line 26
    new-instance v10, Landroid/animation/ValueAnimator;

    invoke-direct {v10}, Landroid/animation/ValueAnimator;-><init>()V

    iput-object v10, p0, Lcom/sma/smartv3/view/StepProgressBar;->iOI:Landroid/animation/ValueAnimator;

    const-wide/16 v10, 0x3e8

    .line 27
    iput-wide v10, p0, Lcom/sma/smartv3/view/StepProgressBar;->XXiO0i:J

    const/high16 v10, 0x42c80000    # 100.0f

    .line 28
    iput v10, p0, Lcom/sma/smartv3/view/StepProgressBar;->IX0IXOi:F

    const/high16 v10, 0x42b40000    # 90.0f

    .line 29
    iput v10, p0, Lcom/sma/smartv3/view/StepProgressBar;->iXi:F

    .line 30
    const-string v10, "0"

    iput-object v10, p0, Lcom/sma/smartv3/view/StepProgressBar;->O0O:Ljava/lang/String;

    .line 31
    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/view/StepProgressBar;->iO(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 32
    iget-boolean p2, p0, Lcom/sma/smartv3/view/StepProgressBar;->XXX11i:Z

    invoke-virtual {v0, p2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 33
    iget p2, p0, Lcom/sma/smartv3/view/StepProgressBar;->XXO:I

    invoke-virtual {v0, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 34
    sget-object p2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 35
    iget v10, p0, Lcom/sma/smartv3/view/StepProgressBar;->iIXi1iiXI:F

    invoke-virtual {v0, v10}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 36
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 37
    iget-boolean v0, p0, Lcom/sma/smartv3/view/StepProgressBar;->XXX11i:Z

    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 38
    invoke-virtual {p3, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 39
    sget-object v0, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 40
    iget v0, p0, Lcom/sma/smartv3/view/StepProgressBar;->iIXi1iiXI:F

    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 41
    iget-boolean p3, p0, Lcom/sma/smartv3/view/StepProgressBar;->XXX11i:Z

    invoke-virtual {v1, p3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 42
    invoke-virtual {v1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 43
    iget p2, p0, Lcom/sma/smartv3/view/StepProgressBar;->Ii0X0X:I

    invoke-virtual {v1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 44
    invoke-virtual {v1, v7}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 45
    iget-boolean p2, p0, Lcom/sma/smartv3/view/StepProgressBar;->XXX11i:Z

    invoke-virtual {v8, p2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 46
    iget p2, p0, Lcom/sma/smartv3/view/StepProgressBar;->IXOIIIO:I

    invoke-virtual {v8, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 47
    invoke-direct {p0, v6}, Lcom/sma/smartv3/view/StepProgressBar;->O00(I)F

    move-result p2

    invoke-virtual {v8, p2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 48
    sget-object p2, Lcom/android/mltcode/paycertificationapi/iiOI111I;->OXO1:Lcom/android/mltcode/paycertificationapi/iiOI111I;

    sget-object p3, Lcom/sma/smartv3/view/text/MyTypeface;->DIN_COND_BOLD:Lcom/sma/smartv3/view/text/MyTypeface;

    invoke-virtual {p2, p3, p1}, Lcom/android/mltcode/paycertificationapi/iiOI111I;->OXO1(Lcom/sma/smartv3/view/text/MyTypeface;Landroid/content/Context;)Landroid/graphics/Typeface;

    move-result-object v0

    invoke-virtual {v8, v0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 49
    iget-boolean v0, p0, Lcom/sma/smartv3/view/StepProgressBar;->XXX11i:Z

    invoke-virtual {v3, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 50
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v3, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 51
    iget v0, p0, Lcom/sma/smartv3/view/StepProgressBar;->IXI:I

    invoke-virtual {v3, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 52
    iget-boolean v0, p0, Lcom/sma/smartv3/view/StepProgressBar;->XXX11i:Z

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 53
    sget-object v0, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 54
    iget v0, p0, Lcom/sma/smartv3/view/StepProgressBar;->XOIX:I

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 55
    invoke-virtual {v9, v7}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 56
    iget-object v0, p0, Lcom/sma/smartv3/view/StepProgressBar;->iiIOiX:Landroid/graphics/Paint;

    iget-boolean v1, p0, Lcom/sma/smartv3/view/StepProgressBar;->XXX11i:Z

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 57
    iget-object v0, p0, Lcom/sma/smartv3/view/StepProgressBar;->iiIOiX:Landroid/graphics/Paint;

    iget v1, p0, Lcom/sma/smartv3/view/StepProgressBar;->XOXiX0:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 58
    iget-object v0, p0, Lcom/sma/smartv3/view/StepProgressBar;->iiIOiX:Landroid/graphics/Paint;

    const/16 v1, 0x20

    invoke-direct {p0, v1}, Lcom/sma/smartv3/view/StepProgressBar;->O00(I)F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 59
    iget-object v0, p0, Lcom/sma/smartv3/view/StepProgressBar;->iiIOiX:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 60
    iget-object v0, p0, Lcom/sma/smartv3/view/StepProgressBar;->iiIOiX:Landroid/graphics/Paint;

    invoke-virtual {p2, p3, p1}, Lcom/android/mltcode/paycertificationapi/iiOI111I;->OXO1(Lcom/sma/smartv3/view/text/MyTypeface;Landroid/content/Context;)Landroid/graphics/Typeface;

    move-result-object p3

    invoke-virtual {v0, p3}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 61
    iget-object p3, p0, Lcom/sma/smartv3/view/StepProgressBar;->Oi:Landroid/graphics/Paint;

    iget-boolean v0, p0, Lcom/sma/smartv3/view/StepProgressBar;->XXX11i:Z

    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 62
    iget-object p3, p0, Lcom/sma/smartv3/view/StepProgressBar;->Oi:Landroid/graphics/Paint;

    iget v0, p0, Lcom/sma/smartv3/view/StepProgressBar;->IO0II0i:I

    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 63
    iget-object p3, p0, Lcom/sma/smartv3/view/StepProgressBar;->Oi:Landroid/graphics/Paint;

    invoke-direct {p0, v5}, Lcom/sma/smartv3/view/StepProgressBar;->O00(I)F

    move-result v0

    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 64
    iget-object p3, p0, Lcom/sma/smartv3/view/StepProgressBar;->Oi:Landroid/graphics/Paint;

    sget-object v0, Lcom/sma/smartv3/view/text/MyTypeface;->PF_REGULAR:Lcom/sma/smartv3/view/text/MyTypeface;

    invoke-virtual {p2, v0, p1}, Lcom/android/mltcode/paycertificationapi/iiOI111I;->OXO1(Lcom/sma/smartv3/view/text/MyTypeface;Landroid/content/Context;)Landroid/graphics/Typeface;

    move-result-object p1

    invoke-virtual {p3, p1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 65
    iget-object p1, p0, Lcom/sma/smartv3/view/StepProgressBar;->Oi:Landroid/graphics/Paint;

    iget-object p2, p0, Lcom/sma/smartv3/view/StepProgressBar;->XX00i10X:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result p1

    div-float/2addr p1, v4

    iput p1, p0, Lcom/sma/smartv3/view/StepProgressBar;->IO0iXO0O:F

    .line 66
    invoke-virtual {p0}, Lcom/sma/smartv3/view/StepProgressBar;->applySkin()V

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

    .line 67
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/view/StepProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

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

    iput-object p1, p0, Lcom/sma/smartv3/view/StepProgressBar;->iOI:Landroid/animation/ValueAnimator;

    invoke-virtual {p1, p3, p4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    iget-object p1, p0, Lcom/sma/smartv3/view/StepProgressBar;->iOI:Landroid/animation/ValueAnimator;

    new-instance p2, Lcom/android/mltcode/paycertificationapi/la5;

    invoke-direct {p2, p0}, Lcom/android/mltcode/paycertificationapi/la5;-><init>(Lcom/sma/smartv3/view/StepProgressBar;)V

    invoke-virtual {p1, p2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    iget-object p1, p0, Lcom/sma/smartv3/view/StepProgressBar;->iOI:Landroid/animation/ValueAnimator;

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

.method public static synthetic OXO1(Lcom/sma/smartv3/view/StepProgressBar;Landroid/animation/ValueAnimator;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/view/StepProgressBar;->XOO0ii0(Lcom/sma/smartv3/view/StepProgressBar;Landroid/animation/ValueAnimator;)V

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

.method public static final XOO0ii0(Lcom/sma/smartv3/view/StepProgressBar;Landroid/animation/ValueAnimator;)V
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

    iput p1, p0, Lcom/sma/smartv3/view/StepProgressBar;->IX1XiI:F

    iget v0, p0, Lcom/sma/smartv3/view/StepProgressBar;->IX0IXOi:F

    mul-float/2addr p1, v0

    iput p1, p0, Lcom/sma/smartv3/view/StepProgressBar;->iXi:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method private final iO(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    sget-object v0, Lcom/sma/smartv3/R$styleable;->StepProgressBar:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const-string p2, "obtainStyledAttributes(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x0

    const/4 v0, 0x1

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lcom/sma/smartv3/view/StepProgressBar;->XXX11i:Z

    const/16 v1, 0x9

    invoke-virtual {p1, v1, p2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    iput v1, p0, Lcom/sma/smartv3/view/StepProgressBar;->XX1Oi:I

    const/4 v1, 0x7

    invoke-virtual {p1, v1, p2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    iput v1, p0, Lcom/sma/smartv3/view/StepProgressBar;->iOiXi11II:I

    const/16 v1, 0x8

    invoke-virtual {p1, v1, p2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    iput v1, p0, Lcom/sma/smartv3/view/StepProgressBar;->OO:I

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/StepProgressBar;->XXO:I

    const/4 v0, 0x3

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/StepProgressBar;->Ii0X0X:I

    const/4 v0, 0x6

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/StepProgressBar;->XOIX:I

    const/4 v0, 0x4

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/StepProgressBar;->IXOIIIO:I

    const/4 v1, 0x5

    invoke-virtual {p1, v1, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/StepProgressBar;->IO0II0i:I

    const/4 v0, 0x2

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/StepProgressBar;->IXI:I

    const/16 v0, 0xb

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/view/StepProgressBar;->XX00i10X:Ljava/lang/String;

    const/16 v0, 0xa

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/StepProgressBar;->XOXiX0:I

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method


# virtual methods
.method public final XO0O10(II)V
    .locals 3

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/view/StepProgressBar;->O0O:Ljava/lang/String;

    if-nez p2, :cond_0

    const/16 p2, 0x2710

    :cond_0
    int-to-float p1, p1

    int-to-float p2, p2

    div-float/2addr p1, p2

    const/16 p2, 0x64

    int-to-float p2, p2

    mul-float/2addr p1, p2

    iget p2, p0, Lcom/sma/smartv3/view/StepProgressBar;->IX0IXOi:F

    cmpl-float v0, p1, p2

    if-lez v0, :cond_1

    move p1, p2

    :cond_1
    iget v0, p0, Lcom/sma/smartv3/view/StepProgressBar;->IX1XiI:F

    div-float/2addr p1, p2

    iget-wide v1, p0, Lcom/sma/smartv3/view/StepProgressBar;->XXiO0i:J

    invoke-direct {p0, v0, p1, v1, v2}, Lcom/sma/smartv3/view/StepProgressBar;->IiI10X(FFJ)V

    return-void
.end method

.method public applySkin()V
    .locals 6

    invoke-super {p0}, Lskin/support/widget/SkinCompatView;->applySkin()V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/sma/smartv3/view/StepProgressBar;->X0i1O:Landroid/graphics/Paint;

    iget v3, p0, Lcom/sma/smartv3/view/StepProgressBar;->XXO:I

    invoke-static {v0, v2, v3}, Lcom/android/mltcode/paycertificationapi/hl4;->OXO1(Landroid/content/Context;Landroid/graphics/Paint;I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/sma/smartv3/view/StepProgressBar;->i0X000X0O:Landroid/graphics/Paint;

    iget v3, p0, Lcom/sma/smartv3/view/StepProgressBar;->Ii0X0X:I

    invoke-static {v0, v2, v3}, Lcom/android/mltcode/paycertificationapi/hl4;->OXO1(Landroid/content/Context;Landroid/graphics/Paint;I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/sma/smartv3/view/StepProgressBar;->IiiXiI0I:Landroid/graphics/Paint;

    iget v3, p0, Lcom/sma/smartv3/view/StepProgressBar;->XOIX:I

    invoke-static {v0, v2, v3}, Lcom/android/mltcode/paycertificationapi/hl4;->OXO1(Landroid/content/Context;Landroid/graphics/Paint;I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/sma/smartv3/view/StepProgressBar;->XXiIiX10:Landroid/graphics/Paint;

    iget v3, p0, Lcom/sma/smartv3/view/StepProgressBar;->IXOIIIO:I

    invoke-static {v0, v2, v3}, Lcom/android/mltcode/paycertificationapi/hl4;->OXO1(Landroid/content/Context;Landroid/graphics/Paint;I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/sma/smartv3/view/StepProgressBar;->Oi:Landroid/graphics/Paint;

    iget v3, p0, Lcom/sma/smartv3/view/StepProgressBar;->IO0II0i:I

    invoke-static {v0, v2, v3}, Lcom/android/mltcode/paycertificationapi/hl4;->OXO1(Landroid/content/Context;Landroid/graphics/Paint;I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/sma/smartv3/view/StepProgressBar;->Ii0i:Landroid/graphics/Paint;

    iget v3, p0, Lcom/sma/smartv3/view/StepProgressBar;->IXI:I

    invoke-static {v0, v2, v3}, Lcom/android/mltcode/paycertificationapi/hl4;->OXO1(Landroid/content/Context;Landroid/graphics/Paint;I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/sma/smartv3/view/StepProgressBar;->iiIOiX:Landroid/graphics/Paint;

    iget v3, p0, Lcom/sma/smartv3/view/StepProgressBar;->XOXiX0:I

    invoke-static {v0, v2, v3}, Lcom/android/mltcode/paycertificationapi/hl4;->OXO1(Landroid/content/Context;Landroid/graphics/Paint;I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget v2, p0, Lcom/sma/smartv3/view/StepProgressBar;->XX1Oi:I

    invoke-static {v0, v2}, Lcom/android/mltcode/paycertificationapi/hl4;->XIi00iiXO(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/StepProgressBar;->OX110i:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget v2, p0, Lcom/sma/smartv3/view/StepProgressBar;->iOiXi11II:I

    invoke-static {v0, v2}, Lcom/android/mltcode/paycertificationapi/hl4;->XIi00iiXO(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/StepProgressBar;->X00XIX1:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget v1, p0, Lcom/sma/smartv3/view/StepProgressBar;->OO:I

    invoke-static {v0, v1}, Lcom/android/mltcode/paycertificationapi/hl4;->XIi00iiXO(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/StepProgressBar;->XOX0O0:I

    iget-object v0, p0, Lcom/sma/smartv3/view/StepProgressBar;->iiiO:Landroid/graphics/Paint;

    new-instance v1, Landroid/graphics/SweepGradient;

    iget v2, p0, Lcom/sma/smartv3/view/StepProgressBar;->X1IX:I

    int-to-float v2, v2

    const/4 v3, 0x2

    int-to-float v3, v3

    div-float/2addr v2, v3

    iget v3, p0, Lcom/sma/smartv3/view/StepProgressBar;->OX110i:I

    iget v4, p0, Lcom/sma/smartv3/view/StepProgressBar;->XOX0O0:I

    iget v5, p0, Lcom/sma/smartv3/view/StepProgressBar;->X00XIX1:I

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
    .locals 8
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    iget v0, p0, Lcom/sma/smartv3/view/StepProgressBar;->I1:F

    iget v1, p0, Lcom/sma/smartv3/view/StepProgressBar;->iX1O1:F

    iget-object v2, p0, Lcom/sma/smartv3/view/StepProgressBar;->X0i1O:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v0, v1, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget v0, p0, Lcom/sma/smartv3/view/StepProgressBar;->iXi:F

    iget v1, p0, Lcom/sma/smartv3/view/StepProgressBar;->IX0IXOi:F

    div-float/2addr v0, v1

    const/high16 v1, 0x43b40000    # 360.0f

    mul-float v5, v0, v1

    iput v5, p0, Lcom/sma/smartv3/view/StepProgressBar;->X11iII1O1:F

    iget-object v3, p0, Lcom/sma/smartv3/view/StepProgressBar;->X11I:Landroid/graphics/RectF;

    const/4 v6, 0x0

    iget-object v7, p0, Lcom/sma/smartv3/view/StepProgressBar;->iiiO:Landroid/graphics/Paint;

    const/high16 v4, 0x43870000    # 270.0f

    move-object v2, p1

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    iget p1, p0, Lcom/sma/smartv3/view/StepProgressBar;->I1:F

    iget v0, p0, Lcom/sma/smartv3/view/StepProgressBar;->iX1O1:F

    iget v1, p0, Lcom/sma/smartv3/view/StepProgressBar;->i11I:F

    sub-float/2addr v0, v1

    iget-object v1, p0, Lcom/sma/smartv3/view/StepProgressBar;->i0X000X0O:Landroid/graphics/Paint;

    invoke-virtual {v2, p1, p1, v0, v1}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget p1, p0, Lcom/sma/smartv3/view/StepProgressBar;->I1:F

    const/4 v0, 0x6

    invoke-direct {p0, v0}, Lcom/sma/smartv3/view/StepProgressBar;->XIi00iiXO(I)F

    move-result v1

    sub-float/2addr p1, v1

    iget v1, p0, Lcom/sma/smartv3/view/StepProgressBar;->X00Xi1X:F

    iget-object v3, p0, Lcom/sma/smartv3/view/StepProgressBar;->XXiIiX10:Landroid/graphics/Paint;

    const-string v4, "0%"

    invoke-virtual {v2, v4, p1, v1, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    iget p1, p0, Lcom/sma/smartv3/view/StepProgressBar;->O0O0X0iOi:I

    int-to-float p1, p1

    iget v1, p0, Lcom/sma/smartv3/view/StepProgressBar;->X00Xi1X:F

    sub-float/2addr p1, v1

    const/4 v1, 0x4

    invoke-direct {p0, v1}, Lcom/sma/smartv3/view/StepProgressBar;->XIi00iiXO(I)F

    move-result v1

    sub-float/2addr p1, v1

    iget v1, p0, Lcom/sma/smartv3/view/StepProgressBar;->I1:F

    iget-object v3, p0, Lcom/sma/smartv3/view/StepProgressBar;->XXiIiX10:Landroid/graphics/Paint;

    const-string v4, "25%"

    invoke-virtual {v2, v4, p1, v1, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    iget p1, p0, Lcom/sma/smartv3/view/StepProgressBar;->I1:F

    const/16 v1, 0x8

    invoke-direct {p0, v1}, Lcom/sma/smartv3/view/StepProgressBar;->XIi00iiXO(I)F

    move-result v3

    sub-float/2addr p1, v3

    iget v3, p0, Lcom/sma/smartv3/view/StepProgressBar;->O0O0X0iOi:I

    int-to-float v3, v3

    iget v4, p0, Lcom/sma/smartv3/view/StepProgressBar;->X00Xi1X:F

    sub-float/2addr v3, v4

    invoke-direct {p0, v1}, Lcom/sma/smartv3/view/StepProgressBar;->XIi00iiXO(I)F

    move-result v4

    add-float/2addr v3, v4

    iget-object v4, p0, Lcom/sma/smartv3/view/StepProgressBar;->XXiIiX10:Landroid/graphics/Paint;

    const-string v5, "50%"

    invoke-virtual {v2, v5, p1, v3, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    iget p1, p0, Lcom/sma/smartv3/view/StepProgressBar;->X00Xi1X:F

    const/16 v3, 0x12

    invoke-direct {p0, v3}, Lcom/sma/smartv3/view/StepProgressBar;->XIi00iiXO(I)F

    move-result v3

    sub-float/2addr p1, v3

    iget v3, p0, Lcom/sma/smartv3/view/StepProgressBar;->I1:F

    iget-object v4, p0, Lcom/sma/smartv3/view/StepProgressBar;->XXiIiX10:Landroid/graphics/Paint;

    const-string v5, "75%"

    invoke-virtual {v2, v5, p1, v3, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    iget p1, p0, Lcom/sma/smartv3/view/StepProgressBar;->O0O0X0iOi:I

    int-to-float p1, p1

    iget v3, p0, Lcom/sma/smartv3/view/StepProgressBar;->X1:F

    sub-float/2addr p1, v3

    iget-object v4, p0, Lcom/sma/smartv3/view/StepProgressBar;->Ii0i:Landroid/graphics/Paint;

    const/high16 v5, 0x41200000    # 10.0f

    invoke-virtual {v2, p1, v3, v5, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget p1, p0, Lcom/sma/smartv3/view/StepProgressBar;->O0O0X0iOi:I

    int-to-float v3, p1

    iget v4, p0, Lcom/sma/smartv3/view/StepProgressBar;->X1:F

    sub-float/2addr v3, v4

    int-to-float p1, p1

    sub-float/2addr p1, v4

    iget-object v4, p0, Lcom/sma/smartv3/view/StepProgressBar;->Ii0i:Landroid/graphics/Paint;

    invoke-virtual {v2, v3, p1, v5, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget p1, p0, Lcom/sma/smartv3/view/StepProgressBar;->X1:F

    iget v3, p0, Lcom/sma/smartv3/view/StepProgressBar;->O0O0X0iOi:I

    int-to-float v3, v3

    sub-float/2addr v3, p1

    iget-object v4, p0, Lcom/sma/smartv3/view/StepProgressBar;->Ii0i:Landroid/graphics/Paint;

    invoke-virtual {v2, p1, v3, v5, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget p1, p0, Lcom/sma/smartv3/view/StepProgressBar;->X1:F

    iget-object v3, p0, Lcom/sma/smartv3/view/StepProgressBar;->Ii0i:Landroid/graphics/Paint;

    invoke-virtual {v2, p1, p1, v5, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget p1, p0, Lcom/sma/smartv3/view/StepProgressBar;->I1:F

    iget v3, p0, Lcom/sma/smartv3/view/StepProgressBar;->iX1O1:F

    iget v4, p0, Lcom/sma/smartv3/view/StepProgressBar;->i11I:F

    sub-float/2addr v3, v4

    iget v4, p0, Lcom/sma/smartv3/view/StepProgressBar;->XO0X10iO:F

    sub-float/2addr v3, v4

    const/4 v4, 0x1

    invoke-direct {p0, v4}, Lcom/sma/smartv3/view/StepProgressBar;->XIi00iiXO(I)F

    move-result v4

    add-float/2addr v3, v4

    iget-object v4, p0, Lcom/sma/smartv3/view/StepProgressBar;->IiiXiI0I:Landroid/graphics/Paint;

    invoke-virtual {v2, p1, p1, v3, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget-object p1, p0, Lcom/sma/smartv3/view/StepProgressBar;->XOO0XOOii:Landroid/graphics/Bitmap;

    iget v3, p0, Lcom/sma/smartv3/view/StepProgressBar;->I1:F

    const/16 v4, 0xc

    invoke-direct {p0, v4}, Lcom/sma/smartv3/view/StepProgressBar;->XIi00iiXO(I)F

    move-result v4

    sub-float/2addr v3, v4

    iget v4, p0, Lcom/sma/smartv3/view/StepProgressBar;->I1:F

    const/4 v5, 0x2

    int-to-float v5, v5

    div-float/2addr v4, v5

    const/16 v5, 0xa

    invoke-direct {p0, v5}, Lcom/sma/smartv3/view/StepProgressBar;->XIi00iiXO(I)F

    move-result v5

    add-float/2addr v4, v5

    iget-object v5, p0, Lcom/sma/smartv3/view/StepProgressBar;->IiiXiI0I:Landroid/graphics/Paint;

    invoke-virtual {v2, p1, v3, v4, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    iget-object p1, p0, Lcom/sma/smartv3/view/StepProgressBar;->O0O:Ljava/lang/String;

    iget v3, p0, Lcom/sma/smartv3/view/StepProgressBar;->I1:F

    invoke-direct {p0, v1}, Lcom/sma/smartv3/view/StepProgressBar;->XIi00iiXO(I)F

    move-result v1

    add-float/2addr v1, v3

    iget-object v4, p0, Lcom/sma/smartv3/view/StepProgressBar;->iiIOiX:Landroid/graphics/Paint;

    invoke-virtual {v2, p1, v3, v1, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    iget-object p1, p0, Lcom/sma/smartv3/view/StepProgressBar;->XX00i10X:Ljava/lang/String;

    iget v1, p0, Lcom/sma/smartv3/view/StepProgressBar;->I1:F

    iget v3, p0, Lcom/sma/smartv3/view/StepProgressBar;->IO0iXO0O:F

    sub-float/2addr v1, v3

    iget v3, p0, Lcom/sma/smartv3/view/StepProgressBar;->O0O0X0iOi:I

    int-to-float v3, v3

    iget v4, p0, Lcom/sma/smartv3/view/StepProgressBar;->i11I:F

    sub-float/2addr v3, v4

    iget v4, p0, Lcom/sma/smartv3/view/StepProgressBar;->XO0X10iO:F

    sub-float/2addr v3, v4

    invoke-direct {p0, v0}, Lcom/sma/smartv3/view/StepProgressBar;->XIi00iiXO(I)F

    move-result v0

    sub-float/2addr v3, v0

    iget-object v0, p0, Lcom/sma/smartv3/view/StepProgressBar;->Oi:Landroid/graphics/Paint;

    invoke-virtual {v2, p1, v1, v3, v0}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

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

    iput p1, p0, Lcom/sma/smartv3/view/StepProgressBar;->O0O0X0iOi:I

    invoke-virtual {p0, p1, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public onSizeChanged(IIII)V
    .locals 1

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    iput p1, p0, Lcom/sma/smartv3/view/StepProgressBar;->X1IX:I

    iget p1, p0, Lcom/sma/smartv3/view/StepProgressBar;->O0O0X0iOi:I

    int-to-float p1, p1

    const/high16 p2, 0x40000000    # 2.0f

    div-float/2addr p1, p2

    iput p1, p0, Lcom/sma/smartv3/view/StepProgressBar;->I1:F

    iget p2, p0, Lcom/sma/smartv3/view/StepProgressBar;->iIXi1iiXI:F

    const/4 p3, 0x2

    int-to-float p3, p3

    div-float/2addr p2, p3

    sub-float/2addr p1, p2

    iput p1, p0, Lcom/sma/smartv3/view/StepProgressBar;->iX1O1:F

    iget-object p1, p0, Lcom/sma/smartv3/view/StepProgressBar;->X11I:Landroid/graphics/RectF;

    iget p2, p0, Lcom/sma/smartv3/view/StepProgressBar;->X100O:F

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p3

    int-to-float p3, p3

    iget p4, p0, Lcom/sma/smartv3/view/StepProgressBar;->X100O:F

    sub-float/2addr p3, p4

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p4

    int-to-float p4, p4

    iget v0, p0, Lcom/sma/smartv3/view/StepProgressBar;->X100O:F

    sub-float/2addr p4, v0

    invoke-virtual {p1, p2, p2, p3, p4}, Landroid/graphics/RectF;->set(FFFF)V

    invoke-virtual {p0}, Lcom/sma/smartv3/view/StepProgressBar;->applySkin()V

    return-void
.end method
