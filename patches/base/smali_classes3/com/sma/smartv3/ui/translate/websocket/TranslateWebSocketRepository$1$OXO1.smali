.class public final Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository$1$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/IXiXI;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/IXiXI;"
    }
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository$1$OXO1;->IO:Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final OXO1(Lcom/sma/smartv3/util/websocket/ConnectionState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/util/websocket/ConnectionState;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/sma/smartv3/util/websocket/ConnectionState$XO0O10;

    if-eqz v0, :cond_3

    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository$1$OXO1;->IO:Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository;

    invoke-static {p1}, Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository;->XIi00iiXO(Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository;)Lcom/sma/smartv3/util/websocket/WebSocketConnectManager;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager;->iO()V

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository$1$OXO1;->IO:Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository;

    invoke-static {p1}, Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository;->OXO1(Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository;)Lokhttp3/Request;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository$1$OXO1;->IO:Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository;

    invoke-static {p1}, Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository;->XIi00iiXO(Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository;)Lcom/sma/smartv3/util/websocket/WebSocketConnectManager;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository$1$OXO1;->IO:Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository;

    invoke-static {v0}, Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository;->OXO1(Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository;)Lokhttp3/Request;

    move-result-object v0

    if-nez v0, :cond_1

    const-string v0, "lastRequest"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_1
    invoke-virtual {p1, v0, p2}, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager;->O00(Lokhttp3/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_2

    return-object p1

    :cond_2
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1

    :cond_3
    instance-of p1, p1, Lcom/sma/smartv3/util/websocket/ConnectionState$OXO1;

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository$1$OXO1;->IO:Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository;

    invoke-static {p1}, Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository;->XIi00iiXO(Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository;)Lcom/sma/smartv3/util/websocket/WebSocketConnectManager;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object p2, p0, Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository$1$OXO1;->IO:Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository;

    invoke-static {p2}, Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository;->iO(Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/util/websocket/WebSocketConnectManager;->XO0O10(Lcom/android/mltcode/paycertificationapi/i00OIXiO;)V

    :cond_4
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/sma/smartv3/util/websocket/ConnectionState;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository$1$OXO1;->OXO1(Lcom/sma/smartv3/util/websocket/ConnectionState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
