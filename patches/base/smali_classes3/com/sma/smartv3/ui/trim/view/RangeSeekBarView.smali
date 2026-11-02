.class public Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;,
        Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$OXO1;
    }
.end annotation


# static fields
.field public static final IXI:Ljava/lang/String; = "RangeSeekBarView"

.field public static final IiiXiI0I:I = 0xff

.field public static final XOIX:I = 0xff00

.field public static final XOO0XOOii:I

.field public static final XOXiX0:I = 0x8

.field public static final iiIOiX:I


# instance fields
.field public I1:J

.field public IO:I

.field public IO0II0i:Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$OXO1;

.field public IXOIIIO:Z

.field public Ii0X0X:Z

.field public Ii0i:I

.field public Ii1iii0:Landroid/graphics/Paint;

.field public O001I:Landroid/graphics/Bitmap;

.field public OO:F

.field public OX110i:I

.field public X00XIX1:J

.field public X00Xi1X:Z

.field public X0i1O:D

.field public X1:D

.field public final X100O:Landroid/graphics/Paint;

.field public final X11I:Landroid/graphics/Paint;

.field public X11iII1O1:D

.field public X1IX:D

.field public XO0X10iO:F

.field public final XOX0O0:F

.field public final XX1Oi:Landroid/graphics/Paint;

.field public XXO:Landroid/graphics/Bitmap;

.field public XXX11i:D

.field public XXiIiX10:Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;

.field public i0X000X0O:F

.field public i11I:Z

.field public iIXi1iiXI:D

.field public iOiXi11II:J

.field public iX1O1:D

.field public iXiX011:I

.field public iXiiiO:Landroid/graphics/Bitmap;

.field public iiiO:Landroid/graphics/Paint;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/high16 v0, 0x40e00000    # 7.0f

    invoke-static {v0}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result v0

    sput v0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->XOO0XOOii:I

    const/high16 v0, 0x41200000    # 10.0f

    invoke-static {v0}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result v0

    sput v0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->iiIOiX:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 4
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

    const/16 p1, 0xff

    .line 2
    iput p1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->IO:I

    const-wide/16 v0, 0x3e8

    .line 3
    iput-wide v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->I1:J

    const-wide/16 v0, 0x0

    .line 4
    iput-wide v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->XXX11i:D

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    .line 5
    iput-wide v2, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X1IX:D

    .line 6
    iput-wide v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X0i1O:D

    .line 7
    iput-wide v2, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->iIXi1iiXI:D

    .line 8
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X11I:Landroid/graphics/Paint;

    .line 9
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X100O:Landroid/graphics/Paint;

    .line 10
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->XX1Oi:Landroid/graphics/Paint;

    const/4 p1, 0x0

    .line 11
    iput p1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->XOX0O0:F

    const-wide/16 v0, 0x0

    .line 12
    iput-wide v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->iOiXi11II:J

    .line 13
    iput-wide v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X00XIX1:J

    .line 14
    iput p1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->i0X000X0O:F

    .line 15
    iput-wide v2, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X1:D

    const/4 p1, 0x0

    .line 16
    iput-boolean p1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->IXOIIIO:Z

    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v0, 0x7f0607b0

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->Ii0i:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;JJ)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "context",
            "absoluteMinValuePrim",
            "absoluteMaxValuePrim"
        }
    .end annotation

    .line 52
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const/16 p1, 0xff

    .line 53
    iput p1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->IO:I

    const-wide/16 v0, 0x3e8

    .line 54
    iput-wide v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->I1:J

    const-wide/16 v0, 0x0

    .line 55
    iput-wide v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->XXX11i:D

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    .line 56
    iput-wide v2, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X1IX:D

    .line 57
    iput-wide v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X0i1O:D

    .line 58
    iput-wide v2, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->iIXi1iiXI:D

    .line 59
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X11I:Landroid/graphics/Paint;

    .line 60
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X100O:Landroid/graphics/Paint;

    .line 61
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->XX1Oi:Landroid/graphics/Paint;

    const/4 p1, 0x0

    .line 62
    iput p1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->XOX0O0:F

    const-wide/16 v0, 0x0

    .line 63
    iput-wide v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->iOiXi11II:J

    .line 64
    iput-wide v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X00XIX1:J

    .line 65
    iput p1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->i0X000X0O:F

    .line 66
    iput-wide v2, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X1:D

    const/4 p1, 0x0

    .line 67
    iput-boolean p1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->IXOIIIO:Z

    .line 68
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v0, 0x7f0607b0

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->Ii0i:I

    long-to-double p1, p2

    .line 69
    iput-wide p1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->iX1O1:D

    long-to-double p1, p4

    .line 70
    iput-wide p1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X11iII1O1:D

    const/4 p1, 0x1

    .line 71
    invoke-virtual {p0, p1}, Landroid/view/View;->setFocusable(Z)V

    .line 72
    invoke-virtual {p0, p1}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 73
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->O00()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4
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

    .line 18
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/16 p1, 0xff

    .line 19
    iput p1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->IO:I

    const-wide/16 p1, 0x3e8

    .line 20
    iput-wide p1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->I1:J

    const-wide/16 p1, 0x0

    .line 21
    iput-wide p1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->XXX11i:D

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 22
    iput-wide v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X1IX:D

    .line 23
    iput-wide p1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X0i1O:D

    .line 24
    iput-wide v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->iIXi1iiXI:D

    .line 25
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X11I:Landroid/graphics/Paint;

    .line 26
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X100O:Landroid/graphics/Paint;

    .line 27
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->XX1Oi:Landroid/graphics/Paint;

    const/4 p1, 0x0

    .line 28
    iput p1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->XOX0O0:F

    const-wide/16 v2, 0x0

    .line 29
    iput-wide v2, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->iOiXi11II:J

    .line 30
    iput-wide v2, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X00XIX1:J

    .line 31
    iput p1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->i0X000X0O:F

    .line 32
    iput-wide v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X1:D

    const/4 p1, 0x0

    .line 33
    iput-boolean p1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->IXOIIIO:Z

    .line 34
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p2, 0x7f0607b0

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->Ii0i:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2
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

    .line 35
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/16 p1, 0xff

    .line 36
    iput p1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->IO:I

    const-wide/16 p1, 0x3e8

    .line 37
    iput-wide p1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->I1:J

    const-wide/16 p1, 0x0

    .line 38
    iput-wide p1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->XXX11i:D

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 39
    iput-wide v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X1IX:D

    .line 40
    iput-wide p1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X0i1O:D

    .line 41
    iput-wide v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->iIXi1iiXI:D

    .line 42
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X11I:Landroid/graphics/Paint;

    .line 43
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X100O:Landroid/graphics/Paint;

    .line 44
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->XX1Oi:Landroid/graphics/Paint;

    const/4 p1, 0x0

    .line 45
    iput p1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->XOX0O0:F

    const-wide/16 p2, 0x0

    .line 46
    iput-wide p2, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->iOiXi11II:J

    .line 47
    iput-wide p2, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X00XIX1:J

    .line 48
    iput p1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->i0X000X0O:F

    .line 49
    iput-wide v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X1:D

    const/4 p1, 0x0

    .line 50
    iput-boolean p1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->IXOIIIO:Z

    .line 51
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p2, 0x7f0607b0

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->Ii0i:I

    return-void
.end method

.method private getValueLength()I
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    iget v1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->OX110i:I

    mul-int/lit8 v1, v1, 0x2

    sub-int/2addr v0, v1

    return v0
.end method


# virtual methods
.method public I0IIOi()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->IXOIIIO:Z

    return v0
.end method

.method public I0iXXO()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->Ii0X0X:Z

    return-void
.end method

.method public final I1XOi1(J)D
    .locals 8
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "value"
        }
    .end annotation

    iget-wide v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X11iII1O1:D

    iget-wide v2, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->iX1O1:D

    sub-double v4, v0, v2

    const-wide/16 v6, 0x0

    cmpl-double v4, v6, v4

    if-nez v4, :cond_0

    return-wide v6

    :cond_0
    long-to-double p1, p1

    sub-double/2addr p1, v2

    sub-double/2addr v0, v2

    div-double/2addr p1, v0

    return-wide p1
.end method

.method public final IO(D)J
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "normalized"
        }
    .end annotation

    iget-wide v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->iX1O1:D

    iget-wide v2, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X11iII1O1:D

    sub-double/2addr v2, v0

    mul-double/2addr p1, v2

    add-double/2addr v0, p1

    double-to-long p1, v0

    return-wide p1
.end method

.method public final IiI10X(FDD)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "touchX",
            "normalizedThumbValue",
            "scale"
        }
    .end annotation

    invoke-virtual {p0, p2, p3}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->OIi0(D)F

    move-result p2

    sub-float/2addr p1, p2

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    float-to-double p1, p1

    iget p3, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->OO:F

    float-to-double v0, p3

    mul-double/2addr v0, p4

    cmpg-double p1, p1, v0

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final O00()V
    .locals 8

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->iXiX011:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f081086

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->O001I:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->O001I:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    const/high16 v0, 0x41300000    # 11.0f

    invoke-static {v0}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result v0

    const/high16 v1, 0x425c0000    # 55.0f

    invoke-static {v1}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result v1

    int-to-float v2, v0

    const/high16 v3, 0x3f800000    # 1.0f

    mul-float/2addr v2, v3

    int-to-float v6, v4

    div-float/2addr v2, v6

    int-to-float v1, v1

    mul-float/2addr v1, v3

    int-to-float v3, v5

    div-float/2addr v1, v3

    new-instance v6, Landroid/graphics/Matrix;

    invoke-direct {v6}, Landroid/graphics/Matrix;-><init>()V

    invoke-virtual {v6, v2, v1}, Landroid/graphics/Matrix;->postScale(FF)Z

    iget-object v1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->O001I:Landroid/graphics/Bitmap;

    const/4 v3, 0x0

    const/4 v7, 0x1

    const/4 v2, 0x0

    invoke-static/range {v1 .. v7}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v1

    iput-object v1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->O001I:Landroid/graphics/Bitmap;

    iput-object v1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->XXO:Landroid/graphics/Bitmap;

    iput-object v1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->iXiiiO:Landroid/graphics/Bitmap;

    iput v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->OX110i:I

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    iput v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->OO:F

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0606f9

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->XX1Oi:Landroid/graphics/Paint;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->XX1Oi:Landroid/graphics/Paint;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, v2}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->Ii1iii0:Landroid/graphics/Paint;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, v2}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->iiiO:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->iiiO:Landroid/graphics/Paint;

    iget v1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->Ii0i:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X11I:Landroid/graphics/Paint;

    const/high16 v1, 0x40400000    # 3.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X11I:Landroid/graphics/Paint;

    const/16 v3, 0xff

    const/16 v4, 0x33

    invoke-virtual {v0, v3, v4, v4, v4}, Landroid/graphics/Paint;->setARGB(IIII)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X11I:Landroid/graphics/Paint;

    const/high16 v5, 0x41e00000    # 28.0f

    invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X11I:Landroid/graphics/Paint;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X11I:Landroid/graphics/Paint;

    iget v6, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->Ii0i:I

    invoke-virtual {v0, v6}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X11I:Landroid/graphics/Paint;

    sget-object v6, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v6}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X100O:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X100O:Landroid/graphics/Paint;

    invoke-virtual {v0, v3, v4, v4, v4}, Landroid/graphics/Paint;->setARGB(IIII)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X100O:Landroid/graphics/Paint;

    invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X100O:Landroid/graphics/Paint;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X100O:Landroid/graphics/Paint;

    iget v1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->Ii0i:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X100O:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->RIGHT:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    return-void
.end method

.method public O10IXXX0X(JJ)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "start",
            "end"
        }
    .end annotation

    const-wide/16 v0, 0x3e8

    div-long/2addr p1, v0

    iput-wide p1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->iOiXi11II:J

    div-long/2addr p3, v0

    iput-wide p3, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X00XIX1:J

    return-void
.end method

.method public final OIX0iXi(Landroid/view/MotionEvent;)V
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "ev"
        }
    .end annotation

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const v1, 0xff00

    and-int/2addr v0, v1

    shr-int/lit8 v0, v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v1

    iget v2, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->IO:I

    if-ne v1, v2, :cond_1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v1

    iput v1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->XO0X10iO:F

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->IO:I

    :cond_1
    return-void
.end method

.method public final OIi0(D)F
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "normalizedCoord"
        }
    .end annotation

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    int-to-double v0, v0

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v3

    sub-int/2addr v2, v3

    int-to-double v2, v2

    mul-double/2addr p1, v2

    add-double/2addr v0, p1

    double-to-float p1, v0

    return p1
.end method

.method public final OXO1()V
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    :cond_0
    return-void
.end method

.method public final X0O(Landroid/view/MotionEvent;)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "event"
        }
    .end annotation

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->IXI:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "trackTouchEvent: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " x: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->IO:I

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    :try_start_0
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    sget-object v0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;->MIN:Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;

    iget-object v2, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->XXiIiX10:Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X1ii(FI)D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->setNormalizedMinValue(D)V

    return-void

    :cond_1
    sget-object v0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;->MAX:Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;

    iget-object v2, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->XXiIiX10:Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0, p1, v1}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X1ii(FI)D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->setNormalizedMaxValue(D)V

    :catch_0
    :cond_2
    :goto_0
    return-void
.end method

.method public final X1ii(FI)D
    .locals 18
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "screenCoord",
            "position"
        }
    .end annotation

    move-object/from16 v0, p0

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v6

    int-to-float v7, v6

    const/4 v8, 0x0

    cmpg-float v1, v7, v8

    const-wide/16 v9, 0x0

    if-gtz v1, :cond_0

    return-wide v9

    :cond_0
    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X00Xi1X:Z

    move/from16 v1, p1

    float-to-double v11, v1

    iget-wide v2, v0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->XXX11i:D

    invoke-virtual {v0, v2, v3}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->OIi0(D)F

    move-result v13

    iget-wide v2, v0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X1IX:D

    invoke-virtual {v0, v2, v3}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->OIi0(D)F

    move-result v14

    iget-wide v2, v0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->I1:J

    long-to-double v2, v2

    iget-wide v4, v0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X11iII1O1:D

    move v15, v8

    move-wide/from16 v16, v9

    iget-wide v8, v0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->iX1O1:D

    sub-double v8, v4, v8

    div-double/2addr v2, v8

    iget v8, v0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->OX110i:I

    mul-int/lit8 v8, v8, 0x2

    sub-int v8, v6, v8

    int-to-double v8, v8

    mul-double/2addr v2, v8

    const-wide v8, 0x41124f8000000000L    # 300000.0

    cmpl-double v4, v4, v8

    if-lez v4, :cond_1

    new-instance v4, Ljava/text/DecimalFormat;

    const-string v5, "0.0000"

    invoke-direct {v4, v5}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2, v3}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v2

    iput-wide v2, v0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X1:D

    goto :goto_0

    :cond_1
    const-wide/high16 v4, 0x3fe0000000000000L    # 0.5

    add-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->round(D)J

    move-result-wide v2

    long-to-double v2, v2

    iput-wide v2, v0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X1:D

    :goto_0
    const/4 v8, 0x1

    if-nez p2, :cond_8

    iget-wide v2, v0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->XXX11i:D

    const-wide/high16 v4, 0x3fe0000000000000L    # 0.5

    invoke-virtual/range {v0 .. v5}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->XOO0ii0(FDD)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-wide v1, v0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->XXX11i:D

    return-wide v1

    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr v1, v14

    cmpl-float v1, v1, v15

    if-ltz v1, :cond_3

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr v1, v14

    goto :goto_1

    :cond_3
    move v1, v15

    :goto_1
    invoke-direct {v0}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->getValueLength()I

    move-result v2

    int-to-double v2, v2

    float-to-double v4, v1

    iget-wide v9, v0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X1:D

    add-double/2addr v4, v9

    sub-double/2addr v2, v4

    float-to-double v4, v13

    cmpl-double v1, v11, v4

    if-lez v1, :cond_4

    sub-double/2addr v11, v4

    add-double/2addr v11, v4

    goto :goto_2

    :cond_4
    cmpg-double v1, v11, v4

    if-gtz v1, :cond_5

    sub-double v9, v4, v11

    sub-double v11, v4, v9

    :cond_5
    :goto_2
    cmpl-double v1, v11, v2

    if-lez v1, :cond_6

    iput-boolean v8, v0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X00Xi1X:Z

    goto :goto_3

    :cond_6
    move-wide v2, v11

    :goto_3
    iget v1, v0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->OX110i:I

    mul-int/lit8 v4, v1, 0x2

    div-int/lit8 v4, v4, 0x3

    int-to-double v4, v4

    cmpg-double v4, v2, v4

    if-gez v4, :cond_7

    move-wide/from16 v2, v16

    :cond_7
    sub-double v2, v2, v16

    mul-int/lit8 v1, v1, 0x2

    sub-int/2addr v6, v1

    int-to-double v4, v6

    div-double v4, v2, v4

    move-wide/from16 v8, v16

    invoke-static {v8, v9, v4, v5}, Ljava/lang/Math;->max(DD)D

    move-result-wide v4

    const-wide/high16 v10, 0x3ff0000000000000L    # 1.0

    invoke-static {v10, v11, v4, v5}, Ljava/lang/Math;->min(DD)D

    move-result-wide v4

    iput-wide v4, v0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X0i1O:D

    sub-float/2addr v7, v15

    float-to-double v4, v7

    div-double/2addr v2, v4

    invoke-static {v8, v9, v2, v3}, Ljava/lang/Math;->max(DD)D

    move-result-wide v1

    invoke-static {v10, v11, v1, v2}, Ljava/lang/Math;->min(DD)D

    move-result-wide v1

    return-wide v1

    :cond_8
    iget-wide v2, v0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X1IX:D

    const-wide/high16 v4, 0x3fe0000000000000L    # 0.5

    move/from16 v1, p1

    invoke-virtual/range {v0 .. v5}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->IiI10X(FDD)Z

    move-result v1

    if-eqz v1, :cond_9

    iget-wide v1, v0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X1IX:D

    return-wide v1

    :cond_9
    invoke-direct {v0}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->getValueLength()I

    move-result v1

    int-to-double v1, v1

    float-to-double v3, v13

    iget-wide v9, v0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X1:D

    add-double/2addr v3, v9

    sub-double/2addr v1, v3

    float-to-double v3, v14

    cmpl-double v5, v11, v3

    if-lez v5, :cond_a

    sub-double/2addr v11, v3

    add-double/2addr v11, v3

    goto :goto_4

    :cond_a
    cmpg-double v5, v11, v3

    if-gtz v5, :cond_b

    sub-double v9, v3, v11

    sub-double v11, v3, v9

    :cond_b
    :goto_4
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v3

    int-to-double v3, v3

    sub-double/2addr v3, v11

    cmpl-double v5, v3, v1

    if-lez v5, :cond_c

    iput-boolean v8, v0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X00Xi1X:Z

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v3

    int-to-double v3, v3

    sub-double v11, v3, v1

    move-wide v8, v1

    goto :goto_5

    :cond_c
    move-wide v8, v3

    :goto_5
    iget v1, v0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->OX110i:I

    mul-int/lit8 v1, v1, 0x2

    div-int/lit8 v1, v1, 0x3

    int-to-double v1, v1

    cmpg-double v1, v8, v1

    if-gez v1, :cond_d

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-double v11, v1

    const-wide/16 v8, 0x0

    :cond_d
    const-wide/16 v1, 0x0

    sub-double/2addr v8, v1

    iget v3, v0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->OX110i:I

    mul-int/lit8 v3, v3, 0x2

    sub-int/2addr v6, v3

    int-to-double v3, v6

    div-double/2addr v8, v3

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    sub-double v9, v3, v8

    invoke-static {v1, v2, v9, v10}, Ljava/lang/Math;->max(DD)D

    move-result-wide v5

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->min(DD)D

    move-result-wide v5

    iput-wide v5, v0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->iIXi1iiXI:D

    sub-double/2addr v11, v1

    sub-float/2addr v7, v15

    float-to-double v5, v7

    div-double/2addr v11, v5

    invoke-static {v1, v2, v11, v12}, Ljava/lang/Math;->max(DD)D

    move-result-wide v1

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(DD)D

    move-result-wide v1

    return-wide v1
.end method

.method public final XIi00iiXO(FZLandroid/graphics/Canvas;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "screenCoord",
            "pressed",
            "canvas",
            "isLeft"
        }
    .end annotation

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->iXiiiO:Landroid/graphics/Bitmap;

    goto :goto_0

    :cond_0
    if-eqz p4, :cond_1

    iget-object p2, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->O001I:Landroid/graphics/Bitmap;

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->XXO:Landroid/graphics/Bitmap;

    :goto_0
    if-eqz p4, :cond_2

    const/4 p4, 0x0

    goto :goto_1

    :cond_2
    iget p4, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->OX110i:I

    :goto_1
    int-to-float p4, p4

    sub-float/2addr p1, p4

    sget p4, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->iiIOiX:I

    int-to-float p4, p4

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->Ii1iii0:Landroid/graphics/Paint;

    invoke-virtual {p3, p2, p1, p4, v0}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    return-void
.end method

.method public final XO0O10(F)Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;
    .locals 6
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "touchX"
        }
    .end annotation

    iget-wide v2, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->XXX11i:D

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    move-object v0, p0

    move v1, p1

    invoke-virtual/range {v0 .. v5}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->IiI10X(FDD)Z

    move-result p1

    iget-wide v2, v0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X1IX:D

    invoke-virtual/range {v0 .. v5}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->IiI10X(FDD)Z

    move-result v2

    if-eqz p1, :cond_1

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    int-to-float p1, p1

    div-float p1, v1, p1

    const/high16 v0, 0x3f000000    # 0.5f

    cmpl-float p1, p1, v0

    if-lez p1, :cond_0

    sget-object p1, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;->MIN:Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;

    return-object p1

    :cond_0
    sget-object p1, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;->MAX:Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;

    return-object p1

    :cond_1
    if-eqz p1, :cond_2

    sget-object p1, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;->MIN:Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;

    return-object p1

    :cond_2
    if-eqz v2, :cond_3

    sget-object p1, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;->MAX:Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;

    return-object p1

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method

.method public final XOO0ii0(FDD)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "touchX",
            "normalizedThumbValue",
            "scale"
        }
    .end annotation

    invoke-virtual {p0, p2, p3}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->OIi0(D)F

    move-result p2

    sub-float/2addr p1, p2

    iget p2, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->OX110i:I

    int-to-float p2, p2

    sub-float/2addr p1, p2

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    float-to-double p1, p1

    iget p3, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->OO:F

    float-to-double v0, p3

    mul-double/2addr v0, p4

    cmpg-double p1, p1, v0

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public XXI()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->Ii0X0X:Z

    return-void
.end method

.method public getSelectedMaxValue()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->iIXi1iiXI:D

    invoke-virtual {p0, v0, v1}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->IO(D)J

    move-result-wide v0

    return-wide v0
.end method

.method public getSelectedMinValue()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X0i1O:D

    invoke-virtual {p0, v0, v1}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->IO(D)J

    move-result-wide v0

    return-wide v0
.end method

.method public final iO(Landroid/graphics/Canvas;)V
    .locals 6
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "canvas"
        }
    .end annotation

    iget-wide v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->iOiXi11II:J

    invoke-static {v0, v1}, Lcom/android/mltcode/paycertificationapi/OOXOXI;->XIi00iiXO(J)Ljava/lang/String;

    move-result-object v0

    iget-wide v1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X00XIX1:J

    invoke-static {v1, v2}, Lcom/android/mltcode/paycertificationapi/OOXOXI;->XIi00iiXO(J)Ljava/lang/String;

    move-result-object v1

    iget-wide v2, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->XXX11i:D

    invoke-virtual {p0, v2, v3}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->OIi0(D)F

    move-result v2

    sget v3, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->XOO0XOOii:I

    int-to-float v4, v3

    iget-object v5, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X11I:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v2, v4, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    iget-wide v4, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X1IX:D

    invoke-virtual {p0, v4, v5}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->OIi0(D)F

    move-result v0

    int-to-float v2, v3

    iget-object v3, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X100O:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v0, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 10
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "DrawAllocation"
        }
    .end annotation

    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "canvas"
        }
    .end annotation

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float v0, v0

    iget-wide v1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->XXX11i:D

    invoke-virtual {p0, v1, v2}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->OIi0(D)F

    move-result v4

    iget-wide v1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X1IX:D

    invoke-virtual {p0, v1, v2}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->OIi0(D)F

    move-result v6

    new-instance v1, Landroid/graphics/Rect;

    const/4 v2, 0x0

    float-to-int v2, v2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    float-to-int v5, v4

    const/4 v9, 0x0

    invoke-direct {v1, v2, v3, v5, v9}, Landroid/graphics/Rect;-><init>(IIII)V

    new-instance v2, Landroid/graphics/Rect;

    float-to-int v3, v6

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v5

    float-to-int v0, v0

    invoke-direct {v2, v3, v5, v0, v9}, Landroid/graphics/Rect;-><init>(IIII)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->XX1Oi:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v0}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->XX1Oi:Landroid/graphics/Paint;

    invoke-virtual {p1, v2, v0}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    iget v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->i0X000X0O:F

    sget v1, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->iiIOiX:I

    int-to-float v2, v1

    add-float v5, v0, v2

    const/high16 v2, 0x40000000    # 2.0f

    invoke-static {v2}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result v3

    int-to-float v3, v3

    add-float/2addr v0, v3

    int-to-float v1, v1

    add-float v7, v0, v1

    iget-object v8, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->iiiO:Landroid/graphics/Paint;

    move-object v3, p1

    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p1

    invoke-static {v2}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result v0

    sub-int/2addr p1, v0

    int-to-float v5, p1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p1

    int-to-float v7, p1

    iget-object v8, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->iiiO:Landroid/graphics/Paint;

    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    iget-wide v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->XXX11i:D

    invoke-virtual {p0, v0, v1}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->OIi0(D)F

    move-result p1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v9, v3, v0}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->XIi00iiXO(FZLandroid/graphics/Canvas;Z)V

    iget-wide v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X1IX:D

    invoke-virtual {p0, v0, v1}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->OIi0(D)F

    move-result p1

    invoke-virtual {p0, p1, v9, v3, v9}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->XIi00iiXO(FZLandroid/graphics/Canvas;Z)V

    invoke-virtual {p0, v3}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->iO(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public onMeasure(II)V
    .locals 1
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

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    goto :goto_0

    :cond_0
    const/16 p1, 0x12c

    :goto_0
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    goto :goto_1

    :cond_1
    const/16 p2, 0x78

    :goto_1
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "parcel"
        }
    .end annotation

    check-cast p1, Landroid/os/Bundle;

    const-string v0, "SUPER"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    const-string v0, "MIN"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->XXX11i:D

    const-string v0, "MAX"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X1IX:D

    const-string v0, "MIN_TIME"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X0i1O:D

    const-string v0, "MAX_TIME"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->iIXi1iiXI:D

    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 4

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "SUPER"

    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v1, "MIN"

    iget-wide v2, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->XXX11i:D

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V

    const-string v1, "MAX"

    iget-wide v2, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X1IX:D

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V

    const-string v1, "MIN_TIME"

    iget-wide v2, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X0i1O:D

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V

    const-string v1, "MAX_TIME"

    iget-wide v2, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->iIXi1iiXI:D

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V

    return-object v0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 10
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "event"
        }
    .end annotation

    iget-boolean v2, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->i11I:Z

    if-eqz v2, :cond_0

    invoke-super/range {p0 .. p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v2

    const/4 v9, 0x1

    if-le v2, v9, :cond_1

    invoke-super/range {p0 .. p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_2

    return v3

    :cond_2
    iget-wide v4, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X11iII1O1:D

    iget-wide v6, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->I1:J

    long-to-double v6, v6

    cmpg-double v2, v4, v6

    if-gtz v2, :cond_3

    invoke-super/range {p0 .. p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    and-int/lit16 v2, v2, 0xff

    if-eqz v2, :cond_e

    if-eq v2, v9, :cond_b

    const/4 v4, 0x2

    if-eq v2, v4, :cond_8

    const/4 v4, 0x3

    if-eq v2, v4, :cond_6

    const/4 v3, 0x5

    if-eq v2, v3, :cond_5

    const/4 v3, 0x6

    if-eq v2, v3, :cond_4

    goto/16 :goto_2

    :cond_4
    invoke-virtual/range {p0 .. p1}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->OIX0iXi(Landroid/view/MotionEvent;)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    goto/16 :goto_2

    :cond_5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v2

    sub-int/2addr v2, v9

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getX(I)F

    move-result v3

    iput v3, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->XO0X10iO:F

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->IO:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    goto/16 :goto_2

    :cond_6
    iget-boolean v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->Ii0X0X:Z

    if-eqz v0, :cond_7

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->XXI()V

    invoke-virtual {p0, v3}, Landroid/view/View;->setPressed(Z)V

    :cond_7
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    goto/16 :goto_2

    :cond_8
    iget-object v2, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->XXiIiX10:Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;

    if-eqz v2, :cond_10

    iget-boolean v2, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->Ii0X0X:Z

    if-eqz v2, :cond_9

    invoke-virtual/range {p0 .. p1}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X0O(Landroid/view/MotionEvent;)V

    goto :goto_0

    :cond_9
    iget v2, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->IO:I

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v2

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getX(I)F

    move-result v2

    iget v3, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->XO0X10iO:F

    sub-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    iget v3, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->iXiX011:I

    int-to-float v3, v3

    cmpl-float v2, v2, v3

    if-lez v2, :cond_a

    invoke-virtual {p0, v9}, Landroid/view/View;->setPressed(Z)V

    sget-object v2, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->IXI:Ljava/lang/String;

    const-string v3, "\u6ca1\u6709\u62d6\u4f4f\u6700\u5927\u6700\u5c0f\u503c"

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->I0iXXO()V

    invoke-virtual/range {p0 .. p1}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X0O(Landroid/view/MotionEvent;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->OXO1()V

    :cond_a
    :goto_0
    iget-boolean v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->IXOIIIO:Z

    if-eqz v0, :cond_10

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->IO0II0i:Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$OXO1;

    if-eqz v0, :cond_10

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->getSelectedMinValue()J

    move-result-wide v2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->getSelectedMaxValue()J

    move-result-wide v4

    iget-boolean v7, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X00Xi1X:Z

    iget-object v8, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->XXiIiX10:Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;

    const/4 v6, 0x2

    move-object v1, p0

    invoke-interface/range {v0 .. v8}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$OXO1;->OXO1(Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;JJIZLcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;)V

    goto/16 :goto_2

    :cond_b
    iget-boolean v2, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->Ii0X0X:Z

    if-eqz v2, :cond_c

    invoke-virtual/range {p0 .. p1}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X0O(Landroid/view/MotionEvent;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->XXI()V

    invoke-virtual {p0, v3}, Landroid/view/View;->setPressed(Z)V

    goto :goto_1

    :cond_c
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->I0iXXO()V

    invoke-virtual/range {p0 .. p1}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X0O(Landroid/view/MotionEvent;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->XXI()V

    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->IO0II0i:Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$OXO1;

    if-eqz v0, :cond_d

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->getSelectedMinValue()J

    move-result-wide v2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->getSelectedMaxValue()J

    move-result-wide v4

    iget-boolean v7, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X00Xi1X:Z

    iget-object v8, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->XXiIiX10:Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;

    const/4 v6, 0x1

    move-object v1, p0

    invoke-interface/range {v0 .. v8}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$OXO1;->OXO1(Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;JJIZLcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;)V

    :cond_d
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->XXiIiX10:Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;

    goto :goto_2

    :cond_e
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v2

    sub-int/2addr v2, v9

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v2

    iput v2, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->IO:I

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v2

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getX(I)F

    move-result v2

    iput v2, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->XO0X10iO:F

    invoke-virtual {p0, v2}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->XO0O10(F)Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;

    move-result-object v2

    iput-object v2, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->XXiIiX10:Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;

    if-nez v2, :cond_f

    invoke-super/range {p0 .. p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    :cond_f
    invoke-virtual {p0, v9}, Landroid/view/View;->setPressed(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->I0iXXO()V

    invoke-virtual/range {p0 .. p1}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X0O(Landroid/view/MotionEvent;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->OXO1()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->IO0II0i:Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$OXO1;

    if-eqz v0, :cond_10

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->getSelectedMinValue()J

    move-result-wide v2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->getSelectedMaxValue()J

    move-result-wide v4

    iget-boolean v7, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X00Xi1X:Z

    iget-object v8, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->XXiIiX10:Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;

    const/4 v6, 0x0

    move-object v1, p0

    invoke-interface/range {v0 .. v8}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$OXO1;->OXO1(Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;JJIZLcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;)V

    :cond_10
    :goto_2
    return v9
.end method

.method public setMinShootTime(J)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "min_cut_time"
        }
    .end annotation

    iput-wide p1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->I1:J

    return-void
.end method

.method public setNormalizedMaxValue(D)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "value"
        }
    .end annotation

    iget-wide v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->XXX11i:D

    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->max(DD)D

    move-result-wide p1

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->min(DD)D

    move-result-wide p1

    const-wide/16 v0, 0x0

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->max(DD)D

    move-result-wide p1

    iput-wide p1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X1IX:D

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setNormalizedMinValue(D)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "value"
        }
    .end annotation

    iget-wide v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X1IX:D

    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->min(DD)D

    move-result-wide p1

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->min(DD)D

    move-result-wide p1

    const-wide/16 v0, 0x0

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->max(DD)D

    move-result-wide p1

    iput-wide p1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->XXX11i:D

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setNotifyWhileDragging(Z)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "flag"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->IXOIIIO:Z

    return-void
.end method

.method public setOnRangeSeekBarChangeListener(Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$OXO1;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "listener"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->IO0II0i:Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$OXO1;

    return-void
.end method

.method public setSelectedMaxValue(J)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "value"
        }
    .end annotation

    iget-wide v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X11iII1O1:D

    iget-wide v2, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->iX1O1:D

    sub-double/2addr v0, v2

    const-wide/16 v2, 0x0

    cmpl-double v0, v2, v0

    if-nez v0, :cond_0

    const-wide/high16 p1, 0x3ff0000000000000L    # 1.0

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->setNormalizedMaxValue(D)V

    return-void

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->I1XOi1(J)D

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->setNormalizedMaxValue(D)V

    return-void
.end method

.method public setSelectedMinValue(J)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "value"
        }
    .end annotation

    iget-wide v0, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->X11iII1O1:D

    iget-wide v2, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->iX1O1:D

    sub-double/2addr v0, v2

    const-wide/16 v2, 0x0

    cmpl-double v0, v2, v0

    if-nez v0, :cond_0

    invoke-virtual {p0, v2, v3}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->setNormalizedMinValue(D)V

    return-void

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->I1XOi1(J)D

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->setNormalizedMinValue(D)V

    return-void
.end method

.method public setTouchDown(Z)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "touchDown"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->i11I:Z

    return-void
.end method
