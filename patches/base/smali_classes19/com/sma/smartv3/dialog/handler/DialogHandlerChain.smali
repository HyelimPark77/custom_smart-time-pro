.class public final Lcom/sma/smartv3/dialog/handler/DialogHandlerChain;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDialogHandlerChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogHandlerChain.kt\ncom/sma/smartv3/dialog/handler/DialogHandlerChain\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,79:1\n116#2,10:80\n*S KotlinDebug\n*F\n+ 1 DialogHandlerChain.kt\ncom/sma/smartv3/dialog/handler/DialogHandlerChain\n*L\n75#1:80,10\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDialogHandlerChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogHandlerChain.kt\ncom/sma/smartv3/dialog/handler/DialogHandlerChain\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,79:1\n116#2,10:80\n*S KotlinDebug\n*F\n+ 1 DialogHandlerChain.kt\ncom/sma/smartv3/dialog/handler/DialogHandlerChain\n*L\n75#1:80,10\n*E\n"
    }
.end annotation


# static fields
.field public static final OXO1:Lcom/sma/smartv3/dialog/handler/DialogHandlerChain;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final XIi00iiXO:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/android/mltcode/paycertificationapi/OiOI0Iii0;",
            ">;"
        }
    .end annotation
.end field

.field public static final iO:Lcom/android/mltcode/paycertificationapi/uy0;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain;

    invoke-direct {v0}, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain;-><init>()V

    sput-object v0, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain;->OXO1:Lcom/sma/smartv3/dialog/handler/DialogHandlerChain;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain;->XIi00iiXO:Ljava/util/List;

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lkotlinx/coroutines/sync/MutexKt;->XIi00iiXO(ZILjava/lang/Object;)Lcom/android/mltcode/paycertificationapi/uy0;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain;->iO:Lcom/android/mltcode/paycertificationapi/uy0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic OXO1()Ljava/util/List;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain;->XIi00iiXO:Ljava/util/List;

    return-object v0
.end method

.method public static final synthetic XIi00iiXO()Lcom/android/mltcode/paycertificationapi/uy0;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain;->iO:Lcom/android/mltcode/paycertificationapi/uy0;

    return-object v0
.end method


# virtual methods
.method public final varargs IiI10X([Lcom/android/mltcode/paycertificationapi/OiOI0Iii0;)Lcom/sma/smartv3/dialog/handler/DialogHandlerChain;
    .locals 1
    .param p1    # [Lcom/android/mltcode/paycertificationapi/OiOI0Iii0;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "handler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain;->XIi00iiXO:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0, p1}, Lcom/android/mltcode/paycertificationapi/OIXO1IIOO;->Oi(Ljava/util/Collection;[Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final O00(Landroidx/fragment/app/FragmentActivity;)Lkotlinx/coroutines/XiOIO;
    .locals 7
    .param p1    # Landroidx/fragment/app/FragmentActivity;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v1

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->O00()Lcom/android/mltcode/paycertificationapi/g10;

    move-result-object v2

    new-instance v4, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatchNoPriority$1;

    const/4 v0, 0x0

    invoke-direct {v4, p1, v0}, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatchNoPriority$1;-><init>(Landroidx/fragment/app/FragmentActivity;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    move-result-object p1

    return-object p1
.end method

.method public final XO0O10(Landroidx/fragment/app/FragmentActivity;)Lkotlinx/coroutines/XiOIO;
    .locals 7
    .param p1    # Landroidx/fragment/app/FragmentActivity;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v1

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->O00()Lcom/android/mltcode/paycertificationapi/g10;

    move-result-object v2

    new-instance v4, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1;

    const/4 v0, 0x0

    invoke-direct {v4, p1, v0}, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$dispatch$1;-><init>(Landroidx/fragment/app/FragmentActivity;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    move-result-object p1

    return-object p1
.end method

.method public final iO(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$clear$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$clear$1;

    iget v1, v0, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$clear$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$clear$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$clear$1;

    invoke-direct {v0, p0, p1}, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$clear$1;-><init>(Lcom/sma/smartv3/dialog/handler/DialogHandlerChain;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$clear$1;->result:Ljava/lang/Object;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$clear$1;->label:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$clear$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/android/mltcode/paycertificationapi/uy0;

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    sget-object p1, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain;->iO:Lcom/android/mltcode/paycertificationapi/uy0;

    iput-object p1, v0, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$clear$1;->L$0:Ljava/lang/Object;

    const/4 v2, 0x0

    iput v2, v0, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$clear$1;->I$0:I

    iput v3, v0, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain$clear$1;->label:I

    invoke-interface {p1, v4, v0}, Lcom/android/mltcode/paycertificationapi/uy0;->lock(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p1

    :goto_1
    :try_start_0
    sget-object p1, Lcom/sma/smartv3/dialog/handler/DialogHandlerChain;->XIi00iiXO:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0, v4}, Lcom/android/mltcode/paycertificationapi/uy0;->unlock(Ljava/lang/Object;)V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-interface {v0, v4}, Lcom/android/mltcode/paycertificationapi/uy0;->unlock(Ljava/lang/Object;)V

    throw p1
.end method
