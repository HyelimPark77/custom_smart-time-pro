.class final Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager$startRecord$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;->I0IIOi(Lcom/android/mltcode/paycertificationapi/i00OIXiO;)V
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
    c = "com.sma.smartv3.util.audio_recorder.AudioRecordManager$startRecord$2"
    f = "AudioRecordManager.kt"
    i = {
        0x0,
        0x0,
        0x0
    }
    l = {
        0x70
    }
    m = "invokeSuspend"
    n = {
        "$this$launch",
        "buffer",
        "read"
    }
    s = {
        "L$0",
        "L$1",
        "I$0"
    }
    v = 0x1
.end annotation


# instance fields
.field I$0:I

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager$startRecord$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager$startRecord$2;->this$0:Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;

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

    new-instance v0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager$startRecord$2;

    iget-object v1, p0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager$startRecord$2;->this$0:Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;

    invoke-direct {v0, v1, p2}, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager$startRecord$2;-><init>(Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager$startRecord$2;->L$0:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager$startRecord$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager$startRecord$2;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager$startRecord$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager$startRecord$2;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager$startRecord$2;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v1

    iget v2, p0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager$startRecord$2;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v2, p0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager$startRecord$2;->L$1:Ljava/lang/Object;

    check-cast v2, [B

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager$startRecord$2;->this$0:Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;

    invoke-static {p1}, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;->iO(Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;)I

    move-result p1

    new-array p1, p1, [B

    move-object v2, p1

    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager$startRecord$2;->this$0:Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;

    invoke-static {p1}, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;->XIi00iiXO(Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;)Landroid/media/AudioRecord;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Landroid/media/AudioRecord;->getRecordingState()I

    move-result p1

    const/4 v4, 0x3

    if-ne p1, v4, :cond_4

    invoke-static {v0}, Lkotlinx/coroutines/I0IIOi;->OIX0iXi(Lcom/android/mltcode/paycertificationapi/i00OIXiO;)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager$startRecord$2;->this$0:Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;

    invoke-static {p1}, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;->XIi00iiXO(Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;)Landroid/media/AudioRecord;

    move-result-object p1

    const/4 v4, 0x0

    if-eqz p1, :cond_3

    array-length v5, v2

    invoke-virtual {p1, v2, v4, v5}, Landroid/media/AudioRecord;->read([BII)I

    move-result v4

    :cond_3
    if-lez v4, :cond_2

    iget-object p1, p0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager$startRecord$2;->this$0:Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;

    invoke-static {p1}, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;->XO0O10(Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;)Lcom/android/mltcode/paycertificationapi/ty0;

    move-result-object p1

    invoke-interface {p1}, Lcom/android/mltcode/paycertificationapi/ty0;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager$startRecord$2;->this$0:Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;

    invoke-static {p1}, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;->OXO1(Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;)Lkotlinx/coroutines/channels/O00;

    move-result-object p1

    invoke-static {v2, v4}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v5

    const-string v6, "copyOf(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager$startRecord$2;->L$0:Ljava/lang/Object;

    iput-object v2, p0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager$startRecord$2;->L$1:Ljava/lang/Object;

    iput v4, p0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager$startRecord$2;->I$0:I

    iput v3, p0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager$startRecord$2;->label:I

    invoke-interface {p1, v5, p0}, Lkotlinx/coroutines/channels/I0iXXO;->iIXi1iiXI(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    :cond_4
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method
