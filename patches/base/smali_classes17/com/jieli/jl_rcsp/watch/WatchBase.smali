.class public abstract Lcom/jieli/jl_rcsp/watch/WatchBase;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_rcsp/watch/WatchBase$HandleRcspCallback;,
        Lcom/jieli/jl_rcsp/watch/WatchBase$ExternalFlashIOCtrlBooleanResult;,
        Lcom/jieli/jl_rcsp/watch/WatchBase$RcspBooleanResult;,
        Lcom/jieli/jl_rcsp/watch/WatchBase$ExternalFlashIOCtrlHandleResult;
    }
.end annotation


# static fields
.field public static final c:I

.field public static final d:[B


# instance fields
.field protected TAG:Ljava/lang/String;

.field public a:Lcom/jieli/jl_rcsp/tool/SyncMessageTask;

.field public final b:Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;

.field protected volatile isOTAResource:Z

.field protected isSysException:Z

.field protected final mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

.field protected final mStatusManager:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

.field protected final mWatchCallbackManager:Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x15

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lcom/jieli/jl_rcsp/watch/WatchBase;->d:[B

    return-void

    :array_0
    .array-data 1
        0x1ft
        0x0t
        0x1ft
        0x0t
        0x7ft
        0x0t
        0x2t
        0x0t
        0x3t
        0x2t
        0x1t
        0x3t
        0x2t
        0x2t
        0x0t
        0x2t
        -0x2t
        0x1ft
        0x2t
        -0x1t
        -0x1t
    .end array-data
.end method

.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->TAG:Ljava/lang/String;

    invoke-static {}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getInstance()Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->mStatusManager:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->isSysException:Z

    new-instance v0, Lcom/jieli/jl_rcsp/watch/WatchBase$12;

    invoke-direct {v0, p0}, Lcom/jieli/jl_rcsp/watch/WatchBase$12;-><init>(Lcom/jieli/jl_rcsp/watch/WatchBase;)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->b:Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;

    iput-object p1, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    iput-object p2, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->mWatchCallbackManager:Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->registerOnRcspCallback(Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/watch/WatchBase;)Lcom/jieli/jl_rcsp/tool/SyncMessageTask;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->a:Lcom/jieli/jl_rcsp/tool/SyncMessageTask;

    return-object p0
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/watch/WatchBase;Lcom/jieli/jl_rcsp/tool/SyncMessageTask;)Lcom/jieli/jl_rcsp/tool/SyncMessageTask;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->a:Lcom/jieli/jl_rcsp/tool/SyncMessageTask;

    return-object p1
.end method

.method public static synthetic b(Lcom/jieli/jl_rcsp/watch/WatchBase;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/watch/WatchBase;->a()V

    return-void
.end method

.method public static queryExtFlashMsgForDevice(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_rcsp/impl/RcspOpImpl;",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;",
            ">;)V"
        }
    .end annotation

    if-nez p0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getTargetDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-static {}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildGetExternalFlashMsgCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;

    new-instance v3, Lcom/jieli/jl_rcsp/watch/WatchBase$10;

    invoke-direct {v3}, Lcom/jieli/jl_rcsp/watch/WatchBase$10;-><init>()V

    const-string v4, "queryExtFlashMsgForDevice"

    invoke-direct {v2, v4, p1, v3}, Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;Lcom/jieli/jl_rcsp/interfaces/IHandleResult;)V

    invoke-virtual {p0, v0, v1, v2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->a:Lcom/jieli/jl_rcsp/tool/SyncMessageTask;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->exit()V

    :cond_0
    return-void
.end method

.method public final b()V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->a:Lcom/jieli/jl_rcsp/tool/SyncMessageTask;

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    new-instance v2, Lcom/jieli/jl_rcsp/watch/WatchBase$11;

    invoke-direct {v2, p0}, Lcom/jieli/jl_rcsp/watch/WatchBase$11;-><init>(Lcom/jieli/jl_rcsp/watch/WatchBase;)V

    invoke-direct {v0, v1, v2}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Lcom/jieli/jl_rcsp/interfaces/listener/ThreadStateListener;)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->a:Lcom/jieli/jl_rcsp/tool/SyncMessageTask;

    .line 4
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->start()V

    :cond_0
    return-void
.end method

.method public callbackError(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "TT;>;I)V"
        }
    .end annotation

    .line 1
    invoke-static {p2}, Lcom/jieli/jl_fatfs/utils/FatUtil;->getFatFsErrorCodeMsg(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0}, Lcom/jieli/jl_rcsp/watch/WatchBase;->callbackError(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;ILjava/lang/String;)V

    return-void
.end method

.method public callbackError(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;ILjava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "TT;>;I",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 2
    new-instance v0, Lcom/jieli/jl_rcsp/model/base/BaseError;

    invoke-direct {v0, p2, p3}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(ILjava/lang/String;)V

    invoke-interface {p1, v0}, Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    :cond_0
    return-void
.end method

.method public createFileStart(Ljava/lang/String;ILcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/watch/WatchBase;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-static {p1, p2}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildExternalFlashInsertNewFileStartCmd(Ljava/lang/String;I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    new-instance p2, Lcom/jieli/jl_rcsp/watch/WatchBase$HandleRcspCallback;

    new-instance v2, Lcom/jieli/jl_rcsp/watch/WatchBase$ExternalFlashIOCtrlBooleanResult;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lcom/jieli/jl_rcsp/watch/WatchBase$ExternalFlashIOCtrlBooleanResult;-><init>(Lcom/jieli/jl_rcsp/watch/WatchBase$1;)V

    const-string v3, "createFileStart"

    invoke-direct {p2, v3, p3, v2}, Lcom/jieli/jl_rcsp/watch/WatchBase$HandleRcspCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;Lcom/jieli/jl_rcsp/interfaces/IHandleResult;)V

    invoke-virtual {v0, v1, p1, p2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public deleteFileStart(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/watch/WatchBase;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildExternalFlashDeleteFileStartCmd(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    new-instance v2, Lcom/jieli/jl_rcsp/watch/WatchBase$HandleRcspCallback;

    new-instance v3, Lcom/jieli/jl_rcsp/watch/WatchBase$ExternalFlashIOCtrlBooleanResult;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Lcom/jieli/jl_rcsp/watch/WatchBase$ExternalFlashIOCtrlBooleanResult;-><init>(Lcom/jieli/jl_rcsp/watch/WatchBase$1;)V

    const-string v4, "deleteFileStart"

    invoke-direct {v2, v4, p2, v3}, Lcom/jieli/jl_rcsp/watch/WatchBase$HandleRcspCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;Lcom/jieli/jl_rcsp/interfaces/IHandleResult;)V

    invoke-virtual {v0, v1, p1, v2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public destroy()V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->b:Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->unregisterOnRcspCallback(Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;)V

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/watch/WatchBase;->a()V

    return-void
.end method

.method public enableCustomWatchBg(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Lcom/jieli/jl_fatfs/model/FatFile;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/watch/WatchBase;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildExternalFlashEnableCustomWatchCmd(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v2

    new-instance v3, Lcom/jieli/jl_rcsp/watch/WatchBase$HandleRcspCallback;

    new-instance v4, Lcom/jieli/jl_rcsp/watch/WatchBase$3;

    invoke-direct {v4, p0, p1}, Lcom/jieli/jl_rcsp/watch/WatchBase$3;-><init>(Lcom/jieli/jl_rcsp/watch/WatchBase;Ljava/lang/String;)V

    const-string p1, "enableCustomWatchBg"

    invoke-direct {v3, p1, p2, v4}, Lcom/jieli/jl_rcsp/watch/WatchBase$HandleRcspCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;Lcom/jieli/jl_rcsp/interfaces/IHandleResult;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public getCallback()Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->mWatchCallbackManager:Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;

    return-object v0
.end method

.method public getConnectedDevice()Landroid/bluetooth/BluetoothDevice;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getTargetDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    return-object v0
.end method

.method public getCurrentWatchInfo(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Lcom/jieli/jl_fatfs/model/FatFile;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/watch/WatchBase;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-static {}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildExternalFlashGetCurrentWatchMsgCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v2

    new-instance v3, Lcom/jieli/jl_rcsp/watch/WatchBase$HandleRcspCallback;

    new-instance v4, Lcom/jieli/jl_rcsp/watch/WatchBase$1;

    invoke-direct {v4, p0}, Lcom/jieli/jl_rcsp/watch/WatchBase$1;-><init>(Lcom/jieli/jl_rcsp/watch/WatchBase;)V

    const-string v5, "getCurrentWatchInfo"

    invoke-direct {v3, v5, p1, v4}, Lcom/jieli/jl_rcsp/watch/WatchBase$HandleRcspCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;Lcom/jieli/jl_rcsp/interfaces/IHandleResult;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public getCustomWatchBgInfo(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_1

    if-eqz p2, :cond_0

    new-instance p1, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/16 v0, 0x1001

    const-string v1, "fat file path is null."

    invoke-direct {p1, v0, v1}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(ILjava/lang/String;)V

    invoke-interface {p2, p1}, Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/watch/WatchBase;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildExternalFlashGetCustomBgInfoCmd(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    new-instance v2, Lcom/jieli/jl_rcsp/watch/WatchBase$HandleRcspCallback;

    new-instance v3, Lcom/jieli/jl_rcsp/watch/WatchBase$5;

    invoke-direct {v3, p0}, Lcom/jieli/jl_rcsp/watch/WatchBase$5;-><init>(Lcom/jieli/jl_rcsp/watch/WatchBase;)V

    const-string v4, "getCustomWatchBgInfo"

    invoke-direct {v2, v4, p2, v3}, Lcom/jieli/jl_rcsp/watch/WatchBase$HandleRcspCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;Lcom/jieli/jl_rcsp/interfaces/IHandleResult;)V

    invoke-virtual {v0, v1, p1, v2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public getExternalFlashMsg(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->mStatusManager:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getExtFlashMsg(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;

    move-result-object p1

    return-object p1
.end method

.method public getRcspOp()Lcom/jieli/jl_rcsp/impl/RcspOpImpl;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    return-object v0
.end method

.method public bridge synthetic getRcspOp()Lcom/jieli/jl_rcsp/interfaces/rcsp/IRcspOp;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/watch/WatchBase;->getRcspOp()Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    move-result-object v0

    return-object v0
.end method

.method public getWatchConfigure(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/WatchConfigure;
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->mStatusManager:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getDeviceConfigure(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;->getType()I

    move-result v0

    if-nez v0, :cond_1

    instance-of v0, p1, Lcom/jieli/jl_rcsp/model/WatchConfigure;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/jieli/jl_rcsp/model/WatchConfigure;

    goto :goto_0

    :cond_0
    :try_start_0
    new-instance v0, Lcom/jieli/jl_rcsp/model/WatchConfigure;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;->getVersion()I

    move-result v1

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;->getData()[B

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/jieli/jl_rcsp/model/WatchConfigure;-><init>(I[B)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    move-object p1, v0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_2

    new-instance p1, Lcom/jieli/jl_rcsp/model/WatchConfigure;

    sget-object v0, Lcom/jieli/jl_rcsp/watch/WatchBase;->d:[B

    const/4 v1, 0x0

    invoke-direct {p1, v1, v0}, Lcom/jieli/jl_rcsp/model/WatchConfigure;-><init>(I[B)V

    :cond_2
    return-object p1
.end method

.method public getWatchMessage(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_1

    if-eqz p2, :cond_0

    new-instance p1, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/16 v0, 0x1001

    const-string v1, "fat file path is null."

    invoke-direct {p1, v0, v1}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(ILjava/lang/String;)V

    invoke-interface {p2, p1}, Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/watch/WatchBase;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildExternalFlashGetWatchVersionCmd(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    new-instance v2, Lcom/jieli/jl_rcsp/watch/WatchBase$HandleRcspCallback;

    new-instance v3, Lcom/jieli/jl_rcsp/watch/WatchBase$6;

    invoke-direct {v3, p0}, Lcom/jieli/jl_rcsp/watch/WatchBase$6;-><init>(Lcom/jieli/jl_rcsp/watch/WatchBase;)V

    const-string v4, "getWatchMessage"

    invoke-direct {v2, v4, p2, v3}, Lcom/jieli/jl_rcsp/watch/WatchBase$HandleRcspCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;Lcom/jieli/jl_rcsp/interfaces/IHandleResult;)V

    invoke-virtual {v0, v1, p1, v2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public isOTAResource()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->isOTAResource:Z

    return v0
.end method

.method public isSysException()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->isSysException:Z

    return v0
.end method

.method public jumpToUpdateResource(ZLcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getTargetDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildExternalFlashUpdateResourceCmd(Z)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    new-instance v2, Lcom/jieli/jl_rcsp/watch/WatchBase$HandleRcspCallback;

    new-instance v3, Lcom/jieli/jl_rcsp/watch/WatchBase$ExternalFlashIOCtrlBooleanResult;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Lcom/jieli/jl_rcsp/watch/WatchBase$ExternalFlashIOCtrlBooleanResult;-><init>(Lcom/jieli/jl_rcsp/watch/WatchBase$1;)V

    const-string v4, "jumpToUpdateResource"

    invoke-direct {v2, v4, p2, v3}, Lcom/jieli/jl_rcsp/watch/WatchBase$HandleRcspCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;Lcom/jieli/jl_rcsp/interfaces/IHandleResult;)V

    invoke-virtual {v0, v1, p1, v2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public onCallbackError(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "TT;>;I)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    new-instance v0, Lcom/jieli/jl_rcsp/model/base/BaseError;

    invoke-static {p2}, Lcom/jieli/jl_rcsp/constant/WatchError;->getErrorDesc(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p2, v1}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(ILjava/lang/String;)V

    invoke-interface {p1, v0}, Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    :cond_0
    return-void
.end method

.method public pushMessageInfo(Lcom/jieli/jl_rcsp/model/NotificationMsg;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_rcsp/model/NotificationMsg;",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->isRcspInit()Z

    move-result v0

    if-nez v0, :cond_0

    const/16 p1, 0x2000

    invoke-virtual {p0, p2, p1}, Lcom/jieli/jl_rcsp/watch/WatchBase;->callbackError(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;I)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/watch/WatchBase;->b()V

    new-instance v0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$SyncTask;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p1, p2}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$SyncTask;-><init>(ILcom/jieli/jl_rcsp/model/NotificationMsg;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    iget-object p1, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->a:Lcom/jieli/jl_rcsp/tool/SyncMessageTask;

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->putNotification(Lcom/jieli/jl_rcsp/tool/SyncMessageTask$SyncTask;)V

    return-void
.end method

.method public queryExtFlashMsg(Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-static {v0, p1}, Lcom/jieli/jl_rcsp/watch/WatchBase;->queryExtFlashMsgForDevice(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    return-void
.end method

.method public registerOnWatchCallback(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->mWatchCallbackManager:Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->registerWatchCallback(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;)V

    return-void
.end method

.method public removeMessageInfo(Lcom/jieli/jl_rcsp/model/NotificationMsg;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_rcsp/model/NotificationMsg;",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->isRcspInit()Z

    move-result v0

    if-nez v0, :cond_0

    const/16 p1, 0x2000

    invoke-virtual {p0, p2, p1}, Lcom/jieli/jl_rcsp/watch/WatchBase;->callbackError(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;I)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/watch/WatchBase;->b()V

    new-instance v0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$SyncTask;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1, p2}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$SyncTask;-><init>(ILcom/jieli/jl_rcsp/model/NotificationMsg;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    iget-object p1, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->a:Lcom/jieli/jl_rcsp/tool/SyncMessageTask;

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->putNotification(Lcom/jieli/jl_rcsp/tool/SyncMessageTask$SyncTask;)V

    return-void
.end method

.method public requestDeviceConfigure(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Lcom/jieli/jl_rcsp/model/WatchConfigure;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/watch/WatchBase;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    iget-object v1, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->mStatusManager:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    invoke-virtual {v1, v0}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getDeviceConfigure(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;

    move-result-object v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-static {}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildGetDevConfigureCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v2

    new-instance v3, Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;

    new-instance v4, Lcom/jieli/jl_rcsp/watch/WatchBase$8;

    invoke-direct {v4, p0, v0, p1}, Lcom/jieli/jl_rcsp/watch/WatchBase$8;-><init>(Lcom/jieli/jl_rcsp/watch/WatchBase;Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    new-instance p1, Lcom/jieli/jl_rcsp/watch/WatchBase$9;

    invoke-direct {p1, p0}, Lcom/jieli/jl_rcsp/watch/WatchBase$9;-><init>(Lcom/jieli/jl_rcsp/watch/WatchBase;)V

    const-string v5, "requestDeviceConfigure"

    invoke-direct {v3, v5, v4, p1}, Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;Lcom/jieli/jl_rcsp/interfaces/IHandleResult;)V

    invoke-virtual {v1, v0, v2, v3}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/watch/WatchBase;->getWatchConfigure(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/WatchConfigure;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;->onSuccess(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public requestDevicePower(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/watch/WatchBase;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v2}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildGetPublicSysInfoCmd(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v2

    new-instance v3, Lcom/jieli/jl_rcsp/watch/WatchBase$HandleRcspCallback;

    new-instance v4, Lcom/jieli/jl_rcsp/watch/WatchBase$RcspBooleanResult;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Lcom/jieli/jl_rcsp/watch/WatchBase$RcspBooleanResult;-><init>(Lcom/jieli/jl_rcsp/watch/WatchBase$1;)V

    const-string v5, "requestDevicePower"

    invoke-direct {v3, v5, p1, v4}, Lcom/jieli/jl_rcsp/watch/WatchBase$HandleRcspCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;Lcom/jieli/jl_rcsp/interfaces/IHandleResult;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public sendWriteProtectFlag(ZLcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/watch/WatchBase;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildExternalFlashWriteProtectCmd(Z)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v2

    new-instance v3, Lcom/jieli/jl_rcsp/watch/WatchBase$HandleRcspCallback;

    new-instance v4, Lcom/jieli/jl_rcsp/watch/WatchBase$7;

    invoke-direct {v4, p0, p1}, Lcom/jieli/jl_rcsp/watch/WatchBase$7;-><init>(Lcom/jieli/jl_rcsp/watch/WatchBase;Z)V

    const-string p1, "sendWriteProtectFlag"

    invoke-direct {v3, p1, p2, v4}, Lcom/jieli/jl_rcsp/watch/WatchBase$HandleRcspCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;Lcom/jieli/jl_rcsp/interfaces/IHandleResult;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public setCurrentWatchInfo(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Lcom/jieli/jl_fatfs/model/FatFile;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/watch/WatchBase;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildExternalFlashSetWatchCmd(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v2

    new-instance v3, Lcom/jieli/jl_rcsp/watch/WatchBase$HandleRcspCallback;

    new-instance v4, Lcom/jieli/jl_rcsp/watch/WatchBase$2;

    invoke-direct {v4, p0, p1}, Lcom/jieli/jl_rcsp/watch/WatchBase$2;-><init>(Lcom/jieli/jl_rcsp/watch/WatchBase;Ljava/lang/String;)V

    const-string p1, "setCurrentWatchInfo"

    invoke-direct {v3, p1, p2, v4}, Lcom/jieli/jl_rcsp/watch/WatchBase$HandleRcspCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;Lcom/jieli/jl_rcsp/interfaces/IHandleResult;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public setOTAResource(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->isOTAResource:Z

    return-void
.end method

.method public setSysException(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->isSysException:Z

    return-void
.end method

.method public syncWeatherInfo(Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Weather;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Weather;",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_1

    if-eqz p2, :cond_0

    new-instance p1, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/16 v0, 0x1001

    const-string v1, "Weather is null."

    invoke-direct {p1, v0, v1}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(ILjava/lang/String;)V

    invoke-interface {p2, p1}, Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    :cond_0
    return-void

    :cond_1
    new-instance v0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Param;

    invoke-direct {v0, p1}, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Param;-><init>(Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$BaseInfo;)V

    new-instance p1, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd;

    invoke-direct {p1, v0}, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Param;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/watch/WatchBase;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/watch/WatchBase$HandleRcspCallback;

    new-instance v3, Lcom/jieli/jl_rcsp/watch/WatchBase$RcspBooleanResult;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Lcom/jieli/jl_rcsp/watch/WatchBase$RcspBooleanResult;-><init>(Lcom/jieli/jl_rcsp/watch/WatchBase$1;)V

    const-string v4, "syncWeatherInfo"

    invoke-direct {v2, v4, p2, v3}, Lcom/jieli/jl_rcsp/watch/WatchBase$HandleRcspCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;Lcom/jieli/jl_rcsp/interfaces/IHandleResult;)V

    invoke-virtual {v0, v1, p1, v2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public unregisterOnWatchCallback(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->mWatchCallbackManager:Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->unregisterWatchCallback(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;)V

    return-void
.end method

.method public writeResourceOTAFlag(ZLcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getTargetDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildExternalFlashOTAResourceCmd(Z)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v2

    new-instance v3, Lcom/jieli/jl_rcsp/watch/WatchBase$HandleRcspCallback;

    new-instance v4, Lcom/jieli/jl_rcsp/watch/WatchBase$4;

    invoke-direct {v4, p0, p1}, Lcom/jieli/jl_rcsp/watch/WatchBase$4;-><init>(Lcom/jieli/jl_rcsp/watch/WatchBase;Z)V

    const-string p1, "writeResourceOTAFlag"

    invoke-direct {v3, p1, p2, v4}, Lcom/jieli/jl_rcsp/watch/WatchBase$HandleRcspCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;Lcom/jieli/jl_rcsp/interfaces/IHandleResult;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method
