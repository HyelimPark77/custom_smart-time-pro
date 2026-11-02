.class public final Lcom/sma/smartv3/biz/AISparkChainManager$realTimeSendRTASRInit$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/iflytek/sparkchain/core/rtasr/RTASRCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/AISparkChainManager;->iXiX011(Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/model/AITranslation;

.field public final synthetic XIi00iiXO:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/model/AITranslation;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/biz/AISparkChainManager$realTimeSendRTASRInit$1;->OXO1:Lcom/sma/smartv3/model/AITranslation;

    iput-object p2, p0, Lcom/sma/smartv3/biz/AISparkChainManager$realTimeSendRTASRInit$1;->XIi00iiXO:Ljava/lang/String;

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

    const-string v0, "  sendRTASRDataIdentify error="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " , msg = "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

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
    .locals 6

    const-string p2, "result"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-static {}, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrResult;->getStatus()I

    move-result v1

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrResult;->getTransResult()Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtTransResult;

    move-result-object v2

    invoke-virtual {v2}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtTransResult;->getStatus()I

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "  sendRTASRDataIdentify  result.result="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "  , result.transResult.status = "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "  "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-static {}, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrResult;->getData()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrResult;->getTransResult()Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtTransResult;

    move-result-object v2

    invoke-virtual {v2}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtTransResult;->getSrc()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrResult;->getTransResult()Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtTransResult;

    move-result-object v3

    invoke-virtual {v3}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtTransResult;->getDst()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "  sendRTASRDataIdentify  result.data="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " ,  result.transResult.src = "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " ,  result.transResult.dst = "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object p2, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1:Lcom/sma/smartv3/biz/AISparkChainManager;

    invoke-virtual {p2}, Lcom/sma/smartv3/biz/AISparkChainManager;->IiI10X()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p2, v1}, Lcom/sma/smartv3/biz/AISparkChainManager;->OX110i(Z)V

    :cond_0
    invoke-virtual {p2}, Lcom/sma/smartv3/biz/AISparkChainManager;->OX()Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    invoke-virtual {p2, v2}, Lcom/sma/smartv3/biz/AISparkChainManager;->IXI(Z)V

    iget-object v0, p0, Lcom/sma/smartv3/biz/AISparkChainManager$realTimeSendRTASRInit$1;->OXO1:Lcom/sma/smartv3/model/AITranslation;

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrResult;->getData()Ljava/lang/String;

    move-result-object v3

    const-string v4, "getData(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Lcom/sma/smartv3/model/AITranslation;->setText(Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/sma/smartv3/biz/AISparkChainManager;->O1O()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/sma/smartv3/biz/AISparkChainManager$realTimeSendRTASRInit$1;->OXO1:Lcom/sma/smartv3/model/AITranslation;

    invoke-virtual {p2}, Lcom/sma/smartv3/biz/AISparkChainManager;->OII()Z

    move-result v3

    if-eqz v3, :cond_1

    const-string v3, "..."

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrResult;->getTransResult()Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtTransResult;

    move-result-object v3

    invoke-virtual {v3}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtTransResult;->getDst()Ljava/lang/String;

    move-result-object v3

    const-string v4, "getDst(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    invoke-virtual {v0, v3}, Lcom/sma/smartv3/model/AITranslation;->setDst(Ljava/lang/String;)V

    :cond_2
    iget-object v0, p0, Lcom/sma/smartv3/biz/AISparkChainManager$realTimeSendRTASRInit$1;->OXO1:Lcom/sma/smartv3/model/AITranslation;

    invoke-virtual {v0, v2}, Lcom/sma/smartv3/model/AITranslation;->setStatus(I)V

    invoke-virtual {p2}, Lcom/sma/smartv3/biz/AISparkChainManager;->XX0()Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v3, p0, Lcom/sma/smartv3/biz/AISparkChainManager$realTimeSendRTASRInit$1;->OXO1:Lcom/sma/smartv3/model/AITranslation;

    invoke-interface {v0, v3}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleResponse(Ljava/lang/Object;)V

    :cond_3
    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrResult;->getStatus()I

    move-result v0

    if-eq v0, v1, :cond_4

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrResult;->getTransResult()Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtTransResult;

    move-result-object v0

    invoke-virtual {v0}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtTransResult;->getStatus()I

    move-result v0

    if-ne v0, v1, :cond_6

    :cond_4
    iget-object v0, p0, Lcom/sma/smartv3/biz/AISparkChainManager$realTimeSendRTASRInit$1;->OXO1:Lcom/sma/smartv3/model/AITranslation;

    invoke-virtual {p2}, Lcom/sma/smartv3/biz/AISparkChainManager;->OiIIX101O()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrResult;->getData()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/sma/smartv3/model/AITranslation;->setText(Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/sma/smartv3/biz/AISparkChainManager;->O1O()Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/sma/smartv3/biz/AISparkChainManager$realTimeSendRTASRInit$1;->OXO1:Lcom/sma/smartv3/model/AITranslation;

    invoke-virtual {p2}, Lcom/sma/smartv3/biz/AISparkChainManager;->XiOIii1()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrResult;->getTransResult()Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtTransResult;

    move-result-object v4

    invoke-virtual {v4}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtTransResult;->getDst()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/sma/smartv3/model/AITranslation;->setDst(Ljava/lang/String;)V

    :cond_5
    iget-object v0, p0, Lcom/sma/smartv3/biz/AISparkChainManager$realTimeSendRTASRInit$1;->OXO1:Lcom/sma/smartv3/model/AITranslation;

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/model/AITranslation;->setStatus(I)V

    invoke-virtual {p2}, Lcom/sma/smartv3/biz/AISparkChainManager;->XX0()Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    move-result-object v0

    if-eqz v0, :cond_6

    iget-object v1, p0, Lcom/sma/smartv3/biz/AISparkChainManager$realTimeSendRTASRInit$1;->OXO1:Lcom/sma/smartv3/model/AITranslation;

    invoke-interface {v0, v1}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleResponse(Ljava/lang/Object;)V

    :cond_6
    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrResult;->getStatus()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_7

    invoke-virtual {p2}, Lcom/sma/smartv3/biz/AISparkChainManager;->OiIIX101O()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrResult;->getData()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/sma/smartv3/biz/AISparkChainManager;->IXOIIIO(Ljava/lang/String;)V

    :cond_7
    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrResult;->getTransResult()Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtTransResult;

    move-result-object v0

    invoke-virtual {v0}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtTransResult;->getStatus()I

    move-result v0

    if-ne v0, v1, :cond_8

    invoke-virtual {p2}, Lcom/sma/smartv3/biz/AISparkChainManager;->XiOIii1()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrResult;->getTransResult()Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtTransResult;

    move-result-object v1

    invoke-virtual {v1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtTransResult;->getDst()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/sma/smartv3/biz/AISparkChainManager;->IO0II0i(Ljava/lang/String;)V

    :cond_8
    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrResult;->getStatus()I

    move-result p1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_a

    invoke-virtual {p2}, Lcom/sma/smartv3/biz/AISparkChainManager;->OII()Z

    move-result p1

    if-eqz p1, :cond_a

    invoke-virtual {p2, v2}, Lcom/sma/smartv3/biz/AISparkChainManager;->Ii0i(Z)V

    invoke-virtual {p2}, Lcom/sma/smartv3/biz/AISparkChainManager;->O1O()Z

    move-result p1

    if-eqz p1, :cond_9

    iget-object p1, p0, Lcom/sma/smartv3/biz/AISparkChainManager$realTimeSendRTASRInit$1;->OXO1:Lcom/sma/smartv3/model/AITranslation;

    invoke-virtual {p2}, Lcom/sma/smartv3/biz/AISparkChainManager;->OiIIX101O()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/model/AITranslation;->setText(Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/sma/smartv3/biz/AISparkChainManager;->XiOIii1()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/biz/AISparkChainManager$realTimeSendRTASRInit$1;->XIi00iiXO:Ljava/lang/String;

    new-instance v1, Lcom/sma/smartv3/biz/AISparkChainManager$realTimeSendRTASRInit$1$onResult$1;

    iget-object v3, p0, Lcom/sma/smartv3/biz/AISparkChainManager$realTimeSendRTASRInit$1;->OXO1:Lcom/sma/smartv3/model/AITranslation;

    invoke-direct {v1, v3}, Lcom/sma/smartv3/biz/AISparkChainManager$realTimeSendRTASRInit$1$onResult$1;-><init>(Lcom/sma/smartv3/model/AITranslation;)V

    const-string v3, "cn"

    invoke-virtual {p2, p1, v3, v0, v1}, Lcom/sma/smartv3/biz/AISparkChainManager;->IX1XiI(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {p2, v2}, Lcom/sma/smartv3/biz/AISparkChainManager;->XOIX(Z)V

    return-void

    :cond_9
    iget-object p1, p0, Lcom/sma/smartv3/biz/AISparkChainManager$realTimeSendRTASRInit$1;->OXO1:Lcom/sma/smartv3/model/AITranslation;

    invoke-virtual {p2}, Lcom/sma/smartv3/biz/AISparkChainManager;->OiIIX101O()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/sma/smartv3/model/AITranslation;->setText(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/biz/AISparkChainManager$realTimeSendRTASRInit$1;->OXO1:Lcom/sma/smartv3/model/AITranslation;

    invoke-virtual {p2}, Lcom/sma/smartv3/biz/AISparkChainManager;->XiOIii1()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/sma/smartv3/model/AITranslation;->setDst(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/biz/AISparkChainManager$realTimeSendRTASRInit$1;->OXO1:Lcom/sma/smartv3/model/AITranslation;

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/model/AITranslation;->setStatus(I)V

    invoke-virtual {p2}, Lcom/sma/smartv3/biz/AISparkChainManager;->XX0()Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    move-result-object p1

    if-eqz p1, :cond_a

    iget-object p2, p0, Lcom/sma/smartv3/biz/AISparkChainManager$realTimeSendRTASRInit$1;->OXO1:Lcom/sma/smartv3/model/AITranslation;

    invoke-interface {p1, p2}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleResponse(Ljava/lang/Object;)V

    :cond_a
    return-void
.end method
