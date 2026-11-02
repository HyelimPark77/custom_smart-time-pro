.class public final Lcom/sma/smartv3/util/websocket/WebSocketServiceClient$createListener$1;
.super Lokhttp3/WebSocketListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/util/websocket/WebSocketServiceClient;->OIi0()Lcom/sma/smartv3/util/websocket/WebSocketServiceClient$createListener$1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/util/websocket/WebSocketServiceClient;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/util/websocket/WebSocketServiceClient;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/util/websocket/WebSocketServiceClient$createListener$1;->OXO1:Lcom/sma/smartv3/util/websocket/WebSocketServiceClient;

    invoke-direct {p0}, Lokhttp3/WebSocketListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onClosed(Lokhttp3/WebSocket;ILjava/lang/String;)V
    .locals 0

    const-string p2, "webSocket"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "reason"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/util/websocket/WebSocketServiceClient$createListener$1;->OXO1:Lcom/sma/smartv3/util/websocket/WebSocketServiceClient;

    invoke-static {p1}, Lcom/sma/smartv3/util/websocket/WebSocketServiceClient;->IiI10X(Lcom/sma/smartv3/util/websocket/WebSocketServiceClient;)Lcom/android/mltcode/paycertificationapi/ty0;

    move-result-object p1

    sget-object p2, Lcom/sma/smartv3/util/websocket/ConnectionState$iO;->OXO1:Lcom/sma/smartv3/util/websocket/ConnectionState$iO;

    invoke-interface {p1, p2}, Lcom/android/mltcode/paycertificationapi/ty0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public onFailure(Lokhttp3/WebSocket;Ljava/lang/Throwable;Lokhttp3/Response;)V
    .locals 0

    const-string p3, "webSocket"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "t"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/util/websocket/WebSocketServiceClient$createListener$1;->OXO1:Lcom/sma/smartv3/util/websocket/WebSocketServiceClient;

    invoke-static {p1}, Lcom/sma/smartv3/util/websocket/WebSocketServiceClient;->IiI10X(Lcom/sma/smartv3/util/websocket/WebSocketServiceClient;)Lcom/android/mltcode/paycertificationapi/ty0;

    move-result-object p1

    new-instance p3, Lcom/sma/smartv3/util/websocket/ConnectionState$XO0O10;

    invoke-direct {p3, p2}, Lcom/sma/smartv3/util/websocket/ConnectionState$XO0O10;-><init>(Ljava/lang/Throwable;)V

    invoke-interface {p1, p3}, Lcom/android/mltcode/paycertificationapi/ty0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public onMessage(Lokhttp3/WebSocket;Ljava/lang/String;)V
    .locals 6

    const-string v0, "webSocket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "text"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object p1, p0, Lcom/sma/smartv3/util/websocket/WebSocketServiceClient$createListener$1;->OXO1:Lcom/sma/smartv3/util/websocket/WebSocketServiceClient;

    invoke-static {p1}, Lcom/sma/smartv3/util/websocket/WebSocketServiceClient;->O00(Lcom/sma/smartv3/util/websocket/WebSocketServiceClient;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v0

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->OXO1()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v1

    new-instance v3, Lcom/sma/smartv3/util/websocket/WebSocketServiceClient$createListener$1$onMessage$1;

    iget-object p1, p0, Lcom/sma/smartv3/util/websocket/WebSocketServiceClient$createListener$1;->OXO1:Lcom/sma/smartv3/util/websocket/WebSocketServiceClient;

    const/4 v2, 0x0

    invoke-direct {v3, p1, p2, v2}, Lcom/sma/smartv3/util/websocket/WebSocketServiceClient$createListener$1$onMessage$1;-><init>(Lcom/sma/smartv3/util/websocket/WebSocketServiceClient;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method public onMessage(Lokhttp3/WebSocket;Lokio/ByteString;)V
    .locals 6

    const-string v0, "webSocket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "bytes"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object p1, p0, Lcom/sma/smartv3/util/websocket/WebSocketServiceClient$createListener$1;->OXO1:Lcom/sma/smartv3/util/websocket/WebSocketServiceClient;

    invoke-static {p1}, Lcom/sma/smartv3/util/websocket/WebSocketServiceClient;->O00(Lcom/sma/smartv3/util/websocket/WebSocketServiceClient;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v0

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->OXO1()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v1

    new-instance v3, Lcom/sma/smartv3/util/websocket/WebSocketServiceClient$createListener$1$onMessage$2;

    iget-object p1, p0, Lcom/sma/smartv3/util/websocket/WebSocketServiceClient$createListener$1;->OXO1:Lcom/sma/smartv3/util/websocket/WebSocketServiceClient;

    const/4 v2, 0x0

    invoke-direct {v3, p1, p2, v2}, Lcom/sma/smartv3/util/websocket/WebSocketServiceClient$createListener$1$onMessage$2;-><init>(Lcom/sma/smartv3/util/websocket/WebSocketServiceClient;Lokio/ByteString;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method public onOpen(Lokhttp3/WebSocket;Lokhttp3/Response;)V
    .locals 2

    const-string v0, "webSocket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "response"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onOpen:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/util/websocket/WebSocketServiceClient$createListener$1;->OXO1:Lcom/sma/smartv3/util/websocket/WebSocketServiceClient;

    invoke-static {p1}, Lcom/sma/smartv3/util/websocket/WebSocketServiceClient;->IiI10X(Lcom/sma/smartv3/util/websocket/WebSocketServiceClient;)Lcom/android/mltcode/paycertificationapi/ty0;

    move-result-object p1

    sget-object p2, Lcom/sma/smartv3/util/websocket/ConnectionState$OXO1;->OXO1:Lcom/sma/smartv3/util/websocket/ConnectionState$OXO1;

    invoke-interface {p1, p2}, Lcom/android/mltcode/paycertificationapi/ty0;->setValue(Ljava/lang/Object;)V

    return-void
.end method
