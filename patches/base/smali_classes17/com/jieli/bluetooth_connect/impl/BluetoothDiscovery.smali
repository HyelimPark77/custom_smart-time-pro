.class public Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/bluetooth_connect/interfaces/IBluetoothDiscovery;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery$BluetoothReceiver;,
        Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery$BluetoothDiscoveryReceiver;
    }
.end annotation


# static fields
.field private static final MSG_DISCOVERY_BLE_TIMEOUT:I = 0x3f3

.field private static final MSG_DISCOVERY_EDR_TIMEOUT:I = 0x3fe

.field public static SCAN_MIN_TIMEOUT:I = 0x7d0

.field private static final TAG:Ljava/lang/String; = "BluetoothDiscovery"


# instance fields
.field private isBleScanning:Z

.field private isEdrScanning:Z

.field private final leScanCallback:Landroid/bluetooth/BluetoothAdapter$LeScanCallback;

.field private final mBluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

.field private mBluetoothDiscoveryReceiver:Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery$BluetoothDiscoveryReceiver;

.field private mBluetoothLeScanner:Landroid/bluetooth/le/BluetoothLeScanner;

.field private mBluetoothOption:Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

.field private mBluetoothReceiver:Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery$BluetoothReceiver;

.field private final mBtDiscoveryCbManager:Lcom/jieli/bluetooth_connect/tool/BtDiscoveryCbManager;

.field private final mContext:Landroid/content/Context;

.field private final mDiscoveredDevices:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/bluetooth/BluetoothDevice;",
            ">;"
        }
    .end annotation
.end field

.field private final mDiscoveredEdrDevices:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/bluetooth/BluetoothDevice;",
            ">;"
        }
    .end annotation
.end field

.field private final mHandler:Landroid/os/Handler;

.field private final mScanCallback:Landroid/bluetooth/le/ScanCallback;
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x15
    .end annotation
.end field

.field private mScanType:I

.field private scanTotalTime:J

.field private startBleScanTime:J

.field private startEdrScanTime:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/jieli/bluetooth_connect/bean/BluetoothOption;Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDiscoveryListener;)V
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "context",
            "option",
            "listener"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mDiscoveredDevices:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mDiscoveredEdrDevices:Ljava/util/List;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/I01X;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/I01X;-><init>(Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;)V

    invoke-direct {v0, v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mHandler:Landroid/os/Handler;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OIIOXiXXi;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OIIOXiXXi;-><init>(Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;)V

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->leScanCallback:Landroid/bluetooth/BluetoothAdapter$LeScanCallback;

    new-instance v0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery$1;

    invoke-direct {v0, p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery$1;-><init>(Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;)V

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mScanCallback:Landroid/bluetooth/le/ScanCallback;

    invoke-static {p1}, Lcom/jieli/bluetooth_connect/util/ConnectUtil;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    iput-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mContext:Landroid/content/Context;

    invoke-virtual {p0, p2}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->setBluetoothOption(Lcom/jieli/bluetooth_connect/bean/BluetoothOption;)V

    new-instance p1, Lcom/jieli/bluetooth_connect/tool/BtDiscoveryCbManager;

    invoke-direct {p1}, Lcom/jieli/bluetooth_connect/tool/BtDiscoveryCbManager;-><init>()V

    iput-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mBtDiscoveryCbManager:Lcom/jieli/bluetooth_connect/tool/BtDiscoveryCbManager;

    invoke-virtual {p0, p3}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->addListener(Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDiscoveryListener;)V

    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object p1

    iput-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mBluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

    invoke-direct {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->getBluetoothLeScanner()Landroid/bluetooth/le/BluetoothLeScanner;

    invoke-direct {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->registerBtReceiver()V

    return-void
.end method

.method public static synthetic OXO1(Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;Landroid/bluetooth/BluetoothDevice;I[B)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->filterDevice(Landroid/bluetooth/BluetoothDevice;I[BZ)V

    return-void
.end method

.method public static synthetic XIi00iiXO(Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;Landroid/os/Message;)Z
    .locals 4

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p1, Landroid/os/Message;->what:I

    const/16 v0, 0x3f3

    const/4 v1, 0x1

    if-eq p1, v0, :cond_1

    const/16 v0, 0x3fe

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->isDeviceScanning()Z

    move-result p1

    sget-object v0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "deviceScanning = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "MSG_DISCOVERY_EDR_TIMEOUT"

    invoke-static {v0, v3, v2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_2

    invoke-direct {p0, v1}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->stopDeviceScan(Z)Z

    const/4 p1, 0x0

    invoke-direct {p0, p1, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->notifyDiscoveryStatus(ZZ)V

    return v1

    :cond_1
    invoke-virtual {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->isBleScanning()Z

    move-result p1

    sget-object v0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "bleScanning = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "MSG_DISCOVERY_BLE_TIMEOUT"

    invoke-static {v0, v3, v2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_2

    invoke-direct {p0, v1}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->stopBleScan(Z)Z

    :cond_2
    :goto_0
    return v1
.end method

.method public static synthetic access$200(Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;Landroid/bluetooth/BluetoothDevice;I[BZ)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->filterDevice(Landroid/bluetooth/BluetoothDevice;I[BZ)V

    return-void
.end method

.method public static synthetic access$300()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method public static synthetic access$400(Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;)Lcom/jieli/bluetooth_connect/tool/BtDiscoveryCbManager;
    .locals 0

    iget-object p0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mBtDiscoveryCbManager:Lcom/jieli/bluetooth_connect/tool/BtDiscoveryCbManager;

    return-object p0
.end method

.method public static synthetic access$500(Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;ZZ)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->notifyDiscoveryStatus(ZZ)V

    return-void
.end method

.method public static synthetic access$600(Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;)I
    .locals 0

    iget p0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mScanType:I

    return p0
.end method

.method public static synthetic access$700(Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mDiscoveredEdrDevices:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic access$800(Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mDiscoveredDevices:Ljava/util/List;

    return-object p0
.end method

.method private filterDevice(Landroid/bluetooth/BluetoothDevice;I[BZ)V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "device",
            "rssi",
            "scanRecord",
            "isBleEnableConnect"
        }
    .end annotation

    if-eqz p1, :cond_7

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/jieli/bluetooth_connect/util/ConnectUtil;->isHasConnectPermission(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->isBluetoothEnable()Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mBluetoothOption:Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->isSkipNoneNameDevice()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move v0, v1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    iget-object v2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mBluetoothOption:Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    invoke-virtual {v2}, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->getBleScanStrategy()I

    move-result v2

    if-nez v2, :cond_3

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mDiscoveredDevices:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mBluetoothOption:Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->getOtaScanFilterData()Ljava/lang/String;

    move-result-object v0

    invoke-static {p3, v0}, Lcom/jieli/bluetooth_connect/util/ParseDataUtil;->parseOTAFlagFilterWithBroad([BLjava/lang/String;)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object v0

    if-nez v0, :cond_2

    new-instance v0, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    invoke-direct {v0}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;-><init>()V

    :cond_2
    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mDiscoveredDevices:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mBtDiscoveryCbManager:Lcom/jieli/bluetooth_connect/tool/BtDiscoveryCbManager;

    invoke-virtual {v0, p3}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setRawData([B)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object p3

    invoke-virtual {p3, p2}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setRssi(I)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object p2

    invoke-virtual {p2, p4}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setEnableConnect(Z)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object p2

    invoke-virtual {v1, p1, p2}, Lcom/jieli/bluetooth_connect/tool/BtDiscoveryCbManager;->onDiscoveryDevice(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;)V

    return-void

    :cond_3
    iget-object v2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mBluetoothOption:Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    invoke-static {v2, p3}, Lcom/jieli/bluetooth_connect/util/ParseDataUtil;->isFilterBleDevice(Lcom/jieli/bluetooth_connect/bean/BluetoothOption;[B)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object v2

    if-eqz v2, :cond_7

    if-nez v0, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {v2}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->isEnableConnect()Z

    move-result v0

    if-eqz v0, :cond_5

    if-nez p4, :cond_5

    invoke-virtual {v2, v1}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setEnableConnect(Z)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    :cond_5
    invoke-virtual {v2, p3}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setRawData([B)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    move-result-object p3

    invoke-virtual {p3, p2}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->setRssi(I)Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;

    invoke-virtual {v2}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->isShowDialog()Z

    move-result p2

    if-eqz p2, :cond_6

    iget-object p2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mBtDiscoveryCbManager:Lcom/jieli/bluetooth_connect/tool/BtDiscoveryCbManager;

    invoke-virtual {p2, p1, v2}, Lcom/jieli/bluetooth_connect/tool/BtDiscoveryCbManager;->onShowProductDialog(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;)V

    :cond_6
    iget-object p2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mDiscoveredDevices:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_7

    iget-object p2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mDiscoveredDevices:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mBtDiscoveryCbManager:Lcom/jieli/bluetooth_connect/tool/BtDiscoveryCbManager;

    invoke-virtual {p2, p1, v2}, Lcom/jieli/bluetooth_connect/tool/BtDiscoveryCbManager;->onDiscoveryDevice(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;)V

    :cond_7
    :goto_2
    return-void
.end method

.method private getBluetoothLeScanner()Landroid/bluetooth/le/BluetoothLeScanner;
    .locals 2

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mBluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mBluetoothLeScanner:Landroid/bluetooth/le/BluetoothLeScanner;

    if-nez v1, :cond_0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->getBluetoothLeScanner()Landroid/bluetooth/le/BluetoothLeScanner;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mBluetoothLeScanner:Landroid/bluetooth/le/BluetoothLeScanner;

    :cond_0
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mBluetoothLeScanner:Landroid/bluetooth/le/BluetoothLeScanner;

    return-object v0
.end method

.method private getCurrentTime()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method private notifyDiscoveryStatus(ZZ)V
    .locals 4
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

    sget-object v0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "bBle : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", bStart : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", mScanType : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mScanType:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "notifyDiscoveryStatus"

    invoke-static {v0, v2, v1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mScanType:I

    const/4 v1, 0x0

    if-nez p2, :cond_1

    const-wide/16 v2, 0x0

    if-eqz p1, :cond_0

    iput-wide v2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->startBleScanTime:J

    invoke-direct {p0, v1}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->setBleScanning(Z)V

    iget-object v2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mHandler:Landroid/os/Handler;

    const/16 v3, 0x3f3

    invoke-virtual {v2, v3}, Landroid/os/Handler;->removeMessages(I)V

    goto :goto_0

    :cond_0
    iput-wide v2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->startEdrScanTime:J

    invoke-direct {p0, v1}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->setDeviceScanning(Z)V

    invoke-direct {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->unregisterReceiver()V

    iget-object v2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mHandler:Landroid/os/Handler;

    const/16 v3, 0x3fe

    invoke-virtual {v2, v3}, Landroid/os/Handler;->removeMessages(I)V

    :goto_0
    iput v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mScanType:I

    :cond_1
    const/4 v2, 0x1

    if-nez v0, :cond_2

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mBtDiscoveryCbManager:Lcom/jieli/bluetooth_connect/tool/BtDiscoveryCbManager;

    invoke-virtual {p1, v2, p2}, Lcom/jieli/bluetooth_connect/tool/BtDiscoveryCbManager;->onDiscoveryStatusChange(ZZ)V

    return-void

    :cond_2
    if-ne v0, v2, :cond_3

    if-nez p1, :cond_3

    iget-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mBtDiscoveryCbManager:Lcom/jieli/bluetooth_connect/tool/BtDiscoveryCbManager;

    invoke-virtual {p1, v1, p2}, Lcom/jieli/bluetooth_connect/tool/BtDiscoveryCbManager;->onDiscoveryStatusChange(ZZ)V

    :cond_3
    return-void
.end method

.method private registerBtReceiver()V
    .locals 3

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mBluetoothReceiver:Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery$BluetoothReceiver;

    if-nez v0, :cond_0

    new-instance v0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery$BluetoothReceiver;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery$BluetoothReceiver;-><init>(Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery$1;)V

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mBluetoothReceiver:Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery$BluetoothReceiver;

    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "android.bluetooth.adapter.action.STATE_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mBluetoothReceiver:Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery$BluetoothReceiver;

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    :cond_0
    return-void
.end method

.method private registerReceiver()V
    .locals 3

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mBluetoothDiscoveryReceiver:Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery$BluetoothDiscoveryReceiver;

    if-nez v0, :cond_0

    new-instance v0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery$BluetoothDiscoveryReceiver;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery$BluetoothDiscoveryReceiver;-><init>(Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery$1;)V

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mBluetoothDiscoveryReceiver:Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery$BluetoothDiscoveryReceiver;

    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "android.bluetooth.adapter.action.DISCOVERY_STARTED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "android.bluetooth.adapter.action.DISCOVERY_FINISHED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "android.bluetooth.device.action.FOUND"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mBluetoothDiscoveryReceiver:Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery$BluetoothDiscoveryReceiver;

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    :cond_0
    return-void
.end method

.method private setBleScanning(Z)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "bleScanning"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->isBleScanning:Z

    return-void
.end method

.method private setDeviceScanning(Z)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "edrScanning"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->isEdrScanning:Z

    return-void
.end method

.method private stopBleScan(Z)Z
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
            "isMandatory"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mBluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

    const/4 v1, 0x0

    const-string v2, "stopBleScan"

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/jieli/bluetooth_connect/util/ConnectUtil;->isHasScanPermission(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_1

    :cond_0
    invoke-static {}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->isBluetoothEnable()Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    invoke-virtual {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->isBleScanning()Z

    move-result v0

    const/4 v3, 0x1

    if-nez v0, :cond_2

    return v3

    :cond_2
    invoke-direct {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->getCurrentTime()J

    move-result-wide v4

    iget-wide v6, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->startBleScanTime:J

    sub-long/2addr v4, v6

    if-nez p1, :cond_3

    sget p1, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->SCAN_MIN_TIMEOUT:I

    int-to-long v6, p1

    cmp-long p1, v4, v6

    if-gez p1, :cond_3

    sget-object p1, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->TAG:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Turn on time is too short. usedTime = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", SCAN_MIN_TIMEOUT = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v1, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->SCAN_MIN_TIMEOUT:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v2, v0}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mHandler:Landroid/os/Handler;

    const/16 v0, 0x3f3

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeMessages(I)V

    iget-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mHandler:Landroid/os/Handler;

    sget v1, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->SCAN_MIN_TIMEOUT:I

    int-to-long v1, v1

    sub-long/2addr v1, v4

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return v3

    :cond_3
    invoke-direct {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->getBluetoothLeScanner()Landroid/bluetooth/le/BluetoothLeScanner;

    move-result-object p1

    if-eqz p1, :cond_4

    :try_start_0
    sget-object p1, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->TAG:Ljava/lang/String;

    const-string v0, "stopScan"

    invoke-static {p1, v2, v0}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mBluetoothLeScanner:Landroid/bluetooth/le/BluetoothLeScanner;

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mScanCallback:Landroid/bluetooth/le/ScanCallback;

    invoke-virtual {p1, v0}, Landroid/bluetooth/le/BluetoothLeScanner;->stopScan(Landroid/bluetooth/le/ScanCallback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_0

    :cond_4
    :try_start_1
    sget-object p1, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->TAG:Ljava/lang/String;

    const-string v0, "stopLeScan"

    invoke-static {p1, v2, v0}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mBluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->leScanCallback:Landroid/bluetooth/BluetoothAdapter$LeScanCallback;

    invoke-virtual {p1, v0}, Landroid/bluetooth/BluetoothAdapter;->stopLeScan(Landroid/bluetooth/BluetoothAdapter$LeScanCallback;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    invoke-direct {p0, v3, v1}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->notifyDiscoveryStatus(ZZ)V

    return v3

    :cond_5
    :goto_1
    sget-object p1, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->TAG:Ljava/lang/String;

    const-string v0, "this device is not supported bluetooth."

    invoke-static {p1, v2, v0}, Lcom/jieli/bluetooth_connect/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v1
.end method

.method private stopDeviceScan(Z)Z
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
            "isMandatory"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mBluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

    const/4 v1, 0x0

    const-string v2, "stopDeviceScan"

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/jieli/bluetooth_connect/util/ConnectUtil;->isHasScanPermission(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-static {}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->isBluetoothEnable()Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    .line 4
    :cond_1
    invoke-virtual {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->isDeviceScanning()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_2

    return v1

    .line 5
    :cond_2
    invoke-direct {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->getCurrentTime()J

    move-result-wide v3

    iget-wide v5, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->startEdrScanTime:J

    sub-long/2addr v3, v5

    if-nez p1, :cond_3

    .line 6
    sget p1, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->SCAN_MIN_TIMEOUT:I

    int-to-long v5, p1

    cmp-long p1, v3, v5

    if-gez p1, :cond_3

    .line 7
    sget-object p1, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->TAG:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Turn on time is too short. usedTime = "

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v5, ", SCAN_MIN_TIMEOUT = "

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v5, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->SCAN_MIN_TIMEOUT:I

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v2, v0}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    iget-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mHandler:Landroid/os/Handler;

    const/16 v0, 0x3fe

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeMessages(I)V

    .line 9
    iget-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mHandler:Landroid/os/Handler;

    sget v2, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->SCAN_MIN_TIMEOUT:I

    int-to-long v5, v2

    sub-long/2addr v5, v3

    invoke-virtual {p1, v0, v5, v6}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return v1

    .line 10
    :cond_3
    iget-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mBluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothAdapter;->cancelDiscovery()Z

    move-result p1

    .line 11
    sget-object v0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "cancelDiscovery : "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v2, v1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return p1

    .line 12
    :cond_4
    :goto_0
    sget-object p1, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->TAG:Ljava/lang/String;

    const-string v0, " this device is not supported bluetooth."

    invoke-static {p1, v2, v0}, Lcom/jieli/bluetooth_connect/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v1
.end method

.method private unregisterBtReceiver()V
    .locals 2

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mBluetoothReceiver:Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery$BluetoothReceiver;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mContext:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mBluetoothReceiver:Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery$BluetoothReceiver;

    :cond_0
    return-void
.end method

.method private unregisterReceiver()V
    .locals 2

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mBluetoothDiscoveryReceiver:Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery$BluetoothDiscoveryReceiver;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mContext:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mBluetoothDiscoveryReceiver:Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery$BluetoothDiscoveryReceiver;

    :cond_0
    return-void
.end method


# virtual methods
.method public addListener(Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDiscoveryListener;)V
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
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mBtDiscoveryCbManager:Lcom/jieli/bluetooth_connect/tool/BtDiscoveryCbManager;

    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/tool/BtDiscoveryCbManager;->addListener(Ljava/lang/Object;)Z

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
    check-cast p1, Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDiscoveryListener;

    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->addListener(Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDiscoveryListener;)V

    return-void
.end method

.method public destroy()V
    .locals 2

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mBtDiscoveryCbManager:Lcom/jieli/bluetooth_connect/tool/BtDiscoveryCbManager;

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/tool/BtDiscoveryCbManager;->destroy()V

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->stopDeviceScan(Z)Z

    invoke-direct {p0, v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->stopBleScan(Z)Z

    invoke-direct {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->unregisterReceiver()V

    invoke-direct {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->unregisterBtReceiver()V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    return-void
.end method

.method public getDiscoveredBluetoothDevices()Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Landroid/bluetooth/BluetoothDevice;",
            ">;"
        }
    .end annotation

    iget v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mScanType:I

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mDiscoveredDevices:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mDiscoveredEdrDevices:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public getScanType()I
    .locals 1

    iget v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mScanType:I

    return v0
.end method

.method public isBleScanning()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->isBleScanning:Z

    return v0
.end method

.method public isDeviceScanning()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->isEdrScanning:Z

    return v0
.end method

.method public isScanning()Z
    .locals 1

    invoke-virtual {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->isDeviceScanning()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->isBleScanning()Z

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

.method public removeListener(Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDiscoveryListener;)V
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
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mBtDiscoveryCbManager:Lcom/jieli/bluetooth_connect/tool/BtDiscoveryCbManager;

    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/tool/BtDiscoveryCbManager;->removeListener(Ljava/lang/Object;)Z

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
    check-cast p1, Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDiscoveryListener;

    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->removeListener(Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDiscoveryListener;)V

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

    if-nez p1, :cond_0

    invoke-static {}, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->createDefaultOption()Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mBluetoothOption:Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    return-void
.end method

.method public startBLEScan(J)Z
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
            "timeout"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/jieli/bluetooth_connect/util/ConnectUtil;->isHasScanPermission(Landroid/content/Context;)Z

    move-result v0

    const/4 v1, 0x0

    const-string v2, "startBLEScan"

    if-nez v0, :cond_0

    sget-object p1, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->TAG:Ljava/lang/String;

    const-string p2, "No Bluetooth scanning permission."

    invoke-static {p1, v2, p2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_0
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/jieli/bluetooth_connect/util/ConnectUtil;->isHasLocationPermission(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object p1, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->TAG:Ljava/lang/String;

    const-string p2, "No location permission."

    invoke-static {p1, v2, p2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_1
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mBluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

    if-nez v0, :cond_2

    sget-object p1, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->TAG:Ljava/lang/String;

    const-string p2, "this device is not supported bluetooth."

    invoke-static {p1, v2, p2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_2
    invoke-static {}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->isBluetoothEnable()Z

    move-result v0

    if-nez v0, :cond_3

    sget-object p1, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->TAG:Ljava/lang/String;

    const-string p2, "Bluetooth adapter is close."

    invoke-static {p1, v2, p2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_3
    invoke-virtual {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->isDeviceScanning()Z

    move-result v0

    const/4 v3, 0x1

    if-eqz v0, :cond_4

    invoke-direct {p0, v3}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->stopDeviceScan(Z)Z

    :cond_4
    invoke-virtual {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->isBleScanning()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-wide p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->scanTotalTime:J

    invoke-direct {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->getCurrentTime()J

    move-result-wide v0

    iget-wide v4, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->startBleScanTime:J

    sub-long/2addr v0, v4

    sub-long/2addr p1, v0

    sget-object v0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "scanning ble ..... left timeout : "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v2, p1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v3

    :cond_5
    invoke-direct {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->getBluetoothLeScanner()Landroid/bluetooth/le/BluetoothLeScanner;

    move-result-object v0

    if-eqz v0, :cond_6

    new-instance v0, Landroid/bluetooth/le/ScanSettings$Builder;

    invoke-direct {v0}, Landroid/bluetooth/le/ScanSettings$Builder;-><init>()V

    iget-object v4, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mBluetoothOption:Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    invoke-virtual {v4}, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->getBleScanMode()I

    move-result v4

    invoke-virtual {v0, v4}, Landroid/bluetooth/le/ScanSettings$Builder;->setScanMode(I)Landroid/bluetooth/le/ScanSettings$Builder;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/bluetooth/le/ScanSettings$Builder;->setMatchMode(I)Landroid/bluetooth/le/ScanSettings$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/le/ScanSettings$Builder;->build()Landroid/bluetooth/le/ScanSettings;

    move-result-object v0

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iget-object v5, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mBluetoothLeScanner:Landroid/bluetooth/le/BluetoothLeScanner;

    iget-object v6, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mScanCallback:Landroid/bluetooth/le/ScanCallback;

    invoke-virtual {v5, v4, v0, v6}, Landroid/bluetooth/le/BluetoothLeScanner;->startScan(Ljava/util/List;Landroid/bluetooth/le/ScanSettings;Landroid/bluetooth/le/ScanCallback;)V

    sget-object v0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->TAG:Ljava/lang/String;

    const-string v4, "startScan : true "

    invoke-static {v0, v2, v4}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move v0, v3

    goto :goto_0

    :cond_6
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mBluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

    iget-object v4, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->leScanCallback:Landroid/bluetooth/BluetoothAdapter$LeScanCallback;

    invoke-virtual {v0, v4}, Landroid/bluetooth/BluetoothAdapter;->startLeScan(Landroid/bluetooth/BluetoothAdapter$LeScanCallback;)Z

    move-result v0

    sget-object v4, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->TAG:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "startLeScan : "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v2, v5}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    if-eqz v0, :cond_8

    iput v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mScanType:I

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mDiscoveredDevices:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    invoke-direct {p0, v3}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->setBleScanning(Z)V

    sget v1, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->SCAN_MIN_TIMEOUT:I

    int-to-long v4, v1

    cmp-long v1, p1, v4

    if-gez v1, :cond_7

    const-wide/16 p1, 0x1f40

    :cond_7
    invoke-direct {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->getCurrentTime()J

    move-result-wide v4

    iput-wide v4, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->startBleScanTime:J

    iput-wide p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->scanTotalTime:J

    sget-object v1, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "scanTotalTime : "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v5, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->scanTotalTime:J

    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v2, v4}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mHandler:Landroid/os/Handler;

    const/16 v2, 0x3f3

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeMessages(I)V

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mHandler:Landroid/os/Handler;

    invoke-virtual {v1, v2, p1, p2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    invoke-direct {p0, v3, v3}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->notifyDiscoveryStatus(ZZ)V

    :cond_8
    return v0
.end method

.method public startDeviceScan(IJ)Z
    .locals 7
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
            "type",
            "timeout"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/jieli/bluetooth_connect/util/ConnectUtil;->isHasScanPermission(Landroid/content/Context;)Z

    move-result v0

    const/4 v1, 0x0

    const-string v2, "startDeviceScan"

    if-nez v0, :cond_0

    .line 3
    sget-object p1, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->TAG:Ljava/lang/String;

    const-string p2, "No Bluetooth scanning permission."

    invoke-static {p1, v2, p2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v1

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/jieli/bluetooth_connect/util/ConnectUtil;->isHasLocationPermission(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 5
    sget-object p1, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->TAG:Ljava/lang/String;

    const-string p2, "No location permission."

    invoke-static {p1, v2, p2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v1

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mBluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

    if-nez v0, :cond_2

    .line 7
    sget-object p1, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->TAG:Ljava/lang/String;

    const-string p2, "this device is not supported bluetooth."

    invoke-static {p1, v2, p2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v1

    .line 8
    :cond_2
    invoke-static {}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->isBluetoothEnable()Z

    move-result v0

    if-nez v0, :cond_3

    .line 9
    sget-object p1, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->TAG:Ljava/lang/String;

    const-string p2, "Bluetooth is not turned on."

    invoke-static {p1, v2, p2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_3
    if-nez p1, :cond_4

    .line 10
    invoke-virtual {p0, p2, p3}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->startBLEScan(J)Z

    move-result p1

    return p1

    .line 11
    :cond_4
    invoke-virtual {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->isBleScanning()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_5

    .line 12
    sget-object v0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->TAG:Ljava/lang/String;

    const-string v3, "stopBLEScan"

    invoke-static {v0, v2, v3}, Lcom/jieli/bluetooth_connect/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    invoke-direct {p0, v1}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->stopBleScan(Z)Z

    .line 14
    :cond_5
    invoke-virtual {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->isDeviceScanning()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 15
    iget-wide p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->scanTotalTime:J

    invoke-direct {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->getCurrentTime()J

    move-result-wide v3

    iget-wide v5, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->startEdrScanTime:J

    sub-long/2addr v3, v5

    sub-long/2addr p1, v3

    .line 16
    sget-object p3, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->TAG:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "scanning edr ..... ScanType : "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mScanType:I

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", leftTime : "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p3, v2, p1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v1

    .line 17
    :cond_6
    invoke-direct {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->registerReceiver()V

    .line 18
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mBluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->startDiscovery()Z

    move-result v0

    .line 19
    sget-object v3, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "startDiscovery : "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v2, v4}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-nez v0, :cond_7

    .line 20
    invoke-direct {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->unregisterReceiver()V

    return v0

    .line 21
    :cond_7
    iput p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mScanType:I

    .line 22
    iget-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mDiscoveredEdrDevices:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 23
    invoke-direct {p0, v1}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->setDeviceScanning(Z)V

    .line 24
    sget p1, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->SCAN_MIN_TIMEOUT:I

    int-to-long v1, p1

    cmp-long p1, p2, v1

    if-gez p1, :cond_8

    const-wide/16 p2, 0x1f40

    .line 25
    :cond_8
    invoke-direct {p0}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->getCurrentTime()J

    move-result-wide v1

    iput-wide v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->startEdrScanTime:J

    .line 26
    iput-wide p2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->scanTotalTime:J

    .line 27
    iget-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mHandler:Landroid/os/Handler;

    const/16 v1, 0x3fe

    invoke-virtual {p1, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 28
    iget-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->mHandler:Landroid/os/Handler;

    invoke-virtual {p1, v1, p2, p3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return v0
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

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, v0, p1, p2}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->startDeviceScan(IJ)Z

    move-result p1

    return p1
.end method

.method public stopBLEScan()Z
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->stopBleScan(Z)Z

    move-result v0

    return v0
.end method

.method public stopDeviceScan()Z
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothDiscovery;->stopDeviceScan(Z)Z

    move-result v0

    return v0
.end method
