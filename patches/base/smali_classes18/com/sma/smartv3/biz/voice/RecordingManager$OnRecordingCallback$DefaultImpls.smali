.class public final Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback$DefaultImpls;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation


# direct methods
.method public static onBeforeRecording(Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;)V
    .locals 0
    .param p0    # Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0}, Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;->access$onBeforeRecording$jd(Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;)V

    return-void
.end method

.method public static onRecordResult(Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;Lcom/sma/smartv3/model/AITranslation;)V
    .locals 0
    .param p0    # Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/sma/smartv3/model/AITranslation;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;->access$onRecordResult$jd(Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;Lcom/sma/smartv3/model/AITranslation;)V

    return-void
.end method

.method public static onRecordResultError(Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;Ljava/lang/String;)V
    .locals 1
    .param p0    # Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;
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

    invoke-static {p0, p1}, Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;->access$onRecordResultError$jd(Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;Ljava/lang/String;)V

    return-void
.end method

.method public static onRecordResultLanguage(Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;Lcom/sma/smartv3/model/AISpeech;)V
    .locals 0
    .param p0    # Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/sma/smartv3/model/AISpeech;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;->access$onRecordResultLanguage$jd(Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;Lcom/sma/smartv3/model/AISpeech;)V

    return-void
.end method

.method public static onStartRecording(Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;)V
    .locals 0
    .param p0    # Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0}, Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;->access$onStartRecording$jd(Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;)V

    return-void
.end method

.method public static onStopRecording(Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;)V
    .locals 0
    .param p0    # Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0}, Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;->access$onStopRecording$jd(Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;)V

    return-void
.end method
