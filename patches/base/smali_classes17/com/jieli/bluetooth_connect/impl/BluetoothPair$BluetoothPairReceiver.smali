.class Lcom/jieli/bluetooth_connect/impl/BluetoothPair$BluetoothPairReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/bluetooth_connect/impl/BluetoothPair;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "BluetoothPairReceiver"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothPair;


# direct methods
.method private constructor <init>(Lcom/jieli/bluetooth_connect/impl/BluetoothPair;)V
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
    iput-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair$BluetoothPairReceiver;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothPair;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/jieli/bluetooth_connect/impl/BluetoothPair;Lcom/jieli/bluetooth_connect/impl/BluetoothPair$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair$BluetoothPairReceiver;-><init>(Lcom/jieli/bluetooth_connect/impl/BluetoothPair;)V

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

    if-eqz p2, :cond_6

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_6

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v1, 0xc

    const/16 v2, 0xa

    const-string v3, "android.bluetooth.adapter.action.STATE_CHANGED"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    const-string v3, "android.bluetooth.device.action.BOND_STATE_CHANGED"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v0, "android.bluetooth.device.extra.DEVICE"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p2

    check-cast p2, Landroid/bluetooth/BluetoothDevice;

    if-eqz p2, :cond_6

    invoke-static {p1}, Lcom/jieli/bluetooth_connect/util/ConnectUtil;->isHasConnectPermission(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothDevice;->getBondState()I

    move-result v0

    invoke-static {}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->access$500()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "device : "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1, p2}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->printBtDeviceInfo(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", bound : "

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v4, "ACTION_BOND_STATE_CHANGED"

    invoke-static {v3, v4, p1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eq v0, v2, :cond_1

    if-ne v0, v1, :cond_2

    :cond_1
    iget-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair$BluetoothPairReceiver;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothPair;

    invoke-static {p1, p2}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->access$800(Lcom/jieli/bluetooth_connect/impl/BluetoothPair;Landroid/bluetooth/BluetoothDevice;)V

    iget-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair$BluetoothPairReceiver;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothPair;

    invoke-static {p1, p2}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->access$900(Lcom/jieli/bluetooth_connect/impl/BluetoothPair;Landroid/bluetooth/BluetoothDevice;)V

    :cond_2
    iget-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair$BluetoothPairReceiver;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothPair;

    invoke-static {p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->access$1000(Lcom/jieli/bluetooth_connect/impl/BluetoothPair;)Lcom/jieli/bluetooth_connect/tool/BtPairEventCbManager;

    move-result-object p1

    invoke-virtual {p1, p2, v0}, Lcom/jieli/bluetooth_connect/tool/BtPairEventCbManager;->onBtDeviceBond(Landroid/bluetooth/BluetoothDevice;I)V

    return-void

    :cond_3
    const-string p1, "android.bluetooth.adapter.extra.STATE"

    const/4 v0, -0x1

    invoke-virtual {p2, p1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    if-eq p1, v0, :cond_6

    if-ne p1, v2, :cond_4

    iget-object p2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair$BluetoothPairReceiver;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothPair;

    invoke-static {p2}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->access$1100(Lcom/jieli/bluetooth_connect/impl/BluetoothPair;)V

    iget-object p2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair$BluetoothPairReceiver;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothPair;

    invoke-static {p2}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->access$1200(Lcom/jieli/bluetooth_connect/impl/BluetoothPair;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    const/4 v2, 0x2

    invoke-static {v2}, Lcom/jieli/bluetooth_connect/bean/ErrorInfo;->buildError(I)Lcom/jieli/bluetooth_connect/bean/ErrorInfo;

    move-result-object v2

    invoke-static {p2, v0, v2}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->access$600(Lcom/jieli/bluetooth_connect/impl/BluetoothPair;Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/bean/ErrorInfo;)V

    iget-object p2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair$BluetoothPairReceiver;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothPair;

    invoke-static {p2}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->access$1200(Lcom/jieli/bluetooth_connect/impl/BluetoothPair;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-static {p2, v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->access$800(Lcom/jieli/bluetooth_connect/impl/BluetoothPair;Landroid/bluetooth/BluetoothDevice;)V

    :cond_4
    if-ne p1, v1, :cond_5

    const/4 p1, 0x1

    goto :goto_0

    :cond_5
    const/4 p1, 0x0

    :goto_0
    iget-object p2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair$BluetoothPairReceiver;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothPair;

    invoke-static {p2}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->access$1300(Lcom/jieli/bluetooth_connect/impl/BluetoothPair;)Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->hasBle(Landroid/content/Context;)Z

    move-result p2

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair$BluetoothPairReceiver;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothPair;

    invoke-static {v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->access$1000(Lcom/jieli/bluetooth_connect/impl/BluetoothPair;)Lcom/jieli/bluetooth_connect/tool/BtPairEventCbManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/jieli/bluetooth_connect/tool/BtPairEventCbManager;->onAdapterStatus(ZZ)V

    :cond_6
    :goto_1
    return-void
.end method
