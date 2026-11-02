.class public Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$OXO1;
.super Landroidx/customview/widget/ViewDragHelper$Callback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            "this$0"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$OXO1;->OXO1:Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;

    invoke-direct {p0}, Landroidx/customview/widget/ViewDragHelper$Callback;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(III)I
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "amount",
            "low",
            "high"
        }
    .end annotation

    if-ge p1, p2, :cond_0

    return p2

    :cond_0
    if-le p1, p3, :cond_1

    return p3

    :cond_1
    return p1
.end method

.method public clampViewPositionHorizontal(Landroid/view/View;II)I
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "child",
            "left",
            "dx"
        }
    .end annotation

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result p1

    return p1
.end method

.method public clampViewPositionVertical(Landroid/view/View;II)I
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "child",
            "top",
            "dy"
        }
    .end annotation

    iget-object p1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$OXO1;->OXO1:Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;

    invoke-static {p1}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->IiI10X(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;)I

    move-result p1

    iget-object p3, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$OXO1;->OXO1:Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;

    invoke-static {p3}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->XO0O10(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;)Z

    move-result p3

    if-eqz p3, :cond_0

    iget-object p3, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$OXO1;->OXO1:Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;

    invoke-static {p3}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->I0IIOi(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;)I

    move-result p3

    goto :goto_0

    :cond_0
    iget-object p3, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$OXO1;->OXO1:Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;

    invoke-static {p3}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->O00(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;)I

    move-result p3

    :goto_0
    invoke-virtual {p0, p2, p1, p3}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$OXO1;->OXO1(III)I

    move-result p1

    return p1
.end method

.method public getViewVerticalDragRange(Landroid/view/View;)I
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "child"
        }
    .end annotation

    iget-object p1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$OXO1;->OXO1:Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;

    invoke-static {p1}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->XO0O10(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$OXO1;->OXO1:Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;

    invoke-static {p1}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->I0IIOi(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;)I

    move-result p1

    iget-object v0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$OXO1;->OXO1:Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;

    invoke-static {v0}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->IiI10X(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;)I

    move-result v0

    :goto_0
    sub-int/2addr p1, v0

    return p1

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$OXO1;->OXO1:Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;

    invoke-static {p1}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->O00(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;)I

    move-result p1

    iget-object v0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$OXO1;->OXO1:Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;

    invoke-static {v0}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->IiI10X(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;)I

    move-result v0

    goto :goto_0
.end method

.method public onViewDragStateChanged(I)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "state"
        }
    .end annotation

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$OXO1;->OXO1:Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;

    invoke-static {p1, v0}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->X1ii(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;I)V

    :cond_0
    return-void
.end method

.method public onViewPositionChanged(Landroid/view/View;IIII)V
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
            "changedView",
            "left",
            "top",
            "dx",
            "dy"
        }
    .end annotation

    iget-object p1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$OXO1;->OXO1:Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;

    invoke-static {p1, p3}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->XXI(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;I)V

    return-void
.end method

.method public onViewReleased(Landroid/view/View;FF)V
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "releasedChild",
            "xvel",
            "yvel"
        }
    .end annotation

    const/4 p2, 0x0

    cmpg-float v0, p3, p2

    const/4 v1, 0x4

    const/4 v2, 0x5

    if-gez v0, :cond_0

    iget-object p2, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$OXO1;->OXO1:Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;

    invoke-static {p2}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->IiI10X(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;)I

    move-result p2

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$OXO1;->OXO1:Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;

    invoke-static {v0}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->XO0O10(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$OXO1;->OXO1:Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;

    invoke-static {v0, p1, p3}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->O10IXXX0X(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;Landroid/view/View;F)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p2, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$OXO1;->OXO1:Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;

    invoke-static {p2}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->I0IIOi(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;)I

    move-result p2

    const/4 v1, 0x6

    goto :goto_1

    :cond_1
    cmpl-float p2, p3, p2

    if-nez p2, :cond_3

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result p2

    iget-object p3, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$OXO1;->OXO1:Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;

    invoke-static {p3}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->IiI10X(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;)I

    move-result p3

    sub-int p3, p2, p3

    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    move-result p3

    iget-object v0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$OXO1;->OXO1:Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;

    invoke-static {v0}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->O00(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;)I

    move-result v0

    sub-int/2addr p2, v0

    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result p2

    if-ge p3, p2, :cond_2

    iget-object p2, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$OXO1;->OXO1:Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;

    invoke-static {p2}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->IiI10X(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;)I

    move-result p2

    goto :goto_1

    :cond_2
    iget-object p2, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$OXO1;->OXO1:Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;

    invoke-static {p2}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->O00(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;)I

    move-result p2

    goto :goto_0

    :cond_3
    iget-object p2, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$OXO1;->OXO1:Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;

    invoke-static {p2}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->O00(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;)I

    move-result p2

    :goto_0
    move v1, v2

    :goto_1
    iget-object p3, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$OXO1;->OXO1:Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;

    invoke-static {p3}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->iO(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;)Z

    move-result p3

    if-nez p3, :cond_4

    if-ne v1, v2, :cond_4

    iget-object p2, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$OXO1;->OXO1:Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;

    invoke-static {p2}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->XIi00iiXO(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;)I

    move-result p2

    const/4 v1, 0x3

    :cond_4
    iget-object p3, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$OXO1;->OXO1:Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;

    invoke-static {p3}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->OIX0iXi(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;)Landroidx/customview/widget/ViewDragHelper;

    move-result-object p3

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v0

    invoke-virtual {p3, v0, p2}, Landroidx/customview/widget/ViewDragHelper;->settleCapturedViewAt(II)Z

    move-result p2

    if-eqz p2, :cond_5

    iget-object p2, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$OXO1;->OXO1:Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;

    const/4 p3, 0x2

    invoke-static {p2, p3}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->X1ii(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;I)V

    new-instance p2, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$XO0O10;

    iget-object p3, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$OXO1;->OXO1:Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;

    invoke-direct {p2, p3, p1, v1}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$XO0O10;-><init>(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;Landroid/view/View;I)V

    invoke-static {p1, p2}, Landroidx/core/view/ViewCompat;->postOnAnimation(Landroid/view/View;Ljava/lang/Runnable;)V

    return-void

    :cond_5
    iget-object p1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$OXO1;->OXO1:Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;

    invoke-static {p1, v1}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->X1ii(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;I)V

    return-void
.end method

.method public tryCaptureView(Landroid/view/View;I)Z
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "child",
            "pointerId"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$OXO1;->OXO1:Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;

    invoke-static {v0}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->OIi0(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$OXO1;->OXO1:Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;

    invoke-static {v0}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->IO(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;)Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$OXO1;->OXO1:Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;

    invoke-static {v0}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->OIi0(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;)I

    move-result v0

    const/4 v3, 0x4

    if-ne v0, v3, :cond_2

    iget-object v0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$OXO1;->OXO1:Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;

    invoke-static {v0}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->OXO1(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;)I

    move-result v0

    if-ne v0, p2, :cond_2

    iget-object p2, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$OXO1;->OXO1:Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;

    invoke-static {p2}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->XOO0ii0(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;)Ljava/lang/ref/WeakReference;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/view/View;

    if-eqz p2, :cond_2

    const/4 v0, -0x1

    invoke-virtual {p2, v0}, Landroid/view/View;->canScrollVertically(I)Z

    move-result p2

    if-eqz p2, :cond_2

    return v1

    :cond_2
    iget-object p2, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$OXO1;->OXO1:Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;

    invoke-static {p2}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->I0iXXO(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;)Ljava/lang/ref/WeakReference;

    move-result-object p2

    if-eqz p2, :cond_3

    iget-object p2, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$OXO1;->OXO1:Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;

    invoke-static {p2}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->I0iXXO(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;)Ljava/lang/ref/WeakReference;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p2

    if-ne p2, p1, :cond_3

    return v2

    :cond_3
    return v1
.end method
