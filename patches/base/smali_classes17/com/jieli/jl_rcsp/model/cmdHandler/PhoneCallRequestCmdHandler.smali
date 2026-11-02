.class public Lcom/jieli/jl_rcsp/model/cmdHandler/PhoneCallRequestCmdHandler;
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

    const/16 v2, 0xa

    if-eq v1, v2, :cond_1

    return-object v0

    :cond_1
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getParamData()[B

    move-result-object v0

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getType()I

    move-result v1

    const-string v2, ""

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ne v1, v4, :cond_3

    if-eqz v0, :cond_2

    array-length p1, v0

    if-lez p1, :cond_2

    aget-byte p1, v0, v3

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v3

    array-length p1, v0

    if-le p1, v4, :cond_2

    new-instance v2, Ljava/lang/String;

    array-length p1, v0

    sub-int/2addr p1, v4

    invoke-direct {v2, v0, v4, p1}, Ljava/lang/String;-><init>([BII)V

    :cond_2
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/phone/PhoneCallRequestCmd;

    new-instance v0, Lcom/jieli/jl_rcsp/model/parameter/PhoneCallRequestParam;

    invoke-direct {v0, v2}, Lcom/jieli/jl_rcsp/model/parameter/PhoneCallRequestParam;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Lcom/jieli/jl_rcsp/model/parameter/PhoneCallRequestParam;->setType(I)Lcom/jieli/jl_rcsp/model/parameter/PhoneCallRequestParam;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/jieli/jl_rcsp/model/command/phone/PhoneCallRequestCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/PhoneCallRequestParam;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-static {}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getInstance()Lcom/jieli/jl_rcsp/tool/CommandHelper;

    move-result-object v1

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result v4

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v5

    invoke-virtual {v1, p1, v4, v5}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getCommand(Landroid/bluetooth/BluetoothDevice;II)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    new-instance v1, Lcom/jieli/jl_rcsp/model/base/CommonResponse;

    invoke-direct {v1}, Lcom/jieli/jl_rcsp/model/base/CommonResponse;-><init>()V

    invoke-virtual {v1, v0}, Lcom/jieli/jl_rcsp/model/base/BaseResponse;->setRawData([B)V

    if-eqz p1, :cond_4

    check-cast p1, Lcom/jieli/jl_rcsp/model/command/phone/PhoneCallRequestCmd;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1

    :cond_4
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/phone/PhoneCallRequestCmd;

    new-instance v0, Lcom/jieli/jl_rcsp/model/parameter/PhoneCallRequestParam;

    invoke-direct {v0, v2}, Lcom/jieli/jl_rcsp/model/parameter/PhoneCallRequestParam;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Lcom/jieli/jl_rcsp/model/parameter/PhoneCallRequestParam;->setType(I)Lcom/jieli/jl_rcsp/model/parameter/PhoneCallRequestParam;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/jieli/jl_rcsp/model/command/phone/PhoneCallRequestCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/PhoneCallRequestParam;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1
.end method
