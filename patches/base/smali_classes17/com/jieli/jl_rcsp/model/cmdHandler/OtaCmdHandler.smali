.class public Lcom/jieli/jl_rcsp/model/cmdHandler/OtaCmdHandler;
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
    .locals 9

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result v1

    const/16 v2, 0xe1

    if-eq v1, v2, :cond_1

    const/16 v2, 0xe2

    if-eq v1, v2, :cond_1

    const/16 v2, 0xe3

    if-eq v1, v2, :cond_1

    const/16 v2, 0xe4

    if-eq v1, v2, :cond_1

    const/16 v2, 0xe5

    if-eq v1, v2, :cond_1

    const/16 v2, 0xe6

    if-eq v1, v2, :cond_1

    const/16 v2, 0xe7

    if-eq v1, v2, :cond_1

    const/16 v2, 0xe8

    if-ne v1, v2, :cond_8

    :cond_1
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getParamData()[B

    move-result-object v2

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getType()I

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x5

    const/4 v6, 0x6

    const/4 v7, 0x4

    const/4 v8, 0x0

    if-ne v3, v4, :cond_7

    packed-switch v1, :pswitch_data_0

    goto/16 :goto_3

    :pswitch_0
    if-eqz v2, :cond_2

    array-length p1, v2

    if-lt p1, v7, :cond_2

    new-array p1, v7, [B

    invoke-static {v2, v8, p1, v8, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([B)I

    move-result v0

    array-length v1, v2

    const/16 v3, 0x8

    if-lt v1, v3, :cond_3

    invoke-static {v2, v7, p1, v8, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([B)I

    move-result v8

    goto :goto_0

    :cond_2
    move v0, v8

    :cond_3
    :goto_0
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/upgrade/NotifyUpdateContentSizeCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/NotifyUpdateContentSizeParam;

    invoke-direct {v1, v0}, Lcom/jieli/jl_rcsp/model/parameter/NotifyUpdateContentSizeParam;-><init>(I)V

    invoke-virtual {v1, v8}, Lcom/jieli/jl_rcsp/model/parameter/NotifyUpdateContentSizeParam;->setCurrentProgress(I)Lcom/jieli/jl_rcsp/model/parameter/NotifyUpdateContentSizeParam;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/jieli/jl_rcsp/model/command/upgrade/NotifyUpdateContentSizeCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/NotifyUpdateContentSizeParam;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    return-object p1

    :pswitch_1
    if-eqz v2, :cond_4

    array-length p1, v2

    if-lez p1, :cond_4

    aget-byte p1, v2, v8

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v8

    :cond_4
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/upgrade/RebootDeviceCmd;

    new-instance v0, Lcom/jieli/jl_rcsp/model/parameter/RebootDeviceParam;

    invoke-direct {v0, v8}, Lcom/jieli/jl_rcsp/model/parameter/RebootDeviceParam;-><init>(I)V

    invoke-direct {p1, v0}, Lcom/jieli/jl_rcsp/model/command/upgrade/RebootDeviceCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/RebootDeviceParam;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    return-object p1

    :pswitch_2
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/upgrade/FirmwareUpdateStatusCmd;

    invoke-direct {p1}, Lcom/jieli/jl_rcsp/model/command/upgrade/FirmwareUpdateStatusCmd;-><init>()V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    return-object p1

    :pswitch_3
    if-eqz v2, :cond_5

    array-length p1, v2

    if-lt p1, v6, :cond_5

    new-array p1, v7, [B

    invoke-static {v2, v8, p1, v8, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([B)I

    move-result v8

    aget-byte p1, v2, v7

    aget-byte v0, v2, v5

    invoke-static {p1, v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt(BB)I

    move-result p1

    goto :goto_1

    :cond_5
    move p1, v8

    :goto_1
    new-instance v0, Lcom/jieli/jl_rcsp/model/command/upgrade/FirmwareUpdateBlockCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/FirmwareUpdateBlockParam;

    invoke-direct {v1, v8, p1}, Lcom/jieli/jl_rcsp/model/parameter/FirmwareUpdateBlockParam;-><init>(II)V

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/command/upgrade/FirmwareUpdateBlockCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/FirmwareUpdateBlockParam;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    return-object p1

    :pswitch_4
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/upgrade/ExitUpdateModeCmd;

    invoke-direct {p1}, Lcom/jieli/jl_rcsp/model/command/upgrade/ExitUpdateModeCmd;-><init>()V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/upgrade/EnterUpdateModeCmd;

    invoke-direct {p1}, Lcom/jieli/jl_rcsp/model/command/upgrade/EnterUpdateModeCmd;-><init>()V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    return-object p1

    :pswitch_6
    new-array p1, v8, [B

    if-eqz v2, :cond_6

    array-length v0, v2

    if-lez v0, :cond_6

    goto :goto_2

    :cond_6
    move-object v2, p1

    :goto_2
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/upgrade/InquireUpdateCmd;

    new-instance v0, Lcom/jieli/jl_rcsp/model/parameter/InquireUpdateParam;

    invoke-direct {v0, v2}, Lcom/jieli/jl_rcsp/model/parameter/InquireUpdateParam;-><init>([B)V

    invoke-direct {p1, v0}, Lcom/jieli/jl_rcsp/model/command/upgrade/InquireUpdateCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/InquireUpdateParam;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    return-object p1

    :pswitch_7
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/upgrade/GetUpdateFileOffsetCmd;

    invoke-direct {p1}, Lcom/jieli/jl_rcsp/model/command/upgrade/GetUpdateFileOffsetCmd;-><init>()V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    return-object p1

    :cond_7
    invoke-static {}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getInstance()Lcom/jieli/jl_rcsp/tool/CommandHelper;

    move-result-object v3

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v4

    invoke-virtual {v3, p1, v1, v4}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getCommand(Landroid/bluetooth/BluetoothDevice;II)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    const/4 v3, -0x1

    packed-switch v1, :pswitch_data_1

    :cond_8
    :goto_3
    return-object v0

    :pswitch_8
    new-instance v0, Lcom/jieli/jl_rcsp/model/base/CommonResponse;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/base/CommonResponse;-><init>()V

    invoke-virtual {v0, v2}, Lcom/jieli/jl_rcsp/model/base/BaseResponse;->setRawData([B)V

    if-eqz p1, :cond_9

    check-cast p1, Lcom/jieli/jl_rcsp/model/command/upgrade/NotifyUpdateContentSizeCmd;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1

    :cond_9
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/upgrade/NotifyUpdateContentSizeCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/NotifyUpdateContentSizeParam;

    invoke-direct {v1, v8}, Lcom/jieli/jl_rcsp/model/parameter/NotifyUpdateContentSizeParam;-><init>(I)V

    invoke-direct {p1, v1}, Lcom/jieli/jl_rcsp/model/command/upgrade/NotifyUpdateContentSizeCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/NotifyUpdateContentSizeParam;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1

    :pswitch_9
    if-eqz v2, :cond_a

    array-length v0, v2

    if-lez v0, :cond_a

    aget-byte v0, v2, v8

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v3

    :cond_a
    new-instance v0, Lcom/jieli/jl_rcsp/model/response/RebootDeviceResponse;

    invoke-direct {v0, v3}, Lcom/jieli/jl_rcsp/model/response/RebootDeviceResponse;-><init>(I)V

    invoke-virtual {v0, v2}, Lcom/jieli/jl_rcsp/model/base/BaseResponse;->setRawData([B)V

    if-eqz p1, :cond_b

    check-cast p1, Lcom/jieli/jl_rcsp/model/command/upgrade/RebootDeviceCmd;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1

    :cond_b
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/upgrade/RebootDeviceCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/RebootDeviceParam;

    invoke-direct {v1, v8}, Lcom/jieli/jl_rcsp/model/parameter/RebootDeviceParam;-><init>(I)V

    invoke-direct {p1, v1}, Lcom/jieli/jl_rcsp/model/command/upgrade/RebootDeviceCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/RebootDeviceParam;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1

    :pswitch_a
    if-eqz v2, :cond_c

    array-length v0, v2

    if-lez v0, :cond_c

    aget-byte v0, v2, v8

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v3

    :cond_c
    new-instance v0, Lcom/jieli/jl_rcsp/model/response/FirmwareUpdateStatusResponse;

    invoke-direct {v0, v3}, Lcom/jieli/jl_rcsp/model/response/FirmwareUpdateStatusResponse;-><init>(I)V

    invoke-virtual {v0, v2}, Lcom/jieli/jl_rcsp/model/base/BaseResponse;->setRawData([B)V

    if-eqz p1, :cond_d

    check-cast p1, Lcom/jieli/jl_rcsp/model/command/upgrade/FirmwareUpdateStatusCmd;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1

    :cond_d
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/upgrade/FirmwareUpdateStatusCmd;

    invoke-direct {p1}, Lcom/jieli/jl_rcsp/model/command/upgrade/FirmwareUpdateStatusCmd;-><init>()V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1

    :pswitch_b
    new-array v0, v8, [B

    if-eqz v2, :cond_e

    array-length v1, v2

    if-lez v1, :cond_e

    move-object v0, v2

    :cond_e
    new-instance v1, Lcom/jieli/jl_rcsp/model/response/FirmwareUpdateBlockResponse;

    invoke-direct {v1}, Lcom/jieli/jl_rcsp/model/response/FirmwareUpdateBlockResponse;-><init>()V

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/base/BaseResponse;->setRawData([B)V

    invoke-virtual {v1, v0}, Lcom/jieli/jl_rcsp/model/response/FirmwareUpdateBlockResponse;->setFirmwareUpdateBlockData([B)Lcom/jieli/jl_rcsp/model/response/FirmwareUpdateBlockResponse;

    if-eqz p1, :cond_f

    check-cast p1, Lcom/jieli/jl_rcsp/model/command/upgrade/FirmwareUpdateBlockCmd;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1

    :cond_f
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/upgrade/FirmwareUpdateBlockCmd;

    new-instance v0, Lcom/jieli/jl_rcsp/model/parameter/FirmwareUpdateBlockParam;

    invoke-direct {v0, v8, v8}, Lcom/jieli/jl_rcsp/model/parameter/FirmwareUpdateBlockParam;-><init>(II)V

    invoke-direct {p1, v0}, Lcom/jieli/jl_rcsp/model/command/upgrade/FirmwareUpdateBlockCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/FirmwareUpdateBlockParam;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1

    :pswitch_c
    if-eqz v2, :cond_10

    array-length v0, v2

    if-lez v0, :cond_10

    aget-byte v0, v2, v8

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v8

    :cond_10
    new-instance v0, Lcom/jieli/jl_rcsp/model/response/ExitUpdateModeResponse;

    invoke-direct {v0, v8}, Lcom/jieli/jl_rcsp/model/response/ExitUpdateModeResponse;-><init>(I)V

    invoke-virtual {v0, v2}, Lcom/jieli/jl_rcsp/model/base/BaseResponse;->setRawData([B)V

    if-eqz p1, :cond_11

    check-cast p1, Lcom/jieli/jl_rcsp/model/command/upgrade/ExitUpdateModeCmd;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1

    :cond_11
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/upgrade/ExitUpdateModeCmd;

    invoke-direct {p1}, Lcom/jieli/jl_rcsp/model/command/upgrade/ExitUpdateModeCmd;-><init>()V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1

    :pswitch_d
    if-eqz v2, :cond_12

    array-length v0, v2

    if-lez v0, :cond_12

    aget-byte v0, v2, v8

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v3

    :cond_12
    new-instance v0, Lcom/jieli/jl_rcsp/model/response/EnterUpdateModeResponse;

    invoke-direct {v0, v3}, Lcom/jieli/jl_rcsp/model/response/EnterUpdateModeResponse;-><init>(I)V

    invoke-virtual {v0, v2}, Lcom/jieli/jl_rcsp/model/base/BaseResponse;->setRawData([B)V

    if-eqz p1, :cond_13

    check-cast p1, Lcom/jieli/jl_rcsp/model/command/upgrade/EnterUpdateModeCmd;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1

    :cond_13
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/upgrade/EnterUpdateModeCmd;

    invoke-direct {p1}, Lcom/jieli/jl_rcsp/model/command/upgrade/EnterUpdateModeCmd;-><init>()V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1

    :pswitch_e
    if-eqz v2, :cond_14

    array-length v0, v2

    if-lez v0, :cond_14

    aget-byte v0, v2, v8

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v3

    :cond_14
    new-instance v0, Lcom/jieli/jl_rcsp/model/response/InquireUpdateResponse;

    invoke-direct {v0, v3}, Lcom/jieli/jl_rcsp/model/response/InquireUpdateResponse;-><init>(I)V

    invoke-virtual {v0, v2}, Lcom/jieli/jl_rcsp/model/base/BaseResponse;->setRawData([B)V

    if-eqz p1, :cond_15

    check-cast p1, Lcom/jieli/jl_rcsp/model/command/upgrade/InquireUpdateCmd;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1

    :cond_15
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/upgrade/InquireUpdateCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/InquireUpdateParam;

    new-array v2, v8, [B

    invoke-direct {v1, v2}, Lcom/jieli/jl_rcsp/model/parameter/InquireUpdateParam;-><init>([B)V

    invoke-direct {p1, v1}, Lcom/jieli/jl_rcsp/model/command/upgrade/InquireUpdateCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/InquireUpdateParam;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1

    :pswitch_f
    if-eqz v2, :cond_16

    array-length v0, v2

    if-lt v0, v6, :cond_16

    new-array v0, v7, [B

    invoke-static {v2, v8, v0, v8, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([B)I

    move-result v8

    aget-byte v0, v2, v7

    aget-byte v1, v2, v5

    invoke-static {v0, v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt(BB)I

    move-result v0

    goto :goto_4

    :cond_16
    move v0, v8

    :goto_4
    new-instance v1, Lcom/jieli/jl_rcsp/model/response/UpdateFileOffsetResponse;

    invoke-direct {v1}, Lcom/jieli/jl_rcsp/model/response/UpdateFileOffsetResponse;-><init>()V

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/base/BaseResponse;->setRawData([B)V

    invoke-virtual {v1, v8}, Lcom/jieli/jl_rcsp/model/response/UpdateFileOffsetResponse;->setUpdateFileFlagOffset(I)Lcom/jieli/jl_rcsp/model/response/UpdateFileOffsetResponse;

    invoke-virtual {v1, v0}, Lcom/jieli/jl_rcsp/model/response/UpdateFileOffsetResponse;->setUpdateFileFlagLen(I)Lcom/jieli/jl_rcsp/model/response/UpdateFileOffsetResponse;

    if-eqz p1, :cond_17

    check-cast p1, Lcom/jieli/jl_rcsp/model/command/upgrade/GetUpdateFileOffsetCmd;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1

    :cond_17
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/upgrade/GetUpdateFileOffsetCmd;

    invoke-direct {p1}, Lcom/jieli/jl_rcsp/model/command/upgrade/GetUpdateFileOffsetCmd;-><init>()V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0xe1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0xe1
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
    .end packed-switch
.end method
