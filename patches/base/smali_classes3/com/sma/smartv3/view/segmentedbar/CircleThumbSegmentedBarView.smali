.class public Lcom/sma/smartv3/view/segmentedbar/CircleThumbSegmentedBarView;
.super Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "context"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
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

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public i010I(Landroid/graphics/Canvas;IIFFILandroid/graphics/Paint;)V
    .locals 2
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
            "thumbW",
            "thumbH",
            "centerX",
            "centerY",
            "color",
            "paint"
        }
    .end annotation

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    const/4 v0, -0x1

    invoke-virtual {p7, v0}, Landroid/graphics/Paint;->setColor(I)V

    invoke-static {p3, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    div-int/lit8 p2, p2, 0x2

    const/16 p3, 0x50

    const/4 v0, 0x0

    invoke-static {p3, v0, v0, v0}, Landroid/graphics/Color;->argb(IIII)I

    move-result p3

    const/high16 v0, 0x41200000    # 10.0f

    const/4 v1, 0x0

    invoke-virtual {p7, v0, v1, v1, p3}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    add-int/lit8 p3, p2, -0xa

    int-to-float p3, p3

    invoke-virtual {p1, p4, p5, p3, p7}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    invoke-virtual {p7}, Landroid/graphics/Paint;->clearShadowLayer()V

    invoke-virtual {p7, p6}, Landroid/graphics/Paint;->setColor(I)V

    add-int/lit8 p2, p2, -0x12

    int-to-float p2, p2

    invoke-virtual {p1, p4, p5, p2, p7}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    return-void
.end method
