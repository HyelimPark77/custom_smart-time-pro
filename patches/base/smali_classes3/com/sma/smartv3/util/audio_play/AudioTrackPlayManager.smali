.class public final Lcom/sma/smartv3/util/audio_play/AudioTrackPlayManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/X1XXX0I0;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAudioTrackPlayManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AudioTrackPlayManager.kt\ncom/sma/smartv3/util/audio_play/AudioTrackPlayManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n1#2:125\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAudioTrackPlayManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AudioTrackPlayManager.kt\ncom/sma/smartv3/util/audio_play/AudioTrackPlayManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n1#2:125\n*E\n"
    }
.end annotation


# instance fields
.field public IiI10X:Landroid/media/AudioTrack;
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

.field public final XIi00iiXO:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public XO0O10:Lkotlinx/coroutines/XiOIO;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public XOO0ii0:J

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

    invoke-direct {p0, v0, v1, v0}, Lcom/sma/smartv3/util/audio_play/AudioTrackPlayManager;-><init>(Lcom/android/mltcode/paycertificationapi/i00OIXiO;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/android/mltcode/paycertificationapi/i00OIXiO;)V
    .locals 10
    .param p1    # Lcom/android/mltcode/paycertificationapi/i00OIXiO;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/sma/smartv3/util/audio_play/AudioTrackPlayManager;->OXO1:Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    .line 4
    const-string v0, "AudioTrackPlayManager"

    iput-object v0, p0, Lcom/sma/smartv3/util/audio_play/AudioTrackPlayManager;->XIi00iiXO:Ljava/lang/String;

    const/4 v0, 0x6

    const v1, 0x7fffffff

    const/4 v2, 0x0

    .line 5
    invoke-static {v1, v2, v2, v0, v2}, Lkotlinx/coroutines/channels/IiI10X;->XO0O10(ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lkotlinx/coroutines/channels/O00;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/util/audio_play/AudioTrackPlayManager;->iO:Lkotlinx/coroutines/channels/O00;

    .line 6
    new-instance v3, Landroid/media/AudioTrack;

    const/4 v0, 0x4

    const/4 v1, 0x2

    const/16 v4, 0x3e80

    .line 7
    invoke-static {v4, v0, v1}, Landroid/media/AudioTrack;->getMinBufferSize(III)I

    move-result v8

    const/4 v9, 0x1

    const/4 v4, 0x3

    const/16 v5, 0x3e80

    const/4 v6, 0x4

    const/4 v7, 0x2

    .line 8
    invoke-direct/range {v3 .. v9}, Landroid/media/AudioTrack;-><init>(IIIIII)V

    iput-object v3, p0, Lcom/sma/smartv3/util/audio_play/AudioTrackPlayManager;->IiI10X:Landroid/media/AudioTrack;

    .line 9
    new-instance v7, Lcom/sma/smartv3/util/audio_play/AudioTrackPlayManager$1;

    invoke-direct {v7, p0, v2}, Lcom/sma/smartv3/util/audio_play/AudioTrackPlayManager$1;-><init>(Lcom/sma/smartv3/util/audio_play/AudioTrackPlayManager;Lkotlin/coroutines/Continuation;)V

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v4, p1

    invoke-static/range {v4 .. v9}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/android/mltcode/paycertificationapi/i00OIXiO;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 10
    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->O00()Lcom/android/mltcode/paycertificationapi/g10;

    move-result-object p1

    invoke-static {p1}, Lkotlinx/coroutines/I0IIOi;->OXO1(Lkotlin/coroutines/CoroutineContext;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object p1

    .line 11
    :cond_0
    invoke-direct {p0, p1}, Lcom/sma/smartv3/util/audio_play/AudioTrackPlayManager;-><init>(Lcom/android/mltcode/paycertificationapi/i00OIXiO;)V

    return-void
.end method

.method public static final synthetic I0IIOi(Lcom/sma/smartv3/util/audio_play/AudioTrackPlayManager;Lkotlinx/coroutines/XiOIO;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/util/audio_play/AudioTrackPlayManager;->XO0O10:Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method public static final synthetic IiI10X(Lcom/sma/smartv3/util/audio_play/AudioTrackPlayManager;)Lkotlinx/coroutines/XiOIO;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/util/audio_play/AudioTrackPlayManager;->XO0O10:Lkotlinx/coroutines/XiOIO;

    return-object p0
.end method

.method public static final synthetic O00(Lcom/sma/smartv3/util/audio_play/AudioTrackPlayManager;)Landroid/media/AudioTrack;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/util/audio_play/AudioTrackPlayManager;->IiI10X:Landroid/media/AudioTrack;

    return-object p0
.end method

.method public static final synthetic OIi0(Lcom/sma/smartv3/util/audio_play/AudioTrackPlayManager;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/util/audio_play/AudioTrackPlayManager;->O00:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic XOO0ii0(Lcom/sma/smartv3/util/audio_play/AudioTrackPlayManager;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/util/audio_play/AudioTrackPlayManager;->XIi00iiXO:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final I0iXXO(F)V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/util/audio_play/AudioTrackPlayManager;->IiI10X:Landroid/media/AudioTrack;

    invoke-virtual {v0, p1}, Landroid/media/AudioTrack;->setVolume(F)I

    return-void
.end method

.method public final IO(Ljava/lang/String;)V
    .locals 5
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/util/audio_play/AudioTrackPlayManager;->IiI10X:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getChannelConfiguration()I

    move-result v0

    const/16 v1, 0xc

    if-ne v0, v1, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->length()J

    move-result-wide v1

    int-to-long v3, v0

    div-long/2addr v1, v3

    iput-wide v1, p0, Lcom/sma/smartv3/util/audio_play/AudioTrackPlayManager;->XOO0ii0:J

    return-void
.end method

.method public final OIX0iXi()V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/util/audio_play/AudioTrackPlayManager;->IiI10X:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->release()V

    return-void
.end method

.method public OXO1(Ljava/lang/String;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/sma/smartv3/util/audio_play/AudioTrackPlayManager;->OXO1:Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    new-instance v4, Lcom/sma/smartv3/util/audio_play/AudioTrackPlayManager$forcePlay$1;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Lcom/sma/smartv3/util/audio_play/AudioTrackPlayManager$forcePlay$1;-><init>(Lcom/sma/smartv3/util/audio_play/AudioTrackPlayManager;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method public XIi00iiXO(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
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

    new-instance p2, Ljava/io/File;

    invoke-direct {p2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1

    :cond_0
    iput-object p1, p0, Lcom/sma/smartv3/util/audio_play/AudioTrackPlayManager;->O00:Ljava/lang/String;

    const/high16 p1, 0x3f800000    # 1.0f

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/util/audio_play/AudioTrackPlayManager;->I0iXXO(F)V

    iget-object p1, p0, Lcom/sma/smartv3/util/audio_play/AudioTrackPlayManager;->IiI10X:Landroid/media/AudioTrack;

    invoke-virtual {p1}, Landroid/media/AudioTrack;->play()V

    new-instance p1, Ljava/io/FileInputStream;

    invoke-direct {p1, p2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/16 p2, 0x800

    :try_start_1
    new-array p2, p2, [B

    :goto_0
    invoke-virtual {p1, p2}, Ljava/io/FileInputStream;->read([B)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    sget-object v2, Lkotlinx/coroutines/XX0;->IO:Lkotlinx/coroutines/XX0;

    invoke-virtual {v2}, Lkotlinx/coroutines/XX0;->isActive()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/sma/smartv3/util/audio_play/AudioTrackPlayManager;->IiI10X:Landroid/media/AudioTrack;

    const/4 v3, 0x0

    invoke-virtual {v2, p2, v3, v1}, Landroid/media/AudioTrack;->write([BII)I

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_2

    :cond_1
    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-static {p1, v0}, Lkotlin/io/CloseableKt;->OXO1(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    iget-object p1, p0, Lcom/sma/smartv3/util/audio_play/AudioTrackPlayManager;->IiI10X:Landroid/media/AudioTrack;

    invoke-virtual {p1}, Landroid/media/AudioTrack;->stop()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_1
    iput-object v0, p0, Lcom/sma/smartv3/util/audio_play/AudioTrackPlayManager;->O00:Ljava/lang/String;

    goto :goto_4

    :catchall_1
    move-exception p1

    goto :goto_5

    :catch_0
    move-exception p1

    goto :goto_3

    :goto_2
    :try_start_3
    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_2
    move-exception v1

    :try_start_4
    invoke-static {p1, p2}, Lkotlin/io/CloseableKt;->OXO1(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_3
    :try_start_5
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_1

    :goto_4
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1

    :goto_5
    iput-object v0, p0, Lcom/sma/smartv3/util/audio_play/AudioTrackPlayManager;->O00:Ljava/lang/String;

    throw p1
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

    iget-object v0, p0, Lcom/sma/smartv3/util/audio_play/AudioTrackPlayManager;->iO:Lkotlinx/coroutines/channels/O00;

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
    iget-object v1, p0, Lcom/sma/smartv3/util/audio_play/AudioTrackPlayManager;->OXO1:Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    new-instance v4, Lcom/sma/smartv3/util/audio_play/AudioTrackPlayManager$enqueue$1;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Lcom/sma/smartv3/util/audio_play/AudioTrackPlayManager$enqueue$1;-><init>(Lcom/sma/smartv3/util/audio_play/AudioTrackPlayManager;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

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

    iget-object v0, p0, Lcom/sma/smartv3/util/audio_play/AudioTrackPlayManager;->OXO1:Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    new-instance v3, Lcom/sma/smartv3/util/audio_play/AudioTrackPlayManager$stop$1;

    const/4 v1, 0x0

    invoke-direct {v3, p0, v1}, Lcom/sma/smartv3/util/audio_play/AudioTrackPlayManager$stop$1;-><init>(Lcom/sma/smartv3/util/audio_play/AudioTrackPlayManager;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    return-void
.end method
