.class Lcom/jieli/jl_rcsp/task/GetFileTask$4;
.super Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/task/GetFileTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_rcsp/task/GetFileTask;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/task/GetFileTask;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/task/GetFileTask$4;->a:Lcom/jieli/jl_rcsp/task/GetFileTask;

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onConnectStateChange(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 0

    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/GetFileTask$4;->a:Lcom/jieli/jl_rcsp/task/GetFileTask;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/task/TaskBase;->isRun()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    if-eq p2, p1, :cond_1

    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/GetFileTask$4;->a:Lcom/jieli/jl_rcsp/task/GetFileTask;

    const/16 p2, 0x2000

    invoke-static {p1, p2}, Lcom/jieli/jl_rcsp/task/GetFileTask;->b(Lcom/jieli/jl_rcsp/task/GetFileTask;I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V
    .locals 4

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/GetFileTask$4;->a:Lcom/jieli/jl_rcsp/task/GetFileTask;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/task/TaskBase;->isRun()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getId()I

    move-result v0

    const/16 v1, 0x24

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    move-object v0, p2

    check-cast v0, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getParam()Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    move-result-object v1

    check-cast v1, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$Param;

    if-nez v1, :cond_2

    :goto_0
    return-void

    :cond_2
    iget-byte v2, v1, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$Param;->op:B

    const/16 v3, -0x80

    if-eq v2, v3, :cond_4

    const/16 v3, -0x7f

    if-eq v2, v3, :cond_3

    goto :goto_1

    :cond_3
    check-cast v1, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$CancelParam;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/task/GetFileTask$4;->a:Lcom/jieli/jl_rcsp/task/GetFileTask;

    iget-byte v1, v1, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$CancelParam;->reason:B

    invoke-static {v2, v1}, Lcom/jieli/jl_rcsp/task/GetFileTask;->a(Lcom/jieli/jl_rcsp/task/GetFileTask;I)V

    goto :goto_1

    :cond_4
    check-cast v1, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$StopParam;

    iget-byte v1, v1, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$StopParam;->ret:B

    if-eqz v1, :cond_5

    iget-object v2, p0, Lcom/jieli/jl_rcsp/task/GetFileTask$4;->a:Lcom/jieli/jl_rcsp/task/GetFileTask;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getId()I

    move-result v3

    invoke-virtual {v2, v3, v1}, Lcom/jieli/jl_rcsp/task/TaskBase;->buildResponseBadResult(II)Lcom/jieli/jl_rcsp/model/base/BaseError;

    move-result-object v1

    iget-object v2, p0, Lcom/jieli/jl_rcsp/task/GetFileTask$4;->a:Lcom/jieli/jl_rcsp/task/GetFileTask;

    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getSubCode()I

    move-result v3

    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v3, v1}, Lcom/jieli/jl_rcsp/task/GetFileTask;->a(Lcom/jieli/jl_rcsp/task/GetFileTask;ILjava/lang/String;)V

    goto :goto_1

    :cond_5
    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/GetFileTask$4;->a:Lcom/jieli/jl_rcsp/task/GetFileTask;

    invoke-static {v1}, Lcom/jieli/jl_rcsp/task/GetFileTask;->c(Lcom/jieli/jl_rcsp/task/GetFileTask;)Landroid/os/Handler;

    move-result-object v1

    if-eqz v1, :cond_6

    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/GetFileTask$4;->a:Lcom/jieli/jl_rcsp/task/GetFileTask;

    invoke-static {v1}, Lcom/jieli/jl_rcsp/task/GetFileTask;->c(Lcom/jieli/jl_rcsp/task/GetFileTask;)Landroid/os/Handler;

    move-result-object v1

    const/16 v2, 0x2202

    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    move-result v1

    if-nez v1, :cond_6

    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/GetFileTask$4;->a:Lcom/jieli/jl_rcsp/task/GetFileTask;

    iget-object v1, v1, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    const-string v2, "MSG_READ_FINISH"

    const-string v3, "lost message."

    invoke-static {v1, v2, v3}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_6
    :goto_1
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getOpCodeSn()I

    move-result p2

    invoke-virtual {v0, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    const/4 p2, 0x0

    invoke-virtual {v0, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    new-instance p2, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$Param;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getParam()Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    move-result-object v1

    check-cast v1, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$Param;

    iget-byte v1, v1, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$Param;->op:B

    invoke-direct {p2, v1}, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$Param;-><init>(B)V

    invoke-virtual {v0, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setParam(Lcom/jieli/jl_rcsp/model/base/BaseParameter;)V

    iget-object p2, p0, Lcom/jieli/jl_rcsp/task/GetFileTask$4;->a:Lcom/jieli/jl_rcsp/task/GetFileTask;

    iget-object p2, p2, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    const/4 v1, 0x0

    invoke-virtual {p2, p1, v0, v1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public onRcspDataCmd(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V
    .locals 2

    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/GetFileTask$4;->a:Lcom/jieli/jl_rcsp/task/GetFileTask;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/task/TaskBase;->isRun()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getId()I

    move-result p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p2, Lcom/jieli/jl_rcsp/model/command/data/DataCmd;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getParam()Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    move-result-object p1

    check-cast p1, Lcom/jieli/jl_rcsp/model/parameter/DataParam;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;->getXmOpCode()I

    move-result p1

    const/16 v0, 0x24

    if-eq p1, v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getParam()Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    move-result-object p1

    check-cast p1, Lcom/jieli/jl_rcsp/model/parameter/DataParam;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/parameter/DataParam;->getData()[B

    move-result-object p1

    iget-object p2, p0, Lcom/jieli/jl_rcsp/task/GetFileTask$4;->a:Lcom/jieli/jl_rcsp/task/GetFileTask;

    invoke-static {p2}, Lcom/jieli/jl_rcsp/task/GetFileTask;->c(Lcom/jieli/jl_rcsp/task/GetFileTask;)Landroid/os/Handler;

    move-result-object p2

    if-eqz p2, :cond_3

    iget-object p2, p0, Lcom/jieli/jl_rcsp/task/GetFileTask$4;->a:Lcom/jieli/jl_rcsp/task/GetFileTask;

    invoke-static {p2}, Lcom/jieli/jl_rcsp/task/GetFileTask;->c(Lcom/jieli/jl_rcsp/task/GetFileTask;)Landroid/os/Handler;

    move-result-object p2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/GetFileTask$4;->a:Lcom/jieli/jl_rcsp/task/GetFileTask;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/task/GetFileTask;->c(Lcom/jieli/jl_rcsp/task/GetFileTask;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x2201

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/GetFileTask$4;->a:Lcom/jieli/jl_rcsp/task/GetFileTask;

    iget-object p1, p1, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    const-string p2, "MSG_RECEIVE_DATA"

    const-string v0, "lost message."

    invoke-static {p1, p2, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    :goto_0
    return-void
.end method
