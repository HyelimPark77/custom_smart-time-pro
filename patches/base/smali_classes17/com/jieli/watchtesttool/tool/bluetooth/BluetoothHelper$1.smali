.class Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper$1;
.super Lcom/jieli/bluetooth_connect/interfaces/callback/BluetoothEventCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;


# direct methods
.method public constructor <init>(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper$1;->this$0:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    invoke-direct {p0}, Lcom/jieli/bluetooth_connect/interfaces/callback/BluetoothEventCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdapterStatus(ZZ)V
    .locals 0

    iget-object p2, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper$1;->this$0:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    invoke-static {p2}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->access$000(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;)Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;->onAdapterStatus(Z)V

    return-void
.end method

.method public onBleDataBlockChanged(Landroid/bluetooth/BluetoothDevice;II)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper$1;->this$0:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    invoke-static {v0}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->access$000(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;)Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;

    move-result-object v0

    iget-object v1, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper$1;->this$0:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    invoke-virtual {v1, p1}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->getConnectedBluetoothGatt(Landroid/bluetooth/BluetoothDevice;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v1

    invoke-virtual {v0, v1, p2, p3}, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;->onBleMtuChange(Landroid/bluetooth/BluetoothGatt;II)V

    if-nez p3, :cond_0

    iget-object p2, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper$1;->this$0:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    invoke-static {p2}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->access$400(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;)Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper$ChangeBleMtuTimeoutTask;

    move-result-object p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper$1;->this$0:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    invoke-static {p2}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->access$400(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;)Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper$ChangeBleMtuTimeoutTask;

    move-result-object p2

    invoke-virtual {p2}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper$ChangeBleMtuTimeoutTask;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->deviceEquals(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper$1;->this$0:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    invoke-static {p2}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->access$500(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;)V

    iget-object p2, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper$1;->this$0:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    invoke-static {p2, p1}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->access$600(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;Landroid/bluetooth/BluetoothDevice;)V

    :cond_0
    return-void
.end method

.method public onBleDataNotification(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;[B)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper$1;->this$0:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    invoke-static {v0}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->access$700(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;)Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

    move-result-object v0

    invoke-interface {v0}, Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;->getBluetoothOption()Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->getBleServiceUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper$1;->this$0:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    invoke-static {p2}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->access$700(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;)Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

    move-result-object p2

    invoke-interface {p2}, Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;->getBluetoothOption()Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    move-result-object p2

    invoke-virtual {p2}, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->getBleNotificationUUID()Ljava/util/UUID;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper$1;->this$0:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    invoke-static {p2, p1, p4}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->access$800(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;Landroid/bluetooth/BluetoothDevice;[B)V

    :cond_0
    return-void
.end method

.method public onConnection(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 3

    invoke-static {}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->access$100()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onConnection >>> status = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x2

    if-ne p2, v0, :cond_0

    iget-object p2, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper$1;->this$0:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    invoke-static {p2, p1}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->access$200(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;Landroid/bluetooth/BluetoothDevice;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper$1;->this$0:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    invoke-static {v0, p1, p2}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->access$300(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public onDiscovery(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper$1;->this$0:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    invoke-static {v0}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->access$000(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;)Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;->onBtDiscovery(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;)V

    return-void
.end method

.method public onDiscoveryStatus(ZZ)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper$1;->this$0:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    invoke-static {v0}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->access$000(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;)Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;->onBtDiscoveryStatus(ZZ)V

    return-void
.end method

.method public onError(Lcom/jieli/bluetooth_connect/bean/ErrorInfo;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper$1;->this$0:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    invoke-static {v0}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->access$000(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;)Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;->onError(Lcom/jieli/bluetooth_connect/bean/ErrorInfo;)V

    return-void
.end method

.method public onShowDialog(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper$1;->this$0:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    invoke-static {v0}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->access$000(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;)Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;->onShowDialog(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;)V

    return-void
.end method

.method public onSppDataNotification(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;[B)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper$1;->this$0:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    invoke-static {v0}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->access$700(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;)Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

    move-result-object v0

    invoke-interface {v0}, Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;->getBluetoothOption()Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->getSppUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper$1;->this$0:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    invoke-static {p2, p1, p3}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->access$800(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;Landroid/bluetooth/BluetoothDevice;[B)V

    :cond_0
    return-void
.end method

.method public onSwitchConnectedDevice(Landroid/bluetooth/BluetoothDevice;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper$1;->this$0:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    invoke-static {v0}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->access$000(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;)Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;->onSwitchConnectedDevice(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method
