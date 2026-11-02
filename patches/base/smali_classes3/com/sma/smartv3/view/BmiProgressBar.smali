.class public final Lcom/sma/smartv3/view/BmiProgressBar;
.super Lskin/support/widget/SkinCompatView;
.source "SourceFile"


# instance fields
.field public I1:Z

.field public IXOIIIO:F

.field public Ii0X0X:F

.field public Ii1iii0:F

.field public O001I:F

.field public OO:I

.field public OX110i:I

.field public X00XIX1:I

.field public final X00Xi1X:F

.field public final X0i1O:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public X1:Landroid/graphics/Paint$FontMetrics;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public X100O:F

.field public X11I:F

.field public final X11iII1O1:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public X1IX:F

.field public XO0X10iO:F

.field public XOX0O0:I

.field public XX1Oi:I

.field public XXO:F

.field public final XXX11i:F

.field public final XXiIiX10:F

.field public i0X000X0O:I

.field public i11I:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final iIXi1iiXI:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public iOiXi11II:I

.field public final iX1O1:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public iXiX011:I

.field public iXiiiO:F

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

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/view/BmiProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/view/BmiProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 8
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
    iput-boolean p3, p0, Lcom/sma/smartv3/view/BmiProgressBar;->I1:Z

    .line 5
    new-instance p3, Landroid/graphics/Paint;

    invoke-direct {p3}, Landroid/graphics/Paint;-><init>()V

    iput-object p3, p0, Lcom/sma/smartv3/view/BmiProgressBar;->iX1O1:Landroid/graphics/Paint;

    .line 6
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/view/BmiProgressBar;->X11iII1O1:Landroid/graphics/Paint;

    const/16 v1, 0xa

    .line 7
    invoke-virtual {p0, v1}, Lcom/sma/smartv3/view/BmiProgressBar;->XO0O10(I)F

    move-result v1

    iput v1, p0, Lcom/sma/smartv3/view/BmiProgressBar;->XXX11i:F

    const/4 v2, 0x6

    .line 8
    invoke-virtual {p0, v2}, Lcom/sma/smartv3/view/BmiProgressBar;->XIi00iiXO(I)F

    move-result v2

    iput v2, p0, Lcom/sma/smartv3/view/BmiProgressBar;->X1IX:F

    .line 9
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    iput-object v2, p0, Lcom/sma/smartv3/view/BmiProgressBar;->X0i1O:Landroid/graphics/Paint;

    .line 10
    new-instance v3, Landroid/graphics/Paint;

    invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V

    iput-object v3, p0, Lcom/sma/smartv3/view/BmiProgressBar;->iIXi1iiXI:Landroid/graphics/Paint;

    const/16 v4, 0xc

    .line 11
    invoke-virtual {p0, v4}, Lcom/sma/smartv3/view/BmiProgressBar;->XIi00iiXO(I)F

    move-result v5

    iget v6, p0, Lcom/sma/smartv3/view/BmiProgressBar;->X1IX:F

    add-float/2addr v5, v6

    iput v5, p0, Lcom/sma/smartv3/view/BmiProgressBar;->O001I:F

    const/4 v5, 0x2

    .line 12
    invoke-virtual {p0, v5}, Lcom/sma/smartv3/view/BmiProgressBar;->XIi00iiXO(I)F

    move-result v6

    iput v6, p0, Lcom/sma/smartv3/view/BmiProgressBar;->XXO:F

    .line 13
    iget v7, p0, Lcom/sma/smartv3/view/BmiProgressBar;->O001I:F

    add-float/2addr v7, v6

    iput v7, p0, Lcom/sma/smartv3/view/BmiProgressBar;->iXiiiO:F

    const/4 v6, 0x4

    .line 14
    invoke-virtual {p0, v6}, Lcom/sma/smartv3/view/BmiProgressBar;->XIi00iiXO(I)F

    move-result v6

    iget v7, p0, Lcom/sma/smartv3/view/BmiProgressBar;->XXO:F

    add-float/2addr v6, v7

    iput v6, p0, Lcom/sma/smartv3/view/BmiProgressBar;->Ii1iii0:F

    .line 15
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, p0, Lcom/sma/smartv3/view/BmiProgressBar;->i11I:Ljava/util/List;

    const/16 v6, 0xb

    .line 16
    invoke-virtual {p0, v6}, Lcom/sma/smartv3/view/BmiProgressBar;->XO0O10(I)F

    move-result v6

    iput v6, p0, Lcom/sma/smartv3/view/BmiProgressBar;->XXiIiX10:F

    .line 17
    iget v7, p0, Lcom/sma/smartv3/view/BmiProgressBar;->iXiiiO:F

    invoke-virtual {p0, v4}, Lcom/sma/smartv3/view/BmiProgressBar;->XIi00iiXO(I)F

    move-result v4

    add-float/2addr v7, v4

    iput v7, p0, Lcom/sma/smartv3/view/BmiProgressBar;->X00Xi1X:F

    .line 18
    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/view/BmiProgressBar;->iO(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 19
    iget-boolean p2, p0, Lcom/sma/smartv3/view/BmiProgressBar;->I1:Z

    invoke-virtual {p3, p2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 20
    iget-boolean p2, p0, Lcom/sma/smartv3/view/BmiProgressBar;->I1:Z

    invoke-virtual {v0, p2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 21
    sget-object p2, Lcom/android/mltcode/paycertificationapi/iiOI111I;->OXO1:Lcom/android/mltcode/paycertificationapi/iiOI111I;

    sget-object p3, Lcom/sma/smartv3/view/text/MyTypeface;->DIN_COND_BOLD:Lcom/sma/smartv3/view/text/MyTypeface;

    invoke-virtual {p2, p3, p1}, Lcom/android/mltcode/paycertificationapi/iiOI111I;->OXO1(Lcom/sma/smartv3/view/text/MyTypeface;Landroid/content/Context;)Landroid/graphics/Typeface;

    move-result-object p3

    invoke-virtual {v0, p3}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 22
    iget p3, p0, Lcom/sma/smartv3/view/BmiProgressBar;->XX1Oi:I

    invoke-virtual {v0, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 23
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 24
    iget-boolean p3, p0, Lcom/sma/smartv3/view/BmiProgressBar;->I1:Z

    invoke-virtual {v2, p3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 25
    sget-object p3, Lcom/sma/smartv3/view/text/MyTypeface;->PF_MEDIUM:Lcom/sma/smartv3/view/text/MyTypeface;

    invoke-virtual {p2, p3, p1}, Lcom/android/mltcode/paycertificationapi/iiOI111I;->OXO1(Lcom/sma/smartv3/view/text/MyTypeface;Landroid/content/Context;)Landroid/graphics/Typeface;

    move-result-object p1

    invoke-virtual {v2, p1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 26
    iget p1, p0, Lcom/sma/smartv3/view/BmiProgressBar;->XX1Oi:I

    invoke-virtual {v2, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 27
    invoke-virtual {v2, v6}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 28
    sget-object p1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v2, p1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 29
    invoke-virtual {v2}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object p1

    const-string p2, "getFontMetrics(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/view/BmiProgressBar;->X1:Landroid/graphics/Paint$FontMetrics;

    .line 30
    iget p2, p1, Landroid/graphics/Paint$FontMetrics;->bottom:F

    iget p1, p1, Landroid/graphics/Paint$FontMetrics;->top:F

    sub-float p1, p2, p1

    int-to-float p3, v5

    div-float/2addr p1, p3

    sub-float/2addr p1, p2

    iput p1, p0, Lcom/sma/smartv3/view/BmiProgressBar;->IXOIIIO:F

    .line 31
    iget-boolean p1, p0, Lcom/sma/smartv3/view/BmiProgressBar;->I1:Z

    invoke-virtual {v3, p1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 32
    invoke-virtual {p0}, Lcom/sma/smartv3/view/BmiProgressBar;->applySkin()V

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

    .line 33
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/view/BmiProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private final iO(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    sget-object v0, Lcom/sma/smartv3/R$styleable;->BmiProgressBar:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const-string p2, "obtainStyledAttributes(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x0

    const/4 v0, 0x1

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lcom/sma/smartv3/view/BmiProgressBar;->I1:Z

    const/4 v1, 0x6

    invoke-virtual {p1, v1, p2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/BmiProgressBar;->XX1Oi:I

    const/4 p2, -0x1

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/BmiProgressBar;->OX110i:I

    const/4 v0, 0x4

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/BmiProgressBar;->OO:I

    const/4 v0, 0x3

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/BmiProgressBar;->XOX0O0:I

    const/4 v0, 0x7

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/BmiProgressBar;->iOiXi11II:I

    const/4 v0, 0x5

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/BmiProgressBar;->X00XIX1:I

    const/4 v0, 0x2

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/BmiProgressBar;->i0X000X0O:I

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method


# virtual methods
.method public final OXO1()V
    .locals 5

    iget v0, p0, Lcom/sma/smartv3/view/BmiProgressBar;->Ii0X0X:F

    const v1, 0x41833333    # 16.4f

    cmpg-float v2, v0, v1

    const/4 v3, 0x2

    if-gtz v2, :cond_0

    iget v0, p0, Lcom/sma/smartv3/view/BmiProgressBar;->Ii1iii0:F

    int-to-float v1, v3

    div-float/2addr v0, v1

    iget v1, p0, Lcom/sma/smartv3/view/BmiProgressBar;->iXiX011:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    iput v0, p0, Lcom/sma/smartv3/view/BmiProgressBar;->XO0X10iO:F

    return-void

    :cond_0
    const v2, 0x41933333    # 18.4f

    cmpg-float v4, v0, v2

    if-gtz v4, :cond_1

    sub-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iget v1, p0, Lcom/sma/smartv3/view/BmiProgressBar;->iiiO:F

    mul-float/2addr v0, v1

    iget v1, p0, Lcom/sma/smartv3/view/BmiProgressBar;->iXiX011:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    iput v0, p0, Lcom/sma/smartv3/view/BmiProgressBar;->XO0X10iO:F

    return-void

    :cond_1
    const v1, 0x41c73333    # 24.9f

    cmpg-float v4, v0, v1

    if-gtz v4, :cond_2

    iget v1, p0, Lcom/sma/smartv3/view/BmiProgressBar;->iiiO:F

    sub-float/2addr v0, v2

    const/high16 v2, 0x40d00000    # 6.5f

    div-float/2addr v0, v2

    mul-float/2addr v0, v1

    add-float/2addr v1, v0

    iget v0, p0, Lcom/sma/smartv3/view/BmiProgressBar;->iXiX011:I

    int-to-float v0, v0

    div-float/2addr v1, v0

    iput v1, p0, Lcom/sma/smartv3/view/BmiProgressBar;->XO0X10iO:F

    return-void

    :cond_2
    const v2, 0x41ef3333    # 29.9f

    cmpg-float v4, v0, v2

    if-gtz v4, :cond_3

    iget v2, p0, Lcom/sma/smartv3/view/BmiProgressBar;->X11I:F

    sub-float/2addr v0, v1

    const/high16 v1, 0x40a00000    # 5.0f

    div-float/2addr v0, v1

    iget v1, p0, Lcom/sma/smartv3/view/BmiProgressBar;->iiiO:F

    mul-float/2addr v0, v1

    add-float/2addr v2, v0

    iget v0, p0, Lcom/sma/smartv3/view/BmiProgressBar;->iXiX011:I

    int-to-float v0, v0

    div-float/2addr v2, v0

    iput v2, p0, Lcom/sma/smartv3/view/BmiProgressBar;->XO0X10iO:F

    return-void

    :cond_3
    const v1, 0x420b999a    # 34.9f

    cmpg-float v1, v0, v1

    if-gtz v1, :cond_4

    iget v1, p0, Lcom/sma/smartv3/view/BmiProgressBar;->X100O:F

    sub-float/2addr v0, v2

    const v2, 0x40a00004    # 5.000002f

    div-float/2addr v0, v2

    iget v2, p0, Lcom/sma/smartv3/view/BmiProgressBar;->iiiO:F

    mul-float/2addr v0, v2

    add-float/2addr v1, v0

    iget v0, p0, Lcom/sma/smartv3/view/BmiProgressBar;->iXiX011:I

    int-to-float v0, v0

    div-float/2addr v1, v0

    iput v1, p0, Lcom/sma/smartv3/view/BmiProgressBar;->XO0X10iO:F

    return-void

    :cond_4
    iget v0, p0, Lcom/sma/smartv3/view/BmiProgressBar;->iXiX011:I

    int-to-float v1, v0

    iget v2, p0, Lcom/sma/smartv3/view/BmiProgressBar;->Ii1iii0:F

    int-to-float v3, v3

    div-float/2addr v2, v3

    sub-float/2addr v1, v2

    int-to-float v0, v0

    div-float/2addr v1, v0

    iput v1, p0, Lcom/sma/smartv3/view/BmiProgressBar;->XO0X10iO:F

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

.method public final XO0O10(I)F
    .locals 0

    int-to-float p1, p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/SizeUtils;->sp2px(F)I

    move-result p1

    int-to-float p1, p1

    return p1
.end method

.method public applySkin()V
    .locals 4

    invoke-super {p0}, Lskin/support/widget/SkinCompatView;->applySkin()V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/sma/smartv3/view/BmiProgressBar;->X11iII1O1:Landroid/graphics/Paint;

    iget v3, p0, Lcom/sma/smartv3/view/BmiProgressBar;->XX1Oi:I

    invoke-static {v0, v2, v3}, Lcom/android/mltcode/paycertificationapi/hl4;->OXO1(Landroid/content/Context;Landroid/graphics/Paint;I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/sma/smartv3/view/BmiProgressBar;->X0i1O:Landroid/graphics/Paint;

    iget v2, p0, Lcom/sma/smartv3/view/BmiProgressBar;->XX1Oi:I

    invoke-static {v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/hl4;->OXO1(Landroid/content/Context;Landroid/graphics/Paint;I)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 8
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "DrawAllocation"
        }
    .end annotation

    const-string v1, "canvas"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super/range {p0 .. p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    iget-object v1, p0, Lcom/sma/smartv3/view/BmiProgressBar;->i11I:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v6, 0x2

    const/4 v2, 0x1

    if-le v1, v2, :cond_0

    iget-object v1, p0, Lcom/sma/smartv3/view/BmiProgressBar;->i11I:Ljava/util/List;

    const/4 v3, 0x0

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget v3, p0, Lcom/sma/smartv3/view/BmiProgressBar;->iiiO:F

    const/16 v4, 0x14

    int-to-float v4, v4

    sub-float/2addr v3, v4

    iget v5, p0, Lcom/sma/smartv3/view/BmiProgressBar;->XXX11i:F

    iget-object v7, p0, Lcom/sma/smartv3/view/BmiProgressBar;->X11iII1O1:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v3, v5, v7}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    iget-object v1, p0, Lcom/sma/smartv3/view/BmiProgressBar;->i11I:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget v2, p0, Lcom/sma/smartv3/view/BmiProgressBar;->X11I:F

    sub-float/2addr v2, v4

    iget v3, p0, Lcom/sma/smartv3/view/BmiProgressBar;->XXX11i:F

    iget-object v5, p0, Lcom/sma/smartv3/view/BmiProgressBar;->X11iII1O1:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v2, v3, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    iget-object v1, p0, Lcom/sma/smartv3/view/BmiProgressBar;->i11I:Ljava/util/List;

    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget v2, p0, Lcom/sma/smartv3/view/BmiProgressBar;->X100O:F

    sub-float/2addr v2, v4

    iget v3, p0, Lcom/sma/smartv3/view/BmiProgressBar;->XXX11i:F

    iget-object v4, p0, Lcom/sma/smartv3/view/BmiProgressBar;->X11iII1O1:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    new-instance v1, Landroid/graphics/RectF;

    iget v2, p0, Lcom/sma/smartv3/view/BmiProgressBar;->X00Xi1X:F

    iget v3, p0, Lcom/sma/smartv3/view/BmiProgressBar;->iiiO:F

    iget v4, p0, Lcom/sma/smartv3/view/BmiProgressBar;->XXiIiX10:F

    add-float/2addr v4, v2

    const/4 v5, 0x0

    invoke-direct {v1, v5, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-virtual {v1}, Landroid/graphics/RectF;->centerY()F

    move-result v2

    iget v3, p0, Lcom/sma/smartv3/view/BmiProgressBar;->IXOIIIO:F

    add-float/2addr v2, v3

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f141335

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "getString(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/graphics/RectF;->centerX()F

    move-result v1

    iget-object v5, p0, Lcom/sma/smartv3/view/BmiProgressBar;->X0i1O:Landroid/graphics/Paint;

    invoke-virtual {p1, v3, v1, v2, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    new-instance v1, Landroid/graphics/RectF;

    iget v2, p0, Lcom/sma/smartv3/view/BmiProgressBar;->iiiO:F

    iget v3, p0, Lcom/sma/smartv3/view/BmiProgressBar;->X00Xi1X:F

    iget v5, p0, Lcom/sma/smartv3/view/BmiProgressBar;->X11I:F

    iget v7, p0, Lcom/sma/smartv3/view/BmiProgressBar;->XXiIiX10:F

    add-float/2addr v7, v3

    invoke-direct {v1, v2, v3, v5, v7}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-virtual {v1}, Landroid/graphics/RectF;->centerY()F

    move-result v2

    iget v3, p0, Lcom/sma/smartv3/view/BmiProgressBar;->IXOIIIO:F

    add-float/2addr v2, v3

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v5, 0x7f141021

    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/graphics/RectF;->centerX()F

    move-result v1

    iget-object v5, p0, Lcom/sma/smartv3/view/BmiProgressBar;->X0i1O:Landroid/graphics/Paint;

    invoke-virtual {p1, v3, v1, v2, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    new-instance v1, Landroid/graphics/RectF;

    iget v2, p0, Lcom/sma/smartv3/view/BmiProgressBar;->X11I:F

    iget v3, p0, Lcom/sma/smartv3/view/BmiProgressBar;->X00Xi1X:F

    iget v5, p0, Lcom/sma/smartv3/view/BmiProgressBar;->X100O:F

    iget v7, p0, Lcom/sma/smartv3/view/BmiProgressBar;->XXiIiX10:F

    add-float/2addr v7, v3

    invoke-direct {v1, v2, v3, v5, v7}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-virtual {v1}, Landroid/graphics/RectF;->centerY()F

    move-result v2

    iget v3, p0, Lcom/sma/smartv3/view/BmiProgressBar;->IXOIIIO:F

    add-float/2addr v2, v3

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v5, 0x7f141356

    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/graphics/RectF;->centerX()F

    move-result v1

    iget-object v5, p0, Lcom/sma/smartv3/view/BmiProgressBar;->X0i1O:Landroid/graphics/Paint;

    invoke-virtual {p1, v3, v1, v2, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    new-instance v1, Landroid/graphics/RectF;

    iget v2, p0, Lcom/sma/smartv3/view/BmiProgressBar;->X100O:F

    iget v3, p0, Lcom/sma/smartv3/view/BmiProgressBar;->X00Xi1X:F

    iget v5, p0, Lcom/sma/smartv3/view/BmiProgressBar;->iXiX011:I

    int-to-float v5, v5

    iget v7, p0, Lcom/sma/smartv3/view/BmiProgressBar;->XXiIiX10:F

    add-float/2addr v7, v3

    invoke-direct {v1, v2, v3, v5, v7}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-virtual {v1}, Landroid/graphics/RectF;->centerY()F

    move-result v2

    iget v3, p0, Lcom/sma/smartv3/view/BmiProgressBar;->IXOIIIO:F

    add-float/2addr v2, v3

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v5, 0x7f1402c9

    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/graphics/RectF;->centerX()F

    move-result v1

    iget-object v4, p0, Lcom/sma/smartv3/view/BmiProgressBar;->X0i1O:Landroid/graphics/Paint;

    invoke-virtual {p1, v3, v1, v2, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    :cond_0
    iget-object v1, p0, Lcom/sma/smartv3/view/BmiProgressBar;->iX1O1:Landroid/graphics/Paint;

    iget v2, p0, Lcom/sma/smartv3/view/BmiProgressBar;->XOX0O0:I

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    iget v2, p0, Lcom/sma/smartv3/view/BmiProgressBar;->O001I:F

    iget v3, p0, Lcom/sma/smartv3/view/BmiProgressBar;->iiiO:F

    iget v4, p0, Lcom/sma/smartv3/view/BmiProgressBar;->iXiiiO:F

    iget-object v5, p0, Lcom/sma/smartv3/view/BmiProgressBar;->iX1O1:Landroid/graphics/Paint;

    const/4 v1, 0x0

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    iget-object v0, p0, Lcom/sma/smartv3/view/BmiProgressBar;->iX1O1:Landroid/graphics/Paint;

    iget v1, p0, Lcom/sma/smartv3/view/BmiProgressBar;->iOiXi11II:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget v1, p0, Lcom/sma/smartv3/view/BmiProgressBar;->iiiO:F

    iget v2, p0, Lcom/sma/smartv3/view/BmiProgressBar;->O001I:F

    iget v3, p0, Lcom/sma/smartv3/view/BmiProgressBar;->X11I:F

    iget v4, p0, Lcom/sma/smartv3/view/BmiProgressBar;->iXiiiO:F

    iget-object v5, p0, Lcom/sma/smartv3/view/BmiProgressBar;->iX1O1:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    iget-object v0, p0, Lcom/sma/smartv3/view/BmiProgressBar;->iX1O1:Landroid/graphics/Paint;

    iget v1, p0, Lcom/sma/smartv3/view/BmiProgressBar;->X00XIX1:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget v1, p0, Lcom/sma/smartv3/view/BmiProgressBar;->X11I:F

    iget v2, p0, Lcom/sma/smartv3/view/BmiProgressBar;->O001I:F

    iget v3, p0, Lcom/sma/smartv3/view/BmiProgressBar;->X100O:F

    iget v4, p0, Lcom/sma/smartv3/view/BmiProgressBar;->iXiiiO:F

    iget-object v5, p0, Lcom/sma/smartv3/view/BmiProgressBar;->iX1O1:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    iget-object v0, p0, Lcom/sma/smartv3/view/BmiProgressBar;->iX1O1:Landroid/graphics/Paint;

    iget v1, p0, Lcom/sma/smartv3/view/BmiProgressBar;->i0X000X0O:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget v1, p0, Lcom/sma/smartv3/view/BmiProgressBar;->X100O:F

    iget v2, p0, Lcom/sma/smartv3/view/BmiProgressBar;->O001I:F

    iget v0, p0, Lcom/sma/smartv3/view/BmiProgressBar;->iXiX011:I

    int-to-float v3, v0

    iget v4, p0, Lcom/sma/smartv3/view/BmiProgressBar;->iXiiiO:F

    iget-object v5, p0, Lcom/sma/smartv3/view/BmiProgressBar;->iX1O1:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    iget-object v1, p0, Lcom/sma/smartv3/view/BmiProgressBar;->iIXi1iiXI:Landroid/graphics/Paint;

    iget v2, p0, Lcom/sma/smartv3/view/BmiProgressBar;->OO:I

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    iget v1, p0, Lcom/sma/smartv3/view/BmiProgressBar;->iXiX011:I

    int-to-float v1, v1

    iget v2, p0, Lcom/sma/smartv3/view/BmiProgressBar;->XO0X10iO:F

    mul-float/2addr v1, v2

    iget v2, p0, Lcom/sma/smartv3/view/BmiProgressBar;->O001I:F

    iget v3, p0, Lcom/sma/smartv3/view/BmiProgressBar;->iXiiiO:F

    sub-float/2addr v3, v2

    int-to-float v4, v6

    div-float/2addr v3, v4

    add-float/2addr v2, v3

    iget v3, p0, Lcom/sma/smartv3/view/BmiProgressBar;->Ii1iii0:F

    div-float/2addr v3, v4

    iget-object v5, p0, Lcom/sma/smartv3/view/BmiProgressBar;->iIXi1iiXI:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v2, v3, v5}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget-object v1, p0, Lcom/sma/smartv3/view/BmiProgressBar;->iIXi1iiXI:Landroid/graphics/Paint;

    iget v2, p0, Lcom/sma/smartv3/view/BmiProgressBar;->OX110i:I

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    iget v1, p0, Lcom/sma/smartv3/view/BmiProgressBar;->iXiX011:I

    int-to-float v1, v1

    iget v2, p0, Lcom/sma/smartv3/view/BmiProgressBar;->XO0X10iO:F

    mul-float/2addr v1, v2

    iget v2, p0, Lcom/sma/smartv3/view/BmiProgressBar;->O001I:F

    iget v3, p0, Lcom/sma/smartv3/view/BmiProgressBar;->iXiiiO:F

    sub-float/2addr v3, v2

    div-float/2addr v3, v4

    add-float/2addr v2, v3

    iget v3, p0, Lcom/sma/smartv3/view/BmiProgressBar;->Ii1iii0:F

    div-float/2addr v3, v4

    sub-float/2addr v3, v4

    iget-object v4, p0, Lcom/sma/smartv3/view/BmiProgressBar;->iIXi1iiXI:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    return-void
.end method

.method public onMeasure(II)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/view/BmiProgressBar;->iXiX011:I

    int-to-float p1, p1

    const/high16 p2, 0x3e800000    # 0.25f

    mul-float/2addr p1, p2

    iput p1, p0, Lcom/sma/smartv3/view/BmiProgressBar;->iiiO:F

    const/4 p2, 0x2

    int-to-float p2, p2

    mul-float/2addr p2, p1

    iput p2, p0, Lcom/sma/smartv3/view/BmiProgressBar;->X11I:F

    const/4 p2, 0x3

    int-to-float p2, p2

    mul-float/2addr p1, p2

    iput p1, p0, Lcom/sma/smartv3/view/BmiProgressBar;->X100O:F

    invoke-virtual {p0}, Lcom/sma/smartv3/view/BmiProgressBar;->OXO1()V

    return-void
.end method

.method public final setBmi(F)V
    .locals 1

    iput p1, p0, Lcom/sma/smartv3/view/BmiProgressBar;->Ii0X0X:F

    iget-object p1, p0, Lcom/sma/smartv3/view/BmiProgressBar;->i11I:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    iget-object p1, p0, Lcom/sma/smartv3/view/BmiProgressBar;->i11I:Ljava/util/List;

    const-string v0, "18.4"

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/sma/smartv3/view/BmiProgressBar;->i11I:Ljava/util/List;

    const-string v0, "24.9"

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/sma/smartv3/view/BmiProgressBar;->i11I:Ljava/util/List;

    const-string v0, "29.9"

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lcom/sma/smartv3/view/BmiProgressBar;->OXO1()V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method
