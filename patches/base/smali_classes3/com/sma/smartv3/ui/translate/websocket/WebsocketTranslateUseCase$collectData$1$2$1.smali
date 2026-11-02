.class public final Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$collectData$1$2$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/IXiXI;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$collectData$1$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field public final synthetic IO:Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$collectData$1$2$1;->IO:Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final OXO1(Lcom/sma/smartv3/util/websocket/data/WebSocketMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/util/websocket/data/WebSocketMessage;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$collectData$1$2$1$emit$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$collectData$1$2$1$emit$1;

    iget v1, v0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$collectData$1$2$1$emit$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$collectData$1$2$1$emit$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$collectData$1$2$1$emit$1;

    invoke-direct {v0, p0, p2}, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$collectData$1$2$1$emit$1;-><init>(Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$collectData$1$2$1;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$collectData$1$2$1$emit$1;->result:Ljava/lang/Object;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$collectData$1$2$1$emit$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_1
    iget-object p1, v0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$collectData$1$2$1$emit$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/sma/smartv3/util/websocket/data/WebSocketMessage;

    invoke-static {p2}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    instance-of p2, p1, Lcom/sma/smartv3/util/websocket/data/STTMessage;

    if-eqz p2, :cond_4

    iget-object p2, p0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$collectData$1$2$1;->IO:Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;

    move-object v2, p1

    check-cast v2, Lcom/sma/smartv3/util/websocket/data/STTMessage;

    iput-object p1, v0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$collectData$1$2$1$emit$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$collectData$1$2$1$emit$1;->label:I

    invoke-static {p2, v2, v0}, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;->OIi0(Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;Lcom/sma/smartv3/util/websocket/data/STTMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    goto :goto_2

    :cond_4
    instance-of p2, p1, Lcom/sma/smartv3/util/websocket/data/AudioEndMessage;

    if-eqz p2, :cond_5

    iget-object p2, p0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$collectData$1$2$1;->IO:Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;

    move-object v2, p1

    check-cast v2, Lcom/sma/smartv3/util/websocket/data/AudioEndMessage;

    iput-object p1, v0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$collectData$1$2$1$emit$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$collectData$1$2$1$emit$1;->label:I

    invoke-static {p2, v2, v0}, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;->I0IIOi(Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;Lcom/sma/smartv3/util/websocket/data/AudioEndMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u670d\u52a1\u7aefWebSocket\u65e5\u5fd7\u6253\u5370\uff1a"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/sma/smartv3/util/websocket/data/WebSocketMessage;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$collectData$1$2$1;->OXO1(Lcom/sma/smartv3/util/websocket/data/WebSocketMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
