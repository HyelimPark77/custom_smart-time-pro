.class final Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$speakingOrConnectedFlow$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;-><init>(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository;Lcom/sma/smartv3/ui/translate/AudioRepository;Lcom/sma/smartv3/ui/translate/TranslateEntityRepository;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function3<",
        "Lcom/sma/smartv3/util/websocket/ConnectionState;",
        "Ljava/lang/Boolean;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Ljava/lang/Boolean;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.sma.smartv3.ui.translate.websocket.WebsocketTranslateUseCase$speakingOrConnectedFlow$1"
    f = "WebsocketTranslateUseCase.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
    v = 0x1
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field synthetic Z$0:Z

.field label:I

.field final synthetic this$0:Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$speakingOrConnectedFlow$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$speakingOrConnectedFlow$1;->this$0:Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lcom/sma/smartv3/util/websocket/ConnectionState;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/util/websocket/ConnectionState;",
            "Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$speakingOrConnectedFlow$1;

    iget-object v1, p0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$speakingOrConnectedFlow$1;->this$0:Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;

    invoke-direct {v0, v1, p3}, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$speakingOrConnectedFlow$1;-><init>(Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$speakingOrConnectedFlow$1;->L$0:Ljava/lang/Object;

    iput-boolean p2, v0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$speakingOrConnectedFlow$1;->Z$0:Z

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$speakingOrConnectedFlow$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/sma/smartv3/util/websocket/ConnectionState;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    check-cast p3, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$speakingOrConnectedFlow$1;->invoke(Lcom/sma/smartv3/util/websocket/ConnectionState;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$speakingOrConnectedFlow$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/sma/smartv3/util/websocket/ConnectionState;

    iget-boolean v1, p0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$speakingOrConnectedFlow$1;->Z$0:Z

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    iget v2, p0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$speakingOrConnectedFlow$1;->label:I

    if-nez v2, :cond_2

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    instance-of p1, v0, Lcom/sma/smartv3/util/websocket/ConnectionState$OXO1;

    sget-object v2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v3, p0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$speakingOrConnectedFlow$1;->this$0:Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;

    invoke-static {v3}, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;->O00(Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " ConnectState:"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " SpeakingState:"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    if-nez p1, :cond_1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->OXO1(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
