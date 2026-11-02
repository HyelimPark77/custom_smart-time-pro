.class public Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView$OXO1;,
        Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView$XIi00iiXO;
    }
.end annotation


# instance fields
.field public I1:Landroid/text/TextPaint;

.field public IO:Landroid/text/TextPaint;

.field public Ii1iii0:Landroid/graphics/Bitmap;

.field public O001I:Z

.field public X0i1O:Landroid/graphics/PointF;

.field public X100O:I

.field public X11I:I

.field public X11iII1O1:Landroid/graphics/Paint;

.field public X1IX:I

.field public XX1Oi:I

.field public XXO:Landroid/graphics/Bitmap;

.field public XXX11i:Ljava/lang/String;

.field public iIXi1iiXI:Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView$XIi00iiXO;

.field public iX1O1:Landroid/graphics/Paint;

.field public iXiX011:Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView$OXO1;

.field public iXiiiO:Landroid/graphics/Bitmap;

.field public iiiO:Z


# direct methods
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

    .line 1
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 2
    const-string p1, "125"

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->XXX11i:Ljava/lang/String;

    const/4 p1, 0x0

    .line 3
    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->X1IX:I

    .line 4
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->X0i1O:Landroid/graphics/PointF;

    .line 5
    iput-boolean p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->O001I:Z

    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f08100a

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->XXO:Landroid/graphics/Bitmap;

    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f08100b

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->iXiiiO:Landroid/graphics/Bitmap;

    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f081011

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->Ii1iii0:Landroid/graphics/Bitmap;

    .line 9
    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->X11I:I

    const/4 v0, -0x8

    .line 10
    iput v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->X100O:I

    const/16 v0, 0x8

    .line 11
    iput v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->XX1Oi:I

    const/4 v0, 0x0

    .line 12
    invoke-virtual {p0, v0, p1}, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->XO0O10(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2
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

    .line 14
    const-string p1, "125"

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->XXX11i:Ljava/lang/String;

    const/4 p1, 0x0

    .line 15
    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->X1IX:I

    .line 16
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->X0i1O:Landroid/graphics/PointF;

    .line 17
    iput-boolean p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->O001I:Z

    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f08100a

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->XXO:Landroid/graphics/Bitmap;

    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f08100b

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->iXiiiO:Landroid/graphics/Bitmap;

    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f081011

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->Ii1iii0:Landroid/graphics/Bitmap;

    .line 21
    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->X11I:I

    const/4 v0, -0x8

    .line 22
    iput v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->X100O:I

    const/16 v0, 0x8

    .line 23
    iput v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->XX1Oi:I

    .line 24
    invoke-virtual {p0, p2, p1}, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->XO0O10(Landroid/util/AttributeSet;I)V

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
            "defStyle"
        }
    .end annotation

    .line 25
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 26
    const-string p1, "125"

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->XXX11i:Ljava/lang/String;

    const/4 p1, 0x0

    .line 27
    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->X1IX:I

    .line 28
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->X0i1O:Landroid/graphics/PointF;

    .line 29
    iput-boolean p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->O001I:Z

    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f08100a

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->XXO:Landroid/graphics/Bitmap;

    .line 31
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f08100b

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->iXiiiO:Landroid/graphics/Bitmap;

    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f081011

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->Ii1iii0:Landroid/graphics/Bitmap;

    .line 33
    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->X11I:I

    const/4 p1, -0x8

    .line 34
    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->X100O:I

    const/16 p1, 0x8

    .line 35
    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->XX1Oi:I

    .line 36
    invoke-virtual {p0, p2, p3}, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->XO0O10(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private getProgressEndY()F
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->getProgressStartY()F

    move-result v0

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->getProgressHeight()F

    move-result v1

    add-float/2addr v0, v1

    return v0
.end method

.method private getProgressHeight()F
    .locals 3

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->XXO:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    int-to-float v1, v1

    const v2, 0x3f8ccccd    # 1.1f

    div-float/2addr v1, v2

    sub-float/2addr v0, v1

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->getProgressStartY()F

    move-result v1

    sub-float/2addr v0, v1

    return v0
.end method

.method private getProgressStartY()F
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->XXO:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    int-to-float v0, v0

    const v1, 0x3f933333    # 1.15f

    mul-float/2addr v0, v1

    return v0
.end method


# virtual methods
.method public final I0IIOi(F)I
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

.method public IiI10X()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->O001I:Z

    return v0
.end method

.method public final O00()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->iiiO:Z

    return v0
.end method

.method public final OXO1(F)I
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "y"
        }
    .end annotation

    iget v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->XX1Oi:I

    int-to-float v0, v0

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->getProgressStartY()F

    move-result v1

    sub-float/2addr p1, v1

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->getProgressHeight()F

    move-result v1

    div-float/2addr p1, v1

    iget v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->XX1Oi:I

    iget v2, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->X100O:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    mul-float/2addr p1, v1

    sub-float/2addr v0, p1

    float-to-int p1, v0

    return p1
.end method

.method public final XIi00iiXO(F)I
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

.method public final XO0O10(Landroid/util/AttributeSet;I)V
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

    new-instance p1, Landroid/text/TextPaint;

    invoke-direct {p1}, Landroid/text/TextPaint;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->IO:Landroid/text/TextPaint;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setFlags(I)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->IO:Landroid/text/TextPaint;

    sget-object v0, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->IO:Landroid/text/TextPaint;

    const/high16 v1, 0x41400000    # 12.0f

    invoke-virtual {p0, v1}, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->I0IIOi(F)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->IO:Landroid/text/TextPaint;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f060209

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setColor(I)V

    new-instance p1, Landroid/text/TextPaint;

    invoke-direct {p1}, Landroid/text/TextPaint;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->I1:Landroid/text/TextPaint;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setFlags(I)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->I1:Landroid/text/TextPaint;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->I1:Landroid/text/TextPaint;

    const/high16 v0, 0x41600000    # 14.0f

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->I0IIOi(F)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->I1:Landroid/text/TextPaint;

    const/4 v0, -0x1

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->iX1O1:Landroid/graphics/Paint;

    sget-object v0, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->iX1O1:Landroid/graphics/Paint;

    const/high16 v1, 0x40400000    # 3.0f

    invoke-virtual {p0, v1}, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->XIi00iiXO(F)I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    invoke-virtual {p0, p2}, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->setEnable(Z)V

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->X11iII1O1:Landroid/graphics/Paint;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->X11iII1O1:Landroid/graphics/Paint;

    invoke-virtual {p0, v1}, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->XIi00iiXO(F)I

    move-result p2

    int-to-float p2, p2

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->X11iII1O1:Landroid/graphics/Paint;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const v0, 0x7f060212

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method public final XOO0ii0(FF)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "x",
            "y"
        }
    .end annotation

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->X0i1O:Landroid/graphics/PointF;

    iget p1, p1, Landroid/graphics/PointF;->y:F

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->XXO:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    add-float v1, p1, v0

    cmpg-float v1, p2, v1

    if-gez v1, :cond_0

    sub-float/2addr p1, v0

    cmpl-float p1, p2, p1

    if-lez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
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

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->XOO0ii0(FF)Z

    move-result v0

    iput-boolean v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->iiiO:Z

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->O00()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    invoke-super {p0, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    return v0
.end method

.method public final iO(F)F
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "y"
        }
    .end annotation

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->getProgressStartY()F

    move-result v0

    cmpg-float v0, p1, v0

    if-gez v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->getProgressStartY()F

    move-result p1

    return p1

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->getProgressEndY()F

    move-result v0

    cmpl-float v0, p1, v0

    if-lez v0, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->getProgressEndY()F

    move-result p1

    :cond_1
    return p1
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 14
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "canvas"
        }
    .end annotation

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->X0i1O:Landroid/graphics/PointF;

    iget v3, v0, Landroid/graphics/PointF;->y:F

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const/high16 v7, 0x40000000    # 2.0f

    div-float v2, v0, v7

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->O00()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->iXiiiO:Landroid/graphics/Bitmap;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->XXO:Landroid/graphics/Bitmap;

    :goto_0
    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->getProgressStartY()F

    move-result v10

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->getProgressEndY()F

    move-result v12

    iget-object v13, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->X11iII1O1:Landroid/graphics/Paint;

    move v11, v2

    move-object v8, p1

    move v9, v2

    invoke-virtual/range {v8 .. v13}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    move-object v1, v8

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->getProgressEndY()F

    move-result p1

    cmpl-float p1, v3, p1

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->getProgressEndY()F

    move-result v5

    iget-object v6, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->iX1O1:Landroid/graphics/Paint;

    move v4, v2

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    :cond_1
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p1

    int-to-float p1, p1

    div-float/2addr p1, v7

    sub-float/2addr v3, p1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    sub-int/2addr p1, v4

    int-to-float p1, p1

    div-float/2addr p1, v7

    const/4 v4, 0x0

    invoke-virtual {v1, v0, p1, v3, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->XXX11i:Ljava/lang/String;

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v5

    invoke-virtual {p0, v7}, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->I0IIOi(F)I

    move-result v6

    sub-int/2addr v5, v6

    int-to-float v5, v5

    iget-object v6, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->IO:Landroid/text/TextPaint;

    invoke-virtual {v1, p1, v2, v5, v6}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->O00()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    iget-object v2, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->Ii1iii0:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    sub-int/2addr p1, v2

    int-to-float p1, p1

    div-float/2addr p1, v7

    iget-object v2, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->Ii1iii0:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v3, v2

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    int-to-float v0, v0

    const/high16 v2, 0x40800000    # 4.0f

    div-float/2addr v0, v2

    add-float/2addr v3, v0

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->Ii1iii0:Landroid/graphics/Bitmap;

    invoke-virtual {v1, v0, p1, v3, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    int-to-float p1, p1

    div-float/2addr p1, v7

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->Ii1iii0:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    int-to-float v0, v0

    const v2, 0x3fd33333    # 1.65f

    div-float/2addr v0, v2

    add-float/2addr v3, v0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->X1IX:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ""

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->I1:Landroid/text/TextPaint;

    invoke-virtual {v1, v0, p1, v3, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    :cond_2
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

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->getProgressHeight()F

    move-result p1

    iget p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->XX1Oi:I

    iget p3, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->X100O:I

    sub-int p4, p2, p3

    int-to-float p4, p4

    div-float/2addr p1, p4

    iget p4, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->X1IX:I

    sub-int p4, p2, p4

    int-to-float p4, p4

    int-to-float p2, p2

    int-to-float p3, p3

    const/high16 v0, 0x3f800000    # 1.0f

    mul-float/2addr p3, v0

    sub-float/2addr p2, p3

    div-float/2addr p4, p2

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->getProgressHeight()F

    move-result p2

    mul-float/2addr p4, p2

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->getProgressStartY()F

    move-result p2

    add-float/2addr p4, p2

    iget-object p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->X0i1O:Landroid/graphics/PointF;

    iget p2, p2, Landroid/graphics/PointF;->y:F

    sub-float/2addr p2, p4

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p2

    cmpl-float p1, p2, p1

    if-lez p1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->X0i1O:Landroid/graphics/PointF;

    const/4 p2, 0x0

    invoke-virtual {p0, p4}, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->iO(F)F

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/graphics/PointF;->set(FF)V

    :cond_0
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "event"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->O001I:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iput-boolean v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->iiiO:Z

    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->iO(F)F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v3, :cond_2

    const/4 v4, 0x3

    if-eq v2, v4, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->X0i1O:Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->y:F

    :cond_2
    iget-object v2, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->iXiX011:Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView$OXO1;

    if-eqz v2, :cond_3

    invoke-interface {v2, v1}, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView$OXO1;->OXO1(Z)V

    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    invoke-interface {v2, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    iput-boolean v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->iiiO:Z

    move v1, v3

    goto :goto_0

    :cond_4
    iget-object v2, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->iXiX011:Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView$OXO1;

    if-eqz v2, :cond_5

    invoke-interface {v2, v3}, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView$OXO1;->OXO1(Z)V

    :cond_5
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->OXO1(F)I

    move-result v2

    iget-object v3, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->X0i1O:Landroid/graphics/PointF;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v4

    invoke-virtual {v3, v4, v0}, Landroid/graphics/PointF;->set(FF)V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    if-eqz p1, :cond_6

    iget p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->X1IX:I

    if-ne v2, p1, :cond_7

    :cond_6
    if-eqz v1, :cond_8

    :cond_7
    iput v2, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->X1IX:I

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->iIXi1iiXI:Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView$XIi00iiXO;

    if-eqz p1, :cond_8

    invoke-interface {p1, v2, v1}, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView$XIi00iiXO;->OXO1(IZ)V

    :cond_8
    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->O00()Z

    move-result p1

    return p1
.end method

.method public setEnable(Z)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "enable"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->O001I:Z

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->iX1O1:Landroid/graphics/Paint;

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v1, 0x7f06016d

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v1, 0x7f06016e

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    :goto_0
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setHoverListener(Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView$OXO1;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "hoverListener"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->iXiX011:Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView$OXO1;

    return-void
.end method

.method public setIndex(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "index"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->X11I:I

    return-void
.end method

.method public setText(Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "text"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->XXX11i:Ljava/lang/String;

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setValue(I)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "value"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->O00()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->X100O:I

    if-ge p1, v0, :cond_1

    move p1, v0

    goto :goto_0

    :cond_1
    iget v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->XX1Oi:I

    if-le p1, v1, :cond_2

    move p1, v1

    :cond_2
    :goto_0
    iget v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->XX1Oi:I

    sub-int v2, v1, p1

    int-to-float v2, v2

    const/high16 v3, 0x3f800000    # 1.0f

    int-to-float v1, v1

    mul-float/2addr v1, v3

    int-to-float v0, v0

    sub-float/2addr v1, v0

    div-float/2addr v2, v1

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->getProgressHeight()F

    move-result v0

    mul-float/2addr v2, v0

    invoke-direct {p0}, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->getProgressStartY()F

    move-result v0

    add-float/2addr v2, v0

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->X0i1O:Landroid/graphics/PointF;

    const/4 v1, 0x0

    invoke-virtual {p0, v2}, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->iO(F)F

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/PointF;->set(FF)V

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->X1IX:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setValueListener(Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView$XIi00iiXO;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "valueListener"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView;->iIXi1iiXI:Lcom/sma/smartv3/otherdevice/jl/view/VerticalSeekBarView$XIi00iiXO;

    return-void
.end method
