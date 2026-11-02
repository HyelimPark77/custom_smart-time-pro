.class Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;
.super Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$BluetoothBleReceiver;
    }
.end annotation


# static fields
.field private static final A:I = 0x3001

.field private static final B:I = 0x3002

.field private static final C:I = 0x3003

.field private static final D:I = 0x3004

.field private static final E:I = 0x3005

.field private static final F:I = 0x7d0

.field private static final G:J = 0x61a8L


# instance fields
.field private final s:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/jieli/jl_bt_ota/model/ble/BleDevice;",
            ">;"
        }
    .end annotation
.end field

.field private final t:Lcom/jieli/jl_bt_ota/tool/ble/BtBleCallbackManager;

.field private final u:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;",
            ">;"
        }
    .end annotation
.end field

.field private v:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$BluetoothBleReceiver;

.field private w:Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;

.field private x:J

.field private volatile y:Landroid/bluetooth/BluetoothDevice;

.field private final z:Landroid/bluetooth/BluetoothGattCallback;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;-><init>(Landroid/content/Context;)V

    new-instance p1, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$2;

    invoke-direct {p1, p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$2;-><init>(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;)V

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->z:Landroid/bluetooth/BluetoothGattCallback;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    invoke-static {p1}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->s:Ljava/util/Map;

    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->u:Ljava/util/Queue;

    new-instance p1, Lcom/jieli/jl_bt_ota/tool/ble/BtBleCallbackManager;

    invoke-direct {p1}, Lcom/jieli/jl_bt_ota/tool/ble/BtBleCallbackManager;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->t:Lcom/jieli/jl_bt_ota/tool/ble/BtBleCallbackManager;

    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->a()V

    return-void
.end method

.method public static synthetic XIi00iiXO(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothGatt;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->a(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothGatt;I)V

    return-void
.end method

.method public static synthetic XO0O10(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;Lcom/jieli/jl_bt_ota/model/base/ThreadState;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->a(Lcom/jieli/jl_bt_ota/model/base/ThreadState;)V

    return-void
.end method

.method private a(Landroid/bluetooth/BluetoothGattCharacteristic;I)Landroid/bluetooth/BluetoothGattDescriptor;
    .locals 2
    .param p1    # Landroid/bluetooth/BluetoothGattCharacteristic;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 35
    :cond_0
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getProperties()I

    move-result v1

    and-int/2addr p2, v1

    if-nez p2, :cond_1

    return-object v0

    .line 36
    :cond_1
    sget-object p2, Lcom/jieli/jl_bt_ota/constant/BluetoothConstant;->UUID_CLIENT_CHARACTERISTIC_CONFIG:Ljava/util/UUID;

    invoke-virtual {p1, p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getDescriptor(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattDescriptor;

    move-result-object p1

    return-object p1
.end method

.method private a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;)Lcom/jieli/jl_bt_ota/model/ble/BleDevice;
    .locals 1

    .line 14
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->e(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_bt_ota/model/ble/BleDevice;

    move-result-object v0

    if-nez v0, :cond_0

    .line 15
    new-instance v0, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;

    invoke-direct {v0, p1, p2}, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;-><init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;)V

    .line 16
    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->s:Ljava/util/Map;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method public static synthetic a(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;)Lcom/jieli/jl_bt_ota/tool/ble/BtBleCallbackManager;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->t:Lcom/jieli/jl_bt_ota/tool/ble/BtBleCallbackManager;

    return-object p0
.end method

.method private a()V
    .locals 3

    .line 163
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->v:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$BluetoothBleReceiver;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mContext:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 164
    new-instance v0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$BluetoothBleReceiver;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$BluetoothBleReceiver;-><init>(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$1;)V

    iput-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->v:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$BluetoothBleReceiver;

    .line 165
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 166
    const-string v1, "android.bluetooth.device.action.ACL_CONNECTED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 167
    const-string v1, "android.bluetooth.device.action.ACL_DISCONNECTED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 168
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->v:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$BluetoothBleReceiver;

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    :cond_0
    return-void
.end method

.method private a(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 5

    .line 81
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->e(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_bt_ota/model/ble/BleDevice;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 82
    :cond_0
    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->getConnection()I

    move-result v1

    .line 83
    iget-object v2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "previousState = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Lcom/jieli/jl_bt_ota/util/BluetoothUtil;->printBtConnectionState(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ", state = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    invoke-static {p2}, Lcom/jieli/jl_bt_ota/util/BluetoothUtil;->printBtConnectionState(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ",\n "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 85
    const-string v4, "notifyBleConnectStatus"

    invoke-static {v2, v4, v3}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-ne v1, p2, :cond_1

    :goto_0
    return-void

    :cond_1
    const/4 v1, 0x1

    if-eq p2, v1, :cond_4

    .line 86
    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->getConnectingBleDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    invoke-static {p1, v2}, Lcom/jieli/jl_bt_ota/util/BluetoothUtil;->deviceEquals(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x3001

    .line 87
    invoke-virtual {p0, v2}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->removeTimeoutTask(I)V

    .line 88
    :cond_2
    iget-object v2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->y:Landroid/bluetooth/BluetoothDevice;

    invoke-static {p1, v2}, Lcom/jieli/jl_bt_ota/util/BluetoothUtil;->deviceEquals(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v2

    if-eqz v2, :cond_3

    const/16 v2, 0x3005

    .line 89
    invoke-virtual {p0, v2}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->removeTimeoutTask(I)V

    const/4 v2, 0x0

    .line 90
    iput-object v2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->y:Landroid/bluetooth/BluetoothDevice;

    :cond_3
    const-wide/16 v2, 0x0

    .line 91
    iput-wide v2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->x:J

    .line 92
    iget-object v2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->u:Ljava/util/Queue;

    invoke-interface {v2}, Ljava/util/Collection;->clear()V

    .line 93
    :cond_4
    invoke-virtual {v0, p2}, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->setConnection(I)Lcom/jieli/jl_bt_ota/model/ble/BleDevice;

    .line 94
    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->getUsingBleDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    if-eqz p2, :cond_7

    const/4 v1, 0x2

    if-eq p2, v1, :cond_5

    goto :goto_1

    :cond_5
    if-nez v0, :cond_6

    .line 95
    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->switchConnectedBleDevice(Landroid/bluetooth/BluetoothDevice;)V

    .line 96
    :cond_6
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->f()V

    goto :goto_1

    .line 97
    :cond_7
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->h(Landroid/bluetooth/BluetoothDevice;)V

    .line 98
    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->getConnectedBleDevices()Ljava/util/List;

    move-result-object v2

    .line 99
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_8

    .line 100
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->g()V

    goto :goto_1

    .line 101
    :cond_8
    invoke-static {v0, p1}, Lcom/jieli/jl_bt_ota/util/BluetoothUtil;->deviceEquals(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 102
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    sub-int/2addr v0, v1

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->switchConnectedBleDevice(Landroid/bluetooth/BluetoothDevice;)V

    .line 103
    :cond_9
    :goto_1
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->t:Lcom/jieli/jl_bt_ota/tool/ble/BtBleCallbackManager;

    invoke-virtual {v0, p1, p2}, Lcom/jieli/jl_bt_ota/tool/ble/BtBleCallbackManager;->onBleConnection(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method private a(Landroid/bluetooth/BluetoothDevice;IIZ)V
    .locals 3

    const/16 v0, 0x3003

    .line 20
    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->removeTimeoutTask(I)V

    .line 21
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->e(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_bt_ota/model/ble/BleDevice;

    move-result-object v0

    if-eqz v0, :cond_0

    if-nez p3, :cond_0

    .line 22
    invoke-virtual {v0, p2}, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->setBleMtu(I)Lcom/jieli/jl_bt_ota/model/ble/BleDevice;

    .line 23
    :cond_0
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->t:Lcom/jieli/jl_bt_ota/tool/ble/BtBleCallbackManager;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->getDeviceGatt(Landroid/bluetooth/BluetoothDevice;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v2

    invoke-virtual {v1, v2, p2, p3}, Lcom/jieli/jl_bt_ota/tool/ble/BtBleCallbackManager;->onMtuChanged(Landroid/bluetooth/BluetoothGatt;II)V

    if-eqz v0, :cond_1

    .line 24
    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->getConnection()I

    move-result p2

    const/4 p3, 0x1

    if-ne p2, p3, :cond_1

    if-eqz p4, :cond_1

    const/4 p2, 0x0

    .line 25
    invoke-direct {p0, p1, p2}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->a(Landroid/bluetooth/BluetoothDevice;Z)V

    :cond_1
    return-void
.end method

.method private synthetic a(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothGatt;I)V
    .locals 3

    const/16 v0, 0x3003

    const-wide/16 v1, 0x1770

    .line 10
    invoke-virtual {p0, v0, p1, v1, v2}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->executeTimeoutTask(ILandroid/bluetooth/BluetoothDevice;J)V

    add-int/lit8 p3, p3, 0x3

    .line 11
    invoke-virtual {p2, p3}, Landroid/bluetooth/BluetoothGatt;->requestMtu(I)Z

    move-result p2

    .line 12
    iget-object p3, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "Request MTU operation result: %s"

    invoke-static {v1, v0}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "requestBleMtu"

    invoke-static {p3, v1, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-nez p2, :cond_0

    .line 13
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->b(Landroid/bluetooth/BluetoothDevice;)V

    :cond_0
    return-void
.end method

.method private synthetic a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;)V
    .locals 2

    .line 58
    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->getDeviceGatt(Landroid/bluetooth/BluetoothDevice;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v0

    invoke-virtual {p0, v0, p2}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->switchBleCharacteristic(Landroid/bluetooth/BluetoothGatt;Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;)Z

    move-result p2

    if-nez p2, :cond_0

    .line 59
    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    const-string v0, "enableBleCharacteristic"

    const-string v1, "Failed to enable characteristic."

    invoke-static {p2, v0, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->i(Landroid/bluetooth/BluetoothDevice;)V

    :cond_0
    return-void
.end method

.method private a(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;I[B)V
    .locals 2

    .line 56
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->w:Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 57
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->w:Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;

    new-instance v1, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;

    invoke-direct {v1, p1, p2, p3, p5}, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;-><init>(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;[B)V

    invoke-virtual {v1, p4}, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;->setStatus(I)Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->wakeupSendThread(Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;)V

    :cond_0
    return-void
.end method

.method private a(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;Z)V
    .locals 2

    .line 139
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->u:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 140
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->u:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;

    if-nez v0, :cond_1

    goto :goto_0

    .line 141
    :cond_1
    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;->getServiceUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;->getCharacteristicUUID()Ljava/util/UUID;

    move-result-object p2

    invoke-virtual {p2, p3}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    if-nez p4, :cond_2

    .line 142
    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;->isOverLimit()Z

    move-result p2

    if-eqz p2, :cond_3

    .line 143
    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    const-string p3, "onBleNotificationStatus"

    const-string p4, "Failed to enable characteristic."

    invoke-static {p2, p3, p4}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->i(Landroid/bluetooth/BluetoothDevice;)V

    return-void

    .line 145
    :cond_2
    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->u:Ljava/util/Queue;

    invoke-interface {p2}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    .line 146
    :cond_3
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->d(Landroid/bluetooth/BluetoothDevice;)V

    :cond_4
    :goto_0
    return-void
.end method

.method private a(Landroid/bluetooth/BluetoothDevice;Z)V
    .locals 3

    .line 26
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "device : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", isNeedChangeMtu = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "dealWithBleConnected"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->e(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_bt_ota/model/ble/BleDevice;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_2

    .line 28
    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->getConnectParam()Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;

    move-result-object p2

    invoke-virtual {p2}, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->getRequestMtu()I

    move-result p2

    .line 29
    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->isConnectATT()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 30
    invoke-virtual {v0, p2}, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->setBleMtu(I)Lcom/jieli/jl_bt_ota/model/ble/BleDevice;

    .line 31
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->t:Lcom/jieli/jl_bt_ota/tool/ble/BtBleCallbackManager;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->getBluetoothGatt()Landroid/bluetooth/BluetoothGatt;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v1, v0, p2, v2}, Lcom/jieli/jl_bt_ota/tool/ble/BtBleCallbackManager;->onMtuChanged(Landroid/bluetooth/BluetoothGatt;II)V

    .line 32
    invoke-direct {p0, p1, v2}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->a(Landroid/bluetooth/BluetoothDevice;Z)V

    return-void

    .line 33
    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->requestBleMtu(Landroid/bluetooth/BluetoothDevice;I)Z

    move-result p2

    if-eqz p2, :cond_2

    :goto_0
    return-void

    :cond_2
    const/4 p2, 0x2

    .line 34
    invoke-direct {p0, p1, p2}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->a(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method private a(Landroid/bluetooth/BluetoothGatt;)V
    .locals 1

    if-eqz p1, :cond_1

    .line 17
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->checkHasConnectPermission(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 18
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mContext:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/jieli/jl_bt_ota/util/BluetoothUtil;->refreshBleDeviceCache(Landroid/content/Context;Landroid/bluetooth/BluetoothGatt;)Z

    .line 19
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->close()V

    :cond_1
    :goto_0
    return-void
.end method

.method private a(Landroid/bluetooth/BluetoothGatt;I)V
    .locals 8

    .line 61
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->t:Lcom/jieli/jl_bt_ota/tool/ble/BtBleCallbackManager;

    invoke-virtual {v0, p1, p2}, Lcom/jieli/jl_bt_ota/tool/ble/BtBleCallbackManager;->onServicesDiscovered(Landroid/bluetooth/BluetoothGatt;I)V

    if-eqz p1, :cond_9

    .line 62
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getServices()Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_9

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p2

    if-nez p2, :cond_0

    goto/16 :goto_1

    .line 63
    :cond_0
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p2

    .line 64
    invoke-direct {p0, p2}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->e(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_bt_ota/model/ble/BleDevice;

    move-result-object v0

    if-nez v0, :cond_1

    goto/16 :goto_1

    .line 65
    :cond_1
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->u:Ljava/util/Queue;

    invoke-interface {v1}, Ljava/util/Collection;->clear()V

    .line 66
    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->getConnectParam()Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->getBleCharacteristicList()Ljava/util/List;

    move-result-object v0

    .line 67
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const-string v2, "onBleServiceDiscovery"

    if-eqz v1, :cond_2

    .line 68
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    const-string v0, "none character list. Callback connection successful."

    invoke-static {p1, v2, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    invoke-direct {p0, p2}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->c(Landroid/bluetooth/BluetoothDevice;)V

    return-void

    .line 70
    :cond_2
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getServices()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/bluetooth/BluetoothGattService;

    .line 71
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_4
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;

    .line 72
    invoke-virtual {v3}, Landroid/bluetooth/BluetoothGattService;->getUuid()Ljava/util/UUID;

    move-result-object v6

    invoke-virtual {v5}, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;->getServiceUUID()Ljava/util/UUID;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/jieli/jl_bt_ota/util/UuidUtil;->equalUUID(Ljava/util/UUID;Ljava/util/UUID;)Z

    move-result v6

    if-eqz v6, :cond_4

    .line 73
    invoke-virtual {v5}, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;->getCharacteristicUUID()Ljava/util/UUID;

    move-result-object v6

    invoke-virtual {v3, v6}, Landroid/bluetooth/BluetoothGattService;->getCharacteristic(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v6

    if-eqz v6, :cond_4

    .line 74
    invoke-virtual {v6}, Landroid/bluetooth/BluetoothGattCharacteristic;->getProperties()I

    move-result v6

    invoke-virtual {v5}, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;->getRequiredProperty()I

    move-result v7

    and-int/2addr v6, v7

    if-eqz v6, :cond_4

    const/16 v1, 0x10

    .line 75
    invoke-virtual {v5, v1}, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;->hasProperty(I)Z

    move-result v1

    const/16 v6, 0x20

    .line 76
    invoke-virtual {v5, v6}, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;->hasProperty(I)Z

    move-result v6

    if-nez v1, :cond_5

    if-eqz v6, :cond_6

    .line 77
    :cond_5
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->u:Ljava/util/Queue;

    invoke-interface {v1, v5}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    :cond_6
    const/4 v1, 0x1

    goto :goto_0

    .line 78
    :cond_7
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isServiceFound : "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v2, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-nez v1, :cond_8

    .line 79
    invoke-direct {p0, p2}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->i(Landroid/bluetooth/BluetoothDevice;)V

    return-void

    .line 80
    :cond_8
    invoke-direct {p0, p2}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->d(Landroid/bluetooth/BluetoothDevice;)V

    :cond_9
    :goto_1
    return-void
.end method

.method private a(Landroid/bluetooth/BluetoothGatt;II)V
    .locals 12
    .param p1    # Landroid/bluetooth/BluetoothGatt;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    .line 104
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->t:Lcom/jieli/jl_bt_ota/tool/ble/BtBleCallbackManager;

    invoke-virtual {v0, p1, p2, p3}, Lcom/jieli/jl_bt_ota/tool/ble/BtBleCallbackManager;->onConnectionStateChange(Landroid/bluetooth/BluetoothGatt;II)V

    .line 105
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    .line 106
    const-string v1, "handleBleConnection"

    invoke-virtual {p0, v1, v0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->isInvalidEnv(Ljava/lang/String;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_5

    .line 107
    :cond_0
    invoke-direct {p0, v0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->e(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_bt_ota/model/ble/BleDevice;

    move-result-object v2

    if-nez v2, :cond_1

    goto/16 :goto_5

    :cond_1
    if-nez p2, :cond_2

    const/4 v3, 0x2

    if-ne p3, v3, :cond_2

    .line 108
    invoke-virtual {v2, p1}, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->setBluetoothGatt(Landroid/bluetooth/BluetoothGatt;)Lcom/jieli/jl_bt_ota/model/ble/BleDevice;

    const-wide/16 p2, 0x1770

    const/16 v2, 0x3002

    .line 109
    invoke-virtual {p0, v2, v0, p2, p3}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->executeTimeoutTask(ILandroid/bluetooth/BluetoothDevice;J)V

    .line 110
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->discoverServices()Z

    move-result p1

    .line 111
    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "discoverServices : "

    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {p2, v1, p3}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-nez p1, :cond_d

    .line 112
    invoke-virtual {p0, v2}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->removeTimeoutTask(I)V

    .line 113
    invoke-direct {p0, v0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->i(Landroid/bluetooth/BluetoothDevice;)V

    return-void

    :cond_2
    const/4 v3, 0x1

    if-ne p3, v3, :cond_3

    .line 114
    invoke-direct {p0, v0, v3}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->a(Landroid/bluetooth/BluetoothDevice;I)V

    return-void

    :cond_3
    if-nez p3, :cond_d

    const/16 p3, 0x3004

    .line 115
    invoke-virtual {p0, p3}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->removeTimeoutTask(I)V

    const/16 p3, 0x3005

    .line 116
    invoke-virtual {p0, p3}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->isHasTimeoutTask(I)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 117
    invoke-virtual {p0, p3}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->removeTimeoutTask(I)V

    .line 118
    :cond_4
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->a(Landroid/bluetooth/BluetoothGatt;)V

    const/4 p1, 0x0

    .line 119
    invoke-virtual {v2, p1}, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->setBluetoothGatt(Landroid/bluetooth/BluetoothGatt;)Lcom/jieli/jl_bt_ota/model/ble/BleDevice;

    move-result-object p1

    const/16 v5, 0x14

    invoke-virtual {p1, v5}, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->setBleMtu(I)Lcom/jieli/jl_bt_ota/model/ble/BleDevice;

    .line 120
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->e()J

    move-result-wide v5

    .line 121
    iget-wide v7, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->x:J

    const-wide/16 v9, 0x0

    cmp-long p1, v7, v9

    const/4 v9, 0x0

    if-lez p1, :cond_5

    move p1, v3

    goto :goto_0

    :cond_5
    move p1, v9

    :goto_0
    if-eqz p1, :cond_6

    const-wide/16 v10, 0x61a8

    add-long/2addr v7, v10

    cmp-long v5, v5, v7

    if-lez v5, :cond_6

    move v5, v3

    goto :goto_1

    :cond_6
    move v5, v9

    :goto_1
    if-eqz p2, :cond_7

    .line 122
    iget-object v6, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Error :(0x"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "): "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    invoke-static {p2}, Lcom/jieli/jl_bt_ota/constant/GattError;->parseConnectionError(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 124
    invoke-static {v6, v1, v7}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    :cond_7
    invoke-virtual {v2}, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->isConnected()Z

    move-result v6

    if-nez v6, :cond_c

    if-nez v4, :cond_9

    const/16 v6, 0x85

    if-ne p2, v6, :cond_8

    .line 126
    invoke-virtual {v2}, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->getConnectParam()Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;

    move-result-object p2

    invoke-virtual {p2}, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->isReconnect()Z

    move-result p2

    if-eqz p2, :cond_8

    .line 127
    invoke-virtual {v2}, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->getConnectParam()Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;

    move-result-object p2

    invoke-virtual {p2}, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->canRetry()Z

    move-result p2

    if-eqz p2, :cond_8

    if-eqz p1, :cond_8

    if-nez v5, :cond_8

    goto :goto_2

    :cond_8
    move v3, v9

    .line 128
    :cond_9
    :goto_2
    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "mac : "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, ", needReconnect : "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v4, ", canTimeout : "

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p1, ", timeout : "

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p1, ", isAllowReconnect = "

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, v1, p1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v3, :cond_c

    .line 129
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    const-string p2, "retry connect ble."

    invoke-static {p1, v1, p2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->u:Ljava/util/Queue;

    invoke-interface {p1}, Ljava/util/Collection;->clear()V

    .line 131
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->y:Landroid/bluetooth/BluetoothDevice;

    if-eqz p1, :cond_a

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->y:Landroid/bluetooth/BluetoothDevice;

    invoke-static {p1, v0}, Lcom/jieli/jl_bt_ota/util/BluetoothUtil;->deviceEquals(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    if-nez p1, :cond_a

    .line 132
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    const-string p2, "Successfully disconnected the previous device."

    invoke-static {p1, v1, p2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    invoke-direct {p0, v0, v9}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->a(Landroid/bluetooth/BluetoothDevice;I)V

    goto :goto_3

    .line 134
    :cond_a
    invoke-virtual {v2, v9}, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->setConnection(I)Lcom/jieli/jl_bt_ota/model/ble/BleDevice;

    .line 135
    :goto_3
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->y:Landroid/bluetooth/BluetoothDevice;

    if-nez p1, :cond_b

    goto :goto_4

    :cond_b
    move-object v0, p1

    :goto_4
    const-wide/16 p1, 0x7d0

    .line 136
    invoke-virtual {p0, p3, v0, p1, p2}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->executeTimeoutTask(ILandroid/bluetooth/BluetoothDevice;J)V

    return-void

    .line 137
    :cond_c
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    const-string p2, "callback device is disconnected."

    invoke-static {p1, v1, p2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 138
    invoke-direct {p0, v0, v9}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->a(Landroid/bluetooth/BluetoothDevice;I)V

    :cond_d
    :goto_5
    return-void
.end method

.method private a(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;[B)V
    .locals 5

    .line 147
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    .line 148
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getService()Landroid/bluetooth/BluetoothGattService;

    move-result-object v1

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothGattService;->getUuid()Ljava/util/UUID;

    move-result-object v1

    .line 149
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v2

    .line 150
    iget-object v3, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    const/4 v4, 0x0

    .line 151
    invoke-virtual {p0, v0, v4}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;Z)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1}, Lcom/jieli/jl_bt_ota/util/UuidUtil;->read16BitUUID(Ljava/util/UUID;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2}, Lcom/jieli/jl_bt_ota/util/UuidUtil;->read16BitUUID(Ljava/util/UUID;)Ljava/lang/String;

    move-result-object v2

    .line 152
    invoke-static {p3}, Lcom/jieli/jl_bt_ota/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object p3

    filled-new-array {v0, v1, v2, p3}, [Ljava/lang/Object;

    move-result-object p3

    .line 153
    const-string v0, "<<< device = %s, service = %s, characteristic = %s,\n data = [%s]."

    invoke-static {v0, p3}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    const-string v0, "onCharacteristicChanged"

    invoke-static {v3, v0, p3}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    iget-object p3, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->t:Lcom/jieli/jl_bt_ota/tool/ble/BtBleCallbackManager;

    invoke-virtual {p3, p1, p2}, Lcom/jieli/jl_bt_ota/tool/ble/BtBleCallbackManager;->onCharacteristicChanged(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    return-void
.end method

.method private a(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;[BI)V
    .locals 5

    .line 155
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    .line 156
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getService()Landroid/bluetooth/BluetoothGattService;

    move-result-object v1

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothGattService;->getUuid()Ljava/util/UUID;

    move-result-object v1

    .line 157
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v2

    .line 158
    iget-object v3, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    const/4 v4, 0x0

    .line 159
    invoke-virtual {p0, v0, v4}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;Z)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1}, Lcom/jieli/jl_bt_ota/util/UuidUtil;->read16BitUUID(Ljava/util/UUID;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2}, Lcom/jieli/jl_bt_ota/util/UuidUtil;->read16BitUUID(Ljava/util/UUID;)Ljava/lang/String;

    move-result-object v2

    .line 160
    invoke-static {p3}, Lcom/jieli/jl_bt_ota/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object p3

    filled-new-array {v0, v1, v2, p3}, [Ljava/lang/Object;

    move-result-object p3

    .line 161
    const-string v0, "<<< device = %s, service = %s, characteristic = %s,\n data = [%s]."

    invoke-static {v0, p3}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    const-string v0, "onCharacteristicRead"

    invoke-static {v3, v0, p3}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    iget-object p3, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->t:Lcom/jieli/jl_bt_ota/tool/ble/BtBleCallbackManager;

    invoke-virtual {p3, p1, p2, p4}, Lcom/jieli/jl_bt_ota/tool/ble/BtBleCallbackManager;->onCharacteristicRead(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;Landroid/bluetooth/BluetoothDevice;IIZ)V
    .locals 0

    .line 7
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->a(Landroid/bluetooth/BluetoothDevice;IIZ)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;I[B)V
    .locals 0

    .line 4
    invoke-direct/range {p0 .. p5}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->a(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;I[B)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;Z)V
    .locals 0

    .line 6
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->a(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;Z)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;Landroid/bluetooth/BluetoothGatt;I)V
    .locals 0

    .line 8
    invoke-direct {p0, p1, p2}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->a(Landroid/bluetooth/BluetoothGatt;I)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;Landroid/bluetooth/BluetoothGatt;II)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2, p3}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->a(Landroid/bluetooth/BluetoothGatt;II)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;[B)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->a(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;[B)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;[BI)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->a(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;[BI)V

    return-void
.end method

.method private synthetic a(Lcom/jieli/jl_bt_ota/model/base/ThreadState;)V
    .locals 4

    .line 49
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/base/ThreadState;->getState()I

    move-result v0

    if-nez v0, :cond_0

    .line 50
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->w:Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/base/ThreadState;->getId()J

    move-result-wide v2

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 51
    iput-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->w:Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;

    :cond_0
    return-void
.end method

.method private a(Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;)V
    .locals 7
    .param p1    # Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 52
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->w:Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->f(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 53
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->w:Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->addSendTask(Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;)Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    .line 54
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;->getCallback()Lcom/jieli/jl_bt_ota/interfaces/bt/OnBleSendDataCallback;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 55
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;->getServiceUUID()Ljava/util/UUID;

    move-result-object v3

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;->getCharacteristicUUID()Ljava/util/UUID;

    move-result-object v4

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;->getData()[B

    move-result-object v6

    const/4 v5, 0x0

    invoke-interface/range {v1 .. v6}, Lcom/jieli/jl_bt_ota/interfaces/bt/OnBleSendDataCallback;->onResult(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;Z[B)V

    :cond_1
    return-void
.end method

.method private a(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;)Z
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    .line 37
    :cond_0
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattDescriptor;->getCharacteristic()Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v0

    .line 38
    invoke-virtual {v0}, Landroid/bluetooth/BluetoothGattCharacteristic;->getWriteType()I

    move-result v1

    const/4 v2, 0x2

    .line 39
    invoke-virtual {v0, v2}, Landroid/bluetooth/BluetoothGattCharacteristic;->setWriteType(I)V

    .line 40
    invoke-virtual {p1, p2}, Landroid/bluetooth/BluetoothGatt;->writeDescriptor(Landroid/bluetooth/BluetoothGattDescriptor;)Z

    move-result p1

    .line 41
    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothGattCharacteristic;->setWriteType(I)V

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method private a(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;[BIIZ)Z
    .locals 8
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    if-nez p6, :cond_0

    .line 42
    invoke-virtual/range {p2 .. p3}, Landroid/bluetooth/BluetoothGattDescriptor;->setValue([B)Z

    move-result v1

    goto :goto_0

    :cond_0
    move v1, p6

    :goto_0
    if-eqz v1, :cond_3

    .line 43
    invoke-direct/range {p0 .. p2}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->a(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;)Z

    move-result v7

    .line 44
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "writeDescriptorWorkaround : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "tryToWriteDescriptor"

    invoke-static {v1, v3, v2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-nez v7, :cond_2

    add-int/lit8 v4, p4, 0x1

    if-le v4, p5, :cond_1

    .line 45
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const-string v4, "The number of failures exceeded the limit(%d)."

    invoke-static {v4, v2}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v3, v2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x0

    return v1

    .line 46
    :cond_1
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "retryCount : "

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v3, v2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-wide/16 v1, 0x64

    .line 47
    invoke-static {v1, v2}, Landroid/os/SystemClock;->sleep(J)V

    const/4 v6, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v5, p5

    .line 48
    invoke-direct/range {v0 .. v6}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->a(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;[BIIZ)Z

    :cond_2
    return v7

    :cond_3
    return v1
.end method

.method public static synthetic a(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;Landroid/bluetooth/BluetoothDevice;)Z
    .locals 0

    .line 9
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->f(Landroid/bluetooth/BluetoothDevice;)Z

    move-result p0

    return p0
.end method

.method private b(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;)Landroid/bluetooth/BluetoothGatt;
    .locals 8
    .param p1    # Landroid/bluetooth/BluetoothDevice;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    .line 1
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mContext:Landroid/content/Context;

    .line 2
    invoke-virtual {p2}, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->getTransport()I

    move-result v4

    .line 3
    invoke-virtual {p2}, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->getPreferredPhy()I

    move-result v5

    .line 4
    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "transport : "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v4}, Lcom/jieli/jl_bt_ota/util/BluetoothUtil;->printTransport(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", preferredPhy : "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v7, "connectBluetoothGatt"

    invoke-static {p2, v7, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 p2, 0x0

    .line 5
    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1a

    if-le v0, v2, :cond_0

    .line 6
    iget-object v3, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->z:Landroid/bluetooth/BluetoothGattCallback;

    iget-object v6, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mUIHandler:Landroid/os/Handler;

    const/4 v2, 0x0

    move-object v0, p1

    invoke-virtual/range {v0 .. v6}, Landroid/bluetooth/BluetoothDevice;->connectGatt(Landroid/content/Context;ZLandroid/bluetooth/BluetoothGattCallback;IILandroid/os/Handler;)Landroid/bluetooth/BluetoothGatt;

    move-result-object p1

    goto :goto_1

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_0

    :cond_0
    if-ne v0, v2, :cond_1

    .line 7
    iget-object v3, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->z:Landroid/bluetooth/BluetoothGattCallback;

    const/4 v2, 0x0

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/bluetooth/BluetoothDevice;->connectGatt(Landroid/content/Context;ZLandroid/bluetooth/BluetoothGattCallback;II)Landroid/bluetooth/BluetoothGatt;

    move-result-object p1

    goto :goto_1

    :cond_1
    move-object v0, p1

    .line 8
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->z:Landroid/bluetooth/BluetoothGattCallback;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p1, v4}, Landroid/bluetooth/BluetoothDevice;->connectGatt(Landroid/content/Context;ZLandroid/bluetooth/BluetoothGattCallback;I)Landroid/bluetooth/BluetoothGatt;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 9
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    move-object p1, p2

    :goto_1
    if-nez p1, :cond_2

    .line 10
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    const-string v0, "Failed to connect ble."

    invoke-static {p1, v7, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object p2

    :cond_2
    return-object p1
.end method

.method private b()V
    .locals 2

    .line 12
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->v:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$BluetoothBleReceiver;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->mContext:Landroid/content/Context;

    if-eqz v1, :cond_0

    .line 13
    invoke-virtual {v1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->v:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$BluetoothBleReceiver;

    :cond_0
    return-void
.end method

.method private b(Landroid/bluetooth/BluetoothDevice;)V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/16 v2, 0x14

    .line 11
    invoke-direct {p0, p1, v2, v0, v1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->a(Landroid/bluetooth/BluetoothDevice;IIZ)V

    return-void
.end method

.method private c(Landroid/bluetooth/BluetoothDevice;)V
    .locals 2

    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->e(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_bt_ota/model/ble/BleDevice;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->getConnectParam()Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;

    move-result-object v1

    invoke-virtual {v1}, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->isNeedChangeBleMtu()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->getConnectParam()Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->getRequestMtu()I

    move-result v0

    const/16 v1, 0x14

    if-le v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0, p1, v0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->a(Landroid/bluetooth/BluetoothDevice;Z)V

    return-void
.end method

.method private d()V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->getConnectedBleDevices()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/bluetooth/BluetoothDevice;

    .line 2
    invoke-virtual {p0, v1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->getDeviceGatt(Landroid/bluetooth/BluetoothDevice;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-static {}, Lcom/jieli/jl_bt_ota/util/BluetoothUtil;->isBluetoothEnable()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 4
    invoke-virtual {v2}, Landroid/bluetooth/BluetoothGatt;->disconnect()V

    .line 5
    invoke-direct {p0, v2}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->a(Landroid/bluetooth/BluetoothGatt;)V

    .line 6
    :cond_1
    iget-object v2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->t:Lcom/jieli/jl_bt_ota/tool/ble/BtBleCallbackManager;

    const/4 v3, 0x0

    invoke-virtual {v2, v1, v3}, Lcom/jieli/jl_bt_ota/tool/ble/BtBleCallbackManager;->onBleConnection(Landroid/bluetooth/BluetoothDevice;I)V

    goto :goto_0

    .line 7
    :cond_2
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->s:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 8
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->g()V

    return-void
.end method

.method private d(Landroid/bluetooth/BluetoothDevice;)V
    .locals 5

    .line 9
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->u:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const-string v1, "enableBleCharacteristic"

    if-eqz v0, :cond_0

    .line 10
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    const-string v2, "characteristicsTaskQueue is empty."

    invoke-static {v0, v1, v2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->c(Landroid/bluetooth/BluetoothDevice;)V

    return-void

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->u:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;

    .line 13
    iget-object v2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "next task. "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v1, v3}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    new-instance v1, Lcom/jieli/jl_bt_ota/impl/bt/iO;

    invoke-direct {v1, p0, p1, v0}, Lcom/jieli/jl_bt_ota/impl/bt/iO;-><init>(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;)V

    invoke-virtual {p0, v1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->runOnMainThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method private e()J
    .locals 2

    .line 1
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method private e(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_bt_ota/model/ble/BleDevice;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->s:Ljava/util/Map;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;

    return-object p1
.end method

.method private f()V
    .locals 3

    .line 3
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->w:Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;

    if-nez v0, :cond_0

    .line 4
    new-instance v0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;

    new-instance v1, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$1;

    invoke-direct {v1, p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$1;-><init>(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;)V

    new-instance v2, Lcom/jieli/jl_bt_ota/impl/bt/XO0O10;

    invoke-direct {v2, p0}, Lcom/jieli/jl_bt_ota/impl/bt/XO0O10;-><init>(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;)V

    invoke-direct {v0, v1, v2}, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;-><init>(Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread$IBleOperation;Landroidx/core/util/Consumer;)V

    iput-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->w:Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;

    .line 5
    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->start()V

    :cond_0
    return-void
.end method

.method private f(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->getConnectedBleDevices()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/bluetooth/BluetoothDevice;

    .line 2
    invoke-static {v1, p1}, Lcom/jieli/jl_bt_ota/util/BluetoothUtil;->deviceEquals(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private g()V
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->w:Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->stopThread()V

    :cond_0
    return-void
.end method

.method private g(Landroid/bluetooth/BluetoothDevice;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "Prepare to reconnect the device[%s]."

    invoke-static {v2, v1}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "reconnectBleDevice"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iput-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->y:Landroid/bluetooth/BluetoothDevice;

    const/16 v0, 0x3005

    const-wide/16 v1, 0x1770

    .line 3
    invoke-virtual {p0, v0, p1, v1, v2}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->executeTimeoutTask(ILandroid/bluetooth/BluetoothDevice;J)V

    .line 4
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->i(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method private h(Landroid/bluetooth/BluetoothDevice;)V
    .locals 2

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->s:Ljava/util/Map;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->getBluetoothGatt()Landroid/bluetooth/BluetoothGatt;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-direct {p0, v0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->a(Landroid/bluetooth/BluetoothGatt;)V

    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->setBluetoothGatt(Landroid/bluetooth/BluetoothGatt;)Lcom/jieli/jl_bt_ota/model/ble/BleDevice;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->setUsing(Z)Lcom/jieli/jl_bt_ota/model/ble/BleDevice;

    move-result-object p1

    const/16 v1, 0x14

    invoke-virtual {p1, v1}, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->setBleMtu(I)Lcom/jieli/jl_bt_ota/model/ble/BleDevice;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->setConnection(I)Lcom/jieli/jl_bt_ota/model/ble/BleDevice;

    :cond_2
    :goto_0
    return-void
.end method

.method private i(Landroid/bluetooth/BluetoothDevice;)V
    .locals 1

    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->disconnectBLEDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->a(Landroid/bluetooth/BluetoothDevice;I)V

    :cond_0
    return-void
.end method

.method public static synthetic iO(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;)V

    return-void
.end method


# virtual methods
.method public addOnBtBleListener(Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtBleListener;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->t:Lcom/jieli/jl_bt_ota/tool/ble/BtBleCallbackManager;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper;->addCallback(Ljava/lang/Object;)Z

    return-void
.end method

.method public connectBLEDevice(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;)Z
    .locals 11

    const-string v0, "connectBLEDevice"

    invoke-virtual {p0, v0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->isInvalidEnv(Ljava/lang/String;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_6

    if-nez p2, :cond_0

    goto/16 :goto_0

    :cond_0
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3, p2}, [Ljava/lang/Object;

    move-result-object v3

    const-string v4, "device: %s, %s."

    invoke-static {v4, v3}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v0, v3}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->isConnectedBLEDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v1

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    const-string v1, "Device is connected."

    invoke-static {p2, v0, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->t:Lcom/jieli/jl_bt_ota/tool/ble/BtBleCallbackManager;

    const/4 v0, 0x2

    invoke-virtual {p2, p1, v0}, Lcom/jieli/jl_bt_ota/tool/ble/BtBleCallbackManager;->onBleConnection(Landroid/bluetooth/BluetoothDevice;I)V

    return v3

    :cond_1
    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->getConnectingBleDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    const-wide/16 v4, 0x1770

    const/16 v6, 0x3005

    if-eqz v1, :cond_3

    iget-object v7, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    invoke-virtual {p0, v1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v8

    filled-new-array {v8}, [Ljava/lang/Object;

    move-result-object v8

    const-string v9, "Connecting BLE[%s]."

    invoke-static {v9, v8}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v0, v8}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v1, p1}, Lcom/jieli/jl_bt_ota/util/BluetoothUtil;->deviceEquals(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v7

    if-eqz v7, :cond_2

    return v3

    :cond_2
    iget-object v7, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    filled-new-array {v1, p1}, [Ljava/lang/Object;

    move-result-object v8

    const-string v9, "Disconnect the currently connected device(%s) and connect the new device(%s)."

    invoke-static {v9, v8}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v0, v8}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->y:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {p0, v6, p1, v4, v5}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->executeTimeoutTask(ILandroid/bluetooth/BluetoothDevice;J)V

    invoke-virtual {p0, v1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->disconnectBLEDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v1

    if-eqz v1, :cond_3

    return v3

    :cond_3
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->e()J

    move-result-wide v7

    iput-wide v7, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->x:J

    invoke-direct {p0, p1, p2}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;)Lcom/jieli/jl_bt_ota/model/ble/BleDevice;

    move-result-object v1

    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->getUsingBleDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v7

    if-eqz v7, :cond_4

    invoke-static {v7, p1}, Lcom/jieli/jl_bt_ota/util/BluetoothUtil;->deviceEquals(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v8

    if-nez v8, :cond_4

    iget-object v8, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    invoke-virtual {p0, v7}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v9

    filled-new-array {v9}, [Ljava/lang/Object;

    move-result-object v9

    const-string v10, "The device is different from the currently connected device, so disconnect the currently connected device[%s]."

    invoke-static {v10, v9}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v0, v9}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->y:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {p0, v6, p1, v4, v5}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->executeTimeoutTask(ILandroid/bluetooth/BluetoothDevice;J)V

    invoke-virtual {p0, v7}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->disconnectBLEDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v4

    if-eqz v4, :cond_4

    return v3

    :cond_4
    invoke-virtual {p2}, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->getTimeout()J

    move-result-wide v4

    const/16 v6, 0x3001

    invoke-virtual {p0, v6, p1, v4, v5}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->executeTimeoutTask(ILandroid/bluetooth/BluetoothDevice;J)V

    invoke-direct {p0, p1, v3}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->a(Landroid/bluetooth/BluetoothDevice;I)V

    invoke-direct {p0, p1, p2}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->b(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;)Landroid/bluetooth/BluetoothGatt;

    move-result-object p2

    if-nez p2, :cond_5

    invoke-direct {p0, p1, v2}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->a(Landroid/bluetooth/BluetoothDevice;I)V

    return v2

    :cond_5
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "start connect ble. startTime : "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v4, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->x:J

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v0, v2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->setBluetoothGatt(Landroid/bluetooth/BluetoothGatt;)Lcom/jieli/jl_bt_ota/model/ble/BleDevice;

    return v3

    :cond_6
    :goto_0
    return v2
.end method

.method public disconnectBLEDevice(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 7

    const-string v0, "disconnectBLEDevice"

    invoke-virtual {p0, v0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->isInvalidEnv(Ljava/lang/String;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return v2

    :cond_0
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "device : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v0, v3}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->getDeviceGatt(Landroid/bluetooth/BluetoothDevice;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v1

    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->getConnectingBleDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v3

    invoke-static {v3, p1}, Lcom/jieli/jl_bt_ota/util/BluetoothUtil;->deviceEquals(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Stop connecting deice. gatt = "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v0, v5}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothGatt;->disconnect()V

    invoke-direct {p0, v1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->a(Landroid/bluetooth/BluetoothGatt;)V

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    invoke-direct {p0, p1, v2}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->a(Landroid/bluetooth/BluetoothDevice;I)V

    return v4

    :cond_2
    if-nez v1, :cond_3

    return v2

    :cond_3
    const/16 v3, 0x3004

    const-wide/16 v5, 0x1770

    invoke-virtual {p0, v3, p1, v5, v6}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->executeTimeoutTask(ILandroid/bluetooth/BluetoothDevice;J)V

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothGatt;->disconnect()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v4

    :goto_1
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "IO Exception : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, v0, p1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v2
.end method

.method public getBleMtu(Landroid/bluetooth/BluetoothDevice;)I
    .locals 1

    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->e(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_bt_ota/model/ble/BleDevice;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->isConnected()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->getBleMtu()I

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public getConnectedBleDevices()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/bluetooth/BluetoothDevice;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->s:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;

    invoke-virtual {v2}, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->isConnected()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public getConnectingBleDevice()Landroid/bluetooth/BluetoothDevice;
    .locals 4

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->s:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;

    invoke-virtual {v1}, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->getConnection()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    invoke-virtual {v1}, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public getDeviceGatt(Landroid/bluetooth/BluetoothDevice;)Landroid/bluetooth/BluetoothGatt;
    .locals 0

    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->e(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_bt_ota/model/ble/BleDevice;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->getBluetoothGatt()Landroid/bluetooth/BluetoothGatt;

    move-result-object p1

    return-object p1
.end method

.method public getUsingBleDevice()Landroid/bluetooth/BluetoothDevice;
    .locals 3

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->s:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;

    invoke-virtual {v1}, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->isConnected()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->isUsing()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public handleMessageEvent(Landroid/os/Message;)Z
    .locals 7
    .param p1    # Landroid/os/Message;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget v0, p1, Landroid/os/Message;->what:I

    const-string v1, "device : "

    const-string v2, "device: "

    const/4 v3, 0x0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    :pswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v1, v0, Landroid/bluetooth/BluetoothDevice;

    if-nez v1, :cond_0

    return v3

    :cond_0
    check-cast v0, Landroid/bluetooth/BluetoothDevice;

    invoke-direct {p0, v0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->e(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_bt_ota/model/ble/BleDevice;

    move-result-object v1

    if-nez v1, :cond_1

    return v3

    :cond_1
    invoke-virtual {v1}, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->getConnectParam()Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;

    move-result-object v1

    iget-object v4, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v5, "MSG_RECONNECT_BLE"

    invoke-static {v4, v5, v2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->connectBLEDevice(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;)Z

    move-result v1

    if-nez v1, :cond_b

    invoke-direct {p0, v0, v3}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->a(Landroid/bluetooth/BluetoothDevice;I)V

    goto/16 :goto_0

    :pswitch_1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v1, v0, Landroid/bluetooth/BluetoothDevice;

    if-nez v1, :cond_2

    return v3

    :cond_2
    check-cast v0, Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->getDeviceGatt(Landroid/bluetooth/BluetoothDevice;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v1

    if-nez v1, :cond_3

    return v3

    :cond_3
    iget-object v4, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v5, "MSG_DISCONNECT_BLE_TIMEOUT"

    invoke-static {v4, v5, v2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, v1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->a(Landroid/bluetooth/BluetoothGatt;)V

    invoke-direct {p0, v0, v3}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->a(Landroid/bluetooth/BluetoothDevice;I)V

    goto/16 :goto_0

    :pswitch_2
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v1, v0, Landroid/bluetooth/BluetoothDevice;

    if-nez v1, :cond_4

    return v3

    :cond_4
    check-cast v0, Landroid/bluetooth/BluetoothDevice;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "MSG_ADJUST_BLE_MTU_TIMEOUT"

    invoke-static {v1, v3, v2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->b(Landroid/bluetooth/BluetoothDevice;)V

    goto/16 :goto_0

    :pswitch_3
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v2, v0, Landroid/bluetooth/BluetoothDevice;

    if-nez v2, :cond_5

    return v3

    :cond_5
    check-cast v0, Landroid/bluetooth/BluetoothDevice;

    invoke-direct {p0, v0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->e(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_bt_ota/model/ble/BleDevice;

    move-result-object v2

    if-nez v2, :cond_6

    return v3

    :cond_6
    invoke-virtual {v2}, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->getBluetoothGatt()Landroid/bluetooth/BluetoothGatt;

    move-result-object v4

    if-nez v4, :cond_7

    return v3

    :cond_7
    iget-object v5, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v6, "MSG_DISCOVERY_SERVICE_TIMEOUT"

    invoke-static {v5, v6, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4}, Landroid/bluetooth/BluetoothGatt;->getServices()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_8

    invoke-direct {p0, v4, v3}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->a(Landroid/bluetooth/BluetoothGatt;I)V

    goto :goto_0

    :cond_8
    invoke-virtual {v2}, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->isOverRetryLimit()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-direct {p0, v0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->i(Landroid/bluetooth/BluetoothDevice;)V

    goto :goto_0

    :cond_9
    invoke-direct {p0, v0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->g(Landroid/bluetooth/BluetoothDevice;)V

    goto :goto_0

    :pswitch_4
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v2, v0, Landroid/bluetooth/BluetoothDevice;

    if-nez v2, :cond_a

    return v3

    :cond_a
    check-cast v0, Landroid/bluetooth/BluetoothDevice;

    iget-object v2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, "MSG_CONNECT_BLE_TIMEOUT"

    invoke-static {v2, v3, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->i(Landroid/bluetooth/BluetoothDevice;)V

    :cond_b
    :goto_0
    invoke-super {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->handleMessageEvent(Landroid/os/Message;)Z

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x3001
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public isBleConnecting()Z
    .locals 1

    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->getConnectingBleDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isConnectedBLEDevice(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->f(Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    return p1
.end method

.method public onAdapterStatus(Z)V
    .locals 2

    invoke-super {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->onAdapterStatus(Z)V

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    const-string v0, "ACTION_STATE_CHANGED"

    const-string v1, "Bluetooth is off."

    invoke-static {p1, v0, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->d()V

    :cond_0
    return-void
.end method

.method public release()V
    .locals 1

    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->getConnectingBleDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->disconnectBLEDevice(Landroid/bluetooth/BluetoothDevice;)Z

    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->d()V

    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->b()V

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->u:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Collection;->clear()V

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->t:Lcom/jieli/jl_bt_ota/tool/ble/BtBleCallbackManager;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper;->release()V

    invoke-super {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->release()V

    return-void
.end method

.method public removeOnBtBleListener(Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtBleListener;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->t:Lcom/jieli/jl_bt_ota/tool/ble/BtBleCallbackManager;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper;->removeCallback(Ljava/lang/Object;)Z

    return-void
.end method

.method public requestBleMtu(Landroid/bluetooth/BluetoothDevice;I)Z
    .locals 5

    const-string v0, "requestBleMtu"

    invoke-virtual {p0, v0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->isInvalidEnv(Ljava/lang/String;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return v2

    :cond_0
    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->getDeviceGatt(Landroid/bluetooth/BluetoothDevice;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v1

    if-nez v1, :cond_1

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    const-string p2, "BluetoothGatt is null."

    invoke-static {p1, v0, p2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v2

    :cond_1
    iget-object v2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    add-int/lit8 v3, p2, 0x3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    const-string v4, "Start requesting MTU[%d]."

    invoke-static {v4, v3}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v0, v3}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/jieli/jl_bt_ota/impl/bt/XIi00iiXO;

    invoke-direct {v0, p0, p1, v1, p2}, Lcom/jieli/jl_bt_ota/impl/bt/XIi00iiXO;-><init>(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothGatt;I)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->runOnMainThread(Ljava/lang/Runnable;)V

    const/4 p1, 0x1

    return p1
.end method

.method public sendBleData(Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;)V
    .locals 1

    new-instance v0, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;

    invoke-direct {v0, p1}, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;-><init>(Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;)V

    invoke-direct {p0, v0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->a(Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;)V

    return-void
.end method

.method public switchBleCharacteristic(Landroid/bluetooth/BluetoothGatt;Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;)Z
    .locals 11

    const/4 v1, 0x0

    const-string v2, "switchBleCharacteristic"

    if-nez p2, :cond_0

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    const-string p2, "Invalid parameter."

    invoke-static {p1, v2, p2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_0
    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    const-string p2, "BluetoothGatt is null."

    invoke-static {p1, v2, p2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_1
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-virtual {p0, v2, v0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->isInvalidEnv(Ljava/lang/String;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-eqz v0, :cond_2

    return v1

    :cond_2
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, ""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v2, v3}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;->getServiceUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/bluetooth/BluetoothGatt;->getService(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattService;

    move-result-object v0

    if-nez v0, :cond_3

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    const-string p2, "GattService is null."

    invoke-static {p1, v2, p2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_3
    invoke-virtual {p2}, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;->getCharacteristicUUID()Ljava/util/UUID;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/bluetooth/BluetoothGattService;->getCharacteristic(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v0

    if-nez v0, :cond_4

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    const-string p2, "GattCharacteristic is null."

    invoke-static {p1, v2, p2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_4
    invoke-virtual {p2}, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;->getRequiredProperty()I

    move-result v3

    invoke-direct {p0, v0, v3}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->a(Landroid/bluetooth/BluetoothGattCharacteristic;I)Landroid/bluetooth/BluetoothGattDescriptor;

    move-result-object v6

    if-nez v6, :cond_5

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    const-string p2, "GattDescriptor is null."

    invoke-static {p1, v2, p2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_5
    :try_start_0
    invoke-virtual {p2}, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;->isEnable()Z

    move-result v3

    invoke-virtual {p1, v0, v3}, Landroid/bluetooth/BluetoothGatt;->setCharacteristicNotification(Landroid/bluetooth/BluetoothGattCharacteristic;Z)Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v3, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Exception : "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v2, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    if-eqz v1, :cond_8

    invoke-virtual {p2}, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;->isEnable()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p2}, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;->getRequiredProperty()I

    move-result v0

    const/16 v1, 0x20

    if-ne v0, v1, :cond_6

    sget-object v0, Landroid/bluetooth/BluetoothGattDescriptor;->ENABLE_INDICATION_VALUE:[B

    :goto_1
    move-object v7, v0

    goto :goto_2

    :cond_6
    sget-object v0, Landroid/bluetooth/BluetoothGattDescriptor;->ENABLE_NOTIFICATION_VALUE:[B

    goto :goto_1

    :cond_7
    sget-object v0, Landroid/bluetooth/BluetoothGattDescriptor;->DISABLE_NOTIFICATION_VALUE:[B

    goto :goto_1

    :goto_2
    invoke-virtual {p2}, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;->getRetryLimit()I

    move-result v9

    const/4 v8, 0x0

    const/4 v10, 0x0

    move-object v4, p0

    move-object v5, p1

    invoke-direct/range {v4 .. v10}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->a(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;[BIIZ)Z

    move-result v1

    goto :goto_3

    :cond_8
    move-object v4, p0

    iget-object p1, v4, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    const-string p2, "BluetoothGatt#setCharacteristicNotification is failed."

    invoke-static {p1, v2, p2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_3
    iget-object p1, v4, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "result : "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, v2, p2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v1
.end method

.method public switchConnectedBleDevice(Landroid/bluetooth/BluetoothDevice;)V
    .locals 2

    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->getUsingBleDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/jieli/jl_bt_ota/util/BluetoothUtil;->deviceEquals(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v1

    if-nez v1, :cond_1

    if-eqz p1, :cond_1

    invoke-direct {p0, v0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->e(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_bt_ota/model/ble/BleDevice;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->setUsing(Z)Lcom/jieli/jl_bt_ota/model/ble/BleDevice;

    :cond_0
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->e(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_bt_ota/model/ble/BleDevice;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->setUsing(Z)Lcom/jieli/jl_bt_ota/model/ble/BleDevice;

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->t:Lcom/jieli/jl_bt_ota/tool/ble/BtBleCallbackManager;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_bt_ota/tool/ble/BtBleCallbackManager;->onSwitchBleDevice(Landroid/bluetooth/BluetoothDevice;)V

    :cond_1
    return-void
.end method

.method public declared-synchronized writeBleData(Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;)Z
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission",
            "WrongConstant"
        }
    .end annotation

    monitor-enter p0

    const/4 v0, 0x0

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    const-string v1, "writeBleData"

    const-string v2, "BleSendParam is null."

    invoke-static {p1, v1, v2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    :cond_0
    :try_start_1
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->getDeviceGatt(Landroid/bluetooth/BluetoothDevice;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v1

    if-nez v1, :cond_1

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    const-string v1, "writeBleData"

    const-string v2, "Bluetooth gatt is close."

    invoke-static {p1, v1, v2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return v0

    :cond_1
    :try_start_2
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;->getServiceUUID()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/bluetooth/BluetoothGatt;->getService(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattService;

    move-result-object v2

    if-nez v2, :cond_2

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    const-string v1, "writeBleData"

    const-string v2, "Unable to find service"

    invoke-static {p1, v1, v2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return v0

    :cond_2
    :try_start_3
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;->getCharacteristicUUID()Ljava/util/UUID;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/bluetooth/BluetoothGattService;->getCharacteristic(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v2

    if-nez v2, :cond_3

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    const-string v1, "writeBleData"

    const-string v2, "Characteristic value not found."

    invoke-static {p1, v1, v2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit p0

    return v0

    :cond_3
    :try_start_4
    invoke-virtual {v2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getProperties()I

    move-result v3

    and-int/lit8 v3, v3, 0x4c

    if-nez v3, :cond_4

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    const-string v1, "writeBleData"

    const-string v2, "No available feature values."

    invoke-static {p1, v1, v2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit p0

    return v0

    :cond_4
    :try_start_5
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;->getData()[B

    move-result-object v3

    array-length v4, v3

    if-nez v4, :cond_5

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    const-string v1, "writeBleData"

    const-string v2, "Data is null."

    invoke-static {p1, v1, v2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    monitor-exit p0

    return v0

    :cond_5
    :try_start_6
    invoke-virtual {v2, v3}, Landroid/bluetooth/BluetoothGattCharacteristic;->setValue([B)Z

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;->getWriteType()I

    move-result p1

    if-eqz p1, :cond_6

    invoke-virtual {v2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getWriteType()I

    move-result v3

    if-eq p1, v3, :cond_6

    invoke-virtual {v2, p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->setWriteType(I)V

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_6
    :goto_0
    invoke-virtual {v1, v2}, Landroid/bluetooth/BluetoothGatt;->writeCharacteristic(Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    move-result v0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto :goto_2

    :goto_1
    :try_start_7
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IO Exception : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v2, "writeBleData"

    invoke-static {v1, v2, p1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_2
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Send data : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "writeBleData"

    invoke-static {p1, v2, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    monitor-exit p0

    return v0

    :goto_3
    :try_start_8
    monitor-exit p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    throw p1
.end method
