.class final Lcom/sma/smartv3/ui/translate/AudioInputService$start$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/translate/AudioInputService;->IiI10X(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lcom/android/mltcode/paycertificationapi/iXOIii;)V
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
    c = "com.sma.smartv3.ui.translate.AudioInputService$start$1"
    f = "AudioInputService.kt"
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
.field final synthetic $sink:Lcom/android/mltcode/paycertificationapi/iXOIii;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/sma/smartv3/ui/translate/AudioInputService;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/translate/AudioInputService;Lcom/android/mltcode/paycertificationapi/iXOIii;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/translate/AudioInputService;",
            "Lcom/android/mltcode/paycertificationapi/iXOIii;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/ui/translate/AudioInputService$start$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/AudioInputService$start$1;->this$0:Lcom/sma/smartv3/ui/translate/AudioInputService;

    iput-object p2, p0, Lcom/sma/smartv3/ui/translate/AudioInputService$start$1;->$sink:Lcom/android/mltcode/paycertificationapi/iXOIii;

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

    new-instance v0, Lcom/sma/smartv3/ui/translate/AudioInputService$start$1;

    iget-object v1, p0, Lcom/sma/smartv3/ui/translate/AudioInputService$start$1;->this$0:Lcom/sma/smartv3/ui/translate/AudioInputService;

    iget-object v2, p0, Lcom/sma/smartv3/ui/translate/AudioInputService$start$1;->$sink:Lcom/android/mltcode/paycertificationapi/iXOIii;

    invoke-direct {v0, v1, v2, p2}, Lcom/sma/smartv3/ui/translate/AudioInputService$start$1;-><init>(Lcom/sma/smartv3/ui/translate/AudioInputService;Lcom/android/mltcode/paycertificationapi/iXOIii;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/sma/smartv3/ui/translate/AudioInputService$start$1;->L$0:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/translate/AudioInputService$start$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/ui/translate/AudioInputService$start$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/translate/AudioInputService$start$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/translate/AudioInputService$start$1;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/AudioInputService$start$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v1

    iget v2, p0, Lcom/sma/smartv3/ui/translate/AudioInputService$start$1;->label:I

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

    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/AudioInputService$start$1;->this$0:Lcom/sma/smartv3/ui/translate/AudioInputService;

    invoke-static {p1}, Lcom/sma/smartv3/ui/translate/AudioInputService;->OXO1(Lcom/sma/smartv3/ui/translate/AudioInputService;)Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;->O00()Lcom/android/mltcode/paycertificationapi/ii0iIIX0;

    move-result-object p1

    new-instance v2, Lcom/sma/smartv3/ui/translate/AudioInputService$start$1$1;

    iget-object v4, p0, Lcom/sma/smartv3/ui/translate/AudioInputService$start$1;->$sink:Lcom/android/mltcode/paycertificationapi/iXOIii;

    iget-object v5, p0, Lcom/sma/smartv3/ui/translate/AudioInputService$start$1;->this$0:Lcom/sma/smartv3/ui/translate/AudioInputService;

    invoke-direct {v2, v4, v0, v5}, Lcom/sma/smartv3/ui/translate/AudioInputService$start$1$1;-><init>(Lcom/android/mltcode/paycertificationapi/iXOIii;Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lcom/sma/smartv3/ui/translate/AudioInputService;)V

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/translate/AudioInputService$start$1;->L$0:Ljava/lang/Object;

    iput v3, p0, Lcom/sma/smartv3/ui/translate/AudioInputService$start$1;->label:I

    invoke-interface {p1, v2, p0}, Lcom/android/mltcode/paycertificationapi/ii0iIIX0;->collect(Lcom/android/mltcode/paycertificationapi/IXiXI;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method
