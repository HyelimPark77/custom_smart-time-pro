.class Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$BluetoothBleReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "BluetoothBleReceiver"
.end annotation


# instance fields
.field final synthetic a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;


# direct methods
.method private constructor <init>(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$BluetoothBleReceiver;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$BluetoothBleReceiver;-><init>(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    if-nez p2, :cond_0

    goto/16 :goto_0

    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "android.bluetooth.device.action.ACL_CONNECTED"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "device : "

    const-string v2, "android.bluetooth.device.extra.DEVICE"

    if-nez v0, :cond_4

    const-string v0, "android.bluetooth.device.action.ACL_DISCONNECTED"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p2, v2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/bluetooth/BluetoothDevice;

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$BluetoothBleReceiver;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;

    iget-object p2, p2, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$BluetoothBleReceiver;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;

    invoke-virtual {v1, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ACTION_ACL_DISCONNECTED"

    invoke-static {p2, v1, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$BluetoothBleReceiver;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;

    invoke-static {p2, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->a(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;Landroid/bluetooth/BluetoothDevice;)Z

    move-result p2

    if-eqz p2, :cond_5

    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$BluetoothBleReceiver;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;

    iget-object p2, p2, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object v0

    const-string v2, "Ready to disconnect device[%s]."

    invoke-static {v2, v0}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v1, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$BluetoothBleReceiver;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;

    invoke-virtual {p2, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->disconnectBLEDevice(Landroid/bluetooth/BluetoothDevice;)Z

    return-void

    :cond_4
    invoke-virtual {p2, v2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/bluetooth/BluetoothDevice;

    if-nez p1, :cond_6

    :cond_5
    :goto_0
    return-void

    :cond_6
    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$BluetoothBleReceiver;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;

    iget-object p2, p2, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$BluetoothBleReceiver;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;

    invoke-virtual {v1, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "ACTION_ACL_CONNECTED"

    invoke-static {p2, v0, p1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
