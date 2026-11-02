.class public Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;
.super Lcom/jieli/jl_rcsp/watch/WatchBase;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;


# instance fields
.field public e:Lcom/jieli/jl_fatfs/FatFileSystem;

.field public f:Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/jieli/jl_rcsp/watch/WatchBase;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;)Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;
    .locals 0

    .line 4
    iput-object p1, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->f:Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;

    return-object p1
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;[B)V
    .locals 2

    if-nez p1, :cond_0

    if-eqz p0, :cond_1

    .line 14
    new-instance p1, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/16 v0, 0x3001

    const-string v1, "fatfs op error."

    invoke-direct {p1, v0, v1}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(ILjava/lang/String;)V

    invoke-interface {p0, p1}, Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void

    :cond_0
    if-eqz p0, :cond_1

    .line 15
    invoke-interface {p0, p1}, Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;->onSuccess(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;Lcom/jieli/jl_fatfs/interfaces/OnFatFsInitListener;Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->a(Lcom/jieli/jl_fatfs/interfaces/OnFatFsInitListener;Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .locals 0

    .line 6
    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/watch/WatchBase;->deleteFileStart(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;Ljava/lang/String;ZLcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V
    .locals 0

    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->a(Ljava/lang/String;ZLcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;Z)V
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/WatchBase;->setSysException(Z)V

    return-void
.end method

.method public static synthetic b(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic b(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;Z)V
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/WatchBase;->setOTAResource(Z)V

    return-void
.end method

.method public static synthetic c(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;)Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->mStatusManager:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    return-object p0
.end method

.method public static synthetic d(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic e(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic f(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;)Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->mWatchCallbackManager:Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;

    return-object p0
.end method

.method public static synthetic g(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;)Lcom/jieli/jl_rcsp/impl/RcspOpImpl;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    return-object p0
.end method

.method public static synthetic h(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;)Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->mStatusManager:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    return-object p0
.end method

.method public static synthetic i(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;)Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->mStatusManager:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    return-object p0
.end method

.method public static synthetic j(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic k(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic l(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->isOTAResource:Z

    return p0
.end method

.method public static synthetic m(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->isOTAResource:Z

    return p0
.end method

.method public static synthetic n(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;)Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->mWatchCallbackManager:Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;

    return-object p0
.end method

.method public static synthetic o(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic p(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;)Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->mWatchCallbackManager:Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;

    return-object p0
.end method

.method public static synthetic q(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;)Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->f:Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;

    return-object p0
.end method

.method public static synthetic r(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic s(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic t(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;)Lcom/jieli/jl_fatfs/FatFileSystem;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->e:Lcom/jieli/jl_fatfs/FatFileSystem;

    return-object p0
.end method

.method public static synthetic u(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic v(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;)Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->mStatusManager:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/jieli/jl_fatfs/interfaces/OnFatFsInitListener;Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V
    .locals 10

    .line 16
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->e:Lcom/jieli/jl_fatfs/FatFileSystem;

    if-nez v0, :cond_4

    .line 17
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getTargetDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    if-nez v0, :cond_0

    if-eqz p1, :cond_4

    const/16 p2, 0x2000

    .line 18
    invoke-interface {p1, p2}, Lcom/jieli/jl_fatfs/interfaces/OnFatFsInitListener;->onInitFailed(I)V

    return-void

    .line 19
    :cond_0
    iget-object v1, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->mStatusManager:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    invoke-virtual {v1, v0}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getExtFlashMsg(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;

    move-result-object v1

    .line 20
    iget-object v2, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "device : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/RcspUtil;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ", "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "createFatFileSystem"

    invoke-static {v2, v4, v3}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-nez v1, :cond_1

    .line 21
    new-instance v1, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$7;

    invoke-direct {v1, p0, v0, p1, p2}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$7;-><init>(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_fatfs/interfaces/OnFatFsInitListener;Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V

    invoke-virtual {p0, v1}, Lcom/jieli/jl_rcsp/watch/WatchBase;->queryExtFlashMsg(Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    return-void

    .line 22
    :cond_1
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v4, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->getSysStatus()I

    move-result v0

    if-eqz v0, :cond_3

    if-nez p2, :cond_2

    if-eqz p1, :cond_4

    const/4 p2, 0x2

    .line 24
    invoke-interface {p1, p2}, Lcom/jieli/jl_fatfs/interfaces/OnFatFsInitListener;->onInitFailed(I)V

    return-void

    :cond_2
    const/4 v0, 0x1

    .line 25
    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/watch/WatchBase;->setSysException(Z)V

    .line 26
    :cond_3
    new-instance v2, Lcom/jieli/jl_fatfs/FatFileSystem;

    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->getFlashSize()I

    move-result v3

    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->getFatSize()I

    move-result v4

    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->getSysStatus()I

    move-result v5

    .line 27
    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->getMatchVersions()[Ljava/lang/String;

    move-result-object v6

    new-instance v7, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;

    invoke-direct {v7, p0}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;-><init>(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;)V

    new-instance v8, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$8;

    invoke-direct {v8, p0, p1}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$8;-><init>(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;Lcom/jieli/jl_fatfs/interfaces/OnFatFsInitListener;)V

    move-object v9, p2

    invoke-direct/range {v2 .. v9}, Lcom/jieli/jl_fatfs/FatFileSystem;-><init>(III[Ljava/lang/String;Lcom/jieli/jl_fatfs/interfaces/IBluetoothCtrl;Lcom/jieli/jl_fatfs/interfaces/OnFatFsInitListener;Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V

    iput-object v2, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->e:Lcom/jieli/jl_fatfs/FatFileSystem;

    :cond_4
    return-void
.end method

.method public final synthetic a(Lcom/jieli/jl_rcsp/interfaces/watch/OnUpdateResourceCallback;Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 3

    if-nez p3, :cond_0

    if-eqz p1, :cond_1

    const/16 p2, 0x18

    .line 7
    invoke-static {p2}, Lcom/jieli/jl_fatfs/utils/FatUtil;->getFatFsErrorCodeMsg(I)Ljava/lang/String;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Lcom/jieli/jl_rcsp/interfaces/watch/OnUpdateResourceCallback;->onError(ILjava/lang/String;)V

    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "listFatDir >> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result p3

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    const-string v1, "updateWatchResource"

    invoke-static {v0, v1, p3}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    iget-object p3, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->f:Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;

    if-nez p3, :cond_1

    .line 10
    new-instance p3, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;

    new-instance v0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$3;

    invoke-direct {v0, p0}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$3;-><init>(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;)V

    invoke-direct {p3, p0, p2, p1, v0}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;-><init>(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnUpdateResourceCallback;Lcom/jieli/jl_rcsp/interfaces/listener/ThreadStateListener;)V

    iput-object p3, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->f:Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;

    .line 11
    invoke-virtual {p3}, Ljava/lang/Thread;->start()V

    :cond_1
    return-void
.end method

.method public final synthetic a(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;Ljava/util/ArrayList;)V
    .locals 0

    if-nez p2, :cond_0

    const/16 p2, 0x18

    .line 12
    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/watch/WatchBase;->onCallbackError(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;I)V

    return-void

    :cond_0
    if-eqz p1, :cond_1

    .line 13
    invoke-interface {p1, p2}, Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;->onSuccess(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public final a(Ljava/lang/String;ZLcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V
    .locals 3

    .line 28
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v0

    long-to-int v0, v0

    .line 29
    iget-object v1, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->e:Lcom/jieli/jl_fatfs/FatFileSystem;

    invoke-virtual {v1}, Lcom/jieli/jl_fatfs/FatFileSystem;->getCurBrowsePath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p1}, Lcom/jieli/jl_fatfs/utils/FatUtil;->getFatFilePath(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 30
    new-instance v2, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$9;

    invoke-direct {v2, p0, p1, p2, p3}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$9;-><init>(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;Ljava/lang/String;ZLcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V

    invoke-virtual {p0, v1, v0, v2}, Lcom/jieli/jl_rcsp/watch/WatchBase;->createFileStart(Ljava/lang/String;ILcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    return-void
.end method

.method public cancelTransfer()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public createWatchFile(Ljava/lang/String;ZLcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V
    .locals 3

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->e:Lcom/jieli/jl_fatfs/FatFileSystem;

    if-nez v0, :cond_0

    if-eqz p3, :cond_3

    const/16 p1, 0x16

    invoke-interface {p3, p1}, Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;->onStop(I)V

    return-void

    :cond_0
    const/4 v0, 0x5

    if-nez p1, :cond_1

    if-eqz p3, :cond_3

    invoke-interface {p3, v0}, Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;->onStop(I)V

    return-void

    :cond_1
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$4;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$4;-><init>(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;Ljava/lang/String;ZLcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/jieli/jl_rcsp/watch/WatchBase;->jumpToUpdateResource(ZLcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    return-void

    :cond_2
    if-eqz p3, :cond_3

    invoke-interface {p3, v0}, Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;->onStop(I)V

    :cond_3
    return-void
.end method

.method public deleteWatchFile(Ljava/lang/String;Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->e:Lcom/jieli/jl_fatfs/FatFileSystem;

    if-nez v0, :cond_0

    if-eqz p2, :cond_1

    const/16 p1, 0x16

    invoke-interface {p2, p1}, Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;->onStop(I)V

    return-void

    :cond_0
    if-nez p1, :cond_2

    if-eqz p2, :cond_1

    const/4 p1, 0x5

    invoke-interface {p2, p1}, Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;->onStop(I)V

    :cond_1
    return-void

    :cond_2
    new-instance v0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$5;

    invoke-direct {v0, p0, p2, p1}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$5;-><init>(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/jieli/jl_rcsp/watch/WatchBase;->jumpToUpdateResource(ZLcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    return-void
.end method

.method public destroy()V
    .locals 1

    invoke-super {p0}, Lcom/jieli/jl_rcsp/watch/WatchBase;->destroy()V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->f:Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->stopThread()V

    :cond_0
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->destroyFatFileSystem()V

    return-void
.end method

.method public destroyFatFileSystem()V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->e:Lcom/jieli/jl_fatfs/FatFileSystem;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/jieli/jl_fatfs/FatFileSystem;->destroy()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/watch/WatchBase;->setSysException(Z)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->e:Lcom/jieli/jl_fatfs/FatFileSystem;

    :cond_0
    return-void
.end method

.method public getCurrentBrowsePath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->e:Lcom/jieli/jl_fatfs/FatFileSystem;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lcom/jieli/jl_fatfs/FatFileSystem;->getCurBrowsePath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getWatchFileByPath(Ljava/lang/String;)Lcom/jieli/jl_fatfs/model/FatFile;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->e:Lcom/jieli/jl_fatfs/FatFileSystem;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {v0, p1}, Lcom/jieli/jl_fatfs/FatFileSystem;->getFatFileMsg(Ljava/lang/String;)Lcom/jieli/jl_fatfs/model/FatFile;

    move-result-object p1

    return-object p1
.end method

.method public getWatchFileSize(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Lcom/jieli/jl_rcsp/model/WatchFileContent;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->e:Lcom/jieli/jl_fatfs/FatFileSystem;

    if-nez v0, :cond_0

    if-eqz p2, :cond_2

    new-instance p1, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/16 v0, 0x16

    invoke-static {v0}, Lcom/jieli/jl_fatfs/utils/FatUtil;->getFatFsErrorCodeMsg(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(ILjava/lang/String;)V

    invoke-interface {p2, p1}, Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->getWatchFileByPath(Ljava/lang/String;)Lcom/jieli/jl_fatfs/model/FatFile;

    move-result-object p1

    if-nez p1, :cond_1

    if-eqz p2, :cond_2

    new-instance p1, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/4 v0, 0x4

    invoke-static {v0}, Lcom/jieli/jl_fatfs/utils/FatUtil;->getFatFsErrorCodeMsg(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(ILjava/lang/String;)V

    invoke-interface {p2, p1}, Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void

    :cond_1
    if-eqz p2, :cond_2

    new-instance v0, Lcom/jieli/jl_rcsp/model/WatchFileContent;

    invoke-virtual {p1}, Lcom/jieli/jl_fatfs/model/FatFile;->getSize()J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/jieli/jl_rcsp/model/WatchFileContent;-><init>(JS)V

    invoke-interface {p2, v0}, Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;->onSuccess(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method

.method public getWatchSysLeftSize(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->e:Lcom/jieli/jl_fatfs/FatFileSystem;

    if-nez v0, :cond_0

    if-eqz p1, :cond_1

    new-instance v0, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/16 v1, 0x16

    invoke-static {v1}, Lcom/jieli/jl_fatfs/utils/FatUtil;->getFatFsErrorCodeMsg(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(ILjava/lang/String;)V

    invoke-interface {p1, v0}, Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/jieli/jl_fatfs/FatFileSystem;->getFreeSize()I

    move-result v0

    int-to-long v0, v0

    const-wide/16 v2, 0x1000

    mul-long/2addr v0, v2

    if-eqz p1, :cond_1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;->onSuccess(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public getWatchSystem()Lcom/jieli/jl_fatfs/FatFileSystem;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->e:Lcom/jieli/jl_fatfs/FatFileSystem;

    return-object v0
.end method

.method public init()V
    .locals 2

    new-instance v0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$1;

    invoke-direct {v0, p0}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$1;-><init>(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;)V

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->a(Lcom/jieli/jl_fatfs/interfaces/OnFatFsInitListener;Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V

    return-void
.end method

.method public isInit()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->e:Lcom/jieli/jl_fatfs/FatFileSystem;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public listWatchList(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Ljava/util/ArrayList<",
            "Lcom/jieli/jl_fatfs/model/FatFile;",
            ">;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->e:Lcom/jieli/jl_fatfs/FatFileSystem;

    if-nez v0, :cond_0

    const/16 v0, 0x16

    invoke-virtual {p0, p1, v0}, Lcom/jieli/jl_rcsp/watch/WatchBase;->onCallbackError(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;I)V

    return-void

    :cond_0
    new-instance v1, Lcom/android/mltcode/paycertificationapi/XXIXXXXI;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/XXIXXXXI;-><init>(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    const-string p1, "/"

    invoke-virtual {v0, p1, v1}, Lcom/jieli/jl_fatfs/FatFileSystem;->listFatDir(Ljava/lang/String;Lcom/jieli/jl_fatfs/interfaces/OnFatFsOpResultListener;)V

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

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->e:Lcom/jieli/jl_fatfs/FatFileSystem;

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/android/mltcode/paycertificationapi/I00OXO0ii;

    invoke-direct {v1, p2}, Lcom/android/mltcode/paycertificationapi/I00OXO0ii;-><init>(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    invoke-virtual {v0, p1, v1}, Lcom/jieli/jl_fatfs/FatFileSystem;->openFatFile(Ljava/lang/String;Lcom/jieli/jl_fatfs/interfaces/OnFatFsOpResultListener;)V

    return-void

    :cond_1
    :goto_0
    if-eqz p2, :cond_2

    new-instance p1, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/16 v0, 0x1001

    const-string v1, "param is error."

    invoke-direct {p1, v0, v1}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(ILjava/lang/String;)V

    invoke-interface {p2, p1}, Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    :cond_2
    return-void
.end method

.method public replaceWatchFile(Ljava/lang/String;Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->e:Lcom/jieli/jl_fatfs/FatFileSystem;

    if-nez v0, :cond_0

    if-eqz p2, :cond_1

    const/16 p1, 0x16

    invoke-interface {p2, p1}, Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;->onStop(I)V

    return-void

    :cond_0
    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/WatchFileUtil;->isFileExist(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    if-eqz p2, :cond_1

    const/4 p1, 0x5

    invoke-interface {p2, p1}, Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;->onStop(I)V

    :cond_1
    return-void

    :cond_2
    new-instance v0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$6;

    invoke-direct {v0, p0, p1, p2}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$6;-><init>(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;Ljava/lang/String;Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/jieli/jl_rcsp/watch/WatchBase;->jumpToUpdateResource(ZLcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    return-void
.end method

.method public restoreWatchSystem(Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V
    .locals 3

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "start. progressListener = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "restoreWatchSystem"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$2;

    invoke-direct {v0, p0}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$2;-><init>(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;)V

    new-instance v1, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;

    const/4 v2, 0x4

    invoke-direct {v1, p0, v2, p1}, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;-><init>(Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;ILcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V

    invoke-virtual {p0, v0, v1}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->a(Lcom/jieli/jl_fatfs/interfaces/OnFatFsInitListener;Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "OnFatFileProgressListener can not be empty."

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public updateWatchResource(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnUpdateResourceCallback;)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->e:Lcom/jieli/jl_fatfs/FatFileSystem;

    if-nez v0, :cond_1

    if-eqz p2, :cond_0

    const/16 p1, 0x16

    invoke-static {p1}, Lcom/jieli/jl_fatfs/utils/FatUtil;->getFatFsErrorCodeMsg(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, p1, v0}, Lcom/jieli/jl_rcsp/interfaces/watch/OnUpdateResourceCallback;->onError(ILjava/lang/String;)V

    :cond_0
    return-void

    :cond_1
    new-instance v1, Lcom/android/mltcode/paycertificationapi/i1O0IX;

    invoke-direct {v1, p0, p2, p1}, Lcom/android/mltcode/paycertificationapi/i1O0IX;-><init>(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;Lcom/jieli/jl_rcsp/interfaces/watch/OnUpdateResourceCallback;Ljava/lang/String;)V

    const-string p1, "/"

    invoke-virtual {v0, p1, v1}, Lcom/jieli/jl_fatfs/FatFileSystem;->listFatDir(Ljava/lang/String;Lcom/jieli/jl_fatfs/interfaces/OnFatFsOpResultListener;)V

    return-void
.end method
