.class public final Lcom/sma/smartv3/biz/voice/VoiceManager$sendAISparkChainTranslation$1;
.super Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/voice/VoiceManager;->sendAISparkChainTranslation()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic doInBackground()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager$sendAISparkChainTranslation$1;->doInBackground()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public doInBackground()Ljava/lang/Void;
    .locals 11

    .line 2
    new-instance v0, Lkotlin/jvm/internal/Ref$BooleanRef;

    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$BooleanRef;-><init>()V

    .line 3
    sget-object v1, Lcom/szabh/smable3/entity/Languages;->INSTANCE:Lcom/szabh/smable3/entity/Languages;

    sget-object v2, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    invoke-virtual {v2}, Lcom/sma/smartv3/biz/voice/VoiceManager;->getMLanguage()I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x2

    invoke-static {v1, v3, v4, v5, v4}, Lcom/szabh/smable3/entity/Languages;->formatAISparkTargetLang$default(Lcom/szabh/smable3/entity/Languages;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 4
    new-instance v6, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v6}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    invoke-virtual {v2}, Lcom/sma/smartv3/biz/voice/VoiceManager;->getMToLanguage()I

    move-result v7

    invoke-static {v1, v7, v4, v5, v4}, Lcom/szabh/smable3/entity/Languages;->formatAISparkTargetLang$default(Lcom/szabh/smable3/entity/Languages;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 5
    const-string v1, "cn"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_0

    iget-object v7, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    invoke-static {v7, v1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_0

    .line 6
    iput-object v1, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    const/4 v1, 0x1

    .line 7
    iput-boolean v1, v0, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 8
    :cond_0
    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v7, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    iget-boolean v8, v0, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "AIManager VoiceManager sendAISparkChainTranslation  language = "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, "  toLanguage = "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, "  needTransit = "

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    .line 9
    new-instance v7, Lcom/android/mltcode/paycertificationapi/gq1;

    const/16 v8, 0x3e80

    const/16 v9, 0x10

    invoke-direct {v7, v8, v9, v5}, Lcom/android/mltcode/paycertificationapi/gq1;-><init>(III)V

    .line 10
    invoke-virtual {v2}, Lcom/sma/smartv3/biz/voice/VoiceManager;->getMPcmFile()Ljava/io/File;

    move-result-object v5

    invoke-virtual {v5}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Lcom/sma/smartv3/biz/voice/VoiceManager;->getMWavFile()Ljava/io/File;

    move-result-object v8

    invoke-virtual {v8}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v5, v8}, Lcom/android/mltcode/paycertificationapi/gq1;->OXO1(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    const-string v5, "AIManager VoiceManager sendAISparkChainIdentify  pcm -> wav  "

    invoke-virtual {v1, v5}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    .line 12
    sget-object v1, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1:Lcom/sma/smartv3/biz/AISparkChainManager;

    invoke-virtual {v2}, Lcom/sma/smartv3/biz/voice/VoiceManager;->getMPcmFile()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    const-string v5, "getPath(...)"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    new-instance v7, Lcom/sma/smartv3/biz/voice/VoiceManager$sendAISparkChainTranslation$1$doInBackground$2;

    invoke-direct {v7, v0, v6}, Lcom/sma/smartv3/biz/voice/VoiceManager$sendAISparkChainTranslation$1$doInBackground$2;-><init>(Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/jvm/internal/Ref$ObjectRef;)V

    invoke-virtual {v1, v2, v3, v5, v7}, Lcom/sma/smartv3/biz/AISparkChainManager;->iiiO(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    return-object v4
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/voice/VoiceManager$sendAISparkChainTranslation$1;->onSuccess(Ljava/lang/Void;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Void;)V
    .locals 0

    .line 1
    return-void
.end method
