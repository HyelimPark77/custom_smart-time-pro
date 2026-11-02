.class public final Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback$DefaultImpls;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation


# direct methods
.method public static onAIModelAIModelError(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;Ljava/lang/String;)V
    .locals 1
    .param p0    # Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "msg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;->access$onAIModelAIModelError$jd(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;Ljava/lang/String;)V

    return-void
.end method

.method public static onAIModelComplete(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;Ljava/lang/String;)V
    .locals 1
    .param p0    # Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;->access$onAIModelComplete$jd(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;Ljava/lang/String;)V

    return-void
.end method

.method public static onAIModelProcessComplete(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;Ljava/lang/String;)V
    .locals 1
    .param p0    # Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;->access$onAIModelProcessComplete$jd(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;Ljava/lang/String;)V

    return-void
.end method

.method public static onIdentificationComplete(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;Ljava/lang/String;)V
    .locals 1
    .param p0    # Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;->access$onIdentificationComplete$jd(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;Ljava/lang/String;)V

    return-void
.end method

.method public static onIdentificationEndSuccess(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)V
    .locals 0
    .param p0    # Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0}, Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;->access$onIdentificationEndSuccess$jd(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)V

    return-void
.end method

.method public static onIdentificationError(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;Ljava/lang/String;)V
    .locals 1
    .param p0    # Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "msg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;->access$onIdentificationError$jd(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;Ljava/lang/String;)V

    return-void
.end method

.method public static onIdentificationProcessComplete(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;Ljava/lang/String;)V
    .locals 1
    .param p0    # Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;->access$onIdentificationProcessComplete$jd(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;Ljava/lang/String;)V

    return-void
.end method

.method public static onIdentificationStartSuccess(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)V
    .locals 0
    .param p0    # Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0}, Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;->access$onIdentificationStartSuccess$jd(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)V

    return-void
.end method

.method public static onRecordingBeforeRecording(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)V
    .locals 0
    .param p0    # Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0}, Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;->access$onRecordingBeforeRecording$jd(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)V

    return-void
.end method

.method public static onRecordingResult(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;Lcom/sma/smartv3/model/AITranslation;)V
    .locals 0
    .param p0    # Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/sma/smartv3/model/AITranslation;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;->access$onRecordingResult$jd(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;Lcom/sma/smartv3/model/AITranslation;)V

    return-void
.end method

.method public static onRecordingResultError(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;Ljava/lang/String;)V
    .locals 1
    .param p0    # Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;->access$onRecordingResultError$jd(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;Ljava/lang/String;)V

    return-void
.end method

.method public static onRecordingStartRecording(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)V
    .locals 0
    .param p0    # Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0}, Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;->access$onRecordingStartRecording$jd(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)V

    return-void
.end method

.method public static onRecordingStop(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)V
    .locals 0
    .param p0    # Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0}, Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;->access$onRecordingStop$jd(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)V

    return-void
.end method
