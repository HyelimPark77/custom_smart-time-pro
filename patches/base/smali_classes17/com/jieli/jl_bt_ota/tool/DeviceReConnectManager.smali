.class public Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static RECONNECT_TIMEOUT:J = 0xfde8L

.field private static final i:Ljava/lang/String; = "DeviceReConnectManager"

.field private static final j:I = 0xbb8

.field private static final k:I = 0x4e20

.field private static final l:I = 0x2

.field private static final m:I = 0x7530

.field private static final n:I = 0x7d0

.field private static final o:I = 0x9455

.field private static final p:I = 0x9456

.field private static final q:I = 0x9457


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

.field private final c:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;

.field private volatile d:Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;

.field private e:J

.field private final f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/jieli/jl_bt_ota/model/BleScanMessage;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Landroid/os/Handler;

.field private final h:Lcom/jieli/jl_bt_ota/interfaces/BtEventCallback;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->e:J

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->f:Ljava/util/Map;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager$1;

    invoke-direct {v2, p0}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager$1;-><init>(Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;)V

    invoke-direct {v0, v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->g:Landroid/os/Handler;

    new-instance v0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager$2;

    invoke-direct {v0, p0}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager$2;-><init>(Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;)V

    iput-object v0, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->h:Lcom/jieli/jl_bt_ota/interfaces/BtEventCallback;

    invoke-static {p1}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->a:Landroid/content/Context;

    invoke-static {p2}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->b:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-static {}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;->getInstance()Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;

    move-result-object p2

    iput-object p2, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->c:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;

    invoke-virtual {p1, v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->registerBluetoothCallback(Lcom/jieli/jl_bt_ota/interfaces/BtEventCallback;)V

    return-void
.end method

.method public static synthetic a()Ljava/lang/String;
    .locals 1

    .line 2
    sget-object v0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->i:Ljava/lang/String;

    return-object v0
.end method

.method private a(IJ)V
    .locals 2

    .line 44
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->b(I)V

    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-lez v0, :cond_0

    .line 45
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->g:Landroid/os/Handler;

    invoke-virtual {v0, p1, p2, p3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void

    .line 46
    :cond_0
    iget-object p2, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->g:Landroid/os/Handler;

    invoke-virtual {p2, p1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void
.end method

.method private a(J)V
    .locals 0

    .line 19
    iput-wide p1, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->e:J

    return-void
.end method

.method private a(Landroid/bluetooth/BluetoothDevice;)V
    .locals 7

    .line 20
    sget-object v0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->i:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->d:Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", device : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "connectBtDevice"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->d:Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->d:Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;

    invoke-virtual {v1}, Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;->getState()I

    move-result v1

    const/4 v3, 0x2

    if-eq v1, v3, :cond_2

    .line 22
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->d:Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;

    invoke-virtual {v1, v3}, Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;->setState(I)Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;

    .line 23
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->d()J

    move-result-wide v3

    .line 24
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "left time = "

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-wide/16 v5, 0x7d0

    cmp-long v1, v3, v5

    if-gtz v1, :cond_0

    const v1, 0x9456

    const-wide/16 v3, 0x7918

    .line 25
    invoke-direct {p0, v1, v3, v4}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->a(IJ)V

    .line 26
    const-string v1, "Extend the time of reconnecting to the device."

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    const v1, 0x9457

    const-wide/16 v3, 0x7530

    .line 27
    invoke-direct {p0, v1, v3, v4}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->a(IJ)V

    .line 28
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->b:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-virtual {v1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->getBluetoothOption()Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;

    move-result-object v1

    .line 29
    invoke-virtual {v1}, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->isAutoConnectBle()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 30
    const-string v3, "Start automatic BLE reconnection."

    invoke-static {v0, v2, v3}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->c:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;

    invoke-virtual {v1}, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->getBleConnectParam()Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;->connectBLEDevice(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;)Z

    return-void

    .line 32
    :cond_1
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->b:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-interface {v0, p1}, Lcom/jieli/jl_bt_ota/interfaces/bt/IBluetoothManager;->connectBluetoothDevice(Landroid/bluetooth/BluetoothDevice;)V

    :cond_2
    return-void
.end method

.method private a(Lcom/jieli/jl_bt_ota/model/base/BaseError;)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    .line 33
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->b:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->isOTA()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 34
    sget-object v0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->i:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "error : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "cbReconnectError"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->b:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->onError(Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    .line 36
    :cond_1
    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->stopReconnectTask()V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->b()V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;IJ)V
    .locals 0

    .line 7
    invoke-direct {p0, p1, p2, p3}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->a(IJ)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->a(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;Lcom/jieli/jl_bt_ota/model/base/BaseError;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->a(Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;Ljava/lang/String;)V
    .locals 0

    .line 6
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->a(Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 7

    .line 37
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->d()J

    move-result-wide v0

    .line 38
    sget-object v2, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->i:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "address : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ", Left Time = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "dealWithConnectFailed"

    invoke-static {v2, v4, v3}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-wide/16 v5, 0x7d0

    cmp-long v0, v0, v5

    if-gtz v0, :cond_0

    .line 39
    const-string v0, "time not enough."

    invoke-static {v2, v4, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v0, 0x4012

    .line 40
    invoke-static {v0, p1}, Lcom/jieli/jl_bt_ota/model/OTAError;->buildError(ILjava/lang/String;)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->a(Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    return-void

    .line 41
    :cond_0
    const-string p1, "resume reconnect task."

    invoke-static {v2, v4, p1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const p1, 0x9455

    const-wide/16 v0, 0x0

    .line 42
    invoke-direct {p0, p1, v0, v1}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->a(IJ)V

    return-void
.end method

.method private a(I)Z
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->g:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result p1

    return p1
.end method

.method private a(Landroid/bluetooth/BluetoothDevice;[B)Z
    .locals 6

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 9
    :cond_0
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->e()Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;

    move-result-object v1

    if-nez v1, :cond_1

    return v0

    .line 10
    :cond_1
    invoke-virtual {v1}, Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;->getAddress()Ljava/lang/String;

    move-result-object v2

    .line 11
    invoke-static {v2}, Lcom/jieli/jl_bt_ota/util/CHexConver;->checkBluetoothAddress(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_2

    return v0

    .line 12
    :cond_2
    sget-object v3, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->i:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "device : "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->b(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v5, "checkIsReconnectDevice"

    invoke-static {v3, v5, v4}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    invoke-virtual {v1}, Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;->isUseADV()Z

    move-result v1

    if-nez v1, :cond_3

    .line 14
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 15
    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "advertiseRawData : "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Lcom/jieli/jl_bt_ota/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, v5, p1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    sget-object p1, Lcom/jieli/jl_bt_ota/constant/JL_Constant;->OTA_IDENTIFY:Ljava/lang/String;

    invoke-static {p2, p1}, Lcom/jieli/jl_bt_ota/util/ParseDataUtil;->parseOTAFlagFilterWithBroad([BLjava/lang/String;)Lcom/jieli/jl_bt_ota/model/BleScanMessage;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 17
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, ""

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v3, v5, p2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/BleScanMessage;->getOldBleAddress()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    return p1

    :cond_4
    return v0
.end method

.method public static synthetic a(Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;I)Z
    .locals 0

    .line 4
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->a(I)Z

    move-result p0

    return p0
.end method

.method public static synthetic a(Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;Landroid/bluetooth/BluetoothDevice;[B)Z
    .locals 0

    .line 8
    invoke-direct {p0, p1, p2}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->a(Landroid/bluetooth/BluetoothDevice;[B)Z

    move-result p0

    return p0
.end method

.method private b(Ljava/lang/String;)Landroid/bluetooth/BluetoothDevice;
    .locals 4

    .line 42
    invoke-static {p1}, Lcom/jieli/jl_bt_ota/util/CHexConver;->checkBluetoothAddress(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 43
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/util/BluetoothUtil;->getSystemConnectedBtDeviceList(Landroid/content/Context;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 44
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    .line 45
    :cond_1
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/bluetooth/BluetoothDevice;

    .line 46
    invoke-virtual {v2}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    return-object v2

    :cond_3
    :goto_0
    return-object v1
.end method

.method private b(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->a:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/jieli/jl_bt_ota/util/BluetoothUtil;->printBtDeviceInfo(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic b(Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->b(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private b()V
    .locals 15

    .line 4
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->e()Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;

    move-result-object v0

    const-string v1, "doReconnectTask"

    if-nez v0, :cond_0

    .line 5
    sget-object v0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->i:Ljava/lang/String;

    const-string v2, "reConnectDevMsg is null."

    invoke-static {v0, v1, v2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->stopReconnectTask()V

    return-void

    .line 7
    :cond_0
    invoke-static {}, Lcom/jieli/jl_bt_ota/util/BluetoothUtil;->isBluetoothEnable()Z

    move-result v2

    const v3, 0x9455

    if-nez v2, :cond_1

    .line 8
    sget-object v0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->i:Ljava/lang/String;

    const-string v2, "Bluetooth is close."

    invoke-static {v0, v1, v2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    invoke-direct {p0, v3}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->b(I)V

    return-void

    .line 10
    :cond_1
    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;->getState()I

    move-result v2

    const/4 v4, 0x2

    if-ne v2, v4, :cond_2

    .line 11
    sget-object v2, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->i:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Task is connecting. "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v1, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const v0, 0x9457

    .line 12
    invoke-direct {p0, v0}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->a(I)Z

    move-result v1

    if-nez v1, :cond_13

    const-wide/16 v1, 0x7530

    .line 13
    invoke-direct {p0, v0, v1, v2}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->a(IJ)V

    return-void

    .line 14
    :cond_2
    iget-object v2, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->b:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-virtual {v2}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->getTargetDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v2, :cond_3

    move v7, v6

    goto :goto_0

    :cond_3
    move v7, v5

    .line 15
    :goto_0
    sget-object v8, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->i:Ljava/lang/String;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v10, ", isConnected : "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v1, v9}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v7, :cond_4

    .line 16
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "device is connected. "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", device = "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v1, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 17
    :cond_4
    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;->getAddress()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->b(Ljava/lang/String;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    .line 18
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "connectedDevice : "

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0, v2}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->b(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v8, v1, v7}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v2, :cond_5

    .line 19
    invoke-direct {p0, v2}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->a(Landroid/bluetooth/BluetoothDevice;)V

    return-void

    .line 20
    :cond_5
    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;->isUseADV()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;->getWay()I

    move-result v2

    if-eqz v2, :cond_6

    .line 21
    invoke-virtual {v0, v5}, Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;->setWay(I)Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;

    .line 22
    :cond_6
    iget-object v2, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->c:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;

    invoke-virtual {v2}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;->isScanning()Z

    move-result v2

    if-eqz v2, :cond_d

    .line 23
    iget-object v2, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->c:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;

    invoke-virtual {v2}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;->getScanType()I

    move-result v2

    if-ne v2, v4, :cond_7

    move v7, v6

    goto :goto_1

    :cond_7
    move v7, v5

    :goto_1
    if-nez v7, :cond_b

    .line 24
    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;->getWay()I

    move-result v7

    if-ne v7, v6, :cond_8

    if-eq v2, v6, :cond_9

    .line 25
    :cond_8
    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;->getWay()I

    move-result v7

    if-nez v7, :cond_a

    if-nez v2, :cond_a

    :cond_9
    move v7, v6

    goto :goto_2

    :cond_a
    move v7, v5

    .line 26
    :cond_b
    :goto_2
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "isScanOk : "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v10, ", scanType = "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v8, v1, v2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v7, :cond_c

    goto/16 :goto_6

    .line 27
    :cond_c
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->g()V

    const-wide/16 v9, 0x64

    .line 28
    invoke-static {v9, v10}, Landroid/os/SystemClock;->sleep(J)V

    .line 29
    :cond_d
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->d()J

    move-result-wide v9

    .line 30
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "leftTime \uff1a "

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v7, ", beginTaskTime : "

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v11, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->e:J

    invoke-virtual {v2, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v8, v1, v2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    sget-wide v11, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->RECONNECT_TIMEOUT:J

    const-wide/32 v13, 0x9c40

    sub-long/2addr v11, v13

    cmp-long v2, v9, v11

    const-string v7, "startDeviceScan : "

    const-wide/16 v11, 0xbb8

    if-gez v2, :cond_11

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;->isUseADV()Z

    move-result v2

    if-eqz v2, :cond_e

    goto :goto_4

    .line 32
    :cond_e
    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;->getWay()I

    move-result v0

    if-ne v0, v6, :cond_f

    move v4, v5

    :cond_f
    sub-long v5, v9, v11

    const-wide/16 v13, 0x0

    cmp-long v0, v5, v13

    if-gtz v0, :cond_10

    goto :goto_3

    :cond_10
    move-wide v9, v5

    .line 33
    :goto_3
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->c:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;

    invoke-virtual {v0, v9, v10, v4}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;->startDeviceScan(JI)I

    move-result v0

    .line 34
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, ", way = "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ", timeout = "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v8, v1, v2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_5

    :cond_11
    :goto_4
    const-wide/16 v4, 0x4e20

    .line 35
    invoke-static {v9, v10, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    .line 36
    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;->getWay()I

    move-result v0

    const-string v2, ", scanTime = "

    if-ne v0, v6, :cond_12

    .line 37
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->c:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;

    invoke-virtual {v0, v4, v5, v6}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;->startDeviceScan(JI)I

    move-result v0

    .line 38
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v8, v1, v2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_5

    .line 39
    :cond_12
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->c:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;

    invoke-virtual {v0, v4, v5}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;->startBLEScan(J)I

    move-result v0

    .line 40
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "startBLEScan : "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v8, v1, v2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_5
    if-eqz v0, :cond_13

    .line 41
    invoke-direct {p0, v3, v11, v12}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->a(IJ)V

    :cond_13
    :goto_6
    return-void
.end method

.method private b(I)V
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->g:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->removeMessages(I)V

    return-void
.end method

.method public static synthetic b(Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->g()V

    return-void
.end method

.method public static synthetic b(Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;I)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->b(I)V

    return-void
.end method

.method private c()J
    .locals 2

    .line 2
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public static synthetic c(Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;)Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->d:Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;

    return-object p0
.end method

.method private d()J
    .locals 6

    .line 2
    sget-wide v0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->RECONNECT_TIMEOUT:J

    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->c()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->e:J

    sub-long/2addr v2, v4

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-gez v4, :cond_0

    return-wide v2

    :cond_0
    return-wide v0
.end method

.method public static synthetic d(Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->f()Z

    move-result p0

    return p0
.end method

.method private e()Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->d:Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->d:Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;->cloneObject()Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e(Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;)Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->f:Ljava/util/Map;

    return-object p0
.end method

.method private f()Z
    .locals 2

    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->e()Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->e()Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;->getState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private g()V
    .locals 3

    sget-object v0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->i:Ljava/lang/String;

    const-string v1, "stopScan"

    const-string v2, "---->"

    invoke-static {v0, v1, v2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->c:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;->stopBLEScan()I

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->c:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;->stopDeviceScan()I

    return-void
.end method


# virtual methods
.method public getReconnectAddress()Ljava/lang/String;
    .locals 1

    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->e()Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;->getAddress()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public isDeviceReconnecting()Z
    .locals 1

    const v0, 0x9456

    invoke-direct {p0, v0}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->a(I)Z

    move-result v0

    return v0
.end method

.method public isWaitingForUpdate()Z
    .locals 1

    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->e()Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public release()V
    .locals 2

    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->stopReconnectTask()V

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->b:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->h:Lcom/jieli/jl_bt_ota/interfaces/BtEventCallback;

    invoke-virtual {v0, v1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->unregisterBluetoothCallback(Lcom/jieli/jl_bt_ota/interfaces/BtEventCallback;)V

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->g:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    return-void
.end method

.method public setReConnectDevMsg(Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;)V
    .locals 3

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->d:Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;

    if-eq v0, p1, :cond_0

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->d:Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->f:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    sget-object v0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->i:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "setReConnectDevMsg"

    invoke-static {v0, v1, p1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public setReconnectAddress(Ljava/lang/String;)V
    .locals 2

    invoke-static {p1}, Lcom/jieli/jl_bt_ota/util/CHexConver;->checkBluetoothAddress(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->d:Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;

    if-nez v0, :cond_1

    new-instance v0, Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->c:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;

    invoke-virtual {v1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;->getBluetoothOption()Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;

    move-result-object v1

    invoke-virtual {v1}, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->getPriority()I

    move-result v1

    invoke-direct {v0, v1, p1}, Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;-><init>(ILjava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->setReConnectDevMsg(Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->d:Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;->setAddress(Ljava/lang/String;)Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;

    :goto_0
    sget-object p1, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->i:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->d:Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "setReconnectAddress"

    invoke-static {p1, v1, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setReconnectUseADV(Z)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->d:Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->d:Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;->setUseADV(Z)Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;

    :cond_0
    return-void
.end method

.method public startReconnectTask()V
    .locals 4

    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->isDeviceReconnecting()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->i:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "start...., timeout : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-wide v2, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->RECONNECT_TIMEOUT:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "startReconnectTask"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->c()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->a(J)V

    sget-wide v0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->RECONNECT_TIMEOUT:J

    const v2, 0x9456

    invoke-direct {p0, v2, v0, v1}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->a(IJ)V

    const v0, 0x9455

    const-wide/16 v1, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->a(IJ)V

    :cond_0
    return-void
.end method

.method public stopReconnectTask()V
    .locals 5

    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->isDeviceReconnecting()Z

    move-result v0

    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->isWaitingForUpdate()Z

    move-result v1

    sget-object v2, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->i:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "isReconnecting : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", isWaitingForUpdate : "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "stopReconnectTask"

    invoke-static {v2, v1, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    invoke-direct {p0, v0, v1}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->a(J)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->setReConnectDevMsg(Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;)V

    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->g()V

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->g:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    return-void
.end method
