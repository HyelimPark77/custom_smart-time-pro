.class public Lcom/sma/smartv3/view/ExpandableLayout$XIi00iiXO;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/view/ExpandableLayout;->IO(II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic I1:I

.field public final synthetic IO:I

.field public final synthetic iX1O1:Lcom/sma/smartv3/view/ExpandableLayout;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/view/ExpandableLayout;II)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x1010,
            0x1010
        }
        names = {
            "this$0",
            "val$endHeight",
            "val$startHeight"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/view/ExpandableLayout$XIi00iiXO;->iX1O1:Lcom/sma/smartv3/view/ExpandableLayout;

    iput p2, p0, Lcom/sma/smartv3/view/ExpandableLayout$XIi00iiXO;->IO:I

    iput p3, p0, Lcom/sma/smartv3/view/ExpandableLayout$XIi00iiXO;->I1:I

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

    iget p1, p0, Lcom/sma/smartv3/view/ExpandableLayout$XIi00iiXO;->IO:I

    iget v0, p0, Lcom/sma/smartv3/view/ExpandableLayout$XIi00iiXO;->I1:I

    sub-int/2addr p1, v0

    if-gez p1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/view/ExpandableLayout$XIi00iiXO;->iX1O1:Lcom/sma/smartv3/view/ExpandableLayout;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/sma/smartv3/view/ExpandableLayout;->XIi00iiXO(Lcom/sma/smartv3/view/ExpandableLayout;I)V

    iget-object p1, p0, Lcom/sma/smartv3/view/ExpandableLayout$XIi00iiXO;->iX1O1:Lcom/sma/smartv3/view/ExpandableLayout;

    invoke-static {p1}, Lcom/sma/smartv3/view/ExpandableLayout;->OXO1(Lcom/sma/smartv3/view/ExpandableLayout;)Lcom/sma/smartv3/view/ExpandableLayout$iO;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/sma/smartv3/view/ExpandableLayout$XIi00iiXO;->iX1O1:Lcom/sma/smartv3/view/ExpandableLayout;

    invoke-static {p1}, Lcom/sma/smartv3/view/ExpandableLayout;->OXO1(Lcom/sma/smartv3/view/ExpandableLayout;)Lcom/sma/smartv3/view/ExpandableLayout$iO;

    move-result-object p1

    invoke-interface {p1, v0}, Lcom/sma/smartv3/view/ExpandableLayout$iO;->OXO1(Z)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/view/ExpandableLayout$XIi00iiXO;->iX1O1:Lcom/sma/smartv3/view/ExpandableLayout;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/sma/smartv3/view/ExpandableLayout;->XIi00iiXO(Lcom/sma/smartv3/view/ExpandableLayout;I)V

    iget-object p1, p0, Lcom/sma/smartv3/view/ExpandableLayout$XIi00iiXO;->iX1O1:Lcom/sma/smartv3/view/ExpandableLayout;

    invoke-static {p1}, Lcom/sma/smartv3/view/ExpandableLayout;->OXO1(Lcom/sma/smartv3/view/ExpandableLayout;)Lcom/sma/smartv3/view/ExpandableLayout$iO;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/sma/smartv3/view/ExpandableLayout$XIi00iiXO;->iX1O1:Lcom/sma/smartv3/view/ExpandableLayout;

    invoke-static {p1}, Lcom/sma/smartv3/view/ExpandableLayout;->OXO1(Lcom/sma/smartv3/view/ExpandableLayout;)Lcom/sma/smartv3/view/ExpandableLayout$iO;

    move-result-object p1

    invoke-interface {p1, v0}, Lcom/sma/smartv3/view/ExpandableLayout$iO;->OXO1(Z)V

    :cond_1
    return-void
.end method
