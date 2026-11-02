.class Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery$BluetoothDiscoveryReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "BluetoothDiscoveryReceiver"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;


# direct methods
.method private constructor <init>(Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1010
        }
        names = {
            "this$0"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery$BluetoothDiscoveryReceiver;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery$BluetoothDiscoveryReceiver;-><init>(Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 7
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "context",
            "intent"
        }
    .end annotation

    const/4 v0, 0x2

    const/4 v1, -0x1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz p2, :cond_b

    if-nez p1, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_1

    goto/16 :goto_3

    :cond_1
    invoke-static {v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "isDeviceScanning : "

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v6

    sparse-switch v6, :sswitch_data_0

    :goto_0
    move v4, v1

    goto :goto_1

    :sswitch_0
    const-string v6, "android.bluetooth.device.action.FOUND"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_0

    :cond_2
    move v4, v0

    goto :goto_1

    :sswitch_1
    const-string v6, "android.bluetooth.adapter.action.DISCOVERY_STARTED"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_0

    :cond_3
    move v4, v2

    goto :goto_1

    :sswitch_2
    const-string v6, "android.bluetooth.adapter.action.DISCOVERY_FINISHED"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    goto :goto_0

    :cond_4
    move v4, v3

    :goto_1
    packed-switch v4, :pswitch_data_0

    goto/16 :goto_3

    :pswitch_0
    const-string v3, "android.bluetooth.device.extra.DEVICE"

    invoke-virtual {p2, v3}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Landroid/bluetooth/BluetoothDevice;

    const-string v4, "android.bluetooth.device.extra.RSSI"

    invoke-virtual {p2, v4, v1}, Landroid/content/Intent;->getShortExtra(Ljava/lang/String;S)S

    move-result p2

    if-eqz v3, :cond_b

    invoke-static {}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->isBluetoothEnable()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-static {p1}, Lcom/jieli/bluetooth_connect/util/ConnectUtil;->isHasConnectPermission(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_b

    iget-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery$BluetoothDiscoveryReceiver;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;

    invoke-virtual {p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->isDeviceScanning()Z

    move-result p1

    if-nez p1, :cond_5

    goto/16 :goto_3

    :cond_5
    invoke-virtual {v3}, Landroid/bluetooth/BluetoothDevice;->getType()I

    move-result p1

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery$BluetoothDiscoveryReceiver;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;

    invoke-static {v1}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->access$600(Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;)I

    move-result v1

    if-eqz v1, :cond_8

    if-eq v1, v2, :cond_6

    if-eq v1, v0, :cond_a

    goto/16 :goto_3

    :cond_6
    if-ne v2, p1, :cond_7

    goto :goto_2

    :cond_7
    return-void

    :cond_8
    if-eq v0, p1, :cond_a

    const/4 v0, 0x3

    if-ne v0, p1, :cond_9

    goto :goto_2

    :cond_9
    return-void

    :cond_a
    :goto_2
    iget-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery$BluetoothDiscoveryReceiver;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;

    invoke-static {p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->access$700(Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    iget-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery$BluetoothDiscoveryReceiver;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;

    invoke-static {p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->access$700(Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery$BluetoothDiscoveryReceiver;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;

    invoke-static {p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->access$400(Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;)Lcom/jieli/bluetooth_connect/tool/BtDiscoveryCbManager;

    move-result-object p1

    new-instance v0, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    invoke-direct {v0}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;-><init>()V

    invoke-virtual {v0, v2}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setEnableConnect(Z)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setRssi(I)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object p2

    invoke-virtual {p1, v3, p2}, Lcom/jieli/bluetooth_connect/tool/BtDiscoveryCbManager;->onDiscoveryDevice(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;)V

    return-void

    :pswitch_1
    invoke-static {}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->access$300()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery$BluetoothDiscoveryReceiver;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->isDeviceScanning()Z

    move-result v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "ACTION_DISCOVERY_STARTED"

    invoke-static {p1, v0, p2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery$BluetoothDiscoveryReceiver;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;

    invoke-static {p1, v3, v2}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->access$500(Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;ZZ)V

    return-void

    :pswitch_2
    invoke-static {}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->access$300()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery$BluetoothDiscoveryReceiver;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->isDeviceScanning()Z

    move-result v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "ACTION_DISCOVERY_FINISHED"

    invoke-static {p1, v0, p2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery$BluetoothDiscoveryReceiver;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;

    invoke-static {p1, v3, v3}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->access$500(Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;ZZ)V

    :cond_b
    :goto_3
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x6a269925 -> :sswitch_2
        0x6724d8 -> :sswitch_1
        0x459717c3 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
