.class public final Lcom/sma/smartv3/biz/voice/VoicePlayer;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final INSTANCE:Lcom/sma/smartv3/biz/voice/VoicePlayer;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static mMediaPlayer:Landroid/media/MediaPlayer;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/biz/voice/VoicePlayer;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/voice/VoicePlayer;-><init>()V

    sput-object v0, Lcom/sma/smartv3/biz/voice/VoicePlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoicePlayer;

    const-string v0, "VoicePlayer"

    sput-object v0, Lcom/sma/smartv3/biz/voice/VoicePlayer;->TAG:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic OXO1(Lkotlin/jvm/functions/Function1;Landroid/media/MediaPlayer;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/biz/voice/VoicePlayer;->play$lambda$0(Lkotlin/jvm/functions/Function1;Landroid/media/MediaPlayer;)V

    return-void
.end method

.method public static synthetic XIi00iiXO(Lkotlin/jvm/functions/Function1;Landroid/media/MediaPlayer;II)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/biz/voice/VoicePlayer;->play$lambda$1(Lkotlin/jvm/functions/Function1;Landroid/media/MediaPlayer;II)Z

    move-result p0

    return p0
.end method

.method public static synthetic play$default(Lcom/sma/smartv3/biz/voice/VoicePlayer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/biz/voice/VoicePlayer;->play(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final play$lambda$0(Lkotlin/jvm/functions/Function1;Landroid/media/MediaPlayer;)V
    .locals 0

    if-eqz p0, :cond_0

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Unit;

    :cond_0
    return-void
.end method

.method private static final play$lambda$1(Lkotlin/jvm/functions/Function1;Landroid/media/MediaPlayer;II)Z
    .locals 0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "\u64ad\u653e\u5931\u8d25 "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    if-eqz p0, :cond_0

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Unit;

    :cond_0
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public final isPlay()Z
    .locals 3

    sget-object v0, Lcom/sma/smartv3/biz/voice/VoicePlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    return v2

    :cond_0
    return v1
.end method

.method public final play(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/biz/voice/VoicePlayer;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " play -> "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    sget-object v0, Lcom/sma/smartv3/biz/voice/VoicePlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    if-nez v0, :cond_0

    new-instance v0, Landroid/media/MediaPlayer;

    invoke-direct {v0}, Landroid/media/MediaPlayer;-><init>()V

    sput-object v0, Lcom/sma/smartv3/biz/voice/VoicePlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoicePlayer;->stop()V

    sget-object v0, Lcom/sma/smartv3/biz/voice/VoicePlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V

    :cond_1
    sget-object v0, Lcom/sma/smartv3/biz/voice/VoicePlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V

    :cond_2
    sget-object p1, Lcom/sma/smartv3/biz/voice/VoicePlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    if-eqz p1, :cond_3

    new-instance v0, Lcom/android/mltcode/paycertificationapi/vj6;

    invoke-direct {v0, p2}, Lcom/android/mltcode/paycertificationapi/vj6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v0}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    :cond_3
    sget-object p1, Lcom/sma/smartv3/biz/voice/VoicePlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    if-eqz p1, :cond_4

    new-instance v0, Lcom/android/mltcode/paycertificationapi/wj6;

    invoke-direct {v0, p2}, Lcom/android/mltcode/paycertificationapi/wj6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v0}, Landroid/media/MediaPlayer;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V

    :cond_4
    sget-object p1, Lcom/sma/smartv3/biz/voice/VoicePlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->prepare()V

    :cond_5
    sget-object p1, Lcom/sma/smartv3/biz/voice/VoicePlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->start()V

    :cond_6
    return-void
.end method

.method public final release()V
    .locals 1

    sget-object v0, Lcom/sma/smartv3/biz/voice/VoicePlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoicePlayer;->stop()V

    sget-object v0, Lcom/sma/smartv3/biz/voice/VoicePlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    :cond_0
    const/4 v0, 0x0

    sput-object v0, Lcom/sma/smartv3/biz/voice/VoicePlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    :cond_1
    return-void
.end method

.method public final stop()V
    .locals 1

    :try_start_0
    sget-object v0, Lcom/sma/smartv3/biz/voice/VoicePlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v0, Lcom/sma/smartv3/biz/voice/VoicePlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_1
    return-void
.end method
