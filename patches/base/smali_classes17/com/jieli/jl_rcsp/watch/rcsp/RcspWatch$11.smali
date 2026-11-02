.class Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$11;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->a(Landroid/bluetooth/BluetoothDevice;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
        "Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Response;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Landroid/bluetooth/BluetoothDevice;

.field public final synthetic b:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$11;->b:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    iput-object p2, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$11;->a:Landroid/bluetooth/BluetoothDevice;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 3

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$11;->b:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->h(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onFailed :: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "readDialExpandInfo"

    invoke-static {v0, v1, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onSuccess(Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Response;)V
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$11;->b:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$11;->a:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/watch/WatchBase;->getWatchConfigure(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/WatchConfigure;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$11;->b:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    invoke-static {v1}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->f(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onSuccess :: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "readDialExpandInfo"

    invoke-static {v1, v3, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Response;->getSettingData()Lcom/jieli/jl_rcsp/model/device/settings/SettingData;

    move-result-object v1

    instance-of v1, v1, Lcom/jieli/jl_rcsp/model/device/settings/v0/DialExpandInfo;

    if-eqz v1, :cond_0

    .line 5
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Response;->getSettingData()Lcom/jieli/jl_rcsp/model/device/settings/SettingData;

    move-result-object p1

    check-cast p1, Lcom/jieli/jl_rcsp/model/device/settings/v0/DialExpandInfo;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/model/WatchConfigure;->setDialExpandInfo(Lcom/jieli/jl_rcsp/model/device/settings/v0/DialExpandInfo;)Lcom/jieli/jl_rcsp/model/WatchConfigure;

    .line 6
    iget-object p1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$11;->b:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->g(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    move-result-object p1

    iget-object v1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$11;->a:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {p1, v1, v0}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->updateDeviceConfigure(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Response;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$11;->onSuccess(Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Response;)V

    return-void
.end method
