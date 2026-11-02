.class Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$15;
.super Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtBleListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$15;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtBleListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onBleConnection(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$15;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->getBluetoothOption()Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->isAutoConnectBle()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$15;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-static {v0, p2}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;I)I

    move-result p2

    invoke-virtual {v0, p1, p2}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->onBtDeviceConnection(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public onCharacteristicChanged(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$15;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->getBluetoothOption()Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->isAutoConnectBle()Z

    move-result v0

    if-eqz v0, :cond_3

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$15;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->getTargetDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/jieli/jl_bt_ota/util/BluetoothUtil;->deviceEquals(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getValue()[B

    move-result-object p2

    if-eqz p2, :cond_3

    array-length v0, p2

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$15;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-virtual {v0, p1, p2}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->onReceiveDeviceData(Landroid/bluetooth/BluetoothDevice;[B)V

    :cond_3
    :goto_0
    return-void
.end method
