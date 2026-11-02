.class public abstract Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_bt_ota/interfaces/bt/IBluetoothManager;
.implements Lcom/jieli/jl_bt_ota/interfaces/IUpgradeManager;


# static fields
.field public static FILE_CACHE_DATA_LIMIT:J = 0x200000L

.field public static IS_SUPPORT_NEW_RECONNECT_WAY:Z = true

.field private static final a:J = 0x1770L

.field private static final b:J = 0x3e8L

.field private static final c:J = 0x1388L

.field private static final d:I = 0x1234

.field private static final e:I = 0x1235

.field private static final f:I = 0x1236

.field private static final g:I = 0x1237

.field private static final h:I = 0x1238

.field private static final i:I = 0x1239

.field private static final j:I = 0x1240

.field private static final k:I = 0x1241

.field private static final l:I = 0x1242

.field private static final m:I = 0x1

.field private static final n:I = 0x2


# instance fields
.field private A:J

.field private B:I

.field private C:I

.field private final D:Lcom/jieli/jl_bt_ota/tool/configure/OtaConfigureHelper;

.field private E:Lcom/jieli/jl_bt_ota/model/ReconnectParam;

.field private final F:Landroid/os/Handler;

.field private final G:Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtBleListener;

.field private final H:Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtAssistantCallback;

.field private final I:Lcom/jieli/jl_bt_ota/interfaces/rcsp/OnRcspCallback;

.field protected final TAG:Ljava/lang/String;

.field protected final context:Landroid/content/Context;

.field private final o:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;

.field private final p:Lcom/jieli/jl_bt_ota/tool/RcspOTA;

.field private final q:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;

.field private final r:Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;

.field private final s:Lcom/jieli/jl_bt_ota/tool/callback/BtEventCallbackHelper;

.field private final t:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final u:Lcom/jieli/jl_bt_ota/thread/OtaDataCache;

.field private v:Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtListener;

.field private w:Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;

.field private volatile x:Z

.field private y:J

.field private z:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->t:Ljava/util/Map;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->x:Z

    const-wide/16 v2, 0x4e20

    iput-wide v2, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->y:J

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->z:J

    iput-wide v2, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->A:J

    iput v1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->B:I

    iput v1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->C:I

    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    new-instance v3, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$1;

    invoke-direct {v3, p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$1;-><init>(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;)V

    invoke-direct {v1, v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->F:Landroid/os/Handler;

    new-instance v1, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$15;

    invoke-direct {v1, p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$15;-><init>(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;)V

    iput-object v1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->G:Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtBleListener;

    new-instance v2, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$16;

    invoke-direct {v2, p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$16;-><init>(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;)V

    iput-object v2, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->H:Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtAssistantCallback;

    new-instance v3, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$17;

    invoke-direct {v3, p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$17;-><init>(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;)V

    iput-object v3, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->I:Lcom/jieli/jl_bt_ota/interfaces/rcsp/OnRcspCallback;

    const-string v4, "Context can not be null."

    invoke-static {p1, v4}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/Context;

    iput-object v4, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->context:Landroid/content/Context;

    new-instance v4, Lcom/jieli/jl_bt_ota/tool/configure/OtaConfigureHelper;

    invoke-direct {v4, p1}, Lcom/jieli/jl_bt_ota/tool/configure/OtaConfigureHelper;-><init>(Landroid/content/Context;)V

    iput-object v4, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->D:Lcom/jieli/jl_bt_ota/tool/configure/OtaConfigureHelper;

    invoke-static {}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;->isInit()Z

    move-result v4

    if-nez v4, :cond_0

    invoke-static {p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;->init(Landroid/content/Context;)V

    :cond_0
    invoke-static {}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;->getInstance()Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;

    move-result-object v4

    iput-object v4, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->q:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;

    new-instance v5, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;

    new-instance v6, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$2;

    invoke-direct {v6, p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$2;-><init>(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;)V

    invoke-direct {v5, p1, v6}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;-><init>(Landroid/content/Context;Lcom/jieli/jl_bt_ota/interfaces/bt/IBtProxy;)V

    iput-object v5, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->o:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;

    invoke-static {}, Lcom/jieli/jl_bt_ota/constant/JL_Constant;->getLibVersionName()Ljava/lang/String;

    move-result-object v6

    invoke-static {}, Lcom/jieli/jl_bt_ota/constant/JL_Constant;->getLibVersionCode()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    filled-new-array {v6, v7}, [Ljava/lang/Object;

    move-result-object v6

    const-string v7, "Lib version name = %s(%d)"

    invoke-static {v7, v6}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "init"

    invoke-static {v0, v7, v6}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/jieli/jl_bt_ota/tool/RcspOTA;

    invoke-direct {v0, v5}, Lcom/jieli/jl_bt_ota/tool/RcspOTA;-><init>(Lcom/jieli/jl_bt_ota/interfaces/rcsp/IRcspOp;)V

    iput-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->p:Lcom/jieli/jl_bt_ota/tool/RcspOTA;

    new-instance v0, Lcom/jieli/jl_bt_ota/tool/callback/BtEventCallbackHelper;

    invoke-direct {v0}, Lcom/jieli/jl_bt_ota/tool/callback/BtEventCallbackHelper;-><init>()V

    iput-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->s:Lcom/jieli/jl_bt_ota/tool/callback/BtEventCallbackHelper;

    new-instance v0, Lcom/jieli/jl_bt_ota/thread/OtaDataCache;

    invoke-direct {v0}, Lcom/jieli/jl_bt_ota/thread/OtaDataCache;-><init>()V

    iput-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->u:Lcom/jieli/jl_bt_ota/thread/OtaDataCache;

    new-instance v0, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;

    invoke-direct {v0, p1, p0}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;-><init>(Landroid/content/Context;Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;)V

    iput-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->r:Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;

    invoke-virtual {v4, v2}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;->addOnBtAssistantCallback(Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtAssistantCallback;)V

    invoke-virtual {v4, v1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;->addOnBtBleListener(Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtBleListener;)V

    invoke-virtual {v5, v3}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->registerOnRcspCallback(Lcom/jieli/jl_bt_ota/interfaces/rcsp/OnRcspCallback;)V

    return-void
.end method

.method public static synthetic OXO1(Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;Lcom/jieli/jl_bt_ota/model/base/BaseError;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    return-void
.end method

.method public static synthetic XIi00iiXO(Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;Ljava/lang/String;Z)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;Ljava/lang/String;Z)V

    return-void
.end method

.method public static synthetic XO0O10(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;Z[B)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;Z[B)V

    return-void
.end method

.method private a(I)I
    .locals 2

    .line 1
    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v1, 0x2

    if-eq p1, v1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    return v0

    :cond_1
    const/4 p1, 0x3

    return p1
.end method

.method public static synthetic a(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;I)I
    .locals 0

    .line 13
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(I)I

    move-result p0

    return p0
.end method

.method public static synthetic a(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtListener;)Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtListener;
    .locals 0

    .line 5
    iput-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->v:Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtListener;

    return-object p1
.end method

.method private a(Landroid/bluetooth/BluetoothDevice;I)Ljava/lang/String;
    .locals 2

    .line 19
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v0

    .line 20
    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->getDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 21
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->isSupportDoubleBackup()Z

    move-result v1

    if-nez v1, :cond_2

    .line 22
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->isMandatoryUpgrade()Z

    move-result v1

    if-nez v1, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->getEdrAddr()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    .line 24
    :cond_1
    :goto_0
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->getBleAddr()Ljava/lang/String;

    move-result-object p1

    .line 25
    :goto_1
    invoke-static {p1}, Lcom/jieli/jl_bt_ota/util/CHexConver;->checkBluetoothAddress(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    return-object p1

    :cond_2
    return-object v0
.end method

.method private a(Landroid/bluetooth/BluetoothDevice;Z)Ljava/lang/String;
    .locals 6

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 48
    :cond_0
    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->getDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    .line 49
    iget-object v2, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->D:Lcom/jieli/jl_bt_ota/tool/configure/OtaConfigureHelper;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->getUid()I

    move-result v3

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->getPid()I

    move-result v4

    const/4 v5, 0x0

    invoke-virtual {v2, v3, v4, v5, v5}, Lcom/jieli/jl_bt_ota/tool/configure/OtaConfigureHelper;->getAddress(IIII)Ljava/lang/String;

    move-result-object v2

    .line 50
    invoke-static {v2}, Lcom/jieli/jl_bt_ota/util/CHexConver;->checkBluetoothAddress(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    return-object v2

    .line 51
    :cond_1
    iget-object v2, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->D:Lcom/jieli/jl_bt_ota/tool/configure/OtaConfigureHelper;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->getUid()I

    move-result v3

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->getPid()I

    move-result v0

    invoke-virtual {v2, v3, v0, v5, v1}, Lcom/jieli/jl_bt_ota/tool/configure/OtaConfigureHelper;->getAddress(IIII)Ljava/lang/String;

    move-result-object v0

    .line 52
    invoke-static {v0}, Lcom/jieli/jl_bt_ota/util/CHexConver;->checkBluetoothAddress(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    return-object v0

    .line 53
    :cond_2
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p1

    if-eqz p2, :cond_4

    .line 54
    invoke-static {p1}, Lcom/jieli/jl_bt_ota/util/BluetoothUtil;->addressCovertToByteArray(Ljava/lang/String;)[B

    move-result-object p2

    if-eqz p2, :cond_4

    .line 55
    array-length p1, p2

    sub-int/2addr p1, v1

    aget-byte p1, p2, p1

    invoke-static {p1}, Lcom/jieli/jl_bt_ota/util/CHexConver;->byteToInt(B)I

    move-result p1

    sub-int/2addr p1, v1

    if-gez p1, :cond_3

    const/16 p1, 0xff

    .line 56
    :cond_3
    array-length v0, p2

    sub-int/2addr v0, v1

    invoke-static {p1}, Lcom/jieli/jl_bt_ota/util/CHexConver;->intToByte(I)B

    move-result p1

    aput-byte p1, p2, v0

    .line 57
    invoke-static {p2}, Lcom/jieli/jl_bt_ota/util/BluetoothUtil;->hexDataCovetToAddress([B)Ljava/lang/String;

    move-result-object p1

    :cond_4
    return-object p1
.end method

.method public static synthetic a(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Landroid/bluetooth/BluetoothDevice;Z)Ljava/lang/String;
    .locals 0

    .line 11
    invoke-direct {p0, p1, p2}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Landroid/bluetooth/BluetoothDevice;Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private a()V
    .locals 4

    .line 74
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->w:Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;

    .line 75
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "callback : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "callbackCancelOTA"

    invoke-static {v1, v3, v2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->h()V

    if-eqz v0, :cond_0

    .line 77
    new-instance v1, Lcom/android/mltcode/paycertificationapi/OIX0OI0i;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/OIX0OI0i;-><init>(Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;)V

    invoke-virtual {p0, v1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->runOnMainThread(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method private a(IF)V
    .locals 4

    .line 68
    const-string v0, "callbackProgress"

    invoke-direct {p0, v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 69
    :cond_0
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "type = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", progress = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v0, v2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 70
    invoke-direct {p0, v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->c(Z)V

    .line 71
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->w:Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;

    if-eqz v0, :cond_1

    .line 72
    new-instance v1, Lcom/android/mltcode/paycertificationapi/iXXiiiiI;

    invoke-direct {v1, v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/iXXiiiiI;-><init>(Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;IF)V

    invoke-virtual {p0, v1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->runOnMainThread(Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private a(Landroid/bluetooth/BluetoothDevice;)V
    .locals 2

    .line 90
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->o:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->getDeviceStatusCache()Lcom/jieli/jl_bt_ota/tool/DeviceStatusCache;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/jieli/jl_bt_ota/tool/DeviceStatusCache;->getMaxReceiveMtu(Landroid/bluetooth/BluetoothDevice;)I

    move-result v0

    const/16 v1, 0x212

    if-ge v0, v1, :cond_0

    .line 91
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->o:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->getDeviceStatusCache()Lcom/jieli/jl_bt_ota/tool/DeviceStatusCache;

    move-result-object v0

    invoke-virtual {v0, p1, v1}, Lcom/jieli/jl_bt_ota/tool/DeviceStatusCache;->updateDeviceMaxReceiveMtu(Landroid/bluetooth/BluetoothDevice;I)V

    :cond_0
    return-void
.end method

.method private a(Landroid/bluetooth/BluetoothDevice;F)V
    .locals 3

    .line 63
    const-string v0, "callbackProgress"

    invoke-direct {p0, v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 64
    :cond_0
    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->getDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;

    move-result-object p1

    if-nez p1, :cond_1

    :goto_0
    return-void

    .line 65
    :cond_1
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->isNeedBootLoader()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    .line 66
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->isSupportReuseSpaceOTA()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->getExpandMode()I

    move-result p1

    const/4 v2, 0x3

    if-ne p1, v2, :cond_2

    goto :goto_1

    :cond_2
    move v1, v0

    .line 67
    :goto_1
    invoke-direct {p0, v1, p2}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(IF)V

    return-void
.end method

.method private a(Landroid/bluetooth/BluetoothDevice;II)V
    .locals 3

    if-eqz p1, :cond_4

    if-eqz p3, :cond_0

    goto :goto_1

    :cond_0
    const/4 p3, 0x1

    if-ne p2, p3, :cond_1

    .line 85
    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->q:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;

    invoke-virtual {p2, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;->isConnectedByA2dp(Landroid/bluetooth/BluetoothDevice;)I

    move-result p2

    if-nez p2, :cond_2

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    if-ne p2, v0, :cond_3

    .line 86
    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->q:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;

    invoke-virtual {p2, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;->isConnectedByHfp(Landroid/bluetooth/BluetoothDevice;)I

    move-result p2

    if-nez p2, :cond_2

    goto :goto_0

    :cond_2
    const/4 p3, 0x0

    .line 87
    :cond_3
    :goto_0
    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->F:Landroid/os/Handler;

    const/16 v0, 0x1238

    invoke-virtual {p2, v0}, Landroid/os/Handler;->hasMessages(I)Z

    move-result p2

    .line 88
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "isBrEdrDisconnect : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", isWaitingEdrDisconnectTask : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "handleBrEdrProfileStatus"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p3, :cond_4

    if-eqz p2, :cond_4

    .line 89
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->d(Landroid/bluetooth/BluetoothDevice;)V

    :cond_4
    :goto_1
    return-void
.end method

.method private a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/ReconnectParam;)V
    .locals 5

    .line 26
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    .line 27
    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1, p2}, [Ljava/lang/Object;

    move-result-object v1

    .line 28
    const-string v2, "device : %s, ReconnectParam = %s"

    invoke-static {v2, v1}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "startReConnectTask"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_5

    if-nez p2, :cond_0

    goto/16 :goto_1

    .line 29
    :cond_0
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->f(Landroid/bluetooth/BluetoothDevice;)Z

    move-result p2

    .line 30
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isConnectedDevice = "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-nez p2, :cond_1

    .line 31
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->d()V

    return-void

    .line 32
    :cond_1
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->e(Landroid/bluetooth/BluetoothDevice;)Z

    move-result p2

    .line 33
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isBLEConnected = "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p2, :cond_2

    .line 34
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    const-string p2, "Waiting for ble disconnect... "

    invoke-static {p1, v2, p2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->d()V

    return-void

    .line 36
    :cond_2
    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->q:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;

    invoke-virtual {p2, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;->isConnectedByProfile(Landroid/bluetooth/BluetoothDevice;)I

    move-result p2

    const/4 v0, 0x2

    if-ne p2, v0, :cond_3

    const/4 p2, 0x1

    goto :goto_0

    :cond_3
    const/4 p2, 0x0

    .line 37
    :goto_0
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isEDRConnected : "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-nez p2, :cond_4

    .line 38
    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    const-string v0, "handleBrEdrDisconnect >>> "

    invoke-static {p2, v2, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->d(Landroid/bluetooth/BluetoothDevice;)V

    return-void

    .line 40
    :cond_4
    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->F:Landroid/os/Handler;

    const/16 v0, 0x1238

    invoke-virtual {p2, v0}, Landroid/os/Handler;->removeMessages(I)V

    .line 41
    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->F:Landroid/os/Handler;

    invoke-virtual {p2, v0, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    const-wide/16 v3, 0x1770

    invoke-virtual {p2, v0, v3, v4}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 42
    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->q:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;

    invoke-virtual {p2, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;->disconnectByProfiles(Landroid/bluetooth/BluetoothDevice;)Z

    move-result p2

    .line 43
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "disconnectEdrRet : "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-nez p2, :cond_5

    .line 44
    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    const-string v0, "Failed to disconnect Classic device."

    invoke-static {p2, v2, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->context:Landroid/content/Context;

    invoke-static {p2, p1}, Lcom/jieli/jl_bt_ota/util/BluetoothUtil;->removeBond(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;)Z

    move-result p2

    .line 46
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "removeBond >>> "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-nez p2, :cond_5

    .line 47
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->d(Landroid/bluetooth/BluetoothDevice;)V

    :cond_5
    :goto_1
    return-void
.end method

.method private a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/CommandBase;)V
    .locals 8

    if-eqz p1, :cond_11

    if-nez p2, :cond_0

    goto/16 :goto_6

    .line 112
    :cond_0
    invoke-virtual {p2}, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->getType()I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_2

    .line 113
    invoke-virtual {p2}, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->getType()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    move v0, v2

    goto :goto_1

    :cond_2
    :goto_0
    move v0, v3

    .line 114
    :goto_1
    invoke-virtual {p2}, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->getId()I

    move-result v1

    const/16 v4, 0xc2

    const/4 v5, 0x0

    if-eq v1, v4, :cond_10

    const/16 v4, 0xd1

    if-eq v1, v4, :cond_d

    const/16 v0, 0xe8

    const/16 v4, 0x3005

    if-eq v1, v0, :cond_9

    const/16 v0, 0xe4

    if-eq v1, v0, :cond_7

    const/16 v0, 0xe5

    if-eq v1, v0, :cond_3

    goto/16 :goto_6

    .line 115
    :cond_3
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->k()V

    .line 116
    check-cast p2, Lcom/jieli/jl_bt_ota/model/command/FirmwareUpdateBlockCmd;

    .line 117
    const-string v0, "Receive E5 command"

    invoke-direct {p0, v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 118
    invoke-virtual {p2, v5}, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->setParam(Lcom/jieli/jl_bt_ota/model/base/BaseParameter;)Lcom/jieli/jl_bt_ota/model/base/CommandBase;

    .line 119
    invoke-virtual {p2, v3}, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_bt_ota/model/base/CommandBase;

    .line 120
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->p:Lcom/jieli/jl_bt_ota/tool/RcspOTA;

    invoke-virtual {p1, p2}, Lcom/jieli/jl_bt_ota/tool/RcspOTA;->sendCommandResponse(Lcom/jieli/jl_bt_ota/model/base/CommandBase;)V

    return-void

    .line 121
    :cond_4
    invoke-virtual {p2}, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->getParam()Lcom/jieli/jl_bt_ota/model/base/BaseParameter;

    move-result-object v1

    check-cast v1, Lcom/jieli/jl_bt_ota/model/parameter/FirmwareUpdateBlockParam;

    if-nez v1, :cond_5

    .line 122
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    const-string v1, "Receive E5 Command"

    const-string v2, "0xE5 : command is error."

    invoke-static {p1, v1, v2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    invoke-virtual {p2, v3}, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_bt_ota/model/base/CommandBase;

    .line 124
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->p:Lcom/jieli/jl_bt_ota/tool/RcspOTA;

    invoke-virtual {p1, p2}, Lcom/jieli/jl_bt_ota/tool/RcspOTA;->sendCommandResponse(Lcom/jieli/jl_bt_ota/model/base/CommandBase;)V

    .line 125
    const-string p1, "E5 command"

    invoke-static {v4, p1}, Lcom/jieli/jl_bt_ota/model/OTAError;->buildError(ILjava/lang/String;)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Ljava/lang/String;Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    return-void

    .line 126
    :cond_5
    invoke-virtual {v1}, Lcom/jieli/jl_bt_ota/model/parameter/FirmwareUpdateBlockParam;->getNextUpdateBlockOffsetAddr()I

    move-result v0

    .line 127
    invoke-virtual {v1}, Lcom/jieli/jl_bt_ota/model/parameter/FirmwareUpdateBlockParam;->getNextUpdateBlockLen()I

    move-result v1

    .line 128
    iget v2, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->B:I

    if-lez v2, :cond_6

    .line 129
    iget v2, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->C:I

    add-int/2addr v2, v1

    iput v2, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->C:I

    .line 130
    invoke-direct {p0, v2}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->b(I)F

    move-result v2

    invoke-direct {p0, p1, v2}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Landroid/bluetooth/BluetoothDevice;F)V

    .line 131
    :cond_6
    invoke-direct {p0, p2, v0, v1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Lcom/jieli/jl_bt_ota/model/command/FirmwareUpdateBlockCmd;II)V

    return-void

    .line 132
    :cond_7
    check-cast p2, Lcom/jieli/jl_bt_ota/model/command/ExitUpdateModeCmd;

    .line 133
    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->isOTA()Z

    move-result p1

    if-eqz p1, :cond_8

    .line 134
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a()V

    .line 135
    :cond_8
    invoke-virtual {p2, v5}, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->setParam(Lcom/jieli/jl_bt_ota/model/base/BaseParameter;)Lcom/jieli/jl_bt_ota/model/base/CommandBase;

    .line 136
    invoke-virtual {p2, v2}, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_bt_ota/model/base/CommandBase;

    .line 137
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->p:Lcom/jieli/jl_bt_ota/tool/RcspOTA;

    invoke-virtual {p1, p2}, Lcom/jieli/jl_bt_ota/tool/RcspOTA;->sendCommandResponse(Lcom/jieli/jl_bt_ota/model/base/CommandBase;)V

    return-void

    .line 138
    :cond_9
    check-cast p2, Lcom/jieli/jl_bt_ota/model/command/NotifyUpdateContentSizeCmd;

    .line 139
    const-string v0, "Receive E8 command "

    invoke-direct {p0, v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    move v2, v3

    :goto_2
    move-object p1, v5

    goto/16 :goto_4

    .line 140
    :cond_a
    invoke-virtual {p2}, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->getParam()Lcom/jieli/jl_bt_ota/model/base/BaseParameter;

    move-result-object v0

    check-cast v0, Lcom/jieli/jl_bt_ota/model/parameter/NotifyUpdateContentSizeParam;

    const-string v1, "Receive E8 Command"

    if-nez v0, :cond_b

    .line 141
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    const-string v0, "0xE8 : command is error."

    invoke-static {p1, v1, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    const-string p1, "E8 command"

    invoke-static {v4, p1}, Lcom/jieli/jl_bt_ota/model/OTAError;->buildError(ILjava/lang/String;)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object p1

    :goto_3
    move v2, v3

    goto :goto_4

    .line 143
    :cond_b
    iget-object v4, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "0xE8 : "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v1, v6}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/parameter/NotifyUpdateContentSizeParam;->getContentSize()I

    move-result v4

    if-gez v4, :cond_c

    .line 145
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "0xE8 : length = "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Update content size : "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/16 v0, 0x1001

    invoke-static {v0, p1}, Lcom/jieli/jl_bt_ota/model/OTAError;->buildError(ILjava/lang/String;)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object p1

    goto :goto_3

    .line 147
    :cond_c
    invoke-static {}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->getCurrentTime()J

    move-result-wide v6

    iput-wide v6, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->z:J

    .line 148
    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/parameter/NotifyUpdateContentSizeParam;->getCurrentProgress()I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->C:I

    .line 149
    iput v4, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->B:I

    .line 150
    invoke-direct {p0, v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->b(I)F

    move-result v0

    invoke-direct {p0, p1, v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Landroid/bluetooth/BluetoothDevice;F)V

    goto :goto_2

    .line 151
    :goto_4
    invoke-virtual {p2, v2}, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_bt_ota/model/base/CommandBase;

    .line 152
    invoke-virtual {p2, v5}, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->setParam(Lcom/jieli/jl_bt_ota/model/base/BaseParameter;)Lcom/jieli/jl_bt_ota/model/base/CommandBase;

    .line 153
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->p:Lcom/jieli/jl_bt_ota/tool/RcspOTA;

    invoke-virtual {v0, p2}, Lcom/jieli/jl_bt_ota/tool/RcspOTA;->sendCommandResponse(Lcom/jieli/jl_bt_ota/model/base/CommandBase;)V

    if-eqz p1, :cond_11

    .line 154
    const-string p2, "Receive E8 command"

    invoke-direct {p0, p2, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Ljava/lang/String;Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    return-void

    .line 155
    :cond_d
    check-cast p2, Lcom/jieli/jl_bt_ota/model/command/SettingsMtuCmd;

    .line 156
    invoke-virtual {p2}, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->getParam()Lcom/jieli/jl_bt_ota/model/base/BaseParameter;

    move-result-object v1

    check-cast v1, Lcom/jieli/jl_bt_ota/model/parameter/SettingsMtuParam;

    if-nez v1, :cond_e

    .line 157
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    const-string v1, "Receive D1 command"

    const-string v2, "0xD1 : command is error."

    invoke-static {p1, v1, v2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v0, :cond_11

    .line 158
    invoke-virtual {p2, v3}, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_bt_ota/model/base/CommandBase;

    .line 159
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->p:Lcom/jieli/jl_bt_ota/tool/RcspOTA;

    invoke-virtual {p1, p2}, Lcom/jieli/jl_bt_ota/tool/RcspOTA;->sendCommandResponse(Lcom/jieli/jl_bt_ota/model/base/CommandBase;)V

    return-void

    .line 160
    :cond_e
    invoke-virtual {v1}, Lcom/jieli/jl_bt_ota/model/parameter/SettingsMtuParam;->getMtu()I

    move-result v3

    .line 161
    iget-object v4, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->o:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;

    invoke-virtual {v4}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->getDeviceStatusCache()Lcom/jieli/jl_bt_ota/tool/DeviceStatusCache;

    move-result-object v4

    invoke-virtual {v4, p1}, Lcom/jieli/jl_bt_ota/tool/DeviceStatusCache;->getMaxReceiveMtu(Landroid/bluetooth/BluetoothDevice;)I

    move-result v4

    const/16 v5, 0x212

    if-lt v3, v5, :cond_f

    .line 162
    iget-object v4, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->o:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;

    invoke-virtual {v4}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->getDeviceStatusCache()Lcom/jieli/jl_bt_ota/tool/DeviceStatusCache;

    move-result-object v4

    invoke-virtual {v4, p1, v3}, Lcom/jieli/jl_bt_ota/tool/DeviceStatusCache;->updateDeviceMaxReceiveMtu(Landroid/bluetooth/BluetoothDevice;I)V

    goto :goto_5

    :cond_f
    move v3, v4

    :goto_5
    if-eqz v0, :cond_11

    .line 163
    invoke-virtual {v1, v3}, Lcom/jieli/jl_bt_ota/model/parameter/SettingsMtuParam;->setMtu(I)V

    .line 164
    invoke-virtual {p2, v2}, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_bt_ota/model/base/CommandBase;

    .line 165
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->p:Lcom/jieli/jl_bt_ota/tool/RcspOTA;

    invoke-virtual {p1, p2}, Lcom/jieli/jl_bt_ota/tool/RcspOTA;->sendCommandResponse(Lcom/jieli/jl_bt_ota/model/base/CommandBase;)V

    return-void

    .line 166
    :cond_10
    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->isOTA()Z

    move-result p1

    .line 167
    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->F:Landroid/os/Handler;

    const/16 v0, 0x1237

    invoke-virtual {p2, v0}, Landroid/os/Handler;->hasMessages(I)Z

    move-result p2

    .line 168
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "0xC2 : isOTA = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, ", hasStopAdvNotify = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Receive C2 Command"

    invoke-static {v1, v3, v2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_11

    if-nez p2, :cond_11

    .line 169
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->F:Landroid/os/Handler;

    const-wide/16 v1, 0x1388

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 170
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->p:Lcom/jieli/jl_bt_ota/tool/RcspOTA;

    invoke-virtual {p1, v5}, Lcom/jieli/jl_bt_ota/tool/RcspOTA;->stopADVInfo(Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V

    :cond_11
    :goto_6
    return-void
.end method

.method private synthetic a(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;Z[B)V
    .locals 1

    .line 171
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    .line 172
    invoke-static {p2}, Lcom/jieli/jl_bt_ota/util/UuidUtil;->read16BitUUID(Ljava/util/UUID;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p3}, Lcom/jieli/jl_bt_ota/util/UuidUtil;->read16BitUUID(Ljava/util/UUID;)Ljava/lang/String;

    move-result-object p3

    .line 173
    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p4

    invoke-static {p5}, Lcom/jieli/jl_bt_ota/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object p5

    filled-new-array {p1, p2, p3, p4, p5}, [Ljava/lang/Object;

    move-result-object p1

    .line 174
    const-string p2, "(%s) | UUID(%s : %s) | (%s) ---> \n %s"

    invoke-static {p2, p1}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "writeBleData"

    invoke-static {v0, p2, p1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private a(Landroid/bluetooth/BluetoothDevice;[B)V
    .locals 2

    .line 92
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->p:Lcom/jieli/jl_bt_ota/tool/RcspOTA;

    new-instance v1, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$8;

    invoke-direct {v1, p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$8;-><init>(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Landroid/bluetooth/BluetoothDevice;)V

    invoke-virtual {v0, p2, v1}, Lcom/jieli/jl_bt_ota/tool/RcspOTA;->inquiryDeviceCanOTA([BLcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;)V
    .locals 0

    .line 4
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->c()V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->g(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Landroid/bluetooth/BluetoothDevice;F)V
    .locals 0

    .line 7
    invoke-direct {p0, p1, p2}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Landroid/bluetooth/BluetoothDevice;F)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Landroid/bluetooth/BluetoothDevice;I)V
    .locals 0

    .line 10
    invoke-direct {p0, p1, p2}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->c(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Landroid/bluetooth/BluetoothDevice;II)V
    .locals 0

    .line 8
    invoke-direct {p0, p1, p2, p3}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->c(Landroid/bluetooth/BluetoothDevice;II)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/ReconnectParam;)V
    .locals 0

    .line 17
    invoke-direct {p0, p1, p2}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/ReconnectParam;)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/CommandBase;)V
    .locals 0

    .line 14
    invoke-direct {p0, p1, p2}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->b(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/CommandBase;)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Lcom/jieli/jl_bt_ota/model/ReconnectParam;)V
    .locals 0

    .line 16
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Lcom/jieli/jl_bt_ota/model/ReconnectParam;)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Ljava/lang/String;Lcom/jieli/jl_bt_ota/model/base/BaseError;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Ljava/lang/String;Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Ljava/lang/String;Lcom/jieli/jl_bt_ota/model/base/BaseError;Z)V
    .locals 0

    .line 12
    invoke-direct {p0, p1, p2, p3}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Ljava/lang/String;Lcom/jieli/jl_bt_ota/model/base/BaseError;Z)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Ljava/lang/String;Z)V
    .locals 0

    .line 15
    invoke-direct {p0, p1, p2}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Ljava/lang/String;Z)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Z)V
    .locals 0

    .line 9
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->b(Z)V

    return-void
.end method

.method private static synthetic a(Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;IF)V
    .locals 0

    .line 73
    invoke-interface {p0, p1, p2}, Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;->onProgress(IF)V

    return-void
.end method

.method private static synthetic a(Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;Lcom/jieli/jl_bt_ota/model/base/BaseError;)V
    .locals 0

    .line 84
    invoke-interface {p0, p1}, Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;->onError(Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    return-void
.end method

.method private static synthetic a(Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;Ljava/lang/String;Z)V
    .locals 0

    .line 62
    invoke-interface {p0, p1, p2}, Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;->onNeedReconnect(Ljava/lang/String;Z)V

    return-void
.end method

.method private a(Lcom/jieli/jl_bt_ota/model/ReconnectParam;)V
    .locals 0

    .line 18
    iput-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->E:Lcom/jieli/jl_bt_ota/model/ReconnectParam;

    return-void
.end method

.method private a(Lcom/jieli/jl_bt_ota/model/command/FirmwareUpdateBlockCmd;II)V
    .locals 2

    .line 93
    const-string v0, "upgradeStep04"

    invoke-direct {p0, v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 94
    :cond_0
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->k()V

    if-nez p2, :cond_1

    if-nez p3, :cond_1

    .line 95
    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    const-string p3, "Read data completed."

    invoke-static {p2, v0, p3}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 p2, 0x0

    .line 96
    invoke-virtual {p1, p2}, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->setParam(Lcom/jieli/jl_bt_ota/model/base/BaseParameter;)Lcom/jieli/jl_bt_ota/model/base/CommandBase;

    const/4 p2, 0x0

    .line 97
    invoke-virtual {p1, p2}, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_bt_ota/model/base/CommandBase;

    .line 98
    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->p:Lcom/jieli/jl_bt_ota/tool/RcspOTA;

    invoke-virtual {p2, p1}, Lcom/jieli/jl_bt_ota/tool/RcspOTA;->sendCommandResponse(Lcom/jieli/jl_bt_ota/model/base/CommandBase;)V

    .line 99
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->n()V

    return-void

    .line 100
    :cond_1
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->u:Lcom/jieli/jl_bt_ota/thread/OtaDataCache;

    new-instance v1, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$12;

    invoke-direct {v1, p0, p2, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$12;-><init>(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;ILcom/jieli/jl_bt_ota/model/command/FirmwareUpdateBlockCmd;)V

    invoke-virtual {v0, p2, p3, v1}, Lcom/jieli/jl_bt_ota/thread/OtaDataCache;->readOtaData(IILcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V

    return-void
.end method

.method private a(Ljava/lang/String;Lcom/jieli/jl_bt_ota/model/base/BaseError;)V
    .locals 1

    const/4 v0, 0x0

    .line 78
    invoke-direct {p0, p1, p2, v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Ljava/lang/String;Lcom/jieli/jl_bt_ota/model/base/BaseError;Z)V

    return-void
.end method

.method private a(Ljava/lang/String;Lcom/jieli/jl_bt_ota/model/base/BaseError;Z)V
    .locals 3

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "callbackError"

    if-nez p3, :cond_1

    .line 79
    invoke-direct {p0, v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_1

    goto :goto_0

    .line 80
    :cond_1
    iget-object p3, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->w:Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;

    .line 81
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    const-string v2, "(%s) ---> %s"

    invoke-static {v2, p1}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, v0, p1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->h()V

    if-eqz p3, :cond_2

    .line 83
    new-instance p1, Lcom/android/mltcode/paycertificationapi/XIiX100i;

    invoke-direct {p1, p3, p2}, Lcom/android/mltcode/paycertificationapi/XIiX100i;-><init>(Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->runOnMainThread(Ljava/lang/Runnable;)V

    :cond_2
    :goto_0
    return-void
.end method

.method private a(Ljava/lang/String;Z)V
    .locals 4

    .line 58
    const-string v0, "callbackReconnectEvent"

    invoke-direct {p0, v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 59
    :cond_0
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "address : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v0, v2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->w:Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;

    if-eqz v0, :cond_1

    .line 61
    new-instance v1, Lcom/android/mltcode/paycertificationapi/i1iXO;

    invoke-direct {v1, v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/i1iXO;-><init>(Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;Ljava/lang/String;Z)V

    invoke-virtual {p0, v1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->runOnMainThread(Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private a(Z)V
    .locals 5

    .line 101
    const-string v0, "exitUpdateMode"

    invoke-direct {p0, v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 102
    :cond_0
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->f()Z

    move-result v1

    .line 103
    iget-object v2, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "isRelease : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v4, ", isSupportDoubleBackup : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v0, v3}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    .line 104
    invoke-direct {p0, v1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->b(Z)V

    .line 105
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->p:Lcom/jieli/jl_bt_ota/tool/RcspOTA;

    new-instance v2, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$14;

    invoke-direct {v2, p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$14;-><init>(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;)V

    invoke-virtual {v1, v2}, Lcom/jieli/jl_bt_ota/tool/RcspOTA;->exitUpdateMode(Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V

    goto :goto_0

    .line 106
    :cond_1
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    .line 107
    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->getTargetDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    .line 108
    const-string v3, "device[%s] is single flash ota, so ota progress cannot be interrupted."

    invoke-static {v3, v2}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v0, v2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    if-eqz p1, :cond_2

    const/16 p1, 0x5007

    .line 109
    invoke-static {p1}, Lcom/jieli/jl_bt_ota/model/OTAError;->buildError(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Ljava/lang/String;Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Landroid/bluetooth/BluetoothDevice;[B)Z
    .locals 0

    .line 6
    invoke-direct {p0, p1, p2}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->b(Landroid/bluetooth/BluetoothDevice;[B)Z

    move-result p0

    return p0
.end method

.method private a(Ljava/lang/String;)Z
    .locals 2

    .line 110
    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->isOTA()Z

    move-result v0

    if-nez v0, :cond_0

    .line 111
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    const-string v1, "OTA process has exited."

    invoke-static {v0, p1, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private b(I)F
    .locals 2

    .line 15
    iget v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->B:I

    if-lez v0, :cond_1

    int-to-float p1, p1

    const/high16 v1, 0x42c80000    # 100.0f

    mul-float/2addr p1, v1

    int-to-float v0, v0

    div-float/2addr p1, v0

    cmpl-float v0, p1, v1

    if-ltz v0, :cond_0

    const p1, 0x42c7cccd    # 99.9f

    :cond_0
    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private b()V
    .locals 3

    .line 16
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    const-string v1, "callbackStartOTA"

    const-string v2, ""

    invoke-static {v0, v1, v2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->resetTotalTime()V

    .line 18
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->w:Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;

    if-eqz v0, :cond_0

    .line 19
    new-instance v1, Lcom/android/mltcode/paycertificationapi/O00OOOXXi;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/O00OOOXXi;-><init>(Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;)V

    invoke-virtual {p0, v1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->runOnMainThread(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method private b(Landroid/bluetooth/BluetoothDevice;)V
    .locals 5

    .line 20
    const-string v0, "checkUpgradeEnvironment"

    invoke-direct {p0, v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 21
    :cond_0
    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->getDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;

    move-result-object v1

    .line 22
    iget-object v2, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    .line 23
    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3, v1}, [Ljava/lang/Object;

    move-result-object v3

    .line 24
    const-string v4, "device : %s, %s"

    invoke-static {v4, v3}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v0, v3}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-nez v1, :cond_1

    const/16 p1, 0x1012

    .line 25
    invoke-static {p1}, Lcom/jieli/jl_bt_ota/model/OTAError;->buildError(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Ljava/lang/String;Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    return-void

    .line 26
    :cond_1
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->l()V

    .line 27
    invoke-virtual {v1}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->isSupportDoubleBackup()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 28
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->m()V

    return-void

    .line 29
    :cond_2
    invoke-virtual {v1}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->isNeedBootLoader()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 30
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Landroid/bluetooth/BluetoothDevice;)V

    .line 31
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->j()V

    return-void

    .line 32
    :cond_3
    invoke-virtual {v1}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->isMandatoryUpgrade()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 33
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->m()V

    return-void

    :cond_4
    const/4 v0, 0x1

    .line 34
    invoke-direct {p0, p1, v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->c(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method private b(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 10

    .line 35
    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->isOTA()Z

    move-result v0

    .line 36
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->r:Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;

    invoke-virtual {v1}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->isWaitingForUpdate()Z

    move-result v1

    .line 37
    iget-object v2, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    .line 38
    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v3

    invoke-static {p2}, Lcom/jieli/jl_bt_ota/constant/StateCode;->printConnectionState(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    filled-new-array {v3, v4, v5, v6}, [Ljava/lang/Object;

    move-result-object v3

    .line 39
    const-string v4, "device : %s, state: %s\n isOTA : %s, isWaitingForUpdate : %s."

    invoke-static {v4, v3}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "notifyConnectionStatus"

    invoke-static {v2, v4, v3}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p2, :cond_6

    const/4 v2, 0x1

    if-eq p2, v2, :cond_0

    const/4 v3, 0x2

    if-eq p2, v3, :cond_6

    const/4 v3, 0x4

    if-eq p2, v3, :cond_0

    goto/16 :goto_1

    .line 40
    :cond_0
    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->getDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;

    move-result-object v3

    .line 41
    iget-object v5, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "handle connected event. "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v4, v6}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    invoke-virtual {v3}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->isMandatoryUpgrade()Z

    move-result v5

    .line 43
    invoke-virtual {v3}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->isSupportReuseSpaceOTA()Z

    move-result v6

    .line 44
    invoke-virtual {v3}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->getExpandMode()I

    move-result v3

    if-nez v5, :cond_2

    if-eqz v6, :cond_1

    const/4 v7, 0x3

    if-ne v3, v7, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    .line 45
    :cond_2
    :goto_0
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->l()V

    .line 46
    iget-object v7, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "isForceOTA : "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v9, ", isMandatoryUpgrade : "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v9, ", isSupportReuseSpaceOTA : "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v6, ", expandMode : "

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v7, v4, v3}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v2, :cond_5

    .line 47
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Landroid/bluetooth/BluetoothDevice;)V

    if-eqz v0, :cond_8

    if-eqz v1, :cond_8

    const/4 v0, 0x0

    .line 48
    invoke-direct {p0, p1, v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Landroid/bluetooth/BluetoothDevice;F)V

    .line 49
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    const-string v1, "Reconnect device successfully, continue ..."

    invoke-static {v0, v4, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->getBluetoothOption()Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->isAutoConnectBle()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 51
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onConnection : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Lcom/jieli/jl_bt_ota/constant/StateCode;->printConnectionState(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v4, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->s:Lcom/jieli/jl_bt_ota/tool/callback/BtEventCallbackHelper;

    invoke-virtual {v0, p1, p2}, Lcom/jieli/jl_bt_ota/tool/callback/BtEventCallbackHelper;->onConnection(Landroid/bluetooth/BluetoothDevice;I)V

    :cond_3
    if-eqz v5, :cond_4

    .line 53
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->m()V

    return-void

    .line 54
    :cond_4
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->k(Landroid/bluetooth/BluetoothDevice;)V

    return-void

    :cond_5
    if-eqz v0, :cond_8

    .line 55
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    const-string v1, "The device is functioning properly. However, the cache status is currently being upgraded, so the upgrade call is complete."

    invoke-static {v0, v4, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->c()V

    goto :goto_1

    .line 57
    :cond_6
    iget-object v2, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    const-string v3, "handle disconnect event."

    invoke-static {v2, v4, v3}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    iget-object v2, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->F:Landroid/os/Handler;

    const/16 v3, 0x1237

    invoke-virtual {v2, v3}, Landroid/os/Handler;->removeMessages(I)V

    .line 59
    iget-object v2, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->F:Landroid/os/Handler;

    const/16 v3, 0x1242

    invoke-virtual {v2, v3}, Landroid/os/Handler;->removeMessages(I)V

    .line 60
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->k()V

    .line 61
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->g()V

    if-eqz v0, :cond_8

    if-eqz v1, :cond_7

    .line 62
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->E:Lcom/jieli/jl_bt_ota/model/ReconnectParam;

    .line 63
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v4, v2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->F:Landroid/os/Handler;

    const/16 v2, 0x1238

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeMessages(I)V

    .line 65
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->F:Landroid/os/Handler;

    const/16 v2, 0x1239

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeMessages(I)V

    if-eqz v0, :cond_8

    .line 66
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    const-string p2, "device communication channel is disconnect. ready reconnect task. "

    invoke-static {p1, v4, p2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->d()V

    return-void

    :cond_7
    const/16 v0, 0x1012

    .line 68
    invoke-static {v0}, Lcom/jieli/jl_bt_ota/model/OTAError;->buildError(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object v0

    invoke-direct {p0, v4, v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Ljava/lang/String;Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    .line 69
    :cond_8
    :goto_1
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    .line 70
    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p2}, Lcom/jieli/jl_bt_ota/constant/StateCode;->printConnectionState(I)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v1, v2}, [Ljava/lang/Object;

    move-result-object v1

    .line 71
    const-string v2, "onConnection :: device : %s, state: %s"

    invoke-static {v2, v1}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v4, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->s:Lcom/jieli/jl_bt_ota/tool/callback/BtEventCallbackHelper;

    invoke-virtual {v0, p1, p2}, Lcom/jieli/jl_bt_ota/tool/callback/BtEventCallbackHelper;->onConnection(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method private b(Landroid/bluetooth/BluetoothDevice;II)V
    .locals 2

    .line 8
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->s:Lcom/jieli/jl_bt_ota/tool/callback/BtEventCallbackHelper;

    invoke-virtual {v0, p1, p2, p3}, Lcom/jieli/jl_bt_ota/tool/callback/BtEventCallbackHelper;->onBleDataBlockChanged(Landroid/bluetooth/BluetoothDevice;II)V

    .line 9
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    .line 10
    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    filled-new-array {v1, p2, p3}, [Ljava/lang/Object;

    move-result-object p2

    .line 11
    const-string p3, "device : %s, block : %d, status : %d"

    invoke-static {p3, p2}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string p3, "onBleDataBlockChanged"

    invoke-static {v0, p3, p2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->F:Landroid/os/Handler;

    const/16 p3, 0x1235

    invoke-virtual {p2, p3}, Landroid/os/Handler;->hasMessages(I)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 13
    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->F:Landroid/os/Handler;

    invoke-virtual {p2, p3}, Landroid/os/Handler;->removeMessages(I)V

    .line 14
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->g(Landroid/bluetooth/BluetoothDevice;)V

    :cond_0
    return-void
.end method

.method private b(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/CommandBase;)V
    .locals 2

    if-eqz p1, :cond_5

    if-nez p2, :cond_0

    goto :goto_0

    .line 73
    :cond_0
    invoke-virtual {p2}, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->getStatus()I

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 74
    :cond_1
    invoke-virtual {p2}, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->getId()I

    move-result v0

    const/16 v1, 0xd1

    if-eq v0, v1, :cond_4

    const/16 v1, 0xe3

    if-eq v0, v1, :cond_3

    const/16 p2, 0xe7

    if-eq v0, p2, :cond_2

    goto :goto_0

    .line 75
    :cond_2
    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    const-string v0, "handleResponseCommand"

    const-string v1, "reboot >>> "

    invoke-static {p2, v0, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    invoke-interface {p0, p1}, Lcom/jieli/jl_bt_ota/interfaces/bt/IBluetoothManager;->disconnectBluetoothDevice(Landroid/bluetooth/BluetoothDevice;)V

    return-void

    .line 77
    :cond_3
    check-cast p2, Lcom/jieli/jl_bt_ota/model/command/EnterUpdateModeCmd;

    .line 78
    invoke-virtual {p2}, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->getResponse()Lcom/jieli/jl_bt_ota/model/base/CommonResponse;

    move-result-object p2

    check-cast p2, Lcom/jieli/jl_bt_ota/model/response/EnterUpdateModeResponse;

    if-eqz p2, :cond_5

    .line 79
    invoke-virtual {p2}, Lcom/jieli/jl_bt_ota/model/response/EnterUpdateModeResponse;->getCanUpdateFlag()I

    move-result p2

    if-nez p2, :cond_5

    .line 80
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Landroid/bluetooth/BluetoothDevice;)V

    return-void

    .line 81
    :cond_4
    check-cast p2, Lcom/jieli/jl_bt_ota/model/command/SettingsMtuCmd;

    .line 82
    invoke-virtual {p2}, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->getResponse()Lcom/jieli/jl_bt_ota/model/base/CommonResponse;

    move-result-object p2

    check-cast p2, Lcom/jieli/jl_bt_ota/model/response/SettingsMtuResponse;

    if-eqz p2, :cond_5

    .line 83
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->o:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->getDeviceStatusCache()Lcom/jieli/jl_bt_ota/tool/DeviceStatusCache;

    move-result-object v0

    invoke-virtual {p2}, Lcom/jieli/jl_bt_ota/model/response/SettingsMtuResponse;->getRealMtu()I

    move-result p2

    invoke-virtual {v0, p1, p2}, Lcom/jieli/jl_bt_ota/tool/DeviceStatusCache;->updateDeviceMaxReceiveMtu(Landroid/bluetooth/BluetoothDevice;I)V

    :cond_5
    :goto_0
    return-void
.end method

.method public static synthetic b(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->j()V

    return-void
.end method

.method public static synthetic b(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->j(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public static synthetic b(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Landroid/bluetooth/BluetoothDevice;I)V
    .locals 0

    .line 4
    invoke-direct {p0, p1, p2}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->b(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public static synthetic b(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Landroid/bluetooth/BluetoothDevice;II)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2, p3}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Landroid/bluetooth/BluetoothDevice;II)V

    return-void
.end method

.method public static synthetic b(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/CommandBase;)V
    .locals 0

    .line 6
    invoke-direct {p0, p1, p2}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/CommandBase;)V

    return-void
.end method

.method public static synthetic b(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Landroid/bluetooth/BluetoothDevice;[B)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Landroid/bluetooth/BluetoothDevice;[B)V

    return-void
.end method

.method private b(Z)V
    .locals 0

    .line 7
    iput-boolean p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->x:Z

    return-void
.end method

.method private b(Landroid/bluetooth/BluetoothDevice;[B)Z
    .locals 8

    .line 84
    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->getBluetoothOption()Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->isAutoConnectBle()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->q:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;->isConnectedBLEDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 85
    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->getBluetoothOption()Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->getBleConnectParam()Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;

    move-result-object v0

    .line 86
    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->getBleWriteCharacteristicList()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    .line 87
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;

    .line 88
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->q:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;

    new-instance v2, Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;->getServiceUUID()Ljava/util/UUID;

    move-result-object v4

    .line 89
    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;->getCharacteristicUUID()Ljava/util/UUID;

    move-result-object v5

    new-instance v7, Lcom/android/mltcode/paycertificationapi/iIiXOii;

    invoke-direct {v7, p0}, Lcom/android/mltcode/paycertificationapi/iIiXOii;-><init>(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;)V

    move-object v3, p1

    move-object v6, p2

    invoke-direct/range {v2 .. v7}, Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;-><init>(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;[BLcom/jieli/jl_bt_ota/interfaces/bt/OnBleSendDataCallback;)V

    .line 90
    invoke-virtual {v1, v2}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;->sendBleData(Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    move-object v3, p1

    move-object v6, p2

    .line 91
    invoke-interface {p0, v3, v6}, Lcom/jieli/jl_bt_ota/interfaces/bt/IBluetoothManager;->sendDataToDevice(Landroid/bluetooth/BluetoothDevice;[B)Z

    move-result p1

    return p1
.end method

.method private c(Landroid/bluetooth/BluetoothDevice;)I
    .locals 4

    .line 3
    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->getDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 4
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->isSupportDoubleBackup()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->isMandatoryUpgrade()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    return v1

    .line 6
    :cond_1
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->getSingleBackupOtaWay()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_2

    return v1

    :cond_2
    const/4 v3, 0x2

    if-ne v0, v3, :cond_3

    return v2

    .line 7
    :cond_3
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->getSdkType()I

    move-result p1

    if-lt p1, v3, :cond_4

    return v1

    .line 8
    :cond_4
    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->getBluetoothOption()Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;

    move-result-object p1

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->getPriority()I

    move-result p1

    return p1

    .line 9
    :cond_5
    :goto_0
    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->getBluetoothOption()Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;

    move-result-object p1

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->getPriority()I

    move-result p1

    return p1
.end method

.method public static synthetic c(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;)Lcom/jieli/jl_bt_ota/tool/RcspOTA;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->p:Lcom/jieli/jl_bt_ota/tool/RcspOTA;

    return-object p0
.end method

.method private c()V
    .locals 4

    .line 13
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->w:Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;

    .line 14
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "callback : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "callbackStopOTA"

    invoke-static {v1, v3, v2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->h()V

    if-eqz v0, :cond_0

    .line 16
    new-instance v1, Lcom/android/mltcode/paycertificationapi/O1iOiO;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/O1iOiO;-><init>(Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;)V

    invoke-virtual {p0, v1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->runOnMainThread(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method private c(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 11

    .line 22
    const-string v0, "readyToReconnectDevice"

    invoke-direct {p0, v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_2

    .line 23
    :cond_0
    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->getDeviceInfo()Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;

    move-result-object v1

    if-nez v1, :cond_1

    goto/16 :goto_2

    .line 24
    :cond_1
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->c(Landroid/bluetooth/BluetoothDevice;)I

    move-result v2

    .line 25
    sget-boolean v3, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->IS_SUPPORT_NEW_RECONNECT_WAY:Z

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v3, :cond_2

    if-ne p2, v5, :cond_2

    move v3, v5

    goto :goto_0

    :cond_2
    move v3, v4

    .line 26
    :goto_0
    invoke-direct {p0, p1, v2}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Landroid/bluetooth/BluetoothDevice;I)Ljava/lang/String;

    move-result-object v6

    .line 27
    invoke-virtual {v1}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->isMandatoryUpgrade()Z

    move-result v7

    invoke-direct {p0, p1, v7}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Landroid/bluetooth/BluetoothDevice;Z)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x2

    if-ne p2, v8, :cond_3

    .line 28
    invoke-static {v7}, Lcom/jieli/jl_bt_ota/util/CHexConver;->checkBluetoothAddress(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_3

    move-object v6, v7

    .line 29
    :cond_3
    new-instance v7, Lcom/jieli/jl_bt_ota/model/ReconnectParam;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v7, v9, v2, v6}, Lcom/jieli/jl_bt_ota/model/ReconnectParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 30
    invoke-virtual {v7, v3}, Lcom/jieli/jl_bt_ota/model/ReconnectParam;->setFlag(I)Lcom/jieli/jl_bt_ota/model/ReconnectParam;

    move-result-object v7

    .line 31
    invoke-direct {p0, v7}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Lcom/jieli/jl_bt_ota/model/ReconnectParam;)V

    .line 32
    new-instance v7, Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;

    if-ne v3, v5, :cond_4

    move v9, v5

    goto :goto_1

    :cond_4
    move v9, v4

    :goto_1
    invoke-direct {v7, v2, v6, v9}, Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;-><init>(ILjava/lang/String;Z)V

    .line 33
    iget-object v6, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->r:Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;

    invoke-virtual {v6, v7}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->setReConnectDevMsg(Lcom/jieli/jl_bt_ota/model/ReConnectDevMsg;)V

    .line 34
    iget-object v6, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "flag = "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v10, ", way = "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v10, ", "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v0, v7}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->F:Landroid/os/Handler;

    const/16 v6, 0x1239

    invoke-virtual {v0, v6}, Landroid/os/Handler;->removeMessages(I)V

    .line 36
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->F:Landroid/os/Handler;

    const-wide/16 v9, 0x1770

    invoke-virtual {v0, v6, v9, v10}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    if-ne p2, v5, :cond_5

    .line 37
    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->p:Lcom/jieli/jl_bt_ota/tool/RcspOTA;

    new-instance v0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$9;

    invoke-direct {v0, p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$9;-><init>(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Landroid/bluetooth/BluetoothDevice;)V

    invoke-virtual {p2, v2, v3, v0}, Lcom/jieli/jl_bt_ota/tool/RcspOTA;->changeCommunicationWay(IILcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V

    return-void

    :cond_5
    if-ne p2, v8, :cond_7

    .line 38
    invoke-virtual {v1}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->isMandatoryUpgrade()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->getBluetoothOption()Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;

    move-result-object p2

    invoke-virtual {p2}, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->getPriority()I

    move-result p2

    if-eqz p2, :cond_6

    .line 39
    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->getBluetoothOption()Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;

    move-result-object p2

    invoke-virtual {p2, v4}, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->setPriority(I)Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;

    .line 40
    :cond_6
    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->p:Lcom/jieli/jl_bt_ota/tool/RcspOTA;

    new-instance v0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$10;

    invoke-direct {v0, p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$10;-><init>(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Landroid/bluetooth/BluetoothDevice;)V

    invoke-virtual {p2, v0}, Lcom/jieli/jl_bt_ota/tool/RcspOTA;->rebootDevice(Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V

    :cond_7
    :goto_2
    return-void
.end method

.method private c(Landroid/bluetooth/BluetoothDevice;II)V
    .locals 2

    .line 17
    const-string v0, "upgradeStep02"

    invoke-direct {p0, v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    if-ltz p3, :cond_2

    if-ltz p2, :cond_2

    if-nez p2, :cond_1

    if-nez p3, :cond_1

    .line 18
    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->getBluetoothOption()Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;

    move-result-object p2

    invoke-virtual {p2}, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->getPriority()I

    move-result p2

    invoke-static {p2}, Lcom/jieli/jl_bt_ota/util/CHexConver;->intToByte(I)B

    move-result p2

    const/4 p3, 0x1

    new-array p3, p3, [B

    const/4 v0, 0x0

    aput-byte p2, p3, v0

    invoke-direct {p0, p1, p3}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Landroid/bluetooth/BluetoothDevice;[B)V

    return-void

    .line 19
    :cond_1
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->u:Lcom/jieli/jl_bt_ota/thread/OtaDataCache;

    new-instance v1, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$7;

    invoke-direct {v1, p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$7;-><init>(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Landroid/bluetooth/BluetoothDevice;)V

    invoke-virtual {v0, p2, p3, v1}, Lcom/jieli/jl_bt_ota/thread/OtaDataCache;->readOtaData(IILcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V

    return-void

    .line 20
    :cond_2
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "upgradeStep02: offset = %d, len = %d"

    invoke-static {p2, p1}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const/16 p2, 0x1001

    .line 21
    invoke-static {p2, p1}, Lcom/jieli/jl_bt_ota/model/OTAError;->buildError(ILjava/lang/String;)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Ljava/lang/String;Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    return-void
.end method

.method public static synthetic c(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->k(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method private c(Z)V
    .locals 6

    .line 10
    iget-wide v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->z:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 11
    invoke-static {}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->getCurrentTime()J

    move-result-wide v0

    iget-wide v4, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->z:J

    sub-long/2addr v0, v4

    iput-wide v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->A:J

    if-eqz p1, :cond_0

    .line 12
    iput-wide v2, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->z:J

    :cond_0
    return-void
.end method

.method public static synthetic d(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;)Lcom/jieli/jl_bt_ota/tool/configure/OtaConfigureHelper;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->D:Lcom/jieli/jl_bt_ota/tool/configure/OtaConfigureHelper;

    return-object p0
.end method

.method private d()V
    .locals 4

    .line 19
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->F:Landroid/os/Handler;

    const/16 v1, 0x1236

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 20
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->F:Landroid/os/Handler;

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void
.end method

.method private d(Landroid/bluetooth/BluetoothDevice;)V
    .locals 4

    .line 13
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->F:Landroid/os/Handler;

    const/16 v1, 0x1238

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 14
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->r:Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->isWaitingForUpdate()Z

    move-result v0

    .line 15
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isWaitingForUpdate : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "handleBrEdrDisconnect"

    invoke-static {v1, v3, v2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-nez v0, :cond_0

    return-void

    .line 16
    :cond_0
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->f(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 17
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->i(Landroid/bluetooth/BluetoothDevice;)V

    return-void

    .line 18
    :cond_1
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->d()V

    return-void
.end method

.method public static synthetic d(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->b(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method private d(Landroid/bluetooth/BluetoothDevice;I)Z
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    .line 3
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->checkHasConnectPermission(Landroid/content/Context;)Z

    move-result v0

    const/4 v1, 0x0

    const-string v2, "requestBleMtu"

    if-nez v0, :cond_0

    .line 4
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    const-string p2, "Missing connect permission"

    invoke-static {p1, v2, p2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v1

    .line 5
    :cond_0
    invoke-interface {p0}, Lcom/jieli/jl_bt_ota/interfaces/bt/IBluetoothManager;->getConnectedBluetoothGatt()Landroid/bluetooth/BluetoothGatt;

    move-result-object v0

    if-nez v0, :cond_1

    .line 6
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    const-string p2, "getConnectedBluetoothGatt is null."

    invoke-static {p1, v2, p2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v1

    .line 7
    :cond_1
    invoke-virtual {v0}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v3

    invoke-static {v3, p1}, Lcom/jieli/jl_bt_ota/util/BluetoothUtil;->deviceEquals(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 8
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    const-string p2, "Device is not match."

    invoke-static {p1, v2, p2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v1

    .line 9
    :cond_2
    iget-object v3, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "requestMtu is started. mtu : "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v2, v4}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    add-int/lit8 p2, p2, 0x3

    .line 10
    invoke-virtual {v0, p2}, Landroid/bluetooth/BluetoothGatt;->requestMtu(I)Z

    move-result p2

    if-nez p2, :cond_3

    .line 11
    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    const-string v0, "Failed to request BLE MTU. callback old mtu."

    invoke-static {p2, v2, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 p2, 0x14

    const/16 v0, 0x1013

    .line 12
    invoke-direct {p0, p1, p2, v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->b(Landroid/bluetooth/BluetoothDevice;II)V

    return v1

    :cond_3
    const/4 p1, 0x1

    return p1
.end method

.method public static synthetic e(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->g()V

    return-void
.end method

.method private e()Z
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->getTargetDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->f(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    return v0
.end method

.method private e(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 3

    .line 4
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->f(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 5
    :cond_0
    invoke-interface {p0}, Lcom/jieli/jl_bt_ota/interfaces/bt/IBluetoothManager;->getConnectedBluetoothGatt()Landroid/bluetooth/BluetoothGatt;

    move-result-object v0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    .line 6
    invoke-virtual {v0}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/jieli/jl_bt_ota/util/BluetoothUtil;->deviceEquals(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v2

    .line 7
    :cond_1
    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->getBluetoothOption()Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;

    move-result-object p1

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->getPriority()I

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v1
.end method

.method public static synthetic e(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Landroid/bluetooth/BluetoothDevice;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->f(Landroid/bluetooth/BluetoothDevice;)Z

    move-result p0

    return p0
.end method

.method public static synthetic f(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->i()V

    return-void
.end method

.method public static synthetic f(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->i(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method private f()Z
    .locals 1

    .line 5
    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->getDeviceInfo()Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->isSupportDoubleBackup()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private f(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 3
    :cond_0
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->t:Ljava/util/Map;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_1

    .line 4
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v1, 0x1

    if-ne p1, v1, :cond_1

    return v1

    :cond_1
    return v0
.end method

.method private g()V
    .locals 2

    .line 5
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->F:Landroid/os/Handler;

    const/16 v1, 0x1240

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->F:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 7
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->F:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    :cond_0
    return-void
.end method

.method private g(Landroid/bluetooth/BluetoothDevice;)V
    .locals 2

    .line 3
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->v:Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtListener;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 4
    invoke-interface {v0, p1, v1}, Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtListener;->onConnection(Landroid/bluetooth/BluetoothDevice;I)V

    :cond_0
    return-void
.end method

.method public static synthetic g(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->m()V

    return-void
.end method

.method public static synthetic g(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->d(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method private h()V
    .locals 2

    const/4 v0, 0x0

    .line 11
    invoke-direct {p0, v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->b(Z)V

    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->w:Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;

    .line 13
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->k()V

    .line 14
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->i()V

    const/4 v1, 0x1

    .line 15
    invoke-direct {p0, v1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->c(Z)V

    .line 16
    invoke-direct {p0, v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Lcom/jieli/jl_bt_ota/model/ReconnectParam;)V

    .line 17
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->u:Lcom/jieli/jl_bt_ota/thread/OtaDataCache;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/thread/OtaDataCache;->release()V

    return-void
.end method

.method private h(Landroid/bluetooth/BluetoothDevice;)V
    .locals 6

    if-nez p1, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->F:Landroid/os/Handler;

    const/16 v1, 0x1235

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    const-string v2, "startChangeMtu"

    if-eqz v0, :cond_1

    .line 3
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    const-string v0, "Adjusting the MTU for BLE"

    invoke-static {p1, v2, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 4
    :cond_1
    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->getBluetoothOption()Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;

    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->isNeedChangeMtu()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->getMtu()I

    move-result v3

    const/16 v4, 0x14

    if-le v3, v4, :cond_2

    .line 6
    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->getMtu()I

    move-result v0

    invoke-direct {p0, p1, v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->d(Landroid/bluetooth/BluetoothDevice;I)Z

    move-result v0

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    .line 7
    :goto_0
    iget-object v3, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "requestBleMtu : "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v2, v4}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v0, :cond_3

    .line 8
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->F:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 9
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->F:Landroid/os/Handler;

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    const-wide/16 v1, 0x1388

    invoke-virtual {v0, p1, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void

    .line 10
    :cond_3
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->g(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public static synthetic h(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a()V

    return-void
.end method

.method public static synthetic i(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;)Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->r:Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;

    return-object p0
.end method

.method private i()V
    .locals 1

    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->C:I

    .line 6
    iput v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->B:I

    return-void
.end method

.method private i(Landroid/bluetooth/BluetoothDevice;)V
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->F:Landroid/os/Handler;

    const/16 v1, 0x1242

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 3
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->F:Landroid/os/Handler;

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    const-wide/16 v2, 0x1770

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 4
    invoke-interface {p0, p1}, Lcom/jieli/jl_bt_ota/interfaces/bt/IBluetoothManager;->disconnectBluetoothDevice(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public static synthetic iO(Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;IF)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;IF)V

    return-void
.end method

.method public static synthetic j(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;)Lcom/jieli/jl_bt_ota/tool/callback/BtEventCallbackHelper;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->s:Lcom/jieli/jl_bt_ota/tool/callback/BtEventCallbackHelper;

    return-object p0
.end method

.method private j()V
    .locals 4

    .line 2
    const-string v0, "startReceiveCmdTimeout"

    invoke-direct {p0, v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->getTimeout_ms()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-gtz v2, :cond_1

    :goto_0
    return-void

    .line 4
    :cond_1
    iget-object v2, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->F:Landroid/os/Handler;

    const/16 v3, 0x1234

    invoke-virtual {v2, v3}, Landroid/os/Handler;->removeMessages(I)V

    .line 5
    iget-object v2, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->F:Landroid/os/Handler;

    invoke-virtual {v2, v3, v0, v1}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void
.end method

.method private j(Landroid/bluetooth/BluetoothDevice;)V
    .locals 8

    .line 6
    const-string v0, "upgradePrepare"

    invoke-direct {p0, v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 7
    :cond_0
    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->getDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;

    move-result-object v0

    if-nez v0, :cond_1

    .line 8
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->o:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;

    new-instance v1, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$5;

    invoke-direct {v1, p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$5;-><init>(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Landroid/bluetooth/BluetoothDevice;)V

    invoke-virtual {v0, v1}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->syncDeviceInfo(Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V

    return-void

    .line 9
    :cond_1
    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->isMandatoryUpgrade()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 10
    iget-object v2, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->D:Lcom/jieli/jl_bt_ota/tool/configure/OtaConfigureHelper;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->getUid()I

    move-result v3

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->getPid()I

    move-result v4

    .line 11
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v7

    const/4 v5, 0x1

    const/4 v6, 0x0

    .line 12
    invoke-virtual/range {v2 .. v7}, Lcom/jieli/jl_bt_ota/tool/configure/OtaConfigureHelper;->saveAddress(IIIILjava/lang/String;)V

    goto :goto_0

    .line 13
    :cond_2
    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->getBleAddr()Ljava/lang/String;

    move-result-object v1

    .line 14
    invoke-static {v1}, Lcom/jieli/jl_bt_ota/util/CHexConver;->checkBluetoothAddress(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 15
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->e(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 16
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    :cond_3
    move-object v7, v1

    .line 17
    iget-object v2, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->D:Lcom/jieli/jl_bt_ota/tool/configure/OtaConfigureHelper;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->getUid()I

    move-result v3

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->getPid()I

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v2 .. v7}, Lcom/jieli/jl_bt_ota/tool/configure/OtaConfigureHelper;->saveAddress(IIIILjava/lang/String;)V

    .line 18
    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->getEdrAddr()Ljava/lang/String;

    move-result-object v1

    .line 19
    invoke-static {v1}, Lcom/jieli/jl_bt_ota/util/CHexConver;->checkBluetoothAddress(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_4

    .line 20
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->e(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v2

    if-nez v2, :cond_4

    .line 21
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    :cond_4
    move-object v7, v1

    .line 22
    iget-object v2, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->D:Lcom/jieli/jl_bt_ota/tool/configure/OtaConfigureHelper;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->getUid()I

    move-result v3

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->getPid()I

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x1

    invoke-virtual/range {v2 .. v7}, Lcom/jieli/jl_bt_ota/tool/configure/OtaConfigureHelper;->saveAddress(IIIILjava/lang/String;)V

    .line 23
    :goto_0
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->k(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public static synthetic k(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;)Lcom/jieli/jl_bt_ota/model/ReconnectParam;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->E:Lcom/jieli/jl_bt_ota/model/ReconnectParam;

    return-object p0
.end method

.method private k()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->F:Landroid/os/Handler;

    const/16 v1, 0x1234

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    return-void
.end method

.method private k(Landroid/bluetooth/BluetoothDevice;)V
    .locals 2

    .line 3
    const-string v0, "upgradeStep01"

    invoke-direct {p0, v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->p:Lcom/jieli/jl_bt_ota/tool/RcspOTA;

    new-instance v1, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$6;

    invoke-direct {v1, p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$6;-><init>(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Landroid/bluetooth/BluetoothDevice;)V

    invoke-virtual {v0, v1}, Lcom/jieli/jl_bt_ota/tool/RcspOTA;->readUpgradeFileFlag(Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V

    return-void
.end method

.method public static synthetic l(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->F:Landroid/os/Handler;

    return-object p0
.end method

.method private l()V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->r:Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->isWaitingForUpdate()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->r:Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->stopReconnectTask()V

    :cond_0
    return-void
.end method

.method private m()V
    .locals 2

    const-string v0, "upgradeStep03"

    invoke-direct {p0, v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->p:Lcom/jieli/jl_bt_ota/tool/RcspOTA;

    new-instance v1, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$11;

    invoke-direct {v1, p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$11;-><init>(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;)V

    invoke-virtual {v0, v1}, Lcom/jieli/jl_bt_ota/tool/RcspOTA;->enterUpdateMode(Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V

    return-void
.end method

.method private n()V
    .locals 2

    const-string v0, "upgradeStep05"

    invoke-direct {p0, v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->p:Lcom/jieli/jl_bt_ota/tool/RcspOTA;

    new-instance v1, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$13;

    invoke-direct {v1, p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$13;-><init>(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;)V

    invoke-virtual {v0, v1}, Lcom/jieli/jl_bt_ota/tool/RcspOTA;->queryUpdateResult(Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V

    return-void
.end method


# virtual methods
.method public addOnRcspCallback(Lcom/jieli/jl_bt_ota/interfaces/rcsp/OnRcspCallback;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->o:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->registerOnRcspCallback(Lcom/jieli/jl_bt_ota/interfaces/rcsp/OnRcspCallback;)V

    return-void
.end method

.method public cancelOTA()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Z)V

    return-void
.end method

.method public configure(Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;)V
    .locals 3

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "configure"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->q:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;->configure(Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;)V

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->o:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->configure(Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;)V

    return-void
.end method

.method public getBluetoothOption()Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->o:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->getBluetoothOption()Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;

    move-result-object v0

    return-object v0
.end method

.method public getDeviceInfo()Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->getTargetDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->getDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;

    move-result-object v0

    return-object v0
.end method

.method public getDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->o:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->getDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;

    move-result-object p1

    return-object p1
.end method

.method public getTargetDevice()Landroid/bluetooth/BluetoothDevice;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->o:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->getTargetDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    return-object v0
.end method

.method public getTimeout_ms()J
    .locals 2

    iget-wide v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->y:J

    return-wide v0
.end method

.method public getTotalTime()J
    .locals 2

    iget-wide v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->A:J

    return-wide v0
.end method

.method public getUpdateContentSize()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->B:I

    return v0
.end method

.method public isOTA()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->x:Z

    return v0
.end method

.method public onBtDeviceConnection(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 5

    const-string v0, "onBtDeviceConnection"

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    const-string p2, "BluetoothDevice is null."

    invoke-static {p1, v0, p2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->t:Ljava/util/Map;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, p2, :cond_1

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Same status : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Lcom/jieli/jl_bt_ota/constant/StateCode;->printConnectionState(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, v0, p2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    if-nez p2, :cond_2

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->t:Ljava/util/Map;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->t:Ljava/util/Map;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->s:Lcom/jieli/jl_bt_ota/tool/callback/BtEventCallbackHelper;

    invoke-virtual {v1, p1, p2}, Lcom/jieli/jl_bt_ota/tool/callback/BtEventCallbackHelper;->onBtDeviceConnection(Landroid/bluetooth/BluetoothDevice;I)V

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "device : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Lcom/jieli/jl_bt_ota/constant/StateCode;->printConnectionState(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v0, v2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x3

    if-eq p2, v1, :cond_3

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->F:Landroid/os/Handler;

    const/16 v2, 0x1241

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeMessages(I)V

    :cond_3
    const/4 v1, 0x1

    if-ne p2, v1, :cond_4

    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->e(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v1

    iget-object v2, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "isConnectedBLE : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v0, v3}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v1, :cond_4

    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->h(Landroid/bluetooth/BluetoothDevice;)V

    return-void

    :cond_4
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->v:Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtListener;

    if-eqz v0, :cond_5

    invoke-interface {v0, p1, p2}, Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtListener;->onConnection(Landroid/bluetooth/BluetoothDevice;I)V

    :cond_5
    return-void
.end method

.method public onError(Lcom/jieli/jl_bt_ota/model/base/BaseError;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->s:Lcom/jieli/jl_bt_ota/tool/callback/BtEventCallbackHelper;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_bt_ota/tool/callback/BtEventCallbackHelper;->onError(Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    const-string v0, "errorEventCallback"

    invoke-direct {p0, v0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Ljava/lang/String;Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    return-void
.end method

.method public onMtuChanged(Landroid/bluetooth/BluetoothGatt;II)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    :cond_0
    if-nez p3, :cond_1

    add-int/lit8 p2, p2, -0x3

    goto :goto_0

    :cond_1
    const/16 p2, 0x14

    :goto_0
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "bleMtu : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "onMtuChanged"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->b(Landroid/bluetooth/BluetoothDevice;II)V

    return-void
.end method

.method public onReceiveDeviceData(Landroid/bluetooth/BluetoothDevice;[B)V
    .locals 3

    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "device : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", recv data : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Lcom/jieli/jl_bt_ota/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "onReceiveDeviceData"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->v:Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtListener;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1, p2}, Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtListener;->onReceivedData(Landroid/bluetooth/BluetoothDevice;[B)V

    :cond_1
    :goto_0
    return-void
.end method

.method public printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->context:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/jieli/jl_bt_ota/util/BluetoothUtil;->printBtDeviceInfo(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public queryMandatoryUpdate(Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_bt_ota/interfaces/IActionCallback<",
            "Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->getTargetDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    const-string v1, "queryMandatoryUpdate"

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    const/16 v2, 0x1012

    invoke-static {v2}, Lcom/jieli/jl_bt_ota/model/OTAError;->buildError(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object v2

    invoke-static {v0, v1, p1, v2}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->callbackError(Ljava/lang/String;Ljava/lang/String;Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    return-void

    :cond_0
    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->getDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;

    move-result-object v2

    iget-object v3, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "cache deviceInfo : "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v1, v4}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->isMandatoryUpgrade()Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual {v2}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->getRequestOtaFlag()I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    const/4 v2, 0x0

    const-string v3, "Device is connected."

    invoke-static {v2, v3}, Lcom/jieli/jl_bt_ota/model/OTAError;->buildError(ILjava/lang/String;)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object v2

    invoke-static {v0, v1, p1, v2}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->callbackError(Ljava/lang/String;Ljava/lang/String;Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    return-void

    :cond_2
    :goto_0
    if-eqz p1, :cond_3

    invoke-interface {p1, v2}, Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;->onSuccess(Ljava/lang/Object;)V

    :cond_3
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->s:Lcom/jieli/jl_bt_ota/tool/callback/BtEventCallbackHelper;

    invoke-virtual {p1, v0}, Lcom/jieli/jl_bt_ota/tool/callback/BtEventCallbackHelper;->onMandatoryUpgrade(Landroid/bluetooth/BluetoothDevice;)V

    return-void

    :cond_4
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->o:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;

    new-instance v1, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$3;

    invoke-direct {v1, p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$3;-><init>(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V

    invoke-virtual {v0, v1}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->syncDeviceInfo(Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V

    return-void
.end method

.method public registerBluetoothCallback(Lcom/jieli/jl_bt_ota/interfaces/BtEventCallback;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->s:Lcom/jieli/jl_bt_ota/tool/callback/BtEventCallbackHelper;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper;->addCallback(Ljava/lang/Object;)Z

    return-void
.end method

.method public release()V
    .locals 3

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "clazz : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "release"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Z)V

    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->h()V

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->t:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->r:Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->release()V

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->s:Lcom/jieli/jl_bt_ota/tool/callback/BtEventCallbackHelper;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper;->release()V

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->F:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->o:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->I:Lcom/jieli/jl_bt_ota/interfaces/rcsp/OnRcspCallback;

    invoke-virtual {v0, v1}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->unregisterOnRcspCallback(Lcom/jieli/jl_bt_ota/interfaces/rcsp/OnRcspCallback;)V

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->o:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->release()V

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->q:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->G:Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtBleListener;

    invoke-virtual {v0, v1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;->removeOnBtBleListener(Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtBleListener;)V

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->q:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->H:Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtAssistantCallback;

    invoke-virtual {v0, v1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;->removeOnBtAssistantCallback(Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtAssistantCallback;)V

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->q:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothAssistant;->release()V

    return-void
.end method

.method public removeRcspCallback(Lcom/jieli/jl_bt_ota/interfaces/rcsp/OnRcspCallback;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->o:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->unregisterOnRcspCallback(Lcom/jieli/jl_bt_ota/interfaces/rcsp/OnRcspCallback;)V

    return-void
.end method

.method public resetTotalTime()V
    .locals 2

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->A:J

    return-void
.end method

.method public runOnMainThread(Ljava/lang/Runnable;)V
    .locals 4

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-virtual {v2}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getId()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->F:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public setReconnectAddress(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->r:Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->isWaitingForUpdate()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/jieli/jl_bt_ota/util/CHexConver;->checkBluetoothAddress(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->r:Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->setReconnectAddress(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public setTimeout_ms(J)V
    .locals 0

    iput-wide p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->y:J

    return-void
.end method

.method public startOTA(Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;)V
    .locals 5

    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->getTargetDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    const-string v1, "startOTA"

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    const-string v2, "Bluetooth device is disconnected."

    invoke-static {v0, v1, v2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_1

    const/16 v0, 0x1012

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/model/OTAError;->buildError(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;->onError(Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->isOTA()Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    const-string v2, "OTA in progress."

    invoke-static {v0, v1, v2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_1

    const/16 v0, 0x4008

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/model/OTAError;->buildError(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;->onError(Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    :cond_1
    return-void

    :cond_2
    const/4 v2, 0x1

    invoke-direct {p0, v2}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->b(Z)V

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->w:Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;

    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->getBluetoothOption()Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;

    move-result-object p1

    iget-object v2, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "device : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ", "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, v1, p1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->b()V

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->u:Lcom/jieli/jl_bt_ota/thread/OtaDataCache;

    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->getBluetoothOption()Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$4;

    invoke-direct {v2, p0, v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$4;-><init>(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Landroid/bluetooth/BluetoothDevice;)V

    invoke-virtual {p1, v1, v2}, Lcom/jieli/jl_bt_ota/thread/OtaDataCache;->init(Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V

    return-void
.end method

.method public unregisterBluetoothCallback(Lcom/jieli/jl_bt_ota/interfaces/BtEventCallback;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->s:Lcom/jieli/jl_bt_ota/tool/callback/BtEventCallbackHelper;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper;->removeCallback(Ljava/lang/Object;)Z

    return-void
.end method
