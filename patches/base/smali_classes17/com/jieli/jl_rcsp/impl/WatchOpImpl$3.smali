.class Lcom/jieli/jl_rcsp/impl/WatchOpImpl$3;
.super Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/impl/WatchOpImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_rcsp/impl/WatchOpImpl;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/WatchOpImpl;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$3;->a:Lcom/jieli/jl_rcsp/impl/WatchOpImpl;

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onConnectStateChange(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 4

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$3;->a:Lcom/jieli/jl_rcsp/impl/WatchOpImpl;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getTargetDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-static {}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->a()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "device = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/RcspUtil;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", connectedDevice = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/RcspUtil;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", status = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "onConnectStateChange"

    invoke-static {v1, v3, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p1, v0}, Lcom/jieli/jl_rcsp/util/RcspUtil;->deviceEquals(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x2

    if-eq p2, v0, :cond_0

    if-nez p2, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$3;->a:Lcom/jieli/jl_rcsp/impl/WatchOpImpl;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->b(Lcom/jieli/jl_rcsp/impl/WatchOpImpl;)V

    :cond_1
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$3;->a:Lcom/jieli/jl_rcsp/impl/WatchOpImpl;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->a(Lcom/jieli/jl_rcsp/impl/WatchOpImpl;)Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->onConnectStateChange(Landroid/bluetooth/BluetoothDevice;I)V

    invoke-super {p0, p1, p2}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;->onConnectStateChange(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public onMandatoryUpgrade(Landroid/bluetooth/BluetoothDevice;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$3;->a:Lcom/jieli/jl_rcsp/impl/WatchOpImpl;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->a(Lcom/jieli/jl_rcsp/impl/WatchOpImpl;)Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->onMandatoryUpgrade(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public onRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$3;->a:Lcom/jieli/jl_rcsp/impl/WatchOpImpl;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->a(Lcom/jieli/jl_rcsp/impl/WatchOpImpl;)Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->onRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getId()I

    move-result v0

    const/16 v1, 0x1a

    if-ne v0, v1, :cond_0

    instance-of v0, p2, Lcom/jieli/jl_rcsp/model/command/external_flash/ExtFlashIOCtrlNoResponseCmd;

    if-eqz v0, :cond_0

    check-cast p2, Lcom/jieli/jl_rcsp/model/command/external_flash/ExtFlashIOCtrlNoResponseCmd;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getParam()Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    move-result-object p2

    check-cast p2, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->getOp()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->getWatchOp()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$3;->a:Lcom/jieli/jl_rcsp/impl/WatchOpImpl;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->a(Lcom/jieli/jl_rcsp/impl/WatchOpImpl;)Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;

    move-result-object v0

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->getFilePath()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->onCurrentWatchInfo(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onRcspDataCmd(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$3;->a:Lcom/jieli/jl_rcsp/impl/WatchOpImpl;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->a(Lcom/jieli/jl_rcsp/impl/WatchOpImpl;)Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->onRcspDataCmd(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V

    return-void
.end method

.method public onRcspError(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$3;->a:Lcom/jieli/jl_rcsp/impl/WatchOpImpl;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->a(Lcom/jieli/jl_rcsp/impl/WatchOpImpl;)Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->onRcspError(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void
.end method

.method public onRcspInit(Landroid/bluetooth/BluetoothDevice;Z)V
    .locals 3

    invoke-static {}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->a()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "device = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/RcspUtil;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", isInit = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "onRcspInit"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$3;->a:Lcom/jieli/jl_rcsp/impl/WatchOpImpl;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->a(Lcom/jieli/jl_rcsp/impl/WatchOpImpl;)Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->onRcspInit(Landroid/bluetooth/BluetoothDevice;Z)V

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$3;->a:Lcom/jieli/jl_rcsp/impl/WatchOpImpl;

    invoke-static {p2}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->b(Lcom/jieli/jl_rcsp/impl/WatchOpImpl;)V

    iget-object p2, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$3;->a:Lcom/jieli/jl_rcsp/impl/WatchOpImpl;

    invoke-static {p2, p1}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->a(Lcom/jieli/jl_rcsp/impl/WatchOpImpl;Landroid/bluetooth/BluetoothDevice;)V

    :cond_0
    return-void
.end method
