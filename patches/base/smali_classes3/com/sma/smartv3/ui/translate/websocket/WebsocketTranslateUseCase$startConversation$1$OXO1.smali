.class public final Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$startConversation$1$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/iXOIii;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$startConversation$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$startConversation$1$OXO1;->OXO1:Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final OXO1([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p2, p0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$startConversation$1$OXO1;->OXO1:Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;

    invoke-static {p2}, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;->XOO0ii0(Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;)Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository;

    move-result-object p2

    invoke-virtual {p2}, Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository;->XOO0ii0()Lcom/android/mltcode/paycertificationapi/bw6;

    move-result-object p2

    invoke-interface {p2, p1}, Lcom/android/mltcode/paycertificationapi/bw6;->send([B)V

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method
