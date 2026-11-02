.class public abstract Lcom/jieli/jl_rcsp/task/TaskBase;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/task/ITask;


# static fields
.field public static final ERR_BUSY:I = 0x1100

.field public static final ERR_COMMAND_RESPONSE:I = 0x3004

.field public static final ERR_CRC_CHECK:I = 0x3100

.field public static final ERR_DEVICE_IN_CALL:I = 0x3101

.field public static final ERR_DEVICE_NOT_CONNECT:I = 0x2000

.field public static final ERR_FUNC_NOT_SUPPORT:I = 0x1101

.field public static final ERR_IO_EXCEPTION:I = 0x4005

.field public static final ERR_MISSING_DATA:I = 0x4003

.field public static final ERR_NO_TARGET_STORAGE:I = 0x4000

.field public static final ERR_PARAM:I = 0x1001

.field public static final ERR_RENAME:I = 0x4202

.field public static final ERR_WAIT_DATA_TIMEOUT:I = 0x3002

.field protected static final MSG_WAITING_FOR_DATA_TIMEOUT:I = 0x1122

.field protected static TIMEOUT:I = 0x4e20


# instance fields
.field public volatile a:Z

.field protected listener:Lcom/jieli/jl_rcsp/task/TaskListener;

.field protected final mDeviceStatusManager:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

.field protected final mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

.field protected final tag:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-static {}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getInstance()Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    move-result-object p1

    iput-object p1, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mDeviceStatusManager:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "RcspOpImpl can not be null."

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public buildResponseBadResult(II)Lcom/jieli/jl_rcsp/model/base/BaseError;
    .locals 2

    const/16 v0, 0x3005

    const/4 v1, 0x0

    invoke-static {p1, v0, p2, v1}, Lcom/jieli/jl_rcsp/constant/RcspErrorCode;->buildJsonError(IIILjava/lang/String;)Lcom/jieli/jl_rcsp/model/base/BaseError;

    move-result-object p1

    return-object p1
.end method

.method public buildResponseBadState(II)Lcom/jieli/jl_rcsp/model/base/BaseError;
    .locals 2

    const/16 v0, 0x3004

    const/4 v1, 0x0

    invoke-static {p1, v0, p2, v1}, Lcom/jieli/jl_rcsp/constant/RcspErrorCode;->buildJsonError(IIILjava/lang/String;)Lcom/jieli/jl_rcsp/model/base/BaseError;

    move-result-object p1

    return-object p1
.end method

.method public callbackBegin()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->a:Z

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->listener:Lcom/jieli/jl_rcsp/task/TaskListener;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/jieli/jl_rcsp/task/TaskListener;->onBegin()V

    :cond_0
    return-void
.end method

.method public callbackCancel(I)V
    .locals 3

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->a:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->a:Z

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "reason : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "callbackCancel"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->listener:Lcom/jieli/jl_rcsp/task/TaskListener;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lcom/jieli/jl_rcsp/task/TaskListener;->onCancel(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public callbackError(I)V
    .locals 1

    .line 1
    invoke-static {p1}, Lcom/jieli/jl_rcsp/constant/WatchError;->getErrorDesc(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/jieli/jl_rcsp/task/TaskBase;->callbackError(ILjava/lang/String;)V

    return-void
.end method

.method public callbackError(ILjava/lang/String;)V
    .locals 3

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->a:Z

    .line 3
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v1, v2, p2}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "code : %d(0x%X), %s"

    invoke-static {v2, v1}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "callbackError"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->listener:Lcom/jieli/jl_rcsp/task/TaskListener;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lcom/jieli/jl_rcsp/task/TaskListener;->onError(ILjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public callbackFinish()V
    .locals 3

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->a:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->a:Z

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->tag:Ljava/lang/String;

    const-string v1, "callbackFinish"

    const-string v2, "Success"

    invoke-static {v0, v1, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->listener:Lcom/jieli/jl_rcsp/task/TaskListener;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/jieli/jl_rcsp/task/TaskListener;->onFinish()V

    :cond_1
    :goto_0
    return-void
.end method

.method public callbackProgress(I)V
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->a:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->listener:Lcom/jieli/jl_rcsp/task/TaskListener;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lcom/jieli/jl_rcsp/task/TaskListener;->onProgress(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public getConnectedDevice()Landroid/bluetooth/BluetoothDevice;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-interface {v0}, Lcom/jieli/jl_rcsp/interfaces/bluetooth/IBluetoothProxy;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    return-object v0
.end method

.method public isDeviceInCalling()Z
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getDeviceInfo()Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->getPhoneStatus()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isFileTransfer()Z
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mDeviceStatusManager:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->isFileTransfer(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    return v0
.end method

.method public isRun()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->a:Z

    return v0
.end method

.method public setListener(Lcom/jieli/jl_rcsp/task/TaskListener;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->listener:Lcom/jieli/jl_rcsp/task/TaskListener;

    return-void
.end method
