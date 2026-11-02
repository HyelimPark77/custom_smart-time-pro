.class Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery$2;
.super Landroid/bluetooth/le/ScanCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery$2;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;

    invoke-direct {p0}, Landroid/bluetooth/le/ScanCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onBatchScanResults(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/bluetooth/le/ScanResult;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Landroid/bluetooth/le/ScanCallback;->onBatchScanResults(Ljava/util/List;)V

    return-void
.end method

.method public onScanFailed(I)V
    .locals 3

    invoke-super {p0, p1}, Landroid/bluetooth/le/ScanCallback;->onScanFailed(I)V

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery$2;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;

    iget-object v0, v0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to scan ble. errorCode = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "onScanFailed"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery$2;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->a(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;Z)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery$2;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;

    iget-object p1, p1, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    const-string v0, "Repeatedly turn on Bluetooth scanning."

    invoke-static {p1, v2, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onScanResult(ILandroid/bluetooth/le/ScanResult;)V
    .locals 3

    invoke-super {p0, p1, p2}, Landroid/bluetooth/le/ScanCallback;->onScanResult(ILandroid/bluetooth/le/ScanResult;)V

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Landroid/bluetooth/le/ScanResult;->getScanRecord()Landroid/bluetooth/le/ScanRecord;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p2}, Landroid/bluetooth/le/ScanResult;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-virtual {p2}, Landroid/bluetooth/le/ScanResult;->isConnectable()Z

    move-result v0

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery$2;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;

    invoke-virtual {p2}, Landroid/bluetooth/le/ScanResult;->getRssi()I

    move-result v2

    invoke-virtual {p2}, Landroid/bluetooth/le/ScanResult;->getScanRecord()Landroid/bluetooth/le/ScanRecord;

    move-result-object p2

    invoke-virtual {p2}, Landroid/bluetooth/le/ScanRecord;->getBytes()[B

    move-result-object p2

    invoke-static {v1, p1, v2, p2, v0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->a(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;Landroid/bluetooth/BluetoothDevice;I[BZ)V

    :cond_0
    return-void
.end method
