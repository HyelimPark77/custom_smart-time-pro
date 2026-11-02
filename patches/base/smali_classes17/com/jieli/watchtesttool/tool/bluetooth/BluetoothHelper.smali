.class public Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper$ChangeBleMtuTimeoutTask;
    }
.end annotation


# static fields
.field private static final DELAY_WAITING_TIME:J = 0x1388L

.field private static final IS_CHANGE_BLE_MTU:Z = true

.field private static final TAG:Ljava/lang/String; = "BluetoothHelper"

.field private static volatile instance:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;


# instance fields
.field private final configHelper:Lcom/jieli/watchtesttool/tool/config/ConfigHelper;

.field private final mAuthDeviceMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final mBluetoothOp:Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

.field private final mBtEventCallback:Lcom/jieli/bluetooth_connect/interfaces/callback/BluetoothEventCallback;

.field private final mBtEventCbManager:Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;

.field private mChangeBleMtuTimeoutTask:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper$ChangeBleMtuTimeoutTask;

.field private final mHandler:Landroid/os/Handler;

.field private final mRcspAuth:Lcom/jieli/jl_rcsp/impl/RcspAuth;

.field private final mRcspAuthListener:Lcom/jieli/jl_rcsp/impl/RcspAuth$OnRcspAuthListener;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Landroid/app/Application;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mAuthDeviceMap:Ljava/util/Map;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/X10;

    invoke-direct {v2}, Lcom/android/mltcode/paycertificationapi/X10;-><init>()V

    invoke-direct {v0, v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mHandler:Landroid/os/Handler;

    new-instance v0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper$1;

    invoke-direct {v0, p0}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper$1;-><init>(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;)V

    iput-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mBtEventCallback:Lcom/jieli/bluetooth_connect/interfaces/callback/BluetoothEventCallback;

    new-instance v1, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper$2;

    invoke-direct {v1, p0}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper$2;-><init>(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;)V

    iput-object v1, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mRcspAuthListener:Lcom/jieli/jl_rcsp/impl/RcspAuth$OnRcspAuthListener;

    invoke-static {p1}, Lcom/jieli/watchtesttool/tool/config/ConfigHelper;->getInstance(Landroid/content/Context;)Lcom/jieli/watchtesttool/tool/config/ConfigHelper;

    move-result-object v2

    iput-object v2, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->configHelper:Lcom/jieli/watchtesttool/tool/config/ConfigHelper;

    invoke-static {}, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->createDefaultOption()Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    move-result-object v3

    invoke-virtual {v2}, Lcom/jieli/watchtesttool/tool/config/ConfigHelper;->isSPPConnectWay()Z

    move-result v4

    invoke-virtual {v3, v4}, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->setPriority(I)Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    const-string v4, ""

    invoke-virtual {v3, v4}, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->setScanFilterData(Ljava/lang/String;)Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    invoke-static {v2}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->getDefaultMtu(Lcom/jieli/watchtesttool/tool/config/ConfigHelper;)I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->setMtu(I)Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->setNeedChangeBleMtu(Z)Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    invoke-virtual {v2}, Lcom/jieli/watchtesttool/tool/config/ConfigHelper;->isFilterDevice()Z

    move-result v5

    invoke-virtual {v3, v5}, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->setBleScanStrategy(I)Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    invoke-virtual {v3, v4}, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->setUseMultiDevice(Z)Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    invoke-virtual {v2}, Lcom/jieli/watchtesttool/tool/config/ConfigHelper;->isUseDeviceAuth()Z

    move-result v2

    invoke-virtual {v3, v2}, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->setUseDeviceAuth(Z)Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    new-instance v2, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;

    invoke-direct {v2, p1, v3}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;-><init>(Landroid/content/Context;Lcom/jieli/bluetooth_connect/bean/BluetoothOption;)V

    iput-object v2, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mBluetoothOp:Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

    invoke-interface {v2, v0}, Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;->registerBluetoothCallback(Lcom/jieli/bluetooth_connect/interfaces/callback/BluetoothEventCallback;)Z

    new-instance p1, Lcom/jieli/jl_rcsp/impl/RcspAuth;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XI1II;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XI1II;-><init>(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;)V

    invoke-direct {p1, v0, v1}, Lcom/jieli/jl_rcsp/impl/RcspAuth;-><init>(Lcom/jieli/jl_rcsp/impl/RcspAuth$IRcspAuthOp;Lcom/jieli/jl_rcsp/impl/RcspAuth$OnRcspAuthListener;)V

    iput-object p1, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mRcspAuth:Lcom/jieli/jl_rcsp/impl/RcspAuth;

    new-instance p1, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;

    invoke-direct {p1}, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;-><init>()V

    iput-object p1, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mBtEventCbManager:Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;

    return-void
.end method

.method public static synthetic OXO1(Landroid/os/Message;)Z
    .locals 0

    const/4 p0, 0x1

    return p0
.end method

.method public static synthetic access$000(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;)Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;
    .locals 0

    iget-object p0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mBtEventCbManager:Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;

    return-object p0
.end method

.method public static synthetic access$100()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method public static synthetic access$200(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->handleDeviceConnectedEvent(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public static synthetic access$300(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;Landroid/bluetooth/BluetoothDevice;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->publishDeviceConnectionStatus(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public static synthetic access$400(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;)Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper$ChangeBleMtuTimeoutTask;
    .locals 0

    iget-object p0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mChangeBleMtuTimeoutTask:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper$ChangeBleMtuTimeoutTask;

    return-object p0
.end method

.method public static synthetic access$500(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;)V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->stopChangeBleMtu()V

    return-void
.end method

.method public static synthetic access$600(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->callbackDeviceConnected(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public static synthetic access$700(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;)Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;
    .locals 0

    iget-object p0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mBluetoothOp:Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

    return-object p0
.end method

.method public static synthetic access$800(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;Landroid/bluetooth/BluetoothDevice;[B)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->handleReceiveRawData(Landroid/bluetooth/BluetoothDevice;[B)V

    return-void
.end method

.method public static synthetic access$900(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;Landroid/bluetooth/BluetoothDevice;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->setDevAuth(Landroid/bluetooth/BluetoothDevice;Z)V

    return-void
.end method

.method private callbackDeviceConnected(Landroid/bluetooth/BluetoothDevice;)V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, p1, v0}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->publishDeviceConnectionStatus(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public static getDefaultMtu(Lcom/jieli/watchtesttool/tool/config/ConfigHelper;)I
    .locals 1

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/ro3;->OIX0iXi()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/ro3;->I0iXXO()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/jieli/watchtesttool/tool/config/ConfigHelper;->getBleMtu()I

    move-result p0

    return p0

    :cond_1
    :goto_0
    const/16 p0, 0xf7

    return p0
.end method

.method public static getInstance(Landroid/app/Application;)Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;
    .locals 2

    sget-object v0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->instance:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    if-nez v0, :cond_1

    const-class v0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->instance:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    if-nez v1, :cond_0

    new-instance v1, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    invoke-direct {v1, p0}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;-><init>(Landroid/app/Application;)V

    sput-object v1, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->instance:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_2
    sget-object p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->instance:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    return-object p0
.end method

.method private handleDeviceConnectedEvent(Landroid/bluetooth/BluetoothDevice;)V
    .locals 6

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mBluetoothOp:Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

    invoke-interface {v0, p1}, Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;->isConnectedSppDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    sget-object v1, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "-handleDeviceConnectedEvent- device = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lcom/jieli/watchtesttool/util/AppUtil;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", connectWay = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->isAuthDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mRcspAuth:Lcom/jieli/jl_rcsp/impl/RcspAuth;

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v2}, Lcom/jieli/jl_rcsp/impl/RcspAuth;->stopAuth(Landroid/bluetooth/BluetoothDevice;Z)V

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mRcspAuth:Lcom/jieli/jl_rcsp/impl/RcspAuth;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/impl/RcspAuth;->startAuth(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "-handleDeviceConnectedEvent- startAuth = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    if-nez v0, :cond_2

    invoke-virtual {p0, p1}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->disconnectDevice(Landroid/bluetooth/BluetoothDevice;)V

    return-void

    :cond_0
    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mBluetoothOp:Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

    invoke-interface {v0, p1}, Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;->getBleMtu(Landroid/bluetooth/BluetoothDevice;)I

    move-result v0

    iget-object v2, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mBluetoothOp:Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

    invoke-interface {v2}, Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;->getBluetoothOption()Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    move-result-object v2

    invoke-virtual {v2}, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->getMtu()I

    move-result v2

    if-eq v0, v2, :cond_3

    invoke-direct {p0, p1, v2}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->startChangeMtu(Landroid/bluetooth/BluetoothDevice;I)Z

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "-handleDeviceConnectedEvent- startChangeMtu = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v5, ", mtu = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", change mtu = "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v3, :cond_3

    :cond_2
    return-void

    :cond_3
    :goto_0
    invoke-direct {p0, p1}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->callbackDeviceConnected(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method private handleReceiveRawData(Landroid/bluetooth/BluetoothDevice;[B)V
    .locals 3

    sget-object v0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-handleReceiveRawData- device = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lcom/jieli/watchtesttool/util/AppUtil;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", rawData = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Lcom/jieli/bluetooth_connect/util/CHexConverter;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->isAuthDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mRcspAuth:Lcom/jieli/jl_rcsp/impl/RcspAuth;

    invoke-virtual {v0, p1, p2}, Lcom/jieli/jl_rcsp/impl/RcspAuth;->handleAuthData(Landroid/bluetooth/BluetoothDevice;[B)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mBtEventCbManager:Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;

    invoke-virtual {v0, p1, p2}, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;->onReceiveData(Landroid/bluetooth/BluetoothDevice;[B)V

    return-void
.end method

.method private isDevAuth(Ljava/lang/String;)Z
    .locals 2

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mBluetoothOp:Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

    invoke-interface {v0}, Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;->getBluetoothOption()Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->isUseDeviceAuth()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mAuthDeviceMap:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_1

    return v1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private publishDeviceConnectionStatus(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mBtEventCbManager:Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;

    invoke-virtual {v0, p1, p2}, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;->onConnection(Landroid/bluetooth/BluetoothDevice;I)V

    const/4 v0, 0x2

    if-eq v0, p2, :cond_0

    if-nez p2, :cond_2

    :cond_0
    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mChangeBleMtuTimeoutTask:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper$ChangeBleMtuTimeoutTask;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper$ChangeBleMtuTimeoutTask;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->deviceEquals(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->stopChangeBleMtu()V

    :cond_1
    if-nez p2, :cond_2

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->removeDevAuth(Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method private removeDevAuth(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mAuthDeviceMap:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private setDevAuth(Landroid/bluetooth/BluetoothDevice;Z)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mAuthDeviceMap:Ljava/util/Map;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private startChangeMtu(Landroid/bluetooth/BluetoothDevice;I)Z
    .locals 4

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mChangeBleMtuTimeoutTask:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper$ChangeBleMtuTimeoutTask;

    if-eqz v0, :cond_0

    sget-object p1, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->TAG:Ljava/lang/String;

    const-string p2, "-startChangeMtu- Adjusting the MTU for BLE"

    invoke-static {p1, p2}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mBluetoothOp:Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

    invoke-interface {v0, p1, p2}, Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;->requestBleMtu(Landroid/bluetooth/BluetoothDevice;I)Z

    move-result v0

    sget-object v1, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "-startChangeMtu- requestBleMtu = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, ", change mtu = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v1, p2}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v0, :cond_1

    new-instance p2, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper$ChangeBleMtuTimeoutTask;

    invoke-direct {p2, p0, p1}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper$ChangeBleMtuTimeoutTask;-><init>(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;Landroid/bluetooth/BluetoothDevice;)V

    iput-object p2, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mChangeBleMtuTimeoutTask:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper$ChangeBleMtuTimeoutTask;

    iget-object p1, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mHandler:Landroid/os/Handler;

    const-wide/16 v1, 0x1388

    invoke-virtual {p1, p2, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_1
    return v0
.end method

.method private stopChangeBleMtu()V
    .locals 2

    sget-object v0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->TAG:Ljava/lang/String;

    const-string v1, "-stopChangeBleMtu- >>>>"

    invoke-static {v0, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mChangeBleMtuTimeoutTask:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper$ChangeBleMtuTimeoutTask;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mHandler:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mChangeBleMtuTimeoutTask:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper$ChangeBleMtuTimeoutTask;

    :cond_0
    return-void
.end method


# virtual methods
.method public addBluetoothEventListener(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothEventListener;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mBtEventCbManager:Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;

    invoke-virtual {v0, p1}, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;->addBluetoothEventListener(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothEventListener;)V

    return-void
.end method

.method public connectDevice(Landroid/bluetooth/BluetoothDevice;)V
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getType()I

    move-result v0

    const/4 v1, 0x3

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    if-ne v0, v1, :cond_3

    .line 2
    :cond_1
    invoke-virtual {p0, p1}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->getCacheConnectWay(Landroid/bluetooth/BluetoothDevice;)I

    move-result v0

    .line 3
    iget-object v3, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->configHelper:Lcom/jieli/watchtesttool/tool/config/ConfigHelper;

    invoke-virtual {v3}, Lcom/jieli/watchtesttool/tool/config/ConfigHelper;->isSPPConnectWay()Z

    move-result v3

    if-eqz v3, :cond_3

    const/4 v2, 0x1

    if-ne v0, v2, :cond_2

    .line 4
    iget-object v2, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mBluetoothOp:Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;->getMappedDeviceAddress(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 5
    invoke-static {v2}, Landroid/bluetooth/BluetoothAdapter;->checkBluetoothAddress(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 6
    invoke-static {v2}, Lcom/jieli/watchtesttool/util/AppUtil;->getRemoteDevice(Ljava/lang/String;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 7
    invoke-virtual {v2}, Landroid/bluetooth/BluetoothDevice;->getType()I

    move-result v3

    const/4 v4, 0x2

    if-eq v3, v4, :cond_2

    invoke-virtual {v2}, Landroid/bluetooth/BluetoothDevice;->getType()I

    move-result v3

    if-eq v3, v1, :cond_2

    move-object p1, v2

    :cond_2
    move v2, v0

    .line 8
    :cond_3
    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mBluetoothOp:Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

    invoke-interface {v0, p1, v2}, Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;->connectBtDevice(Landroid/bluetooth/BluetoothDevice;I)Z

    return-void
.end method

.method public connectDevice(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 1

    .line 9
    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mBluetoothOp:Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

    invoke-interface {v0, p1, p2}, Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;->connectBtDevice(Landroid/bluetooth/BluetoothDevice;I)Z

    return-void
.end method

.method public connectDevice(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    :cond_0
    if-eqz p2, :cond_2

    .line 10
    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->configHelper:Lcom/jieli/watchtesttool/tool/config/ConfigHelper;

    invoke-virtual {v0}, Lcom/jieli/watchtesttool/tool/config/ConfigHelper;->isSPPConnectWay()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 11
    invoke-virtual {p2}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->getEdrAddr()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/jieli/watchtesttool/util/AppUtil;->getRemoteDevice(Ljava/lang/String;)Landroid/bluetooth/BluetoothDevice;

    move-result-object p2

    if-eqz p2, :cond_1

    const/4 p1, 0x1

    move-object v1, p2

    move p2, p1

    move-object p1, v1

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    .line 12
    :goto_0
    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mBluetoothOp:Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

    invoke-interface {v0, p1, p2}, Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;->connectBtDevice(Landroid/bluetooth/BluetoothDevice;I)Z

    return-void

    .line 13
    :cond_2
    invoke-virtual {p0, p1}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->connectDevice(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public connectDeviceWithoutRecord(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mBluetoothOp:Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

    invoke-interface {v1, p1, v0}, Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;->connectBtDeviceWithoutRecord(Landroid/bluetooth/BluetoothDevice;I)Z

    move-result p1

    return p1
.end method

.method public connectHistoryRecord(Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mBluetoothOp:Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;->connectHistoryRecord(Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;Lcom/jieli/bluetooth_connect/interfaces/callback/OnHistoryRecordCallback;)V

    return-void
.end method

.method public destroy()V
    .locals 2

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mBluetoothOp:Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

    iget-object v1, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mBtEventCallback:Lcom/jieli/bluetooth_connect/interfaces/callback/BluetoothEventCallback;

    invoke-interface {v0, v1}, Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;->unregisterBluetoothCallback(Lcom/jieli/bluetooth_connect/interfaces/callback/BluetoothEventCallback;)Z

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mBluetoothOp:Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

    invoke-interface {v0}, Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;->destroy()V

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mRcspAuth:Lcom/jieli/jl_rcsp/impl/RcspAuth;

    iget-object v1, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mRcspAuthListener:Lcom/jieli/jl_rcsp/impl/RcspAuth$OnRcspAuthListener;

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/impl/RcspAuth;->removeListener(Lcom/jieli/jl_rcsp/impl/RcspAuth$OnRcspAuthListener;)V

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mRcspAuth:Lcom/jieli/jl_rcsp/impl/RcspAuth;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/impl/RcspAuth;->destroy()V

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mAuthDeviceMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mBtEventCbManager:Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;

    invoke-virtual {v0}, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;->destroy()V

    sput-object v1, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->instance:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    return-void
.end method

.method public disconnectDevice(Landroid/bluetooth/BluetoothDevice;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->isConnectedBtDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mBluetoothOp:Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

    invoke-interface {v0, p1}, Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;->disconnectBtDevice(Landroid/bluetooth/BluetoothDevice;)V

    return-void

    :cond_1
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->publishDeviceConnectionStatus(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public getBluetoothOp()Lcom/jieli/bluetooth_connect/impl/BluetoothManager;
    .locals 1

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mBluetoothOp:Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

    check-cast v0, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;

    return-object v0
.end method

.method public getCacheConnectWay(Landroid/bluetooth/BluetoothDevice;)I
    .locals 1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mBluetoothOp:Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

    invoke-interface {v0, p1}, Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;->isConnectedDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mBluetoothOp:Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

    invoke-interface {v0, p1}, Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;->isConnectedSppDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_1
    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mBluetoothOp:Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;->getHistoryRecord(Ljava/lang/String;)Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getConnectType()I

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public getConnectedBluetoothGatt(Landroid/bluetooth/BluetoothDevice;)Landroid/bluetooth/BluetoothGatt;
    .locals 1

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mBluetoothOp:Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

    invoke-interface {v0, p1}, Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;->getDeviceGatt(Landroid/bluetooth/BluetoothDevice;)Landroid/bluetooth/BluetoothGatt;

    move-result-object p1

    return-object p1
.end method

.method public getConnectedBtDevice()Landroid/bluetooth/BluetoothDevice;
    .locals 1

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mBluetoothOp:Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

    invoke-interface {v0}, Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    return-object v0
.end method

.method public getConnectionStatus(Landroid/bluetooth/BluetoothDevice;)I
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->isConnectedBtDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    invoke-virtual {p0}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->getBluetoothOp()Lcom/jieli/bluetooth_connect/impl/BluetoothManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->getConnectingDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-static {p1, v1}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->deviceEquals(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x3

    return p1

    :cond_2
    return v0
.end method

.method public isAuthDevice(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->isDevAuth(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public isConnectedBtDevice(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mBluetoothOp:Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

    invoke-interface {v0, p1}, Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;->isConnectedDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    return p1
.end method

.method public isConnectedDevice()Z
    .locals 1

    invoke-virtual {p0}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->getConnectedBtDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->getConnectedBtDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->isDevAuth(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isConnectedSppDevice(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mBluetoothOp:Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

    invoke-interface {v0, p1}, Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;->isConnectedSppDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    return p1
.end method

.method public isHistoryRecord(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mBluetoothOp:Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;->getHistoryRecord(Ljava/lang/String;)Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public isUsedBtDevice(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mBluetoothOp:Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

    invoke-interface {v0, p1}, Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;->isConnectedDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->getConnectedBtDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->deviceEquals(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public removeBluetoothEventListener(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothEventListener;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mBtEventCbManager:Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;

    invoke-virtual {v0, p1}, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;->removeBluetoothEventListener(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothEventListener;)V

    return-void
.end method

.method public removeHistoryRecord(Ljava/lang/String;Lcom/jieli/bluetooth_connect/interfaces/callback/OnHistoryRecordCallback;)V
    .locals 1

    invoke-static {p1}, Landroid/bluetooth/BluetoothAdapter;->checkBluetoothAddress(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mBluetoothOp:Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

    invoke-interface {v0, p1, p2}, Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;->removeHistoryRecord(Ljava/lang/String;Lcom/jieli/bluetooth_connect/interfaces/callback/OnHistoryRecordCallback;)V

    return-void
.end method

.method public sendDataToDevice(Landroid/bluetooth/BluetoothDevice;[B)Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->mBluetoothOp:Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

    invoke-interface {v0, p1, p2}, Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;->sendDataToDevice(Landroid/bluetooth/BluetoothDevice;[B)Z

    move-result p1

    return p1
.end method
