.class public interface abstract Lcom/jieli/jl_fatfs/interfaces/IBluetoothCtrl;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract getConnectedDevice()Landroid/bluetooth/BluetoothDevice;
.end method

.method public abstract readFatDataFromDevice(Landroid/bluetooth/BluetoothDevice;II)V
.end method

.method public abstract release()V
.end method

.method public abstract sendWriteFlag(Landroid/bluetooth/BluetoothDevice;Z)V
.end method

.method public abstract writeFatDataToDevice(Landroid/bluetooth/BluetoothDevice;I[B)V
.end method
