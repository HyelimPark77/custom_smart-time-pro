.class public Lcom/jieli/jl_rcsp/model/cmdHandler/NotifyCommunicationWayCmdHandler;
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

    const/16 v2, 0xb

    if-eq v1, v2, :cond_1

    return-object v0

    :cond_1
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getParamData()[B

    move-result-object v0

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getType()I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v1, v2, :cond_3

    if-eqz v0, :cond_2

    array-length p1, v0

    if-le p1, v2, :cond_2

    aget-byte p1, v0, v3

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v3

    aget-byte p1, v0, v2

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result p1

    goto :goto_0

    :cond_2
    move p1, v3

    :goto_0
    new-instance v0, Lcom/jieli/jl_rcsp/model/command/NotifyCommunicationWayCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/NotifyCommunicationWayParam;

    invoke-direct {v1, v3, p1}, Lcom/jieli/jl_rcsp/model/parameter/NotifyCommunicationWayParam;-><init>(II)V

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/command/NotifyCommunicationWayCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/NotifyCommunicationWayParam;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    return-object p1

    :cond_3
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

    if-eqz p1, :cond_4

    check-cast p1, Lcom/jieli/jl_rcsp/model/command/NotifyCommunicationWayCmd;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1

    :cond_4
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/NotifyCommunicationWayCmd;

    new-instance v0, Lcom/jieli/jl_rcsp/model/parameter/NotifyCommunicationWayParam;

    invoke-direct {v0, v3, v3}, Lcom/jieli/jl_rcsp/model/parameter/NotifyCommunicationWayParam;-><init>(II)V

    invoke-direct {p1, v0}, Lcom/jieli/jl_rcsp/model/command/NotifyCommunicationWayCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/NotifyCommunicationWayParam;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1
.end method
