.class public Lcom/sma/smartv3/view/PagerIndicator;
.super Landroid/view/View;
.source "SourceFile"


# static fields
.field public static final iXiX011:J = 0x258L


# instance fields
.field public I1:I

.field public IO:I

.field public X0i1O:I

.field public X11iII1O1:I

.field public X1IX:Landroid/graphics/Paint;

.field public XXX11i:I

.field public iIXi1iiXI:Ljava/lang/Runnable;

.field public iX1O1:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "context"
        }
    .end annotation

    const/4 v0, 0x0

    .line 12
    invoke-direct {p0, p1, v0}, Lcom/sma/smartv3/view/PagerIndicator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "context",
            "attrs"
        }
    .end annotation

    const/4 v0, 0x0

    .line 11
    invoke-direct {p0, p1, p2, v0}, Lcom/sma/smartv3/view/PagerIndicator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "context",
            "attrs",
            "defStyleAttr"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x5

    .line 2
    iput p1, p0, Lcom/sma/smartv3/view/PagerIndicator;->iX1O1:I

    const/16 p1, 0x28

    .line 3
    iput p1, p0, Lcom/sma/smartv3/view/PagerIndicator;->X11iII1O1:I

    const/16 p1, 0x8

    .line 4
    iput p1, p0, Lcom/sma/smartv3/view/PagerIndicator;->XXX11i:I

    const/4 p1, -0x1

    .line 5
    iput p1, p0, Lcom/sma/smartv3/view/PagerIndicator;->X0i1O:I

    .line 6
    new-instance p1, Lcom/sma/smartv3/view/PagerIndicator$OXO1;

    invoke-direct {p1, p0}, Lcom/sma/smartv3/view/PagerIndicator$OXO1;-><init>(Lcom/sma/smartv3/view/PagerIndicator;)V

    iput-object p1, p0, Lcom/sma/smartv3/view/PagerIndicator;->iIXi1iiXI:Ljava/lang/Runnable;

    .line 7
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/view/PagerIndicator;->X1IX:Landroid/graphics/Paint;

    const/4 p2, 0x1

    .line 8
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 9
    iget-object p1, p0, Lcom/sma/smartv3/view/PagerIndicator;->X1IX:Landroid/graphics/Paint;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setDither(Z)V

    .line 10
    iget-object p1, p0, Lcom/sma/smartv3/view/PagerIndicator;->X1IX:Landroid/graphics/Paint;

    const/high16 p2, 0x40800000    # 4.0f

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    return-void
.end method

.method public static bridge synthetic OXO1(Lcom/sma/smartv3/view/PagerIndicator;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/view/PagerIndicator;->iX1O1:I

    return p0
.end method

.method public static bridge synthetic XIi00iiXO(Lcom/sma/smartv3/view/PagerIndicator;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/view/PagerIndicator;->X0i1O:I

    return p0
.end method

.method public static bridge synthetic iO(Lcom/sma/smartv3/view/PagerIndicator;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/view/PagerIndicator;->X0i1O:I

    return-void
.end method


# virtual methods
.method public XO0O10(Z)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "start"
        }
    .end annotation

    const/4 v0, -0x1

    iput v0, p0, Lcom/sma/smartv3/view/PagerIndicator;->X0i1O:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/view/PagerIndicator;->iIXi1iiXI:Ljava/lang/Runnable;

    const-wide/16 v0, 0x258

    invoke-virtual {p0, p1, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/view/PagerIndicator;->iIXi1iiXI:Ljava/lang/Runnable;

    invoke-virtual {p0, p1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 6
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "canvas"
        }
    .end annotation

    iget v0, p0, Lcom/sma/smartv3/view/PagerIndicator;->IO:I

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    iget v1, p0, Lcom/sma/smartv3/view/PagerIndicator;->iX1O1:I

    iget v2, p0, Lcom/sma/smartv3/view/PagerIndicator;->XXX11i:I

    mul-int/2addr v2, v1

    int-to-float v2, v2

    iget v3, p0, Lcom/sma/smartv3/view/PagerIndicator;->X11iII1O1:I

    int-to-float v3, v3

    int-to-float v1, v1

    const/high16 v4, 0x3f800000    # 1.0f

    sub-float/2addr v1, v4

    mul-float/2addr v3, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v3, v1

    add-float/2addr v2, v3

    sub-float/2addr v0, v2

    float-to-int v0, v0

    const/4 v1, 0x0

    :goto_0
    iget v2, p0, Lcom/sma/smartv3/view/PagerIndicator;->iX1O1:I

    if-ge v1, v2, :cond_2

    iget v2, p0, Lcom/sma/smartv3/view/PagerIndicator;->X0i1O:I

    const v3, -0x777778

    const/4 v4, -0x1

    if-ne v2, v4, :cond_0

    iget-object v2, p0, Lcom/sma/smartv3/view/PagerIndicator;->X1IX:Landroid/graphics/Paint;

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_1

    :cond_0
    if-gt v1, v2, :cond_1

    iget-object v2, p0, Lcom/sma/smartv3/view/PagerIndicator;->X1IX:Landroid/graphics/Paint;

    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_1

    :cond_1
    iget-object v2, p0, Lcom/sma/smartv3/view/PagerIndicator;->X1IX:Landroid/graphics/Paint;

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    :goto_1
    iget v2, p0, Lcom/sma/smartv3/view/PagerIndicator;->XXX11i:I

    add-int v3, v0, v2

    iget v4, p0, Lcom/sma/smartv3/view/PagerIndicator;->X11iII1O1:I

    mul-int/lit8 v5, v2, 0x2

    add-int/2addr v4, v5

    mul-int/2addr v4, v1

    add-int/2addr v3, v4

    int-to-float v3, v3

    iget v4, p0, Lcom/sma/smartv3/view/PagerIndicator;->I1:I

    div-int/lit8 v4, v4, 0x2

    int-to-float v4, v4

    int-to-float v2, v2

    iget-object v5, p0, Lcom/sma/smartv3/view/PagerIndicator;->X1IX:Landroid/graphics/Paint;

    invoke-virtual {p1, v3, v4, v2, v5}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public onSizeChanged(IIII)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "w",
            "h",
            "oldw",
            "oldh"
        }
    .end annotation

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    iput p1, p0, Lcom/sma/smartv3/view/PagerIndicator;->IO:I

    iput p2, p0, Lcom/sma/smartv3/view/PagerIndicator;->I1:I

    return-void
.end method
