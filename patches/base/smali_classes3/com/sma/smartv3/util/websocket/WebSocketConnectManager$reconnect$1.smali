.class final Lcom/sma/smartv3/util/websocket/WebSocketConnectManager$reconnect$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/util/websocket/WebSocketConnectManager;->O00(Lokhttp3/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.sma.smartv3.util.websocket.WebSocketConnectManager"
    f = "WebSocketConnectManager.kt"
    i = {
        0x0
    }
    l = {
        0x1a
    }
    m = "reconnect"
    n = {
        "request"
    }
    s = {
        "L$0"
    }
    v = 0x1
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

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
            "Lcom/sma/smartv3/util/websocket/WebSocketConnectManager$reconnect$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager$reconnect$1;->this$0:Lcom/sma/smartv3/util/websocket/WebSocketConnectManager;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager$reconnect$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager$reconnect$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager$reconnect$1;->label:I

    iget-object p1, p0, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager$reconnect$1;->this$0:Lcom/sma/smartv3/util/websocket/WebSocketConnectManager;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager;->O00(Lokhttp3/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
