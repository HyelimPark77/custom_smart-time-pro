.class public interface abstract Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/bluetooth_connect/interfaces/IBluetoothPair;


# virtual methods
.method public abstract clearHistoryRecords()V
.end method

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

.method public abstract connectBtDevice(Landroid/bluetooth/BluetoothDevice;I)Z
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "device",
            "connectWay"
        }
    .end annotation
.end method

.method public abstract connectBtDeviceWithoutRecord(Landroid/bluetooth/BluetoothDevice;I)Z
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "device",
            "connectWay"
        }
    .end annotation
.end method

.method public abstract connectByProfiles(Landroid/bluetooth/BluetoothDevice;)Z
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation
.end method

.method public abstract connectHistoryRecord(Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;Lcom/jieli/bluetooth_connect/interfaces/callback/OnHistoryRecordCallback;)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "record",
            "callback"
        }
    .end annotation
.end method

.method public abstract connectSPPDevice(Landroid/bluetooth/BluetoothDevice;)Z
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation
.end method

.method public abstract destroy()V
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

.method public abstract disconnectBtDevice(Landroid/bluetooth/BluetoothDevice;)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation
.end method

.method public abstract disconnectByProfiles(Landroid/bluetooth/BluetoothDevice;)Z
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation
.end method

.method public abstract disconnectSPPDevice(Landroid/bluetooth/BluetoothDevice;)Z
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation
.end method

.method public abstract fastConnect()V
.end method

.method public abstract getActivityBluetoothDevice()Landroid/bluetooth/BluetoothDevice;
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

.method public abstract getBluetoothOption()Lcom/jieli/bluetooth_connect/bean/BluetoothOption;
.end method

.method public abstract getConnectedBluetoothGatt()Landroid/bluetooth/BluetoothGatt;
.end method

.method public abstract getConnectedDevice()Landroid/bluetooth/BluetoothDevice;
.end method

.method public abstract getConnectedDeviceList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/bluetooth/BluetoothDevice;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getConnectedSppList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/bluetooth/BluetoothDevice;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getConnectingBrEdrDevice()Landroid/bluetooth/BluetoothDevice;
.end method

.method public abstract getConnectingDevice()Landroid/bluetooth/BluetoothDevice;
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

.method public abstract getDiscoveredBluetoothDevices()Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Landroid/bluetooth/BluetoothDevice;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getHistoryRecord(Ljava/lang/String;)Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "devAddress"
        }
    .end annotation
.end method

.method public abstract getHistoryRecordList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getMappedDeviceAddress(Ljava/lang/String;)Ljava/lang/String;
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "deviceAddress"
        }
    .end annotation
.end method

.method public abstract getScanType()I
.end method

.method public abstract isBrEdrConnecting()Z
.end method

.method public abstract isConnectedBLEDevice(Landroid/bluetooth/BluetoothDevice;)Z
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation
.end method

.method public abstract isConnectedByA2dp(Landroid/bluetooth/BluetoothDevice;)I
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation
.end method

.method public abstract isConnectedByHfp(Landroid/bluetooth/BluetoothDevice;)I
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation
.end method

.method public abstract isConnectedByProfile(Landroid/bluetooth/BluetoothDevice;)I
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation
.end method

.method public abstract isConnectedDevice(Landroid/bluetooth/BluetoothDevice;)Z
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation
.end method

.method public abstract isConnectedSppDevice(Landroid/bluetooth/BluetoothDevice;)Z
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation
.end method

.method public abstract isConnecting()Z
.end method

.method public abstract isReconnectDevice()Z
.end method

.method public abstract isScanning()Z
.end method

.method public abstract registerBluetoothCallback(Lcom/jieli/bluetooth_connect/interfaces/callback/BluetoothEventCallback;)Z
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "bluetoothCallback"
        }
    .end annotation
.end method

.method public abstract removeHistoryRecord(Ljava/lang/String;Lcom/jieli/bluetooth_connect/interfaces/callback/OnHistoryRecordCallback;)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "address",
            "callback"
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

.method public abstract sendDataToDevice(Landroid/bluetooth/BluetoothDevice;[B)Z
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "device",
            "data"
        }
    .end annotation
.end method

.method public abstract setActivityBluetoothDevice(Landroid/bluetooth/BluetoothDevice;)Z
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation
.end method

.method public abstract setBluetoothOption(Lcom/jieli/bluetooth_connect/bean/BluetoothOption;)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "bluetoothOption"
        }
    .end annotation
.end method

.method public abstract setConnectedDevice(Landroid/bluetooth/BluetoothDevice;)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation
.end method

.method public abstract startBLEScan(J)Z
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "timeout"
        }
    .end annotation
.end method

.method public abstract startConnectByBreProfiles(Landroid/bluetooth/BluetoothDevice;)Z
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "breDevice"
        }
    .end annotation
.end method

.method public abstract startDeviceScan(IJ)Z
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "type",
            "timeout"
        }
    .end annotation
.end method

.method public abstract startDeviceScan(J)Z
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "timeout"
        }
    .end annotation
.end method

.method public abstract stopBLEScan()Z
.end method

.method public abstract stopDeviceScan()Z
.end method

.method public abstract stopReconnect()V
.end method

.method public abstract unregisterBluetoothCallback(Lcom/jieli/bluetooth_connect/interfaces/callback/BluetoothEventCallback;)Z
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "bluetoothCallback"
        }
    .end annotation
.end method

.method public abstract writeDataToBLEDevice(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;[B)Z
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
            "writeData"
        }
    .end annotation
.end method

.method public abstract writeDataToSppDevice(Landroid/bluetooth/BluetoothDevice;[B)Z
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "device",
            "data"
        }
    .end annotation
.end method
