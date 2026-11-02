.class Lcom/jieli/jl_rcsp/watch/WatchProgressHandler$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
        "Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler$2;->a:Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(I)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler$2;->a:Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->f(Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->a(Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;I)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler$2;->a:Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->d(Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;)Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;

    move-result-object v0

    invoke-interface {v0}, Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;->getCallback()Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;

    move-result-object v0

    iget-object v1, p0, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler$2;->a:Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;

    invoke-static {v1}, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->a(Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;)Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    move-result-object v1

    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getTargetDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;->onWatchSystemException(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 3

    invoke-static {}, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->a()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onFailed = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "handleWatchSysException"

    invoke-static {v0, v1, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler$2;->a:Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->f(Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;)I

    move-result v0

    invoke-static {p1, v0}, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->a(Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;I)V

    return-void
.end method

.method public onSuccess(Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;)V
    .locals 4

    .line 2
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->getSysStatus()I

    move-result p1

    .line 3
    invoke-static {}, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->a()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SysStatus = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "handleWatchSysException"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-nez p1, :cond_0

    .line 4
    iget-object p1, p0, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler$2;->a:Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->c(Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;)V

    return-void

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler$2;->a:Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->d(Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;)Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;

    move-result-object v0

    instance-of v0, v0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;

    if-eqz v0, :cond_1

    .line 6
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler$2;->a:Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->d(Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;)Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;

    move-result-object v0

    check-cast v0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->destroyFatFileSystem()V

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler$2;->a:Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->e(Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/jieli/jl_rcsp/watch/OXO1;

    invoke-direct {v1, p0, p1}, Lcom/jieli/jl_rcsp/watch/OXO1;-><init>(Lcom/jieli/jl_rcsp/watch/WatchProgressHandler$2;I)V

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler$2;->onSuccess(Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;)V

    return-void
.end method
