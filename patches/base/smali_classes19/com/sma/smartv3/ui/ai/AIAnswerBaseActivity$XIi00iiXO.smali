.class public final Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity$XIi00iiXO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/smartv3/ui/ai/BaseAIActivity$OXO1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->sendAIQuestion(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/sma/smartv3/ui/ai/BaseAIActivity$OXO1<",
        "Lcom/sma/smartv3/model/AIAnswer;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Ljava/lang/String;)V
    .locals 2

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->dismissLoading()V

    iget-object p1, p0, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;

    const v0, 0x7f14117e

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->setBtnGenText(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic XIi00iiXO(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/sma/smartv3/model/AIAnswer;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity$XIi00iiXO;->iO(Lcom/sma/smartv3/model/AIAnswer;)V

    return-void
.end method

.method public iO(Lcom/sma/smartv3/model/AIAnswer;)V
    .locals 2

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->dismissLoading()V

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AIAnswer;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->access$getResultsLayout(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)Landroid/widget/FrameLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->access$getTvContent(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AIAnswer;->getText()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;

    const v0, 0x7f14117e

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->setBtnGenText(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
