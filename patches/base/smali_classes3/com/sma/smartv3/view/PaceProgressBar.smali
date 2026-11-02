.class public final Lcom/sma/smartv3/view/PaceProgressBar;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field public I1:I

.field public IO:I

.field public O001I:I

.field public X0i1O:F

.field public final X11iII1O1:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public X1IX:F

.field public final XXX11i:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public iIXi1iiXI:F

.field public iX1O1:Z

.field public iXiX011:I


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

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/view/PaceProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
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
    iput-boolean p3, p0, Lcom/sma/smartv3/view/PaceProgressBar;->iX1O1:Z

    .line 4
    new-instance p3, Landroid/graphics/Paint;

    invoke-direct {p3}, Landroid/graphics/Paint;-><init>()V

    iput-object p3, p0, Lcom/sma/smartv3/view/PaceProgressBar;->X11iII1O1:Landroid/graphics/Paint;

    .line 5
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/view/PaceProgressBar;->XXX11i:Landroid/graphics/Paint;

    .line 6
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/view/PaceProgressBar;->OXO1(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 7
    iget-boolean p1, p0, Lcom/sma/smartv3/view/PaceProgressBar;->iX1O1:Z

    invoke-virtual {p3, p1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 8
    iget p1, p0, Lcom/sma/smartv3/view/PaceProgressBar;->iXiX011:I

    invoke-virtual {p3, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 9
    iget-boolean p1, p0, Lcom/sma/smartv3/view/PaceProgressBar;->iX1O1:Z

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 10
    iget p1, p0, Lcom/sma/smartv3/view/PaceProgressBar;->O001I:I

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 11
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/view/PaceProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public final OXO1(Landroid/content/Context;Landroid/util/AttributeSet;)V
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

    iput-boolean p2, p0, Lcom/sma/smartv3/view/PaceProgressBar;->iX1O1:Z

    const/4 p2, -0x1

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/PaceProgressBar;->iXiX011:I

    const/4 p2, 0x2

    const/16 v0, -0x100

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/PaceProgressBar;->O001I:I

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

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

    iget v0, p0, Lcom/sma/smartv3/view/PaceProgressBar;->IO:I

    int-to-float v0, v0

    iget v1, p0, Lcom/sma/smartv3/view/PaceProgressBar;->X1IX:F

    sub-float v5, v0, v1

    iget v0, p0, Lcom/sma/smartv3/view/PaceProgressBar;->I1:I

    int-to-float v6, v0

    iget-object v7, p0, Lcom/sma/smartv3/view/PaceProgressBar;->X11iII1O1:Landroid/graphics/Paint;

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, p1

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    iget p1, p0, Lcom/sma/smartv3/view/PaceProgressBar;->IO:I

    int-to-float p1, p1

    iget v0, p0, Lcom/sma/smartv3/view/PaceProgressBar;->X1IX:F

    sub-float/2addr p1, v0

    iget-object v1, p0, Lcom/sma/smartv3/view/PaceProgressBar;->X11iII1O1:Landroid/graphics/Paint;

    invoke-virtual {v2, p1, v0, v0, v1}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget p1, p0, Lcom/sma/smartv3/view/PaceProgressBar;->iIXi1iiXI:F

    const/4 v0, 0x0

    cmpg-float p1, p1, v0

    if-nez p1, :cond_0

    iget p1, p0, Lcom/sma/smartv3/view/PaceProgressBar;->X0i1O:F

    iget v0, p0, Lcom/sma/smartv3/view/PaceProgressBar;->IO:I

    int-to-float v0, v0

    mul-float/2addr p1, v0

    iput p1, p0, Lcom/sma/smartv3/view/PaceProgressBar;->iIXi1iiXI:F

    :cond_0
    iget p1, p0, Lcom/sma/smartv3/view/PaceProgressBar;->iIXi1iiXI:F

    iget v0, p0, Lcom/sma/smartv3/view/PaceProgressBar;->X1IX:F

    sub-float v11, p1, v0

    iget p1, p0, Lcom/sma/smartv3/view/PaceProgressBar;->I1:I

    int-to-float v12, p1

    iget-object v13, p0, Lcom/sma/smartv3/view/PaceProgressBar;->XXX11i:Landroid/graphics/Paint;

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v8, v2

    invoke-virtual/range {v8 .. v13}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    iget p1, p0, Lcom/sma/smartv3/view/PaceProgressBar;->iIXi1iiXI:F

    iget v0, p0, Lcom/sma/smartv3/view/PaceProgressBar;->X1IX:F

    sub-float/2addr p1, v0

    iget-object v1, p0, Lcom/sma/smartv3/view/PaceProgressBar;->XXX11i:Landroid/graphics/Paint;

    invoke-virtual {v2, p1, v0, v0, v1}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    return-void
.end method

.method public onMeasure(II)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/view/PaceProgressBar;->IO:I

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/view/PaceProgressBar;->I1:I

    int-to-float p1, p1

    const/high16 p2, 0x40000000    # 2.0f

    div-float/2addr p1, p2

    iput p1, p0, Lcom/sma/smartv3/view/PaceProgressBar;->X1IX:F

    return-void
.end method

.method public final setPB(F)V
    .locals 3

    const/4 v0, 0x0

    cmpg-float v1, p1, v0

    if-gez v1, :cond_0

    move p1, v0

    goto :goto_0

    :cond_0
    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v2, p1, v1

    if-lez v2, :cond_1

    move p1, v1

    :cond_1
    :goto_0
    iput p1, p0, Lcom/sma/smartv3/view/PaceProgressBar;->X0i1O:F

    iput v0, p0, Lcom/sma/smartv3/view/PaceProgressBar;->iIXi1iiXI:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method
