.class public final Lcom/sma/smartv3/util/audio_play/MediaPlayManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/X1XXX0I0;


# instance fields
.field public final IiI10X:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public O00:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public final OXO1:Lcom/android/mltcode/paycertificationapi/i00OIXiO;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public XIi00iiXO:Ljava/util/concurrent/atomic/AtomicBoolean;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public XO0O10:Landroid/media/MediaPlayer;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public final iO:Lkotlinx/coroutines/channels/O00;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/channels/O00<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lcom/sma/smartv3/util/audio_play/MediaPlayManager;-><init>(Lcom/android/mltcode/paycertificationapi/i00OIXiO;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/android/mltcode/paycertificationapi/i00OIXiO;)V
    .locals 9
    .param p1    # Lcom/android/mltcode/paycertificationapi/i00OIXiO;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/sma/smartv3/util/audio_play/MediaPlayManager;->OXO1:Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/sma/smartv3/util/audio_play/MediaPlayManager;->XIi00iiXO:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x6

    const v1, 0x7fffffff

    const/4 v2, 0x0

    .line 5
    invoke-static {v1, v2, v2, v0, v2}, Lkotlinx/coroutines/channels/IiI10X;->XO0O10(ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lkotlinx/coroutines/channels/O00;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/util/audio_play/MediaPlayManager;->iO:Lkotlinx/coroutines/channels/O00;

    .line 6
    const-string v0, "MediaPlayManager"

    iput-object v0, p0, Lcom/sma/smartv3/util/audio_play/MediaPlayManager;->IiI10X:Ljava/lang/String;

    .line 7
    new-instance v6, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$1;

    invoke-direct {v6, p0, v2}, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$1;-><init>(Lcom/sma/smartv3/util/audio_play/MediaPlayManager;Lkotlin/coroutines/Continuation;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v3, p1

    invoke-static/range {v3 .. v8}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/android/mltcode/paycertificationapi/i00OIXiO;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 8
    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->O00()Lcom/android/mltcode/paycertificationapi/g10;

    move-result-object p1

    invoke-static {p1}, Lkotlinx/coroutines/I0IIOi;->OXO1(Lkotlin/coroutines/CoroutineContext;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object p1

    .line 9
    :cond_0
    invoke-direct {p0, p1}, Lcom/sma/smartv3/util/audio_play/MediaPlayManager;-><init>(Lcom/android/mltcode/paycertificationapi/i00OIXiO;)V

    return-void
.end method

.method public static final synthetic I0IIOi(Lcom/sma/smartv3/util/audio_play/MediaPlayManager;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/util/audio_play/MediaPlayManager;->OXO1:Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    return-object p0
.end method

.method public static final synthetic I0iXXO(Lcom/sma/smartv3/util/audio_play/MediaPlayManager;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/util/audio_play/MediaPlayManager;->I1XOi1()V

    return-void
.end method

.method public static final synthetic IO(Lcom/sma/smartv3/util/audio_play/MediaPlayManager;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/util/audio_play/MediaPlayManager;->O00:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic IiI10X(Lcom/sma/smartv3/util/audio_play/MediaPlayManager;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/util/audio_play/MediaPlayManager;->XIi00iiXO:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method public static final synthetic O00(Lcom/sma/smartv3/util/audio_play/MediaPlayManager;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/util/audio_play/MediaPlayManager;->XXI()V

    return-void
.end method

.method public static final synthetic OIX0iXi(Lcom/sma/smartv3/util/audio_play/MediaPlayManager;Landroid/media/MediaPlayer;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/util/audio_play/MediaPlayManager;->XO0O10:Landroid/media/MediaPlayer;

    return-void
.end method

.method public static final synthetic OIi0(Lcom/sma/smartv3/util/audio_play/MediaPlayManager;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/util/audio_play/MediaPlayManager;->IiI10X:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic XOO0ii0(Lcom/sma/smartv3/util/audio_play/MediaPlayManager;)Landroid/media/MediaPlayer;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/util/audio_play/MediaPlayManager;->XO0O10:Landroid/media/MediaPlayer;

    return-object p0
.end method


# virtual methods
.method public final I1XOi1()V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/sma/smartv3/util/audio_play/MediaPlayManager;->XO0O10:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/util/audio_play/MediaPlayManager;->XO0O10:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/sma/smartv3/util/audio_play/MediaPlayManager;->XO0O10:Landroid/media/MediaPlayer;

    return-void
.end method

.method public final O10IXXX0X()Lkotlin/Unit;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/util/audio_play/MediaPlayManager;->XO0O10:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/media/MediaPlayer;->setVolume(FF)V

    sget-object v0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public OXO1(Ljava/lang/String;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/sma/smartv3/util/audio_play/MediaPlayManager;->OXO1:Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    new-instance v4, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$forcePlay$1;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$forcePlay$1;-><init>(Lcom/sma/smartv3/util/audio_play/MediaPlayManager;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method public final X0O()Lkotlin/Unit;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/util/audio_play/MediaPlayManager;->XO0O10:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1, v2}, Landroid/media/MediaPlayer;->setVolume(FF)V

    sget-object v0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final X1ii()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/util/audio_play/MediaPlayManager;->XIi00iiXO:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method

.method public XIi00iiXO(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .param p1    # Ljava/lang/String;
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
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->O00()Lcom/android/mltcode/paycertificationapi/g10;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2;-><init>(Lcom/sma/smartv3/util/audio_play/MediaPlayManager;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    invoke-static {v0, v1, p2}, Lcom/android/mltcode/paycertificationapi/I100X1;->I0IIOi(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method

.method public XO0O10()Lkotlinx/coroutines/channels/O00;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/channels/O00<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/util/audio_play/MediaPlayManager;->iO:Lkotlinx/coroutines/channels/O00;

    return-object v0
.end method

.method public final XXI()V
    .locals 1

    :goto_0
    invoke-virtual {p0}, Lcom/sma/smartv3/util/audio_play/MediaPlayManager;->XO0O10()Lkotlinx/coroutines/channels/O00;

    move-result-object v0

    invoke-interface {v0}, Lkotlinx/coroutines/channels/ReceiveChannel;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/util/audio_play/MediaPlayManager;->XO0O10()Lkotlinx/coroutines/channels/O00;

    move-result-object v0

    invoke-interface {v0}, Lkotlinx/coroutines/channels/ReceiveChannel;->XiOIO()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlinx/coroutines/channels/XOO0ii0;->I0IIOi(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public iO(Ljava/lang/String;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/sma/smartv3/util/audio_play/MediaPlayManager;->OXO1:Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    new-instance v4, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$enqueue$1;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$enqueue$1;-><init>(Lcom/sma/smartv3/util/audio_play/MediaPlayManager;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    :cond_1
    :goto_0
    return-void
.end method

.method public stop()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/util/audio_play/MediaPlayManager;->XIi00iiXO:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/util/audio_play/MediaPlayManager;->I1XOi1()V

    invoke-virtual {p0}, Lcom/sma/smartv3/util/audio_play/MediaPlayManager;->XXI()V

    return-void
.end method
