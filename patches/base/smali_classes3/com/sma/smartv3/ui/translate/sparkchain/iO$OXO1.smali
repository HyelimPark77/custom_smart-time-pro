.class public final Lcom/sma/smartv3/ui/translate/sparkchain/iO$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/iflytek/sparkchain/core/rtasr/RTASRCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/translate/sparkchain/iO;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/translate/sparkchain/iO;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/translate/sparkchain/iO;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/iO$OXO1;->OXO1:Lcom/sma/smartv3/ui/translate/sparkchain/iO;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onBeginOfSpeech()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/iO$OXO1;->OXO1:Lcom/sma/smartv3/ui/translate/sparkchain/iO;

    invoke-static {v0}, Lcom/sma/smartv3/ui/translate/sparkchain/iO;->XIi00iiXO(Lcom/sma/smartv3/ui/translate/sparkchain/iO;)Lcom/android/mltcode/paycertificationapi/ty0;

    move-result-object v0

    sget-object v1, Lcom/sma/smartv3/ui/translate/sparkchain/O00$iO;->OXO1:Lcom/sma/smartv3/ui/translate/sparkchain/O00$iO;

    invoke-interface {v0, v1}, Lcom/android/mltcode/paycertificationapi/ty0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public onEndOfSpeech()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/iO$OXO1;->OXO1:Lcom/sma/smartv3/ui/translate/sparkchain/iO;

    invoke-static {v0}, Lcom/sma/smartv3/ui/translate/sparkchain/iO;->XIi00iiXO(Lcom/sma/smartv3/ui/translate/sparkchain/iO;)Lcom/android/mltcode/paycertificationapi/ty0;

    move-result-object v0

    sget-object v1, Lcom/sma/smartv3/ui/translate/sparkchain/O00$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/translate/sparkchain/O00$XIi00iiXO;

    invoke-interface {v0, v1}, Lcom/android/mltcode/paycertificationapi/ty0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public onError(Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrError;Ljava/lang/Object;)V
    .locals 4

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrError;->getCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p2

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrError;->getErrMsg()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_1
    move-object v1, p2

    :goto_1
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrError;->getSid()Ljava/lang/String;

    move-result-object p2

    :cond_2
    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v2, p0, Lcom/sma/smartv3/ui/translate/sparkchain/iO$OXO1;->OXO1:Lcom/sma/smartv3/ui/translate/sparkchain/iO;

    invoke-static {v2}, Lcom/sma/smartv3/ui/translate/sparkchain/iO;->OXO1(Lcom/sma/smartv3/ui/translate/sparkchain/iO;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " RTASRError :"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/iO$OXO1;->OXO1:Lcom/sma/smartv3/ui/translate/sparkchain/iO;

    invoke-static {p1}, Lcom/sma/smartv3/ui/translate/sparkchain/iO;->XIi00iiXO(Lcom/sma/smartv3/ui/translate/sparkchain/iO;)Lcom/android/mltcode/paycertificationapi/ty0;

    move-result-object p1

    new-instance p2, Lcom/sma/smartv3/ui/translate/sparkchain/O00$OXO1;

    invoke-direct {p2, v0, v1}, Lcom/sma/smartv3/ui/translate/sparkchain/O00$OXO1;-><init>(Ljava/lang/Integer;Ljava/lang/String;)V

    invoke-interface {p1, p2}, Lcom/android/mltcode/paycertificationapi/ty0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public onResult(Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrResult;Ljava/lang/Object;)V
    .locals 7

    if-nez p1, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/android/mltcode/paycertificationapi/mq4;

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrResult;->getStatus()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrResult;->getData()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrResult;->getSid()Ljava/lang/String;

    move-result-object v3

    const-string p2, "getSid(...)"

    invoke-static {v3, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrResult;->getTransResult()Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtTransResult;

    move-result-object p2

    invoke-virtual {p2}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtTransResult;->getSrc()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrResult;->getTransResult()Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtTransResult;

    move-result-object p2

    invoke-virtual {p2}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtTransResult;->getDst()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrResult;->getTransResult()Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtTransResult;

    move-result-object p1

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtTransResult;->getStatus()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-direct/range {v0 .. v6}, Lcom/android/mltcode/paycertificationapi/mq4;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object p2, p0, Lcom/sma/smartv3/ui/translate/sparkchain/iO$OXO1;->OXO1:Lcom/sma/smartv3/ui/translate/sparkchain/iO;

    invoke-static {p2}, Lcom/sma/smartv3/ui/translate/sparkchain/iO;->OXO1(Lcom/sma/smartv3/ui/translate/sparkchain/iO;)Ljava/lang/String;

    move-result-object p2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " RTASRCallbacks : "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/iO$OXO1;->OXO1:Lcom/sma/smartv3/ui/translate/sparkchain/iO;

    invoke-static {p1}, Lcom/sma/smartv3/ui/translate/sparkchain/iO;->iO(Lcom/sma/smartv3/ui/translate/sparkchain/iO;)Lcom/android/mltcode/paycertificationapi/ry0;

    move-result-object p1

    invoke-interface {p1, v0}, Lcom/android/mltcode/paycertificationapi/ry0;->iO(Ljava/lang/Object;)Z

    return-void
.end method
