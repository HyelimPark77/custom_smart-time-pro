.class public abstract Lcom/jieli/jl_rcsp/impl/RcspOpImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/bluetooth/IBluetoothProxy;
.implements Lcom/jieli/jl_rcsp/interfaces/rcsp/IRcspOp;


# static fields
.field private static final TAG:Ljava/lang/String; = "jl_rcsp"

.field public static sUseNewDataHandler:Z = true


# instance fields
.field protected mCmdSnGenerator:Lcom/jieli/jl_rcsp/interfaces/bluetooth/CmdSnGenerator;

.field protected final mHandler:Landroid/os/Handler;

.field private final mHealthDataParseHelper:Lcom/jieli/jl_rcsp/tool/HealthDataParseHelper;

.field protected final mOption:Lcom/jieli/jl_rcsp/model/Option;

.field protected final mRcspCallbackManager:Lcom/jieli/jl_rcsp/tool/callback/RcspCallbackManager;

.field protected final mRcspDataHandler:Lcom/jieli/jl_rcsp/tool/RcspDataHandler;

.field protected final mRcspEventListenerManager:Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;

.field protected final mStatusManager:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

.field private mTargetDevice:Landroid/bluetooth/BluetoothDevice;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/jieli/jl_rcsp/model/Option;->createOption()Lcom/jieli/jl_rcsp/model/Option;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;-><init>(Lcom/jieli/jl_rcsp/model/Option;)V

    return-void
.end method

.method public constructor <init>(Lcom/jieli/jl_rcsp/model/Option;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mHandler:Landroid/os/Handler;

    if-eqz p1, :cond_0

    .line 4
    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mOption:Lcom/jieli/jl_rcsp/model/Option;

    .line 5
    invoke-static {}, Lcom/jieli/jl_rcsp/constant/RcspConstant;->getLibVersionName()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/jieli/jl_rcsp/constant/RcspConstant;->getLibVersionCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v0, v1, p1, p0}, [Ljava/lang/Object;

    move-result-object p1

    .line 6
    const-string v0, "Lib Name : %s(%d), Option : %s. \nclazz: %s"

    invoke-static {v0, p1}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "jl_rcsp"

    const-string v1, "init"

    invoke-static {v0, v1, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    invoke-static {}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getInstance()Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    move-result-object p1

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mStatusManager:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    .line 8
    new-instance p1, Lcom/jieli/jl_rcsp/tool/callback/RcspCallbackManager;

    invoke-direct {p1}, Lcom/jieli/jl_rcsp/tool/callback/RcspCallbackManager;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mRcspCallbackManager:Lcom/jieli/jl_rcsp/tool/callback/RcspCallbackManager;

    .line 9
    new-instance p1, Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;

    invoke-direct {p1}, Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mRcspEventListenerManager:Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;

    .line 10
    new-instance v0, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;

    invoke-direct {v0, p0, p1}, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mRcspDataHandler:Lcom/jieli/jl_rcsp/tool/RcspDataHandler;

    .line 11
    new-instance v0, Lcom/jieli/jl_rcsp/tool/HealthDataParseHelper;

    invoke-direct {v0, p0, p1}, Lcom/jieli/jl_rcsp/tool/HealthDataParseHelper;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mHealthDataParseHelper:Lcom/jieli/jl_rcsp/tool/HealthDataParseHelper;

    return-void

    .line 12
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Option can not be null."

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic OXO1(Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 0

    invoke-interface {p0, p1, p2}, Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;->onErrCode(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void
.end method

.method public static synthetic access$000(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->handleDeviceConnectedEvent(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public static synthetic access$100(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->notifyRcspError(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void
.end method

.method private addDataHandlerInCache(Landroid/bluetooth/BluetoothDevice;)V
    .locals 2

    if-eqz p1, :cond_1

    invoke-static {}, Lcom/jieli/jl_rcsp/tool/DataHandlerCache;->getInstance()Lcom/jieli/jl_rcsp/tool/DataHandlerCache;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/tool/DataHandlerCache;->getDataHandler(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/tool/datahandles/DataHandler;

    move-result-object v0

    if-nez v0, :cond_1

    sget-boolean v0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sUseNewDataHandler:Z

    if-eqz v0, :cond_0

    new-instance v0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;

    invoke-direct {v0, p0}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;-><init>(Lcom/jieli/jl_rcsp/interfaces/bluetooth/IBluetoothProxy;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;

    invoke-direct {v0, p0}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;-><init>(Lcom/jieli/jl_rcsp/interfaces/bluetooth/IBluetoothProxy;)V

    :goto_0
    invoke-static {}, Lcom/jieli/jl_rcsp/tool/DataHandlerCache;->getInstance()Lcom/jieli/jl_rcsp/tool/DataHandlerCache;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Lcom/jieli/jl_rcsp/tool/DataHandlerCache;->addDataHandler(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/tool/datahandles/DataHandler;)V

    :cond_1
    return-void
.end method

.method private getCmdSn(Landroid/bluetooth/BluetoothDevice;)I
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mCmdSnGenerator:Lcom/jieli/jl_rcsp/interfaces/bluetooth/CmdSnGenerator;

    if-nez v0, :cond_0

    new-instance v0, Lcom/jieli/jl_rcsp/tool/SnGenerator;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/tool/SnGenerator;-><init>()V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mCmdSnGenerator:Lcom/jieli/jl_rcsp/interfaces/bluetooth/CmdSnGenerator;

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mCmdSnGenerator:Lcom/jieli/jl_rcsp/interfaces/bluetooth/CmdSnGenerator;

    invoke-interface {v0, p1}, Lcom/jieli/jl_rcsp/interfaces/bluetooth/CmdSnGenerator;->getRcspCmdSeq(Landroid/bluetooth/BluetoothDevice;)I

    move-result p1

    return p1
.end method

.method private handleDeviceConnectedEvent(Landroid/bluetooth/BluetoothDevice;)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mStatusManager:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getDeviceStatus(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->getDeviceInfo()Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v0

    :goto_0
    if-nez v0, :cond_1

    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->syncDeviceInfo(Landroid/bluetooth/BluetoothDevice;)V

    return-void

    :cond_1
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->isMandatoryUpgrade()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mStatusManager:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    const/16 v1, 0x212

    invoke-virtual {v0, p1, v1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->updateDeviceMaxCommunicationMtu(Landroid/bluetooth/BluetoothDevice;I)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mRcspCallbackManager:Lcom/jieli/jl_rcsp/tool/callback/RcspCallbackManager;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/tool/callback/RcspCallbackManager;->onMandatoryUpgrade(Landroid/bluetooth/BluetoothDevice;)V

    return-void

    :cond_2
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mRcspCallbackManager:Lcom/jieli/jl_rcsp/tool/callback/RcspCallbackManager;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lcom/jieli/jl_rcsp/tool/callback/RcspCallbackManager;->onRcspInit(Landroid/bluetooth/BluetoothDevice;Z)V

    return-void
.end method

.method private handleDeviceConnection(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mRcspCallbackManager:Lcom/jieli/jl_rcsp/tool/callback/RcspCallbackManager;

    invoke-virtual {v0, p1, p2}, Lcom/jieli/jl_rcsp/tool/callback/RcspCallbackManager;->onConnectStateChange(Landroid/bluetooth/BluetoothDevice;I)V

    const/4 v0, 0x1

    if-eqz p2, :cond_2

    if-eq p2, v0, :cond_0

    const/4 v1, 0x2

    if-eq p2, v1, :cond_2

    const/4 v0, 0x4

    if-eq p2, v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object p2, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mTargetDevice:Landroid/bluetooth/BluetoothDevice;

    if-nez p2, :cond_1

    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->setTargetDevice(Landroid/bluetooth/BluetoothDevice;)V

    goto :goto_0

    :cond_1
    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->addDataHandlerInCache(Landroid/bluetooth/BluetoothDevice;)V

    :goto_0
    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->handleDeviceConnectedEvent(Landroid/bluetooth/BluetoothDevice;)V

    return-void

    :cond_2
    iget-object p2, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mStatusManager:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    invoke-virtual {p2, p1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->removeDeviceStatus(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    invoke-static {}, Lcom/jieli/jl_rcsp/tool/DataHandlerCache;->getInstance()Lcom/jieli/jl_rcsp/tool/DataHandlerCache;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/jieli/jl_rcsp/tool/DataHandlerCache;->removeDataHandler(Landroid/bluetooth/BluetoothDevice;)V

    iget-object p2, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mTargetDevice:Landroid/bluetooth/BluetoothDevice;

    invoke-static {p2, p1}, Lcom/jieli/jl_rcsp/util/RcspUtil;->deviceEquals(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, Lcom/jieli/jl_rcsp/tool/DataHandlerCache;->getInstance()Lcom/jieli/jl_rcsp/tool/DataHandlerCache;

    move-result-object p1

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/tool/DataHandlerCache;->getDeviceList()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_3

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->setTargetDevice(Landroid/bluetooth/BluetoothDevice;)V

    return-void

    :cond_3
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p2

    sub-int/2addr p2, v0

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/bluetooth/BluetoothDevice;

    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->setTargetDevice(Landroid/bluetooth/BluetoothDevice;)V

    :cond_4
    :goto_1
    return-void
.end method

.method private handleRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;I)V
    .locals 3

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getId()I

    move-result v0

    invoke-static {v0}, Lcom/jieli/jl_rcsp/constant/Command;->isValidCmd(I)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_5

    const/16 p3, 0x9

    if-eq v0, p3, :cond_3

    const/16 p3, 0xa5

    if-eq v0, p3, :cond_2

    const/16 p3, 0xd1

    if-eq v0, p3, :cond_0

    goto :goto_0

    :cond_0
    move-object p3, p2

    check-cast p3, Lcom/jieli/jl_rcsp/model/command/SettingsMtuCmd;

    invoke-virtual {p3}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getParam()Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    move-result-object v0

    check-cast v0, Lcom/jieli/jl_rcsp/model/parameter/SettingsMtuParam;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/parameter/SettingsMtuParam;->getMtu()I

    move-result v0

    iget-object v1, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mStatusManager:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    invoke-virtual {v1, p1, v0}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->updateDeviceMaxCommunicationMtu(Landroid/bluetooth/BluetoothDevice;I)V

    new-instance v1, Lcom/jieli/jl_rcsp/model/response/SettingsMtuResponse;

    invoke-direct {v1, v0}, Lcom/jieli/jl_rcsp/model/response/SettingsMtuResponse;-><init>(I)V

    invoke-virtual {p3, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p3, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p0, p1, p3, v2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    goto :goto_0

    :cond_2
    move-object p3, p2

    check-cast p3, Lcom/jieli/jl_rcsp/model/command/watch/HealthSettingCmd;

    invoke-virtual {p3}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getParam()Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    move-result-object p3

    check-cast p3, Lcom/jieli/jl_rcsp/model/command/watch/HealthSettingCmd$Param;

    instance-of v0, p3, Lcom/jieli/jl_rcsp/model/command/watch/HealthSettingCmd$UpdateParam;

    if-eqz v0, :cond_4

    check-cast p3, Lcom/jieli/jl_rcsp/model/command/watch/HealthSettingCmd$UpdateParam;

    invoke-virtual {p3}, Lcom/jieli/jl_rcsp/model/command/watch/HealthSettingCmd$UpdateParam;->getList()Ljava/util/List;

    move-result-object p3

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mRcspDataHandler:Lcom/jieli/jl_rcsp/tool/RcspDataHandler;

    invoke-virtual {v0, p1, p3}, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->parseHealthSetting(Landroid/bluetooth/BluetoothDevice;Ljava/util/List;)V

    goto :goto_0

    :cond_3
    move-object p3, p2

    check-cast p3, Lcom/jieli/jl_rcsp/model/command/sys/UpdateSysInfoCmd;

    invoke-virtual {p3}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getParam()Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    move-result-object p3

    check-cast p3, Lcom/jieli/jl_rcsp/model/parameter/UpdateSysInfoParam;

    invoke-virtual {p3}, Lcom/jieli/jl_rcsp/model/parameter/UpdateSysInfoParam;->getAttrBeanList()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mRcspDataHandler:Lcom/jieli/jl_rcsp/tool/RcspDataHandler;

    invoke-virtual {p3}, Lcom/jieli/jl_rcsp/model/parameter/UpdateSysInfoParam;->getFunction()B

    move-result p3

    invoke-virtual {v1, p1, p3, v0}, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->parseAttrMessage(Landroid/bluetooth/BluetoothDevice;BLjava/util/List;)V

    :cond_4
    :goto_0
    iget-object p3, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mRcspCallbackManager:Lcom/jieli/jl_rcsp/tool/callback/RcspCallbackManager;

    invoke-virtual {p3, p1, p2}, Lcom/jieli/jl_rcsp/tool/callback/RcspCallbackManager;->onRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V

    return-void

    :cond_5
    const/4 v1, 0x1

    if-ne p3, v1, :cond_6

    new-instance p3, Lcom/jieli/jl_rcsp/model/base/CommandBase;

    const-string v1, "unknownCommand"

    invoke-direct {p3, v0, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;-><init>(ILjava/lang/String;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getOpCodeSn()I

    move-result p2

    invoke-virtual {p3, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    const/4 p2, 0x2

    invoke-virtual {p3, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p0, p1, p3, v2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    :cond_6
    return-void
.end method

.method private handleReceiveDevRcspCmd(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BasePacket;)V
    .locals 4

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result v0

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getType()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {p1, p2}, Lcom/jieli/jl_rcsp/tool/datahandles/ParseHelper;->convert2Command(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BasePacket;)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v3

    if-nez v3, :cond_1

    new-instance v0, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/16 v1, 0x3001

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(I)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result p2

    invoke-virtual {v0, p2}, Lcom/jieli/jl_rcsp/model/base/BaseError;->setOpCode(I)Lcom/jieli/jl_rcsp/model/base/BaseError;

    invoke-direct {p0, p1, v0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->notifyRcspError(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void

    :cond_1
    if-ne v2, v0, :cond_2

    iget-object p2, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mRcspCallbackManager:Lcom/jieli/jl_rcsp/tool/callback/RcspCallbackManager;

    invoke-virtual {p2, p1, v3}, Lcom/jieli/jl_rcsp/tool/callback/RcspCallbackManager;->onRcspDataCmd(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V

    return-void

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getHasResponse()I

    move-result p2

    invoke-direct {p0, p1, v3, p2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->handleRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;I)V

    goto :goto_1

    :cond_3
    invoke-virtual {p0, p1, v3}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->handleRcspResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V

    :goto_1
    iget-object p2, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mHealthDataParseHelper:Lcom/jieli/jl_rcsp/tool/HealthDataParseHelper;

    invoke-virtual {p2, p1, v3}, Lcom/jieli/jl_rcsp/tool/HealthDataParseHelper;->receiveCmdFromDevice(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V

    return-void
.end method

.method private notifyErrorEvent(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/jieli/jl_rcsp/model/base/CommandBase;",
            ">(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback<",
            "TT;>;",
            "Lcom/jieli/jl_rcsp/model/base/BaseError;",
            ")V"
        }
    .end annotation

    if-nez p3, :cond_0

    return-void

    :cond_0
    if-eqz p2, :cond_1

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/RcspUtil;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0, p3}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "device : %s ---> %s"

    invoke-static {v1, v0}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "jl_rcsp"

    const-string v2, "notifyErrorEvent"

    invoke-static {v1, v2, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mHandler:Landroid/os/Handler;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/af2;

    invoke-direct {v1, p2, p1, p3}, Lcom/android/mltcode/paycertificationapi/af2;-><init>(Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_1
    invoke-direct {p0, p1, p3}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->notifyRcspError(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void
.end method

.method private notifyRcspError(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 3

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/RcspUtil;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0, p2}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "device : %s ---> %s"

    invoke-static {v1, v0}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "jl_rcsp"

    const-string v2, "notifyRcspError"

    invoke-static {v1, v2, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mRcspCallbackManager:Lcom/jieli/jl_rcsp/tool/callback/RcspCallbackManager;

    invoke-virtual {v0, p1, p2}, Lcom/jieli/jl_rcsp/tool/callback/RcspCallbackManager;->onRcspError(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void
.end method

.method private setTargetDevice(Landroid/bluetooth/BluetoothDevice;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mTargetDevice:Landroid/bluetooth/BluetoothDevice;

    invoke-static {v0, p1}, Lcom/jieli/jl_rcsp/util/RcspUtil;->deviceEquals(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mTargetDevice:Landroid/bluetooth/BluetoothDevice;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mTargetDevice:Landroid/bluetooth/BluetoothDevice;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mRcspCallbackManager:Lcom/jieli/jl_rcsp/tool/callback/RcspCallbackManager;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/tool/callback/RcspCallbackManager;->onSwitchConnectedDevice(Landroid/bluetooth/BluetoothDevice;)V

    :cond_1
    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->addDataHandlerInCache(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method private syncDeviceInfo(Landroid/bluetooth/BluetoothDevice;)V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "device : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/RcspUtil;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "jl_rcsp"

    const-string v2, "syncDeviceInfo"

    invoke-static {v1, v2, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildGetDeviceInfoCmdForAll()Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    new-instance v1, Lcom/jieli/jl_rcsp/impl/RcspOpImpl$2;

    invoke-direct {v1, p0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl$2;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;)V

    invoke-virtual {p0, p1, v0, v1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method


# virtual methods
.method public callbackErrorEvent(Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mRcspCallbackManager:Lcom/jieli/jl_rcsp/tool/callback/RcspCallbackManager;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getTargetDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/jieli/jl_rcsp/tool/callback/RcspCallbackManager;->onRcspError(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void
.end method

.method public getDeviceInfo()Lcom/jieli/jl_rcsp/model/device/DeviceInfo;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mTargetDevice:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v0

    return-object v0
.end method

.method public getDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mStatusManager:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object p1

    return-object p1
.end method

.method public getTargetDevice()Landroid/bluetooth/BluetoothDevice;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mTargetDevice:Landroid/bluetooth/BluetoothDevice;

    return-object v0
.end method

.method public handleRcspResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V
    .locals 2

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getStatus()I

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getId()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_4

    const/4 v1, 0x7

    if-eq v0, v1, :cond_3

    const/16 v1, 0xa5

    if-eq v0, v1, :cond_2

    const/16 v1, 0xd1

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast p2, Lcom/jieli/jl_rcsp/model/command/SettingsMtuCmd;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getResponse()Lcom/jieli/jl_rcsp/model/base/CommonResponse;

    move-result-object p2

    check-cast p2, Lcom/jieli/jl_rcsp/model/response/SettingsMtuResponse;

    if-eqz p2, :cond_5

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mStatusManager:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/response/SettingsMtuResponse;->getRealMtu()I

    move-result p2

    invoke-virtual {v0, p1, p2}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->updateDeviceMaxCommunicationMtu(Landroid/bluetooth/BluetoothDevice;I)V

    return-void

    :cond_2
    check-cast p2, Lcom/jieli/jl_rcsp/model/command/watch/HealthSettingCmd;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getResponse()Lcom/jieli/jl_rcsp/model/base/CommonResponse;

    move-result-object p2

    check-cast p2, Lcom/jieli/jl_rcsp/model/command/watch/HealthSettingCmd$Response;

    instance-of v0, p2, Lcom/jieli/jl_rcsp/model/command/watch/HealthSettingCmd$GetResponse;

    if-eqz v0, :cond_5

    check-cast p2, Lcom/jieli/jl_rcsp/model/command/watch/HealthSettingCmd$GetResponse;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/command/watch/HealthSettingCmd$GetResponse;->getList()Ljava/util/List;

    move-result-object p2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mRcspDataHandler:Lcom/jieli/jl_rcsp/tool/RcspDataHandler;

    invoke-virtual {v0, p1, p2}, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->parseHealthSetting(Landroid/bluetooth/BluetoothDevice;Ljava/util/List;)V

    return-void

    :cond_3
    check-cast p2, Lcom/jieli/jl_rcsp/model/command/sys/GetSysInfoCmd;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getResponse()Lcom/jieli/jl_rcsp/model/base/CommonResponse;

    move-result-object p2

    check-cast p2, Lcom/jieli/jl_rcsp/model/response/SysInfoResponse;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/response/SysInfoResponse;->getAttrs()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mRcspDataHandler:Lcom/jieli/jl_rcsp/tool/RcspDataHandler;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/response/SysInfoResponse;->getFunction()B

    move-result p2

    invoke-virtual {v1, p1, p2, v0}, Lcom/jieli/jl_rcsp/tool/RcspDataHandler;->parseAttrMessage(Landroid/bluetooth/BluetoothDevice;BLjava/util/List;)V

    return-void

    :cond_4
    check-cast p2, Lcom/jieli/jl_rcsp/model/command/status/GetTargetInfoCmd;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getResponse()Lcom/jieli/jl_rcsp/model/base/CommonResponse;

    move-result-object p2

    check-cast p2, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    if-eqz p2, :cond_5

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mStatusManager:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    invoke-virtual {v0, p1, p2}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->updateDeviceTargetInfo(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;)V

    :cond_5
    :goto_0
    return-void
.end method

.method public isRcspInit()Z
    .locals 1

    invoke-interface {p0}, Lcom/jieli/jl_rcsp/interfaces/bluetooth/IBluetoothProxy;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getDeviceInfo()Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public notifyBtDeviceConnection(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 3

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/RcspUtil;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "device = %s, status = %d"

    invoke-static {v1, v0}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "jl_rcsp"

    const-string v2, "notifyBtDeviceConnection"

    invoke-static {v1, v2, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->handleDeviceConnection(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public notifyReceiveDeviceData(Landroid/bluetooth/BluetoothDevice;[B)V
    .locals 3

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/RcspUtil;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2}, Lcom/jieli/jl_rcsp/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "device = %s, data = [%s]"

    invoke-static {v1, v0}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "jl_rcsp"

    const-string v2, "notifyReceiveDeviceData"

    invoke-static {v1, v2, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_3

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mOption:Lcom/jieli/jl_rcsp/model/Option;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/Option;->isMultiDevice()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getTargetDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/jieli/jl_rcsp/util/RcspUtil;->deviceEquals(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance p2, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/16 v0, 0x2001

    invoke-direct {p2, v0}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(I)V

    invoke-direct {p0, p1, p2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->notifyRcspError(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void

    :cond_1
    invoke-static {}, Lcom/jieli/jl_rcsp/tool/DataHandlerCache;->getInstance()Lcom/jieli/jl_rcsp/tool/DataHandlerCache;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/tool/DataHandlerCache;->getDataHandler(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/tool/datahandles/DataHandler;

    move-result-object v0

    if-nez v0, :cond_2

    const-string p2, "No Data Handler."

    invoke-static {v1, v2, p2}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance p2, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/16 v0, 0x2000

    invoke-direct {p2, v0}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(I)V

    invoke-direct {p0, p1, p2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->notifyRcspError(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void

    :cond_2
    new-instance v1, Lcom/jieli/jl_rcsp/model/DataInfo;

    invoke-direct {v1}, Lcom/jieli/jl_rcsp/model/DataInfo;-><init>()V

    invoke-virtual {v1, p1}, Lcom/jieli/jl_rcsp/model/DataInfo;->setDevice(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/DataInfo;

    move-result-object p1

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/DataInfo;->setType(I)Lcom/jieli/jl_rcsp/model/DataInfo;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/DataInfo;->setRecvData([B)Lcom/jieli/jl_rcsp/model/DataInfo;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandler;->addRecvData(Lcom/jieli/jl_rcsp/model/DataInfo;)V

    return-void

    :cond_3
    :goto_0
    new-instance p2, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/16 v0, 0x1001

    invoke-direct {p2, v0}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(I)V

    invoke-direct {p0, p1, p2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->notifyRcspError(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void
.end method

.method public receiveDataFromDevice(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BasePacket;)V
    .locals 3

    if-eqz p1, :cond_3

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/RcspUtil;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0, p2}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "device = %s, %s"

    invoke-static {v1, v0}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "jl_rcsp"

    const-string v2, "receiveDataFromDevice"

    invoke-static {v1, v2, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mOption:Lcom/jieli/jl_rcsp/model/Option;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/Option;->isMultiDevice()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getTargetDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/jieli/jl_rcsp/util/RcspUtil;->deviceEquals(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result v0

    const/16 v1, 0xc2

    if-eq v0, v1, :cond_2

    :cond_1
    return-void

    :cond_2
    invoke-direct {p0, p1, p2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->handleReceiveDevRcspCmd(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BasePacket;)V

    return-void

    :cond_3
    :goto_0
    new-instance p2, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/16 v0, 0x1001

    invoke-direct {p2, v0}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(I)V

    invoke-direct {p0, p1, p2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->notifyRcspError(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void
.end method

.method public registerOnRcspCallback(Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mRcspCallbackManager:Lcom/jieli/jl_rcsp/tool/callback/RcspCallbackManager;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->registerCallback(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getTargetDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mStatusManager:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    invoke-virtual {v1, v0}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->isMandatoryUpgrade()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;->onMandatoryUpgrade(Landroid/bluetooth/BluetoothDevice;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public registerOnRcspEventListener(Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mRcspEventListenerManager:Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->registerCallback(Ljava/lang/Object;)V

    return-void
.end method

.method public release()V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "clazz : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "jl_rcsp"

    const-string v2, "release"

    invoke-static {v1, v2, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->setTargetDevice(Landroid/bluetooth/BluetoothDevice;)V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mCmdSnGenerator:Lcom/jieli/jl_rcsp/interfaces/bluetooth/CmdSnGenerator;

    if-eqz v1, :cond_1

    instance-of v2, v1, Lcom/jieli/jl_rcsp/tool/SnGenerator;

    if-eqz v2, :cond_0

    check-cast v1, Lcom/jieli/jl_rcsp/tool/SnGenerator;

    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/tool/SnGenerator;->destroy()V

    :cond_0
    iput-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mCmdSnGenerator:Lcom/jieli/jl_rcsp/interfaces/bluetooth/CmdSnGenerator;

    :cond_1
    iget-object v1, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mRcspCallbackManager:Lcom/jieli/jl_rcsp/tool/callback/RcspCallbackManager;

    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->release()V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mRcspEventListenerManager:Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;

    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->release()V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mStatusManager:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->release()V

    invoke-static {}, Lcom/jieli/jl_rcsp/tool/DataHandlerCache;->getInstance()Lcom/jieli/jl_rcsp/tool/DataHandlerCache;

    move-result-object v1

    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/tool/DataHandlerCache;->destroy()V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mHandler:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    return-void
.end method

.method public sendCommandAsync(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;ILcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/jieli/jl_rcsp/model/base/CommandBase;",
            ">(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Lcom/jieli/jl_rcsp/model/base/CommandBase;",
            "I",
            "Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback<",
            "TT;>;)V"
        }
    .end annotation

    if-eqz p1, :cond_3

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/jieli/jl_rcsp/tool/DataHandlerCache;->getInstance()Lcom/jieli/jl_rcsp/tool/DataHandlerCache;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/tool/DataHandlerCache;->getDataHandler(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/tool/datahandles/DataHandler;

    move-result-object v0

    invoke-interface {p0, p1}, Lcom/jieli/jl_rcsp/interfaces/bluetooth/IBluetoothProxy;->isDeviceConnected(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v1

    if-eqz v1, :cond_2

    if-eqz v0, :cond_2

    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getCmdSn(Landroid/bluetooth/BluetoothDevice;)I

    move-result v1

    invoke-virtual {p2, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    const/4 v1, 0x1

    invoke-static {p2, v1}, Lcom/jieli/jl_rcsp/tool/datahandles/ParseHelper;->convert2BasePacket(Lcom/jieli/jl_rcsp/model/base/CommandBase;I)Lcom/jieli/jl_rcsp/model/base/BasePacket;

    move-result-object v1

    if-nez v1, :cond_1

    new-instance p3, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/16 v0, 0x3001

    invoke-direct {p3, v0}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(I)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getId()I

    move-result p2

    invoke-virtual {p3, p2}, Lcom/jieli/jl_rcsp/model/base/BaseError;->setOpCode(I)Lcom/jieli/jl_rcsp/model/base/BaseError;

    invoke-direct {p0, p1, p4, p3}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->notifyErrorEvent(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void

    :cond_1
    invoke-static {}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getInstance()Lcom/jieli/jl_rcsp/tool/CommandHelper;

    move-result-object v2

    invoke-virtual {v2, p1, p2}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->putCommandBase(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V

    new-instance p2, Lcom/jieli/jl_rcsp/model/DataInfo;

    invoke-direct {p2}, Lcom/jieli/jl_rcsp/model/DataInfo;-><init>()V

    invoke-virtual {p2, p1}, Lcom/jieli/jl_rcsp/model/DataInfo;->setDevice(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/DataInfo;

    move-result-object p2

    const/4 v2, 0x0

    invoke-virtual {p2, v2}, Lcom/jieli/jl_rcsp/model/DataInfo;->setType(I)Lcom/jieli/jl_rcsp/model/DataInfo;

    move-result-object p2

    invoke-virtual {p2, v1}, Lcom/jieli/jl_rcsp/model/DataInfo;->setBasePacket(Lcom/jieli/jl_rcsp/model/base/BasePacket;)Lcom/jieli/jl_rcsp/model/DataInfo;

    move-result-object p2

    invoke-virtual {p2, p3}, Lcom/jieli/jl_rcsp/model/DataInfo;->setTimeoutMs(I)Lcom/jieli/jl_rcsp/model/DataInfo;

    move-result-object p2

    invoke-virtual {p2, p4}, Lcom/jieli/jl_rcsp/model/DataInfo;->setRcspCmdCallback(Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)Lcom/jieli/jl_rcsp/model/DataInfo;

    move-result-object p2

    invoke-static {v1}, Lcom/jieli/jl_rcsp/tool/datahandles/ParseHelper;->packSendBasePacket(Lcom/jieli/jl_rcsp/model/base/BasePacket;)[B

    move-result-object p3

    iget-object p4, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mRcspCallbackManager:Lcom/jieli/jl_rcsp/tool/callback/RcspCallbackManager;

    invoke-virtual {p4, p1, p3}, Lcom/jieli/jl_rcsp/tool/callback/RcspCallbackManager;->onPutDataToDataHandler(Landroid/bluetooth/BluetoothDevice;[B)V

    invoke-interface {v0, p2}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandler;->addSendData(Lcom/jieli/jl_rcsp/model/DataInfo;)V

    return-void

    :cond_2
    new-instance p3, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/16 v0, 0x2000

    invoke-direct {p3, v0}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(I)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getId()I

    move-result p2

    invoke-virtual {p3, p2}, Lcom/jieli/jl_rcsp/model/base/BaseError;->setOpCode(I)Lcom/jieli/jl_rcsp/model/base/BaseError;

    invoke-direct {p0, p1, p4, p3}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->notifyErrorEvent(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void

    :cond_3
    :goto_0
    new-instance p2, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/16 p3, 0x1001

    invoke-direct {p2, p3}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(I)V

    invoke-direct {p0, p1, p4, p2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->notifyErrorEvent(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void
.end method

.method public sendCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/jieli/jl_rcsp/model/base/CommandBase;",
            ">(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Lcom/jieli/jl_rcsp/model/base/CommandBase;",
            "Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback<",
            "TT;>;)V"
        }
    .end annotation

    if-nez p2, :cond_0

    new-instance p2, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/16 v0, 0x1001

    invoke-direct {p2, v0}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(I)V

    invoke-direct {p0, p1, p3, p2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->notifyErrorEvent(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void

    :cond_0
    invoke-interface {p0, p1}, Lcom/jieli/jl_rcsp/interfaces/bluetooth/IBluetoothProxy;->isDeviceConnected(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/jieli/jl_rcsp/tool/DataHandlerCache;->getInstance()Lcom/jieli/jl_rcsp/tool/DataHandlerCache;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/tool/DataHandlerCache;->getDataHandler(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/tool/datahandles/DataHandler;

    move-result-object v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    invoke-static {p2, v0}, Lcom/jieli/jl_rcsp/tool/datahandles/ParseHelper;->convert2BasePacket(Lcom/jieli/jl_rcsp/model/base/CommandBase;I)Lcom/jieli/jl_rcsp/model/base/BasePacket;

    move-result-object v1

    if-nez v1, :cond_1

    new-instance v0, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/16 v1, 0x3001

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(I)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getId()I

    move-result p2

    invoke-virtual {v0, p2}, Lcom/jieli/jl_rcsp/model/base/BaseError;->setOpCode(I)Lcom/jieli/jl_rcsp/model/base/BaseError;

    invoke-direct {p0, p1, p3, v0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->notifyErrorEvent(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void

    :cond_1
    new-instance p2, Lcom/jieli/jl_rcsp/model/DataInfo;

    invoke-direct {p2}, Lcom/jieli/jl_rcsp/model/DataInfo;-><init>()V

    invoke-virtual {p2, p1}, Lcom/jieli/jl_rcsp/model/DataInfo;->setDevice(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/DataInfo;

    move-result-object p2

    invoke-virtual {p2, v0}, Lcom/jieli/jl_rcsp/model/DataInfo;->setType(I)Lcom/jieli/jl_rcsp/model/DataInfo;

    move-result-object p2

    invoke-virtual {p2, v1}, Lcom/jieli/jl_rcsp/model/DataInfo;->setBasePacket(Lcom/jieli/jl_rcsp/model/base/BasePacket;)Lcom/jieli/jl_rcsp/model/DataInfo;

    move-result-object p2

    invoke-virtual {p2, p3}, Lcom/jieli/jl_rcsp/model/DataInfo;->setRcspCmdCallback(Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)Lcom/jieli/jl_rcsp/model/DataInfo;

    move-result-object p2

    invoke-static {}, Lcom/jieli/jl_rcsp/tool/DataHandlerCache;->getInstance()Lcom/jieli/jl_rcsp/tool/DataHandlerCache;

    move-result-object p3

    invoke-virtual {p3, p1}, Lcom/jieli/jl_rcsp/tool/DataHandlerCache;->getDataHandler(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/tool/datahandles/DataHandler;

    move-result-object p1

    invoke-interface {p1, p2}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandler;->addSendData(Lcom/jieli/jl_rcsp/model/DataInfo;)V

    return-void

    :cond_2
    new-instance v0, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/16 v1, 0x2000

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(I)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getId()I

    move-result p2

    invoke-virtual {v0, p2}, Lcom/jieli/jl_rcsp/model/base/BaseError;->setOpCode(I)Lcom/jieli/jl_rcsp/model/base/BaseError;

    invoke-direct {p0, p1, p3, v0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->notifyErrorEvent(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void
.end method

.method public sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;ILcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/jieli/jl_rcsp/model/base/CommandBase;",
            ">(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Lcom/jieli/jl_rcsp/model/base/CommandBase;",
            "I",
            "Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback<",
            "TT;>;)V"
        }
    .end annotation

    .line 2
    new-instance v0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl$1;

    invoke-direct {v0, p0, p3, p4}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl$1;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;ILcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendCommandAsync(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;ILcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/jieli/jl_rcsp/model/base/CommandBase;",
            ">(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Lcom/jieli/jl_rcsp/model/base/CommandBase;",
            "Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mOption:Lcom/jieli/jl_rcsp/model/Option;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/Option;->getCmdTimeout()I

    move-result v0

    invoke-virtual {p0, p1, p2, v0, p3}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;ILcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public setCmdSnGenerator(Lcom/jieli/jl_rcsp/interfaces/bluetooth/CmdSnGenerator;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mCmdSnGenerator:Lcom/jieli/jl_rcsp/interfaces/bluetooth/CmdSnGenerator;

    return-void
.end method

.method public switchConnectedDevice(Landroid/bluetooth/BluetoothDevice;)V
    .locals 1

    invoke-static {}, Lcom/jieli/jl_rcsp/tool/DataHandlerCache;->getInstance()Lcom/jieli/jl_rcsp/tool/DataHandlerCache;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/tool/DataHandlerCache;->getDeviceList()Ljava/util/List;

    move-result-object v0

    if-eqz p1, :cond_0

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mTargetDevice:Landroid/bluetooth/BluetoothDevice;

    invoke-static {v0, p1}, Lcom/jieli/jl_rcsp/util/RcspUtil;->deviceEquals(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->setTargetDevice(Landroid/bluetooth/BluetoothDevice;)V

    :cond_0
    return-void
.end method

.method public unregisterOnRcspCallback(Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mRcspCallbackManager:Lcom/jieli/jl_rcsp/tool/callback/RcspCallbackManager;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->unregisterCallback(Ljava/lang/Object;)V

    return-void
.end method

.method public unregisterOnRcspEventListener(Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mRcspEventListenerManager:Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->unregisterCallback(Ljava/lang/Object;)V

    return-void
.end method
