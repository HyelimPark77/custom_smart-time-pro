.class public final Lcom/sma/smartv3/view/DfuProgress;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field public I1:F

.field public IO:F

.field public O001I:F

.field public final X0i1O:F

.field public final X11iII1O1:Landroid/graphics/RectF;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public X1IX:I

.field public XXX11i:I

.field public final iIXi1iiXI:F

.field public final iX1O1:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public iXiX011:Z


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

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/view/DfuProgress;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/view/DfuProgress;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
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

    .line 4
    new-instance p3, Landroid/graphics/Paint;

    invoke-direct {p3}, Landroid/graphics/Paint;-><init>()V

    iput-object p3, p0, Lcom/sma/smartv3/view/DfuProgress;->iX1O1:Landroid/graphics/Paint;

    .line 5
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/view/DfuProgress;->X11iII1O1:Landroid/graphics/RectF;

    const v0, 0x7f06024d

    .line 6
    invoke-static {p1, v0}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/DfuProgress;->XXX11i:I

    const v0, 0x7f0600b4

    .line 7
    invoke-static {p1, v0}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/DfuProgress;->X1IX:I

    const/high16 v0, 0x41400000    # 12.0f

    .line 8
    invoke-static {v0}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/sma/smartv3/view/DfuProgress;->X0i1O:F

    const/high16 v0, 0x3f800000    # 1.0f

    .line 9
    invoke-static {v0}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/sma/smartv3/view/DfuProgress;->iIXi1iiXI:F

    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, Lcom/sma/smartv3/view/DfuProgress;->iXiX011:Z

    .line 11
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/view/DfuProgress;->OXO1(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 12
    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 13
    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setDither(Z)V

    .line 14
    sget-object p2, Lcom/android/mltcode/paycertificationapi/iiOI111I;->OXO1:Lcom/android/mltcode/paycertificationapi/iiOI111I;

    sget-object v0, Lcom/sma/smartv3/view/text/MyTypeface;->PF_MEDIUM:Lcom/sma/smartv3/view/text/MyTypeface;

    invoke-virtual {p2, v0, p1}, Lcom/android/mltcode/paycertificationapi/iiOI111I;->OXO1(Lcom/sma/smartv3/view/text/MyTypeface;Landroid/content/Context;)Landroid/graphics/Typeface;

    move-result-object p1

    invoke-virtual {p3, p1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 15
    sget-object p1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {p3, p1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 16
    sget-object p1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {p3, p1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

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

    .line 17
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/view/DfuProgress;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public final OXO1(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    sget-object v0, Lcom/sma/smartv3/R$styleable;->DfuProgress:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const-string p2, "obtainStyledAttributes(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x2

    iget-boolean v0, p0, Lcom/sma/smartv3/view/DfuProgress;->iXiX011:Z

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/sma/smartv3/view/DfuProgress;->iXiX011:Z

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/sma/smartv3/view/DfuProgress;->X1IX:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/DfuProgress;->X1IX:I

    :cond_0
    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/sma/smartv3/view/DfuProgress;->XXX11i:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/view/DfuProgress;->XXX11i:I

    :cond_1
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

    iget-object v0, p0, Lcom/sma/smartv3/view/DfuProgress;->iX1O1:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget v1, p0, Lcom/sma/smartv3/view/DfuProgress;->X0i1O:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget v1, p0, Lcom/sma/smartv3/view/DfuProgress;->XXX11i:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget v0, p0, Lcom/sma/smartv3/view/DfuProgress;->I1:F

    iget v1, p0, Lcom/sma/smartv3/view/DfuProgress;->X0i1O:F

    const/4 v2, 0x2

    int-to-float v2, v2

    div-float/2addr v1, v2

    sub-float v1, v0, v1

    iget-object v3, p0, Lcom/sma/smartv3/view/DfuProgress;->iX1O1:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v0, v1, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    const/high16 v0, -0x3d4c0000    # -90.0f

    iget v1, p0, Lcom/sma/smartv3/view/DfuProgress;->I1:F

    invoke-virtual {p1, v0, v1, v1}, Landroid/graphics/Canvas;->rotate(FFF)V

    iget-object v0, p0, Lcom/sma/smartv3/view/DfuProgress;->iX1O1:Landroid/graphics/Paint;

    iget v1, p0, Lcom/sma/smartv3/view/DfuProgress;->X1IX:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lcom/sma/smartv3/view/DfuProgress;->X11iII1O1:Landroid/graphics/RectF;

    iget v1, p0, Lcom/sma/smartv3/view/DfuProgress;->X0i1O:F

    div-float v3, v1, v2

    div-float v4, v1, v2

    iget v5, p0, Lcom/sma/smartv3/view/DfuProgress;->IO:F

    div-float v6, v1, v2

    sub-float v6, v5, v6

    div-float/2addr v1, v2

    sub-float/2addr v5, v1

    invoke-virtual {v0, v3, v4, v6, v5}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v8, p0, Lcom/sma/smartv3/view/DfuProgress;->X11iII1O1:Landroid/graphics/RectF;

    iget v0, p0, Lcom/sma/smartv3/view/DfuProgress;->O001I:F

    const/16 v1, 0x168

    int-to-float v1, v1

    mul-float v10, v0, v1

    const/4 v11, 0x0

    iget-object v12, p0, Lcom/sma/smartv3/view/DfuProgress;->iX1O1:Landroid/graphics/Paint;

    const/4 v9, 0x0

    move-object v7, p1

    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    invoke-virtual {v7}, Landroid/graphics/Canvas;->restore()V

    iget-boolean p1, p0, Lcom/sma/smartv3/view/DfuProgress;->iXiX011:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/view/DfuProgress;->iX1O1:Landroid/graphics/Paint;

    iget v0, p0, Lcom/sma/smartv3/view/DfuProgress;->iIXi1iiXI:F

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget p1, p0, Lcom/sma/smartv3/view/DfuProgress;->I1:F

    iget v0, p0, Lcom/sma/smartv3/view/DfuProgress;->X0i1O:F

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v0, v1

    sub-float v0, p1, v0

    iget-object v1, p0, Lcom/sma/smartv3/view/DfuProgress;->iX1O1:Landroid/graphics/Paint;

    invoke-virtual {v7, p1, p1, v0, v1}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/view/DfuProgress;->iX1O1:Landroid/graphics/Paint;

    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget p1, p0, Lcom/sma/smartv3/view/DfuProgress;->O001I:F

    const/16 v0, 0x64

    int-to-float v0, v0

    mul-float/2addr p1, v0

    float-to-int p1, p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "%"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget v0, p0, Lcom/sma/smartv3/view/DfuProgress;->I1:F

    iget-object v1, p0, Lcom/sma/smartv3/view/DfuProgress;->iX1O1:Landroid/graphics/Paint;

    invoke-virtual {v1}, Landroid/graphics/Paint;->getTextSize()F

    move-result v1

    div-float/2addr v1, v2

    add-float/2addr v1, v0

    iget-object v2, p0, Lcom/sma/smartv3/view/DfuProgress;->iX1O1:Landroid/graphics/Paint;

    invoke-virtual {v7, p1, v0, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    return-void
.end method

.method public onSizeChanged(IIII)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    int-to-float p1, p1

    iput p1, p0, Lcom/sma/smartv3/view/DfuProgress;->IO:F

    const/4 p2, 0x2

    int-to-float p2, p2

    div-float/2addr p1, p2

    iput p1, p0, Lcom/sma/smartv3/view/DfuProgress;->I1:F

    iget-object p2, p0, Lcom/sma/smartv3/view/DfuProgress;->iX1O1:Landroid/graphics/Paint;

    const/4 p3, 0x4

    int-to-float p3, p3

    div-float/2addr p1, p3

    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    return-void
.end method

.method public final setProgress(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/view/DfuProgress;->O001I:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method
