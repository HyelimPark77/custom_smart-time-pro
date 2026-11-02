.class public Lcom/jieli/jl_rcsp/task/smallfile/DeleteFileTask;
.super Lcom/jieli/jl_rcsp/task/TaskBase;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_rcsp/task/smallfile/DeleteFileTask$Param;
    }
.end annotation


# instance fields
.field public final b:Lcom/jieli/jl_rcsp/task/smallfile/DeleteFileTask$Param;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Lcom/jieli/jl_rcsp/task/smallfile/DeleteFileTask$Param;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/task/TaskBase;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;)V

    if-eqz p2, :cond_0

    iput-object p2, p0, Lcom/jieli/jl_rcsp/task/smallfile/DeleteFileTask;->b:Lcom/jieli/jl_rcsp/task/smallfile/DeleteFileTask$Param;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "DeleteFileTask.Param can not be null."

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/smallfile/DeleteFileTask;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackFinish()V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/smallfile/DeleteFileTask;ILjava/lang/String;)V
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackError(ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public cancel(B)V
    .locals 0

    return-void
.end method

.method public start()V
    .locals 7

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

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$DeleteFileParam;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/smallfile/DeleteFileTask;->b:Lcom/jieli/jl_rcsp/task/smallfile/DeleteFileTask$Param;

    invoke-static {v1}, Lcom/jieli/jl_rcsp/task/smallfile/DeleteFileTask$Param;->a(Lcom/jieli/jl_rcsp/task/smallfile/DeleteFileTask$Param;)B

    move-result v1

    iget-object v2, p0, Lcom/jieli/jl_rcsp/task/smallfile/DeleteFileTask;->b:Lcom/jieli/jl_rcsp/task/smallfile/DeleteFileTask$Param;

    invoke-static {v2}, Lcom/jieli/jl_rcsp/task/smallfile/DeleteFileTask$Param;->b(Lcom/jieli/jl_rcsp/task/smallfile/DeleteFileTask$Param;)S

    move-result v2

    invoke-direct {v0, v1, v2}, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$DeleteFileParam;-><init>(BS)V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    new-instance v3, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd;

    invoke-direct {v3, v0}, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$Param;)V

    new-instance v0, Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "#SmallFileTransfer"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lcom/jieli/jl_rcsp/task/smallfile/DeleteFileTask$1;

    invoke-direct {v5, p0}, Lcom/jieli/jl_rcsp/task/smallfile/DeleteFileTask$1;-><init>(Lcom/jieli/jl_rcsp/task/smallfile/DeleteFileTask;)V

    new-instance v6, Lcom/jieli/jl_rcsp/task/smallfile/DeleteFileTask$2;

    invoke-direct {v6, p0}, Lcom/jieli/jl_rcsp/task/smallfile/DeleteFileTask$2;-><init>(Lcom/jieli/jl_rcsp/task/smallfile/DeleteFileTask;)V

    invoke-direct {v0, v4, v5, v6}, Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;Lcom/jieli/jl_rcsp/interfaces/IHandleResult;)V

    const/16 v4, 0x1388

    invoke-virtual {v1, v2, v3, v4, v0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;ILcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method
