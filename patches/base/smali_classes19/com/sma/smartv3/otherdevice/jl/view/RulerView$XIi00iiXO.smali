.class public Lcom/sma/smartv3/otherdevice/jl/view/RulerView$XIi00iiXO;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


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

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView$XIi00iiXO;->IO:Lcom/sma/smartv3/otherdevice/jl/view/RulerView;

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

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView$XIi00iiXO;->IO:Lcom/sma/smartv3/otherdevice/jl/view/RulerView;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/sma/smartv3/otherdevice/jl/view/RulerView;->OIX0iXi(Lcom/sma/smartv3/otherdevice/jl/view/RulerView;Z)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/jl/view/RulerView$XIi00iiXO;->IO:Lcom/sma/smartv3/otherdevice/jl/view/RulerView;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    return-void
.end method
