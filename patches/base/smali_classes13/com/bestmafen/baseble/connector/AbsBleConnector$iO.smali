.class public final Lcom/bestmafen/baseble/connector/AbsBleConnector$iO;
.super Landroid/bluetooth/BluetoothGattCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bestmafen/baseble/connector/AbsBleConnector;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/bestmafen/baseble/connector/AbsBleConnector;


# direct methods
.method public constructor <init>(Lcom/bestmafen/baseble/connector/AbsBleConnector;)V
    .locals 0

    iput-object p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$iO;->OXO1:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-direct {p0}, Landroid/bluetooth/BluetoothGattCallback;-><init>()V

    return-void
.end method

.method public static synthetic OXO1(Lcom/bestmafen/baseble/connector/AbsBleConnector;)V
    .locals 0

    invoke-static {p0}, Lcom/bestmafen/baseble/connector/AbsBleConnector$iO;->XIi00iiXO(Lcom/bestmafen/baseble/connector/AbsBleConnector;)V

    return-void
.end method

.method public static final XIi00iiXO(Lcom/bestmafen/baseble/connector/AbsBleConnector;)V
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->access$setMNotified$p(Lcom/bestmafen/baseble/connector/AbsBleConnector;Z)V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getMBleMessenger()Lcom/android/mltcode/paycertificationapi/iO00;

    move-result-object p0

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/iO00;->dequeueMessage()V

    return-void
.end method


# virtual methods
.method public onCharacteristicChanged(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 2

    const-string v0, "gatt"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "characteristic"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$iO;->OXO1:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {v1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getLOG_HEADER()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " onCharacteristicChanged -> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getValue()[B

    move-result-object v1

    invoke-static {v1}, Lcom/bestmafen/baseble/data/ByteArrayExtKt;->getMHexString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XO0O10(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$iO;->OXO1:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {p1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getMBleParser()Lcom/android/mltcode/paycertificationapi/OIXOI;

    move-result-object p1

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getValue()[B

    move-result-object p2

    const-string v0, "getValue(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p2}, Lcom/android/mltcode/paycertificationapi/OIXOI;->onReceive([B)[B

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$iO;->OXO1:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {p2}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getMBleGattCallback()Lcom/android/mltcode/paycertificationapi/XX0XO01i;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-interface {p2, p1}, Lcom/android/mltcode/paycertificationapi/XX0XO01i;->onCharacteristicChanged([B)V

    :cond_0
    return-void
.end method

.method public onCharacteristicRead(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V
    .locals 4

    const-string p3, "gatt"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "characteristic"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getValue()[B

    move-result-object p1

    const/4 p3, 0x0

    invoke-virtual {p2, p3}, Landroid/bluetooth/BluetoothGattCharacteristic;->getStringValue(I)Ljava/lang/String;

    move-result-object p3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$iO;->OXO1:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {v2}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getLOG_HEADER()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " onCharacteristicRead -> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lcom/bestmafen/baseble/data/ByteArrayExtKt;->getMHexString([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XO0O10(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$iO;->OXO1:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {v0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getMBleMessenger()Lcom/android/mltcode/paycertificationapi/iO00;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/iO00;->dequeueMessage()V

    iget-object v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$iO;->OXO1:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {v0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getMBleGattCallback()Lcom/android/mltcode/paycertificationapi/XX0XO01i;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {v0, p2, p1, p3}, Lcom/android/mltcode/paycertificationapi/XX0XO01i;->onCharacteristicRead(Ljava/lang/String;[BLjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onCharacteristicWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V
    .locals 2

    const-string v0, "gatt"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "characteristic"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$iO;->OXO1:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {p1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getDisableStreamLog()Z

    move-result p1

    if-nez p1, :cond_0

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$iO;->OXO1:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {v1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getLOG_HEADER()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " onCharacteristicWrite -> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Lcom/bestmafen/baseble/connector/AbsBleConnector;->Companion:Lcom/bestmafen/baseble/connector/AbsBleConnector$OXO1;

    invoke-virtual {v1, p3}, Lcom/bestmafen/baseble/connector/AbsBleConnector$OXO1;->iO(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, ", "

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getValue()[B

    move-result-object p3

    invoke-static {p3}, Lcom/bestmafen/baseble/data/ByteArrayExtKt;->getMHexString([B)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XO0O10(Ljava/lang/String;)V

    :cond_0
    iget-object p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$iO;->OXO1:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {p1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getMBleMessenger()Lcom/android/mltcode/paycertificationapi/iO00;

    move-result-object p1

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/iO00;->dequeueWritePacket()V

    iget-object p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$iO;->OXO1:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {p1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getMBleGattCallback()Lcom/android/mltcode/paycertificationapi/XX0XO01i;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object p3

    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getValue()[B

    move-result-object p2

    const-string v0, "getValue(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p3, p2}, Lcom/android/mltcode/paycertificationapi/XX0XO01i;->onCharacteristicWrite(Ljava/lang/String;[B)V

    :cond_1
    return-void
.end method

.method public onConnectionStateChange(Landroid/bluetooth/BluetoothGatt;II)V
    .locals 6

    const-string v0, "gatt"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-nez p2, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    const/4 v3, 0x2

    if-ne p3, v3, :cond_1

    move v3, v0

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    if-eqz v2, :cond_2

    if-eqz v3, :cond_2

    move v2, v0

    goto :goto_2

    :cond_2
    move v2, v1

    :goto_2
    sget-object v3, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$iO;->OXO1:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {v5}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getLOG_HEADER()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " onConnectionStateChange -> "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v5, ", status="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v5, Lcom/bestmafen/baseble/connector/AbsBleConnector;->Companion:Lcom/bestmafen/baseble/connector/AbsBleConnector$OXO1;

    invoke-virtual {v5, p2}, Lcom/bestmafen/baseble/connector/AbsBleConnector$OXO1;->iO(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ", newState="

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p3}, Lcom/bestmafen/baseble/connector/AbsBleConnector$OXO1;->XIi00iiXO(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v3, p2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XO0O10(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$iO;->OXO1:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {p2}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getMBleMessenger()Lcom/android/mltcode/paycertificationapi/iO00;

    move-result-object p2

    invoke-virtual {p2}, Lcom/android/mltcode/paycertificationapi/iO00;->reset()V

    iget-object p2, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$iO;->OXO1:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {p2}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getMBleParser()Lcom/android/mltcode/paycertificationapi/OIXOI;

    move-result-object p2

    invoke-interface {p2}, Lcom/android/mltcode/paycertificationapi/OIXOI;->reset()V

    if-eqz v2, :cond_4

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->discoverServices()Z

    iget-object p2, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$iO;->OXO1:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {p2, v1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->connect(Z)V

    iget-object p2, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$iO;->OXO1:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {p2}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getMBluetoothGatt()Landroid/bluetooth/BluetoothGatt;

    move-result-object p2

    if-nez p2, :cond_3

    iget-object p2, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$iO;->OXO1:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {p2, p1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->setMBluetoothGatt(Landroid/bluetooth/BluetoothGatt;)V

    :cond_3
    iget-object p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$iO;->OXO1:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {p1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getMBleGattCallback()Lcom/android/mltcode/paycertificationapi/XX0XO01i;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-interface {p1, v0}, Lcom/android/mltcode/paycertificationapi/XX0XO01i;->onConnectionStateChange(Z)V

    return-void

    :cond_4
    iget-object p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$iO;->OXO1:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {p1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->isAutoReconnect()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$iO;->OXO1:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-static {p1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->access$getMNotified$p(Lcom/bestmafen/baseble/connector/AbsBleConnector;)Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$iO;->OXO1:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {p1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getMBleGattCallback()Lcom/android/mltcode/paycertificationapi/XX0XO01i;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-interface {p1, v1}, Lcom/android/mltcode/paycertificationapi/XX0XO01i;->onConnectionStateChange(Z)V

    :cond_5
    iget-object p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$iO;->OXO1:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {p1, v0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->connect(Z)V

    return-void

    :cond_6
    iget-object p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$iO;->OXO1:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {p1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getMBleGattCallback()Lcom/android/mltcode/paycertificationapi/XX0XO01i;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-interface {p1, v1}, Lcom/android/mltcode/paycertificationapi/XX0XO01i;->onConnectionStateChange(Z)V

    :cond_7
    return-void
.end method

.method public onDescriptorWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V
    .locals 2

    const-string p3, "gatt"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "descriptor"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p3, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$iO;->OXO1:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {p3}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getLOG_HEADER()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " -> onDescriptorWrite"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XO0O10(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$iO;->OXO1:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {p1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getMHandler()Landroid/os/Handler;

    move-result-object p1

    iget-object p2, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$iO;->OXO1:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    new-instance p3, Lcom/android/mltcode/paycertificationapi/XIi10;

    invoke-direct {p3, p2}, Lcom/android/mltcode/paycertificationapi/XIi10;-><init>(Lcom/bestmafen/baseble/connector/AbsBleConnector;)V

    const-wide/16 v0, 0x3e8

    invoke-virtual {p1, p3, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public onMtuChanged(Landroid/bluetooth/BluetoothGatt;II)V
    .locals 1

    const-string p3, "gatt"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$iO;->OXO1:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {v0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getLOG_HEADER()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " onMtuChanged -> mtu="

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XO0O10(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$iO;->OXO1:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-static {p1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->access$getMNotified$p(Lcom/bestmafen/baseble/connector/AbsBleConnector;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$iO;->OXO1:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {p1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getMBleMessenger()Lcom/android/mltcode/paycertificationapi/iO00;

    move-result-object p1

    add-int/lit8 p2, p2, -0x3

    invoke-virtual {p1, p2}, Lcom/android/mltcode/paycertificationapi/iO00;->setMPacketSize(I)V

    iget-object p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$iO;->OXO1:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {p1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getMBleMessenger()Lcom/android/mltcode/paycertificationapi/iO00;

    move-result-object p1

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/iO00;->dequeueMessage()V

    iget-object p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$iO;->OXO1:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {p1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getMBleGattCallback()Lcom/android/mltcode/paycertificationapi/XX0XO01i;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p1}, Lcom/android/mltcode/paycertificationapi/XX0XO01i;->onMtuChanged()V

    :cond_1
    :goto_0
    return-void
.end method

.method public onServicesDiscovered(Landroid/bluetooth/BluetoothGatt;I)V
    .locals 6

    const-string p2, "gatt"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$iO;->OXO1:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {v0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getLOG_HEADER()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " -> onServicesDiscovered"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XO0O10(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$iO;->OXO1:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {p1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getMBleMessenger()Lcom/android/mltcode/paycertificationapi/iO00;

    move-result-object p1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ib1;

    iget-object p2, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$iO;->OXO1:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {p2}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getMService()Ljava/lang/String;

    move-result-object v1

    iget-object p2, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$iO;->OXO1:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {p2}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getMNotify()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/ib1;-><init>(Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/iO00;->enqueueMessage(Lcom/android/mltcode/paycertificationapi/X01O0O1;)V

    iget-object p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$iO;->OXO1:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {p1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getMBleMessenger()Lcom/android/mltcode/paycertificationapi/iO00;

    move-result-object p1

    new-instance p2, Lcom/android/mltcode/paycertificationapi/nk3;

    iget-object v0, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$iO;->OXO1:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {v0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getMMtu()I

    move-result v0

    invoke-direct {p2, v0}, Lcom/android/mltcode/paycertificationapi/nk3;-><init>(I)V

    invoke-virtual {p1, p2}, Lcom/android/mltcode/paycertificationapi/iO00;->enqueueMessage(Lcom/android/mltcode/paycertificationapi/X01O0O1;)V

    return-void
.end method
