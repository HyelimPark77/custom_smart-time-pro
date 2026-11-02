.class public interface abstract Lcom/jieli/bluetooth_connect/interfaces/callback/IBluetoothEventCallback;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract onA2dpStatus(Landroid/bluetooth/BluetoothDevice;I)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "device",
            "status"
        }
    .end annotation
.end method

.method public abstract onAdapterStatus(ZZ)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "bEnabled",
            "bHasBle"
        }
    .end annotation
.end method

.method public abstract onBleConnection(Landroid/bluetooth/BluetoothDevice;I)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "device",
            "status"
        }
    .end annotation
.end method

.method public abstract onBleDataBlockChanged(Landroid/bluetooth/BluetoothDevice;II)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "device",
            "block",
            "status"
        }
    .end annotation
.end method

.method public abstract onBleDataNotification(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;[B)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "device",
            "serviceUuid",
            "characteristicsUuid",
            "data"
        }
    .end annotation
.end method

.method public abstract onBleNotificationStatus(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;Z)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "device",
            "serviceUuid",
            "characteristicUuid",
            "bEnabled"
        }
    .end annotation
.end method

.method public abstract onBleServiceDiscovery(Landroid/bluetooth/BluetoothDevice;ILjava/util/List;)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "device",
            "status",
            "services"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "I",
            "Ljava/util/List<",
            "Landroid/bluetooth/BluetoothGattService;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract onBleWriteStatus(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;[BI)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x10,
            0x0,
            0x0
        }
        names = {
            "device",
            "serviceUuid",
            "characteristicsUuid",
            "data",
            "status"
        }
    .end annotation
.end method

.method public abstract onBondStatus(Landroid/bluetooth/BluetoothDevice;I)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "device",
            "status"
        }
    .end annotation
.end method

.method public abstract onBtDeviceConnectStatus(Landroid/bluetooth/BluetoothDevice;I)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "device",
            "status"
        }
    .end annotation
.end method

.method public abstract onConnection(Landroid/bluetooth/BluetoothDevice;I)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "device",
            "status"
        }
    .end annotation
.end method

.method public abstract onConnectionUpdated(Landroid/bluetooth/BluetoothGatt;IIII)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "gatt",
            "interval",
            "latency",
            "timeout",
            "status"
        }
    .end annotation
.end method

.method public abstract onDeviceUuidsDiscovery(Landroid/bluetooth/BluetoothDevice;[Landroid/os/ParcelUuid;)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "device",
            "uuids"
        }
    .end annotation
.end method

.method public abstract onDiscovery(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "device",
            "bleScanMessage"
        }
    .end annotation
.end method

.method public abstract onDiscoveryStatus(ZZ)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "bBle",
            "bStart"
        }
    .end annotation
.end method

.method public abstract onError(Lcom/jieli/bluetooth_connect/bean/ErrorInfo;)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "error"
        }
    .end annotation
.end method

.method public abstract onHfpStatus(Landroid/bluetooth/BluetoothDevice;I)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "device",
            "status"
        }
    .end annotation
.end method

.method public abstract onHistoryRecordChange(ILcom/jieli/bluetooth_connect/bean/history/HistoryRecord;)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "op",
            "record"
        }
    .end annotation
.end method

.method public abstract onShowDialog(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "device",
            "bleScanMessage"
        }
    .end annotation
.end method

.method public abstract onSppDataNotification(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;[B)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "device",
            "sppUUID",
            "data"
        }
    .end annotation
.end method

.method public abstract onSppStatus(Landroid/bluetooth/BluetoothDevice;I)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "device",
            "status"
        }
    .end annotation
.end method

.method public abstract onSwitchConnectedDevice(Landroid/bluetooth/BluetoothDevice;)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation
.end method
