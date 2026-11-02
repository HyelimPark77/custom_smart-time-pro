.class public interface abstract Lcom/jieli/bluetooth_connect/interfaces/listener/OnBrEdrListener;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract onA2dpStatus(Landroid/bluetooth/BluetoothDevice;I)V
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

.method public abstract onBrEdrConnection(Landroid/bluetooth/BluetoothDevice;I)V
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

.method public abstract onDeviceUuids(Landroid/bluetooth/BluetoothDevice;[Landroid/os/ParcelUuid;)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "device",
            "uuids"
        }
    .end annotation
.end method

.method public abstract onEdrService(ZILandroid/bluetooth/BluetoothProfile;)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "isConnected",
            "profile",
            "proxy"
        }
    .end annotation
.end method

.method public abstract onHfpStatus(Landroid/bluetooth/BluetoothDevice;I)V
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
