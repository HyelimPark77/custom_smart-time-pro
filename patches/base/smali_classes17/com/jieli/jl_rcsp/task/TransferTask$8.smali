.class Lcom/jieli/jl_rcsp/task/TransferTask$8;
.super Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/task/TransferTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_rcsp/task/TransferTask;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/task/TransferTask;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/task/TransferTask$8;->a:Lcom/jieli/jl_rcsp/task/TransferTask;

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onConnectStateChange(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 1

    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/TransferTask$8;->a:Lcom/jieli/jl_rcsp/task/TransferTask;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/task/TaskBase;->isRun()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    if-eq p2, p1, :cond_1

    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/TransferTask$8;->a:Lcom/jieli/jl_rcsp/task/TransferTask;

    const/16 p2, 0x2000

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Lcom/jieli/jl_rcsp/task/TransferTask;->onError(ILjava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V
    .locals 3

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TransferTask$8;->a:Lcom/jieli/jl_rcsp/task/TransferTask;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/task/TaskBase;->isRun()Z

    move-result v0

    if-eqz v0, :cond_3

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getId()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    :pswitch_1
    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/TransferTask$8;->a:Lcom/jieli/jl_rcsp/task/TransferTask;

    check-cast p2, Lcom/jieli/jl_rcsp/model/command/file_op/LargeFileTransferGetNameCmd;

    invoke-static {p1, p2}, Lcom/jieli/jl_rcsp/task/TransferTask;->a(Lcom/jieli/jl_rcsp/task/TransferTask;Lcom/jieli/jl_rcsp/model/command/file_op/LargeFileTransferGetNameCmd;)V

    return-void

    :pswitch_2
    check-cast p2, Lcom/jieli/jl_rcsp/model/command/file_op/CancelLargeFileTransferCmd;

    invoke-virtual {p2, v2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setParam(Lcom/jieli/jl_rcsp/model/base/BaseParameter;)V

    invoke-virtual {p2, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TransferTask$8;->a:Lcom/jieli/jl_rcsp/task/TransferTask;

    iget-object v0, v0, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {v0, p1, p2, v2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/TransferTask$8;->a:Lcom/jieli/jl_rcsp/task/TransferTask;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/task/TransferTask;->a(Lcom/jieli/jl_rcsp/task/TransferTask;)V

    return-void

    :pswitch_3
    check-cast p2, Lcom/jieli/jl_rcsp/model/command/file_op/LargeFileTransferOpCmd;

    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/TransferTask$8;->a:Lcom/jieli/jl_rcsp/task/TransferTask;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/task/TransferTask;->f(Lcom/jieli/jl_rcsp/task/TransferTask;)Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;

    move-result-object p1

    iget p1, p1, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->c:I

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/TransferTask$8;->a:Lcom/jieli/jl_rcsp/task/TransferTask;

    iget-object p1, p1, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    const-string p2, "onRcspCommand"

    const-string v0, "mtu is 0"

    invoke-static {p1, p2, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/TransferTask$8;->a:Lcom/jieli/jl_rcsp/task/TransferTask;

    invoke-static {p1, p2}, Lcom/jieli/jl_rcsp/task/TransferTask;->a(Lcom/jieli/jl_rcsp/task/TransferTask;Lcom/jieli/jl_rcsp/model/command/file_op/LargeFileTransferOpCmd;)V

    return-void

    :pswitch_4
    check-cast p2, Lcom/jieli/jl_rcsp/model/command/file_op/StopLargeFileTransferCmd;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getParam()Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    move-result-object v0

    check-cast v0, Lcom/jieli/jl_rcsp/model/command/file_op/StopLargeFileTransferCmd$Param;

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/command/file_op/StopLargeFileTransferCmd$Param;->getReason()I

    move-result v0

    invoke-virtual {p2, v2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setParam(Lcom/jieli/jl_rcsp/model/base/BaseParameter;)V

    invoke-virtual {p2, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/TransferTask$8;->a:Lcom/jieli/jl_rcsp/task/TransferTask;

    iget-object v1, v1, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {v1, p1, p2, v2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/TransferTask$8;->a:Lcom/jieli/jl_rcsp/task/TransferTask;

    invoke-static {p1, v0}, Lcom/jieli/jl_rcsp/task/TransferTask;->a(Lcom/jieli/jl_rcsp/task/TransferTask;I)V

    :cond_3
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1c
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
