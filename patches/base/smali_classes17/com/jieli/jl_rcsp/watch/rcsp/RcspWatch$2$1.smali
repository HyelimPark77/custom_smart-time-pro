.class Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$2$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$2;->onSuccess(Lcom/jieli/jl_rcsp/model/WatchConfigure;)V
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
.field public final synthetic a:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$2;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$2;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$2$1;->a:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 3

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$2$1;->a:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$2;

    iget-object v0, v0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$2;->a:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->w(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onFailed ---> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "init#queryNetworkInfo"

    invoke-static {v0, v1, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$2$1;->a:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$2;

    iget-object p1, p1, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$2;->a:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->v(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Boolean;)V
    .locals 3

    .line 2
    iget-object p1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$2$1;->a:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$2;

    iget-object p1, p1, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$2;->a:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->j(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    move-result-object p1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$2$1;->a:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$2;

    iget-object v0, v0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$2;->a:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/watch/WatchBase;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object p1

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->getNetworkInfo()Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;

    move-result-object p1

    .line 3
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$2$1;->a:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$2;

    iget-object v0, v0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$2;->a:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->s(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", isInit = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$2$1;->a:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$2;

    iget-object v2, v2, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$2;->a:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    invoke-static {v2}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->u(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "init#queryNetworkInfo"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$2$1;->a:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$2;

    iget-object v0, v0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$2;->a:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->u(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 5
    iget-object p1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$2$1;->a:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$2;

    iget-object p1, p1, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$2;->a:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->v(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)V

    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$2$1;->a:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$2;

    iget-object v0, v0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$2;->a:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    invoke-static {v0, p1}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->a(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;)Z

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$2$1;->onSuccess(Ljava/lang/Boolean;)V

    return-void
.end method
