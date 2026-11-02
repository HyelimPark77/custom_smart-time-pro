.class public interface abstract Lcom/jieli/jl_bt_ota/interfaces/bt/IBluetoothManager;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract addOnRcspCallback(Lcom/jieli/jl_bt_ota/interfaces/rcsp/OnRcspCallback;)V
.end method

.method public abstract connectBluetoothDevice(Landroid/bluetooth/BluetoothDevice;)V
.end method

.method public abstract disconnectBluetoothDevice(Landroid/bluetooth/BluetoothDevice;)V
.end method

.method public abstract getConnectedBluetoothGatt()Landroid/bluetooth/BluetoothGatt;
.end method

.method public abstract getConnectedDevice()Landroid/bluetooth/BluetoothDevice;
.end method

.method public abstract onBtDeviceConnection(Landroid/bluetooth/BluetoothDevice;I)V
.end method

.method public abstract onError(Lcom/jieli/jl_bt_ota/model/base/BaseError;)V
.end method

.method public abstract onMtuChanged(Landroid/bluetooth/BluetoothGatt;II)V
.end method

.method public abstract onReceiveDeviceData(Landroid/bluetooth/BluetoothDevice;[B)V
.end method

.method public abstract registerBluetoothCallback(Lcom/jieli/jl_bt_ota/interfaces/BtEventCallback;)V
.end method

.method public abstract removeRcspCallback(Lcom/jieli/jl_bt_ota/interfaces/rcsp/OnRcspCallback;)V
.end method

.method public abstract sendDataToDevice(Landroid/bluetooth/BluetoothDevice;[B)Z
.end method

.method public abstract unregisterBluetoothCallback(Lcom/jieli/jl_bt_ota/interfaces/BtEventCallback;)V
.end method
