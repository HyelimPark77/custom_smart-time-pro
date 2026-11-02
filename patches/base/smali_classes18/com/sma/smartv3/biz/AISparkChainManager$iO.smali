.class public final Lcom/sma/smartv3/biz/AISparkChainManager$iO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/iflytek/sparkchain/core/asr/AsrCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/AISparkChainManager;->XXX11i(Lcom/android/mltcode/paycertificationapi/O1XIiIO;ILjava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/model/AITranslation;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/model/AITranslation;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/biz/AISparkChainManager$iO;->OXO1:Lcom/sma/smartv3/model/AITranslation;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onBeginOfSpeech()V
    .locals 0

    return-void
.end method

.method public onEndOfSpeech()V
    .locals 0

    return-void
.end method

.method public onError(Lcom/iflytek/sparkchain/core/asr/ASR$ASRError;Ljava/lang/Object;)V
    .locals 3

    const-string p2, "error"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/asr/ASR$ASRError;->getCode()I

    move-result v0

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/asr/ASR$ASRError;->getErrMsg()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " realTimeSendASRInit TTS.TTSError code ="

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ",  errMsg =  "

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "  "

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    sget-object p2, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {p2}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object p2

    invoke-virtual {p2}, Lcom/sma/smartv3/biz/voice/RecordingManager;->closeBluetooth()V

    sget-object p2, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1:Lcom/sma/smartv3/biz/AISparkChainManager;

    invoke-virtual {p2}, Lcom/sma/smartv3/biz/AISparkChainManager;->X0O()Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/asr/ASR$ASRError;->getErrMsg()Ljava/lang/String;

    move-result-object p1

    const-string v0, "getErrMsg(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, p1}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleError(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onResult(Lcom/iflytek/sparkchain/core/asr/ASR$ASRResult;Ljava/lang/Object;)V
    .locals 3

    const-string p2, "result"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/asr/ASR$ASRResult;->getStatus()I

    move-result v0

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/asr/ASR$ASRResult;->getBestMatchText()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " realTimeSendASRInit result.st = "

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " bestMatchText = "

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/sma/smartv3/biz/AISparkChainManager$iO;->OXO1:Lcom/sma/smartv3/model/AITranslation;

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/asr/ASR$ASRResult;->getBestMatchText()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getBestMatchText(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Lcom/sma/smartv3/model/AITranslation;->setText(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/sma/smartv3/biz/AISparkChainManager$iO;->OXO1:Lcom/sma/smartv3/model/AITranslation;

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/asr/ASR$ASRResult;->getStatus()I

    move-result v0

    invoke-virtual {p2, v0}, Lcom/sma/smartv3/model/AITranslation;->setStatus(I)V

    invoke-static {}, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/asr/ASR$ASRResult;->getBestMatchText()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " realTimeSendASRInit  bestMatchText = "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    sget-object p2, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1:Lcom/sma/smartv3/biz/AISparkChainManager;

    invoke-virtual {p2}, Lcom/sma/smartv3/biz/AISparkChainManager;->X0O()Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    move-result-object p2

    if-eqz p2, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/biz/AISparkChainManager$iO;->OXO1:Lcom/sma/smartv3/model/AITranslation;

    invoke-interface {p2, v0}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleResponse(Ljava/lang/Object;)V

    :cond_0
    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/asr/ASR$ASRResult;->getStatus()I

    move-result p1

    const/4 p2, 0x2

    if-ne p1, p2, :cond_1

    sget-object p1, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lcom/sma/smartv3/biz/voice/RecordingManager;->setRecording(Z)V

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/RecordingManager;->closeBluetooth()V

    :cond_1
    return-void
.end method
