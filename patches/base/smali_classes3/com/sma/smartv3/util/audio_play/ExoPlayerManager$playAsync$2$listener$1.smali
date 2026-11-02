.class public final Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$playAsync$2$listener$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/media3/common/Player$Listener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;->XIi00iiXO(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $cont:Lcom/android/mltcode/paycertificationapi/IO0i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/IO0i<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;Lcom/android/mltcode/paycertificationapi/IO0i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;",
            "Lcom/android/mltcode/paycertificationapi/IO0i<",
            "-",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$playAsync$2$listener$1;->this$0:Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;

    iput-object p2, p0, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$playAsync$2$listener$1;->$cont:Lcom/android/mltcode/paycertificationapi/IO0i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPlaybackStateChanged(I)V
    .locals 1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$playAsync$2$listener$1;->this$0:Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;

    invoke-virtual {p1}, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;->OIi0()Landroidx/media3/exoplayer/ExoPlayer;

    move-result-object p1

    invoke-interface {p1, p0}, Landroidx/media3/common/Player;->removeListener(Landroidx/media3/common/Player$Listener;)V

    iget-object p1, p0, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$playAsync$2$listener$1;->this$0:Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;->I0IIOi(Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$playAsync$2$listener$1;->$cont:Lcom/android/mltcode/paycertificationapi/IO0i;

    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    sget-object v0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public onPlayerError(Landroidx/media3/common/PlaybackException;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$playAsync$2$listener$1;->this$0:Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;

    invoke-virtual {p1}, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;->OIi0()Landroidx/media3/exoplayer/ExoPlayer;

    move-result-object p1

    invoke-interface {p1, p0}, Landroidx/media3/common/Player;->removeListener(Landroidx/media3/common/Player$Listener;)V

    iget-object p1, p0, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$playAsync$2$listener$1;->this$0:Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;->I0IIOi(Lcom/sma/smartv3/util/audio_play/ExoPlayerManager;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$playAsync$2$listener$1;->$cont:Lcom/android/mltcode/paycertificationapi/IO0i;

    invoke-interface {p1}, Lcom/android/mltcode/paycertificationapi/IO0i;->isActive()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/util/audio_play/ExoPlayerManager$playAsync$2$listener$1;->$cont:Lcom/android/mltcode/paycertificationapi/IO0i;

    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    sget-object v0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
