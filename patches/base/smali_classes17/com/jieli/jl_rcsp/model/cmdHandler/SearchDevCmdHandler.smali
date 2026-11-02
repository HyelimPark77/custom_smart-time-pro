.class public Lcom/jieli/jl_rcsp/model/cmdHandler/SearchDevCmdHandler;
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

    const/16 v2, 0x19

    if-eq v1, v2, :cond_1

    return-object v0

    :cond_1
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getParamData()[B

    move-result-object v0

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getType()I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v1, v2, :cond_7

    if-eqz v0, :cond_6

    array-length p1, v0

    if-lez p1, :cond_6

    aget-byte p1, v0, v3

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result p1

    array-length v1, v0

    if-le v1, v2, :cond_5

    aget-byte v1, v0, v2

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v1

    array-length v2, v0

    const/4 v4, 0x3

    if-le v2, v4, :cond_4

    const/4 v2, 0x2

    aget-byte v2, v0, v2

    aget-byte v4, v0, v4

    invoke-static {v2, v4}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt(BB)I

    move-result v2

    array-length v4, v0

    const/4 v5, 0x4

    if-le v4, v5, :cond_3

    aget-byte v4, v0, v5

    invoke-static {v4}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v4

    array-length v5, v0

    const/4 v6, 0x5

    if-le v5, v6, :cond_2

    aget-byte v0, v0, v6

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v3

    :cond_2
    move v0, v3

    move v3, v4

    goto :goto_1

    :cond_3
    move v0, v3

    goto :goto_1

    :cond_4
    move v0, v3

    move v2, v0

    goto :goto_1

    :cond_5
    move v0, v3

    :goto_0
    move v1, v0

    move v2, v1

    goto :goto_1

    :cond_6
    move p1, v3

    move v0, p1

    goto :goto_0

    :goto_1
    new-instance v4, Lcom/jieli/jl_rcsp/model/command/SearchDevCmd;

    new-instance v5, Lcom/jieli/jl_rcsp/model/parameter/SearchDevParam;

    invoke-direct {v5, p1, v1, v2}, Lcom/jieli/jl_rcsp/model/parameter/SearchDevParam;-><init>(III)V

    invoke-virtual {v5, v3}, Lcom/jieli/jl_rcsp/model/parameter/SearchDevParam;->setWay(I)Lcom/jieli/jl_rcsp/model/parameter/SearchDevParam;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/parameter/SearchDevParam;->setPlayer(I)Lcom/jieli/jl_rcsp/model/parameter/SearchDevParam;

    move-result-object p1

    invoke-direct {v4, p1}, Lcom/jieli/jl_rcsp/model/command/SearchDevCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/SearchDevParam;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p1

    invoke-virtual {v4, p1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    return-object p1

    :cond_7
    invoke-static {}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getInstance()Lcom/jieli/jl_rcsp/tool/CommandHelper;

    move-result-object v1

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result v2

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v4

    invoke-virtual {v1, p1, v2, v4}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getCommand(Landroid/bluetooth/BluetoothDevice;II)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    if-eqz v0, :cond_8

    array-length v1, v0

    if-lez v1, :cond_8

    new-instance v1, Lcom/jieli/jl_rcsp/model/response/SearchDevResponse;

    aget-byte v2, v0, v3

    invoke-static {v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v2

    invoke-direct {v1, v2}, Lcom/jieli/jl_rcsp/model/response/SearchDevResponse;-><init>(I)V

    goto :goto_2

    :cond_8
    new-instance v1, Lcom/jieli/jl_rcsp/model/response/SearchDevResponse;

    invoke-direct {v1, v3}, Lcom/jieli/jl_rcsp/model/response/SearchDevResponse;-><init>(I)V

    :goto_2
    invoke-virtual {v1, v0}, Lcom/jieli/jl_rcsp/model/base/BaseResponse;->setRawData([B)V

    if-eqz p1, :cond_9

    check-cast p1, Lcom/jieli/jl_rcsp/model/command/SearchDevCmd;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1

    :cond_9
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/SearchDevCmd;

    new-instance v0, Lcom/jieli/jl_rcsp/model/parameter/SearchDevParam;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/parameter/SearchDevParam;-><init>()V

    invoke-direct {p1, v0}, Lcom/jieli/jl_rcsp/model/command/SearchDevCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/SearchDevParam;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1
.end method
