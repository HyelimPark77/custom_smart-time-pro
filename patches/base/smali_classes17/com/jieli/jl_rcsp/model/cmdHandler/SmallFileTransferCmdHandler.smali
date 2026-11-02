.class public Lcom/jieli/jl_rcsp/model/cmdHandler/SmallFileTransferCmdHandler;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/cmd/ICmdHandler;


# instance fields
.field private final TAG:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, Lcom/jieli/jl_rcsp/model/cmdHandler/SmallFileTransferCmdHandler;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/cmdHandler/SmallFileTransferCmdHandler;->TAG:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public parseDataToCmd(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BasePacket;)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 11

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result v1

    const/16 v2, 0x28

    if-eq v1, v2, :cond_1

    return-object v0

    :cond_1
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getParamData()[B

    move-result-object v1

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getType()I

    move-result v2

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-ne v2, v6, :cond_7

    aget-byte p1, v1, v7

    array-length v0, v1

    add-int/lit8 v2, v0, -0x1

    new-array v8, v2, [B

    invoke-static {v1, v6, v8, v7, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    if-eqz p1, :cond_6

    const/4 v1, 0x7

    const/4 v2, 0x6

    const/4 v9, 0x5

    if-eq p1, v6, :cond_5

    const/16 v10, 0x8

    if-eq p1, v5, :cond_4

    if-eq p1, v4, :cond_3

    if-ne p1, v3, :cond_2

    aget-byte p1, v8, v7

    aget-byte v0, v8, v6

    aget-byte v1, v8, v5

    invoke-static {v0, v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToShort(BB)S

    move-result v0

    new-instance v1, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$DeleteFileParam;

    invoke-direct {v1, p1, v0}, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$DeleteFileParam;-><init>(BS)V

    goto/16 :goto_0

    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "invalid Small file transfer cmd op"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    move p1, v1

    aget-byte v1, v8, v7

    aget-byte v6, v8, v6

    aget-byte v5, v8, v5

    invoke-static {v6, v5}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToShort(BB)S

    move-result v5

    aget-byte v4, v8, v4

    aget-byte v3, v8, v3

    invoke-static {v4, v3}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToShort(BB)S

    move-result v3

    aget-byte v4, v8, v9

    aget-byte v2, v8, v2

    invoke-static {v4, v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToShort(BB)S

    move-result v4

    aget-byte p1, v8, p1

    aget-byte v2, v8, v10

    invoke-static {p1, v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToShort(BB)S

    move-result v6

    add-int/lit8 v0, v0, -0xa

    move v2, v5

    new-array v5, v0, [B

    const/16 p1, 0x9

    invoke-static {v8, p1, v5, v7, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$UpdateFileParam;

    invoke-direct/range {v0 .. v6}, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$UpdateFileParam;-><init>(BSSS[BS)V

    move-object v1, v0

    goto :goto_0

    :cond_4
    move p1, v1

    move v1, v2

    aget-byte v2, v8, v7

    aget-byte v6, v8, v6

    aget-byte v5, v8, v5

    invoke-static {v6, v5}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToShort(BB)S

    move-result v5

    aget-byte v4, v8, v4

    aget-byte v3, v8, v3

    invoke-static {v4, v3}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToShort(BB)S

    move-result v4

    aget-byte v3, v8, v9

    aget-byte v1, v8, v1

    invoke-static {v3, v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToShort(BB)S

    move-result v6

    sub-int/2addr v0, v10

    move v3, v5

    new-array v5, v0, [B

    invoke-static {v8, p1, v5, v7, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance v1, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$AddFileParam;

    invoke-direct/range {v1 .. v6}, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$AddFileParam;-><init>(BSS[BS)V

    goto :goto_0

    :cond_5
    move p1, v1

    move v1, v2

    move v2, v3

    aget-byte v3, v8, v7

    aget-byte v0, v8, v6

    aget-byte v5, v8, v5

    invoke-static {v0, v5}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToShort(BB)S

    move-result v0

    aget-byte v4, v8, v4

    aget-byte v2, v8, v2

    invoke-static {v4, v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToShort(BB)S

    move-result v5

    aget-byte v2, v8, v9

    aget-byte v1, v8, v1

    invoke-static {v2, v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToShort(BB)S

    move-result v6

    new-instance v2, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$ReadFileParam;

    aget-byte v7, v8, p1

    move v4, v0

    invoke-direct/range {v2 .. v7}, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$ReadFileParam;-><init>(BSSSB)V

    move-object v1, v2

    goto :goto_0

    :cond_6
    new-instance v1, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryParam;

    aget-byte p1, v8, v7

    invoke-direct {v1, p1}, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryParam;-><init>(B)V

    :goto_0
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd;

    invoke-direct {p1, v1}, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$Param;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    return-object p1

    :cond_7
    move v2, v3

    invoke-static {}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getInstance()Lcom/jieli/jl_rcsp/tool/CommandHelper;

    move-result-object v3

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result v8

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v9

    invoke-virtual {v3, p1, v8, v9}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getCommand(Landroid/bluetooth/BluetoothDevice;II)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    const-string v3, "parseDataToCmd"

    if-nez p1, :cond_8

    iget-object p1, p0, Lcom/jieli/jl_rcsp/model/cmdHandler/SmallFileTransferCmdHandler;->TAG:Ljava/lang/String;

    const-string p2, "invalid small file transfer cmd response"

    invoke-static {p1, v3, p2}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_8
    check-cast p1, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result v0

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/cmdHandler/SmallFileTransferCmdHandler;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "small file transfer cmd  send fail, status = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, v3, p2}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance p2, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$Response;

    invoke-direct {p2}, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$Response;-><init>()V

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1

    :cond_9
    aget-byte p2, v1, v7

    array-length v0, v1

    sub-int/2addr v0, v6

    new-array v3, v0, [B

    invoke-static {v1, v6, v3, v7, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    if-eqz p2, :cond_d

    if-eq p2, v6, :cond_c

    if-eq p2, v5, :cond_b

    if-eq p2, v4, :cond_a

    if-eq p2, v2, :cond_a

    new-instance p2, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$Response;

    invoke-direct {p2}, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$Response;-><init>()V

    goto :goto_1

    :cond_a
    new-instance p2, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$ResultResponse;

    aget-byte v0, v3, v7

    invoke-direct {p2, v0}, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$ResultResponse;-><init>(B)V

    goto :goto_1

    :cond_b
    new-instance p2, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$AddFileResponse;

    invoke-direct {p2, v3}, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$AddFileResponse;-><init>([B)V

    goto :goto_1

    :cond_c
    new-instance p2, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$ReadFileResponse;

    invoke-direct {p2, v3}, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$ReadFileResponse;-><init>([B)V

    goto :goto_1

    :cond_d
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getParam()Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    move-result-object p2

    check-cast p2, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryParam;

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryResponse;

    iget-object p2, p2, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$Param;->data:[B

    aget-byte p2, p2, v7

    invoke-direct {v0, p2, v3}, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryResponse;-><init>(B[B)V

    move-object p2, v0

    :goto_1
    invoke-virtual {p2, v3}, Lcom/jieli/jl_rcsp/model/base/BaseResponse;->setRawData([B)V

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1
.end method
