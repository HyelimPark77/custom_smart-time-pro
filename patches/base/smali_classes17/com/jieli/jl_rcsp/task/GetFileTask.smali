.class public abstract Lcom/jieli/jl_rcsp/task/GetFileTask;
.super Lcom/jieli/jl_rcsp/task/TaskBase;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_rcsp/task/GetFileTask$Param;
    }
.end annotation


# static fields
.field public static final BYTE_ARRAY_STREAM:Ljava/lang/String; = "byte_array_stream"

.field public static final REASON_CANCEL_TASK:I = 0x0

.field public static final REASON_CRC_ERROR:I = 0x2

.field public static final REASON_LOST_DATA:I = 0x1

.field public static final l:I = 0x2201

.field public static final m:I = 0x2202


# instance fields
.field public final b:Ljava/lang/String;

.field public c:Ljava/io/OutputStream;

.field public d:[B

.field public final e:Lcom/jieli/jl_rcsp/task/GetFileTask$Param;

.field public f:Z

.field public g:Landroid/os/HandlerThread;

.field public h:Landroid/os/Handler;

.field public final i:Landroid/os/Handler;

.field public final j:Landroid/os/Handler$Callback;

.field public final k:Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;

.field protected useCrc:Z


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Ljava/lang/String;)V
    .locals 3

    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/task/TaskBase;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->c:Ljava/io/OutputStream;

    const/4 v0, 0x0

    new-array v1, v0, [B

    iput-object v1, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->d:[B

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->useCrc:Z

    iput-boolean v0, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->f:Z

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/X00010;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/X00010;-><init>(Lcom/jieli/jl_rcsp/task/GetFileTask;)V

    invoke-direct {v0, v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->i:Landroid/os/Handler;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OiX1iIIi;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OiX1iIIi;-><init>(Lcom/jieli/jl_rcsp/task/GetFileTask;)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->j:Landroid/os/Handler$Callback;

    new-instance v0, Lcom/jieli/jl_rcsp/task/GetFileTask$4;

    invoke-direct {v0, p0}, Lcom/jieli/jl_rcsp/task/GetFileTask$4;-><init>(Lcom/jieli/jl_rcsp/task/GetFileTask;)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->k:Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;

    iput-object p2, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->b:Ljava/lang/String;

    new-instance p2, Lcom/jieli/jl_rcsp/task/GetFileTask$Param;

    invoke-direct {p2, p1}, Lcom/jieli/jl_rcsp/task/GetFileTask$Param;-><init>(Lcom/jieli/jl_rcsp/task/GetFileTask$1;)V

    iput-object p2, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->e:Lcom/jieli/jl_rcsp/task/GetFileTask$Param;

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/GetFileTask;)Lcom/jieli/jl_rcsp/task/GetFileTask$Param;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->e:Lcom/jieli/jl_rcsp/task/GetFileTask$Param;

    return-object p0
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/GetFileTask;I)V
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/task/GetFileTask;->b(I)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/GetFileTask;ILjava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/jieli/jl_rcsp/task/GetFileTask;->onError(ILjava/lang/String;)V

    return-void
.end method

.method public static synthetic b(Lcom/jieli/jl_rcsp/task/GetFileTask;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->i:Landroid/os/Handler;

    return-object p0
.end method

.method public static synthetic b(Lcom/jieli/jl_rcsp/task/GetFileTask;I)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/task/GetFileTask;->onError(I)V

    return-void
.end method

.method public static synthetic c(Lcom/jieli/jl_rcsp/task/GetFileTask;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->h:Landroid/os/Handler;

    return-object p0
.end method

.method private onError(I)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/jieli/jl_rcsp/task/GetFileTask;->onError(ILjava/lang/String;)V

    return-void
.end method

.method private onError(ILjava/lang/String;)V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "code = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "onError "

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Lcom/jieli/jl_rcsp/task/GetFileTask;->release()V

    if-nez p2, :cond_0

    .line 4
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackError(I)V

    return-void

    .line 5
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackError(ILjava/lang/String;)V

    return-void
.end method

.method private release()V
    .locals 3

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mDeviceStatusManager:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->updateFileTransfer(Landroid/bluetooth/BluetoothDevice;Z)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->e:Lcom/jieli/jl_rcsp/task/GetFileTask$Param;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/task/GetFileTask$Param;->reset()V

    iput-boolean v2, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->f:Z

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->k:Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->unregisterOnRcspCallback(Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->i:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->h:Landroid/os/Handler;

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iput-object v1, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->h:Landroid/os/Handler;

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->g:Landroid/os/HandlerThread;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->g:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    :cond_1
    iput-object v1, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->g:Landroid/os/HandlerThread;

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->c:Ljava/io/OutputStream;

    if-eqz v0, :cond_2

    :try_start_0
    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->c:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object v1, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->c:Ljava/io/OutputStream;

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iput-object v1, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->c:Ljava/io/OutputStream;

    goto :goto_1

    :goto_0
    iput-object v1, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->c:Ljava/io/OutputStream;

    throw v0

    :cond_2
    :goto_1
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 44
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->isRun()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 45
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->c:Ljava/io/OutputStream;

    instance-of v1, v0, Ljava/io/ByteArrayOutputStream;

    if-eqz v1, :cond_1

    .line 46
    check-cast v0, Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->d:[B

    .line 47
    array-length v0, v0

    int-to-long v0, v0

    goto :goto_0

    .line 48
    :cond_1
    instance-of v0, v0, Ljava/io/FileOutputStream;

    if-eqz v0, :cond_2

    .line 49
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->b:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 50
    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v0

    goto :goto_0

    :cond_2
    const-wide/16 v0, 0x0

    .line 51
    :goto_0
    iget-object v2, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->e:Lcom/jieli/jl_rcsp/task/GetFileTask$Param;

    iget v2, v2, Lcom/jieli/jl_rcsp/task/GetFileTask$Param;->totalSize:I

    int-to-long v2, v2

    cmp-long v2, v0, v2

    if-eqz v2, :cond_3

    .line 52
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Data loss. Firmware return data size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->e:Lcom/jieli/jl_rcsp/task/GetFileTask$Param;

    iget v3, v3, Lcom/jieli/jl_rcsp/task/GetFileTask$Param;->totalSize:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", Actual received data size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x4003

    invoke-direct {p0, v1, v0}, Lcom/jieli/jl_rcsp/task/GetFileTask;->onError(ILjava/lang/String;)V

    return-void

    .line 53
    :cond_3
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Reading file completed. "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "onFinish"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    invoke-direct {p0}, Lcom/jieli/jl_rcsp/task/GetFileTask;->release()V

    const/16 v0, 0x64

    .line 55
    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackProgress(I)V

    .line 56
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackFinish()V

    return-void
.end method

.method public final synthetic a(I)V
    .locals 0

    .line 43
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackProgress(I)V

    return-void
.end method

.method public final a(ILjava/lang/String;)V
    .locals 6

    .line 7
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->isRun()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->f:Z

    if-nez v0, :cond_0

    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "reason : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "cancelBigFileTransfer"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->f:Z

    .line 10
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    new-instance v3, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd;

    new-instance v4, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$CancelParam;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToByte(I)B

    move-result v5

    invoke-direct {v4, v5}, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$CancelParam;-><init>(B)V

    invoke-direct {v3, v4}, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$Param;)V

    new-instance v4, Lcom/jieli/jl_rcsp/tool/BooleanRcspActionCallback;

    new-instance v5, Lcom/jieli/jl_rcsp/task/GetFileTask$3;

    invoke-direct {v5, p0, p1, p2}, Lcom/jieli/jl_rcsp/task/GetFileTask$3;-><init>(Lcom/jieli/jl_rcsp/task/GetFileTask;ILjava/lang/String;)V

    invoke-direct {v4, v2, v5}, Lcom/jieli/jl_rcsp/tool/BooleanRcspActionCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    invoke-virtual {v0, v1, v3, v4}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final a([B)V
    .locals 12

    .line 11
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->isRun()Z

    move-result v0

    if-eqz v0, :cond_6

    if-eqz p1, :cond_6

    array-length v0, p1

    const/4 v1, 0x4

    if-ge v0, v1, :cond_0

    goto/16 :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->i:Landroid/os/Handler;

    const/16 v1, 0x1122

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 13
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 14
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v2

    .line 15
    iget-object v3, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "offset = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, ", lastOffset = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->e:Lcom/jieli/jl_rcsp/task/GetFileTask$Param;

    iget v6, v6, Lcom/jieli/jl_rcsp/task/GetFileTask$Param;->lastOffset:I

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, ", data size = "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p1, p1

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v4, "onData"

    invoke-static {v3, v4, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->e:Lcom/jieli/jl_rcsp/task/GetFileTask$Param;

    iget v3, p1, Lcom/jieli/jl_rcsp/task/GetFileTask$Param;->lastOffset:I

    if-nez v3, :cond_1

    iput v2, p1, Lcom/jieli/jl_rcsp/task/GetFileTask$Param;->lastOffset:I

    .line 17
    :cond_1
    iget v3, p1, Lcom/jieli/jl_rcsp/task/GetFileTask$Param;->lastOffset:I

    const/4 v6, 0x1

    if-eq v3, v2, :cond_2

    .line 18
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {p1, v0}, [Ljava/lang/Object;

    move-result-object p1

    .line 19
    const-string v0, "Offset does not match. sdk count offset = %d, firmware return offset = %d."

    invoke-static {v0, p1}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 20
    invoke-virtual {p0, v6, p1}, Lcom/jieli/jl_rcsp/task/GetFileTask;->a(ILjava/lang/String;)V

    return-void

    :cond_2
    int-to-float v3, v3

    const/high16 v7, 0x3f800000    # 1.0f

    mul-float/2addr v3, v7

    .line 21
    iget v7, p1, Lcom/jieli/jl_rcsp/task/GetFileTask$Param;->totalSize:I

    int-to-float v7, v7

    div-float/2addr v3, v7

    const/high16 v7, 0x42c80000    # 100.0f

    mul-float/2addr v3, v7

    float-to-int v3, v3

    .line 22
    iget v7, p1, Lcom/jieli/jl_rcsp/task/GetFileTask$Param;->lastProgress:I

    if-eq v7, v3, :cond_3

    .line 23
    iput v3, p1, Lcom/jieli/jl_rcsp/task/GetFileTask$Param;->lastProgress:I

    .line 24
    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->i:Landroid/os/Handler;

    new-instance v7, Lcom/android/mltcode/paycertificationapi/Oi10I0;

    invoke-direct {v7, p0, v3}, Lcom/android/mltcode/paycertificationapi/Oi10I0;-><init>(Lcom/jieli/jl_rcsp/task/GetFileTask;I)V

    invoke-virtual {p1, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 25
    :cond_3
    iget-boolean p1, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->useCrc:Z

    if-eqz p1, :cond_4

    .line 26
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getShort()S

    move-result p1

    .line 27
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    move-result v3

    new-array v3, v3, [B

    .line 28
    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 29
    iget-object v7, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->e:Lcom/jieli/jl_rcsp/task/GetFileTask$Param;

    iget-short v8, v7, Lcom/jieli/jl_rcsp/task/GetFileTask$Param;->lastCrc:S

    invoke-static {v3, v8}, Lcom/jieli/jl_rcsp/util/CryptoUtil;->CRC16([BS)S

    move-result v8

    iput-short v8, v7, Lcom/jieli/jl_rcsp/task/GetFileTask$Param;->lastCrc:S

    .line 30
    iget-object v7, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v8

    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v9

    iget-object v10, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->e:Lcom/jieli/jl_rcsp/task/GetFileTask$Param;

    iget-short v10, v10, Lcom/jieli/jl_rcsp/task/GetFileTask$Param;->lastCrc:S

    invoke-static {v10}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v10

    iget-object v11, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->e:Lcom/jieli/jl_rcsp/task/GetFileTask$Param;

    iget-short v11, v11, Lcom/jieli/jl_rcsp/task/GetFileTask$Param;->lastCrc:S

    invoke-static {v11}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v11

    filled-new-array {v8, v9, v10, v11}, [Ljava/lang/Object;

    move-result-object v8

    const-string v9, "crc = %d(0x%X), lastCrc = %d(0x%X)"

    invoke-static {v9, v8}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v4, v8}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    iget-object v7, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->e:Lcom/jieli/jl_rcsp/task/GetFileTask$Param;

    iget-short v7, v7, Lcom/jieli/jl_rcsp/task/GetFileTask$Param;->lastCrc:S

    if-eq p1, v7, :cond_5

    .line 32
    invoke-static {v7}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p1

    filled-new-array {v0, p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "CRC error. data crc = 0x%X, firmware return crc = 0x%X"

    invoke-static {v0, p1}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x2

    .line 33
    invoke-virtual {p0, v0, p1}, Lcom/jieli/jl_rcsp/task/GetFileTask;->a(ILjava/lang/String;)V

    return-void

    .line 34
    :cond_4
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    move-result p1

    new-array v3, p1, [B

    .line 35
    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 36
    :cond_5
    :try_start_0
    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->c:Ljava/io/OutputStream;

    invoke-virtual {p1, v3}, Ljava/io/OutputStream;->write([B)V

    .line 37
    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->e:Lcom/jieli/jl_rcsp/task/GetFileTask$Param;

    array-length v7, v3

    add-int/2addr v2, v7

    iput v2, p1, Lcom/jieli/jl_rcsp/task/GetFileTask$Param;->lastOffset:I

    .line 38
    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "buf size = "

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length v3, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->e:Lcom/jieli/jl_rcsp/task/GetFileTask$Param;

    iget v3, v3, Lcom/jieli/jl_rcsp/task/GetFileTask$Param;->lastOffset:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v4, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->i:Landroid/os/Handler;

    sget v2, Lcom/jieli/jl_rcsp/task/TaskBase;->TIMEOUT:I

    int-to-long v2, v2

    invoke-virtual {p1, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    return-void

    :catch_0
    move-exception p1

    .line 41
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 42
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "IO exception : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v6, p1}, Lcom/jieli/jl_rcsp/task/GetFileTask;->a(ILjava/lang/String;)V

    :cond_6
    :goto_0
    return-void
.end method

.method public final synthetic a(Landroid/os/Message;)Z
    .locals 2

    .line 4
    iget p1, p1, Landroid/os/Message;->what:I

    const/16 v0, 0x1122

    if-ne p1, v0, :cond_0

    .line 5
    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    const-string v0, "MSG_WAITING_FOR_DATA_TIMEOUT"

    const-string v1, ""

    invoke-static {p1, v0, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 p1, 0x3002

    .line 6
    const-string v0, "Waiting for data timeout."

    invoke-direct {p0, p1, v0}, Lcom/jieli/jl_rcsp/task/GetFileTask;->onError(ILjava/lang/String;)V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public final b()V
    .locals 3

    .line 8
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->e:Lcom/jieli/jl_rcsp/task/GetFileTask$Param;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/task/GetFileTask$Param;->reset()V

    const/4 v0, 0x0

    .line 9
    new-array v1, v0, [B

    iput-object v1, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->d:[B

    .line 10
    iput-boolean v0, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->f:Z

    .line 11
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->k:Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->registerOnRcspCallback(Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;)V

    .line 12
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mDeviceStatusManager:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->updateFileTransfer(Landroid/bluetooth/BluetoothDevice;Z)V

    .line 13
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackBegin()V

    return-void
.end method

.method public final b(I)V
    .locals 0

    .line 14
    invoke-direct {p0}, Lcom/jieli/jl_rcsp/task/GetFileTask;->release()V

    .line 15
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackCancel(I)V

    return-void
.end method

.method public final synthetic b(Landroid/os/Message;)Z
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 3
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x2201

    if-eq v0, v1, :cond_2

    const/16 p1, 0x2202

    if-eq v0, p1, :cond_1

    goto :goto_0

    .line 4
    :cond_1
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/GetFileTask;->a()V

    goto :goto_0

    .line 5
    :cond_2
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v0, p1, [B

    if-eqz v0, :cond_3

    .line 6
    check-cast p1, [B

    .line 7
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/task/GetFileTask;->a([B)V

    :cond_3
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final c()V
    .locals 7

    .line 2
    new-instance v0, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/jieli/jl_rcsp/task/GetFileTask;->createParam(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$Param;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$Param;)V

    .line 3
    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    new-instance v3, Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;

    new-instance v4, Lcom/jieli/jl_rcsp/task/GetFileTask$1;

    invoke-direct {v4, p0}, Lcom/jieli/jl_rcsp/task/GetFileTask$1;-><init>(Lcom/jieli/jl_rcsp/task/GetFileTask;)V

    new-instance v5, Lcom/jieli/jl_rcsp/task/GetFileTask$2;

    invoke-direct {v5, p0}, Lcom/jieli/jl_rcsp/task/GetFileTask$2;-><init>(Lcom/jieli/jl_rcsp/task/GetFileTask;)V

    const-string v6, "ReadFileFromDevice"

    invoke-direct {v3, v6, v4, v5}, Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;Lcom/jieli/jl_rcsp/interfaces/IHandleResult;)V

    invoke-virtual {v1, v2, v0, v3}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public cancel(B)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/jieli/jl_rcsp/task/GetFileTask;->a(ILjava/lang/String;)V

    return-void
.end method

.method public abstract createParam(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$Param;
.end method

.method public getCacheData()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->d:[B

    return-object v0
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

    invoke-direct {p0, v0}, Lcom/jieli/jl_rcsp/task/GetFileTask;->onError(I)V

    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->isDeviceInCalling()Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0x3101

    invoke-direct {p0, v0}, Lcom/jieli/jl_rcsp/task/GetFileTask;->onError(I)V

    return-void

    :cond_2
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/GetFileTask;->b()V

    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "ReadFileThread"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->g:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    new-instance v0, Landroid/os/Handler;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->g:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    iget-object v2, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->j:Landroid/os/Handler$Callback;

    invoke-direct {v0, v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->h:Landroid/os/Handler;

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->b:Ljava/lang/String;

    const-string v1, "byte_array_stream"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->c:Ljava/io/OutputStream;

    goto :goto_0

    :cond_3
    :try_start_0
    new-instance v0, Ljava/io/FileOutputStream;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->b:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->c:Ljava/io/OutputStream;
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/GetFileTask;->c()V

    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    const/16 v0, 0x1001

    invoke-static {v0}, Lcom/jieli/jl_rcsp/constant/WatchError;->getErrorDesc(I)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "%s File not found."

    invoke-static {v2, v1}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/jieli/jl_rcsp/task/GetFileTask;->onError(ILjava/lang/String;)V

    return-void
.end method
