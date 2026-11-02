.class public final Lcom/sma/smartv3/biz/voice/VoiceManager$sendAISparkChainTranslation$1$doInBackground$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/voice/VoiceManager$sendAISparkChainTranslation$1;->doInBackground()Ljava/lang/Void;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
        "Lcom/sma/smartv3/model/AITranslation;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic $needTransit:Lkotlin/jvm/internal/Ref$BooleanRef;

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
.method public constructor <init>(Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/jvm/internal/Ref$ObjectRef;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/Ref$BooleanRef;",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/biz/voice/VoiceManager$sendAISparkChainTranslation$1$doInBackground$2;->$needTransit:Lkotlin/jvm/internal/Ref$BooleanRef;

    iput-object p2, p0, Lcom/sma/smartv3/biz/voice/VoiceManager$sendAISparkChainTranslation$1$doInBackground$2;->$toLanguage:Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleError(Ljava/lang/String;)V
    .locals 2

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    const v0, 0x7f141286

    invoke-static {v0}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f140bb1

    invoke-static {v1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->sendTranslationResult(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public handleResponse(Lcom/sma/smartv3/model/AITranslation;)V
    .locals 12

    if-eqz p1, :cond_1

    .line 2
    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/VoiceManager$sendAISparkChainTranslation$1$doInBackground$2;->$needTransit:Lkotlin/jvm/internal/Ref$BooleanRef;

    iget-boolean v0, v0, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    if-eqz v0, :cond_0

    .line 3
    sget-object v1, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1:Lcom/sma/smartv3/biz/AISparkChainManager;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AITranslation;->getDst()Ljava/lang/String;

    move-result-object v2

    sget-object v0, Lcom/szabh/smable3/entity/Languages;->INSTANCE:Lcom/szabh/smable3/entity/Languages;

    sget-object v3, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    invoke-virtual {v3}, Lcom/sma/smartv3/biz/voice/VoiceManager;->getMToLanguage()I

    move-result v3

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v0, v3, v5, v4, v5}, Lcom/szabh/smable3/entity/Languages;->formatAISparkTargetLang$default(Lcom/szabh/smable3/entity/Languages;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 4
    new-instance v5, Lcom/sma/smartv3/biz/voice/VoiceManager$sendAISparkChainTranslation$1$doInBackground$2$handleResponse$1;

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/VoiceManager$sendAISparkChainTranslation$1$doInBackground$2;->$toLanguage:Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v5, p1, v0}, Lcom/sma/smartv3/biz/voice/VoiceManager$sendAISparkChainTranslation$1$doInBackground$2$handleResponse$1;-><init>(Lcom/sma/smartv3/model/AITranslation;Lkotlin/jvm/internal/Ref$ObjectRef;)V

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v3, 0x0

    .line 5
    invoke-static/range {v1 .. v7}, Lcom/sma/smartv3/biz/AISparkChainManager;->XXiO0i(Lcom/sma/smartv3/biz/AISparkChainManager;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/O1XIiIO;ILjava/lang/Object;)V

    return-void

    .line 6
    :cond_0
    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AITranslation;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AITranslation;->getDst()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/sma/smartv3/biz/voice/VoiceManager;->sendTranslationResult(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    sget-object v3, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    invoke-virtual {v3}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->initSegmentation()V

    .line 8
    invoke-virtual {p1}, Lcom/sma/smartv3/model/AITranslation;->getDst()Ljava/lang/String;

    move-result-object v4

    .line 9
    iget-object p1, p0, Lcom/sma/smartv3/biz/voice/VoiceManager$sendAISparkChainTranslation$1$doInBackground$2;->$toLanguage:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object p1, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lcom/sma/smartv3/model/LanguageTranslationKt;->getTranslationLanguageTtsName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const/16 v10, 0xc

    const/4 v11, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 10
    const-string v9, "sendAISparkChainTranslation2"

    invoke-static/range {v3 .. v11}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->play$default(Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/sma/smartv3/model/AITranslation;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/voice/VoiceManager$sendAISparkChainTranslation$1$doInBackground$2;->handleResponse(Lcom/sma/smartv3/model/AITranslation;)V

    return-void
.end method
