.class public final Lcom/sma/smartv3/view/ImageViewRound;
.super Landroidx/appcompat/widget/AppCompatImageView;
.source "SourceFile"


# instance fields
.field private antiAlias:Z

.field private bitmapMatrix:Landroid/graphics/Matrix;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private borderColor:I

.field private borderPaint:Landroid/graphics/Paint;

.field private borderWidth:I

.field private drawablePaint:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private isCustomizeDraw:Z

.field private mTempBorderWidth:I

.field private radius:I

.field private rectF:Landroid/graphics/RectF;

.field private type:I

.field private viewHeight:F

.field private viewWidth:F

.field private final xfermode:Landroid/graphics/PorterDuffXfermode;
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

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/view/ImageViewRound;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/view/ImageViewRound;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2
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
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    new-instance p3, Landroid/graphics/Paint;

    invoke-direct {p3}, Landroid/graphics/Paint;-><init>()V

    iput-object p3, p0, Lcom/sma/smartv3/view/ImageViewRound;->drawablePaint:Landroid/graphics/Paint;

    .line 5
    new-instance p3, Landroid/graphics/Matrix;

    invoke-direct {p3}, Landroid/graphics/Matrix;-><init>()V

    iput-object p3, p0, Lcom/sma/smartv3/view/ImageViewRound;->bitmapMatrix:Landroid/graphics/Matrix;

    .line 6
    new-instance p3, Landroid/graphics/PorterDuffXfermode;

    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {p3, v0}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    iput-object p3, p0, Lcom/sma/smartv3/view/ImageViewRound;->xfermode:Landroid/graphics/PorterDuffXfermode;

    const/4 p3, 0x1

    .line 7
    iput-boolean p3, p0, Lcom/sma/smartv3/view/ImageViewRound;->antiAlias:Z

    const/16 v0, 0xa

    .line 8
    invoke-direct {p0, v0}, Lcom/sma/smartv3/view/ImageViewRound;->dp2px(I)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/sma/smartv3/view/ImageViewRound;->radius:I

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f06024d

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/ImageViewRound;->borderColor:I

    .line 10
    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/view/ImageViewRound;->initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 11
    iget p1, p0, Lcom/sma/smartv3/view/ImageViewRound;->borderWidth:I

    if-lez p1, :cond_3

    .line 12
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/view/ImageViewRound;->borderPaint:Landroid/graphics/Paint;

    .line 13
    iget-boolean p2, p0, Lcom/sma/smartv3/view/ImageViewRound;->antiAlias:Z

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 14
    iget-object p1, p0, Lcom/sma/smartv3/view/ImageViewRound;->borderPaint:Landroid/graphics/Paint;

    const/4 p2, 0x0

    const-string v0, "borderPaint"

    if-nez p1, :cond_0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, p2

    :cond_0
    iget v1, p0, Lcom/sma/smartv3/view/ImageViewRound;->borderWidth:I

    int-to-float v1, v1

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 15
    iget-object p1, p0, Lcom/sma/smartv3/view/ImageViewRound;->borderPaint:Landroid/graphics/Paint;

    if-nez p1, :cond_1

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, p2

    :cond_1
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 16
    iget-object p1, p0, Lcom/sma/smartv3/view/ImageViewRound;->borderPaint:Landroid/graphics/Paint;

    if-nez p1, :cond_2

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object p2, p1

    :goto_0
    iget p1, p0, Lcom/sma/smartv3/view/ImageViewRound;->borderColor:I

    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 17
    :cond_3
    invoke-virtual {p0, p3}, Landroid/view/View;->setClickable(Z)V

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

    .line 18
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/view/ImageViewRound;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private final dp2px(I)F
    .locals 0

    int-to-float p1, p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result p1

    int-to-float p1, p1

    return p1
.end method

.method private final initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    sget-object v0, Lcom/sma/smartv3/R$styleable;->ImageViewRound:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const-string p2, "obtainStyledAttributes(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x0

    const/4 v0, 0x1

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/sma/smartv3/view/ImageViewRound;->antiAlias:Z

    const/4 p2, 0x4

    iget v1, p0, Lcom/sma/smartv3/view/ImageViewRound;->radius:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/ImageViewRound;->radius:I

    const/4 p2, 0x2

    iget v1, p0, Lcom/sma/smartv3/view/ImageViewRound;->borderWidth:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/ImageViewRound;->borderWidth:I

    iget p2, p0, Lcom/sma/smartv3/view/ImageViewRound;->borderColor:I

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/ImageViewRound;->borderColor:I

    const/4 p2, 0x5

    iget v0, p0, Lcom/sma/smartv3/view/ImageViewRound;->type:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/ImageViewRound;->type:I

    const/4 p2, 0x3

    iget-boolean v0, p0, Lcom/sma/smartv3/view/ImageViewRound;->isCustomizeDraw:Z

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/sma/smartv3/view/ImageViewRound;->isCustomizeDraw:Z

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private final sp2px(I)F
    .locals 0

    int-to-float p1, p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/SizeUtils;->sp2px(F)I

    move-result p1

    int-to-float p1, p1

    return p1
.end method


# virtual methods
.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 14
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/sma/smartv3/view/ImageViewRound;->isCustomizeDraw:Z

    if-eqz v0, :cond_8

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    iget-object v0, p0, Lcom/sma/smartv3/view/ImageViewRound;->drawablePaint:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->reset()V

    iget-object v0, p0, Lcom/sma/smartv3/view/ImageViewRound;->drawablePaint:Landroid/graphics/Paint;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lcom/sma/smartv3/view/ImageViewRound;->drawablePaint:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-nez v0, :cond_0

    goto/16 :goto_3

    :cond_0
    iget v0, p0, Lcom/sma/smartv3/view/ImageViewRound;->viewWidth:F

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-nez v0, :cond_1

    return-void

    :cond_1
    iget v0, p0, Lcom/sma/smartv3/view/ImageViewRound;->viewHeight:F

    cmpg-float v0, v0, v1

    if-nez v0, :cond_2

    return-void

    :cond_2
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    const-string v0, "getDrawable(...)"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Landroidx/core/graphics/drawable/DrawableKt;->toBitmap$default(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v7

    iget v3, p0, Lcom/sma/smartv3/view/ImageViewRound;->viewWidth:F

    iget v4, p0, Lcom/sma/smartv3/view/ImageViewRound;->viewHeight:F

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->saveLayer(FFFFLandroid/graphics/Paint;)I

    iget p1, p0, Lcom/sma/smartv3/view/ImageViewRound;->type:I

    const/4 v1, 0x2

    const/high16 v2, 0x40000000    # 2.0f

    if-nez p1, :cond_3

    iget p1, p0, Lcom/sma/smartv3/view/ImageViewRound;->viewWidth:F

    int-to-float v3, v1

    div-float v4, p1, v3

    iget v5, p0, Lcom/sma/smartv3/view/ImageViewRound;->viewHeight:F

    div-float/2addr v5, v3

    div-float/2addr p1, v3

    iget v3, p0, Lcom/sma/smartv3/view/ImageViewRound;->borderWidth:I

    int-to-float v3, v3

    div-float/2addr v3, v2

    sub-float/2addr p1, v3

    iget-object v3, p0, Lcom/sma/smartv3/view/ImageViewRound;->drawablePaint:Landroid/graphics/Paint;

    invoke-virtual {v0, v4, v5, p1, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    goto :goto_0

    :cond_3
    new-instance p1, Landroid/graphics/RectF;

    iget v3, p0, Lcom/sma/smartv3/view/ImageViewRound;->borderWidth:I

    int-to-float v4, v3

    div-float/2addr v4, v2

    int-to-float v5, v3

    div-float/2addr v5, v2

    iget v6, p0, Lcom/sma/smartv3/view/ImageViewRound;->viewWidth:F

    int-to-float v8, v3

    div-float/2addr v8, v2

    sub-float/2addr v6, v8

    iget v8, p0, Lcom/sma/smartv3/view/ImageViewRound;->viewHeight:F

    int-to-float v3, v3

    div-float/2addr v3, v2

    sub-float/2addr v8, v3

    invoke-direct {p1, v4, v5, v6, v8}, Landroid/graphics/RectF;-><init>(FFFF)V

    iget v3, p0, Lcom/sma/smartv3/view/ImageViewRound;->radius:I

    int-to-float v4, v3

    int-to-float v3, v3

    iget-object v5, p0, Lcom/sma/smartv3/view/ImageViewRound;->drawablePaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1, v4, v3, v5}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    :goto_0
    iget-object p1, p0, Lcom/sma/smartv3/view/ImageViewRound;->drawablePaint:Landroid/graphics/Paint;

    iget-object v3, p0, Lcom/sma/smartv3/view/ImageViewRound;->xfermode:Landroid/graphics/PorterDuffXfermode;

    invoke-virtual {p1, v3}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    iget p1, p0, Lcom/sma/smartv3/view/ImageViewRound;->viewWidth:F

    iget v3, p0, Lcom/sma/smartv3/view/ImageViewRound;->borderWidth:I

    int-to-float v3, v3

    sub-float/2addr p1, v3

    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr p1, v3

    iget v3, p0, Lcom/sma/smartv3/view/ImageViewRound;->viewHeight:F

    iget v4, p0, Lcom/sma/smartv3/view/ImageViewRound;->borderWidth:I

    int-to-float v4, v4

    sub-float/2addr v3, v4

    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v3, v4

    iget-object v4, p0, Lcom/sma/smartv3/view/ImageViewRound;->bitmapMatrix:Landroid/graphics/Matrix;

    invoke-virtual {v4}, Landroid/graphics/Matrix;->reset()V

    iget-object v4, p0, Lcom/sma/smartv3/view/ImageViewRound;->bitmapMatrix:Landroid/graphics/Matrix;

    invoke-virtual {v4, p1, v3}, Landroid/graphics/Matrix;->postScale(FF)Z

    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v10

    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v11

    iget-object v12, p0, Lcom/sma/smartv3/view/ImageViewRound;->bitmapMatrix:Landroid/graphics/Matrix;

    const/4 v13, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v7 .. v13}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object p1

    const-string v3, "createBitmap(...)"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget v3, p0, Lcom/sma/smartv3/view/ImageViewRound;->borderWidth:I

    int-to-float v4, v3

    div-float/2addr v4, v2

    int-to-float v3, v3

    div-float/2addr v3, v2

    iget-object v5, p0, Lcom/sma/smartv3/view/ImageViewRound;->drawablePaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1, v4, v3, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    invoke-virtual {v0}, Landroid/graphics/Canvas;->restore()V

    iget p1, p0, Lcom/sma/smartv3/view/ImageViewRound;->borderWidth:I

    if-lez p1, :cond_7

    iget v3, p0, Lcom/sma/smartv3/view/ImageViewRound;->type:I

    const/4 v4, 0x0

    const-string v5, "borderPaint"

    if-nez v3, :cond_5

    iget v3, p0, Lcom/sma/smartv3/view/ImageViewRound;->viewWidth:F

    int-to-float v1, v1

    div-float v6, v3, v1

    iget v7, p0, Lcom/sma/smartv3/view/ImageViewRound;->viewHeight:F

    div-float/2addr v7, v1

    div-float/2addr v3, v1

    int-to-float p1, p1

    div-float/2addr p1, v2

    sub-float/2addr v3, p1

    iget-object p1, p0, Lcom/sma/smartv3/view/ImageViewRound;->borderPaint:Landroid/graphics/Paint;

    if-nez p1, :cond_4

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    move-object v4, p1

    :goto_1
    invoke-virtual {v0, v6, v7, v3, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    return-void

    :cond_5
    new-instance p1, Landroid/graphics/RectF;

    iget v1, p0, Lcom/sma/smartv3/view/ImageViewRound;->borderWidth:I

    int-to-float v3, v1

    div-float/2addr v3, v2

    int-to-float v6, v1

    div-float/2addr v6, v2

    iget v7, p0, Lcom/sma/smartv3/view/ImageViewRound;->viewWidth:F

    int-to-float v8, v1

    div-float/2addr v8, v2

    sub-float/2addr v7, v8

    iget v8, p0, Lcom/sma/smartv3/view/ImageViewRound;->viewHeight:F

    int-to-float v1, v1

    div-float/2addr v1, v2

    sub-float/2addr v8, v1

    invoke-direct {p1, v3, v6, v7, v8}, Landroid/graphics/RectF;-><init>(FFFF)V

    iget v1, p0, Lcom/sma/smartv3/view/ImageViewRound;->radius:I

    int-to-float v2, v1

    int-to-float v1, v1

    iget-object v3, p0, Lcom/sma/smartv3/view/ImageViewRound;->borderPaint:Landroid/graphics/Paint;

    if-nez v3, :cond_6

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_2

    :cond_6
    move-object v4, v3

    :goto_2
    invoke-virtual {v0, p1, v2, v1, v4}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    :cond_7
    :goto_3
    return-void

    :cond_8
    move-object v0, p1

    invoke-super {p0, v0}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public onSizeChanged(IIII)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    int-to-float p1, p1

    iput p1, p0, Lcom/sma/smartv3/view/ImageViewRound;->viewWidth:F

    int-to-float p1, p2

    iput p1, p0, Lcom/sma/smartv3/view/ImageViewRound;->viewHeight:F

    new-instance p1, Landroid/graphics/RectF;

    iget p2, p0, Lcom/sma/smartv3/view/ImageViewRound;->viewWidth:F

    iget p3, p0, Lcom/sma/smartv3/view/ImageViewRound;->viewHeight:F

    const/4 p4, 0x0

    invoke-direct {p1, p4, p4, p2, p3}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object p1, p0, Lcom/sma/smartv3/view/ImageViewRound;->rectF:Landroid/graphics/RectF;

    return-void
.end method

.method public final setRadius(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/view/ImageViewRound;->radius:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setType(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/view/ImageViewRound;->type:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final showSelected(Z)V
    .locals 0

    if-eqz p1, :cond_0

    iget p1, p0, Lcom/sma/smartv3/view/ImageViewRound;->mTempBorderWidth:I

    if-lez p1, :cond_1

    iput p1, p0, Lcom/sma/smartv3/view/ImageViewRound;->borderWidth:I

    goto :goto_0

    :cond_0
    iget p1, p0, Lcom/sma/smartv3/view/ImageViewRound;->borderWidth:I

    if-lez p1, :cond_1

    iput p1, p0, Lcom/sma/smartv3/view/ImageViewRound;->mTempBorderWidth:I

    const/4 p1, 0x0

    iput p1, p0, Lcom/sma/smartv3/view/ImageViewRound;->borderWidth:I

    :cond_1
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    return-void
.end method
