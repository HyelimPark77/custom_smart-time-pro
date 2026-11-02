.class public final synthetic Lcom/jieli/jl_bt_ota/impl/bt/iO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic I1:Landroid/bluetooth/BluetoothDevice;

.field public final synthetic IO:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;

.field public final synthetic iX1O1:Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;


# direct methods
.method public synthetic constructor <init>(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/iO;->IO:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;

    iput-object p2, p0, Lcom/jieli/jl_bt_ota/impl/bt/iO;->I1:Landroid/bluetooth/BluetoothDevice;

    iput-object p3, p0, Lcom/jieli/jl_bt_ota/impl/bt/iO;->iX1O1:Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/iO;->IO:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/iO;->I1:Landroid/bluetooth/BluetoothDevice;

    iget-object v2, p0, Lcom/jieli/jl_bt_ota/impl/bt/iO;->iX1O1:Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;

    invoke-static {v0, v1, v2}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->iO(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;)V

    return-void
.end method
