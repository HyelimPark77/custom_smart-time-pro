.class Lcom/jieli/jl_rcsp/task/GetFileTask$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/task/GetFileTask;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
        "Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$StartResponse;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_rcsp/task/GetFileTask;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/task/GetFileTask;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/task/GetFileTask$1;->a:Lcom/jieli/jl_rcsp/task/GetFileTask;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/GetFileTask$1;->a:Lcom/jieli/jl_rcsp/task/GetFileTask;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getSubCode()I

    move-result v1

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lcom/jieli/jl_rcsp/task/GetFileTask;->a(Lcom/jieli/jl_rcsp/task/GetFileTask;ILjava/lang/String;)V

    return-void
.end method

.method public onSuccess(Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$StartResponse;)V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/GetFileTask$1;->a:Lcom/jieli/jl_rcsp/task/GetFileTask;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/task/GetFileTask;->a(Lcom/jieli/jl_rcsp/task/GetFileTask;)Lcom/jieli/jl_rcsp/task/GetFileTask$Param;

    move-result-object v0

    iget p1, p1, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$StartResponse;->size:I

    iput p1, v0, Lcom/jieli/jl_rcsp/task/GetFileTask$Param;->totalSize:I

    .line 3
    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/GetFileTask$1;->a:Lcom/jieli/jl_rcsp/task/GetFileTask;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/task/GetFileTask;->a(Lcom/jieli/jl_rcsp/task/GetFileTask;)Lcom/jieli/jl_rcsp/task/GetFileTask$Param;

    move-result-object p1

    const/4 v0, 0x0

    iput-short v0, p1, Lcom/jieli/jl_rcsp/task/GetFileTask$Param;->lastCrc:S

    .line 4
    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/GetFileTask$1;->a:Lcom/jieli/jl_rcsp/task/GetFileTask;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/task/GetFileTask;->b(Lcom/jieli/jl_rcsp/task/GetFileTask;)Landroid/os/Handler;

    move-result-object p1

    const/16 v0, 0x1122

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeMessages(I)V

    .line 5
    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/GetFileTask$1;->a:Lcom/jieli/jl_rcsp/task/GetFileTask;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/task/GetFileTask;->b(Lcom/jieli/jl_rcsp/task/GetFileTask;)Landroid/os/Handler;

    move-result-object p1

    sget v1, Lcom/jieli/jl_rcsp/task/TaskBase;->TIMEOUT:I

    int-to-long v1, v1

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$StartResponse;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/task/GetFileTask$1;->onSuccess(Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$StartResponse;)V

    return-void
.end method
