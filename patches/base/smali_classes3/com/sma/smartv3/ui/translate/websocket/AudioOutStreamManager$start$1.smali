.class final Lcom/sma/smartv3/ui/translate/websocket/AudioOutStreamManager$start$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/translate/websocket/AudioOutStreamManager;->OXO1(Lcom/android/mltcode/paycertificationapi/i00OIXiO;)V
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
    c = "com.sma.smartv3.ui.translate.websocket.AudioOutStreamManager$start$1"
    f = "AudioOutStreamManager.kt"
    i = {}
    l = {
        0x16
    }
    m = "invokeSuspend"
    n = {}
    s = {}
    v = 0x1
.end annotation


# instance fields
.field label:I

.field final synthetic this$0:Lcom/sma/smartv3/ui/translate/websocket/AudioOutStreamManager;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/translate/websocket/AudioOutStreamManager;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/translate/websocket/AudioOutStreamManager;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/ui/translate/websocket/AudioOutStreamManager$start$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/websocket/AudioOutStreamManager$start$1;->this$0:Lcom/sma/smartv3/ui/translate/websocket/AudioOutStreamManager;

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

    new-instance p1, Lcom/sma/smartv3/ui/translate/websocket/AudioOutStreamManager$start$1;

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/websocket/AudioOutStreamManager$start$1;->this$0:Lcom/sma/smartv3/ui/translate/websocket/AudioOutStreamManager;

    invoke-direct {p1, v0, p2}, Lcom/sma/smartv3/ui/translate/websocket/AudioOutStreamManager$start$1;-><init>(Lcom/sma/smartv3/ui/translate/websocket/AudioOutStreamManager;Lkotlin/coroutines/Continuation;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/translate/websocket/AudioOutStreamManager$start$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/ui/translate/websocket/AudioOutStreamManager$start$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/translate/websocket/AudioOutStreamManager$start$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/translate/websocket/AudioOutStreamManager$start$1;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/sma/smartv3/ui/translate/websocket/AudioOutStreamManager$start$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-eq v1, v2, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/websocket/AudioOutStreamManager$start$1;->this$0:Lcom/sma/smartv3/ui/translate/websocket/AudioOutStreamManager;

    invoke-static {p1}, Lcom/sma/smartv3/ui/translate/websocket/AudioOutStreamManager;->iO(Lcom/sma/smartv3/ui/translate/websocket/AudioOutStreamManager;)Lcom/android/mltcode/paycertificationapi/bw6;

    move-result-object p1

    invoke-interface {p1}, Lcom/android/mltcode/paycertificationapi/bw6;->XIi00iiXO()Lcom/android/mltcode/paycertificationapi/l94;

    move-result-object p1

    new-instance v1, Lcom/sma/smartv3/ui/translate/websocket/AudioOutStreamManager$start$1$OXO1;

    iget-object v3, p0, Lcom/sma/smartv3/ui/translate/websocket/AudioOutStreamManager$start$1;->this$0:Lcom/sma/smartv3/ui/translate/websocket/AudioOutStreamManager;

    invoke-direct {v1, v3}, Lcom/sma/smartv3/ui/translate/websocket/AudioOutStreamManager$start$1$OXO1;-><init>(Lcom/sma/smartv3/ui/translate/websocket/AudioOutStreamManager;)V

    iput v2, p0, Lcom/sma/smartv3/ui/translate/websocket/AudioOutStreamManager$start$1;->label:I

    invoke-interface {p1, v1, p0}, Lcom/android/mltcode/paycertificationapi/l94;->collect(Lcom/android/mltcode/paycertificationapi/IXiXI;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method
