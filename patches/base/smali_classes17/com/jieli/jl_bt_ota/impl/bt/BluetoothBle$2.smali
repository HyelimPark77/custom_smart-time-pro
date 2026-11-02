.class Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$2;
.super Landroid/bluetooth/BluetoothGattCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$2;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;

    invoke-direct {p0}, Landroid/bluetooth/BluetoothGattCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onCharacteristicChanged(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 2

    if-eqz p1, :cond_1

    .line 1
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    if-eqz v0, :cond_1

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getService()Landroid/bluetooth/BluetoothGattService;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$2;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getValue()[B

    move-result-object v1

    invoke-static {v0, p1, p2, v1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->a(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;[B)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onCharacteristicChanged(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;[B)V
    .locals 1
    .param p1    # Landroid/bluetooth/BluetoothGatt;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/bluetooth/BluetoothGattCharacteristic;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # [B
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RequiresApi;
        api = 0x21
    .end annotation

    .line 3
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$2;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->a(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;)Lcom/jieli/jl_bt_ota/tool/ble/BtBleCallbackManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/jieli/jl_bt_ota/tool/ble/BtBleCallbackManager;->onCharacteristicChanged(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;[B)V

    .line 4
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$2;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;

    invoke-static {v0, p1, p2, p3}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->a(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;[B)V

    return-void
.end method

.method public onCharacteristicRead(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V
    .locals 2

    if-eqz p1, :cond_1

    .line 3
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    if-eqz v0, :cond_1

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getService()Landroid/bluetooth/BluetoothGattService;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$2;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getValue()[B

    move-result-object v1

    invoke-static {v0, p1, p2, v1, p3}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->a(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;[BI)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onCharacteristicRead(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;[BI)V
    .locals 1
    .param p1    # Landroid/bluetooth/BluetoothGatt;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/bluetooth/BluetoothGattCharacteristic;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # [B
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RequiresApi;
        api = 0x21
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$2;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->a(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;)Lcom/jieli/jl_bt_ota/tool/ble/BtBleCallbackManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/jieli/jl_bt_ota/tool/ble/BtBleCallbackManager;->onCharacteristicRead(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;[BI)V

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$2;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;

    invoke-static {v0, p1, p2, p3, p4}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->a(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;[BI)V

    return-void
.end method

.method public onCharacteristicWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V
    .locals 10

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    if-eqz v0, :cond_1

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getService()Landroid/bluetooth/BluetoothGattService;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getService()Landroid/bluetooth/BluetoothGattService;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothGattService;->getUuid()Ljava/util/UUID;

    move-result-object v3

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v4

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getValue()[B

    move-result-object v6

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$2;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;

    iget-object v1, v0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v5

    const/4 v7, 0x0

    invoke-virtual {v0, v5, v7}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;Z)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3}, Lcom/jieli/jl_bt_ota/util/UuidUtil;->read16BitUUID(Ljava/util/UUID;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4}, Lcom/jieli/jl_bt_ota/util/UuidUtil;->read16BitUUID(Ljava/util/UUID;)Ljava/lang/String;

    move-result-object v7

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6}, Lcom/jieli/jl_bt_ota/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v9

    filled-new-array {v0, v5, v7, v8, v9}, [Ljava/lang/Object;

    move-result-object v0

    const-string v5, ">>> device = %s, service = %s, characteristic = %s, status = %d,\n data : [%s]."

    invoke-static {v5, v0}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v5, "onCharacteristicWrite"

    invoke-static {v1, v5, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$2;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;

    move v5, p3

    invoke-static/range {v1 .. v6}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->a(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;I[B)V

    iget-object p3, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$2;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;

    invoke-static {p3}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->a(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;)Lcom/jieli/jl_bt_ota/tool/ble/BtBleCallbackManager;

    move-result-object p3

    invoke-virtual {p3, p1, p2, v5}, Lcom/jieli/jl_bt_ota/tool/ble/BtBleCallbackManager;->onCharacteristicWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onConnectionStateChange(Landroid/bluetooth/BluetoothGatt;II)V
    .locals 4

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$2;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;

    iget-object v2, v1, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v0, v1, v3}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "device: %s, status = %d, newState = %d."

    invoke-static {v1, v0}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "onConnectionStateChange"

    invoke-static {v2, v1, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$2;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;

    invoke-static {v0, p1, p2, p3}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->a(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;Landroid/bluetooth/BluetoothGatt;II)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onConnectionUpdated(Landroid/bluetooth/BluetoothGatt;IIII)V
    .locals 7
    .annotation build Landroidx/annotation/RequiresApi;
        api = 0x1a
    .end annotation

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$2;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;

    iget-object v2, v1, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    filled-new-array {v0, v1, v3, v4, v5}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "device: %s, interval = %d, latency = %d, timeout = %d, status = %d."

    invoke-static {v1, v0}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "onConnectionUpdated"

    invoke-static {v2, v1, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$2;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->a(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;)Lcom/jieli/jl_bt_ota/tool/ble/BtBleCallbackManager;

    move-result-object v1

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    invoke-virtual/range {v1 .. v6}, Lcom/jieli/jl_bt_ota/tool/ble/BtBleCallbackManager;->onConnectionUpdated(Landroid/bluetooth/BluetoothGatt;IIII)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onDescriptorRead(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$2;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->a(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;)Lcom/jieli/jl_bt_ota/tool/ble/BtBleCallbackManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/jieli/jl_bt_ota/tool/ble/BtBleCallbackManager;->onDescriptorRead(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V

    return-void
.end method

.method public onDescriptorRead(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I[B)V
    .locals 1
    .param p1    # Landroid/bluetooth/BluetoothGatt;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/bluetooth/BluetoothGattDescriptor;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # [B
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RequiresApi;
        api = 0x21
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$2;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->a(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;)Lcom/jieli/jl_bt_ota/tool/ble/BtBleCallbackManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/jieli/jl_bt_ota/tool/ble/BtBleCallbackManager;->onDescriptorRead(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I[B)V

    return-void
.end method

.method public onDescriptorWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V
    .locals 5

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    if-eqz v0, :cond_4

    if-nez p2, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattDescriptor;->getCharacteristic()Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$2;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;

    invoke-static {v1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->a(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;)Lcom/jieli/jl_bt_ota/tool/ble/BtBleCallbackManager;

    move-result-object v1

    invoke-virtual {v1, p1, p2, p3}, Lcom/jieli/jl_bt_ota/tool/ble/BtBleCallbackManager;->onDescriptorWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattDescriptor;->getCharacteristic()Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object p2

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getService()Landroid/bluetooth/BluetoothGattService;

    move-result-object p1

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattService;->getUuid()Ljava/util/UUID;

    move-result-object p1

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    move-object p1, p2

    :goto_0
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$2;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;

    iget-object v1, v1, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    invoke-static {p1}, Lcom/jieli/jl_bt_ota/util/UuidUtil;->read16BitUUID(Ljava/util/UUID;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p2}, Lcom/jieli/jl_bt_ota/util/UuidUtil;->read16BitUUID(Ljava/util/UUID;)Ljava/lang/String;

    move-result-object v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v0, v2, v3, v4}, [Ljava/lang/Object;

    move-result-object v2

    const-string v3, "device: %s, serviceUUID: %s, characteristicUuid: %s, status = %d."

    invoke-static {v3, v2}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "onDescriptorWrite"

    invoke-static {v1, v3, v2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$2;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;

    if-nez p3, :cond_3

    const/4 p3, 0x1

    goto :goto_1

    :cond_3
    const/4 p3, 0x0

    :goto_1
    invoke-static {v1, v0, p1, p2, p3}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->a(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;Z)V

    :cond_4
    :goto_2
    return-void
.end method

.method public onMtuChanged(Landroid/bluetooth/BluetoothGatt;II)V
    .locals 5

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    add-int/lit8 v1, p2, -0x3

    iget-object v2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$2;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;

    iget-object v2, v2, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "device : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$2;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;

    invoke-virtual {v4, v0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ", real mtu = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ", status = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "onMtuChanged"

    invoke-static {v2, v4, v3}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$2;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;

    invoke-static {v2}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->a(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;)Lcom/jieli/jl_bt_ota/tool/ble/BtBleCallbackManager;

    move-result-object v2

    invoke-virtual {v2, p1, p2, p3}, Lcom/jieli/jl_bt_ota/tool/ble/BtBleCallbackManager;->onMtuChanged(Landroid/bluetooth/BluetoothGatt;II)V

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$2;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;

    iget-object p2, p1, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mUIHandler:Landroid/os/Handler;

    const/16 v2, 0x3003

    invoke-virtual {p2, v2}, Landroid/os/Handler;->hasMessages(I)Z

    move-result p2

    invoke-static {p1, v0, v1, p3, p2}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->a(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;Landroid/bluetooth/BluetoothDevice;IIZ)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onPhyRead(Landroid/bluetooth/BluetoothGatt;III)V
    .locals 4
    .annotation build Landroidx/annotation/RequiresApi;
        api = 0x1a
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$2;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;

    iget-object v0, v0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v1, v2, v3}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "txPhy = %d, rxPhy = %d, status = %d"

    invoke-static {v2, v1}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "onPhyRead"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$2;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->a(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;)Lcom/jieli/jl_bt_ota/tool/ble/BtBleCallbackManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/jieli/jl_bt_ota/tool/ble/BtBleCallbackManager;->onPhyRead(Landroid/bluetooth/BluetoothGatt;III)V

    return-void
.end method

.method public onPhyUpdate(Landroid/bluetooth/BluetoothGatt;III)V
    .locals 4
    .annotation build Landroidx/annotation/RequiresApi;
        api = 0x1a
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$2;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;

    iget-object v0, v0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v1, v2, v3}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "txPhy = %d, rxPhy = %d, status = %d"

    invoke-static {v2, v1}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "onPhyUpdate"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$2;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->a(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;)Lcom/jieli/jl_bt_ota/tool/ble/BtBleCallbackManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/jieli/jl_bt_ota/tool/ble/BtBleCallbackManager;->onPhyUpdate(Landroid/bluetooth/BluetoothGatt;III)V

    return-void
.end method

.method public onServicesDiscovered(Landroid/bluetooth/BluetoothGatt;I)V
    .locals 3

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$2;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;

    const/16 v2, 0x3002

    invoke-virtual {v1, v2}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->removeTimeoutTask(I)V

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$2;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;

    iget-object v1, v1, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mContext:Landroid/content/Context;

    invoke-static {v1, v0, p1, p2}, Lcom/jieli/jl_bt_ota/util/BluetoothUtil;->printBleGattServices(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothGatt;I)V

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$2;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;

    invoke-static {v0, p1, p2}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->a(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;Landroid/bluetooth/BluetoothGatt;I)V

    :cond_1
    :goto_0
    return-void
.end method
