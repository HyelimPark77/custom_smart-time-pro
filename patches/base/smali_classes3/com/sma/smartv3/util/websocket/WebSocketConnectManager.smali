.class public final Lcom/sma/smartv3/util/websocket/WebSocketConnectManager;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final OXO1:Lcom/android/mltcode/paycertificationapi/cw6;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final XIi00iiXO:Lcom/android/mltcode/paycertificationapi/bw6;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public XO0O10:Lkotlinx/coroutines/XiOIO;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public final iO:Ljava/util/concurrent/atomic/AtomicBoolean;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/android/mltcode/paycertificationapi/cw6;Lcom/android/mltcode/paycertificationapi/bw6;)V
    .locals 1
    .param p1    # Lcom/android/mltcode/paycertificationapi/cw6;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/android/mltcode/paycertificationapi/bw6;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "client"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager;->OXO1:Lcom/android/mltcode/paycertificationapi/cw6;

    .line 3
    iput-object p2, p0, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager;->XIi00iiXO:Lcom/android/mltcode/paycertificationapi/bw6;

    .line 4
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager;->iO:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/android/mltcode/paycertificationapi/cw6;Lcom/android/mltcode/paycertificationapi/bw6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 13

    and-int/lit8 v0, p3, 0x1

    if-eqz v0, :cond_0

    .line 5
    new-instance v1, Lcom/android/mltcode/paycertificationapi/cw6;

    const/16 v11, 0x7f

    const/4 v12, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    invoke-direct/range {v1 .. v12}, Lcom/android/mltcode/paycertificationapi/cw6;-><init>(IIJZZZJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p1, v1

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager;-><init>(Lcom/android/mltcode/paycertificationapi/cw6;Lcom/android/mltcode/paycertificationapi/bw6;)V

    return-void
.end method

.method public static final synthetic OXO1(Lcom/sma/smartv3/util/websocket/WebSocketConnectManager;)Lcom/android/mltcode/paycertificationapi/bw6;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager;->XIi00iiXO:Lcom/android/mltcode/paycertificationapi/bw6;

    return-object p0
.end method

.method public static final synthetic XIi00iiXO(Lcom/sma/smartv3/util/websocket/WebSocketConnectManager;)Lcom/android/mltcode/paycertificationapi/cw6;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager;->OXO1:Lcom/android/mltcode/paycertificationapi/cw6;

    return-object p0
.end method


# virtual methods
.method public final O00(Lokhttp3/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .param p1    # Lokhttp3/Request;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokhttp3/Request;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager$reconnect$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager$reconnect$1;

    iget v1, v0, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager$reconnect$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager$reconnect$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager$reconnect$1;

    invoke-direct {v0, p0, p2}, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager$reconnect$1;-><init>(Lcom/sma/smartv3/util/websocket/WebSocketConnectManager;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager$reconnect$1;->result:Ljava/lang/Object;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager$reconnect$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager$reconnect$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lokhttp3/Request;

    invoke-static {p2}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager;->iO:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p2

    if-eqz p2, :cond_3

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1

    :cond_3
    iget-object p2, p0, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager;->OXO1:Lcom/android/mltcode/paycertificationapi/cw6;

    invoke-virtual {p2}, Lcom/android/mltcode/paycertificationapi/cw6;->OIX0iXi()Z

    move-result p2

    if-nez p2, :cond_4

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1

    :cond_4
    iget-object p2, p0, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager;->OXO1:Lcom/android/mltcode/paycertificationapi/cw6;

    invoke-virtual {p2}, Lcom/android/mltcode/paycertificationapi/cw6;->IO()Z

    move-result p2

    if-eqz p2, :cond_5

    iget-object p2, p0, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager;->OXO1:Lcom/android/mltcode/paycertificationapi/cw6;

    invoke-virtual {p2}, Lcom/android/mltcode/paycertificationapi/cw6;->O10IXXX0X()I

    move-result p2

    iget-object v2, p0, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager;->OXO1:Lcom/android/mltcode/paycertificationapi/cw6;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/cw6;->XXI()I

    move-result v2

    if-lt p2, v2, :cond_5

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1

    :cond_5
    iget-object p2, p0, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager;->iO:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object p2, p0, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager;->OXO1:Lcom/android/mltcode/paycertificationapi/cw6;

    invoke-virtual {p2}, Lcom/android/mltcode/paycertificationapi/cw6;->X0O()J

    move-result-wide v4

    iput-object p1, v0, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager$reconnect$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager$reconnect$1;->label:I

    invoke-static {v4, v5, v0}, Lkotlinx/coroutines/DelayKt;->XIi00iiXO(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_6

    return-object v1

    :cond_6
    :goto_1
    iget-object p2, p0, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager;->XIi00iiXO:Lcom/android/mltcode/paycertificationapi/bw6;

    invoke-interface {p2}, Lcom/android/mltcode/paycertificationapi/bw6;->disconnect()V

    iget-object p2, p0, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager;->OXO1:Lcom/android/mltcode/paycertificationapi/cw6;

    invoke-virtual {p2}, Lcom/android/mltcode/paycertificationapi/cw6;->O10IXXX0X()I

    move-result v0

    add-int/2addr v0, v3

    invoke-virtual {p2, v0}, Lcom/android/mltcode/paycertificationapi/cw6;->XX0(I)V

    iget-object p2, p0, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager;->XIi00iiXO:Lcom/android/mltcode/paycertificationapi/bw6;

    invoke-interface {p2, p1}, Lcom/android/mltcode/paycertificationapi/bw6;->XO0O10(Lokhttp3/Request;)V

    iget-object p1, p0, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager;->iO:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method

.method public final XO0O10(Lcom/android/mltcode/paycertificationapi/i00OIXiO;)V
    .locals 7
    .param p1    # Lcom/android/mltcode/paycertificationapi/i00OIXiO;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager;->iO()V

    iget-object v0, p0, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager;->OXO1:Lcom/android/mltcode/paycertificationapi/cw6;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/cw6;->X1ii()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v2

    new-instance v4, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager$heartBeat$1;

    const/4 v0, 0x0

    invoke-direct {v4, p0, v0}, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager$heartBeat$1;-><init>(Lcom/sma/smartv3/util/websocket/WebSocketConnectManager;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager;->XO0O10:Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method public final iO()V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager;->XO0O10:Lkotlinx/coroutines/XiOIO;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/XiOIO$OXO1;->XIi00iiXO(Lkotlinx/coroutines/XiOIO;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_0
    iput-object v1, p0, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager;->XO0O10:Lkotlinx/coroutines/XiOIO;

    return-void
.end method
