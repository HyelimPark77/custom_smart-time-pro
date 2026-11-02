.class Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_bt_ota/interfaces/rcsp/IHandleResult;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->syncDeviceInfo(Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/jieli/jl_bt_ota/interfaces/rcsp/IHandleResult<",
        "Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;",
        "Lcom/jieli/jl_bt_ota/model/command/GetTargetInfoCmd;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$4;->a:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleResult(Lcom/jieli/jl_bt_ota/model/command/GetTargetInfoCmd;)Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 2
    :cond_0
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->getResponse()Lcom/jieli/jl_bt_ota/model/base/CommonResponse;

    move-result-object p1

    check-cast p1, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;

    .line 3
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$4;->a:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->b(Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;)Lcom/jieli/jl_bt_ota/tool/DeviceStatusCache;

    move-result-object v0

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$4;->a:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;

    invoke-virtual {v1}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->getTargetDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/jieli/jl_bt_ota/tool/DeviceStatusCache;->updateDeviceTargetInfo(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;)V

    return-object p1
.end method

.method public bridge synthetic handleResult(Lcom/jieli/jl_bt_ota/model/base/CommandBase;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/jieli/jl_bt_ota/model/command/GetTargetInfoCmd;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$4;->handleResult(Lcom/jieli/jl_bt_ota/model/command/GetTargetInfoCmd;)Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic hasResult(Lcom/jieli/jl_bt_ota/model/base/CommandBase;)I
    .locals 0

    .line 2
    check-cast p1, Lcom/jieli/jl_bt_ota/model/command/GetTargetInfoCmd;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$4;->hasResult(Lcom/jieli/jl_bt_ota/model/command/GetTargetInfoCmd;)I

    move-result p1

    return p1
.end method

.method public hasResult(Lcom/jieli/jl_bt_ota/model/command/GetTargetInfoCmd;)I
    .locals 0

    .line 1
    const/4 p1, 0x0

    return p1
.end method
