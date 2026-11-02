.class public final Lcom/sma/smartv3/biz/AISparkChainManager$IiI10X;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/iflytek/sparkchain/core/its/ITSCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/AISparkChainManager;->IX1XiI(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/android/mltcode/paycertificationapi/O1XIiIO;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/biz/AISparkChainManager$IiI10X;->OXO1:Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lcom/iflytek/sparkchain/core/its/ITS$ITSError;Ljava/lang/Object;)V
    .locals 4

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "usrTag"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-static {}, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/its/ITS$ITSError;->getCode()I

    move-result v1

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/its/ITS$ITSError;->getErrMsg()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "  translateITS error  code ="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ",  errMsg =  "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/sma/smartv3/biz/AISparkChainManager$IiI10X;->OXO1:Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/its/ITS$ITSError;->getErrMsg()Ljava/lang/String;

    move-result-object p1

    const-string v0, "getErrMsg(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, p1}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleError(Ljava/lang/String;)V

    return-void
.end method

.method public onResult(Lcom/iflytek/sparkchain/core/its/ITS$ITSResult;Ljava/lang/Object;)V
    .locals 4

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "usrTag"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-static {}, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/its/ITS$ITSResult;->getStatus()I

    move-result v1

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/its/ITS$ITSResult;->getTransResult()Lcom/iflytek/sparkchain/core/its/ITS$TransResult;

    move-result-object v2

    invoke-virtual {v2}, Lcom/iflytek/sparkchain/core/its/ITS$TransResult;->getDst()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "  translateITS   result.status = "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "   result.transResult.dst= "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/its/ITS$ITSResult;->getStatus()I

    move-result p2

    const/4 v0, 0x3

    if-ne p2, v0, :cond_0

    iget-object p2, p0, Lcom/sma/smartv3/biz/AISparkChainManager$IiI10X;->OXO1:Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/its/ITS$ITSResult;->getTransResult()Lcom/iflytek/sparkchain/core/its/ITS$TransResult;

    move-result-object p1

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/its/ITS$TransResult;->getDst()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleResponse(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
