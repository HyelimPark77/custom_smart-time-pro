.class public final Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$getSnInfo$2$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;->getSnInfo(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
        "Lcom/sma/smartv3/network/GetSNCodeHYKY$Response;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic $continuation:Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/coroutines/Continuation<",
            "Lcom/sma/smartv3/network/GetSNCodeHYKY$Response;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/network/GetSNCodeHYKY$Response;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$getSnInfo$2$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;

    iput-object p2, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$getSnInfo$2$1;->$continuation:Lkotlin/coroutines/Continuation;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleError(Ljava/lang/String;)V
    .locals 3

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$getSnInfo$2$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;

    invoke-static {v1}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;->access$getTAG$p(Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " getSnInfo handleError ->  "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$getSnInfo$2$1;->$continuation:Lkotlin/coroutines/Continuation;

    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    const/4 v0, 0x0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public handleResponse(Lcom/sma/smartv3/network/GetSNCodeHYKY$Response;)V
    .locals 3

    .line 2
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$getSnInfo$2$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;

    invoke-static {v1}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;->access$getTAG$p(Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " getSnInfo handleResponse ->  "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    .line 3
    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$getSnInfo$2$1;->$continuation:Lkotlin/coroutines/Continuation;

    .line 4
    invoke-virtual {p1}, Lcom/sma/smartv3/network/GetSNCodeHYKY$Response;->deviceInfoExists()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 5
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    return-void

    .line 6
    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$getSnInfo$2$1;->$continuation:Lkotlin/coroutines/Continuation;

    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    const/4 v0, 0x0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/sma/smartv3/network/GetSNCodeHYKY$Response;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel$getSnInfo$2$1;->handleResponse(Lcom/sma/smartv3/network/GetSNCodeHYKY$Response;)V

    return-void
.end method
