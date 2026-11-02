.class public Lcom/sma/smartv3/otherdevice/jl/view/RulerView$XO0O10;
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

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView$XO0O10;->IO:Lcom/sma/smartv3/otherdevice/jl/view/RulerView;

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

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView$XO0O10;->IO:Lcom/sma/smartv3/otherdevice/jl/view/RulerView;

    invoke-static {p1}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IiI10X(Lcom/sma/smartv3/otherdevice/jl/view/RulerView;)Lcom/sma/smartv3/otherdevice/jl/view/RulerView$O00;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView$XO0O10;->IO:Lcom/sma/smartv3/otherdevice/jl/view/RulerView;

    invoke-static {p1}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->IiI10X(Lcom/sma/smartv3/otherdevice/jl/view/RulerView;)Lcom/sma/smartv3/otherdevice/jl/view/RulerView$O00;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView$XO0O10;->IO:Lcom/sma/smartv3/otherdevice/jl/view/RulerView;

    invoke-static {v0}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->XOO0ii0(Lcom/sma/smartv3/otherdevice/jl/view/RulerView;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView$O00;->OXO1(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
