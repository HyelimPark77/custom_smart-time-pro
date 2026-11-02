.class public final Lcom/sma/smartv3/biz/voice/VoiceManager$recordingCallBack$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/biz/voice/VoiceManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onBeforeRecording()V
    .locals 0

    return-void
.end method

.method public onRecordResult(Lcom/sma/smartv3/model/AITranslation;)V
    .locals 10

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AITranslation;->getText()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-static {v0}, Lkotlin/text/StringsKt__StringsKt;->iX1X1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_8

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AITranslation;->getStatus()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_7

    sget-object v2, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    invoke-virtual {v2}, Lcom/sma/smartv3/biz/voice/VoiceManager;->isVoiceAIIdentify()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AITranslation;->getText()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->sendTranslationResultInput(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {v2}, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSupportAIVoiceWatchface()Z

    move-result v0

    const-string v1, "zh"

    const-string v3, "cn"

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AITranslation;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->sendTranslationResultInput(Ljava/lang/String;)V

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    const-string v2, "in"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v0, "id"

    :cond_1
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    sget-object v1, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1:Lcom/sma/smartv3/biz/AISparkChainManager;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AITranslation;->getText()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Lcom/sma/smartv3/biz/voice/VoiceManager$recordingCallBack$1$onRecordResult$1;

    invoke-direct {v2}, Lcom/sma/smartv3/biz/voice/VoiceManager$recordingCallBack$1$onRecordResult$1;-><init>()V

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v1, p1, v0, v3, v2}, Lcom/sma/smartv3/biz/AISparkChainManager;->IX1XiI(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    return-void

    :cond_2
    sget-object v4, Lcom/sma/smartv3/biz/AIWatchFaceManager;->OXO1:Lcom/sma/smartv3/biz/AIWatchFaceManager;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AITranslation;->getText()Ljava/lang/String;

    move-result-object v5

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lcom/sma/smartv3/biz/AIWatchFaceManager;->XiOIii1(Lcom/sma/smartv3/biz/AIWatchFaceManager;Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/O1XIiIO;IILjava/lang/Object;)V

    return-void

    :cond_3
    invoke-virtual {v2}, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSupportEarPhoneVoiceTranslation()Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {v2}, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSupportAIVoiceTranslation()Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_0

    :cond_4
    invoke-virtual {v2, p1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->aISparkChainManagerHandleResponse(Lcom/sma/smartv3/model/AITranslation;)V

    return-void

    :cond_5
    :goto_0
    sget-object v0, Lcom/szabh/smable3/entity/Languages;->INSTANCE:Lcom/szabh/smable3/entity/Languages;

    invoke-virtual {v2}, Lcom/sma/smartv3/biz/voice/VoiceManager;->getMLanguage()I

    move-result v4

    invoke-virtual {v0, v4, v1}, Lcom/szabh/smable3/entity/Languages;->formatAISparkTargetLang(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lcom/sma/smartv3/biz/voice/VoiceManager;->getMToLanguage()I

    move-result v1

    const-string v5, "en"

    invoke-virtual {v0, v1, v5}, Lcom/szabh/smable3/entity/Languages;->formatAISparkTargetLang(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-static {v5, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    sget-object v0, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1:Lcom/sma/smartv3/biz/AISparkChainManager;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AITranslation;->getText()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/biz/voice/VoiceManager$recordingCallBack$1$onRecordResult$2;

    invoke-direct {v2, p1, v5}, Lcom/sma/smartv3/biz/voice/VoiceManager$recordingCallBack$1$onRecordResult$2;-><init>(Lcom/sma/smartv3/model/AITranslation;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v4, v3, v2}, Lcom/sma/smartv3/biz/AISparkChainManager;->IX1XiI(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    return-void

    :cond_6
    invoke-virtual {p1}, Lcom/sma/smartv3/model/AITranslation;->getText()Ljava/lang/String;

    move-result-object v3

    const/16 v7, 0x8

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Lcom/sma/smartv3/biz/voice/VoiceManager;->translateITS$default(Lcom/sma/smartv3/biz/voice/VoiceManager;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    :cond_7
    return-void

    :cond_8
    sget-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    const v0, 0x7f141286

    invoke-static {v0}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {p1, v1, v2}, Lcom/sma/smartv3/biz/voice/VoiceManager;->sendTranslationResult(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void
.end method

.method public onRecordResultError(Ljava/lang/String;)V
    .locals 2

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p1, 0x7f141286

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    invoke-static {p1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object p1

    const v1, 0x7f140bb1

    invoke-static {v1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->sendTranslationResult(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public bridge onRecordResultLanguage(Lcom/sma/smartv3/model/AISpeech;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;->onRecordResultLanguage(Lcom/sma/smartv3/model/AISpeech;)V

    return-void
.end method

.method public onStartRecording()V
    .locals 0

    return-void
.end method

.method public onStopRecording()V
    .locals 0

    return-void
.end method
