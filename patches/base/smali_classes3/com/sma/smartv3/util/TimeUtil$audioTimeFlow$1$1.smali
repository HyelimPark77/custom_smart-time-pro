.class final Lcom/sma/smartv3/util/TimeUtil$audioTimeFlow$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


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
        "Lkotlin/jvm/functions/Function2<",
        "Lcom/android/mltcode/paycertificationapi/IXiXI<",
        "-",
        "Ljava/lang/String;",
        ">;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.sma.smartv3.util.TimeUtil$audioTimeFlow$1$1"
    f = "TimeUtil.kt"
    i = {
        0x0,
        0x0,
        0x1,
        0x1
    }
    l = {
        0x1a,
        0x1c
    }
    m = "invokeSuspend"
    n = {
        "$this$flow",
        "elapsed",
        "$this$flow",
        "elapsed"
    }
    s = {
        "L$0",
        "J$0",
        "L$0",
        "J$0"
    }
    v = 0x1
.end annotation


# instance fields
.field final synthetic $interval:J

.field J$0:J

.field private synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(JLkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/util/TimeUtil$audioTimeFlow$1$1;",
            ">;)V"
        }
    .end annotation

    iput-wide p1, p0, Lcom/sma/smartv3/util/TimeUtil$audioTimeFlow$1$1;->$interval:J

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

    new-instance v0, Lcom/sma/smartv3/util/TimeUtil$audioTimeFlow$1$1;

    iget-wide v1, p0, Lcom/sma/smartv3/util/TimeUtil$audioTimeFlow$1$1;->$interval:J

    invoke-direct {v0, v1, v2, p2}, Lcom/sma/smartv3/util/TimeUtil$audioTimeFlow$1$1;-><init>(JLkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/sma/smartv3/util/TimeUtil$audioTimeFlow$1$1;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lcom/android/mltcode/paycertificationapi/IXiXI;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/mltcode/paycertificationapi/IXiXI<",
            "-",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/util/TimeUtil$audioTimeFlow$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/util/TimeUtil$audioTimeFlow$1$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/util/TimeUtil$audioTimeFlow$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/IXiXI;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/util/TimeUtil$audioTimeFlow$1$1;->invoke(Lcom/android/mltcode/paycertificationapi/IXiXI;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Lcom/sma/smartv3/util/TimeUtil$audioTimeFlow$1$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/android/mltcode/paycertificationapi/IXiXI;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v1

    iget v2, p0, Lcom/sma/smartv3/util/TimeUtil$audioTimeFlow$1$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-wide v5, p0, Lcom/sma/smartv3/util/TimeUtil$audioTimeFlow$1$1;->J$0:J

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-wide v5, p0, Lcom/sma/smartv3/util/TimeUtil$audioTimeFlow$1$1;->J$0:J

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    const-wide/16 v5, 0x0

    :cond_3
    :goto_0
    iget-wide v7, p0, Lcom/sma/smartv3/util/TimeUtil$audioTimeFlow$1$1;->$interval:J

    iput-object v0, p0, Lcom/sma/smartv3/util/TimeUtil$audioTimeFlow$1$1;->L$0:Ljava/lang/Object;

    iput-wide v5, p0, Lcom/sma/smartv3/util/TimeUtil$audioTimeFlow$1$1;->J$0:J

    iput v4, p0, Lcom/sma/smartv3/util/TimeUtil$audioTimeFlow$1$1;->label:I

    invoke-static {v7, v8, p0}, Lkotlinx/coroutines/DelayKt;->XIi00iiXO(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    iget-wide v7, p0, Lcom/sma/smartv3/util/TimeUtil$audioTimeFlow$1$1;->$interval:J

    add-long/2addr v5, v7

    sget-object p1, Lcom/sma/smartv3/util/TimeUtil;->OXO1:Lcom/sma/smartv3/util/TimeUtil;

    invoke-virtual {p1, v5, v6}, Lcom/sma/smartv3/util/TimeUtil;->O00(J)Ljava/lang/String;

    move-result-object p1

    iput-object v0, p0, Lcom/sma/smartv3/util/TimeUtil$audioTimeFlow$1$1;->L$0:Ljava/lang/Object;

    iput-wide v5, p0, Lcom/sma/smartv3/util/TimeUtil$audioTimeFlow$1$1;->J$0:J

    iput v3, p0, Lcom/sma/smartv3/util/TimeUtil$audioTimeFlow$1$1;->label:I

    invoke-interface {v0, p1, p0}, Lcom/android/mltcode/paycertificationapi/IXiXI;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    :goto_2
    return-object v1
.end method
