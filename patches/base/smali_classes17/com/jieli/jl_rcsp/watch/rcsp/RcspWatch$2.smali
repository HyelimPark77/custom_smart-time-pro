.class Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->init()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
        "Lcom/jieli/jl_rcsp/model/WatchConfigure;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$2;->a:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 3

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$2;->a:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->y(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onFailed ---> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "init#requestDeviceConfigure"

    invoke-static {v0, v1, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$2;->a:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->a(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;Z)Z

    iget-object p1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$2;->a:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->v(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)V

    return-void
.end method

.method public onSuccess(Lcom/jieli/jl_rcsp/model/WatchConfigure;)V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$2;->a:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->a(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;Z)Z

    .line 3
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$2;->a:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->a(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "init#requestDeviceConfigure"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    .line 4
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/WatchConfigure;->getFunctionOption()Lcom/jieli/jl_rcsp/model/WatchConfigure$FunctionOption;

    move-result-object p1

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/WatchConfigure$FunctionOption;->isSupportNetworkModule()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 5
    iget-object p1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$2;->a:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->x(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    move-result-object p1

    invoke-static {p1}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->instance(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;)Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;

    move-result-object p1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$2;->a:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/watch/WatchBase;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    new-instance v1, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$2$1;

    invoke-direct {v1, p0}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$2$1;-><init>(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$2;)V

    invoke-virtual {p1, v0, v1}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->queryNetworkInfo(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    return-void

    .line 6
    :cond_0
    iget-object p1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$2;->a:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->v(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/jieli/jl_rcsp/model/WatchConfigure;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$2;->onSuccess(Lcom/jieli/jl_rcsp/model/WatchConfigure;)V

    return-void
.end method
