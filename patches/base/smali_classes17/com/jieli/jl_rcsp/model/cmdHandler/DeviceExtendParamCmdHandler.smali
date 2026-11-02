.class public Lcom/jieli/jl_rcsp/model/cmdHandler/DeviceExtendParamCmdHandler;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/cmd/ICmdHandler;


# instance fields
.field private final tag:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/cmdHandler/DeviceExtendParamCmdHandler;->tag:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public parseDataToCmd(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BasePacket;)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 5

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getParamData()[B

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_7

    array-length v2, v0

    const/4 v3, 0x1

    if-ge v2, v3, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getType()I

    move-result v2

    const/4 v4, 0x0

    if-ne v2, v3, :cond_4

    aget-byte p1, v0, v4

    if-eqz p1, :cond_3

    if-eq p1, v3, :cond_2

    const/4 p2, 0x2

    if-eq p1, p2, :cond_1

    goto :goto_0

    :cond_1
    new-instance v1, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd$ReadFileParam;

    invoke-direct {v1, v0}, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd$ReadFileParam;-><init>([B)V

    goto :goto_0

    :cond_2
    new-instance v1, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd$DeleteFileParam;

    invoke-direct {v1, v0}, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd$DeleteFileParam;-><init>([B)V

    goto :goto_0

    :cond_3
    new-instance v1, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd$FileTransferParam;

    invoke-direct {v1, v0}, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd$FileTransferParam;-><init>([B)V

    :goto_0
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd;

    invoke-direct {p1, v1}, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd$Param;)V

    return-object p1

    :cond_4
    invoke-static {}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getInstance()Lcom/jieli/jl_rcsp/tool/CommandHelper;

    move-result-object v1

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result v2

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v3

    invoke-virtual {v1, p1, v2, v3}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getCommand(Landroid/bluetooth/BluetoothDevice;II)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    if-eqz p1, :cond_5

    check-cast p1, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd;

    goto :goto_1

    :cond_5
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd$Param;

    aget-byte v2, v0, v4

    invoke-direct {v1, v2}, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd$Param;-><init>(B)V

    invoke-direct {p1, v1}, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd$Param;)V

    :goto_1
    aget-byte v1, v0, v4

    if-nez v1, :cond_6

    new-instance v1, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd$FileTransferResponse;

    invoke-direct {v1, v0}, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd$FileTransferResponse;-><init>([B)V

    goto :goto_2

    :cond_6
    new-instance v2, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd$Response;

    invoke-direct {v2, v1}, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd$Response;-><init>(B)V

    move-object v1, v2

    :goto_2
    invoke-virtual {v1, v0}, Lcom/jieli/jl_rcsp/model/base/BaseResponse;->setRawData([B)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1

    :cond_7
    :goto_3
    iget-object p1, p0, Lcom/jieli/jl_rcsp/model/cmdHandler/DeviceExtendParamCmdHandler;->tag:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u5f02\u5e38\uff1a\u6570\u636e\u5305\u5185\u5bb9\u4e3a\u7a7a\uff0ccmd id = "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    const-string v2, "%02x"

    invoke-static {v2, p2}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "parseDataToCmd"

    invoke-static {p1, v0, p2}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method
