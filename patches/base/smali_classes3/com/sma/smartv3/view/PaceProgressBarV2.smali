.class public final Lcom/sma/smartv3/view/PaceProgressBarV2;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field public I1:I

.field public IO:I

.field public Ii1iii0:I

.field public O001I:F

.field public X0i1O:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final X11I:F

.field public final X11iII1O1:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final X1IX:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public XXO:F

.field public final XXX11i:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public iIXi1iiXI:I

.field public iX1O1:Z

.field public iXiX011:F

.field public iXiiiO:I

.field public iiiO:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attrs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/view/PaceProgressBarV2;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attrs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p3, 0x1

    .line 3
    iput-boolean p3, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->iX1O1:Z

    .line 4
    new-instance p3, Landroid/graphics/Paint;

    invoke-direct {p3}, Landroid/graphics/Paint;-><init>()V

    iput-object p3, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->X11iII1O1:Landroid/graphics/Paint;

    .line 5
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->XXX11i:Landroid/graphics/Paint;

    .line 6
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    iput-object v1, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->X1IX:Landroid/graphics/Paint;

    .line 7
    const-string v2, ""

    iput-object v2, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->X0i1O:Ljava/lang/String;

    const/16 v2, 0xc

    .line 8
    invoke-virtual {p0, v2}, Lcom/sma/smartv3/view/PaceProgressBarV2;->OXO1(I)F

    move-result v2

    iput v2, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->X11I:F

    .line 9
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/view/PaceProgressBarV2;->XIi00iiXO(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 10
    iget-boolean p1, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->iX1O1:Z

    invoke-virtual {p3, p1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 11
    iget p1, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->iXiiiO:I

    invoke-virtual {p3, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 12
    iget-boolean p1, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->iX1O1:Z

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 13
    iget p1, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->Ii1iii0:I

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 14
    iget-boolean p1, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->iX1O1:Z

    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    const/4 p1, -0x1

    .line 15
    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 16
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 17
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/view/PaceProgressBarV2;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

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
    .locals 1

    sget-object v0, Lcom/sma/smartv3/R$styleable;->PaceProgressBar:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const-string p2, "obtainStyledAttributes(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x0

    const/4 v0, 0x1

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->iX1O1:Z

    const/4 p2, -0x1

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->iXiiiO:I

    const/4 p2, 0x3

    const/16 v0, -0x100

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->iiiO:I

    const/4 p2, 0x2

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->Ii1iii0:I

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public final iO(FLjava/lang/String;I)V
    .locals 5
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "str"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    cmpg-float v1, p1, v0

    if-gez v1, :cond_0

    move p1, v0

    goto :goto_0

    :cond_0
    cmpg-float v1, v0, p1

    if-gez v1, :cond_1

    float-to-double v1, p1

    const-wide/high16 v3, 0x3fd0000000000000L    # 0.25

    cmpg-double v1, v1, v3

    if-gez v1, :cond_1

    const/high16 p1, 0x3e800000    # 0.25f

    goto :goto_0

    :cond_1
    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v2, p1, v1

    if-lez v2, :cond_2

    move p1, v1

    goto :goto_0

    :cond_2
    float-to-double v1, p1

    const-wide v3, 0x3feccccccccccccdL    # 0.9

    cmpl-double v1, v1, v3

    if-lez v1, :cond_3

    const/16 v1, 0xa

    int-to-float v1, v1

    div-float/2addr p1, v1

    const v1, 0x3f666666    # 0.9f

    add-float/2addr p1, v1

    :cond_3
    :goto_0
    iput p1, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->O001I:F

    iput v0, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->XXO:F

    iput-object p2, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->X0i1O:Ljava/lang/String;

    iput p3, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->iIXi1iiXI:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 7
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v1, "canvas"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super/range {p0 .. p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    iget v1, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->iXiX011:F

    const/4 v6, 0x0

    cmpg-float v1, v1, v6

    if-nez v1, :cond_0

    iget v1, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->I1:I

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    iput v1, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->iXiX011:F

    :cond_0
    iget v1, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->iXiX011:F

    iget-object v2, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->X11iII1O1:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v1, v1, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget v1, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->iXiX011:F

    iget v2, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->IO:I

    int-to-float v2, v2

    sub-float v3, v2, v1

    iget v2, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->I1:I

    int-to-float v4, v2

    iget-object v5, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->X11iII1O1:Landroid/graphics/Paint;

    const/4 v2, 0x0

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    iget v1, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->IO:I

    int-to-float v1, v1

    iget v2, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->iXiX011:F

    sub-float/2addr v1, v2

    iget-object v3, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->X11iII1O1:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v2, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget v1, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->XXO:F

    cmpg-float v1, v1, v6

    if-nez v1, :cond_1

    iget v1, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->O001I:F

    iget v2, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->IO:I

    int-to-float v2, v2

    mul-float/2addr v1, v2

    iput v1, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->XXO:F

    :cond_1
    iget-object v1, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->X0i1O:Ljava/lang/String;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_4

    iget v1, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->iIXi1iiXI:I

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->XXX11i:Landroid/graphics/Paint;

    iget v2, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->iiiO:I

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->XXX11i:Landroid/graphics/Paint;

    invoke-virtual {v1}, Landroid/graphics/Paint;->getColor()I

    move-result v1

    iget v2, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->Ii1iii0:I

    if-eq v1, v2, :cond_3

    iget-object v1, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->XXX11i:Landroid/graphics/Paint;

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    :cond_3
    :goto_0
    iget v1, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->iXiX011:F

    iget-object v2, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->XXX11i:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v1, v1, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget v1, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->iXiX011:F

    iget v2, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->XXO:F

    sub-float v3, v2, v1

    iget v2, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->I1:I

    int-to-float v4, v2

    iget-object v5, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->XXX11i:Landroid/graphics/Paint;

    const/4 v2, 0x0

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    iget v1, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->XXO:F

    iget v2, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->iXiX011:F

    sub-float/2addr v1, v2

    iget-object v3, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->XXX11i:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v2, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget-object v1, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->X0i1O:Ljava/lang/String;

    iget v2, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->XXO:F

    iget v3, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->iXiX011:F

    sub-float/2addr v2, v3

    iget-object v3, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->X1IX:Landroid/graphics/Paint;

    invoke-virtual {v3, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v3

    sub-float/2addr v2, v3

    iget v3, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->I1:I

    int-to-float v3, v3

    const/4 v4, 0x4

    invoke-virtual {p0, v4}, Lcom/sma/smartv3/view/PaceProgressBarV2;->OXO1(I)F

    move-result v4

    sub-float/2addr v3, v4

    iget-object v4, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->X1IX:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    :cond_4
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method public onMeasure(II)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->IO:I

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->I1:I

    int-to-float p1, p1

    const/high16 p2, 0x40000000    # 2.0f

    div-float/2addr p1, p2

    iput p1, p0, Lcom/sma/smartv3/view/PaceProgressBarV2;->iXiX011:F

    return-void
.end method
