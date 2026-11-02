.class Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery$BluetoothDiscoveryReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "BluetoothDiscoveryReceiver"
.end annotation


# instance fields
.field final synthetic a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;


# direct methods
.method private constructor <init>(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery$BluetoothDiscoveryReceiver;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery$BluetoothDiscoveryReceiver;-><init>(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    const/4 p1, 0x2

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v3, "---->"

    const/4 v4, -0x1

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v5

    sparse-switch v5, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v5, "android.bluetooth.device.action.FOUND"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    move v4, p1

    goto :goto_0

    :sswitch_1
    const-string v5, "android.bluetooth.adapter.action.DISCOVERY_STARTED"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    move v4, v0

    goto :goto_0

    :sswitch_2
    const-string v5, "android.bluetooth.adapter.action.DISCOVERY_FINISHED"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_3
    move v4, v1

    :goto_0
    packed-switch v4, :pswitch_data_0

    goto/16 :goto_3

    :pswitch_0
    const-string v2, "android.bluetooth.device.extra.DEVICE"

    invoke-virtual {p2, v2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Landroid/bluetooth/BluetoothDevice;

    if-eqz v2, :cond_8

    iget-object v3, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery$BluetoothDiscoveryReceiver;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;

    const-string v4, "ACTION_FOUND"

    invoke-static {v3, v4, v0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->a(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_4

    goto/16 :goto_3

    :cond_4
    iget-object v3, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery$BluetoothDiscoveryReceiver;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;

    invoke-static {v3}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->b(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;)I

    move-result v3

    if-ne v3, v0, :cond_5

    invoke-virtual {v2}, Landroid/bluetooth/BluetoothDevice;->getType()I

    move-result v3

    if-eq v3, p1, :cond_5

    goto :goto_1

    :cond_5
    iget-object v3, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery$BluetoothDiscoveryReceiver;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;

    invoke-static {v3}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->b(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;)I

    move-result v3

    if-nez v3, :cond_6

    invoke-virtual {v2}, Landroid/bluetooth/BluetoothDevice;->getType()I

    move-result v3

    if-eq v3, v0, :cond_6

    goto :goto_1

    :cond_6
    iget-object v3, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery$BluetoothDiscoveryReceiver;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;

    invoke-static {v3}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->b(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;)I

    move-result v3

    if-ne v3, p1, :cond_7

    :goto_1
    move p1, v0

    goto :goto_2

    :cond_7
    move p1, v1

    :goto_2
    const-string v3, "android.bluetooth.device.extra.RSSI"

    invoke-virtual {p2, v3, v1}, Landroid/content/Intent;->getShortExtra(Ljava/lang/String;S)S

    move-result p2

    if-eqz p1, :cond_8

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery$BluetoothDiscoveryReceiver;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;

    invoke-static {p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->c(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery$BluetoothDiscoveryReceiver;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;

    iget-object p1, p1, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "device : "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery$BluetoothDiscoveryReceiver;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;

    invoke-virtual {v3, v2}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", RSSI : "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v4, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery$BluetoothDiscoveryReceiver;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;

    invoke-static {p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->c(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p1, Lcom/jieli/jl_bt_ota/model/BleScanMessage;

    invoke-direct {p1}, Lcom/jieli/jl_bt_ota/model/BleScanMessage;-><init>()V

    invoke-virtual {p1, p2}, Lcom/jieli/jl_bt_ota/model/BleScanMessage;->setRssi(I)Lcom/jieli/jl_bt_ota/model/BleScanMessage;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/jieli/jl_bt_ota/model/BleScanMessage;->setEnableConnect(Z)Lcom/jieli/jl_bt_ota/model/BleScanMessage;

    move-result-object p1

    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery$BluetoothDiscoveryReceiver;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;

    iget-object p2, p2, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mCallbackManager:Lcom/jieli/jl_bt_ota/tool/callback/BtAssistantCallbackManager;

    invoke-virtual {p2, v2, p1}, Lcom/jieli/jl_bt_ota/tool/callback/BtAssistantCallbackManager;->onDiscovery(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/BleScanMessage;)V

    return-void

    :pswitch_1
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery$BluetoothDiscoveryReceiver;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;

    iget-object p1, p1, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    const-string p2, "ACTION_DISCOVERY_STARTED"

    invoke-static {p1, p2, v3}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery$BluetoothDiscoveryReceiver;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->isDeviceScanning()Z

    move-result p1

    if-nez p1, :cond_8

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery$BluetoothDiscoveryReceiver;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;

    invoke-static {p1, v0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->a(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;Z)V

    :cond_8
    :goto_3
    return-void

    :pswitch_2
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery$BluetoothDiscoveryReceiver;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;

    iget-object p1, p1, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    const-string p2, "ACTION_DISCOVERY_FINISHED"

    invoke-static {p1, p2, v3}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery$BluetoothDiscoveryReceiver;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;

    invoke-static {p1, v1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->a(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;Z)V

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
