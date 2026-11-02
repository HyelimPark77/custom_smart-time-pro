.class final Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatchNoPriority$1$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatchNoPriority$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDialogHandlerChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogHandlerChain.kt\ncom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatchNoPriority$1$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,79:1\n1#2:80\n116#3,10:81\n*S KotlinDebug\n*F\n+ 1 DialogHandlerChain.kt\ncom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatchNoPriority$1$1$1\n*L\n67#1:81,10\n*E\n"
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.sma.smartv3.dialog.handler.DialogHandlerChain$dispatchNoPriority$1$1$1"
    f = "DialogHandlerChain.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x1,
        0x1,
        0x2,
        0x2,
        0x2,
        0x2
    }
    l = {
        0x40,
        0x42,
        0x55
    }
    m = "invokeSuspend"
    n = {
        "$this$launch",
        "$this$invokeSuspend_u24lambda_u240",
        "$i$a$-runCatching-DialogHandlerChain$dispatchNoPriority$1$1$1$shouldShow$1",
        "$this$launch",
        "shouldShow",
        "$this$launch",
        "$this$withLock_u24default$iv",
        "shouldShow",
        "$i$f$withLock"
    }
    s = {
        "L$0",
        "L$1",
        "I$0",
        "L$0",
        "Z$0",
        "L$0",
        "L$1",
        "Z$0",
        "I$0"
    }
    v = 0x1
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDialogHandlerChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogHandlerChain.kt\ncom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatchNoPriority$1$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,79:1\n1#2:80\n116#3,10:81\n*S KotlinDebug\n*F\n+ 1 DialogHandlerChain.kt\ncom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatchNoPriority$1$1$1\n*L\n67#1:81,10\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $activity:Landroidx/fragment/app/FragmentActivity;

.field final synthetic $handler:Lcom/android/mltcode/paycertificationapi/OiOI0Iii0;

.field I$0:I

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field Z$0:Z

.field label:I


# direct methods
.method public constructor <init>(Lcom/android/mltcode/paycertificationapi/OiOI0Iii0;Landroidx/fragment/app/FragmentActivity;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/mltcode/paycertificationapi/OiOI0Iii0;",
            "Landroidx/fragment/app/FragmentActivity;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatchNoPriority$1$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatchNoPriority$1$1$1;->$handler:Lcom/android/mltcode/paycertificationapi/OiOI0Iii0;

    iput-object p2, p0, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatchNoPriority$1$1$1;->$activity:Landroidx/fragment/app/FragmentActivity;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
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

    new-instance v0, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatchNoPriority$1$1$1;

    iget-object v1, p0, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatchNoPriority$1$1$1;->$handler:Lcom/android/mltcode/paycertificationapi/OiOI0Iii0;

    iget-object v2, p0, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatchNoPriority$1$1$1;->$activity:Landroidx/fragment/app/FragmentActivity;

    invoke-direct {v0, v1, v2, p2}, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatchNoPriority$1$1$1;-><init>(Lcom/android/mltcode/paycertificationapi/OiOI0Iii0;Landroidx/fragment/app/FragmentActivity;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatchNoPriority$1$1$1;->L$0:Ljava/lang/Object;

    return-object v0
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
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatchNoPriority$1$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatchNoPriority$1$1$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatchNoPriority$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatchNoPriority$1$1$1;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatchNoPriority$1$1$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v1

    iget v2, p0, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatchNoPriority$1$1$1;->label:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatchNoPriority$1$1$1;->L$2:Ljava/lang/Object;

    check-cast v0, Lcom/android/mltcode/paycertificationapi/OiOI0Iii0;

    iget-object v1, p0, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatchNoPriority$1$1$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lcom/android/mltcode/paycertificationapi/uy0;

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-boolean v2, p0, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatchNoPriority$1$1$1;->Z$0:Z

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_2
    iget-object v2, p0, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatchNoPriority$1$1$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatchNoPriority$1$1$1;->$handler:Lcom/android/mltcode/paycertificationapi/OiOI0Iii0;

    :try_start_1
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatchNoPriority$1$1$1;->L$0:Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatchNoPriority$1$1$1;->L$1:Ljava/lang/Object;

    iput v6, p0, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatchNoPriority$1$1$1;->I$0:I

    iput v5, p0, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatchNoPriority$1$1$1;->label:I

    invoke-virtual {p1, p0}, Lcom/android/mltcode/paycertificationapi/OiOI0Iii0;->XIi00iiXO(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_4

    :cond_4
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->OXO1(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :goto_1
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->OXO1(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_2
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/Boxing;->OXO1(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    move-object p1, v2

    :cond_5
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->O00()Lcom/android/mltcode/paycertificationapi/g10;

    move-result-object p1

    new-instance v5, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatchNoPriority$1$1$1$1;

    iget-object v8, p0, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatchNoPriority$1$1$1;->$activity:Landroidx/fragment/app/FragmentActivity;

    iget-object v9, p0, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatchNoPriority$1$1$1;->$handler:Lcom/android/mltcode/paycertificationapi/OiOI0Iii0;

    invoke-direct {v5, v8, v9, v7}, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatchNoPriority$1$1$1$1;-><init>(Landroidx/fragment/app/FragmentActivity;Lcom/android/mltcode/paycertificationapi/OiOI0Iii0;Lkotlin/coroutines/Continuation;)V

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, p0, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatchNoPriority$1$1$1;->L$0:Ljava/lang/Object;

    iput-object v7, p0, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatchNoPriority$1$1$1;->L$1:Ljava/lang/Object;

    iput-boolean v2, p0, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatchNoPriority$1$1$1;->Z$0:Z

    iput v4, p0, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatchNoPriority$1$1$1;->label:I

    invoke-static {p1, v5, p0}, Lcom/android/mltcode/paycertificationapi/I100X1;->I0IIOi(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_4

    :cond_6
    :goto_3
    invoke-static {}, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain;->XIi00iiXO()Lcom/android/mltcode/paycertificationapi/uy0;

    move-result-object p1

    iget-object v4, p0, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatchNoPriority$1$1$1;->$handler:Lcom/android/mltcode/paycertificationapi/OiOI0Iii0;

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatchNoPriority$1$1$1;->L$0:Ljava/lang/Object;

    iput-object p1, p0, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatchNoPriority$1$1$1;->L$1:Ljava/lang/Object;

    iput-object v4, p0, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatchNoPriority$1$1$1;->L$2:Ljava/lang/Object;

    iput-boolean v2, p0, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatchNoPriority$1$1$1;->Z$0:Z

    iput v6, p0, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatchNoPriority$1$1$1;->I$0:I

    iput v3, p0, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatchNoPriority$1$1$1;->label:I

    invoke-interface {p1, v7, p0}, Lcom/android/mltcode/paycertificationapi/uy0;->lock(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_7

    :goto_4
    return-object v1

    :cond_7
    move-object v1, p1

    move-object v0, v4

    :goto_5
    :try_start_2
    invoke-static {}, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain;->OXO1()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-interface {v1, v7}, Lcom/android/mltcode/paycertificationapi/uy0;->unlock(Ljava/lang/Object;)V

    goto :goto_6

    :catchall_1
    move-exception p1

    invoke-interface {v1, v7}, Lcom/android/mltcode/paycertificationapi/uy0;->unlock(Ljava/lang/Object;)V

    throw p1

    :cond_8
    :goto_6
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method
