.class public final Lcom/sma/smartv3/util/TimeUtil$audioTimeFlow$$inlined$flatMapLatest$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/util/TimeUtil;->OXO1(Lcom/android/mltcode/paycertificationapi/k85;J)Lcom/android/mltcode/paycertificationapi/ii0iIIX0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function3<",
        "Lcom/android/mltcode/paycertificationapi/IXiXI<",
        "-",
        "Ljava/lang/String;",
        ">;",
        "Ljava/lang/Boolean;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1\n+ 2 TimeUtil.kt\ncom/sma/smartv3/util/TimeUtil\n*L\n1#1,214:1\n22#2,9:215\n*E\n"
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.sma.smartv3.util.TimeUtil$audioTimeFlow$$inlined$flatMapLatest$1"
    f = "TimeUtil.kt"
    i = {
        0x0,
        0x0
    }
    l = {
        0xbd
    }
    m = "invokeSuspend"
    n = {
        "$this$transformLatest",
        "it"
    }
    s = {
        "L$0",
        "L$1"
    }
    v = 0x1
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1\n+ 2 TimeUtil.kt\ncom/sma/smartv3/util/TimeUtil\n*L\n1#1,214:1\n22#2,9:215\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $interval$inlined:J

.field private synthetic L$0:Ljava/lang/Object;

.field synthetic L$1:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lkotlin/coroutines/Continuation;J)V
    .locals 0

    iput-wide p2, p0, Lcom/sma/smartv3/util/TimeUtil$audioTimeFlow$$inlined$flatMapLatest$1;->$interval$inlined:J

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lcom/android/mltcode/paycertificationapi/IXiXI;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .param p1    # Lcom/android/mltcode/paycertificationapi/IXiXI;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Lkotlin/coroutines/Continuation;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/mltcode/paycertificationapi/IXiXI<",
            "-",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Boolean;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/sma/smartv3/util/TimeUtil$audioTimeFlow$$inlined$flatMapLatest$1;

    iget-wide v1, p0, Lcom/sma/smartv3/util/TimeUtil$audioTimeFlow$$inlined$flatMapLatest$1;->$interval$inlined:J

    invoke-direct {v0, p3, v1, v2}, Lcom/sma/smartv3/util/TimeUtil$audioTimeFlow$$inlined$flatMapLatest$1;-><init>(Lkotlin/coroutines/Continuation;J)V

    iput-object p1, v0, Lcom/sma/smartv3/util/TimeUtil$audioTimeFlow$$inlined$flatMapLatest$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lcom/sma/smartv3/util/TimeUtil$audioTimeFlow$$inlined$flatMapLatest$1;->L$1:Ljava/lang/Object;

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/util/TimeUtil$audioTimeFlow$$inlined$flatMapLatest$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/IXiXI;

    check-cast p3, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/util/TimeUtil$audioTimeFlow$$inlined$flatMapLatest$1;->invoke(Lcom/android/mltcode/paycertificationapi/IXiXI;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/sma/smartv3/util/TimeUtil$audioTimeFlow$$inlined$flatMapLatest$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/util/TimeUtil$audioTimeFlow$$inlined$flatMapLatest$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/android/mltcode/paycertificationapi/IXiXI;

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/util/TimeUtil$audioTimeFlow$$inlined$flatMapLatest$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/android/mltcode/paycertificationapi/IXiXI;

    iget-object v1, p0, Lcom/sma/smartv3/util/TimeUtil$audioTimeFlow$$inlined$flatMapLatest$1;->L$1:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-nez v3, :cond_2

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/iX0XiO;->Ii0i()Lcom/android/mltcode/paycertificationapi/ii0iIIX0;

    move-result-object v3

    goto :goto_0

    :cond_2
    new-instance v3, Lcom/sma/smartv3/util/TimeUtil$audioTimeFlow$1$1;

    iget-wide v4, p0, Lcom/sma/smartv3/util/TimeUtil$audioTimeFlow$$inlined$flatMapLatest$1;->$interval$inlined:J

    const/4 v6, 0x0

    invoke-direct {v3, v4, v5, v6}, Lcom/sma/smartv3/util/TimeUtil$audioTimeFlow$1$1;-><init>(JLkotlin/coroutines/Continuation;)V

    invoke-static {v3}, Lcom/android/mltcode/paycertificationapi/iX0XiO;->X00O0(Lkotlin/jvm/functions/Function2;)Lcom/android/mltcode/paycertificationapi/ii0iIIX0;

    move-result-object v3

    :goto_0
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, p0, Lcom/sma/smartv3/util/TimeUtil$audioTimeFlow$$inlined$flatMapLatest$1;->L$0:Ljava/lang/Object;

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Lcom/sma/smartv3/util/TimeUtil$audioTimeFlow$$inlined$flatMapLatest$1;->L$1:Ljava/lang/Object;

    iput v2, p0, Lcom/sma/smartv3/util/TimeUtil$audioTimeFlow$$inlined$flatMapLatest$1;->label:I

    invoke-static {p1, v3, p0}, Lcom/android/mltcode/paycertificationapi/iX0XiO;->IXOIIIO(Lcom/android/mltcode/paycertificationapi/IXiXI;Lcom/android/mltcode/paycertificationapi/ii0iIIX0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_1
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method
