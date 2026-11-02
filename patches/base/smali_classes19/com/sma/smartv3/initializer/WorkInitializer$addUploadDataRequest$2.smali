.class final Lcom/sma/smartv3/initializer/WorkInitializer$addUploadDataRequest$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/initializer/WorkInitializer;->XOO0ii0(Landroid/app/Application;)V
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
    value = "SMAP\nWorkInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkInitializer.kt\ncom/sma/smartv3/initializer/WorkInitializer$addUploadDataRequest$2\n+ 2 Operation.kt\nandroidx/work/OperationKt\n*L\n1#1,123:1\n36#2:124\n*S KotlinDebug\n*F\n+ 1 WorkInitializer.kt\ncom/sma/smartv3/initializer/WorkInitializer$addUploadDataRequest$2\n*L\n91#1:124\n*E\n"
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.sma.smartv3.initializer.WorkInitializer$addUploadDataRequest$2"
    f = "WorkInitializer.kt"
    i = {
        0x0,
        0x0
    }
    l = {
        0x7c
    }
    m = "invokeSuspend"
    n = {
        "$this$await$iv",
        "$i$f$await"
    }
    s = {
        "L$0",
        "I$0"
    }
    v = 0x1
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nWorkInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkInitializer.kt\ncom/sma/smartv3/initializer/WorkInitializer$addUploadDataRequest$2\n+ 2 Operation.kt\nandroidx/work/OperationKt\n*L\n1#1,123:1\n36#2:124\n*S KotlinDebug\n*F\n+ 1 WorkInitializer.kt\ncom/sma/smartv3/initializer/WorkInitializer$addUploadDataRequest$2\n*L\n91#1:124\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $operation:Landroidx/work/Operation;

.field I$0:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Landroidx/work/Operation;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/work/Operation;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/initializer/WorkInitializer$addUploadDataRequest$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/initializer/WorkInitializer$addUploadDataRequest$2;->$operation:Landroidx/work/Operation;

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

    new-instance p1, Lcom/sma/smartv3/initializer/WorkInitializer$addUploadDataRequest$2;

    iget-object v0, p0, Lcom/sma/smartv3/initializer/WorkInitializer$addUploadDataRequest$2;->$operation:Landroidx/work/Operation;

    invoke-direct {p1, v0, p2}, Lcom/sma/smartv3/initializer/WorkInitializer$addUploadDataRequest$2;-><init>(Landroidx/work/Operation;Lkotlin/coroutines/Continuation;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/initializer/WorkInitializer$addUploadDataRequest$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/initializer/WorkInitializer$addUploadDataRequest$2;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/initializer/WorkInitializer$addUploadDataRequest$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/initializer/WorkInitializer$addUploadDataRequest$2;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/sma/smartv3/initializer/WorkInitializer$addUploadDataRequest$2;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/initializer/WorkInitializer$addUploadDataRequest$2;->L$1:Ljava/lang/Object;

    check-cast v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/initializer/WorkInitializer$addUploadDataRequest$2;->L$0:Ljava/lang/Object;

    check-cast v1, Landroidx/work/Operation;

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/initializer/WorkInitializer$addUploadDataRequest$2;->$operation:Landroidx/work/Operation;

    invoke-interface {v1}, Landroidx/work/Operation;->getResult()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v3

    const-string v4, "result"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Lcom/sma/smartv3/initializer/WorkInitializer$addUploadDataRequest$2;->L$0:Ljava/lang/Object;

    iput-object p1, p0, Lcom/sma/smartv3/initializer/WorkInitializer$addUploadDataRequest$2;->L$1:Ljava/lang/Object;

    const/4 v1, 0x0

    iput v1, p0, Lcom/sma/smartv3/initializer/WorkInitializer$addUploadDataRequest$2;->I$0:I

    iput v2, p0, Lcom/sma/smartv3/initializer/WorkInitializer$addUploadDataRequest$2;->label:I

    invoke-static {v3, p0}, Landroidx/concurrent/futures/ListenableFutureKt;->await(Lcom/google/common/util/concurrent/ListenableFuture;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_2

    return-object v0

    :cond_2
    move-object v0, p1

    move-object p1, v1

    :goto_0
    const-string v1, "result.await()"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "WorkInitializer initialize : value = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method
