.class public Lcom/jieli/watchtesttool/tool/watch/WatchManager;
.super Lcom/jieli/jl_rcsp/impl/WatchOpImpl;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "WatchManager"

.field private static volatile instance:Lcom/jieli/watchtesttool/tool/watch/WatchManager;


# instance fields
.field private devFatFileList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/jieli/jl_fatfs/model/FatFile;",
            ">;"
        }
    .end annotation
.end field

.field private final mBluetoothHelper:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

.field private mContext:Landroid/content/Context;

.field private final mEventListener:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothEventListener;

.field private mTargetDevice:Landroid/bluetooth/BluetoothDevice;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(ILandroid/content/Context;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;-><init>(I)V

    new-instance p1, Lcom/jieli/watchtesttool/tool/watch/WatchManager$1;

    invoke-direct {p1, p0}, Lcom/jieli/watchtesttool/tool/watch/WatchManager$1;-><init>(Lcom/jieli/watchtesttool/tool/watch/WatchManager;)V

    iput-object p1, p0, Lcom/jieli/watchtesttool/tool/watch/WatchManager;->mEventListener:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothEventListener;

    iput-object p2, p0, Lcom/jieli/watchtesttool/tool/watch/WatchManager;->mContext:Landroid/content/Context;

    const/4 v0, 0x1

    sput-boolean v0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sUseNewDataHandler:Z

    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    check-cast p2, Landroid/app/Application;

    invoke-static {p2}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->getInstance(Landroid/app/Application;)Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    move-result-object p2

    iput-object p2, p0, Lcom/jieli/watchtesttool/tool/watch/WatchManager;->mBluetoothHelper:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    invoke-virtual {p2, p1}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->addBluetoothEventListener(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothEventListener;)V

    invoke-virtual {p2}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->isConnectedDevice()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p2}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->getConnectedBtDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/jieli/watchtesttool/tool/watch/WatchManager;->setTargetDevice(Landroid/bluetooth/BluetoothDevice;)V

    :cond_0
    return-void
.end method

.method public static synthetic access$000(Lcom/jieli/watchtesttool/tool/watch/WatchManager;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/jieli/watchtesttool/tool/watch/WatchManager;->updateHistoryRecordMsg(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public static synthetic access$100(Lcom/jieli/watchtesttool/tool/watch/WatchManager;)Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;
    .locals 0

    iget-object p0, p0, Lcom/jieli/watchtesttool/tool/watch/WatchManager;->mBluetoothHelper:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    return-object p0
.end method

.method public static synthetic access$200(Lcom/jieli/watchtesttool/tool/watch/WatchManager;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/jieli/watchtesttool/tool/watch/WatchManager;->setTargetDevice(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public static synthetic access$300(Lcom/jieli/watchtesttool/tool/watch/WatchManager;)Landroid/bluetooth/BluetoothDevice;
    .locals 0

    iget-object p0, p0, Lcom/jieli/watchtesttool/tool/watch/WatchManager;->mTargetDevice:Landroid/bluetooth/BluetoothDevice;

    return-object p0
.end method

.method public static getInstance(Landroid/app/Application;)Lcom/jieli/watchtesttool/tool/watch/WatchManager;
    .locals 3

    sget-object v0, Lcom/jieli/watchtesttool/tool/watch/WatchManager;->instance:Lcom/jieli/watchtesttool/tool/watch/WatchManager;

    if-nez v0, :cond_1

    const-class v0, Lcom/jieli/watchtesttool/tool/watch/WatchManager;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/jieli/watchtesttool/tool/watch/WatchManager;->instance:Lcom/jieli/watchtesttool/tool/watch/WatchManager;

    if-nez v1, :cond_0

    new-instance v1, Lcom/jieli/watchtesttool/tool/watch/WatchManager;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p0}, Lcom/jieli/watchtesttool/tool/watch/WatchManager;-><init>(ILandroid/content/Context;)V

    sput-object v1, Lcom/jieli/watchtesttool/tool/watch/WatchManager;->instance:Lcom/jieli/watchtesttool/tool/watch/WatchManager;

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
    sget-object p0, Lcom/jieli/watchtesttool/tool/watch/WatchManager;->instance:Lcom/jieli/watchtesttool/tool/watch/WatchManager;

    return-object p0
.end method

.method private getWatchList(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/jieli/jl_fatfs/model/FatFile;",
            ">;)",
            "Ljava/util/ArrayList<",
            "Lcom/jieli/jl_fatfs/model/FatFile;",
            ">;"
        }
    .end annotation

    if-nez p1, :cond_0

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-object p1

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/jieli/jl_fatfs/model/FatFile;

    invoke-virtual {v1}, Lcom/jieli/jl_fatfs/model/FatFile;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "WATCH"

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {v1}, Lcom/jieli/jl_fatfs/model/FatFile;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "watch"

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    :cond_2
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method private setTargetDevice(Landroid/bluetooth/BluetoothDevice;)V
    .locals 3

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/watch/WatchManager;->mTargetDevice:Landroid/bluetooth/BluetoothDevice;

    invoke-static {p1, v0}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->deviceEquals(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-nez v0, :cond_0

    iput-object p1, p0, Lcom/jieli/watchtesttool/tool/watch/WatchManager;->mTargetDevice:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getTargetDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-setTargetDevice- device = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lcom/jieli/watchtesttool/util/AppUtil;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", connectedDevice = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Lcom/jieli/watchtesttool/util/AppUtil;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "jl_rcsp"

    invoke-static {v1, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->notifyBtDeviceConnection(Landroid/bluetooth/BluetoothDevice;I)V

    :cond_0
    return-void
.end method

.method private updateHistoryRecordMsg(Landroid/bluetooth/BluetoothDevice;)V
    .locals 4

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/watch/WatchManager;->mBluetoothHelper:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    invoke-virtual {v0, p1}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->isConnectedBtDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mStatusManager:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lcom/jieli/watchtesttool/tool/watch/WatchManager;->mBluetoothHelper:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    invoke-virtual {v1}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->getBluetoothOp()Lcom/jieli/bluetooth_connect/impl/BluetoothManager;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->isConnectedSppDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_2

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->getBleAddr()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->getEdrAddr()Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-static {v1}, Landroid/bluetooth/BluetoothAdapter;->checkBluetoothAddress(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/jieli/watchtesttool/tool/watch/WatchManager;->mBluetoothHelper:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    invoke-virtual {v2}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->getBluetoothOp()Lcom/jieli/bluetooth_connect/impl/BluetoothManager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->getHistoryRecordHelper()Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;

    move-result-object v2

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->getSdkType()I

    move-result v3

    invoke-virtual {v2, p1, v3, v1}, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->updateDeviceInfo(Landroid/bluetooth/BluetoothDevice;ILjava/lang/String;)V

    :cond_3
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->getVid()I

    move-result v1

    if-nez v1, :cond_5

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->getPid()I

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    return-void

    :cond_5
    :goto_2
    iget-object v1, p0, Lcom/jieli/watchtesttool/tool/watch/WatchManager;->mBluetoothHelper:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    invoke-virtual {v1}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->getBluetoothOp()Lcom/jieli/bluetooth_connect/impl/BluetoothManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->getHistoryRecordHelper()Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;

    move-result-object v1

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->getVid()I

    move-result v2

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->getVid()I

    move-result v3

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->getPid()I

    move-result v0

    invoke-virtual {v1, p1, v2, v3, v0}, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->updateDeviceIDs(Landroid/bluetooth/BluetoothDevice;III)V

    return-void
.end method


# virtual methods
.method public getBluetoothHelper()Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;
    .locals 1

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/watch/WatchManager;->mBluetoothHelper:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    return-object v0
.end method

.method public getConnectedDevice()Landroid/bluetooth/BluetoothDevice;
    .locals 1

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/watch/WatchManager;->mTargetDevice:Landroid/bluetooth/BluetoothDevice;

    return-object v0
.end method

.method public getDevFatFileList()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/jieli/jl_fatfs/model/FatFile;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/watch/WatchManager;->devFatFileList:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mStatusManager:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object p1

    return-object p1
.end method

.method public getExternalFlashMsg(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mStatusManager:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getExtFlashMsg(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;

    move-result-object p1

    return-object p1
.end method

.method public isExistSDCard()Z
    .locals 3

    invoke-virtual {p0}, Lcom/jieli/watchtesttool/tool/watch/WatchManager;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/jieli/watchtesttool/tool/watch/WatchManager;->getDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->isSupportSd1()Z

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-isExistSDCard- ret = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "jl_rcsp"

    invoke-static {v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    return v0
.end method

.method public isWatchSystemInit(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Lcom/jieli/watchtesttool/tool/watch/WatchManager;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-static {v1, p1}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->deviceEquals(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->isWatchSystemOk()Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v0
.end method

.method public release()V
    .locals 2

    invoke-super {p0}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->release()V

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/watch/WatchManager;->mBluetoothHelper:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    iget-object v1, p0, Lcom/jieli/watchtesttool/tool/watch/WatchManager;->mEventListener:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothEventListener;

    invoke-virtual {v0, v1}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->removeBluetoothEventListener(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothEventListener;)V

    const/4 v0, 0x0

    sput-object v0, Lcom/jieli/watchtesttool/tool/watch/WatchManager;->instance:Lcom/jieli/watchtesttool/tool/watch/WatchManager;

    return-void
.end method

.method public sendDataToDevice(Landroid/bluetooth/BluetoothDevice;[B)Z
    .locals 2

    const-string v0, "write data to device"

    invoke-static {p2}, Lcom/jieli/jl_rcsp/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/watch/WatchManager;->mBluetoothHelper:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    invoke-virtual {v0, p1, p2}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->sendDataToDevice(Landroid/bluetooth/BluetoothDevice;[B)Z

    move-result p1

    return p1
.end method
