.class public Lcom/jieli/jl_rcsp/model/cmdHandler/FileBrowseCmdHandler;
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
    .locals 13

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result v1

    const/16 v2, 0xf2

    const/16 v3, 0x22

    const/16 v4, 0x23

    const/16 v5, 0x1f

    const/16 v6, 0xd

    const/16 v7, 0xc

    if-eq v1, v7, :cond_1

    if-eq v1, v6, :cond_1

    if-eq v1, v5, :cond_1

    if-eq v1, v4, :cond_1

    if-eq v1, v3, :cond_1

    if-eq v1, v2, :cond_1

    return-object v0

    :cond_1
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getParamData()[B

    move-result-object v8

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getType()I

    move-result v9

    const/4 v10, -0x1

    const/4 v11, 0x1

    const/4 v12, 0x0

    if-ne v9, v11, :cond_7

    if-eq v1, v7, :cond_5

    if-eq v1, v6, :cond_3

    if-eq v1, v2, :cond_2

    goto :goto_0

    :cond_2
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/file_op/NotifyFileStructureChangeCmd;

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/file_op/NotifyFileStructureChangeCmd$Param;

    invoke-direct {v0, v8}, Lcom/jieli/jl_rcsp/model/command/file_op/NotifyFileStructureChangeCmd$Param;-><init>([B)V

    invoke-direct {p1, v0}, Lcom/jieli/jl_rcsp/model/command/file_op/NotifyFileStructureChangeCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/file_op/NotifyFileStructureChangeCmd$Param;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    return-object p1

    :cond_3
    if-eqz v8, :cond_4

    array-length p1, v8

    if-lez p1, :cond_4

    aget-byte v10, v8, v12

    :cond_4
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/file_op/StopFileBrowseCmd;

    new-instance v0, Lcom/jieli/jl_rcsp/model/parameter/StopFileBrowseParam;

    invoke-direct {v0, v10}, Lcom/jieli/jl_rcsp/model/parameter/StopFileBrowseParam;-><init>(B)V

    invoke-direct {p1, v0}, Lcom/jieli/jl_rcsp/model/command/file_op/StopFileBrowseCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/StopFileBrowseParam;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    return-object p1

    :cond_5
    new-instance p1, Lcom/jieli/jl_filebrowse/bean/PathData;

    invoke-direct {p1}, Lcom/jieli/jl_filebrowse/bean/PathData;-><init>()V

    if-eqz v8, :cond_6

    array-length v0, v8

    if-lez v0, :cond_6

    invoke-virtual {p1, v8}, Lcom/jieli/jl_filebrowse/bean/PathData;->parse([B)I

    :cond_6
    new-instance v0, Lcom/jieli/jl_rcsp/model/command/file_op/StartFileBrowseCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/StartFileBrowseParam;

    invoke-direct {v1, p1}, Lcom/jieli/jl_rcsp/model/parameter/StartFileBrowseParam;-><init>(Lcom/jieli/jl_filebrowse/bean/PathData;)V

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/command/file_op/StartFileBrowseCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/StartFileBrowseParam;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    return-object p1

    :cond_7
    invoke-static {}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getInstance()Lcom/jieli/jl_rcsp/tool/CommandHelper;

    move-result-object v2

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v9

    invoke-virtual {v2, p1, v1, v9}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getCommand(Landroid/bluetooth/BluetoothDevice;II)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    if-eq v1, v7, :cond_10

    if-eq v1, v6, :cond_e

    if-eq v1, v5, :cond_c

    if-eq v1, v3, :cond_a

    if-eq v1, v4, :cond_8

    :goto_0
    return-object v0

    :cond_8
    if-eqz p1, :cond_9

    check-cast p1, Lcom/jieli/jl_rcsp/model/command/file_op/DeleteFileByNameCmd;

    goto :goto_1

    :cond_9
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/file_op/DeleteFileByNameCmd;

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/file_op/DeleteFileByNameCmd$Param;

    const-string v1, ""

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/command/file_op/DeleteFileByNameCmd$Param;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0}, Lcom/jieli/jl_rcsp/model/command/file_op/DeleteFileByNameCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/file_op/DeleteFileByNameCmd$Param;)V

    :goto_1
    new-instance v0, Lcom/jieli/jl_rcsp/model/command/file_op/DeleteFileByNameCmd$Response;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/command/file_op/DeleteFileByNameCmd$Response;-><init>()V

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    return-object p1

    :cond_a
    if-eqz p1, :cond_b

    check-cast p1, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceFormatCmd;

    goto :goto_2

    :cond_b
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceFormatCmd;

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceFormatCmd$Param;

    invoke-direct {v0, v12}, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceFormatCmd$Param;-><init>(I)V

    invoke-direct {p1, v0}, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceFormatCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/file_op/DeviceFormatCmd$Param;)V

    :goto_2
    new-instance v0, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceFormatCmd$Response;

    aget-byte v1, v8, v12

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceFormatCmd$Response;-><init>(I)V

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    return-object p1

    :cond_c
    if-eqz p1, :cond_d

    check-cast p1, Lcom/jieli/jl_rcsp/model/command/file_op/DelDevFileCmd;

    goto :goto_3

    :cond_d
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/file_op/DelDevFileCmd;

    new-instance v0, Lcom/jieli/jl_rcsp/model/parameter/DelDevFileParam;

    invoke-direct {v0, v12, v12, v12, v12}, Lcom/jieli/jl_rcsp/model/parameter/DelDevFileParam;-><init>(IBIZ)V

    invoke-direct {p1, v0}, Lcom/jieli/jl_rcsp/model/command/file_op/DelDevFileCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/DelDevFileParam;)V

    :goto_3
    new-instance v0, Lcom/jieli/jl_rcsp/model/response/DelDevFileResponse;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/response/DelDevFileResponse;-><init>()V

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    return-object p1

    :cond_e
    new-instance v0, Lcom/jieli/jl_rcsp/model/base/CommonResponse;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/base/CommonResponse;-><init>()V

    invoke-virtual {v0, v8}, Lcom/jieli/jl_rcsp/model/base/BaseResponse;->setRawData([B)V

    if-eqz p1, :cond_f

    check-cast p1, Lcom/jieli/jl_rcsp/model/command/file_op/StopFileBrowseCmd;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1

    :cond_f
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/file_op/StopFileBrowseCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/StopFileBrowseParam;

    invoke-direct {v1, v10}, Lcom/jieli/jl_rcsp/model/parameter/StopFileBrowseParam;-><init>(B)V

    invoke-direct {p1, v1}, Lcom/jieli/jl_rcsp/model/command/file_op/StopFileBrowseCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/StopFileBrowseParam;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1

    :cond_10
    new-instance v0, Lcom/jieli/jl_rcsp/model/response/StartFileBrowseResponse;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/response/StartFileBrowseResponse;-><init>()V

    invoke-virtual {v0, v8}, Lcom/jieli/jl_rcsp/model/base/BaseResponse;->setRawData([B)V

    if-eqz v8, :cond_14

    array-length v1, v8

    if-eq v1, v11, :cond_13

    const/4 v2, 0x2

    if-eq v1, v2, :cond_12

    const/4 v2, 0x4

    if-eq v1, v2, :cond_11

    goto :goto_4

    :cond_11
    invoke-static {v8}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([B)I

    move-result v12

    goto :goto_4

    :cond_12
    aget-byte v1, v8, v12

    aget-byte v2, v8, v11

    invoke-static {v1, v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt(BB)I

    move-result v12

    goto :goto_4

    :cond_13
    aget-byte v1, v8, v12

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v12

    :cond_14
    :goto_4
    invoke-virtual {v0, v12}, Lcom/jieli/jl_rcsp/model/response/StartFileBrowseResponse;->setTotalFile(I)Lcom/jieli/jl_rcsp/model/response/StartFileBrowseResponse;

    if-eqz p1, :cond_15

    check-cast p1, Lcom/jieli/jl_rcsp/model/command/file_op/StartFileBrowseCmd;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1

    :cond_15
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/file_op/StartFileBrowseCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/StartFileBrowseParam;

    new-instance v2, Lcom/jieli/jl_filebrowse/bean/PathData;

    invoke-direct {v2}, Lcom/jieli/jl_filebrowse/bean/PathData;-><init>()V

    invoke-direct {v1, v2}, Lcom/jieli/jl_rcsp/model/parameter/StartFileBrowseParam;-><init>(Lcom/jieli/jl_filebrowse/bean/PathData;)V

    invoke-direct {p1, v1}, Lcom/jieli/jl_rcsp/model/command/file_op/StartFileBrowseCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/StartFileBrowseParam;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1
.end method
