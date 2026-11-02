.class public final Lcom/sma/smartv3/biz/AISparkChainManager$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/iflytek/sparkchain/core/LLMCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/AISparkChainManager;->XO0O10(Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V
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
.method public onLLMError(Lcom/iflytek/sparkchain/core/LLMError;Ljava/lang/Object;)V
    .locals 2

    const-string p2, "error"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-static {}, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "  onLLMError  error = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XIi00iiXO(Ljava/lang/String;)V

    sget-object p2, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1:Lcom/sma/smartv3/biz/AISparkChainManager;

    invoke-virtual {p2}, Lcom/sma/smartv3/biz/AISparkChainManager;->XOO0ii0()Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Lcom/iflytek/sparkchain/core/LLMError;->getErrCode()I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleError(Ljava/lang/String;)V

    :cond_0
    const/4 p1, 0x0

    invoke-static {p1}, Lcom/sma/smartv3/biz/AISparkChainManager;->iO(Z)V

    return-void
.end method

.method public onLLMEvent(Lcom/iflytek/sparkchain/core/LLMEvent;Ljava/lang/Object;)V
    .locals 2

    const-string p2, "event"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-static {}, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "  onLLMEvent  "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XIi00iiXO(Ljava/lang/String;)V

    sget-object p2, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1:Lcom/sma/smartv3/biz/AISparkChainManager;

    invoke-virtual {p2}, Lcom/sma/smartv3/biz/AISparkChainManager;->XOO0ii0()Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Lcom/iflytek/sparkchain/core/LLMEvent;->getEventMsg()Ljava/lang/String;

    move-result-object p1

    const-string v0, "getEventMsg(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, p1}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleError(Ljava/lang/String;)V

    :cond_0
    const/4 p1, 0x0

    invoke-static {p1}, Lcom/sma/smartv3/biz/AISparkChainManager;->iO(Z)V

    return-void
.end method

.method public onLLMResult(Lcom/iflytek/sparkchain/core/LLMResult;Ljava/lang/Object;)V
    .locals 1

    const-string p2, "result"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lcom/iflytek/sparkchain/core/LLMResult;->getImage()[B

    move-result-object p1

    if-eqz p1, :cond_1

    array-length p2, p1

    const/4 v0, 0x0

    invoke-static {p1, v0, p2}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object p1

    sget-object p2, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1:Lcom/sma/smartv3/biz/AISparkChainManager;

    invoke-virtual {p2}, Lcom/sma/smartv3/biz/AISparkChainManager;->I0IIOi()Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-interface {p2, p1}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleResponse(Ljava/lang/Object;)V

    :cond_0
    invoke-static {v0}, Lcom/sma/smartv3/biz/AISparkChainManager;->iO(Z)V

    :cond_1
    return-void
.end method
