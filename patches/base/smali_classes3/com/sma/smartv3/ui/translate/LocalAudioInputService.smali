.class public final Lcom/sma/smartv3/ui/translate/LocalAudioInputService;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/X0I1OO1;


# instance fields
.field public final OXO1:Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final XIi00iiXO:Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public XO0O10:Lkotlinx/coroutines/XiOIO;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public final iO:Lcom/android/mltcode/paycertificationapi/k85;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/k85<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const-string v0, "audioRecorder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/LocalAudioInputService;->OXO1:Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;

    .line 3
    iput-object p2, p0, Lcom/sma/smartv3/ui/translate/LocalAudioInputService;->XIi00iiXO:Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager;

    .line 4
    invoke-virtual {p1}, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;->IiI10X()Lcom/android/mltcode/paycertificationapi/k85;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/LocalAudioInputService;->iO:Lcom/android/mltcode/paycertificationapi/k85;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/ui/translate/LocalAudioInputService;-><init>(Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager;)V

    return-void
.end method

.method public static final synthetic OXO1(Lcom/sma/smartv3/ui/translate/LocalAudioInputService;)Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/translate/LocalAudioInputService;->OXO1:Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;

    return-object p0
.end method

.method public static final synthetic XOO0ii0(Lcom/sma/smartv3/ui/translate/LocalAudioInputService;)Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/translate/LocalAudioInputService;->XIi00iiXO:Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager;

    return-object p0
.end method


# virtual methods
.method public IiI10X(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lcom/android/mltcode/paycertificationapi/iXOIii;)V
    .locals 8
    .param p1    # Lcom/android/mltcode/paycertificationapi/i00OIXiO;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/android/mltcode/paycertificationapi/iXOIii;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/LocalAudioInputService;->XO0O10:Lkotlinx/coroutines/XiOIO;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/XiOIO$OXO1;->XIi00iiXO(Lkotlinx/coroutines/XiOIO;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/LocalAudioInputService;->XIi00iiXO:Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager;->XIi00iiXO(Lcom/android/mltcode/paycertificationapi/i00OIXiO;)V

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/LocalAudioInputService;->OXO1:Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;->XOO0ii0(Lcom/android/mltcode/paycertificationapi/i00OIXiO;)V

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v3

    new-instance v5, Lcom/sma/smartv3/ui/translate/LocalAudioInputService$start$1;

    invoke-direct {v5, p0, p2, v1}, Lcom/sma/smartv3/ui/translate/LocalAudioInputService$start$1;-><init>(Lcom/sma/smartv3/ui/translate/LocalAudioInputService;Lcom/android/mltcode/paycertificationapi/iXOIii;Lkotlin/coroutines/Continuation;)V

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v4, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v7}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/LocalAudioInputService;->XO0O10:Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method public XIi00iiXO(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/sma/smartv3/ui/translate/LocalAudioInputService$stop$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sma/smartv3/ui/translate/LocalAudioInputService$stop$1;

    iget v1, v0, Lcom/sma/smartv3/ui/translate/LocalAudioInputService$stop$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sma/smartv3/ui/translate/LocalAudioInputService$stop$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sma/smartv3/ui/translate/LocalAudioInputService$stop$1;

    invoke-direct {v0, p0, p1}, Lcom/sma/smartv3/ui/translate/LocalAudioInputService$stop$1;-><init>(Lcom/sma/smartv3/ui/translate/LocalAudioInputService;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/sma/smartv3/ui/translate/LocalAudioInputService$stop$1;->result:Ljava/lang/Object;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/sma/smartv3/ui/translate/LocalAudioInputService$stop$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/LocalAudioInputService;->OXO1:Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;

    iput v4, v0, Lcom/sma/smartv3/ui/translate/LocalAudioInputService$stop$1;->label:I

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;->OIi0(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/LocalAudioInputService;->XO0O10:Lkotlinx/coroutines/XiOIO;

    if-eqz p1, :cond_5

    iput v3, v0, Lcom/sma/smartv3/ui/translate/LocalAudioInputService$stop$1;->label:I

    invoke-static {p1, v0}, Lcom/android/mltcode/paycertificationapi/td;->I0iXXO(Lkotlinx/coroutines/XiOIO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    const/4 p1, 0x0

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/LocalAudioInputService;->XO0O10:Lkotlinx/coroutines/XiOIO;

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method

.method public XO0O10(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .param p1    # Lcom/android/mltcode/paycertificationapi/i00OIXiO;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/mltcode/paycertificationapi/i00OIXiO;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/sma/smartv3/ui/translate/LocalAudioInputService$flushLocalAudioAndGetPath$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sma/smartv3/ui/translate/LocalAudioInputService$flushLocalAudioAndGetPath$1;

    iget v1, v0, Lcom/sma/smartv3/ui/translate/LocalAudioInputService$flushLocalAudioAndGetPath$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sma/smartv3/ui/translate/LocalAudioInputService$flushLocalAudioAndGetPath$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sma/smartv3/ui/translate/LocalAudioInputService$flushLocalAudioAndGetPath$1;

    invoke-direct {v0, p0, p2}, Lcom/sma/smartv3/ui/translate/LocalAudioInputService$flushLocalAudioAndGetPath$1;-><init>(Lcom/sma/smartv3/ui/translate/LocalAudioInputService;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/sma/smartv3/ui/translate/LocalAudioInputService$flushLocalAudioAndGetPath$1;->result:Ljava/lang/Object;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/sma/smartv3/ui/translate/LocalAudioInputService$flushLocalAudioAndGetPath$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/sma/smartv3/ui/translate/LocalAudioInputService$flushLocalAudioAndGetPath$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    invoke-static {p2}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/translate/LocalAudioInputService;->XIi00iiXO:Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager;

    if-eqz p2, :cond_3

    iput-object p1, v0, Lcom/sma/smartv3/ui/translate/LocalAudioInputService$flushLocalAudioAndGetPath$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/sma/smartv3/ui/translate/LocalAudioInputService$flushLocalAudioAndGetPath$1;->label:I

    invoke-virtual {p2, v0}, Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager;->O00(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    move-object v0, p1

    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/LocalAudioInputService;->XIi00iiXO:Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager;

    const/4 p2, 0x0

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager;->iO()Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_4
    move-object p1, p2

    :goto_2
    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v1

    new-instance v3, Lcom/sma/smartv3/ui/translate/LocalAudioInputService$flushLocalAudioAndGetPath$2;

    invoke-direct {v3, p0, v0, p2}, Lcom/sma/smartv3/ui/translate/LocalAudioInputService$flushLocalAudioAndGetPath$2;-><init>(Lcom/sma/smartv3/ui/translate/LocalAudioInputService;Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    return-object p1
.end method

.method public clear()V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/LocalAudioInputService;->XO0O10:Lkotlinx/coroutines/XiOIO;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/XiOIO$OXO1;->XIi00iiXO(Lkotlinx/coroutines/XiOIO;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_0
    iput-object v1, p0, Lcom/sma/smartv3/ui/translate/LocalAudioInputService;->XO0O10:Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method public iO()Lcom/android/mltcode/paycertificationapi/k85;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/android/mltcode/paycertificationapi/k85<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/LocalAudioInputService;->iO:Lcom/android/mltcode/paycertificationapi/k85;

    return-object v0
.end method
