.class public Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;
.super Lcom/jieli/jl_rcsp/task/TaskBase;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;
    }
.end annotation


# instance fields
.field public final b:Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;

.field public c:Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask$File;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/task/TaskBase;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;)V

    if-eqz p2, :cond_1

    iput-object p2, p0, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;->b:Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;

    invoke-static {p2}, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;->a(Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;)I

    move-result p1

    if-nez p1, :cond_0

    invoke-static {}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getInstance()Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    move-result-object p1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getMaxCommunicationMtu(Landroid/bluetooth/BluetoothDevice;)I

    move-result p1

    add-int/lit8 p1, p1, -0x14

    invoke-static {p2, p1}, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;->a(Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;I)I

    :cond_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "AddFileTask.Param can not be null."

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;II)Lcom/jieli/jl_rcsp/model/base/BaseError;
    .locals 0

    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/task/TaskBase;->buildResponseBadState(II)Lcom/jieli/jl_rcsp/model/base/BaseError;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;)Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;
    .locals 0

    .line 4
    iget-object p0, p0, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;->b:Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;

    return-object p0
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;I)V
    .locals 0

    .line 5
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackProgress(I)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;IIS)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;->a(IIS)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;ILjava/lang/String;)V
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackError(ILjava/lang/String;)V

    return-void
.end method

.method public static synthetic b(Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;II)Lcom/jieli/jl_rcsp/model/base/BaseError;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/task/TaskBase;->buildResponseBadResult(II)Lcom/jieli/jl_rcsp/model/base/BaseError;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;)Ljava/lang/String;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic c(Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic d(Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;)V
    .locals 0

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackFinish()V

    return-void
.end method


# virtual methods
.method public a(SS[BS)Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$Param;
    .locals 6

    .line 12
    new-instance v0, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$AddFileParam;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;->b:Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;

    iget-byte v1, v1, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;->type:B

    move v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$AddFileParam;-><init>(BSS[BS)V

    return-object v0
.end method

.method public final a(IIS)V
    .locals 4

    .line 6
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;->b:Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;

    iget v0, v0, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;->size:I

    sub-int/2addr v0, p1

    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    .line 7
    new-array v0, p2, [B

    .line 8
    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;->b:Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;

    invoke-static {v1}, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;->c(Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;)[B

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, p1, v0, v2, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr p2, p1

    .line 9
    invoke-static {v0, p3}, Lcom/jieli/jl_rcsp/util/CryptoUtil;->CRC16([BS)S

    move-result p3

    int-to-short p1, p1

    .line 10
    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;->b:Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;

    iget v1, v1, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;->size:I

    int-to-short v1, v1

    invoke-virtual {p0, p1, v1, v0, p3}, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;->a(SS[BS)Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$Param;

    move-result-object p1

    .line 11
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd;

    invoke-direct {v2, p1}, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$Param;)V

    new-instance v3, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$1;

    invoke-direct {v3, p0, p2, p1, p3}, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$1;-><init>(Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;ILcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$Param;S)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public cancel(B)V
    .locals 1

    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "can not invoke cancel method"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getFile()Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask$File;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;->c:Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask$File;

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

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;->b:Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;->b(Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;)I

    move-result v0

    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;->b:Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;

    invoke-static {v1}, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;->a(Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;)I

    move-result v1

    iget-object v2, p0, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;->b:Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;

    iget v2, v2, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;->size:I

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;->a(IIS)V

    return-void
.end method
