.class public Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;
.super Lcom/jieli/jl_rcsp/task/TaskBase;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;
    }
.end annotation


# instance fields
.field public final b:Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;

.field public final c:Ljava/nio/ByteBuffer;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/task/TaskBase;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;)V

    if-eqz p2, :cond_2

    invoke-static {p2}, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;->a(Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;)I

    move-result p1

    if-lez p1, :cond_1

    iput-object p2, p0, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;->b:Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;

    invoke-static {p2}, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;->b(Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;)I

    move-result p1

    if-nez p1, :cond_0

    invoke-static {}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getInstance()Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    move-result-object p1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getMaxReceiveMtu(Landroid/bluetooth/BluetoothDevice;)I

    move-result p1

    add-int/lit8 p1, p1, -0x14

    invoke-static {p2, p1}, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;->a(Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;I)I

    :cond_0
    invoke-static {p2}, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;->a(Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;)I

    move-result p1

    invoke-static {p2}, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;->c(Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;)I

    move-result p2

    sub-int/2addr p1, p2

    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;->c:Ljava/nio/ByteBuffer;

    return-void

    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "The size must be greater than 0"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "ReadFileTask.Param can not be null."

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;II)Lcom/jieli/jl_rcsp/model/base/BaseError;
    .locals 0

    .line 4
    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/task/TaskBase;->buildResponseBadState(II)Lcom/jieli/jl_rcsp/model/base/BaseError;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackFinish()V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;I)V
    .locals 0

    .line 5
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackProgress(I)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;IIS)V
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2, p3}, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;->a(IIS)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;ILjava/lang/String;)V
    .locals 0

    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackError(ILjava/lang/String;)V

    return-void
.end method

.method public static synthetic b(Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;II)Lcom/jieli/jl_rcsp/model/base/BaseError;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/task/TaskBase;->buildResponseBadResult(II)Lcom/jieli/jl_rcsp/model/base/BaseError;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;)Ljava/nio/ByteBuffer;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;->c:Ljava/nio/ByteBuffer;

    return-object p0
.end method

.method public static synthetic c(Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;)Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;->b:Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;

    return-object p0
.end method


# virtual methods
.method public final a(IIS)V
    .locals 7

    .line 6
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;->b:Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;->c(Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;)I

    move-result v0

    if-ne p1, v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    move v6, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 7
    :goto_1
    new-instance v1, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$ReadFileParam;

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;->b:Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;->d(Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;)B

    move-result v2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;->b:Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;->e(Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;)S

    move-result v3

    int-to-short v4, p1

    int-to-short v5, p2

    invoke-direct/range {v1 .. v6}, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$ReadFileParam;-><init>(BSSSB)V

    .line 8
    new-instance v0, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd;

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$Param;)V

    .line 9
    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    new-instance v3, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$1;

    invoke-direct {v3, p0, p3, p1, p2}, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$1;-><init>(Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;SII)V

    invoke-virtual {v1, v2, v0, v3}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public cancel(B)V
    .locals 1

    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "can not invoke cancel method"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getReadData()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;->c:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    return-object v0
.end method

.method public start()V
    .locals 3

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->isRun()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    const-string v1, "start"

    const-string v2, "Task is in progress."

    invoke-static {v0, v1, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackBegin()V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;->b:Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;->c(Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;)I

    move-result v0

    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;->b:Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;

    invoke-static {v1}, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;->a(Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;)I

    move-result v1

    iget-object v2, p0, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;->b:Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;

    invoke-static {v2}, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;->b(Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;)I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;->a(IIS)V

    return-void
.end method
