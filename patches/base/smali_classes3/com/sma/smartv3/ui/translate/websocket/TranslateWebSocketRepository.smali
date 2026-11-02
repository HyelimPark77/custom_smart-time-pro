.class public final Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTranslateWebSocketRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TranslateWebSocketRepository.kt\ncom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,62:1\n56#2:63\n59#2:67\n46#3:64\n51#3:66\n105#4:65\n*S KotlinDebug\n*F\n+ 1 TranslateWebSocketRepository.kt\ncom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository\n*L\n27#1:63\n27#1:67\n27#1:64\n27#1:66\n27#1:65\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nTranslateWebSocketRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TranslateWebSocketRepository.kt\ncom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,62:1\n56#2:63\n59#2:67\n46#3:64\n51#3:66\n105#4:65\n*S KotlinDebug\n*F\n+ 1 TranslateWebSocketRepository.kt\ncom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository\n*L\n27#1:63\n27#1:67\n27#1:64\n27#1:66\n27#1:65\n*E\n"
    }
.end annotation


# instance fields
.field public final O00:Lcom/android/mltcode/paycertificationapi/ii0iIIX0;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/ii0iIIX0<",
            "Lcom/sma/smartv3/util/websocket/data/WebSocketMessage;",
            ">;"
        }
    .end annotation
.end field

.field public final OXO1:Lcom/android/mltcode/paycertificationapi/i00OIXiO;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final XIi00iiXO:Lcom/android/mltcode/paycertificationapi/bw6;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public XO0O10:Lokhttp3/Request;

.field public final iO:Lcom/sma/smartv3/util/websocket/WebSocketConnectManager;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lcom/android/mltcode/paycertificationapi/bw6;Lcom/sma/smartv3/util/websocket/WebSocketConnectManager;)V
    .locals 7
    .param p1    # Lcom/android/mltcode/paycertificationapi/i00OIXiO;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/android/mltcode/paycertificationapi/bw6;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Lcom/sma/smartv3/util/websocket/WebSocketConnectManager;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "client"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository;->OXO1:Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    iput-object p2, p0, Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository;->XIi00iiXO:Lcom/android/mltcode/paycertificationapi/bw6;

    iput-object p3, p0, Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository;->iO:Lcom/sma/smartv3/util/websocket/WebSocketConnectManager;

    invoke-interface {p2}, Lcom/android/mltcode/paycertificationapi/bw6;->iO()Lcom/android/mltcode/paycertificationapi/l94;

    move-result-object p2

    new-instance p3, Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository$special$$inlined$mapNotNull$1;

    invoke-direct {p3, p2}, Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository$special$$inlined$mapNotNull$1;-><init>(Lcom/android/mltcode/paycertificationapi/ii0iIIX0;)V

    sget-object v0, Lkotlinx/coroutines/flow/OXO1;->OXO1:Lkotlinx/coroutines/flow/OXO1$OXO1;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    invoke-static/range {v0 .. v6}, Lkotlinx/coroutines/flow/OXO1$OXO1;->XIi00iiXO(Lkotlinx/coroutines/flow/OXO1$OXO1;JJILjava/lang/Object;)Lkotlinx/coroutines/flow/OXO1;

    move-result-object p2

    const/4 v0, 0x0

    invoke-static {p3, p1, p2, v0}, Lcom/android/mltcode/paycertificationapi/iX0XiO;->XOO0Xi(Lcom/android/mltcode/paycertificationapi/ii0iIIX0;Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlinx/coroutines/flow/OXO1;I)Lcom/android/mltcode/paycertificationapi/l94;

    move-result-object p2

    iput-object p2, p0, Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository;->O00:Lcom/android/mltcode/paycertificationapi/ii0iIIX0;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v1

    new-instance v3, Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository$1;

    const/4 p2, 0x0

    invoke-direct {v3, p0, p2}, Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository$1;-><init>(Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method public static final synthetic OXO1(Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository;)Lokhttp3/Request;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository;->XO0O10:Lokhttp3/Request;

    return-object p0
.end method

.method public static final synthetic XIi00iiXO(Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository;)Lcom/sma/smartv3/util/websocket/WebSocketConnectManager;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository;->iO:Lcom/sma/smartv3/util/websocket/WebSocketConnectManager;

    return-object p0
.end method

.method public static final synthetic iO(Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository;->OXO1:Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    return-object p0
.end method


# virtual methods
.method public final I0IIOi()Lcom/android/mltcode/paycertificationapi/k85;
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

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository;->XIi00iiXO:Lcom/android/mltcode/paycertificationapi/bw6;

    invoke-interface {v0}, Lcom/android/mltcode/paycertificationapi/bw6;->OXO1()Lcom/android/mltcode/paycertificationapi/k85;

    move-result-object v0

    return-object v0
.end method

.method public final IiI10X()V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository;->XIi00iiXO:Lcom/android/mltcode/paycertificationapi/bw6;

    invoke-interface {v0}, Lcom/android/mltcode/paycertificationapi/bw6;->disconnect()V

    return-void
.end method

.method public final O00(Lokhttp3/Request;)V
    .locals 1
    .param p1    # Lokhttp3/Request;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository;->XO0O10:Lokhttp3/Request;

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository;->XIi00iiXO:Lcom/android/mltcode/paycertificationapi/bw6;

    invoke-interface {v0, p1}, Lcom/android/mltcode/paycertificationapi/bw6;->XO0O10(Lokhttp3/Request;)V

    return-void
.end method

.method public final OIi0()Lcom/android/mltcode/paycertificationapi/ii0iIIX0;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/android/mltcode/paycertificationapi/ii0iIIX0<",
            "Lcom/sma/smartv3/util/websocket/data/WebSocketMessage;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository;->O00:Lcom/android/mltcode/paycertificationapi/ii0iIIX0;

    return-object v0
.end method

.method public final XO0O10()V
    .locals 3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository;->IiI10X()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository;->OXO1:Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/I0IIOi;->IiI10X(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    return-void
.end method

.method public final XOO0ii0()Lcom/android/mltcode/paycertificationapi/bw6;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository;->XIi00iiXO:Lcom/android/mltcode/paycertificationapi/bw6;

    return-object v0
.end method
