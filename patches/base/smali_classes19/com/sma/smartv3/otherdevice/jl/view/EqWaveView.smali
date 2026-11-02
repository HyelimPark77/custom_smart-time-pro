.class public Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field public I1:Landroid/graphics/Paint;

.field public IO:Landroid/text/TextPaint;

.field public Ii1iii0:I

.field public O001I:[F

.field public OX110i:[I

.field public X0i1O:[F

.field public X100O:I

.field public X11I:I

.field public X11iII1O1:Landroid/graphics/Paint;

.field public X1IX:Lcom/jieli/eq/EQPlotCore;

.field public XX1Oi:I

.field public XXO:Landroid/graphics/Path;

.field public XXX11i:I

.field public iIXi1iiXI:[I

.field public iX1O1:Landroid/graphics/Paint;

.field public iXiX011:Lcom/android/mltcode/paycertificationapi/OIXXII10O;

.field public iXiiiO:I

.field public iiiO:I


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

    .line 1
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const/16 p1, 0x7d0

    .line 2
    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->XXX11i:I

    const/16 p1, 0xa

    .line 3
    new-array p1, p1, [I

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->iIXi1iiXI:[I

    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->iXiX011:Lcom/android/mltcode/paycertificationapi/OIXXII10O;

    const v0, -0x7fa415

    .line 5
    iput v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->iXiiiO:I

    .line 6
    iput v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->Ii1iii0:I

    const v0, 0x7f5e41eb

    .line 7
    iput v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->iiiO:I

    const v0, 0xd4d4d4

    .line 8
    iput v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->X11I:I

    const v0, 0xbbbbbb

    .line 9
    iput v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->X100O:I

    .line 10
    iput v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->XX1Oi:I

    const/16 v0, 0x9

    .line 11
    new-array v0, v0, [I

    fill-array-data v0, :array_0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->OX110i:[I

    const/4 v0, 0x0

    .line 12
    invoke-virtual {p0, p1, v0}, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->iO(Landroid/util/AttributeSet;I)V

    return-void

    :array_0
    .array-data 4
        0x1f
        0x3f
        0x7d
        0xfa
        0x1f4
        0x3e8
        0x7d0
        0x1f40
        0x3e80
    .end array-data
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

    .line 13
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/16 p1, 0x7d0

    .line 14
    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->XXX11i:I

    const/16 p1, 0xa

    .line 15
    new-array p1, p1, [I

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->iIXi1iiXI:[I

    const/4 p1, 0x0

    .line 16
    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->iXiX011:Lcom/android/mltcode/paycertificationapi/OIXXII10O;

    const p1, -0x7fa415

    .line 17
    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->iXiiiO:I

    .line 18
    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->Ii1iii0:I

    const p1, 0x7f5e41eb

    .line 19
    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->iiiO:I

    const p1, 0xd4d4d4

    .line 20
    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->X11I:I

    const p1, 0xbbbbbb

    .line 21
    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->X100O:I

    .line 22
    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->XX1Oi:I

    const/16 p1, 0x9

    .line 23
    new-array p1, p1, [I

    fill-array-data p1, :array_0

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->OX110i:[I

    const/4 p1, 0x0

    .line 24
    invoke-virtual {p0, p2, p1}, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->iO(Landroid/util/AttributeSet;I)V

    return-void

    :array_0
    .array-data 4
        0x1f
        0x3f
        0x7d
        0xfa
        0x1f4
        0x3e8
        0x7d0
        0x1f40
        0x3e80
    .end array-data
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
            "defStyle"
        }
    .end annotation

    .line 25
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/16 p1, 0x7d0

    .line 26
    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->XXX11i:I

    const/16 p1, 0xa

    .line 27
    new-array p1, p1, [I

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->iIXi1iiXI:[I

    const/4 p1, 0x0

    .line 28
    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->iXiX011:Lcom/android/mltcode/paycertificationapi/OIXXII10O;

    const p1, -0x7fa415

    .line 29
    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->iXiiiO:I

    .line 30
    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->Ii1iii0:I

    const p1, 0x7f5e41eb

    .line 31
    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->iiiO:I

    const p1, 0xd4d4d4

    .line 32
    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->X11I:I

    const p1, 0xbbbbbb

    .line 33
    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->X100O:I

    .line 34
    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->XX1Oi:I

    const/16 p1, 0x9

    .line 35
    new-array p1, p1, [I

    fill-array-data p1, :array_0

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->OX110i:[I

    .line 36
    invoke-virtual {p0, p2, p3}, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->iO(Landroid/util/AttributeSet;I)V

    return-void

    nop

    :array_0
    .array-data 4
        0x1f
        0x3f
        0x7d
        0xfa
        0x1f4
        0x3e8
        0x7d0
        0x1f40
        0x3e80
    .end array-data
.end method


# virtual methods
.method public IiI10X(II)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "index",
            "value"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->iIXi1iiXI:[I

    aput p2, v0, p1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->X1IX:Lcom/jieli/eq/EQPlotCore;

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->OX110i:[I

    aget v1, v1, p1

    int-to-float v1, v1

    int-to-float p2, p2

    invoke-virtual {v0, p1, v1, p2}, Lcom/jieli/eq/EQPlotCore;->updatePara(IFF)V

    iget-object p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->O001I:[F

    if-nez p2, :cond_0

    iget p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->XXX11i:I

    add-int/lit8 p2, p2, -0x2

    mul-int/lit8 p2, p2, 0x4

    add-int/lit8 p2, p2, 0x4

    new-array p2, p2, [F

    iput-object p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->O001I:[F

    :cond_0
    iget-object p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->X1IX:Lcom/jieli/eq/EQPlotCore;

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->O001I:[F

    invoke-virtual {p2, v0, p1}, Lcom/jieli/eq/EQPlotCore;->getEQPlotData([FI)F

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->iXiX011:Lcom/android/mltcode/paycertificationapi/OIXXII10O;

    iget-object p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->O001I:[F

    invoke-virtual {p1, p2}, Lcom/android/mltcode/paycertificationapi/OIXXII10O;->XIi00iiXO([F)[F

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->X0i1O:[F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final O00(F)I
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

.method public final OXO1(F)I
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

.method public final XIi00iiXO(Landroid/graphics/Canvas;)V
    .locals 9
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "canvas"
        }
    .end annotation

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->OX110i:[I

    array-length v2, v1

    if-ge v0, v2, :cond_0

    iget-object v2, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->iXiX011:Lcom/android/mltcode/paycertificationapi/OIXXII10O;

    aget v1, v1, v0

    int-to-float v1, v1

    invoke-virtual {v2, v1}, Lcom/android/mltcode/paycertificationapi/OIXXII10O;->iO(F)F

    move-result v4

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v7, v1

    iget-object v8, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->X11iII1O1:Landroid/graphics/Paint;

    const/4 v5, 0x0

    move v6, v4

    move-object v3, p1

    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->iIXi1iiXI:[I

    aget v1, v1, v0

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ""

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/high16 v1, 0x40000000    # 2.0f

    invoke-virtual {p0, v1}, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->O00(F)I

    move-result v1

    int-to-float v1, v1

    add-float/2addr v4, v1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    add-int/lit8 v1, v1, -0x2

    int-to-float v1, v1

    iget-object v2, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->IO:Landroid/text/TextPaint;

    invoke-virtual {v3, p1, v4, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    add-int/lit8 v0, v0, 0x1

    move-object p1, v3

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final XO0O10()V
    .locals 4

    new-instance v0, Lcom/jieli/eq/EQPlotCore;

    iget v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->XXX11i:I

    iget-object v2, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->OX110i:[I

    array-length v3, v2

    invoke-direct {v0, v1, v3, v2}, Lcom/jieli/eq/EQPlotCore;-><init>(II[I)V

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->X1IX:Lcom/jieli/eq/EQPlotCore;

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->O001I:[F

    if-nez v0, :cond_0

    iget v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->XXX11i:I

    add-int/lit8 v0, v0, -0x2

    mul-int/lit8 v0, v0, 0x4

    add-int/lit8 v0, v0, 0x4

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->O001I:[F

    :cond_0
    return-void
.end method

.method public final iO(Landroid/util/AttributeSet;I)V
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "attrs",
            "defStyle"
        }
    .end annotation

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    sget-object v0, Lcom/sma/smartv3/R$styleable;->EqWaveView:[I

    invoke-virtual {p2, p1, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 p2, 0x1

    if-eqz p1, :cond_0

    const/4 v0, 0x4

    iget v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->iXiiiO:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->iXiiiO:I

    const/4 v0, 0x5

    iget v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->X11I:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->X11I:I

    const/4 v0, 0x2

    iget v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->Ii1iii0:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->Ii1iii0:I

    const/4 v0, 0x3

    iget v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->X100O:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->X100O:I

    const/4 v0, 0x0

    iget v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->iiiO:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->iiiO:I

    iget v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->XX1Oi:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->XX1Oi:I

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->XXX11i:I

    new-instance p1, Landroid/text/TextPaint;

    invoke-direct {p1}, Landroid/text/TextPaint;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->IO:Landroid/text/TextPaint;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setFlags(I)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->IO:Landroid/text/TextPaint;

    sget-object v0, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->IO:Landroid/text/TextPaint;

    const/high16 v0, 0x41000000    # 8.0f

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->O00(F)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->IO:Landroid/text/TextPaint;

    const/4 v0, -0x1

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->I1:Landroid/graphics/Paint;

    iget v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->Ii1iii0:I

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->I1:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->I1:Landroid/graphics/Paint;

    const/high16 v2, 0x40a00000    # 5.0f

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->iX1O1:Landroid/graphics/Paint;

    iget v2, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->iXiiiO:I

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->iX1O1:Landroid/graphics/Paint;

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->iX1O1:Landroid/graphics/Paint;

    const/high16 v2, 0x3fc00000    # 1.5f

    invoke-virtual {p0, v2}, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->OXO1(F)I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->iX1O1:Landroid/graphics/Paint;

    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->IO:Landroid/text/TextPaint;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setFlags(I)V

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->X11iII1O1:Landroid/graphics/Paint;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->X11iII1O1:Landroid/graphics/Paint;

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->X11iII1O1:Landroid/graphics/Paint;

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->XXO:Landroid/graphics/Path;

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->XO0O10()V

    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 8
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "canvas"
        }
    .end annotation

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    new-instance v0, Landroid/graphics/LinearGradient;

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    move-result v1

    int-to-float v2, v1

    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v1

    if-eqz v1, :cond_0

    iget v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->iiiO:I

    :goto_0
    move v5, v1

    goto :goto_1

    :cond_0
    iget v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->XX1Oi:I

    goto :goto_0

    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->Ii1iii0:I

    :goto_2
    move v6, v1

    goto :goto_3

    :cond_1
    iget v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->X100O:I

    goto :goto_2

    :goto_3
    sget-object v7, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->I1:Landroid/graphics/Paint;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->iX1O1:Landroid/graphics/Paint;

    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v1

    if-nez v1, :cond_2

    iget v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->X11I:I

    goto :goto_4

    :cond_2
    iget v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->iXiiiO:I

    :goto_4
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->XXO:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->XXO:Landroid/graphics/Path;

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v1, v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/graphics/Path;->moveTo(FF)V

    const/4 v0, 0x0

    :goto_5
    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->X0i1O:[F

    array-length v3, v1

    if-ge v0, v3, :cond_3

    iget-object v3, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->XXO:Landroid/graphics/Path;

    aget v4, v1, v0

    add-int/lit8 v5, v0, 0x1

    aget v1, v1, v5

    invoke-virtual {v3, v4, v1}, Landroid/graphics/Path;->lineTo(FF)V

    add-int/lit8 v0, v0, 0x2

    goto :goto_5

    :cond_3
    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->XXO:Landroid/graphics/Path;

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    iget-object v3, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->X0i1O:[F

    array-length v4, v3

    add-int/lit8 v4, v4, -0x1

    aget v3, v3, v4

    invoke-virtual {v0, v1, v3}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->XXO:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->iX1O1:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->XXO:Landroid/graphics/Path;

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v0, v1, v3}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->XXO:Landroid/graphics/Path;

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v2, v1}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->XXO:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->I1:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->XXO:Landroid/graphics/Path;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->XIi00iiXO(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public onSizeChanged(IIII)V
    .locals 1
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

    new-instance p3, Lcom/android/mltcode/paycertificationapi/OIXXII10O;

    const/high16 p4, 0x40c00000    # 6.0f

    invoke-virtual {p0, p4}, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->O00(F)I

    move-result p4

    sub-int/2addr p2, p4

    invoke-direct {p3, p1, p2}, Lcom/android/mltcode/paycertificationapi/OIXXII10O;-><init>(II)V

    iput-object p3, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->iXiX011:Lcom/android/mltcode/paycertificationapi/OIXXII10O;

    const/high16 p1, 0x41a00000    # 20.0f

    invoke-static {p1}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {p3, p1}, Lcom/android/mltcode/paycertificationapi/OIXXII10O;->O00(F)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->iXiX011:Lcom/android/mltcode/paycertificationapi/OIXXII10O;

    iget-object p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->OX110i:[I

    const/4 p3, 0x0

    aget p4, p2, p3

    int-to-float p4, p4

    array-length v0, p2

    add-int/lit8 v0, v0, -0x1

    aget p2, p2, v0

    int-to-float p2, p2

    invoke-virtual {p1, p4, p2}, Lcom/android/mltcode/paycertificationapi/OIXXII10O;->IiI10X(FF)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->O001I:[F

    if-nez p1, :cond_0

    iget p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->XXX11i:I

    add-int/lit8 p1, p1, -0x2

    mul-int/lit8 p1, p1, 0x4

    add-int/lit8 p1, p1, 0x4

    new-array p1, p1, [F

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->O001I:[F

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->X1IX:Lcom/jieli/eq/EQPlotCore;

    iget-object p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->O001I:[F

    invoke-virtual {p1, p2, p3}, Lcom/jieli/eq/EQPlotCore;->getEQPlotData([FI)F

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->iIXi1iiXI:[I

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->setData([I)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->iXiX011:Lcom/android/mltcode/paycertificationapi/OIXXII10O;

    iget-object p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->O001I:[F

    invoke-virtual {p1, p2}, Lcom/android/mltcode/paycertificationapi/OIXXII10O;->XIi00iiXO([F)[F

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->X0i1O:[F

    return-void
.end method

.method public setData([I)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "value"
        }
    .end annotation

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->OX110i:[I

    array-length v2, v1

    if-ge v0, v2, :cond_0

    array-length v2, p1

    if-ge v0, v2, :cond_0

    iget-object v2, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->X1IX:Lcom/jieli/eq/EQPlotCore;

    aget v1, v1, v0

    int-to-float v1, v1

    aget v3, p1, v0

    int-to-float v3, v3

    invoke-virtual {v2, v0, v1, v3}, Lcom/jieli/eq/EQPlotCore;->updatePara(IFF)V

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->iIXi1iiXI:[I

    aget v2, p1, v0

    aput v2, v1, v0

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->X1IX:Lcom/jieli/eq/EQPlotCore;

    iget-object v2, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->O001I:[F

    invoke-virtual {v1, v2, v0}, Lcom/jieli/eq/EQPlotCore;->getEQPlotData([FI)F

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->iXiX011:Lcom/android/mltcode/paycertificationapi/OIXXII10O;

    if-nez p1, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->O001I:[F

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/OIXXII10O;->XIi00iiXO([F)[F

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->X0i1O:[F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setEnabled(Z)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "enable"
        }
    .end annotation

    invoke-super {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setFreqs([I)V
    .locals 6
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "freqs"
        }
    .end annotation

    array-length v0, p1

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->OX110i:[I

    array-length v1, v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_2

    move v0, v2

    move v1, v3

    :goto_0
    array-length v4, p1

    if-ge v0, v4, :cond_1

    aget v4, p1, v0

    iget-object v5, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->OX110i:[I

    aget v5, v5, v0

    if-eq v4, v5, :cond_0

    move v1, v2

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    if-eqz v1, :cond_2

    return-void

    :cond_2
    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->OX110i:[I

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->iXiX011:Lcom/android/mltcode/paycertificationapi/OIXXII10O;

    if-eqz p1, :cond_3

    const/high16 v0, 0x41a00000    # 20.0f

    invoke-static {v0}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/OIXXII10O;->O00(F)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->iXiX011:Lcom/android/mltcode/paycertificationapi/OIXXII10O;

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->OX110i:[I

    aget v1, v0, v2

    int-to-float v1, v1

    array-length v2, v0

    sub-int/2addr v2, v3

    aget v0, v0, v2

    int-to-float v0, v0

    invoke-virtual {p1, v1, v0}, Lcom/android/mltcode/paycertificationapi/OIXXII10O;->IiI10X(FF)V

    :cond_3
    new-instance p1, Lcom/jieli/eq/EQPlotCore;

    iget v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->XXX11i:I

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->OX110i:[I

    array-length v2, v1

    invoke-direct {p1, v0, v2, v1}, Lcom/jieli/eq/EQPlotCore;-><init>(II[I)V

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->X1IX:Lcom/jieli/eq/EQPlotCore;

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->O001I:[F

    if-nez p1, :cond_4

    iget p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->XXX11i:I

    add-int/lit8 p1, p1, -0x2

    mul-int/lit8 p1, p1, 0x4

    add-int/lit8 p1, p1, 0x4

    new-array p1, p1, [F

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->O001I:[F

    :cond_4
    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->iIXi1iiXI:[I

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/otherdevice/jl/view/EqWaveView;->setData([I)V

    return-void
.end method
