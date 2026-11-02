.class public final Lcom/sma/smartv3/view/SlideLockView$SlideIcon;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/view/SlideLockView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "SlideIcon"
.end annotation


# instance fields
.field public I1:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public IO:Z

.field public X0i1O:F

.field public X11iII1O1:Lcom/sma/smartv3/view/SlideLockView$XIi00iiXO;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public X1IX:F

.field public XXX11i:F

.field public final synthetic iIXi1iiXI:Lcom/sma/smartv3/view/SlideLockView;

.field public iX1O1:Landroid/graphics/Paint$FontMetrics;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/view/SlideLockView;Landroid/content/Context;)V
    .locals 8
    .param p1    # Lcom/sma/smartv3/view/SlideLockView;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 1
    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v7}, Lcom/sma/smartv3/view/SlideLockView$SlideIcon;-><init>(Lcom/sma/smartv3/view/SlideLockView;Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/sma/smartv3/view/SlideLockView;Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 8
    .param p1    # Lcom/sma/smartv3/view/SlideLockView;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/util/AttributeSet;",
            ")V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 2
    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v1 .. v7}, Lcom/sma/smartv3/view/SlideLockView$SlideIcon;-><init>(Lcom/sma/smartv3/view/SlideLockView;Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/sma/smartv3/view/SlideLockView;Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/view/SlideLockView;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/util/AttributeSet;",
            "I)V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    iput-object p1, p0, Lcom/sma/smartv3/view/SlideLockView$SlideIcon;->iIXi1iiXI:Lcom/sma/smartv3/view/SlideLockView;

    invoke-direct {p0, p2, p3, p4}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    iput-object p2, p0, Lcom/sma/smartv3/view/SlideLockView$SlideIcon;->I1:Landroid/graphics/Paint;

    .line 5
    invoke-virtual {p2}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object p2

    const-string p3, "getFontMetrics(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/sma/smartv3/view/SlideLockView$SlideIcon;->iX1O1:Landroid/graphics/Paint$FontMetrics;

    .line 6
    iget-object p2, p0, Lcom/sma/smartv3/view/SlideLockView$SlideIcon;->I1:Landroid/graphics/Paint;

    sget-object p3, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 7
    iget-object p2, p0, Lcom/sma/smartv3/view/SlideLockView$SlideIcon;->I1:Landroid/graphics/Paint;

    invoke-static {p1}, Lcom/sma/smartv3/view/SlideLockView;->XOO0ii0(Lcom/sma/smartv3/view/SlideLockView;)I

    move-result p3

    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 8
    iget-object p2, p0, Lcom/sma/smartv3/view/SlideLockView$SlideIcon;->I1:Landroid/graphics/Paint;

    invoke-static {p1}, Lcom/sma/smartv3/view/SlideLockView;->I0IIOi(Lcom/sma/smartv3/view/SlideLockView;)F

    move-result p1

    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    const/4 p1, 0x1

    .line 9
    iput-boolean p1, p0, Lcom/sma/smartv3/view/SlideLockView$SlideIcon;->IO:Z

    return-void
.end method

.method public synthetic constructor <init>(Lcom/sma/smartv3/view/SlideLockView;Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const/4 p3, 0x0

    :cond_0
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_1

    const/4 p4, 0x0

    .line 10
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/view/SlideLockView$SlideIcon;-><init>(Lcom/sma/smartv3/view/SlideLockView;Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public final OXO1()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/sma/smartv3/view/SlideLockView$SlideIcon;->XXX11i:F

    iput v0, p0, Lcom/sma/smartv3/view/SlideLockView$SlideIcon;->X0i1O:F

    iput v0, p0, Lcom/sma/smartv3/view/SlideLockView$SlideIcon;->X1IX:F

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/view/SlideLockView$SlideIcon;->IO:Z

    return-void
.end method

.method public final getEnable()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/view/SlideLockView$SlideIcon;->IO:Z

    return v0
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 4
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    int-to-float v0, v0

    iget-object v1, p0, Lcom/sma/smartv3/view/SlideLockView$SlideIcon;->iX1O1:Landroid/graphics/Paint$FontMetrics;

    iget v2, v1, Landroid/graphics/Paint$FontMetrics;->top:F

    sub-float/2addr v0, v2

    iget v1, v1, Landroid/graphics/Paint$FontMetrics;->bottom:F

    sub-float/2addr v0, v1

    const/4 v1, 0x2

    int-to-float v1, v1

    div-float/2addr v0, v1

    iget-object v1, p0, Lcom/sma/smartv3/view/SlideLockView$SlideIcon;->iIXi1iiXI:Lcom/sma/smartv3/view/SlideLockView;

    invoke-static {v1}, Lcom/sma/smartv3/view/SlideLockView;->IiI10X(Lcom/sma/smartv3/view/SlideLockView;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    iget-object v3, p0, Lcom/sma/smartv3/view/SlideLockView$SlideIcon;->I1:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v2, v0, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    return-void
.end method

.method public onMeasure(II)V
    .locals 5

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p1

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p2

    const/high16 v2, -0x80000000

    const/4 v3, 0x0

    if-ne p2, v2, :cond_1

    iget-object v1, p0, Lcom/sma/smartv3/view/SlideLockView$SlideIcon;->iIXi1iiXI:Lcom/sma/smartv3/view/SlideLockView;

    invoke-static {v1}, Lcom/sma/smartv3/view/SlideLockView;->O00(Lcom/sma/smartv3/view/SlideLockView;)F

    move-result v1

    cmpg-float v1, v1, v3

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/sma/smartv3/view/SlideLockView$SlideIcon;->iIXi1iiXI:Lcom/sma/smartv3/view/SlideLockView;

    invoke-static {v1}, Lcom/sma/smartv3/view/SlideLockView;->OIX0iXi(Lcom/sma/smartv3/view/SlideLockView;)I

    move-result v2

    int-to-float v2, v2

    int-to-float v3, v0

    div-float/2addr v2, v3

    invoke-static {v1, v2}, Lcom/sma/smartv3/view/SlideLockView;->O10IXXX0X(Lcom/sma/smartv3/view/SlideLockView;F)V

    :cond_0
    int-to-float v0, v0

    iget-object v1, p0, Lcom/sma/smartv3/view/SlideLockView$SlideIcon;->iIXi1iiXI:Lcom/sma/smartv3/view/SlideLockView;

    invoke-static {v1}, Lcom/sma/smartv3/view/SlideLockView;->O00(Lcom/sma/smartv3/view/SlideLockView;)F

    move-result v1

    mul-float/2addr v0, v1

    float-to-int v0, v0

    invoke-static {v0, p1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    iget-object v0, p0, Lcom/sma/smartv3/view/SlideLockView$SlideIcon;->iIXi1iiXI:Lcom/sma/smartv3/view/SlideLockView;

    invoke-static {v0}, Lcom/sma/smartv3/view/SlideLockView;->OIX0iXi(Lcom/sma/smartv3/view/SlideLockView;)I

    move-result v0

    invoke-static {v0, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void

    :cond_1
    iget-object v2, p0, Lcom/sma/smartv3/view/SlideLockView$SlideIcon;->iIXi1iiXI:Lcom/sma/smartv3/view/SlideLockView;

    invoke-static {v2}, Lcom/sma/smartv3/view/SlideLockView;->O00(Lcom/sma/smartv3/view/SlideLockView;)F

    move-result v2

    cmpg-float v2, v2, v3

    if-nez v2, :cond_2

    iget-object v2, p0, Lcom/sma/smartv3/view/SlideLockView$SlideIcon;->iIXi1iiXI:Lcom/sma/smartv3/view/SlideLockView;

    int-to-float v3, v1

    int-to-float v4, v0

    div-float/2addr v3, v4

    invoke-static {v2, v3}, Lcom/sma/smartv3/view/SlideLockView;->O10IXXX0X(Lcom/sma/smartv3/view/SlideLockView;F)V

    :cond_2
    int-to-float v0, v0

    iget-object v2, p0, Lcom/sma/smartv3/view/SlideLockView$SlideIcon;->iIXi1iiXI:Lcom/sma/smartv3/view/SlideLockView;

    invoke-static {v2}, Lcom/sma/smartv3/view/SlideLockView;->O00(Lcom/sma/smartv3/view/SlideLockView;)F

    move-result v2

    mul-float/2addr v0, v2

    float-to-int v0, v0

    invoke-static {v0, p1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    invoke-static {v1, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/sma/smartv3/view/SlideLockView$SlideIcon;->IO:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-eqz v0, :cond_4

    if-eq v0, v1, :cond_2

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result p1

    iget v0, p0, Lcom/sma/smartv3/view/SlideLockView$SlideIcon;->XXX11i:F

    sub-float/2addr p1, v0

    iput p1, p0, Lcom/sma/smartv3/view/SlideLockView$SlideIcon;->X0i1O:F

    iget-object p1, p0, Lcom/sma/smartv3/view/SlideLockView$SlideIcon;->X11iII1O1:Lcom/sma/smartv3/view/SlideLockView$XIi00iiXO;

    if-eqz p1, :cond_1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iget v0, p0, Lcom/sma/smartv3/view/SlideLockView$SlideIcon;->X0i1O:F

    float-to-int v0, v0

    invoke-interface {p1, v0}, Lcom/sma/smartv3/view/SlideLockView$XIi00iiXO;->XIi00iiXO(I)V

    :cond_1
    return v1

    :cond_2
    const/4 p1, 0x0

    iput p1, p0, Lcom/sma/smartv3/view/SlideLockView$SlideIcon;->XXX11i:F

    iget v0, p0, Lcom/sma/smartv3/view/SlideLockView$SlideIcon;->X1IX:F

    iget v2, p0, Lcom/sma/smartv3/view/SlideLockView$SlideIcon;->X0i1O:F

    add-float/2addr v0, v2

    iput v0, p0, Lcom/sma/smartv3/view/SlideLockView$SlideIcon;->X1IX:F

    iput p1, p0, Lcom/sma/smartv3/view/SlideLockView$SlideIcon;->X0i1O:F

    iget-object p1, p0, Lcom/sma/smartv3/view/SlideLockView$SlideIcon;->X11iII1O1:Lcom/sma/smartv3/view/SlideLockView$XIi00iiXO;

    if-eqz p1, :cond_3

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iget v0, p0, Lcom/sma/smartv3/view/SlideLockView$SlideIcon;->X1IX:F

    float-to-int v0, v0

    invoke-interface {p1, v0}, Lcom/sma/smartv3/view/SlideLockView$XIi00iiXO;->OXO1(I)V

    :cond_3
    return v1

    :cond_4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/view/SlideLockView$SlideIcon;->XXX11i:F

    :cond_5
    return v1
.end method

.method public final setEnable(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/view/SlideLockView$SlideIcon;->IO:Z

    return-void
.end method

.method public final setListener(Lcom/sma/smartv3/view/SlideLockView$XIi00iiXO;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/view/SlideLockView$XIi00iiXO;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/view/SlideLockView$SlideIcon;->X11iII1O1:Lcom/sma/smartv3/view/SlideLockView$XIi00iiXO;

    return-void
.end method
