.class public final Lcom/sma/smartv3/biz/voice/v2/AITranslationManager$translateITS$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;->translateITS(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic $mAICallback:Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;

.field final synthetic $rightLang:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager$translateITS$1;->$mAICallback:Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;

    iput-object p2, p0, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager$translateITS$1;->$rightLang:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleError(Ljava/lang/String;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager$translateITS$1;->$mAICallback:Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;

    const v0, 0x7f1414af

    invoke-static {v0}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;->onAIModelError(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager$translateITS$1;->handleResponse(Ljava/lang/String;)V

    return-void
.end method

.method public handleResponse(Ljava/lang/String;)V
    .locals 12

    if-eqz p1, :cond_0

    .line 2
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager$translateITS$1;->$mAICallback:Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;

    invoke-interface {v0, p1}, Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;->onComplete(Ljava/lang/String;)V

    .line 4
    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v2, p1, v1, v2}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->sendTranslationResult$default(Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 5
    sget-object v3, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    invoke-virtual {v3}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->initSegmentation()V

    .line 6
    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager$translateITS$1;->$rightLang:Ljava/lang/String;

    invoke-static {v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->getTranslationLanguageTtsName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const/16 v10, 0xc

    const/4 v11, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 7
    const-string v9, "translateITS"

    move-object v4, p1

    invoke-static/range {v3 .. v11}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->play$default(Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void

    .line 8
    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager$translateITS$1;->$mAICallback:Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;

    const v0, 0x7f1414af

    invoke-static {v0}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/sma/smartv3/biz/voice/v2/AIModelManagerV2$OnAIModelCallback;->onAIModelError(Ljava/lang/String;)V

    return-void
.end method
