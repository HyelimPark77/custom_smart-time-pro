.class public interface abstract Lcom/jieli/jl_rcsp/interfaces/bluetooth/IBluetoothProxy;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract callbackErrorEvent(Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Lcom/jieli/jl_rcsp/model/base/BaseError;",
            ">(TE;)V"
        }
    .end annotation
.end method

.method public abstract getConnectedDevice()Landroid/bluetooth/BluetoothDevice;
.end method

.method public abstract isDeviceConnected(Landroid/bluetooth/BluetoothDevice;)Z
.end method

.method public abstract notifyBtDeviceConnection(Landroid/bluetooth/BluetoothDevice;I)V
.end method

.method public abstract notifyReceiveDeviceData(Landroid/bluetooth/BluetoothDevice;[B)V
.end method

.method public abstract receiveDataFromDevice(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BasePacket;)V
.end method

.method public abstract sendDataToDevice(Landroid/bluetooth/BluetoothDevice;[B)Z
.end method

.method public abstract setCmdSnGenerator(Lcom/jieli/jl_rcsp/interfaces/bluetooth/CmdSnGenerator;)V
.end method
