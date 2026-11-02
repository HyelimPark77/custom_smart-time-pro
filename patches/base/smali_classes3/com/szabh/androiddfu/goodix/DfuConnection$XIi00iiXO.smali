.class public Lcom/szabh/androiddfu/goodix/DfuConnection$XIi00iiXO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/iIIII0XX;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/szabh/androiddfu/goodix/DfuConnection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/szabh/androiddfu/goodix/DfuConnection;


# direct methods
.method public constructor <init>(Lcom/szabh/androiddfu/goodix/DfuConnection;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, Lcom/szabh/androiddfu/goodix/DfuConnection$XIi00iiXO;->OXO1:Lcom/szabh/androiddfu/goodix/DfuConnection;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public I0IIOi(Landroid/bluetooth/BluetoothGatt;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onBleServicesDiscovered() called with: gatt = ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "GoodixDfu"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lcom/szabh/androiddfu/goodix/DfuConnection;->O00()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/bluetooth/BluetoothGatt;->getService(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattService;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/szabh/androiddfu/goodix/DfuConnection$XIi00iiXO;->OXO1:Lcom/szabh/androiddfu/goodix/DfuConnection;

    invoke-static {}, Lcom/szabh/androiddfu/goodix/DfuConnection;->I0IIOi()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/bluetooth/BluetoothGattService;->getCharacteristic(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/szabh/androiddfu/goodix/DfuConnection;->XOO0ii0(Lcom/szabh/androiddfu/goodix/DfuConnection;Landroid/bluetooth/BluetoothGattCharacteristic;)Landroid/bluetooth/BluetoothGattCharacteristic;

    iget-object v0, p0, Lcom/szabh/androiddfu/goodix/DfuConnection$XIi00iiXO;->OXO1:Lcom/szabh/androiddfu/goodix/DfuConnection;

    invoke-static {}, Lcom/szabh/androiddfu/goodix/DfuConnection;->OIi0()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/bluetooth/BluetoothGattService;->getCharacteristic(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/szabh/androiddfu/goodix/DfuConnection;->iO(Lcom/szabh/androiddfu/goodix/DfuConnection;Landroid/bluetooth/BluetoothGattCharacteristic;)Landroid/bluetooth/BluetoothGattCharacteristic;

    :cond_0
    iget-object p1, p0, Lcom/szabh/androiddfu/goodix/DfuConnection$XIi00iiXO;->OXO1:Lcom/szabh/androiddfu/goodix/DfuConnection;

    invoke-static {p1}, Lcom/szabh/androiddfu/goodix/DfuConnection;->IiI10X(Lcom/szabh/androiddfu/goodix/DfuConnection;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/szabh/androiddfu/goodix/DfuConnection$XIi00iiXO;->OXO1:Lcom/szabh/androiddfu/goodix/DfuConnection;

    invoke-static {p1}, Lcom/szabh/androiddfu/goodix/DfuConnection;->XIi00iiXO(Lcom/szabh/androiddfu/goodix/DfuConnection;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/szabh/androiddfu/goodix/DfuConnection$XIi00iiXO;->OXO1:Lcom/szabh/androiddfu/goodix/DfuConnection;

    invoke-static {p1}, Lcom/szabh/androiddfu/goodix/DfuConnection;->XO0O10(Lcom/szabh/androiddfu/goodix/DfuConnection;)Lcom/android/mltcode/paycertificationapi/OIO1Xii1;

    move-result-object p1

    iget-object v0, p0, Lcom/szabh/androiddfu/goodix/DfuConnection$XIi00iiXO;->OXO1:Lcom/szabh/androiddfu/goodix/DfuConnection;

    invoke-static {v0}, Lcom/szabh/androiddfu/goodix/DfuConnection;->IiI10X(Lcom/szabh/androiddfu/goodix/DfuConnection;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/OIO1Xii1;->I0iXXO(Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    iget-object p1, p0, Lcom/szabh/androiddfu/goodix/DfuConnection$XIi00iiXO;->OXO1:Lcom/szabh/androiddfu/goodix/DfuConnection;

    invoke-static {p1}, Lcom/szabh/androiddfu/goodix/DfuConnection;->OXO1(Lcom/szabh/androiddfu/goodix/DfuConnection;)Landroidx/lifecycle/MutableLiveData;

    move-result-object p1

    sget-object v0, Lcom/szabh/androiddfu/goodix/DfuConnection$ConnState;->INIT:Lcom/szabh/androiddfu/goodix/DfuConnection$ConnState;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    return-void

    :cond_1
    iget-object p1, p0, Lcom/szabh/androiddfu/goodix/DfuConnection$XIi00iiXO;->OXO1:Lcom/szabh/androiddfu/goodix/DfuConnection;

    invoke-static {p1}, Lcom/szabh/androiddfu/goodix/DfuConnection;->IO(Lcom/szabh/androiddfu/goodix/DfuConnection;)Landroidx/lifecycle/MutableLiveData;

    move-result-object p1

    const-string v0, "Device Not Support"

    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/szabh/androiddfu/goodix/DfuConnection$XIi00iiXO;->OXO1:Lcom/szabh/androiddfu/goodix/DfuConnection;

    invoke-virtual {p1}, Lcom/szabh/androiddfu/goodix/DfuConnection;->IIX1OXO()V

    return-void
.end method

.method public IiI10X()V
    .locals 2

    const-string v0, "GoodixDfu"

    const-string v1, "onBleConnected() called"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/szabh/androiddfu/goodix/DfuConnection$XIi00iiXO;->OXO1:Lcom/szabh/androiddfu/goodix/DfuConnection;

    invoke-static {v0}, Lcom/szabh/androiddfu/goodix/DfuConnection;->OXO1(Lcom/szabh/androiddfu/goodix/DfuConnection;)Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    sget-object v1, Lcom/szabh/androiddfu/goodix/DfuConnection$ConnState;->CONNECTED:Lcom/szabh/androiddfu/goodix/DfuConnection$ConnState;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    return-void
.end method

.method public O00(Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onBleCharacteristicWriteComplete() called with: characteristic = ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getValue()[B

    move-result-object p1

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/X1O1O;->IiI10X([B)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "GoodixDfu"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/szabh/androiddfu/goodix/DfuConnection$XIi00iiXO;->OXO1:Lcom/szabh/androiddfu/goodix/DfuConnection;

    invoke-static {p1}, Lcom/szabh/androiddfu/goodix/DfuConnection;->OIX0iXi(Lcom/szabh/androiddfu/goodix/DfuConnection;)Lcom/goodix/ble/gr/libdfu/EasyDfu;

    move-result-object p1

    invoke-virtual {p1}, Lcom/goodix/ble/gr/libdfu/EasyDfu;->onSentPduSegment()V

    return-void
.end method

.method public OIi0()V
    .locals 4

    const-string v0, "GoodixDfu"

    const-string v1, "onBleNotifyEnable() called"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/szabh/androiddfu/goodix/DfuConnection$XIi00iiXO;->OXO1:Lcom/szabh/androiddfu/goodix/DfuConnection;

    invoke-static {v0}, Lcom/szabh/androiddfu/goodix/DfuConnection;->I0iXXO(Lcom/szabh/androiddfu/goodix/DfuConnection;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/szabh/androiddfu/goodix/DfuConnection$XIi00iiXO$OXO1;

    invoke-direct {v1, p0}, Lcom/szabh/androiddfu/goodix/DfuConnection$XIi00iiXO$OXO1;-><init>(Lcom/szabh/androiddfu/goodix/DfuConnection$XIi00iiXO;)V

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public OXO1(Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onBleCharacteristicNotify() called with: characteristic = ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getValue()[B

    move-result-object v1

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/X1O1O;->IiI10X([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "GoodixDfu"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/szabh/androiddfu/goodix/DfuConnection$XIi00iiXO;->OXO1:Lcom/szabh/androiddfu/goodix/DfuConnection;

    invoke-static {v0}, Lcom/szabh/androiddfu/goodix/DfuConnection;->IiI10X(Lcom/szabh/androiddfu/goodix/DfuConnection;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/szabh/androiddfu/goodix/DfuConnection$XIi00iiXO;->OXO1:Lcom/szabh/androiddfu/goodix/DfuConnection;

    invoke-static {v0}, Lcom/szabh/androiddfu/goodix/DfuConnection;->OIX0iXi(Lcom/szabh/androiddfu/goodix/DfuConnection;)Lcom/goodix/ble/gr/libdfu/EasyDfu;

    move-result-object v0

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getValue()[B

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/goodix/ble/gr/libdfu/EasyDfu;->onRcvPduSegment([B)V

    :cond_0
    return-void
.end method

.method public XIi00iiXO(Ljava/lang/String;)V
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onBleTimeOut() called with: type = ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "]"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v3, "GoodixDfu"

    invoke-static {v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/szabh/androiddfu/goodix/DfuConnection$XIi00iiXO;->OXO1:Lcom/szabh/androiddfu/goodix/DfuConnection;

    invoke-static {v0}, Lcom/szabh/androiddfu/goodix/DfuConnection;->IO(Lcom/szabh/androiddfu/goodix/DfuConnection;)Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    return-void
.end method

.method public XO0O10(Ljava/lang/String;I)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onBleError() called with: message = ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "], errorCode = ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "]"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "GoodixDfu"

    invoke-static {v0, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p2, p0, Lcom/szabh/androiddfu/goodix/DfuConnection$XIi00iiXO;->OXO1:Lcom/szabh/androiddfu/goodix/DfuConnection;

    invoke-static {p2}, Lcom/szabh/androiddfu/goodix/DfuConnection;->IO(Lcom/szabh/androiddfu/goodix/DfuConnection;)Landroidx/lifecycle/MutableLiveData;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    return-void
.end method

.method public XOO0ii0(I)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onBleMtuChanged() called with: mtu = ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "GoodixDfu"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/szabh/androiddfu/goodix/DfuConnection$XIi00iiXO;->OXO1:Lcom/szabh/androiddfu/goodix/DfuConnection;

    invoke-static {v0}, Lcom/szabh/androiddfu/goodix/DfuConnection;->OIX0iXi(Lcom/szabh/androiddfu/goodix/DfuConnection;)Lcom/goodix/ble/gr/libdfu/EasyDfu;

    move-result-object v0

    add-int/lit8 p1, p1, -0x3

    invoke-virtual {v0, p1}, Lcom/goodix/ble/gr/libdfu/EasyDfu;->setMaxSegmentSize(I)V

    iget-object p1, p0, Lcom/szabh/androiddfu/goodix/DfuConnection$XIi00iiXO;->OXO1:Lcom/szabh/androiddfu/goodix/DfuConnection;

    invoke-static {p1}, Lcom/szabh/androiddfu/goodix/DfuConnection;->OXO1(Lcom/szabh/androiddfu/goodix/DfuConnection;)Landroidx/lifecycle/MutableLiveData;

    move-result-object p1

    sget-object v0, Lcom/szabh/androiddfu/goodix/DfuConnection$ConnState;->READY:Lcom/szabh/androiddfu/goodix/DfuConnection$ConnState;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    return-void
.end method

.method public iO()V
    .locals 2

    const-string v0, "GoodixDfu"

    const-string v1, "onBleDisconnected() called"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/szabh/androiddfu/goodix/DfuConnection$XIi00iiXO;->OXO1:Lcom/szabh/androiddfu/goodix/DfuConnection;

    invoke-static {v0}, Lcom/szabh/androiddfu/goodix/DfuConnection;->OXO1(Lcom/szabh/androiddfu/goodix/DfuConnection;)Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    sget-object v1, Lcom/szabh/androiddfu/goodix/DfuConnection$ConnState;->DISCONNECTED:Lcom/szabh/androiddfu/goodix/DfuConnection$ConnState;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    return-void
.end method
