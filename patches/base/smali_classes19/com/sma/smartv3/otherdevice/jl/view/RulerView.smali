.class public Lcom/sma/smartv3/otherdevice/jl/view/RulerView;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/otherdevice/jl/view/RulerView$O00;
    }
.end annotation


# static fields
.field public static final iiII:Ljava/lang/String; = "RulerView"


# instance fields
.field public I1:I

.field public IO:I

.field public IO0II0i:Ljava/lang/String;

.field public IO0iXO0O:Landroid/graphics/Rect;

.field public IX0IXOi:I

.field public IX1XiI:I

.field public IXI:Landroid/graphics/Paint;

.field public final IXOIIIO:Landroid/view/VelocityTracker;

.field public Ii0X0X:Lcom/sma/smartv3/otherdevice/jl/view/RulerView$O00;

.field public Ii0i:Landroid/graphics/Paint;

.field public Ii1iii0:I

.field public IiiXiI0I:Landroid/graphics/Paint;

.field public O001I:I

.field public O0O:I

.field public O0O0X0iOi:Landroid/graphics/RectF;

.field public OO:I

.field public OX110i:I

.field public Oi:Landroid/graphics/Rect;

.field public X00O0:F

.field public X00XIX1:I

.field public X00Xi1X:F

.field public X0i1O:F

.field public X0iO:F

.field public X1:Landroid/animation/ValueAnimator;

.field public X100O:Ljava/lang/String;

.field public X111IO:Z

.field public X11I:I

.field public X11iII1O1:I

.field public X1IX:I

.field public X1OI:I

.field public XO0X10iO:Z

.field public XOIX:Landroid/graphics/Paint;

.field public XOO0XOOii:Landroid/graphics/Paint;

.field public XOX0O0:I

.field public XOXiX0:Landroid/graphics/Paint;

.field public XX00i10X:Landroid/graphics/Rect;

.field public XX1Oi:I

.field public XXO:I

.field public XXX11i:I

.field public XXiIiX10:F

.field public XXiO0i:I

.field public Xi1i0XOX0:I

.field public Xii:Z

.field public Xii11I:F

.field public i0X000X0O:I

.field public i100IXOX:I

.field public i11I:Z

.field public iI0I:I

.field public iIX0i:I

.field public iIXi1iiXI:F

.field public iIi1:I

.field public iOI:I

.field public iOiXi11II:I

.field public iX1O1:I

.field public iXi:I

.field public iXiX011:F

.field public iXiiiO:I

.field public iiIOiX:Landroid/graphics/Paint;

.field public iii0:F

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

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
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
    invoke-direct {p0, p1, p2, v0}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 5
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
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

    const/4 p1, 0x1

    .line 4
    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IO:I

    const/16 v0, 0x32

    .line 5
    iput v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->I1:I

    .line 6
    div-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iX1O1:I

    const/16 v0, 0xa

    .line 7
    iput v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X11iII1O1:I

    const/16 v0, 0x14

    .line 8
    iput v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XXX11i:I

    const/4 v1, 0x0

    .line 9
    iput v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X1IX:I

    const/high16 v2, 0x42480000    # 50.0f

    .line 10
    iput v2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X0i1O:F

    const/high16 v3, 0x42c80000    # 100.0f

    .line 11
    iput v3, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iIXi1iiXI:F

    .line 12
    iput v3, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iXiX011:F

    const v3, -0x30004

    .line 13
    iput v3, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->O001I:I

    const v3, -0x666667

    .line 14
    iput v3, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XXO:I

    const v3, -0x99999a

    .line 15
    iput v3, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iXiiiO:I

    const v3, -0xaf4a7a

    .line 16
    iput v3, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->Ii1iii0:I

    const v4, -0xcccccd

    .line 17
    iput v4, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iiiO:I

    .line 18
    iput v3, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X11I:I

    .line 19
    const-string v4, "kg"

    iput-object v4, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X100O:Ljava/lang/String;

    .line 20
    iput v3, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XX1Oi:I

    .line 21
    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->OX110i:I

    const/4 v3, 0x2

    .line 22
    iput v3, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->OO:I

    const/4 v3, 0x3

    .line 23
    iput v3, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XOX0O0:I

    .line 24
    iput v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iOiXi11II:I

    const/16 v0, 0x10

    .line 25
    iput v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X00XIX1:I

    const/16 v0, 0xd

    .line 26
    iput v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->i0X000X0O:I

    .line 27
    iput-boolean p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->i11I:Z

    .line 28
    iput-boolean p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XO0X10iO:Z

    const/high16 p1, -0x40800000    # -1.0f

    .line 29
    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XXiIiX10:F

    .line 30
    iput v2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X00Xi1X:F

    .line 31
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IXOIIIO:Landroid/view/VelocityTracker;

    .line 32
    iget p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X0i1O:F

    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IO0II0i:Ljava/lang/String;

    .line 33
    iput v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->O0O:I

    const/4 p1, 0x0

    .line 34
    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->Xii11I:F

    .line 35
    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X00O0:F

    .line 36
    iput-boolean v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X111IO:Z

    .line 37
    invoke-virtual {p0, p2, p3}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->OiIIX101O(Landroid/util/AttributeSet;I)V

    .line 38
    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XX0()V

    return-void
.end method

.method public static bridge synthetic I0IIOi(Lcom/sma/smartv3/otherdevice/jl/view/RulerView;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IX1XiI:I

    return p0
.end method

.method public static bridge synthetic I0iXXO(Lcom/sma/smartv3/otherdevice/jl/view/RulerView;F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X00O0:F

    return-void
.end method

.method public static bridge synthetic IO(Lcom/sma/smartv3/otherdevice/jl/view/RulerView;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->Xii:Z

    return-void
.end method

.method public static bridge synthetic IiI10X(Lcom/sma/smartv3/otherdevice/jl/view/RulerView;)Lcom/sma/smartv3/otherdevice/jl/view/RulerView$O00;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->Ii0X0X:Lcom/sma/smartv3/otherdevice/jl/view/RulerView$O00;

    return-object p0
.end method

.method public static bridge synthetic O00(Lcom/sma/smartv3/otherdevice/jl/view/RulerView;)F
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->Xii11I:F

    return p0
.end method

.method public static bridge synthetic OIX0iXi(Lcom/sma/smartv3/otherdevice/jl/view/RulerView;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X111IO:Z

    return-void
.end method

.method public static bridge synthetic OIi0(Lcom/sma/smartv3/otherdevice/jl/view/RulerView;F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XXiIiX10:F

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/otherdevice/jl/view/RulerView;Landroid/animation/ValueAnimator;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->Xii11I:F

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X00O0:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public static bridge synthetic X1ii(Lcom/sma/smartv3/otherdevice/jl/view/RulerView;F)F
    .locals 0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iIiiO(F)F

    move-result p0

    return p0
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/otherdevice/jl/view/RulerView;Landroid/animation/ValueAnimator;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->Xii11I:F

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X00O0:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public static bridge synthetic XO0O10(Lcom/sma/smartv3/otherdevice/jl/view/RulerView;)F
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iIXi1iiXI:F

    return p0
.end method

.method public static bridge synthetic XOO0ii0(Lcom/sma/smartv3/otherdevice/jl/view/RulerView;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IO0II0i:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic XXI(Lcom/sma/smartv3/otherdevice/jl/view/RulerView;F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->Xii11I:F

    return-void
.end method

.method public static bridge synthetic iO(Lcom/sma/smartv3/otherdevice/jl/view/RulerView;)F
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XXiIiX10:F

    return p0
.end method


# virtual methods
.method public final I1XOi1(Landroid/graphics/Canvas;)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "canvas"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->O0O0X0iOi:Landroid/graphics/RectF;

    iget v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IX1XiI:I

    int-to-float v1, v1

    iget v2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iOI:I

    int-to-float v2, v2

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v3, v1, v2}, Landroid/graphics/RectF;->set(FFFF)V

    iget-boolean v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XO0X10iO:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->O0O0X0iOi:Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->Ii0i:Landroid/graphics/Paint;

    const/high16 v2, 0x41a00000    # 20.0f

    invoke-virtual {p1, v0, v2, v2, v1}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->O0O0X0iOi:Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->Ii0i:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    return-void
.end method

.method public final IIX1OXO(Landroid/graphics/Canvas;Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "canvas",
            "resultText"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->i11I:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IO0iXO0O:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    neg-int v0, v0

    iget v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iX1O1:I

    div-int/lit8 v1, v1, 0x2

    sub-int/2addr v0, v1

    int-to-float v0, v0

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Landroid/graphics/Canvas;->translate(FF)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XOO0XOOii:Landroid/graphics/Paint;

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    iget-object v2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IO0iXO0O:Landroid/graphics/Rect;

    const/4 v3, 0x0

    invoke-virtual {v0, p2, v3, v1, v2}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    iget v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IX1XiI:I

    div-int/lit8 v0, v0, 0x2

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IO0iXO0O:Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    sub-int/2addr v0, v1

    int-to-float v0, v0

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IO0iXO0O:Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v1

    int-to-float v1, v1

    iget-object v2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XOO0XOOii:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, v0, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    iget p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IX1XiI:I

    div-int/lit8 p2, p2, 0x2

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IO0iXO0O:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    add-int/2addr p2, v0

    add-int/lit8 p2, p2, 0xa

    iput p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->Xi1i0XOX0:I

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X100O:Ljava/lang/String;

    int-to-float p2, p2

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XX00i10X:Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v1

    add-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    iget-object v2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iiIOiX:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, p2, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    return-void
.end method

.method public final O10IXXX0X(I)V
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "xVelocity"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result v0

    const/16 v1, 0x32

    if-ge v0, v1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X111IO:Z

    return-void

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X1:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    div-int/lit8 v0, p1, 0x14

    const/4 v1, 0x0

    filled-new-array {v1, v0}, [I

    move-result-object v0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object v0

    div-int/lit8 p1, p1, 0xa

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X1:Landroid/animation/ValueAnimator;

    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X1:Landroid/animation/ValueAnimator;

    new-instance v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView$OXO1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView$OXO1;-><init>(Lcom/sma/smartv3/otherdevice/jl/view/RulerView;)V

    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X1:Landroid/animation/ValueAnimator;

    new-instance v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView$XIi00iiXO;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView$XIi00iiXO;-><init>(Lcom/sma/smartv3/otherdevice/jl/view/RulerView;)V

    invoke-virtual {p1, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X1:Landroid/animation/ValueAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method

.method public final OiIIX101O(Landroid/util/AttributeSet;I)V
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "attrs",
            "defStyleAttr"
        }
    .end annotation

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    sget-object v1, Lcom/sma/smartv3/R$styleable;->RulerView:[I

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, p2, v2}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    const/16 p2, 0x10

    iget v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IO:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IO:I

    iget p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->I1:I

    int-to-float p2, p2

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1, p2, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p2

    float-to-int p2, p2

    const/16 v0, 0xb

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->I1:I

    iget p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iX1O1:I

    int-to-float p2, p2

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    invoke-static {v1, p2, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p2

    float-to-int p2, p2

    const/16 v0, 0xd

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iX1O1:I

    const/16 p2, 0xe

    iget v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X11iII1O1:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X11iII1O1:I

    iget p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XXX11i:I

    int-to-float p2, p2

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    invoke-static {v1, p2, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p2

    float-to-int p2, p2

    const/16 v0, 0xf

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XXX11i:I

    int-to-float p2, p2

    invoke-static {p2}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XXX11i:I

    const/4 p2, 0x7

    iget v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X1IX:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iget v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IO:I

    div-int/2addr p2, v0

    iput p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X1IX:I

    iget p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X0i1O:F

    invoke-virtual {p1, v2, p2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p2

    iget v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IO:I

    int-to-float v0, v0

    div-float/2addr p2, v0

    iput p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X0i1O:F

    const/4 p2, 0x4

    iget v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iIXi1iiXI:F

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p2

    iget v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IO:I

    int-to-float v0, v0

    div-float/2addr p2, v0

    iput p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iIXi1iiXI:F

    const/16 p2, 0xa

    iget v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->O001I:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->O001I:I

    const/16 p2, 0xc

    iget v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XXO:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XXO:I

    const/4 p2, 0x5

    iget v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iXiiiO:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iXiiiO:I

    iget p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->Ii1iii0:I

    const/4 v0, 0x2

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->Ii1iii0:I

    const/16 p2, 0x11

    iget v2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iiiO:I

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iiiO:I

    const/16 p2, 0x8

    iget v2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X11I:I

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X11I:I

    const/16 p2, 0x16

    iget v2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XX1Oi:I

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XX1Oi:I

    iget-object p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X100O:Ljava/lang/String;

    const/16 v2, 0x15

    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X100O:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    iput-object p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X100O:Ljava/lang/String;

    :cond_0
    iget p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->OX110i:I

    int-to-float p2, p2

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    invoke-static {v1, p2, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p2

    float-to-int p2, p2

    const/16 v2, 0x14

    invoke-virtual {p1, v2, p2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->OX110i:I

    iget p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->OO:I

    int-to-float p2, p2

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    invoke-static {v1, p2, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p2

    float-to-int p2, p2

    const/4 v2, 0x6

    invoke-virtual {p1, v2, p2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->OO:I

    iget p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XOX0O0:I

    int-to-float p2, p2

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    invoke-static {v1, p2, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p2

    float-to-int p2, p2

    const/4 v2, 0x3

    invoke-virtual {p1, v2, p2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XOX0O0:I

    iget p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iOiXi11II:I

    int-to-float p2, p2

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    invoke-static {v0, p2, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p2

    float-to-int p2, p2

    const/16 v2, 0x9

    invoke-virtual {p1, v2, p2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iOiXi11II:I

    iget p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X00XIX1:I

    int-to-float p2, p2

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    invoke-static {v0, p2, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p2

    float-to-int p2, p2

    const/16 v2, 0x12

    invoke-virtual {p1, v2, p2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X00XIX1:I

    iget p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->i0X000X0O:I

    int-to-float p2, p2

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    invoke-static {v0, p2, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p2

    float-to-int p2, p2

    const/16 v0, 0x17

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->i0X000X0O:I

    const/16 p2, 0x13

    iget-boolean v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->i11I:Z

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->i11I:Z

    iget-boolean p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XO0X10iO:Z

    invoke-virtual {p1, v1, p2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XO0X10iO:Z

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public X0O(F)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "scale"
        }
    .end annotation

    iget v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IO:I

    int-to-float v0, v0

    div-float/2addr p1, v0

    iget v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X1IX:I

    int-to-float v0, v0

    cmpg-float v0, p1, v0

    if-ltz v0, :cond_1

    iget v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iIXi1iiXI:F

    cmpl-float v0, p1, v0

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XXiIiX10:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final XX0()V
    .locals 6

    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->Ii0i:Landroid/graphics/Paint;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IXI:Landroid/graphics/Paint;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IiiXiI0I:Landroid/graphics/Paint;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XOIX:Landroid/graphics/Paint;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XOXiX0:Landroid/graphics/Paint;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XOO0XOOii:Landroid/graphics/Paint;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iiIOiX:Landroid/graphics/Paint;

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->Ii0i:Landroid/graphics/Paint;

    iget v2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->O001I:I

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IXI:Landroid/graphics/Paint;

    iget v2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XXO:I

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IiiXiI0I:Landroid/graphics/Paint;

    iget v2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iXiiiO:I

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XOIX:Landroid/graphics/Paint;

    iget v2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->Ii1iii0:I

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XOXiX0:Landroid/graphics/Paint;

    iget v2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iiiO:I

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XOO0XOOii:Landroid/graphics/Paint;

    iget v2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X11I:I

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iiIOiX:Landroid/graphics/Paint;

    iget v2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XX1Oi:I

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XOO0XOOii:Landroid/graphics/Paint;

    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iiIOiX:Landroid/graphics/Paint;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->Ii0i:Landroid/graphics/Paint;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IXI:Landroid/graphics/Paint;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IiiXiI0I:Landroid/graphics/Paint;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XOIX:Landroid/graphics/Paint;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XOIX:Landroid/graphics/Paint;

    sget-object v2, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IiiXiI0I:Landroid/graphics/Paint;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IXI:Landroid/graphics/Paint;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IXI:Landroid/graphics/Paint;

    iget v2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->OX110i:I

    int-to-float v2, v2

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IiiXiI0I:Landroid/graphics/Paint;

    iget v2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->OO:I

    int-to-float v2, v2

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XOIX:Landroid/graphics/Paint;

    iget v2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XOX0O0:I

    int-to-float v2, v2

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XOO0XOOii:Landroid/graphics/Paint;

    iget v2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iOiXi11II:I

    int-to-float v2, v2

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iiIOiX:Landroid/graphics/Paint;

    iget v2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->i0X000X0O:I

    int-to-float v2, v2

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XOXiX0:Landroid/graphics/Paint;

    iget v2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X00XIX1:I

    int-to-float v2, v2

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->O0O0X0iOi:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IO0iXO0O:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->Oi:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XX00i10X:Landroid/graphics/Rect;

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XOO0XOOii:Landroid/graphics/Paint;

    iget-object v2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IO0II0i:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    iget-object v4, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IO0iXO0O:Landroid/graphics/Rect;

    const/4 v5, 0x0

    invoke-virtual {v0, v2, v5, v3, v4}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iiIOiX:Landroid/graphics/Paint;

    iget-object v2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IO0II0i:Ljava/lang/String;

    iget-object v3, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XX00i10X:Landroid/graphics/Rect;

    invoke-virtual {v0, v2, v5, v1, v3}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    iget v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->I1:I

    div-int/lit8 v1, v0, 0x4

    iput v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XXiO0i:I

    div-int/lit8 v1, v0, 0x2

    iput v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IX0IXOi:I

    iput v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iXi:I

    div-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iIX0i:I

    new-instance v0, Landroid/animation/ValueAnimator;

    invoke-direct {v0}, Landroid/animation/ValueAnimator;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X1:Landroid/animation/ValueAnimator;

    return-void
.end method

.method public final XiOIO(Landroid/graphics/Canvas;)V
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

    const/4 v7, 0x1

    const/4 v8, 0x2

    iget-boolean v2, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->i11I:Z

    const/4 v9, 0x0

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IO0iXO0O:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v2

    goto :goto_0

    :cond_0
    move v2, v9

    :goto_0
    iget v3, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iX1O1:I

    add-int/2addr v2, v3

    int-to-float v2, v2

    const/4 v10, 0x0

    invoke-virtual {v1, v10, v2}, Landroid/graphics/Canvas;->translate(FF)V

    iget v2, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X0i1O:F

    const/high16 v3, -0x40800000    # -1.0f

    cmpl-float v4, v2, v3

    if-eqz v4, :cond_1

    invoke-virtual {v0, v2}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iIiiO(F)F

    move-result v2

    iput v2, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->Xii11I:F

    iput v2, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X00O0:F

    iput v3, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X0i1O:F

    :cond_1
    iget v2, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XXiIiX10:F

    cmpl-float v2, v2, v3

    if-eqz v2, :cond_2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "moveX 000 >> "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->Xii11I:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v3, ", computeScale >> "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XXiIiX10:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "RulerView"

    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget v2, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->Xii11I:F

    iput v2, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X00O0:F

    iget-object v2, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X1:Landroid/animation/ValueAnimator;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v2

    if-nez v2, :cond_2

    iget v2, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X00O0:F

    iget v3, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XXiIiX10:F

    invoke-virtual {v0, v3}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iIiiO(F)F

    move-result v3

    new-array v4, v8, [F

    aput v2, v4, v9

    aput v3, v4, v7

    invoke-static {v4}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v2

    iput-object v2, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X1:Landroid/animation/ValueAnimator;

    new-instance v3, Lcom/android/mltcode/paycertificationapi/yp3;

    invoke-direct {v3, v0}, Lcom/android/mltcode/paycertificationapi/yp3;-><init>(Lcom/sma/smartv3/otherdevice/jl/view/RulerView;)V

    invoke-virtual {v2, v3}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    iget-object v2, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X1:Landroid/animation/ValueAnimator;

    new-instance v3, Lcom/sma/smartv3/otherdevice/jl/view/RulerView$iO;

    invoke-direct {v3, v0}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView$iO;-><init>(Lcom/sma/smartv3/otherdevice/jl/view/RulerView;)V

    invoke-virtual {v2, v3}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    iget-object v2, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X1:Landroid/animation/ValueAnimator;

    iget v3, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XXiIiX10:F

    invoke-virtual {v0, v3}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iIiiO(F)F

    move-result v3

    iget v4, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X00O0:F

    sub-float/2addr v3, v4

    float-to-long v3, v3

    invoke-static {v3, v4}, Ljava/lang/Math;->abs(J)J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    iget-object v2, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X1:Landroid/animation/ValueAnimator;

    invoke-virtual {v2}, Landroid/animation/ValueAnimator;->start()V

    :cond_2
    iget v2, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->Xii11I:F

    iget v3, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XXX11i:I

    int-to-float v4, v3

    div-float v4, v2, v4

    float-to-int v4, v4

    neg-int v4, v4

    int-to-float v3, v3

    rem-float/2addr v2, v3

    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    iput v9, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->O0O:I

    iget-boolean v3, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X111IO:Z

    if-eqz v3, :cond_6

    iget v2, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->Xii11I:F

    iget v3, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IX1XiI:I

    div-int/2addr v3, v8

    iget v4, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XXX11i:I

    rem-int/2addr v3, v4

    int-to-float v3, v3

    sub-float/2addr v2, v3

    int-to-float v3, v4

    rem-float/2addr v2, v3

    cmpg-float v3, v2, v10

    if-gtz v3, :cond_3

    int-to-float v3, v4

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    sub-float v2, v3, v2

    :cond_3
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v3

    float-to-int v3, v3

    iput v3, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iIi1:I

    iget v3, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XXX11i:I

    int-to-float v3, v3

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v4

    sub-float/2addr v3, v4

    float-to-int v3, v3

    iput v3, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->i100IXOX:I

    iget v4, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XXX11i:I

    div-int/2addr v4, v8

    int-to-float v4, v4

    cmpg-float v2, v2, v4

    if-gtz v2, :cond_4

    iget v2, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->Xii11I:F

    iget v3, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iIi1:I

    int-to-float v3, v3

    sub-float/2addr v2, v3

    goto :goto_1

    :cond_4
    iget v2, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->Xii11I:F

    int-to-float v3, v3

    add-float/2addr v2, v3

    :goto_1
    iget-object v3, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X1:Landroid/animation/ValueAnimator;

    if-eqz v3, :cond_5

    invoke-virtual {v3}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v3

    if-nez v3, :cond_5

    iget v3, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->Xii11I:F

    new-array v4, v8, [F

    aput v3, v4, v9

    aput v2, v4, v7

    invoke-static {v4}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v2

    iput-object v2, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X1:Landroid/animation/ValueAnimator;

    new-instance v3, Lcom/android/mltcode/paycertificationapi/zp3;

    invoke-direct {v3, v0}, Lcom/android/mltcode/paycertificationapi/zp3;-><init>(Lcom/sma/smartv3/otherdevice/jl/view/RulerView;)V

    invoke-virtual {v2, v3}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    iget-object v2, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X1:Landroid/animation/ValueAnimator;

    new-instance v3, Lcom/sma/smartv3/otherdevice/jl/view/RulerView$XO0O10;

    invoke-direct {v3, v0}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView$XO0O10;-><init>(Lcom/sma/smartv3/otherdevice/jl/view/RulerView;)V

    invoke-virtual {v2, v3}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    iget-object v2, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X1:Landroid/animation/ValueAnimator;

    const-wide/16 v3, 0x12c

    invoke-virtual {v2, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    iget-object v2, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X1:Landroid/animation/ValueAnimator;

    invoke-virtual {v2}, Landroid/animation/ValueAnimator;->start()V

    iput-boolean v9, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X111IO:Z

    :cond_5
    iget v2, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->Xii11I:F

    iget v3, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XXX11i:I

    int-to-float v4, v3

    div-float v4, v2, v4

    neg-float v4, v4

    float-to-int v4, v4

    int-to-float v3, v3

    rem-float/2addr v2, v3

    :cond_6
    invoke-virtual {v1, v2, v10}, Landroid/graphics/Canvas;->translate(FF)V

    new-instance v2, Ljava/lang/ref/WeakReference;

    new-instance v3, Ljava/math/BigDecimal;

    iget v5, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IX1XiI:I

    div-int/2addr v5, v8

    int-to-float v5, v5

    iget v6, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->Xii11I:F

    sub-float/2addr v5, v6

    iget v6, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XXX11i:I

    iget v11, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X11iII1O1:I

    mul-int/2addr v6, v11

    int-to-float v6, v6

    div-float/2addr v5, v6

    iget v6, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X1IX:I

    int-to-float v6, v6

    add-float/2addr v5, v6

    iget v6, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IO:I

    int-to-float v6, v6

    mul-float/2addr v5, v6

    float-to-double v5, v5

    invoke-direct {v3, v5, v6}, Ljava/math/BigDecimal;-><init>(D)V

    invoke-direct {v2, v3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/math/BigDecimal;

    const/4 v3, 0x4

    invoke-virtual {v2, v7, v3}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    move-result-object v2

    invoke-virtual {v2}, Ljava/math/BigDecimal;->floatValue()F

    move-result v2

    iput v2, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X00Xi1X:F

    invoke-static {v2}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IO0II0i:Ljava/lang/String;

    iget-object v3, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->Ii0X0X:Lcom/sma/smartv3/otherdevice/jl/view/RulerView$O00;

    if-eqz v3, :cond_7

    invoke-interface {v3, v2}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView$O00;->XIi00iiXO(Ljava/lang/String;)V

    :cond_7
    iget-boolean v2, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->Xii:Z

    if-eqz v2, :cond_8

    iput-boolean v9, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->Xii:Z

    iget-object v2, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->Ii0X0X:Lcom/sma/smartv3/otherdevice/jl/view/RulerView$O00;

    if-eqz v2, :cond_8

    iget-object v3, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IO0II0i:Ljava/lang/String;

    invoke-interface {v2, v3}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView$O00;->OXO1(Ljava/lang/String;)V

    :cond_8
    iget v2, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IX1XiI:I

    int-to-float v2, v2

    iget v3, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iIXi1iiXI:F

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v5

    int-to-float v5, v5

    cmpl-float v3, v3, v5

    if-lez v3, :cond_9

    iget v3, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iIXi1iiXI:F

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    add-int/2addr v3, v7

    :goto_2
    move v11, v3

    goto :goto_3

    :cond_9
    iget v3, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iIXi1iiXI:F

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    goto :goto_2

    :goto_3
    move v12, v2

    move v13, v4

    move v14, v10

    :goto_4
    iget v2, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->O0O:I

    iget v3, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IX1XiI:I

    if-ge v2, v3, :cond_13

    iget v4, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X11iII1O1:I

    rem-int v4, v13, v4

    if-nez v4, :cond_f

    iget v4, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->Xii11I:F

    cmpl-float v5, v4, v10

    if-ltz v5, :cond_b

    int-to-float v5, v2

    iget v6, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XXX11i:I

    int-to-float v6, v6

    sub-float/2addr v4, v6

    cmpg-float v4, v5, v4

    if-ltz v4, :cond_a

    goto :goto_6

    :cond_a
    :goto_5
    move/from16 v16, v7

    goto/16 :goto_8

    :cond_b
    :goto_6
    div-int/2addr v3, v8

    sub-int/2addr v3, v2

    int-to-float v2, v3

    add-int/lit8 v3, v11, 0x1

    int-to-float v3, v3

    invoke-virtual {v0, v3}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iIiiO(F)F

    move-result v3

    iget v4, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->Xii11I:F

    sub-float/2addr v3, v4

    cmpg-float v2, v2, v3

    if-gtz v2, :cond_c

    goto :goto_5

    :cond_c
    int-to-float v2, v13

    iget v3, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X11iII1O1:I

    int-to-float v3, v3

    div-float/2addr v2, v3

    iget v3, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X1IX:I

    int-to-float v3, v3

    add-float/2addr v2, v3

    iget v3, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IO:I

    int-to-float v4, v3

    mul-float v15, v2, v4

    iget v2, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iIXi1iiXI:F

    int-to-float v3, v3

    mul-float/2addr v2, v3

    cmpg-float v2, v15, v2

    if-gtz v2, :cond_d

    iget v2, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iIX0i:I

    int-to-float v3, v2

    iget v4, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IX0IXOi:I

    add-int/2addr v2, v4

    int-to-float v5, v2

    iget-object v6, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IiiXiI0I:Landroid/graphics/Paint;

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget-object v2, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XOXiX0:Landroid/graphics/Paint;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget v4, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XXX11i:I

    div-int v4, v13, v4

    iget v5, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X1IX:I

    add-int/2addr v4, v5

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    iget v6, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XXX11i:I

    div-int v6, v13, v6

    move/from16 v16, v7

    iget v7, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X1IX:I

    add-int/2addr v6, v7

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    iget-object v6, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->Oi:Landroid/graphics/Rect;

    invoke-virtual {v2, v3, v9, v5, v6}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    float-to-int v3, v15

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->Oi:Landroid/graphics/Rect;

    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    move-result v3

    neg-int v3, v3

    div-int/2addr v3, v8

    int-to-float v3, v3

    iget v4, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iXi:I

    iget v5, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->I1:I

    sub-int/2addr v5, v4

    div-int/2addr v5, v8

    add-int/2addr v4, v5

    iget-object v5, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->Oi:Landroid/graphics/Rect;

    invoke-virtual {v5}, Landroid/graphics/Rect;->height()I

    move-result v5

    add-int/2addr v4, v5

    const/high16 v5, 0x41200000    # 10.0f

    invoke-static {v5}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result v5

    add-int/2addr v4, v5

    int-to-float v4, v4

    iget-object v5, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XOXiX0:Landroid/graphics/Paint;

    invoke-virtual {v1, v2, v3, v4, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    goto :goto_7

    :cond_d
    move/from16 v16, v7

    :goto_7
    iget v2, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X1IX:I

    iget v3, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IO:I

    mul-int/2addr v2, v3

    int-to-float v2, v2

    cmpl-float v2, v15, v2

    if-nez v2, :cond_e

    iget v2, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IX1XiI:I

    shr-int/lit8 v2, v2, 0x1

    int-to-float v2, v2

    iget v4, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X00Xi1X:F

    sub-float/2addr v4, v15

    iget v5, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XXX11i:I

    int-to-float v5, v5

    mul-float/2addr v4, v5

    int-to-float v3, v3

    div-float/2addr v4, v3

    iget v3, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X11iII1O1:I

    int-to-float v3, v3

    mul-float/2addr v4, v3

    sub-float v14, v2, v4

    goto :goto_8

    :cond_e
    mul-int v2, v11, v3

    int-to-float v2, v2

    cmpl-float v2, v15, v2

    if-nez v2, :cond_12

    iget v2, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X00Xi1X:F

    sub-float/2addr v15, v2

    iget v2, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XXX11i:I

    int-to-float v2, v2

    mul-float/2addr v15, v2

    int-to-float v2, v3

    div-float/2addr v15, v2

    iget v2, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X11iII1O1:I

    int-to-float v2, v2

    mul-float/2addr v15, v2

    iget v2, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IX1XiI:I

    div-int/2addr v2, v8

    int-to-float v2, v2

    add-float v12, v15, v2

    goto :goto_8

    :cond_f
    move/from16 v16, v7

    iget v4, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->Xii11I:F

    cmpl-float v5, v4, v10

    if-ltz v5, :cond_10

    int-to-float v5, v2

    cmpg-float v4, v5, v4

    if-ltz v4, :cond_12

    :cond_10
    div-int/2addr v3, v8

    sub-int/2addr v3, v2

    int-to-float v2, v3

    int-to-float v3, v11

    invoke-virtual {v0, v3}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iIiiO(F)F

    move-result v3

    iget v4, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->Xii11I:F

    sub-float/2addr v3, v4

    cmpg-float v2, v2, v3

    if-gez v2, :cond_11

    goto :goto_8

    :cond_11
    int-to-float v2, v13

    iget v3, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X11iII1O1:I

    int-to-float v3, v3

    div-float/2addr v2, v3

    iget v3, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X1IX:I

    int-to-float v3, v3

    add-float/2addr v2, v3

    iget v3, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IO:I

    int-to-float v4, v3

    mul-float/2addr v2, v4

    iget v4, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iIXi1iiXI:F

    int-to-float v3, v3

    mul-float/2addr v4, v3

    cmpg-float v2, v2, v4

    if-gtz v2, :cond_12

    iget v2, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iIX0i:I

    int-to-float v3, v2

    iget v4, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XXiO0i:I

    add-int/2addr v2, v4

    int-to-float v5, v2

    iget-object v6, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IXI:Landroid/graphics/Paint;

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    :cond_12
    :goto_8
    add-int/lit8 v13, v13, 0x1

    iget v2, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->O0O:I

    iget v3, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XXX11i:I

    add-int/2addr v2, v3

    iput v2, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->O0O:I

    int-to-float v2, v3

    invoke-virtual {v1, v2, v10}, Landroid/graphics/Canvas;->translate(FF)V

    move/from16 v7, v16

    goto/16 :goto_4

    :cond_13
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    iget v2, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IX1XiI:I

    div-int/lit8 v3, v2, 0x2

    int-to-float v3, v3

    div-int/2addr v2, v8

    int-to-float v4, v2

    iget v2, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->I1:I

    int-to-float v5, v2

    iget-object v6, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XOIX:Landroid/graphics/Paint;

    move v2, v3

    const/4 v3, 0x0

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget v1, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iIX0i:I

    int-to-float v3, v1

    int-to-float v5, v1

    iget-object v6, v0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IXI:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    move v4, v12

    move v2, v14

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    return-void
.end method

.method public XiOIii1(IFF)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "minScale",
            "maxScale",
            "firstScale"
        }
    .end annotation

    iget v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IO:I

    div-int/2addr p1, v0

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X1IX:I

    int-to-float p1, v0

    div-float p1, p2, p1

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iIXi1iiXI:F

    int-to-float p1, v0

    div-float/2addr p3, p1

    iput p3, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X0i1O:F

    iput p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iXiX011:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public getMaxScale()F
    .locals 2

    iget v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iIXi1iiXI:F

    iget v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IO:I

    int-to-float v1, v1

    mul-float/2addr v0, v1

    return v0
.end method

.method public getMaxScaleValue()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iXiX011:F

    return v0
.end method

.method public getMinScale()I
    .locals 2

    iget v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X1IX:I

    iget v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IO:I

    mul-int/2addr v0, v1

    return v0
.end method

.method public final iIiiO(F)F
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "scale"
        }
    .end annotation

    iget v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IX1XiI:I

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    iget v1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XXX11i:I

    iget v2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X11iII1O1:I

    mul-int/2addr v1, v2

    int-to-float v1, v1

    iget v2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X1IX:I

    int-to-float v2, v2

    sub-float/2addr p1, v2

    mul-float/2addr v1, p1

    sub-float/2addr v0, v1

    return v0
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "canvas"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->I1XOi1(Landroid/graphics/Canvas;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XiOIO(Landroid/graphics/Canvas;)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IO0II0i:Ljava/lang/String;

    invoke-virtual {p0, p1, v0}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IIX1OXO(Landroid/graphics/Canvas;Ljava/lang/String;)V

    return-void
.end method

.method public onMeasure(II)V
    .locals 2
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

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_1

    if-eqz v0, :cond_1

    const/high16 v1, 0x40000000    # 2.0f

    if-eq v0, v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    add-int/2addr p2, v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v0

    add-int/2addr p2, v0

    iput p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iOI:I

    goto :goto_1

    :cond_1
    iget p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->I1:I

    iget-boolean v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->i11I:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IO0iXO0O:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    add-int/2addr p2, v0

    iget v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iX1O1:I

    mul-int/lit8 v0, v0, 0x2

    add-int/2addr p2, v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    add-int/2addr p2, v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v0

    add-int/2addr p2, v0

    const/high16 v0, 0x41a00000    # 20.0f

    invoke-static {v0}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result v0

    add-int/2addr p2, v0

    iput p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iOI:I

    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result p2

    add-int/2addr p1, p2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result p2

    add-int/2addr p1, p2

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IX1XiI:I

    iget p2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iOI:I

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "event"
        }
    .end annotation

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X0iO:F

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X111IO:Z

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IXOIIIO:Landroid/view/VelocityTracker;

    const/16 v1, 0x1f4

    invoke-virtual {v0, v1}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IXOIIIO:Landroid/view/VelocityTracker;

    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_3

    if-eq v0, v1, :cond_2

    const/4 p1, 0x2

    if-eq v0, p1, :cond_0

    goto/16 :goto_0

    :cond_0
    iget v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X0iO:F

    iget v2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iii0:F

    sub-float/2addr v0, v2

    iget v2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X00O0:F

    add-float/2addr v0, v2

    iput v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->Xii11I:F

    iget v2, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IX1XiI:I

    div-int/lit8 v3, v2, 0x2

    int-to-float v3, v3

    cmpl-float v3, v0, v3

    if-ltz v3, :cond_1

    div-int/2addr v2, p1

    int-to-float p1, v2

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->Xii11I:F

    goto :goto_0

    :cond_1
    iget p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iIXi1iiXI:F

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iIiiO(F)F

    move-result p1

    cmpg-float p1, v0, p1

    if-gtz p1, :cond_5

    iget p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iIXi1iiXI:F

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iIiiO(F)F

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->Xii11I:F

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "moveX = "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->Xii11I:F

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", max = "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iIXi1iiXI:F

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iIiiO(F)F

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "RulerView"

    filled-new-array {v0, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    iget p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->Xii11I:F

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X00O0:F

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IXOIIIO:Landroid/view/VelocityTracker;

    invoke-virtual {p1}, Landroid/view/VelocityTracker;->getXVelocity()F

    move-result p1

    float-to-int p1, p1

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iI0I:I

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->O10IXXX0X(I)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IXOIIIO:Landroid/view/VelocityTracker;

    invoke-virtual {p1}, Landroid/view/VelocityTracker;->clear()V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X1:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X1:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->end()V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X1:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iii0:F

    :cond_5
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return v1
.end method

.method public setBgColor(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "bgColor"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->O001I:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setFirstScale(F)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "firstScale"
        }
    .end annotation

    iget v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IO:I

    int-to-float v0, v0

    div-float/2addr p1, v0

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X0i1O:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setIsBgRoundRect(Z)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "bgRoundRect"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XO0X10iO:Z

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setLargeScaleColor(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "largeScaleColor"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->Ii1iii0:I

    return-void
.end method

.method public setLargeScaleStroke(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "largeScaleStroke"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XOX0O0:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setMaxScale(F)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "maxScale"
        }
    .end annotation

    iget v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IO:I

    int-to-float v0, v0

    div-float v0, p1, v0

    iput v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iIXi1iiXI:F

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iXiX011:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setMaxScaleValue(F)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "maxScaleValue"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iXiX011:F

    return-void
.end method

.method public setMidScaleColor(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "midScaleColor"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iXiiiO:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setMidScaleStroke(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "midScaleStroke"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->OO:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setMinScale(I)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "minScale"
        }
    .end annotation

    iget v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IO:I

    div-int/2addr p1, v0

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X1IX:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setOnChooseResulterListener(Lcom/sma/smartv3/otherdevice/jl/view/RulerView$O00;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "onChooseResulterListener"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->Ii0X0X:Lcom/sma/smartv3/otherdevice/jl/view/RulerView$O00;

    return-void
.end method

.method public setResultNumColor(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "resultNumColor"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X11I:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setResultNumTextSize(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "resultNumTextSize"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iOiXi11II:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setRulerHeight(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "rulerHeight"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->I1:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setRulerToResultgap(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "rulerToResultgap"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iX1O1:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setScaleCount(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "scaleCount"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X11iII1O1:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setScaleGap(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "scaleGap"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XXX11i:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setScaleLimit(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "scaleLimit"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IO:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setScaleNumColor(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "scaleNumColor"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iiiO:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setScaleNumTextSize(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "scaleNumTextSize"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X00XIX1:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setShowScaleResult(Z)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "showScaleResult"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->i11I:Z

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setSmallScaleColor(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "smallScaleColor"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XXO:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setSmallScaleStroke(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "smallScaleStroke"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->OX110i:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

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

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X100O:Ljava/lang/String;

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setUnitColor(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "unitColor"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XX1Oi:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setUnitTextSize(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "unitTextSize"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->i0X000X0O:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method
