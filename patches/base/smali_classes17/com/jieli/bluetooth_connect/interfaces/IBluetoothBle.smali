.class public interface abstract Lcom/jieli/bluetooth_connect/interfaces/IBluetoothBle;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/bluetooth_connect/interfaces/IBluetoothBase;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/jieli/bluetooth_connect/interfaces/IBluetoothBase<",
        "Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtBleListener;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract connectBLEDevice(Landroid/bluetooth/BluetoothDevice;)Z
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation
.end method

.method public abstract disconnectBLEDevice(Landroid/bluetooth/BluetoothDevice;)Z
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation
.end method

.method public abstract getBleMtu(Landroid/bluetooth/BluetoothDevice;)I
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation
.end method

.method public abstract getConnectedBleDevice()Landroid/bluetooth/BluetoothDevice;
.end method

.method public abstract getConnectedBleDevices()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/bluetooth/BluetoothDevice;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getConnectingBleDevice()Landroid/bluetooth/BluetoothDevice;
.end method

.method public abstract getDeviceGatt(Landroid/bluetooth/BluetoothDevice;)Landroid/bluetooth/BluetoothGatt;
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation
.end method

.method public abstract isBleConnecting()Z
.end method

.method public abstract isConnectedBleDevice(Landroid/bluetooth/BluetoothDevice;)Z
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation
.end method

.method public abstract requestBleMtu(Landroid/bluetooth/BluetoothDevice;I)Z
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "device",
            "mtu"
        }
    .end annotation
.end method

.method public abstract setConnectedBleDevice(Landroid/bluetooth/BluetoothDevice;)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation
.end method

.method public abstract writeDataByBleAsync(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;[BLcom/jieli/bluetooth_connect/interfaces/listener/OnWriteDataCallback;)V
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
            "serviceUUID",
            "characteristicUUID",
            "data",
            "callback"
        }
    .end annotation
.end method

.method public abstract writeDataByBleSync(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;[B)Z
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "device",
            "serviceUUID",
            "characteristicUUID",
            "data"
        }
    .end annotation
.end method
