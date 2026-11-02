.class public interface abstract Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread$IBleOperation;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "IBleOperation"
.end annotation


# virtual methods
.method public abstract getBleMtu(Landroid/bluetooth/BluetoothDevice;)I
.end method

.method public abstract writeBleData(Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;)Z
.end method
