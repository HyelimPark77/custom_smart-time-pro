.class public interface abstract Lcom/jieli/bluetooth_connect/interfaces/IBluetoothPair;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/bluetooth_connect/interfaces/IBluetoothBase;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/jieli/bluetooth_connect/interfaces/IBluetoothBase<",
        "Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDevicePairListener;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract getPairedDevices()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/bluetooth/BluetoothDevice;",
            ">;"
        }
    .end annotation
.end method

.method public abstract isPaired(Landroid/bluetooth/BluetoothDevice;)Z
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation
.end method

.method public abstract isPairing(Landroid/bluetooth/BluetoothDevice;)Z
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation
.end method

.method public abstract pair(Landroid/bluetooth/BluetoothDevice;)Z
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation
.end method

.method public abstract pair(Landroid/bluetooth/BluetoothDevice;I)Z
    .param p2    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
            to = 0x2L
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "device",
            "pairWay"
        }
    .end annotation
.end method

.method public abstract tryToPair(Landroid/bluetooth/BluetoothDevice;)Z
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation
.end method

.method public abstract tryToPair(Landroid/bluetooth/BluetoothDevice;I)Z
    .param p2    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
            to = 0x2L
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "device",
            "pairWay"
        }
    .end annotation
.end method

.method public abstract tryToUnPair(Landroid/bluetooth/BluetoothDevice;)Z
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation
.end method

.method public abstract unPair(Landroid/bluetooth/BluetoothDevice;)Z
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation
.end method
