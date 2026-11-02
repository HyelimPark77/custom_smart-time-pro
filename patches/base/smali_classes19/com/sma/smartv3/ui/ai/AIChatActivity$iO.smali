.class public final Lcom/sma/smartv3/ui/ai/AIChatActivity$iO;
.super Lcom/baidu/ai/speech/realtime/full/download/SimpleDownloader;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/ai/AIChatActivity;->recognition()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/ai/AIChatActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/ai/AIChatActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity$iO;->OXO1:Lcom/sma/smartv3/ui/ai/AIChatActivity;

    invoke-direct {p0}, Lcom/baidu/ai/speech/realtime/full/download/SimpleDownloader;-><init>()V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/ui/ai/AIChatActivity;Lcom/baidu/ai/speech/realtime/full/download/Result;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/ai/AIChatActivity$iO;->XIi00iiXO(Lcom/sma/smartv3/ui/ai/AIChatActivity;Lcom/baidu/ai/speech/realtime/full/download/Result;)V

    return-void
.end method

.method public static final XIi00iiXO(Lcom/sma/smartv3/ui/ai/AIChatActivity;Lcom/baidu/ai/speech/realtime/full/download/Result;)V
    .locals 1

    invoke-virtual {p1}, Lcom/baidu/ai/speech/realtime/full/download/Result;->getResult()Ljava/lang/String;

    move-result-object p1

    const-string v0, "getResult(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->access$addQuestion(Lcom/sma/smartv3/ui/ai/AIChatActivity;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public onFailure(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity$iO;->OXO1:Lcom/sma/smartv3/ui/ai/AIChatActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->dismissLoading()V

    invoke-super {p0, p1}, Lcom/baidu/ai/speech/realtime/full/download/SimpleDownloader;->onFailure(Ljava/lang/String;)V

    return-void
.end method

.method public onMessage(Lcom/baidu/ai/speech/realtime/full/download/Result;)V
    .locals 2

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/baidu/ai/speech/realtime/full/download/SimpleDownloader;->onMessage(Lcom/baidu/ai/speech/realtime/full/download/Result;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity$iO;->OXO1:Lcom/sma/smartv3/ui/ai/AIChatActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->dismissLoading()V

    invoke-virtual {p1}, Lcom/baidu/ai/speech/realtime/full/download/Result;->isFin()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity$iO;->OXO1:Lcom/sma/smartv3/ui/ai/AIChatActivity;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XOO0XOOii;

    invoke-direct {v1, v0, p1}, Lcom/android/mltcode/paycertificationapi/XOO0XOOii;-><init>(Lcom/sma/smartv3/ui/ai/AIChatActivity;Lcom/baidu/ai/speech/realtime/full/download/Result;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/baidu/ai/speech/realtime/full/download/Result;->isError()Z

    return-void
.end method
