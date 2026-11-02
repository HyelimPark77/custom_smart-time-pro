.class public Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;
.super Lcom/jieli/jl_rcsp/task/TaskBase;
.source "SourceFile"


# static fields
.field public static WAIT_CMD_TIMEOUT:I = 0x2ee0

.field public static final g:I = 0x1016


# instance fields
.field public b:Landroid/bluetooth/BluetoothDevice;

.field public final c:Ljava/io/ByteArrayOutputStream;

.field public d:Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ReadErrorMsgResponse;

.field public final e:Landroid/os/Handler;

.field public final f:Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/task/TaskBase;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;)V

    new-instance p1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {p1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->c:Ljava/io/ByteArrayOutputStream;

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/sf2;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/sf2;-><init>(Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;)V

    invoke-direct {p1, v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->e:Landroid/os/Handler;

    new-instance p1, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask$4;

    invoke-direct {p1, p0}, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask$4;-><init>(Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;)V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->f:Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;

    return-void
.end method

.method public static synthetic OXO1(Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;Landroid/os/Message;)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->a(Landroid/os/Message;)Z

    move-result p0

    return p0
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;)Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ReadErrorMsgResponse;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->d:Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ReadErrorMsgResponse;

    return-object p0
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;ILjava/lang/String;)V
    .locals 0

    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->a(ILjava/lang/String;)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ReadErrorMsgResponse;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->a(Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ReadErrorMsgResponse;)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd;)V
    .locals 0

    .line 6
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->a(Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd;)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;[B)V
    .locals 0

    .line 5
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->a([B)V

    return-void
.end method

.method private synthetic a(Landroid/os/Message;)Z
    .locals 2

    .line 7
    iget p1, p1, Landroid/os/Message;->what:I

    const/16 v0, 0x1016

    if-ne p1, v0, :cond_0

    .line 8
    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    const-string v0, "MSG_WAIT_COMMAND_TIMEOUT"

    const-string v1, ""

    invoke-static {p1, v0, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->isRun()Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x3002

    .line 10
    const-string v0, "Waiting for data timeout."

    invoke-virtual {p0, p1, v0}, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->a(ILjava/lang/String;)V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;Landroid/bluetooth/BluetoothDevice;)Z
    .locals 0

    .line 4
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->a(Landroid/bluetooth/BluetoothDevice;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic c(Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->a()V

    return-void
.end method

.method public static synthetic d(Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->e:Landroid/os/Handler;

    return-object p0
.end method

.method private release()V
    .locals 3

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->b:Landroid/bluetooth/BluetoothDevice;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->f:Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->unregisterOnRcspCallback(Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;)V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->e:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    const/16 v0, 0x64

    .line 50
    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackProgress(I)V

    .line 51
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackFinish()V

    .line 52
    invoke-direct {p0}, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->release()V

    return-void
.end method

.method public final a(I)V
    .locals 1

    const/4 v0, 0x0

    .line 45
    invoke-virtual {p0, p1, v0}, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->a(ILjava/lang/String;)V

    return-void
.end method

.method public final a(ILjava/lang/String;)V
    .locals 3

    .line 46
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "code : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "postError"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-nez p2, :cond_0

    .line 47
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackError(I)V

    goto :goto_0

    .line 48
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackError(ILjava/lang/String;)V

    .line 49
    :goto_0
    invoke-direct {p0}, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->release()V

    return-void
.end method

.method public final a(Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ReadErrorMsgResponse;)V
    .locals 0

    .line 11
    iput-object p1, p0, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->d:Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ReadErrorMsgResponse;

    return-void
.end method

.method public final a(Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd;)V
    .locals 11

    const-string v0, "handleStopRead"

    if-eqz p1, :cond_2

    .line 30
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->isRun()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 31
    :cond_0
    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->c:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    const/4 v2, 0x0

    .line 32
    invoke-static {v1, v2}, Lcom/jieli/jl_rcsp/util/CryptoUtil;->CRC16([BS)S

    move-result v3

    .line 33
    iget-object v4, p0, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->d:Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ReadErrorMsgResponse;

    invoke-virtual {v4}, Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ReadErrorMsgResponse;->getCrc()S

    move-result v4

    if-ne v4, v3, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x6

    .line 34
    :goto_0
    iget-object v5, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    .line 35
    invoke-static {v3}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v6

    invoke-static {v3}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v7

    invoke-static {v4}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v8

    invoke-static {v4}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v9

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    filled-new-array {v6, v7, v8, v9, v10}, [Ljava/lang/Object;

    move-result-object v6

    .line 36
    const-string v7, "sdk read logcat crc = %d(0x%X), firmware crc = %d(0x%X), status = %d"

    invoke-static {v7, v6}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v0, v6}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    invoke-virtual {p1, v2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    .line 38
    new-instance v0, Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ResponseReadResult;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ResponseReadResult;-><init>()V

    .line 39
    array-length v1, v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ResponseReadResult;->setSize(I)V

    .line 40
    invoke-virtual {v0, v3}, Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ResponseReadResult;->setCrc(S)V

    .line 41
    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setParam(Lcom/jieli/jl_rcsp/model/base/BaseParameter;)V

    .line 42
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->b:Landroid/bluetooth/BluetoothDevice;

    new-instance v5, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask$3;

    invoke-direct {v5, p0, v2, v4, v3}, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask$3;-><init>(Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;ISS)V

    invoke-virtual {v0, v1, p1, v5}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void

    .line 43
    :cond_2
    :goto_1
    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    const-string v1, "Reading logcat did not start."

    invoke-static {p1, v0, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final a([B)V
    .locals 2

    if-eqz p1, :cond_4

    .line 12
    array-length v0, p1

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->isRun()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_5

    .line 13
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->e:Landroid/os/Handler;

    const/16 v1, 0x1016

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 14
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->e:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :catch_0
    move-exception p1

    goto :goto_1

    .line 15
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->c:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write([B)V

    .line 16
    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->c:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result p1

    .line 17
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->d:Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ReadErrorMsgResponse;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ReadErrorMsgResponse;->getSize()I

    move-result v0

    if-lez v0, :cond_3

    const/16 v0, 0x64

    mul-int/2addr p1, v0

    .line 18
    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->d:Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ReadErrorMsgResponse;

    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ReadErrorMsgResponse;->getSize()I

    move-result v1

    div-int/2addr p1, v1

    if-lt p1, v0, :cond_2

    const/16 p1, 0x63

    .line 19
    :cond_2
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackProgress(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    :cond_3
    :try_start_1
    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->c:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :catch_1
    move-exception p1

    .line 21
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_2

    .line 22
    :goto_1
    :try_start_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 23
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

    invoke-virtual {p0, v0, p1}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackError(ILjava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 24
    :try_start_3
    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->c:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_2

    :catch_2
    move-exception p1

    .line 25
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_2
    return-void

    .line 26
    :goto_3
    :try_start_4
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->c:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    goto :goto_4

    :catch_3
    move-exception v0

    .line 27
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 28
    :goto_4
    throw p1

    .line 29
    :cond_4
    :goto_5
    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    const-string v0, "handleLogcat"

    const-string v1, "invalid param."

    invoke-static {p1, v0, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final a(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 1

    if-eqz p1, :cond_0

    .line 44
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->b:Landroid/bluetooth/BluetoothDevice;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->b:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final b()V
    .locals 2

    .line 2
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->b:Landroid/bluetooth/BluetoothDevice;

    .line 3
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->c:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->reset()V

    .line 4
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->f:Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->registerOnRcspCallback(Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;)V

    .line 5
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackBegin()V

    return-void
.end method

.method public final c()V
    .locals 7

    .line 2
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->b()V

    .line 3
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->b:Landroid/bluetooth/BluetoothDevice;

    invoke-static {}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildStartReadErrorMsgCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v2

    new-instance v3, Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;

    new-instance v4, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask$1;

    invoke-direct {v4, p0}, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask$1;-><init>(Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;)V

    new-instance v5, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask$2;

    invoke-direct {v5, p0}, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask$2;-><init>(Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;)V

    const-string v6, "startReadLogcat"

    invoke-direct {v3, v6, v4, v5}, Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;Lcom/jieli/jl_rcsp/interfaces/IHandleResult;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public cancel(B)V
    .locals 0

    return-void
.end method

.method public getResult()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->c:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

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
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->isRcspInit()Z

    move-result v0

    if-nez v0, :cond_1

    const/16 v0, 0x2000

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->a(I)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getDeviceInfo()Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->isSupportReadErrorMSg()Z

    move-result v0

    if-nez v0, :cond_2

    const/16 v0, 0x1101

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->a(I)V

    return-void

    :cond_2
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    const-string v2, "device support reading error message."

    invoke-static {v0, v1, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->c()V

    return-void
.end method
