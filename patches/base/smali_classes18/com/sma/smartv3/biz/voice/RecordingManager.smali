.class public final Lcom/sma/smartv3/biz/voice/RecordingManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;,
        Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;,
        Lcom/sma/smartv3/biz/voice/RecordingManager$ScoStateReceiver;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRecordingManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordingManager.kt\ncom/sma/smartv3/biz/voice/RecordingManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,521:1\n1#2:522\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRecordingManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordingManager.kt\ncom/sma/smartv3/biz/voice/RecordingManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,521:1\n1#2:522\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static volatile instance:Lcom/sma/smartv3/biz/voice/RecordingManager;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# instance fields
.field private final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private audioManager:Landroid/media/AudioManager;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private isRecording:Z

.field private isStartTimers:Z

.field private mAudioRecord:Landroid/media/AudioRecord;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mBufferSize:I

.field private final mHandler:Landroid/os/Handler;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mIsStream:Z

.field private final mTimerTask:Lcom/sma/smartv3/biz/voice/RecordingManager$mTimerTask$1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mTipItem:Landroidx/media3/common/MediaItem;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mTipPlayer$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private playEnded:Z

.field private player:Landroidx/media3/exoplayer/ExoPlayer;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private recordingCallback:Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    monitor-enter v0

    :try_start_0
    new-instance v1, Lcom/sma/smartv3/biz/voice/RecordingManager;

    invoke-direct {v1}, Lcom/sma/smartv3/biz/voice/RecordingManager;-><init>()V

    sput-object v1, Lcom/sma/smartv3/biz/voice/RecordingManager;->instance:Lcom/sma/smartv3/biz/voice/RecordingManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    sput-object v1, Lcom/sma/smartv3/biz/voice/RecordingManager;->instance:Lcom/sma/smartv3/biz/voice/RecordingManager;

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "RecordingManager"

    iput-object v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->TAG:Ljava/lang/String;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->mHandler:Landroid/os/Handler;

    new-instance v0, Landroidx/media3/common/MediaItem$Builder;

    invoke-direct {v0}, Landroidx/media3/common/MediaItem$Builder;-><init>()V

    const-string v1, "file:///android_asset/voice_start_audio.mp3"

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/media3/common/MediaItem$Builder;->setUri(Landroid/net/Uri;)Landroidx/media3/common/MediaItem$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/media3/common/MediaItem$Builder;->build()Landroidx/media3/common/MediaItem;

    move-result-object v0

    const-string v1, "build(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->mTipItem:Landroidx/media3/common/MediaItem;

    new-instance v0, Lcom/sma/smartv3/biz/voice/RecordingManager$mTimerTask$1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/biz/voice/RecordingManager$mTimerTask$1;-><init>(Lcom/sma/smartv3/biz/voice/RecordingManager;)V

    iput-object v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->mTimerTask:Lcom/sma/smartv3/biz/voice/RecordingManager$mTimerTask$1;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->playEnded:Z

    new-instance v0, Lcom/android/mltcode/paycertificationapi/tf3;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/tf3;-><init>(Lcom/sma/smartv3/biz/voice/RecordingManager;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->mTipPlayer$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic IiI10X(Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/biz/voice/RecordingManager;->recordPermission$lambda$0(Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O00(Lcom/sma/smartv3/biz/voice/RecordingManager;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/biz/voice/RecordingManager;->playTip$lambda$0(Lcom/sma/smartv3/biz/voice/RecordingManager;)V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/biz/voice/RecordingManager;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/biz/voice/RecordingManager;->playStartTipVideo$lambda$0(Lcom/sma/smartv3/biz/voice/RecordingManager;)V

    return-void
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/biz/voice/RecordingManager;)Landroidx/media3/exoplayer/ExoPlayer;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/biz/voice/RecordingManager;->mTipPlayer_delegate$lambda$0(Lcom/sma/smartv3/biz/voice/RecordingManager;)Landroidx/media3/exoplayer/ExoPlayer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XO0O10(Lkotlin/jvm/internal/Ref$IntRef;Lcom/sma/smartv3/biz/voice/RecordingManager;Lkotlin/jvm/internal/Ref$BooleanRef;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/biz/voice/RecordingManager;->recordAudio$lambda$0(Lkotlin/jvm/internal/Ref$IntRef;Lcom/sma/smartv3/biz/voice/RecordingManager;Lkotlin/jvm/internal/Ref$BooleanRef;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$cancelTimer(Lcom/sma/smartv3/biz/voice/RecordingManager;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/biz/voice/RecordingManager;->cancelTimer()V

    return-void
.end method

.method public static final synthetic access$getInstance$cp()Lcom/sma/smartv3/biz/voice/RecordingManager;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/biz/voice/RecordingManager;->instance:Lcom/sma/smartv3/biz/voice/RecordingManager;

    return-object v0
.end method

.method public static final synthetic access$getRecordingCallback$p(Lcom/sma/smartv3/biz/voice/RecordingManager;)Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->recordingCallback:Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;

    return-object p0
.end method

.method public static final synthetic access$getTAG$p(Lcom/sma/smartv3/biz/voice/RecordingManager;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$setInstance$cp(Lcom/sma/smartv3/biz/voice/RecordingManager;)V
    .locals 0

    sput-object p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->instance:Lcom/sma/smartv3/biz/voice/RecordingManager;

    return-void
.end method

.method private final adjustSystemVolume(I)V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->audioManager:Landroid/media/AudioManager;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v0

    const-string v1, "audio"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.media.AudioManager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/media/AudioManager;

    iput-object v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->audioManager:Landroid/media/AudioManager;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->audioManager:Landroid/media/AudioManager;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I

    move-result v0

    mul-int/2addr p1, v0

    div-int/lit8 p1, p1, 0x64

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->audioManager:Landroid/media/AudioManager;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/media/AudioManager;->setStreamVolume(III)V

    return-void
.end method

.method private final cancelTimer()V
    .locals 2

    iget-boolean v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->isStartTimers:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->isStartTimers:Z

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->mTimerTask:Lcom/sma/smartv3/biz/voice/RecordingManager$mTimerTask$1;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method private final getMTipPlayer()Landroidx/media3/exoplayer/ExoPlayer;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->mTipPlayer$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/media3/exoplayer/ExoPlayer;

    return-object v0
.end method

.method public static synthetic iO(Lcom/sma/smartv3/biz/voice/RecordingManager;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/biz/voice/RecordingManager;->recordAudio$lambda$1(Lcom/sma/smartv3/biz/voice/RecordingManager;)V

    return-void
.end method

.method private final initialRecorder()V
    .locals 7
    .annotation build Landroidx/annotation/RequiresPermission;
        value = "android.permission.RECORD_AUDIO"
    .end annotation

    const/16 v0, 0x10

    const/4 v1, 0x2

    const/16 v2, 0x3e80

    invoke-static {v2, v0, v1}, Landroid/media/AudioRecord;->getMinBufferSize(III)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->mBufferSize:I

    new-instance v1, Landroid/media/AudioRecord;

    const/4 v5, 0x2

    iget v6, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->mBufferSize:I

    const/4 v2, 0x0

    const/16 v3, 0x3e80

    const/16 v4, 0x10

    invoke-direct/range {v1 .. v6}, Landroid/media/AudioRecord;-><init>(IIIII)V

    iput-object v1, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->mAudioRecord:Landroid/media/AudioRecord;

    return-void
.end method

.method private static final mTipPlayer_delegate$lambda$0(Lcom/sma/smartv3/biz/voice/RecordingManager;)Landroidx/media3/exoplayer/ExoPlayer;
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->player:Landroidx/media3/exoplayer/ExoPlayer;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/media3/exoplayer/ExoPlayer$Builder;

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/media3/exoplayer/ExoPlayer$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Landroidx/media3/exoplayer/ExoPlayer$Builder;->build()Landroidx/media3/exoplayer/ExoPlayer;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->player:Landroidx/media3/exoplayer/ExoPlayer;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->player:Landroidx/media3/exoplayer/ExoPlayer;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->mTipItem:Landroidx/media3/common/MediaItem;

    invoke-interface {v0, v1}, Landroidx/media3/common/Player;->setMediaItem(Landroidx/media3/common/MediaItem;)V

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->player:Landroidx/media3/exoplayer/ExoPlayer;

    if-eqz v0, :cond_2

    new-instance v1, Landroidx/media3/common/PlaybackParameters;

    const/high16 v2, 0x40000000    # 2.0f

    invoke-direct {v1, v2}, Landroidx/media3/common/PlaybackParameters;-><init>(F)V

    invoke-interface {v0, v1}, Landroidx/media3/common/Player;->setPlaybackParameters(Landroidx/media3/common/PlaybackParameters;)V

    :cond_2
    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->player:Landroidx/media3/exoplayer/ExoPlayer;

    if-eqz v0, :cond_3

    new-instance v1, Lcom/sma/smartv3/biz/voice/RecordingManager$mTipPlayer$2$1;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/biz/voice/RecordingManager$mTipPlayer$2$1;-><init>(Lcom/sma/smartv3/biz/voice/RecordingManager;)V

    invoke-interface {v0, v1}, Landroidx/media3/common/Player;->addListener(Landroidx/media3/common/Player$Listener;)V

    :cond_3
    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->player:Landroidx/media3/exoplayer/ExoPlayer;

    if-eqz v0, :cond_4

    invoke-interface {v0}, Landroidx/media3/common/Player;->prepare()V

    :cond_4
    iget-object p0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->player:Landroidx/media3/exoplayer/ExoPlayer;

    return-object p0
.end method

.method private static final playStartTipVideo$lambda$0(Lcom/sma/smartv3/biz/voice/RecordingManager;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/RecordingManager;->playTip()V

    return-void
.end method

.method private static final playTip$lambda$0(Lcom/sma/smartv3/biz/voice/RecordingManager;)V
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/biz/voice/RecordingManager;->getMTipPlayer()Landroidx/media3/exoplayer/ExoPlayer;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroidx/media3/common/Player;->isPlaying()Z

    move-result v0

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/biz/voice/RecordingManager;->getMTipPlayer()Landroidx/media3/exoplayer/ExoPlayer;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Landroidx/media3/common/Player;->getPlaybackState()I

    move-result v0

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lcom/sma/smartv3/biz/voice/RecordingManager;->getMTipPlayer()Landroidx/media3/exoplayer/ExoPlayer;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-interface {v0}, Landroidx/media3/common/Player;->getPlaybackState()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_3

    :goto_0
    invoke-direct {p0}, Lcom/sma/smartv3/biz/voice/RecordingManager;->getMTipPlayer()Landroidx/media3/exoplayer/ExoPlayer;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->mTipItem:Landroidx/media3/common/MediaItem;

    invoke-interface {v0, v1}, Landroidx/media3/common/Player;->setMediaItem(Landroidx/media3/common/MediaItem;)V

    :cond_2
    invoke-direct {p0}, Lcom/sma/smartv3/biz/voice/RecordingManager;->getMTipPlayer()Landroidx/media3/exoplayer/ExoPlayer;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-interface {v0}, Landroidx/media3/common/Player;->prepare()V

    :cond_3
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->playEnded:Z

    invoke-direct {p0}, Lcom/sma/smartv3/biz/voice/RecordingManager;->getMTipPlayer()Landroidx/media3/exoplayer/ExoPlayer;

    move-result-object p0

    if-eqz p0, :cond_4

    invoke-interface {p0}, Landroidx/media3/common/Player;->play()V

    :cond_4
    return-void
.end method

.method public static synthetic realTimeASRend$default(Lcom/sma/smartv3/biz/voice/RecordingManager;IIILjava/lang/Object;)V
    .locals 1

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_1

    sget-object p1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    const/4 p4, 0x0

    const/4 v0, 0x1

    invoke-static {p1, p4, v0, p4}, Lcom/android/mltcode/paycertificationapi/q62;->OiO0IOX(Lcom/android/mltcode/paycertificationapi/q62;Lcom/szabh/smable3/entity/BleDeviceInfo;ILjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x384

    goto :goto_0

    :cond_0
    const/16 p1, 0x2710

    :cond_1
    :goto_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_2

    iget p2, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->mBufferSize:I

    :cond_2
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/biz/voice/RecordingManager;->realTimeASRend(II)V

    return-void
.end method

.method public static synthetic realTimeASRing$default(Lcom/sma/smartv3/biz/voice/RecordingManager;[BIIILjava/lang/Object;)V
    .locals 1

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    sget-object p2, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    const/4 p5, 0x1

    const/4 v0, 0x0

    invoke-static {p2, v0, p5, v0}, Lcom/android/mltcode/paycertificationapi/q62;->OiO0IOX(Lcom/android/mltcode/paycertificationapi/q62;Lcom/szabh/smable3/entity/BleDeviceInfo;ILjava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/16 p2, 0x384

    goto :goto_0

    :cond_0
    const/16 p2, 0x2710

    :cond_1
    :goto_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget p3, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->mBufferSize:I

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/biz/voice/RecordingManager;->realTimeASRing([BII)V

    return-void
.end method

.method private static final recordAudio$lambda$0(Lkotlin/jvm/internal/Ref$IntRef;Lcom/sma/smartv3/biz/voice/RecordingManager;Lkotlin/jvm/internal/Ref$BooleanRef;)Lkotlin/Unit;
    .locals 13

    const-string v0, " recording...  isRecording = "

    sget-object v1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v1, v2, v3, v2}, Lcom/android/mltcode/paycertificationapi/q62;->OiO0IOX(Lcom/android/mltcode/paycertificationapi/q62;Lcom/szabh/smable3/entity/BleDeviceInfo;ILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x384

    iput v1, p0, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/RecordingManager;->playStartTipVideo()V

    :cond_0
    const/4 v1, 0x0

    :try_start_0
    iget-object v4, p1, Lcom/sma/smartv3/biz/voice/RecordingManager;->mAudioRecord:Landroid/media/AudioRecord;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v4, :cond_1

    :try_start_1
    invoke-virtual {v4}, Landroid/media/AudioRecord;->startRecording()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto/16 :goto_8

    :catch_0
    move-exception v0

    move-object p0, v0

    move-object v6, p1

    goto/16 :goto_6

    :cond_1
    :goto_0
    :try_start_2
    iget-object v4, p1, Lcom/sma/smartv3/biz/voice/RecordingManager;->recordingCallback:Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v4, :cond_2

    :try_start_3
    invoke-interface {v4}, Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;->onStartRecording()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_2
    :try_start_4
    new-instance v4, Ljava/io/FileOutputStream;

    sget-object v5, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    invoke-virtual {v5}, Lcom/sma/smartv3/biz/voice/VoiceManager;->getMPcmFile()Ljava/io/File;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    iget v5, p1, Lcom/sma/smartv3/biz/voice/RecordingManager;->mBufferSize:I

    new-array v7, v5, [B

    invoke-static {p1, v2, v3, v2}, Lcom/sma/smartv3/biz/voice/RecordingManager;->startRealTimeASR$default(Lcom/sma/smartv3/biz/voice/RecordingManager;Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;ILjava/lang/Object;)V

    sget-object v6, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v8, p1, Lcom/sma/smartv3/biz/voice/RecordingManager;->TAG:Ljava/lang/String;

    iget-boolean v9, p1, Lcom/sma/smartv3/biz/voice/RecordingManager;->isRecording:Z

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    :goto_1
    iget-boolean v6, p1, Lcom/sma/smartv3/biz/voice/RecordingManager;->isRecording:Z

    if-eqz v6, :cond_4

    iget-object v6, p1, Lcom/sma/smartv3/biz/voice/RecordingManager;->mAudioRecord:Landroid/media/AudioRecord;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    if-eqz v6, :cond_3

    :try_start_6
    invoke-virtual {v6, v7, v1, v5}, Landroid/media/AudioRecord;->read([BII)I
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object p0, v0

    move-object v2, v4

    goto/16 :goto_8

    :catch_1
    move-exception v0

    move-object p0, v0

    move-object v6, p1

    :goto_2
    move-object v2, v4

    goto/16 :goto_6

    :cond_3
    :goto_3
    :try_start_7
    invoke-virtual {v4, v7}, Ljava/io/FileOutputStream;->write([B)V

    invoke-virtual {v4}, Ljava/io/OutputStream;->flush()V

    iget v8, p0, Lkotlin/jvm/internal/Ref$IntRef;->element:I
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/4 v9, 0x0

    move-object v6, p1

    :try_start_8
    invoke-static/range {v6 .. v11}, Lcom/sma/smartv3/biz/voice/RecordingManager;->realTimeASRing$default(Lcom/sma/smartv3/biz/voice/RecordingManager;[BIIILjava/lang/Object;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v8, v6, Lcom/sma/smartv3/biz/voice/RecordingManager;->TAG:Ljava/lang/String;

    iget-boolean v9, v6, Lcom/sma/smartv3/biz/voice/RecordingManager;->isRecording:Z

    iget v10, v6, Lcom/sma/smartv3/biz/voice/RecordingManager;->mBufferSize:I

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v8, " bytes = "

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v8, " mBufferSize= "

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p1, v8}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    move-object p1, v6

    goto :goto_1

    :catch_2
    move-exception v0

    :goto_4
    move-object p0, v0

    goto :goto_2

    :catch_3
    move-exception v0

    move-object v6, p1

    goto :goto_4

    :cond_4
    move-object v6, p1

    iget-object p1, v6, Lcom/sma/smartv3/biz/voice/RecordingManager;->mAudioRecord:Landroid/media/AudioRecord;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Landroid/media/AudioRecord;->stop()V

    :cond_5
    iget-object p1, v6, Lcom/sma/smartv3/biz/voice/RecordingManager;->mAudioRecord:Landroid/media/AudioRecord;

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Landroid/media/AudioRecord;->release()V

    :cond_6
    iget-object p1, v6, Lcom/sma/smartv3/biz/voice/RecordingManager;->recordingCallback:Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;

    if-eqz p1, :cond_7

    invoke-interface {p1}, Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;->onStopRecording()V

    :cond_7
    invoke-virtual {v4}, Ljava/io/OutputStream;->flush()V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-static {p1, v2, v3, v2}, Lcom/android/mltcode/paycertificationapi/q62;->OiO0IOX(Lcom/android/mltcode/paycertificationapi/q62;Lcom/szabh/smable3/entity/BleDeviceInfo;ILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    sget-object v7, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    const-string v8, "voice_end_cycle_audio.mp3"

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->playAssetsFile$default(Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    :cond_8
    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/q62;->OIXOOi()Z

    move-result p1

    if-eqz p1, :cond_9

    iget p0, p0, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    const/4 p1, 0x2

    invoke-static {v6, p0, v1, p1, v2}, Lcom/sma/smartv3/biz/voice/RecordingManager;->realTimeASRend$default(Lcom/sma/smartv3/biz/voice/RecordingManager;IIILjava/lang/Object;)V

    goto :goto_5

    :cond_9
    iget-boolean p0, p2, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    if-eqz p0, :cond_a

    sget-object p0, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->recognition()V

    :cond_a
    :goto_5
    iput-boolean v1, p2, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_2
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V

    goto :goto_7

    :catch_4
    move-exception v0

    move-object v6, p1

    move-object p0, v0

    :goto_6
    :try_start_9
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    if-eqz v2, :cond_b

    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    :cond_b
    if-eqz v2, :cond_c

    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V

    :cond_c
    :goto_7
    iput-boolean v1, v6, Lcom/sma/smartv3/biz/voice/RecordingManager;->isRecording:Z

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0

    :goto_8
    if-eqz v2, :cond_d

    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V

    :cond_d
    throw p0
.end method

.method private static final recordAudio$lambda$1(Lcom/sma/smartv3/biz/voice/RecordingManager;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/RecordingManager;->playTip()V

    return-void
.end method

.method public static synthetic recordPermission$default(Lcom/sma/smartv3/biz/voice/RecordingManager;Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;ZZLjava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_1

    const/4 p3, 0x1

    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/biz/voice/RecordingManager;->recordPermission(Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;ZZLjava/lang/String;)V

    return-void
.end method

.method private static final recordPermission$lambda$0(Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/bestmafen/androidbase/extension/PermissionStatus;->GRANTED:Lcom/bestmafen/androidbase/extension/PermissionStatus;

    if-ne p0, v0, :cond_0

    sget-object p0, Lcom/sma/smartv3/biz/VoiceService;->I1:Lcom/sma/smartv3/biz/VoiceService$OXO1;

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/VoiceService$OXO1;->XIi00iiXO()V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic setOutputStream$default(Lcom/sma/smartv3/biz/voice/RecordingManager;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/voice/RecordingManager;->setOutputStream(Z)V

    return-void
.end method

.method public static synthetic startRealTimeASR$default(Lcom/sma/smartv3/biz/voice/RecordingManager;Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/voice/RecordingManager;->startRealTimeASR(Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;)V

    return-void
.end method

.method private final startTimer()V
    .locals 4

    :try_start_0
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " start timer"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->mTimerTask:Lcom/sma/smartv3/biz/voice/RecordingManager$mTimerTask$1;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->isStartTimers:Z

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->mTimerTask:Lcom/sma/smartv3/biz/voice/RecordingManager$mTimerTask$1;

    const-wide/16 v2, 0x4e20

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method


# virtual methods
.method public final closeBluetooth()V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " closeBluetooth"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->audioManager:Landroid/media/AudioManager;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->setBluetoothScoOn(Z)V

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->audioManager:Landroid/media/AudioManager;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/media/AudioManager;->stopBluetoothSco()V

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->audioManager:Landroid/media/AudioManager;

    if-eqz v0, :cond_2

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->setMode(I)V

    :cond_2
    return-void
.end method

.method public final getPlayEnded()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->playEnded:Z

    return v0
.end method

.method public final init(Landroid/app/Application;)V
    .locals 1
    .param p1    # Landroid/app/Application;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mApp"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->audioManager:Landroid/media/AudioManager;

    if-nez p1, :cond_0

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object p1

    const-string v0, "audio"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type android.media.AudioManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/media/AudioManager;

    iput-object p1, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->audioManager:Landroid/media/AudioManager;

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->player:Landroidx/media3/exoplayer/ExoPlayer;

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/biz/voice/RecordingManager;->getMTipPlayer()Landroidx/media3/exoplayer/ExoPlayer;

    move-result-object p1

    if-nez p1, :cond_3

    :cond_1
    invoke-direct {p0}, Lcom/sma/smartv3/biz/voice/RecordingManager;->getMTipPlayer()Landroidx/media3/exoplayer/ExoPlayer;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->mTipItem:Landroidx/media3/common/MediaItem;

    invoke-interface {p1, v0}, Landroidx/media3/common/Player;->setMediaItem(Landroidx/media3/common/MediaItem;)V

    :cond_2
    invoke-direct {p0}, Lcom/sma/smartv3/biz/voice/RecordingManager;->getMTipPlayer()Landroidx/media3/exoplayer/ExoPlayer;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-interface {p1}, Landroidx/media3/common/Player;->prepare()V

    :cond_3
    return-void
.end method

.method public final isRecording()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->isRecording:Z

    return v0
.end method

.method public final playStartTipVideo()V
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->mHandler:Landroid/os/Handler;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/sf3;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/sf3;-><init>(Lcom/sma/smartv3/biz/voice/RecordingManager;)V

    iget-object v2, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->player:Landroidx/media3/exoplayer/ExoPlayer;

    if-nez v2, :cond_0

    const-wide/16 v2, 0x514

    goto :goto_0

    :cond_0
    const-wide/16 v2, 0x3e8

    :goto_0
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public final playTip()V
    .locals 4

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->TAG:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->playEnded:Z

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " playTip playEnded = "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->playEnded:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->mHandler:Landroid/os/Handler;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/rf3;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/rf3;-><init>(Lcom/sma/smartv3/biz/voice/RecordingManager;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final realTimeASRend(II)V
    .locals 13

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->OIXOOi()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " realTimeSendASRData start query"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v2, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1:Lcom/sma/smartv3/biz/AISparkChainManager;

    const/16 v0, 0xa

    new-array v3, v0, [B

    const/16 v11, 0xd8

    const/4 v12, 0x0

    const/4 v4, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move v8, p1

    move v5, p2

    invoke-static/range {v2 .. v12}, Lcom/sma/smartv3/biz/AISparkChainManager;->X11iII1O1(Lcom/sma/smartv3/biz/AISparkChainManager;[BZILcom/android/mltcode/paycertificationapi/O1XIiIO;ZILjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final realTimeASRing([BII)V
    .locals 12
    .param p1    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "bytes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->OIXOOi()Z

    move-result v0

    if-eqz v0, :cond_9

    sget-object v1, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1:Lcom/sma/smartv3/biz/AISparkChainManager;

    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSupportAIVoiceTranslation()Z

    move-result v2

    const-string v3, "cn"

    if-nez v2, :cond_7

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSupportEarPhoneVoiceTranslation()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_2

    :cond_0
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    const-string v2, "zh"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    :cond_1
    :goto_0
    move-object v8, v3

    goto :goto_3

    :cond_2
    const-string v2, "in"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const-string v0, "id"

    :cond_3
    invoke-static {}, Lcom/sma/smartv3/model/LanguageTranslationKt;->getTranslationLanguageList()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/sma/smartv3/model/LanguageTranslationData;

    invoke-virtual {v4}, Lcom/sma/smartv3/model/LanguageTranslationData;->getRtasrLanguage()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    goto :goto_1

    :cond_5
    const/4 v3, 0x0

    :goto_1
    check-cast v3, Lcom/sma/smartv3/model/LanguageTranslationData;

    if-eqz v3, :cond_6

    invoke-virtual {v3}, Lcom/sma/smartv3/model/LanguageTranslationData;->getAsrLanguage()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_1

    :cond_6
    const-string v3, "en"

    goto :goto_0

    :cond_7
    :goto_2
    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->isActivityData()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->getMicrosoftLanguage()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_8
    sget-object v2, Lcom/szabh/smable3/entity/Languages;->INSTANCE:Lcom/szabh/smable3/entity/Languages;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->getMLanguage()I

    move-result v0

    invoke-virtual {v2, v0, v3}, Lcom/szabh/smable3/entity/Languages;->formatAISparkTargetLang(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/sma/smartv3/model/LanguageTranslationKt;->getTranslationLanguageASRLanguage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :goto_3
    new-instance v5, Lcom/sma/smartv3/biz/voice/RecordingManager$realTimeASRing$1;

    invoke-direct {v5, p0}, Lcom/sma/smartv3/biz/voice/RecordingManager$realTimeASRing$1;-><init>(Lcom/sma/smartv3/biz/voice/RecordingManager;)V

    const/16 v10, 0x92

    const/4 v11, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    move-object v2, p1

    move v7, p2

    move v4, p3

    invoke-static/range {v1 .. v11}, Lcom/sma/smartv3/biz/AISparkChainManager;->X11iII1O1(Lcom/sma/smartv3/biz/AISparkChainManager;[BZILcom/android/mltcode/paycertificationapi/O1XIiIO;ZILjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    :cond_9
    return-void
.end method

.method public final recordAudio()V
    .locals 11

    iget-boolean v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->isRecording:Z

    const/4 v1, 0x1

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->recordingCallback:Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;->onBeforeRecording()V

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/RecordingManager;->setStartBluetooth()V

    sget-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->initSegmentation()V

    iput-boolean v1, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->isRecording:Z

    new-instance v0, Lkotlin/jvm/internal/Ref$BooleanRef;

    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$BooleanRef;-><init>()V

    iput-boolean v1, v0, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    invoke-direct {p0}, Lcom/sma/smartv3/biz/voice/RecordingManager;->initialRecorder()V

    new-instance v1, Lkotlin/jvm/internal/Ref$IntRef;

    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    const/16 v2, 0x2710

    iput v2, v1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    new-instance v8, Lcom/android/mltcode/paycertificationapi/of3;

    invoke-direct {v8, v1, p0, v0}, Lcom/android/mltcode/paycertificationapi/of3;-><init>(Lkotlin/jvm/internal/Ref$IntRef;Lcom/sma/smartv3/biz/voice/RecordingManager;Lkotlin/jvm/internal/Ref$BooleanRef;)V

    const/16 v9, 0x1e

    const/4 v10, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v10}, Lkotlin/concurrent/ThreadsKt;->iO(ZZLjava/lang/ClassLoader;Ljava/lang/String;ILkotlin/jvm/functions/Function0;ILjava/lang/Object;)Ljava/lang/Thread;

    return-void

    :cond_1
    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, Lcom/android/mltcode/paycertificationapi/q62;->OiO0IOX(Lcom/android/mltcode/paycertificationapi/q62;Lcom/szabh/smable3/entity/BleDeviceInfo;ILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->mHandler:Landroid/os/Handler;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/pf3;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/pf3;-><init>(Lcom/sma/smartv3/biz/voice/RecordingManager;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_2
    return-void
.end method

.method public final recordPermission(Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;ZZLjava/lang/String;)V
    .locals 3
    .param p1    # Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " name:"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, "  isOutputStream:"

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p4, "  "

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {v0, p4}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Lcom/sma/smartv3/biz/voice/RecordingManager;->setOutputStream(Z)V

    if-eqz p3, :cond_0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/voice/RecordingManager;->setRecordingCallback(Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;)V

    :cond_0
    const-string p1, "MICROPHONE"

    const-string p2, "android.permission.MODIFY_AUDIO_SETTINGS"

    filled-new-array {p1, p2}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/PermissionUtils;->permission([Ljava/lang/String;)Lcom/blankj/utilcode/util/PermissionUtils;

    move-result-object p1

    const-string p2, "permission(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const p2, 0x7f140f4b

    invoke-static {p2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object p2

    const p3, 0x7f140f4a

    invoke-static {p3}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object p3

    new-instance p4, Lcom/android/mltcode/paycertificationapi/qf3;

    invoke-direct {p4}, Lcom/android/mltcode/paycertificationapi/qf3;-><init>()V

    invoke-static {p1, p2, p3, p4}, Lcom/android/mltcode/paycertificationapi/ds1;->XIi00iiXO(Lcom/blankj/utilcode/util/PermissionUtils;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final registerSCOReceiver(Landroid/app/Application;)V
    .locals 3
    .param p1    # Landroid/app/Application;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mApp"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    const-string v2, "android.media.ACTION_SCO_AUDIO_STATE_UPDATED"

    if-lt v0, v1, :cond_0

    new-instance v0, Lcom/sma/smartv3/biz/voice/RecordingManager$ScoStateReceiver;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/voice/RecordingManager$ScoStateReceiver;-><init>()V

    new-instance v1, Landroid/content/IntentFilter;

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x2

    invoke-static {p1, v0, v1, v2}, Landroidx/core/content/ContextCompat;->registerReceiver(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;

    return-void

    :cond_0
    new-instance v0, Lcom/sma/smartv3/biz/voice/RecordingManager$ScoStateReceiver;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/voice/RecordingManager$ScoStateReceiver;-><init>()V

    new-instance v1, Landroid/content/IntentFilter;

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method

.method public final setOutputStream(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->mIsStream:Z

    return-void
.end method

.method public final setPlayEnded(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->playEnded:Z

    return-void
.end method

.method public final setRecording(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->isRecording:Z

    return-void
.end method

.method public final setRecordingCallback(Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->recordingCallback:Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->recordingCallback:Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;

    :cond_0
    iput-object p1, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->recordingCallback:Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;

    return-void
.end method

.method public final setScoOnOpen()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->audioManager:Landroid/media/AudioManager;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->setBluetoothScoOn(Z)V

    :cond_0
    return-void
.end method

.method public final setStartBluetooth()V
    .locals 10

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->audioManager:Landroid/media/AudioManager;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v0

    const-string v1, "audio"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.media.AudioManager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/media/AudioManager;

    iput-object v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->audioManager:Landroid/media/AudioManager;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->audioManager:Landroid/media/AudioManager;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/media/AudioManager;->isBluetoothScoOn()Z

    move-result v0

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    sget-object v2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v3, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->TAG:Ljava/lang/String;

    sget-object v4, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    invoke-virtual {v4}, Lcom/sma/smartv3/biz/voice/VoiceManager;->isRecordBluetooth()Z

    move-result v5

    iget-object v6, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->audioManager:Landroid/media/AudioManager;

    const/4 v7, 0x0

    if-eqz v6, :cond_2

    invoke-virtual {v6}, Landroid/media/AudioManager;->getMode()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    goto :goto_1

    :cond_2
    move-object v6, v7

    :goto_1
    iget-object v8, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->audioManager:Landroid/media/AudioManager;

    if-eqz v8, :cond_3

    invoke-virtual {v8}, Landroid/media/AudioManager;->isBluetoothScoOn()Z

    move-result v8

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    goto :goto_2

    :cond_3
    move-object v8, v7

    :goto_2
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "  startBluetoothSco isRecordBluetooth = "

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, " , isOn = "

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, ", , mode = "

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, "  , isBluetoothScoOn = "

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {v4}, Lcom/sma/smartv3/biz/voice/VoiceManager;->isRecordBluetooth()Z

    move-result v3

    if-eqz v3, :cond_8

    if-nez v0, :cond_a

    invoke-static {}, Lcom/blankj/utilcode/util/RomUtils;->isMeizu()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->audioManager:Landroid/media/AudioManager;

    if-eqz v0, :cond_5

    const/4 v3, 0x3

    invoke-virtual {v0, v3}, Landroid/media/AudioManager;->setMode(I)V

    goto :goto_3

    :cond_4
    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->audioManager:Landroid/media/AudioManager;

    if-eqz v0, :cond_5

    const/4 v3, 0x2

    invoke-virtual {v0, v3}, Landroid/media/AudioManager;->setMode(I)V

    :cond_5
    :goto_3
    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->audioManager:Landroid/media/AudioManager;

    if-eqz v0, :cond_6

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->setSpeakerphoneOn(Z)V

    :cond_6
    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->audioManager:Landroid/media/AudioManager;

    if-eqz v0, :cond_7

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->setMicrophoneMute(Z)V

    :cond_7
    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->audioManager:Landroid/media/AudioManager;

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Landroid/media/AudioManager;->startBluetoothSco()V

    goto :goto_4

    :cond_8
    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->audioManager:Landroid/media/AudioManager;

    if-eqz v0, :cond_9

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->setMode(I)V

    :cond_9
    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->audioManager:Landroid/media/AudioManager;

    if-eqz v0, :cond_a

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->setBluetoothScoOn(Z)V

    :cond_a
    :goto_4
    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->TAG:Ljava/lang/String;

    iget-object v1, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->audioManager:Landroid/media/AudioManager;

    if-eqz v1, :cond_b

    invoke-virtual {v1}, Landroid/media/AudioManager;->getMode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    :cond_b
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " startBluetoothSco end  mode = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void
.end method

.method public final startRealTimeASR(Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;)V
    .locals 3
    .param p1    # Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/voice/RecordingManager;->setRecordingCallback(Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;)V

    :cond_0
    sget-object p1, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1:Lcom/sma/smartv3/biz/AISparkChainManager;

    const/4 v0, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, v2, v2, v0, v1}, Lcom/sma/smartv3/biz/AISparkChainManager;->XXO(Lcom/sma/smartv3/biz/AISparkChainManager;IZILjava/lang/Object;)V

    return-void
.end method

.method public final startRecord()V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/RecordingManager;->recordAudio()V

    return-void
.end method

.method public final stopRecording()V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " stopRecording"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->isRecording:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager;->isRecording:Z

    :cond_0
    return-void
.end method
