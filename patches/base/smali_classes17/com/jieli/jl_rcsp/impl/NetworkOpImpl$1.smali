.class Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->queryNetworkInfo(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
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
.field public final synthetic a:Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;

.field public final synthetic b:Landroid/bluetooth/BluetoothDevice;

.field public final synthetic c:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$1;->c:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;

    iput-object p2, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$1;->a:Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;

    iput-object p3, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$1;->b:Landroid/bluetooth/BluetoothDevice;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$1;->a:Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    :cond_0
    return-void
.end method

.method public onSuccess(Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Response;)V
    .locals 3

    .line 2
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Response;->getResult()I

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Response;->getSettingData()Lcom/jieli/jl_rcsp/model/device/settings/SettingData;

    move-result-object v0

    instance-of v0, v0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkFunction;

    if-eqz v0, :cond_2

    .line 3
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Response;->getSettingData()Lcom/jieli/jl_rcsp/model/device/settings/SettingData;

    move-result-object v0

    check-cast v0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkFunction;

    .line 4
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkFunction;->getNetworkBase()Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkBase;

    move-result-object v1

    instance-of v1, v1, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;

    if-eqz v1, :cond_2

    .line 5
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkFunction;->getNetworkBase()Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkBase;

    move-result-object p1

    check-cast p1, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;

    .line 6
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$1;->c:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->a(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;)Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getDeviceInfo()Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 7
    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setNetworkInfo(Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$1;->a:Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;

    if-eqz v0, :cond_1

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v0, v1}, Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;->onSuccess(Ljava/lang/Object;)V

    .line 9
    :cond_1
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$1;->c:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->b(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;)Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$CallbackManager;

    move-result-object v0

    iget-object v1, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$1;->b:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v0, v1, p1}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$CallbackManager;->onNetworkInfo(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;)V

    return-void

    .line 10
    :cond_2
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Response;->getResult()I

    move-result p1

    const/16 v0, 0x3005

    const/4 v1, 0x0

    const/16 v2, 0x33

    .line 11
    invoke-static {v2, v0, p1, v1}, Lcom/jieli/jl_rcsp/constant/RcspErrorCode;->buildJsonError(IIILjava/lang/String;)Lcom/jieli/jl_rcsp/model/base/BaseError;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$1;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Response;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$1;->onSuccess(Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Response;)V

    return-void
.end method
