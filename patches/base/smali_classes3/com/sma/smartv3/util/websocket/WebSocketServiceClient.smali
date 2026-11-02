.class public final Lcom/sma/smartv3/util/websocket/WebSocketServiceClient;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/bw6;


# instance fields
.field public final I0IIOi:Lcom/android/mltcode/paycertificationapi/ry0;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/ry0<",
            "Lokio/ByteString;",
            ">;"
        }
    .end annotation
.end field

.field public final IiI10X:Lcom/android/mltcode/paycertificationapi/ry0;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/ry0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final O00:Lcom/android/mltcode/paycertificationapi/k85;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/k85<",
            "Lcom/sma/smartv3/util/websocket/ConnectionState;",
            ">;"
        }
    .end annotation
.end field

.field public final OIi0:Lcom/android/mltcode/paycertificationapi/l94;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/l94<",
            "Lokio/ByteString;",
            ">;"
        }
    .end annotation
.end field

.field public final OXO1:Lokhttp3/OkHttpClient;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public XIi00iiXO:Lokhttp3/WebSocket;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public final XO0O10:Lcom/android/mltcode/paycertificationapi/ty0;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/ty0<",
            "Lcom/sma/smartv3/util/websocket/ConnectionState;",
            ">;"
        }
    .end annotation
.end field

.field public final XOO0ii0:Lcom/android/mltcode/paycertificationapi/l94;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/l94<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public iO:Lcom/android/mltcode/paycertificationapi/i00OIXiO;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lokhttp3/OkHttpClient;

    invoke-direct {v0}, Lokhttp3/OkHttpClient;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/util/websocket/WebSocketServiceClient;->OXO1:Lokhttp3/OkHttpClient;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    invoke-static {v0}, Lkotlinx/coroutines/I0IIOi;->OXO1(Lkotlin/coroutines/CoroutineContext;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/util/websocket/WebSocketServiceClient;->iO:Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    sget-object v0, Lcom/sma/smartv3/util/websocket/ConnectionState$iO;->OXO1:Lcom/sma/smartv3/util/websocket/ConnectionState$iO;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/l85;->OXO1(Ljava/lang/Object;)Lcom/android/mltcode/paycertificationapi/ty0;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/util/websocket/WebSocketServiceClient;->XO0O10:Lcom/android/mltcode/paycertificationapi/ty0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/iX0XiO;->XXI(Lcom/android/mltcode/paycertificationapi/ty0;)Lcom/android/mltcode/paycertificationapi/k85;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/util/websocket/WebSocketServiceClient;->O00:Lcom/android/mltcode/paycertificationapi/k85;

    const/4 v0, 0x0

    const/16 v1, 0x40

    const/4 v2, 0x0

    const/4 v3, 0x5

    invoke-static {v0, v1, v2, v3, v2}, Lcom/android/mltcode/paycertificationapi/m94;->XIi00iiXO(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lcom/android/mltcode/paycertificationapi/ry0;

    move-result-object v4

    iput-object v4, p0, Lcom/sma/smartv3/util/websocket/WebSocketServiceClient;->IiI10X:Lcom/android/mltcode/paycertificationapi/ry0;

    invoke-static {v4}, Lcom/android/mltcode/paycertificationapi/iX0XiO;->I0iXXO(Lcom/android/mltcode/paycertificationapi/ry0;)Lcom/android/mltcode/paycertificationapi/l94;

    move-result-object v4

    iput-object v4, p0, Lcom/sma/smartv3/util/websocket/WebSocketServiceClient;->XOO0ii0:Lcom/android/mltcode/paycertificationapi/l94;

    invoke-static {v0, v1, v2, v3, v2}, Lcom/android/mltcode/paycertificationapi/m94;->XIi00iiXO(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lcom/android/mltcode/paycertificationapi/ry0;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/util/websocket/WebSocketServiceClient;->I0IIOi:Lcom/android/mltcode/paycertificationapi/ry0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/iX0XiO;->I0iXXO(Lcom/android/mltcode/paycertificationapi/ry0;)Lcom/android/mltcode/paycertificationapi/l94;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/util/websocket/WebSocketServiceClient;->OIi0:Lcom/android/mltcode/paycertificationapi/l94;

    return-void
.end method

.method public static final synthetic I0IIOi(Lcom/sma/smartv3/util/websocket/WebSocketServiceClient;)Lcom/android/mltcode/paycertificationapi/ry0;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/util/websocket/WebSocketServiceClient;->IiI10X:Lcom/android/mltcode/paycertificationapi/ry0;

    return-object p0
.end method

.method public static final synthetic IiI10X(Lcom/sma/smartv3/util/websocket/WebSocketServiceClient;)Lcom/android/mltcode/paycertificationapi/ty0;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/util/websocket/WebSocketServiceClient;->XO0O10:Lcom/android/mltcode/paycertificationapi/ty0;

    return-object p0
.end method

.method public static final synthetic O00(Lcom/sma/smartv3/util/websocket/WebSocketServiceClient;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/util/websocket/WebSocketServiceClient;->iO:Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    return-object p0
.end method

.method public static final synthetic XOO0ii0(Lcom/sma/smartv3/util/websocket/WebSocketServiceClient;)Lcom/android/mltcode/paycertificationapi/ry0;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/util/websocket/WebSocketServiceClient;->I0IIOi:Lcom/android/mltcode/paycertificationapi/ry0;

    return-object p0
.end method


# virtual methods
.method public final OIi0()Lcom/sma/smartv3/util/websocket/WebSocketServiceClient$createListener$1;
    .locals 1

    new-instance v0, Lcom/sma/smartv3/util/websocket/WebSocketServiceClient$createListener$1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/util/websocket/WebSocketServiceClient$createListener$1;-><init>(Lcom/sma/smartv3/util/websocket/WebSocketServiceClient;)V

    return-object v0
.end method

.method public OXO1()Lcom/android/mltcode/paycertificationapi/k85;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/android/mltcode/paycertificationapi/k85<",
            "Lcom/sma/smartv3/util/websocket/ConnectionState;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/util/websocket/WebSocketServiceClient;->O00:Lcom/android/mltcode/paycertificationapi/k85;

    return-object v0
.end method

.method public XIi00iiXO()Lcom/android/mltcode/paycertificationapi/l94;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/android/mltcode/paycertificationapi/l94<",
            "Lokio/ByteString;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/util/websocket/WebSocketServiceClient;->OIi0:Lcom/android/mltcode/paycertificationapi/l94;

    return-object v0
.end method

.method public XO0O10(Lokhttp3/Request;)V
    .locals 2
    .param p1    # Lokhttp3/Request;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/util/websocket/WebSocketServiceClient;->disconnect()V

    iget-object v0, p0, Lcom/sma/smartv3/util/websocket/WebSocketServiceClient;->XO0O10:Lcom/android/mltcode/paycertificationapi/ty0;

    sget-object v1, Lcom/sma/smartv3/util/websocket/ConnectionState$XIi00iiXO;->OXO1:Lcom/sma/smartv3/util/websocket/ConnectionState$XIi00iiXO;

    invoke-interface {v0, v1}, Lcom/android/mltcode/paycertificationapi/ty0;->setValue(Ljava/lang/Object;)V

    :try_start_0
    iget-object v0, p0, Lcom/sma/smartv3/util/websocket/WebSocketServiceClient;->OXO1:Lokhttp3/OkHttpClient;

    invoke-virtual {p0}, Lcom/sma/smartv3/util/websocket/WebSocketServiceClient;->OIi0()Lcom/sma/smartv3/util/websocket/WebSocketServiceClient$createListener$1;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lokhttp3/OkHttpClient;->newWebSocket(Lokhttp3/Request;Lokhttp3/WebSocketListener;)Lokhttp3/WebSocket;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/util/websocket/WebSocketServiceClient;->XIi00iiXO:Lokhttp3/WebSocket;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    iget-object v0, p0, Lcom/sma/smartv3/util/websocket/WebSocketServiceClient;->XO0O10:Lcom/android/mltcode/paycertificationapi/ty0;

    new-instance v1, Lcom/sma/smartv3/util/websocket/ConnectionState$XO0O10;

    invoke-direct {v1, p1}, Lcom/sma/smartv3/util/websocket/ConnectionState$XO0O10;-><init>(Ljava/lang/Throwable;)V

    invoke-interface {v0, v1}, Lcom/android/mltcode/paycertificationapi/ty0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public disconnect()V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/util/websocket/WebSocketServiceClient;->XIi00iiXO:Lokhttp3/WebSocket;

    if-eqz v0, :cond_0

    const/16 v1, 0x3e8

    const-string v2, "Client disconnect"

    invoke-interface {v0, v1, v2}, Lokhttp3/WebSocket;->close(ILjava/lang/String;)Z

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/sma/smartv3/util/websocket/WebSocketServiceClient;->XIi00iiXO:Lokhttp3/WebSocket;

    iget-object v0, p0, Lcom/sma/smartv3/util/websocket/WebSocketServiceClient;->XO0O10:Lcom/android/mltcode/paycertificationapi/ty0;

    sget-object v1, Lcom/sma/smartv3/util/websocket/ConnectionState$iO;->OXO1:Lcom/sma/smartv3/util/websocket/ConnectionState$iO;

    invoke-interface {v0, v1}, Lcom/android/mltcode/paycertificationapi/ty0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public iO()Lcom/android/mltcode/paycertificationapi/l94;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/android/mltcode/paycertificationapi/l94<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/util/websocket/WebSocketServiceClient;->XOO0ii0:Lcom/android/mltcode/paycertificationapi/l94;

    return-object v0
.end method

.method public send(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/sma/smartv3/util/websocket/WebSocketServiceClient;->XIi00iiXO:Lokhttp3/WebSocket;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lokhttp3/WebSocket;->send(Ljava/lang/String;)Z

    :cond_0
    return-void
.end method

.method public send([B)V
    .locals 3
    .param p1    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "bytes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/sma/smartv3/util/websocket/WebSocketServiceClient;->XIi00iiXO:Lokhttp3/WebSocket;

    if-eqz v0, :cond_0

    sget-object v1, Lokio/ByteString;->Companion:Lokio/ByteString$Companion;

    array-length v2, p1

    invoke-static {p1, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    invoke-virtual {v1, p1}, Lokio/ByteString$Companion;->of([B)Lokio/ByteString;

    move-result-object p1

    invoke-interface {v0, p1}, Lokhttp3/WebSocket;->send(Lokio/ByteString;)Z

    :cond_0
    return-void
.end method
