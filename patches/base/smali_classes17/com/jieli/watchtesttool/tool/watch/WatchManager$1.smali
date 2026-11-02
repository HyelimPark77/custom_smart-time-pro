.class Lcom/jieli/watchtesttool/tool/watch/WatchManager$1;
.super Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothEventListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/watchtesttool/tool/watch/WatchManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/jieli/watchtesttool/tool/watch/WatchManager;


# direct methods
.method public constructor <init>(Lcom/jieli/watchtesttool/tool/watch/WatchManager;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/watchtesttool/tool/watch/WatchManager$1;->this$0:Lcom/jieli/watchtesttool/tool/watch/WatchManager;

    invoke-direct {p0}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothEventListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onConnection(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 1

    invoke-static {p2}, Lcom/jieli/watchtesttool/util/AppUtil;->convertWatchConnectStatus(I)I

    move-result p2

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    iget-object p2, p0, Lcom/jieli/watchtesttool/tool/watch/WatchManager$1;->this$0:Lcom/jieli/watchtesttool/tool/watch/WatchManager;

    invoke-static {p2, p1}, Lcom/jieli/watchtesttool/tool/watch/WatchManager;->access$000(Lcom/jieli/watchtesttool/tool/watch/WatchManager;Landroid/bluetooth/BluetoothDevice;)V

    iget-object p2, p0, Lcom/jieli/watchtesttool/tool/watch/WatchManager$1;->this$0:Lcom/jieli/watchtesttool/tool/watch/WatchManager;

    invoke-static {p2}, Lcom/jieli/watchtesttool/tool/watch/WatchManager;->access$100(Lcom/jieli/watchtesttool/tool/watch/WatchManager;)Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->isUsedBtDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p2, p0, Lcom/jieli/watchtesttool/tool/watch/WatchManager$1;->this$0:Lcom/jieli/watchtesttool/tool/watch/WatchManager;

    invoke-static {p2, p1}, Lcom/jieli/watchtesttool/tool/watch/WatchManager;->access$200(Lcom/jieli/watchtesttool/tool/watch/WatchManager;Landroid/bluetooth/BluetoothDevice;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/watch/WatchManager$1;->this$0:Lcom/jieli/watchtesttool/tool/watch/WatchManager;

    invoke-static {v0}, Lcom/jieli/watchtesttool/tool/watch/WatchManager;->access$300(Lcom/jieli/watchtesttool/tool/watch/WatchManager;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->deviceEquals(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/watch/WatchManager$1;->this$0:Lcom/jieli/watchtesttool/tool/watch/WatchManager;

    invoke-virtual {v0, p1, p2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->notifyBtDeviceConnection(Landroid/bluetooth/BluetoothDevice;I)V

    const/4 p1, 0x2

    if-eq p2, p1, :cond_1

    if-nez p2, :cond_2

    :cond_1
    iget-object p1, p0, Lcom/jieli/watchtesttool/tool/watch/WatchManager$1;->this$0:Lcom/jieli/watchtesttool/tool/watch/WatchManager;

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lcom/jieli/watchtesttool/tool/watch/WatchManager;->access$200(Lcom/jieli/watchtesttool/tool/watch/WatchManager;Landroid/bluetooth/BluetoothDevice;)V

    :cond_2
    return-void
.end method

.method public onReceiveData(Landroid/bluetooth/BluetoothDevice;[B)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/watch/WatchManager$1;->this$0:Lcom/jieli/watchtesttool/tool/watch/WatchManager;

    invoke-virtual {v0}, Lcom/jieli/watchtesttool/tool/watch/WatchManager;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->deviceEquals(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/watch/WatchManager$1;->this$0:Lcom/jieli/watchtesttool/tool/watch/WatchManager;

    invoke-virtual {v0, p1, p2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->notifyReceiveDeviceData(Landroid/bluetooth/BluetoothDevice;[B)V

    :cond_0
    return-void
.end method

.method public onSwitchConnectedDevice(Landroid/bluetooth/BluetoothDevice;)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/watch/WatchManager$1;->this$0:Lcom/jieli/watchtesttool/tool/watch/WatchManager;

    invoke-static {v0, p1}, Lcom/jieli/watchtesttool/tool/watch/WatchManager;->access$200(Lcom/jieli/watchtesttool/tool/watch/WatchManager;Landroid/bluetooth/BluetoothDevice;)V

    :cond_0
    return-void
.end method
