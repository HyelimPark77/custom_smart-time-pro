.class final Lcom/sma/smartv3/util/tts/TTSManager$execute$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/util/tts/TTSManager;->XO0O10(Lcom/sma/smartv3/util/tts/TTSData;)Lkotlinx/coroutines/XiOIO;
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
    c = "com.sma.smartv3.util.tts.TTSManager$execute$1"
    f = "TTSManager.kt"
    i = {
        0x0
    }
    l = {
        0x1c
    }
    m = "invokeSuspend"
    n = {
        "$this$launch"
    }
    s = {
        "L$0"
    }
    v = 0x1
.end annotation


# instance fields
.field final synthetic $ttsData:Lcom/sma/smartv3/util/tts/TTSData;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/sma/smartv3/util/tts/TTSManager;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/util/tts/TTSManager;Lcom/sma/smartv3/util/tts/TTSData;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/util/tts/TTSManager;",
            "Lcom/sma/smartv3/util/tts/TTSData;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/util/tts/TTSManager$execute$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/util/tts/TTSManager$execute$1;->this$0:Lcom/sma/smartv3/util/tts/TTSManager;

    iput-object p2, p0, Lcom/sma/smartv3/util/tts/TTSManager$execute$1;->$ttsData:Lcom/sma/smartv3/util/tts/TTSData;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
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

    new-instance v0, Lcom/sma/smartv3/util/tts/TTSManager$execute$1;

    iget-object v1, p0, Lcom/sma/smartv3/util/tts/TTSManager$execute$1;->this$0:Lcom/sma/smartv3/util/tts/TTSManager;

    iget-object v2, p0, Lcom/sma/smartv3/util/tts/TTSManager$execute$1;->$ttsData:Lcom/sma/smartv3/util/tts/TTSData;

    invoke-direct {v0, v1, v2, p2}, Lcom/sma/smartv3/util/tts/TTSManager$execute$1;-><init>(Lcom/sma/smartv3/util/tts/TTSManager;Lcom/sma/smartv3/util/tts/TTSData;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/sma/smartv3/util/tts/TTSManager$execute$1;->L$0:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/util/tts/TTSManager$execute$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/util/tts/TTSManager$execute$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/util/tts/TTSManager$execute$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/util/tts/TTSManager$execute$1;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lcom/sma/smartv3/util/tts/TTSManager$execute$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v1

    iget v2, p0, Lcom/sma/smartv3/util/tts/TTSManager$execute$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/util/tts/TTSManager$execute$1;->this$0:Lcom/sma/smartv3/util/tts/TTSManager;

    invoke-static {p1}, Lcom/sma/smartv3/util/tts/TTSManager;->XIi00iiXO(Lcom/sma/smartv3/util/tts/TTSManager;)Lcom/android/mltcode/paycertificationapi/jl5;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object v2, p0, Lcom/sma/smartv3/util/tts/TTSManager$execute$1;->$ttsData:Lcom/sma/smartv3/util/tts/TTSData;

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, p0, Lcom/sma/smartv3/util/tts/TTSManager$execute$1;->L$0:Ljava/lang/Object;

    iput v3, p0, Lcom/sma/smartv3/util/tts/TTSManager$execute$1;->label:I

    invoke-interface {p1, v2, v0, p0}, Lcom/android/mltcode/paycertificationapi/jl5;->OXO1(Lcom/sma/smartv3/util/tts/TTSData;Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    check-cast p1, Ljava/lang/String;

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    :goto_1
    iget-object v0, p0, Lcom/sma/smartv3/util/tts/TTSManager$execute$1;->this$0:Lcom/sma/smartv3/util/tts/TTSManager;

    invoke-static {v0}, Lcom/sma/smartv3/util/tts/TTSManager;->OXO1(Lcom/sma/smartv3/util/tts/TTSManager;)Lcom/android/mltcode/paycertificationapi/X1XXX0I0;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-interface {v0, p1}, Lcom/android/mltcode/paycertificationapi/X1XXX0I0;->iO(Ljava/lang/String;)V

    :cond_4
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method
