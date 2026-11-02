.class public final Lcom/sma/smartv3/view/ArcProgressBar;
.super Lskin/support/widget/SkinCompatView;
.source "SourceFile"


# instance fields
.field public I1:I

.field public Ii1iii0:I

.field public O001I:F

.field public final OO:J

.field public OX110i:F

.field public final X0i1O:F

.field public X100O:I

.field public X11I:I

.field public final X11iII1O1:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final X1IX:Landroid/graphics/Xfermode;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final XOX0O0:F

.field public XX1Oi:Landroid/animation/ValueAnimator;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public XXO:I

.field public final XXX11i:Landroid/graphics/RectF;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public iIXi1iiXI:I

.field public iX1O1:I

.field public iXiX011:I

.field public iXiiiO:I

.field public iiiO:I


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

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/view/ArcProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/view/ArcProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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
    invoke-direct {p0, p1, p2, p3}, Lskin/support/widget/SkinCompatView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    new-instance p3, Landroid/graphics/Paint;

    invoke-direct {p3}, Landroid/graphics/Paint;-><init>()V

    iput-object p3, p0, Lcom/sma/smartv3/view/ArcProgressBar;->X11iII1O1:Landroid/graphics/Paint;

    .line 5
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/view/ArcProgressBar;->XXX11i:Landroid/graphics/RectF;

    .line 6
    new-instance v0, Landroid/graphics/PorterDuffXfermode;

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v0, v1}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    iput-object v0, p0, Lcom/sma/smartv3/view/ArcProgressBar;->X1IX:Landroid/graphics/Xfermode;

    const/high16 v0, 0x3f800000    # 1.0f

    .line 7
    invoke-static {v0}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result v1

    int-to-float v1, v1

    iput v1, p0, Lcom/sma/smartv3/view/ArcProgressBar;->X0i1O:F

    .line 8
    invoke-static {v0}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result v1

    iput v1, p0, Lcom/sma/smartv3/view/ArcProgressBar;->iIXi1iiXI:I

    .line 9
    invoke-static {v0}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/ArcProgressBar;->iXiX011:I

    const v0, 0x3d4ccccd    # 0.05f

    .line 10
    iput v0, p0, Lcom/sma/smartv3/view/ArcProgressBar;->O001I:F

    .line 11
    new-instance v0, Landroid/animation/ValueAnimator;

    invoke-direct {v0}, Landroid/animation/ValueAnimator;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/view/ArcProgressBar;->XX1Oi:Landroid/animation/ValueAnimator;

    const-wide/16 v0, 0x3e8

    .line 12
    iput-wide v0, p0, Lcom/sma/smartv3/view/ArcProgressBar;->OO:J

    const/high16 v0, 0x42c80000    # 100.0f

    .line 13
    iput v0, p0, Lcom/sma/smartv3/view/ArcProgressBar;->XOX0O0:F

    .line 14
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/view/ArcProgressBar;->XIi00iiXO(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x1

    .line 15
    invoke-virtual {p3, p1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 16
    invoke-virtual {p3, p1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 17
    invoke-virtual {p0}, Lcom/sma/smartv3/view/ArcProgressBar;->applySkin()V

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

    .line 18
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/view/ArcProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static final O00(Lcom/sma/smartv3/view/ArcProgressBar;Landroid/animation/ValueAnimator;)V
    .locals 1

    const-string v0, "animation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type kotlin.Float"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/view/ArcProgressBar;->OX110i:F

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/view/ArcProgressBar;->setProgress(F)V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/view/ArcProgressBar;Landroid/animation/ValueAnimator;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/view/ArcProgressBar;->O00(Lcom/sma/smartv3/view/ArcProgressBar;Landroid/animation/ValueAnimator;)V

    return-void
.end method


# virtual methods
.method public final XIi00iiXO(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    sget-object v0, Lcom/sma/smartv3/R$styleable;->ArcProgressBar:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const-string p2, "obtainStyledAttributes(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x5

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/ArcProgressBar;->iiiO:I

    const/4 p2, 0x2

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/ArcProgressBar;->X100O:I

    const/4 p2, 0x1

    iget v1, p0, Lcom/sma/smartv3/view/ArcProgressBar;->iXiX011:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/ArcProgressBar;->iXiX011:I

    const/4 p2, 0x3

    iget v1, p0, Lcom/sma/smartv3/view/ArcProgressBar;->iIXi1iiXI:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/ArcProgressBar;->iIXi1iiXI:I

    const/4 p2, 0x4

    iget v1, p0, Lcom/sma/smartv3/view/ArcProgressBar;->O001I:F

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/ArcProgressBar;->O001I:F

    invoke-virtual {p1, v0, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/ArcProgressBar;->iXiiiO:I

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public final XO0O10(FFJ)V
    .locals 2

    const/4 v0, 0x2

    new-array v0, v0, [F

    const/4 v1, 0x0

    aput p1, v0, v1

    const/4 p1, 0x1

    aput p2, v0, p1

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object p1

    const-string p2, "ofFloat(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/view/ArcProgressBar;->XX1Oi:Landroid/animation/ValueAnimator;

    invoke-virtual {p1, p3, p4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    iget-object p1, p0, Lcom/sma/smartv3/view/ArcProgressBar;->XX1Oi:Landroid/animation/ValueAnimator;

    new-instance p2, Lcom/android/mltcode/paycertificationapi/OXI0;

    invoke-direct {p2, p0}, Lcom/android/mltcode/paycertificationapi/OXI0;-><init>(Lcom/sma/smartv3/view/ArcProgressBar;)V

    invoke-virtual {p1, p2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    iget-object p1, p0, Lcom/sma/smartv3/view/ArcProgressBar;->XX1Oi:Landroid/animation/ValueAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method

.method public applySkin()V
    .locals 3

    invoke-super {p0}, Lskin/support/widget/SkinCompatView;->applySkin()V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget v2, p0, Lcom/sma/smartv3/view/ArcProgressBar;->iXiiiO:I

    invoke-static {v0, v2}, Lcom/android/mltcode/paycertificationapi/hl4;->XIi00iiXO(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/ArcProgressBar;->XXO:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget v2, p0, Lcom/sma/smartv3/view/ArcProgressBar;->iiiO:I

    invoke-static {v0, v2}, Lcom/android/mltcode/paycertificationapi/hl4;->XIi00iiXO(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/ArcProgressBar;->Ii1iii0:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget v1, p0, Lcom/sma/smartv3/view/ArcProgressBar;->X100O:I

    invoke-static {v0, v1}, Lcom/android/mltcode/paycertificationapi/hl4;->XIi00iiXO(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/ArcProgressBar;->X11I:I

    return-void
.end method

.method public final iO(II)V
    .locals 3

    int-to-float p1, p1

    int-to-float p2, p2

    div-float/2addr p1, p2

    const/16 p2, 0x64

    int-to-float p2, p2

    mul-float/2addr p1, p2

    iget p2, p0, Lcom/sma/smartv3/view/ArcProgressBar;->XOX0O0:F

    cmpl-float v0, p1, p2

    if-lez v0, :cond_0

    move p1, p2

    :cond_0
    iget v0, p0, Lcom/sma/smartv3/view/ArcProgressBar;->OX110i:F

    div-float/2addr p1, p2

    iget-wide v1, p0, Lcom/sma/smartv3/view/ArcProgressBar;->OO:J

    invoke-virtual {p0, v0, p1, v1, v2}, Lcom/sma/smartv3/view/ArcProgressBar;->XO0O10(FFJ)V

    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 13
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

    iget-object v2, p0, Lcom/sma/smartv3/view/ArcProgressBar;->X11iII1O1:Landroid/graphics/Paint;

    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    iget v3, p0, Lcom/sma/smartv3/view/ArcProgressBar;->XXO:I

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    iget-object v1, p0, Lcom/sma/smartv3/view/ArcProgressBar;->XXX11i:Landroid/graphics/RectF;

    iget v2, p0, Lcom/sma/smartv3/view/ArcProgressBar;->X0i1O:F

    iget v3, p0, Lcom/sma/smartv3/view/ArcProgressBar;->I1:I

    int-to-float v3, v3

    sub-float/2addr v3, v2

    iget v4, p0, Lcom/sma/smartv3/view/ArcProgressBar;->iX1O1:I

    int-to-float v4, v4

    sub-float/2addr v4, v2

    invoke-virtual {v1, v2, v2, v3, v4}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v1, p0, Lcom/sma/smartv3/view/ArcProgressBar;->XXX11i:Landroid/graphics/RectF;

    iget v2, p0, Lcom/sma/smartv3/view/ArcProgressBar;->iXiX011:I

    int-to-float v3, v2

    int-to-float v2, v2

    iget-object v4, p0, Lcom/sma/smartv3/view/ArcProgressBar;->X11iII1O1:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v3, v2, v4}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    iget-object v1, p0, Lcom/sma/smartv3/view/ArcProgressBar;->X11iII1O1:Landroid/graphics/Paint;

    iget-object v2, p0, Lcom/sma/smartv3/view/ArcProgressBar;->X1IX:Landroid/graphics/Xfermode;

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    new-instance v3, Landroid/graphics/LinearGradient;

    iget v4, p0, Lcom/sma/smartv3/view/ArcProgressBar;->X0i1O:F

    iget v2, p0, Lcom/sma/smartv3/view/ArcProgressBar;->I1:I

    int-to-float v2, v2

    sub-float/2addr v2, v4

    iget v5, p0, Lcom/sma/smartv3/view/ArcProgressBar;->O001I:F

    mul-float v6, v2, v5

    iget v2, p0, Lcom/sma/smartv3/view/ArcProgressBar;->iX1O1:I

    int-to-float v2, v2

    sub-float v7, v2, v4

    iget v8, p0, Lcom/sma/smartv3/view/ArcProgressBar;->Ii1iii0:I

    iget v9, p0, Lcom/sma/smartv3/view/ArcProgressBar;->X11I:I

    sget-object v10, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    move v5, v4

    invoke-direct/range {v3 .. v10}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    iget-object v1, p0, Lcom/sma/smartv3/view/ArcProgressBar;->XXX11i:Landroid/graphics/RectF;

    iget v2, p0, Lcom/sma/smartv3/view/ArcProgressBar;->X0i1O:F

    iget v3, p0, Lcom/sma/smartv3/view/ArcProgressBar;->I1:I

    int-to-float v3, v3

    sub-float/2addr v3, v2

    iget v4, p0, Lcom/sma/smartv3/view/ArcProgressBar;->O001I:F

    mul-float/2addr v3, v4

    iget v4, p0, Lcom/sma/smartv3/view/ArcProgressBar;->iX1O1:I

    int-to-float v4, v4

    sub-float/2addr v4, v2

    invoke-virtual {v1, v2, v2, v3, v4}, Landroid/graphics/RectF;->set(FFFF)V

    :try_start_0
    iget-object v1, p0, Lcom/sma/smartv3/view/ArcProgressBar;->XXX11i:Landroid/graphics/RectF;

    iget v2, p0, Lcom/sma/smartv3/view/ArcProgressBar;->iIXi1iiXI:I

    int-to-float v3, v2

    int-to-float v2, v2

    iget-object v4, p0, Lcom/sma/smartv3/view/ArcProgressBar;->X11iII1O1:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v3, v2, v4}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    iget v1, p0, Lcom/sma/smartv3/view/ArcProgressBar;->O001I:F

    const/high16 v2, 0x3f800000    # 1.0f

    cmpg-float v1, v1, v2

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/sma/smartv3/view/ArcProgressBar;->XXX11i:Landroid/graphics/RectF;

    iget v2, p0, Lcom/sma/smartv3/view/ArcProgressBar;->iXiX011:I

    int-to-float v3, v2

    int-to-float v2, v2

    iget-object v4, p0, Lcom/sma/smartv3/view/ArcProgressBar;->X11iII1O1:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v3, v2, v4}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    goto :goto_0

    :cond_0
    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    iget-object v2, p0, Lcom/sma/smartv3/view/ArcProgressBar;->XXX11i:Landroid/graphics/RectF;

    iget v3, p0, Lcom/sma/smartv3/view/ArcProgressBar;->iXiX011:I

    int-to-float v4, v3

    int-to-float v5, v3

    iget v6, p0, Lcom/sma/smartv3/view/ArcProgressBar;->iIXi1iiXI:I

    int-to-float v7, v6

    int-to-float v8, v6

    int-to-float v9, v6

    int-to-float v6, v6

    int-to-float v10, v3

    int-to-float v3, v3

    const/16 v11, 0x8

    new-array v11, v11, [F

    const/4 v12, 0x0

    aput v4, v11, v12

    const/4 v4, 0x1

    aput v5, v11, v4

    const/4 v4, 0x2

    aput v7, v11, v4

    const/4 v4, 0x3

    aput v8, v11, v4

    const/4 v4, 0x4

    aput v9, v11, v4

    const/4 v4, 0x5

    aput v6, v11, v4

    const/4 v4, 0x6

    aput v10, v11, v4

    const/4 v4, 0x7

    aput v3, v11, v4

    sget-object v3, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {v1, v2, v11, v3}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    iget-object v2, p0, Lcom/sma/smartv3/view/ArcProgressBar;->X11iII1O1:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :goto_0
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    return-void
.end method

.method public onSizeChanged(IIII)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    iput p1, p0, Lcom/sma/smartv3/view/ArcProgressBar;->I1:I

    iput p2, p0, Lcom/sma/smartv3/view/ArcProgressBar;->iX1O1:I

    invoke-virtual {p0}, Lcom/sma/smartv3/view/ArcProgressBar;->applySkin()V

    return-void
.end method

.method public final setProgress(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/view/ArcProgressBar;->O001I:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method
