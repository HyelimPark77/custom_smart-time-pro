.class Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$3;
.super Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$BtEventCbImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;->onBtDiscovery(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;

.field final synthetic val$bleScanMessage:Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

.field final synthetic val$device:Landroid/bluetooth/BluetoothDevice;


# direct methods
.method public constructor <init>(Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x1010,
            0x1010
        }
        names = {
            null,
            null,
            null
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$3;->this$0:Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;

    iput-object p2, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$3;->val$device:Landroid/bluetooth/BluetoothDevice;

    iput-object p3, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$3;->val$bleScanMessage:Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$BtEventCbImpl;-><init>(Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$1;)V

    return-void
.end method


# virtual methods
.method public onCallback(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothEventListener;)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$3;->val$device:Landroid/bluetooth/BluetoothDevice;

    iget-object v1, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$3;->val$bleScanMessage:Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    invoke-virtual {p1, v0, v1}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothEventListener;->onBtDiscovery(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;)V

    return-void
.end method
