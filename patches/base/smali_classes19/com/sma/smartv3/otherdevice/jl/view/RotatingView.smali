.class public Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/otherdevice/jl/view/RotatingView$XIi00iiXO;,
        Lcom/sma/smartv3/otherdevice/jl/view/RotatingView$OXO1;
    }
.end annotation


# instance fields
.field public I1:I

.field public IO:I

.field public IO0II0i:Z

.field public IXOIIIO:F

.field public Ii0X0X:I

.field public Ii0i:Z

.field public Ii1iii0:Landroid/graphics/Bitmap;

.field public O001I:I

.field public OO:I

.field public OX110i:Lcom/sma/smartv3/otherdevice/jl/view/RotatingView$OXO1;

.field public X00XIX1:F

.field public X00Xi1X:Landroid/graphics/SweepGradient;

.field public X0i1O:Landroid/graphics/Paint;

.field public X1:I

.field public X100O:Landroid/graphics/PaintFlagsDrawFilter;

.field public X11I:Landroid/graphics/Bitmap;

.field public X11iII1O1:Landroid/graphics/Paint;

.field public X1IX:Landroid/graphics/Paint;

.field public XO0X10iO:I

.field public XOX0O0:I

.field public XX1Oi:Lcom/sma/smartv3/otherdevice/jl/view/RotatingView$XIi00iiXO;

.field public XXO:I

.field public XXX11i:Landroid/graphics/Paint;

.field public XXiIiX10:I

.field public i0X000X0O:F

.field public i11I:I

.field public iIXi1iiXI:I

.field public iOiXi11II:I

.field public iX1O1:I

.field public iXiX011:I

.field public iXiiiO:Landroid/graphics/Bitmap;

.field public iiiO:Landroid/graphics/Bitmap;


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

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

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
    invoke-direct {p0, p1, p2, v0}, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
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
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/16 p1, -0xc

    .line 4
    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->iIXi1iiXI:I

    const/16 p3, 0xc

    .line 5
    iput p3, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->iXiX011:I

    .line 6
    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->O001I:I

    const/4 p1, 0x1

    .line 7
    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->XXO:I

    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p3, 0x7f08105e    # 1.8086E38f

    invoke-static {p1, p3}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->iXiiiO:Landroid/graphics/Bitmap;

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p3, 0x7f08105b

    invoke-static {p1, p3}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->Ii1iii0:Landroid/graphics/Bitmap;

    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p3, 0x7f08105d

    invoke-static {p1, p3}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->iiiO:Landroid/graphics/Bitmap;

    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p3, 0x7f08105c

    invoke-static {p1, p3}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->X11I:Landroid/graphics/Bitmap;

    const p1, -0x7fa415

    .line 12
    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->OO:I

    const p1, 0x7f5e41eb

    .line 13
    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->XOX0O0:I

    const p1, -0xa8a8a9

    .line 14
    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->iOiXi11II:I

    const/high16 p1, 0x40a00000    # 5.0f

    .line 15
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->iO(F)I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->i11I:I

    const/high16 p1, 0x40400000    # 3.0f

    .line 16
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->iO(F)I

    move-result p3

    iput p3, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->XO0X10iO:I

    .line 17
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->iO(F)I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->Ii0X0X:I

    const/high16 p1, 0x41800000    # 16.0f

    .line 18
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->I0iXXO(F)I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->XXiIiX10:I

    const/16 p1, 0x82

    .line 19
    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->X1:I

    .line 20
    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->getMaxRotateAngle()I

    move-result p1

    int-to-float p1, p1

    const/high16 p3, 0x3f800000    # 1.0f

    mul-float/2addr p1, p3

    iget p3, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->iXiX011:I

    iget v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->iIXi1iiXI:I

    sub-int/2addr p3, v0

    int-to-float p3, p3

    div-float/2addr p1, p3

    iget p3, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->XXO:I

    int-to-float p3, p3

    div-float/2addr p1, p3

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->IXOIIIO:F

    .line 21
    invoke-virtual {p0, p2}, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->OIi0(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public static XXI(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
    .locals 7
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "bm",
            "newWidth",
            "newHeight"
        }
    .end annotation

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    int-to-float p1, p1

    int-to-float v0, v3

    div-float/2addr p1, v0

    int-to-float p2, p2

    int-to-float v0, v4

    div-float/2addr p2, v0

    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    invoke-virtual {v5, p1, p2}, Landroid/graphics/Matrix;->postScale(FF)Z

    const/4 v2, 0x0

    const/4 v6, 0x1

    const/4 v1, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method private getMaxRotateAngle()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->X1:I

    add-int/lit8 v0, v0, -0x5a

    mul-int/lit8 v0, v0, 0x2

    rsub-int v0, v0, 0x168

    return v0
.end method


# virtual methods
.method public final I0IIOi(Landroid/graphics/Canvas;)V
    .locals 6
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "canvas"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->O001I:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    iget-object v3, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->X11iII1O1:Landroid/graphics/Paint;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    const/4 v5, 0x0

    invoke-virtual {v3, v0, v5, v4, v2}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    add-int/2addr v3, v2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget v4, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->O001I:I

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    int-to-float v0, v0

    int-to-float v2, v3

    iget-object v3, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->X11iII1O1:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v0, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    return-void
.end method

.method public final I0iXXO(F)I
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "sp"
        }
    .end annotation

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v1, p1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p1

    float-to-int p1, p1

    return p1
.end method

.method public final IO(I)I
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "widthMeasureSpec"
        }
    .end annotation

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    return p1
.end method

.method public final IiI10X(Landroid/graphics/Canvas;)V
    .locals 5
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "canvas"
        }
    .end annotation

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    iget v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->X00XIX1:F

    iget v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->X1:I

    int-to-float v1, v1

    add-float/2addr v0, v1

    const/high16 v1, 0x43340000    # 180.0f

    sub-float/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v3, v2

    invoke-virtual {p1, v0, v1, v3}, Landroid/graphics/Canvas;->rotate(FFF)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->Ii1iii0:Landroid/graphics/Bitmap;

    iget v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->IO:I

    int-to-float v1, v1

    div-float/2addr v1, v2

    iget v3, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->iX1O1:I

    int-to-float v3, v3

    sub-float/2addr v1, v3

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v3, v2

    sub-float/2addr v1, v3

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v3, v2

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v4, v2

    sub-float/2addr v3, v4

    iget-object v2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->X100O:Landroid/graphics/PaintFlagsDrawFilter;

    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    iget-object v2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->X1IX:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v3, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method public final O00(Landroid/graphics/Canvas;)V
    .locals 6
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "canvas"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->X0i1O:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3ff3333333333333L    # 1.2

    mul-double/2addr v0, v2

    double-to-int v0, v0

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->iXiiiO:Landroid/graphics/Bitmap;

    iget v2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->iX1O1:I

    mul-int/lit8 v3, v2, 0x2

    sub-int/2addr v3, v0

    mul-int/lit8 v2, v2, 0x2

    sub-int/2addr v2, v0

    invoke-static {v1, v3, v2}, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->XXI(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    new-instance v3, Landroid/graphics/Matrix;

    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    iget v4, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->IO:I

    sub-int/2addr v4, v1

    int-to-float v1, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v1, v4

    iget v5, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->I1:I

    sub-int/2addr v5, v2

    int-to-float v2, v5

    div-float/2addr v2, v4

    invoke-virtual {v3, v1, v2}, Landroid/graphics/Matrix;->setTranslate(FF)V

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->X100O:Landroid/graphics/PaintFlagsDrawFilter;

    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->X1IX:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v3, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    return-void
.end method

.method public OIX0iXi(III)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "min",
            "max",
            "value"
        }
    .end annotation

    iget v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->iIXi1iiXI:I

    if-ne p1, v0, :cond_0

    iget v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->iXiX011:I

    if-ne v0, p2, :cond_0

    iget v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->O001I:I

    if-ne v0, p3, :cond_0

    return-void

    :cond_0
    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->iIXi1iiXI:I

    iput p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->iXiX011:I

    invoke-static {p1, p3}, Ljava/lang/Math;->max(II)I

    move-result p3

    iput p3, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->O001I:I

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->getMaxRotateAngle()I

    move-result v0

    int-to-float v0, v0

    sub-int/2addr p2, p1

    int-to-float p2, p2

    div-float/2addr v0, p2

    iget p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->XXO:I

    int-to-float v1, p2

    div-float/2addr v0, v1

    iput v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->IXOIIIO:F

    sub-int/2addr p3, p1

    mul-int/2addr p3, p2

    int-to-float p1, p3

    mul-float/2addr p1, v0

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->X00XIX1:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final OIi0(Landroid/util/AttributeSet;)V
    .locals 7
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "attrs"
        }
    .end annotation

    const/4 v0, 0x4

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lcom/sma/smartv3/R$styleable;->RotatingView:[I

    invoke-virtual {v1, p1, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 v1, 0x0

    const/4 v2, 0x3

    const/4 v3, 0x1

    if-eqz p1, :cond_0

    iget v4, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->OO:I

    invoke-virtual {p1, v2, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v4

    iput v4, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->OO:I

    iget v4, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->XOX0O0:I

    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v4

    iput v4, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->XOX0O0:I

    iget v4, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->iOiXi11II:I

    invoke-virtual {p1, v0, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v4

    iput v4, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->iOiXi11II:I

    const/4 v4, 0x2

    iget v5, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->i11I:I

    invoke-virtual {p1, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->i11I:I

    iget v4, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->XO0X10iO:I

    invoke-virtual {p1, v1, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->XO0X10iO:I

    const/4 v4, 0x6

    iget v5, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->Ii0X0X:I

    invoke-virtual {p1, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->Ii0X0X:I

    const/4 v4, 0x7

    iget v5, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->XXiIiX10:I

    invoke-virtual {p1, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->XXiIiX10:I

    const/4 v4, 0x5

    const/4 v5, -0x1

    invoke-virtual {p1, v4, v5}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p1

    if-eq p1, v5, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-static {v4, p1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->Ii1iii0:Landroid/graphics/Bitmap;

    :cond_0
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->X11iII1O1:Landroid/graphics/Paint;

    invoke-virtual {p1, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->X11iII1O1:Landroid/graphics/Paint;

    iget v4, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->XXiIiX10:I

    int-to-float v4, v4

    invoke-virtual {p1, v4}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->X11iII1O1:Landroid/graphics/Paint;

    iget v4, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->iOiXi11II:I

    invoke-virtual {p1, v4}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->X11iII1O1:Landroid/graphics/Paint;

    sget-object v4, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {p1, v4}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->XXX11i:Landroid/graphics/Paint;

    invoke-virtual {p1, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->XXX11i:Landroid/graphics/Paint;

    const-string v4, "#3CB7EA"

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {p1, v4}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->XXX11i:Landroid/graphics/Paint;

    iget v4, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->XO0X10iO:I

    int-to-float v4, v4

    invoke-virtual {p1, v4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->XXX11i:Landroid/graphics/Paint;

    sget-object v4, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->XXX11i:Landroid/graphics/Paint;

    sget-object v5, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {p1, v5}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->XXX11i:Landroid/graphics/Paint;

    const v6, -0x1e1e1f

    invoke-virtual {p1, v6}, Landroid/graphics/Paint;->setColor(I)V

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->X1IX:Landroid/graphics/Paint;

    new-instance p1, Landroid/graphics/PaintFlagsDrawFilter;

    invoke-direct {p1, v1, v2}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->X100O:Landroid/graphics/PaintFlagsDrawFilter;

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->X0i1O:Landroid/graphics/Paint;

    invoke-virtual {p1, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->X0i1O:Landroid/graphics/Paint;

    iget v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->i11I:I

    int-to-float v1, v1

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->X0i1O:Landroid/graphics/Paint;

    invoke-virtual {p1, v4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->X0i1O:Landroid/graphics/Paint;

    invoke-virtual {p1, v5}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    iget p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->OO:I

    iget v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->XOX0O0:I

    filled-new-array {p1, p1, v1, p1}, [I

    move-result-object p1

    const/4 v1, 0x0

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    new-instance v2, Landroid/graphics/SweepGradient;

    invoke-direct {v2, v1, v1, p1, v0}, Landroid/graphics/SweepGradient;-><init>(FF[I[F)V

    iput-object v2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->X00Xi1X:Landroid/graphics/SweepGradient;

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->X0i1O:Landroid/graphics/Paint;

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3d4ccccd    # 0.05f
        0x3f4ccccd    # 0.8f
        0x3f7d70a4    # 0.99f
    .end array-data
.end method

.method public final OXO1(F)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "angle"
        }
    .end annotation

    iget v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->X00XIX1:F

    add-float/2addr v0, p1

    iput v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->X00XIX1:F

    const/4 p1, 0x0

    cmpg-float v1, v0, p1

    if-gez v1, :cond_0

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->X00XIX1:F

    goto :goto_0

    :cond_0
    iget p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->X1:I

    add-int/lit8 v1, p1, -0x5a

    mul-int/lit8 v1, v1, 0x2

    rsub-int v1, v1, 0x168

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    add-int/lit8 p1, p1, -0x5a

    mul-int/lit8 p1, p1, 0x2

    rsub-int p1, p1, 0x168

    int-to-float p1, p1

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->X00XIX1:F

    :cond_1
    :goto_0
    iget p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->X00XIX1:F

    iget v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->IXOIIIO:F

    div-float/2addr p1, v0

    iget v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->XXO:I

    int-to-float v0, v0

    div-float/2addr p1, v0

    float-to-double v0, p1

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    double-to-int p1, v0

    iget v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->iIXi1iiXI:I

    add-int/2addr p1, v0

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->O001I:I

    return-void
.end method

.method public final XIi00iiXO(FF)F
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "targetX",
            "targetY"
        }
    .end annotation

    iget v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->IO:I

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    sub-float/2addr p1, v0

    iget v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->I1:I

    int-to-float v0, v0

    div-float/2addr v0, v1

    sub-float/2addr p2, v0

    const/4 v0, 0x0

    cmpl-float v1, p1, v0

    const-wide v2, 0x400921fb54442d18L    # Math.PI

    if-eqz v1, :cond_3

    div-float p1, p2, p1

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    if-lez v1, :cond_1

    cmpl-float p2, p2, v0

    if-ltz p2, :cond_0

    float-to-double p1, p1

    invoke-static {p1, p2}, Ljava/lang/Math;->atan(D)D

    move-result-wide p1

    goto :goto_0

    :cond_0
    float-to-double p1, p1

    invoke-static {p1, p2}, Ljava/lang/Math;->atan(D)D

    move-result-wide p1

    const-wide v0, 0x401921fb54442d18L    # 6.283185307179586

    sub-double p1, v0, p1

    goto :goto_0

    :cond_1
    cmpl-float p2, p2, v0

    if-ltz p2, :cond_2

    float-to-double p1, p1

    invoke-static {p1, p2}, Ljava/lang/Math;->atan(D)D

    move-result-wide p1

    sub-double p1, v2, p1

    goto :goto_0

    :cond_2
    float-to-double p1, p1

    invoke-static {p1, p2}, Ljava/lang/Math;->atan(D)D

    move-result-wide p1

    add-double/2addr p1, v2

    goto :goto_0

    :cond_3
    cmpl-float p1, p2, v0

    if-lez p1, :cond_4

    const-wide p1, 0x3ff921fb54442d18L    # 1.5707963267948966

    goto :goto_0

    :cond_4
    const-wide p1, -0x4006de04abbbd2e8L    # -1.5707963267948966

    :goto_0
    const-wide v0, 0x4066800000000000L    # 180.0

    mul-double/2addr p1, v0

    div-double/2addr p1, v2

    double-to-float p1, p1

    return p1
.end method

.method public final XO0O10(Landroid/graphics/Canvas;)V
    .locals 7
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "canvas"
        }
    .end annotation

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v2, v1

    invoke-virtual {p1, v0, v2}, Landroid/graphics/Canvas;->translate(FF)V

    iget v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->X1:I

    int-to-float v0, v0

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->rotate(F)V

    new-instance v2, Landroid/graphics/RectF;

    iget v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->iX1O1:I

    neg-int v1, v0

    int-to-float v1, v1

    neg-int v3, v0

    int-to-float v3, v3

    int-to-float v4, v0

    int-to-float v0, v0

    invoke-direct {v2, v1, v3, v4, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->getMaxRotateAngle()I

    move-result v0

    int-to-float v4, v0

    const/4 v5, 0x0

    iget-object v6, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->XXX11i:Landroid/graphics/Paint;

    const/4 v3, 0x0

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    iget v4, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->X00XIX1:F

    iget-object v6, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->X0i1O:Landroid/graphics/Paint;

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method public final XOO0ii0(Landroid/graphics/Canvas;)V
    .locals 6
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "canvas"
        }
    .end annotation

    iget v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->iX1O1:I

    int-to-double v0, v0

    iget v2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->X1:I

    add-int/lit8 v2, v2, -0x5a

    int-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    mul-double/2addr v0, v2

    double-to-float v0, v0

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-float/2addr v1, v0

    iget-object v3, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->iiiO:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v3, v2

    sub-float/2addr v1, v3

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    iget-object v4, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->X11I:Landroid/graphics/Bitmap;

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    sub-int/2addr v3, v4

    int-to-float v3, v3

    iget-object v4, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->iiiO:Landroid/graphics/Bitmap;

    const/4 v5, 0x0

    invoke-virtual {p1, v4, v1, v3, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v1, v2

    add-float/2addr v1, v0

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->iiiO:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr v0, v2

    sub-float/2addr v1, v0

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->X11I:Landroid/graphics/Bitmap;

    invoke-virtual {p1, v0, v1, v3, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    return-void
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "event"
        }
    .end annotation

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public getValue()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->O001I:I

    return v0
.end method

.method public iO(F)I
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "dp"
        }
    .end annotation

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1, p1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p1

    float-to-int p1, p1

    return p1
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "canvas"
        }
    .end annotation

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->XO0O10(Landroid/graphics/Canvas;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->O00(Landroid/graphics/Canvas;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->IiI10X(Landroid/graphics/Canvas;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->XOO0ii0(Landroid/graphics/Canvas;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->I0IIOi(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public onMeasure(II)V
    .locals 0
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

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->IO(I)I

    move-result p1

    invoke-virtual {p0, p2}, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->IO(I)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

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

    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->I1:I

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->IO:I

    div-int/lit8 p1, p1, 0x2

    iget p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->Ii0X0X:I

    mul-int/lit8 p2, p2, 0x2

    sub-int/2addr p1, p2

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->iX1O1:I

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "event"
        }
    .end annotation

    invoke-virtual {p0}, Landroid/view/View;->isClickable()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->O001I:I

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    if-eqz v2, :cond_9

    const/4 v3, 0x0

    if-eq v2, v1, :cond_5

    const/4 v4, 0x2

    if-eq v2, v4, :cond_1

    const/4 p1, 0x3

    if-eq v2, p1, :cond_5

    goto/16 :goto_2

    :cond_1
    iput-boolean v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->Ii0i:Z

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    invoke-virtual {p0, v2, p1}, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->XIi00iiXO(FF)F

    move-result p1

    iget v2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->i0X000X0O:F

    sub-float v2, p1, v2

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->getMaxRotateAngle()I

    move-result v4

    neg-int v4, v4

    int-to-float v4, v4

    cmpg-float v4, v2, v4

    const/high16 v5, 0x43b40000    # 360.0f

    if-gez v4, :cond_2

    add-float/2addr v2, v5

    goto :goto_0

    :cond_2
    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->getMaxRotateAngle()I

    move-result v4

    int-to-float v4, v4

    cmpl-float v4, v2, v4

    if-lez v4, :cond_3

    sub-float/2addr v2, v5

    :cond_3
    :goto_0
    invoke-virtual {p0, v2}, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->OXO1(F)V

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->i0X000X0O:F

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->XX1Oi:Lcom/sma/smartv3/otherdevice/jl/view/RotatingView$XIi00iiXO;

    if-eqz p1, :cond_4

    iget-boolean v2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->IO0II0i:Z

    if-eqz v2, :cond_4

    iget v2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->O001I:I

    if-eq v2, v0, :cond_4

    invoke-interface {p1, p0, v2, v3}, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView$XIi00iiXO;->OXO1(Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;IZ)V

    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    goto :goto_2

    :cond_5
    invoke-virtual {p0, v3}, Landroid/view/View;->setPressed(Z)V

    iget-boolean p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->IO0II0i:Z

    if-eqz p1, :cond_a

    iget-boolean p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->Ii0i:Z

    if-eqz p1, :cond_7

    iget p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->O001I:I

    iget v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->iIXi1iiXI:I

    sub-int v0, p1, v0

    iget v2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->XXO:I

    mul-int/2addr v0, v2

    int-to-float v0, v0

    iget v2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->IXOIIIO:F

    mul-float/2addr v0, v2

    iput v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->X00XIX1:F

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->XX1Oi:Lcom/sma/smartv3/otherdevice/jl/view/RotatingView$XIi00iiXO;

    if-eqz v0, :cond_6

    invoke-interface {v0, p0, p1, v1}, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView$XIi00iiXO;->OXO1(Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;IZ)V

    :cond_6
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    iput-boolean v3, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->Ii0i:Z

    goto :goto_1

    :cond_7
    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->OX110i:Lcom/sma/smartv3/otherdevice/jl/view/RotatingView$OXO1;

    if-eqz p1, :cond_8

    iget v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->O001I:I

    invoke-interface {p1, v0}, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView$OXO1;->OXO1(I)V

    :cond_8
    :goto_1
    iput-boolean v3, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->IO0II0i:Z

    goto :goto_2

    :cond_9
    iput-boolean v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->IO0II0i:Z

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    invoke-virtual {p0, v0, p1}, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->XIi00iiXO(FF)F

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->i0X000X0O:F

    invoke-virtual {p0, v1}, Landroid/view/View;->setPressed(Z)V

    :cond_a
    :goto_2
    return v1
.end method

.method public setContentEndColor(I)V
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "colorResId"
        }
    .end annotation

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->XOX0O0:I

    iget v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->OO:I

    filled-new-array {v0, v0, p1, v0}, [I

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x4

    new-array v1, v1, [F

    fill-array-data v1, :array_0

    new-instance v2, Landroid/graphics/SweepGradient;

    invoke-direct {v2, v0, v0, p1, v1}, Landroid/graphics/SweepGradient;-><init>(FF[I[F)V

    iput-object v2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->X00Xi1X:Landroid/graphics/SweepGradient;

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->X0i1O:Landroid/graphics/Paint;

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3d4ccccd    # 0.05f
        0x3f4ccccd    # 0.8f
        0x3f7d70a4    # 0.99f
    .end array-data
.end method

.method public setContentStartColor(I)V
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "colorResId"
        }
    .end annotation

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->OO:I

    iget v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->XOX0O0:I

    filled-new-array {p1, p1, v0, p1}, [I

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x4

    new-array v1, v1, [F

    fill-array-data v1, :array_0

    new-instance v2, Landroid/graphics/SweepGradient;

    invoke-direct {v2, v0, v0, p1, v1}, Landroid/graphics/SweepGradient;-><init>(FF[I[F)V

    iput-object v2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->X00Xi1X:Landroid/graphics/SweepGradient;

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->X0i1O:Landroid/graphics/Paint;

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3d4ccccd    # 0.05f
        0x3f4ccccd    # 0.8f
        0x3f7d70a4    # 0.99f
    .end array-data
.end method

.method public setContentTextColor(I)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "colorResId"
        }
    .end annotation

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->iOiXi11II:I

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->X11iII1O1:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method public setIndicatorImage(I)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "imageResId"
        }
    .end annotation

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-static {v0, p1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->Ii1iii0:Landroid/graphics/Bitmap;

    return-void
.end method

.method public setOnClickListener(Lcom/sma/smartv3/otherdevice/jl/view/RotatingView$OXO1;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "onClickListener"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->OX110i:Lcom/sma/smartv3/otherdevice/jl/view/RotatingView$OXO1;

    return-void
.end method

.method public setOnValueChangeListener(Lcom/sma/smartv3/otherdevice/jl/view/RotatingView$XIi00iiXO;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "onValueChangeListener"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->XX1Oi:Lcom/sma/smartv3/otherdevice/jl/view/RotatingView$XIi00iiXO;

    return-void
.end method

.method public setValue(I)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "value"
        }
    .end annotation

    iget v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->iIXi1iiXI:I

    iget v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->iXiX011:I

    invoke-virtual {p0, v0, v1, p1}, Lcom/sma/smartv3/otherdevice/jl/view/RotatingView;->OIX0iXi(III)V

    return-void
.end method
