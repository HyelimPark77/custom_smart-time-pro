.class final Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/dialog/handler/DialogHandlerChain;->XO0O10(Landroidx/fragment/app/FragmentActivity;)Lkotlinx/coroutines/XiOIO;
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
    value = "SMAP\nDialogHandlerChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogHandlerChain.kt\ncom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n116#2,7:80\n124#2,2:100\n1563#3:87\n1634#3,3:88\n774#3:91\n865#3,2:92\n1563#3:94\n1634#3,3:95\n1056#3:98\n1869#3,2:102\n1#4:99\n*S KotlinDebug\n*F\n+ 1 DialogHandlerChain.kt\ncom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1\n*L\n35#1:80,7\n35#1:100,2\n36#1:87\n36#1:88,3\n41#1:91\n41#1:92,2\n42#1:94\n42#1:95,3\n43#1:98\n47#1:102,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.sma.smartv3.dialog.handler.DialogHandlerChain$dispatch$1"
    f = "DialogHandlerChain.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x1,
        0x1,
        0x1,
        0x1,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2
    }
    l = {
        0x54,
        0x28,
        0x31
    }
    m = "invokeSuspend"
    n = {
        "$this$launch",
        "$this$withLock_u24default$iv",
        "$i$f$withLock",
        "$this$launch",
        "$this$withLock_u24default$iv",
        "$i$f$withLock",
        "$i$a$-withLock$default-DialogHandlerChain$dispatch$1$handlersToShow$1",
        "$this$launch",
        "handlersToShow",
        "$this$forEach$iv",
        "element$iv",
        "handler",
        "$this$invokeSuspend_u24lambda_u241_u240",
        "$i$f$forEach",
        "$i$a$-forEach-DialogHandlerChain$dispatch$1$1",
        "$i$a$-runCatching-DialogHandlerChain$dispatch$1$1$1"
    }
    s = {
        "L$0",
        "L$1",
        "I$0",
        "L$0",
        "L$1",
        "I$0",
        "I$1",
        "L$0",
        "L$1",
        "L$2",
        "L$5",
        "L$6",
        "L$7",
        "I$0",
        "I$1",
        "I$2"
    }
    v = 0x1
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDialogHandlerChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogHandlerChain.kt\ncom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n116#2,7:80\n124#2,2:100\n1563#3:87\n1634#3,3:88\n774#3:91\n865#3,2:92\n1563#3:94\n1634#3,3:95\n1056#3:98\n1869#3,2:102\n1#4:99\n*S KotlinDebug\n*F\n+ 1 DialogHandlerChain.kt\ncom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1\n*L\n35#1:80,7\n35#1:100,2\n36#1:87\n36#1:88,3\n41#1:91\n41#1:92,2\n42#1:94\n42#1:95,3\n43#1:98\n47#1:102,2\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $activity:Landroidx/fragment/app/FragmentActivity;

.field I$0:I

.field I$1:I

.field I$2:I

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field L$7:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Landroidx/fragment/app/FragmentActivity;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/fragment/app/FragmentActivity;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1;->$activity:Landroidx/fragment/app/FragmentActivity;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

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

    new-instance v0, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1;

    iget-object v1, p0, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1;->$activity:Landroidx/fragment/app/FragmentActivity;

    invoke-direct {v0, v1, p2}, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1;-><init>(Landroidx/fragment/app/FragmentActivity;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1;->L$0:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v1, p0

    iget-object v0, v1, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1;->L$0:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v8

    iget v0, v1, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1;->label:I

    const/16 v9, 0xa

    const/4 v10, 0x3

    const/4 v11, 0x2

    const/4 v3, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x0

    if-eqz v0, :cond_3

    if-eq v0, v3, :cond_2

    if-eq v0, v11, :cond_1

    if-ne v0, v10, :cond_0

    iget v3, v1, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1;->I$0:I

    iget-object v0, v1, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1;->L$7:Ljava/lang/Object;

    check-cast v0, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    iget-object v0, v1, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1;->L$6:Ljava/lang/Object;

    check-cast v0, Lcom/android/mltcode/paycertificationapi/OiOI0Iii0;

    iget-object v0, v1, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1;->L$4:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/util/Iterator;

    iget-object v0, v1, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1;->L$3:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Landroidx/fragment/app/FragmentActivity;

    iget-object v0, v1, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1;->L$2:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Ljava/lang/Iterable;

    iget-object v0, v1, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1;->L$1:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Ljava/util/List;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_7

    :catchall_0
    move-exception v0

    goto/16 :goto_8

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, v1, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1;->L$1:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lcom/android/mltcode/paycertificationapi/uy0;

    :try_start_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object/from16 v0, p1

    goto/16 :goto_2

    :catchall_1
    move-exception v0

    goto/16 :goto_a

    :cond_2
    iget v0, v1, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1;->I$0:I

    iget-object v3, v1, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1;->L$1:Ljava/lang/Object;

    check-cast v3, Lcom/android/mltcode/paycertificationapi/uy0;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    move-object v14, v3

    goto :goto_0

    :cond_3
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    iget-object v0, v1, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1;->$activity:Landroidx/fragment/app/FragmentActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object v0

    :cond_4
    invoke-static {}, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain;->XIi00iiXO()Lcom/android/mltcode/paycertificationapi/uy0;

    move-result-object v0

    iput-object v2, v1, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1;->L$0:Ljava/lang/Object;

    iput-object v0, v1, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1;->L$1:Ljava/lang/Object;

    iput v12, v1, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1;->I$0:I

    iput v3, v1, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1;->label:I

    invoke-interface {v0, v13, v1}, Lcom/android/mltcode/paycertificationapi/uy0;->lock(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v8, :cond_5

    goto/16 :goto_6

    :cond_5
    move-object v14, v0

    move v0, v12

    :goto_0
    :try_start_2
    invoke-static {}, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain;->OXO1()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v15, Ljava/util/ArrayList;

    invoke-static {v3, v9}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v15, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_1
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/android/mltcode/paycertificationapi/OiOI0Iii0;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v4

    new-instance v5, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1$handlersToShow$1$1$1;

    invoke-direct {v5, v3, v13}, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1$handlersToShow$1$1$1;-><init>(Lcom/android/mltcode/paycertificationapi/OiOI0Iii0;Lkotlin/coroutines/Continuation;)V

    const/4 v6, 0x2

    const/4 v7, 0x0

    move-object v3, v4

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lcom/android/mltcode/paycertificationapi/I100X1;->XIi00iiXO(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/OIX0iXi;

    move-result-object v3

    invoke-interface {v15, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :catchall_2
    move-exception v0

    move-object v3, v14

    goto/16 :goto_a

    :cond_6
    iput-object v2, v1, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1;->L$0:Ljava/lang/Object;

    iput-object v14, v1, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1;->L$1:Ljava/lang/Object;

    iput v0, v1, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1;->I$0:I

    iput v12, v1, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1;->I$1:I

    iput v11, v1, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1;->label:I

    invoke-static {v15, v1}, Lkotlinx/coroutines/AwaitKt;->OXO1(Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-ne v0, v8, :cond_7

    goto/16 :goto_6

    :cond_7
    move-object v3, v14

    :goto_2
    :try_start_3
    check-cast v0, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_8
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lkotlin/Pair;

    invoke-virtual {v6}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_9
    new-instance v0, Ljava/util/ArrayList;

    invoke-static {v4, v9}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v0, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_a

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lkotlin/Pair;

    invoke-virtual {v5}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/android/mltcode/paycertificationapi/OiOI0Iii0;

    invoke-interface {v0, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_a
    new-instance v4, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1$OXO1;

    invoke-direct {v4}, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1$OXO1;-><init>()V

    invoke-static {v0, v4}, Lkotlin/collections/CollectionsKt___CollectionsKt;->II0O1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    invoke-static {}, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain;->OXO1()Ljava/util/List;

    move-result-object v4

    move-object v5, v0

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v4, v5}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    invoke-interface {v3, v13}, Lcom/android/mltcode/paycertificationapi/uy0;->unlock(Ljava/lang/Object;)V

    move-object v3, v0

    check-cast v3, Ljava/lang/Iterable;

    iget-object v4, v1, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1;->$activity:Landroidx/fragment/app/FragmentActivity;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move-object v6, v5

    move-object v5, v4

    move-object v4, v6

    move-object v7, v0

    move-object v6, v3

    move v3, v12

    :cond_b
    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/android/mltcode/paycertificationapi/OiOI0Iii0;

    :try_start_4
    sget-object v11, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-virtual {v5}, Landroid/app/Activity;->isDestroyed()Z

    move-result v11

    if-nez v11, :cond_c

    iput-object v2, v1, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1;->L$0:Ljava/lang/Object;

    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v1, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1;->L$1:Ljava/lang/Object;

    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v1, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1;->L$2:Ljava/lang/Object;

    iput-object v5, v1, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1;->L$3:Ljava/lang/Object;

    iput-object v4, v1, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1;->L$4:Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v1, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1;->L$5:Ljava/lang/Object;

    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v1, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1;->L$6:Ljava/lang/Object;

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v1, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1;->L$7:Ljava/lang/Object;

    iput v3, v1, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1;->I$0:I

    iput v12, v1, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1;->I$1:I

    iput v12, v1, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1;->I$2:I

    iput v10, v1, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1;->label:I

    invoke-virtual {v9, v5, v1}, Lcom/android/mltcode/paycertificationapi/OiOI0Iii0;->XO0O10(Landroidx/fragment/app/FragmentActivity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_c

    :goto_6
    return-object v8

    :cond_c
    :goto_7
    sget-object v0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_9

    :goto_8
    sget-object v9, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->OXO1(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_9
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_b

    sget-object v9, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "DialogHandlerChain Dispatch Exception: "

    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    goto :goto_5

    :cond_d
    sget-object v0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object v0

    :goto_a
    invoke-interface {v3, v13}, Lcom/android/mltcode/paycertificationapi/uy0;->unlock(Ljava/lang/Object;)V

    throw v0
.end method
