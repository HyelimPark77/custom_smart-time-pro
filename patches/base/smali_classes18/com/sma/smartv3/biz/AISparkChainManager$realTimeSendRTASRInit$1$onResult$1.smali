.class public final Lcom/sma/smartv3/biz/AISparkChainManager$realTimeSendRTASRInit$1$onResult$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/AISparkChainManager$realTimeSendRTASRInit$1;->onResult(Lcom/iflytek/sparkchain/core/rtasr/RTASR$RtAsrResult;Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/model/AITranslation;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/model/AITranslation;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/biz/AISparkChainManager$realTimeSendRTASRInit$1$onResult$1;->OXO1:Lcom/sma/smartv3/model/AITranslation;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/biz/AISparkChainManager$realTimeSendRTASRInit$1$onResult$1;->OXO1:Lcom/sma/smartv3/model/AITranslation;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/model/AITranslation;->setDst(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/biz/AISparkChainManager$realTimeSendRTASRInit$1$onResult$1;->OXO1:Lcom/sma/smartv3/model/AITranslation;

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/model/AITranslation;->setStatus(I)V

    sget-object p1, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1:Lcom/sma/smartv3/biz/AISparkChainManager;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/AISparkChainManager;->XX0()Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/biz/AISparkChainManager$realTimeSendRTASRInit$1$onResult$1;->OXO1:Lcom/sma/smartv3/model/AITranslation;

    invoke-interface {p1, v0}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleResponse(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/biz/AISparkChainManager$realTimeSendRTASRInit$1$onResult$1;->OXO1:Lcom/sma/smartv3/model/AITranslation;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/model/AITranslation;->setDst(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/biz/AISparkChainManager$realTimeSendRTASRInit$1$onResult$1;->OXO1:Lcom/sma/smartv3/model/AITranslation;

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/model/AITranslation;->setStatus(I)V

    sget-object p1, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1:Lcom/sma/smartv3/biz/AISparkChainManager;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/AISparkChainManager;->XX0()Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/biz/AISparkChainManager$realTimeSendRTASRInit$1$onResult$1;->OXO1:Lcom/sma/smartv3/model/AITranslation;

    invoke-interface {p1, v0}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleResponse(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/AISparkChainManager$realTimeSendRTASRInit$1$onResult$1;->OXO1(Ljava/lang/String;)V

    return-void
.end method
