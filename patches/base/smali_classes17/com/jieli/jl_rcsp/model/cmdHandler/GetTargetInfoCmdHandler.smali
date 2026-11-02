.class public Lcom/jieli/jl_rcsp/model/cmdHandler/GetTargetInfoCmdHandler;
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

    const/4 v2, 0x3

    if-eq v1, v2, :cond_1

    return-object v0

    :cond_1
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getParamData()[B

    move-result-object v0

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getType()I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v1, v2, :cond_4

    if-eqz v0, :cond_2

    array-length p1, v0

    const/4 v1, 0x4

    if-lt p1, v1, :cond_2

    new-array p1, v1, [B

    invoke-static {v0, v3, p1, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([B)I

    move-result p1

    array-length v2, v0

    const/4 v4, 0x5

    if-lt v2, v4, :cond_3

    aget-byte v3, v0, v1

    goto :goto_0

    :cond_2
    move p1, v3

    :cond_3
    :goto_0
    new-instance v0, Lcom/jieli/jl_rcsp/model/command/status/GetTargetInfoCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/GetTargetInfoParam;

    invoke-direct {v1, p1}, Lcom/jieli/jl_rcsp/model/parameter/GetTargetInfoParam;-><init>(I)V

    invoke-virtual {v1, v3}, Lcom/jieli/jl_rcsp/model/parameter/GetTargetInfoParam;->setPlatform(B)Lcom/jieli/jl_rcsp/model/parameter/GetTargetInfoParam;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/jieli/jl_rcsp/model/command/status/GetTargetInfoCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/GetTargetInfoParam;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getInstance()Lcom/jieli/jl_rcsp/tool/CommandHelper;

    move-result-object v1

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result v2

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v4

    invoke-virtual {v1, p1, v2, v4}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getCommand(Landroid/bluetooth/BluetoothDevice;II)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;-><init>()V

    invoke-virtual {v2, v0}, Lcom/jieli/jl_rcsp/model/base/BaseResponse;->setRawData([B)V

    invoke-static {p1, v2, p2}, Lcom/jieli/jl_rcsp/tool/datahandles/ParseHelper;->parseTargetInfo(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;Lcom/jieli/jl_rcsp/model/base/BasePacket;)V

    if-eqz v1, :cond_5

    check-cast v1, Lcom/jieli/jl_rcsp/model/command/status/GetTargetInfoCmd;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p1

    invoke-virtual {v1, p1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object v1

    :cond_5
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/status/GetTargetInfoCmd;

    new-instance v0, Lcom/jieli/jl_rcsp/model/parameter/GetTargetInfoParam;

    invoke-direct {v0, v3}, Lcom/jieli/jl_rcsp/model/parameter/GetTargetInfoParam;-><init>(I)V

    invoke-virtual {v0, v3}, Lcom/jieli/jl_rcsp/model/parameter/GetTargetInfoParam;->setPlatform(B)Lcom/jieli/jl_rcsp/model/parameter/GetTargetInfoParam;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/jieli/jl_rcsp/model/command/status/GetTargetInfoCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/GetTargetInfoParam;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1
.end method
