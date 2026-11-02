.class Lcom/jieli/jl_rcsp/task/TransferTask$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/task/TransferTask;->a([BIS)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback<",
        "Lcom/jieli/jl_rcsp/model/command/file_op/StartLargeFileTransferCmd;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_rcsp/task/TransferTask;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/task/TransferTask;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/task/TransferTask$6;->a:Lcom/jieli/jl_rcsp/task/TransferTask;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/jieli/jl_rcsp/model/command/file_op/StartLargeFileTransferCmd;

    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/task/TransferTask$6;->onCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/file_op/StartLargeFileTransferCmd;)V

    return-void
.end method

.method public onCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/file_op/StartLargeFileTransferCmd;)V
    .locals 2

    .line 2
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getStatus()I

    move-result v0

    if-nez v0, :cond_1

    .line 3
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getResponse()Lcom/jieli/jl_rcsp/model/base/CommonResponse;

    move-result-object p2

    check-cast p2, Lcom/jieli/jl_rcsp/model/response/StartLargeFileTransferResponse;

    .line 4
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TransferTask$6;->a:Lcom/jieli/jl_rcsp/task/TransferTask;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/task/TransferTask;->f(Lcom/jieli/jl_rcsp/task/TransferTask;)Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;

    move-result-object v0

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/response/StartLargeFileTransferResponse;->getTransferMtu()S

    move-result p2

    iput p2, v0, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->c:I

    .line 5
    iget-object p2, p0, Lcom/jieli/jl_rcsp/task/TransferTask$6;->a:Lcom/jieli/jl_rcsp/task/TransferTask;

    iget-object p2, p2, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "transferMtu = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/TransferTask$6;->a:Lcom/jieli/jl_rcsp/task/TransferTask;

    invoke-static {v1}, Lcom/jieli/jl_rcsp/task/TransferTask;->f(Lcom/jieli/jl_rcsp/task/TransferTask;)Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;

    move-result-object v1

    iget v1, v1, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "startBigFileTransfer"

    invoke-static {p2, v1, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    iget-object p2, p0, Lcom/jieli/jl_rcsp/task/TransferTask$6;->a:Lcom/jieli/jl_rcsp/task/TransferTask;

    invoke-static {p2}, Lcom/jieli/jl_rcsp/task/TransferTask;->f(Lcom/jieli/jl_rcsp/task/TransferTask;)Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;

    move-result-object p2

    iget p2, p2, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->c:I

    if-gtz p2, :cond_0

    .line 7
    new-instance p2, Lcom/jieli/jl_rcsp/model/base/BaseError;

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TransferTask$6;->a:Lcom/jieli/jl_rcsp/task/TransferTask;

    .line 8
    invoke-static {v0}, Lcom/jieli/jl_rcsp/task/TransferTask;->f(Lcom/jieli/jl_rcsp/task/TransferTask;)Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;

    move-result-object v0

    iget v0, v0, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->c:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {p1, v0}, [Ljava/lang/Object;

    move-result-object v0

    .line 9
    const-string v1, "Device[%s] return an invalid mtu : %d."

    invoke-static {v1, v0}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x1001

    invoke-direct {p2, v1, v0}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(ILjava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/task/TransferTask$6;->onErrCode(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void

    .line 10
    :cond_0
    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/TransferTask$6;->a:Lcom/jieli/jl_rcsp/task/TransferTask;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/task/TransferTask;->g(Lcom/jieli/jl_rcsp/task/TransferTask;)Landroid/os/Handler;

    move-result-object p1

    const/16 p2, 0x1122

    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeMessages(I)V

    .line 11
    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/TransferTask$6;->a:Lcom/jieli/jl_rcsp/task/TransferTask;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/task/TransferTask;->g(Lcom/jieli/jl_rcsp/task/TransferTask;)Landroid/os/Handler;

    move-result-object p1

    sget v0, Lcom/jieli/jl_rcsp/task/TaskBase;->TIMEOUT:I

    int-to-long v0, v0

    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void

    .line 12
    :cond_1
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getResponse()Lcom/jieli/jl_rcsp/model/base/CommonResponse;

    move-result-object v0

    check-cast v0, Lcom/jieli/jl_rcsp/model/response/StartLargeFileTransferResponse;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/response/StartLargeFileTransferResponse;->getTransferMtu()S

    move-result v0

    if-eqz v0, :cond_2

    .line 13
    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/TransferTask$6;->a:Lcom/jieli/jl_rcsp/task/TransferTask;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getId()I

    move-result p2

    invoke-virtual {v1, p2, v0}, Lcom/jieli/jl_rcsp/task/TaskBase;->buildResponseBadResult(II)Lcom/jieli/jl_rcsp/model/base/BaseError;

    move-result-object p2

    goto :goto_0

    .line 14
    :cond_2
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TransferTask$6;->a:Lcom/jieli/jl_rcsp/task/TransferTask;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getId()I

    move-result v1

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getStatus()I

    move-result p2

    invoke-virtual {v0, v1, p2}, Lcom/jieli/jl_rcsp/task/TaskBase;->buildResponseBadState(II)Lcom/jieli/jl_rcsp/model/base/BaseError;

    move-result-object p2

    .line 15
    :goto_0
    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/task/TransferTask$6;->onErrCode(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void
.end method

.method public onErrCode(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 2

    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/TransferTask$6;->a:Lcom/jieli/jl_rcsp/task/TransferTask;

    iget-object p1, p1, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onErrCode ---> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "startBigFileTransfer"

    invoke-static {p1, v1, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/TransferTask$6;->a:Lcom/jieli/jl_rcsp/task/TransferTask;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getSubCode()I

    move-result v0

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v0, p2}, Lcom/jieli/jl_rcsp/task/TransferTask;->onError(ILjava/lang/String;)V

    return-void
.end method
