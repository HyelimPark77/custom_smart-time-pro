.class public Lcom/jieli/jl_rcsp/model/cmdHandler/DataTransferCmdHandler;
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

    if-eqz p2, :cond_b

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result v0

    const/16 v1, 0x30

    if-eq v0, v1, :cond_0

    goto/16 :goto_4

    :cond_0
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getHasResponse()I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-nez v0, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getParamData()[B

    move-result-object v3

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getType()I

    move-result v4

    if-ne v4, v2, :cond_6

    new-instance p1, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$Param;

    invoke-direct {p1, v3}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$Param;-><init>([B)V

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$Param;->getOp()I

    move-result v4

    if-eqz v4, :cond_4

    if-eq v4, v2, :cond_3

    if-eq v4, v1, :cond_2

    goto :goto_1

    :cond_2
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$CancelTransferParam;

    invoke-direct {p1, v3}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$CancelTransferParam;-><init>([B)V

    goto :goto_1

    :cond_3
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;

    invoke-direct {p1, v3}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;-><init>([B)V

    goto :goto_1

    :cond_4
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$TransferParam;

    invoke-direct {p1, v3}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$TransferParam;-><init>([B)V

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$TransferParam;->getWay()I

    move-result p1

    if-ne p1, v2, :cond_5

    new-instance p1, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataParam;

    invoke-direct {p1, v3}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataParam;-><init>([B)V

    goto :goto_1

    :cond_5
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$ReadDataParam;

    invoke-direct {p1, v3}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$ReadDataParam;-><init>([B)V

    :goto_1
    new-instance v1, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd;

    invoke-direct {v1, v0, p1}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd;-><init>(ILcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$Param;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p1

    invoke-virtual {v1, p1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    return-object p1

    :cond_6
    invoke-static {}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getInstance()Lcom/jieli/jl_rcsp/tool/CommandHelper;

    move-result-object v0

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result v1

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v4

    invoke-virtual {v0, p1, v1, v4}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getCommand(Landroid/bluetooth/BluetoothDevice;II)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    if-nez p1, :cond_7

    new-instance p1, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd;

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$Param;

    const/4 v1, 0x0

    new-array v1, v1, [B

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$Param;-><init>([B)V

    invoke-direct {p1, v0}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$Param;)V

    goto :goto_2

    :cond_7
    check-cast p1, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd;

    :goto_2
    new-instance v0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$Response;

    invoke-direct {v0, v3}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$Response;-><init>([B)V

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$Response;->getOp()I

    move-result v1

    if-eqz v1, :cond_9

    if-eq v1, v2, :cond_8

    goto :goto_3

    :cond_8
    new-instance v0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferResponse;

    invoke-direct {v0, v3}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferResponse;-><init>([B)V

    goto :goto_3

    :cond_9
    new-instance v0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$TransferParamResponse;

    invoke-direct {v0, v3}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$TransferParamResponse;-><init>([B)V

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$TransferParamResponse;->getWay()I

    move-result v0

    if-ne v0, v2, :cond_a

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataResponse;

    invoke-direct {v0, v3}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataResponse;-><init>([B)V

    goto :goto_3

    :cond_a
    new-instance v0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$ReadDataResponse;

    invoke-direct {v0, v3}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$ReadDataResponse;-><init>([B)V

    :goto_3
    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    return-object p1

    :cond_b
    :goto_4
    const/4 p1, 0x0

    return-object p1
.end method
