.class public Lcom/jieli/bluetooth_connect/impl/BluetoothManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/bluetooth_connect/impl/BluetoothManager$RemoveHistoryRecordTask;
    }
.end annotation


# static fields
.field private static final ADJUST_BLE_MTU_TIMEOUT:I = 0x1770

.field private static final MSG_ADJUST_BLE_MTU_TIMEOUT:I = 0x1011

.field private static final MSG_CONNECT_DEVICE_TIMEOUT:I = 0x1010

.field private static final MSG_RECONNECT_DEVICE:I = 0x1012

.field private static final REMOVE_HISTORY_RECORD_TIMEOUT:I = 0x2710

.field private static final TAG:Ljava/lang/String; = "BluetoothManager"


# instance fields
.field private final mBluetoothBle:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

.field private final mBluetoothBrEdr:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;

.field private final mBluetoothDiscovery:Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;

.field private mBluetoothOption:Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

.field private final mBluetoothPair:Lcom/jieli/bluetooth_connect/impl/BluetoothPair;

.field private final mBluetoothSpp:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;

.field private final mConnectedBtDevices:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/bluetooth/BluetoothDevice;",
            ">;"
        }
    .end annotation
.end field

.field private volatile mConnectedDevice:Landroid/bluetooth/BluetoothDevice;

.field private volatile mConnectingDevice:Landroid/bluetooth/BluetoothDevice;

.field private final mContext:Landroid/content/Context;

.field private final mEventCbManager:Lcom/jieli/bluetooth_connect/tool/BluetoothEventCbManager;

.field private final mHandler:Landroid/os/Handler;

.field private final mHistoryRecordDbHelper:Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;

.field private final mOnBrEdrListener:Lcom/jieli/bluetooth_connect/interfaces/listener/OnBrEdrListener;

.field private final mOnBtBleListener:Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtBleListener;

.field private final mOnBtDevicePairListener:Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDevicePairListener;

.field private final mOnBtDiscoveryListener:Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDiscoveryListener;

.field private final mOnBtSppListener:Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtSppListener;

.field private final mReConnectHelper:Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;

.field private mRemoveHistoryRecordTask:Lcom/jieli/bluetooth_connect/impl/BluetoothManager$RemoveHistoryRecordTask;

.field private final mSkipRecordSet:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/jieli/bluetooth_connect/bean/BluetoothOption;)V
    .locals 8
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "context",
            "option"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/jieli/bluetooth_connect/tool/BluetoothEventCbManager;

    invoke-direct {v0}, Lcom/jieli/bluetooth_connect/tool/BluetoothEventCbManager;-><init>()V

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mEventCbManager:Lcom/jieli/bluetooth_connect/tool/BluetoothEventCbManager;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mConnectedBtDevices:Ljava/util/List;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mSkipRecordSet:Ljava/util/Set;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/iIi111IO1;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/iIi111IO1;-><init>(Lcom/jieli/bluetooth_connect/impl/BluetoothManager;)V

    invoke-direct {v0, v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mHandler:Landroid/os/Handler;

    new-instance v0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager$2;

    invoke-direct {v0, p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager$2;-><init>(Lcom/jieli/bluetooth_connect/impl/BluetoothManager;)V

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mOnBtDiscoveryListener:Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDiscoveryListener;

    new-instance v1, Lcom/jieli/bluetooth_connect/impl/BluetoothManager$3;

    invoke-direct {v1, p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager$3;-><init>(Lcom/jieli/bluetooth_connect/impl/BluetoothManager;)V

    iput-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mOnBtDevicePairListener:Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDevicePairListener;

    new-instance v2, Lcom/jieli/bluetooth_connect/impl/BluetoothManager$4;

    invoke-direct {v2, p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager$4;-><init>(Lcom/jieli/bluetooth_connect/impl/BluetoothManager;)V

    iput-object v2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mOnBrEdrListener:Lcom/jieli/bluetooth_connect/interfaces/listener/OnBrEdrListener;

    new-instance v3, Lcom/jieli/bluetooth_connect/impl/BluetoothManager$5;

    invoke-direct {v3, p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager$5;-><init>(Lcom/jieli/bluetooth_connect/impl/BluetoothManager;)V

    iput-object v3, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mOnBtSppListener:Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtSppListener;

    new-instance v4, Lcom/jieli/bluetooth_connect/impl/BluetoothManager$6;

    invoke-direct {v4, p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager$6;-><init>(Lcom/jieli/bluetooth_connect/impl/BluetoothManager;)V

    iput-object v4, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mOnBtBleListener:Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtBleListener;

    invoke-static {p1}, Lcom/jieli/bluetooth_connect/util/ConnectUtil;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/content/Context;

    iput-object v5, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mContext:Landroid/content/Context;

    invoke-static {v5}, Lcom/jieli/bluetooth_connect/util/ConnectUtil;->setContext(Landroid/content/Context;)V

    if-nez p2, :cond_0

    invoke-static {}, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->createDefaultOption()Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    move-result-object p2

    :cond_0
    iput-object p2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothOption:Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    sget-object v5, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->TAG:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Lib name = "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/jieli/bluetooth_connect/constant/BluetoothConstant;->getLibVersionName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, ", option = "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, ",\n clazz : "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const-string v7, "init"

    invoke-static {v5, v7, v6}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v5, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;

    invoke-direct {v5, p1, p2, v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;-><init>(Landroid/content/Context;Lcom/jieli/bluetooth_connect/bean/BluetoothOption;Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDiscoveryListener;)V

    iput-object v5, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothDiscovery:Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;

    new-instance v0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;

    invoke-direct {v0, p1, v1}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;-><init>(Landroid/content/Context;Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDevicePairListener;)V

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothPair:Lcom/jieli/bluetooth_connect/impl/BluetoothPair;

    invoke-virtual {v0, p2}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->setBluetoothOption(Lcom/jieli/bluetooth_connect/bean/BluetoothOption;)V

    new-instance v1, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;

    invoke-direct {v1, p1, v0, v2}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;-><init>(Landroid/content/Context;Lcom/jieli/bluetooth_connect/impl/BluetoothPair;Lcom/jieli/bluetooth_connect/interfaces/listener/OnBrEdrListener;)V

    iput-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothBrEdr:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;

    invoke-virtual {v1, p2}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->setBluetoothOption(Lcom/jieli/bluetooth_connect/bean/BluetoothOption;)V

    new-instance v2, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;

    invoke-direct {v2, p1, v1, p2, v3}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;-><init>(Landroid/content/Context;Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;Lcom/jieli/bluetooth_connect/bean/BluetoothOption;Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtSppListener;)V

    iput-object v2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothSpp:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;

    new-instance v1, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-direct {v1, p1, v0, p2, v4}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;-><init>(Landroid/content/Context;Lcom/jieli/bluetooth_connect/impl/BluetoothPair;Lcom/jieli/bluetooth_connect/bean/BluetoothOption;Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtBleListener;)V

    iput-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothBle:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    new-instance p2, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;

    invoke-direct {p2, p1, p0}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;-><init>(Landroid/content/Context;Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;)V

    iput-object p2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mReConnectHelper:Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;

    new-instance p2, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothOption:Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    new-instance v1, Lcom/jieli/bluetooth_connect/impl/BluetoothManager$1;

    invoke-direct {v1, p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager$1;-><init>(Lcom/jieli/bluetooth_connect/impl/BluetoothManager;)V

    invoke-direct {p2, p1, v0, v1}, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;-><init>(Landroid/content/Context;Lcom/jieli/bluetooth_connect/bean/BluetoothOption;Lcom/jieli/bluetooth_connect/data/HistoryRecordObserver;)V

    iput-object p2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mHistoryRecordDbHelper:Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;

    return-void
.end method

.method public static synthetic OXO1(Lcom/jieli/bluetooth_connect/impl/BluetoothManager;Landroid/os/Message;)Z
    .locals 4

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v2, v0, Landroid/bluetooth/BluetoothDevice;

    if-nez v2, :cond_0

    return v1

    :cond_0
    check-cast v0, Landroid/bluetooth/BluetoothDevice;

    sget-object v1, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "device : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "MSG_RECONNECT_DEVICE"

    invoke-static {v1, v3, v2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget p1, p1, Landroid/os/Message;->arg1:I

    invoke-virtual {p0, v0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->connectBtDevice(Landroid/bluetooth/BluetoothDevice;I)Z

    goto :goto_0

    :pswitch_1
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Landroid/bluetooth/BluetoothDevice;

    if-eqz p1, :cond_2

    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->isConnectedDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object p0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mEventCbManager:Lcom/jieli/bluetooth_connect/tool/BluetoothEventCbManager;

    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0}, Lcom/jieli/bluetooth_connect/tool/BluetoothEventCbManager;->onConnection(Landroid/bluetooth/BluetoothDevice;I)V

    goto :goto_0

    :pswitch_2
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Landroid/bluetooth/BluetoothDevice;

    if-eqz p1, :cond_2

    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->isConnectedDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "connect timeout, device : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->printDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "MSG_CONNECT_DEVICE_TIMEOUT"

    invoke-static {v0, v3, v2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, p1, v1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->notifyConnectionStatus(Landroid/bluetooth/BluetoothDevice;I)V

    invoke-virtual {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->isConnecting()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->disconnectBtDevice(Landroid/bluetooth/BluetoothDevice;)V

    :cond_1
    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->setConnectingDevice(Landroid/bluetooth/BluetoothDevice;)V

    :cond_2
    :goto_0
    const/4 p0, 0x1

    return p0

    :pswitch_data_0
    .packed-switch 0x1010
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static synthetic XIi00iiXO(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;Z[B)V
    .locals 1

    sget-object v0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->TAG:Ljava/lang/String;

    invoke-static {p4}, Lcom/jieli/bluetooth_connect/util/CHexConverter;->byte2HexStr([B)Ljava/lang/String;

    move-result-object p4

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    filled-new-array {p0, p1, p2, p4, p3}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "---> device : %s, serviceUUID:[%s], characteristicUUID:[%s], data:%s, result:%s"

    invoke-static {p1, p0}, Lcom/jieli/bluetooth_connect/util/ConnectUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "writeDataToBLEDevice"

    invoke-static {v0, p1, p0}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic access$000(Lcom/jieli/bluetooth_connect/impl/BluetoothManager;)Lcom/jieli/bluetooth_connect/tool/BluetoothEventCbManager;
    .locals 0

    iget-object p0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mEventCbManager:Lcom/jieli/bluetooth_connect/tool/BluetoothEventCbManager;

    return-object p0
.end method

.method public static synthetic access$100(Lcom/jieli/bluetooth_connect/impl/BluetoothManager;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->syncSystemBtDeviceList(Z)V

    return-void
.end method

.method public static synthetic access$1002(Lcom/jieli/bluetooth_connect/impl/BluetoothManager;Lcom/jieli/bluetooth_connect/impl/BluetoothManager$RemoveHistoryRecordTask;)Lcom/jieli/bluetooth_connect/impl/BluetoothManager$RemoveHistoryRecordTask;
    .locals 0

    iput-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mRemoveHistoryRecordTask:Lcom/jieli/bluetooth_connect/impl/BluetoothManager$RemoveHistoryRecordTask;

    return-object p1
.end method

.method public static synthetic access$200()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method public static synthetic access$300(Lcom/jieli/bluetooth_connect/impl/BluetoothManager;Landroid/bluetooth/BluetoothDevice;I)Z
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->notifyRemoveHistoryRecordTask(Landroid/bluetooth/BluetoothDevice;I)Z

    move-result p0

    return p0
.end method

.method public static synthetic access$400(Lcom/jieli/bluetooth_connect/impl/BluetoothManager;)Lcom/jieli/bluetooth_connect/bean/BluetoothOption;
    .locals 0

    iget-object p0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothOption:Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    return-object p0
.end method

.method public static synthetic access$500(Lcom/jieli/bluetooth_connect/impl/BluetoothManager;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mContext:Landroid/content/Context;

    return-object p0
.end method

.method public static synthetic access$600(Lcom/jieli/bluetooth_connect/impl/BluetoothManager;)Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;
    .locals 0

    iget-object p0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mHistoryRecordDbHelper:Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;

    return-object p0
.end method

.method public static synthetic access$700(Lcom/jieli/bluetooth_connect/impl/BluetoothManager;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mHandler:Landroid/os/Handler;

    return-object p0
.end method

.method public static synthetic access$800(Lcom/jieli/bluetooth_connect/impl/BluetoothManager;Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->printDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic access$900(Lcom/jieli/bluetooth_connect/impl/BluetoothManager;Landroid/bluetooth/BluetoothDevice;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->notifyConnectionStatus(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method private changeConnectedDevice(Landroid/bluetooth/BluetoothDevice;)V
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mConnectedDevice:Landroid/bluetooth/BluetoothDevice;

    invoke-static {v0, p1}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->deviceEquals(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mConnectedDevice:Landroid/bluetooth/BluetoothDevice;

    iput-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mConnectedDevice:Landroid/bluetooth/BluetoothDevice;

    if-eqz v0, :cond_2

    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->isConnectedDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothBle:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->isConnectedBleDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothBle:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->setConnectedBleDevice(Landroid/bluetooth/BluetoothDevice;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothSpp:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;

    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->isConnectedSppDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothSpp:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;

    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->setConnectedSppDevice(Landroid/bluetooth/BluetoothDevice;)V

    :cond_1
    :goto_0
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->getHistoryRecord(Ljava/lang/String;)Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->setOnlineTime(J)V

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mHistoryRecordDbHelper:Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;

    invoke-virtual {v1, v0}, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->updateHistoryRecord(Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;)V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mEventCbManager:Lcom/jieli/bluetooth_connect/tool/BluetoothEventCbManager;

    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/tool/BluetoothEventCbManager;->onSwitchConnectedDevice(Landroid/bluetooth/BluetoothDevice;)V

    :cond_2
    sget-object v0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "device : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->printDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "changeConnectedDevice"

    invoke-static {v0, v1, p1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    return-void
.end method

.method private checkIsValidDevice(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->getConnectingDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-static {p1, v1}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->deviceEquals(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->getConnectingBrEdrDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-static {p1, v1}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->deviceEquals(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->isConnectedDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->getHistoryRecord(Ljava/lang/String;)Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;

    move-result-object v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mConnectedBtDevices:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    return v0

    :cond_2
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method private notifyConnectionStatus(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 9
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

    invoke-direct {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->checkIsValidDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    sget-object v1, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "device : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->printDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", checkIsValidDevice : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, ", status : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Lcom/jieli/bluetooth_connect/constant/BluetoothConstant;->printBtConnection(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v4, "notifyConnectionStatus"

    invoke-static {v1, v4, v2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v0, :cond_8

    const/4 v0, 0x1

    if-eq p2, v0, :cond_7

    invoke-virtual {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->getConnectingDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    invoke-static {p1, v2}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->deviceEquals(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    invoke-direct {p0, v2}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->setConnectingDevice(Landroid/bluetooth/BluetoothDevice;)V

    iget-object v2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mHandler:Landroid/os/Handler;

    const/16 v5, 0x1010

    invoke-virtual {v2, v5}, Landroid/os/Handler;->removeMessages(I)V

    :cond_0
    if-eqz p2, :cond_6

    const/4 v0, 0x2

    if-eq p2, v0, :cond_1

    goto/16 :goto_1

    :cond_1
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mConnectedBtDevices:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mConnectedBtDevices:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mConnectedDevice:Landroid/bluetooth/BluetoothDevice;

    if-nez v0, :cond_3

    invoke-direct {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->changeConnectedDevice(Landroid/bluetooth/BluetoothDevice;)V

    :cond_3
    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->isConnectedSppDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    iget-object v2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mSkipRecordSet:Ljava/util/Set;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    iget-object v2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mHistoryRecordDbHelper:Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;

    invoke-virtual {v2, p1, v0}, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->saveHistoryRecord(Landroid/bluetooth/BluetoothDevice;I)V

    iget-object v2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mConnectedDevice:Landroid/bluetooth/BluetoothDevice;

    if-eqz v2, :cond_5

    iget-object v2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mConnectedDevice:Landroid/bluetooth/BluetoothDevice;

    invoke-static {v2, p1}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->deviceEquals(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v2

    if-nez v2, :cond_5

    iget-object v2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mConnectedDevice:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v2}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->getHistoryRecord(Ljava/lang/String;)Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    const-wide/16 v7, 0xc8

    add-long/2addr v5, v7

    invoke-virtual {v2, v5, v6}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->setOnlineTime(J)V

    iget-object v5, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mHistoryRecordDbHelper:Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;

    invoke-virtual {v5, v2}, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->updateHistoryRecord(Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;)V

    goto :goto_0

    :cond_4
    iget-object v2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mSkipRecordSet:Ljava/util/Set;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v5}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    :cond_5
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "CONNECTION_OK, connected List : "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->getConnectedDeviceList()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, ", connectWay : "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v4, v2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-nez v0, :cond_7

    invoke-virtual {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->getBluetoothOption()Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->isNeedChangeBleMtu()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->getBluetoothOption()Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->getMtu()I

    move-result v0

    const/16 v2, 0x14

    if-le v0, v2, :cond_7

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothBle:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-virtual {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->getBluetoothOption()Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    move-result-object v2

    invoke-virtual {v2}, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->getMtu()I

    move-result v2

    invoke-virtual {v0, p1, v2}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->requestBleMtu(Landroid/bluetooth/BluetoothDevice;I)Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object p2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mHandler:Landroid/os/Handler;

    const/16 v0, 0x1011

    invoke-virtual {p2, v0}, Landroid/os/Handler;->removeMessages(I)V

    iget-object p2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mHandler:Landroid/os/Handler;

    invoke-virtual {p2, v0, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    const-wide/16 v0, 0x1770

    invoke-virtual {p2, p1, v0, v1}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void

    :cond_6
    invoke-direct {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->removeDevice(Landroid/bluetooth/BluetoothDevice;)V

    invoke-direct {p0, p1, v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->notifyRemoveHistoryRecordTask(Landroid/bluetooth/BluetoothDevice;I)Z

    :cond_7
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onConnection ---> device : "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->printDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Lcom/jieli/bluetooth_connect/constant/BluetoothConstant;->printBtConnection(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v4, v0}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mEventCbManager:Lcom/jieli/bluetooth_connect/tool/BluetoothEventCbManager;

    invoke-virtual {v0, p1, p2}, Lcom/jieli/bluetooth_connect/tool/BluetoothEventCbManager;->onConnection(Landroid/bluetooth/BluetoothDevice;I)V

    :cond_8
    return-void
.end method

.method private notifyRemoveHistoryRecordTask(Landroid/bluetooth/BluetoothDevice;I)Z
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "device",
            "way"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mRemoveHistoryRecordTask:Lcom/jieli/bluetooth_connect/impl/BluetoothManager$RemoveHistoryRecordTask;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    if-eqz p1, :cond_3

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mRemoveHistoryRecordTask:Lcom/jieli/bluetooth_connect/impl/BluetoothManager$RemoveHistoryRecordTask;

    iget-object v3, v3, Lcom/jieli/bluetooth_connect/impl/BluetoothManager$RemoveHistoryRecordTask;->disconnectAddress:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :cond_0
    if-eq p2, v0, :cond_2

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mRemoveHistoryRecordTask:Lcom/jieli/bluetooth_connect/impl/BluetoothManager$RemoveHistoryRecordTask;

    iget-object v3, v3, Lcom/jieli/bluetooth_connect/impl/BluetoothManager$RemoveHistoryRecordTask;->removeAddress:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    :cond_1
    move v1, v0

    :cond_2
    if-eqz v1, :cond_3

    sget-object v0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "device = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", way = "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "notifyRemoveHistoryRecordTask"

    invoke-static {v0, p2, p1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mHandler:Landroid/os/Handler;

    iget-object p2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mRemoveHistoryRecordTask:Lcom/jieli/bluetooth_connect/impl/BluetoothManager$RemoveHistoryRecordTask;

    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mHandler:Landroid/os/Handler;

    iget-object p2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mRemoveHistoryRecordTask:Lcom/jieli/bluetooth_connect/impl/BluetoothManager$RemoveHistoryRecordTask;

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_3
    return v1
.end method

.method private printDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mContext:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->printBtDeviceInfo(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private removeDevice(Landroid/bluetooth/BluetoothDevice;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mConnectedBtDevices:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->getConnectedDeviceList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->changeConnectedDevice(Landroid/bluetooth/BluetoothDevice;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mConnectedDevice:Landroid/bluetooth/BluetoothDevice;

    invoke-static {v0, p1}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->deviceEquals(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mConnectedBtDevices:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/bluetooth/BluetoothDevice;

    invoke-direct {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->changeConnectedDevice(Landroid/bluetooth/BluetoothDevice;)V

    :cond_1
    return-void
.end method

.method private setConnectingDevice(Landroid/bluetooth/BluetoothDevice;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mConnectingDevice:Landroid/bluetooth/BluetoothDevice;

    return-void
.end method

.method private startRemoveHistoryRecordTask(Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;Lcom/jieli/bluetooth_connect/interfaces/callback/OnHistoryRecordCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "historyRecord",
            "callback"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mRemoveHistoryRecordTask:Lcom/jieli/bluetooth_connect/impl/BluetoothManager$RemoveHistoryRecordTask;

    if-eqz v0, :cond_1

    if-eqz p2, :cond_0

    const/4 p1, 0x7

    invoke-static {p1}, Lcom/jieli/bluetooth_connect/bean/ErrorInfo;->getErrDesc(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, p1, v0}, Lcom/jieli/bluetooth_connect/interfaces/callback/OnHistoryRecordCallback;->onFailed(ILjava/lang/String;)V

    :cond_0
    return-void

    :cond_1
    new-instance v0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager$RemoveHistoryRecordTask;

    invoke-direct {v0, p0, p1, p2}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager$RemoveHistoryRecordTask;-><init>(Lcom/jieli/bluetooth_connect/impl/BluetoothManager;Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;Lcom/jieli/bluetooth_connect/interfaces/callback/OnHistoryRecordCallback;)V

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mRemoveHistoryRecordTask:Lcom/jieli/bluetooth_connect/impl/BluetoothManager$RemoveHistoryRecordTask;

    iget-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mHandler:Landroid/os/Handler;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private stopRemoveHistoryRecordTask()V
    .locals 2

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mRemoveHistoryRecordTask:Lcom/jieli/bluetooth_connect/impl/BluetoothManager$RemoveHistoryRecordTask;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mHandler:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mRemoveHistoryRecordTask:Lcom/jieli/bluetooth_connect/impl/BluetoothManager$RemoveHistoryRecordTask;

    :cond_0
    return-void
.end method

.method private syncSystemBtDeviceList(Z)V
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "isBleWay"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/jieli/bluetooth_connect/util/ConnectUtil;->isHasConnectPermission(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->getSystemConnectedBtDeviceList(Landroid/content/Context;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothOption:Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    invoke-virtual {v1}, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->getScanFilterData()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {p0, v2}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->isConnectedDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->getDiscoveredBluetoothDevices()Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual {v2}, Landroid/bluetooth/BluetoothDevice;->getType()I

    move-result v3

    if-eqz p1, :cond_3

    const/4 v4, 0x2

    if-eq v3, v4, :cond_4

    const/4 v4, 0x3

    if-eq v3, v4, :cond_4

    :cond_3
    invoke-virtual {v2}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_2

    if-eqz v1, :cond_2

    invoke-virtual {v2}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    :cond_4
    new-instance v3, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    invoke-direct {v3}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;-><init>()V

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setEnableConnect(Z)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    iget-object v4, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mEventCbManager:Lcom/jieli/bluetooth_connect/tool/BluetoothEventCbManager;

    invoke-virtual {v4, v2, v3}, Lcom/jieli/bluetooth_connect/tool/BluetoothEventCbManager;->onDiscovery(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;)V

    goto :goto_0

    :cond_5
    :goto_1
    return-void
.end method


# virtual methods
.method public addListener(Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDevicePairListener;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "listener"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothPair:Lcom/jieli/bluetooth_connect/impl/BluetoothPair;

    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->addListener(Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDevicePairListener;)V

    return-void
.end method

.method public bridge synthetic addListener(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000
        }
        names = {
            "listener"
        }
    .end annotation

    .line 1
    check-cast p1, Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDevicePairListener;

    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->addListener(Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDevicePairListener;)V

    return-void
.end method

.method public clearHistoryRecords()V
    .locals 1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mHistoryRecordDbHelper:Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->clearAllHistoryRecord()V

    return-void
.end method

.method public connectBLEDevice(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothBle:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->connectBLEDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    return p1
.end method

.method public connectBtDevice(Landroid/bluetooth/BluetoothDevice;I)Z
    .locals 8
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "device",
            "connectWay"
        }
    .end annotation

    sget-object v0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "device : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->printDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", connectWay = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "connectBtDevice"

    invoke-static {v0, v2, v1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_9

    iget-object v3, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mContext:Landroid/content/Context;

    invoke-static {v3}, Lcom/jieli/bluetooth_connect/util/ConnectUtil;->isHasConnectPermission(Landroid/content/Context;)Z

    move-result v3

    if-nez v3, :cond_0

    goto/16 :goto_0

    :cond_0
    invoke-static {}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->isBluetoothEnable()Z

    move-result v3

    if-nez v3, :cond_1

    const-string p1, "isBluetoothEnabled : false."

    invoke-static {v0, v2, p1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_1
    invoke-virtual {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->isConnecting()Z

    move-result v3

    if-eqz v3, :cond_2

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "device is connecting. device : "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->getConnectingDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p2

    invoke-direct {p0, p2}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->printDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v2, p1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_2
    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->isConnectedDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v1

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_3

    const-string p2, "Device is connected."

    invoke-static {v0, v2, p2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, p1, v3}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->notifyConnectionStatus(Landroid/bluetooth/BluetoothDevice;I)V

    return v4

    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "isUseMultiDevice : "

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothOption:Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    invoke-virtual {v5}, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->isUseMultiDevice()Z

    move-result v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v2, v1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothOption:Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    invoke-virtual {v1}, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->isUseMultiDevice()Z

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "connectedDevice : "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0, v1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->printDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v0, v2, v5}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v1, :cond_4

    invoke-static {v1, p1}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->deviceEquals(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v5

    if-nez v5, :cond_4

    invoke-virtual {p0, v1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->disconnectBtDevice(Landroid/bluetooth/BluetoothDevice;)V

    const-wide/16 v5, 0x12c

    invoke-static {v5, v6}, Landroid/os/SystemClock;->sleep(J)V

    :cond_4
    invoke-direct {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->setConnectingDevice(Landroid/bluetooth/BluetoothDevice;)V

    invoke-direct {p0, p1, v4}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->notifyConnectionStatus(Landroid/bluetooth/BluetoothDevice;I)V

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mHandler:Landroid/os/Handler;

    const/16 v5, 0x1010

    invoke-virtual {v1, v5}, Landroid/os/Handler;->removeMessages(I)V

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mHandler:Landroid/os/Handler;

    invoke-virtual {v1, v5, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v5

    const-wide/32 v6, 0x9c40

    invoke-virtual {v1, v5, v6, v7}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getType()I

    move-result v1

    if-eqz v1, :cond_7

    if-eq v1, v4, :cond_6

    if-eq v1, v3, :cond_5

    const/4 v3, 0x3

    if-eq v1, v3, :cond_7

    return v4

    :cond_5
    const-string p2, "connectBLEDevice by device type"

    invoke-static {v0, v2, p2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->connectBLEDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    return p1

    :cond_6
    const-string p2, "connectSPPDevice by device type"

    invoke-static {v0, v2, p2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->connectSPPDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    return p1

    :cond_7
    if-nez p2, :cond_8

    const-string p2, "connectBLEDevice by connectWay"

    invoke-static {v0, v2, p2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->connectBLEDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    return p1

    :cond_8
    const-string p2, "connectSPPDevice by connectWay"

    invoke-static {v0, v2, p2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->connectSPPDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    return p1

    :cond_9
    :goto_0
    const-string p1, "device is null"

    invoke-static {v0, v2, p1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v1
.end method

.method public connectBtDeviceWithoutRecord(Landroid/bluetooth/BluetoothDevice;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "device",
            "connectWay"
        }
    .end annotation

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mSkipRecordSet:Ljava/util/Set;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->connectBtDevice(Landroid/bluetooth/BluetoothDevice;I)Z

    move-result p1

    return p1
.end method

.method public connectByProfiles(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothBrEdr:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;

    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->connectByProfiles(Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    return p1
.end method

.method public connectHistoryRecord(Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;Lcom/jieli/bluetooth_connect/interfaces/callback/OnHistoryRecordCallback;)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "record",
            "callback"
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getDevType()I

    move-result v0

    const/4 v1, 0x5

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_2

    invoke-virtual {p1}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getSdkFlag()I

    move-result v0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_2

    invoke-virtual {p1}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getSdkFlag()I

    move-result v0

    const/16 v1, 0x9

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    move v0, v3

    goto :goto_1

    :cond_2
    :goto_0
    move v0, v2

    :goto_1
    invoke-virtual {p1}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getConnectType()I

    move-result v1

    if-ne v1, v2, :cond_3

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getMappedAddress()Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getAddress()Ljava/lang/String;

    move-result-object v1

    :goto_2
    if-eqz v0, :cond_4

    move v0, v3

    goto :goto_3

    :cond_4
    invoke-virtual {p1}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getConnectType()I

    move-result v0

    :goto_3
    invoke-virtual {p1}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getUpdateAddress()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/bluetooth/BluetoothAdapter;->checkBluetoothAddress(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {p1}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getUpdateAddress()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    invoke-virtual {p1}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getUpdateAddress()Ljava/lang/String;

    move-result-object v1

    goto :goto_4

    :cond_5
    move v3, v0

    :goto_4
    iget-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mReConnectHelper:Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;

    invoke-virtual {p1, v1, v3, p2}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->reconnectDevice(Ljava/lang/String;ILcom/jieli/bluetooth_connect/interfaces/callback/OnHistoryRecordCallback;)V

    return-void
.end method

.method public connectSPPDevice(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothSpp:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;

    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->connectSPPDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    return p1
.end method

.method public destroy()V
    .locals 3

    sget-object v0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->TAG:Ljava/lang/String;

    const-string v1, "destroy"

    const-string v2, ""

    invoke-static {v0, v1, v2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->stopRemoveHistoryRecordTask()V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothBle:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mOnBtBleListener:Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtBleListener;

    invoke-virtual {v0, v1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->removeListener(Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtBleListener;)V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothBle:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->destroy()V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothSpp:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mOnBtSppListener:Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtSppListener;

    invoke-virtual {v0, v1}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->removeListener(Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtSppListener;)V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothSpp:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->destroy()V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothBrEdr:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mOnBrEdrListener:Lcom/jieli/bluetooth_connect/interfaces/listener/OnBrEdrListener;

    invoke-virtual {v0, v1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->removeListener(Lcom/jieli/bluetooth_connect/interfaces/listener/OnBrEdrListener;)V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothBrEdr:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->destroy()V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothPair:Lcom/jieli/bluetooth_connect/impl/BluetoothPair;

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mOnBtDevicePairListener:Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDevicePairListener;

    invoke-virtual {v0, v1}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->removeListener(Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDevicePairListener;)V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothPair:Lcom/jieli/bluetooth_connect/impl/BluetoothPair;

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->destroy()V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothDiscovery:Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mOnBtDiscoveryListener:Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDiscoveryListener;

    invoke-virtual {v0, v1}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->removeListener(Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDiscoveryListener;)V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothDiscovery:Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->destroy()V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mEventCbManager:Lcom/jieli/bluetooth_connect/tool/BluetoothEventCbManager;

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/tool/BluetoothEventCbManager;->destroy()V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mConnectedBtDevices:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mSkipRecordSet:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mReConnectHelper:Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->destroy()V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mHistoryRecordDbHelper:Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->destroy()V

    return-void
.end method

.method public disconnectBLEDevice(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothBle:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->disconnectBLEDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    return p1
.end method

.method public disconnectBtDevice(Landroid/bluetooth/BluetoothDevice;)V
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation

    sget-object v0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "device : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->printDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "disconnectBtDevice"

    invoke-static {v0, v2, v1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-nez p1, :cond_0

    const-string p1, "device is null."

    invoke-static {v0, v2, p1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->isConnectedBLEDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->disconnectBLEDevice(Landroid/bluetooth/BluetoothDevice;)Z

    return-void

    :cond_1
    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->isConnectedSppDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->disconnectSPPDevice(Landroid/bluetooth/BluetoothDevice;)Z

    return-void

    :cond_2
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->notifyConnectionStatus(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public disconnectByProfiles(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothBrEdr:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;

    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->disconnectByProfiles(Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    return p1
.end method

.method public disconnectSPPDevice(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothSpp:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;

    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->disconnectSPPDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    return p1
.end method

.method public fastConnect()V
    .locals 3

    invoke-virtual {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->getHistoryRecordList()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;

    iget-object v2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mReConnectHelper:Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;

    invoke-virtual {v2, v1}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->reconnectHistory(Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;)V

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public getActivityBluetoothDevice()Landroid/bluetooth/BluetoothDevice;
    .locals 1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothBrEdr:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->getActivityBluetoothDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    return-object v0
.end method

.method public getBleMtu(Landroid/bluetooth/BluetoothDevice;)I
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothBle:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->getBleMtu(Landroid/bluetooth/BluetoothDevice;)I

    move-result p1

    return p1
.end method

.method public getBluetoothBle()Lcom/jieli/bluetooth_connect/impl/BluetoothBle;
    .locals 1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothBle:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    return-object v0
.end method

.method public getBluetoothBrEdr()Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;
    .locals 1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothBrEdr:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;

    return-object v0
.end method

.method public getBluetoothOption()Lcom/jieli/bluetooth_connect/bean/BluetoothOption;
    .locals 1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothOption:Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    return-object v0
.end method

.method public getBluetoothPair()Lcom/jieli/bluetooth_connect/impl/BluetoothPair;
    .locals 1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothPair:Lcom/jieli/bluetooth_connect/impl/BluetoothPair;

    return-object v0
.end method

.method public getBluetoothSpp()Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;
    .locals 1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothSpp:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;

    return-object v0
.end method

.method public getConnectedBluetoothGatt()Landroid/bluetooth/BluetoothGatt;
    .locals 1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothBle:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->getConnectedBluetoothGatt()Landroid/bluetooth/BluetoothGatt;

    move-result-object v0

    return-object v0
.end method

.method public getConnectedDevice()Landroid/bluetooth/BluetoothDevice;
    .locals 2

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mConnectedDevice:Landroid/bluetooth/BluetoothDevice;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mConnectedBtDevices:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mConnectedBtDevices:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/bluetooth/BluetoothDevice;

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mConnectedDevice:Landroid/bluetooth/BluetoothDevice;

    :cond_0
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mConnectedDevice:Landroid/bluetooth/BluetoothDevice;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothBle:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->getConnectedBleDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mConnectedDevice:Landroid/bluetooth/BluetoothDevice;

    :cond_1
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mConnectedDevice:Landroid/bluetooth/BluetoothDevice;

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothSpp:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->getConnectedSPPDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mConnectedDevice:Landroid/bluetooth/BluetoothDevice;

    :cond_2
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mConnectedDevice:Landroid/bluetooth/BluetoothDevice;

    return-object v0
.end method

.method public getConnectedDeviceList()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/bluetooth/BluetoothDevice;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mConnectedBtDevices:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public getConnectedSppList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/bluetooth/BluetoothDevice;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothSpp:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->getConnectedSppDevices()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getConnectingBrEdrDevice()Landroid/bluetooth/BluetoothDevice;
    .locals 1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothBrEdr:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->getConnectingBrEdrDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    return-object v0
.end method

.method public getConnectingDevice()Landroid/bluetooth/BluetoothDevice;
    .locals 1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mConnectingDevice:Landroid/bluetooth/BluetoothDevice;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothBle:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->getConnectingBleDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mConnectingDevice:Landroid/bluetooth/BluetoothDevice;

    :cond_0
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mConnectingDevice:Landroid/bluetooth/BluetoothDevice;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothSpp:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->getSppConnectingDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mConnectingDevice:Landroid/bluetooth/BluetoothDevice;

    :cond_1
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mConnectingDevice:Landroid/bluetooth/BluetoothDevice;

    return-object v0
.end method

.method public getDeviceGatt(Landroid/bluetooth/BluetoothDevice;)Landroid/bluetooth/BluetoothGatt;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothBle:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->getDeviceGatt(Landroid/bluetooth/BluetoothDevice;)Landroid/bluetooth/BluetoothGatt;

    move-result-object p1

    return-object p1
.end method

.method public getDiscoveredBluetoothDevices()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Landroid/bluetooth/BluetoothDevice;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothDiscovery:Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->getDiscoveredBluetoothDevices()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public getHistoryRecord(Ljava/lang/String;)Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "devAddress"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mHistoryRecordDbHelper:Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;

    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->getHistoryRecordByMac(Ljava/lang/String;)Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;

    move-result-object p1

    return-object p1
.end method

.method public getHistoryRecordHelper()Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;
    .locals 1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mHistoryRecordDbHelper:Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;

    return-object v0
.end method

.method public getHistoryRecordList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mHistoryRecordDbHelper:Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->getHistoryRecordList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getMappedDeviceAddress(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "deviceAddress"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mHistoryRecordDbHelper:Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;

    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->getMappedAddress(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getPairedDevices()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/bluetooth/BluetoothDevice;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothPair:Lcom/jieli/bluetooth_connect/impl/BluetoothPair;

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->getPairedDevices()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getScanType()I
    .locals 1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothDiscovery:Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->getScanType()I

    move-result v0

    return v0
.end method

.method public isBrEdrConnecting()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothBrEdr:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->isBrEdrConnecting()Z

    move-result v0

    return v0
.end method

.method public isConnectedBLEDevice(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothBle:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->isConnectedBleDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    return p1
.end method

.method public isConnectedByA2dp(Landroid/bluetooth/BluetoothDevice;)I
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothBrEdr:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;

    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->isConnectedByA2dp(Landroid/bluetooth/BluetoothDevice;)I

    move-result p1

    return p1
.end method

.method public isConnectedByHfp(Landroid/bluetooth/BluetoothDevice;)I
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothBrEdr:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;

    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->isConnectedByHfp(Landroid/bluetooth/BluetoothDevice;)I

    move-result p1

    return p1
.end method

.method public isConnectedByProfile(Landroid/bluetooth/BluetoothDevice;)I
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothBrEdr:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;

    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->isConnectedByProfile(Landroid/bluetooth/BluetoothDevice;)I

    move-result p1

    return p1
.end method

.method public isConnectedDevice(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 5
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothBle:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->isConnectedBleDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothSpp:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;

    invoke-virtual {v1, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->isConnectedSppDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v1

    sget-object v2, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "device : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", isBleConnected = "

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p1, ", isSppConnected = "

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v3, "isConnectedDevice"

    invoke-static {v2, v3, p1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-nez v0, :cond_1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public isConnectedSppDevice(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothSpp:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;

    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->isConnectedSppDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    return p1
.end method

.method public isConnecting()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mConnectingDevice:Landroid/bluetooth/BluetoothDevice;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothBle:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->isBleConnecting()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothSpp:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->isSppConnecting()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public isMatchDevice(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "device1",
            "device2"
        }
    .end annotation

    if-eqz p1, :cond_2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->deviceEquals(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->getMappedDeviceAddress(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    return v0

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public isPaired(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothPair:Lcom/jieli/bluetooth_connect/impl/BluetoothPair;

    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->isPaired(Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    return p1
.end method

.method public isPairing(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothPair:Lcom/jieli/bluetooth_connect/impl/BluetoothPair;

    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->isPairing(Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    return p1
.end method

.method public isReconnectDevice()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mReConnectHelper:Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->isReconnecting()Z

    move-result v0

    return v0
.end method

.method public isScanning()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothDiscovery:Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->isScanning()Z

    move-result v0

    return v0
.end method

.method public pair(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothPair:Lcom/jieli/bluetooth_connect/impl/BluetoothPair;

    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->pair(Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    return p1
.end method

.method public pair(Landroid/bluetooth/BluetoothDevice;I)Z
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "device",
            "pairWay"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothPair:Lcom/jieli/bluetooth_connect/impl/BluetoothPair;

    invoke-virtual {v0, p1, p2}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->pair(Landroid/bluetooth/BluetoothDevice;I)Z

    move-result p1

    return p1
.end method

.method public registerBluetoothCallback(Lcom/jieli/bluetooth_connect/interfaces/callback/BluetoothEventCallback;)Z
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "bluetoothCallback"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mEventCbManager:Lcom/jieli/bluetooth_connect/tool/BluetoothEventCbManager;

    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/tool/BluetoothEventCbManager;->addListener(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public removeHistoryRecord(Ljava/lang/String;Lcom/jieli/bluetooth_connect/interfaces/callback/OnHistoryRecordCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "address",
            "callback"
        }
    .end annotation

    invoke-static {p1}, Landroid/bluetooth/BluetoothAdapter;->checkBluetoothAddress(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    if-eqz p2, :cond_1

    const/4 p1, 0x1

    const-string v0, "address is error."

    invoke-interface {p2, p1, v0}, Lcom/jieli/bluetooth_connect/interfaces/callback/OnHistoryRecordCallback;->onFailed(ILjava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->getHistoryRecord(Ljava/lang/String;)Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;

    move-result-object p1

    if-nez p1, :cond_2

    if-eqz p2, :cond_1

    const/4 p1, 0x0

    invoke-interface {p2, p1}, Lcom/jieli/bluetooth_connect/interfaces/callback/OnHistoryRecordCallback;->onSuccess(Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;)V

    :cond_1
    return-void

    :cond_2
    invoke-direct {p0, p1, p2}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->startRemoveHistoryRecordTask(Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;Lcom/jieli/bluetooth_connect/interfaces/callback/OnHistoryRecordCallback;)V

    return-void
.end method

.method public removeListener(Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDevicePairListener;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "listener"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothPair:Lcom/jieli/bluetooth_connect/impl/BluetoothPair;

    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->removeListener(Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDevicePairListener;)V

    return-void
.end method

.method public bridge synthetic removeListener(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000
        }
        names = {
            "listener"
        }
    .end annotation

    .line 1
    check-cast p1, Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDevicePairListener;

    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->removeListener(Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDevicePairListener;)V

    return-void
.end method

.method public requestBleMtu(Landroid/bluetooth/BluetoothDevice;I)Z
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "device",
            "mtu"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothBle:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-virtual {v0, p1, p2}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->requestBleMtu(Landroid/bluetooth/BluetoothDevice;I)Z

    move-result p1

    return p1
.end method

.method public sendDataToDevice(Landroid/bluetooth/BluetoothDevice;[B)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "device",
            "data"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    if-eqz p2, :cond_2

    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->isConnectedDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->isConnectedBLEDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->getBluetoothOption()Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->getBleServiceUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->getBluetoothOption()Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    move-result-object v1

    invoke-virtual {v1}, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->getBleWriteUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {p0, p1, v0, v1, p2}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->writeDataToBLEDevice(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;[B)Z

    move-result p1

    return p1

    :cond_1
    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->isConnectedSppDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0, p1, p2}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->writeDataToSppDevice(Landroid/bluetooth/BluetoothDevice;[B)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    return v0
.end method

.method public setActivityBluetoothDevice(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothBrEdr:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;

    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->setActivityBluetoothDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    return p1
.end method

.method public setBluetoothOption(Lcom/jieli/bluetooth_connect/bean/BluetoothOption;)V
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "bluetoothOption"
        }
    .end annotation

    if-nez p1, :cond_0

    invoke-static {}, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->createDefaultOption()Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothOption:Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    sget-object v0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "setBluetoothOption"

    invoke-static {v0, v2, v1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothBle:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->setBluetoothOption(Lcom/jieli/bluetooth_connect/bean/BluetoothOption;)V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothSpp:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;

    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->setBluetoothOption(Lcom/jieli/bluetooth_connect/bean/BluetoothOption;)V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothBrEdr:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;

    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->setBluetoothOption(Lcom/jieli/bluetooth_connect/bean/BluetoothOption;)V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothPair:Lcom/jieli/bluetooth_connect/impl/BluetoothPair;

    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->setBluetoothOption(Lcom/jieli/bluetooth_connect/bean/BluetoothOption;)V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothDiscovery:Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;

    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->setBluetoothOption(Lcom/jieli/bluetooth_connect/bean/BluetoothOption;)V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mHistoryRecordDbHelper:Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;

    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->syncSystemDeviceList(Lcom/jieli/bluetooth_connect/bean/BluetoothOption;)V

    return-void
.end method

.method public setConnectedDevice(Landroid/bluetooth/BluetoothDevice;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->isConnectedDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mConnectedDevice:Landroid/bluetooth/BluetoothDevice;

    invoke-static {v0, p1}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->deviceEquals(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->changeConnectedDevice(Landroid/bluetooth/BluetoothDevice;)V

    :cond_0
    return-void
.end method

.method public startBLEScan(J)Z
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "timeout"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothDiscovery:Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;

    invoke-virtual {v0, p1, p2}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->startBLEScan(J)Z

    move-result p1

    return p1
.end method

.method public startConnectByBreProfiles(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "breDevice"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothBrEdr:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;

    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->connectBrEdrDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    return p1
.end method

.method public startDeviceScan(IJ)Z
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "type",
            "timeout"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothDiscovery:Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;

    invoke-virtual {v0, p1, p2, p3}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->startDeviceScan(IJ)Z

    move-result p1

    return p1
.end method

.method public startDeviceScan(J)Z
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "timeout"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothDiscovery:Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;

    invoke-virtual {v0, p1, p2}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->startDeviceScan(J)Z

    move-result p1

    return p1
.end method

.method public stopBLEScan()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothDiscovery:Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->stopBLEScan()Z

    move-result v0

    return v0
.end method

.method public stopDeviceScan()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothDiscovery:Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->stopDeviceScan()Z

    move-result v0

    return v0
.end method

.method public stopReconnect()V
    .locals 1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mReConnectHelper:Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->stopReconnect()V

    return-void
.end method

.method public tryToPair(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothPair:Lcom/jieli/bluetooth_connect/impl/BluetoothPair;

    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->tryToPair(Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    return p1
.end method

.method public tryToPair(Landroid/bluetooth/BluetoothDevice;I)Z
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "device",
            "pairWay"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothPair:Lcom/jieli/bluetooth_connect/impl/BluetoothPair;

    invoke-virtual {v0, p1, p2}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->tryToPair(Landroid/bluetooth/BluetoothDevice;I)Z

    move-result p1

    return p1
.end method

.method public tryToUnPair(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothPair:Lcom/jieli/bluetooth_connect/impl/BluetoothPair;

    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->tryToUnPair(Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    return p1
.end method

.method public unPair(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothPair:Lcom/jieli/bluetooth_connect/impl/BluetoothPair;

    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->unPair(Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    return p1
.end method

.method public unregisterBluetoothCallback(Lcom/jieli/bluetooth_connect/interfaces/callback/BluetoothEventCallback;)Z
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "bluetoothCallback"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mEventCbManager:Lcom/jieli/bluetooth_connect/tool/BluetoothEventCbManager;

    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/tool/BluetoothEventCbManager;->removeListener(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public writeDataToBLEDevice(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;[B)Z
    .locals 7
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "device",
            "serviceUUID",
            "characteristicUUID",
            "writeData"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->isConnectedBLEDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothBle:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    new-instance v6, Lcom/android/mltcode/paycertificationapi/XI11iXi;

    invoke-direct {v6}, Lcom/android/mltcode/paycertificationapi/XI11iXi;-><init>()V

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-virtual/range {v1 .. v6}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->writeDataByBleAsync(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;[BLcom/jieli/bluetooth_connect/interfaces/listener/OnWriteDataCallback;)V

    return v0

    :cond_0
    move-object v2, p1

    sget-object p1, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->TAG:Ljava/lang/String;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "device("

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, ") is disconnected."

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string p3, "writeDataToBLEDevice"

    invoke-static {p1, p3, p2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v0
.end method

.method public writeDataToSppDevice(Landroid/bluetooth/BluetoothDevice;[B)Z
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "device",
            "data"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->mBluetoothSpp:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;

    invoke-virtual {v0, p1, p2}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->writeDataToSppDevice(Landroid/bluetooth/BluetoothDevice;[B)Z

    move-result p1

    return p1
.end method
