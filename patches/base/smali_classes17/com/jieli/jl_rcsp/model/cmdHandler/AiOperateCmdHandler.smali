.class public Lcom/jieli/jl_rcsp/model/cmdHandler/AiOperateCmdHandler;
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
    .locals 8

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result v1

    const/16 v2, 0x32

    if-ne v1, v2, :cond_f

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getParamData()[B

    move-result-object v3

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getType()I

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-ne v4, v6, :cond_9

    if-eq v1, v2, :cond_1

    goto/16 :goto_6

    :cond_1
    if-eqz v3, :cond_7

    array-length p1, v3

    if-lez p1, :cond_7

    aget-byte p1, v3, v5

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result p1

    array-length v1, v3

    if-le v1, v6, :cond_6

    aget-byte v1, v3, v6

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v5

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    array-length v1, v3

    const/4 v2, 0x2

    if-le v1, v2, :cond_6

    if-nez v5, :cond_3

    array-length v1, v3

    sub-int/2addr v1, v2

    new-instance v4, Ljava/lang/String;

    invoke-direct {v4, v3, v2, v1}, Ljava/lang/String;-><init>([BII)V

    move-object v1, v0

    move-object v2, v1

    move-object v3, v2

    move-object v0, v4

    :goto_0
    move-object v4, v3

    goto :goto_3

    :cond_3
    const/4 v1, 0x4

    if-ne v5, v6, :cond_5

    aget-byte v4, v3, v2

    const/16 v7, 0x80

    and-int/2addr v4, v7

    if-ne v4, v7, :cond_4

    const/4 v4, 0x3

    aget-byte v4, v3, v4

    aget-byte v1, v3, v1

    invoke-static {v4, v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt(BB)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v4, 0x5

    aget-byte v4, v3, v4

    const/4 v7, 0x6

    aget-byte v7, v3, v7

    invoke-static {v4, v7}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt(BB)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_1

    :cond_4
    move-object v1, v0

    move-object v4, v1

    :goto_1
    aget-byte v2, v3, v2

    and-int/lit8 v2, v2, 0x7f

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object v3, v0

    goto :goto_3

    :cond_5
    if-ne v5, v1, :cond_6

    array-length v1, v3

    sub-int/2addr v1, v2

    new-instance v4, Ljava/lang/String;

    invoke-direct {v4, v3, v2, v1}, Ljava/lang/String;-><init>([BII)V

    move-object v1, v0

    move-object v2, v1

    move-object v3, v4

    move-object v4, v2

    goto :goto_3

    :cond_6
    :goto_2
    move-object v1, v0

    move-object v2, v1

    move-object v3, v2

    goto :goto_0

    :cond_7
    const/4 p1, -0x1

    goto :goto_2

    :goto_3
    new-instance v7, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;

    invoke-direct {v7}, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;-><init>()V

    invoke-virtual {v7, p1}, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;->setOp(I)Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;

    move-result-object p1

    invoke-virtual {p1, v5}, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;->setFlag(I)Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;->setAiDialStyle(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;

    move-result-object p1

    invoke-virtual {p1, v2}, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;->setAiDialFunUIState(Ljava/lang/Integer;)Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;

    move-result-object p1

    invoke-virtual {p1, v4}, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;->setScaleZoomHeight(Ljava/lang/Integer;)Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;->setScaleZoomWidth(Ljava/lang/Integer;)Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;

    move-result-object p1

    invoke-virtual {p1, v3}, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;->setThumbPath(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;

    move-result-object p1

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getHasResponse()I

    move-result v0

    if-ne v0, v6, :cond_8

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/ai/AIOperateCmd;

    invoke-direct {v0, p1}, Lcom/jieli/jl_rcsp/model/command/ai/AIOperateCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    return-object p1

    :cond_8
    new-instance v0, Lcom/jieli/jl_rcsp/model/command/ai/AIOperateNoResponseCmd;

    invoke-direct {v0, p1}, Lcom/jieli/jl_rcsp/model/command/ai/AIOperateNoResponseCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    return-object p1

    :cond_9
    invoke-static {}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getInstance()Lcom/jieli/jl_rcsp/tool/CommandHelper;

    move-result-object v4

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v7

    invoke-virtual {v4, p1, v1, v7}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getCommand(Landroid/bluetooth/BluetoothDevice;II)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    if-eq v1, v2, :cond_a

    goto :goto_6

    :cond_a
    new-array v1, v5, [B

    if-eqz p1, :cond_b

    check-cast p1, Lcom/jieli/jl_rcsp/model/command/ai/AIOperateCmd;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getParam()Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    move-result-object v0

    check-cast v0, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;

    goto :goto_4

    :cond_b
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/ai/AIOperateCmd;

    new-instance v2, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;-><init>()V

    invoke-direct {p1, v2}, Lcom/jieli/jl_rcsp/model/command/ai/AIOperateCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;)V

    :goto_4
    if-eqz v3, :cond_e

    array-length v2, v3

    if-lez v2, :cond_e

    aget-byte v2, v3, v5

    invoke-static {v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v2

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;->getOp()I

    goto :goto_5

    :cond_c
    array-length v0, v3

    if-le v0, v6, :cond_d

    array-length v0, v3

    sub-int/2addr v0, v6

    new-array v1, v0, [B

    invoke-static {v3, v6, v1, v5, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_d
    :goto_5
    move v5, v2

    :cond_e
    new-instance v0, Lcom/jieli/jl_rcsp/model/response/AIOperateResponse;

    invoke-direct {v0, v5}, Lcom/jieli/jl_rcsp/model/response/AIOperateResponse;-><init>(I)V

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/response/AIOperateResponse;->setData([B)Lcom/jieli/jl_rcsp/model/response/AIOperateResponse;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/jieli/jl_rcsp/model/base/BaseResponse;->setRawData([B)V

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p2

    invoke-virtual {v0, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    return-object p1

    :cond_f
    :goto_6
    return-object v0
.end method
