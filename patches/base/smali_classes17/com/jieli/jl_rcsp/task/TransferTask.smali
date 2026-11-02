.class public Lcom/jieli/jl_rcsp/task/TransferTask;
.super Lcom/jieli/jl_rcsp/task/TaskBase;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;,
        Lcom/jieli/jl_rcsp/task/TransferTask$Param;,
        Lcom/jieli/jl_rcsp/task/TransferTask$SendData;
    }
.end annotation


# instance fields
.field public b:Ljava/lang/String;

.field public final c:Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;

.field public final d:Lcom/jieli/jl_rcsp/task/TransferTask$Param;

.field public final e:Landroid/os/Handler;

.field protected executor:Ljava/util/concurrent/ExecutorService;

.field public final f:Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;

.field public maxRenameCount:I


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Ljava/lang/String;Lcom/jieli/jl_rcsp/task/TransferTask$Param;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/task/TaskBase;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;)V

    const/16 p1, 0x9

    iput p1, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->maxRenameCount:I

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    iput-object p1, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->executor:Ljava/util/concurrent/ExecutorService;

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/fz5;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/fz5;-><init>(Lcom/jieli/jl_rcsp/task/TransferTask;)V

    invoke-direct {p1, v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->e:Landroid/os/Handler;

    new-instance p1, Lcom/jieli/jl_rcsp/task/TransferTask$8;

    invoke-direct {p1, p0}, Lcom/jieli/jl_rcsp/task/TransferTask$8;-><init>(Lcom/jieli/jl_rcsp/task/TransferTask;)V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->f:Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;

    if-eqz p3, :cond_0

    iput-object p3, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->d:Lcom/jieli/jl_rcsp/task/TransferTask$Param;

    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, ", class = "

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    const-string v0, "init"

    invoke-static {p1, v0, p3}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;

    const/4 p3, 0x0

    invoke-direct {p1, p3}, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;-><init>(Lcom/jieli/jl_rcsp/task/TransferTask$1;)V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->c:Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;

    invoke-virtual {p0, p2}, Lcom/jieli/jl_rcsp/task/TransferTask;->setPath(Ljava/lang/String;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "TransferTask.Param can not be null."

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic OXO1(Lcom/jieli/jl_rcsp/task/TransferTask;Landroid/os/Message;)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/task/TransferTask;->a(Landroid/os/Message;)Z

    move-result p0

    return p0
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/TransferTask;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TransferTask;->f()V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/TransferTask;I)V
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/task/TransferTask;->a(I)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/TransferTask;Lcom/jieli/jl_rcsp/model/command/file_op/LargeFileTransferGetNameCmd;)V
    .locals 0

    .line 4
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/task/TransferTask;->a(Lcom/jieli/jl_rcsp/model/command/file_op/LargeFileTransferGetNameCmd;)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/TransferTask;Lcom/jieli/jl_rcsp/model/command/file_op/LargeFileTransferOpCmd;)V
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/task/TransferTask;->a(Lcom/jieli/jl_rcsp/model/command/file_op/LargeFileTransferOpCmd;)V

    return-void
.end method

.method private synthetic a(Landroid/os/Message;)Z
    .locals 1

    .line 5
    iget p1, p1, Landroid/os/Message;->what:I

    const/16 v0, 0x1122

    if-ne p1, v0, :cond_0

    const/16 p1, 0x3002

    .line 6
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/task/TransferTask;->onError(I)V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public static synthetic b(Lcom/jieli/jl_rcsp/task/TransferTask;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TransferTask;->h()V

    return-void
.end method

.method public static synthetic c(Lcom/jieli/jl_rcsp/task/TransferTask;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TransferTask;->i()V

    return-void
.end method

.method public static synthetic d(Lcom/jieli/jl_rcsp/task/TransferTask;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TransferTask;->k()V

    return-void
.end method

.method public static synthetic e(Lcom/jieli/jl_rcsp/task/TransferTask;)Lcom/jieli/jl_rcsp/task/TransferTask$Param;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->d:Lcom/jieli/jl_rcsp/task/TransferTask$Param;

    return-object p0
.end method

.method public static synthetic f(Lcom/jieli/jl_rcsp/task/TransferTask;)Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->c:Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;

    return-object p0
.end method

.method public static synthetic g(Lcom/jieli/jl_rcsp/task/TransferTask;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->e:Landroid/os/Handler;

    return-object p0
.end method

.method private g()V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->c:Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->b()V

    .line 3
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->f:Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->registerOnRcspCallback(Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;)V

    .line 4
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mDeviceStatusManager:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->updateFileTransfer(Landroid/bluetooth/BluetoothDevice;Z)V

    .line 5
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackBegin()V

    return-void
.end method

.method public static synthetic h(Lcom/jieli/jl_rcsp/task/TransferTask;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TransferTask;->e()V

    return-void
.end method


# virtual methods
.method public final a(J)J
    .locals 2

    .line 7
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TransferTask;->b()J

    move-result-wide v0

    sub-long/2addr v0, p1

    return-wide v0
.end method

.method public final a()V
    .locals 3

    .line 35
    :try_start_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->executor:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/gz5;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/gz5;-><init>(Lcom/jieli/jl_rcsp/task/TransferTask;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 36
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 37
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exception : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x4005

    invoke-virtual {p0, v1, v0}, Lcom/jieli/jl_rcsp/task/TransferTask;->onError(ILjava/lang/String;)V

    return-void
.end method

.method public final a(I)V
    .locals 5

    .line 25
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->c:Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;

    iget-wide v0, v0, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->d:J

    invoke-virtual {p0, v0, v1}, Lcom/jieli/jl_rcsp/task/TransferTask;->a(J)J

    move-result-wide v0

    .line 26
    iget-object v2, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Transfer file take time -->"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", reason = "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "onStop"

    invoke-static {v2, v1, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_4

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    const/16 p1, 0x3005

    goto :goto_0

    :cond_0
    const/16 p1, 0x4201

    goto :goto_0

    :cond_1
    const/16 p1, 0x3100

    goto :goto_0

    :cond_2
    const/16 p1, 0x4203

    goto :goto_0

    :cond_3
    const/16 p1, 0x4117

    .line 27
    :goto_0
    invoke-static {p1}, Lcom/jieli/jl_rcsp/constant/WatchError;->getErrorDesc(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/jieli/jl_rcsp/task/TransferTask;->onError(ILjava/lang/String;)V

    return-void

    .line 28
    :cond_4
    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    const-string v0, "Transfer of large file is complete."

    invoke-static {p1, v1, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TransferTask;->c()Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 30
    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getCurrentReadFile(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)Lcom/jieli/jl_filebrowse/bean/Folder;

    move-result-object p1

    if-eqz p1, :cond_5

    const/4 v0, 0x0

    .line 31
    invoke-virtual {p1, v0}, Lcom/jieli/jl_filebrowse/bean/Folder;->setLoadFinished(Z)V

    .line 32
    :cond_5
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TransferTask;->release()V

    const/16 p1, 0x64

    .line 33
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackProgress(I)V

    .line 34
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackFinish()V

    return-void
.end method

.method public final synthetic a(III)V
    .locals 2

    .line 95
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed to read data. offset = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", packetSize = "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", buffer : "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/16 p2, 0x4005

    invoke-virtual {p0, p2, p1}, Lcom/jieli/jl_rcsp/task/TransferTask;->onError(ILjava/lang/String;)V

    return-void
.end method

.method public final synthetic a(IIILcom/jieli/jl_rcsp/model/command/file_op/LargeFileTransferOpCmd;)V
    .locals 9

    .line 69
    :try_start_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->c:Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;

    int-to-long v1, p1

    iput-wide v1, v0, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->j:J

    .line 70
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TransferTask;->b()J

    move-result-wide v3

    iput-wide v3, v0, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->i:J

    .line 71
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->c:Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;

    iget-object v0, v0, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->a:Ljava/io/RandomAccessFile;

    invoke-virtual {v0, v1, v2}, Ljava/io/RandomAccessFile;->seek(J)V

    const/4 v0, 0x0

    .line 72
    new-array v1, v0, [B

    .line 73
    iget-object v2, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->c:Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;

    iget v2, v2, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->f:I

    sub-int/2addr v2, p1

    invoke-static {p2, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    const/4 v3, -0x1

    if-ltz v2, :cond_0

    .line 74
    new-array v1, v2, [B

    .line 75
    iget-object v4, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->c:Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;

    iget-object v4, v4, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->a:Ljava/io/RandomAccessFile;

    invoke-virtual {v4, v1}, Ljava/io/RandomAccessFile;->read([B)I

    move-result v4

    goto :goto_0

    :catch_0
    move-exception p1

    goto/16 :goto_3

    :cond_0
    move v4, v3

    :goto_0
    if-ne v4, v3, :cond_1

    .line 76
    iget-object p3, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->e:Landroid/os/Handler;

    new-instance p4, Lcom/android/mltcode/paycertificationapi/dz5;

    invoke-direct {p4, p0, p1, v2, p2}, Lcom/android/mltcode/paycertificationapi/dz5;-><init>(Lcom/jieli/jl_rcsp/task/TransferTask;III)V

    invoke-virtual {p3, p4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    .line 77
    :cond_1
    invoke-static {v1, v0, v4}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    .line 78
    iget-object p2, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->c:Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;

    int-to-double v1, v4

    const-wide/high16 v5, 0x4024000000000000L    # 10.0

    mul-double/2addr v1, v5

    int-to-double v7, p3

    div-double/2addr v1, v7

    invoke-static {v1, v2, v5, v6}, Ljava/lang/Math;->max(DD)D

    move-result-wide v1

    double-to-long v1, v1

    iput-wide v1, p2, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->k:J

    move p2, v0

    move v1, p2

    :goto_1
    if-ge p2, v4, :cond_3

    sub-int v2, v4, p2

    .line 79
    invoke-static {p3, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    add-int v3, p2, v2

    .line 80
    invoke-static {p1, p2, v3}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p2

    .line 81
    iget-object v5, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->d:Lcom/jieli/jl_rcsp/task/TransferTask$Param;

    iget-boolean v6, v5, Lcom/jieli/jl_rcsp/task/TransferTask$Param;->appHasCrc16:Z

    const/4 v7, 0x1

    if-eqz v6, :cond_2

    invoke-static {v5}, Lcom/jieli/jl_rcsp/task/TransferTask$Param;->a(Lcom/jieli/jl_rcsp/task/TransferTask$Param;)Z

    move-result v5

    if-eqz v5, :cond_2

    add-int/lit8 v5, v2, 0x3

    .line 82
    new-array v5, v5, [B

    .line 83
    invoke-static {p2, v0}, Lcom/jieli/jl_rcsp/util/CryptoUtil;->CRC16([BS)S

    move-result v6

    shr-int/lit8 v8, v6, 0x8

    and-int/lit16 v8, v8, 0xff

    int-to-byte v8, v8

    .line 84
    aput-byte v8, v5, v7

    and-int/lit16 v6, v6, 0xff

    int-to-byte v6, v6

    const/4 v7, 0x2

    .line 85
    aput-byte v6, v5, v7

    const/4 v6, 0x3

    .line 86
    invoke-static {p2, v0, v5, v6, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_2

    :cond_2
    add-int/lit8 v5, v2, 0x1

    .line 87
    new-array v5, v5, [B

    .line 88
    invoke-static {p2, v0, v5, v7, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 89
    :goto_2
    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToByte(I)B

    move-result p2

    aput-byte p2, v5, v0

    .line 90
    iget-object p2, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->c:Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;

    iget-object p2, p2, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->g:Ljava/util/concurrent/LinkedBlockingQueue;

    new-instance v2, Lcom/jieli/jl_rcsp/task/TransferTask$SendData;

    invoke-virtual {p4}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getId()I

    move-result v6

    invoke-direct {v2, v6, v5}, Lcom/jieli/jl_rcsp/task/TransferTask$SendData;-><init>(I[B)V

    invoke-virtual {p2, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    move p2, v3

    goto :goto_1

    .line 91
    :cond_3
    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->c:Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;

    iget-boolean p1, p1, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->h:Z

    if-nez p1, :cond_4

    .line 92
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TransferTask;->e()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 93
    :goto_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 94
    iget-object p2, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->e:Landroid/os/Handler;

    new-instance p3, Lcom/android/mltcode/paycertificationapi/ez5;

    invoke-direct {p3, p0, p1}, Lcom/android/mltcode/paycertificationapi/ez5;-><init>(Lcom/jieli/jl_rcsp/task/TransferTask;Ljava/io/IOException;)V

    invoke-virtual {p2, p3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_4
    return-void
.end method

.method public final a(I[BLcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[B",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 49
    new-instance v0, Lcom/jieli/jl_rcsp/model/parameter/DataParam;

    invoke-direct {v0, p2}, Lcom/jieli/jl_rcsp/model/parameter/DataParam;-><init>([B)V

    .line 50
    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;->setXmOpCode(I)Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    .line 51
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/data/DataCmd;

    invoke-direct {p1, v0}, Lcom/jieli/jl_rcsp/model/command/data/DataCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/DataParam;)V

    .line 52
    iget-object p2, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    new-instance v1, Lcom/jieli/jl_rcsp/tool/BooleanRcspActionCallback;

    const-string v2, "sendData"

    invoke-direct {v1, v2, p3}, Lcom/jieli/jl_rcsp/tool/BooleanRcspActionCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    invoke-virtual {p2, v0, p1, v1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public final a(Lcom/jieli/jl_rcsp/model/command/file_op/LargeFileTransferGetNameCmd;)V
    .locals 4

    .line 8
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->isRun()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_1

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->e:Landroid/os/Handler;

    const/16 v1, 0x1122

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 10
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->e:Landroid/os/Handler;

    sget v2, Lcom/jieli/jl_rcsp/task/TaskBase;->TIMEOUT:I

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 11
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->b:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 12
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    .line 13
    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "File name = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", retryName = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->c:Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;

    iget v3, v3, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->e:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "onGetName"

    invoke-static {v1, v3, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    new-instance v1, Lcom/jieli/jl_rcsp/model/command/file_op/LargeFileTransferGetNameCmd$Param;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->c:Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;

    iget v2, v2, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->e:I

    invoke-direct {v1, v0, v2}, Lcom/jieli/jl_rcsp/model/command/file_op/LargeFileTransferGetNameCmd$Param;-><init>(Ljava/lang/String;I)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->d:Lcom/jieli/jl_rcsp/task/TransferTask$Param;

    iget-boolean v0, v0, Lcom/jieli/jl_rcsp/task/TransferTask$Param;->isOtherEncode:Z

    .line 15
    invoke-virtual {v1, v0}, Lcom/jieli/jl_rcsp/model/command/file_op/LargeFileTransferGetNameCmd$Param;->setOtherEncode(Z)Lcom/jieli/jl_rcsp/model/command/file_op/LargeFileTransferGetNameCmd$Param;

    move-result-object v0

    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->d:Lcom/jieli/jl_rcsp/task/TransferTask$Param;

    iget-object v1, v1, Lcom/jieli/jl_rcsp/task/TransferTask$Param;->encodeType:Ljava/lang/String;

    .line 16
    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/command/file_op/LargeFileTransferGetNameCmd$Param;->setEncodeType(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/command/file_op/LargeFileTransferGetNameCmd$Param;

    move-result-object v0

    .line 17
    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setParam(Lcom/jieli/jl_rcsp/model/base/BaseParameter;)V

    .line 18
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->c:Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;

    iget v0, v0, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->e:I

    iget v1, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->maxRenameCount:I

    const/4 v2, 0x1

    if-lt v0, v1, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    .line 19
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getOpCodeSn()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    .line 20
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    const/4 v3, 0x0

    invoke-virtual {v0, v1, p1, v3}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    .line 21
    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->d:Lcom/jieli/jl_rcsp/task/TransferTask$Param;

    iget-boolean p1, p1, Lcom/jieli/jl_rcsp/task/TransferTask$Param;->useFlash:Z

    if-nez p1, :cond_3

    .line 22
    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->c:Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;

    iget v0, p1, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->e:I

    iget v1, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->maxRenameCount:I

    if-lt v0, v1, :cond_2

    const/16 p1, 0x4202

    .line 23
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/task/TransferTask;->onError(I)V

    return-void

    :cond_2
    add-int/2addr v0, v2

    .line 24
    iput v0, p1, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->e:I

    :cond_3
    :goto_1
    return-void
.end method

.method public final a(Lcom/jieli/jl_rcsp/model/command/file_op/LargeFileTransferOpCmd;)V
    .locals 10

    .line 53
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->c:Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;

    iget v5, v0, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->c:I

    .line 54
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->isRun()Z

    move-result v0

    if-eqz v0, :cond_0

    if-lez v5, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->c:Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;

    iget-object v0, v0, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->a:Ljava/io/RandomAccessFile;

    if-nez v0, :cond_1

    :cond_0
    move-object v2, p0

    goto/16 :goto_4

    .line 55
    :cond_1
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getParam()Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    move-result-object v0

    check-cast v0, Lcom/jieli/jl_rcsp/model/parameter/LargeFileTransferOpParam;

    .line 56
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/parameter/LargeFileTransferOpParam;->getOffset()I

    move-result v3

    .line 57
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/parameter/LargeFileTransferOpParam;->getBuffer()S

    move-result v4

    .line 58
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->c:Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;

    iget-wide v0, v0, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->i:J

    invoke-virtual {p0, v0, v1}, Lcom/jieli/jl_rcsp/task/TransferTask;->a(J)J

    move-result-wide v0

    .line 59
    iget-object v2, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->c:Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;

    iget-wide v6, v2, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->j:J

    int-to-long v8, v3

    cmp-long v6, v6, v8

    if-nez v6, :cond_2

    iget-wide v6, v2, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->k:J

    cmp-long v2, v0, v6

    if-gez v2, :cond_2

    .line 60
    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    .line 61
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->c:Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;

    iget-wide v3, v1, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->k:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    filled-new-array {v2, v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    .line 62
    const-string v1, "Received same packet.Skip! offset = %d, take time = %d, limit = %d"

    invoke-static {v1, v0}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "pullData"

    invoke-static {p1, v1, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 63
    :cond_2
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->e:Landroid/os/Handler;

    const/16 v1, 0x1122

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    const/16 v0, 0x200

    if-le v3, v0, :cond_5

    .line 64
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->c:Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;

    iget v0, v0, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->f:I

    const/high16 v1, 0x42c80000    # 100.0f

    if-nez v0, :cond_3

    const/4 v0, 0x0

    goto :goto_0

    :cond_3
    int-to-float v2, v3

    mul-float/2addr v2, v1

    int-to-float v0, v0

    div-float v0, v2, v0

    :goto_0
    cmpl-float v2, v0, v1

    if-lez v2, :cond_4

    goto :goto_1

    :cond_4
    move v1, v0

    :goto_1
    float-to-int v0, v1

    .line 65
    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackProgress(I)V

    .line 66
    :cond_5
    :try_start_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->executor:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/hz5;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-object v2, p0

    move-object v6, p1

    :try_start_1
    invoke-direct/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/hz5;-><init>(Lcom/jieli/jl_rcsp/task/TransferTask;IIILcom/jieli/jl_rcsp/model/command/file_op/LargeFileTransferOpCmd;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception v0

    :goto_2
    move-object p1, v0

    goto :goto_3

    :catch_1
    move-exception v0

    move-object v2, p0

    goto :goto_2

    .line 67
    :goto_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 68
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Exception = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/16 v0, 0x4005

    invoke-virtual {p0, v0, p1}, Lcom/jieli/jl_rcsp/task/TransferTask;->onError(ILjava/lang/String;)V

    :goto_4
    return-void
.end method

.method public final synthetic a(Ljava/io/IOException;)V
    .locals 2

    .line 96
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "IO Exception = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/16 v0, 0x4005

    invoke-virtual {p0, v0, p1}, Lcom/jieli/jl_rcsp/task/TransferTask;->onError(ILjava/lang/String;)V

    return-void
.end method

.method public final synthetic a(Ljava/lang/Exception;)V
    .locals 2

    .line 38
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "IO Exception : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/16 v0, 0x4005

    invoke-virtual {p0, v0, p1}, Lcom/jieli/jl_rcsp/task/TransferTask;->onError(ILjava/lang/String;)V

    return-void
.end method

.method public final a(Ljava/lang/String;I)V
    .locals 4

    .line 39
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->isRun()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 40
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-static {p1, p2}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildExternalFlashInsertNewFileStartCmd(Ljava/lang/String;I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    new-instance p2, Lcom/jieli/jl_rcsp/tool/BooleanRcspActionCallback;

    new-instance v2, Lcom/jieli/jl_rcsp/task/TransferTask$2;

    invoke-direct {v2, p0}, Lcom/jieli/jl_rcsp/task/TransferTask$2;-><init>(Lcom/jieli/jl_rcsp/task/TransferTask;)V

    const-string v3, "startCreateFlashFile"

    invoke-direct {p2, v3, v2}, Lcom/jieli/jl_rcsp/tool/BooleanRcspActionCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    invoke-virtual {v0, v1, p1, p2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public final a([BIS)V
    .locals 4

    .line 41
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    .line 42
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p3}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v2

    invoke-static {p3}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v3

    filled-new-array {v1, v2, v3}, [Ljava/lang/Object;

    move-result-object v1

    .line 43
    const-string v2, "size = %d, crc16 = %d(0x%X)"

    invoke-static {v2, v1}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "startBigFileTransfer"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TransferTask;->b()J

    move-result-wide v0

    .line 45
    iget-object v2, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->c:Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;

    iput-wide v0, v2, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->d:J

    .line 46
    iput-wide v0, v2, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->i:J

    .line 47
    new-instance v0, Lcom/jieli/jl_rcsp/model/command/file_op/StartLargeFileTransferCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/StartLargeFileTransferParam;

    invoke-direct {v1, p1, p2, p3}, Lcom/jieli/jl_rcsp/model/parameter/StartLargeFileTransferParam;-><init>([BIS)V

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/command/file_op/StartLargeFileTransferCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/StartLargeFileTransferParam;)V

    .line 48
    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p2

    new-instance p3, Lcom/jieli/jl_rcsp/task/TransferTask$6;

    invoke-direct {p3, p0}, Lcom/jieli/jl_rcsp/task/TransferTask$6;-><init>(Lcom/jieli/jl_rcsp/task/TransferTask;)V

    invoke-virtual {p1, p2, v0, p3}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public final b()J
    .locals 2

    .line 2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public final c()Lcom/jieli/jl_filebrowse/bean/SDCardBean;
    .locals 5

    .line 2
    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getOnlineDev()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    .line 5
    invoke-virtual {v2}, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->getDevHandler()I

    move-result v3

    iget-object v4, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->d:Lcom/jieli/jl_rcsp/task/TransferTask$Param;

    iget v4, v4, Lcom/jieli/jl_rcsp/task/TransferTask$Param;->devHandler:I

    if-ne v3, v4, :cond_1

    return-object v2

    :cond_2
    :goto_0
    return-object v1
.end method

.method public cancel(B)V
    .locals 5

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->isRun()Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    new-instance v1, Lcom/jieli/jl_rcsp/model/command/file_op/CancelLargeFileTransferCmd;

    invoke-direct {v1}, Lcom/jieli/jl_rcsp/model/command/file_op/CancelLargeFileTransferCmd;-><init>()V

    new-instance v2, Lcom/jieli/jl_rcsp/tool/BooleanRcspActionCallback;

    new-instance v3, Lcom/jieli/jl_rcsp/task/TransferTask$1;

    invoke-direct {v3, p0}, Lcom/jieli/jl_rcsp/task/TransferTask$1;-><init>(Lcom/jieli/jl_rcsp/task/TransferTask;)V

    const-string v4, "cancel"

    invoke-direct {v2, v4, v3}, Lcom/jieli/jl_rcsp/tool/BooleanRcspActionCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    invoke-virtual {p1, v0, v1, v2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public final synthetic d()V
    .locals 18

    move-object/from16 v1, p0

    .line 2
    new-instance v0, Ljava/io/File;

    iget-object v2, v1, Lcom/jieli/jl_rcsp/task/TransferTask;->b:Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 3
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_5

    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v2

    if-nez v2, :cond_5

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v2, v4, v6

    if-nez v2, :cond_0

    goto/16 :goto_8

    .line 4
    :cond_0
    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/task/TransferTask;->b()J

    move-result-wide v4

    const/4 v2, 0x0

    .line 5
    :try_start_0
    iget-object v8, v1, Lcom/jieli/jl_rcsp/task/TransferTask;->c:Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;

    new-instance v9, Ljava/io/RandomAccessFile;

    const-string v10, "r"

    invoke-direct {v9, v0, v10}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v9, v8, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->a:Ljava/io/RandomAccessFile;

    .line 6
    iget-object v8, v1, Lcom/jieli/jl_rcsp/task/TransferTask;->c:Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v9

    long-to-int v9, v9

    iput v9, v8, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->f:I

    .line 7
    new-instance v8, Ljava/io/FileInputStream;

    invoke-direct {v8, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 8
    :try_start_1
    invoke-virtual {v8}, Ljava/io/FileInputStream;->available()I

    move-result v0

    int-to-long v9, v0

    const/16 v0, 0x800

    .line 9
    new-array v0, v0, [B

    move v2, v3

    .line 10
    :goto_0
    invoke-virtual {v8, v0}, Ljava/io/FileInputStream;->read([B)I

    move-result v11

    const/4 v12, -0x1

    if-eq v11, v12, :cond_1

    .line 11
    new-array v12, v11, [B

    .line 12
    invoke-static {v0, v3, v12, v3, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 13
    invoke-static {v12, v2}, Lcom/jieli/jl_rcsp/util/CryptoUtil;->CRC16([BS)S

    move-result v2

    int-to-long v11, v11

    add-long/2addr v6, v11

    goto :goto_0

    .line 14
    :cond_1
    invoke-virtual {v1, v4, v5}, Lcom/jieli/jl_rcsp/task/TransferTask;->a(J)J

    move-result-wide v3

    .line 15
    iget-object v0, v1, Lcom/jieli/jl_rcsp/task/TransferTask;->c:Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;

    iput-short v2, v0, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->b:S

    .line 16
    iget-object v0, v1, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    const-string v5, "countFileCrc"

    const-string v11, "Take data time = %d, file len = %d, file size = %d, data size = %d, crc = %d(0x%X)"

    .line 17
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    iget-object v3, v1, Lcom/jieli/jl_rcsp/task/TransferTask;->c:Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;

    iget v3, v3, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->f:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v14

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v15

    invoke-static {v2}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v16

    invoke-static {v2}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v17

    filled-new-array/range {v12 .. v17}, [Ljava/lang/Object;

    move-result-object v2

    .line 18
    invoke-static {v11, v2}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v5, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    iget-object v0, v1, Lcom/jieli/jl_rcsp/task/TransferTask;->c:Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;

    iget v2, v0, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->f:I

    int-to-long v2, v2

    cmp-long v2, v2, v6

    if-eqz v2, :cond_2

    long-to-int v2, v6

    .line 20
    iput v2, v0, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->f:I

    .line 21
    :cond_2
    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/task/TransferTask;->j()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    :try_start_2
    invoke-virtual {v8}, Ljava/io/FileInputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    return-void

    :catch_0
    move-exception v0

    goto :goto_3

    :catchall_0
    move-exception v0

    :goto_1
    move-object v2, v0

    goto :goto_6

    :catch_1
    move-exception v0

    move-object v2, v8

    goto :goto_2

    :catchall_1
    move-exception v0

    goto :goto_5

    :catch_2
    move-exception v0

    .line 23
    :goto_2
    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 24
    iget-object v3, v1, Lcom/jieli/jl_rcsp/task/TransferTask;->e:Landroid/os/Handler;

    new-instance v4, Lcom/android/mltcode/paycertificationapi/cz5;

    invoke-direct {v4, v1, v0}, Lcom/android/mltcode/paycertificationapi/cz5;-><init>(Lcom/jieli/jl_rcsp/task/TransferTask;Ljava/lang/Exception;)V

    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz v2, :cond_3

    .line 25
    :try_start_4
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_4

    .line 26
    :goto_3
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_3
    :goto_4
    return-void

    :goto_5
    move-object v8, v2

    goto :goto_1

    :goto_6
    if-eqz v8, :cond_4

    .line 27
    :try_start_5
    invoke-virtual {v8}, Ljava/io/FileInputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    goto :goto_7

    :catch_3
    move-exception v0

    .line 28
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 29
    :cond_4
    :goto_7
    throw v2

    .line 30
    :cond_5
    :goto_8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Path is invalid. path = "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v1, Lcom/jieli/jl_rcsp/task/TransferTask;->b:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v2, v3, [Ljava/lang/Object;

    invoke-static {v0, v2}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/16 v2, 0x1001

    invoke-virtual {v1, v2, v0}, Lcom/jieli/jl_rcsp/task/TransferTask;->onError(ILjava/lang/String;)V

    return-void
.end method

.method public final e()V
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->c:Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;

    iget-object v0, v0, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->g:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->c:Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->h:Z

    .line 4
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->isRun()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->e:Landroid/os/Handler;

    const/16 v1, 0x1122

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 6
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->e:Landroid/os/Handler;

    sget v2, Lcom/jieli/jl_rcsp/task/TaskBase;->TIMEOUT:I

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->c:Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;

    iget-object v0, v0, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->g:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/LinkedBlockingQueue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jieli/jl_rcsp/task/TransferTask$SendData;

    if-nez v0, :cond_2

    :cond_1
    return-void

    .line 8
    :cond_2
    iget v1, v0, Lcom/jieli/jl_rcsp/task/TransferTask$SendData;->a:I

    iget-object v0, v0, Lcom/jieli/jl_rcsp/task/TransferTask$SendData;->b:[B

    new-instance v2, Lcom/jieli/jl_rcsp/task/TransferTask$7;

    invoke-direct {v2, p0}, Lcom/jieli/jl_rcsp/task/TransferTask$7;-><init>(Lcom/jieli/jl_rcsp/task/TransferTask;)V

    invoke-virtual {p0, v1, v0, v2}, Lcom/jieli/jl_rcsp/task/TransferTask;->a(I[BLcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    return-void
.end method

.method public final f()V
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TransferTask;->release()V

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackCancel(I)V

    return-void
.end method

.method public getPath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final h()V
    .locals 6

    .line 2
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->isRun()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 3
    :cond_0
    new-instance v0, Lcom/jieli/jl_rcsp/model/command/NotifyPrepareEnvCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/command/NotifyPrepareEnvCmd$NotifyPrepareTransferLargeFileParam;

    invoke-direct {v1}, Lcom/jieli/jl_rcsp/model/command/NotifyPrepareEnvCmd$NotifyPrepareTransferLargeFileParam;-><init>()V

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/command/NotifyPrepareEnvCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/NotifyPrepareEnvCmd$Param;)V

    .line 4
    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    new-instance v3, Lcom/jieli/jl_rcsp/tool/BooleanRcspActionCallback;

    new-instance v4, Lcom/jieli/jl_rcsp/task/TransferTask$3;

    invoke-direct {v4, p0}, Lcom/jieli/jl_rcsp/task/TransferTask$3;-><init>(Lcom/jieli/jl_rcsp/task/TransferTask;)V

    const-string v5, "prepareBigFileTransferEnv"

    invoke-direct {v3, v5, v4}, Lcom/jieli/jl_rcsp/tool/BooleanRcspActionCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    invoke-virtual {v1, v2, v0, v3}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public final i()V
    .locals 7

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->isRun()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd$FileTransferParam;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->d:Lcom/jieli/jl_rcsp/task/TransferTask$Param;

    iget v2, v1, Lcom/jieli/jl_rcsp/task/TransferTask$Param;->devHandler:I

    iget-boolean v1, v1, Lcom/jieli/jl_rcsp/task/TransferTask$Param;->appHasCrc16:Z

    invoke-direct {v0, v2, v1}, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd$FileTransferParam;-><init>(IZ)V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    new-instance v3, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd;

    invoke-direct {v3, v0}, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd$Param;)V

    new-instance v0, Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;

    new-instance v4, Lcom/jieli/jl_rcsp/task/TransferTask$4;

    invoke-direct {v4, p0}, Lcom/jieli/jl_rcsp/task/TransferTask$4;-><init>(Lcom/jieli/jl_rcsp/task/TransferTask;)V

    new-instance v5, Lcom/jieli/jl_rcsp/task/TransferTask$5;

    invoke-direct {v5, p0}, Lcom/jieli/jl_rcsp/task/TransferTask$5;-><init>(Lcom/jieli/jl_rcsp/task/TransferTask;)V

    const-string v6, "readExternParam"

    invoke-direct {v0, v6, v4, v5}, Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;Lcom/jieli/jl_rcsp/interfaces/IHandleResult;)V

    invoke-virtual {v1, v2, v3, v0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public final j()V
    .locals 4

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->isRun()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->d:Lcom/jieli/jl_rcsp/task/TransferTask$Param;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "startFileTransferFlow"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->d:Lcom/jieli/jl_rcsp/task/TransferTask$Param;

    iget-boolean v0, v0, Lcom/jieli/jl_rcsp/task/TransferTask$Param;->useFlash:Z

    if-eqz v0, :cond_1

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->b:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v2

    long-to-int v0, v2

    invoke-virtual {p0, v1, v0}, Lcom/jieli/jl_rcsp/task/TransferTask;->a(Ljava/lang/String;I)V

    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TransferTask;->h()V

    return-void
.end method

.method public final k()V
    .locals 7

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->isRun()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "path = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "startTransferActual"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->b:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-nez v1, :cond_8

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v1, v3, v5

    if-nez v1, :cond_1

    goto/16 :goto_4

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/io/File;->lastModified()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v3, "%08x"

    invoke-static {v3, v0}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ".tmp\u0000"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->d:Lcom/jieli/jl_rcsp/task/TransferTask$Param;

    iget-object v1, v1, Lcom/jieli/jl_rcsp/task/TransferTask$Param;->outputDirPath:Ljava/lang/String;

    const/4 v3, -0x1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    sget-object v4, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->d:Lcom/jieli/jl_rcsp/task/TransferTask$Param;

    iget-object v1, v1, Lcom/jieli/jl_rcsp/task/TransferTask$Param;->outputDirPath:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    goto :goto_1

    :cond_3
    :goto_0
    move v1, v3

    :goto_1
    if-ne v1, v3, :cond_4

    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->d:Lcom/jieli/jl_rcsp/task/TransferTask$Param;

    iget-object v1, v1, Lcom/jieli/jl_rcsp/task/TransferTask$Param;->outputDirPath:Ljava/lang/String;

    goto :goto_2

    :cond_4
    iget-object v3, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->d:Lcom/jieli/jl_rcsp/task/TransferTask$Param;

    iget-object v3, v3, Lcom/jieli/jl_rcsp/task/TransferTask$Param;->outputDirPath:Ljava/lang/String;

    invoke-virtual {v3, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    :goto_2
    if-eqz v1, :cond_7

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_5

    goto :goto_3

    :cond_5
    sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_6

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_6
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_7
    :goto_3
    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "tempPath --->"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->c:Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;

    iget v2, v1, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->f:I

    iget-short v1, v1, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->b:S

    invoke-virtual {p0, v0, v2, v1}, Lcom/jieli/jl_rcsp/task/TransferTask;->a([BIS)V

    return-void

    :cond_8
    :goto_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Path is invalid. path = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x1001

    invoke-virtual {p0, v1, v0}, Lcom/jieli/jl_rcsp/task/TransferTask;->onError(ILjava/lang/String;)V

    return-void
.end method

.method public onError(I)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lcom/jieli/jl_rcsp/task/TransferTask;->onError(ILjava/lang/String;)V

    return-void
.end method

.method public onError(ILjava/lang/String;)V
    .locals 0

    .line 2
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TransferTask;->release()V

    if-nez p2, :cond_0

    .line 3
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackError(I)V

    return-void

    .line 4
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackError(ILjava/lang/String;)V

    return-void
.end method

.method public release()V
    .locals 3

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mDeviceStatusManager:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->updateFileTransfer(Landroid/bluetooth/BluetoothDevice;Z)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->c:Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->b()V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->f:Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->unregisterOnRcspCallback(Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->e:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->executor:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->executor:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    :cond_0
    return-void
.end method

.method public setPath(Ljava/lang/String;)V
    .locals 2

    iput-object p1, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->b:Ljava/lang/String;

    sget-object v0, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    add-int/lit8 v0, v0, 0x1

    sub-int/2addr p1, v0

    const/16 v0, 0x9

    if-le p1, v0, :cond_0

    const/16 p1, 0x20

    iput p1, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->maxRenameCount:I

    return-void

    :cond_0
    iput v0, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->maxRenameCount:I

    :cond_1
    return-void
.end method

.method public start()V
    .locals 3

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->isRun()Z

    move-result v0

    const-string v1, "start"

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    const-string v2, "Task is in progress."

    invoke-static {v0, v1, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->isFileTransfer()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    const-string v2, "SDK in file transfer."

    invoke-static {v0, v1, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v0, 0x1100

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/task/TransferTask;->onError(I)V

    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->isDeviceInCalling()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    const-string v2, "Device in calling."

    invoke-static {v0, v1, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v0, 0x3101

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/task/TransferTask;->onError(I)V

    return-void

    :cond_2
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->executor:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->executor:Ljava/util/concurrent/ExecutorService;

    :cond_3
    invoke-direct {p0}, Lcom/jieli/jl_rcsp/task/TransferTask;->g()V

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TransferTask;->a()V

    return-void
.end method
