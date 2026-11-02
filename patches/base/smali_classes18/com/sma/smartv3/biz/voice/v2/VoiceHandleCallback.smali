.class public interface abstract Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback$DefaultImpls;
    }
.end annotation


# direct methods
.method public static synthetic access$onAIModelAIModelError$jd(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;->onAIModelAIModelError(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic access$onAIModelComplete$jd(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;->onAIModelComplete(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic access$onAIModelProcessComplete$jd(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;->onAIModelProcessComplete(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic access$onIdentificationComplete$jd(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;->onIdentificationComplete(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic access$onIdentificationEndSuccess$jd(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)V
    .locals 0

    invoke-super {p0}, Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;->onIdentificationEndSuccess()V

    return-void
.end method

.method public static synthetic access$onIdentificationError$jd(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;->onIdentificationError(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic access$onIdentificationProcessComplete$jd(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;->onIdentificationProcessComplete(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic access$onIdentificationStartSuccess$jd(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)V
    .locals 0

    invoke-super {p0}, Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;->onIdentificationStartSuccess()V

    return-void
.end method

.method public static synthetic access$onRecordingBeforeRecording$jd(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)V
    .locals 0

    invoke-super {p0}, Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;->onRecordingBeforeRecording()V

    return-void
.end method

.method public static synthetic access$onRecordingResult$jd(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;Lcom/sma/smartv3/model/AITranslation;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;->onRecordingResult(Lcom/sma/smartv3/model/AITranslation;)V

    return-void
.end method

.method public static synthetic access$onRecordingResultError$jd(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;->onRecordingResultError(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic access$onRecordingStartRecording$jd(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)V
    .locals 0

    invoke-super {p0}, Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;->onRecordingStartRecording()V

    return-void
.end method

.method public static synthetic access$onRecordingStop$jd(Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;)V
    .locals 0

    invoke-super {p0}, Lcom/sma/smartv3/biz/voice/v2/VoiceHandleCallback;->onRecordingStop()V

    return-void
.end method


# virtual methods
.method public onAIModelAIModelError(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "msg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onAIModelComplete(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onAIModelProcessComplete(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onIdentificationComplete(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onIdentificationEndSuccess()V
    .locals 0

    return-void
.end method

.method public onIdentificationError(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "msg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onIdentificationProcessComplete(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onIdentificationStartSuccess()V
    .locals 0

    return-void
.end method

.method public onRecordingBeforeRecording()V
    .locals 0

    return-void
.end method

.method public onRecordingResult(Lcom/sma/smartv3/model/AITranslation;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/model/AITranslation;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    return-void
.end method

.method public onRecordingResultError(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onRecordingStartRecording()V
    .locals 0

    return-void
.end method

.method public onRecordingStop()V
    .locals 0

    return-void
.end method
