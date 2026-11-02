.class public interface abstract Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtSppListener;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract onSppConnection(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;I)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "device",
            "uuid",
            "status"
        }
    .end annotation
.end method

.method public abstract onSppDataNotify(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;[B)V
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

.method public abstract onSwitchSppDevice(Landroid/bluetooth/BluetoothDevice;)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation
.end method
