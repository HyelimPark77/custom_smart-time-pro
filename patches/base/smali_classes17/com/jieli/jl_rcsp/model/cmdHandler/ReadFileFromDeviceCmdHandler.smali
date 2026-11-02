.class public Lcom/jieli/jl_rcsp/model/cmdHandler/ReadFileFromDeviceCmdHandler;
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
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getParamData()[B

    move-result-object v1

    if-eqz v1, :cond_a

    array-length v2, v1

    if-nez v2, :cond_1

    goto/16 :goto_2

    :cond_1
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getType()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ne v2, v4, :cond_6

    aget-byte p1, v1, v3

    const/16 v0, -0x80

    if-ne p1, v0, :cond_3

    new-instance p1, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$StopParam;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result v0

    if-nez v0, :cond_2

    aget-byte v3, v1, v4

    :cond_2
    invoke-direct {p1, v3}, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$StopParam;-><init>(B)V

    goto :goto_0

    :cond_3
    const/16 v0, -0x7f

    if-ne p1, v0, :cond_5

    new-instance p1, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$CancelParam;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result v0

    if-nez v0, :cond_4

    aget-byte v3, v1, v4

    :cond_4
    invoke-direct {p1, v3}, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$CancelParam;-><init>(B)V

    goto :goto_0

    :cond_5
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$Param;

    const/4 v0, -0x1

    invoke-direct {p1, v0}, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$Param;-><init>(B)V

    :goto_0
    new-instance v0, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd;

    invoke-direct {v0, p1}, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$Param;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    return-object v0

    :cond_6
    invoke-static {}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getInstance()Lcom/jieli/jl_rcsp/tool/CommandHelper;

    move-result-object v2

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result v5

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v6

    invoke-virtual {v2, p1, v5, v6}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getCommand(Landroid/bluetooth/BluetoothDevice;II)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    if-nez p1, :cond_7

    new-instance p1, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd;

    invoke-direct {p1, v0}, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$Param;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    return-object p1

    :cond_7
    check-cast p1, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getParam()Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    move-result-object v0

    check-cast v0, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$Param;

    iget-byte v0, v0, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$Param;->op:B

    if-eqz v0, :cond_8

    if-eq v0, v4, :cond_8

    const/4 v2, 0x2

    if-eq v0, v2, :cond_8

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$Response;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$Response;-><init>()V

    goto :goto_1

    :cond_8
    new-instance v0, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$StartResponse;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result v2

    if-nez v2, :cond_9

    const/4 v2, 0x4

    invoke-static {v1, v4, v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v3

    :cond_9
    invoke-direct {v0, v3}, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$StartResponse;-><init>(I)V

    :goto_1
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getParamData()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/base/BaseResponse;->setRawData([B)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1

    :cond_a
    :goto_2
    return-object v0
.end method
