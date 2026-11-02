.class public interface abstract Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDevicePairListener;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
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

.method public abstract onBtDeviceBond(Landroid/bluetooth/BluetoothDevice;I)V
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

.method public abstract onPairError(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/bean/ErrorInfo;)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "device",
            "error"
        }
    .end annotation
.end method
