.class public Lcom/jieli/jl_audio_decode/speex/SpeexManager;
.super Lcom/jieli/jl_audio_decode/tool/BaseManager;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "SpeexManager"


# instance fields
.field private mAddStreamDataThread:Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;

.field private volatile mDecodeFileCallback:Lcom/jieli/jl_audio_decode/callback/OnStateCallback;

.field private mDecodeFileThread:Lcom/jieli/jl_audio_decode/tool/DecodeFileThread;

.field private volatile mDecodeStreamCallback:Lcom/jieli/jl_audio_decode/callback/OnDecodeStreamCallback;

.field private volatile mEncodeFileCallback:Lcom/jieli/jl_audio_decode/callback/OnStateCallback;

.field private mEncodeFileThread:Lcom/jieli/jl_audio_decode/tool/EncodeFileThread;

.field private volatile managerAddr:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    :try_start_0
    const-string v0, "jl_speex"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method public constructor <init>()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/jieli/jl_audio_decode/exceptions/SpeexException;
        }
    .end annotation

    invoke-direct {p0}, Lcom/jieli/jl_audio_decode/tool/BaseManager;-><init>()V

    invoke-direct {p0}, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->initNativeID()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->managerAddr:J

    iget-wide v0, p0, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->managerAddr:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/jieli/jl_audio_decode/exceptions/SpeexException;

    const-string v1, "Can not load jl_speex lib"

    invoke-direct {v0, v1}, Lcom/jieli/jl_audio_decode/exceptions/SpeexException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic OXO1(Lcom/jieli/jl_audio_decode/speex/SpeexManager;J)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->mEncodeFileThread:Lcom/jieli/jl_audio_decode/tool/EncodeFileThread;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    cmp-long p1, v0, p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->mEncodeFileThread:Lcom/jieli/jl_audio_decode/tool/EncodeFileThread;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->setEncodeFileCallback(Lcom/jieli/jl_audio_decode/callback/OnStateCallback;)V

    :cond_0
    return-void
.end method

.method public static synthetic XIi00iiXO(Lcom/jieli/jl_audio_decode/speex/SpeexManager;J)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->mDecodeFileThread:Lcom/jieli/jl_audio_decode/tool/DecodeFileThread;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    cmp-long p1, v0, p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->mDecodeFileCallback:Lcom/jieli/jl_audio_decode/callback/OnStateCallback;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->setDecodeFileCallback(Lcom/jieli/jl_audio_decode/callback/OnStateCallback;)V

    :cond_0
    return-void
.end method

.method private addStreamData([B)V
    .locals 4

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->mAddStreamDataThread:Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;

    if-nez v0, :cond_0

    new-instance v0, Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;

    iget-object v1, p0, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->mDecodeStreamCallback:Lcom/jieli/jl_audio_decode/callback/OnDecodeStreamCallback;

    new-instance v2, Lcom/android/mltcode/paycertificationapi/kr4;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/kr4;-><init>(Lcom/jieli/jl_audio_decode/speex/SpeexManager;)V

    const/4 v3, 0x1

    invoke-direct {v0, p0, v3, v1, v2}, Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;-><init>(Lcom/jieli/jl_audio_decode/tool/BaseManager;ILcom/jieli/jl_audio_decode/callback/OnStateCallback;Lcom/jieli/jl_audio_decode/callback/OnThreadFinishListener;)V

    iput-object v0, p0, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->mAddStreamDataThread:Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;

    invoke-virtual {v0}, Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;->start()V

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->mAddStreamDataThread:Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;->addStreamData([B)V

    :cond_1
    return-void
.end method

.method private native decodeAudioFile(Ljava/lang/String;Ljava/lang/String;J)I
.end method

.method private native decodeAudioStream(IJ)V
.end method

.method private native encodeAudioFile(Ljava/lang/String;Ljava/lang/String;J)I
.end method

.method private native getAudioStreamState(J)I
.end method

.method public static synthetic iO(Lcom/jieli/jl_audio_decode/speex/SpeexManager;J)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->mAddStreamDataThread:Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    cmp-long p1, v0, p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->mAddStreamDataThread:Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->setDecodeStreamCallback(Lcom/jieli/jl_audio_decode/callback/OnDecodeStreamCallback;)V

    :cond_0
    return-void
.end method

.method private native initNativeID()J
.end method

.method private native nativeDestroy(J)I
.end method

.method private native saveAudioStream([BJ)Z
.end method

.method private startDecodeFileThread(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    iget-object v0, p0, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->mDecodeFileThread:Lcom/jieli/jl_audio_decode/tool/DecodeFileThread;

    if-nez v0, :cond_0

    new-instance v1, Lcom/jieli/jl_audio_decode/tool/DecodeFileThread;

    new-instance v5, Lcom/jieli/jl_audio_decode/opus/model/OpusOption;

    invoke-direct {v5}, Lcom/jieli/jl_audio_decode/opus/model/OpusOption;-><init>()V

    iget-object v6, p0, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->mDecodeFileCallback:Lcom/jieli/jl_audio_decode/callback/OnStateCallback;

    new-instance v7, Lcom/android/mltcode/paycertificationapi/lr4;

    invoke-direct {v7, p0}, Lcom/android/mltcode/paycertificationapi/lr4;-><init>(Lcom/jieli/jl_audio_decode/speex/SpeexManager;)V

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v1 .. v7}, Lcom/jieli/jl_audio_decode/tool/DecodeFileThread;-><init>(Lcom/jieli/jl_audio_decode/tool/BaseManager;Ljava/lang/String;Ljava/lang/String;Lcom/jieli/jl_audio_decode/opus/model/OpusOption;Lcom/jieli/jl_audio_decode/callback/OnStateCallback;Lcom/jieli/jl_audio_decode/callback/OnThreadFinishListener;)V

    iput-object v1, v2, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->mDecodeFileThread:Lcom/jieli/jl_audio_decode/tool/DecodeFileThread;

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    return-void

    :cond_0
    move-object v2, p0

    return-void
.end method

.method private startEncodeFileThread(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    iget-object v0, p0, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->mEncodeFileThread:Lcom/jieli/jl_audio_decode/tool/EncodeFileThread;

    if-nez v0, :cond_0

    new-instance v1, Lcom/jieli/jl_audio_decode/tool/EncodeFileThread;

    new-instance v5, Lcom/jieli/jl_audio_decode/opus/model/OpusOption;

    invoke-direct {v5}, Lcom/jieli/jl_audio_decode/opus/model/OpusOption;-><init>()V

    iget-object v6, p0, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->mEncodeFileCallback:Lcom/jieli/jl_audio_decode/callback/OnStateCallback;

    new-instance v7, Lcom/android/mltcode/paycertificationapi/jr4;

    invoke-direct {v7, p0}, Lcom/android/mltcode/paycertificationapi/jr4;-><init>(Lcom/jieli/jl_audio_decode/speex/SpeexManager;)V

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v1 .. v7}, Lcom/jieli/jl_audio_decode/tool/EncodeFileThread;-><init>(Lcom/jieli/jl_audio_decode/tool/BaseManager;Ljava/lang/String;Ljava/lang/String;Lcom/jieli/jl_audio_decode/opus/model/OpusOption;Lcom/jieli/jl_audio_decode/callback/OnStateCallback;Lcom/jieli/jl_audio_decode/callback/OnThreadFinishListener;)V

    iput-object v1, v2, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->mEncodeFileThread:Lcom/jieli/jl_audio_decode/tool/EncodeFileThread;

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    return-void

    :cond_0
    move-object v2, p0

    return-void
.end method

.method private stopAddDataThread()V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->mAddStreamDataThread:Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;->stopThread()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->mAddStreamDataThread:Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;

    :cond_0
    return-void
.end method

.method private stopDecodeFileThread()V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->mDecodeFileThread:Lcom/jieli/jl_audio_decode/tool/DecodeFileThread;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->mDecodeFileThread:Lcom/jieli/jl_audio_decode/tool/DecodeFileThread;

    :cond_0
    return-void
.end method

.method private stopEncodeFileThread()V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->mEncodeFileThread:Lcom/jieli/jl_audio_decode/tool/EncodeFileThread;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->mEncodeFileThread:Lcom/jieli/jl_audio_decode/tool/EncodeFileThread;

    :cond_0
    return-void
.end method


# virtual methods
.method public decodeFile(Ljava/lang/String;Ljava/lang/String;Lcom/jieli/jl_audio_decode/callback/OnStateCallback;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->mDecodeFileThread:Lcom/jieli/jl_audio_decode/tool/DecodeFileThread;

    if-nez v0, :cond_0

    invoke-virtual {p0, p3}, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->setDecodeFileCallback(Lcom/jieli/jl_audio_decode/callback/OnStateCallback;)V

    invoke-direct {p0, p1, p2}, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->startDecodeFileThread(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    if-eqz p3, :cond_1

    const/16 p1, -0x3eb

    const-string p2, "In process, please wait."

    invoke-interface {p3, p1, p2}, Lcom/jieli/jl_audio_decode/callback/OnStateCallback;->onError(ILjava/lang/String;)V

    :cond_1
    return-void
.end method

.method public encodeFile(Ljava/lang/String;Ljava/lang/String;Lcom/jieli/jl_audio_decode/callback/OnStateCallback;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->mEncodeFileThread:Lcom/jieli/jl_audio_decode/tool/EncodeFileThread;

    if-nez v0, :cond_0

    invoke-virtual {p0, p3}, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->setEncodeFileCallback(Lcom/jieli/jl_audio_decode/callback/OnStateCallback;)V

    invoke-direct {p0, p1, p2}, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->startEncodeFileThread(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    if-eqz p3, :cond_1

    const/16 p1, -0x3eb

    const-string p2, "In process, please wait."

    invoke-interface {p3, p1, p2}, Lcom/jieli/jl_audio_decode/callback/OnStateCallback;->onError(ILjava/lang/String;)V

    :cond_1
    return-void
.end method

.method public isDecodeStream()Z
    .locals 2

    iget-wide v0, p0, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->managerAddr:J

    invoke-direct {p0, v0, v1}, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->getAudioStreamState(J)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public nativeAddAudioStream(I[B)Z
    .locals 4

    iget-wide v0, p0, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->managerAddr:J

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-wide v0, p0, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->managerAddr:J

    invoke-direct {p0, p2, v0, v1}, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->saveAudioStream([BJ)Z

    move-result p1

    return p1
.end method

.method public nativeDecodeFile(Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    .line 1
    new-instance v0, Lcom/jieli/jl_audio_decode/opus/model/OpusOption;

    invoke-direct {v0}, Lcom/jieli/jl_audio_decode/opus/model/OpusOption;-><init>()V

    invoke-virtual {p0, p1, p2, v0}, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->nativeDecodeFile(Ljava/lang/String;Ljava/lang/String;Lcom/jieli/jl_audio_decode/opus/model/OpusOption;)I

    move-result p1

    return p1
.end method

.method public nativeDecodeFile(Ljava/lang/String;Ljava/lang/String;Lcom/jieli/jl_audio_decode/opus/model/OpusOption;)I
    .locals 4

    .line 2
    iget-wide v0, p0, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->managerAddr:J

    const-wide/16 v2, 0x0

    cmp-long p3, v0, v2

    if-nez p3, :cond_0

    const/16 p1, -0x3e8

    return p1

    .line 3
    :cond_0
    iget-wide v0, p0, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->managerAddr:J

    invoke-direct {p0, p1, p2, v0, v1}, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->decodeAudioFile(Ljava/lang/String;Ljava/lang/String;J)I

    move-result p1

    return p1
.end method

.method public nativeDecodeStream(I)V
    .locals 1

    .line 1
    new-instance v0, Lcom/jieli/jl_audio_decode/opus/model/OpusOption;

    invoke-direct {v0}, Lcom/jieli/jl_audio_decode/opus/model/OpusOption;-><init>()V

    invoke-virtual {p0, p1, v0}, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->nativeDecodeStream(ILcom/jieli/jl_audio_decode/opus/model/OpusOption;)V

    return-void
.end method

.method public nativeDecodeStream(ILcom/jieli/jl_audio_decode/opus/model/OpusOption;)V
    .locals 2

    .line 2
    iget-wide v0, p0, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->managerAddr:J

    invoke-direct {p0, p1, v0, v1}, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->decodeAudioStream(IJ)V

    return-void
.end method

.method public nativeEncodeFile(Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    .line 1
    new-instance v0, Lcom/jieli/jl_audio_decode/opus/model/OpusOption;

    invoke-direct {v0}, Lcom/jieli/jl_audio_decode/opus/model/OpusOption;-><init>()V

    invoke-virtual {p0, p1, p2, v0}, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->nativeEncodeFile(Ljava/lang/String;Ljava/lang/String;Lcom/jieli/jl_audio_decode/opus/model/OpusOption;)I

    move-result p1

    return p1
.end method

.method public nativeEncodeFile(Ljava/lang/String;Ljava/lang/String;Lcom/jieli/jl_audio_decode/opus/model/OpusOption;)I
    .locals 4

    .line 2
    iget-wide v0, p0, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->managerAddr:J

    const-wide/16 v2, 0x0

    cmp-long p3, v0, v2

    if-nez p3, :cond_0

    const/16 p1, -0x3e8

    return p1

    .line 3
    :cond_0
    iget-wide v0, p0, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->managerAddr:J

    invoke-direct {p0, p1, p2, v0, v1}, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->encodeAudioFile(Ljava/lang/String;Ljava/lang/String;J)I

    move-result p1

    return p1
.end method

.method public onDecodeStreamReceive(I[B)V
    .locals 0

    iget-object p1, p0, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->mDecodeStreamCallback:Lcom/jieli/jl_audio_decode/callback/OnDecodeStreamCallback;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->mDecodeStreamCallback:Lcom/jieli/jl_audio_decode/callback/OnDecodeStreamCallback;

    invoke-interface {p1, p2}, Lcom/jieli/jl_audio_decode/callback/OnDecodeStreamCallback;->onDecodeStream([B)V

    :cond_0
    return-void
.end method

.method public onStateCallback(IIILjava/lang/String;)V
    .locals 3

    const/4 v0, 0x2

    const/4 v1, 0x1

    if-eq p1, v1, :cond_8

    if-eq p1, v0, :cond_4

    const/4 v2, 0x3

    if-eq p1, v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->mDecodeStreamCallback:Lcom/jieli/jl_audio_decode/callback/OnDecodeStreamCallback;

    if-eqz p1, :cond_c

    if-eqz p2, :cond_3

    if-eq p2, v1, :cond_2

    if-eq p2, v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->mDecodeStreamCallback:Lcom/jieli/jl_audio_decode/callback/OnDecodeStreamCallback;

    invoke-interface {p1, p3, p4}, Lcom/jieli/jl_audio_decode/callback/OnStateCallback;->onError(ILjava/lang/String;)V

    return-void

    :cond_2
    iget-object p1, p0, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->mDecodeStreamCallback:Lcom/jieli/jl_audio_decode/callback/OnDecodeStreamCallback;

    invoke-interface {p1}, Lcom/jieli/jl_audio_decode/callback/OnStateCallback;->onStart()V

    return-void

    :cond_3
    iget-object p1, p0, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->mDecodeStreamCallback:Lcom/jieli/jl_audio_decode/callback/OnDecodeStreamCallback;

    invoke-interface {p1, p4}, Lcom/jieli/jl_audio_decode/callback/OnStateCallback;->onComplete(Ljava/lang/String;)V

    return-void

    :cond_4
    iget-object p1, p0, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->mEncodeFileCallback:Lcom/jieli/jl_audio_decode/callback/OnStateCallback;

    if-eqz p1, :cond_c

    if-eqz p2, :cond_7

    if-eq p2, v1, :cond_6

    if-eq p2, v0, :cond_5

    goto :goto_0

    :cond_5
    iget-object p1, p0, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->mEncodeFileCallback:Lcom/jieli/jl_audio_decode/callback/OnStateCallback;

    invoke-interface {p1, p3, p4}, Lcom/jieli/jl_audio_decode/callback/OnStateCallback;->onError(ILjava/lang/String;)V

    return-void

    :cond_6
    iget-object p1, p0, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->mEncodeFileCallback:Lcom/jieli/jl_audio_decode/callback/OnStateCallback;

    invoke-interface {p1}, Lcom/jieli/jl_audio_decode/callback/OnStateCallback;->onStart()V

    return-void

    :cond_7
    iget-object p1, p0, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->mEncodeFileCallback:Lcom/jieli/jl_audio_decode/callback/OnStateCallback;

    invoke-interface {p1, p4}, Lcom/jieli/jl_audio_decode/callback/OnStateCallback;->onComplete(Ljava/lang/String;)V

    return-void

    :cond_8
    iget-object p1, p0, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->mDecodeFileCallback:Lcom/jieli/jl_audio_decode/callback/OnStateCallback;

    if-eqz p1, :cond_c

    if-eqz p2, :cond_b

    if-eq p2, v1, :cond_a

    if-eq p2, v0, :cond_9

    goto :goto_0

    :cond_9
    iget-object p1, p0, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->mDecodeFileCallback:Lcom/jieli/jl_audio_decode/callback/OnStateCallback;

    invoke-interface {p1, p3, p4}, Lcom/jieli/jl_audio_decode/callback/OnStateCallback;->onError(ILjava/lang/String;)V

    return-void

    :cond_a
    iget-object p1, p0, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->mDecodeFileCallback:Lcom/jieli/jl_audio_decode/callback/OnStateCallback;

    invoke-interface {p1}, Lcom/jieli/jl_audio_decode/callback/OnStateCallback;->onStart()V

    return-void

    :cond_b
    iget-object p1, p0, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->mDecodeFileCallback:Lcom/jieli/jl_audio_decode/callback/OnStateCallback;

    invoke-interface {p1, p4}, Lcom/jieli/jl_audio_decode/callback/OnStateCallback;->onComplete(Ljava/lang/String;)V

    :cond_c
    :goto_0
    return-void
.end method

.method public release()V
    .locals 2

    invoke-virtual {p0}, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->isDecodeStream()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->stopDecodeStream()V

    :cond_0
    invoke-direct {p0}, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->stopEncodeFileThread()V

    invoke-direct {p0}, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->stopDecodeFileThread()V

    invoke-direct {p0}, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->stopAddDataThread()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->setDecodeFileCallback(Lcom/jieli/jl_audio_decode/callback/OnStateCallback;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->setEncodeFileCallback(Lcom/jieli/jl_audio_decode/callback/OnStateCallback;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->setDecodeStreamCallback(Lcom/jieli/jl_audio_decode/callback/OnDecodeStreamCallback;)V

    iget-wide v0, p0, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->managerAddr:J

    invoke-direct {p0, v0, v1}, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->nativeDestroy(J)I

    move-result v0

    if-nez v0, :cond_1

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->managerAddr:J

    :cond_1
    return-void
.end method

.method public setDecodeFileCallback(Lcom/jieli/jl_audio_decode/callback/OnStateCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->mDecodeFileCallback:Lcom/jieli/jl_audio_decode/callback/OnStateCallback;

    return-void
.end method

.method public setDecodeStreamCallback(Lcom/jieli/jl_audio_decode/callback/OnDecodeStreamCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->mDecodeStreamCallback:Lcom/jieli/jl_audio_decode/callback/OnDecodeStreamCallback;

    return-void
.end method

.method public setEncodeFileCallback(Lcom/jieli/jl_audio_decode/callback/OnStateCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->mEncodeFileCallback:Lcom/jieli/jl_audio_decode/callback/OnStateCallback;

    return-void
.end method

.method public startDecodeStream(Lcom/jieli/jl_audio_decode/callback/OnDecodeStreamCallback;)V
    .locals 2

    invoke-virtual {p0}, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->isDecodeStream()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->setDecodeStreamCallback(Lcom/jieli/jl_audio_decode/callback/OnDecodeStreamCallback;)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->nativeDecodeStream(I)V

    return-void

    :cond_0
    if-eqz p1, :cond_1

    const/16 v0, -0x3eb

    const-string v1, "Decoding Stream is working, please don\'t open again."

    invoke-interface {p1, v0, v1}, Lcom/jieli/jl_audio_decode/callback/OnStateCallback;->onError(ILjava/lang/String;)V

    :cond_1
    return-void
.end method

.method public stopDecodeStream()V
    .locals 1

    invoke-virtual {p0}, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->isDecodeStream()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->nativeDecodeStream(I)V

    :cond_0
    return-void
.end method

.method public writeAudioStream([B)V
    .locals 1

    invoke-virtual {p0}, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->isDecodeStream()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lcom/jieli/jl_audio_decode/speex/SpeexManager;->addStreamData([B)V

    :cond_0
    return-void
.end method
