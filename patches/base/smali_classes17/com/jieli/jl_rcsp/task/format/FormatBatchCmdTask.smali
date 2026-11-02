.class Lcom/jieli/jl_rcsp/task/format/FormatBatchCmdTask;
.super Lcom/jieli/jl_rcsp/task/TaskBase;
.source "SourceFile"


# instance fields
.field public final b:B


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;B)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/task/TaskBase;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;)V

    iput-byte p2, p0, Lcom/jieli/jl_rcsp/task/format/FormatBatchCmdTask;->b:B

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/format/FormatBatchCmdTask;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackFinish()V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/format/FormatBatchCmdTask;ILjava/lang/String;)V
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

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackBegin()V

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/BatchCmd$Param;

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/task/format/FormatBatchCmdTask;->b:B

    const/4 v2, 0x1

    new-array v3, v2, [B

    const/4 v4, 0x0

    aput-byte v2, v3, v4

    invoke-direct {v0, v1, v3}, Lcom/jieli/jl_rcsp/model/command/BatchCmd$Param;-><init>(B[B)V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    new-instance v3, Lcom/jieli/jl_rcsp/model/command/BatchCmd;

    invoke-direct {v3, v0}, Lcom/jieli/jl_rcsp/model/command/BatchCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/BatchCmd$Param;)V

    new-instance v0, Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;

    new-instance v4, Lcom/jieli/jl_rcsp/task/format/FormatBatchCmdTask$1;

    invoke-direct {v4, p0}, Lcom/jieli/jl_rcsp/task/format/FormatBatchCmdTask$1;-><init>(Lcom/jieli/jl_rcsp/task/format/FormatBatchCmdTask;)V

    new-instance v5, Lcom/jieli/jl_rcsp/task/format/FormatBatchCmdTask$2;

    invoke-direct {v5, p0}, Lcom/jieli/jl_rcsp/task/format/FormatBatchCmdTask$2;-><init>(Lcom/jieli/jl_rcsp/task/format/FormatBatchCmdTask;)V

    const-string v6, "FormatBatchCmd"

    invoke-direct {v0, v6, v4, v5}, Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;Lcom/jieli/jl_rcsp/interfaces/IHandleResult;)V

    invoke-virtual {v1, v2, v3, v0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method
