.class public Lcom/sma/smartv3/view/MarqueeTextView$XIi00iiXO;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/view/MarqueeTextView;->OIi0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic I1:Lcom/sma/smartv3/view/MarqueeTextView;

.field public final synthetic IO:I


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/view/MarqueeTextView;I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x1010
        }
        names = {
            "this$0",
            "val$nextIndex"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/view/MarqueeTextView$XIi00iiXO;->I1:Lcom/sma/smartv3/view/MarqueeTextView;

    iput p2, p0, Lcom/sma/smartv3/view/MarqueeTextView$XIi00iiXO;->IO:I

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "animation"
        }
    .end annotation

    iget-object p1, p0, Lcom/sma/smartv3/view/MarqueeTextView$XIi00iiXO;->I1:Lcom/sma/smartv3/view/MarqueeTextView;

    invoke-static {p1}, Lcom/sma/smartv3/view/MarqueeTextView;->OXO1(Lcom/sma/smartv3/view/MarqueeTextView;)Landroid/widget/TextView;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/view/MarqueeTextView$XIi00iiXO;->I1:Lcom/sma/smartv3/view/MarqueeTextView;

    invoke-static {v0}, Lcom/sma/smartv3/view/MarqueeTextView;->O00(Lcom/sma/smartv3/view/MarqueeTextView;)Landroid/widget/TextView;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/sma/smartv3/view/MarqueeTextView;->IiI10X(Lcom/sma/smartv3/view/MarqueeTextView;Landroid/widget/TextView;)V

    iget-object v0, p0, Lcom/sma/smartv3/view/MarqueeTextView$XIi00iiXO;->I1:Lcom/sma/smartv3/view/MarqueeTextView;

    invoke-static {v0, p1}, Lcom/sma/smartv3/view/MarqueeTextView;->XOO0ii0(Lcom/sma/smartv3/view/MarqueeTextView;Landroid/widget/TextView;)V

    iget-object p1, p0, Lcom/sma/smartv3/view/MarqueeTextView$XIi00iiXO;->I1:Lcom/sma/smartv3/view/MarqueeTextView;

    iget v0, p0, Lcom/sma/smartv3/view/MarqueeTextView$XIi00iiXO;->IO:I

    iput v0, p1, Lcom/sma/smartv3/view/MarqueeTextView;->XXX11i:I

    invoke-static {p1}, Lcom/sma/smartv3/view/MarqueeTextView;->O00(Lcom/sma/smartv3/view/MarqueeTextView;)Landroid/widget/TextView;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/view/MarqueeTextView$XIi00iiXO;->I1:Lcom/sma/smartv3/view/MarqueeTextView;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    iget-object p1, p0, Lcom/sma/smartv3/view/MarqueeTextView$XIi00iiXO;->I1:Lcom/sma/smartv3/view/MarqueeTextView;

    invoke-static {p1}, Lcom/sma/smartv3/view/MarqueeTextView;->XO0O10(Lcom/sma/smartv3/view/MarqueeTextView;)Lcom/sma/smartv3/view/MarqueeTextView$iO;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/view/MarqueeTextView$XIi00iiXO;->I1:Lcom/sma/smartv3/view/MarqueeTextView;

    invoke-static {p1}, Lcom/sma/smartv3/view/MarqueeTextView;->XO0O10(Lcom/sma/smartv3/view/MarqueeTextView;)Lcom/sma/smartv3/view/MarqueeTextView$iO;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/view/MarqueeTextView$XIi00iiXO;->I1:Lcom/sma/smartv3/view/MarqueeTextView;

    iget v0, v0, Lcom/sma/smartv3/view/MarqueeTextView;->XXX11i:I

    invoke-interface {p1, v0}, Lcom/sma/smartv3/view/MarqueeTextView$iO;->OXO1(I)V

    :cond_0
    return-void
.end method
