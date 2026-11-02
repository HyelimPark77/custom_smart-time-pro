.class public Lcom/jieli/jl_rcsp/model/cmdHandler/SysInfoCmdHandler;
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
    .locals 10

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result v1

    const/16 v2, 0x9

    const/16 v3, 0x8

    const/4 v4, 0x7

    if-eq v1, v4, :cond_1

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_b

    :cond_1
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getParamData()[B

    move-result-object v5

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getType()I

    move-result v6

    const/4 v7, -0x1

    const/4 v8, 0x1

    if-ne v6, v8, :cond_a

    const/4 p1, 0x0

    if-eq v1, v4, :cond_8

    if-eq v1, v3, :cond_5

    if-eq v1, v2, :cond_2

    goto/16 :goto_1

    :cond_2
    new-array v0, p1, [B

    if-eqz v5, :cond_4

    array-length v1, v5

    if-lez v1, :cond_4

    aget-byte v7, v5, p1

    array-length v0, v5

    sub-int/2addr v0, v8

    new-array v1, v0, [B

    if-lez v0, :cond_3

    invoke-static {v5, v8, v1, p1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_3
    move-object v0, v1

    :cond_4
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/sys/UpdateSysInfoCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/UpdateSysInfoParam;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/tool/datahandles/ParseHelper;->coverParamDataToAttrBeans([B)Ljava/util/List;

    move-result-object v0

    invoke-direct {v1, v7, v0}, Lcom/jieli/jl_rcsp/model/parameter/UpdateSysInfoParam;-><init>(BLjava/util/List;)V

    invoke-direct {p1, v1}, Lcom/jieli/jl_rcsp/model/command/sys/UpdateSysInfoCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/UpdateSysInfoParam;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    return-object p1

    :cond_5
    new-array v0, p1, [B

    if-eqz v5, :cond_7

    array-length v1, v5

    if-lez v1, :cond_7

    aget-byte v7, v5, p1

    array-length v0, v5

    sub-int/2addr v0, v8

    new-array v1, v0, [B

    if-lez v0, :cond_6

    invoke-static {v5, v8, v1, p1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_6
    move-object v0, v1

    :cond_7
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/sys/SetSysInfoCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/SetSysInfoParam;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/tool/datahandles/ParseHelper;->coverParamDataToAttrBeans([B)Ljava/util/List;

    move-result-object v0

    invoke-direct {v1, v7, v0}, Lcom/jieli/jl_rcsp/model/parameter/SetSysInfoParam;-><init>(BLjava/util/List;)V

    invoke-direct {p1, v1}, Lcom/jieli/jl_rcsp/model/command/sys/SetSysInfoCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/SetSysInfoParam;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    return-object p1

    :cond_8
    if-eqz v5, :cond_9

    array-length v0, v5

    const/4 v1, 0x5

    if-lt v0, v1, :cond_9

    aget-byte v0, v5, p1

    const/4 v1, 0x4

    new-array v2, v1, [B

    invoke-static {v5, v8, v2, p1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([B)I

    move-result p1

    move v9, v0

    move v0, p1

    move p1, v9

    goto :goto_0

    :cond_9
    move v0, p1

    :goto_0
    new-instance v1, Lcom/jieli/jl_rcsp/model/command/sys/GetSysInfoCmd;

    new-instance v2, Lcom/jieli/jl_rcsp/model/parameter/GetSysInfoParam;

    invoke-direct {v2, p1, v0}, Lcom/jieli/jl_rcsp/model/parameter/GetSysInfoParam;-><init>(BI)V

    invoke-direct {v1, v2}, Lcom/jieli/jl_rcsp/model/command/sys/GetSysInfoCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/GetSysInfoParam;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p1

    invoke-virtual {v1, p1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    return-object p1

    :cond_a
    invoke-static {}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getInstance()Lcom/jieli/jl_rcsp/tool/CommandHelper;

    move-result-object v2

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v6

    invoke-virtual {v2, p1, v1, v6}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getCommand(Landroid/bluetooth/BluetoothDevice;II)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    if-eq v1, v4, :cond_e

    if-eq v1, v3, :cond_c

    :cond_b
    :goto_1
    return-object v0

    :cond_c
    new-instance v0, Lcom/jieli/jl_rcsp/model/base/CommonResponse;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/base/CommonResponse;-><init>()V

    invoke-virtual {v0, v5}, Lcom/jieli/jl_rcsp/model/base/BaseResponse;->setRawData([B)V

    if-eqz p1, :cond_d

    check-cast p1, Lcom/jieli/jl_rcsp/model/command/sys/SetSysInfoCmd;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1

    :cond_d
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/sys/SetSysInfoCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/SetSysInfoParam;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {v1, v7, v2}, Lcom/jieli/jl_rcsp/model/parameter/SetSysInfoParam;-><init>(BLjava/util/List;)V

    invoke-direct {p1, v1}, Lcom/jieli/jl_rcsp/model/command/sys/SetSysInfoCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/SetSysInfoParam;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1

    :cond_e
    new-instance v0, Lcom/jieli/jl_rcsp/model/response/SysInfoResponse;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/response/SysInfoResponse;-><init>()V

    invoke-virtual {v0, v5}, Lcom/jieli/jl_rcsp/model/base/BaseResponse;->setRawData([B)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result v1

    if-nez v1, :cond_f

    invoke-static {v0, p2}, Lcom/jieli/jl_rcsp/tool/datahandles/ParseHelper;->parseSysInfo(Lcom/jieli/jl_rcsp/model/response/SysInfoResponse;Lcom/jieli/jl_rcsp/model/base/BasePacket;)V

    :cond_f
    if-eqz p1, :cond_10

    check-cast p1, Lcom/jieli/jl_rcsp/model/command/sys/GetSysInfoCmd;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1

    :cond_10
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/sys/GetSysInfoCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/GetSysInfoParam;

    const/16 v2, 0xff

    invoke-direct {v1, v7, v2}, Lcom/jieli/jl_rcsp/model/parameter/GetSysInfoParam;-><init>(BI)V

    invoke-direct {p1, v1}, Lcom/jieli/jl_rcsp/model/command/sys/GetSysInfoCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/GetSysInfoParam;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1
.end method
