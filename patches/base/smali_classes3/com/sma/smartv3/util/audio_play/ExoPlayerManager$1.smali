.class final Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;-><init>(Landroid/content/Context;Lcom/android/mltcode/paycertificationapi/i00OIXiO;)V
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
    c = "com.sma.smartv3.util.audio_play.ExoPlayerManager$1"
    f = "ExoPlayerManager.kt"
    i = {
        0x0,
        0x1,
        0x1,
        0x2,
        0x2
    }
    l = {
        0x25,
        0x26,
        0x28
    }
    m = "invokeSuspend"
    n = {
        "$this$launch",
        "$this$launch",
        "audioPath",
        "$this$launch",
        "audioPath"
    }
    s = {
        "L$0",
        "L$0",
        "L$2",
        "L$0",
        "L$2"
    }
    v = 0x1
.end annotation


# instance fields
.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$1;->this$0:Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;

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

    new-instance v0, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$1;

    iget-object v1, p0, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$1;->this$0:Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;

    invoke-direct {v0, v1, p2}, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$1;-><init>(Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$1;->L$0:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$1;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget-object v0, p0, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$1;->L$0:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v0

    iget v2, p0, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$1;->label:I

    const/4 v7, 0x0

    const/4 v8, 0x3

    const/4 v9, 0x2

    const/4 v10, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v10, :cond_2

    if-eq v2, v9, :cond_1

    if-ne v2, v8, :cond_0

    iget-object v2, p0, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$1;->L$2:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v2, p0, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lkotlinx/coroutines/channels/ChannelIterator;

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    move-object p1, v2

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v2, p0, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$1;->L$2:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v3, p0, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$1;->L$1:Ljava/lang/Object;

    check-cast v3, Lkotlinx/coroutines/channels/ChannelIterator;

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    iget-object v2, p0, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lkotlinx/coroutines/channels/ChannelIterator;

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    move-object v3, v2

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$1;->this$0:Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;

    invoke-virtual {p1}, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;->XO0O10()Lkotlinx/coroutines/channels/O00;

    move-result-object p1

    invoke-interface {p1}, Lkotlinx/coroutines/channels/ReceiveChannel;->iterator()Lkotlinx/coroutines/channels/ChannelIterator;

    move-result-object p1

    :cond_4
    :goto_0
    iput-object v1, p0, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$1;->L$0:Ljava/lang/Object;

    iput-object p1, p0, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$1;->L$1:Ljava/lang/Object;

    iput-object v7, p0, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$1;->L$2:Ljava/lang/Object;

    iput v10, p0, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$1;->label:I

    invoke-interface {p1, p0}, Lkotlinx/coroutines/channels/ChannelIterator;->XIi00iiXO(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_5

    goto :goto_3

    :cond_5
    move-object v3, p1

    move-object p1, v2

    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-interface {v3}, Lkotlinx/coroutines/channels/ChannelIterator;->next()Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Ljava/lang/String;

    iget-object p1, p0, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$1;->this$0:Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;

    invoke-static {p1}, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;->O00(Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;)Lkotlinx/coroutines/XiOIO;

    move-result-object p1

    if-eqz p1, :cond_6

    iput-object v1, p0, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$1;->L$0:Ljava/lang/Object;

    iput-object v3, p0, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$1;->L$1:Ljava/lang/Object;

    iput-object v2, p0, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$1;->L$2:Ljava/lang/Object;

    iput v9, p0, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$1;->label:I

    invoke-static {p1, p0}, Lcom/android/mltcode/paycertificationapi/td;->I0iXXO(Lkotlinx/coroutines/XiOIO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    goto :goto_3

    :cond_6
    :goto_2
    move-object v11, v2

    move-object p1, v3

    iget-object v12, p0, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$1;->this$0:Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;

    new-instance v4, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$1$1;

    invoke-direct {v4, v12, v11, v7}, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$1$1;-><init>(Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    move-result-object v2

    invoke-static {v12, v2}, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;->XOO0ii0(Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;Lkotlinx/coroutines/XiOIO;)V

    iget-object v2, p0, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$1;->this$0:Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;

    invoke-static {v2}, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;->O00(Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;)Lkotlinx/coroutines/XiOIO;

    move-result-object v2

    if-eqz v2, :cond_4

    iput-object v1, p0, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$1;->L$0:Ljava/lang/Object;

    iput-object p1, p0, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$1;->L$1:Ljava/lang/Object;

    invoke-static {v11}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, p0, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$1;->L$2:Ljava/lang/Object;

    iput v8, p0, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$1;->label:I

    invoke-interface {v2, p0}, Lkotlinx/coroutines/XiOIO;->XXIIO1i11(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_4

    :goto_3
    return-object v0

    :cond_7
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method
