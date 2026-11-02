.class Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager$2;
.super Lcom/jieli/jl_bt_ota/interfaces/BtEventCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager$2;->a:Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;

    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/interfaces/BtEventCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdapterStatus(ZZ)V
    .locals 2

    iget-object p2, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager$2;->a:Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;

    invoke-virtual {p2}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->isDeviceReconnecting()Z

    move-result p2

    if-nez p2, :cond_0

    return-void

    :cond_0
    const-string p2, "onAdapterStatus"

    if-nez p1, :cond_1

    invoke-static {}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->a()Ljava/lang/String;

    move-result-object p1

    const-string v0, "bluetooth is off."

    invoke-static {p1, p2, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-static {}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->a()Ljava/lang/String;

    move-result-object p1

    const-string v0, "Bluetooth is on, so resume reconnect task."

    invoke-static {p1, p2, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager$2;->a:Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;

    const p2, 0x9455

    const-wide/16 v0, 0x0

    invoke-static {p1, p2, v0, v1}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->a(Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;IJ)V

    return-void
.end method

.method public onConnection(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 9

    if-eqz p1, :cond_a

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager$2;->a:Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->isDeviceReconnecting()Z

    move-result v0

    if-eqz v0, :cond_a

    const/4 v0, 0x3

    if-ne p2, v0, :cond_0

    goto/16 :goto_4

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager$2;->a:Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;

    const v1, 0x9457

    invoke-static {v0, v1}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->a(Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;I)Z

    move-result v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager$2;->a:Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->d(Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    move v0, v3

    goto :goto_1

    :cond_2
    :goto_0
    move v0, v2

    :goto_1
    invoke-static {}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->a()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "isConnecting: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v6, ", status = "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v6, "onConnection"

    invoke-static {v4, v6, v5}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-nez v0, :cond_3

    goto/16 :goto_4

    :cond_3
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager$2;->a:Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->e(Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jieli/jl_bt_ota/model/BleScanMessage;

    if-eqz v0, :cond_4

    invoke-static {}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->a()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "bleScanMessage: "

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v6, v5}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/BleScanMessage;->getRawData()[B

    move-result-object v0

    goto :goto_2

    :cond_4
    const/4 v0, 0x0

    :goto_2
    iget-object v4, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager$2;->a:Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;

    invoke-static {v4, p1, v0}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->a(Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;Landroid/bluetooth/BluetoothDevice;[B)Z

    move-result v0

    invoke-static {}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->a()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager$2;->a:Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;

    invoke-static {v5, p1}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->b(Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v5

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    filled-new-array {v5, v7, v8}, [Ljava/lang/Object;

    move-result-object v5

    const-string v7, "device : %s, status : %d, isReConnectDevice : %s"

    invoke-static {v7, v5}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v6, v5}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-nez v0, :cond_5

    goto :goto_4

    :cond_5
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager$2;->a:Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->c(Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;)Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;

    move-result-object v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager$2;->a:Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->c(Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;)Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;->setState(I)Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;

    :cond_6
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager$2;->a:Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;

    invoke-static {v0, v1}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->b(Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;I)V

    if-eq p2, v2, :cond_9

    const/4 v0, 0x4

    if-ne p2, v0, :cond_7

    goto :goto_3

    :cond_7
    const/4 v0, 0x2

    if-eq p2, v0, :cond_8

    if-nez p2, :cond_a

    :cond_8
    invoke-static {}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->a()Ljava/lang/String;

    move-result-object p2

    const-string v0, "connect device failed."

    invoke-static {p2, v6, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager$2;->a:Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->a(Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;Ljava/lang/String;)V

    return-void

    :cond_9
    :goto_3
    invoke-static {}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->a()Ljava/lang/String;

    move-result-object p1

    const-string p2, "reconnect device success."

    invoke-static {p1, v6, p2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager$2;->a:Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->stopReconnectTask()V

    :cond_a
    :goto_4
    return-void
.end method

.method public onDiscovery(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/BleScanMessage;)V
    .locals 3

    if-eqz p1, :cond_2

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager$2;->a:Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->isDeviceReconnecting()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    if-eqz p2, :cond_1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager$2;->a:Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->e(Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2}, Lcom/jieli/jl_bt_ota/model/BleScanMessage;->getRawData()[B

    move-result-object p2

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager$2;->a:Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;

    invoke-static {v0, p1, p2}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->a(Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;Landroid/bluetooth/BluetoothDevice;[B)Z

    move-result p2

    invoke-static {}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget-object v2, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager$2;->a:Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;

    invoke-static {v2, p1}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->b(Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v1, v2}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "isReConnectDevice : %s, device : %s"

    invoke-static {v2, v1}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "onDiscovery"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p2, :cond_2

    iget-object p2, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager$2;->a:Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;

    invoke-static {p2, p1}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->a(Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;Landroid/bluetooth/BluetoothDevice;)V

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager$2;->a:Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;

    invoke-static {p1}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->b(Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public onDiscoveryStatus(ZZ)V
    .locals 2

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager$2;->a:Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->isDeviceReconnecting()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager$2;->a:Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;

    invoke-static {p1}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->d(Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->a()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "bStart : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "onDiscoveryStatus"

    invoke-static {p1, v1, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p2, :cond_1

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager$2;->a:Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;

    invoke-static {p1}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->c(Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;)Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager$2;->a:Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;

    invoke-static {p1}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->c(Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;)Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;

    move-result-object p1

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;->getState()I

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager$2;->a:Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;

    invoke-static {p1}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->c(Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;)Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;->setState(I)Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;

    return-void

    :cond_1
    invoke-static {}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->a()Ljava/lang/String;

    move-result-object p1

    const-string p2, "ready start scan"

    invoke-static {p1, v1, p2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager$2;->a:Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;

    const p2, 0x9455

    const-wide/16 v0, 0xbb8

    invoke-static {p1, p2, v0, v1}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->a(Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;IJ)V

    :cond_2
    :goto_0
    return-void
.end method
