.class Lcom/jieli/bluetooth_connect/impl/BluetoothBle$BluetoothBleReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/bluetooth_connect/impl/BluetoothBle;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "BluetoothBleReceiver"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;


# direct methods
.method private constructor <init>(Lcom/jieli/bluetooth_connect/impl/BluetoothBle;)V
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
    iput-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBle$BluetoothBleReceiver;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/jieli/bluetooth_connect/impl/BluetoothBle;Lcom/jieli/bluetooth_connect/impl/BluetoothBle$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle$BluetoothBleReceiver;-><init>(Lcom/jieli/bluetooth_connect/impl/BluetoothBle;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3
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

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "device : "

    const-string v1, "android.bluetooth.device.extra.DEVICE"

    const-string v2, "android.bluetooth.device.action.ACL_CONNECTED"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    const-string v2, "android.bluetooth.device.action.ACL_DISCONNECTED"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    :goto_0
    return-void

    :cond_2
    invoke-virtual {p2, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/bluetooth/BluetoothDevice;

    invoke-static {}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$600()Ljava/lang/String;

    move-result-object p2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBle$BluetoothBleReceiver;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-static {v0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$1600(Lcom/jieli/bluetooth_connect/impl/BluetoothBle;Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "ACTION_ACL_DISCONNECTED"

    invoke-static {p2, v0, p1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_3
    invoke-virtual {p2, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/bluetooth/BluetoothDevice;

    invoke-static {}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$600()Ljava/lang/String;

    move-result-object p2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBle$BluetoothBleReceiver;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-static {v0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$1600(Lcom/jieli/bluetooth_connect/impl/BluetoothBle;Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "ACTION_ACL_CONNECTED"

    invoke-static {p2, v0, p1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
