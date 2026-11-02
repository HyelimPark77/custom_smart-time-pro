.class public Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/bluetooth_connect/interfaces/IBluetoothBrEdr;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr$BluetoothHandFreeReceiver;
    }
.end annotation


# static fields
.field private static final MSG_CONNECT_EDR_TIMEOUT:I = 0x6621

.field private static final TAG:Ljava/lang/String; = "BluetoothBrEdr"


# instance fields
.field private volatile isInitA2dp:Z

.field private volatile isInitHfp:Z

.field private final mBTServiceListener:Landroid/bluetooth/BluetoothProfile$ServiceListener;

.field private mBluetoothA2dp:Landroid/bluetooth/BluetoothA2dp;

.field private mBluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

.field private mBluetoothHandFreeReceiver:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr$BluetoothHandFreeReceiver;

.field private mBluetoothHfp:Landroid/bluetooth/BluetoothHeadset;

.field private mBluetoothOption:Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

.field private final mBluetoothPair:Lcom/jieli/bluetooth_connect/impl/BluetoothPair;

.field private final mBrEdrEventCbManager:Lcom/jieli/bluetooth_connect/tool/BrEdrEventCbManager;

.field private volatile mConnectingEdr:Landroid/bluetooth/BluetoothDevice;

.field private final mContext:Landroid/content/Context;

.field private final mHandler:Landroid/os/Handler;

.field private final mOnBtDevicePairListener:Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDevicePairListener;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/jieli/bluetooth_connect/impl/BluetoothPair;Lcom/jieli/bluetooth_connect/interfaces/listener/OnBrEdrListener;)V
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "context",
            "bluetoothPair",
            "listener"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/OOOX0;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/OOOX0;-><init>(Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;)V

    invoke-direct {v0, v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mHandler:Landroid/os/Handler;

    new-instance v0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr$1;

    invoke-direct {v0, p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr$1;-><init>(Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;)V

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mBTServiceListener:Landroid/bluetooth/BluetoothProfile$ServiceListener;

    new-instance v0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr$2;

    invoke-direct {v0, p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr$2;-><init>(Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;)V

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mOnBtDevicePairListener:Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDevicePairListener;

    invoke-static {p1}, Lcom/jieli/bluetooth_connect/util/ConnectUtil;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    iput-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mContext:Landroid/content/Context;

    invoke-static {p2}, Lcom/jieli/bluetooth_connect/util/ConnectUtil;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;

    iput-object p2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mBluetoothPair:Lcom/jieli/bluetooth_connect/impl/BluetoothPair;

    invoke-virtual {p2, v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->addListener(Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDevicePairListener;)V

    new-instance p2, Lcom/jieli/bluetooth_connect/tool/BrEdrEventCbManager;

    invoke-direct {p2}, Lcom/jieli/bluetooth_connect/tool/BrEdrEventCbManager;-><init>()V

    iput-object p2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mBrEdrEventCbManager:Lcom/jieli/bluetooth_connect/tool/BrEdrEventCbManager;

    invoke-virtual {p0, p3}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->addListener(Lcom/jieli/bluetooth_connect/interfaces/listener/OnBrEdrListener;)V

    invoke-direct {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->initBrEdrService(Landroid/content/Context;)V

    invoke-direct {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->registerReceiver()V

    return-void
.end method

.method public static synthetic OXO1(Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;Landroid/os/Message;)Z
    .locals 4

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x6621

    if-ne v0, v1, :cond_1

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v0, p1, Landroid/bluetooth/BluetoothDevice;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Landroid/bluetooth/BluetoothDevice;

    sget-object v0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "connectingDev : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->printDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "MSG_CONNECT_EDR_TIMEOUT"

    invoke-static {v0, v3, v2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->isConnectedByProfile(Landroid/bluetooth/BluetoothDevice;)I

    move-result v0

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    invoke-direct {p0, p1, v1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->onBrEdrConnection(Landroid/bluetooth/BluetoothDevice;I)V

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static synthetic access$100()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method public static synthetic access$1000(Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mContext:Landroid/content/Context;

    return-object p0
.end method

.method public static synthetic access$1100(Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;Landroid/bluetooth/BluetoothDevice;)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->tryToConnectBrEdr(Landroid/bluetooth/BluetoothDevice;)Z

    move-result p0

    return p0
.end method

.method public static synthetic access$1200(Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;Landroid/bluetooth/BluetoothDevice;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->onHfpStatus(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public static synthetic access$1300(Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;Landroid/bluetooth/BluetoothDevice;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->onA2dpStatus(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public static synthetic access$1400(Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;Landroid/bluetooth/BluetoothDevice;[Landroid/os/ParcelUuid;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->onDeviceUuids(Landroid/bluetooth/BluetoothDevice;[Landroid/os/ParcelUuid;)V

    return-void
.end method

.method public static synthetic access$202(Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;Landroid/bluetooth/BluetoothA2dp;)Landroid/bluetooth/BluetoothA2dp;
    .locals 0

    iput-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mBluetoothA2dp:Landroid/bluetooth/BluetoothA2dp;

    return-object p1
.end method

.method public static synthetic access$302(Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->isInitA2dp:Z

    return p1
.end method

.method public static synthetic access$402(Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;Landroid/bluetooth/BluetoothHeadset;)Landroid/bluetooth/BluetoothHeadset;
    .locals 0

    iput-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mBluetoothHfp:Landroid/bluetooth/BluetoothHeadset;

    return-object p1
.end method

.method public static synthetic access$502(Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->isInitHfp:Z

    return p1
.end method

.method public static synthetic access$600(Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;)Lcom/jieli/bluetooth_connect/tool/BrEdrEventCbManager;
    .locals 0

    iget-object p0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mBrEdrEventCbManager:Lcom/jieli/bluetooth_connect/tool/BrEdrEventCbManager;

    return-object p0
.end method

.method public static synthetic access$700(Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;Landroid/bluetooth/BluetoothDevice;J)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->startConnectionTimeout(Landroid/bluetooth/BluetoothDevice;J)V

    return-void
.end method

.method public static synthetic access$800(Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->printDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic access$900(Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;Landroid/bluetooth/BluetoothDevice;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->onBrEdrConnection(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method private checkA2dpBadEnv(Ljava/lang/String;Landroid/bluetooth/BluetoothDevice;)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "method",
            "device"
        }
    .end annotation

    const/4 v0, 0x1

    if-eqz p2, :cond_2

    iget-object p2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mContext:Landroid/content/Context;

    invoke-static {p2}, Lcom/jieli/bluetooth_connect/util/ConnectUtil;->isHasConnectPermission(Landroid/content/Context;)Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mBluetoothA2dp:Landroid/bluetooth/BluetoothA2dp;

    if-nez p2, :cond_1

    sget-object p2, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->TAG:Ljava/lang/String;

    const-string v1, "BluetoothA2dp is null"

    invoke-static {p2, p1, v1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v0

    :cond_1
    const/4 p1, 0x0

    return p1

    :cond_2
    :goto_0
    sget-object p2, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->TAG:Ljava/lang/String;

    const-string v1, "device is null"

    invoke-static {p2, p1, v1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v0
.end method

.method private checkHfpBadEnv(Ljava/lang/String;Landroid/bluetooth/BluetoothDevice;)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "method",
            "device"
        }
    .end annotation

    const/4 v0, 0x1

    if-eqz p2, :cond_2

    iget-object p2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mContext:Landroid/content/Context;

    invoke-static {p2}, Lcom/jieli/bluetooth_connect/util/ConnectUtil;->isHasConnectPermission(Landroid/content/Context;)Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mBluetoothHfp:Landroid/bluetooth/BluetoothHeadset;

    if-nez p2, :cond_1

    sget-object p2, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->TAG:Ljava/lang/String;

    const-string v1, "BluetoothHfp is null"

    invoke-static {p2, p1, v1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v0

    :cond_1
    const/4 p1, 0x0

    return p1

    :cond_2
    :goto_0
    sget-object p2, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->TAG:Ljava/lang/String;

    const-string v1, "device is null"

    invoke-static {p2, p1, v1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v0
.end method

.method private initBrEdrService(Landroid/content/Context;)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "context"
        }
    .end annotation

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    const-string v0, "bluetooth"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/bluetooth/BluetoothManager;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothManager;->getAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mBluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

    :cond_1
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mBluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

    if-nez v0, :cond_2

    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mBluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

    :cond_2
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mBluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

    const-string v1, "initBrEdrService"

    if-nez v0, :cond_3

    sget-object p1, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->TAG:Ljava/lang/String;

    const-string v0, "The device does not support Bluetooth."

    invoke-static {p1, v1, v0}, Lcom/jieli/bluetooth_connect/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_3
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mBluetoothA2dp:Landroid/bluetooth/BluetoothA2dp;

    if-nez v0, :cond_4

    iget-boolean v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->isInitA2dp:Z

    if-nez v0, :cond_4

    :try_start_0
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mBluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

    iget-object v2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mBTServiceListener:Landroid/bluetooth/BluetoothProfile$ServiceListener;

    const/4 v3, 0x2

    invoke-virtual {v0, p1, v2, v3}, Landroid/bluetooth/BluetoothAdapter;->getProfileProxy(Landroid/content/Context;Landroid/bluetooth/BluetoothProfile$ServiceListener;I)Z

    move-result v0

    iput-boolean v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->isInitA2dp:Z

    iget-boolean v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->isInitA2dp:Z

    if-nez v0, :cond_4

    sget-object v0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->TAG:Ljava/lang/String;

    const-string v2, "getProfileProxy: a2dp error."

    invoke-static {v0, v1, v2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_4
    :goto_0
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mBluetoothHfp:Landroid/bluetooth/BluetoothHeadset;

    if-nez v0, :cond_5

    iget-boolean v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->isInitHfp:Z

    if-nez v0, :cond_5

    :try_start_1
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mBluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

    iget-object v2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mBTServiceListener:Landroid/bluetooth/BluetoothProfile$ServiceListener;

    const/4 v3, 0x1

    invoke-virtual {v0, p1, v2, v3}, Landroid/bluetooth/BluetoothAdapter;->getProfileProxy(Landroid/content/Context;Landroid/bluetooth/BluetoothProfile$ServiceListener;I)Z

    move-result p1

    iput-boolean p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->isInitHfp:Z

    iget-boolean p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->isInitHfp:Z

    if-nez p1, :cond_5

    sget-object p1, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->TAG:Ljava/lang/String;

    const-string v0, "getProfileProxy: hfp error"

    invoke-static {p1, v1, v0}, Lcom/jieli/bluetooth_connect/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_5
    :goto_1
    return-void
.end method

.method private onA2dpStatus(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 5
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

    sget-object v0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->TAG:Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->printDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p2}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->connectionString(I)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v1, v2}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "device : [%s], status : %s"

    invoke-static {v2, v1}, Lcom/jieli/bluetooth_connect/util/ConnectUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "onA2dpStatus"

    invoke-static {v0, v2, v1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mBrEdrEventCbManager:Lcom/jieli/bluetooth_connect/tool/BrEdrEventCbManager;

    invoke-virtual {v1, p1, p2}, Lcom/jieli/bluetooth_connect/tool/BrEdrEventCbManager;->onA2dpStatus(Landroid/bluetooth/BluetoothDevice;I)V

    if-nez p2, :cond_0

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->onBrEdrConnection(Landroid/bluetooth/BluetoothDevice;I)V

    return-void

    :cond_0
    const/4 v1, 0x2

    if-ne p2, v1, :cond_1

    invoke-direct {p0, p1, v1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->onBrEdrConnection(Landroid/bluetooth/BluetoothDevice;I)V

    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->isConnectedByHfp(Landroid/bluetooth/BluetoothDevice;)I

    move-result p2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "a2dp is connected, hfp status = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->connectionString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v2, v3}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eq p2, v1, :cond_1

    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->connectByProfiles(Landroid/bluetooth/BluetoothDevice;)Z

    :cond_1
    return-void
.end method

.method private onBrEdrConnection(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 3
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

    sget-object v0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->TAG:Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->printDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p2}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->connectionString(I)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v1, v2}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "device : [%s], status : %s"

    invoke-static {v2, v1}, Lcom/jieli/bluetooth_connect/util/ConnectUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "onBrEdrConnection"

    invoke-static {v0, v2, v1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    if-eq p2, v0, :cond_0

    invoke-virtual {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->getConnectingBrEdrDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->deviceEquals(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->setConnectingEdr(Landroid/bluetooth/BluetoothDevice;)V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mHandler:Landroid/os/Handler;

    const/16 v1, 0x6621

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    :cond_0
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mBrEdrEventCbManager:Lcom/jieli/bluetooth_connect/tool/BrEdrEventCbManager;

    invoke-virtual {v0, p1, p2}, Lcom/jieli/bluetooth_connect/tool/BrEdrEventCbManager;->onBrEdrConnection(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method private onDeviceUuids(Landroid/bluetooth/BluetoothDevice;[Landroid/os/ParcelUuid;)V
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

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mBrEdrEventCbManager:Lcom/jieli/bluetooth_connect/tool/BrEdrEventCbManager;

    invoke-virtual {v0, p1, p2}, Lcom/jieli/bluetooth_connect/tool/BrEdrEventCbManager;->onDeviceUuids(Landroid/bluetooth/BluetoothDevice;[Landroid/os/ParcelUuid;)V

    invoke-virtual {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->getConnectingBrEdrDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->deviceEquals(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->connectByProfiles(Landroid/bluetooth/BluetoothDevice;)Z

    move-result p2

    if-nez p2, :cond_0

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->onBrEdrConnection(Landroid/bluetooth/BluetoothDevice;I)V

    :cond_0
    return-void
.end method

.method private onHfpStatus(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 5
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

    sget-object v0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->TAG:Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->printDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p2}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->connectionString(I)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v1, v2}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "device : [%s], status : %s"

    invoke-static {v2, v1}, Lcom/jieli/bluetooth_connect/util/ConnectUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "onHfpStatus"

    invoke-static {v0, v2, v1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mBrEdrEventCbManager:Lcom/jieli/bluetooth_connect/tool/BrEdrEventCbManager;

    invoke-virtual {v1, p1, p2}, Lcom/jieli/bluetooth_connect/tool/BrEdrEventCbManager;->onHfpStatus(Landroid/bluetooth/BluetoothDevice;I)V

    if-nez p2, :cond_0

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->onBrEdrConnection(Landroid/bluetooth/BluetoothDevice;I)V

    return-void

    :cond_0
    const/4 v1, 0x2

    if-ne p2, v1, :cond_1

    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->isConnectedByA2dp(Landroid/bluetooth/BluetoothDevice;)I

    move-result p2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "hfp is connected, a2dp status = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->connectionString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v2, v3}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eq p2, v1, :cond_1

    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->connectByProfiles(Landroid/bluetooth/BluetoothDevice;)Z

    :cond_1
    return-void
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

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mContext:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->printBtDeviceInfo(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private registerReceiver()V
    .locals 3

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mBluetoothHandFreeReceiver:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr$BluetoothHandFreeReceiver;

    if-nez v0, :cond_0

    new-instance v0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr$BluetoothHandFreeReceiver;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr$BluetoothHandFreeReceiver;-><init>(Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr$1;)V

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mBluetoothHandFreeReceiver:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr$BluetoothHandFreeReceiver;

    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "android.bluetooth.device.action.UUID"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "android.bluetooth.a2dp.profile.action.PLAYING_STATE_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mBluetoothHandFreeReceiver:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr$BluetoothHandFreeReceiver;

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    :cond_0
    return-void
.end method

.method private setConnectingEdr(Landroid/bluetooth/BluetoothDevice;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mConnectingEdr:Landroid/bluetooth/BluetoothDevice;

    return-void
.end method

.method private startConnectionTimeout(Landroid/bluetooth/BluetoothDevice;J)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "device",
            "delay"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mHandler:Landroid/os/Handler;

    const/16 v1, 0x6621

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v0, p1, p2, p3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void
.end method

.method private tryToConnectBrEdr(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 4
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

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getUuids()[Landroid/os/ParcelUuid;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getUuids()[Landroid/os/ParcelUuid;

    move-result-object v1

    array-length v1, v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mContext:Landroid/content/Context;

    invoke-static {v1, p1}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->deviceHasA2dp(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mContext:Landroid/content/Context;

    invoke-static {v1, p1}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->deviceHasHfp(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->connectByProfiles(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v1

    const-string v2, "connectByProfiles"

    goto :goto_1

    :cond_2
    :goto_0
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->fetchUuidsWithSdp()Z

    move-result v1

    const-string v2, "fetchUuidsWithSdp"

    :goto_1
    const-string v3, "tryToConnectBrEdr"

    if-nez v1, :cond_3

    invoke-direct {p0, p1, v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->onBrEdrConnection(Landroid/bluetooth/BluetoothDevice;I)V

    sget-object p1, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->TAG:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " failed."

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v3, v0}, Lcom/jieli/bluetooth_connect/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_3
    sget-object p1, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->TAG:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " success."

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v3, v0}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v1
.end method

.method private unregisterReceiver()V
    .locals 2

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mBluetoothHandFreeReceiver:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr$BluetoothHandFreeReceiver;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mContext:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mBluetoothHandFreeReceiver:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr$BluetoothHandFreeReceiver;

    :cond_0
    return-void
.end method


# virtual methods
.method public addListener(Lcom/jieli/bluetooth_connect/interfaces/listener/OnBrEdrListener;)V
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
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mBrEdrEventCbManager:Lcom/jieli/bluetooth_connect/tool/BrEdrEventCbManager;

    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/tool/BrEdrEventCbManager;->addListener(Ljava/lang/Object;)Z

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
    check-cast p1, Lcom/jieli/bluetooth_connect/interfaces/listener/OnBrEdrListener;

    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->addListener(Lcom/jieli/bluetooth_connect/interfaces/listener/OnBrEdrListener;)V

    return-void
.end method

.method public connectBrEdrDevice(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 6
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

    const-string v1, "connectBrEdrDevice"

    if-eqz p1, :cond_4

    iget-object v2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mContext:Landroid/content/Context;

    invoke-static {v2}, Lcom/jieli/bluetooth_connect/util/ConnectUtil;->isHasConnectPermission(Landroid/content/Context;)Z

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->getConnectingBrEdrDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    if-eqz v2, :cond_1

    sget-object p1, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Classic device is connecting. connecting device : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0, v2}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->printDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v1, v2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v0

    :cond_1
    invoke-direct {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->setConnectingEdr(Landroid/bluetooth/BluetoothDevice;)V

    iget-object v2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mBluetoothPair:Lcom/jieli/bluetooth_connect/impl/BluetoothPair;

    invoke-virtual {v2, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->isPaired(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v2

    sget-object v3, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "isPaired : "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v1, v4}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-nez v2, :cond_2

    iget-object v2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mBluetoothPair:Lcom/jieli/bluetooth_connect/impl/BluetoothPair;

    invoke-virtual {v2, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->tryToPair(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "tryToPair : "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v1, v4}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-nez v2, :cond_3

    invoke-direct {p0, p1, v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->onBrEdrConnection(Landroid/bluetooth/BluetoothDevice;I)V

    return v0

    :cond_2
    invoke-direct {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->tryToConnectBrEdr(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v2

    if-nez v2, :cond_3

    return v0

    :cond_3
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->onBrEdrConnection(Landroid/bluetooth/BluetoothDevice;I)V

    const-wide/32 v4, 0x9c40

    invoke-direct {p0, p1, v4, v5}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->startConnectionTimeout(Landroid/bluetooth/BluetoothDevice;J)V

    const-string p1, "Start connecting classic Bluetooth."

    invoke-static {v3, v1, p1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v0

    :cond_4
    :goto_0
    sget-object p1, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->TAG:Ljava/lang/String;

    const-string v2, "device is null."

    invoke-static {p1, v1, v2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v0
.end method

.method public connectByA2dp(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 5
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation

    .line 1
    const-string v0, "connectByA2dp"

    invoke-direct {p0, v0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->checkA2dpBadEnv(Ljava/lang/String;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 2
    :cond_0
    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->isConnectedByA2dp(Landroid/bluetooth/BluetoothDevice;)I

    move-result v1

    .line 3
    sget-object v2, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "deviceA2dpStatus : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->connectionString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v0, v3}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v3, 0x1

    if-eq v1, v3, :cond_2

    const/4 v4, 0x2

    if-eq v1, v4, :cond_1

    .line 4
    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mContext:Landroid/content/Context;

    iget-object v3, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mBluetoothA2dp:Landroid/bluetooth/BluetoothA2dp;

    invoke-static {v1, v3, p1}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->connectDeviceA2dp(Landroid/content/Context;Landroid/bluetooth/BluetoothA2dp;Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ret : "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v0, v1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return p1

    .line 6
    :cond_1
    invoke-direct {p0, p1, v1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->onA2dpStatus(Landroid/bluetooth/BluetoothDevice;I)V

    return v3

    .line 7
    :cond_2
    const-string p1, "A2DP is connecting."

    invoke-static {v2, v0, p1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v3
.end method

.method public connectByA2dp(Ljava/lang/String;)Z
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "address"
        }
    .end annotation

    .line 8
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mContext:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->getRemoteDevice(Landroid/content/Context;Ljava/lang/String;)Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->connectByA2dp(Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    return p1
.end method

.method public connectByHfp(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 5
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation

    .line 1
    const-string v0, "connectByHfp"

    invoke-direct {p0, v0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->checkHfpBadEnv(Ljava/lang/String;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return v2

    .line 2
    :cond_0
    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mContext:Landroid/content/Context;

    invoke-static {v1, p1}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->deviceHasHfp(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 3
    sget-object p1, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->TAG:Ljava/lang/String;

    const-string v1, "no found hfp service"

    invoke-static {p1, v0, v1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v2

    .line 4
    :cond_1
    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->isConnectedByHfp(Landroid/bluetooth/BluetoothDevice;)I

    move-result v1

    .line 5
    sget-object v2, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "deviceHfpStatus : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->connectionString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v0, v3}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v3, 0x1

    if-eq v1, v3, :cond_3

    const/4 v4, 0x2

    if-eq v1, v4, :cond_2

    .line 6
    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mContext:Landroid/content/Context;

    iget-object v3, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mBluetoothHfp:Landroid/bluetooth/BluetoothHeadset;

    invoke-static {v1, v3, p1}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->connectDeviceHfp(Landroid/content/Context;Landroid/bluetooth/BluetoothHeadset;Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ret : "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v0, v1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return p1

    .line 8
    :cond_2
    invoke-direct {p0, p1, v1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->onHfpStatus(Landroid/bluetooth/BluetoothDevice;I)V

    :cond_3
    return v3
.end method

.method public connectByHfp(Ljava/lang/String;)Z
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "address"
        }
    .end annotation

    .line 9
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mContext:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->getRemoteDevice(Landroid/content/Context;Ljava/lang/String;)Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->connectByHfp(Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    return p1
.end method

.method public connectByProfiles(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 8
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

    const-string v1, "connectByProfiles"

    if-eqz p1, :cond_c

    iget-object v2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mContext:Landroid/content/Context;

    invoke-static {v2}, Lcom/jieli/bluetooth_connect/util/ConnectUtil;->isHasConnectPermission(Landroid/content/Context;)Z

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_4

    :cond_0
    sget-object v2, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "device : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->printDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v1, v3}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mBluetoothOption:Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->isSupportA2DP()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    move v3, v0

    goto :goto_1

    :cond_2
    :goto_0
    move v3, v4

    :goto_1
    if-eqz v3, :cond_3

    iget-object v5, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mContext:Landroid/content/Context;

    invoke-static {v5, p1}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->deviceHasA2dp(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v5

    if-eqz v5, :cond_3

    move v5, v4

    goto :goto_2

    :cond_3
    move v5, v0

    :goto_2
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "supportA2dp : "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, ", devHasA2dp : "

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v1, v3}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v5, :cond_6

    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->isConnectedByA2dp(Landroid/bluetooth/BluetoothDevice;)I

    move-result v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "deviceA2dpStatus : "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v3}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->connectionString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v1, v5}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v3, :cond_5

    if-eq v3, v4, :cond_4

    const/4 v5, 0x3

    if-eq v3, v5, :cond_5

    goto :goto_3

    :cond_4
    return v4

    :cond_5
    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->connectByA2dp(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "connectByA2dp : "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v2, v1, v6}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v5, :cond_7

    return v4

    :cond_6
    const-string v3, "no a2dp."

    invoke-static {v2, v1, v3}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move v3, v0

    :cond_7
    :goto_3
    iget-object v5, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mContext:Landroid/content/Context;

    invoke-static {v5, p1}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->deviceHasHfp(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "devHasHfp : "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v2, v1, v6}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v6, 0x2

    if-eqz v5, :cond_a

    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->isConnectedByHfp(Landroid/bluetooth/BluetoothDevice;)I

    move-result v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "deviceHfpStatus : "

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v3}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->connectionString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v1, v5}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eq v3, v4, :cond_9

    if-eq v3, v6, :cond_8

    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->connectByHfp(Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "connectByHfp : "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v1, v3}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_b

    return v4

    :cond_8
    invoke-direct {p0, p1, v6}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->onBrEdrConnection(Landroid/bluetooth/BluetoothDevice;I)V

    :cond_9
    return v4

    :cond_a
    const-string v5, "no hfp."

    invoke-static {v2, v1, v5}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-ne v3, v6, :cond_b

    invoke-direct {p0, p1, v6}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->onBrEdrConnection(Landroid/bluetooth/BluetoothDevice;I)V

    return v4

    :cond_b
    return v0

    :cond_c
    :goto_4
    sget-object p1, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->TAG:Ljava/lang/String;

    const-string v2, "device is null."

    invoke-static {p1, v1, v2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v0
.end method

.method public destroy()V
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->setConnectingEdr(Landroid/bluetooth/BluetoothDevice;)V

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mHandler:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mBluetoothPair:Lcom/jieli/bluetooth_connect/impl/BluetoothPair;

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mOnBtDevicePairListener:Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDevicePairListener;

    invoke-virtual {v0, v1}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->removeListener(Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDevicePairListener;)V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mBrEdrEventCbManager:Lcom/jieli/bluetooth_connect/tool/BrEdrEventCbManager;

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/tool/BrEdrEventCbManager;->destroy()V

    invoke-direct {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->unregisterReceiver()V

    return-void
.end method

.method public disconnectByProfiles(Landroid/bluetooth/BluetoothDevice;)Z
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

    const-string v1, "disconnectByProfiles"

    if-eqz p1, :cond_4

    iget-object v2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mContext:Landroid/content/Context;

    invoke-static {v2}, Lcom/jieli/bluetooth_connect/util/ConnectUtil;->isHasConnectPermission(Landroid/content/Context;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    sget-object v2, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "device : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->printDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v1, v3}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->isConnectedByA2dp(Landroid/bluetooth/BluetoothDevice;)I

    move-result v3

    const/4 v4, 0x2

    if-ne v3, v4, :cond_1

    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->disconnectFromA2dp(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v5

    goto :goto_0

    :cond_1
    move v5, v0

    :goto_0
    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->isConnectedByHfp(Landroid/bluetooth/BluetoothDevice;)I

    move-result v6

    if-ne v6, v4, :cond_2

    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->disconnectFromHfp(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v5

    :cond_2
    if-nez v3, :cond_3

    if-nez v6, :cond_3

    invoke-direct {p0, p1, v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->onBrEdrConnection(Landroid/bluetooth/BluetoothDevice;I)V

    const/4 v5, 0x1

    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "ret :  "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, v1, p1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v5

    :cond_4
    :goto_1
    sget-object p1, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->TAG:Ljava/lang/String;

    const-string v2, "device is null"

    invoke-static {p1, v1, v2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v0
.end method

.method public disconnectFromA2dp(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 6
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation

    .line 1
    const-string v0, "disconnectFromA2dp"

    invoke-direct {p0, v0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->checkA2dpBadEnv(Ljava/lang/String;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return v2

    .line 2
    :cond_0
    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->isConnectedByA2dp(Landroid/bluetooth/BluetoothDevice;)I

    move-result v1

    .line 3
    sget-object v3, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "deviceA2dpStatus : "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->connectionString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v0, v4}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v4, 0x1

    if-eq v1, v4, :cond_2

    const/4 v5, 0x2

    if-eq v1, v5, :cond_1

    .line 4
    invoke-direct {p0, p1, v2}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->onA2dpStatus(Landroid/bluetooth/BluetoothDevice;I)V

    return v4

    .line 5
    :cond_1
    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mBluetoothA2dp:Landroid/bluetooth/BluetoothA2dp;

    invoke-static {v1, v2, p1}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->disconnectDeviceA2dp(Landroid/content/Context;Landroid/bluetooth/BluetoothA2dp;Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ret : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v0, v1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return p1

    .line 7
    :cond_2
    const-string p1, "A2DP is connecting."

    invoke-static {v3, v0, p1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v2
.end method

.method public disconnectFromA2dp(Ljava/lang/String;)Z
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "address"
        }
    .end annotation

    .line 8
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mContext:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->getRemoteDevice(Landroid/content/Context;Ljava/lang/String;)Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->disconnectFromA2dp(Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    return p1
.end method

.method public disconnectFromHfp(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 6
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation

    .line 1
    const-string v0, "disconnectFromHfp"

    invoke-direct {p0, v0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->checkHfpBadEnv(Ljava/lang/String;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return v2

    .line 2
    :cond_0
    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->isConnectedByHfp(Landroid/bluetooth/BluetoothDevice;)I

    move-result v1

    .line 3
    sget-object v3, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "deviceHfpStatus : "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->connectionString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v0, v4}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v4, 0x1

    if-eq v1, v4, :cond_2

    const/4 v5, 0x2

    if-eq v1, v5, :cond_1

    .line 4
    invoke-direct {p0, p1, v2}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->onHfpStatus(Landroid/bluetooth/BluetoothDevice;I)V

    return v4

    .line 5
    :cond_1
    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mBluetoothHfp:Landroid/bluetooth/BluetoothHeadset;

    invoke-static {v1, v2, p1}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->disconnectDeviceHfp(Landroid/content/Context;Landroid/bluetooth/BluetoothHeadset;Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ret : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v0, v1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return p1

    .line 7
    :cond_2
    const-string p1, "HFP is connecting."

    invoke-static {v3, v0, p1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v2
.end method

.method public disconnectFromHfp(Ljava/lang/String;)Z
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "address"
        }
    .end annotation

    .line 8
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mContext:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->getRemoteDevice(Landroid/content/Context;Ljava/lang/String;)Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->disconnectFromHfp(Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    return p1
.end method

.method public getActivityBluetoothDevice()Landroid/bluetooth/BluetoothDevice;
    .locals 2

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mBluetoothA2dp:Landroid/bluetooth/BluetoothA2dp;

    invoke-static {v0, v1}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->getActivityDevice(Landroid/content/Context;Landroid/bluetooth/BluetoothA2dp;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    return-object v0
.end method

.method public getBluetoothA2dp()Landroid/bluetooth/BluetoothA2dp;
    .locals 1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mBluetoothA2dp:Landroid/bluetooth/BluetoothA2dp;

    return-object v0
.end method

.method public getBluetoothHfp()Landroid/bluetooth/BluetoothHeadset;
    .locals 1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mBluetoothHfp:Landroid/bluetooth/BluetoothHeadset;

    return-object v0
.end method

.method public getBluetoothPair()Lcom/jieli/bluetooth_connect/impl/BluetoothPair;
    .locals 1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mBluetoothPair:Lcom/jieli/bluetooth_connect/impl/BluetoothPair;

    return-object v0
.end method

.method public getConnectingBrEdrDevice()Landroid/bluetooth/BluetoothDevice;
    .locals 1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mConnectingEdr:Landroid/bluetooth/BluetoothDevice;

    return-object v0
.end method

.method public isBrEdrConnecting()Z
    .locals 1

    invoke-virtual {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->getConnectingBrEdrDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isConnectedByA2dp(Landroid/bluetooth/BluetoothDevice;)I
    .locals 3
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

    const-string v0, "isConnectedByA2dp"

    invoke-direct {p0, v0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->checkA2dpBadEnv(Ljava/lang/String;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mBluetoothA2dp:Landroid/bluetooth/BluetoothA2dp;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothA2dp;->getConnectedDevices()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 p1, 0x2

    return p1

    :cond_2
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mBluetoothA2dp:Landroid/bluetooth/BluetoothA2dp;

    invoke-virtual {v0, p1}, Landroid/bluetooth/BluetoothA2dp;->getConnectionState(Landroid/bluetooth/BluetoothDevice;)I

    move-result p1

    return p1
.end method

.method public isConnectedByHfp(Landroid/bluetooth/BluetoothDevice;)I
    .locals 3
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

    const-string v0, "isConnectedByHfp"

    invoke-direct {p0, v0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->checkHfpBadEnv(Ljava/lang/String;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mBluetoothHfp:Landroid/bluetooth/BluetoothHeadset;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothHeadset;->getConnectedDevices()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 p1, 0x2

    return p1

    :cond_2
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mBluetoothHfp:Landroid/bluetooth/BluetoothHeadset;

    invoke-virtual {v0, p1}, Landroid/bluetooth/BluetoothHeadset;->getConnectionState(Landroid/bluetooth/BluetoothDevice;)I

    move-result p1

    return p1
.end method

.method public isConnectedByProfile(Landroid/bluetooth/BluetoothDevice;)I
    .locals 3
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

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mBluetoothOption:Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->isSupportA2DP()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mContext:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->deviceHasA2dp(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->isConnectedByA2dp(Landroid/bluetooth/BluetoothDevice;)I

    move-result v0

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    const/4 v2, 0x2

    if-ne v0, v2, :cond_2

    return v0

    :cond_2
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mContext:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->deviceHasHfp(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->isConnectedByHfp(Landroid/bluetooth/BluetoothDevice;)I

    move-result p1

    goto :goto_1

    :cond_3
    move p1, v1

    :goto_1
    if-ne p1, v2, :cond_4

    return p1

    :cond_4
    return v1
.end method

.method public removeListener(Lcom/jieli/bluetooth_connect/interfaces/listener/OnBrEdrListener;)V
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
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mBrEdrEventCbManager:Lcom/jieli/bluetooth_connect/tool/BrEdrEventCbManager;

    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/tool/BrEdrEventCbManager;->removeListener(Ljava/lang/Object;)Z

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
    check-cast p1, Lcom/jieli/bluetooth_connect/interfaces/listener/OnBrEdrListener;

    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->removeListener(Lcom/jieli/bluetooth_connect/interfaces/listener/OnBrEdrListener;)V

    return-void
.end method

.method public setActivityBluetoothDevice(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 2
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

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mBluetoothA2dp:Landroid/bluetooth/BluetoothA2dp;

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/jieli/bluetooth_connect/util/ConnectUtil;->isHasConnectPermission(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mBluetoothA2dp:Landroid/bluetooth/BluetoothA2dp;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothA2dp;->getConnectedDevices()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mBluetoothA2dp:Landroid/bluetooth/BluetoothA2dp;

    invoke-static {v0, v1, p1}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->setActivityDevice(Landroid/content/Context;Landroid/bluetooth/BluetoothA2dp;Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
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

    iput-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->mBluetoothOption:Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    return-void
.end method
