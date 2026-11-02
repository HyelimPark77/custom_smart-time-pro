.class public final Lcom/sma/smartv3/view/PillTabView;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPillTabView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PillTabView.kt\ncom/sma/smartv3/view/PillTabView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,181:1\n1#2:182\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPillTabView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PillTabView.kt\ncom/sma/smartv3/view/PillTabView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,181:1\n1#2:182\n*E\n"
    }
.end annotation


# instance fields
.field public final I1:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final IO:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public X11iII1O1:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public X1IX:Lkotlin/jvm/functions/Function1;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public XXX11i:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public iX1O1:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iput-object v0, p0, Lcom/sma/smartv3/view/PillTabView;->IO:Landroid/graphics/Paint;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iput-object v0, p0, Lcom/sma/smartv3/view/PillTabView;->I1:Landroid/graphics/Paint;

    iput-boolean v1, p0, Lcom/sma/smartv3/view/PillTabView;->iX1O1:Z

    const-string v0, ""

    iput-object v0, p0, Lcom/sma/smartv3/view/PillTabView;->X11iII1O1:Ljava/lang/String;

    iput-object v0, p0, Lcom/sma/smartv3/view/PillTabView;->XXX11i:Ljava/lang/String;

    sget-object v0, Lcom/sma/smartv3/R$styleable;->PillTabView:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const-string p2, "obtainStyledAttributes(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x0

    :try_start_0
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/view/PillTabView;->OXO1(Landroid/content/res/TypedArray;I)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/sma/smartv3/view/PillTabView;->X11iII1O1:Ljava/lang/String;

    invoke-virtual {p0, p1, v1}, Lcom/sma/smartv3/view/PillTabView;->OXO1(Landroid/content/res/TypedArray;I)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/sma/smartv3/view/PillTabView;->XXX11i:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void

    :catchall_0
    move-exception p2

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    throw p2
.end method


# virtual methods
.method public final OXO1(Landroid/content/res/TypedArray;I)Ljava/lang/String;
    .locals 2

    const/4 v0, -0x1

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    if-eq v1, v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final XIi00iiXO()V
    .locals 2

    iget-boolean v0, p0, Lcom/sma/smartv3/view/PillTabView;->iX1O1:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/view/PillTabView;->iX1O1:Z

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    iget-object v0, p0, Lcom/sma/smartv3/view/PillTabView;->X1IX:Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_0

    iget-boolean v1, p0, Lcom/sma/smartv3/view/PillTabView;->iX1O1:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final XO0O10(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/view/PillTabView;->iX1O1:Z

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final getOnTabSelected()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/view/PillTabView;->X1IX:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final iO()V
    .locals 2

    iget-boolean v0, p0, Lcom/sma/smartv3/view/PillTabView;->iX1O1:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/sma/smartv3/view/PillTabView;->iX1O1:Z

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    iget-object v0, p0, Lcom/sma/smartv3/view/PillTabView;->X1IX:Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_0

    iget-boolean v1, p0, Lcom/sma/smartv3/view/PillTabView;->iX1O1:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 28
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/16 v6, 0x8

    const/4 v7, 0x1

    const-string v8, "canvas"

    invoke-static {v1, v8}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super/range {p0 .. p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v8

    int-to-float v12, v8

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v8

    int-to-float v13, v8

    const/4 v8, 0x2

    int-to-float v9, v8

    div-float v20, v13, v9

    const/4 v10, 0x7

    int-to-float v11, v10

    mul-float/2addr v11, v12

    const/16 v14, 0xa

    int-to-float v14, v14

    div-float v16, v11, v14

    move/from16 v17, v13

    new-instance v13, Landroid/graphics/Path;

    invoke-direct {v13}, Landroid/graphics/Path;-><init>()V

    iget-boolean v11, v0, Lcom/sma/smartv3/view/PillTabView;->iX1O1:Z

    const/high16 v14, 0x43340000    # 180.0f

    const/high16 v15, 0x42b40000    # 90.0f

    const/16 v21, 0x6

    const/high16 v2, -0x3ccc0000    # -180.0f

    const/16 v22, 0x5

    const/high16 v3, 0x43870000    # 270.0f

    const/16 v23, 0x4

    const/4 v4, 0x0

    const/16 v24, 0x3

    const/4 v5, 0x0

    if-eqz v11, :cond_0

    new-array v11, v6, [F

    aput v20, v11, v4

    aput v20, v11, v7

    aput v20, v11, v8

    aput v20, v11, v24

    aput v20, v11, v23

    aput v20, v11, v22

    aput v20, v11, v21

    aput v20, v11, v10

    sget-object v19, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    move/from16 v18, v14

    const/4 v14, 0x0

    move/from16 v25, v15

    const/4 v15, 0x0

    move/from16 v27, v25

    move/from16 v25, v8

    move/from16 v8, v27

    move/from16 v27, v18

    move-object/from16 v18, v11

    move/from16 v11, v27

    invoke-virtual/range {v13 .. v19}, Landroid/graphics/Path;->addRoundRect(FFFF[FLandroid/graphics/Path$Direction;)V

    move-object v15, v13

    move/from16 v14, v16

    move/from16 v13, v17

    move/from16 v17, v7

    move/from16 v16, v10

    goto :goto_0

    :cond_0
    move/from16 v25, v8

    move v11, v14

    move v8, v15

    move/from16 v14, v16

    move-object v15, v13

    move/from16 v13, v17

    invoke-virtual {v15, v5, v5}, Landroid/graphics/Path;->moveTo(FF)V

    move/from16 v16, v10

    sub-float v10, v14, v20

    invoke-virtual {v15, v10, v5}, Landroid/graphics/Path;->lineTo(FF)V

    new-instance v10, Landroid/graphics/RectF;

    move/from16 v17, v7

    mul-float v7, v9, v20

    sub-float v6, v14, v7

    invoke-direct {v10, v6, v5, v14, v13}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-virtual {v15, v10, v3, v2, v4}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FFZ)V

    invoke-virtual {v15, v5, v13}, Landroid/graphics/Path;->lineTo(FF)V

    new-instance v6, Landroid/graphics/RectF;

    invoke-direct {v6, v5, v5, v7, v13}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-virtual {v15, v6, v8, v11, v4}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FFZ)V

    invoke-virtual {v15}, Landroid/graphics/Path;->close()V

    :goto_0
    iget-object v6, v0, Lcom/sma/smartv3/view/PillTabView;->IO:Landroid/graphics/Paint;

    iget-boolean v7, v0, Lcom/sma/smartv3/view/PillTabView;->iX1O1:Z

    const-string v19, "#C9C9C9"

    const-string v26, "#FF7400"

    if-eqz v7, :cond_1

    invoke-static/range {v26 .. v26}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v7

    goto :goto_1

    :cond_1
    invoke-static/range {v19 .. v19}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v7

    :goto_1
    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v6, v0, Lcom/sma/smartv3/view/PillTabView;->IO:Landroid/graphics/Paint;

    invoke-virtual {v1, v15, v6}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    const/high16 v6, 0x41900000    # 18.0f

    add-float/2addr v6, v14

    move v7, v9

    new-instance v9, Landroid/graphics/Path;

    invoke-direct {v9}, Landroid/graphics/Path;-><init>()V

    iget-boolean v10, v0, Lcom/sma/smartv3/view/PillTabView;->iX1O1:Z

    if-eqz v10, :cond_2

    sub-float v10, v6, v20

    invoke-virtual {v9, v10, v5}, Landroid/graphics/Path;->moveTo(FF)V

    sub-float v15, v12, v20

    invoke-virtual {v9, v15, v5}, Landroid/graphics/Path;->lineTo(FF)V

    new-instance v15, Landroid/graphics/RectF;

    mul-float v16, v7, v20

    sub-float v2, v12, v16

    invoke-direct {v15, v2, v5, v12, v13}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-virtual {v9, v15, v3, v11, v4}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FFZ)V

    invoke-virtual {v9, v10, v13}, Landroid/graphics/Path;->lineTo(FF)V

    new-instance v2, Landroid/graphics/RectF;

    sub-float v3, v6, v16

    invoke-direct {v2, v3, v5, v6, v13}, Landroid/graphics/RectF;-><init>(FFFF)V

    const/high16 v3, -0x3ccc0000    # -180.0f

    invoke-virtual {v9, v2, v8, v3, v4}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FFZ)V

    invoke-virtual {v9}, Landroid/graphics/Path;->close()V

    move/from16 v16, v14

    goto :goto_2

    :cond_2
    mul-float v2, v7, v20

    sub-float v10, v6, v2

    const/16 v2, 0x8

    new-array v2, v2, [F

    aput v20, v2, v4

    aput v20, v2, v17

    aput v20, v2, v25

    aput v20, v2, v24

    aput v20, v2, v23

    aput v20, v2, v22

    aput v20, v2, v21

    aput v20, v2, v16

    sget-object v15, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    const/4 v11, 0x0

    move/from16 v16, v14

    move-object v14, v2

    invoke-virtual/range {v9 .. v15}, Landroid/graphics/Path;->addRoundRect(FFFF[FLandroid/graphics/Path$Direction;)V

    :goto_2
    iget-object v2, v0, Lcom/sma/smartv3/view/PillTabView;->I1:Landroid/graphics/Paint;

    iget-boolean v3, v0, Lcom/sma/smartv3/view/PillTabView;->iX1O1:Z

    if-eqz v3, :cond_3

    invoke-static/range {v19 .. v19}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    goto :goto_3

    :cond_3
    invoke-static/range {v26 .. v26}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    :goto_3
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v2, v0, Lcom/sma/smartv3/view/PillTabView;->I1:Landroid/graphics/Paint;

    invoke-virtual {v1, v9, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    new-instance v2, Landroid/graphics/Paint;

    move/from16 v3, v17

    invoke-direct {v2, v3}, Landroid/graphics/Paint;-><init>(I)V

    const/high16 v3, 0x42200000    # 40.0f

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setTextSize(F)V

    sget-object v4, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    iget-boolean v5, v0, Lcom/sma/smartv3/view/PillTabView;->iX1O1:Z

    const/high16 v6, -0x1000000

    const/4 v8, -0x1

    if-eqz v5, :cond_4

    move v5, v8

    goto :goto_4

    :cond_4
    move v5, v6

    :goto_4
    invoke-virtual {v2, v5}, Landroid/graphics/Paint;->setColor(I)V

    sget-object v5, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    iget-boolean v9, v0, Lcom/sma/smartv3/view/PillTabView;->iX1O1:Z

    invoke-static {v5, v9}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object v9

    invoke-virtual {v2, v9}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    new-instance v9, Landroid/graphics/Paint;

    const/4 v10, 0x1

    invoke-direct {v9, v10}, Landroid/graphics/Paint;-><init>(I)V

    invoke-virtual {v9, v3}, Landroid/graphics/Paint;->setTextSize(F)V

    invoke-virtual {v9, v4}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    iget-boolean v3, v0, Lcom/sma/smartv3/view/PillTabView;->iX1O1:Z

    if-nez v3, :cond_5

    move v6, v8

    :cond_5
    invoke-virtual {v9, v6}, Landroid/graphics/Paint;->setColor(I)V

    iget-boolean v3, v0, Lcom/sma/smartv3/view/PillTabView;->iX1O1:Z

    xor-int/2addr v3, v10

    invoke-static {v5, v3}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object v3

    invoke-virtual {v9, v3}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    invoke-virtual {v2}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v3

    iget v4, v3, Landroid/graphics/Paint$FontMetrics;->bottom:F

    iget v3, v3, Landroid/graphics/Paint$FontMetrics;->top:F

    sub-float v3, v4, v3

    div-float/2addr v3, v7

    add-float v20, v20, v3

    sub-float v3, v20, v4

    div-float v4, v16, v7

    sub-float v12, v12, v16

    div-float/2addr v12, v7

    add-float v5, v16, v12

    iget-object v6, v0, Lcom/sma/smartv3/view/PillTabView;->X11iII1O1:Ljava/lang/String;

    const-string v7, ""

    if-nez v6, :cond_6

    move-object v6, v7

    :cond_6
    invoke-virtual {v1, v6, v4, v3, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    iget-object v2, v0, Lcom/sma/smartv3/view/PillTabView;->XXX11i:Ljava/lang/String;

    if-nez v2, :cond_7

    goto :goto_5

    :cond_7
    move-object v7, v2

    :goto_5
    invoke-virtual {v1, v7, v5, v3, v9}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_3

    if-eq v0, v1, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    mul-int/lit8 v2, v2, 0x7

    div-int/lit8 v2, v2, 0xa

    int-to-float v2, v2

    cmpg-float v0, v0, v2

    if-gez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lcom/sma/smartv3/view/PillTabView;->XIi00iiXO()V

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lcom/sma/smartv3/view/PillTabView;->iO()V

    :goto_1
    iput-boolean v1, p0, Lcom/sma/smartv3/view/PillTabView;->iX1O1:Z

    :goto_2
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    :cond_3
    return v1
.end method

.method public final setOnTabSelected(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/view/PillTabView;->X1IX:Lkotlin/jvm/functions/Function1;

    return-void
.end method
