.class public Lcom/jieli/jl_rcsp/task/GetFileByClusterTask;
.super Lcom/jieli/jl_rcsp/task/GetFileTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_rcsp/task/GetFileByClusterTask$Param;
    }
.end annotation


# instance fields
.field public final n:Lcom/jieli/jl_rcsp/task/GetFileByClusterTask$Param;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Lcom/jieli/jl_rcsp/task/GetFileByClusterTask$Param;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    invoke-static {p2}, Lcom/jieli/jl_rcsp/task/GetFileByClusterTask;->a(Lcom/jieli/jl_rcsp/task/GetFileByClusterTask$Param;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/jieli/jl_rcsp/task/GetFileTask;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/jieli/jl_rcsp/task/GetFileByClusterTask;->n:Lcom/jieli/jl_rcsp/task/GetFileByClusterTask$Param;

    return-void
.end method

.method public static a(Lcom/jieli/jl_rcsp/task/GetFileByClusterTask$Param;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    if-eqz p0, :cond_0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/task/GetFileByClusterTask$Param;->outPath:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/RuntimeException;

    const-string v0, "GetFileByClusterTask.Param can not be null"

    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public createParam(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$Param;
    .locals 3

    new-instance p1, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$StartWithClusterParam;

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/GetFileByClusterTask;->n:Lcom/jieli/jl_rcsp/task/GetFileByClusterTask$Param;

    iget v1, v0, Lcom/jieli/jl_rcsp/task/GetFileByClusterTask$Param;->devHandler:I

    iget v2, v0, Lcom/jieli/jl_rcsp/task/GetFileByClusterTask$Param;->offset:I

    iget v0, v0, Lcom/jieli/jl_rcsp/task/GetFileByClusterTask$Param;->cluster:I

    invoke-direct {p1, v1, v2, v0}, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$StartWithClusterParam;-><init>(III)V

    return-object p1
.end method
