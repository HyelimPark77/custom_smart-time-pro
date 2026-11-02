.class final Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUpload$startUpload$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUpload;->startUpload()V
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
    c = "com.sma.smartv3.biz.fitness_site.hyky.HykyUpload$startUpload$1"
    f = "HykyUpload.kt"
    i = {
        0x0,
        0x1,
        0x2
    }
    l = {
        0x39,
        0x3d,
        0x41
    }
    m = "invokeSuspend"
    n = {
        "dataList",
        "dataList",
        "dataList"
    }
    s = {
        "L$0",
        "L$0",
        "L$0"
    }
    v = 0x1
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUpload;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUpload;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUpload;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUpload$startUpload$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUpload$startUpload$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUpload;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1
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

    new-instance p1, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUpload$startUpload$1;

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUpload$startUpload$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUpload;

    invoke-direct {p1, v0, p2}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUpload$startUpload$1;-><init>(Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUpload;Lkotlin/coroutines/Continuation;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUpload$startUpload$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUpload$startUpload$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUpload$startUpload$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUpload$startUpload$1;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUpload$startUpload$1;->label:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUpload$startUpload$1;->L$0:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUpload$startUpload$1;->L$0:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :cond_2
    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUpload$startUpload$1;->L$0:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    :goto_0
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    :cond_4
    :goto_1
    iget-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUpload$startUpload$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUpload;

    invoke-static {p1}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUpload;->access$getMUploadData$p(Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUpload;)Ljava/util/concurrent/LinkedBlockingQueue;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_8

    iget-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUpload$startUpload$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUpload;

    invoke-static {p1}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUpload;->access$getMUploadData$p(Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUpload;)Ljava/util/concurrent/LinkedBlockingQueue;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/LinkedBlockingQueue;->take()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    sget-object v1, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->Companion:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$Companion;

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$Companion;->getInstance()Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;

    move-result-object v1

    iput-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUpload$startUpload$1;->L$0:Ljava/lang/Object;

    iput v4, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUpload$startUpload$1;->label:I

    invoke-virtual {v1, p0}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->refreshToken(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_5

    goto :goto_4

    :cond_5
    move-object v7, v1

    move-object v1, p1

    move-object p1, v7

    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_1

    :cond_6
    :try_start_1
    iget-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUpload$startUpload$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUpload;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUpload$startUpload$1;->L$0:Ljava/lang/Object;

    iput v3, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUpload$startUpload$1;->label:I

    invoke-static {p1, v1, p0}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUpload;->access$distribute(Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUpload;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p1, v0, :cond_7

    goto :goto_4

    :catch_0
    :cond_7
    :goto_3
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUpload$startUpload$1;->L$0:Ljava/lang/Object;

    iput v2, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUpload$startUpload$1;->label:I

    const-wide/16 v5, 0x2710

    invoke-static {v5, v6, p0}, Lkotlinx/coroutines/DelayKt;->XIi00iiXO(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    :goto_4
    return-object v0

    :cond_8
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method
