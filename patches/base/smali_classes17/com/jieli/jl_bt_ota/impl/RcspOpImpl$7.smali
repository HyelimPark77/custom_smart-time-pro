.class Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_bt_ota/interfaces/rcsp/IHandleResult;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->a(Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/jieli/jl_bt_ota/interfaces/rcsp/IHandleResult<",
        "Ljava/lang/String;",
        "Lcom/jieli/jl_bt_ota/model/command/GetDevMD5Cmd;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$7;->a:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic handleResult(Lcom/jieli/jl_bt_ota/model/base/CommandBase;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/jieli/jl_bt_ota/model/command/GetDevMD5Cmd;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$7;->handleResult(Lcom/jieli/jl_bt_ota/model/command/GetDevMD5Cmd;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public handleResult(Lcom/jieli/jl_bt_ota/model/command/GetDevMD5Cmd;)Ljava/lang/String;
    .locals 2

    if-eqz p1, :cond_1

    .line 2
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->getResponse()Lcom/jieli/jl_bt_ota/model/base/CommonResponse;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->getResponse()Lcom/jieli/jl_bt_ota/model/base/CommonResponse;

    move-result-object p1

    check-cast p1, Lcom/jieli/jl_bt_ota/model/response/GetDevMD5Response;

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/response/GetDevMD5Response;->getMd5()Ljava/lang/String;

    move-result-object p1

    .line 4
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$7;->a:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->b(Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;)Lcom/jieli/jl_bt_ota/tool/DeviceStatusCache;

    move-result-object v0

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$7;->a:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;

    invoke-virtual {v1}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->getTargetDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/jieli/jl_bt_ota/tool/DeviceStatusCache;->updateDeviceMD5(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;)V

    return-object p1

    .line 5
    :cond_1
    :goto_0
    const-string p1, ""

    return-object p1
.end method

.method public bridge synthetic hasResult(Lcom/jieli/jl_bt_ota/model/base/CommandBase;)I
    .locals 0

    .line 2
    check-cast p1, Lcom/jieli/jl_bt_ota/model/command/GetDevMD5Cmd;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$7;->hasResult(Lcom/jieli/jl_bt_ota/model/command/GetDevMD5Cmd;)I

    move-result p1

    return p1
.end method

.method public hasResult(Lcom/jieli/jl_bt_ota/model/command/GetDevMD5Cmd;)I
    .locals 0

    .line 1
    const/4 p1, 0x0

    return p1
.end method
