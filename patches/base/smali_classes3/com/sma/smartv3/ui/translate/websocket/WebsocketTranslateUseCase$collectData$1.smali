.class final Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$collectData$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;->XXI()V
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
    c = "com.sma.smartv3.ui.translate.websocket.WebsocketTranslateUseCase$collectData$1"
    f = "WebsocketTranslateUseCase.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
    v = 0x1
.end annotation


# instance fields
.field private synthetic L$0:Ljava/lang/Object;

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
            "Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$collectData$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$collectData$1;->this$0:Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
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

    new-instance v0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$collectData$1;

    iget-object v1, p0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$collectData$1;->this$0:Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;

    invoke-direct {v0, v1, p2}, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$collectData$1;-><init>(Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$collectData$1;->L$0:Ljava/lang/Object;

    return-object v0
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
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$collectData$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$collectData$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$collectData$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$collectData$1;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$collectData$1;->L$0:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    iget v0, p0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$collectData$1;->label:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    new-instance v4, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$collectData$1$1;

    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$collectData$1;->this$0:Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;

    const/4 v0, 0x0

    invoke-direct {v4, p1, v0}, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$collectData$1$1;-><init>(Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v2

    new-instance v4, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$collectData$1$2;

    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$collectData$1;->this$0:Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;

    invoke-direct {v4, p1, v0}, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$collectData$1$2;-><init>(Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x2

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
