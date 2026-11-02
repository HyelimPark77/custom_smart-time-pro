.class public Lcom/sma/smartv3/view/bubbleview/BubbleLayout;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# static fields
.field public static O001I:F = -1.0f


# instance fields
.field public I1:Lcom/android/mltcode/paycertificationapi/i11iO0O0;

.field public IO:Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

.field public X0i1O:I

.field public X11iII1O1:F

.field public X1IX:F

.field public XXX11i:F

.field public iIXi1iiXI:F

.field public iX1O1:F

.field public iXiX011:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "context"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-direct {p0, p1, v0, v1}, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

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

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2
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

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    sget-object v0, Lcom/sma/smartv3/R$styleable;->BubbleLayout:[I

    invoke-virtual {p3, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p2

    const/high16 p3, 0x41000000    # 8.0f

    .line 5
    invoke-static {p3, p1}, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->OXO1(FLandroid/content/Context;)F

    move-result v0

    const/4 v1, 0x3

    .line 6
    invoke-virtual {p2, v1, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->iX1O1:F

    const/4 v0, 0x1

    .line 7
    invoke-static {p3, p1}, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->OXO1(FLandroid/content/Context;)F

    move-result p3

    .line 8
    invoke-virtual {p2, v0, p3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p3

    iput p3, p0, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->XXX11i:F

    const/4 p3, 0x5

    const/4 v0, 0x0

    .line 9
    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p3

    iput p3, p0, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->X11iII1O1:F

    const/high16 p3, 0x41400000    # 12.0f

    .line 10
    invoke-static {p3, p1}, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->OXO1(FLandroid/content/Context;)F

    move-result p1

    const/4 p3, 0x2

    .line 11
    invoke-virtual {p2, p3, p1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->X1IX:F

    const/4 p1, 0x4

    const/4 p3, -0x1

    .line 12
    invoke-virtual {p2, p1, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->X0i1O:I

    const/4 p1, 0x7

    .line 13
    sget p3, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->O001I:F

    .line 14
    invoke-virtual {p2, p1, p3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->iIXi1iiXI:F

    const/4 p1, 0x6

    const p3, -0x777778

    .line 15
    invoke-virtual {p2, p1, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->iXiX011:I

    .line 16
    sget-object p1, Lcom/sma/smartv3/view/bubbleview/ArrowDirection;->LEFT:Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

    invoke-virtual {p1}, Lcom/sma/smartv3/view/bubbleview/ArrowDirection;->getValue()I

    move-result p1

    const/4 p3, 0x0

    invoke-virtual {p2, p3, p1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    .line 17
    invoke-static {p1}, Lcom/sma/smartv3/view/bubbleview/ArrowDirection;->fromInt(I)Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->IO:Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

    .line 18
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 19
    invoke-virtual {p0}, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->iO()V

    return-void
.end method

.method public static OXO1(FLandroid/content/Context;)F
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "dp",
            "context"
        }
    .end annotation

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->densityDpi:I

    div-int/lit16 p1, p1, 0xa0

    int-to-float p1, p1

    mul-float/2addr p0, p1

    return p0
.end method


# virtual methods
.method public I0IIOi(F)Lcom/sma/smartv3/view/bubbleview/BubbleLayout;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "arrowWidth"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->XO0O10()V

    iput p1, p0, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->iX1O1:F

    invoke-virtual {p0}, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->iO()V

    return-object p0
.end method

.method public I0iXXO(F)Lcom/sma/smartv3/view/bubbleview/BubbleLayout;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "strokeWidth"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->XO0O10()V

    iput p1, p0, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->iIXi1iiXI:F

    invoke-virtual {p0}, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->iO()V

    return-object p0
.end method

.method public IO(F)Lcom/sma/smartv3/view/bubbleview/BubbleLayout;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "cornersRadius"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->X11iII1O1:F

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-object p0
.end method

.method public IiI10X(F)Lcom/sma/smartv3/view/bubbleview/BubbleLayout;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "arrowHeight"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->XO0O10()V

    iput p1, p0, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->XXX11i:F

    invoke-virtual {p0}, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->iO()V

    return-object p0
.end method

.method public O00(Lcom/sma/smartv3/view/bubbleview/ArrowDirection;)Lcom/sma/smartv3/view/bubbleview/BubbleLayout;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "arrowDirection"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->XO0O10()V

    iput-object p1, p0, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->IO:Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

    invoke-virtual {p0}, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->iO()V

    return-object p0
.end method

.method public OIX0iXi(I)Lcom/sma/smartv3/view/bubbleview/BubbleLayout;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "strokeColor"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->iXiX011:I

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-object p0
.end method

.method public OIi0(I)Lcom/sma/smartv3/view/bubbleview/BubbleLayout;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "bubbleColor"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->X0i1O:I

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-object p0
.end method

.method public final XIi00iiXO(IIII)V
    .locals 10
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "left",
            "right",
            "top",
            "bottom"
        }
    .end annotation

    if-lt p2, p1, :cond_1

    if-ge p4, p3, :cond_0

    goto :goto_3

    :cond_0
    new-instance v1, Landroid/graphics/RectF;

    int-to-float v0, p1

    int-to-float v2, p3

    int-to-float v3, p2

    int-to-float v4, p4

    invoke-direct {v1, v0, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    iget v0, p0, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->X1IX:F

    sget-object v2, Lcom/sma/smartv3/view/bubbleview/BubbleLayout$OXO1;->OXO1:[I

    iget-object v4, p0, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->IO:Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v2, v2, v4

    const/high16 v4, 0x40000000    # 2.0f

    packed-switch v2, :pswitch_data_0

    :goto_0
    move v5, v0

    goto :goto_2

    :pswitch_0
    iget p1, p0, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->X1IX:F

    sub-float/2addr v3, p1

    iget p1, p0, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->iX1O1:F

    div-float/2addr p1, v4

    sub-float v0, v3, p1

    goto :goto_0

    :pswitch_1
    sub-int/2addr p2, p1

    int-to-float p1, p2

    div-float/2addr p1, v4

    iget p2, p0, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->iX1O1:F

    :goto_1
    div-float/2addr p2, v4

    sub-float v0, p1, p2

    goto :goto_0

    :pswitch_2
    sub-int/2addr p4, p3

    int-to-float p1, p4

    div-float/2addr p1, v4

    iget p2, p0, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->XXX11i:F

    goto :goto_1

    :goto_2
    new-instance v0, Lcom/android/mltcode/paycertificationapi/i11iO0O0;

    iget v2, p0, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->iX1O1:F

    iget v3, p0, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->X11iII1O1:F

    iget v4, p0, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->XXX11i:F

    iget v6, p0, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->iIXi1iiXI:F

    iget v7, p0, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->iXiX011:I

    iget v8, p0, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->X0i1O:I

    iget-object v9, p0, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->IO:Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

    invoke-direct/range {v0 .. v9}, Lcom/android/mltcode/paycertificationapi/i11iO0O0;-><init>(Landroid/graphics/RectF;FFFFFIILcom/sma/smartv3/view/bubbleview/ArrowDirection;)V

    iput-object v0, p0, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->I1:Lcom/android/mltcode/paycertificationapi/i11iO0O0;

    :cond_1
    :goto_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final XO0O10()V
    .locals 6

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    sget-object v4, Lcom/sma/smartv3/view/bubbleview/BubbleLayout$OXO1;->OXO1:[I

    iget-object v5, p0, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->IO:Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v4, v4, v5

    packed-switch v4, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    int-to-float v3, v3

    iget v4, p0, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->XXX11i:F

    sub-float/2addr v3, v4

    float-to-int v3, v3

    goto :goto_0

    :pswitch_1
    int-to-float v2, v2

    iget v4, p0, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->XXX11i:F

    sub-float/2addr v2, v4

    float-to-int v2, v2

    goto :goto_0

    :pswitch_2
    int-to-float v1, v1

    iget v4, p0, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->iX1O1:F

    sub-float/2addr v1, v4

    float-to-int v1, v1

    goto :goto_0

    :pswitch_3
    int-to-float v0, v0

    iget v4, p0, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->iX1O1:F

    sub-float/2addr v0, v4

    float-to-int v0, v0

    :goto_0
    iget v4, p0, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->iIXi1iiXI:F

    const/4 v5, 0x0

    cmpl-float v5, v4, v5

    if-lez v5, :cond_0

    int-to-float v0, v0

    sub-float/2addr v0, v4

    float-to-int v0, v0

    int-to-float v1, v1

    sub-float/2addr v1, v4

    float-to-int v1, v1

    int-to-float v2, v2

    sub-float/2addr v2, v4

    float-to-int v2, v2

    int-to-float v3, v3

    sub-float/2addr v3, v4

    float-to-int v3, v3

    :cond_0
    invoke-virtual {p0, v0, v2, v1, v3}, Landroid/view/View;->setPadding(IIII)V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public XOO0ii0(F)Lcom/sma/smartv3/view/bubbleview/BubbleLayout;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "arrowPosition"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->XO0O10()V

    iput p1, p0, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->X1IX:F

    invoke-virtual {p0}, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->iO()V

    return-object p0
.end method

.method public dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "canvas"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->I1:Lcom/android/mltcode/paycertificationapi/i11iO0O0;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i11iO0O0;->draw(Landroid/graphics/Canvas;)V

    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->dispatchDraw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public getArrowDirection()Lcom/sma/smartv3/view/bubbleview/ArrowDirection;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->IO:Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

    return-object v0
.end method

.method public getArrowHeight()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->XXX11i:F

    return v0
.end method

.method public getArrowPosition()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->X1IX:F

    return v0
.end method

.method public getArrowWidth()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->iX1O1:F

    return v0
.end method

.method public getBubbleColor()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->X0i1O:I

    return v0
.end method

.method public getCornersRadius()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->X11iII1O1:F

    return v0
.end method

.method public getStrokeColor()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->iXiX011:I

    return v0
.end method

.method public getStrokeWidth()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->iIXi1iiXI:F

    return v0
.end method

.method public final iO()V
    .locals 6

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    sget-object v4, Lcom/sma/smartv3/view/bubbleview/BubbleLayout$OXO1;->OXO1:[I

    iget-object v5, p0, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->IO:Lcom/sma/smartv3/view/bubbleview/ArrowDirection;

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v4, v4, v5

    packed-switch v4, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    int-to-float v3, v3

    iget v4, p0, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->XXX11i:F

    add-float/2addr v3, v4

    float-to-int v3, v3

    goto :goto_0

    :pswitch_1
    int-to-float v2, v2

    iget v4, p0, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->XXX11i:F

    add-float/2addr v2, v4

    float-to-int v2, v2

    goto :goto_0

    :pswitch_2
    int-to-float v1, v1

    iget v4, p0, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->iX1O1:F

    add-float/2addr v1, v4

    float-to-int v1, v1

    goto :goto_0

    :pswitch_3
    int-to-float v0, v0

    iget v4, p0, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->iX1O1:F

    add-float/2addr v0, v4

    float-to-int v0, v0

    :goto_0
    iget v4, p0, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->iIXi1iiXI:F

    const/4 v5, 0x0

    cmpl-float v5, v4, v5

    if-lez v5, :cond_0

    int-to-float v0, v0

    add-float/2addr v0, v4

    float-to-int v0, v0

    int-to-float v1, v1

    add-float/2addr v1, v4

    float-to-int v1, v1

    int-to-float v2, v2

    add-float/2addr v2, v4

    float-to-int v2, v2

    int-to-float v3, v3

    add-float/2addr v3, v4

    float-to-int v3, v3

    :cond_0
    invoke-virtual {p0, v0, v2, v1, v3}, Landroid/view/View;->setPadding(IIII)V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onLayout(ZIIII)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "changed",
            "left",
            "top",
            "right",
            "bottom"
        }
    .end annotation

    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    move-object p1, p0

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p3

    const/4 p4, 0x0

    invoke-virtual {p0, p4, p2, p4, p3}, Lcom/sma/smartv3/view/bubbleview/BubbleLayout;->XIi00iiXO(IIII)V

    return-void
.end method
