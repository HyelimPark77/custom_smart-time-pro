.class public Lcom/jieli/jl_rcsp/model/cmdHandler/SpeechCmdHandler;
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

    const/4 v2, 0x5

    const/16 v3, 0xd2

    const/4 v4, 0x4

    if-eq v1, v3, :cond_1

    if-eq v1, v4, :cond_1

    if-ne v1, v2, :cond_d

    :cond_1
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getParamData()[B

    move-result-object v5

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getType()I

    move-result v6

    const/16 v7, 0x10

    const/4 v8, 0x2

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-ne v6, v10, :cond_c

    if-eq v1, v4, :cond_9

    if-eq v1, v2, :cond_3

    if-eq v1, v3, :cond_2

    goto/16 :goto_4

    :cond_2
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/speech/CancelSpeechCmd;

    invoke-direct {p1}, Lcom/jieli/jl_rcsp/model/command/speech/CancelSpeechCmd;-><init>()V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    return-object p1

    :cond_3
    if-eqz v5, :cond_8

    array-length p1, v5

    if-lez p1, :cond_8

    aget-byte p1, v5, v9

    array-length v0, v5

    if-le v0, v10, :cond_7

    aget-byte v0, v5, v10

    and-int/lit8 v1, v0, 0x1

    if-ne v1, v10, :cond_4

    move v1, v10

    goto :goto_0

    :cond_4
    move v1, v9

    :goto_0
    and-int/lit8 v2, v0, 0x2

    if-ne v2, v8, :cond_5

    move v2, v10

    goto :goto_1

    :cond_5
    move v2, v9

    :goto_1
    and-int/2addr v0, v4

    if-ne v0, v4, :cond_6

    move v9, v10

    :cond_6
    move v12, v9

    move v9, p1

    move p1, v12

    goto :goto_2

    :cond_7
    move v1, v9

    move v2, v1

    move v9, p1

    move p1, v2

    goto :goto_2

    :cond_8
    move p1, v9

    move v1, p1

    move v2, v1

    :goto_2
    new-instance v0, Lcom/jieli/jl_rcsp/model/command/speech/StopSpeechCmd;

    new-instance v3, Lcom/jieli/jl_rcsp/model/parameter/StopSpeechParam;

    invoke-direct {v3}, Lcom/jieli/jl_rcsp/model/parameter/StopSpeechParam;-><init>()V

    invoke-virtual {v3, v9}, Lcom/jieli/jl_rcsp/model/parameter/StopSpeechParam;->setReason(B)Lcom/jieli/jl_rcsp/model/parameter/StopSpeechParam;

    move-result-object v3

    invoke-virtual {v3, v1}, Lcom/jieli/jl_rcsp/model/parameter/StopSpeechParam;->setSyncIatText(Z)Lcom/jieli/jl_rcsp/model/parameter/StopSpeechParam;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/parameter/StopSpeechParam;->setSyncNlpText(Z)Lcom/jieli/jl_rcsp/model/parameter/StopSpeechParam;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/jieli/jl_rcsp/model/parameter/StopSpeechParam;->setPlayTTS(Z)Lcom/jieli/jl_rcsp/model/parameter/StopSpeechParam;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/jieli/jl_rcsp/model/command/speech/StopSpeechCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/StopSpeechParam;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    return-object p1

    :cond_9
    if-eqz v5, :cond_b

    array-length p1, v5

    if-lt p1, v8, :cond_b

    aget-byte p1, v5, v9

    aget-byte v7, v5, v10

    array-length v0, v5

    const/4 v1, 0x3

    if-lt v0, v1, :cond_a

    aget-byte v10, v5, v8

    :cond_a
    move v12, v10

    move v10, p1

    move p1, v12

    goto :goto_3

    :cond_b
    move p1, v10

    :goto_3
    new-instance v0, Lcom/jieli/jl_rcsp/model/command/speech/StartSpeechCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/StartSpeechParam;

    invoke-direct {v1, v10, v7, p1}, Lcom/jieli/jl_rcsp/model/parameter/StartSpeechParam;-><init>(BBB)V

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/command/speech/StartSpeechCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/StartSpeechParam;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    return-object p1

    :cond_c
    invoke-static {}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getInstance()Lcom/jieli/jl_rcsp/tool/CommandHelper;

    move-result-object v6

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v11

    invoke-virtual {v6, p1, v1, v11}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getCommand(Landroid/bluetooth/BluetoothDevice;II)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    if-eq v1, v4, :cond_16

    if-eq v1, v2, :cond_10

    if-eq v1, v3, :cond_e

    :cond_d
    :goto_4
    return-object v0

    :cond_e
    new-instance v0, Lcom/jieli/jl_rcsp/model/base/CommonResponse;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/base/CommonResponse;-><init>()V

    invoke-virtual {v0, v5}, Lcom/jieli/jl_rcsp/model/base/BaseResponse;->setRawData([B)V

    if-eqz p1, :cond_f

    check-cast p1, Lcom/jieli/jl_rcsp/model/command/speech/CancelSpeechCmd;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1

    :cond_f
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/speech/CancelSpeechCmd;

    invoke-direct {p1}, Lcom/jieli/jl_rcsp/model/command/speech/CancelSpeechCmd;-><init>()V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1

    :cond_10
    new-instance v0, Lcom/jieli/jl_rcsp/model/response/StopSpeechResponse;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/response/StopSpeechResponse;-><init>()V

    if-eqz v5, :cond_14

    array-length v1, v5

    if-lt v1, v10, :cond_14

    aget-byte v1, v5, v9

    and-int/lit8 v2, v1, 0x1

    if-ne v2, v10, :cond_11

    move v2, v10

    goto :goto_5

    :cond_11
    move v2, v9

    :goto_5
    and-int/lit8 v3, v1, 0x2

    if-ne v3, v8, :cond_12

    move v3, v10

    goto :goto_6

    :cond_12
    move v3, v9

    :goto_6
    and-int/2addr v1, v4

    if-ne v1, v4, :cond_13

    goto :goto_7

    :cond_13
    move v10, v9

    goto :goto_7

    :cond_14
    move v2, v9

    move v3, v2

    move v10, v3

    :goto_7
    invoke-virtual {v0, v5}, Lcom/jieli/jl_rcsp/model/base/BaseResponse;->setRawData([B)V

    invoke-virtual {v0, v2}, Lcom/jieli/jl_rcsp/model/response/StopSpeechResponse;->setSyncIatText(Z)Lcom/jieli/jl_rcsp/model/response/StopSpeechResponse;

    invoke-virtual {v0, v3}, Lcom/jieli/jl_rcsp/model/response/StopSpeechResponse;->setSyncNlpText(Z)Lcom/jieli/jl_rcsp/model/response/StopSpeechResponse;

    invoke-virtual {v0, v10}, Lcom/jieli/jl_rcsp/model/response/StopSpeechResponse;->setPlayTTS(Z)Lcom/jieli/jl_rcsp/model/response/StopSpeechResponse;

    if-eqz p1, :cond_15

    check-cast p1, Lcom/jieli/jl_rcsp/model/command/speech/StopSpeechCmd;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1

    :cond_15
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/speech/StopSpeechCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/StopSpeechParam;

    invoke-direct {v1}, Lcom/jieli/jl_rcsp/model/parameter/StopSpeechParam;-><init>()V

    invoke-virtual {v1, v9}, Lcom/jieli/jl_rcsp/model/parameter/StopSpeechParam;->setReason(B)Lcom/jieli/jl_rcsp/model/parameter/StopSpeechParam;

    move-result-object v1

    invoke-direct {p1, v1}, Lcom/jieli/jl_rcsp/model/command/speech/StopSpeechCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/StopSpeechParam;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1

    :cond_16
    new-instance v0, Lcom/jieli/jl_rcsp/model/response/StartSpeechResponse;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/response/StartSpeechResponse;-><init>()V

    invoke-virtual {v0, v5}, Lcom/jieli/jl_rcsp/model/base/BaseResponse;->setRawData([B)V

    if-eqz p1, :cond_17

    check-cast p1, Lcom/jieli/jl_rcsp/model/command/speech/StartSpeechCmd;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1

    :cond_17
    new-instance p1, Lcom/jieli/jl_rcsp/model/command/speech/StartSpeechCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/StartSpeechParam;

    invoke-direct {v1, v10, v7, v10}, Lcom/jieli/jl_rcsp/model/parameter/StartSpeechParam;-><init>(BBB)V

    invoke-direct {p1, v1}, Lcom/jieli/jl_rcsp/model/command/speech/StartSpeechCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/StartSpeechParam;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getStatus()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setResponse(Lcom/jieli/jl_rcsp/model/base/CommonResponse;)V

    return-object p1
.end method
