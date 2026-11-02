.class public Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$OnListener;,
        Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$MyHandler;,
        Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;
    }
.end annotation


# static fields
.field private static final CMD_WRITE:I = 0x1

.field private static final CMD_WRITE32:I = 0x2

.field private static final TAG:Ljava/lang/String; = "PcmPlayer"


# instance fields
.field private isPlayingFromWrite:Z

.field private mAudioFocusGranted:Z

.field private final mAudioFocusListener:Landroid/media/AudioManager$OnAudioFocusChangeListener;

.field private mAudioManager:Landroid/media/AudioManager;

.field private mAudioTrack:Landroid/media/AudioTrack;

.field private mBufferSize:I

.field private mFocusRequest:Landroid/media/AudioFocusRequest;

.field private mHandler:Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$MyHandler;

.field private mOnListener:Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$OnListener;

.field private mPlayPosition:I

.field private mThread:Landroid/os/HandlerThread;

.field private mTimeoutHandler:Landroid/os/Handler;

.field private mWriteTimeoutRunnable:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$OnListener;)V
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "listener"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mBufferSize:I

    iput-boolean v0, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mAudioFocusGranted:Z

    iput-boolean v0, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->isPlayingFromWrite:Z

    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v1, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mTimeoutHandler:Landroid/os/Handler;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/dq1;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/dq1;-><init>(Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;)V

    iput-object v1, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mWriteTimeoutRunnable:Ljava/lang/Runnable;

    iput v0, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mPlayPosition:I

    new-instance v0, Lcom/android/mltcode/paycertificationapi/eq1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/eq1;-><init>(Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;)V

    iput-object v0, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mAudioFocusListener:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    iput-object p1, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mOnListener:Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$OnListener;

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object p1

    const-string v0, "audio"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/media/AudioManager;

    iput-object p1, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mAudioManager:Landroid/media/AudioManager;

    new-instance p1, Landroid/os/HandlerThread;

    const-string v0, "pcmplayer"

    invoke-direct {p1, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mThread:Landroid/os/HandlerThread;

    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    new-instance p1, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$MyHandler;

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mThread:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, p0, v0}, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$MyHandler;-><init>(Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;Landroid/os/Looper;)V

    iput-object p1, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mHandler:Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$MyHandler;

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;I)V
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, -0x3

    const-string v1, "PcmPlayer"

    if-eq p1, v0, :cond_3

    const/4 v0, -0x2

    if-eq p1, v0, :cond_2

    const/4 v0, -0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, "Audio focus gained"

    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mAudioTrack:Landroid/media/AudioTrack;

    if-eqz p1, :cond_4

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, Landroid/media/AudioTrack;->setVolume(F)I

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->play()V

    return-void

    :cond_1
    const-string p1, "Audio focus lost permanently"

    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->stop()V

    invoke-direct {p0}, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->abandonAudioFocus()V

    return-void

    :cond_2
    const-string p1, "Audio focus lost temporarily"

    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->pause()V

    return-void

    :cond_3
    const-string p1, "Audio focus lost - should duck"

    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p0, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mAudioTrack:Landroid/media/AudioTrack;

    if-eqz p0, :cond_4

    const p1, 0x3e4ccccd    # 0.2f

    invoke-virtual {p0, p1}, Landroid/media/AudioTrack;->setVolume(F)I

    :cond_4
    :goto_0
    return-void
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->handleWriteTimeout()V

    return-void
.end method

.method public static bridge synthetic XO0O10(Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mBufferSize:I

    return p0
.end method

.method private abandonAudioFocus()V
    .locals 2

    iget-boolean v0, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mAudioFocusGranted:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mFocusRequest:Landroid/media/AudioFocusRequest;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mAudioManager:Landroid/media/AudioManager;

    invoke-virtual {v1, v0}, Landroid/media/AudioManager;->abandonAudioFocusRequest(Landroid/media/AudioFocusRequest;)I

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mAudioManager:Landroid/media/AudioManager;

    iget-object v1, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mAudioFocusListener:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->abandonAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;)I

    :goto_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mAudioFocusGranted:Z

    return-void
.end method

.method private handleWriteTimeout()V
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->isPlayingFromWrite:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->isPlayingFinished()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->stop()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->isPlayingFromWrite:Z

    :cond_0
    return-void
.end method

.method public static bridge synthetic iO(Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;)Landroid/media/AudioTrack;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mAudioTrack:Landroid/media/AudioTrack;

    return-object p0
.end method

.method private isPlayingFinished()Ljava/lang/Boolean;
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mAudioTrack:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlaybackHeadPosition()I

    move-result v0

    iget v1, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mPlayPosition:I

    if-eq v1, v0, :cond_0

    iput v0, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mPlayPosition:I

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mTimeoutHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mWriteTimeoutRunnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mTimeoutHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mWriteTimeoutRunnable:Ljava/lang/Runnable;

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method private maybeStartPlayAndResetTimeout()V
    .locals 4

    iget-boolean v0, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->isPlayingFromWrite:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->play()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->isPlayingFromWrite:Z

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mTimeoutHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mWriteTimeoutRunnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mTimeoutHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mWriteTimeoutRunnable:Ljava/lang/Runnable;

    const-wide/16 v2, 0x5dc

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private requestAudioFocus()Z
    .locals 4

    iget-boolean v0, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mAudioFocusGranted:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    new-instance v0, Landroid/media/AudioFocusRequest$Builder;

    invoke-direct {v0, v1}, Landroid/media/AudioFocusRequest$Builder;-><init>(I)V

    new-instance v2, Landroid/media/AudioAttributes$Builder;

    invoke-direct {v2}, Landroid/media/AudioAttributes$Builder;-><init>()V

    invoke-virtual {v2, v1}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v2

    const/4 v3, 0x2

    invoke-virtual {v2, v3}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v2

    invoke-virtual {v2}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/media/AudioFocusRequest$Builder;->setAudioAttributes(Landroid/media/AudioAttributes;)Landroid/media/AudioFocusRequest$Builder;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/media/AudioFocusRequest$Builder;->setAcceptsDelayedFocusGain(Z)Landroid/media/AudioFocusRequest$Builder;

    move-result-object v0

    iget-object v2, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mAudioFocusListener:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    invoke-virtual {v0, v2}, Landroid/media/AudioFocusRequest$Builder;->setOnAudioFocusChangeListener(Landroid/media/AudioManager$OnAudioFocusChangeListener;)Landroid/media/AudioFocusRequest$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/AudioFocusRequest$Builder;->build()Landroid/media/AudioFocusRequest;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mFocusRequest:Landroid/media/AudioFocusRequest;

    iget-object v2, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mAudioManager:Landroid/media/AudioManager;

    invoke-virtual {v2, v0}, Landroid/media/AudioManager;->requestAudioFocus(Landroid/media/AudioFocusRequest;)I

    move-result v0

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    iput-boolean v1, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mAudioFocusGranted:Z

    return v1
.end method


# virtual methods
.method public getBufferSize()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mBufferSize:I

    return v0
.end method

.method public getFormat()I
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mAudioTrack:Landroid/media/AudioTrack;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getAudioFormat()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getPlayState()I
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mAudioTrack:Landroid/media/AudioTrack;

    if-nez v0, :cond_0

    sget-object v0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;->stopped:Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    return v0

    :cond_0
    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    sget-object v0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;->stopped:Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    return v0

    :cond_1
    sget-object v0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;->playing:Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    return v0

    :cond_2
    sget-object v0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;->paused:Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    return v0
.end method

.method public init(III)V
    .locals 7
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10,
            0x10,
            0x10
        }
        names = {
            "channelConfig",
            "sampleRate",
            "format"
        }
    .end annotation

    invoke-static {p2, p1, p3}, Landroid/media/AudioTrack;->getMinBufferSize(III)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mBufferSize:I

    new-instance v1, Landroid/media/AudioTrack;

    new-instance v0, Landroid/media/AudioAttributes$Builder;

    invoke-direct {v0}, Landroid/media/AudioAttributes$Builder;-><init>()V

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v0

    const/4 v2, 0x2

    invoke-virtual {v0, v2}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    move-result-object v2

    new-instance v0, Landroid/media/AudioFormat$Builder;

    invoke-direct {v0}, Landroid/media/AudioFormat$Builder;-><init>()V

    invoke-virtual {v0, p1}, Landroid/media/AudioFormat$Builder;->setChannelMask(I)Landroid/media/AudioFormat$Builder;

    move-result-object v0

    invoke-virtual {v0, p3}, Landroid/media/AudioFormat$Builder;->setEncoding(I)Landroid/media/AudioFormat$Builder;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/media/AudioFormat$Builder;->setSampleRate(I)Landroid/media/AudioFormat$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/AudioFormat$Builder;->build()Landroid/media/AudioFormat;

    move-result-object v3

    iget v4, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mBufferSize:I

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v6}, Landroid/media/AudioTrack;-><init>(Landroid/media/AudioAttributes;Landroid/media/AudioFormat;III)V

    iput-object v1, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mAudioTrack:Landroid/media/AudioTrack;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "init() channel:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", sampleRate:"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", format:"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "PcmPlayer"

    invoke-static {p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public pause()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mAudioTrack:Landroid/media/AudioTrack;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/media/AudioTrack;->pause()V

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mOnListener:Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$OnListener;

    sget-object v1, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;->paused:Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;

    invoke-interface {v0, v1}, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$OnListener;->onPlayStateChanged(Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;)V

    :cond_0
    return-void
.end method

.method public play()V
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->requestAudioFocus()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mAudioTrack:Landroid/media/AudioTrack;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/media/AudioTrack;->play()V

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mOnListener:Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$OnListener;

    sget-object v1, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;->playing:Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;

    invoke-interface {v0, v1}, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$OnListener;->onPlayStateChanged(Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;)V

    :cond_0
    return-void
.end method

.method public release()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mTimeoutHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mWriteTimeoutRunnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->stop()V

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mAudioTrack:Landroid/media/AudioTrack;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/media/AudioTrack;->release()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mAudioTrack:Landroid/media/AudioTrack;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mThread:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quitSafely()Z

    return-void
.end method

.method public setVolume(D)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "gain"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mAudioTrack:Landroid/media/AudioTrack;

    if-eqz v0, :cond_0

    double-to-float p1, p1

    invoke-virtual {v0, p1}, Landroid/media/AudioTrack;->setVolume(F)I

    :cond_0
    return-void
.end method

.method public stop()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mAudioTrack:Landroid/media/AudioTrack;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/media/AudioTrack;->stop()V

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mOnListener:Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$OnListener;

    sget-object v1, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;->stopped:Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;

    invoke-interface {v0, v1}, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$OnListener;->onPlayStateChanged(Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;)V

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->abandonAudioFocus()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mPlayPosition:I

    return-void
.end method

.method public write([B)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "data"
        }
    .end annotation

    .line 1
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    const/4 v1, 0x1

    .line 2
    iput v1, v0, Landroid/os/Message;->what:I

    .line 3
    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 4
    iget-object p1, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mHandler:Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$MyHandler;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 5
    invoke-direct {p0}, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->maybeStartPlayAndResetTimeout()V

    return-void
.end method

.method public write([F)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "data"
        }
    .end annotation

    .line 6
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    const/4 v1, 0x2

    .line 7
    iput v1, v0, Landroid/os/Message;->what:I

    .line 8
    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 9
    iget-object p1, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->mHandler:Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$MyHandler;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 10
    invoke-direct {p0}, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->maybeStartPlayAndResetTimeout()V

    return-void
.end method
