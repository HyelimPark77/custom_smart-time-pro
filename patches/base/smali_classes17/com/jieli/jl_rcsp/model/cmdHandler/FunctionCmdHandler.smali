.class public Lcom/jieli/jl_rcsp/model/cmdHandler/FunctionCmdHandler;
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

    const/16 v2, 0xe

    if-eq v1, v2, :cond_1

    return-object v0

    :cond_1
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getParamData()[B

    move-result-object v0

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getType()I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, -0x1

    if-ne v1, v2, :cond_4

    const/4 p1, 0x0

    new-array v1, p1, [B

    if-eqz v0, :cond_2

    array-length v4, v0

    if-le v4, v2, :cond_2

    aget-byte v3, v0, p1

    aget-byte v2, v0, v2

    array-length v4, v0

    const/4 v5, 0x2

    if-le v4, v5, :cond_3

    array-length v1, v0

    sub-int/2addr v1, v5

    new-array v4, v1, [B

    invoke-static {v0, v5, v4, p1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v1, v4

    goto :goto_0

    :cond_2
    move v2, v3

    :cond_3
    :goto_0
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/FunctionCmd;

    new-instance v0, Lcom/jieli/jl_rcsp/model/parameter/FunctionParam;

    invoke-direct {v0, v3, v2}, Lcom/jieli/jl_rcsp/model/parameter/FunctionParam;-><init>(BB)V

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/parameter/FunctionParam;->setExtend([B)Lcom/jieli/jl_rcsp/model/parameter/FunctionParam;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/jieli/jl_rcsp/model/command/FunctionCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/FunctionParam;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

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

    move-result-object p1

    new-instance v1, Lcom/jieli/jl_rcsp/model/base/CommonResponse;

    invoke-direct {v1}, Lcom/jieli/jl_rcsp/model/base/CommonResponse;-><init>()V

    invoke-virtual {v1, v0}, Lcom/jieli/jl_rcsp/model/base/BaseResponse;->setRawData([B)V

    if-eqz p1, :cond_5

    check-cast p1, Lcom/jieli/jl_rcsp/model/command/FunctionCmd;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1

    :cond_5
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/FunctionCmd;

    new-instance v0, Lcom/jieli/jl_rcsp/model/parameter/FunctionParam;

    invoke-direct {v0, v3, v3}, Lcom/jieli/jl_rcsp/model/parameter/FunctionParam;-><init>(BB)V

    invoke-direct {p1, v0}, Lcom/jieli/jl_rcsp/model/command/FunctionCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/FunctionParam;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1
.end method
