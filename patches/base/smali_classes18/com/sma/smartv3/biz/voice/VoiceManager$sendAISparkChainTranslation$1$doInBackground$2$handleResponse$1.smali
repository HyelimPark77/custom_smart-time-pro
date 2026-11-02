.class public final Lcom/sma/smartv3/biz/voice/VoiceManager$sendAISparkChainTranslation$1$doInBackground$2$handleResponse$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/voice/VoiceManager$sendAISparkChainTranslation$1$doInBackground$2;->handleResponse(Lcom/sma/smartv3/model/AITranslation;)V
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
.field final synthetic $result:Lcom/sma/smartv3/model/AITranslation;

.field final synthetic $toLanguage:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/model/AITranslation;Lkotlin/jvm/internal/Ref$ObjectRef;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/model/AITranslation;",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/biz/voice/VoiceManager$sendAISparkChainTranslation$1$doInBackground$2$handleResponse$1;->$result:Lcom/sma/smartv3/model/AITranslation;

    iput-object p2, p0, Lcom/sma/smartv3/biz/voice/VoiceManager$sendAISparkChainTranslation$1$doInBackground$2$handleResponse$1;->$toLanguage:Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleError(Ljava/lang/String;)V
    .locals 2

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/VoiceManager$sendAISparkChainTranslation$1$doInBackground$2$handleResponse$1;->$result:Lcom/sma/smartv3/model/AITranslation;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AITranslation;->getText()Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f140bb1

    invoke-static {v1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->sendTranslationResult(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/voice/VoiceManager$sendAISparkChainTranslation$1$doInBackground$2$handleResponse$1;->handleResponse(Ljava/lang/String;)V

    return-void
.end method

.method public handleResponse(Ljava/lang/String;)V
    .locals 11

    if-eqz p1, :cond_0

    .line 2
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 3
    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    iget-object v1, p0, Lcom/sma/smartv3/biz/voice/VoiceManager$sendAISparkChainTranslation$1$doInBackground$2$handleResponse$1;->$result:Lcom/sma/smartv3/model/AITranslation;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AITranslation;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->sendTranslationResult(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    sget-object v2, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    invoke-virtual {v2}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->initSegmentation()V

    .line 5
    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/VoiceManager$sendAISparkChainTranslation$1$doInBackground$2$handleResponse$1;->$toLanguage:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->getTranslationLanguageTtsName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const/16 v9, 0xc

    const/4 v10, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 6
    const-string v8, "sendAISparkChainTranslation"

    move-object v3, p1

    invoke-static/range {v2 .. v10}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->play$default(Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void

    .line 7
    :cond_0
    sget-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/VoiceManager$sendAISparkChainTranslation$1$doInBackground$2$handleResponse$1;->$result:Lcom/sma/smartv3/model/AITranslation;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AITranslation;->getText()Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f140bb1

    invoke-static {v1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->sendTranslationResult(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
