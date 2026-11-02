.class public Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;
.super Landroid/view/View;
.source "SourceFile"


# static fields
.field public static final Xii:I = 0x0

.field public static final iiII:I = 0x1


# instance fields
.field public I1:Landroid/graphics/Paint;

.field public IO:Landroid/graphics/RectF;

.field public IO0II0i:I

.field public IO0iXO0O:I

.field public IX0IXOi:Landroid/graphics/Paint;

.field public IX1XiI:I

.field public IXI:Landroid/graphics/Paint;

.field public IXOIIIO:Ljava/text/DecimalFormat;

.field public Ii0X0X:I

.field public Ii0i:I

.field public Ii1iii0:Ljava/lang/Integer;

.field public IiiXiI0I:I

.field public O001I:Ljava/lang/String;

.field public O0O:Landroid/graphics/Path;

.field public O0O0X0iOi:I

.field public OO:F

.field public OX110i:I

.field public Oi:I

.field public X00O0:Z

.field public X00XIX1:I

.field public X00Xi1X:Ljava/lang/String;

.field public X0i1O:I

.field public X0iO:Landroid/graphics/Rect;

.field public X1:Landroid/graphics/Paint;

.field public X100O:Landroid/graphics/Rect;

.field public X111IO:I

.field public X11I:Landroid/graphics/Rect;

.field public X11iII1O1:I

.field public X1IX:I

.field public X1OI:F

.field public XO0X10iO:I

.field public XOIX:I

.field public XOO0XOOii:Landroid/text/StaticLayout;

.field public XOX0O0:F

.field public XOXiX0:Landroid/text/StaticLayout;

.field public XX00i10X:I

.field public XX1Oi:Landroid/graphics/Rect;

.field public XXO:Ljava/lang/String;

.field public XXX11i:I

.field public XXiIiX10:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/android/mltcode/paycertificationapi/iz3;",
            ">;"
        }
    .end annotation
.end field

.field public XXiO0i:I

.field public Xi1i0XOX0:Landroid/graphics/Point;

.field public Xii11I:Landroid/graphics/Point;

.field public i0X000X0O:I

.field public i100IXOX:I

.field public i11I:I

.field public iI0I:F

.field public iIX0i:F

.field public iIXi1iiXI:Ljava/lang/Float;

.field public iIi1:Landroid/graphics/Paint;

.field public iOI:I

.field public iOiXi11II:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/graphics/Rect;",
            ">;"
        }
    .end annotation
.end field

.field public iX1O1:Landroid/graphics/Paint;

.field public iXi:Z

.field public iXiX011:Ljava/lang/Float;

.field public iXiiiO:Ljava/lang/Integer;

.field public iiIOiX:Landroid/text/TextPaint;

.field public iii0:Landroid/graphics/Point;

.field public iiiO:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "context"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const/high16 v0, -0x40800000    # -1.0f

    .line 2
    iput v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->OO:F

    .line 3
    iput v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XOX0O0:F

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iOiXi11II:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IO0II0i:I

    const/4 v1, 0x1

    .line 6
    iput v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->Ii0i:I

    const/4 v1, -0x1

    .line 7
    iput v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XOIX:I

    const v2, -0xbbbbbc

    .line 8
    iput v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->Oi:I

    const/high16 v2, 0x10000

    .line 9
    iput v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IO0iXO0O:I

    .line 10
    iput v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iOI:I

    .line 11
    iput-boolean v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X00O0:Z

    .line 12
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    iput-object v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iIi1:Landroid/graphics/Paint;

    .line 13
    iput v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->i100IXOX:I

    const/high16 v0, 0x40800000    # 4.0f

    .line 14
    iput v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iI0I:F

    const/high16 v0, 0x41700000    # 15.0f

    .line 15
    iput v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iIX0i:F

    const v0, 0x3dcccccd    # 0.1f

    .line 16
    iput v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X1OI:F

    const/4 v0, 0x0

    .line 17
    invoke-virtual {p0, p1, v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XXI(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3
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

    .line 18
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/high16 v0, -0x40800000    # -1.0f

    .line 19
    iput v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->OO:F

    .line 20
    iput v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XOX0O0:F

    .line 21
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iOiXi11II:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 22
    iput v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IO0II0i:I

    const/4 v1, 0x1

    .line 23
    iput v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->Ii0i:I

    const/4 v1, -0x1

    .line 24
    iput v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XOIX:I

    const v2, -0xbbbbbc

    .line 25
    iput v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->Oi:I

    const/high16 v2, 0x10000

    .line 26
    iput v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IO0iXO0O:I

    .line 27
    iput v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iOI:I

    .line 28
    iput-boolean v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X00O0:Z

    .line 29
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    iput-object v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iIi1:Landroid/graphics/Paint;

    .line 30
    iput v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->i100IXOX:I

    const/high16 v0, 0x40800000    # 4.0f

    .line 31
    iput v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iI0I:F

    const/high16 v0, 0x41700000    # 15.0f

    .line 32
    iput v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iIX0i:F

    const v0, 0x3dcccccd    # 0.1f

    .line 33
    iput v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X1OI:F

    .line 34
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XXI(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private getContentWidth()I
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-direct {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->getXLeft()I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    sub-int/2addr v0, v1

    return v0
.end method

.method private getXLeft()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method private getXtop()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public final I0IIOi(Landroid/graphics/Canvas;Landroid/graphics/Paint;Ljava/lang/String;FFFF)V
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "canvas",
            "paint",
            "text",
            "left",
            "top",
            "right",
            "bottom"
        }
    .end annotation

    sget-object v0, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    invoke-virtual {p2}, Landroid/graphics/Paint;->descent()F

    move-result v0

    invoke-virtual {p2}, Landroid/graphics/Paint;->ascent()F

    move-result v1

    sub-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    invoke-virtual {p2}, Landroid/graphics/Paint;->descent()F

    move-result v2

    sub-float/2addr v0, v2

    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-void

    :cond_0
    add-float/2addr p4, p6

    div-float/2addr p4, v1

    add-float/2addr p5, p7

    div-float/2addr p5, v1

    add-float/2addr p5, v0

    invoke-virtual {p1, p3, p4, p5, p2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    return-void
.end method

.method public final I0iXXO(Landroid/graphics/Canvas;II)V
    .locals 8
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "canvas",
            "valueSignSpaceHeight",
            "valueSignCenter"
        }
    .end annotation

    const/4 v0, -0x1

    const/4 v1, 0x0

    if-ne p3, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->getContentWidth()I

    move-result p3

    div-int/lit8 p3, p3, 0x2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    add-int/2addr p3, v2

    :cond_1
    iget-object v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X100O:Landroid/graphics/Rect;

    iget v3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XXX11i:I

    div-int/lit8 v3, v3, 0x2

    sub-int v3, p3, v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    iget v5, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XXX11i:I

    div-int/lit8 v5, v5, 0x2

    add-int/2addr v5, p3

    iget v6, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X11iII1O1:I

    iget v7, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X00XIX1:I

    sub-int/2addr v6, v7

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v7

    add-int/2addr v6, v7

    invoke-virtual {v2, v3, v4, v5, v6}, Landroid/graphics/Rect;->set(IIII)V

    iget-object v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iX1O1:Landroid/graphics/Paint;

    iget v3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X1IX:I

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X100O:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->left:I

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    if-ge v2, v3, :cond_2

    iget-object v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X100O:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->left:I

    neg-int v2, v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    add-int/2addr v2, v3

    iget-object v3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IO:Landroid/graphics/RectF;

    iget-object v4, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X100O:Landroid/graphics/Rect;

    iget v5, v4, Landroid/graphics/Rect;->left:I

    add-int/2addr v5, v2

    int-to-float v5, v5

    iget v6, v4, Landroid/graphics/Rect;->top:I

    int-to-float v6, v6

    iget v7, v4, Landroid/graphics/Rect;->right:I

    add-int/2addr v7, v2

    int-to-float v2, v7

    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    int-to-float v4, v4

    invoke-virtual {v3, v5, v6, v2, v4}, Landroid/graphics/RectF;->set(FFFF)V

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X100O:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->right:I

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v4

    sub-int/2addr v3, v4

    if-le v2, v3, :cond_3

    iget-object v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X100O:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->right:I

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v3

    add-int/2addr v2, v3

    iget-object v3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IO:Landroid/graphics/RectF;

    iget-object v4, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X100O:Landroid/graphics/Rect;

    iget v5, v4, Landroid/graphics/Rect;->left:I

    sub-int/2addr v5, v2

    int-to-float v5, v5

    iget v6, v4, Landroid/graphics/Rect;->top:I

    int-to-float v6, v6

    iget v7, v4, Landroid/graphics/Rect;->right:I

    sub-int/2addr v7, v2

    int-to-float v2, v7

    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    int-to-float v4, v4

    invoke-virtual {v3, v5, v6, v2, v4}, Landroid/graphics/RectF;->set(FFFF)V

    goto :goto_1

    :cond_3
    iget-object v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IO:Landroid/graphics/RectF;

    iget-object v3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X100O:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->left:I

    int-to-float v4, v4

    iget v5, v3, Landroid/graphics/Rect;->top:I

    int-to-float v5, v5

    iget v6, v3, Landroid/graphics/Rect;->right:I

    int-to-float v6, v6

    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    int-to-float v3, v3

    invoke-virtual {v2, v4, v5, v6, v3}, Landroid/graphics/RectF;->set(FFFF)V

    :goto_1
    iget-object v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IO:Landroid/graphics/RectF;

    iget v3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->OX110i:I

    int-to-float v4, v3

    int-to-float v3, v3

    iget-object v5, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iX1O1:Landroid/graphics/Paint;

    invoke-virtual {p1, v2, v4, v3, v5}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    if-nez v0, :cond_6

    iget v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->i0X000X0O:I

    div-int/lit8 v0, v0, 0x2

    sub-int v0, p3, v0

    iget v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IO0II0i:I

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    add-int/2addr v2, v3

    if-ge v0, v2, :cond_4

    iget v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IO0II0i:I

    sub-int/2addr v0, p3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    add-int/2addr v1, v0

    goto :goto_2

    :cond_4
    iget v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->i0X000X0O:I

    div-int/lit8 v0, v0, 0x2

    add-int/2addr v0, p3

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    iget v3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IO0II0i:I

    sub-int/2addr v2, v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v3

    sub-int/2addr v2, v3

    if-le v0, v2, :cond_5

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    iget v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IO0II0i:I

    sub-int/2addr v0, v1

    sub-int/2addr v0, p3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    sub-int v1, v0, v1

    :cond_5
    :goto_2
    iget-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->Xi1i0XOX0:Landroid/graphics/Point;

    iget v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->i0X000X0O:I

    div-int/lit8 v2, v2, 0x2

    sub-int v2, p3, v2

    add-int/2addr v2, v1

    iget v3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X00XIX1:I

    sub-int v3, p2, v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    add-int/2addr v3, v4

    invoke-virtual {v0, v2, v3}, Landroid/graphics/Point;->set(II)V

    iget-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iii0:Landroid/graphics/Point;

    iget v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->i0X000X0O:I

    div-int/lit8 v2, v2, 0x2

    add-int/2addr v2, p3

    add-int/2addr v2, v1

    iget v3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X00XIX1:I

    sub-int v3, p2, v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    add-int/2addr v3, v4

    invoke-virtual {v0, v2, v3}, Landroid/graphics/Point;->set(II)V

    iget-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->Xii11I:Landroid/graphics/Point;

    add-int/2addr p3, v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    add-int/2addr p2, v1

    invoke-virtual {v0, p3, p2}, Landroid/graphics/Point;->set(II)V

    iget-object v3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->Xi1i0XOX0:Landroid/graphics/Point;

    iget-object v4, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iii0:Landroid/graphics/Point;

    iget-object v5, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->Xii11I:Landroid/graphics/Point;

    iget-object v6, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iX1O1:Landroid/graphics/Paint;

    move-object v1, p0

    move-object v2, p1

    invoke-virtual/range {v1 .. v6}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IO(Landroid/graphics/Canvas;Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Paint;)V

    goto :goto_3

    :cond_6
    move-object v1, p0

    move-object v2, p1

    :goto_3
    invoke-virtual {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XX0()I

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p2

    add-int/2addr p1, p2

    invoke-virtual {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iO()I

    move-result p2

    add-int/2addr p1, p2

    invoke-direct {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->getXtop()I

    move-result p2

    add-int/2addr p1, p2

    add-int/lit8 p1, p1, -0xf

    iget p2, v1, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->Ii0X0X:I

    invoke-virtual {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XX0()I

    move-result p3

    add-int/2addr p2, p3

    invoke-virtual {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iO()I

    move-result p3

    add-int/2addr p2, p3

    invoke-direct {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->getXtop()I

    move-result p3

    add-int/2addr p2, p3

    add-int/lit8 p2, p2, 0xf

    new-instance p3, Landroid/graphics/RectF;

    iget-object v0, v1, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->Xii11I:Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v3, v0

    const/high16 v4, 0x41200000    # 10.0f

    sub-float/2addr v3, v4

    int-to-float p1, p1

    int-to-float v0, v0

    add-float/2addr v0, v4

    int-to-float p2, p2

    invoke-direct {p3, v3, p1, v0, p2}, Landroid/graphics/RectF;-><init>(FFFF)V

    iget-object p1, v1, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iX1O1:Landroid/graphics/Paint;

    invoke-virtual {v2, p3, v4, v4, p1}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    iget-object p1, v1, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XOXiX0:Landroid/text/StaticLayout;

    if-eqz p1, :cond_7

    invoke-virtual {v2}, Landroid/graphics/Canvas;->save()I

    iget-object p1, v1, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IO:Landroid/graphics/RectF;

    iget p2, p1, Landroid/graphics/RectF;->left:F

    iget p3, p1, Landroid/graphics/RectF;->top:F

    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result p1

    const/high16 v0, 0x40000000    # 2.0f

    div-float/2addr p1, v0

    add-float/2addr p3, p1

    iget-object p1, v1, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XOXiX0:Landroid/text/StaticLayout;

    invoke-virtual {p1}, Landroid/text/Layout;->getHeight()I

    move-result p1

    div-int/lit8 p1, p1, 0x2

    int-to-float p1, p1

    sub-float/2addr p3, p1

    invoke-virtual {v2, p2, p3}, Landroid/graphics/Canvas;->translate(FF)V

    iget-object p1, v1, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XOXiX0:Landroid/text/StaticLayout;

    invoke-virtual {p1, v2}, Landroid/text/Layout;->draw(Landroid/graphics/Canvas;)V

    invoke-virtual {v2}, Landroid/graphics/Canvas;->restore()V

    :cond_7
    return-void
.end method

.method public I1XOi1(II)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "width",
            "height"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XXX11i:I

    iput p2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X11iII1O1:I

    invoke-virtual {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iIiiO()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XIi00iiXO()V

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public IIX1OXO(Ljava/lang/Float;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "value",
            "unitHtml"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iIXi1iiXI:Ljava/lang/Float;

    iput-object p2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X00Xi1X:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iIiiO()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XIi00iiXO()V

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public final IO(Landroid/graphics/Canvas;Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Paint;)V
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "canvas",
            "point1",
            "point2",
            "point3",
            "paint"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->O0O:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    iget-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->O0O:Landroid/graphics/Path;

    iget v1, p2, Landroid/graphics/Point;->x:I

    int-to-float v1, v1

    iget v2, p2, Landroid/graphics/Point;->y:I

    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V

    iget-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->O0O:Landroid/graphics/Path;

    iget v1, p3, Landroid/graphics/Point;->x:I

    int-to-float v1, v1

    iget p3, p3, Landroid/graphics/Point;->y:I

    int-to-float p3, p3

    invoke-virtual {v0, v1, p3}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object p3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->O0O:Landroid/graphics/Path;

    iget v0, p4, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget p4, p4, Landroid/graphics/Point;->y:I

    int-to-float p4, p4

    invoke-virtual {p3, v0, p4}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object p3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->O0O:Landroid/graphics/Path;

    iget p4, p2, Landroid/graphics/Point;->x:I

    int-to-float p4, p4

    iget p2, p2, Landroid/graphics/Point;->y:I

    int-to-float p2, p2

    invoke-virtual {p3, p4, p2}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object p2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->O0O:Landroid/graphics/Path;

    invoke-virtual {p2}, Landroid/graphics/Path;->close()V

    iget-object p2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->O0O:Landroid/graphics/Path;

    invoke-virtual {p1, p2, p5}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    return-void
.end method

.method public final IiI10X(Landroid/graphics/Canvas;Lcom/android/mltcode/paycertificationapi/iz3;IIF)V
    .locals 19
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "canvas",
            "segment",
            "segmentIndex",
            "segmentsSize",
            "valueMax"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v10, p3

    const/4 v6, 0x1

    if-nez v10, :cond_0

    move v8, v6

    goto :goto_0

    :cond_0
    const/4 v8, 0x0

    :goto_0
    add-int/lit8 v3, p4, -0x1

    if-ne v10, v3, :cond_1

    move v9, v6

    goto :goto_1

    :cond_1
    const/4 v9, 0x0

    :goto_1
    if-eqz v8, :cond_2

    if-eqz v9, :cond_2

    move v3, v6

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    :goto_2
    iget v4, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X111IO:I

    if-nez v4, :cond_4

    invoke-virtual/range {p2 .. p2}, Lcom/android/mltcode/paycertificationapi/iz3;->XO0O10()F

    move-result v4

    invoke-virtual/range {p2 .. p2}, Lcom/android/mltcode/paycertificationapi/iz3;->O00()F

    move-result v5

    sub-float/2addr v4, v5

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->getContentWidth()I

    move-result v5

    int-to-float v5, v5

    mul-float/2addr v5, v4

    div-float v5, v5, p5

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->getContentWidth()I

    move-result v4

    int-to-float v4, v4

    div-float v4, v4, p5

    invoke-virtual/range {p2 .. p2}, Lcom/android/mltcode/paycertificationapi/iz3;->O00()F

    move-result v7

    mul-float/2addr v4, v7

    if-nez v8, :cond_3

    iget v7, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->i11I:I

    int-to-float v7, v7

    add-float/2addr v4, v7

    :cond_3
    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->getContentWidth()I

    move-result v7

    int-to-float v7, v7

    div-float v7, v7, p5

    invoke-virtual/range {p2 .. p2}, Lcom/android/mltcode/paycertificationapi/iz3;->XO0O10()F

    move-result v11

    mul-float/2addr v7, v11

    if-nez v8, :cond_6

    iget-boolean v11, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X00O0:Z

    if-eqz v11, :cond_6

    new-instance v11, Landroid/graphics/RectF;

    invoke-direct {v11}, Landroid/graphics/RectF;-><init>()V

    iget-object v12, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X1:Landroid/graphics/Paint;

    iget v13, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XO0X10iO:I

    invoke-virtual {v12, v13}, Landroid/graphics/Paint;->setColor(I)V

    float-to-int v12, v4

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v13

    add-int/2addr v13, v12

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->getXLeft()I

    move-result v14

    add-int/2addr v13, v14

    int-to-float v13, v13

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XX0()I

    move-result v14

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v15

    add-int/2addr v14, v15

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iO()I

    move-result v15

    add-int/2addr v14, v15

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->getXtop()I

    move-result v15

    add-int/2addr v14, v15

    int-to-float v14, v14

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v15

    add-int/2addr v12, v15

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->getXLeft()I

    move-result v15

    add-int/2addr v12, v15

    iget v15, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->i11I:I

    add-int/2addr v12, v15

    int-to-float v12, v12

    iget v15, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->Ii0X0X:I

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XX0()I

    move-result v16

    add-int v15, v15, v16

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iO()I

    move-result v16

    add-int v15, v15, v16

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v16

    add-int v15, v15, v16

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->getXtop()I

    move-result v16

    add-int v15, v15, v16

    int-to-float v15, v15

    invoke-virtual {v11, v13, v14, v12, v15}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v12, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X1:Landroid/graphics/Paint;

    invoke-virtual {v1, v11, v12}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    goto/16 :goto_3

    :cond_4
    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->getContentWidth()I

    move-result v4

    iget v5, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->i11I:I

    add-int/2addr v4, v5

    div-int v4, v4, p4

    sub-int/2addr v4, v5

    int-to-float v4, v4

    int-to-float v5, v5

    add-float/2addr v5, v4

    int-to-float v7, v10

    mul-float/2addr v5, v7

    add-float v7, v5, v4

    if-nez v8, :cond_5

    iget-boolean v11, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X00O0:Z

    if-eqz v11, :cond_5

    new-instance v11, Landroid/graphics/RectF;

    invoke-direct {v11}, Landroid/graphics/RectF;-><init>()V

    iget-object v12, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X1:Landroid/graphics/Paint;

    iget v13, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XO0X10iO:I

    invoke-virtual {v12, v13}, Landroid/graphics/Paint;->setColor(I)V

    float-to-int v12, v5

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v13

    add-int/2addr v13, v12

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->getXLeft()I

    move-result v14

    add-int/2addr v13, v14

    int-to-float v13, v13

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XX0()I

    move-result v14

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v15

    add-int/2addr v14, v15

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iO()I

    move-result v15

    add-int/2addr v14, v15

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->getXtop()I

    move-result v15

    add-int/2addr v14, v15

    int-to-float v14, v14

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v15

    add-int/2addr v12, v15

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->getXLeft()I

    move-result v15

    add-int/2addr v12, v15

    iget v15, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->i11I:I

    add-int/2addr v12, v15

    int-to-float v12, v12

    iget v15, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->Ii0X0X:I

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XX0()I

    move-result v16

    add-int v15, v15, v16

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iO()I

    move-result v16

    add-int v15, v15, v16

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v16

    add-int v15, v15, v16

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->getXtop()I

    move-result v16

    add-int v15, v15, v16

    int-to-float v15, v15

    invoke-virtual {v11, v13, v14, v12, v15}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v12, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X1:Landroid/graphics/Paint;

    invoke-virtual {v1, v11, v12}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    :cond_5
    move/from16 v18, v5

    move v5, v4

    move/from16 v4, v18

    :cond_6
    :goto_3
    iget-object v11, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X11I:Landroid/graphics/Rect;

    float-to-int v12, v4

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v13

    add-int/2addr v13, v12

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->getXLeft()I

    move-result v14

    add-int/2addr v13, v14

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XX0()I

    move-result v14

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iO()I

    move-result v15

    add-int/2addr v14, v15

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v15

    add-int/2addr v14, v15

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->getXtop()I

    move-result v15

    add-int/2addr v14, v15

    float-to-int v7, v7

    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    move-result v15

    add-int/2addr v15, v7

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->getXLeft()I

    move-result v16

    add-int v15, v15, v16

    iget v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->Ii0X0X:I

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XX0()I

    move-result v17

    add-int v2, v2, v17

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iO()I

    move-result v17

    add-int v2, v2, v17

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v17

    add-int v2, v2, v17

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->getXtop()I

    move-result v17

    add-int v2, v2, v17

    invoke-virtual {v11, v13, v14, v15, v2}, Landroid/graphics/Rect;->set(IIII)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iXiiiO:Ljava/lang/Integer;

    const/high16 v11, 0x40000000    # 2.0f

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, v10, :cond_7

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v2, v4

    div-float v13, v5, v11

    add-float/2addr v2, v13

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->getXLeft()I

    move-result v13

    int-to-float v13, v13

    add-float/2addr v2, v13

    iput v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->OO:F

    :goto_4
    move v2, v6

    goto :goto_5

    :cond_7
    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iIXi1iiXI:Ljava/lang/Float;

    if-eqz v2, :cond_a

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    invoke-virtual/range {p2 .. p2}, Lcom/android/mltcode/paycertificationapi/iz3;->O00()F

    move-result v13

    cmpl-float v2, v2, v13

    if-ltz v2, :cond_8

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iIXi1iiXI:Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    invoke-virtual/range {p2 .. p2}, Lcom/android/mltcode/paycertificationapi/iz3;->XO0O10()F

    move-result v13

    cmpg-float v2, v2, v13

    if-ltz v2, :cond_9

    :cond_8
    if-eqz v9, :cond_a

    invoke-virtual/range {p2 .. p2}, Lcom/android/mltcode/paycertificationapi/iz3;->XO0O10()F

    move-result v2

    iget-object v13, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iIXi1iiXI:Ljava/lang/Float;

    invoke-virtual {v13}, Ljava/lang/Float;->floatValue()F

    move-result v13

    cmpl-float v2, v2, v13

    if-nez v2, :cond_a

    :cond_9
    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iIXi1iiXI:Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    invoke-virtual/range {p2 .. p2}, Lcom/android/mltcode/paycertificationapi/iz3;->O00()F

    move-result v13

    sub-float/2addr v2, v13

    invoke-virtual/range {p2 .. p2}, Lcom/android/mltcode/paycertificationapi/iz3;->XO0O10()F

    move-result v13

    invoke-virtual/range {p2 .. p2}, Lcom/android/mltcode/paycertificationapi/iz3;->O00()F

    move-result v14

    sub-float/2addr v13, v14

    div-float/2addr v2, v13

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v13

    int-to-float v13, v13

    add-float/2addr v13, v4

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->getXLeft()I

    move-result v14

    int-to-float v14, v14

    add-float/2addr v13, v14

    mul-float/2addr v2, v5

    add-float/2addr v13, v2

    float-to-int v2, v13

    int-to-float v2, v2

    iput v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->OO:F

    goto :goto_4

    :cond_a
    const/4 v2, 0x0

    :goto_5
    iget-object v13, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->Ii1iii0:Ljava/lang/Integer;

    if-eqz v13, :cond_b

    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    move-result v13

    if-ne v13, v10, :cond_b

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v4, v2

    div-float/2addr v5, v11

    add-float/2addr v4, v5

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->getXLeft()I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v4, v2

    iput v4, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XOX0O0:F

    :goto_6
    move v11, v6

    goto :goto_7

    :cond_b
    iget-object v11, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iXiX011:Ljava/lang/Float;

    if-eqz v11, :cond_e

    invoke-virtual {v11}, Ljava/lang/Float;->floatValue()F

    move-result v11

    invoke-virtual/range {p2 .. p2}, Lcom/android/mltcode/paycertificationapi/iz3;->O00()F

    move-result v13

    cmpl-float v11, v11, v13

    if-ltz v11, :cond_c

    iget-object v11, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iXiX011:Ljava/lang/Float;

    invoke-virtual {v11}, Ljava/lang/Float;->floatValue()F

    move-result v11

    invoke-virtual/range {p2 .. p2}, Lcom/android/mltcode/paycertificationapi/iz3;->XO0O10()F

    move-result v13

    cmpg-float v11, v11, v13

    if-ltz v11, :cond_d

    :cond_c
    if-eqz v9, :cond_e

    invoke-virtual/range {p2 .. p2}, Lcom/android/mltcode/paycertificationapi/iz3;->XO0O10()F

    move-result v11

    iget-object v13, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iXiX011:Ljava/lang/Float;

    invoke-virtual {v13}, Ljava/lang/Float;->floatValue()F

    move-result v13

    cmpl-float v11, v11, v13

    if-nez v11, :cond_e

    :cond_d
    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iXiX011:Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    invoke-virtual/range {p2 .. p2}, Lcom/android/mltcode/paycertificationapi/iz3;->O00()F

    move-result v11

    sub-float/2addr v2, v11

    invoke-virtual/range {p2 .. p2}, Lcom/android/mltcode/paycertificationapi/iz3;->XO0O10()F

    move-result v11

    invoke-virtual/range {p2 .. p2}, Lcom/android/mltcode/paycertificationapi/iz3;->O00()F

    move-result v13

    sub-float/2addr v11, v13

    div-float/2addr v2, v11

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v11

    int-to-float v11, v11

    add-float/2addr v4, v11

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->getXLeft()I

    move-result v11

    int-to-float v11, v11

    add-float/2addr v4, v11

    mul-float/2addr v2, v5

    add-float/2addr v4, v2

    float-to-int v2, v4

    int-to-float v2, v2

    iput v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XOX0O0:F

    goto :goto_6

    :cond_e
    move v11, v2

    :goto_7
    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->I1:Landroid/graphics/Paint;

    invoke-virtual/range {p2 .. p2}, Lcom/android/mltcode/paycertificationapi/iz3;->OXO1()I

    move-result v4

    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X0iO:Landroid/graphics/Rect;

    iget-object v4, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X11I:Landroid/graphics/Rect;

    invoke-virtual {v2, v4}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    iget v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IO0II0i:I

    const/4 v4, 0x2

    if-nez v2, :cond_f

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X11I:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v2

    div-int/2addr v2, v4

    iput v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IO0II0i:I

    :cond_f
    if-nez v8, :cond_12

    if-eqz v9, :cond_10

    goto :goto_8

    :cond_10
    iget v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->Ii0i:I

    if-nez v2, :cond_11

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IO:Landroid/graphics/RectF;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X11I:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->left:I

    int-to-float v4, v4

    iget v5, v3, Landroid/graphics/Rect;->top:I

    int-to-float v5, v5

    iget v7, v3, Landroid/graphics/Rect;->right:I

    int-to-float v7, v7

    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    int-to-float v3, v3

    invoke-virtual {v2, v4, v5, v7, v3}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IO:Landroid/graphics/RectF;

    iget v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IO0II0i:I

    int-to-float v4, v3

    int-to-float v3, v3

    iget-object v5, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->I1:Landroid/graphics/Paint;

    invoke-virtual {v1, v2, v4, v3, v5}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    goto/16 :goto_9

    :cond_11
    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X11I:Landroid/graphics/Rect;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->I1:Landroid/graphics/Paint;

    invoke-virtual {v1, v2, v3}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iOiXi11II:Ljava/util/ArrayList;

    new-instance v3, Landroid/graphics/Rect;

    iget-object v4, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X11I:Landroid/graphics/Rect;

    invoke-direct {v3, v4}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_9

    :cond_12
    :goto_8
    iget v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->Ii0i:I

    if-eqz v2, :cond_18

    if-eq v2, v6, :cond_16

    if-eq v2, v4, :cond_13

    goto/16 :goto_9

    :cond_13
    if-eqz v3, :cond_14

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X11I:Landroid/graphics/Rect;

    iget v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IO0II0i:I

    add-int/2addr v12, v3

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    add-int/2addr v12, v3

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->getXLeft()I

    move-result v3

    add-int/2addr v12, v3

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XX0()I

    move-result v3

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iO()I

    move-result v4

    add-int/2addr v3, v4

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    add-int/2addr v3, v4

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->getXtop()I

    move-result v4

    add-int/2addr v3, v4

    iget v4, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IO0II0i:I

    sub-int/2addr v7, v4

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v4

    add-int/2addr v7, v4

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->getXLeft()I

    move-result v4

    add-int/2addr v7, v4

    iget v4, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->Ii0X0X:I

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XX0()I

    move-result v5

    add-int/2addr v4, v5

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v5

    add-int/2addr v4, v5

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iO()I

    move-result v5

    add-int/2addr v4, v5

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->getXtop()I

    move-result v5

    add-int/2addr v4, v5

    invoke-virtual {v2, v12, v3, v7, v4}, Landroid/graphics/Rect;->set(IIII)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X11I:Landroid/graphics/Rect;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->I1:Landroid/graphics/Paint;

    invoke-virtual {v1, v2, v3}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->Xi1i0XOX0:Landroid/graphics/Point;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X11I:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->left:I

    iget v5, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IO0II0i:I

    sub-int/2addr v4, v5

    iget v3, v3, Landroid/graphics/Rect;->top:I

    add-int/2addr v3, v5

    invoke-virtual {v2, v4, v3}, Landroid/graphics/Point;->set(II)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iii0:Landroid/graphics/Point;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X11I:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->left:I

    iget v3, v3, Landroid/graphics/Rect;->top:I

    invoke-virtual {v2, v4, v3}, Landroid/graphics/Point;->set(II)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->Xii11I:Landroid/graphics/Point;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X11I:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->left:I

    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {v2, v4, v3}, Landroid/graphics/Point;->set(II)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->Xi1i0XOX0:Landroid/graphics/Point;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iii0:Landroid/graphics/Point;

    iget-object v4, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->Xii11I:Landroid/graphics/Point;

    iget-object v5, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->I1:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IO(Landroid/graphics/Canvas;Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Paint;)V

    iget-object v1, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->Xi1i0XOX0:Landroid/graphics/Point;

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X11I:Landroid/graphics/Rect;

    iget v3, v2, Landroid/graphics/Rect;->right:I

    iget v4, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IO0II0i:I

    add-int/2addr v3, v4

    iget v2, v2, Landroid/graphics/Rect;->top:I

    add-int/2addr v2, v4

    invoke-virtual {v1, v3, v2}, Landroid/graphics/Point;->set(II)V

    iget-object v1, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iii0:Landroid/graphics/Point;

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X11I:Landroid/graphics/Rect;

    iget v3, v2, Landroid/graphics/Rect;->right:I

    iget v2, v2, Landroid/graphics/Rect;->top:I

    invoke-virtual {v1, v3, v2}, Landroid/graphics/Point;->set(II)V

    iget-object v1, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->Xii11I:Landroid/graphics/Point;

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X11I:Landroid/graphics/Rect;

    iget v3, v2, Landroid/graphics/Rect;->right:I

    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {v1, v3, v2}, Landroid/graphics/Point;->set(II)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->Xi1i0XOX0:Landroid/graphics/Point;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iii0:Landroid/graphics/Point;

    iget-object v4, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->Xii11I:Landroid/graphics/Point;

    iget-object v5, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->I1:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    invoke-virtual/range {v0 .. v5}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IO(Landroid/graphics/Canvas;Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Paint;)V

    goto/16 :goto_9

    :cond_14
    if-eqz v8, :cond_15

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X11I:Landroid/graphics/Rect;

    iget v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IO0II0i:I

    add-int/2addr v12, v3

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    add-int/2addr v12, v3

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->getXLeft()I

    move-result v3

    add-int/2addr v12, v3

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XX0()I

    move-result v3

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iO()I

    move-result v4

    add-int/2addr v3, v4

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    add-int/2addr v3, v4

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->getXtop()I

    move-result v4

    add-int/2addr v3, v4

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v4

    add-int/2addr v7, v4

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->getXLeft()I

    move-result v4

    add-int/2addr v7, v4

    iget v4, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->Ii0X0X:I

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XX0()I

    move-result v5

    add-int/2addr v4, v5

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iO()I

    move-result v5

    add-int/2addr v4, v5

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v5

    add-int/2addr v4, v5

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->getXtop()I

    move-result v5

    add-int/2addr v4, v5

    invoke-virtual {v2, v12, v3, v7, v4}, Landroid/graphics/Rect;->set(IIII)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X11I:Landroid/graphics/Rect;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->I1:Landroid/graphics/Paint;

    invoke-virtual {v1, v2, v3}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->Xi1i0XOX0:Landroid/graphics/Point;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X11I:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->left:I

    iget v5, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IO0II0i:I

    sub-int/2addr v4, v5

    iget v3, v3, Landroid/graphics/Rect;->top:I

    add-int/2addr v3, v5

    invoke-virtual {v2, v4, v3}, Landroid/graphics/Point;->set(II)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iii0:Landroid/graphics/Point;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X11I:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->left:I

    iget v3, v3, Landroid/graphics/Rect;->top:I

    invoke-virtual {v2, v4, v3}, Landroid/graphics/Point;->set(II)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->Xii11I:Landroid/graphics/Point;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X11I:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->left:I

    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {v2, v4, v3}, Landroid/graphics/Point;->set(II)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->Xi1i0XOX0:Landroid/graphics/Point;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iii0:Landroid/graphics/Point;

    iget-object v4, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->Xii11I:Landroid/graphics/Point;

    iget-object v5, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->I1:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IO(Landroid/graphics/Canvas;Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Paint;)V

    goto/16 :goto_9

    :cond_15
    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X11I:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    add-int/2addr v12, v3

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->getXLeft()I

    move-result v3

    add-int/2addr v12, v3

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XX0()I

    move-result v3

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iO()I

    move-result v4

    add-int/2addr v3, v4

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    add-int/2addr v3, v4

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->getXtop()I

    move-result v4

    add-int/2addr v3, v4

    iget v4, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IO0II0i:I

    sub-int/2addr v7, v4

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v4

    add-int/2addr v7, v4

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->getXLeft()I

    move-result v4

    add-int/2addr v7, v4

    iget v4, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->Ii0X0X:I

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XX0()I

    move-result v5

    add-int/2addr v4, v5

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iO()I

    move-result v5

    add-int/2addr v4, v5

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v5

    add-int/2addr v4, v5

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->getXtop()I

    move-result v5

    add-int/2addr v4, v5

    invoke-virtual {v2, v12, v3, v7, v4}, Landroid/graphics/Rect;->set(IIII)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X11I:Landroid/graphics/Rect;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->I1:Landroid/graphics/Paint;

    invoke-virtual {v1, v2, v3}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->Xi1i0XOX0:Landroid/graphics/Point;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X11I:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->right:I

    iget v5, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IO0II0i:I

    add-int/2addr v4, v5

    iget v3, v3, Landroid/graphics/Rect;->top:I

    add-int/2addr v3, v5

    invoke-virtual {v2, v4, v3}, Landroid/graphics/Point;->set(II)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iii0:Landroid/graphics/Point;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X11I:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->right:I

    iget v3, v3, Landroid/graphics/Rect;->top:I

    invoke-virtual {v2, v4, v3}, Landroid/graphics/Point;->set(II)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->Xii11I:Landroid/graphics/Point;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X11I:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->right:I

    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {v2, v4, v3}, Landroid/graphics/Point;->set(II)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->Xi1i0XOX0:Landroid/graphics/Point;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iii0:Landroid/graphics/Point;

    iget-object v4, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->Xii11I:Landroid/graphics/Point;

    iget-object v5, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->I1:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IO(Landroid/graphics/Canvas;Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Paint;)V

    goto/16 :goto_9

    :cond_16
    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IO:Landroid/graphics/RectF;

    iget-object v4, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X11I:Landroid/graphics/Rect;

    iget v5, v4, Landroid/graphics/Rect;->left:I

    int-to-float v5, v5

    iget v13, v4, Landroid/graphics/Rect;->top:I

    int-to-float v13, v13

    iget v14, v4, Landroid/graphics/Rect;->right:I

    int-to-float v14, v14

    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    int-to-float v4, v4

    invoke-virtual {v2, v5, v13, v14, v4}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IO:Landroid/graphics/RectF;

    iget v4, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IO0II0i:I

    int-to-float v5, v4

    int-to-float v4, v4

    iget-object v13, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->I1:Landroid/graphics/Paint;

    invoke-virtual {v1, v2, v5, v4, v13}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iOiXi11II:Ljava/util/ArrayList;

    new-instance v4, Landroid/graphics/Rect;

    iget-object v5, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X11I:Landroid/graphics/Rect;

    invoke-direct {v4, v5}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-nez v3, :cond_19

    if-eqz v8, :cond_17

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X11I:Landroid/graphics/Rect;

    iget v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IO0II0i:I

    add-int/2addr v12, v3

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    add-int/2addr v12, v3

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->getXLeft()I

    move-result v3

    add-int/2addr v12, v3

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XX0()I

    move-result v3

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iO()I

    move-result v4

    add-int/2addr v3, v4

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    add-int/2addr v3, v4

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->getXtop()I

    move-result v4

    add-int/2addr v3, v4

    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    move-result v4

    add-int/2addr v7, v4

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->getXLeft()I

    move-result v4

    add-int/2addr v7, v4

    iget v4, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->Ii0X0X:I

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XX0()I

    move-result v5

    add-int/2addr v4, v5

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iO()I

    move-result v5

    add-int/2addr v4, v5

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v5

    add-int/2addr v4, v5

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->getXtop()I

    move-result v5

    add-int/2addr v4, v5

    invoke-virtual {v2, v12, v3, v7, v4}, Landroid/graphics/Rect;->set(IIII)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X11I:Landroid/graphics/Rect;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->I1:Landroid/graphics/Paint;

    invoke-virtual {v1, v2, v3}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    goto :goto_9

    :cond_17
    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X11I:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    add-int/2addr v12, v3

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->getXLeft()I

    move-result v3

    add-int/2addr v12, v3

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XX0()I

    move-result v3

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iO()I

    move-result v4

    add-int/2addr v3, v4

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    add-int/2addr v3, v4

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->getXtop()I

    move-result v4

    add-int/2addr v3, v4

    iget v4, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IO0II0i:I

    sub-int/2addr v7, v4

    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    move-result v4

    add-int/2addr v7, v4

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->getXLeft()I

    move-result v4

    add-int/2addr v7, v4

    iget v4, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->Ii0X0X:I

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XX0()I

    move-result v5

    add-int/2addr v4, v5

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iO()I

    move-result v5

    add-int/2addr v4, v5

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v5

    add-int/2addr v4, v5

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->getXtop()I

    move-result v5

    add-int/2addr v4, v5

    invoke-virtual {v2, v12, v3, v7, v4}, Landroid/graphics/Rect;->set(IIII)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X11I:Landroid/graphics/Rect;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->I1:Landroid/graphics/Paint;

    invoke-virtual {v1, v2, v3}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    goto :goto_9

    :cond_18
    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IO:Landroid/graphics/RectF;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X11I:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->left:I

    int-to-float v4, v4

    iget v5, v3, Landroid/graphics/Rect;->top:I

    int-to-float v5, v5

    iget v7, v3, Landroid/graphics/Rect;->right:I

    int-to-float v7, v7

    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    int-to-float v3, v3

    invoke-virtual {v2, v4, v5, v7, v3}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IO:Landroid/graphics/RectF;

    iget v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IO0II0i:I

    int-to-float v4, v3

    int-to-float v3, v3

    iget-object v5, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->I1:Landroid/graphics/Paint;

    invoke-virtual {v1, v2, v4, v3, v5}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    :cond_19
    :goto_9
    iget-boolean v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iXi:Z

    if-eqz v2, :cond_20

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IX0IXOi:Landroid/graphics/Paint;

    if-eqz v11, :cond_1a

    iget v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XX00i10X:I

    if-nez v3, :cond_1a

    iget v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iOI:I

    const/4 v4, -0x1

    if-ne v3, v4, :cond_1b

    :cond_1a
    iget v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->O0O0X0iOi:I

    :cond_1b
    int-to-float v3, v3

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IX0IXOi:Landroid/graphics/Paint;

    if-eqz v11, :cond_1c

    iget v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XX00i10X:I

    if-nez v3, :cond_1c

    iget v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IO0iXO0O:I

    const/high16 v4, 0x10000

    if-ne v3, v4, :cond_1d

    :cond_1c
    iget v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->Oi:I

    :cond_1d
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    iget v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XX00i10X:I

    if-eqz v2, :cond_1f

    if-eq v2, v6, :cond_1e

    goto :goto_a

    :cond_1e
    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IX0IXOi:Landroid/graphics/Paint;

    invoke-virtual/range {p2 .. p2}, Lcom/android/mltcode/paycertificationapi/iz3;->iO()Ljava/lang/String;

    move-result-object v3

    iget-object v4, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X0iO:Landroid/graphics/Rect;

    iget v5, v4, Landroid/graphics/Rect;->left:I

    int-to-float v5, v5

    iget v6, v4, Landroid/graphics/Rect;->bottom:I

    move v7, v5

    int-to-float v5, v6

    iget v4, v4, Landroid/graphics/Rect;->right:I

    int-to-float v4, v4

    iget v11, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IX1XiI:I

    add-int/2addr v6, v11

    int-to-float v6, v6

    move/from16 v18, v6

    move v6, v4

    move v4, v7

    move/from16 v7, v18

    invoke-virtual/range {v0 .. v10}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->OIi0(Landroid/graphics/Canvas;Landroid/graphics/Paint;Ljava/lang/String;FFFFZZI)V

    return-void

    :cond_1f
    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IX0IXOi:Landroid/graphics/Paint;

    invoke-virtual/range {p2 .. p2}, Lcom/android/mltcode/paycertificationapi/iz3;->iO()Ljava/lang/String;

    move-result-object v3

    iget-object v1, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X0iO:Landroid/graphics/Rect;

    iget v4, v1, Landroid/graphics/Rect;->left:I

    int-to-float v4, v4

    iget v5, v1, Landroid/graphics/Rect;->bottom:I

    move v6, v5

    int-to-float v5, v6

    iget v1, v1, Landroid/graphics/Rect;->right:I

    int-to-float v1, v1

    iget v7, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IX1XiI:I

    add-int/2addr v6, v7

    int-to-float v7, v6

    move v6, v1

    move-object/from16 v1, p1

    invoke-virtual/range {v0 .. v7}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->I0IIOi(Landroid/graphics/Canvas;Landroid/graphics/Paint;Ljava/lang/String;FFFF)V

    :cond_20
    :goto_a
    return-void
.end method

.method public final O00(Landroid/graphics/Canvas;)V
    .locals 9
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "canvas"
        }
    .end annotation

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    :goto_0
    iget-object v4, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iOiXi11II:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v2, v4, :cond_5

    iget-object v4, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iOiXi11II:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/graphics/Rect;

    invoke-virtual {v0, v4}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    iget-object v4, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XXiIiX10:Ljava/util/List;

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/android/mltcode/paycertificationapi/iz3;

    iget v5, v0, Landroid/graphics/Rect;->left:I

    int-to-float v6, v5

    iget v7, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->OO:F

    cmpg-float v6, v6, v7

    const/4 v8, 0x1

    if-gez v6, :cond_1

    iget v6, v0, Landroid/graphics/Rect;->right:I

    int-to-float v6, v6

    cmpg-float v6, v7, v6

    if-gez v6, :cond_1

    float-to-int v3, v7

    iput v3, v0, Landroid/graphics/Rect;->left:I

    invoke-virtual {v4}, Lcom/android/mltcode/paycertificationapi/iz3;->IiI10X()I

    move-result v3

    iput v3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X1IX:I

    iget v5, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XOX0O0:F

    iget v6, v0, Landroid/graphics/Rect;->right:I

    int-to-float v6, v6

    cmpg-float v6, v5, v6

    if-gez v6, :cond_0

    float-to-int v5, v5

    iput v5, v0, Landroid/graphics/Rect;->right:I

    iput v3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X0i1O:I

    move v8, v1

    :cond_0
    iget-object v5, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->I1:Landroid/graphics/Paint;

    invoke-virtual {v5, v3}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->I1:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v3}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    :goto_1
    move v3, v8

    goto :goto_2

    :cond_1
    int-to-float v5, v5

    cmpl-float v5, v5, v7

    if-nez v5, :cond_2

    float-to-int v3, v7

    iput v3, v0, Landroid/graphics/Rect;->left:I

    invoke-virtual {v4}, Lcom/android/mltcode/paycertificationapi/iz3;->IiI10X()I

    move-result v3

    iput v3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X1IX:I

    goto :goto_1

    :cond_2
    :goto_2
    if-eqz v3, :cond_4

    iget v5, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XOX0O0:F

    iget v6, v0, Landroid/graphics/Rect;->right:I

    int-to-float v6, v6

    cmpg-float v6, v5, v6

    if-gtz v6, :cond_3

    float-to-int v3, v5

    iput v3, v0, Landroid/graphics/Rect;->right:I

    invoke-virtual {v4}, Lcom/android/mltcode/paycertificationapi/iz3;->IiI10X()I

    move-result v3

    iput v3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X0i1O:I

    iget-object v4, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->I1:Landroid/graphics/Paint;

    invoke-virtual {v4, v3}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->I1:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v3}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    move v3, v1

    goto :goto_3

    :cond_3
    iget-object v5, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->I1:Landroid/graphics/Paint;

    invoke-virtual {v4}, Lcom/android/mltcode/paycertificationapi/iz3;->IiI10X()I

    move-result v4

    invoke-virtual {v5, v4}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v4, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->I1:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v4}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    :cond_4
    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_5
    return-void
.end method

.method public O10IXXX0X(FLjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "value2",
            "valueText"
        }
    .end annotation

    iput-object p2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XXO:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iXiX011:Ljava/lang/Float;

    invoke-virtual {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->OXO1()V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public final OIX0iXi(Landroid/graphics/Canvas;II)V
    .locals 8
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "canvas",
            "valueSignSpaceHeight",
            "valueSignCenter"
        }
    .end annotation

    const/4 v0, -0x1

    const/4 v1, 0x0

    if-ne p3, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->getContentWidth()I

    move-result p3

    div-int/lit8 p3, p3, 0x2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    add-int/2addr p3, v2

    :cond_1
    iget-object v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XX1Oi:Landroid/graphics/Rect;

    iget v3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XXX11i:I

    div-int/lit8 v3, v3, 0x2

    sub-int v3, p3, v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    iget v5, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XXX11i:I

    div-int/lit8 v5, v5, 0x2

    add-int/2addr v5, p3

    iget v6, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X11iII1O1:I

    iget v7, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X00XIX1:I

    sub-int/2addr v6, v7

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v7

    add-int/2addr v6, v7

    invoke-virtual {v2, v3, v4, v5, v6}, Landroid/graphics/Rect;->set(IIII)V

    iget-object v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iX1O1:Landroid/graphics/Paint;

    iget v3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X0i1O:I

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XX1Oi:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->left:I

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    if-ge v2, v3, :cond_2

    iget-object v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XX1Oi:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->left:I

    neg-int v2, v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    add-int/2addr v2, v3

    iget-object v3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IO:Landroid/graphics/RectF;

    iget-object v4, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XX1Oi:Landroid/graphics/Rect;

    iget v5, v4, Landroid/graphics/Rect;->left:I

    add-int/2addr v5, v2

    int-to-float v5, v5

    iget v6, v4, Landroid/graphics/Rect;->top:I

    int-to-float v6, v6

    iget v7, v4, Landroid/graphics/Rect;->right:I

    add-int/2addr v7, v2

    int-to-float v2, v7

    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    int-to-float v4, v4

    invoke-virtual {v3, v5, v6, v2, v4}, Landroid/graphics/RectF;->set(FFFF)V

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XX1Oi:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->right:I

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v4

    sub-int/2addr v3, v4

    if-le v2, v3, :cond_3

    iget-object v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XX1Oi:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->right:I

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v3

    add-int/2addr v2, v3

    iget-object v3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IO:Landroid/graphics/RectF;

    iget-object v4, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XX1Oi:Landroid/graphics/Rect;

    iget v5, v4, Landroid/graphics/Rect;->left:I

    sub-int/2addr v5, v2

    int-to-float v5, v5

    iget v6, v4, Landroid/graphics/Rect;->top:I

    int-to-float v6, v6

    iget v7, v4, Landroid/graphics/Rect;->right:I

    sub-int/2addr v7, v2

    int-to-float v2, v7

    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    int-to-float v4, v4

    invoke-virtual {v3, v5, v6, v2, v4}, Landroid/graphics/RectF;->set(FFFF)V

    goto :goto_1

    :cond_3
    iget-object v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IO:Landroid/graphics/RectF;

    iget-object v3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XX1Oi:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->left:I

    int-to-float v4, v4

    iget v5, v3, Landroid/graphics/Rect;->top:I

    int-to-float v5, v5

    iget v6, v3, Landroid/graphics/Rect;->right:I

    int-to-float v6, v6

    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    int-to-float v3, v3

    invoke-virtual {v2, v4, v5, v6, v3}, Landroid/graphics/RectF;->set(FFFF)V

    :goto_1
    iget-object v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IO:Landroid/graphics/RectF;

    iget v3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->OX110i:I

    int-to-float v4, v3

    int-to-float v3, v3

    iget-object v5, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iX1O1:Landroid/graphics/Paint;

    invoke-virtual {p1, v2, v4, v3, v5}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    if-nez v0, :cond_6

    iget v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->i0X000X0O:I

    div-int/lit8 v0, v0, 0x2

    sub-int v0, p3, v0

    iget v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IO0II0i:I

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    add-int/2addr v2, v3

    if-ge v0, v2, :cond_4

    iget v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IO0II0i:I

    sub-int/2addr v0, p3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    add-int/2addr v1, v0

    goto :goto_2

    :cond_4
    iget v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->i0X000X0O:I

    div-int/lit8 v0, v0, 0x2

    add-int/2addr v0, p3

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    iget v3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IO0II0i:I

    sub-int/2addr v2, v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v3

    sub-int/2addr v2, v3

    if-le v0, v2, :cond_5

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    iget v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IO0II0i:I

    sub-int/2addr v0, v1

    sub-int/2addr v0, p3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    sub-int v1, v0, v1

    :cond_5
    :goto_2
    iget-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->Xi1i0XOX0:Landroid/graphics/Point;

    iget v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->i0X000X0O:I

    div-int/lit8 v2, v2, 0x2

    sub-int v2, p3, v2

    add-int/2addr v2, v1

    iget v3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X00XIX1:I

    sub-int v3, p2, v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    add-int/2addr v3, v4

    invoke-virtual {v0, v2, v3}, Landroid/graphics/Point;->set(II)V

    iget-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iii0:Landroid/graphics/Point;

    iget v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->i0X000X0O:I

    div-int/lit8 v2, v2, 0x2

    add-int/2addr v2, p3

    add-int/2addr v2, v1

    iget v3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X00XIX1:I

    sub-int v3, p2, v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    add-int/2addr v3, v4

    invoke-virtual {v0, v2, v3}, Landroid/graphics/Point;->set(II)V

    iget-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->Xii11I:Landroid/graphics/Point;

    add-int/2addr p3, v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    add-int/2addr p2, v1

    invoke-virtual {v0, p3, p2}, Landroid/graphics/Point;->set(II)V

    iget-object v3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->Xi1i0XOX0:Landroid/graphics/Point;

    iget-object v4, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iii0:Landroid/graphics/Point;

    iget-object v5, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->Xii11I:Landroid/graphics/Point;

    iget-object v6, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iX1O1:Landroid/graphics/Paint;

    move-object v1, p0

    move-object v2, p1

    invoke-virtual/range {v1 .. v6}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IO(Landroid/graphics/Canvas;Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Paint;)V

    goto :goto_3

    :cond_6
    move-object v1, p0

    move-object v2, p1

    :goto_3
    invoke-virtual {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XX0()I

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p2

    add-int/2addr p1, p2

    invoke-virtual {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iO()I

    move-result p2

    add-int/2addr p1, p2

    invoke-direct {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->getXtop()I

    move-result p2

    add-int/2addr p1, p2

    add-int/lit8 p1, p1, -0xf

    iget p2, v1, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->Ii0X0X:I

    invoke-virtual {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XX0()I

    move-result p3

    add-int/2addr p2, p3

    invoke-virtual {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iO()I

    move-result p3

    add-int/2addr p2, p3

    invoke-direct {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->getXtop()I

    move-result p3

    add-int/2addr p2, p3

    add-int/lit8 p2, p2, 0xf

    new-instance p3, Landroid/graphics/RectF;

    iget-object v0, v1, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->Xii11I:Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v3, v0

    const/high16 v4, 0x41200000    # 10.0f

    sub-float/2addr v3, v4

    int-to-float p1, p1

    int-to-float v0, v0

    add-float/2addr v0, v4

    int-to-float p2, p2

    invoke-direct {p3, v3, p1, v0, p2}, Landroid/graphics/RectF;-><init>(FFFF)V

    iget-object p1, v1, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iX1O1:Landroid/graphics/Paint;

    invoke-virtual {v2, p3, v4, v4, p1}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    iget-object p1, v1, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XOO0XOOii:Landroid/text/StaticLayout;

    if-eqz p1, :cond_7

    invoke-virtual {v2}, Landroid/graphics/Canvas;->save()I

    iget-object p1, v1, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IO:Landroid/graphics/RectF;

    iget p2, p1, Landroid/graphics/RectF;->left:F

    iget p3, p1, Landroid/graphics/RectF;->top:F

    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result p1

    const/high16 v0, 0x40000000    # 2.0f

    div-float/2addr p1, v0

    add-float/2addr p3, p1

    iget-object p1, v1, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XOO0XOOii:Landroid/text/StaticLayout;

    invoke-virtual {p1}, Landroid/text/Layout;->getHeight()I

    move-result p1

    div-int/lit8 p1, p1, 0x2

    int-to-float p1, p1

    sub-float/2addr p3, p1

    invoke-virtual {v2, p2, p3}, Landroid/graphics/Canvas;->translate(FF)V

    iget-object p1, v1, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XOO0XOOii:Landroid/text/StaticLayout;

    invoke-virtual {p1, v2}, Landroid/text/Layout;->draw(Landroid/graphics/Canvas;)V

    invoke-virtual {v2}, Landroid/graphics/Canvas;->restore()V

    :cond_7
    return-void
.end method

.method public final OIi0(Landroid/graphics/Canvas;Landroid/graphics/Paint;Ljava/lang/String;FFFFZZI)V
    .locals 10
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "canvas",
            "paint",
            "text",
            "left",
            "top",
            "right",
            "bottom",
            "isLeftSegment",
            "isRightSegment",
            "index"
        }
    .end annotation

    move/from16 v1, p6

    sget-object v2, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {p2, v2}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    invoke-virtual {p2}, Landroid/graphics/Paint;->descent()F

    move-result v2

    invoke-virtual {p2}, Landroid/graphics/Paint;->ascent()F

    move-result v3

    sub-float/2addr v2, v3

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    invoke-virtual {p2}, Landroid/graphics/Paint;->descent()F

    move-result v4

    sub-float/2addr v2, v4

    invoke-virtual/range {p2 .. p3}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v4

    if-eqz p8, :cond_0

    div-float/2addr v4, v3

    add-float v0, p4, v4

    add-float v1, p5, p7

    div-float/2addr v1, v3

    add-float/2addr v1, v2

    invoke-virtual {p1, p3, v0, v1, p2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    return-void

    :cond_0
    const/4 v5, 0x0

    const/4 v6, 0x2

    const-string v7, "&"

    const/4 v8, 0x1

    if-eqz p9, :cond_2

    iget-object v9, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XXiIiX10:Ljava/util/List;

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v9

    if-gt v9, v6, :cond_1

    invoke-virtual {p3, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-static {p3, v7}, Landroid/text/TextUtils;->split(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p3

    aget-object v4, p3, v5

    add-float v5, p5, p7

    div-float/2addr v5, v3

    add-float/2addr v5, v2

    invoke-virtual {p1, v4, p4, v5, p2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    aget-object v0, p3, v8

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v0

    aget-object p3, p3, v8

    div-float/2addr v0, v3

    sub-float v0, v1, v0

    invoke-virtual {p1, p3, v0, v5, p2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    return-void

    :cond_1
    div-float/2addr v4, v3

    sub-float v0, v1, v4

    add-float v1, p5, p7

    div-float/2addr v1, v3

    add-float/2addr v1, v2

    invoke-virtual {p1, p3, v0, v1, p2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    return-void

    :cond_2
    if-nez p8, :cond_5

    if-nez p9, :cond_5

    invoke-virtual {p3, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-static {p3, v7}, Landroid/text/TextUtils;->split(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p3

    rem-int/lit8 v4, p10, 0x2

    if-ne v4, v8, :cond_3

    aget-object v4, p3, v5

    add-float v5, p5, p7

    div-float/2addr v5, v3

    add-float/2addr v5, v2

    invoke-virtual {p1, v4, p4, v5, p2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    aget-object p3, p3, v8

    invoke-virtual {p1, p3, v1, v5, p2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    return-void

    :cond_3
    aget-object p3, p3, v8

    add-float v0, p5, p7

    div-float/2addr v0, v3

    add-float/2addr v0, v2

    invoke-virtual {p1, p3, v1, v0, p2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    :cond_4
    return-void

    :cond_5
    div-float/2addr v4, v3

    sub-float v0, v1, v4

    add-float v1, p5, p7

    div-float/2addr v1, v3

    add-float/2addr v1, v2

    invoke-virtual {p1, p3, v0, v1, p2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    return-void
.end method

.method public final OXO1()V
    .locals 9

    invoke-virtual {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XiOIO()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XOO0XOOii:Landroid/text/StaticLayout;

    return-void

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iXiX011:Ljava/lang/Float;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IXOIIIO:Ljava/text/DecimalFormat;

    invoke-virtual {v1, v0}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iiiO:Ljava/lang/String;

    :goto_0
    iget-object v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iXiX011:Ljava/lang/Float;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X00Xi1X:Ljava/lang/String;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X00Xi1X:Ljava/lang/String;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v2, "<br><small>%s</small>"

    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_2
    iget-object v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XXO:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XXO:Ljava/lang/String;

    :cond_3
    invoke-static {v0}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v2

    new-instance v1, Landroid/text/StaticLayout;

    iget-object v3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iiIOiX:Landroid/text/TextPaint;

    iget v4, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XXX11i:I

    sget-object v5, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-direct/range {v1 .. v8}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    iput-object v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XOO0XOOii:Landroid/text/StaticLayout;

    return-void
.end method

.method public X0O(Ljava/lang/Float;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "value2",
            "unitHtml"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iXiX011:Ljava/lang/Float;

    iput-object p2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X00Xi1X:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XiOIO()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->OXO1()V

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public X1ii(FLjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "value",
            "valueText"
        }
    .end annotation

    iput-object p2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->O001I:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iIXi1iiXI:Ljava/lang/Float;

    invoke-virtual {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XIi00iiXO()V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public final XIi00iiXO()V
    .locals 9

    invoke-virtual {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iIiiO()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XOXiX0:Landroid/text/StaticLayout;

    return-void

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iIXi1iiXI:Ljava/lang/Float;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IXOIIIO:Ljava/text/DecimalFormat;

    invoke-virtual {v1, v0}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iiiO:Ljava/lang/String;

    :goto_0
    iget-object v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iIXi1iiXI:Ljava/lang/Float;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X00Xi1X:Ljava/lang/String;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X00Xi1X:Ljava/lang/String;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v2, "<br><small>%s</small>"

    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_2
    iget-object v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->O001I:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->O001I:Ljava/lang/String;

    :cond_3
    invoke-static {v0}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v2

    new-instance v1, Landroid/text/StaticLayout;

    iget-object v3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iiIOiX:Landroid/text/TextPaint;

    iget v4, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XXX11i:I

    sget-object v5, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-direct/range {v1 .. v8}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    iput-object v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XOXiX0:Landroid/text/StaticLayout;

    return-void
.end method

.method public final XO0O10(Landroid/graphics/Canvas;)V
    .locals 11
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "canvas"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iIi1:Landroid/graphics/Paint;

    iget v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iI0I:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iIi1:Landroid/graphics/Paint;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iIi1:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iget-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XXiIiX10:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/iz3;

    iget-object v3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XXiIiX10:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    sub-int/2addr v4, v1

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/android/mltcode/paycertificationapi/iz3;

    iget-object v4, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iOiXi11II:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/graphics/Rect;

    iget-object v5, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iOiXi11II:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v6

    sub-int/2addr v6, v1

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Rect;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/iz3;->XO0O10()F

    move-result v3

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/iz3;->O00()F

    move-result v0

    sub-float/2addr v3, v0

    iget v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X1OI:F

    div-float/2addr v3, v0

    float-to-int v0, v3

    iput v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->i100IXOX:I

    iget v1, v1, Landroid/graphics/Rect;->right:I

    iget v3, v4, Landroid/graphics/Rect;->left:I

    sub-int/2addr v1, v3

    int-to-float v1, v1

    int-to-float v0, v0

    div-float/2addr v1, v0

    :goto_0
    iget v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->i100IXOX:I

    if-gt v2, v0, :cond_0

    iget v0, v4, Landroid/graphics/Rect;->left:I

    int-to-float v0, v0

    int-to-float v3, v2

    mul-float/2addr v3, v1

    add-float v6, v0, v3

    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    move-result v0

    int-to-float v0, v0

    iget v3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iIX0i:F

    sub-float/2addr v0, v3

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v0, v3

    iget v3, v4, Landroid/graphics/Rect;->top:I

    int-to-float v3, v3

    add-float v7, v3, v0

    iget v3, v4, Landroid/graphics/Rect;->bottom:I

    int-to-float v3, v3

    sub-float v9, v3, v0

    iget-object v10, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iIi1:Landroid/graphics/Paint;

    move v8, v6

    move-object v5, p1

    invoke-virtual/range {v5 .. v10}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final XOO0ii0(Landroid/graphics/Canvas;Landroid/graphics/Paint;Ljava/lang/String;Landroid/graphics/Rect;)V
    .locals 9
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "canvas",
            "paint",
            "text",
            "outsideRect"
        }
    .end annotation

    iget v0, p4, Landroid/graphics/Rect;->left:I

    int-to-float v5, v0

    iget v0, p4, Landroid/graphics/Rect;->top:I

    int-to-float v6, v0

    iget v0, p4, Landroid/graphics/Rect;->right:I

    int-to-float v7, v0

    iget p4, p4, Landroid/graphics/Rect;->bottom:I

    int-to-float v8, p4

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-virtual/range {v1 .. v8}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->I0IIOi(Landroid/graphics/Canvas;Landroid/graphics/Paint;Ljava/lang/String;FFFF)V

    return-void
.end method

.method public final XX0()I
    .locals 1

    invoke-virtual {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iIiiO()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X11iII1O1:I

    return v0
.end method

.method public final XXI(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5
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

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    sget-object v0, Lcom/sma/smartv3/R$styleable;->SegmentedBarView:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, v1, v1}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const/4 v0, 0x3

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XX00i10X:I

    const v0, 0x7f0703cf

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    const/16 v2, 0x2a

    invoke-virtual {p1, v2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IiiXiI0I:I

    const v0, 0x7f0703c8

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    const/16 v2, 0xa

    invoke-virtual {p1, v2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->O0O0X0iOi:I

    const/16 v0, 0x8

    const/4 v2, -0x1

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iOI:I

    const v0, 0x7f0703c6

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    const/4 v3, 0x2

    invoke-virtual {p1, v3, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->Ii0X0X:I

    const v0, 0x7f0703cc

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    const/16 v3, 0x27

    invoke-virtual {p1, v3, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X11iII1O1:I

    const v0, 0x7f0703ce

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    const/16 v3, 0x29

    invoke-virtual {p1, v3, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XXX11i:I

    const v0, 0x7f0703c4

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    invoke-virtual {p1, v1, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X00XIX1:I

    const v0, 0x7f0703c5

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    const/4 v3, 0x1

    invoke-virtual {p1, v3, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->i0X000X0O:I

    const v0, 0x7f0703c9

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    const/16 v4, 0x12

    invoke-virtual {p1, v4, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->i11I:I

    const/16 v0, 0x16

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IO0II0i:I

    const/16 v0, 0x11

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XO0X10iO:I

    const v0, 0x7f0703cd

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    const/16 v4, 0x28

    invoke-virtual {p1, v4, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->OX110i:I

    const v0, 0x7f0703c7

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    const/4 v4, 0x5

    invoke-virtual {p1, v4, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IX1XiI:I

    const/16 v0, 0x19

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iXi:Z

    const/16 v0, 0x23

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iiiO:Ljava/lang/String;

    if-nez v0, :cond_0

    const v0, 0x7f1411cb

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iiiO:Ljava/lang/String;

    goto :goto_0

    :catchall_0
    move-exception p2

    goto/16 :goto_1

    :cond_0
    :goto_0
    iget p2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->Oi:I

    const/16 v0, 0x9

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->Oi:I

    const/4 p2, 0x7

    const/high16 v0, 0x10000

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IO0iXO0O:I

    const/16 p2, 0x1d

    invoke-virtual {p1, p2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->Ii0i:I

    const/16 p2, 0x17

    invoke-virtual {p1, p2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X111IO:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    new-instance p1, Ljava/text/DecimalFormat;

    const-string p2, "##.####"

    invoke-direct {p1, p2}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IXOIIIO:Ljava/text/DecimalFormat;

    new-instance p1, Landroid/text/TextPaint;

    invoke-direct {p1, v3}, Landroid/text/TextPaint;-><init>(I)V

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IXI:Landroid/graphics/Paint;

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IXI:Landroid/graphics/Paint;

    sget-object p2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    new-instance p1, Landroid/text/TextPaint;

    invoke-direct {p1, v3}, Landroid/text/TextPaint;-><init>(I)V

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iiIOiX:Landroid/text/TextPaint;

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iiIOiX:Landroid/text/TextPaint;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iiIOiX:Landroid/text/TextPaint;

    iget v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IiiXiI0I:I

    int-to-float v0, v0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iiIOiX:Landroid/text/TextPaint;

    iget v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XOIX:I

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    new-instance p1, Landroid/text/TextPaint;

    invoke-direct {p1, v3}, Landroid/text/TextPaint;-><init>(I)V

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IX0IXOi:Landroid/graphics/Paint;

    const v0, -0xbbbbbc

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IX0IXOi:Landroid/graphics/Paint;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, v3}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->I1:Landroid/graphics/Paint;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->I1:Landroid/graphics/Paint;

    invoke-virtual {p1, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, v3}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iX1O1:Landroid/graphics/Paint;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iX1O1:Landroid/graphics/Paint;

    invoke-virtual {p1, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, v3}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X1:Landroid/graphics/Paint;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X11I:Landroid/graphics/Rect;

    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IO:Landroid/graphics/RectF;

    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X100O:Landroid/graphics/Rect;

    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XX1Oi:Landroid/graphics/Rect;

    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X0iO:Landroid/graphics/Rect;

    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->O0O:Landroid/graphics/Path;

    sget-object p2, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    invoke-virtual {p1, p2}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    new-instance p1, Landroid/graphics/Point;

    invoke-direct {p1}, Landroid/graphics/Point;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->Xi1i0XOX0:Landroid/graphics/Point;

    new-instance p1, Landroid/graphics/Point;

    invoke-direct {p1}, Landroid/graphics/Point;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iii0:Landroid/graphics/Point;

    new-instance p1, Landroid/graphics/Point;

    invoke-direct {p1}, Landroid/graphics/Point;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->Xii11I:Landroid/graphics/Point;

    iput v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XXiO0i:I

    return-void

    :goto_1
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    throw p2
.end method

.method public final XiOIO()Z
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iXiX011:Ljava/lang/Float;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->Ii1iii0:Ljava/lang/Integer;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getValueSegment()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iXiiiO:Ljava/lang/Integer;

    return-object v0
.end method

.method public getValueSegmentText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iiiO:Ljava/lang/String;

    return-object v0
.end method

.method public final iIiiO()Z
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iIXi1iiXI:Ljava/lang/Float;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iXiiiO:Ljava/lang/Integer;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final iO()I
    .locals 1

    invoke-virtual {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iIiiO()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XXiO0i:I

    return v0
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 7
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "canvas"
        }
    .end annotation

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    iget-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iOiXi11II:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->OO:F

    iput v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XOX0O0:F

    iget-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XXiIiX10:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    iget-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XXiIiX10:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/iz3;

    const/4 v1, 0x0

    move v4, v1

    :goto_0
    if-ge v4, v5, :cond_0

    iget-object v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XXiIiX10:Ljava/util/List;

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lcom/android/mltcode/paycertificationapi/iz3;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/iz3;->XO0O10()F

    move-result v6

    move-object v1, p0

    move-object v2, p1

    invoke-virtual/range {v1 .. v6}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IiI10X(Landroid/graphics/Canvas;Lcom/android/mltcode/paycertificationapi/iz3;IIF)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    move-object v1, p0

    move-object v2, p1

    invoke-virtual {p0, v2}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->O00(Landroid/graphics/Canvas;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XX0()I

    move-result p1

    iget v0, v1, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->OO:F

    float-to-int v0, v0

    invoke-virtual {p0, v2, p1, v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->I0iXXO(Landroid/graphics/Canvas;II)V

    invoke-virtual {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XX0()I

    move-result p1

    iget v0, v1, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XOX0O0:F

    float-to-int v0, v0

    invoke-virtual {p0, v2, p1, v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->OIX0iXi(Landroid/graphics/Canvas;II)V

    invoke-virtual {p0, v2}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XO0O10(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public onMeasure(II)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "widthMeasureSpec",
            "heightMeasureSpec"
        }
    .end annotation

    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    add-int/2addr v0, v1

    iget v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->Ii0X0X:I

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    add-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    add-int/2addr v1, v2

    invoke-virtual {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iIiiO()Z

    move-result v2

    if-nez v2, :cond_0

    iget v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X11iII1O1:I

    iget v3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X00XIX1:I

    add-int/2addr v2, v3

    add-int/2addr v1, v2

    :cond_0
    iget-boolean v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iXi:Z

    if-eqz v2, :cond_1

    iget v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->IX1XiI:I

    add-int/2addr v1, v2

    :cond_1
    const/4 v2, 0x0

    invoke-static {v0, p1, v2}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result p1

    invoke-static {v1, p2, v2}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public setBarHeight(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "barHeight"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->Ii0X0X:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setGapColor(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "gapColor"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XO0X10iO:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setGapWidth(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "gapWidth"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->i11I:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setSegmentSideRule(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "sideRule"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X111IO:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setSegments(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "segments"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/android/mltcode/paycertificationapi/iz3;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XXiIiX10:Ljava/util/List;

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setShowDescriptionText(Z)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "showDescriptionText"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iXi:Z

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setUnit(Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "unit"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X00Xi1X:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XIi00iiXO()V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setValue(Ljava/lang/Float;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "value"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iIXi1iiXI:Ljava/lang/Float;

    invoke-virtual {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XIi00iiXO()V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setValue2(Ljava/lang/Float;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "value"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iXiX011:Ljava/lang/Float;

    invoke-virtual {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->OXO1()V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setValue2Segment(Ljava/lang/Integer;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "value2Segment"
        }
    .end annotation

    const/4 v0, 0x1

    iput v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X111IO:I

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->Ii1iii0:Ljava/lang/Integer;

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setValueSegment(Ljava/lang/Integer;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "valueSegment"
        }
    .end annotation

    const/4 v0, 0x1

    iput v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X111IO:I

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iXiiiO:Ljava/lang/Integer;

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setValueSegmentText(Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "valueSegmentText"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->iiiO:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->XIi00iiXO()V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setValueSignColor(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "valueSignColor"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X1IX:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method
