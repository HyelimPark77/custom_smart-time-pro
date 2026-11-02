.class Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/setting/OnSettingFunctionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$7;->a:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSettingData(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/settings/SettingData;)V
    .locals 0

    return-void
.end method

.method public onSettingFunction(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;)V
    .locals 2

    instance-of v0, p2, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkFunction;

    if-eqz v0, :cond_8

    check-cast p2, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkFunction;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkFunction;->getNetworkBase()Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkBase;

    move-result-object p2

    if-nez p2, :cond_0

    goto/16 :goto_0

    :cond_0
    instance-of v0, p2, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;

    if-eqz v0, :cond_2

    check-cast p2, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$7;->a:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->a(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;)Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0, p2}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setNetworkInfo(Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    :cond_1
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$7;->a:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->b(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;)Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$CallbackManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$CallbackManager;->onNetworkInfo(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;)V

    return-void

    :cond_2
    instance-of v0, p2, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkOTAState;

    if-eqz v0, :cond_8

    check-cast p2, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkOTAState;

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$7;->a:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->b(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;)Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$CallbackManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$CallbackManager;->onNetworkOTAState(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkOTAState;)V

    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$7;->a:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->e(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isNetworkOTA = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$7;->a:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;

    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->isNetworkOTA()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "onSettingFunction"

    invoke-static {p1, v1, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$7;->a:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->isNetworkOTA()Z

    move-result p1

    if-eqz p1, :cond_8

    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$7;->a:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->f(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;)Landroid/os/Handler;

    move-result-object p1

    const/16 v0, 0x1010

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeMessages(I)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkOTAState;->getState()I

    move-result p1

    const/4 v0, 0x1

    if-eqz p1, :cond_4

    if-eq p1, v0, :cond_3

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$7;->a:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->c(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;)Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;

    move-result-object p2

    invoke-static {p2}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;->a(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;)[B

    move-result-object p2

    invoke-static {p1, p2}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->a(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;[B)V

    return-void

    :cond_4
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkOTAState;->getCode()I

    move-result p1

    if-eqz p1, :cond_7

    if-eq p1, v0, :cond_6

    const/4 v0, 0x2

    if-eq p1, v0, :cond_5

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkOTAState;->getCode()I

    move-result p1

    const/16 p2, 0x5000

    const-string v0, ""

    const/16 v1, 0x33

    invoke-static {v1, p2, p1, v0}, Lcom/jieli/jl_rcsp/constant/RcspErrorCode;->buildJsonError(IIILjava/lang/String;)Lcom/jieli/jl_rcsp/model/base/BaseError;

    move-result-object p1

    iget-object p2, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$7;->a:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getSubCode()I

    move-result v0

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, v0, p1}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->a(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;ILjava/lang/String;)V

    return-void

    :cond_5
    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$7;->a:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;

    const/16 p2, 0x5002

    invoke-static {p1, p2}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->a(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;I)V

    return-void

    :cond_6
    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$7;->a:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;

    const/16 p2, 0x5001

    invoke-static {p1, p2}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->a(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;I)V

    return-void

    :cond_7
    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$7;->a:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->c(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;)Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;->setNetworkOTA(Z)Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;

    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$7;->a:Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;->c(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;)Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;

    move-result-object p1

    invoke-static {p1}, Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;->b(Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$Param;)Lcom/jieli/jl_rcsp/interfaces/network/OnNetworkOTACallback;

    move-result-object p1

    if-eqz p1, :cond_8

    const/16 p2, 0x64

    invoke-interface {p1, p2}, Lcom/jieli/jl_rcsp/interfaces/network/OnNetworkOTACallback;->onProgress(I)V

    invoke-interface {p1}, Lcom/jieli/jl_rcsp/interfaces/network/OnNetworkOTACallback;->onStop()V

    :cond_8
    :goto_0
    return-void
.end method
