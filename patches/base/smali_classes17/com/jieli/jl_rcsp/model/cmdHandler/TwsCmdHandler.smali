.class public Lcom/jieli/jl_rcsp/model/cmdHandler/TwsCmdHandler;
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

    const/16 v2, 0xc0

    if-eq v1, v2, :cond_1

    const/16 v2, 0xc1

    if-eq v1, v2, :cond_1

    const/16 v2, 0xc2

    if-eq v1, v2, :cond_1

    const/16 v2, 0xc3

    if-eq v1, v2, :cond_1

    const/16 v2, 0xc4

    if-ne v1, v2, :cond_6

    :cond_1
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getParamData()[B

    move-result-object v2

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getType()I

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-ne v3, v4, :cond_5

    packed-switch v1, :pswitch_data_0

    goto/16 :goto_0

    :pswitch_0
    if-eqz v2, :cond_2

    array-length p1, v2

    if-lez p1, :cond_2

    aget-byte p1, v2, v5

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v5

    :cond_2
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/tws/RequestAdvOpCmd;

    new-instance v0, Lcom/jieli/jl_rcsp/model/parameter/RequestAdvOpParam;

    invoke-direct {v0, v5}, Lcom/jieli/jl_rcsp/model/parameter/RequestAdvOpParam;-><init>(I)V

    invoke-direct {p1, v0}, Lcom/jieli/jl_rcsp/model/command/tws/RequestAdvOpCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/RequestAdvOpParam;)V

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
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/tws/SetDeviceNotifyAdvInfoCmd;

    new-instance v0, Lcom/jieli/jl_rcsp/model/parameter/SetDeviceNotifyAdvInfoParam;

    invoke-direct {v0, v5}, Lcom/jieli/jl_rcsp/model/parameter/SetDeviceNotifyAdvInfoParam;-><init>(I)V

    invoke-direct {p1, v0}, Lcom/jieli/jl_rcsp/model/command/tws/SetDeviceNotifyAdvInfoCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/SetDeviceNotifyAdvInfoParam;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    return-object p1

    :pswitch_2
    new-instance p1, Lcom/jieli/jl_rcsp/model/parameter/NotifyAdvInfoParam;

    invoke-direct {p1}, Lcom/jieli/jl_rcsp/model/parameter/NotifyAdvInfoParam;-><init>()V

    invoke-static {p1, p2}, Lcom/jieli/jl_rcsp/tool/datahandles/ParseHelper;->parseNotifyADVInfo(Lcom/jieli/jl_rcsp/model/parameter/NotifyAdvInfoParam;Lcom/jieli/jl_rcsp/model/base/BasePacket;)V

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/tws/NotifyAdvInfoCmd;

    invoke-direct {v0, p1}, Lcom/jieli/jl_rcsp/model/command/tws/NotifyAdvInfoCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/NotifyAdvInfoParam;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    return-object p1

    :pswitch_3
    if-eqz v2, :cond_4

    array-length p1, v2

    const/4 v0, 0x4

    if-lt p1, v0, :cond_4

    new-array p1, v0, [B

    invoke-static {v2, v5, p1, v5, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([B)I

    move-result v5

    :cond_4
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/tws/GetADVInfoCmd;

    new-instance v0, Lcom/jieli/jl_rcsp/model/parameter/GetADVInfoParam;

    invoke-direct {v0, v5}, Lcom/jieli/jl_rcsp/model/parameter/GetADVInfoParam;-><init>(I)V

    invoke-direct {p1, v0}, Lcom/jieli/jl_rcsp/model/command/tws/GetADVInfoCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/GetADVInfoParam;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    return-object p1

    :pswitch_4
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/tws/SetADVInfoCmd;

    new-instance v0, Lcom/jieli/jl_rcsp/model/parameter/SetADVInfoParam;

    invoke-direct {v0, v2}, Lcom/jieli/jl_rcsp/model/parameter/SetADVInfoParam;-><init>([B)V

    invoke-direct {p1, v0}, Lcom/jieli/jl_rcsp/model/command/tws/SetADVInfoCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/SetADVInfoParam;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    return-object p1

    :cond_5
    invoke-static {}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getInstance()Lcom/jieli/jl_rcsp/tool/CommandHelper;

    move-result-object v3

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v4

    invoke-virtual {v3, p1, v1, v4}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getCommand(Landroid/bluetooth/BluetoothDevice;II)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v3

    const/4 v4, -0x1

    packed-switch v1, :pswitch_data_1

    :cond_6
    :goto_0
    :pswitch_5
    return-object v0

    :pswitch_6
    new-instance p1, Lcom/jieli/jl_rcsp/model/base/CommonResponse;

    invoke-direct {p1}, Lcom/jieli/jl_rcsp/model/base/CommonResponse;-><init>()V

    invoke-virtual {p1, v2}, Lcom/jieli/jl_rcsp/model/base/BaseResponse;->setRawData([B)V

    if-eqz v3, :cond_7

    check-cast v3, Lcom/jieli/jl_rcsp/model/command/tws/RequestAdvOpCmd;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {v3, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {v3, p1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object v3

    :cond_7
    new-instance v0, Lcom/jieli/jl_rcsp/model/command/tws/RequestAdvOpCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/RequestAdvOpParam;

    invoke-direct {v1, v5}, Lcom/jieli/jl_rcsp/model/parameter/RequestAdvOpParam;-><init>(I)V

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/command/tws/RequestAdvOpCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/RequestAdvOpParam;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {v0, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object v0

    :pswitch_7
    if-eqz v2, :cond_8

    array-length p1, v2

    if-lez p1, :cond_8

    aget-byte p1, v2, v5

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v4

    :cond_8
    new-instance p1, Lcom/jieli/jl_rcsp/model/response/SetDeviceNotifyAdvInfoResponse;

    invoke-direct {p1, v4}, Lcom/jieli/jl_rcsp/model/response/SetDeviceNotifyAdvInfoResponse;-><init>(I)V

    invoke-virtual {p1, v2}, Lcom/jieli/jl_rcsp/model/base/BaseResponse;->setRawData([B)V

    if-eqz v3, :cond_9

    check-cast v3, Lcom/jieli/jl_rcsp/model/command/tws/SetDeviceNotifyAdvInfoCmd;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {v3, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {v3, p1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object v3

    :cond_9
    new-instance v0, Lcom/jieli/jl_rcsp/model/command/tws/SetDeviceNotifyAdvInfoCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/SetDeviceNotifyAdvInfoParam;

    invoke-direct {v1, v5}, Lcom/jieli/jl_rcsp/model/parameter/SetDeviceNotifyAdvInfoParam;-><init>(I)V

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/command/tws/SetDeviceNotifyAdvInfoCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/SetDeviceNotifyAdvInfoParam;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {v0, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object v0

    :pswitch_8
    new-instance v0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;-><init>()V

    invoke-virtual {v0, v2}, Lcom/jieli/jl_rcsp/model/base/BaseResponse;->setRawData([B)V

    invoke-static {p1, v0, p2}, Lcom/jieli/jl_rcsp/tool/datahandles/ParseHelper;->parseADVInfo(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;Lcom/jieli/jl_rcsp/model/base/BasePacket;)V

    if-eqz v3, :cond_a

    check-cast v3, Lcom/jieli/jl_rcsp/model/command/tws/GetADVInfoCmd;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p1

    invoke-virtual {v3, p1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {v3, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object v3

    :cond_a
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/tws/GetADVInfoCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/GetADVInfoParam;

    invoke-direct {v1, v5}, Lcom/jieli/jl_rcsp/model/parameter/GetADVInfoParam;-><init>(I)V

    invoke-direct {p1, v1}, Lcom/jieli/jl_rcsp/model/command/tws/GetADVInfoCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/GetADVInfoParam;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1

    :pswitch_9
    if-eqz v2, :cond_b

    array-length p1, v2

    if-lez p1, :cond_b

    aget-byte p1, v2, v5

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v4

    :cond_b
    new-instance p1, Lcom/jieli/jl_rcsp/model/response/SetADVResponse;

    invoke-direct {p1, v4}, Lcom/jieli/jl_rcsp/model/response/SetADVResponse;-><init>(I)V

    invoke-virtual {p1, v2}, Lcom/jieli/jl_rcsp/model/base/BaseResponse;->setRawData([B)V

    if-eqz v3, :cond_c

    check-cast v3, Lcom/jieli/jl_rcsp/model/command/tws/SetADVInfoCmd;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {v3, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {v3, p1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object v3

    :cond_c
    new-instance v0, Lcom/jieli/jl_rcsp/model/command/tws/SetADVInfoCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/SetADVInfoParam;

    new-array v2, v5, [B

    invoke-direct {v1, v2}, Lcom/jieli/jl_rcsp/model/parameter/SetADVInfoParam;-><init>([B)V

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/command/tws/SetADVInfoCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/SetADVInfoParam;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {v0, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0xc0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0xc0
        :pswitch_9
        :pswitch_8
        :pswitch_5
        :pswitch_7
        :pswitch_6
    .end packed-switch
.end method
