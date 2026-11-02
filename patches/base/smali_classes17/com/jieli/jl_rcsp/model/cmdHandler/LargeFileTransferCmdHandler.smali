.class public Lcom/jieli/jl_rcsp/model/cmdHandler/LargeFileTransferCmdHandler;
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

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getParamData()[B

    move-result-object v2

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getType()I

    move-result v3

    const-string v4, ""

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-ne v3, v5, :cond_8

    const/4 p1, 0x4

    const/4 v3, 0x6

    packed-switch v1, :pswitch_data_0

    :pswitch_0
    goto/16 :goto_3

    :pswitch_1
    if-eqz v2, :cond_1

    array-length p1, v2

    if-lez p1, :cond_1

    aget-byte v6, v2, v6

    :cond_1
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/NotifyPrepareEnvCmd;

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/NotifyPrepareEnvCmd$Param;

    invoke-direct {v0, v6}, Lcom/jieli/jl_rcsp/model/command/NotifyPrepareEnvCmd$Param;-><init>(B)V

    invoke-direct {p1, v0}, Lcom/jieli/jl_rcsp/model/command/NotifyPrepareEnvCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/NotifyPrepareEnvCmd$Param;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    return-object p1

    :pswitch_2
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/file_op/LargeFileTransferGetNameCmd;

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/file_op/LargeFileTransferGetNameCmd$Param;

    invoke-direct {v0, v4, v6}, Lcom/jieli/jl_rcsp/model/command/file_op/LargeFileTransferGetNameCmd$Param;-><init>(Ljava/lang/String;I)V

    invoke-direct {p1, v0}, Lcom/jieli/jl_rcsp/model/command/file_op/LargeFileTransferGetNameCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/file_op/LargeFileTransferGetNameCmd$Param;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    return-object p1

    :pswitch_3
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/file_op/CancelLargeFileTransferCmd;

    invoke-direct {p1}, Lcom/jieli/jl_rcsp/model/command/file_op/CancelLargeFileTransferCmd;-><init>()V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    return-object p1

    :pswitch_4
    if-eqz v2, :cond_4

    array-length v0, v2

    if-lez v0, :cond_4

    aget-byte v0, v2, v6

    array-length v1, v2

    const/4 v4, 0x2

    if-le v1, v4, :cond_2

    aget-byte v1, v2, v5

    aget-byte v4, v2, v4

    invoke-static {v1, v4}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToShort(BB)S

    move-result v1

    goto :goto_0

    :cond_2
    move v1, v6

    :goto_0
    array-length v4, v2

    if-le v4, v3, :cond_3

    const/4 v3, 0x3

    invoke-static {v2, v3, p1}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v6

    :cond_3
    move p1, v6

    move v6, v0

    goto :goto_1

    :cond_4
    move p1, v6

    move v1, p1

    :goto_1
    new-instance v0, Lcom/jieli/jl_rcsp/model/command/file_op/LargeFileTransferOpCmd;

    new-instance v2, Lcom/jieli/jl_rcsp/model/parameter/LargeFileTransferOpParam;

    invoke-direct {v2, v6, v1, p1}, Lcom/jieli/jl_rcsp/model/parameter/LargeFileTransferOpParam;-><init>(BSI)V

    invoke-direct {v0, v2}, Lcom/jieli/jl_rcsp/model/command/file_op/LargeFileTransferOpCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/LargeFileTransferOpParam;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    return-object p1

    :pswitch_5
    if-eqz v2, :cond_5

    array-length p1, v2

    if-lez p1, :cond_5

    aget-byte v6, v2, v6

    :cond_5
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/file_op/StopLargeFileTransferCmd$Param;

    invoke-direct {p1, v6}, Lcom/jieli/jl_rcsp/model/command/file_op/StopLargeFileTransferCmd$Param;-><init>(I)V

    invoke-virtual {p1, v2}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;->setParamData([B)Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/file_op/StopLargeFileTransferCmd;

    invoke-direct {v0, p1}, Lcom/jieli/jl_rcsp/model/command/file_op/StopLargeFileTransferCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/file_op/StopLargeFileTransferCmd$Param;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    return-object p1

    :pswitch_6
    new-array v0, v6, [B

    if-eqz v2, :cond_6

    array-length v1, v2

    const/4 v4, 0x5

    if-le v1, v4, :cond_6

    invoke-static {v2, v6, p1}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v6

    aget-byte p1, v2, p1

    aget-byte v1, v2, v4

    invoke-static {p1, v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToShort(BB)S

    move-result p1

    array-length v1, v2

    add-int/lit8 v4, v1, -0x6

    if-lez v4, :cond_7

    invoke-static {v2, v3, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v0

    goto :goto_2

    :cond_6
    move p1, v6

    :cond_7
    :goto_2
    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/StartLargeFileTransferParam;

    invoke-direct {v1, v0, v6, p1}, Lcom/jieli/jl_rcsp/model/parameter/StartLargeFileTransferParam;-><init>([BIS)V

    new-instance p1, Lcom/jieli/jl_rcsp/model/command/file_op/StartLargeFileTransferCmd;

    invoke-direct {p1, v1}, Lcom/jieli/jl_rcsp/model/command/file_op/StartLargeFileTransferCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/StartLargeFileTransferParam;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    return-object p1

    :cond_8
    invoke-static {}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getInstance()Lcom/jieli/jl_rcsp/tool/CommandHelper;

    move-result-object v3

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v7

    invoke-virtual {v3, p1, v1, v7}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getCommand(Landroid/bluetooth/BluetoothDevice;II)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    packed-switch v1, :pswitch_data_1

    :goto_3
    :pswitch_7
    return-object v0

    :pswitch_8
    instance-of v0, p1, Lcom/jieli/jl_rcsp/model/command/NotifyPrepareEnvCmd;

    if-eqz v0, :cond_9

    check-cast p1, Lcom/jieli/jl_rcsp/model/command/NotifyPrepareEnvCmd;

    goto :goto_4

    :cond_9
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/NotifyPrepareEnvCmd;

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/NotifyPrepareEnvCmd$Param;

    invoke-direct {v0, v6}, Lcom/jieli/jl_rcsp/model/command/NotifyPrepareEnvCmd$Param;-><init>(B)V

    invoke-direct {p1, v0}, Lcom/jieli/jl_rcsp/model/command/NotifyPrepareEnvCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/NotifyPrepareEnvCmd$Param;)V

    :goto_4
    new-instance v0, Lcom/jieli/jl_rcsp/model/base/CommonResponse;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/base/CommonResponse;-><init>()V

    invoke-virtual {v0, v2}, Lcom/jieli/jl_rcsp/model/base/BaseResponse;->setRawData([B)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1

    :pswitch_9
    instance-of v0, p1, Lcom/jieli/jl_rcsp/model/command/file_op/LargeFileTransferGetNameCmd;

    if-eqz v0, :cond_a

    check-cast p1, Lcom/jieli/jl_rcsp/model/command/file_op/LargeFileTransferGetNameCmd;

    goto :goto_5

    :cond_a
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/file_op/LargeFileTransferGetNameCmd;

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/file_op/LargeFileTransferGetNameCmd$Param;

    invoke-direct {v0, v4, v6}, Lcom/jieli/jl_rcsp/model/command/file_op/LargeFileTransferGetNameCmd$Param;-><init>(Ljava/lang/String;I)V

    invoke-direct {p1, v0}, Lcom/jieli/jl_rcsp/model/command/file_op/LargeFileTransferGetNameCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/file_op/LargeFileTransferGetNameCmd$Param;)V

    :goto_5
    new-instance v0, Lcom/jieli/jl_rcsp/model/base/CommonResponse;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/base/CommonResponse;-><init>()V

    invoke-virtual {v0, v2}, Lcom/jieli/jl_rcsp/model/base/BaseResponse;->setRawData([B)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1

    :pswitch_a
    instance-of v0, p1, Lcom/jieli/jl_rcsp/model/command/file_op/CancelLargeFileTransferCmd;

    if-eqz v0, :cond_b

    check-cast p1, Lcom/jieli/jl_rcsp/model/command/file_op/CancelLargeFileTransferCmd;

    goto :goto_6

    :cond_b
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/file_op/CancelLargeFileTransferCmd;

    invoke-direct {p1}, Lcom/jieli/jl_rcsp/model/command/file_op/CancelLargeFileTransferCmd;-><init>()V

    :goto_6
    new-instance v0, Lcom/jieli/jl_rcsp/model/base/CommonResponse;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/base/CommonResponse;-><init>()V

    invoke-virtual {v0, v2}, Lcom/jieli/jl_rcsp/model/base/BaseResponse;->setRawData([B)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1

    :pswitch_b
    instance-of v0, p1, Lcom/jieli/jl_rcsp/model/command/file_op/LargeFileTransferOpCmd;

    if-eqz v0, :cond_c

    check-cast p1, Lcom/jieli/jl_rcsp/model/command/file_op/LargeFileTransferOpCmd;

    goto :goto_7

    :cond_c
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/file_op/LargeFileTransferOpCmd;

    new-instance v0, Lcom/jieli/jl_rcsp/model/parameter/LargeFileTransferOpParam;

    invoke-direct {v0, v6, v6, v6}, Lcom/jieli/jl_rcsp/model/parameter/LargeFileTransferOpParam;-><init>(BSI)V

    invoke-direct {p1, v0}, Lcom/jieli/jl_rcsp/model/command/file_op/LargeFileTransferOpCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/LargeFileTransferOpParam;)V

    :goto_7
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    return-object p1

    :pswitch_c
    instance-of v0, p1, Lcom/jieli/jl_rcsp/model/command/file_op/StopLargeFileTransferCmd;

    if-eqz v0, :cond_d

    check-cast p1, Lcom/jieli/jl_rcsp/model/command/file_op/StopLargeFileTransferCmd;

    goto :goto_8

    :cond_d
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/file_op/StopLargeFileTransferCmd;

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/file_op/StopLargeFileTransferCmd$Param;

    invoke-direct {v0, v6}, Lcom/jieli/jl_rcsp/model/command/file_op/StopLargeFileTransferCmd$Param;-><init>(I)V

    invoke-direct {p1, v0}, Lcom/jieli/jl_rcsp/model/command/file_op/StopLargeFileTransferCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/file_op/StopLargeFileTransferCmd$Param;)V

    :goto_8
    new-instance v0, Lcom/jieli/jl_rcsp/model/base/CommonResponse;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/base/CommonResponse;-><init>()V

    invoke-virtual {v0, v2}, Lcom/jieli/jl_rcsp/model/base/BaseResponse;->setRawData([B)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1

    :pswitch_d
    new-instance v0, Lcom/jieli/jl_rcsp/model/response/StartLargeFileTransferResponse;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/response/StartLargeFileTransferResponse;-><init>()V

    invoke-virtual {v0, v2}, Lcom/jieli/jl_rcsp/model/base/BaseResponse;->setRawData([B)V

    array-length v1, v2

    if-le v1, v5, :cond_e

    aget-byte v1, v2, v6

    aget-byte v2, v2, v5

    invoke-static {v1, v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToShort(BB)S

    move-result v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/response/StartLargeFileTransferResponse;->setTransferMtu(S)V

    :cond_e
    instance-of v1, p1, Lcom/jieli/jl_rcsp/model/command/file_op/StartLargeFileTransferCmd;

    if-eqz v1, :cond_f

    check-cast p1, Lcom/jieli/jl_rcsp/model/command/file_op/StartLargeFileTransferCmd;

    goto :goto_9

    :cond_f
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/file_op/StartLargeFileTransferCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/StartLargeFileTransferParam;

    new-array v2, v6, [B

    invoke-direct {v1, v2, v6, v6}, Lcom/jieli/jl_rcsp/model/parameter/StartLargeFileTransferParam;-><init>([BIS)V

    invoke-direct {p1, v1}, Lcom/jieli/jl_rcsp/model/command/file_op/StartLargeFileTransferCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/StartLargeFileTransferParam;)V

    :goto_9
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1b
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1b
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_7
        :pswitch_9
        :pswitch_8
    .end packed-switch
.end method
