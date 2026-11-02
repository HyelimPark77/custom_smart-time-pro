.class public Lcom/jieli/jl_rcsp/model/cmdHandler/NFCOperationCmdHandler;
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

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getParamData()[B

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_15

    array-length v2, v0

    if-nez v2, :cond_0

    goto/16 :goto_9

    :cond_0
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getType()I

    move-result v2

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-ne v2, v4, :cond_10

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p1

    array-length p2, v0

    const/4 v2, 0x4

    if-lt p2, v2, :cond_1

    invoke-static {v0, v5, v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result p2

    move v6, v2

    goto :goto_0

    :cond_1
    move p2, v5

    move v6, p2

    :goto_0
    array-length v7, v0

    if-le v7, v6, :cond_2

    aget-byte v7, v0, v6

    invoke-static {v7}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v7

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_2
    move v7, v5

    :goto_1
    packed-switch v7, :pswitch_data_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "\u672a\u5b9a\u4e49\u547d\u4ee4: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "NFCOperationCmdHandler"

    const-string v0, "parseDataToCmd"

    invoke-static {p2, v0, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :pswitch_0
    array-length v2, v0

    if-le v2, v6, :cond_3

    array-length v2, v0

    sub-int/2addr v2, v6

    :try_start_0
    new-instance v3, Ljava/lang/String;

    invoke-direct {v3, v0, v6, v2}, Ljava/lang/String;-><init>([BII)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v1, v3

    goto :goto_2

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_3
    :goto_2
    new-instance v0, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd;

    new-instance v2, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$InsertFileEndParam;

    invoke-direct {v2, p2, v1}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$InsertFileEndParam;-><init>(ILjava/lang/String;)V

    invoke-direct {v0, v2}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$Param;)V

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    return-object p1

    :pswitch_1
    array-length v3, v0

    add-int/lit8 v4, v6, 0x4

    if-lt v3, v4, :cond_4

    invoke-static {v0, v6, v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v5

    move v6, v4

    :cond_4
    array-length v2, v0

    if-le v2, v6, :cond_5

    array-length v2, v0

    sub-int/2addr v2, v6

    :try_start_1
    new-instance v3, Ljava/lang/String;

    invoke-direct {v3, v0, v6, v2}, Ljava/lang/String;-><init>([BII)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-object v1, v3

    goto :goto_3

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_5
    :goto_3
    new-instance v0, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd;

    new-instance v2, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$InsertFileParam;

    invoke-direct {v2, p2, v5, v1}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$InsertFileParam;-><init>(IILjava/lang/String;)V

    invoke-direct {v0, v2}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$Param;)V

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    return-object p1

    :pswitch_2
    array-length v1, v0

    if-le v1, v6, :cond_6

    aget-byte v1, v0, v6

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v1

    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    :cond_6
    move v1, v5

    :goto_4
    if-eq v1, v4, :cond_9

    if-eq v1, v3, :cond_7

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$GetDefaultNfcParam;

    invoke-direct {v1, p2}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$GetDefaultNfcParam;-><init>(I)V

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$Param;)V

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    return-object p1

    :cond_7
    array-length v1, v0

    add-int/lit8 v2, v6, 0x2

    if-lt v1, v2, :cond_8

    aget-byte v1, v0, v6

    add-int/2addr v6, v4

    aget-byte v0, v0, v6

    invoke-static {v1, v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToShort(BB)S

    move-result v5

    :cond_8
    new-instance v0, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationNoResponseCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationNoResponseCmd$NotifyDefaultNfcParam;

    invoke-direct {v1, p2, v5}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationNoResponseCmd$NotifyDefaultNfcParam;-><init>(IS)V

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationNoResponseCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationNoResponseCmd$Param;)V

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    return-object p1

    :cond_9
    array-length v1, v0

    add-int/lit8 v2, v6, 0x2

    if-lt v1, v2, :cond_a

    aget-byte v1, v0, v6

    add-int/2addr v6, v4

    aget-byte v0, v0, v6

    invoke-static {v1, v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToShort(BB)S

    move-result v5

    :cond_a
    new-instance v0, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$SetDefaultNfcParam;

    invoke-direct {v1, p2, v5}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$SetDefaultNfcParam;-><init>(IS)V

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$Param;)V

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    return-object p1

    :pswitch_3
    new-instance v0, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$NotifyNfcParam;

    invoke-direct {v1, p2}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$NotifyNfcParam;-><init>(I)V

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$Param;)V

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    return-object p1

    :pswitch_4
    array-length v1, v0

    add-int/lit8 v2, v6, 0x2

    if-lt v1, v2, :cond_b

    aget-byte v1, v0, v6

    add-int/2addr v6, v4

    aget-byte v0, v0, v6

    invoke-static {v1, v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToShort(BB)S

    move-result v5

    :cond_b
    new-instance v0, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$DeleteMsgParam;

    invoke-direct {v1, p2, v5}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$DeleteMsgParam;-><init>(IS)V

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$Param;)V

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    return-object p1

    :pswitch_5
    array-length v3, v0

    add-int/lit8 v4, v6, 0x2

    if-lt v3, v4, :cond_c

    aget-byte v3, v0, v6

    add-int/lit8 v6, v6, 0x1

    aget-byte v6, v0, v6

    invoke-static {v3, v6}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToShort(BB)S

    move-result v3

    move v6, v4

    goto :goto_5

    :cond_c
    move v3, v5

    :goto_5
    array-length v4, v0

    add-int/lit8 v7, v6, 0x4

    if-lt v4, v7, :cond_d

    invoke-static {v0, v6, v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v2

    move v6, v7

    goto :goto_6

    :cond_d
    move v2, v5

    :goto_6
    array-length v4, v0

    if-le v4, v6, :cond_e

    array-length v1, v0

    sub-int/2addr v1, v6

    new-array v4, v1, [B

    invoke-static {v0, v6, v4, v5, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v1, v4

    :cond_e
    new-instance v0, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd;

    new-instance v4, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$ModifyMsgParam;

    invoke-direct {v4, p2, v3, v2, v1}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$ModifyMsgParam;-><init>(ISI[B)V

    invoke-direct {v0, v4}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$Param;)V

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    return-object p1

    :pswitch_6
    array-length v1, v0

    if-le v1, v6, :cond_f

    aget-byte v0, v0, v6

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v5

    :cond_f
    new-instance v0, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationNoResponseCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationNoResponseCmd$StopSyncParam;

    invoke-direct {v1, p2, v5}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationNoResponseCmd$StopSyncParam;-><init>(II)V

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationNoResponseCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationNoResponseCmd$Param;)V

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    return-object p1

    :pswitch_7
    new-instance v0, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$StartSyncParam;

    invoke-direct {v1, p2}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$StartSyncParam;-><init>(I)V

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$Param;)V

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    return-object p1

    :cond_10
    invoke-static {}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getInstance()Lcom/jieli/jl_rcsp/tool/CommandHelper;

    move-result-object v2

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result v6

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v7

    invoke-virtual {v2, p1, v6, v7}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getCommand(Landroid/bluetooth/BluetoothDevice;II)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    if-eqz p1, :cond_12

    check-cast p1, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getParam()Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    move-result-object v2

    check-cast v2, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$Param;

    invoke-virtual {v2}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$Param;->getOp()I

    move-result v2

    const/4 v6, 0x5

    if-ne v2, v6, :cond_13

    aget-byte v1, v0, v5

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v1

    array-length v2, v0

    const/4 v6, 0x3

    if-lt v2, v6, :cond_11

    aget-byte v2, v0, v4

    aget-byte v3, v0, v3

    invoke-static {v2, v3}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToShort(BB)S

    move-result v2

    goto :goto_7

    :cond_11
    move v2, v5

    :goto_7
    new-instance v3, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$GetDefaultNfcResponse;

    invoke-direct {v3, v1, v2}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$GetDefaultNfcResponse;-><init>(IS)V

    move-object v1, v3

    goto :goto_8

    :cond_12
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd;

    new-instance v2, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$Param;

    invoke-direct {v2, v5, v5}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$Param;-><init>(II)V

    invoke-direct {p1, v2}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$Param;)V

    :cond_13
    :goto_8
    if-nez v1, :cond_14

    new-instance v1, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$Response;

    aget-byte v2, v0, v5

    invoke-static {v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v2

    invoke-direct {v1, v2}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$Response;-><init>(I)V

    invoke-virtual {v1, v0}, Lcom/jieli/jl_rcsp/model/base/BaseResponse;->setRawData([B)V

    :cond_14
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1

    :cond_15
    :goto_9
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
