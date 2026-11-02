.class public Lcom/jieli/jl_audio_decode/opus/OpusManager;
.super Lcom/jieli/jl_audio_decode/tool/BaseManager;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "OpusManager"

.field public static isLog:Z


# instance fields
.field private mAddStreamDataThread:Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;

.field private mDecodeFileThread:Lcom/jieli/jl_audio_decode/tool/DecodeFileThread;

.field private volatile mDecodeStateCb:Lcom/jieli/jl_audio_decode/callback/OnStateCallback;

.field private volatile mDecodeStreamCb:Lcom/jieli/jl_audio_decode/callback/OnDecodeStreamCallback;

.field private mEncodeFileThread:Lcom/jieli/jl_audio_decode/tool/EncodeFileThread;

.field private volatile mEncodeStateCb:Lcom/jieli/jl_audio_decode/callback/OnStateCallback;

.field private volatile mEncodeStreamCb:Lcom/jieli/jl_audio_decode/callback/OnEncodeStreamCallback;

.field private mEncodeStreamDataThread:Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;

.field private volatile managerAddr:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    :try_start_0
    const-string v0, "jl_opus"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    const/4 v0, 0x0

    sput-boolean v0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->isLog:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/jieli/jl_audio_decode/exceptions/OpusException;
        }
    .end annotation

    invoke-direct {p0}, Lcom/jieli/jl_audio_decode/tool/BaseManager;-><init>()V

    invoke-direct {p0}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->initNativeID()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->managerAddr:J

    iget-wide v0, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->managerAddr:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/jieli/jl_audio_decode/exceptions/OpusException;

    const-string v1, "Can not load jl_opus lib"

    invoke-direct {v0, v1}, Lcom/jieli/jl_audio_decode/exceptions/OpusException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic O00(Lcom/jieli/jl_audio_decode/opus/OpusManager;J)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->mEncodeFileThread:Lcom/jieli/jl_audio_decode/tool/EncodeFileThread;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    cmp-long p1, v0, p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->mEncodeFileThread:Lcom/jieli/jl_audio_decode/tool/EncodeFileThread;

    invoke-direct {p0, p1}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->setEncodeStateCb(Lcom/jieli/jl_audio_decode/callback/OnStateCallback;)V

    :cond_0
    return-void
.end method

.method public static synthetic OXO1(Lcom/jieli/jl_audio_decode/opus/OpusManager;J)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->mAddStreamDataThread:Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    cmp-long p1, v0, p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->mAddStreamDataThread:Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;

    invoke-direct {p0, p1}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->setDecodeStreamCb(Lcom/jieli/jl_audio_decode/callback/OnDecodeStreamCallback;)V

    :cond_0
    return-void
.end method

.method public static synthetic XIi00iiXO(Lcom/jieli/jl_audio_decode/opus/OpusManager;J)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->mEncodeStreamDataThread:Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    cmp-long p1, v0, p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->mEncodeStreamDataThread:Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;

    invoke-direct {p0, p1}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->setEncodeStreamCb(Lcom/jieli/jl_audio_decode/callback/OnEncodeStreamCallback;)V

    :cond_0
    return-void
.end method

.method public static synthetic XO0O10(Lcom/jieli/jl_audio_decode/opus/OpusManager;J)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->mDecodeFileThread:Lcom/jieli/jl_audio_decode/tool/DecodeFileThread;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    cmp-long p1, v0, p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->mDecodeFileThread:Lcom/jieli/jl_audio_decode/tool/DecodeFileThread;

    invoke-direct {p0, p1}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->setDecodeStateCb(Lcom/jieli/jl_audio_decode/callback/OnStateCallback;)V

    :cond_0
    return-void
.end method

.method private addEncodeStreamData([B)V
    .locals 4

    if-eqz p1, :cond_1

    array-length v0, p1

    if-lez v0, :cond_1

    iget-object v0, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->mEncodeStreamDataThread:Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;

    if-nez v0, :cond_0

    new-instance v0, Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;

    iget-object v1, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->mEncodeStreamCb:Lcom/jieli/jl_audio_decode/callback/OnEncodeStreamCallback;

    new-instance v2, Lcom/android/mltcode/paycertificationapi/si1;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/si1;-><init>(Lcom/jieli/jl_audio_decode/opus/OpusManager;)V

    const/4 v3, 0x0

    invoke-direct {v0, p0, v3, v1, v2}, Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;-><init>(Lcom/jieli/jl_audio_decode/tool/BaseManager;ILcom/jieli/jl_audio_decode/callback/OnStateCallback;Lcom/jieli/jl_audio_decode/callback/OnThreadFinishListener;)V

    iput-object v0, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->mEncodeStreamDataThread:Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;

    invoke-virtual {v0}, Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;->start()V

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->mEncodeStreamDataThread:Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;->addStreamData([B)V

    :cond_1
    return-void
.end method

.method private addStreamData([B)V
    .locals 4

    if-eqz p1, :cond_1

    array-length v0, p1

    if-lez v0, :cond_1

    iget-object v0, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->mAddStreamDataThread:Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;

    if-nez v0, :cond_0

    new-instance v0, Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;

    iget-object v1, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->mDecodeStreamCb:Lcom/jieli/jl_audio_decode/callback/OnDecodeStreamCallback;

    new-instance v2, Lcom/android/mltcode/paycertificationapi/qi1;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/qi1;-><init>(Lcom/jieli/jl_audio_decode/opus/OpusManager;)V

    const/4 v3, 0x2

    invoke-direct {v0, p0, v3, v1, v2}, Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;-><init>(Lcom/jieli/jl_audio_decode/tool/BaseManager;ILcom/jieli/jl_audio_decode/callback/OnStateCallback;Lcom/jieli/jl_audio_decode/callback/OnThreadFinishListener;)V

    iput-object v0, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->mAddStreamDataThread:Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;

    invoke-virtual {v0}, Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;->start()V

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->mAddStreamDataThread:Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;->addStreamData([B)V

    :cond_1
    return-void
.end method

.method private native decodeAudioFile(Ljava/lang/String;Ljava/lang/String;JLcom/jieli/jl_audio_decode/opus/model/OpusOption;)I
.end method

.method private native decodeAudioStream(IJLcom/jieli/jl_audio_decode/opus/model/OpusOption;)V
.end method

.method private native encodeOpusFile(Ljava/lang/String;Ljava/lang/String;JLcom/jieli/jl_audio_decode/opus/model/OpusOption;)I
.end method

.method private native encodeOpusStream(IJLcom/jieli/jl_audio_decode/opus/model/OpusOption;)V
.end method

.method private native getAudioStreamState(J)I
.end method

.method private native getEncodeStreamState(J)I
.end method

.method private native getTranscodingStreamState(J)I
.end method

.method public static synthetic iO(Lcom/jieli/jl_audio_decode/opus/OpusManager;Ljava/lang/String;Ljava/lang/String;Lcom/jieli/jl_audio_decode/opus/model/OggConfigure;Lcom/jieli/jl_audio_decode/callback/OnStateCallback;)V
    .locals 6

    iget-wide v1, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->managerAddr:J

    move-object v0, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->transcodingOggFile(JLjava/lang/String;Ljava/lang/String;Lcom/jieli/jl_audio_decode/opus/model/OggConfigure;)I

    move-result p0

    if-eqz p0, :cond_0

    if-eqz p4, :cond_0

    invoke-static {p0}, Lcom/jieli/jl_audio_decode/constant/ErrorCode;->getErrorMsg(I)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p4, p0, p1}, Lcom/jieli/jl_audio_decode/callback/OnStateCallback;->onError(ILjava/lang/String;)V

    :cond_0
    return-void
.end method

.method private native initNativeID()J
.end method

.method private logContent(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    sget-boolean v0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->isLog:Z

    if-eqz v0, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const-string v1, "[%s]\t%s"

    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, v1, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "OpusManager"

    invoke-static {p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    :goto_0
    return-void
.end method

.method private native nativeDestroy(J)I
.end method

.method private native saveAudioStream([BJ)Z
.end method

.method private native savePcmStream([BJ)Z
.end method

.method private setDecodeStateCb(Lcom/jieli/jl_audio_decode/callback/OnStateCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->mDecodeStateCb:Lcom/jieli/jl_audio_decode/callback/OnStateCallback;

    return-void
.end method

.method private setDecodeStreamCb(Lcom/jieli/jl_audio_decode/callback/OnDecodeStreamCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->mDecodeStreamCb:Lcom/jieli/jl_audio_decode/callback/OnDecodeStreamCallback;

    return-void
.end method

.method private setEncodeStateCb(Lcom/jieli/jl_audio_decode/callback/OnStateCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->mEncodeStateCb:Lcom/jieli/jl_audio_decode/callback/OnStateCallback;

    return-void
.end method

.method private setEncodeStreamCb(Lcom/jieli/jl_audio_decode/callback/OnEncodeStreamCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->mEncodeStreamCb:Lcom/jieli/jl_audio_decode/callback/OnEncodeStreamCallback;

    return-void
.end method

.method private startDecodeFileThread(Ljava/lang/String;Ljava/lang/String;Lcom/jieli/jl_audio_decode/opus/model/OpusOption;)V
    .locals 8

    iget-object v0, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->mDecodeFileThread:Lcom/jieli/jl_audio_decode/tool/DecodeFileThread;

    if-nez v0, :cond_0

    new-instance v1, Lcom/jieli/jl_audio_decode/tool/DecodeFileThread;

    iget-object v6, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->mDecodeStateCb:Lcom/jieli/jl_audio_decode/callback/OnStateCallback;

    new-instance v7, Lcom/android/mltcode/paycertificationapi/ri1;

    invoke-direct {v7, p0}, Lcom/android/mltcode/paycertificationapi/ri1;-><init>(Lcom/jieli/jl_audio_decode/opus/OpusManager;)V

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v1 .. v7}, Lcom/jieli/jl_audio_decode/tool/DecodeFileThread;-><init>(Lcom/jieli/jl_audio_decode/tool/BaseManager;Ljava/lang/String;Ljava/lang/String;Lcom/jieli/jl_audio_decode/opus/model/OpusOption;Lcom/jieli/jl_audio_decode/callback/OnStateCallback;Lcom/jieli/jl_audio_decode/callback/OnThreadFinishListener;)V

    iput-object v1, v2, Lcom/jieli/jl_audio_decode/opus/OpusManager;->mDecodeFileThread:Lcom/jieli/jl_audio_decode/tool/DecodeFileThread;

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    return-void

    :cond_0
    move-object v2, p0

    return-void
.end method

.method private startEncodeFileThread(Ljava/lang/String;Ljava/lang/String;Lcom/jieli/jl_audio_decode/opus/model/OpusOption;)V
    .locals 8

    iget-object v0, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->mEncodeFileThread:Lcom/jieli/jl_audio_decode/tool/EncodeFileThread;

    if-nez v0, :cond_0

    new-instance v1, Lcom/jieli/jl_audio_decode/tool/EncodeFileThread;

    iget-object v6, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->mEncodeStateCb:Lcom/jieli/jl_audio_decode/callback/OnStateCallback;

    new-instance v7, Lcom/android/mltcode/paycertificationapi/ti1;

    invoke-direct {v7, p0}, Lcom/android/mltcode/paycertificationapi/ti1;-><init>(Lcom/jieli/jl_audio_decode/opus/OpusManager;)V

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v1 .. v7}, Lcom/jieli/jl_audio_decode/tool/EncodeFileThread;-><init>(Lcom/jieli/jl_audio_decode/tool/BaseManager;Ljava/lang/String;Ljava/lang/String;Lcom/jieli/jl_audio_decode/opus/model/OpusOption;Lcom/jieli/jl_audio_decode/callback/OnStateCallback;Lcom/jieli/jl_audio_decode/callback/OnThreadFinishListener;)V

    iput-object v1, v2, Lcom/jieli/jl_audio_decode/opus/OpusManager;->mEncodeFileThread:Lcom/jieli/jl_audio_decode/tool/EncodeFileThread;

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    return-void

    :cond_0
    move-object v2, p0

    return-void
.end method

.method private stopAddDataThread()V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->mAddStreamDataThread:Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;->stopThread()V

    :cond_0
    return-void
.end method

.method private stopAddEncodeDataThread()V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->mEncodeStreamDataThread:Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;->stopThread()V

    :cond_0
    return-void
.end method

.method private stopDecodeFileThread()V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->mDecodeFileThread:Lcom/jieli/jl_audio_decode/tool/DecodeFileThread;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :cond_0
    return-void
.end method

.method private stopEncodeFileThread()V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->mEncodeFileThread:Lcom/jieli/jl_audio_decode/tool/EncodeFileThread;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :cond_0
    return-void
.end method

.method private native transcodingOggFile(JLjava/lang/String;Ljava/lang/String;Lcom/jieli/jl_audio_decode/opus/model/OggConfigure;)I
.end method

.method private native transcodingOggStream(JILcom/jieli/jl_audio_decode/opus/model/OggConfigure;)V
.end method

.method private native writeOpusStream(J[B)Z
.end method


# virtual methods
.method public decodeFile(Ljava/lang/String;Ljava/lang/String;Lcom/jieli/jl_audio_decode/callback/OnStateCallback;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/jieli/jl_audio_decode/opus/model/OpusOption;

    invoke-direct {v0}, Lcom/jieli/jl_audio_decode/opus/model/OpusOption;-><init>()V

    invoke-virtual {p0, p1, p2, v0, p3}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->decodeFile(Ljava/lang/String;Ljava/lang/String;Lcom/jieli/jl_audio_decode/opus/model/OpusOption;Lcom/jieli/jl_audio_decode/callback/OnStateCallback;)V

    return-void
.end method

.method public decodeFile(Ljava/lang/String;Ljava/lang/String;Lcom/jieli/jl_audio_decode/opus/model/OpusOption;Lcom/jieli/jl_audio_decode/callback/OnStateCallback;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->mDecodeFileThread:Lcom/jieli/jl_audio_decode/tool/DecodeFileThread;

    if-nez v0, :cond_0

    .line 3
    invoke-direct {p0, p4}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->setDecodeStateCb(Lcom/jieli/jl_audio_decode/callback/OnStateCallback;)V

    .line 4
    invoke-direct {p0, p1, p2, p3}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->startDecodeFileThread(Ljava/lang/String;Ljava/lang/String;Lcom/jieli/jl_audio_decode/opus/model/OpusOption;)V

    return-void

    :cond_0
    if-eqz p4, :cond_1

    const/16 p1, -0x3eb

    .line 5
    const-string p2, "In process, please wait."

    invoke-interface {p4, p1, p2}, Lcom/jieli/jl_audio_decode/callback/OnStateCallback;->onError(ILjava/lang/String;)V

    :cond_1
    return-void
.end method

.method public encodeFile(Ljava/lang/String;Ljava/lang/String;Lcom/jieli/jl_audio_decode/callback/OnStateCallback;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/jieli/jl_audio_decode/opus/model/OpusOption;

    invoke-direct {v0}, Lcom/jieli/jl_audio_decode/opus/model/OpusOption;-><init>()V

    invoke-virtual {p0, p1, p2, v0, p3}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->encodeFile(Ljava/lang/String;Ljava/lang/String;Lcom/jieli/jl_audio_decode/opus/model/OpusOption;Lcom/jieli/jl_audio_decode/callback/OnStateCallback;)V

    return-void
.end method

.method public encodeFile(Ljava/lang/String;Ljava/lang/String;Lcom/jieli/jl_audio_decode/opus/model/OpusOption;Lcom/jieli/jl_audio_decode/callback/OnStateCallback;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->mEncodeFileThread:Lcom/jieli/jl_audio_decode/tool/EncodeFileThread;

    if-nez v0, :cond_0

    .line 3
    invoke-direct {p0, p4}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->setEncodeStateCb(Lcom/jieli/jl_audio_decode/callback/OnStateCallback;)V

    .line 4
    invoke-direct {p0, p1, p2, p3}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->startEncodeFileThread(Ljava/lang/String;Ljava/lang/String;Lcom/jieli/jl_audio_decode/opus/model/OpusOption;)V

    return-void

    :cond_0
    if-eqz p4, :cond_1

    const/16 p1, -0x3eb

    .line 5
    const-string p2, "In process, please wait."

    invoke-interface {p4, p1, p2}, Lcom/jieli/jl_audio_decode/callback/OnStateCallback;->onError(ILjava/lang/String;)V

    :cond_1
    return-void
.end method

.method public isDecodeStream()Z
    .locals 2

    iget-wide v0, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->managerAddr:J

    invoke-direct {p0, v0, v1}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->getAudioStreamState(J)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isEncodeStream()Z
    .locals 2

    iget-wide v0, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->managerAddr:J

    invoke-direct {p0, v0, v1}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->getEncodeStreamState(J)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isTranscoding()Z
    .locals 2

    iget-wide v0, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->managerAddr:J

    invoke-direct {p0, v0, v1}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->getTranscodingStreamState(J)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public nativeAddAudioStream(I[B)Z
    .locals 3

    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    if-nez p2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    array-length v2, p2

    :goto_0
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v1, v2}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "dataType : %d, data size : %d"

    invoke-static {v0, v2, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "nativeAddAudioStream"

    invoke-direct {p0, v1, v0}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->logContent(Ljava/lang/String;Ljava/lang/String;)V

    if-nez p1, :cond_1

    iget-wide v0, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->managerAddr:J

    invoke-direct {p0, p2, v0, v1}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->savePcmStream([BJ)Z

    move-result p1

    return p1

    :cond_1
    iget-wide v0, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->managerAddr:J

    invoke-direct {p0, p2, v0, v1}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->saveAudioStream([BJ)Z

    move-result p1

    return p1
.end method

.method public nativeDecodeFile(Ljava/lang/String;Ljava/lang/String;)I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    new-instance v0, Lcom/jieli/jl_audio_decode/opus/model/OpusOption;

    invoke-direct {v0}, Lcom/jieli/jl_audio_decode/opus/model/OpusOption;-><init>()V

    invoke-virtual {p0, p1, p2, v0}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->nativeDecodeFile(Ljava/lang/String;Ljava/lang/String;Lcom/jieli/jl_audio_decode/opus/model/OpusOption;)I

    move-result p1

    return p1
.end method

.method public nativeDecodeFile(Ljava/lang/String;Ljava/lang/String;Lcom/jieli/jl_audio_decode/opus/model/OpusOption;)I
    .locals 6

    if-nez p3, :cond_0

    .line 2
    new-instance p3, Lcom/jieli/jl_audio_decode/opus/model/OpusOption;

    invoke-direct {p3}, Lcom/jieli/jl_audio_decode/opus/model/OpusOption;-><init>()V

    :cond_0
    move-object v5, p3

    .line 3
    iget-wide v3, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->managerAddr:J

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->decodeAudioFile(Ljava/lang/String;Ljava/lang/String;JLcom/jieli/jl_audio_decode/opus/model/OpusOption;)I

    move-result p1

    return p1
.end method

.method public nativeDecodeStream(I)V
    .locals 1

    .line 1
    new-instance v0, Lcom/jieli/jl_audio_decode/opus/model/OpusOption;

    invoke-direct {v0}, Lcom/jieli/jl_audio_decode/opus/model/OpusOption;-><init>()V

    invoke-virtual {p0, p1, v0}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->nativeDecodeStream(ILcom/jieli/jl_audio_decode/opus/model/OpusOption;)V

    return-void
.end method

.method public nativeDecodeStream(ILcom/jieli/jl_audio_decode/opus/model/OpusOption;)V
    .locals 2

    .line 2
    iget-wide v0, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->managerAddr:J

    invoke-direct {p0, p1, v0, v1, p2}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->decodeAudioStream(IJLcom/jieli/jl_audio_decode/opus/model/OpusOption;)V

    return-void
.end method

.method public nativeEncodeFile(Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    .line 1
    new-instance v0, Lcom/jieli/jl_audio_decode/opus/model/OpusOption;

    invoke-direct {v0}, Lcom/jieli/jl_audio_decode/opus/model/OpusOption;-><init>()V

    invoke-virtual {p0, p1, p2, v0}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->nativeEncodeFile(Ljava/lang/String;Ljava/lang/String;Lcom/jieli/jl_audio_decode/opus/model/OpusOption;)I

    move-result p1

    return p1
.end method

.method public nativeEncodeFile(Ljava/lang/String;Ljava/lang/String;Lcom/jieli/jl_audio_decode/opus/model/OpusOption;)I
    .locals 6

    .line 2
    iget-wide v3, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->managerAddr:J

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->encodeOpusFile(Ljava/lang/String;Ljava/lang/String;JLcom/jieli/jl_audio_decode/opus/model/OpusOption;)I

    move-result p1

    return p1
.end method

.method public onDecodeStreamReceive(I[B)V
    .locals 0

    iget-object p1, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->mDecodeStreamCb:Lcom/jieli/jl_audio_decode/callback/OnDecodeStreamCallback;

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->mDecodeStreamCb:Lcom/jieli/jl_audio_decode/callback/OnDecodeStreamCallback;

    invoke-interface {p1, p2}, Lcom/jieli/jl_audio_decode/callback/OnDecodeStreamCallback;->onDecodeStream([B)V

    return-void
.end method

.method public onEncodeStreamReceive(I[B)V
    .locals 0

    iget-object p1, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->mEncodeStreamCb:Lcom/jieli/jl_audio_decode/callback/OnEncodeStreamCallback;

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->mEncodeStreamCb:Lcom/jieli/jl_audio_decode/callback/OnEncodeStreamCallback;

    invoke-interface {p1, p2}, Lcom/jieli/jl_audio_decode/callback/OnEncodeStreamCallback;->onEncodeStream([B)V

    return-void
.end method

.method public onStateCallback(IIILjava/lang/String;)V
    .locals 2

    const/4 v0, 0x2

    const/4 v1, 0x1

    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    :pswitch_0
    iget-object p1, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->mEncodeStreamCb:Lcom/jieli/jl_audio_decode/callback/OnEncodeStreamCallback;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_3

    if-eq p2, v1, :cond_2

    if-eq p2, v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->mEncodeStreamCb:Lcom/jieli/jl_audio_decode/callback/OnEncodeStreamCallback;

    invoke-interface {p1, p3, p4}, Lcom/jieli/jl_audio_decode/callback/OnStateCallback;->onError(ILjava/lang/String;)V

    return-void

    :cond_2
    iget-object p1, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->mEncodeStreamCb:Lcom/jieli/jl_audio_decode/callback/OnEncodeStreamCallback;

    invoke-interface {p1}, Lcom/jieli/jl_audio_decode/callback/OnStateCallback;->onStart()V

    return-void

    :cond_3
    iget-object p1, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->mEncodeStreamCb:Lcom/jieli/jl_audio_decode/callback/OnEncodeStreamCallback;

    invoke-interface {p1, p4}, Lcom/jieli/jl_audio_decode/callback/OnStateCallback;->onComplete(Ljava/lang/String;)V

    return-void

    :pswitch_1
    iget-object p1, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->mDecodeStreamCb:Lcom/jieli/jl_audio_decode/callback/OnDecodeStreamCallback;

    if-nez p1, :cond_4

    goto :goto_0

    :cond_4
    if-eqz p2, :cond_7

    if-eq p2, v1, :cond_6

    if-eq p2, v0, :cond_5

    goto :goto_0

    :cond_5
    iget-object p1, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->mDecodeStreamCb:Lcom/jieli/jl_audio_decode/callback/OnDecodeStreamCallback;

    invoke-interface {p1, p3, p4}, Lcom/jieli/jl_audio_decode/callback/OnStateCallback;->onError(ILjava/lang/String;)V

    return-void

    :cond_6
    iget-object p1, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->mDecodeStreamCb:Lcom/jieli/jl_audio_decode/callback/OnDecodeStreamCallback;

    invoke-interface {p1}, Lcom/jieli/jl_audio_decode/callback/OnStateCallback;->onStart()V

    return-void

    :cond_7
    iget-object p1, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->mDecodeStreamCb:Lcom/jieli/jl_audio_decode/callback/OnDecodeStreamCallback;

    invoke-interface {p1, p4}, Lcom/jieli/jl_audio_decode/callback/OnStateCallback;->onComplete(Ljava/lang/String;)V

    return-void

    :pswitch_2
    iget-object p1, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->mEncodeStateCb:Lcom/jieli/jl_audio_decode/callback/OnStateCallback;

    if-nez p1, :cond_8

    goto :goto_0

    :cond_8
    if-eqz p2, :cond_b

    if-eq p2, v1, :cond_a

    if-eq p2, v0, :cond_9

    goto :goto_0

    :cond_9
    iget-object p1, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->mEncodeStateCb:Lcom/jieli/jl_audio_decode/callback/OnStateCallback;

    invoke-interface {p1, p3, p4}, Lcom/jieli/jl_audio_decode/callback/OnStateCallback;->onError(ILjava/lang/String;)V

    return-void

    :cond_a
    iget-object p1, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->mEncodeStateCb:Lcom/jieli/jl_audio_decode/callback/OnStateCallback;

    invoke-interface {p1}, Lcom/jieli/jl_audio_decode/callback/OnStateCallback;->onStart()V

    return-void

    :cond_b
    iget-object p1, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->mEncodeStateCb:Lcom/jieli/jl_audio_decode/callback/OnStateCallback;

    invoke-interface {p1, p4}, Lcom/jieli/jl_audio_decode/callback/OnStateCallback;->onComplete(Ljava/lang/String;)V

    return-void

    :pswitch_3
    iget-object p1, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->mDecodeStateCb:Lcom/jieli/jl_audio_decode/callback/OnStateCallback;

    if-nez p1, :cond_c

    goto :goto_0

    :cond_c
    if-eqz p2, :cond_f

    if-eq p2, v1, :cond_e

    if-eq p2, v0, :cond_d

    :goto_0
    return-void

    :cond_d
    iget-object p1, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->mDecodeStateCb:Lcom/jieli/jl_audio_decode/callback/OnStateCallback;

    invoke-interface {p1, p3, p4}, Lcom/jieli/jl_audio_decode/callback/OnStateCallback;->onError(ILjava/lang/String;)V

    return-void

    :cond_e
    iget-object p1, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->mDecodeStateCb:Lcom/jieli/jl_audio_decode/callback/OnStateCallback;

    invoke-interface {p1}, Lcom/jieli/jl_audio_decode/callback/OnStateCallback;->onStart()V

    return-void

    :cond_f
    iget-object p1, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->mDecodeStateCb:Lcom/jieli/jl_audio_decode/callback/OnStateCallback;

    invoke-interface {p1, p4}, Lcom/jieli/jl_audio_decode/callback/OnStateCallback;->onComplete(Ljava/lang/String;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_3
        :pswitch_1
    .end packed-switch
.end method

.method public release()V
    .locals 2

    invoke-virtual {p0}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->isDecodeStream()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->stopDecodeStream()V

    :cond_0
    invoke-virtual {p0}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->isEncodeStream()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->stopEncodeStream()V

    :cond_1
    invoke-direct {p0}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->stopDecodeFileThread()V

    invoke-direct {p0}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->stopEncodeFileThread()V

    invoke-direct {p0}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->stopAddDataThread()V

    invoke-direct {p0}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->stopAddEncodeDataThread()V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->setDecodeStateCb(Lcom/jieli/jl_audio_decode/callback/OnStateCallback;)V

    invoke-direct {p0, v0}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->setDecodeStateCb(Lcom/jieli/jl_audio_decode/callback/OnStateCallback;)V

    invoke-direct {p0, v0}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->setDecodeStateCb(Lcom/jieli/jl_audio_decode/callback/OnStateCallback;)V

    invoke-direct {p0, v0}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->setEncodeStreamCb(Lcom/jieli/jl_audio_decode/callback/OnEncodeStreamCallback;)V

    iget-wide v0, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->managerAddr:J

    invoke-direct {p0, v0, v1}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->nativeDestroy(J)I

    move-result v0

    if-nez v0, :cond_2

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->managerAddr:J

    :cond_2
    return-void
.end method

.method public startDecodeStream(Lcom/jieli/jl_audio_decode/callback/OnDecodeStreamCallback;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/jieli/jl_audio_decode/opus/model/OpusOption;

    invoke-direct {v0}, Lcom/jieli/jl_audio_decode/opus/model/OpusOption;-><init>()V

    invoke-virtual {p0, v0, p1}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->startDecodeStream(Lcom/jieli/jl_audio_decode/opus/model/OpusOption;Lcom/jieli/jl_audio_decode/callback/OnDecodeStreamCallback;)V

    return-void
.end method

.method public startDecodeStream(Lcom/jieli/jl_audio_decode/opus/model/OpusOption;Lcom/jieli/jl_audio_decode/callback/OnDecodeStreamCallback;)V
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->isDecodeStream()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    invoke-direct {p0, p2}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->setDecodeStreamCb(Lcom/jieli/jl_audio_decode/callback/OnDecodeStreamCallback;)V

    const/4 p2, 0x1

    .line 4
    invoke-virtual {p0, p2, p1}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->nativeDecodeStream(ILcom/jieli/jl_audio_decode/opus/model/OpusOption;)V

    return-void

    :cond_0
    if-eqz p2, :cond_1

    const/16 p1, -0x3eb

    .line 5
    const-string v0, "Decoding Stream is working, please don\'t open again."

    invoke-interface {p2, p1, v0}, Lcom/jieli/jl_audio_decode/callback/OnStateCallback;->onError(ILjava/lang/String;)V

    :cond_1
    return-void
.end method

.method public startEncodeStream(Lcom/jieli/jl_audio_decode/callback/OnEncodeStreamCallback;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/jieli/jl_audio_decode/opus/model/OpusOption;

    invoke-direct {v0}, Lcom/jieli/jl_audio_decode/opus/model/OpusOption;-><init>()V

    invoke-virtual {p0, v0, p1}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->startEncodeStream(Lcom/jieli/jl_audio_decode/opus/model/OpusOption;Lcom/jieli/jl_audio_decode/callback/OnEncodeStreamCallback;)V

    return-void
.end method

.method public startEncodeStream(Lcom/jieli/jl_audio_decode/opus/model/OpusOption;Lcom/jieli/jl_audio_decode/callback/OnEncodeStreamCallback;)V
    .locals 2

    .line 2
    invoke-virtual {p0}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->isEncodeStream()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    invoke-direct {p0, p2}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->setEncodeStreamCb(Lcom/jieli/jl_audio_decode/callback/OnEncodeStreamCallback;)V

    const/4 p2, 0x1

    .line 4
    iget-wide v0, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->managerAddr:J

    invoke-direct {p0, p2, v0, v1, p1}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->encodeOpusStream(IJLcom/jieli/jl_audio_decode/opus/model/OpusOption;)V

    return-void

    :cond_0
    if-eqz p2, :cond_1

    const/16 p1, -0x3eb

    .line 5
    const-string v0, "Encoding Stream is working, please don\'t open again."

    invoke-interface {p2, p1, v0}, Lcom/jieli/jl_audio_decode/callback/OnStateCallback;->onError(ILjava/lang/String;)V

    :cond_1
    return-void
.end method

.method public startTranscodingStream(Lcom/jieli/jl_audio_decode/callback/OnDecodeStreamCallback;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/jieli/jl_audio_decode/opus/model/OggConfigure;

    invoke-direct {v0}, Lcom/jieli/jl_audio_decode/opus/model/OggConfigure;-><init>()V

    invoke-virtual {p0, v0, p1}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->startTranscodingStream(Lcom/jieli/jl_audio_decode/opus/model/OggConfigure;Lcom/jieli/jl_audio_decode/callback/OnDecodeStreamCallback;)V

    return-void
.end method

.method public startTranscodingStream(Lcom/jieli/jl_audio_decode/opus/model/OggConfigure;Lcom/jieli/jl_audio_decode/callback/OnDecodeStreamCallback;)V
    .locals 2

    .line 2
    invoke-virtual {p0}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->isTranscoding()Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p2, :cond_0

    const/16 p1, -0x3eb

    .line 3
    invoke-static {p1}, Lcom/jieli/jl_audio_decode/constant/ErrorCode;->getErrorMsg(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, p1, v0}, Lcom/jieli/jl_audio_decode/callback/OnStateCallback;->onError(ILjava/lang/String;)V

    :cond_0
    return-void

    .line 4
    :cond_1
    invoke-direct {p0, p2}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->setDecodeStreamCb(Lcom/jieli/jl_audio_decode/callback/OnDecodeStreamCallback;)V

    .line 5
    iget-wide v0, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->managerAddr:J

    const/4 p2, 0x1

    invoke-direct {p0, v0, v1, p2, p1}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->transcodingOggStream(JILcom/jieli/jl_audio_decode/opus/model/OggConfigure;)V

    return-void
.end method

.method public stopDecodeStream()V
    .locals 2

    invoke-virtual {p0}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->isDecodeStream()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/jieli/jl_audio_decode/opus/model/OpusOption;

    invoke-direct {v0}, Lcom/jieli/jl_audio_decode/opus/model/OpusOption;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->nativeDecodeStream(ILcom/jieli/jl_audio_decode/opus/model/OpusOption;)V

    :cond_0
    return-void
.end method

.method public stopEncodeStream()V
    .locals 4

    invoke-virtual {p0}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->isEncodeStream()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->managerAddr:J

    new-instance v2, Lcom/jieli/jl_audio_decode/opus/model/OpusOption;

    invoke-direct {v2}, Lcom/jieli/jl_audio_decode/opus/model/OpusOption;-><init>()V

    const/4 v3, 0x0

    invoke-direct {p0, v3, v0, v1, v2}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->encodeOpusStream(IJLcom/jieli/jl_audio_decode/opus/model/OpusOption;)V

    :cond_0
    return-void
.end method

.method public stopTranscodingStream()V
    .locals 4

    invoke-virtual {p0}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->isTranscoding()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->managerAddr:J

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->transcodingOggStream(JILcom/jieli/jl_audio_decode/opus/model/OggConfigure;)V

    :cond_0
    return-void
.end method

.method public transcodingOggFile(Ljava/lang/String;Ljava/lang/String;Lcom/jieli/jl_audio_decode/callback/OnStateCallback;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/jieli/jl_audio_decode/opus/model/OggConfigure;

    invoke-direct {v0}, Lcom/jieli/jl_audio_decode/opus/model/OggConfigure;-><init>()V

    invoke-virtual {p0, p1, p2, v0, p3}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->transcodingOggFile(Ljava/lang/String;Ljava/lang/String;Lcom/jieli/jl_audio_decode/opus/model/OggConfigure;Lcom/jieli/jl_audio_decode/callback/OnStateCallback;)V

    return-void
.end method

.method public transcodingOggFile(Ljava/lang/String;Ljava/lang/String;Lcom/jieli/jl_audio_decode/opus/model/OggConfigure;Lcom/jieli/jl_audio_decode/callback/OnStateCallback;)V
    .locals 7

    .line 2
    invoke-virtual {p0}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->isTranscoding()Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p4, :cond_0

    const/16 p1, -0x3eb

    .line 3
    invoke-static {p1}, Lcom/jieli/jl_audio_decode/constant/ErrorCode;->getErrorMsg(I)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p4, p1, p2}, Lcom/jieli/jl_audio_decode/callback/OnStateCallback;->onError(ILjava/lang/String;)V

    :cond_0
    return-void

    .line 4
    :cond_1
    invoke-direct {p0, p4}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->setDecodeStateCb(Lcom/jieli/jl_audio_decode/callback/OnStateCallback;)V

    .line 5
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ni1;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/ni1;-><init>(Lcom/jieli/jl_audio_decode/opus/OpusManager;Ljava/lang/String;Ljava/lang/String;Lcom/jieli/jl_audio_decode/opus/model/OggConfigure;Lcom/jieli/jl_audio_decode/callback/OnStateCallback;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method public writeAudioStream([B)V
    .locals 1

    invoke-virtual {p0}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->isDecodeStream()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->addStreamData([B)V

    :cond_0
    return-void
.end method

.method public writeEncodeStream([B)V
    .locals 1

    invoke-virtual {p0}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->isEncodeStream()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->addEncodeStreamData([B)V

    :cond_0
    return-void
.end method

.method public writeTransCodingStream([B)V
    .locals 2

    invoke-virtual {p0}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->isTranscoding()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lcom/jieli/jl_audio_decode/opus/OpusManager;->managerAddr:J

    invoke-direct {p0, v0, v1, p1}, Lcom/jieli/jl_audio_decode/opus/OpusManager;->writeOpusStream(J[B)Z

    :cond_0
    return-void
.end method
