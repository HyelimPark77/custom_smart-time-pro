.class Lcom/jieli/jl_rcsp/watch/WatchBase$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/watch/WatchBase;->requestDeviceConfigure(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
        "Lcom/jieli/jl_rcsp/model/command/GetDevConfigureCmd$Response;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Landroid/bluetooth/BluetoothDevice;

.field public final synthetic b:Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;

.field public final synthetic c:Lcom/jieli/jl_rcsp/watch/WatchBase;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/watch/WatchBase;Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_rcsp/watch/WatchBase$8;->c:Lcom/jieli/jl_rcsp/watch/WatchBase;

    iput-object p2, p0, Lcom/jieli/jl_rcsp/watch/WatchBase$8;->a:Landroid/bluetooth/BluetoothDevice;

    iput-object p3, p0, Lcom/jieli/jl_rcsp/watch/WatchBase$8;->b:Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 3

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase$8;->c:Lcom/jieli/jl_rcsp/watch/WatchBase;

    iget-object v0, v0, Lcom/jieli/jl_rcsp/watch/WatchBase;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onFailed. "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "requestDeviceConfigure"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase$8;->b:Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    :cond_0
    return-void
.end method

.method public onSuccess(Lcom/jieli/jl_rcsp/model/command/GetDevConfigureCmd$Response;)V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase$8;->c:Lcom/jieli/jl_rcsp/watch/WatchBase;

    iget-object v0, v0, Lcom/jieli/jl_rcsp/watch/WatchBase;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onSuccess. "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "requestDeviceConfigure"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase$8;->c:Lcom/jieli/jl_rcsp/watch/WatchBase;

    iget-object v0, v0, Lcom/jieli/jl_rcsp/watch/WatchBase;->mStatusManager:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/watch/WatchBase$8;->a:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/command/GetDevConfigureCmd$Response;->getDeviceConfiguration()Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->updateDeviceConfigure(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;)V

    .line 4
    iget-object p1, p0, Lcom/jieli/jl_rcsp/watch/WatchBase$8;->b:Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/WatchBase$8;->c:Lcom/jieli/jl_rcsp/watch/WatchBase;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/watch/WatchBase$8;->a:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/watch/WatchBase;->getWatchConfigure(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/WatchConfigure;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;->onSuccess(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/jieli/jl_rcsp/model/command/GetDevConfigureCmd$Response;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/WatchBase$8;->onSuccess(Lcom/jieli/jl_rcsp/model/command/GetDevConfigureCmd$Response;)V

    return-void
.end method
