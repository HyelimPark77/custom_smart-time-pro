.class public Lcom/jieli/jl_rcsp/model/cmdHandler/GetDevMD5CmdHandler;
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
    .locals 4

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result v1

    const/16 v2, 0xd4

    if-eq v1, v2, :cond_1

    return-object v0

    :cond_1
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getParamData()[B

    move-result-object v0

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getType()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_2

    new-instance p1, Lcom/jieli/jl_rcsp/model/command/status/GetDevMD5Cmd;

    invoke-direct {p1}, Lcom/jieli/jl_rcsp/model/command/status/GetDevMD5Cmd;-><init>()V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-static {}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getInstance()Lcom/jieli/jl_rcsp/tool/CommandHelper;

    move-result-object v1

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result v2

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v3

    invoke-virtual {v1, p1, v2, v3}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getCommand(Landroid/bluetooth/BluetoothDevice;II)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    if-eqz v0, :cond_3

    array-length v1, v0

    const/16 v2, 0x20

    if-lt v1, v2, :cond_3

    :try_start_0
    new-instance v1, Ljava/lang/String;

    const/4 v3, 0x0

    invoke-direct {v1, v0, v3, v2}, Ljava/lang/String;-><init>([BII)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_3
    const-string v1, ""

    :goto_0
    new-instance v2, Lcom/jieli/jl_rcsp/model/response/GetDevMD5Response;

    invoke-direct {v2, v1}, Lcom/jieli/jl_rcsp/model/response/GetDevMD5Response;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Lcom/jieli/jl_rcsp/model/base/BaseResponse;->setRawData([B)V

    if-eqz p1, :cond_4

    check-cast p1, Lcom/jieli/jl_rcsp/model/command/status/GetDevMD5Cmd;

    invoke-virtual {p1, v2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    return-object p1

    :cond_4
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/status/GetDevMD5Cmd;

    invoke-direct {p1}, Lcom/jieli/jl_rcsp/model/command/status/GetDevMD5Cmd;-><init>()V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    return-object p1
.end method
