.class public Lcom/jieli/jl_rcsp/task/GetFileByNameTask;
.super Lcom/jieli/jl_rcsp/task/GetFileTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_rcsp/task/GetFileByNameTask$Param;
    }
.end annotation


# instance fields
.field public final n:Lcom/jieli/jl_rcsp/task/GetFileByNameTask$Param;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Lcom/jieli/jl_rcsp/task/GetFileByNameTask$Param;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    invoke-static {p2}, Lcom/jieli/jl_rcsp/task/GetFileByNameTask;->a(Lcom/jieli/jl_rcsp/task/GetFileByNameTask$Param;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/jieli/jl_rcsp/task/GetFileTask;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/jieli/jl_rcsp/task/GetFileByNameTask;->n:Lcom/jieli/jl_rcsp/task/GetFileByNameTask$Param;

    return-void
.end method

.method public static a(Lcom/jieli/jl_rcsp/task/GetFileByNameTask$Param;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    if-eqz p0, :cond_0

    invoke-static {p0}, Lcom/jieli/jl_rcsp/task/GetFileByNameTask$Param;->c(Lcom/jieli/jl_rcsp/task/GetFileByNameTask$Param;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/RuntimeException;

    const-string v0, "GetFileByNameTask.Param can not be null"

    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public createParam(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$Param;
    .locals 4

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object p1

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->isGetFileByNameWithDev()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/task/GetFileTask;->useCrc:Z

    new-instance p1, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$StartWithNameParam;

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/GetFileByNameTask;->n:Lcom/jieli/jl_rcsp/task/GetFileByNameTask$Param;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/task/GetFileByNameTask$Param;->a(Lcom/jieli/jl_rcsp/task/GetFileByNameTask$Param;)I

    move-result v0

    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/GetFileByNameTask;->n:Lcom/jieli/jl_rcsp/task/GetFileByNameTask$Param;

    iget-object v2, v1, Lcom/jieli/jl_rcsp/task/GetFileByNameTask$Param;->name:Ljava/lang/String;

    invoke-static {v1}, Lcom/jieli/jl_rcsp/task/GetFileByNameTask$Param;->b(Lcom/jieli/jl_rcsp/task/GetFileByNameTask$Param;)Z

    move-result v1

    invoke-direct {p1, v0, v2, v1}, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$StartWithNameParam;-><init>(ILjava/lang/String;Z)V

    return-object p1

    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/GetFileByNameTask;->n:Lcom/jieli/jl_rcsp/task/GetFileByNameTask$Param;

    iget v0, p1, Lcom/jieli/jl_rcsp/task/GetFileByNameTask$Param;->devHandler:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    new-instance v1, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$StartWithDevAndNameParam;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/task/GetFileByNameTask$Param;->a(Lcom/jieli/jl_rcsp/task/GetFileByNameTask$Param;)I

    move-result p1

    iget-object v2, p0, Lcom/jieli/jl_rcsp/task/GetFileByNameTask;->n:Lcom/jieli/jl_rcsp/task/GetFileByNameTask$Param;

    iget-object v3, v2, Lcom/jieli/jl_rcsp/task/GetFileByNameTask$Param;->name:Ljava/lang/String;

    invoke-static {v2}, Lcom/jieli/jl_rcsp/task/GetFileByNameTask$Param;->b(Lcom/jieli/jl_rcsp/task/GetFileByNameTask$Param;)Z

    move-result v2

    invoke-direct {v1, v0, p1, v3, v2}, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$StartWithDevAndNameParam;-><init>(IILjava/lang/String;Z)V

    return-object v1

    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "please set devHandler"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setName(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/GetFileByNameTask;->n:Lcom/jieli/jl_rcsp/task/GetFileByNameTask$Param;

    if-eqz v0, :cond_0

    iput-object p1, v0, Lcom/jieli/jl_rcsp/task/GetFileByNameTask$Param;->name:Ljava/lang/String;

    :cond_0
    return-void
.end method
