.class public Lcom/jieli/jl_rcsp/model/cmdHandler/PublicSettingsCmdHandler;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/cmd/ICmdHandler;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public parseDataToCmd(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BasePacket;)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 5

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result v1

    const/16 v2, 0x33

    if-eq v1, v2, :cond_1

    return-object v0

    :cond_1
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getParamData()[B

    move-result-object v0

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getHasResponse()I

    move-result v1

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-ne v1, v3, :cond_2

    move v1, v2

    goto :goto_0

    :cond_2
    move v1, v3

    :goto_0
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getType()I

    move-result v4

    if-ne v4, v3, :cond_a

    new-instance p1, Lcom/jieli/jl_rcsp/model/device/settings/SettingData;

    invoke-direct {p1, v0}, Lcom/jieli/jl_rcsp/model/device/settings/SettingData;-><init>([B)V

    new-instance v4, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Param;

    invoke-direct {v4, p1}, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Param;-><init>(Lcom/jieli/jl_rcsp/model/device/settings/SettingData;)V

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/device/settings/SettingData;->getVersion()I

    move-result p1

    if-nez p1, :cond_9

    new-instance p1, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;

    invoke-direct {p1, v0}, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;-><init>([B)V

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;->getFunction()I

    move-result p1

    if-eq p1, v3, :cond_8

    if-eq p1, v2, :cond_7

    const/4 v2, 0x3

    if-eq p1, v2, :cond_6

    const/4 v2, 0x4

    if-eq p1, v2, :cond_5

    const/4 v2, 0x5

    if-eq p1, v2, :cond_4

    const/4 v2, 0x7

    if-eq p1, v2, :cond_3

    goto :goto_1

    :cond_3
    new-instance v4, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Param;

    new-instance p1, Lcom/jieli/jl_rcsp/model/device/settings/v0/DialExpandInfo;

    invoke-direct {p1, v0}, Lcom/jieli/jl_rcsp/model/device/settings/v0/DialExpandInfo;-><init>([B)V

    invoke-direct {v4, p1}, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Param;-><init>(Lcom/jieli/jl_rcsp/model/device/settings/SettingData;)V

    goto :goto_1

    :cond_4
    new-instance v4, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Param;

    new-instance p1, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkFunction;

    invoke-direct {p1, v0}, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkFunction;-><init>([B)V

    invoke-direct {v4, p1}, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Param;-><init>(Lcom/jieli/jl_rcsp/model/device/settings/SettingData;)V

    goto :goto_1

    :cond_5
    new-instance v4, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Param;

    new-instance p1, Lcom/jieli/jl_rcsp/model/device/settings/v0/FunctionResource;

    invoke-direct {p1, v0}, Lcom/jieli/jl_rcsp/model/device/settings/v0/FunctionResource;-><init>([B)V

    invoke-direct {v4, p1}, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Param;-><init>(Lcom/jieli/jl_rcsp/model/device/settings/SettingData;)V

    goto :goto_1

    :cond_6
    new-instance v4, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Param;

    new-instance p1, Lcom/jieli/jl_rcsp/model/device/settings/v0/BoundDeviceState;

    invoke-direct {p1, v0}, Lcom/jieli/jl_rcsp/model/device/settings/v0/BoundDeviceState;-><init>([B)V

    invoke-direct {v4, p1}, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Param;-><init>(Lcom/jieli/jl_rcsp/model/device/settings/SettingData;)V

    goto :goto_1

    :cond_7
    new-instance v4, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Param;

    new-instance p1, Lcom/jieli/jl_rcsp/model/device/settings/v0/FlashlightSetting;

    invoke-direct {p1, v0}, Lcom/jieli/jl_rcsp/model/device/settings/v0/FlashlightSetting;-><init>([B)V

    invoke-direct {v4, p1}, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Param;-><init>(Lcom/jieli/jl_rcsp/model/device/settings/SettingData;)V

    goto :goto_1

    :cond_8
    new-instance v4, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Param;

    new-instance p1, Lcom/jieli/jl_rcsp/model/device/settings/v0/BrightnessSetting;

    invoke-direct {p1, v0}, Lcom/jieli/jl_rcsp/model/device/settings/v0/BrightnessSetting;-><init>([B)V

    invoke-direct {v4, p1}, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Param;-><init>(Lcom/jieli/jl_rcsp/model/device/settings/SettingData;)V

    :cond_9
    :goto_1
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd;

    invoke-direct {p1, v1, v4}, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd;-><init>(ILcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Param;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    return-object p1

    :cond_a
    invoke-static {}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getInstance()Lcom/jieli/jl_rcsp/tool/CommandHelper;

    move-result-object v2

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result v3

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v4

    invoke-virtual {v2, p1, v3, v4}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getCommand(Landroid/bluetooth/BluetoothDevice;II)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    if-eqz p1, :cond_b

    check-cast p1, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd;

    goto :goto_2

    :cond_b
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd;

    new-instance v2, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Param;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Param;-><init>()V

    invoke-direct {p1, v1, v2}, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd;-><init>(ILcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Param;)V

    :goto_2
    new-instance v1, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Response;

    invoke-direct {v1, v0}, Lcom/jieli/jl_rcsp/model/command/setting/PublicSettingsCmd$Response;-><init>([B)V

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    return-object p1
.end method
