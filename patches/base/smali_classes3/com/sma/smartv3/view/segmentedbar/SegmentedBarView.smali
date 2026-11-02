.class public Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView$OXO1;
    }
.end annotation


# static fields
.field public static final I0IIOI:I = 0x1

.field public static final IOIi00:I = 0x2

.field public static final IX0iIX:I = 0x1

.field public static final O1iXiI:I = 0x0

.field public static final OXi001:I = 0x0

.field public static final XIO11I:I = 0x3


# instance fields
.field public I0:Landroid/graphics/Rect;

.field public I0XXi0X:I

.field public I1:[I

.field public IO:[I

.field public IO0II0i:Ljava/lang/String;

.field public IO0iXO0O:I

.field public IOi1O0:I

.field public IX0IXOi:I

.field public IX1XiI:I

.field public IXI:Z

.field public IXOIIIO:Ljava/text/DecimalFormat;

.field public IXiOXO:I

.field public Ii0X0X:Ljava/lang/String;

.field public Ii0i:I

.field public Ii1iii0:Ljava/lang/String;

.field public IiiXiI0I:I

.field public O001I:Ljava/lang/Float;

.field public O0O:I

.field public O0O0X0iOi:Landroid/text/TextPaint;

.field public O1:Z

.field public O101:Z

.field public OO:I

.field public OX110i:I

.field public Oi:I

.field public X00O0:Z

.field public X00XIX1:I

.field public X00Xi1X:Landroid/graphics/Paint;

.field public X0i1O:I

.field public X0iO:Landroid/graphics/Paint;

.field public X1:Landroid/graphics/Paint;

.field public X100O:I

.field public X111IO:Z

.field public X11I:Landroid/graphics/Rect;

.field public X11iII1O1:Landroid/graphics/Paint;

.field public X1IX:Landroid/graphics/Paint;

.field public X1OI:Landroid/graphics/Point;

.field public XIIO11I:I

.field public XO0X10iO:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/android/mltcode/paycertificationapi/iz3;",
            ">;"
        }
    .end annotation
.end field

.field public XOIX:I

.field public XOO0XOOii:I

.field public XOX0O0:I

.field public XOXiX0:I

.field public XX00i10X:Landroid/text/StaticLayout;

.field public XX1Oi:F

.field public XXI0XOIX:I

.field public XXO:Ljava/lang/String;

.field public XXOXi:Landroid/graphics/Bitmap;

.field public XXX11i:Landroid/graphics/Paint;

.field public XXiIiX10:Landroid/graphics/Paint;

.field public XXiO0i:I

.field public Xi1i0XOX0:I

.field public Xii:Landroid/graphics/Point;

.field public Xii11I:I

.field public i0X000X0O:I

.field public i100IXOX:I

.field public i11I:I

.field public iI0I:Landroid/graphics/Path;

.field public iIX0i:Landroid/graphics/Path;

.field public iIXi1iiXI:I

.field public iIi0:Z

.field public iIi1:I

.field public iOI:I

.field public iOX:Z

.field public iOiXi11II:I

.field public iX1O1:Landroid/graphics/RectF;

.field public iXi:I

.field public iXiX011:I

.field public iXiiiO:Ljava/lang/Integer;

.field public iiII:Landroid/graphics/Point;

.field public iiIOiX:Landroid/graphics/Paint;

.field public iii0:I

.field public iiiO:Landroid/graphics/Rect;


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

    const/high16 v0, -0x10000

    const v1, -0xffff01

    .line 2
    filled-new-array {v0, v1}, [I

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IO:[I

    const/16 v0, -0x100

    .line 3
    filled-new-array {v1, v0}, [I

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->I1:[I

    const/high16 v0, -0x40800000    # -1.0f

    .line 4
    iput v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XX1Oi:F

    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Ii0i:I

    const/4 v1, 0x1

    .line 6
    iput v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IiiXiI0I:I

    .line 7
    iput v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XOIX:I

    const/4 v1, -0x1

    .line 8
    iput v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XOO0XOOii:I

    .line 9
    iput v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IO0iXO0O:I

    const v2, -0xbbbbbc

    .line 10
    iput v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iOI:I

    .line 11
    iput v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IX1XiI:I

    const/high16 v2, 0x10000

    .line 12
    iput v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XXiO0i:I

    .line 13
    iput v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Xi1i0XOX0:I

    .line 14
    iput-boolean v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iIi0:Z

    .line 15
    iput-boolean v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->O101:Z

    const/4 v0, 0x0

    .line 16
    invoke-virtual {p0, p1, v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iIXi1iiXI(Landroid/content/Context;Landroid/util/AttributeSet;)V

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

    .line 17
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/high16 v0, -0x10000

    const v1, -0xffff01

    .line 18
    filled-new-array {v0, v1}, [I

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IO:[I

    const/16 v0, -0x100

    .line 19
    filled-new-array {v1, v0}, [I

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->I1:[I

    const/high16 v0, -0x40800000    # -1.0f

    .line 20
    iput v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XX1Oi:F

    const/4 v0, 0x0

    .line 21
    iput v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Ii0i:I

    const/4 v1, 0x1

    .line 22
    iput v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IiiXiI0I:I

    .line 23
    iput v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XOIX:I

    const/4 v1, -0x1

    .line 24
    iput v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XOO0XOOii:I

    .line 25
    iput v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IO0iXO0O:I

    const v2, -0xbbbbbc

    .line 26
    iput v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iOI:I

    .line 27
    iput v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IX1XiI:I

    const/high16 v2, 0x10000

    .line 28
    iput v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XXiO0i:I

    .line 29
    iput v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Xi1i0XOX0:I

    .line 30
    iput-boolean v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iIi0:Z

    .line 31
    iput-boolean v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->O101:Z

    .line 32
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iIXi1iiXI(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public static bridge synthetic I0IIOi(Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XOO0XOOii:I

    return-void
.end method

.method public static bridge synthetic I0iXXO(Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IXI:Z

    return-void
.end method

.method public static I1(Landroid/content/Context;)Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView$OXO1;
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "context"
        }
    .end annotation

    new-instance v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView$OXO1;

    new-instance v1, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;-><init>(Landroid/content/Context;)V

    const/4 p0, 0x0

    invoke-direct {v0, v1, p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView$OXO1;-><init>(Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;Lcom/android/mltcode/paycertificationapi/qz3;)V

    return-object v0
.end method

.method public static bridge synthetic I1XOi1(Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;Ljava/lang/Float;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->O001I:Ljava/lang/Float;

    return-void
.end method

.method public static bridge synthetic IIX1OXO(Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iXiiiO:Ljava/lang/Integer;

    return-void
.end method

.method public static bridge synthetic IO(Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XO0X10iO:Ljava/util/List;

    return-void
.end method

.method public static bridge synthetic IiI10X(Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->OO:I

    return-void
.end method

.method public static bridge synthetic O00(Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IX1XiI:I

    return-void
.end method

.method public static bridge synthetic O10IXXX0X(Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XOIX:I

    return-void
.end method

.method public static bridge synthetic OII(Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Oi:I

    return-void
.end method

.method public static bridge synthetic OIX0iXi(Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X00O0:Z

    return-void
.end method

.method public static bridge synthetic OIi0(Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XOXiX0:I

    return-void
.end method

.method public static bridge synthetic OX(Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iOOX010X()V

    return-void
.end method

.method public static bridge synthetic OXO1(Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->i11I:I

    return-void
.end method

.method public static bridge synthetic OiIIX101O(Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iIXi1iiXI:I

    return-void
.end method

.method public static bridge synthetic X0O(Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Ii0X0X:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic X1ii(Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IiiXiI0I:I

    return-void
.end method

.method public static bridge synthetic XIi00iiXO(Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iii0:I

    return-void
.end method

.method public static bridge synthetic XO0O10(Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->O0O:I

    return-void
.end method

.method public static bridge synthetic XOO0ii0(Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X00XIX1:I

    return-void
.end method

.method public static bridge synthetic XX0(Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X0i1O:I

    return-void
.end method

.method public static bridge synthetic XXI(Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XXI0XOIX:I

    return-void
.end method

.method public static bridge synthetic XiOIO(Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Ii1iii0:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic XiOIii1(Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IO0iXO0O:I

    return-void
.end method

.method private getContentHeight()I
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v1

    sub-int/2addr v0, v1

    return v0
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

    invoke-direct {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getXLeft()I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    sub-int/2addr v0, v1

    return v0
.end method

.method private getXLeft()I
    .locals 3

    iget v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iIi1:I

    const/4 v1, 0x1

    const/4 v2, 0x2

    if-eq v0, v1, :cond_0

    if-ne v0, v2, :cond_1

    :cond_0
    iget-boolean v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->O1:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iXiiiO:Ljava/lang/Integer;

    if-nez v0, :cond_1

    iget v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IOi1O0:I

    div-int/2addr v0, v2

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private getXtop()I
    .locals 5

    iget v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->I0XXi0X:I

    iget v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->i11I:I

    sub-int v2, v0, v1

    const/4 v3, 0x0

    const/4 v4, 0x2

    if-lez v2, :cond_0

    sub-int/2addr v0, v1

    div-int/2addr v0, v4

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    iget v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iIi1:I

    const/4 v2, 0x1

    if-eq v1, v2, :cond_1

    if-ne v1, v4, :cond_2

    :cond_1
    iget-boolean v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->O1:Z

    if-eqz v1, :cond_2

    return v0

    :cond_2
    return v3
.end method

.method public static bridge synthetic iIiiO(Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iXiX011:I

    return-void
.end method

.method public static bridge synthetic iO(Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iOI:I

    return-void
.end method


# virtual methods
.method public final II1Xi0(Landroid/graphics/Canvas;)V
    .locals 17
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "canvas"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getContentWidth()I

    move-result v2

    int-to-float v2, v2

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v4

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getXLeft()I

    move-result v5

    add-int/2addr v4, v5

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11I()I

    move-result v5

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v6

    add-int/2addr v5, v6

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X01IiOiIi()I

    move-result v6

    add-int/2addr v5, v6

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getXtop()I

    move-result v6

    add-int/2addr v5, v6

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v6

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getXLeft()I

    move-result v7

    add-int/2addr v6, v7

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getContentWidth()I

    move-result v7

    add-int/2addr v6, v7

    iget v7, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->i11I:I

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11I()I

    move-result v8

    add-int/2addr v7, v8

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v8

    add-int/2addr v7, v8

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X01IiOiIi()I

    move-result v8

    add-int/2addr v7, v8

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getXtop()I

    move-result v8

    add-int/2addr v7, v8

    invoke-virtual {v3, v4, v5, v6, v7}, Landroid/graphics/Rect;->set(IIII)V

    new-instance v8, Landroid/graphics/LinearGradient;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->left:I

    int-to-float v9, v4

    iget v4, v3, Landroid/graphics/Rect;->top:I

    int-to-float v10, v4

    iget v4, v3, Landroid/graphics/Rect;->right:I

    int-to-float v11, v4

    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    int-to-float v12, v3

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IO:[I

    const/4 v4, 0x0

    aget v13, v3, v4

    const/4 v5, 0x1

    aget v14, v3, v5

    sget-object v15, Landroid/graphics/Shader$TileMode;->MIRROR:Landroid/graphics/Shader$TileMode;

    invoke-direct/range {v8 .. v15}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XXiIiX10:Landroid/graphics/Paint;

    invoke-virtual {v3, v8}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    move-result v3

    const/4 v6, 0x2

    div-int/2addr v3, v6

    iput v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Ii0i:I

    int-to-float v3, v3

    const/high16 v7, 0x40000000    # 2.0f

    div-float/2addr v2, v7

    cmpl-float v2, v3, v2

    if-lez v2, :cond_0

    iput v4, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IiiXiI0I:I

    :cond_0
    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->I0:Landroid/graphics/Rect;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    invoke-virtual {v2, v3}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    iget v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IiiXiI0I:I

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-eq v2, v6, :cond_1

    goto/16 :goto_0

    :cond_1
    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Ii0i:I

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v4

    add-int/2addr v3, v4

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11I()I

    move-result v4

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X01IiOiIi()I

    move-result v5

    add-int/2addr v4, v5

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v5

    add-int/2addr v4, v5

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v5

    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    move-result v6

    sub-int/2addr v5, v6

    iget v6, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Ii0i:I

    sub-int/2addr v5, v6

    iget v6, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->i11I:I

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11I()I

    move-result v7

    add-int/2addr v6, v7

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X01IiOiIi()I

    move-result v7

    add-int/2addr v6, v7

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v7

    add-int/2addr v6, v7

    invoke-virtual {v2, v3, v4, v5, v6}, Landroid/graphics/Rect;->set(IIII)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XXiIiX10:Landroid/graphics/Paint;

    invoke-virtual {v1, v2, v3}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X1OI:Landroid/graphics/Point;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->left:I

    iget v5, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Ii0i:I

    sub-int/2addr v4, v5

    iget v3, v3, Landroid/graphics/Rect;->top:I

    add-int/2addr v3, v5

    invoke-virtual {v2, v4, v3}, Landroid/graphics/Point;->set(II)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Xii:Landroid/graphics/Point;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->left:I

    iget v3, v3, Landroid/graphics/Rect;->top:I

    invoke-virtual {v2, v4, v3}, Landroid/graphics/Point;->set(II)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiII:Landroid/graphics/Point;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->left:I

    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {v2, v4, v3}, Landroid/graphics/Point;->set(II)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X1OI:Landroid/graphics/Point;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Xii:Landroid/graphics/Point;

    iget-object v4, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiII:Landroid/graphics/Point;

    iget-object v5, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XXiIiX10:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11iII1O1(Landroid/graphics/Canvas;Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Paint;)V

    iget-object v1, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X1OI:Landroid/graphics/Point;

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget v3, v2, Landroid/graphics/Rect;->right:I

    iget v4, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Ii0i:I

    add-int/2addr v3, v4

    iget v2, v2, Landroid/graphics/Rect;->top:I

    add-int/2addr v2, v4

    invoke-virtual {v1, v3, v2}, Landroid/graphics/Point;->set(II)V

    iget-object v1, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Xii:Landroid/graphics/Point;

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget v3, v2, Landroid/graphics/Rect;->right:I

    iget v2, v2, Landroid/graphics/Rect;->top:I

    invoke-virtual {v1, v3, v2}, Landroid/graphics/Point;->set(II)V

    iget-object v1, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiII:Landroid/graphics/Point;

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget v3, v2, Landroid/graphics/Rect;->right:I

    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {v1, v3, v2}, Landroid/graphics/Point;->set(II)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X1OI:Landroid/graphics/Point;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Xii:Landroid/graphics/Point;

    iget-object v4, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiII:Landroid/graphics/Point;

    iget-object v5, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XXiIiX10:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    invoke-virtual/range {v0 .. v5}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11iII1O1(Landroid/graphics/Canvas;Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Paint;)V

    goto :goto_0

    :cond_2
    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iX1O1:Landroid/graphics/RectF;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->left:I

    int-to-float v4, v4

    iget v5, v3, Landroid/graphics/Rect;->top:I

    int-to-float v5, v5

    iget v6, v3, Landroid/graphics/Rect;->right:I

    int-to-float v6, v6

    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    int-to-float v3, v3

    invoke-virtual {v2, v4, v5, v6, v3}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iX1O1:Landroid/graphics/RectF;

    iget v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Ii0i:I

    int-to-float v4, v3

    int-to-float v3, v3

    iget-object v5, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XXiIiX10:Landroid/graphics/Paint;

    invoke-virtual {v1, v2, v4, v3, v5}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    goto :goto_0

    :cond_3
    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XXiIiX10:Landroid/graphics/Paint;

    invoke-virtual {v1, v2, v3}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    :goto_0
    iget-boolean v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IXI:Z

    if-eqz v2, :cond_4

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IO0II0i:Ljava/lang/String;

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiIOiX:Landroid/graphics/Paint;

    iget v4, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XOXiX0:I

    int-to-float v4, v4

    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiIOiX:Landroid/graphics/Paint;

    iget-object v4, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->I0:Landroid/graphics/Rect;

    iget v5, v4, Landroid/graphics/Rect;->left:I

    int-to-float v5, v5

    iget v6, v4, Landroid/graphics/Rect;->top:I

    int-to-float v6, v6

    iget v7, v4, Landroid/graphics/Rect;->right:I

    int-to-float v7, v7

    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    int-to-float v4, v4

    move/from16 v16, v7

    move v7, v4

    move v4, v5

    move v5, v6

    move/from16 v6, v16

    invoke-virtual/range {v0 .. v7}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iI(Landroid/graphics/Canvas;Landroid/graphics/Paint;Ljava/lang/String;FFFF)V

    :cond_4
    return-void
.end method

.method public final IXXOO(Landroid/graphics/Canvas;)V
    .locals 18
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "canvas"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XXI0XOIX:I

    if-eqz v2, :cond_0

    goto/16 :goto_2

    :cond_0
    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XO0X10iO:Ljava/util/List;

    if-eqz v2, :cond_9

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    goto/16 :goto_2

    :cond_1
    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XO0X10iO:Ljava/util/List;

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/android/mltcode/paycertificationapi/iz3;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/iz3;->O00()F

    move-result v2

    iget-object v4, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XO0X10iO:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    const/4 v6, 0x1

    sub-int/2addr v5, v6

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/android/mltcode/paycertificationapi/iz3;

    invoke-virtual {v4}, Lcom/android/mltcode/paycertificationapi/iz3;->XO0O10()F

    move-result v4

    iget-object v5, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->O001I:Ljava/lang/Float;

    if-eqz v5, :cond_9

    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v5

    cmpl-float v5, v5, v2

    if-ltz v5, :cond_9

    iget-object v5, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->O001I:Ljava/lang/Float;

    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v5

    cmpg-float v5, v5, v4

    if-lez v5, :cond_2

    goto/16 :goto_2

    :cond_2
    move v5, v3

    :goto_0
    iget-object v7, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XO0X10iO:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    if-ge v5, v7, :cond_4

    iget-object v7, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->O001I:Ljava/lang/Float;

    invoke-virtual {v7}, Ljava/lang/Float;->floatValue()F

    move-result v7

    iget-object v8, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XO0X10iO:Ljava/util/List;

    invoke-interface {v8, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/android/mltcode/paycertificationapi/iz3;

    invoke-virtual {v8}, Lcom/android/mltcode/paycertificationapi/iz3;->O00()F

    move-result v8

    cmpl-float v7, v7, v8

    if-ltz v7, :cond_3

    iget-object v7, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->O001I:Ljava/lang/Float;

    invoke-virtual {v7}, Ljava/lang/Float;->floatValue()F

    move-result v7

    iget-object v8, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XO0X10iO:Ljava/util/List;

    invoke-interface {v8, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/android/mltcode/paycertificationapi/iz3;

    invoke-virtual {v8}, Lcom/android/mltcode/paycertificationapi/iz3;->XO0O10()F

    move-result v8

    cmpg-float v7, v7, v8

    if-gtz v7, :cond_3

    goto :goto_1

    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_4
    move v5, v3

    :goto_1
    iget-object v7, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->O001I:Ljava/lang/Float;

    invoke-virtual {v7}, Ljava/lang/Float;->floatValue()F

    move-result v7

    sub-float/2addr v7, v2

    sub-float v2, v4, v2

    div-float/2addr v7, v2

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getContentWidth()I

    move-result v8

    int-to-float v8, v8

    mul-float/2addr v8, v2

    div-float/2addr v8, v4

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getXLeft()I

    move-result v4

    add-int/2addr v2, v4

    int-to-float v2, v2

    mul-float v4, v7, v8

    add-float/2addr v2, v4

    float-to-int v2, v2

    int-to-float v2, v2

    iget-object v4, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->I1:[I

    aget v9, v4, v3

    aget v4, v4, v6

    invoke-virtual {v0, v7, v9, v4}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X0i1O(FII)I

    move-result v16

    iget-object v4, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v7

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getXLeft()I

    move-result v9

    add-int/2addr v7, v9

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11I()I

    move-result v9

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v10

    add-int/2addr v9, v10

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X01IiOiIi()I

    move-result v10

    add-int/2addr v9, v10

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getXtop()I

    move-result v10

    add-int/2addr v9, v10

    float-to-int v2, v2

    iget v10, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IOi1O0:I

    div-int/lit8 v10, v10, 0x3

    add-int/2addr v2, v10

    iget v10, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X00XIX1:I

    mul-int/2addr v10, v5

    add-int/2addr v2, v10

    iget v5, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->i11I:I

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11I()I

    move-result v10

    add-int/2addr v5, v10

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v10

    add-int/2addr v5, v10

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X01IiOiIi()I

    move-result v10

    add-int/2addr v5, v10

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getXtop()I

    move-result v10

    add-int/2addr v5, v10

    invoke-virtual {v4, v7, v9, v2, v5}, Landroid/graphics/Rect;->set(IIII)V

    new-instance v10, Landroid/graphics/LinearGradient;

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget v4, v2, Landroid/graphics/Rect;->left:I

    int-to-float v11, v4

    iget v4, v2, Landroid/graphics/Rect;->top:I

    int-to-float v12, v4

    iget v4, v2, Landroid/graphics/Rect;->right:I

    int-to-float v13, v4

    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    int-to-float v14, v2

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->I1:[I

    aget v15, v2, v3

    sget-object v17, Landroid/graphics/Shader$TileMode;->MIRROR:Landroid/graphics/Shader$TileMode;

    invoke-direct/range {v10 .. v17}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X1:Landroid/graphics/Paint;

    invoke-virtual {v2, v10}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v2

    const/4 v4, 0x2

    div-int/2addr v2, v4

    iput v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Ii0i:I

    int-to-float v2, v2

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v8, v5

    cmpl-float v2, v2, v8

    if-lez v2, :cond_5

    iput v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IiiXiI0I:I

    :cond_5
    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->I0:Landroid/graphics/Rect;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    invoke-virtual {v2, v3}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    iget v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IiiXiI0I:I

    if-eqz v2, :cond_8

    if-eq v2, v6, :cond_7

    if-eq v2, v4, :cond_6

    goto/16 :goto_2

    :cond_6
    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Ii0i:I

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v4

    add-int/2addr v3, v4

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11I()I

    move-result v4

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X01IiOiIi()I

    move-result v5

    add-int/2addr v4, v5

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v5

    add-int/2addr v4, v5

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v5

    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    move-result v6

    sub-int/2addr v5, v6

    iget v6, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Ii0i:I

    sub-int/2addr v5, v6

    iget v6, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->i11I:I

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11I()I

    move-result v7

    add-int/2addr v6, v7

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X01IiOiIi()I

    move-result v7

    add-int/2addr v6, v7

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v7

    add-int/2addr v6, v7

    invoke-virtual {v2, v3, v4, v5, v6}, Landroid/graphics/Rect;->set(IIII)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X1:Landroid/graphics/Paint;

    invoke-virtual {v1, v2, v3}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X1OI:Landroid/graphics/Point;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->left:I

    iget v5, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Ii0i:I

    sub-int/2addr v4, v5

    iget v3, v3, Landroid/graphics/Rect;->top:I

    add-int/2addr v3, v5

    invoke-virtual {v2, v4, v3}, Landroid/graphics/Point;->set(II)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Xii:Landroid/graphics/Point;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->left:I

    iget v3, v3, Landroid/graphics/Rect;->top:I

    invoke-virtual {v2, v4, v3}, Landroid/graphics/Point;->set(II)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiII:Landroid/graphics/Point;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->left:I

    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {v2, v4, v3}, Landroid/graphics/Point;->set(II)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X1OI:Landroid/graphics/Point;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Xii:Landroid/graphics/Point;

    iget-object v4, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiII:Landroid/graphics/Point;

    iget-object v5, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X1:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11iII1O1(Landroid/graphics/Canvas;Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Paint;)V

    iget-object v1, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X1OI:Landroid/graphics/Point;

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget v3, v2, Landroid/graphics/Rect;->right:I

    iget v4, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Ii0i:I

    add-int/2addr v3, v4

    iget v2, v2, Landroid/graphics/Rect;->top:I

    add-int/2addr v2, v4

    invoke-virtual {v1, v3, v2}, Landroid/graphics/Point;->set(II)V

    iget-object v1, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Xii:Landroid/graphics/Point;

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget v3, v2, Landroid/graphics/Rect;->right:I

    iget v2, v2, Landroid/graphics/Rect;->top:I

    invoke-virtual {v1, v3, v2}, Landroid/graphics/Point;->set(II)V

    iget-object v1, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiII:Landroid/graphics/Point;

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget v3, v2, Landroid/graphics/Rect;->right:I

    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {v1, v3, v2}, Landroid/graphics/Point;->set(II)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X1OI:Landroid/graphics/Point;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Xii:Landroid/graphics/Point;

    iget-object v4, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiII:Landroid/graphics/Point;

    iget-object v5, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X1:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    invoke-virtual/range {v0 .. v5}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11iII1O1(Landroid/graphics/Canvas;Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Paint;)V

    return-void

    :cond_7
    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iX1O1:Landroid/graphics/RectF;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->left:I

    int-to-float v4, v4

    iget v5, v3, Landroid/graphics/Rect;->top:I

    int-to-float v5, v5

    iget v6, v3, Landroid/graphics/Rect;->right:I

    int-to-float v6, v6

    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    int-to-float v3, v3

    invoke-virtual {v2, v4, v5, v6, v3}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iX1O1:Landroid/graphics/RectF;

    iget v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Ii0i:I

    int-to-float v4, v3

    int-to-float v3, v3

    iget-object v5, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X1:Landroid/graphics/Paint;

    invoke-virtual {v1, v2, v4, v3, v5}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    return-void

    :cond_8
    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X1:Landroid/graphics/Paint;

    invoke-virtual {v1, v2, v3}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    :cond_9
    :goto_2
    return-void
.end method

.method public Ii1iii0(Ljava/lang/Float;Ljava/lang/String;)V
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

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->O001I:Ljava/lang/Float;

    iput-object p2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Ii0X0X:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iOOX010X()V

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public O001I(II)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "startColor",
            "endColor"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->I1:[I

    const/4 v1, 0x0

    aput p1, v0, v1

    const/4 p1, 0x1

    aput p2, v0, p1

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public final O1O(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;IIFFLandroid/graphics/Paint;)V
    .locals 0
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
            "bitmap",
            "thumbW",
            "thumbH",
            "centerX",
            "centerY",
            "paint"
        }
    .end annotation

    div-int/lit8 p3, p3, 0x2

    int-to-float p3, p3

    sub-float/2addr p5, p3

    div-int/lit8 p4, p4, 0x2

    int-to-float p3, p4

    sub-float/2addr p6, p3

    invoke-virtual {p1, p2, p5, p6, p7}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    return-void
.end method

.method public final X01IiOiIi()I
    .locals 1

    invoke-virtual {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Xii11I:I

    return v0
.end method

.method public final X0i1O(FII)I
    .locals 6
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "fraction",
            "startColor",
            "endColor"
        }
    .end annotation

    invoke-static {p2}, Landroid/graphics/Color;->red(I)I

    move-result v0

    invoke-static {p2}, Landroid/graphics/Color;->blue(I)I

    move-result v1

    invoke-static {p2}, Landroid/graphics/Color;->green(I)I

    move-result v2

    invoke-static {p2}, Landroid/graphics/Color;->alpha(I)I

    move-result p2

    invoke-static {p3}, Landroid/graphics/Color;->red(I)I

    move-result v3

    invoke-static {p3}, Landroid/graphics/Color;->blue(I)I

    move-result v4

    invoke-static {p3}, Landroid/graphics/Color;->green(I)I

    move-result v5

    invoke-static {p3}, Landroid/graphics/Color;->alpha(I)I

    move-result p3

    sub-int/2addr v3, v0

    sub-int/2addr v4, v1

    sub-int/2addr v5, v2

    sub-int/2addr p3, p2

    int-to-float v0, v0

    int-to-float v3, v3

    mul-float/2addr v3, p1

    add-float/2addr v0, v3

    float-to-int v0, v0

    int-to-float v1, v1

    int-to-float v3, v4

    mul-float/2addr v3, p1

    add-float/2addr v1, v3

    float-to-int v1, v1

    int-to-float v2, v2

    int-to-float v3, v5

    mul-float/2addr v3, p1

    add-float/2addr v2, v3

    float-to-int v2, v2

    int-to-float p2, p2

    int-to-float p3, p3

    mul-float/2addr p1, p3

    add-float/2addr p2, p1

    float-to-int p1, p2

    invoke-static {p1, v0, v2, v1}, Landroid/graphics/Color;->argb(IIII)I

    move-result p1

    return p1
.end method

.method public final X11I()I
    .locals 1

    invoke-virtual {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X0i1O:I

    return v0
.end method

.method public final X11iII1O1(Landroid/graphics/Canvas;Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Paint;)V
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

    iget-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iI0I:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    iget-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iI0I:Landroid/graphics/Path;

    iget v1, p2, Landroid/graphics/Point;->x:I

    int-to-float v1, v1

    iget v2, p2, Landroid/graphics/Point;->y:I

    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V

    iget-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iI0I:Landroid/graphics/Path;

    iget v1, p3, Landroid/graphics/Point;->x:I

    int-to-float v1, v1

    iget p3, p3, Landroid/graphics/Point;->y:I

    int-to-float p3, p3

    invoke-virtual {v0, v1, p3}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object p3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iI0I:Landroid/graphics/Path;

    iget v0, p4, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget p4, p4, Landroid/graphics/Point;->y:I

    int-to-float p4, p4

    invoke-virtual {p3, v0, p4}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object p3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iI0I:Landroid/graphics/Path;

    iget p4, p2, Landroid/graphics/Point;->x:I

    int-to-float p4, p4

    iget p2, p2, Landroid/graphics/Point;->y:I

    int-to-float p2, p2

    invoke-virtual {p3, p4, p2}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object p2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iI0I:Landroid/graphics/Path;

    invoke-virtual {p2}, Landroid/graphics/Path;->close()V

    iget-object p2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iI0I:Landroid/graphics/Path;

    invoke-virtual {p1, p2, p5}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    return-void
.end method

.method public final X1IX(Landroid/graphics/Canvas;II)V
    .locals 11
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

    const/4 v2, -0x1

    const/4 v3, 0x0

    if-ne p3, v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    if-eqz v2, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getContentWidth()I

    move-result v4

    div-int/lit8 v4, v4, 0x2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v5

    add-int/2addr v4, v5

    goto :goto_1

    :cond_1
    move v4, p3

    :goto_1
    iget-object v5, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11I:Landroid/graphics/Rect;

    iget v6, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iIXi1iiXI:I

    div-int/lit8 v6, v6, 0x2

    sub-int v6, v4, v6

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v7

    iget v8, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iIXi1iiXI:I

    div-int/lit8 v8, v8, 0x2

    add-int/2addr v8, v4

    iget v9, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X0i1O:I

    iget v10, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XOX0O0:I

    sub-int/2addr v9, v10

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v10

    add-int/2addr v9, v10

    invoke-virtual {v5, v6, v7, v8, v9}, Landroid/graphics/Rect;->set(IIII)V

    iget-object v5, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XXX11i:Landroid/graphics/Paint;

    iget v6, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iXiX011:I

    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v5, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11I:Landroid/graphics/Rect;

    iget v5, v5, Landroid/graphics/Rect;->left:I

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v6

    if-ge v5, v6, :cond_2

    iget-object v5, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11I:Landroid/graphics/Rect;

    iget v5, v5, Landroid/graphics/Rect;->left:I

    neg-int v5, v5

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v6

    add-int/2addr v5, v6

    iget-object v6, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iX1O1:Landroid/graphics/RectF;

    iget-object v7, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11I:Landroid/graphics/Rect;

    iget v8, v7, Landroid/graphics/Rect;->left:I

    add-int/2addr v8, v5

    int-to-float v8, v8

    iget v9, v7, Landroid/graphics/Rect;->top:I

    int-to-float v9, v9

    iget v10, v7, Landroid/graphics/Rect;->right:I

    add-int/2addr v10, v5

    int-to-float v5, v10

    iget v7, v7, Landroid/graphics/Rect;->bottom:I

    int-to-float v7, v7

    invoke-virtual {v6, v8, v9, v5, v7}, Landroid/graphics/RectF;->set(FFFF)V

    goto :goto_2

    :cond_2
    iget-object v5, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11I:Landroid/graphics/Rect;

    iget v5, v5, Landroid/graphics/Rect;->right:I

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v6

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v7

    sub-int/2addr v6, v7

    if-le v5, v6, :cond_3

    iget-object v5, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11I:Landroid/graphics/Rect;

    iget v5, v5, Landroid/graphics/Rect;->right:I

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v6

    sub-int/2addr v5, v6

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v6

    add-int/2addr v5, v6

    iget-object v6, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iX1O1:Landroid/graphics/RectF;

    iget-object v7, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11I:Landroid/graphics/Rect;

    iget v8, v7, Landroid/graphics/Rect;->left:I

    sub-int/2addr v8, v5

    int-to-float v8, v8

    iget v9, v7, Landroid/graphics/Rect;->top:I

    int-to-float v9, v9

    iget v10, v7, Landroid/graphics/Rect;->right:I

    sub-int/2addr v10, v5

    int-to-float v5, v10

    iget v7, v7, Landroid/graphics/Rect;->bottom:I

    int-to-float v7, v7

    invoke-virtual {v6, v8, v9, v5, v7}, Landroid/graphics/RectF;->set(FFFF)V

    goto :goto_2

    :cond_3
    iget-object v5, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iX1O1:Landroid/graphics/RectF;

    iget-object v6, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11I:Landroid/graphics/Rect;

    iget v7, v6, Landroid/graphics/Rect;->left:I

    int-to-float v7, v7

    iget v8, v6, Landroid/graphics/Rect;->top:I

    int-to-float v8, v8

    iget v9, v6, Landroid/graphics/Rect;->right:I

    int-to-float v9, v9

    iget v6, v6, Landroid/graphics/Rect;->bottom:I

    int-to-float v6, v6

    invoke-virtual {v5, v7, v8, v9, v6}, Landroid/graphics/RectF;->set(FFFF)V

    :goto_2
    iget-object v5, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iX1O1:Landroid/graphics/RectF;

    iget v6, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X100O:I

    int-to-float v7, v6

    int-to-float v6, v6

    iget-object v8, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XXX11i:Landroid/graphics/Paint;

    invoke-virtual {p1, v5, v7, v6, v8}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    iget-boolean v5, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iOX:Z

    if-eqz v5, :cond_4

    iget-object v5, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iX1O1:Landroid/graphics/RectF;

    iget v6, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X100O:I

    int-to-float v7, v6

    int-to-float v6, v6

    iget-object v8, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X1IX:Landroid/graphics/Paint;

    invoke-virtual {p1, v5, v7, v6, v8}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    :cond_4
    if-nez v2, :cond_7

    iget v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iOiXi11II:I

    div-int/lit8 v2, v2, 0x2

    sub-int v2, v4, v2

    iget v5, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Ii0i:I

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v6

    add-int/2addr v5, v6

    if-ge v2, v5, :cond_5

    iget v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Ii0i:I

    sub-int/2addr v2, v4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    add-int/2addr v3, v2

    goto :goto_3

    :cond_5
    iget v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iOiXi11II:I

    div-int/lit8 v2, v2, 0x2

    add-int/2addr v2, v4

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v5

    iget v6, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Ii0i:I

    sub-int/2addr v5, v6

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v6

    sub-int/2addr v5, v6

    if-le v2, v5, :cond_6

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    iget v3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Ii0i:I

    sub-int/2addr v2, v3

    sub-int/2addr v2, v4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v3

    sub-int v3, v2, v3

    :cond_6
    :goto_3
    iget-object v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X1OI:Landroid/graphics/Point;

    iget v5, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iOiXi11II:I

    div-int/lit8 v5, v5, 0x2

    sub-int v5, v4, v5

    add-int/2addr v5, v3

    iget v6, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XOX0O0:I

    sub-int v6, p2, v6

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v7

    add-int/2addr v6, v7

    invoke-virtual {v2, v5, v6}, Landroid/graphics/Point;->set(II)V

    iget-object v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Xii:Landroid/graphics/Point;

    iget v5, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iOiXi11II:I

    div-int/lit8 v5, v5, 0x2

    add-int/2addr v5, v4

    add-int/2addr v5, v3

    iget v6, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XOX0O0:I

    sub-int v6, p2, v6

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v7

    add-int/2addr v6, v7

    invoke-virtual {v2, v5, v6}, Landroid/graphics/Point;->set(II)V

    iget-object v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiII:Landroid/graphics/Point;

    add-int/2addr v4, v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    add-int/2addr v3, p2

    invoke-virtual {v2, v4, v3}, Landroid/graphics/Point;->set(II)V

    iget-object v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X1OI:Landroid/graphics/Point;

    iget-object v3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Xii:Landroid/graphics/Point;

    iget-object v4, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiII:Landroid/graphics/Point;

    iget-object v5, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XXX11i:Landroid/graphics/Paint;

    move-object v0, p0

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11iII1O1(Landroid/graphics/Canvas;Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Paint;)V

    iget-boolean v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iOX:Z

    if-eqz v1, :cond_7

    iget-object v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X1OI:Landroid/graphics/Point;

    iget-object v3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Xii:Landroid/graphics/Point;

    iget-object v4, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiII:Landroid/graphics/Point;

    iget-object v5, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X1IX:Landroid/graphics/Paint;

    move-object v0, p0

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XXX11i(Landroid/graphics/Canvas;Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Paint;)V

    :cond_7
    iget-object v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XX00i10X:Landroid/text/StaticLayout;

    if-eqz v2, :cond_8

    iget-object v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iX1O1:Landroid/graphics/RectF;

    iget v3, v2, Landroid/graphics/RectF;->left:F

    iget v4, v2, Landroid/graphics/RectF;->top:F

    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    move-result v2

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v2, v5

    add-float/2addr v4, v2

    iget-object v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XX00i10X:Landroid/text/StaticLayout;

    invoke-virtual {v2}, Landroid/text/Layout;->getHeight()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    sub-float/2addr v4, v2

    invoke-virtual {p1, v3, v4}, Landroid/graphics/Canvas;->translate(FF)V

    iget-object v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XX00i10X:Landroid/text/StaticLayout;

    invoke-virtual {v2, p1}, Landroid/text/Layout;->draw(Landroid/graphics/Canvas;)V

    :cond_8
    return-void
.end method

.method public final XXIIO1i11(Landroid/graphics/Canvas;Landroid/graphics/Paint;Ljava/lang/String;Landroid/graphics/Rect;)V
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

    invoke-virtual/range {v1 .. v8}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iI(Landroid/graphics/Canvas;Landroid/graphics/Paint;Ljava/lang/String;FFFF)V

    return-void
.end method

.method public XXO(FLjava/lang/String;)V
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

    iput-object p2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XXO:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->O001I:Ljava/lang/Float;

    invoke-virtual {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iOOX010X()V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public final XXX11i(Landroid/graphics/Canvas;Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Paint;)V
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

    iget-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iIX0i:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    iget-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iIX0i:Landroid/graphics/Path;

    iget v1, p2, Landroid/graphics/Point;->x:I

    int-to-float v1, v1

    iget v2, p2, Landroid/graphics/Point;->y:I

    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V

    iget-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iIX0i:Landroid/graphics/Path;

    iget v1, p3, Landroid/graphics/Point;->x:I

    int-to-float v1, v1

    iget v2, p3, Landroid/graphics/Point;->y:I

    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11iII1O1:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I

    move-result v0

    invoke-virtual {p5, v0}, Landroid/graphics/Paint;->setColor(I)V

    iget v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IXiOXO:I

    int-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    add-float/2addr v0, v1

    invoke-virtual {p5, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iIX0i:Landroid/graphics/Path;

    invoke-virtual {p1, v0, p5}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    iget-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iIX0i:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    iget v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IXiOXO:I

    int-to-float v0, v0

    invoke-virtual {p5, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IXiOXO:I

    div-int/lit8 v0, v0, 0x6

    int-to-float v0, v0

    iget-object v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iIX0i:Landroid/graphics/Path;

    iget v2, p2, Landroid/graphics/Point;->x:I

    int-to-float v2, v2

    sub-float/2addr v2, v0

    iget p2, p2, Landroid/graphics/Point;->y:I

    int-to-float p2, p2

    sub-float/2addr p2, v0

    invoke-virtual {v1, v2, p2}, Landroid/graphics/Path;->moveTo(FF)V

    iget-object p2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iIX0i:Landroid/graphics/Path;

    iget v1, p4, Landroid/graphics/Point;->x:I

    int-to-float v1, v1

    iget p4, p4, Landroid/graphics/Point;->y:I

    int-to-float p4, p4

    invoke-virtual {p2, v1, p4}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object p2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iIX0i:Landroid/graphics/Path;

    iget p4, p3, Landroid/graphics/Point;->x:I

    int-to-float p4, p4

    add-float/2addr p4, v0

    iget p3, p3, Landroid/graphics/Point;->y:I

    int-to-float p3, p3

    sub-float/2addr p3, v0

    invoke-virtual {p2, p4, p3}, Landroid/graphics/Path;->lineTo(FF)V

    iget p2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XIIO11I:I

    invoke-virtual {p5, p2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iIX0i:Landroid/graphics/Path;

    invoke-virtual {p1, p2, p5}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    return-void
.end method

.method public getCurrentBarColor()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->OX110i:I

    return v0
.end method

.method public getValueSegment()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iXiiiO:Ljava/lang/Integer;

    return-object v0
.end method

.method public getValueSegmentText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Ii1iii0:Ljava/lang/String;

    return-object v0
.end method

.method public i010I(Landroid/graphics/Canvas;IIFFILandroid/graphics/Paint;)V
    .locals 1
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

    invoke-virtual {p7, p6}, Landroid/graphics/Paint;->setColor(I)V

    invoke-static {p3, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    div-int/lit8 p2, p2, 0x2

    new-instance p3, Landroid/graphics/BlurMaskFilter;

    const/high16 p6, 0x40a00000    # 5.0f

    sget-object v0, Landroid/graphics/BlurMaskFilter$Blur;->SOLID:Landroid/graphics/BlurMaskFilter$Blur;

    invoke-direct {p3, p6, v0}, Landroid/graphics/BlurMaskFilter;-><init>(FLandroid/graphics/BlurMaskFilter$Blur;)V

    invoke-virtual {p7, p3}, Landroid/graphics/Paint;->setMaskFilter(Landroid/graphics/MaskFilter;)Landroid/graphics/MaskFilter;

    int-to-float p2, p2

    invoke-virtual {p1, p4, p5, p2, p7}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    const/4 p1, 0x0

    invoke-virtual {p7, p1}, Landroid/graphics/Paint;->setMaskFilter(Landroid/graphics/MaskFilter;)Landroid/graphics/MaskFilter;

    return-void
.end method

.method public final iI(Landroid/graphics/Canvas;Landroid/graphics/Paint;Ljava/lang/String;FFFF)V
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

.method public final iIXi1iiXI(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 9
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

    move-result-object v0

    sget-object v1, Lcom/sma/smartv3/R$styleable;->SegmentedBarView:[I

    const/4 v2, 0x0

    invoke-virtual {v0, p2, v1, v2, v2}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/16 v1, 0x1f

    const/4 v3, -0x1

    invoke-virtual {p2, v1, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    iput v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->i100IXOX:I

    const/16 v1, 0x20

    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    iput v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iIi1:I

    const/4 v1, 0x3

    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v4

    iput v4, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IX0IXOi:I

    const/4 v4, 0x4

    invoke-virtual {p2, v4, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v4

    iput v4, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iXi:I

    const v4, 0x7f0703ca

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    const/16 v5, 0x18

    invoke-virtual {p2, v5, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XOXiX0:I

    const v4, 0x7f0703cf

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    const/16 v5, 0x2a

    invoke-virtual {p2, v5, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Oi:I

    const v4, 0x7f0703c8

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    const/16 v5, 0xa

    invoke-virtual {p2, v5, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->O0O:I

    const/16 v4, 0x8

    invoke-virtual {p2, v4, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Xi1i0XOX0:I

    const v4, 0x7f0703c6

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    const/4 v5, 0x2

    invoke-virtual {p2, v5, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->i11I:I

    const v4, 0x7f0703cc

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    const/16 v6, 0x27

    invoke-virtual {p2, v6, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X0i1O:I

    const v4, 0x7f0703ce

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    const/16 v6, 0x29

    invoke-virtual {p2, v6, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iIXi1iiXI:I

    const v4, 0x7f0703c4

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    invoke-virtual {p2, v2, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XOX0O0:I

    const v4, 0x7f0703c5

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    const/4 v6, 0x1

    invoke-virtual {p2, v6, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iOiXi11II:I

    const v4, 0x7f0703c9

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    const/16 v7, 0x12

    invoke-virtual {p2, v7, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X00XIX1:I

    const/16 v4, 0x16

    invoke-virtual {p2, v4, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Ii0i:I

    const/16 v4, 0x11

    invoke-virtual {p2, v4, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v4

    iput v4, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->i0X000X0O:I

    const v4, 0x7f0703cd

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    const/16 v7, 0x28

    invoke-virtual {p2, v7, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X100O:I

    const v4, 0x7f0703c7

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v7

    const/4 v8, 0x5

    invoke-virtual {p2, v8, v7}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v7

    iput v7, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iii0:I

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    const/4 v7, 0x6

    invoke-virtual {p2, v7, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Xii11I:I

    const v4, 0x7f0703cb

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    const/16 v7, 0x26

    invoke-virtual {p2, v7, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IXiOXO:I

    iget v4, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->i11I:I

    int-to-float v4, v4

    const v7, 0x3fa66666    # 1.3f

    mul-float/2addr v4, v7

    float-to-int v4, v4

    const/16 v8, 0x21

    invoke-virtual {p2, v8, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->I0XXi0X:I

    iget v4, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->i11I:I

    int-to-float v4, v4

    mul-float/2addr v4, v7

    float-to-int v4, v4

    const/16 v7, 0x22

    invoke-virtual {p2, v7, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IOi1O0:I

    const/16 v4, 0x1b

    invoke-virtual {p2, v4, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    iput-boolean v4, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IXI:Z

    const/16 v4, 0x19

    invoke-virtual {p2, v4, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    iput-boolean v4, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X00O0:Z

    const/16 v4, 0x1a

    invoke-virtual {p2, v4, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    iput-boolean v4, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X111IO:Z

    const/16 v4, 0x23

    invoke-virtual {p2, v4}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Ii1iii0:Ljava/lang/String;

    if-nez v4, :cond_0

    const v4, 0x7f1411cb

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Ii1iii0:Ljava/lang/String;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_2

    :cond_0
    :goto_0
    const/16 v4, 0xd

    invoke-virtual {p2, v4}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IO0II0i:Ljava/lang/String;

    if-nez v4, :cond_1

    const v4, 0x7f1411ca

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IO0II0i:Ljava/lang/String;

    :cond_1
    const/16 v0, 0xe

    invoke-virtual {p2, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iIi0:Z

    const/16 v0, 0x13

    invoke-virtual {p2, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->O101:Z

    const/16 v0, 0x1c

    invoke-virtual {p2, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iOX:Z

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v4, 0x7f0606e3

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    const/16 v4, 0x25

    invoke-virtual {p2, v4, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XIIO11I:I

    iget v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iOI:I

    const/16 v4, 0x9

    invoke-virtual {p2, v4, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iOI:I

    const/16 v4, 0xb

    invoke-virtual {p2, v4, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IX1XiI:I

    const/4 v0, 0x7

    const/high16 v4, 0x10000

    invoke-virtual {p2, v0, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XXiO0i:I

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v4, 0x7f0606df

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    const/16 v4, 0x10

    invoke-virtual {p2, v4, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v7, 0x7f0606de

    invoke-virtual {v4, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    const/16 v7, 0xf

    invoke-virtual {p2, v7, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v4

    iget-object v7, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IO:[I

    aput v0, v7, v2

    aput v4, v7, v6

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v4, 0x7f0606e1

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    const/16 v4, 0x15

    invoke-virtual {p2, v4, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v7, 0x7f0606e0

    invoke-virtual {v4, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    const/16 v7, 0x14

    invoke-virtual {p2, v7, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v4

    iget-object v7, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->I1:[I

    aput v0, v7, v2

    aput v4, v7, v6

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v4, 0x7f0606e2

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    const/16 v4, 0x24

    invoke-virtual {p2, v4, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iXiX011:I

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v0, 0x7f0606dd

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    const/16 v0, 0xc

    invoke-virtual {p2, v0, p1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->OO:I

    const/16 p1, 0x1d

    invoke-virtual {p2, p1, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IiiXiI0I:I

    const/16 p1, 0x1e

    invoke-virtual {p2, p1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XOIX:I

    const/16 p1, 0x17

    invoke-virtual {p2, p1, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XXI0XOIX:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    iget p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->i100IXOX:I

    if-ne p1, v3, :cond_2

    iget p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iIi1:I

    if-ne p1, v5, :cond_3

    :cond_2
    iput-boolean v6, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->O1:Z

    :cond_3
    iget-boolean p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->O1:Z

    if-eqz p1, :cond_5

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    iget p2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->i100IXOX:I

    invoke-static {p1, p2}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XXOXi:Landroid/graphics/Bitmap;

    iget p2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iIi1:I

    if-ne p2, v6, :cond_4

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->I0XXi0X:I

    iget-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XXOXi:Landroid/graphics/Bitmap;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IOi1O0:I

    goto :goto_1

    :cond_4
    if-ne p2, v1, :cond_5

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    iget p2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->i100IXOX:I

    invoke-static {p1, p2}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object p1

    iget p2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IOi1O0:I

    iget v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->I0XXi0X:I

    invoke-static {p1, p2, v0, v6}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XXOXi:Landroid/graphics/Bitmap;

    :cond_5
    :goto_1
    new-instance p1, Ljava/text/DecimalFormat;

    const-string p2, "##.####"

    invoke-direct {p1, p2}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IXOIIIO:Ljava/text/DecimalFormat;

    new-instance p1, Landroid/text/TextPaint;

    invoke-direct {p1, v6}, Landroid/text/TextPaint;-><init>(I)V

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiIOiX:Landroid/graphics/Paint;

    invoke-virtual {p1, v3}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiIOiX:Landroid/graphics/Paint;

    sget-object p2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    new-instance p1, Landroid/text/TextPaint;

    invoke-direct {p1, v6}, Landroid/text/TextPaint;-><init>(I)V

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->O0O0X0iOi:Landroid/text/TextPaint;

    invoke-virtual {p1, v3}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->O0O0X0iOi:Landroid/text/TextPaint;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->O0O0X0iOi:Landroid/text/TextPaint;

    iget v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Oi:I

    int-to-float v0, v0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->O0O0X0iOi:Landroid/text/TextPaint;

    iget v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IO0iXO0O:I

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    new-instance p1, Landroid/text/TextPaint;

    invoke-direct {p1, v6}, Landroid/text/TextPaint;-><init>(I)V

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X0iO:Landroid/graphics/Paint;

    const v0, -0xbbbbbc

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X0iO:Landroid/graphics/Paint;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, v6}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11iII1O1:Landroid/graphics/Paint;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11iII1O1:Landroid/graphics/Paint;

    invoke-virtual {p1, v6}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, v6}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XXX11i:Landroid/graphics/Paint;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XXX11i:Landroid/graphics/Paint;

    invoke-virtual {p1, v6}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, v6}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X1IX:Landroid/graphics/Paint;

    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X1IX:Landroid/graphics/Paint;

    iget v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IXiOXO:I

    int-to-float v0, v0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X1IX:Landroid/graphics/Paint;

    iget v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XIIO11I:I

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X1IX:Landroid/graphics/Paint;

    invoke-virtual {p1, v6}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, v6}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XXiIiX10:Landroid/graphics/Paint;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XXiIiX10:Landroid/graphics/Paint;

    invoke-virtual {p1, v6}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, v6}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X1:Landroid/graphics/Paint;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X1:Landroid/graphics/Paint;

    invoke-virtual {p1, v6}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, v6}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X00Xi1X:Landroid/graphics/Paint;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iX1O1:Landroid/graphics/RectF;

    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11I:Landroid/graphics/Rect;

    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->I0:Landroid/graphics/Rect;

    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iI0I:Landroid/graphics/Path;

    sget-object p2, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    invoke-virtual {p1, p2}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iIX0i:Landroid/graphics/Path;

    new-instance p1, Landroid/graphics/Point;

    invoke-direct {p1}, Landroid/graphics/Point;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X1OI:Landroid/graphics/Point;

    new-instance p1, Landroid/graphics/Point;

    invoke-direct {p1}, Landroid/graphics/Point;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Xii:Landroid/graphics/Point;

    new-instance p1, Landroid/graphics/Point;

    invoke-direct {p1}, Landroid/graphics/Point;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiII:Landroid/graphics/Point;

    iget p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iIi1:I

    if-eq p1, v6, :cond_6

    if-ne p1, v5, :cond_7

    :cond_6
    iput v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XOX0O0:I

    iput v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X0i1O:I

    :cond_7
    iget-boolean p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X111IO:Z

    if-nez p1, :cond_8

    iput v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Xii11I:I

    :cond_8
    return-void

    :goto_2
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    throw p1
.end method

.method public final iOO1ii1(Landroid/graphics/Canvas;Lcom/android/mltcode/paycertificationapi/iz3;IIF)V
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

    const/4 v11, 0x1

    if-nez v10, :cond_0

    move v8, v11

    goto :goto_0

    :cond_0
    const/4 v8, 0x0

    :goto_0
    add-int/lit8 v3, p4, -0x1

    if-ne v10, v3, :cond_1

    move v9, v11

    goto :goto_1

    :cond_1
    const/4 v9, 0x0

    :goto_1
    if-eqz v8, :cond_2

    if-eqz v9, :cond_2

    move v6, v11

    goto :goto_2

    :cond_2
    const/4 v6, 0x0

    :goto_2
    iget v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XXI0XOIX:I

    if-nez v3, :cond_4

    invoke-virtual/range {p2 .. p2}, Lcom/android/mltcode/paycertificationapi/iz3;->XO0O10()F

    move-result v3

    invoke-virtual/range {p2 .. p2}, Lcom/android/mltcode/paycertificationapi/iz3;->O00()F

    move-result v4

    sub-float/2addr v3, v4

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getContentWidth()I

    move-result v4

    int-to-float v4, v4

    mul-float/2addr v4, v3

    div-float v4, v4, p5

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getContentWidth()I

    move-result v3

    int-to-float v3, v3

    div-float v3, v3, p5

    invoke-virtual/range {p2 .. p2}, Lcom/android/mltcode/paycertificationapi/iz3;->O00()F

    move-result v5

    mul-float/2addr v3, v5

    if-nez v8, :cond_3

    iget v5, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X00XIX1:I

    int-to-float v5, v5

    add-float/2addr v3, v5

    :cond_3
    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getContentWidth()I

    move-result v5

    int-to-float v5, v5

    div-float v5, v5, p5

    invoke-virtual/range {p2 .. p2}, Lcom/android/mltcode/paycertificationapi/iz3;->XO0O10()F

    move-result v7

    mul-float/2addr v5, v7

    if-nez v8, :cond_6

    iget-boolean v7, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iIi0:Z

    if-eqz v7, :cond_6

    new-instance v7, Landroid/graphics/RectF;

    invoke-direct {v7}, Landroid/graphics/RectF;-><init>()V

    iget-object v12, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X00Xi1X:Landroid/graphics/Paint;

    iget v13, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->i0X000X0O:I

    invoke-virtual {v12, v13}, Landroid/graphics/Paint;->setColor(I)V

    float-to-int v12, v3

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v13

    add-int/2addr v13, v12

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getXLeft()I

    move-result v14

    add-int/2addr v13, v14

    int-to-float v13, v13

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11I()I

    move-result v14

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v15

    add-int/2addr v14, v15

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X01IiOiIi()I

    move-result v15

    add-int/2addr v14, v15

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getXtop()I

    move-result v15

    add-int/2addr v14, v15

    int-to-float v14, v14

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v15

    add-int/2addr v12, v15

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getXLeft()I

    move-result v15

    add-int/2addr v12, v15

    iget v15, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X00XIX1:I

    add-int/2addr v12, v15

    int-to-float v12, v12

    iget v15, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->i11I:I

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11I()I

    move-result v16

    add-int v15, v15, v16

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X01IiOiIi()I

    move-result v16

    add-int v15, v15, v16

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v16

    add-int v15, v15, v16

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getXtop()I

    move-result v16

    add-int v15, v15, v16

    int-to-float v15, v15

    invoke-virtual {v7, v13, v14, v12, v15}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v12, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X00Xi1X:Landroid/graphics/Paint;

    invoke-virtual {v1, v7, v12}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    goto/16 :goto_3

    :cond_4
    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getContentWidth()I

    move-result v3

    iget v4, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X00XIX1:I

    add-int/2addr v3, v4

    div-int v3, v3, p4

    sub-int/2addr v3, v4

    int-to-float v3, v3

    int-to-float v4, v4

    add-float/2addr v4, v3

    int-to-float v5, v10

    mul-float/2addr v4, v5

    add-float v5, v4, v3

    if-nez v8, :cond_5

    iget-boolean v7, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iIi0:Z

    if-eqz v7, :cond_5

    new-instance v7, Landroid/graphics/RectF;

    invoke-direct {v7}, Landroid/graphics/RectF;-><init>()V

    iget-object v12, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X00Xi1X:Landroid/graphics/Paint;

    iget v13, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->i0X000X0O:I

    invoke-virtual {v12, v13}, Landroid/graphics/Paint;->setColor(I)V

    float-to-int v12, v4

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v13

    add-int/2addr v13, v12

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getXLeft()I

    move-result v14

    add-int/2addr v13, v14

    int-to-float v13, v13

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11I()I

    move-result v14

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v15

    add-int/2addr v14, v15

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X01IiOiIi()I

    move-result v15

    add-int/2addr v14, v15

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getXtop()I

    move-result v15

    add-int/2addr v14, v15

    int-to-float v14, v14

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v15

    add-int/2addr v12, v15

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getXLeft()I

    move-result v15

    add-int/2addr v12, v15

    iget v15, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X00XIX1:I

    add-int/2addr v12, v15

    int-to-float v12, v12

    iget v15, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->i11I:I

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11I()I

    move-result v16

    add-int v15, v15, v16

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X01IiOiIi()I

    move-result v16

    add-int v15, v15, v16

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v16

    add-int v15, v15, v16

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getXtop()I

    move-result v16

    add-int v15, v15, v16

    int-to-float v15, v15

    invoke-virtual {v7, v13, v14, v12, v15}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v12, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X00Xi1X:Landroid/graphics/Paint;

    invoke-virtual {v1, v7, v12}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    :cond_5
    move/from16 v18, v4

    move v4, v3

    move/from16 v3, v18

    :cond_6
    :goto_3
    iget-object v7, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    float-to-int v12, v3

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v13

    add-int/2addr v13, v12

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getXLeft()I

    move-result v14

    add-int/2addr v13, v14

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11I()I

    move-result v14

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X01IiOiIi()I

    move-result v15

    add-int/2addr v14, v15

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v15

    add-int/2addr v14, v15

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getXtop()I

    move-result v15

    add-int/2addr v14, v15

    float-to-int v5, v5

    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    move-result v15

    add-int/2addr v15, v5

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getXLeft()I

    move-result v16

    add-int v15, v15, v16

    iget v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->i11I:I

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11I()I

    move-result v17

    add-int v2, v2, v17

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X01IiOiIi()I

    move-result v17

    add-int v2, v2, v17

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v17

    add-int v2, v2, v17

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getXtop()I

    move-result v17

    add-int v2, v2, v17

    invoke-virtual {v7, v13, v14, v15, v2}, Landroid/graphics/Rect;->set(IIII)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iXiiiO:Ljava/lang/Integer;

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, v10, :cond_7

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v3, v2

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v4, v2

    add-float/2addr v3, v4

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getXLeft()I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v3, v2

    iput v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XX1Oi:F

    invoke-virtual/range {p2 .. p2}, Lcom/android/mltcode/paycertificationapi/iz3;->OXO1()I

    move-result v2

    iput v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->OX110i:I

    :goto_4
    move/from16 v16, v11

    goto :goto_5

    :cond_7
    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->O001I:Ljava/lang/Float;

    if-eqz v2, :cond_a

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    invoke-virtual/range {p2 .. p2}, Lcom/android/mltcode/paycertificationapi/iz3;->O00()F

    move-result v7

    cmpl-float v2, v2, v7

    if-ltz v2, :cond_8

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->O001I:Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    invoke-virtual/range {p2 .. p2}, Lcom/android/mltcode/paycertificationapi/iz3;->XO0O10()F

    move-result v7

    cmpg-float v2, v2, v7

    if-ltz v2, :cond_9

    :cond_8
    if-eqz v9, :cond_a

    invoke-virtual/range {p2 .. p2}, Lcom/android/mltcode/paycertificationapi/iz3;->XO0O10()F

    move-result v2

    iget-object v7, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->O001I:Ljava/lang/Float;

    invoke-virtual {v7}, Ljava/lang/Float;->floatValue()F

    move-result v7

    cmpl-float v2, v2, v7

    if-nez v2, :cond_a

    :cond_9
    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->O001I:Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    invoke-virtual/range {p2 .. p2}, Lcom/android/mltcode/paycertificationapi/iz3;->O00()F

    move-result v7

    sub-float/2addr v2, v7

    invoke-virtual/range {p2 .. p2}, Lcom/android/mltcode/paycertificationapi/iz3;->XO0O10()F

    move-result v7

    invoke-virtual/range {p2 .. p2}, Lcom/android/mltcode/paycertificationapi/iz3;->O00()F

    move-result v13

    sub-float/2addr v7, v13

    div-float/2addr v2, v7

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v7

    int-to-float v7, v7

    add-float/2addr v3, v7

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getXLeft()I

    move-result v7

    int-to-float v7, v7

    add-float/2addr v3, v7

    mul-float/2addr v2, v4

    add-float/2addr v3, v2

    float-to-int v2, v3

    int-to-float v2, v2

    iput v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XX1Oi:F

    invoke-virtual/range {p2 .. p2}, Lcom/android/mltcode/paycertificationapi/iz3;->OXO1()I

    move-result v2

    iput v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->OX110i:I

    goto :goto_4

    :cond_a
    const/16 v16, 0x0

    :goto_5
    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11iII1O1:Landroid/graphics/Paint;

    invoke-virtual/range {p2 .. p2}, Lcom/android/mltcode/paycertificationapi/iz3;->OXO1()I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->I0:Landroid/graphics/Rect;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    invoke-virtual {v2, v3}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    iget v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Ii0i:I

    const/4 v3, 0x2

    if-nez v2, :cond_b

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v2

    div-int/2addr v2, v3

    iput v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Ii0i:I

    :cond_b
    if-nez v8, :cond_e

    if-eqz v9, :cond_c

    goto :goto_6

    :cond_c
    iget v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IiiXiI0I:I

    if-nez v2, :cond_d

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iX1O1:Landroid/graphics/RectF;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->left:I

    int-to-float v4, v4

    iget v5, v3, Landroid/graphics/Rect;->top:I

    int-to-float v5, v5

    iget v7, v3, Landroid/graphics/Rect;->right:I

    int-to-float v7, v7

    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    int-to-float v3, v3

    invoke-virtual {v2, v4, v5, v7, v3}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iX1O1:Landroid/graphics/RectF;

    iget v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Ii0i:I

    int-to-float v4, v3

    int-to-float v3, v3

    iget-object v5, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11iII1O1:Landroid/graphics/Paint;

    invoke-virtual {v1, v2, v4, v3, v5}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    goto/16 :goto_7

    :cond_d
    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11iII1O1:Landroid/graphics/Paint;

    invoke-virtual {v1, v2, v3}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    goto/16 :goto_7

    :cond_e
    :goto_6
    iget v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IiiXiI0I:I

    if-eqz v2, :cond_14

    if-eq v2, v11, :cond_12

    if-eq v2, v3, :cond_f

    goto/16 :goto_7

    :cond_f
    if-eqz v6, :cond_10

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Ii0i:I

    add-int/2addr v12, v3

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    add-int/2addr v12, v3

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getXLeft()I

    move-result v3

    add-int/2addr v12, v3

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11I()I

    move-result v3

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X01IiOiIi()I

    move-result v4

    add-int/2addr v3, v4

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    add-int/2addr v3, v4

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getXtop()I

    move-result v4

    add-int/2addr v3, v4

    iget v4, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Ii0i:I

    sub-int/2addr v5, v4

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v4

    add-int/2addr v5, v4

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getXLeft()I

    move-result v4

    add-int/2addr v5, v4

    iget v4, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->i11I:I

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11I()I

    move-result v7

    add-int/2addr v4, v7

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v7

    add-int/2addr v4, v7

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X01IiOiIi()I

    move-result v7

    add-int/2addr v4, v7

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getXtop()I

    move-result v7

    add-int/2addr v4, v7

    invoke-virtual {v2, v12, v3, v5, v4}, Landroid/graphics/Rect;->set(IIII)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11iII1O1:Landroid/graphics/Paint;

    invoke-virtual {v1, v2, v3}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X1OI:Landroid/graphics/Point;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->left:I

    iget v5, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Ii0i:I

    sub-int/2addr v4, v5

    iget v3, v3, Landroid/graphics/Rect;->top:I

    add-int/2addr v3, v5

    invoke-virtual {v2, v4, v3}, Landroid/graphics/Point;->set(II)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Xii:Landroid/graphics/Point;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->left:I

    iget v3, v3, Landroid/graphics/Rect;->top:I

    invoke-virtual {v2, v4, v3}, Landroid/graphics/Point;->set(II)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiII:Landroid/graphics/Point;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->left:I

    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {v2, v4, v3}, Landroid/graphics/Point;->set(II)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X1OI:Landroid/graphics/Point;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Xii:Landroid/graphics/Point;

    iget-object v4, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiII:Landroid/graphics/Point;

    iget-object v5, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11iII1O1:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11iII1O1(Landroid/graphics/Canvas;Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Paint;)V

    iget-object v1, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X1OI:Landroid/graphics/Point;

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget v3, v2, Landroid/graphics/Rect;->right:I

    iget v4, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Ii0i:I

    add-int/2addr v3, v4

    iget v2, v2, Landroid/graphics/Rect;->top:I

    add-int/2addr v2, v4

    invoke-virtual {v1, v3, v2}, Landroid/graphics/Point;->set(II)V

    iget-object v1, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Xii:Landroid/graphics/Point;

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget v3, v2, Landroid/graphics/Rect;->right:I

    iget v2, v2, Landroid/graphics/Rect;->top:I

    invoke-virtual {v1, v3, v2}, Landroid/graphics/Point;->set(II)V

    iget-object v1, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiII:Landroid/graphics/Point;

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget v3, v2, Landroid/graphics/Rect;->right:I

    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {v1, v3, v2}, Landroid/graphics/Point;->set(II)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X1OI:Landroid/graphics/Point;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Xii:Landroid/graphics/Point;

    iget-object v4, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiII:Landroid/graphics/Point;

    iget-object v5, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11iII1O1:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    invoke-virtual/range {v0 .. v5}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11iII1O1(Landroid/graphics/Canvas;Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Paint;)V

    goto/16 :goto_7

    :cond_10
    if-eqz v8, :cond_11

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Ii0i:I

    add-int/2addr v12, v3

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    add-int/2addr v12, v3

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getXLeft()I

    move-result v3

    add-int/2addr v12, v3

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11I()I

    move-result v3

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X01IiOiIi()I

    move-result v4

    add-int/2addr v3, v4

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    add-int/2addr v3, v4

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getXtop()I

    move-result v4

    add-int/2addr v3, v4

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v4

    add-int/2addr v5, v4

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getXLeft()I

    move-result v4

    add-int/2addr v5, v4

    iget v4, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->i11I:I

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11I()I

    move-result v7

    add-int/2addr v4, v7

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X01IiOiIi()I

    move-result v7

    add-int/2addr v4, v7

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v7

    add-int/2addr v4, v7

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getXtop()I

    move-result v7

    add-int/2addr v4, v7

    invoke-virtual {v2, v12, v3, v5, v4}, Landroid/graphics/Rect;->set(IIII)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11iII1O1:Landroid/graphics/Paint;

    invoke-virtual {v1, v2, v3}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X1OI:Landroid/graphics/Point;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->left:I

    iget v5, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Ii0i:I

    sub-int/2addr v4, v5

    iget v3, v3, Landroid/graphics/Rect;->top:I

    add-int/2addr v3, v5

    invoke-virtual {v2, v4, v3}, Landroid/graphics/Point;->set(II)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Xii:Landroid/graphics/Point;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->left:I

    iget v3, v3, Landroid/graphics/Rect;->top:I

    invoke-virtual {v2, v4, v3}, Landroid/graphics/Point;->set(II)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiII:Landroid/graphics/Point;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->left:I

    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {v2, v4, v3}, Landroid/graphics/Point;->set(II)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X1OI:Landroid/graphics/Point;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Xii:Landroid/graphics/Point;

    iget-object v4, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiII:Landroid/graphics/Point;

    iget-object v5, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11iII1O1:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11iII1O1(Landroid/graphics/Canvas;Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Paint;)V

    goto/16 :goto_7

    :cond_11
    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    add-int/2addr v12, v3

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getXLeft()I

    move-result v3

    add-int/2addr v12, v3

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11I()I

    move-result v3

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X01IiOiIi()I

    move-result v4

    add-int/2addr v3, v4

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    add-int/2addr v3, v4

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getXtop()I

    move-result v4

    add-int/2addr v3, v4

    iget v4, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Ii0i:I

    sub-int/2addr v5, v4

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v4

    add-int/2addr v5, v4

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getXLeft()I

    move-result v4

    add-int/2addr v5, v4

    iget v4, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->i11I:I

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11I()I

    move-result v7

    add-int/2addr v4, v7

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X01IiOiIi()I

    move-result v7

    add-int/2addr v4, v7

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v7

    add-int/2addr v4, v7

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getXtop()I

    move-result v7

    add-int/2addr v4, v7

    invoke-virtual {v2, v12, v3, v5, v4}, Landroid/graphics/Rect;->set(IIII)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11iII1O1:Landroid/graphics/Paint;

    invoke-virtual {v1, v2, v3}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X1OI:Landroid/graphics/Point;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->right:I

    iget v5, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Ii0i:I

    add-int/2addr v4, v5

    iget v3, v3, Landroid/graphics/Rect;->top:I

    add-int/2addr v3, v5

    invoke-virtual {v2, v4, v3}, Landroid/graphics/Point;->set(II)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Xii:Landroid/graphics/Point;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->right:I

    iget v3, v3, Landroid/graphics/Rect;->top:I

    invoke-virtual {v2, v4, v3}, Landroid/graphics/Point;->set(II)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiII:Landroid/graphics/Point;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->right:I

    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {v2, v4, v3}, Landroid/graphics/Point;->set(II)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X1OI:Landroid/graphics/Point;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Xii:Landroid/graphics/Point;

    iget-object v4, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiII:Landroid/graphics/Point;

    iget-object v5, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11iII1O1:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11iII1O1(Landroid/graphics/Canvas;Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Paint;)V

    goto/16 :goto_7

    :cond_12
    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iX1O1:Landroid/graphics/RectF;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->left:I

    int-to-float v4, v4

    iget v7, v3, Landroid/graphics/Rect;->top:I

    int-to-float v7, v7

    iget v13, v3, Landroid/graphics/Rect;->right:I

    int-to-float v13, v13

    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    int-to-float v3, v3

    invoke-virtual {v2, v4, v7, v13, v3}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iX1O1:Landroid/graphics/RectF;

    iget v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Ii0i:I

    int-to-float v4, v3

    int-to-float v3, v3

    iget-object v7, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11iII1O1:Landroid/graphics/Paint;

    invoke-virtual {v1, v2, v4, v3, v7}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    if-nez v6, :cond_15

    if-eqz v8, :cond_13

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Ii0i:I

    add-int/2addr v12, v3

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    add-int/2addr v12, v3

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getXLeft()I

    move-result v3

    add-int/2addr v12, v3

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11I()I

    move-result v3

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X01IiOiIi()I

    move-result v4

    add-int/2addr v3, v4

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    add-int/2addr v3, v4

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getXtop()I

    move-result v4

    add-int/2addr v3, v4

    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    move-result v4

    add-int/2addr v5, v4

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getXLeft()I

    move-result v4

    add-int/2addr v5, v4

    iget v4, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->i11I:I

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11I()I

    move-result v7

    add-int/2addr v4, v7

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X01IiOiIi()I

    move-result v7

    add-int/2addr v4, v7

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v7

    add-int/2addr v4, v7

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getXtop()I

    move-result v7

    add-int/2addr v4, v7

    invoke-virtual {v2, v12, v3, v5, v4}, Landroid/graphics/Rect;->set(IIII)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11iII1O1:Landroid/graphics/Paint;

    invoke-virtual {v1, v2, v3}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    goto :goto_7

    :cond_13
    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    add-int/2addr v12, v3

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getXLeft()I

    move-result v3

    add-int/2addr v12, v3

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11I()I

    move-result v3

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X01IiOiIi()I

    move-result v4

    add-int/2addr v3, v4

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    add-int/2addr v3, v4

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getXtop()I

    move-result v4

    add-int/2addr v3, v4

    iget v4, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Ii0i:I

    sub-int/2addr v5, v4

    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    move-result v4

    add-int/2addr v5, v4

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getXLeft()I

    move-result v4

    add-int/2addr v5, v4

    iget v4, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->i11I:I

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11I()I

    move-result v7

    add-int/2addr v4, v7

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X01IiOiIi()I

    move-result v7

    add-int/2addr v4, v7

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v7

    add-int/2addr v4, v7

    invoke-direct {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getXtop()I

    move-result v7

    add-int/2addr v4, v7

    invoke-virtual {v2, v12, v3, v5, v4}, Landroid/graphics/Rect;->set(IIII)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11iII1O1:Landroid/graphics/Paint;

    invoke-virtual {v1, v2, v3}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    goto :goto_7

    :cond_14
    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iX1O1:Landroid/graphics/RectF;

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->left:I

    int-to-float v4, v4

    iget v5, v3, Landroid/graphics/Rect;->top:I

    int-to-float v5, v5

    iget v7, v3, Landroid/graphics/Rect;->right:I

    int-to-float v7, v7

    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    int-to-float v3, v3

    invoke-virtual {v2, v4, v5, v7, v3}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iX1O1:Landroid/graphics/RectF;

    iget v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Ii0i:I

    int-to-float v4, v3

    int-to-float v3, v3

    iget-object v5, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11iII1O1:Landroid/graphics/Paint;

    invoke-virtual {v1, v2, v4, v3, v5}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    :cond_15
    :goto_7
    iget-boolean v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IXI:Z

    if-eqz v2, :cond_1c

    invoke-virtual/range {p2 .. p2}, Lcom/android/mltcode/paycertificationapi/iz3;->XIi00iiXO()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_16

    invoke-virtual/range {p2 .. p2}, Lcom/android/mltcode/paycertificationapi/iz3;->XIi00iiXO()Ljava/lang/String;

    move-result-object v2

    goto/16 :goto_a

    :cond_16
    const-string v2, "%s - %s"

    if-nez v8, :cond_18

    if-eqz v9, :cond_17

    goto :goto_8

    :cond_17
    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IXOIIIO:Ljava/text/DecimalFormat;

    invoke-virtual/range {p2 .. p2}, Lcom/android/mltcode/paycertificationapi/iz3;->O00()F

    move-result v4

    float-to-double v4, v4

    invoke-virtual {v3, v4, v5}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v3

    iget-object v4, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IXOIIIO:Ljava/text/DecimalFormat;

    invoke-virtual/range {p2 .. p2}, Lcom/android/mltcode/paycertificationapi/iz3;->XO0O10()F

    move-result v5

    float-to-double v5, v5

    invoke-virtual {v4, v5, v6}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v4

    filled-new-array {v3, v4}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    goto :goto_a

    :cond_18
    :goto_8
    if-nez v6, :cond_1b

    iget v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XOIX:I

    if-ne v3, v11, :cond_19

    goto :goto_9

    :cond_19
    if-eqz v8, :cond_1a

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IXOIIIO:Ljava/text/DecimalFormat;

    invoke-virtual/range {p2 .. p2}, Lcom/android/mltcode/paycertificationapi/iz3;->XO0O10()F

    move-result v3

    float-to-double v3, v3

    invoke-virtual {v2, v3, v4}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const-string v3, "<%s"

    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    goto :goto_a

    :cond_1a
    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IXOIIIO:Ljava/text/DecimalFormat;

    invoke-virtual/range {p2 .. p2}, Lcom/android/mltcode/paycertificationapi/iz3;->O00()F

    move-result v3

    float-to-double v3, v3

    invoke-virtual {v2, v3, v4}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const-string v3, ">%s"

    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    goto :goto_a

    :cond_1b
    :goto_9
    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IXOIIIO:Ljava/text/DecimalFormat;

    invoke-virtual/range {p2 .. p2}, Lcom/android/mltcode/paycertificationapi/iz3;->O00()F

    move-result v4

    float-to-double v4, v4

    invoke-virtual {v3, v4, v5}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v3

    iget-object v4, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IXOIIIO:Ljava/text/DecimalFormat;

    invoke-virtual/range {p2 .. p2}, Lcom/android/mltcode/paycertificationapi/iz3;->XO0O10()F

    move-result v5

    float-to-double v5, v5

    invoke-virtual {v4, v5, v6}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v4

    filled-new-array {v3, v4}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    :goto_a
    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiIOiX:Landroid/graphics/Paint;

    iget v4, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XOXiX0:I

    int-to-float v4, v4

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiIOiX:Landroid/graphics/Paint;

    iget v4, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XOO0XOOii:I

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiIOiX:Landroid/graphics/Paint;

    iget-object v4, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->I0:Landroid/graphics/Rect;

    invoke-virtual {v0, v1, v3, v2, v4}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XXIIO1i11(Landroid/graphics/Canvas;Landroid/graphics/Paint;Ljava/lang/String;Landroid/graphics/Rect;)V

    :cond_1c
    iget-boolean v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X00O0:Z

    const/high16 v12, 0x10000

    const/4 v13, -0x1

    if-eqz v2, :cond_23

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X0iO:Landroid/graphics/Paint;

    if-eqz v16, :cond_1d

    iget v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IX0IXOi:I

    if-nez v3, :cond_1d

    iget v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Xi1i0XOX0:I

    if-ne v3, v13, :cond_1e

    :cond_1d
    iget v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->O0O:I

    :cond_1e
    int-to-float v3, v3

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X0iO:Landroid/graphics/Paint;

    if-eqz v16, :cond_1f

    iget v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IX0IXOi:I

    if-nez v3, :cond_1f

    iget v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XXiO0i:I

    if-ne v3, v12, :cond_20

    :cond_1f
    iget v3, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iOI:I

    :cond_20
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    iget v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IX0IXOi:I

    if-eqz v2, :cond_22

    if-eq v2, v11, :cond_21

    goto :goto_b

    :cond_21
    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X0iO:Landroid/graphics/Paint;

    invoke-virtual/range {p2 .. p2}, Lcom/android/mltcode/paycertificationapi/iz3;->iO()Ljava/lang/String;

    move-result-object v3

    iget-object v4, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->I0:Landroid/graphics/Rect;

    iget v5, v4, Landroid/graphics/Rect;->left:I

    int-to-float v5, v5

    iget v6, v4, Landroid/graphics/Rect;->bottom:I

    move v7, v5

    int-to-float v5, v6

    iget v4, v4, Landroid/graphics/Rect;->right:I

    int-to-float v4, v4

    iget v14, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iii0:I

    add-int/2addr v6, v14

    int-to-float v6, v6

    move/from16 v18, v6

    move v6, v4

    move v4, v7

    move/from16 v7, v18

    invoke-virtual/range {v0 .. v10}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iX1O1(Landroid/graphics/Canvas;Landroid/graphics/Paint;Ljava/lang/String;FFFFZZI)V

    goto :goto_b

    :cond_22
    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X0iO:Landroid/graphics/Paint;

    invoke-virtual/range {p2 .. p2}, Lcom/android/mltcode/paycertificationapi/iz3;->iO()Ljava/lang/String;

    move-result-object v3

    iget-object v1, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->I0:Landroid/graphics/Rect;

    iget v4, v1, Landroid/graphics/Rect;->left:I

    int-to-float v4, v4

    iget v5, v1, Landroid/graphics/Rect;->bottom:I

    move v6, v5

    int-to-float v5, v6

    iget v1, v1, Landroid/graphics/Rect;->right:I

    int-to-float v1, v1

    iget v7, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iii0:I

    add-int/2addr v6, v7

    int-to-float v7, v6

    move v6, v1

    move-object/from16 v1, p1

    invoke-virtual/range {v0 .. v7}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iI(Landroid/graphics/Canvas;Landroid/graphics/Paint;Ljava/lang/String;FFFF)V

    :cond_23
    :goto_b
    iget-boolean v1, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X111IO:Z

    if-eqz v1, :cond_2a

    iget-object v1, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X0iO:Landroid/graphics/Paint;

    if-eqz v16, :cond_24

    iget v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iXi:I

    if-nez v2, :cond_24

    iget v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Xi1i0XOX0:I

    if-ne v2, v13, :cond_25

    :cond_24
    iget v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->O0O:I

    :cond_25
    int-to-float v2, v2

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-object v1, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X0iO:Landroid/graphics/Paint;

    if-eqz v16, :cond_26

    iget v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iXi:I

    if-nez v2, :cond_26

    iget v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XXiO0i:I

    if-ne v2, v12, :cond_27

    :cond_26
    iget v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IX1XiI:I

    :cond_27
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    iget v1, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iXi:I

    if-eqz v1, :cond_29

    if-eq v1, v11, :cond_28

    goto :goto_c

    :cond_28
    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X0iO:Landroid/graphics/Paint;

    invoke-virtual/range {p2 .. p2}, Lcom/android/mltcode/paycertificationapi/iz3;->XOO0ii0()Ljava/lang/String;

    move-result-object v3

    iget-object v1, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->I0:Landroid/graphics/Rect;

    iget v4, v1, Landroid/graphics/Rect;->left:I

    int-to-float v4, v4

    iget v1, v1, Landroid/graphics/Rect;->top:I

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X01IiOiIi()I

    move-result v5

    sub-int/2addr v1, v5

    int-to-float v5, v1

    iget-object v1, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->I0:Landroid/graphics/Rect;

    iget v6, v1, Landroid/graphics/Rect;->right:I

    int-to-float v6, v6

    iget v1, v1, Landroid/graphics/Rect;->top:I

    int-to-float v7, v1

    move-object/from16 v1, p1

    move/from16 v10, p3

    invoke-virtual/range {v0 .. v10}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iX1O1(Landroid/graphics/Canvas;Landroid/graphics/Paint;Ljava/lang/String;FFFFZZI)V

    return-void

    :cond_29
    iget-object v2, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X0iO:Landroid/graphics/Paint;

    invoke-virtual/range {p2 .. p2}, Lcom/android/mltcode/paycertificationapi/iz3;->XOO0ii0()Ljava/lang/String;

    move-result-object v3

    iget-object v1, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->I0:Landroid/graphics/Rect;

    iget v4, v1, Landroid/graphics/Rect;->left:I

    int-to-float v4, v4

    iget v1, v1, Landroid/graphics/Rect;->top:I

    invoke-virtual {v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X01IiOiIi()I

    move-result v5

    sub-int/2addr v1, v5

    int-to-float v5, v1

    iget-object v1, v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->I0:Landroid/graphics/Rect;

    iget v6, v1, Landroid/graphics/Rect;->right:I

    int-to-float v6, v6

    iget v1, v1, Landroid/graphics/Rect;->top:I

    int-to-float v7, v1

    move-object/from16 v1, p1

    invoke-virtual/range {v0 .. v7}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iI(Landroid/graphics/Canvas;Landroid/graphics/Paint;Ljava/lang/String;FFFF)V

    :cond_2a
    :goto_c
    return-void
.end method

.method public final iOOX010X()V
    .locals 9

    invoke-virtual {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XX00i10X:Landroid/text/StaticLayout;

    return-void

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->O001I:Ljava/lang/Float;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IXOIIIO:Ljava/text/DecimalFormat;

    invoke-virtual {v1, v0}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Ii1iii0:Ljava/lang/String;

    :goto_0
    iget-object v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->O001I:Ljava/lang/Float;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Ii0X0X:Ljava/lang/String;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Ii0X0X:Ljava/lang/String;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v2, " <small>%s</small>"

    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_2
    iget-object v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XXO:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XXO:Ljava/lang/String;

    :cond_3
    invoke-static {v0}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v2

    new-instance v1, Landroid/text/StaticLayout;

    iget-object v3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->O0O0X0iOi:Landroid/text/TextPaint;

    iget v4, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iIXi1iiXI:I

    sget-object v5, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-direct/range {v1 .. v8}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    iput-object v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XX00i10X:Landroid/text/StaticLayout;

    return-void
.end method

.method public final iX(Landroid/graphics/Canvas;)V
    .locals 9
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "canvas"
        }
    .end annotation

    invoke-direct {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getContentWidth()I

    move-result v2

    int-to-float v2, v2

    iget-object v3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v4

    invoke-virtual {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11I()I

    move-result v5

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v6

    add-int/2addr v5, v6

    invoke-virtual {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X01IiOiIi()I

    move-result v6

    add-int/2addr v5, v6

    invoke-direct {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getXtop()I

    move-result v6

    add-int/2addr v5, v6

    float-to-int v6, v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v7

    add-int/2addr v6, v7

    iget v7, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->i11I:I

    invoke-virtual {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11I()I

    move-result v8

    add-int/2addr v7, v8

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v8

    add-int/2addr v7, v8

    invoke-virtual {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X01IiOiIi()I

    move-result v8

    add-int/2addr v7, v8

    invoke-direct {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getXtop()I

    move-result v8

    add-int/2addr v7, v8

    invoke-virtual {v3, v4, v5, v6, v7}, Landroid/graphics/Rect;->set(IIII)V

    iget-object v3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XXiIiX10:Landroid/graphics/Paint;

    iget v4, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->OO:I

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    move-result v3

    const/4 v4, 0x2

    div-int/2addr v3, v4

    iput v3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Ii0i:I

    int-to-float v3, v3

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v2, v5

    cmpl-float v2, v3, v2

    if-lez v2, :cond_0

    const/4 v2, 0x0

    iput v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IiiXiI0I:I

    :cond_0
    iget-object v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->I0:Landroid/graphics/Rect;

    iget-object v3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    invoke-virtual {v2, v3}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    iget v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IiiXiI0I:I

    if-eqz v2, :cond_3

    const/4 v3, 0x1

    if-eq v2, v3, :cond_2

    if-eq v2, v4, :cond_1

    goto/16 :goto_0

    :cond_1
    iget-object v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget v3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Ii0i:I

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v4

    add-int/2addr v3, v4

    invoke-virtual {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11I()I

    move-result v4

    invoke-virtual {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X01IiOiIi()I

    move-result v5

    add-int/2addr v4, v5

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v5

    add-int/2addr v4, v5

    invoke-direct {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getXtop()I

    move-result v5

    add-int/2addr v4, v5

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v5

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v6

    sub-int/2addr v5, v6

    iget v6, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Ii0i:I

    sub-int/2addr v5, v6

    iget v6, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->i11I:I

    invoke-virtual {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11I()I

    move-result v7

    add-int/2addr v6, v7

    invoke-virtual {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X01IiOiIi()I

    move-result v7

    add-int/2addr v6, v7

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v7

    add-int/2addr v6, v7

    invoke-direct {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getXtop()I

    move-result v7

    add-int/2addr v6, v7

    invoke-virtual {v2, v3, v4, v5, v6}, Landroid/graphics/Rect;->set(IIII)V

    iget-object v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget-object v3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XXiIiX10:Landroid/graphics/Paint;

    invoke-virtual {p1, v2, v3}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    iget-object v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X1OI:Landroid/graphics/Point;

    iget-object v3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->left:I

    iget v5, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Ii0i:I

    sub-int/2addr v4, v5

    iget v3, v3, Landroid/graphics/Rect;->top:I

    add-int/2addr v3, v5

    invoke-virtual {v2, v4, v3}, Landroid/graphics/Point;->set(II)V

    iget-object v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Xii:Landroid/graphics/Point;

    iget-object v3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->left:I

    iget v3, v3, Landroid/graphics/Rect;->top:I

    invoke-virtual {v2, v4, v3}, Landroid/graphics/Point;->set(II)V

    iget-object v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiII:Landroid/graphics/Point;

    iget-object v3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->left:I

    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {v2, v4, v3}, Landroid/graphics/Point;->set(II)V

    iget-object v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X1OI:Landroid/graphics/Point;

    iget-object v3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Xii:Landroid/graphics/Point;

    iget-object v4, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiII:Landroid/graphics/Point;

    iget-object v5, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XXiIiX10:Landroid/graphics/Paint;

    move-object v0, p0

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11iII1O1(Landroid/graphics/Canvas;Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Paint;)V

    iget-object v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X1OI:Landroid/graphics/Point;

    iget-object v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget v3, v2, Landroid/graphics/Rect;->right:I

    iget v4, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Ii0i:I

    add-int/2addr v3, v4

    iget v2, v2, Landroid/graphics/Rect;->top:I

    add-int/2addr v2, v4

    invoke-virtual {v1, v3, v2}, Landroid/graphics/Point;->set(II)V

    iget-object v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Xii:Landroid/graphics/Point;

    iget-object v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget v3, v2, Landroid/graphics/Rect;->right:I

    iget v2, v2, Landroid/graphics/Rect;->top:I

    invoke-virtual {v1, v3, v2}, Landroid/graphics/Point;->set(II)V

    iget-object v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiII:Landroid/graphics/Point;

    iget-object v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget v3, v2, Landroid/graphics/Rect;->right:I

    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {v1, v3, v2}, Landroid/graphics/Point;->set(II)V

    iget-object v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X1OI:Landroid/graphics/Point;

    iget-object v3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Xii:Landroid/graphics/Point;

    iget-object v4, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiII:Landroid/graphics/Point;

    iget-object v5, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XXiIiX10:Landroid/graphics/Paint;

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11iII1O1(Landroid/graphics/Canvas;Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Paint;)V

    goto :goto_0

    :cond_2
    iget-object v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iX1O1:Landroid/graphics/RectF;

    iget-object v3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->left:I

    int-to-float v4, v4

    iget v5, v3, Landroid/graphics/Rect;->top:I

    int-to-float v5, v5

    iget v6, v3, Landroid/graphics/Rect;->right:I

    int-to-float v6, v6

    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    int-to-float v3, v3

    invoke-virtual {v2, v4, v5, v6, v3}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iX1O1:Landroid/graphics/RectF;

    iget v3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Ii0i:I

    int-to-float v4, v3

    int-to-float v3, v3

    iget-object v5, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XXiIiX10:Landroid/graphics/Paint;

    invoke-virtual {p1, v2, v4, v3, v5}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    goto :goto_0

    :cond_3
    iget-object v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget-object v3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XXiIiX10:Landroid/graphics/Paint;

    invoke-virtual {p1, v2, v3}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    :goto_0
    iget-boolean v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IXI:Z

    if-eqz v2, :cond_4

    iget-object v3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IO0II0i:Ljava/lang/String;

    iget-object v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiIOiX:Landroid/graphics/Paint;

    iget v4, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XOXiX0:I

    int-to-float v4, v4

    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-object v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiIOiX:Landroid/graphics/Paint;

    iget-object v4, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->I0:Landroid/graphics/Rect;

    iget v5, v4, Landroid/graphics/Rect;->left:I

    int-to-float v5, v5

    iget v6, v4, Landroid/graphics/Rect;->top:I

    int-to-float v6, v6

    iget v7, v4, Landroid/graphics/Rect;->right:I

    int-to-float v7, v7

    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    int-to-float v4, v4

    move v0, v7

    move v7, v4

    move v4, v5

    move v5, v6

    move v6, v0

    move-object v0, p0

    move-object v1, p1

    invoke-virtual/range {v0 .. v7}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iI(Landroid/graphics/Canvas;Landroid/graphics/Paint;Ljava/lang/String;FFFF)V

    :cond_4
    return-void
.end method

.method public final iX1O1(Landroid/graphics/Canvas;Landroid/graphics/Paint;Ljava/lang/String;FFFFZZI)V
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

    iget-object v9, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XO0X10iO:Ljava/util/List;

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

.method public iXiX011(II)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "startColor",
            "endColor"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IO:[I

    const/4 v1, 0x0

    aput p1, v0, v1

    const/4 p1, 0x1

    aput p2, v0, p1

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public iXiiiO(II)V
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

    iput p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iIXi1iiXI:I

    iput p2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X0i1O:I

    invoke-virtual {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iOOX010X()V

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public final iiiO()Z
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->O001I:Ljava/lang/Float;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iXiiiO:Ljava/lang/Integer;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
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

    invoke-super/range {p0 .. p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    const/high16 v1, -0x40800000    # -1.0f

    iput v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XX1Oi:F

    iget-boolean v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iIi0:Z

    if-eqz v1, :cond_0

    invoke-virtual/range {p0 .. p1}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->II1Xi0(Landroid/graphics/Canvas;)V

    :cond_0
    iget-boolean v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->O101:Z

    if-eqz v1, :cond_1

    invoke-virtual/range {p0 .. p1}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IXXOO(Landroid/graphics/Canvas;)V

    :cond_1
    iget-object v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XO0X10iO:Ljava/util/List;

    const/4 v2, 0x0

    if-nez v1, :cond_2

    move v4, v2

    goto :goto_0

    :cond_2
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    move v4, v1

    :goto_0
    const/4 v6, 0x1

    if-lez v4, :cond_3

    iget-object v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XO0X10iO:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    sub-int/2addr v3, v6

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lcom/android/mltcode/paycertificationapi/iz3;

    move v3, v2

    :goto_1
    if-ge v3, v4, :cond_4

    iget-object v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XO0X10iO:Ljava/util/List;

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/android/mltcode/paycertificationapi/iz3;

    invoke-virtual {v7}, Lcom/android/mltcode/paycertificationapi/iz3;->XO0O10()F

    move-result v5

    move-object v0, p0

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iOO1ii1(Landroid/graphics/Canvas;Lcom/android/mltcode/paycertificationapi/iz3;IIF)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    invoke-virtual/range {p0 .. p1}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iX(Landroid/graphics/Canvas;)V

    :cond_4
    invoke-virtual {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO()Z

    move-result v1

    if-nez v1, :cond_b

    iget v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iIi1:I

    if-eqz v1, :cond_a

    const-string v2, "plase add sbv_sliderImg!!!!!"

    const/4 v3, 0x2

    if-eq v1, v6, :cond_8

    if-eq v1, v3, :cond_7

    const/4 v3, 0x3

    if-eq v1, v3, :cond_5

    goto/16 :goto_2

    :cond_5
    iget-boolean v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->O1:Z

    if-eqz v1, :cond_6

    iget-object v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->top:I

    iget v4, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->I0XXi0X:I

    div-int/lit8 v2, v4, 0x2

    sub-int/2addr v1, v2

    iget v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XOX0O0:I

    sub-int/2addr v1, v2

    iget-object v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XXOXi:Landroid/graphics/Bitmap;

    iget v3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IOi1O0:I

    iget v5, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XX1Oi:F

    int-to-float v6, v1

    iget-object v7, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XXX11i:Landroid/graphics/Paint;

    move-object v0, p0

    move-object v1, p1

    invoke-virtual/range {v0 .. v7}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->O1O(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;IIFFLandroid/graphics/Paint;)V

    return-void

    :cond_6
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_7
    iget v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IOi1O0:I

    move v1, v3

    iget v3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->I0XXi0X:I

    iget v4, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XX1Oi:F

    iget-object v5, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget v5, v5, Landroid/graphics/Rect;->top:I

    invoke-direct {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getXtop()I

    move-result v6

    sub-int/2addr v5, v6

    iget v6, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->I0XXi0X:I

    div-int/2addr v6, v1

    add-int/2addr v5, v6

    int-to-float v5, v5

    iget v6, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->OX110i:I

    iget-object v7, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XXX11i:Landroid/graphics/Paint;

    move-object v0, p0

    move-object v1, p1

    invoke-virtual/range {v0 .. v7}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->i010I(Landroid/graphics/Canvas;IIFFILandroid/graphics/Paint;)V

    return-void

    :cond_8
    move v1, v3

    iget-boolean v3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->O1:Z

    if-eqz v3, :cond_9

    iget-object v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XXOXi:Landroid/graphics/Bitmap;

    iget v3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IOi1O0:I

    iget v4, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->I0XXi0X:I

    iget v5, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XX1Oi:F

    iget-object v6, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO:Landroid/graphics/Rect;

    iget v6, v6, Landroid/graphics/Rect;->top:I

    invoke-direct {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->getXtop()I

    move-result v7

    sub-int/2addr v6, v7

    iget v7, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->I0XXi0X:I

    div-int/2addr v7, v1

    add-int/2addr v6, v7

    int-to-float v6, v6

    iget-object v7, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XXX11i:Landroid/graphics/Paint;

    move-object v0, p0

    move-object v1, p1

    invoke-virtual/range {v0 .. v7}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->O1O(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;IIFFLandroid/graphics/Paint;)V

    return-void

    :cond_9
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_a
    invoke-virtual {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X11I()I

    move-result v1

    iget v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XX1Oi:F

    float-to-int v2, v2

    invoke-virtual {p0, p1, v1, v2}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X1IX(Landroid/graphics/Canvas;II)V

    :cond_b
    :goto_2
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

    iget v1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->i11I:I

    iget v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iIi1:I

    const/4 v3, 0x2

    if-eq v2, v3, :cond_0

    const/4 v3, 0x1

    if-ne v2, v3, :cond_1

    :cond_0
    iget v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->I0XXi0X:I

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    add-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    add-int/2addr v1, v2

    invoke-virtual {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iiiO()Z

    move-result v2

    if-nez v2, :cond_2

    iget v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X0i1O:I

    iget v3, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XOX0O0:I

    add-int/2addr v2, v3

    add-int/2addr v1, v2

    :cond_2
    iget-boolean v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X00O0:Z

    if-eqz v2, :cond_3

    iget v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iii0:I

    add-int/2addr v1, v2

    :cond_3
    iget-boolean v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X111IO:Z

    if-eqz v2, :cond_4

    iget v2, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Xii11I:I

    add-int/2addr v1, v2

    :cond_4
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

    iput p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->i11I:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setDescriptionBoxHeight(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "descriptionBoxHeight"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iii0:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setDescriptionTextColor(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "descriptionTextColor"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iOI:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setDescriptionTextSize(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "descriptionTextSize"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->O0O:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setDescriptionTopTextColor(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "descriptionTopTextColor"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IX1XiI:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setDrawSegmentBg(Z)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "drawSegmentBg"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iIi0:Z

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setEmptySegmentColor(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "emptySegmentColor"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->OO:I

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

    iput p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->i0X000X0O:I

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

    iput p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X00XIX1:I

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

    iput p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XXI0XOIX:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setSegmentTextColor(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "segmentTextColor"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XOO0XOOii:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setSegmentTextSize(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "segmentTextSize"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XOXiX0:I

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

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XO0X10iO:Ljava/util/List;

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

    iput-boolean p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->X00O0:Z

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setShowSegmentText(Z)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "showSegmentText"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IXI:Z

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setSideStyle(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "sideStyle"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IiiXiI0I:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setSideTextStyle(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "sideTextStyle"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XOIX:I

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

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Ii0X0X:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iOOX010X()V

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

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->O001I:Ljava/lang/Float;

    invoke-virtual {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iOOX010X()V

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

    iput v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->XXI0XOIX:I

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iXiiiO:Ljava/lang/Integer;

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

    iput-object p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Ii1iii0:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iOOX010X()V

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

    iput p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->iXiX011:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setValueTextColor(I)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "valueTextColor"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->IO0iXO0O:I

    iget-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->O0O0X0iOi:Landroid/text/TextPaint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setValueTextSize(I)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "valueTextSize"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->Oi:I

    iget-object v0, p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->O0O0X0iOi:Landroid/text/TextPaint;

    int-to-float p1, p1

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method
