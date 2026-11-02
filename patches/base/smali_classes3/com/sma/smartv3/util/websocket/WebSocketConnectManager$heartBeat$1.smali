.class final Lcom/sma/smartv3/util/websocket/WebSocketConnectManager$heartBeat$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/util/websocket/WebSocketConnectManager;->XO0O10(Lcom/android/mltcode/paycertificationapi/i00OIXiO;)V
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
    c = "com.sma.smartv3.util.websocket.WebSocketConnectManager$heartBeat$1"
    f = "WebSocketConnectManager.kt"
    i = {
        0x0
    }
    l = {
        0x28
    }
    m = "invokeSuspend"
    n = {
        "$this$launch"
    }
    s = {
        "L$0"
    }
    v = 0x1
.end annotation


# instance fields
.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/sma/smartv3/util/websocket/WebSocketConnectManager;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/util/websocket/WebSocketConnectManager;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/util/websocket/WebSocketConnectManager;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/util/websocket/WebSocketConnectManager$heartBeat$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager$heartBeat$1;->this$0:Lcom/sma/smartv3/util/websocket/WebSocketConnectManager;

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

    new-instance v0, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager$heartBeat$1;

    iget-object v1, p0, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager$heartBeat$1;->this$0:Lcom/sma/smartv3/util/websocket/WebSocketConnectManager;

    invoke-direct {v0, v1, p2}, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager$heartBeat$1;-><init>(Lcom/sma/smartv3/util/websocket/WebSocketConnectManager;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager$heartBeat$1;->L$0:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager$heartBeat$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager$heartBeat$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager$heartBeat$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager$heartBeat$1;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager$heartBeat$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v1

    iget v2, p0, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager$heartBeat$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    :goto_0
    invoke-static {v0}, Lkotlinx/coroutines/I0IIOi;->OIX0iXi(Lcom/android/mltcode/paycertificationapi/i00OIXiO;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager$heartBeat$1;->this$0:Lcom/sma/smartv3/util/websocket/WebSocketConnectManager;

    invoke-static {p1}, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager;->XIi00iiXO(Lcom/sma/smartv3/util/websocket/WebSocketConnectManager;)Lcom/android/mltcode/paycertificationapi/cw6;

    move-result-object p1

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/cw6;->I0iXXO()J

    move-result-wide v4

    iput-object v0, p0, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager$heartBeat$1;->L$0:Ljava/lang/Object;

    iput v3, p0, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager$heartBeat$1;->label:I

    invoke-static {v4, v5, p0}, Lkotlinx/coroutines/DelayKt;->XIi00iiXO(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    :cond_2
    :goto_1
    :try_start_0
    const-string p1, "{\"type\":\"ping\"}"

    iget-object v2, p0, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager$heartBeat$1;->this$0:Lcom/sma/smartv3/util/websocket/WebSocketConnectManager;

    invoke-static {v2}, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager;->OXO1(Lcom/sma/smartv3/util/websocket/WebSocketConnectManager;)Lcom/android/mltcode/paycertificationapi/bw6;

    move-result-object v2

    invoke-interface {v2, p1}, Lcom/android/mltcode/paycertificationapi/bw6;->send(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_0

    :cond_3
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method
