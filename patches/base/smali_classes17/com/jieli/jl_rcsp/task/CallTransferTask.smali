.class public Lcom/jieli/jl_rcsp/task/CallTransferTask;
.super Lcom/jieli/jl_rcsp/task/TransferTask;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Ljava/lang/String;Lcom/jieli/jl_rcsp/task/TransferTask$Param;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/jieli/jl_rcsp/task/TransferTask;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Ljava/lang/String;Lcom/jieli/jl_rcsp/task/TransferTask$Param;)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/CallTransferTask;)V
    .locals 0

    invoke-super {p0}, Lcom/jieli/jl_rcsp/task/TransferTask;->start()V

    return-void
.end method


# virtual methods
.method public start()V
    .locals 6

    new-instance v0, Ljava/io/File;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TransferTask;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/jieli/jl_rcsp/model/command/file_op/DeleteFileByNameCmd;

    new-instance v2, Lcom/jieli/jl_rcsp/model/command/file_op/DeleteFileByNameCmd$Param;

    invoke-direct {v2, v0}, Lcom/jieli/jl_rcsp/model/command/file_op/DeleteFileByNameCmd$Param;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2}, Lcom/jieli/jl_rcsp/model/command/file_op/DeleteFileByNameCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/file_op/DeleteFileByNameCmd$Param;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    new-instance v3, Lcom/jieli/jl_rcsp/tool/BooleanRcspActionCallback;

    new-instance v4, Lcom/jieli/jl_rcsp/task/CallTransferTask$1;

    invoke-direct {v4, p0}, Lcom/jieli/jl_rcsp/task/CallTransferTask$1;-><init>(Lcom/jieli/jl_rcsp/task/CallTransferTask;)V

    const-string v5, "DeleteFileByName"

    invoke-direct {v3, v5, v4}, Lcom/jieli/jl_rcsp/tool/BooleanRcspActionCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    invoke-virtual {v0, v2, v1, v3}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method
