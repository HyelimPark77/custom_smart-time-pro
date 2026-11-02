.class Lcom/jieli/jl_rcsp/task/TransferTask$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/IHandleResult;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/task/TransferTask;->i()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/jieli/jl_rcsp/interfaces/IHandleResult<",
        "Ljava/lang/Boolean;",
        "Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_rcsp/task/TransferTask;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/task/TransferTask;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/task/TransferTask$5;->a:Lcom/jieli/jl_rcsp/task/TransferTask;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd;)Ljava/lang/Boolean;
    .locals 0

    if-eqz p2, :cond_1

    .line 2
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getResponse()Lcom/jieli/jl_rcsp/model/base/CommonResponse;

    move-result-object p1

    instance-of p1, p1, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd$FileTransferResponse;

    if-nez p1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getResponse()Lcom/jieli/jl_rcsp/model/base/CommonResponse;

    move-result-object p1

    check-cast p1, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd$FileTransferResponse;

    iget-boolean p1, p1, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd$FileTransferResponse;->hasCrc16:Z

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 4
    :cond_1
    :goto_0
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public bridge synthetic handleResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p2, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd;

    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/task/TransferTask$5;->handleResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic hasResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)I
    .locals 0

    .line 2
    check-cast p2, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd;

    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/task/TransferTask$5;->hasResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd;)I

    move-result p1

    return p1
.end method

.method public hasResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd;)I
    .locals 0

    .line 1
    const/4 p1, 0x0

    return p1
.end method
