.class public Lcom/jieli/jl_rcsp/model/cmdHandler/SportsInfoStatusCmdHandler;
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

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/cmdHandler/SportsInfoStatusCmdHandler;->tag:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public parseDataToCmd(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BasePacket;)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 7

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result v1

    const/16 v2, 0xa6

    if-eq v1, v2, :cond_1

    return-object v0

    :cond_1
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getParamData()[B

    move-result-object v1

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getHasResponse()I

    move-result v2

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-ne v2, v4, :cond_2

    move v2, v3

    goto :goto_0

    :cond_2
    move v2, v4

    :goto_0
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getType()I

    move-result v5

    const-string v6, "parseDataToCmd"

    if-ne v5, v4, :cond_3

    :try_start_0
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Param;

    invoke-direct {p1, v1}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Param;-><init>([B)V

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Param;->getOp()B

    move-result v3

    packed-switch v3, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$SetReadRealDataIntervalParam;

    invoke-direct {p1, v1}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$SetReadRealDataIntervalParam;-><init>([B)V

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :pswitch_1
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadRealDataParam;

    invoke-direct {p1, v1}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadRealDataParam;-><init>([B)V

    goto :goto_1

    :pswitch_2
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ResumeSportsParam;

    invoke-direct {p1, v1}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ResumeSportsParam;-><init>([B)V

    goto :goto_1

    :pswitch_3
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$PauseSportsParam;

    invoke-direct {p1, v1}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$PauseSportsParam;-><init>([B)V

    goto :goto_1

    :pswitch_4
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$FirmwareStopSportsParam;

    invoke-direct {p1, v1}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$FirmwareStopSportsParam;-><init>([B)V

    goto :goto_1

    :pswitch_5
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$AppStopSportsParam;

    invoke-direct {p1, v1}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$AppStopSportsParam;-><init>([B)V

    goto :goto_1

    :pswitch_6
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$StartSportsParam;

    invoke-direct {p1, v1}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$StartSportsParam;-><init>([B)V

    goto :goto_1

    :pswitch_7
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadSportsInfoParam;

    invoke-direct {p1, v1}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadSportsInfoParam;-><init>([B)V

    :goto_1
    new-instance v1, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd;

    invoke-direct {v1, v2, p1}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd;-><init>(ILcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Param;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p1

    invoke-virtual {v1, p1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    :try_end_0
    .catch Lcom/jieli/jl_rcsp/exception/ParseDataException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :goto_2
    iget-object p2, p0, Lcom/jieli/jl_rcsp/model/cmdHandler/SportsInfoStatusCmdHandler;->tag:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "command ParseDataException : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, v6, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_3
    invoke-static {}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getInstance()Lcom/jieli/jl_rcsp/tool/CommandHelper;

    move-result-object v2

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result v4

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v5

    invoke-virtual {v2, p1, v4, v5}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getCommand(Landroid/bluetooth/BluetoothDevice;II)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    if-nez p1, :cond_4

    iget-object p1, p0, Lcom/jieli/jl_rcsp/model/cmdHandler/SportsInfoStatusCmdHandler;->tag:Ljava/lang/String;

    const-string p2, "invalid sports info status sync cmd response"

    invoke-static {p1, v6, p2}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_4
    :try_start_1
    new-instance v2, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Response;

    invoke-direct {v2, v1}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Response;-><init>([B)V

    invoke-virtual {v2}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Response;->getOp()I

    move-result v4

    if-eqz v4, :cond_7

    if-eq v4, v3, :cond_6

    const/4 v3, 0x6

    if-eq v4, v3, :cond_5

    goto :goto_3

    :cond_5
    new-instance v2, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadRealDataResponse;

    invoke-direct {v2, v1}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadRealDataResponse;-><init>([B)V

    goto :goto_3

    :catch_1
    move-exception p1

    goto :goto_4

    :cond_6
    new-instance v2, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$AppStopSportsResponse;

    invoke-direct {v2, v1}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$AppStopSportsResponse;-><init>([B)V

    goto :goto_3

    :cond_7
    new-instance v2, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadSportsInfoResponse;

    invoke-direct {v2, v1}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadSportsInfoResponse;-><init>([B)V

    :goto_3
    check-cast p1, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V
    :try_end_1
    .catch Lcom/jieli/jl_rcsp/exception/ParseDataException; {:try_start_1 .. :try_end_1} :catch_1

    return-object p1

    :goto_4
    iget-object p2, p0, Lcom/jieli/jl_rcsp/model/cmdHandler/SportsInfoStatusCmdHandler;->tag:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "response ParseDataException : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, v6, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
