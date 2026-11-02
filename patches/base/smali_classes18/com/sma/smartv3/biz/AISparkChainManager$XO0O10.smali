.class public final Lcom/sma/smartv3/biz/AISparkChainManager$XO0O10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/iflytek/sparkchain/core/rtasr/RTASRCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/AISparkChainManager;->iiiO(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V
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

    iput-object p1, p0, Lcom/sma/smartv3/biz/AISparkChainManager$XO0O10;->OXO1:Lcom/sma/smartv3/model/AITranslation;

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

.method public onError(Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrError;Ljava/lang/Object;)V
    .locals 4

    const-string p2, "error"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-static {}, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrError;->getCode()I

    move-result v1

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrError;->getErrMsg()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "  RTASRCallbacks error code ="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " , msg = "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "  "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object p2, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1:Lcom/sma/smartv3/biz/AISparkChainManager;

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lcom/sma/smartv3/biz/AISparkChainManager;->Ii0i(Z)V

    invoke-virtual {p2}, Lcom/sma/smartv3/biz/AISparkChainManager;->XX0()Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrError;->getErrMsg()Ljava/lang/String;

    move-result-object p1

    const-string v0, "getErrMsg(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, p1}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleError(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onResult(Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrResult;Ljava/lang/Object;)V
    .locals 5

    const-string p2, "result"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-static {}, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrResult;->getStatus()I

    move-result v1

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrResult;->getData()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrResult;->getTransResult()Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtTransResult;

    move-result-object v3

    invoke-virtual {v3}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtTransResult;->getStatus()I

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "  RTASRCallbacks result.result="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "  result.data = "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "   result.transResult.status = "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "  "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object p2, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1:Lcom/sma/smartv3/biz/AISparkChainManager;

    invoke-virtual {p2}, Lcom/sma/smartv3/biz/AISparkChainManager;->IiI10X()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Lcom/sma/smartv3/biz/AISparkChainManager;->OX110i(Z)V

    :cond_0
    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrResult;->getTransResult()Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtTransResult;

    move-result-object v0

    invoke-virtual {v0}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtTransResult;->getStatus()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-virtual {p2}, Lcom/sma/smartv3/biz/AISparkChainManager;->OII()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lcom/sma/smartv3/biz/AISparkChainManager;->Ii0i(Z)V

    iget-object v0, p0, Lcom/sma/smartv3/biz/AISparkChainManager$XO0O10;->OXO1:Lcom/sma/smartv3/model/AITranslation;

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrResult;->getTransResult()Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtTransResult;

    move-result-object v1

    invoke-virtual {v1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtTransResult;->getSrc()Ljava/lang/String;

    move-result-object v1

    const-string v2, "getSrc(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/model/AITranslation;->setText(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/biz/AISparkChainManager$XO0O10;->OXO1:Lcom/sma/smartv3/model/AITranslation;

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrResult;->getTransResult()Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtTransResult;

    move-result-object p1

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtTransResult;->getDst()Ljava/lang/String;

    move-result-object p1

    const-string v1, "getDst(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/model/AITranslation;->setDst(Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/sma/smartv3/biz/AISparkChainManager;->XX0()Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p2, p0, Lcom/sma/smartv3/biz/AISparkChainManager$XO0O10;->OXO1:Lcom/sma/smartv3/model/AITranslation;

    invoke-interface {p1, p2}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleResponse(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method
