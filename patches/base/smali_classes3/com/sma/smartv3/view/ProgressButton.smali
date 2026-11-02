.class public final Lcom/sma/smartv3/view/ProgressButton;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field public I1:I

.field public IO:I

.field public Ii1iii0:F

.field public O001I:I

.field public final X0i1O:Landroid/graphics/Xfermode;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final X11iII1O1:Landroid/graphics/RectF;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public X1IX:I

.field public XXO:I

.field public XXX11i:I

.field public final iIXi1iiXI:F

.field public final iX1O1:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final iXiX011:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public iXiiiO:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/view/ProgressButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 2
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/view/ProgressButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    new-instance p3, Landroid/graphics/Paint;

    invoke-direct {p3}, Landroid/graphics/Paint;-><init>()V

    iput-object p3, p0, Lcom/sma/smartv3/view/ProgressButton;->iX1O1:Landroid/graphics/Paint;

    .line 5
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/view/ProgressButton;->X11iII1O1:Landroid/graphics/RectF;

    .line 6
    invoke-direct {p0}, Lcom/sma/smartv3/view/ProgressButton;->getProgressColor()I

    move-result v0

    invoke-static {p1, v0}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/ProgressButton;->XXX11i:I

    .line 7
    invoke-direct {p0}, Lcom/sma/smartv3/view/ProgressButton;->getBackgroundColor()I

    move-result v0

    invoke-static {p1, v0}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/ProgressButton;->X1IX:I

    .line 8
    new-instance v0, Landroid/graphics/PorterDuffXfermode;

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v0, v1}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    iput-object v0, p0, Lcom/sma/smartv3/view/ProgressButton;->X0i1O:Landroid/graphics/Xfermode;

    const/high16 v0, 0x3f800000    # 1.0f

    .line 9
    invoke-static {v0}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/sma/smartv3/view/ProgressButton;->iIXi1iiXI:F

    .line 10
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/view/ProgressButton;->iXiX011:Landroid/graphics/Paint;

    .line 11
    invoke-direct {p0}, Lcom/sma/smartv3/view/ProgressButton;->getProgressColor()I

    move-result v1

    invoke-static {p1, v1}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v1

    iput v1, p0, Lcom/sma/smartv3/view/ProgressButton;->O001I:I

    .line 12
    invoke-direct {p0}, Lcom/sma/smartv3/view/ProgressButton;->getTextColor()I

    move-result v1

    invoke-static {p1, v1}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v1

    iput v1, p0, Lcom/sma/smartv3/view/ProgressButton;->XXO:I

    .line 13
    const-string v1, ""

    iput-object v1, p0, Lcom/sma/smartv3/view/ProgressButton;->iXiiiO:Ljava/lang/String;

    .line 14
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v1

    sput-boolean v1, Lcom/android/mltcode/paycertificationapi/gk4;->I0IIOi:Z

    .line 15
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/view/ProgressButton;->OXO1(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p2, 0x1

    .line 16
    invoke-virtual {p3, p2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 17
    invoke-virtual {p3, p2}, Landroid/graphics/Paint;->setDither(Z)V

    .line 18
    invoke-virtual {v0, p2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 19
    invoke-virtual {v0, p2}, Landroid/graphics/Paint;->setDither(Z)V

    const/high16 p2, 0x41500000    # 13.0f

    .line 20
    invoke-static {p2}, Lcom/blankj/utilcode/util/ConvertUtils;->dp2px(F)I

    move-result p2

    int-to-float p2, p2

    invoke-virtual {v0, p2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 21
    sget-object p2, Lcom/android/mltcode/paycertificationapi/iiOI111I;->OXO1:Lcom/android/mltcode/paycertificationapi/iiOI111I;

    sget-object p3, Lcom/sma/smartv3/view/text/MyTypeface;->PF_MEDIUM:Lcom/sma/smartv3/view/text/MyTypeface;

    invoke-virtual {p2, p3, p1}, Lcom/android/mltcode/paycertificationapi/iiOI111I;->OXO1(Lcom/sma/smartv3/view/text/MyTypeface;Landroid/content/Context;)Landroid/graphics/Typeface;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 22
    sget-object p1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 23
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/view/ProgressButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic IiI10X(Lcom/sma/smartv3/view/ProgressButton;Ljava/lang/String;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/view/ProgressButton;->XO0O10(Ljava/lang/String;Z)V

    return-void
.end method

.method public static synthetic O00(Lcom/sma/smartv3/view/ProgressButton;IZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/view/ProgressButton;->iO(IZ)V

    return-void
.end method

.method private final getBackgroundColor()I
    .locals 1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->I00()Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x7f0600b4

    return v0

    :cond_0
    const v0, 0x7f06078f

    return v0
.end method

.method private final getProgressColor()I
    .locals 1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->I00()Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x7f06024d

    return v0

    :cond_0
    const v0, 0x7f0600b4

    return v0
.end method

.method private final getTextColor()I
    .locals 1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->I00()Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x7f0607b0

    return v0

    :cond_0
    const v0, 0x7f06024d

    return v0
.end method


# virtual methods
.method public final OXO1(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    sget-object v0, Lcom/sma/smartv3/R$styleable;->ProgressButton:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const-string p2, "obtainStyledAttributes(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/sma/smartv3/view/ProgressButton;->XXX11i:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/ProgressButton;->XXX11i:I

    :cond_0
    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/sma/smartv3/view/ProgressButton;->X1IX:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/ProgressButton;->X1IX:I

    :cond_1
    const/4 p2, 0x3

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_2

    iget v0, p0, Lcom/sma/smartv3/view/ProgressButton;->O001I:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/ProgressButton;->O001I:I

    :cond_2
    const/4 p2, 0x2

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_3

    iget v0, p0, Lcom/sma/smartv3/view/ProgressButton;->XXO:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/view/ProgressButton;->XXO:I

    :cond_3
    return-void
.end method

.method public final XIi00iiXO(Ljava/lang/String;F)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput p2, p0, Lcom/sma/smartv3/view/ProgressButton;->Ii1iii0:F

    iput-object p1, p0, Lcom/sma/smartv3/view/ProgressButton;->iXiiiO:Ljava/lang/String;

    iget-object p1, p0, Lcom/sma/smartv3/view/ProgressButton;->iXiX011:Landroid/graphics/Paint;

    iget p2, p0, Lcom/sma/smartv3/view/ProgressButton;->XXO:I

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final XO0O10(Ljava/lang/String;Z)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "string"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/sma/smartv3/view/ProgressButton;->iXiX011:Landroid/graphics/Paint;

    iget v0, p0, Lcom/sma/smartv3/view/ProgressButton;->XXO:I

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setColor(I)V

    const/high16 p2, 0x3f800000    # 1.0f

    iput p2, p0, Lcom/sma/smartv3/view/ProgressButton;->Ii1iii0:F

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    iput p2, p0, Lcom/sma/smartv3/view/ProgressButton;->Ii1iii0:F

    sget-object p2, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {p2}, Lcom/android/mltcode/paycertificationapi/i72;->I00()Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p2, p0, Lcom/sma/smartv3/view/ProgressButton;->iXiX011:Landroid/graphics/Paint;

    iget v0, p0, Lcom/sma/smartv3/view/ProgressButton;->XXO:I

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lcom/sma/smartv3/view/ProgressButton;->iXiX011:Landroid/graphics/Paint;

    iget v0, p0, Lcom/sma/smartv3/view/ProgressButton;->O001I:I

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setColor(I)V

    :goto_0
    iput-object p1, p0, Lcom/sma/smartv3/view/ProgressButton;->iXiiiO:Ljava/lang/String;

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final iO(IZ)V
    .locals 1

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/sma/smartv3/view/ProgressButton;->iXiX011:Landroid/graphics/Paint;

    iget v0, p0, Lcom/sma/smartv3/view/ProgressButton;->XXO:I

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setColor(I)V

    const/high16 p2, 0x3f800000    # 1.0f

    iput p2, p0, Lcom/sma/smartv3/view/ProgressButton;->Ii1iii0:F

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    iput p2, p0, Lcom/sma/smartv3/view/ProgressButton;->Ii1iii0:F

    sget-object p2, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {p2}, Lcom/android/mltcode/paycertificationapi/i72;->I00()Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p2, p0, Lcom/sma/smartv3/view/ProgressButton;->iXiX011:Landroid/graphics/Paint;

    iget v0, p0, Lcom/sma/smartv3/view/ProgressButton;->XXO:I

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lcom/sma/smartv3/view/ProgressButton;->iXiX011:Landroid/graphics/Paint;

    iget v0, p0, Lcom/sma/smartv3/view/ProgressButton;->O001I:I

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setColor(I)V

    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string p2, "getString(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/view/ProgressButton;->iXiiiO:Ljava/lang/String;

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 6
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x1f

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v1, v0}, Landroid/graphics/Canvas;->saveLayer(Landroid/graphics/RectF;Landroid/graphics/Paint;I)I

    move-result v0

    iget-object v2, p0, Lcom/sma/smartv3/view/ProgressButton;->iX1O1:Landroid/graphics/Paint;

    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    iget v1, p0, Lcom/sma/smartv3/view/ProgressButton;->X1IX:I

    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v1, p0, Lcom/sma/smartv3/view/ProgressButton;->X11iII1O1:Landroid/graphics/RectF;

    iget v2, p0, Lcom/sma/smartv3/view/ProgressButton;->iIXi1iiXI:F

    iget v3, p0, Lcom/sma/smartv3/view/ProgressButton;->IO:I

    int-to-float v3, v3

    sub-float/2addr v3, v2

    iget v4, p0, Lcom/sma/smartv3/view/ProgressButton;->I1:I

    int-to-float v4, v4

    sub-float/2addr v4, v2

    invoke-virtual {v1, v2, v2, v3, v4}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v1, p0, Lcom/sma/smartv3/view/ProgressButton;->X11iII1O1:Landroid/graphics/RectF;

    iget v2, p0, Lcom/sma/smartv3/view/ProgressButton;->I1:I

    int-to-float v3, v2

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    int-to-float v2, v2

    div-float/2addr v2, v4

    iget-object v5, p0, Lcom/sma/smartv3/view/ProgressButton;->iX1O1:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v3, v2, v5}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    iget-object v1, p0, Lcom/sma/smartv3/view/ProgressButton;->iX1O1:Landroid/graphics/Paint;

    iget-object v2, p0, Lcom/sma/smartv3/view/ProgressButton;->X0i1O:Landroid/graphics/Xfermode;

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    iget v2, p0, Lcom/sma/smartv3/view/ProgressButton;->XXX11i:I

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v1, p0, Lcom/sma/smartv3/view/ProgressButton;->X11iII1O1:Landroid/graphics/RectF;

    iget v2, p0, Lcom/sma/smartv3/view/ProgressButton;->IO:I

    int-to-float v2, v2

    iget v3, p0, Lcom/sma/smartv3/view/ProgressButton;->Ii1iii0:F

    mul-float/2addr v2, v3

    iget v3, p0, Lcom/sma/smartv3/view/ProgressButton;->I1:I

    int-to-float v3, v3

    const/4 v5, 0x0

    invoke-virtual {v1, v5, v5, v2, v3}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v1, p0, Lcom/sma/smartv3/view/ProgressButton;->X11iII1O1:Landroid/graphics/RectF;

    iget-object v2, p0, Lcom/sma/smartv3/view/ProgressButton;->iX1O1:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v2}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    iget-object v0, p0, Lcom/sma/smartv3/view/ProgressButton;->iXiiiO:Ljava/lang/String;

    iget v1, p0, Lcom/sma/smartv3/view/ProgressButton;->IO:I

    int-to-float v1, v1

    div-float/2addr v1, v4

    iget v2, p0, Lcom/sma/smartv3/view/ProgressButton;->I1:I

    int-to-float v2, v2

    div-float/2addr v2, v4

    iget-object v3, p0, Lcom/sma/smartv3/view/ProgressButton;->iXiX011:Landroid/graphics/Paint;

    invoke-virtual {v3}, Landroid/graphics/Paint;->getTextSize()F

    move-result v3

    const/high16 v4, 0x40200000    # 2.5f

    div-float/2addr v3, v4

    add-float/2addr v2, v3

    iget-object v3, p0, Lcom/sma/smartv3/view/ProgressButton;->iXiX011:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    return-void
.end method

.method public onSizeChanged(IIII)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    iput p1, p0, Lcom/sma/smartv3/view/ProgressButton;->IO:I

    iput p2, p0, Lcom/sma/smartv3/view/ProgressButton;->I1:I

    return-void
.end method

.method public final setProgress(F)V
    .locals 1

    iput p1, p0, Lcom/sma/smartv3/view/ProgressButton;->Ii1iii0:F

    sget-object v0, Lkotlin/jvm/internal/StringCompanionObject;->OXO1:Lkotlin/jvm/internal/StringCompanionObject;

    const/16 v0, 0x64

    int-to-float v0, v0

    mul-float/2addr p1, v0

    float-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const/4 v0, 0x1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    const-string v0, "%d%%"

    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "format(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/view/ProgressButton;->iXiiiO:Ljava/lang/String;

    iget-object p1, p0, Lcom/sma/smartv3/view/ProgressButton;->iXiX011:Landroid/graphics/Paint;

    iget v0, p0, Lcom/sma/smartv3/view/ProgressButton;->XXO:I

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setProgressDecimalPlaces(F)V
    .locals 1

    iput p1, p0, Lcom/sma/smartv3/view/ProgressButton;->Ii1iii0:F

    const/16 v0, 0x64

    int-to-float v0, v0

    mul-float/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const/4 v0, 0x1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    const-string v0, "%.2f"

    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "format(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "%"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/view/ProgressButton;->iXiiiO:Ljava/lang/String;

    iget-object p1, p0, Lcom/sma/smartv3/view/ProgressButton;->iXiX011:Landroid/graphics/Paint;

    iget v0, p0, Lcom/sma/smartv3/view/ProgressButton;->XXO:I

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method
