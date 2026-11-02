.class public final Lcom/szabh/smable3/music/MusicController;
.super Lcom/szabh/smable3/music/MusicControllerCompat;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/music/MusicController$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMusicController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicController.kt\ncom/szabh/smable3/music/MusicController\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,522:1\n1563#2:523\n1634#2,3:524\n1869#2,2:528\n1563#2:530\n1634#2,3:531\n1563#2:534\n1634#2,3:535\n1#3:527\n*S KotlinDebug\n*F\n+ 1 MusicController.kt\ncom/szabh/smable3/music/MusicController\n*L\n211#1:523\n211#1:524,3\n280#1:528,2\n387#1:530\n387#1:531,3\n81#1:534\n81#1:535,3\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMusicController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicController.kt\ncom/szabh/smable3/music/MusicController\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,522:1\n1563#2:523\n1634#2,3:524\n1869#2,2:528\n1563#2:530\n1634#2,3:531\n1563#2:534\n1634#2,3:535\n1#3:527\n*S KotlinDebug\n*F\n+ 1 MusicController.kt\ncom/szabh/smable3/music/MusicController\n*L\n211#1:523\n211#1:524,3\n280#1:528,2\n387#1:530\n387#1:531,3\n81#1:534\n81#1:535,3\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/music/MusicController$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final LOG_HEADER:Ljava/lang/String; = "MusicController"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# instance fields
.field private curMedia:Landroid/media/session/MediaController;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private isOldMusicControl:Z

.field private lastAlbum:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private lastArtist:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private lastStateContents:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private mActiveMediaController:Landroid/support/v4/media/session/MediaControllerCompat;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mBleHandleCallback:Lcom/szabh/smable3/music/MusicController$mBleHandleCallback$1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mCallback:Lcom/szabh/smable3/music/MusicController$mCallback$1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mLastVolume:I

.field private mLastVolumeTime:J

.field private mMediaSessionManager:Landroid/media/session/MediaSessionManager;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mNotificationListener:Landroid/content/ComponentName;

.field private final mOnActiveSessionsChangedListener:Landroid/media/session/MediaSessionManager$OnActiveSessionsChangedListener;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private tempTime:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/music/MusicController$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/music/MusicController$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/music/MusicController;->Companion:Lcom/szabh/smable3/music/MusicController$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/szabh/smable3/music/MusicControllerCompat;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/szabh/smable3/music/MusicController;->mLastVolume:I

    new-instance v0, Lcom/szabh/smable3/music/MusicController$mCallback$1;

    invoke-direct {v0, p0}, Lcom/szabh/smable3/music/MusicController$mCallback$1;-><init>(Lcom/szabh/smable3/music/MusicController;)V

    iput-object v0, p0, Lcom/szabh/smable3/music/MusicController;->mCallback:Lcom/szabh/smable3/music/MusicController$mCallback$1;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/gw0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/gw0;-><init>(Lcom/szabh/smable3/music/MusicController;)V

    iput-object v0, p0, Lcom/szabh/smable3/music/MusicController;->mOnActiveSessionsChangedListener:Landroid/media/session/MediaSessionManager$OnActiveSessionsChangedListener;

    new-instance v0, Lcom/szabh/smable3/music/MusicController$mBleHandleCallback$1;

    invoke-direct {v0, p0}, Lcom/szabh/smable3/music/MusicController$mBleHandleCallback$1;-><init>(Lcom/szabh/smable3/music/MusicController;)V

    iput-object v0, p0, Lcom/szabh/smable3/music/MusicController;->mBleHandleCallback:Lcom/szabh/smable3/music/MusicController$mBleHandleCallback$1;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/szabh/smable3/music/MusicController;->lastStateContents:Ljava/util/List;

    const-string v0, ""

    iput-object v0, p0, Lcom/szabh/smable3/music/MusicController;->lastArtist:Ljava/lang/String;

    iput-object v0, p0, Lcom/szabh/smable3/music/MusicController;->lastAlbum:Ljava/lang/String;

    return-void
.end method

.method public static synthetic XIi00iiXO(Lcom/szabh/smable3/music/MusicController;Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/szabh/smable3/music/MusicController;->mOnActiveSessionsChangedListener$lambda$0(Lcom/szabh/smable3/music/MusicController;Ljava/util/List;)V

    return-void
.end method

.method public static final synthetic access$autoSwitchActiveController(Lcom/szabh/smable3/music/MusicController;Ljava/util/List;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/szabh/smable3/music/MusicController;->autoSwitchActiveController(Ljava/util/List;Z)V

    return-void
.end method

.method public static final synthetic access$getMActiveMediaController$p(Lcom/szabh/smable3/music/MusicController;)Landroid/support/v4/media/session/MediaControllerCompat;
    .locals 0

    iget-object p0, p0, Lcom/szabh/smable3/music/MusicController;->mActiveMediaController:Landroid/support/v4/media/session/MediaControllerCompat;

    return-object p0
.end method

.method public static final synthetic access$getMMediaSessionManager$p(Lcom/szabh/smable3/music/MusicController;)Landroid/media/session/MediaSessionManager;
    .locals 0

    iget-object p0, p0, Lcom/szabh/smable3/music/MusicController;->mMediaSessionManager:Landroid/media/session/MediaSessionManager;

    return-object p0
.end method

.method public static final synthetic access$getMNotificationListener$p(Lcom/szabh/smable3/music/MusicController;)Landroid/content/ComponentName;
    .locals 0

    iget-object p0, p0, Lcom/szabh/smable3/music/MusicController;->mNotificationListener:Landroid/content/ComponentName;

    return-object p0
.end method

.method public static final synthetic access$sendMediaKeyEvent(Lcom/szabh/smable3/music/MusicController;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/szabh/smable3/music/MusicController;->sendMediaKeyEvent(I)V

    return-void
.end method

.method private final assignActiveController(Landroid/media/session/MediaController;)V
    .locals 4

    :try_start_0
    invoke-direct {p0}, Lcom/szabh/smable3/music/MusicController;->releaseActiveController()V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "MusicController assignActiveController -> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/media/session/MediaController;->getPackageName()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_5

    :cond_0
    move-object v3, v2

    :goto_0
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XO0O10(Ljava/lang/String;)V

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/media/session/MediaController;->getSessionToken()Landroid/media/session/MediaSession$Token;

    move-result-object p1

    goto :goto_1

    :cond_1
    move-object p1, v2

    :goto_1
    invoke-static {p1}, Landroid/support/v4/media/session/MediaSessionCompat$Token;->fromToken(Ljava/lang/Object;)Landroid/support/v4/media/session/MediaSessionCompat$Token;

    move-result-object p1

    new-instance v0, Landroid/support/v4/media/session/MediaControllerCompat;

    invoke-virtual {p0}, Lcom/szabh/smable3/music/MusicControllerCompat;->getMContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroid/support/v4/media/session/MediaControllerCompat;-><init>(Landroid/content/Context;Landroid/support/v4/media/session/MediaSessionCompat$Token;)V

    iput-object v0, p0, Lcom/szabh/smable3/music/MusicController;->mActiveMediaController:Landroid/support/v4/media/session/MediaControllerCompat;

    iget-object p1, p0, Lcom/szabh/smable3/music/MusicController;->mCallback:Lcom/szabh/smable3/music/MusicController$mCallback$1;

    invoke-virtual {v0, p1}, Landroid/support/v4/media/session/MediaControllerCompat;->registerCallback(Landroid/support/v4/media/session/MediaControllerCompat$Callback;)V

    iget-object p1, p0, Lcom/szabh/smable3/music/MusicController;->mActiveMediaController:Landroid/support/v4/media/session/MediaControllerCompat;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/support/v4/media/session/MediaControllerCompat;->getPlaybackState()Landroid/support/v4/media/session/PlaybackStateCompat;

    move-result-object p1

    goto :goto_2

    :cond_2
    move-object p1, v2

    :goto_2
    if-nez p1, :cond_4

    iget-object p1, p0, Lcom/szabh/smable3/music/MusicController;->mActiveMediaController:Landroid/support/v4/media/session/MediaControllerCompat;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Landroid/support/v4/media/session/MediaControllerCompat;->getPlaybackState()Landroid/support/v4/media/session/PlaybackStateCompat;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Landroid/support/v4/media/session/PlaybackStateCompat;->getState()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_3

    :cond_3
    move-object p1, v2

    :goto_3
    if-eqz p1, :cond_7

    :cond_4
    iget-object p1, p0, Lcom/szabh/smable3/music/MusicController;->mActiveMediaController:Landroid/support/v4/media/session/MediaControllerCompat;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Landroid/support/v4/media/session/MediaControllerCompat;->getPlaybackState()Landroid/support/v4/media/session/PlaybackStateCompat;

    move-result-object p1

    goto :goto_4

    :cond_5
    move-object p1, v2

    :goto_4
    invoke-virtual {p0, p1}, Lcom/szabh/smable3/music/MusicController;->updatePlaybackState(Landroid/support/v4/media/session/PlaybackStateCompat;)V

    iget-object p1, p0, Lcom/szabh/smable3/music/MusicController;->mActiveMediaController:Landroid/support/v4/media/session/MediaControllerCompat;

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Landroid/support/v4/media/session/MediaControllerCompat;->getMetadata()Landroid/support/v4/media/MediaMetadataCompat;

    move-result-object v2

    :cond_6
    invoke-virtual {p0, v2}, Lcom/szabh/smable3/music/MusicController;->updateMetadata(Landroid/support/v4/media/MediaMetadataCompat;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_5
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "MusicController assignActiveController -> error:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XO0O10(Ljava/lang/String;)V

    :cond_7
    return-void
.end method

.method private final autoSwitchActiveController(Ljava/util/List;Z)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/media/session/MediaController;",
            ">;Z)V"
        }
    .end annotation

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_10

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_5

    :cond_0
    move-object p2, p1

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Landroid/media/session/MediaController;

    invoke-virtual {v5}, Landroid/media/session/MediaController;->getPlaybackState()Landroid/media/session/PlaybackState;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-virtual {v5}, Landroid/media/session/PlaybackState;->getState()I

    move-result v5

    if-ne v5, v4, :cond_1

    goto :goto_0

    :cond_2
    move-object v3, v1

    :goto_0
    check-cast v3, Landroid/media/session/MediaController;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Landroid/media/session/MediaController;

    invoke-virtual {v6}, Landroid/media/session/MediaController;->getPlaybackState()Landroid/media/session/PlaybackState;

    move-result-object v6

    if-eqz v6, :cond_3

    invoke-virtual {v6}, Landroid/media/session/PlaybackState;->getState()I

    move-result v6

    const/4 v7, 0x2

    if-ne v6, v7, :cond_3

    goto :goto_1

    :cond_4
    move-object v5, v1

    :goto_1
    check-cast v5, Landroid/media/session/MediaController;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Landroid/media/session/MediaController;

    invoke-virtual {v7}, Landroid/media/session/MediaController;->getPlaybackState()Landroid/media/session/PlaybackState;

    move-result-object v7

    if-eqz v7, :cond_5

    invoke-virtual {v7}, Landroid/media/session/PlaybackState;->getState()I

    move-result v7

    if-ne v7, v0, :cond_5

    goto :goto_2

    :cond_6
    move-object v6, v1

    :goto_2
    check-cast v6, Landroid/media/session/MediaController;

    const/4 v0, 0x0

    if-nez v3, :cond_9

    if-nez v5, :cond_8

    if-nez v6, :cond_7

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Landroid/media/session/MediaController;

    goto :goto_3

    :cond_7
    move-object v3, v6

    goto :goto_3

    :cond_8
    move-object v3, v5

    :cond_9
    :goto_3
    iput-object v3, p0, Lcom/szabh/smable3/music/MusicController;->curMedia:Landroid/media/session/MediaController;

    iput-boolean v0, p0, Lcom/szabh/smable3/music/MusicController;->isOldMusicControl:Z

    iget-object p1, p0, Lcom/szabh/smable3/music/MusicController;->mActiveMediaController:Landroid/support/v4/media/session/MediaControllerCompat;

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Landroid/support/v4/media/session/MediaControllerCompat;->getPackageName()Ljava/lang/String;

    move-result-object p1

    goto :goto_4

    :cond_a
    move-object p1, v1

    :goto_4
    iget-object v0, p0, Lcom/szabh/smable3/music/MusicController;->curMedia:Landroid/media/session/MediaController;

    if-eqz v0, :cond_b

    invoke-virtual {v0}, Landroid/media/session/MediaController;->getPackageName()Ljava/lang/String;

    move-result-object v1

    :cond_b
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    iget-object p1, p0, Lcom/szabh/smable3/music/MusicController;->curMedia:Landroid/media/session/MediaController;

    invoke-direct {p0, p1}, Lcom/szabh/smable3/music/MusicController;->assignActiveController(Landroid/media/session/MediaController;)V

    return-void

    :cond_c
    iget-object p1, p0, Lcom/szabh/smable3/music/MusicController;->mActiveMediaController:Landroid/support/v4/media/session/MediaControllerCompat;

    if-eqz p1, :cond_d

    invoke-virtual {p1}, Landroid/support/v4/media/session/MediaControllerCompat;->getPlaybackState()Landroid/support/v4/media/session/PlaybackStateCompat;

    move-result-object p1

    if-eqz p1, :cond_d

    invoke-virtual {p1}, Landroid/support/v4/media/session/PlaybackStateCompat;->getState()I

    move-result p1

    if-ne p1, v4, :cond_d

    return-void

    :cond_d
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_e
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_f

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/media/session/MediaController;

    invoke-virtual {p2}, Landroid/media/session/MediaController;->getPlaybackState()Landroid/media/session/PlaybackState;

    move-result-object v0

    if-eqz v0, :cond_e

    invoke-virtual {v0}, Landroid/media/session/PlaybackState;->getState()I

    move-result v0

    if-ne v0, v4, :cond_e

    invoke-direct {p0, p2}, Lcom/szabh/smable3/music/MusicController;->assignActiveController(Landroid/media/session/MediaController;)V

    :cond_f
    return-void

    :cond_10
    :goto_5
    if-eqz p2, :cond_11

    invoke-direct {p0}, Lcom/szabh/smable3/music/MusicController;->releaseActiveController()V

    :cond_11
    iput-object v1, p0, Lcom/szabh/smable3/music/MusicController;->curMedia:Landroid/media/session/MediaController;

    iget-boolean p1, p0, Lcom/szabh/smable3/music/MusicController;->isOldMusicControl:Z

    if-nez p1, :cond_12

    sget-object p1, Lcom/szabh/smable3/entity/PlaybackState;->PAUSED:Lcom/szabh/smable3/entity/PlaybackState;

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/PlaybackState;->getMState()B

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    sget-object p2, Lkotlin/jvm/internal/StringCompanionObject;->OXO1:Lkotlin/jvm/internal/StringCompanionObject;

    const/4 p2, 0x0

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    const-string v0, "%.1f"

    invoke-static {v0, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "format(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, ",0"

    filled-new-array {p1, p2, v0}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iXiX011([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    sget-object p2, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    new-instance v0, Lcom/szabh/smable3/entity/BleMusicControl;

    sget-object v1, Lcom/szabh/smable3/entity/MusicEntity;->PLAYER:Lcom/szabh/smable3/entity/MusicEntity;

    sget-object v2, Lcom/szabh/smable3/entity/MusicAttr;->PLAYER_PLAYBACK_INFO:Lcom/szabh/smable3/entity/MusicAttr;

    invoke-direct {v0, v1, v2, p1}, Lcom/szabh/smable3/entity/BleMusicControl;-><init>(Lcom/szabh/smable3/entity/MusicEntity;Lcom/szabh/smable3/entity/MusicAttr;Ljava/util/List;)V

    invoke-virtual {p2, v0}, Lcom/szabh/smable3/component/BaseBleConnector;->updateMusic(Lcom/szabh/smable3/entity/BleMusicControl;)Z

    new-instance p1, Lcom/szabh/smable3/entity/BleMusicControl;

    sget-object v0, Lcom/szabh/smable3/entity/MusicEntity;->TRACK:Lcom/szabh/smable3/entity/MusicEntity;

    sget-object v1, Lcom/szabh/smable3/entity/MusicAttr;->TRACK_ARTIST:Lcom/szabh/smable3/entity/MusicAttr;

    const-string v2, " "

    invoke-direct {p1, v0, v1, v2}, Lcom/szabh/smable3/entity/BleMusicControl;-><init>(Lcom/szabh/smable3/entity/MusicEntity;Lcom/szabh/smable3/entity/MusicAttr;Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Lcom/szabh/smable3/component/BaseBleConnector;->updateMusic(Lcom/szabh/smable3/entity/BleMusicControl;)Z

    new-instance p1, Lcom/szabh/smable3/entity/BleMusicControl;

    sget-object v1, Lcom/szabh/smable3/entity/MusicAttr;->TRACK_ALBUM:Lcom/szabh/smable3/entity/MusicAttr;

    invoke-direct {p1, v0, v1, v2}, Lcom/szabh/smable3/entity/BleMusicControl;-><init>(Lcom/szabh/smable3/entity/MusicEntity;Lcom/szabh/smable3/entity/MusicAttr;Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Lcom/szabh/smable3/component/BaseBleConnector;->updateMusic(Lcom/szabh/smable3/entity/BleMusicControl;)Z

    new-instance p1, Lcom/szabh/smable3/entity/BleMusicControl;

    sget-object v1, Lcom/szabh/smable3/entity/MusicAttr;->TRACK_TITLE:Lcom/szabh/smable3/entity/MusicAttr;

    invoke-direct {p1, v0, v1, v2}, Lcom/szabh/smable3/entity/BleMusicControl;-><init>(Lcom/szabh/smable3/entity/MusicEntity;Lcom/szabh/smable3/entity/MusicAttr;Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Lcom/szabh/smable3/component/BaseBleConnector;->updateMusic(Lcom/szabh/smable3/entity/BleMusicControl;)Z

    new-instance p1, Lcom/szabh/smable3/entity/BleMusicControl;

    sget-object v1, Lcom/szabh/smable3/entity/MusicAttr;->TRACK_DURATION:Lcom/szabh/smable3/entity/MusicAttr;

    const-string v2, "0"

    invoke-direct {p1, v0, v1, v2}, Lcom/szabh/smable3/entity/BleMusicControl;-><init>(Lcom/szabh/smable3/entity/MusicEntity;Lcom/szabh/smable3/entity/MusicAttr;Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Lcom/szabh/smable3/component/BaseBleConnector;->updateMusic(Lcom/szabh/smable3/entity/BleMusicControl;)Z

    :cond_12
    const/4 p1, -0x1

    iput p1, p0, Lcom/szabh/smable3/music/MusicController;->mLastVolume:I

    return-void
.end method

.method public static synthetic autoSwitchActiveController$default(Lcom/szabh/smable3/music/MusicController;Ljava/util/List;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/szabh/smable3/music/MusicController;->autoSwitchActiveController(Ljava/util/List;Z)V

    return-void
.end method

.method private final getNotificationListener(Landroid/content/Context;)Landroid/content/ComponentName;
    .locals 7

    instance-of v0, p1, Landroid/service/notification/NotificationListenerService;

    if-nez v0, :cond_2

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x4

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->services:[Landroid/content/pm/ServiceInfo;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v0, v3

    iget-object v5, v4, Landroid/content/pm/ServiceInfo;->permission:Ljava/lang/String;

    const-string v6, "android.permission.BIND_NOTIFICATION_LISTENER_SERVICE"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    move-object v1, v4

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    if-eqz v1, :cond_2

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "NotificationListener -> "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v1, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    new-instance v0, Landroid/content/ComponentName;

    iget-object v1, v1, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    invoke-direct {v0, p1, v1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-object v0

    :cond_2
    new-instance v0, Landroid/content/ComponentName;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    return-object v0
.end method

.method private static final mOnActiveSessionsChangedListener$lambda$0(Lcom/szabh/smable3/music/MusicController;Ljava/util/List;)V
    .locals 8

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "MusicController onActiveSessionsChanged -> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v2, 0x0

    if-eqz p1, :cond_2

    move-object v3, p1

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v3, v5}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/media/session/MediaController;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5}, Landroid/media/session/MediaController;->getPackageName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, " playbackState="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Landroid/media/session/MediaController;->getPlaybackState()Landroid/media/session/PlaybackState;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-virtual {v5}, Landroid/media/session/PlaybackState;->getState()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    goto :goto_1

    :cond_0
    move-object v5, v2

    :goto_1
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    move-object v2, v4

    :cond_2
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XO0O10(Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lcom/szabh/smable3/music/MusicController;->autoSwitchActiveController(Ljava/util/List;Z)V

    return-void
.end method

.method private final releaseActiveController()V
    .locals 6

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "MusicController releaseActiveController -> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/szabh/smable3/music/MusicController;->mActiveMediaController:Landroid/support/v4/media/session/MediaControllerCompat;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/support/v4/media/session/MediaControllerCompat;->getPackageName()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v3

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XO0O10(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/szabh/smable3/music/MusicController;->mActiveMediaController:Landroid/support/v4/media/session/MediaControllerCompat;

    if-eqz v0, :cond_2

    sget-object v0, Lcom/szabh/smable3/entity/PlaybackState;->PAUSED:Lcom/szabh/smable3/entity/PlaybackState;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/PlaybackState;->getMState()B

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lkotlin/jvm/internal/StringCompanionObject;->OXO1:Lkotlin/jvm/internal/StringCompanionObject;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    const-string v2, "%.1f"

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "format(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, ",0"

    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iXiX011([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sget-object v1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    new-instance v2, Lcom/szabh/smable3/entity/BleMusicControl;

    sget-object v4, Lcom/szabh/smable3/entity/MusicEntity;->PLAYER:Lcom/szabh/smable3/entity/MusicEntity;

    sget-object v5, Lcom/szabh/smable3/entity/MusicAttr;->PLAYER_PLAYBACK_INFO:Lcom/szabh/smable3/entity/MusicAttr;

    invoke-direct {v2, v4, v5, v0}, Lcom/szabh/smable3/entity/BleMusicControl;-><init>(Lcom/szabh/smable3/entity/MusicEntity;Lcom/szabh/smable3/entity/MusicAttr;Ljava/util/List;)V

    invoke-virtual {v1, v2}, Lcom/szabh/smable3/component/BaseBleConnector;->updateMusic(Lcom/szabh/smable3/entity/BleMusicControl;)Z

    iget-object v0, p0, Lcom/szabh/smable3/music/MusicController;->mActiveMediaController:Landroid/support/v4/media/session/MediaControllerCompat;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/szabh/smable3/music/MusicController;->mCallback:Lcom/szabh/smable3/music/MusicController$mCallback$1;

    invoke-virtual {v0, v1}, Landroid/support/v4/media/session/MediaControllerCompat;->unregisterCallback(Landroid/support/v4/media/session/MediaControllerCompat$Callback;)V

    :cond_1
    iput-object v3, p0, Lcom/szabh/smable3/music/MusicController;->mActiveMediaController:Landroid/support/v4/media/session/MediaControllerCompat;

    :cond_2
    return-void
.end method

.method private final sendMediaKeyEvent(I)V
    .locals 4

    iget-object v0, p0, Lcom/szabh/smable3/music/MusicController;->mActiveMediaController:Landroid/support/v4/media/session/MediaControllerCompat;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_7

    iget-object v3, p0, Lcom/szabh/smable3/music/MusicController;->curMedia:Landroid/media/session/MediaController;

    if-nez v3, :cond_0

    goto/16 :goto_1

    :cond_0
    if-eqz v0, :cond_9

    if-eqz v0, :cond_6

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaControllerCompat;->getTransportControls()Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;

    move-result-object v3

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_6

    const/16 v3, 0x57

    if-eq p1, v3, :cond_5

    const/16 v3, 0x58

    if-eq p1, v3, :cond_4

    const/16 v3, 0x7e

    if-eq p1, v3, :cond_3

    const/16 v3, 0x7f

    if-eq p1, v3, :cond_2

    new-instance v3, Landroid/view/KeyEvent;

    invoke-direct {v3, v2, p1}, Landroid/view/KeyEvent;-><init>(II)V

    invoke-virtual {v0, v3}, Landroid/support/v4/media/session/MediaControllerCompat;->dispatchMediaButtonEvent(Landroid/view/KeyEvent;)Z

    new-instance v2, Landroid/view/KeyEvent;

    invoke-direct {v2, v1, p1}, Landroid/view/KeyEvent;-><init>(II)V

    invoke-virtual {v0, v2}, Landroid/support/v4/media/session/MediaControllerCompat;->dispatchMediaButtonEvent(Landroid/view/KeyEvent;)Z

    return-void

    :cond_2
    iget-object p1, p0, Lcom/szabh/smable3/music/MusicController;->mActiveMediaController:Landroid/support/v4/media/session/MediaControllerCompat;

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Landroid/support/v4/media/session/MediaControllerCompat;->getTransportControls()Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;

    move-result-object p1

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;->pause()V

    return-void

    :cond_3
    iget-object p1, p0, Lcom/szabh/smable3/music/MusicController;->mActiveMediaController:Landroid/support/v4/media/session/MediaControllerCompat;

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Landroid/support/v4/media/session/MediaControllerCompat;->getTransportControls()Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;

    move-result-object p1

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;->play()V

    return-void

    :cond_4
    iget-object p1, p0, Lcom/szabh/smable3/music/MusicController;->mActiveMediaController:Landroid/support/v4/media/session/MediaControllerCompat;

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Landroid/support/v4/media/session/MediaControllerCompat;->getTransportControls()Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;

    move-result-object p1

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;->skipToPrevious()V

    return-void

    :cond_5
    iget-object p1, p0, Lcom/szabh/smable3/music/MusicController;->mActiveMediaController:Landroid/support/v4/media/session/MediaControllerCompat;

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Landroid/support/v4/media/session/MediaControllerCompat;->getTransportControls()Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;

    move-result-object p1

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;->skipToNext()V

    return-void

    :cond_6
    new-instance v3, Landroid/view/KeyEvent;

    invoke-direct {v3, v2, p1}, Landroid/view/KeyEvent;-><init>(II)V

    invoke-virtual {v0, v3}, Landroid/support/v4/media/session/MediaControllerCompat;->dispatchMediaButtonEvent(Landroid/view/KeyEvent;)Z

    new-instance v2, Landroid/view/KeyEvent;

    invoke-direct {v2, v1, p1}, Landroid/view/KeyEvent;-><init>(II)V

    invoke-virtual {v0, v2}, Landroid/support/v4/media/session/MediaControllerCompat;->dispatchMediaButtonEvent(Landroid/view/KeyEvent;)Z

    return-void

    :cond_7
    :goto_1
    invoke-virtual {p0}, Lcom/szabh/smable3/music/MusicControllerCompat;->getMAudioManager()Landroid/media/AudioManager;

    move-result-object v0

    if-eqz v0, :cond_8

    new-instance v3, Landroid/view/KeyEvent;

    invoke-direct {v3, v2, p1}, Landroid/view/KeyEvent;-><init>(II)V

    invoke-virtual {v0, v3}, Landroid/media/AudioManager;->dispatchMediaKeyEvent(Landroid/view/KeyEvent;)V

    :cond_8
    invoke-virtual {p0}, Lcom/szabh/smable3/music/MusicControllerCompat;->getMAudioManager()Landroid/media/AudioManager;

    move-result-object v0

    if-eqz v0, :cond_9

    new-instance v2, Landroid/view/KeyEvent;

    invoke-direct {v2, v1, p1}, Landroid/view/KeyEvent;-><init>(II)V

    invoke-virtual {v0, v2}, Landroid/media/AudioManager;->dispatchMediaKeyEvent(Landroid/view/KeyEvent;)V

    :cond_9
    return-void
.end method

.method private final updateMusic(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    iget-object v0, p0, Lcom/szabh/smable3/music/MusicController;->lastArtist:Ljava/lang/String;

    invoke-static {v0}, Lkotlin/text/StringsKt__StringsKt;->iX1X1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    iput-object p1, p0, Lcom/szabh/smable3/music/MusicController;->lastArtist:Ljava/lang/String;

    :cond_0
    iget-object v0, p0, Lcom/szabh/smable3/music/MusicController;->lastAlbum:Ljava/lang/String;

    invoke-static {v0}, Lkotlin/text/StringsKt__StringsKt;->iX1X1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_1

    iput-object p2, p0, Lcom/szabh/smable3/music/MusicController;->lastAlbum:Ljava/lang/String;

    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lcom/szabh/smable3/music/MusicController;->lastArtist:Ljava/lang/String;

    invoke-static {v2}, Lkotlin/text/StringsKt__StringsKt;->iX1X1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1}, Lkotlin/text/StringsKt__StringsKt;->iX1X1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/szabh/smable3/music/MusicController;->lastAlbum:Ljava/lang/String;

    invoke-static {v2}, Lkotlin/text/StringsKt__StringsKt;->iX1X1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {p2}, Lkotlin/text/StringsKt__StringsKt;->iX1X1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-wide v2, p0, Lcom/szabh/smable3/music/MusicController;->tempTime:J

    sub-long v2, v0, v2

    const-wide/16 v4, 0x7530

    cmp-long v2, v2, v4

    if-lez v2, :cond_2

    iput-wide v0, p0, Lcom/szabh/smable3/music/MusicController;->tempTime:J

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    new-instance v1, Lcom/szabh/smable3/entity/BleMusicControl;

    sget-object v2, Lcom/szabh/smable3/entity/MusicEntity;->TRACK:Lcom/szabh/smable3/entity/MusicEntity;

    sget-object v3, Lcom/szabh/smable3/entity/MusicAttr;->TRACK_ARTIST:Lcom/szabh/smable3/entity/MusicAttr;

    invoke-direct {v1, v2, v3, p1}, Lcom/szabh/smable3/entity/BleMusicControl;-><init>(Lcom/szabh/smable3/entity/MusicEntity;Lcom/szabh/smable3/entity/MusicAttr;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BaseBleConnector;->updateMusic(Lcom/szabh/smable3/entity/BleMusicControl;)Z

    new-instance p1, Lcom/szabh/smable3/entity/BleMusicControl;

    sget-object v1, Lcom/szabh/smable3/entity/MusicAttr;->TRACK_ALBUM:Lcom/szabh/smable3/entity/MusicAttr;

    invoke-direct {p1, v2, v1, p2}, Lcom/szabh/smable3/entity/BleMusicControl;-><init>(Lcom/szabh/smable3/entity/MusicEntity;Lcom/szabh/smable3/entity/MusicAttr;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/szabh/smable3/component/BaseBleConnector;->updateMusic(Lcom/szabh/smable3/entity/BleMusicControl;)Z

    new-instance p1, Lcom/szabh/smable3/entity/BleMusicControl;

    sget-object p2, Lcom/szabh/smable3/entity/MusicAttr;->TRACK_TITLE:Lcom/szabh/smable3/entity/MusicAttr;

    invoke-direct {p1, v2, p2, p3}, Lcom/szabh/smable3/entity/BleMusicControl;-><init>(Lcom/szabh/smable3/entity/MusicEntity;Lcom/szabh/smable3/entity/MusicAttr;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/szabh/smable3/component/BaseBleConnector;->updateMusic(Lcom/szabh/smable3/entity/BleMusicControl;)Z

    new-instance p1, Lcom/szabh/smable3/entity/BleMusicControl;

    sget-object p2, Lcom/szabh/smable3/entity/MusicAttr;->TRACK_DURATION:Lcom/szabh/smable3/entity/MusicAttr;

    invoke-direct {p1, v2, p2, p4}, Lcom/szabh/smable3/entity/BleMusicControl;-><init>(Lcom/szabh/smable3/entity/MusicEntity;Lcom/szabh/smable3/entity/MusicAttr;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/szabh/smable3/component/BaseBleConnector;->updateMusic(Lcom/szabh/smable3/entity/BleMusicControl;)Z

    :cond_2
    return-void

    :cond_3
    iput-object p1, p0, Lcom/szabh/smable3/music/MusicController;->lastArtist:Ljava/lang/String;

    iput-object p2, p0, Lcom/szabh/smable3/music/MusicController;->lastAlbum:Ljava/lang/String;

    iput-wide v0, p0, Lcom/szabh/smable3/music/MusicController;->tempTime:J

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    new-instance v1, Lcom/szabh/smable3/entity/BleMusicControl;

    sget-object v2, Lcom/szabh/smable3/entity/MusicEntity;->TRACK:Lcom/szabh/smable3/entity/MusicEntity;

    sget-object v3, Lcom/szabh/smable3/entity/MusicAttr;->TRACK_ARTIST:Lcom/szabh/smable3/entity/MusicAttr;

    invoke-direct {v1, v2, v3, p1}, Lcom/szabh/smable3/entity/BleMusicControl;-><init>(Lcom/szabh/smable3/entity/MusicEntity;Lcom/szabh/smable3/entity/MusicAttr;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BaseBleConnector;->updateMusic(Lcom/szabh/smable3/entity/BleMusicControl;)Z

    new-instance p1, Lcom/szabh/smable3/entity/BleMusicControl;

    sget-object v1, Lcom/szabh/smable3/entity/MusicAttr;->TRACK_ALBUM:Lcom/szabh/smable3/entity/MusicAttr;

    invoke-direct {p1, v2, v1, p2}, Lcom/szabh/smable3/entity/BleMusicControl;-><init>(Lcom/szabh/smable3/entity/MusicEntity;Lcom/szabh/smable3/entity/MusicAttr;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/szabh/smable3/component/BaseBleConnector;->updateMusic(Lcom/szabh/smable3/entity/BleMusicControl;)Z

    new-instance p1, Lcom/szabh/smable3/entity/BleMusicControl;

    sget-object p2, Lcom/szabh/smable3/entity/MusicAttr;->TRACK_TITLE:Lcom/szabh/smable3/entity/MusicAttr;

    invoke-direct {p1, v2, p2, p3}, Lcom/szabh/smable3/entity/BleMusicControl;-><init>(Lcom/szabh/smable3/entity/MusicEntity;Lcom/szabh/smable3/entity/MusicAttr;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/szabh/smable3/component/BaseBleConnector;->updateMusic(Lcom/szabh/smable3/entity/BleMusicControl;)Z

    new-instance p1, Lcom/szabh/smable3/entity/BleMusicControl;

    sget-object p2, Lcom/szabh/smable3/entity/MusicAttr;->TRACK_DURATION:Lcom/szabh/smable3/entity/MusicAttr;

    invoke-direct {p1, v2, p2, p4}, Lcom/szabh/smable3/entity/BleMusicControl;-><init>(Lcom/szabh/smable3/entity/MusicEntity;Lcom/szabh/smable3/entity/MusicAttr;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/szabh/smable3/component/BaseBleConnector;->updateMusic(Lcom/szabh/smable3/entity/BleMusicControl;)Z

    return-void
.end method


# virtual methods
.method public exit()V
    .locals 2

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "MusicController exit"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XO0O10(Ljava/lang/String;)V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v1, p0, Lcom/szabh/smable3/music/MusicController;->mBleHandleCallback:Lcom/szabh/smable3/music/MusicController$mBleHandleCallback$1;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    invoke-direct {p0}, Lcom/szabh/smable3/music/MusicController;->releaseActiveController()V

    invoke-super {p0}, Lcom/szabh/smable3/music/MusicControllerCompat;->exit()V

    return-void
.end method

.method public final getCurMedia()Landroid/media/session/MediaController;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/music/MusicController;->curMedia:Landroid/media/session/MediaController;

    return-object v0
.end method

.method public final isOldMusicControl()Z
    .locals 1

    iget-boolean v0, p0, Lcom/szabh/smable3/music/MusicController;->isOldMusicControl:Z

    return v0
.end method

.method public final keepTwoDecimal(F)Ljava/lang/String;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const v1, 0x7f7fffff    # Float.MAX_VALUE

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    new-instance v0, Ljava/text/DecimalFormat;

    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-static {v1}, Ljava/text/DecimalFormatSymbols;->getInstance(Ljava/util/Locale;)Ljava/text/DecimalFormatSymbols;

    move-result-object v1

    const-string v2, "#.##"

    invoke-direct {v0, v2, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;Ljava/text/DecimalFormatSymbols;)V

    new-instance v1, Ljava/math/BigDecimal;

    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    const-string p1, "0.00"

    return-object p1
.end method

.method public launch(Landroid/content/Context;)V
    .locals 9
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/szabh/smable3/music/MusicControllerCompat;->launch(Landroid/content/Context;)V

    :try_start_0
    invoke-direct {p0, p1}, Lcom/szabh/smable3/music/MusicController;->getNotificationListener(Landroid/content/Context;)Landroid/content/ComponentName;

    move-result-object v0

    iput-object v0, p0, Lcom/szabh/smable3/music/MusicController;->mNotificationListener:Landroid/content/ComponentName;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "MusicController launch notificationListener -> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/szabh/smable3/music/MusicController;->mNotificationListener:Landroid/content/ComponentName;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v3, "mNotificationListener"

    const/4 v4, 0x0

    if-nez v2, :cond_0

    :try_start_1
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v4

    goto :goto_0

    :catch_0
    move-exception p1

    goto/16 :goto_5

    :cond_0
    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XO0O10(Ljava/lang/String;)V

    const-string v1, "media_session"

    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v1, "null cannot be cast to non-null type android.media.session.MediaSessionManager"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/media/session/MediaSessionManager;

    iput-object p1, p0, Lcom/szabh/smable3/music/MusicController;->mMediaSessionManager:Landroid/media/session/MediaSessionManager;

    if-eqz p1, :cond_2

    iget-object v1, p0, Lcom/szabh/smable3/music/MusicController;->mNotificationListener:Landroid/content/ComponentName;

    if-nez v1, :cond_1

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v4

    :cond_1
    invoke-virtual {p1, v1}, Landroid/media/session/MediaSessionManager;->getActiveSessions(Landroid/content/ComponentName;)Ljava/util/List;

    move-result-object p1

    goto :goto_1

    :cond_2
    move-object p1, v4

    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "MusicController launch activeMediaControllers -> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p1, :cond_4

    move-object v2, p1

    check-cast v2, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v2, v6}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/media/session/MediaController;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6}, Landroid/media/session/MediaController;->getPackageName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, " playbackState="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Landroid/media/session/MediaController;->getPlaybackState()Landroid/media/session/PlaybackState;

    move-result-object v6

    if-eqz v6, :cond_3

    invoke-virtual {v6}, Landroid/media/session/PlaybackState;->getState()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    goto :goto_3

    :cond_3
    move-object v6, v4

    :goto_3
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    move-object v5, v4

    :cond_5
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XO0O10(Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v4}, Lcom/szabh/smable3/music/MusicController;->autoSwitchActiveController$default(Lcom/szabh/smable3/music/MusicController;Ljava/util/List;ZILjava/lang/Object;)V

    iget-object p1, p0, Lcom/szabh/smable3/music/MusicController;->mMediaSessionManager:Landroid/media/session/MediaSessionManager;

    if-eqz p1, :cond_7

    iget-object v0, p0, Lcom/szabh/smable3/music/MusicController;->mOnActiveSessionsChangedListener:Landroid/media/session/MediaSessionManager$OnActiveSessionsChangedListener;

    iget-object v1, p0, Lcom/szabh/smable3/music/MusicController;->mNotificationListener:Landroid/content/ComponentName;

    if-nez v1, :cond_6

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_4

    :cond_6
    move-object v4, v1

    :goto_4
    invoke-virtual {p1, v0, v4}, Landroid/media/session/MediaSessionManager;->addOnActiveSessionsChangedListener(Landroid/media/session/MediaSessionManager$OnActiveSessionsChangedListener;Landroid/content/ComponentName;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_6

    :goto_5
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "MusicController launch notificationListener error -> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XIi00iiXO(Ljava/lang/String;)V

    :cond_7
    :goto_6
    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v0, p0, Lcom/szabh/smable3/music/MusicController;->mBleHandleCallback:Lcom/szabh/smable3/music/MusicController$mBleHandleCallback$1;

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    return-void
.end method

.method public final setCurMedia(Landroid/media/session/MediaController;)V
    .locals 0
    .param p1    # Landroid/media/session/MediaController;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/szabh/smable3/music/MusicController;->curMedia:Landroid/media/session/MediaController;

    return-void
.end method

.method public final setOldMusicControl(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/szabh/smable3/music/MusicController;->isOldMusicControl:Z

    return-void
.end method

.method public final updateMetadata(Landroid/support/v4/media/MediaMetadataCompat;)V
    .locals 7
    .param p1    # Landroid/support/v4/media/MediaMetadataCompat;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    if-nez p1, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v0, "android.media.metadata.ARTIST"

    invoke-virtual {p1, v0}, Landroid/support/v4/media/MediaMetadataCompat;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, " "

    if-nez v0, :cond_1

    move-object v0, v1

    :cond_1
    const-string v2, "android.media.metadata.ALBUM"

    invoke-virtual {p1, v2}, Landroid/support/v4/media/MediaMetadataCompat;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_2

    move-object v2, v1

    :cond_2
    const-string v3, "android.media.metadata.TITLE"

    invoke-virtual {p1, v3}, Landroid/support/v4/media/MediaMetadataCompat;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_3

    goto :goto_0

    :cond_3
    move-object v1, v3

    :goto_0
    const-string v3, "android.media.metadata.DURATION"

    invoke-virtual {p1, v3}, Landroid/support/v4/media/MediaMetadataCompat;->getLong(Ljava/lang/String;)J

    move-result-wide v3

    const/16 p1, 0x3e8

    int-to-long v5, p1

    div-long/2addr v3, v5

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    sget-object v3, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "MusicController updateMetadata -> METADATA_KEY_ARTIST="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " , METADATA_KEY_ALBUM="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ", METADATA_KEY_TITLE="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ", METADATA_KEY_DURATION="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " ,  lastArtist="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lcom/szabh/smable3/music/MusicController;->lastArtist:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ", lastAlbum="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lcom/szabh/smable3/music/MusicController;->lastAlbum:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XO0O10(Ljava/lang/String;)V

    invoke-direct {p0, v0, v2, v1, p1}, Lcom/szabh/smable3/music/MusicController;->updateMusic(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget p1, p0, Lcom/szabh/smable3/music/MusicController;->mLastVolume:I

    const/4 v0, -0x1

    if-ne p1, v0, :cond_4

    invoke-virtual {p0}, Lcom/szabh/smable3/music/MusicController;->updateVolume()V

    :cond_4
    :goto_1
    return-void
.end method

.method public final updatePlaybackState(Landroid/support/v4/media/session/PlaybackStateCompat;)V
    .locals 10
    .param p1    # Landroid/support/v4/media/session/PlaybackStateCompat;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "MusicController updatePlaybackState -> state="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lcom/szabh/smable3/music/MusicController;->Companion:Lcom/szabh/smable3/music/MusicController$Companion;

    invoke-static {v2, p1}, Lcom/szabh/smable3/music/MusicController$Companion;->access$getState(Lcom/szabh/smable3/music/MusicController$Companion;Landroid/support/v4/media/session/PlaybackStateCompat;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x20

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XO0O10(Ljava/lang/String;)V

    if-nez p1, :cond_0

    goto/16 :goto_4

    :cond_0
    invoke-virtual {p1}, Landroid/support/v4/media/session/PlaybackStateCompat;->getState()I

    move-result v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_4

    const/4 v3, 0x2

    if-eq v1, v3, :cond_4

    const/4 v3, 0x3

    if-eq v1, v3, :cond_3

    const/4 v3, 0x4

    if-eq v1, v3, :cond_2

    const/4 v3, 0x5

    if-eq v1, v3, :cond_1

    sget-object v1, Lcom/szabh/smable3/entity/PlaybackState;->UNKNOWN:Lcom/szabh/smable3/entity/PlaybackState;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/PlaybackState;->getMState()B

    move-result v1

    goto :goto_0

    :cond_1
    sget-object v1, Lcom/szabh/smable3/entity/PlaybackState;->REWINDING:Lcom/szabh/smable3/entity/PlaybackState;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/PlaybackState;->getMState()B

    move-result v1

    goto :goto_0

    :cond_2
    sget-object v1, Lcom/szabh/smable3/entity/PlaybackState;->FAST_FORWARDING:Lcom/szabh/smable3/entity/PlaybackState;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/PlaybackState;->getMState()B

    move-result v1

    goto :goto_0

    :cond_3
    sget-object v1, Lcom/szabh/smable3/entity/PlaybackState;->PLAYING:Lcom/szabh/smable3/entity/PlaybackState;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/PlaybackState;->getMState()B

    move-result v1

    goto :goto_0

    :cond_4
    sget-object v1, Lcom/szabh/smable3/entity/PlaybackState;->PAUSED:Lcom/szabh/smable3/entity/PlaybackState;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/PlaybackState;->getMState()B

    move-result v1

    :goto_0
    sget-object v3, Lcom/szabh/smable3/entity/PlaybackState;->UNKNOWN:Lcom/szabh/smable3/entity/PlaybackState;

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/PlaybackState;->getMState()B

    move-result v3

    if-eq v1, v3, :cond_6

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lkotlin/jvm/internal/StringCompanionObject;->OXO1:Lkotlin/jvm/internal/StringCompanionObject;

    invoke-virtual {p1}, Landroid/support/v4/media/session/PlaybackStateCompat;->getPlaybackSpeed()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    const-string v5, "%.1f"

    invoke-static {v5, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "format(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v6, 0x2c

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/support/v4/media/session/PlaybackStateCompat;->getPosition()J

    move-result-wide v6

    const/16 p1, 0x3e8

    int-to-long v8, p1

    div-long/2addr v6, v8

    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {v3, v4, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iXiX011([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "MusicController updatePlaybackState -> contents="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XO0O10(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/szabh/smable3/music/MusicController;->lastStateContents:Ljava/util/List;

    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    iget-object v3, p0, Lcom/szabh/smable3/music/MusicController;->lastStateContents:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->clear()V

    iget-object v3, p0, Lcom/szabh/smable3/music/MusicController;->lastStateContents:Ljava/util/List;

    move-object v4, p1

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v3, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    sget-object v3, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    new-instance v4, Lcom/szabh/smable3/entity/BleMusicControl;

    sget-object v5, Lcom/szabh/smable3/entity/MusicEntity;->PLAYER:Lcom/szabh/smable3/entity/MusicEntity;

    sget-object v6, Lcom/szabh/smable3/entity/MusicAttr;->PLAYER_PLAYBACK_INFO:Lcom/szabh/smable3/entity/MusicAttr;

    invoke-direct {v4, v5, v6, p1}, Lcom/szabh/smable3/entity/BleMusicControl;-><init>(Lcom/szabh/smable3/entity/MusicEntity;Lcom/szabh/smable3/entity/MusicAttr;Ljava/util/List;)V

    invoke-virtual {v3, v4}, Lcom/szabh/smable3/component/BaseBleConnector;->updateMusic(Lcom/szabh/smable3/entity/BleMusicControl;)Z

    :cond_5
    iget p1, p0, Lcom/szabh/smable3/music/MusicController;->mLastVolume:I

    const/4 v3, -0x1

    if-ne p1, v3, :cond_6

    invoke-virtual {p0}, Lcom/szabh/smable3/music/MusicController;->updateVolume()V

    :cond_6
    sget-object p1, Lcom/szabh/smable3/entity/PlaybackState;->PAUSED:Lcom/szabh/smable3/entity/PlaybackState;

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/PlaybackState;->getMState()B

    move-result p1

    if-ne v1, p1, :cond_c

    invoke-virtual {p0}, Lcom/szabh/smable3/music/MusicControllerCompat;->getMContext()Landroid/content/Context;

    move-result-object p1

    if-eqz p1, :cond_c

    iget-object p1, p0, Lcom/szabh/smable3/music/MusicController;->mMediaSessionManager:Landroid/media/session/MediaSessionManager;

    const/4 v1, 0x0

    if-eqz p1, :cond_8

    iget-object v3, p0, Lcom/szabh/smable3/music/MusicController;->mNotificationListener:Landroid/content/ComponentName;

    if-nez v3, :cond_7

    const-string v3, "mNotificationListener"

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v3, v1

    :cond_7
    invoke-virtual {p1, v3}, Landroid/media/session/MediaSessionManager;->getActiveSessions(Landroid/content/ComponentName;)Ljava/util/List;

    move-result-object p1

    goto :goto_1

    :cond_8
    move-object p1, v1

    :goto_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "MusicController updatePlaybackState activeMediaControllers -> "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p1, :cond_b

    move-object v4, p1

    check-cast v4, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v4, v6}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_a

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/media/session/MediaController;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6}, Landroid/media/session/MediaController;->getPackageName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, " playbackState="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Landroid/media/session/MediaController;->getPlaybackState()Landroid/media/session/PlaybackState;

    move-result-object v6

    if-eqz v6, :cond_9

    invoke-virtual {v6}, Landroid/media/session/PlaybackState;->getState()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    goto :goto_3

    :cond_9
    move-object v6, v1

    :goto_3
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_a
    move-object v1, v5

    :cond_b
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XO0O10(Ljava/lang/String;)V

    invoke-direct {p0, p1, v2}, Lcom/szabh/smable3/music/MusicController;->autoSwitchActiveController(Ljava/util/List;Z)V

    :cond_c
    :goto_4
    return-void
.end method

.method public updateVolume()V
    .locals 6

    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lcom/szabh/smable3/music/MusicControllerCompat;->getStreamVolume(I)I

    move-result v1

    invoke-virtual {p0, v0}, Lcom/szabh/smable3/music/MusicControllerCompat;->getStreamMaxVolume(I)I

    move-result v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/szabh/smable3/music/MusicController;->mLastVolumeTime:J

    sub-long/2addr v2, v4

    const-wide/16 v4, 0x96

    cmp-long v2, v2, v4

    if-gtz v2, :cond_1

    if-eqz v1, :cond_0

    if-eq v1, v0, :cond_0

    goto :goto_0

    :cond_0
    iget v2, p0, Lcom/szabh/smable3/music/MusicController;->mLastVolume:I

    if-ne v1, v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/szabh/smable3/music/MusicController;->mLastVolumeTime:J

    int-to-float v2, v1

    int-to-float v0, v0

    div-float/2addr v2, v0

    invoke-virtual {p0, v2}, Lcom/szabh/smable3/music/MusicController;->keepTwoDecimal(F)Ljava/lang/String;

    move-result-object v0

    sget-object v2, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    new-instance v3, Lcom/szabh/smable3/entity/BleMusicControl;

    sget-object v4, Lcom/szabh/smable3/entity/MusicEntity;->PLAYER:Lcom/szabh/smable3/entity/MusicEntity;

    sget-object v5, Lcom/szabh/smable3/entity/MusicAttr;->PLAYER_VOLUME:Lcom/szabh/smable3/entity/MusicAttr;

    invoke-direct {v3, v4, v5, v0}, Lcom/szabh/smable3/entity/BleMusicControl;-><init>(Lcom/szabh/smable3/entity/MusicEntity;Lcom/szabh/smable3/entity/MusicAttr;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lcom/szabh/smable3/component/BaseBleConnector;->updateMusic(Lcom/szabh/smable3/entity/BleMusicControl;)Z

    move-result v2

    if-eqz v2, :cond_2

    sget-object v2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "updateVolume -> mLastVolume="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, p0, Lcom/szabh/smable3/music/MusicController;->mLastVolume:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " , curVolume="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " , value="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iput v1, p0, Lcom/szabh/smable3/music/MusicController;->mLastVolume:I

    :cond_2
    :goto_0
    return-void
.end method
