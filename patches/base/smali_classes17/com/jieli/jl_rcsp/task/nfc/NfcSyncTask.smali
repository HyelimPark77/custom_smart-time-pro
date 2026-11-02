.class public Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;
.super Lcom/jieli/jl_rcsp/task/TaskBase;
.source "SourceFile"


# instance fields
.field public final b:Landroid/bluetooth/BluetoothDevice;

.field public final c:I

.field public final d:Ljava/io/ByteArrayOutputStream;

.field public e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/NfcMsg;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Landroid/os/Handler;

.field public final g:Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Landroid/bluetooth/BluetoothDevice;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/task/TaskBase;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;)V

    new-instance p1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {p1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;->d:Ljava/io/ByteArrayOutputStream;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;->e:Ljava/util/List;

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/b81;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/b81;-><init>(Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;)V

    invoke-direct {p1, v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;->f:Landroid/os/Handler;

    new-instance p1, Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask$2;

    invoke-direct {p1, p0}, Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask$2;-><init>(Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;)V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;->g:Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;

    iput-object p2, p0, Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;->b:Landroid/bluetooth/BluetoothDevice;

    iput p3, p0, Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;->c:I

    return-void
.end method

.method public static synthetic OXO1(Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;Landroid/os/Message;)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;->a(Landroid/os/Message;)Z

    move-result p0

    return p0
.end method

.method public static synthetic a()I
    .locals 1

    .line 2
    sget v0, Lcom/jieli/jl_rcsp/task/TaskBase;->TIMEOUT:I

    return v0
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;->f:Landroid/os/Handler;

    return-object p0
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;ILjava/lang/String;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2}, Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;->onError(ILjava/lang/String;)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;[B)V
    .locals 0

    .line 4
    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;->a([B)V

    return-void
.end method

.method private a([B)V
    .locals 5

    .line 8
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->isRun()Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p1, :cond_1

    array-length v0, p1

    if-nez v0, :cond_0

    goto :goto_0

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;->f:Landroid/os/Handler;

    const/16 v1, 0x1122

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 10
    :try_start_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    const-string v2, "onData"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "outputStream size =  "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;->d:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ", data = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v2, v3}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;->d:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write([B)V

    .line 12
    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;->f:Landroid/os/Handler;

    sget v0, Lcom/jieli/jl_rcsp/task/TaskBase;->TIMEOUT:I

    int-to-long v2, v0

    invoke-virtual {p1, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 13
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 14
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

    :cond_1
    :goto_0
    return-void
.end method

.method private synthetic a(Landroid/os/Message;)Z
    .locals 2

    .line 5
    iget p1, p1, Landroid/os/Message;->what:I

    const/16 v0, 0x1122

    if-ne p1, v0, :cond_0

    .line 6
    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    const-string v0, "MSG_WAITING_FOR_DATA_TIMEOUT"

    const-string v1, ""

    invoke-static {p1, v0, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 p1, 0x3002

    .line 7
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackError(I)V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method private b()V
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;->d:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    .line 3
    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;->b([B)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;->e:Ljava/util/List;

    .line 4
    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "data len : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length v0, v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "onFinish"

    invoke-static {v1, v2, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;->release()V

    .line 6
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackFinish()V

    return-void
.end method

.method public static synthetic b(Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;->b()V

    return-void
.end method

.method private c()V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;->g:Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->registerOnRcspCallback(Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;->d:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->reset()V

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackBegin()V

    return-void
.end method

.method private onError(ILjava/lang/String;)V
    .locals 3

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

    const-string v2, "onError"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;->release()V

    if-nez p2, :cond_0

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackError(I)V

    return-void

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackError(ILjava/lang/String;)V

    return-void
.end method

.method private release()V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;->d:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->reset()V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;->g:Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->unregisterOnRcspCallback(Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;->f:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final b([B)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/NfcMsg;",
            ">;"
        }
    .end annotation

    .line 7
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "data = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "parseNfcMsgList"

    invoke-static {v1, v3, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    array-length v1, p1

    const/16 v2, 0x2c

    if-le v1, v2, :cond_1

    const/4 v1, 0x0

    move v2, v1

    .line 10
    :cond_0
    :goto_0
    array-length v4, p1

    if-ge v2, v4, :cond_1

    add-int/lit8 v4, v2, 0x2a

    .line 11
    array-length v5, p1

    add-int/lit8 v6, v2, 0x2c

    if-le v5, v6, :cond_1

    const/4 v5, 0x2

    .line 12
    invoke-static {p1, v4, v5}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v5

    .line 13
    iget-object v7, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "nfcHeadLen = "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v9, ", start = "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v7, v3, v4}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    array-length v4, p1

    add-int/2addr v6, v5

    if-lt v4, v6, :cond_1

    add-int/lit8 v5, v5, 0x2c

    .line 15
    new-array v4, v5, [B

    .line 16
    invoke-static {p1, v2, v4, v1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v2, v5

    .line 17
    invoke-static {v4}, Lcom/jieli/jl_rcsp/model/device/NfcMsg;->parseNfcMsg([B)Lcom/jieli/jl_rcsp/model/device/NfcMsg;

    move-result-object v4

    .line 18
    iget-object v5, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "nfcMsg = "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v3, v6}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v4, :cond_0

    .line 19
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public cancel(B)V
    .locals 0

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->isRun()Z

    return-void
.end method

.method public getNfcMsgs()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/NfcMsg;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;->e:Ljava/util/List;

    return-object v0
.end method

.method public start()V
    .locals 6

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->isRun()Z

    move-result v0

    const-string v1, "start"

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    const-string v2, "Task is in progress."

    invoke-static {v0, v1, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    const-string v2, ""

    invoke-static {v0, v1, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;->c()V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;->b:Landroid/bluetooth/BluetoothDevice;

    iget v2, p0, Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;->c:I

    invoke-static {v2}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildStartNFCInfoSyncCmd(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v2

    new-instance v3, Lcom/jieli/jl_rcsp/tool/BooleanNfcActionCallback;

    new-instance v4, Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask$1;

    invoke-direct {v4, p0}, Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask$1;-><init>(Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;)V

    const-string v5, "StartNFCInfoSync"

    invoke-direct {v3, v5, v4}, Lcom/jieli/jl_rcsp/tool/BooleanNfcActionCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method
