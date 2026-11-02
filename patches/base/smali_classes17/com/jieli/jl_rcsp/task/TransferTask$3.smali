.class Lcom/jieli/jl_rcsp/task/TransferTask$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/task/TransferTask;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_rcsp/task/TransferTask;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/task/TransferTask;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/task/TransferTask$3;->a:Lcom/jieli/jl_rcsp/task/TransferTask;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TransferTask$3;->a:Lcom/jieli/jl_rcsp/task/TransferTask;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getSubCode()I

    move-result v1

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lcom/jieli/jl_rcsp/task/TransferTask;->onError(ILjava/lang/String;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Boolean;)V
    .locals 0

    .line 2
    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/TransferTask$3;->a:Lcom/jieli/jl_rcsp/task/TransferTask;

    iget-object p1, p1, Lcom/jieli/jl_rcsp/task/TaskBase;->mRcspOp:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getDeviceInfo()Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 3
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->isSupportPackageCrc16()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/TransferTask$3;->a:Lcom/jieli/jl_rcsp/task/TransferTask;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/task/TransferTask;->d(Lcom/jieli/jl_rcsp/task/TransferTask;)V

    return-void

    .line 5
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/TransferTask$3;->a:Lcom/jieli/jl_rcsp/task/TransferTask;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/task/TransferTask;->c(Lcom/jieli/jl_rcsp/task/TransferTask;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/task/TransferTask$3;->onSuccess(Ljava/lang/Boolean;)V

    return-void
.end method
