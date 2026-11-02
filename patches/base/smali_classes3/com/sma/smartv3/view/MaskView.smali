.class public final Lcom/sma/smartv3/view/MaskView;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/view/MaskView$OXO1;,
        Lcom/sma/smartv3/view/MaskView$HollowShape;,
        Lcom/sma/smartv3/view/MaskView$XIi00iiXO;
    }
.end annotation


# instance fields
.field public I1:F

.field public IO:Lcom/sma/smartv3/view/MaskView$HollowShape;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final Ii1iii0:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final O001I:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public OO:I

.field public OX110i:Lcom/sma/smartv3/view/MaskView$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public X00XIX1:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public X0i1O:F

.field public X100O:Landroid/graphics/RectF;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public final X11I:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public X11iII1O1:I

.field public X1IX:I

.field public XOX0O0:I

.field public XX1Oi:Landroid/graphics/RectF;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public final XXO:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public XXX11i:F

.field public iIXi1iiXI:F

.field public iOiXi11II:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public iX1O1:I

.field public iXiX011:F

.field public final iXiiiO:Landroid/graphics/Paint;
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

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/view/MaskView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/view/MaskView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    sget-object p3, Lcom/sma/smartv3/view/MaskView$HollowShape;->SQUARE:Lcom/sma/smartv3/view/MaskView$HollowShape;

    iput-object p3, p0, Lcom/sma/smartv3/view/MaskView;->IO:Lcom/sma/smartv3/view/MaskView$HollowShape;

    const/high16 v0, 0x41800000    # 16.0f

    .line 5
    iput v0, p0, Lcom/sma/smartv3/view/MaskView;->I1:F

    .line 6
    const-string v1, "#80000000"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    iput v2, p0, Lcom/sma/smartv3/view/MaskView;->iX1O1:I

    .line 7
    const-string v2, "#2878FD"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    iput v3, p0, Lcom/sma/smartv3/view/MaskView;->X11iII1O1:I

    const/high16 v3, 0x40400000    # 3.0f

    .line 8
    iput v3, p0, Lcom/sma/smartv3/view/MaskView;->XXX11i:F

    const/4 v4, -0x1

    .line 9
    iput v4, p0, Lcom/sma/smartv3/view/MaskView;->X1IX:I

    const/high16 v5, 0x42280000    # 42.0f

    .line 10
    iput v5, p0, Lcom/sma/smartv3/view/MaskView;->X0i1O:F

    const/high16 v6, 0x42200000    # 40.0f

    .line 11
    iput v6, p0, Lcom/sma/smartv3/view/MaskView;->iIXi1iiXI:F

    const/high16 v7, 0x41f00000    # 30.0f

    .line 12
    iput v7, p0, Lcom/sma/smartv3/view/MaskView;->iXiX011:F

    .line 13
    new-instance v8, Landroid/graphics/Paint;

    invoke-direct {v8}, Landroid/graphics/Paint;-><init>()V

    .line 14
    iget v9, p0, Lcom/sma/smartv3/view/MaskView;->iX1O1:I

    invoke-virtual {v8, v9}, Landroid/graphics/Paint;->setColor(I)V

    const/4 v9, 0x1

    .line 15
    invoke-virtual {v8, v9}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 16
    iput-object v8, p0, Lcom/sma/smartv3/view/MaskView;->O001I:Landroid/graphics/Paint;

    .line 17
    new-instance v8, Landroid/graphics/Paint;

    invoke-direct {v8}, Landroid/graphics/Paint;-><init>()V

    .line 18
    iget v10, p0, Lcom/sma/smartv3/view/MaskView;->X1IX:I

    invoke-virtual {v8, v10}, Landroid/graphics/Paint;->setColor(I)V

    .line 19
    invoke-virtual {v8, v5}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 20
    invoke-virtual {v8, v9}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 21
    sget-object v10, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v8, v10}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 22
    iput-object v8, p0, Lcom/sma/smartv3/view/MaskView;->XXO:Landroid/graphics/Paint;

    .line 23
    new-instance v8, Landroid/graphics/Paint;

    invoke-direct {v8}, Landroid/graphics/Paint;-><init>()V

    .line 24
    iget v10, p0, Lcom/sma/smartv3/view/MaskView;->X11iII1O1:I

    invoke-virtual {v8, v10}, Landroid/graphics/Paint;->setColor(I)V

    .line 25
    sget-object v10, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v8, v10}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 26
    iget v11, p0, Lcom/sma/smartv3/view/MaskView;->XXX11i:F

    invoke-virtual {v8, v11}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 27
    invoke-virtual {v8, v9}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 28
    iput-object v8, p0, Lcom/sma/smartv3/view/MaskView;->iXiiiO:Landroid/graphics/Paint;

    .line 29
    new-instance v8, Landroid/graphics/Paint;

    invoke-direct {v8}, Landroid/graphics/Paint;-><init>()V

    .line 30
    iget v11, p0, Lcom/sma/smartv3/view/MaskView;->X11iII1O1:I

    invoke-virtual {v8, v11}, Landroid/graphics/Paint;->setColor(I)V

    .line 31
    invoke-virtual {v8, v10}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 32
    iget v11, p0, Lcom/sma/smartv3/view/MaskView;->XXX11i:F

    invoke-virtual {v8, v11}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 33
    invoke-virtual {v8, v9}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 34
    iput-object v8, p0, Lcom/sma/smartv3/view/MaskView;->Ii1iii0:Landroid/graphics/Paint;

    .line 35
    new-instance v8, Landroid/graphics/Paint;

    invoke-direct {v8}, Landroid/graphics/Paint;-><init>()V

    .line 36
    iget v11, p0, Lcom/sma/smartv3/view/MaskView;->X11iII1O1:I

    invoke-virtual {v8, v11}, Landroid/graphics/Paint;->setColor(I)V

    .line 37
    invoke-virtual {v8, v10}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const/high16 v10, 0x40800000    # 4.0f

    .line 38
    invoke-virtual {v8, v10}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 39
    invoke-virtual {v8, v9}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 40
    iput-object v8, p0, Lcom/sma/smartv3/view/MaskView;->iiiO:Landroid/graphics/Paint;

    .line 41
    new-instance v8, Landroid/graphics/Paint;

    invoke-direct {v8}, Landroid/graphics/Paint;-><init>()V

    .line 42
    new-instance v10, Landroid/graphics/PorterDuffXfermode;

    sget-object v11, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v10, v11}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v8, v10}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 43
    invoke-virtual {v8, v9}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 44
    iput-object v8, p0, Lcom/sma/smartv3/view/MaskView;->X11I:Landroid/graphics/Paint;

    const/16 v8, 0x12c

    .line 45
    iput v8, p0, Lcom/sma/smartv3/view/MaskView;->OO:I

    const/16 v8, 0x32

    .line 46
    iput v8, p0, Lcom/sma/smartv3/view/MaskView;->XOX0O0:I

    if-eqz p2, :cond_1

    .line 47
    sget-object v8, Lcom/sma/smartv3/R$styleable;->MapMaskView:[I

    invoke-virtual {p1, p2, v8}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const-string p2, "obtainStyledAttributes(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x5

    const/4 v8, 0x0

    .line 48
    :try_start_0
    invoke-virtual {p1, p2, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    if-ne p2, v9, :cond_0

    .line 49
    sget-object p3, Lcom/sma/smartv3/view/MaskView$HollowShape;->CIRCLE:Lcom/sma/smartv3/view/MaskView$HollowShape;

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_1

    .line 50
    :cond_0
    :goto_0
    invoke-virtual {p0, p3}, Lcom/sma/smartv3/view/MaskView;->setHollowShape(Lcom/sma/smartv3/view/MaskView$HollowShape;)V

    const/4 p2, 0x3

    .line 51
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    invoke-virtual {p0, p2}, Lcom/sma/smartv3/view/MaskView;->setCornerRadius(F)V

    .line 52
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p2

    invoke-virtual {p1, v8, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    invoke-virtual {p0, p2}, Lcom/sma/smartv3/view/MaskView;->setMaskColor(I)V

    .line 53
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p2

    invoke-virtual {p1, v9, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    invoke-virtual {p0, p2}, Lcom/sma/smartv3/view/MaskView;->setBorderColor(I)V

    const/4 p2, 0x2

    .line 54
    invoke-virtual {p1, p2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    invoke-virtual {p0, p2}, Lcom/sma/smartv3/view/MaskView;->setBorderWidth(F)V

    const/4 p2, 0x6

    .line 55
    invoke-virtual {p1, p2, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    invoke-virtual {p0, p2}, Lcom/sma/smartv3/view/MaskView;->setTextColor(I)V

    const/16 p2, 0x8

    .line 56
    invoke-virtual {p1, p2, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    invoke-virtual {p0, p2}, Lcom/sma/smartv3/view/MaskView;->setTextSize(F)V

    const/4 p2, 0x4

    .line 57
    invoke-virtual {p1, p2, v6}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    invoke-virtual {p0, p2}, Lcom/sma/smartv3/view/MaskView;->setGuideLineOffset(F)V

    const/4 p2, 0x7

    .line 58
    invoke-virtual {p1, p2, v7}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    invoke-virtual {p0, p2}, Lcom/sma/smartv3/view/MaskView;->setTextMargin(F)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_2

    :goto_1
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    throw p2

    .line 60
    :cond_1
    :goto_2
    const-string p1, ""

    iput-object p1, p0, Lcom/sma/smartv3/view/MaskView;->iOiXi11II:Ljava/lang/String;

    .line 61
    iput-object p1, p0, Lcom/sma/smartv3/view/MaskView;->X00XIX1:Ljava/lang/String;

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

    .line 62
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/view/MaskView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public final OXO1(Landroid/graphics/Canvas;Lcom/sma/smartv3/view/MaskView$OXO1;Landroid/graphics/RectF;)V
    .locals 13

    move-object/from16 v6, p3

    iget v0, v6, Landroid/graphics/RectF;->top:F

    iget v1, p0, Lcom/sma/smartv3/view/MaskView;->iXiX011:F

    sub-float v7, v0, v1

    iget v1, p0, Lcom/sma/smartv3/view/MaskView;->iIXi1iiXI:F

    sub-float v2, v0, v1

    new-instance v8, Landroid/graphics/Rect;

    invoke-direct {v8}, Landroid/graphics/Rect;-><init>()V

    iget-object v0, p0, Lcom/sma/smartv3/view/MaskView;->XXO:Landroid/graphics/Paint;

    iget-object v1, p0, Lcom/sma/smartv3/view/MaskView;->iOiXi11II:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v9, 0x0

    invoke-virtual {v0, v1, v9, v3, v8}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    invoke-virtual {v8}, Landroid/graphics/Rect;->width()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p2}, Lcom/sma/smartv3/view/MaskView$OXO1;->I0IIOi()F

    move-result v1

    const/4 v3, 0x2

    int-to-float v10, v3

    div-float/2addr v0, v10

    sub-float/2addr v1, v0

    const/high16 v11, 0x42700000    # 60.0f

    sub-float v3, v1, v11

    invoke-virtual {p2}, Lcom/sma/smartv3/view/MaskView$OXO1;->I0IIOi()F

    move-result v1

    add-float/2addr v1, v0

    add-float v12, v1, v11

    iget v1, v6, Landroid/graphics/RectF;->left:F

    cmpl-float v0, v3, v1

    if-lez v0, :cond_0

    iget-object v5, p0, Lcom/sma/smartv3/view/MaskView;->Ii1iii0:Landroid/graphics/Paint;

    move v4, v2

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    :cond_0
    iget v3, v6, Landroid/graphics/RectF;->right:F

    cmpg-float v0, v12, v3

    if-gez v0, :cond_1

    iget-object v5, p0, Lcom/sma/smartv3/view/MaskView;->Ii1iii0:Landroid/graphics/Paint;

    move v4, v2

    move-object v0, p1

    move v1, v12

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    :cond_1
    iget v1, v6, Landroid/graphics/RectF;->left:F

    const/high16 v0, 0x41700000    # 15.0f

    div-float v12, v0, v10

    move v0, v2

    sub-float v2, v0, v12

    add-float v4, v0, v12

    iget-object v5, p0, Lcom/sma/smartv3/view/MaskView;->iiiO:Landroid/graphics/Paint;

    move v3, v1

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget v1, v6, Landroid/graphics/RectF;->right:F

    iget-object v5, p0, Lcom/sma/smartv3/view/MaskView;->iiiO:Landroid/graphics/Paint;

    move v3, v1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget-object v1, p0, Lcom/sma/smartv3/view/MaskView;->iOiXi11II:Ljava/lang/String;

    invoke-virtual {p2}, Lcom/sma/smartv3/view/MaskView$OXO1;->I0IIOi()F

    move-result v2

    iget-object v3, p0, Lcom/sma/smartv3/view/MaskView;->XXO:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v2, v7, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    iget v1, v6, Landroid/graphics/RectF;->left:F

    iget v2, p0, Lcom/sma/smartv3/view/MaskView;->iXiX011:F

    sub-float v7, v1, v2

    iget v2, p0, Lcom/sma/smartv3/view/MaskView;->iIXi1iiXI:F

    sub-float/2addr v1, v2

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    iget-object v2, p0, Lcom/sma/smartv3/view/MaskView;->XXO:Landroid/graphics/Paint;

    iget-object v3, p0, Lcom/sma/smartv3/view/MaskView;->X00XIX1:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {v2, v3, v9, v4, v8}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    invoke-virtual {v8}, Landroid/graphics/Rect;->width()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p2}, Lcom/sma/smartv3/view/MaskView$OXO1;->OIi0()F

    move-result v3

    div-float/2addr v2, v10

    sub-float/2addr v3, v2

    sub-float v4, v3, v11

    invoke-virtual {p2}, Lcom/sma/smartv3/view/MaskView$OXO1;->OIi0()F

    move-result v3

    add-float/2addr v3, v2

    add-float v8, v3, v11

    iget v2, v6, Landroid/graphics/RectF;->top:F

    cmpl-float v3, v4, v2

    if-lez v3, :cond_2

    iget-object v5, p0, Lcom/sma/smartv3/view/MaskView;->Ii1iii0:Landroid/graphics/Paint;

    move v3, v1

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    :cond_2
    iget v4, v6, Landroid/graphics/RectF;->bottom:F

    cmpg-float v0, v8, v4

    if-gez v0, :cond_3

    iget-object v5, p0, Lcom/sma/smartv3/view/MaskView;->Ii1iii0:Landroid/graphics/Paint;

    move v3, v1

    move-object v0, p1

    move v2, v8

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    :cond_3
    move v0, v1

    sub-float v1, v0, v12

    iget v2, v6, Landroid/graphics/RectF;->top:F

    add-float v3, v0, v12

    iget-object v5, p0, Lcom/sma/smartv3/view/MaskView;->iiiO:Landroid/graphics/Paint;

    move v4, v2

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget v2, v6, Landroid/graphics/RectF;->bottom:F

    iget-object v5, p0, Lcom/sma/smartv3/view/MaskView;->iiiO:Landroid/graphics/Paint;

    move v4, v2

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    invoke-virtual {p2}, Lcom/sma/smartv3/view/MaskView$OXO1;->OIi0()F

    move-result v1

    invoke-virtual {p1, v7, v1}, Landroid/graphics/Canvas;->translate(FF)V

    const/high16 v1, -0x3d4c0000    # -90.0f

    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->rotate(F)V

    iget-object v1, p0, Lcom/sma/smartv3/view/MaskView;->X00XIX1:Ljava/lang/String;

    iget-object v2, p0, Lcom/sma/smartv3/view/MaskView;->XXO:Landroid/graphics/Paint;

    const/4 v3, 0x0

    invoke-virtual {p1, v1, v3, v3, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method public final XIi00iiXO(III)V
    .locals 2

    mul-int/lit8 v0, p1, 0x2

    iput v0, p0, Lcom/sma/smartv3/view/MaskView;->OO:I

    const-string v0, ""

    iput-object v0, p0, Lcom/sma/smartv3/view/MaskView;->iOiXi11II:Ljava/lang/String;

    iput-object v0, p0, Lcom/sma/smartv3/view/MaskView;->X00XIX1:Ljava/lang/String;

    sub-int v0, p2, p1

    sub-int v1, p3, p1

    add-int/2addr p2, p1

    add-int/2addr p3, p1

    new-instance p1, Landroid/graphics/RectF;

    int-to-float v0, v0

    int-to-float v1, v1

    int-to-float p2, p2

    int-to-float p3, p3

    invoke-direct {p1, v0, v1, p2, p3}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object p1, p0, Lcom/sma/smartv3/view/MaskView;->XX1Oi:Landroid/graphics/RectF;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/sma/smartv3/view/MaskView;->X100O:Landroid/graphics/RectF;

    new-instance p1, Lcom/sma/smartv3/view/MaskView$OXO1;

    invoke-direct {p1, v0, v1, p2, p3}, Lcom/sma/smartv3/view/MaskView$OXO1;-><init>(FFFF)V

    iput-object p1, p0, Lcom/sma/smartv3/view/MaskView;->OX110i:Lcom/sma/smartv3/view/MaskView$OXO1;

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final getBorderColor()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/view/MaskView;->X11iII1O1:I

    return v0
.end method

.method public final getBorderWidth()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/view/MaskView;->XXX11i:F

    return v0
.end method

.method public final getCoordinates()Lcom/sma/smartv3/view/MaskView$OXO1;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/view/MaskView;->OX110i:Lcom/sma/smartv3/view/MaskView$OXO1;

    return-object v0
.end method

.method public final getCornerRadius()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/view/MaskView;->I1:F

    return v0
.end method

.method public final getGuideLineOffset()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/view/MaskView;->iIXi1iiXI:F

    return v0
.end method

.method public final getHollowShape()Lcom/sma/smartv3/view/MaskView$HollowShape;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/view/MaskView;->IO:Lcom/sma/smartv3/view/MaskView$HollowShape;

    return-object v0
.end method

.method public final getMaskColor()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/view/MaskView;->iX1O1:I

    return v0
.end method

.method public final getNorthText()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/view/MaskView;->iOiXi11II:Ljava/lang/String;

    return-object v0
.end method

.method public final getTextColor()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/view/MaskView;->X1IX:I

    return v0
.end method

.method public final getTextMargin()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/view/MaskView;->iXiX011:F

    return v0
.end method

.method public final getTextSize()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/view/MaskView;->X0i1O:F

    return v0
.end method

.method public final getWestText()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/view/MaskView;->X00XIX1:Ljava/lang/String;

    return-object v0
.end method

.method public final iO(II)V
    .locals 1

    iput p1, p0, Lcom/sma/smartv3/view/MaskView;->OO:I

    iput p2, p0, Lcom/sma/smartv3/view/MaskView;->XOX0O0:I

    sget-object v0, Lcom/sma/smartv3/view/MaskView$HollowShape;->SQUARE:Lcom/sma/smartv3/view/MaskView$HollowShape;

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/view/MaskView;->setHollowShape(Lcom/sma/smartv3/view/MaskView$HollowShape;)V

    const-string v0, ""

    iput-object v0, p0, Lcom/sma/smartv3/view/MaskView;->iOiXi11II:Ljava/lang/String;

    iput-object v0, p0, Lcom/sma/smartv3/view/MaskView;->X00XIX1:Ljava/lang/String;

    int-to-float p2, p2

    int-to-float p1, p1

    add-float/2addr p1, p2

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0, p2, p2, p1, p1}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v0, p0, Lcom/sma/smartv3/view/MaskView;->X100O:Landroid/graphics/RectF;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/sma/smartv3/view/MaskView;->XX1Oi:Landroid/graphics/RectF;

    new-instance v0, Lcom/sma/smartv3/view/MaskView$OXO1;

    invoke-direct {v0, p2, p2, p1, p1}, Lcom/sma/smartv3/view/MaskView$OXO1;-><init>(FFFF)V

    iput-object v0, p0, Lcom/sma/smartv3/view/MaskView;->OX110i:Lcom/sma/smartv3/view/MaskView$OXO1;

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 7
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v4, v0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v5, v0

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->saveLayer(FFFFLandroid/graphics/Paint;)I

    move-result p1

    move-object v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v3, v1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v4, v1

    iget-object v5, p0, Lcom/sma/smartv3/view/MaskView;->O001I:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    iget-object v1, p0, Lcom/sma/smartv3/view/MaskView;->O001I:Landroid/graphics/Paint;

    new-instance v2, Landroid/graphics/PorterDuffXfermode;

    sget-object v3, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v2, v3}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    iget-object v1, p0, Lcom/sma/smartv3/view/MaskView;->IO:Lcom/sma/smartv3/view/MaskView$HollowShape;

    sget-object v2, Lcom/sma/smartv3/view/MaskView$XIi00iiXO;->OXO1:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    iget-object v1, p0, Lcom/sma/smartv3/view/MaskView;->XX1Oi:Landroid/graphics/RectF;

    if-eqz v1, :cond_2

    iget-object v5, p0, Lcom/sma/smartv3/view/MaskView;->O001I:Landroid/graphics/Paint;

    invoke-virtual {v0, v1, v5}, Landroid/graphics/Canvas;->drawOval(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    iget-object v1, p0, Lcom/sma/smartv3/view/MaskView;->X100O:Landroid/graphics/RectF;

    if-eqz v1, :cond_2

    iget v5, p0, Lcom/sma/smartv3/view/MaskView;->I1:F

    iget-object v6, p0, Lcom/sma/smartv3/view/MaskView;->O001I:Landroid/graphics/Paint;

    invoke-virtual {v0, v1, v5, v5, v6}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    :cond_2
    :goto_0
    iget-object v1, p0, Lcom/sma/smartv3/view/MaskView;->O001I:Landroid/graphics/Paint;

    const/4 v5, 0x0

    invoke-virtual {v1, v5}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    invoke-virtual {v0, p1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    iget-object p1, p0, Lcom/sma/smartv3/view/MaskView;->IO:Lcom/sma/smartv3/view/MaskView$HollowShape;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v2, p1

    if-eq p1, v4, :cond_4

    if-ne p1, v3, :cond_3

    iget-object p1, p0, Lcom/sma/smartv3/view/MaskView;->XX1Oi:Landroid/graphics/RectF;

    if-eqz p1, :cond_5

    iget-object v1, p0, Lcom/sma/smartv3/view/MaskView;->iXiiiO:Landroid/graphics/Paint;

    invoke-virtual {v0, p1, v1}, Landroid/graphics/Canvas;->drawOval(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    iget-object v1, p0, Lcom/sma/smartv3/view/MaskView;->OX110i:Lcom/sma/smartv3/view/MaskView$OXO1;

    if-eqz v1, :cond_5

    invoke-virtual {p0, v0, v1, p1}, Lcom/sma/smartv3/view/MaskView;->OXO1(Landroid/graphics/Canvas;Lcom/sma/smartv3/view/MaskView$OXO1;Landroid/graphics/RectF;)V

    return-void

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    iget-object p1, p0, Lcom/sma/smartv3/view/MaskView;->X100O:Landroid/graphics/RectF;

    if-eqz p1, :cond_5

    iget v1, p0, Lcom/sma/smartv3/view/MaskView;->I1:F

    iget-object v2, p0, Lcom/sma/smartv3/view/MaskView;->iXiiiO:Landroid/graphics/Paint;

    invoke-virtual {v0, p1, v1, v1, v2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    iget-object v1, p0, Lcom/sma/smartv3/view/MaskView;->OX110i:Lcom/sma/smartv3/view/MaskView$OXO1;

    if-eqz v1, :cond_5

    invoke-virtual {p0, v0, v1, p1}, Lcom/sma/smartv3/view/MaskView;->OXO1(Landroid/graphics/Canvas;Lcom/sma/smartv3/view/MaskView$OXO1;Landroid/graphics/RectF;)V

    :cond_5
    return-void
.end method

.method public final setBorderColor(I)V
    .locals 1

    iput p1, p0, Lcom/sma/smartv3/view/MaskView;->X11iII1O1:I

    iget-object v0, p0, Lcom/sma/smartv3/view/MaskView;->iXiiiO:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lcom/sma/smartv3/view/MaskView;->Ii1iii0:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lcom/sma/smartv3/view/MaskView;->iiiO:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setBorderWidth(F)V
    .locals 1

    iput p1, p0, Lcom/sma/smartv3/view/MaskView;->XXX11i:F

    iget-object v0, p0, Lcom/sma/smartv3/view/MaskView;->iXiiiO:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v0, p0, Lcom/sma/smartv3/view/MaskView;->Ii1iii0:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setCircleHollow(I)V
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-virtual {p0, p1, v0, v1}, Lcom/sma/smartv3/view/MaskView;->XIi00iiXO(III)V

    return-void
.end method

.method public final setCornerRadius(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/view/MaskView;->I1:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setDirectionsText(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "str"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/view/MaskView;->iOiXi11II:Ljava/lang/String;

    iput-object p1, p0, Lcom/sma/smartv3/view/MaskView;->X00XIX1:Ljava/lang/String;

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setGuideLineOffset(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/view/MaskView;->iIXi1iiXI:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setHollowShape(Lcom/sma/smartv3/view/MaskView$HollowShape;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/view/MaskView$HollowShape;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/view/MaskView;->IO:Lcom/sma/smartv3/view/MaskView$HollowShape;

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setMaskColor(I)V
    .locals 1

    iput p1, p0, Lcom/sma/smartv3/view/MaskView;->iX1O1:I

    iget-object v0, p0, Lcom/sma/smartv3/view/MaskView;->O001I:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setNorthText(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/view/MaskView;->iOiXi11II:Ljava/lang/String;

    return-void
.end method

.method public final setTextColor(I)V
    .locals 1

    iput p1, p0, Lcom/sma/smartv3/view/MaskView;->X1IX:I

    iget-object v0, p0, Lcom/sma/smartv3/view/MaskView;->XXO:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setTextMargin(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/view/MaskView;->iXiX011:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setTextSize(F)V
    .locals 1

    iput p1, p0, Lcom/sma/smartv3/view/MaskView;->X0i1O:F

    iget-object v0, p0, Lcom/sma/smartv3/view/MaskView;->XXO:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setWestText(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/view/MaskView;->X00XIX1:Ljava/lang/String;

    return-void
.end method
