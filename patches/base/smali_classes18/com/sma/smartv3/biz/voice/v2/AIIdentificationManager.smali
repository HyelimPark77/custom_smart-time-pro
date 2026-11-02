.class public final Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$OnIdentificationCallback;
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static isPhoneRecord:Z

.field private static isRealTimeRunning:Z

.field private static isSendResults:Z

.field private static mCompleteText:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static mContentResult:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static mDeviceSelectedAIMode:I

.field private static mFullRunner:Lcom/baidu/ai/speech/realtime/full/connection/Runner;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private static mIdentificationCallback:Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$OnIdentificationCallback;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private static mInputStream:Ljava/io/PipedInputStream;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private static final mOpusFile:Ljava/io/File;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static mOutputStream:Ljava/io/PipedOutputStream;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private static final mPcmFile:Ljava/io/File;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static mProcessComplete:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static final mWavFile:Ljava/io/File;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static final mWebSocketCallBack:Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$mWebSocketCallBack$1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static final microsoftCallBack:Lcom/sma/smartv3/util/MicrosoftSDKManage$iO;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;-><init>()V

    sput-object v0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;

    const-string v0, "AIManagerV2 Identification"

    sput-object v0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->TAG:Ljava/lang/String;

    new-instance v0, Ljava/io/File;

    invoke-static {}, Lcom/blankj/utilcode/util/PathUtils;->getExternalAppDataPath()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/files/record.opus"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->mOpusFile:Ljava/io/File;

    new-instance v0, Ljava/io/File;

    invoke-static {}, Lcom/blankj/utilcode/util/PathUtils;->getExternalAppDataPath()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/files/record.pcm"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->mPcmFile:Ljava/io/File;

    new-instance v0, Ljava/io/File;

    invoke-static {}, Lcom/blankj/utilcode/util/PathUtils;->getExternalAppDataPath()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/files/record.wav"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->mWavFile:Ljava/io/File;

    const-string v0, ""

    sput-object v0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->mCompleteText:Ljava/lang/String;

    const/4 v1, -0x1

    sput v1, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->mDeviceSelectedAIMode:I

    sput-object v0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->mContentResult:Ljava/lang/String;

    sput-object v0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->mProcessComplete:Ljava/lang/String;

    new-instance v0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$microsoftCallBack$1;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$microsoftCallBack$1;-><init>()V

    sput-object v0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->microsoftCallBack:Lcom/sma/smartv3/util/MicrosoftSDKManage$iO;

    new-instance v0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$mWebSocketCallBack$1;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$mWebSocketCallBack$1;-><init>()V

    sput-object v0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->mWebSocketCallBack:Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$mWebSocketCallBack$1;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic OXO1(Ljava/io/File;)J
    .locals 2

    invoke-static {p0}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->savePcmFile$lambda$0$0(Ljava/io/File;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static synthetic XIi00iiXO(JJ)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->serviceIdentificationAudio$lambda$0(JJ)V

    return-void
.end method

.method public static synthetic XO0O10()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->savePcmFile$lambda$0()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$getMFullRunner$p()Lcom/baidu/ai/speech/realtime/full/connection/Runner;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->mFullRunner:Lcom/baidu/ai/speech/realtime/full/connection/Runner;

    return-object v0
.end method

.method public static final synthetic access$getMIdentificationCallback$p()Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$OnIdentificationCallback;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->mIdentificationCallback:Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$OnIdentificationCallback;

    return-object v0
.end method

.method public static final synthetic access$getMInputStream$p()Ljava/io/PipedInputStream;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->mInputStream:Ljava/io/PipedInputStream;

    return-object v0
.end method

.method public static final synthetic access$getTAG$p()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic access$isRealTimeRunning$p()Z
    .locals 1

    sget-boolean v0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->isRealTimeRunning:Z

    return v0
.end method

.method public static final synthetic access$pollCheckStop(Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->pollCheckStop()V

    return-void
.end method

.method public static final synthetic access$setMFullRunner$p(Lcom/baidu/ai/speech/realtime/full/connection/Runner;)V
    .locals 0

    sput-object p0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->mFullRunner:Lcom/baidu/ai/speech/realtime/full/connection/Runner;

    return-void
.end method

.method public static final synthetic access$setMInputStream$p(Ljava/io/PipedInputStream;)V
    .locals 0

    sput-object p0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->mInputStream:Ljava/io/PipedInputStream;

    return-void
.end method

.method public static final synthetic access$setMOutputStream$p(Ljava/io/PipedOutputStream;)V
    .locals 0

    sput-object p0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->mOutputStream:Ljava/io/PipedOutputStream;

    return-void
.end method

.method public static final synthetic access$setRealTimeRunning$p(Z)V
    .locals 0

    sput-boolean p0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->isRealTimeRunning:Z

    return-void
.end method

.method public static final synthetic access$stopRealTime(Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->stopRealTime()V

    return-void
.end method

.method public static synthetic iO(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)J
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->savePcmFile$lambda$0$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static synthetic identificationBegins$default(Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;ZLcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$OnIdentificationCallback;ZILcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;ILjava/lang/Object;)V
    .locals 1

    and-int/lit8 p7, p6, 0x1

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_1

    move p3, v0

    :cond_1
    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_2

    const/4 p4, -0x1

    :cond_2
    invoke-virtual/range {p0 .. p5}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->identificationBegins(ZLcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$OnIdentificationCallback;ZILcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;)V

    return-void
.end method

.method private final onWebSocketManagerStart()V
    .locals 2

    sget-object v0, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->sendStartListenMessage(Z)V

    sget-object v1, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->mWebSocketCallBack:Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$mWebSocketCallBack$1;

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->setMOnCallback(Lcom/sma/smartv3/biz/voice/ai/WebSocketManager$OnCallback;)V

    return-void
.end method

.method private final pollCheckStop()V
    .locals 6

    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    new-instance v1, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$pollCheckStop$timerTask$1;

    invoke-direct {v1, v0}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$pollCheckStop$timerTask$1;-><init>(Ljava/util/Timer;)V

    const-wide/16 v2, 0x1f4

    const-wide/16 v4, 0x1f4

    invoke-virtual/range {v0 .. v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    return-void
.end method

.method private final savePcmFile()V
    .locals 8

    new-instance v5, Lcom/android/mltcode/paycertificationapi/iX01;

    invoke-direct {v5}, Lcom/android/mltcode/paycertificationapi/iX01;-><init>()V

    const/16 v6, 0x1f

    const/4 v7, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v7}, Lkotlin/concurrent/ThreadsKt;->iO(ZZLjava/lang/ClassLoader;Ljava/lang/String;ILkotlin/jvm/functions/Function0;ILjava/lang/Object;)Ljava/lang/Thread;

    return-void
.end method

.method private static final savePcmFile$lambda$0()Lkotlin/Unit;
    .locals 8

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->getMSavePcmTime()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_4

    const-wide/16 v1, 0x7d0

    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V

    new-instance v1, Ljava/io/File;

    invoke-static {}, Lcom/blankj/utilcode/util/PathUtils;->getExternalAppDataPath()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/files/save_pcm"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-static {v1}, Lcom/blankj/utilcode/util/FileUtils;->createOrExistsDir(Ljava/io/File;)Z

    :cond_0
    sget-object v2, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/q62;->XOX()Z

    move-result v3

    const-string v4, ".opus"

    const-string v5, "/files/save_pcm/record_"

    if-eqz v3, :cond_1

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/q62;->iX0iiiXi()Z

    move-result v2

    if-eqz v2, :cond_1

    sget-object v2, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    invoke-virtual {v2}, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSupportDevicePhoneVoiceAIChat()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v2}, Lcom/sma/smartv3/biz/voice/VoiceManager;->isVoiceAIIdentify()Z

    move-result v2

    if-nez v2, :cond_1

    new-instance v2, Ljava/io/File;

    invoke-static {}, Lcom/blankj/utilcode/util/PathUtils;->getExternalAppDataPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->getMSavePcmTime()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    sget-object v3, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->mOpusFile:Ljava/io/File;

    invoke-static {v3, v2}, Lcom/blankj/utilcode/util/FileUtils;->copy(Ljava/io/File;Ljava/io/File;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->isVoiceAiChatContext()Z

    move-result v2

    if-eqz v2, :cond_2

    new-instance v2, Ljava/io/File;

    invoke-static {}, Lcom/blankj/utilcode/util/PathUtils;->getExternalAppDataPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->getMSavePcmTime()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    sget-object v3, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->mOpusFile:Ljava/io/File;

    invoke-static {v3, v2}, Lcom/blankj/utilcode/util/FileUtils;->copy(Ljava/io/File;Ljava/io/File;)Z

    goto :goto_0

    :cond_2
    new-instance v2, Ljava/io/File;

    invoke-static {}, Lcom/blankj/utilcode/util/PathUtils;->getExternalAppDataPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->getMSavePcmTime()Ljava/lang/String;

    move-result-object v4

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ".pcm"

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    sget-object v3, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->mPcmFile:Ljava/io/File;

    invoke-static {v3, v2}, Lcom/blankj/utilcode/util/FileUtils;->copy(Ljava/io/File;Ljava/io/File;)Z

    :goto_0
    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v1

    if-eqz v1, :cond_3

    new-instance v2, Lcom/android/mltcode/paycertificationapi/X0I1;

    invoke-direct {v2}, Lcom/android/mltcode/paycertificationapi/X0I1;-><init>()V

    new-instance v3, Lcom/android/mltcode/paycertificationapi/I0i0;

    invoke-direct {v3, v2}, Lcom/android/mltcode/paycertificationapi/I0i0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-static {v3}, Ljava/util/Comparator;->comparingLong(Ljava/util/function/ToLongFunction;)Ljava/util/Comparator;

    move-result-object v2

    const-string v3, "comparingLong(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v2}, Lkotlin/collections/ArraysKt___ArraysJvmKt;->O1I([Ljava/lang/Object;Ljava/util/Comparator;)V

    array-length v2, v1

    const/16 v3, 0xa

    if-le v2, v3, :cond_3

    invoke-static {v1}, Lkotlin/collections/ArraysKt___ArraysKt;->IO0([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    :cond_3
    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->setMSavePcmTime(Ljava/lang/String;)V

    :cond_4
    sget-object v0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object v0
.end method

.method private static final savePcmFile$lambda$0$0(Ljava/io/File;)J
    .locals 2

    invoke-virtual {p0}, Ljava/io/File;->lastModified()J

    move-result-wide v0

    return-wide v0
.end method

.method private static final savePcmFile$lambda$0$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)J
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    move-result-wide p0

    return-wide p0
.end method

.method private final serviceIdentificationAudio(Ljava/io/File;Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lcom/sma/smartv3/biz/AIManager;->OXO1:Lcom/sma/smartv3/biz/AIManager;

    sget v1, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->mDeviceSelectedAIMode:I

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/AIManager;->XiOIii1(I)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    const-string v2, "/ai/v2/audio2Text"

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/network/NetWorkUtils;->getBaseUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v3

    const-string v4, "getApp(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, Lcom/sma/smartv3/util/UtilsKt;->IiiXiI0I(Landroid/content/Context;)Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, "zh"

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v3

    iget-object v3, v3, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v3}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v3

    :goto_0
    sget-object v4, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object v5, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->TAG:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " serviceIdentificationAudio -> "

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, "  toLang = "

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " , model = "

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-static {v2}, Lcom/androidnetworking/AndroidNetworking;->upload(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;

    move-result-object v2

    invoke-virtual {v1}, Lcom/sma/smartv3/network/NetWorkUtils;->getHeadersMap()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;->addHeaders(Ljava/util/Map;)Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;

    move-result-object v1

    const-string v2, "model"

    invoke-virtual {v1, v2, v0}, Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;->addQueryParameter(Ljava/lang/String;Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;

    move-result-object v0

    const-string v1, "toLang"

    invoke-virtual {v0, v1, v3}, Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;->addQueryParameter(Ljava/lang/String;Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;

    move-result-object v0

    const-string v1, "audioFile"

    invoke-virtual {v0, v1, p1}, Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;->addMultipartFile(Ljava/lang/String;Ljava/io/File;)Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;

    move-result-object p1

    const-string v0, "serviceIdentificationAudio"

    invoke-virtual {p1, v0}, Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;

    move-result-object p1

    sget-object v0, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {p1, v0}, Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object p1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I0iOXO;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/I0iOXO;-><init>()V

    invoke-virtual {p1, v0}, Lcom/androidnetworking/common/ANRequest;->setUploadProgressListener(Lcom/androidnetworking/interfaces/UploadProgressListener;)Lcom/androidnetworking/common/ANRequest;

    move-result-object p1

    new-instance v0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$serviceIdentificationAudio$2;

    invoke-direct {v0, p2}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$serviceIdentificationAudio$2;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {p1, v0}, Lcom/androidnetworking/common/ANRequest;->getAsJSONObject(Lcom/androidnetworking/interfaces/JSONObjectRequestListener;)V

    return-void
.end method

.method public static synthetic serviceIdentificationAudio$default(Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;Ljava/io/File;Lcom/android/mltcode/paycertificationapi/O1XIiIO;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->serviceIdentificationAudio(Ljava/io/File;Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    return-void
.end method

.method private static final serviceIdentificationAudio$lambda$0(JJ)V
    .locals 0

    return-void
.end method

.method private final serviceIdentify()V
    .locals 5

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->mWavFile:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    :cond_0
    new-instance v1, Lcom/android/mltcode/paycertificationapi/gq1;

    const/16 v2, 0x10

    const/4 v3, 0x2

    const/16 v4, 0x3e80

    invoke-direct {v1, v4, v2, v3}, Lcom/android/mltcode/paycertificationapi/gq1;-><init>(III)V

    sget-object v2, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->mPcmFile:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/android/mltcode/paycertificationapi/gq1;->OXO1(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v1, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;

    new-instance v2, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$serviceIdentify$1$1;

    invoke-direct {v2}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$serviceIdentify$1$1;-><init>()V

    invoke-direct {v1, v0, v2}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->serviceIdentificationAudio(Ljava/io/File;Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    return-void
.end method

.method private final startRealTime()V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->XOX()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-boolean v0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->isRealTimeRunning:Z

    if-eqz v0, :cond_1

    :goto_0
    return-void

    :cond_1
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object v1, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " -> startRealTime"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    new-instance v0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$startRealTime$1;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$startRealTime$1;-><init>()V

    invoke-static {v0}, Lcom/blankj/utilcode/util/ThreadUtils;->executeByIo(Lcom/blankj/utilcode/util/ThreadUtils$Task;)V

    return-void
.end method

.method private final stopRealTime()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    :try_start_0
    sget-object v2, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->mInputStream:Ljava/io/PipedInputStream;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/io/PipedInputStream;->close()V

    goto :goto_0

    :catchall_0
    move-exception v2

    goto :goto_2

    :catch_0
    move-exception v2

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v2, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->mOutputStream:Ljava/io/PipedOutputStream;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/io/PipedOutputStream;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    sput-object v1, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->mInputStream:Ljava/io/PipedInputStream;

    sput-object v1, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->mOutputStream:Ljava/io/PipedOutputStream;

    sput-object v1, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->mFullRunner:Lcom/baidu/ai/speech/realtime/full/connection/Runner;

    sput-boolean v0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->isRealTimeRunning:Z

    return-void

    :goto_1
    :try_start_1
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    sput-object v1, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->mInputStream:Ljava/io/PipedInputStream;

    sput-object v1, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->mOutputStream:Ljava/io/PipedOutputStream;

    sput-object v1, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->mFullRunner:Lcom/baidu/ai/speech/realtime/full/connection/Runner;

    sput-boolean v0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->isRealTimeRunning:Z

    return-void

    :goto_2
    sput-object v1, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->mInputStream:Ljava/io/PipedInputStream;

    sput-object v1, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->mOutputStream:Ljava/io/PipedOutputStream;

    sput-object v1, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->mFullRunner:Lcom/baidu/ai/speech/realtime/full/connection/Runner;

    sput-boolean v0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->isRealTimeRunning:Z

    throw v2
.end method


# virtual methods
.method public final deleteFile()V
    .locals 1

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->mOpusFile:Ljava/io/File;

    invoke-static {v0}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/io/File;)Z

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->mPcmFile:Ljava/io/File;

    invoke-static {v0}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/io/File;)Z

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->mWavFile:Ljava/io/File;

    invoke-static {v0}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/io/File;)Z

    return-void
.end method

.method public final getMCompleteText()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->mCompleteText:Ljava/lang/String;

    return-object v0
.end method

.method public final getMContentResult()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->mContentResult:Ljava/lang/String;

    return-object v0
.end method

.method public final getMDeviceSelectedAIMode()I
    .locals 1

    sget v0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->mDeviceSelectedAIMode:I

    return v0
.end method

.method public final getMProcessComplete()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->mProcessComplete:Ljava/lang/String;

    return-object v0
.end method

.method public final getMicrosoftCallBack()Lcom/sma/smartv3/util/MicrosoftSDKManage$iO;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->microsoftCallBack:Lcom/sma/smartv3/util/MicrosoftSDKManage$iO;

    return-object v0
.end method

.method public final identificationBegins(ZLcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$OnIdentificationCallback;ZILcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;)V
    .locals 11
    .param p2    # Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$OnIdentificationCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p5    # Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    move-object/from16 v1, p5

    const-string v2, "identificationCallback"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "recordingCallBack"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static {v2, v3, v4, v3}, Lcom/android/mltcode/paycertificationapi/q62;->OiO0IOX(Lcom/android/mltcode/paycertificationapi/q62;Lcom/szabh/smable3/entity/BleDeviceInfo;ILjava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    sget-object v3, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {v3}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object v3

    invoke-virtual {v3}, Lcom/sma/smartv3/biz/voice/RecordingManager;->playTip()V

    :cond_0
    sput p4, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->mDeviceSelectedAIMode:I

    sput-boolean p1, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->isPhoneRecord:Z

    const-string p1, ""

    sput-object p1, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->mCompleteText:Ljava/lang/String;

    sget-object p1, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;->getLanguageTranslationData()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object v3

    sget-object v5, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;

    invoke-virtual {v5}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->isTranslation()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;->getToLanguageTranslationData()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/v2/AITranslationManager;->getLanguageTranslationData()Lcom/sma/smartv3/model/LanguageTranslationData;

    move-result-object p1

    :goto_0
    sput-object p2, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->mIdentificationCallback:Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$OnIdentificationCallback;

    sget-boolean p2, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->isPhoneRecord:Z

    const-string v5, " SparkChainAIManage"

    const-string v6, " identification"

    const/4 v7, 0x2

    const-string v8, " MicrosoftSDKManage languageTranslationData="

    const-string v9, " start isPhoneRecord ="

    if-eqz p2, :cond_5

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/q62;->X11I()Z

    move-result p2

    if-eqz p2, :cond_2

    sget-object p2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->TAG:Ljava/lang/String;

    sget-boolean v1, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->isPhoneRecord:Z

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object p2, Lcom/sma/smartv3/util/MicrosoftSDKManage;->O1O:Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;

    invoke-virtual {p2}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v5

    sget-boolean v7, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->isPhoneRecord:Z

    invoke-virtual {v3}, Lcom/sma/smartv3/model/LanguageTranslationData;->getAsrLanguage()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lcom/sma/smartv3/model/LanguageTranslationData;->getTtsViuceName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p1}, Lcom/sma/smartv3/model/LanguageTranslationData;->getAsrLanguage()Ljava/lang/String;

    move-result-object v9

    xor-int/lit8 v10, p3, 0x1

    invoke-virtual/range {v5 .. v10}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->iIX0i(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Z)V

    return-void

    :cond_2
    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/q62;->OIXOOi()Z

    move-result p1

    if-nez p1, :cond_4

    sget p1, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->mDeviceSelectedAIMode:I

    if-ne p1, v7, :cond_3

    goto :goto_1

    :cond_3
    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object v4, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->TAG:Ljava/lang/String;

    sget-boolean p2, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->isPhoneRecord:Z

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->startRealTime()V

    sget-object p1, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object v0

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static/range {v0 .. v6}, Lcom/sma/smartv3/biz/voice/RecordingManager;->recordPermission$default(Lcom/sma/smartv3/biz/voice/RecordingManager;Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;ZZLjava/lang/String;ILjava/lang/Object;)V

    return-void

    :cond_4
    :goto_1
    sget-object p1, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1:Lcom/sma/smartv3/biz/AISparkChainManager;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/AISparkChainManager;->IO0iXO0O()I

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object v4, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->TAG:Ljava/lang/String;

    sget-boolean p2, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->isPhoneRecord:Z

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object p1, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object v0

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object/from16 v1, p5

    invoke-static/range {v0 .. v6}, Lcom/sma/smartv3/biz/voice/RecordingManager;->recordPermission$default(Lcom/sma/smartv3/biz/voice/RecordingManager;Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;ZZLjava/lang/String;ILjava/lang/Object;)V

    return-void

    :cond_5
    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->isWebSocket()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-direct {p0}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->onWebSocketManagerStart()V

    return-void

    :cond_6
    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/q62;->X11I()Z

    move-result p2

    if-eqz p2, :cond_7

    sget-object p2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->TAG:Ljava/lang/String;

    sget-boolean v1, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->isPhoneRecord:Z

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object p2, Lcom/sma/smartv3/util/MicrosoftSDKManage;->O1O:Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;

    invoke-virtual {p2}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v4

    sget-boolean v6, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->isPhoneRecord:Z

    invoke-virtual {v3}, Lcom/sma/smartv3/model/LanguageTranslationData;->getAsrLanguage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcom/sma/smartv3/model/LanguageTranslationData;->getTtsViuceName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1}, Lcom/sma/smartv3/model/LanguageTranslationData;->getAsrLanguage()Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    invoke-virtual/range {v4 .. v9}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->iIX0i(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Z)V

    return-void

    :cond_7
    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/q62;->OIXOOi()Z

    move-result p1

    if-nez p1, :cond_9

    if-ne p4, v7, :cond_8

    goto :goto_2

    :cond_8
    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object p2, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->TAG:Ljava/lang/String;

    sget-boolean v0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->isPhoneRecord:Z

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/q62;->IiX1ii()Z

    move-result p1

    if-eqz p1, :cond_a

    invoke-direct {p0}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->startRealTime()V

    return-void

    :cond_9
    :goto_2
    sget-object p1, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1:Lcom/sma/smartv3/biz/AISparkChainManager;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/AISparkChainManager;->IO0iXO0O()I

    sget-object p2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->TAG:Ljava/lang/String;

    sget-boolean v2, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->isPhoneRecord:Z

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/AISparkChainManager;->iOO1ii1()Z

    move-result p1

    if-eqz p1, :cond_a

    sget-object p1, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/sma/smartv3/biz/voice/RecordingManager;->startRealTimeASR(Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;)V

    :cond_a
    return-void
.end method

.method public final identificationCompleted()V
    .locals 5

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object v1, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->TAG:Ljava/lang/String;

    sget-boolean v2, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->isPhoneRecord:Z

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " end isPhoneRecord ="

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-boolean v0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->isPhoneRecord:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/RecordingManager;->stopRecording()V

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->isWebSocket()Z

    move-result v0

    const/4 v1, 0x2

    if-eqz v0, :cond_1

    sget-object v0, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->sendStopListenMessage()V

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->X11I()Z

    move-result v2

    if-eqz v2, :cond_3

    sget-boolean v0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->isPhoneRecord:Z

    if-eqz v0, :cond_2

    sget-object v0, Lcom/sma/smartv3/util/MicrosoftSDKManage;->O1O:Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;

    invoke-virtual {v0}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->XOIO11O()V

    goto :goto_0

    :cond_2
    sget-object v0, Lcom/sma/smartv3/util/MicrosoftSDKManage;->O1O:Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;

    invoke-virtual {v0}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->Xi()V

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->OIXOOi()Z

    move-result v0

    if-nez v0, :cond_4

    sget v0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->mDeviceSelectedAIMode:I

    if-ne v0, v1, :cond_7

    :cond_4
    sget-object v0, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1:Lcom/sma/smartv3/biz/AISparkChainManager;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/AISparkChainManager;->iOO1ii1()Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_6

    sget-boolean v0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->isPhoneRecord:Z

    if-eqz v0, :cond_5

    sget-object v0, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/RecordingManager;->stopRecording()V

    goto :goto_0

    :cond_5
    sget-object v0, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object v0

    const/4 v3, 0x3

    const/4 v4, 0x0

    invoke-static {v0, v2, v2, v3, v4}, Lcom/sma/smartv3/biz/voice/RecordingManager;->realTimeASRend$default(Lcom/sma/smartv3/biz/voice/RecordingManager;IIILjava/lang/Object;)V

    goto :goto_0

    :cond_6
    const v0, 0x7f141286

    invoke-static {v0}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v2}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->mIdentificationCallback:Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$OnIdentificationCallback;

    if-eqz v0, :cond_7

    const-string v2, "Authorize error"

    invoke-interface {v0, v2}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$OnIdentificationCallback;->onIdentificationError(Ljava/lang/String;)V

    :cond_7
    :goto_0
    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->isWebSocket()Z

    move-result v0

    if-nez v0, :cond_b

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->X11I()Z

    move-result v2

    if-nez v2, :cond_b

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->OIXOOi()Z

    move-result v2

    if-nez v2, :cond_b

    sget v2, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->mDeviceSelectedAIMode:I

    if-ne v2, v1, :cond_8

    goto :goto_1

    :cond_8
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->XOX()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-direct {p0}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->serviceIdentify()V

    goto :goto_1

    :cond_9
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->IiX1ii()Z

    move-result v2

    if-nez v2, :cond_b

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->iIiiO()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_a

    const v0, 0x7f140ff5

    invoke-static {v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    sget-object v1, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->mIdentificationCallback:Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$OnIdentificationCallback;

    if-eqz v1, :cond_b

    invoke-static {v0}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$OnIdentificationCallback;->onIdentificationError(Ljava/lang/String;)V

    goto :goto_1

    :cond_a
    new-instance v0, Lcom/android/mltcode/paycertificationapi/gq1;

    const/16 v2, 0x3e80

    const/16 v3, 0x10

    invoke-direct {v0, v2, v3, v1}, Lcom/android/mltcode/paycertificationapi/gq1;-><init>(III)V

    sget-object v1, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->getMPcmFile()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->getMWavFile()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lcom/android/mltcode/paycertificationapi/gq1;->OXO1(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->oldOpenAiChatCompletion()V

    :cond_b
    :goto_1
    invoke-direct {p0}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->savePcmFile()V

    return-void
.end method

.method public final identificationProcess([B)V
    .locals 7
    .param p1    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "byte"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->isWebSocket()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->sendAudioStreamWithBuffer([B)V

    :cond_0
    :goto_0
    move-object v2, p1

    goto :goto_2

    :cond_1
    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->X11I()Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object v0, Lcom/sma/smartv3/util/MicrosoftSDKManage;->O1O:Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;

    invoke-virtual {v0}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->Oi([B)V

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->OIXOOi()Z

    move-result v1

    if-nez v1, :cond_4

    sget v1, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->mDeviceSelectedAIMode:I

    const/4 v2, 0x2

    if-ne v1, v2, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->XOX()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->IiX1ii()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->sendRealTime([B)V

    goto :goto_0

    :cond_4
    :goto_1
    sget-object v0, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1:Lcom/sma/smartv3/biz/AISparkChainManager;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/AISparkChainManager;->iOO1ii1()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object v1

    array-length v4, p1

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lcom/sma/smartv3/biz/voice/RecordingManager;->realTimeASRing$default(Lcom/sma/smartv3/biz/voice/RecordingManager;[BIIILjava/lang/Object;)V

    :goto_2
    sget-object p1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/q62;->XOX()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/q62;->iX0iiiXi()Z

    move-result p1

    if-eqz p1, :cond_5

    sget-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSupportDevicePhoneVoiceAIChat()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->isVoiceAIIdentify()Z

    move-result p1

    if-nez p1, :cond_5

    sget-object p1, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->mOpusFile:Ljava/io/File;

    invoke-static {p1, v2, v1}, Lcom/blankj/utilcode/util/FileIOUtils;->writeFileFromBytesByStream(Ljava/io/File;[BZ)Z

    return-void

    :cond_5
    sget-object p1, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->isVoiceAiChatContext()Z

    move-result p1

    if-eqz p1, :cond_6

    sget-object p1, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->mOpusFile:Ljava/io/File;

    invoke-static {p1, v2, v1}, Lcom/blankj/utilcode/util/FileIOUtils;->writeFileFromBytesByStream(Ljava/io/File;[BZ)Z

    return-void

    :cond_6
    sget-object p1, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->mPcmFile:Ljava/io/File;

    invoke-static {p1, v2, v1}, Lcom/blankj/utilcode/util/FileIOUtils;->writeFileFromBytesByStream(Ljava/io/File;[BZ)Z

    return-void
.end method

.method public final isPhoneRecord()Z
    .locals 1

    sget-boolean v0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->isPhoneRecord:Z

    return v0
.end method

.method public final isSendResults()Z
    .locals 1

    sget-boolean v0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->isSendResults:Z

    return v0
.end method

.method public final isWebSocket()Z
    .locals 2

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->XOX()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->iX0iiiXi()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSupportDevicePhoneVoiceAIChat()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->isVoiceAIIdentify()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/v2/VoiceManagerV2;->isVoiceAiChatContext()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public final oldOpenAiChatCompletion()V
    .locals 3

    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    sget-object v1, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->mWavFile:Ljava/io/File;

    new-instance v2, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$oldOpenAiChatCompletion$1;

    invoke-direct {v2}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$oldOpenAiChatCompletion$1;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcom/sma/smartv3/biz/voice/VoiceManager;->openAiTranscriptionsAudio(Ljava/io/File;Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    return-void
.end method

.method public final sendRealTime([B)V
    .locals 1
    .param p1    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "bytes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->mOutputStream:Ljava/io/PipedOutputStream;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    return-void
.end method

.method public final setMCompleteText(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->mCompleteText:Ljava/lang/String;

    return-void
.end method

.method public final setMContentResult(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->mContentResult:Ljava/lang/String;

    return-void
.end method

.method public final setMDeviceSelectedAIMode(I)V
    .locals 0

    sput p1, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->mDeviceSelectedAIMode:I

    return-void
.end method

.method public final setMProcessComplete(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->mProcessComplete:Ljava/lang/String;

    return-void
.end method

.method public final setPhoneRecord(Z)V
    .locals 0

    sput-boolean p1, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->isPhoneRecord:Z

    return-void
.end method

.method public final setSendResults(Z)V
    .locals 0

    sput-boolean p1, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->isSendResults:Z

    return-void
.end method
