.class public abstract Lcom/jieli/jl_rcsp/impl/WatchOpImpl;
.super Lcom/jieli/jl_rcsp/impl/RcspOpImpl;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/watch/IWatchOp;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_rcsp/impl/WatchOpImpl$RcspProgressListener;
    }
.end annotation


# static fields
.field public static final FUNC_FILE_BROWSE:I = 0x2

.field public static final FUNC_RCSP:I = 0x0

.field public static final FUNC_WATCH:I = 0x1

.field public static WATCH_STORAGE_INDEX_LIST:[I = null

.field public static final g:Ljava/lang/String; = "WatchOpImpl"


# instance fields
.field public final a:Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;

.field public final b:I

.field public c:Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;

.field public final d:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

.field public final e:Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;

.field public final f:Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x3

    const/4 v1, 0x6

    filled-new-array {v0, v1}, [I

    move-result-object v0

    sput-object v0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->WATCH_STORAGE_INDEX_LIST:[I

    return-void
.end method

.method public constructor <init>(I)V
    .locals 5

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;-><init>()V

    new-instance v0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$3;

    invoke-direct {v0, p0}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$3;-><init>(Lcom/jieli/jl_rcsp/impl/WatchOpImpl;)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->e:Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;

    new-instance v1, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$4;

    invoke-direct {v1, p0}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$4;-><init>(Lcom/jieli/jl_rcsp/impl/WatchOpImpl;)V

    iput-object v1, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->f:Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;

    new-instance v1, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;

    invoke-direct {v1}, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;-><init>()V

    iput-object v1, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->a:Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;

    iput p1, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->b:I

    sget-object v1, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->g:Ljava/lang/String;

    invoke-static {}, Lcom/jieli/jl_rcsp/constant/WatchConstant;->getLibVersionName()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lcom/jieli/jl_rcsp/constant/WatchConstant;->getLibVersionCode()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v2, v3, v4, p0}, [Ljava/lang/Object;

    move-result-object v2

    const-string v3, "Lib name = %s(%d), func =  %d. clazz : %s"

    invoke-static {v3, v2}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "init"

    invoke-static {v1, v3, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x1

    if-eq p1, v1, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->isInit()Z

    move-result p1

    if-nez p1, :cond_2

    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->init(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->registerOnRcspCallback(Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;)V

    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->isInit()Z

    move-result p1

    if-nez p1, :cond_2

    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->init(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;)V

    :cond_2
    :goto_0
    invoke-static {p0}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->instance(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;)Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    move-result-object p1

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->d:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    new-instance v0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$1;

    invoke-direct {v0, p0}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$1;-><init>(Lcom/jieli/jl_rcsp/impl/WatchOpImpl;)V

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->addListener(Lcom/jieli/jl_rcsp/interfaces/data/OnDataTransferListener;)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/impl/WatchOpImpl;)Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->a:Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;

    return-object p0
.end method

.method public static synthetic a()Ljava/lang/String;
    .locals 1

    .line 4
    sget-object v0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->g:Ljava/lang/String;

    return-object v0
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/impl/WatchOpImpl;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->a(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/impl/WatchOpImpl;[B)V
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->a([B)V

    return-void
.end method

.method private a(Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;",
            ">;)V"
        }
    .end annotation

    .line 5
    invoke-static {p0, p1}, Lcom/jieli/jl_rcsp/watch/WatchBase;->queryExtFlashMsgForDevice(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    return-void
.end method

.method public static synthetic b(Lcom/jieli/jl_rcsp/impl/WatchOpImpl;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->b()V

    return-void
.end method

.method public static synthetic c(Lcom/jieli/jl_rcsp/impl/WatchOpImpl;)Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->c:Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;

    return-object p0
.end method


# virtual methods
.method public final a(Landroid/bluetooth/BluetoothDevice;)V
    .locals 5

    .line 6
    iget v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->b:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    goto/16 :goto_1

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mStatusManager:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v0

    .line 8
    sget-object v1, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->g:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "device : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/RcspUtil;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "handleRcspInit"

    invoke-static {v1, v3, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v0, :cond_4

    .line 9
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->isSupportExternalFlashTransfer()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 10
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mStatusManager:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getExtFlashMsg(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;

    move-result-object v0

    .line 11
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "flashMsg = "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v3, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-nez v0, :cond_1

    .line 12
    new-instance v0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$2;

    invoke-direct {v0, p0, p1}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$2;-><init>(Lcom/jieli/jl_rcsp/impl/WatchOpImpl;Landroid/bluetooth/BluetoothDevice;)V

    invoke-direct {p0, v0}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->a(Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    return-void

    .line 13
    :cond_1
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->getSystem()I

    move-result p1

    if-nez p1, :cond_2

    .line 14
    new-instance p1, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->a:Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;

    invoke-direct {p1, p0, v2}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;)V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->c:Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;

    goto :goto_0

    .line 15
    :cond_2
    new-instance p1, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->a:Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;

    invoke-direct {p1, p0, v2}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;)V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->c:Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;

    .line 16
    :goto_0
    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->c:Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;

    invoke-interface {p1}, Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;->init()V

    .line 17
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "init WatchManager....SysStatus = "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->getSysStatus()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, v3, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->f:Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->registerOnRcspEventListener(Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;)V

    return-void

    .line 19
    :cond_3
    const-string p1, "device does not support flash to transfer data."

    invoke-static {v1, v3, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    :goto_1
    return-void
.end method

.method public final a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BasePacket;)V
    .locals 3

    .line 20
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result v0

    .line 21
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getType()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 22
    :goto_0
    invoke-static {p1, p2}, Lcom/jieli/jl_rcsp/tool/datahandles/ParseHelper;->convert2Command(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BasePacket;)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v1

    if-nez v1, :cond_1

    .line 23
    new-instance v0, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/16 v1, 0x3001

    const-string v2, "Failed to parse RCSP data."

    invoke-direct {v0, v1, v2}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(ILjava/lang/String;)V

    .line 24
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result p2

    invoke-virtual {v0, p2}, Lcom/jieli/jl_rcsp/model/base/BaseError;->setOpCode(I)Lcom/jieli/jl_rcsp/model/base/BaseError;

    .line 25
    iget-object p2, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->a:Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;

    invoke-virtual {p2, p1, v0}, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->onRcspError(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void

    :cond_1
    if-nez v2, :cond_3

    const/16 v2, 0xd6

    if-ne v0, v2, :cond_3

    .line 26
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    if-nez p2, :cond_3

    .line 27
    check-cast v1, Lcom/jieli/jl_rcsp/model/command/external_flash/GetExternalFlashMsgCmd;

    .line 28
    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getResponse()Lcom/jieli/jl_rcsp/model/base/CommonResponse;

    move-result-object p2

    check-cast p2, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;

    if-eqz p2, :cond_3

    .line 29
    sget-object v0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->g:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getDevExtFlashMsg ok, response : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "handleWatchCmd"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mStatusManager:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    invoke-virtual {v0, p1, p2}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->updateExtFlashMsg(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;)V

    .line 31
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->a:Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;

    invoke-virtual {v0, p1, p2}, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->onExternalFlashMsg(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;)V

    .line 32
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->getSysStatus()I

    move-result v0

    if-eqz v0, :cond_3

    .line 33
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->c:Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;

    if-nez v0, :cond_2

    .line 34
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mHandler:Landroid/os/Handler;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/zp6;

    invoke-direct {v1, p0, p1, p2}, Lcom/android/mltcode/paycertificationapi/zp6;-><init>(Lcom/jieli/jl_rcsp/impl/WatchOpImpl;Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;)V

    const-wide/16 p1, 0x64

    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    .line 35
    :cond_2
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->a:Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->getSysStatus()I

    move-result p2

    invoke-virtual {v0, p1, p2}, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->onWatchSystemException(Landroid/bluetooth/BluetoothDevice;I)V

    :cond_3
    return-void
.end method

.method public final synthetic a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;)V
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->a:Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->getSysStatus()I

    move-result p2

    invoke-virtual {v0, p1, p2}, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->onWatchSystemException(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public final a([B)V
    .locals 5

    .line 37
    sget-object v0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->g:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "data : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "parsePlatformInterfaceBigData"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 38
    aget-byte v1, p1, v0

    and-int/lit8 v1, v1, 0xf

    if-nez v1, :cond_0

    .line 39
    array-length v1, p1

    const/4 v2, 0x5

    if-lt v1, v2, :cond_0

    const/4 v1, 0x1

    const/4 v3, 0x4

    .line 40
    invoke-static {p1, v1, v3}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v1

    .line 41
    array-length v3, p1

    add-int/lit8 v4, v1, 0x5

    if-lt v3, v4, :cond_0

    .line 42
    new-array v3, v1, [B

    .line 43
    invoke-static {p1, v2, v3, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 44
    invoke-virtual {p0, v3}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->b([B)V

    :cond_0
    return-void
.end method

.method public final a(Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)Z
    .locals 3

    .line 45
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->c:Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;

    if-nez v0, :cond_1

    .line 46
    sget-object v0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->g:Ljava/lang/String;

    const-string v1, "checkWatchManagerIsInit"

    const-string v2, "Watch system has not been initialized."

    invoke-static {v0, v1, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    const/16 v0, 0x4116

    .line 47
    invoke-interface {p1, v0}, Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;->onStop(I)V

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public final a(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "TT;>;)Z"
        }
    .end annotation

    .line 51
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->c:Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    .line 52
    new-instance v0, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/16 v1, 0x4116

    invoke-static {v1}, Lcom/jieli/jl_rcsp/constant/WatchError;->getErrorDesc(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(ILjava/lang/String;)V

    invoke-interface {p1, v0}, Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public final a(Ljava/lang/String;Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)Z
    .locals 3

    .line 48
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 49
    sget-object v0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->g:Ljava/lang/String;

    const/16 v1, 0x3101

    invoke-static {v1}, Lcom/jieli/jl_rcsp/constant/WatchError;->getErrorDesc(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, p1, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 50
    invoke-interface {p2, v1}, Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;->onStop(I)V

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final b()V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->c:Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->f:Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->unregisterOnRcspEventListener(Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;)V

    .line 4
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->c:Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;

    invoke-interface {v0}, Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;->destroy()V

    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->c:Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;

    :cond_0
    return-void
.end method

.method public final b([B)V
    .locals 7

    .line 6
    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/DataUtil;->parseLTVData2([B)Ljava/util/List;

    move-result-object p1

    .line 7
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 8
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/jieli/jl_rcsp/model/LtvBean;

    .line 9
    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/model/LtvBean;->getData()[B

    move-result-object v2

    .line 10
    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/model/LtvBean;->getType()I

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    if-eq v3, v4, :cond_1

    const/4 v5, 0x2

    if-eq v3, v5, :cond_1

    const/4 v5, 0x3

    if-eq v3, v5, :cond_1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    .line 11
    aget-byte v5, v2, v3

    if-nez v5, :cond_0

    .line 12
    array-length v5, v2

    sub-int/2addr v5, v4

    new-array v6, v5, [B

    .line 13
    invoke-static {v2, v4, v6, v3, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 14
    invoke-static {v6}, Lcom/jieli/jl_rcsp/util/RcspUtil;->parseLTVData([B)Ljava/util/List;

    move-result-object v2

    .line 15
    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/model/LtvBean;->getType()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 16
    :cond_2
    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mRcspEventListenerManager:Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;

    if-eqz p1, :cond_3

    .line 17
    invoke-interface {p0}, Lcom/jieli/jl_rcsp/interfaces/bluetooth/IBluetoothProxy;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;->onPlatformInterfaceInfoChange(Landroid/bluetooth/BluetoothDevice;Ljava/util/Map;)V

    :cond_3
    return-void
.end method

.method public final c()Z
    .locals 2

    .line 2
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getDeviceInfo()Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->getPhoneStatus()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public cancelDataTransfer(Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->d:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->cancelDataTransfer(Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    return-void
.end method

.method public cancelTransfer()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->c:Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-interface {v0}, Lcom/jieli/jl_rcsp/interfaces/watch/IWatchOp;->cancelTransfer()Z

    move-result v0

    return v0
.end method

.method public createWatchFile(Ljava/lang/String;ZLcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V
    .locals 2

    invoke-virtual {p0, p3}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->a(Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "createWatchFile"

    invoke-virtual {p0, v0, p3}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->a(Ljava/lang/String;Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->c:Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;

    new-instance v1, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$RcspProgressListener;

    invoke-direct {v1, p0, p3}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$RcspProgressListener;-><init>(Lcom/jieli/jl_rcsp/impl/WatchOpImpl;Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V

    invoke-interface {v0, p1, p2, v1}, Lcom/jieli/jl_rcsp/interfaces/watch/IWatchOp;->createWatchFile(Ljava/lang/String;ZLcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public deleteWatchFile(Ljava/lang/String;Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V
    .locals 1

    invoke-virtual {p0, p2}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->a(Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "deleteWatchFile"

    invoke-virtual {p0, v0, p2}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->a(Ljava/lang/String;Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->c:Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;

    invoke-interface {v0, p1, p2}, Lcom/jieli/jl_rcsp/interfaces/watch/IWatchOp;->deleteWatchFile(Ljava/lang/String;Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public enableCustomWatchBg(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Lcom/jieli/jl_fatfs/model/FatFile;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0, p2}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->a(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->c:Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;

    invoke-interface {v0, p1, p2}, Lcom/jieli/jl_rcsp/interfaces/watch/IWatchOp;->enableCustomWatchBg(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    :cond_0
    return-void
.end method

.method public getCurrentBrowsePath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->c:Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-interface {v0}, Lcom/jieli/jl_rcsp/interfaces/watch/IWatchOp;->getCurrentBrowsePath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getCurrentWatchInfo(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Lcom/jieli/jl_fatfs/model/FatFile;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->a(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->c:Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;

    invoke-interface {v0, p1}, Lcom/jieli/jl_rcsp/interfaces/watch/IWatchOp;->getCurrentWatchInfo(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    :cond_0
    return-void
.end method

.method public getCustomWatchBgInfo(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0, p2}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->a(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->c:Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;

    invoke-interface {v0, p1, p2}, Lcom/jieli/jl_rcsp/interfaces/watch/IWatchOp;->getCustomWatchBgInfo(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    :cond_0
    return-void
.end method

.method public getWatchConfigure(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/WatchConfigure;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->c:Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-interface {v0, p1}, Lcom/jieli/jl_rcsp/interfaces/watch/IWatchOp;->getWatchConfigure(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/WatchConfigure;

    move-result-object p1

    return-object p1
.end method

.method public getWatchFileSize(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Lcom/jieli/jl_rcsp/model/WatchFileContent;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0, p2}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->a(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->c:Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;

    invoke-interface {v0, p1, p2}, Lcom/jieli/jl_rcsp/interfaces/watch/IWatchOp;->getWatchFileSize(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    :cond_0
    return-void
.end method

.method public getWatchMessage(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0, p2}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->a(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->c:Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;

    invoke-interface {v0, p1, p2}, Lcom/jieli/jl_rcsp/interfaces/watch/IWatchOp;->getWatchMessage(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    :cond_0
    return-void
.end method

.method public getWatchSysLeftSize(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->a(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->c:Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;

    invoke-interface {v0, p1}, Lcom/jieli/jl_rcsp/interfaces/watch/IWatchOp;->getWatchSysLeftSize(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    :cond_0
    return-void
.end method

.method public isDataTransfer()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->d:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->isDataTransfer()Z

    move-result v0

    return v0
.end method

.method public isDeviceConnected(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 1

    invoke-interface {p0}, Lcom/jieli/jl_rcsp/interfaces/bluetooth/IBluetoothProxy;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/jieli/jl_rcsp/util/RcspUtil;->deviceEquals(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    return p1
.end method

.method public isOTAResource()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->c:Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/jieli/jl_rcsp/interfaces/watch/IWatchOp;->isOTAResource()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isWatchSystemOk()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->c:Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;->isInit()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public jumpToUpdateResource(ZLcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0, p2}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->a(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->c:Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;

    invoke-interface {v0, p1, p2}, Lcom/jieli/jl_rcsp/interfaces/watch/IWatchOp;->jumpToUpdateResource(ZLcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    :cond_0
    return-void
.end method

.method public listWatchList(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Ljava/util/ArrayList<",
            "Lcom/jieli/jl_fatfs/model/FatFile;",
            ">;>;)V"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->a(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->c:Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;

    invoke-interface {v0, p1}, Lcom/jieli/jl_rcsp/interfaces/watch/IWatchOp;->listWatchList(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    :cond_0
    return-void
.end method

.method public openWatchFile(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "[B>;)V"
        }
    .end annotation

    invoke-virtual {p0, p2}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->a(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->g:Ljava/lang/String;

    const-string v0, "openWatchFile"

    const-string v1, "The device is busy."

    invoke-static {p1, v0, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p2, :cond_1

    new-instance p1, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/16 v0, 0x3101

    invoke-static {v0}, Lcom/jieli/jl_rcsp/constant/WatchError;->getErrorDesc(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(ILjava/lang/String;)V

    invoke-interface {p2, p1}, Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->c:Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;

    invoke-interface {v0, p1, p2}, Lcom/jieli/jl_rcsp/interfaces/watch/IWatchOp;->openWatchFile(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    :cond_1
    return-void
.end method

.method public pushMessageInfo(Lcom/jieli/jl_rcsp/model/NotificationMsg;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_rcsp/model/NotificationMsg;",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0, p2}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->a(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->c:Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;

    invoke-interface {v0, p1, p2}, Lcom/jieli/jl_rcsp/interfaces/watch/IWatchOp;->pushMessageInfo(Lcom/jieli/jl_rcsp/model/NotificationMsg;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    :cond_0
    return-void
.end method

.method public readLargeData(Lcom/jieli/jl_rcsp/model/data/DataParams;Lcom/jieli/jl_rcsp/interfaces/data/OnDataEventCallback;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->d:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    invoke-virtual {v0, p1, p2}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->readLargeData(Lcom/jieli/jl_rcsp/model/data/DataParams;Lcom/jieli/jl_rcsp/interfaces/data/OnDataEventCallback;)V

    return-void
.end method

.method public receiveDataFromDevice(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BasePacket;)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->receiveDataFromDevice(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BasePacket;)V

    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BasePacket;)V

    return-void
.end method

.method public registerOnWatchCallback(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;)V
    .locals 4

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->a:Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->registerWatchCallback(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;)V

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getTargetDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mStatusManager:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    invoke-virtual {v1, v0}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v1

    iget-object v2, p0, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mStatusManager:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    invoke-virtual {v2, v0}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getExtFlashMsg(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;

    move-result-object v2

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->isMandatoryUpgrade()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;->onMandatoryUpgrade(Landroid/bluetooth/BluetoothDevice;)V

    return-void

    :cond_0
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->getSysStatus()I

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v2}, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->getSysStatus()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;->onWatchSystemException(Landroid/bluetooth/BluetoothDevice;I)V

    return-void

    :cond_1
    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->getExpandMode()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_2

    sget-object v1, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->g:Ljava/lang/String;

    const-string v2, "registerOnWatchCallback"

    const-string v3, "onResourceUpdateUnfinished >>> "

    invoke-static {v1, v2, v3}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;->onResourceUpdateUnfinished(Landroid/bluetooth/BluetoothDevice;)V

    :cond_2
    return-void
.end method

.method public release()V
    .locals 3

    sget-object v0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->g:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "clazz : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "release"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->release()V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->e:Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->unregisterOnRcspCallback(Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;)V

    invoke-super {p0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->release()V

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->b()V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->d:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->destroy()V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->a:Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->release()V

    return-void
.end method

.method public removeMessageInfo(Lcom/jieli/jl_rcsp/model/NotificationMsg;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_rcsp/model/NotificationMsg;",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0, p2}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->a(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->c:Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;

    invoke-interface {v0, p1, p2}, Lcom/jieli/jl_rcsp/interfaces/watch/IWatchOp;->removeMessageInfo(Lcom/jieli/jl_rcsp/model/NotificationMsg;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    :cond_0
    return-void
.end method

.method public replaceWatchFile(Ljava/lang/String;Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V
    .locals 2

    invoke-virtual {p0, p2}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->a(Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "replaceWatchFile"

    invoke-virtual {p0, v0, p2}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->a(Ljava/lang/String;Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->c:Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;

    new-instance v1, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$RcspProgressListener;

    invoke-direct {v1, p0, p2}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$RcspProgressListener;-><init>(Lcom/jieli/jl_rcsp/impl/WatchOpImpl;Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V

    invoke-interface {v0, p1, v1}, Lcom/jieli/jl_rcsp/interfaces/watch/IWatchOp;->replaceWatchFile(Ljava/lang/String;Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public requestDeviceConfigure(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Lcom/jieli/jl_rcsp/model/WatchConfigure;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->a(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->c:Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;

    invoke-interface {v0, p1}, Lcom/jieli/jl_rcsp/interfaces/watch/IWatchOp;->requestDeviceConfigure(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    :cond_0
    return-void
.end method

.method public requestDevicePower(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->a(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->c:Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;

    invoke-interface {v0, p1}, Lcom/jieli/jl_rcsp/interfaces/watch/IWatchOp;->requestDevicePower(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    :cond_0
    return-void
.end method

.method public restoreWatchSystem(Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V
    .locals 1

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->a(Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->c:Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;

    invoke-interface {v0, p1}, Lcom/jieli/jl_rcsp/interfaces/watch/IWatchOp;->restoreWatchSystem(Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V

    :cond_0
    return-void
.end method

.method public sendLargeData(Lcom/jieli/jl_rcsp/model/data/SendParams;Lcom/jieli/jl_rcsp/interfaces/data/OnDataEventCallback;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->d:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    invoke-virtual {v0, p1, p2}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->sendLargeData(Lcom/jieli/jl_rcsp/model/data/SendParams;Lcom/jieli/jl_rcsp/interfaces/data/OnDataEventCallback;)V

    return-void
.end method

.method public sendRcspCommand(Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V
    .locals 1

    invoke-interface {p0}, Lcom/jieli/jl_rcsp/interfaces/bluetooth/IBluetoothProxy;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-virtual {p0, v0, p1, p2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public setCurrentWatchInfo(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Lcom/jieli/jl_fatfs/model/FatFile;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0, p2}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->a(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->c:Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;

    invoke-interface {v0, p1, p2}, Lcom/jieli/jl_rcsp/interfaces/watch/IWatchOp;->setCurrentWatchInfo(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    :cond_0
    return-void
.end method

.method public syncWeatherInfo(Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Weather;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Weather;",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0, p2}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->a(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->c:Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;

    invoke-interface {v0, p1, p2}, Lcom/jieli/jl_rcsp/interfaces/watch/IWatchOp;->syncWeatherInfo(Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Weather;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    :cond_0
    return-void
.end method

.method public unregisterOnWatchCallback(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->a:Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->unregisterWatchCallback(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;)V

    return-void
.end method

.method public updateWatchResource(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnUpdateResourceCallback;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->c:Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lcom/jieli/jl_rcsp/interfaces/watch/IWatchOp;->updateWatchResource(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnUpdateResourceCallback;)V

    return-void

    :cond_0
    if-eqz p2, :cond_1

    const/16 p1, 0x4116

    invoke-static {p1}, Lcom/jieli/jl_rcsp/constant/WatchError;->getErrorDesc(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, p1, v0}, Lcom/jieli/jl_rcsp/interfaces/watch/OnUpdateResourceCallback;->onError(ILjava/lang/String;)V

    :cond_1
    return-void
.end method

.method public writeResourceOTAFlag(ZLcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0, p2}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->a(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->c:Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;

    invoke-interface {v0, p1, p2}, Lcom/jieli/jl_rcsp/interfaces/watch/IWatchOp;->writeResourceOTAFlag(ZLcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    :cond_0
    return-void
.end method
