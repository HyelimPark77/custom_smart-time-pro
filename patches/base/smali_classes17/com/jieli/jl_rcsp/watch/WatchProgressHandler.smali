.class public Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;


# static fields
.field public static final OP_CREATE_FILE:I = 0x1

.field public static final OP_DELETE_FILE:I = 0x2

.field public static final OP_REPLACE_FILE:I = 0x3

.field public static final OP_RESTORE_SYS:I = 0x4

.field public static final i:Ljava/lang/String; = "WatchProgressHandler"


# instance fields
.field public final a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

.field public final b:Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;

.field public final c:I

.field public final d:Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;

.field public final e:Landroid/os/Handler;

.field public f:I

.field public final g:Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback<",
            "Ljava/lang/Boolean;",
            "Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;ILcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->e:Landroid/os/Handler;

    const/4 v0, -0x1

    iput v0, p0, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->f:I

    new-instance v0, Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;

    new-instance v1, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler$3;

    invoke-direct {v1, p0}, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler$3;-><init>(Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;)V

    new-instance v2, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler$4;

    invoke-direct {v2, p0}, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler$4;-><init>(Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;)V

    const-string v3, "handleStopEvent"

    invoke-direct {v0, v3, v1, v2}, Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;Lcom/jieli/jl_rcsp/interfaces/IHandleResult;)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->g:Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;

    new-instance v0, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler$5;

    invoke-direct {v0, p0}, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler$5;-><init>(Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->h:Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;

    iput-object p1, p0, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->b:Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;

    invoke-interface {p1}, Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;->getRcspOp()Lcom/jieli/jl_rcsp/interfaces/rcsp/IRcspOp;

    move-result-object p1

    check-cast p1, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    iput-object p1, p0, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    iput p2, p0, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->c:I

    iput-object p3, p0, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->d:Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;)Lcom/jieli/jl_rcsp/impl/RcspOpImpl;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    return-object p0
.end method

.method public static synthetic a()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->i:Ljava/lang/String;

    return-object v0
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;I)V
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->a(I)V

    return-void
.end method

.method public static synthetic b(Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->c()V

    return-void
.end method

.method public static synthetic c(Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->b()V

    return-void
.end method

.method public static synthetic d(Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;)Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->b:Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;

    return-object p0
.end method

.method public static synthetic e(Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->e:Landroid/os/Handler;

    return-object p0
.end method

.method public static synthetic f(Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;)I
    .locals 0

    iget p0, p0, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->f:I

    return p0
.end method

.method public static synthetic g(Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;)I
    .locals 0

    iget p0, p0, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->c:I

    return p0
.end method

.method public static synthetic h(Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;)Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->h:Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;

    return-object p0
.end method


# virtual methods
.method public final a(I)V
    .locals 5

    .line 4
    invoke-static {p1}, Lcom/jieli/jl_rcsp/constant/WatchError;->fatfsToWatchErr(I)I

    move-result v0

    .line 5
    sget-object v1, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->i:Ljava/lang/String;

    .line 6
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v2, p1, v3, v4}, [Ljava/lang/Object;

    move-result-object p1

    .line 7
    const-string v2, "result : %d(0x%X), code = %d(0x%X)"

    invoke-static {v2, p1}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v2, "callbackOpStop"

    invoke-static {v1, v2, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    iget-object p1, p0, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->d:Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;

    if-eqz p1, :cond_0

    invoke-interface {p1, v0}, Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;->onStop(I)V

    :cond_0
    return-void
.end method

.method public final a(IZ)V
    .locals 5

    .line 9
    sget-object v0, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->i:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "result = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", isSysException : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "handleStopEventBySysException"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    iget-object v1, p0, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getDeviceInfo()Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v1

    .line 11
    iget v3, p0, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->c:I

    const/4 v4, 0x4

    if-eq v3, v4, :cond_2

    if-eqz p2, :cond_2

    if-nez v1, :cond_0

    goto :goto_0

    .line 12
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Obtain the current phone Status : "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->getPhoneStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v2, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->getPhoneStatus()I

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_1

    .line 14
    const-string p1, "add OnRcspEventListener, waiting for phone status."

    invoke-static {v0, v2, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    iget-object p1, p0, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    new-instance p2, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler$1;

    invoke-direct {p2, p0}, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler$1;-><init>(Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;)V

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->registerOnRcspEventListener(Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;)V

    return-void

    .line 16
    :cond_1
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->c()V

    return-void

    .line 17
    :cond_2
    :goto_0
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->a(I)V

    return-void
.end method

.method public final b()V
    .locals 4

    .line 2
    iget v0, p0, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->c:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    .line 3
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->b:Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->h:Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;

    invoke-interface {v0, v1, v2}, Lcom/jieli/jl_rcsp/interfaces/watch/IWatchOp;->jumpToUpdateResource(ZLcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getTargetDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-static {}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildExternalFlashDeleteFileEndCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v2

    iget-object v3, p0, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->g:Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;

    invoke-virtual {v0, v1, v2, v3}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getTargetDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-static {}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildExternalFlashInsertNewFileEndCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v2

    iget-object v3, p0, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->g:Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;

    invoke-virtual {v0, v1, v2, v3}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public final c()V
    .locals 3

    .line 2
    sget-object v0, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->i:Ljava/lang/String;

    const-string v1, "handleWatchSysException"

    const-string v2, "query system status by device."

    invoke-static {v0, v1, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    new-instance v1, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler$2;

    invoke-direct {v1, p0}, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler$2;-><init>(Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;)V

    invoke-static {v0, v1}, Lcom/jieli/jl_rcsp/watch/WatchBase;->queryExtFlashMsgForDevice(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    return-void
.end method

.method public onProgress(F)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->d:Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;->onProgress(F)V

    :cond_0
    return-void
.end method

.method public onStart(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->d:Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;->onStart(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onStop(I)V
    .locals 1

    iput p1, p0, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->f:I

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->b:Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;

    invoke-interface {v0}, Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;->isSysException()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->b:Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;

    invoke-interface {v0}, Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;->isSysException()Z

    move-result v0

    invoke-virtual {p0, p1, v0}, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->a(IZ)V

    return-void

    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->b:Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;

    instance-of p1, p1, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    if-eqz p1, :cond_2

    iget p1, p0, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->f:I

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->a(I)V

    return-void

    :cond_2
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->b()V

    return-void
.end method
