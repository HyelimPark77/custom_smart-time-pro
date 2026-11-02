.class public Lcom/jieli/bluetooth_connect/impl/BluetoothPair;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/bluetooth_connect/interfaces/IBluetoothPair;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/bluetooth_connect/impl/BluetoothPair$PairTask;,
        Lcom/jieli/bluetooth_connect/impl/BluetoothPair$PairBtDeviceThread;,
        Lcom/jieli/bluetooth_connect/impl/BluetoothPair$BluetoothPairReceiver;
    }
.end annotation


# static fields
.field private static final MSG_PAIR_TASK_TIMEOUT:I = 0x3f6

.field private static final TAG:Ljava/lang/String; = "BluetoothPair"


# instance fields
.field private final btAdapter:Landroid/bluetooth/BluetoothAdapter;

.field private mBluetoothOption:Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

.field private mBluetoothPairReceiver:Lcom/jieli/bluetooth_connect/impl/BluetoothPair$BluetoothPairReceiver;

.field private final mBtPairEventCbManager:Lcom/jieli/bluetooth_connect/tool/BtPairEventCbManager;

.field private final mContext:Landroid/content/Context;

.field private final mHandler:Landroid/os/Handler;

.field private mPairBtDeviceThread:Lcom/jieli/bluetooth_connect/impl/BluetoothPair$PairBtDeviceThread;

.field private volatile mPairingDevice:Landroid/bluetooth/BluetoothDevice;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDevicePairListener;)V
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "context",
            "listener"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/O0iiX10;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/O0iiX10;-><init>(Lcom/jieli/bluetooth_connect/impl/BluetoothPair;)V

    invoke-direct {v0, v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->mHandler:Landroid/os/Handler;

    invoke-static {p1}, Lcom/jieli/bluetooth_connect/util/ConnectUtil;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->mContext:Landroid/content/Context;

    new-instance v0, Lcom/jieli/bluetooth_connect/tool/BtPairEventCbManager;

    invoke-direct {v0}, Lcom/jieli/bluetooth_connect/tool/BtPairEventCbManager;-><init>()V

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->mBtPairEventCbManager:Lcom/jieli/bluetooth_connect/tool/BtPairEventCbManager;

    const-string v0, "bluetooth"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/bluetooth/BluetoothManager;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothManager;->getAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object p1

    iput-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->btAdapter:Landroid/bluetooth/BluetoothAdapter;

    goto :goto_0

    :cond_0
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object p1

    iput-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->btAdapter:Landroid/bluetooth/BluetoothAdapter;

    :goto_0
    invoke-virtual {p0, p2}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->addListener(Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDevicePairListener;)V

    invoke-direct {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->registerReceiver()V

    invoke-direct {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->startPairTaskThread()V

    return-void
.end method

.method public static synthetic OXO1(Lcom/jieli/bluetooth_connect/impl/BluetoothPair;Landroid/os/Message;)Z
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x3f6

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Landroid/bluetooth/BluetoothDevice;

    if-eqz p1, :cond_0

    invoke-direct {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->wakeupPairTaskThread(Landroid/bluetooth/BluetoothDevice;)V

    const/4 v0, 0x4

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v2, v1}, Lcom/jieli/bluetooth_connect/bean/ErrorInfo;->buildError(IILjava/lang/String;)Lcom/jieli/bluetooth_connect/bean/ErrorInfo;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->onError(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/bean/ErrorInfo;)V

    :cond_0
    return v2
.end method

.method public static synthetic access$1000(Lcom/jieli/bluetooth_connect/impl/BluetoothPair;)Lcom/jieli/bluetooth_connect/tool/BtPairEventCbManager;
    .locals 0

    iget-object p0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->mBtPairEventCbManager:Lcom/jieli/bluetooth_connect/tool/BtPairEventCbManager;

    return-object p0
.end method

.method public static synthetic access$1100(Lcom/jieli/bluetooth_connect/impl/BluetoothPair;)V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->stopPairTaskThread()V

    return-void
.end method

.method public static synthetic access$1200(Lcom/jieli/bluetooth_connect/impl/BluetoothPair;)Landroid/bluetooth/BluetoothDevice;
    .locals 0

    iget-object p0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->mPairingDevice:Landroid/bluetooth/BluetoothDevice;

    return-object p0
.end method

.method public static synthetic access$1300(Lcom/jieli/bluetooth_connect/impl/BluetoothPair;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->mContext:Landroid/content/Context;

    return-object p0
.end method

.method public static synthetic access$500()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method public static synthetic access$600(Lcom/jieli/bluetooth_connect/impl/BluetoothPair;Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/bean/ErrorInfo;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->onError(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/bean/ErrorInfo;)V

    return-void
.end method

.method public static synthetic access$702(Lcom/jieli/bluetooth_connect/impl/BluetoothPair;Lcom/jieli/bluetooth_connect/impl/BluetoothPair$PairBtDeviceThread;)Lcom/jieli/bluetooth_connect/impl/BluetoothPair$PairBtDeviceThread;
    .locals 0

    iput-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->mPairBtDeviceThread:Lcom/jieli/bluetooth_connect/impl/BluetoothPair$PairBtDeviceThread;

    return-object p1
.end method

.method public static synthetic access$800(Lcom/jieli/bluetooth_connect/impl/BluetoothPair;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->stopPairTimeout(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public static synthetic access$900(Lcom/jieli/bluetooth_connect/impl/BluetoothPair;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->wakeupPairTaskThread(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method private addPairTask(Lcom/jieli/bluetooth_connect/impl/BluetoothPair$PairTask;)Z
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "task"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->startPairTaskThread()V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->mPairBtDeviceThread:Lcom/jieli/bluetooth_connect/impl/BluetoothPair$PairBtDeviceThread;

    invoke-static {v0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair$PairBtDeviceThread;->access$200(Lcom/jieli/bluetooth_connect/impl/BluetoothPair$PairBtDeviceThread;Lcom/jieli/bluetooth_connect/impl/BluetoothPair$PairTask;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private getDeviceBoundWay(Landroid/bluetooth/BluetoothDevice;)I
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

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->mContext:Landroid/content/Context;

    invoke-static {v1}, Lcom/jieli/bluetooth_connect/util/ConnectUtil;->isHasConnectPermission(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->mBluetoothOption:Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->isSupportCTKD()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getType()I

    move-result p1

    const/4 v1, 0x3

    if-ne p1, v1, :cond_2

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    const/4 v2, 0x1

    if-lt p1, v1, :cond_1

    iget-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->btAdapter:Landroid/bluetooth/BluetoothAdapter;

    if-eqz p1, :cond_1

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/O1OI010O;->OXO1(Landroid/bluetooth/BluetoothAdapter;)I

    move-result p1

    const/16 v1, 0xa

    if-ne p1, v1, :cond_1

    move v0, v2

    :cond_1
    xor-int/2addr v0, v2

    :cond_2
    sget-object p1, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "pairWay : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "getDeviceBoundWay"

    invoke-static {p1, v2, v1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    :goto_0
    return v0
.end method

.method private onError(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/bean/ErrorInfo;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "device",
            "error"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->mBtPairEventCbManager:Lcom/jieli/bluetooth_connect/tool/BtPairEventCbManager;

    invoke-virtual {v0, p1, p2}, Lcom/jieli/bluetooth_connect/tool/BtPairEventCbManager;->onPairError(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/bean/ErrorInfo;)V

    return-void
.end method

.method private registerReceiver()V
    .locals 3

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->mBluetoothPairReceiver:Lcom/jieli/bluetooth_connect/impl/BluetoothPair$BluetoothPairReceiver;

    if-nez v0, :cond_0

    new-instance v0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair$BluetoothPairReceiver;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair$BluetoothPairReceiver;-><init>(Lcom/jieli/bluetooth_connect/impl/BluetoothPair;Lcom/jieli/bluetooth_connect/impl/BluetoothPair$1;)V

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->mBluetoothPairReceiver:Lcom/jieli/bluetooth_connect/impl/BluetoothPair$BluetoothPairReceiver;

    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "android.bluetooth.device.action.BOND_STATE_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "android.bluetooth.adapter.action.STATE_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->mBluetoothPairReceiver:Lcom/jieli/bluetooth_connect/impl/BluetoothPair$BluetoothPairReceiver;

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    :cond_0
    return-void
.end method

.method private setPairingDevice(Landroid/bluetooth/BluetoothDevice;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "pairingDevice"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->mPairingDevice:Landroid/bluetooth/BluetoothDevice;

    return-void
.end method

.method private startPairTaskThread()V
    .locals 2

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->mPairBtDeviceThread:Lcom/jieli/bluetooth_connect/impl/BluetoothPair$PairBtDeviceThread;

    if-nez v0, :cond_0

    new-instance v0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair$PairBtDeviceThread;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair$PairBtDeviceThread;-><init>(Lcom/jieli/bluetooth_connect/impl/BluetoothPair;Lcom/jieli/bluetooth_connect/impl/BluetoothPair$1;)V

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->mPairBtDeviceThread:Lcom/jieli/bluetooth_connect/impl/BluetoothPair$PairBtDeviceThread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    :cond_0
    return-void
.end method

.method private startPairTimeOut(Landroid/bluetooth/BluetoothDevice;)V
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x1

    invoke-static {p1}, Lcom/jieli/bluetooth_connect/bean/ErrorInfo;->buildError(I)Lcom/jieli/bluetooth_connect/bean/ErrorInfo;

    move-result-object p1

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->onError(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/bean/ErrorInfo;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->mHandler:Landroid/os/Handler;

    const/16 v1, 0x3f6

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x5

    invoke-static {v0}, Lcom/jieli/bluetooth_connect/bean/ErrorInfo;->buildError(I)Lcom/jieli/bluetooth_connect/bean/ErrorInfo;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->onError(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/bean/ErrorInfo;)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-direct {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->setPairingDevice(Landroid/bluetooth/BluetoothDevice;)V

    iget-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->mHandler:Landroid/os/Handler;

    const-wide/16 v1, 0x7530

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void
.end method

.method private stopPairTaskThread()V
    .locals 1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->mPairBtDeviceThread:Lcom/jieli/bluetooth_connect/impl/BluetoothPair$PairBtDeviceThread;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair$PairBtDeviceThread;->access$400(Lcom/jieli/bluetooth_connect/impl/BluetoothPair$PairBtDeviceThread;)V

    :cond_0
    return-void
.end method

.method private stopPairTimeout(Landroid/bluetooth/BluetoothDevice;)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->mHandler:Landroid/os/Handler;

    const/16 v1, 0x3f6

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->mPairingDevice:Landroid/bluetooth/BluetoothDevice;

    invoke-static {p1, v0}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->deviceEquals(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->mHandler:Landroid/os/Handler;

    invoke-virtual {p1, v1}, Landroid/os/Handler;->removeMessages(I)V

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->setPairingDevice(Landroid/bluetooth/BluetoothDevice;)V

    :cond_0
    return-void
.end method

.method private unregisterReceiver()V
    .locals 2

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->mBluetoothPairReceiver:Lcom/jieli/bluetooth_connect/impl/BluetoothPair$BluetoothPairReceiver;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->mContext:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->mBluetoothPairReceiver:Lcom/jieli/bluetooth_connect/impl/BluetoothPair$BluetoothPairReceiver;

    :cond_0
    return-void
.end method

.method private wakeupPairTaskThread(Landroid/bluetooth/BluetoothDevice;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->mPairBtDeviceThread:Lcom/jieli/bluetooth_connect/impl/BluetoothPair$PairBtDeviceThread;

    if-eqz v0, :cond_0

    invoke-static {v0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair$PairBtDeviceThread;->access$300(Lcom/jieli/bluetooth_connect/impl/BluetoothPair$PairBtDeviceThread;Landroid/bluetooth/BluetoothDevice;)V

    :cond_0
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
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->mBtPairEventCbManager:Lcom/jieli/bluetooth_connect/tool/BtPairEventCbManager;

    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/tool/BtPairEventCbManager;->addListener(Ljava/lang/Object;)Z

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

    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->addListener(Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDevicePairListener;)V

    return-void
.end method

.method public destroy()V
    .locals 2

    invoke-direct {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->unregisterReceiver()V

    invoke-direct {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->stopPairTaskThread()V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->mBtPairEventCbManager:Lcom/jieli/bluetooth_connect/tool/BtPairEventCbManager;

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/tool/BtPairEventCbManager;->destroy()V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    return-void
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

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->getPairedDevices(Landroid/content/Context;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public isPaired(Landroid/bluetooth/BluetoothDevice;)Z
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

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/jieli/bluetooth_connect/util/ConnectUtil;->isHasConnectPermission(Landroid/content/Context;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    if-eqz p1, :cond_1

    const/16 v0, 0xc

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getBondState()I

    move-result p1

    if-ne v0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public isPairing(Landroid/bluetooth/BluetoothDevice;)Z
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

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/jieli/bluetooth_connect/util/ConnectUtil;->isHasConnectPermission(Landroid/content/Context;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    if-eqz p1, :cond_1

    const/16 v0, 0xb

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getBondState()I

    move-result p1

    if-ne v0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public pair(Landroid/bluetooth/BluetoothDevice;)Z
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

    if-eqz p1, :cond_1

    .line 1
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/jieli/bluetooth_connect/util/ConnectUtil;->isHasConnectPermission(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-direct {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->getDeviceBoundWay(Landroid/bluetooth/BluetoothDevice;)I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->pair(Landroid/bluetooth/BluetoothDevice;I)Z

    move-result p1

    return p1

    .line 3
    :cond_1
    :goto_0
    sget-object p1, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->TAG:Ljava/lang/String;

    const-string v0, "pair"

    const-string v1, "device is null"

    invoke-static {p1, v0, v1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method

.method public pair(Landroid/bluetooth/BluetoothDevice;I)Z
    .locals 6
    .param p2    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
            to = 0x2L
        .end annotation
    .end param
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
            "pairWay"
        }
    .end annotation

    const/4 v0, 0x0

    .line 4
    const-string v1, "pair"

    if-eqz p1, :cond_6

    iget-object v2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->mContext:Landroid/content/Context;

    invoke-static {v2}, Lcom/jieli/bluetooth_connect/util/ConnectUtil;->isHasConnectPermission(Landroid/content/Context;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    if-ltz p2, :cond_1

    const/4 v2, 0x2

    if-le p2, v2, :cond_2

    :cond_1
    move p2, v0

    :cond_2
    if-nez p2, :cond_3

    .line 5
    iget-object p2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->mContext:Landroid/content/Context;

    invoke-static {p2, p1}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->createBond(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;)Z

    move-result p2

    .line 6
    sget-object v2, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "createBond ---> "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v1, v3}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 7
    :cond_3
    iget-object v2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->mContext:Landroid/content/Context;

    invoke-static {v2, p1, p2}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->createBond(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;I)Z

    move-result v2

    .line 8
    sget-object v3, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "createBond pairWay = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ", result : "

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v3, v1, p2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-nez v2, :cond_4

    .line 9
    iget-object p2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->mContext:Landroid/content/Context;

    invoke-static {p2, p1}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->createBond(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;)Z

    move-result p2

    .line 10
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Failed to pair with way, so createBond result : "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v1, v2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    move p2, v2

    :goto_0
    if-nez p2, :cond_5

    return v0

    .line 11
    :cond_5
    invoke-direct {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->startPairTimeOut(Landroid/bluetooth/BluetoothDevice;)V

    const/4 p1, 0x1

    return p1

    .line 12
    :cond_6
    :goto_1
    sget-object p1, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->TAG:Ljava/lang/String;

    const-string p2, "device is null"

    invoke-static {p1, v1, p2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v0
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
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->mBtPairEventCbManager:Lcom/jieli/bluetooth_connect/tool/BtPairEventCbManager;

    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/tool/BtPairEventCbManager;->removeListener(Ljava/lang/Object;)Z

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

    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->removeListener(Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDevicePairListener;)V

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

    iput-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->mBluetoothOption:Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

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
    invoke-direct {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->getDeviceBoundWay(Landroid/bluetooth/BluetoothDevice;)I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->tryToPair(Landroid/bluetooth/BluetoothDevice;I)Z

    move-result p1

    return p1
.end method

.method public tryToPair(Landroid/bluetooth/BluetoothDevice;I)Z
    .locals 2
    .param p2    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
            to = 0x2L
        .end annotation
    .end param
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

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 2
    :cond_0
    new-instance v1, Lcom/jieli/bluetooth_connect/impl/BluetoothPair$PairTask;

    invoke-direct {v1, v0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair$PairTask;-><init>(ILandroid/bluetooth/BluetoothDevice;)V

    invoke-virtual {v1, p2}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair$PairTask;->setPairWay(I)Lcom/jieli/bluetooth_connect/impl/BluetoothPair$PairTask;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->addPairTask(Lcom/jieli/bluetooth_connect/impl/BluetoothPair$PairTask;)Z

    move-result p1

    return p1
.end method

.method public tryToUnPair(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    new-instance v0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair$PairTask;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair$PairTask;-><init>(ILandroid/bluetooth/BluetoothDevice;)V

    invoke-direct {p0, v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->addPairTask(Lcom/jieli/bluetooth_connect/impl/BluetoothPair$PairTask;)Z

    move-result p1

    return p1
.end method

.method public unPair(Landroid/bluetooth/BluetoothDevice;)Z
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
            "device"
        }
    .end annotation

    const-string v0, "unPair"

    if-nez p1, :cond_0

    sget-object p1, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->TAG:Ljava/lang/String;

    const-string v1, "device is null."

    invoke-static {p1, v0, v1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->mContext:Landroid/content/Context;

    invoke-static {v1, p1}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->removeBond(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v1

    sget-object v2, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "removeBond : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v0, v3}, Lcom/jieli/bluetooth_connect/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v1, :cond_1

    invoke-direct {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothPair;->startPairTimeOut(Landroid/bluetooth/BluetoothDevice;)V

    :cond_1
    return v1
.end method
