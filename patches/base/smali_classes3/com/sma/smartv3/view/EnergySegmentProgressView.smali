.class public final Lcom/sma/smartv3/view/EnergySegmentProgressView;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/view/EnergySegmentProgressView$OXO1;
    }
.end annotation


# static fields
.field public static final OX110i:F = 30.0f
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final X100O:I = 0x33
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final X11I:I = 0x5
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final XX1Oi:F = 30.0f
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final iiiO:Lcom/sma/smartv3/view/EnergySegmentProgressView$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# instance fields
.field public final I1:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final IO:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public Ii1iii0:I

.field public O001I:F

.field public X0i1O:F

.field public final X11iII1O1:Landroid/graphics/Path;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public X1IX:F

.field public final XXO:[I
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public XXX11i:F

.field public iIXi1iiXI:F

.field public final iX1O1:Landroid/graphics/RectF;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public iXiX011:F

.field public final iXiiiO:[I
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/sma/smartv3/view/EnergySegmentProgressView$OXO1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sma/smartv3/view/EnergySegmentProgressView$OXO1;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->iiiO:Lcom/sma/smartv3/view/EnergySegmentProgressView$OXO1;

    return-void
.end method

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

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/view/EnergySegmentProgressView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/view/EnergySegmentProgressView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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
    new-instance p1, Landroid/graphics/Paint;

    const/4 p3, 0x1

    invoke-direct {p1, p3}, Landroid/graphics/Paint;-><init>(I)V

    .line 5
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 6
    iput-object p1, p0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->IO:Landroid/graphics/Paint;

    .line 7
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, p3}, Landroid/graphics/Paint;-><init>(I)V

    .line 8
    sget-object p3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const/4 p3, -0x1

    .line 9
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 10
    sget-object v0, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 11
    sget-object v0, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 12
    iput-object p1, p0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->I1:Landroid/graphics/Paint;

    .line 13
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->iX1O1:Landroid/graphics/RectF;

    .line 14
    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->X11iII1O1:Landroid/graphics/Path;

    const/4 p1, 0x5

    .line 15
    new-array v0, p1, [I

    iput-object v0, p0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->XXO:[I

    .line 16
    new-array p1, p1, [I

    iput-object p1, p0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->iXiiiO:[I

    .line 17
    iput p3, p0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->Ii1iii0:I

    .line 18
    invoke-virtual {p0, p2}, Lcom/sma/smartv3/view/EnergySegmentProgressView;->iO(Landroid/util/AttributeSet;)V

    .line 19
    invoke-virtual {p0}, Lcom/sma/smartv3/view/EnergySegmentProgressView;->OXO1()V

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

    .line 20
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/view/EnergySegmentProgressView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public final OXO1()V
    .locals 6

    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x5

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->XXO:[I

    aget v1, v1, v0

    iget-object v2, p0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->iXiiiO:[I

    invoke-static {v1}, Landroid/graphics/Color;->red(I)I

    move-result v3

    invoke-static {v1}, Landroid/graphics/Color;->green(I)I

    move-result v4

    invoke-static {v1}, Landroid/graphics/Color;->blue(I)I

    move-result v1

    const/16 v5, 0x33

    invoke-static {v5, v3, v4, v1}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    aput v1, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final XIi00iiXO(Landroid/graphics/Canvas;FFI)V
    .locals 6

    iget-object v0, p0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->X11iII1O1:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    iget v0, p0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->iIXi1iiXI:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iget v1, p0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->iXiX011:F

    sub-float v1, p3, v1

    iget v2, p0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->O001I:F

    sub-float v3, p2, v2

    add-float v4, p2, v2

    sub-float/2addr p3, v2

    add-float v5, p2, v0

    sub-float/2addr v5, v2

    add-float/2addr v1, v2

    sub-float/2addr p2, v0

    add-float/2addr p2, v2

    iget-object v0, p0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->X11iII1O1:Landroid/graphics/Path;

    invoke-virtual {v0, v3, p3}, Landroid/graphics/Path;->moveTo(FF)V

    iget-object v0, p0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->X11iII1O1:Landroid/graphics/Path;

    invoke-virtual {v0, v4, p3}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object p3, p0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->X11iII1O1:Landroid/graphics/Path;

    invoke-virtual {p3, v5, v1}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object p3, p0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->X11iII1O1:Landroid/graphics/Path;

    invoke-virtual {p3, p2, v1}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object p2, p0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->X11iII1O1:Landroid/graphics/Path;

    invoke-virtual {p2}, Landroid/graphics/Path;->close()V

    iget-object p2, p0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->IO:Landroid/graphics/Paint;

    invoke-virtual {p2, p4}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p2, p0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->X11iII1O1:Landroid/graphics/Path;

    iget-object p3, p0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->IO:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, p3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    iget-object p2, p0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->X11iII1O1:Landroid/graphics/Path;

    iget-object p3, p0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->I1:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, p3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    return-void
.end method

.method public final getSelectIndex()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->Ii1iii0:I

    return v0
.end method

.method public final iO(Landroid/util/AttributeSet;)V
    .locals 12

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lcom/sma/smartv3/R$styleable;->SegmentProgressView:[I

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const-string v0, "obtainStyledAttributes(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v0, 0x41000000    # 8.0f

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->XXX11i:F

    const/high16 v0, 0x40c00000    # 6.0f

    const/4 v2, 0x1

    invoke-virtual {p1, v2, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->X1IX:F

    const/4 v0, 0x5

    const/high16 v3, 0x40000000    # 2.0f

    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v4

    iput v4, p0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->X0i1O:F

    const/16 v4, 0x9

    const/high16 v5, 0x41f00000    # 30.0f

    invoke-virtual {p1, v4, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v4

    iput v4, p0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->iIXi1iiXI:F

    const/16 v4, 0x8

    invoke-virtual {p1, v4, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v4

    iput v4, p0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->iXiX011:F

    const/4 v4, 0x0

    invoke-virtual {p1, v4, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v3

    iput v3, p0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->O001I:F

    const/4 v3, -0x1

    const/4 v5, 0x4

    invoke-virtual {p1, v5, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    invoke-virtual {p0, v3}, Lcom/sma/smartv3/view/EnergySegmentProgressView;->setSelectIndex(I)V

    iget-object v3, p0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->I1:Landroid/graphics/Paint;

    iget v6, p0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->X0i1O:F

    invoke-virtual {v3, v6}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    const/4 v3, 0x3

    invoke-virtual {p1, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_2

    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v7

    if-nez v7, :cond_0

    goto :goto_1

    :cond_0
    const-string v1, ","

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v7

    const/4 v10, 0x6

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lkotlin/text/StringsKt__StringsKt;->i1I(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    :goto_0
    if-ge v4, v0, :cond_3

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v4, v2, :cond_1

    iget-object v2, p0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->XXO:[I

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lkotlin/text/StringsKt__StringsKt;->iX1X1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    aput v3, v2, v4

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->XXO:[I

    const v6, -0x1ac6cb

    aput v6, v0, v4

    const v4, -0x47400

    aput v4, v0, v2

    const v2, -0x227cb

    aput v2, v0, v1

    const v1, -0xbc5fb9

    aput v1, v0, v3

    const v1, -0xe1771b

    aput v1, v0, v5

    :cond_3
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 24
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/16 v6, 0x8

    const-string v8, "canvas"

    invoke-static {v1, v8}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super/range {p0 .. p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v8

    int-to-float v8, v8

    iget v9, v0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->iXiX011:F

    const/high16 v10, 0x41f00000    # 30.0f

    add-float/2addr v10, v9

    const/high16 v11, 0x41700000    # 15.0f

    add-float/2addr v11, v9

    iget v12, v0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->XXX11i:F

    const/4 v13, 0x4

    int-to-float v14, v13

    mul-float/2addr v12, v14

    sub-float/2addr v8, v12

    const/4 v12, 0x5

    int-to-float v14, v12

    div-float/2addr v8, v14

    const/4 v15, 0x0

    move v2, v15

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v16, 0x7

    const/16 v17, 0x6

    const/16 v18, 0x3

    :goto_0
    if-ge v2, v12, :cond_4

    const/16 v19, 0x2

    add-float v5, v3, v8

    const/16 v20, 0x1

    iget-object v7, v0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->iX1O1:Landroid/graphics/RectF;

    invoke-virtual {v7, v3, v9, v5, v10}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v7, v0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->IO:Landroid/graphics/Paint;

    move/from16 v21, v12

    iget v12, v0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->Ii1iii0:I

    if-ne v2, v12, :cond_0

    iget-object v12, v0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->XXO:[I

    aget v12, v12, v2

    goto :goto_1

    :cond_0
    iget-object v12, v0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->iXiiiO:[I

    aget v12, v12, v2

    :goto_1
    invoke-virtual {v7, v12}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v7, v0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->X11iII1O1:Landroid/graphics/Path;

    invoke-virtual {v7}, Landroid/graphics/Path;->reset()V

    if-eqz v2, :cond_2

    if-eq v2, v13, :cond_1

    iget-object v7, v0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->iX1O1:Landroid/graphics/RectF;

    iget-object v12, v0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->IO:Landroid/graphics/Paint;

    invoke-virtual {v1, v7, v12}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    move/from16 v22, v13

    const/16 v23, 0x0

    goto :goto_2

    :cond_1
    iget-object v7, v0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->X11iII1O1:Landroid/graphics/Path;

    iget-object v12, v0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->iX1O1:Landroid/graphics/RectF;

    move/from16 v22, v13

    iget v13, v0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->X1IX:F

    const/16 v23, 0x0

    new-array v14, v6, [F

    aput v23, v14, v15

    aput v23, v14, v20

    aput v13, v14, v19

    aput v13, v14, v18

    aput v13, v14, v22

    aput v13, v14, v21

    aput v23, v14, v17

    aput v23, v14, v16

    sget-object v13, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {v7, v12, v14, v13}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    iget-object v7, v0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->X11iII1O1:Landroid/graphics/Path;

    iget-object v12, v0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->IO:Landroid/graphics/Paint;

    invoke-virtual {v1, v7, v12}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    goto :goto_2

    :cond_2
    move/from16 v22, v13

    const/16 v23, 0x0

    iget-object v7, v0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->X11iII1O1:Landroid/graphics/Path;

    iget-object v12, v0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->iX1O1:Landroid/graphics/RectF;

    iget v13, v0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->X1IX:F

    new-array v14, v6, [F

    aput v13, v14, v15

    aput v13, v14, v20

    aput v23, v14, v19

    aput v23, v14, v18

    aput v23, v14, v22

    aput v23, v14, v21

    aput v13, v14, v17

    aput v13, v14, v16

    sget-object v13, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {v7, v12, v14, v13}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    iget-object v7, v0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->X11iII1O1:Landroid/graphics/Path;

    iget-object v12, v0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->IO:Landroid/graphics/Paint;

    invoke-virtual {v1, v7, v12}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    :goto_2
    iget v7, v0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->Ii1iii0:I

    if-ne v2, v7, :cond_3

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, v8, v4

    add-float/2addr v4, v3

    :cond_3
    iget v3, v0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->XXX11i:F

    add-float/2addr v3, v5

    add-int/lit8 v2, v2, 0x1

    move/from16 v12, v21

    move/from16 v13, v22

    goto/16 :goto_0

    :cond_4
    iget v2, v0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->Ii1iii0:I

    if-ltz v2, :cond_5

    iget-object v3, v0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->XXO:[I

    aget v2, v3, v2

    invoke-virtual {v0, v1, v4, v11, v2}, Lcom/sma/smartv3/view/EnergySegmentProgressView;->XIi00iiXO(Landroid/graphics/Canvas;FFI)V

    :cond_5
    return-void
.end method

.method public onMeasure(II)V
    .locals 1

    const/high16 p2, 0x41f00000    # 30.0f

    iget v0, p0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->iXiX011:F

    add-float/2addr v0, p2

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    float-to-int p2, v0

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public final setSelectColorList(Ljava/util/List;)V
    .locals 3
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    const-string v0, "colors"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x5

    if-ge v0, v1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->XXO:[I

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    aput v2, v1, v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/sma/smartv3/view/EnergySegmentProgressView;->OXO1()V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setSelectIndex(I)V
    .locals 1

    const/4 v0, -0x1

    if-gt v0, p1, :cond_0

    const/4 v0, 0x5

    if-ge p1, v0, :cond_0

    iput p1, p0, Lcom/sma/smartv3/view/EnergySegmentProgressView;->Ii1iii0:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_0
    return-void
.end method
