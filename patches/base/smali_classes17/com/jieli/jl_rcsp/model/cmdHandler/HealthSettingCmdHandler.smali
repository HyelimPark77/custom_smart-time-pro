.class public Lcom/jieli/jl_rcsp/model/cmdHandler/HealthSettingCmdHandler;
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

    const/16 v2, 0xa5

    if-eq v1, v2, :cond_1

    return-object v0

    :cond_1
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getHasResponse()I

    move-result v1

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-ne v1, v3, :cond_2

    move v1, v2

    goto :goto_0

    :cond_2
    move v1, v3

    :goto_0
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getParamData()[B

    move-result-object v4

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getType()I

    move-result v5

    if-ne v5, v3, :cond_b

    if-eqz v4, :cond_a

    array-length p1, v4

    if-nez p1, :cond_3

    goto :goto_2

    :cond_3
    const/4 p1, 0x0

    aget-byte v5, v4, p1

    if-eqz v5, :cond_8

    if-eq v5, v3, :cond_6

    if-eq v5, v2, :cond_4

    goto :goto_1

    :cond_4
    array-length v0, v4

    sub-int/2addr v0, v3

    new-array v2, v0, [B

    if-lez v0, :cond_5

    invoke-static {v4, v3, v2, p1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_5
    new-instance v0, Lcom/jieli/jl_rcsp/model/command/watch/HealthSettingCmd$UpdateParam;

    invoke-static {v2}, Lcom/jieli/jl_rcsp/tool/datahandles/ParseHelper;->coverParamDataToAttrBeans([B)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/jieli/jl_rcsp/model/command/watch/HealthSettingCmd$UpdateParam;-><init>(Ljava/util/List;)V

    goto :goto_1

    :cond_6
    array-length v0, v4

    sub-int/2addr v0, v3

    new-array v2, v0, [B

    if-lez v0, :cond_7

    invoke-static {v4, v3, v2, p1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_7
    new-instance v0, Lcom/jieli/jl_rcsp/model/command/watch/HealthSettingCmd$SetParam;

    invoke-static {v2}, Lcom/jieli/jl_rcsp/tool/datahandles/ParseHelper;->coverParamDataToAttrBeans([B)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/jieli/jl_rcsp/model/command/watch/HealthSettingCmd$SetParam;-><init>(Ljava/util/List;)V

    goto :goto_1

    :cond_8
    array-length p1, v4

    const/4 v2, 0x5

    if-ge p1, v2, :cond_9

    return-object v0

    :cond_9
    new-instance v0, Lcom/jieli/jl_rcsp/model/command/watch/HealthSettingCmd$GetParam;

    const/4 p1, 0x4

    invoke-static {v4, v3, p1}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result p1

    invoke-direct {v0, p1}, Lcom/jieli/jl_rcsp/model/command/watch/HealthSettingCmd$GetParam;-><init>(I)V

    :goto_1
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/watch/HealthSettingCmd;

    invoke-direct {p1, v1, v0}, Lcom/jieli/jl_rcsp/model/command/watch/HealthSettingCmd;-><init>(ILcom/jieli/jl_rcsp/model/command/watch/HealthSettingCmd$Param;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    return-object p1

    :cond_a
    :goto_2
    return-object v0

    :cond_b
    invoke-static {}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getInstance()Lcom/jieli/jl_rcsp/tool/CommandHelper;

    move-result-object v1

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result v2

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v3

    invoke-virtual {v1, p1, v2, v3}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getCommand(Landroid/bluetooth/BluetoothDevice;II)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    const-string v1, "parseDataToCmd"

    const-string v2, "HealthSettingCmdHandler"

    if-nez p1, :cond_c

    const-string p1, "invalid health setting cmd response"

    invoke-static {v2, v1, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_c
    check-cast p1, Lcom/jieli/jl_rcsp/model/command/watch/HealthSettingCmd;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result v0

    if-eqz v0, :cond_d

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "health setting cmd send fail ,status = "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v2, v1, p2}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance p2, Lcom/jieli/jl_rcsp/model/command/watch/HealthSettingCmd$Response;

    invoke-direct {p2}, Lcom/jieli/jl_rcsp/model/command/watch/HealthSettingCmd$Response;-><init>()V

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1

    :cond_d
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getParam()Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    move-result-object p2

    instance-of p2, p2, Lcom/jieli/jl_rcsp/model/command/watch/HealthSettingCmd$GetParam;

    if-eqz p2, :cond_e

    new-instance p2, Lcom/jieli/jl_rcsp/model/command/watch/HealthSettingCmd$GetResponse;

    invoke-static {v4}, Lcom/jieli/jl_rcsp/tool/datahandles/ParseHelper;->coverParamDataToAttrBeans([B)Ljava/util/List;

    move-result-object v0

    invoke-direct {p2, v0}, Lcom/jieli/jl_rcsp/model/command/watch/HealthSettingCmd$GetResponse;-><init>(Ljava/util/List;)V

    goto :goto_3

    :cond_e
    new-instance p2, Lcom/jieli/jl_rcsp/model/command/watch/HealthSettingCmd$Response;

    invoke-direct {p2}, Lcom/jieli/jl_rcsp/model/command/watch/HealthSettingCmd$Response;-><init>()V

    :goto_3
    invoke-virtual {p2, v4}, Lcom/jieli/jl_rcsp/model/base/BaseResponse;->setRawData([B)V

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1
.end method
