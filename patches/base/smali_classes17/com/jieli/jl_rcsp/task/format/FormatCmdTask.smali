.class Lcom/jieli/jl_rcsp/task/format/FormatCmdTask;
.super Lcom/jieli/jl_rcsp/task/TaskBase;
.source "SourceFile"


# instance fields
.field public final b:B

.field public final c:I


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;BI)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/task/TaskBase;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;)V

    iput-byte p2, p0, Lcom/jieli/jl_rcsp/task/format/FormatCmdTask;->b:B

    iput p3, p0, Lcom/jieli/jl_rcsp/task/format/FormatCmdTask;->c:I

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/format/FormatCmdTask;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/format/FormatCmdTask;->a()V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/format/FormatCmdTask;ILjava/lang/String;)V
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackError(ILjava/lang/String;)V

    return-void
.end method

.method public static synthetic b(Lcom/jieli/jl_rcsp/task/format/FormatCmdTask;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackFinish()V

    return-void
.end method

.method public static synthetic b(Lcom/jieli/jl_rcsp/task/format/FormatCmdTask;ILjava/lang/String;)V
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackError(ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    .line 3
    new-instance v0, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceFormatCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceFormatCmd$Param;

    iget v2, p0, Lcom/jieli/jl_rcsp/task/format/FormatCmdTask;->c:I

    invoke-direct {v1, v2}, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceFormatCmd$Param;-><init>(I)V

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceFormatCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/file_op/DeviceFormatCmd$Param;)V

    .line 4
    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    new-instance v3, Lcom/jieli/jl_rcsp/tool/BooleanRcspActionCallback;

    new-instance v4, Lcom/jieli/jl_rcsp/task/format/FormatCmdTask$2;

    invoke-direct {v4, p0}, Lcom/jieli/jl_rcsp/task/format/FormatCmdTask$2;-><init>(Lcom/jieli/jl_rcsp/task/format/FormatCmdTask;)V

    const-string v5, "formatDevice"

    invoke-direct {v3, v5, v4}, Lcom/jieli/jl_rcsp/tool/BooleanRcspActionCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    const/16 v4, 0x7530

    invoke-virtual {v1, v2, v0, v4, v3}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;ILcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public final b()V
    .locals 6

    .line 3
    new-instance v0, Lcom/jieli/jl_rcsp/model/command/NotifyPrepareEnvCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/command/NotifyPrepareEnvCmd$Param;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Lcom/jieli/jl_rcsp/model/command/NotifyPrepareEnvCmd$Param;-><init>(B)V

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/command/NotifyPrepareEnvCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/NotifyPrepareEnvCmd$Param;)V

    .line 4
    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    new-instance v3, Lcom/jieli/jl_rcsp/tool/BooleanRcspActionCallback;

    new-instance v4, Lcom/jieli/jl_rcsp/task/format/FormatCmdTask$1;

    invoke-direct {v4, p0}, Lcom/jieli/jl_rcsp/task/format/FormatCmdTask$1;-><init>(Lcom/jieli/jl_rcsp/task/format/FormatCmdTask;)V

    const-string v5, "prepareDelEnv"

    invoke-direct {v3, v5, v4}, Lcom/jieli/jl_rcsp/tool/BooleanRcspActionCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    invoke-virtual {v1, v2, v0, v3}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public cancel(B)V
    .locals 0

    return-void
.end method

.method public start()V
    .locals 0

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackBegin()V

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/format/FormatCmdTask;->b()V

    return-void
.end method
