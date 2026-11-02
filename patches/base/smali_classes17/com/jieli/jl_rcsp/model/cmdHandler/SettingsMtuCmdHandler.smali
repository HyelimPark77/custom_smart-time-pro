.class public Lcom/jieli/jl_rcsp/model/cmdHandler/SettingsMtuCmdHandler;
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
    .locals 7

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result v1

    const/16 v2, 0xd1

    if-eq v1, v2, :cond_1

    return-object v0

    :cond_1
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getParamData()[B

    move-result-object v0

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getType()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-ne v1, v4, :cond_3

    invoke-static {}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getInstance()Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getMaxCommunicationMtu(Landroid/bluetooth/BluetoothDevice;)I

    move-result p1

    if-eqz v0, :cond_2

    array-length v1, v0

    if-lt v1, v3, :cond_2

    aget-byte p1, v0, v2

    aget-byte v0, v0, v4

    invoke-static {p1, v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt(BB)I

    move-result p1

    :cond_2
    new-instance v0, Lcom/jieli/jl_rcsp/model/command/SettingsMtuCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/SettingsMtuParam;

    invoke-direct {v1, p1}, Lcom/jieli/jl_rcsp/model/parameter/SettingsMtuParam;-><init>(I)V

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/command/SettingsMtuCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/SettingsMtuParam;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-static {}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getInstance()Lcom/jieli/jl_rcsp/tool/CommandHelper;

    move-result-object v1

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result v5

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v6

    invoke-virtual {v1, p1, v5, v6}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getCommand(Landroid/bluetooth/BluetoothDevice;II)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    new-instance v1, Lcom/jieli/jl_rcsp/model/response/SettingsMtuResponse;

    const/16 v5, 0x212

    invoke-direct {v1, v5}, Lcom/jieli/jl_rcsp/model/response/SettingsMtuResponse;-><init>(I)V

    invoke-virtual {v1, v0}, Lcom/jieli/jl_rcsp/model/base/BaseResponse;->setRawData([B)V

    if-eqz v0, :cond_4

    array-length v6, v0

    if-lt v6, v3, :cond_4

    aget-byte v2, v0, v2

    aget-byte v0, v0, v4

    invoke-static {v2, v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt(BB)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/jieli/jl_rcsp/model/response/SettingsMtuResponse;->setRealMtu(I)Lcom/jieli/jl_rcsp/model/response/SettingsMtuResponse;

    :cond_4
    if-eqz p1, :cond_5

    check-cast p1, Lcom/jieli/jl_rcsp/model/command/SettingsMtuCmd;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1

    :cond_5
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/SettingsMtuCmd;

    new-instance v0, Lcom/jieli/jl_rcsp/model/parameter/SettingsMtuParam;

    invoke-direct {v0, v5}, Lcom/jieli/jl_rcsp/model/parameter/SettingsMtuParam;-><init>(I)V

    invoke-direct {p1, v0}, Lcom/jieli/jl_rcsp/model/command/SettingsMtuCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/SettingsMtuParam;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1
.end method
