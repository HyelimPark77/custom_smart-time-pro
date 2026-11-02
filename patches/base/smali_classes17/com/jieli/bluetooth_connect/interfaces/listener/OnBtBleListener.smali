.class public abstract Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtBleListener;
.super Landroid/bluetooth/BluetoothGattCallback;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/bluetooth/BluetoothGattCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract onBleBond(Landroid/bluetooth/BluetoothDevice;I)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "device",
            "bondStatus"
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

.method public abstract onBleDataNotify(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;[B)V
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

.method public abstract onBleMtuChanged(Landroid/bluetooth/BluetoothDevice;II)V
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

.method public abstract onBleWriteStatus(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;[BI)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
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

.method public abstract onConnectionUpdatedCallback(Landroid/bluetooth/BluetoothGatt;IIII)V
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

.method public abstract onSwitchBleDevice(Landroid/bluetooth/BluetoothDevice;)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation
.end method
