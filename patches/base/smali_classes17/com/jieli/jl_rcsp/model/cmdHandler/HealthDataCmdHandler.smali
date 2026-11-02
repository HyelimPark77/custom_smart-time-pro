.class public Lcom/jieli/jl_rcsp/model/cmdHandler/HealthDataCmdHandler;
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

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/cmdHandler/HealthDataCmdHandler;->tag:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public parseDataToCmd(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BasePacket;)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 12

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result v1

    const/16 v2, 0xa3

    const/16 v3, 0xa2

    const/16 v4, 0xa1

    const/16 v5, 0xa0

    if-eq v1, v5, :cond_1

    if-eq v1, v4, :cond_1

    if-eq v1, v3, :cond_1

    if-eq v1, v2, :cond_1

    return-object v0

    :cond_1
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getParamData()[B

    move-result-object v6

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getType()I

    move-result v7

    const-string v8, "parseDataToCmd"

    const-string v9, ", "

    const/4 v10, 0x2

    const/4 v11, 0x1

    if-ne v7, v11, :cond_6

    if-eq v1, v5, :cond_4

    if-eq v1, v3, :cond_3

    if-eq v1, v2, :cond_2

    goto/16 :goto_6

    :cond_2
    :try_start_0
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/watch/SensorLogCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/command/watch/SensorLogCmd$Param;

    invoke-direct {v1, v6}, Lcom/jieli/jl_rcsp/model/command/watch/SensorLogCmd$Param;-><init>([B)V

    invoke-direct {p1, v1}, Lcom/jieli/jl_rcsp/model/command/watch/SensorLogCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/watch/SensorLogCmd$Param;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_3
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/watch/ReceiveHealthDataCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/command/watch/ReceiveHealthDataCmd$Param;

    invoke-direct {v1, v6}, Lcom/jieli/jl_rcsp/model/command/watch/ReceiveHealthDataCmd$Param;-><init>([B)V

    invoke-direct {p1, v1}, Lcom/jieli/jl_rcsp/model/command/watch/ReceiveHealthDataCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/watch/ReceiveHealthDataCmd$Param;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getHasResponse()I

    move-result p1

    if-ne p1, v11, :cond_5

    goto :goto_0

    :cond_5
    move v10, v11

    :goto_0
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd$Param;

    invoke-direct {v1, v6}, Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd$Param;-><init>([B)V

    invoke-direct {p1, v10, v1}, Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd;-><init>(ILcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd$Param;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1
    :try_end_0
    .catch Lcom/jieli/jl_rcsp/exception/ParseDataException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :goto_1
    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/cmdHandler/HealthDataCmdHandler;->tag:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "command. op code : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result p2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, v8, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_6

    :cond_6
    invoke-static {}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getInstance()Lcom/jieli/jl_rcsp/tool/CommandHelper;

    move-result-object v2

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result v3

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v7

    invoke-virtual {v2, p1, v3, v7}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getCommand(Landroid/bluetooth/BluetoothDevice;II)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    if-eq v1, v5, :cond_9

    if-eq v1, v4, :cond_7

    goto/16 :goto_6

    :cond_7
    if-eqz p1, :cond_8

    :try_start_1
    check-cast p1, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd;

    goto :goto_2

    :catch_1
    move-exception p1

    goto :goto_5

    :cond_8
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Param;

    invoke-direct {v1, v0}, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Param;-><init>(Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$BaseInfo;)V

    invoke-direct {p1, v1}, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Param;)V

    :goto_2
    new-instance v1, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Response;

    invoke-direct {v1, v6}, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Response;-><init>([B)V

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    return-object p1

    :cond_9
    if-eqz p1, :cond_a

    check-cast p1, Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd;

    goto :goto_4

    :cond_a
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getHasResponse()I

    move-result p1

    if-ne p1, v11, :cond_b

    goto :goto_3

    :cond_b
    move v10, v11

    :goto_3
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd$Param;

    invoke-direct {v1, v0}, Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd$Param;-><init>([B)V

    invoke-direct {p1, v10, v1}, Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd;-><init>(ILcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd$Param;)V

    :goto_4
    new-instance v1, Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd$Response;

    invoke-direct {v1, v6}, Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd$Response;-><init>([B)V

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    :try_end_1
    .catch Lcom/jieli/jl_rcsp/exception/ParseDataException; {:try_start_1 .. :try_end_1} :catch_1

    return-object p1

    :goto_5
    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/cmdHandler/HealthDataCmdHandler;->tag:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "response. op code : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result p2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, v8, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_6
    return-object v0
.end method
