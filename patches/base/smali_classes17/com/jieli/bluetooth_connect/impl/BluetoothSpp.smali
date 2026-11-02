.class public Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/bluetooth_connect/interfaces/IBluetoothSpp;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$ConnectionSppThread;,
        Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$BluetoothSppReceiver;
    }
.end annotation


# static fields
.field private static final DELAY_TIME:I = 0x3e8

.field private static final MSG_CONNECT_SPP:I = 0xa036

.field private static final MSG_CONNECT_SPP_TIMEOUT:I = 0xa035

.field private static final MSG_WAIT_SYSTEM_CONNECT_EDR_TIMEOUT:I = 0xa037

.field private static final TAG:Ljava/lang/String; = "BluetoothSpp"

.field private static final WAIT_TIMEOUT:I = 0xbb8


# instance fields
.field private final mBluetoothBrEdr:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;

.field private mBluetoothOption:Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

.field private final mBluetoothPair:Lcom/jieli/bluetooth_connect/impl/BluetoothPair;

.field private volatile mConnectedSppDevice:Landroid/bluetooth/BluetoothDevice;

.field private final mConnectedSppDevices:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/bluetooth/BluetoothDevice;",
            ">;"
        }
    .end annotation
.end field

.field private volatile mConnectingSppDevice:Landroid/bluetooth/BluetoothDevice;

.field private mConnectionSppThread:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$ConnectionSppThread;

.field private final mContext:Landroid/content/Context;

.field private final mHandler:Landroid/os/Handler;

.field private final mOnBrEdrListener:Lcom/jieli/bluetooth_connect/interfaces/listener/OnBrEdrListener;

.field private final mOnBtDevicePairListener:Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDevicePairListener;

.field private final mOnRecvSppDataListener:Lcom/jieli/bluetooth_connect/tool/ReceiveSppDataThread$OnRecvSppDataListener;

.field private final mSppEventCbManager:Lcom/jieli/bluetooth_connect/tool/SppEventCbManager;

.field private mSppReceiver:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$BluetoothSppReceiver;

.field private final mSppRecvThreadMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/jieli/bluetooth_connect/tool/ReceiveSppDataThread;",
            ">;"
        }
    .end annotation
.end field

.field private final mSppSocketMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroid/bluetooth/BluetoothSocket;",
            ">;"
        }
    .end annotation
.end field

.field private final mThreadPool:Ljava/util/concurrent/ExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;Lcom/jieli/bluetooth_connect/bean/BluetoothOption;Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtSppListener;)V
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "context",
            "bluetoothBrEdr",
            "option",
            "listener"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mConnectedSppDevices:Ljava/util/List;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mSppSocketMap:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mSppRecvThreadMap:Ljava/util/Map;

    const/16 v0, 0x8

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    new-instance v2, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$1;

    invoke-direct {v2, p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$1;-><init>(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;)V

    invoke-direct {v0, v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mHandler:Landroid/os/Handler;

    new-instance v0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$2;

    invoke-direct {v0, p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$2;-><init>(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;)V

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mOnBtDevicePairListener:Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDevicePairListener;

    new-instance v1, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$3;

    invoke-direct {v1, p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$3;-><init>(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;)V

    iput-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mOnBrEdrListener:Lcom/jieli/bluetooth_connect/interfaces/listener/OnBrEdrListener;

    new-instance v2, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$4;

    invoke-direct {v2, p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$4;-><init>(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;)V

    iput-object v2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mOnRecvSppDataListener:Lcom/jieli/bluetooth_connect/tool/ReceiveSppDataThread$OnRecvSppDataListener;

    invoke-static {p1}, Lcom/jieli/bluetooth_connect/util/ConnectUtil;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    iput-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mContext:Landroid/content/Context;

    invoke-static {p2}, Lcom/jieli/bluetooth_connect/util/ConnectUtil;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;

    iput-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mBluetoothBrEdr:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;

    invoke-virtual {p2}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->getBluetoothPair()Lcom/jieli/bluetooth_connect/impl/BluetoothPair;

    move-result-object p2

    iput-object p2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mBluetoothPair:Lcom/jieli/bluetooth_connect/impl/BluetoothPair;

    invoke-virtual {p1, v1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->addListener(Lcom/jieli/bluetooth_connect/interfaces/listener/OnBrEdrListener;)V

    invoke-virtual {p2, v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->addListener(Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDevicePairListener;)V

    new-instance p1, Lcom/jieli/bluetooth_connect/tool/SppEventCbManager;

    invoke-direct {p1}, Lcom/jieli/bluetooth_connect/tool/SppEventCbManager;-><init>()V

    iput-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mSppEventCbManager:Lcom/jieli/bluetooth_connect/tool/SppEventCbManager;

    if-nez p3, :cond_0

    invoke-static {}, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->createDefaultOption()Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    move-result-object p3

    :cond_0
    iput-object p3, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mBluetoothOption:Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    invoke-virtual {p0, p4}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->addListener(Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtSppListener;)V

    invoke-direct {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->registerSppReceiver()V

    return-void
.end method

.method public static synthetic access$000(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;)Landroid/bluetooth/BluetoothDevice;
    .locals 0

    iget-object p0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mConnectingSppDevice:Landroid/bluetooth/BluetoothDevice;

    return-object p0
.end method

.method public static synthetic access$100()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method public static synthetic access$1000(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;Landroid/bluetooth/BluetoothDevice;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->checkNeedConnect(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public static synthetic access$1100(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;)Lcom/jieli/bluetooth_connect/bean/BluetoothOption;
    .locals 0

    iget-object p0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mBluetoothOption:Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    return-object p0
.end method

.method public static synthetic access$1200(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;)Lcom/jieli/bluetooth_connect/tool/SppEventCbManager;
    .locals 0

    iget-object p0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mSppEventCbManager:Lcom/jieli/bluetooth_connect/tool/SppEventCbManager;

    return-object p0
.end method

.method public static synthetic access$1302(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$ConnectionSppThread;)Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$ConnectionSppThread;
    .locals 0

    iput-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mConnectionSppThread:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$ConnectionSppThread;

    return-object p1
.end method

.method public static synthetic access$1400(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;)Landroid/bluetooth/BluetoothDevice;
    .locals 0

    iget-object p0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mConnectedSppDevice:Landroid/bluetooth/BluetoothDevice;

    return-object p0
.end method

.method public static synthetic access$1500(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mConnectedSppDevices:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic access$1600(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mSppSocketMap:Ljava/util/Map;

    return-object p0
.end method

.method public static synthetic access$1700(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothSocket;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->startReceiveDataThread(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothSocket;)V

    return-void
.end method

.method public static synthetic access$1800(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;Landroid/bluetooth/BluetoothDevice;[Landroid/os/ParcelUuid;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->handleDeviceUuids(Landroid/bluetooth/BluetoothDevice;[Landroid/os/ParcelUuid;)V

    return-void
.end method

.method public static synthetic access$200(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->printfDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic access$300(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;Landroid/bluetooth/BluetoothDevice;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->notifySppState(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public static synthetic access$400(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->startConnectSpp(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public static synthetic access$500(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mHandler:Landroid/os/Handler;

    return-object p0
.end method

.method public static synthetic access$800(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;)V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->clearDevices()V

    return-void
.end method

.method public static synthetic access$900(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mContext:Landroid/content/Context;

    return-object p0
.end method

.method private checkNeedConnect(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 2
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

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mConnectingSppDevice:Landroid/bluetooth/BluetoothDevice;

    invoke-static {p1, v0}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->deviceEquals(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    if-eq p2, p1, :cond_0

    sget-object p1, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->TAG:Ljava/lang/String;

    const-string p2, "checkNeedConnect"

    const-string v0, "a2dp or hfp connect finish."

    invoke-static {p1, p2, v0}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mHandler:Landroid/os/Handler;

    const p2, 0xa036

    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeMessages(I)V

    iget-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mHandler:Landroid/os/Handler;

    const-wide/16 v0, 0x3e8

    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void

    :cond_0
    iget-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mHandler:Landroid/os/Handler;

    const p2, 0xa037

    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeMessages(I)V

    :cond_1
    return-void
.end method

.method private clearDevices()V
    .locals 3

    sget-object v0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->TAG:Ljava/lang/String;

    const-string v1, "clearDevices"

    const-string v2, ""

    invoke-static {v0, v1, v2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mConnectedSppDevices:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/bluetooth/BluetoothDevice;

    invoke-direct {p0, v1}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->disconnectSpp(Landroid/bluetooth/BluetoothDevice;)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mSppSocketMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mSppSocketMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mSppSocketMap:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/bluetooth/BluetoothSocket;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothSocket;->isConnected()Z

    move-result v2

    if-eqz v2, :cond_1

    :try_start_0
    invoke-virtual {v1}, Landroid/bluetooth/BluetoothSocket;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mSppSocketMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mSppRecvThreadMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mConnectedSppDevices:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->setConnectingSppDevice(Landroid/bluetooth/BluetoothDevice;)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->setConnectedSppDevice(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method private disconnectSpp(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation

    sget-object v0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "device : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->printfDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "disconnectSpp"

    invoke-static {v0, v2, v1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_4

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mContext:Landroid/content/Context;

    invoke-static {v1}, Lcom/jieli/bluetooth_connect/util/ConnectUtil;->isHasConnectPermission(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mConnectedSppDevices:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    const/4 v3, 0x1

    if-nez v1, :cond_1

    const-string p1, "device is not connected device."

    invoke-static {v0, v2, p1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v3

    :cond_1
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mSppSocketMap:Ljava/util/Map;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/bluetooth/BluetoothSocket;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothSocket;->isConnected()Z

    move-result v1

    if-eqz v1, :cond_2

    :try_start_0
    invoke-virtual {v0}, Landroid/bluetooth/BluetoothSocket;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mSppRecvThreadMap:Ljava/util/Map;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jieli/bluetooth_connect/tool/ReceiveSppDataThread;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/tool/ReceiveSppDataThread;->stopThread()V

    :cond_3
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mConnectedSppDevices:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    sget-object p1, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->TAG:Ljava/lang/String;

    const-string v0, "remove connected device ok."

    invoke-static {p1, v2, v0}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v3

    :cond_4
    :goto_1
    const-string p1, "param is error."

    invoke-static {v0, v2, p1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method

.method private handleDeviceUuids(Landroid/bluetooth/BluetoothDevice;[Landroid/os/ParcelUuid;)V
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

    iget-object p2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mConnectingSppDevice:Landroid/bluetooth/BluetoothDevice;

    invoke-static {p1, p2}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->deviceEquals(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->TAG:Ljava/lang/String;

    const-string p2, "handleDeviceUuids"

    const-string v0, "get uuid success."

    invoke-static {p1, p2, v0}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mHandler:Landroid/os/Handler;

    const p2, 0xa036

    invoke-virtual {p1, p2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    :cond_0
    return-void
.end method

.method private notifySppState(Landroid/bluetooth/BluetoothDevice;I)V
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

    .line 1
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mBluetoothOption:Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->getSppUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-direct {p0, p1, v0, p2}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->notifySppState(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;I)V

    return-void
.end method

.method private notifySppState(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;I)V
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "device",
            "sppUUID",
            "status"
        }
    .end annotation

    .line 2
    sget-object v0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "device : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->printfDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", status : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p3}, Lcom/jieli/bluetooth_connect/constant/BluetoothConstant;->printBtConnection(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "notifySppState"

    invoke-static {v0, v2, v1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    if-eq p3, v0, :cond_1

    .line 3
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mConnectingSppDevice:Landroid/bluetooth/BluetoothDevice;

    invoke-static {v0, p1}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->deviceEquals(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->setConnectingSppDevice(Landroid/bluetooth/BluetoothDevice;)V

    .line 5
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mHandler:Landroid/os/Handler;

    const v1, 0xa035

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    :cond_0
    if-nez p3, :cond_1

    .line 6
    invoke-direct {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->removeDevice(Landroid/bluetooth/BluetoothDevice;)V

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mSppEventCbManager:Lcom/jieli/bluetooth_connect/tool/SppEventCbManager;

    invoke-virtual {v0, p1, p2, p3}, Lcom/jieli/bluetooth_connect/tool/SppEventCbManager;->onSppConnection(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;I)V

    return-void
.end method

.method private printfDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mContext:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->printBtDeviceInfo(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private registerSppReceiver()V
    .locals 3

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mSppReceiver:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$BluetoothSppReceiver;

    if-nez v0, :cond_0

    new-instance v0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$BluetoothSppReceiver;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$BluetoothSppReceiver;-><init>(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$1;)V

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mSppReceiver:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$BluetoothSppReceiver;

    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "android.bluetooth.device.action.UUID"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mSppReceiver:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$BluetoothSppReceiver;

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    :cond_0
    return-void
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

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mConnectedSppDevices:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->setConnectedSppDevice(Landroid/bluetooth/BluetoothDevice;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mConnectedSppDevice:Landroid/bluetooth/BluetoothDevice;

    invoke-static {p1, v0}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->deviceEquals(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mConnectedSppDevices:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->setConnectedSppDevice(Landroid/bluetooth/BluetoothDevice;)V

    :cond_1
    return-void
.end method

.method private startConnectSpp(Landroid/bluetooth/BluetoothDevice;)V
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation

    sget-object v0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "device : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->printfDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", Connect thread : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mConnectionSppThread:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$ConnectionSppThread;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "startConnectSpp"

    invoke-static {v0, v2, v1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mConnectionSppThread:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$ConnectionSppThread;

    if-nez v0, :cond_0

    new-instance v0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$ConnectionSppThread;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$ConnectionSppThread;-><init>(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$1;)V

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mConnectionSppThread:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$ConnectionSppThread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    :cond_0
    return-void
.end method

.method private startReceiveDataThread(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothSocket;)V
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "device",
            "socket"
        }
    .end annotation

    sget-object v0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "socket : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "startReceiveDataThread"

    invoke-static {v0, v2, v1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/jieli/bluetooth_connect/tool/ReceiveSppDataThread;

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mOnRecvSppDataListener:Lcom/jieli/bluetooth_connect/tool/ReceiveSppDataThread$OnRecvSppDataListener;

    invoke-direct {v0, p1, p2, v1}, Lcom/jieli/bluetooth_connect/tool/ReceiveSppDataThread;-><init>(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothSocket;Lcom/jieli/bluetooth_connect/tool/ReceiveSppDataThread$OnRecvSppDataListener;)V

    iget-object p2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mThreadPool:Ljava/util/concurrent/ExecutorService;

    invoke-interface {p2}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result p2

    if-nez p2, :cond_0

    iget-object p2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mThreadPool:Ljava/util/concurrent/ExecutorService;

    invoke-interface {p2, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    iget-object p2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mSppRecvThreadMap:Ljava/util/Map;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method private stopConnectSpp()V
    .locals 1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mConnectionSppThread:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$ConnectionSppThread;

    if-eqz v0, :cond_1

    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mConnectionSppThread:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$ConnectionSppThread;

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mConnectionSppThread:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$ConnectionSppThread;

    :cond_1
    return-void
.end method

.method private unregisterSppReceiver()V
    .locals 2

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mSppReceiver:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$BluetoothSppReceiver;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mContext:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mSppReceiver:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$BluetoothSppReceiver;

    :cond_0
    return-void
.end method


# virtual methods
.method public addListener(Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtSppListener;)V
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
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mSppEventCbManager:Lcom/jieli/bluetooth_connect/tool/SppEventCbManager;

    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/tool/SppEventCbManager;->addListener(Ljava/lang/Object;)Z

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
    check-cast p1, Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtSppListener;

    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->addListener(Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtSppListener;)V

    return-void
.end method

.method public connectSPPDevice(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 7
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
            "device"
        }
    .end annotation

    const/4 v0, 0x0

    const-string v1, "connectSPPDevice"

    if-eqz p1, :cond_8

    iget-object v2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mContext:Landroid/content/Context;

    invoke-static {v2}, Lcom/jieli/bluetooth_connect/util/ConnectUtil;->isHasConnectPermission(Landroid/content/Context;)Z

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_2

    :cond_0
    sget-object v2, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "device : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->printfDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v1, v3}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mConnectingSppDevice:Landroid/bluetooth/BluetoothDevice;

    if-eqz v3, :cond_1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ConnectingSppDevice is connecting. ConnectingSppDevice : "

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mConnectedSppDevice:Landroid/bluetooth/BluetoothDevice;

    invoke-direct {p0, v3}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->printfDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, v1, p1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v0

    :cond_1
    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->isConnectedSppDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    const/4 v0, 0x2

    invoke-direct {p0, p1, v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->notifySppState(Landroid/bluetooth/BluetoothDevice;I)V

    return v4

    :cond_2
    iget-object v3, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mBluetoothOption:Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    invoke-virtual {v3}, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->isUseMultiDevice()Z

    move-result v3

    if-nez v3, :cond_3

    iget-object v3, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mConnectedSppDevice:Landroid/bluetooth/BluetoothDevice;

    if-eqz v3, :cond_3

    iget-object v3, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mConnectedSppDevice:Landroid/bluetooth/BluetoothDevice;

    invoke-static {v3, p1}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->deviceEquals(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v3

    if-nez v3, :cond_3

    iget-object v3, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mConnectedSppDevice:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {p0, v3}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->disconnectSPPDevice(Landroid/bluetooth/BluetoothDevice;)Z

    const-wide/16 v5, 0x12c

    invoke-static {v5, v6}, Landroid/os/SystemClock;->sleep(J)V

    :cond_3
    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->setConnectingSppDevice(Landroid/bluetooth/BluetoothDevice;)V

    iget-object v3, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mBluetoothPair:Lcom/jieli/bluetooth_connect/impl/BluetoothPair;

    invoke-virtual {v3, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->isPaired(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "isPaired : "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v1, v5}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-nez v3, :cond_4

    iget-object v3, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mBluetoothPair:Lcom/jieli/bluetooth_connect/impl/BluetoothPair;

    invoke-virtual {v3, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->tryToPair(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "tryToPair : "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v1, v5}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-nez v3, :cond_7

    invoke-direct {p0, p1, v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->notifySppState(Landroid/bluetooth/BluetoothDevice;I)V

    const-string p1, "tryToPair is failed."

    invoke-static {v2, v1, p1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v0

    :cond_4
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getUuids()[Landroid/os/ParcelUuid;

    move-result-object v3

    if-eqz v3, :cond_6

    iget-object v3, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mContext:Landroid/content/Context;

    iget-object v5, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mBluetoothOption:Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    invoke-virtual {v5}, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->getSppUUID()Ljava/util/UUID;

    move-result-object v5

    invoke-static {v3, p1, v5}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->deviceHasProfile(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;)Z

    move-result v3

    if-nez v3, :cond_5

    goto :goto_0

    :cond_5
    const-string v0, "start connect spp."

    invoke-static {v2, v1, v0}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mHandler:Landroid/os/Handler;

    const v1, 0xa036

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_1

    :cond_6
    :goto_0
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->fetchUuidsWithSdp()Z

    move-result v3

    if-nez v3, :cond_7

    invoke-direct {p0, p1, v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->notifySppState(Landroid/bluetooth/BluetoothDevice;I)V

    const-string p1, "fetchUuidsWithSdp is failed."

    invoke-static {v2, v1, p1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v0

    :cond_7
    :goto_1
    invoke-direct {p0, p1, v4}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->notifySppState(Landroid/bluetooth/BluetoothDevice;I)V

    iget-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mHandler:Landroid/os/Handler;

    const v0, 0xa035

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeMessages(I)V

    iget-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mHandler:Landroid/os/Handler;

    const-wide/32 v1, 0x9c40

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return v4

    :cond_8
    :goto_2
    sget-object p1, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->TAG:Ljava/lang/String;

    const-string v2, "device is bad object. "

    invoke-static {p1, v1, v2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v0
.end method

.method public destroy()V
    .locals 3

    sget-object v0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->TAG:Ljava/lang/String;

    const-string v1, "destroy"

    const-string v2, ""

    invoke-static {v0, v1, v2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mSppEventCbManager:Lcom/jieli/bluetooth_connect/tool/SppEventCbManager;

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/tool/SppEventCbManager;->destroy()V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mBluetoothPair:Lcom/jieli/bluetooth_connect/impl/BluetoothPair;

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mOnBtDevicePairListener:Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDevicePairListener;

    invoke-virtual {v0, v1}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->removeListener(Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDevicePairListener;)V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mBluetoothBrEdr:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mOnBrEdrListener:Lcom/jieli/bluetooth_connect/interfaces/listener/OnBrEdrListener;

    invoke-virtual {v0, v1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->removeListener(Lcom/jieli/bluetooth_connect/interfaces/listener/OnBrEdrListener;)V

    invoke-direct {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->stopConnectSpp()V

    invoke-direct {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->clearDevices()V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mThreadPool:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mThreadPool:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    :cond_0
    invoke-direct {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->unregisterSppReceiver()V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    return-void
.end method

.method public disconnectSPPDevice(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation

    sget-object v0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "device : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->printfDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "disconnectSPPDevice"

    invoke-static {v0, v2, v1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->disconnectSpp(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v1}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->notifySppState(Landroid/bluetooth/BluetoothDevice;I)V

    :cond_0
    return v0
.end method

.method public getConnectedSPPDevice()Landroid/bluetooth/BluetoothDevice;
    .locals 1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mConnectedSppDevice:Landroid/bluetooth/BluetoothDevice;

    return-object v0
.end method

.method public getConnectedSppDevices()Ljava/util/List;
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

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mConnectedSppDevices:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public getSppConnectingDevice()Landroid/bluetooth/BluetoothDevice;
    .locals 1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mConnectingSppDevice:Landroid/bluetooth/BluetoothDevice;

    return-object v0
.end method

.method public isConnectedSppDevice(Landroid/bluetooth/BluetoothDevice;)Z
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
    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mSppSocketMap:Ljava/util/Map;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/bluetooth/BluetoothSocket;

    if-nez p1, :cond_1

    return v0

    :cond_1
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothSocket;->isConnected()Z

    move-result p1

    return p1
.end method

.method public isSppConnecting()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mConnectingSppDevice:Landroid/bluetooth/BluetoothDevice;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public removeListener(Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtSppListener;)V
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
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mSppEventCbManager:Lcom/jieli/bluetooth_connect/tool/SppEventCbManager;

    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/tool/SppEventCbManager;->removeListener(Ljava/lang/Object;)Z

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
    check-cast p1, Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtSppListener;

    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->removeListener(Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtSppListener;)V

    return-void
.end method

.method public setBluetoothOption(Lcom/jieli/bluetooth_connect/bean/BluetoothOption;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "option"
        }
    .end annotation

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mBluetoothOption:Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    :cond_0
    return-void
.end method

.method public setConnectedSppDevice(Landroid/bluetooth/BluetoothDevice;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mConnectedSppDevice:Landroid/bluetooth/BluetoothDevice;

    invoke-static {v0, p1}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->deviceEquals(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-nez v0, :cond_0

    iput-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mConnectedSppDevice:Landroid/bluetooth/BluetoothDevice;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mSppEventCbManager:Lcom/jieli/bluetooth_connect/tool/SppEventCbManager;

    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/tool/SppEventCbManager;->onSwitchSppDevice(Landroid/bluetooth/BluetoothDevice;)V

    :cond_0
    return-void
.end method

.method public setConnectingSppDevice(Landroid/bluetooth/BluetoothDevice;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "connectingSppDevice"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mConnectingSppDevice:Landroid/bluetooth/BluetoothDevice;

    return-void
.end method

.method public declared-synchronized writeDataToSppDevice(Landroid/bluetooth/BluetoothDevice;[B)Z
    .locals 4
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

    monitor-enter p0

    const/4 v0, 0x0

    if-eqz p2, :cond_4

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->isConnectedSppDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v1

    if-nez v1, :cond_1

    sget-object p1, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->TAG:Ljava/lang/String;

    const-string p2, "writeDataToSppDevice"

    const-string v1, "device is disconnected."

    invoke-static {p1, p2, v1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    :try_start_1
    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->mSppSocketMap:Ljava/util/Map;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/bluetooth/BluetoothSocket;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothSocket;->isConnected()Z

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    :try_start_2
    invoke-virtual {v1}, Landroid/bluetooth/BluetoothSocket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/io/OutputStream;->write([B)V

    sget-object v1, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->TAG:Ljava/lang/String;

    const-string v2, "[writeDataToSppDevice] >>> send data successful. device : %s, data [ %s ]."

    invoke-static {p2}, Lcom/jieli/bluetooth_connect/util/CHexConverter;->byte2HexStr([B)Ljava/lang/String;

    move-result-object p2

    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v2, p1}, Lcom/jieli/bluetooth_connect/util/ConnectUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    const/4 p1, 0x1

    return p1

    :catch_0
    move-exception p1

    :try_start_3
    sget-object p2, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->TAG:Ljava/lang/String;

    const-string v1, "writeDataToSppDevice"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "have an exception : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {p2, v1, v2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit p0

    return v0

    :cond_3
    :goto_0
    :try_start_4
    sget-object p1, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->TAG:Ljava/lang/String;

    const-string p2, "writeDataToSppDevice"

    const-string v1, "spp socket is close."

    invoke-static {p1, p2, v1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit p0

    return v0

    :cond_4
    :goto_1
    :try_start_5
    sget-object p1, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->TAG:Ljava/lang/String;

    const-string p2, "writeDataToSppDevice"

    const-string v1, "param is error."

    invoke-static {p1, p2, v1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    monitor-exit p0

    return v0

    :goto_2
    :try_start_6
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    throw p1
.end method
