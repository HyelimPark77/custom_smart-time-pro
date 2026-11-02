.class public interface abstract Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/biz/voice/RecordingManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "OnRecordingCallback"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback$DefaultImpls;
    }
.end annotation


# direct methods
.method public static synthetic access$onBeforeRecording$jd(Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;)V
    .locals 0

    invoke-super {p0}, Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;->onBeforeRecording()V

    return-void
.end method

.method public static synthetic access$onRecordResult$jd(Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;Lcom/sma/smartv3/model/AITranslation;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;->onRecordResult(Lcom/sma/smartv3/model/AITranslation;)V

    return-void
.end method

.method public static synthetic access$onRecordResultError$jd(Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;->onRecordResultError(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic access$onRecordResultLanguage$jd(Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;Lcom/sma/smartv3/model/AISpeech;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;->onRecordResultLanguage(Lcom/sma/smartv3/model/AISpeech;)V

    return-void
.end method

.method public static synthetic access$onStartRecording$jd(Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;)V
    .locals 0

    invoke-super {p0}, Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;->onStartRecording()V

    return-void
.end method

.method public static synthetic access$onStopRecording$jd(Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;)V
    .locals 0

    invoke-super {p0}, Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;->onStopRecording()V

    return-void
.end method


# virtual methods
.method public onBeforeRecording()V
    .locals 0

    return-void
.end method

.method public onRecordResult(Lcom/sma/smartv3/model/AITranslation;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/model/AITranslation;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    return-void
.end method

.method public onRecordResultError(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onRecordResultLanguage(Lcom/sma/smartv3/model/AISpeech;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/model/AISpeech;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

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
