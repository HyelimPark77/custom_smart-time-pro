.class public Lcom/jieli/jl_rcsp/model/cmdHandler/AlarmExpandCmdHandler;
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
    .locals 6

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result v1

    const/16 v2, 0x25

    if-eq v1, v2, :cond_1

    return-object v0

    :cond_1
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getType()I

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ne v2, v3, :cond_2

    new-instance p1, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd;

    new-instance p2, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$Param;

    new-array v0, v4, [B

    invoke-direct {p2, v4, v0}, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$Param;-><init>(B[B)V

    invoke-direct {p1, p2}, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$Param;)V

    return-object p1

    :cond_2
    invoke-static {}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getInstance()Lcom/jieli/jl_rcsp/tool/CommandHelper;

    move-result-object v2

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v5

    invoke-virtual {v2, p1, v1, v5}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getCommand(Landroid/bluetooth/BluetoothDevice;II)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    if-eqz p1, :cond_3

    check-cast p1, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd;

    goto :goto_0

    :cond_3
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$ReadRtcBellArgsParams;

    invoke-direct {v1, v4}, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$ReadRtcBellArgsParams;-><init>(B)V

    invoke-direct {p1, v1}, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$Param;)V

    :goto_0
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getParamData()[B

    move-result-object v1

    aget-byte v1, v1, v4

    if-eqz v1, :cond_5

    if-eq v1, v3, :cond_4

    goto :goto_1

    :cond_4
    new-instance v0, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$Response;

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$Response;-><init>(B)V

    goto :goto_1

    :cond_5
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getParamData()[B

    move-result-object v0

    array-length v0, v0

    sub-int/2addr v0, v3

    new-array v2, v0, [B

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getParamData()[B

    move-result-object v5

    invoke-static {v5, v3, v2, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$ReadRtcBellArgsResponse;

    invoke-direct {v0, v1, v2}, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$ReadRtcBellArgsResponse;-><init>(B[B)V

    :goto_1
    if-eqz v0, :cond_6

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getParamData()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/base/BaseResponse;->setRawData([B)V

    :cond_6
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    return-object p1
.end method
