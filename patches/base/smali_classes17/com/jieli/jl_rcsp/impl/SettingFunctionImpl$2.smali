.class Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl$2;
.super Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl$2;->a:Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V
    .locals 5

    if-eqz p1, :cond_3

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getId()I

    move-result v0

    const/16 v1, 0x33

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, p2

    check-cast v0, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getParam()Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    move-result-object v1

    check-cast v1, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Param;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Param;->getSettingData()Lcom/jieli/jl_rcsp/model/device/settings/SettingData;

    move-result-object v1

    iget-object v2, p0, Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl$2;->a:Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;

    invoke-static {v2}, Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;->a(Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;)Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl$CallbackManager;

    move-result-object v2

    invoke-virtual {v2, p1, v1}, Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl$CallbackManager;->onSettingData(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/settings/SettingData;)V

    instance-of v2, v1, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;

    if-eqz v2, :cond_2

    check-cast v1, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl$2;->a:Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;

    invoke-static {v2}, Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;->b(Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, ""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "onRcspCommand"

    invoke-static {v2, v4, v3}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl$2;->a:Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;

    invoke-static {v2}, Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;->a(Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;)Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl$CallbackManager;

    move-result-object v2

    invoke-virtual {v2, p1, v1}, Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl$CallbackManager;->onSettingFunction(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;)V

    :cond_2
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getType()I

    move-result p2

    const/4 v1, 0x2

    if-ne p2, v1, :cond_3

    new-instance p2, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$ResultParam;

    const/4 v1, 0x0

    invoke-direct {p2, v1}, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$ResultParam;-><init>(I)V

    invoke-virtual {v0, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setParam(Lcom/jieli/jl_rcsp/model/base/BaseParameter;)V

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    iget-object p2, p0, Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl$2;->a:Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;

    invoke-static {p2}, Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;->c(Lcom/jieli/jl_rcsp/impl/SettingFunctionImpl;)Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    move-result-object p2

    const/4 v1, 0x0

    invoke-virtual {p2, p1, v0, v1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    :cond_3
    :goto_0
    return-void
.end method
