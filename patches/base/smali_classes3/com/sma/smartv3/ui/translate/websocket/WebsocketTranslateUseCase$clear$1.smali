.class final Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$clear$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;->I0iXXO()Lkotlinx/coroutines/XiOIO;
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
    c = "com.sma.smartv3.ui.translate.websocket.WebsocketTranslateUseCase$clear$1"
    f = "WebsocketTranslateUseCase.kt"
    i = {}
    l = {
        0xd5,
        0xd8
    }
    m = "invokeSuspend"
    n = {}
    s = {}
    v = 0x1
.end annotation


# instance fields
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
            "Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$clear$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$clear$1;->this$0:Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1
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

    new-instance p1, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$clear$1;

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$clear$1;->this$0:Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;

    invoke-direct {p1, v0, p2}, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$clear$1;-><init>(Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;Lkotlin/coroutines/Continuation;)V

    return-object p1
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
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$clear$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$clear$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$clear$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$clear$1;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$clear$1;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$clear$1;->this$0:Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;

    invoke-static {p1}, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;->XOO0ii0(Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;)Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository;->IiI10X()V

    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$clear$1;->this$0:Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;

    invoke-static {p1}, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;->iO(Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;)Lcom/sma/smartv3/ui/translate/AudioRepository;

    move-result-object p1

    iput v3, p0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$clear$1;->label:I

    invoke-virtual {p1, p0}, Lcom/sma/smartv3/ui/translate/AudioRepository;->XXI(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$clear$1;->this$0:Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;

    invoke-static {p1}, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;->XO0O10(Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;)Lkotlinx/coroutines/XiOIO;

    move-result-object p1

    const/4 v1, 0x0

    if-eqz p1, :cond_4

    invoke-static {p1, v1, v3, v1}, Lkotlinx/coroutines/XiOIO$OXO1;->XIi00iiXO(Lkotlinx/coroutines/XiOIO;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_4
    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$clear$1;->this$0:Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;

    invoke-static {p1, v1}, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;->IO(Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;Lkotlinx/coroutines/XiOIO;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$clear$1;->this$0:Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;

    invoke-static {p1}, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;->IiI10X(Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;)Lcom/sma/smartv3/ui/translate/TranslateEntityRepository;

    move-result-object p1

    if-eqz p1, :cond_5

    iput v2, p0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$clear$1;->label:I

    invoke-virtual {p1, p0}, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository;->XIi00iiXO(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_1
    return-object v0

    :cond_5
    :goto_2
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method
