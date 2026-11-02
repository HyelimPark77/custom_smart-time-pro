.class public final Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$microsoftCallBack$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/smartv3/util/MicrosoftSDKManage$iO;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;
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
.method public onIdentifyResults(ILjava/lang/String;)V
    .locals 5

    const-string v0, "str"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-static {}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->access$getTAG$p()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " microsoftCallBack onIdentifyResults -> status = "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " str = "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_0

    sget-object v1, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->isSpeechRecRunning()Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v1, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;

    invoke-virtual {v1, p2}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->setMProcessComplete(Ljava/lang/String;)V

    invoke-static {}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->access$getMIdentificationCallback$p()Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$OnIdentificationCallback;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v1, p2}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$OnIdentificationCallback;->onProcessComplete(Ljava/lang/String;)V

    :cond_0
    const/4 v1, 0x0

    const/4 v2, 0x2

    if-ne p1, v2, :cond_1

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-lez v3, :cond_1

    sget-object v3, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;

    invoke-virtual {v3, v1}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->setSendResults(Z)V

    invoke-virtual {v3, p2}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->setMContentResult(Ljava/lang/String;)V

    :cond_1
    sget-object v3, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    const/4 v4, 0x0

    invoke-static {v3, v4, v0, v4}, Lcom/android/mltcode/paycertificationapi/q62;->OiO0IOX(Lcom/android/mltcode/paycertificationapi/q62;Lcom/szabh/smable3/entity/BleDeviceInfo;ILjava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    if-ne p1, v2, :cond_2

    sget-object v3, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;

    invoke-virtual {v3, v1}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->setSpeechRecRunning(Z)V

    :cond_2
    if-ne p1, v2, :cond_3

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_3

    sget-object v1, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->isSpeechRecRunning()Z

    move-result v1

    if-nez v1, :cond_3

    sget-object v1, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;

    invoke-virtual {v1, v0}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->setSendResults(Z)V

    invoke-static {}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->access$getMIdentificationCallback$p()Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$OnIdentificationCallback;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-interface {v1, p2}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$OnIdentificationCallback;->onComplete(Ljava/lang/String;)V

    :cond_3
    if-ne p1, v2, :cond_4

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_4

    sget-object p1, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->isSpeechRecRunning()Z

    move-result p1

    if-nez p1, :cond_4

    sget-object p1, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->setSendResults(Z)V

    sget-object p1, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->stop()V

    sget-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    const p2, 0x7f141196

    invoke-static {p2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/biz/voice/VoiceManager;->sendTranslationResultInput(Ljava/lang/String;)V

    :cond_4
    return-void
.end method

.method public bridge onIdentifyResultsDetectedLanguage(ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Lcom/sma/smartv3/util/MicrosoftSDKManage$iO;->onIdentifyResultsDetectedLanguage(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onStartTransmission()V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-static {}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->access$getTAG$p()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " onStartTransmission "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->setSendResults(Z)V

    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->setMProcessComplete(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->setMContentResult(Ljava/lang/String;)V

    return-void
.end method

.method public onStopTransmission()V
    .locals 6

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-static {}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->access$getTAG$p()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;

    invoke-virtual {v2}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->getMContentResult()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->isSendResults()Z

    move-result v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " microsoftCallBack onStopTransmission -> mContentResult = "

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " isSendResults = "

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->isSendResults()Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->setSendResults(Z)V

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->setSpeechRecRunning(Z)V

    invoke-virtual {v2}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->getMContentResult()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    invoke-static {}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->access$getMIdentificationCallback$p()Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$OnIdentificationCallback;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v2}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->getMContentResult()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$OnIdentificationCallback;->onComplete(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {v2}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->getMProcessComplete()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_1

    invoke-static {}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->access$getMIdentificationCallback$p()Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$OnIdentificationCallback;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v2}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->getMProcessComplete()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$OnIdentificationCallback;->onComplete(Ljava/lang/String;)V

    return-void

    :cond_1
    sget-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->stop()V

    invoke-static {}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->access$getMIdentificationCallback$p()Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$OnIdentificationCallback;

    move-result-object v0

    if-eqz v0, :cond_2

    const v1, 0x7f141196

    invoke-static {v1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$OnIdentificationCallback;->onIdentificationError(Ljava/lang/String;)V

    :cond_2
    return-void
.end method
