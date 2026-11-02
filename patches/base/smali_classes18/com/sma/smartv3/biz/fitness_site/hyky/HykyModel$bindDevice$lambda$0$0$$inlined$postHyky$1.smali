.class public final Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$bindDevice$lambda$0$0$$inlined$postHyky$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/androidnetworking/interfaces/ParsedRequestListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;->bindDevice(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/androidnetworking/interfaces/ParsedRequestListener<",
        "Lcom/sma/smartv3/biz/fitness_site/hyky/HykyResponse<",
        "Ljava/lang/String;",
        ">;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nNetWorkUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$postHyky$1\n*L\n1#1,925:1\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nNetWorkUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils$postHyky$1\n*L\n1#1,925:1\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $callback:Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# direct methods
.method public constructor <init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$bindDevice$lambda$0$0$$inlined$postHyky$1;->$callback:Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lcom/androidnetworking/error/ANError;)V
    .locals 6

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/androidnetworking/error/ANError;->getErrorCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/androidnetworking/error/ANError;->getErrorBody()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v0

    :goto_1
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/androidnetworking/error/ANError;->getErrorDetail()Ljava/lang/String;

    move-result-object v3

    goto :goto_2

    :cond_2
    move-object v3, v0

    :goto_2
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "errorCode:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", errorBody:"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    if-eqz p1, :cond_3

    const-class v1, Lcom/sma/androidnetworklib/model/Response;

    invoke-virtual {p1, v1}, Lcom/androidnetworking/error/ANError;->getErrorAsObject(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/androidnetworklib/model/Response;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lcom/sma/androidnetworklib/model/Response;->getCode()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_3

    :cond_3
    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/androidnetworking/error/ANError;->getErrorCode()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :cond_4
    :goto_3
    iget-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$bindDevice$lambda$0$0$$inlined$postHyky$1;->$callback:Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    if-eqz p1, :cond_5

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleError(Ljava/lang/String;)V

    :cond_5
    return-void
.end method

.method public onResponse(Lcom/sma/smartv3/biz/fitness_site/hyky/HykyResponse;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/biz/fitness_site/hyky/HykyResponse<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyResponse;->getCode()I

    move-result v0

    const/16 v1, 0xc8

    if-ne v0, v1, :cond_0

    .line 3
    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$bindDevice$lambda$0$0$$inlined$postHyky$1;->$callback:Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyResponse;->getData()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleResponse(Ljava/lang/Object;)V

    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$bindDevice$lambda$0$0$$inlined$postHyky$1;->$callback:Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyResponse;->getCode()I

    move-result v1

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyResponse;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleError(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public bridge synthetic onResponse(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyResponse;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$bindDevice$lambda$0$0$$inlined$postHyky$1;->onResponse(Lcom/sma/smartv3/biz/fitness_site/hyky/HykyResponse;)V

    return-void
.end method
