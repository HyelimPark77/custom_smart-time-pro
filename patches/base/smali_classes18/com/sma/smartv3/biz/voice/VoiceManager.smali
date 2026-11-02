.class public final Lcom/sma/smartv3/biz/voice/VoiceManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nVoiceManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VoiceManager.kt\ncom/sma/smartv3/biz/voice/VoiceManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 5 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 6 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,2515:1\n1869#2,2:2516\n1563#2:2522\n1634#2,2:2523\n1636#2:2526\n1563#2:2534\n1634#2,2:2535\n1636#2:2538\n1869#2,2:2541\n1#3:2518\n39#4,3:2519\n42#4:2525\n44#4,2:2527\n31#4,2:2529\n39#4,3:2531\n42#4:2537\n44#4,2:2539\n31#4,2:2543\n18#4,2:2578\n15#4:2580\n176#5,11:2545\n196#5:2564\n183#5,4:2565\n196#5:2577\n252#6,7:2556\n270#6:2563\n252#6,7:2569\n270#6:2576\n*S KotlinDebug\n*F\n+ 1 VoiceManager.kt\ncom/sma/smartv3/biz/voice/VoiceManager\n*L\n508#1:2516,2\n681#1:2522\n681#1:2523,2\n681#1:2526\n1388#1:2534\n1388#1:2535,2\n1388#1:2538\n1391#1:2541,2\n681#1:2519,3\n681#1:2525\n681#1:2527,2\n685#1:2529,2\n1388#1:2531,3\n1388#1:2537\n1388#1:2539,2\n1396#1:2543,2\n1664#1:2578,2\n1664#1:2580\n1603#1:2545,11\n1603#1:2564\n1637#1:2565,4\n1637#1:2577\n1603#1:2556,7\n1603#1:2563\n1637#1:2569,7\n1637#1:2576\n*E\n"
.end annotation

.annotation runtime Lkotlin/Deprecated;
    message = ""
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nVoiceManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VoiceManager.kt\ncom/sma/smartv3/biz/voice/VoiceManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 5 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 6 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,2515:1\n1869#2,2:2516\n1563#2:2522\n1634#2,2:2523\n1636#2:2526\n1563#2:2534\n1634#2,2:2535\n1636#2:2538\n1869#2,2:2541\n1#3:2518\n39#4,3:2519\n42#4:2525\n44#4,2:2527\n31#4,2:2529\n39#4,3:2531\n42#4:2537\n44#4,2:2539\n31#4,2:2543\n18#4,2:2578\n15#4:2580\n176#5,11:2545\n196#5:2564\n183#5,4:2565\n196#5:2577\n252#6,7:2556\n270#6:2563\n252#6,7:2569\n270#6:2576\n*S KotlinDebug\n*F\n+ 1 VoiceManager.kt\ncom/sma/smartv3/biz/voice/VoiceManager\n*L\n508#1:2516,2\n681#1:2522\n681#1:2523,2\n681#1:2526\n1388#1:2534\n1388#1:2535,2\n1388#1:2538\n1391#1:2541,2\n681#1:2519,3\n681#1:2525\n681#1:2527,2\n685#1:2529,2\n1388#1:2531,3\n1388#1:2537\n1388#1:2539,2\n1396#1:2543,2\n1664#1:2578,2\n1664#1:2580\n1603#1:2545,11\n1603#1:2564\n1637#1:2565,4\n1637#1:2577\n1603#1:2556,7\n1603#1:2563\n1637#1:2569,7\n1637#1:2576\n*E\n"
    }
.end annotation


# static fields
.field private static final CONVENTIONAL_IDENTIFY_TIME:J

.field private static final FIRST_IDENTIFY_TIME:J

.field public static final INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static final SECOND_IDENTIFY_TIME:J

.field private static final TAG:Ljava/lang/String; = "AIManager VoiceManager"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static final TAG_OPENAICHATCOMPLETION:Ljava/lang/String; = "openAiChatCompletion"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static isActivityData:Z

.field private static isAiTaskRunning:Z

.field private static isEndInOperation:Z

.field private static volatile isRealTimeRunning:Z

.field private static isReceiveRecordPacket:Z

.field private static isRecordBluetooth:Z

.field private static isSendResults:Z

.field private static isSpeechRecRunning:Z

.field private static mAIMode:I

.field private static final mAISparkChainManagerCallback:Lcom/android/mltcode/paycertificationapi/O1XIiIO;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
            "Lcom/sma/smartv3/model/AIAnswer;",
            ">;"
        }
    .end annotation
.end field

.field private static mApp:Landroid/app/Application;

.field private static final mBleHandleCallback:Lcom/sma/smartv3/biz/voice/VoiceManager$mBleHandleCallback$1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static mContentResult:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static mDuserTask:Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private static mFullRunner:Lcom/baidu/ai/speech/realtime/full/connection/Runner;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private static mInputStream:Ljava/io/PipedInputStream;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private static mLanguage:I

.field private static mListener:Lkotlin/jvm/functions/Function3;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private static mOpenAiTask:Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private static final mOpusFile:Ljava/io/File;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static mOpusManager:Lcom/sma/smartv3/biz/voice/OpusManager;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
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

.field private static mSavePcmTime:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static mToLanguage:I

.field private static mVoiceMode:I

.field private static mVoiceType:I

.field private static final mWavFile:Ljava/io/File;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static final microsoftCallBack:Lcom/sma/smartv3/util/MicrosoftSDKManage$iO;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static microsoftLanguage:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static microsoftTime:J

.field private static microsoftTtsLanguage:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static microsoftTtsName:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static final recordingCallBack:Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static resetCallBack:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/sma/smartv3/biz/voice/VoiceManager;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/voice/VoiceManager;-><init>()V

    sput-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

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

    sput-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mOpusFile:Ljava/io/File;

    const-string v0, ""

    sput-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mSavePcmTime:Ljava/lang/String;

    new-instance v1, Ljava/io/File;

    invoke-static {}, Lcom/blankj/utilcode/util/PathUtils;->getExternalAppDataPath()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/files/record.pcm"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    sput-object v1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mPcmFile:Ljava/io/File;

    new-instance v1, Ljava/io/File;

    invoke-static {}, Lcom/blankj/utilcode/util/PathUtils;->getExternalAppDataPath()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/files/record.wav"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    sput-object v1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mWavFile:Ljava/io/File;

    const/4 v1, -0x1

    sput v1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mLanguage:I

    sput v1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mToLanguage:I

    sput v1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mAIMode:I

    sput v1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mVoiceType:I

    new-instance v1, Lcom/sma/smartv3/biz/voice/VoiceManager$mBleHandleCallback$1;

    invoke-direct {v1}, Lcom/sma/smartv3/biz/voice/VoiceManager$mBleHandleCallback$1;-><init>()V

    sput-object v1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mBleHandleCallback:Lcom/sma/smartv3/biz/voice/VoiceManager$mBleHandleCallback$1;

    const-string v1, "zh-CN"

    sput-object v1, Lcom/sma/smartv3/biz/voice/VoiceManager;->microsoftLanguage:Ljava/lang/String;

    const-string v2, "zh-CN-XiaoxiaoNeural"

    sput-object v2, Lcom/sma/smartv3/biz/voice/VoiceManager;->microsoftTtsName:Ljava/lang/String;

    sput-object v1, Lcom/sma/smartv3/biz/voice/VoiceManager;->microsoftTtsLanguage:Ljava/lang/String;

    const/4 v1, 0x1

    sput-boolean v1, Lcom/sma/smartv3/biz/voice/VoiceManager;->isRecordBluetooth:Z

    sput-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mContentResult:Ljava/lang/String;

    new-instance v0, Lcom/sma/smartv3/biz/voice/VoiceManager$microsoftCallBack$1;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/voice/VoiceManager$microsoftCallBack$1;-><init>()V

    sput-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->microsoftCallBack:Lcom/sma/smartv3/util/MicrosoftSDKManage$iO;

    new-instance v0, Lcom/sma/smartv3/biz/voice/VoiceManager$recordingCallBack$1;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/voice/VoiceManager$recordingCallBack$1;-><init>()V

    sput-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->recordingCallBack:Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;

    const-wide/16 v0, 0x7d0

    sput-wide v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->FIRST_IDENTIFY_TIME:J

    const-wide/16 v2, 0x3e8

    sput-wide v2, Lcom/sma/smartv3/biz/voice/VoiceManager;->SECOND_IDENTIFY_TIME:J

    const-wide/16 v2, 0x64

    sput-wide v2, Lcom/sma/smartv3/biz/voice/VoiceManager;->CONVENTIONAL_IDENTIFY_TIME:J

    sput-wide v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->microsoftTime:J

    new-instance v0, Lcom/sma/smartv3/biz/voice/VoiceManager$mAISparkChainManagerCallback$1;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/voice/VoiceManager$mAISparkChainManagerCallback$1;-><init>()V

    sput-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mAISparkChainManagerCallback:Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic AIChat$default(Lcom/sma/smartv3/biz/voice/VoiceManager;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const-string p2, "tag"

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/biz/voice/VoiceManager;->AIChat(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic I0IIOi(Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->oldReceiveRecordPacketSC$lambda$0(Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IiI10X(Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->newReceiveRecordPacket$lambda$0(Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O00(JJ)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/biz/voice/VoiceManager;->openAiTranscriptionsAudio$lambda$0(JJ)V

    return-void
.end method

.method public static synthetic OIi0(JJ)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/biz/voice/VoiceManager;->aiTranscriptionsAudio$lambda$0(JJ)V

    return-void
.end method

.method public static synthetic OXO1(Ljava/io/File;)J
    .locals 2

    invoke-static {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->savePcmFile$lambda$0$0(Ljava/io/File;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static synthetic XIi00iiXO()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/biz/voice/VoiceManager;->savePcmFile$lambda$0()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic XO0O10(Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->sendContentResult$lambda$0$0(Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XOO0ii0(Ljava/lang/String;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->voiceQuery$lambda$0(Ljava/lang/String;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMAIMode$p()I
    .locals 1

    sget v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mAIMode:I

    return v0
.end method

.method public static final synthetic access$getMApp$p()Landroid/app/Application;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mApp:Landroid/app/Application;

    return-object v0
.end method

.method public static final synthetic access$getMFullRunner$p()Lcom/baidu/ai/speech/realtime/full/connection/Runner;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mFullRunner:Lcom/baidu/ai/speech/realtime/full/connection/Runner;

    return-object v0
.end method

.method public static final synthetic access$getMInputStream$p()Ljava/io/PipedInputStream;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mInputStream:Ljava/io/PipedInputStream;

    return-object v0
.end method

.method public static final synthetic access$isAiTaskRunning$p()Z
    .locals 1

    sget-boolean v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->isAiTaskRunning:Z

    return v0
.end method

.method public static final synthetic access$isRealTimeRunning$p()Z
    .locals 1

    sget-boolean v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->isRealTimeRunning:Z

    return v0
.end method

.method public static final synthetic access$oldOpenAiChatCompletion(Lcom/sma/smartv3/biz/voice/VoiceManager;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->oldOpenAiChatCompletion()V

    return-void
.end method

.method public static final synthetic access$pcmToWav(Lcom/sma/smartv3/biz/voice/VoiceManager;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->pcmToWav()V

    return-void
.end method

.method public static final synthetic access$pollCheckStop(Lcom/sma/smartv3/biz/voice/VoiceManager;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->pollCheckStop()V

    return-void
.end method

.method public static final synthetic access$sendContentResult(Lcom/sma/smartv3/biz/voice/VoiceManager;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->sendContentResult(Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$sendError(Lcom/sma/smartv3/biz/voice/VoiceManager;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->sendError(Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$sendMsg(Lcom/sma/smartv3/biz/voice/VoiceManager;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->sendMsg(Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$sendRealTime(Lcom/sma/smartv3/biz/voice/VoiceManager;[B)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->sendRealTime([B)V

    return-void
.end method

.method public static final synthetic access$setAiTaskRunning$p(Z)V
    .locals 0

    sput-boolean p0, Lcom/sma/smartv3/biz/voice/VoiceManager;->isAiTaskRunning:Z

    return-void
.end method

.method public static final synthetic access$setMAIMode$p(I)V
    .locals 0

    sput p0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mAIMode:I

    return-void
.end method

.method public static final synthetic access$setMFullRunner$p(Lcom/baidu/ai/speech/realtime/full/connection/Runner;)V
    .locals 0

    sput-object p0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mFullRunner:Lcom/baidu/ai/speech/realtime/full/connection/Runner;

    return-void
.end method

.method public static final synthetic access$setMInputStream$p(Ljava/io/PipedInputStream;)V
    .locals 0

    sput-object p0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mInputStream:Ljava/io/PipedInputStream;

    return-void
.end method

.method public static final synthetic access$setMOutputStream$p(Ljava/io/PipedOutputStream;)V
    .locals 0

    sput-object p0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mOutputStream:Ljava/io/PipedOutputStream;

    return-void
.end method

.method public static final synthetic access$setRealTimeRunning$p(Z)V
    .locals 0

    sput-boolean p0, Lcom/sma/smartv3/biz/voice/VoiceManager;->isRealTimeRunning:Z

    return-void
.end method

.method public static final synthetic access$stopRealTime(Lcom/sma/smartv3/biz/voice/VoiceManager;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->stopRealTime()V

    return-void
.end method

.method public static final synthetic access$translateITS(Lcom/sma/smartv3/biz/voice/VoiceManager;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/biz/voice/VoiceManager;->translateITS(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic aiTranscriptionsAudio$default(Lcom/sma/smartv3/biz/voice/VoiceManager;Ljava/io/File;Lcom/android/mltcode/paycertificationapi/O1XIiIO;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/biz/voice/VoiceManager;->aiTranscriptionsAudio(Ljava/io/File;Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    return-void
.end method

.method private static final aiTranscriptionsAudio$lambda$0(JJ)V
    .locals 0

    return-void
.end method

.method private final aiTranscriptionsAudioFile(Ljava/io/File;)V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/biz/voice/VoiceManager$aiTranscriptionsAudioFile$1;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/voice/VoiceManager$aiTranscriptionsAudioFile$1;-><init>()V

    invoke-virtual {p0, p1, v0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->aiTranscriptionsAudio(Ljava/io/File;Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    return-void
.end method

.method public static synthetic checkBaiduAuth$default(Lcom/sma/smartv3/biz/voice/VoiceManager;Landroid/app/Activity;Landroid/view/View;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    move-object p2, v0

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/biz/voice/VoiceManager;->checkBaiduAuth(Landroid/app/Activity;Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private final deleteFiles()V
    .locals 3

    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mOpusFile:Ljava/io/File;

    invoke-static {v0}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/io/File;)Z

    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mPcmFile:Ljava/io/File;

    invoke-static {v0}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/io/File;)Z

    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mWavFile:Ljava/io/File;

    invoke-static {v0}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/io/File;)Z

    sget-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->deleteReplayMusic()V

    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyy_MM_dd_HH_mm_ss"

    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "format(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mSavePcmTime:Ljava/lang/String;

    return-void
.end method

.method public static synthetic iO(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)J
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->savePcmFile$lambda$0$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final newReceiveRecordPacket$lambda$0(Z)Lkotlin/Unit;
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AIManager VoiceManager mOpusManager -> decodeStream  opus to pcm error "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    if-eqz p0, :cond_1

    sget-object p0, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSupportAIVoiceTranslation()Z

    move-result v0

    if-eqz v0, :cond_0

    sget v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mLanguage:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    sget v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mToLanguage:I

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->sendAISparkChainTranslation()V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->pcmToWav()V

    :cond_1
    :goto_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final oldOpenAiChatCompletion()V
    .locals 2

    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mWavFile:Ljava/io/File;

    new-instance v1, Lcom/sma/smartv3/biz/voice/VoiceManager$oldOpenAiChatCompletion$1;

    invoke-direct {v1}, Lcom/sma/smartv3/biz/voice/VoiceManager$oldOpenAiChatCompletion$1;-><init>()V

    invoke-virtual {p0, v0, v1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->openAiTranscriptionsAudio(Ljava/io/File;Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    return-void
.end method

.method private static final oldReceiveRecordPacketSC$lambda$0(Z)Lkotlin/Unit;
    .locals 4

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AIManager VoiceManager mOpusManager -> decodeStream  opus to pcm  "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    if-eqz p0, :cond_3

    sget-object p0, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSupportAIVoiceTranslation()Z

    move-result v0

    if-eqz v0, :cond_0

    sget v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mLanguage:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    sget v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mToLanguage:I

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->sendAISparkChainTranslation()V

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->OIXOOi()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->sendAISparkChainIdentify()V

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->IiX1ii()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->recognition()V

    goto :goto_0

    :cond_2
    new-instance v0, Lcom/android/mltcode/paycertificationapi/gq1;

    const/16 v1, 0x10

    const/4 v2, 0x2

    const/16 v3, 0x3e80

    invoke-direct {v0, v3, v1, v2}, Lcom/android/mltcode/paycertificationapi/gq1;-><init>(III)V

    sget-object v1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mPcmFile:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/sma/smartv3/biz/voice/VoiceManager;->mWavFile:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/gq1;->OXO1(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->oldOpenAiChatCompletion()V

    :cond_3
    :goto_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic openAiCheck$default(Lcom/sma/smartv3/biz/voice/VoiceManager;Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Landroid/app/Activity;Landroid/view/View;ILjava/lang/Object;)V
    .locals 1

    and-int/lit8 p6, p5, 0x2

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    move-object p4, v0

    :cond_2
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/biz/voice/VoiceManager;->openAiCheck(Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Landroid/app/Activity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic openAiTranscriptionsAudio$default(Lcom/sma/smartv3/biz/voice/VoiceManager;Ljava/io/File;Lcom/android/mltcode/paycertificationapi/O1XIiIO;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/biz/voice/VoiceManager;->openAiTranscriptionsAudio(Ljava/io/File;Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    return-void
.end method

.method private static final openAiTranscriptionsAudio$lambda$0(JJ)V
    .locals 0

    return-void
.end method

.method private final pcmToWav()V
    .locals 4

    new-instance v0, Lcom/android/mltcode/paycertificationapi/gq1;

    const/16 v1, 0x10

    const/4 v2, 0x2

    const/16 v3, 0x3e80

    invoke-direct {v0, v3, v1, v2}, Lcom/android/mltcode/paycertificationapi/gq1;-><init>(III)V

    sget-object v1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mPcmFile:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/sma/smartv3/biz/voice/VoiceManager;->mWavFile:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Lcom/android/mltcode/paycertificationapi/gq1;->OXO1(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    invoke-direct {v0, v2}, Lcom/sma/smartv3/biz/voice/VoiceManager;->aiTranscriptionsAudioFile(Ljava/io/File;)V

    return-void
.end method

.method private final pollCheckStop()V
    .locals 6

    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    new-instance v1, Lcom/sma/smartv3/biz/voice/VoiceManager$pollCheckStop$timerTask$1;

    invoke-direct {v1, v0}, Lcom/sma/smartv3/biz/voice/VoiceManager$pollCheckStop$timerTask$1;-><init>(Ljava/util/Timer;)V

    const-wide/16 v2, 0x1f4

    const-wide/16 v4, 0x1f4

    invoke-virtual/range {v0 .. v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    return-void
.end method

.method public static synthetic postEvent$default(Lcom/sma/smartv3/biz/voice/VoiceManager;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    new-instance p2, Ljava/lang/Object;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/biz/voice/VoiceManager;->postEvent(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private final savePcmFile()V
    .locals 8

    new-instance v5, Lcom/android/mltcode/paycertificationapi/xi6;

    invoke-direct {v5}, Lcom/android/mltcode/paycertificationapi/xi6;-><init>()V

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
    .locals 5

    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mSavePcmTime:Ljava/lang/String;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_2

    const-wide/16 v0, 0x7d0

    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    new-instance v0, Ljava/io/File;

    invoke-static {}, Lcom/blankj/utilcode/util/PathUtils;->getExternalAppDataPath()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/files/save_pcm"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/blankj/utilcode/util/FileUtils;->createOrExistsDir(Ljava/io/File;)Z

    :cond_0
    new-instance v1, Ljava/io/File;

    invoke-static {}, Lcom/blankj/utilcode/util/PathUtils;->getExternalAppDataPath()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/sma/smartv3/biz/voice/VoiceManager;->mSavePcmTime:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/files/save_pcm/record_"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ".pcm"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    sget-object v2, Lcom/sma/smartv3/biz/voice/VoiceManager;->mPcmFile:Ljava/io/File;

    invoke-static {v2, v1}, Lcom/blankj/utilcode/util/FileUtils;->copy(Ljava/io/File;Ljava/io/File;)Z

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance v1, Lcom/android/mltcode/paycertificationapi/yi6;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/yi6;-><init>()V

    new-instance v2, Lcom/android/mltcode/paycertificationapi/zi6;

    invoke-direct {v2, v1}, Lcom/android/mltcode/paycertificationapi/zi6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-static {v2}, Ljava/util/Comparator;->comparingLong(Ljava/util/function/ToLongFunction;)Ljava/util/Comparator;

    move-result-object v1

    const-string v2, "comparingLong(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1}, Lkotlin/collections/ArraysKt___ArraysJvmKt;->O1I([Ljava/lang/Object;Ljava/util/Comparator;)V

    array-length v1, v0

    const/16 v2, 0xa

    if-le v1, v2, :cond_1

    invoke-static {v0}, Lkotlin/collections/ArraysKt___ArraysKt;->IO0([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    :cond_1
    const-string v0, ""

    sput-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mSavePcmTime:Ljava/lang/String;

    :cond_2
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

.method private final sendContentResult(Ljava/lang/String;)V
    .locals 8

    invoke-static {p1}, Lkotlin/text/StringsKt__StringsKt;->iX1X1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    const p1, 0x7f141286

    invoke-static {p1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->sendTranslationResultInput(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->isVoiceAIIdentify()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->sendTranslationResultInput(Ljava/lang/String;)V

    return-void

    :cond_1
    monitor-enter p1

    :try_start_0
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "AIManager VoiceManager  sendContentResult  str"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->sendTranslationResultInput(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSupportAIVoiceWatchface()Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object v2, Lcom/sma/smartv3/biz/AIWatchFaceManager;->OXO1:Lcom/sma/smartv3/biz/AIWatchFaceManager;

    sget v5, Lcom/sma/smartv3/biz/voice/VoiceManager;->mAIMode:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v4, 0x0

    move-object v3, p1

    :try_start_1
    invoke-static/range {v2 .. v7}, Lcom/sma/smartv3/biz/AIWatchFaceManager;->XiOIii1(Lcom/sma/smartv3/biz/AIWatchFaceManager;Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/O1XIiIO;IILjava/lang/Object;)V

    goto :goto_2

    :catchall_0
    move-exception v0

    :goto_0
    move-object p1, v0

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object v3, p1

    goto :goto_0

    :cond_2
    move-object v3, p1

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSupportEarPhoneVoiceTranslation()Z

    move-result p1

    if-nez p1, :cond_4

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSupportAIVoiceTranslation()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    invoke-direct {v0, v3}, Lcom/sma/smartv3/biz/voice/VoiceManager;->toAIChatManagerHandleResponse(Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    :goto_1
    sget-object p1, Lcom/szabh/smable3/entity/Languages;->INSTANCE:Lcom/szabh/smable3/entity/Languages;

    sget v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mToLanguage:I

    const-string v1, "en"

    invoke-virtual {p1, v0, v1}, Lcom/szabh/smable3/entity/Languages;->formatMicrosoftTargetLang(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sget-object v0, Lcom/sma/smartv3/util/MicrosoftSDKManage;->O1O:Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;

    invoke-virtual {v0}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->IXI()V

    invoke-virtual {v0}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/dj6;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/dj6;-><init>()V

    invoke-virtual {v0, v3, p1, v1}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->OI(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    :goto_2
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v3

    return-void

    :goto_3
    monitor-exit v3

    throw p1
.end method

.method private static final sendContentResult$lambda$0$0(Ljava/lang/String;)Lkotlin/Unit;
    .locals 2

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->stop()V

    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    invoke-virtual {v0, p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->sendTranslationResultOutput(Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/util/MicrosoftSDKManage;->O1O:Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;

    invoke-virtual {v0}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v0

    sget-object v1, Lcom/sma/smartv3/biz/voice/VoiceManager;->microsoftTtsName:Ljava/lang/String;

    invoke-virtual {v0, p0, v1}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->XXIIO1i11(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, ""

    sput-object p0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mContentResult:Ljava/lang/String;

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final sendError(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    sput-boolean v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSpeechRecRunning:Z

    invoke-direct {p0, p1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->sendMsg(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic sendError$default(Lcom/sma/smartv3/biz/voice/VoiceManager;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object p1

    const p2, 0x7f141196

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string p2, "getString(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-direct {p0, p1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->sendError(Ljava/lang/String;)V

    return-void
.end method

.method private final sendMsg(Ljava/lang/String;)V
    .locals 10

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    sget v3, Lcom/sma/smartv3/biz/voice/VoiceManager;->mVoiceMode:I

    new-instance v0, Lcom/szabh/smable3/entity/BleVoice;

    const/16 v8, 0xa

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object v7, p1

    invoke-direct/range {v0 .. v9}, Lcom/szabh/smable3/entity/BleVoice;-><init>(IIILcom/szabh/smable3/entity/BleVoice$BleDeviceEmotion;JLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->senAudioTextToDevice(Lcom/szabh/smable3/entity/BleVoice;)V

    return-void
.end method

.method private final sendRealTime([B)V
    .locals 1

    :try_start_0
    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mOutputStream:Ljava/io/PipedOutputStream;

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

.method public static synthetic setLanguageType$default(Lcom/sma/smartv3/biz/voice/VoiceManager;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const-string v0, ""

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move-object p2, v0

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/biz/voice/VoiceManager;->setLanguageType(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private final startRealTime()V
    .locals 2

    sget-boolean v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->isRealTimeRunning:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "AIManager VoiceManager -> startRealTime"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    new-instance v0, Lcom/sma/smartv3/biz/voice/VoiceManager$startRealTime$1;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/voice/VoiceManager$startRealTime$1;-><init>()V

    invoke-static {v0}, Lcom/blankj/utilcode/util/ThreadUtils;->executeByIo(Lcom/blankj/utilcode/util/ThreadUtils$Task;)V

    return-void
.end method

.method public static synthetic startTransfer$default(Lcom/sma/smartv3/biz/voice/VoiceManager;IILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->startTransfer(I)V

    return-void
.end method

.method private final stopRealTime()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    :try_start_0
    sget-object v2, Lcom/sma/smartv3/biz/voice/VoiceManager;->mInputStream:Ljava/io/PipedInputStream;

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
    sget-object v2, Lcom/sma/smartv3/biz/voice/VoiceManager;->mOutputStream:Ljava/io/PipedOutputStream;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/io/PipedOutputStream;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    sput-object v1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mInputStream:Ljava/io/PipedInputStream;

    sput-object v1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mOutputStream:Ljava/io/PipedOutputStream;

    sput-object v1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mFullRunner:Lcom/baidu/ai/speech/realtime/full/connection/Runner;

    sput-boolean v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->isRealTimeRunning:Z

    return-void

    :goto_1
    :try_start_1
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    sput-object v1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mInputStream:Ljava/io/PipedInputStream;

    sput-object v1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mOutputStream:Ljava/io/PipedOutputStream;

    sput-object v1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mFullRunner:Lcom/baidu/ai/speech/realtime/full/connection/Runner;

    sput-boolean v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->isRealTimeRunning:Z

    return-void

    :goto_2
    sput-object v1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mInputStream:Ljava/io/PipedInputStream;

    sput-object v1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mOutputStream:Ljava/io/PipedOutputStream;

    sput-object v1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mFullRunner:Lcom/baidu/ai/speech/realtime/full/connection/Runner;

    sput-boolean v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->isRealTimeRunning:Z

    throw v2
.end method

.method private final toAIChatManagerHandleResponse(Ljava/lang/String;)V
    .locals 27

    move-object/from16 v0, p0

    const-string v11, "_list"

    const-class v12, Lcom/sma/smartv3/biz/voice/VoiceMessage;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->isVoiceAIIdentify()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct/range {p0 .. p1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->sendMsg(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSupportAIVoiceWatchface()Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Lcom/sma/smartv3/biz/AIWatchFaceManager;->OXO1:Lcom/sma/smartv3/biz/AIWatchFaceManager;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object/from16 v2, p1

    invoke-static/range {v1 .. v6}, Lcom/sma/smartv3/biz/AIWatchFaceManager;->XiOIii1(Lcom/sma/smartv3/biz/AIWatchFaceManager;Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/O1XIiIO;IILjava/lang/Object;)V

    return-void

    :cond_1
    invoke-direct/range {p0 .. p1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->sendMsg(Ljava/lang/String;)V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    :try_start_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/gson/JsonParser;->parseString(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/gson/JsonElement;->getAsJsonArray()Lcom/google/gson/JsonArray;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/gson/JsonElement;

    new-instance v4, Lcom/google/gson/Gson;

    invoke-direct {v4}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v4, v3, v12}, Lcom/google/gson/Gson;->fromJson(Lcom/google/gson/JsonElement;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object v2

    :cond_2
    check-cast v2, Ljava/util/Collection;

    invoke-static {v2}, Lkotlin/collections/CollectionsKt___CollectionsKt;->OO0Oi10(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v13

    sget-object v14, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    const-string v1, "SEND_VOICE_START_AUTO_REFRESH"

    const/4 v15, 0x0

    const/4 v2, 0x2

    invoke-static {v14, v1, v15, v2, v15}, Lcom/sma/smartv3/biz/voice/VoiceManager;->postEvent$default(Lcom/sma/smartv3/biz/voice/VoiceManager;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    new-instance v1, Lcom/sma/smartv3/biz/voice/VoiceMessage;

    const/16 v9, 0x73

    const/4 v10, 0x0

    move v3, v2

    const/4 v2, 0x0

    move v4, v3

    const/4 v3, 0x0

    move v5, v4

    const/4 v4, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v16, v12

    move v12, v5

    move-object/from16 v5, p1

    invoke-direct/range {v1 .. v10}, Lcom/sma/smartv3/biz/voice/VoiceMessage;-><init>(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v2, v5

    invoke-interface {v13, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v17, Lcom/sma/smartv3/biz/voice/VoiceMessage;

    sget v24, Lcom/sma/smartv3/biz/voice/VoiceManager;->mAIMode:I

    const/16 v25, 0x13

    const/16 v26, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x2

    const-string v21, ""

    const/16 v22, 0x0

    const/16 v23, 0x1

    invoke-direct/range {v17 .. v26}, Lcom/sma/smartv3/biz/voice/VoiceMessage;-><init>(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v17

    invoke-interface {v13, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lcom/google/gson/Gson;

    invoke-direct {v4}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v4, v13}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "SEND_VOICE"

    invoke-static {v14, v1, v15, v12, v15}, Lcom/sma/smartv3/biz/voice/VoiceManager;->postEvent$default(Lcom/sma/smartv3/biz/voice/VoiceManager;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/i72;->I0IIOI()Z

    move-result v1

    const/4 v3, 0x1

    if-eqz v1, :cond_4

    sget v1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mAIMode:I

    if-ltz v1, :cond_4

    const/4 v4, 0x3

    if-gt v1, v4, :cond_4

    if-ne v1, v12, :cond_3

    sget-object v1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->OIXOOi()Z

    move-result v4

    if-eqz v4, :cond_3

    sget-object v4, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1:Lcom/sma/smartv3/biz/AISparkChainManager;

    sget-object v5, Lcom/sma/smartv3/biz/voice/VoiceManager;->mAISparkChainManagerCallback:Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->iXOII()I

    move-result v1

    invoke-virtual {v4, v2, v5, v1, v3}, Lcom/sma/smartv3/biz/AISparkChainManager;->iXiiiO(Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/O1XIiIO;IZ)V

    goto :goto_1

    :cond_3
    const-string v1, "toAIChatManagerHandleResponse"

    invoke-virtual {v0, v2, v1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->AIChat(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    sget-object v1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->OIXOOi()Z

    move-result v4

    if-eqz v4, :cond_5

    sget-object v4, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1:Lcom/sma/smartv3/biz/AISparkChainManager;

    sget-object v5, Lcom/sma/smartv3/biz/voice/VoiceManager;->mAISparkChainManagerCallback:Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->iXOII()I

    move-result v1

    invoke-virtual {v4, v2, v5, v1, v3}, Lcom/sma/smartv3/biz/AISparkChainManager;->iXiiiO(Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/O1XIiIO;IZ)V

    goto :goto_1

    :cond_5
    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->XOX()Z

    move-result v3

    if-eqz v3, :cond_6

    const-string v1, "toAIChatManagerHandleResponse isUseAIService"

    invoke-virtual {v0, v2, v1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->AIChat(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_6
    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->IiX1ii()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-virtual/range {p0 .. p1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->voiceQuery(Ljava/lang/String;)V

    goto :goto_1

    :cond_7
    invoke-virtual/range {p0 .. p1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->openAiChatCompletion(Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method private final translateITS(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AIManager VoiceManager  translateITS leftLang = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " , rightLang = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1:Lcom/sma/smartv3/biz/AISparkChainManager;

    invoke-interface {p4}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_0

    move-object p4, p1

    :cond_0
    new-instance v1, Lcom/sma/smartv3/biz/voice/VoiceManager$translateITS$2;

    invoke-direct {v1, p1, p3}, Lcom/sma/smartv3/biz/voice/VoiceManager$translateITS$2;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p4, p2, p3, v1}, Lcom/sma/smartv3/biz/AISparkChainManager;->IX1XiI(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    return-void
.end method

.method public static synthetic translateITS$default(Lcom/sma/smartv3/biz/voice/VoiceManager;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const-string p2, "cn"

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    const-string p3, "en"

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    const-string p4, ""

    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/biz/voice/VoiceManager;->translateITS(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static final voiceQuery$lambda$0(Ljava/lang/String;Z)Lkotlin/Unit;
    .locals 0

    if-eqz p1, :cond_0

    sget-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    invoke-virtual {p1, p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->duserStreamChat(Ljava/lang/String;)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final AIChat(Ljava/lang/String;Ljava/lang/String;)V
    .locals 10
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "query"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tag"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AIManager VoiceManager AIChat "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " -> "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    const/4 p2, 0x1

    sput-boolean p2, Lcom/sma/smartv3/biz/voice/VoiceManager;->isAiTaskRunning:Z

    sget-object v0, Lcom/sma/smartv3/biz/AIManager;->OXO1:Lcom/sma/smartv3/biz/AIManager;

    new-instance v1, Lcom/sma/smartv3/model/AIQuestion;

    sget-object v2, Lcom/sma/smartv3/model/AIFunctionType;->AI:Lcom/sma/smartv3/model/AIFunctionType;

    const/16 v8, 0x3c

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v3, p1

    invoke-direct/range {v1 .. v9}, Lcom/sma/smartv3/model/AIQuestion;-><init>(Lcom/sma/smartv3/model/AIFunctionType;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v6, Lcom/sma/smartv3/biz/voice/VoiceManager;->mAIMode:I

    sget-object p1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/q62;->iXOII()I

    move-result v5

    new-instance v2, Lcom/sma/smartv3/biz/voice/VoiceManager$AIChat$1;

    invoke-direct {v2, v3}, Lcom/sma/smartv3/biz/voice/VoiceManager$AIChat$1;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v6}, Lcom/sma/smartv3/biz/AIManager;->iIXi1iiXI(Lcom/sma/smartv3/model/AIQuestion;Lcom/android/mltcode/paycertificationapi/O1XIiIO;ZZII)V

    return-void
.end method

.method public final aISparkChainManagerHandleResponse(Lcom/sma/smartv3/model/AITranslation;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/model/AITranslation;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AITranslation;->getText()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->toAIChatManagerHandleResponse(Ljava/lang/String;)V

    return-void

    :cond_0
    sget-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mApp:Landroid/app/Application;

    if-nez p1, :cond_1

    const-string p1, "mApp"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_1
    const v0, 0x7f141196

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "getString(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->sendError(Ljava/lang/String;)V

    return-void
.end method

.method public final aiTranscriptionsAudio(Ljava/io/File;Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V
    .locals 7
    .param p1    # Ljava/io/File;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/android/mltcode/paycertificationapi/O1XIiIO;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "file"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/biz/AIManager;->OXO1:Lcom/sma/smartv3/biz/AIManager;

    sget v1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mAIMode:I

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

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "AIManager VoiceManager aiTranscriptionsAudio -> "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, "  toLang = "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " , model = "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

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

    const-string v0, "aiTranscriptionsAudio"

    invoke-virtual {p1, v0}, Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;

    move-result-object p1

    sget-object v0, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {p1, v0}, Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object p1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/wi6;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/wi6;-><init>()V

    invoke-virtual {p1, v0}, Lcom/androidnetworking/common/ANRequest;->setUploadProgressListener(Lcom/androidnetworking/interfaces/UploadProgressListener;)Lcom/androidnetworking/common/ANRequest;

    move-result-object p1

    new-instance v0, Lcom/sma/smartv3/biz/voice/VoiceManager$aiTranscriptionsAudio$2;

    invoke-direct {v0, p2}, Lcom/sma/smartv3/biz/voice/VoiceManager$aiTranscriptionsAudio$2;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {p1, v0}, Lcom/androidnetworking/common/ANRequest;->getAsJSONObject(Lcom/androidnetworking/interfaces/JSONObjectRequestListener;)V

    return-void
.end method

.method public final checkBaiduAuth(Landroid/app/Activity;Landroid/view/View;Lkotlin/jvm/functions/Function1;)V
    .locals 5
    .param p1    # Landroid/app/Activity;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p3    # Lkotlin/jvm/functions/Function1;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Landroid/view/View;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    sget-object v1, Lcom/sma/smartv3/network/GetDcsToken;->INSTANCE:Lcom/sma/smartv3/network/GetDcsToken;

    invoke-virtual {v1}, Lcom/sma/smartv3/network/GetDcsToken;->getURL()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/sma/smartv3/network/RequestBodyKt;->getDcsTokenBody()Ljava/util/HashMap;

    move-result-object v2

    new-instance v3, Lcom/sma/smartv3/biz/voice/VoiceManager$checkBaiduAuth$1;

    invoke-direct {v3, p3}, Lcom/sma/smartv3/biz/voice/VoiceManager$checkBaiduAuth$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1, p2}, Lcom/sma/smartv3/network/NetWorkUtils;->loadPopup(Landroid/app/Activity;Landroid/view/View;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object p2

    sget-object p3, Lcom/sma/smartv3/network/Api;->INSTANCE:Lcom/sma/smartv3/network/Api;

    invoke-virtual {p3}, Lcom/sma/smartv3/network/Api;->getBASE_URL()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, p3, v1}, Lcom/sma/smartv3/network/NetWorkUtils;->convertBaseUrl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4, v2}, Lcom/sma/smartv3/network/NetWorkUtils;->printParam(Ljava/lang/String;Ljava/util/Map;)V

    sget-object v0, Lcom/sma/androidnetworklib/method/NetWork;->OXO1:Lcom/sma/androidnetworklib/method/NetWork;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    new-instance v0, Lcom/sma/smartv3/biz/voice/VoiceManager$checkBaiduAuth$$inlined$post$1;

    invoke-direct {v0, p1, v3, p2}, Lcom/sma/smartv3/biz/voice/VoiceManager$checkBaiduAuth$$inlined$post$1;-><init>(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Lcom/android/mltcode/paycertificationapi/uq;)V

    invoke-static {p3}, Lcom/androidnetworking/AndroidNetworking;->post(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1, v2}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addBodyParameter(Ljava/util/Map;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    sget-object p2, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {p1, p2}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object p1

    const/4 p2, 0x1

    new-array p2, p2, [Ljava/lang/reflect/Type;

    const-class p3, Lcom/sma/smartv3/biz/dcs/DcsToken;

    const/4 v1, 0x0

    aput-object p3, p2, v1

    const-class p3, Lcom/sma/androidnetworklib/model/Response;

    invoke-static {p3, p2}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object p2

    new-instance p3, Lcom/sma/smartv3/biz/voice/VoiceManager$checkBaiduAuth$$inlined$post$2;

    invoke-direct {p3, v0}, Lcom/sma/smartv3/biz/voice/VoiceManager$checkBaiduAuth$$inlined$post$2;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {p1, p2, p3}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    return-void
.end method

.method public final destroy()V
    .locals 2

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->stop()V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mBleHandleCallback:Lcom/sma/smartv3/biz/voice/VoiceManager$mBleHandleCallback$1;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mOpusManager:Lcom/sma/smartv3/biz/voice/OpusManager;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/OpusManager;->release()V

    :cond_0
    const/4 v0, 0x0

    sput-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mOpusManager:Lcom/sma/smartv3/biz/voice/OpusManager;

    return-void
.end method

.method public final duserStreamChat(Ljava/lang/String;)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "query"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    sput-boolean v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->isAiTaskRunning:Z

    sget-object v1, Lcom/sma/smartv3/biz/AIManager;->OXO1:Lcom/sma/smartv3/biz/AIManager;

    invoke-virtual {v1, v0}, Lcom/sma/smartv3/biz/AIManager;->i0X000X0O(Z)V

    new-instance v2, Lcom/sma/smartv3/biz/voice/VoiceManager$duserStreamChat$1;

    invoke-direct {v2}, Lcom/sma/smartv3/biz/voice/VoiceManager$duserStreamChat$1;-><init>()V

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/biz/AIManager;->X00XIX1(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    sget-object v2, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/q62;->OIXOOi()Z

    move-result v3

    if-eqz v3, :cond_0

    sget-object v1, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1:Lcom/sma/smartv3/biz/AISparkChainManager;

    sget-object v3, Lcom/sma/smartv3/biz/voice/VoiceManager;->mAISparkChainManagerCallback:Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/q62;->iXOII()I

    move-result v2

    invoke-virtual {v1, p1, v3, v2, v0}, Lcom/sma/smartv3/biz/AISparkChainManager;->iXiiiO(Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/O1XIiIO;IZ)V

    return-void

    :cond_0
    sget-object v0, Lcom/sma/smartv3/model/AIFunctionType;->AI:Lcom/sma/smartv3/model/AIFunctionType;

    const/4 v3, 0x2

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/q62;->iXOII()I

    move-result v2

    invoke-virtual {v1, p1, v0, v3, v2}, Lcom/sma/smartv3/biz/AIManager;->I0IIOi(Ljava/lang/String;Lcom/sma/smartv3/model/AIFunctionType;II)V

    return-void
.end method

.method public final endTransfer()V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->savePcmFile()V

    return-void
.end method

.method public final getAiTranslationType(Lcom/szabh/smable3/entity/BleRecordPacket;)V
    .locals 1
    .param p1    # Lcom/szabh/smable3/entity/BleRecordPacket;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "recordPacket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSupportAIVoiceTranslation()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSupportEarPhoneVoiceTranslation()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleRecordPacket;->getMStatus()I

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleRecordPacket;->getMLanguage()I

    move-result v0

    sput v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mLanguage:I

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleRecordPacket;->getMToLanguage()I

    move-result p1

    sput p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mToLanguage:I

    :cond_1
    return-void
.end method

.method public final getCONVENTIONAL_IDENTIFY_TIME()J
    .locals 2

    sget-wide v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->CONVENTIONAL_IDENTIFY_TIME:J

    return-wide v0
.end method

.method public final getFIRST_IDENTIFY_TIME()J
    .locals 2

    sget-wide v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->FIRST_IDENTIFY_TIME:J

    return-wide v0
.end method

.method public final getMAISparkChainManagerCallback()Lcom/android/mltcode/paycertificationapi/O1XIiIO;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
            "Lcom/sma/smartv3/model/AIAnswer;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mAISparkChainManagerCallback:Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    return-object v0
.end method

.method public final getMContentResult()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mContentResult:Ljava/lang/String;

    return-object v0
.end method

.method public final getMLanguage()I
    .locals 1

    sget v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mLanguage:I

    return v0
.end method

.method public final getMListener()Lkotlin/jvm/functions/Function3;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function3<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mListener:Lkotlin/jvm/functions/Function3;

    return-object v0
.end method

.method public final getMOpusFile()Ljava/io/File;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mOpusFile:Ljava/io/File;

    return-object v0
.end method

.method public final getMPcmFile()Ljava/io/File;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mPcmFile:Ljava/io/File;

    return-object v0
.end method

.method public final getMSavePcmTime()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mSavePcmTime:Ljava/lang/String;

    return-object v0
.end method

.method public final getMToLanguage()I
    .locals 1

    sget v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mToLanguage:I

    return v0
.end method

.method public final getMVoiceMode()I
    .locals 1

    sget v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mVoiceMode:I

    return v0
.end method

.method public final getMVoiceType()I
    .locals 1

    sget v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mVoiceType:I

    return v0
.end method

.method public final getMWavFile()Ljava/io/File;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mWavFile:Ljava/io/File;

    return-object v0
.end method

.method public final getMicrosoftCallBack()Lcom/sma/smartv3/util/MicrosoftSDKManage$iO;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->microsoftCallBack:Lcom/sma/smartv3/util/MicrosoftSDKManage$iO;

    return-object v0
.end method

.method public final getMicrosoftLanguage()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->microsoftLanguage:Ljava/lang/String;

    return-object v0
.end method

.method public final getMicrosoftTime()J
    .locals 2

    sget-wide v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->microsoftTime:J

    return-wide v0
.end method

.method public final getMicrosoftTtsLanguage()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->microsoftTtsLanguage:Ljava/lang/String;

    return-object v0
.end method

.method public final getMicrosoftTtsName()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->microsoftTtsName:Ljava/lang/String;

    return-object v0
.end method

.method public final getRecordingCallBack()Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->recordingCallBack:Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;

    return-object v0
.end method

.method public final getResetCallBack()Z
    .locals 1

    sget-boolean v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->resetCallBack:Z

    return v0
.end method

.method public final getSECOND_IDENTIFY_TIME()J
    .locals 2

    sget-wide v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->SECOND_IDENTIFY_TIME:J

    return-wide v0
.end method

.method public final goOnTransfer(Lcom/szabh/smable3/entity/BleRecordPacket;)V
    .locals 2
    .param p1    # Lcom/szabh/smable3/entity/BleRecordPacket;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "recordPacket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    sput-boolean v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSpeechRecRunning:Z

    sget-object v1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mOpusFile:Ljava/io/File;

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleRecordPacket;->getMPacket()[B

    move-result-object p1

    invoke-static {v1, p1, v0}, Lcom/blankj/utilcode/util/FileIOUtils;->writeFileFromBytesByStream(Ljava/io/File;[BZ)Z

    return-void
.end method

.method public final init(Landroid/app/Application;)V
    .locals 2
    .param p1    # Landroid/app/Application;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "app"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "AIManager VoiceManager -> init"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O11XO1X;->XO0O10()Lcom/android/mltcode/paycertificationapi/O11XO1X;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/android/mltcode/paycertificationapi/O11XO1X;->X1ii(Ljava/lang/Object;)V

    sput-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mApp:Landroid/app/Application;

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mBleHandleCallback:Lcom/sma/smartv3/biz/voice/VoiceManager$mBleHandleCallback$1;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mOpusManager:Lcom/sma/smartv3/biz/voice/OpusManager;

    if-nez v0, :cond_0

    :try_start_0
    new-instance v0, Lcom/sma/smartv3/biz/voice/OpusManager;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/voice/OpusManager;-><init>()V

    sput-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mOpusManager:Lcom/sma/smartv3/biz/voice/OpusManager;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "AIManager VoiceManager -> opus init error\uff01\uff01\uff01"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    :cond_0
    :goto_0
    sget-object v0, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/sma/smartv3/biz/voice/RecordingManager;->init(Landroid/app/Application;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/sma/smartv3/biz/voice/RecordingManager;->registerSCOReceiver(Landroid/app/Application;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object v0

    sget-object v1, Lcom/sma/smartv3/biz/voice/VoiceManager;->recordingCallBack:Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/voice/RecordingManager;->setRecordingCallback(Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;)V

    const-string v0, "sma-speech-key"

    invoke-static {v0}, Lcom/sma/smartv3/util/UtilsKt;->XiOIii1(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_1

    sget-object v1, Lcom/sma/smartv3/util/MicrosoftSDKManage;->O1O:Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;

    invoke-virtual {v1}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->iI0I(Ljava/lang/String;)V

    :cond_1
    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->iX0iiiXi()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->init(Landroid/app/Application;Z)V

    :cond_2
    return-void
.end method

.method public final initMicrosoftSDKManage()V
    .locals 3

    sget-object v0, Lcom/sma/smartv3/util/MicrosoftSDKManage;->O1O:Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;

    invoke-virtual {v0}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->OX110i()V

    invoke-virtual {v0}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v1

    sget-object v2, Lcom/sma/smartv3/biz/voice/VoiceManager;->mApp:Landroid/app/Application;

    if-nez v2, :cond_0

    const-string v2, "mApp"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v2, 0x0

    :cond_0
    invoke-virtual {v1, v2}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->iiIOiX(Landroid/app/Application;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v0

    sget-object v1, Lcom/sma/smartv3/biz/voice/VoiceManager;->microsoftCallBack:Lcom/sma/smartv3/util/MicrosoftSDKManage$iO;

    const-string v2, "AIManager VoiceManager"

    invoke-virtual {v0, v1, v2}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->iIi1(Lcom/sma/smartv3/util/MicrosoftSDKManage$iO;Ljava/lang/String;)V

    sget-wide v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->FIRST_IDENTIFY_TIME:J

    sput-wide v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->microsoftTime:J

    return-void
.end method

.method public final initV2(Landroid/app/Application;)V
    .locals 1
    .param p1    # Landroid/app/Application;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "app"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mApp:Landroid/app/Application;

    return-void
.end method

.method public final isActivityData()Z
    .locals 1

    sget-boolean v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->isActivityData:Z

    return v0
.end method

.method public final isEndInOperation()Z
    .locals 1

    sget-boolean v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->isEndInOperation:Z

    return v0
.end method

.method public final isExpired()Z
    .locals 5

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    const-class v2, Lcom/sma/smartv3/biz/dcs/DcsToken;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {v2}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    :cond_0
    check-cast v0, Lcom/sma/smartv3/biz/dcs/DcsToken;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/dcs/DcsToken;->getTimestamp()J

    move-result-wide v3

    sub-long/2addr v1, v3

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/dcs/DcsToken;->getExpires_in()I

    move-result v0

    int-to-long v3, v0

    cmp-long v0, v1, v3

    if-lez v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final isReceiveRecordPacket()Z
    .locals 1

    sget-boolean v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->isReceiveRecordPacket:Z

    return v0
.end method

.method public final isRecordBluetooth()Z
    .locals 1

    sget-boolean v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->isRecordBluetooth:Z

    return v0
.end method

.method public final isSendResults()Z
    .locals 1

    sget-boolean v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSendResults:Z

    return v0
.end method

.method public final isSpeechRecRunning()Z
    .locals 1

    sget-boolean v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSpeechRecRunning:Z

    return v0
.end method

.method public final isSupportAIVoiceTranslation()Z
    .locals 2

    sget v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mVoiceMode:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isSupportAIVoiceWatchface()Z
    .locals 2

    sget v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mVoiceMode:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->OiXXXi10()Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isSupportDevicePhoneVoiceAIChat()Z
    .locals 1

    sget v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mVoiceMode:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isSupportEarPhoneVoiceAIChat()Z
    .locals 2

    sget v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mVoiceMode:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isSupportEarPhoneVoiceTranslation()Z
    .locals 2

    sget v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mVoiceMode:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isTaskRunning()Z
    .locals 6

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-boolean v1, Lcom/sma/smartv3/biz/voice/VoiceManager;->isAiTaskRunning:Z

    sget-boolean v2, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSpeechRecRunning:Z

    sget-boolean v3, Lcom/sma/smartv3/biz/voice/VoiceManager;->isReceiveRecordPacket:Z

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "isTaskRunning -> "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ","

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-boolean v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->isAiTaskRunning:Z

    if-nez v0, :cond_1

    sget-boolean v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSpeechRecRunning:Z

    if-nez v0, :cond_1

    sget-boolean v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->isReceiveRecordPacket:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final isVoiceAIIdentify()Z
    .locals 2

    sget v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mVoiceMode:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final newReceiveRecordPacket(Lcom/szabh/smable3/entity/BleRecordPacket;)V
    .locals 4
    .param p1    # Lcom/szabh/smable3/entity/BleRecordPacket;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "recordPacket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleRecordPacket;->getMStatus()I

    move-result v0

    if-eqz v0, :cond_7

    const/4 v1, 0x1

    if-eq v0, v1, :cond_6

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_7

    return-void

    :cond_0
    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object v0, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleCache;->getMPlatform()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "AIManager VoiceManager BleRecordPacket newReceiveRecordPacket END BleCache.mPlatform = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSupportEarPhoneVoiceAIChat()Z

    move-result v1

    if-nez v1, :cond_5

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSupportEarPhoneVoiceTranslation()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    sget-object v1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mOpusFile:Ljava/io/File;

    invoke-static {v1}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/io/File;)Z

    move-result v2

    if-nez v2, :cond_2

    const-string v0, "AIManager VoiceManager mOpusManager ->  FileUtils.isFileExists  false "

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void

    :cond_2
    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->stop()V

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleCache;->getMPlatform()Ljava/lang/String;

    move-result-object p1

    const-string v0, "SIFLI"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    sget-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mOpusManager:Lcom/sma/smartv3/biz/voice/OpusManager;

    if-eqz p1, :cond_4

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getPath(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lcom/sma/smartv3/biz/voice/VoiceManager;->mPcmFile:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/biz/voice/VoiceManager$newReceiveRecordPacket$1;

    invoke-direct {v1}, Lcom/sma/smartv3/biz/voice/VoiceManager$newReceiveRecordPacket$1;-><init>()V

    invoke-virtual {p1, v0, v2, v1}, Lcom/sma/smartv3/biz/voice/OpusManager;->decodeFile(Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/biz/voice/OpusManager$OnStateCallback;)V

    goto :goto_0

    :cond_3
    sget-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mOpusManager:Lcom/sma/smartv3/biz/voice/OpusManager;

    if-eqz p1, :cond_4

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getAbsolutePath(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lcom/sma/smartv3/biz/voice/VoiceManager;->mPcmFile:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/cj6;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/cj6;-><init>()V

    invoke-virtual {p1, v0, v2, v1}, Lcom/sma/smartv3/biz/voice/OpusManager;->decodeStream(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    :cond_4
    :goto_0
    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->endTransfer()V

    return-void

    :cond_5
    :goto_1
    sget-object p1, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/RecordingManager;->stopRecording()V

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->endTransfer()V

    return-void

    :cond_6
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->goOnTransfer(Lcom/szabh/smable3/entity/BleRecordPacket;)V

    return-void

    :cond_7
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "AIManager VoiceManager BleRecordPacket newReceiveRecordPacket START"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleRecordPacket;->getMStatus()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->startTransfer(I)V

    return-void
.end method

.method public final oldReceiveRecordPacket(Lcom/szabh/smable3/entity/BleRecordPacket;)V
    .locals 2
    .param p1    # Lcom/szabh/smable3/entity/BleRecordPacket;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "recordPacket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleCache;->getMPlatform()Ljava/lang/String;

    move-result-object v0

    const-string v1, "SIFLI"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->oldReceiveRecordPacketSC(Lcom/szabh/smable3/entity/BleRecordPacket;)V

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->oldReceiveRecordPacketJL(Lcom/szabh/smable3/entity/BleRecordPacket;)V

    return-void
.end method

.method public final oldReceiveRecordPacketJL(Lcom/szabh/smable3/entity/BleRecordPacket;)V
    .locals 7
    .param p1    # Lcom/szabh/smable3/entity/BleRecordPacket;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "recordPacket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->OIXOOi()Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-nez v1, :cond_11

    sget v1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mAIMode:I

    if-ne v1, v4, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->IiX1ii()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleRecordPacket;->getMStatus()I

    move-result v0

    if-eqz v0, :cond_7

    if-eq v0, v5, :cond_6

    if-eq v0, v4, :cond_2

    if-eq v0, v3, :cond_1

    goto/16 :goto_7

    :cond_1
    invoke-direct {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->stopRealTime()V

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->stop()V

    sget-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mOpusManager:Lcom/sma/smartv3/biz/voice/OpusManager;

    if-eqz p1, :cond_1c

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/OpusManager;->stopDecodeStream()V

    return-void

    :cond_2
    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object v0, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleCache;->getMPlatform()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "AIManager VoiceManager BleRecordPacket oldReceiveRecordPacketJL END  BleCache.mPlatform = "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sput-boolean v2, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSpeechRecRunning:Z

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSupportEarPhoneVoiceAIChat()Z

    move-result p1

    if-nez p1, :cond_4

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSupportEarPhoneVoiceTranslation()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    sget-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mOpusManager:Lcom/sma/smartv3/biz/voice/OpusManager;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/OpusManager;->stopDecodeStream()V

    goto :goto_1

    :cond_4
    :goto_0
    sget-object p1, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/RecordingManager;->stopRecording()V

    :cond_5
    :goto_1
    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->endTransfer()V

    return-void

    :cond_6
    sput-boolean v5, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSpeechRecRunning:Z

    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mOpusManager:Lcom/sma/smartv3/biz/voice/OpusManager;

    if-eqz v0, :cond_1c

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleRecordPacket;->getMPacket()[B

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/biz/voice/OpusManager;->writeAudioStream([B)V

    return-void

    :cond_7
    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v0, "AIManager VoiceManager BleRecordPacket oldReceiveRecordPacketJL "

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->stopRealTime()V

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->stop()V

    invoke-direct {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->startRealTime()V

    sget-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mOpusManager:Lcom/sma/smartv3/biz/voice/OpusManager;

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/OpusManager;->stopDecodeStream()V

    :cond_8
    sget-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mOpusManager:Lcom/sma/smartv3/biz/voice/OpusManager;

    if-eqz p1, :cond_1c

    new-instance v0, Lcom/sma/smartv3/biz/voice/VoiceManager$oldReceiveRecordPacketJL$2;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/voice/VoiceManager$oldReceiveRecordPacketJL$2;-><init>()V

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/biz/voice/OpusManager;->startDecodeStream(Lcom/sma/smartv3/biz/voice/OpusManager$OnDecodeStreamCallback;)V

    return-void

    :cond_9
    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleRecordPacket;->getMStatus()I

    move-result v0

    if-eqz v0, :cond_10

    if-eq v0, v5, :cond_f

    if-eq v0, v4, :cond_a

    if-eq v0, v3, :cond_10

    goto/16 :goto_7

    :cond_a
    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object v0, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleCache;->getMPlatform()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AIManager VoiceManager BleRecordPacket oldReceiveRecordPacketJL  openai  end  BleCache.mPlatform = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSupportEarPhoneVoiceAIChat()Z

    move-result p1

    if-nez p1, :cond_e

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSupportEarPhoneVoiceTranslation()Z

    move-result p1

    if-eqz p1, :cond_b

    goto :goto_2

    :cond_b
    sget-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mOpusFile:Ljava/io/File;

    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/io/File;)Z

    move-result v0

    if-nez v0, :cond_c

    goto/16 :goto_7

    :cond_c
    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->stop()V

    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mOpusManager:Lcom/sma/smartv3/biz/voice/OpusManager;

    if-eqz v0, :cond_d

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    const-string v1, "getPath(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lcom/sma/smartv3/biz/voice/VoiceManager;->mPcmFile:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/biz/voice/VoiceManager$oldReceiveRecordPacketJL$3;

    invoke-direct {v1}, Lcom/sma/smartv3/biz/voice/VoiceManager$oldReceiveRecordPacketJL$3;-><init>()V

    invoke-virtual {v0, p1, v2, v1}, Lcom/sma/smartv3/biz/voice/OpusManager;->decodeFile(Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/biz/voice/OpusManager$OnStateCallback;)V

    :cond_d
    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->endTransfer()V

    return-void

    :cond_e
    :goto_2
    sget-object p1, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/RecordingManager;->stopRecording()V

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->endTransfer()V

    return-void

    :cond_f
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->goOnTransfer(Lcom/szabh/smable3/entity/BleRecordPacket;)V

    return-void

    :cond_10
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "AIManager VoiceManager BleRecordPacket oldReceiveRecordPacketJL  openai  START"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleRecordPacket;->getMStatus()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->startTransfer(I)V

    return-void

    :cond_11
    :goto_3
    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleRecordPacket;->getMStatus()I

    move-result v1

    const/4 v6, 0x0

    if-eqz v1, :cond_19

    if-eq v1, v5, :cond_16

    if-eq v1, v4, :cond_13

    if-eq v1, v3, :cond_12

    goto/16 :goto_7

    :cond_12
    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->stop()V

    sget-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mOpusManager:Lcom/sma/smartv3/biz/voice/OpusManager;

    if-eqz p1, :cond_1c

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/OpusManager;->stopDecodeStream()V

    return-void

    :cond_13
    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object v1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v1}, Lcom/szabh/smable3/component/BaseBleCache;->getMPlatform()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->OIXOOi()Z

    move-result v0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "AIManager VoiceManager BleRecordPacket oldReceiveRecordPacketJL END ,  BleCache.mPlatform = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "  isSupportSparkChainAI = "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSupportEarPhoneVoiceAIChat()Z

    move-result p1

    if-nez p1, :cond_15

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSupportEarPhoneVoiceTranslation()Z

    move-result p1

    if-eqz p1, :cond_14

    goto :goto_4

    :cond_14
    sput-boolean v2, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSpeechRecRunning:Z

    sget-object p1, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object p1

    invoke-static {p1, v2, v2, v3, v6}, Lcom/sma/smartv3/biz/voice/RecordingManager;->realTimeASRend$default(Lcom/sma/smartv3/biz/voice/RecordingManager;IIILjava/lang/Object;)V

    goto :goto_5

    :cond_15
    :goto_4
    sget-object p1, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/RecordingManager;->stopRecording()V

    :goto_5
    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->endTransfer()V

    return-void

    :cond_16
    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSupportEarPhoneVoiceAIChat()Z

    move-result v0

    if-nez v0, :cond_18

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSupportEarPhoneVoiceTranslation()Z

    move-result v0

    if-eqz v0, :cond_17

    goto :goto_6

    :cond_17
    sput-boolean v5, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSpeechRecRunning:Z

    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mOpusManager:Lcom/sma/smartv3/biz/voice/OpusManager;

    if-eqz v0, :cond_1c

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleRecordPacket;->getMPacket()[B

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/biz/voice/OpusManager;->writeAudioStream([B)V

    return-void

    :cond_18
    :goto_6
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->goOnTransfer(Lcom/szabh/smable3/entity/BleRecordPacket;)V

    return-void

    :cond_19
    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->OIXOOi()Z

    move-result v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "AIManager VoiceManager BleRecordPacket oldReceiveRecordPacketJL , isSupportSparkChainAI = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSupportEarPhoneVoiceAIChat()Z

    move-result v0

    if-nez v0, :cond_1d

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSupportEarPhoneVoiceTranslation()Z

    move-result v0

    if-eqz v0, :cond_1a

    goto :goto_8

    :cond_1a
    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->stop()V

    sget-object p1, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->deleteReplayMusic()V

    sget-object p1, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object p1

    invoke-static {p1, v6, v5, v6}, Lcom/sma/smartv3/biz/voice/RecordingManager;->startRealTimeASR$default(Lcom/sma/smartv3/biz/voice/RecordingManager;Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;ILjava/lang/Object;)V

    sget-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mOpusManager:Lcom/sma/smartv3/biz/voice/OpusManager;

    if-eqz p1, :cond_1b

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/OpusManager;->stopDecodeStream()V

    :cond_1b
    sget-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mOpusManager:Lcom/sma/smartv3/biz/voice/OpusManager;

    if-eqz p1, :cond_1c

    new-instance v0, Lcom/sma/smartv3/biz/voice/VoiceManager$oldReceiveRecordPacketJL$1;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/voice/VoiceManager$oldReceiveRecordPacketJL$1;-><init>()V

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/biz/voice/OpusManager;->startDecodeStream(Lcom/sma/smartv3/biz/voice/OpusManager$OnDecodeStreamCallback;)V

    :cond_1c
    :goto_7
    return-void

    :cond_1d
    :goto_8
    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleRecordPacket;->getMStatus()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->startTransfer(I)V

    return-void
.end method

.method public final oldReceiveRecordPacketSC(Lcom/szabh/smable3/entity/BleRecordPacket;)V
    .locals 7
    .param p1    # Lcom/szabh/smable3/entity/BleRecordPacket;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "recordPacket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleRecordPacket;->getMStatus()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x2

    const/4 v4, 0x3

    if-eqz v0, :cond_c

    if-eq v0, v2, :cond_8

    if-eq v0, v3, :cond_1

    if-eq v0, v4, :cond_0

    goto/16 :goto_1

    :cond_0
    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v0, "AIManager VoiceManager BleRecordPacket oldReceiveRecordPacketSC Suspend \u53d13\u9000\u51fa"

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void

    :cond_1
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object v2, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v2}, Lcom/szabh/smable3/component/BaseBleCache;->getMPlatform()Ljava/lang/String;

    move-result-object v2

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "AIManager VoiceManager BleRecordPacket oldReceiveRecordPacketSC END --> BleCache.mPlatform = "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->stop()V

    const/4 v0, 0x0

    sput-boolean v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->isEndInOperation:Z

    sget-object v2, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/q62;->OIXOOi()Z

    move-result v2

    if-nez v2, :cond_2

    sget v2, Lcom/sma/smartv3/biz/voice/VoiceManager;->mAIMode:I

    if-ne v2, v3, :cond_3

    :cond_2
    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleRecordPacket;->getMMode()I

    move-result p1

    if-ge p1, v4, :cond_3

    sget-object p1, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object p1

    invoke-static {p1, v0, v0, v4, v1}, Lcom/sma/smartv3/biz/voice/RecordingManager;->realTimeASRend$default(Lcom/sma/smartv3/biz/voice/RecordingManager;IIILjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->endTransfer()V

    return-void

    :cond_3
    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSupportEarPhoneVoiceAIChat()Z

    move-result p1

    if-nez p1, :cond_7

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSupportEarPhoneVoiceTranslation()Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_0

    :cond_4
    sget-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mOpusFile:Ljava/io/File;

    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/io/File;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_1

    :cond_5
    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mOpusManager:Lcom/sma/smartv3/biz/voice/OpusManager;

    if-eqz v0, :cond_6

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    const-string v1, "getAbsolutePath(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lcom/sma/smartv3/biz/voice/VoiceManager;->mPcmFile:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/aj6;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/aj6;-><init>()V

    invoke-virtual {v0, p1, v2, v1}, Lcom/sma/smartv3/biz/voice/OpusManager;->decodeStream(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    :cond_6
    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->endTransfer()V

    return-void

    :cond_7
    :goto_0
    sget-object p1, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/RecordingManager;->stopRecording()V

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->endTransfer()V

    return-void

    :cond_8
    sget-boolean v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->isEndInOperation:Z

    if-eqz v0, :cond_b

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->OIXOOi()Z

    move-result v0

    if-nez v0, :cond_9

    sget v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mAIMode:I

    if-ne v0, v3, :cond_a

    :cond_9
    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleRecordPacket;->getMMode()I

    move-result v0

    if-ge v0, v4, :cond_a

    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mOpusManager:Lcom/sma/smartv3/biz/voice/OpusManager;

    if-eqz v0, :cond_b

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleRecordPacket;->getMPacket()[B

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/biz/voice/OpusManager;->writeAudioStream([B)V

    return-void

    :cond_a
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->goOnTransfer(Lcom/szabh/smable3/entity/BleRecordPacket;)V

    :cond_b
    :goto_1
    return-void

    :cond_c
    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->OIXOOi()Z

    move-result v0

    if-nez v0, :cond_d

    sget v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mAIMode:I

    if-ne v0, v3, :cond_f

    :cond_d
    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleRecordPacket;->getMStatus()I

    move-result v0

    if-nez v0, :cond_f

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleRecordPacket;->getMMode()I

    move-result v0

    if-ge v0, v4, :cond_f

    sput-boolean v2, Lcom/sma/smartv3/biz/voice/VoiceManager;->isEndInOperation:Z

    sget-object v0, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object v0

    invoke-static {v0, v1, v2, v1}, Lcom/sma/smartv3/biz/voice/RecordingManager;->startRealTimeASR$default(Lcom/sma/smartv3/biz/voice/RecordingManager;Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;ILjava/lang/Object;)V

    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mOpusManager:Lcom/sma/smartv3/biz/voice/OpusManager;

    if-eqz v0, :cond_e

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/OpusManager;->stopDecodeStream()V

    :cond_e
    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mOpusManager:Lcom/sma/smartv3/biz/voice/OpusManager;

    if-eqz v0, :cond_f

    new-instance v1, Lcom/sma/smartv3/biz/voice/VoiceManager$oldReceiveRecordPacketSC$1;

    invoke-direct {v1}, Lcom/sma/smartv3/biz/voice/VoiceManager$oldReceiveRecordPacketSC$1;-><init>()V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/voice/OpusManager;->startDecodeStream(Lcom/sma/smartv3/biz/voice/OpusManager$OnDecodeStreamCallback;)V

    :cond_f
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "AIManager VoiceManager BleRecordPacket oldReceiveRecordPacketSC START"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleRecordPacket;->getMStatus()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->startTransfer(I)V

    return-void
.end method

.method public final onStopVoice(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "STOP_VOICE"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v0, "AIManager VoiceManager onStopVoice"

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->stop()V

    return-void
.end method

.method public final onVoiceQuery(Ljava/lang/String;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "VOICE_QUERY"
    .end annotation

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AIManager VoiceManager onVoiceQuery -> app: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    const/4 v0, 0x0

    sput v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mVoiceMode:I

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->stop()V

    invoke-direct {p0, p1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->sendMsg(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->voiceQuery(Ljava/lang/String;)V

    return-void
.end method

.method public final openAiChatCompletion(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = "\u8fd9\u79cd\u9700\u8981aikey\u76f4\u8fdeopenai\u7684\u65b9\u5f0f\u540e\u9762\u8981\u5e9f\u5f03"
    .end annotation

    const-string v0, "query"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/sma/smartv3/biz/voice/VoiceManager$openAiChatCompletion$1;

    invoke-direct {v0, p1}, Lcom/sma/smartv3/biz/voice/VoiceManager$openAiChatCompletion$1;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mOpenAiTask:Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;

    invoke-static {v0}, Lcom/blankj/utilcode/util/ThreadUtils;->executeByIo(Lcom/blankj/utilcode/util/ThreadUtils$Task;)V

    return-void
.end method

.method public final openAiCheck(Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Landroid/app/Activity;Landroid/view/View;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/android/mltcode/paycertificationapi/O1XIiIO;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p3    # Landroid/app/Activity;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p4    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
            "Ljava/lang/String;",
            ">;",
            "Landroid/app/Activity;",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    const-string v0, "aikey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    if-eqz p3, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/uq;

    invoke-direct {v0, p3}, Lcom/android/mltcode/paycertificationapi/uq;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v0, p4}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    :cond_0
    sget-object p3, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string p4, "AIManager VoiceManager openAiCheck"

    invoke-virtual {p3, p4}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    const-string p3, "https://api.openai.com/v1/chat/completions"

    invoke-static {p3}, Lcom/androidnetworking/AndroidNetworking;->post(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p3

    const-string p4, "application/json"

    invoke-virtual {p3, p4}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setContentType(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p3

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Bearer "

    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p4, "Authorization"

    invoke-virtual {p3, p4, p1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addHeaders(Ljava/lang/String;Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    sget-object v1, Lcom/sma/smartv3/biz/AIManager;->OXO1:Lcom/sma/smartv3/biz/AIManager;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string v2, "hello"

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/sma/smartv3/biz/AIManager;->OiIIX101O(Lcom/sma/smartv3/biz/AIManager;Ljava/lang/String;ZIILjava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    sget-object p4, Lkotlin/text/Charsets;->XIi00iiXO:Ljava/nio/charset/Charset;

    invoke-virtual {p3, p4}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p3

    const-string p4, "getBytes(...)"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p3}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addByteBody([B)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    sget-object p3, Lcom/androidnetworking/common/Priority;->LOW:Lcom/androidnetworking/common/Priority;

    invoke-virtual {p1, p3}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    const-string p3, "openAiChatCompletion"

    invoke-virtual {p1, p3}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object p1

    new-instance p3, Lcom/sma/smartv3/biz/voice/VoiceManager$openAiCheck$1;

    invoke-direct {p3, v0, p2}, Lcom/sma/smartv3/biz/voice/VoiceManager$openAiCheck$1;-><init>(Lcom/android/mltcode/paycertificationapi/uq;Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {p1, p3}, Lcom/androidnetworking/common/ANRequest;->getAsJSONObject(Lcom/androidnetworking/interfaces/JSONObjectRequestListener;)V

    return-void
.end method

.method public final openAiTranscriptionsAudio(Ljava/io/File;Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V
    .locals 5
    .param p1    # Ljava/io/File;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/android/mltcode/paycertificationapi/O1XIiIO;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "file"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "AIManager VoiceManager openAiTranscriptionsAudio -> "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->iIiiO()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v1}, Lkotlin/text/StringsKt__StringsKt;->i0XI0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const-string v2, "https://api.openai.com/v1/audio/transcriptions"

    invoke-static {v2}, Lcom/androidnetworking/AndroidNetworking;->upload(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Bearer "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, "Authorization"

    invoke-virtual {v2, v3, v1}, Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;->addHeaders(Ljava/lang/String;Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;

    move-result-object v1

    const-string v2, "model"

    const-string v3, "whisper-1"

    invoke-virtual {v1, v2, v3}, Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;->addMultipartParameter(Ljava/lang/String;Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;

    move-result-object v1

    invoke-virtual {v1, v0, p1}, Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;->addMultipartFile(Ljava/lang/String;Ljava/io/File;)Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;

    move-result-object p1

    const-string v0, "openAiTranscriptionsAudio"

    invoke-virtual {p1, v0}, Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;

    move-result-object p1

    sget-object v0, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {p1, v0}, Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object p1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ej6;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/ej6;-><init>()V

    invoke-virtual {p1, v0}, Lcom/androidnetworking/common/ANRequest;->setUploadProgressListener(Lcom/androidnetworking/interfaces/UploadProgressListener;)Lcom/androidnetworking/common/ANRequest;

    move-result-object p1

    new-instance v0, Lcom/sma/smartv3/biz/voice/VoiceManager$openAiTranscriptionsAudio$2;

    invoke-direct {v0, p2}, Lcom/sma/smartv3/biz/voice/VoiceManager$openAiTranscriptionsAudio$2;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {p1, v0}, Lcom/androidnetworking/common/ANRequest;->getAsJSONObject(Lcom/androidnetworking/interfaces/JSONObjectRequestListener;)V

    return-void

    :cond_1
    :goto_0
    if-eqz p2, :cond_2

    const-string p1, "invalid_request_error"

    invoke-interface {p2, p1}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleError(Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public final postEvent(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "tag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O11XO1X;->XO0O10()Lcom/android/mltcode/paycertificationapi/O11XO1X;

    move-result-object v0

    invoke-virtual {v0, p2, p1}, Lcom/android/mltcode/paycertificationapi/O11XO1X;->OIX0iXi(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final recognition()V
    .locals 1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->OIXOOi()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->sendAISparkChainIdentify()V

    return-void

    :cond_0
    new-instance v0, Lcom/sma/smartv3/biz/voice/VoiceManager$recognition$1;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/voice/VoiceManager$recognition$1;-><init>()V

    invoke-static {v0}, Lcom/blankj/utilcode/util/ThreadUtils;->executeByIo(Lcom/blankj/utilcode/util/ThreadUtils$Task;)V

    return-void
.end method

.method public final refreshToken(Lkotlin/jvm/functions/Function1;)V
    .locals 7
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "AIManager VoiceManager refreshToken"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    sget-object v1, Lcom/sma/smartv3/network/GetDcsToken;->INSTANCE:Lcom/sma/smartv3/network/GetDcsToken;

    invoke-virtual {v1}, Lcom/sma/smartv3/network/GetDcsToken;->getURL()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/sma/smartv3/network/RequestBodyKt;->getDcsTokenBody()Ljava/util/HashMap;

    move-result-object v2

    new-instance v3, Lcom/sma/smartv3/biz/voice/VoiceManager$refreshToken$1;

    invoke-direct {v3, p1}, Lcom/sma/smartv3/biz/voice/VoiceManager$refreshToken$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    const/4 p1, 0x0

    invoke-virtual {v0, p1, p1}, Lcom/sma/smartv3/network/NetWorkUtils;->loadPopup(Landroid/app/Activity;Landroid/view/View;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object v4

    sget-object v5, Lcom/sma/smartv3/network/Api;->INSTANCE:Lcom/sma/smartv3/network/Api;

    invoke-virtual {v5}, Lcom/sma/smartv3/network/Api;->getBASE_URL()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5, v1}, Lcom/sma/smartv3/network/NetWorkUtils;->convertBaseUrl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6, v2}, Lcom/sma/smartv3/network/NetWorkUtils;->printParam(Ljava/lang/String;Ljava/util/Map;)V

    sget-object v0, Lcom/sma/androidnetworklib/method/NetWork;->OXO1:Lcom/sma/androidnetworklib/method/NetWork;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/biz/voice/VoiceManager$refreshToken$$inlined$post$default$1;

    invoke-direct {v1, p1, v3, v4}, Lcom/sma/smartv3/biz/voice/VoiceManager$refreshToken$$inlined$post$default$1;-><init>(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Lcom/android/mltcode/paycertificationapi/uq;)V

    invoke-static {v0}, Lcom/androidnetworking/AndroidNetworking;->post(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1, v2}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addBodyParameter(Ljava/util/Map;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    sget-object v0, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {p1, v0}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object p1

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/reflect/Type;

    const-class v2, Lcom/sma/smartv3/biz/dcs/DcsToken;

    const/4 v3, 0x0

    aput-object v2, v0, v3

    const-class v2, Lcom/sma/androidnetworklib/model/Response;

    invoke-static {v2, v0}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v0

    new-instance v2, Lcom/sma/smartv3/biz/voice/VoiceManager$refreshToken$$inlined$post$default$2;

    invoke-direct {v2, v1}, Lcom/sma/smartv3/biz/voice/VoiceManager$refreshToken$$inlined$post$default$2;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {p1, v0, v2}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    return-void
.end method

.method public final resetPlayStatus()V
    .locals 7

    const-string v0, "_list"

    const-class v1, Lcom/sma/smartv3/biz/voice/VoiceMessage;

    sget-object v2, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v2

    :try_start_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/google/gson/JsonParser;->parseString(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/gson/JsonElement;->getAsJsonArray()Lcom/google/gson/JsonArray;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/gson/JsonElement;

    new-instance v5, Lcom/google/gson/Gson;

    invoke-direct {v5}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v5, v4, v1}, Lcom/google/gson/Gson;->fromJson(Lcom/google/gson/JsonElement;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object v3

    :cond_0
    check-cast v3, Ljava/util/Collection;

    invoke-static {v3}, Lkotlin/collections/CollectionsKt___CollectionsKt;->OO0Oi10(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sma/smartv3/biz/voice/VoiceMessage;

    invoke-virtual {v4}, Lcom/sma/smartv3/biz/voice/VoiceMessage;->getMType()I

    move-result v5

    const/4 v6, 0x3

    if-ne v5, v6, :cond_1

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Lcom/sma/smartv3/biz/voice/VoiceMessage;->setMStatus(I)V

    goto :goto_1

    :cond_2
    sget-object v3, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v1, v2}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    const-string v1, "SEND_VOICE"

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, v3, v2, v3}, Lcom/sma/smartv3/biz/voice/VoiceManager;->postEvent$default(Lcom/sma/smartv3/biz/voice/VoiceManager;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method public final senAudioTextToDevice(Lcom/szabh/smable3/entity/BleVoice;)V
    .locals 9
    .param p1    # Lcom/szabh/smable3/entity/BleVoice;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "voice"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->I0OX()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v2, Lcom/szabh/smable3/BleKey;->AUDIO_TEXT:Lcom/szabh/smable3/BleKey;

    sget-object v3, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v4, p1

    invoke-static/range {v1 .. v8}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final sendAISparkChainIdentify()V
    .locals 6

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "AIManager VoiceManager sendAISparkChainIdentify  pcm -> wav"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    new-instance v2, Lcom/android/mltcode/paycertificationapi/gq1;

    const/16 v3, 0x10

    const/4 v4, 0x2

    const/16 v5, 0x3e80

    invoke-direct {v2, v5, v3, v4}, Lcom/android/mltcode/paycertificationapi/gq1;-><init>(III)V

    sget-object v3, Lcom/sma/smartv3/biz/voice/VoiceManager;->mPcmFile:Ljava/io/File;

    invoke-virtual {v3}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lcom/sma/smartv3/biz/voice/VoiceManager;->mWavFile:Ljava/io/File;

    invoke-virtual {v4}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/android/mltcode/paycertificationapi/gq1;->OXO1(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    new-instance v0, Lcom/sma/smartv3/biz/voice/VoiceManager$sendAISparkChainIdentify$2;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/voice/VoiceManager$sendAISparkChainIdentify$2;-><init>()V

    invoke-static {v0}, Lcom/blankj/utilcode/util/ThreadUtils;->executeByIo(Lcom/blankj/utilcode/util/ThreadUtils$Task;)V

    return-void
.end method

.method public final sendAISparkChainTranslation()V
    .locals 7

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->OIXOOi()Z

    move-result v0

    if-eqz v0, :cond_1

    sget v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mAIMode:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sma/smartv3/biz/voice/VoiceManager$sendAISparkChainTranslation$1;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/voice/VoiceManager$sendAISparkChainTranslation$1;-><init>()V

    invoke-static {v0}, Lcom/blankj/utilcode/util/ThreadUtils;->executeByIo(Lcom/blankj/utilcode/util/ThreadUtils$Task;)V

    return-void

    :cond_1
    :goto_0
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Unauthorized"

    invoke-static {v1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object v2, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v2}, Lcom/szabh/smable3/component/BaseBleCache;->getMBleName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lcom/szabh/smable3/component/BaseBleCache;->getMFirmwareFlag()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lcom/szabh/smable3/component/BaseBleCache;->getMBleAddress()Ljava/lang/String;

    move-result-object v2

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "AIManager VoiceManager  translation It does not support sparkAIService, need to configure the current device , "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "  "

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XIi00iiXO(Ljava/lang/String;)V

    const-string v0, "\u4e0d\u652f\u6301\u7ffb\u8bd1"

    invoke-virtual {p0, v0, v1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->sendTranslationResult(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final sendTranslationResult(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "inputText"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "outputText"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->sendTranslationResultInput(Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Lcom/sma/smartv3/biz/voice/VoiceManager;->sendTranslationResultOutput(Ljava/lang/String;)V

    return-void
.end method

.method public final sendTranslationResultInput(Ljava/lang/String;)V
    .locals 11
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "inputText"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-static {p1}, Lkotlin/text/StringsKt__StringsKt;->iX1X1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v8

    sget v4, Lcom/sma/smartv3/biz/voice/VoiceManager;->mVoiceMode:I

    new-instance v1, Lcom/szabh/smable3/entity/BleVoice;

    const/16 v9, 0xa

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v10}, Lcom/szabh/smable3/entity/BleVoice;-><init>(IIILcom/szabh/smable3/entity/BleVoice$BleDeviceEmotion;JLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0, v1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->senAudioTextToDevice(Lcom/szabh/smable3/entity/BleVoice;)V

    return-void
.end method

.method public final sendTranslationResultOutput(Ljava/lang/String;)V
    .locals 11
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "outputText"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-static {p1}, Lkotlin/text/StringsKt__StringsKt;->iX1X1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v8

    sget v4, Lcom/sma/smartv3/biz/voice/VoiceManager;->mVoiceMode:I

    new-instance v1, Lcom/szabh/smable3/entity/BleVoice;

    const/16 v9, 0xa

    const/4 v10, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v10}, Lcom/szabh/smable3/entity/BleVoice;-><init>(IIILcom/szabh/smable3/entity/BleVoice$BleDeviceEmotion;JLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0, v1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->senAudioTextToDevice(Lcom/szabh/smable3/entity/BleVoice;)V

    return-void
.end method

.method public final setAIMode(I)V
    .locals 0

    sput p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mAIMode:I

    return-void
.end method

.method public final setActivityData(Z)V
    .locals 0

    sput-boolean p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->isActivityData:Z

    return-void
.end method

.method public final setEndInOperation(Z)V
    .locals 0

    sput-boolean p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->isEndInOperation:Z

    return-void
.end method

.method public final setLanguageType(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "language"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mTtsName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSupportEarPhoneVoiceTranslation()Z

    move-result p1

    const-string p2, "zh"

    const/4 v0, 0x0

    if-nez p1, :cond_6

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSupportAIVoiceTranslation()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mApp:Landroid/app/Application;

    if-nez p1, :cond_1

    const-string p1, "mApp"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v0

    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    iget-object p1, p1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {p1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    const-string p1, "zh-CN"

    sput-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->microsoftLanguage:Ljava/lang/String;

    const-string p1, "zh-CN-XiaoxiaoNeural"

    sput-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->microsoftTtsName:Ljava/lang/String;

    return-void

    :cond_2
    invoke-static {}, Lcom/sma/smartv3/model/LanguageTranslationKt;->getTranslationLanguageList()Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/sma/smartv3/model/LanguageTranslationData;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/LanguageTranslationData;->getRtasrLanguage()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    move-object v0, v1

    :cond_4
    check-cast v0, Lcom/sma/smartv3/model/LanguageTranslationData;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/sma/smartv3/model/LanguageTranslationData;->getAsrLanguage()Ljava/lang/String;

    move-result-object p1

    sput-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->microsoftLanguage:Ljava/lang/String;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/LanguageTranslationData;->getTtsViuceName()Ljava/lang/String;

    move-result-object p1

    sput-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->microsoftTtsName:Ljava/lang/String;

    return-void

    :cond_5
    const-string p1, "en-US"

    sput-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->microsoftLanguage:Ljava/lang/String;

    const-string p1, "en-US-AvaMultilingualNeural"

    sput-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->microsoftTtsName:Ljava/lang/String;

    return-void

    :cond_6
    :goto_0
    sget-object p1, Lcom/szabh/smable3/entity/Languages;->INSTANCE:Lcom/szabh/smable3/entity/Languages;

    sget v1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mLanguage:I

    invoke-virtual {p1, v1, p2}, Lcom/szabh/smable3/entity/Languages;->formatMicrosoftTargetLang(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/sma/smartv3/biz/voice/VoiceManager;->mToLanguage:I

    invoke-virtual {p1, v2, p2}, Lcom/szabh/smable3/entity/Languages;->formatMicrosoftTargetLang(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Lcom/sma/smartv3/model/LanguageTranslationKt;->getTranslationLanguageList()Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_7
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/sma/smartv3/model/LanguageTranslationData;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/LanguageTranslationData;->getRtasrLanguage()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    goto :goto_1

    :cond_8
    move-object v2, v0

    :goto_1
    check-cast v2, Lcom/sma/smartv3/model/LanguageTranslationData;

    invoke-static {}, Lcom/sma/smartv3/model/LanguageTranslationKt;->getTranslationLanguageList()Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_9
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/sma/smartv3/model/LanguageTranslationData;

    invoke-virtual {v4}, Lcom/sma/smartv3/model/LanguageTranslationData;->getRtasrLanguage()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_9

    move-object v0, v3

    :cond_a
    check-cast v0, Lcom/sma/smartv3/model/LanguageTranslationData;

    if-eqz v2, :cond_b

    invoke-virtual {v2}, Lcom/sma/smartv3/model/LanguageTranslationData;->getAsrLanguage()Ljava/lang/String;

    move-result-object p1

    sput-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->microsoftLanguage:Ljava/lang/String;

    :cond_b
    if-eqz v0, :cond_c

    invoke-virtual {v0}, Lcom/sma/smartv3/model/LanguageTranslationData;->getTtsViuceName()Ljava/lang/String;

    move-result-object p1

    sput-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->microsoftTtsName:Ljava/lang/String;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/LanguageTranslationData;->getAsrLanguage()Ljava/lang/String;

    move-result-object p1

    sput-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->microsoftTtsLanguage:Ljava/lang/String;

    :cond_c
    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    if-nez v2, :cond_d

    const/4 p2, 0x1

    goto :goto_2

    :cond_d
    const/4 p2, 0x0

    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AIManager VoiceManager formatMicrosoftTargetLang language = "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " , translationLanguage = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void

    :cond_e
    sput-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->microsoftLanguage:Ljava/lang/String;

    sput-object p2, Lcom/sma/smartv3/biz/voice/VoiceManager;->microsoftTtsName:Ljava/lang/String;

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

    sput-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mContentResult:Ljava/lang/String;

    return-void
.end method

.method public final setMLanguage(I)V
    .locals 0

    sput p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mLanguage:I

    return-void
.end method

.method public final setMListener(Lkotlin/jvm/functions/Function3;)V
    .locals 0
    .param p1    # Lkotlin/jvm/functions/Function3;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    sput-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mListener:Lkotlin/jvm/functions/Function3;

    return-void
.end method

.method public final setMSavePcmTime(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mSavePcmTime:Ljava/lang/String;

    return-void
.end method

.method public final setMToLanguage(I)V
    .locals 0

    sput p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mToLanguage:I

    return-void
.end method

.method public final setMVoiceMode(I)V
    .locals 0

    sput p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mVoiceMode:I

    return-void
.end method

.method public final setMVoiceType(I)V
    .locals 0

    sput p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mVoiceType:I

    return-void
.end method

.method public final setMicrosoftCallback()V
    .locals 3

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->setRecordingCallback()V

    sget-object v0, Lcom/sma/smartv3/util/MicrosoftSDKManage;->O1O:Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;

    invoke-virtual {v0}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v0

    sget-object v1, Lcom/sma/smartv3/biz/voice/VoiceManager;->microsoftCallBack:Lcom/sma/smartv3/util/MicrosoftSDKManage$iO;

    const-string v2, "AIManager VoiceManager"

    invoke-virtual {v0, v1, v2}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->iIi1(Lcom/sma/smartv3/util/MicrosoftSDKManage$iO;Ljava/lang/String;)V

    return-void
.end method

.method public final setMicrosoftLanguage(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->microsoftLanguage:Ljava/lang/String;

    return-void
.end method

.method public final setMicrosoftTime(J)V
    .locals 0

    sput-wide p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->microsoftTime:J

    return-void
.end method

.method public final setMicrosoftTtsLanguage(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->microsoftTtsLanguage:Ljava/lang/String;

    return-void
.end method

.method public final setMicrosoftTtsName(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->microsoftTtsName:Ljava/lang/String;

    return-void
.end method

.method public final setReceiveRecordPacket(Z)V
    .locals 0

    sput-boolean p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->isReceiveRecordPacket:Z

    return-void
.end method

.method public final setRecordBluetooth(Z)V
    .locals 0

    sput-boolean p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->isRecordBluetooth:Z

    return-void
.end method

.method public final setRecordingCallback()V
    .locals 2

    sget-object v0, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object v0

    sget-object v1, Lcom/sma/smartv3/biz/voice/VoiceManager;->recordingCallBack:Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/voice/RecordingManager;->setRecordingCallback(Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;)V

    return-void
.end method

.method public final setResetCallBack(Z)V
    .locals 0

    sput-boolean p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->resetCallBack:Z

    return-void
.end method

.method public final setSendResults(Z)V
    .locals 0

    sput-boolean p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSendResults:Z

    return-void
.end method

.method public final setSpeechRecRunning(Z)V
    .locals 0

    sput-boolean p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSpeechRecRunning:Z

    return-void
.end method

.method public final startRecord()V
    .locals 1

    sget-object v0, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/RecordingManager;->startRecord()V

    return-void
.end method

.method public final startTransfer(I)V
    .locals 3

    if-nez p1, :cond_0

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AIManager VoiceManager startTransfer delete  File  start = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->deleteFiles()V

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->stop()V

    if-nez p1, :cond_3

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSupportEarPhoneVoiceAIChat()Z

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSupportEarPhoneVoiceTranslation()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    sget-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mOpusManager:Lcom/sma/smartv3/biz/voice/OpusManager;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/OpusManager;->stopDecodeStream()V

    goto :goto_1

    :cond_2
    :goto_0
    sget-object p1, Lcom/sma/smartv3/biz/VoiceService;->I1:Lcom/sma/smartv3/biz/VoiceService$OXO1;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/VoiceService$OXO1;->iO()V

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->voiceRecord()V

    :cond_3
    :goto_1
    sget-object p1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/q62;->OIXOOi()Z

    move-result p1

    if-eqz p1, :cond_4

    sget-object p1, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1:Lcom/sma/smartv3/biz/AISparkChainManager;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/biz/AISparkChainManager;->Ii0i(Z)V

    :cond_4
    return-void
.end method

.method public final stop()V
    .locals 2

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "AIManager VoiceManager -> stop"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    const/4 v0, 0x0

    sput-boolean v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->isAiTaskRunning:Z

    sput-boolean v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSpeechRecRunning:Z

    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mOpenAiTask:Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/blankj/utilcode/util/ThreadUtils;->cancel(Lcom/blankj/utilcode/util/ThreadUtils$Task;)V

    :cond_0
    sget-object v0, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleCache;->getMFirmwareFlag()Ljava/lang/String;

    move-result-object v0

    const-string v1, "BLACK_SHARK_S1_PRO"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mDuserTask:Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;

    if-eqz v0, :cond_1

    invoke-static {v0}, Lcom/blankj/utilcode/util/ThreadUtils;->cancel(Lcom/blankj/utilcode/util/ThreadUtils$Task;)V

    :cond_1
    sget-object v0, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1:Lcom/sma/smartv3/biz/AISparkChainManager;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/AISparkChainManager;->iOI()V

    sget-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->stop()V

    sget-object v0, Lcom/sma/smartv3/biz/AIWatchFaceManager;->OXO1:Lcom/sma/smartv3/biz/AIWatchFaceManager;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/AIWatchFaceManager;->OII()V

    sget-object v0, Lcom/sma/smartv3/biz/AIManager;->OXO1:Lcom/sma/smartv3/biz/AIManager;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/AIManager;->XO0X10iO()V

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->resetPlayStatus()V

    return-void
.end method

.method public final stopRecording()V
    .locals 1

    sget-object v0, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/RecordingManager;->stopRecording()V

    return-void
.end method

.method public final toMicrosoftIdentify(Lcom/szabh/smable3/entity/BleRecordPacket;)V
    .locals 9
    .param p1    # Lcom/szabh/smable3/entity/BleRecordPacket;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "recordPacket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleRecordPacket;->getMStatus()I

    move-result v0

    const/4 v1, 0x3

    const/4 v2, 0x1

    if-eqz v0, :cond_8

    if-eq v0, v2, :cond_7

    const/4 v3, 0x2

    if-eq v0, v3, :cond_2

    if-eq v0, v1, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleRecordPacket;->getMStatus()I

    move-result p1

    sput p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mVoiceType:I

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->stop()V

    sget-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mOpusManager:Lcom/sma/smartv3/biz/voice/OpusManager;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/OpusManager;->stopDecodeStream()V

    :cond_1
    sget-object p1, Lcom/sma/smartv3/util/MicrosoftSDKManage;->O1O:Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;

    invoke-virtual {p1}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->X1IX()V

    return-void

    :cond_2
    sget v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mVoiceType:I

    if-nez v0, :cond_f

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleRecordPacket;->getMStatus()I

    move-result p1

    sput p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mVoiceType:I

    const/4 p1, 0x0

    sput-boolean p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSpeechRecRunning:Z

    sget-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mOpusManager:Lcom/sma/smartv3/biz/voice/OpusManager;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/OpusManager;->stopDecodeStream()V

    :cond_3
    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSupportEarPhoneVoiceAIChat()Z

    move-result p1

    if-nez p1, :cond_5

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSupportEarPhoneVoiceTranslation()Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_0

    :cond_4
    sget-object p1, Lcom/sma/smartv3/util/MicrosoftSDKManage;->O1O:Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;

    invoke-virtual {p1}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->Xi()V

    goto :goto_1

    :cond_5
    :goto_0
    sget-object p1, Lcom/sma/smartv3/util/MicrosoftSDKManage;->O1O:Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;

    invoke-virtual {p1}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->XOIO11O()V

    :goto_1
    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->endTransfer()V

    sget-boolean p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->isActivityData:Z

    if-nez p1, :cond_f

    sget-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mContentResult:Ljava/lang/String;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-lez p1, :cond_6

    sput-boolean v2, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSendResults:Z

    sget-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mContentResult:Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->sendContentResult(Ljava/lang/String;)V

    :cond_6
    return-void

    :cond_7
    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mOpusManager:Lcom/sma/smartv3/biz/voice/OpusManager;

    if-eqz v0, :cond_f

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleRecordPacket;->getMPacket()[B

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/biz/voice/OpusManager;->writeAudioStream([B)V

    return-void

    :cond_8
    sget v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mVoiceType:I

    if-eqz v0, :cond_f

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleRecordPacket;->getMStatus()I

    move-result p1

    sput p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mVoiceType:I

    sget-boolean p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSpeechRecRunning:Z

    const/4 v0, 0x0

    if-eqz p1, :cond_9

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-boolean v1, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSpeechRecRunning:Z

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "AIManager VoiceManager toMicrosoftIdentify isSpeechRecRunning = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object p1, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/voice/RecordingManager;->isRecording()Z

    move-result v1

    if-eqz v1, :cond_f

    sget-object v1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-static {v1, v0, v2, v0}, Lcom/android/mltcode/paycertificationapi/q62;->OiO0IOX(Lcom/android/mltcode/paycertificationapi/q62;Lcom/szabh/smable3/entity/BleDeviceInfo;ILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/RecordingManager;->playTip()V

    return-void

    :cond_9
    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->stop()V

    sget-object p1, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->deleteReplayMusic()V

    sget-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mOpusManager:Lcom/sma/smartv3/biz/voice/OpusManager;

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/OpusManager;->stopDecodeStream()V

    :cond_a
    sput-boolean v2, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSpeechRecRunning:Z

    sget-boolean p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->isActivityData:Z

    if-nez p1, :cond_b

    invoke-static {p0, v0, v0, v1, v0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->setLanguageType$default(Lcom/sma/smartv3/biz/voice/VoiceManager;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    :cond_b
    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSupportEarPhoneVoiceAIChat()Z

    move-result p1

    if-nez p1, :cond_e

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSupportEarPhoneVoiceTranslation()Z

    move-result p1

    if-eqz p1, :cond_c

    goto :goto_2

    :cond_c
    sget-object p1, Lcom/sma/smartv3/util/MicrosoftSDKManage;->O1O:Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;

    invoke-virtual {p1}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v0

    sget-object v1, Lcom/sma/smartv3/biz/voice/VoiceManager;->microsoftLanguage:Ljava/lang/String;

    sget-object v3, Lcom/sma/smartv3/biz/voice/VoiceManager;->microsoftTtsName:Ljava/lang/String;

    sget-object v4, Lcom/sma/smartv3/biz/voice/VoiceManager;->microsoftTtsLanguage:Ljava/lang/String;

    const/4 v2, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->iIX0i(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Z)V

    sget-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mOpusManager:Lcom/sma/smartv3/biz/voice/OpusManager;

    if-eqz p1, :cond_d

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/OpusManager;->stopDecodeStream()V

    :cond_d
    sget-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mOpusManager:Lcom/sma/smartv3/biz/voice/OpusManager;

    if-eqz p1, :cond_f

    new-instance v0, Lcom/sma/smartv3/biz/voice/VoiceManager$toMicrosoftIdentify$1;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/voice/VoiceManager$toMicrosoftIdentify$1;-><init>()V

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/biz/voice/OpusManager;->startDecodeStream(Lcom/sma/smartv3/biz/voice/OpusManager$OnDecodeStreamCallback;)V

    return-void

    :cond_e
    :goto_2
    sget-object p1, Lcom/sma/smartv3/util/MicrosoftSDKManage;->O1O:Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;

    invoke-virtual {p1}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v3

    sget-object v4, Lcom/sma/smartv3/biz/voice/VoiceManager;->microsoftLanguage:Ljava/lang/String;

    sget-object v6, Lcom/sma/smartv3/biz/voice/VoiceManager;->microsoftTtsName:Ljava/lang/String;

    sget-object v7, Lcom/sma/smartv3/biz/voice/VoiceManager;->microsoftTtsLanguage:Ljava/lang/String;

    sget-boolean p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->isActivityData:Z

    xor-int/lit8 v8, p1, 0x1

    const/4 v5, 0x1

    invoke-virtual/range {v3 .. v8}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->iIX0i(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Z)V

    :cond_f
    :goto_3
    return-void
.end method

.method public final toWebSocketRecordPacket(Lcom/szabh/smable3/entity/BleRecordPacket;)V
    .locals 11
    .param p1    # Lcom/szabh/smable3/entity/BleRecordPacket;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "recordPacket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleRecordPacket;->getMStatus()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_7

    if-eq v0, v1, :cond_5

    const/4 p1, 0x2

    if-eq v0, p1, :cond_2

    const/4 p1, 0x3

    if-eq v0, p1, :cond_0

    goto/16 :goto_1

    :cond_0
    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v0, "AIManager VoiceManager BleRecordPacket webSocketRecordPacket SUSPEND"

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sput-boolean v2, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSpeechRecRunning:Z

    sget-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mOpusManager:Lcom/sma/smartv3/biz/voice/OpusManager;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/OpusManager;->stopDecodeStream()V

    :cond_1
    sget-object p1, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->sendAbortMessage()V

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->sendStopListenMessage()V

    return-void

    :cond_2
    sget-boolean p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSpeechRecRunning:Z

    if-nez p1, :cond_3

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-boolean v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSpeechRecRunning:Z

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AIManager VoiceManager BleRecordPacket webSocketRecordPacket END isSpeechRecRunning = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XIi00iiXO(Ljava/lang/String;)V

    return-void

    :cond_3
    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v0, "AIManager VoiceManager BleRecordPacket webSocketRecordPacket END"

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sput-boolean v2, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSpeechRecRunning:Z

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->endTransfer()V

    sget-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mOpusManager:Lcom/sma/smartv3/biz/voice/OpusManager;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/OpusManager;->stopDecodeStream()V

    :cond_4
    sget-object p1, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->sendStopListenMessage()V

    return-void

    :cond_5
    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleRecordPacket;->getMPacket()[B

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/ArraysKt___ArraysKt;->O1XIOXO1i([B)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    const/16 v0, 0x28

    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->X10i(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    sget-object v1, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->XX0X0(Ljava/util/Collection;)[B

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->sendAudioStreamWithBuffer([B)V

    goto :goto_0

    :cond_6
    :goto_1
    return-void

    :cond_7
    sput-boolean v1, Lcom/sma/smartv3/biz/voice/VoiceManager;->isSpeechRecRunning:Z

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v0, "AIManager VoiceManager BleRecordPacket webSocketRecordPacket START"

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->deleteFiles()V

    sget-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mOpusManager:Lcom/sma/smartv3/biz/voice/OpusManager;

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/OpusManager;->stopDecodeStream()V

    :cond_8
    sget-object p1, Lcom/sma/smartv3/biz/voice/VoiceManager;->mOpusManager:Lcom/sma/smartv3/biz/voice/OpusManager;

    if-eqz p1, :cond_9

    new-instance v0, Lcom/sma/smartv3/biz/voice/VoiceManager$toWebSocketRecordPacket$1;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/voice/VoiceManager$toWebSocketRecordPacket$1;-><init>()V

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/biz/voice/OpusManager;->startDecodeStream(Lcom/sma/smartv3/biz/voice/OpusManager$OnDecodeStreamCallback;)V

    :cond_9
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    new-instance v3, Lcom/sma/smartv3/model/AIAnswer;

    sget-object v4, Lcom/sma/smartv3/model/AIFunctionType;->AI:Lcom/sma/smartv3/model/AIFunctionType;

    const/16 v9, 0x1a

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v10}, Lcom/sma/smartv3/model/AIAnswer;-><init>(Lcom/sma/smartv3/model/AIFunctionType;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v3, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    sget-object v1, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->sendStartListenMessage(Z)V

    new-instance v2, Lcom/sma/smartv3/biz/voice/VoiceManager$toWebSocketRecordPacket$2;

    invoke-direct {v2, p1, v0}, Lcom/sma/smartv3/biz/voice/VoiceManager$toWebSocketRecordPacket$2;-><init>(Ljava/lang/StringBuilder;Lkotlin/jvm/internal/Ref$ObjectRef;)V

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->setMOnCallback(Lcom/sma/smartv3/biz/voice/ai/WebSocketManager$OnCallback;)V

    return-void
.end method

.method public final voiceQuery(Ljava/lang/String;)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "query"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AIManager VoiceManager voiceQuery -> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->isVoiceAIIdentify()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->sendMsg(Ljava/lang/String;)V

    return-void

    :cond_0
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->I0IIOI()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    sget v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->mAIMode:I

    if-ltz v0, :cond_2

    const/4 v2, 0x3

    if-gt v0, v2, :cond_2

    const/4 v2, 0x2

    if-ne v0, v2, :cond_1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->OIXOOi()Z

    move-result v2

    if-eqz v2, :cond_1

    sget-object v2, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1:Lcom/sma/smartv3/biz/AISparkChainManager;

    sget-object v3, Lcom/sma/smartv3/biz/voice/VoiceManager;->mAISparkChainManagerCallback:Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->iXOII()I

    move-result v0

    invoke-virtual {v2, p1, v3, v0, v1}, Lcom/sma/smartv3/biz/AISparkChainManager;->iXiiiO(Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/O1XIiIO;IZ)V

    return-void

    :cond_1
    const-string v0, "voiceQuery"

    invoke-virtual {p0, p1, v0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->AIChat(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2
    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->OIXOOi()Z

    move-result v2

    if-eqz v2, :cond_3

    sget-object v2, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1:Lcom/sma/smartv3/biz/AISparkChainManager;

    sget-object v3, Lcom/sma/smartv3/biz/voice/VoiceManager;->mAISparkChainManagerCallback:Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->iXOII()I

    move-result v0

    invoke-virtual {v2, p1, v3, v0, v1}, Lcom/sma/smartv3/biz/AISparkChainManager;->iXiiiO(Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/O1XIiIO;IZ)V

    return-void

    :cond_3
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->XOX()Z

    move-result v1

    if-eqz v1, :cond_4

    const-string v0, "voiceQuery isUseAIService"

    invoke-virtual {p0, p1, v0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->AIChat(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_4
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->IiX1ii()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->isExpired()Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance v0, Lcom/android/mltcode/paycertificationapi/bj6;

    invoke-direct {v0, p1}, Lcom/android/mltcode/paycertificationapi/bj6;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->refreshToken(Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_5
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->duserStreamChat(Ljava/lang/String;)V

    return-void

    :cond_6
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->iIiiO()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_7

    const p1, 0x7f140ff5

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void

    :cond_7
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/voice/VoiceManager;->openAiChatCompletion(Ljava/lang/String;)V

    return-void
.end method

.method public final voiceRecord()V
    .locals 8

    sget-object v0, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1:Lcom/sma/smartv3/biz/AISparkChainManager;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/AISparkChainManager;->O0O0X0iOi()V

    sget-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->stop()V

    sget-object v0, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object v1

    sget-object v2, Lcom/sma/smartv3/biz/voice/VoiceManager;->recordingCallBack:Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;

    sget-boolean v4, Lcom/sma/smartv3/biz/voice/VoiceManager;->resetCallBack:Z

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v3, 0x0

    const-string v5, "AIManager VoiceManager"

    invoke-static/range {v1 .. v7}, Lcom/sma/smartv3/biz/voice/RecordingManager;->recordPermission$default(Lcom/sma/smartv3/biz/voice/RecordingManager;Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;ZZLjava/lang/String;ILjava/lang/Object;)V

    return-void
.end method
