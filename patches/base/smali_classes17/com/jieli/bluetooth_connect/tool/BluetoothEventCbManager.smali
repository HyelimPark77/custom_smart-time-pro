.class public Lcom/jieli/bluetooth_connect/tool/BluetoothEventCbManager;
.super Lcom/jieli/bluetooth_connect/tool/BaseCbManager;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/bluetooth_connect/interfaces/callback/IBluetoothEventCallback;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/jieli/bluetooth_connect/tool/BaseCbManager<",
        "Lcom/jieli/bluetooth_connect/interfaces/callback/IBluetoothEventCallback;",
        ">;",
        "Lcom/jieli/bluetooth_connect/interfaces/callback/IBluetoothEventCallback;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/bluetooth_connect/tool/BaseCbManager;-><init>()V

    return-void
.end method

.method public static synthetic I0IIOi(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/bluetooth_connect/interfaces/callback/IBluetoothEventCallback;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lcom/jieli/bluetooth_connect/interfaces/callback/IBluetoothEventCallback;->onHfpStatus(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public static synthetic I0iXXO(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;ZLcom/jieli/bluetooth_connect/interfaces/callback/IBluetoothEventCallback;)V
    .locals 0

    invoke-interface {p4, p0, p1, p2, p3}, Lcom/jieli/bluetooth_connect/interfaces/callback/IBluetoothEventCallback;->onBleNotificationStatus(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;Z)V

    return-void
.end method

.method public static synthetic I1XOi1(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/bluetooth_connect/interfaces/callback/IBluetoothEventCallback;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lcom/jieli/bluetooth_connect/interfaces/callback/IBluetoothEventCallback;->onConnection(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public static synthetic IIX1OXO(Lcom/jieli/bluetooth_connect/bean/ErrorInfo;Lcom/jieli/bluetooth_connect/interfaces/callback/IBluetoothEventCallback;)V
    .locals 0

    invoke-interface {p1, p0}, Lcom/jieli/bluetooth_connect/interfaces/callback/IBluetoothEventCallback;->onError(Lcom/jieli/bluetooth_connect/bean/ErrorInfo;)V

    return-void
.end method

.method public static synthetic IO(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;[BLcom/jieli/bluetooth_connect/interfaces/callback/IBluetoothEventCallback;)V
    .locals 0

    invoke-interface {p4, p0, p1, p2, p3}, Lcom/jieli/bluetooth_connect/interfaces/callback/IBluetoothEventCallback;->onBleDataNotification(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;[B)V

    return-void
.end method

.method public static synthetic IiI10X(Landroid/bluetooth/BluetoothGatt;IIIILcom/jieli/bluetooth_connect/interfaces/callback/IBluetoothEventCallback;)V
    .locals 1

    move v0, p1

    move-object p1, p0

    move-object p0, p5

    move p5, p4

    move p4, p3

    move p3, p2

    move p2, v0

    invoke-interface/range {p0 .. p5}, Lcom/jieli/bluetooth_connect/interfaces/callback/IBluetoothEventCallback;->onConnectionUpdated(Landroid/bluetooth/BluetoothGatt;IIII)V

    return-void
.end method

.method public static synthetic O00(Landroid/bluetooth/BluetoothDevice;IILcom/jieli/bluetooth_connect/interfaces/callback/IBluetoothEventCallback;)V
    .locals 0

    invoke-interface {p3, p0, p1, p2}, Lcom/jieli/bluetooth_connect/interfaces/callback/IBluetoothEventCallback;->onBleDataBlockChanged(Landroid/bluetooth/BluetoothDevice;II)V

    return-void
.end method

.method public static synthetic O10IXXX0X(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/interfaces/callback/IBluetoothEventCallback;)V
    .locals 0

    invoke-interface {p1, p0}, Lcom/jieli/bluetooth_connect/interfaces/callback/IBluetoothEventCallback;->onSwitchConnectedDevice(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public static synthetic OIX0iXi(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;Lcom/jieli/bluetooth_connect/interfaces/callback/IBluetoothEventCallback;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lcom/jieli/bluetooth_connect/interfaces/callback/IBluetoothEventCallback;->onShowDialog(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;)V

    return-void
.end method

.method public static synthetic OIi0(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/bluetooth_connect/interfaces/callback/IBluetoothEventCallback;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lcom/jieli/bluetooth_connect/interfaces/callback/IBluetoothEventCallback;->onA2dpStatus(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public static synthetic OXO1(ZZLcom/jieli/bluetooth_connect/interfaces/callback/IBluetoothEventCallback;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lcom/jieli/bluetooth_connect/interfaces/callback/IBluetoothEventCallback;->onDiscoveryStatus(ZZ)V

    return-void
.end method

.method public static synthetic OiIIX101O(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/bluetooth_connect/interfaces/callback/IBluetoothEventCallback;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lcom/jieli/bluetooth_connect/interfaces/callback/IBluetoothEventCallback;->onSppStatus(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public static synthetic X0O(ZZLcom/jieli/bluetooth_connect/interfaces/callback/IBluetoothEventCallback;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lcom/jieli/bluetooth_connect/interfaces/callback/IBluetoothEventCallback;->onAdapterStatus(ZZ)V

    return-void
.end method

.method public static synthetic X1ii(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/bluetooth_connect/interfaces/callback/IBluetoothEventCallback;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lcom/jieli/bluetooth_connect/interfaces/callback/IBluetoothEventCallback;->onBleConnection(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public static synthetic XIi00iiXO(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;[BLcom/jieli/bluetooth_connect/interfaces/callback/IBluetoothEventCallback;)V
    .locals 0

    invoke-interface {p3, p0, p1, p2}, Lcom/jieli/bluetooth_connect/interfaces/callback/IBluetoothEventCallback;->onSppDataNotification(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;[B)V

    return-void
.end method

.method public static synthetic XO0O10(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/bluetooth_connect/interfaces/callback/IBluetoothEventCallback;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lcom/jieli/bluetooth_connect/interfaces/callback/IBluetoothEventCallback;->onBondStatus(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public static synthetic XOO0ii0(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;Lcom/jieli/bluetooth_connect/interfaces/callback/IBluetoothEventCallback;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lcom/jieli/bluetooth_connect/interfaces/callback/IBluetoothEventCallback;->onDiscovery(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;)V

    return-void
.end method

.method public static synthetic XX0(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/bluetooth_connect/interfaces/callback/IBluetoothEventCallback;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lcom/jieli/bluetooth_connect/interfaces/callback/IBluetoothEventCallback;->onBtDeviceConnectStatus(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public static synthetic XXI(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;[BILcom/jieli/bluetooth_connect/interfaces/callback/IBluetoothEventCallback;)V
    .locals 1

    move-object v0, p1

    move-object p1, p0

    move-object p0, p5

    move p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, v0

    invoke-interface/range {p0 .. p5}, Lcom/jieli/bluetooth_connect/interfaces/callback/IBluetoothEventCallback;->onBleWriteStatus(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;[BI)V

    return-void
.end method

.method public static synthetic XiOIO(Landroid/bluetooth/BluetoothDevice;ILjava/util/List;Lcom/jieli/bluetooth_connect/interfaces/callback/IBluetoothEventCallback;)V
    .locals 0

    invoke-interface {p3, p0, p1, p2}, Lcom/jieli/bluetooth_connect/interfaces/callback/IBluetoothEventCallback;->onBleServiceDiscovery(Landroid/bluetooth/BluetoothDevice;ILjava/util/List;)V

    return-void
.end method

.method public static synthetic iIiiO(ILcom/jieli/bluetooth_connect/bean/history/HistoryRecord;Lcom/jieli/bluetooth_connect/interfaces/callback/IBluetoothEventCallback;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lcom/jieli/bluetooth_connect/interfaces/callback/IBluetoothEventCallback;->onHistoryRecordChange(ILcom/jieli/bluetooth_connect/bean/history/HistoryRecord;)V

    return-void
.end method

.method public static synthetic iO(Landroid/bluetooth/BluetoothDevice;[Landroid/os/ParcelUuid;Lcom/jieli/bluetooth_connect/interfaces/callback/IBluetoothEventCallback;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lcom/jieli/bluetooth_connect/interfaces/callback/IBluetoothEventCallback;->onDeviceUuidsDiscovery(Landroid/bluetooth/BluetoothDevice;[Landroid/os/ParcelUuid;)V

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

.method public onA2dpStatus(Landroid/bluetooth/BluetoothDevice;I)V
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

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i1iiO1O1;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/i1iiO1O1;-><init>(Landroid/bluetooth/BluetoothDevice;I)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/BluetoothEventCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

    return-void
.end method

.method public onAdapterStatus(ZZ)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "bEnabled",
            "bHasBle"
        }
    .end annotation

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OOI1i1;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/OOI1i1;-><init>(ZZ)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/BluetoothEventCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

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

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IOO1OIO;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/IOO1OIO;-><init>(Landroid/bluetooth/BluetoothDevice;I)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/BluetoothEventCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

    return-void
.end method

.method public onBleDataBlockChanged(Landroid/bluetooth/BluetoothDevice;II)V
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

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OiOiii00;

    invoke-direct {v0, p1, p2, p3}, Lcom/android/mltcode/paycertificationapi/OiOiii00;-><init>(Landroid/bluetooth/BluetoothDevice;II)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/BluetoothEventCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

    return-void
.end method

.method public onBleDataNotification(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;[B)V
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

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XI1IX0OIO;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/android/mltcode/paycertificationapi/XI1IX0OIO;-><init>(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;[B)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/BluetoothEventCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

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

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i11IOi0O;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/android/mltcode/paycertificationapi/i11IOi0O;-><init>(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;Z)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/BluetoothEventCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

    return-void
.end method

.method public onBleServiceDiscovery(Landroid/bluetooth/BluetoothDevice;ILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "device",
            "status",
            "services"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "I",
            "Ljava/util/List<",
            "Landroid/bluetooth/BluetoothGattService;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I0iOOO;

    invoke-direct {v0, p1, p2, p3}, Lcom/android/mltcode/paycertificationapi/I0iOOO;-><init>(Landroid/bluetooth/BluetoothDevice;ILjava/util/List;)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/BluetoothEventCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

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

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X01iI;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/X01iI;-><init>(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;[BI)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/BluetoothEventCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

    return-void
.end method

.method public onBondStatus(Landroid/bluetooth/BluetoothDevice;I)V
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

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iOOX0XII;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/iOOX0XII;-><init>(Landroid/bluetooth/BluetoothDevice;I)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/BluetoothEventCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

    return-void
.end method

.method public onBtDeviceConnectStatus(Landroid/bluetooth/BluetoothDevice;I)V
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

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IXi1i0I;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/IXi1i0I;-><init>(Landroid/bluetooth/BluetoothDevice;I)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/BluetoothEventCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

    return-void
.end method

.method public onConnection(Landroid/bluetooth/BluetoothDevice;I)V
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

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XI11;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/XI11;-><init>(Landroid/bluetooth/BluetoothDevice;I)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/BluetoothEventCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

    return-void
.end method

.method public onConnectionUpdated(Landroid/bluetooth/BluetoothGatt;IIII)V
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

    new-instance v0, Lcom/android/mltcode/paycertificationapi/Oi0OO;

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/Oi0OO;-><init>(Landroid/bluetooth/BluetoothGatt;IIII)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/BluetoothEventCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

    return-void
.end method

.method public onDeviceUuidsDiscovery(Landroid/bluetooth/BluetoothDevice;[Landroid/os/ParcelUuid;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "device",
            "uuids"
        }
    .end annotation

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XXOI1I;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/XXOI1I;-><init>(Landroid/bluetooth/BluetoothDevice;[Landroid/os/ParcelUuid;)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/BluetoothEventCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

    return-void
.end method

.method public onDiscovery(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "device",
            "bleScanMessage"
        }
    .end annotation

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iXIi1XII;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/iXIi1XII;-><init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/BluetoothEventCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

    return-void
.end method

.method public onDiscoveryStatus(ZZ)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "bBle",
            "bStart"
        }
    .end annotation

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O0O0XiIiO;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/O0O0XiIiO;-><init>(ZZ)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/BluetoothEventCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

    return-void
.end method

.method public onError(Lcom/jieli/bluetooth_connect/bean/ErrorInfo;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "error"
        }
    .end annotation

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XX0XOi;

    invoke-direct {v0, p1}, Lcom/android/mltcode/paycertificationapi/XX0XOi;-><init>(Lcom/jieli/bluetooth_connect/bean/ErrorInfo;)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/BluetoothEventCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

    return-void
.end method

.method public onHfpStatus(Landroid/bluetooth/BluetoothDevice;I)V
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

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i11II1i10;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/i11II1i10;-><init>(Landroid/bluetooth/BluetoothDevice;I)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/BluetoothEventCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

    return-void
.end method

.method public onHistoryRecordChange(ILcom/jieli/bluetooth_connect/bean/history/HistoryRecord;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "op",
            "record"
        }
    .end annotation

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i001OIXX;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/i001OIXX;-><init>(ILcom/jieli/bluetooth_connect/bean/history/HistoryRecord;)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/BluetoothEventCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

    return-void
.end method

.method public onShowDialog(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "device",
            "bleScanMessage"
        }
    .end annotation

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OI1X11;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/OI1X11;-><init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/BluetoothEventCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

    return-void
.end method

.method public onSppDataNotification(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;[B)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "device",
            "sppUUID",
            "data"
        }
    .end annotation

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iX1O1i0Xi;

    invoke-direct {v0, p1, p2, p3}, Lcom/android/mltcode/paycertificationapi/iX1O1i0Xi;-><init>(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;[B)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/BluetoothEventCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

    return-void
.end method

.method public onSppStatus(Landroid/bluetooth/BluetoothDevice;I)V
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

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XiiO0I0iI;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/XiiO0I0iI;-><init>(Landroid/bluetooth/BluetoothDevice;I)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/BluetoothEventCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

    return-void
.end method

.method public onSwitchConnectedDevice(Landroid/bluetooth/BluetoothDevice;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IX0I0;

    invoke-direct {v0, p1}, Lcom/android/mltcode/paycertificationapi/IX0I0;-><init>(Landroid/bluetooth/BluetoothDevice;)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/BluetoothEventCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

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
