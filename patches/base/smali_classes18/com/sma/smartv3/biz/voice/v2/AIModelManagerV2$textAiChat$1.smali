.class public final Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$textAiChat$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2;->textAiChat(Ljava/lang/String;Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
        "Lcom/sma/smartv3/model/AIAnswer;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic $mAICallback:Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$textAiChat$1;->$mAICallback:Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleError(Ljava/lang/String;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$textAiChat$1;->$mAICallback:Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;

    invoke-interface {v0, p1}, Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;->onAIModelError(Ljava/lang/String;)V

    return-void
.end method

.method public handleResponse(Lcom/sma/smartv3/model/AIAnswer;)V
    .locals 3

    .line 2
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-static {}, Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2;->access$getTAG$p()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " AIChat handleResponse -> "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    if-eqz p1, :cond_1

    .line 3
    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$textAiChat$1;->$mAICallback:Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;

    .line 4
    invoke-virtual {p1}, Lcom/sma/smartv3/model/AIAnswer;->getEnded()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    .line 5
    sget-object v1, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AIAnswer;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->sendTranslationResultOutput(Ljava/lang/String;)V

    .line 6
    invoke-virtual {p1}, Lcom/sma/smartv3/model/AIAnswer;->getText()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;->onComplete(Ljava/lang/String;)V

    return-void

    .line 7
    :cond_0
    invoke-virtual {p1}, Lcom/sma/smartv3/model/AIAnswer;->getText()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;->onProcessComplete(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/sma/smartv3/model/AIAnswer;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$textAiChat$1;->handleResponse(Lcom/sma/smartv3/model/AIAnswer;)V

    return-void
.end method
