.class public Lcom/jieli/jl_rcsp/model/cmdHandler/BatchHandler;
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

    const/16 v2, 0x26

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

    const/4 v5, 0x0

    if-ne v4, v3, :cond_3

    array-length p1, v0

    sub-int/2addr p1, v2

    new-array v3, p1, [B

    invoke-static {v0, v2, v3, v5, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance p1, Lcom/jieli/jl_rcsp/model/command/BatchCmd$Param;

    aget-byte v0, v0, v5

    invoke-direct {p1, v0, v3}, Lcom/jieli/jl_rcsp/model/command/BatchCmd$Param;-><init>(B[B)V

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/BatchCmd;

    invoke-direct {v0, v1, p1}, Lcom/jieli/jl_rcsp/model/command/BatchCmd;-><init>(ILcom/jieli/jl_rcsp/model/command/BatchCmd$Param;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    return-object v0

    :cond_3
    invoke-static {}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getInstance()Lcom/jieli/jl_rcsp/tool/CommandHelper;

    move-result-object v2

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result v4

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v6

    invoke-virtual {v2, p1, v4, v6}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getCommand(Landroid/bluetooth/BluetoothDevice;II)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    if-nez p1, :cond_4

    new-instance p1, Lcom/jieli/jl_rcsp/model/command/BatchCmd;

    new-instance v2, Lcom/jieli/jl_rcsp/model/command/BatchCmd$Param;

    aget-byte v4, v0, v5

    new-array v6, v5, [B

    invoke-direct {v2, v4, v6}, Lcom/jieli/jl_rcsp/model/command/BatchCmd$Param;-><init>(B[B)V

    invoke-direct {p1, v1, v2}, Lcom/jieli/jl_rcsp/model/command/BatchCmd;-><init>(ILcom/jieli/jl_rcsp/model/command/BatchCmd$Param;)V

    :cond_4
    new-instance v1, Lcom/jieli/jl_rcsp/model/command/BatchCmd$Response;

    aget-byte v2, v0, v5

    aget-byte v3, v0, v3

    invoke-direct {v1, v2, v3}, Lcom/jieli/jl_rcsp/model/command/BatchCmd$Response;-><init>(BB)V

    invoke-virtual {v1, v0}, Lcom/jieli/jl_rcsp/model/base/BaseResponse;->setRawData([B)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getXmOpCode()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/jieli/jl_rcsp/model/base/CommonResponse;->setXmOpCode(I)V

    move-object v0, p1

    check-cast v0, Lcom/jieli/jl_rcsp/model/command/BatchCmd;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {v0, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    return-object p1
.end method
