.class Lcom/jieli/bluetooth_connect/impl/BluetoothManager$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/bluetooth_connect/interfaces/listener/OnBrEdrListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/bluetooth_connect/impl/BluetoothManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothManager;


# direct methods
.method public constructor <init>(Lcom/jieli/bluetooth_connect/impl/BluetoothManager;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            "this$0"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager$4;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onA2dpStatus(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "device",
            "status"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager$4;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothManager;

    invoke-static {v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->access$000(Lcom/jieli/bluetooth_connect/impl/BluetoothManager;)Lcom/jieli/bluetooth_connect/tool/BluetoothEventCbManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/jieli/bluetooth_connect/tool/BluetoothEventCbManager;->onA2dpStatus(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public onBrEdrConnection(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 5
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "device",
            "status"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager$4;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothManager;

    invoke-static {v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->access$000(Lcom/jieli/bluetooth_connect/impl/BluetoothManager;)Lcom/jieli/bluetooth_connect/tool/BluetoothEventCbManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/jieli/bluetooth_connect/tool/BluetoothEventCbManager;->onBtDeviceConnectStatus(Landroid/bluetooth/BluetoothDevice;I)V

    const/4 v0, 0x2

    if-ne p2, v0, :cond_3

    iget-object p2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager$4;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothManager;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->getHistoryRecord(Ljava/lang/String;)Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;

    move-result-object p2

    if-nez p2, :cond_0

    goto/16 :goto_0

    :cond_0
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager$4;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothManager;

    invoke-static {v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->access$500(Lcom/jieli/bluetooth_connect/impl/BluetoothManager;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p2}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->getRemoteDevice(Landroid/content/Context;Ljava/lang/String;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager$4;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothManager;

    invoke-virtual {v1, v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->isConnectedDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v1

    xor-int/lit8 v2, v1, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager$4;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothManager;

    invoke-static {v1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->access$400(Lcom/jieli/bluetooth_connect/impl/BluetoothManager;)Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    move-result-object v1

    invoke-virtual {v1}, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->isUseMultiDevice()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager$4;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothManager;

    invoke-virtual {v1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager$4;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothManager;

    invoke-virtual {v1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v4

    invoke-virtual {v1, v4, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->isMatchDevice(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    if-nez p1, :cond_1

    move v2, v3

    :cond_1
    if-eqz v2, :cond_2

    iget-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager$4;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothManager;

    invoke-static {p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->access$400(Lcom/jieli/bluetooth_connect/impl/BluetoothManager;)Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    move-result-object p1

    invoke-virtual {p1}, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->isReconnect()Z

    move-result p1

    if-nez p1, :cond_2

    move v2, v3

    :cond_2
    if-eqz v2, :cond_4

    iget-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager$4;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothManager;

    invoke-static {p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->access$700(Lcom/jieli/bluetooth_connect/impl/BluetoothManager;)Landroid/os/Handler;

    move-result-object p1

    const/16 v1, 0x1012

    invoke-virtual {p1, v1}, Landroid/os/Handler;->removeMessages(I)V

    iget-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager$4;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothManager;

    invoke-static {p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->access$700(Lcom/jieli/bluetooth_connect/impl/BluetoothManager;)Landroid/os/Handler;

    move-result-object p1

    iget-object v2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager$4;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothManager;

    invoke-static {v2}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->access$700(Lcom/jieli/bluetooth_connect/impl/BluetoothManager;)Landroid/os/Handler;

    move-result-object v2

    invoke-virtual {p2}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getConnectType()I

    move-result p2

    invoke-virtual {v2, v1, p2, v3, v0}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object p2

    const-wide/16 v0, 0x320

    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void

    :cond_3
    if-nez p2, :cond_4

    iget-object p2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager$4;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothManager;

    const/4 v0, 0x1

    invoke-static {p2, p1, v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->access$300(Lcom/jieli/bluetooth_connect/impl/BluetoothManager;Landroid/bluetooth/BluetoothDevice;I)Z

    :cond_4
    :goto_0
    return-void
.end method

.method public onDeviceUuids(Landroid/bluetooth/BluetoothDevice;[Landroid/os/ParcelUuid;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "device",
            "uuids"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager$4;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothManager;

    invoke-static {v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->access$000(Lcom/jieli/bluetooth_connect/impl/BluetoothManager;)Lcom/jieli/bluetooth_connect/tool/BluetoothEventCbManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/jieli/bluetooth_connect/tool/BluetoothEventCbManager;->onDeviceUuidsDiscovery(Landroid/bluetooth/BluetoothDevice;[Landroid/os/ParcelUuid;)V

    return-void
.end method

.method public onEdrService(ZILandroid/bluetooth/BluetoothProfile;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "isConnected",
            "profile",
            "proxy"
        }
    .end annotation

    return-void
.end method

.method public onHfpStatus(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "device",
            "status"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager$4;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothManager;

    invoke-static {v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->access$000(Lcom/jieli/bluetooth_connect/impl/BluetoothManager;)Lcom/jieli/bluetooth_connect/tool/BluetoothEventCbManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/jieli/bluetooth_connect/tool/BluetoothEventCbManager;->onHfpStatus(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method
