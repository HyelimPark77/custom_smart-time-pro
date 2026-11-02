.class public Lcom/jieli/jl_rcsp/model/cmdHandler/QueryPhoneBtInfoCmdHandler;
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

    const/16 v2, 0x31

    if-eq v1, v2, :cond_1

    return-object v0

    :cond_1
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getParamData()[B

    move-result-object v2

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getHasResponse()I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_2

    const/4 v3, 0x2

    goto :goto_0

    :cond_2
    move v3, v4

    :goto_0
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getType()I

    move-result v5

    if-ne v5, v4, :cond_3

    new-instance p1, Lcom/jieli/jl_rcsp/model/command/double_connect/QueryPhoneBtInfoCmd$NotifyParam;

    invoke-direct {p1}, Lcom/jieli/jl_rcsp/model/command/double_connect/QueryPhoneBtInfoCmd$NotifyParam;-><init>()V

    invoke-virtual {p1, v2}, Lcom/jieli/jl_rcsp/model/command/double_connect/QueryPhoneBtInfoCmd$NotifyParam;->parseData([B)I

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/double_connect/QueryPhoneBtInfoCmd;

    invoke-direct {v0, v3, p1}, Lcom/jieli/jl_rcsp/model/command/double_connect/QueryPhoneBtInfoCmd;-><init>(ILcom/jieli/jl_rcsp/model/command/double_connect/QueryPhoneBtInfoCmd$Param;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-static {}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getInstance()Lcom/jieli/jl_rcsp/tool/CommandHelper;

    move-result-object v3

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v4

    invoke-virtual {v3, p1, v1, v4}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getCommand(Landroid/bluetooth/BluetoothDevice;II)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    if-nez p1, :cond_4

    new-instance p1, Lcom/jieli/jl_rcsp/model/command/double_connect/QueryPhoneBtInfoCmd;

    invoke-direct {p1, v0}, Lcom/jieli/jl_rcsp/model/command/double_connect/QueryPhoneBtInfoCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/double_connect/QueryPhoneBtInfoCmd$Param;)V

    goto :goto_1

    :cond_4
    check-cast p1, Lcom/jieli/jl_rcsp/model/command/double_connect/QueryPhoneBtInfoCmd;

    :goto_1
    new-instance v0, Lcom/jieli/jl_rcsp/model/command/double_connect/QueryPhoneBtInfoCmd$Response;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/command/double_connect/QueryPhoneBtInfoCmd$Response;-><init>()V

    invoke-virtual {v0, v2}, Lcom/jieli/jl_rcsp/model/base/BaseResponse;->setRawData([B)V

    invoke-virtual {v0, v2}, Lcom/jieli/jl_rcsp/model/command/double_connect/QueryPhoneBtInfoCmd$Response;->parseData([B)I

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1
.end method
