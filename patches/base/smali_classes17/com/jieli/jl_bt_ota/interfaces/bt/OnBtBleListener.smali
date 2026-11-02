.class public abstract Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtBleListener;
.super Landroid/bluetooth/BluetoothGattCallback;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/bluetooth/BluetoothGattCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract onBleConnection(Landroid/bluetooth/BluetoothDevice;I)V
.end method

.method public onConnectionUpdatedCallback(Landroid/bluetooth/BluetoothGatt;IIII)V
    .locals 0

    return-void
.end method

.method public onSwitchBleDevice(Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    return-void
.end method
