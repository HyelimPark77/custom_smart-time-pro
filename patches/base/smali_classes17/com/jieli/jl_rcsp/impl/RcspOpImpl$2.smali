.class Lcom/jieli/jl_rcsp/impl/RcspOpImpl$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->syncDeviceInfo(Landroid/bluetooth/BluetoothDevice;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback<",
        "Lcom/jieli/jl_rcsp/model/command/status/GetTargetInfoCmd;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl$2;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/jieli/jl_rcsp/model/command/status/GetTargetInfoCmd;

    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl$2;->onCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/status/GetTargetInfoCmd;)V

    return-void
.end method

.method public onCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/status/GetTargetInfoCmd;)V
    .locals 4

    .line 2
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getStatus()I

    move-result v0

    if-nez v0, :cond_2

    .line 3
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getResponse()Lcom/jieli/jl_rcsp/model/base/CommonResponse;

    move-result-object v0

    check-cast v0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "success >>> device : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ",\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "jl_rcsp"

    const-string v3, "syncDeviceInfo"

    invoke-static {v2, v3, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v0, :cond_1

    .line 5
    iget-object p2, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl$2;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    iget-object p2, p2, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mStatusManager:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    invoke-virtual {p2, p1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object p2

    if-nez p2, :cond_0

    .line 6
    iget-object p2, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl$2;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    iget-object p2, p2, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mStatusManager:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    invoke-virtual {p2, p1, v0}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->updateDeviceTargetInfo(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;)V

    .line 7
    :cond_0
    iget-object p2, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl$2;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-static {p2, p1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->access$000(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Landroid/bluetooth/BluetoothDevice;)V

    return-void

    .line 8
    :cond_1
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl$2;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    new-instance v1, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/16 v2, 0x3001

    invoke-direct {v1, v2}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(I)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getId()I

    move-result p2

    invoke-virtual {v1, p2}, Lcom/jieli/jl_rcsp/model/base/BaseError;->setOpCode(I)Lcom/jieli/jl_rcsp/model/base/BaseError;

    move-result-object p2

    invoke-static {v0, p1, p2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->access$100(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    goto :goto_0

    .line 9
    :cond_2
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl$2;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getId()I

    move-result v1

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getStatus()I

    move-result p2

    const/16 v2, 0x3004

    const/4 v3, 0x0

    invoke-static {v1, v2, p2, v3}, Lcom/jieli/jl_rcsp/constant/RcspErrorCode;->buildJsonError(IIILjava/lang/String;)Lcom/jieli/jl_rcsp/model/base/BaseError;

    move-result-object p2

    invoke-static {v0, p1, p2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->access$100(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    .line 10
    :goto_0
    iget-object p2, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl$2;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    iget-object p2, p2, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mRcspCallbackManager:Lcom/jieli/jl_rcsp/tool/callback/RcspCallbackManager;

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Lcom/jieli/jl_rcsp/tool/callback/RcspCallbackManager;->onRcspInit(Landroid/bluetooth/BluetoothDevice;Z)V

    return-void
.end method

.method public onErrCode(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onErrCode >>> device : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "jl_rcsp"

    const-string v2, "syncDeviceInfo"

    invoke-static {v1, v2, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl$2;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-static {v0, p1, p2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->access$100(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    iget-object p2, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl$2;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    iget-object p2, p2, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mRcspCallbackManager:Lcom/jieli/jl_rcsp/tool/callback/RcspCallbackManager;

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Lcom/jieli/jl_rcsp/tool/callback/RcspCallbackManager;->onRcspInit(Landroid/bluetooth/BluetoothDevice;Z)V

    return-void
.end method
