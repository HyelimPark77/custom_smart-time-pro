.class public Lcom/jieli/jl_rcsp/model/cmdHandler/FileTransferCmdHandler;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/cmd/ICmdHandler;


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


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

    const/16 v2, 0x16

    if-eq v1, v2, :cond_1

    const/16 v2, 0x17

    if-eq v1, v2, :cond_1

    const/16 v2, 0x18

    if-ne v1, v2, :cond_7

    :cond_1
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getParamData()[B

    move-result-object v2

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getType()I

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-ne v3, v4, :cond_6

    packed-switch v1, :pswitch_data_0

    goto/16 :goto_2

    :pswitch_0
    if-eqz v2, :cond_2

    array-length p1, v2

    if-lez p1, :cond_2

    aget-byte p1, v2, v5

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v5

    :cond_2
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/file_op/NotifyFileTransferOpCmd;

    new-instance v0, Lcom/jieli/jl_rcsp/model/parameter/NotifyFileTransferParam;

    invoke-direct {v0, v5}, Lcom/jieli/jl_rcsp/model/parameter/NotifyFileTransferParam;-><init>(I)V

    invoke-direct {p1, v0}, Lcom/jieli/jl_rcsp/model/command/file_op/NotifyFileTransferOpCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/NotifyFileTransferParam;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    return-object p1

    :pswitch_1
    if-eqz v2, :cond_3

    array-length p1, v2

    if-lez p1, :cond_3

    aget-byte p1, v2, v5

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v5

    :cond_3
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/file_op/StopFileTransferCmd;

    new-instance v0, Lcom/jieli/jl_rcsp/model/parameter/StopFileTransferParam;

    invoke-direct {v0, v5}, Lcom/jieli/jl_rcsp/model/parameter/StopFileTransferParam;-><init>(I)V

    invoke-direct {p1, v0}, Lcom/jieli/jl_rcsp/model/command/file_op/StopFileTransferCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/StopFileTransferParam;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    return-object p1

    :pswitch_2
    if-eqz v2, :cond_4

    array-length p1, v2

    const/4 v0, 0x5

    if-le p1, v0, :cond_4

    aget-byte p1, v2, v5

    const/4 v1, 0x4

    invoke-static {v2, v4, v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v1

    new-instance v3, Ljava/lang/String;

    array-length v6, v2

    sub-int/2addr v6, v0

    sget-object v7, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v3, v2, v0, v6, v7}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    goto :goto_0

    :cond_4
    const-string v3, ""

    move p1, v5

    move v1, p1

    :goto_0
    new-instance v0, Lcom/jieli/jl_rcsp/model/parameter/StartFileTransferParam;

    invoke-direct {v0, v3, v1}, Lcom/jieli/jl_rcsp/model/parameter/StartFileTransferParam;-><init>(Ljava/lang/String;I)V

    and-int/2addr p1, v4

    if-ne p1, v4, :cond_5

    goto :goto_1

    :cond_5
    move v4, v5

    :goto_1
    invoke-virtual {v0, v4}, Lcom/jieli/jl_rcsp/model/parameter/StartFileTransferParam;->enableDataNeedResponse(Z)Lcom/jieli/jl_rcsp/model/parameter/StartFileTransferParam;

    new-instance p1, Lcom/jieli/jl_rcsp/model/command/file_op/StartFileTransferCmd;

    invoke-direct {p1, v0}, Lcom/jieli/jl_rcsp/model/command/file_op/StartFileTransferCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/StartFileTransferParam;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    return-object p1

    :cond_6
    invoke-static {}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getInstance()Lcom/jieli/jl_rcsp/tool/CommandHelper;

    move-result-object v3

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v4

    invoke-virtual {v3, p1, v1, v4}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getCommand(Landroid/bluetooth/BluetoothDevice;II)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    packed-switch v1, :pswitch_data_1

    :cond_7
    :goto_2
    return-object v0

    :pswitch_3
    new-instance v0, Lcom/jieli/jl_rcsp/model/base/CommonResponse;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/base/CommonResponse;-><init>()V

    invoke-virtual {v0, v2}, Lcom/jieli/jl_rcsp/model/base/BaseResponse;->setRawData([B)V

    if-eqz p1, :cond_8

    check-cast p1, Lcom/jieli/jl_rcsp/model/command/file_op/NotifyFileTransferOpCmd;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1

    :cond_8
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/file_op/NotifyFileTransferOpCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/NotifyFileTransferParam;

    invoke-direct {v1, v5}, Lcom/jieli/jl_rcsp/model/parameter/NotifyFileTransferParam;-><init>(I)V

    invoke-direct {p1, v1}, Lcom/jieli/jl_rcsp/model/command/file_op/NotifyFileTransferOpCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/NotifyFileTransferParam;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1

    :pswitch_4
    if-eqz v2, :cond_9

    array-length v0, v2

    if-lez v0, :cond_9

    aget-byte v0, v2, v5

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v0

    goto :goto_3

    :cond_9
    move v0, v5

    :goto_3
    new-instance v1, Lcom/jieli/jl_rcsp/model/response/StopFileTransferResponse;

    invoke-direct {v1}, Lcom/jieli/jl_rcsp/model/response/StopFileTransferResponse;-><init>()V

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/base/BaseResponse;->setRawData([B)V

    invoke-virtual {v1, v0}, Lcom/jieli/jl_rcsp/model/response/StopFileTransferResponse;->setReason(I)Lcom/jieli/jl_rcsp/model/response/StopFileTransferResponse;

    if-eqz p1, :cond_a

    check-cast p1, Lcom/jieli/jl_rcsp/model/command/file_op/StopFileTransferCmd;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1

    :cond_a
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/file_op/StopFileTransferCmd;

    new-instance v0, Lcom/jieli/jl_rcsp/model/parameter/StopFileTransferParam;

    invoke-direct {v0, v5}, Lcom/jieli/jl_rcsp/model/parameter/StopFileTransferParam;-><init>(I)V

    invoke-direct {p1, v0}, Lcom/jieli/jl_rcsp/model/command/file_op/StopFileTransferCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/StopFileTransferParam;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1

    :pswitch_5
    new-instance v0, Lcom/jieli/jl_rcsp/model/response/StartFileTranferResponse;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/response/StartFileTranferResponse;-><init>()V

    invoke-virtual {v0, v2}, Lcom/jieli/jl_rcsp/model/base/BaseResponse;->setRawData([B)V

    if-eqz p1, :cond_b

    check-cast p1, Lcom/jieli/jl_rcsp/model/command/file_op/StartFileTransferCmd;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1

    :cond_b
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/file_op/StartFileTransferCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/StartFileTransferParam;

    const-string v2, "./"

    invoke-direct {v1, v2, v5}, Lcom/jieli/jl_rcsp/model/parameter/StartFileTransferParam;-><init>(Ljava/lang/String;I)V

    invoke-direct {p1, v1}, Lcom/jieli/jl_rcsp/model/command/file_op/StartFileTransferCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/StartFileTransferParam;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x16
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x16
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method
