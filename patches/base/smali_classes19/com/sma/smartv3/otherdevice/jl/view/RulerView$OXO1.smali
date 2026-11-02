.class public Lcom/sma/smartv3/otherdevice/jl/view/RulerView$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->O10IXXX0X(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/otherdevice/jl/view/RulerView;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/otherdevice/jl/view/RulerView;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            "this$0"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView$OXO1;->IO:Lcom/sma/smartv3/otherdevice/jl/view/RulerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "animation"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView$OXO1;->IO:Lcom/sma/smartv3/otherdevice/jl/view/RulerView;

    invoke-static {v0}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->O00(Lcom/sma/smartv3/otherdevice/jl/view/RulerView;)F

    move-result v1

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    int-to-float p1, p1

    add-float/2addr v1, p1

    invoke-static {v0, v1}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XXI(Lcom/sma/smartv3/otherdevice/jl/view/RulerView;F)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView$OXO1;->IO:Lcom/sma/smartv3/otherdevice/jl/view/RulerView;

    invoke-static {p1}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->O00(Lcom/sma/smartv3/otherdevice/jl/view/RulerView;)F

    move-result p1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView$OXO1;->IO:Lcom/sma/smartv3/otherdevice/jl/view/RulerView;

    invoke-static {v0}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->I0IIOi(Lcom/sma/smartv3/otherdevice/jl/view/RulerView;)I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    cmpl-float p1, p1, v0

    if-ltz p1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView$OXO1;->IO:Lcom/sma/smartv3/otherdevice/jl/view/RulerView;

    invoke-static {p1}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->I0IIOi(Lcom/sma/smartv3/otherdevice/jl/view/RulerView;)I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    invoke-static {p1, v0}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XXI(Lcom/sma/smartv3/otherdevice/jl/view/RulerView;F)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView$OXO1;->IO:Lcom/sma/smartv3/otherdevice/jl/view/RulerView;

    invoke-static {p1}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->O00(Lcom/sma/smartv3/otherdevice/jl/view/RulerView;)F

    move-result p1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView$OXO1;->IO:Lcom/sma/smartv3/otherdevice/jl/view/RulerView;

    invoke-static {v0}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XO0O10(Lcom/sma/smartv3/otherdevice/jl/view/RulerView;)F

    move-result v1

    invoke-static {v0, v1}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X1ii(Lcom/sma/smartv3/otherdevice/jl/view/RulerView;F)F

    move-result v0

    cmpg-float p1, p1, v0

    if-gtz p1, :cond_1

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView$OXO1;->IO:Lcom/sma/smartv3/otherdevice/jl/view/RulerView;

    invoke-static {p1}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XO0O10(Lcom/sma/smartv3/otherdevice/jl/view/RulerView;)F

    move-result v0

    invoke-static {p1, v0}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X1ii(Lcom/sma/smartv3/otherdevice/jl/view/RulerView;F)F

    move-result v0

    invoke-static {p1, v0}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XXI(Lcom/sma/smartv3/otherdevice/jl/view/RulerView;F)V

    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView$OXO1;->IO:Lcom/sma/smartv3/otherdevice/jl/view/RulerView;

    invoke-static {p1}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->O00(Lcom/sma/smartv3/otherdevice/jl/view/RulerView;)F

    move-result v0

    invoke-static {p1, v0}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->I0iXXO(Lcom/sma/smartv3/otherdevice/jl/view/RulerView;F)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView$OXO1;->IO:Lcom/sma/smartv3/otherdevice/jl/view/RulerView;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    return-void
.end method
