.class public Lcom/jieli/jl_rcsp/model/cmdHandler/ReadErrorMsgCmdHandler;
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
    .locals 3

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result v0

    const/16 v1, 0x29

    if-eq v0, v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    new-instance p1, Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ReadErrorMsgParam;

    invoke-direct {p1}, Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ReadErrorMsgParam;-><init>()V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getParamData()[B

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ReadErrorMsgParam;->parseData([B)V

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd;

    invoke-direct {v0, p1}, Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ReadErrorMsgParam;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-static {}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getInstance()Lcom/jieli/jl_rcsp/tool/CommandHelper;

    move-result-object v0

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result v1

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getCommand(Landroid/bluetooth/BluetoothDevice;II)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    if-nez p1, :cond_2

    new-instance p1, Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd;

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ReadErrorMsgParam;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ReadErrorMsgParam;-><init>()V

    invoke-direct {p1, v0}, Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ReadErrorMsgParam;)V

    goto :goto_0

    :cond_2
    check-cast p1, Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd;

    :goto_0
    new-instance v0, Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ReadErrorMsgResponse;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ReadErrorMsgResponse;-><init>()V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getParamData()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ReadErrorMsgResponse;->parseData([B)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1

    :cond_3
    :goto_1
    const/4 p1, 0x0

    return-object p1
.end method
