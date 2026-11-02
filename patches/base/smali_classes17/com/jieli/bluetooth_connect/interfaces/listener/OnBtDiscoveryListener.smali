.class public interface abstract Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDiscoveryListener;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract onDiscoveryDevice(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;)V
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

.method public abstract onDiscoveryError(Lcom/jieli/bluetooth_connect/bean/ErrorInfo;)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "error"
        }
    .end annotation
.end method

.method public abstract onDiscoveryStatusChange(ZZ)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "isBle",
            "bStart"
        }
    .end annotation
.end method

.method public abstract onShowProductDialog(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;)V
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
