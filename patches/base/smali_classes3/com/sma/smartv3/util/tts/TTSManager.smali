.class public final Lcom/sma/smartv3/util/tts/TTSManager;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public OXO1:Lcom/android/mltcode/paycertificationapi/jl5;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public XIi00iiXO:Lcom/android/mltcode/paycertificationapi/X1XXX0I0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public final iO:Lcom/android/mltcode/paycertificationapi/i00OIXiO;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v0, v1, v0}, Lcom/android/mltcode/paycertificationapi/ng5;->iO(Lkotlinx/coroutines/XiOIO;ILjava/lang/Object;)Lkotlinx/coroutines/O00;

    move-result-object v0

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    invoke-static {v0}, Lkotlinx/coroutines/I0IIOi;->OXO1(Lkotlin/coroutines/CoroutineContext;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/util/tts/TTSManager;->iO:Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    return-void
.end method

.method public static final synthetic OXO1(Lcom/sma/smartv3/util/tts/TTSManager;)Lcom/android/mltcode/paycertificationapi/X1XXX0I0;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/util/tts/TTSManager;->XIi00iiXO:Lcom/android/mltcode/paycertificationapi/X1XXX0I0;

    return-object p0
.end method

.method public static final synthetic XIi00iiXO(Lcom/sma/smartv3/util/tts/TTSManager;)Lcom/android/mltcode/paycertificationapi/jl5;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/util/tts/TTSManager;->OXO1:Lcom/android/mltcode/paycertificationapi/jl5;

    return-object p0
.end method


# virtual methods
.method public final IiI10X(Lcom/android/mltcode/paycertificationapi/jl5;)Lcom/sma/smartv3/util/tts/TTSManager;
    .locals 1
    .param p1    # Lcom/android/mltcode/paycertificationapi/jl5;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "newStrategy"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/util/tts/TTSManager;->OXO1:Lcom/android/mltcode/paycertificationapi/jl5;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/android/mltcode/paycertificationapi/jl5;->cancel()V

    :cond_0
    iput-object p1, p0, Lcom/sma/smartv3/util/tts/TTSManager;->OXO1:Lcom/android/mltcode/paycertificationapi/jl5;

    return-object p0
.end method

.method public final O00(Lcom/android/mltcode/paycertificationapi/X1XXX0I0;)Lcom/sma/smartv3/util/tts/TTSManager;
    .locals 1
    .param p1    # Lcom/android/mltcode/paycertificationapi/X1XXX0I0;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "newStrategy"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/util/tts/TTSManager;->XIi00iiXO:Lcom/android/mltcode/paycertificationapi/X1XXX0I0;

    return-object p0
.end method

.method public final XO0O10(Lcom/sma/smartv3/util/tts/TTSData;)Lkotlinx/coroutines/XiOIO;
    .locals 7
    .param p1    # Lcom/sma/smartv3/util/tts/TTSData;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "ttsData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/sma/smartv3/util/tts/TTSManager;->iO:Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v2

    new-instance v4, Lcom/sma/smartv3/util/tts/TTSManager$execute$1;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Lcom/sma/smartv3/util/tts/TTSManager$execute$1;-><init>(Lcom/sma/smartv3/util/tts/TTSManager;Lcom/sma/smartv3/util/tts/TTSData;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    move-result-object p1

    return-object p1
.end method

.method public final iO()V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/util/tts/TTSManager;->OXO1:Lcom/android/mltcode/paycertificationapi/jl5;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/android/mltcode/paycertificationapi/jl5;->cancel()V

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/util/tts/TTSManager;->XIi00iiXO:Lcom/android/mltcode/paycertificationapi/X1XXX0I0;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/android/mltcode/paycertificationapi/X1XXX0I0;->stop()V

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/util/tts/TTSManager;->iO:Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, Lkotlinx/coroutines/I0IIOi;->IiI10X(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    return-void
.end method
