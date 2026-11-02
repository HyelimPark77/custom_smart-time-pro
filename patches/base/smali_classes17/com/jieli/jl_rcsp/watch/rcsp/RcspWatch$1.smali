.class Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
        "Ljava/util/ArrayList<",
        "Lcom/jieli/jl_fatfs/model/FatFile;",
        ">;>;"
    }
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$1;->b:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a()V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$1;->b:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    invoke-virtual {v0, p0}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->listWatchList(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    return-void
.end method

.method public onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 3

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getSubCode()I

    move-result v0

    const/16 v1, 0x4001

    if-ne v0, v1, :cond_0

    iget v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$1;->a:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$1;->a:I

    iget-object p1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$1;->b:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->r(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)Landroid/os/Handler;

    move-result-object p1

    new-instance v0, Lcom/jieli/jl_rcsp/watch/rcsp/OXO1;

    invoke-direct {v0, p0}, Lcom/jieli/jl_rcsp/watch/rcsp/OXO1;-><init>(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$1;)V

    const-wide/16 v1, 0x1f4

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$1;->b:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->t(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onFailed ---> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "MSG_INIT_WATCH#listWatchList"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$1;->a:I

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$1;->b:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getSubCode()I

    move-result p1

    invoke-static {v0, p1}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->a(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;I)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$1;->onSuccess(Ljava/util/ArrayList;)V

    return-void
.end method

.method public onSuccess(Ljava/util/ArrayList;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/jieli/jl_fatfs/model/FatFile;",
            ">;)V"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$1;->b:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->i(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onSuccess :: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "MSG_INIT_WATCH#listWatchList"

    invoke-static {v0, v1, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 3
    iput p1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$1;->a:I

    .line 4
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$1;->b:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/watch/WatchBase;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$1;->b:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    invoke-virtual {v1, v0}, Lcom/jieli/jl_rcsp/watch/WatchBase;->getWatchConfigure(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/WatchConfigure;

    move-result-object v1

    .line 6
    iget-object v2, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$1;->b:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    invoke-static {v2}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->k(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, ""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "MSG_INIT_WATCH"

    invoke-static {v2, v4, v3}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v1, :cond_0

    .line 7
    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/model/WatchConfigure;->getFunctionOption()Lcom/jieli/jl_rcsp/model/WatchConfigure$FunctionOption;

    move-result-object v2

    invoke-virtual {v2}, Lcom/jieli/jl_rcsp/model/WatchConfigure$FunctionOption;->isSupportDialExpandInfo()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 8
    iget-object v2, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$1;->b:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    invoke-static {v2, v0}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->a(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;Landroid/bluetooth/BluetoothDevice;)V

    .line 9
    :cond_0
    iget-object v2, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$1;->b:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    invoke-static {v2, p1}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->a(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;I)V

    if-eqz v1, :cond_1

    .line 10
    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/model/WatchConfigure;->getFunctionOption()Lcom/jieli/jl_rcsp/model/WatchConfigure$FunctionOption;

    move-result-object p1

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/WatchConfigure$FunctionOption;->isSupportNetworkModule()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 11
    iget-object p1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$1;->b:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->l(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    move-result-object v1

    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getDeviceInfo()Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->getNetworkInfo()Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;

    move-result-object v1

    invoke-static {p1, v1}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->a(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 12
    iget-object p1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$1;->b:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->m(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "Network Module has exception. "

    invoke-static {p1, v4, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 13
    :cond_1
    iget-object p1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$1;->b:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->n(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "isOTAResource = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$1;->b:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    invoke-static {v2}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->o(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v4, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    iget-object p1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$1;->b:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->p(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 15
    iget-object p1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$1;->b:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->q(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->onResourceUpdateUnfinished(Landroid/bluetooth/BluetoothDevice;)V

    :cond_2
    return-void
.end method
