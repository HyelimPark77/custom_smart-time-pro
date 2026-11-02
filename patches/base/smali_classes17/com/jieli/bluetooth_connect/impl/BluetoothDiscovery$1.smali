.class Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery$1;
.super Landroid/bluetooth/le/ScanCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;


# direct methods
.method public constructor <init>(Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            "this$0"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery$1;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;

    invoke-direct {p0}, Landroid/bluetooth/le/ScanCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onBatchScanResults(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "results"
        }
    .end annotation

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
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "errorCode"
        }
    .end annotation

    invoke-super {p0, p1}, Landroid/bluetooth/le/ScanCallback;->onScanFailed(I)V

    invoke-static {}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->access$300()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "errorCode : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "onScanFailed"

    invoke-static {v0, v2, v1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery$1;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;

    invoke-static {v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->access$400(Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;)Lcom/jieli/bluetooth_connect/tool/BtDiscoveryCbManager;

    move-result-object v0

    const/16 v1, 0x8

    const/4 v2, 0x0

    invoke-static {v1, p1, v2}, Lcom/jieli/bluetooth_connect/bean/ErrorInfo;->buildError(IILjava/lang/String;)Lcom/jieli/bluetooth_connect/bean/ErrorInfo;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/tool/BtDiscoveryCbManager;->onDiscoveryError(Lcom/jieli/bluetooth_connect/bean/ErrorInfo;)V

    iget-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery$1;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->access$500(Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;ZZ)V

    return-void
.end method

.method public onScanResult(ILandroid/bluetooth/le/ScanResult;)V
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "callbackType",
            "result"
        }
    .end annotation

    invoke-super {p0, p1, p2}, Landroid/bluetooth/le/ScanCallback;->onScanResult(ILandroid/bluetooth/le/ScanResult;)V

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Landroid/bluetooth/le/ScanResult;->getScanRecord()Landroid/bluetooth/le/ScanRecord;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p2}, Landroid/bluetooth/le/ScanResult;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-virtual {p2}, Landroid/bluetooth/le/ScanResult;->isConnectable()Z

    move-result v0

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery$1;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;

    invoke-virtual {p2}, Landroid/bluetooth/le/ScanResult;->getRssi()I

    move-result v2

    invoke-virtual {p2}, Landroid/bluetooth/le/ScanResult;->getScanRecord()Landroid/bluetooth/le/ScanRecord;

    move-result-object p2

    invoke-virtual {p2}, Landroid/bluetooth/le/ScanRecord;->getBytes()[B

    move-result-object p2

    invoke-static {v1, p1, v2, p2, v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->access$200(Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;Landroid/bluetooth/BluetoothDevice;I[BZ)V

    :cond_0
    return-void
.end method
