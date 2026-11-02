.class public interface abstract Lcom/jieli/bluetooth_connect/interfaces/listener/OnWriteDataCallback;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract onBleResult(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;Z[B)V
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
            "result",
            "data"
        }
    .end annotation
.end method
