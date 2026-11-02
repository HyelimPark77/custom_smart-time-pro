.class public Lcom/sma/smartv3/otherdevice/jl/view/RulerView$iO;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XiOIO(Landroid/graphics/Canvas;)V
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

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView$iO;->IO:Lcom/sma/smartv3/otherdevice/jl/view/RulerView;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "animation"
        }
    .end annotation

    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView$iO;->IO:Lcom/sma/smartv3/otherdevice/jl/view/RulerView;

    iget v0, p1, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X00Xi1X:F

    invoke-static {p1}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iO(Lcom/sma/smartv3/otherdevice/jl/view/RulerView;)F

    move-result p1

    cmpl-float p1, v0, p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView$iO;->IO:Lcom/sma/smartv3/otherdevice/jl/view/RulerView;

    invoke-static {p1}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IiI10X(Lcom/sma/smartv3/otherdevice/jl/view/RulerView;)Lcom/sma/smartv3/otherdevice/jl/view/RulerView$O00;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView$iO;->IO:Lcom/sma/smartv3/otherdevice/jl/view/RulerView;

    invoke-static {p1}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IiI10X(Lcom/sma/smartv3/otherdevice/jl/view/RulerView;)Lcom/sma/smartv3/otherdevice/jl/view/RulerView$O00;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView$iO;->IO:Lcom/sma/smartv3/otherdevice/jl/view/RulerView;

    invoke-static {v0}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XOO0ii0(Lcom/sma/smartv3/otherdevice/jl/view/RulerView;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView$O00;->OXO1(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView$iO;->IO:Lcom/sma/smartv3/otherdevice/jl/view/RulerView;

    invoke-static {p1}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->iO(Lcom/sma/smartv3/otherdevice/jl/view/RulerView;)F

    move-result v0

    invoke-static {p1, v0}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->X1ii(Lcom/sma/smartv3/otherdevice/jl/view/RulerView;F)F

    move-result v0

    invoke-static {p1, v0}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XXI(Lcom/sma/smartv3/otherdevice/jl/view/RulerView;F)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView$iO;->IO:Lcom/sma/smartv3/otherdevice/jl/view/RulerView;

    invoke-static {p1}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->O00(Lcom/sma/smartv3/otherdevice/jl/view/RulerView;)F

    move-result v0

    invoke-static {p1, v0}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->I0iXXO(Lcom/sma/smartv3/otherdevice/jl/view/RulerView;F)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView$iO;->IO:Lcom/sma/smartv3/otherdevice/jl/view/RulerView;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IO(Lcom/sma/smartv3/otherdevice/jl/view/RulerView;Z)V

    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView$iO;->IO:Lcom/sma/smartv3/otherdevice/jl/view/RulerView;

    const/high16 v0, -0x40800000    # -1.0f

    invoke-static {p1, v0}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->OIi0(Lcom/sma/smartv3/otherdevice/jl/view/RulerView;F)V

    return-void
.end method
