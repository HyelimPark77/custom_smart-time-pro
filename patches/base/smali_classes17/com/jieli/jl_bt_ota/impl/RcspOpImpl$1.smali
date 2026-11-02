.class Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_bt_ota/impl/RcspAuth$OnRcspAuthListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;-><init>(Landroid/content/Context;Lcom/jieli/jl_bt_ota/interfaces/bt/IBtProxy;Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$1;->a:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAuthFailed(Landroid/bluetooth/BluetoothDevice;ILjava/lang/String;)V
    .locals 3

    const v0, 0xa011

    if-ne p2, v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$1;->onAuthSuccess(Landroid/bluetooth/BluetoothDevice;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$1;->a:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->b(Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;)Lcom/jieli/jl_bt_ota/tool/DeviceStatusCache;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/jieli/jl_bt_ota/tool/DeviceStatusCache;->updateDeviceIsAuth(Landroid/bluetooth/BluetoothDevice;Z)V

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$1;->a:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->c(Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;)Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$CallbackManager;

    move-result-object v0

    const/16 v2, 0x5001

    invoke-static {v2, p2, p3}, Lcom/jieli/jl_bt_ota/model/OTAError;->buildError(IILjava/lang/String;)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$CallbackManager;->onRcspError(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$1;->a:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;

    invoke-static {p2}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->c(Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;)Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$CallbackManager;

    move-result-object p2

    invoke-virtual {p2, p1, v1}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$CallbackManager;->onRcspInit(Landroid/bluetooth/BluetoothDevice;Z)V

    return-void
.end method

.method public onAuthSuccess(Landroid/bluetooth/BluetoothDevice;)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$1;->a:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->b(Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;)Lcom/jieli/jl_bt_ota/tool/DeviceStatusCache;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lcom/jieli/jl_bt_ota/tool/DeviceStatusCache;->updateDeviceIsAuth(Landroid/bluetooth/BluetoothDevice;Z)V

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$1;->a:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;

    invoke-static {v0, p1}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->a(Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public onInitResult(Z)V
    .locals 3

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$1;->a:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->a(Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "onInitResult"

    invoke-static {v0, v1, p1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
