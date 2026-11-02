.class final Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$bindDevice$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->bindDevice(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lcom/android/mltcode/paycertificationapi/i00OIXiO;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.sma.smartv3.biz.fitness_site.hyky.HykyManager$bindDevice$1"
    f = "HykyManager.kt"
    i = {}
    l = {
        0xa5
    }
    m = "invokeSuspend"
    n = {}
    s = {}
    v = 0x1
.end annotation


# instance fields
.field final synthetic $isBind:Z

.field label:I

.field final synthetic this$0:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;ZLkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;",
            "Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$bindDevice$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$bindDevice$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;

    iput-boolean p2, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$bindDevice$1;->$isBind:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$bindDevice$1;

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$bindDevice$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;

    iget-boolean v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$bindDevice$1;->$isBind:Z

    invoke-direct {p1, v0, v1, p2}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$bindDevice$1;-><init>(Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;ZLkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public final invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/mltcode/paycertificationapi/i00OIXiO;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$bindDevice$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$bindDevice$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$bindDevice$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$bindDevice$1;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$bindDevice$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    move-object v9, p0

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$bindDevice$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;

    invoke-static {p1}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->access$getMHykyModel(Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;)Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;

    move-result-object v3

    iget-boolean v4, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$bindDevice$1;->$isBind:Z

    iget-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$bindDevice$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->getMAppUser()Lcom/sma/smartv3/model/AppUser;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AppUser;->noAreaCodePhone()Ljava/lang/String;

    move-result-object v5

    sget-object p1, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;->INSTANCE:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;->getDeviceMac(Z)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;->getDeviceCode()Lcom/sma/smartv3/network/GetSNCodeHYKY$Response;

    move-result-object v1

    const-string v7, ""

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/sma/smartv3/network/GetSNCodeHYKY$Response;->getSn()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_3

    :cond_2
    move-object v1, v7

    :cond_3
    invoke-virtual {p1}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;->getDeviceCode()Lcom/sma/smartv3/network/GetSNCodeHYKY$Response;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/sma/smartv3/network/GetSNCodeHYKY$Response;->getCmei()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_4

    goto :goto_0

    :cond_4
    move-object v8, p1

    goto :goto_1

    :cond_5
    :goto_0
    move-object v8, v7

    :goto_1
    iput v2, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$bindDevice$1;->label:I

    move-object v9, p0

    move-object v7, v1

    invoke-virtual/range {v3 .. v9}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;->bindDeviceToHyky(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    return-object v0

    :cond_6
    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, v9, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$bindDevice$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;

    invoke-static {v1}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->access$getTAG$p(Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;)Ljava/lang/String;

    move-result-object v1

    iget-boolean v2, v9, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$bindDevice$1;->$isBind:Z

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " bindDevice : "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method
