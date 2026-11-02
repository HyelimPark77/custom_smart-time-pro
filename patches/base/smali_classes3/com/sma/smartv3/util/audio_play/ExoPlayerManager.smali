.class public final Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/X1XXX0I0;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nExoPlayerManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExoPlayerManager.kt\ncom/sma/smartv3/util/audio_play/ExoPlayerManager\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,123:1\n310#2,11:124\n*S KotlinDebug\n*F\n+ 1 ExoPlayerManager.kt\ncom/sma/smartv3/util/audio_play/ExoPlayerManager\n*L\n45#1:124,11\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nExoPlayerManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExoPlayerManager.kt\ncom/sma/smartv3/util/audio_play/ExoPlayerManager\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,123:1\n310#2,11:124\n*S KotlinDebug\n*F\n+ 1 ExoPlayerManager.kt\ncom/sma/smartv3/util/audio_play/ExoPlayerManager\n*L\n45#1:124,11\n*E\n"
    }
.end annotation


# instance fields
.field public IiI10X:Z

.field public O00:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public final OXO1:Lcom/android/mltcode/paycertificationapi/i00OIXiO;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final XIi00iiXO:Landroidx/media3/exoplayer/ExoPlayer;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public XO0O10:Lkotlinx/coroutines/XiOIO;
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
.method public constructor <init>(Landroid/content/Context;Lcom/android/mltcode/paycertificationapi/i00OIXiO;)V
    .locals 8
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/android/mltcode/paycertificationapi/i00OIXiO;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;->OXO1:Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    .line 3
    new-instance v0, Landroidx/media3/exoplayer/ExoPlayer$Builder;

    invoke-direct {v0, p1}, Landroidx/media3/exoplayer/ExoPlayer$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Landroidx/media3/exoplayer/ExoPlayer$Builder;->build()Landroidx/media3/exoplayer/ExoPlayer;

    move-result-object p1

    const-string v0, "build(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;->XIi00iiXO:Landroidx/media3/exoplayer/ExoPlayer;

    const/4 p1, 0x6

    const v0, 0x7fffffff

    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1, v1, p1, v1}, Lkotlinx/coroutines/channels/IiI10X;->XO0O10(ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lkotlinx/coroutines/channels/O00;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;->iO:Lkotlinx/coroutines/channels/O00;

    .line 5
    new-instance v5, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$1;

    invoke-direct {v5, p0, v1}, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$1;-><init>(Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;Lkotlin/coroutines/Continuation;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, p2

    invoke-static/range {v2 .. v7}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lcom/android/mltcode/paycertificationapi/i00OIXiO;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 6
    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->O00()Lcom/android/mltcode/paycertificationapi/g10;

    move-result-object p2

    invoke-static {p2}, Lkotlinx/coroutines/I0IIOi;->OXO1(Lkotlin/coroutines/CoroutineContext;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object p2

    .line 7
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;-><init>(Landroid/content/Context;Lcom/android/mltcode/paycertificationapi/i00OIXiO;)V

    return-void
.end method

.method public static final synthetic I0IIOi(Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;->O00:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic IiI10X(Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;->IiI10X:Z

    return p0
.end method

.method public static final synthetic O00(Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;)Lkotlinx/coroutines/XiOIO;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;->XO0O10:Lkotlinx/coroutines/XiOIO;

    return-object p0
.end method

.method public static final synthetic XOO0ii0(Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;Lkotlinx/coroutines/XiOIO;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;->XO0O10:Lkotlinx/coroutines/XiOIO;

    return-void
.end method


# virtual methods
.method public final I0iXXO()V
    .locals 0

    return-void
.end method

.method public final IO()V
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;->IiI10X:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;->IiI10X:Z

    iget-object v0, p0, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;->XIi00iiXO:Landroidx/media3/exoplayer/ExoPlayer;

    invoke-interface {v0}, Landroidx/media3/exoplayer/ExoPlayer;->release()V

    :cond_0
    return-void
.end method

.method public final OIX0iXi()V
    .locals 0

    return-void
.end method

.method public final OIi0()Landroidx/media3/exoplayer/ExoPlayer;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;->XIi00iiXO:Landroidx/media3/exoplayer/ExoPlayer;

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

    iget-object v1, p0, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;->OXO1:Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    new-instance v4, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$forcePlay$1;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$forcePlay$1;-><init>(Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method public XIi00iiXO(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
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

    new-instance v0, Lkotlinx/coroutines/XIi00iiXO;

    invoke-static {p2}, Lkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt;->O00(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lkotlinx/coroutines/XIi00iiXO;-><init>(Lkotlin/coroutines/Continuation;I)V

    invoke-virtual {v0}, Lkotlinx/coroutines/XIi00iiXO;->XXX11i()V

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_0

    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    sget-object v2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-virtual {v1}, Ljava/io/File;->length()J

    move-result-wide v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "PlayAsync:fileLength:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, " path:"

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;->I0IIOi(Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;->OIi0()Landroidx/media3/exoplayer/ExoPlayer;

    move-result-object p1

    invoke-interface {p1}, Landroidx/media3/common/Player;->stop()V

    invoke-static {v1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object p1

    invoke-static {p1}, Landroidx/media3/common/MediaItem;->fromUri(Landroid/net/Uri;)Landroidx/media3/common/MediaItem;

    move-result-object p1

    const-string v1, "fromUri(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;->OIi0()Landroidx/media3/exoplayer/ExoPlayer;

    move-result-object v1

    invoke-interface {v1, p1}, Landroidx/media3/common/Player;->setMediaItem(Landroidx/media3/common/MediaItem;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;->OIi0()Landroidx/media3/exoplayer/ExoPlayer;

    move-result-object p1

    invoke-interface {p1}, Landroidx/media3/common/Player;->prepare()V

    invoke-virtual {p0}, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;->OIi0()Landroidx/media3/exoplayer/ExoPlayer;

    move-result-object p1

    invoke-interface {p1}, Landroidx/media3/common/Player;->play()V

    new-instance p1, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$playAsync$2$listener$1;

    invoke-direct {p1, p0, v0}, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$playAsync$2$listener$1;-><init>(Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;Lcom/android/mltcode/paycertificationapi/IO0i;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;->OIi0()Landroidx/media3/exoplayer/ExoPlayer;

    move-result-object v1

    invoke-interface {v1, p1}, Landroidx/media3/common/Player;->addListener(Landroidx/media3/common/Player$Listener;)V

    new-instance v1, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$OXO1;

    invoke-direct {v1, p0, p1}, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$OXO1;-><init>(Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$playAsync$2$listener$1;)V

    invoke-interface {v0, v1}, Lcom/android/mltcode/paycertificationapi/IO0i;->iX(Lkotlin/jvm/functions/Function1;)V

    :goto_0
    invoke-virtual {v0}, Lkotlinx/coroutines/XIi00iiXO;->OII()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_1

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->iO(Lkotlin/coroutines/Continuation;)V

    :cond_1
    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_2

    return-object p1

    :cond_2
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

    iget-object v0, p0, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;->iO:Lkotlinx/coroutines/channels/O00;

    return-object v0
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
    iget-object v1, p0, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;->OXO1:Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    new-instance v4, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$enqueue$1;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$enqueue$1;-><init>(Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

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
    .locals 6

    iget-object v0, p0, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;->OXO1:Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    new-instance v3, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$stop$1;

    const/4 v1, 0x0

    invoke-direct {v3, p0, v1}, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$stop$1;-><init>(Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    return-void
.end method
