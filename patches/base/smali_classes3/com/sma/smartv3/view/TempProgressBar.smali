.class public final Lcom/sma/smartv3/view/TempProgressBar;
.super Lskin/support/widget/SkinCompatView;
.source "SourceFile"


# instance fields
.field public final I1:[Ljava/lang/Float;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public Ii1iii0:F

.field public O001I:I

.field public OO:I

.field public OX110i:I

.field public X00XIX1:I

.field public X0i1O:F

.field public X100O:F

.field public X11I:F

.field public final X11iII1O1:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final X1IX:F

.field public XO0X10iO:F

.field public XOX0O0:I

.field public XX1Oi:F

.field public XXO:F

.field public final XXX11i:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

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

.field public iX1O1:Z

.field public final iXiX011:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

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

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/view/TempProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/view/TempProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    .line 4
    sget-object p3, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {p3}, Lcom/android/mltcode/paycertificationapi/q62;->XI1OX0IO()Z

    move-result p3

    const/4 v0, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x4

    const/4 v4, 0x1

    if-eqz p3, :cond_0

    .line 5
    new-array p3, v3, [Ljava/lang/Float;

    const/high16 v5, 0x41c00000    # 24.0f

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    aput-object v5, p3, v2

    const/high16 v2, 0x41e00000    # 28.0f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    aput-object v2, p3, v4

    const/high16 v2, 0x42080000    # 34.0f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    aput-object v2, p3, v1

    const/high16 v1, 0x42140000    # 37.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    aput-object v1, p3, v0

    goto :goto_0

    .line 6
    :cond_0
    new-array p3, v3, [Ljava/lang/Float;

    const/high16 v5, 0x420c0000    # 35.0f

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    aput-object v5, p3, v2

    const/high16 v2, 0x42100000    # 36.0f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    aput-object v2, p3, v4

    const v2, 0x4215999a    # 37.4f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    aput-object v2, p3, v1

    const/high16 v1, 0x42180000    # 38.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    aput-object v1, p3, v0

    .line 7
    :goto_0
    iput-object p3, p0, Lcom/sma/smartv3/view/TempProgressBar;->I1:[Ljava/lang/Float;

    .line 8
    iput-boolean v4, p0, Lcom/sma/smartv3/view/TempProgressBar;->iX1O1:Z

    .line 9
    new-instance p3, Landroid/graphics/Paint;

    invoke-direct {p3}, Landroid/graphics/Paint;-><init>()V

    iput-object p3, p0, Lcom/sma/smartv3/view/TempProgressBar;->X11iII1O1:Landroid/graphics/Paint;

    .line 10
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/view/TempProgressBar;->XXX11i:Landroid/graphics/Paint;

    const/16 v1, 0xa

    .line 11
    invoke-direct {p0, v1}, Lcom/sma/smartv3/view/TempProgressBar;->XO0O10(I)F

    move-result v1

    iput v1, p0, Lcom/sma/smartv3/view/TempProgressBar;->X1IX:F

    const/4 v2, 0x6

    .line 12
    invoke-direct {p0, v2}, Lcom/sma/smartv3/view/TempProgressBar;->OXO1(I)F

    move-result v2

    iput v2, p0, Lcom/sma/smartv3/view/TempProgressBar;->X0i1O:F

    .line 13
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    iput-object v2, p0, Lcom/sma/smartv3/view/TempProgressBar;->iIXi1iiXI:Landroid/graphics/Paint;

    .line 14
    new-instance v5, Landroid/graphics/Paint;

    invoke-direct {v5}, Landroid/graphics/Paint;-><init>()V

    iput-object v5, p0, Lcom/sma/smartv3/view/TempProgressBar;->iXiX011:Landroid/graphics/Paint;

    const/16 v6, 0xc

    .line 15
    invoke-direct {p0, v6}, Lcom/sma/smartv3/view/TempProgressBar;->OXO1(I)F

    move-result v6

    iget v7, p0, Lcom/sma/smartv3/view/TempProgressBar;->X0i1O:F

    add-float/2addr v6, v7

    iput v6, p0, Lcom/sma/smartv3/view/TempProgressBar;->XXO:F

    .line 16
    invoke-direct {p0, v4}, Lcom/sma/smartv3/view/TempProgressBar;->OXO1(I)F

    move-result v4

    iput v4, p0, Lcom/sma/smartv3/view/TempProgressBar;->iXiiiO:F

    .line 17
    iget v4, p0, Lcom/sma/smartv3/view/TempProgressBar;->XXO:F

    iput v4, p0, Lcom/sma/smartv3/view/TempProgressBar;->Ii1iii0:F

    .line 18
    invoke-direct {p0, v3}, Lcom/sma/smartv3/view/TempProgressBar;->OXO1(I)F

    move-result v3

    iput v3, p0, Lcom/sma/smartv3/view/TempProgressBar;->iiiO:F

    .line 19
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, p0, Lcom/sma/smartv3/view/TempProgressBar;->i11I:Ljava/util/List;

    .line 20
    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/view/TempProgressBar;->XIi00iiXO(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 21
    iget-boolean p2, p0, Lcom/sma/smartv3/view/TempProgressBar;->iX1O1:Z

    invoke-virtual {p3, p2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 22
    iget-boolean p2, p0, Lcom/sma/smartv3/view/TempProgressBar;->iX1O1:Z

    invoke-virtual {v0, p2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 23
    sget-object p2, Lcom/android/mltcode/paycertificationapi/iiOI111I;->OXO1:Lcom/android/mltcode/paycertificationapi/iiOI111I;

    sget-object p3, Lcom/sma/smartv3/view/text/MyTypeface;->DIN_COND_BOLD:Lcom/sma/smartv3/view/text/MyTypeface;

    invoke-virtual {p2, p3, p1}, Lcom/android/mltcode/paycertificationapi/iiOI111I;->OXO1(Lcom/sma/smartv3/view/text/MyTypeface;Landroid/content/Context;)Landroid/graphics/Typeface;

    move-result-object p3

    invoke-virtual {v0, p3}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 24
    iget p3, p0, Lcom/sma/smartv3/view/TempProgressBar;->OX110i:I

    invoke-virtual {v0, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 25
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 26
    iget-boolean p3, p0, Lcom/sma/smartv3/view/TempProgressBar;->iX1O1:Z

    invoke-virtual {v2, p3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 27
    sget-object p3, Lcom/sma/smartv3/view/text/MyTypeface;->PF_MEDIUM:Lcom/sma/smartv3/view/text/MyTypeface;

    invoke-virtual {p2, p3, p1}, Lcom/android/mltcode/paycertificationapi/iiOI111I;->OXO1(Lcom/sma/smartv3/view/text/MyTypeface;Landroid/content/Context;)Landroid/graphics/Typeface;

    move-result-object p1

    invoke-virtual {v2, p1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 28
    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 29
    iget-boolean p1, p0, Lcom/sma/smartv3/view/TempProgressBar;->iX1O1:Z

    invoke-virtual {v5, p1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 30
    invoke-virtual {p0}, Lcom/sma/smartv3/view/TempProgressBar;->applySkin()V

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

    .line 31
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/view/TempProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

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

    sget-object v0, Lcom/sma/smartv3/R$styleable;->TempProgressBar:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const-string p2, "obtainStyledAttributes(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x0

    const/4 v0, 0x1

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lcom/sma/smartv3/view/TempProgressBar;->iX1O1:Z

    const/4 v1, 0x5

    invoke-virtual {p1, v1, p2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/TempProgressBar;->OX110i:I

    const/4 p2, -0x1

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/TempProgressBar;->OO:I

    const/4 v0, 0x3

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/TempProgressBar;->XOX0O0:I

    const/4 v0, 0x2

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/TempProgressBar;->iOiXi11II:I

    const/4 v0, 0x6

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/TempProgressBar;->X00XIX1:I

    const/4 v0, 0x4

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/TempProgressBar;->i0X000X0O:I

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private final XO0O10(I)F
    .locals 0

    int-to-float p1, p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/SizeUtils;->sp2px(F)I

    move-result p1

    int-to-float p1, p1

    return p1
.end method


# virtual methods
.method public applySkin()V
    .locals 3

    invoke-super {p0}, Lskin/support/widget/SkinCompatView;->applySkin()V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/sma/smartv3/view/TempProgressBar;->XXX11i:Landroid/graphics/Paint;

    iget v2, p0, Lcom/sma/smartv3/view/TempProgressBar;->OX110i:I

    invoke-static {v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/hl4;->OXO1(Landroid/content/Context;Landroid/graphics/Paint;I)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final iO(IZ)V
    .locals 5

    invoke-static {p1, p2}, Lcom/android/mltcode/paycertificationapi/cp5;->iIiiO(IZ)F

    move-result p1

    iget-object v0, p0, Lcom/sma/smartv3/view/TempProgressBar;->i11I:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/sma/smartv3/view/TempProgressBar;->i11I:Ljava/util/List;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, Lcom/sma/smartv3/view/TempProgressBar;->I1:[Ljava/lang/Float;

    const/4 v4, 0x1

    aget-object v3, v3, v4

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    invoke-static {v1, v3, p2}, Lcom/android/mltcode/paycertificationapi/cp5;->iOOX010X(Landroid/content/Context;FZ)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/sma/smartv3/view/TempProgressBar;->i11I:Ljava/util/List;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/sma/smartv3/view/TempProgressBar;->I1:[Ljava/lang/Float;

    const/4 v3, 0x2

    aget-object v2, v2, v3

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    invoke-static {v1, v2, p2}, Lcom/android/mltcode/paycertificationapi/cp5;->iOOX010X(Landroid/content/Context;FZ)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/sma/smartv3/view/TempProgressBar;->I1:[Ljava/lang/Float;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-static {v0, p2}, Lcom/android/mltcode/paycertificationapi/cp5;->i010I(FZ)F

    move-result v0

    iget-object v1, p0, Lcom/sma/smartv3/view/TempProgressBar;->I1:[Ljava/lang/Float;

    const/4 v2, 0x3

    aget-object v1, v1, v2

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-static {v1, p2}, Lcom/android/mltcode/paycertificationapi/cp5;->i010I(FZ)F

    move-result p2

    cmpg-float v1, p1, v0

    if-gez v1, :cond_0

    move p1, v0

    :cond_0
    cmpl-float v1, p1, p2

    if-lez v1, :cond_1

    move p1, p2

    :cond_1
    sub-float/2addr p1, v0

    sub-float/2addr p2, v0

    div-float/2addr p1, p2

    iput p1, p0, Lcom/sma/smartv3/view/TempProgressBar;->XO0X10iO:F

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

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    iget-object v0, p0, Lcom/sma/smartv3/view/TempProgressBar;->i11I:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/view/TempProgressBar;->i11I:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget v2, p0, Lcom/sma/smartv3/view/TempProgressBar;->X11I:F

    const/16 v3, 0x14

    int-to-float v3, v3

    sub-float/2addr v2, v3

    iget v4, p0, Lcom/sma/smartv3/view/TempProgressBar;->X1IX:F

    iget-object v5, p0, Lcom/sma/smartv3/view/TempProgressBar;->XXX11i:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v2, v4, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    iget-object v0, p0, Lcom/sma/smartv3/view/TempProgressBar;->i11I:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget v1, p0, Lcom/sma/smartv3/view/TempProgressBar;->X100O:F

    sub-float/2addr v1, v3

    iget v2, p0, Lcom/sma/smartv3/view/TempProgressBar;->X1IX:F

    iget-object v3, p0, Lcom/sma/smartv3/view/TempProgressBar;->XXX11i:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/view/TempProgressBar;->X11iII1O1:Landroid/graphics/Paint;

    iget v1, p0, Lcom/sma/smartv3/view/TempProgressBar;->iOiXi11II:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget v4, p0, Lcom/sma/smartv3/view/TempProgressBar;->XXO:F

    iget v5, p0, Lcom/sma/smartv3/view/TempProgressBar;->X11I:F

    iget v6, p0, Lcom/sma/smartv3/view/TempProgressBar;->Ii1iii0:F

    iget-object v7, p0, Lcom/sma/smartv3/view/TempProgressBar;->X11iII1O1:Landroid/graphics/Paint;

    const/4 v3, 0x0

    move-object v2, p1

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    move-object v8, v2

    iget-object p1, p0, Lcom/sma/smartv3/view/TempProgressBar;->X11iII1O1:Landroid/graphics/Paint;

    iget v0, p0, Lcom/sma/smartv3/view/TempProgressBar;->X00XIX1:I

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    iget v9, p0, Lcom/sma/smartv3/view/TempProgressBar;->X11I:F

    iget v10, p0, Lcom/sma/smartv3/view/TempProgressBar;->XXO:F

    iget v11, p0, Lcom/sma/smartv3/view/TempProgressBar;->X100O:F

    iget v12, p0, Lcom/sma/smartv3/view/TempProgressBar;->Ii1iii0:F

    iget-object v13, p0, Lcom/sma/smartv3/view/TempProgressBar;->X11iII1O1:Landroid/graphics/Paint;

    invoke-virtual/range {v8 .. v13}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    iget-object p1, p0, Lcom/sma/smartv3/view/TempProgressBar;->X11iII1O1:Landroid/graphics/Paint;

    iget v0, p0, Lcom/sma/smartv3/view/TempProgressBar;->i0X000X0O:I

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    iget v9, p0, Lcom/sma/smartv3/view/TempProgressBar;->X100O:F

    iget v10, p0, Lcom/sma/smartv3/view/TempProgressBar;->XXO:F

    iget v11, p0, Lcom/sma/smartv3/view/TempProgressBar;->XX1Oi:F

    iget v12, p0, Lcom/sma/smartv3/view/TempProgressBar;->Ii1iii0:F

    iget-object v13, p0, Lcom/sma/smartv3/view/TempProgressBar;->X11iII1O1:Landroid/graphics/Paint;

    invoke-virtual/range {v8 .. v13}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    iget-object p1, p0, Lcom/sma/smartv3/view/TempProgressBar;->iXiX011:Landroid/graphics/Paint;

    iget v0, p0, Lcom/sma/smartv3/view/TempProgressBar;->XOX0O0:I

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    iget p1, p0, Lcom/sma/smartv3/view/TempProgressBar;->O001I:I

    int-to-float p1, p1

    iget v0, p0, Lcom/sma/smartv3/view/TempProgressBar;->XO0X10iO:F

    mul-float/2addr p1, v0

    iget v0, p0, Lcom/sma/smartv3/view/TempProgressBar;->iiiO:F

    const/4 v1, 0x2

    int-to-float v1, v1

    div-float v2, v0, v1

    sub-float/2addr p1, v2

    iget v2, p0, Lcom/sma/smartv3/view/TempProgressBar;->XXO:F

    iget v3, p0, Lcom/sma/smartv3/view/TempProgressBar;->Ii1iii0:F

    sub-float/2addr v3, v2

    div-float/2addr v3, v1

    add-float/2addr v2, v3

    div-float/2addr v0, v1

    iget-object v3, p0, Lcom/sma/smartv3/view/TempProgressBar;->iXiX011:Landroid/graphics/Paint;

    invoke-virtual {v8, p1, v2, v0, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget-object p1, p0, Lcom/sma/smartv3/view/TempProgressBar;->iXiX011:Landroid/graphics/Paint;

    iget v0, p0, Lcom/sma/smartv3/view/TempProgressBar;->OO:I

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    iget p1, p0, Lcom/sma/smartv3/view/TempProgressBar;->O001I:I

    int-to-float p1, p1

    iget v0, p0, Lcom/sma/smartv3/view/TempProgressBar;->XO0X10iO:F

    mul-float/2addr p1, v0

    iget v0, p0, Lcom/sma/smartv3/view/TempProgressBar;->iiiO:F

    div-float v2, v0, v1

    sub-float/2addr p1, v2

    iget v2, p0, Lcom/sma/smartv3/view/TempProgressBar;->XXO:F

    iget v3, p0, Lcom/sma/smartv3/view/TempProgressBar;->Ii1iii0:F

    sub-float/2addr v3, v2

    div-float/2addr v3, v1

    add-float/2addr v2, v3

    div-float/2addr v0, v1

    sub-float/2addr v0, v1

    iget-object v1, p0, Lcom/sma/smartv3/view/TempProgressBar;->iXiX011:Landroid/graphics/Paint;

    invoke-virtual {v8, p1, v2, v0, v1}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    return-void
.end method

.method public onMeasure(II)V
    .locals 3

    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/view/TempProgressBar;->O001I:I

    iget-object p1, p0, Lcom/sma/smartv3/view/TempProgressBar;->I1:[Ljava/lang/Float;

    const/4 p2, 0x3

    aget-object p1, p1, p2

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v0, p0, Lcom/sma/smartv3/view/TempProgressBar;->I1:[Ljava/lang/Float;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    sub-float/2addr p1, v0

    iget-object v0, p0, Lcom/sma/smartv3/view/TempProgressBar;->I1:[Ljava/lang/Float;

    const/4 v2, 0x1

    aget-object v0, v0, v2

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iget-object v2, p0, Lcom/sma/smartv3/view/TempProgressBar;->I1:[Ljava/lang/Float;

    aget-object v2, v2, v1

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    sub-float/2addr v0, v2

    div-float/2addr v0, p1

    iget v2, p0, Lcom/sma/smartv3/view/TempProgressBar;->O001I:I

    int-to-float v2, v2

    mul-float/2addr v0, v2

    iput v0, p0, Lcom/sma/smartv3/view/TempProgressBar;->X11I:F

    iget-object v0, p0, Lcom/sma/smartv3/view/TempProgressBar;->I1:[Ljava/lang/Float;

    const/4 v2, 0x2

    aget-object v0, v0, v2

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iget-object v2, p0, Lcom/sma/smartv3/view/TempProgressBar;->I1:[Ljava/lang/Float;

    aget-object v2, v2, v1

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    sub-float/2addr v0, v2

    div-float/2addr v0, p1

    iget v2, p0, Lcom/sma/smartv3/view/TempProgressBar;->O001I:I

    int-to-float v2, v2

    mul-float/2addr v0, v2

    iput v0, p0, Lcom/sma/smartv3/view/TempProgressBar;->X100O:F

    iget-object v0, p0, Lcom/sma/smartv3/view/TempProgressBar;->I1:[Ljava/lang/Float;

    aget-object p2, v0, p2

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    iget-object v0, p0, Lcom/sma/smartv3/view/TempProgressBar;->I1:[Ljava/lang/Float;

    aget-object v0, v0, v1

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    sub-float/2addr p2, v0

    div-float/2addr p2, p1

    iget p1, p0, Lcom/sma/smartv3/view/TempProgressBar;->O001I:I

    int-to-float p1, p1

    mul-float/2addr p2, p1

    iput p2, p0, Lcom/sma/smartv3/view/TempProgressBar;->XX1Oi:F

    iget p1, p0, Lcom/sma/smartv3/view/TempProgressBar;->Ii1iii0:F

    iget p2, p0, Lcom/sma/smartv3/view/TempProgressBar;->iXiiiO:F

    add-float/2addr p1, p2

    iput p1, p0, Lcom/sma/smartv3/view/TempProgressBar;->Ii1iii0:F

    iget p1, p0, Lcom/sma/smartv3/view/TempProgressBar;->iiiO:F

    add-float/2addr p1, p2

    iput p1, p0, Lcom/sma/smartv3/view/TempProgressBar;->iiiO:F

    return-void
.end method
