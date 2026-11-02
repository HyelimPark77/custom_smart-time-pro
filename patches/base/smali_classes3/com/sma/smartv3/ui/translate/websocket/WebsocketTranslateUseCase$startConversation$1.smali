.class final Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$startConversation$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;->X01IiOiIi(Lcom/sma/smartv3/ui/translate/websocket/TranslateUseCaseMODE;ZZ)Lkotlinx/coroutines/XiOIO;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$startConversation$1$iO;
    }
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
    c = "com.sma.smartv3.ui.translate.websocket.WebsocketTranslateUseCase$startConversation$1"
    f = "WebsocketTranslateUseCase.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
    v = 0x1
.end annotation


# instance fields
.field final synthetic $mode:Lcom/sma/smartv3/ui/translate/websocket/TranslateUseCaseMODE;

.field final synthetic $play:Z

.field final synthetic $record:Z

.field label:I

.field final synthetic this$0:Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/translate/websocket/TranslateUseCaseMODE;Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;ZZLkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/translate/websocket/TranslateUseCaseMODE;",
            "Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;",
            "ZZ",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$startConversation$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$startConversation$1;->$mode:Lcom/sma/smartv3/ui/translate/websocket/TranslateUseCaseMODE;

    iput-object p2, p0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$startConversation$1;->this$0:Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;

    iput-boolean p3, p0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$startConversation$1;->$record:Z

    iput-boolean p4, p0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$startConversation$1;->$play:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 6
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

    new-instance v0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$startConversation$1;

    iget-object v1, p0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$startConversation$1;->$mode:Lcom/sma/smartv3/ui/translate/websocket/TranslateUseCaseMODE;

    iget-object v2, p0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$startConversation$1;->this$0:Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;

    iget-boolean v3, p0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$startConversation$1;->$record:Z

    iget-boolean v4, p0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$startConversation$1;->$play:Z

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$startConversation$1;-><init>(Lcom/sma/smartv3/ui/translate/websocket/TranslateUseCaseMODE;Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;ZZLkotlin/coroutines/Continuation;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$startConversation$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$startConversation$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$startConversation$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$startConversation$1;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    iget v0, p0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$startConversation$1;->label:I

    if-nez v0, :cond_3

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$startConversation$1;->$mode:Lcom/sma/smartv3/ui/translate/websocket/TranslateUseCaseMODE;

    sget-object v0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$startConversation$1$iO;->OXO1:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$startConversation$1;->this$0:Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;

    invoke-static {p1}, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;->XOO0ii0(Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;)Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$startConversation$1;->this$0:Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;

    invoke-static {v0}, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;->XIi00iiXO(Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;)Lcom/android/mltcode/paycertificationapi/iOX1XO;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/iOX1XO;->OXO1()Lokhttp3/Request;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository;->O00(Lokhttp3/Request;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$startConversation$1;->this$0:Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;

    invoke-static {p1}, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;->iO(Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;)Lcom/sma/smartv3/ui/translate/AudioRepository;

    move-result-object p1

    new-instance v0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$startConversation$1$XIi00iiXO;

    iget-object v1, p0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$startConversation$1;->this$0:Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;

    invoke-direct {v0, v1}, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$startConversation$1$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;)V

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/translate/AudioRepository;->OIX0iXi(Lcom/android/mltcode/paycertificationapi/iXOIii;)V

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$startConversation$1;->this$0:Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;

    invoke-static {p1}, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;->XOO0ii0(Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;)Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$startConversation$1;->this$0:Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;

    invoke-static {v0}, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;->XIi00iiXO(Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;)Lcom/android/mltcode/paycertificationapi/iOX1XO;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/iOX1XO;->OXO1()Lokhttp3/Request;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/translate/websocket/TranslateWebSocketRepository;->O00(Lokhttp3/Request;)V

    iget-boolean p1, p0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$startConversation$1;->$record:Z

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$startConversation$1;->this$0:Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;

    invoke-static {p1}, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;->iO(Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;)Lcom/sma/smartv3/ui/translate/AudioRepository;

    move-result-object p1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$startConversation$1;->$play:Z

    new-instance v1, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$startConversation$1$OXO1;

    iget-object v2, p0, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$startConversation$1;->this$0:Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;

    invoke-direct {v1, v2}, Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase$startConversation$1$OXO1;-><init>(Lcom/sma/smartv3/ui/translate/websocket/WebsocketTranslateUseCase;)V

    invoke-virtual {p1, v0, v1}, Lcom/sma/smartv3/ui/translate/AudioRepository;->OIi0(ZLcom/android/mltcode/paycertificationapi/iXOIii;)V

    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
