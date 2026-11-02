.class final Lcom/sma/smartv3/util/ActivityUtilKt$collectInLifecycle$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/util/ActivityUtilKt;->OXO1(Landroidx/lifecycle/LifecycleOwner;Lcom/android/mltcode/paycertificationapi/ii0iIIX0;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function2;)V
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
    c = "com.sma.smartv3.util.ActivityUtilKt$collectInLifecycle$1"
    f = "ActivityUtil.kt"
    i = {}
    l = {
        0x1e
    }
    m = "invokeSuspend"
    n = {}
    s = {}
    v = 0x1
.end annotation


# instance fields
.field final synthetic $collector:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "TT;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $flow:Lcom/android/mltcode/paycertificationapi/ii0iIIX0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/ii0iIIX0<",
            "TT;>;"
        }
    .end annotation
.end field

.field final synthetic $state:Landroidx/lifecycle/Lifecycle$State;

.field final synthetic $this_collectInLifecycle:Landroidx/lifecycle/LifecycleOwner;

.field label:I


# direct methods
.method public constructor <init>(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lcom/android/mltcode/paycertificationapi/ii0iIIX0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/LifecycleOwner;",
            "Landroidx/lifecycle/Lifecycle$State;",
            "Lcom/android/mltcode/paycertificationapi/ii0iIIX0<",
            "+TT;>;",
            "Lkotlin/jvm/functions/Function2<",
            "-TT;-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/util/ActivityUtilKt$collectInLifecycle$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/util/ActivityUtilKt$collectInLifecycle$1;->$this_collectInLifecycle:Landroidx/lifecycle/LifecycleOwner;

    iput-object p2, p0, Lcom/sma/smartv3/util/ActivityUtilKt$collectInLifecycle$1;->$state:Landroidx/lifecycle/Lifecycle$State;

    iput-object p3, p0, Lcom/sma/smartv3/util/ActivityUtilKt$collectInLifecycle$1;->$flow:Lcom/android/mltcode/paycertificationapi/ii0iIIX0;

    iput-object p4, p0, Lcom/sma/smartv3/util/ActivityUtilKt$collectInLifecycle$1;->$collector:Lkotlin/jvm/functions/Function2;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 6
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

    new-instance v0, Lcom/sma/smartv3/util/ActivityUtilKt$collectInLifecycle$1;

    iget-object v1, p0, Lcom/sma/smartv3/util/ActivityUtilKt$collectInLifecycle$1;->$this_collectInLifecycle:Landroidx/lifecycle/LifecycleOwner;

    iget-object v2, p0, Lcom/sma/smartv3/util/ActivityUtilKt$collectInLifecycle$1;->$state:Landroidx/lifecycle/Lifecycle$State;

    iget-object v3, p0, Lcom/sma/smartv3/util/ActivityUtilKt$collectInLifecycle$1;->$flow:Lcom/android/mltcode/paycertificationapi/ii0iIIX0;

    iget-object v4, p0, Lcom/sma/smartv3/util/ActivityUtilKt$collectInLifecycle$1;->$collector:Lkotlin/jvm/functions/Function2;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/sma/smartv3/util/ActivityUtilKt$collectInLifecycle$1;-><init>(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lcom/android/mltcode/paycertificationapi/ii0iIIX0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/util/ActivityUtilKt$collectInLifecycle$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/util/ActivityUtilKt$collectInLifecycle$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/util/ActivityUtilKt$collectInLifecycle$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/util/ActivityUtilKt$collectInLifecycle$1;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/sma/smartv3/util/ActivityUtilKt$collectInLifecycle$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/util/ActivityUtilKt$collectInLifecycle$1;->$this_collectInLifecycle:Landroidx/lifecycle/LifecycleOwner;

    invoke-interface {p1}, Landroidx/lifecycle/LifecycleOwner;->getLifecycle()Landroidx/lifecycle/Lifecycle;

    move-result-object p1

    iget-object v1, p0, Lcom/sma/smartv3/util/ActivityUtilKt$collectInLifecycle$1;->$state:Landroidx/lifecycle/Lifecycle$State;

    new-instance v3, Lcom/sma/smartv3/util/ActivityUtilKt$collectInLifecycle$1$1;

    iget-object v4, p0, Lcom/sma/smartv3/util/ActivityUtilKt$collectInLifecycle$1;->$flow:Lcom/android/mltcode/paycertificationapi/ii0iIIX0;

    iget-object v5, p0, Lcom/sma/smartv3/util/ActivityUtilKt$collectInLifecycle$1;->$collector:Lkotlin/jvm/functions/Function2;

    const/4 v6, 0x0

    invoke-direct {v3, v4, v5, v6}, Lcom/sma/smartv3/util/ActivityUtilKt$collectInLifecycle$1$1;-><init>(Lcom/android/mltcode/paycertificationapi/ii0iIIX0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V

    iput v2, p0, Lcom/sma/smartv3/util/ActivityUtilKt$collectInLifecycle$1;->label:I

    invoke-static {p1, v1, v3, p0}, Landroidx/lifecycle/RepeatOnLifecycleKt;->repeatOnLifecycle(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method
