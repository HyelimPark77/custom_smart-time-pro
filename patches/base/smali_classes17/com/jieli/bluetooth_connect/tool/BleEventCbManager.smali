.class public Lcom/jieli/bluetooth_connect/tool/BleEventCbManager;
.super Lcom/jieli/bluetooth_connect/tool/BaseCbManager;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/jieli/bluetooth_connect/tool/BaseCbManager<",
        "Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtBleListener;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/bluetooth_connect/tool/BaseCbManager;-><init>()V

    return-void
.end method

.method public static synthetic I0IIOi(Landroid/bluetooth/BluetoothGatt;IIILcom/jieli/bluetooth_connect/interfaces/listener/OnBtBleListener;)V
    .locals 0

    invoke-virtual {p4, p0, p1, p2, p3}, Landroid/bluetooth/BluetoothGattCallback;->onPhyRead(Landroid/bluetooth/BluetoothGatt;III)V

    return-void
.end method

.method public static synthetic I0iXXO(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;ILcom/jieli/bluetooth_connect/interfaces/listener/OnBtBleListener;)V
    .locals 0

    invoke-virtual {p3, p0, p1, p2}, Landroid/bluetooth/BluetoothGattCallback;->onDescriptorWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V

    return-void
.end method

.method public static synthetic I1XOi1(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;[BLcom/jieli/bluetooth_connect/interfaces/listener/OnBtBleListener;)V
    .locals 0

    invoke-virtual {p4, p0, p1, p2, p3}, Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtBleListener;->onBleDataNotify(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;[B)V

    return-void
.end method

.method public static synthetic IIX1OXO(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtBleListener;)V
    .locals 0

    invoke-virtual {p1, p0}, Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtBleListener;->onSwitchBleDevice(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public static synthetic IO(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/bluetooth_connect/interfaces/listener/OnBtBleListener;)V
    .locals 0

    invoke-virtual {p2, p0, p1}, Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtBleListener;->onBleBond(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public static synthetic IiI10X(Landroid/bluetooth/BluetoothGatt;ILcom/jieli/bluetooth_connect/interfaces/listener/OnBtBleListener;)V
    .locals 0

    invoke-virtual {p2, p0, p1}, Landroid/bluetooth/BluetoothGattCallback;->onReliableWriteCompleted(Landroid/bluetooth/BluetoothGatt;I)V

    return-void
.end method

.method public static synthetic O00(Landroid/bluetooth/BluetoothDevice;IILcom/jieli/bluetooth_connect/interfaces/listener/OnBtBleListener;)V
    .locals 0

    invoke-virtual {p3, p0, p1, p2}, Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtBleListener;->onBleMtuChanged(Landroid/bluetooth/BluetoothDevice;II)V

    return-void
.end method

.method public static synthetic O10IXXX0X(Landroid/bluetooth/BluetoothGatt;ILcom/jieli/bluetooth_connect/interfaces/listener/OnBtBleListener;)V
    .locals 0

    invoke-virtual {p2, p0, p1}, Landroid/bluetooth/BluetoothGattCallback;->onServicesDiscovered(Landroid/bluetooth/BluetoothGatt;I)V

    return-void
.end method

.method public static synthetic OIX0iXi(Landroid/bluetooth/BluetoothGatt;IIIILcom/jieli/bluetooth_connect/interfaces/listener/OnBtBleListener;)V
    .locals 1

    move v0, p1

    move-object p1, p0

    move-object p0, p5

    move p5, p4

    move p4, p3

    move p3, p2

    move p2, v0

    invoke-virtual/range {p0 .. p5}, Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtBleListener;->onConnectionUpdatedCallback(Landroid/bluetooth/BluetoothGatt;IIII)V

    return-void
.end method

.method public static synthetic OIi0(Landroid/bluetooth/BluetoothGatt;IILcom/jieli/bluetooth_connect/interfaces/listener/OnBtBleListener;)V
    .locals 0

    invoke-virtual {p3, p0, p1, p2}, Landroid/bluetooth/BluetoothGattCallback;->onReadRemoteRssi(Landroid/bluetooth/BluetoothGatt;II)V

    return-void
.end method

.method public static synthetic OXO1(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;ILcom/jieli/bluetooth_connect/interfaces/listener/OnBtBleListener;)V
    .locals 0

    invoke-virtual {p3, p0, p1, p2}, Landroid/bluetooth/BluetoothGattCallback;->onDescriptorRead(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V

    return-void
.end method

.method public static synthetic X0O(Landroid/bluetooth/BluetoothGatt;IILcom/jieli/bluetooth_connect/interfaces/listener/OnBtBleListener;)V
    .locals 0

    invoke-virtual {p3, p0, p1, p2}, Landroid/bluetooth/BluetoothGattCallback;->onMtuChanged(Landroid/bluetooth/BluetoothGatt;II)V

    return-void
.end method

.method public static synthetic X1ii(Landroid/bluetooth/BluetoothGatt;IIILcom/jieli/bluetooth_connect/interfaces/listener/OnBtBleListener;)V
    .locals 0

    invoke-virtual {p4, p0, p1, p2, p3}, Landroid/bluetooth/BluetoothGattCallback;->onPhyUpdate(Landroid/bluetooth/BluetoothGatt;III)V

    return-void
.end method

.method public static synthetic XIi00iiXO(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;ILcom/jieli/bluetooth_connect/interfaces/listener/OnBtBleListener;)V
    .locals 0

    invoke-virtual {p3, p0, p1, p2}, Landroid/bluetooth/BluetoothGattCallback;->onCharacteristicWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V

    return-void
.end method

.method public static synthetic XO0O10(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;ZLcom/jieli/bluetooth_connect/interfaces/listener/OnBtBleListener;)V
    .locals 0

    invoke-virtual {p4, p0, p1, p2, p3}, Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtBleListener;->onBleNotificationStatus(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;Z)V

    return-void
.end method

.method public static synthetic XOO0ii0(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;ILcom/jieli/bluetooth_connect/interfaces/listener/OnBtBleListener;)V
    .locals 0

    invoke-virtual {p3, p0, p1, p2}, Landroid/bluetooth/BluetoothGattCallback;->onCharacteristicRead(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V

    return-void
.end method

.method public static synthetic XX0(Landroid/bluetooth/BluetoothGatt;Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtBleListener;)V
    .locals 0

    invoke-static {p1, p0}, Lcom/android/mltcode/paycertificationapi/O0OIIX;->OXO1(Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtBleListener;Landroid/bluetooth/BluetoothGatt;)V

    return-void
.end method

.method public static synthetic XXI(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/bluetooth_connect/interfaces/listener/OnBtBleListener;)V
    .locals 0

    invoke-virtual {p2, p0, p1}, Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtBleListener;->onBleConnection(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public static synthetic XiOIO(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;[BILcom/jieli/bluetooth_connect/interfaces/listener/OnBtBleListener;)V
    .locals 1

    move-object v0, p1

    move-object p1, p0

    move-object p0, p5

    move p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, v0

    invoke-virtual/range {p0 .. p5}, Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtBleListener;->onBleWriteStatus(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;[BI)V

    return-void
.end method

.method public static synthetic iIiiO(Landroid/bluetooth/BluetoothGatt;IILcom/jieli/bluetooth_connect/interfaces/listener/OnBtBleListener;)V
    .locals 0

    invoke-virtual {p3, p0, p1, p2}, Landroid/bluetooth/BluetoothGattCallback;->onConnectionStateChange(Landroid/bluetooth/BluetoothGatt;II)V

    return-void
.end method

.method public static synthetic iO(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtBleListener;)V
    .locals 0

    invoke-virtual {p2, p0, p1}, Landroid/bluetooth/BluetoothGattCallback;->onCharacteristicChanged(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic addListener(Ljava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000
        }
        names = {
            "listener"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/jieli/bluetooth_connect/tool/BaseCbManager;->addListener(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000
        }
        names = {
            "impl"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/jieli/bluetooth_connect/tool/BaseCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

    return-void
.end method

.method public bridge synthetic destroy()V
    .locals 0

    invoke-super {p0}, Lcom/jieli/bluetooth_connect/tool/BaseCbManager;->destroy()V

    return-void
.end method

.method public onBleBond(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "device",
            "bondStatus"
        }
    .end annotation

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i0XXiIIX;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/i0XXiIIX;-><init>(Landroid/bluetooth/BluetoothDevice;I)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/BleEventCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

    return-void
.end method

.method public onBleConnection(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 1
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

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XIIIOX;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/XIIIOX;-><init>(Landroid/bluetooth/BluetoothDevice;I)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/BleEventCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

    return-void
.end method

.method public onBleDataNotify(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;[B)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "device",
            "serviceUuid",
            "characteristicsUuid",
            "data"
        }
    .end annotation

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XX1OO;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/android/mltcode/paycertificationapi/XX1OO;-><init>(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;[B)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/BleEventCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

    return-void
.end method

.method public onBleMtuChanged(Landroid/bluetooth/BluetoothDevice;II)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "device",
            "block",
            "status"
        }
    .end annotation

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I1110;

    invoke-direct {v0, p1, p2, p3}, Lcom/android/mltcode/paycertificationapi/I1110;-><init>(Landroid/bluetooth/BluetoothDevice;II)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/BleEventCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

    return-void
.end method

.method public onBleNotificationStatus(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "device",
            "serviceUuid",
            "characteristicUuid",
            "bEnabled"
        }
    .end annotation

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OXIO1Oi01;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/android/mltcode/paycertificationapi/OXIO1Oi01;-><init>(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;Z)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/BleEventCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

    return-void
.end method

.method public onBleWriteStatus(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;[BI)V
    .locals 6
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "device",
            "serviceUuid",
            "characteristicsUuid",
            "data",
            "status"
        }
    .end annotation

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I1iO0i;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/I1iO0i;-><init>(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;[BI)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/BleEventCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

    return-void
.end method

.method public onCharacteristicChanged(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 1
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

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XIiIX;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/XIiIX;-><init>(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/BleEventCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

    return-void
.end method

.method public onCharacteristicRead(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V
    .locals 1
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

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O0IIOIIi1;

    invoke-direct {v0, p1, p2, p3}, Lcom/android/mltcode/paycertificationapi/O0IIOIIi1;-><init>(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/BleEventCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

    return-void
.end method

.method public onCharacteristicWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V
    .locals 1
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

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O1iii0;

    invoke-direct {v0, p1, p2, p3}, Lcom/android/mltcode/paycertificationapi/O1iii0;-><init>(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/BleEventCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

    return-void
.end method

.method public onConnectionStateChange(Landroid/bluetooth/BluetoothGatt;II)V
    .locals 1
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

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IOiI1OI;

    invoke-direct {v0, p1, p2, p3}, Lcom/android/mltcode/paycertificationapi/IOiI1OI;-><init>(Landroid/bluetooth/BluetoothGatt;II)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/BleEventCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

    return-void
.end method

.method public onConnectionUpdatedCallback(Landroid/bluetooth/BluetoothGatt;IIII)V
    .locals 6
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
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

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XOi1OIiO;

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/XOi1OIiO;-><init>(Landroid/bluetooth/BluetoothGatt;IIII)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/BleEventCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

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

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X1O0i1iI;

    invoke-direct {v0, p1, p2, p3}, Lcom/android/mltcode/paycertificationapi/X1O0i1iI;-><init>(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/BleEventCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

    return-void
.end method

.method public onDescriptorWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V
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

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X00;

    invoke-direct {v0, p1, p2, p3}, Lcom/android/mltcode/paycertificationapi/X00;-><init>(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/BleEventCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

    return-void
.end method

.method public onMtuChanged(Landroid/bluetooth/BluetoothGatt;II)V
    .locals 1
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

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OOIOO0X;

    invoke-direct {v0, p1, p2, p3}, Lcom/android/mltcode/paycertificationapi/OOIOO0X;-><init>(Landroid/bluetooth/BluetoothGatt;II)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/BleEventCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

    return-void
.end method

.method public onPhyRead(Landroid/bluetooth/BluetoothGatt;III)V
    .locals 1
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

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OOI1;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/android/mltcode/paycertificationapi/OOI1;-><init>(Landroid/bluetooth/BluetoothGatt;III)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/BleEventCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

    return-void
.end method

.method public onPhyUpdate(Landroid/bluetooth/BluetoothGatt;III)V
    .locals 1
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

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i1I1IXX;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/android/mltcode/paycertificationapi/i1I1IXX;-><init>(Landroid/bluetooth/BluetoothGatt;III)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/BleEventCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

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

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X0OX;

    invoke-direct {v0, p1, p2, p3}, Lcom/android/mltcode/paycertificationapi/X0OX;-><init>(Landroid/bluetooth/BluetoothGatt;II)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/BleEventCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

    return-void
.end method

.method public onReliableWriteCompleted(Landroid/bluetooth/BluetoothGatt;I)V
    .locals 1
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

    new-instance v0, Lcom/android/mltcode/paycertificationapi/Xi1iii1I0;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/Xi1iii1I0;-><init>(Landroid/bluetooth/BluetoothGatt;I)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/BleEventCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

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

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I0iI1;

    invoke-direct {v0, p1}, Lcom/android/mltcode/paycertificationapi/I0iI1;-><init>(Landroid/bluetooth/BluetoothGatt;)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/BleEventCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

    return-void
.end method

.method public onServicesDiscovered(Landroid/bluetooth/BluetoothGatt;I)V
    .locals 1
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

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i01X0;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/i01X0;-><init>(Landroid/bluetooth/BluetoothGatt;I)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/BleEventCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

    return-void
.end method

.method public onSwitchBleDevice(Landroid/bluetooth/BluetoothDevice;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X1O10XOOX;

    invoke-direct {v0, p1}, Lcom/android/mltcode/paycertificationapi/X1O10XOOX;-><init>(Landroid/bluetooth/BluetoothDevice;)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/BleEventCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

    return-void
.end method

.method public bridge synthetic removeListener(Ljava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000
        }
        names = {
            "listener"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/jieli/bluetooth_connect/tool/BaseCbManager;->removeListener(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
