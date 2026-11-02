.class Lcom/jieli/bluetooth_connect/impl/BluetoothBle$4;
.super Landroid/bluetooth/BluetoothGattCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/bluetooth_connect/impl/BluetoothBle;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;


# direct methods
.method public constructor <init>(Lcom/jieli/bluetooth_connect/impl/BluetoothBle;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            "this$0"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBle$4;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-direct {p0}, Landroid/bluetooth/BluetoothGattCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onCharacteristicChanged(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 6
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "gatt",
            "characteristic"
        }
    .end annotation

    invoke-super {p0, p1, p2}, Landroid/bluetooth/BluetoothGattCallback;->onCharacteristicChanged(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBle$4;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-static {v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$1700(Lcom/jieli/bluetooth_connect/impl/BluetoothBle;)Lcom/jieli/bluetooth_connect/tool/BleEventCbManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/jieli/bluetooth_connect/tool/BleEventCbManager;->onCharacteristicChanged(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getService()Landroid/bluetooth/BluetoothGattService;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getService()Landroid/bluetooth/BluetoothGattService;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothGattService;->getUuid()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getValue()[B

    move-result-object v2

    invoke-static {}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$600()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBle$4;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    const/4 v5, 0x0

    invoke-static {v4, p1, v5}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$2000(Lcom/jieli/bluetooth_connect/impl/BluetoothBle;Landroid/bluetooth/BluetoothDevice;Z)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2}, Lcom/jieli/bluetooth_connect/util/CHexConverter;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v5

    filled-new-array {v4, p2, v5}, [Ljava/lang/Object;

    move-result-object p2

    const-string v4, "[onCharacteristicChanged] <<< device : %s, characteristic = %s, data = %s "

    invoke-static {v4, p2}, Lcom/jieli/bluetooth_connect/util/ConnectUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {v3, p2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBle$4;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-static {p2}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$1700(Lcom/jieli/bluetooth_connect/impl/BluetoothBle;)Lcom/jieli/bluetooth_connect/tool/BleEventCbManager;

    move-result-object p2

    invoke-virtual {p2, p1, v0, v1, v2}, Lcom/jieli/bluetooth_connect/tool/BleEventCbManager;->onBleDataNotify(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;[B)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onCharacteristicRead(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "gatt",
            "characteristic",
            "status"
        }
    .end annotation

    invoke-super {p0, p1, p2, p3}, Landroid/bluetooth/BluetoothGattCallback;->onCharacteristicRead(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V

    invoke-static {}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$600()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBle$4;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$2000(Lcom/jieli/bluetooth_connect/impl/BluetoothBle;Landroid/bluetooth/BluetoothDevice;Z)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getValue()[B

    move-result-object v2

    invoke-static {v2}, Lcom/jieli/bluetooth_connect/util/CHexConverter;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v1, p2, v2}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "[onCharacteristicRead] <<< device : %s, characteristic = %s, data = %s "

    invoke-static {v2, v1}, Lcom/jieli/bluetooth_connect/util/ConnectUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBle$4;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-static {v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$1700(Lcom/jieli/bluetooth_connect/impl/BluetoothBle;)Lcom/jieli/bluetooth_connect/tool/BleEventCbManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/jieli/bluetooth_connect/tool/BleEventCbManager;->onCharacteristicRead(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V

    return-void
.end method

.method public onCharacteristicWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V
    .locals 8
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "gatt",
            "characteristic",
            "status"
        }
    .end annotation

    invoke-super {p0, p1, p2, p3}, Landroid/bluetooth/BluetoothGattCallback;->onCharacteristicWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    if-eqz v1, :cond_2

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getService()Landroid/bluetooth/BluetoothGattService;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBle$4;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-static {v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$1700(Lcom/jieli/bluetooth_connect/impl/BluetoothBle;)Lcom/jieli/bluetooth_connect/tool/BleEventCbManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/jieli/bluetooth_connect/tool/BleEventCbManager;->onCharacteristicWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V

    invoke-static {}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$600()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBle$4;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v2, v3, v4}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$2000(Lcom/jieli/bluetooth_connect/impl/BluetoothBle;Landroid/bluetooth/BluetoothDevice;Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v2, v3, v4}, [Ljava/lang/Object;

    move-result-object v2

    const-string v3, "[onCharacteristicWrite] >>> device : %s, characteristic = %s, status = %d "

    invoke-static {v3, v2}, Lcom/jieli/bluetooth_connect/util/ConnectUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getService()Landroid/bluetooth/BluetoothGattService;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothGattService;->getUuid()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v3

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getValue()[B

    move-result-object v5

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBle$4;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    move v4, p3

    invoke-static/range {v0 .. v5}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$2100(Lcom/jieli/bluetooth_connect/impl/BluetoothBle;Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;I[B)V

    iget-object p2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBle$4;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-static {p2}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$1700(Lcom/jieli/bluetooth_connect/impl/BluetoothBle;)Lcom/jieli/bluetooth_connect/tool/BleEventCbManager;

    move-result-object p2

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    move v7, v4

    move-object v6, v5

    move-object v4, v2

    move-object v5, v3

    move-object v3, p1

    move-object v2, p2

    invoke-virtual/range {v2 .. v7}, Lcom/jieli/bluetooth_connect/tool/BleEventCbManager;->onBleWriteStatus(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;[BI)V

    :cond_2
    :goto_0
    return-void
.end method

.method public onConnectionStateChange(Landroid/bluetooth/BluetoothGatt;II)V
    .locals 5
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "gatt",
            "status",
            "newState"
        }
    .end annotation

    const-string v0, "onConnectionStateChange"

    if-nez p1, :cond_0

    invoke-static {}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$600()Ljava/lang/String;

    move-result-object p1

    const-string p2, "No Gatt."

    invoke-static {p1, v0, p2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-static {}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$600()Ljava/lang/String;

    move-result-object p1

    const-string p2, "No Device."

    invoke-static {p1, v0, p2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    iget-object v2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBle$4;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-static {v2}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$1700(Lcom/jieli/bluetooth_connect/impl/BluetoothBle;)Lcom/jieli/bluetooth_connect/tool/BleEventCbManager;

    move-result-object v2

    invoke-virtual {v2, p1, p2, p3}, Lcom/jieli/bluetooth_connect/tool/BleEventCbManager;->onConnectionStateChange(Landroid/bluetooth/BluetoothGatt;II)V

    invoke-static {}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$600()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "ble ConnectionStateChange device : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBle$4;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-static {v4, v1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$1600(Lcom/jieli/bluetooth_connect/impl/BluetoothBle;Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ", status : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Lcom/jieli/bluetooth_connect/constant/BluetoothConstant;->printBtConnection(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " newState : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v0, v3}, Lcom/jieli/bluetooth_connect/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBle$4;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-static {v0, p1, v1, p2, p3}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$1800(Lcom/jieli/bluetooth_connect/impl/BluetoothBle;Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothDevice;II)V

    return-void
.end method

.method public onConnectionUpdated(Landroid/bluetooth/BluetoothGatt;IIII)V
    .locals 7
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10,
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "gatt",
            "interval",
            "latency",
            "timeout",
            "status"
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-static {}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$600()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "device :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBle$4;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-static {v3, v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$1600(Lcom/jieli/bluetooth_connect/impl/BluetoothBle;Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " , interval : "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", latency : "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", timeout : "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", status : "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p5}, Lcom/jieli/bluetooth_connect/constant/BluetoothConstant;->printBtConnection(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "onConnectionUpdated"

    invoke-static {v1, v2, v0}, Lcom/jieli/bluetooth_connect/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBle$4;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-static {v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$1700(Lcom/jieli/bluetooth_connect/impl/BluetoothBle;)Lcom/jieli/bluetooth_connect/tool/BleEventCbManager;

    move-result-object v1

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    invoke-virtual/range {v1 .. v6}, Lcom/jieli/bluetooth_connect/tool/BleEventCbManager;->onConnectionUpdatedCallback(Landroid/bluetooth/BluetoothGatt;IIII)V

    return-void
.end method

.method public onDescriptorRead(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "gatt",
            "descriptor",
            "status"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBle$4;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-static {v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$1700(Lcom/jieli/bluetooth_connect/impl/BluetoothBle;)Lcom/jieli/bluetooth_connect/tool/BleEventCbManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/jieli/bluetooth_connect/tool/BleEventCbManager;->onDescriptorRead(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V

    return-void
.end method

.method public onDescriptorWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "gatt",
            "descriptor",
            "status"
        }
    .end annotation

    invoke-super {p0, p1, p2, p3}, Landroid/bluetooth/BluetoothGattCallback;->onDescriptorWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBle$4;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-static {v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$1700(Lcom/jieli/bluetooth_connect/impl/BluetoothBle;)Lcom/jieli/bluetooth_connect/tool/BleEventCbManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/jieli/bluetooth_connect/tool/BleEventCbManager;->onDescriptorWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattDescriptor;->getCharacteristic()Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getService()Landroid/bluetooth/BluetoothGattService;

    move-result-object p2

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattService;->getUuid()Ljava/util/UUID;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    move-object p2, v0

    :goto_0
    invoke-static {}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$600()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "UUID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_1
    const-string v3, ""

    :goto_1
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", status = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "onDescriptorWrite"

    invoke-static {v1, v3, v2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBle$4;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    if-nez p3, :cond_2

    const/4 p3, 0x1

    goto :goto_2

    :cond_2
    const/4 p3, 0x0

    :goto_2
    invoke-static {v1, p1, p2, v0, p3}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$2200(Lcom/jieli/bluetooth_connect/impl/BluetoothBle;Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;Z)V

    return-void
.end method

.method public onMtuChanged(Landroid/bluetooth/BluetoothGatt;II)V
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "gatt",
            "mtu",
            "status"
        }
    .end annotation

    invoke-super {p0, p1, p2, p3}, Landroid/bluetooth/BluetoothGattCallback;->onMtuChanged(Landroid/bluetooth/BluetoothGatt;II)V

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    if-nez v0, :cond_1

    :goto_0
    return-void

    :cond_1
    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBle$4;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-static {v1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$1700(Lcom/jieli/bluetooth_connect/impl/BluetoothBle;)Lcom/jieli/bluetooth_connect/tool/BleEventCbManager;

    move-result-object v1

    invoke-virtual {v1, p1, p2, p3}, Lcom/jieli/bluetooth_connect/tool/BleEventCbManager;->onMtuChanged(Landroid/bluetooth/BluetoothGatt;II)V

    if-nez p3, :cond_2

    add-int/lit8 p2, p2, -0x3

    iget-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBle$4;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-static {p1, v0, p2}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$2300(Lcom/jieli/bluetooth_connect/impl/BluetoothBle;Landroid/bluetooth/BluetoothDevice;I)V

    invoke-static {}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$600()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "realMtu : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v1, "onMtuChanged"

    invoke-static {p1, v1, p2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    iget-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBle$4;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-static {p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$1700(Lcom/jieli/bluetooth_connect/impl/BluetoothBle;)Lcom/jieli/bluetooth_connect/tool/BleEventCbManager;

    move-result-object p1

    iget-object p2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBle$4;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-virtual {p2, v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->getBleMtu(Landroid/bluetooth/BluetoothDevice;)I

    move-result p2

    invoke-virtual {p1, v0, p2, p3}, Lcom/jieli/bluetooth_connect/tool/BleEventCbManager;->onBleMtuChanged(Landroid/bluetooth/BluetoothDevice;II)V

    return-void
.end method

.method public onPhyRead(Landroid/bluetooth/BluetoothGatt;III)V
    .locals 4
    .annotation build Landroidx/annotation/RequiresApi;
        api = 0x1a
    .end annotation

    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "gatt",
            "txPhy",
            "rxPhy",
            "status"
        }
    .end annotation

    invoke-static {}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$600()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v1, v2, v3}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "txPhy = %d, rxPhy = %d, status = %d"

    invoke-static {v2, v1}, Lcom/jieli/bluetooth_connect/util/ConnectUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "onPhyRead"

    invoke-static {v0, v2, v1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBle$4;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-static {v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$1700(Lcom/jieli/bluetooth_connect/impl/BluetoothBle;)Lcom/jieli/bluetooth_connect/tool/BleEventCbManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/jieli/bluetooth_connect/tool/BleEventCbManager;->onPhyRead(Landroid/bluetooth/BluetoothGatt;III)V

    return-void
.end method

.method public onPhyUpdate(Landroid/bluetooth/BluetoothGatt;III)V
    .locals 4
    .annotation build Landroidx/annotation/RequiresApi;
        api = 0x1a
    .end annotation

    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "gatt",
            "txPhy",
            "rxPhy",
            "status"
        }
    .end annotation

    invoke-static {}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$600()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v1, v2, v3}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "txPhy = %d, rxPhy = %d, status = %d"

    invoke-static {v2, v1}, Lcom/jieli/bluetooth_connect/util/ConnectUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "onPhyUpdate"

    invoke-static {v0, v2, v1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBle$4;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-static {v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$1700(Lcom/jieli/bluetooth_connect/impl/BluetoothBle;)Lcom/jieli/bluetooth_connect/tool/BleEventCbManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/jieli/bluetooth_connect/tool/BleEventCbManager;->onPhyUpdate(Landroid/bluetooth/BluetoothGatt;III)V

    return-void
.end method

.method public onReadRemoteRssi(Landroid/bluetooth/BluetoothGatt;II)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "gatt",
            "rssi",
            "status"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBle$4;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-static {v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$1700(Lcom/jieli/bluetooth_connect/impl/BluetoothBle;)Lcom/jieli/bluetooth_connect/tool/BleEventCbManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/jieli/bluetooth_connect/tool/BleEventCbManager;->onReadRemoteRssi(Landroid/bluetooth/BluetoothGatt;II)V

    return-void
.end method

.method public onReliableWriteCompleted(Landroid/bluetooth/BluetoothGatt;I)V
    .locals 5
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "gatt",
            "status"
        }
    .end annotation

    invoke-super {p0, p1, p2}, Landroid/bluetooth/BluetoothGattCallback;->onReliableWriteCompleted(Landroid/bluetooth/BluetoothGatt;I)V

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$600()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "device : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBle$4;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v2, v3, v4}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$2000(Lcom/jieli/bluetooth_connect/impl/BluetoothBle;Landroid/bluetooth/BluetoothDevice;Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "onReliableWriteCompleted"

    invoke-static {v0, v2, v1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBle$4;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-static {v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$1700(Lcom/jieli/bluetooth_connect/impl/BluetoothBle;)Lcom/jieli/bluetooth_connect/tool/BleEventCbManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/jieli/bluetooth_connect/tool/BleEventCbManager;->onReliableWriteCompleted(Landroid/bluetooth/BluetoothGatt;I)V

    return-void
.end method

.method public onServiceChanged(Landroid/bluetooth/BluetoothGatt;)V
    .locals 1
    .param p1    # Landroid/bluetooth/BluetoothGatt;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RequiresApi;
        api = 0x1f
    .end annotation

    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "gatt"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBle$4;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-static {v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$1700(Lcom/jieli/bluetooth_connect/impl/BluetoothBle;)Lcom/jieli/bluetooth_connect/tool/BleEventCbManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/tool/BleEventCbManager;->onServiceChanged(Landroid/bluetooth/BluetoothGatt;)V

    return-void
.end method

.method public onServicesDiscovered(Landroid/bluetooth/BluetoothGatt;I)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "gatt",
            "status"
        }
    .end annotation

    invoke-super {p0, p1, p2}, Landroid/bluetooth/BluetoothGattCallback;->onServicesDiscovered(Landroid/bluetooth/BluetoothGatt;I)V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBle$4;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-static {v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$1900(Lcom/jieli/bluetooth_connect/impl/BluetoothBle;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x3549

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBle$4;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-static {v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$300(Lcom/jieli/bluetooth_connect/impl/BluetoothBle;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-static {v0, v1, p1, p2}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->printBleGattServices(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothGatt;I)V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBle$4;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-static {v0, p1, p2}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$500(Lcom/jieli/bluetooth_connect/impl/BluetoothBle;Landroid/bluetooth/BluetoothGatt;I)V

    return-void
.end method
