.class Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$BluetoothSppReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "BluetoothSppReceiver"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;


# direct methods
.method private constructor <init>(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;)V
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
    iput-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$BluetoothSppReceiver;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$BluetoothSppReceiver;-><init>(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 6
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

    goto/16 :goto_1

    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_4

    const-string v1, "android.bluetooth.device.action.UUID"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "android.bluetooth.device.extra.DEVICE"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/bluetooth/BluetoothDevice;

    if-eqz v0, :cond_4

    invoke-static {p1}, Lcom/jieli/bluetooth_connect/util/ConnectUtil;->isHasConnectPermission(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    const-string p1, "android.bluetooth.device.extra.UUID"

    invoke-virtual {p2, p1}, Landroid/content/Intent;->getParcelableArrayExtra(Ljava/lang/String;)[Landroid/os/Parcelable;

    move-result-object p1

    const-string p2, "ACTION_UUID"

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$BluetoothSppReceiver;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->access$1800(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;Landroid/bluetooth/BluetoothDevice;[Landroid/os/ParcelUuid;)V

    invoke-static {}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->access$100()Ljava/lang/String;

    move-result-object p1

    const-string v0, "no uuids"

    invoke-static {p1, p2, v0}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2
    array-length v1, p1

    new-array v1, v1, [Landroid/os/ParcelUuid;

    const/4 v2, 0x0

    :goto_0
    array-length v3, p1

    if-ge v2, v3, :cond_3

    aget-object v3, p1, v2

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/os/ParcelUuid;->fromString(Ljava/lang/String;)Landroid/os/ParcelUuid;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->access$100()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "uuid : "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v5, v1, v2

    invoke-virtual {v5}, Landroid/os/ParcelUuid;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, p2, v4}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$BluetoothSppReceiver;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;

    invoke-static {p1, v0, v1}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->access$1800(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;Landroid/bluetooth/BluetoothDevice;[Landroid/os/ParcelUuid;)V

    :cond_4
    :goto_1
    return-void
.end method
