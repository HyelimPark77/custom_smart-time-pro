.class public Lcom/jieli/jl_rcsp/model/cmdHandler/ExternalFlashCmdHandler;
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
    .locals 19

    const/4 v1, 0x0

    if-nez p2, :cond_0

    return-object v1

    :cond_0
    invoke-virtual/range {p2 .. p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result v0

    const/16 v2, 0x1a

    const/16 v3, 0xd6

    if-eq v0, v3, :cond_2

    if-ne v0, v2, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    move-object/from16 v16, v1

    goto/16 :goto_a

    :cond_2
    :goto_1
    invoke-virtual/range {p2 .. p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getParamData()[B

    move-result-object v4

    invoke-virtual/range {p2 .. p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getType()I

    move-result v5

    const/16 v6, 0xb

    const/16 v7, 0x8

    const/4 v8, 0x6

    const/4 v9, 0x5

    const/4 v10, 0x3

    const/4 v11, 0x1

    const/4 v12, 0x4

    const/4 v13, 0x2

    const/4 v14, 0x0

    if-ne v5, v11, :cond_14

    if-eq v0, v2, :cond_4

    if-eq v0, v3, :cond_3

    goto :goto_0

    :cond_3
    new-instance v0, Lcom/jieli/jl_rcsp/model/command/external_flash/GetExternalFlashMsgCmd;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/command/external_flash/GetExternalFlashMsgCmd;-><init>()V

    invoke-virtual/range {p2 .. p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    return-object v0

    :cond_4
    new-array v0, v14, [B

    if-eqz v4, :cond_12

    array-length v2, v4

    if-lez v2, :cond_12

    aget-byte v2, v4, v14

    invoke-static {v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v2

    array-length v3, v4

    if-le v3, v11, :cond_11

    aget-byte v3, v4, v11

    invoke-static {v3}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v3

    and-int/lit8 v5, v3, 0x1

    if-nez v5, :cond_5

    move v5, v11

    goto :goto_2

    :cond_5
    move v5, v14

    :goto_2
    if-eq v2, v7, :cond_f

    if-eq v2, v6, :cond_e

    if-eqz v2, :cond_d

    if-eq v2, v11, :cond_b

    if-eq v2, v13, :cond_9

    if-eq v2, v10, :cond_7

    if-eq v2, v12, :cond_b

    if-eq v2, v9, :cond_6

    goto/16 :goto_7

    :cond_6
    if-nez v5, :cond_10

    array-length v5, v4

    if-le v5, v13, :cond_10

    array-length v5, v4

    sub-int/2addr v5, v13

    :try_start_0
    new-instance v6, Ljava/lang/String;

    invoke-direct {v6, v4, v13, v5}, Ljava/lang/String;-><init>([BII)V

    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :goto_3
    move v5, v14

    goto :goto_4

    :cond_7
    if-eq v3, v11, :cond_8

    if-eq v3, v13, :cond_8

    if-eq v3, v10, :cond_8

    if-eq v3, v12, :cond_8

    if-ne v3, v9, :cond_10

    :cond_8
    array-length v5, v4

    if-le v5, v13, :cond_10

    array-length v5, v4

    sub-int/2addr v5, v13

    :try_start_1
    new-instance v6, Ljava/lang/String;

    invoke-direct {v6, v4, v13, v5}, Ljava/lang/String;-><init>([BII)V

    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    :cond_9
    if-nez v5, :cond_10

    array-length v5, v4

    if-lt v5, v8, :cond_10

    invoke-static {v4, v13, v12}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v5

    array-length v6, v4

    if-le v6, v8, :cond_a

    array-length v6, v4

    sub-int/2addr v6, v8

    :try_start_2
    new-instance v7, Ljava/lang/String;

    invoke-direct {v7, v4, v8, v6}, Ljava/lang/String;-><init>([BII)V

    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    :cond_a
    :goto_4
    move v4, v5

    move v5, v14

    :goto_5
    move v14, v3

    move v3, v5

    goto/16 :goto_9

    :cond_b
    array-length v5, v4

    if-lt v5, v8, :cond_10

    invoke-static {v4, v13, v12}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v5

    array-length v6, v4

    if-lt v6, v7, :cond_c

    invoke-static {v4, v8, v13}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v4

    move/from16 v18, v14

    move v14, v3

    move/from16 v3, v18

    goto :goto_9

    :cond_c
    :goto_6
    move v4, v14

    move v14, v3

    move v3, v4

    goto :goto_9

    :cond_d
    array-length v5, v4

    if-lt v5, v8, :cond_10

    invoke-static {v4, v13, v12}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v5

    array-length v6, v4

    if-le v6, v8, :cond_c

    array-length v0, v4

    sub-int/2addr v0, v8

    new-array v6, v0, [B

    invoke-static {v4, v8, v6, v14, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v0, v6

    goto :goto_6

    :cond_e
    array-length v5, v4

    if-le v5, v13, :cond_10

    array-length v5, v4

    sub-int/2addr v5, v13

    :try_start_3
    new-instance v6, Ljava/lang/String;

    invoke-direct {v6, v4, v13, v5}, Ljava/lang/String;-><init>([BII)V

    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_3

    :cond_f
    array-length v5, v4

    if-le v5, v12, :cond_10

    new-array v5, v13, [B

    invoke-static {v4, v13, v5, v14, v13}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    aget-byte v4, v5, v14

    aget-byte v5, v5, v11

    invoke-static {v4, v5}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToShort(BB)S

    move-result v4

    move v5, v14

    move v14, v3

    move v3, v4

    move v4, v5

    goto :goto_9

    :cond_10
    :goto_7
    move v4, v14

    move v5, v4

    goto :goto_5

    :cond_11
    :goto_8
    move v3, v14

    move v4, v3

    move v5, v4

    goto :goto_9

    :cond_12
    const/4 v2, -0x1

    goto :goto_8

    :goto_9
    new-instance v6, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    invoke-direct {v6}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;-><init>()V

    invoke-virtual {v6, v2}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setOp(I)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    move-result-object v2

    invoke-virtual {v2, v14}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setFlag(I)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    move-result-object v2

    invoke-virtual {v2, v5}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setOffset(I)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    move-result-object v2

    invoke-virtual {v2, v4}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setSize(I)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setData([B)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setFilePath(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setCrc16(S)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getHasResponse()I

    move-result v1

    if-ne v1, v11, :cond_13

    new-instance v1, Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;

    invoke-direct {v1, v0}, Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;)V

    invoke-virtual/range {p2 .. p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    return-object v0

    :cond_13
    new-instance v1, Lcom/jieli/jl_rcsp/model/command/external_flash/ExtFlashIOCtrlNoResponseCmd;

    invoke-direct {v1, v0}, Lcom/jieli/jl_rcsp/model/command/external_flash/ExtFlashIOCtrlNoResponseCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;)V

    invoke-virtual/range {p2 .. p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    return-object v0

    :cond_14
    invoke-static {}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getInstance()Lcom/jieli/jl_rcsp/tool/CommandHelper;

    move-result-object v5

    invoke-virtual/range {p2 .. p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v15

    move-object/from16 v16, v1

    move-object/from16 v1, p1

    invoke-virtual {v5, v1, v0, v15}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getCommand(Landroid/bluetooth/BluetoothDevice;II)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v1

    const/16 v5, 0xc

    if-eq v0, v2, :cond_22

    if-eq v0, v3, :cond_15

    :goto_a
    return-object v16

    :cond_15
    if-eqz v4, :cond_20

    array-length v0, v4

    if-lt v0, v12, :cond_20

    invoke-static {v4, v14, v12}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v2

    array-length v0, v4

    if-lt v0, v7, :cond_1f

    invoke-static {v4, v12, v12}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v3

    array-length v0, v4

    const/16 v6, 0x9

    if-lt v0, v6, :cond_1e

    aget-byte v0, v4, v7

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v7

    array-length v0, v4

    const/16 v8, 0xa

    if-lt v0, v8, :cond_1d

    aget-byte v0, v4, v6

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v6

    array-length v0, v4

    if-lt v0, v5, :cond_1c

    invoke-static {v4, v8, v13}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v8

    array-length v0, v4

    const/16 v9, 0xe

    if-lt v0, v9, :cond_1b

    invoke-static {v4, v5, v13}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v5

    array-length v0, v4

    const/16 v10, 0x10

    if-lt v0, v10, :cond_1a

    invoke-static {v4, v9, v13}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v9

    array-length v0, v4

    const/16 v11, 0x12

    if-lt v0, v11, :cond_19

    invoke-static {v4, v10, v13}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v10

    array-length v0, v4

    add-int/lit8 v12, v10, 0x12

    if-lt v0, v12, :cond_19

    :try_start_4
    new-array v0, v10, [B

    invoke-static {v4, v11, v0, v14, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance v11, Ljava/lang/String;

    invoke-direct {v11, v0}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v11}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const-string v11, ","

    invoke-virtual {v0, v11}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_b

    :catch_2
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    move-object/from16 v0, v16

    :goto_b
    array-length v11, v4

    add-int/lit8 v15, v10, 0x14

    if-lt v11, v15, :cond_18

    invoke-static {v4, v12, v13}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v11

    array-length v12, v4

    add-int/lit8 v14, v10, 0x16

    if-lt v12, v14, :cond_17

    invoke-static {v4, v15, v13}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v12

    array-length v15, v4

    add-int/lit8 v10, v10, 0x18

    if-lt v15, v10, :cond_16

    invoke-static {v4, v14, v13}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v14

    move/from16 v18, v14

    move v14, v2

    move/from16 v2, v18

    goto :goto_12

    :cond_16
    move v14, v2

    const/4 v2, 0x0

    goto :goto_12

    :cond_17
    move v14, v2

    const/4 v2, 0x0

    :goto_c
    const/4 v12, 0x0

    goto :goto_12

    :cond_18
    move v14, v2

    :goto_d
    const/4 v2, 0x0

    :goto_e
    const/4 v11, 0x0

    goto :goto_c

    :cond_19
    move v14, v2

    move-object/from16 v0, v16

    goto :goto_d

    :cond_1a
    move v14, v2

    move-object/from16 v0, v16

    const/4 v2, 0x0

    :goto_f
    const/4 v9, 0x0

    goto :goto_e

    :cond_1b
    move v14, v2

    move-object/from16 v0, v16

    const/4 v2, 0x0

    const/4 v5, 0x0

    goto :goto_f

    :cond_1c
    move v14, v2

    move-object/from16 v0, v16

    const/4 v2, 0x0

    const/4 v5, 0x0

    :goto_10
    const/4 v8, 0x0

    goto :goto_f

    :cond_1d
    move v14, v2

    move-object/from16 v0, v16

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    goto :goto_10

    :cond_1e
    move v14, v2

    move-object/from16 v0, v16

    const/4 v2, 0x0

    :goto_11
    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    goto :goto_10

    :cond_1f
    move v14, v2

    move-object/from16 v0, v16

    const/4 v2, 0x0

    const/4 v3, 0x0

    goto :goto_11

    :cond_20
    move-object/from16 v0, v16

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    :goto_12
    new-instance v10, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;

    invoke-direct {v10}, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;-><init>()V

    invoke-virtual {v10, v14}, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->setFlashSize(I)Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;

    move-result-object v10

    invoke-virtual {v10, v7}, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->setSystem(I)Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;

    move-result-object v7

    invoke-virtual {v7, v5}, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->setBlockSize(I)Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;

    move-result-object v5

    invoke-virtual {v5, v6}, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->setSysStatus(I)Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;

    move-result-object v5

    invoke-virtual {v5, v9}, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->setCluster(I)Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;

    move-result-object v5

    invoke-virtual {v5, v3}, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->setFatSize(I)Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->setMatchVersions([Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;

    move-result-object v0

    invoke-virtual {v0, v8}, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->setWatchVersionCode(I)Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;

    move-result-object v0

    invoke-virtual {v0, v11}, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->setReceiveMtu(I)Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;

    move-result-object v0

    invoke-virtual {v0, v12}, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->setScreenWidth(I)Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->setScreenHeight(I)Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/jieli/jl_rcsp/model/base/BaseResponse;->setRawData([B)V

    if-eqz v1, :cond_21

    check-cast v1, Lcom/jieli/jl_rcsp/model/command/external_flash/GetExternalFlashMsgCmd;

    goto :goto_13

    :cond_21
    new-instance v1, Lcom/jieli/jl_rcsp/model/command/external_flash/GetExternalFlashMsgCmd;

    invoke-direct {v1}, Lcom/jieli/jl_rcsp/model/command/external_flash/GetExternalFlashMsgCmd;-><init>()V

    :goto_13
    invoke-virtual {v1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    invoke-virtual/range {p2 .. p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    return-object v1

    :cond_22
    move v2, v14

    new-array v0, v2, [B

    if-eqz v1, :cond_23

    check-cast v1, Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;

    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getParam()Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    move-result-object v2

    check-cast v2, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    goto :goto_14

    :cond_23
    new-instance v1, Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;

    new-instance v2, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;-><init>()V

    invoke-direct {v1, v2}, Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;)V

    move-object/from16 v2, v16

    :goto_14
    if-eqz v4, :cond_2f

    array-length v3, v4

    if-lez v3, :cond_2f

    const/16 v17, 0x0

    aget-byte v3, v4, v17

    invoke-static {v3}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v3

    if-eqz v2, :cond_2e

    invoke-virtual {v2}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->getOp()I

    move-result v14

    if-eq v14, v11, :cond_2c

    if-eq v14, v10, :cond_29

    if-eq v14, v7, :cond_28

    if-eq v14, v6, :cond_27

    if-eq v14, v5, :cond_25

    :catch_3
    :cond_24
    const/4 v6, 0x0

    goto/16 :goto_18

    :cond_25
    array-length v2, v4

    if-lt v2, v9, :cond_24

    invoke-static {v4, v11, v12}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v2

    :cond_26
    :goto_15
    move v6, v2

    move v14, v3

    move-object/from16 v2, v16

    move-object v3, v2

    const/4 v5, 0x0

    goto/16 :goto_1a

    :cond_27
    array-length v2, v4

    if-lt v2, v9, :cond_24

    invoke-static {v4, v11, v12}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v2

    array-length v5, v4

    const/4 v6, 0x7

    if-lt v5, v6, :cond_26

    aget-byte v5, v4, v9

    aget-byte v6, v4, v8

    invoke-static {v5, v6}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToShort(BB)S

    move-result v14

    move v6, v2

    move v5, v14

    move-object/from16 v2, v16

    move v14, v3

    :goto_16
    move-object v3, v2

    goto/16 :goto_1a

    :cond_28
    array-length v2, v4

    if-lt v2, v10, :cond_24

    invoke-static {v4, v11, v13}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v2

    goto :goto_15

    :cond_29
    invoke-virtual {v2}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->getWatchOp()I

    move-result v5

    if-eqz v5, :cond_2b

    invoke-virtual {v2}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->getWatchOp()I

    move-result v5

    if-ne v5, v9, :cond_2a

    goto :goto_17

    :cond_2a
    invoke-virtual {v2}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->getWatchOp()I

    move-result v2

    if-ne v2, v10, :cond_24

    array-length v2, v4

    if-le v2, v11, :cond_24

    array-length v2, v4

    sub-int/2addr v2, v11

    new-array v5, v2, [B

    const/4 v6, 0x0

    invoke-static {v4, v11, v5, v6, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :try_start_5
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v5}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    move v14, v3

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v3, v2

    move-object/from16 v2, v16

    goto :goto_1a

    :cond_2b
    :goto_17
    array-length v2, v4

    if-le v2, v11, :cond_24

    array-length v2, v4

    sub-int/2addr v2, v11

    new-array v5, v2, [B

    const/4 v6, 0x0

    invoke-static {v4, v11, v5, v6, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :try_start_6
    new-instance v2, Ljava/lang/String;

    sget-object v6, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v2, v5, v6}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    move v14, v3

    move-object/from16 v3, v16

    const/4 v5, 0x0

    const/4 v6, 0x0

    goto :goto_1a

    :cond_2c
    array-length v2, v4

    if-le v2, v11, :cond_24

    array-length v0, v4

    sub-int/2addr v0, v11

    new-array v2, v0, [B

    const/4 v6, 0x0

    invoke-static {v4, v11, v2, v6, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :catch_4
    move-object v0, v2

    :cond_2d
    :goto_18
    move v14, v3

    move v5, v6

    :goto_19
    move-object/from16 v2, v16

    goto :goto_16

    :cond_2e
    const/4 v6, 0x0

    array-length v2, v4

    if-le v2, v11, :cond_2d

    array-length v0, v4

    sub-int/2addr v0, v11

    new-array v2, v0, [B

    invoke-static {v4, v11, v2, v6, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :try_start_7
    new-instance v5, Ljava/lang/String;

    invoke-direct {v5, v4, v11, v0}, Ljava/lang/String;-><init>([BII)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_4

    move-object v0, v2

    move v14, v3

    move-object v2, v5

    move v5, v6

    move-object/from16 v3, v16

    goto :goto_1a

    :cond_2f
    const/4 v6, 0x0

    move v5, v6

    move v14, v5

    goto :goto_19

    :goto_1a
    new-instance v7, Lcom/jieli/jl_rcsp/model/response/ExternalFlashIOCtrlResponse;

    invoke-direct {v7, v14}, Lcom/jieli/jl_rcsp/model/response/ExternalFlashIOCtrlResponse;-><init>(I)V

    invoke-virtual {v7, v0}, Lcom/jieli/jl_rcsp/model/response/ExternalFlashIOCtrlResponse;->setData([B)Lcom/jieli/jl_rcsp/model/response/ExternalFlashIOCtrlResponse;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/jieli/jl_rcsp/model/response/ExternalFlashIOCtrlResponse;->setSize(I)Lcom/jieli/jl_rcsp/model/response/ExternalFlashIOCtrlResponse;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/jieli/jl_rcsp/model/response/ExternalFlashIOCtrlResponse;->setFilePath(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/response/ExternalFlashIOCtrlResponse;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/jieli/jl_rcsp/model/response/ExternalFlashIOCtrlResponse;->setVersion(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/response/ExternalFlashIOCtrlResponse;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/jieli/jl_rcsp/model/response/ExternalFlashIOCtrlResponse;->setCrc16(S)Lcom/jieli/jl_rcsp/model/response/ExternalFlashIOCtrlResponse;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/jieli/jl_rcsp/model/base/BaseResponse;->setRawData([B)V

    invoke-virtual {v1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    invoke-virtual/range {p2 .. p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    return-object v1
.end method
