.class public Lcom/jieli/jl_rcsp/model/cmdHandler/CustomCmdHandler;
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

    const/16 v2, 0xff

    if-eq v1, v2, :cond_1

    return-object v0

    :cond_1
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getParamData()[B

    move-result-object v0

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getHasResponse()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_2

    const/4 v1, 0x2

    goto :goto_0

    :cond_2
    move v1, v2

    :goto_0
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getType()I

    move-result v3

    const/4 v4, 0x0

    if-ne v3, v2, :cond_4

    new-array p1, v4, [B

    if-eqz v0, :cond_3

    array-length v2, v0

    if-lez v2, :cond_3

    goto :goto_1

    :cond_3
    move-object v0, p1

    :goto_1
    new-instance p1, Lcom/jieli/jl_rcsp/model/parameter/CustomParam;

    invoke-direct {p1, v0}, Lcom/jieli/jl_rcsp/model/parameter/CustomParam;-><init>([B)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getXmOpCode()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;->setXmOpCode(I)Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/custom/CustomCmd;

    invoke-direct {v0, v1, p1}, Lcom/jieli/jl_rcsp/model/command/custom/CustomCmd;-><init>(ILcom/jieli/jl_rcsp/model/parameter/CustomParam;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    return-object v0

    :cond_4
    invoke-static {}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getInstance()Lcom/jieli/jl_rcsp/tool/CommandHelper;

    move-result-object v2

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result v3

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v5

    invoke-virtual {v2, p1, v3, v5}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getCommand(Landroid/bluetooth/BluetoothDevice;II)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    new-instance v2, Lcom/jieli/jl_rcsp/model/response/CustomResponse;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/response/CustomResponse;-><init>()V

    new-instance v3, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getXmOpCode()I

    move-result v5

    invoke-virtual {v3, v5}, Ljava/io/ByteArrayOutputStream;->write(I)V

    :try_start_0
    invoke-virtual {v3, v0}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v5

    invoke-virtual {v5}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_2
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/jieli/jl_rcsp/model/base/BaseResponse;->setRawData([B)V

    invoke-virtual {v2, v0}, Lcom/jieli/jl_rcsp/model/response/CustomResponse;->setData([B)Lcom/jieli/jl_rcsp/model/response/CustomResponse;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getXmOpCode()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/jieli/jl_rcsp/model/base/CommonResponse;->setXmOpCode(I)V

    if-eqz p1, :cond_5

    check-cast p1, Lcom/jieli/jl_rcsp/model/command/custom/CustomCmd;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1

    :cond_5
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/custom/CustomCmd;

    new-instance v0, Lcom/jieli/jl_rcsp/model/parameter/CustomParam;

    new-array v3, v4, [B

    invoke-direct {v0, v3}, Lcom/jieli/jl_rcsp/model/parameter/CustomParam;-><init>([B)V

    invoke-direct {p1, v1, v0}, Lcom/jieli/jl_rcsp/model/command/custom/CustomCmd;-><init>(ILcom/jieli/jl_rcsp/model/parameter/CustomParam;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1
.end method
